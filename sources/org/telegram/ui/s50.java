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
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;
import org.webrtc.voiceengine.WebRtcAudioTrack;
public final class s50 extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate, VoIPService.StateListener, ne.d {
    public static s50 D3;
    public static boolean E3;
    public static boolean F3;
    public static boolean G3;
    public static volatile DispatchQueue H3 = new DispatchQueue("updateTextureLightningQueue");
    public static boolean I3;
    public TLRPC.Peer A0;
    public final TextView A1;
    public final a6 A2;
    public final ne.b A3;
    public TLObject B0;
    public final q50 B1;
    public final LongSparseIntArray B2;
    public final ne.e B3;
    public final Paint C0;
    public final qh.i C1;
    public final m30 C2;
    public final ne.b C3;
    public final ArrayList D0;
    public e20 D1;
    public final k30 D2;
    public final Paint E;
    public final ArrayList E0;
    public org.telegram.ui.Components.a40 E1;
    public LinearLayout E2;
    public final u30 F;
    public final ArrayList F0;
    public int F1;
    public boolean F2;
    public final t30 G;
    public final ArrayList G0;
    public boolean G1;
    public final org.telegram.ui.Components.uj0 G2;
    public final r30 H;
    public final ArrayList H0;
    public boolean H1;
    public int H2;
    public final ImageView I;
    public int I0;
    public final Paint I1;
    public boolean I2;
    public final ImageView J;
    public final org.telegram.ui.Components.uj0 J0;
    public final Paint J1;
    public final View J2;
    public org.telegram.ui.Components.cl0 K;
    public final org.telegram.ui.Components.uj0 K0;
    public final r50[] K1;
    public final View K2;
    public final w40 L;
    public boolean L0;
    public float L1;
    public GradientDrawable L2;
    public final org.telegram.ui.Components.q6 M;
    public final org.telegram.ui.Components.ba M0;
    public r50 M1;
    public final int[] M2;
    public final c30 N;
    public final org.telegram.ui.Components.ba N0;
    public r50 N1;
    public final g30 N2;
    public final o40 O;
    public float O0;
    public long O1;
    public boolean O2;
    public final m50 P;
    public float P0;
    public float P1;
    public boolean P2;
    public final y40 Q;
    public float Q0;
    public float Q1;
    public RenderNode Q2;
    public final a40 R;
    public RadialGradient R0;
    public boolean R1;
    public float R2;
    public final TextView S;
    public final Matrix S0;
    public boolean S1;
    public boolean S2;
    public final y30 T;
    public final Paint T0;
    public int T1;
    public final String[] T2;
    public final org.telegram.ui.ActionBar.j5 U;
    public final h50 U0;
    public float U1;
    public ObjectAnimator U2;
    public final x40 V;
    public float V0;
    public int V1;
    public ObjectAnimator V2;
    public final org.telegram.ui.ActionBar.j5 W;
    public float W0;
    public boolean W1;
    public final g40 W2;
    public final g50 X;
    public ValueAnimator X0;
    public final int[] X1;
    public org.telegram.ui.Cells.d4 X2;
    public final org.telegram.ui.Components.xz Y;
    public TLRPC.InputPeer Y0;
    public final ArrayList Y1;
    public org.telegram.ui.Components.voip.l Y2;
    public final ImageReceiver Z;
    public TLRPC.Chat Z0;
    public final ArrayList Z1;
    public org.telegram.ui.Components.voip.t Z2;
    public int f40912a0;
    public ChatObject.Call f40913a1;
    public final j30 a2;
    public org.telegram.ui.Components.z20 f40914a3;
    public final l30 f40915b;
    public final ImageView f40916b0;
    public final boolean f40917b1;
    public final o30 f40918b2;
    public boolean f40919b3;
    public final q20 f40920c;
    public final mh.h f40921c0;
    public final String f40922c1;
    public final b40 f40923c2;
    public boolean f40924c3;
    public final AccountInstance d;
    public final int f40925d0;
    public final n50 f40926d1;
    public float f40927d2;
    public int f40928d3;
    public final w20 e;
    public final RadialProgressView f40929e0;
    public final b30 f40930e1;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f40931e2;
    public AnimatorSet f40932e3;
    public final org.telegram.ui.Components.voip.t2 f40933f;
    public final Drawable f40934f0;
    public final d30 f40935f1;
    public boolean f40936f2;
    public s40 f40937f3;
    public final View f40938g0;
    public final Paint f40939g1;
    public boolean f40940g2;
    public int f40941g3;
    public final org.telegram.ui.Components.voip.t2 h;
    public AnimatorSet f40942h0;
    public ValueAnimator f40943h1;
    public org.telegram.ui.Components.e50 f40944h2;
    public int f40945h3;
    public LaunchActivity f40946i0;
    public float f40947i1;
    public a50 f40948i2;
    public int f40949i3;
    public final UndoView[] f40950j0;
    public final LinearLayout f40951j1;
    public Boolean f40952j2;
    public int f40953j3;
    public final org.telegram.ui.Cells.k f40954k0;
    public final org.telegram.ui.ActionBar.u0 f40955k1;
    public int f40956k2;
    public int f40957k3;
    public boolean f40958l0;
    public final org.telegram.ui.ActionBar.u0 l1;
    public boolean f40959l2;
    public int f40960l3;
    public org.telegram.ui.Components.r40 m0;
    public final org.telegram.ui.ActionBar.u0 f40961m1;
    public final f30 f40962m2;
    public int f40963m3;
    public final org.telegram.ui.Components.voip.t2 f40964n;
    public org.telegram.ui.Components.r40 f40965n0;
    public final org.telegram.ui.ActionBar.e1 f40966n1;
    public final org.telegram.ui.Components.im0 f40967n2;
    public int f40968n3;
    public int f40969o0;
    public final org.telegram.ui.ActionBar.e1 f40970o1;
    public final x50 f40971o2;
    public int f40972o3;
    public d50 f40973p0;
    public final org.telegram.ui.ActionBar.e1 f40974p1;
    public final org.telegram.ui.Components.a30 f40975p2;
    public int f40976p3;
    public final ArrayList f40977q0;
    public final org.telegram.ui.ActionBar.e1 f40978q1;
    public ViewTreeObserver.OnPreDrawListener f40979q2;
    public int f40980q3;
    public final org.telegram.ui.Components.voip.t2 f40981r;
    public m40 f40982r0;
    public final org.telegram.ui.ActionBar.e1 f40983r1;
    public final org.telegram.ui.Components.voip.h f40984r2;
    public int f40985r3;
    public final org.telegram.ui.Components.voip.t2 f40986s;
    public boolean f40987s0;
    public final org.telegram.ui.ActionBar.e1 f40988s1;
    public boolean f40989s2;
    public int f40990s3;
    public long f40991t0;
    public final org.telegram.ui.ActionBar.e1 f40992t1;
    public final ArrayList f40993t2;
    public int f40994t3;
    public boolean f40995u0;
    public final org.telegram.ui.ActionBar.e1 f40996u1;
    public boolean f40997u2;
    public int f40998u3;
    public final org.telegram.ui.Components.voip.t2 v;
    public final RectF f40999v0;
    public final org.telegram.ui.ActionBar.e1 f41000v1;
    public final e20 f41001v2;
    public int f41002v3;
    public final org.telegram.ui.Components.voip.t2 f41003w;
    public boolean f41004w0;
    public final org.telegram.ui.ActionBar.e1 f41005w1;
    public final a30 f41006w2;
    public final t40 f41007w3;
    public final x20 f41008x;
    public boolean f41009x0;
    public final org.telegram.ui.ActionBar.e1 f41010x1;
    public final org.telegram.ui.Components.rc f41011x2;
    public Boolean f41012x3;
    public final ImageView f41013y;
    public float f41014y0;
    public final org.telegram.ui.ActionBar.e1 f41015y1;
    public final e20 f41016y2;
    public Integer y3;
    public d40 f41017z0;
    public final LinearLayout f41018z1;
    public boolean f41019z2;
    public final ne.b f41020z3;

