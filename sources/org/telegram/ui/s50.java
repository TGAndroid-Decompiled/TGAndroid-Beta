package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.EmojiData;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;
import org.webrtc.voiceengine.WebRtcAudioTrack;

public final class s50 extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate, VoIPService.StateListener, ud.b {
    public static boolean A3;
    public static boolean B3;
    public static boolean C3;
    public static volatile DispatchQueue D3 = new DispatchQueue("updateTextureLightningQueue");
    public static boolean E3;

    public static s50 f42409z3;
    public final Paint A;
    public final ArrayList A0;
    public org.telegram.ui.Components.g30 A1;
    public LinearLayout A2;
    public final u30 B;
    public final ArrayList B0;
    public int B1;
    public boolean B2;
    public final t30 C;
    public final ArrayList C0;
    public boolean C1;
    public final org.telegram.ui.Components.oi0 C2;
    public final r30 D;
    public final ArrayList D0;
    public boolean D1;
    public int D2;
    public final ImageView E;
    public int E0;
    public final Paint E1;
    public boolean E2;
    public final ImageView F;
    public final org.telegram.ui.Components.oi0 F0;
    public final Paint F1;
    public final View F2;
    public org.telegram.ui.Components.wj0 G;
    public final org.telegram.ui.Components.oi0 G0;
    public final r50[] G1;
    public final View G2;
    public final w40 H;
    public boolean H0;
    public float H1;
    public GradientDrawable H2;
    public final org.telegram.ui.Components.j6 I;
    public final org.telegram.ui.Components.s9 I0;
    public r50 I1;
    public final int[] I2;
    public final c30 J;
    public final org.telegram.ui.Components.s9 J0;
    public r50 J1;
    public final g30 J2;
    public final o40 K;
    public float K0;
    public long K1;
    public boolean K2;
    public final m50 L;
    public float L0;
    public float L1;
    public boolean L2;
    public final y40 M;
    public float M0;
    public float M1;
    public RenderNode M2;
    public final a40 N;
    public RadialGradient N0;
    public boolean N1;
    public float N2;
    public final TextView O;
    public final Matrix O0;
    public boolean O1;
    public boolean O2;
    public final y30 P;
    public final Paint P0;
    public int P1;
    public final String[] P2;
    public final org.telegram.ui.ActionBar.h5 Q;
    public final h50 Q0;
    public float Q1;
    public ObjectAnimator Q2;
    public final x40 R;
    public float R0;
    public int R1;
    public ObjectAnimator R2;
    public final org.telegram.ui.ActionBar.h5 S;
    public float S0;
    public boolean S1;
    public final g40 S2;
    public final g50 T;
    public ValueAnimator T0;
    public final int[] T1;
    public org.telegram.ui.Cells.b4 T2;
    public final org.telegram.ui.Components.cz U;
    public TLRPC.InputPeer U0;
    public final ArrayList U1;
    public org.telegram.ui.Components.voip.l U2;
    public final ImageReceiver V;
    public TLRPC.Chat V0;
    public final ArrayList V1;
    public org.telegram.ui.Components.voip.t V2;
    public int W;
    public ChatObject.Call W0;
    public final j30 W1;
    public org.telegram.ui.Components.e20 W2;
    public final ImageView X;
    public final boolean X0;
    public final o30 X1;
    public boolean X2;
    public final ug.i Y;
    public final String Y0;
    public final b40 Y1;
    public boolean Y2;
    public final int Z;
    public final n50 Z0;
    public float Z1;
    public int Z2;

    public final RadialProgressView f42410a0;

    public final b30 f42411a1;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout a2;
    public AnimatorSet a3;

    public final l30 f42412b;

    public final Drawable f42413b0;

    public final d30 f42414b1;

    public boolean f42415b2;

    public s40 f42416b3;

    public final p20 f42417c;

    public final View f42418c0;

    public final Paint f42419c1;

    public boolean f42420c2;

    public int f42421c3;
    public final AccountInstance d;

    public AnimatorSet f42422d0;

    public ValueAnimator f42423d1;

    public org.telegram.ui.Components.j40 f42424d2;

    public int f42425d3;

    public final v20 f42426e;

    public LaunchActivity f42427e0;

    public float f42428e1;

    public z40 f42429e2;

    public int f42430e3;

    public final org.telegram.ui.Components.voip.u2 f42431f;

    public final UndoView[] f42432f0;

    public final LinearLayout f42433f1;

    public Boolean f42434f2;

    public int f42435f3;

    public final org.telegram.ui.Cells.k f42436g0;

    public final org.telegram.ui.ActionBar.v0 f42437g1;

    public int f42438g2;

    public int f42439g3;
    public final org.telegram.ui.Components.voip.u2 h;

    public boolean f42440h0;

    public final org.telegram.ui.ActionBar.v0 f42441h1;

    public boolean f42442h2;

    public int f42443h3;

    public org.telegram.ui.Components.x30 f42444i0;

    public final org.telegram.ui.ActionBar.v0 f42445i1;

    public final f30 f42446i2;

    public int f42447i3;

    public org.telegram.ui.Components.x30 f42448j0;

    public final org.telegram.ui.ActionBar.f1 f42449j1;

    public final org.telegram.ui.Components.zk0 f42450j2;

    public int f42451j3;

    public int f42452k0;

    public final org.telegram.ui.ActionBar.f1 f42453k1;

    public final y50 f42454k2;

    public int f42455k3;

    public c50 f42456l0;
    public final org.telegram.ui.ActionBar.f1 l1;

    public final org.telegram.ui.Components.f20 f42457l2;

    public int f42458l3;
    public final ArrayList m0;

    public final org.telegram.ui.ActionBar.f1 f42459m1;

    public ViewTreeObserver.OnPreDrawListener f42460m2;

    public int f42461m3;

    public final org.telegram.ui.Components.voip.u2 f42462n;

    public m40 f42463n0;

    public final org.telegram.ui.ActionBar.f1 f42464n1;

    public final org.telegram.ui.Components.voip.h f42465n2;

    public int f42466n3;

    public boolean f42467o0;

    public final org.telegram.ui.ActionBar.f1 f42468o1;

    public boolean f42469o2;

    public int f42470o3;

    public long f42471p0;

    public final org.telegram.ui.ActionBar.f1 f42472p1;

    public final ArrayList f42473p2;

    public int f42474p3;

    public boolean f42475q0;

    public final org.telegram.ui.ActionBar.f1 f42476q1;

    public boolean f42477q2;

    public int f42478q3;

    public final org.telegram.ui.Components.voip.u2 f42479r;

    public final RectF f42480r0;

    public final org.telegram.ui.ActionBar.f1 f42481r1;

    public final e20 f42482r2;

    public int f42483r3;

    public final org.telegram.ui.Components.voip.u2 f42484s;

    public boolean f42485s0;

    public final org.telegram.ui.ActionBar.f1 f42486s1;

    public final z20 f42487s2;

    public final t40 f42488s3;

    public boolean f42489t0;

    public final org.telegram.ui.ActionBar.f1 f42490t1;

    public final org.telegram.ui.Components.gc f42491t2;

    public Boolean f42492t3;

    public float f42493u0;

    public final org.telegram.ui.ActionBar.f1 f42494u1;

    public final e20 f42495u2;

    public Integer f42496u3;
    public final org.telegram.ui.Components.voip.u2 v;

    public d40 f42497v0;

    public final LinearLayout f42498v1;

    public boolean f42499v2;

    public final ud.a f42500v3;

    public final org.telegram.ui.Components.voip.u2 f42501w;

    public TLRPC.Peer f42502w0;

    public final TextView f42503w1;

    public final w5 f42504w2;

    public final ud.a f42505w3;

    public final w20 f42506x;

    public TLObject f42507x0;

    public final q50 f42508x1;

    public final LongSparseIntArray f42509x2;

    public final ud.c f42510x3;

    public final ImageView f42511y;

    public final Paint f42512y0;

    public final yg.i f42513y1;

    public final m30 f42514y2;

    public final ud.a f42515y3;

    public final ArrayList f42516z0;

    public e20 f42517z1;

    public final k30 f42518z2;

