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
import org.telegram.messenger.FileLog;
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
public final class rh1 implements VoIPService.StateListener, NotificationCenter.NotificationCenterDelegate, uf.a {
    public static rh1 f42999n1;
    public AnimatorSet A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public TextView E;
    public boolean E0;
    public org.telegram.ui.Components.voip.q2 F;
    public float F0;
    public qh1 G;
    public boolean G0;
    public ImageView H;
    public boolean H0;
    public ImageView I;
    public boolean I0;
    public int J;
    public boolean J0;
    public jg.l K;
    public long K0;
    public int L;
    public vg.n1 M;
    public org.telegram.ui.Components.voip.i2 M0;
    public za1 N;
    public org.telegram.ui.Components.voip.e3 N0;
    public FrameLayout O;
    public org.telegram.ui.Components.voip.e3 O0;
    public org.telegram.ui.Components.voip.p0 P;
    public ValueAnimator P0;
    public org.telegram.ui.Components.voip.p1 Q;
    public fi.l5 R;
    public boolean R0;
    public TextView S;
    public ok T;
    public org.telegram.ui.Components.voip.k U;
    public boolean U0;
    public float V0;
    public float W0;
    public nh1 X;
    public float X0;
    public org.telegram.ui.Components.voip.v1 Y;
    public float Y0;
    public org.telegram.ui.Components.voip.v1 Z;
    public float Z0;
    public final int f43000a;
    public boolean f43001a0;
    public boolean f43002a1;
    public Activity f43003b;
    public TextureViewRenderer f43004b0;
    public float f43005b1;
    public final TLRPC.User f43006c;
    public org.telegram.ui.Components.voip.t2 f43007c0;
    public float f43008c1;
    public final TLRPC.User d;
    public org.telegram.ui.Components.voip.t2 f43009d0;
    public int f43010d1;
    public org.telegram.ui.Components.voip.l3 e;
    public org.telegram.ui.Components.voip.e f43011e0;
    public int f43012e1;
    public org.telegram.ui.Components.voip.l3 f43013f;
    public boolean f43014f0;
    public sf.d f43016g0;
    public boolean f43017g1;
    public org.telegram.ui.Components.voip.l3 h;
    public View f43018h0;
    public boolean f43019h1;
    public View f43020i0;
    public ValueAnimator f43021i1;
    public org.telegram.ui.Components.voip.s1 f43022j0;
    public boolean f43023j1;
    public org.telegram.ui.Components.voip.t2 f43025k1;
    public a8.fg l1;
    public boolean m0;
    public boolean f43027m1;
    public oh1 f43028n;
    public boolean f43029n0;
    public kh1 f43030o0;
    public int f43031p0;
    public int f43032q0;
    public WindowInsets f43034r0;
    public mh1 f43035s;
    public boolean f43036s0;
    public float f43037t0;
    public jh1 f43038u0;
    public org.telegram.ui.Components.voip.d3 v;
    public int f43039v0;
    public org.telegram.ui.Components.voip.a3 f43040w;
    public AccessibilityManager f43041w0;
    public org.telegram.ui.Components.voip.f3 f43042x;
    public org.telegram.ui.Components.voip.r0 f43044y;
    public boolean f43046z0;
    public final org.telegram.ui.Components.voip.r1 f43033r = new org.telegram.ui.Components.voip.r1();
    public final org.telegram.ui.Components.y9[] V = new org.telegram.ui.Components.y9[4];
    public final Drawable[] W = new Drawable[4];
    public final Paint f43024k0 = new Paint();
    public final Paint f43026l0 = new Paint();
    public boolean f43043x0 = true;
    public float f43045y0 = 1.0f;
    public final AnimationNotificationsLocker L0 = new AnimationNotificationsLocker();
    public final x11 Q0 = new x11(this, 17);
    public final ah1 S0 = new ah1(this, 12);
    public final ah1 T0 = new ah1(this, 13);
    public float f43015f1 = 1.0f;

