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
public final class zi1 implements VoIPService.StateListener, NotificationCenter.NotificationCenterDelegate, rf.a {
    public static zi1 f39355n1;
    public AnimatorSet A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public TextView E;
    public boolean E0;
    public org.telegram.ui.Components.voip.o2 F;
    public float F0;
    public yi1 G;
    public boolean G0;
    public ImageView H;
    public boolean H0;
    public ImageView I;
    public boolean I0;
    public int J;
    public boolean J0;
    public gg.k K;
    public long K0;
    public int L;
    public sg.p1 M;
    public org.telegram.ui.Components.voip.g2 M0;
    public gc1 N;
    public org.telegram.ui.Components.voip.d3 N0;
    public FrameLayout O;
    public org.telegram.ui.Components.voip.d3 O0;
    public org.telegram.ui.Components.voip.q0 P;
    public ValueAnimator P0;
    public org.telegram.ui.Components.voip.n1 Q;
    public bi.w6 R;
    public boolean R0;
    public TextView S;
    public uk T;
    public org.telegram.ui.Components.voip.k U;
    public boolean U0;
    public float V0;
    public float W0;
    public vi1 X;
    public float X0;
    public org.telegram.ui.Components.voip.t1 Y;
    public float Y0;
    public org.telegram.ui.Components.voip.t1 Z;
    public float Z0;
    public final int f39356a;
    public boolean f39357a0;
    public boolean f39358a1;
    public Activity f39359b;
    public TextureViewRenderer f39360b0;
    public float f39361b1;
    public final TLRPC.User f39362c;
    public org.telegram.ui.Components.voip.r2 f39363c0;
    public float f39364c1;
    public final TLRPC.User d;
    public org.telegram.ui.Components.voip.r2 f39365d0;
    public int f39366d1;
    public org.telegram.ui.Components.voip.k3 e;
    public org.telegram.ui.Components.voip.e f39367e0;
    public int f39368e1;
    public org.telegram.ui.Components.voip.k3 f39369f;
    public boolean f39370f0;
    public pf.e f39372g0;
    public boolean f39373g1;
    public org.telegram.ui.Components.voip.k3 h;
    public View f39374h0;
    public boolean f39375h1;
    public View f39376i0;
    public ValueAnimator f39377i1;
    public org.telegram.ui.Components.voip.q1 f39378j0;
    public boolean f39379j1;
    public org.telegram.ui.Components.voip.r2 f39381k1;
    public com.google.android.gms.internal.cast.p l1;
    public boolean m0;
    public boolean f39383m1;
    public wi1 f39384n;
    public boolean f39385n0;
    public si1 f39386o0;
    public int f39387p0;
    public int f39388q0;
    public WindowInsets f39390r0;
    public ui1 f39391s;
    public boolean f39392s0;
    public float f39393t0;
    public ri1 f39394u0;
    public org.telegram.ui.Components.voip.c3 v;
    public int f39395v0;
    public org.telegram.ui.Components.voip.z2 f39396w;
    public AccessibilityManager f39397w0;
    public org.telegram.ui.Components.voip.e3 f39398x;
    public org.telegram.ui.Components.voip.s0 f39400y;
    public boolean f39402z0;
    public final org.telegram.ui.Components.voip.p1 f39389r = new org.telegram.ui.Components.voip.p1();
    public final org.telegram.ui.Components.w9[] V = new org.telegram.ui.Components.w9[4];
    public final Drawable[] W = new Drawable[4];
    public final Paint f39380k0 = new Paint();
    public final Paint f39382l0 = new Paint();
    public boolean f39399x0 = true;
    public float f39401y0 = 1.0f;
    public final AnimationNotificationsLocker L0 = new AnimationNotificationsLocker();
    public final f21 Q0 = new f21(this, 20);
    public final ji1 S0 = new ji1(this, 12);
    public final ji1 T0 = new ji1(this, 13);
    public float f39371f1 = 1.0f;