    public s50(final LaunchActivity launchActivity, AccountInstance accountInstance, ChatObject.Call call, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        super((Context) launchActivity, (org.telegram.ui.ActionBar.d6) null, true, true);
        String string;
        int i10;
        final LaunchActivity launchActivity2;
        s50 s50Var;
        TLRPC.Chat chat2;
        ConferenceCall conferenceCall;
        this.E = new Paint(1);
        this.f40950j0 = new UndoView[2];
        this.f40977q0 = new ArrayList();
        this.f40999v0 = new RectF();
        this.C0 = new Paint(1);
        this.D0 = new ArrayList();
        this.E0 = new ArrayList();
        this.F0 = new ArrayList();
        this.G0 = new ArrayList();
        this.H0 = new ArrayList();
        this.C1 = new qh.i(new e20(this, 8));
        this.F1 = 0;
        this.G1 = false;
        this.I1 = new Paint(7);
        this.J1 = new Paint(7);
        this.K1 = new r50[8];
        this.L1 = 1.0f;
        this.W1 = true;
        this.X1 = new int[4];
        this.Y1 = new ArrayList();
        this.Z1 = new ArrayList();
        this.f40984r2 = new org.telegram.ui.Components.voip.h();
        this.f40993t2 = new ArrayList();
        this.f41001v2 = new e20(this, 0);
        this.f41006w2 = new a30(this);
        this.f41011x2 = new org.telegram.ui.Components.rc(24);
        this.f41016y2 = new e20(this, 1);
        this.f41019z2 = false;
        this.A2 = new a6(this, 6);
        this.B2 = new LongSparseIntArray();
        this.M2 = new int[2];
        this.P2 = true;
        this.T2 = new String[2];
        this.f40928d3 = -1;
        this.f41007w3 = new t40(this);
        org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.f25030f;
        this.f41020z3 = new ne.b(2, this, bsVar, 350L);
        this.A3 = new ne.b(3, this, bsVar, 220L, true);
        this.B3 = new ne.e(4, this, bsVar, 350L);
        this.C3 = new ne.b(5, this, bsVar, 350L);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        setOpenNoDelay(true);
        this.d = accountInstance;
        this.f40913a1 = call;
        this.Y0 = inputPeer;
        this.Z0 = chat;
        this.f40922c1 = str;
        this.currentAccount = accountInstance.getCurrentAccount();
        this.f40917b1 = z10;
        this.resourcesProvider = new ci.k0();
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        this.f40925d0 = MessagesController.getInstance(this.currentAccount).config.groupCallMessageLengthLimit.get();
        this.fullWidth = true;
        G3 = false;
        F3 = false;
        I3 = false;
        setDelegate(new v30(this));
        this.drawDoubleNavigationBar = true;
        this.drawNavigationBar = true;
        if (Build.VERSION.SDK_INT >= 30) {
            getWindow().setNavigationBarColor(-16777216);
        }
        this.scrollNavBar = true;
        this.navBarColorKey = -1;
        this.W2 = new g40(this);
        setOnDismissListener(new i20(this, 0));
        setDimBehindAlpha(75);
        m50 m50Var = new m50(this, launchActivity);
        this.P = m50Var;
        org.telegram.ui.Components.bq bqVar = new org.telegram.ui.Components.bq(true);
        int i11 = org.telegram.ui.ActionBar.h6.f21233qg;
        bqVar.b(org.telegram.ui.ActionBar.h6.v0(i11));
        bqVar.d();
        o40 o40Var = new o40(this, launchActivity, bqVar);
        this.O = o40Var;
        o40Var.setSubtitle("");
        o40Var.getSubtitleTextView().setVisibility(0);
        o40Var.l();
        o40Var.getAdditionalSubtitleTextView().setPadding(AndroidUtilities.dp(24.0f), 0, 0, 0);
        AndroidUtilities.updateViewVisibilityAnimated(o40Var.getAdditionalSubtitleTextView(), this.f40997u2, 1.0f, false);
        o40Var.getAdditionalSubtitleTextView().setTextColor(org.telegram.ui.ActionBar.h6.v0(i11));
        int i12 = org.telegram.ui.ActionBar.h6.f21140lg;
        o40Var.setSubtitleColor(org.telegram.ui.ActionBar.h6.v0(i12));
        o40Var.setBackButtonImage(R.drawable.ic_ab_back);
        o40Var.setOccupyStatusBar(false);
        o40Var.setAllowOverlayTitle(false);
        int i13 = org.telegram.ui.ActionBar.h6.f21065hg;
        o40Var.C(org.telegram.ui.ActionBar.h6.v0(i13), false);
        o40Var.B(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f21393z8), false);
        o40Var.setTitleColor(org.telegram.ui.ActionBar.h6.v0(i13));
        o40Var.setSubtitleColor(org.telegram.ui.ActionBar.h6.v0(i12));
        o40Var.setActionBarMenuOnItemClick(new v40(this, launchActivity));
        TLRPC.InputPeer groupCallPeer = inputPeer != null ? inputPeer : VoIPService.getSharedInstance().getGroupCallPeer();
        if (groupCallPeer == null) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            this.A0 = tL_peerUser;
            tL_peerUser.user_id = accountInstance.getUserConfig().getClientUserId();
        } else if (groupCallPeer instanceof TLRPC.TL_inputPeerChannel) {
            TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
            this.A0 = tL_peerChannel;
            tL_peerChannel.channel_id = groupCallPeer.channel_id;
        } else if (groupCallPeer instanceof TLRPC.TL_inputPeerUser) {
            TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
            this.A0 = tL_peerUser2;
            tL_peerUser2.user_id = groupCallPeer.user_id;
        } else if (groupCallPeer instanceof TLRPC.TL_inputPeerChat) {
            TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
            this.A0 = tL_peerChat;
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
        this.f40934f0 = launchActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(R.raw.voip_filled, AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f), true, null);
        this.J0 = uj0Var;
        this.K0 = new org.telegram.ui.Components.uj0(R.raw.hand_2, AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f), true, null);
        w40 w40Var = new w40(this, launchActivity);
        this.L = w40Var;
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
        this.Z = new ImageReceiver(this.containerView);
        if (inputPeer != null) {
            org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(launchActivity);
            this.U = j5Var;
            j5Var.setGravity(17);
            j5Var.setTextColor(-1);
            j5Var.setTypeface(AndroidUtilities.bold());
            j5Var.setTextSize(18);
            j5Var.k(LocaleController.getString(R.string.VoipChatStartsIn));
            this.containerView.addView(j5Var, w7.z5.a(-2.0f, 21.0f, 0.0f, 21.0f, 311.0f, -2, 49));
            x40 x40Var = new x40(this, launchActivity);
            this.V = x40Var;
            x40Var.setGravity(17);
            x40Var.setTextColor(-1);
            x40Var.setTypeface(AndroidUtilities.bold());
            x40Var.setTextSize(60);
            this.containerView.addView(x40Var, w7.z5.a(-2.0f, 21.0f, 0.0f, 21.0f, 231.0f, -2, 49));
            org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(launchActivity);
            this.W = j5Var2;
            j5Var2.setGravity(17);
            j5Var2.setTextColor(-1);
            j5Var2.setTypeface(AndroidUtilities.bold());
            j5Var2.setTextSize(18);
            this.containerView.addView(j5Var2, w7.z5.a(-2.0f, 21.0f, 0.0f, 21.0f, 201.0f, -2, 49));
        }
        if (s1()) {
            h50 h50Var = new h50(this, launchActivity);
            this.U0 = h50Var;
            this.containerView.addView(h50Var, w7.z5.a(80.0f, 0.0f, 44.0f, 0.0f, 0.0f, -1, 51));
        }
        y40 y40Var = new y40(this, launchActivity);
        this.Q = y40Var;
        y40Var.setClipToPadding(false);
        y40Var.setClipChildren(false);
        g50 g50Var = new g50(this);
        this.X = g50Var;
        g50Var.f46001o = bsVar;
        g50Var.d = 350L;
        g50Var.f46017c = 350L;
        g50Var.e = 350L;
        g50Var.S();
        y40Var.setItemAnimator(g50Var);
        y40Var.setOnScrollListener(new p20(this));
        y40Var.setVerticalScrollBarEnabled(false);
        getContext();
        org.telegram.ui.Components.xz xzVar = new org.telegram.ui.Components.xz(F3 ? 6 : 2, y40Var);
        this.Y = xzVar;
        y40Var.setLayoutManager(xzVar);
        q20 q20Var = new q20(this);
        this.f40920c = q20Var;
        xzVar.z1(q20Var);
        y40Var.i(new r20(this));
        xzVar.C1();
        this.containerView.addView(y40Var, w7.z5.a(-1.0f, 14.0f, 14.0f, 14.0f, 231.0f, -1, 51));
        y40Var.setAdapter(m50Var);
        y40Var.setTopBottomSelectorRadius(13);
        y40Var.setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f21012eg));
        y40Var.setOnItemClickListener(new e7(this, launchActivity, call, 14));
        y40Var.setOnItemLongClickListener(new b20(this, 4));
        if (s1()) {
            q50 q50Var = new q50(this, getContext());
            this.B1 = q50Var;
            this.containerView.addView(q50Var, w7.z5.a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 49));
        }
        org.telegram.ui.Components.im0 im0Var = new org.telegram.ui.Components.im0(launchActivity);
        this.f40967n2 = im0Var;
        this.containerView.addView(im0Var, w7.z5.a(-1.0f, 14.0f, 14.0f, 324.0f, 14.0f, -1, 51));
        x50 x50Var = new x50(call, this.currentAccount, this);
        this.f40971o2 = x50Var;
        im0Var.setAdapter(x50Var);
        s4.s sVar = new s4.s(6, false);
        im0Var.setLayoutManager(sVar);
        sVar.z1(new t20(this));
        im0Var.setOnItemClickListener(new org.telegram.ui.Components.wl0(this) {
            public final s50 f36044b;

            {
                this.f36044b = this;
            }

            @Override
            public final void a(int i15, View view) {
                switch (r2) {
                    case 0:
                        s50 s50Var2 = this.f36044b;
                        s50Var2.getClass();
                        org.telegram.ui.Components.z20 z20Var = (org.telegram.ui.Components.z20) view;
                        if (z20Var.getVideoParticipant() == null) {
                            s50Var2.f1(new ChatObject.VideoParticipant(z20Var.getParticipant(), false, false));
                            return;
                        } else {
                            s50Var2.f1(z20Var.getVideoParticipant());
                            return;
                        }
                    default:
                        s50 s50Var3 = this.f36044b;
                        s50Var3.getClass();
                        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) view;
                        if (lVar.getParticipant() != null) {
                            s50Var3.f1(lVar.getParticipant());
                            return;
                        }
                        return;
                }
            }
        });
        s4.k kVar = new s4.k();
        kVar.S();
        kVar.f46001o = bsVar;
        kVar.d = 350L;
        kVar.f46017c = 350L;
        kVar.e = 350L;
        im0Var.setItemAnimator(new u20(this));
        im0Var.setOnScrollListener(new v20(this));
        x50Var.H(im0Var, false, false);
        im0Var.setVisibility(8);
        w20 w20Var = new w20(this, launchActivity);
        this.e = w20Var;
        int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Jg);
        int red = Color.red(v02);
        int green = Color.green(v02);
        int blue = Color.blue(v02);
        this.S0 = new Matrix();
        this.R0 = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(72.72727f), new int[]{Color.argb(50, red, green, blue), Color.argb(0, red, green, blue)}, (float[]) null, Shader.TileMode.CLAMP);
        Paint paint = new Paint(1);
        this.T0 = paint;
        paint.setShader(this.R0);
        org.telegram.ui.Components.ba baVar = new org.telegram.ui.Components.ba(9);
        this.M0 = baVar;
        org.telegram.ui.Components.ba baVar2 = new org.telegram.ui.Components.ba(12);
        this.N0 = baVar2;
        baVar.f24872a = AndroidUtilities.dp(62.0f) * 0.45454547f;
        baVar.f24873b = AndroidUtilities.dp(72.0f) * 0.45454547f;
        baVar.b();
        baVar2.f24872a = AndroidUtilities.dp(65.0f) * 0.45454547f;
        baVar2.f24873b = AndroidUtilities.dp(75.0f) * 0.45454547f;
        baVar2.b();
        int i15 = org.telegram.ui.ActionBar.h6.Ig;
        baVar.d.setColor(i0.b.o(org.telegram.ui.ActionBar.h6.v0(i15), 38));
        baVar2.d.setColor(i0.b.o(org.telegram.ui.ActionBar.h6.v0(i15), 76));
        org.telegram.ui.Components.voip.t2 t2Var = new org.telegram.ui.Components.voip.t2(launchActivity, 50.0f);
        this.f40981r = t2Var;
        t2Var.setCheckable(true);
        t2Var.setTextSize(12);
        w20Var.a(t2Var);
        t2Var.setOnClickListener(new c20(this, 7));
        org.telegram.ui.Components.voip.t2 t2Var2 = new org.telegram.ui.Components.voip.t2(launchActivity, 50.0f);
        this.f40964n = t2Var2;
        t2Var2.setCheckable(true);
        t2Var2.setTextSize(12);
        t2Var2.d(false, false);
        t2Var2.setCrossOffset(-AndroidUtilities.dpf2(3.5f));
        t2Var2.c(R.drawable.calls_video, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipCamera), false, false);
        org.telegram.ui.Components.voip.t2 t2Var3 = new org.telegram.ui.Components.voip.t2(launchActivity, 50.0f);
        this.f40933f = t2Var3;
        t2Var3.setCheckable(true);
        t2Var3.setTextSize(12);
        t2Var3.d(false, false);
        org.telegram.ui.Components.xj0 xj0Var = new org.telegram.ui.Components.xj0(launchActivity);
        t2Var3.addView(xj0Var, w7.z5.a(32.0f, 0.0f, 10.0f, 0.0f, 0.0f, 32, 1));
        org.telegram.ui.Components.uj0 uj0Var2 = new org.telegram.ui.Components.uj0(R.raw.camera_flip, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        this.G2 = uj0Var2;
        xj0Var.setAnimation(uj0Var2);
        t2Var3.setOnClickListener(new c20(this, 10));
        w20Var.a(t2Var3);
        org.telegram.ui.Components.voip.t2 t2Var4 = new org.telegram.ui.Components.voip.t2(launchActivity, 50.0f);
        this.h = t2Var4;
        t2Var4.setCheckable(true);
        t2Var4.setTextSize(12);
        t2Var4.d(false, false);
        ImageView imageView = new ImageView(launchActivity);
        this.f40916b0 = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        int i16 = R.drawable.filled_sound_on;
        this.f40912a0 = i16;
        imageView.setImageResource(i16);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setScaleX(1.11f);
        imageView.setScaleY(1.11f);
        t2Var4.addView(imageView, w7.z5.a(30.0f, 0.0f, 11.0f, 0.0f, 0.0f, 30, 1));
        t2Var4.setOnClickListener(new c20(this, 11));
        w20Var.a(t2Var4);
        w20Var.a(t2Var2);
        org.telegram.ui.Components.voip.t2 t2Var5 = new org.telegram.ui.Components.voip.t2(launchActivity, 50.0f);
        this.f40986s = t2Var5;
        t2Var5.setTextSize(12);
        t2Var5.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Dg), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
        t2Var5.setOnClickListener(new View.OnClickListener(this) {
            public final s50 f37406b;

            {
                this.f37406b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        s50.p(this.f37406b, launchActivity);
                        return;
                    default:
                        s50 s50Var2 = this.f37406b;
                        s50Var2.a2.e();
                        ChatObject.Call call2 = s50Var2.f40913a1;
                        if (call2 != null && !call2.isScheduled()) {
                            s50Var2.J1();
                            s50.u1(launchActivity, new e20(s50Var2, 5), false, false);
                            return;
                        }
                        s50Var2.dismiss();
                        return;
                }
            }
        });
        org.telegram.ui.Components.voip.t2 t2Var6 = new org.telegram.ui.Components.voip.t2(launchActivity, 50.0f);
        this.v = t2Var6;
        t2Var6.setCheckable(true);
        t2Var6.b(true, false);
        t2Var6.setTextSize(12);
        t2Var6.c(R.drawable.filled_voice_comment_32, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipMessage), false, false);
        x20 x20Var = new x20(this, launchActivity);
        this.f41008x = x20Var;
        x20Var.setAnimation(uj0Var);
        x20Var.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.Components.voip.t2 t2Var7 = new org.telegram.ui.Components.voip.t2(launchActivity, 50.0f);
        this.f41003w = t2Var7;
        t2Var7.setDrawBackground(false);
        t2Var7.setTextSize(12);
        t2Var7.c(0, 0, 0, 1.0f, true, "Text", false, false);
        t2Var7.addView(x20Var, w7.z5.e(50, 50, 49));
        w20Var.a(t2Var7);
        t2Var7.setOnClickListener(new z20(this));
        w20Var.a(t2Var6);
        w20Var.a(t2Var5);
        ImageView imageView2 = new ImageView(launchActivity);
        this.f41013y = imageView2;
        imageView2.setVisibility(8);
        imageView2.setImageResource(R.drawable.voice_expand);
        t2Var7.addView(imageView2, w7.z5.a(24.0f, 0.0f, 13.0f, 0.0f, 0.0f, 24, 49));
        if (this.f40913a1 != null && s1() && !this.f40913a1.isScheduled()) {
            imageView2.setVisibility(0);
            x20Var.setVisibility(8);
        }
        RadialProgressView radialProgressView = new RadialProgressView(launchActivity);
        this.f40929e0 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(50.0f));
        radialProgressView.setStrokeWidth(2.0f);
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Og));
        o40Var.setAlpha(0.0f);
        o40Var.getBackButton().setScaleX(0.9f);
        o40Var.getBackButton().setScaleY(0.9f);
        o40Var.getBackButton().setTranslationX(-AndroidUtilities.dp(14.0f));
        o40Var.getTitleTextView().setTranslationY(AndroidUtilities.dp(23.0f));
        o40Var.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        o40Var.getAdditionalSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(launchActivity, (org.telegram.ui.ActionBar.y) null, 0, org.telegram.ui.ActionBar.h6.v0(i13));
        this.f40955k1 = u0Var;
        u0Var.setLongClickEnabled(false);
        u0Var.setIcon(R.drawable.ic_ab_other);
        u0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        u0Var.setSubMenuOpenSide(2);
        u0Var.setDelegate(new b20(this, 0));
        int i17 = org.telegram.ui.ActionBar.h6.f21083ig;
        u0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.v0(i17), 6));
        u0Var.setOnClickListener(new c20(this, 0));
        u0Var.G(org.telegram.ui.ActionBar.h6.v0(i13), false);
        u0Var.G(org.telegram.ui.ActionBar.h6.v0(i13), true);
        org.telegram.ui.ActionBar.u0 u0Var2 = new org.telegram.ui.ActionBar.u0(launchActivity, (org.telegram.ui.ActionBar.y) null, 0, org.telegram.ui.ActionBar.h6.v0(i13));
        this.l1 = u0Var2;
        u0Var2.setLongClickEnabled(false);
        u0Var2.setIcon(R.drawable.msg_voice_pip);
        u0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        u0Var2.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.v0(i17), 6));
        u0Var2.setOnClickListener(new c20(this, 1));
        org.telegram.ui.ActionBar.u0 u0Var3 = new org.telegram.ui.ActionBar.u0(launchActivity, (org.telegram.ui.ActionBar.y) null, 0, org.telegram.ui.ActionBar.h6.v0(i13));
        this.f40961m1 = u0Var3;
        u0Var3.setLongClickEnabled(false);
        u0Var3.setIcon(R.drawable.msg_screencast);
        u0Var3.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        u0Var3.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.v0(i17), 6));
        u0Var3.setOnClickListener(new c20(this, 2));
        b30 b30Var = new b30(this, launchActivity, launchActivity);
        this.f40930e1 = b30Var;
        c30 c30Var = new c30(launchActivity);
        this.N = c30Var;
        c30Var.setAlpha(0.0f);
        Paint paint2 = new Paint(1);
        this.f40939g1 = paint2;
        paint2.setColor(-12761513);
        d30 d30Var = new d30(this, getContext());
        this.f40935f1 = d30Var;
        d30Var.setTextColor(getThemedColor(i13));
        d30Var.setTextSize(1, 11.0f);
        d30Var.setText(LocaleController.getString(R.string.VoipChannelLabelLive));
        d30Var.setMaxLines(1);
        d30Var.setGravity(17);
        d30Var.setTypeface(AndroidUtilities.bold());
        d30Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f));
        d30Var.setTag(-1);
        if (!s1()) {
            d30Var.setVisibility(8);
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f40951j1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.addView(b30Var, w7.z5.l(1.0f, 0, -2));
        linearLayout.addView(d30Var, w7.z5.k(6.0f, 4.0f, 0.0f, 0.0f, -2, 18));
        this.containerView.addView(c30Var, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 51));
        this.containerView.addView(linearLayout, w7.z5.a(-2.0f, 23.0f, 0.0f, 48.0f, 0.0f, -2, 51));
        this.containerView.addView(o40Var, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 51));
        LinearLayout linearLayout2 = new LinearLayout(launchActivity);
        this.f41018z1 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.addView(u0Var3, w7.z5.n(48, 48));
        linearLayout2.addView(u0Var2, w7.z5.n(48, 48));
        linearLayout2.addView(u0Var, w7.z5.n(48, 48));
        this.containerView.addView(linearLayout2, w7.z5.e(-2, 48, 53));
        View view = new View(launchActivity);
        this.f40938g0 = view;
        view.setAlpha(0.0f);
        view.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.V5));
        this.containerView.addView(view, w7.z5.d(1.0f, -1));
        for (int i18 = 0; i18 < 2; i18++) {
            this.f40950j0[i18] = new e30(this, launchActivity);
            this.f40950j0[i18].setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            this.f40950j0[i18].setTranslationZ(AndroidUtilities.dp(5.0f));
            this.containerView.addView(this.f40950j0[i18], w7.z5.a(-2.0f, 8.0f, 0.0f, 8.0f, 8.0f, -1, 83));
        }
        org.telegram.ui.Cells.k kVar2 = new org.telegram.ui.Cells.k(launchActivity, true);
        this.f40954k0 = kVar2;
        kVar2.setTag(R.id.fit_width_tag, 240);
        this.f40955k1.h(kVar2, AndroidUtilities.dp(48.0f));
        this.f40955k1.setShowSubmenuByMove(false);
        int i19 = org.telegram.ui.ActionBar.h6.f21012eg;
        kVar2.setBackground(org.telegram.ui.ActionBar.h6.Z(org.telegram.ui.ActionBar.h6.v0(i19), 6, 6));
        org.telegram.ui.ActionBar.u0 u0Var4 = this.f40955k1;
        org.telegram.ui.ActionBar.e1 d = u0Var4.d(1, 0, null, LocaleController.getString(R.string.VoipGroupAllCanSpeak), true, true, u0Var4.m0);
        this.f40996u1 = d;
        d.j(true, false);
        org.telegram.ui.ActionBar.u0 u0Var5 = this.f40955k1;
        org.telegram.ui.ActionBar.e1 d10 = u0Var5.d(2, 0, null, LocaleController.getString(R.string.VoipGroupOnlyAdminsCanSpeak), true, true, u0Var5.m0);
        this.f41000v1 = d10;
        d10.j(false, true);
        int i20 = org.telegram.ui.ActionBar.h6.f21347wg;
        d.setCheckColor(i20);
        d.c(org.telegram.ui.ActionBar.h6.v0(i20), org.telegram.ui.ActionBar.h6.v0(i20));
        d10.setCheckColor(i20);
        d10.c(org.telegram.ui.ActionBar.h6.v0(i20), org.telegram.ui.ActionBar.h6.v0(i20));
        Paint paint3 = new Paint(1);
        int i21 = org.telegram.ui.ActionBar.h6.f21065hg;
        paint3.setColor(org.telegram.ui.ActionBar.h6.v0(i21));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(AndroidUtilities.dp(1.5f));
        paint3.setStrokeCap(Paint.Cap.ROUND);
        org.telegram.ui.ActionBar.u0 u0Var6 = this.f40955k1;
        org.telegram.ui.ActionBar.e1 d11 = u0Var6.d(10, R.drawable.msg_voice_speaker, null, LocaleController.getString(R.string.VoipGroupAudio), true, false, u0Var6.m0);
        this.f40974p1 = d11;
        d11.setItemHeight(56);
        org.telegram.ui.ActionBar.u0 u0Var7 = this.f40955k1;
        org.telegram.ui.ActionBar.e1 d12 = u0Var7.d(11, R.drawable.msg_noise_on, null, LocaleController.getString(R.string.VoipNoiseCancellation), true, false, u0Var7.m0);
        this.f40978q1 = d12;
        d12.setItemHeight(56);
        TextView b10 = this.f40955k1.b(i0.b.f(0.3f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f21049gg), -16777216));
        this.A1 = b10;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).topMargin = 0;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).bottomMargin = 0;
        org.telegram.ui.ActionBar.u0 u0Var8 = this.f40955k1;
        org.telegram.ui.ActionBar.e1 d13 = u0Var8.d(6, R.drawable.msg_edit, this.f40926d1, LocaleController.getString(ChatObject.isChannelOrGiga(this.Z0) ? R.string.VoipChannelEditTitle : R.string.VoipGroupEditTitle), true, false, u0Var8.m0);
        this.f40970o1 = d13;
        org.telegram.ui.ActionBar.u0 u0Var9 = this.f40955k1;
        org.telegram.ui.ActionBar.e1 d14 = u0Var9.d(7, R.drawable.msg_permissions, this.f40926d1, LocaleController.getString(R.string.VoipGroupEditPermissions), false, false, u0Var9.m0);
        this.f40983r1 = d14;
        org.telegram.ui.ActionBar.e1 e = this.f40955k1.e(3, R.drawable.msg_link, LocaleController.getString(R.string.VoipGroupShareInviteLink));
        this.f40966n1 = e;
        n50 n50Var = new n50();
        this.f40926d1 = n50Var;
        org.telegram.ui.ActionBar.e1 e7 = this.f40955k1.e(9, R.drawable.msg_screencast, LocaleController.getString(R.string.VoipChatStartScreenCapture));
        this.f40992t1 = e7;
        org.telegram.ui.ActionBar.u0 u0Var10 = this.f40955k1;
        org.telegram.ui.ActionBar.e1 d15 = u0Var10.d(5, 0, n50Var, LocaleController.getString(R.string.VoipGroupRecordCall), true, false, u0Var10.m0);
        this.f40988s1 = d15;
        n50Var.a(d15.getImageView());
        org.telegram.ui.ActionBar.e1 e10 = this.f40955k1.e(12, R.drawable.menu_stream_comments_24, LocaleController.getString(R.string.VoipChannelEnableComments));
        this.f41010x1 = e10;
        TLRPC.InputPeer inputPeer2 = groupCallPeer;
        org.telegram.ui.ActionBar.e1 e11 = this.f40955k1.e(13, R.drawable._menu_stream_comments_off_24, LocaleController.getString(R.string.VoipChannelDisableComments));
        this.f41015y1 = e11;
        org.telegram.ui.ActionBar.u0 u0Var11 = this.f40955k1;
        int i22 = R.drawable.msg_cancel;
        if (p1()) {
            i10 = i21;
            string = LocaleController.getString(R.string.VoipGroupEndConference);
        } else {
            string = LocaleController.getString(ChatObject.isChannelOrGiga(this.Z0) ? R.string.VoipChannelEndChat : R.string.VoipGroupEndChat);
            i10 = i21;
        }
        org.telegram.ui.ActionBar.e1 e12 = u0Var11.e(4, i22, string);
        this.f41005w1 = e12;
        this.f40955k1.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.h6.v0(i19));
        this.f40955k1.getPopupLayout().setFitItems(true);
        e10.c(org.telegram.ui.ActionBar.h6.v0(i10), org.telegram.ui.ActionBar.h6.v0(i10));
        e11.c(org.telegram.ui.ActionBar.h6.v0(i10), org.telegram.ui.ActionBar.h6.v0(i10));
        d11.c(org.telegram.ui.ActionBar.h6.v0(i10), org.telegram.ui.ActionBar.h6.v0(i10));
        d12.c(org.telegram.ui.ActionBar.h6.v0(i10), org.telegram.ui.ActionBar.h6.v0(i10));
        int i23 = org.telegram.ui.ActionBar.h6.f21329vg;
        e12.c(org.telegram.ui.ActionBar.h6.v0(i23), org.telegram.ui.ActionBar.h6.v0(i23));
        e.c(org.telegram.ui.ActionBar.h6.v0(i10), org.telegram.ui.ActionBar.h6.v0(i10));
        d13.c(org.telegram.ui.ActionBar.h6.v0(i10), org.telegram.ui.ActionBar.h6.v0(i10));
        d14.c(org.telegram.ui.ActionBar.h6.v0(i10), org.telegram.ui.ActionBar.h6.v0(i10));
        d15.c(org.telegram.ui.ActionBar.h6.v0(i10), org.telegram.ui.ActionBar.h6.v0(i10));
        e7.c(org.telegram.ui.ActionBar.h6.v0(i10), org.telegram.ui.ActionBar.h6.v0(i10));
        if (this.f40913a1 != null) {
            m1();
        }
        if (p1()) {
            this.f40973p0 = new d50();
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            this.f40973p0.b((sharedInstance == null || (conferenceCall = sharedInstance.conference) == null) ? null : conferenceCall.getEmojis());
        }
        Q1(false);
        this.O.getTitleTextView().setOnClickListener(new c20(this, 3));
        f30 f30Var = new f30(this, launchActivity);
        this.f40962m2 = f30Var;
        g30 g30Var = new g30(this);
        this.N2 = g30Var;
        f30Var.setClipToPadding(false);
        g30Var.S();
        g30Var.f46001o = org.telegram.ui.Components.bs.f25030f;
        g30Var.d = 350L;
        g30Var.f46017c = 350L;
        g30Var.e = 350L;
        f30Var.setItemAnimator(g30Var);
        f30Var.setOnScrollListener(new h30(this));
        f30Var.setClipChildren(false);
        s4.b0 b0Var = new s4.b0();
        b0Var.j1(0);
        f30Var.setLayoutManager(b0Var);
        org.telegram.ui.Components.a30 a30Var = new org.telegram.ui.Components.a30(call, this.currentAccount, this);
        this.f40975p2 = a30Var;
        f30Var.setAdapter(a30Var);
        a30Var.F(f30Var, false);
        f30Var.setOnItemClickListener(new org.telegram.ui.Components.wl0(this) {
            public final s50 f36044b;

            {
                this.f36044b = this;
            }

            @Override
            public final void a(int i152, View view2) {
                switch (r2) {
                    case 0:
                        s50 s50Var2 = this.f36044b;
                        s50Var2.getClass();
                        org.telegram.ui.Components.z20 z20Var = (org.telegram.ui.Components.z20) view2;
                        if (z20Var.getVideoParticipant() == null) {
                            s50Var2.f1(new ChatObject.VideoParticipant(z20Var.getParticipant(), false, false));
                            return;
                        } else {
                            s50Var2.f1(z20Var.getVideoParticipant());
                            return;
                        }
                    default:
                        s50 s50Var3 = this.f36044b;
                        s50Var3.getClass();
                        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) view2;
                        if (lVar.getParticipant() != null) {
                            s50Var3.f1(lVar.getParticipant());
                            return;
                        }
                        return;
                }
            }
        });
        f30Var.setOnItemLongClickListener(new b20(this, 1));
        f30Var.setVisibility(8);
        f30Var.i(new i30());
        j30 j30Var = new j30(this, launchActivity, this.Q, f30Var, this.Y1, this.f40913a1, this);
        this.a2 = j30Var;
        j30Var.setClipChildren(false);
        a30Var.E(this.Y1, j30Var);
        if (this.f40967n2 != null) {
            this.f40971o2.G(this.Y1, j30Var);
        }
        k30 k30Var = new k30(this, launchActivity);
        this.D2 = k30Var;
        l30 l30Var = new l30(this, launchActivity, this.O, this.Q, k30Var);
        this.f40915b = l30Var;
        l30Var.setImagesLayerNum(Integer.MAX_VALUE);
        l30Var.setInvalidateWithParent(true);
        k30Var.setProfileGalleryView(l30Var);
        m30 m30Var = new m30(this, launchActivity);
        this.C2 = m30Var;
        m30Var.setVisibility(8);
        l30Var.setVisibility(0);
        l30Var.b(new n30(this));
        o30 o30Var = new o30(this, launchActivity);
        this.f40918b2 = o30Var;
        this.containerView.addView(j30Var);
        j30Var.addView(f30Var, w7.z5.a(80.0f, 0.0f, 0.0f, 0.0f, 100.0f, -1, 80));
        this.e.setWillNotDraw(false);
        View view2 = new View(launchActivity);
        this.J2 = view2;
        int[] iArr = this.M2;
        iArr[0] = this.V1;
        iArr[1] = 0;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, this.M2);
        this.L2 = gradientDrawable;
        view2.setBackground(gradientDrawable);
        this.containerView.addView(view2, w7.z5.e(-1, 60, 83));
        View view3 = new View(launchActivity);
        this.K2 = view3;
        view3.setBackgroundColor(this.M2[0]);
        this.containerView.addView(view3, w7.z5.e(-1, 0, 83));
        mh.h hVar = new mh.h(launchActivity);
        this.f40921c0 = hVar;
        hVar.setDelegate(new p30(this));
        hVar.setClickCellDelegate(new q30(this));
        if (this.f40913a1 != null) {
            hVar.C0(this.d.getCurrentAccount(), this.f40913a1.getInputGroupCall(false));
        }
        this.containerView.addView(hVar, w7.z5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 0));
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(launchActivity, false, true, true);
        this.M = q6Var;
        q6Var.setGravity(17);
        q6Var.setTextSize(AndroidUtilities.dp(15.0f));
        q6Var.setTextColor(-1);
        q6Var.b(0.4f, 320L, org.telegram.ui.Components.bs.h);
        q6Var.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(this.e);
        r30 r30Var = new r30(this, launchActivity, this.L, LaunchActivity.R(), this.resourcesProvider);
        this.H = r30Var;
        r30Var.J = true;
        r30Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.f40925d0)});
        r30Var.getEditText().setLinkTextColor(-11683585);
        r30Var.setHint(LocaleController.getString(R.string.TypeMessage));
        r30Var.getEditText().addTextChangedListener(new s30(this));
        r30Var.s();
        t30 t30Var = new t30(this, launchActivity);
        this.G = t30Var;
        this.containerView.addView(t30Var, w7.z5.d(-1.0f, -1));
        u30 u30Var = new u30(launchActivity);
        this.F = u30Var;
        u30Var.addView(r30Var, w7.z5.a(-2.0f, 0.0f, 0.0f, 48.0f, 0.0f, -1, 80));
        u30Var.addView(q6Var, w7.z5.a(16.0f, 0.0f, 0.0f, 0.0f, 32.0f, 52, 85));
        q6Var.setTranslationY(-AndroidUtilities.dp(20.0f));
        this.containerView.addView(u30Var, w7.z5.e(-1, -2, 80));
        ImageView imageView3 = new ImageView(launchActivity);
        this.J = imageView3;
        int i24 = org.telegram.ui.ActionBar.h6.f21075i6;
        imageView3.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(i24), 1, -1));
        int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f7, this.resourcesProvider);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView3.setColorFilter(new PorterDuffColorFilter(w02, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.arrow_more);
        imageView3.setOnClickListener(new c20(this, 4));
        ImageView imageView4 = new ImageView(launchActivity);
        this.I = imageView4;
        imageView4.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(i24), 1, -1));
        imageView4.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21319v6, this.resourcesProvider), mode));
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_send);
        imageView4.setOnClickListener(new c20(this, 5));
        u30Var.addView(imageView3, w7.z5.e(48, 48, 85));
        u30Var.addView(imageView4, w7.z5.e(48, 48, 85));
        this.containerView.addView(o30Var);
        m30Var.addView(l30Var, w7.z5.d(-1.0f, -1));
        m30Var.addView(k30Var, w7.z5.a(-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 0));
        this.containerView.addView(m30Var, w7.z5.a(-1.0f, 14.0f, 14.0f, 14.0f, 14.0f, -1, 0));
        P0(false);
        this.P.l();
        if (G3) {
            this.f40971o2.I(this.f40967n2, false);
        }
        this.I0 = this.P.h();
        if (inputPeer != null) {
            TextView textView = new TextView(launchActivity);
            this.S = textView;
            textView.setGravity(17);
            textView.setTextColor(-8682615);
            textView.setTextSize(1, 14.0f);
            if (ChatObject.isChannel(this.Z0) && (chat2 = this.Z0) != null && !chat2.megagroup) {
                textView.setTag(1);
            }
            this.containerView.addView(textView, w7.z5.a(-2.0f, 21.0f, 0.0f, 21.0f, 100.0f, -2, 81));
            org.telegram.ui.Components.od0 od0Var = new org.telegram.ui.Components.od0(launchActivity);
            od0Var.setTextColor(-1);
            od0Var.setSelectorColor(-9598483);
            od0Var.setTextOffset(AndroidUtilities.dp(10.0f));
            od0Var.setItemCount(5);
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
            this.T = y30Var;
            y30Var.setLines(1);
            y30Var.setSingleLine(true);
            y30Var.setEllipsize(TextUtils.TruncateAt.END);
            y30Var.setGravity(17);
            y30Var.setTextColor(-1);
            y30Var.setTypeface(AndroidUtilities.bold());
            y30Var.setTextSize(1, 14.0f);
            this.containerView.addView(y30Var, w7.z5.a(48.0f, 21.0f, 0.0f, 21.0f, 20.5f, -1, 81));
            launchActivity2 = launchActivity;
            y30Var.setOnClickListener(new org.telegram.messenger.video.f(this, od0Var, w30Var, x30Var, chat, accountInstance, inputPeer2, 1));
            a40 a40Var = new a40(launchActivity2, od0Var, w30Var, x30Var);
            this.R = a40Var;
            a40Var.setWeightSum(1.0f);
            a40Var.setOrientation(0);
            this.containerView.addView(a40Var, w7.z5.a(270.0f, 0.0f, 50.0f, 0.0f, 0.0f, -1, 51));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i25 = calendar.get(1);
            int i26 = calendar.get(6);
            a40Var.addView(od0Var, w7.z5.l(0.5f, 0, 270));
            od0Var.setMinValue(0);
            od0Var.setMaxValue(365);
            od0Var.setWrapSelectorWheel(false);
            od0Var.setFormatter(new g20(currentTimeMillis, calendar, i25, 0));
            a1.d dVar = new a1.d(this, od0Var, w30Var, x30Var, 13);
            s50Var = this;
            od0Var.setOnValueChangedListener(dVar);
            w30Var.setMinValue(0);
            w30Var.setMaxValue(23);
            a40Var.addView(w30Var, w7.z5.l(0.2f, 0, 270));
            w30Var.setFormatter(new org.telegram.ui.Components.tg0(24));
            w30Var.setOnValueChangedListener(dVar);
            x30Var.setMinValue(0);
            x30Var.setMaxValue(59);
            x30Var.setValue(0);
            x30Var.setFormatter(new org.telegram.ui.Components.tg0(25));
            a40Var.addView(x30Var, w7.z5.l(0.3f, 0, 270));
            x30Var.setOnValueChangedListener(dVar);
            calendar.setTimeInMillis(currentTimeMillis + 10800000);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            int i27 = calendar.get(6);
            int i28 = calendar.get(12);
            int i29 = calendar.get(11);
            od0Var.setValue(i26 != i27 ? 1 : 0);
            x30Var.setValue(i28);
            w30Var.setValue(i29);
            org.telegram.ui.Components.f5.f(y30Var, textView, 0L, 604800L, 2, od0Var, w30Var, x30Var);
        } else {
            launchActivity2 = launchActivity;
            s50Var = this;
        }
        b40 b40Var = new b40(s50Var, (ViewGroup) s50Var.getWindow().getDecorView(), s50Var.containerView);
        s50Var.f40923c2 = b40Var;
        b40Var.E = new c40(s50Var);
        l30Var.setPinchToZoomHelper(b40Var);
        s50Var.f40964n.setOnClickListener(new View.OnClickListener(s50Var) {
            public final s50 f37406b;

            {
                this.f37406b = s50Var;
            }

            @Override
            public final void onClick(View view4) {
                switch (r3) {
                    case 0:
                        s50.p(this.f37406b, launchActivity2);
                        return;
                    default:
                        s50 s50Var2 = this.f37406b;
                        s50Var2.a2.e();
                        ChatObject.Call call2 = s50Var2.f40913a1;
                        if (call2 != null && !call2.isScheduled()) {
                            s50Var2.J1();
                            s50.u1(launchActivity2, new e20(s50Var2, 5), false, false);
                            return;
                        }
                        s50Var2.dismiss();
                        return;
                }
            }
        });
        s50Var.M1(false);
        s50Var.J1();
        s50Var.N1(false);
        s50Var.O1(false, false);
        s50Var.C1(0.0f);
        s50Var.P1();
        s50Var.containerView.addView(new FrameLayout(launchActivity2), w7.z5.e(-1, 200, 87));
        s50Var.v.setOnClickListener(new c20(s50Var, 6));
        s50Var.U0();
        w7.b6.a(s50Var.f40964n);
        w7.b6.a(s50Var.f40981r);
        w7.b6.a(s50Var.f40933f);
        w7.b6.a(s50Var.h);
        w7.b6.a(s50Var.f41003w);
        w7.b6.a(s50Var.f40986s);
        w7.b6.a(s50Var.v);
        r0.i0.l(s50Var.containerView, new b20(s50Var, 2));
    }

    public static void A(s50 s50Var, org.telegram.ui.ActionBar.b2[] b2VarArr, boolean z10, TLRPC.TL_error tL_error, long j10, TL_phone.inviteToGroupCall invitetogroupcall) {
        try {
            b2VarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        b2VarArr[0] = null;
        if (z10 && "USER_NOT_PARTICIPANT".equals(tL_error.text)) {
            s50Var.y1(null, j10, 3);
            return;
        }
        org.telegram.ui.Components.f5.e0(s50Var.currentAccount, tL_error, (org.telegram.ui.ActionBar.n2) s50Var.f40946i0.O().getFragmentStack().get(s50Var.f40946i0.O().getFragmentStack().size() - 1), invitetogroupcall, new Object[0]);
    }

    public static r0.k1 B(s50 s50Var, r0.k1 k1Var) {
        int keyboardHeight;
        r0.h1 h1Var = k1Var.f44853a;
        i0.c f7 = h1Var.f(647);
        i0.c f10 = h1Var.f(8);
        r30 r30Var = s50Var.H;
        if (!r30Var.N && !r30Var.e) {
            keyboardHeight = 0;
        } else {
            keyboardHeight = r30Var.getKeyboardHeight();
        }
        int max = Math.max(f10.d, keyboardHeight);
        ViewGroup.LayoutParams layoutParams = s50Var.f40918b2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = -f7.d;
        }
        if (r30Var.getEmojiView() != null) {
            r30Var.getEmojiView().setBottomInset(f7.d);
        }
        if (s50Var.S2) {
            ViewGroup viewGroup = s50Var.containerView;
            int i10 = s50Var.backgroundPaddingLeft;
            viewGroup.setPadding(i10, 0, i10, 0);
        } else {
            ViewGroup viewGroup2 = s50Var.containerView;
            int i11 = s50Var.backgroundPaddingLeft;
            viewGroup2.setPadding(f7.f12284a + i11, f7.f12285b, i11 + f7.f12286c, f7.d);
        }
        s50Var.containerView.requestLayout();
        if (max == 0 && !r30Var.N && !r30Var.e && !r30Var.O) {
            r30Var.j();
        }
        if (max > 0) {
            org.telegram.ui.Components.cl0 cl0Var = s50Var.K;
            if (cl0Var == null) {
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                cl0Var = null;
                if (R != null) {
                    org.telegram.ui.Components.cl0 cl0Var2 = new org.telegram.ui.Components.cl0(1, s50Var.currentAccount, s50Var.getContext(), R, s50Var.resourcesProvider);
                    s50Var.K = cl0Var2;
                    cl0Var2.setDelegate(new u40(s50Var));
                    s50Var.containerView.addView(s50Var.K, w7.z5.e(-2, 52, 81));
                    s50Var.K.p(null, null, false);
                    s50Var.G.bringToFront();
                    s50Var.F.bringToFront();
                    cl0Var = s50Var.K;
                }
            }
            s50Var.K = cl0Var;
        }
        r30Var.H(f10.d, false);
        s50Var.C1.j(k1Var);
        return r0.k1.f44852b;
    }

    public static String B0() {
        String[][] strArr = EmojiData.data;
        String[] strArr2 = strArr[(int) Math.floor(Math.random() * strArr.length)];
        return strArr2[(int) Math.floor(Math.random() * strArr2.length)];
    }

    public static void C(s50 s50Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TL_phone.exportGroupCallInvite exportgroupcallinvite, TLRPC.TL_error tL_error) {
        TLRPC.GroupCall groupCall;
        b2Var.dismiss();
        boolean z10 = false;
        if (tLObject instanceof TL_phone.exportedGroupCallInvite) {
            Context context = s50Var.getContext();
            int i10 = s50Var.currentAccount;
            TLRPC.InputGroupCall inputGroupCall = exportgroupcallinvite.call;
            String str = ((TL_phone.exportedGroupCallInvite) tLObject).link;
            org.telegram.ui.ActionBar.d6 d6Var = s50Var.resourcesProvider;
            ChatObject.Call call = s50Var.f40913a1;
            if (call != null && (groupCall = call.call) != null && groupCall.creator) {
                z10 = true;
            }
            m9.o0(context, i10, inputGroupCall, str, d6Var, false, z10);
        } else if (tL_error != null) {
            new org.telegram.ui.Components.xc(s50Var.topBulletinContainer, new ci.k0()).f0(tL_error, false);
        }
    }

    public static void C0(s50 s50Var) {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("reminderhint", false)) {
            return;
        }
        globalMainSettings.edit().putBoolean("reminderhint", true).commit();
        if (s50Var.f40965n0 == null) {
            org.telegram.ui.Components.r40 r40Var = new org.telegram.ui.Components.r40(s50Var.getContext(), 8);
            s50Var.f40965n0 = r40Var;
            r40Var.setAlpha(0.0f);
            s50Var.f40965n0.setVisibility(4);
            s50Var.f40965n0.setShowingDuration(4000L);
            s50Var.containerView.addView(s50Var.f40965n0, w7.z5.a(-2.0f, 19.0f, 0.0f, 19.0f, 0.0f, -2, 51));
            s50Var.f40965n0.setText(LocaleController.getString(R.string.VoipChatReminderHint));
            s50Var.f40965n0.d();
        }
        s50Var.f40965n0.setExtraTranslationY(-AndroidUtilities.statusBarHeight);
        s50Var.f40965n0.f(s50Var.f41003w, true);
    }

    public static void D(s50 s50Var, int[] iArr, float[] fArr) {
        ArrayList<TLRPC.GroupCallParticipant> arrayList;
        s4.b1 K;
        f30 f30Var = s50Var.f40962m2;
        j30 j30Var = s50Var.a2;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            TLRPC.GroupCallParticipant groupCallParticipant = s50Var.f40913a1.participantsBySources.get(iArr[i10]);
            if (groupCallParticipant != null) {
                if (!j30Var.f31554b) {
                    if (s50Var.f40987s0) {
                        arrayList = s50Var.D0;
                    } else {
                        arrayList = s50Var.f40913a1.visibleParticipants;
                    }
                    int indexOf = arrayList.indexOf(groupCallParticipant);
                    if (indexOf >= 0 && (K = s50Var.Q.K(indexOf + s50Var.P.d)) != null) {
                        View view = K.f45938a;
                        if (view instanceof org.telegram.ui.Cells.d4) {
                            ((org.telegram.ui.Cells.d4) view).setAmplitude(fArr[i10] * 15.0f);
                            if (view == s50Var.X2 && !s50Var.f40959l2) {
                                s50Var.containerView.invalidate();
                            }
                        }
                    }
                } else {
                    for (int i11 = 0; i11 < f30Var.getChildCount(); i11++) {
                        org.telegram.ui.Components.z20 z20Var = (org.telegram.ui.Components.z20) f30Var.getChildAt(i11);
                        if (MessageObject.getPeerId(z20Var.getParticipant().peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                            z20Var.setAmplitude(fArr[i10] * 15.0f);
                        }
                    }
                }
                j30Var.k(groupCallParticipant, fArr[i10] * 15.0f);
            }
        }
    }

    public static void F(s50 s50Var) {
        Editable text = s50Var.H.getText();
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = text.toString();
        tL_textWithEntities.entities = MediaDataController.getInstance(s50Var.currentAccount).getEntities(new CharSequence[]{text}, true);
        s50Var.B1(tL_textWithEntities);
    }

    public static void G0(s50 s50Var) {
        ChatObject.Call call = s50Var.f40913a1;
        if (call != null && call.call != null) {
            TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
            togglegroupcallsettings.call = s50Var.f40913a1.getInputGroupCall();
            togglegroupcallsettings.join_muted = Boolean.valueOf(s50Var.f40913a1.call.join_muted);
            ConnectionsManager connectionsManager = s50Var.d.getConnectionsManager();
            DispatchQueue dispatchQueue = Utilities.stageQueue;
            Objects.requireNonNull(dispatchQueue);
            connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.f1(dispatchQueue), new n20(s50Var, 1));
        }
    }

    public static void H0(s50 s50Var, boolean z10) {
        if (s50Var.f40913a1 == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        togglegroupcallsettings.call = s50Var.f40913a1.getInputGroupCall();
        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
        s50Var.f41012x3 = Boolean.valueOf(z10);
        s50Var.I1(true);
        ConnectionsManager connectionsManager = s50Var.d.getConnectionsManager();
        DispatchQueue dispatchQueue = Utilities.stageQueue;
        Objects.requireNonNull(dispatchQueue);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.f1(dispatchQueue), new n20(s50Var, 0));
    }

    public static void I0(s50 s50Var) {
        boolean z10;
        int i10;
        if (s50Var.s1()) {
            j30 j30Var = s50Var.a2;
            if (!j30Var.V && j30Var.f31554b && (F3 == s50Var.r1() || AndroidUtilities.isTablet())) {
                z10 = false;
            } else {
                z10 = true;
            }
            Boolean bool = s50Var.f40952j2;
            if (bool != null && z10 == bool.booleanValue()) {
                return;
            }
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
            s50Var.f40952j2 = Boolean.valueOf(z10);
            s50Var.S2 = !z10;
            s50Var.containerView.requestApplyInsets();
            return;
        }
        s50Var.isFullscreen = false;
    }

    public static org.telegram.ui.Components.voip.l J0(s50 s50Var) {
        y40 y40Var = s50Var.Q;
        for (int i10 = 0; i10 < y40Var.getChildCount(); i10++) {
            View childAt = y40Var.getChildAt(i10);
            if (childAt.isAttachedToWindow() && (childAt instanceof org.telegram.ui.Components.voip.l) && RecyclerView.R(childAt) >= 0) {
                return (org.telegram.ui.Components.voip.l) childAt;
            }
        }
        return null;
    }

    public static void K0(s50 s50Var) {
        boolean z10;
        Integer num;
        boolean z11;
        float f7;
        float f10;
        float dp;
        float dp2;
        float dp3;
        float f11;
        float f12;
        float f13;
        View childAt;
        o40 o40Var = s50Var.O;
        y40 y40Var = s50Var.Q;
        int childCount = y40Var.getChildCount();
        boolean z12 = false;
        float f14 = 2.1474836E9f;
        for (int i10 = 0; i10 < childCount; i10++) {
            if (RecyclerView.R(y40Var.getChildAt(i10)) >= 0) {
                f14 = Math.min(f14, childAt.getTop());
            }
        }
        if (f14 < 0.0f || f14 == 2.1474836E9f) {
            if (childCount != 0) {
                f14 = 0.0f;
            } else {
                f14 = y40Var.getPaddingTop();
            }
        }
        if (f14 <= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(14.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        float dp4 = f14 + AndroidUtilities.dp(14.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if ((z10 && o40Var.getTag() == null) || (!z10 && o40Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            o40Var.setTag(num);
            AnimatorSet animatorSet = s50Var.f40942h0;
            if (animatorSet != null) {
                animatorSet.cancel();
                s50Var.f40942h0 = null;
            }
            if (o40Var.getTag() == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            s50Var.setUseLightStatusBar(z11);
            ViewPropertyAnimator animate = o40Var.getBackButton().animate();
            float f15 = 0.9f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.9f;
            }
            ViewPropertyAnimator scaleX = animate.scaleX(f7);
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
            org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.f25030f;
            duration.setInterpolator(bsVar).start();
            ViewPropertyAnimator animate2 = o40Var.getTitleTextView().animate();
            if (z10) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(23.0f);
            }
            animate2.translationY(dp).setDuration(300L).setInterpolator(bsVar).start();
            ObjectAnimator objectAnimator = s50Var.U2;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                s50Var.U2.cancel();
            }
            org.telegram.ui.ActionBar.j5 subtitleTextView = o40Var.getSubtitleTextView();
            Property property = View.TRANSLATION_Y;
            float translationY = o40Var.getSubtitleTextView().getTranslationY();
            if (z10) {
                dp2 = 0.0f;
            } else {
                dp2 = AndroidUtilities.dp(20.0f);
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(subtitleTextView, property, translationY, dp2);
            s50Var.U2 = ofFloat;
            ofFloat.setDuration(300L);
            s50Var.U2.setInterpolator(bsVar);
            s50Var.U2.addListener(new n40(0, s50Var, z10));
            s50Var.U2.start();
            ObjectAnimator objectAnimator2 = s50Var.V2;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            org.telegram.ui.ActionBar.j5 additionalSubtitleTextView = o40Var.getAdditionalSubtitleTextView();
            if (z10) {
                dp3 = 0.0f;
            } else {
                dp3 = AndroidUtilities.dp(20.0f);
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(additionalSubtitleTextView, property, dp3);
            s50Var.V2 = ofFloat2;
            ofFloat2.setDuration(300L);
            s50Var.V2.setInterpolator(bsVar);
            s50Var.V2.start();
            AnimatorSet animatorSet2 = new AnimatorSet();
            s50Var.f40942h0 = animatorSet2;
            animatorSet2.setDuration(140L);
            AnimatorSet animatorSet3 = s50Var.f40942h0;
            Property property2 = View.ALPHA;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(o40Var, property2, f11);
            c30 c30Var = s50Var.N;
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(c30Var, property2, f12);
            View view = s50Var.f40938g0;
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(view, property2, f13));
            s50Var.f40942h0.addListener(new l40(s50Var, 1));
            s50Var.f40942h0.start();
            s50Var.a2.v.setClickable((!z10 || F3) ? true : true);
        }
        if (s50Var.f41014y0 != dp4) {
            s50Var.F1(dp4);
        }
    }

    public static void O(s50 s50Var, org.telegram.ui.Components.voip.l lVar, boolean z10) {
        if (!s50Var.isDismissed()) {
            if (z10 && lVar.getRenderer() == null) {
                lVar.setRenderer(org.telegram.ui.Components.voip.t.c(s50Var.Y1, s50Var.a2, lVar, null, null, lVar.getParticipant(), s50Var.f40913a1, s50Var));
            } else if (!z10 && lVar.getRenderer() != null) {
                lVar.getRenderer().setPrimaryView(null);
                lVar.setRenderer(null);
            }
        }
    }

    public static void T(s50 s50Var, int i10, int[] iArr) {
        if (s50Var.s1()) {
            int i11 = org.telegram.ui.ActionBar.h6.Kg;
            iArr[0] = org.telegram.ui.ActionBar.h6.x0(null, i11, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Lg, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21400zg, false), s50Var.U1, 1.0f);
            iArr[2] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21122kg, false), org.telegram.ui.ActionBar.h6.x0(null, i11, false), s50Var.U1, 1.0f);
        } else if (i10 == 0) {
            iArr[0] = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Jg, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21382yg, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21400zg, false), s50Var.U1, 1.0f);
            iArr[2] = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21366xg, false);
        } else if (i10 == 1) {
            iArr[0] = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Gg, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Bg, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Cg, false), s50Var.U1, 1.0f);
            iArr[2] = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Ag, false);
        } else if (q1(i10)) {
            iArr[0] = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21123kh, false);
            iArr[1] = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21141lh, false);
            iArr[2] = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21160mh, false);
        } else {
            int i12 = org.telegram.ui.ActionBar.h6.Kg;
            iArr[0] = org.telegram.ui.ActionBar.h6.x0(null, i12, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Mg, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Ng, false), s50Var.U1, 1.0f);
            iArr[2] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21122kg, false), org.telegram.ui.ActionBar.h6.x0(null, i12, false), s50Var.U1, 1.0f);
        }
        if (q1(i10)) {
            iArr[3] = i0.b.f(0.5f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21084ih, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21123kh, false));
        } else if (i10 == 1) {
            iArr[3] = i0.b.f(0.75f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Bg, false), i0.b.f(0.5f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Fg, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Hg, false)));
        } else {
            iArr[3] = i0.b.f(0.5f, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Jg, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Ig, false));
        }
    }

    public static void d1(LaunchActivity launchActivity, AccountInstance accountInstance, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        if (D3 == null) {
            if (inputPeer != null || VoIPService.getSharedInstance() != null) {
                if (inputPeer != null) {
                    D3 = new s50(launchActivity, accountInstance, accountInstance.getMessagesController().getGroupCall(chat.f20272id, false), chat, inputPeer, z10, str);
                } else {
                    ChatObject.Call call = VoIPService.getSharedInstance().groupCall;
                    if (call != null) {
                        TLRPC.Chat chat2 = accountInstance.getMessagesController().getChat(Long.valueOf(call.chatId));
                        call.addSelfDummyParticipant(true);
                        D3 = new s50(launchActivity, accountInstance, call, chat2, null, z10, str);
                    } else {
                        return;
                    }
                }
                D3.f40946i0 = launchActivity;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.rc(23));
            }
        }
    }

    public static String g1(int i10) {
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

    public static String h1(int i10) {
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

    public static void n(s50 s50Var, ChatObject.Call.InvitedUser invitedUser, Long l4) {
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = invitedUser.msg_id;
        ConnectionsManager.getInstance(s50Var.currentAccount).sendRequest(declineconferencecallinvite, new m20(s50Var, 0));
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(invitedUser.msg_id));
        MessagesController.getInstance(s50Var.currentAccount).deleteMessages(arrayList, null, null, 0L, 0, true, 0);
        ChatObject.Call call = s50Var.f40913a1;
        if (call != null) {
            call.invitedUsers.remove(l4);
            s50Var.f40913a1.invitedUsersMap.remove(l4);
            s50Var.f40913a1.invitedUsersMessageIds.remove(l4);
            s50Var.P0(true);
        }
    }

    public static void o(s50 s50Var, Activity activity, ChatObject.Call call, View view, int i10) {
        TLRPC.Chat chat;
        final ChatObject.Call.InvitedUser invitedUser;
        AccountInstance accountInstance = s50Var.d;
        ArrayList arrayList = s50Var.F0;
        m50 m50Var = s50Var.P;
        if (view instanceof org.telegram.ui.Components.voip.l) {
            s50Var.f1(((org.telegram.ui.Components.voip.l) view).getParticipant());
        } else if (view instanceof org.telegram.ui.Cells.d4) {
            s50Var.G1((org.telegram.ui.Cells.d4) view);
        } else {
            Collection collection = null;
            r7 = null;
            r7 = null;
            r7 = null;
            final Long l4 = null;
            boolean z10 = true;
            if (view instanceof org.telegram.ui.Cells.v3) {
                org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
                if (v3Var.getUser() != null) {
                    if (s50Var.p1()) {
                        int i11 = i10 - m50Var.f39004n;
                        if (i11 >= 0 && i11 < s50Var.f40913a1.shadyJoinParticipants.size()) {
                            l4 = s50Var.f40913a1.shadyJoinParticipants.get(i10 - m50Var.f39004n);
                        } else {
                            int i12 = i10 - m50Var.f39006s;
                            if (i12 >= 0 && i12 < s50Var.f40913a1.shadyLeftParticipants.size()) {
                                l4 = s50Var.f40913a1.shadyLeftParticipants.get(i10 - m50Var.f39006s);
                            } else {
                                int i13 = i10 - m50Var.f39003f;
                                if (s50Var.f40987s0) {
                                    if (i13 >= 0 && i13 < arrayList.size()) {
                                        l4 = (Long) arrayList.get(i13);
                                    }
                                } else if (i13 >= 0 && i13 < s50Var.f40913a1.invitedUsers.size()) {
                                    l4 = s50Var.f40913a1.invitedUsers.get(i13);
                                }
                                z10 = false;
                            }
                        }
                        if (!z10 && (invitedUser = s50Var.f40913a1.invitedUsersMessageIds.get(l4)) != null) {
                            org.telegram.ui.Components.i80 F = org.telegram.ui.Components.i80.F(s50Var.container, s50Var.resourcesProvider, v3Var);
                            F.l(R.drawable.msg_endcall, LocaleController.getString(R.string.GroupCallStopCallingInvite), new Runnable(s50Var) {
                                public final s50 f38386b;

                                {
                                    this.f38386b = s50Var;
                                }

                                @Override
                                public final void run() {
                                    switch (r4) {
                                        case 0:
                                            s50.s(this.f38386b, invitedUser, l4);
                                            return;
                                        default:
                                            s50.n(this.f38386b, invitedUser, l4);
                                            return;
                                    }
                                }
                            }, invitedUser.isCalling());
                            F.c(R.drawable.msg_remove, LocaleController.getString(R.string.GroupCallDiscardInvite), new Runnable(s50Var) {
                                public final s50 f38386b;

                                {
                                    this.f38386b = s50Var;
                                }

                                @Override
                                public final void run() {
                                    switch (r4) {
                                        case 0:
                                            s50.s(this.f38386b, invitedUser, l4);
                                            return;
                                        default:
                                            s50.n(this.f38386b, invitedUser, l4);
                                            return;
                                    }
                                }
                            }, false);
                            F.W(org.telegram.ui.ActionBar.h6.d0(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), s50Var.C0.getColor()));
                            F.f27134s = 96;
                            F.Z();
                            return;
                        }
                        return;
                    }
                    s50Var.f40946i0.O0(s50Var.currentAccount);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", v3Var.getUser().f20419id);
                    if (v3Var.f23624a.getImageReceiver().hasNotThumb()) {
                        bundle.putBoolean("expandPhoto", true);
                    }
                    s50Var.f40946i0.t0(new ProfileActivity(bundle, null));
                    s50Var.dismiss();
                }
            } else if (i10 == m50Var.f39007w) {
                if (ChatObject.isChannel(s50Var.Z0) && (chat = s50Var.Z0) != null && !chat.megagroup && ChatObject.isPublic(chat)) {
                    s50Var.k1(false);
                    return;
                }
                TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(s50Var.j1());
                if (chatFull != null) {
                    s50Var.f41004w0 = false;
                    Context context = s50Var.getContext();
                    int currentAccount = accountInstance.getCurrentAccount();
                    TLRPC.Chat chat2 = s50Var.Z0;
                    ChatObject.Call call2 = s50Var.f40913a1;
                    org.telegram.ui.Components.a40 a40Var = new org.telegram.ui.Components.a40(context, currentAccount, chat2, chatFull, call2.participants, call2.invitedUsersMap);
                    s50Var.E1 = a40Var;
                    a40Var.setOnDismissListener(new i20(s50Var, 2));
                    org.telegram.ui.Components.a40 a40Var2 = s50Var.E1;
                    a40Var2.f24484g0 = new s20(s50Var);
                    a40Var2.show();
                }
            } else if (i10 == m50Var.f39008x) {
                ChatObject.Call call3 = s50Var.f40913a1;
                if (call3 != null && call3.call != null) {
                    ug.l1 l1Var = new ug.l1(activity, s50Var.currentAccount, null, 4, new ci.k0());
                    ChatObject.Call call4 = s50Var.f40913a1;
                    if (call4 != null) {
                        collection = (Collection) Collection.EL.stream(call4.sortedParticipants).map(new k2.f(5)).collect(Collectors.toSet());
                    }
                    l1Var.C0.addAll(collection);
                    l1Var.i0(false, true);
                    l1Var.A0 = new e20(s50Var, 3);
                    l1Var.i0(false, true);
                    l1Var.D0 = new ai.q5(18, s50Var, call);
                    l1Var.show();
                }
            } else if (i10 == m50Var.f39009y) {
                s50Var.w1();
            }
        }
    }

    public static void p(s50 s50Var, Activity activity) {
        LaunchActivity launchActivity = s50Var.f40946i0;
        if (launchActivity != null && launchActivity.checkSelfPermission("android.permission.CAMERA") != 0) {
            s50Var.f40946i0.requestPermissions(new String[]{"android.permission.CAMERA"}, 104);
        } else if (VoIPService.getSharedInstance() != null) {
            boolean z10 = false;
            if (VoIPService.getSharedInstance().getVideoState(false) != 2) {
                s50Var.f40950j0[0].e(1, false);
                if (s50Var.f41017z0 == null) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null) {
                        sharedInstance.createCaptureDevice(false);
                    }
                    if (VoIPService.getSharedInstance().getVideoState(true) != 2) {
                        z10 = true;
                    }
                    d40 d40Var = new d40(s50Var, activity, z10);
                    s50Var.f41017z0 = d40Var;
                    d40Var.setBottomPadding(s50Var.containerView.getPaddingBottom());
                    s50Var.container.addView(s50Var.f41017z0);
                    if (sharedInstance != null && !sharedInstance.isFrontFaceCamera()) {
                        sharedInstance.switchCamera();
                        return;
                    }
                    return;
                }
                return;
            }
            VoIPService.getSharedInstance().setVideoState(false, 0);
            s50Var.O1(true, false);
            s50Var.N1(false);
            s50Var.f40913a1.sortParticipants();
            s50Var.P0(true);
            s50Var.e.requestLayout();
        }
    }

    public static void q(s50 s50Var, float f7, float f10, float f11, int i10, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        s50Var.f40927d2 = floatValue;
        s50Var.a2.f31568n = floatValue;
        float f12 = (floatValue * 1.0f) + ((1.0f - floatValue) * f7);
        m30 m30Var = s50Var.C2;
        m30Var.setScaleX(f12);
        m30Var.setScaleY(f12);
        m30Var.setTranslationX((1.0f - s50Var.f40927d2) * f10);
        m30Var.setTranslationY((1.0f - s50Var.f40927d2) * f11);
        if (!s50Var.f40940g2) {
            s50Var.W2.setAlpha((int) (s50Var.f40927d2 * 100.0f));
        }
        org.telegram.ui.Components.voip.t tVar = s50Var.Z2;
        if (tVar != null) {
            tVar.f31747a.setRoundCorners((1.0f - s50Var.f40927d2) * AndroidUtilities.dp(8.0f));
        }
        m30Var.invalidate();
        s50Var.containerView.invalidate();
        l30 l30Var = s50Var.f40915b;
        int i11 = (int) ((1.0f - s50Var.f40927d2) * i10);
        l30Var.N(i11, i11);
    }

    public static boolean q1(int i10) {
        if ((VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().groupCall == null || !VoIPService.getSharedInstance().groupCall.call.rtmp_stream) && i10 != 2 && i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            return false;
        }
        return true;
    }

    public static void r(s50 s50Var, ChatObject.Call call, Boolean bool, HashSet hashSet) {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance;
        ChatObject.Call call2 = s50Var.f40913a1;
        if (call2 != null && (groupCall = call2.call) != null) {
            String str = groupCall.invite_link;
            int size = hashSet.size();
            AtomicInteger atomicInteger = new AtomicInteger(0);
            HashSet hashSet2 = new HashSet();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                long longValue = ((Long) it.next()).longValue();
                s50Var.f40913a1.addInvitedUser(longValue);
                TL_phone.inviteConferenceCallParticipant inviteconferencecallparticipant = new TL_phone.inviteConferenceCallParticipant();
                TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                inviteconferencecallparticipant.call = tL_inputGroupCall;
                TLRPC.GroupCall groupCall2 = s50Var.f40913a1.call;
                tL_inputGroupCall.f20289id = groupCall2.f20282id;
                tL_inputGroupCall.access_hash = groupCall2.access_hash;
                inviteconferencecallparticipant.user_id = MessagesController.getInstance(s50Var.currentAccount).getInputUser(longValue);
                inviteconferencecallparticipant.video = bool.booleanValue();
                ConnectionsManager.getInstance(s50Var.currentAccount).sendRequest(inviteconferencecallparticipant, new gi.z0(s50Var, longValue, hashSet2, atomicInteger, size, call, str));
            }
            s50Var.P0(true);
            if (bool.booleanValue() && (sharedInstance = VoIPService.getSharedInstance()) != null && sharedInstance.getVideoState(false) != 2 && sharedInstance.getVideoState(false) != 1) {
                sharedInstance.createCaptureDevice(false);
                if (!sharedInstance.isFrontFaceCamera()) {
                    sharedInstance.switchCamera();
                }
                sharedInstance.requestVideoCall(false);
                sharedInstance.setVideoState(false, 2);
                sharedInstance.setMicMute(false, false, true);
                sharedInstance.switchToSpeaker();
                s50Var.O1(true, true);
            }
        }
    }

    public static void s(s50 s50Var, ChatObject.Call.InvitedUser invitedUser, Long l4) {
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = invitedUser.msg_id;
        ConnectionsManager.getInstance(s50Var.currentAccount).sendRequest(declineconferencecallinvite, new m20(s50Var, 1));
        ChatObject.Call call = s50Var.f40913a1;
        if (call != null) {
            invitedUser.calling = false;
            call.invitedUsersMessageIds.put(l4, invitedUser);
            s50Var.P0(true);
        }
    }

    public static void t(s50 s50Var, TLObject tLObject) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(s50Var.currentAccount).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
        }
    }

    public static void u1(Context context, Runnable runnable, boolean z10, boolean z11) {
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
                    alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertTitle);
                    alertDialog$Builder.f20601a.T = LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertText);
                } else if (ChatObject.isChannelOrGiga(chat)) {
                    alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.VoipChannelLeaveAlertTitle);
                    alertDialog$Builder.f20601a.T = LocaleController.getString(R.string.VoipChannelLeaveAlertText);
                } else {
                    alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.VoipGroupLeaveAlertTitle);
                    alertDialog$Builder.f20601a.T = LocaleController.getString(R.string.VoipGroupLeaveAlertText);
                }
                sharedInstance.getAccount();
                org.telegram.ui.Cells.a2[] a2VarArr = new org.telegram.ui.Cells.a2[1];
                LinearLayout e = org.telegram.messenger.wh.e(context, 1);
                if (!sharedInstance.isConference() || (call != null && (groupCall = call.call) != null && groupCall.creator)) {
                    org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(context, 1);
                    a2VarArr[0] = a2Var;
                    a2Var.setBackground(org.telegram.ui.ActionBar.h6.L0(false));
                    if (z10) {
                        a2VarArr[0].setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21092j5, false));
                    } else {
                        a2VarArr[0].setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21065hg, false));
                        CheckBoxSquare checkBoxSquare = (CheckBoxSquare) a2VarArr[0].getCheckBoxView();
                        int i10 = org.telegram.ui.ActionBar.h6.f21253rg;
                        int i11 = org.telegram.ui.ActionBar.h6.f21214pg;
                        int i12 = org.telegram.ui.ActionBar.h6.f21179ng;
                        checkBoxSquare.f24162s = i10;
                        checkBoxSquare.v = i11;
                        checkBoxSquare.f24163w = i12;
                        checkBoxSquare.invalidate();
                    }
                    a2VarArr[0].setTag(0);
                    if (sharedInstance.isConference()) {
                        a2VarArr[0].e(LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertEndChat), "", false, false, false);
                    } else if (ChatObject.isChannelOrGiga(chat)) {
                        a2VarArr[0].e(LocaleController.getString(R.string.VoipChannelLeaveAlertEndChat), "", false, false, false);
                    } else {
                        a2VarArr[0].e(LocaleController.getString(R.string.VoipGroupLeaveAlertEndChat), "", false, false, false);
                    }
                    org.telegram.ui.Cells.a2 a2Var2 = a2VarArr[0];
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
                    a2Var2.setPadding(dp, 0, dp2, 0);
                    e.addView(a2VarArr[0], w7.z5.n(-1, -2));
                    a2VarArr[0].setOnClickListener(new f20(a2VarArr, 0));
                }
                alertDialog$Builder.n(e);
                alertDialog$Builder.f20601a.I = org.telegram.ui.ActionBar.h6.f21214pg;
                alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupLeave), new ai.u3(call, a2VarArr, selfId, runnable, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                if (z10) {
                    alertDialog$Builder.f20601a.P0 = false;
                }
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
                if (z10) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        b2Var.getWindow().setType(2038);
                    } else {
                        b2Var.getWindow().setType(2003);
                    }
                    b2Var.getWindow().clearFlags(2);
                }
                if (!z10) {
                    b2Var.i(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21311ug, false));
                }
                b2Var.show();
                if (!z10) {
                    TextView textView = (TextView) b2Var.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21329vg, false));
                    }
                    b2Var.o(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21065hg, false));
                    return;
                }
                return;
            }
            x1(call, false, selfId, runnable);
        }
    }

    public static void v(s50 s50Var) {
        s50Var.Z0();
        s50Var.W0();
        s50Var.V0();
        s50Var.F.setTranslationY((-s50Var.C1.d()) + s50Var.containerView.getPaddingBottom());
        s50Var.G.invalidate();
        s50Var.a1();
        s50Var.containerView.invalidate();
    }

    public static void w(s50 s50Var, TLObject tLObject) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(s50Var.currentAccount).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
        }
    }

    public static void x(s50 s50Var, long j10, HashSet hashSet, AtomicInteger atomicInteger, int i10, ChatObject.Call call, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(s50Var.currentAccount).lambda$processUpdates$377(updates, false);
            AndroidUtilities.runOnUIThread(new a3.i0(s50Var, updates, j10, 27));
        } else if (tL_error != null && "USER_PRIVACY_RESTRICTED".equalsIgnoreCase(tL_error.text)) {
            hashSet.add(Long.valueOf(j10));
        }
        if (atomicInteger.incrementAndGet() == i10 && !hashSet.isEmpty()) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i90(s50Var, hashSet, call, str, 12));
        }
    }

    public static void x1(ChatObject.Call call, boolean z10, long j10, Runnable runnable) {
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

    public static void y(s50 s50Var, HashSet hashSet, ChatObject.Call call, String str) {
        TL_account.getRequirementsToContact getrequirementstocontact = new TL_account.getRequirementsToContact();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Long l4 = (Long) it.next();
            long longValue = l4.longValue();
            if (call != null) {
                call.removeInvitedUser(longValue);
            }
            arrayList.add(MessagesController.getInstance(s50Var.currentAccount).getUser(l4));
            getrequirementstocontact.f20476id.add(MessagesController.getInstance(s50Var.currentAccount).getInputUser(longValue));
        }
        org.telegram.ui.Components.g30 g30Var = new org.telegram.ui.Components.g30(s50Var, arrayList, arrayList2, arrayList3, str, 7);
        if (UserConfig.getInstance(s50Var.currentAccount).isPremium()) {
            g30Var.run();
        } else {
            ConnectionsManager.getInstance(s50Var.currentAccount).sendRequest(getrequirementstocontact, new ea(arrayList, arrayList2, g30Var, 13));
        }
    }

    public static void z(s50 s50Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        sg.j0 j0Var = new sg.j0(34, s50Var.currentAccount, U.getContext(), U, new ci.k0());
        j0Var.J1(null, arrayList, arrayList2, arrayList3, str);
        j0Var.show();
    }

    public final void A1() {
        a6 a6Var = this.A2;
        AndroidUtilities.cancelRunOnUIThread(a6Var);
        if (this.f41019z2 && this.U0 != null && VoIPService.getSharedInstance() != null && s1() && this.Q != null && LiteMode.isEnabled(512)) {
            AndroidUtilities.runOnUIThread(a6Var, 30L);
        }
    }

    public final void B1(TLRPC.TL_textWithEntities tL_textWithEntities) {
        TLRPC.InputGroupCall inputGroupCall;
        long j10;
        this.H.setText("");
        ChatObject.Call call = this.f40913a1;
        if (call != null && call.call != null && (inputGroupCall = call.getInputGroupCall()) != null) {
            ChatObject.Call call2 = this.f40913a1;
            long j11 = call2.call.f20282id;
            TLRPC.Peer peer = call2.selfPeer;
            if (peer != null) {
                j10 = DialogObject.getPeerDialogId(peer);
            } else {
                j10 = UserConfig.getInstance(this.currentAccount).clientUserId;
            }
            GroupCallMessagesController.getInstance(this.currentAccount).sendCallMessage(j10, tL_textWithEntities, j11, inputGroupCall);
        }
    }

    public final void C1(float f7) {
        float f10;
        int i10;
        int i11;
        this.U1 = f7;
        j30 j30Var = this.a2;
        if (j30Var == null) {
            f10 = 0.0f;
        } else {
            f10 = j30Var.f31556c;
        }
        float max = Math.max(f7, f10);
        int i12 = org.telegram.ui.ActionBar.h6.f21103jg;
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, i12, false);
        int i13 = org.telegram.ui.ActionBar.h6.f21049gg;
        int offsetColor = AndroidUtilities.getOffsetColor(x02, org.telegram.ui.ActionBar.h6.x0(null, i13, false), f7, 1.0f);
        this.V1 = offsetColor;
        this.N.setBackgroundColor(offsetColor);
        this.f40955k1.B(-14472653);
        this.f40934f0.setColorFilter(new PorterDuffColorFilter(this.V1, PorterDuff.Mode.MULTIPLY));
        this.navBarColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false), org.telegram.ui.ActionBar.h6.x0(null, i13, false), max, 1.0f);
        int offsetColor2 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21122kg, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21292tg, false), f7, 1.0f);
        d50 d50Var = this.f40973p0;
        if (d50Var != null) {
            d50Var.f36074j = offsetColor2;
            x10 x10Var = d50Var.f36072g;
            if (x10Var != null) {
                x10Var.invalidate();
            }
        }
        this.C0.setColor(offsetColor2);
        this.E.setColor(offsetColor2);
        this.F.invalidate();
        y40 y40Var = this.Q;
        y40Var.setGlowColor(offsetColor2);
        int i14 = this.F1;
        if (i14 == 3 || q1(i14)) {
            this.f41003w.invalidate();
        }
        View view = this.J2;
        if (view != null) {
            int i15 = this.V1;
            int[] iArr = this.M2;
            iArr[0] = i15;
            iArr[1] = 0;
            if (Build.VERSION.SDK_INT > 29) {
                this.L2.setColors(iArr);
            } else {
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, iArr);
                this.L2 = gradientDrawable;
                view.setBackground(gradientDrawable);
            }
            this.K2.setBackgroundColor(iArr[0]);
        }
        int offsetColor3 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Dg, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Eg, false), f7, 1.0f);
        this.f40986s.a(offsetColor3, offsetColor3);
        int offsetColor4 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21140lg, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21197og, false), f7, 1.0f);
        int offsetColor5 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21159mg, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21253rg, false), f7, 1.0f);
        int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, this.resourcesProvider);
        int childCount = y40Var.getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = y40Var.getChildAt(i16);
            if (childAt instanceof org.telegram.ui.Cells.w3) {
                org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) childAt;
                if (p1()) {
                    w3Var.a(w02, w02);
                } else {
                    w3Var.a(offsetColor5, offsetColor4);
                }
            } else {
                boolean z10 = childAt instanceof org.telegram.ui.Cells.d4;
                o40 o40Var = this.O;
                if (z10) {
                    org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) childAt;
                    if (o40Var.getTag() != null) {
                        i11 = org.telegram.ui.ActionBar.h6.f21253rg;
                    } else {
                        i11 = org.telegram.ui.ActionBar.h6.f21159mg;
                    }
                    d4Var.f(i11, offsetColor5);
                } else if (childAt instanceof org.telegram.ui.Cells.v3) {
                    org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) childAt;
                    if (o40Var.getTag() != null) {
                        i10 = org.telegram.ui.ActionBar.h6.f21253rg;
                    } else {
                        i10 = org.telegram.ui.ActionBar.h6.f21159mg;
                    }
                    v3Var.a(i10, offsetColor5);
                }
            }
        }
        this.containerView.invalidate();
        y40Var.invalidate();
        this.container.invalidate();
    }

    public final void D1(float f7) {
        y40 y40Var;
        TLRPC.GroupCallParticipant groupCallParticipant;
        ArrayList<TLRPC.GroupCallParticipant> arrayList;
        s4.b1 K;
        f7 = (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) ? 0.0f : 0.0f;
        float min = (float) (Math.min(8500.0d, 4000.0f * f7) / 8500.0d);
        this.P0 = min;
        this.Q0 = (min - this.O0) / 265.0f;
        ChatObject.Call call = this.f40913a1;
        if (call != null && (y40Var = this.Q) != null && (groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(MessageObject.getPeerId(this.A0))) != null) {
            j30 j30Var = this.a2;
            if (!j30Var.f31554b) {
                if (this.f40987s0) {
                    arrayList = this.D0;
                } else {
                    arrayList = this.f40913a1.visibleParticipants;
                }
                int indexOf = arrayList.indexOf(groupCallParticipant);
                if (indexOf >= 0 && (K = y40Var.K(indexOf + this.P.d)) != null) {
                    View view = K.f45938a;
                    if (view instanceof org.telegram.ui.Cells.d4) {
                        ((org.telegram.ui.Cells.d4) view).setAmplitude(f7 * 15.0f);
                        if (view == this.X2 && !this.f40959l2) {
                            this.containerView.invalidate();
                        }
                    }
                }
            } else {
                int i10 = 0;
                while (true) {
                    f30 f30Var = this.f40962m2;
                    if (i10 >= f30Var.getChildCount()) {
                        break;
                    }
                    org.telegram.ui.Components.z20 z20Var = (org.telegram.ui.Components.z20) f30Var.getChildAt(i10);
                    if (MessageObject.getPeerId(z20Var.getParticipant().peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                        z20Var.setAmplitude(f7 * 15.0f);
                    }
                    i10++;
                }
            }
            j30Var.k(groupCallParticipant, f7 * 15.0f);
        }
    }

    public final void E1(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25) {
        this.f40941g3 = i10;
        this.f40945h3 = i11;
        this.f40949i3 = i12;
        this.f40953j3 = i13;
        this.f40957k3 = i14;
        this.f40960l3 = i15;
        this.f40963m3 = i16;
        this.f40968n3 = i17;
        this.f40972o3 = i18;
        this.f40976p3 = i19;
        this.f40980q3 = i20;
        this.f40985r3 = i21;
        this.f40990s3 = i22;
        this.f40994t3 = i23;
        this.f40998u3 = i24;
        this.f41002v3 = i25;
    }

    public final void F1(float f7) {
        y40 y40Var;
        int dp;
        int i10;
        float f10;
        this.f41014y0 = f7;
        this.Q.setTopGlowOffset((int) (f7 - ((FrameLayout.LayoutParams) y40Var.getLayoutParams()).topMargin));
        float dp2 = f7 - AndroidUtilities.dp(74.0f);
        int i11 = ((this.backgroundPaddingTop + dp2) > (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2) ? 1 : ((this.backgroundPaddingTop + dp2) == (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2) ? 0 : -1));
        h50 h50Var = this.U0;
        j30 j30Var = this.a2;
        d30 d30Var = this.f40935f1;
        b30 b30Var = this.f40930e1;
        if (i11 < 0) {
            float min = Math.min(1.0f, (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2) - dp2) - this.backgroundPaddingTop) / (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + ((dp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f))));
            if (AndroidUtilities.isTablet()) {
                f10 = 17.0f;
            } else {
                f10 = 13.0f;
            }
            i10 = (int) (AndroidUtilities.dp(f10) * min);
            if (h50Var != null) {
                h50Var.setShadowOffset((int) (AndroidUtilities.dp(8.0f) * min));
            }
            if (Math.abs(Math.min(1.0f, min) - this.U1) > 1.0E-4f) {
                C1(Math.min(1.0f, min));
            }
            float z10 = org.telegram.ui.Cells.t0.z(min, 0.1f, 1.2f, 1.0f);
            b30Var.setScaleX(Math.max(0.9f, z10));
            b30Var.setScaleY(Math.max(0.9f, z10));
            float f11 = 1.0f - (min * 1.2f);
            b30Var.setAlpha((1.0f - j30Var.f31556c) * Math.max(0.0f, f11));
            d30Var.setScaleX(Math.max(0.9f, z10));
            d30Var.setScaleY(Math.max(0.9f, z10));
            d30Var.setAlpha((1.0f - j30Var.f31556c) * Math.max(0.0f, f11));
        } else {
            b30Var.setScaleX(1.0f);
            b30Var.setScaleY(1.0f);
            b30Var.setAlpha(1.0f - j30Var.f31556c);
            d30Var.setScaleX(1.0f);
            d30Var.setScaleY(1.0f);
            d30Var.setAlpha(1.0f - j30Var.f31556c);
            if (this.U1 > 1.0E-4f) {
                C1(0.0f);
            }
            i10 = 0;
        }
        Z0();
        float f12 = i10;
        this.f41018z1.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f7 - AndroidUtilities.dp(53.0f)) - f12));
        this.f40951j1.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f7 - AndroidUtilities.dp(44.0f)) - f12));
        if (h50Var != null) {
            h50Var.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), f7 - AndroidUtilities.dp(37.0f)));
        }
        a40 a40Var = this.R;
        if (a40Var != null) {
            a40Var.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f7 - AndroidUtilities.dp(44.0f)) - f12));
        }
        this.containerView.invalidate();
        R1();
    }

    public final boolean G1(android.view.View r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.s50.G1(android.view.View):boolean");
    }

    public final void H1(View view) {
        if (this.m0 == null) {
            org.telegram.ui.Components.r40 r40Var = new org.telegram.ui.Components.r40(8, getContext(), null, true);
            this.m0 = r40Var;
            r40Var.setAlpha(0.0f);
            this.m0.setVisibility(4);
            this.m0.setShowingDuration(3000L);
            this.containerView.addView(this.m0, w7.z5.a(-2.0f, 19.0f, 0.0f, 19.0f, 0.0f, -2, 51));
            if (ChatObject.isChannelOrGiga(this.Z0)) {
                this.m0.setText(LocaleController.getString(R.string.VoipChannelRecording));
            } else {
                this.m0.setText(LocaleController.getString(R.string.VoipGroupRecording));
            }
            this.m0.d();
        }
        this.m0.setExtraTranslationY(-AndroidUtilities.statusBarHeight);
        this.m0.f(view, true);
    }

    public final void I1(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        ChatObject.Call call = this.f40913a1;
        org.telegram.ui.Components.voip.t2 t2Var = this.v;
        org.telegram.ui.Components.voip.t2 t2Var2 = this.h;
        org.telegram.ui.Components.voip.t2 t2Var3 = this.f40981r;
        org.telegram.ui.Components.voip.t2 t2Var4 = this.f40933f;
        org.telegram.ui.Components.voip.t2 t2Var5 = this.f40964n;
        org.telegram.ui.Components.voip.t2 t2Var6 = this.f40986s;
        org.telegram.ui.Components.voip.t2 t2Var7 = this.f41003w;
        boolean z19 = true;
        w20 w20Var = this.e;
        boolean z20 = false;
        if (call != null && !call.isScheduled()) {
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(false) == 2) {
                z13 = true;
            } else {
                z13 = false;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f40913a1.participants.f(MessageObject.getPeerId(this.A0));
            if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !R0()) {
                z14 = true;
            } else {
                z14 = false;
            }
            Boolean bool = this.f41012x3;
            if (bool != null) {
                z15 = bool.booleanValue();
            } else {
                TLRPC.GroupCall groupCall = this.f40913a1.call;
                if (groupCall != null && groupCall.messages_enabled) {
                    z15 = true;
                } else {
                    z15 = false;
                }
            }
            if (((!z14 && this.f40913a1.canRecordVideo()) || z13) && !s1()) {
                z16 = true;
            } else {
                z16 = false;
                z20 = true;
            }
            if (z13) {
                z18 = true;
                z17 = false;
            } else {
                z17 = !z14;
                z18 = false;
            }
            if (F3) {
                z17 = false;
                z18 = false;
            }
            w20Var.c(t2Var7, true, z10);
            w20Var.c(t2Var6, true, z10);
            w20Var.c(t2Var5, z16, z10);
            w20Var.c(t2Var4, z18, z10);
            w20Var.c(t2Var3, z20, z10);
            w20Var.c(t2Var2, z17, z10);
            w20Var.c(t2Var, z15, z10);
            return;
        }
        if (this.V0 > 0.1f) {
            z11 = true;
        } else {
            z11 = false;
        }
        w20Var.c(t2Var7, z11, z10);
        if (this.V0 > 0.1f) {
            z12 = true;
        } else {
            z12 = false;
        }
        w20Var.c(t2Var6, z12, z10);
        if (this.V0 <= 0.1f) {
            z19 = false;
        }
        w20Var.c(t2Var3, z19, z10);
        w20Var.c(t2Var5, false, z10);
        w20Var.c(t2Var4, false, z10);
        w20Var.c(t2Var2, false, z10);
        w20Var.c(t2Var, false, z10);
    }

    public final void J1() {
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
        ChatObject.Call call2 = this.f40913a1;
        org.telegram.ui.ActionBar.u0 u0Var = this.f40955k1;
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f40961m1;
        if (call2 == null || call2.isScheduled()) {
            this.l1.setVisibility(4);
            u0Var2.setVisibility(8);
            if (this.f40913a1 == null) {
                u0Var.setVisibility(8);
                return;
            }
        }
        if (this.f40958l0) {
            return;
        }
        AccountInstance accountInstance = this.d;
        TLRPC.Chat chat4 = accountInstance.getMessagesController().getChat(Long.valueOf(j1()));
        if (chat4 != null) {
            this.Z0 = chat4;
        }
        boolean canUserDoAdminAction = ChatObject.canUserDoAdminAction(this.Z0, 3);
        org.telegram.ui.ActionBar.e1 e1Var = this.f40966n1;
        if (!canUserDoAdminAction && (((ChatObject.isChannel(this.Z0) && ((chat3 = this.Z0) == null || !chat3.megagroup)) || (!ChatObject.isPublic(this.Z0) && !ChatObject.canUserDoAdminAction(this.Z0, 3))) && (!ChatObject.isChannel(this.Z0) || (chat2 = this.Z0) == null || chat2.megagroup || !ChatObject.isPublic(chat2)))) {
            e1Var.setVisibility(8);
        } else {
            e1Var.setVisibility(0);
        }
        ChatObject.Call call3 = this.f40913a1;
        org.telegram.ui.ActionBar.e1 e1Var2 = this.f41015y1;
        org.telegram.ui.ActionBar.e1 e1Var3 = this.f41010x1;
        if (call3 != null && (groupCall2 = call3.call) != null && groupCall2.can_change_messages_enabled) {
            if (groupCall2.messages_enabled) {
                i13 = 8;
            } else {
                i13 = 0;
            }
            e1Var3.setVisibility(i13);
            if (this.f40913a1.call.messages_enabled) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            e1Var2.setVisibility(i14);
        } else {
            e1Var3.setVisibility(8);
            e1Var2.setVisibility(8);
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f40913a1.participants.f(MessageObject.getPeerId(this.A0));
        ChatObject.Call call4 = this.f40913a1;
        org.telegram.ui.ActionBar.e1 e1Var4 = this.f40978q1;
        if (call4 != null && !call4.isScheduled() && (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted)) {
            e1Var4.setVisibility(0);
        } else {
            e1Var4.setVisibility(8);
        }
        if (SharedConfig.noiseSupression) {
            i10 = R.drawable.msg_noise_on;
        } else {
            i10 = R.drawable.msg_noise_off;
        }
        e1Var4.setIcon(i10);
        if (SharedConfig.noiseSupression) {
            i11 = R.string.VoipNoiseCancellationEnabled;
        } else {
            i11 = R.string.VoipNoiseCancellationDisabled;
        }
        e1Var4.setSubtext(LocaleController.getString(i11));
        boolean R0 = R0();
        org.telegram.ui.ActionBar.e1 e1Var5 = this.f41005w1;
        org.telegram.ui.ActionBar.e1 e1Var6 = this.f40970o1;
        boolean z12 = true;
        org.telegram.ui.ActionBar.e1 e1Var7 = this.f40988s1;
        org.telegram.ui.ActionBar.e1 e1Var8 = this.f40992t1;
        if (R0) {
            e1Var5.setVisibility(0);
            e1Var6.setVisibility(0);
            if (s1()) {
                e1Var7.setVisibility(0);
                e1Var8.setVisibility(8);
            } else if (this.f40913a1.isScheduled()) {
                e1Var7.setVisibility(8);
                e1Var8.setVisibility(8);
            } else {
                e1Var7.setVisibility(0);
            }
            if (p1()) {
                e1Var7.setVisibility(8);
                e1Var6.setVisibility(8);
            }
            if (this.f40913a1.canRecordVideo() && !this.f40913a1.isScheduled() && !s1()) {
                e1Var8.setVisibility(0);
            } else {
                e1Var8.setVisibility(8);
            }
            u0Var2.setVisibility(8);
            boolean z13 = this.f40913a1.recording;
            n50 n50Var = this.f40926d1;
            n50Var.f39315f = z13;
            n50Var.d = 1.0f;
            n50Var.invalidateSelf();
            if (this.f40913a1.recording) {
                if (this.D1 == null) {
                    e20 e20Var = new e20(this, 6);
                    this.D1 = e20Var;
                    AndroidUtilities.runOnUIThread(e20Var, 1000L);
                }
                e1Var7.setText(LocaleController.getString(R.string.VoipGroupStopRecordCall));
            } else {
                e20 e20Var2 = this.D1;
                if (e20Var2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(e20Var2);
                    this.D1 = null;
                }
                e1Var7.setText(LocaleController.getString(R.string.VoipGroupRecordCall));
            }
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(true) == 2) {
                e1Var8.g(LocaleController.getString(R.string.VoipChatStopScreenCapture), R.drawable.msg_screencast_off, null);
            } else {
                e1Var8.g(LocaleController.getString(R.string.VoipChatStartScreenCapture), R.drawable.msg_screencast, null);
            }
            L1();
        } else {
            if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !R0()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(true) == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z10 && ((this.f40913a1.canRecordVideo() || z11) && !this.f40913a1.isScheduled() && !s1())) {
                if (z11) {
                    u0Var2.setVisibility(8);
                    e1Var8.setVisibility(0);
                    e1Var8.g(LocaleController.getString(R.string.VoipChatStopScreenCapture), R.drawable.msg_screencast_off, null);
                    e1Var8.setContentDescription(LocaleController.getString(R.string.VoipChatStopScreenCapture));
                } else {
                    e1Var8.g(LocaleController.getString(R.string.VoipChatStartScreenCapture), R.drawable.msg_screencast, null);
                    e1Var8.setContentDescription(LocaleController.getString(R.string.VoipChatStartScreenCapture));
                    u0Var2.setVisibility(8);
                    e1Var8.setVisibility(0);
                }
            } else {
                u0Var2.setVisibility(8);
                e1Var8.setVisibility(8);
            }
            e1Var5.setVisibility(8);
            e1Var6.setVisibility(8);
            e1Var7.setVisibility(8);
        }
        boolean R02 = R0();
        org.telegram.ui.ActionBar.e1 e1Var9 = this.f40983r1;
        if (R02 && this.f40913a1.call.can_change_join_muted && !p1()) {
            e1Var9.setVisibility(0);
        } else {
            e1Var9.setVisibility(8);
        }
        if (p1() && ((call = this.f40913a1) == null || (groupCall = call.call) == null || !groupCall.creator)) {
            z12 = false;
        }
        u0Var.I(4, z12);
        if (s1() && !this.f40913a1.isScheduled()) {
            i12 = 8;
        } else {
            i12 = 0;
        }
        this.f40974p1.setVisibility(i12);
        int visibility = e1Var6.getVisibility();
        TextView textView = this.A1;
        if (visibility != 0 && e1Var9.getVisibility() != 0 && e1Var.getVisibility() != 0 && e1Var8.getVisibility() != 0 && e1Var7.getVisibility() != 0 && e1Var5.getVisibility() != 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        org.telegram.ui.Cells.k kVar = this.f40954k0;
        if (((sharedInstance != null && VoIPService.getSharedInstance().hasFewPeers) || this.f40917b1) && !s1() && this.A0 != null) {
            kVar.setVisibility(0);
            long peerId = MessageObject.getPeerId(this.A0);
            if (DialogObject.isUserDialog(peerId)) {
                chat = accountInstance.getMessagesController().getUser(Long.valueOf(peerId));
            } else {
                chat = accountInstance.getMessagesController().getChat(Long.valueOf(-peerId));
            }
            kVar.setObject(chat);
        } else {
            kVar.setVisibility(8);
        }
        TLRPC.Chat chat5 = this.Z0;
        if (chat5 != null && !ChatObject.isChannelOrGiga(chat5) && s1() && e1Var.getVisibility() == 8) {
            u0Var.setVisibility(8);
        } else {
            u0Var.setVisibility(0);
        }
        LinearLayout linearLayout = this.f40951j1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        float f7 = 96;
        if (layoutParams.rightMargin != AndroidUtilities.dp(f7)) {
            layoutParams.rightMargin = AndroidUtilities.dp(f7);
            linearLayout.requestLayout();
        }
        ((FrameLayout.LayoutParams) this.f41018z1.getLayoutParams()).rightMargin = 0;
        this.O.setTitleRightMargin(AndroidUtilities.dp(48.0f) * 2);
    }

    public final void K1(int r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.s50.K1(int, boolean):void");
    }

    public final void L1() {
        if (this.f40913a1 == null) {
            return;
        }
        int currentTime = this.d.getConnectionsManager().getCurrentTime();
        ChatObject.Call call = this.f40913a1;
        int i10 = currentTime - call.call.record_start_date;
        boolean z10 = call.recording;
        org.telegram.ui.ActionBar.e1 e1Var = this.f40988s1;
        if (z10) {
            e1Var.setSubtext(AndroidUtilities.formatDuration(i10, false));
        } else {
            e1Var.setSubtext(null);
        }
    }

    public final void M1(boolean z10) {
        float interpolation;
        float f7;
        a40 a40Var = this.R;
        if ((a40Var == null || this.f40913a1 != null) && this.X0 == null) {
            this.W0 = 1.0f;
            this.V0 = 1.0f;
            if (a40Var == null) {
                return;
            }
        }
        int i10 = 4;
        if (!z10) {
            a30 a30Var = this.f41006w2;
            AndroidUtilities.cancelRunOnUIThread(a30Var);
            a30Var.run();
            ChatObject.Call call = this.f40913a1;
            y40 y40Var = this.Q;
            if (call != null && !call.isScheduled()) {
                y40Var.setVisibility(0);
            } else {
                y40Var.setVisibility(4);
            }
            boolean isChannelOrGiga = ChatObject.isChannelOrGiga(this.Z0);
            org.telegram.ui.ActionBar.e1 e1Var = this.f41005w1;
            if (isChannelOrGiga) {
                e1Var.setText(LocaleController.getString(R.string.VoipChannelCancelChat));
            } else {
                e1Var.setText(LocaleController.getString(R.string.VoipGroupCancelChat));
            }
        }
        float f10 = this.V0;
        if (f10 > 0.6f) {
            interpolation = 1.05f - (org.telegram.ui.Components.bs.f25030f.getInterpolation((f10 - 0.6f) / 0.4f) * 0.05f);
            this.W0 = 1.0f;
            f7 = 1.0f;
        } else {
            org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.f25030f;
            this.W0 = bsVar.getInterpolation(f10 / 0.6f);
            interpolation = 1.05f * bsVar.getInterpolation(this.V0 / 0.6f);
            f7 = this.V0 / 0.6f;
        }
        I1(true);
        float f11 = 1.0f - f7;
        a40Var.setAlpha(f11);
        this.U.setAlpha(f7);
        this.W.setAlpha(f7);
        x40 x40Var = this.V;
        x40Var.setAlpha(f7);
        x40Var.setScaleX(interpolation);
        x40Var.setScaleY(interpolation);
        y30 y30Var = this.T;
        y30Var.setScaleX(f11);
        y30Var.setScaleY(f11);
        y30Var.setAlpha(f11);
        this.S.setAlpha(f11);
        this.f40955k1.setAlpha(f7);
        if (f11 != 0.0f) {
            i10 = 0;
        }
        if (i10 != a40Var.getVisibility()) {
            a40Var.setVisibility(i10);
            y30Var.setVisibility(i10);
        }
    }

    public final void N1(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        org.telegram.ui.Components.voip.t2 t2Var = this.f40981r;
        if (t2Var != null && t2Var.getVisibility() == 0) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            w20 w20Var = this.e;
            boolean z14 = false;
            if (sharedInstance != null && !s1()) {
                lh.a aVar = (lh.a) w20Var.f16077c.get(t2Var);
                if (aVar != null) {
                    aVar.d.a(true, z10);
                    t2Var.setEnabled(true);
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
                    t2Var.c(R.drawable.calls_bluetooth, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingBluetooth), false, z10);
                } else if (z13) {
                    t2Var.c(R.drawable.calls_speaker, -1, 0, 0.3f, true, LocaleController.getString(R.string.VoipSpeaker), false, z10);
                } else if (sharedInstance.isHeadsetPlugged()) {
                    t2Var.c(R.drawable.calls_headphones, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingHeadset), false, z10);
                } else {
                    t2Var.c(R.drawable.calls_speaker, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipSpeaker), false, z10);
                }
                t2Var.b(z13, z10);
                i1();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.isBluetoothHeadsetConnected()) {
                    i10 = R.drawable.filled_calls_bluetooth_s;
                } else {
                    i10 = R.drawable.filled_sound_on;
                }
                if (this.f40912a0 != i10) {
                    this.f40912a0 = i10;
                    AndroidUtilities.updateImageViewImageAnimated(this.f40916b0, i10);
                }
                org.telegram.ui.Components.voip.t2 t2Var2 = this.h;
                if (t2Var2.getVisibility() == 0) {
                    t2Var2.c(0, -1, 0, 1.0f, true, g1(i1()), false, z10);
                    if (i1() != 1) {
                        z14 = true;
                    }
                    t2Var2.b(z14, z10);
                    return;
                }
                return;
            }
            t2Var.c(R.drawable.msg_voiceshare, -1, 0, 0.3f, true, LocaleController.getString(R.string.VoipChatShare), false, z10);
            if (!ChatObject.isPublic(this.Z0) && (!ChatObject.hasAdminRights(this.Z0) || !ChatObject.canAddUsers(this.Z0))) {
                z11 = false;
            } else {
                z11 = true;
            }
            lh.a aVar2 = (lh.a) w20Var.f16077c.get(t2Var);
            if (aVar2 != null) {
                aVar2.d.a(z11, z10);
                t2Var.setEnabled(z11);
            }
            t2Var.b(true, false);
        }
    }

    public final void O1(boolean r36, boolean r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.s50.O1(boolean, boolean):void");
    }

    public final void P0(boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.s50.P0(boolean):void");
    }

    public final void P1() {
        boolean z10;
        String str;
        float f7;
        float f10;
        q50 q50Var;
        TLRPC.User user;
        TLRPC.Chat chat;
        o40 o40Var = this.O;
        if (o40Var != null && this.f40913a1 != null) {
            SpannableStringBuilder spannableStringBuilder = null;
            int i10 = 0;
            for (int i11 = 0; i11 < this.f40913a1.currentSpeakingPeers.m(); i11++) {
                long j10 = this.f40913a1.currentSpeakingPeers.j(i11);
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f40913a1.currentSpeakingPeers.f(j10);
                if (!groupCallParticipant.self) {
                    j30 j30Var = this.a2;
                    j30Var.getClass();
                    if (j30Var.f31580w.get(MessageObject.getPeerId(groupCallParticipant.peer)) <= 0 && this.B2.get(j10, 0) != 1) {
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
                                    spannableStringBuilder.append(UserObject.getFirstName(user), new org.telegram.ui.Components.c61(AndroidUtilities.bold()), 0);
                                } else {
                                    spannableStringBuilder.append(chat.title, new org.telegram.ui.Components.c61(AndroidUtilities.bold()), 0);
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
                o40Var.getAdditionalSubtitleTextView().k(spannableStringBuilder2);
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.ActionBar.j5 subtitleTextView = o40Var.getSubtitleTextView();
            if (s1()) {
                str = "ViewersWatching";
            } else {
                str = "Participants";
            }
            int i13 = this.f40913a1.call.participants_count;
            m50 m50Var = this.P;
            subtitleTextView.k(LocaleController.formatPluralString(str, i13 + ((m50Var.M.s1() || m50Var.L || VoIPService.getSharedInstance() == null) ? 0 : !VoIPService.getSharedInstance().isJoined()), new Object[0]));
            if (s1() && (q50Var = this.B1) != null) {
                q50Var.setWatchersCount(this.f40913a1.call.participants_count);
            }
            if (z10 != this.f40997u2) {
                this.f40997u2 = z10;
                o40Var.invalidate();
                float f11 = 0.0f;
                o40Var.getSubtitleTextView().setPivotX(0.0f);
                o40Var.getSubtitleTextView().setPivotY(o40Var.getMeasuredHeight() >> 1);
                ViewPropertyAnimator animate = o40Var.getSubtitleTextView().animate();
                if (this.f40997u2) {
                    f7 = 0.98f;
                } else {
                    f7 = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f7);
                if (this.f40997u2) {
                    f10 = 0.9f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f10);
                if (!this.f40997u2) {
                    f11 = 1.0f;
                }
                scaleY.alpha(f11).setDuration(150L);
                AndroidUtilities.updateViewVisibilityAnimated(o40Var.getAdditionalSubtitleTextView(), this.f40997u2);
            }
        }
    }

    public final int Q0() {
        y40 y40Var = this.Q;
        int childCount = y40Var.getChildCount();
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = y40Var.getChildAt(i11);
            if (RecyclerView.R(childAt) >= 0) {
                i10 = Math.min(i10, childAt.getTop());
            }
        }
        return i10;
    }

    public final void Q1(boolean z10) {
        ChatObject.Call call = this.f40913a1;
        b30 b30Var = this.f40930e1;
        if (call == null) {
            if (ChatObject.isChannelOrGiga(this.Z0)) {
                b30Var.b(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), z10);
                return;
            } else {
                b30Var.b(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), z10);
                return;
            }
        }
        boolean isEmpty = TextUtils.isEmpty(call.call.title);
        o40 o40Var = this.O;
        if (!isEmpty) {
            if (!this.f40913a1.call.title.equals(o40Var.getTitle())) {
                if (z10) {
                    this.O.J(this.f40913a1.call.title, true, 180L, null);
                    o40Var.getTitleTextView().setOnClickListener(new c20(this, 8));
                } else {
                    o40Var.setTitle(this.f40913a1.call.title);
                }
                b30Var.b(this.f40913a1.call.title, z10);
            }
        } else {
            TLRPC.Chat chat = this.Z0;
            if (chat != null && !chat.title.equals(o40Var.getTitle())) {
                if (z10) {
                    this.O.J(this.Z0.title, true, 180L, null);
                    o40Var.getTitleTextView().setOnClickListener(new c20(this, 9));
                } else {
                    o40Var.setTitle(this.Z0.title);
                }
                if (ChatObject.isChannelOrGiga(this.Z0)) {
                    if (s1()) {
                        b30Var.b(this.Z0.title, z10);
                    } else {
                        b30Var.b(LocaleController.getString(R.string.VoipChannelVoiceChat), z10);
                    }
                } else {
                    b30Var.b(LocaleController.getString(R.string.VoipGroupVoiceChat), z10);
                }
            } else if (this.Z0 == null) {
                o40Var.setTitle(LocaleController.getString(R.string.ConferenceChat));
                b30Var.b(LocaleController.getString(R.string.ConferenceChat), z10);
            }
        }
        org.telegram.ui.ActionBar.j5 titleTextView = o40Var.getTitleTextView();
        if (this.f40913a1.recording) {
            if (titleTextView.getRightDrawable() == null) {
                titleTextView.i(new o50(titleTextView));
                TextView textView = b30Var.getTextView();
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new o50(textView), (Drawable) null);
                TextView nextTextView = b30Var.getNextTextView();
                nextTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new o50(nextTextView), (Drawable) null);
            }
        } else if (titleTextView.getRightDrawable() != null) {
            titleTextView.i(null);
            b30Var.getTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            b30Var.getNextTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public final boolean R0() {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isConference()) {
            ChatObject.Call call = this.f40913a1;
            if (call != null && (groupCall = call.call) != null && groupCall.creator) {
                return true;
            }
            return false;
        }
        return ChatObject.canManageCalls(this.Z0);
    }

    public final void R1() {
        float f7;
        org.telegram.ui.Components.ub ubVar;
        boolean z10;
        if (this.topBulletinContainer != null) {
            int dp = AndroidUtilities.dp(74.0f);
            float f10 = this.f41014y0 - dp;
            if (this.backgroundPaddingTop + f10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                int dp2 = (dp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f);
                f7 = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f10) - this.backgroundPaddingTop) / dp2);
                f10 -= (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp2) * f7);
            } else {
                f7 = 0.0f;
            }
            float paddingTop = f10 + this.containerView.getPaddingTop();
            FrameLayout frameLayout = this.topBulletinContainer;
            o40 o40Var = this.O;
            frameLayout.setTranslationY(AndroidUtilities.lerp(((-frameLayout.getTop()) - this.topBulletinContainer.getHeight()) + paddingTop + AndroidUtilities.dp(10.0f), o40Var.getY() + (-this.topBulletinContainer.getTop()) + o40Var.getHeight(), f7));
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f29632w;
            if (qcVar != null && (ubVar = qcVar.e) != null && ubVar.getParent() != null && ubVar.getParent().getParent() == this.topBulletinContainer) {
                if (f7 > 0.5f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ubVar.setTop(z10);
            }
        }
    }

    public final void S0() {
        if (this.R1) {
            this.R1 = false;
            AndroidUtilities.cancelRunOnUIThread(this.f41016y2);
        }
        if (this.S1) {
            this.S1 = false;
            MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
            this.f41003w.onTouchEvent(obtain);
            obtain.recycle();
        }
    }

    public final void T0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.s50.T0():void");
    }

    public final void U0() {
        this.F.setTranslationY((-this.C1.d()) + this.containerView.getPaddingBottom());
        this.G.invalidate();
        a1();
        Z0();
        X0();
        Y0();
        b1();
        this.e.setAlpha(1.0f - this.f41020z3.e);
        V0();
        W0();
    }

    public final void V0() {
        int i10;
        float f7 = this.C1.f44754b.f17403a;
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        u30 u30Var = this.F;
        u30Var.setAlpha(f7);
        t30 t30Var = this.G;
        t30Var.setAlpha(f7);
        if (u30Var.getVisibility() != i10) {
            u30Var.setVisibility(i10);
            t30Var.setVisibility(i10);
            if (i10 == 8) {
                r30 r30Var = this.H;
                if (r30Var.isFocused()) {
                    r30Var.clearFocus();
                }
            }
        }
    }

    public final void W0() {
        int i10;
        org.telegram.ui.Components.cl0 cl0Var = this.K;
        if (cl0Var != null) {
            float f7 = this.C1.f44754b.f17403a * this.A3.e;
            cl0Var.setAlpha(f7);
            if (f7 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            if (this.K.getVisibility() != i10) {
                this.K.setVisibility(i10);
                if (i10 == 8) {
                    this.K.n();
                }
            }
            org.telegram.ui.Components.cl0 cl0Var2 = this.K;
            if (!cl0Var2.N0 && f7 == 1.0f) {
                cl0Var2.N0 = true;
            }
        }
    }

    public final void X0() {
        boolean z10 = G3;
        w20 w20Var = this.e;
        if (z10) {
            w20Var.setTranslationX(0.0f);
            w20Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = F3;
        ne.b bVar = this.f41020z3;
        if (z11) {
            w20Var.setTranslationX(bVar.e * AndroidUtilities.dp(94.0f));
            w20Var.setTranslationY(0.0f);
            return;
        }
        w20Var.setTranslationX(0.0f);
        w20Var.setTranslationY(bVar.e * AndroidUtilities.dp(94.0f));
    }

    public final void Y0() {
        boolean z10 = G3;
        f30 f30Var = this.f40962m2;
        if (z10) {
            f30Var.setTranslationX(0.0f);
            f30Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = F3;
        ne.b bVar = this.f41020z3;
        if (z11) {
            f30Var.setTranslationX(bVar.e * AndroidUtilities.dp(94.0f));
            f30Var.setTranslationY(0.0f);
            return;
        }
        f30Var.setTranslationX(0.0f);
        f30Var.setTranslationY(bVar.e * AndroidUtilities.dp(94.0f));
    }

    public final void Z0() {
        float dp;
        float f7 = this.B3.e;
        qh.i iVar = this.C1;
        float f10 = -((iVar.d() - this.containerView.getPaddingBottom()) + f7 + (AndroidUtilities.dp(68.0f) * this.A3.e) + AndroidUtilities.dp(10.0f));
        if (G3) {
            dp = (1.0f - this.C3.e) * AndroidUtilities.dp(-91.0f);
        } else if (F3) {
            dp = 0.0f;
        } else {
            dp = ((this.f41020z3.e * AndroidUtilities.dp(94.0f)) - (AndroidUtilities.dp(104.0f) * this.a2.f31556c)) - AndroidUtilities.dp(91.0f);
        }
        float lerp = AndroidUtilities.lerp(dp, f10, iVar.f44754b.f17403a);
        float measuredHeight = ((this.containerView.getMeasuredHeight() - this.f41014y0) + lerp) - this.backgroundPaddingTop;
        float max = Math.max((measuredHeight / 3.0f) * 2.0f, measuredHeight - AndroidUtilities.dp(250.0f));
        mh.h hVar = this.f40921c0;
        hVar.setTranslationY(lerp);
        hVar.setVisibleHeight((int) max);
    }

    public final void a1() {
        if (this.K != null) {
            this.K.setTranslationY((-this.C1.d()) + this.containerView.getPaddingBottom() + ((-this.A3.e) * AndroidUtilities.dp(64.0f)));
        }
    }

    public final void b1() {
        boolean z10;
        float f7 = this.A3.e;
        float lerp = AndroidUtilities.lerp(0.25f, 1.0f, f7);
        ImageView imageView = this.J;
        imageView.setScaleX(lerp);
        imageView.setScaleY(AndroidUtilities.lerp(0.25f, 1.0f, f7));
        imageView.setAlpha(f7);
        boolean z11 = false;
        if (f7 > 0.9f) {
            z10 = true;
        } else {
            z10 = false;
        }
        imageView.setClickable(z10);
        float f10 = 1.0f - f7;
        float lerp2 = AndroidUtilities.lerp(0.25f, 1.0f, f10);
        ImageView imageView2 = this.I;
        imageView2.setScaleX(lerp2);
        imageView2.setScaleY(AndroidUtilities.lerp(0.25f, 1.0f, f10));
        imageView2.setAlpha(f10);
        if (f10 > 0.9f) {
            z11 = true;
        }
        imageView2.setClickable(z11);
    }

    public final void c1() {
        org.telegram.ui.Components.voip.t tVar = this.Z2;
        if (tVar != null) {
            tVar.f31747a.setRoundCorners(AndroidUtilities.dp(8.0f));
            org.telegram.ui.Components.voip.t tVar2 = this.Z2;
            tVar2.h = false;
            tVar2.j(false);
            this.Z2.invalidate();
            this.a2.invalidate();
        }
        org.telegram.ui.Cells.d4 d4Var = this.X2;
        if (d4Var != null && !this.f40919b3 && d4Var.getParent() != null) {
            this.containerView.removeView(this.X2);
        }
        org.telegram.ui.Cells.d4 d4Var2 = this.X2;
        if (d4Var2 != null) {
            d4Var2.setProgressToAvatarPreview(0.0f);
            this.X2.setAboutVisible(false);
            this.X2.getAvatarImageView().setAlpha(1.0f);
        }
        org.telegram.ui.Components.z20 z20Var = this.f40914a3;
        if (z20Var != null) {
            z20Var.getAvatarImageView().setAlpha(1.0f);
        }
        this.X2 = null;
        this.Y2 = null;
        this.f40914a3 = null;
        this.Z2 = null;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final boolean canDismissWithTouchOutside() {
        return !this.a2.f31554b;
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
        y40 y40Var = this.Q;
        int i19 = 0;
        if (i10 == i18) {
            Long l4 = (Long) objArr[1];
            ChatObject.Call call = this.f40913a1;
            if (call != null && call.call.f20282id == l4.longValue()) {
                ChatObject.Call call2 = this.f40913a1;
                if (call2.call instanceof TLRPC.TL_groupCallDiscarded) {
                    dismiss();
                    return;
                }
                int i20 = (this.f40991t0 > 0L ? 1 : (this.f40991t0 == 0L ? 0 : -1));
                AccountInstance accountInstance = this.d;
                if (i20 == 0 && (((i17 = this.F1) == 7 || i17 == 5 || i17 == 6) && !call2.isScheduled())) {
                    try {
                        Intent intent = new Intent(this.f40946i0, VoIPService.class);
                        intent.putExtra("chat_id", j1());
                        intent.putExtra("createGroupCall", false);
                        intent.putExtra("hasFewPeers", this.f40917b1);
                        intent.putExtra("peerChannelId", this.Y0.channel_id);
                        intent.putExtra("peerChatId", this.Y0.chat_id);
                        intent.putExtra("peerUserId", this.Y0.user_id);
                        intent.putExtra("hash", this.f40922c1);
                        intent.putExtra("peerAccessHash", this.Y0.access_hash);
                        intent.putExtra("is_outgoing", true);
                        intent.putExtra("start_incall_activity", false);
                        intent.putExtra("account", accountInstance.getCurrentAccount());
                        intent.putExtra("scheduleDate", this.f40956k2);
                        this.f40946i0.startService(intent);
                    } catch (Throwable th2) {
                        FileLog.e(th2);
                    }
                    this.f40991t0 = SystemClock.elapsedRealtime();
                    AndroidUtilities.runOnUIThread(new e20(this, 2), 3000L);
                }
                if (!this.f40995u0 && VoIPService.getSharedInstance() != null) {
                    this.f40913a1.addSelfDummyParticipant(false);
                    m1();
                    VoIPService.getSharedInstance().playConnectedSound();
                }
                J1();
                int childCount = y40Var.getChildCount();
                for (int i21 = 0; i21 < childCount; i21++) {
                    View childAt = y40Var.getChildAt(i21);
                    if (childAt instanceof org.telegram.ui.Cells.d4) {
                        ((org.telegram.ui.Cells.d4) childAt).a(true, false);
                    }
                }
                if (this.X2 != null) {
                    this.f40987s0 = true;
                } else {
                    P0(true);
                }
                P1();
                boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                if (this.F1 == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                O1(true, booleanValue);
                Q1(true);
                if (z11 && ((i16 = this.F1) == 1 || i16 == 0)) {
                    l1().j(38, 0L, null);
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().playAllowTalkSound();
                    }
                }
                if (objArr.length >= 4) {
                    Long l10 = (Long) objArr[3];
                    long longValue = l10.longValue();
                    if (longValue != 0 && !s1()) {
                        if (!p1() || (sharedInstance = VoIPService.getSharedInstance()) == null || longValue != sharedInstance.convertingFromCallWithUserId) {
                            try {
                                ArrayList<TLRPC.Dialog> allDialogs = accountInstance.getMessagesController().getAllDialogs();
                                if (allDialogs != null) {
                                    int size = allDialogs.size();
                                    int i22 = 0;
                                    while (true) {
                                        if (i22 >= size) {
                                            break;
                                        }
                                        TLRPC.Dialog dialog = allDialogs.get(i22);
                                        i22++;
                                        if (dialog.f20276id == longValue) {
                                            i19 = 1;
                                            break;
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                            }
                            if (DialogObject.isUserDialog(longValue)) {
                                TLRPC.User user = accountInstance.getMessagesController().getUser(l10);
                                if (user != null) {
                                    if (this.f40913a1.call.participants_count < 250 || UserObject.isContact(user) || user.verified || i19 != 0) {
                                        l1().k(0L, 44, user, this.Z0, null, null);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(-longValue));
                            if (chat != null) {
                                if (this.f40913a1.call.participants_count < 250 || !ChatObject.isNotInChat(chat) || chat.verified || i19 != 0) {
                                    l1().k(0L, 44, chat, this.Z0, null, null);
                                }
                            }
                        }
                    }
                }
            }
        } else if (i10 == NotificationCenter.groupCallSpeakingUsersUpdated) {
            j30 j30Var = this.a2;
            if (j30Var.f31554b && this.f40913a1 != null) {
                boolean c10 = j30Var.c();
                ChatObject.Call call3 = this.f40913a1;
                if (call3 != null && j30Var.f31554b && (videoParticipant = j30Var.e) != null && call3.participants.f(MessageObject.getPeerId(videoParticipant.participant.peer)) == null) {
                    c10 = true;
                }
                if (c10) {
                    ChatObject.VideoParticipant videoParticipant2 = null;
                    int i23 = 0;
                    while (true) {
                        ArrayList arrayList = this.f40977q0;
                        if (i23 >= arrayList.size()) {
                            break;
                        }
                        ChatObject.VideoParticipant videoParticipant3 = (ChatObject.VideoParticipant) arrayList.get(i23);
                        if (this.f40913a1.currentSpeakingPeers.g(null, MessageObject.getPeerId(videoParticipant3.participant.peer)) != null) {
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
                        i23++;
                    }
                    if (videoParticipant2 != null) {
                        f1(videoParticipant2);
                    }
                }
            }
            j30Var.setVisibleParticipant(true);
            P1();
        } else if (i10 == NotificationCenter.webRtcMicAmplitudeEvent) {
            D1(((Float) objArr[0]).floatValue());
        } else if (i10 == NotificationCenter.needShowAlert) {
            if (((Integer) objArr[0]).intValue() == 6) {
                String str = (String) objArr[1];
                if ("GROUPCALL_PARTICIPANTS_TOO_MUCH".equals(str)) {
                    if (ChatObject.isChannelOrGiga(this.Z0)) {
                        string = LocaleController.getString(R.string.VoipChannelTooMuch);
                    } else {
                        string = LocaleController.getString(R.string.VoipGroupTooMuch);
                    }
                } else if (!"ANONYMOUS_CALLS_DISABLED".equals(str) && !"GROUPCALL_ANONYMOUS_FORBIDDEN".equals(str)) {
                    string = LocaleController.getString(R.string.ErrorOccurred) + "\n" + str;
                } else if (ChatObject.isChannelOrGiga(this.Z0)) {
                    string = LocaleController.getString(R.string.VoipChannelJoinAnonymousAdmin);
                } else {
                    string = LocaleController.getString(R.string.VoipGroupJoinAnonymousAdmin);
                }
                AlertDialog$Builder M = org.telegram.ui.Components.f5.M(getContext(), LocaleController.getString(R.string.VoipGroupVoiceChat), string);
                M.j(new i20(this, 1));
                try {
                    M.o();
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        } else if (i10 == NotificationCenter.didEndCall) {
            if (VoIPService.getSharedInstance() == null) {
                dismiss();
            }
        } else if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f20273id == j1()) {
                J1();
                O1(isShowing(), false);
            }
            long peerId = MessageObject.getPeerId(this.A0);
            ChatObject.Call call4 = this.f40913a1;
            if (call4 != null && chatFull.f20273id == (-peerId) && (groupCallParticipant2 = (TLRPC.GroupCallParticipant) call4.participants.f(peerId)) != null) {
                groupCallParticipant2.about = chatFull.about;
                P0(true);
                AndroidUtilities.updateVisibleRows(y40Var);
                if (this.E2 != null) {
                    while (i19 < this.E2.getChildCount()) {
                        View childAt2 = this.E2.getChildAt(i19);
                        if ((childAt2 instanceof org.telegram.ui.ActionBar.e1) && childAt2.getTag() != null && ((Integer) childAt2.getTag()).intValue() == 10) {
                            org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) childAt2;
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
                            e1Var.g(string2, i15, null);
                        }
                        i19++;
                    }
                }
            }
        } else if (i10 == NotificationCenter.didLoadChatAdmins) {
            if (((Long) objArr[0]).longValue() == j1()) {
                J1();
                O1(isShowing(), false);
            }
        } else if (i10 == NotificationCenter.applyGroupCallVisibleParticipants) {
            int childCount2 = y40Var.getChildCount();
            long longValue2 = ((Long) objArr[0]).longValue();
            while (i19 < childCount2) {
                s4.b1 G = y40Var.G(y40Var.getChildAt(i19));
                if (G != null) {
                    View view = G.f45938a;
                    if (view instanceof org.telegram.ui.Cells.d4) {
                        org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) view;
                        if (d4Var.getParticipant() != null) {
                            d4Var.getParticipant().lastVisibleDate = longValue2;
                        }
                    }
                }
                i19++;
            }
        } else if (i10 == NotificationCenter.userInfoDidLoad) {
            Long l11 = (Long) objArr[0];
            long peerId2 = MessageObject.getPeerId(this.A0);
            if (this.f40913a1 != null && peerId2 == l11.longValue() && (groupCallParticipant = (TLRPC.GroupCallParticipant) this.f40913a1.participants.f(peerId2)) != null) {
                groupCallParticipant.about = ((TLRPC.UserFull) objArr[1]).about;
                P0(true);
                AndroidUtilities.updateVisibleRows(y40Var);
                if (this.E2 != null) {
                    while (i19 < this.E2.getChildCount()) {
                        View childAt3 = this.E2.getChildAt(i19);
                        if ((childAt3 instanceof org.telegram.ui.ActionBar.e1) && childAt3.getTag() != null && ((Integer) childAt3.getTag()).intValue() == 10) {
                            org.telegram.ui.ActionBar.e1 e1Var2 = (org.telegram.ui.ActionBar.e1) childAt3;
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
                            e1Var2.g(string3, i13, null);
                        }
                        i19++;
                    }
                }
            }
        } else if (i10 == NotificationCenter.mainUserInfoChanged) {
            P0(true);
            AndroidUtilities.updateVisibleRows(y40Var);
        } else if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0) {
                P0(true);
            }
            if ((MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0 || (intValue & MessagesController.UPDATE_MASK_EMOJI_STATUS) != 0) {
                AndroidUtilities.updateVisibleRows(y40Var);
            }
        } else if (i10 == NotificationCenter.groupCallScreencastStateChanged) {
            d40 d40Var = this.f41017z0;
            if (d40Var != null) {
                d40Var.b(true, true);
            }
            J1();
        } else if (i10 == NotificationCenter.conferenceEmojiUpdated) {
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            d50 d50Var = this.f40973p0;
            if (sharedInstance2 != null && (conferenceCall = sharedInstance2.conference) != null) {
                strArr = conferenceCall.getEmojis();
            }
            d50Var.b(strArr);
        }
    }

    @Override
    public final void dismiss() {
        LaunchActivity launchActivity = this.f40946i0;
        launchActivity.f33144a1.remove(this.f41001v2);
        this.f40946i0.setRequestedOrientation(-1);
        E3 = false;
        org.telegram.ui.Components.a40 a40Var = this.E1;
        if (a40Var != null) {
            a40Var.dismiss();
        }
        this.f40987s0 = true;
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
        j30 j30Var = this.a2;
        if (j30Var != null) {
            if (this.f40979q2 != null) {
                this.Q.getViewTreeObserver().removeOnPreDrawListener(this.f40979q2);
                this.f40979q2 = null;
            }
            ArrayList arrayList = this.Z1;
            arrayList.clear();
            ArrayList arrayList2 = this.Y1;
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
        if (D3 == this) {
            D3 = null;
        }
        E3 = false;
        VoIPService.audioLevelsCallback = null;
        org.telegram.ui.Components.i30.j(getContext());
        ChatObject.Call call = this.f40913a1;
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
        if (this.f40946i0 == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0 && ((keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25) && VoIPService.getSharedInstance() != null && Build.VERSION.SDK_INT >= 32)) {
            boolean isSpeakerMuted = WebRtcAudioTrack.isSpeakerMuted();
            AudioManager audioManager = (AudioManager) this.f40946i0.getSystemService("audio");
            boolean z10 = false;
            if (audioManager.getStreamVolume(0) == audioManager.getStreamMinVolume(0) && keyEvent.getKeyCode() == 25) {
                z10 = true;
            }
            WebRtcAudioTrack.setSpeakerMute(z10);
            if (isSpeakerMuted != WebRtcAudioTrack.isSpeakerMuted()) {
                UndoView l1 = l1();
                if (z10) {
                    i10 = 42;
                } else {
                    i10 = 43;
                }
                l1.j(i10, 0L, null);
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void e1(boolean z10) {
        if (!this.f40924c3 && this.f40936f2) {
            if (z10) {
                this.f40924c3 = true;
                z1(false, this.X2);
                return;
            }
            c1();
            this.containerView.removeView(this.f40931e2);
            this.f40931e2 = null;
            this.C2.setVisibility(8);
            this.containerView.invalidate();
            this.f40936f2 = false;
            this.Y.X = true;
            this.Q.invalidate();
            this.f40918b2.setVisibility(8);
            if (this.f40987s0) {
                this.f40987s0 = false;
                P0(true);
            }
            T0();
        }
    }

    public final void f1(ChatObject.VideoParticipant videoParticipant) {
        ChatObject.VideoParticipant videoParticipant2;
        if (videoParticipant == null) {
            this.f40946i0.setRequestedOrientation(-1);
        }
        if (VoIPService.getSharedInstance() != null) {
            j30 j30Var = this.a2;
            if (j30Var.f31573r != null) {
                return;
            }
            boolean z10 = G3;
            y40 y40Var = this.Q;
            int i10 = 0;
            if (z10) {
                if (this.f40979q2 != null) {
                    y40Var.getViewTreeObserver().removeOnPreDrawListener(this.f40979q2);
                    this.f40979q2 = null;
                }
                ArrayList arrayList = new ArrayList();
                x50 x50Var = this.f40971o2;
                ArrayList arrayList2 = this.Y1;
                ArrayList arrayList3 = this.Z1;
                if (videoParticipant == null) {
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) arrayList3.get(i11);
                        org.telegram.ui.Components.voip.l lVar = tVar.f31751c;
                        if (lVar != null) {
                            lVar.setRenderer(null);
                            org.telegram.ui.Components.z20 z20Var = tVar.d;
                            if (z20Var != null) {
                                z20Var.setRenderer(null);
                            }
                            org.telegram.ui.Components.voip.l lVar2 = tVar.e;
                            if (lVar2 != null) {
                                lVar2.setRenderer(null);
                            }
                            arrayList.add(tVar.f31775w);
                            tVar.b(false);
                            tVar.animate().alpha(0.0f).setListener(new e40(this, tVar));
                        }
                    }
                    this.P2 = false;
                    x50Var.H(this.f40967n2, true, true);
                } else {
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) arrayList3.get(i12);
                        if (tVar2.e != null && ((videoParticipant2 = tVar2.f31775w) == null || !videoParticipant2.equals(videoParticipant))) {
                            arrayList.add(tVar2.f31775w);
                            tVar2.b(false);
                            org.telegram.ui.Components.z20 z20Var2 = tVar2.d;
                            if (z20Var2 != null) {
                                z20Var2.setRenderer(null);
                            }
                            org.telegram.ui.Components.voip.l lVar3 = tVar2.f31751c;
                            if (lVar3 != null) {
                                lVar3.setRenderer(null);
                            }
                            tVar2.animate().alpha(0.0f).setListener(new f40(this, tVar2));
                        }
                    }
                    this.P2 = true;
                    x50Var.f42999r = false;
                    if (!arrayList.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new nt(20, this, arrayList));
                    }
                }
                ViewTreeObserver viewTreeObserver = y40Var.getViewTreeObserver();
                h40 h40Var = new h40(this, videoParticipant, !j30Var.f31554b);
                this.f40979q2 = h40Var;
                viewTreeObserver.addOnPreDrawListener(h40Var);
                return;
            }
            if (this.f40979q2 != null) {
                y40Var.getViewTreeObserver().removeOnPreDrawListener(this.f40979q2);
                this.f40979q2 = null;
            }
            if (videoParticipant != null) {
                f30 f30Var = this.f40962m2;
                if (f30Var.getVisibility() != 0) {
                    f30Var.setVisibility(0);
                    org.telegram.ui.Components.a30 a30Var = this.f40975p2;
                    a30Var.G(f30Var, false);
                    this.f40987s0 = true;
                    if (!j30Var.f31554b) {
                        ArrayList arrayList4 = a30Var.e;
                        s4.b0 b0Var = (s4.b0) f30Var.getLayoutManager();
                        if (b0Var != null) {
                            while (true) {
                                if (i10 >= arrayList4.size()) {
                                    break;
                                } else if (((ChatObject.VideoParticipant) arrayList4.get(i10)).equals(videoParticipant)) {
                                    b0Var.h1(i10, AndroidUtilities.dp(13.0f));
                                    break;
                                } else {
                                    i10++;
                                }
                            }
                        }
                    }
                    ViewTreeObserver viewTreeObserver2 = y40Var.getViewTreeObserver();
                    i40 i40Var = new i40(this, videoParticipant);
                    this.f40979q2 = i40Var;
                    viewTreeObserver2.addOnPreDrawListener(i40Var);
                    return;
                }
                j30Var.j(videoParticipant);
                AndroidUtilities.updateVisibleRows(f30Var);
            } else if (y40Var.getVisibility() != 0) {
                y40Var.setVisibility(0);
                P0(false);
                this.f40987s0 = true;
                ViewTreeObserver viewTreeObserver3 = y40Var.getViewTreeObserver();
                j40 j40Var = new j40(this);
                this.f40979q2 = j40Var;
                viewTreeObserver3.addOnPreDrawListener(j40Var);
            } else {
                ViewTreeObserver viewTreeObserver4 = y40Var.getViewTreeObserver();
                k40 k40Var = new k40(this);
                this.f40979q2 = k40Var;
                viewTreeObserver4.addOnPreDrawListener(k40Var);
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    public final int i1() {
        Integer num = this.y3;
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

    public final long j1() {
        TLRPC.Chat chat = this.Z0;
        if (chat == null) {
            return 0L;
        }
        return chat.f20272id;
    }

    public final void k1(boolean z10) {
        boolean z11;
        String str;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        AccountInstance accountInstance = this.d;
        TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(j1()));
        if (chat != null && !ChatObject.isPublic(chat)) {
            TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(j1());
            String publicUsername = ChatObject.getPublicUsername(this.Z0);
            if (!TextUtils.isEmpty(publicUsername)) {
                str = a1.g.q(accountInstance.getMessagesController().linkPrefix, "/", publicUsername, new StringBuilder());
            } else if (chatFull != null && (tL_chatInviteExported = chatFull.exported_invite) != null) {
                str = tL_chatInviteExported.link;
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                tL_messages_exportChatInvite.peer = MessagesController.getInputPeer(this.Z0);
                accountInstance.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new ai.w9(this, chatFull, z10, 6));
                return;
            }
            v1(null, str, true, z10);
        } else if (this.f40913a1 != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                exportgroupcallinvite.call = this.f40913a1.getInputGroupCall();
                if (i10 == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                exportgroupcallinvite.can_self_unmute = z11;
                accountInstance.getConnectionsManager().sendRequest(exportgroupcallinvite, new org.telegram.messenger.voip.m0(this, i10, z10, 1));
            }
        }
    }

    public final UndoView l1() {
        if (!G3) {
            j30 j30Var = this.a2;
            if (j30Var.f31554b) {
                return j30Var.getUndoView();
            }
        }
        UndoView[] undoViewArr = this.f40950j0;
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

    public final void m1() {
        VoIPService sharedInstance;
        int i10;
        if (!this.f40995u0 && (sharedInstance = VoIPService.getSharedInstance()) != null) {
            this.f40995u0 = true;
            this.D0.addAll(this.f40913a1.visibleParticipants);
            this.E0.addAll(this.f40977q0);
            this.F0.addAll(this.f40913a1.invitedUsers);
            this.G0.addAll(this.f40913a1.shadyJoinParticipants);
            this.H0.addAll(this.f40913a1.shadyLeftParticipants);
            this.T1 = sharedInstance.getCallState();
            if (this.f40913a1 == null) {
                ChatObject.Call call = sharedInstance.groupCall;
                this.f40913a1 = call;
                this.f40975p2.f24471c = call;
                this.a2.setGroupCall(call);
                this.f40971o2.f42996c = this.f40913a1;
            }
            mh.h hVar = this.f40921c0;
            if (hVar != null) {
                hVar.C0(this.d.getCurrentAccount(), this.f40913a1.getInputGroupCall(false));
            }
            this.O.setTitleRightMargin(AndroidUtilities.dp(48.0f) * 2);
            this.f40913a1.saveActiveDates();
            VoIPService.getSharedInstance().registerStateListener(this);
            x40 x40Var = this.V;
            if (x40Var != null && x40Var.getVisibility() == 0) {
                this.f40986s.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Dg, false), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, true);
                N1(true);
                if (ChatObject.isChannelOrGiga(this.Z0)) {
                    i10 = R.string.VoipChannelEndChat;
                } else {
                    i10 = R.string.VoipGroupEndChat;
                }
                this.f41005w1.setText(LocaleController.getString(i10));
                y40 y40Var = this.Q;
                y40Var.setVisibility(0);
                org.telegram.ui.ActionBar.u0 u0Var = this.l1;
                u0Var.setVisibility(0);
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(y40Var, property, 0.0f, 1.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(y40Var, View.TRANSLATION_Y, AndroidUtilities.dp(200.0f), 0.0f);
                Property property2 = View.SCALE_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(x40Var, property2, 0.0f);
                Property property3 = View.SCALE_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(x40Var, property3, 0.0f);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(x40Var, property, 0.0f);
                org.telegram.ui.ActionBar.j5 j5Var = this.U;
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(j5Var, property2, 0.0f);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(j5Var, property3, 0.0f);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(j5Var, property, 0.0f);
                org.telegram.ui.ActionBar.j5 j5Var2 = this.W;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(j5Var2, property2, 0.0f), ObjectAnimator.ofFloat(j5Var2, property3, 0.0f), ObjectAnimator.ofFloat(j5Var2, property, 0.0f), ObjectAnimator.ofFloat(u0Var, property2, 0.0f, 1.0f), ObjectAnimator.ofFloat(u0Var, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(u0Var, property, 0.0f, 1.0f));
                animatorSet.setInterpolator(org.telegram.ui.Components.bs.f25031g);
                animatorSet.addListener(new l40(this, 0));
                animatorSet.setDuration(300L);
                animatorSet.start();
            }
        }
    }

    public final void n1(final long j10, final boolean z10) {
        if (this.f40913a1 != null) {
            AccountInstance accountInstance = this.d;
            final TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(j10));
            if (user != null) {
                final org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(getContext(), 3, null)};
                final TL_phone.inviteToGroupCall invitetogroupcall = new TL_phone.inviteToGroupCall();
                invitetogroupcall.call = this.f40913a1.getInputGroupCall();
                TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                tL_inputUser.user_id = user.f20419id;
                tL_inputUser.access_hash = user.access_hash;
                invitetogroupcall.users.add(tL_inputUser);
                int sendRequest = accountInstance.getConnectionsManager().sendRequest(invitetogroupcall, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        s50 s50Var = s50.this;
                        long j11 = j10;
                        org.telegram.ui.ActionBar.b2[] b2VarArr2 = b2VarArr;
                        if (tLObject != null) {
                            s50Var.d.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                            AndroidUtilities.runOnUIThread(new ai.c3(s50Var, j11, b2VarArr2, user, 20));
                            return;
                        }
                        AndroidUtilities.runOnUIThread(new ai.m(s50Var, b2VarArr2, z10, tL_error, j11, invitetogroupcall));
                    }
                });
                if (sendRequest != 0) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.w31(this, b2VarArr, sendRequest, 3), 500L);
                }
            }
        }
    }

    public final boolean o1() {
        float f7;
        int dp = AndroidUtilities.dp(74.0f);
        float f10 = this.f41014y0 - dp;
        if (this.backgroundPaddingTop + f10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            f7 = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f10) - this.backgroundPaddingTop) / ((dp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f)));
        } else {
            f7 = 0.0f;
        }
        if (f7 > 0.5f) {
            return true;
        }
        return false;
    }

    @Override
    public final void onAudioSettingsChanged() {
        N1(true);
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            D1(0.0f);
        }
        y40 y40Var = this.Q;
        if (y40Var.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(y40Var);
        }
        f30 f30Var = this.f40962m2;
        if (f30Var.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(f30Var);
        }
        ArrayList arrayList = this.Z1;
        arrayList.clear();
        arrayList.addAll(this.Y1);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).j(true);
        }
    }

    @Override
    public final void onBackPressed() {
        d40 d40Var = this.f41017z0;
        if (d40Var != null) {
            d40Var.b(false, false);
        } else if (this.f40936f2) {
            e1(true);
        } else if (this.a2.f31554b) {
            f1(null);
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
        ArrayList arrayList = this.Z1;
        arrayList.clear();
        arrayList.addAll(this.Y1);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).j(true);
        }
        d40 d40Var = this.f41017z0;
        if (d40Var != null && VoIPService.getSharedInstance() != null) {
            d40Var.h.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LaunchActivity launchActivity = this.f40946i0;
        launchActivity.f33144a1.add(this.f41001v2);
    }

    @Override
    public final boolean onCustomOpenAnimation() {
        E3 = true;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        org.telegram.ui.Components.i30.j(getContext());
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
        this.T1 = i10;
        O1(isShowing(), false);
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.u0.h(this, z10);
    }

    public final boolean p1() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isConference()) {
            return true;
        }
        return false;
    }

    public final boolean r1() {
        if (!s1() || this.f40913a1.visibleVideoParticipants.isEmpty() || (this.f40913a1.visibleVideoParticipants.get(0).aspectRatio != 0.0f && this.f40913a1.visibleVideoParticipants.get(0).aspectRatio < 1.0f)) {
            return false;
        }
        return true;
    }

    public final boolean s1() {
        ChatObject.Call call = this.f40913a1;
        if (call != null && call.call.rtmp_stream) {
            return true;
        }
        return false;
    }

    @Override
    public final void show() {
        super.show();
        if (org.telegram.ui.Components.voip.h1.f31480d0.V) {
            org.telegram.ui.Components.voip.h1.j();
        }
    }

    public final void t1(org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.b2 b2Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
        long j10;
        if (!this.f41004w0) {
            org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f40946i0.O().getFragmentStack().get(this.f40946i0.O().getFragmentStack().size() - 1);
            if (n2Var instanceof sn) {
                boolean U9 = ((sn) n2Var).U9();
                this.f41004w0 = true;
                this.f41009x0 = true;
                ai.y3 y3Var = new ai.y3(f3Var, editTextBoldCursor, z10, b2Var, 21);
                if (U9) {
                    j10 = 200;
                } else {
                    j10 = 0;
                }
                AndroidUtilities.runOnUIThread(y3Var, j10);
                return;
            }
            this.f41004w0 = true;
            this.f41009x0 = true;
            if (f3Var != null) {
                f3Var.setFocusable(true);
            } else if (b2Var != null) {
                b2Var.k(true);
            }
            if (z10) {
                AndroidUtilities.runOnUIThread(new ch(2, editTextBoldCursor), 100L);
            }
        }
    }

    @Override
    public final void u(int i10, float f7, float f10, ne.e eVar) {
        if (i10 == 2) {
            Z0();
            X0();
            Y0();
            float f11 = 1.0f - this.f41020z3.e;
            w20 w20Var = this.e;
            w20Var.setAlpha(f11);
            this.a2.setProgressToHideUi(f7);
            this.f40962m2.invalidate();
            this.containerView.invalidate();
            w20Var.invalidate();
        }
        if (i10 == 3) {
            a1();
            Z0();
            b1();
            W0();
            this.containerView.invalidate();
        }
        if (i10 == 4) {
            Z0();
            this.G.invalidate();
            this.H.invalidate();
        }
        if (i10 == 5) {
            Z0();
            this.containerView.invalidate();
        }
    }

    public final void v1(java.lang.String r11, java.lang.String r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.s50.v1(java.lang.String, java.lang.String, boolean, boolean):void");
    }

    public final void w1() {
        ChatObject.Call call = this.f40913a1;
        if (call != null && call.call != null) {
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(getContext(), 3, null);
            b2Var.q(300L);
            TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
            exportgroupcallinvite.call = tL_inputGroupCall;
            TLRPC.GroupCall groupCall = this.f40913a1.call;
            tL_inputGroupCall.f20289id = groupCall.f20282id;
            tL_inputGroupCall.access_hash = groupCall.access_hash;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(exportgroupcallinvite, new ea(this, b2Var, exportgroupcallinvite, 12));
        }
    }

    public final void y1(org.telegram.tgnet.TLRPC.GroupCallParticipant r33, final long r34, int r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.s50.y1(org.telegram.tgnet.TLRPC$GroupCallParticipant, long, int):void");
    }

    public final void z1(boolean r18, org.telegram.ui.Cells.d4 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.s50.z1(boolean, org.telegram.ui.Cells.d4):void");
    }

    @Override
    public final void E(float f7, int i10) {
    }
}
