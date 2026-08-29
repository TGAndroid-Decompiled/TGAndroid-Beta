package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.Shader;
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
import j$.util.Collection;
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
public final class r50 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate, VoIPService.StateListener, vd.b {
    public static boolean A3;
    public static boolean B3;
    public static boolean C3;
    public static volatile DispatchQueue D3 = new DispatchQueue("updateTextureLightningQueue");
    public static boolean E3;
    public static r50 f41867z3;
    public final Paint A;
    public final ArrayList A0;
    public org.telegram.ui.Components.p30 A1;
    public LinearLayout A2;
    public final u30 B;
    public final ArrayList B0;
    public int B1;
    public boolean B2;
    public final t30 C;
    public final ArrayList C0;
    public boolean C1;
    public final org.telegram.ui.Components.xi0 C2;
    public final r30 D;
    public final ArrayList D0;
    public boolean D1;
    public int D2;
    public final ImageView E;
    public int E0;
    public final Paint E1;
    public boolean E2;
    public final ImageView F;
    public final org.telegram.ui.Components.xi0 F0;
    public final Paint F1;
    public final View F2;
    public org.telegram.ui.Components.fk0 G;
    public final org.telegram.ui.Components.xi0 G0;
    public final q50[] G1;
    public final View G2;
    public final v40 H;
    public boolean H0;
    public float H1;
    public GradientDrawable H2;
    public final org.telegram.ui.Components.o6 I;
    public final org.telegram.ui.Components.y9 I0;
    public q50 I1;
    public final int[] I2;
    public final c30 J;
    public final org.telegram.ui.Components.y9 J0;
    public q50 J1;
    public final g30 J2;
    public final n40 K;
    public float K0;
    public long K1;
    public boolean K2;
    public final l50 L;
    public float L0;
    public float L1;
    public boolean L2;
    public final x40 M;
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
    public final g50 Q0;
    public float Q1;
    public ObjectAnimator Q2;
    public final w40 R;
    public float R0;
    public int R1;
    public ObjectAnimator R2;
    public final org.telegram.ui.ActionBar.h5 S;
    public float S0;
    public boolean S1;
    public final g40 S2;
    public final f50 T;
    public ValueAnimator T0;
    public final int[] T1;
    public org.telegram.ui.Cells.c4 T2;
    public final org.telegram.ui.Components.jz U;
    public TLRPC.InputPeer U0;
    public final ArrayList U1;
    public org.telegram.ui.Components.voip.l U2;
    public final ImageReceiver V;
    public TLRPC.Chat V0;
    public final ArrayList V1;
    public org.telegram.ui.Components.voip.u V2;
    public int W;
    public ChatObject.Call W0;
    public final j30 W1;
    public org.telegram.ui.Components.n20 W2;
    public final ImageView X;
    public final boolean X0;
    public final o30 X1;
    public boolean X2;
    public final wg.h Y;
    public final String Y0;
    public final b40 Y1;
    public boolean Y2;
    public final int Z;
    public final m50 Z0;
    public float Z1;
    public int Z2;
    public final RadialProgressView f41868a0;
    public final b30 f41869a1;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout a2;
    public AnimatorSet f41870a3;
    public final l30 f41871b;
    public final Drawable f41872b0;
    public final d30 f41873b1;
    public boolean f41874b2;
    public r40 f41875b3;
    public final q20 f41876c;
    public final View f41877c0;
    public final Paint f41878c1;
    public boolean f41879c2;
    public int c3;
    public final AccountInstance d;
    public AnimatorSet f41880d0;
    public ValueAnimator f41881d1;
    public org.telegram.ui.Components.s40 f41882d2;
    public int f41883d3;
    public final w20 f41884e;
    public LaunchActivity f41885e0;
    public float f41886e1;
    public y40 f41887e2;
    public int f41888e3;
    public final org.telegram.ui.Components.voip.x2 f41889f;
    public final UndoView[] f41890f0;
    public final LinearLayout f41891f1;
    public Boolean f41892f2;
    public int f41893f3;
    public final org.telegram.ui.Cells.k f41894g0;
    public final org.telegram.ui.ActionBar.w0 f41895g1;
    public int f41896g2;
    public int f41897g3;
    public final org.telegram.ui.Components.voip.x2 h;
    public boolean f41898h0;
    public final org.telegram.ui.ActionBar.w0 f41899h1;
    public boolean f41900h2;
    public int f41901h3;
    public org.telegram.ui.Components.g40 f41902i0;
    public final org.telegram.ui.ActionBar.w0 f41903i1;
    public final f30 f41904i2;
    public int f41905i3;
    public org.telegram.ui.Components.g40 f41906j0;
    public final org.telegram.ui.ActionBar.g1 f41907j1;
    public final org.telegram.ui.Components.jl0 f41908j2;
    public int f41909j3;
    public int f41910k0;
    public final org.telegram.ui.ActionBar.g1 f41911k1;
    public final x50 f41912k2;
    public int f41913k3;
    public b50 f41914l0;
    public final org.telegram.ui.ActionBar.g1 l1;
    public final org.telegram.ui.Components.o20 f41915l2;
    public int f41916l3;
    public final ArrayList m0;
    public final org.telegram.ui.ActionBar.g1 f41917m1;
    public ViewTreeObserver.OnPreDrawListener f41918m2;
    public int f41919m3;
    public final org.telegram.ui.Components.voip.x2 f41920n;
    public m40 f41921n0;
    public final org.telegram.ui.ActionBar.g1 f41922n1;
    public final org.telegram.ui.Components.voip.h f41923n2;
    public int f41924n3;
    public boolean f41925o0;
    public final org.telegram.ui.ActionBar.g1 f41926o1;
    public boolean f41927o2;
    public int f41928o3;
    public long f41929p0;
    public final org.telegram.ui.ActionBar.g1 f41930p1;
    public final ArrayList f41931p2;
    public int f41932p3;
    public boolean f41933q0;
    public final org.telegram.ui.ActionBar.g1 f41934q1;
    public boolean f41935q2;
    public int f41936q3;
    public final org.telegram.ui.Components.voip.x2 f41937r;
    public final RectF f41938r0;
    public final org.telegram.ui.ActionBar.g1 f41939r1;
    public final d20 f41940r2;
    public int f41941r3;
    public final org.telegram.ui.Components.voip.x2 f41942s;
    public boolean f41943s0;
    public final org.telegram.ui.ActionBar.g1 f41944s1;
    public final a30 f41945s2;
    public final s40 f41946s3;
    public boolean f41947t0;
    public final org.telegram.ui.ActionBar.g1 f41948t1;
    public final org.telegram.ui.Components.g5 f41949t2;
    public Boolean f41950t3;
    public float f41951u0;
    public final org.telegram.ui.ActionBar.g1 f41952u1;
    public final d20 f41953u2;
    public Integer f41954u3;
    public final org.telegram.ui.Components.voip.x2 v;
    public d40 f41955v0;
    public final LinearLayout f41956v1;
    public boolean f41957v2;
    public final vd.a f41958v3;
    public final org.telegram.ui.Components.voip.x2 f41959w;
    public TLRPC.Peer f41960w0;
    public final TextView f41961w1;
    public final w5 f41962w2;
    public final vd.a f41963w3;
    public final x20 f41964x;
    public TLObject f41965x0;
    public final p50 f41966x1;
    public final LongSparseIntArray f41967x2;
    public final vd.c f41968x3;
    public final ImageView f41969y;
    public final Paint f41970y0;
    public final ah.i f41971y1;
    public final m30 f41972y2;
    public final vd.a f41973y3;
    public final ArrayList f41974z0;
    public d20 f41975z1;
    public final k30 f41976z2;