    public zi1(int i10) {
        this.f39356a = i10;
        this.f39362c = MessagesController.getInstance(i10).getUser(Long.valueOf(UserConfig.getInstance(i10).getClientUserId()));
        VoIPServiceState sharedState = VoIPService.getSharedState();
        if (sharedState == null) {
            return;
        }
        this.d = sharedState.getUser();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().registerStateListener(this);
        }
        sharedState.isOutgoing();
        this.f39388q0 = -1;
        this.f39387p0 = sharedState.getCallState();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.voipServiceCreated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.closeInCallActivity);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.nearEarEvent);
    }

    public static void i(zi1 zi1Var) {
        AndroidUtilities.cancelRunOnUIThread(zi1Var.S0);
        zi1Var.R0 = false;
        if (Build.VERSION.SDK_INT >= 23 && zi1Var.f39359b.checkSelfPermission("android.permission.CAMERA") != 0) {
            zi1Var.f39359b.requestPermissions(new String[]{"android.permission.CAMERA"}, 102);
        } else {
            zi1Var.C();
        }
    }

    public static void j(zi1 zi1Var) {
        zi1 zi1Var2;
        if (zi1Var.f39373g1) {
            zi1Var.f39373g1 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            zi1Var.f39377i1 = ofFloat;
            zi1Var2 = zi1Var;
            ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.w(zi1Var2, zi1Var.f39371f1, zi1Var.Y0, zi1Var.Z0, 1));
            zi1Var2.f39377i1.addListener(new ni1(zi1Var2, 0));
            zi1Var2.f39377i1.setDuration(350L);
            zi1Var2.f39377i1.setInterpolator(org.telegram.ui.Components.wr.f28819f);
            zi1Var2.f39377i1.start();
        } else {
            zi1Var2 = zi1Var;
        }
        zi1Var2.f39375h1 = false;
        zi1Var2.f39358a1 = false;
    }

    public static void q(int i10, int[] iArr) {
        zi1 zi1Var = f39355n1;
        if (zi1Var != null) {
            if (i10 == 101) {
                if (VoIPService.getSharedState() == null) {
                    zi1Var.f39394u0.b();
                    return;
                } else if (iArr.length > 0 && iArr[0] == 0) {
                    zi1Var.r(new org.telegram.ui.Components.c30(27));
                } else if (!zi1Var.f39359b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                    if (VoIPService.getSharedState() != null) {
                        VoIPService.getSharedState().declineIncomingCall();
                    }
                    org.telegram.ui.Components.voip.e2.h(zi1Var.f39359b, new ji1(zi1Var, 2), i10);
                    return;
                }
            }
            if (i10 == 102) {
                if (VoIPService.getSharedState() == null) {
                    zi1Var.f39394u0.b();
                } else if (iArr.length > 0 && iArr[0] == 0) {
                    zi1Var.C();
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
        zi1 zi1Var = f39355n1;
        if (zi1Var != null && zi1Var.f39394u0.getParent() == null) {
            zi1 zi1Var2 = f39355n1;
            if (zi1Var2 != null) {
                zi1Var2.f39363c0.d.release();
                f39355n1.f39365d0.d.release();
                f39355n1.f39360b0.release();
                ri1 ri1Var = f39355n1.f39394u0;
                if (ri1Var != null) {
                    ri1Var.d();
                }
                f39355n1.l();
            }
            f39355n1 = null;
        }
        if (f39355n1 == null && !activity.isFinishing()) {
            if (org.telegram.ui.Components.voip.l2.k() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (VoIPService.getSharedState() != null && VoIPService.getSharedState().getUser() != null) {
                zi1 zi1Var3 = new zi1(i10);
                zi1Var3.f39359b = activity;
                f39355n1 = zi1Var3;
                ri1 ri1Var2 = new ri1(activity, !z10, zi1Var3);
                f39355n1.J0 = ((KeyguardManager) activity.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
                ((PowerManager) activity.getSystemService("power")).isInteractive();
                f39355n1.getClass();
                ri1Var2.setLockOnScreen(f39355n1.J0);
                zi1Var3.f39394u0 = ri1Var2;
                hi1 hi1Var = new hi1(zi1Var3, 4);
                WeakHashMap weakHashMap = r0.i0.f41062a;
                r0.a0.j(ri1Var2, hi1Var);
                ((WindowManager) activity.getSystemService("window")).addView(ri1Var2, org.telegram.ui.Components.voip.w2.a());
                zi1Var3.f39393t0 = ViewConfiguration.get(activity).getScaledTouchSlop();
                zi1Var3.f39397w0 = (AccessibilityManager) f0.e.f(activity, AccessibilityManager.class);
                ui1 ui1Var = new ui1(zi1Var3, activity);
                ui1Var.setClipToPadding(false);
                ui1Var.setClipChildren(false);
                ui1Var.setBackgroundColor(-16777216);
                zi1Var3.G();
                zi1Var3.f39391s = ui1Var;
                VoIPServiceState sharedState = VoIPService.getSharedState();
                if (sharedState != null && sharedState.isConference()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.Components.voip.p1 p1Var = zi1Var3.f39389r;
                zi1Var3.v = new org.telegram.ui.Components.voip.c3(activity, z11, p1Var);
                org.telegram.ui.Components.voip.r2 r2Var = new org.telegram.ui.Components.voip.r2(activity, false, true, false, false);
                zi1Var3.f39363c0 = r2Var;
                RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
                r2Var.d.setScalingType(scalingType);
                zi1Var3.f39363c0.d.setEnableHardwareScaler(true);
                zi1Var3.f39363c0.d.setRotateTextureWithScreen(true);
                zi1Var3.f39363c0.f28373a0 = 1;
                ui1Var.addView(zi1Var3.v, w7.a6.c(-1.0f, -1));
                TLRPC.User user = zi1Var3.d;
                org.telegram.ui.Components.voip.z2 z2Var = new org.telegram.ui.Components.voip.z2(activity, user, p1Var);
                zi1Var3.f39396w = z2Var;
                ui1Var.addView(z2Var, w7.a6.c(-1.0f, -1));
                ?? view = new View(activity);
                if (LiteMode.isEnabled(512)) {
                    int i12 = org.telegram.ui.ActionBar.j6.f17865a;
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(System.currentTimeMillis());
                    int i13 = calendar.get(2);
                    int i14 = calendar.get(5);
                    calendar.get(12);
                    calendar.get(11);
                    if ((i13 == 11 && i14 >= 24 && i14 <= 31) || (i13 == 0 && i14 == 1)) {
                        view.f28116a = new org.telegram.ui.Components.lw0(0);
                    }
                }
                zi1Var3.f39398x = view;
                ui1Var.addView((View) view, w7.a6.c(220.0f, -1));
                ui1Var.addView(zi1Var3.f39363c0);
                GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                new org.telegram.ui.Components.v9(orientation, new int[]{-14994098, -14328963}).f(o0.b.u(0.5f, 1), new id1(zi1Var3, 1), 0L);
                org.telegram.ui.Components.voip.t1 t1Var = new org.telegram.ui.Components.voip.t1(activity);
                zi1Var3.Y = t1Var;
                t1Var.setDelegate(new hi1(zi1Var3, 3));
                zi1Var3.Y.d(1.0f, 1.0f);
                zi1Var3.f39357a0 = true;
                org.telegram.ui.Components.voip.r2 r2Var2 = new org.telegram.ui.Components.voip.r2(activity, true, false);
                zi1Var3.f39365d0 = r2Var2;
                r2Var2.d.setIsCamera(true);
                zi1Var3.f39365d0.d.setUseCameraRotation(true);
                zi1Var3.Y.setOnTapListener(new ki1(zi1Var3, 1));
                zi1Var3.f39365d0.d.setMirror(true);
                zi1Var3.Y.addView(zi1Var3.f39365d0);
                org.telegram.ui.Components.voip.t1 t1Var2 = new org.telegram.ui.Components.voip.t1(activity);
                zi1Var3.Z = t1Var2;
                t1Var2.S = true;
                t1Var2.c(true, false);
                TextureViewRenderer textureViewRenderer = new TextureViewRenderer(activity);
                zi1Var3.f39360b0 = textureViewRenderer;
                textureViewRenderer.setEnableHardwareScaler(true);
                zi1Var3.f39360b0.setIsCamera(false);
                zi1Var3.f39360b0.setFpsReduction(30.0f);
                zi1Var3.f39360b0.setScalingType(scalingType);
                zi1Var3.Z.addView(zi1Var3.f39360b0, w7.a6.e(-1, -2, 17));
                zi1Var3.Z.setOnTapListener(new ki1(zi1Var3, 2));
                zi1Var3.Z.setVisibility(8);
                ui1Var.addView(zi1Var3.Y, w7.a6.c(-2.0f, -2));
                ui1Var.addView(zi1Var3.Z);
                View view2 = new View(activity);
                zi1Var3.f39374h0 = view2;
                view2.setBackground(new GradientDrawable(orientation, new int[]{0, i0.a.k(-16777216, 127)}));
                ui1Var.addView(zi1Var3.f39374h0, w7.a6.e(-1, 160, 80));
                View view3 = new View(activity);
                zi1Var3.f39376i0 = view3;
                view3.setBackground(new GradientDrawable(orientation, new int[]{i0.a.k(-16777216, 102), 0}));
                ui1Var.addView(zi1Var3.f39376i0, w7.a6.e(-1, 160, 48));
                gc1 gc1Var = new gc1(zi1Var3, activity, 16);
                zi1Var3.N = gc1Var;
                gc1Var.setOrientation(0);
                zi1Var3.N.setPadding(0, 0, 0, AndroidUtilities.dp(30.0f));
                zi1Var3.N.setClipToPadding(false);
                zi1Var3.N.setContentDescription(LocaleController.getString(R.string.VoipHintEncryptionKey));
                zi1Var3.N.setOnClickListener(new ki1(zi1Var3, 3));
                zi1Var3.P = new org.telegram.ui.Components.voip.q0(activity, p1Var);
                FrameLayout frameLayout = new FrameLayout(activity);
                zi1Var3.O = frameLayout;
                frameLayout.addView(zi1Var3.P, w7.a6.d(-2, -2.0f, 3, 0.0f, 16.0f, 0.0f, 0.0f));
                zi1Var3.O.setVisibility(8);
                zi1Var3.O.setOnClickListener(new ki1(zi1Var3, 4));
                bi.w6 w6Var = new bi.w6(activity, p1Var);
                zi1Var3.R = w6Var;
                w6Var.setOrientation(1);
                TextView textView = new TextView(activity);
                zi1Var3.S = textView;
                textView.setText(LocaleController.getString(R.string.VoipCallEncryptionEndToEnd));
                zi1Var3.S.setTextSize(1, 15.0f);
                zi1Var3.S.setTypeface(AndroidUtilities.bold());
                zi1Var3.S.setTextColor(-1);
                zi1Var3.S.setGravity(17);
                uk ukVar = new uk(zi1Var3, activity, 5);
                zi1Var3.T = ukVar;
                ukVar.setTextSize(1, 15.0f);
                zi1Var3.T.setTextColor(-1);
                zi1Var3.T.setGravity(17);
                zi1Var3.T.setText(LocaleController.formatString("CallEmojiKeyTooltip", R.string.CallEmojiKeyTooltip, TextUtils.ellipsize(UserObject.getFirstName(user), zi1Var3.T.getPaint(), AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END)));
                zi1Var3.R.setVisibility(8);
                zi1Var3.R.addView(zi1Var3.S);
                zi1Var3.R.addView(zi1Var3.T, w7.a6.k(0.0f, 8.0f, 0.0f, 0.0f, -2, -2));
                zi1Var3.R.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(80.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
                for (int i15 = 0; i15 < 4; i15++) {
                    org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(activity);
                    org.telegram.ui.Components.w9[] w9VarArr = zi1Var3.V;
                    w9VarArr[i15] = w9Var;
                    w9VarArr[i15].getImageReceiver().setAspectFit(true);
                    gc1 gc1Var2 = zi1Var3.N;
                    org.telegram.ui.Components.w9 w9Var2 = w9VarArr[i15];
                    if (i15 == 0) {
                        f7 = 0.0f;
                    } else {
                        f7 = 6.0f;
                    }
                    gc1Var2.addView(w9Var2, w7.a6.k(f7, 0.0f, 0.0f, 0.0f, 25, 25));
                }
                vi1 vi1Var = new vi1(zi1Var3, activity);
                zi1Var3.X = vi1Var;
                vi1Var.setOrientation(1);
                zi1Var3.X.setFocusable(true);
                zi1Var3.X.setFocusableInTouchMode(true);
                zi1Var3.f39400y = new org.telegram.ui.Components.voip.s0(activity);
                org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
                g9Var.r(user);
                org.telegram.ui.Components.voip.s0 s0Var = zi1Var3.f39400y;
                int i16 = zi1Var3.f39356a;
                s0Var.f28399b.h(ImageLocation.getForUserOrChat(i16, user, 0), null, g9Var, user);
                zi1Var3.f39400y.setRoundRadius(AndroidUtilities.dp(135.0f) / 2);
                TextView textView2 = new TextView(activity);
                zi1Var3.E = textView2;
                textView2.setTextSize(1, 28.0f);
                zi1Var3.E.setText(Emoji.replaceEmoji(ContactsController.formatName(user.first_name, user.last_name), zi1Var3.E.getPaint().getFontMetricsInt(), false));
                zi1Var3.E.setMaxLines(2);
                zi1Var3.E.setEllipsize(TextUtils.TruncateAt.END);
                zi1Var3.E.setTextColor(-1);
                zi1Var3.E.setGravity(1);
                zi1Var3.E.setImportantForAccessibility(2);
                zi1Var3.X.addView(zi1Var3.E, w7.a6.t(-2, -2, 1, 8, 0, 8, 6));
                ?? frameLayout2 = new FrameLayout(activity);
                frameLayout2.f28307a = new TextView[2];
                int i17 = 0;
                for (int i18 = 2; i17 < i18; i18 = 2) {
                    frameLayout2.f28307a[i17] = new TextView(activity);
                    frameLayout2.f28307a[i17].setTextSize(1, 15.0f);
                    frameLayout2.f28307a[i17].setTextColor(-1);
                    frameLayout2.f28307a[i17].setGravity(1);
                    frameLayout2.addView(frameLayout2.f28307a[i17]);
                    i17++;
                }
                FrameLayout frameLayout3 = new FrameLayout(activity);
                frameLayout2.f28309c = frameLayout3;
                org.telegram.ui.Components.voip.m2 m2Var = new org.telegram.ui.Components.voip.m2(frameLayout2, activity, p1Var);
                m2Var.setTextSize(1, 15.0f);
                m2Var.setTextColor(-1);
                m2Var.setGravity(1);
                m2Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(2.0f));
                m2Var.setText(LocaleController.getString(R.string.VoipWeakNetwork));
                frameLayout3.addView(m2Var, w7.a6.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                frameLayout3.setVisibility(8);
                frameLayout2.addView(frameLayout3, w7.a6.d(-1, -2.0f, 0, 0.0f, 44.0f, 0.0f, 0.0f));
                TextView textView3 = new TextView(activity);
                frameLayout2.f28308b = textView3;
                textView3.setTextSize(1, 15.0f);
                textView3.setTextColor(-1);
                textView3.setGravity(1);
                frameLayout2.addView(textView3, w7.a6.d(-1, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.VoipReconnecting));
                SpannableString spannableString = new SpannableString(".");
                spannableString.setSpan(new gg.f2(new View[]{textView3}), 0, 1, 33);
                spannableStringBuilder.append((CharSequence) spannableString);
                textView3.setText(spannableStringBuilder);
                textView3.setVisibility(8);
                org.telegram.ui.Components.voip.s2 s2Var = new org.telegram.ui.Components.voip.s2(activity);
                frameLayout2.d = s2Var;
                frameLayout2.addView(s2Var, w7.a6.c(-2.0f, -1));
                zi1Var3.F = frameLayout2;
                WeakHashMap weakHashMap2 = r0.i0.f41062a;
                frameLayout2.setImportantForAccessibility(4);
                zi1Var3.X.addView(zi1Var3.F, w7.a6.t(-2, -2, 1, 0, 0, 0, 6));
                if (sharedState != null && sharedState.getUser() != null && sharedState.isConference() && sharedState.getGroupCall() != null) {
                    yi1 yi1Var = new yi1(activity);
                    zi1Var3.G = yi1Var;
                    long j3 = sharedState.getUser().f17342id;
                    ArrayList<TLRPC.GroupCallParticipant> groupParticipants = sharedState.getGroupParticipants();
                    int i19 = sharedState.getGroupCall().participants_count;
                    if (groupParticipants == null && i19 <= 0) {
                        yi1Var.setVisibility(8);
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
                        org.telegram.ui.Components.i9 i9Var = yi1Var.f39013b;
                        i9Var.k(min);
                        int i20 = 0;
                        while (i20 < min) {
                            i9Var.l(i20, MessagesController.getInstance(i16).getUserOrChat(DialogObject.getPeerDialogId(groupParticipants.get(i20).peer)), i16);
                            i20++;
                            j3 = j3;
                        }
                        long j10 = j3;
                        i9Var.b(false, true);
                        if (max == 1 && (groupParticipants == null || groupParticipants.size() == 0 || (groupParticipants.size() == 1 && DialogObject.getPeerDialogId(groupParticipants.get(0).peer) == j10))) {
                            yi1Var.setVisibility(8);
                        } else {
                            yi1Var.f39014c = new org.telegram.ui.Components.t01(LocaleController.formatPluralStringComma("Participants", max), 14.0f, AndroidUtilities.bold());
                            yi1Var.setVisibility(0);
                            yi1Var.invalidate();
                        }
                    }
                    zi1Var3.X.addView(zi1Var3.G, w7.a6.k(0.0f, 22.0f, 0.0f, 0.0f, -1, 30));
                }
                zi1Var3.X.setClipChildren(false);
                zi1Var3.X.setClipToPadding(false);
                zi1Var3.X.setPadding(0, 0, 0, AndroidUtilities.dp(15.0f));
                zi1Var3.U = new org.telegram.ui.Components.voip.k(activity);
                zi1Var3.Q = new org.telegram.ui.Components.voip.n1(activity, p1Var);
                zi1Var3.U.setAlpha(0.0f);
                zi1Var3.Q.setVisibility(8);
                ui1Var.addView(zi1Var3.f39400y, w7.a6.d(204, 204.0f, 1, 0.0f, 93.0f, 0.0f, 0.0f));
                ui1Var.addView(zi1Var3.X, w7.a6.d(-1, -2.0f, 0, 0.0f, 135.0f, 0.0f, 0.0f));
                ui1Var.addView(zi1Var3.O, w7.a6.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                ui1Var.addView(zi1Var3.R, w7.a6.d(304, -2.0f, 49, 0.0f, 118.0f, 0.0f, 0.0f));
                ui1Var.addView(zi1Var3.N, w7.a6.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                ui1Var.addView(zi1Var3.U, w7.a6.d(-1, 52.0f, 5, 0.0f, 0.0f, 0.0f, 0.0f));
                ui1Var.addView(zi1Var3.Q, w7.a6.d(-1, -2.0f, 3, 0.0f, 380.0f, 0.0f, 0.0f));
                zi1Var3.f39378j0 = new org.telegram.ui.Components.voip.q1(activity);
                zi1Var3.e = new org.telegram.ui.Components.voip.k3(activity, p1Var);
                zi1Var3.f39369f = new org.telegram.ui.Components.voip.k3(activity, p1Var);
                zi1Var3.h = new org.telegram.ui.Components.voip.k3(activity, p1Var);
                zi1Var3.f39384n = new org.telegram.ui.Components.voip.u2(activity, 52.0f);
                zi1Var3.e.setTranslationY(AndroidUtilities.dp(100.0f));
                zi1Var3.e.setScaleX(0.0f);
                zi1Var3.e.setScaleY(0.0f);
                zi1Var3.e.animate().setStartDelay(150).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                zi1Var3.f39369f.setTranslationY(AndroidUtilities.dp(100.0f));
                zi1Var3.f39369f.setScaleX(0.0f);
                zi1Var3.f39369f.setScaleY(0.0f);
                zi1Var3.f39369f.animate().setStartDelay(166).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                zi1Var3.h.setTranslationY(AndroidUtilities.dp(100.0f));
                zi1Var3.h.setScaleX(0.0f);
                zi1Var3.h.setScaleY(0.0f);
                zi1Var3.h.animate().setStartDelay(182).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                zi1Var3.f39384n.setTranslationY(AndroidUtilities.dp(100.0f));
                zi1Var3.f39384n.setScaleX(0.0f);
                zi1Var3.f39384n.setScaleY(0.0f);
                zi1Var3.f39384n.animate().setStartDelay(198).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                zi1Var3.f39378j0.addView(zi1Var3.e);
                zi1Var3.f39378j0.addView(zi1Var3.f39369f);
                zi1Var3.f39378j0.addView(zi1Var3.h);
                zi1Var3.f39378j0.addView(zi1Var3.f39384n);
                org.telegram.ui.Components.voip.e eVar = new org.telegram.ui.Components.voip.e(activity);
                zi1Var3.f39367e0 = eVar;
                eVar.setListener(new xi1(zi1Var3));
                zi1Var3.f39367e0.setScaleX(1.15f);
                zi1Var3.f39367e0.setScaleY(1.15f);
                ui1Var.addView(zi1Var3.f39378j0, w7.a6.e(-1, -2, 80));
                if (AndroidUtilities.isTablet()) {
                    i11 = 100;
                } else {
                    i11 = 27;
                }
                float f10 = i11;
                ui1Var.addView(zi1Var3.f39367e0, w7.a6.d(-1, 186.0f, 80, f10, 0.0f, f10, 0.0f));
                ImageView imageView = new ImageView(activity);
                zi1Var3.I = imageView;
                imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(i0.a.k(-1, 76), 1, -1));
                zi1Var3.I.setImageResource(R.drawable.msg_addcontact);
                zi1Var3.I.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                ui1Var.addView(zi1Var3.I, w7.a6.e(56, 56, 53));
                w7.c6.a(zi1Var3.I);
                ImageView imageView2 = new ImageView(activity);
                zi1Var3.H = imageView2;
                imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(i0.a.k(-1, 76), 1, -1));
                zi1Var3.H.setImageResource(R.drawable.msg_call_minimize_shadow);
                zi1Var3.H.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                zi1Var3.H.setContentDescription(LocaleController.getString(R.string.Back));
                ui1Var.addView(zi1Var3.H, w7.a6.e(56, 56, 51));
                w7.c6.a(zi1Var3.H);
                gg.k kVar = new gg.k(activity, 5);
                zi1Var3.K = kVar;
                kVar.setContentDescription(LocaleController.getString(R.string.VoipSpeaker));
                zi1Var3.K.setBackground(org.telegram.ui.ActionBar.j6.f0(i0.a.k(-1, 76), 1, -1));
                zi1Var3.K.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
                ui1Var.addView(zi1Var3.K, w7.a6.d(56, 56.0f, 53, 0.0f, 56.0f, 0.0f, 0.0f));
                zi1Var3.K.setAlpha(0.0f);
                zi1Var3.K.setOnClickListener(new ki1(zi1Var3, 5));
                zi1Var3.H.setOnClickListener(new ki1(zi1Var3, 6));
                zi1Var3.I.setOnClickListener(new w71(7, zi1Var3, activity));
                if (zi1Var3.f39394u0.f28522b) {
                    zi1Var3.H.setVisibility(8);
                    zi1Var3.I.setVisibility(8);
                }
                ?? linearLayout = new LinearLayout(activity);
                linearLayout.f28136a = new HashMap();
                linearLayout.f28137b = new ArrayList();
                linearLayout.f28138c = new ArrayList();
                TextPaint textPaint = new TextPaint();
                linearLayout.f28141r = textPaint;
                linearLayout.setOrientation(1);
                linearLayout.f28140n = p1Var;
                TransitionSet transitionSet = new TransitionSet();
                linearLayout.d = transitionSet;
                transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(200L)).addTransition(new org.telegram.ui.ActionBar.o0(3).setDuration(200L));
                transitionSet.setOrdering(0);
                textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                zi1Var3.M0 = linearLayout;
                linearLayout.setGravity(80);
                zi1Var3.M0.setOnViewsUpdated(new ji1(zi1Var3, 5));
                ui1Var.addView(zi1Var3.M0, w7.a6.d(-1, 200.0f, 80, 16.0f, 0.0f, 16.0f, 0.0f));
                org.telegram.ui.Components.voip.d3 d3Var = new org.telegram.ui.Components.voip.d3(activity, 3, p1Var, true);
                d3Var.p(true);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                d3Var.K = alignment;
                d3Var.d = -1L;
                d3Var.f3890l0 = new ji1(zi1Var3, 6);
                d3Var.T = true;
                d3Var.h = AndroidUtilities.dp(320.0f);
                d3Var.e = true;
                d3Var.k(10.0f, 6.0f, 10.0f, 6.0f);
                d3Var.q(8.0f);
                zi1Var3.N0 = d3Var;
                d3Var.s(LocaleController.getString(R.string.TapToTurnCamera));
                ui1Var.addView(zi1Var3.N0, w7.a6.d(-2, -2.0f, 80, 19.0f, 0.0f, 19.0f, 0.0f));
                org.telegram.ui.Components.voip.d3 d3Var2 = new org.telegram.ui.Components.voip.d3(activity, 1, p1Var, false);
                d3Var2.p(true);
                d3Var2.K = alignment;
                d3Var2.d = 4000L;
                d3Var2.T = true;
                d3Var2.h = AndroidUtilities.dp(320.0f);
                d3Var2.e = true;
                d3Var2.k(10.0f, 6.0f, 10.0f, 6.0f);
                d3Var2.q(8.0f);
                zi1Var3.O0 = d3Var2;
                d3Var2.s(LocaleController.getString(R.string.VoipHintEncryptionKey));
                ui1Var.addView(zi1Var3.O0, w7.a6.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                zi1Var3.H();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (!zi1Var3.U0) {
                        TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                        if (phoneCall != null && phoneCall.video) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        zi1Var3.U0 = z12;
                    }
                    zi1Var3.o();
                }
                ri1Var2.addView(ui1Var);
                if (z10) {
                    zi1Var3.F0 = 0.0f;
                    zi1Var3.I0 = true;
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                        zi1Var3.f39363c0.setStub(org.telegram.ui.Components.voip.l2.k().f28232r);
                        zi1Var3.f39365d0.setStub(org.telegram.ui.Components.voip.l2.k().f28231n);
                    }
                    zi1Var3.f39394u0.setAlpha(0.0f);
                    zi1Var3.H();
                    zi1Var3.E0 = true;
                    org.telegram.ui.Components.voip.l2.T = true;
                    if (org.telegram.ui.Components.voip.l2.V == null) {
                        zi1Var3.L0.lock();
                        AndroidUtilities.runOnUIThread(new ji1(zi1Var3, 11), 32L);
                    } else {
                        org.telegram.ui.Components.voip.l2.U.getClass();
                        throw null;
                    }
                } else {
                    zi1Var3.F0 = 1.0f;
                    zi1Var3.G();
                }
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null && sharedInstance3.getRemoteVideoState() == 2 && sf.c.a(activity) == 1) {
                    zi1 zi1Var4 = f39355n1;
                    pf.d dVar = new pf.d(activity, zi1Var4);
                    dVar.f39911c = "voip-fragment-pip";
                    org.telegram.ui.Components.voip.r2 r2Var3 = zi1Var4.f39363c0;
                    dVar.f39915j = r2Var3.d;
                    dVar.f39916k = r2Var3.getPlaceholderView();
                    zi1Var4.f39372g0 = dVar.a();
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
        f21 f21Var = this.Q0;
        int i11 = 0;
        if (!z10 && this.f39399x0) {
            ViewPropertyAnimator duration = this.K.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L);
            org.telegram.ui.Components.wr wrVar = org.telegram.ui.Components.wr.f28819f;
            duration.setInterpolator(wrVar).start();
            this.H.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(wrVar).start();
            this.I.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(wrVar).start();
            this.N.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(wrVar).start();
            this.E.animate().alpha(0.0f).setDuration(150L).translationY(-AndroidUtilities.dp(10.0f)).setInterpolator(wrVar).start();
            this.F.animate().alpha(0.0f).setDuration(150L).translationY(-AndroidUtilities.dp(10.0f)).setInterpolator(wrVar).start();
            this.f39378j0.animate().alpha(0.0f).translationY(AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(wrVar).start();
            this.f39374h0.animate().alpha(0.0f).setDuration(150L).setInterpolator(wrVar).start();
            this.f39376i0.animate().alpha(0.0f).setDuration(150L).setInterpolator(wrVar).start();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f39401y0, 0.0f);
            this.P0 = ofFloat;
            ofFloat.addUpdateListener(f21Var);
            this.P0.setDuration(150L).setInterpolator(wrVar);
            this.P0.start();
            AndroidUtilities.cancelRunOnUIThread(this.S0);
            this.R0 = false;
            this.f39378j0.setEnabled(false);
            this.O0.e(true);
            i10 = 150;
        } else {
            if (z10 && !this.f39399x0) {
                this.N0.e(true);
                this.O0.e(true);
                ViewPropertyAnimator translationY = this.E.animate().alpha(1.0f).setDuration(150L).translationY(0.0f);
                org.telegram.ui.Components.wr wrVar2 = org.telegram.ui.Components.wr.f28819f;
                translationY.setInterpolator(wrVar2).start();
                this.F.animate().alpha(1.0f).setDuration(150L).translationY(0.0f).setInterpolator(wrVar2).start();
                this.K.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(wrVar2).start();
                this.H.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(wrVar2).start();
                this.I.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(wrVar2).start();
                this.N.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(wrVar2).start();
                this.f39378j0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(wrVar2).start();
                this.f39374h0.animate().alpha(1.0f).setDuration(150L).setInterpolator(wrVar2).start();
                this.f39376i0.animate().alpha(1.0f).setDuration(150L).setInterpolator(wrVar2).start();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f39401y0, 1.0f);
                this.P0 = ofFloat2;
                ofFloat2.addUpdateListener(f21Var);
                this.P0.setDuration(150L).setInterpolator(wrVar2);
                this.P0.start();
                this.f39378j0.setEnabled(true);
            }
            i10 = 0;
        }
        this.f39399x0 = z10;
        ri1 ri1Var = this.f39394u0;
        if (!z10) {
            ri1Var.setSystemUiVisibility(ri1Var.getSystemUiVisibility() | 4);
        } else {
            ri1Var.setSystemUiVisibility(ri1Var.getSystemUiVisibility() & (-5));
        }
        ViewPropertyAnimator animate = this.M0.animate();
        int i12 = -AndroidUtilities.dp(16.0f);
        if (this.f39399x0) {
            i11 = AndroidUtilities.dp(80.0f);
        }
        animate.translationY(i12 - i11).setDuration(150L).setStartDelay(i10).setInterpolator(org.telegram.ui.Components.wr.f28819f).start();
    }

    public final void B() {
        if (VoIPService.getSharedInstance() != null) {
            ji1 ji1Var = this.S0;
            AndroidUtilities.cancelRunOnUIThread(ji1Var);
            this.R0 = false;
            if (this.f39402z0 && this.f39399x0) {
                AndroidUtilities.runOnUIThread(ji1Var, 3000L);
                this.R0 = true;
            }
        }
    }

    public final void C() {
        String string;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (this.f39397w0.isTouchExplorationEnabled()) {
                if (!this.f39385n0) {
                    string = LocaleController.getString(R.string.AccDescrVoipCamOn);
                } else {
                    string = LocaleController.getString(R.string.AccDescrVoipCamOff);
                }
                this.f39391s.announceForAccessibility(string);
            }
            if (!this.f39385n0) {
                if (this.f39386o0 == null) {
                    sharedInstance.createCaptureDevice(false);
                    if (!sharedInstance.isFrontFaceCamera()) {
                        sharedInstance.switchCamera();
                    }
                    this.f39394u0.setLockOnScreen(true);
                    int[] iArr = new int[2];
                    this.f39369f.getLocationOnScreen(iArr);
                    si1 si1Var = new si1(this, this.f39391s.getContext(), iArr[0], iArr[1]);
                    this.f39386o0 = si1Var;
                    WindowInsets windowInsets = this.f39390r0;
                    if (windowInsets != null) {
                        si1Var.setBottomPadding(windowInsets.getSystemWindowInsetBottom());
                    }
                    this.f39391s.addView(this.f39386o0);
                    return;
                }
                return;
            }
            this.f39365d0.c();
            sharedInstance.setVideoState(false, 0);
            sharedInstance.clearCamera();
            this.f39388q0 = this.f39387p0;
            H();
        }
    }

    public final void D(boolean z10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (z10) {
                TransitionSet transitionSet = new TransitionSet();
                Transition duration = new org.telegram.ui.ActionBar.o0(4).setDuration(250L);
                org.telegram.ui.Components.wr wrVar = org.telegram.ui.Components.wr.f28819f;
                transitionSet.addTransition(duration.setInterpolator(wrVar)).addTransition(new ChangeBounds().setDuration(250L).setInterpolator(wrVar));
                transitionSet.excludeChildren(org.telegram.ui.Components.voip.u2.class, true);
                transitionSet.excludeChildren(org.telegram.ui.Components.voip.k3.class, true);
                TransitionManager.beginDelayedTransition(this.f39378j0, transitionSet);
            }
            int i10 = this.f39387p0;
            if (i10 == 11) {
                this.e.setVisibility(8);
                this.f39369f.setVisibility(8);
                this.h.setVisibility(8);
                this.f39384n.setVisibility(8);
                return;
            }
            int i11 = 0;
            if (i10 != 15 && i10 != 17) {
                if (f39355n1 == null) {
                    return;
                }
                if (!sharedInstance.isScreencast() && (this.f39385n0 || this.m0)) {
                    s(this.e, sharedInstance);
                    if (this.f39399x0) {
                        this.K.setTag(1);
                        this.K.animate().alpha(1.0f).start();
                    }
                } else {
                    u(this.e, sharedInstance);
                    this.K.setTag(null);
                    this.K.animate().alpha(0.0f).start();
                }
                v(this.f39369f, sharedInstance, false);
                t(this.h, sharedInstance, z10);
                this.f39384n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, LocaleController.getString(R.string.VoipEndCall2), false, z10);
                this.f39384n.setOnClickListener(new ki1(this, 0));
            } else {
                TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                if (phoneCall != null && phoneCall.video && i10 == 15) {
                    if (!sharedInstance.isScreencast() && (this.f39385n0 || this.m0)) {
                        s(this.e, sharedInstance);
                        if (this.f39399x0) {
                            this.K.animate().alpha(1.0f).start();
                        }
                    } else {
                        u(this.e, sharedInstance);
                        this.K.animate().alpha(0.0f).start();
                    }
                    v(this.f39369f, sharedInstance, false);
                    t(this.h, sharedInstance, z10);
                } else {
                    this.e.setVisibility(8);
                    this.f39369f.setVisibility(8);
                    this.h.setVisibility(8);
                }
                this.f39384n.setVisibility(8);
            }
            if (this.e.getVisibility() == 0) {
                this.e.f28220f = 0;
                i11 = 16;
            }
            if (this.f39369f.getVisibility() == 0) {
                this.f39369f.f28220f = i11;
                i11 += 16;
            }
            if (this.h.getVisibility() == 0) {
                this.h.f28220f = i11;
                i11 += 16;
            }
            if (this.f39384n.getVisibility() == 0) {
                this.f39384n.F = i11;
            }
            F();
        }
    }

    public final void E(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zi1.E(boolean):void");
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
        this.f39380k0.setColor(i0.a.k(-16777216, (int) (this.f39401y0 * 102.0f * this.F0)));
        this.f39382l0.setColor(i0.a.k(-16777216, (int) (127.5f * this.F0)));
        ui1 ui1Var = this.f39391s;
        if (ui1Var != null) {
            ui1Var.invalidate();
        }
    }

    public final void H() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zi1.H():void");
    }

    @Override
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        this.l1 = pVar;
        org.telegram.ui.Components.voip.r2 r2Var = this.f39363c0;
        if (r2Var != null) {
            r2Var.d.clearFirstFrame();
        }
        this.f39383m1 = true;
        H();
        ((WindowManager) this.f39359b.getSystemService("window")).removeView(this.f39394u0);
        this.f39394u0.invalidate();
    }

    @Override
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        this.l1 = pVar;
        ri1 ri1Var = this.f39394u0;
        ri1Var.getClass();
        ((WindowManager) this.f39359b.getSystemService("window")).addView(ri1Var, org.telegram.ui.Components.voip.w2.a());
        this.f39383m1 = false;
        H();
        this.f39394u0.invalidate();
        org.telegram.ui.Components.voip.r2 r2Var = this.f39381k1;
        if (r2Var != null) {
            r2Var.d.release();
            this.f39381k1 = null;
        }
    }

    @Override
    public final Bitmap c() {
        org.telegram.ui.Components.voip.r2 r2Var = this.f39381k1;
        if (r2Var != null && r2Var.d.isAvailable()) {
            return this.f39381k1.d.getBitmap();
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
            if (this.f39387p0 == 17 && VoIPService.getSharedInstance() != null) {
                this.f39365d0.d.release();
                this.f39363c0.d.release();
                this.f39360b0.release();
                o();
                VoIPService.getSharedInstance().registerStateListener(this);
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            E(true);
        } else if (i10 == NotificationCenter.closeInCallActivity) {
            this.f39394u0.b();
        } else if (i10 == NotificationCenter.webRtcSpeakerAmplitudeEvent) {
            this.f39400y.setAmplitude(((Float) objArr[0]).floatValue() * 15.0f);
        } else if (i10 == NotificationCenter.nearEarEvent) {
            boolean booleanValue = ((Boolean) objArr[0]).booleanValue();
            this.f39370f0 = booleanValue;
            if (booleanValue) {
                this.f39400y.b(true, true);
            }
        }
    }

    @Override
    public final Bitmap e() {
        org.telegram.ui.Components.voip.r2 r2Var = this.f39363c0;
        if (r2Var != null && r2Var.d.isAvailable()) {
            return this.f39363c0.d.getBitmap();
        }
        return null;
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final View h() {
        org.telegram.ui.Components.voip.r2 r2Var = new org.telegram.ui.Components.voip.r2(this.f39359b, false, true, false, false);
        this.f39381k1 = r2Var;
        r2Var.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        this.f39381k1.d.setEnableHardwareScaler(true);
        this.f39381k1.d.setRotateTextureWithScreen(true);
        org.telegram.ui.Components.voip.r2 r2Var2 = this.f39381k1;
        r2Var2.f28373a0 = 1;
        r2Var2.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new ti1(this));
        View view = this.f39381k1.h;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.f39381k1;
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
        float f17 = org.telegram.ui.Components.voip.l2.k().d.x + org.telegram.ui.Components.voip.l2.k().f28236y;
        float f18 = org.telegram.ui.Components.voip.l2.k().d.y + org.telegram.ui.Components.voip.l2.k().E;
        final float x10 = this.Y.getX();
        final float y3 = this.Y.getY();
        final float scaleX = this.Y.getScaleX();
        org.telegram.ui.Components.voip.l2.U.getClass();
        final float measuredWidth = f17 - ((this.f39363c0.getMeasuredWidth() - (this.f39363c0.getMeasuredWidth() * 0.25f)) / 2.0f);
        final float measuredHeight2 = f18 - ((this.f39363c0.getMeasuredHeight() - (this.f39363c0.getMeasuredHeight() * 0.25f)) / 2.0f);
        final float f19 = 1.0f;
        if (this.m0) {
            int measuredWidth2 = this.Y.getMeasuredWidth();
            if (this.f39385n0 && measuredWidth2 != 0) {
                f16 = (this.f39394u0.getMeasuredWidth() / measuredWidth2) * 0.25f * 0.4f;
                c10 = 0;
                f15 = (((org.telegram.ui.Components.voip.l2.k().f28230f * 0.25f) + (f17 - ((this.Y.getMeasuredWidth() - (this.Y.getMeasuredWidth() * f16)) / 2.0f))) - ((org.telegram.ui.Components.voip.l2.k().f28230f * 0.25f) * 0.4f)) - AndroidUtilities.dp(4.0f);
                measuredHeight = (((org.telegram.ui.Components.voip.l2.k().h * 0.25f) + (f18 - ((this.Y.getMeasuredHeight() - (this.Y.getMeasuredHeight() * f16)) / 2.0f))) - ((org.telegram.ui.Components.voip.l2.k().h * 0.25f) * 0.4f)) - AndroidUtilities.dp(4.0f);
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
            org.telegram.ui.Components.voip.l2.U.getClass();
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
            this.f39363c0.setScaleX(0.25f);
            this.f39363c0.setScaleY(0.25f);
            this.f39363c0.setTranslationX(measuredWidth);
            this.f39363c0.setTranslationY(measuredHeight2);
            this.f39363c0.setRoundCorners((AndroidUtilities.dp(6.0f) * 1.0f) / 0.25f);
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
                zi1 zi1Var = zi1.this;
                zi1Var.F0 = f23;
                zi1Var.G();
                if (z11) {
                    float f24 = (f10 * floatValue) + (scaleX * f23);
                    zi1Var.Y.setScaleX(f24);
                    zi1Var.Y.setScaleY(f24);
                    zi1Var.Y.setTranslationX((f7 * floatValue) + (x10 * f23));
                    zi1Var.Y.setTranslationY((f21 * floatValue) + (y3 * f23));
                    zi1Var.Y.setCornerRadius((dp * floatValue) + (f22 * f23));
                    zi1Var.Y.setAlpha((f19 * floatValue) + (1.0f * f23));
                }
                float f25 = (r12 * floatValue) + (1.0f * f23);
                zi1Var.f39363c0.setScaleX(f25);
                zi1Var.f39363c0.setScaleY(f25);
                float f26 = 0.0f * f23;
                float f27 = (measuredWidth * floatValue) + f26;
                float f28 = (measuredHeight2 * floatValue) + f26;
                zi1Var.f39363c0.setTranslationX(f27);
                zi1Var.f39363c0.setTranslationY(f28);
                zi1Var.f39363c0.setRoundCorners(((AndroidUtilities.dp(4.0f) * floatValue) * 1.0f) / f25);
                if (!zi1Var.Y.P) {
                    zi1Var.f39365d0.d(floatValue, false);
                }
                zi1Var.f39394u0.invalidate();
            }
        });
        return ofFloat;
    }

    public final void l() {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
        NotificationCenter.getInstance(this.f39356a).removeObserver(this, NotificationCenter.voipServiceCreated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.closeInCallActivity);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.nearEarEvent);
        pf.e eVar = this.f39372g0;
        if (eVar != null) {
            eVar.c();
            this.f39372g0 = null;
        }
        sg.p1 p1Var = this.M;
        if (p1Var != null) {
            p1Var.dismiss();
            this.M = null;
        }
    }

    public final void m(boolean z10) {
        ValueAnimator ofFloat;
        if (this.B0 && this.C0 != z10 && this.f39399x0) {
            this.C0 = z10;
            org.telegram.ui.Components.voip.z2 z2Var = this.f39396w;
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
                z2Var.f28561c = ofFloat;
                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.y2(z2Var, 1));
                z2Var.f28561c.setInterpolator(org.telegram.ui.Components.wr.f28819f);
                z2Var.f28561c.setDuration(200L);
                z2Var.f28561c.start();
            }
            if (z10) {
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(2);
                }
                this.O0.e(true);
                AndroidUtilities.cancelRunOnUIThread(this.S0);
                this.R0 = false;
                if (this.f39400y.getVisibility() == 0) {
                    this.f39400y.animate().setStartDelay(0L).translationY(AndroidUtilities.dp(48.0f)).scaleY(0.1f).scaleX(0.1f).alpha(0.0f).setDuration(200L).setInterpolator(org.telegram.ui.Components.wr.f28819f).start();
                }
                this.O.animate().setListener(null).cancel();
                this.O.setVisibility(0);
                this.O.setAlpha(0.0f);
                this.O.setScaleX(0.3f);
                this.O.setScaleY(0.3f);
                this.O.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(340L).setInterpolator(org.telegram.ui.Components.wr.f28820g).start();
                ViewPropertyAnimator translationY = this.N.animate().scaleX(1.72f).scaleY(1.72f).translationY(AndroidUtilities.dp(140.0f));
                org.telegram.ui.Components.wr wrVar = org.telegram.ui.Components.wr.f28819f;
                org.telegram.messenger.em.q(translationY, wrVar, 400L);
                this.R.animate().setListener(null).cancel();
                this.R.setVisibility(0);
                this.R.setTranslationY(-AndroidUtilities.dp(120.0f));
                this.R.setScaleX(0.7f);
                this.R.setScaleY(0.7f);
                this.R.setAlpha(0.0f);
                this.R.animate().alpha(1.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(400L).setListener(new ni1(this, 3)).setInterpolator(wrVar).start();
            } else {
                if (this.f39400y.getVisibility() == 0) {
                    this.f39400y.animate().setStartDelay(50L).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(250L).setInterpolator(org.telegram.ui.Components.wr.f28819f).start();
                }
                this.O.animate().setListener(null).cancel();
                ViewPropertyAnimator duration = this.O.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(230L);
                org.telegram.ui.Components.wr wrVar2 = org.telegram.ui.Components.wr.f28819f;
                duration.setInterpolator(wrVar2).setListener(new org.telegram.ui.Components.yo(this.O)).start();
                this.N.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(wrVar2).setDuration(280L).start();
                this.R.animate().setListener(null).cancel();
                this.R.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-AndroidUtilities.dp(120.0f)).setListener(new ni1(this, 4)).setDuration(250L).setInterpolator(wrVar2).start();
            }
            this.f39388q0 = this.f39387p0;
            H();
        }
    }

    public final void n() {
        this.f39394u0.b();
    }

    public final void o() {
        this.f39365d0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new oi1(this));
        this.f39363c0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new pi1(this), EglBase.CONFIG_PLAIN, new GlRectDrawer());
        this.f39360b0.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
    }

    @Override
    public final void onAudioSettingsChanged() {
        D(true);
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.x0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
        this.f39388q0 = this.f39387p0;
        H();
    }

    @Override
    public final void onMediaStateUpdated(int i10, int i11) {
        this.f39388q0 = this.f39387p0;
        if (i11 == 2 && !this.U0) {
            this.U0 = true;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.getRemoteVideoState() == 2) {
            if (this.f39372g0 == null && sf.c.a(this.f39359b) == 1) {
                pf.d dVar = new pf.d(this.f39359b, f39355n1);
                dVar.f39911c = "voip-fragment-pip";
                org.telegram.ui.Components.voip.r2 r2Var = this.f39363c0;
                dVar.f39915j = r2Var.d;
                dVar.f39916k = r2Var.getPlaceholderView();
                this.f39372g0 = dVar.a();
            }
        } else {
            pf.e eVar = this.f39372g0;
            if (eVar != null) {
                eVar.c();
                this.f39372g0 = null;
            }
        }
        H();
    }

    @Override
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.ui.Components.voip.c3 c3Var;
        if (i10 > 0) {
            this.f39379j1 = true;
        }
        if (this.F != null && (c3Var = this.v) != null) {
            int i11 = c3Var.V;
            if ((i11 == 2 || i11 == 3) && this.f39379j1) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.zd(this, i10, 27), 400L);
            }
        }
    }

    @Override
    public final void onStateChanged(int i10) {
        int i11 = this.f39387p0;
        if (i11 != i10) {
            this.f39388q0 = i11;
            this.f39387p0 = i10;
            if (this.f39394u0 != null) {
                H();
            }
        }
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        this.f39388q0 = this.f39387p0;
        if (z10 && !this.U0) {
            this.U0 = true;
        }
        H();
    }

    public final void p() {
        if (!this.G0 && !this.E0) {
            si1 si1Var = this.f39386o0;
            if (si1Var != null) {
                si1Var.a(false, false);
            } else if (this.m0 && this.f39385n0 && this.H0) {
                this.H0 = false;
                this.Y.setRelativePosition(this.Z);
                this.f39357a0 = false;
                this.f39388q0 = this.f39387p0;
                H();
            } else if (this.C0) {
                m(false);
            } else if (this.R.getVisibility() == 8) {
                if (this.D0 && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isConverting()) {
                    if (sf.c.a(this.f39359b) > 0) {
                        if (!this.G0 && f39355n1 != null) {
                            this.G0 = true;
                            if (VoIPService.getSharedInstance() != null) {
                                int measuredHeight = f39355n1.f39394u0.getMeasuredHeight();
                                zi1 zi1Var = f39355n1;
                                org.telegram.ui.Components.voip.l2.l(zi1Var.f39359b, zi1Var.f39356a, zi1Var.f39394u0.getMeasuredWidth(), measuredHeight, 1);
                                WindowInsets windowInsets = f39355n1.f39390r0;
                                if (windowInsets != null) {
                                    org.telegram.ui.Components.voip.l2.W = windowInsets.getSystemWindowInsetTop();
                                    f39355n1.f39390r0.getSystemWindowInsetBottom();
                                }
                            }
                            if (org.telegram.ui.Components.voip.l2.k() != null) {
                                ViewPropertyAnimator duration = this.K.animate().alpha(0.0f).setDuration(150L);
                                org.telegram.ui.Components.wr wrVar = org.telegram.ui.Components.wr.f28819f;
                                duration.setInterpolator(wrVar).start();
                                this.H.animate().alpha(0.0f).setDuration(150L).setInterpolator(wrVar).start();
                                this.I.animate().alpha(0.0f).setDuration(150L).setInterpolator(wrVar).start();
                                this.N.animate().alpha(0.0f).setDuration(150L).setInterpolator(wrVar).start();
                                this.X.animate().alpha(0.0f).setDuration(150L).setInterpolator(wrVar).start();
                                this.f39378j0.animate().alpha(0.0f).setDuration(350L).setInterpolator(wrVar).start();
                                this.f39374h0.animate().alpha(0.0f).setDuration(350L).setInterpolator(wrVar).start();
                                this.f39376i0.animate().alpha(0.0f).setDuration(350L).setInterpolator(wrVar).start();
                                this.Z.animate().alpha(0.0f).setDuration(350L).setInterpolator(wrVar).start();
                                this.M0.animate().alpha(0.0f).setDuration(350L).setInterpolator(wrVar).start();
                                org.telegram.ui.Components.voip.l2.T = true;
                                this.E0 = true;
                                ValueAnimator k10 = k(false);
                                this.L0.lock();
                                k10.addListener(new ni1(this, 1));
                                k10.setDuration(350L);
                                k10.setInterpolator(wrVar);
                                k10.start();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Components.d5.B(this.f39359b, new hi1(this, 0), true).o();
                    return;
                }
                this.f39394u0.b();
            }
        }
    }

    public final void r(Runnable runnable) {
        if (this.f39369f.getVisibility() == 0) {
            this.f39367e0.getLocationOnScreen(new int[2]);
            org.telegram.ui.Components.voip.e eVar = this.f39367e0;
            ValueAnimator valueAnimator = eVar.f28105b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                eVar.f28105b0 = null;
                eVar.U.stop();
            }
            runnable.run();
            return;
        }
        this.f39384n.animate().cancel();
        this.e.animate().cancel();
        this.h.animate().cancel();
        this.f39369f.animate().cancel();
        this.f39367e0.getLocationOnScreen(new int[2]);
        org.telegram.ui.Components.voip.e eVar2 = this.f39367e0;
        ValueAnimator valueAnimator2 = eVar2.f28105b0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            eVar2.f28105b0 = null;
            eVar2.U.stop();
        }
        this.f39384n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, LocaleController.getString(R.string.VoipEndCall2), false, false);
        this.e.d(5, false, false);
        this.h.d(1, false, false);
        this.f39369f.d(3, true, false);
        this.f39384n.setVisibility(0);
        this.e.setVisibility(0);
        this.h.setVisibility(0);
        this.f39369f.setVisibility(0);
        this.f39384n.setAlpha(0.0f);
        this.e.setAlpha(0.0f);
        this.h.setAlpha(0.0f);
        this.f39369f.setAlpha(0.0f);
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f39367e0.getLayoutParams();
        final int marginEnd = marginLayoutParams.getMarginEnd();
        AndroidUtilities.dp(52.0f);
        final int dp = AndroidUtilities.dp(24.0f);
        final int dp2 = AndroidUtilities.dp(62.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                zi1 zi1Var = zi1.this;
                zi1Var.getClass();
                float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                zi1Var.f39367e0.setTranslationY(dp2 * floatValue);
                int i10 = marginEnd;
                int i11 = (int) (i10 - ((i10 + dp) * floatValue));
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = i11;
                marginLayoutParams2.rightMargin = i11;
                zi1Var.f39367e0.requestLayout();
            }
        });
        org.telegram.ui.Components.voip.e eVar3 = this.f39367e0;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(eVar3, View.SCALE_X, eVar3.getScaleX(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar4 = this.f39367e0;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(eVar4, View.SCALE_Y, eVar4.getScaleY(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar5 = this.f39367e0;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(eVar5, View.ALPHA, eVar5.getAlpha(), this.f39367e0.getAlpha(), 0.0f, 0.0f));
        animatorSet.setDuration(400L);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.addListener(new org.telegram.ui.Components.vv0(15, this, runnable));
        animatorSet.start();
        AndroidUtilities.runOnUIThread(new ji1(this, 7), 133L);
    }

    public final void s(org.telegram.ui.Components.voip.k3 k3Var, VoIPService voIPService) {
        if (!this.f39385n0) {
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

    public final void t(org.telegram.ui.Components.voip.k3 k3Var, VoIPService voIPService, boolean z10) {
        k3Var.d(1, voIPService.isMicMute(), false);
        org.telegram.ui.Components.voip.t1 t1Var = this.Y;
        boolean isMicMute = voIPService.isMicMute();
        float f7 = 0.0f;
        if (!z10) {
            ValueAnimator valueAnimator = t1Var.f28456f0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (isMicMute) {
                f7 = 1.0f;
            }
            t1Var.K = f7;
            t1Var.invalidate();
        } else {
            ValueAnimator valueAnimator2 = t1Var.f28456f0;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f10 = t1Var.K;
            if (isMicMute) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            t1Var.f28456f0 = ofFloat;
            ofFloat.addUpdateListener(t1Var.f28457g0);
            t1Var.f28456f0.setDuration(150L);
            t1Var.f28456f0.start();
        }
        k3Var.setOnBtnClickedListener(new hi1(this, 5));
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
        k3Var.setOnBtnClickedListener(new ea(this, i10, k3Var, voIPService, 8));
    }

    public final void v(org.telegram.ui.Components.voip.k3 k3Var, VoIPService voIPService, boolean z10) {
        boolean z11;
        if (!this.f39385n0 && !this.m0) {
            z11 = voIPService.isVideoAvailable();
        } else {
            z11 = true;
        }
        if (z11) {
            if (this.f39385n0) {
                if (voIPService.isScreencast()) {
                    k3Var.d(3, false, z10);
                } else {
                    k3Var.d(3, false, z10);
                }
            } else {
                k3Var.d(3, true, z10);
            }
            k3Var.setOnBtnClickedListener(new hi1(this, 6));
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
        if (!this.f39385n0 && !this.m0) {
            z12 = true;
        } else {
            z12 = false;
        }
        Integer num = null;
        if (z10) {
            if (z12 && this.f39400y.getTag() == null) {
                this.f39400y.animate().setListener(null).cancel();
                this.f39400y.setVisibility(0);
                if (!this.C0) {
                    if (z11) {
                        this.f39400y.setAlpha(0.0f);
                        this.f39400y.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.wr.f28819f).start();
                    } else {
                        this.f39400y.setAlpha(0.0f);
                        this.f39400y.setTranslationY(-AndroidUtilities.dp(135.0f));
                        this.f39400y.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.wr.f28819f).start();
                    }
                } else if (z11) {
                    this.f39400y.setAlpha(0.0f);
                    this.f39400y.setTranslationY(AndroidUtilities.dp(48.0f));
                    this.f39400y.setScaleX(0.1f);
                    this.f39400y.setScaleY(0.1f);
                }
            } else if (!z12 && this.f39400y.getTag() != null) {
                this.f39400y.animate().setListener(null).cancel();
                this.f39400y.setTranslationY(0.0f);
                this.f39400y.animate().alpha(0.0f).setDuration(150L).scaleX(0.1f).scaleY(0.1f).setInterpolator(org.telegram.ui.Components.wr.f28819f).setListener(new ni1(this, 7)).start();
            }
        } else {
            this.f39400y.animate().setListener(null).cancel();
            this.f39400y.setTranslationY(0.0f);
            this.f39400y.setAlpha(1.0f);
            this.f39400y.setScaleX(1.0f);
            this.f39400y.setScaleY(1.0f);
            org.telegram.ui.Components.voip.s0 s0Var = this.f39400y;
            if (!z12) {
                i10 = 8;
            }
            s0Var.setVisibility(i10);
        }
        org.telegram.ui.Components.voip.s0 s0Var2 = this.f39400y;
        if (z12) {
            num = 1;
        }
        s0Var2.setTag(num);
    }

    public final void y(CharSequence charSequence) {
        TextView textView;
        if (this.f39359b.isFinishing()) {
            return;
        }
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(this.f39359b, 0, null);
        boolean[] zArr = new boolean[3];
        d2Var.R = LocaleController.getString(R.string.VoipFailed);
        d2Var.T = charSequence;
        d2Var.f17626l0 = LocaleController.getString(R.string.OK);
        d2Var.m0 = null;
        d2Var.show();
        for (int i10 = 0; i10 < 3; i10++) {
            if (zArr[i10] && (textView = (TextView) d2Var.d(-(i10 + 1))) != null) {
                textView.setTextColor(d2Var.e(org.telegram.ui.ActionBar.j6.f18162q7));
            }
        }
        d2Var.setCanceledOnTouchOutside(true);
        d2Var.setOnDismissListener(new s5(this, 19));
    }

    public final void z(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        AnimatorSet animatorSet;
        if (this.Y.getTag() == null || ((Integer) this.Y.getTag()).intValue() != 2) {
            this.Y.setUiVisible(this.f39399x0);
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
                    org.telegram.ui.Components.voip.t1 t1Var = this.Y;
                    animatorSet3.playTogether(ObjectAnimator.ofFloat(t1Var, View.ALPHA, t1Var.getAlpha(), 0.0f));
                    if (this.Y.getTag() != null && ((Integer) this.Y.getTag()).intValue() == 2) {
                        org.telegram.ui.Components.voip.t1 t1Var2 = this.Y;
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(t1Var2, View.SCALE_X, t1Var2.getScaleX(), 0.7f);
                        org.telegram.ui.Components.voip.t1 t1Var3 = this.Y;
                        animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(t1Var3, View.SCALE_Y, t1Var3.getScaleX(), 0.7f));
                    }
                    this.A0 = animatorSet3;
                    animatorSet3.addListener(new ni1(this, 6));
                    this.A0.setDuration(250L).setInterpolator(org.telegram.ui.Components.wr.f28819f);
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
                org.telegram.ui.Components.voip.t1 t1Var4 = this.Y;
                if (t1Var4.f28466y < 0.0f) {
                    t1Var4.d(1.0f, 1.0f);
                    this.f39357a0 = true;
                }
            }
            org.telegram.ui.Components.voip.t1 t1Var5 = this.Y;
            if (i10 == 2) {
                z12 = true;
            } else {
                z12 = false;
            }
            t1Var5.c(z12, z11);
            if (i10 == 2) {
                z13 = false;
            }
            this.f39357a0 = z13;
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