    public s50(final LaunchActivity launchActivity, AccountInstance accountInstance, ChatObject.Call call, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        final LaunchActivity launchActivity2;
        final s50 s50Var;
        TLRPC.Chat chat2;
        ConferenceCall conferenceCall;
        super(launchActivity, null, true, true);
        this.A = new Paint(1);
        this.f42432f0 = new UndoView[2];
        this.m0 = new ArrayList();
        this.f42480r0 = new RectF();
        this.f42512y0 = new Paint(1);
        this.f42516z0 = new ArrayList();
        this.A0 = new ArrayList();
        this.B0 = new ArrayList();
        this.C0 = new ArrayList();
        this.D0 = new ArrayList();
        this.f42513y1 = new yg.i(new e20(this, 8));
        int i10 = 0;
        this.B1 = 0;
        this.C1 = false;
        this.E1 = new Paint(7);
        this.F1 = new Paint(7);
        this.G1 = new r50[8];
        this.H1 = 1.0f;
        this.S1 = true;
        this.T1 = new int[4];
        this.U1 = new ArrayList();
        this.V1 = new ArrayList();
        this.f42465n2 = new org.telegram.ui.Components.voip.h();
        this.f42473p2 = new ArrayList();
        this.f42482r2 = new e20(this, i10);
        this.f42487s2 = new z20(this);
        this.f42491t2 = new org.telegram.ui.Components.gc(21);
        this.f42495u2 = new e20(this, 1);
        this.f42499v2 = false;
        this.f42504w2 = new w5(this, 6);
        this.f42509x2 = new LongSparseIntArray();
        this.I2 = new int[2];
        this.L2 = true;
        this.P2 = new String[2];
        this.Z2 = -1;
        this.f42488s3 = new t40(this);
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.f28122f;
        this.f42500v3 = new ud.a(2, this, erVar, 350L);
        this.f42505w3 = new ud.a(3, this, erVar, 220L, true);
        this.f42510x3 = new ud.c(4, this, erVar, 350L);
        this.f42515y3 = new ud.a(5, this, erVar, 350L);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        setOpenNoDelay(true);
        this.d = accountInstance;
        this.W0 = call;
        this.U0 = inputPeer;
        this.V0 = chat;
        this.Y0 = str;
        this.currentAccount = accountInstance.getCurrentAccount();
        this.X0 = z10;
        this.resourcesProvider = new jh.h0();
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        this.Z = MessagesController.getInstance(this.currentAccount).config.groupCallMessageLengthLimit.get();
        this.fullWidth = true;
        C3 = false;
        B3 = false;
        E3 = false;
        setDelegate(new v30(this));
        this.drawDoubleNavigationBar = true;
        this.drawNavigationBar = true;
        if (Build.VERSION.SDK_INT >= 30) {
            getWindow().setNavigationBarColor(-16777216);
        }
        this.scrollNavBar = true;
        this.navBarColorKey = -1;
        this.S2 = new g40(this);
        setOnDismissListener(new h20(this, i10));
        setDimBehindAlpha(75);
        m50 m50Var = new m50(this, launchActivity);
        this.L = m50Var;
        org.telegram.ui.Components.fp fpVar = new org.telegram.ui.Components.fp(true);
        int i11 = org.telegram.ui.ActionBar.g6.f23292qg;
        fpVar.b(org.telegram.ui.ActionBar.g6.u0(i11));
        fpVar.d();
        o40 o40Var = new o40(this, launchActivity, fpVar);
        this.K = o40Var;
        o40Var.setSubtitle("");
        o40Var.getSubtitleTextView().setVisibility(0);
        o40Var.l();
        o40Var.getAdditionalSubtitleTextView().setPadding(AndroidUtilities.dp(24.0f), 0, 0, 0);
        AndroidUtilities.updateViewVisibilityAnimated(o40Var.getAdditionalSubtitleTextView(), this.f42477q2, 1.0f, false);
        o40Var.getAdditionalSubtitleTextView().setTextColor(org.telegram.ui.ActionBar.g6.u0(i11));
        int i12 = org.telegram.ui.ActionBar.g6.f23207lg;
        o40Var.setSubtitleColor(org.telegram.ui.ActionBar.g6.u0(i12));
        o40Var.setBackButtonImage(R.drawable.ic_ab_back);
        o40Var.setOccupyStatusBar(false);
        o40Var.setAllowOverlayTitle(false);
        int i13 = org.telegram.ui.ActionBar.g6.f23135hg;
        o40Var.D(org.telegram.ui.ActionBar.g6.u0(i13), false);
        o40Var.C(org.telegram.ui.ActionBar.g6.u0(org.telegram.ui.ActionBar.g6.f23443z8), false);
        o40Var.setTitleColor(org.telegram.ui.ActionBar.g6.u0(i13));
        o40Var.setSubtitleColor(org.telegram.ui.ActionBar.g6.u0(i12));
        o40Var.setActionBarMenuOnItemClick(new v40(this, launchActivity));
        TLRPC.InputPeer groupCallPeer = inputPeer != null ? inputPeer : VoIPService.getSharedInstance().getGroupCallPeer();
        if (groupCallPeer == null) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            this.f42502w0 = tL_peerUser;
            tL_peerUser.user_id = accountInstance.getUserConfig().getClientUserId();
        } else if (groupCallPeer instanceof TLRPC.TL_inputPeerChannel) {
            TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
            this.f42502w0 = tL_peerChannel;
            tL_peerChannel.channel_id = groupCallPeer.channel_id;
        } else if (groupCallPeer instanceof TLRPC.TL_inputPeerUser) {
            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
            this.f42502w0 = tL_peerUser2;
            tL_peerUser2.user_id = groupCallPeer.user_id;
        } else if (groupCallPeer instanceof TLRPC.TL_inputPeerChat) {
            TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
            this.f42502w0 = tL_peerChat;
            tL_peerChat.chat_id = groupCallPeer.chat_id;
        }
        VoIPService.audioLevelsCallback = new b20(this, 3);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.groupCallUpdated);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.needShowAlert);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.didLoadChatAdmins);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.applyGroupCallVisibleParticipants);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.mainUserInfoChanged);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.groupCallScreencastStateChanged);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.groupCallSpeakingUsersUpdated);
        accountInstance.getNotificationCenter().addObserver(this, NotificationCenter.conferenceEmojiUpdated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.webRtcMicAmplitudeEvent);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didEndCall);
        this.f42413b0 = launchActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        org.telegram.ui.Components.oi0 oi0Var = new org.telegram.ui.Components.oi0(R.raw.voip_filled, "" + R.raw.voip_filled, AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f), true, null);
        this.F0 = oi0Var;
        this.G0 = new org.telegram.ui.Components.oi0(R.raw.hand_2, "" + R.raw.hand_2, AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f), true, null);
        w40 w40Var = new w40(this, launchActivity);
        this.H = w40Var;
        this.containerView = w40Var;
        w40Var.setClipToPadding(false);
        this.containerView.setFocusable(true);
        this.containerView.setFocusableInTouchMode(true);
        this.containerView.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i14 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i14, 0, i14, 0);
        this.containerView.setKeepScreenOn(true);
        this.containerView.setClipChildren(false);
        this.V = new ImageReceiver(this.containerView);
        if (inputPeer != null) {
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(launchActivity);
            this.Q = h5Var;
            h5Var.setGravity(17);
            h5Var.setTextColor(-1);
            h5Var.setTypeface(AndroidUtilities.bold());
            h5Var.setTextSize(18);
            h5Var.k(LocaleController.getString(R.string.VoipChatStartsIn));
            this.containerView.addView(h5Var, h7.z5.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 311.0f));
            x40 x40Var = new x40(this, launchActivity);
            this.R = x40Var;
            x40Var.setGravity(17);
            x40Var.setTextColor(-1);
            x40Var.setTypeface(AndroidUtilities.bold());
            x40Var.setTextSize(60);
            this.containerView.addView(x40Var, h7.z5.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 231.0f));
            org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(launchActivity);
            this.S = h5Var2;
            h5Var2.setGravity(17);
            h5Var2.setTextColor(-1);
            h5Var2.setTypeface(AndroidUtilities.bold());
            h5Var2.setTextSize(18);
            this.containerView.addView(h5Var2, h7.z5.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 201.0f));
        }
        if (r1()) {
            h50 h50Var = new h50(this, launchActivity);
            this.Q0 = h50Var;
            this.containerView.addView(h50Var, h7.z5.d(-1, 80.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
        }
        y40 y40Var = new y40(this, launchActivity);
        this.M = y40Var;
        y40Var.setClipToPadding(false);
        y40Var.setClipChildren(false);
        g50 g50Var = new g50(this);
        this.T = g50Var;
        g50Var.f5737o = erVar;
        g50Var.d = 350L;
        g50Var.f5842c = 350L;
        g50Var.f5843e = 350L;
        g50Var.S();
        y40Var.setItemAnimator(g50Var);
        y40Var.setOnScrollListener(new o20(this));
        y40Var.setVerticalScrollBarEnabled(false);
        getContext();
        org.telegram.ui.Components.cz czVar = new org.telegram.ui.Components.cz(B3 ? 6 : 2, y40Var);
        this.U = czVar;
        y40Var.setLayoutManager(czVar);
        p20 p20Var = new p20(this);
        this.f42417c = p20Var;
        czVar.z1(p20Var);
        y40Var.i(new q20(this));
        czVar.C1();
        this.containerView.addView(y40Var, h7.z5.d(-1, -1.0f, 51, 14.0f, 14.0f, 14.0f, 231.0f));
        y40Var.setAdapter(m50Var);
        y40Var.setTopBottomSelectorRadius(13);
        y40Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.g6.u0(org.telegram.ui.ActionBar.g6.f23081eg));
        y40Var.setOnItemClickListener(new b7(this, launchActivity, call, 14));
        y40Var.setOnItemLongClickListener(new b20(this, 4));
        if (r1()) {
            q50 q50Var = new q50(this, getContext());
            this.f42508x1 = q50Var;
            this.containerView.addView(q50Var, h7.z5.d(-1, 0.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        org.telegram.ui.Components.zk0 zk0Var = new org.telegram.ui.Components.zk0(launchActivity);
        this.f42450j2 = zk0Var;
        this.containerView.addView(zk0Var, h7.z5.d(-1, -1.0f, 51, 14.0f, 14.0f, 324.0f, 14.0f));
        y50 y50Var = new y50(call, this.currentAccount, this);
        this.f42454k2 = y50Var;
        zk0Var.setAdapter(y50Var);
        f2.x xVar = new f2.x(6, false);
        zk0Var.setLayoutManager(xVar);
        xVar.z1(new s20(this));
        final int i15 = 1;
        zk0Var.setOnItemClickListener(new org.telegram.ui.Components.pk0(this) {

            public final s50 f37244b;

            {
                this.f37244b = this;
            }

            @Override
            public final void a(int i16, View view) {
                switch (i15) {
                    case 0:
                        s50 s50Var2 = this.f37244b;
                        s50Var2.getClass();
                        org.telegram.ui.Components.e20 e20Var = (org.telegram.ui.Components.e20) view;
                        if (e20Var.getVideoParticipant() != null) {
                            s50Var2.e1(e20Var.getVideoParticipant());
                        } else {
                            s50Var2.e1(new ChatObject.VideoParticipant(e20Var.getParticipant(), false, false));
                        }
                        break;
                    default:
                        s50 s50Var3 = this.f37244b;
                        s50Var3.getClass();
                        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) view;
                        if (lVar.getParticipant() != null) {
                            s50Var3.e1(lVar.getParticipant());
                        }
                        break;
                }
            }
        });
        f2.l lVar = new f2.l();
        lVar.S();
        lVar.f5737o = erVar;
        lVar.d = 350L;
        lVar.f5842c = 350L;
        lVar.f5843e = 350L;
        zk0Var.setItemAnimator(new t20(this));
        zk0Var.setOnScrollListener(new u20(this));
        y50Var.H(zk0Var, false, false);
        zk0Var.setVisibility(8);
        v20 v20Var = new v20(this, launchActivity);
        this.f42426e = v20Var;
        int iU0 = org.telegram.ui.ActionBar.g6.u0(org.telegram.ui.ActionBar.g6.Jg);
        int iRed = Color.red(iU0);
        int iGreen = Color.green(iU0);
        int iBlue = Color.blue(iU0);
        this.O0 = new Matrix();
        this.N0 = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(72.72727f), new int[]{Color.argb(50, iRed, iGreen, iBlue), Color.argb(0, iRed, iGreen, iBlue)}, (float[]) null, Shader.TileMode.CLAMP);
        Paint paint = new Paint(1);
        this.P0 = paint;
        paint.setShader(this.N0);
        org.telegram.ui.Components.s9 s9Var = new org.telegram.ui.Components.s9(9);
        this.I0 = s9Var;
        org.telegram.ui.Components.s9 s9Var2 = new org.telegram.ui.Components.s9(12);
        this.J0 = s9Var2;
        s9Var.f32356a = AndroidUtilities.dp(62.0f) * 0.45454547f;
        s9Var.f32357b = AndroidUtilities.dp(72.0f) * 0.45454547f;
        s9Var.b();
        s9Var2.f32356a = AndroidUtilities.dp(65.0f) * 0.45454547f;
        s9Var2.f32357b = AndroidUtilities.dp(75.0f) * 0.45454547f;
        s9Var2.b();
        int i16 = org.telegram.ui.ActionBar.g6.Ig;
        s9Var.d.setColor(i0.b.k(org.telegram.ui.ActionBar.g6.u0(i16), 38));
        s9Var2.d.setColor(i0.b.k(org.telegram.ui.ActionBar.g6.u0(i16), 76));
        org.telegram.ui.Components.voip.u2 u2Var = new org.telegram.ui.Components.voip.u2(launchActivity, 50.0f);
        this.f42479r = u2Var;
        u2Var.setCheckable(true);
        u2Var.setTextSize(12);
        v20Var.a(u2Var);
        u2Var.setOnClickListener(new c20(this, 7));
        org.telegram.ui.Components.voip.u2 u2Var2 = new org.telegram.ui.Components.voip.u2(launchActivity, 50.0f);
        this.f42462n = u2Var2;
        u2Var2.setCheckable(true);
        u2Var2.setTextSize(12);
        u2Var2.d(false, false);
        u2Var2.setCrossOffset(-AndroidUtilities.dpf2(3.5f));
        u2Var2.c(R.drawable.calls_video, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipCamera), false, false);
        org.telegram.ui.Components.voip.u2 u2Var3 = new org.telegram.ui.Components.voip.u2(launchActivity, 50.0f);
        this.f42431f = u2Var3;
        u2Var3.setCheckable(true);
        u2Var3.setTextSize(12);
        u2Var3.d(false, false);
        org.telegram.ui.Components.ri0 ri0Var = new org.telegram.ui.Components.ri0(launchActivity);
        u2Var3.addView(ri0Var, h7.z5.d(32, 32.0f, 1, 0.0f, 10.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.oi0 oi0Var2 = new org.telegram.ui.Components.oi0(R.raw.camera_flip, "" + R.raw.camera_flip, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        this.C2 = oi0Var2;
        ri0Var.setAnimation(oi0Var2);
        u2Var3.setOnClickListener(new c20(this, 10));
        v20Var.a(u2Var3);
        org.telegram.ui.Components.voip.u2 u2Var4 = new org.telegram.ui.Components.voip.u2(launchActivity, 50.0f);
        this.h = u2Var4;
        u2Var4.setCheckable(true);
        u2Var4.setTextSize(12);
        u2Var4.d(false, false);
        ImageView imageView = new ImageView(launchActivity);
        this.X = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        int i17 = R.drawable.filled_sound_on;
        this.W = i17;
        imageView.setImageResource(i17);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setScaleX(1.11f);
        imageView.setScaleY(1.11f);
        u2Var4.addView(imageView, h7.z5.d(30, 30.0f, 1, 0.0f, 11.0f, 0.0f, 0.0f));
        u2Var4.setOnClickListener(new c20(this, 11));
        v20Var.a(u2Var4);
        v20Var.a(u2Var2);
        org.telegram.ui.Components.voip.u2 u2Var5 = new org.telegram.ui.Components.voip.u2(launchActivity, 50.0f);
        this.f42484s = u2Var5;
        u2Var5.setTextSize(12);
        u2Var5.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.g6.u0(org.telegram.ui.ActionBar.g6.Dg), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
        final int i18 = 1;
        u2Var5.setOnClickListener(new View.OnClickListener(this) {

            public final s50 f38286b;

            {
                this.f38286b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i18) {
                    case 0:
                        s50.p(this.f38286b, launchActivity);
                        break;
                    default:
                        s50 s50Var2 = this.f38286b;
                        s50Var2.W1.e();
                        ChatObject.Call call2 = s50Var2.W0;
                        if (call2 == null || call2.isScheduled()) {
                            s50Var2.dismiss();
                        } else {
                            s50Var2.I1();
                            s50.t1(launchActivity, new e20(s50Var2, 5), false, false);
                        }
                        break;
                }
            }
        });
        org.telegram.ui.Components.voip.u2 u2Var6 = new org.telegram.ui.Components.voip.u2(launchActivity, 50.0f);
        this.v = u2Var6;
        u2Var6.setCheckable(true);
        u2Var6.b(true, false);
        u2Var6.setTextSize(12);
        u2Var6.c(R.drawable.filled_voice_comment_32, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipMessage), false, false);
        w20 w20Var = new w20(this, launchActivity);
        this.f42506x = w20Var;
        w20Var.setAnimation(oi0Var);
        w20Var.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.Components.voip.u2 u2Var7 = new org.telegram.ui.Components.voip.u2(launchActivity, 50.0f);
        this.f42501w = u2Var7;
        u2Var7.setDrawBackground(false);
        u2Var7.setTextSize(12);
        u2Var7.c(0, 0, 0, 1.0f, true, "Text", false, false);
        u2Var7.addView(w20Var, h7.z5.e(50, 50, 49));
        v20Var.a(u2Var7);
        u2Var7.setOnClickListener(new y20(this));
        v20Var.a(u2Var6);
        v20Var.a(u2Var5);
        ImageView imageView2 = new ImageView(launchActivity);
        this.f42511y = imageView2;
        imageView2.setVisibility(8);
        imageView2.setImageResource(R.drawable.voice_expand);
        u2Var7.addView(imageView2, h7.z5.d(24, 24.0f, 49, 0.0f, 13.0f, 0.0f, 0.0f));
        if (this.W0 != null && r1() && !this.W0.isScheduled()) {
            imageView2.setVisibility(0);
            w20Var.setVisibility(8);
        }
        RadialProgressView radialProgressView = new RadialProgressView(launchActivity);
        this.f42410a0 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(50.0f));
        radialProgressView.setStrokeWidth(2.0f);
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.g6.u0(org.telegram.ui.ActionBar.g6.Og));
        o40Var.setAlpha(0.0f);
        o40Var.getBackButton().setScaleX(0.9f);
        o40Var.getBackButton().setScaleY(0.9f);
        o40Var.getBackButton().setTranslationX(-AndroidUtilities.dp(14.0f));
        o40Var.getTitleTextView().setTranslationY(AndroidUtilities.dp(23.0f));
        o40Var.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        o40Var.getAdditionalSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        int iU1 = org.telegram.ui.ActionBar.g6.u0(i13);
        int i19 = 0;
        org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(launchActivity, (org.telegram.ui.ActionBar.z) null, 0, iU1);
        this.f42437g1 = v0Var;
        v0Var.setLongClickEnabled(false);
        v0Var.setIcon(R.drawable.ic_ab_other);
        v0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        v0Var.setSubMenuOpenSide(2);
        v0Var.setDelegate(new b20(this, i19));
        int i20 = org.telegram.ui.ActionBar.g6.f23153ig;
        v0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.e0(org.telegram.ui.ActionBar.g6.u0(i20), 6));
        v0Var.setOnClickListener(new c20(this, i19));
        v0Var.G(org.telegram.ui.ActionBar.g6.u0(i13), false);
        v0Var.G(org.telegram.ui.ActionBar.g6.u0(i13), true);
        org.telegram.ui.ActionBar.v0 v0Var2 = new org.telegram.ui.ActionBar.v0(launchActivity, (org.telegram.ui.ActionBar.z) null, 0, org.telegram.ui.ActionBar.g6.u0(i13));
        this.f42441h1 = v0Var2;
        v0Var2.setLongClickEnabled(false);
        v0Var2.setIcon(R.drawable.msg_voice_pip);
        v0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        v0Var2.setBackground(org.telegram.ui.ActionBar.g6.e0(org.telegram.ui.ActionBar.g6.u0(i20), 6));
        v0Var2.setOnClickListener(new c20(this, 1));
        org.telegram.ui.ActionBar.v0 v0Var3 = new org.telegram.ui.ActionBar.v0(launchActivity, (org.telegram.ui.ActionBar.z) null, 0, org.telegram.ui.ActionBar.g6.u0(i13));
        this.f42445i1 = v0Var3;
        v0Var3.setLongClickEnabled(false);
        v0Var3.setIcon(R.drawable.msg_screencast);
        v0Var3.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        v0Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.e0(org.telegram.ui.ActionBar.g6.u0(i20), 6));
        v0Var3.setOnClickListener(new c20(this, 2));
        b30 b30Var = new b30(this, launchActivity, launchActivity);
        this.f42411a1 = b30Var;
        c30 c30Var = new c30(launchActivity);
        this.J = c30Var;
        c30Var.setAlpha(0.0f);
        Paint paint2 = new Paint(1);
        this.f42419c1 = paint2;
        paint2.setColor(-12761513);
        d30 d30Var = new d30(this, getContext());
        this.f42414b1 = d30Var;
        d30Var.setTextColor(getThemedColor(i13));
        d30Var.setTextSize(1, 11.0f);
        d30Var.setText(LocaleController.getString(R.string.VoipChannelLabelLive));
        d30Var.setMaxLines(1);
        d30Var.setGravity(17);
        d30Var.setTypeface(AndroidUtilities.bold());
        d30Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f));
        d30Var.setTag(-1);
        if (!r1()) {
            d30Var.setVisibility(8);
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f42433f1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.addView(b30Var, h7.z5.l(1.0f, 0, -2));
        linearLayout.addView(d30Var, h7.z5.k(6.0f, 4.0f, 0.0f, 0.0f, -2, 18));
        this.containerView.addView(c30Var, h7.z5.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.containerView.addView(linearLayout, h7.z5.d(-2, -2.0f, 51, 23.0f, 0.0f, 48.0f, 0.0f));
        this.containerView.addView(o40Var, h7.z5.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(launchActivity);
        this.f42498v1 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.addView(v0Var3, h7.z5.n(48, 48));
        linearLayout2.addView(v0Var2, h7.z5.n(48, 48));
        linearLayout2.addView(v0Var, h7.z5.n(48, 48));
        this.containerView.addView(linearLayout2, h7.z5.e(-2, 48, 53));
        View view = new View(launchActivity);
        this.f42418c0 = view;
        view.setAlpha(0.0f);
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.u0(org.telegram.ui.ActionBar.g6.V5));
        this.containerView.addView(view, h7.z5.c(1.0f, -1));
        for (int i21 = 0; i21 < 2; i21++) {
            this.f42432f0[i21] = new e30(this, launchActivity);
            this.f42432f0[i21].setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            this.f42432f0[i21].setTranslationZ(AndroidUtilities.dp(5.0f));
            this.containerView.addView(this.f42432f0[i21], h7.z5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        org.telegram.ui.Cells.k kVar = new org.telegram.ui.Cells.k(launchActivity, true);
        this.f42436g0 = kVar;
        kVar.setTag(R.id.fit_width_tag, 240);
        this.f42437g1.h(kVar, AndroidUtilities.dp(48.0f));
        this.f42437g1.setShowSubmenuByMove(false);
        int i22 = org.telegram.ui.ActionBar.g6.f23081eg;
        kVar.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.u0(i22), 6, 6));
        org.telegram.ui.ActionBar.v0 v0Var4 = this.f42437g1;
        org.telegram.ui.ActionBar.f1 f1VarD = v0Var4.d(1, 0, null, LocaleController.getString(R.string.VoipGroupAllCanSpeak), true, true, v0Var4.f23865i0);
        this.f42476q1 = f1VarD;
        f1VarD.j(true, false);
        org.telegram.ui.ActionBar.v0 v0Var5 = this.f42437g1;
        org.telegram.ui.ActionBar.f1 f1VarD2 = v0Var5.d(2, 0, null, LocaleController.getString(R.string.VoipGroupOnlyAdminsCanSpeak), true, true, v0Var5.f23865i0);
        this.f42481r1 = f1VarD2;
        f1VarD2.j(false, true);
        int i23 = org.telegram.ui.ActionBar.g6.f23398wg;
        f1VarD.setCheckColor(i23);
        f1VarD.c(org.telegram.ui.ActionBar.g6.u0(i23), org.telegram.ui.ActionBar.g6.u0(i23));
        f1VarD2.setCheckColor(i23);
        f1VarD2.c(org.telegram.ui.ActionBar.g6.u0(i23), org.telegram.ui.ActionBar.g6.u0(i23));
        Paint paint3 = new Paint(1);
        int i24 = org.telegram.ui.ActionBar.g6.f23135hg;
        paint3.setColor(org.telegram.ui.ActionBar.g6.u0(i24));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(AndroidUtilities.dp(1.5f));
        paint3.setStrokeCap(Paint.Cap.ROUND);
        org.telegram.ui.ActionBar.v0 v0Var6 = this.f42437g1;
        org.telegram.ui.ActionBar.f1 f1VarD3 = v0Var6.d(10, R.drawable.msg_voice_speaker, null, LocaleController.getString(R.string.VoipGroupAudio), true, false, v0Var6.f23865i0);
        this.l1 = f1VarD3;
        f1VarD3.setItemHeight(56);
        org.telegram.ui.ActionBar.v0 v0Var7 = this.f42437g1;
        org.telegram.ui.ActionBar.f1 f1VarD4 = v0Var7.d(11, R.drawable.msg_noise_on, null, LocaleController.getString(R.string.VoipNoiseCancellation), true, false, v0Var7.f23865i0);
        this.f42459m1 = f1VarD4;
        f1VarD4.setItemHeight(56);
        TextView textViewB = this.f42437g1.b(i0.b.d(0.3f, org.telegram.ui.ActionBar.g6.u0(org.telegram.ui.ActionBar.g6.f23117gg), -16777216));
        this.f42503w1 = textViewB;
        ((ViewGroup.MarginLayoutParams) textViewB.getLayoutParams()).topMargin = 0;
        ((ViewGroup.MarginLayoutParams) textViewB.getLayoutParams()).bottomMargin = 0;
        org.telegram.ui.ActionBar.v0 v0Var8 = this.f42437g1;
        org.telegram.ui.ActionBar.f1 f1VarD5 = v0Var8.d(6, R.drawable.msg_edit, this.Z0, LocaleController.getString(ChatObject.isChannelOrGiga(this.V0) ? R.string.VoipChannelEditTitle : R.string.VoipGroupEditTitle), true, false, v0Var8.f23865i0);
        this.f42453k1 = f1VarD5;
        org.telegram.ui.ActionBar.v0 v0Var9 = this.f42437g1;
        org.telegram.ui.ActionBar.f1 f1VarD6 = v0Var9.d(7, R.drawable.msg_permissions, this.Z0, LocaleController.getString(R.string.VoipGroupEditPermissions), false, false, v0Var9.f23865i0);
        this.f42464n1 = f1VarD6;
        org.telegram.ui.ActionBar.f1 f1VarE = this.f42437g1.e(3, R.drawable.msg_link, LocaleController.getString(R.string.VoipGroupShareInviteLink));
        this.f42449j1 = f1VarE;
        n50 n50Var = new n50();
        this.Z0 = n50Var;
        org.telegram.ui.ActionBar.f1 f1VarE2 = this.f42437g1.e(9, R.drawable.msg_screencast, LocaleController.getString(R.string.VoipChatStartScreenCapture));
        this.f42472p1 = f1VarE2;
        org.telegram.ui.ActionBar.v0 v0Var10 = this.f42437g1;
        org.telegram.ui.ActionBar.f1 f1VarD7 = v0Var10.d(5, 0, n50Var, LocaleController.getString(R.string.VoipGroupRecordCall), true, false, v0Var10.f23865i0);
        this.f42468o1 = f1VarD7;
        n50Var.a(f1VarD7.getImageView());
        org.telegram.ui.ActionBar.f1 f1VarE3 = this.f42437g1.e(12, R.drawable.menu_stream_comments_24, LocaleController.getString(R.string.VoipChannelEnableComments));
        this.f42490t1 = f1VarE3;
        TLRPC.InputPeer inputPeer2 = groupCallPeer;
        org.telegram.ui.ActionBar.f1 f1VarE4 = this.f42437g1.e(13, R.drawable._menu_stream_comments_off_24, LocaleController.getString(R.string.VoipChannelDisableComments));
        this.f42494u1 = f1VarE4;
        org.telegram.ui.ActionBar.f1 f1VarE5 = this.f42437g1.e(4, R.drawable.msg_cancel, o1() ? LocaleController.getString(R.string.VoipGroupEndConference) : LocaleController.getString(ChatObject.isChannelOrGiga(this.V0) ? R.string.VoipChannelEndChat : R.string.VoipGroupEndChat));
        this.f42486s1 = f1VarE5;
        this.f42437g1.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.g6.u0(i22));
        this.f42437g1.getPopupLayout().setFitItems(true);
        f1VarE3.c(org.telegram.ui.ActionBar.g6.u0(i24), org.telegram.ui.ActionBar.g6.u0(i24));
        f1VarE4.c(org.telegram.ui.ActionBar.g6.u0(i24), org.telegram.ui.ActionBar.g6.u0(i24));
        f1VarD3.c(org.telegram.ui.ActionBar.g6.u0(i24), org.telegram.ui.ActionBar.g6.u0(i24));
        f1VarD4.c(org.telegram.ui.ActionBar.g6.u0(i24), org.telegram.ui.ActionBar.g6.u0(i24));
        int i25 = org.telegram.ui.ActionBar.g6.f23383vg;
        f1VarE5.c(org.telegram.ui.ActionBar.g6.u0(i25), org.telegram.ui.ActionBar.g6.u0(i25));
        f1VarE.c(org.telegram.ui.ActionBar.g6.u0(i24), org.telegram.ui.ActionBar.g6.u0(i24));
        f1VarD5.c(org.telegram.ui.ActionBar.g6.u0(i24), org.telegram.ui.ActionBar.g6.u0(i24));
        f1VarD6.c(org.telegram.ui.ActionBar.g6.u0(i24), org.telegram.ui.ActionBar.g6.u0(i24));
        f1VarD7.c(org.telegram.ui.ActionBar.g6.u0(i24), org.telegram.ui.ActionBar.g6.u0(i24));
        f1VarE2.c(org.telegram.ui.ActionBar.g6.u0(i24), org.telegram.ui.ActionBar.g6.u0(i24));
        if (this.W0 != null) {
            l1();
        }
        if (o1()) {
            this.f42456l0 = new c50();
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            this.f42456l0.b((sharedInstance == null || (conferenceCall = sharedInstance.conference) == null) ? null : conferenceCall.getEmojis());
        }
        P1(false);
        this.K.getTitleTextView().setOnClickListener(new c20(this, 3));
        f30 f30Var = new f30(this, launchActivity);
        this.f42446i2 = f30Var;
        g30 g30Var = new g30(this);
        this.J2 = g30Var;
        final int i26 = 0;
        f30Var.setClipToPadding(false);
        g30Var.S();
        g30Var.f5737o = org.telegram.ui.Components.er.f28122f;
        g30Var.d = 350L;
        g30Var.f5842c = 350L;
        g30Var.f5843e = 350L;
        f30Var.setItemAnimator(g30Var);
        f30Var.setOnScrollListener(new h30(this));
        f30Var.setClipChildren(false);
        f2.k0 k0Var = new f2.k0();
        k0Var.j1(0);
        f30Var.setLayoutManager(k0Var);
        org.telegram.ui.Components.f20 f20Var = new org.telegram.ui.Components.f20(call, this.currentAccount, this);
        this.f42457l2 = f20Var;
        f30Var.setAdapter(f20Var);
        f20Var.F(f30Var, false);
        f30Var.setOnItemClickListener(new org.telegram.ui.Components.pk0(this) {

            public final s50 f37244b;

            {
                this.f37244b = this;
            }

            @Override
            public final void a(int i110, View view2) {
                switch (i26) {
                    case 0:
                        s50 s50Var2 = this.f37244b;
                        s50Var2.getClass();
                        org.telegram.ui.Components.e20 e20Var = (org.telegram.ui.Components.e20) view2;
                        if (e20Var.getVideoParticipant() != null) {
                            s50Var2.e1(e20Var.getVideoParticipant());
                        } else {
                            s50Var2.e1(new ChatObject.VideoParticipant(e20Var.getParticipant(), false, false));
                        }
                        break;
                    default:
                        s50 s50Var3 = this.f37244b;
                        s50Var3.getClass();
                        org.telegram.ui.Components.voip.l lVar2 = (org.telegram.ui.Components.voip.l) view2;
                        if (lVar2.getParticipant() != null) {
                            s50Var3.e1(lVar2.getParticipant());
                        }
                        break;
                }
            }
        });
        f30Var.setOnItemLongClickListener(new b20(this, 1));
        f30Var.setVisibility(8);
        f30Var.i(new i30());
        int i27 = 4;
        j30 j30Var = new j30(this, launchActivity, this.M, f30Var, this.U1, this.W0, this);
        this.W1 = j30Var;
        j30Var.setClipChildren(false);
        f20Var.E(this.U1, j30Var);
        if (this.f42450j2 != null) {
            this.f42454k2.G(this.U1, j30Var);
        }
        k30 k30Var = new k30(this, launchActivity);
        this.f42518z2 = k30Var;
        l30 l30Var = new l30(this, launchActivity, this.K, this.M, k30Var);
        this.f42412b = l30Var;
        l30Var.setImagesLayerNum(Integer.MAX_VALUE);
        l30Var.setInvalidateWithParent(true);
        k30Var.setProfileGalleryView(l30Var);
        m30 m30Var = new m30(this, launchActivity);
        this.f42514y2 = m30Var;
        m30Var.setVisibility(8);
        l30Var.setVisibility(0);
        l30Var.b(new n30(this));
        o30 o30Var = new o30(this, launchActivity);
        this.X1 = o30Var;
        this.containerView.addView(j30Var);
        j30Var.addView(f30Var, h7.z5.d(-1, 80.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        this.f42426e.setWillNotDraw(false);
        View view2 = new View(launchActivity);
        this.F2 = view2;
        int[] iArr = this.I2;
        iArr[0] = this.R1;
        iArr[1] = 0;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, this.I2);
        this.H2 = gradientDrawable;
        view2.setBackground(gradientDrawable);
        this.containerView.addView(view2, h7.z5.e(-1, 60, 83));
        View view3 = new View(launchActivity);
        this.G2 = view3;
        view3.setBackgroundColor(this.I2[0]);
        this.containerView.addView(view3, h7.z5.e(-1, 0, 83));
        ug.i iVar = new ug.i(launchActivity);
        this.Y = iVar;
        iVar.setDelegate(new p30(this));
        iVar.setClickCellDelegate(new q30(this));
        if (this.W0 != null) {
            iVar.C0(this.d.getCurrentAccount(), this.W0.getInputGroupCall(false));
        }
        this.containerView.addView(iVar, h7.z5.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(launchActivity, false, true, true);
        this.I = j6Var;
        j6Var.setGravity(17);
        j6Var.setTextSize(AndroidUtilities.dp(15.0f));
        j6Var.setTextColor(-1);
        j6Var.b(0.4f, 320L, org.telegram.ui.Components.er.h);
        j6Var.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(this.f42426e);
        r30 r30Var = new r30(this, launchActivity, this.H, LaunchActivity.R(), this.resourcesProvider);
        this.D = r30Var;
        r30Var.F = true;
        r30Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.Z)});
        r30Var.getEditText().setLinkTextColor(-11683585);
        r30Var.setHint(LocaleController.getString(R.string.TypeMessage));
        r30Var.getEditText().addTextChangedListener(new s30(this));
        r30Var.s();
        t30 t30Var = new t30(this, launchActivity);
        this.C = t30Var;
        this.containerView.addView(t30Var, h7.z5.c(-1.0f, -1));
        u30 u30Var = new u30(launchActivity);
        this.B = u30Var;
        u30Var.addView(r30Var, h7.z5.d(-1, -2.0f, 80, 0.0f, 0.0f, 48.0f, 0.0f));
        u30Var.addView(j6Var, h7.z5.d(52, 16.0f, 85, 0.0f, 0.0f, 0.0f, 32.0f));
        j6Var.setTranslationY(-AndroidUtilities.dp(20.0f));
        this.containerView.addView(u30Var, h7.z5.e(-1, -2, 80));
        ImageView imageView3 = new ImageView(launchActivity);
        this.F = imageView3;
        int i28 = org.telegram.ui.ActionBar.g6.f23144i6;
        imageView3.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(i28), 1, -1));
        int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23091f7, this.resourcesProvider);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView3.setColorFilter(new PorterDuffColorFilter(iV0, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.arrow_more);
        imageView3.setOnClickListener(new c20(this, i27));
        ImageView imageView4 = new ImageView(launchActivity);
        this.E = imageView4;
        imageView4.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(i28), 1, -1));
        imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23373v6, this.resourcesProvider), mode));
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_send);
        imageView4.setOnClickListener(new c20(this, 5));
        u30Var.addView(imageView3, h7.z5.e(48, 48, 85));
        u30Var.addView(imageView4, h7.z5.e(48, 48, 85));
        this.containerView.addView(o30Var);
        m30Var.addView(l30Var, h7.z5.c(-1.0f, -1));
        m30Var.addView(k30Var, h7.z5.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.containerView.addView(m30Var, h7.z5.d(-1, -1.0f, 0, 14.0f, 14.0f, 14.0f, 14.0f));
        O0(false);
        this.L.l();
        if (C3) {
            this.f42454k2.I(this.f42450j2, false);
        }
        this.E0 = this.L.h();
        if (inputPeer != null) {
            TextView textView = new TextView(launchActivity);
            this.O = textView;
            textView.setGravity(17);
            textView.setTextColor(-8682615);
            textView.setTextSize(1, 14.0f);
            if (ChatObject.isChannel(this.V0) && (chat2 = this.V0) != null && !chat2.megagroup) {
                textView.setTag(1);
            }
            this.containerView.addView(textView, h7.z5.d(-2, -2.0f, 81, 21.0f, 0.0f, 21.0f, 100.0f));
            org.telegram.ui.Components.fc0 fc0Var = new org.telegram.ui.Components.fc0(launchActivity);
            fc0Var.setTextColor(-1);
            fc0Var.setSelectorColor(-9598483);
            fc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
            fc0Var.setItemCount(5);
            w30 w30Var = new w30(launchActivity);
            w30Var.setItemCount(5);
            w30Var.setTextColor(-1);
            w30Var.setSelectorColor(-9598483);
            w30Var.setTextOffset(-AndroidUtilities.dp(10.0f));
            x30 x30Var = new x30(launchActivity);
            x30Var.setItemCount(5);
            x30Var.setTextColor(-1);
            x30Var.setSelectorColor(-9598483);
            x30Var.setTextOffset(-AndroidUtilities.dp(34.0f));
            y30 y30Var = new y30(launchActivity);
            this.P = y30Var;
            y30Var.setLines(1);
            y30Var.setSingleLine(true);
            y30Var.setEllipsize(TextUtils.TruncateAt.END);
            y30Var.setGravity(17);
            y30Var.setTextColor(-1);
            y30Var.setTypeface(AndroidUtilities.bold());
            y30Var.setTextSize(1, 14.0f);
            this.containerView.addView(y30Var, h7.z5.d(-1, 48.0f, 81, 21.0f, 0.0f, 21.0f, 20.5f));
            launchActivity2 = launchActivity;
            y30Var.setOnClickListener(new org.telegram.messenger.video.f(this, fc0Var, w30Var, x30Var, chat, accountInstance, inputPeer2, 1));
            a40 a40Var = new a40(launchActivity2, fc0Var, w30Var, x30Var);
            this.N = a40Var;
            a40Var.setWeightSum(1.0f);
            a40Var.setOrientation(0);
            this.containerView.addView(a40Var, h7.z5.d(-1, 270.0f, 51, 0.0f, 50.0f, 0.0f, 0.0f));
            long jCurrentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(jCurrentTimeMillis);
            int i29 = calendar.get(1);
            int i30 = calendar.get(6);
            a40Var.addView(fc0Var, h7.z5.l(0.5f, 0, 270));
            fc0Var.setMinValue(0);
            fc0Var.setMaxValue(365);
            fc0Var.setWrapSelectorWheel(false);
            fc0Var.setFormatter(new cg.d(jCurrentTimeMillis, calendar, i29, 1));
            a1.d dVar = new a1.d(this, fc0Var, w30Var, x30Var, 13);
            s50Var = this;
            fc0Var.setOnValueChangedListener(dVar);
            w30Var.setMinValue(0);
            w30Var.setMaxValue(23);
            a40Var.addView(w30Var, h7.z5.l(0.2f, 0, 270));
            w30Var.setFormatter(new org.telegram.ui.Components.pc0(28));
            w30Var.setOnValueChangedListener(dVar);
            x30Var.setMinValue(0);
            x30Var.setMaxValue(59);
            x30Var.setValue(0);
            x30Var.setFormatter(new org.telegram.ui.Components.pc0(29));
            a40Var.addView(x30Var, h7.z5.l(0.3f, 0, 270));
            x30Var.setOnValueChangedListener(dVar);
            calendar.setTimeInMillis(jCurrentTimeMillis + 10800000);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            int i31 = calendar.get(6);
            int i32 = calendar.get(12);
            int i33 = calendar.get(11);
            fc0Var.setValue(i30 != i31 ? 1 : 0);
            x30Var.setValue(i32);
            w30Var.setValue(i33);
            org.telegram.ui.Components.y4.g(y30Var, textView, 0L, 604800L, 2, fc0Var, w30Var, x30Var);
        } else {
            launchActivity2 = launchActivity;
            s50Var = this;
        }
        b40 b40Var = new b40(s50Var, (ViewGroup) s50Var.getWindow().getDecorView(), s50Var.containerView);
        s50Var.Y1 = b40Var;
        b40Var.E = new c40(s50Var);
        l30Var.setPinchToZoomHelper(b40Var);
        final int i34 = 0;
        s50Var.f42462n.setOnClickListener(new View.OnClickListener(s50Var) {

            public final s50 f38286b;

            {
                this.f38286b = s50Var;
            }

            @Override
            public final void onClick(View view4) {
                switch (i34) {
                    case 0:
                        s50.p(this.f38286b, launchActivity2);
                        break;
                    default:
                        s50 s50Var2 = this.f38286b;
                        s50Var2.W1.e();
                        ChatObject.Call call2 = s50Var2.W0;
                        if (call2 == null || call2.isScheduled()) {
                            s50Var2.dismiss();
                        } else {
                            s50Var2.I1();
                            s50.t1(launchActivity2, new e20(s50Var2, 5), false, false);
                        }
                        break;
                }
            }
        });
        s50Var.L1(false);
        s50Var.I1();
        s50Var.M1(false);
        s50Var.N1(false, false);
        s50Var.B1(0.0f);
        s50Var.O1();
        s50Var.containerView.addView(new FrameLayout(launchActivity2), h7.z5.e(-1, 200, 87));
        s50Var.v.setOnClickListener(new c20(s50Var, 6));
        s50Var.T0();
        h7.b6.a(s50Var.f42462n);
        h7.b6.a(s50Var.f42479r);
        h7.b6.a(s50Var.f42431f);
        h7.b6.a(s50Var.h);
        h7.b6.a(s50Var.f42501w);
        h7.b6.a(s50Var.f42484s);
        h7.b6.a(s50Var.v);
        r0.j0.m(s50Var.containerView, new b20(s50Var, 2));
    }

    public static String A0() {
        String[][] strArr = EmojiData.data;
        String[] strArr2 = strArr[(int) Math.floor(Math.random() * ((double) strArr.length))];
        return strArr2[(int) Math.floor(Math.random() * ((double) strArr2.length))];
    }

    public static r0.m1 B(s50 s50Var, r0.m1 m1Var) {
        r0.j1 j1Var = m1Var.f46619a;
        i0.c cVarF = j1Var.f(647);
        i0.c cVarF2 = j1Var.f(8);
        r30 r30Var = s50Var.D;
        int iMax = Math.max(cVarF2.d, (r30Var.J || r30Var.f32878e) ? r30Var.getKeyboardHeight() : 0);
        ViewGroup.LayoutParams layoutParams = s50Var.X1.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = -cVarF.d;
        }
        if (r30Var.getEmojiView() != null) {
            r30Var.getEmojiView().setBottomInset(cVarF.d);
        }
        if (s50Var.O2) {
            ViewGroup viewGroup = s50Var.containerView;
            int i10 = s50Var.backgroundPaddingLeft;
            viewGroup.setPadding(i10, 0, i10, 0);
        } else {
            ViewGroup viewGroup2 = s50Var.containerView;
            int i11 = s50Var.backgroundPaddingLeft;
            viewGroup2.setPadding(cVarF.f10489a + i11, cVarF.f10490b, i11 + cVarF.f10491c, cVarF.d);
        }
        s50Var.containerView.requestLayout();
        if (iMax == 0 && !r30Var.J && !r30Var.f32878e && !r30Var.K) {
            r30Var.j();
        }
        if (iMax > 0) {
            org.telegram.ui.Components.wj0 wj0Var = s50Var.G;
            if (wj0Var == null) {
                org.telegram.ui.ActionBar.n2 n2VarR = LaunchActivity.R();
                wj0Var = null;
                if (n2VarR != null) {
                    org.telegram.ui.Components.wj0 wj0Var2 = new org.telegram.ui.Components.wj0(1, s50Var.currentAccount, s50Var.getContext(), n2VarR, s50Var.resourcesProvider);
                    s50Var.G = wj0Var2;
                    wj0Var2.setDelegate(new u40(s50Var));
                    s50Var.containerView.addView(s50Var.G, h7.z5.e(-2, 52, 81));
                    s50Var.G.p(null, null, false);
                    s50Var.C.bringToFront();
                    s50Var.B.bringToFront();
                    wj0Var = s50Var.G;
                }
            }
            s50Var.G = wj0Var;
        }
        r30Var.H(cVarF2.d, false);
        s50Var.f42513y1.i(m1Var);
        return r0.m1.f46618b;
    }

    public static void B0(s50 s50Var) {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("reminderhint", false)) {
            return;
        }
        globalMainSettings.edit().putBoolean("reminderhint", true).commit();
        if (s50Var.f42448j0 == null) {
            org.telegram.ui.Components.x30 x30Var = new org.telegram.ui.Components.x30(s50Var.getContext(), 8);
            s50Var.f42448j0 = x30Var;
            x30Var.setAlpha(0.0f);
            s50Var.f42448j0.setVisibility(4);
            s50Var.f42448j0.setShowingDuration(4000L);
            s50Var.containerView.addView(s50Var.f42448j0, h7.z5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            s50Var.f42448j0.setText(LocaleController.getString(R.string.VoipChatReminderHint));
            s50Var.f42448j0.d();
        }
        s50Var.f42448j0.setExtraTranslationY(-AndroidUtilities.statusBarHeight);
        s50Var.f42448j0.f(s50Var.f42501w, true);
    }

    public static void C(s50 s50Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TL_phone.exportGroupCallInvite exportgroupcallinvite, TLRPC.TL_error tL_error) {
        TLRPC.GroupCall groupCall;
        b2Var.dismiss();
        if (!(tLObject instanceof TL_phone.exportedGroupCallInvite)) {
            if (tL_error != null) {
                new org.telegram.ui.Components.mc(s50Var.topBulletinContainer, new jh.h0()).d0(tL_error, false);
                return;
            }
            return;
        }
        Context context = s50Var.getContext();
        int i10 = s50Var.currentAccount;
        TLRPC.InputGroupCall inputGroupCall = exportgroupcallinvite.call;
        String str = ((TL_phone.exportedGroupCallInvite) tLObject).link;
        org.telegram.ui.ActionBar.c6 c6Var = s50Var.resourcesProvider;
        ChatObject.Call call = s50Var.W0;
        j9.o0(context, i10, inputGroupCall, str, c6Var, false, (call == null || (groupCall = call.call) == null || !groupCall.creator) ? false : true);
    }

    public static void D(s50 s50Var, int[] iArr, float[] fArr) {
        f2.o1 o1VarK;
        f30 f30Var = s50Var.f42446i2;
        j30 j30Var = s50Var.W1;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            TLRPC.GroupCallParticipant groupCallParticipant = s50Var.W0.participantsBySources.get(iArr[i10]);
            if (groupCallParticipant != null) {
                if (j30Var.f33648b) {
                    for (int i11 = 0; i11 < f30Var.getChildCount(); i11++) {
                        org.telegram.ui.Components.e20 e20Var = (org.telegram.ui.Components.e20) f30Var.getChildAt(i11);
                        if (MessageObject.getPeerId(e20Var.getParticipant().peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                            e20Var.setAmplitude(fArr[i10] * 15.0f);
                        }
                    }
                } else {
                    int iIndexOf = (s50Var.f42467o0 ? s50Var.f42516z0 : s50Var.W0.visibleParticipants).indexOf(groupCallParticipant);
                    if (iIndexOf >= 0 && (o1VarK = s50Var.M.K(iIndexOf + s50Var.L.d)) != null) {
                        View view = o1VarK.f5789a;
                        if (view instanceof org.telegram.ui.Cells.b4) {
                            ((org.telegram.ui.Cells.b4) view).setAmplitude(fArr[i10] * 15.0f);
                            if (view == s50Var.T2 && !s50Var.f42442h2) {
                                s50Var.containerView.invalidate();
                            }
                        }
                    }
                }
                j30Var.k(groupCallParticipant, fArr[i10] * 15.0f);
            }
        }
    }

    public static void E(s50 s50Var) {
        Editable text = s50Var.D.getText();
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = text.toString();
        tL_textWithEntities.entities = MediaDataController.getInstance(s50Var.currentAccount).getEntities(new CharSequence[]{text}, true);
        s50Var.A1(tL_textWithEntities);
    }

    public static void F0(s50 s50Var) {
        ChatObject.Call call = s50Var.W0;
        if (call == null || call.call == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        togglegroupcallsettings.call = s50Var.W0.getInputGroupCall();
        togglegroupcallsettings.join_muted = Boolean.valueOf(s50Var.W0.call.join_muted);
        ConnectionsManager connectionsManager = s50Var.d.getConnectionsManager();
        DispatchQueue dispatchQueue = Utilities.stageQueue;
        Objects.requireNonNull(dispatchQueue);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.b1(dispatchQueue), new m20(s50Var, 1));
    }

    public static void G0(s50 s50Var, boolean z10) {
        if (s50Var.W0 == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        togglegroupcallsettings.call = s50Var.W0.getInputGroupCall();
        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
        s50Var.f42492t3 = Boolean.valueOf(z10);
        s50Var.H1(true);
        ConnectionsManager connectionsManager = s50Var.d.getConnectionsManager();
        DispatchQueue dispatchQueue = Utilities.stageQueue;
        Objects.requireNonNull(dispatchQueue);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.b1(dispatchQueue), new m20(s50Var, 0));
    }

    public static void H0(s50 s50Var) {
        int i10;
        if (!s50Var.r1()) {
            s50Var.isFullscreen = false;
            return;
        }
        j30 j30Var = s50Var.W1;
        boolean z10 = (!j30Var.R && j30Var.f33648b && (B3 == s50Var.q1() || AndroidUtilities.isTablet())) ? false : true;
        Boolean bool = s50Var.f42434f2;
        if (bool == null || z10 != bool.booleanValue()) {
            int systemUiVisibility = s50Var.containerView.getSystemUiVisibility();
            if (z10) {
                i10 = systemUiVisibility & (-7);
                s50Var.getWindow().clearFlags(1024);
                s50Var.setHideSystemVerticalInsets(false);
            } else {
                s50Var.setHideSystemVerticalInsets(true);
                i10 = systemUiVisibility | 6;
                s50Var.getWindow().addFlags(1024);
            }
            s50Var.containerView.setSystemUiVisibility(i10);
            s50Var.f42434f2 = Boolean.valueOf(z10);
            s50Var.O2 = !z10;
            s50Var.containerView.requestApplyInsets();
        }
    }

    public static org.telegram.ui.Components.voip.l I0(s50 s50Var) {
        y40 y40Var = s50Var.M;
        for (int i10 = 0; i10 < y40Var.getChildCount(); i10++) {
            View childAt = y40Var.getChildAt(i10);
            if (childAt.isAttachedToWindow() && (childAt instanceof org.telegram.ui.Components.voip.l) && RecyclerView.R(childAt) >= 0) {
                return (org.telegram.ui.Components.voip.l) childAt;
            }
        }
        return null;
    }

    public static void J0(s50 s50Var) {
        o40 o40Var = s50Var.K;
        y40 y40Var = s50Var.M;
        int childCount = y40Var.getChildCount();
        float paddingTop = 2.1474836E9f;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = y40Var.getChildAt(i10);
            if (RecyclerView.R(childAt) >= 0) {
                paddingTop = Math.min(paddingTop, childAt.getTop());
            }
        }
        if (paddingTop < 0.0f || paddingTop == 2.1474836E9f) {
            paddingTop = childCount != 0 ? 0.0f : y40Var.getPaddingTop();
        }
        int i11 = 1;
        boolean z10 = paddingTop <= ((float) (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(14.0f)));
        float fDp = paddingTop + AndroidUtilities.dp(14.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if ((z10 && o40Var.getTag() == null) || (!z10 && o40Var.getTag() != null)) {
            o40Var.setTag(z10 ? 1 : null);
            AnimatorSet animatorSet = s50Var.f42422d0;
            if (animatorSet != null) {
                animatorSet.cancel();
                s50Var.f42422d0 = null;
            }
            s50Var.setUseLightStatusBar(o40Var.getTag() == null);
            ViewPropertyAnimator duration = o40Var.getBackButton().animate().scaleX(z10 ? 1.0f : 0.9f).scaleY(z10 ? 1.0f : 0.9f).translationX(z10 ? 0.0f : -AndroidUtilities.dp(14.0f)).setDuration(300L);
            org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.f28122f;
            duration.setInterpolator(erVar).start();
            o40Var.getTitleTextView().animate().translationY(z10 ? 0.0f : AndroidUtilities.dp(23.0f)).setDuration(300L).setInterpolator(erVar).start();
            ObjectAnimator objectAnimator = s50Var.Q2;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                s50Var.Q2.cancel();
            }
            org.telegram.ui.ActionBar.h5 subtitleTextView = o40Var.getSubtitleTextView();
            Property property = View.TRANSLATION_Y;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(subtitleTextView, (Property<org.telegram.ui.ActionBar.h5, Float>) property, o40Var.getSubtitleTextView().getTranslationY(), z10 ? 0.0f : AndroidUtilities.dp(20.0f));
            s50Var.Q2 = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(300L);
            s50Var.Q2.setInterpolator(erVar);
            s50Var.Q2.addListener(new n40(null == true ? 1 : 0, s50Var, z10));
            s50Var.Q2.start();
            ObjectAnimator objectAnimator2 = s50Var.R2;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(o40Var.getAdditionalSubtitleTextView(), (Property<org.telegram.ui.ActionBar.h5, Float>) property, z10 ? 0.0f : AndroidUtilities.dp(20.0f));
            s50Var.R2 = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(300L);
            s50Var.R2.setInterpolator(erVar);
            s50Var.R2.start();
            AnimatorSet animatorSet2 = new AnimatorSet();
            s50Var.f42422d0 = animatorSet2;
            animatorSet2.setDuration(140L);
            AnimatorSet animatorSet3 = s50Var.f42422d0;
            Property property2 = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(o40Var, (Property<o40, Float>) property2, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(s50Var.J, (Property<c30, Float>) property2, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(s50Var.f42418c0, (Property<View, Float>) property2, z10 ? 1.0f : 0.0f));
            s50Var.f42422d0.addListener(new l40(s50Var, i11));
            s50Var.f42422d0.start();
            s50Var.W1.v.setClickable(!z10 || B3);
        }
        if (s50Var.f42493u0 != fDp) {
            s50Var.E1(fDp);
        }
    }

    public static void N(s50 s50Var, org.telegram.ui.Components.voip.l lVar, boolean z10) {
        if (s50Var.isDismissed()) {
            return;
        }
        if (z10 && lVar.getRenderer() == null) {
            lVar.setRenderer(org.telegram.ui.Components.voip.t.c(s50Var.U1, s50Var.W1, lVar, null, null, lVar.getParticipant(), s50Var.W0, s50Var));
        } else {
            if (z10 || lVar.getRenderer() == null) {
                return;
            }
            lVar.getRenderer().setPrimaryView(null);
            lVar.setRenderer(null);
        }
    }

    public static void S(s50 s50Var, int i10, int[] iArr) {
        if (s50Var.r1()) {
            int i11 = org.telegram.ui.ActionBar.g6.Kg;
            iArr[0] = org.telegram.ui.ActionBar.g6.w0(null, i11, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Lg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23450zg, false), s50Var.Q1, 1.0f);
            iArr[2] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23190kg, false), org.telegram.ui.ActionBar.g6.w0(null, i11, false), s50Var.Q1, 1.0f);
        } else if (i10 == 0) {
            iArr[0] = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Jg, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23433yg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23450zg, false), s50Var.Q1, 1.0f);
            iArr[2] = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23415xg, false);
        } else if (i10 == 1) {
            iArr[0] = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Gg, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Bg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Cg, false), s50Var.Q1, 1.0f);
            iArr[2] = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ag, false);
        } else if (p1(i10)) {
            iArr[0] = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23191kh, false);
            iArr[1] = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23208lh, false);
            iArr[2] = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23226mh, false);
        } else {
            int i12 = org.telegram.ui.ActionBar.g6.Kg;
            iArr[0] = org.telegram.ui.ActionBar.g6.w0(null, i12, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Mg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ng, false), s50Var.Q1, 1.0f);
            iArr[2] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23190kg, false), org.telegram.ui.ActionBar.g6.w0(null, i12, false), s50Var.Q1, 1.0f);
        }
        if (p1(i10)) {
            iArr[3] = i0.b.d(0.5f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23154ih, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23191kh, false));
        } else if (i10 == 1) {
            iArr[3] = i0.b.d(0.75f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Bg, false), i0.b.d(0.5f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Fg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Hg, false)));
        } else {
            iArr[3] = i0.b.d(0.5f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Jg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ig, false));
        }
    }

    public static void c1(LaunchActivity launchActivity, AccountInstance accountInstance, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        if (f42409z3 == null) {
            if (inputPeer == null && VoIPService.getSharedInstance() == null) {
                return;
            }
            if (inputPeer != null) {
                f42409z3 = new s50(launchActivity, accountInstance, accountInstance.getMessagesController().getGroupCall(chat.f22380id, false), chat, inputPeer, z10, str);
            } else {
                ChatObject.Call call = VoIPService.getSharedInstance().groupCall;
                if (call == null) {
                    return;
                }
                TLRPC.Chat chat2 = accountInstance.getMessagesController().getChat(Long.valueOf(call.chatId));
                call.addSelfDummyParticipant(true);
                f42409z3 = new s50(launchActivity, accountInstance, call, chat2, null, z10, str);
            }
            f42409z3.f42427e0 = launchActivity;
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.gc(20));
        }
    }

    public static String f1(int i10) {
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (i10 == 0) {
            return LocaleController.getString(R.string.VoipAudioRoutingSpeaker);
        }
        if (i10 == 1) {
            return (sharedInstance == null || !sharedInstance.isHeadsetPlugged()) ? LocaleController.getString(R.string.VoipAudioRoutingPhone) : LocaleController.getString(R.string.VoipAudioRoutingHeadset);
        }
        if (i10 != 2) {
            return null;
        }
        return (sharedInstance == null || (str = sharedInstance.currentBluetoothDeviceName) == null) ? LocaleController.getString(R.string.VoipAudioRoutingBluetooth) : str;
    }

    public static String g1(int i10) {
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (i10 == 2) {
            return (sharedInstance == null || (str = sharedInstance.currentBluetoothDeviceName) == null) ? LocaleController.getString(R.string.VoipAudioSwitchedToBluetooth) : LocaleController.formatString(R.string.VoipAudioSwitchedToBluetoothDevice, str);
        }
        if (i10 == 1) {
            return (sharedInstance == null || !sharedInstance.isHeadsetPlugged()) ? LocaleController.getString(R.string.VoipAudioSwitchedToPhone) : LocaleController.getString(R.string.VoipAudioSwitchedToHeadset);
        }
        return LocaleController.getString(R.string.VoipAudioSwitchedToSpeaker);
    }

    public static void m(s50 s50Var, ChatObject.Call.InvitedUser invitedUser, Long l10) {
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = invitedUser.msg_id;
        ConnectionsManager.getInstance(s50Var.currentAccount).sendRequest(declineconferencecallinvite, new l20(s50Var, 0));
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(invitedUser.msg_id));
        MessagesController.getInstance(s50Var.currentAccount).deleteMessages(arrayList, null, null, 0L, 0, true, 0);
        ChatObject.Call call = s50Var.W0;
        if (call != null) {
            call.invitedUsers.remove(l10);
            s50Var.W0.invitedUsersMap.remove(l10);
            s50Var.W0.invitedUsersMessageIds.remove(l10);
            s50Var.O0(true);
        }
    }

    public static void n(final s50 s50Var, Activity activity, ChatObject.Call call, View view, int i10) {
        TLRPC.Chat chat;
        final ChatObject.Call.InvitedUser invitedUser;
        AccountInstance accountInstance = s50Var.d;
        ArrayList arrayList = s50Var.B0;
        m50 m50Var = s50Var.L;
        if (view instanceof org.telegram.ui.Components.voip.l) {
            s50Var.e1(((org.telegram.ui.Components.voip.l) view).getParticipant());
            return;
        }
        if (view instanceof org.telegram.ui.Cells.b4) {
            s50Var.F1((org.telegram.ui.Cells.b4) view);
            return;
        }
        l = null;
        l = null;
        l = null;
        final Long l10 = null;
        boolean z10 = true;
        if (!(view instanceof org.telegram.ui.Cells.t3)) {
            if (i10 != m50Var.f40366w) {
                if (i10 != m50Var.f40367x) {
                    if (i10 == m50Var.f40368y) {
                        s50Var.v1();
                        return;
                    }
                    return;
                }
                ChatObject.Call call2 = s50Var.W0;
                if (call2 == null || call2.call == null) {
                    return;
                }
                cg.y2 y2Var = new cg.y2(activity, s50Var.currentAccount, null, 4, new jh.h0());
                ChatObject.Call call3 = s50Var.W0;
                y2Var.f2891y0.addAll(call3 != null ? (Collection) j$.util.Collection.EL.stream(call3.sortedParticipants).map(new l8(4)).collect(Collectors.toSet()) : null);
                y2Var.h0(false, true);
                y2Var.f2889w0 = new e20(s50Var, 3);
                y2Var.h0(false, true);
                y2Var.f2892z0 = new cg.u0(20, s50Var, call);
                y2Var.show();
                return;
            }
            if (ChatObject.isChannel(s50Var.V0) && (chat = s50Var.V0) != null && !chat.megagroup && ChatObject.isPublic(chat)) {
                s50Var.j1(false);
                return;
            }
            TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(s50Var.i1());
            if (chatFull == null) {
                return;
            }
            s50Var.f42485s0 = false;
            Context context = s50Var.getContext();
            int currentAccount = accountInstance.getCurrentAccount();
            TLRPC.Chat chat2 = s50Var.V0;
            ChatObject.Call call4 = s50Var.W0;
            org.telegram.ui.Components.g30 g30Var = new org.telegram.ui.Components.g30(context, currentAccount, chat2, chatFull, call4.participants, call4.invitedUsersMap);
            s50Var.A1 = g30Var;
            g30Var.setOnDismissListener(new h20(s50Var, 2));
            org.telegram.ui.Components.g30 g30Var2 = s50Var.A1;
            g30Var2.f28515c0 = new r20(s50Var);
            g30Var2.show();
            return;
        }
        org.telegram.ui.Cells.t3 t3Var = (org.telegram.ui.Cells.t3) view;
        if (t3Var.getUser() == null) {
            return;
        }
        if (!s50Var.o1()) {
            s50Var.f42427e0.K0(s50Var.currentAccount);
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", t3Var.getUser().f22527id);
            if (t3Var.f25661a.getImageReceiver().hasNotThumb()) {
                bundle.putBoolean("expandPhoto", true);
            }
            s50Var.f42427e0.p0(new ProfileActivity(bundle, null));
            s50Var.dismiss();
            return;
        }
        int i11 = i10 - m50Var.f40363n;
        if (i11 < 0 || i11 >= s50Var.W0.shadyJoinParticipants.size()) {
            int i12 = i10 - m50Var.f40365s;
            if (i12 < 0 || i12 >= s50Var.W0.shadyLeftParticipants.size()) {
                int i13 = i10 - m50Var.f40362f;
                if (s50Var.f42467o0) {
                    if (i13 >= 0 && i13 < arrayList.size()) {
                        l10 = (Long) arrayList.get(i13);
                    }
                } else if (i13 >= 0 && i13 < s50Var.W0.invitedUsers.size()) {
                    l10 = s50Var.W0.invitedUsers.get(i13);
                }
                z10 = false;
            } else {
                l10 = s50Var.W0.shadyLeftParticipants.get(i10 - m50Var.f40365s);
            }
        } else {
            l10 = s50Var.W0.shadyJoinParticipants.get(i10 - m50Var.f40363n);
        }
        if (z10 || (invitedUser = s50Var.W0.invitedUsersMessageIds.get(l10)) == null) {
            return;
        }
        org.telegram.ui.Components.b70 b70VarF = org.telegram.ui.Components.b70.F(s50Var.container, s50Var.resourcesProvider, t3Var);
        final int i14 = 0;
        b70VarF.l(R.drawable.msg_endcall, LocaleController.getString(R.string.GroupCallStopCallingInvite), new Runnable(s50Var) {

            public final s50 f39238b;

            {
                this.f39238b = s50Var;
            }

            @Override
            public final void run() {
                switch (i14) {
                    case 0:
                        s50.s(this.f39238b, invitedUser, l10);
                        break;
                    default:
                        s50.m(this.f39238b, invitedUser, l10);
                        break;
                }
            }
        }, invitedUser.isCalling());
        final int i15 = 1;
        b70VarF.c(R.drawable.msg_remove, LocaleController.getString(R.string.GroupCallDiscardInvite), new Runnable(s50Var) {

            public final s50 f39238b;

            {
                this.f39238b = s50Var;
            }

            @Override
            public final void run() {
                switch (i15) {
                    case 0:
                        s50.s(this.f39238b, invitedUser, l10);
                        break;
                    default:
                        s50.m(this.f39238b, invitedUser, l10);
                        break;
                }
            }
        }, false);
        b70VarF.W(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), s50Var.f42512y0.getColor()));
        b70VarF.f26992s = 96;
        b70VarF.Z();
    }

    public static void p(s50 s50Var, Activity activity) {
        LaunchActivity launchActivity;
        if (Build.VERSION.SDK_INT >= 23 && (launchActivity = s50Var.f42427e0) != null && launchActivity.checkSelfPermission("android.permission.CAMERA") != 0) {
            s50Var.f42427e0.requestPermissions(new String[]{"android.permission.CAMERA"}, 104);
            return;
        }
        if (VoIPService.getSharedInstance() == null) {
            return;
        }
        if (VoIPService.getSharedInstance().getVideoState(false) == 2) {
            VoIPService.getSharedInstance().setVideoState(false, 0);
            s50Var.N1(true, false);
            s50Var.M1(false);
            s50Var.W0.sortParticipants();
            s50Var.O0(true);
            s50Var.f42426e.requestLayout();
            return;
        }
        s50Var.f42432f0[0].e(1, false);
        if (s50Var.f42497v0 == null) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                sharedInstance.createCaptureDevice(false);
            }
            d40 d40Var = new d40(s50Var, activity, VoIPService.getSharedInstance().getVideoState(true) != 2);
            s50Var.f42497v0 = d40Var;
            d40Var.setBottomPadding(s50Var.containerView.getPaddingBottom());
            s50Var.container.addView(s50Var.f42497v0);
            if (sharedInstance == null || sharedInstance.isFrontFaceCamera()) {
                return;
            }
            sharedInstance.switchCamera();
        }
    }

    public static boolean p1(int i10) {
        return !(VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().groupCall == null || !VoIPService.getSharedInstance().groupCall.call.rtmp_stream) || i10 == 2 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7;
    }

    public static void q(s50 s50Var, float f10, float f11, float f12, int i10, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        s50Var.Z1 = fFloatValue;
        s50Var.W1.f33663n = fFloatValue;
        float f13 = (fFloatValue * 1.0f) + ((1.0f - fFloatValue) * f10);
        m30 m30Var = s50Var.f42514y2;
        m30Var.setScaleX(f13);
        m30Var.setScaleY(f13);
        m30Var.setTranslationX((1.0f - s50Var.Z1) * f11);
        m30Var.setTranslationY((1.0f - s50Var.Z1) * f12);
        if (!s50Var.f42420c2) {
            s50Var.S2.setAlpha((int) (s50Var.Z1 * 100.0f));
        }
        org.telegram.ui.Components.voip.t tVar = s50Var.V2;
        if (tVar != null) {
            tVar.f33871a.setRoundCorners((1.0f - s50Var.Z1) * AndroidUtilities.dp(8.0f));
        }
        m30Var.invalidate();
        s50Var.containerView.invalidate();
        l30 l30Var = s50Var.f42412b;
        int i11 = (int) ((1.0f - s50Var.Z1) * i10);
        l30Var.N(i11, i11);
    }

    public static void r(s50 s50Var, ChatObject.Call call, Boolean bool, HashSet hashSet) {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance;
        ChatObject.Call call2 = s50Var.W0;
        if (call2 == null || (groupCall = call2.call) == null) {
            return;
        }
        String str = groupCall.invite_link;
        int size = hashSet.size();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        HashSet hashSet2 = new HashSet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Long) it.next()).longValue();
            s50Var.W0.addInvitedUser(jLongValue);
            TL_phone.inviteConferenceCallParticipant inviteconferencecallparticipant = new TL_phone.inviteConferenceCallParticipant();
            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
            inviteconferencecallparticipant.call = tL_inputGroupCall;
            TLRPC.GroupCall groupCall2 = s50Var.W0.call;
            tL_inputGroupCall.f22397id = groupCall2.f22390id;
            tL_inputGroupCall.access_hash = groupCall2.access_hash;
            inviteconferencecallparticipant.user_id = MessagesController.getInstance(s50Var.currentAccount).getInputUser(jLongValue);
            inviteconferencecallparticipant.video = bool.booleanValue();
            ConnectionsManager.getInstance(s50Var.currentAccount).sendRequest(inviteconferencecallparticipant, new nh.y0(s50Var, jLongValue, hashSet2, atomicInteger, size, call, str));
        }
        s50Var.O0(true);
        if (!bool.booleanValue() || (sharedInstance = VoIPService.getSharedInstance()) == null || sharedInstance.getVideoState(false) == 2 || sharedInstance.getVideoState(false) == 1) {
            return;
        }
        sharedInstance.createCaptureDevice(false);
        if (!sharedInstance.isFrontFaceCamera()) {
            sharedInstance.switchCamera();
        }
        sharedInstance.requestVideoCall(false);
        sharedInstance.setVideoState(false, 2);
        sharedInstance.setMicMute(false, false, true);
        sharedInstance.switchToSpeaker();
        s50Var.N1(true, true);
    }

    public static void s(s50 s50Var, ChatObject.Call.InvitedUser invitedUser, Long l10) {
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = invitedUser.msg_id;
        ConnectionsManager.getInstance(s50Var.currentAccount).sendRequest(declineconferencecallinvite, new l20(s50Var, 1));
        ChatObject.Call call = s50Var.W0;
        if (call != null) {
            invitedUser.calling = false;
            call.invitedUsersMessageIds.put(l10, invitedUser);
            s50Var.O0(true);
        }
    }

    public static void t(s50 s50Var, TLObject tLObject) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(s50Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    public static void t1(Context context, Runnable runnable, boolean z10, boolean z11) {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        TLRPC.Chat chat = sharedInstance.getChat();
        ChatObject.Call call = sharedInstance.groupCall;
        long selfId = sharedInstance.getSelfId();
        if (z11 || !ChatObject.canManageCalls(chat)) {
            w1(call, false, selfId, runnable);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        if (sharedInstance.isConference()) {
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertTitle);
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertText);
        } else if (ChatObject.isChannelOrGiga(chat)) {
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.VoipChannelLeaveAlertTitle);
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.VoipChannelLeaveAlertText);
        } else {
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.VoipGroupLeaveAlertTitle);
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.VoipGroupLeaveAlertText);
        }
        sharedInstance.getAccount();
        org.telegram.ui.Cells.y1[] y1VarArr = new org.telegram.ui.Cells.y1[1];
        LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 1);
        if (!sharedInstance.isConference() || (call != null && (groupCall = call.call) != null && groupCall.creator)) {
            org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(context, 1);
            y1VarArr[0] = y1Var;
            y1Var.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
            if (z10) {
                y1VarArr[0].setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23161j5, false));
            } else {
                y1VarArr[0].setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23135hg, false));
                CheckBoxSquare checkBoxSquare = (CheckBoxSquare) y1VarArr[0].getCheckBoxView();
                int i10 = org.telegram.ui.ActionBar.g6.f23311rg;
                int i11 = org.telegram.ui.ActionBar.g6.f23275pg;
                int i12 = org.telegram.ui.ActionBar.g6.f23242ng;
                checkBoxSquare.f26325s = i10;
                checkBoxSquare.v = i11;
                checkBoxSquare.f26326w = i12;
                checkBoxSquare.invalidate();
            }
            y1VarArr[0].setTag(0);
            if (sharedInstance.isConference()) {
                y1VarArr[0].e(LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertEndChat), "", false, false, false);
            } else if (ChatObject.isChannelOrGiga(chat)) {
                y1VarArr[0].e(LocaleController.getString(R.string.VoipChannelLeaveAlertEndChat), "", false, false, false);
            } else {
                y1VarArr[0].e(LocaleController.getString(R.string.VoipGroupLeaveAlertEndChat), "", false, false, false);
            }
            y1VarArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
            linearLayoutG.addView(y1VarArr[0], h7.z5.n(-1, -2));
            y1VarArr[0].setOnClickListener(new f20(y1VarArr, 0));
        }
        alertDialog$Builder.n(linearLayoutG);
        alertDialog$Builder.f22702a.E = org.telegram.ui.ActionBar.g6.f23275pg;
        alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupLeave), new a9.d(call, y1VarArr, selfId, runnable));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        if (z10) {
            alertDialog$Builder.f22702a.L0 = false;
        }
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        if (z10) {
            if (Build.VERSION.SDK_INT >= 26) {
                b2Var.getWindow().setType(2038);
            } else {
                b2Var.getWindow().setType(2003);
            }
            b2Var.getWindow().clearFlags(2);
        }
        if (!z10) {
            b2Var.i(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23367ug, false));
        }
        b2Var.show();
        if (z10) {
            return;
        }
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23383vg, false));
        }
        b2Var.o(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23135hg, false));
    }

    public static void u(s50 s50Var) {
        s50Var.Y0();
        s50Var.V0();
        s50Var.U0();
        s50Var.B.setTranslationY((-s50Var.f42513y1.c()) + s50Var.containerView.getPaddingBottom());
        s50Var.C.invalidate();
        s50Var.Z0();
        s50Var.containerView.invalidate();
    }

    public static void v(s50 s50Var, TLObject tLObject) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(s50Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    public static void w(s50 s50Var, long j10, HashSet hashSet, AtomicInteger atomicInteger, int i10, ChatObject.Call call, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(s50Var.currentAccount).processUpdates(updates, false);
            AndroidUtilities.runOnUIThread(new e5.u(s50Var, updates, j10, 28));
        } else if (tL_error != null && "USER_PRIVACY_RESTRICTED".equalsIgnoreCase(tL_error.text)) {
            hashSet.add(Long.valueOf(j10));
        }
        if (atomicInteger.incrementAndGet() != i10 || hashSet.isEmpty()) {
            return;
        }
        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l11(s50Var, hashSet, call, str, 3));
    }

    public static void w1(ChatObject.Call call, boolean z10, long j10, Runnable runnable) {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(z10 ? 1 : 0);
        }
        if (call != null) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(j10);
            if (groupCallParticipant != null) {
                call.participants.e(j10);
                call.sortedParticipants.remove(groupCallParticipant);
                call.visibleParticipants.remove(groupCallParticipant);
                int i10 = 0;
                while (i10 < call.visibleVideoParticipants.size()) {
                    if (MessageObject.getPeerId(call.visibleVideoParticipants.get(i10).participant.peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                        call.visibleVideoParticipants.remove(i10);
                        i10--;
                    }
                    i10++;
                }
                call.call.participants_count--;
            }
            for (int i11 = 0; i11 < call.sortedParticipants.size(); i11++) {
                TLRPC.GroupCallParticipant groupCallParticipant2 = call.sortedParticipants.get(i11);
                groupCallParticipant2.lastActiveDate = groupCallParticipant2.lastSpeakTime;
            }
        }
        if (runnable != null) {
            runnable.run();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didStartedCall, new Object[0]);
    }

    public static void x(s50 s50Var, HashSet hashSet, ChatObject.Call call, String str) {
        TL_account.getRequirementsToContact getrequirementstocontact = new TL_account.getRequirementsToContact();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Long l10 = (Long) it.next();
            long jLongValue = l10.longValue();
            if (call != null) {
                call.removeInvitedUser(jLongValue);
            }
            arrayList.add(MessagesController.getInstance(s50Var.currentAccount).getUser(l10));
            getrequirementstocontact.f22587id.add(MessagesController.getInstance(s50Var.currentAccount).getInputUser(jLongValue));
        }
        org.telegram.ui.Components.l20 l20Var = new org.telegram.ui.Components.l20(s50Var, arrayList, arrayList2, arrayList3, str, 7);
        if (UserConfig.getInstance(s50Var.currentAccount).isPremium()) {
            l20Var.run();
        } else {
            ConnectionsManager.getInstance(s50Var.currentAccount).sendRequest(getrequirementstocontact, new z9(arrayList, arrayList2, l20Var, 13));
        }
    }

    public static void y(s50 s50Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
        if (n2VarU == null) {
            return;
        }
        ag.i1 i1Var = new ag.i1(34, s50Var.currentAccount, n2VarU.getContext(), n2VarU, new jh.h0());
        i1Var.I1(null, arrayList, arrayList2, arrayList3, str);
        i1Var.show();
    }

    public static void z(s50 s50Var, org.telegram.ui.ActionBar.b2[] b2VarArr, boolean z10, TLRPC.TL_error tL_error, long j10, TL_phone.inviteToGroupCall invitetogroupcall) {
        try {
            b2VarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        b2VarArr[0] = null;
        if (z10 && "USER_NOT_PARTICIPANT".equals(tL_error.text)) {
            s50Var.x1(null, j10, 3);
        } else {
            org.telegram.ui.Components.y4.f0(s50Var.currentAccount, tL_error, (org.telegram.ui.ActionBar.n2) s50Var.f42427e0.O().getFragmentStack().get(s50Var.f42427e0.O().getFragmentStack().size() - 1), invitetogroupcall, new Object[0]);
        }
    }

    public final void A1(TLRPC.TL_textWithEntities tL_textWithEntities) {
        TLRPC.InputGroupCall inputGroupCall;
        this.D.setText("");
        ChatObject.Call call = this.W0;
        if (call == null || call.call == null || (inputGroupCall = call.getInputGroupCall()) == null) {
            return;
        }
        ChatObject.Call call2 = this.W0;
        long j10 = call2.call.f22390id;
        TLRPC.Peer peer = call2.selfPeer;
        GroupCallMessagesController.getInstance(this.currentAccount).sendCallMessage(peer != null ? DialogObject.getPeerDialogId(peer) : UserConfig.getInstance(this.currentAccount).clientUserId, tL_textWithEntities, j10, inputGroupCall);
    }

    public final void B1(float f10) {
        this.Q1 = f10;
        j30 j30Var = this.W1;
        float fMax = Math.max(f10, j30Var == null ? 0.0f : j30Var.f33650c);
        int i10 = org.telegram.ui.ActionBar.g6.f23172jg;
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        int i11 = org.telegram.ui.ActionBar.g6.f23117gg;
        int offsetColor = AndroidUtilities.getOffsetColor(iW0, org.telegram.ui.ActionBar.g6.w0(null, i11, false), f10, 1.0f);
        this.R1 = offsetColor;
        this.J.setBackgroundColor(offsetColor);
        this.f42437g1.B(-14472653);
        this.f42413b0.setColorFilter(new PorterDuffColorFilter(this.R1, PorterDuff.Mode.MULTIPLY));
        this.navBarColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false), org.telegram.ui.ActionBar.g6.w0(null, i11, false), fMax, 1.0f);
        int offsetColor2 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23190kg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23349tg, false), f10, 1.0f);
        c50 c50Var = this.f42456l0;
        if (c50Var != null) {
            c50Var.f36966j = offsetColor2;
            ag.s0 s0Var = c50Var.f36964g;
            if (s0Var != null) {
                s0Var.invalidate();
            }
        }
        this.f42512y0.setColor(offsetColor2);
        this.A.setColor(offsetColor2);
        this.B.invalidate();
        y40 y40Var = this.M;
        y40Var.setGlowColor(offsetColor2);
        int i12 = this.B1;
        if (i12 == 3 || p1(i12)) {
            this.f42501w.invalidate();
        }
        View view = this.F2;
        if (view != null) {
            int i13 = this.R1;
            int[] iArr = this.I2;
            iArr[0] = i13;
            iArr[1] = 0;
            if (Build.VERSION.SDK_INT > 29) {
                this.H2.setColors(iArr);
            } else {
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, iArr);
                this.H2 = gradientDrawable;
                view.setBackground(gradientDrawable);
            }
            this.G2.setBackgroundColor(iArr[0]);
        }
        int offsetColor3 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Dg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Eg, false), f10, 1.0f);
        this.f42484s.a(offsetColor3, offsetColor3);
        int offsetColor4 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23207lg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23260og, false), f10, 1.0f);
        int offsetColor5 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23225mg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23311rg, false), f10, 1.0f);
        int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, this.resourcesProvider);
        int childCount = y40Var.getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = y40Var.getChildAt(i14);
            if (childAt instanceof org.telegram.ui.Cells.u3) {
                org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) childAt;
                if (o1()) {
                    u3Var.a(iV0, iV0);
                } else {
                    u3Var.a(offsetColor5, offsetColor4);
                }
            } else {
                boolean z10 = childAt instanceof org.telegram.ui.Cells.b4;
                o40 o40Var = this.K;
                if (z10) {
                    ((org.telegram.ui.Cells.b4) childAt).f(o40Var.getTag() != null ? org.telegram.ui.ActionBar.g6.f23311rg : org.telegram.ui.ActionBar.g6.f23225mg, offsetColor5);
                } else if (childAt instanceof org.telegram.ui.Cells.t3) {
                    ((org.telegram.ui.Cells.t3) childAt).a(o40Var.getTag() != null ? org.telegram.ui.ActionBar.g6.f23311rg : org.telegram.ui.ActionBar.g6.f23225mg, offsetColor5);
                }
            }
        }
        this.containerView.invalidate();
        y40Var.invalidate();
        this.container.invalidate();
    }

    public final void C1(float f10) {
        y40 y40Var;
        TLRPC.GroupCallParticipant groupCallParticipant;
        f2.o1 o1VarK;
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            f10 = 0.0f;
        }
        float fMin = (float) (Math.min(8500.0d, 4000.0f * f10) / 8500.0d);
        this.L0 = fMin;
        this.M0 = (fMin - this.K0) / 265.0f;
        ChatObject.Call call = this.W0;
        if (call == null || (y40Var = this.M) == null || (groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(MessageObject.getPeerId(this.f42502w0))) == null) {
            return;
        }
        j30 j30Var = this.W1;
        if (j30Var.f33648b) {
            int i10 = 0;
            while (true) {
                f30 f30Var = this.f42446i2;
                if (i10 >= f30Var.getChildCount()) {
                    break;
                }
                org.telegram.ui.Components.e20 e20Var = (org.telegram.ui.Components.e20) f30Var.getChildAt(i10);
                if (MessageObject.getPeerId(e20Var.getParticipant().peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                    e20Var.setAmplitude(f10 * 15.0f);
                }
                i10++;
            }
        } else {
            int iIndexOf = (this.f42467o0 ? this.f42516z0 : this.W0.visibleParticipants).indexOf(groupCallParticipant);
            if (iIndexOf >= 0 && (o1VarK = y40Var.K(iIndexOf + this.L.d)) != null) {
                View view = o1VarK.f5789a;
                if (view instanceof org.telegram.ui.Cells.b4) {
                    ((org.telegram.ui.Cells.b4) view).setAmplitude(f10 * 15.0f);
                    if (view == this.T2 && !this.f42442h2) {
                        this.containerView.invalidate();
                    }
                }
            }
        }
        j30Var.k(groupCallParticipant, f10 * 15.0f);
    }

    public final void D1(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25) {
        this.f42421c3 = i10;
        this.f42425d3 = i11;
        this.f42430e3 = i12;
        this.f42435f3 = i13;
        this.f42439g3 = i14;
        this.f42443h3 = i15;
        this.f42447i3 = i16;
        this.f42451j3 = i17;
        this.f42455k3 = i18;
        this.f42458l3 = i19;
        this.f42461m3 = i20;
        this.f42466n3 = i21;
        this.f42470o3 = i22;
        this.f42474p3 = i23;
        this.f42478q3 = i24;
        this.f42483r3 = i25;
    }

    public final void E1(float f10) {
        int iDp;
        this.f42493u0 = f10;
        y40 y40Var = this.M;
        y40Var.setTopGlowOffset((int) (f10 - ((FrameLayout.LayoutParams) y40Var.getLayoutParams()).topMargin));
        int iDp2 = AndroidUtilities.dp(74.0f);
        float f11 = f10 - iDp2;
        float f12 = this.backgroundPaddingTop + f11;
        float currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2;
        h50 h50Var = this.Q0;
        j30 j30Var = this.W1;
        d30 d30Var = this.f42414b1;
        b30 b30Var = this.f42411a1;
        if (f12 < currentActionBarHeight) {
            float fMin = Math.min(1.0f, (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2) - f11) - this.backgroundPaddingTop) / (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + ((iDp2 - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f))));
            iDp = (int) (AndroidUtilities.dp(AndroidUtilities.isTablet() ? 17.0f : 13.0f) * fMin);
            if (h50Var != null) {
                h50Var.setShadowOffset((int) (AndroidUtilities.dp(8.0f) * fMin));
            }
            if (Math.abs(Math.min(1.0f, fMin) - this.Q1) > 1.0E-4f) {
                B1(Math.min(1.0f, fMin));
            }
            float f13 = 1.0f - ((0.1f * fMin) * 1.2f);
            b30Var.setScaleX(Math.max(0.9f, f13));
            b30Var.setScaleY(Math.max(0.9f, f13));
            float f14 = 1.0f - (fMin * 1.2f);
            b30Var.setAlpha((1.0f - j30Var.f33650c) * Math.max(0.0f, f14));
            d30Var.setScaleX(Math.max(0.9f, f13));
            d30Var.setScaleY(Math.max(0.9f, f13));
            d30Var.setAlpha((1.0f - j30Var.f33650c) * Math.max(0.0f, f14));
        } else {
            b30Var.setScaleX(1.0f);
            b30Var.setScaleY(1.0f);
            b30Var.setAlpha(1.0f - j30Var.f33650c);
            d30Var.setScaleX(1.0f);
            d30Var.setScaleY(1.0f);
            d30Var.setAlpha(1.0f - j30Var.f33650c);
            if (this.Q1 > 1.0E-4f) {
                B1(0.0f);
            }
            iDp = 0;
        }
        Y0();
        float f15 = iDp;
        this.f42498v1.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f10 - AndroidUtilities.dp(53.0f)) - f15));
        this.f42433f1.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f10 - AndroidUtilities.dp(44.0f)) - f15));
        if (h50Var != null) {
            h50Var.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), f10 - AndroidUtilities.dp(37.0f)));
        }
        a40 a40Var = this.N;
        if (a40Var != null) {
            a40Var.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f10 - AndroidUtilities.dp(44.0f)) - f15));
        }
        this.containerView.invalidate();
        Q1();
    }

    public final boolean F1(View view) {
        org.telegram.ui.Cells.b4 b4Var;
        boolean z10;
        TLRPC.GroupCallParticipant participant;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        ?? linearLayout;
        LinearLayout linearLayout2;
        ?? m5Var;
        p50 p50Var;
        float f10;
        org.telegram.ui.ActionBar.v1 v1Var;
        p50 p50Var2;
        long peerId;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z11;
        ArrayList arrayList3;
        boolean z12;
        AccountInstance accountInstance;
        long j10;
        ?? r27;
        org.telegram.ui.ActionBar.v1 v1Var2;
        AccountInstance accountInstance2;
        boolean z13;
        ?? r28;
        long j11;
        TLRPC.Peer peer;
        long j12;
        TLRPC.Peer peer2;
        ChatObject.Call call;
        TLRPC.GroupCall groupCall;
        long j13;
        int size;
        int i10;
        y40 y40Var;
        AnimatorSet animatorSet;
        long j14;
        ImageLocation forUserOrChat;
        ImageLocation forUserOrChat2;
        org.telegram.ui.Components.voip.t tVar;
        boolean z14;
        boolean z15;
        l30 l30Var;
        org.telegram.ui.Components.voip.t tVar2;
        z40 z40Var;
        TLRPC.FileLocation fileLocation;
        org.telegram.ui.Components.e20 e20Var;
        int x8;
        float y10;
        float y11;
        int measuredHeight;
        int y12;
        boolean z16;
        j30 j30Var;
        f30 f30Var;
        o30 o30Var;
        int i11;
        org.telegram.ui.Components.e20 e20Var2;
        TLRPC.User user;
        ?? f1Var;
        boolean z17;
        boolean z18;
        ?? r10;
        boolean z19;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        ?? r29;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatParticipants chatParticipants;
        int size2;
        int i17;
        TLRPC.ChatParticipant chatParticipant;
        TLRPC.ChatFull chatFull2;
        int i18;
        TLRPC.ChannelParticipant adminInChannel;
        if (!this.T.k() && getContext() != null) {
            if (this.Y2 || this.f42415b2) {
                d1(true);
                return false;
            }
            s40 s40Var = this.f42416b3;
            if (s40Var != null) {
                s40Var.dismiss();
                this.f42416b3 = null;
                return false;
            }
            b1();
            if (view instanceof org.telegram.ui.Components.voip.l) {
                org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) view;
                if (lVar.getParticipant() != this.W0.videoNotAvailableParticipant) {
                    b4Var = new org.telegram.ui.Cells.b4(lVar.getContext());
                    b4Var.e(this.d, lVar.getParticipant().participant, this.W0, MessageObject.getPeerId(this.f42502w0), null, false);
                    org.telegram.ui.Components.i5 i5Var = b4Var.f24103s;
                    if (i5Var != null) {
                        i5Var.f();
                    }
                    this.X2 = false;
                    this.U2 = lVar;
                    this.V2 = lVar.getRenderer();
                    if (!C3 && !B3) {
                        this.containerView.addView(b4Var, h7.z5.d(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
                    }
                    if (b4Var != null) {
                        if (!B3 || C3 || AndroidUtilities.isInMultiwindow) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        participant = b4Var.getParticipant();
                        if (participant != null) {
                            Rect rect = new Rect();
                            actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(getContext(), null);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundDrawable(null);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(0, 0, 0, 0);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new di(this, rect));
                            actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new b20(this, 5));
                            linearLayout = new LinearLayout(getContext());
                            if (participant.muted_by_you) {
                                linearLayout2 = null;
                            } else {
                                linearLayout2 = new LinearLayout(getContext());
                            }
                            this.A2 = linearLayout;
                            m5Var = new lh.m5(getContext(), linearLayout, linearLayout2, 7);
                            m5Var.setMinimumWidth(AndroidUtilities.dp(240.0f));
                            m5Var.setOrientation(1);
                            int offsetColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23190kg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23349tg, false), this.Q1, 1.0f);
                            if (linearLayout2 != null || b4Var.c() || participant.muted_by_you || (participant.muted && !participant.can_self_unmute)) {
                                p50Var = null;
                            } else {
                                Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate();
                                drawableMutate.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.MULTIPLY));
                                linearLayout2.setBackgroundDrawable(drawableMutate);
                                m5Var.addView(linearLayout2, h7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -2, -2));
                                p50Var = new p50(this, getContext(), participant);
                                linearLayout2.addView(p50Var, -1, 48);
                            }
                            linearLayout.setMinimumWidth(AndroidUtilities.dp(240.0f));
                            linearLayout.setOrientation(1);
                            Drawable drawableMutate2 = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate();
                            drawableMutate2.setColorFilter(new PorterDuffColorFilter(offsetColor, PorterDuff.Mode.MULTIPLY));
                            linearLayout.setBackgroundDrawable(drawableMutate2);
                            if (p50Var != null) {
                                f10 = -8.0f;
                            } else {
                                f10 = 0.0f;
                            }
                            m5Var.addView(linearLayout, h7.z5.k(0.0f, f10, 0.0f, 0.0f, -2, -2));
                            v1Var = new org.telegram.ui.ActionBar.v1(getContext(), R.style.scrollbarShapeStyle, (lh.m5) m5Var);
                            v1Var.setClipToPadding(false);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(v1Var, h7.z5.c(-2.0f, -2));
                            p50Var2 = p50Var;
                            peerId = MessageObject.getPeerId(participant.peer);
                            arrayList = new ArrayList(2);
                            arrayList2 = new ArrayList(2);
                            z11 = z10;
                            arrayList3 = new ArrayList(2);
                            z12 = participant.peer instanceof TLRPC.TL_peerUser;
                            accountInstance = this.d;
                            if (z12) {
                                accountInstance2 = accountInstance;
                                if (ChatObject.isChannel(this.V0)) {
                                    j10 = peerId;
                                    r27 = m5Var;
                                    v1Var2 = v1Var;
                                    adminInChannel = accountInstance2.getMessagesController().getAdminInChannel(participant.peer.user_id, i1());
                                    if (adminInChannel == null && ((adminInChannel instanceof TLRPC.TL_channelParticipantCreator) || adminInChannel.admin_rights.manage_call)) {
                                        r29 = r27;
                                        r29 = r27;
                                        r29 = r27;
                                        r29 = r27;
                                        r29 = r27;
                                        z13 = true;
                                        r28 = r29;
                                    } else {
                                        r29 = r27;
                                        r29 = r27;
                                        r29 = r27;
                                        r29 = r27;
                                        z13 = false;
                                        r28 = r27;
                                    }
                                } else {
                                    j10 = peerId;
                                    r27 = m5Var;
                                    v1Var2 = v1Var;
                                    chatFull = accountInstance2.getMessagesController().getChatFull(i1());
                                    if (chatFull != null && (chatParticipants = chatFull.participants) != null) {
                                        size2 = chatParticipants.participants.size();
                                        i17 = 0;
                                        while (true) {
                                            if (i17 < size2) {
                                                chatParticipant = chatFull.participants.participants.get(i17);
                                                chatFull2 = chatFull;
                                                i18 = size2;
                                                if (chatParticipant.user_id == participant.peer.user_id) {
                                                    r29 = r27;
                                                    if (!(chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) || (chatParticipant instanceof TLRPC.TL_chatParticipantCreator)) {
                                                        r29 = r27;
                                                        r29 = r27;
                                                        r29 = r27;
                                                        r29 = r27;
                                                        r29 = r27;
                                                        z13 = true;
                                                        r28 = r29;
                                                    }
                                                } else {
                                                    i17++;
                                                    chatFull = chatFull2;
                                                    size2 = i18;
                                                }
                                            }
                                        }
                                    }
                                    r29 = r27;
                                    r29 = r27;
                                    r29 = r27;
                                    r29 = r27;
                                    z13 = false;
                                    r28 = r27;
                                }
                            } else {
                                j10 = peerId;
                                r27 = m5Var;
                                v1Var2 = v1Var;
                                accountInstance2 = accountInstance;
                                if (j10 == (-i1())) {
                                    r29 = r27;
                                    r29 = r27;
                                    r29 = r27;
                                    r29 = r27;
                                    r29 = r27;
                                    z13 = true;
                                    r28 = r29;
                                } else {
                                    r29 = r27;
                                    r29 = r27;
                                    r29 = r27;
                                    r29 = r27;
                                    z13 = false;
                                    r28 = r27;
                                }
                            }
                            if (b4Var.c()) {
                                if (o1() && b4Var.G) {
                                    arrayList.add(LocaleController.getString(R.string.VoipGroupCancelRaiseHand));
                                    org.telegram.ui.Cells.pa.n(R.drawable.msg_handdown, 7, arrayList2, arrayList3);
                                }
                                if (b4Var.f24097b.getImageReceiver().hasNotThumb()) {
                                    i12 = R.string.VoipAddPhoto;
                                } else {
                                    i12 = R.string.VoipSetNewPhoto;
                                }
                                arrayList.add(LocaleController.getString(i12));
                                org.telegram.ui.Cells.pa.n(R.drawable.msg_addphoto, 9, arrayList2, arrayList3);
                                if (j10 > 0) {
                                    if (TextUtils.isEmpty(participant.about)) {
                                        i16 = R.string.VoipAddBio;
                                    } else {
                                        i16 = R.string.VoipEditBio;
                                    }
                                    arrayList.add(LocaleController.getString(i16));
                                } else {
                                    if (TextUtils.isEmpty(participant.about)) {
                                        i13 = R.string.VoipAddDescription;
                                    } else {
                                        i13 = R.string.VoipEditDescription;
                                    }
                                    arrayList.add(LocaleController.getString(i13));
                                }
                                if (TextUtils.isEmpty(participant.about)) {
                                    i14 = R.drawable.msg_addbio;
                                } else {
                                    i14 = R.drawable.msg_info;
                                }
                                org.telegram.ui.Cells.pa.n(i14, 10, arrayList2, arrayList3);
                                if (j10 > 0) {
                                    i15 = R.string.VoipEditName;
                                } else {
                                    i15 = R.string.VoipEditTitle;
                                }
                                arrayList.add(LocaleController.getString(i15));
                                org.telegram.ui.Cells.pa.n(R.drawable.msg_edit, 11, arrayList2, arrayList3);
                                j11 = 0;
                            } else if (Q0()) {
                                if (o1() && z13 && participant.muted) {
                                    if (o1() && participant.muted_by_you) {
                                        arrayList.add(LocaleController.getString(R.string.VoipGroupUnmuteForMe));
                                        org.telegram.ui.Cells.pa.p(R.drawable.msg_voice_unmuted, arrayList2, arrayList3, 4);
                                    }
                                    j11 = 0;
                                } else if (participant.muted || participant.can_self_unmute) {
                                    j11 = 0;
                                    arrayList.add(LocaleController.getString(R.string.VoipGroupMute));
                                    org.telegram.ui.Cells.pa.n(R.drawable.msg_voice_muted, 0, arrayList2, arrayList3);
                                } else {
                                    arrayList.add(LocaleController.getString(R.string.VoipGroupAllowToSpeak));
                                    j11 = 0;
                                    if (participant.raise_hand_rating != 0) {
                                        arrayList2.add(Integer.valueOf(R.drawable.msg_allowspeak));
                                    } else {
                                        arrayList2.add(Integer.valueOf(R.drawable.msg_voice_unmuted));
                                    }
                                    arrayList3.add(1);
                                }
                                peer2 = participant.peer;
                                if (peer2 != null) {
                                    j13 = peer2.channel_id;
                                    if (j13 != j11 || ChatObject.isMegagroup(this.currentAccount, j13)) {
                                        arrayList.add(LocaleController.getString(R.string.VoipGroupOpenProfile));
                                        org.telegram.ui.Cells.pa.p(R.drawable.msg_openprofile, arrayList2, arrayList3, 6);
                                    } else {
                                        arrayList.add(LocaleController.getString(R.string.VoipGroupOpenChannel));
                                        org.telegram.ui.Cells.pa.p(R.drawable.msg_channel, arrayList2, arrayList3, 8);
                                    }
                                } else {
                                    arrayList.add(LocaleController.getString(R.string.VoipGroupOpenProfile));
                                    org.telegram.ui.Cells.pa.p(R.drawable.msg_openprofile, arrayList2, arrayList3, 6);
                                }
                                if (o1() ? !(z13 || !ChatObject.canBlockUsers(this.V0)) : !((call = this.W0) == null || (groupCall = call.call) == null || !groupCall.creator)) {
                                    arrayList.add(LocaleController.getString(R.string.VoipGroupUserRemove));
                                    org.telegram.ui.Cells.pa.n(R.drawable.msg_block2, 2, arrayList2, arrayList3);
                                }
                            } else {
                                j11 = 0;
                                if (participant.muted_by_you) {
                                    arrayList.add(LocaleController.getString(R.string.VoipGroupUnmuteForMe));
                                    org.telegram.ui.Cells.pa.p(R.drawable.msg_voice_unmuted, arrayList2, arrayList3, 4);
                                } else {
                                    arrayList.add(LocaleController.getString(R.string.VoipGroupMuteForMe));
                                    org.telegram.ui.Cells.pa.n(R.drawable.msg_voice_muted, 5, arrayList2, arrayList3);
                                }
                                peer = participant.peer;
                                if (peer != null) {
                                    j12 = peer.channel_id;
                                    if (j12 != 0 || ChatObject.isMegagroup(this.currentAccount, j12)) {
                                        arrayList.add(LocaleController.getString(R.string.VoipGroupOpenChat));
                                        org.telegram.ui.Cells.pa.p(R.drawable.msg_msgbubble3, arrayList2, arrayList3, 6);
                                    } else {
                                        arrayList.add(LocaleController.getString(R.string.VoipGroupOpenChannel));
                                        org.telegram.ui.Cells.pa.p(R.drawable.msg_msgbubble3, arrayList2, arrayList3, 8);
                                    }
                                } else {
                                    arrayList.add(LocaleController.getString(R.string.VoipGroupOpenChat));
                                    org.telegram.ui.Cells.pa.p(R.drawable.msg_msgbubble3, arrayList2, arrayList3, 6);
                                }
                            }
                            size = arrayList.size();
                            i10 = 0;
                            while (i10 < size) {
                                Context context = getContext();
                                if (i10 == 0) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                if (i10 == size - 1) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                f1Var = new org.telegram.ui.ActionBar.f1(context, z17, z18);
                                if (((Integer) arrayList3.get(i10)).intValue() != 2) {
                                    int i19 = org.telegram.ui.ActionBar.g6.f23135hg;
                                    r10 = 0;
                                    z19 = false;
                                    f1Var.c(org.telegram.ui.ActionBar.g6.w0(null, i19, false), org.telegram.ui.ActionBar.g6.w0(null, i19, false));
                                } else {
                                    r10 = 0;
                                    z19 = false;
                                    int i20 = org.telegram.ui.ActionBar.g6.f23383vg;
                                    f1Var.c(org.telegram.ui.ActionBar.g6.w0(null, i20, false), org.telegram.ui.ActionBar.g6.w0(null, i20, false));
                                }
                                f1Var.setSelectorColor(org.telegram.ui.ActionBar.g6.w0(r10, org.telegram.ui.ActionBar.g6.f23081eg, z19));
                                f1Var.g((CharSequence) arrayList.get(i10), ((Integer) arrayList2.get(i10)).intValue(), r10);
                                linearLayout.addView(f1Var);
                                f1Var.setTag(arrayList3.get(i10));
                                TLRPC.GroupCallParticipant groupCallParticipant = participant;
                                ArrayList arrayList4 = arrayList3;
                                f1Var.setOnClickListener(new jh.l5(this, i10, arrayList4, groupCallParticipant, 3));
                                i10++;
                                participant = groupCallParticipant;
                                arrayList2 = arrayList2;
                                arrayList3 = arrayList4;
                            }
                            v1Var2.addView((View) r28, h7.z5.x(-2, -2, 51));
                            y40Var = this.M;
                            y40Var.B0();
                            this.U.X = false;
                            this.T2 = b4Var;
                            b4Var.setAboutVisible(true);
                            this.containerView.invalidate();
                            y40Var.invalidate();
                            animatorSet = this.a3;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                            }
                            this.a2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                            if (j10 > j11) {
                                user = accountInstance2.getMessagesController().getUser(Long.valueOf(j10));
                                forUserOrChat = ImageLocation.getForUserOrChat(accountInstance2.getCurrentAccount(), user, 0);
                                forUserOrChat2 = ImageLocation.getForUserOrChat(accountInstance2.getCurrentAccount(), user, 1);
                                j14 = j10;
                                if (MessagesController.getInstance(this.currentAccount).getUserFull(j14) == null) {
                                    MessagesController.getInstance(this.currentAccount).loadUserInfo(user, false, 0);
                                }
                            } else {
                                j14 = j10;
                                TLRPC.Chat chat = accountInstance2.getMessagesController().getChat(Long.valueOf(-j14));
                                forUserOrChat = ImageLocation.getForUserOrChat(accountInstance2.getCurrentAccount(), chat, 0);
                                forUserOrChat2 = ImageLocation.getForUserOrChat(accountInstance2.getCurrentAccount(), chat, 1);
                            }
                            tVar = this.V2;
                            if (tVar == null && tVar.v) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (forUserOrChat == null || z14) {
                                if (z11) {
                                    org.telegram.ui.Components.n9 avatarImageView = this.T2.getAvatarImageView();
                                    l30Var = this.f42412b;
                                    l30Var.setParentAvatarImage(avatarImageView);
                                    l30Var.setHasActiveVideo(z14);
                                    l30Var.M(j14, true);
                                    l30Var.setCreateThumbFromParent(true);
                                    l30Var.H(null, forUserOrChat, forUserOrChat2, true);
                                    tVar2 = this.V2;
                                    if (tVar2 != null) {
                                        tVar2.h = true;
                                        tVar2.j(true);
                                    }
                                    if (MessageObject.getPeerId(this.f42502w0) == j14 && this.f42424d2 != null && (z40Var = this.f42429e2) != null && (fileLocation = z40Var.f45025c) != null) {
                                        l30Var.A(z40Var.d, ImageLocation.getForLocal(fileLocation));
                                    }
                                }
                                z15 = z11;
                            } else {
                                z15 = false;
                            }
                            if (z15) {
                                this.f42415b2 = true;
                                actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                                this.containerView.addView(this.a2, h7.z5.c(-2.0f, -2));
                                this.f42420c2 = true;
                                o30Var = this.X1;
                                if (o30Var == null) {
                                    i11 = 0;
                                } else {
                                    int measuredWidth = (int) ((this.containerView.getMeasuredWidth() - (this.backgroundPaddingLeft * 2)) / 6.0f);
                                    int measuredHeight2 = (int) ((this.containerView.getMeasuredHeight() - AndroidUtilities.statusBarHeight) / 6.0f);
                                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight2, Bitmap.Config.ARGB_8888);
                                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                                    canvas.scale(0.16666667f, 0.16666667f);
                                    canvas.save();
                                    canvas.translate(0.0f, -AndroidUtilities.statusBarHeight);
                                    this.f42427e0.O().getView().draw(canvas);
                                    canvas.drawColor(i0.b.k(-16777216, 76));
                                    canvas.restore();
                                    canvas.save();
                                    canvas.translate(this.containerView.getX(), -AndroidUtilities.statusBarHeight);
                                    this.B2 = true;
                                    this.containerView.draw(canvas);
                                    i11 = 0;
                                    this.B2 = false;
                                    Utilities.stackBlurBitmap(bitmapCreateBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight2) / 180));
                                    o30Var.setBackground(new BitmapDrawable(bitmapCreateBitmap));
                                    o30Var.setAlpha(0.0f);
                                    o30Var.setVisibility(0);
                                    o30Var.bringToFront();
                                }
                                this.Y2 = true;
                                this.f42514y2.setVisibility(i11);
                                if (p50Var2 != null) {
                                    p50Var2.invalidate();
                                }
                                y1(true, b4Var);
                                e20Var2 = this.W2;
                                if (e20Var2 != null) {
                                    e20Var2.getAvatarImageView().setAlpha(0.0f);
                                }
                                return true;
                            }
                            this.f42415b2 = false;
                            s40 s40Var2 = new s40(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                            this.f42416b3 = s40Var2;
                            s40Var2.f23684e = true;
                            s40Var2.f23683c = 220;
                            s40Var2.setOutsideTouchable(true);
                            this.f42416b3.setClippingEnabled(true);
                            this.f42416b3.setAnimationStyle(R.style.PopupContextAnimation);
                            this.f42416b3.setFocusable(true);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                            this.f42416b3.setInputMethodMode(2);
                            this.f42416b3.setSoftInputMode(0);
                            this.f42416b3.getContentView().setFocusableInTouchMode(true);
                            e20Var = this.W2;
                            if (e20Var != null) {
                                z16 = B3;
                                j30Var = this.W1;
                                f30Var = this.f42446i2;
                                if (z16) {
                                    x8 = AndroidUtilities.dp(32.0f) + (((int) (j30Var.getX() + (f30Var.getX() + e20Var.getX()))) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
                                    y12 = ((int) (j30Var.getY() + (f30Var.getY() + this.W2.getY()))) - AndroidUtilities.dp(6.0f);
                                } else {
                                    x8 = ((int) (j30Var.getX() + (f30Var.getX() + e20Var.getX()))) - AndroidUtilities.dp(14.0f);
                                    y10 = (j30Var.getY() + (f30Var.getY() + this.W2.getY())) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                                    y12 = (int) y10;
                                }
                            } else {
                                x8 = (int) (((y40Var.getX() + y40Var.getMeasuredWidth()) + AndroidUtilities.dp(8.0f)) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
                                if (this.X2) {
                                    y11 = b4Var.getY() + y40Var.getY();
                                    measuredHeight = b4Var.getClipHeight();
                                } else if (this.U2 != null) {
                                    y11 = this.U2.getY() + y40Var.getY();
                                    measuredHeight = this.U2.getMeasuredHeight();
                                } else {
                                    y10 = y40Var.getY();
                                    y12 = (int) y10;
                                }
                                y12 = (int) (y11 + measuredHeight);
                            }
                            this.f42416b3.showAtLocation(y40Var, 51, x8, y12);
                            this.a3 = new AnimatorSet();
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.add(ObjectAnimator.ofInt(this.S2, org.telegram.ui.Components.m6.f30579b, 0, 100));
                            this.a3.playTogether(arrayList5);
                            this.a3.setDuration(150L);
                            this.a3.start();
                            return true;
                        }
                    }
                }
            } else {
                if (view instanceof org.telegram.ui.Components.e20) {
                    org.telegram.ui.Components.e20 e20Var3 = (org.telegram.ui.Components.e20) view;
                    if (e20Var3.getParticipant() != this.W0.videoNotAvailableParticipant.participant) {
                        b4Var = new org.telegram.ui.Cells.b4(e20Var3.getContext());
                        b4Var.e(this.d, e20Var3.getParticipant(), this.W0, MessageObject.getPeerId(this.f42502w0), null, false);
                        org.telegram.ui.Components.i5 i5Var2 = b4Var.f24103s;
                        if (i5Var2 != null) {
                            i5Var2.f();
                        }
                        this.X2 = false;
                        this.W2 = e20Var3;
                        org.telegram.ui.Components.voip.t renderer = e20Var3.getRenderer();
                        this.V2 = renderer;
                        if (renderer != null && renderer.f33873b) {
                            this.V2 = null;
                        }
                        this.containerView.addView(b4Var, h7.z5.d(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
                    }
                } else {
                    b4Var = (org.telegram.ui.Cells.b4) view;
                    this.X2 = true;
                }
                if (b4Var != null) {
                    if (B3) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    participant = b4Var.getParticipant();
                    if (participant != null) {
                        Rect rect2 = new Rect();
                        actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(getContext(), null);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundDrawable(null);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setPadding(0, 0, 0, 0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new di(this, rect2));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new b20(this, 5));
                        linearLayout = new LinearLayout(getContext());
                        if (participant.muted_by_you) {
                            linearLayout2 = new LinearLayout(getContext());
                        } else {
                            linearLayout2 = null;
                        }
                        this.A2 = linearLayout;
                        m5Var = new lh.m5(getContext(), linearLayout, linearLayout2, 7);
                        m5Var.setMinimumWidth(AndroidUtilities.dp(240.0f));
                        m5Var.setOrientation(1);
                        int offsetColor2 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23190kg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23349tg, false), this.Q1, 1.0f);
                        if (linearLayout2 != null) {
                            p50Var = null;
                        } else {
                            p50Var = null;
                        }
                        linearLayout.setMinimumWidth(AndroidUtilities.dp(240.0f));
                        linearLayout.setOrientation(1);
                        Drawable drawableMutate3 = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert).mutate();
                        drawableMutate3.setColorFilter(new PorterDuffColorFilter(offsetColor2, PorterDuff.Mode.MULTIPLY));
                        linearLayout.setBackgroundDrawable(drawableMutate3);
                        if (p50Var != null) {
                            f10 = -8.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        m5Var.addView(linearLayout, h7.z5.k(0.0f, f10, 0.0f, 0.0f, -2, -2));
                        v1Var = new org.telegram.ui.ActionBar.v1(getContext(), R.style.scrollbarShapeStyle, (lh.m5) m5Var);
                        v1Var.setClipToPadding(false);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(v1Var, h7.z5.c(-2.0f, -2));
                        p50Var2 = p50Var;
                        peerId = MessageObject.getPeerId(participant.peer);
                        arrayList = new ArrayList(2);
                        arrayList2 = new ArrayList(2);
                        z11 = z10;
                        arrayList3 = new ArrayList(2);
                        z12 = participant.peer instanceof TLRPC.TL_peerUser;
                        accountInstance = this.d;
                        if (z12) {
                            accountInstance2 = accountInstance;
                            if (ChatObject.isChannel(this.V0)) {
                                j10 = peerId;
                                r27 = m5Var;
                                v1Var2 = v1Var;
                                adminInChannel = accountInstance2.getMessagesController().getAdminInChannel(participant.peer.user_id, i1());
                                if (adminInChannel == null) {
                                }
                                r29 = r27;
                                r29 = r27;
                                r29 = r27;
                                r29 = r27;
                                z13 = false;
                                r28 = r27;
                            } else {
                                j10 = peerId;
                                r27 = m5Var;
                                v1Var2 = v1Var;
                                chatFull = accountInstance2.getMessagesController().getChatFull(i1());
                                if (chatFull != null) {
                                    size2 = chatParticipants.participants.size();
                                    i17 = 0;
                                    while (true) {
                                        if (i17 < size2) {
                                            chatParticipant = chatFull.participants.participants.get(i17);
                                            chatFull2 = chatFull;
                                            i18 = size2;
                                            if (chatParticipant.user_id == participant.peer.user_id) {
                                                r29 = r27;
                                                if (!(chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                                                }
                                                r29 = r27;
                                                r29 = r27;
                                                r29 = r27;
                                                r29 = r27;
                                                r29 = r27;
                                                z13 = true;
                                                r28 = r29;
                                            } else {
                                                i17++;
                                                chatFull = chatFull2;
                                                size2 = i18;
                                            }
                                        }
                                    }
                                }
                                r29 = r27;
                                r29 = r27;
                                r29 = r27;
                                r29 = r27;
                                z13 = false;
                                r28 = r27;
                            }
                        } else {
                            j10 = peerId;
                            r27 = m5Var;
                            v1Var2 = v1Var;
                            accountInstance2 = accountInstance;
                            if (j10 == (-i1())) {
                                r29 = r27;
                                r29 = r27;
                                r29 = r27;
                                r29 = r27;
                                r29 = r27;
                                z13 = true;
                                r28 = r29;
                            } else {
                                r29 = r27;
                                r29 = r27;
                                r29 = r27;
                                r29 = r27;
                                z13 = false;
                                r28 = r27;
                            }
                        }
                        if (b4Var.c()) {
                            if (o1()) {
                                arrayList.add(LocaleController.getString(R.string.VoipGroupCancelRaiseHand));
                                org.telegram.ui.Cells.pa.n(R.drawable.msg_handdown, 7, arrayList2, arrayList3);
                            }
                            if (b4Var.f24097b.getImageReceiver().hasNotThumb()) {
                                i12 = R.string.VoipAddPhoto;
                            } else {
                                i12 = R.string.VoipSetNewPhoto;
                            }
                            arrayList.add(LocaleController.getString(i12));
                            org.telegram.ui.Cells.pa.n(R.drawable.msg_addphoto, 9, arrayList2, arrayList3);
                            if (j10 > 0) {
                                if (TextUtils.isEmpty(participant.about)) {
                                    i16 = R.string.VoipAddBio;
                                } else {
                                    i16 = R.string.VoipEditBio;
                                }
                                arrayList.add(LocaleController.getString(i16));
                            } else {
                                if (TextUtils.isEmpty(participant.about)) {
                                    i13 = R.string.VoipAddDescription;
                                } else {
                                    i13 = R.string.VoipEditDescription;
                                }
                                arrayList.add(LocaleController.getString(i13));
                            }
                            if (TextUtils.isEmpty(participant.about)) {
                                i14 = R.drawable.msg_addbio;
                            } else {
                                i14 = R.drawable.msg_info;
                            }
                            org.telegram.ui.Cells.pa.n(i14, 10, arrayList2, arrayList3);
                            if (j10 > 0) {
                                i15 = R.string.VoipEditName;
                            } else {
                                i15 = R.string.VoipEditTitle;
                            }
                            arrayList.add(LocaleController.getString(i15));
                            org.telegram.ui.Cells.pa.n(R.drawable.msg_edit, 11, arrayList2, arrayList3);
                            j11 = 0;
                        } else if (Q0()) {
                            if (o1()) {
                                if (participant.muted) {
                                    j11 = 0;
                                    arrayList.add(LocaleController.getString(R.string.VoipGroupMute));
                                    org.telegram.ui.Cells.pa.n(R.drawable.msg_voice_muted, 0, arrayList2, arrayList3);
                                } else {
                                    j11 = 0;
                                    arrayList.add(LocaleController.getString(R.string.VoipGroupMute));
                                    org.telegram.ui.Cells.pa.n(R.drawable.msg_voice_muted, 0, arrayList2, arrayList3);
                                }
                            } else if (participant.muted) {
                                j11 = 0;
                                arrayList.add(LocaleController.getString(R.string.VoipGroupMute));
                                org.telegram.ui.Cells.pa.n(R.drawable.msg_voice_muted, 0, arrayList2, arrayList3);
                            } else {
                                j11 = 0;
                                arrayList.add(LocaleController.getString(R.string.VoipGroupMute));
                                org.telegram.ui.Cells.pa.n(R.drawable.msg_voice_muted, 0, arrayList2, arrayList3);
                            }
                            peer2 = participant.peer;
                            if (peer2 != null) {
                                j13 = peer2.channel_id;
                                if (j13 != j11) {
                                    arrayList.add(LocaleController.getString(R.string.VoipGroupOpenProfile));
                                    org.telegram.ui.Cells.pa.p(R.drawable.msg_openprofile, arrayList2, arrayList3, 6);
                                } else {
                                    arrayList.add(LocaleController.getString(R.string.VoipGroupOpenProfile));
                                    org.telegram.ui.Cells.pa.p(R.drawable.msg_openprofile, arrayList2, arrayList3, 6);
                                }
                            } else {
                                arrayList.add(LocaleController.getString(R.string.VoipGroupOpenProfile));
                                org.telegram.ui.Cells.pa.p(R.drawable.msg_openprofile, arrayList2, arrayList3, 6);
                            }
                            if (o1()) {
                            }
                        } else {
                            j11 = 0;
                            if (participant.muted_by_you) {
                                arrayList.add(LocaleController.getString(R.string.VoipGroupUnmuteForMe));
                                org.telegram.ui.Cells.pa.p(R.drawable.msg_voice_unmuted, arrayList2, arrayList3, 4);
                            } else {
                                arrayList.add(LocaleController.getString(R.string.VoipGroupMuteForMe));
                                org.telegram.ui.Cells.pa.n(R.drawable.msg_voice_muted, 5, arrayList2, arrayList3);
                            }
                            peer = participant.peer;
                            if (peer != null) {
                                j12 = peer.channel_id;
                                if (j12 != 0) {
                                    arrayList.add(LocaleController.getString(R.string.VoipGroupOpenChat));
                                    org.telegram.ui.Cells.pa.p(R.drawable.msg_msgbubble3, arrayList2, arrayList3, 6);
                                } else {
                                    arrayList.add(LocaleController.getString(R.string.VoipGroupOpenChat));
                                    org.telegram.ui.Cells.pa.p(R.drawable.msg_msgbubble3, arrayList2, arrayList3, 6);
                                }
                            } else {
                                arrayList.add(LocaleController.getString(R.string.VoipGroupOpenChat));
                                org.telegram.ui.Cells.pa.p(R.drawable.msg_msgbubble3, arrayList2, arrayList3, 6);
                            }
                        }
                        size = arrayList.size();
                        i10 = 0;
                        while (i10 < size) {
                            Context context2 = getContext();
                            if (i10 == 0) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if (i10 == size - 1) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            f1Var = new org.telegram.ui.ActionBar.f1(context2, z17, z18);
                            if (((Integer) arrayList3.get(i10)).intValue() != 2) {
                                int i110 = org.telegram.ui.ActionBar.g6.f23135hg;
                                r10 = 0;
                                z19 = false;
                                f1Var.c(org.telegram.ui.ActionBar.g6.w0(null, i110, false), org.telegram.ui.ActionBar.g6.w0(null, i110, false));
                            } else {
                                r10 = 0;
                                z19 = false;
                                int i21 = org.telegram.ui.ActionBar.g6.f23383vg;
                                f1Var.c(org.telegram.ui.ActionBar.g6.w0(null, i21, false), org.telegram.ui.ActionBar.g6.w0(null, i21, false));
                            }
                            f1Var.setSelectorColor(org.telegram.ui.ActionBar.g6.w0(r10, org.telegram.ui.ActionBar.g6.f23081eg, z19));
                            f1Var.g((CharSequence) arrayList.get(i10), ((Integer) arrayList2.get(i10)).intValue(), r10);
                            linearLayout.addView(f1Var);
                            f1Var.setTag(arrayList3.get(i10));
                            TLRPC.GroupCallParticipant groupCallParticipant2 = participant;
                            ArrayList arrayList6 = arrayList3;
                            f1Var.setOnClickListener(new jh.l5(this, i10, arrayList6, groupCallParticipant2, 3));
                            i10++;
                            participant = groupCallParticipant2;
                            arrayList2 = arrayList2;
                            arrayList3 = arrayList6;
                        }
                        v1Var2.addView((View) r28, h7.z5.x(-2, -2, 51));
                        y40Var = this.M;
                        y40Var.B0();
                        this.U.X = false;
                        this.T2 = b4Var;
                        b4Var.setAboutVisible(true);
                        this.containerView.invalidate();
                        y40Var.invalidate();
                        animatorSet = this.a3;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        this.a2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                        if (j10 > j11) {
                            user = accountInstance2.getMessagesController().getUser(Long.valueOf(j10));
                            forUserOrChat = ImageLocation.getForUserOrChat(accountInstance2.getCurrentAccount(), user, 0);
                            forUserOrChat2 = ImageLocation.getForUserOrChat(accountInstance2.getCurrentAccount(), user, 1);
                            j14 = j10;
                            if (MessagesController.getInstance(this.currentAccount).getUserFull(j14) == null) {
                                MessagesController.getInstance(this.currentAccount).loadUserInfo(user, false, 0);
                            }
                        } else {
                            j14 = j10;
                            TLRPC.Chat chat2 = accountInstance2.getMessagesController().getChat(Long.valueOf(-j14));
                            forUserOrChat = ImageLocation.getForUserOrChat(accountInstance2.getCurrentAccount(), chat2, 0);
                            forUserOrChat2 = ImageLocation.getForUserOrChat(accountInstance2.getCurrentAccount(), chat2, 1);
                        }
                        tVar = this.V2;
                        if (tVar == null) {
                            z14 = false;
                        } else {
                            z14 = false;
                        }
                        if (forUserOrChat == null) {
                            if (z11) {
                                org.telegram.ui.Components.n9 avatarImageView2 = this.T2.getAvatarImageView();
                                l30Var = this.f42412b;
                                l30Var.setParentAvatarImage(avatarImageView2);
                                l30Var.setHasActiveVideo(z14);
                                l30Var.M(j14, true);
                                l30Var.setCreateThumbFromParent(true);
                                l30Var.H(null, forUserOrChat, forUserOrChat2, true);
                                tVar2 = this.V2;
                                if (tVar2 != null) {
                                    tVar2.h = true;
                                    tVar2.j(true);
                                }
                                if (MessageObject.getPeerId(this.f42502w0) == j14) {
                                    l30Var.A(z40Var.d, ImageLocation.getForLocal(fileLocation));
                                }
                            }
                            z15 = z11;
                        } else {
                            if (z11) {
                                org.telegram.ui.Components.n9 avatarImageView3 = this.T2.getAvatarImageView();
                                l30Var = this.f42412b;
                                l30Var.setParentAvatarImage(avatarImageView3);
                                l30Var.setHasActiveVideo(z14);
                                l30Var.M(j14, true);
                                l30Var.setCreateThumbFromParent(true);
                                l30Var.H(null, forUserOrChat, forUserOrChat2, true);
                                tVar2 = this.V2;
                                if (tVar2 != null) {
                                    tVar2.h = true;
                                    tVar2.j(true);
                                }
                                if (MessageObject.getPeerId(this.f42502w0) == j14) {
                                    l30Var.A(z40Var.d, ImageLocation.getForLocal(fileLocation));
                                }
                            }
                            z15 = z11;
                        }
                        if (z15) {
                            this.f42415b2 = true;
                            actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                            this.containerView.addView(this.a2, h7.z5.c(-2.0f, -2));
                            this.f42420c2 = true;
                            o30Var = this.X1;
                            if (o30Var == null) {
                                i11 = 0;
                            } else {
                                int measuredWidth2 = (int) ((this.containerView.getMeasuredWidth() - (this.backgroundPaddingLeft * 2)) / 6.0f);
                                int measuredHeight3 = (int) ((this.containerView.getMeasuredHeight() - AndroidUtilities.statusBarHeight) / 6.0f);
                                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(measuredWidth2, measuredHeight3, Bitmap.Config.ARGB_8888);
                                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                                canvas2.scale(0.16666667f, 0.16666667f);
                                canvas2.save();
                                canvas2.translate(0.0f, -AndroidUtilities.statusBarHeight);
                                this.f42427e0.O().getView().draw(canvas2);
                                canvas2.drawColor(i0.b.k(-16777216, 76));
                                canvas2.restore();
                                canvas2.save();
                                canvas2.translate(this.containerView.getX(), -AndroidUtilities.statusBarHeight);
                                this.B2 = true;
                                this.containerView.draw(canvas2);
                                i11 = 0;
                                this.B2 = false;
                                Utilities.stackBlurBitmap(bitmapCreateBitmap2, Math.max(7, Math.max(measuredWidth2, measuredHeight3) / 180));
                                o30Var.setBackground(new BitmapDrawable(bitmapCreateBitmap2));
                                o30Var.setAlpha(0.0f);
                                o30Var.setVisibility(0);
                                o30Var.bringToFront();
                            }
                            this.Y2 = true;
                            this.f42514y2.setVisibility(i11);
                            if (p50Var2 != null) {
                                p50Var2.invalidate();
                            }
                            y1(true, b4Var);
                            e20Var2 = this.W2;
                            if (e20Var2 != null) {
                                e20Var2.getAvatarImageView().setAlpha(0.0f);
                            }
                            return true;
                        }
                        this.f42415b2 = false;
                        s40 s40Var3 = new s40(this, actionBarPopupWindow$ActionBarPopupWindowLayout);
                        this.f42416b3 = s40Var3;
                        s40Var3.f23684e = true;
                        s40Var3.f23683c = 220;
                        s40Var3.setOutsideTouchable(true);
                        this.f42416b3.setClippingEnabled(true);
                        this.f42416b3.setAnimationStyle(R.style.PopupContextAnimation);
                        this.f42416b3.setFocusable(true);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
                        this.f42416b3.setInputMethodMode(2);
                        this.f42416b3.setSoftInputMode(0);
                        this.f42416b3.getContentView().setFocusableInTouchMode(true);
                        e20Var = this.W2;
                        if (e20Var != null) {
                            z16 = B3;
                            j30Var = this.W1;
                            f30Var = this.f42446i2;
                            if (z16) {
                                x8 = AndroidUtilities.dp(32.0f) + (((int) (j30Var.getX() + (f30Var.getX() + e20Var.getX()))) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
                                y12 = ((int) (j30Var.getY() + (f30Var.getY() + this.W2.getY()))) - AndroidUtilities.dp(6.0f);
                            } else {
                                x8 = ((int) (j30Var.getX() + (f30Var.getX() + e20Var.getX()))) - AndroidUtilities.dp(14.0f);
                                y10 = (j30Var.getY() + (f30Var.getY() + this.W2.getY())) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
                                y12 = (int) y10;
                            }
                        } else {
                            x8 = (int) (((y40Var.getX() + y40Var.getMeasuredWidth()) + AndroidUtilities.dp(8.0f)) - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
                            if (this.X2) {
                                y11 = b4Var.getY() + y40Var.getY();
                                measuredHeight = b4Var.getClipHeight();
                            } else if (this.U2 != null) {
                                y11 = this.U2.getY() + y40Var.getY();
                                measuredHeight = this.U2.getMeasuredHeight();
                            } else {
                                y10 = y40Var.getY();
                                y12 = (int) y10;
                            }
                            y12 = (int) (y11 + measuredHeight);
                        }
                        this.f42416b3.showAtLocation(y40Var, 51, x8, y12);
                        this.a3 = new AnimatorSet();
                        ArrayList arrayList7 = new ArrayList();
                        arrayList7.add(ObjectAnimator.ofInt(this.S2, org.telegram.ui.Components.m6.f30579b, 0, 100));
                        this.a3.playTogether(arrayList7);
                        this.a3.setDuration(150L);
                        this.a3.start();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void G1(View view) {
        if (this.f42444i0 == null) {
            org.telegram.ui.Components.x30 x30Var = new org.telegram.ui.Components.x30(8, getContext(), null, true);
            this.f42444i0 = x30Var;
            x30Var.setAlpha(0.0f);
            this.f42444i0.setVisibility(4);
            this.f42444i0.setShowingDuration(3000L);
            this.containerView.addView(this.f42444i0, h7.z5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            if (ChatObject.isChannelOrGiga(this.V0)) {
                this.f42444i0.setText(LocaleController.getString(R.string.VoipChannelRecording));
            } else {
                this.f42444i0.setText(LocaleController.getString(R.string.VoipGroupRecording));
            }
            this.f42444i0.d();
        }
        this.f42444i0.setExtraTranslationY(-AndroidUtilities.statusBarHeight);
        this.f42444i0.f(view, true);
    }

    public final void H1(boolean z10) {
        boolean zBooleanValue;
        boolean z11;
        boolean z12;
        boolean z13;
        ChatObject.Call call = this.W0;
        org.telegram.ui.Components.voip.u2 u2Var = this.v;
        org.telegram.ui.Components.voip.u2 u2Var2 = this.h;
        org.telegram.ui.Components.voip.u2 u2Var3 = this.f42479r;
        org.telegram.ui.Components.voip.u2 u2Var4 = this.f42431f;
        org.telegram.ui.Components.voip.u2 u2Var5 = this.f42462n;
        org.telegram.ui.Components.voip.u2 u2Var6 = this.f42484s;
        org.telegram.ui.Components.voip.u2 u2Var7 = this.f42501w;
        v20 v20Var = this.f42426e;
        boolean z14 = false;
        if (call == null || call.isScheduled()) {
            v20Var.c(u2Var7, this.R0 > 0.1f, z10);
            v20Var.c(u2Var6, this.R0 > 0.1f, z10);
            v20Var.c(u2Var3, this.R0 > 0.1f, z10);
            v20Var.c(u2Var5, false, z10);
            v20Var.c(u2Var4, false, z10);
            v20Var.c(u2Var2, false, z10);
            v20Var.c(u2Var, false, z10);
            return;
        }
        boolean z15 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(false) == 2;
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.W0.participants.f(MessageObject.getPeerId(this.f42502w0));
        boolean z16 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || Q0()) ? false : true;
        Boolean bool = this.f42492t3;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            TLRPC.GroupCall groupCall = this.W0.call;
            zBooleanValue = groupCall != null && groupCall.messages_enabled;
        }
        if (((z16 || !this.W0.canRecordVideo()) && !z15) || r1()) {
            z14 = true;
            z11 = false;
        } else {
            z11 = true;
        }
        if (z15) {
            z12 = false;
            z13 = true;
        } else {
            z12 = !z16;
            z13 = false;
        }
        if (B3) {
            z12 = false;
            z13 = false;
        }
        v20Var.c(u2Var7, true, z10);
        v20Var.c(u2Var6, true, z10);
        v20Var.c(u2Var5, z11, z10);
        v20Var.c(u2Var4, z13, z10);
        v20Var.c(u2Var3, z14, z10);
        v20Var.c(u2Var2, z12, z10);
        v20Var.c(u2Var, zBooleanValue, z10);
    }

    public final void I1() {
        ChatObject.Call call;
        TLRPC.GroupCall groupCall;
        TLRPC.GroupCall groupCall2;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        ChatObject.Call call2 = this.W0;
        org.telegram.ui.ActionBar.v0 v0Var = this.f42437g1;
        org.telegram.ui.ActionBar.v0 v0Var2 = this.f42445i1;
        if (call2 == null || call2.isScheduled()) {
            this.f42441h1.setVisibility(4);
            v0Var2.setVisibility(8);
            if (this.W0 == null) {
                v0Var.setVisibility(8);
                return;
            }
        }
        if (this.f42440h0) {
            return;
        }
        AccountInstance accountInstance = this.d;
        TLRPC.Chat chat3 = accountInstance.getMessagesController().getChat(Long.valueOf(i1()));
        if (chat3 != null) {
            this.V0 = chat3;
        }
        boolean zCanUserDoAdminAction = ChatObject.canUserDoAdminAction(this.V0, 3);
        org.telegram.ui.ActionBar.f1 f1Var = this.f42449j1;
        if (zCanUserDoAdminAction || (((!ChatObject.isChannel(this.V0) || ((chat2 = this.V0) != null && chat2.megagroup)) && (ChatObject.isPublic(this.V0) || ChatObject.canUserDoAdminAction(this.V0, 3))) || (ChatObject.isChannel(this.V0) && (chat = this.V0) != null && !chat.megagroup && ChatObject.isPublic(chat)))) {
            f1Var.setVisibility(0);
        } else {
            f1Var.setVisibility(8);
        }
        ChatObject.Call call3 = this.W0;
        org.telegram.ui.ActionBar.f1 f1Var2 = this.f42494u1;
        org.telegram.ui.ActionBar.f1 f1Var3 = this.f42490t1;
        if (call3 == null || (groupCall2 = call3.call) == null || !groupCall2.can_change_messages_enabled) {
            f1Var3.setVisibility(8);
            f1Var2.setVisibility(8);
        } else {
            f1Var3.setVisibility(groupCall2.messages_enabled ? 8 : 0);
            f1Var2.setVisibility(this.W0.call.messages_enabled ? 0 : 8);
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.W0.participants.f(MessageObject.getPeerId(this.f42502w0));
        ChatObject.Call call4 = this.W0;
        org.telegram.ui.ActionBar.f1 f1Var4 = this.f42459m1;
        if (call4 == null || call4.isScheduled() || !(groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted)) {
            f1Var4.setVisibility(8);
        } else {
            f1Var4.setVisibility(0);
        }
        f1Var4.setIcon(SharedConfig.noiseSupression ? R.drawable.msg_noise_on : R.drawable.msg_noise_off);
        f1Var4.setSubtext(LocaleController.getString(SharedConfig.noiseSupression ? R.string.VoipNoiseCancellationEnabled : R.string.VoipNoiseCancellationDisabled));
        boolean zQ0 = Q0();
        org.telegram.ui.ActionBar.f1 f1Var5 = this.f42486s1;
        org.telegram.ui.ActionBar.f1 f1Var6 = this.f42453k1;
        boolean z10 = true;
        org.telegram.ui.ActionBar.f1 f1Var7 = this.f42468o1;
        org.telegram.ui.ActionBar.f1 f1Var8 = this.f42472p1;
        if (zQ0) {
            f1Var5.setVisibility(0);
            f1Var6.setVisibility(0);
            if (r1()) {
                f1Var7.setVisibility(0);
                f1Var8.setVisibility(8);
            } else if (this.W0.isScheduled()) {
                f1Var7.setVisibility(8);
                f1Var8.setVisibility(8);
            } else {
                f1Var7.setVisibility(0);
            }
            if (o1()) {
                f1Var7.setVisibility(8);
                f1Var6.setVisibility(8);
            }
            if (!this.W0.canRecordVideo() || this.W0.isScheduled() || r1()) {
                f1Var8.setVisibility(8);
            } else {
                f1Var8.setVisibility(0);
            }
            v0Var2.setVisibility(8);
            boolean z11 = this.W0.recording;
            n50 n50Var = this.Z0;
            n50Var.f40669f = z11;
            n50Var.d = 1.0f;
            n50Var.invalidateSelf();
            if (this.W0.recording) {
                if (this.f42517z1 == null) {
                    e20 e20Var = new e20(this, 6);
                    this.f42517z1 = e20Var;
                    AndroidUtilities.runOnUIThread(e20Var, 1000L);
                }
                f1Var7.setText(LocaleController.getString(R.string.VoipGroupStopRecordCall));
            } else {
                e20 e20Var2 = this.f42517z1;
                if (e20Var2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(e20Var2);
                    this.f42517z1 = null;
                }
                f1Var7.setText(LocaleController.getString(R.string.VoipGroupRecordCall));
            }
            if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().getVideoState(true) != 2) {
                f1Var8.g(LocaleController.getString(R.string.VoipChatStartScreenCapture), R.drawable.msg_screencast, null);
            } else {
                f1Var8.g(LocaleController.getString(R.string.VoipChatStopScreenCapture), R.drawable.msg_screencast_off, null);
            }
            K1();
        } else {
            boolean z12 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || Q0()) ? false : true;
            boolean z13 = VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(true) == 2;
            if (z12 || (!(this.W0.canRecordVideo() || z13) || this.W0.isScheduled() || r1())) {
                v0Var2.setVisibility(8);
                f1Var8.setVisibility(8);
            } else if (z13) {
                v0Var2.setVisibility(8);
                f1Var8.setVisibility(0);
                f1Var8.g(LocaleController.getString(R.string.VoipChatStopScreenCapture), R.drawable.msg_screencast_off, null);
                f1Var8.setContentDescription(LocaleController.getString(R.string.VoipChatStopScreenCapture));
            } else {
                f1Var8.g(LocaleController.getString(R.string.VoipChatStartScreenCapture), R.drawable.msg_screencast, null);
                f1Var8.setContentDescription(LocaleController.getString(R.string.VoipChatStartScreenCapture));
                v0Var2.setVisibility(8);
                f1Var8.setVisibility(0);
            }
            f1Var5.setVisibility(8);
            f1Var6.setVisibility(8);
            f1Var7.setVisibility(8);
        }
        boolean zQ1 = Q0();
        org.telegram.ui.ActionBar.f1 f1Var9 = this.f42464n1;
        if (zQ1 && this.W0.call.can_change_join_muted && !o1()) {
            f1Var9.setVisibility(0);
        } else {
            f1Var9.setVisibility(8);
        }
        if (o1() && ((call = this.W0) == null || (groupCall = call.call) == null || !groupCall.creator)) {
            z10 = false;
        }
        v0Var.I(4, z10);
        this.l1.setVisibility((!r1() || this.W0.isScheduled()) ? 0 : 8);
        int visibility = f1Var6.getVisibility();
        TextView textView = this.f42503w1;
        if (visibility == 0 || f1Var9.getVisibility() == 0 || f1Var.getVisibility() == 0 || f1Var8.getVisibility() == 0 || f1Var7.getVisibility() == 0 || f1Var5.getVisibility() == 0) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        org.telegram.ui.Cells.k kVar = this.f42436g0;
        if (((sharedInstance == null || !VoIPService.getSharedInstance().hasFewPeers) && !this.X0) || r1() || this.f42502w0 == null) {
            kVar.setVisibility(8);
        } else {
            kVar.setVisibility(0);
            long peerId = MessageObject.getPeerId(this.f42502w0);
            kVar.setObject(DialogObject.isUserDialog(peerId) ? accountInstance.getMessagesController().getUser(Long.valueOf(peerId)) : accountInstance.getMessagesController().getChat(Long.valueOf(-peerId)));
        }
        TLRPC.Chat chat4 = this.V0;
        if (chat4 == null || ChatObject.isChannelOrGiga(chat4) || !r1() || f1Var.getVisibility() != 8) {
            v0Var.setVisibility(0);
        } else {
            v0Var.setVisibility(8);
        }
        LinearLayout linearLayout = this.f42433f1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        float f10 = 96;
        if (layoutParams.rightMargin != AndroidUtilities.dp(f10)) {
            layoutParams.rightMargin = AndroidUtilities.dp(f10);
            linearLayout.requestLayout();
        }
        ((FrameLayout.LayoutParams) this.f42498v1.getLayoutParams()).rightMargin = 0;
        this.K.setTitleRightMargin(AndroidUtilities.dp(48.0f) * 2);
    }

    public final void J1(int i10, boolean z10) {
        boolean z11;
        boolean zN;
        boolean zN2;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        boolean zN3;
        String string6;
        boolean zN4;
        String string7;
        boolean zN5;
        String str;
        String strW;
        w20 w20Var;
        ImageView imageView;
        int i11;
        r50[] r50VarArr;
        r50 r50Var;
        r50 r50Var2;
        r50 r50Var3;
        boolean z12;
        boolean z13;
        float f10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        j30 j30Var = this.W1;
        boolean z14 = j30Var != null && j30Var.f33648b && (AndroidUtilities.isTablet() || B3 == q1());
        if (!r1() && this.B1 == i10 && z10) {
            return;
        }
        int i17 = 3;
        org.telegram.ui.Components.oi0 oi0Var = this.F0;
        if (i10 != 7) {
            if (i10 == 6) {
                string7 = LocaleController.getString(R.string.VoipGroupSetReminderShort);
                zN5 = oi0Var.N(344);
            } else {
                if (i10 == 5) {
                    string6 = LocaleController.getString(R.string.VoipGroupStartNowShort);
                    zN = oi0Var.N(377);
                } else {
                    if (i10 == 0) {
                        string4 = LocaleController.getString(R.string.VoipGroupUnmuteShort);
                        string5 = LocaleController.getString(R.string.VoipHoldAndTalk);
                        int i18 = this.B1;
                        if (i18 == 3) {
                            int i19 = oi0Var.f31314f;
                            zN3 = (i19 == 136 || i19 == 173 || i19 == 274 || i19 == 311) ? oi0Var.N(99) : false;
                        } else if (i18 == 5) {
                            zN3 = oi0Var.N(404);
                        } else if (i18 == 7) {
                            zN3 = oi0Var.N(376);
                        } else if (i18 == 6) {
                            zN3 = oi0Var.N(237);
                        } else {
                            if (i18 == 2) {
                                zN = oi0Var.N(36);
                            } else {
                                zN3 = oi0Var.N(99);
                            }
                            string3 = string4;
                            string2 = string5;
                            z11 = false;
                        }
                    } else {
                        if (i10 == 1) {
                            string6 = LocaleController.getString(o1() ? R.string.VoipTapToMuteConferenceShort : R.string.VoipTapToMuteShort);
                            zN4 = oi0Var.N(this.B1 == 4 ? 99 : 69);
                        } else if (o1() && i10 == 2) {
                            string6 = LocaleController.getString(R.string.VoipMutedByAdminShort);
                            zN4 = oi0Var.N(99);
                        } else if (i10 == 4) {
                            string4 = LocaleController.getString(R.string.VoipMutedTapedForSpeakShort);
                            string5 = LocaleController.getString(R.string.VoipMutedTapedForSpeakInfo);
                            zN3 = oi0Var.N(136);
                        } else {
                            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.W0.participants.f(MessageObject.getPeerId(this.f42502w0));
                            z11 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || Q0()) ? false : true;
                            if (z11) {
                                int i20 = this.B1;
                                if (i20 == 7) {
                                    zN2 = oi0Var.N(311);
                                } else if (i20 == 6) {
                                    zN2 = oi0Var.N(274);
                                } else if (i20 == 1) {
                                    zN2 = oi0Var.N(173);
                                } else {
                                    zN = oi0Var.N(136);
                                }
                                zN = zN2;
                            } else {
                                int i21 = this.B1;
                                if (i21 == 5) {
                                    zN2 = oi0Var.N(404);
                                } else if (i21 == 7) {
                                    zN = oi0Var.N(376);
                                } else if (i21 == 6) {
                                    zN = oi0Var.N(237);
                                } else if (i21 == 2 || i21 == 4) {
                                    zN = oi0Var.N(36);
                                } else {
                                    zN2 = oi0Var.N(99);
                                }
                                zN = zN2;
                            }
                            i17 = 3;
                            if (i10 == 3) {
                                string = LocaleController.getString(R.string.Connecting);
                                string2 = "";
                            } else {
                                string = LocaleController.getString(R.string.VoipMutedByAdminShort);
                                string2 = LocaleController.getString(R.string.VoipMutedTapForSpeak);
                            }
                            string3 = string;
                        }
                        zN = zN4;
                    }
                    zN = zN3;
                    string3 = string4;
                    string2 = string5;
                    z11 = false;
                }
                string2 = "";
                string3 = string6;
                z11 = false;
            }
            if (r1() || i10 == i17 || this.W0.isScheduled()) {
                str = string2;
            } else {
                string3 = LocaleController.getString(z14 ? R.string.VoipGroupMinimizeStream : R.string.VoipGroupExpandStream);
                boolean z15 = this.C1 != z14;
                this.C1 = z14;
                zN = z15;
                str = "";
            }
            if (TextUtils.isEmpty(str)) {
                strW = string3;
            } else {
                strW = a9.p.w(string3, " ", str);
            }
            org.telegram.ui.Components.voip.u2 u2Var = this.f42501w;
            u2Var.setContentDescription(strW);
            u2Var.c(0, 0, 0, 1.0f, true, string3, false, z10);
            w20Var = this.f42506x;
            imageView = this.f42511y;
            if (z10) {
                if (zN) {
                    if (i10 == 5) {
                        oi0Var.K(376);
                    } else if (i10 == 7) {
                        oi0Var.K(173);
                    } else if (i10 == 6) {
                        oi0Var.K(311);
                    } else if (i10 == 0) {
                        i16 = this.B1;
                        if (i16 == 5) {
                            oi0Var.K(376);
                        } else if (i16 == 7) {
                            oi0Var.K(344);
                        } else if (i16 == 6) {
                            oi0Var.K(202);
                        } else if (i16 == 2) {
                            oi0Var.K(0);
                        } else {
                            oi0Var.K(69);
                        }
                    } else if (i10 != 1 || (this.B1 == 2 && o1())) {
                        if (this.B1 == 4) {
                            i15 = 69;
                        } else {
                            i15 = 36;
                        }
                        oi0Var.K(i15);
                    } else if (i10 == 4) {
                        oi0Var.K(99);
                    } else if (z11) {
                        int i22 = this.B1;
                        if (i22 == 7) {
                            oi0Var.K(274);
                        } else if (i22 == 6) {
                            oi0Var.K(237);
                        } else if (i22 == 1) {
                            oi0Var.K(136);
                        } else {
                            oi0Var.K(99);
                        }
                    } else {
                        int i23 = this.B1;
                        if (i23 == 5) {
                            oi0Var.K(376);
                        } else if (i23 == 7) {
                            oi0Var.K(344);
                        } else if (i23 == 6) {
                            oi0Var.K(202);
                        } else if (i23 == 2 || i23 == 4) {
                            oi0Var.K(0);
                        } else {
                            oi0Var.K(69);
                        }
                    }
                }
                w20Var.d();
                if (r1() || this.W0.isScheduled()) {
                    imageView.setVisibility(8);
                    w20Var.setVisibility(0);
                } else {
                    imageView.setImageResource((j30Var != null && j30Var.f33648b && (AndroidUtilities.isTablet() || B3 == q1())) ? R.drawable.voice_minimize : R.drawable.voice_expand);
                    imageView.setVisibility(0);
                    w20Var.setVisibility(8);
                }
                this.B1 = i10;
            } else {
                this.B1 = i10;
                oi0Var.L(oi0Var.f31314f - 1, false, true);
                if (r1() || this.W0.isScheduled()) {
                    imageView.setVisibility(8);
                    w20Var.setVisibility(0);
                } else {
                    imageView.setImageResource((j30Var != null && j30Var.f33648b && (AndroidUtilities.isTablet() || B3 == q1())) ? R.drawable.voice_minimize : R.drawable.voice_expand);
                    imageView.setVisibility(0);
                    w20Var.setVisibility(8);
                }
            }
            u2Var.invalidate();
            i11 = this.B1;
            r50VarArr = this.G1;
            if (r50VarArr[i11] == null) {
                r50VarArr[i11] = new r50(i11);
                i13 = this.B1;
                if (i13 == 3) {
                    r50VarArr[i13].f41814g = null;
                } else if (p1(i13)) {
                    r50VarArr[this.B1].f41814g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23154ih, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23191kh, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23173jh, false)}, (float[]) null, Shader.TileMode.CLAMP);
                } else {
                    i14 = this.B1;
                    if (i14 == 1) {
                        r50VarArr[i14].f41814g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Fg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Hg, false)}, (float[]) null, Shader.TileMode.CLAMP);
                    } else {
                        r50VarArr[i14].f41814g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Jg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ig, false)}, (float[]) null, Shader.TileMode.CLAMP);
                    }
                }
            }
            r50Var = r50VarArr[this.B1];
            r50Var2 = this.J1;
            if (r50Var != r50Var2) {
                this.I1 = r50Var2;
                this.J1 = r50Var;
                if (r50Var2 == null && z10) {
                    this.H1 = 0.0f;
                } else {
                    this.H1 = 1.0f;
                    this.I1 = null;
                }
            }
            if (!z10) {
                r50Var3 = this.J1;
                if (r50Var3 != null) {
                    i12 = r50Var3.f41815i;
                    if (i12 != 1 || i12 == 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (i12 != 3) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                } else {
                    z12 = false;
                    z13 = false;
                }
                if (z13) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                this.L1 = f10;
                this.M1 = z12 ? 1.0f : 0.0f;
            }
            this.f42426e.invalidate();
        }
        string7 = LocaleController.getString(R.string.VoipGroupCancelReminderShort);
        zN5 = oi0Var.N(202);
        string2 = "";
        string3 = string7;
        zN = zN5;
        z11 = false;
        if (r1()) {
            str = string2;
        } else {
            str = string2;
        }
        if (TextUtils.isEmpty(str)) {
            strW = a9.p.w(string3, " ", str);
        } else {
            strW = string3;
        }
        org.telegram.ui.Components.voip.u2 u2Var2 = this.f42501w;
        u2Var2.setContentDescription(strW);
        u2Var2.c(0, 0, 0, 1.0f, true, string3, false, z10);
        w20Var = this.f42506x;
        imageView = this.f42511y;
        if (z10) {
            if (zN) {
                if (i10 == 5) {
                    oi0Var.K(376);
                } else if (i10 == 7) {
                    oi0Var.K(173);
                } else if (i10 == 6) {
                    oi0Var.K(311);
                } else if (i10 == 0) {
                    i16 = this.B1;
                    if (i16 == 5) {
                        oi0Var.K(376);
                    } else if (i16 == 7) {
                        oi0Var.K(344);
                    } else if (i16 == 6) {
                        oi0Var.K(202);
                    } else if (i16 == 2) {
                        oi0Var.K(0);
                    } else {
                        oi0Var.K(69);
                    }
                } else if (i10 != 1) {
                    if (this.B1 == 4) {
                        i15 = 69;
                    } else {
                        i15 = 36;
                    }
                    oi0Var.K(i15);
                } else {
                    if (this.B1 == 4) {
                        i15 = 69;
                    } else {
                        i15 = 36;
                    }
                    oi0Var.K(i15);
                }
            }
            w20Var.d();
            if (r1()) {
                imageView.setVisibility(8);
                w20Var.setVisibility(0);
            } else {
                imageView.setVisibility(8);
                w20Var.setVisibility(0);
            }
            this.B1 = i10;
        } else {
            this.B1 = i10;
            oi0Var.L(oi0Var.f31314f - 1, false, true);
            if (r1()) {
                imageView.setVisibility(8);
                w20Var.setVisibility(0);
            } else {
                imageView.setVisibility(8);
                w20Var.setVisibility(0);
            }
        }
        u2Var2.invalidate();
        i11 = this.B1;
        r50VarArr = this.G1;
        if (r50VarArr[i11] == null) {
            r50VarArr[i11] = new r50(i11);
            i13 = this.B1;
            if (i13 == 3) {
                r50VarArr[i13].f41814g = null;
            } else if (p1(i13)) {
                r50VarArr[this.B1].f41814g = new LinearGradient(0.0f, 400.0f, 400.0f, 0.0f, new int[]{org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23154ih, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23191kh, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23173jh, false)}, (float[]) null, Shader.TileMode.CLAMP);
            } else {
                i14 = this.B1;
                if (i14 == 1) {
                    r50VarArr[i14].f41814g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Fg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Hg, false)}, (float[]) null, Shader.TileMode.CLAMP);
                } else {
                    r50VarArr[i14].f41814g = new RadialGradient(200.0f, 200.0f, 200.0f, new int[]{org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Jg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ig, false)}, (float[]) null, Shader.TileMode.CLAMP);
                }
            }
        }
        r50Var = r50VarArr[this.B1];
        r50Var2 = this.J1;
        if (r50Var != r50Var2) {
            this.I1 = r50Var2;
            this.J1 = r50Var;
            if (r50Var2 == null) {
                this.H1 = 1.0f;
                this.I1 = null;
            } else {
                this.H1 = 1.0f;
                this.I1 = null;
            }
        }
        if (!z10) {
            r50Var3 = this.J1;
            if (r50Var3 != null) {
                i12 = r50Var3.f41815i;
                if (i12 != 1) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (i12 != 3) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            } else {
                z12 = false;
                z13 = false;
            }
            if (z13) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.L1 = f10;
            this.M1 = z12 ? 1.0f : 0.0f;
        }
        this.f42426e.invalidate();
    }

    public final void K1() {
        if (this.W0 == null) {
            return;
        }
        int currentTime = this.d.getConnectionsManager().getCurrentTime();
        ChatObject.Call call = this.W0;
        int i10 = currentTime - call.call.record_start_date;
        boolean z10 = call.recording;
        org.telegram.ui.ActionBar.f1 f1Var = this.f42468o1;
        if (z10) {
            f1Var.setSubtext(AndroidUtilities.formatDuration(i10, false));
        } else {
            f1Var.setSubtext(null);
        }
    }

    public final void L1(boolean z10) {
        float interpolation;
        float f10;
        a40 a40Var = this.N;
        if ((a40Var == null || this.W0 != null) && this.T0 == null) {
            this.S0 = 1.0f;
            this.R0 = 1.0f;
            if (a40Var == null) {
                return;
            }
        }
        if (!z10) {
            z20 z20Var = this.f42487s2;
            AndroidUtilities.cancelRunOnUIThread(z20Var);
            z20Var.run();
            ChatObject.Call call = this.W0;
            y40 y40Var = this.M;
            if (call == null || call.isScheduled()) {
                y40Var.setVisibility(4);
            } else {
                y40Var.setVisibility(0);
            }
            boolean zIsChannelOrGiga = ChatObject.isChannelOrGiga(this.V0);
            org.telegram.ui.ActionBar.f1 f1Var = this.f42486s1;
            if (zIsChannelOrGiga) {
                f1Var.setText(LocaleController.getString(R.string.VoipChannelCancelChat));
            } else {
                f1Var.setText(LocaleController.getString(R.string.VoipGroupCancelChat));
            }
        }
        float f11 = this.R0;
        if (f11 > 0.6f) {
            interpolation = 1.05f - (org.telegram.ui.Components.er.f28122f.getInterpolation((f11 - 0.6f) / 0.4f) * 0.05f);
            this.S0 = 1.0f;
            f10 = 1.0f;
        } else {
            org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.f28122f;
            this.S0 = erVar.getInterpolation(f11 / 0.6f);
            interpolation = 1.05f * erVar.getInterpolation(this.R0 / 0.6f);
            f10 = this.R0 / 0.6f;
        }
        H1(true);
        float f12 = 1.0f - f10;
        a40Var.setAlpha(f12);
        this.Q.setAlpha(f10);
        this.S.setAlpha(f10);
        x40 x40Var = this.R;
        x40Var.setAlpha(f10);
        x40Var.setScaleX(interpolation);
        x40Var.setScaleY(interpolation);
        y30 y30Var = this.P;
        y30Var.setScaleX(f12);
        y30Var.setScaleY(f12);
        y30Var.setAlpha(f12);
        this.O.setAlpha(f12);
        this.f42437g1.setAlpha(f10);
        int i10 = f12 != 0.0f ? 0 : 4;
        if (i10 != a40Var.getVisibility()) {
            a40Var.setVisibility(i10);
            y30Var.setVisibility(i10);
        }
    }

    public final void M1(boolean z10) {
        org.telegram.ui.Components.voip.u2 u2Var = this.f42479r;
        if (u2Var == null || u2Var.getVisibility() != 0) {
            return;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        v20 v20Var = this.f42426e;
        if (sharedInstance == null || r1()) {
            u2Var.c(R.drawable.msg_voiceshare, -1, 0, 0.3f, true, LocaleController.getString(R.string.VoipChatShare), false, z10);
            boolean z11 = ChatObject.isPublic(this.V0) || (ChatObject.hasAdminRights(this.V0) && ChatObject.canAddUsers(this.V0));
            tg.a aVar = (tg.a) v20Var.f48228c.get(u2Var);
            if (aVar != null) {
                aVar.d.a(z11, z10);
                u2Var.setEnabled(z11);
            }
            u2Var.b(true, false);
            return;
        }
        tg.a aVar2 = (tg.a) v20Var.f48228c.get(u2Var);
        if (aVar2 != null) {
            aVar2.d.a(true, z10);
            u2Var.setEnabled(true);
        }
        boolean z12 = sharedInstance.isBluetoothOn() || sharedInstance.isBluetoothWillOn();
        boolean z13 = !z12 && sharedInstance.isSpeakerphoneOn();
        if (z12) {
            u2Var.c(R.drawable.calls_bluetooth, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingBluetooth), false, z10);
        } else if (z13) {
            u2Var.c(R.drawable.calls_speaker, -1, 0, 0.3f, true, LocaleController.getString(R.string.VoipSpeaker), false, z10);
        } else if (sharedInstance.isHeadsetPlugged()) {
            u2Var.c(R.drawable.calls_headphones, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingHeadset), false, z10);
        } else {
            u2Var.c(R.drawable.calls_speaker, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipSpeaker), false, z10);
        }
        u2Var.b(z13, z10);
        h1();
        VoIPService sharedInstance2 = VoIPService.getSharedInstance();
        int i10 = (sharedInstance2 == null || !sharedInstance2.isBluetoothHeadsetConnected()) ? R.drawable.filled_sound_on : R.drawable.filled_calls_bluetooth_s;
        if (this.W != i10) {
            this.W = i10;
            AndroidUtilities.updateImageViewImageAnimated(this.X, i10);
        }
        org.telegram.ui.Components.voip.u2 u2Var2 = this.h;
        if (u2Var2.getVisibility() == 0) {
            u2Var2.c(0, -1, 0, 1.0f, true, f1(h1()), false, z10);
            u2Var2.b(h1() != 1, z10);
        }
    }

    public final void N1(boolean z10, boolean z11) {
        long j10;
        boolean z12;
        TLRPC.GroupCallParticipant groupCallParticipant;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i10;
        boolean z17;
        int i11;
        int i12;
        int i13;
        j30 j30Var;
        int i14;
        int i15;
        int i16;
        boolean z18;
        boolean z19;
        org.telegram.ui.Components.voip.u2 u2Var;
        org.telegram.ui.Components.voip.u2 u2Var2;
        org.telegram.ui.Components.voip.u2 u2Var3;
        org.telegram.ui.Components.voip.u2 u2Var4;
        org.telegram.ui.Components.voip.u2 u2Var5;
        org.telegram.ui.Components.voip.u2 u2Var6;
        boolean z20;
        int i17;
        boolean zR1;
        d30 d30Var;
        boolean z21;
        int i18;
        final boolean z22;
        ValueAnimator valueAnimator;
        Paint paint;
        VoIPService sharedInstance;
        int i19;
        boolean z23;
        int i20;
        ChatObject.Call call = this.W0;
        org.telegram.ui.Components.voip.u2 u2Var7 = this.f42484s;
        int i21 = 6;
        if (call == null || call.isScheduled()) {
            if (Q0()) {
                i21 = 5;
            } else if (this.W0.call.schedule_start_subscribed) {
                i21 = 7;
            }
            J1(i21, z10);
            u2Var7.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Dg, false), 0.3f, false, LocaleController.getString(R.string.Close), false, false);
            L1(false);
            return;
        }
        H1(z10);
        VoIPService sharedInstance2 = VoIPService.getSharedInstance();
        if (sharedInstance2 == null) {
            return;
        }
        if (!sharedInstance2.isConverting() && !sharedInstance2.isSwitchingStream()) {
            j10 = 0;
            if ((this.f42471p0 == 0 || Math.abs(SystemClock.elapsedRealtime() - this.f42471p0) > 3000) && ((i20 = this.P1) == 1 || i20 == 2 || i20 == 6 || i20 == 5)) {
                R0();
                J1(3, z10);
            }
            if (VoIPService.getSharedInstance() == null && VoIPService.getSharedInstance().getVideoState(false) == 2) {
                z12 = true;
            } else {
                z12 = false;
            }
            groupCallParticipant = (TLRPC.GroupCallParticipant) this.W0.participants.f(MessageObject.getPeerId(this.f42502w0));
            if (groupCallParticipant != null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted || Q0()) {
                z13 = false;
            } else {
                z13 = true;
            }
            if (!((z13 && this.W0.canRecordVideo()) || z12) || r1()) {
                z14 = false;
                z15 = true;
            } else {
                z14 = true;
                z15 = false;
            }
            if (z12) {
                z16 = false;
                i10 = 1;
            } else {
                z16 = !z13;
                i10 = 0;
            }
            if (B3) {
                z17 = false;
                i11 = 0;
            } else {
                z17 = z16;
                i11 = i10;
            }
            if (z15) {
                i12 = 2;
            } else {
                i12 = 0;
            }
            int i22 = i11 + i12;
            if (z14) {
                i13 = 4;
            } else {
                i13 = 0;
            }
            int i23 = i22 + i13;
            j30Var = this.W1;
            if (j30Var == null && j30Var.f33648b) {
                i14 = 8;
            } else {
                i14 = 0;
            }
            int i24 = i23 + i14;
            if (z17) {
                i15 = 16;
            } else {
                i15 = 0;
            }
            i16 = i24 + i15;
            if ((this.f42452k0 | 2) != (i16 | 2)) {
                z18 = true;
            } else {
                z18 = false;
            }
            this.f42452k0 = i16;
            z19 = z12;
            u2Var = this.f42462n;
            if (z14) {
                u2Var.c(R.drawable.calls_video, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipCamera), !z19, z10);
                u2Var.b(true, false);
            }
            u2Var2 = this.f42431f;
            if (i11 != 0) {
                u2Var2.c(0, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipFlip), false, false);
                u2Var2.b(true, false);
            }
            u2Var3 = this.h;
            if (z17) {
                h1();
                sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance == null && sharedInstance.isBluetoothHeadsetConnected()) {
                    i19 = R.drawable.filled_calls_bluetooth_s;
                } else {
                    i19 = R.drawable.filled_sound_on;
                }
                if (this.W != i19) {
                    this.W = i19;
                    AndroidUtilities.updateImageViewImageAnimated(this.X, i19);
                }
                u2Var5 = u2Var;
                u2Var4 = u2Var2;
                u2Var3.c(0, -1, 0, 1.0f, true, f1(h1()), false, z10);
                u2Var6 = u2Var3;
                z20 = z10;
                if (h1() != 1) {
                    z23 = true;
                } else {
                    z23 = false;
                }
                u2Var6.b(z23, z20);
            } else {
                u2Var4 = u2Var2;
                u2Var5 = u2Var;
                u2Var6 = u2Var3;
                z20 = z10;
            }
            if (r1()) {
                i17 = R.drawable.msg_voiceclose;
            } else {
                i17 = R.drawable.calls_decline;
            }
            org.telegram.ui.Components.voip.u2 u2Var8 = u2Var6;
            u2Var7.c(i17, -1, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Dg, false), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
            if (z18 && z15) {
                M1(false);
            }
            u2Var5.d(true, z20);
            u2Var4.d(true, z20);
            u2Var8.d(true, z20);
            zR1 = r1();
            d30Var = this.f42414b1;
            if (zR1) {
                d30Var.setVisibility(0);
                if (((Integer) d30Var.getTag()).intValue() == 3) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                i18 = this.P1;
                if (i18 == 3) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                d30Var.setTag(Integer.valueOf(i18));
                if (z21 != z22) {
                    valueAnimator = this.f42423d1;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    paint = this.f42419c1;
                    if (z20) {
                        final int color = paint.getColor();
                        final int i25 = z22 ? -1163700 : -12761513;
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.f42423d1 = valueAnimatorOfFloat;
                        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                int offsetColor = AndroidUtilities.getOffsetColor(color, i25, fFloatValue, 1.0f);
                                s50 s50Var = this.f38961a;
                                s50Var.f42419c1.setColor(offsetColor);
                                s50Var.f42414b1.invalidate();
                                if (!z22) {
                                    fFloatValue = 1.0f - fFloatValue;
                                }
                                s50Var.f42428e1 = fFloatValue;
                                h50 h50Var = s50Var.Q0;
                                if (h50Var == null || !s50Var.f42499v2) {
                                    return;
                                }
                                h50Var.invalidate();
                            }
                        });
                        this.f42423d1.setDuration(300L);
                        this.f42423d1.setInterpolator(org.telegram.ui.Components.er.f28122f);
                        this.f42423d1.addListener(new l40(this, 2));
                        this.f42423d1.start();
                    } else {
                        paint.setColor(this.P1 == 3 ? -1163700 : -12761513);
                        d30Var.invalidate();
                    }
                }
            } else {
                d30Var.setVisibility(8);
            }
            if (r1() || !LiteMode.isEnabled(512)) {
            }
            if (this.P1 == 3) {
                this.f42499v2 = true;
                z1();
                return;
            } else {
                this.f42499v2 = false;
                AndroidUtilities.cancelRunOnUIThread(this.f42504w2);
                return;
            }
        }
        j10 = 0;
        if (this.f42507x0 != null) {
            k1().k(0L, 37, this.f42507x0, this.V0, null, null);
            this.f42507x0 = null;
        }
        TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) this.W0.participants.f(MessageObject.getPeerId(this.f42502w0));
        if (sharedInstance2.micSwitching || groupCallParticipant2 == null || groupCallParticipant2.can_self_unmute || !groupCallParticipant2.muted || Q0()) {
            boolean zIsMicMute = sharedInstance2.isMicMute();
            if (!sharedInstance2.micSwitching && z11 && groupCallParticipant2 != null && groupCallParticipant2.muted && !zIsMicMute) {
                R0();
                sharedInstance2.setMicMute(true, false, false);
                zIsMicMute = true;
            }
            if (zIsMicMute) {
                J1(0, z10);
            } else {
                J1(1, z10);
            }
        } else {
            R0();
            if (groupCallParticipant2.raise_hand_rating != j10) {
                J1(4, z10);
            } else {
                J1(2, z10);
            }
            sharedInstance2.setMicMute(true, false, false);
        }
        if (VoIPService.getSharedInstance() == null) {
            z12 = false;
        } else {
            z12 = false;
        }
        groupCallParticipant = (TLRPC.GroupCallParticipant) this.W0.participants.f(MessageObject.getPeerId(this.f42502w0));
        if (groupCallParticipant != null) {
            z13 = false;
        } else {
            z13 = false;
        }
        if (z13) {
        }
        z14 = false;
        z15 = true;
        if (z12) {
            z16 = false;
            i10 = 1;
        } else {
            z16 = !z13;
            i10 = 0;
        }
        if (B3) {
            z17 = false;
            i11 = 0;
        } else {
            z17 = z16;
            i11 = i10;
        }
        if (z15) {
            i12 = 2;
        } else {
            i12 = 0;
        }
        int i26 = i11 + i12;
        if (z14) {
            i13 = 4;
        } else {
            i13 = 0;
        }
        int i27 = i26 + i13;
        j30Var = this.W1;
        if (j30Var == null) {
            i14 = 0;
        } else {
            i14 = 0;
        }
        int i28 = i27 + i14;
        if (z17) {
            i15 = 16;
        } else {
            i15 = 0;
        }
        i16 = i28 + i15;
        if ((this.f42452k0 | 2) != (i16 | 2)) {
            z18 = true;
        } else {
            z18 = false;
        }
        this.f42452k0 = i16;
        z19 = z12;
        u2Var = this.f42462n;
        if (z14) {
            u2Var.c(R.drawable.calls_video, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipCamera), !z19, z10);
            u2Var.b(true, false);
        }
        u2Var2 = this.f42431f;
        if (i11 != 0) {
            u2Var2.c(0, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipFlip), false, false);
            u2Var2.b(true, false);
        }
        u2Var3 = this.h;
        if (z17) {
            h1();
            sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance == null) {
                i19 = R.drawable.filled_sound_on;
            } else {
                i19 = R.drawable.filled_sound_on;
            }
            if (this.W != i19) {
                this.W = i19;
                AndroidUtilities.updateImageViewImageAnimated(this.X, i19);
            }
            u2Var5 = u2Var;
            u2Var4 = u2Var2;
            u2Var3.c(0, -1, 0, 1.0f, true, f1(h1()), false, z10);
            u2Var6 = u2Var3;
            z20 = z10;
            if (h1() != 1) {
                z23 = true;
            } else {
                z23 = false;
            }
            u2Var6.b(z23, z20);
        } else {
            u2Var4 = u2Var2;
            u2Var5 = u2Var;
            u2Var6 = u2Var3;
            z20 = z10;
        }
        if (r1()) {
            i17 = R.drawable.msg_voiceclose;
        } else {
            i17 = R.drawable.calls_decline;
        }
        org.telegram.ui.Components.voip.u2 u2Var9 = u2Var6;
        u2Var7.c(i17, -1, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Dg, false), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
        if (z18) {
            M1(false);
        }
        u2Var5.d(true, z20);
        u2Var4.d(true, z20);
        u2Var9.d(true, z20);
        zR1 = r1();
        d30Var = this.f42414b1;
        if (zR1) {
            d30Var.setVisibility(0);
            if (((Integer) d30Var.getTag()).intValue() == 3) {
                z21 = true;
            } else {
                z21 = false;
            }
            i18 = this.P1;
            if (i18 == 3) {
                z22 = true;
            } else {
                z22 = false;
            }
            d30Var.setTag(Integer.valueOf(i18));
            if (z21 != z22) {
                valueAnimator = this.f42423d1;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                paint = this.f42419c1;
                if (z20) {
                    final int color2 = paint.getColor();
                    if (z22) {
                    }
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.f42423d1 = valueAnimatorOfFloat2;
                    valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            int offsetColor = AndroidUtilities.getOffsetColor(color2, i25, fFloatValue, 1.0f);
                            s50 s50Var = this.f38961a;
                            s50Var.f42419c1.setColor(offsetColor);
                            s50Var.f42414b1.invalidate();
                            if (!z22) {
                                fFloatValue = 1.0f - fFloatValue;
                            }
                            s50Var.f42428e1 = fFloatValue;
                            h50 h50Var = s50Var.Q0;
                            if (h50Var == null || !s50Var.f42499v2) {
                                return;
                            }
                            h50Var.invalidate();
                        }
                    });
                    this.f42423d1.setDuration(300L);
                    this.f42423d1.setInterpolator(org.telegram.ui.Components.er.f28122f);
                    this.f42423d1.addListener(new l40(this, 2));
                    this.f42423d1.start();
                } else {
                    paint.setColor(this.P1 == 3 ? -1163700 : -12761513);
                    d30Var.invalidate();
                }
            }
        } else {
            d30Var.setVisibility(8);
        }
        if (r1()) {
        }
    }

    public final void O0(boolean z10) {
        y40 y40Var;
        m50 m50Var;
        j30 j30Var;
        y40 y40Var2;
        int i10;
        ArrayList arrayList;
        int i11;
        boolean z11;
        m50 m50Var2;
        int i12;
        int i13;
        y40 y40Var3;
        j30 j30Var2;
        f30 f30Var;
        ArrayList arrayList2;
        int i14;
        ChatObject.Call call;
        ChatObject.Call call2;
        boolean z12;
        ChatObject.VideoParticipant videoParticipant;
        ChatObject.VideoParticipant videoParticipant2;
        View childAt;
        f2.o1 o1VarG;
        boolean z13;
        boolean z14;
        s50 s50Var = this;
        m50 m50Var3 = s50Var.L;
        j30 j30Var3 = s50Var.W1;
        if (j30Var3 == null || (y40Var = s50Var.M) == null || s50Var.W0 == null || s50Var.f42467o0) {
            return;
        }
        if (j30Var3.f33648b) {
            j30Var3.setVisibleParticipant(true);
        }
        long peerId = MessageObject.getPeerId(s50Var.W0.selfPeer);
        if (peerId != MessageObject.getPeerId(s50Var.f42502w0) && s50Var.W0.participants.f(peerId) != null) {
            s50Var.f42502w0 = s50Var.W0.selfPeer;
        }
        int childCount = y40Var.getChildCount();
        int top = Integer.MAX_VALUE;
        View view = null;
        int iC = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt2 = y40Var.getChildAt(i15);
            f2.o1 o1VarG2 = y40Var.G(childAt2);
            if (o1VarG2 != null && o1VarG2.b() != -1 && o1VarG2.c() != -1 && (view == null || childAt2.getTop() < top)) {
                iC = o1VarG2.c();
                top = childAt2.getTop();
                view = childAt2;
            }
        }
        ArrayList arrayList3 = s50Var.m0;
        arrayList3.clear();
        if (!C3) {
            arrayList3.addAll(s50Var.W0.visibleVideoParticipants);
        } else if (j30Var3.f33648b) {
            arrayList3.addAll(s50Var.W0.visibleVideoParticipants);
            ChatObject.VideoParticipant videoParticipant3 = j30Var3.f33653e;
            if (videoParticipant3 != null) {
                arrayList3.remove(videoParticipant3);
            }
        }
        if (y40Var.getItemAnimator() != null && !z10) {
            y40Var.setItemAnimator(null);
        } else if (y40Var.getItemAnimator() == null && z10) {
            y40Var.setItemAnimator(s50Var.T);
        }
        try {
            g gVar = new g(m50Var3, 21);
            try {
                try {
                    z11 = true;
                    try {
                        try {
                            arrayList = arrayList3;
                            try {
                                i11 = iC;
                                try {
                                    j30Var = j30Var3;
                                    try {
                                        y40Var2 = y40Var;
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        arrayList = arrayList;
                                                        i11 = i11;
                                                        i10 = childCount;
                                                        s50Var = this;
                                                        m50Var = m50Var3;
                                                        try {
                                                            s50Var.D1(m50Var3.G, m50Var3.f40366w, m50Var3.d, m50Var3.f40361e, m50Var3.f40362f, m50Var3.h, m50Var3.f40363n, m50Var3.f40364r, m50Var3.f40365s, m50Var3.v, m50Var3.C, m50Var3.D, m50Var3.E, m50Var3.F, m50Var3.f40367x, m50Var3.f40368y);
                                                            m50Var.E();
                                                            z11 = true;
                                                            try {
                                                                f2.q.c(s50Var.f42488s3, true).a(gVar);
                                                            } catch (Exception e9) {
                                                                e = e9;
                                                                FileLog.e(e);
                                                                m50Var.l();
                                                            }
                                                        } catch (Exception e10) {
                                                            e = e10;
                                                            z11 = true;
                                                            FileLog.e(e);
                                                            m50Var.l();
                                                            s50Var.W0.saveActiveDates();
                                                            if (view != null) {
                                                                s50Var.U.h1(i11, view.getTop() - y40Var2.getPaddingTop());
                                                            }
                                                            ArrayList arrayList4 = s50Var.f42516z0;
                                                            arrayList4.clear();
                                                            arrayList4.addAll(s50Var.W0.visibleParticipants);
                                                            ArrayList arrayList5 = s50Var.A0;
                                                            arrayList5.clear();
                                                            ArrayList arrayList6 = arrayList;
                                                            arrayList5.addAll(arrayList6);
                                                            ArrayList arrayList7 = s50Var.B0;
                                                            arrayList7.clear();
                                                            arrayList7.addAll(s50Var.W0.invitedUsers);
                                                            ArrayList arrayList8 = s50Var.C0;
                                                            arrayList8.clear();
                                                            arrayList8.addAll(s50Var.W0.shadyJoinParticipants);
                                                            ArrayList arrayList9 = s50Var.D0;
                                                            arrayList9.clear();
                                                            arrayList9.addAll(s50Var.W0.shadyLeftParticipants);
                                                            m50Var2 = m50Var;
                                                            s50Var.E0 = m50Var2.B;
                                                            i12 = i10;
                                                            i13 = 0;
                                                            while (i13 < i12) {
                                                                y40 y40Var4 = y40Var2;
                                                                childAt = y40Var4.getChildAt(i13);
                                                                if (childAt instanceof org.telegram.ui.Cells.b4) {
                                                                    if (childAt instanceof org.telegram.ui.Cells.b4) {
                                                                        org.telegram.ui.Cells.b4 b4Var = (org.telegram.ui.Cells.b4) childAt;
                                                                        if (o1VarG.b() != m50Var2.B - 2) {
                                                                            z14 = true;
                                                                        } else {
                                                                            z14 = false;
                                                                        }
                                                                        b4Var.setDrawDivider(z14);
                                                                    } else {
                                                                        org.telegram.ui.Cells.t3 t3Var = (org.telegram.ui.Cells.t3) childAt;
                                                                        if (o1VarG.b() != m50Var2.B - 2) {
                                                                            z13 = true;
                                                                        } else {
                                                                            z13 = false;
                                                                        }
                                                                        t3Var.setDrawDivider(z13);
                                                                    }
                                                                } else if (childAt instanceof org.telegram.ui.Cells.b4) {
                                                                    org.telegram.ui.Cells.b4 b4Var2 = (org.telegram.ui.Cells.b4) childAt;
                                                                    if (o1VarG.b() != m50Var2.B - 2) {
                                                                        z14 = true;
                                                                    } else {
                                                                        z14 = false;
                                                                    }
                                                                    b4Var2.setDrawDivider(z14);
                                                                } else {
                                                                    org.telegram.ui.Cells.t3 t3Var2 = (org.telegram.ui.Cells.t3) childAt;
                                                                    if (o1VarG.b() != m50Var2.B - 2) {
                                                                        z13 = true;
                                                                    } else {
                                                                        z13 = false;
                                                                    }
                                                                    t3Var2.setDrawDivider(z13);
                                                                }
                                                                i13++;
                                                                y40Var2 = y40Var4;
                                                            }
                                                            y40Var3 = y40Var2;
                                                            boolean zC = j30Var.c();
                                                            j30Var2 = j30Var;
                                                            if (!j30Var2.f33648b) {
                                                            }
                                                            org.telegram.ui.Components.f20 f20Var = s50Var.f42457l2;
                                                            f30Var = s50Var.f42446i2;
                                                            f20Var.G(f30Var, z11);
                                                            if (f30Var.getVisibility() == 0) {
                                                                AndroidUtilities.updateVisibleRows(f30Var);
                                                            }
                                                            if (C3) {
                                                                s50Var.f42454k2.I(s50Var.f42450j2, z11);
                                                            }
                                                            if (y40Var3.getVisibility() == 0) {
                                                                AndroidUtilities.updateVisibleRows(y40Var3);
                                                            }
                                                            arrayList2 = s50Var.V1;
                                                            arrayList2.clear();
                                                            arrayList2.addAll(s50Var.U1);
                                                            for (i14 = 0; i14 < arrayList2.size(); i14++) {
                                                                ((org.telegram.ui.Components.voip.t) arrayList2.get(i14)).j(z11);
                                                            }
                                                            call = s50Var.W0;
                                                            if (call != null) {
                                                                call.participants.f(MessageObject.getPeerId(videoParticipant.participant.peer));
                                                            }
                                                            call2 = s50Var.W0;
                                                            if (call2 != null) {
                                                                z12 = false;
                                                            } else {
                                                                z12 = false;
                                                            }
                                                            s50Var.f42515y3.a(z12, z10);
                                                            if (z12 != s50Var.E2) {
                                                                s50Var.E2 = z12;
                                                                if (C3) {
                                                                    s50Var.containerView.requestLayout();
                                                                }
                                                            }
                                                        }
                                                    } catch (Exception e11) {
                                                        e = e11;
                                                        z11 = true;
                                                        s50Var = this;
                                                        arrayList = arrayList;
                                                        i11 = i11;
                                                        i10 = childCount;
                                                        m50Var = m50Var3;
                                                        FileLog.e(e);
                                                        m50Var.l();
                                                        s50Var.W0.saveActiveDates();
                                                        if (view != null) {
                                                            s50Var.U.h1(i11, view.getTop() - y40Var2.getPaddingTop());
                                                        }
                                                        ArrayList arrayList10 = s50Var.f42516z0;
                                                        arrayList10.clear();
                                                        arrayList10.addAll(s50Var.W0.visibleParticipants);
                                                        ArrayList arrayList11 = s50Var.A0;
                                                        arrayList11.clear();
                                                        ArrayList arrayList12 = arrayList;
                                                        arrayList11.addAll(arrayList12);
                                                        ArrayList arrayList13 = s50Var.B0;
                                                        arrayList13.clear();
                                                        arrayList13.addAll(s50Var.W0.invitedUsers);
                                                        ArrayList arrayList14 = s50Var.C0;
                                                        arrayList14.clear();
                                                        arrayList14.addAll(s50Var.W0.shadyJoinParticipants);
                                                        ArrayList arrayList15 = s50Var.D0;
                                                        arrayList15.clear();
                                                        arrayList15.addAll(s50Var.W0.shadyLeftParticipants);
                                                        m50Var2 = m50Var;
                                                        s50Var.E0 = m50Var2.B;
                                                        i12 = i10;
                                                        i13 = 0;
                                                        while (i13 < i12) {
                                                            y40 y40Var5 = y40Var2;
                                                            childAt = y40Var5.getChildAt(i13);
                                                            if (childAt instanceof org.telegram.ui.Cells.b4) {
                                                                if (childAt instanceof org.telegram.ui.Cells.b4) {
                                                                    org.telegram.ui.Cells.b4 b4Var3 = (org.telegram.ui.Cells.b4) childAt;
                                                                    if (o1VarG.b() != m50Var2.B - 2) {
                                                                        z14 = true;
                                                                    } else {
                                                                        z14 = false;
                                                                    }
                                                                    b4Var3.setDrawDivider(z14);
                                                                } else {
                                                                    org.telegram.ui.Cells.t3 t3Var3 = (org.telegram.ui.Cells.t3) childAt;
                                                                    if (o1VarG.b() != m50Var2.B - 2) {
                                                                        z13 = true;
                                                                    } else {
                                                                        z13 = false;
                                                                    }
                                                                    t3Var3.setDrawDivider(z13);
                                                                }
                                                            } else if (childAt instanceof org.telegram.ui.Cells.b4) {
                                                                org.telegram.ui.Cells.b4 b4Var4 = (org.telegram.ui.Cells.b4) childAt;
                                                                if (o1VarG.b() != m50Var2.B - 2) {
                                                                    z14 = true;
                                                                } else {
                                                                    z14 = false;
                                                                }
                                                                b4Var4.setDrawDivider(z14);
                                                            } else {
                                                                org.telegram.ui.Cells.t3 t3Var4 = (org.telegram.ui.Cells.t3) childAt;
                                                                if (o1VarG.b() != m50Var2.B - 2) {
                                                                    z13 = true;
                                                                } else {
                                                                    z13 = false;
                                                                }
                                                                t3Var4.setDrawDivider(z13);
                                                            }
                                                            i13++;
                                                            y40Var2 = y40Var5;
                                                        }
                                                        y40Var3 = y40Var2;
                                                        boolean zC2 = j30Var.c();
                                                        j30Var2 = j30Var;
                                                        if (!j30Var2.f33648b) {
                                                        }
                                                        org.telegram.ui.Components.f20 f20Var2 = s50Var.f42457l2;
                                                        f30Var = s50Var.f42446i2;
                                                        f20Var2.G(f30Var, z11);
                                                        if (f30Var.getVisibility() == 0) {
                                                            AndroidUtilities.updateVisibleRows(f30Var);
                                                        }
                                                        if (C3) {
                                                            s50Var.f42454k2.I(s50Var.f42450j2, z11);
                                                        }
                                                        if (y40Var3.getVisibility() == 0) {
                                                            AndroidUtilities.updateVisibleRows(y40Var3);
                                                        }
                                                        arrayList2 = s50Var.V1;
                                                        arrayList2.clear();
                                                        arrayList2.addAll(s50Var.U1);
                                                        while (i14 < arrayList2.size()) {
                                                            ((org.telegram.ui.Components.voip.t) arrayList2.get(i14)).j(z11);
                                                        }
                                                        call = s50Var.W0;
                                                        if (call != null) {
                                                            call.participants.f(MessageObject.getPeerId(videoParticipant.participant.peer));
                                                        }
                                                        call2 = s50Var.W0;
                                                        if (call2 != null) {
                                                            z12 = false;
                                                        } else {
                                                            z12 = false;
                                                        }
                                                        s50Var.f42515y3.a(z12, z10);
                                                        if (z12 != s50Var.E2) {
                                                            s50Var.E2 = z12;
                                                            if (C3) {
                                                                s50Var.containerView.requestLayout();
                                                            }
                                                        }
                                                    }
                                                } catch (Exception e12) {
                                                    e = e12;
                                                    i10 = childCount;
                                                    z11 = true;
                                                    m50Var = m50Var3;
                                                    FileLog.e(e);
                                                    m50Var.l();
                                                    s50Var.W0.saveActiveDates();
                                                    if (view != null) {
                                                        s50Var.U.h1(i11, view.getTop() - y40Var2.getPaddingTop());
                                                    }
                                                    ArrayList arrayList16 = s50Var.f42516z0;
                                                    arrayList16.clear();
                                                    arrayList16.addAll(s50Var.W0.visibleParticipants);
                                                    ArrayList arrayList17 = s50Var.A0;
                                                    arrayList17.clear();
                                                    ArrayList arrayList18 = arrayList;
                                                    arrayList17.addAll(arrayList18);
                                                    ArrayList arrayList19 = s50Var.B0;
                                                    arrayList19.clear();
                                                    arrayList19.addAll(s50Var.W0.invitedUsers);
                                                    ArrayList arrayList110 = s50Var.C0;
                                                    arrayList110.clear();
                                                    arrayList110.addAll(s50Var.W0.shadyJoinParticipants);
                                                    ArrayList arrayList111 = s50Var.D0;
                                                    arrayList111.clear();
                                                    arrayList111.addAll(s50Var.W0.shadyLeftParticipants);
                                                    m50Var2 = m50Var;
                                                    s50Var.E0 = m50Var2.B;
                                                    i12 = i10;
                                                    i13 = 0;
                                                    while (i13 < i12) {
                                                        y40 y40Var6 = y40Var2;
                                                        childAt = y40Var6.getChildAt(i13);
                                                        if (childAt instanceof org.telegram.ui.Cells.b4) {
                                                            if (childAt instanceof org.telegram.ui.Cells.b4) {
                                                                org.telegram.ui.Cells.b4 b4Var5 = (org.telegram.ui.Cells.b4) childAt;
                                                                if (o1VarG.b() != m50Var2.B - 2) {
                                                                    z14 = true;
                                                                } else {
                                                                    z14 = false;
                                                                }
                                                                b4Var5.setDrawDivider(z14);
                                                            } else {
                                                                org.telegram.ui.Cells.t3 t3Var5 = (org.telegram.ui.Cells.t3) childAt;
                                                                if (o1VarG.b() != m50Var2.B - 2) {
                                                                    z13 = true;
                                                                } else {
                                                                    z13 = false;
                                                                }
                                                                t3Var5.setDrawDivider(z13);
                                                            }
                                                        } else if (childAt instanceof org.telegram.ui.Cells.b4) {
                                                            org.telegram.ui.Cells.b4 b4Var6 = (org.telegram.ui.Cells.b4) childAt;
                                                            if (o1VarG.b() != m50Var2.B - 2) {
                                                                z14 = true;
                                                            } else {
                                                                z14 = false;
                                                            }
                                                            b4Var6.setDrawDivider(z14);
                                                        } else {
                                                            org.telegram.ui.Cells.t3 t3Var6 = (org.telegram.ui.Cells.t3) childAt;
                                                            if (o1VarG.b() != m50Var2.B - 2) {
                                                                z13 = true;
                                                            } else {
                                                                z13 = false;
                                                            }
                                                            t3Var6.setDrawDivider(z13);
                                                        }
                                                        i13++;
                                                        y40Var2 = y40Var6;
                                                    }
                                                    y40Var3 = y40Var2;
                                                    boolean zC3 = j30Var.c();
                                                    j30Var2 = j30Var;
                                                    if (!j30Var2.f33648b) {
                                                    }
                                                    org.telegram.ui.Components.f20 f20Var3 = s50Var.f42457l2;
                                                    f30Var = s50Var.f42446i2;
                                                    f20Var3.G(f30Var, z11);
                                                    if (f30Var.getVisibility() == 0) {
                                                        AndroidUtilities.updateVisibleRows(f30Var);
                                                    }
                                                    if (C3) {
                                                        s50Var.f42454k2.I(s50Var.f42450j2, z11);
                                                    }
                                                    if (y40Var3.getVisibility() == 0) {
                                                        AndroidUtilities.updateVisibleRows(y40Var3);
                                                    }
                                                    arrayList2 = s50Var.V1;
                                                    arrayList2.clear();
                                                    arrayList2.addAll(s50Var.U1);
                                                    while (i14 < arrayList2.size()) {
                                                        ((org.telegram.ui.Components.voip.t) arrayList2.get(i14)).j(z11);
                                                    }
                                                    call = s50Var.W0;
                                                    if (call != null) {
                                                        call.participants.f(MessageObject.getPeerId(videoParticipant.participant.peer));
                                                    }
                                                    call2 = s50Var.W0;
                                                    if (call2 != null) {
                                                        z12 = false;
                                                    } else {
                                                        z12 = false;
                                                    }
                                                    s50Var.f42515y3.a(z12, z10);
                                                    if (z12 != s50Var.E2) {
                                                        s50Var.E2 = z12;
                                                        if (C3) {
                                                            s50Var.containerView.requestLayout();
                                                        }
                                                    }
                                                }
                                            } catch (Exception e13) {
                                                e = e13;
                                                i10 = childCount;
                                            }
                                        } catch (Exception e14) {
                                            e = e14;
                                            i10 = childCount;
                                            arrayList = arrayList;
                                            i11 = i11;
                                            m50Var = m50Var3;
                                            FileLog.e(e);
                                            m50Var.l();
                                            s50Var.W0.saveActiveDates();
                                            if (view != null) {
                                                s50Var.U.h1(i11, view.getTop() - y40Var2.getPaddingTop());
                                            }
                                            ArrayList arrayList112 = s50Var.f42516z0;
                                            arrayList112.clear();
                                            arrayList112.addAll(s50Var.W0.visibleParticipants);
                                            ArrayList arrayList113 = s50Var.A0;
                                            arrayList113.clear();
                                            ArrayList arrayList114 = arrayList;
                                            arrayList113.addAll(arrayList114);
                                            ArrayList arrayList115 = s50Var.B0;
                                            arrayList115.clear();
                                            arrayList115.addAll(s50Var.W0.invitedUsers);
                                            ArrayList arrayList116 = s50Var.C0;
                                            arrayList116.clear();
                                            arrayList116.addAll(s50Var.W0.shadyJoinParticipants);
                                            ArrayList arrayList117 = s50Var.D0;
                                            arrayList117.clear();
                                            arrayList117.addAll(s50Var.W0.shadyLeftParticipants);
                                            m50Var2 = m50Var;
                                            s50Var.E0 = m50Var2.B;
                                            i12 = i10;
                                            i13 = 0;
                                            while (i13 < i12) {
                                                y40 y40Var7 = y40Var2;
                                                childAt = y40Var7.getChildAt(i13);
                                                if (childAt instanceof org.telegram.ui.Cells.b4) {
                                                    if (childAt instanceof org.telegram.ui.Cells.b4) {
                                                        org.telegram.ui.Cells.b4 b4Var7 = (org.telegram.ui.Cells.b4) childAt;
                                                        if (o1VarG.b() != m50Var2.B - 2) {
                                                            z14 = true;
                                                        } else {
                                                            z14 = false;
                                                        }
                                                        b4Var7.setDrawDivider(z14);
                                                    } else {
                                                        org.telegram.ui.Cells.t3 t3Var7 = (org.telegram.ui.Cells.t3) childAt;
                                                        if (o1VarG.b() != m50Var2.B - 2) {
                                                            z13 = true;
                                                        } else {
                                                            z13 = false;
                                                        }
                                                        t3Var7.setDrawDivider(z13);
                                                    }
                                                } else if (childAt instanceof org.telegram.ui.Cells.b4) {
                                                    org.telegram.ui.Cells.b4 b4Var8 = (org.telegram.ui.Cells.b4) childAt;
                                                    if (o1VarG.b() != m50Var2.B - 2) {
                                                        z14 = true;
                                                    } else {
                                                        z14 = false;
                                                    }
                                                    b4Var8.setDrawDivider(z14);
                                                } else {
                                                    org.telegram.ui.Cells.t3 t3Var8 = (org.telegram.ui.Cells.t3) childAt;
                                                    if (o1VarG.b() != m50Var2.B - 2) {
                                                        z13 = true;
                                                    } else {
                                                        z13 = false;
                                                    }
                                                    t3Var8.setDrawDivider(z13);
                                                }
                                                i13++;
                                                y40Var2 = y40Var7;
                                            }
                                            y40Var3 = y40Var2;
                                            boolean zC4 = j30Var.c();
                                            j30Var2 = j30Var;
                                            if (!j30Var2.f33648b) {
                                            }
                                            org.telegram.ui.Components.f20 f20Var4 = s50Var.f42457l2;
                                            f30Var = s50Var.f42446i2;
                                            f20Var4.G(f30Var, z11);
                                            if (f30Var.getVisibility() == 0) {
                                                AndroidUtilities.updateVisibleRows(f30Var);
                                            }
                                            if (C3) {
                                                s50Var.f42454k2.I(s50Var.f42450j2, z11);
                                            }
                                            if (y40Var3.getVisibility() == 0) {
                                                AndroidUtilities.updateVisibleRows(y40Var3);
                                            }
                                            arrayList2 = s50Var.V1;
                                            arrayList2.clear();
                                            arrayList2.addAll(s50Var.U1);
                                            while (i14 < arrayList2.size()) {
                                                ((org.telegram.ui.Components.voip.t) arrayList2.get(i14)).j(z11);
                                            }
                                            call = s50Var.W0;
                                            if (call != null) {
                                                call.participants.f(MessageObject.getPeerId(videoParticipant.participant.peer));
                                            }
                                            call2 = s50Var.W0;
                                            if (call2 != null) {
                                                z12 = false;
                                            } else {
                                                z12 = false;
                                            }
                                            s50Var.f42515y3.a(z12, z10);
                                            if (z12 != s50Var.E2) {
                                                s50Var.E2 = z12;
                                                if (C3) {
                                                    s50Var.containerView.requestLayout();
                                                }
                                            }
                                        }
                                    } catch (Exception e15) {
                                        e = e15;
                                        y40Var2 = y40Var;
                                        i10 = childCount;
                                        arrayList = arrayList;
                                        i11 = i11;
                                        m50Var = m50Var3;
                                        FileLog.e(e);
                                        m50Var.l();
                                        s50Var.W0.saveActiveDates();
                                        if (view != null) {
                                            s50Var.U.h1(i11, view.getTop() - y40Var2.getPaddingTop());
                                        }
                                        ArrayList arrayList118 = s50Var.f42516z0;
                                        arrayList118.clear();
                                        arrayList118.addAll(s50Var.W0.visibleParticipants);
                                        ArrayList arrayList119 = s50Var.A0;
                                        arrayList119.clear();
                                        ArrayList arrayList1110 = arrayList;
                                        arrayList119.addAll(arrayList1110);
                                        ArrayList arrayList1111 = s50Var.B0;
                                        arrayList1111.clear();
                                        arrayList1111.addAll(s50Var.W0.invitedUsers);
                                        ArrayList arrayList1112 = s50Var.C0;
                                        arrayList1112.clear();
                                        arrayList1112.addAll(s50Var.W0.shadyJoinParticipants);
                                        ArrayList arrayList1113 = s50Var.D0;
                                        arrayList1113.clear();
                                        arrayList1113.addAll(s50Var.W0.shadyLeftParticipants);
                                        m50Var2 = m50Var;
                                        s50Var.E0 = m50Var2.B;
                                        i12 = i10;
                                        i13 = 0;
                                        while (i13 < i12) {
                                            y40 y40Var8 = y40Var2;
                                            childAt = y40Var8.getChildAt(i13);
                                            if (childAt instanceof org.telegram.ui.Cells.b4) {
                                                if (childAt instanceof org.telegram.ui.Cells.b4) {
                                                    org.telegram.ui.Cells.b4 b4Var9 = (org.telegram.ui.Cells.b4) childAt;
                                                    if (o1VarG.b() != m50Var2.B - 2) {
                                                        z14 = true;
                                                    } else {
                                                        z14 = false;
                                                    }
                                                    b4Var9.setDrawDivider(z14);
                                                } else {
                                                    org.telegram.ui.Cells.t3 t3Var9 = (org.telegram.ui.Cells.t3) childAt;
                                                    if (o1VarG.b() != m50Var2.B - 2) {
                                                        z13 = true;
                                                    } else {
                                                        z13 = false;
                                                    }
                                                    t3Var9.setDrawDivider(z13);
                                                }
                                            } else if (childAt instanceof org.telegram.ui.Cells.b4) {
                                                org.telegram.ui.Cells.b4 b4Var10 = (org.telegram.ui.Cells.b4) childAt;
                                                if (o1VarG.b() != m50Var2.B - 2) {
                                                    z14 = true;
                                                } else {
                                                    z14 = false;
                                                }
                                                b4Var10.setDrawDivider(z14);
                                            } else {
                                                org.telegram.ui.Cells.t3 t3Var10 = (org.telegram.ui.Cells.t3) childAt;
                                                if (o1VarG.b() != m50Var2.B - 2) {
                                                    z13 = true;
                                                } else {
                                                    z13 = false;
                                                }
                                                t3Var10.setDrawDivider(z13);
                                            }
                                            i13++;
                                            y40Var2 = y40Var8;
                                        }
                                        y40Var3 = y40Var2;
                                        boolean zC5 = j30Var.c();
                                        j30Var2 = j30Var;
                                        if (!j30Var2.f33648b) {
                                        }
                                        org.telegram.ui.Components.f20 f20Var5 = s50Var.f42457l2;
                                        f30Var = s50Var.f42446i2;
                                        f20Var5.G(f30Var, z11);
                                        if (f30Var.getVisibility() == 0) {
                                            AndroidUtilities.updateVisibleRows(f30Var);
                                        }
                                        if (C3) {
                                            s50Var.f42454k2.I(s50Var.f42450j2, z11);
                                        }
                                        if (y40Var3.getVisibility() == 0) {
                                            AndroidUtilities.updateVisibleRows(y40Var3);
                                        }
                                        arrayList2 = s50Var.V1;
                                        arrayList2.clear();
                                        arrayList2.addAll(s50Var.U1);
                                        while (i14 < arrayList2.size()) {
                                            ((org.telegram.ui.Components.voip.t) arrayList2.get(i14)).j(z11);
                                        }
                                        call = s50Var.W0;
                                        if (call != null) {
                                            call.participants.f(MessageObject.getPeerId(videoParticipant.participant.peer));
                                        }
                                        call2 = s50Var.W0;
                                        if (call2 != null) {
                                            z12 = false;
                                        } else {
                                            z12 = false;
                                        }
                                        s50Var.f42515y3.a(z12, z10);
                                        if (z12 != s50Var.E2) {
                                            s50Var.E2 = z12;
                                            if (C3) {
                                                s50Var.containerView.requestLayout();
                                            }
                                        }
                                    }
                                } catch (Exception e16) {
                                    e = e16;
                                    j30Var = j30Var3;
                                }
                            } catch (Exception e17) {
                                e = e17;
                                i11 = iC;
                                j30Var = j30Var3;
                                y40Var2 = y40Var;
                                i10 = childCount;
                                arrayList = arrayList;
                            }
                        } catch (Exception e18) {
                            e = e18;
                            m50Var = m50Var3;
                            arrayList = arrayList3;
                            i11 = iC;
                            j30Var = j30Var3;
                            y40Var2 = y40Var;
                            i10 = childCount;
                        }
                    } catch (Exception e19) {
                        e = e19;
                        m50Var = m50Var3;
                        i10 = childCount;
                        arrayList = arrayList3;
                        i11 = iC;
                        j30Var = j30Var3;
                        y40Var2 = y40Var;
                    }
                } catch (Exception e20) {
                    e = e20;
                    m50Var = m50Var3;
                    i10 = childCount;
                    arrayList = arrayList3;
                    i11 = iC;
                    j30Var = j30Var3;
                    y40Var2 = y40Var;
                }
            } catch (Exception e21) {
                e = e21;
                m50Var = m50Var3;
                y40Var2 = y40Var;
                i10 = childCount;
                arrayList = arrayList3;
                i11 = iC;
                j30Var = j30Var3;
            }
        } catch (Exception e22) {
            e = e22;
            m50Var = m50Var3;
            j30Var = j30Var3;
            y40Var2 = y40Var;
            i10 = childCount;
            arrayList = arrayList3;
            i11 = iC;
        }
        s50Var.W0.saveActiveDates();
        if (view != null) {
            s50Var.U.h1(i11, view.getTop() - y40Var2.getPaddingTop());
        }
        ArrayList arrayList1114 = s50Var.f42516z0;
        arrayList1114.clear();
        arrayList1114.addAll(s50Var.W0.visibleParticipants);
        ArrayList arrayList1115 = s50Var.A0;
        arrayList1115.clear();
        ArrayList arrayList1116 = arrayList;
        arrayList1115.addAll(arrayList1116);
        ArrayList arrayList1117 = s50Var.B0;
        arrayList1117.clear();
        arrayList1117.addAll(s50Var.W0.invitedUsers);
        ArrayList arrayList1118 = s50Var.C0;
        arrayList1118.clear();
        arrayList1118.addAll(s50Var.W0.shadyJoinParticipants);
        ArrayList arrayList1119 = s50Var.D0;
        arrayList1119.clear();
        arrayList1119.addAll(s50Var.W0.shadyLeftParticipants);
        m50Var2 = m50Var;
        s50Var.E0 = m50Var2.B;
        i12 = i10;
        i13 = 0;
        while (i13 < i12) {
            y40 y40Var9 = y40Var2;
            childAt = y40Var9.getChildAt(i13);
            if (((childAt instanceof org.telegram.ui.Cells.b4) || (childAt instanceof org.telegram.ui.Cells.t3)) && (o1VarG = y40Var9.G(childAt)) != null) {
                if (childAt instanceof org.telegram.ui.Cells.b4) {
                    org.telegram.ui.Cells.b4 b4Var11 = (org.telegram.ui.Cells.b4) childAt;
                    if (o1VarG.b() != m50Var2.B - 2) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    b4Var11.setDrawDivider(z14);
                } else {
                    org.telegram.ui.Cells.t3 t3Var11 = (org.telegram.ui.Cells.t3) childAt;
                    if (o1VarG.b() != m50Var2.B - 2) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    t3Var11.setDrawDivider(z13);
                }
            }
            i13++;
            y40Var2 = y40Var9;
        }
        y40Var3 = y40Var2;
        boolean zC6 = j30Var.c();
        j30Var2 = j30Var;
        if (!j30Var2.f33648b && (videoParticipant2 = j30Var2.f33653e) != null && !ChatObject.Call.videoIsActive(videoParticipant2.participant, videoParticipant2.presentation, s50Var.W0)) {
            if (arrayList1116.isEmpty()) {
                s50Var.e1(null);
            } else if (zC6) {
                s50Var.e1((ChatObject.VideoParticipant) arrayList1116.get(0));
            }
        }
        org.telegram.ui.Components.f20 f20Var6 = s50Var.f42457l2;
        f30Var = s50Var.f42446i2;
        f20Var6.G(f30Var, z11);
        if (f30Var.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(f30Var);
        }
        if (C3) {
            s50Var.f42454k2.I(s50Var.f42450j2, z11);
        }
        if (y40Var3.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(y40Var3);
        }
        arrayList2 = s50Var.V1;
        arrayList2.clear();
        arrayList2.addAll(s50Var.U1);
        while (i14 < arrayList2.size()) {
            ((org.telegram.ui.Components.voip.t) arrayList2.get(i14)).j(z11);
        }
        call = s50Var.W0;
        if (call != null && j30Var2.f33648b && (videoParticipant = j30Var2.f33653e) != null) {
            call.participants.f(MessageObject.getPeerId(videoParticipant.participant.peer));
        }
        call2 = s50Var.W0;
        if (call2 != null || call2.visibleVideoParticipants.isEmpty()) {
            z12 = false;
        } else {
            z12 = true;
        }
        s50Var.f42515y3.a(z12, z10);
        if (z12 != s50Var.E2) {
            s50Var.E2 = z12;
            if (C3) {
                s50Var.containerView.requestLayout();
            }
        }
    }

    public final void O1() {
        boolean z10;
        q50 q50Var;
        o40 o40Var = this.K;
        if (o40Var == null || this.W0 == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = null;
        int i10 = 0;
        for (int i11 = 0; i11 < this.W0.currentSpeakingPeers.m(); i11++) {
            long j10 = this.W0.currentSpeakingPeers.j(i11);
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.W0.currentSpeakingPeers.f(j10);
            if (!groupCallParticipant.self) {
                j30 j30Var = this.W1;
                j30Var.getClass();
                if (j30Var.f33675w.get(MessageObject.getPeerId(groupCallParticipant.peer)) <= 0 && this.f42509x2.get(j10, 0) != 1) {
                    long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                    }
                    if (i10 >= 2) {
                        i10++;
                        if (i10 == 2) {
                            break;
                        }
                    } else {
                        TLRPC.User user = peerId > 0 ? MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId)) : null;
                        TLRPC.Chat chat = peerId <= 0 ? MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(peerId)) : null;
                        if (user != null || chat != null) {
                            if (i10 != 0) {
                                spannableStringBuilder.append((CharSequence) ", ");
                            }
                            if (user != null) {
                                spannableStringBuilder.append(UserObject.getFirstName(user), new org.telegram.ui.Components.k41(AndroidUtilities.bold()), 0);
                            } else {
                                spannableStringBuilder.append(chat.title, new org.telegram.ui.Components.k41(AndroidUtilities.bold()), 0);
                            }
                            i10++;
                            if (i10 == 2) {
                                break;
                                break;
                            }
                        }
                    }
                }
            }
        }
        if (i10 > 0) {
            String pluralString = LocaleController.getPluralString("MembersAreSpeakingToast", i10);
            int iIndexOf = pluralString.indexOf("un1");
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(pluralString);
            spannableStringBuilder2.replace(iIndexOf, iIndexOf + 3, (CharSequence) spannableStringBuilder);
            o40Var.getAdditionalSubtitleTextView().k(spannableStringBuilder2);
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.h5 subtitleTextView = o40Var.getSubtitleTextView();
        String str = r1() ? "ViewersWatching" : "Participants";
        int i12 = this.W0.call.participants_count;
        m50 m50Var = this.L;
        subtitleTextView.k(LocaleController.formatPluralString(str, i12 + ((m50Var.I.r1() || m50Var.H || VoIPService.getSharedInstance() == null) ? 0 : !VoIPService.getSharedInstance().isJoined() ? 1 : 0), new Object[0]));
        if (r1() && (q50Var = this.f42508x1) != null) {
            q50Var.setWatchersCount(this.W0.call.participants_count);
        }
        if (z10 != this.f42477q2) {
            this.f42477q2 = z10;
            o40Var.invalidate();
            o40Var.getSubtitleTextView().setPivotX(0.0f);
            o40Var.getSubtitleTextView().setPivotY(o40Var.getMeasuredHeight() >> 1);
            o40Var.getSubtitleTextView().animate().scaleX(this.f42477q2 ? 0.98f : 1.0f).scaleY(this.f42477q2 ? 0.9f : 1.0f).alpha(this.f42477q2 ? 0.0f : 1.0f).setDuration(150L);
            AndroidUtilities.updateViewVisibilityAnimated(o40Var.getAdditionalSubtitleTextView(), this.f42477q2);
        }
    }

    public final int P0() {
        y40 y40Var = this.M;
        int childCount = y40Var.getChildCount();
        int iMin = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = y40Var.getChildAt(i10);
            if (RecyclerView.R(childAt) >= 0) {
                iMin = Math.min(iMin, childAt.getTop());
            }
        }
        return iMin;
    }

    public final void P1(boolean z10) {
        ChatObject.Call call = this.W0;
        b30 b30Var = this.f42411a1;
        if (call == null) {
            if (ChatObject.isChannelOrGiga(this.V0)) {
                b30Var.b(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), z10);
                return;
            } else {
                b30Var.b(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), z10);
                return;
            }
        }
        boolean zIsEmpty = TextUtils.isEmpty(call.call.title);
        o40 o40Var = this.K;
        if (zIsEmpty) {
            TLRPC.Chat chat = this.V0;
            if (chat != null && !chat.title.equals(o40Var.getTitle())) {
                if (z10) {
                    this.K.J(this.V0.title, true, 180L, null);
                    o40Var.getTitleTextView().setOnClickListener(new c20(this, 9));
                } else {
                    o40Var.setTitle(this.V0.title);
                }
                if (!ChatObject.isChannelOrGiga(this.V0)) {
                    b30Var.b(LocaleController.getString(R.string.VoipGroupVoiceChat), z10);
                } else if (r1()) {
                    b30Var.b(this.V0.title, z10);
                } else {
                    b30Var.b(LocaleController.getString(R.string.VoipChannelVoiceChat), z10);
                }
            } else if (this.V0 == null) {
                o40Var.setTitle(LocaleController.getString(R.string.ConferenceChat));
                b30Var.b(LocaleController.getString(R.string.ConferenceChat), z10);
            }
        } else if (!this.W0.call.title.equals(o40Var.getTitle())) {
            if (z10) {
                this.K.J(this.W0.call.title, true, 180L, null);
                o40Var.getTitleTextView().setOnClickListener(new c20(this, 8));
            } else {
                o40Var.setTitle(this.W0.call.title);
            }
            b30Var.b(this.W0.call.title, z10);
        }
        org.telegram.ui.ActionBar.h5 titleTextView = o40Var.getTitleTextView();
        if (!this.W0.recording) {
            if (titleTextView.getRightDrawable() != null) {
                titleTextView.i(null);
                b30Var.getTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                b30Var.getNextTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                return;
            }
            return;
        }
        if (titleTextView.getRightDrawable() == null) {
            titleTextView.i(new o50(titleTextView));
            TextView textView = b30Var.getTextView();
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new o50(textView), (Drawable) null);
            TextView nextTextView = b30Var.getNextTextView();
            nextTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new o50(nextTextView), (Drawable) null);
        }
    }

    public final boolean Q0() {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || !sharedInstance.isConference()) {
            return ChatObject.canManageCalls(this.V0);
        }
        ChatObject.Call call = this.W0;
        return (call == null || (groupCall = call.call) == null || !groupCall.creator) ? false : true;
    }

    public final void Q1() {
        float fMin;
        org.telegram.ui.Components.jb jbVar;
        if (this.topBulletinContainer == null) {
            return;
        }
        int iDp = AndroidUtilities.dp(74.0f);
        float currentActionBarHeight = this.f42493u0 - iDp;
        if (this.backgroundPaddingTop + currentActionBarHeight < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            int iDp2 = (iDp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f);
            fMin = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - currentActionBarHeight) - this.backgroundPaddingTop) / iDp2);
            currentActionBarHeight -= (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - iDp2) * fMin);
        } else {
            fMin = 0.0f;
        }
        float paddingTop = currentActionBarHeight + this.containerView.getPaddingTop();
        FrameLayout frameLayout = this.topBulletinContainer;
        float height = ((-frameLayout.getTop()) - this.topBulletinContainer.getHeight()) + paddingTop + AndroidUtilities.dp(10.0f);
        float f10 = -this.topBulletinContainer.getTop();
        o40 o40Var = this.K;
        frameLayout.setTranslationY(AndroidUtilities.lerp(height, o40Var.getY() + f10 + o40Var.getHeight(), fMin));
        org.telegram.ui.Components.ec ecVar = org.telegram.ui.Components.ec.f28012w;
        if (ecVar == null || (jbVar = ecVar.f28016e) == null || jbVar.getParent() == null || jbVar.getParent().getParent() != this.topBulletinContainer) {
            return;
        }
        jbVar.setTop(fMin > 0.5f);
    }

    public final void R0() {
        if (this.N1) {
            this.N1 = false;
            AndroidUtilities.cancelRunOnUIThread(this.f42495u2);
        }
        if (this.O1) {
            this.O1 = false;
            MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
            this.f42501w.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
        }
    }

    public final void S0() {
        boolean z10;
        if (this.Y2) {
            z10 = false;
        } else {
            o30 o30Var = this.X1;
            if (o30Var.getVisibility() == 0 && o30Var.getAlpha() == 1.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (this.f42442h2 != z10) {
            this.f42442h2 = z10;
            this.f42426e.invalidate();
            this.containerView.invalidate();
            this.M.invalidate();
        }
    }

    public final void T0() {
        this.B.setTranslationY((-this.f42513y1.c()) + this.containerView.getPaddingBottom());
        this.C.invalidate();
        Z0();
        Y0();
        W0();
        X0();
        a1();
        this.f42426e.setAlpha(1.0f - this.f42500v3.f48497e);
        U0();
        V0();
    }

    public final void U0() {
        float f10 = this.f42513y1.f50155b.f48522a;
        int i10 = f10 > 0.0f ? 0 : 8;
        u30 u30Var = this.B;
        u30Var.setAlpha(f10);
        t30 t30Var = this.C;
        t30Var.setAlpha(f10);
        if (u30Var.getVisibility() != i10) {
            u30Var.setVisibility(i10);
            t30Var.setVisibility(i10);
            if (i10 == 8) {
                r30 r30Var = this.D;
                if (r30Var.isFocused()) {
                    r30Var.clearFocus();
                }
            }
        }
    }

    public final void V0() {
        org.telegram.ui.Components.wj0 wj0Var = this.G;
        if (wj0Var != null) {
            float f10 = this.f42513y1.f50155b.f48522a * this.f42505w3.f48497e;
            wj0Var.setAlpha(f10);
            int i10 = f10 > 0.0f ? 0 : 8;
            if (this.G.getVisibility() != i10) {
                this.G.setVisibility(i10);
                if (i10 == 8) {
                    this.G.n();
                }
            }
            org.telegram.ui.Components.wj0 wj0Var2 = this.G;
            if (wj0Var2.J0 || f10 != 1.0f) {
                return;
            }
            wj0Var2.J0 = true;
        }
    }

    public final void W0() {
        boolean z10 = C3;
        v20 v20Var = this.f42426e;
        if (z10) {
            v20Var.setTranslationX(0.0f);
            v20Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = B3;
        ud.a aVar = this.f42500v3;
        if (z11) {
            v20Var.setTranslationX(aVar.f48497e * AndroidUtilities.dp(94.0f));
            v20Var.setTranslationY(0.0f);
        } else {
            v20Var.setTranslationX(0.0f);
            v20Var.setTranslationY(aVar.f48497e * AndroidUtilities.dp(94.0f));
        }
    }

    public final void X0() {
        boolean z10 = C3;
        f30 f30Var = this.f42446i2;
        if (z10) {
            f30Var.setTranslationX(0.0f);
            f30Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = B3;
        ud.a aVar = this.f42500v3;
        if (z11) {
            f30Var.setTranslationX(aVar.f48497e * AndroidUtilities.dp(94.0f));
            f30Var.setTranslationY(0.0f);
        } else {
            f30Var.setTranslationX(0.0f);
            f30Var.setTranslationY(aVar.f48497e * AndroidUtilities.dp(94.0f));
        }
    }

    public final void Y0() {
        float fDp;
        float f10 = this.f42510x3.f48502e;
        yg.i iVar = this.f42513y1;
        float f11 = -((iVar.c() - this.containerView.getPaddingBottom()) + f10 + (AndroidUtilities.dp(68.0f) * this.f42505w3.f48497e) + AndroidUtilities.dp(10.0f));
        if (C3) {
            fDp = (1.0f - this.f42515y3.f48497e) * AndroidUtilities.dp(-91.0f);
        } else {
            fDp = B3 ? 0.0f : ((this.f42500v3.f48497e * AndroidUtilities.dp(94.0f)) - (AndroidUtilities.dp(104.0f) * this.W1.f33650c)) - AndroidUtilities.dp(91.0f);
        }
        float fLerp = AndroidUtilities.lerp(fDp, f11, iVar.f50155b.f48522a);
        float measuredHeight = ((this.containerView.getMeasuredHeight() - this.f42493u0) + fLerp) - this.backgroundPaddingTop;
        float fMax = Math.max((measuredHeight / 3.0f) * 2.0f, measuredHeight - AndroidUtilities.dp(250.0f));
        ug.i iVar2 = this.Y;
        iVar2.setTranslationY(fLerp);
        iVar2.setVisibleHeight((int) fMax);
    }

    public final void Z0() {
        if (this.G != null) {
            this.G.setTranslationY((-this.f42513y1.c()) + this.containerView.getPaddingBottom() + ((-this.f42505w3.f48497e) * AndroidUtilities.dp(64.0f)));
        }
    }

    public final void a1() {
        float f10 = this.f42505w3.f48497e;
        float fLerp = AndroidUtilities.lerp(0.25f, 1.0f, f10);
        ImageView imageView = this.F;
        imageView.setScaleX(fLerp);
        imageView.setScaleY(AndroidUtilities.lerp(0.25f, 1.0f, f10));
        imageView.setAlpha(f10);
        imageView.setClickable(f10 > 0.9f);
        float f11 = 1.0f - f10;
        float fLerp2 = AndroidUtilities.lerp(0.25f, 1.0f, f11);
        ImageView imageView2 = this.E;
        imageView2.setScaleX(fLerp2);
        imageView2.setScaleY(AndroidUtilities.lerp(0.25f, 1.0f, f11));
        imageView2.setAlpha(f11);
        imageView2.setClickable(f11 > 0.9f);
    }

    public final void b1() {
        org.telegram.ui.Components.voip.t tVar = this.V2;
        if (tVar != null) {
            tVar.f33871a.setRoundCorners(AndroidUtilities.dp(8.0f));
            org.telegram.ui.Components.voip.t tVar2 = this.V2;
            tVar2.h = false;
            tVar2.j(false);
            this.V2.invalidate();
            this.W1.invalidate();
        }
        org.telegram.ui.Cells.b4 b4Var = this.T2;
        if (b4Var != null && !this.X2 && b4Var.getParent() != null) {
            this.containerView.removeView(this.T2);
        }
        org.telegram.ui.Cells.b4 b4Var2 = this.T2;
        if (b4Var2 != null) {
            b4Var2.setProgressToAvatarPreview(0.0f);
            this.T2.setAboutVisible(false);
            this.T2.getAvatarImageView().setAlpha(1.0f);
        }
        org.telegram.ui.Components.e20 e20Var = this.W2;
        if (e20Var != null) {
            e20Var.getAvatarImageView().setAlpha(1.0f);
        }
        this.T2 = null;
        this.U2 = null;
        this.W2 = null;
        this.V2 = null;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final boolean canDismissWithTouchOutside() {
        return !this.W1.f33648b;
    }

    public final void d1(boolean z10) {
        if (this.Y2 || !this.f42415b2) {
            return;
        }
        if (z10) {
            this.Y2 = true;
            y1(false, this.T2);
            return;
        }
        b1();
        this.containerView.removeView(this.a2);
        this.a2 = null;
        this.f42514y2.setVisibility(8);
        this.containerView.invalidate();
        this.f42415b2 = false;
        this.U.X = true;
        this.M.invalidate();
        this.X1.setVisibility(8);
        if (this.f42467o0) {
            this.f42467o0 = false;
            O0(true);
        }
        S0();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ConferenceCall conferenceCall;
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        String string;
        ChatObject.VideoParticipant videoParticipant;
        VoIPService sharedInstance;
        int i12;
        int i13;
        int i14 = NotificationCenter.groupCallUpdated;
        String[] emojis = null;
        y40 y40Var = this.M;
        int i15 = 0;
        if (i10 == i14) {
            Long l10 = (Long) objArr[1];
            ChatObject.Call call = this.W0;
            if (call == null || call.call.f22390id != l10.longValue()) {
                return;
            }
            ChatObject.Call call2 = this.W0;
            if (call2.call instanceof TLRPC.TL_groupCallDiscarded) {
                dismiss();
                return;
            }
            long j10 = this.f42471p0;
            AccountInstance accountInstance = this.d;
            if (j10 == 0 && (((i13 = this.B1) == 7 || i13 == 5 || i13 == 6) && !call2.isScheduled())) {
                try {
                    Intent intent = new Intent(this.f42427e0, (Class<?>) VoIPService.class);
                    intent.putExtra("chat_id", i1());
                    intent.putExtra("createGroupCall", false);
                    intent.putExtra("hasFewPeers", this.X0);
                    intent.putExtra("peerChannelId", this.U0.channel_id);
                    intent.putExtra("peerChatId", this.U0.chat_id);
                    intent.putExtra("peerUserId", this.U0.user_id);
                    intent.putExtra("hash", this.Y0);
                    intent.putExtra("peerAccessHash", this.U0.access_hash);
                    intent.putExtra("is_outgoing", true);
                    intent.putExtra("start_incall_activity", false);
                    intent.putExtra("account", accountInstance.getCurrentAccount());
                    intent.putExtra("scheduleDate", this.f42438g2);
                    this.f42427e0.startService(intent);
                } catch (Throwable th) {
                    FileLog.e(th);
                }
                this.f42471p0 = SystemClock.elapsedRealtime();
                AndroidUtilities.runOnUIThread(new e20(this, 2), 3000L);
            }
            if (!this.f42475q0 && VoIPService.getSharedInstance() != null) {
                this.W0.addSelfDummyParticipant(false);
                l1();
                VoIPService.getSharedInstance().playConnectedSound();
            }
            I1();
            int childCount = y40Var.getChildCount();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt = y40Var.getChildAt(i16);
                if (childAt instanceof org.telegram.ui.Cells.b4) {
                    ((org.telegram.ui.Cells.b4) childAt).a(true, false);
                }
            }
            if (this.T2 != null) {
                this.f42467o0 = true;
            } else {
                O0(true);
            }
            O1();
            boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
            boolean z10 = this.B1 == 4;
            N1(true, zBooleanValue);
            P1(true);
            if (z10 && ((i12 = this.B1) == 1 || i12 == 0)) {
                k1().j(38, 0L, null);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().playAllowTalkSound();
                }
            }
            if (objArr.length >= 4) {
                Long l11 = (Long) objArr[3];
                long jLongValue = l11.longValue();
                if (jLongValue == 0 || r1()) {
                    return;
                }
                if (o1() && (sharedInstance = VoIPService.getSharedInstance()) != null && jLongValue == sharedInstance.convertingFromCallWithUserId) {
                    return;
                }
                try {
                    ArrayList<TLRPC.Dialog> allDialogs = accountInstance.getMessagesController().getAllDialogs();
                    if (allDialogs != null) {
                        int size = allDialogs.size();
                        int i17 = 0;
                        while (i17 < size) {
                            TLRPC.Dialog dialog = allDialogs.get(i17);
                            i17++;
                            if (dialog.f22384id == jLongValue) {
                                i15 = 1;
                                break;
                            }
                        }
                    }
                } catch (Exception unused) {
                }
                if (DialogObject.isUserDialog(jLongValue)) {
                    TLRPC.User user = accountInstance.getMessagesController().getUser(l11);
                    if (user != null) {
                        if (this.W0.call.participants_count < 250 || UserObject.isContact(user) || user.verified || i15 != 0) {
                            k1().k(0L, 44, user, this.V0, null, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(-jLongValue));
                if (chat != null) {
                    if (this.W0.call.participants_count < 250 || !ChatObject.isNotInChat(chat) || chat.verified || i15 != 0) {
                        k1().k(0L, 44, chat, this.V0, null, null);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.groupCallSpeakingUsersUpdated) {
            j30 j30Var = this.W1;
            if (j30Var.f33648b && this.W0 != null) {
                boolean zC = j30Var.c();
                ChatObject.Call call3 = this.W0;
                if (call3 != null && j30Var.f33648b && (videoParticipant = j30Var.f33653e) != null && call3.participants.f(MessageObject.getPeerId(videoParticipant.participant.peer)) == null) {
                    zC = true;
                }
                if (zC) {
                    ChatObject.VideoParticipant videoParticipant2 = null;
                    int i18 = 0;
                    while (true) {
                        ArrayList arrayList = this.m0;
                        if (i18 >= arrayList.size()) {
                            break;
                        }
                        ChatObject.VideoParticipant videoParticipant3 = (ChatObject.VideoParticipant) arrayList.get(i18);
                        if (this.W0.currentSpeakingPeers.g(null, MessageObject.getPeerId(videoParticipant3.participant.peer)) != null) {
                            TLRPC.GroupCallParticipant groupCallParticipant3 = videoParticipant3.participant;
                            if (!groupCallParticipant3.muted_by_you && j30Var.d != MessageObject.getPeerId(groupCallParticipant3.peer)) {
                                videoParticipant2 = videoParticipant3;
                            }
                        }
                        i18++;
                    }
                    if (videoParticipant2 != null) {
                        e1(videoParticipant2);
                    }
                }
            }
            j30Var.setVisibleParticipant(true);
            O1();
            return;
        }
        if (i10 == NotificationCenter.webRtcMicAmplitudeEvent) {
            C1(((Float) objArr[0]).floatValue());
            return;
        }
        if (i10 == NotificationCenter.needShowAlert) {
            if (((Integer) objArr[0]).intValue() == 6) {
                String str = (String) objArr[1];
                if ("GROUPCALL_PARTICIPANTS_TOO_MUCH".equals(str)) {
                    string = ChatObject.isChannelOrGiga(this.V0) ? LocaleController.getString(R.string.VoipChannelTooMuch) : LocaleController.getString(R.string.VoipGroupTooMuch);
                } else if ("ANONYMOUS_CALLS_DISABLED".equals(str) || "GROUPCALL_ANONYMOUS_FORBIDDEN".equals(str)) {
                    string = ChatObject.isChannelOrGiga(this.V0) ? LocaleController.getString(R.string.VoipChannelJoinAnonymousAdmin) : LocaleController.getString(R.string.VoipGroupJoinAnonymousAdmin);
                } else {
                    string = LocaleController.getString(R.string.ErrorOccurred) + "\n" + str;
                }
                AlertDialog$Builder alertDialog$BuilderN = org.telegram.ui.Components.y4.N(getContext(), LocaleController.getString(R.string.VoipGroupVoiceChat), string);
                alertDialog$BuilderN.j(new h20(this, 1));
                try {
                    alertDialog$BuilderN.o();
                    return;
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
            }
            return;
        }
        if (i10 == NotificationCenter.didEndCall) {
            if (VoIPService.getSharedInstance() == null) {
                dismiss();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f22381id == i1()) {
                I1();
                N1(isShowing(), false);
            }
            long peerId = MessageObject.getPeerId(this.f42502w0);
            ChatObject.Call call4 = this.W0;
            if (call4 == null || chatFull.f22381id != (-peerId) || (groupCallParticipant2 = (TLRPC.GroupCallParticipant) call4.participants.f(peerId)) == null) {
                return;
            }
            groupCallParticipant2.about = chatFull.about;
            O0(true);
            AndroidUtilities.updateVisibleRows(y40Var);
            if (this.A2 != null) {
                while (i15 < this.A2.getChildCount()) {
                    View childAt2 = this.A2.getChildAt(i15);
                    if ((childAt2 instanceof org.telegram.ui.ActionBar.f1) && childAt2.getTag() != null && ((Integer) childAt2.getTag()).intValue() == 10) {
                        ((org.telegram.ui.ActionBar.f1) childAt2).g(LocaleController.getString(TextUtils.isEmpty(groupCallParticipant2.about) ? R.string.VoipAddDescription : R.string.VoipEditDescription), TextUtils.isEmpty(groupCallParticipant2.about) ? R.drawable.msg_addbio : R.drawable.msg_info, null);
                    }
                    i15++;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.didLoadChatAdmins) {
            if (((Long) objArr[0]).longValue() == i1()) {
                I1();
                N1(isShowing(), false);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.applyGroupCallVisibleParticipants) {
            int childCount2 = y40Var.getChildCount();
            long jLongValue2 = ((Long) objArr[0]).longValue();
            while (i15 < childCount2) {
                f2.o1 o1VarG = y40Var.G(y40Var.getChildAt(i15));
                if (o1VarG != null) {
                    View view = o1VarG.f5789a;
                    if (view instanceof org.telegram.ui.Cells.b4) {
                        org.telegram.ui.Cells.b4 b4Var = (org.telegram.ui.Cells.b4) view;
                        if (b4Var.getParticipant() != null) {
                            b4Var.getParticipant().lastVisibleDate = jLongValue2;
                        }
                    }
                }
                i15++;
            }
            return;
        }
        if (i10 == NotificationCenter.userInfoDidLoad) {
            Long l12 = (Long) objArr[0];
            long peerId2 = MessageObject.getPeerId(this.f42502w0);
            if (this.W0 == null || peerId2 != l12.longValue() || (groupCallParticipant = (TLRPC.GroupCallParticipant) this.W0.participants.f(peerId2)) == null) {
                return;
            }
            groupCallParticipant.about = ((TLRPC.UserFull) objArr[1]).about;
            O0(true);
            AndroidUtilities.updateVisibleRows(y40Var);
            if (this.A2 != null) {
                while (i15 < this.A2.getChildCount()) {
                    View childAt3 = this.A2.getChildAt(i15);
                    if ((childAt3 instanceof org.telegram.ui.ActionBar.f1) && childAt3.getTag() != null && ((Integer) childAt3.getTag()).intValue() == 10) {
                        ((org.telegram.ui.ActionBar.f1) childAt3).g(LocaleController.getString(TextUtils.isEmpty(groupCallParticipant.about) ? R.string.VoipAddBio : R.string.VoipEditBio), TextUtils.isEmpty(groupCallParticipant.about) ? R.drawable.msg_addbio : R.drawable.msg_info, null);
                    }
                    i15++;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.mainUserInfoChanged) {
            O0(true);
            AndroidUtilities.updateVisibleRows(y40Var);
            return;
        }
        if (i10 == NotificationCenter.updateInterfaces) {
            int iIntValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_CHAT_NAME & iIntValue) != 0) {
                O0(true);
            }
            if ((MessagesController.UPDATE_MASK_CHAT_NAME & iIntValue) == 0 && (iIntValue & MessagesController.UPDATE_MASK_EMOJI_STATUS) == 0) {
                return;
            }
            AndroidUtilities.updateVisibleRows(y40Var);
            return;
        }
        if (i10 == NotificationCenter.groupCallScreencastStateChanged) {
            d40 d40Var = this.f42497v0;
            if (d40Var != null) {
                d40Var.b(true, true);
            }
            I1();
            return;
        }
        if (i10 == NotificationCenter.conferenceEmojiUpdated) {
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            c50 c50Var = this.f42456l0;
            if (sharedInstance2 != null && (conferenceCall = sharedInstance2.conference) != null) {
                emojis = conferenceCall.getEmojis();
            }
            c50Var.b(emojis);
        }
    }

    @Override
    public final void dismiss() {
        LaunchActivity launchActivity = this.f42427e0;
        launchActivity.W0.remove(this.f42482r2);
        this.f42427e0.setRequestedOrientation(-1);
        A3 = false;
        org.telegram.ui.Components.g30 g30Var = this.A1;
        if (g30Var != null) {
            g30Var.dismiss();
        }
        this.f42467o0 = true;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        AccountInstance accountInstance = this.d;
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.needShowAlert);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.groupCallUpdated);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.didLoadChatAdmins);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.applyGroupCallVisibleParticipants);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.mainUserInfoChanged);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.groupCallScreencastStateChanged);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.groupCallSpeakingUsersUpdated);
        accountInstance.getNotificationCenter().removeObserver(this, NotificationCenter.conferenceEmojiUpdated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcMicAmplitudeEvent);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didEndCall);
        super.dismiss();
    }

    @Override
    public final void dismissInternal() {
        j30 j30Var = this.W1;
        if (j30Var != null) {
            if (this.f42460m2 != null) {
                this.M.getViewTreeObserver().removeOnPreDrawListener(this.f42460m2);
                this.f42460m2 = null;
            }
            ArrayList arrayList = this.V1;
            arrayList.clear();
            ArrayList arrayList2 = this.U1;
            arrayList.addAll(arrayList2);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).f();
                j30Var.removeView((View) arrayList.get(i10));
                ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).e();
                ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).b(true);
            }
            arrayList2.clear();
            if (j30Var.getParent() != null) {
                arrayList2.clear();
                this.containerView.removeView(j30Var);
            }
        }
        super.dismissInternal();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
            VoIPService.getSharedInstance().setSinks(null, null);
        }
        if (f42409z3 == this) {
            f42409z3 = null;
        }
        A3 = false;
        VoIPService.audioLevelsCallback = null;
        org.telegram.ui.Components.n20.j(getContext());
        ChatObject.Call call = this.W0;
        if (call != null) {
            call.clearVideFramesInfo();
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().clearRemoteSinks();
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.f42427e0 == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0 && ((keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25) && VoIPService.getSharedInstance() != null && Build.VERSION.SDK_INT >= 32)) {
            boolean zIsSpeakerMuted = WebRtcAudioTrack.isSpeakerMuted();
            AudioManager audioManager = (AudioManager) this.f42427e0.getSystemService("audio");
            boolean z10 = false;
            if (audioManager.getStreamVolume(0) == audioManager.getStreamMinVolume(0) && keyEvent.getKeyCode() == 25) {
                z10 = true;
            }
            WebRtcAudioTrack.setSpeakerMute(z10);
            if (zIsSpeakerMuted != WebRtcAudioTrack.isSpeakerMuted()) {
                k1().j(z10 ? 42 : 43, 0L, null);
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e1(ChatObject.VideoParticipant videoParticipant) {
        ChatObject.VideoParticipant videoParticipant2;
        if (videoParticipant == null) {
            this.f42427e0.setRequestedOrientation(-1);
        }
        if (VoIPService.getSharedInstance() != null) {
            j30 j30Var = this.W1;
            if (j30Var.f33668r != null) {
                return;
            }
            boolean z10 = C3;
            y40 y40Var = this.M;
            if (!z10) {
                if (this.f42460m2 != null) {
                    y40Var.getViewTreeObserver().removeOnPreDrawListener(this.f42460m2);
                    this.f42460m2 = null;
                }
                if (videoParticipant == null) {
                    if (y40Var.getVisibility() == 0) {
                        ViewTreeObserver viewTreeObserver = y40Var.getViewTreeObserver();
                        k40 k40Var = new k40(this);
                        this.f42460m2 = k40Var;
                        viewTreeObserver.addOnPreDrawListener(k40Var);
                        return;
                    }
                    y40Var.setVisibility(0);
                    O0(false);
                    this.f42467o0 = true;
                    ViewTreeObserver viewTreeObserver2 = y40Var.getViewTreeObserver();
                    j40 j40Var = new j40(this);
                    this.f42460m2 = j40Var;
                    viewTreeObserver2.addOnPreDrawListener(j40Var);
                    return;
                }
                f30 f30Var = this.f42446i2;
                if (f30Var.getVisibility() == 0) {
                    j30Var.j(videoParticipant);
                    AndroidUtilities.updateVisibleRows(f30Var);
                    return;
                }
                f30Var.setVisibility(0);
                org.telegram.ui.Components.f20 f20Var = this.f42457l2;
                f20Var.G(f30Var, false);
                this.f42467o0 = true;
                if (!j30Var.f33648b) {
                    ArrayList arrayList = f20Var.f28234e;
                    f2.k0 k0Var = (f2.k0) f30Var.getLayoutManager();
                    if (k0Var != null) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            if (((ChatObject.VideoParticipant) arrayList.get(i10)).equals(videoParticipant)) {
                                k0Var.h1(i10, AndroidUtilities.dp(13.0f));
                                break;
                            }
                        }
                    }
                }
                ViewTreeObserver viewTreeObserver3 = y40Var.getViewTreeObserver();
                i40 i40Var = new i40(this, videoParticipant);
                this.f42460m2 = i40Var;
                viewTreeObserver3.addOnPreDrawListener(i40Var);
                return;
            }
            if (this.f42460m2 != null) {
                y40Var.getViewTreeObserver().removeOnPreDrawListener(this.f42460m2);
                this.f42460m2 = null;
            }
            ArrayList arrayList2 = new ArrayList();
            y50 y50Var = this.f42454k2;
            ArrayList arrayList3 = this.U1;
            ArrayList arrayList4 = this.V1;
            if (videoParticipant == null) {
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                    org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) arrayList4.get(i11);
                    org.telegram.ui.Components.voip.l lVar = tVar.f33875c;
                    if (lVar != null) {
                        lVar.setRenderer(null);
                        org.telegram.ui.Components.e20 e20Var = tVar.d;
                        if (e20Var != null) {
                            e20Var.setRenderer(null);
                        }
                        org.telegram.ui.Components.voip.l lVar2 = tVar.f33878e;
                        if (lVar2 != null) {
                            lVar2.setRenderer(null);
                        }
                        arrayList2.add(tVar.f33900w);
                        tVar.b(false);
                        tVar.animate().alpha(0.0f).setListener(new e40(this, tVar));
                    }
                }
                this.L2 = false;
                y50Var.H(this.f42450j2, true, true);
            } else {
                arrayList4.clear();
                arrayList4.addAll(arrayList3);
                for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                    org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) arrayList4.get(i12);
                    if (tVar2.f33878e != null && ((videoParticipant2 = tVar2.f33900w) == null || !videoParticipant2.equals(videoParticipant))) {
                        arrayList2.add(tVar2.f33900w);
                        tVar2.b(false);
                        org.telegram.ui.Components.e20 e20Var2 = tVar2.d;
                        if (e20Var2 != null) {
                            e20Var2.setRenderer(null);
                        }
                        org.telegram.ui.Components.voip.l lVar3 = tVar2.f33875c;
                        if (lVar3 != null) {
                            lVar3.setRenderer(null);
                        }
                        tVar2.animate().alpha(0.0f).setListener(new f40(this, tVar2));
                    }
                }
                this.L2 = true;
                y50Var.f44706r = false;
                if (!arrayList2.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.r61(27, this, arrayList2));
                }
            }
            boolean z11 = !j30Var.f33648b;
            ViewTreeObserver viewTreeObserver4 = y40Var.getViewTreeObserver();
            h40 h40Var = new h40(this, videoParticipant, z11);
            this.f42460m2 = h40Var;
            viewTreeObserver4.addOnPreDrawListener(h40Var);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    public final int h1() {
        Integer num = this.f42496u3;
        if (num != null) {
            return num.intValue();
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return 0;
        }
        int currentAudioRoute = sharedInstance.getCurrentAudioRoute();
        if (currentAudioRoute != 0) {
            return currentAudioRoute != 1 ? 2 : 0;
        }
        return 1;
    }

    public final long i1() {
        TLRPC.Chat chat = this.V0;
        if (chat == null) {
            return 0L;
        }
        return chat.f22380id;
    }

    public final void j1(boolean z10) {
        String strN;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        AccountInstance accountInstance = this.d;
        TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(i1()));
        if (chat == null || ChatObject.isPublic(chat)) {
            if (this.W0 == null) {
                return;
            }
            int i10 = 0;
            while (i10 < 2) {
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                exportgroupcallinvite.call = this.W0.getInputGroupCall();
                exportgroupcallinvite.can_self_unmute = i10 == 1;
                accountInstance.getConnectionsManager().sendRequest(exportgroupcallinvite, new org.telegram.messenger.voip.k0(this, i10, z10, 1));
                i10++;
            }
            return;
        }
        TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(i1());
        String publicUsername = ChatObject.getPublicUsername(this.V0);
        if (TextUtils.isEmpty(publicUsername)) {
            strN = (chatFull == null || (tL_chatInviteExported = chatFull.exported_invite) == null) ? null : tL_chatInviteExported.link;
        } else {
            strN = a9.p.n(accountInstance.getMessagesController().linkPrefix, "/", publicUsername, new StringBuilder());
        }
        if (!TextUtils.isEmpty(strN)) {
            u1(null, strN, true, z10);
            return;
        }
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.peer = MessagesController.getInputPeer(this.V0);
        accountInstance.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new hh.l7(this, chatFull, z10, 5));
    }

    public final UndoView k1() {
        if (!C3) {
            j30 j30Var = this.W1;
            if (j30Var.f33648b) {
                return j30Var.getUndoView();
            }
        }
        UndoView[] undoViewArr = this.f42432f0;
        if (undoViewArr[0].getVisibility() == 0) {
            UndoView undoView = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView;
            undoView.e(2, true);
            this.containerView.removeView(undoViewArr[0]);
            this.containerView.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final void l1() {
        VoIPService sharedInstance;
        if (this.f42475q0 || (sharedInstance = VoIPService.getSharedInstance()) == null) {
            return;
        }
        this.f42475q0 = true;
        this.f42516z0.addAll(this.W0.visibleParticipants);
        this.A0.addAll(this.m0);
        this.B0.addAll(this.W0.invitedUsers);
        this.C0.addAll(this.W0.shadyJoinParticipants);
        this.D0.addAll(this.W0.shadyLeftParticipants);
        this.P1 = sharedInstance.getCallState();
        if (this.W0 == null) {
            ChatObject.Call call = sharedInstance.groupCall;
            this.W0 = call;
            this.f42457l2.f28233c = call;
            this.W1.setGroupCall(call);
            this.f42454k2.f44702c = this.W0;
        }
        ug.i iVar = this.Y;
        if (iVar != null) {
            iVar.C0(this.d.getCurrentAccount(), this.W0.getInputGroupCall(false));
        }
        this.K.setTitleRightMargin(AndroidUtilities.dp(48.0f) * 2);
        this.W0.saveActiveDates();
        VoIPService.getSharedInstance().registerStateListener(this);
        x40 x40Var = this.R;
        if (x40Var == null || x40Var.getVisibility() != 0) {
            return;
        }
        this.f42484s.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Dg, false), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, true);
        M1(true);
        this.f42486s1.setText(LocaleController.getString(ChatObject.isChannelOrGiga(this.V0) ? R.string.VoipChannelEndChat : R.string.VoipGroupEndChat));
        y40 y40Var = this.M;
        y40Var.setVisibility(0);
        org.telegram.ui.ActionBar.v0 v0Var = this.f42441h1;
        v0Var.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.ALPHA;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(y40Var, (Property<y40, Float>) property, 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(y40Var, (Property<y40, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(200.0f), 0.0f);
        Property property2 = View.SCALE_X;
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(x40Var, (Property<x40, Float>) property2, 0.0f);
        Property property3 = View.SCALE_Y;
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(x40Var, (Property<x40, Float>) property3, 0.0f);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(x40Var, (Property<x40, Float>) property, 0.0f);
        org.telegram.ui.ActionBar.h5 h5Var = this.Q;
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(h5Var, (Property<org.telegram.ui.ActionBar.h5, Float>) property2, 0.0f);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(h5Var, (Property<org.telegram.ui.ActionBar.h5, Float>) property3, 0.0f);
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(h5Var, (Property<org.telegram.ui.ActionBar.h5, Float>) property, 0.0f);
        org.telegram.ui.ActionBar.h5 h5Var2 = this.S;
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4, objectAnimatorOfFloat5, objectAnimatorOfFloat6, objectAnimatorOfFloat7, objectAnimatorOfFloat8, ObjectAnimator.ofFloat(h5Var2, (Property<org.telegram.ui.ActionBar.h5, Float>) property2, 0.0f), ObjectAnimator.ofFloat(h5Var2, (Property<org.telegram.ui.ActionBar.h5, Float>) property3, 0.0f), ObjectAnimator.ofFloat(h5Var2, (Property<org.telegram.ui.ActionBar.h5, Float>) property, 0.0f), ObjectAnimator.ofFloat(v0Var, (Property<org.telegram.ui.ActionBar.v0, Float>) property2, 0.0f, 1.0f), ObjectAnimator.ofFloat(v0Var, (Property<org.telegram.ui.ActionBar.v0, Float>) property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(v0Var, (Property<org.telegram.ui.ActionBar.v0, Float>) property, 0.0f, 1.0f));
        animatorSet.setInterpolator(org.telegram.ui.Components.er.f28123g);
        animatorSet.addListener(new l40(this, 0));
        animatorSet.setDuration(300L);
        animatorSet.start();
    }

    public final void m1(final long j10, final boolean z10) {
        if (this.W0 != null) {
            AccountInstance accountInstance = this.d;
            final TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(j10));
            if (user != null) {
                final org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(getContext(), 3, null)};
                final TL_phone.inviteToGroupCall invitetogroupcall = new TL_phone.inviteToGroupCall();
                invitetogroupcall.call = this.W0.getInputGroupCall();
                TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                tL_inputUser.user_id = user.f22527id;
                tL_inputUser.access_hash = user.access_hash;
                invitetogroupcall.users.add(tL_inputUser);
                int iSendRequest = accountInstance.getConnectionsManager().sendRequest(invitetogroupcall, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        s50 s50Var = this.f40647a;
                        long j11 = j10;
                        org.telegram.ui.ActionBar.b2[] b2VarArr2 = b2VarArr;
                        if (tLObject == null) {
                            AndroidUtilities.runOnUIThread(new hh.i(s50Var, b2VarArr2, z10, tL_error, j11, invitetogroupcall));
                            return;
                        }
                        s50Var.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.pg(s50Var, j11, b2VarArr2, user, 8));
                    }
                });
                if (iSendRequest != 0) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.km(this, b2VarArr, iSendRequest, 27), 500L);
                }
            }
        }
    }

    public final boolean n1() {
        float fMin;
        int iDp = AndroidUtilities.dp(74.0f);
        float f10 = this.f42493u0 - iDp;
        if (this.backgroundPaddingTop + f10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            fMin = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f10) - this.backgroundPaddingTop) / ((iDp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f)));
        } else {
            fMin = 0.0f;
        }
        return fMin > 0.5f;
    }

    @Override
    public final void o(int i10, float f10, float f11, ud.c cVar) {
        if (i10 == 2) {
            Y0();
            W0();
            X0();
            float f12 = 1.0f - this.f42500v3.f48497e;
            v20 v20Var = this.f42426e;
            v20Var.setAlpha(f12);
            this.W1.setProgressToHideUi(f10);
            this.f42446i2.invalidate();
            this.containerView.invalidate();
            v20Var.invalidate();
        }
        if (i10 == 3) {
            Z0();
            Y0();
            a1();
            V0();
            this.containerView.invalidate();
        }
        if (i10 == 4) {
            Y0();
            this.C.invalidate();
            this.D.invalidate();
        }
        if (i10 == 5) {
            Y0();
            this.containerView.invalidate();
        }
    }

    public final boolean o1() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        return sharedInstance != null && sharedInstance.isConference();
    }

    @Override
    public final void onAudioSettingsChanged() {
        M1(true);
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            C1(0.0f);
        }
        y40 y40Var = this.M;
        if (y40Var.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(y40Var);
        }
        f30 f30Var = this.f42446i2;
        if (f30Var.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(f30Var);
        }
        ArrayList arrayList = this.V1;
        arrayList.clear();
        arrayList.addAll(this.U1);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).j(true);
        }
    }

    @Override
    public final void onBackPressed() {
        d40 d40Var = this.f42497v0;
        if (d40Var != null) {
            d40Var.b(false, false);
            return;
        }
        if (this.f42415b2) {
            d1(true);
        } else if (this.W1.f33648b) {
            e1(null);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.u0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
        ArrayList arrayList = this.V1;
        arrayList.clear();
        arrayList.addAll(this.U1);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).j(true);
        }
        d40 d40Var = this.f42497v0;
        if (d40Var == null || VoIPService.getSharedInstance() == null) {
            return;
        }
        d40Var.h.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LaunchActivity launchActivity = this.f42427e0;
        launchActivity.W0.add(this.f42482r2);
    }

    @Override
    public final boolean onCustomOpenAnimation() {
        A3 = true;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        org.telegram.ui.Components.n20.j(getContext());
        return super.onCustomOpenAnimation();
    }

    @Override
    public final void onMediaStateUpdated(int i10, int i11) {
        org.telegram.messenger.voip.u0.d(this, i10, i11);
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.u0.e(this, z10);
    }

    @Override
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.messenger.voip.u0.f(this, i10);
    }

    @Override
    public final void onStateChanged(int i10) {
        this.P1 = i10;
        N1(isShowing(), false);
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.u0.h(this, z10);
    }

    public final boolean q1() {
        return r1() && !this.W0.visibleVideoParticipants.isEmpty() && (this.W0.visibleVideoParticipants.get(0).aspectRatio == 0.0f || this.W0.visibleVideoParticipants.get(0).aspectRatio >= 1.0f);
    }

    public final boolean r1() {
        ChatObject.Call call = this.W0;
        return call != null && call.call.rtmp_stream;
    }

    public final void s1(org.telegram.ui.ActionBar.e3 e3Var, org.telegram.ui.ActionBar.b2 b2Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
        if (this.f42485s0) {
            return;
        }
        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f42427e0.O().getFragmentStack().get(this.f42427e0.O().getFragmentStack().size() - 1);
        if (n2Var instanceof rn) {
            boolean zP9 = ((rn) n2Var).P9();
            this.f42485s0 = true;
            this.f42489t0 = true;
            AndroidUtilities.runOnUIThread(new cg.c(e3Var, editTextBoldCursor, z10, b2Var, 17), zP9 ? 200L : 0L);
            return;
        }
        this.f42485s0 = true;
        this.f42489t0 = true;
        if (e3Var != null) {
            e3Var.setFocusable(true);
        } else if (b2Var != null) {
            b2Var.k(true);
        }
        if (z10) {
            AndroidUtilities.runOnUIThread(new ah(2, editTextBoldCursor), 100L);
        }
    }

    @Override
    public final void show() {
        super.show();
        if (org.telegram.ui.Components.voip.g1.Z.R) {
            org.telegram.ui.Components.voip.g1.j();
        }
    }

    public final void u1(String str, String str2, boolean z10, boolean z11) {
        boolean zP9;
        String str3;
        String str4;
        String string;
        if (r1() && str != null) {
            str2 = null;
        }
        if (z11) {
            if (str == null) {
                str = str2;
            }
            AndroidUtilities.addToClipboard(str);
            if (AndroidUtilities.shouldShowClipboardToast()) {
                k1().k(0L, 33, null, null, null, null);
                return;
            }
            return;
        }
        LaunchActivity launchActivity = this.f42427e0;
        if (launchActivity != null) {
            org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) launchActivity.O().getFragmentStack().get(this.f42427e0.O().getFragmentStack().size() - 1);
            if (n2Var instanceof rn) {
                zP9 = ((rn) n2Var).P9();
                this.f42489t0 = true;
                this.f42485s0 = true;
            } else {
                zP9 = false;
            }
        } else {
            zP9 = false;
        }
        if (str == null || str2 != null) {
            str3 = str;
            str4 = str2;
        } else {
            str4 = str;
            str3 = null;
        }
        if (str3 == null && z10) {
            string = ChatObject.isChannelOrGiga(this.V0) ? LocaleController.formatString("VoipChannelInviteText", R.string.VoipChannelInviteText, str4) : LocaleController.formatString("VoipGroupInviteText", R.string.VoipGroupInviteText, str4);
        } else {
            string = str4;
        }
        m40 m40Var = new m40(this, getContext(), string, str3, str4, str3);
        this.f42463n0 = m40Var;
        m40Var.f32537o0 = new g(this, 20);
        m40Var.setOnDismissListener(new h20(this, 3));
        AndroidUtilities.runOnUIThread(new e20(this, 7), zP9 ? 200L : 0L);
    }

    public final void v1() {
        ChatObject.Call call = this.W0;
        if (call == null || call.call == null) {
            return;
        }
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(getContext(), 3, null);
        b2Var.q(300L);
        TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
        exportgroupcallinvite.call = tL_inputGroupCall;
        TLRPC.GroupCall groupCall = this.W0.call;
        tL_inputGroupCall.f22397id = groupCall.f22390id;
        tL_inputGroupCall.access_hash = groupCall.access_hash;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(exportgroupcallinvite, new z9(this, b2Var, exportgroupcallinvite, 12));
    }

    public final void x1(TLRPC.GroupCallParticipant groupCallParticipant, final long j10, int i10) {
        String firstName;
        TextView textView;
        VoIPService voIPService;
        int i11;
        String str;
        String str2;
        EditText editText;
        org.telegram.ui.ActionBar.b2 b2Var;
        float f10;
        int i12;
        int i13;
        int i14;
        int iDp;
        int iDp2;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        AccountInstance accountInstance = this.d;
        TLObject user = j10 > 0 ? accountInstance.getMessagesController().getUser(Long.valueOf(j10)) : accountInstance.getMessagesController().getChat(Long.valueOf(-j10));
        int i15 = 5;
        if (i10 == 0 || i10 == 2 || i10 == 3) {
            if (i10 == 0) {
                if (VoIPService.getSharedInstance() == null) {
                    return;
                }
                VoIPService.getSharedInstance().editCallMember(user, Boolean.TRUE, null, null, null, null);
                k1().k(0L, 30, user, null, null, null);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            int i16 = org.telegram.ui.ActionBar.g6.f23275pg;
            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.f22702a;
            b2Var2.E = i16;
            TextView textView2 = new TextView(getContext());
            int i17 = org.telegram.ui.ActionBar.g6.f23135hg;
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
            textView2.setTextSize(1, 16.0f);
            textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            FrameLayout frameLayout = new FrameLayout(getContext());
            alertDialog$Builder.n(frameLayout);
            org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
            y8Var.u(AndroidUtilities.dp(12.0f));
            org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(getContext());
            n9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
            frameLayout.addView(n9Var, h7.z5.d(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
            y8Var.j(this.currentAccount, user);
            boolean z10 = user instanceof TLRPC.User;
            if (z10) {
                TLRPC.User user2 = (TLRPC.User) user;
                n9Var.e(user2, y8Var);
                firstName = UserObject.getFirstName(user2);
            } else {
                TLRPC.Chat chat = (TLRPC.Chat) user;
                n9Var.e(chat, y8Var);
                firstName = chat.title;
            }
            TextView textView3 = new TextView(getContext());
            textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
            textView3.setTextSize(1, 20.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setLines(1);
            textView3.setMaxLines(1);
            textView3.setSingleLine(true);
            textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            textView3.setEllipsize(TextUtils.TruncateAt.END);
            TLRPC.Chat chat2 = this.V0;
            String str3 = chat2 != null ? chat2.title : "";
            if (i10 != 2) {
                textView3.setText(LocaleController.getString(R.string.VoipGroupAddMemberTitle));
                org.telegram.messenger.rl.n(R.string.VoipGroupAddMemberText, new Object[]{firstName, str3}, textView2);
            } else if (o1()) {
                textView3.setText(LocaleController.getString(R.string.VoipConferenceRemoveMemberAlertTitle2));
                org.telegram.messenger.rl.n(R.string.VoipConferenceRemoveMemberAlertText2, new Object[]{firstName}, textView2);
            } else {
                textView3.setText(LocaleController.getString(R.string.VoipGroupRemoveMemberAlertTitle2));
                if (ChatObject.isChannelOrGiga(this.V0)) {
                    org.telegram.messenger.rl.n(R.string.VoipChannelRemoveMemberAlertText2, new Object[]{firstName, str3}, textView2);
                } else {
                    org.telegram.messenger.rl.n(R.string.VoipGroupRemoveMemberAlertText2, new Object[]{firstName, str3}, textView2);
                }
            }
            boolean z11 = LocaleController.isRTL;
            frameLayout.addView(textView3, h7.z5.d(-1, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 21 : 76, 11.0f, z11 ? 76 : 21, 0.0f));
            frameLayout.addView(textView2, h7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
            if (i10 == 2) {
                alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupUserRemove), new zr(11, this, user));
            } else if (z10) {
                alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupAdd), new c3.f(this, (TLRPC.User) user, j10, 8));
            }
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            b2Var2.i(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23367ug, false));
            b2Var2.show();
            if (i10 != 2 || (textView = (TextView) b2Var2.d(-1)) == null) {
                return;
            }
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23383vg, false));
            return;
        }
        if (i10 == 6) {
            this.f42427e0.K0(this.currentAccount);
            Bundle bundle = new Bundle();
            if (j10 > 0) {
                bundle.putLong("user_id", j10);
            } else {
                bundle.putLong("chat_id", -j10);
            }
            this.f42427e0.p0(new rn(bundle));
            dismiss();
            return;
        }
        if (i10 == 8) {
            this.f42427e0.K0(this.currentAccount);
            org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f42427e0.O().getFragmentStack().get(this.f42427e0.O().getFragmentStack().size() - 1);
            if ((n2Var instanceof rn) && ((rn) n2Var).a() == j10) {
                dismiss();
                return;
            }
            Bundle bundle2 = new Bundle();
            if (j10 > 0) {
                bundle2.putLong("user_id", j10);
            } else {
                bundle2.putLong("chat_id", -j10);
            }
            this.f42427e0.p0(new rn(bundle2));
            dismiss();
            return;
        }
        if (i10 == 7) {
            sharedInstance.editCallMember(user, Boolean.TRUE, null, null, Boolean.FALSE, null);
            J1(2, true);
            return;
        }
        int i18 = 9;
        if (i10 == 9) {
            org.telegram.ui.Components.j40 j40Var = this.f42424d2;
            if (j40Var == null || !j40Var.h()) {
                TLRPC.User currentUser = accountInstance.getUserConfig().getCurrentUser();
                org.telegram.ui.Components.j40 j40Var2 = new org.telegram.ui.Components.j40(0, true, true);
                this.f42424d2 = j40Var2;
                j40Var2.D = true;
                j40Var2.N = true;
                j40Var2.C = true;
                j40Var2.F = true;
                j40Var2.O = true;
                j40Var2.f29569a = this.f42427e0.O().getLastFragment();
                org.telegram.ui.Components.j40 j40Var3 = this.f42424d2;
                z40 z40Var = new z40(this, j10);
                this.f42429e2 = z40Var;
                j40Var3.f29570b = z40Var;
                TLRPC.UserProfilePhoto userProfilePhoto = currentUser.photo;
                j40Var3.o((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new e20(this, i18), new lh.e1(i15), 0);
                return;
            }
            return;
        }
        if (i10 != 10) {
            if (i10 != 11) {
                if (i10 == 5) {
                    sharedInstance.editCallMember(user, Boolean.TRUE, null, null, null, null);
                    k1().m(0L, user, 35);
                    sharedInstance.setParticipantVolume(groupCallParticipant, 0);
                    return;
                }
                if ((groupCallParticipant.flags & 128) == 0 || groupCallParticipant.volume != 0) {
                    voIPService = sharedInstance;
                    i11 = 1;
                    voIPService.editCallMember(user, Boolean.FALSE, null, null, null, null);
                } else {
                    groupCallParticipant.volume = 10000;
                    groupCallParticipant.volume_by_admin = false;
                    voIPService = sharedInstance;
                    i11 = 1;
                    voIPService.editCallMember(user, Boolean.FALSE, null, 10000, null, null);
                }
                voIPService.setParticipantVolume(groupCallParticipant, ChatObject.getParticipantVolume(groupCallParticipant));
                k1().k(0L, i10 == i11 ? 31 : 36, user, null, null, null);
                return;
            }
            Context context = getContext();
            int i19 = this.currentAccount;
            Pattern pattern = org.telegram.ui.Components.y4.f34802a;
            if (DialogObject.isUserDialog(j10)) {
                TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j10));
                str = user3.first_name;
                str2 = user3.last_name;
            } else {
                str = MessagesController.getInstance(i19).getChat(Long.valueOf(-j10)).title;
                str2 = null;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
            String string = LocaleController.getString(j10 > 0 ? R.string.VoipEditName : R.string.VoipEditTitle);
            org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder2.f22702a;
            b2Var3.N = string;
            LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 1);
            EditText editText2 = new EditText(context);
            int i20 = org.telegram.ui.ActionBar.g6.f23135hg;
            editText2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i20, false));
            editText2.setTextSize(1, 16.0f);
            editText2.setMaxLines(1);
            editText2.setLines(1);
            editText2.setSingleLine(true);
            editText2.setGravity(LocaleController.isRTL ? 5 : 3);
            editText2.setInputType(49152);
            editText2.setImeOptions(j10 > 0 ? 5 : 6);
            editText2.setHint(LocaleController.getString(j10 > 0 ? R.string.FirstName : R.string.VoipEditTitleHint));
            editText2.setBackground(org.telegram.ui.ActionBar.g6.S(context));
            editText2.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
            editText2.requestFocus();
            if (j10 > 0) {
                editText = new EditText(context);
                editText.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i20, false));
                editText.setTextSize(1, 16.0f);
                editText.setMaxLines(1);
                editText.setLines(1);
                editText.setSingleLine(true);
                editText.setGravity(LocaleController.isRTL ? 5 : 3);
                editText.setInputType(49152);
                editText.setImeOptions(6);
                editText.setHint(LocaleController.getString(R.string.LastName));
                editText.setBackground(org.telegram.ui.ActionBar.g6.S(context));
                editText.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
            } else {
                editText = null;
            }
            AndroidUtilities.showKeyboard(editText2);
            linearLayoutG.addView(editText2, h7.z5.t(-1, -2, 0, 23, 12, 23, 21));
            if (editText != null) {
                linearLayoutG.addView(editText, h7.z5.t(-1, -2, 0, 23, 12, 23, 21));
            }
            editText2.setText(str);
            editText2.setSelection(editText2.getText().toString().length());
            if (editText != null) {
                editText.setText(str2);
                editText.setSelection(editText.getText().toString().length());
            }
            alertDialog$Builder2.n(linearLayoutG);
            org.telegram.ui.ActionBar.a2 p1Var = new nh.p1(editText2, j10, i19, editText);
            alertDialog$Builder2.k(LocaleController.getString(R.string.Save), p1Var);
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
            b2Var3.J = new cg.g(7, editText2, editText);
            b2Var3.i(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23367ug, false));
            b2Var3.show();
            b2Var3.o(org.telegram.ui.ActionBar.g6.w0(null, i20, false));
            td tdVar = new td(1 == true ? 1 : 0, b2Var3, p1Var);
            if (editText != null) {
                editText.setOnEditorActionListener(tdVar);
                return;
            } else {
                editText2.setOnEditorActionListener(tdVar);
                return;
            }
        }
        String str4 = groupCallParticipant.about;
        Context context2 = getContext();
        int i21 = this.currentAccount;
        Pattern pattern2 = org.telegram.ui.Components.y4.f34802a;
        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context2);
        String string2 = LocaleController.getString(j10 > 0 ? R.string.UserBio : R.string.DescriptionPlaceholder);
        org.telegram.ui.ActionBar.b2 b2Var4 = alertDialog$Builder3.f22702a;
        b2Var4.N = string2;
        b2Var4.P = LocaleController.getString(j10 > 0 ? R.string.VoipGroupBioEditAlertText : R.string.DescriptionInfo);
        FrameLayout frameLayout2 = new FrameLayout(context2);
        frameLayout2.setClipChildren(false);
        if (j10 < 0) {
            b2Var = b2Var4;
            long j11 = -j10;
            if (MessagesController.getInstance(i21).getChatFull(j11) == null) {
                f10 = 8.0f;
                MessagesController.getInstance(i21).loadFullChat(j11, ConnectionsManager.generateClassGuid(), true);
            }
            NumberTextView numberTextView = new NumberTextView(context2);
            EditText editText3 = new EditText(context2);
            int i22 = org.telegram.ui.ActionBar.g6.f23135hg;
            editText3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i22, false));
            if (j10 > 0) {
                i12 = R.string.UserBio;
            } else {
                i12 = R.string.DescriptionPlaceholder;
            }
            editText3.setHint(LocaleController.getString(i12));
            editText3.setTextSize(1, 16.0f);
            editText3.setBackground(org.telegram.ui.ActionBar.g6.S(context2));
            editText3.setMaxLines(4);
            editText3.setRawInputType(147457);
            editText3.setImeOptions(6);
            if (j10 > 0) {
                i13 = 70;
            } else {
                i13 = 255;
            }
            editText3.setFilters(new InputFilter[]{new org.telegram.ui.Components.j3(i13, context2, numberTextView)});
            numberTextView.setCenterAlign(true);
            numberTextView.setTextSize(15);
            numberTextView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.B6, false));
            numberTextView.setImportantForAccessibility(2);
            if (LocaleController.isRTL) {
                i14 = 3;
            } else {
                i14 = 5;
            }
            frameLayout2.addView(numberTextView, h7.z5.d(20, 20.0f, i14, 0.0f, 14.0f, 21.0f, 0.0f));
            if (LocaleController.isRTL) {
                iDp = AndroidUtilities.dp(24.0f);
            } else {
                iDp = 0;
            }
            int iDp3 = AndroidUtilities.dp(f10);
            if (LocaleController.isRTL) {
                iDp2 = 0;
            } else {
                iDp2 = AndroidUtilities.dp(24.0f);
            }
            editText3.setPadding(iDp, iDp3, iDp2, AndroidUtilities.dp(f10));
            editText3.addTextChangedListener(new org.telegram.ui.Components.xp(i13, numberTextView));
            AndroidUtilities.updateViewVisibilityAnimated(numberTextView, false, 0.0f, false);
            editText3.setText(str4);
            editText3.setSelection(editText3.getText().toString().length());
            alertDialog$Builder3.n(frameLayout2);
            final i3.e eVar = new i3.e(editText3, i21, j10, 2);
            alertDialog$Builder3.k(LocaleController.getString(R.string.Save), eVar);
            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
            final org.telegram.ui.ActionBar.b2 b2Var5 = b2Var;
            b2Var5.J = new org.telegram.ui.Components.o1(editText3, 1 == true ? 1 : 0);
            frameLayout2.addView(editText3, h7.z5.d(-1, -2.0f, 0, 23.0f, 12.0f, 23.0f, 21.0f));
            editText3.requestFocus();
            AndroidUtilities.showKeyboard(editText3);
            editText3.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public final boolean onEditorAction(TextView textView4, int i23, KeyEvent keyEvent) {
                    if (i23 == 6 || (j10 > 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.ui.ActionBar.b2 b2Var6 = b2Var5;
                        if (b2Var6.isShowing()) {
                            eVar.f(b2Var6, 0);
                            return true;
                        }
                    }
                    return false;
                }
            });
            b2Var5.i(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23367ug, false));
            b2Var5.show();
            b2Var5.o(org.telegram.ui.ActionBar.g6.w0(null, i22, false));
        }
        b2Var = b2Var4;
        f10 = 8.0f;
        NumberTextView numberTextView2 = new NumberTextView(context2);
        EditText editText4 = new EditText(context2);
        int i23 = org.telegram.ui.ActionBar.g6.f23135hg;
        editText4.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i23, false));
        if (j10 > 0) {
            i12 = R.string.UserBio;
        } else {
            i12 = R.string.DescriptionPlaceholder;
        }
        editText4.setHint(LocaleController.getString(i12));
        editText4.setTextSize(1, 16.0f);
        editText4.setBackground(org.telegram.ui.ActionBar.g6.S(context2));
        editText4.setMaxLines(4);
        editText4.setRawInputType(147457);
        editText4.setImeOptions(6);
        if (j10 > 0) {
            i13 = 70;
        } else {
            i13 = 255;
        }
        editText4.setFilters(new InputFilter[]{new org.telegram.ui.Components.j3(i13, context2, numberTextView2)});
        numberTextView2.setCenterAlign(true);
        numberTextView2.setTextSize(15);
        numberTextView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.B6, false));
        numberTextView2.setImportantForAccessibility(2);
        if (LocaleController.isRTL) {
            i14 = 3;
        } else {
            i14 = 5;
        }
        frameLayout2.addView(numberTextView2, h7.z5.d(20, 20.0f, i14, 0.0f, 14.0f, 21.0f, 0.0f));
        if (LocaleController.isRTL) {
            iDp = AndroidUtilities.dp(24.0f);
        } else {
            iDp = 0;
        }
        int iDp4 = AndroidUtilities.dp(f10);
        if (LocaleController.isRTL) {
            iDp2 = 0;
        } else {
            iDp2 = AndroidUtilities.dp(24.0f);
        }
        editText4.setPadding(iDp, iDp4, iDp2, AndroidUtilities.dp(f10));
        editText4.addTextChangedListener(new org.telegram.ui.Components.xp(i13, numberTextView2));
        AndroidUtilities.updateViewVisibilityAnimated(numberTextView2, false, 0.0f, false);
        editText4.setText(str4);
        editText4.setSelection(editText4.getText().toString().length());
        alertDialog$Builder3.n(frameLayout2);
        final i3.e eVar2 = new i3.e(editText4, i21, j10, 2);
        alertDialog$Builder3.k(LocaleController.getString(R.string.Save), eVar2);
        alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
        final org.telegram.ui.ActionBar.b2 b2Var6 = b2Var;
        b2Var6.J = new org.telegram.ui.Components.o1(editText4, 1 == true ? 1 : 0);
        frameLayout2.addView(editText4, h7.z5.d(-1, -2.0f, 0, 23.0f, 12.0f, 23.0f, 21.0f));
        editText4.requestFocus();
        AndroidUtilities.showKeyboard(editText4);
        editText4.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView4, int i24, KeyEvent keyEvent) {
                if (i24 == 6 || (j10 > 0 && keyEvent.getKeyCode() == 66)) {
                    org.telegram.ui.ActionBar.b2 b2Var7 = b2Var6;
                    if (b2Var7.isShowing()) {
                        eVar2.f(b2Var7, 0);
                        return true;
                    }
                }
                return false;
            }
        });
        b2Var6.i(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23367ug, false));
        b2Var6.show();
        b2Var6.o(org.telegram.ui.ActionBar.g6.w0(null, i23, false));
    }

    public final void y1(boolean z10, org.telegram.ui.Cells.b4 b4Var) {
        float measuredHeight;
        float y10;
        final float x8;
        int measuredHeight2;
        org.telegram.ui.Components.voip.t tVar;
        org.telegram.ui.Components.voip.t tVar2;
        float paddingLeft = this.containerView.getPaddingLeft() + AndroidUtilities.dp(14.0f);
        float paddingTop = this.containerView.getPaddingTop() + AndroidUtilities.dp(14.0f);
        boolean z11 = this.X2;
        l30 l30Var = this.f42412b;
        y40 y40Var = this.M;
        if (z11) {
            x8 = (y40Var.getX() + (b4Var.getX() + b4Var.getAvatarImageView().getX())) - paddingLeft;
            y10 = (y40Var.getY() + (b4Var.getY() + b4Var.getAvatarImageView().getY())) - paddingTop;
            measuredHeight = b4Var.getAvatarImageView().getMeasuredHeight() / y40Var.getMeasuredWidth();
            measuredHeight2 = (int) ((b4Var.getAvatarImageView().getMeasuredHeight() >> 1) / measuredHeight);
        } else {
            if (this.V2 == null) {
                this.K2 = true;
            } else {
                this.K2 = z10 || l30Var.f27451z0.k(l30Var.getCurrentItem()) == 0;
            }
            org.telegram.ui.Components.voip.l lVar = this.U2;
            j30 j30Var = this.W1;
            if (lVar == null || !this.K2) {
                org.telegram.ui.Components.e20 e20Var = this.W2;
                if (e20Var != null) {
                    org.telegram.ui.Components.voip.t tVar3 = this.V2;
                    f30 f30Var = this.f42446i2;
                    if (tVar3 == null) {
                        float x10 = (j30Var.getX() + (f30Var.getX() + (this.W2.getX() + e20Var.getAvatarImageView().getX()))) - paddingLeft;
                        float y11 = (j30Var.getY() + (f30Var.getY() + (this.W2.getY() + this.W2.getAvatarImageView().getY()))) - paddingTop;
                        measuredHeight = this.W2.getAvatarImageView().getMeasuredHeight() / y40Var.getMeasuredWidth();
                        measuredHeight2 = (int) ((this.W2.getAvatarImageView().getMeasuredHeight() >> 1) / measuredHeight);
                        y10 = y11;
                        x8 = x10;
                    } else {
                        if (this.K2) {
                            x8 = (j30Var.getX() + (f30Var.getX() + e20Var.getX())) - paddingLeft;
                            y10 = (j30Var.getY() + (f30Var.getY() + this.W2.getY())) - paddingTop;
                        }
                        measuredHeight2 = 0;
                    }
                    if (!this.K2 && (tVar = this.V2) != null) {
                        tVar.invalidate();
                        j30Var.invalidate();
                        org.telegram.ui.Components.voip.t tVar4 = this.V2;
                        tVar4.h = false;
                        tVar4.j(false);
                        this.V2 = null;
                    }
                }
                measuredHeight = 0.96f;
                y10 = 0.0f;
                x8 = 0.0f;
                measuredHeight2 = 0;
                if (!this.K2) {
                    tVar.invalidate();
                    j30Var.invalidate();
                    org.telegram.ui.Components.voip.t tVar5 = this.V2;
                    tVar5.h = false;
                    tVar5.j(false);
                    this.V2 = null;
                }
            } else {
                float x11 = (y40Var.getX() + lVar.getX()) - paddingLeft;
                y10 = ((y40Var.getY() + this.U2.getY()) + AndroidUtilities.dp(2.0f)) - paddingTop;
                x8 = x11;
            }
            measuredHeight = 1.0f;
            measuredHeight2 = 0;
            if (!this.K2) {
                tVar.invalidate();
                j30Var.invalidate();
                org.telegram.ui.Components.voip.t tVar6 = this.V2;
                tVar6.h = false;
                tVar6.j(false);
                this.V2 = null;
            }
        }
        final float f10 = y10;
        final float f11 = measuredHeight;
        k30 k30Var = this.f42518z2;
        if (z10) {
            m30 m30Var = this.f42514y2;
            m30Var.setScaleX(f11);
            m30Var.setScaleY(f11);
            m30Var.setTranslationX(x8);
            m30Var.setTranslationY(f10);
            k30Var.setAlpha(0.0f);
        }
        l30Var.N(measuredHeight2, measuredHeight2);
        if (this.f42420c2) {
            o30 o30Var = this.X1;
            if (z10) {
                o30Var.setAlpha(0.0f);
            }
            o30Var.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(220L).start();
        }
        k30Var.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(220L).start();
        if (!z10 && (tVar2 = this.V2) != null) {
            tVar2.h = false;
            tVar2.j(true);
            if (l30Var.f27451z0.k(l30Var.getCurrentItem()) != 0) {
                org.telegram.ui.Components.voip.o oVar = this.V2.f33871a;
                oVar.A = false;
                oVar.B = 0L;
                this.U2 = null;
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
        final int i10 = measuredHeight2;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                s50.q(this.f39578a, f11, x8, f10, i10, valueAnimator);
            }
        });
        this.Z2 = this.d.getNotificationCenter().setAnimationInProgress(this.Z2, new int[]{NotificationCenter.dialogPhotosLoaded, NotificationCenter.fileLoaded, NotificationCenter.messagesDidLoad});
        org.telegram.ui.Components.voip.t tVar7 = this.U2 != null ? this.V2 : null;
        if (tVar7 != null) {
            tVar7.f33880f = true;
        }
        valueAnimatorOfFloat.addListener(new androidx.fragment.app.g(this, tVar7, z10, 8));
        if (this.X2 || this.V2 == null) {
            valueAnimatorOfFloat.setInterpolator(org.telegram.ui.Components.er.f28122f);
            valueAnimatorOfFloat.setDuration(220L);
            valueAnimatorOfFloat.start();
        } else {
            valueAnimatorOfFloat.setInterpolator(org.telegram.ui.Components.er.f28122f);
            valueAnimatorOfFloat.setDuration(220L);
            this.V2.f33871a.setAnimateNextDuration(220L);
            org.telegram.ui.Components.voip.o oVar2 = this.V2.f33871a;
            if (oVar2.A) {
                oVar2.C.add(valueAnimatorOfFloat);
            } else {
                valueAnimatorOfFloat.start();
            }
        }
        S0();
    }

    public final void z1() {
        w5 w5Var = this.f42504w2;
        AndroidUtilities.cancelRunOnUIThread(w5Var);
        if (!this.f42499v2 || this.Q0 == null || VoIPService.getSharedInstance() == null || !r1() || this.M == null || !LiteMode.isEnabled(512)) {
            return;
        }
        AndroidUtilities.runOnUIThread(w5Var, 30L);
    }

    @Override
    public final void A(float f10, int i10) {
    }
}