    public r50(final LaunchActivity launchActivity, AccountInstance accountInstance, ChatObject.Call call, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        super(launchActivity, null, true, true);
        String string;
        int i10;
        r50 r50Var;
        TLRPC.Chat chat2;
        ConferenceCall conferenceCall;
        this.A = new Paint(1);
        this.f41890f0 = new UndoView[2];
        this.m0 = new ArrayList();
        this.f41938r0 = new RectF();
        this.f41970y0 = new Paint(1);
        this.f41974z0 = new ArrayList();
        this.A0 = new ArrayList();
        this.B0 = new ArrayList();
        this.C0 = new ArrayList();
        this.D0 = new ArrayList();
        this.f41971y1 = new ah.i(new d20(this, 8));
        this.B1 = 0;
        this.C1 = false;
        this.E1 = new Paint(7);
        this.F1 = new Paint(7);
        this.G1 = new q50[8];
        this.H1 = 1.0f;
        this.S1 = true;
        this.T1 = new int[4];
        this.U1 = new ArrayList();
        this.V1 = new ArrayList();
        this.f41923n2 = new org.telegram.ui.Components.voip.h();
        this.f41931p2 = new ArrayList();
        this.f41940r2 = new d20(this, 0);
        this.f41945s2 = new a30(this);
        this.f41949t2 = new org.telegram.ui.Components.g5(24);
        this.f41953u2 = new d20(this, 1);
        this.f41957v2 = false;
        this.f41962w2 = new w5(this, 6);
        this.f41967x2 = new LongSparseIntArray();
        this.I2 = new int[2];
        this.L2 = true;
        this.P2 = new String[2];
        this.Z2 = -1;
        this.f41946s3 = new s40(this);
        org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.f29800f;
        this.f41958v3 = new vd.a(2, this, jrVar, 350L);
        this.f41963w3 = new vd.a(3, this, jrVar, 220L, true);
        this.f41968x3 = new vd.c(4, this, jrVar, 350L);
        this.f41973y3 = new vd.a(5, this, jrVar, 350L);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        setOpenNoDelay(true);
        this.d = accountInstance;
        this.W0 = call;
        this.U0 = inputPeer;
        this.V0 = chat;
        this.Y0 = str;
        this.currentAccount = accountInstance.getCurrentAccount();
        this.X0 = z10;
        this.resourcesProvider = new lh.h0();
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
        setOnDismissListener(new g20(this, 0));
        setDimBehindAlpha(75);
        l50 l50Var = new l50(this, launchActivity);
        this.L = l50Var;
        org.telegram.ui.Components.lp lpVar = new org.telegram.ui.Components.lp(true);
        int i11 = org.telegram.ui.ActionBar.g6.f23302qg;
        lpVar.b(org.telegram.ui.ActionBar.g6.u0(i11));
        lpVar.d();
        n40 n40Var = new n40(this, launchActivity, lpVar);
        this.K = n40Var;
        n40Var.setSubtitle("");
        n40Var.getSubtitleTextView().setVisibility(0);
        n40Var.l();
        n40Var.getAdditionalSubtitleTextView().setPadding(AndroidUtilities.dp(24.0f), 0, 0, 0);
        AndroidUtilities.updateViewVisibilityAnimated(n40Var.getAdditionalSubtitleTextView(), this.f41935q2, 1.0f, false);
        n40Var.getAdditionalSubtitleTextView().setTextColor(org.telegram.ui.ActionBar.g6.u0(i11));
        int i12 = org.telegram.ui.ActionBar.g6.f23215lg;
        n40Var.setSubtitleColor(org.telegram.ui.ActionBar.g6.u0(i12));
        n40Var.setBackButtonImage(R.drawable.ic_ab_back);
        n40Var.setOccupyStatusBar(false);
        n40Var.setAllowOverlayTitle(false);
        int i13 = org.telegram.ui.ActionBar.g6.f23143hg;
        n40Var.C(org.telegram.ui.ActionBar.g6.u0(i13), false);
        n40Var.B(org.telegram.ui.ActionBar.g6.u0(org.telegram.ui.ActionBar.g6.f23452z8), false);
        n40Var.setTitleColor(org.telegram.ui.ActionBar.g6.u0(i13));
        n40Var.setSubtitleColor(org.telegram.ui.ActionBar.g6.u0(i12));
        n40Var.setActionBarMenuOnItemClick(new u40(this, launchActivity));
        TLRPC.InputPeer groupCallPeer = inputPeer != null ? inputPeer : VoIPService.getSharedInstance().getGroupCallPeer();
        if (groupCallPeer == null) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            this.f41960w0 = tL_peerUser;
            tL_peerUser.user_id = accountInstance.getUserConfig().getClientUserId();
        } else if (groupCallPeer instanceof TLRPC.TL_inputPeerChannel) {
            TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
            this.f41960w0 = tL_peerChannel;
            tL_peerChannel.channel_id = groupCallPeer.channel_id;
        } else if (groupCallPeer instanceof TLRPC.TL_inputPeerUser) {
            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
            this.f41960w0 = tL_peerUser2;
            tL_peerUser2.user_id = groupCallPeer.user_id;
        } else if (groupCallPeer instanceof TLRPC.TL_inputPeerChat) {
            TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
            this.f41960w0 = tL_peerChat;
            tL_peerChat.chat_id = groupCallPeer.chat_id;
        }
        VoIPService.audioLevelsCallback = new a20(this, 3);
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
        this.f41872b0 = launchActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        int i14 = R.raw.voip_filled;
        org.telegram.ui.Components.xi0 xi0Var = new org.telegram.ui.Components.xi0(i14, "" + R.raw.voip_filled, AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f), true, null);
        this.F0 = xi0Var;
        int i15 = R.raw.hand_2;
        this.G0 = new org.telegram.ui.Components.xi0(i15, "" + R.raw.hand_2, AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f), true, null);
        v40 v40Var = new v40(this, launchActivity);
        this.H = v40Var;
        this.containerView = v40Var;
        v40Var.setClipToPadding(false);
        this.containerView.setFocusable(true);
        this.containerView.setFocusableInTouchMode(true);
        this.containerView.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i16 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i16, 0, i16, 0);
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
            this.containerView.addView(h5Var, i7.f6.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 311.0f));
            w40 w40Var = new w40(this, launchActivity);
            this.R = w40Var;
            w40Var.setGravity(17);
            w40Var.setTextColor(-1);
            w40Var.setTypeface(AndroidUtilities.bold());
            w40Var.setTextSize(60);
            this.containerView.addView(w40Var, i7.f6.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 231.0f));
            org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(launchActivity);
            this.S = h5Var2;
            h5Var2.setGravity(17);
            h5Var2.setTextColor(-1);
            h5Var2.setTypeface(AndroidUtilities.bold());
            h5Var2.setTextSize(18);
            this.containerView.addView(h5Var2, i7.f6.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 201.0f));
        }
        if (r1()) {
            g50 g50Var = new g50(this, launchActivity);
            this.Q0 = g50Var;
            this.containerView.addView(g50Var, i7.f6.d(-1, 80.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
        }
        x40 x40Var = new x40(this, launchActivity);
        this.M = x40Var;
        x40Var.setClipToPadding(false);
        x40Var.setClipChildren(false);
        f50 f50Var = new f50(this);
        this.T = f50Var;
        f50Var.f6404o = jrVar;
        f50Var.d = 350L;
        f50Var.f6486c = 350L;
        f50Var.f6487e = 350L;
        f50Var.S();
        x40Var.setItemAnimator(f50Var);
        x40Var.setOnScrollListener(new p20(this));
        x40Var.setVerticalScrollBarEnabled(false);
        getContext();
        org.telegram.ui.Components.jz jzVar = new org.telegram.ui.Components.jz(B3 ? 6 : 2, x40Var);
        this.U = jzVar;
        x40Var.setLayoutManager(jzVar);
        q20 q20Var = new q20(this);
        this.f41876c = q20Var;
        jzVar.z1(q20Var);
        x40Var.i(new r20(this));
        jzVar.C1();
        this.containerView.addView(x40Var, i7.f6.d(-1, -1.0f, 51, 14.0f, 14.0f, 14.0f, 231.0f));
        x40Var.setAdapter(l50Var);
        x40Var.setTopBottomSelectorRadius(13);
        x40Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.g6.u0(org.telegram.ui.ActionBar.g6.f23090eg));
        x40Var.setOnItemClickListener(new z6(this, launchActivity, call, 14));
        x40Var.setOnItemLongClickListener(new a20(this, 4));
        if (r1()) {
            p50 p50Var = new p50(this, getContext());
            this.f41966x1 = p50Var;
            this.containerView.addView(p50Var, i7.f6.d(-1, 0.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        org.telegram.ui.Components.jl0 jl0Var = new org.telegram.ui.Components.jl0(launchActivity);
        this.f41908j2 = jl0Var;
        this.containerView.addView(jl0Var, i7.f6.d(-1, -1.0f, 51, 14.0f, 14.0f, 324.0f, 14.0f));
        x50 x50Var = new x50(call, this.currentAccount, this);
        this.f41912k2 = x50Var;
        jl0Var.setAdapter(x50Var);
        f2.w wVar = new f2.w(6, false);
        jl0Var.setLayoutManager(wVar);
        wVar.z1(new t20(this));
        jl0Var.setOnItemClickListener(new org.telegram.ui.Components.zk0(this) {
            public final r50 f36970b;

            {
                this.f36970b = this;
            }

            @Override
            public final void c(int i17, View view) {
                switch (r2) {
                    case 0:
                        r50 r50Var2 = this.f36970b;
                        r50Var2.getClass();
                        org.telegram.ui.Components.n20 n20Var = (org.telegram.ui.Components.n20) view;
                        if (n20Var.getVideoParticipant() == null) {
                            r50Var2.e1(new ChatObject.VideoParticipant(n20Var.getParticipant(), false, false));
                            return;
                        } else {
                            r50Var2.e1(n20Var.getVideoParticipant());
                            return;
                        }
                    default:
                        r50 r50Var3 = this.f36970b;
                        r50Var3.getClass();
                        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) view;
                        if (lVar.getParticipant() != null) {
                            r50Var3.e1(lVar.getParticipant());
                            return;
                        }
                        return;
                }
            }
        });
        f2.l lVar = new f2.l();
        lVar.S();
        lVar.f6404o = jrVar;
        lVar.d = 350L;
        lVar.f6486c = 350L;
        lVar.f6487e = 350L;
        jl0Var.setItemAnimator(new u20(this));
        jl0Var.setOnScrollListener(new v20(this));
        x50Var.H(jl0Var, false, false);
        jl0Var.setVisibility(8);
        w20 w20Var = new w20(this, launchActivity);
        this.f41884e = w20Var;
        int u02 = org.telegram.ui.ActionBar.g6.u0(org.telegram.ui.ActionBar.g6.Jg);
        int red = Color.red(u02);
        int green = Color.green(u02);
        int blue = Color.blue(u02);
        this.O0 = new Matrix();
        this.N0 = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(72.72727f), new int[]{Color.argb(50, red, green, blue), Color.argb(0, red, green, blue)}, (float[]) null, Shader.TileMode.CLAMP);
        Paint paint = new Paint(1);
        this.P0 = paint;
        paint.setShader(this.N0);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(9);
        this.I0 = y9Var;
        org.telegram.ui.Components.y9 y9Var2 = new org.telegram.ui.Components.y9(12);
        this.J0 = y9Var2;
        y9Var.f34975a = AndroidUtilities.dp(62.0f) * 0.45454547f;
        y9Var.f34976b = AndroidUtilities.dp(72.0f) * 0.45454547f;
        y9Var.b();
        y9Var2.f34975a = AndroidUtilities.dp(65.0f) * 0.45454547f;
        y9Var2.f34976b = AndroidUtilities.dp(75.0f) * 0.45454547f;
        y9Var2.b();
        int i17 = org.telegram.ui.ActionBar.g6.Ig;
        y9Var.d.setColor(i0.a.k(org.telegram.ui.ActionBar.g6.u0(i17), 38));
        y9Var2.d.setColor(i0.a.k(org.telegram.ui.ActionBar.g6.u0(i17), 76));
        org.telegram.ui.Components.voip.x2 x2Var = new org.telegram.ui.Components.voip.x2(launchActivity, 50.0f);
        this.f41937r = x2Var;
        x2Var.setCheckable(true);
        x2Var.setTextSize(12);
        w20Var.a(x2Var);
        x2Var.setOnClickListener(new b20(this, 7));
        org.telegram.ui.Components.voip.x2 x2Var2 = new org.telegram.ui.Components.voip.x2(launchActivity, 50.0f);
        this.f41920n = x2Var2;
        x2Var2.setCheckable(true);
        x2Var2.setTextSize(12);
        x2Var2.d(false, false);
        x2Var2.setCrossOffset(-AndroidUtilities.dpf2(3.5f));
        x2Var2.c(R.drawable.calls_video, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipCamera), false, false);
        org.telegram.ui.Components.voip.x2 x2Var3 = new org.telegram.ui.Components.voip.x2(launchActivity, 50.0f);
        this.f41889f = x2Var3;
        x2Var3.setCheckable(true);
        x2Var3.setTextSize(12);
        x2Var3.d(false, false);
        org.telegram.ui.Components.aj0 aj0Var = new org.telegram.ui.Components.aj0(launchActivity);
        x2Var3.addView(aj0Var, i7.f6.d(32, 32.0f, 1, 0.0f, 10.0f, 0.0f, 0.0f));
        int i18 = R.raw.camera_flip;
        org.telegram.ui.Components.xi0 xi0Var2 = new org.telegram.ui.Components.xi0(i18, "" + R.raw.camera_flip, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        this.C2 = xi0Var2;
        aj0Var.setAnimation(xi0Var2);
        x2Var3.setOnClickListener(new b20(this, 10));
        w20Var.a(x2Var3);
        org.telegram.ui.Components.voip.x2 x2Var4 = new org.telegram.ui.Components.voip.x2(launchActivity, 50.0f);
        this.h = x2Var4;
        x2Var4.setCheckable(true);
        x2Var4.setTextSize(12);
        x2Var4.d(false, false);
        ImageView imageView = new ImageView(launchActivity);
        this.X = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        int i19 = R.drawable.filled_sound_on;
        this.W = i19;
        imageView.setImageResource(i19);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setScaleX(1.11f);
        imageView.setScaleY(1.11f);
        x2Var4.addView(imageView, i7.f6.d(30, 30.0f, 1, 0.0f, 11.0f, 0.0f, 0.0f));
        x2Var4.setOnClickListener(new b20(this, 11));
        w20Var.a(x2Var4);
        w20Var.a(x2Var2);
        org.telegram.ui.Components.voip.x2 x2Var5 = new org.telegram.ui.Components.voip.x2(launchActivity, 50.0f);
        this.f41942s = x2Var5;
        x2Var5.setTextSize(12);
        x2Var5.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.g6.u0(org.telegram.ui.ActionBar.g6.Dg), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
        x2Var5.setOnClickListener(new View.OnClickListener(this) {
            public final r50 f37964b;

            {
                this.f37964b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        r50.o(this.f37964b, launchActivity);
                        return;
                    default:
                        r50 r50Var2 = this.f37964b;
                        r50Var2.W1.e();
                        ChatObject.Call call2 = r50Var2.W0;
                        if (call2 != null && !call2.isScheduled()) {
                            r50Var2.I1();
                            r50.t1(launchActivity, new d20(r50Var2, 5), false, false);
                            return;
                        }
                        r50Var2.dismiss();
                        return;
                }
            }
        });
        org.telegram.ui.Components.voip.x2 x2Var6 = new org.telegram.ui.Components.voip.x2(launchActivity, 50.0f);
        this.v = x2Var6;
        x2Var6.setCheckable(true);
        x2Var6.b(true, false);
        x2Var6.setTextSize(12);
        x2Var6.c(R.drawable.filled_voice_comment_32, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipMessage), false, false);
        x20 x20Var = new x20(this, launchActivity);
        this.f41964x = x20Var;
        x20Var.setAnimation(xi0Var);
        x20Var.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.Components.voip.x2 x2Var7 = new org.telegram.ui.Components.voip.x2(launchActivity, 50.0f);
        this.f41959w = x2Var7;
        x2Var7.setDrawBackground(false);
        x2Var7.setTextSize(12);
        x2Var7.c(0, 0, 0, 1.0f, true, "Text", false, false);
        x2Var7.addView(x20Var, i7.f6.e(50, 50, 49));
        w20Var.a(x2Var7);
        x2Var7.setOnClickListener(new z20(this));
        w20Var.a(x2Var6);
        w20Var.a(x2Var5);
        ImageView imageView2 = new ImageView(launchActivity);
        this.f41969y = imageView2;
        imageView2.setVisibility(8);
        imageView2.setImageResource(R.drawable.voice_expand);
        x2Var7.addView(imageView2, i7.f6.d(24, 24.0f, 49, 0.0f, 13.0f, 0.0f, 0.0f));
        if (this.W0 != null && r1() && !this.W0.isScheduled()) {
            imageView2.setVisibility(0);
            x20Var.setVisibility(8);
        }
        RadialProgressView radialProgressView = new RadialProgressView(launchActivity);
        this.f41868a0 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(50.0f));
        radialProgressView.setStrokeWidth(2.0f);
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.g6.u0(org.telegram.ui.ActionBar.g6.Og));
        n40Var.setAlpha(0.0f);
        n40Var.getBackButton().setScaleX(0.9f);
        n40Var.getBackButton().setScaleY(0.9f);
        n40Var.getBackButton().setTranslationX(-AndroidUtilities.dp(14.0f));
        n40Var.getTitleTextView().setTranslationY(AndroidUtilities.dp(23.0f));
        n40Var.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        n40Var.getAdditionalSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(launchActivity, (org.telegram.ui.ActionBar.a0) null, 0, org.telegram.ui.ActionBar.g6.u0(i13));
        this.f41895g1 = w0Var;
        w0Var.setLongClickEnabled(false);
        w0Var.setIcon(R.drawable.ic_ab_other);
        w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        w0Var.setSubMenuOpenSide(2);
        w0Var.setDelegate(new a20(this, 0));
        int i20 = org.telegram.ui.ActionBar.g6.f23161ig;
        w0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.e0(org.telegram.ui.ActionBar.g6.u0(i20), 6));
        w0Var.setOnClickListener(new b20(this, 0));
        w0Var.G(org.telegram.ui.ActionBar.g6.u0(i13), false);
        w0Var.G(org.telegram.ui.ActionBar.g6.u0(i13), true);
        org.telegram.ui.ActionBar.w0 w0Var2 = new org.telegram.ui.ActionBar.w0(launchActivity, (org.telegram.ui.ActionBar.a0) null, 0, org.telegram.ui.ActionBar.g6.u0(i13));
        this.f41899h1 = w0Var2;
        w0Var2.setLongClickEnabled(false);
        w0Var2.setIcon(R.drawable.msg_voice_pip);
        w0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        w0Var2.setBackground(org.telegram.ui.ActionBar.g6.e0(org.telegram.ui.ActionBar.g6.u0(i20), 6));
        w0Var2.setOnClickListener(new b20(this, 1));
        org.telegram.ui.ActionBar.w0 w0Var3 = new org.telegram.ui.ActionBar.w0(launchActivity, (org.telegram.ui.ActionBar.a0) null, 0, org.telegram.ui.ActionBar.g6.u0(i13));
        this.f41903i1 = w0Var3;
        w0Var3.setLongClickEnabled(false);
        w0Var3.setIcon(R.drawable.msg_screencast);
        w0Var3.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        w0Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.e0(org.telegram.ui.ActionBar.g6.u0(i20), 6));
        w0Var3.setOnClickListener(new b20(this, 2));
        b30 b30Var = new b30(this, launchActivity, launchActivity);
        this.f41869a1 = b30Var;
        c30 c30Var = new c30(launchActivity);
        this.J = c30Var;
        c30Var.setAlpha(0.0f);
        Paint paint2 = new Paint(1);
        this.f41878c1 = paint2;
        paint2.setColor(-12761513);
        d30 d30Var = new d30(this, getContext());
        this.f41873b1 = d30Var;
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
        this.f41891f1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.addView(b30Var, i7.f6.l(1.0f, 0, -2));
        linearLayout.addView(d30Var, i7.f6.k(6.0f, 4.0f, 0.0f, 0.0f, -2, 18));
        this.containerView.addView(c30Var, i7.f6.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.containerView.addView(linearLayout, i7.f6.d(-2, -2.0f, 51, 23.0f, 0.0f, 48.0f, 0.0f));
        this.containerView.addView(n40Var, i7.f6.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(launchActivity);
        this.f41956v1 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.addView(w0Var3, i7.f6.n(48, 48));
        linearLayout2.addView(w0Var2, i7.f6.n(48, 48));
        linearLayout2.addView(w0Var, i7.f6.n(48, 48));
        this.containerView.addView(linearLayout2, i7.f6.e(-2, 48, 53));
        View view = new View(launchActivity);
        this.f41877c0 = view;
        view.setAlpha(0.0f);
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.u0(org.telegram.ui.ActionBar.g6.V5));
        this.containerView.addView(view, i7.f6.c(1.0f, -1));
        for (int i21 = 0; i21 < 2; i21++) {
            this.f41890f0[i21] = new e30(this, launchActivity);
            this.f41890f0[i21].setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            this.f41890f0[i21].setTranslationZ(AndroidUtilities.dp(5.0f));
            this.containerView.addView(this.f41890f0[i21], i7.f6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        org.telegram.ui.Cells.k kVar = new org.telegram.ui.Cells.k(launchActivity, true);
        this.f41894g0 = kVar;
        kVar.setTag(R.id.fit_width_tag, 240);
        this.f41895g1.h(kVar, AndroidUtilities.dp(48.0f));
        this.f41895g1.setShowSubmenuByMove(false);
        int i22 = org.telegram.ui.ActionBar.g6.f23090eg;
        kVar.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.u0(i22), 6, 6));
        org.telegram.ui.ActionBar.w0 w0Var4 = this.f41895g1;
        org.telegram.ui.ActionBar.g1 d = w0Var4.d(1, 0, null, LocaleController.getString(R.string.VoipGroupAllCanSpeak), true, true, w0Var4.f23926i0);
        this.f41934q1 = d;
        d.j(true, false);
        org.telegram.ui.ActionBar.w0 w0Var5 = this.f41895g1;
        org.telegram.ui.ActionBar.g1 d10 = w0Var5.d(2, 0, null, LocaleController.getString(R.string.VoipGroupOnlyAdminsCanSpeak), true, true, w0Var5.f23926i0);
        this.f41939r1 = d10;
        d10.j(false, true);
        int i23 = org.telegram.ui.ActionBar.g6.f23411wg;
        d.setCheckColor(i23);
        d.c(org.telegram.ui.ActionBar.g6.u0(i23), org.telegram.ui.ActionBar.g6.u0(i23));
        d10.setCheckColor(i23);
        d10.c(org.telegram.ui.ActionBar.g6.u0(i23), org.telegram.ui.ActionBar.g6.u0(i23));
        Paint paint3 = new Paint(1);
        int i24 = org.telegram.ui.ActionBar.g6.f23143hg;
        paint3.setColor(org.telegram.ui.ActionBar.g6.u0(i24));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(AndroidUtilities.dp(1.5f));
        paint3.setStrokeCap(Paint.Cap.ROUND);
        org.telegram.ui.ActionBar.w0 w0Var6 = this.f41895g1;
        org.telegram.ui.ActionBar.g1 d11 = w0Var6.d(10, R.drawable.msg_voice_speaker, null, LocaleController.getString(R.string.VoipGroupAudio), true, false, w0Var6.f23926i0);
        this.l1 = d11;
        d11.setItemHeight(56);
        org.telegram.ui.ActionBar.w0 w0Var7 = this.f41895g1;
        org.telegram.ui.ActionBar.g1 d12 = w0Var7.d(11, R.drawable.msg_noise_on, null, LocaleController.getString(R.string.VoipNoiseCancellation), true, false, w0Var7.f23926i0);
        this.f41917m1 = d12;
        d12.setItemHeight(56);
        TextView b10 = this.f41895g1.b(i0.a.d(0.3f, org.telegram.ui.ActionBar.g6.u0(org.telegram.ui.ActionBar.g6.f23126gg), -16777216));
        this.f41961w1 = b10;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).topMargin = 0;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).bottomMargin = 0;
        org.telegram.ui.ActionBar.w0 w0Var8 = this.f41895g1;
        org.telegram.ui.ActionBar.g1 d13 = w0Var8.d(6, R.drawable.msg_edit, this.Z0, LocaleController.getString(ChatObject.isChannelOrGiga(this.V0) ? R.string.VoipChannelEditTitle : R.string.VoipGroupEditTitle), true, false, w0Var8.f23926i0);
        this.f41911k1 = d13;
        org.telegram.ui.ActionBar.w0 w0Var9 = this.f41895g1;
        org.telegram.ui.ActionBar.g1 d14 = w0Var9.d(7, R.drawable.msg_permissions, this.Z0, LocaleController.getString(R.string.VoipGroupEditPermissions), false, false, w0Var9.f23926i0);
        this.f41922n1 = d14;
        org.telegram.ui.ActionBar.g1 e10 = this.f41895g1.e(3, R.drawable.msg_link, LocaleController.getString(R.string.VoipGroupShareInviteLink));
        this.f41907j1 = e10;
        m50 m50Var = new m50();
        this.Z0 = m50Var;
        org.telegram.ui.ActionBar.g1 e11 = this.f41895g1.e(9, R.drawable.msg_screencast, LocaleController.getString(R.string.VoipChatStartScreenCapture));
        this.f41930p1 = e11;
        org.telegram.ui.ActionBar.w0 w0Var10 = this.f41895g1;
        org.telegram.ui.ActionBar.g1 d15 = w0Var10.d(5, 0, m50Var, LocaleController.getString(R.string.VoipGroupRecordCall), true, false, w0Var10.f23926i0);
        this.f41926o1 = d15;
        m50Var.a(d15.getImageView());
        org.telegram.ui.ActionBar.g1 e12 = this.f41895g1.e(12, R.drawable.menu_stream_comments_24, LocaleController.getString(R.string.VoipChannelEnableComments));
        this.f41948t1 = e12;
        TLRPC.InputPeer inputPeer2 = groupCallPeer;
        org.telegram.ui.ActionBar.g1 e13 = this.f41895g1.e(13, R.drawable._menu_stream_comments_off_24, LocaleController.getString(R.string.VoipChannelDisableComments));
        this.f41952u1 = e13;
        org.telegram.ui.ActionBar.w0 w0Var11 = this.f41895g1;
        int i25 = R.drawable.msg_cancel;
        if (o1()) {
            i10 = i24;
            string = LocaleController.getString(R.string.VoipGroupEndConference);
        } else {
            string = LocaleController.getString(ChatObject.isChannelOrGiga(this.V0) ? R.string.VoipChannelEndChat : R.string.VoipGroupEndChat);
            i10 = i24;
        }
        org.telegram.ui.ActionBar.g1 e14 = w0Var11.e(4, i25, string);
        this.f41944s1 = e14;
        this.f41895g1.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.g6.u0(i22));
        this.f41895g1.getPopupLayout().setFitItems(true);
        e12.c(org.telegram.ui.ActionBar.g6.u0(i10), org.telegram.ui.ActionBar.g6.u0(i10));
        e13.c(org.telegram.ui.ActionBar.g6.u0(i10), org.telegram.ui.ActionBar.g6.u0(i10));
        d11.c(org.telegram.ui.ActionBar.g6.u0(i10), org.telegram.ui.ActionBar.g6.u0(i10));
        d12.c(org.telegram.ui.ActionBar.g6.u0(i10), org.telegram.ui.ActionBar.g6.u0(i10));
        int i26 = org.telegram.ui.ActionBar.g6.f23393vg;
        e14.c(org.telegram.ui.ActionBar.g6.u0(i26), org.telegram.ui.ActionBar.g6.u0(i26));
        e10.c(org.telegram.ui.ActionBar.g6.u0(i10), org.telegram.ui.ActionBar.g6.u0(i10));
        d13.c(org.telegram.ui.ActionBar.g6.u0(i10), org.telegram.ui.ActionBar.g6.u0(i10));
        d14.c(org.telegram.ui.ActionBar.g6.u0(i10), org.telegram.ui.ActionBar.g6.u0(i10));
        d15.c(org.telegram.ui.ActionBar.g6.u0(i10), org.telegram.ui.ActionBar.g6.u0(i10));
        e11.c(org.telegram.ui.ActionBar.g6.u0(i10), org.telegram.ui.ActionBar.g6.u0(i10));
        if (this.W0 != null) {
            l1();
        }
        if (o1()) {
            this.f41914l0 = new b50();
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            this.f41914l0.b((sharedInstance == null || (conferenceCall = sharedInstance.conference) == null) ? null : conferenceCall.getEmojis());
        }
        P1(false);
        this.K.getTitleTextView().setOnClickListener(new b20(this, 3));
        f30 f30Var = new f30(this, launchActivity);
        this.f41904i2 = f30Var;
        g30 g30Var = new g30(this);
        this.J2 = g30Var;
        f30Var.setClipToPadding(false);
        g30Var.S();
        g30Var.f6404o = org.telegram.ui.Components.jr.f29800f;
        g30Var.d = 350L;
        g30Var.f6486c = 350L;
        g30Var.f6487e = 350L;
        f30Var.setItemAnimator(g30Var);
        f30Var.setOnScrollListener(new h30(this));
        f30Var.setClipChildren(false);
        f2.j0 j0Var = new f2.j0();
        j0Var.j1(0);
        f30Var.setLayoutManager(j0Var);
        org.telegram.ui.Components.o20 o20Var = new org.telegram.ui.Components.o20(call, this.currentAccount, this);
        this.f41915l2 = o20Var;
        f30Var.setAdapter(o20Var);
        o20Var.F(f30Var, false);
        f30Var.setOnItemClickListener(new org.telegram.ui.Components.zk0(this) {
            public final r50 f36970b;

            {
                this.f36970b = this;
            }

            @Override
            public final void c(int i172, View view2) {
                switch (r2) {
                    case 0:
                        r50 r50Var2 = this.f36970b;
                        r50Var2.getClass();
                        org.telegram.ui.Components.n20 n20Var = (org.telegram.ui.Components.n20) view2;
                        if (n20Var.getVideoParticipant() == null) {
                            r50Var2.e1(new ChatObject.VideoParticipant(n20Var.getParticipant(), false, false));
                            return;
                        } else {
                            r50Var2.e1(n20Var.getVideoParticipant());
                            return;
                        }
                    default:
                        r50 r50Var3 = this.f36970b;
                        r50Var3.getClass();
                        org.telegram.ui.Components.voip.l lVar2 = (org.telegram.ui.Components.voip.l) view2;
                        if (lVar2.getParticipant() != null) {
                            r50Var3.e1(lVar2.getParticipant());
                            return;
                        }
                        return;
                }
            }
        });
        f30Var.setOnItemLongClickListener(new a20(this, 1));
        f30Var.setVisibility(8);
        f30Var.i(new i30());
        j30 j30Var = new j30(this, launchActivity, this.M, f30Var, this.U1, this.W0, this);
        this.W1 = j30Var;
        j30Var.setClipChildren(false);
        o20Var.E(this.U1, j30Var);
        if (this.f41908j2 != null) {
            this.f41912k2.G(this.U1, j30Var);
        }
        k30 k30Var = new k30(this, launchActivity);
        this.f41976z2 = k30Var;
        l30 l30Var = new l30(this, launchActivity, this.K, this.M, k30Var);
        this.f41871b = l30Var;
        l30Var.setImagesLayerNum(Integer.MAX_VALUE);
        l30Var.setInvalidateWithParent(true);
        k30Var.setProfileGalleryView(l30Var);
        m30 m30Var = new m30(this, launchActivity);
        this.f41972y2 = m30Var;
        m30Var.setVisibility(8);
        l30Var.setVisibility(0);
        l30Var.b(new n30(this));
        o30 o30Var = new o30(this, launchActivity);
        this.X1 = o30Var;
        this.containerView.addView(j30Var);
        j30Var.addView(f30Var, i7.f6.d(-1, 80.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        this.f41884e.setWillNotDraw(false);
        View view2 = new View(launchActivity);
        this.F2 = view2;
        int[] iArr = this.I2;
        iArr[0] = this.R1;
        iArr[1] = 0;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, this.I2);
        this.H2 = gradientDrawable;
        view2.setBackground(gradientDrawable);
        this.containerView.addView(view2, i7.f6.e(-1, 60, 83));
        View view3 = new View(launchActivity);
        this.G2 = view3;
        view3.setBackgroundColor(this.I2[0]);
        this.containerView.addView(view3, i7.f6.e(-1, 0, 83));
        wg.h hVar = new wg.h(launchActivity);
        this.Y = hVar;
        hVar.setDelegate(new p30(this));
        hVar.setClickCellDelegate(new q30(this));
        if (this.W0 != null) {
            hVar.C0(this.d.getCurrentAccount(), this.W0.getInputGroupCall(false));
        }
        this.containerView.addView(hVar, i7.f6.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(launchActivity, false, true, true);
        this.I = o6Var;
        o6Var.setGravity(17);
        o6Var.setTextSize(AndroidUtilities.dp(15.0f));
        o6Var.setTextColor(-1);
        o6Var.b(0.4f, 320L, org.telegram.ui.Components.jr.h);
        o6Var.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(this.f41884e);
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
        this.containerView.addView(t30Var, i7.f6.c(-1.0f, -1));
        u30 u30Var = new u30(launchActivity);
        this.B = u30Var;
        u30Var.addView(r30Var, i7.f6.d(-1, -2.0f, 80, 0.0f, 0.0f, 48.0f, 0.0f));
        u30Var.addView(o6Var, i7.f6.d(52, 16.0f, 85, 0.0f, 0.0f, 0.0f, 32.0f));
        o6Var.setTranslationY(-AndroidUtilities.dp(20.0f));
        this.containerView.addView(u30Var, i7.f6.e(-1, -2, 80));
        ImageView imageView3 = new ImageView(launchActivity);
        this.F = imageView3;
        int i27 = org.telegram.ui.ActionBar.g6.f23152i6;
        imageView3.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(i27), 1, -1));
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23100f7, this.resourcesProvider);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView3.setColorFilter(new PorterDuffColorFilter(v02, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.arrow_more);
        imageView3.setOnClickListener(new b20(this, 4));
        ImageView imageView4 = new ImageView(launchActivity);
        this.E = imageView4;
        imageView4.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(i27), 1, -1));
        imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23383v6, this.resourcesProvider), mode));
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_send);
        imageView4.setOnClickListener(new b20(this, 5));
        u30Var.addView(imageView3, i7.f6.e(48, 48, 85));
        u30Var.addView(imageView4, i7.f6.e(48, 48, 85));
        this.containerView.addView(o30Var);
        m30Var.addView(l30Var, i7.f6.c(-1.0f, -1));
        m30Var.addView(k30Var, i7.f6.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.containerView.addView(m30Var, i7.f6.d(-1, -1.0f, 0, 14.0f, 14.0f, 14.0f, 14.0f));
        O0(false);
        this.L.l();
        if (C3) {
            this.f41912k2.I(this.f41908j2, false);
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
            this.containerView.addView(textView, i7.f6.d(-2, -2.0f, 81, 21.0f, 0.0f, 21.0f, 100.0f));
            org.telegram.ui.Components.qc0 qc0Var = new org.telegram.ui.Components.qc0(launchActivity);
            qc0Var.setTextColor(-1);
            qc0Var.setSelectorColor(-9598483);
            qc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
            qc0Var.setItemCount(5);
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
            this.containerView.addView(y30Var, i7.f6.d(-1, 48.0f, 81, 21.0f, 0.0f, 21.0f, 20.5f));
            y30Var.setOnClickListener(new org.telegram.messenger.video.f(this, qc0Var, w30Var, x30Var, chat, accountInstance, inputPeer2, 1));
            a40 a40Var = new a40(launchActivity, qc0Var, w30Var, x30Var);
            this.N = a40Var;
            a40Var.setWeightSum(1.0f);
            a40Var.setOrientation(0);
            this.containerView.addView(a40Var, i7.f6.d(-1, 270.0f, 51, 0.0f, 50.0f, 0.0f, 0.0f));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i28 = calendar.get(1);
            int i29 = calendar.get(6);
            a40Var.addView(qc0Var, i7.f6.l(0.5f, 0, 270));
            qc0Var.setMinValue(0);
            qc0Var.setMaxValue(365);
            qc0Var.setWrapSelectorWheel(false);
            qc0Var.setFormatter(new eg.d(currentTimeMillis, calendar, i28, 1));
            a1.d dVar = new a1.d(this, qc0Var, w30Var, x30Var, 12);
            r50Var = this;
            qc0Var.setOnValueChangedListener(dVar);
            w30Var.setMinValue(0);
            w30Var.setMaxValue(23);
            a40Var.addView(w30Var, i7.f6.l(0.2f, 0, 270));
            w30Var.setFormatter(new org.telegram.ui.Components.xo0(17));
            w30Var.setOnValueChangedListener(dVar);
            x30Var.setMinValue(0);
            x30Var.setMaxValue(59);
            x30Var.setValue(0);
            x30Var.setFormatter(new org.telegram.ui.Components.xo0(18));
            a40Var.addView(x30Var, i7.f6.l(0.3f, 0, 270));
            x30Var.setOnValueChangedListener(dVar);
            calendar.setTimeInMillis(currentTimeMillis + 10800000);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            int i30 = calendar.get(6);
            int i31 = calendar.get(12);
            int i32 = calendar.get(11);
            qc0Var.setValue(i29 != i30 ? 1 : 0);
            x30Var.setValue(i31);
            w30Var.setValue(i32);
            org.telegram.ui.Components.c5.g(y30Var, textView, 0L, 604800L, 2, qc0Var, w30Var, x30Var);
        } else {
            r50Var = this;
        }
        b40 b40Var = new b40(r50Var, (ViewGroup) r50Var.getWindow().getDecorView(), r50Var.containerView);
        r50Var.Y1 = b40Var;
        b40Var.E = new c40(r50Var);
        l30Var.setPinchToZoomHelper(b40Var);
        r50Var.f41920n.setOnClickListener(new View.OnClickListener(r50Var) {
            public final r50 f37964b;

            {
                this.f37964b = r50Var;
            }

            @Override
            public final void onClick(View view4) {
                switch (r3) {
                    case 0:
                        r50.o(this.f37964b, launchActivity);
                        return;
                    default:
                        r50 r50Var2 = this.f37964b;
                        r50Var2.W1.e();
                        ChatObject.Call call2 = r50Var2.W0;
                        if (call2 != null && !call2.isScheduled()) {
                            r50Var2.I1();
                            r50.t1(launchActivity, new d20(r50Var2, 5), false, false);
                            return;
                        }
                        r50Var2.dismiss();
                        return;
                }
            }
        });
        r50Var.L1(false);
        r50Var.I1();
        r50Var.M1(false);
        r50Var.N1(false, false);
        r50Var.B1(0.0f);
        r50Var.O1();
        r50Var.containerView.addView(new FrameLayout(launchActivity), i7.f6.e(-1, 200, 87));
        r50Var.v.setOnClickListener(new b20(r50Var, 6));
        r50Var.T0();
        i7.h6.a(r50Var.f41920n);
        i7.h6.a(r50Var.f41937r);
        i7.h6.a(r50Var.f41889f);
        i7.h6.a(r50Var.h);
        i7.h6.a(r50Var.f41959w);
        i7.h6.a(r50Var.f41942s);
        i7.h6.a(r50Var.v);
        r0.j0.m(r50Var.containerView, new a20(r50Var, 2));
    }

    public static r0.m1 A(r50 r50Var, r0.m1 m1Var) {
        int keyboardHeight;
        r0.j1 j1Var = m1Var.f46843a;
        i0.b f9 = j1Var.f(647);
        i0.b f10 = j1Var.f(8);
        r30 r30Var = r50Var.D;
        if (!r30Var.J && !r30Var.f26885e) {
            keyboardHeight = 0;
        } else {
            keyboardHeight = r30Var.getKeyboardHeight();
        }
        int max = Math.max(f10.d, keyboardHeight);
        ViewGroup.LayoutParams layoutParams = r50Var.X1.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = -f9.d;
        }
        if (r30Var.getEmojiView() != null) {
            r30Var.getEmojiView().setBottomInset(f9.d);
        }
        if (r50Var.O2) {
            ViewGroup viewGroup = r50Var.containerView;
            int i10 = r50Var.backgroundPaddingLeft;
            viewGroup.setPadding(i10, 0, i10, 0);
        } else {
            ViewGroup viewGroup2 = r50Var.containerView;
            int i11 = r50Var.backgroundPaddingLeft;
            viewGroup2.setPadding(f9.f8186a + i11, f9.f8187b, i11 + f9.f8188c, f9.d);
        }
        r50Var.containerView.requestLayout();
        if (max == 0 && !r30Var.J && !r30Var.f26885e && !r30Var.K) {
            r30Var.j();
        }
        if (max > 0) {
            org.telegram.ui.Components.fk0 fk0Var = r50Var.G;
            if (fk0Var == null) {
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                fk0Var = null;
                if (R != null) {
                    org.telegram.ui.Components.fk0 fk0Var2 = new org.telegram.ui.Components.fk0(1, r50Var.currentAccount, r50Var.getContext(), R, r50Var.resourcesProvider);
                    r50Var.G = fk0Var2;
                    fk0Var2.setDelegate(new t40(r50Var));
                    r50Var.containerView.addView(r50Var.G, i7.f6.e(-2, 52, 81));
                    r50Var.G.p(null, null, false);
                    r50Var.C.bringToFront();
                    r50Var.B.bringToFront();
                    fk0Var = r50Var.G;
                }
            }
            r50Var.G = fk0Var;
        }
        r30Var.G(f10.d, false);
        r50Var.f41971y1.i(m1Var);
        return r0.m1.f46842b;
    }

    public static String A0() {
        String[][] strArr = EmojiData.data;
        String[] strArr2 = strArr[(int) Math.floor(Math.random() * strArr.length)];
        return strArr2[(int) Math.floor(Math.random() * strArr2.length)];
    }

    public static void B(r50 r50Var, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, TL_phone.exportGroupCallInvite exportgroupcallinvite, TLRPC.TL_error tL_error) {
        boolean z10;
        TLRPC.GroupCall groupCall;
        c2Var.dismiss();
        if (tLObject instanceof TL_phone.exportedGroupCallInvite) {
            Context context = r50Var.getContext();
            int i10 = r50Var.currentAccount;
            TLRPC.InputGroupCall inputGroupCall = exportgroupcallinvite.call;
            String str = ((TL_phone.exportedGroupCallInvite) tLObject).link;
            org.telegram.ui.ActionBar.c6 c6Var = r50Var.resourcesProvider;
            ChatObject.Call call = r50Var.W0;
            if (call != null && (groupCall = call.call) != null && groupCall.creator) {
                z10 = true;
            } else {
                z10 = false;
            }
            h9.o0(context, i10, inputGroupCall, str, c6Var, false, z10);
        } else if (tL_error != null) {
            new org.telegram.ui.Components.tc(r50Var.topBulletinContainer, new lh.h0()).d0(tL_error, false);
        }
    }

    public static void B0(r50 r50Var) {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("reminderhint", false)) {
            return;
        }
        globalMainSettings.edit().putBoolean("reminderhint", true).commit();
        if (r50Var.f41906j0 == null) {
            org.telegram.ui.Components.g40 g40Var = new org.telegram.ui.Components.g40(r50Var.getContext(), 8);
            r50Var.f41906j0 = g40Var;
            g40Var.setAlpha(0.0f);
            r50Var.f41906j0.setVisibility(4);
            r50Var.f41906j0.setShowingDuration(4000L);
            r50Var.containerView.addView(r50Var.f41906j0, i7.f6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            r50Var.f41906j0.setText(LocaleController.getString(R.string.VoipChatReminderHint));
            r50Var.f41906j0.d();
        }
        r50Var.f41906j0.setExtraTranslationY(-AndroidUtilities.statusBarHeight);
        r50Var.f41906j0.f(r50Var.f41959w, true);
    }

    public static void C(r50 r50Var, int[] iArr, float[] fArr) {
        ArrayList<TLRPC.GroupCallParticipant> arrayList;
        f2.n1 K;
        f30 f30Var = r50Var.f41904i2;
        j30 j30Var = r50Var.W1;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            TLRPC.GroupCallParticipant groupCallParticipant = r50Var.W0.participantsBySources.get(iArr[i10]);
            if (groupCallParticipant != null) {
                if (!j30Var.f33796b) {
                    if (r50Var.f41925o0) {
                        arrayList = r50Var.f41974z0;
                    } else {
                        arrayList = r50Var.W0.visibleParticipants;
                    }
                    int indexOf = arrayList.indexOf(groupCallParticipant);
                    if (indexOf >= 0 && (K = r50Var.M.K(indexOf + r50Var.L.d)) != null) {
                        View view = K.f6432a;
                        if (view instanceof org.telegram.ui.Cells.c4) {
                            ((org.telegram.ui.Cells.c4) view).setAmplitude(fArr[i10] * 15.0f);
                            if (view == r50Var.T2 && !r50Var.f41900h2) {
                                r50Var.containerView.invalidate();
                            }
                        }
                    }
                } else {
                    for (int i11 = 0; i11 < f30Var.getChildCount(); i11++) {
                        org.telegram.ui.Components.n20 n20Var = (org.telegram.ui.Components.n20) f30Var.getChildAt(i11);
                        if (MessageObject.getPeerId(n20Var.getParticipant().peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                            n20Var.setAmplitude(fArr[i10] * 15.0f);
                        }
                    }
                }
                j30Var.k(groupCallParticipant, fArr[i10] * 15.0f);
            }
        }
    }

    public static void D(r50 r50Var) {
        Editable text = r50Var.D.getText();
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = text.toString();
        tL_textWithEntities.entities = MediaDataController.getInstance(r50Var.currentAccount).getEntities(new CharSequence[]{text}, true);
        r50Var.A1(tL_textWithEntities);
    }

    public static void F0(r50 r50Var) {
        ChatObject.Call call = r50Var.W0;
        if (call != null && call.call != null) {
            TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
            togglegroupcallsettings.call = r50Var.W0.getInputGroupCall();
            togglegroupcallsettings.join_muted = Boolean.valueOf(r50Var.W0.call.join_muted);
            ConnectionsManager connectionsManager = r50Var.d.getConnectionsManager();
            DispatchQueue dispatchQueue = Utilities.stageQueue;
            Objects.requireNonNull(dispatchQueue);
            connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.b1(dispatchQueue), new m20(r50Var, 1));
        }
    }

    public static void G0(r50 r50Var, boolean z10) {
        if (r50Var.W0 == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        togglegroupcallsettings.call = r50Var.W0.getInputGroupCall();
        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
        r50Var.f41950t3 = Boolean.valueOf(z10);
        r50Var.H1(true);
        ConnectionsManager connectionsManager = r50Var.d.getConnectionsManager();
        DispatchQueue dispatchQueue = Utilities.stageQueue;
        Objects.requireNonNull(dispatchQueue);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.b1(dispatchQueue), new m20(r50Var, 0));
    }

    public static void H0(r50 r50Var) {
        boolean z10;
        int i10;
        if (r50Var.r1()) {
            j30 j30Var = r50Var.W1;
            if (!j30Var.R && j30Var.f33796b && (B3 == r50Var.q1() || AndroidUtilities.isTablet())) {
                z10 = false;
            } else {
                z10 = true;
            }
            Boolean bool = r50Var.f41892f2;
            if (bool != null && z10 == bool.booleanValue()) {
                return;
            }
            int systemUiVisibility = r50Var.containerView.getSystemUiVisibility();
            if (z10) {
                i10 = systemUiVisibility & (-7);
                r50Var.getWindow().clearFlags(1024);
                r50Var.setHideSystemVerticalInsets(false);
            } else {
                r50Var.setHideSystemVerticalInsets(true);
                i10 = systemUiVisibility | 6;
                r50Var.getWindow().addFlags(1024);
            }
            r50Var.containerView.setSystemUiVisibility(i10);
            r50Var.f41892f2 = Boolean.valueOf(z10);
            r50Var.O2 = !z10;
            r50Var.containerView.requestApplyInsets();
            return;
        }
        r50Var.isFullscreen = false;
    }

    public static org.telegram.ui.Components.voip.l I0(r50 r50Var) {
        x40 x40Var = r50Var.M;
        for (int i10 = 0; i10 < x40Var.getChildCount(); i10++) {
            View childAt = x40Var.getChildAt(i10);
            if (childAt.isAttachedToWindow() && (childAt instanceof org.telegram.ui.Components.voip.l) && RecyclerView.R(childAt) >= 0) {
                return (org.telegram.ui.Components.voip.l) childAt;
            }
        }
        return null;
    }

    public static void J0(r50 r50Var) {
        boolean z10;
        Integer num;
        boolean z11;
        float f9;
        float f10;
        float dp;
        float dp2;
        float dp3;
        float f11;
        float f12;
        float f13;
        boolean z12;
        View childAt;
        n40 n40Var = r50Var.K;
        x40 x40Var = r50Var.M;
        int childCount = x40Var.getChildCount();
        float f14 = 2.1474836E9f;
        for (int i10 = 0; i10 < childCount; i10++) {
            if (RecyclerView.R(x40Var.getChildAt(i10)) >= 0) {
                f14 = Math.min(f14, childAt.getTop());
            }
        }
        if (f14 < 0.0f || f14 == 2.1474836E9f) {
            if (childCount != 0) {
                f14 = 0.0f;
            } else {
                f14 = x40Var.getPaddingTop();
            }
        }
        if (f14 <= org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - AndroidUtilities.dp(14.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        float dp4 = f14 + AndroidUtilities.dp(14.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        if ((z10 && n40Var.getTag() == null) || (!z10 && n40Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            n40Var.setTag(num);
            AnimatorSet animatorSet = r50Var.f41880d0;
            if (animatorSet != null) {
                animatorSet.cancel();
                r50Var.f41880d0 = null;
            }
            if (n40Var.getTag() == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            r50Var.setUseLightStatusBar(z11);
            ViewPropertyAnimator animate = n40Var.getBackButton().animate();
            float f15 = 0.9f;
            if (z10) {
                f9 = 1.0f;
            } else {
                f9 = 0.9f;
            }
            ViewPropertyAnimator scaleX = animate.scaleX(f9);
            if (z10) {
                f15 = 1.0f;
            }
            ViewPropertyAnimator scaleY = scaleX.scaleY(f15);
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = -AndroidUtilities.dp(14.0f);
            }
            ViewPropertyAnimator duration = scaleY.translationX(f10).setDuration(300L);
            org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.f29800f;
            duration.setInterpolator(jrVar).start();
            ViewPropertyAnimator animate2 = n40Var.getTitleTextView().animate();
            if (z10) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(23.0f);
            }
            animate2.translationY(dp).setDuration(300L).setInterpolator(jrVar).start();
            ObjectAnimator objectAnimator = r50Var.Q2;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                r50Var.Q2.cancel();
            }
            org.telegram.ui.ActionBar.h5 subtitleTextView = n40Var.getSubtitleTextView();
            Property property = View.TRANSLATION_Y;
            float translationY = n40Var.getSubtitleTextView().getTranslationY();
            if (z10) {
                dp2 = 0.0f;
            } else {
                dp2 = AndroidUtilities.dp(20.0f);
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(subtitleTextView, property, translationY, dp2);
            r50Var.Q2 = ofFloat;
            ofFloat.setDuration(300L);
            r50Var.Q2.setInterpolator(jrVar);
            r50Var.Q2.addListener(new org.telegram.ui.Components.z9(29, r50Var, z10));
            r50Var.Q2.start();
            ObjectAnimator objectAnimator2 = r50Var.R2;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            org.telegram.ui.ActionBar.h5 additionalSubtitleTextView = n40Var.getAdditionalSubtitleTextView();
            if (z10) {
                dp3 = 0.0f;
            } else {
                dp3 = AndroidUtilities.dp(20.0f);
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(additionalSubtitleTextView, property, dp3);
            r50Var.R2 = ofFloat2;
            ofFloat2.setDuration(300L);
            r50Var.R2.setInterpolator(jrVar);
            r50Var.R2.start();
            AnimatorSet animatorSet2 = new AnimatorSet();
            r50Var.f41880d0 = animatorSet2;
            animatorSet2.setDuration(140L);
            AnimatorSet animatorSet3 = r50Var.f41880d0;
            Property property2 = View.ALPHA;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(n40Var, property2, f11);
            c30 c30Var = r50Var.J;
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(c30Var, property2, f12);
            View view = r50Var.f41877c0;
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(view, property2, f13));
            r50Var.f41880d0.addListener(new l40(r50Var, 1));
            r50Var.f41880d0.start();
            ImageView imageView = r50Var.W1.v;
            if (z10 && !B3) {
                z12 = false;
            } else {
                z12 = true;
            }
            imageView.setClickable(z12);
        }
        if (r50Var.f41951u0 != dp4) {
            r50Var.E1(dp4);
        }
    }

    public static void M(r50 r50Var, org.telegram.ui.Components.voip.l lVar, boolean z10) {
        if (!r50Var.isDismissed()) {
            if (z10 && lVar.getRenderer() == null) {
                lVar.setRenderer(org.telegram.ui.Components.voip.u.c(r50Var.U1, r50Var.W1, lVar, null, null, lVar.getParticipant(), r50Var.W0, r50Var));
            } else if (!z10 && lVar.getRenderer() != null) {
                lVar.getRenderer().setPrimaryView(null);
                lVar.setRenderer(null);
            }
        }
    }

    public static void S(r50 r50Var, int i10, int[] iArr) {
        if (r50Var.r1()) {
            int i11 = org.telegram.ui.ActionBar.g6.Kg;
            iArr[0] = org.telegram.ui.ActionBar.g6.w0(null, i11, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Lg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23460zg, false), r50Var.Q1, 1.0f);
            iArr[2] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23198kg, false), org.telegram.ui.ActionBar.g6.w0(null, i11, false), r50Var.Q1, 1.0f);
        } else if (i10 == 0) {
            iArr[0] = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Jg, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23442yg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23460zg, false), r50Var.Q1, 1.0f);
            iArr[2] = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23425xg, false);
        } else if (i10 == 1) {
            iArr[0] = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Gg, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Bg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Cg, false), r50Var.Q1, 1.0f);
            iArr[2] = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ag, false);
        } else if (p1(i10)) {
            iArr[0] = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23199kh, false);
            iArr[1] = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23216lh, false);
            iArr[2] = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23233mh, false);
        } else {
            int i12 = org.telegram.ui.ActionBar.g6.Kg;
            iArr[0] = org.telegram.ui.ActionBar.g6.w0(null, i12, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Mg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ng, false), r50Var.Q1, 1.0f);
            iArr[2] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23198kg, false), org.telegram.ui.ActionBar.g6.w0(null, i12, false), r50Var.Q1, 1.0f);
        }
        if (p1(i10)) {
            iArr[3] = i0.a.d(0.5f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23162ih, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23199kh, false));
        } else if (i10 == 1) {
            iArr[3] = i0.a.d(0.75f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Bg, false), i0.a.d(0.5f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Fg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Hg, false)));
        } else {
            iArr[3] = i0.a.d(0.5f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Jg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ig, false));
        }
    }

    public static void c1(LaunchActivity launchActivity, AccountInstance accountInstance, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        if (f41867z3 == null) {
            if (inputPeer != null || VoIPService.getSharedInstance() != null) {
                if (inputPeer != null) {
                    f41867z3 = new r50(launchActivity, accountInstance, accountInstance.getMessagesController().getGroupCall(chat.f22392id, false), chat, inputPeer, z10, str);
                } else {
                    ChatObject.Call call = VoIPService.getSharedInstance().groupCall;
                    if (call != null) {
                        TLRPC.Chat chat2 = accountInstance.getMessagesController().getChat(Long.valueOf(call.chatId));
                        call.addSelfDummyParticipant(true);
                        f41867z3 = new r50(launchActivity, accountInstance, call, chat2, null, z10, str);
                    } else {
                        return;
                    }
                }
                f41867z3.f41885e0 = launchActivity;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.g5(23));
            }
        }
    }

    public static String f1(int i10) {
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return null;
                }
                if (sharedInstance != null && (str = sharedInstance.currentBluetoothDeviceName) != null) {
                    return str;
                }
                return LocaleController.getString(R.string.VoipAudioRoutingBluetooth);
            } else if (sharedInstance != null && sharedInstance.isHeadsetPlugged()) {
                return LocaleController.getString(R.string.VoipAudioRoutingHeadset);
            } else {
                return LocaleController.getString(R.string.VoipAudioRoutingPhone);
            }
        }
        return LocaleController.getString(R.string.VoipAudioRoutingSpeaker);
    }

    public static String g1(int i10) {
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (i10 == 2) {
            if (sharedInstance != null && (str = sharedInstance.currentBluetoothDeviceName) != null) {
                return LocaleController.formatString(R.string.VoipAudioSwitchedToBluetoothDevice, str);
            }
            return LocaleController.getString(R.string.VoipAudioSwitchedToBluetooth);
        } else if (i10 == 1) {
            if (sharedInstance != null && sharedInstance.isHeadsetPlugged()) {
                return LocaleController.getString(R.string.VoipAudioSwitchedToHeadset);
            }
            return LocaleController.getString(R.string.VoipAudioSwitchedToPhone);
        } else {
            return LocaleController.getString(R.string.VoipAudioSwitchedToSpeaker);
        }
    }

    public static void m(r50 r50Var, ChatObject.Call.InvitedUser invitedUser, Long l10) {
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = invitedUser.msg_id;
        ConnectionsManager.getInstance(r50Var.currentAccount).sendRequest(declineconferencecallinvite, new k20(r50Var, 0));
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(invitedUser.msg_id));
        MessagesController.getInstance(r50Var.currentAccount).deleteMessages(arrayList, null, null, 0L, 0, true, 0);
        ChatObject.Call call = r50Var.W0;
        if (call != null) {
            call.invitedUsers.remove(l10);
            r50Var.W0.invitedUsersMap.remove(l10);
            r50Var.W0.invitedUsersMessageIds.remove(l10);
            r50Var.O0(true);
        }
    }

    public static void n(r50 r50Var, Activity activity, ChatObject.Call call, View view, int i10) {
        TLRPC.Chat chat;
        final ChatObject.Call.InvitedUser invitedUser;
        AccountInstance accountInstance = r50Var.d;
        ArrayList arrayList = r50Var.B0;
        l50 l50Var = r50Var.L;
        if (view instanceof org.telegram.ui.Components.voip.l) {
            r50Var.e1(((org.telegram.ui.Components.voip.l) view).getParticipant());
        } else if (view instanceof org.telegram.ui.Cells.c4) {
            r50Var.F1((org.telegram.ui.Cells.c4) view);
        } else {
            Collection collection = null;
            r7 = null;
            r7 = null;
            r7 = null;
            final Long l10 = null;
            boolean z10 = true;
            if (view instanceof org.telegram.ui.Cells.t3) {
                org.telegram.ui.Cells.t3 t3Var = (org.telegram.ui.Cells.t3) view;
                if (t3Var.getUser() != null) {
                    if (r50Var.o1()) {
                        int i11 = i10 - l50Var.f40098n;
                        if (i11 >= 0 && i11 < r50Var.W0.shadyJoinParticipants.size()) {
                            l10 = r50Var.W0.shadyJoinParticipants.get(i10 - l50Var.f40098n);
                        } else {
                            int i12 = i10 - l50Var.f40100s;
                            if (i12 >= 0 && i12 < r50Var.W0.shadyLeftParticipants.size()) {
                                l10 = r50Var.W0.shadyLeftParticipants.get(i10 - l50Var.f40100s);
                            } else {
                                int i13 = i10 - l50Var.f40097f;
                                if (r50Var.f41925o0) {
                                    if (i13 >= 0 && i13 < arrayList.size()) {
                                        l10 = (Long) arrayList.get(i13);
                                    }
                                } else if (i13 >= 0 && i13 < r50Var.W0.invitedUsers.size()) {
                                    l10 = r50Var.W0.invitedUsers.get(i13);
                                }
                                z10 = false;
                            }
                        }
                        if (!z10 && (invitedUser = r50Var.W0.invitedUsersMessageIds.get(l10)) != null) {
                            org.telegram.ui.Components.j70 F = org.telegram.ui.Components.j70.F(r50Var.container, r50Var.resourcesProvider, t3Var);
                            F.l(R.drawable.msg_endcall, LocaleController.getString(R.string.GroupCallStopCallingInvite), new Runnable(r50Var) {
                                public final r50 f39108b;

                                {
                                    this.f39108b = r50Var;
                                }

                                @Override
                                public final void run() {
                                    switch (r4) {
                                        case 0:
                                            r50.r(this.f39108b, invitedUser, l10);
                                            return;
                                        default:
                                            r50.m(this.f39108b, invitedUser, l10);
                                            return;
                                    }
                                }
                            }, invitedUser.isCalling());
                            F.c(R.drawable.msg_remove, LocaleController.getString(R.string.GroupCallDiscardInvite), new Runnable(r50Var) {
                                public final r50 f39108b;

                                {
                                    this.f39108b = r50Var;
                                }

                                @Override
                                public final void run() {
                                    switch (r4) {
                                        case 0:
                                            r50.r(this.f39108b, invitedUser, l10);
                                            return;
                                        default:
                                            r50.m(this.f39108b, invitedUser, l10);
                                            return;
                                    }
                                }
                            }, false);
                            F.W(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), r50Var.f41970y0.getColor()));
                            F.f29600s = 96;
                            F.Z();
                            return;
                        }
                        return;
                    }
                    r50Var.f41885e0.K0(r50Var.currentAccount);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", t3Var.getUser().f22539id);
                    if (t3Var.f25692a.getImageReceiver().hasNotThumb()) {
                        bundle.putBoolean("expandPhoto", true);
                    }
                    r50Var.f41885e0.p0(new ProfileActivity(bundle, null));
                    r50Var.dismiss();
                }
            } else if (i10 == l50Var.f40101w) {
                if (ChatObject.isChannel(r50Var.V0) && (chat = r50Var.V0) != null && !chat.megagroup && ChatObject.isPublic(chat)) {
                    r50Var.j1(false);
                    return;
                }
                TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(r50Var.i1());
                if (chatFull != null) {
                    r50Var.f41943s0 = false;
                    Context context = r50Var.getContext();
                    int currentAccount = accountInstance.getCurrentAccount();
                    TLRPC.Chat chat2 = r50Var.V0;
                    ChatObject.Call call2 = r50Var.W0;
                    org.telegram.ui.Components.p30 p30Var = new org.telegram.ui.Components.p30(context, currentAccount, chat2, chatFull, call2.participants, call2.invitedUsersMap);
                    r50Var.A1 = p30Var;
                    p30Var.setOnDismissListener(new g20(r50Var, 2));
                    org.telegram.ui.Components.p30 p30Var2 = r50Var.A1;
                    p30Var2.f31565c0 = new s20(r50Var);
                    p30Var2.show();
                }
            } else if (i10 == l50Var.f40102x) {
                ChatObject.Call call3 = r50Var.W0;
                if (call3 != null && call3.call != null) {
                    eg.w2 w2Var = new eg.w2(activity, r50Var.currentAccount, null, 4, new lh.h0());
                    ChatObject.Call call4 = r50Var.W0;
                    if (call4 != null) {
                        collection = (Collection) Collection.EL.stream(call4.sortedParticipants).map(new j8(4)).collect(Collectors.toSet());
                    }
                    w2Var.f6185y0.addAll(collection);
                    w2Var.h0(false, true);
                    w2Var.f6183w0 = new d20(r50Var, 3);
                    w2Var.h0(false, true);
                    w2Var.f6186z0 = new bh.v(20, r50Var, call);
                    w2Var.show();
                }
            } else if (i10 == l50Var.f40103y) {
                r50Var.v1();
            }
        }
    }

    public static void o(r50 r50Var, Activity activity) {
        LaunchActivity launchActivity;
        if (Build.VERSION.SDK_INT >= 23 && (launchActivity = r50Var.f41885e0) != null && launchActivity.checkSelfPermission("android.permission.CAMERA") != 0) {
            r50Var.f41885e0.requestPermissions(new String[]{"android.permission.CAMERA"}, 104);
        } else if (VoIPService.getSharedInstance() != null) {
            boolean z10 = false;
            if (VoIPService.getSharedInstance().getVideoState(false) != 2) {
                r50Var.f41890f0[0].e(1, false);
                if (r50Var.f41955v0 == null) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null) {
                        sharedInstance.createCaptureDevice(false);
                    }
                    if (VoIPService.getSharedInstance().getVideoState(true) != 2) {
                        z10 = true;
                    }
                    d40 d40Var = new d40(r50Var, activity, z10);
                    r50Var.f41955v0 = d40Var;
                    d40Var.setBottomPadding(r50Var.containerView.getPaddingBottom());
                    r50Var.container.addView(r50Var.f41955v0);
                    if (sharedInstance != null && !sharedInstance.isFrontFaceCamera()) {
                        sharedInstance.switchCamera();
                        return;
                    }
                    return;
                }
                return;
            }
            VoIPService.getSharedInstance().setVideoState(false, 0);
            r50Var.N1(true, false);
            r50Var.M1(false);
            r50Var.W0.sortParticipants();
            r50Var.O0(true);
            r50Var.f41884e.requestLayout();
        }
    }

    public static void p(r50 r50Var, float f9, float f10, float f11, int i10, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        r50Var.Z1 = floatValue;
        r50Var.W1.f33811n = floatValue;
        float f12 = (floatValue * 1.0f) + ((1.0f - floatValue) * f9);
        m30 m30Var = r50Var.f41972y2;
        m30Var.setScaleX(f12);
        m30Var.setScaleY(f12);
        m30Var.setTranslationX((1.0f - r50Var.Z1) * f10);
        m30Var.setTranslationY((1.0f - r50Var.Z1) * f11);
        if (!r50Var.f41879c2) {
            r50Var.S2.setAlpha((int) (r50Var.Z1 * 100.0f));
        }
        org.telegram.ui.Components.voip.u uVar = r50Var.V2;
        if (uVar != null) {
            uVar.f34014a.setRoundCorners((1.0f - r50Var.Z1) * AndroidUtilities.dp(8.0f));
        }
        m30Var.invalidate();
        r50Var.containerView.invalidate();
        l30 l30Var = r50Var.f41871b;
        int i11 = (int) ((1.0f - r50Var.Z1) * i10);
        l30Var.N(i11, i11);
    }

    public static boolean p1(int i10) {
        if ((VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().groupCall == null || !VoIPService.getSharedInstance().groupCall.call.rtmp_stream) && i10 != 2 && i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            return false;
        }
        return true;
    }

    public static void q(r50 r50Var, ChatObject.Call call, Boolean bool, HashSet hashSet) {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance;
        ChatObject.Call call2 = r50Var.W0;
        if (call2 != null && (groupCall = call2.call) != null) {
            String str = groupCall.invite_link;
            int size = hashSet.size();
            AtomicInteger atomicInteger = new AtomicInteger(0);
            HashSet hashSet2 = new HashSet();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                long longValue = ((Long) it.next()).longValue();
                r50Var.W0.addInvitedUser(longValue);
                TL_phone.inviteConferenceCallParticipant inviteconferencecallparticipant = new TL_phone.inviteConferenceCallParticipant();
                TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                inviteconferencecallparticipant.call = tL_inputGroupCall;
                TLRPC.GroupCall groupCall2 = r50Var.W0.call;
                tL_inputGroupCall.f22409id = groupCall2.f22402id;
                tL_inputGroupCall.access_hash = groupCall2.access_hash;
                inviteconferencecallparticipant.user_id = MessagesController.getInstance(r50Var.currentAccount).getInputUser(longValue);
                inviteconferencecallparticipant.video = bool.booleanValue();
                ConnectionsManager.getInstance(r50Var.currentAccount).sendRequest(inviteconferencecallparticipant, new l20(r50Var, longValue, hashSet2, atomicInteger, size, call, str));
            }
            r50Var.O0(true);
            if (bool.booleanValue() && (sharedInstance = VoIPService.getSharedInstance()) != null && sharedInstance.getVideoState(false) != 2 && sharedInstance.getVideoState(false) != 1) {
                sharedInstance.createCaptureDevice(false);
                if (!sharedInstance.isFrontFaceCamera()) {
                    sharedInstance.switchCamera();
                }
                sharedInstance.requestVideoCall(false);
                sharedInstance.setVideoState(false, 2);
                sharedInstance.setMicMute(false, false, true);
                sharedInstance.switchToSpeaker();
                r50Var.N1(true, true);
            }
        }
    }

    public static void r(r50 r50Var, ChatObject.Call.InvitedUser invitedUser, Long l10) {
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = invitedUser.msg_id;
        ConnectionsManager.getInstance(r50Var.currentAccount).sendRequest(declineconferencecallinvite, new k20(r50Var, 1));
        ChatObject.Call call = r50Var.W0;
        if (call != null) {
            invitedUser.calling = false;
            call.invitedUsersMessageIds.put(l10, invitedUser);
            r50Var.O0(true);
        }
    }

    public static void s(r50 r50Var, TLObject tLObject) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(r50Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    public static void t(r50 r50Var) {
        r50Var.Y0();
        r50Var.V0();
        r50Var.U0();
        r50Var.B.setTranslationY((-r50Var.f41971y1.c()) + r50Var.containerView.getPaddingBottom());
        r50Var.C.invalidate();
        r50Var.Z0();
        r50Var.containerView.invalidate();
    }

    public static void t1(Context context, Runnable runnable, boolean z10, boolean z11) {
        int dp;
        int dp2;
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            TLRPC.Chat chat = sharedInstance.getChat();
            ChatObject.Call call = sharedInstance.groupCall;
            long selfId = sharedInstance.getSelfId();
            if (!z11 && ChatObject.canManageCalls(chat)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                if (sharedInstance.isConference()) {
                    alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertTitle);
                    alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertText);
                } else if (ChatObject.isChannelOrGiga(chat)) {
                    alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.VoipChannelLeaveAlertTitle);
                    alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.VoipChannelLeaveAlertText);
                } else {
                    alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.VoipGroupLeaveAlertTitle);
                    alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.VoipGroupLeaveAlertText);
                }
                sharedInstance.getAccount();
                org.telegram.ui.Cells.y1[] y1VarArr = new org.telegram.ui.Cells.y1[1];
                LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
                if (!sharedInstance.isConference() || (call != null && (groupCall = call.call) != null && groupCall.creator)) {
                    org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(context, 1);
                    y1VarArr[0] = y1Var;
                    y1Var.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
                    if (z10) {
                        y1VarArr[0].setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23169j5, false));
                    } else {
                        y1VarArr[0].setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23143hg, false));
                        CheckBoxSquare checkBoxSquare = (CheckBoxSquare) y1VarArr[0].getCheckBoxView();
                        int i10 = org.telegram.ui.ActionBar.g6.f23318rg;
                        int i11 = org.telegram.ui.ActionBar.g6.f23286pg;
                        int i12 = org.telegram.ui.ActionBar.g6.f23251ng;
                        checkBoxSquare.f26340s = i10;
                        checkBoxSquare.v = i11;
                        checkBoxSquare.f26341w = i12;
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
                    org.telegram.ui.Cells.y1 y1Var2 = y1VarArr[0];
                    if (LocaleController.isRTL) {
                        dp = AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(8.0f);
                    }
                    if (LocaleController.isRTL) {
                        dp2 = AndroidUtilities.dp(8.0f);
                    } else {
                        dp2 = AndroidUtilities.dp(16.0f);
                    }
                    y1Var2.setPadding(dp, 0, dp2, 0);
                    g10.addView(y1VarArr[0], i7.f6.n(-1, -2));
                    y1VarArr[0].setOnClickListener(new e20(y1VarArr, 0));
                }
                alertDialog$Builder.n(g10);
                alertDialog$Builder.f22714a.E = org.telegram.ui.ActionBar.g6.f23286pg;
                alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupLeave), new b9.d(call, y1VarArr, selfId, runnable));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                if (z10) {
                    alertDialog$Builder.f22714a.L0 = false;
                }
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                if (z10) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        c2Var.getWindow().setType(2038);
                    } else {
                        c2Var.getWindow().setType(2003);
                    }
                    c2Var.getWindow().clearFlags(2);
                }
                if (!z10) {
                    c2Var.i(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23375ug, false));
                }
                c2Var.show();
                if (!z10) {
                    TextView textView = (TextView) c2Var.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23393vg, false));
                    }
                    c2Var.o(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23143hg, false));
                    return;
                }
                return;
            }
            w1(call, false, selfId, runnable);
        }
    }

    public static void u(r50 r50Var, TLObject tLObject) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(r50Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    public static void v(r50 r50Var, long j10, HashSet hashSet, AtomicInteger atomicInteger, int i10, ChatObject.Call call, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(r50Var.currentAccount).processUpdates(updates, false);
            AndroidUtilities.runOnUIThread(new g5.v(r50Var, updates, j10, 27));
        } else if (tL_error != null && "USER_PRIVACY_RESTRICTED".equalsIgnoreCase(tL_error.text)) {
            hashSet.add(Long.valueOf(j10));
        }
        if (atomicInteger.incrementAndGet() == i10 && !hashSet.isEmpty()) {
            AndroidUtilities.runOnUIThread(new n20(r50Var, hashSet, call, str, 1));
        }
    }

    public static void w(r50 r50Var, HashSet hashSet, ChatObject.Call call, String str) {
        TL_account.getRequirementsToContact getrequirementstocontact = new TL_account.getRequirementsToContact();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Long l10 = (Long) it.next();
            long longValue = l10.longValue();
            if (call != null) {
                call.removeInvitedUser(longValue);
            }
            arrayList.add(MessagesController.getInstance(r50Var.currentAccount).getUser(l10));
            getrequirementstocontact.f22599id.add(MessagesController.getInstance(r50Var.currentAccount).getInputUser(longValue));
        }
        org.telegram.ui.Components.u20 u20Var = new org.telegram.ui.Components.u20(r50Var, arrayList, arrayList2, arrayList3, str, 7);
        if (UserConfig.getInstance(r50Var.currentAccount).isPremium()) {
            u20Var.run();
        } else {
            ConnectionsManager.getInstance(r50Var.currentAccount).sendRequest(getrequirementstocontact, new x9(arrayList, arrayList2, u20Var, 13));
        }
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
                TLRPC.GroupCall groupCall = call.call;
                groupCall.participants_count--;
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

    public static void x(r50 r50Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        cg.v0 v0Var = new cg.v0(34, r50Var.currentAccount, U.getContext(), U, new lh.h0());
        v0Var.I1(null, arrayList, arrayList2, arrayList3, str);
        v0Var.show();
    }

    public static void y(r50 r50Var, org.telegram.ui.ActionBar.c2[] c2VarArr, boolean z10, TLRPC.TL_error tL_error, long j10, TL_phone.inviteToGroupCall invitetogroupcall) {
        try {
            c2VarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        c2VarArr[0] = null;
        if (z10 && "USER_NOT_PARTICIPANT".equals(tL_error.text)) {
            r50Var.x1(null, j10, 3);
            return;
        }
        org.telegram.ui.Components.c5.f0(r50Var.currentAccount, tL_error, (org.telegram.ui.ActionBar.o2) r50Var.f41885e0.O().getFragmentStack().get(r50Var.f41885e0.O().getFragmentStack().size() - 1), invitetogroupcall, new Object[0]);
    }

    public final void A1(TLRPC.TL_textWithEntities tL_textWithEntities) {
        TLRPC.InputGroupCall inputGroupCall;
        long j10;
        this.D.setText("");
        ChatObject.Call call = this.W0;
        if (call != null && call.call != null && (inputGroupCall = call.getInputGroupCall()) != null) {
            ChatObject.Call call2 = this.W0;
            long j11 = call2.call.f22402id;
            TLRPC.Peer peer = call2.selfPeer;
            if (peer != null) {
                j10 = DialogObject.getPeerDialogId(peer);
            } else {
                j10 = UserConfig.getInstance(this.currentAccount).clientUserId;
            }
            GroupCallMessagesController.getInstance(this.currentAccount).sendCallMessage(j10, tL_textWithEntities, j11, inputGroupCall);
        }
    }

    public final void B1(float f9) {
        float f10;
        int i10;
        int i11;
        this.Q1 = f9;
        j30 j30Var = this.W1;
        if (j30Var == null) {
            f10 = 0.0f;
        } else {
            f10 = j30Var.f33798c;
        }
        float max = Math.max(f9, f10);
        int i12 = org.telegram.ui.ActionBar.g6.f23180jg;
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, i12, false);
        int i13 = org.telegram.ui.ActionBar.g6.f23126gg;
        int offsetColor = AndroidUtilities.getOffsetColor(w02, org.telegram.ui.ActionBar.g6.w0(null, i13, false), f9, 1.0f);
        this.R1 = offsetColor;
        this.J.setBackgroundColor(offsetColor);
        this.f41895g1.B(-14472653);
        this.f41872b0.setColorFilter(new PorterDuffColorFilter(this.R1, PorterDuff.Mode.MULTIPLY));
        this.navBarColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false), org.telegram.ui.ActionBar.g6.w0(null, i13, false), max, 1.0f);
        int offsetColor2 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23198kg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23356tg, false), f9, 1.0f);
        b50 b50Var = this.f41914l0;
        if (b50Var != null) {
            b50Var.f36693j = offsetColor2;
            cg.h0 h0Var = b50Var.f36691g;
            if (h0Var != null) {
                h0Var.invalidate();
            }
        }
        this.f41970y0.setColor(offsetColor2);
        this.A.setColor(offsetColor2);
        this.B.invalidate();
        x40 x40Var = this.M;
        x40Var.setGlowColor(offsetColor2);
        int i14 = this.B1;
        if (i14 == 3 || p1(i14)) {
            this.f41959w.invalidate();
        }
        View view = this.F2;
        if (view != null) {
            int i15 = this.R1;
            int[] iArr = this.I2;
            iArr[0] = i15;
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
        int offsetColor3 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Dg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Eg, false), f9, 1.0f);
        this.f41942s.a(offsetColor3, offsetColor3);
        int offsetColor4 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23215lg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23269og, false), f9, 1.0f);
        int offsetColor5 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23232mg, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23318rg, false), f9, 1.0f);
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, this.resourcesProvider);
        int childCount = x40Var.getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = x40Var.getChildAt(i16);
            if (childAt instanceof org.telegram.ui.Cells.u3) {
                org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) childAt;
                if (o1()) {
                    u3Var.a(v02, v02);
                } else {
                    u3Var.a(offsetColor5, offsetColor4);
                }
            } else {
                boolean z10 = childAt instanceof org.telegram.ui.Cells.c4;
                n40 n40Var = this.K;
                if (z10) {
                    org.telegram.ui.Cells.c4 c4Var = (org.telegram.ui.Cells.c4) childAt;
                    if (n40Var.getTag() != null) {
                        i11 = org.telegram.ui.ActionBar.g6.f23318rg;
                    } else {
                        i11 = org.telegram.ui.ActionBar.g6.f23232mg;
                    }
                    c4Var.f(i11, offsetColor5);
                } else if (childAt instanceof org.telegram.ui.Cells.t3) {
                    org.telegram.ui.Cells.t3 t3Var = (org.telegram.ui.Cells.t3) childAt;
                    if (n40Var.getTag() != null) {
                        i10 = org.telegram.ui.ActionBar.g6.f23318rg;
                    } else {
                        i10 = org.telegram.ui.ActionBar.g6.f23232mg;
                    }
                    t3Var.a(i10, offsetColor5);
                }
            }
        }
        this.containerView.invalidate();
        x40Var.invalidate();
        this.container.invalidate();
    }

    public final void C1(float f9) {
        x40 x40Var;
        TLRPC.GroupCallParticipant groupCallParticipant;
        ArrayList<TLRPC.GroupCallParticipant> arrayList;
        f2.n1 K;
        f9 = (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) ? 0.0f : 0.0f;
        float min = (float) (Math.min(8500.0d, 4000.0f * f9) / 8500.0d);
        this.L0 = min;
        this.M0 = (min - this.K0) / 265.0f;
        ChatObject.Call call = this.W0;
        if (call != null && (x40Var = this.M) != null && (groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(MessageObject.getPeerId(this.f41960w0))) != null) {
            j30 j30Var = this.W1;
            if (!j30Var.f33796b) {
                if (this.f41925o0) {
                    arrayList = this.f41974z0;
                } else {
                    arrayList = this.W0.visibleParticipants;
                }
                int indexOf = arrayList.indexOf(groupCallParticipant);
                if (indexOf >= 0 && (K = x40Var.K(indexOf + this.L.d)) != null) {
                    View view = K.f6432a;
                    if (view instanceof org.telegram.ui.Cells.c4) {
                        ((org.telegram.ui.Cells.c4) view).setAmplitude(f9 * 15.0f);
                        if (view == this.T2 && !this.f41900h2) {
                            this.containerView.invalidate();
                        }
                    }
                }
            } else {
                int i10 = 0;
                while (true) {
                    f30 f30Var = this.f41904i2;
                    if (i10 >= f30Var.getChildCount()) {
                        break;
                    }
                    org.telegram.ui.Components.n20 n20Var = (org.telegram.ui.Components.n20) f30Var.getChildAt(i10);
                    if (MessageObject.getPeerId(n20Var.getParticipant().peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                        n20Var.setAmplitude(f9 * 15.0f);
                    }
                    i10++;
                }
            }
            j30Var.k(groupCallParticipant, f9 * 15.0f);
        }
    }

    public final void D1(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25) {
        this.c3 = i10;
        this.f41883d3 = i11;
        this.f41888e3 = i12;
        this.f41893f3 = i13;
        this.f41897g3 = i14;
        this.f41901h3 = i15;
        this.f41905i3 = i16;
        this.f41909j3 = i17;
        this.f41913k3 = i18;
        this.f41916l3 = i19;
        this.f41919m3 = i20;
        this.f41924n3 = i21;
        this.f41928o3 = i22;
        this.f41932p3 = i23;
        this.f41936q3 = i24;
        this.f41941r3 = i25;
    }

    public final void E1(float f9) {
        x40 x40Var;
        int dp;
        int i10;
        float f10;
        this.f41951u0 = f9;
        this.M.setTopGlowOffset((int) (f9 - ((FrameLayout.LayoutParams) x40Var.getLayoutParams()).topMargin));
        float dp2 = f9 - AndroidUtilities.dp(74.0f);
        g50 g50Var = this.Q0;
        j30 j30Var = this.W1;
        d30 d30Var = this.f41873b1;
        b30 b30Var = this.f41869a1;
        if (this.backgroundPaddingTop + dp2 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() * 2) {
            float min = Math.min(1.0f, (((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() * 2) - dp2) - this.backgroundPaddingTop) / (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + ((dp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f))));
            if (AndroidUtilities.isTablet()) {
                f10 = 17.0f;
            } else {
                f10 = 13.0f;
            }
            i10 = (int) (AndroidUtilities.dp(f10) * min);
            if (g50Var != null) {
                g50Var.setShadowOffset((int) (AndroidUtilities.dp(8.0f) * min));
            }
            if (Math.abs(Math.min(1.0f, min) - this.Q1) > 1.0E-4f) {
                B1(Math.min(1.0f, min));
            }
            float f11 = 1.0f - ((0.1f * min) * 1.2f);
            b30Var.setScaleX(Math.max(0.9f, f11));
            b30Var.setScaleY(Math.max(0.9f, f11));
            float f12 = 1.0f - (min * 1.2f);
            b30Var.setAlpha((1.0f - j30Var.f33798c) * Math.max(0.0f, f12));
            d30Var.setScaleX(Math.max(0.9f, f11));
            d30Var.setScaleY(Math.max(0.9f, f11));
            d30Var.setAlpha((1.0f - j30Var.f33798c) * Math.max(0.0f, f12));
        } else {
            b30Var.setScaleX(1.0f);
            b30Var.setScaleY(1.0f);
            b30Var.setAlpha(1.0f - j30Var.f33798c);
            d30Var.setScaleX(1.0f);
            d30Var.setScaleY(1.0f);
            d30Var.setAlpha(1.0f - j30Var.f33798c);
            if (this.Q1 > 1.0E-4f) {
                B1(0.0f);
            }
            i10 = 0;
        }
        Y0();
        float f13 = i10;
        this.f41956v1.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f9 - AndroidUtilities.dp(53.0f)) - f13));
        this.f41891f1.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f9 - AndroidUtilities.dp(44.0f)) - f13));
        if (g50Var != null) {
            g50Var.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), f9 - AndroidUtilities.dp(37.0f)));
        }
        a40 a40Var = this.N;
        if (a40Var != null) {
            a40Var.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f9 - AndroidUtilities.dp(44.0f)) - f13));
        }
        this.containerView.invalidate();
        Q1();
    }

    public final boolean F1(android.view.View r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.r50.F1(android.view.View):boolean");
    }

    public final void G1(View view) {
        if (this.f41902i0 == null) {
            org.telegram.ui.Components.g40 g40Var = new org.telegram.ui.Components.g40(8, getContext(), null, true);
            this.f41902i0 = g40Var;
            g40Var.setAlpha(0.0f);
            this.f41902i0.setVisibility(4);
            this.f41902i0.setShowingDuration(3000L);
            this.containerView.addView(this.f41902i0, i7.f6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            if (ChatObject.isChannelOrGiga(this.V0)) {
                this.f41902i0.setText(LocaleController.getString(R.string.VoipChannelRecording));
            } else {
                this.f41902i0.setText(LocaleController.getString(R.string.VoipGroupRecording));
            }
            this.f41902i0.d();
        }
        this.f41902i0.setExtraTranslationY(-AndroidUtilities.statusBarHeight);
        this.f41902i0.f(view, true);
    }

    public final void H1(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        ChatObject.Call call = this.W0;
        org.telegram.ui.Components.voip.x2 x2Var = this.v;
        org.telegram.ui.Components.voip.x2 x2Var2 = this.h;
        org.telegram.ui.Components.voip.x2 x2Var3 = this.f41937r;
        org.telegram.ui.Components.voip.x2 x2Var4 = this.f41889f;
        org.telegram.ui.Components.voip.x2 x2Var5 = this.f41920n;
        org.telegram.ui.Components.voip.x2 x2Var6 = this.f41942s;
        org.telegram.ui.Components.voip.x2 x2Var7 = this.f41959w;
        boolean z19 = true;
        w20 w20Var = this.f41884e;
        boolean z20 = false;
        if (call != null && !call.isScheduled()) {
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(false) == 2) {
                z13 = true;
            } else {
                z13 = false;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.W0.participants.f(MessageObject.getPeerId(this.f41960w0));
            if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !Q0()) {
                z14 = true;
            } else {
                z14 = false;
            }
            Boolean bool = this.f41950t3;
            if (bool != null) {
                z15 = bool.booleanValue();
            } else {
                TLRPC.GroupCall groupCall = this.W0.call;
                if (groupCall != null && groupCall.messages_enabled) {
                    z15 = true;
                } else {
                    z15 = false;
                }
            }
            if (((!z14 && this.W0.canRecordVideo()) || z13) && !r1()) {
                z16 = true;
            } else {
                z20 = true;
                z16 = false;
            }
            if (z13) {
                z17 = false;
                z18 = true;
            } else {
                z17 = !z14;
                z18 = false;
            }
            if (B3) {
                z17 = false;
                z18 = false;
            }
            w20Var.c(x2Var7, true, z10);
            w20Var.c(x2Var6, true, z10);
            w20Var.c(x2Var5, z16, z10);
            w20Var.c(x2Var4, z18, z10);
            w20Var.c(x2Var3, z20, z10);
            w20Var.c(x2Var2, z17, z10);
            w20Var.c(x2Var, z15, z10);
            return;
        }
        if (this.R0 > 0.1f) {
            z11 = true;
        } else {
            z11 = false;
        }
        w20Var.c(x2Var7, z11, z10);
        if (this.R0 > 0.1f) {
            z12 = true;
        } else {
            z12 = false;
        }
        w20Var.c(x2Var6, z12, z10);
        if (this.R0 <= 0.1f) {
            z19 = false;
        }
        w20Var.c(x2Var3, z19, z10);
        w20Var.c(x2Var5, false, z10);
        w20Var.c(x2Var4, false, z10);
        w20Var.c(x2Var2, false, z10);
        w20Var.c(x2Var, false, z10);
    }

    public final void I1() {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        TLObject chat;
        ChatObject.Call call;
        TLRPC.GroupCall groupCall;
        TLRPC.GroupCall groupCall2;
        int i13;
        int i14;
        TLRPC.Chat chat2;
        TLRPC.Chat chat3;
        ChatObject.Call call2 = this.W0;
        org.telegram.ui.ActionBar.w0 w0Var = this.f41895g1;
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f41903i1;
        if (call2 == null || call2.isScheduled()) {
            this.f41899h1.setVisibility(4);
            w0Var2.setVisibility(8);
            if (this.W0 == null) {
                w0Var.setVisibility(8);
                return;
            }
        }
        if (this.f41898h0) {
            return;
        }
        AccountInstance accountInstance = this.d;
        TLRPC.Chat chat4 = accountInstance.getMessagesController().getChat(Long.valueOf(i1()));
        if (chat4 != null) {
            this.V0 = chat4;
        }
        boolean canUserDoAdminAction = ChatObject.canUserDoAdminAction(this.V0, 3);
        org.telegram.ui.ActionBar.g1 g1Var = this.f41907j1;
        if (!canUserDoAdminAction && (((ChatObject.isChannel(this.V0) && ((chat3 = this.V0) == null || !chat3.megagroup)) || (!ChatObject.isPublic(this.V0) && !ChatObject.canUserDoAdminAction(this.V0, 3))) && (!ChatObject.isChannel(this.V0) || (chat2 = this.V0) == null || chat2.megagroup || !ChatObject.isPublic(chat2)))) {
            g1Var.setVisibility(8);
        } else {
            g1Var.setVisibility(0);
        }
        ChatObject.Call call3 = this.W0;
        org.telegram.ui.ActionBar.g1 g1Var2 = this.f41952u1;
        org.telegram.ui.ActionBar.g1 g1Var3 = this.f41948t1;
        if (call3 != null && (groupCall2 = call3.call) != null && groupCall2.can_change_messages_enabled) {
            if (groupCall2.messages_enabled) {
                i13 = 8;
            } else {
                i13 = 0;
            }
            g1Var3.setVisibility(i13);
            if (this.W0.call.messages_enabled) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            g1Var2.setVisibility(i14);
        } else {
            g1Var3.setVisibility(8);
            g1Var2.setVisibility(8);
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.W0.participants.f(MessageObject.getPeerId(this.f41960w0));
        ChatObject.Call call4 = this.W0;
        org.telegram.ui.ActionBar.g1 g1Var4 = this.f41917m1;
        if (call4 != null && !call4.isScheduled() && (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted)) {
            g1Var4.setVisibility(0);
        } else {
            g1Var4.setVisibility(8);
        }
        if (SharedConfig.noiseSupression) {
            i10 = R.drawable.msg_noise_on;
        } else {
            i10 = R.drawable.msg_noise_off;
        }
        g1Var4.setIcon(i10);
        if (SharedConfig.noiseSupression) {
            i11 = R.string.VoipNoiseCancellationEnabled;
        } else {
            i11 = R.string.VoipNoiseCancellationDisabled;
        }
        g1Var4.setSubtext(LocaleController.getString(i11));
        boolean Q0 = Q0();
        org.telegram.ui.ActionBar.g1 g1Var5 = this.f41944s1;
        org.telegram.ui.ActionBar.g1 g1Var6 = this.f41911k1;
        boolean z12 = true;
        org.telegram.ui.ActionBar.g1 g1Var7 = this.f41926o1;
        org.telegram.ui.ActionBar.g1 g1Var8 = this.f41930p1;
        if (Q0) {
            g1Var5.setVisibility(0);
            g1Var6.setVisibility(0);
            if (r1()) {
                g1Var7.setVisibility(0);
                g1Var8.setVisibility(8);
            } else if (this.W0.isScheduled()) {
                g1Var7.setVisibility(8);
                g1Var8.setVisibility(8);
            } else {
                g1Var7.setVisibility(0);
            }
            if (o1()) {
                g1Var7.setVisibility(8);
                g1Var6.setVisibility(8);
            }
            if (this.W0.canRecordVideo() && !this.W0.isScheduled() && !r1()) {
                g1Var8.setVisibility(0);
            } else {
                g1Var8.setVisibility(8);
            }
            w0Var2.setVisibility(8);
            boolean z13 = this.W0.recording;
            m50 m50Var = this.Z0;
            m50Var.f40424f = z13;
            m50Var.d = 1.0f;
            m50Var.invalidateSelf();
            if (this.W0.recording) {
                if (this.f41975z1 == null) {
                    d20 d20Var = new d20(this, 6);
                    this.f41975z1 = d20Var;
                    AndroidUtilities.runOnUIThread(d20Var, 1000L);
                }
                g1Var7.setText(LocaleController.getString(R.string.VoipGroupStopRecordCall));
            } else {
                d20 d20Var2 = this.f41975z1;
                if (d20Var2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(d20Var2);
                    this.f41975z1 = null;
                }
                g1Var7.setText(LocaleController.getString(R.string.VoipGroupRecordCall));
            }
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(true) == 2) {
                g1Var8.g(LocaleController.getString(R.string.VoipChatStopScreenCapture), R.drawable.msg_screencast_off, null);
            } else {
                g1Var8.g(LocaleController.getString(R.string.VoipChatStartScreenCapture), R.drawable.msg_screencast, null);
            }
            K1();
        } else {
            if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !Q0()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(true) == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z10 && ((this.W0.canRecordVideo() || z11) && !this.W0.isScheduled() && !r1())) {
                if (z11) {
                    w0Var2.setVisibility(8);
                    g1Var8.setVisibility(0);
                    g1Var8.g(LocaleController.getString(R.string.VoipChatStopScreenCapture), R.drawable.msg_screencast_off, null);
                    g1Var8.setContentDescription(LocaleController.getString(R.string.VoipChatStopScreenCapture));
                } else {
                    g1Var8.g(LocaleController.getString(R.string.VoipChatStartScreenCapture), R.drawable.msg_screencast, null);
                    g1Var8.setContentDescription(LocaleController.getString(R.string.VoipChatStartScreenCapture));
                    w0Var2.setVisibility(8);
                    g1Var8.setVisibility(0);
                }
            } else {
                w0Var2.setVisibility(8);
                g1Var8.setVisibility(8);
            }
            g1Var5.setVisibility(8);
            g1Var6.setVisibility(8);
            g1Var7.setVisibility(8);
        }
        boolean Q02 = Q0();
        org.telegram.ui.ActionBar.g1 g1Var9 = this.f41922n1;
        if (Q02 && this.W0.call.can_change_join_muted && !o1()) {
            g1Var9.setVisibility(0);
        } else {
            g1Var9.setVisibility(8);
        }
        if (o1() && ((call = this.W0) == null || (groupCall = call.call) == null || !groupCall.creator)) {
            z12 = false;
        }
        w0Var.I(4, z12);
        if (r1() && !this.W0.isScheduled()) {
            i12 = 8;
        } else {
            i12 = 0;
        }
        this.l1.setVisibility(i12);
        int visibility = g1Var6.getVisibility();
        TextView textView = this.f41961w1;
        if (visibility != 0 && g1Var9.getVisibility() != 0 && g1Var.getVisibility() != 0 && g1Var8.getVisibility() != 0 && g1Var7.getVisibility() != 0 && g1Var5.getVisibility() != 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        org.telegram.ui.Cells.k kVar = this.f41894g0;
        if (((sharedInstance != null && VoIPService.getSharedInstance().hasFewPeers) || this.X0) && !r1() && this.f41960w0 != null) {
            kVar.setVisibility(0);
            long peerId = MessageObject.getPeerId(this.f41960w0);
            if (DialogObject.isUserDialog(peerId)) {
                chat = accountInstance.getMessagesController().getUser(Long.valueOf(peerId));
            } else {
                chat = accountInstance.getMessagesController().getChat(Long.valueOf(-peerId));
            }
            kVar.setObject(chat);
        } else {
            kVar.setVisibility(8);
        }
        TLRPC.Chat chat5 = this.V0;
        if (chat5 != null && !ChatObject.isChannelOrGiga(chat5) && r1() && g1Var.getVisibility() == 8) {
            w0Var.setVisibility(8);
        } else {
            w0Var.setVisibility(0);
        }
        LinearLayout linearLayout = this.f41891f1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        float f9 = 96;
        if (layoutParams.rightMargin != AndroidUtilities.dp(f9)) {
            layoutParams.rightMargin = AndroidUtilities.dp(f9);
            linearLayout.requestLayout();
        }
        ((FrameLayout.LayoutParams) this.f41956v1.getLayoutParams()).rightMargin = 0;
        this.K.setTitleRightMargin(AndroidUtilities.dp(48.0f) * 2);
    }

    public final void J1(int r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.r50.J1(int, boolean):void");
    }

    public final void K1() {
        if (this.W0 == null) {
            return;
        }
        int currentTime = this.d.getConnectionsManager().getCurrentTime();
        ChatObject.Call call = this.W0;
        int i10 = currentTime - call.call.record_start_date;
        boolean z10 = call.recording;
        org.telegram.ui.ActionBar.g1 g1Var = this.f41926o1;
        if (z10) {
            g1Var.setSubtext(AndroidUtilities.formatDuration(i10, false));
        } else {
            g1Var.setSubtext(null);
        }
    }

    public final void L1(boolean z10) {
        float interpolation;
        float f9;
        a40 a40Var = this.N;
        if ((a40Var == null || this.W0 != null) && this.T0 == null) {
            this.S0 = 1.0f;
            this.R0 = 1.0f;
            if (a40Var == null) {
                return;
            }
        }
        int i10 = 4;
        if (!z10) {
            a30 a30Var = this.f41945s2;
            AndroidUtilities.cancelRunOnUIThread(a30Var);
            a30Var.run();
            ChatObject.Call call = this.W0;
            x40 x40Var = this.M;
            if (call != null && !call.isScheduled()) {
                x40Var.setVisibility(0);
            } else {
                x40Var.setVisibility(4);
            }
            boolean isChannelOrGiga = ChatObject.isChannelOrGiga(this.V0);
            org.telegram.ui.ActionBar.g1 g1Var = this.f41944s1;
            if (isChannelOrGiga) {
                g1Var.setText(LocaleController.getString(R.string.VoipChannelCancelChat));
            } else {
                g1Var.setText(LocaleController.getString(R.string.VoipGroupCancelChat));
            }
        }
        float f10 = this.R0;
        if (f10 > 0.6f) {
            interpolation = 1.05f - (org.telegram.ui.Components.jr.f29800f.getInterpolation((f10 - 0.6f) / 0.4f) * 0.05f);
            this.S0 = 1.0f;
            f9 = 1.0f;
        } else {
            org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.f29800f;
            this.S0 = jrVar.getInterpolation(f10 / 0.6f);
            interpolation = 1.05f * jrVar.getInterpolation(this.R0 / 0.6f);
            f9 = this.R0 / 0.6f;
        }
        H1(true);
        float f11 = 1.0f - f9;
        a40Var.setAlpha(f11);
        this.Q.setAlpha(f9);
        this.S.setAlpha(f9);
        w40 w40Var = this.R;
        w40Var.setAlpha(f9);
        w40Var.setScaleX(interpolation);
        w40Var.setScaleY(interpolation);
        y30 y30Var = this.P;
        y30Var.setScaleX(f11);
        y30Var.setScaleY(f11);
        y30Var.setAlpha(f11);
        this.O.setAlpha(f11);
        this.f41895g1.setAlpha(f9);
        if (f11 != 0.0f) {
            i10 = 0;
        }
        if (i10 != a40Var.getVisibility()) {
            a40Var.setVisibility(i10);
            y30Var.setVisibility(i10);
        }
    }

    public final void M1(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        org.telegram.ui.Components.voip.x2 x2Var = this.f41937r;
        if (x2Var != null && x2Var.getVisibility() == 0) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            w20 w20Var = this.f41884e;
            boolean z14 = false;
            if (sharedInstance != null && !r1()) {
                vg.a aVar = (vg.a) w20Var.f49605c.get(x2Var);
                if (aVar != null) {
                    aVar.d.a(true, z10);
                    x2Var.setEnabled(true);
                }
                if (!sharedInstance.isBluetoothOn() && !sharedInstance.isBluetoothWillOn()) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (!z12 && sharedInstance.isSpeakerphoneOn()) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z12) {
                    x2Var.c(R.drawable.calls_bluetooth, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingBluetooth), false, z10);
                } else if (z13) {
                    x2Var.c(R.drawable.calls_speaker, -1, 0, 0.3f, true, LocaleController.getString(R.string.VoipSpeaker), false, z10);
                } else if (sharedInstance.isHeadsetPlugged()) {
                    x2Var.c(R.drawable.calls_headphones, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingHeadset), false, z10);
                } else {
                    x2Var.c(R.drawable.calls_speaker, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipSpeaker), false, z10);
                }
                x2Var.b(z13, z10);
                h1();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.isBluetoothHeadsetConnected()) {
                    i10 = R.drawable.filled_calls_bluetooth_s;
                } else {
                    i10 = R.drawable.filled_sound_on;
                }
                if (this.W != i10) {
                    this.W = i10;
                    AndroidUtilities.updateImageViewImageAnimated(this.X, i10);
                }
                org.telegram.ui.Components.voip.x2 x2Var2 = this.h;
                if (x2Var2.getVisibility() == 0) {
                    x2Var2.c(0, -1, 0, 1.0f, true, f1(h1()), false, z10);
                    if (h1() != 1) {
                        z14 = true;
                    }
                    x2Var2.b(z14, z10);
                    return;
                }
                return;
            }
            x2Var.c(R.drawable.msg_voiceshare, -1, 0, 0.3f, true, LocaleController.getString(R.string.VoipChatShare), false, z10);
            if (!ChatObject.isPublic(this.V0) && (!ChatObject.hasAdminRights(this.V0) || !ChatObject.canAddUsers(this.V0))) {
                z11 = false;
            } else {
                z11 = true;
            }
            vg.a aVar2 = (vg.a) w20Var.f49605c.get(x2Var);
            if (aVar2 != null) {
                aVar2.d.a(z11, z10);
                x2Var.setEnabled(z11);
            }
            x2Var.b(true, false);
        }
    }

    @Override
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        if (i10 == 2) {
            Y0();
            W0();
            X0();
            float f11 = 1.0f - this.f41958v3.f49505e;
            w20 w20Var = this.f41884e;
            w20Var.setAlpha(f11);
            this.W1.setProgressToHideUi(f9);
            this.f41904i2.invalidate();
            this.containerView.invalidate();
            w20Var.invalidate();
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

    public final void N1(boolean r36, boolean r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.r50.N1(boolean, boolean):void");
    }

    public final void O0(boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.r50.O0(boolean):void");
    }

    public final void O1() {
        boolean z10;
        String str;
        float f9;
        float f10;
        p50 p50Var;
        TLRPC.User user;
        TLRPC.Chat chat;
        n40 n40Var = this.K;
        if (n40Var != null && this.W0 != null) {
            SpannableStringBuilder spannableStringBuilder = null;
            int i10 = 0;
            for (int i11 = 0; i11 < this.W0.currentSpeakingPeers.m(); i11++) {
                long j10 = this.W0.currentSpeakingPeers.j(i11);
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.W0.currentSpeakingPeers.f(j10);
                if (!groupCallParticipant.self) {
                    j30 j30Var = this.W1;
                    j30Var.getClass();
                    if (j30Var.f33823w.get(MessageObject.getPeerId(groupCallParticipant.peer)) <= 0 && this.f41967x2.get(j10, 0) != 1) {
                        long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
                        if (spannableStringBuilder == null) {
                            spannableStringBuilder = new SpannableStringBuilder();
                        }
                        if (i10 < 2) {
                            int i12 = (peerId > 0L ? 1 : (peerId == 0L ? 0 : -1));
                            if (i12 > 0) {
                                user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerId));
                            } else {
                                user = null;
                            }
                            if (i12 <= 0) {
                                chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(peerId));
                            } else {
                                chat = null;
                            }
                            if (user != null || chat != null) {
                                if (i10 != 0) {
                                    spannableStringBuilder.append((CharSequence) ", ");
                                }
                                if (user != null) {
                                    spannableStringBuilder.append(UserObject.getFirstName(user), new org.telegram.ui.Components.t41(AndroidUtilities.bold()), 0);
                                } else {
                                    spannableStringBuilder.append(chat.title, new org.telegram.ui.Components.t41(AndroidUtilities.bold()), 0);
                                }
                            }
                        }
                        i10++;
                        if (i10 == 2) {
                            break;
                        }
                    }
                }
            }
            if (i10 > 0) {
                String pluralString = LocaleController.getPluralString("MembersAreSpeakingToast", i10);
                int indexOf = pluralString.indexOf("un1");
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(pluralString);
                spannableStringBuilder2.replace(indexOf, indexOf + 3, (CharSequence) spannableStringBuilder);
                n40Var.getAdditionalSubtitleTextView().k(spannableStringBuilder2);
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.ActionBar.h5 subtitleTextView = n40Var.getSubtitleTextView();
            if (r1()) {
                str = "ViewersWatching";
            } else {
                str = "Participants";
            }
            int i13 = this.W0.call.participants_count;
            l50 l50Var = this.L;
            subtitleTextView.k(LocaleController.formatPluralString(str, i13 + ((l50Var.I.r1() || l50Var.H || VoIPService.getSharedInstance() == null) ? 0 : !VoIPService.getSharedInstance().isJoined()), new Object[0]));
            if (r1() && (p50Var = this.f41966x1) != null) {
                p50Var.setWatchersCount(this.W0.call.participants_count);
            }
            if (z10 != this.f41935q2) {
                this.f41935q2 = z10;
                n40Var.invalidate();
                float f11 = 0.0f;
                n40Var.getSubtitleTextView().setPivotX(0.0f);
                n40Var.getSubtitleTextView().setPivotY(n40Var.getMeasuredHeight() >> 1);
                ViewPropertyAnimator animate = n40Var.getSubtitleTextView().animate();
                if (this.f41935q2) {
                    f9 = 0.98f;
                } else {
                    f9 = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f9);
                if (this.f41935q2) {
                    f10 = 0.9f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f10);
                if (!this.f41935q2) {
                    f11 = 1.0f;
                }
                scaleY.alpha(f11).setDuration(150L);
                AndroidUtilities.updateViewVisibilityAnimated(n40Var.getAdditionalSubtitleTextView(), this.f41935q2);
            }
        }
    }

    public final int P0() {
        x40 x40Var = this.M;
        int childCount = x40Var.getChildCount();
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = x40Var.getChildAt(i11);
            if (RecyclerView.R(childAt) >= 0) {
                i10 = Math.min(i10, childAt.getTop());
            }
        }
        return i10;
    }

    public final void P1(boolean z10) {
        ChatObject.Call call = this.W0;
        b30 b30Var = this.f41869a1;
        if (call == null) {
            if (ChatObject.isChannelOrGiga(this.V0)) {
                b30Var.b(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), z10);
                return;
            } else {
                b30Var.b(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), z10);
                return;
            }
        }
        boolean isEmpty = TextUtils.isEmpty(call.call.title);
        n40 n40Var = this.K;
        if (!isEmpty) {
            if (!this.W0.call.title.equals(n40Var.getTitle())) {
                if (z10) {
                    this.K.I(this.W0.call.title, true, 180L, null);
                    n40Var.getTitleTextView().setOnClickListener(new b20(this, 8));
                } else {
                    n40Var.setTitle(this.W0.call.title);
                }
                b30Var.b(this.W0.call.title, z10);
            }
        } else {
            TLRPC.Chat chat = this.V0;
            if (chat != null && !chat.title.equals(n40Var.getTitle())) {
                if (z10) {
                    this.K.I(this.V0.title, true, 180L, null);
                    n40Var.getTitleTextView().setOnClickListener(new b20(this, 9));
                } else {
                    n40Var.setTitle(this.V0.title);
                }
                if (ChatObject.isChannelOrGiga(this.V0)) {
                    if (r1()) {
                        b30Var.b(this.V0.title, z10);
                    } else {
                        b30Var.b(LocaleController.getString(R.string.VoipChannelVoiceChat), z10);
                    }
                } else {
                    b30Var.b(LocaleController.getString(R.string.VoipGroupVoiceChat), z10);
                }
            } else if (this.V0 == null) {
                n40Var.setTitle(LocaleController.getString(R.string.ConferenceChat));
                b30Var.b(LocaleController.getString(R.string.ConferenceChat), z10);
            }
        }
        org.telegram.ui.ActionBar.h5 titleTextView = n40Var.getTitleTextView();
        if (this.W0.recording) {
            if (titleTextView.getRightDrawable() == null) {
                titleTextView.i(new n50(titleTextView));
                TextView textView = b30Var.getTextView();
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new n50(textView), (Drawable) null);
                TextView nextTextView = b30Var.getNextTextView();
                nextTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new n50(nextTextView), (Drawable) null);
            }
        } else if (titleTextView.getRightDrawable() != null) {
            titleTextView.i(null);
            b30Var.getTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            b30Var.getNextTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public final boolean Q0() {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isConference()) {
            ChatObject.Call call = this.W0;
            if (call != null && (groupCall = call.call) != null && groupCall.creator) {
                return true;
            }
            return false;
        }
        return ChatObject.canManageCalls(this.V0);
    }

    public final void Q1() {
        float f9;
        org.telegram.ui.Components.rb rbVar;
        boolean z10;
        if (this.topBulletinContainer != null) {
            int dp = AndroidUtilities.dp(74.0f);
            float f10 = this.f41951u0 - dp;
            if (this.backgroundPaddingTop + f10 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
                int dp2 = (dp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f);
                f9 = Math.min(1.0f, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - f10) - this.backgroundPaddingTop) / dp2);
                f10 -= (int) ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - dp2) * f9);
            } else {
                f9 = 0.0f;
            }
            float paddingTop = f10 + this.containerView.getPaddingTop();
            FrameLayout frameLayout = this.topBulletinContainer;
            n40 n40Var = this.K;
            frameLayout.setTranslationY(AndroidUtilities.lerp(((-frameLayout.getTop()) - this.topBulletinContainer.getHeight()) + paddingTop + AndroidUtilities.dp(10.0f), n40Var.getY() + (-this.topBulletinContainer.getTop()) + n40Var.getHeight(), f9));
            org.telegram.ui.Components.mc mcVar = org.telegram.ui.Components.mc.f30644w;
            if (mcVar != null && (rbVar = mcVar.f30648e) != null && rbVar.getParent() != null && rbVar.getParent().getParent() == this.topBulletinContainer) {
                if (f9 > 0.5f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                rbVar.setTop(z10);
            }
        }
    }

    public final void R0() {
        if (this.N1) {
            this.N1 = false;
            AndroidUtilities.cancelRunOnUIThread(this.f41953u2);
        }
        if (this.O1) {
            this.O1 = false;
            MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
            this.f41959w.onTouchEvent(obtain);
            obtain.recycle();
        }
    }

    public final void S0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.r50.S0():void");
    }

    public final void T0() {
        this.B.setTranslationY((-this.f41971y1.c()) + this.containerView.getPaddingBottom());
        this.C.invalidate();
        Z0();
        Y0();
        W0();
        X0();
        a1();
        this.f41884e.setAlpha(1.0f - this.f41958v3.f49505e);
        U0();
        V0();
    }

    public final void U0() {
        int i10;
        float f9 = this.f41971y1.f750b.f49531a;
        if (f9 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        u30 u30Var = this.B;
        u30Var.setAlpha(f9);
        t30 t30Var = this.C;
        t30Var.setAlpha(f9);
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
        int i10;
        org.telegram.ui.Components.fk0 fk0Var = this.G;
        if (fk0Var != null) {
            float f9 = this.f41971y1.f750b.f49531a * this.f41963w3.f49505e;
            fk0Var.setAlpha(f9);
            if (f9 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            if (this.G.getVisibility() != i10) {
                this.G.setVisibility(i10);
                if (i10 == 8) {
                    this.G.n();
                }
            }
            org.telegram.ui.Components.fk0 fk0Var2 = this.G;
            if (!fk0Var2.J0 && f9 == 1.0f) {
                fk0Var2.J0 = true;
            }
        }
    }

    public final void W0() {
        boolean z10 = C3;
        w20 w20Var = this.f41884e;
        if (z10) {
            w20Var.setTranslationX(0.0f);
            w20Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = B3;
        vd.a aVar = this.f41958v3;
        if (z11) {
            w20Var.setTranslationX(aVar.f49505e * AndroidUtilities.dp(94.0f));
            w20Var.setTranslationY(0.0f);
            return;
        }
        w20Var.setTranslationX(0.0f);
        w20Var.setTranslationY(aVar.f49505e * AndroidUtilities.dp(94.0f));
    }

    public final void X0() {
        boolean z10 = C3;
        f30 f30Var = this.f41904i2;
        if (z10) {
            f30Var.setTranslationX(0.0f);
            f30Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = B3;
        vd.a aVar = this.f41958v3;
        if (z11) {
            f30Var.setTranslationX(aVar.f49505e * AndroidUtilities.dp(94.0f));
            f30Var.setTranslationY(0.0f);
            return;
        }
        f30Var.setTranslationX(0.0f);
        f30Var.setTranslationY(aVar.f49505e * AndroidUtilities.dp(94.0f));
    }

    public final void Y0() {
        float dp;
        float f9 = this.f41968x3.f49510e;
        ah.i iVar = this.f41971y1;
        float f10 = -((iVar.c() - this.containerView.getPaddingBottom()) + f9 + (AndroidUtilities.dp(68.0f) * this.f41963w3.f49505e) + AndroidUtilities.dp(10.0f));
        if (C3) {
            dp = (1.0f - this.f41973y3.f49505e) * AndroidUtilities.dp(-91.0f);
        } else if (B3) {
            dp = 0.0f;
        } else {
            dp = ((this.f41958v3.f49505e * AndroidUtilities.dp(94.0f)) - (AndroidUtilities.dp(104.0f) * this.W1.f33798c)) - AndroidUtilities.dp(91.0f);
        }
        float lerp = AndroidUtilities.lerp(dp, f10, iVar.f750b.f49531a);
        float measuredHeight = ((this.containerView.getMeasuredHeight() - this.f41951u0) + lerp) - this.backgroundPaddingTop;
        float max = Math.max((measuredHeight / 3.0f) * 2.0f, measuredHeight - AndroidUtilities.dp(250.0f));
        wg.h hVar = this.Y;
        hVar.setTranslationY(lerp);
        hVar.setVisibleHeight((int) max);
    }

    public final void Z0() {
        if (this.G != null) {
            this.G.setTranslationY((-this.f41971y1.c()) + this.containerView.getPaddingBottom() + ((-this.f41963w3.f49505e) * AndroidUtilities.dp(64.0f)));
        }
    }

    public final void a1() {
        boolean z10;
        float f9 = this.f41963w3.f49505e;
        float lerp = AndroidUtilities.lerp(0.25f, 1.0f, f9);
        ImageView imageView = this.F;
        imageView.setScaleX(lerp);
        imageView.setScaleY(AndroidUtilities.lerp(0.25f, 1.0f, f9));
        imageView.setAlpha(f9);
        boolean z11 = false;
        if (f9 > 0.9f) {
            z10 = true;
        } else {
            z10 = false;
        }
        imageView.setClickable(z10);
        float f10 = 1.0f - f9;
        float lerp2 = AndroidUtilities.lerp(0.25f, 1.0f, f10);
        ImageView imageView2 = this.E;
        imageView2.setScaleX(lerp2);
        imageView2.setScaleY(AndroidUtilities.lerp(0.25f, 1.0f, f10));
        imageView2.setAlpha(f10);
        if (f10 > 0.9f) {
            z11 = true;
        }
        imageView2.setClickable(z11);
    }

    public final void b1() {
        org.telegram.ui.Components.voip.u uVar = this.V2;
        if (uVar != null) {
            uVar.f34014a.setRoundCorners(AndroidUtilities.dp(8.0f));
            org.telegram.ui.Components.voip.u uVar2 = this.V2;
            uVar2.h = false;
            uVar2.j(false);
            this.V2.invalidate();
            this.W1.invalidate();
        }
        org.telegram.ui.Cells.c4 c4Var = this.T2;
        if (c4Var != null && !this.X2 && c4Var.getParent() != null) {
            this.containerView.removeView(this.T2);
        }
        org.telegram.ui.Cells.c4 c4Var2 = this.T2;
        if (c4Var2 != null) {
            c4Var2.setProgressToAvatarPreview(0.0f);
            this.T2.setAboutVisible(false);
            this.T2.getAvatarImageView().setAlpha(1.0f);
        }
        org.telegram.ui.Components.n20 n20Var = this.W2;
        if (n20Var != null) {
            n20Var.getAvatarImageView().setAlpha(1.0f);
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
        return !this.W1.f33796b;
    }

    public final void d1(boolean z10) {
        if (!this.Y2 && this.f41874b2) {
            if (z10) {
                this.Y2 = true;
                y1(false, this.T2);
                return;
            }
            b1();
            this.containerView.removeView(this.a2);
            this.a2 = null;
            this.f41972y2.setVisibility(8);
            this.containerView.invalidate();
            this.f41874b2 = false;
            this.U.X = true;
            this.M.invalidate();
            this.X1.setVisibility(8);
            if (this.f41925o0) {
                this.f41925o0 = false;
                O0(true);
            }
            S0();
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ConferenceCall conferenceCall;
        TLRPC.GroupCallParticipant groupCallParticipant;
        int i12;
        int i13;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        int i14;
        int i15;
        String string;
        boolean z10;
        ChatObject.VideoParticipant videoParticipant;
        boolean z11;
        VoIPService sharedInstance;
        int i16;
        int i17;
        int i18 = NotificationCenter.groupCallUpdated;
        String[] strArr = null;
        x40 x40Var = this.M;
        int i19 = 0;
        if (i10 == i18) {
            Long l10 = (Long) objArr[1];
            ChatObject.Call call = this.W0;
            if (call != null && call.call.f22402id == l10.longValue()) {
                ChatObject.Call call2 = this.W0;
                if (call2.call instanceof TLRPC.TL_groupCallDiscarded) {
                    dismiss();
                    return;
                }
                long j10 = this.f41929p0;
                AccountInstance accountInstance = this.d;
                if (j10 == 0 && (((i17 = this.B1) == 7 || i17 == 5 || i17 == 6) && !call2.isScheduled())) {
                    try {
                        Intent intent = new Intent(this.f41885e0, VoIPService.class);
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
                        intent.putExtra("scheduleDate", this.f41896g2);
                        this.f41885e0.startService(intent);
                    } catch (Throwable th2) {
                        FileLog.e(th2);
                    }
                    this.f41929p0 = SystemClock.elapsedRealtime();
                    AndroidUtilities.runOnUIThread(new d20(this, 2), 3000L);
                }
                if (!this.f41933q0 && VoIPService.getSharedInstance() != null) {
                    this.W0.addSelfDummyParticipant(false);
                    l1();
                    VoIPService.getSharedInstance().playConnectedSound();
                }
                I1();
                int childCount = x40Var.getChildCount();
                for (int i20 = 0; i20 < childCount; i20++) {
                    View childAt = x40Var.getChildAt(i20);
                    if (childAt instanceof org.telegram.ui.Cells.c4) {
                        ((org.telegram.ui.Cells.c4) childAt).a(true, false);
                    }
                }
                if (this.T2 != null) {
                    this.f41925o0 = true;
                } else {
                    O0(true);
                }
                O1();
                boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                if (this.B1 == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                N1(true, booleanValue);
                P1(true);
                if (z11 && ((i16 = this.B1) == 1 || i16 == 0)) {
                    k1().j(38, 0L, null);
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().playAllowTalkSound();
                    }
                }
                if (objArr.length >= 4) {
                    Long l11 = (Long) objArr[3];
                    long longValue = l11.longValue();
                    if (longValue != 0 && !r1()) {
                        if (!o1() || (sharedInstance = VoIPService.getSharedInstance()) == null || longValue != sharedInstance.convertingFromCallWithUserId) {
                            try {
                                ArrayList<TLRPC.Dialog> allDialogs = accountInstance.getMessagesController().getAllDialogs();
                                if (allDialogs != null) {
                                    int size = allDialogs.size();
                                    int i21 = 0;
                                    while (true) {
                                        if (i21 >= size) {
                                            break;
                                        }
                                        TLRPC.Dialog dialog = allDialogs.get(i21);
                                        i21++;
                                        if (dialog.f22396id == longValue) {
                                            i19 = 1;
                                            break;
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                            }
                            if (DialogObject.isUserDialog(longValue)) {
                                TLRPC.User user = accountInstance.getMessagesController().getUser(l11);
                                if (user != null) {
                                    if (this.W0.call.participants_count < 250 || UserObject.isContact(user) || user.verified || i19 != 0) {
                                        k1().k(0L, 44, user, this.V0, null, null);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(-longValue));
                            if (chat != null) {
                                if (this.W0.call.participants_count < 250 || !ChatObject.isNotInChat(chat) || chat.verified || i19 != 0) {
                                    k1().k(0L, 44, chat, this.V0, null, null);
                                }
                            }
                        }
                    }
                }
            }
        } else if (i10 == NotificationCenter.groupCallSpeakingUsersUpdated) {
            j30 j30Var = this.W1;
            if (j30Var.f33796b && this.W0 != null) {
                boolean c3 = j30Var.c();
                ChatObject.Call call3 = this.W0;
                if (call3 != null && j30Var.f33796b && (videoParticipant = j30Var.f33801e) != null && call3.participants.f(MessageObject.getPeerId(videoParticipant.participant.peer)) == null) {
                    c3 = true;
                }
                if (c3) {
                    ChatObject.VideoParticipant videoParticipant2 = null;
                    int i22 = 0;
                    while (true) {
                        ArrayList arrayList = this.m0;
                        if (i22 >= arrayList.size()) {
                            break;
                        }
                        ChatObject.VideoParticipant videoParticipant3 = (ChatObject.VideoParticipant) arrayList.get(i22);
                        if (this.W0.currentSpeakingPeers.g(null, MessageObject.getPeerId(videoParticipant3.participant.peer)) != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            TLRPC.GroupCallParticipant groupCallParticipant3 = videoParticipant3.participant;
                            if (!groupCallParticipant3.muted_by_you && j30Var.d != MessageObject.getPeerId(groupCallParticipant3.peer)) {
                                videoParticipant2 = videoParticipant3;
                            }
                        }
                        i22++;
                    }
                    if (videoParticipant2 != null) {
                        e1(videoParticipant2);
                    }
                }
            }
            j30Var.setVisibleParticipant(true);
            O1();
        } else if (i10 == NotificationCenter.webRtcMicAmplitudeEvent) {
            C1(((Float) objArr[0]).floatValue());
        } else if (i10 == NotificationCenter.needShowAlert) {
            if (((Integer) objArr[0]).intValue() == 6) {
                String str = (String) objArr[1];
                if ("GROUPCALL_PARTICIPANTS_TOO_MUCH".equals(str)) {
                    if (ChatObject.isChannelOrGiga(this.V0)) {
                        string = LocaleController.getString(R.string.VoipChannelTooMuch);
                    } else {
                        string = LocaleController.getString(R.string.VoipGroupTooMuch);
                    }
                } else if (!"ANONYMOUS_CALLS_DISABLED".equals(str) && !"GROUPCALL_ANONYMOUS_FORBIDDEN".equals(str)) {
                    string = LocaleController.getString(R.string.ErrorOccurred) + "\n" + str;
                } else if (ChatObject.isChannelOrGiga(this.V0)) {
                    string = LocaleController.getString(R.string.VoipChannelJoinAnonymousAdmin);
                } else {
                    string = LocaleController.getString(R.string.VoipGroupJoinAnonymousAdmin);
                }
                AlertDialog$Builder N = org.telegram.ui.Components.c5.N(getContext(), LocaleController.getString(R.string.VoipGroupVoiceChat), string);
                N.j(new g20(this, 1));
                try {
                    N.o();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        } else if (i10 == NotificationCenter.didEndCall) {
            if (VoIPService.getSharedInstance() == null) {
                dismiss();
            }
        } else if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f22393id == i1()) {
                I1();
                N1(isShowing(), false);
            }
            long peerId = MessageObject.getPeerId(this.f41960w0);
            ChatObject.Call call4 = this.W0;
            if (call4 != null && chatFull.f22393id == (-peerId) && (groupCallParticipant2 = (TLRPC.GroupCallParticipant) call4.participants.f(peerId)) != null) {
                groupCallParticipant2.about = chatFull.about;
                O0(true);
                AndroidUtilities.updateVisibleRows(x40Var);
                if (this.A2 != null) {
                    while (i19 < this.A2.getChildCount()) {
                        View childAt2 = this.A2.getChildAt(i19);
                        if ((childAt2 instanceof org.telegram.ui.ActionBar.g1) && childAt2.getTag() != null && ((Integer) childAt2.getTag()).intValue() == 10) {
                            org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) childAt2;
                            if (TextUtils.isEmpty(groupCallParticipant2.about)) {
                                i14 = R.string.VoipAddDescription;
                            } else {
                                i14 = R.string.VoipEditDescription;
                            }
                            String string2 = LocaleController.getString(i14);
                            if (TextUtils.isEmpty(groupCallParticipant2.about)) {
                                i15 = R.drawable.msg_addbio;
                            } else {
                                i15 = R.drawable.msg_info;
                            }
                            g1Var.g(string2, i15, null);
                        }
                        i19++;
                    }
                }
            }
        } else if (i10 == NotificationCenter.didLoadChatAdmins) {
            if (((Long) objArr[0]).longValue() == i1()) {
                I1();
                N1(isShowing(), false);
            }
        } else if (i10 == NotificationCenter.applyGroupCallVisibleParticipants) {
            int childCount2 = x40Var.getChildCount();
            long longValue2 = ((Long) objArr[0]).longValue();
            while (i19 < childCount2) {
                f2.n1 G = x40Var.G(x40Var.getChildAt(i19));
                if (G != null) {
                    View view = G.f6432a;
                    if (view instanceof org.telegram.ui.Cells.c4) {
                        org.telegram.ui.Cells.c4 c4Var = (org.telegram.ui.Cells.c4) view;
                        if (c4Var.getParticipant() != null) {
                            c4Var.getParticipant().lastVisibleDate = longValue2;
                        }
                    }
                }
                i19++;
            }
        } else if (i10 == NotificationCenter.userInfoDidLoad) {
            Long l12 = (Long) objArr[0];
            long peerId2 = MessageObject.getPeerId(this.f41960w0);
            if (this.W0 != null && peerId2 == l12.longValue() && (groupCallParticipant = (TLRPC.GroupCallParticipant) this.W0.participants.f(peerId2)) != null) {
                groupCallParticipant.about = ((TLRPC.UserFull) objArr[1]).about;
                O0(true);
                AndroidUtilities.updateVisibleRows(x40Var);
                if (this.A2 != null) {
                    while (i19 < this.A2.getChildCount()) {
                        View childAt3 = this.A2.getChildAt(i19);
                        if ((childAt3 instanceof org.telegram.ui.ActionBar.g1) && childAt3.getTag() != null && ((Integer) childAt3.getTag()).intValue() == 10) {
                            org.telegram.ui.ActionBar.g1 g1Var2 = (org.telegram.ui.ActionBar.g1) childAt3;
                            if (TextUtils.isEmpty(groupCallParticipant.about)) {
                                i12 = R.string.VoipAddBio;
                            } else {
                                i12 = R.string.VoipEditBio;
                            }
                            String string3 = LocaleController.getString(i12);
                            if (TextUtils.isEmpty(groupCallParticipant.about)) {
                                i13 = R.drawable.msg_addbio;
                            } else {
                                i13 = R.drawable.msg_info;
                            }
                            g1Var2.g(string3, i13, null);
                        }
                        i19++;
                    }
                }
            }
        } else if (i10 == NotificationCenter.mainUserInfoChanged) {
            O0(true);
            AndroidUtilities.updateVisibleRows(x40Var);
        } else if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0) {
                O0(true);
            }
            if ((MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0 || (intValue & MessagesController.UPDATE_MASK_EMOJI_STATUS) != 0) {
                AndroidUtilities.updateVisibleRows(x40Var);
            }
        } else if (i10 == NotificationCenter.groupCallScreencastStateChanged) {
            d40 d40Var = this.f41955v0;
            if (d40Var != null) {
                d40Var.b(true, true);
            }
            I1();
        } else if (i10 == NotificationCenter.conferenceEmojiUpdated) {
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            b50 b50Var = this.f41914l0;
            if (sharedInstance2 != null && (conferenceCall = sharedInstance2.conference) != null) {
                strArr = conferenceCall.getEmojis();
            }
            b50Var.b(strArr);
        }
    }

    @Override
    public final void dismiss() {
        LaunchActivity launchActivity = this.f41885e0;
        launchActivity.W0.remove(this.f41940r2);
        this.f41885e0.setRequestedOrientation(-1);
        A3 = false;
        org.telegram.ui.Components.p30 p30Var = this.A1;
        if (p30Var != null) {
            p30Var.dismiss();
        }
        this.f41925o0 = true;
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
            if (this.f41918m2 != null) {
                this.M.getViewTreeObserver().removeOnPreDrawListener(this.f41918m2);
                this.f41918m2 = null;
            }
            ArrayList arrayList = this.V1;
            arrayList.clear();
            ArrayList arrayList2 = this.U1;
            arrayList.addAll(arrayList2);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((org.telegram.ui.Components.voip.u) arrayList.get(i10)).f();
                j30Var.removeView((View) arrayList.get(i10));
                ((org.telegram.ui.Components.voip.u) arrayList.get(i10)).e();
                ((org.telegram.ui.Components.voip.u) arrayList.get(i10)).b(true);
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
        if (f41867z3 == this) {
            f41867z3 = null;
        }
        A3 = false;
        VoIPService.audioLevelsCallback = null;
        org.telegram.ui.Components.w20.j(getContext());
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
        int i10;
        if (this.f41885e0 == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0 && ((keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25) && VoIPService.getSharedInstance() != null && Build.VERSION.SDK_INT >= 32)) {
            boolean isSpeakerMuted = WebRtcAudioTrack.isSpeakerMuted();
            AudioManager audioManager = (AudioManager) this.f41885e0.getSystemService("audio");
            boolean z10 = false;
            if (audioManager.getStreamVolume(0) == audioManager.getStreamMinVolume(0) && keyEvent.getKeyCode() == 25) {
                z10 = true;
            }
            WebRtcAudioTrack.setSpeakerMute(z10);
            if (isSpeakerMuted != WebRtcAudioTrack.isSpeakerMuted()) {
                UndoView k12 = k1();
                if (z10) {
                    i10 = 42;
                } else {
                    i10 = 43;
                }
                k12.j(i10, 0L, null);
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e1(ChatObject.VideoParticipant videoParticipant) {
        ChatObject.VideoParticipant videoParticipant2;
        if (videoParticipant == null) {
            this.f41885e0.setRequestedOrientation(-1);
        }
        if (VoIPService.getSharedInstance() != null) {
            j30 j30Var = this.W1;
            if (j30Var.f33816r != null) {
                return;
            }
            boolean z10 = C3;
            x40 x40Var = this.M;
            int i10 = 0;
            if (z10) {
                if (this.f41918m2 != null) {
                    x40Var.getViewTreeObserver().removeOnPreDrawListener(this.f41918m2);
                    this.f41918m2 = null;
                }
                ArrayList arrayList = new ArrayList();
                x50 x50Var = this.f41912k2;
                ArrayList arrayList2 = this.U1;
                ArrayList arrayList3 = this.V1;
                if (videoParticipant == null) {
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) arrayList3.get(i11);
                        org.telegram.ui.Components.voip.l lVar = uVar.f34018c;
                        if (lVar != null) {
                            lVar.setRenderer(null);
                            org.telegram.ui.Components.n20 n20Var = uVar.d;
                            if (n20Var != null) {
                                n20Var.setRenderer(null);
                            }
                            org.telegram.ui.Components.voip.l lVar2 = uVar.f34021e;
                            if (lVar2 != null) {
                                lVar2.setRenderer(null);
                            }
                            arrayList.add(uVar.f34043w);
                            uVar.b(false);
                            uVar.animate().alpha(0.0f).setListener(new e40(this, uVar));
                        }
                    }
                    this.L2 = false;
                    x50Var.H(this.f41908j2, true, true);
                } else {
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        org.telegram.ui.Components.voip.u uVar2 = (org.telegram.ui.Components.voip.u) arrayList3.get(i12);
                        if (uVar2.f34021e != null && ((videoParticipant2 = uVar2.f34043w) == null || !videoParticipant2.equals(videoParticipant))) {
                            arrayList.add(uVar2.f34043w);
                            uVar2.b(false);
                            org.telegram.ui.Components.n20 n20Var2 = uVar2.d;
                            if (n20Var2 != null) {
                                n20Var2.setRenderer(null);
                            }
                            org.telegram.ui.Components.voip.l lVar3 = uVar2.f34018c;
                            if (lVar3 != null) {
                                lVar3.setRenderer(null);
                            }
                            uVar2.animate().alpha(0.0f).setListener(new f40(this, uVar2));
                        }
                    }
                    this.L2 = true;
                    x50Var.f44473r = false;
                    if (!arrayList.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.voip.o(24, this, arrayList));
                    }
                }
                ViewTreeObserver viewTreeObserver = x40Var.getViewTreeObserver();
                h40 h40Var = new h40(this, videoParticipant, !j30Var.f33796b);
                this.f41918m2 = h40Var;
                viewTreeObserver.addOnPreDrawListener(h40Var);
                return;
            }
            if (this.f41918m2 != null) {
                x40Var.getViewTreeObserver().removeOnPreDrawListener(this.f41918m2);
                this.f41918m2 = null;
            }
            if (videoParticipant != null) {
                f30 f30Var = this.f41904i2;
                if (f30Var.getVisibility() != 0) {
                    f30Var.setVisibility(0);
                    org.telegram.ui.Components.o20 o20Var = this.f41915l2;
                    o20Var.G(f30Var, false);
                    this.f41925o0 = true;
                    if (!j30Var.f33796b) {
                        ArrayList arrayList4 = o20Var.f31236e;
                        f2.j0 j0Var = (f2.j0) f30Var.getLayoutManager();
                        if (j0Var != null) {
                            while (true) {
                                if (i10 >= arrayList4.size()) {
                                    break;
                                } else if (((ChatObject.VideoParticipant) arrayList4.get(i10)).equals(videoParticipant)) {
                                    j0Var.h1(i10, AndroidUtilities.dp(13.0f));
                                    break;
                                } else {
                                    i10++;
                                }
                            }
                        }
                    }
                    ViewTreeObserver viewTreeObserver2 = x40Var.getViewTreeObserver();
                    i40 i40Var = new i40(this, videoParticipant);
                    this.f41918m2 = i40Var;
                    viewTreeObserver2.addOnPreDrawListener(i40Var);
                    return;
                }
                j30Var.j(videoParticipant);
                AndroidUtilities.updateVisibleRows(f30Var);
            } else if (x40Var.getVisibility() != 0) {
                x40Var.setVisibility(0);
                O0(false);
                this.f41925o0 = true;
                ViewTreeObserver viewTreeObserver3 = x40Var.getViewTreeObserver();
                j40 j40Var = new j40(this);
                this.f41918m2 = j40Var;
                viewTreeObserver3.addOnPreDrawListener(j40Var);
            } else {
                ViewTreeObserver viewTreeObserver4 = x40Var.getViewTreeObserver();
                k40 k40Var = new k40(this);
                this.f41918m2 = k40Var;
                viewTreeObserver4.addOnPreDrawListener(k40Var);
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    public final int h1() {
        Integer num = this.f41954u3;
        if (num != null) {
            return num.intValue();
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return 0;
        }
        int currentAudioRoute = sharedInstance.getCurrentAudioRoute();
        if (currentAudioRoute == 0) {
            return 1;
        }
        if (currentAudioRoute == 1) {
            return 0;
        }
        return 2;
    }

    public final long i1() {
        TLRPC.Chat chat = this.V0;
        if (chat == null) {
            return 0L;
        }
        return chat.f22392id;
    }

    public final void j1(boolean z10) {
        boolean z11;
        String str;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        AccountInstance accountInstance = this.d;
        TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(i1()));
        if (chat != null && !ChatObject.isPublic(chat)) {
            TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(i1());
            String publicUsername = ChatObject.getPublicUsername(this.V0);
            if (!TextUtils.isEmpty(publicUsername)) {
                str = a4.w.o(accountInstance.getMessagesController().linkPrefix, "/", publicUsername, new StringBuilder());
            } else if (chatFull != null && (tL_chatInviteExported = chatFull.exported_invite) != null) {
                str = tL_chatInviteExported.link;
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                tL_messages_exportChatInvite.peer = MessagesController.getInputPeer(this.V0);
                accountInstance.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new jh.j7(this, chatFull, z10, 5));
                return;
            }
            u1(null, str, true, z10);
        } else if (this.W0 != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                exportgroupcallinvite.call = this.W0.getInputGroupCall();
                if (i10 == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                exportgroupcallinvite.can_self_unmute = z11;
                accountInstance.getConnectionsManager().sendRequest(exportgroupcallinvite, new org.telegram.messenger.voip.l0(this, i10, z10, 1));
            }
        }
    }

    public final UndoView k1() {
        if (!C3) {
            j30 j30Var = this.W1;
            if (j30Var.f33796b) {
                return j30Var.getUndoView();
            }
        }
        UndoView[] undoViewArr = this.f41890f0;
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
        int i10;
        if (!this.f41933q0 && (sharedInstance = VoIPService.getSharedInstance()) != null) {
            this.f41933q0 = true;
            this.f41974z0.addAll(this.W0.visibleParticipants);
            this.A0.addAll(this.m0);
            this.B0.addAll(this.W0.invitedUsers);
            this.C0.addAll(this.W0.shadyJoinParticipants);
            this.D0.addAll(this.W0.shadyLeftParticipants);
            this.P1 = sharedInstance.getCallState();
            if (this.W0 == null) {
                ChatObject.Call call = sharedInstance.groupCall;
                this.W0 = call;
                this.f41915l2.f31235c = call;
                this.W1.setGroupCall(call);
                this.f41912k2.f44469c = this.W0;
            }
            wg.h hVar = this.Y;
            if (hVar != null) {
                hVar.C0(this.d.getCurrentAccount(), this.W0.getInputGroupCall(false));
            }
            this.K.setTitleRightMargin(AndroidUtilities.dp(48.0f) * 2);
            this.W0.saveActiveDates();
            VoIPService.getSharedInstance().registerStateListener(this);
            w40 w40Var = this.R;
            if (w40Var != null && w40Var.getVisibility() == 0) {
                this.f41942s.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Dg, false), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, true);
                M1(true);
                if (ChatObject.isChannelOrGiga(this.V0)) {
                    i10 = R.string.VoipChannelEndChat;
                } else {
                    i10 = R.string.VoipGroupEndChat;
                }
                this.f41944s1.setText(LocaleController.getString(i10));
                x40 x40Var = this.M;
                x40Var.setVisibility(0);
                org.telegram.ui.ActionBar.w0 w0Var = this.f41899h1;
                w0Var.setVisibility(0);
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(x40Var, property, 0.0f, 1.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(x40Var, View.TRANSLATION_Y, AndroidUtilities.dp(200.0f), 0.0f);
                Property property2 = View.SCALE_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(w40Var, property2, 0.0f);
                Property property3 = View.SCALE_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(w40Var, property3, 0.0f);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(w40Var, property, 0.0f);
                org.telegram.ui.ActionBar.h5 h5Var = this.Q;
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(h5Var, property2, 0.0f);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(h5Var, property3, 0.0f);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(h5Var, property, 0.0f);
                org.telegram.ui.ActionBar.h5 h5Var2 = this.S;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(h5Var2, property2, 0.0f), ObjectAnimator.ofFloat(h5Var2, property3, 0.0f), ObjectAnimator.ofFloat(h5Var2, property, 0.0f), ObjectAnimator.ofFloat(w0Var, property2, 0.0f, 1.0f), ObjectAnimator.ofFloat(w0Var, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(w0Var, property, 0.0f, 1.0f));
                animatorSet.setInterpolator(org.telegram.ui.Components.jr.f29801g);
                animatorSet.addListener(new l40(this, 0));
                animatorSet.setDuration(300L);
                animatorSet.start();
            }
        }
    }

    public final void m1(final long j10, final boolean z10) {
        if (this.W0 != null) {
            AccountInstance accountInstance = this.d;
            final TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(j10));
            if (user != null) {
                final org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(getContext(), 3, null)};
                final TL_phone.inviteToGroupCall invitetogroupcall = new TL_phone.inviteToGroupCall();
                invitetogroupcall.call = this.W0.getInputGroupCall();
                TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                tL_inputUser.user_id = user.f22539id;
                tL_inputUser.access_hash = user.access_hash;
                invitetogroupcall.users.add(tL_inputUser);
                int sendRequest = accountInstance.getConnectionsManager().sendRequest(invitetogroupcall, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        r50 r50Var = r50.this;
                        long j11 = j10;
                        org.telegram.ui.ActionBar.c2[] c2VarArr2 = c2VarArr;
                        if (tLObject != null) {
                            r50Var.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                            AndroidUtilities.runOnUIThread(new org.telegram.messenger.sg(r50Var, j11, c2VarArr2, user, 8));
                            return;
                        }
                        AndroidUtilities.runOnUIThread(new jh.i(r50Var, c2VarArr2, z10, tL_error, j11, invitetogroupcall));
                    }
                });
                if (sendRequest != 0) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.rm(this, c2VarArr, sendRequest, 27), 500L);
                }
            }
        }
    }

    public final boolean n1() {
        float f9;
        int dp = AndroidUtilities.dp(74.0f);
        float f10 = this.f41951u0 - dp;
        if (this.backgroundPaddingTop + f10 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
            f9 = Math.min(1.0f, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - f10) - this.backgroundPaddingTop) / ((dp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f)));
        } else {
            f9 = 0.0f;
        }
        if (f9 > 0.5f) {
            return true;
        }
        return false;
    }

    public final boolean o1() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isConference()) {
            return true;
        }
        return false;
    }

    @Override
    public final void onAudioSettingsChanged() {
        M1(true);
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            C1(0.0f);
        }
        x40 x40Var = this.M;
        if (x40Var.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(x40Var);
        }
        f30 f30Var = this.f41904i2;
        if (f30Var.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(f30Var);
        }
        ArrayList arrayList = this.V1;
        arrayList.clear();
        arrayList.addAll(this.U1);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((org.telegram.ui.Components.voip.u) arrayList.get(i10)).j(true);
        }
    }

    @Override
    public final void onBackPressed() {
        d40 d40Var = this.f41955v0;
        if (d40Var != null) {
            d40Var.b(false, false);
        } else if (this.f41874b2) {
            d1(true);
        } else if (this.W1.f33796b) {
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
            ((org.telegram.ui.Components.voip.u) arrayList.get(i10)).j(true);
        }
        d40 d40Var = this.f41955v0;
        if (d40Var != null && VoIPService.getSharedInstance() != null) {
            d40Var.h.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LaunchActivity launchActivity = this.f41885e0;
        launchActivity.W0.add(this.f41940r2);
    }

    @Override
    public final boolean onCustomOpenAnimation() {
        A3 = true;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        org.telegram.ui.Components.w20.j(getContext());
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
        if (!r1() || this.W0.visibleVideoParticipants.isEmpty() || (this.W0.visibleVideoParticipants.get(0).aspectRatio != 0.0f && this.W0.visibleVideoParticipants.get(0).aspectRatio < 1.0f)) {
            return false;
        }
        return true;
    }

    public final boolean r1() {
        ChatObject.Call call = this.W0;
        if (call != null && call.call.rtmp_stream) {
            return true;
        }
        return false;
    }

    public final void s1(org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.c2 c2Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
        long j10;
        if (!this.f41943s0) {
            org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f41885e0.O().getFragmentStack().get(this.f41885e0.O().getFragmentStack().size() - 1);
            if (o2Var instanceof tn) {
                boolean P9 = ((tn) o2Var).P9();
                this.f41943s0 = true;
                this.f41947t0 = true;
                ag.w0 w0Var = new ag.w0(f3Var, editTextBoldCursor, z10, c2Var, 18);
                if (P9) {
                    j10 = 200;
                } else {
                    j10 = 0;
                }
                AndroidUtilities.runOnUIThread(w0Var, j10);
                return;
            }
            this.f41943s0 = true;
            this.f41947t0 = true;
            if (f3Var != null) {
                f3Var.setFocusable(true);
            } else if (c2Var != null) {
                c2Var.k(true);
            }
            if (z10) {
                AndroidUtilities.runOnUIThread(new xg(2, editTextBoldCursor), 100L);
            }
        }
    }

    @Override
    public final void show() {
        super.show();
        if (org.telegram.ui.Components.voip.h1.Z.R) {
            org.telegram.ui.Components.voip.h1.j();
        }
    }

    public final void u1(java.lang.String r11, java.lang.String r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.r50.u1(java.lang.String, java.lang.String, boolean, boolean):void");
    }

    public final void v1() {
        ChatObject.Call call = this.W0;
        if (call != null && call.call != null) {
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(getContext(), 3, null);
            c2Var.q(300L);
            TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
            exportgroupcallinvite.call = tL_inputGroupCall;
            TLRPC.GroupCall groupCall = this.W0.call;
            tL_inputGroupCall.f22409id = groupCall.f22402id;
            tL_inputGroupCall.access_hash = groupCall.access_hash;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(exportgroupcallinvite, new x9(this, c2Var, exportgroupcallinvite, 12));
        }
    }

    public final void x1(TLRPC.GroupCallParticipant groupCallParticipant, final long j10, int i10) {
        TLObject chat;
        int i11;
        int i12;
        String str;
        int i13;
        String str2;
        int i14;
        int i15;
        int i16;
        TextView textView;
        int i17;
        int i18;
        String str3;
        String str4;
        int i19;
        int i20;
        int i21;
        int i22;
        EditText editText;
        int i23;
        int i24;
        int i25;
        AlertDialog$Builder alertDialog$Builder;
        float f9;
        int i26;
        int i27;
        int i28;
        int i29;
        int dp;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            AccountInstance accountInstance = this.d;
            int i30 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i30 > 0) {
                chat = accountInstance.getMessagesController().getUser(Long.valueOf(j10));
            } else {
                chat = accountInstance.getMessagesController().getChat(Long.valueOf(-j10));
            }
            TLObject tLObject = chat;
            boolean z10 = true;
            if (i10 != 0 && i10 != 2 && i10 != 3) {
                if (i10 == 6) {
                    this.f41885e0.K0(this.currentAccount);
                    Bundle bundle = new Bundle();
                    if (i30 > 0) {
                        bundle.putLong("user_id", j10);
                    } else {
                        bundle.putLong("chat_id", -j10);
                    }
                    this.f41885e0.p0(new tn(bundle));
                    dismiss();
                } else if (i10 == 8) {
                    this.f41885e0.K0(this.currentAccount);
                    org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f41885e0.O().getFragmentStack().get(this.f41885e0.O().getFragmentStack().size() - 1);
                    if ((o2Var instanceof tn) && ((tn) o2Var).a() == j10) {
                        dismiss();
                        return;
                    }
                    Bundle bundle2 = new Bundle();
                    if (i30 > 0) {
                        bundle2.putLong("user_id", j10);
                    } else {
                        bundle2.putLong("chat_id", -j10);
                    }
                    this.f41885e0.p0(new tn(bundle2));
                    dismiss();
                } else if (i10 == 7) {
                    sharedInstance.editCallMember(tLObject, Boolean.TRUE, null, null, Boolean.FALSE, null);
                    J1(2, true);
                } else if (i10 == 9) {
                    org.telegram.ui.Components.s40 s40Var = this.f41882d2;
                    if (s40Var == null || !s40Var.h()) {
                        TLRPC.User currentUser = accountInstance.getUserConfig().getCurrentUser();
                        org.telegram.ui.Components.s40 s40Var2 = new org.telegram.ui.Components.s40(0, true, true);
                        this.f41882d2 = s40Var2;
                        s40Var2.D = true;
                        s40Var2.N = true;
                        s40Var2.C = true;
                        s40Var2.F = true;
                        s40Var2.O = true;
                        s40Var2.f32469a = this.f41885e0.O().getLastFragment();
                        org.telegram.ui.Components.s40 s40Var3 = this.f41882d2;
                        y40 y40Var = new y40(this, j10);
                        this.f41887e2 = y40Var;
                        s40Var3.f32470b = y40Var;
                        TLRPC.UserProfilePhoto userProfilePhoto = currentUser.photo;
                        s40Var3.o((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : false, new d20(this, 9), new bg.f0(6), 0);
                    }
                } else if (i10 == 10) {
                    String str5 = groupCallParticipant.about;
                    Context context = getContext();
                    int i31 = this.currentAccount;
                    Pattern pattern = org.telegram.ui.Components.c5.f27308a;
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                    if (i30 > 0) {
                        i24 = R.string.UserBio;
                    } else {
                        i24 = R.string.DescriptionPlaceholder;
                    }
                    String string = LocaleController.getString(i24);
                    final org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder2.f22714a;
                    c2Var.N = string;
                    if (i30 > 0) {
                        i25 = R.string.VoipGroupBioEditAlertText;
                    } else {
                        i25 = R.string.DescriptionInfo;
                    }
                    c2Var.P = LocaleController.getString(i25);
                    FrameLayout frameLayout = new FrameLayout(context);
                    frameLayout.setClipChildren(false);
                    if (i30 < 0) {
                        alertDialog$Builder = alertDialog$Builder2;
                        f9 = 8.0f;
                        long j11 = -j10;
                        if (MessagesController.getInstance(i31).getChatFull(j11) == null) {
                            MessagesController.getInstance(i31).loadFullChat(j11, ConnectionsManager.generateClassGuid(), true);
                        }
                    } else {
                        alertDialog$Builder = alertDialog$Builder2;
                        f9 = 8.0f;
                    }
                    NumberTextView numberTextView = new NumberTextView(context);
                    EditText editText2 = new EditText(context);
                    int i32 = org.telegram.ui.ActionBar.g6.f23143hg;
                    editText2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i32, false));
                    if (i30 > 0) {
                        i26 = R.string.UserBio;
                    } else {
                        i26 = R.string.DescriptionPlaceholder;
                    }
                    editText2.setHint(LocaleController.getString(i26));
                    editText2.setTextSize(1, 16.0f);
                    editText2.setBackground(org.telegram.ui.ActionBar.g6.S(context));
                    editText2.setMaxLines(4);
                    editText2.setRawInputType(147457);
                    editText2.setImeOptions(6);
                    if (i30 > 0) {
                        i27 = 70;
                    } else {
                        i27 = 255;
                    }
                    editText2.setFilters(new InputFilter[]{new org.telegram.ui.Components.n3(i27, context, numberTextView)});
                    numberTextView.setCenterAlign(true);
                    numberTextView.setTextSize(15);
                    numberTextView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.B6, false));
                    numberTextView.setImportantForAccessibility(2);
                    if (LocaleController.isRTL) {
                        i28 = 3;
                    } else {
                        i28 = 5;
                    }
                    frameLayout.addView(numberTextView, i7.f6.d(20, 20.0f, i28, 0.0f, 14.0f, 21.0f, 0.0f));
                    if (LocaleController.isRTL) {
                        i29 = AndroidUtilities.dp(24.0f);
                    } else {
                        i29 = 0;
                    }
                    int dp2 = AndroidUtilities.dp(f9);
                    if (LocaleController.isRTL) {
                        dp = 0;
                    } else {
                        dp = AndroidUtilities.dp(24.0f);
                    }
                    editText2.setPadding(i29, dp2, dp, AndroidUtilities.dp(f9));
                    editText2.addTextChangedListener(new org.telegram.ui.Components.dq(i27, numberTextView));
                    AndroidUtilities.updateViewVisibilityAnimated(numberTextView, false, 0.0f, false);
                    editText2.setText(str5);
                    editText2.setSelection(editText2.getText().toString().length());
                    AlertDialog$Builder alertDialog$Builder3 = alertDialog$Builder;
                    alertDialog$Builder3.n(frameLayout);
                    final k3.e eVar = new k3.e(editText2, i31, j10, 2);
                    alertDialog$Builder3.k(LocaleController.getString(R.string.Save), eVar);
                    alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                    c2Var.J = new org.telegram.ui.Components.r1(editText2, 1);
                    frameLayout.addView(editText2, i7.f6.d(-1, -2.0f, 0, 23.0f, 12.0f, 23.0f, 21.0f));
                    editText2.requestFocus();
                    AndroidUtilities.showKeyboard(editText2);
                    editText2.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                        @Override
                        public final boolean onEditorAction(TextView textView2, int i33, KeyEvent keyEvent) {
                            if (i33 == 6 || (j10 > 0 && keyEvent.getKeyCode() == 66)) {
                                org.telegram.ui.ActionBar.c2 c2Var2 = c2Var;
                                if (c2Var2.isShowing()) {
                                    eVar.g(c2Var2, 0);
                                    return true;
                                }
                            }
                            return false;
                        }
                    });
                    c2Var.i(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23375ug, false));
                    c2Var.show();
                    c2Var.o(org.telegram.ui.ActionBar.g6.w0(null, i32, false));
                } else if (i10 == 11) {
                    Context context2 = getContext();
                    int i33 = this.currentAccount;
                    Pattern pattern2 = org.telegram.ui.Components.c5.f27308a;
                    if (DialogObject.isUserDialog(j10)) {
                        TLRPC.User user = MessagesController.getInstance(i33).getUser(Long.valueOf(j10));
                        str3 = user.first_name;
                        str4 = user.last_name;
                    } else {
                        str3 = MessagesController.getInstance(i33).getChat(Long.valueOf(-j10)).title;
                        str4 = null;
                    }
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(context2);
                    if (i30 > 0) {
                        i19 = R.string.VoipEditName;
                    } else {
                        i19 = R.string.VoipEditTitle;
                    }
                    String string2 = LocaleController.getString(i19);
                    org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder4.f22714a;
                    c2Var2.N = string2;
                    LinearLayout g10 = org.telegram.messenger.x3.g(context2, 1);
                    EditText editText3 = new EditText(context2);
                    int i34 = org.telegram.ui.ActionBar.g6.f23143hg;
                    editText3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i34, false));
                    editText3.setTextSize(1, 16.0f);
                    editText3.setMaxLines(1);
                    editText3.setLines(1);
                    editText3.setSingleLine(true);
                    if (LocaleController.isRTL) {
                        i20 = 5;
                    } else {
                        i20 = 3;
                    }
                    editText3.setGravity(i20);
                    editText3.setInputType(49152);
                    if (i30 > 0) {
                        i21 = 5;
                    } else {
                        i21 = 6;
                    }
                    editText3.setImeOptions(i21);
                    if (i30 > 0) {
                        i22 = R.string.FirstName;
                    } else {
                        i22 = R.string.VoipEditTitleHint;
                    }
                    editText3.setHint(LocaleController.getString(i22));
                    editText3.setBackground(org.telegram.ui.ActionBar.g6.S(context2));
                    editText3.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                    editText3.requestFocus();
                    if (i30 > 0) {
                        editText = new EditText(context2);
                        editText.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i34, false));
                        editText.setTextSize(1, 16.0f);
                        editText.setMaxLines(1);
                        editText.setLines(1);
                        editText.setSingleLine(true);
                        if (LocaleController.isRTL) {
                            i23 = 5;
                        } else {
                            i23 = 3;
                        }
                        editText.setGravity(i23);
                        editText.setInputType(49152);
                        editText.setImeOptions(6);
                        editText.setHint(LocaleController.getString(R.string.LastName));
                        editText.setBackground(org.telegram.ui.ActionBar.g6.S(context2));
                        editText.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                    } else {
                        editText = null;
                    }
                    AndroidUtilities.showKeyboard(editText3);
                    g10.addView(editText3, i7.f6.t(-1, -2, 0, 23, 12, 23, 21));
                    if (editText != null) {
                        g10.addView(editText, i7.f6.t(-1, -2, 0, 23, 12, 23, 21));
                    }
                    editText3.setText(str3);
                    editText3.setSelection(editText3.getText().toString().length());
                    if (editText != null) {
                        editText.setText(str4);
                        editText.setSelection(editText.getText().toString().length());
                    }
                    alertDialog$Builder4.n(g10);
                    org.telegram.ui.ActionBar.b2 u1Var = new org.telegram.ui.Components.u1(editText3, j10, i33, editText);
                    alertDialog$Builder4.k(LocaleController.getString(R.string.Save), u1Var);
                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                    c2Var2.J = new eg.g(5, editText3, editText);
                    c2Var2.i(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23375ug, false));
                    c2Var2.show();
                    c2Var2.o(org.telegram.ui.ActionBar.g6.w0(null, i34, false));
                    rd rdVar = new rd(1, c2Var2, u1Var);
                    if (editText != null) {
                        editText.setOnEditorActionListener(rdVar);
                    } else {
                        editText3.setOnEditorActionListener(rdVar);
                    }
                } else if (i10 == 5) {
                    sharedInstance.editCallMember(tLObject, Boolean.TRUE, null, null, null, null);
                    k1().m(0L, tLObject, 35);
                    sharedInstance.setParticipantVolume(groupCallParticipant, 0);
                } else {
                    if ((groupCallParticipant.flags & 128) != 0 && groupCallParticipant.volume == 0) {
                        groupCallParticipant.volume = 10000;
                        groupCallParticipant.volume_by_admin = false;
                        i17 = 1;
                        sharedInstance.editCallMember(tLObject, Boolean.FALSE, null, 10000, null, null);
                    } else {
                        i17 = 1;
                        sharedInstance.editCallMember(tLObject, Boolean.FALSE, null, null, null, null);
                    }
                    sharedInstance.setParticipantVolume(groupCallParticipant, ChatObject.getParticipantVolume(groupCallParticipant));
                    UndoView k12 = k1();
                    if (i10 == i17) {
                        i18 = 31;
                    } else {
                        i18 = 36;
                    }
                    k12.k(0L, i18, tLObject, null, null, null);
                }
            } else if (i10 == 0) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().editCallMember(tLObject, Boolean.TRUE, null, null, null, null);
                    k1().k(0L, 30, tLObject, null, null, null);
                }
            } else {
                AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(getContext());
                int i35 = org.telegram.ui.ActionBar.g6.f23286pg;
                org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder5.f22714a;
                c2Var3.E = i35;
                TextView textView2 = new TextView(getContext());
                int i36 = org.telegram.ui.ActionBar.g6.f23143hg;
                textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i36, false));
                textView2.setTextSize(1, 16.0f);
                if (LocaleController.isRTL) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                textView2.setGravity(i11 | 48);
                FrameLayout frameLayout2 = new FrameLayout(getContext());
                alertDialog$Builder5.n(frameLayout2);
                org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
                e9Var.u(AndroidUtilities.dp(12.0f));
                org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(getContext());
                t9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                frameLayout2.addView(t9Var, i7.f6.d(40, 40.0f, i12 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                e9Var.j(this.currentAccount, tLObject);
                boolean z11 = tLObject instanceof TLRPC.User;
                if (z11) {
                    TLRPC.User user2 = (TLRPC.User) tLObject;
                    t9Var.e(user2, e9Var);
                    str = UserObject.getFirstName(user2);
                } else {
                    TLRPC.Chat chat2 = (TLRPC.Chat) tLObject;
                    t9Var.e(chat2, e9Var);
                    str = chat2.title;
                }
                TextView textView3 = new TextView(getContext());
                textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i36, false));
                textView3.setTextSize(1, 20.0f);
                textView3.setTypeface(AndroidUtilities.bold());
                textView3.setLines(1);
                textView3.setMaxLines(1);
                textView3.setSingleLine(true);
                if (LocaleController.isRTL) {
                    i13 = 5;
                } else {
                    i13 = 3;
                }
                textView3.setGravity(i13 | 16);
                textView3.setEllipsize(TextUtils.TruncateAt.END);
                TLRPC.Chat chat3 = this.V0;
                if (chat3 != null) {
                    str2 = chat3.title;
                } else {
                    str2 = "";
                }
                if (i10 == 2) {
                    if (o1()) {
                        textView3.setText(LocaleController.getString(R.string.VoipConferenceRemoveMemberAlertTitle2));
                        b.p(R.string.VoipConferenceRemoveMemberAlertText2, new Object[]{str}, textView2);
                    } else {
                        textView3.setText(LocaleController.getString(R.string.VoipGroupRemoveMemberAlertTitle2));
                        if (ChatObject.isChannelOrGiga(this.V0)) {
                            b.p(R.string.VoipChannelRemoveMemberAlertText2, new Object[]{str, str2}, textView2);
                        } else {
                            b.p(R.string.VoipGroupRemoveMemberAlertText2, new Object[]{str, str2}, textView2);
                        }
                    }
                } else {
                    textView3.setText(LocaleController.getString(R.string.VoipGroupAddMemberTitle));
                    b.p(R.string.VoipGroupAddMemberText, new Object[]{str, str2}, textView2);
                }
                boolean z12 = LocaleController.isRTL;
                if (z12) {
                    i14 = 5;
                } else {
                    i14 = 3;
                }
                int i37 = i14 | 48;
                int i38 = 76;
                if (z12) {
                    i15 = 21;
                } else {
                    i15 = 76;
                }
                float f10 = i15;
                if (!z12) {
                    i38 = 21;
                }
                frameLayout2.addView(textView3, i7.f6.d(-1, -2.0f, i37, f10, 11.0f, i38, 0.0f));
                if (LocaleController.isRTL) {
                    i16 = 5;
                } else {
                    i16 = 3;
                }
                frameLayout2.addView(textView2, i7.f6.d(-2, -2.0f, i16 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
                if (i10 == 2) {
                    alertDialog$Builder5.k(LocaleController.getString(R.string.VoipGroupUserRemove), new xr(11, this, tLObject));
                } else if (z11) {
                    alertDialog$Builder5.k(LocaleController.getString(R.string.VoipGroupAdd), new d9.a(this, (TLRPC.User) tLObject, j10, 8));
                }
                alertDialog$Builder5.h(LocaleController.getString(R.string.Cancel), null);
                c2Var3.i(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23375ug, false));
                c2Var3.show();
                if (i10 == 2 && (textView = (TextView) c2Var3.d(-1)) != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23393vg, false));
                }
            }
        }
    }

    public final void y1(boolean r18, org.telegram.ui.Cells.c4 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.r50.y1(boolean, org.telegram.ui.Cells.c4):void");
    }

    public final void z1() {
        w5 w5Var = this.f41962w2;
        AndroidUtilities.cancelRunOnUIThread(w5Var);
        if (this.f41957v2 && this.Q0 != null && VoIPService.getSharedInstance() != null && r1() && this.M != null && LiteMode.isEnabled(512)) {
            AndroidUtilities.runOnUIThread(w5Var, 30L);
        }
    }

    @Override
    public final void z(float f9, int i10) {
    }
}
