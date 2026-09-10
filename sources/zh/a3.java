package zh;

import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.kb;
import bi.pb;
import bi.r9;
import bi.rb;
import bi.ve;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.em;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Cells.ca;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.dd;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gg;
import org.telegram.ui.Components.hp0;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.le;
import org.telegram.ui.Components.ne;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.rf;
import org.telegram.ui.Components.s40;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.vq;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.wr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cs;
import org.telegram.ui.eo;
import org.telegram.ui.hn0;
import org.telegram.ui.i01;
import org.telegram.ui.iz;
import org.telegram.ui.m91;
import org.telegram.ui.rv0;
import org.telegram.ui.zp0;
public abstract class a3 extends aw0 implements NotificationCenter.NotificationCenterDelegate {
    public final ImageView A0;
    public int A1;
    public TextView A2;
    public float A3;
    public final org.telegram.ui.ActionBar.f6 B0;
    public long B1;
    public vh.b B2;
    public boolean B3;
    public final z6 C0;
    public boolean C1;
    public int C2;
    public cs C3;
    public final b2 D0;
    public boolean D1;
    public int D2;
    public org.telegram.ui.ActionBar.g1 D3;
    public o5 E0;
    public boolean E1;
    public boolean E2;
    public org.telegram.ui.ActionBar.g1 E3;
    public bi.x4 F0;
    public boolean F1;
    public org.telegram.ui.u7 F2;
    public final zg.a F3;
    public bi.x4 G0;
    public boolean G1;
    public boolean G2;
    public final eh.a G3;
    public bi.x4 H0;
    public long H1;
    public float H2;
    public final eh.d H3;
    public int I0;
    public final float I1;
    public gg.m I2;
    public final ch.b I3;
    public final u7 J0;
    public int J1;
    public f60 J2;
    public TL_stories.TL_premium_boostsStatus J3;
    public final l2 K0;
    public boolean K1;
    public int K2;
    public ChannelBoostsController.CanApplyBoost K3;
    public final o1 L0;
    public int L1;
    public boolean L2;
    public long L3;
    public final View M0;
    public int M1;
    public final k2.v M2;
    public long M3;
    public final ImageView N0;
    public int N1;
    public final AnimationNotificationsLocker N2;
    public boolean N3;
    public final LinearLayout O0;
    public final z2 O1;
    public final org.telegram.ui.Components.d6 O2;
    public TLRPC.TL_channels_sendAsPeers O3;
    public final b2 P0;
    public final com.google.firebase.messaging.n P1;
    public final org.telegram.ui.Components.d6 P2;
    public final j1 P3;
    public org.telegram.ui.Components.n6 Q0;
    public w2 Q1;
    public float Q2;
    public int Q3;
    public org.telegram.ui.Components.n6 R0;
    public boolean R1;
    public long R2;
    public final j1 R3;
    public org.telegram.ui.Components.d6 S0;
    public i5 S1;
    public boolean S2;
    public final ArrayList S3;
    public org.telegram.ui.Components.d6 T0;
    public boolean T1;
    public boolean T2;
    public final ArrayList T3;
    public boolean U0;
    public boolean U1;
    public boolean U2;
    public boolean U3;
    public boolean V0;
    public boolean V1;
    public boolean V2;
    public final sg.a1 V3;
    public long W0;
    public b2 W1;
    public s40 W2;
    public final org.telegram.ui.Components.d6 W3;
    public long X0;
    public a X1;
    public final rv0 X2;
    public final org.telegram.ui.Components.d6 X3;
    public boolean Y0;
    public e1 Y1;
    public boolean Y2;
    public final org.telegram.ui.Components.d6 Y3;
    public boolean Z0;
    public f1 Z1;
    public z1 Z2;
    public float Z3;
    public boolean f48153a1;
    public b1 a2;
    public FrameLayout f48154a3;
    public final Path f48155a4;
    public boolean f48156b1;
    public t1 f48157b2;
    public hn0 f48158b3;
    public boolean f48159b4;
    public final h2 f48160c1;
    public ih.h f48161c2;
    public boolean f48162c3;
    public ValueAnimator f48163c4;
    public final FrameLayout f48164d1;
    public bi.x4 f48165d2;
    public v1 f48166d3;
    public float f48167d4;
    public final gg.h1 f48168e1;
    public ValueAnimator f48169e2;
    public float f48170e3;
    public final ImageReceiver f48171f1;
    public pk0 f48172f2;
    public boolean f48173f3;
    public final ImageReceiver f48174g1;
    public LinearLayout f48175g2;
    public boolean f48176g3;
    public final ArrayList f48177h1;
    public TextView f48178h2;
    public boolean f48179h3;
    public Runnable f48180i1;
    public TextView f48181i2;
    public boolean f48182i3;
    public final f2 f48183j1;
    public u6 f48184j2;
    public boolean j3;
    public final iz f48185k1;
    public ViewPropertyAnimator f48186k2;
    public boolean f48187k3;
    public f3 l1;
    public final bh.d f48188l2;
    public final ImageReceiver f48189l3;
    public float f48190m1;
    public final bh.d f48191m2;
    public yg.e f48192m3;
    public final g9 f48193n1;
    public final Paint f48194n2;
    public final ImageReceiver f48195n3;
    public final x2 f48196o1;
    public int f48197o2;
    public org.telegram.ui.Components.p5 f48198o3;
    public final v6 f48199p1;
    public ValueAnimator f48200p2;
    public boolean f48201p3;
    public j6.l f48202q1;
    public float f48203q2;
    public boolean f48204q3;
    public int f48205r1;
    public float f48206r2;
    public pk0 f48207r3;
    public org.telegram.ui.ActionBar.g1 f48208s1;
    public float f48209s2;
    public boolean f48210s3;
    public v2 f48211t1;
    public int f48212t2;
    public float f48213t3;
    public TL_stories.PeerStories f48214u1;
    public boolean f48215u2;
    public boolean f48216u3;
    public final ArrayList f48217v1;
    public boolean f48218v2;
    public float f48219v3;
    public final ImageView f48220w0;
    public final ArrayList f48221w1;
    public boolean f48222w2;
    public int f48223w3;
    public final ImageView f48224x0;
    public final y2 f48225x1;
    public boolean f48226x2;
    public int f48227x3;
    public final m91 f48228y0;
    public final xf.i0 f48229y1;
    public int f48230y2;
    public int y3;
    public final kj0 f48231z0;
    public ArrayList f48232z1;
    public final int f48233z2;
    public j1 f48234z3;