    public rh1(int i10) {
        this.f43000a = i10;
        this.f43006c = MessagesController.getInstance(i10).getUser(Long.valueOf(UserConfig.getInstance(i10).getClientUserId()));
        VoIPServiceState sharedState = VoIPService.getSharedState();
        if (sharedState == null) {
            return;
        }
        this.d = sharedState.getUser();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().registerStateListener(this);
        }
        sharedState.isOutgoing();
        this.f43032q0 = -1;
        this.f43031p0 = sharedState.getCallState();
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
        NotificationCenter.getInstance(i10).addWeakObserver(this, NotificationCenter.voipServiceCreated);
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.closeInCallActivity);
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.nearEarEvent);
    }

    public static void i(rh1 rh1Var) {
        rh1 rh1Var2;
        if (rh1Var.f43017g1) {
            rh1Var.f43017g1 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            rh1Var.f43021i1 = ofFloat;
            rh1Var2 = rh1Var;
            ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.w(rh1Var2, rh1Var.f43015f1, rh1Var.Y0, rh1Var.Z0, 1));
            rh1Var2.f43021i1.addListener(new fh1(rh1Var2, 0));
            rh1Var2.f43021i1.setDuration(350L);
            rh1Var2.f43021i1.setInterpolator(org.telegram.ui.Components.ds.f27530f);
            rh1Var2.f43021i1.start();
        } else {
            rh1Var2 = rh1Var;
        }
        rh1Var2.f43019h1 = false;
        rh1Var2.f43002a1 = false;
    }

    public static void p(int i10, int[] iArr) {
        rh1 rh1Var = f42999n1;
        if (rh1Var != null) {
            if (i10 == 101) {
                if (VoIPService.getSharedState() == null) {
                    rh1Var.f43038u0.b();
                    return;
                } else if (iArr.length > 0 && iArr[0] == 0) {
                    rh1Var.q(new w90(10));
                } else if (!rh1Var.f43003b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                    if (VoIPService.getSharedState() != null) {
                        VoIPService.getSharedState().declineIncomingCall();
                    }
                    org.telegram.ui.Components.voip.g2.h(rh1Var.f43003b, new ah1(rh1Var, 2), i10);
                    return;
                }
            }
            if (i10 == 102) {
                if (VoIPService.getSharedState() == null) {
                    rh1Var.f43038u0.b();
                } else if (iArr.length > 0 && iArr[0] == 0) {
                    rh1Var.B();
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
        rh1 rh1Var = f42999n1;
        if (rh1Var != null && rh1Var.f43038u0.getParent() == null) {
            rh1 rh1Var2 = f42999n1;
            if (rh1Var2 != null) {
                rh1Var2.f43007c0.d.release();
                f42999n1.f43009d0.d.release();
                f42999n1.f43004b0.release();
                jh1 jh1Var = f42999n1.f43038u0;
                if (jh1Var != null) {
                    jh1Var.d();
                }
                f42999n1.k();
            }
            f42999n1 = null;
        }
        if (f42999n1 == null && !activity.isFinishing()) {
            if (org.telegram.ui.Components.voip.n2.k() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (VoIPService.getSharedState() != null && VoIPService.getSharedState().getUser() != null) {
                rh1 rh1Var3 = new rh1(i10);
                rh1Var3.f43003b = activity;
                f42999n1 = rh1Var3;
                jh1 jh1Var2 = new jh1(activity, !z10, rh1Var3);
                f42999n1.J0 = ((KeyguardManager) activity.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
                ((PowerManager) activity.getSystemService("power")).isInteractive();
                f42999n1.getClass();
                jh1Var2.setLockOnScreen(f42999n1.J0);
                rh1Var3.f43038u0 = jh1Var2;
                xg1 xg1Var = new xg1(rh1Var3, 4);
                WeakHashMap weakHashMap = r0.i0.f47143a;
                r0.a0.i(jh1Var2, xg1Var);
                ((WindowManager) activity.getSystemService("window")).addView(jh1Var2, org.telegram.ui.Components.voip.x2.a());
                rh1Var3.f43037t0 = ViewConfiguration.get(activity).getScaledTouchSlop();
                rh1Var3.f43041w0 = (AccessibilityManager) activity.getSystemService(AccessibilityManager.class);
                mh1 mh1Var = new mh1(rh1Var3, activity);
                mh1Var.setClipToPadding(false);
                mh1Var.setClipChildren(false);
                mh1Var.setBackgroundColor(-16777216);
                rh1Var3.F();
                rh1Var3.f43035s = mh1Var;
                VoIPServiceState sharedState = VoIPService.getSharedState();
                if (sharedState != null && sharedState.isConference()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.Components.voip.r1 r1Var = rh1Var3.f43033r;
                rh1Var3.v = new org.telegram.ui.Components.voip.d3(activity, z11, r1Var);
                org.telegram.ui.Components.voip.t2 t2Var = new org.telegram.ui.Components.voip.t2(activity, false, true, false, false);
                rh1Var3.f43007c0 = t2Var;
                RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
                t2Var.d.setScalingType(scalingType);
                rh1Var3.f43007c0.d.setEnableHardwareScaler(true);
                rh1Var3.f43007c0.d.setRotateTextureWithScreen(true);
                rh1Var3.f43007c0.f34218a0 = 1;
                mh1Var.addView(rh1Var3.v, org.telegram.ui.Components.kb1.g(-1.0f, -1));
                TLRPC.User user = rh1Var3.d;
                org.telegram.ui.Components.voip.a3 a3Var = new org.telegram.ui.Components.voip.a3(activity, user, r1Var);
                rh1Var3.f43040w = a3Var;
                mh1Var.addView(a3Var, org.telegram.ui.Components.kb1.g(-1.0f, -1));
                ?? view = new View(activity);
                if (LiteMode.isEnabled(512)) {
                    int i12 = org.telegram.ui.ActionBar.y6.f23293a;
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(System.currentTimeMillis());
                    int i13 = calendar.get(2);
                    int i14 = calendar.get(5);
                    calendar.get(12);
                    calendar.get(11);
                    if ((i13 == 11 && i14 >= 24 && i14 <= 31) || (i13 == 0 && i14 == 1)) {
                        view.f33908a = new org.telegram.ui.Components.hx0(0);
                    }
                }
                rh1Var3.f43042x = view;
                mh1Var.addView((View) view, org.telegram.ui.Components.kb1.g(220.0f, -1));
                mh1Var.addView(rh1Var3.f43007c0);
                GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                new org.telegram.ui.Components.x9(orientation, new int[]{-14994098, -14328963}).f(jg.s0.e0(0.5f, 1), new cc1(rh1Var3, 1), 0L);
                org.telegram.ui.Components.voip.v1 v1Var = new org.telegram.ui.Components.voip.v1(activity);
                rh1Var3.Y = v1Var;
                v1Var.setDelegate(new xg1(rh1Var3, 3));
                rh1Var3.Y.d(1.0f, 1.0f);
                rh1Var3.f43001a0 = true;
                org.telegram.ui.Components.voip.t2 t2Var2 = new org.telegram.ui.Components.voip.t2(activity, true, false);
                rh1Var3.f43009d0 = t2Var2;
                t2Var2.d.setIsCamera(true);
                rh1Var3.f43009d0.d.setUseCameraRotation(true);
                rh1Var3.Y.setOnTapListener(new ch1(rh1Var3, 1));
                rh1Var3.f43009d0.d.setMirror(true);
                rh1Var3.Y.addView(rh1Var3.f43009d0);
                org.telegram.ui.Components.voip.v1 v1Var2 = new org.telegram.ui.Components.voip.v1(activity);
                rh1Var3.Z = v1Var2;
                v1Var2.S = true;
                v1Var2.c(true, false);
                TextureViewRenderer textureViewRenderer = new TextureViewRenderer(activity);
                rh1Var3.f43004b0 = textureViewRenderer;
                textureViewRenderer.setEnableHardwareScaler(true);
                rh1Var3.f43004b0.setIsCamera(false);
                rh1Var3.f43004b0.setFpsReduction(30.0f);
                rh1Var3.f43004b0.setScalingType(scalingType);
                rh1Var3.Z.addView(rh1Var3.f43004b0, org.telegram.ui.Components.kb1.i(-1, -2, 17));
                rh1Var3.Z.setOnTapListener(new ch1(rh1Var3, 2));
                rh1Var3.Z.setVisibility(8);
                mh1Var.addView(rh1Var3.Y, org.telegram.ui.Components.kb1.g(-2.0f, -2));
                mh1Var.addView(rh1Var3.Z);
                View view2 = new View(activity);
                rh1Var3.f43018h0 = view2;
                view2.setBackground(new GradientDrawable(orientation, new int[]{0, i0.a.o(-16777216, 127)}));
                mh1Var.addView(rh1Var3.f43018h0, org.telegram.ui.Components.kb1.i(-1, 160, 80));
                View view3 = new View(activity);
                rh1Var3.f43020i0 = view3;
                view3.setBackground(new GradientDrawable(orientation, new int[]{i0.a.o(-16777216, 102), 0}));
                mh1Var.addView(rh1Var3.f43020i0, org.telegram.ui.Components.kb1.i(-1, 160, 48));
                za1 za1Var = new za1(rh1Var3, activity, 19);
                rh1Var3.N = za1Var;
                za1Var.setOrientation(0);
                rh1Var3.N.setPadding(0, 0, 0, AndroidUtilities.dp(30.0f));
                rh1Var3.N.setClipToPadding(false);
                rh1Var3.N.setContentDescription(LocaleController.getString(R.string.VoipHintEncryptionKey));
                rh1Var3.N.setOnClickListener(new ch1(rh1Var3, 3));
                rh1Var3.P = new org.telegram.ui.Components.voip.p0(activity, r1Var);
                FrameLayout frameLayout = new FrameLayout(activity);
                rh1Var3.O = frameLayout;
                frameLayout.addView(rh1Var3.P, org.telegram.ui.Components.kb1.h(-2, -2.0f, 3, 0.0f, 16.0f, 0.0f, 0.0f));
                rh1Var3.O.setVisibility(8);
                rh1Var3.O.setOnClickListener(new ch1(rh1Var3, 4));
                fi.l5 l5Var = new fi.l5(activity, r1Var);
                rh1Var3.R = l5Var;
                l5Var.setOrientation(1);
                TextView textView = new TextView(activity);
                rh1Var3.S = textView;
                textView.setText(LocaleController.getString(R.string.VoipCallEncryptionEndToEnd));
                rh1Var3.S.setTextSize(1, 15.0f);
                rh1Var3.S.setTypeface(AndroidUtilities.bold());
                rh1Var3.S.setTextColor(-1);
                rh1Var3.S.setGravity(17);
                ok okVar = new ok(rh1Var3, activity, 5);
                rh1Var3.T = okVar;
                okVar.setTextSize(1, 15.0f);
                rh1Var3.T.setTextColor(-1);
                rh1Var3.T.setGravity(17);
                rh1Var3.T.setText(LocaleController.formatString("CallEmojiKeyTooltip", R.string.CallEmojiKeyTooltip, TextUtils.ellipsize(UserObject.getFirstName(user), rh1Var3.T.getPaint(), AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END)));
                rh1Var3.R.setVisibility(8);
                rh1Var3.R.addView(rh1Var3.S);
                rh1Var3.R.addView(rh1Var3.T, org.telegram.ui.Components.kb1.o(0.0f, 8.0f, 0.0f, 0.0f, -2, -2));
                rh1Var3.R.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(80.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
                for (int i15 = 0; i15 < 4; i15++) {
                    org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(activity);
                    org.telegram.ui.Components.y9[] y9VarArr = rh1Var3.V;
                    y9VarArr[i15] = y9Var;
                    y9VarArr[i15].getImageReceiver().setAspectFit(true);
                    za1 za1Var2 = rh1Var3.N;
                    org.telegram.ui.Components.y9 y9Var2 = y9VarArr[i15];
                    if (i15 == 0) {
                        f7 = 0.0f;
                    } else {
                        f7 = 6.0f;
                    }
                    za1Var2.addView(y9Var2, org.telegram.ui.Components.kb1.o(f7, 0.0f, 0.0f, 0.0f, 25, 25));
                }
                nh1 nh1Var = new nh1(rh1Var3, activity);
                rh1Var3.X = nh1Var;
                nh1Var.setOrientation(1);
                rh1Var3.X.setFocusable(true);
                rh1Var3.X.setFocusableInTouchMode(true);
                rh1Var3.f43044y = new org.telegram.ui.Components.voip.r0(activity);
                org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
                j9Var.r(user);
                org.telegram.ui.Components.voip.r0 r0Var = rh1Var3.f43044y;
                int i16 = rh1Var3.f43000a;
                r0Var.f34145b.h(ImageLocation.getForUserOrChat(i16, user, 0), null, j9Var, user);
                rh1Var3.f43044y.setRoundRadius(AndroidUtilities.dp(135.0f) / 2);
                TextView textView2 = new TextView(activity);
                rh1Var3.E = textView2;
                textView2.setTextSize(1, 28.0f);
                rh1Var3.E.setText(Emoji.replaceEmoji(ContactsController.formatName(user.first_name, user.last_name), rh1Var3.E.getPaint().getFontMetricsInt(), false));
                rh1Var3.E.setMaxLines(2);
                rh1Var3.E.setEllipsize(TextUtils.TruncateAt.END);
                rh1Var3.E.setTextColor(-1);
                rh1Var3.E.setGravity(1);
                rh1Var3.E.setImportantForAccessibility(2);
                rh1Var3.X.addView(rh1Var3.E, org.telegram.ui.Components.kb1.x(-2, -2, 1, 8, 0, 8, 6));
                ?? frameLayout2 = new FrameLayout(activity);
                frameLayout2.f34137a = new TextView[2];
                int i17 = 0;
                for (int i18 = 2; i17 < i18; i18 = 2) {
                    frameLayout2.f34137a[i17] = new TextView(activity);
                    frameLayout2.f34137a[i17].setTextSize(1, 15.0f);
                    frameLayout2.f34137a[i17].setTextColor(-1);
                    frameLayout2.f34137a[i17].setGravity(1);
                    frameLayout2.addView(frameLayout2.f34137a[i17]);
                    i17++;
                }
                FrameLayout frameLayout3 = new FrameLayout(activity);
                frameLayout2.f34139c = frameLayout3;
                org.telegram.ui.Components.voip.o2 o2Var = new org.telegram.ui.Components.voip.o2(frameLayout2, activity, r1Var);
                o2Var.setTextSize(1, 15.0f);
                o2Var.setTextColor(-1);
                o2Var.setGravity(1);
                o2Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(2.0f));
                o2Var.setText(LocaleController.getString(R.string.VoipWeakNetwork));
                frameLayout3.addView(o2Var, org.telegram.ui.Components.kb1.h(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                frameLayout3.setVisibility(8);
                frameLayout2.addView(frameLayout3, org.telegram.ui.Components.kb1.h(-1, -2.0f, 0, 0.0f, 44.0f, 0.0f, 0.0f));
                TextView textView3 = new TextView(activity);
                frameLayout2.f34138b = textView3;
                textView3.setTextSize(1, 15.0f);
                textView3.setTextColor(-1);
                textView3.setGravity(1);
                frameLayout2.addView(textView3, org.telegram.ui.Components.kb1.h(-1, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.VoipReconnecting));
                SpannableString spannableString = new SpannableString(".");
                spannableString.setSpan(new jg.x1(new View[]{textView3}), 0, 1, 33);
                spannableStringBuilder.append((CharSequence) spannableString);
                textView3.setText(spannableStringBuilder);
                textView3.setVisibility(8);
                org.telegram.ui.Components.voip.u2 u2Var = new org.telegram.ui.Components.voip.u2(activity);
                frameLayout2.d = u2Var;
                frameLayout2.addView(u2Var, org.telegram.ui.Components.kb1.g(-2.0f, -1));
                rh1Var3.F = frameLayout2;
                WeakHashMap weakHashMap2 = r0.i0.f47143a;
                frameLayout2.setImportantForAccessibility(4);
                rh1Var3.X.addView(rh1Var3.F, org.telegram.ui.Components.kb1.x(-2, -2, 1, 0, 0, 0, 6));
                if (sharedState != null && sharedState.getUser() != null && sharedState.isConference() && sharedState.getGroupCall() != null) {
                    qh1 qh1Var = new qh1(activity);
                    rh1Var3.G = qh1Var;
                    long j10 = sharedState.getUser().f22177id;
                    ArrayList<TLRPC.GroupCallParticipant> groupParticipants = sharedState.getGroupParticipants();
                    int i19 = sharedState.getGroupCall().participants_count;
                    if (groupParticipants == null && i19 <= 0) {
                        qh1Var.setVisibility(8);
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
                        org.telegram.ui.Components.l9 l9Var = qh1Var.f42712b;
                        l9Var.k(min);
                        int i20 = 0;
                        while (i20 < min) {
                            l9Var.l(i20, MessagesController.getInstance(i16).getUserOrChat(DialogObject.getPeerDialogId(groupParticipants.get(i20).peer)), i16);
                            i20++;
                            j10 = j10;
                        }
                        long j11 = j10;
                        l9Var.b(false, true);
                        if (max == 1 && (groupParticipants == null || groupParticipants.size() == 0 || (groupParticipants.size() == 1 && DialogObject.getPeerDialogId(groupParticipants.get(0).peer) == j11))) {
                            qh1Var.setVisibility(8);
                        } else {
                            qh1Var.f42713c = new org.telegram.ui.Components.r11(LocaleController.formatPluralStringComma("Participants", max), 14.0f, AndroidUtilities.bold());
                            qh1Var.setVisibility(0);
                            qh1Var.invalidate();
                        }
                    }
                    rh1Var3.X.addView(rh1Var3.G, org.telegram.ui.Components.kb1.o(0.0f, 22.0f, 0.0f, 0.0f, -1, 30));
                }
                rh1Var3.X.setClipChildren(false);
                rh1Var3.X.setClipToPadding(false);
                rh1Var3.X.setPadding(0, 0, 0, AndroidUtilities.dp(15.0f));
                rh1Var3.U = new org.telegram.ui.Components.voip.k(activity);
                rh1Var3.Q = new org.telegram.ui.Components.voip.p1(activity, r1Var);
                rh1Var3.U.setAlpha(0.0f);
                rh1Var3.Q.setVisibility(8);
                mh1Var.addView(rh1Var3.f43044y, org.telegram.ui.Components.kb1.h(204, 204.0f, 1, 0.0f, 93.0f, 0.0f, 0.0f));
                mh1Var.addView(rh1Var3.X, org.telegram.ui.Components.kb1.h(-1, -2.0f, 0, 0.0f, 135.0f, 0.0f, 0.0f));
                mh1Var.addView(rh1Var3.O, org.telegram.ui.Components.kb1.h(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                mh1Var.addView(rh1Var3.R, org.telegram.ui.Components.kb1.h(304, -2.0f, 49, 0.0f, 118.0f, 0.0f, 0.0f));
                mh1Var.addView(rh1Var3.N, org.telegram.ui.Components.kb1.h(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                mh1Var.addView(rh1Var3.U, org.telegram.ui.Components.kb1.h(-1, 52.0f, 5, 0.0f, 0.0f, 0.0f, 0.0f));
                mh1Var.addView(rh1Var3.Q, org.telegram.ui.Components.kb1.h(-1, -2.0f, 3, 0.0f, 380.0f, 0.0f, 0.0f));
                rh1Var3.f43022j0 = new org.telegram.ui.Components.voip.s1(activity);
                rh1Var3.e = new org.telegram.ui.Components.voip.l3(activity, r1Var);
                rh1Var3.f43013f = new org.telegram.ui.Components.voip.l3(activity, r1Var);
                rh1Var3.h = new org.telegram.ui.Components.voip.l3(activity, r1Var);
                rh1Var3.f43028n = new org.telegram.ui.Components.voip.w2(activity, 52.0f);
                rh1Var3.e.setTranslationY(AndroidUtilities.dp(100.0f));
                rh1Var3.e.setScaleX(0.0f);
                rh1Var3.e.setScaleY(0.0f);
                rh1Var3.e.animate().setStartDelay(150).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                rh1Var3.f43013f.setTranslationY(AndroidUtilities.dp(100.0f));
                rh1Var3.f43013f.setScaleX(0.0f);
                rh1Var3.f43013f.setScaleY(0.0f);
                rh1Var3.f43013f.animate().setStartDelay(166).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                rh1Var3.h.setTranslationY(AndroidUtilities.dp(100.0f));
                rh1Var3.h.setScaleX(0.0f);
                rh1Var3.h.setScaleY(0.0f);
                rh1Var3.h.animate().setStartDelay(182).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                rh1Var3.f43028n.setTranslationY(AndroidUtilities.dp(100.0f));
                rh1Var3.f43028n.setScaleX(0.0f);
                rh1Var3.f43028n.setScaleY(0.0f);
                rh1Var3.f43028n.animate().setStartDelay(198).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                rh1Var3.f43022j0.addView(rh1Var3.e);
                rh1Var3.f43022j0.addView(rh1Var3.f43013f);
                rh1Var3.f43022j0.addView(rh1Var3.h);
                rh1Var3.f43022j0.addView(rh1Var3.f43028n);
                org.telegram.ui.Components.voip.e eVar = new org.telegram.ui.Components.voip.e(activity);
                rh1Var3.f43011e0 = eVar;
                eVar.setListener(new ph1(rh1Var3));
                rh1Var3.f43011e0.setScaleX(1.15f);
                rh1Var3.f43011e0.setScaleY(1.15f);
                mh1Var.addView(rh1Var3.f43022j0, org.telegram.ui.Components.kb1.i(-1, -2, 80));
                if (AndroidUtilities.isTablet()) {
                    i11 = 100;
                } else {
                    i11 = 27;
                }
                float f10 = i11;
                mh1Var.addView(rh1Var3.f43011e0, org.telegram.ui.Components.kb1.h(-1, 186.0f, 80, f10, 0.0f, f10, 0.0f));
                ImageView imageView = new ImageView(activity);
                rh1Var3.I = imageView;
                imageView.setBackground(org.telegram.ui.ActionBar.y6.g0(i0.a.o(-1, 76), 1, -1));
                rh1Var3.I.setImageResource(R.drawable.msg_addcontact);
                rh1Var3.I.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                mh1Var.addView(rh1Var3.I, org.telegram.ui.Components.kb1.i(56, 56, 53));
                org.telegram.ui.Components.kb1.b(rh1Var3.I);
                ImageView imageView2 = new ImageView(activity);
                rh1Var3.H = imageView2;
                imageView2.setBackground(org.telegram.ui.ActionBar.y6.g0(i0.a.o(-1, 76), 1, -1));
                rh1Var3.H.setImageResource(R.drawable.msg_call_minimize_shadow);
                rh1Var3.H.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                rh1Var3.H.setContentDescription(LocaleController.getString(R.string.Back));
                mh1Var.addView(rh1Var3.H, org.telegram.ui.Components.kb1.i(56, 56, 51));
                org.telegram.ui.Components.kb1.b(rh1Var3.H);
                jg.l lVar = new jg.l(activity, 5);
                rh1Var3.K = lVar;
                lVar.setContentDescription(LocaleController.getString(R.string.VoipSpeaker));
                rh1Var3.K.setBackground(org.telegram.ui.ActionBar.y6.g0(i0.a.o(-1, 76), 1, -1));
                rh1Var3.K.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
                mh1Var.addView(rh1Var3.K, org.telegram.ui.Components.kb1.h(56, 56.0f, 53, 0.0f, 56.0f, 0.0f, 0.0f));
                rh1Var3.K.setAlpha(0.0f);
                rh1Var3.K.setOnClickListener(new ch1(rh1Var3, 5));
                rh1Var3.H.setOnClickListener(new ch1(rh1Var3, 6));
                rh1Var3.I.setOnClickListener(new zd0(21, rh1Var3, activity));
                if (rh1Var3.f43038u0.f34312b) {
                    rh1Var3.H.setVisibility(8);
                    rh1Var3.I.setVisibility(8);
                }
                ?? linearLayout = new LinearLayout(activity);
                linearLayout.f33961a = new HashMap();
                linearLayout.f33962b = new ArrayList();
                linearLayout.f33963c = new ArrayList();
                TextPaint textPaint = new TextPaint();
                linearLayout.f33966r = textPaint;
                linearLayout.setOrientation(1);
                linearLayout.f33965n = r1Var;
                TransitionSet transitionSet = new TransitionSet();
                linearLayout.d = transitionSet;
                transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(200L)).addTransition(new org.telegram.ui.ActionBar.n0(3).setDuration(200L));
                transitionSet.setOrdering(0);
                textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                rh1Var3.M0 = linearLayout;
                linearLayout.setGravity(80);
                rh1Var3.M0.setOnViewsUpdated(new ah1(rh1Var3, 5));
                mh1Var.addView(rh1Var3.M0, org.telegram.ui.Components.kb1.h(-1, 200.0f, 80, 16.0f, 0.0f, 16.0f, 0.0f));
                org.telegram.ui.Components.voip.e3 e3Var = new org.telegram.ui.Components.voip.e3(activity, 3, r1Var, true);
                e3Var.p(true);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                e3Var.K = alignment;
                e3Var.d = -1L;
                e3Var.f11797l0 = new ah1(rh1Var3, 6);
                e3Var.T = true;
                e3Var.h = AndroidUtilities.dp(320.0f);
                e3Var.e = true;
                e3Var.k(10.0f, 6.0f, 10.0f, 6.0f);
                e3Var.q(8.0f);
                rh1Var3.N0 = e3Var;
                e3Var.s(LocaleController.getString(R.string.TapToTurnCamera));
                mh1Var.addView(rh1Var3.N0, org.telegram.ui.Components.kb1.h(-2, -2.0f, 80, 19.0f, 0.0f, 19.0f, 0.0f));
                org.telegram.ui.Components.voip.e3 e3Var2 = new org.telegram.ui.Components.voip.e3(activity, 1, r1Var, false);
                e3Var2.p(true);
                e3Var2.K = alignment;
                e3Var2.d = 4000L;
                e3Var2.T = true;
                e3Var2.h = AndroidUtilities.dp(320.0f);
                e3Var2.e = true;
                e3Var2.k(10.0f, 6.0f, 10.0f, 6.0f);
                e3Var2.q(8.0f);
                rh1Var3.O0 = e3Var2;
                e3Var2.s(LocaleController.getString(R.string.VoipHintEncryptionKey));
                mh1Var.addView(rh1Var3.O0, org.telegram.ui.Components.kb1.h(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                rh1Var3.G();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (!rh1Var3.U0) {
                        TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                        if (phoneCall != null && phoneCall.video) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        rh1Var3.U0 = z12;
                    }
                    rh1Var3.n();
                }
                jh1Var2.addView(mh1Var);
                if (z10) {
                    rh1Var3.F0 = 0.0f;
                    rh1Var3.I0 = true;
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                        rh1Var3.f43007c0.setStub(org.telegram.ui.Components.voip.n2.k().f34067s);
                        rh1Var3.f43009d0.setStub(org.telegram.ui.Components.voip.n2.k().f34066r);
                    }
                    rh1Var3.f43038u0.setAlpha(0.0f);
                    rh1Var3.G();
                    rh1Var3.E0 = true;
                    org.telegram.ui.Components.voip.n2.U = true;
                    if (org.telegram.ui.Components.voip.n2.W == null) {
                        rh1Var3.L0.lock();
                        AndroidUtilities.runOnUIThread(new ah1(rh1Var3, 11), 32L);
                    } else {
                        org.telegram.ui.Components.voip.n2.V.getClass();
                        throw null;
                    }
                } else {
                    rh1Var3.F0 = 1.0f;
                    rh1Var3.F();
                }
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null && sharedInstance3.getRemoteVideoState() == 2 && vf.b.a(activity) == 1) {
                    rh1 rh1Var4 = f42999n1;
                    sf.c cVar = new sf.c(activity, rh1Var4);
                    cVar.f48158c = "voip-fragment-pip";
                    org.telegram.ui.Components.voip.t2 t2Var3 = rh1Var4.f43007c0;
                    cVar.f48162j = t2Var3.d;
                    cVar.f48163k = t2Var3.getPlaceholderView();
                    rh1Var4.f43016g0 = cVar.a();
                }
            }
        }
    }

    public final void A() {
        if (VoIPService.getSharedInstance() != null) {
            ah1 ah1Var = this.S0;
            AndroidUtilities.cancelRunOnUIThread(ah1Var);
            this.R0 = false;
            if (this.f43046z0 && this.f43043x0) {
                AndroidUtilities.runOnUIThread(ah1Var, 3000L);
                this.R0 = true;
            }
        }
    }

    public final void B() {
        String string;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (this.f43041w0.isTouchExplorationEnabled()) {
                if (!this.f43029n0) {
                    string = LocaleController.getString(R.string.AccDescrVoipCamOn);
                } else {
                    string = LocaleController.getString(R.string.AccDescrVoipCamOff);
                }
                this.f43035s.announceForAccessibility(string);
            }
            if (!this.f43029n0) {
                if (this.f43030o0 == null) {
                    sharedInstance.createCaptureDevice(false);
                    if (!sharedInstance.isFrontFaceCamera()) {
                        sharedInstance.switchCamera();
                    }
                    this.f43038u0.setLockOnScreen(true);
                    int[] iArr = new int[2];
                    this.f43013f.getLocationOnScreen(iArr);
                    kh1 kh1Var = new kh1(this, this.f43035s.getContext(), iArr[0], iArr[1]);
                    this.f43030o0 = kh1Var;
                    WindowInsets windowInsets = this.f43034r0;
                    if (windowInsets != null) {
                        kh1Var.setBottomPadding(windowInsets.getSystemWindowInsetBottom());
                    }
                    this.f43035s.addView(this.f43030o0);
                    return;
                }
                return;
            }
            this.f43009d0.c();
            sharedInstance.setVideoState(false, 0);
            sharedInstance.clearCamera();
            this.f43032q0 = this.f43031p0;
            G();
        }
    }

    public final void C(boolean z10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (z10) {
                TransitionSet transitionSet = new TransitionSet();
                Transition duration = new org.telegram.ui.ActionBar.n0(4).setDuration(250L);
                org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.f27530f;
                transitionSet.addTransition(duration.setInterpolator(dsVar)).addTransition(new ChangeBounds().setDuration(250L).setInterpolator(dsVar));
                transitionSet.excludeChildren(org.telegram.ui.Components.voip.w2.class, true);
                transitionSet.excludeChildren(org.telegram.ui.Components.voip.l3.class, true);
                TransitionManager.beginDelayedTransition(this.f43022j0, transitionSet);
            }
            int i10 = this.f43031p0;
            if (i10 == 11) {
                this.e.setVisibility(8);
                this.f43013f.setVisibility(8);
                this.h.setVisibility(8);
                this.f43028n.setVisibility(8);
                return;
            }
            int i11 = 0;
            if (i10 != 15 && i10 != 17) {
                if (f42999n1 == null) {
                    return;
                }
                if (!sharedInstance.isScreencast() && (this.f43029n0 || this.m0)) {
                    r(this.e, sharedInstance);
                    if (this.f43043x0) {
                        this.K.setTag(1);
                        this.K.animate().alpha(1.0f).start();
                    }
                } else {
                    t(this.e, sharedInstance);
                    this.K.setTag(null);
                    this.K.animate().alpha(0.0f).start();
                }
                u(this.f43013f, sharedInstance, false);
                s(this.h, sharedInstance, z10);
                this.f43028n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, LocaleController.getString(R.string.VoipEndCall2), false, z10);
                this.f43028n.setOnClickListener(new ch1(this, 0));
            } else {
                TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                if (phoneCall != null && phoneCall.video && i10 == 15) {
                    if (!sharedInstance.isScreencast() && (this.f43029n0 || this.m0)) {
                        r(this.e, sharedInstance);
                        if (this.f43043x0) {
                            this.K.animate().alpha(1.0f).start();
                        }
                    } else {
                        t(this.e, sharedInstance);
                        this.K.animate().alpha(0.0f).start();
                    }
                    u(this.f43013f, sharedInstance, false);
                    s(this.h, sharedInstance, z10);
                } else {
                    this.e.setVisibility(8);
                    this.f43013f.setVisibility(8);
                    this.h.setVisibility(8);
                }
                this.f43028n.setVisibility(8);
            }
            if (this.e.getVisibility() == 0) {
                this.e.f34048f = 0;
                i11 = 16;
            }
            if (this.f43013f.getVisibility() == 0) {
                this.f43013f.f34048f = i11;
                i11 += 16;
            }
            if (this.h.getVisibility() == 0) {
                this.h.f34048f = i11;
                i11 += 16;
            }
            if (this.f43028n.getVisibility() == 0) {
                this.f43028n.F = i11;
            }
            E();
        }
    }

    public final void D(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rh1.D(boolean):void");
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
        this.f43024k0.setColor(i0.a.o(-16777216, (int) (this.f43045y0 * 102.0f * this.F0)));
        this.f43026l0.setColor(i0.a.o(-16777216, (int) (127.5f * this.F0)));
        mh1 mh1Var = this.f43035s;
        if (mh1Var != null) {
            mh1Var.invalidate();
        }
    }

    public final void G() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rh1.G():void");
    }

    @Override
    public final void a(a8.fg fgVar) {
        this.l1 = fgVar;
        org.telegram.ui.Components.voip.t2 t2Var = this.f43007c0;
        if (t2Var != null) {
            t2Var.d.clearFirstFrame();
        }
        this.f43027m1 = true;
        G();
        try {
            ((WindowManager) this.f43003b.getSystemService("window")).removeView(this.f43038u0);
        } catch (IllegalArgumentException e) {
            FileLog.e(e);
        }
        this.f43038u0.invalidate();
    }

    @Override
    public final void b(a8.fg fgVar) {
        this.l1 = fgVar;
        jh1 jh1Var = this.f43038u0;
        jh1Var.getClass();
        ((WindowManager) this.f43003b.getSystemService("window")).addView(jh1Var, org.telegram.ui.Components.voip.x2.a());
        this.f43027m1 = false;
        G();
        this.f43038u0.invalidate();
        org.telegram.ui.Components.voip.t2 t2Var = this.f43025k1;
        if (t2Var != null) {
            t2Var.d.release();
            this.f43025k1 = null;
        }
    }

    @Override
    public final Bitmap c() {
        org.telegram.ui.Components.voip.t2 t2Var = this.f43025k1;
        if (t2Var != null && t2Var.d.isAvailable()) {
            return this.f43025k1.d.getBitmap();
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
            if (this.f43031p0 == 17 && VoIPService.getSharedInstance() != null) {
                this.f43009d0.d.release();
                this.f43007c0.d.release();
                this.f43004b0.release();
                n();
                VoIPService.getSharedInstance().registerStateListener(this);
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            D(true);
        } else if (i10 == NotificationCenter.closeInCallActivity) {
            this.f43038u0.b();
        } else if (i10 == NotificationCenter.webRtcSpeakerAmplitudeEvent) {
            this.f43044y.setAmplitude(((Float) objArr[0]).floatValue() * 15.0f);
        } else if (i10 == NotificationCenter.nearEarEvent) {
            boolean booleanValue = ((Boolean) objArr[0]).booleanValue();
            this.f43014f0 = booleanValue;
            if (booleanValue) {
                this.f43044y.b(true, true);
            }
        }
    }

    @Override
    public final Bitmap e() {
        org.telegram.ui.Components.voip.t2 t2Var = this.f43007c0;
        if (t2Var != null && t2Var.d.isAvailable()) {
            return this.f43007c0.d.getBitmap();
        }
        return null;
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final View h() {
        org.telegram.ui.Components.voip.t2 t2Var = new org.telegram.ui.Components.voip.t2(this.f43003b, false, true, false, false);
        this.f43025k1 = t2Var;
        t2Var.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        this.f43025k1.d.setEnableHardwareScaler(true);
        this.f43025k1.d.setRotateTextureWithScreen(true);
        org.telegram.ui.Components.voip.t2 t2Var2 = this.f43025k1;
        t2Var2.f34218a0 = 1;
        t2Var2.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new lh1(this));
        View view = this.f43025k1.h;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.f43025k1;
    }

    public final ValueAnimator j(boolean z10) {
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
        float f19 = org.telegram.ui.Components.voip.n2.k().d.x + org.telegram.ui.Components.voip.n2.k().E;
        float f20 = org.telegram.ui.Components.voip.n2.k().d.y + org.telegram.ui.Components.voip.n2.k().F;
        final float x9 = this.Y.getX();
        final float y3 = this.Y.getY();
        final float scaleX = this.Y.getScaleX();
        org.telegram.ui.Components.voip.n2.V.getClass();
        final float measuredWidth2 = f19 - ((this.f43007c0.getMeasuredWidth() - (this.f43007c0.getMeasuredWidth() * 0.25f)) / 2.0f);
        final float measuredHeight2 = f20 - ((this.f43007c0.getMeasuredHeight() - (this.f43007c0.getMeasuredHeight() * 0.25f)) / 2.0f);
        final float f21 = 1.0f;
        if (this.m0) {
            int measuredWidth3 = this.Y.getMeasuredWidth();
            if (this.f43029n0 && measuredWidth3 != 0) {
                f18 = (this.f43038u0.getMeasuredWidth() / measuredWidth3) * 0.25f * 0.4f;
                c10 = 0;
                f7 = 4.0f;
                measuredWidth = d3.A(org.telegram.ui.Components.voip.n2.k().f34064f, 0.25f, 0.4f, (org.telegram.ui.Components.voip.n2.k().f34064f * 0.25f) + (f19 - ((this.Y.getMeasuredWidth() - (this.Y.getMeasuredWidth() * f18)) / 2.0f))) - AndroidUtilities.dp(4.0f);
                f17 = d3.A(org.telegram.ui.Components.voip.n2.k().h, 0.25f, 0.4f, (org.telegram.ui.Components.voip.n2.k().h * 0.25f) + (f20 - ((this.Y.getMeasuredHeight() - (this.Y.getMeasuredHeight() * f18)) / 2.0f))) - AndroidUtilities.dp(4.0f);
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
            f11 = AndroidUtilities.dp(f7);
        } else {
            f11 = 0.0f;
        }
        final float dp = (AndroidUtilities.dp(f7) * 1.0f) / f10;
        if (this.m0) {
            org.telegram.ui.Components.voip.n2.V.getClass();
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
                this.Y.setCornerRadius(dp);
                this.Y.setAlpha(f21);
            }
            this.f43007c0.setScaleX(0.25f);
            this.f43007c0.setScaleY(0.25f);
            this.f43007c0.setTranslationX(measuredWidth2);
            this.f43007c0.setTranslationY(measuredHeight2);
            f13 = 0.25f;
            this.f43007c0.setRoundCorners((AndroidUtilities.dp(6.0f) * f23) / 0.25f);
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
                rh1 rh1Var = rh1.this;
                rh1Var.F0 = f25;
                rh1Var.F();
                if (z11) {
                    float f26 = (f10 * floatValue) + (scaleX * f25);
                    rh1Var.Y.setScaleX(f26);
                    rh1Var.Y.setScaleY(f26);
                    rh1Var.Y.setTranslationX((f22 * floatValue) + (x9 * f25));
                    rh1Var.Y.setTranslationY((measuredHeight * floatValue) + (y3 * f25));
                    rh1Var.Y.setCornerRadius((dp * floatValue) + (f11 * f25));
                    rh1Var.Y.setAlpha((f21 * floatValue) + (1.0f * f25));
                }
                float f27 = (f24 * floatValue) + (1.0f * f25);
                rh1Var.f43007c0.setScaleX(f27);
                rh1Var.f43007c0.setScaleY(f27);
                float f28 = 0.0f * f25;
                float f29 = (measuredWidth2 * floatValue) + f28;
                float f30 = (measuredHeight2 * floatValue) + f28;
                rh1Var.f43007c0.setTranslationX(f29);
                rh1Var.f43007c0.setTranslationY(f30);
                rh1Var.f43007c0.setRoundCorners(((AndroidUtilities.dp(4.0f) * floatValue) * 1.0f) / f27);
                if (!rh1Var.Y.P) {
                    rh1Var.f43009d0.d(floatValue, false);
                }
                rh1Var.f43038u0.invalidate();
            }
        });
        return ofFloat;
    }

    public final void k() {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
        NotificationCenter.getInstance(this.f43000a).removeObserver(this, NotificationCenter.voipServiceCreated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.closeInCallActivity);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.nearEarEvent);
        sf.d dVar = this.f43016g0;
        if (dVar != null) {
            dVar.c();
            this.f43016g0 = null;
        }
        vg.n1 n1Var = this.M;
        if (n1Var != null) {
            n1Var.dismiss();
            this.M = null;
        }
    }

    public final void l(boolean z10) {
        ValueAnimator ofFloat;
        if (this.B0 && this.C0 != z10 && this.f43043x0) {
            this.C0 = z10;
            org.telegram.ui.Components.voip.a3 a3Var = this.f43040w;
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
                a3Var.f33827c = ofFloat;
                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.z2(a3Var, 1));
                a3Var.f33827c.setInterpolator(org.telegram.ui.Components.ds.f27530f);
                a3Var.f33827c.setDuration(200L);
                a3Var.f33827c.start();
            }
            if (z10) {
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(2);
                }
                this.O0.e(true);
                AndroidUtilities.cancelRunOnUIThread(this.S0);
                this.R0 = false;
                if (this.f43044y.getVisibility() == 0) {
                    this.f43044y.animate().setStartDelay(0L).translationY(AndroidUtilities.dp(48.0f)).scaleY(0.1f).scaleX(0.1f).alpha(0.0f).setDuration(200L).setInterpolator(org.telegram.ui.Components.ds.f27530f).start();
                }
                this.O.animate().setListener(null).cancel();
                this.O.setVisibility(0);
                this.O.setAlpha(0.0f);
                this.O.setScaleX(0.3f);
                this.O.setScaleY(0.3f);
                this.O.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(340L).setInterpolator(org.telegram.ui.Components.ds.f27531g).start();
                ViewPropertyAnimator translationY = this.N.animate().scaleX(1.72f).scaleY(1.72f).translationY(AndroidUtilities.dp(140.0f));
                org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.f27530f;
                org.telegram.messenger.wh.q(translationY, dsVar, 400L);
                this.R.animate().setListener(null).cancel();
                this.R.setVisibility(0);
                this.R.setTranslationY(-AndroidUtilities.dp(120.0f));
                this.R.setScaleX(0.7f);
                this.R.setScaleY(0.7f);
                this.R.setAlpha(0.0f);
                this.R.animate().alpha(1.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(400L).setListener(new fh1(this, 3)).setInterpolator(dsVar).start();
            } else {
                if (this.f43044y.getVisibility() == 0) {
                    this.f43044y.animate().setStartDelay(50L).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(250L).setInterpolator(org.telegram.ui.Components.ds.f27530f).start();
                }
                this.O.animate().setListener(null).cancel();
                ViewPropertyAnimator duration = this.O.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(230L);
                org.telegram.ui.Components.ds dsVar2 = org.telegram.ui.Components.ds.f27530f;
                duration.setInterpolator(dsVar2).setListener(new lo(this.O)).start();
                this.N.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(dsVar2).setDuration(280L).start();
                this.R.animate().setListener(null).cancel();
                this.R.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-AndroidUtilities.dp(120.0f)).setListener(new fh1(this, 4)).setDuration(250L).setInterpolator(dsVar2).start();
            }
            this.f43032q0 = this.f43031p0;
            G();
        }
    }

    public final void m() {
        this.f43038u0.b();
    }

    public final void n() {
        this.f43009d0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new gh1(this));
        this.f43007c0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new hh1(this), EglBase.CONFIG_PLAIN, new GlRectDrawer());
        this.f43004b0.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
    }

    public final void o() {
        if (!this.G0 && !this.E0) {
            kh1 kh1Var = this.f43030o0;
            if (kh1Var != null) {
                kh1Var.a(false, false);
            } else if (this.m0 && this.f43029n0 && this.H0) {
                this.H0 = false;
                this.Y.setRelativePosition(this.Z);
                this.f43001a0 = false;
                this.f43032q0 = this.f43031p0;
                G();
            } else if (this.C0) {
                l(false);
            } else if (this.R.getVisibility() == 8) {
                if (this.D0 && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isConverting()) {
                    if (vf.b.a(this.f43003b) > 0) {
                        if (!this.G0 && f42999n1 != null) {
                            this.G0 = true;
                            if (VoIPService.getSharedInstance() != null) {
                                int measuredHeight = f42999n1.f43038u0.getMeasuredHeight();
                                rh1 rh1Var = f42999n1;
                                org.telegram.ui.Components.voip.n2.l(rh1Var.f43003b, rh1Var.f43000a, rh1Var.f43038u0.getMeasuredWidth(), measuredHeight, 1);
                                WindowInsets windowInsets = f42999n1.f43034r0;
                                if (windowInsets != null) {
                                    org.telegram.ui.Components.voip.n2.X = windowInsets.getSystemWindowInsetTop();
                                    f42999n1.f43034r0.getSystemWindowInsetBottom();
                                }
                            }
                            if (org.telegram.ui.Components.voip.n2.k() != null) {
                                ViewPropertyAnimator duration = this.K.animate().alpha(0.0f).setDuration(150L);
                                org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.f27530f;
                                duration.setInterpolator(dsVar).start();
                                this.H.animate().alpha(0.0f).setDuration(150L).setInterpolator(dsVar).start();
                                this.I.animate().alpha(0.0f).setDuration(150L).setInterpolator(dsVar).start();
                                this.N.animate().alpha(0.0f).setDuration(150L).setInterpolator(dsVar).start();
                                this.X.animate().alpha(0.0f).setDuration(150L).setInterpolator(dsVar).start();
                                this.f43022j0.animate().alpha(0.0f).setDuration(350L).setInterpolator(dsVar).start();
                                this.f43018h0.animate().alpha(0.0f).setDuration(350L).setInterpolator(dsVar).start();
                                this.f43020i0.animate().alpha(0.0f).setDuration(350L).setInterpolator(dsVar).start();
                                this.Z.animate().alpha(0.0f).setDuration(350L).setInterpolator(dsVar).start();
                                this.M0.animate().alpha(0.0f).setDuration(350L).setInterpolator(dsVar).start();
                                org.telegram.ui.Components.voip.n2.U = true;
                                this.E0 = true;
                                ValueAnimator j10 = j(false);
                                this.L0.lock();
                                j10.addListener(new fh1(this, 1));
                                j10.setDuration(350L);
                                j10.setInterpolator(dsVar);
                                j10.start();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Components.g5.A(this.f43003b, new xg1(this, 0), true).p();
                    return;
                }
                this.f43038u0.b();
            }
        }
    }

    @Override
    public final void onAudioSettingsChanged() {
        C(true);
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.t0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
        this.f43032q0 = this.f43031p0;
        G();
    }

    @Override
    public final void onMediaStateUpdated(int i10, int i11) {
        this.f43032q0 = this.f43031p0;
        if (i11 == 2 && !this.U0) {
            this.U0 = true;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.getRemoteVideoState() == 2) {
            if (this.f43016g0 == null && vf.b.a(this.f43003b) == 1) {
                sf.c cVar = new sf.c(this.f43003b, f42999n1);
                cVar.f48158c = "voip-fragment-pip";
                org.telegram.ui.Components.voip.t2 t2Var = this.f43007c0;
                cVar.f48162j = t2Var.d;
                cVar.f48163k = t2Var.getPlaceholderView();
                this.f43016g0 = cVar.a();
            }
        } else {
            sf.d dVar = this.f43016g0;
            if (dVar != null) {
                dVar.c();
                this.f43016g0 = null;
            }
        }
        G();
    }

    @Override
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.ui.Components.voip.d3 d3Var;
        if (i10 > 0) {
            this.f43023j1 = true;
        }
        if (this.F != null && (d3Var = this.v) != null) {
            int i11 = d3Var.V;
            if ((i11 == 2 || i11 == 3) && this.f43023j1) {
                AndroidUtilities.runOnUIThread(new yg1(this, i10, 0), 400L);
            }
        }
    }

    @Override
    public final void onStateChanged(int i10) {
        int i11 = this.f43031p0;
        if (i11 != i10) {
            this.f43032q0 = i11;
            this.f43031p0 = i10;
            if (this.f43038u0 != null) {
                G();
            }
        }
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        this.f43032q0 = this.f43031p0;
        if (z10 && !this.U0) {
            this.U0 = true;
        }
        G();
    }

    public final void q(Runnable runnable) {
        if (this.f43013f.getVisibility() == 0) {
            this.f43011e0.getLocationOnScreen(new int[2]);
            org.telegram.ui.Components.voip.e eVar = this.f43011e0;
            ValueAnimator valueAnimator = eVar.f33881b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                eVar.f33881b0 = null;
                eVar.U.stop();
            }
            runnable.run();
            return;
        }
        this.f43028n.animate().cancel();
        this.e.animate().cancel();
        this.h.animate().cancel();
        this.f43013f.animate().cancel();
        this.f43011e0.getLocationOnScreen(new int[2]);
        org.telegram.ui.Components.voip.e eVar2 = this.f43011e0;
        ValueAnimator valueAnimator2 = eVar2.f33881b0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            eVar2.f33881b0 = null;
            eVar2.U.stop();
        }
        this.f43028n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, LocaleController.getString(R.string.VoipEndCall2), false, false);
        this.e.d(5, false, false);
        this.h.d(1, false, false);
        this.f43013f.d(3, true, false);
        this.f43028n.setVisibility(0);
        this.e.setVisibility(0);
        this.h.setVisibility(0);
        this.f43013f.setVisibility(0);
        this.f43028n.setAlpha(0.0f);
        this.e.setAlpha(0.0f);
        this.h.setAlpha(0.0f);
        this.f43013f.setAlpha(0.0f);
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f43011e0.getLayoutParams();
        final int marginEnd = marginLayoutParams.getMarginEnd();
        AndroidUtilities.dp(52.0f);
        final int dp = AndroidUtilities.dp(24.0f);
        final int dp2 = AndroidUtilities.dp(62.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                rh1 rh1Var = rh1.this;
                rh1Var.getClass();
                float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                rh1Var.f43011e0.setTranslationY(dp2 * floatValue);
                int i10 = marginEnd;
                int i11 = (int) (i10 - ((i10 + dp) * floatValue));
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = i11;
                marginLayoutParams2.rightMargin = i11;
                rh1Var.f43011e0.requestLayout();
            }
        });
        org.telegram.ui.Components.voip.e eVar3 = this.f43011e0;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(eVar3, View.SCALE_X, eVar3.getScaleX(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar4 = this.f43011e0;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(eVar4, View.SCALE_Y, eVar4.getScaleY(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar5 = this.f43011e0;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(eVar5, View.ALPHA, eVar5.getAlpha(), this.f43011e0.getAlpha(), 0.0f, 0.0f));
        animatorSet.setDuration(400L);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.addListener(new org.telegram.ui.Components.ml0(16, this, runnable));
        animatorSet.start();
        AndroidUtilities.runOnUIThread(new ah1(this, 7), 133L);
    }

    public final void r(org.telegram.ui.Components.voip.l3 l3Var, VoIPService voIPService) {
        if (!this.f43029n0) {
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
        l3Var.setOnBtnClickedListener(new e7(this, voIPService, l3Var, 23));
    }

    public final void s(org.telegram.ui.Components.voip.l3 l3Var, VoIPService voIPService, boolean z10) {
        l3Var.d(1, voIPService.isMicMute(), false);
        org.telegram.ui.Components.voip.v1 v1Var = this.Y;
        boolean isMicMute = voIPService.isMicMute();
        float f7 = 0.0f;
        if (!z10) {
            ValueAnimator valueAnimator = v1Var.f34264f0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (isMicMute) {
                f7 = 1.0f;
            }
            v1Var.K = f7;
            v1Var.invalidate();
        } else {
            ValueAnimator valueAnimator2 = v1Var.f34264f0;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f10 = v1Var.K;
            if (isMicMute) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            v1Var.f34264f0 = ofFloat;
            ofFloat.addUpdateListener(v1Var.f34265g0);
            v1Var.f34264f0.setDuration(150L);
            v1Var.f34264f0.start();
        }
        l3Var.setOnBtnClickedListener(new xg1(this, 5));
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
            l3Var.setOnBtnClickedListener(new ag.k0(this, i10, l3Var, voIPService, 9));
        }
        i10 = i11;
        l3Var.setEnabled(true);
        l3Var.setOnBtnClickedListener(new ag.k0(this, i10, l3Var, voIPService, 9));
    }

    public final void u(org.telegram.ui.Components.voip.l3 l3Var, VoIPService voIPService, boolean z10) {
        boolean z11;
        if (!this.f43029n0 && !this.m0) {
            z11 = voIPService.isVideoAvailable();
        } else {
            z11 = true;
        }
        if (z11) {
            if (this.f43029n0) {
                if (voIPService.isScreencast()) {
                    l3Var.d(3, false, z10);
                } else {
                    l3Var.d(3, false, z10);
                }
            } else {
                l3Var.d(3, true, z10);
            }
            l3Var.setOnBtnClickedListener(new xg1(this, 6));
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
        if (!this.f43029n0 && !this.m0) {
            z12 = true;
        } else {
            z12 = false;
        }
        Integer num = null;
        if (z10) {
            if (z12 && this.f43044y.getTag() == null) {
                this.f43044y.animate().setListener(null).cancel();
                this.f43044y.setVisibility(0);
                if (!this.C0) {
                    if (z11) {
                        this.f43044y.setAlpha(0.0f);
                        this.f43044y.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.ds.f27530f).start();
                    } else {
                        this.f43044y.setAlpha(0.0f);
                        this.f43044y.setTranslationY(-AndroidUtilities.dp(135.0f));
                        this.f43044y.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.ds.f27530f).start();
                    }
                } else if (z11) {
                    this.f43044y.setAlpha(0.0f);
                    this.f43044y.setTranslationY(AndroidUtilities.dp(48.0f));
                    this.f43044y.setScaleX(0.1f);
                    this.f43044y.setScaleY(0.1f);
                }
            } else if (!z12 && this.f43044y.getTag() != null) {
                this.f43044y.animate().setListener(null).cancel();
                this.f43044y.setTranslationY(0.0f);
                this.f43044y.animate().alpha(0.0f).setDuration(150L).scaleX(0.1f).scaleY(0.1f).setInterpolator(org.telegram.ui.Components.ds.f27530f).setListener(new fh1(this, 7)).start();
            }
        } else {
            this.f43044y.animate().setListener(null).cancel();
            this.f43044y.setTranslationY(0.0f);
            this.f43044y.setAlpha(1.0f);
            this.f43044y.setScaleX(1.0f);
            this.f43044y.setScaleY(1.0f);
            org.telegram.ui.Components.voip.r0 r0Var = this.f43044y;
            if (!z12) {
                i10 = 8;
            }
            r0Var.setVisibility(i10);
        }
        org.telegram.ui.Components.voip.r0 r0Var2 = this.f43044y;
        if (z12) {
            num = 1;
        }
        r0Var2.setTag(num);
    }

    public final void x(CharSequence charSequence) {
        TextView textView;
        if (this.f43003b.isFinishing()) {
            return;
        }
        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(this.f43003b, 0, null);
        boolean[] zArr = new boolean[3];
        e2Var.R = LocaleController.getString(R.string.VoipFailed);
        e2Var.T = charSequence;
        e2Var.f22584n0 = LocaleController.getString(R.string.OK);
        e2Var.f22585o0 = null;
        e2Var.show();
        for (int i10 = 0; i10 < 3; i10++) {
            if (zArr[i10] && (textView = (TextView) e2Var.d(-(i10 + 1))) != null) {
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23599q7, e2Var.f22581k1);
            }
        }
        e2Var.setCanceledOnTouchOutside(true);
        e2Var.setOnDismissListener(new u5(this, 18));
    }

    public final void y(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        AnimatorSet animatorSet;
        if (this.Y.getTag() == null || ((Integer) this.Y.getTag()).intValue() != 2) {
            this.Y.setUiVisible(this.f43043x0);
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
                    animatorSet3.addListener(new fh1(this, 6));
                    this.A0.setDuration(250L).setInterpolator(org.telegram.ui.Components.ds.f27530f);
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
                if (v1Var4.f34274y < 0.0f) {
                    v1Var4.d(1.0f, 1.0f);
                    this.f43001a0 = true;
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
            this.f43001a0 = z13;
        }
        this.Y.setTag(Integer.valueOf(i10));
    }

    public final void z(boolean z10) {
        int i10;
        ValueAnimator valueAnimator = this.P0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        x11 x11Var = this.Q0;
        int i11 = 0;
        if (!z10 && this.f43043x0) {
            ViewPropertyAnimator duration = this.K.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L);
            org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.f27530f;
            duration.setInterpolator(dsVar).start();
            this.H.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(dsVar).start();
            this.I.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(dsVar).start();
            this.N.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(dsVar).start();
            this.E.animate().alpha(0.0f).setDuration(150L).translationY(-AndroidUtilities.dp(10.0f)).setInterpolator(dsVar).start();
            this.F.animate().alpha(0.0f).setDuration(150L).translationY(-AndroidUtilities.dp(10.0f)).setInterpolator(dsVar).start();
            this.f43022j0.animate().alpha(0.0f).translationY(AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(dsVar).start();
            this.f43018h0.animate().alpha(0.0f).setDuration(150L).setInterpolator(dsVar).start();
            this.f43020i0.animate().alpha(0.0f).setDuration(150L).setInterpolator(dsVar).start();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f43045y0, 0.0f);
            this.P0 = ofFloat;
            ofFloat.addUpdateListener(x11Var);
            this.P0.setDuration(150L).setInterpolator(dsVar);
            this.P0.start();
            AndroidUtilities.cancelRunOnUIThread(this.S0);
            this.R0 = false;
            this.f43022j0.setEnabled(false);
            this.O0.e(true);
            i10 = 150;
        } else {
            if (z10 && !this.f43043x0) {
                this.N0.e(true);
                this.O0.e(true);
                ViewPropertyAnimator translationY = this.E.animate().alpha(1.0f).setDuration(150L).translationY(0.0f);
                org.telegram.ui.Components.ds dsVar2 = org.telegram.ui.Components.ds.f27530f;
                translationY.setInterpolator(dsVar2).start();
                this.F.animate().alpha(1.0f).setDuration(150L).translationY(0.0f).setInterpolator(dsVar2).start();
                this.K.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(dsVar2).start();
                this.H.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(dsVar2).start();
                this.I.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(dsVar2).start();
                this.N.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(dsVar2).start();
                this.f43022j0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(dsVar2).start();
                this.f43018h0.animate().alpha(1.0f).setDuration(150L).setInterpolator(dsVar2).start();
                this.f43020i0.animate().alpha(1.0f).setDuration(150L).setInterpolator(dsVar2).start();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f43045y0, 1.0f);
                this.P0 = ofFloat2;
                ofFloat2.addUpdateListener(x11Var);
                this.P0.setDuration(150L).setInterpolator(dsVar2);
                this.P0.start();
                this.f43022j0.setEnabled(true);
            }
            i10 = 0;
        }
        this.f43043x0 = z10;
        jh1 jh1Var = this.f43038u0;
        if (!z10) {
            jh1Var.setSystemUiVisibility(jh1Var.getSystemUiVisibility() | 4);
        } else {
            jh1Var.setSystemUiVisibility(jh1Var.getSystemUiVisibility() & (-5));
        }
        ViewPropertyAnimator animate = this.M0.animate();
        int i12 = -AndroidUtilities.dp(16.0f);
        if (this.f43043x0) {
            i11 = AndroidUtilities.dp(80.0f);
        }
        animate.translationY(i12 - i11).setDuration(150L).setStartDelay(i10).setInterpolator(org.telegram.ui.Components.ds.f27530f).start();
    }

    @Override
    public final void f(Canvas canvas) {
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
    }
}