    public a3(Context context, final u7 u7Var, y2 y2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null);
        this.f48156b1 = true;
        this.f48177h1 = new ArrayList();
        this.f48205r1 = -5;
        this.I1 = 1.0f;
        z2 z2Var = new z2(this);
        this.O1 = z2Var;
        this.f48203q2 = -1.0f;
        this.f48206r2 = -1.0f;
        this.f48209s2 = -1.0f;
        this.f48233z2 = ConnectionsManager.generateClassGuid();
        this.O2 = new org.telegram.ui.Components.d6(this);
        this.P2 = new org.telegram.ui.Components.d6(this);
        rv0 rv0Var = new rv0();
        this.X2 = rv0Var;
        this.f48170e3 = 1.0f;
        this.P3 = new j1(this, 4);
        this.R3 = new j1(this, 11);
        this.S3 = new ArrayList();
        this.T3 = new ArrayList();
        this.V3 = new sg.a1(this, 10);
        this.W3 = new org.telegram.ui.Components.d6(this);
        this.X3 = new org.telegram.ui.Components.d6(this);
        this.Y3 = new org.telegram.ui.Components.d6(this);
        this.f48155a4 = new Path();
        rv0Var.E = new o0.b(this);
        ?? obj = new Object();
        obj.f12228g = new ArrayList();
        this.M2 = obj;
        this.N2 = new AnimationNotificationsLocker();
        this.f48217v1 = new ArrayList();
        this.f48221w1 = new ArrayList();
        gg.h1 h1Var = new gg.h1(this, 6);
        this.f48168e1 = h1Var;
        h1Var.setCrossfadeWithOldImage(false);
        h1Var.setAllowLoadingOnAttachedOnly(true);
        h1Var.ignoreNotifications = true;
        h1Var.setFileLoadingPriority(0);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f48189l3 = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.ignoreNotifications = true;
        imageReceiver.setFileLoadingPriority(3);
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f48195n3 = imageReceiver2;
        imageReceiver2.setAllowLoadingOnAttachedOnly(true);
        imageReceiver2.ignoreNotifications = true;
        imageReceiver2.setFileLoadingPriority(3);
        ImageReceiver imageReceiver3 = new ImageReceiver();
        this.f48171f1 = imageReceiver3;
        imageReceiver3.setAllowLoadingOnAttachedOnly(true);
        imageReceiver3.ignoreNotifications = true;
        imageReceiver3.setFileLoadingPriority(0);
        ImageReceiver imageReceiver4 = new ImageReceiver();
        this.f48174g1 = imageReceiver4;
        imageReceiver4.setAllowLoadingOnAttachedOnly(true);
        imageReceiver4.ignoreNotifications = true;
        imageReceiver4.setFileLoadingPriority(0);
        h1Var.setPreloadingReceivers(Arrays.asList(imageReceiver3, imageReceiver4));
        this.f48193n1 = new g9((org.telegram.ui.ActionBar.f6) null);
        this.J0 = u7Var;
        this.f48225x1 = y2Var;
        this.P1 = y2Var.f49077g;
        this.S1 = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
        y2Var.f49081l.setColor(-16777216);
        this.f48194n2 = new Paint(1);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setColor(687865855);
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setColor(352321535);
        this.B0 = f6Var;
        setClipChildren(false);
        f2 f2Var = new f2(this, context, this.f48160c1, f6Var, u7Var);
        this.f48183j1 = f2Var;
        ch.b bVar = new ch.b(f6Var, org.telegram.ui.ActionBar.j6.Sd, 0.8f);
        this.I3 = bVar;
        eh.c cVar = new eh.c();
        cVar.a(i0.a.d(0.2f, -16777216, -1));
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.canBlurChat()) {
            eh.d dVar = new eh.d(cVar);
            this.H3 = dVar;
            dVar.g(AndroidUtilities.dp(8.0f));
            this.G3 = dVar;
        } else {
            this.H3 = null;
            this.G3 = cVar;
        }
        gh.k kVar = new gh.k(this);
        zg.a aVar = new zg.a(this.G3);
        aVar.d = kVar;
        aVar.e = this;
        this.F3 = aVar;
        this.f48188l2 = aVar.c(this, bVar, false);
        bh.d c10 = aVar.c(this, bVar, false);
        this.f48191m2 = c10;
        c10.t(AndroidUtilities.dp(32.0f));
        h2 h2Var = new h2(this, context, y2Var, u7Var);
        this.f48160c1 = h2Var;
        h2Var.setClipChildren(false);
        this.f48185k1 = new iz(this.C2, h2Var);
        h2Var.addView(f2Var, w7.a6.c(-1.0f, -1));
        l2 l2Var = new l2(this, getContext(), u7Var.f48972y, u7Var, f6Var);
        this.K0 = l2Var;
        l2Var.f48778b0.setOnClickListener(new l1(this, 10));
        ImageView imageView = new ImageView(context);
        this.N0 = imageView;
        imageView.setImageDrawable(y2Var.f49082m);
        int dp = AndroidUtilities.dp(8.0f);
        imageView.setPadding(dp, dp, dp, dp);
        imageView.setOnClickListener(new l1(this, 11));
        imageView.setContentDescription(LocaleController.getString(R.string.ShareFile));
        w7.c6.a(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageDrawable(y2Var.f49083n);
        imageView2.setPadding(dp, dp, dp, dp);
        b2 b2Var = new b2(this, getContext(), 1);
        this.P0 = b2Var;
        org.telegram.ui.Components.n6 n6Var = this.R0;
        if (n6Var != null) {
            n6Var.setCallback(b2Var);
        }
        b2Var.setWillNotDraw(false);
        b2Var.setOnClickListener(new l1(this, 12));
        b2 b2Var2 = new b2(this, getContext(), 2);
        this.D0 = b2Var2;
        org.telegram.ui.Components.n6 n6Var2 = this.Q0;
        if (n6Var2 != null) {
            n6Var2.setCallback(b2Var2);
        }
        b2Var2.setWillNotDraw(false);
        b2Var2.setOnClickListener(new l1(this, 13));
        b2Var2.setOnLongClickListener(new org.telegram.ui.Components.b0(6, this, u7Var));
        o5 o5Var = new o5(context, y2Var);
        this.E0 = o5Var;
        o5Var.setPadding(dp, dp, dp, dp);
        b2Var2.addView(this.E0, w7.a6.e(40, 40, 3));
        b2Var.addView(imageView2, w7.a6.e(40, 40, 3));
        w7.c6.b(b2Var2, 0.3f, 5.0f);
        w7.c6.b(b2Var, 0.3f, 5.0f);
        h1Var.setAllowLoadingOnAttachedOnly(true);
        h1Var.setParentView(h2Var);
        xf.i0 i0Var = new xf.i0(10);
        this.f48229y1 = i0Var;
        h2Var.setOutlineProvider(i0Var);
        h2Var.setClipToOutline(true);
        addView(h2Var);
        x2 x2Var = new x2(context, z2Var);
        this.f48196o1 = x2Var;
        x2Var.setOnClickListener(new View.OnClickListener(this) {
            public final a3 f48461b;

            {
                this.f48461b = this;
            }

            @Override
            public final void onClick(View view) {
                int i10;
                switch (r3) {
                    case 0:
                        a3 a3Var = this.f48461b;
                        long j3 = UserConfig.getInstance(a3Var.C2).clientUserId;
                        long j10 = a3Var.B1;
                        u7 u7Var2 = u7Var;
                        if (j3 == j10) {
                            Bundle e = org.telegram.ui.Cells.r6.e(1, "type");
                            e.putLong("dialog_id", a3Var.B1);
                            u7Var2.H(new la0(e, null));
                            return;
                        } else if (j10 > 0) {
                            u7Var2.H(ProfileActivity.m4(j10));
                            return;
                        } else {
                            u7Var2.H(eo.R9(j10));
                            return;
                        }
                    default:
                        a3 a3Var2 = this.f48461b;
                        if (a3Var2.O1.j()) {
                            u7Var.O();
                            if (!u7.D1) {
                                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            m91 m91Var = a3Var2.f48228y0;
                            if (!u7.D1) {
                                i10 = R.string.Mute;
                            } else {
                                i10 = R.string.Unmute;
                            }
                            m91Var.setContentDescription(LocaleController.getString(i10));
                            return;
                        }
                        a3Var2.c1(true);
                        return;
                }
            }
        });
        h2Var.addView(x2Var, w7.a6.d(-1, -2.0f, 0, 0.0f, 17.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f48164d1 = frameLayout;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(150L);
        layoutTransition.disableTransitionType(2);
        layoutTransition.enableTransitionType(4);
        LinearLayout linearLayout = new LinearLayout(context);
        this.O0 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutTransition(layoutTransition);
        linearLayout.addView(imageView, w7.a6.q(40, 40, 5));
        linearLayout.addView(b2Var, w7.a6.q(40, 40, 5));
        linearLayout.addView(b2Var2, w7.a6.q(40, 40, 5));
        addView(linearLayout, w7.a6.d(-2, -2.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.f48220w0 = imageView3;
        imageView3.setImageDrawable(y2Var.f49086q);
        imageView3.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        imageView3.setBackground(org.telegram.ui.ActionBar.j6.f0(-1, 1, -1));
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        h2Var.addView(imageView3, w7.a6.d(40, 40.0f, 53, 2.0f, 15.0f, 2.0f, 0.0f));
        ImageView imageView4 = new ImageView(context);
        this.f48224x0 = imageView4;
        imageView4.setImageDrawable(y2Var.f49087r);
        imageView4.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        imageView4.setBackground(org.telegram.ui.ActionBar.j6.f0(-1, 1, -1));
        imageView4.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        h2Var.addView(imageView4, w7.a6.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        imageView4.setOnClickListener(new org.telegram.ui.web.c(u7Var, 25));
        imageView3.setOnClickListener(new hi.c(this, f6Var, u7Var, context, y2Var, 13));
        m91 m91Var = new m91(context, 11);
        this.f48228y0 = m91Var;
        h2Var.addView(m91Var, w7.a6.d(40, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        ?? imageView5 = new ImageView(context);
        this.f48231z0 = imageView5;
        imageView5.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        m91Var.addView(imageView5);
        ImageView imageView6 = new ImageView(context);
        this.A0 = imageView6;
        imageView6.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        imageView6.setImageDrawable(y2Var.f49089t);
        m91Var.addView(imageView6);
        imageView6.setVisibility(8);
        z6 z6Var = new z6(context);
        this.C0 = z6Var;
        z6Var.setOnClickListener(new l1(this, 2));
        h2Var.addView(z6Var, w7.a6.d(60, 40.0f, 53, 2.0f, 15.0f, 42.0f, 0.0f));
        m91Var.setOnClickListener(new View.OnClickListener(this) {
            public final a3 f48461b;

            {
                this.f48461b = this;
            }

            @Override
            public final void onClick(View view) {
                int i10;
                switch (r3) {
                    case 0:
                        a3 a3Var = this.f48461b;
                        long j3 = UserConfig.getInstance(a3Var.C2).clientUserId;
                        long j10 = a3Var.B1;
                        u7 u7Var2 = u7Var;
                        if (j3 == j10) {
                            Bundle e = org.telegram.ui.Cells.r6.e(1, "type");
                            e.putLong("dialog_id", a3Var.B1);
                            u7Var2.H(new la0(e, null));
                            return;
                        } else if (j10 > 0) {
                            u7Var2.H(ProfileActivity.m4(j10));
                            return;
                        } else {
                            u7Var2.H(eo.R9(j10));
                            return;
                        }
                    default:
                        a3 a3Var2 = this.f48461b;
                        if (a3Var2.O1.j()) {
                            u7Var.O();
                            if (!u7.D1) {
                                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", 3).apply();
                            }
                            m91 m91Var2 = a3Var2.f48228y0;
                            if (!u7.D1) {
                                i10 = R.string.Mute;
                            } else {
                                i10 = R.string.Unmute;
                            }
                            m91Var2.setContentDescription(LocaleController.getString(i10));
                            return;
                        }
                        a3Var2.c1(true);
                        return;
                }
            }
        });
        this.f48199p1 = new v6(this, y2Var);
        h2Var.addView(l2Var, w7.a6.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        View view = new View(context);
        this.M0 = view;
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -16777216}));
        o1 o1Var = new o1(this, context, u7Var, u7Var.v, view, frameLayout, u7Var);
        this.L0 = o1Var;
        h2Var.addView(view, w7.a6.e(-1, 200, 87));
        h2Var.addView(o1Var, w7.a6.d(-1, -1.0f, 0, 0.0f, 64.0f, 0.0f, 0.0f));
        h2Var.addView(frameLayout, w7.a6.d(-1, 100.0f, 0, 0.0f, 55.0f, 0.0f, 0.0f));
        int dp2 = AndroidUtilities.dp(20.0f);
        int k10 = i0.a.k(-1, 100);
        m91Var.setBackground(org.telegram.ui.ActionBar.j6.i0(dp2, dp2, dp2, dp2, 0, k10, k10));
        int dp3 = AndroidUtilities.dp(20.0f);
        int k11 = i0.a.k(-1, 100);
        imageView3.setBackground(org.telegram.ui.ActionBar.j6.i0(dp3, dp3, dp3, dp3, 0, k11, k11));
        int dp4 = AndroidUtilities.dp(20.0f);
        int k12 = i0.a.k(-1, 100);
        imageView4.setBackground(org.telegram.ui.ActionBar.j6.i0(dp4, dp4, dp4, dp4, 0, k12, k12));
        int dp5 = AndroidUtilities.dp(20.0f);
        int k13 = i0.a.k(-1, 100);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.i0(dp5, dp5, dp5, dp5, 0, k13, k13));
        int dp6 = AndroidUtilities.dp(20.0f);
        int k14 = i0.a.k(-1, 100);
        b2Var2.setBackground(org.telegram.ui.ActionBar.j6.i0(dp6, dp6, dp6, dp6, 0, k14, k14));
        int dp7 = AndroidUtilities.dp(20.0f);
        int k15 = i0.a.k(-1, 100);
        b2Var.setBackground(org.telegram.ui.ActionBar.j6.i0(dp7, dp7, dp7, dp7, 0, k15, k15));
        ca caVar = l2Var.W;
        View o9 = caVar.o(context);
        if (o9 != null) {
            AndroidUtilities.removeFromParent(o9);
            addView(o9);
        }
        caVar.D = new org.telegram.ui.z0(this, 3);
        caVar.T(this);
    }

    public static void V0(h5 h5Var, ImageReceiver imageReceiver, String str) {
        if (h5Var.f48477s) {
            imageReceiver.setImage(null, null, ImageLocation.getForPath(h5Var.f48474f), str, null, null, null, 0L, null, null, 0);
        } else {
            imageReceiver.setImage(ImageLocation.getForPath(h5Var.e), str, null, null, null, 0L, null, null, 0);
        }
    }

    public static void Z(a3 a3Var, ValueAnimator valueAnimator) {
        float f7;
        z6 z6Var = a3Var.C0;
        a3Var.f48167d4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        x2 x2Var = a3Var.f48196o1;
        x2Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * a3Var.f48167d4);
        x2Var.setAlpha(1.0f - a3Var.f48167d4);
        ImageView imageView = a3Var.f48220w0;
        imageView.setTranslationY((-AndroidUtilities.dp(8.0f)) * a3Var.f48167d4);
        imageView.setAlpha(1.0f - a3Var.f48167d4);
        ImageView imageView2 = a3Var.f48224x0;
        imageView2.setTranslationY((-AndroidUtilities.dp(8.0f)) * a3Var.f48167d4);
        imageView2.setAlpha(1.0f - a3Var.f48167d4);
        m91 m91Var = a3Var.f48228y0;
        m91Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * a3Var.f48167d4);
        m91Var.setAlpha((1.0f - a3Var.f48167d4) * a3Var.f48170e3);
        b2 b2Var = a3Var.W1;
        if (b2Var != null) {
            b2Var.setTranslationY(AndroidUtilities.dp(8.0f) * a3Var.f48167d4);
            a3Var.W1.setAlpha(1.0f - a3Var.f48167d4);
        }
        if (z6Var != null) {
            z6Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * a3Var.f48167d4);
            z6Var.setAlpha(1.0f - a3Var.f48167d4);
        }
        a3Var.K0.setAlpha(1.0f - a3Var.f48167d4);
        w2 w2Var = a3Var.Q1;
        if (w2Var == null) {
            f7 = 0.0f;
        } else {
            f7 = ((l7) w2Var).d.V;
        }
        float hideInterfaceAlpha = a3Var.getHideInterfaceAlpha();
        b2 b2Var2 = a3Var.D0;
        if (b2Var2 != null) {
            b2Var2.setAlpha((1.0f - a3Var.f48167d4) * (1.0f - f7) * hideInterfaceAlpha);
        }
        ImageView imageView3 = a3Var.N0;
        if (imageView3 != null) {
            imageView3.setAlpha((1.0f - a3Var.f48167d4) * (1.0f - f7) * hideInterfaceAlpha);
        }
        b2 b2Var3 = a3Var.P0;
        if (b2Var3 != null) {
            b2Var3.setAlpha((1.0f - a3Var.f48167d4) * (1.0f - f7) * hideInterfaceAlpha);
        }
        t1 t1Var = a3Var.f48157b2;
        if (t1Var != null) {
            t1Var.setAlpha(1.0f - a3Var.f48167d4);
            a3Var.invalidate();
        }
        a3Var.f48160c1.invalidate();
    }

    public static void a0(a3 a3Var, boolean z10) {
        org.telegram.ui.ActionBar.g1 g1Var = a3Var.D3;
        if (g1Var != null && a3Var.C3 != null && g1Var.getVisibility() == 0) {
            if (z10) {
                if (Math.abs(u7.B1 - 0.2f) < 0.05f) {
                    a3Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedVerySlow));
                } else if (Math.abs(u7.B1 - 0.5f) < 0.05f) {
                    a3Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedSlow));
                } else if (Math.abs(u7.B1 - 1.0f) < 0.05f) {
                    a3Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedNormal));
                } else if (Math.abs(u7.B1 - 1.5f) < 0.05f) {
                    a3Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedFast));
                } else if (Math.abs(u7.B1 - 2.0f) < 0.05f) {
                    a3Var.D3.setSubtext(LocaleController.getString(R.string.VideoSpeedVeryFast));
                } else {
                    org.telegram.ui.ActionBar.g1 g1Var2 = a3Var.D3;
                    int i10 = R.string.VideoSpeedCustom;
                    g1Var2.setSubtext(LocaleController.formatString(i10, dd.a(u7.B1) + "x"));
                }
            }
            a3Var.C3.a(u7.B1, z10);
        }
    }

    public static void b0(a3 a3Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        if (!a3Var.I0() && !a3Var.O1.f49132f) {
            if (UserConfig.getInstance(a3Var.C2).isPremium()) {
                org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.StealthModeButton), false, a3Var.B0).setOnClickListener(new l1(a3Var, 8));
                return;
            }
            Drawable drawable = a3Var.getContext().getDrawable(R.drawable.msg_gallery_locked2);
            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(0.5f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
            i01 i01Var = new i01(a3Var.getContext().getDrawable(R.drawable.msg_stealth_locked), drawable, 2);
            org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_stories_stealth2, LocaleController.getString(R.string.StealthModeButton), false, a3Var.B0);
            c10.setOnClickListener(new l1(a3Var, 9));
            c10.setIcon(i01Var);
        }
    }

    public static void d0(a3 a3Var) {
        z2 z2Var = a3Var.O1;
        TL_stories.StoryItem storyItem = z2Var.f49129a;
        if ((storyItem == null && z2Var.f49130b == null) || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        File h = z2Var.h();
        boolean z10 = z2Var.e;
        if (h != null && h.exists()) {
            MediaController.saveFile(h.toString(), a3Var.getContext(), z10 ? 1 : 0, null, null, new ve(6, a3Var, z10));
            return;
        }
        a3Var.a1();
    }

    public static void e0(a3 a3Var, long j3) {
        String str;
        boolean z10;
        TLRPC.User user;
        if (j3 > 0) {
            TLRPC.User user2 = MessagesController.getInstance(a3Var.C2).getUser(Long.valueOf(j3));
            str = user2.first_name;
            z10 = user2.stories_hidden;
            user = user2;
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(a3Var.C2).getChat(Long.valueOf(-j3));
            str = chat.title;
            z10 = chat.stories_hidden;
            user = chat;
        }
        AndroidUtilities.runOnUIThread(new gg(a3Var, MessagesController.getInstance(a3Var.C2), j3, !z10, str, user), 200L);
    }

    public static void f0(a3 a3Var) {
        int i10;
        int i11;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(a3Var.getContext(), 0, a3Var.B0);
        if (a3Var.I0()) {
            i10 = R.string.DeleteBotPreviewTitle;
        } else {
            i10 = R.string.DeleteStoryTitle;
        }
        alertDialog$Builder.f17528a.R = LocaleController.getString(i10);
        if (a3Var.I0()) {
            i11 = R.string.DeleteBotPreviewSubtitle;
        } else {
            i11 = R.string.DeleteStorySubtitle;
        }
        alertDialog$Builder.f17528a.T = LocaleController.getString(i11);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new g1(a3Var, 2));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new z9.a(14));
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
        ((l7) a3Var.Q1).h(d2Var);
        d2Var.h();
    }

    public AccountInstance getAccountInstance() {
        return AccountInstance.getInstance(this.C2);
    }

    public float getHideInterfaceAlpha() {
        float f7;
        float f10 = 1.0f - this.O2.f22295c;
        g4 g4Var = this.J0.f48967w;
        if (g4Var == null) {
            f7 = 0.0f;
        } else {
            f7 = g4Var.f48443f;
        }
        return (1.0f - f7) * f10;
    }

    public long getMessageMinPrice() {
        u7 u7Var;
        if (!this.O1.f49132f || (u7Var = this.J0) == null || u7Var.A0 == null || D0(true)) {
            return 0L;
        }
        return u7Var.A0.j();
    }

    public static void h0(a3 a3Var) {
        String str;
        pc J;
        org.telegram.ui.ActionBar.f6 f6Var = a3Var.B0;
        h2 h2Var = a3Var.f48160c1;
        if (a3Var.G1) {
            return;
        }
        if (a3Var.E1) {
            if (a3Var.J3 != null && a3Var.K3 != null) {
                qg.k0.C1(new bi.o1(a3Var, 11), a3Var.J3, a3Var.K3, a3Var.B1, true);
                return;
            }
            u7 u7Var = a3Var.J0;
            if (u7Var != null) {
                u7Var.f48943k1 = true;
                u7Var.P();
            }
            MessagesController.getInstance(a3Var.C2).getBoostsController().getBoostsStats(a3Var.B1, new bi.i5(a3Var, 9));
            return;
        }
        t1 t1Var = a3Var.f48157b2;
        int i10 = -a3Var.f48205r1;
        a3Var.f48205r1 = i10;
        AndroidUtilities.shakeViewSpring(t1Var, i10);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        if (a3Var.B1 >= 0) {
            str = UserObject.getUserName(MessagesController.getInstance(a3Var.C2).getUser(Long.valueOf(a3Var.B1)));
        } else {
            str = "";
        }
        if (MessagesController.getInstance(a3Var.C2).premiumFeaturesBlocked()) {
            J = new wc(h2Var, f6Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedRepliesNonPremium, str)));
        } else {
            J = new wc(h2Var, f6Var).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedRepliesNonPremium, str)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new j1(a3Var, 5));
        }
        J.j();
    }

    public static void j0(a3 a3Var) {
        z2 z2Var = a3Var.O1;
        if (z2Var.f49129a == null) {
            return;
        }
        TL_stories.TL_stories_exportStoryLink tL_stories_exportStoryLink = new TL_stories.TL_stories_exportStoryLink();
        tL_stories_exportStoryLink.f17440id = z2Var.f49129a.f17435id;
        tL_stories_exportStoryLink.peer = MessagesController.getInstance(a3Var.C2).getInputPeer(a3Var.B1);
        ConnectionsManager.getInstance(a3Var.C2).sendRequest(tL_stories_exportStoryLink, new Object());
    }

    public final void A0() {
        if (this.f48158b3 != null) {
            return;
        }
        hn0 hn0Var = new hn0(getContext(), 4);
        this.f48158b3 = hn0Var;
        hn0Var.setTextSize(1, 14.0f);
        this.f48158b3.setTextColor(i0.a.d(0.5f, -16777216, -1));
        this.f48158b3.setGravity(19);
        this.f48158b3.setText(LocaleController.getString(R.string.StoryReplyDisabled));
        addView(this.f48158b3, w7.a6.d(-2, 40.0f, 3, 16.0f, 0.0f, 16.0f, 0.0f));
    }

    public final void B0() {
        if (this.W1 != null) {
            return;
        }
        b2 b2Var = new b2(this, getContext(), 0);
        this.W1 = b2Var;
        b2Var.setClickable(true);
        addView(this.W1, w7.a6.d(-1, 48.0f, 48, 0.0f, 0.0f, 136.0f, 0.0f));
        org.telegram.ui.u7 u7Var = new org.telegram.ui.u7(this, getContext());
        this.F2 = u7Var;
        u7Var.setOnClickListener(new l1(this, 0));
        this.W1.addView(this.F2, w7.a6.d(-1, 32.0f, 0, 9.0f, 11.0f, 0.0f, 0.0f));
        vh.b bVar = new vh.b(1, getContext(), false);
        this.B2 = bVar;
        bVar.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        this.W1.addView(this.B2, w7.a6.d(-1, 28.0f, 0, 13.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        this.A2 = textView;
        textView.setTextSize(1, 14.0f);
        this.A2.setTextColor(-1);
        this.W1.addView(this.A2, w7.a6.d(-2, -2.0f, 0, 0.0f, 16.0f, 0.0f, 9.0f));
        ImageView imageView = new ImageView(getContext());
        imageView.setImageDrawable(this.f48225x1.f49088s);
        org.telegram.ui.u7 u7Var2 = this.F2;
        int dp = AndroidUtilities.dp(15.0f);
        int k10 = i0.a.k(-1, 120);
        u7Var2.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, 0, k10, k10));
        imageView.setBackground(org.telegram.ui.ActionBar.j6.M(i0.a.k(-1, 120), -AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f)));
    }

    public final void C0() {
        if (this.f48154a3 != null) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(getContext());
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        textView.setTextSize(1, 16.0f);
        textView.setText(LocaleController.getString(R.string.StoryUnsupported));
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.B0;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        TextView textView2 = new TextView(getContext());
        w7.c6.a(textView2);
        textView2.setText(LocaleController.getString(R.string.AppUpdate));
        int i11 = org.telegram.ui.ActionBar.j6.Sh;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        textView2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        textView2.setGravity(17);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 15.0f);
        int dp = AndroidUtilities.dp(8.0f);
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var);
        int k10 = i0.a.k(org.telegram.ui.ActionBar.j6.v0(i11, f6Var), 30);
        textView2.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, v02, k10, k10));
        textView2.setOnClickListener(new l1(this, 3));
        linearLayout.addView(textView, w7.a6.n(-1, -2));
        linearLayout.addView(textView2, w7.a6.k(0.0f, 24.0f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, w7.a6.d(-1, -2.0f, 17, 72.0f, 0.0f, 72.0f, 0.0f));
        this.f48160c1.addView(frameLayout);
        this.f48154a3 = frameLayout;
    }

    public final boolean D0(boolean z10) {
        t0 t0Var;
        TLRPC.Peer i10;
        t0 t0Var2;
        long clientUserId = UserConfig.getInstance(this.C2).getClientUserId();
        long j3 = this.B1;
        u7 u7Var = this.J0;
        int i11 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i11 < 0 && (t0Var2 = u7Var.A0) != null) {
            if (z10) {
                TLRPC.Peer i12 = t0Var2.i();
                TLRPC.Chat chat = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1));
                if (u7Var.A0.l() || ChatObject.canManageCalls(chat)) {
                    if (i12 == null || this.B1 == DialogObject.getPeerDialogId(i12) || DialogObject.getPeerDialogId(i12) == UserConfig.getInstance(this.C2).getClientUserId()) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        } else if (i11 >= 0 && u7Var != null && (t0Var = u7Var.A0) != null && t0Var.l()) {
            if (!z10 || (i10 = u7Var.A0.i()) == null || this.B1 == DialogObject.getPeerDialogId(i10) || DialogObject.getPeerDialogId(i10) == clientUserId || this.B1 == clientUserId) {
                return true;
            }
            return false;
        } else {
            return false;
        }
    }

    public final void E0(Canvas canvas, int i10, int i11) {
        TextureView textureView;
        k2.v vVar = this.M2;
        org.telegram.ui.m4 m4Var = (org.telegram.ui.m4) vVar.e;
        if (m4Var != null && ((SurfaceView) vVar.d) != null) {
            Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            if (Build.VERSION.SDK_INT >= 24) {
                AndroidUtilities.getBitmapFromSurface((SurfaceView) vVar.d, createBitmap);
            }
            if (createBitmap != null) {
                canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
            }
        } else if (m4Var != null && (textureView = (TextureView) vVar.f12227f) != null) {
            Bitmap bitmap = textureView.getBitmap(i10, i11);
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            }
        } else {
            canvas.save();
            h2 h2Var = this.f48160c1;
            canvas.scale(i10 / h2Var.getMeasuredWidth(), i11 / h2Var.getMeasuredHeight());
            this.f48168e1.draw(canvas);
            canvas.restore();
        }
    }

    public final void F0(pb pbVar, TL_stories.StoryItem storyItem) {
        int i10;
        View[] viewPages;
        w2 w2Var = this.Q1;
        Context context = getContext();
        if (storyItem.pinned) {
            i10 = Integer.MAX_VALUE;
        } else {
            i10 = storyItem.expire_date - storyItem.date;
        }
        rb rbVar = new rb(context, i10, this.B0);
        rbVar.q1(pbVar);
        bi.p1 p1Var = rbVar.f3615b;
        if (p1Var != null) {
            for (View view : p1Var.getViewPages()) {
                if (view instanceof kb) {
                    ((kb) view).e(false);
                }
            }
        }
        rbVar.k1(true);
        rbVar.T = new sg.f0(15, this, storyItem);
        ((l7) w2Var).h(rbVar);
    }

    public final boolean G0(android.view.ViewGroup r11, float r12, float r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: zh.a3.G0(android.view.ViewGroup, float, float, boolean):boolean");
    }

    public final boolean H0(MotionEvent motionEvent, View view) {
        float x10 = getX();
        h2 h2Var = this.f48160c1;
        float x11 = view.getX() + h2Var.getX() + x10;
        float y3 = view.getY() + h2Var.getY() + getY();
        if (motionEvent.getX() >= x11 && motionEvent.getX() <= x11 + view.getWidth() && motionEvent.getY() >= y3 && motionEvent.getY() <= y3 + view.getHeight()) {
            return true;
        }
        return false;
    }

    public final boolean I0() {
        a5 a5Var;
        u7 u7Var = this.J0;
        if (u7Var != null && (a5Var = u7Var.O0) != null && a5Var.e == 4) {
            return true;
        }
        return false;
    }

    public final boolean J0() {
        TLRPC.User user;
        if (!I0() || (user = MessagesController.getInstance(this.C2).getUser(Long.valueOf(this.J0.O0.d))) == null || !user.bot || !user.bot_can_edit) {
            return false;
        }
        return true;
    }

    public abstract boolean K0();

    public final void L0(yg.p0 p0Var) {
        boolean z10;
        boolean z11;
        int i10;
        TLRPC.Reaction reaction;
        z2 z2Var = this.O1;
        TL_stories.StoryItem storyItem = z2Var.f49129a;
        if (storyItem == null) {
            return;
        }
        TLRPC.Reaction reaction2 = storyItem.sent_reaction;
        if (reaction2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (reaction2 != null && p0Var == null) {
            l0();
            this.S1.g0(this.B1, z2Var.f49129a, null);
        } else if (p0Var == null) {
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.C2).getReactionsMap().get("❤");
            if (tL_availableReaction != null) {
                this.f48201p3 = false;
                TLRPC.Document document = tL_availableReaction.around_animation;
                String a2 = yg.l0.a();
                ImageLocation forDocument = ImageLocation.getForDocument(document);
                ImageReceiver imageReceiver = this.f48189l3;
                imageReceiver.setImage(forDocument, a2, null, null, null, 0);
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().N(0, false, true);
                }
                this.f48204q3 = true;
                this.S1.g0(this.B1, z2Var.f49129a, yg.p0.c(tL_availableReaction));
            }
        } else {
            l0();
            this.S1.g0(this.B1, z2Var.f49129a, p0Var);
        }
        TL_stories.StoryItem storyItem2 = z2Var.f49129a;
        b2 b2Var = this.D0;
        if (storyItem2 != null && (reaction = storyItem2.sent_reaction) != null) {
            z10 = !z10;
            this.E0.setReaction(yg.p0.d(reaction));
            b2Var.setContentDescription(LocaleController.getString(R.string.AccDescrLiked));
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            z11 = true;
        } else {
            this.E0.setReaction(null);
            b2Var.setContentDescription(LocaleController.getString(R.string.AccDescrLike));
            z11 = false;
        }
        if (this.D1 && z10) {
            TL_stories.StoryItem storyItem3 = z2Var.f49129a;
            if (storyItem3.views == null) {
                storyItem3.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews = z2Var.f49129a.views;
            int i11 = storyViews.reactions_count;
            if (z11) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            int i12 = i11 + i10;
            storyViews.reactions_count = i12;
            if (i12 < 0) {
                storyViews.reactions_count = 0;
            }
        }
        TL_stories.StoryItem storyItem4 = z2Var.f49129a;
        yg.r0.b(reaction2, storyItem4.sent_reaction, storyItem4.views);
        k1(true);
    }

    public final void M0() {
        t0 t0Var;
        boolean z10;
        if (this.O3 == null) {
            u7 u7Var = this.J0;
            if (u7Var != null && (t0Var = u7Var.A0) != null) {
                TLRPC.GroupCall groupCall = t0Var.v;
                if (groupCall == null) {
                    z10 = false;
                } else {
                    z10 = !groupCall.messages_enabled;
                }
                if (z10) {
                    return;
                }
            }
            TLRPC.TL_channels_sendAsPeers sendAsPeers = MessagesController.getInstance(this.C2).getSendAsPeers(this.B1, true);
            this.O3 = sendAsPeers;
            t1 t1Var = this.f48157b2;
            if (t1Var != null && sendAsPeers != null) {
                t1Var.P1(true);
            }
        }
    }

    public final boolean N0() {
        t1 t1Var = this.f48157b2;
        if (t1Var == null) {
            return false;
        }
        boolean z10 = t1Var.f20956y2;
        if (z10) {
            t1Var.s1();
        }
        AndroidUtilities.runOnUIThread(new j1(this, 3), 300L);
        return z10;
    }

    public final void O0() {
        CharSequence charSequence;
        long j3;
        org.telegram.ui.web.y1 y1Var;
        int i10;
        long j10;
        long j11;
        MessagesController.getGlobalMainSettings().edit().putInt("taptostoryhighlighthint", 3).apply();
        TLRPC.TL_textWithEntities textWithEntities = this.f48157b2.getTextWithEntities();
        long clientUserId = UserConfig.getInstance(this.C2).getClientUserId();
        TLRPC.Peer i11 = this.J0.A0.i();
        if (i11 != null) {
            clientUserId = DialogObject.getPeerDialogId(i11);
        }
        Context context = getContext();
        final int i12 = this.C2;
        String shortName = DialogObject.getShortName(i12, this.B1);
        long messageMinPrice = getMessageMinPrice();
        long j12 = this.L3;
        org.telegram.ui.web.y1 y1Var2 = new org.telegram.ui.web.y1(this, 24);
        b bVar = new b();
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, context, (org.telegram.ui.ActionBar.f6) bVar, false);
        h3Var.fixNavigationBar();
        h3Var.applyBottomPadding = false;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        h3Var.customView = linearLayout;
        int[] iArr = MessagesController.getInstance(i12).starsGroupcallMessageLimits;
        CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(textWithEntities, false, new TextPaint());
        if (formatTextWithEntities instanceof Spannable) {
            Spannable spannable = (Spannable) formatTextWithEntities;
            charSequence = formatTextWithEntities;
            j3 = j12;
            y1Var = y1Var2;
            i10 = ((org.telegram.ui.Components.y5[]) spannable.getSpans(0, charSequence.length(), org.telegram.ui.Components.y5.class)).length + ((Emoji.EmojiSpan[]) spannable.getSpans(0, charSequence.length(), Emoji.EmojiSpan.class)).length;
        } else {
            charSequence = formatTextWithEntities;
            j3 = j12;
            y1Var = y1Var2;
            i10 = 0;
        }
        if (j3 <= 0) {
            j10 = 100;
        } else {
            j10 = j3;
        }
        int max = (int) Math.max(messageMinPrice, j10);
        int length = (iArr.length / 7) - 1;
        while (true) {
            if (length >= 0) {
                int i13 = length * 7;
                int i14 = iArr[i13];
                j11 = messageMinPrice;
                int i15 = iArr[i13 + 2];
                if (i10 <= iArr[i13 + 3] && charSequence.length() <= i15) {
                    max = Math.max(max, i14);
                    break;
                } else {
                    length--;
                    messageMinPrice = j11;
                }
            } else {
                j11 = messageMinPrice;
                break;
            }
        }
        final long[] jArr = {max};
        final uq[] uqVarArr = new uq[1];
        final bi.d dVar = new bi.d(context, null, true);
        final ?? obj = new Object();
        obj.f48577c = clientUserId;
        obj.f48578f = textWithEntities;
        obj.f48579g = jArr[0];
        final f0 f0Var = new f0(i12, context, true);
        LinearLayout f7 = em.f(context, 0);
        final xh.a7 a7Var = new xh.a7(context, LocaleController.getString(R.string.LiveStoryHighlightFeaturePin), bVar);
        f7.addView(a7Var, w7.a6.p(-1, -1, 1.0f, 112, 0, 0, 5, 0));
        final xh.a7 a7Var2 = new xh.a7(context, LocaleController.getString(R.string.LiveStoryHighlightFeatureLength), bVar);
        f7.addView(a7Var2, w7.a6.p(-1, -1, 1.0f, 112, 5, 0, 5, 0));
        final xh.a7 a7Var3 = new xh.a7(context, LocaleController.getString(R.string.LiveStoryHighlightFeatureEmoji), bVar);
        f7.addView(a7Var3, w7.a6.p(-1, -1, 1.0f, 112, 5, 0, 0, 0));
        final n nVar = new n(context, bVar, r6);
        final boolean[] zArr = {true};
        org.telegram.ui.web.y1 y1Var3 = y1Var;
        long j13 = j11;
        Utilities.Callback[] callbackArr = {new Utilities.Callback() {
            @Override
            public final void run(Object obj2) {
                String formatString;
                Integer num = (Integer) obj2;
                long intValue = num.intValue();
                long[] jArr2 = jArr;
                jArr2[0] = intValue;
                dVar.g(xh.z7.V0(false, LocaleController.formatString(R.string.StarsAddHighlightedMessage, LocaleController.formatNumber(intValue, ',')), uqVarArr), true, true);
                long j14 = jArr2[0];
                k0 k0Var = obj;
                k0Var.f48579g = j14;
                f0Var.set(k0Var);
                int intValue2 = num.intValue();
                int i16 = i12;
                int b10 = o.b(i16, intValue2, 0);
                int b11 = o.b(i16, num.intValue(), 1);
                int b12 = o.b(i16, num.intValue(), 2);
                if (b10 >= 60) {
                    formatString = LocaleController.formatString(R.string.SlowmodeMinutes, Integer.valueOf(b10 / 60));
                } else {
                    formatString = LocaleController.formatString(R.string.SlowmodeSeconds, Integer.valueOf(b10));
                }
                ((org.telegram.ui.Components.o6) a7Var.f45251b).c(formatString, true, true);
                ((org.telegram.ui.Components.o6) a7Var2.f45251b).c(LocaleController.formatNumber(b11, ','), true, true);
                ((org.telegram.ui.Components.o6) a7Var3.f45251b).c(LocaleController.formatNumber(b12, ','), true, true);
                int b13 = o.b(i16, num.intValue(), 3);
                int b14 = o.b(i16, num.intValue(), 4);
                boolean[] zArr2 = zArr;
                nVar.f(b13, b14, true ^ zArr2[0]);
                zArr2[0] = false;
            }
        }};
        f0Var.set(obj);
        int i16 = 9;
        int[] iArr2 = {1, 50, 100, 500, 1000, 2000, 5000, 7500, 10000};
        int i17 = MessagesController.getInstance(i12).starsGroupcallMessageAmountMax;
        ArrayList arrayList = new ArrayList();
        int i18 = 0;
        while (true) {
            if (i18 >= i16) {
                break;
            }
            int[] iArr3 = iArr2;
            if (iArr2[i18] >= j13) {
                if (i18 > 0 && arrayList.isEmpty() && iArr3[i18] > j13) {
                    arrayList.add(Integer.valueOf((int) j13));
                }
                int i19 = iArr3[i18];
                if (i19 > i17) {
                    arrayList.add(Integer.valueOf(i17));
                    break;
                }
                arrayList.add(Integer.valueOf(i19));
                if (iArr3[i18] == i17) {
                    break;
                }
            }
            i18++;
            iArr2 = iArr3;
            i16 = 9;
        }
        if (arrayList.isEmpty() || ((Integer) hc.b.i(1, arrayList)).intValue() < i17) {
            arrayList.add(Integer.valueOf(i17));
        }
        int[] iArr4 = new int[arrayList.size()];
        for (int i20 = 0; i20 < arrayList.size(); i20++) {
            iArr4[i20] = ((Integer) arrayList.get(i20)).intValue();
        }
        nVar.f45826e0 = iArr4;
        nVar.setValue((int) jArr[0]);
        linearLayout.addView(nVar, w7.a6.k(0.0f, -52.0f, 0.0f, -42.0f, -1, -2));
        callbackArr[0].run(Integer.valueOf((int) jArr[0]));
        linearLayout.addView(f7, w7.a6.k(16.0f, 0.0f, 16.0f, 0.0f, -1, 56));
        int i21 = org.telegram.ui.ActionBar.j6.f18034j5;
        TextView b10 = w7.e6.b(context, 20.0f, i21, true, bVar);
        b10.setGravity(17);
        b10.setText(LocaleController.getString(R.string.LiveStoryHighlightTitle));
        linearLayout.addView(b10, w7.a6.k(42.0f, 18.0f, 42.0f, 9.0f, -1, -2));
        TextView b11 = w7.e6.b(context, 14.0f, i21, false, bVar);
        b11.setGravity(17);
        em.p(R.string.LiveStoryHighlightText, new Object[]{shortName}, b11);
        linearLayout.addView(b11, w7.a6.k(42.0f, 0.0f, 42.0f, 0.0f, -1, -2));
        linearLayout.addView(f0Var, w7.a6.t(-2, -2, 17, 42, 22, 42, 20));
        linearLayout.addView(dVar, w7.a6.k(16.0f, 0.0f, 16.0f, 12.0f, -1, 48));
        h3Var.show();
        dVar.setOnClickListener(new wh.r(y1Var3, jArr, h3Var, 5));
    }

    public final void P0() {
        if (this.f48157b2 == null) {
            return;
        }
        t0();
        this.I2.f29378j0.f0();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 21 || i10 == 22) {
            this.f48157b2.P();
        }
        this.I2.J1(-1, true);
        gg.m mVar = this.I2;
        mVar.Z = this.B1;
        mVar.r1();
        this.I2.m1().setText(this.f48157b2.getFieldText());
        ((l7) this.Q1).h(this.I2);
    }

    public final void Q0() {
        Bundle bundle = new Bundle();
        long j3 = this.B1;
        if (j3 < 0) {
            bundle.putLong("chat_id", -j3);
        } else {
            bundle.putLong("user_id", j3);
        }
        TLRPC.Dialog dialog = MessagesController.getInstance(this.C2).getDialog(this.B1);
        if (dialog != null) {
            bundle.putInt("message_id", dialog.top_message);
        }
        this.J0.H(new eo(bundle));
    }

    public final void R0(long r24) {
        throw new UnsupportedOperationException("Method not decompiled: zh.a3.R0(long):void");
    }

    public final void S0(android.net.Uri r21) {
        throw new UnsupportedOperationException("Method not decompiled: zh.a3.S0(android.net.Uri):void");
    }

    public final void T0(long j3, boolean z10) {
        int i10;
        int i11;
        if (this.K1 != z10) {
            this.K1 = z10;
            kj0 kj0Var = this.f48231z0;
            int i12 = 0;
            if (z10) {
                if (this.J0.f48918a && Build.VERSION.SDK_INT < 33) {
                    u7 u7Var = ((l7) this.Q1).d;
                    u7Var.l1 = true;
                    u7Var.P();
                    sg.a1 a1Var = this.V3;
                    AndroidUtilities.cancelRunOnUIThread(a1Var);
                    AndroidUtilities.runOnUIThread(a1Var, 100L);
                }
                R0(j3);
                g1();
                kj0Var.setAnimation(this.f48225x1.f49090u);
                this.K1 = true;
                this.f48196o1.f49036a.getImageReceiver().setVisible(true, true);
                z2 z2Var = this.O1;
                if (z2Var.f49129a != null) {
                    FileLog.d("StoryViewer displayed story dialogId=" + this.B1 + " storyId=" + z2Var.f49129a.f17435id + " " + z2.c(z2Var));
                }
            } else {
                p0();
                kj0Var.a();
                this.l1 = null;
                this.L2 = false;
                this.O2.d(0.0f, true);
                this.f48160c1.invalidate();
                invalidate();
                q0();
                u7 u7Var2 = ((l7) this.Q1).d;
                u7Var2.I0 = false;
                u7Var2.P();
            }
            if (this.K1) {
                i10 = 3;
            } else {
                i10 = 2;
            }
            this.f48168e1.setFileLoadingPriority(i10);
            if (this.K1) {
                i11 = 2;
            } else {
                i11 = 0;
            }
            this.f48171f1.setFileLoadingPriority(i11);
            if (this.K1) {
                i12 = 2;
            }
            this.f48174g1.setFileLoadingPriority(i12);
            if (this.C1 || this.D1) {
                i5 i5Var = this.S1;
                long j10 = this.B1;
                boolean z11 = this.K1;
                a0.i iVar = i5Var.f48508m;
                d8 d8Var = (d8) iVar.f(j10);
                if (d8Var == null) {
                    d8Var = new d8(i5Var.f48499a, j10, i5Var);
                    iVar.k(d8Var, j10);
                }
                d8Var.b(z11);
            }
        }
    }

    public final void U0(int i10, long j3) {
        if (this.B1 != j3) {
            z2 z2Var = this.O1;
            z2Var.f49130b = null;
            z2Var.f49129a = null;
        }
        this.B1 = j3;
        this.f48232z1 = null;
        o0(i10);
        TL_stories.PeerStories peerStories = this.J0.Q0;
        boolean z10 = true;
        if (peerStories != null) {
            this.S1.S(peerStories, true);
            return;
        }
        i5 i5Var = this.S1;
        TL_stories.PeerStories y3 = i5Var.y(j3);
        if (y3 == null) {
            y3 = i5Var.z(j3);
        } else {
            z10 = false;
        }
        i5Var.S(y3, z10);
    }

    public final void W0(long j3, boolean z10, boolean z11) {
        String str;
        if (!z10 && j3 == this.M3 && this.N3 == z11) {
            return;
        }
        this.M3 = j3;
        this.N3 = z11;
        x2 x2Var = this.f48196o1;
        if (j3 >= 0) {
            if (this.C1 && !z11) {
                x2Var.f49037b.l(LocaleController.getString(R.string.SelfStoryTitle), false);
                x2Var.f49037b.i(null);
                return;
            }
            TLRPC.User user = MessagesController.getInstance(this.C2).getUser(Long.valueOf(j3));
            if (user != null && user.verified) {
                Drawable mutate = getContext().getDrawable(R.drawable.verified_profile).mutate();
                mutate.setAlpha(255);
                vq vqVar = new vq(mutate, null);
                vqVar.f28580w = true;
                int dp = AndroidUtilities.dp(16.0f);
                int dp2 = AndroidUtilities.dp(16.0f);
                vqVar.h = dp;
                vqVar.f28577n = dp2;
                x2Var.f49037b.i(vqVar);
            } else {
                x2Var.f49037b.i(null);
            }
            if (user != null) {
                x2Var.f49037b.l(Emoji.replaceEmoji(AndroidUtilities.removeDiacritics(ContactsController.formatName(user)), x2Var.f49037b.getPaint().getFontMetricsInt(), false), false);
                return;
            }
            x2Var.f49037b.l(null, false);
            return;
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-j3));
        org.telegram.ui.Cells.f4 f4Var = x2Var.f49037b;
        org.telegram.ui.Cells.f4 f4Var2 = x2Var.f49037b;
        if (chat == null) {
            str = "";
        } else {
            str = chat.title;
        }
        f4Var.l(AndroidUtilities.removeDiacritics(str), false);
        if (chat != null && chat.verified) {
            Drawable mutate2 = getContext().getDrawable(R.drawable.verified_profile).mutate();
            mutate2.setAlpha(255);
            vq vqVar2 = new vq(mutate2, null);
            vqVar2.f28580w = true;
            int dp3 = AndroidUtilities.dp(16.0f);
            int dp4 = AndroidUtilities.dp(16.0f);
            vqVar2.h = dp3;
            vqVar2.f28577n = dp4;
            f4Var2.i(vqVar2);
            return;
        }
        f4Var2.i(null);
    }

    public final void X0(float f7, float f10, f3 f3Var) {
        this.f48190m1 = f7;
        this.A3 = 1.0f / f10;
        if (this.l1 != f3Var) {
            this.l1 = f3Var;
            if (f3Var != null) {
                ImageReceiver imageReceiver = f3Var.f48408a;
                if (imageReceiver.getBitmap() != null) {
                    this.f48168e1.updateStaticDrawableThump(imageReceiver.getBitmap().copy(Bitmap.Config.ARGB_8888, false));
                }
            }
        }
    }

    public final void Y0(boolean z10) {
        TLRPC.Chat chat;
        boolean z11;
        z2 z2Var = this.O1;
        if (z2Var.f49129a != null) {
            u7 u7Var = this.J0;
            if (u7Var.f48931f != null) {
                String e = z2Var.e();
                if (z10) {
                    bi.n1 n1Var = new bi.n1(7, this.B0);
                    if (this.D1) {
                        chat = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1));
                    } else {
                        chat = null;
                    }
                    if (MessagesController.getInstance(this.C2).storiesEnabled() && ((!this.D1 && !UserObject.isService(this.B1)) || ChatObject.isPublic(chat))) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z1 z1Var = new z1(this, u7Var.f48931f.getContext(), e, e, z11, n1Var);
                    this.Z2 = z1Var;
                    z1Var.f27177i0 = true;
                    TL_stories.StoryItem storyItem = z2Var.f49129a;
                    storyItem.dialogId = this.B1;
                    z1Var.F0 = storyItem;
                    z1Var.f27189s0 = new l2.g(this, 26);
                    ((l7) this.Q1).h(z1Var);
                    return;
                }
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", e);
                LaunchActivity.G1.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.StickersShare)), 500);
            }
        }
    }

    public final void Z0() {
        h2 h2Var = this.f48160c1;
        org.telegram.ui.ActionBar.f6 f6Var = this.B0;
        org.telegram.messenger.a2.p(R.string.UnsupportedAttachment, new wc(h2Var, f6Var), f6Var);
    }

    public final void a1() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.B0);
        alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.AppName);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        String string = LocaleController.getString(R.string.PleaseDownload);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
        d2Var.T = string;
        ((l7) this.Q1).h(d2Var);
    }

    public final void b1(boolean z10) {
        if (this.f48210s3 != z10) {
            z2 z2Var = this.O1;
            if (z2Var.f49129a != null) {
                this.f48210s3 = z10;
                if (z10) {
                    this.f48207r3.setVisibility(0);
                }
                this.f48207r3.setStoryItem(z2Var.f49129a);
                u7 u7Var = ((l7) this.Q1).d;
                u7Var.f48952p1 = z10;
                u7Var.P();
                float f7 = 0.0f;
                if (z10) {
                    float f10 = this.f48213t3;
                    if (z10) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    this.f48207r3.setTransitionProgress(this.f48213t3);
                    ofFloat.addUpdateListener(new k1(this, 1));
                    ofFloat.addListener(new p1(this, z10, 0));
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(wr.f28820g);
                    ofFloat.start();
                    return;
                }
                if (this.f48207r3.getReactionsWindow() != null) {
                    this.f48207r3.getReactionsWindow().e();
                }
                this.f48207r3.animate().alpha(0.0f).setDuration(150L).setListener(new q1(this, 0)).start();
            }
        }
    }

    public final void c1(boolean z10) {
        int i10;
        if (this.G0 == null) {
            bi.x4 x4Var = new bi.x4(getContext(), 1);
            x4Var.l(1.0f, -56.0f);
            this.G0 = x4Var;
            x4Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            this.f48160c1.addView(this.G0, w7.a6.d(-1, -2.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
        }
        bi.x4 x4Var2 = this.G0;
        if (z10) {
            i10 = R.string.StoryNoSound;
        } else {
            i10 = R.string.StoryTapToSound;
        }
        x4Var2.s(LocaleController.getString(i10));
        this.G0.u();
    }

    public final boolean d1(boolean z10) {
        if (this.J0.R0) {
            z10 = !z10;
        }
        if (z10) {
            if (this.J1 < getStoriesCount() - 1) {
                this.J1++;
                f1(false);
                return true;
            }
        } else {
            int i10 = this.J1;
            if (i10 > 0) {
                this.J1 = i10 - 1;
                f1(false);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        float f7;
        t0 t0Var;
        boolean z10;
        int i12 = NotificationCenter.storiesUpdated;
        long j3 = 0;
        u7 u7Var = this.J0;
        boolean z11 = false;
        if (i10 != i12 && (i10 != NotificationCenter.storiesListUpdated || u7Var.O0 != objArr[0])) {
            if (i10 == NotificationCenter.storyQualityUpdate) {
                f1(false);
                return;
            } else if (i10 == NotificationCenter.emojiLoaded) {
                this.K0.f48778b0.invalidate();
                return;
            } else if (i10 == NotificationCenter.stealthModeChanged) {
                r0(true);
                return;
            } else if (i10 == NotificationCenter.storiesLimitUpdate) {
                j4.w o9 = MessagesController.getInstance(this.C2).getStoriesController().o();
                if (o9 != null && o9.a(this.C2, 1) && this.Q1 != null) {
                    bi.o1 o1Var = new bi.o1(this, 11);
                    Context findActivity = AndroidUtilities.findActivity(getContext());
                    if (findActivity == null) {
                        findActivity = LaunchActivity.G1;
                    }
                    ((l7) this.Q1).h(new qg.k0(o9.b(), this.C2, findActivity, o1Var, null));
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
                TL_account.RequirementToContact isUserContactBlocked = MessagesController.getInstance(this.C2).isUserContactBlocked(this.B1);
                if (this.B1 >= 0 && !UserConfig.getInstance(this.C2).isPremium() && DialogObject.isPremiumBlocked(isUserContactBlocked)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.F1 != z10 || this.H1 != DialogObject.getMessagesStarsPrice(isUserContactBlocked)) {
                    this.F1 = z10;
                    this.H1 = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
                    f1(false);
                    r0(true);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.chatInfoDidLoad) {
                Object obj = objArr[0];
                if ((obj instanceof TLRPC.ChatFull) && this.B1 == (-((TLRPC.ChatFull) obj).f17196id)) {
                    f1(false);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.liveStoryUpdated) {
                long longValue = ((Long) objArr[0]).longValue();
                if (u7Var != null && (t0Var = u7Var.A0) != null && t0Var.g() == longValue) {
                    f1(false);
                    t1 t1Var = this.f48157b2;
                    if (t1Var != null) {
                        t1Var.K(true);
                        this.f48157b2.P1(true);
                        r0(true);
                    }
                    o1 o1Var2 = this.L0;
                    if (o1Var2 != null) {
                        t0 t0Var2 = o1Var2.P;
                        if (t0Var2 != null) {
                            j3 = t0Var2.j();
                        }
                        if (o1Var2.H != j3) {
                            o1Var2.e.N(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.didLoadSendAsPeers && ((Boolean) objArr[2]).booleanValue()) {
                M0();
                return;
            } else {
                return;
            }
        }
        w2 w2Var = this.Q1;
        if (w2Var == null || !((l7) w2Var).d.H0) {
            if (this.K1) {
                j1();
                if (this.A1 == 0) {
                    if (!this.E2) {
                        this.E2 = true;
                        ((l7) this.Q1).j();
                        return;
                    }
                    return;
                }
                int i13 = this.J1;
                ArrayList arrayList = this.f48217v1;
                int size = arrayList.size();
                ArrayList arrayList2 = this.f48221w1;
                if (i13 >= arrayList2.size() + size) {
                    this.J1 = (arrayList2.size() + arrayList.size()) - 1;
                }
                f1(false);
                if (this.C1 || this.D1) {
                    k1(true);
                }
            }
            TL_stories.PeerStories peerStories = u7Var.Q0;
            if (peerStories != null) {
                this.S1.S(peerStories, true);
            } else {
                long j10 = this.B1;
                if (j10 != 0) {
                    i5 i5Var = this.S1;
                    TL_stories.PeerStories y3 = i5Var.y(j10);
                    if (y3 == null) {
                        y3 = i5Var.z(j10);
                        z11 = true;
                    }
                    i5Var.S(y3, z11);
                }
            }
            org.telegram.ui.ActionBar.g1 g1Var = this.f48208s1;
            if (g1Var != null) {
                ViewPropertyAnimator animate = g1Var.animate();
                if (this.S1.K(this.B1) && this.O1.e && !SharedConfig.allowPreparingHevcPlayers()) {
                    f7 = 0.5f;
                } else {
                    f7 = 1.0f;
                }
                animate.alpha(f7).start();
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        le leVar;
        Canvas canvas2;
        org.telegram.ui.Components.n6 n6Var;
        org.telegram.ui.Components.n6 n6Var2;
        l1();
        if (this.D1 && (n6Var2 = this.Q0) != null) {
            n6Var2.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(40.0f));
        }
        if (this.D1 && (n6Var = this.R0) != null) {
            n6Var.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(40.0f));
        }
        super.dispatchDraw(canvas);
        boolean z10 = this.f48216u3;
        LinearLayout linearLayout = this.O0;
        b2 b2Var = this.D0;
        if (z10) {
            float measuredWidth = (b2Var.getMeasuredWidth() / 2.0f) + b2Var.getX() + linearLayout.getX();
            float measuredHeight = (b2Var.getMeasuredHeight() / 2.0f) + b2Var.getY() + linearLayout.getY();
            int dp = AndroidUtilities.dp(24.0f);
            float f7 = dp / 2.0f;
            float lerp = AndroidUtilities.lerp(this.f48223w3, measuredWidth - f7, wr.f28820g.getInterpolation(this.f48219v3));
            float lerp2 = AndroidUtilities.lerp(this.f48227x3, measuredHeight - f7, this.f48219v3);
            int lerp3 = AndroidUtilities.lerp(this.y3, dp, this.f48219v3);
            if (this.f48201p3) {
                org.telegram.ui.Components.p5 p5Var = this.f48198o3;
                if (p5Var != null) {
                    float f10 = lerp3;
                    p5Var.setBounds((int) lerp, (int) lerp2, (int) (lerp + f10), (int) (lerp2 + f10));
                    this.f48198o3.draw(canvas);
                }
            } else {
                float f11 = lerp3;
                ImageReceiver imageReceiver = this.f48195n3;
                imageReceiver.setImageCoords(lerp, lerp2, f11, f11);
                imageReceiver.draw(canvas);
            }
        }
        if (this.f48204q3) {
            float measuredWidth2 = (b2Var.getMeasuredWidth() / 2.0f) + b2Var.getX() + linearLayout.getX();
            float measuredHeight2 = (b2Var.getMeasuredHeight() / 2.0f) + b2Var.getY() + linearLayout.getY();
            int dp2 = AndroidUtilities.dp(120.0f);
            if (!this.f48201p3) {
                float f12 = dp2;
                float f13 = f12 / 2.0f;
                float f14 = measuredWidth2 - f13;
                float f15 = measuredHeight2 - f13;
                ImageReceiver imageReceiver2 = this.f48189l3;
                imageReceiver2.setImageCoords(f14, f15, f12, f12);
                imageReceiver2.draw(canvas);
                if (imageReceiver2.getLottieAnimation() != null && imageReceiver2.getLottieAnimation().A()) {
                    this.f48204q3 = false;
                }
            } else {
                yg.e eVar = this.f48192m3;
                if (eVar != null) {
                    float f16 = dp2 / 2.0f;
                    eVar.e((int) (measuredWidth2 - f16), (int) (measuredHeight2 - f16), (int) (measuredWidth2 + f16), (int) (measuredHeight2 + f16));
                    this.f48192m3.b(canvas);
                    if (this.f48192m3.c()) {
                        this.f48192m3.d(this);
                        this.f48192m3 = null;
                        this.f48204q3 = false;
                    }
                } else {
                    this.f48204q3 = false;
                }
            }
        }
        t1 t1Var = this.f48157b2;
        if (t1Var != null) {
            ne neVar = t1Var.f20949x1;
            le leVar2 = t1Var.f20955y1;
            if (t1Var.getAlpha() != 0.0f && (leVar = t1Var.f20844e1) != null && leVar.getParent() != null && t1Var.f20844e1.getVisibility() == 0) {
                int save = canvas.save();
                canvas.translate(t1Var.f20844e1.getX() + neVar.getX() + leVar2.getX() + t1Var.getX(), t1Var.f20844e1.getY() + neVar.getY() + leVar2.getY() + t1Var.getY());
                if (t1Var.getAlpha() != 1.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, t1Var.getMeasuredWidth(), t1Var.getMeasuredHeight(), (int) (t1Var.getAlpha() * 255.0f), 31);
                } else {
                    canvas2 = canvas;
                }
                t1Var.f20844e1.draw(canvas2);
                canvas2.restoreToCount(save);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        pk0 pk0Var;
        pk0 pk0Var2;
        eh.d dVar;
        float dp;
        float f7;
        if (view == this.f48166d3) {
            canvas.save();
            canvas.clipRect(0.0f, this.f48166d3.getY(), getMeasuredWidth(), this.f48166d3.getY() + this.f48166d3.getMeasuredHeight());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        t1 t1Var = this.f48157b2;
        Paint paint = this.f48194n2;
        b2 b2Var = this.D0;
        y2 y2Var = this.f48225x1;
        if (view == t1Var) {
            float f10 = this.f48203q2;
            z2 z2Var = this.O1;
            if (f10 > 0.0f && !z2Var.f49132f) {
                y2Var.f49081l.setAlpha((int) (f10 * 63.75f));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), y2Var.f49081l);
            }
            RectF rectF = y2Var.h;
            RectF rectF2 = y2Var.f49078i;
            RectF rectF3 = y2Var.f49079j;
            rectF.set(this.f48157b2.getX(), this.f48157b2.getY() + this.f48157b2.getAnimatedTop() + AndroidUtilities.dp(1.33f), this.f48157b2.getX() + this.f48157b2.getMeasuredWidth(), this.f48157b2.getY() + this.f48157b2.getMeasuredHeight());
            float dp2 = AndroidUtilities.dp(40.0f);
            if (!z2Var.f49132f) {
                if (this.S2) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
                if (this.T2 && this.D1) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
                if (b2Var != null && b2Var.getVisibility() == 0) {
                    dp2 = (dp2 - AndroidUtilities.dp(40.0f)) + b2Var.getLayoutParams().width;
                }
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(46.0f);
                dp2 = AndroidUtilities.dp(46.0f);
                b1 b1Var = this.a2;
                if (b1Var != null && b1Var.getVisibility() == 0) {
                    dp2 += AndroidUtilities.dp(46.0f);
                }
            }
            rectF2.set(AndroidUtilities.dp(10.0f) + dp, ((this.f48157b2.getY() + this.f48157b2.getMeasuredHeight()) - AndroidUtilities.dp(5.0f)) - AndroidUtilities.dp(38.0f), (getMeasuredWidth() - AndroidUtilities.dp(10.0f)) - dp2, (this.f48157b2.getY() + this.f48157b2.getMeasuredHeight()) - AndroidUtilities.dp(5.0f));
            this.f48157b2.setTranslationX((1.0f - this.f48203q2) * dp);
            if (this.f48157b2.getMeasuredHeight() > AndroidUtilities.dp(50.0f)) {
                f7 = ((1.0f - this.f48203q2) * (this.f48157b2.getMeasuredHeight() - AndroidUtilities.dp(50.0f))) + 0.0f;
            } else {
                f7 = 0.0f;
            }
            this.f48157b2.getEditField().setTranslationY(com.google.android.gms.internal.vision.e2.z(1.0f, this.f48203q2, -AndroidUtilities.dp(2.0f), f7));
            float dp3 = AndroidUtilities.dp(50.0f) / 2.0f;
            AndroidUtilities.lerp(rectF2, y2Var.h, this.f48203q2, rectF3);
            bh.d dVar2 = this.f48188l2;
            if (dVar2 != null) {
                dVar2.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                dVar2.p(dp3);
                dVar2.setAlpha((int) ((1.0f - this.f48167d4) * (1.0f - this.f48206r2) * 255.0f * getHideInterfaceAlpha()));
                dVar2.draw(canvas);
            } else {
                canvas.drawRoundRect(rectF3, dp3, dp3, paint);
            }
            if (this.f48203q2 < 0.5f) {
                canvas.save();
                canvas.clipRect(rectF3);
                boolean drawChild2 = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild2;
            }
        } else if (t1Var != null && t1Var.u0(view)) {
            float dp4 = AndroidUtilities.dp(30.0f);
            RectF rectF4 = y2Var.f49080k;
            RectF rectF5 = y2Var.f49080k;
            rectF4.set(0.0f, view.getY() + AndroidUtilities.dp(1.0f), getWidth(), AndroidUtilities.dp(20.0f) + getHeight());
            Path path = this.f48155a4;
            path.rewind();
            path.addRoundRect(rectF5, dp4, dp4, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            bh.d dVar3 = this.f48191m2;
            if (dVar3 != null) {
                dVar3.setBounds((int) rectF5.left, (int) rectF5.top, (int) rectF5.right, (int) rectF5.bottom);
                dVar3.q(dp4, dp4, dp4, dp4);
                dVar3.setAlpha(255);
                dVar3.draw(canvas);
            } else {
                canvas.drawRoundRect(rectF5, dp4, dp4, paint);
            }
            boolean drawChild3 = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild3;
        } else {
            if (view == this.f48172f2 && this.f48157b2 != null) {
                view.setTranslationY(((this.f48157b2.getY() + this.f48157b2.getAnimatedTop()) + (-pk0Var.getMeasuredHeight())) - AndroidUtilities.dp(18.0f));
            } else {
                if (view == this.f48207r3) {
                    view.setTranslationY((this.O0.getY() + (b2Var.getY() + (-(pk0Var2.getMeasuredHeight() - this.f48207r3.getPaddingBottom())))) - AndroidUtilities.dp(18.0f));
                } else {
                    h2 h2Var = this.f48160c1;
                    if (view == h2Var && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && (dVar = this.H3) != null && !dVar.f7522n) {
                        RecordingCanvas a2 = dVar.a(getMeasuredWidth(), getMeasuredHeight());
                        a2.drawColor(i0.a.d(0.2f, -16777216, -1));
                        a2.translate(h2Var.getX(), h2Var.getY());
                        view.draw(a2);
                        dVar.c();
                    }
                }
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e1() {
        if (!MessagesController.getInstance(this.C2).storiesEnabled()) {
            return;
        }
        File h = this.O1.h();
        if (h != null && h.exists()) {
            z1 z1Var = this.Z2;
            if (z1Var != null) {
                z1Var.dismiss();
            }
            AndroidUtilities.runOnUIThread(new j1(this, 8), 120L);
            return;
        }
        a1();
    }

    public final void f1(boolean r55) {
        throw new UnsupportedOperationException("Method not decompiled: zh.a3.f1(boolean):void");
    }

    public final void g1() {
        throw new UnsupportedOperationException("Method not decompiled: zh.a3.g1():void");
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    public ArrayList<Integer> getCurrentDay() {
        return this.f48232z1;
    }

    public long getCurrentPeer() {
        return this.B1;
    }

    public int getListPosition() {
        return this.L1;
    }

    public Bitmap getPlayingBitmap() {
        h2 h2Var = this.f48160c1;
        Bitmap createBitmap = Bitmap.createBitmap(h2Var.getWidth(), h2Var.getHeight(), Bitmap.Config.ARGB_8888);
        E0(new Canvas(createBitmap), createBitmap.getWidth(), createBitmap.getHeight());
        return createBitmap;
    }

    public int getSelectedPosition() {
        return this.J1;
    }

    public i5 getStoriesController() {
        return MessagesController.getInstance(this.C2).getStoriesController();
    }

    public int getStoriesCount() {
        return Math.max(this.D2, this.f48217v1.size()) + this.f48221w1.size();
    }

    public ArrayList<TL_stories.StoryItem> getStoryItems() {
        return this.f48217v1;
    }

    public final void h1() {
        int i10;
        if (this.G1) {
            TextView textView = this.f48178h2;
            if (textView != null) {
                textView.setText(LocaleController.getString(R.string.LiveStoryCommentsDisabled));
            }
            TextView textView2 = this.f48181i2;
            if (textView2 != null) {
                textView2.setVisibility(8);
                return;
            }
            return;
        }
        TextView textView3 = this.f48178h2;
        if (textView3 != null) {
            if (this.E1) {
                i10 = R.string.StoryGroupRepliesLocked;
            } else {
                i10 = R.string.StoryRepliesLocked;
            }
            textView3.setText(LocaleController.getString(i10));
        }
        TextView textView4 = this.f48181i2;
        if (textView4 != null) {
            textView4.setVisibility(0);
            this.f48181i2.setText(LocaleController.getString(R.string.StoryRepliesLockedButton));
        }
    }

    public final void i1() {
        TL_stories.PeerStories peerStories;
        int i10;
        ArrayList arrayList = this.f48232z1;
        u7 u7Var = this.J0;
        if (arrayList != null) {
            ArrayList arrayList2 = this.f48221w1;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                i10 = arrayList2.size();
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    long j3 = ((h5) arrayList2.get(i11)).f48471a;
                    if (((int) (j3 ^ (j3 >>> 32))) == u7Var.P0) {
                        this.J1 = i11;
                        return;
                    }
                }
            } else {
                i10 = 0;
            }
            int indexOf = this.f48232z1.indexOf(Integer.valueOf(u7Var.P0));
            if (indexOf < 0 && !this.f48232z1.isEmpty()) {
                if (u7Var.P0 > ((Integer) this.f48232z1.get(0)).intValue()) {
                    indexOf = 0;
                } else if (u7Var.P0 < ((Integer) hc.b.i(1, this.f48232z1)).intValue()) {
                    indexOf = this.f48232z1.size() - 1;
                }
            }
            this.J1 = i10 + indexOf;
        } else {
            int i12 = u7Var.f48930e1.get(this.B1, -1);
            this.J1 = i12;
            if (i12 == -1 && !u7Var.N0 && (peerStories = this.f48214u1) != null && peerStories.max_read_id > 0) {
                int i13 = 0;
                while (true) {
                    ArrayList arrayList3 = this.f48217v1;
                    if (i13 >= arrayList3.size()) {
                        break;
                    } else if (((TL_stories.StoryItem) arrayList3.get(i13)).f17435id > this.f48214u1.max_read_id) {
                        this.J1 = i13;
                        break;
                    } else {
                        i13++;
                    }
                }
            }
        }
        if (this.J1 == -1) {
            this.J1 = 0;
        }
    }

    public final void j1() {
        a5 a5Var;
        TL_stories.StoryItem storyItem;
        ArrayList arrayList = this.f48217v1;
        arrayList.clear();
        u7 u7Var = this.J0;
        if (u7Var.N0) {
            if (!u7Var.S0) {
                arrayList.add(u7Var.T0);
            }
        } else {
            ArrayList arrayList2 = this.f48232z1;
            int i10 = 0;
            ArrayList arrayList3 = this.f48221w1;
            if (arrayList2 != null && (a5Var = u7Var.O0) != null) {
                if (a5Var instanceof s4) {
                    arrayList3.clear();
                    ArrayList E = MessagesController.getInstance(this.C2).getStoriesController().E(this.B1);
                    String str = ((s4) u7Var.O0).E;
                    if (E != null) {
                        for (int i11 = 0; i11 < E.size(); i11++) {
                            h5 h5Var = (h5) E.get(i11);
                            r9 r9Var = h5Var.f48473c;
                            if (r9Var != null && !r9Var.f3574g && TextUtils.equals(r9Var.K0, str)) {
                                arrayList3.add(h5Var);
                            }
                        }
                    }
                }
                ArrayList arrayList4 = this.f48232z1;
                int size = arrayList4.size();
                while (i10 < size) {
                    Object obj = arrayList4.get(i10);
                    i10++;
                    MessageObject f7 = u7Var.O0.f(((Integer) obj).intValue());
                    if (f7 != null && (storyItem = f7.storyItem) != null) {
                        arrayList.add(storyItem);
                    }
                }
            } else if (u7Var.O0 != null) {
                while (i10 < u7Var.O0.f48240i.size()) {
                    arrayList.add(((MessageObject) u7Var.O0.f48240i.get(i10)).storyItem);
                    i10++;
                }
            } else {
                TL_stories.PeerStories peerStories = u7Var.Q0;
                if (peerStories != null && DialogObject.getPeerDialogId(peerStories.peer) == this.B1) {
                    this.f48214u1 = u7Var.Q0;
                } else {
                    TL_stories.PeerStories y3 = this.S1.y(this.B1);
                    this.f48214u1 = y3;
                    if (y3 == null) {
                        this.f48214u1 = this.S1.z(this.B1);
                    }
                }
                this.D2 = 0;
                TL_stories.PeerStories peerStories2 = this.f48214u1;
                if (peerStories2 != null) {
                    this.D2 = peerStories2.stories.size();
                    arrayList.addAll(this.f48214u1.stories);
                }
                arrayList3.clear();
                ArrayList E2 = this.S1.E(this.B1);
                if (E2 != null) {
                    arrayList3.addAll(E2);
                }
            }
        }
        this.A1 = getStoriesCount();
    }

    public final void k0(boolean z10) {
        a3 currentPeerView;
        f60 f60Var = this.J2;
        if (f60Var != null) {
            f60Var.f22874a0 = null;
            f60Var.d(false);
        }
        long j3 = this.B1;
        TL_stories.StoryItem storyItem = this.O1.f49129a;
        u7 u7Var = this.J0;
        u7Var.getClass();
        if (j3 != 0 && storyItem != null) {
            u7.E1.remove(j3 + (j3 >> 16) + (storyItem.f17435id << 16));
        }
        this.f48182i3 = true;
        k7 k7Var = u7Var.f48947n0;
        if (k7Var != null && (currentPeerView = k7Var.getCurrentPeerView()) != null) {
            currentPeerView.s0();
        }
        if (z10) {
            pc I = new wc(this.f48160c1, this.B0).I(R.raw.forward, LocaleController.getString(R.string.MessageSent), LocaleController.getString(R.string.ViewInChat), 5000, false, new j1(this, 2));
            I.f26089r = false;
            I.k(false);
        }
        MessagesController.getInstance(this.C2).ensureMessagesLoaded(this.B1, 0, null);
    }

    public final void k1(boolean z10) {
        int i10;
        int i11;
        float f7;
        float f10;
        float f11;
        boolean z11;
        int i12;
        boolean z12;
        z2 z2Var = this.O1;
        TL_stories.StoryItem storyItem = z2Var.f49129a;
        if (storyItem == null) {
            storyItem = z2Var.f49131c;
        }
        boolean z13 = this.D1;
        if (z13 || this.C1) {
            if (storyItem != null) {
                u7 u7Var = this.J0;
                b2 b2Var = this.D0;
                if (z13) {
                    if (storyItem.views == null) {
                        storyItem.views = new TL_stories.TL_storyViews();
                    }
                    TL_stories.StoryViews storyViews = storyItem.views;
                    if (storyViews.views_count <= 0) {
                        storyViews.views_count = 1;
                    }
                    org.telegram.ui.Components.n6 n6Var = this.R0;
                    if (n6Var != null && (i12 = storyViews.forwards_count) > 0) {
                        String num = Integer.toString(i12);
                        if (z10 && this.V0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        n6Var.q(num, z12, true);
                        this.V0 = true;
                    } else {
                        this.V0 = false;
                    }
                    int i13 = storyItem.views.reactions_count;
                    if (i13 > 0) {
                        org.telegram.ui.Components.n6 n6Var2 = this.Q0;
                        String num2 = Integer.toString(i13);
                        if (z10 && this.U0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        n6Var2.q(num2, z11, true);
                        this.U0 = true;
                    } else {
                        this.U0 = false;
                    }
                    float f12 = 0.0f;
                    if (!z10) {
                        org.telegram.ui.Components.d6 d6Var = this.S0;
                        if (this.U0) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        d6Var.d(f10, true);
                        org.telegram.ui.Components.d6 d6Var2 = this.T0;
                        if (d6Var2 != null) {
                            if (this.V0) {
                                f11 = 1.0f;
                            } else {
                                f11 = 0.0f;
                            }
                            d6Var2.d(f11, true);
                        }
                    }
                    TLRPC.Chat chat = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1));
                    if ((!this.E1 || (!ChatObject.canSendPlain(chat) && !ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat))) && storyItem.views.views_count > 0) {
                        TextView textView = this.A2;
                        if (u7Var.O0 == null) {
                            i11 = R.string.NobodyViews;
                        } else {
                            i11 = R.string.NobodyViewsArchived;
                        }
                        textView.setText(LocaleController.getString(i11));
                        this.A2.setTranslationX(AndroidUtilities.dp(16.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) "d  ");
                        spannableStringBuilder.setSpan(new uq(R.drawable.filled_views, 0), spannableStringBuilder.length() - 3, spannableStringBuilder.length() - 2, 0);
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.formatWholeNumber(storyItem.views.views_count, 0));
                        this.A2.setText(spannableStringBuilder);
                    } else {
                        this.A2.setText("");
                    }
                    ViewGroup.LayoutParams layoutParams = b2Var.getLayoutParams();
                    float dp = AndroidUtilities.dp(40.0f);
                    if (this.U0) {
                        f7 = this.Q0.d + AndroidUtilities.dp(4.0f);
                    } else {
                        f7 = 0.0f;
                    }
                    layoutParams.width = (int) (dp + f7);
                    ((ViewGroup.MarginLayoutParams) this.W1.getLayoutParams()).rightMargin = AndroidUtilities.dp(40.0f) + b2Var.getLayoutParams().width;
                    b2 b2Var2 = this.P0;
                    if (b2Var2 != null) {
                        ViewGroup.LayoutParams layoutParams2 = b2Var2.getLayoutParams();
                        float dp2 = AndroidUtilities.dp(40.0f);
                        if (this.V0) {
                            f12 = this.R0.d + AndroidUtilities.dp(4.0f);
                        }
                        layoutParams2.width = (int) (dp2 + f12);
                        ((ViewGroup.MarginLayoutParams) this.W1.getLayoutParams()).rightMargin += b2Var2.getLayoutParams().width;
                        b2Var2.requestLayout();
                    }
                    this.W1.requestLayout();
                    b2Var.requestLayout();
                    this.B2.setVisibility(8);
                    this.F2.setVisibility(8);
                    TL_stories.StoryItem storyItem2 = z2Var.f49129a;
                    f2 f2Var = this.f48183j1;
                    if (storyItem2 == null) {
                        f2Var.getClass();
                        return;
                    }
                    for (int i14 = 0; i14 < f2Var.getChildCount(); i14++) {
                        if (f2Var.getChildAt(i14) instanceof b7) {
                            ((b7) f2Var.getChildAt(i14)).c(storyItem2.views, z10);
                        }
                    }
                    return;
                }
                TL_stories.StoryViews storyViews2 = storyItem.views;
                if (storyViews2 != null && storyViews2.views_count > 0) {
                    int i15 = 0;
                    for (int i16 = 0; i16 < storyItem.views.recent_viewers.size(); i16++) {
                        TLObject userOrChat = MessagesController.getInstance(this.C2).getUserOrChat(storyItem.views.recent_viewers.get(i16).longValue());
                        if (userOrChat != null) {
                            this.B2.b(i15, userOrChat, this.C2);
                            i15++;
                        }
                        if (i15 >= 3) {
                            break;
                        }
                    }
                    for (int i17 = i15; i17 < 3; i17++) {
                        this.B2.b(i17, null, this.C2);
                    }
                    this.B2.a(false);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.formatPluralStringComma("Views", storyItem.views.views_count));
                    if (storyItem.views.reactions_count > 0) {
                        spannableStringBuilder2.append((CharSequence) "  d ");
                        uq uqVar = new uq(R.drawable.mini_views_likes, 0);
                        uqVar.setOverrideColor(-53704);
                        uqVar.setTopOffset(AndroidUtilities.dp(0.2f));
                        spannableStringBuilder2.setSpan(uqVar, spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 0);
                        spannableStringBuilder2.append((CharSequence) String.valueOf(storyItem.views.reactions_count));
                    }
                    if (storyItem.views.forwards_count > 0) {
                        spannableStringBuilder2.append((CharSequence) "  d ");
                        uq uqVar2 = new uq(R.drawable.mini_repost_story, 0);
                        uqVar2.setOverrideColor(-14161823);
                        uqVar2.setTopOffset(AndroidUtilities.dp(0.2f));
                        spannableStringBuilder2.setSpan(uqVar2, spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 0);
                        spannableStringBuilder2.append((CharSequence) String.valueOf(storyItem.views.forwards_count));
                    }
                    this.A2.setText(spannableStringBuilder2);
                    if (i15 == 0) {
                        this.B2.setVisibility(8);
                        this.A2.setTranslationX(AndroidUtilities.dp(16.0f));
                    } else {
                        this.B2.setVisibility(0);
                        this.A2.setTranslationX(AndroidUtilities.dp(10.0f) + hc.b.B(i15, 1, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(24.0f) + AndroidUtilities.dp(13.0f)));
                    }
                    this.F2.setVisibility(0);
                } else {
                    TextView textView2 = this.A2;
                    if (u7Var.O0 == null) {
                        i10 = R.string.NobodyViews;
                    } else {
                        i10 = R.string.NobodyViewsArchived;
                    }
                    textView2.setText(LocaleController.getString(i10));
                    this.A2.setTranslationX(AndroidUtilities.dp(16.0f));
                    this.B2.setVisibility(8);
                    this.F2.setVisibility(8);
                }
                b2Var.getLayoutParams().width = AndroidUtilities.dp(40.0f);
                this.O0.requestLayout();
                return;
            }
            this.A2.setText("");
            this.F2.setVisibility(8);
            this.B2.setVisibility(8);
        }
    }

    public final void l0() {
        o5 o5Var = this.E0;
        o5Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setListener(new r1(0, o5Var)).setDuration(150L).start();
        int dp = AndroidUtilities.dp(8.0f);
        o5 o5Var2 = new o5(getContext(), this.f48225x1);
        this.E0 = o5Var2;
        o5Var2.setPadding(dp, dp, dp, dp);
        this.E0.setAlpha(0.0f);
        this.E0.setScaleX(0.8f);
        this.E0.setScaleY(0.8f);
        this.E0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L);
        this.D0.addView(this.E0, w7.a6.e(40, 40, 3));
        this.f48204q3 = false;
    }

    public final void l1() {
        float f7;
        float f10;
        float f11;
        float f12;
        boolean z10;
        t1 t1Var;
        float heightWithTopView;
        float f13;
        float f14;
        float f15;
        float dp;
        int i10;
        float f16;
        float f17;
        b2 b2Var;
        ImageView imageView;
        l2 l2Var;
        b2 b2Var2;
        boolean z11;
        float f18;
        pk0 pk0Var;
        float f19;
        int i11;
        float f20;
        float f21;
        float f22 = ((l7) this.Q1).d.V;
        if (this.L2) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        org.telegram.ui.Components.d6 d6Var = this.O2;
        d6Var.d(f7, false);
        int i12 = this.f48212t2;
        if (i12 != 0 && this.f48215u2) {
            f10 = w7.q.a(this.H2 / i12, 0.0f, 1.0f);
        } else if (this.f48218v2) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        org.telegram.ui.Components.d6 d6Var2 = this.W3;
        float f23 = d6Var2.f22295c;
        org.telegram.ui.Components.d6 d6Var3 = this.X3;
        float f24 = d6Var3.f22295c;
        org.telegram.ui.Components.d6 d6Var4 = this.Y3;
        float f25 = d6Var4.f22295c;
        if (this.G2) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        d6Var2.d(f11, false);
        if (!this.f48182i3) {
            t1 t1Var2 = this.f48157b2;
            if (t1Var2 != null && !TextUtils.isEmpty(t1Var2.getFieldText())) {
                f21 = 1.0f;
            } else {
                f21 = 0.0f;
            }
            d6Var3.d(f21, false);
        }
        t1 t1Var3 = this.f48157b2;
        if (t1Var3 != null && t1Var3.y3) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        d6Var4.d(f12, false);
        final t1 t1Var4 = this.f48157b2;
        if (t1Var4 != null) {
            a3 a3Var = t1Var4.f48891r5;
            int backgroundTop = t1Var4.getBackgroundTop();
            int i13 = t1Var4.f48889o5;
            if (i13 != 0 && backgroundTop != i13) {
                int i14 = (t1Var4.S1 + i13) - backgroundTop;
                t1Var4.setAnimatedTop(i14);
                a3Var.V2 = true;
                ValueAnimator valueAnimator = a3Var.f48169e2;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    a3Var.f48169e2.cancel();
                }
                View view = t1Var4.F1;
                if (view != null && view.getVisibility() == 0) {
                    t1Var4.F1.setTranslationY(((1.0f - t1Var4.getTopViewEnterProgress()) * t1Var4.F1.getLayoutParams().height) + t1Var4.S1);
                }
                a3Var.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(i14, 0.0f);
                a3Var.f48169e2 = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                t1 t1Var5 = t1Var4;
                                t1Var5.getClass();
                                t1Var5.setAnimatedTop((int) ((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                a3 a3Var2 = t1Var5.f48891r5;
                                a3Var2.V2 = true;
                                a3Var2.invalidate();
                                t1Var5.invalidate();
                                return;
                            default:
                                t1Var4.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                a3Var.f48169e2.addListener(new yg.b(t1Var4, 7));
                a3Var.f48169e2.setDuration(250L);
                a3Var.f48169e2.setInterpolator(ii.n.V);
                a3Var.f48169e2.start();
                t1Var4.f48889o5 = 0;
            }
            if (t1Var4.f20891m3) {
                float scrollY = (t1Var4.f48890q5 - t1Var4.E0.getScrollY()) + (t1Var4.p5 - t1Var4.E0.getMeasuredHeight());
                rf rfVar = t1Var4.E0;
                rfVar.setOffsetY(rfVar.getOffsetY() - scrollY);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(t1Var4.E0.getOffsetY(), 0.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (r2) {
                            case 0:
                                t1 t1Var5 = t1Var4;
                                t1Var5.getClass();
                                t1Var5.setAnimatedTop((int) ((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                a3 a3Var2 = t1Var5.f48891r5;
                                a3Var2.V2 = true;
                                a3Var2.invalidate();
                                t1Var5.invalidate();
                                return;
                            default:
                                t1Var4.E0.setOffsetY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                                return;
                        }
                    }
                });
                ValueAnimator valueAnimator2 = t1Var4.f48888n5;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                t1Var4.f48888n5 = ofFloat2;
                ofFloat2.setDuration(250L);
                ofFloat2.setInterpolator(ii.n.V);
                ofFloat2.start();
                t1Var4.f20891m3 = false;
                a3Var.l1();
            }
            t1Var4.getMeasuredHeight();
        }
        t1 t1Var5 = this.f48157b2;
        if (t1Var5 != null && t1Var5.t0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        float hideInterfaceAlpha = getHideInterfaceAlpha();
        boolean z12 = this.f48226x2;
        Paint paint = this.f48194n2;
        if (z12) {
            paint.setColor(i0.a.d(this.f48203q2, -14933463, org.telegram.ui.ActionBar.j6.l1(0.44f, -16777216)));
            paint.setAlpha((int) ((1.0f - this.f48167d4) * org.telegram.messenger.a2.A(1.0f, this.f48206r2, paint.getAlpha(), hideInterfaceAlpha)));
        } else {
            paint.setColor(i0.a.k(-16777216, (int) ((1.0f - this.f48167d4) * 137.70001f * hideInterfaceAlpha)));
        }
        boolean z13 = this.V2;
        u7 u7Var = this.J0;
        if (z13 || this.Z3 != u7Var.f48927d0 || d6Var.f22295c != this.Q2 || this.f48209s2 != this.H2 || f10 != this.f48203q2 || f22 != this.f48206r2 || f23 != d6Var2.f22295c || z10 || f25 != d6Var4.f22295c || f24 != d6Var3.f22295c) {
            this.V2 = false;
            this.f48209s2 = this.H2;
            float f26 = d6Var.f22295c;
            float f27 = this.Q2;
            h2 h2Var = this.f48160c1;
            if (f26 != f27) {
                h2Var.invalidate();
            }
            if (f22 != 0.0f) {
                h2Var.setLayerType(2, null);
            } else {
                h2Var.setLayerType(0, null);
            }
            this.Q2 = d6Var.f22295c;
            this.f48206r2 = f22;
            this.f48203q2 = f10;
            this.Z3 = u7Var.f48927d0;
            float height = this.H2 - (getHeight() - h2Var.getBottom());
            if (this.f48157b2 == null) {
                heightWithTopView = 0.0f;
            } else {
                heightWithTopView = t1Var.getHeightWithTopView() * f10;
            }
            float max = Math.max(0.0f, height + heightWithTopView);
            float height2 = this.f48197o2 - (getHeight() - h2Var.getBottom());
            t1 t1Var6 = this.f48157b2;
            if (t1Var6 == null) {
                f14 = 0.0f;
            } else {
                float heightWithTopView2 = t1Var6.getHeightWithTopView();
                if (this.f48218v2) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                f14 = heightWithTopView2 * f13;
            }
            float max2 = Math.max(0.0f, height2 + f14);
            t1 t1Var7 = this.f48157b2;
            if (t1Var7 != null) {
                if (this.f48165d2 != null) {
                    ImageView suggestButton = t1Var7.getSuggestButton();
                    if (suggestButton != null) {
                        this.f48165d2.m(1.0f, -(AndroidUtilities.dp(74.0f) - suggestButton.getTranslationX()));
                    }
                    this.f48165d2.setTranslationY(-((getHeight() - this.f48157b2.getY()) + AndroidUtilities.dp(6.0f)));
                }
                fu editField = this.f48157b2.getEditField();
                hp0 senderSelectView = this.f48157b2.getSenderSelectView();
                if (editField != null) {
                    f20 = 1.0f;
                    f15 = 6.0f;
                    float lerp = AndroidUtilities.lerp(0.88f, 1.0f, f10);
                    editField.setScaleX(lerp);
                    editField.setScaleY(lerp);
                } else {
                    f20 = 1.0f;
                    f15 = 6.0f;
                }
                if (senderSelectView != null) {
                    float lerp2 = AndroidUtilities.lerp(0.8f, f20, f10);
                    senderSelectView.setScaleX(lerp2);
                    senderSelectView.setScaleY(lerp2);
                    senderSelectView.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(2.0f), 0, f10));
                }
            } else {
                f15 = 6.0f;
            }
            if (this.f48226x2) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(58.0f) * (1.0f - f10);
            }
            float max3 = Math.max(0.0f, dp + max);
            if (!this.f48226x2 && !this.f48218v2) {
                i10 = AndroidUtilities.dp(58.0f);
            } else {
                i10 = 0;
            }
            float max4 = Math.max(0.0f, max2 + i10);
            float dp2 = (AndroidUtilities.dp(f15) * f10) + max3;
            o1 o1Var = this.L0;
            zp0 zp0Var = o1Var.f48665c;
            o1Var.K = dp2;
            if (Math.abs(o1Var.L - max4) > 0.1f) {
                o1Var.L = max4;
                f17 = 0.8f;
                f16 = 8.0f;
                zp0Var.setPadding(AndroidUtilities.dp(8.0f), Math.max(0, ((int) max4) - zp0Var.getTop()) + AndroidUtilities.dp(7.5f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.5f));
                if (!zp0Var.canScrollVertically(1)) {
                    o1Var.d.h1(0, AndroidUtilities.dp(100.0f));
                }
            } else {
                f16 = 8.0f;
                f17 = 0.8f;
            }
            o1Var.setTranslationY(-o1Var.K);
            o1Var.invalidate();
            bi.f5 f5Var = u7Var.D0;
            if (f5Var != null) {
                f5Var.setKeyboardOffset(max);
            }
            pk0 pk0Var2 = this.f48172f2;
            z2 z2Var = this.O1;
            if (pk0Var2 != null) {
                if (this.f48203q2 > 0.0f && (z2Var == null || !z2Var.f49132f)) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                pk0Var2.setVisibility(i11);
            }
            int i15 = 0;
            while (true) {
                int childCount = getChildCount();
                b2Var = this.P0;
                imageView = this.N0;
                l2Var = this.K0;
                b2Var2 = this.D0;
                if (i15 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i15);
                if (childAt.getVisibility() == 0 && childAt != this.W1 && childAt.getTag(R.id.parent_tag) == null && childAt != l2Var.W.o(getContext())) {
                    t1 t1Var8 = this.f48157b2;
                    if (t1Var8 != null && childAt == t1Var8.getEmojiView()) {
                        childAt.setTranslationY(this.f48157b2.getEmojiView().getMeasuredHeight() - this.H2);
                    } else if (childAt instanceof s40) {
                        s40 s40Var = (s40) childAt;
                        View view2 = s40Var.e;
                        if (view2 != null) {
                            s40Var.g(view2);
                        }
                    } else if (childAt != this.J2 && childAt != h2Var && childAt != imageView && childAt != this.O0 && childAt != b2Var && childAt != this.W2 && childAt != this.f48165d2 && childAt != b2Var2 && ((pk0Var = this.f48207r3) == null || pk0Var.getReactionsWindow() == null || childAt != this.f48207r3.getReactionsWindow().f46952c)) {
                        float f28 = this.f48203q2;
                        f28 = (childAt == this.X1 || childAt == this.Z1 || childAt == this.a2 || childAt == this.Y1) ? 0.0f : 0.0f;
                        float f29 = 1.0f - f28;
                        float dp3 = (((((-this.K2) * f29) - (AndroidUtilities.dp(7.0f) * f28)) - this.H2) - (AndroidUtilities.dp(f16) * f29)) - (AndroidUtilities.dp(20.0f) * u7Var.f48927d0);
                        if (childAt == this.X1 || childAt == this.Z1 || childAt == this.a2 || childAt == this.Y1) {
                            dp3 += this.H2;
                        }
                        if (this.f48226x2) {
                            f19 = (1.0f - this.f48206r2) * hideInterfaceAlpha;
                        } else {
                            f19 = hideInterfaceAlpha * 1.0f;
                        }
                        if (childAt == this.f48158b3) {
                            dp3 = u7Var.f48927d0 * (-AndroidUtilities.dp(20.0f));
                        }
                        if (childAt == this.f48166d3) {
                            dp3 -= this.f48157b2.getMeasuredHeight() - this.f48157b2.getAnimatedTop();
                            f19 = this.f48203q2;
                            childAt.invalidate();
                        }
                        if (childAt == this.f48161c2) {
                            dp3 -= this.f48157b2.getMeasuredHeight() - this.f48157b2.getAnimatedTop();
                            f19 *= this.f48203q2;
                        }
                        if (childAt == this.f48172f2) {
                            float f30 = (1.0f - d6Var3.f22295c) * (1.0f - f25) * (1.0f - d6Var2.f22295c) * this.f48203q2;
                            float f31 = f19 * f30 * 1.0f;
                            if (childAt.getAlpha() != 0.0f && f31 == 0.0f) {
                                this.f48172f2.n();
                            }
                            childAt.setAlpha(f31);
                            float f32 = (f30 * 0.2f) + f17;
                            childAt.setScaleX(f32);
                            childAt.setScaleY(f32);
                        } else {
                            childAt.setTranslationY(dp3);
                            t1 t1Var9 = this.f48157b2;
                            if (t1Var9 == null || childAt != t1Var9.N1) {
                                childAt.setAlpha(f19);
                            }
                        }
                    }
                } else if (childAt == this.W1) {
                    if (this.f48226x2) {
                        childAt.setAlpha((1.0f - this.f48167d4) * (1.0f - this.f48206r2) * hideInterfaceAlpha);
                    } else {
                        childAt.setAlpha((1.0f - this.f48167d4) * hideInterfaceAlpha);
                    }
                    i15++;
                }
                i15++;
            }
            float f33 = 0.0f;
            float f34 = (1.0f - f22) * hideInterfaceAlpha;
            imageView.setAlpha((1.0f - this.f48167d4) * f34);
            b2Var2.setAlpha((1.0f - this.f48167d4) * f34);
            if (b2Var != null) {
                b2Var.setAlpha((1.0f - this.f48167d4) * f34);
            }
            for (int i16 = 0; i16 < h2Var.getChildCount(); i16++) {
                View childAt2 = h2Var.getChildAt(i16);
                if (childAt2 != null && childAt2 != this.M0) {
                    x2 x2Var = this.f48196o1;
                    m91 m91Var = this.f48228y0;
                    if (childAt2 != x2Var && childAt2 != this.f48220w0 && childAt2 != this.f48224x0 && childAt2 != m91Var && childAt2 != this.W1 && childAt2 != l2Var && childAt2 != this.C0) {
                        childAt2.setAlpha(hideInterfaceAlpha);
                    } else {
                        if (childAt2 == m91Var) {
                            f18 = this.f48170e3;
                        } else {
                            f18 = 1.0f;
                        }
                        if (childAt2 == l2Var) {
                            childAt2.setAlpha((1.0f - this.f48167d4) * f18 * hideInterfaceAlpha);
                        } else {
                            childAt2.setAlpha((1.0f - this.f48167d4) * f18 * hideInterfaceAlpha);
                        }
                    }
                }
            }
            if (this.f48157b2 != null) {
                float dp4 = AndroidUtilities.dp(40.0f);
                if (!z2Var.f49132f) {
                    if (this.S2) {
                        dp4 += AndroidUtilities.dp(46.0f);
                    }
                    if (this.T2 && this.D1) {
                        dp4 += AndroidUtilities.dp(46.0f);
                    }
                    if (b2Var2.getVisibility() == 0) {
                        dp4 = (dp4 - AndroidUtilities.dp(40.0f)) + b2Var2.getLayoutParams().width;
                    }
                } else {
                    float dp5 = AndroidUtilities.dp(46.0f);
                    dp4 = AndroidUtilities.dp(46.0f);
                    b1 b1Var = this.a2;
                    if (b1Var != null && b1Var.getVisibility() == 0) {
                        dp4 += AndroidUtilities.dp(46.0f);
                    }
                    f33 = dp5;
                }
                t1 t1Var10 = this.f48157b2;
                float f35 = -AndroidUtilities.dp(10.0f);
                float f36 = -(AndroidUtilities.dp(10.0f) + dp4 + f33);
                float f37 = this.f48203q2;
                if ((this.S2 || this.E1) && !z2Var.f49132f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                t1Var10.h1(f35, f36, f37, z11);
                if (this.f48157b2.getEmojiView() != null) {
                    this.f48157b2.getEmojiView().setAlpha(this.f48203q2);
                }
            }
        }
    }

    public final void m0(boolean z10) {
        float f7;
        ValueAnimator valueAnimator = this.f48163c4;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f48167d4;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f48163c4 = ofFloat;
        ofFloat.addUpdateListener(new k1(this, 2));
        this.f48163c4.addListener(new p1(this, z10, 1));
        this.f48163c4.setDuration(420L);
        this.f48163c4.setInterpolator(wr.h);
        this.f48163c4.start();
    }

    public final void n0(Runnable runnable) {
        if (MessagesController.getInstance(this.C2).isFrozen()) {
            org.telegram.ui.b.b(this.C2);
            return;
        }
        int i10 = SharedConfig.stealthModeSendMessageConfirm;
        if (i10 > 0 && this.f48187k3) {
            int i11 = i10 - 1;
            SharedConfig.stealthModeSendMessageConfirm = i11;
            SharedConfig.updateStealthModeSendMessageConfirm(i11);
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(getContext(), 0, this.B0);
            d2Var.setTitle(LocaleController.getString(R.string.StealthModeConfirmTitle));
            d2Var.m(LocaleController.getString(R.string.StealthModeConfirmMessage));
            String string = LocaleController.getString(R.string.Proceed);
            th.e eVar = new th.e(runnable, 22);
            d2Var.f17626l0 = string;
            d2Var.m0 = eVar;
            String string2 = LocaleController.getString(R.string.Cancel);
            z9.a aVar = new z9.a(13);
            d2Var.f17628n0 = string2;
            d2Var.f17629o0 = aVar;
            d2Var.show();
            return;
        }
        runnable.run();
    }

    public final void o0(int i10) {
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        this.E2 = false;
        this.V2 = true;
        this.B3 = false;
        this.D1 = false;
        this.E1 = false;
        long j3 = this.B1;
        x2 x2Var = this.f48196o1;
        g9 g9Var = this.f48193n1;
        if (j3 >= 0) {
            if (j3 == UserConfig.getInstance(this.C2).getClientUserId()) {
                z14 = true;
            } else {
                z14 = false;
            }
            this.C1 = z14;
            TLRPC.User user = MessagesController.getInstance(this.C2).getUser(Long.valueOf(this.B1));
            TL_account.RequirementToContact isUserContactBlocked = MessagesController.getInstance(this.C2).isUserContactBlocked(this.B1);
            if (!UserConfig.getInstance(this.C2).isPremium() && DialogObject.isPremiumBlocked(isUserContactBlocked)) {
                z15 = true;
            } else {
                z15 = false;
            }
            this.F1 = z15;
            this.H1 = DialogObject.getMessagesStarsPrice(isUserContactBlocked);
            g9Var.m(this.C2, user);
            x2Var.f49036a.getImageReceiver().setForUserOrChat(user, g9Var);
            W0(this.B1, true, false);
        } else {
            this.C1 = false;
            this.D1 = true;
            if (this.S1.h(j3) || BuildVars.DEBUG_PRIVATE_VERSION) {
                this.B3 = true;
            }
            TLRPC.Chat chat = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1));
            boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
            this.E1 = !isChannelAndNotMegaGroup;
            if (!isChannelAndNotMegaGroup && MessagesController.getInstance(this.C2).getChatFull(-this.B1) == null) {
                MessagesStorage.getInstance(this.C2).loadChatInfo(-this.B1, true, new CountDownLatch(1), false, false);
            }
            if (this.E1 && !ChatObject.canSendPlain(chat)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.F1 = z10;
            this.H1 = MessagesController.getInstance(this.C2).getSendPaidMessagesStars(this.B1);
            g9Var.k(this.C2, chat);
            x2Var.f49036a.getImageReceiver().setForUserOrChat(chat, g9Var);
            W0(this.B1, true, false);
        }
        if (this.K1 && (this.C1 || this.D1)) {
            i5 i5Var = this.S1;
            long j10 = this.B1;
            a0.i iVar = i5Var.f48508m;
            d8 d8Var = (d8) iVar.f(j10);
            if (d8Var == null) {
                d8Var = new d8(i5Var.f48499a, j10, i5Var);
                iVar.k(d8Var, j10);
            }
            d8Var.b(true);
        }
        j1();
        this.J1 = i10;
        if (i10 < 0) {
            this.J1 = 0;
        }
        this.W0 = 0L;
        this.Y0 = false;
        this.J3 = null;
        this.K3 = null;
        boolean z16 = this.D1;
        h2 h2Var = this.f48160c1;
        u7 u7Var = this.J0;
        int i13 = 8;
        z2 z2Var = this.O1;
        if (z16) {
            B0();
            if (this.f48157b2 == null && (this.E1 || z2Var.f49132f)) {
                v0();
            }
            if (this.f48157b2 != null) {
                TLRPC.Chat chat2 = MessagesController.getInstance(this.C2).getChat(Long.valueOf(-this.B1));
                t1 t1Var = this.f48157b2;
                if (z2Var.f49132f || (!I0() && this.E1 && (ChatObject.canSendPlain(chat2) || ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat2)))) {
                    i13 = 0;
                }
                t1Var.setVisibility(i13);
                t1 t1Var2 = this.f48157b2;
                boolean z17 = z2Var.f49132f;
                D0(true);
                t1Var2.i1(z17);
                t1 t1Var3 = this.f48157b2;
                if (z2Var.f49132f && !D0(true) && (this.f48218v2 || this.f48157b2.W0)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                t1Var3.o1(z13, true);
                fu editField = this.f48157b2.getEditField();
                long j11 = this.B1;
                TL_stories.StoryItem storyItem = z2Var.f49129a;
                u7Var.getClass();
                editField.setText(u7.u(j11, storyItem));
                this.f48157b2.b1(this.C2, this.B1);
                this.f48157b2.K1(chat2, null);
            }
            org.telegram.ui.Components.n6 n6Var = this.Q0;
            org.telegram.ui.ActionBar.f6 f6Var = this.B0;
            if (n6Var == null) {
                org.telegram.ui.Components.n6 n6Var2 = new org.telegram.ui.Components.n6(false, false, false, false);
                this.Q0 = n6Var2;
                b2 b2Var = this.D0;
                n6Var2.setCallback(b2Var);
                this.Q0.r(f6Var.F0(org.telegram.ui.ActionBar.j6.G6));
                this.Q0.t(AndroidUtilities.dp(14.0f));
                this.S0 = new org.telegram.ui.Components.d6(b2Var);
            }
            b2 b2Var2 = this.P0;
            if (b2Var2 != null && this.R0 == null) {
                org.telegram.ui.Components.n6 n6Var3 = new org.telegram.ui.Components.n6(false, false, false, false);
                this.R0 = n6Var3;
                n6Var3.setCallback(b2Var2);
                this.R0.r(f6Var.F0(org.telegram.ui.ActionBar.j6.G6));
                this.R0.t(AndroidUtilities.dp(14.0f));
                this.T0 = new org.telegram.ui.Components.d6(b2Var2);
            }
            if (i10 == -1) {
                i1();
            }
            f1(false);
            this.A1 = getStoriesCount();
            h2Var.invalidate();
            invalidate();
        } else if (this.C1) {
            B0();
            if (z2Var.f49132f) {
                this.W1.setVisibility(8);
                if (this.f48157b2 == null) {
                    v0();
                }
                this.f48157b2.setVisibility(0);
            } else {
                this.W1.setVisibility(0);
                t1 t1Var4 = this.f48157b2;
                if (t1Var4 != null) {
                    t1Var4.setVisibility(8);
                }
            }
            t1 t1Var5 = this.f48157b2;
            if (t1Var5 != null) {
                boolean z18 = z2Var.f49132f;
                D0(true);
                t1Var5.i1(z18);
                t1 t1Var6 = this.f48157b2;
                if (z2Var.f49132f && !D0(true) && (this.f48218v2 || this.f48157b2.W0)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                t1Var6.o1(z12, true);
            }
            if (i10 == -1) {
                ArrayList arrayList = this.f48232z1;
                if (arrayList != null) {
                    int indexOf = arrayList.indexOf(Integer.valueOf(u7Var.P0));
                    if (indexOf < 0 && !this.f48232z1.isEmpty()) {
                        if (u7Var.P0 > ((Integer) this.f48232z1.get(0)).intValue()) {
                            indexOf = 0;
                        } else if (u7Var.P0 < ((Integer) hc.b.i(1, this.f48232z1)).intValue()) {
                            indexOf = this.f48232z1.size() - 1;
                        }
                    }
                    this.J1 = Math.max(0, indexOf);
                } else {
                    boolean isEmpty = this.f48221w1.isEmpty();
                    ArrayList arrayList2 = this.f48217v1;
                    if (!isEmpty) {
                        this.J1 = arrayList2.size();
                    } else {
                        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                            if (((TL_stories.StoryItem) arrayList2.get(i14)).justUploaded || ((TL_stories.StoryItem) arrayList2.get(i14)).f17435id > this.S1.f48502f.get(this.B1)) {
                                this.J1 = i14;
                                break;
                            }
                        }
                    }
                }
            }
            f1(false);
            h2Var.invalidate();
            invalidate();
        } else {
            if (this.f48157b2 == null) {
                v0();
            }
            if (this.F1 && this.f48175g2 == null) {
                z0();
            }
            if (this.f48175g2 != null) {
                if (this.F1 || this.G1) {
                    h1();
                }
                LinearLayout linearLayout = this.f48175g2;
                if ((this.F1 && !z2Var.f49132f) || this.G1) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                linearLayout.setVisibility(i12);
            }
            u6 u6Var = this.f48184j2;
            if (u6Var != null) {
                u6Var.setVisibility(8);
            }
            if (i10 == -1) {
                i1();
            }
            f1(false);
            t1 t1Var7 = this.f48157b2;
            if (t1Var7 != null) {
                if (!I0() && !UserObject.isService(this.B1)) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                t1Var7.setVisibility(i11);
                t1 t1Var8 = this.f48157b2;
                boolean z19 = z2Var.f49132f;
                D0(true);
                t1Var8.i1(z19);
                t1 t1Var9 = this.f48157b2;
                if (z2Var.f49132f && !D0(true) && (this.f48218v2 || this.f48157b2.W0)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                t1Var9.o1(z11, true);
                fu editField2 = this.f48157b2.getEditField();
                long j12 = this.B1;
                TL_stories.StoryItem storyItem2 = z2Var.f49129a;
                u7Var.getClass();
                editField2.setText(u7.u(j12, storyItem2));
                this.f48157b2.b1(this.C2, this.B1);
                TLRPC.UserFull userFull = MessagesController.getInstance(this.C2).getUserFull(this.B1);
                if (userFull != null) {
                    this.f48157b2.K1(null, userFull);
                } else {
                    MessagesController.getInstance(this.C2).loadFullUser(MessagesController.getInstance(this.C2).getUser(Long.valueOf(this.B1)), this.f48233z2, false);
                }
            }
            this.A1 = getStoriesCount();
            b2 b2Var3 = this.W1;
            if (b2Var3 != null) {
                b2Var3.setVisibility(8);
            }
            h2Var.invalidate();
            invalidate();
        }
        r0(false);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f48153a1 = true;
        this.f48168e1.onAttachedToWindow();
        this.f48174g1.onAttachedToWindow();
        this.f48171f1.onAttachedToWindow();
        this.f48189l3.onAttachedToWindow();
        this.f48195n3.onAttachedToWindow();
        t1 t1Var = this.f48157b2;
        if (t1Var != null) {
            t1Var.E0();
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f48177h1;
            if (i10 < arrayList.size()) {
                ((yg.g0) arrayList.get(i10)).b(true);
                i10++;
            } else {
                NotificationCenter.getInstance(this.C2).addObserver(this, NotificationCenter.chatInfoDidLoad);
                NotificationCenter.getInstance(this.C2).addObserver(this, NotificationCenter.liveStoryUpdated);
                NotificationCenter.getInstance(this.C2).addObserver(this, NotificationCenter.storiesUpdated);
                NotificationCenter.getInstance(this.C2).addObserver(this, NotificationCenter.storyQualityUpdate);
                NotificationCenter.getInstance(this.C2).addObserver(this, NotificationCenter.storiesListUpdated);
                NotificationCenter.getInstance(this.C2).addObserver(this, NotificationCenter.stealthModeChanged);
                NotificationCenter.getInstance(this.C2).addObserver(this, NotificationCenter.storiesLimitUpdate);
                NotificationCenter.getInstance(this.C2).addObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
                NotificationCenter.getInstance(this.C2).addObserver(this, NotificationCenter.didLoadSendAsPeers);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f48153a1 = false;
        this.f48168e1.onDetachedFromWindow();
        this.f48174g1.onDetachedFromWindow();
        this.f48171f1.onDetachedFromWindow();
        this.f48189l3.onDetachedFromWindow();
        this.f48195n3.onDetachedFromWindow();
        t1 t1Var = this.f48157b2;
        if (t1Var != null) {
            t1Var.D0();
        }
        org.telegram.ui.Components.p5 p5Var = this.f48198o3;
        if (p5Var != null) {
            p5Var.o(this);
            this.f48198o3 = null;
        }
        yg.e eVar = this.f48192m3;
        if (eVar != null) {
            eVar.d(this);
            this.f48192m3 = null;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f48177h1;
            if (i10 < arrayList.size()) {
                ((yg.g0) arrayList.get(i10)).b(false);
                i10++;
            } else {
                NotificationCenter.getInstance(this.C2).removeObserver(this, NotificationCenter.chatInfoDidLoad);
                NotificationCenter.getInstance(this.C2).removeObserver(this, NotificationCenter.liveStoryUpdated);
                NotificationCenter.getInstance(this.C2).removeObserver(this, NotificationCenter.storiesUpdated);
                NotificationCenter.getInstance(this.C2).removeObserver(this, NotificationCenter.storyQualityUpdate);
                NotificationCenter.getInstance(this.C2).removeObserver(this, NotificationCenter.storiesListUpdated);
                NotificationCenter.getInstance(this.C2).removeObserver(this, NotificationCenter.stealthModeChanged);
                NotificationCenter.getInstance(this.C2).removeObserver(this, NotificationCenter.storiesLimitUpdate);
                NotificationCenter.getInstance(this.C2).removeObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
                NotificationCenter.getInstance(this.C2).removeObserver(this, NotificationCenter.didLoadSendAsPeers);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
                return;
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f48225x1.d.setBounds(0, 0, getMeasuredWidth(), AndroidUtilities.dp(72.0f));
    }

    @Override
    public final void onMeasure(int r23, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: zh.a3.onMeasure(int, int):void");
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f48203q2 = -1.0f;
        this.V2 = true;
        invalidate();
    }

    public final void p0() {
        l2 l2Var = this.K0;
        if (l2Var.W.y()) {
            l2Var.W.f(false);
        }
    }

    public final void q0() {
        if (this.K1) {
            ((l7) this.Q1).d.P();
        }
    }

    public final void r0(boolean z10) {
        int i10;
        if (this.f48157b2 != null && this.f48173f3 && this.f48153a1) {
            j1 j1Var = this.P3;
            AndroidUtilities.cancelRunOnUIThread(j1Var);
            TL_stories.TL_storiesStealthMode tL_storiesStealthMode = this.S1.B;
            this.f48157b2.K(true);
            boolean z11 = this.F1;
            z2 z2Var = this.O1;
            if ((z11 && !z2Var.f49132f) || this.G1) {
                this.f48187k3 = false;
                this.f48157b2.setEnabled(false);
                this.f48157b2.j1(" ", z10);
            } else if (this.H1 > 0) {
                this.f48187k3 = false;
                this.f48157b2.setEnabled(true);
                this.f48157b2.j1(xh.z7.Q0(LocaleController.formatString(R.string.TypeMessageForStars, LocaleController.formatNumber(this.H1, ','))), z10);
            } else {
                if (!z2Var.f49132f && tL_storiesStealthMode != null) {
                    int currentTime = ConnectionsManager.getInstance(this.C2).getCurrentTime();
                    int i11 = tL_storiesStealthMode.active_until_date;
                    if (currentTime < i11) {
                        this.f48187k3 = true;
                        int currentTime2 = i11 - ConnectionsManager.getInstance(this.C2).getCurrentTime();
                        int i12 = currentTime2 / 60;
                        int i13 = currentTime2 % 60;
                        int i14 = R.string.StealthModeActiveHintShort;
                        Locale locale = Locale.US;
                        String formatString = LocaleController.formatString(i14, String.format(locale, "%02d:%02d", 99, 99));
                        this.f48157b2.setEnabled(true);
                        if (((int) this.f48157b2.getEditField().getPaint().measureText(formatString)) * 1.2f >= this.f48157b2.getEditField().getMeasuredWidth()) {
                            t1 t1Var = this.f48157b2;
                            String formatString2 = LocaleController.formatString(R.string.StealthModeActiveHintShort, "");
                            String format = String.format(locale, "%02d:%02d", Integer.valueOf(i12), Integer.valueOf(i13));
                            t1Var.e = formatString2;
                            t1Var.f20849f = format;
                            t1Var.G1(z10);
                        } else {
                            this.f48157b2.j1(LocaleController.formatString(R.string.StealthModeActiveHint, String.format(locale, "%02d:%02d", Integer.valueOf(i12), Integer.valueOf(i13))), z10);
                        }
                        AndroidUtilities.runOnUIThread(j1Var, 1000L);
                        return;
                    }
                }
                this.f48187k3 = false;
                this.f48157b2.setEnabled(true);
                if (z2Var.f49132f) {
                    long starsPrice = this.f48157b2.getStarsPrice();
                    if (starsPrice > 0) {
                        this.f48157b2.j1(xh.z7.V0(false, LocaleController.formatString(R.string.CommentFor, LocaleController.formatNumber((int) starsPrice, ',')), this.f48157b2.N4), z10);
                        uq uqVar = this.f48157b2.N4[0];
                        if (uqVar != null) {
                            uqVar.spaceScaleX = 0.9f;
                            return;
                        }
                        return;
                    }
                    this.f48157b2.j1(LocaleController.getString(R.string.Comment), z10);
                    return;
                }
                t1 t1Var2 = this.f48157b2;
                if (this.E1) {
                    i10 = R.string.ReplyToGroupStory;
                } else {
                    i10 = R.string.ReplyPrivately;
                }
                t1Var2.j1(LocaleController.getString(i10), z10);
            }
        }
    }

    public final boolean s0() {
        if (this.f48210s3) {
            if (this.f48207r3.getReactionsWindow() != null) {
                if (this.f48230y2 > 0) {
                    AndroidUtilities.hideKeyboard(this.f48207r3.getReactionsWindow().f46952c);
                    return true;
                }
                this.f48207r3.getReactionsWindow().d();
                return true;
            }
            b1(false);
            return true;
        }
        f2 f2Var = this.f48183j1;
        if (f2Var != null) {
            bi.x4 x4Var = f2Var.f49117c;
            if (x4Var != null) {
                x4Var.e(true);
                f2Var.f49117c = null;
            }
            f2Var.f49116b = null;
            f2Var.invalidate();
            f2Var.b(false);
        }
        l2 l2Var = this.K0;
        if (l2Var.W.y()) {
            l2Var.W.f(false);
            return true;
        }
        bi.x4 x4Var2 = this.F0;
        if (x4Var2 != null) {
            x4Var2.e(true);
        }
        bi.x4 x4Var3 = this.G0;
        if (x4Var3 != null) {
            x4Var3.e(true);
        }
        s40 s40Var = this.W2;
        if (s40Var != null) {
            s40Var.b(true);
        }
        v2 v2Var = this.f48211t1;
        if (v2Var != null && v2Var.f22473b) {
            v2Var.a();
            return true;
        }
        t1 t1Var = this.f48157b2;
        if (t1Var != null && t1Var.v0()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.B0);
            if (this.f48157b2.f20832c1) {
                alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.DiscardVideoMessageTitle);
                alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.DiscardVideoMessageDescription);
            } else {
                alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.DiscardVoiceMessageTitle);
                alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.DiscardVoiceMessageDescription);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.DiscardVoiceMessageAction), new g1(this, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.Continue), null);
            ((l7) this.Q1).h(alertDialog$Builder.f17528a);
            return true;
        }
        pk0 pk0Var = this.f48172f2;
        if (pk0Var != null && pk0Var.getReactionsWindow() != null && !this.f48172f2.getReactionsWindow().f46963q) {
            this.f48172f2.getReactionsWindow().d();
            return true;
        }
        t1 t1Var2 = this.f48157b2;
        if (t1Var2 != null && t1Var2.t0()) {
            if (this.f48230y2 > 0) {
                AndroidUtilities.hideKeyboard(this.f48157b2.getEmojiView());
                return true;
            }
            this.f48157b2.n0(true, false, true);
            return true;
        } else if (getKeyboardHeight() >= AndroidUtilities.dp(20.0f)) {
            t1 t1Var3 = this.f48157b2;
            if (t1Var3 != null) {
                long j3 = this.B1;
                TL_stories.StoryItem storyItem = this.O1.f49129a;
                Editable editText = t1Var3.getEditText();
                this.J0.getClass();
                u7.J(j3, storyItem, editText);
            }
            AndroidUtilities.hideKeyboard(this.f48157b2);
            return true;
        } else if (l2Var.getVisibility() != 0 || l2Var.getProgressToBlackout() <= 0.0f) {
            return false;
        } else {
            l2Var.C();
            this.f48176g3 = false;
            this.f48160c1.invalidate();
            return true;
        }
    }

    public void setAccount(int i10) {
        this.C2 = i10;
        this.S1 = MessagesController.getInstance(i10).storiesController;
        this.f48185k1.f33816b = i10;
        pk0 pk0Var = this.f48172f2;
        if (pk0Var != null) {
            pk0Var.setCurrentAccount(i10);
            this.f48172f2.p(null, null, true);
        }
        pk0 pk0Var2 = this.f48207r3;
        if (pk0Var2 != null) {
            pk0Var2.setCurrentAccount(i10);
        }
    }

    public void setActive(boolean z10) {
        T0(0L, z10);
    }

    public void setDelegate(w2 w2Var) {
        this.Q1 = w2Var;
    }

    public void setIsVisible(boolean z10) {
        if (this.f48173f3 != z10) {
            this.f48173f3 = z10;
            if (z10) {
                this.f48168e1.setCurrentAlpha(1.0f);
                r0(false);
            }
        }
    }

    public void setLongpressed(boolean z10) {
        if (this.K1) {
            this.L2 = z10;
            invalidate();
        }
    }

    public void setOffset(float f7) {
        boolean z10;
        if (f7 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f48156b1 != z10) {
            this.f48156b1 = z10;
            this.f48160c1.invalidate();
            if (this.K1 && this.J0.f48918a && Build.VERSION.SDK_INT < 33) {
                sg.a1 a1Var = this.V3;
                if (z10) {
                    AndroidUtilities.cancelRunOnUIThread(a1Var);
                    AndroidUtilities.runOnUIThread(a1Var, 250L);
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(a1Var);
                u7 u7Var = ((l7) this.Q1).d;
                u7Var.l1 = true;
                u7Var.P();
            }
        }
    }

    public void setPaused(boolean z10) {
        if (this.R1 != z10) {
            this.R1 = z10;
            gg.h1 h1Var = this.f48168e1;
            if (z10) {
                h1Var.stopAnimation();
                h1Var.setAllowStartAnimation(false);
            } else {
                h1Var.startAnimation();
                h1Var.setAllowStartAnimation(true);
            }
            this.X0 = 0L;
            this.f48160c1.invalidate();
        }
    }

    public final void t0() {
        if (this.I2 == null) {
            gg.m mVar = new gg.m(this, getContext(), this.B0);
            this.I2 = mVar;
            mVar.Z1 = new x1(this);
            mVar.f29378j0.f0();
            gg.m mVar2 = this.I2;
            mVar2.W = true;
            mVar2.r1();
            gg.m mVar3 = this.I2;
            mVar3.X = new y1(this);
            mVar3.m1().setText(this.f48157b2.getFieldText());
        }
    }

    public final void u0() {
        if (this.X1 == null && getContext() != null) {
            a aVar = new a(getContext(), this.I3);
            this.X1 = aVar;
            aVar.setOnClickListener(new l1(this, 1));
            addView(this.X1, w7.a6.d(46, 42.0f, 83, 7.0f, 0.0f, 7.0f, 3.0f));
        }
    }

    public final void v0() {
        org.telegram.ui.ActionBar.f6 f6Var = this.B0;
        t1 t1Var = new t1(this, AndroidUtilities.findActivity(getContext()), this, new bi.n1(6, f6Var));
        this.f48157b2 = t1Var;
        t1Var.getEditField().useAnimatedTextDrawable();
        this.f48157b2.getEditField().setScaleX(0.0f);
        this.f48157b2.setOverrideKeyboardAnimation(true);
        this.f48157b2.setClipChildren(false);
        this.f48157b2.setDelegate(new u1(this));
        setDelegate(this.f48157b2);
        t1 t1Var2 = this.f48157b2;
        t1Var2.f20952x4 = false;
        t1Var2.f20957y4 = true;
        if (this.O1.f49132f) {
            t1Var2.V0(false, false, false);
        } else {
            t1Var2.V0(true, true, false);
        }
        this.f48157b2.e();
        t1 t1Var3 = this.f48157b2;
        t1Var3.f20962z4 = true;
        addView(t1Var3, w7.a6.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        if (this.O3 != null) {
            this.f48157b2.P1(false);
        }
        this.f48157b2.F2 = this.f48233z2;
        k2.v vVar = this.M2;
        ((ArrayList) vVar.f12228g).add(this.f48160c1);
        ((ArrayList) vVar.f12228g).add(this);
        if (this.f48153a1) {
            this.f48157b2.E0();
        }
        r0(false);
        if (I0()) {
            this.f48157b2.setVisibility(8);
        }
        ih.h hVar = new ih.h(getContext(), f6Var, this.I3, this.F3);
        this.f48161c2 = hVar;
        hVar.setOnClickListener(new g1(this, 1));
        addView(this.f48161c2, w7.a6.e(57, 300, 85));
        this.f48161c2.setVisibility(8);
        this.f48157b2.setSideButtonsForAttach(this.f48161c2);
        this.I0 = getChildCount();
    }

    public final void w0() {
        if (this.f48184j2 != null) {
            return;
        }
        u6 u6Var = new u6(getContext(), this.B0);
        this.f48184j2 = u6Var;
        u6Var.setOnClickListener(new l1(this, 4));
        this.f48184j2.setAlpha(0.0f);
        this.f48184j2.setVisibility(8);
        addView(this.f48184j2, w7.a6.d(-1, -2.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void x0() {
        boolean z10;
        if (this.a2 == null && getContext() != null) {
            b1 b1Var = new b1(getContext(), this.I3);
            this.a2 = b1Var;
            b1Var.setOnClickListener(new l1(this, 5));
            b1 b1Var2 = this.a2;
            t0 t0Var = t0.W;
            boolean z11 = true;
            if (t0Var != null && t0Var.o()) {
                z10 = true;
            } else {
                z10 = false;
            }
            b1Var2.b(z10, false);
            b1 b1Var3 = this.a2;
            t0 t0Var2 = t0.W;
            if (t0Var2 != null && !t0Var2.m()) {
                z11 = false;
            }
            b1Var3.a(z11, false);
            addView(this.a2, w7.a6.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
        }
    }

    public final void y0() {
        if (this.Z1 == null && getContext() != null) {
            this.Y1 = new e1(getContext(), this.C2);
            f1 f1Var = new f1(getContext(), this.Y1, this.I3);
            this.Z1 = f1Var;
            f1Var.setOnClickListener(new l1(this, 6));
            this.Z1.setOnLongClickListener(new i1(this, 1));
            addView(this.Z1, w7.a6.d(46, 42.0f, 85, 7.0f, 0.0f, 7.0f, 3.0f));
            addView(this.Y1, w7.a6.d(200, 200.0f, 85, 0.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    public final void z0() {
        int i10;
        if (this.f48175g2 != null) {
            return;
        }
        if (this.f48157b2 == null) {
            v0();
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f48175g2 = linearLayout;
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(1.35f);
        imageView.setScaleY(1.35f);
        imageView.setImageResource(R.drawable.mini_switch_lock);
        imageView.setColorFilter(new PorterDuffColorFilter(-8026747, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(getContext());
        this.f48178h2 = textView;
        textView.setTextColor(-8026747);
        this.f48178h2.setTextSize(1, 16.0f);
        TextView textView2 = this.f48178h2;
        if (this.E1) {
            i10 = R.string.StoryGroupRepliesLocked;
        } else {
            i10 = R.string.StoryRepliesLocked;
        }
        textView2.setText(LocaleController.getString(i10));
        TextView textView3 = new TextView(getContext());
        this.f48181i2 = textView3;
        textView3.setTextColor(-1);
        this.f48181i2.setTextSize(1, 12.0f);
        TextView textView4 = this.f48181i2;
        int dp = AndroidUtilities.dp(40.0f);
        textView4.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, 452984831, 855638015, 855638015));
        this.f48181i2.setGravity(17);
        w7.c6.a(this.f48181i2);
        this.f48181i2.setText(LocaleController.getString(R.string.StoryRepliesLockedButton));
        this.f48181i2.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
        this.f48175g2.addView(imageView, w7.a6.t(22, 22, 16, 12, 1, 4, 0));
        this.f48175g2.addView(this.f48178h2, w7.a6.r(-2, -2, 16, 0.0f, -0.33f, 0.0f, 0.0f));
        this.f48175g2.addView(this.f48181i2, w7.a6.r(-2, 19, 16, 5.0f, -0.33f, 0.0f, 0.0f));
        this.f48157b2.addView(this.f48175g2, w7.a6.d(-1, -1.0f, 119, 14.0f, 0.0f, 8.0f, 0.0f));
    }
}
