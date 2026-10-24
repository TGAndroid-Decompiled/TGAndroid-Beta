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
import org.telegram.messenger.DispatchQueue2;
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
public final class u50 extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate, VoIPService.StateListener, ne.d {
    public static u50 D3;
    public static boolean E3;
    public static boolean F3;
    public static boolean G3;
    public static volatile DispatchQueue H3 = new DispatchQueue("updateTextureLightningQueue");
    public static boolean I3;
    public TLRPC.Peer A0;
    public final TextView A1;
    public final z5 A2;
    public final ne.b A3;
    public TLObject B0;
    public final s50 B1;
    public final LongSparseIntArray B2;
    public final ne.e B3;
    public final Paint C0;
    public final qh.i C1;
    public final n30 C2;
    public final ne.b C3;
    public final ArrayList D0;
    public f20 D1;
    public final l30 D2;
    public final Paint E;
    public final ArrayList E0;
    public org.telegram.ui.Components.y30 E1;
    public LinearLayout E2;
    public final v30 F;
    public final ArrayList F0;
    public int F1;
    public boolean F2;
    public final u30 G;
    public final ArrayList G0;
    public boolean G1;
    public final org.telegram.ui.Components.xj0 G2;
    public final s30 H;
    public final ArrayList H0;
    public boolean H1;
    public int H2;
    public final ImageView I;
    public int I0;
    public final Paint I1;
    public boolean I2;
    public final ImageView J;
    public final org.telegram.ui.Components.xj0 J0;
    public final Paint J1;
    public final View J2;
    public org.telegram.ui.Components.fl0 K;
    public final org.telegram.ui.Components.xj0 K0;
    public final t50[] K1;
    public final View K2;
    public final x40 L;
    public boolean L0;
    public float L1;
    public GradientDrawable L2;
    public final org.telegram.ui.Components.o6 M;
    public final org.telegram.ui.Components.z9 M0;
    public t50 M1;
    public final int[] M2;
    public final d30 N;
    public final org.telegram.ui.Components.z9 N0;
    public t50 N1;
    public final h30 N2;
    public final p40 O;
    public float O0;
    public long O1;
    public boolean O2;
    public final o50 P;
    public float P0;
    public float P1;
    public boolean P2;
    public final z40 Q;
    public float Q0;
    public float Q1;
    public RenderNode Q2;
    public final b40 R;
    public RadialGradient R0;
    public boolean R1;
    public float R2;
    public final TextView S;
    public final Matrix S0;
    public boolean S1;
    public boolean S2;
    public final z30 T;
    public final Paint T0;
    public int T1;
    public final String[] T2;
    public final org.telegram.ui.ActionBar.n5 U;
    public final j50 U0;
    public float U1;
    public ObjectAnimator U2;
    public final y40 V;
    public float V0;
    public int V1;
    public ObjectAnimator V2;
    public final org.telegram.ui.ActionBar.n5 W;
    public float W0;
    public boolean W1;
    public final h40 W2;
    public final i50 X;
    public ValueAnimator X0;
    public final int[] X1;
    public org.telegram.ui.Cells.d4 X2;
    public final org.telegram.ui.Components.vz Y;
    public TLRPC.InputPeer Y0;
    public final ArrayList Y1;
    public org.telegram.ui.Components.voip.l Y2;
    public final ImageReceiver Z;
    public TLRPC.Chat Z0;
    public final ArrayList Z1;
    public org.telegram.ui.Components.voip.t Z2;
    public int f42216a0;
    public ChatObject.Call f42217a1;
    public final k30 a2;
    public org.telegram.ui.Components.x20 f42218a3;
    public final m30 f42219b;
    public final ImageView f42220b0;
    public final boolean f42221b1;
    public final p30 f42222b2;
    public boolean f42223b3;
    public final r20 f42224c;
    public final mh.h f42225c0;
    public final String f42226c1;
    public final c40 f42227c2;
    public boolean f42228c3;
    public final AccountInstance d;
    public final int f42229d0;
    public final p50 f42230d1;
    public float f42231d2;
    public int f42232d3;
    public final x20 e;
    public final RadialProgressView f42233e0;
    public final c30 f42234e1;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f42235e2;
    public AnimatorSet f42236e3;
    public final org.telegram.ui.Components.voip.t2 f42237f;
    public final Drawable f42238f0;
    public final e30 f42239f1;
    public boolean f42240f2;
    public t40 f42241f3;
    public final View f42242g0;
    public final Paint f42243g1;
    public boolean f42244g2;
    public int f42245g3;
    public final org.telegram.ui.Components.voip.t2 h;
    public AnimatorSet f42246h0;
    public ValueAnimator f42247h1;
    public org.telegram.ui.Components.c50 f42248h2;
    public int f42249h3;
    public LaunchActivity f42250i0;
    public float f42251i1;
    public b50 f42252i2;
    public int f42253i3;
    public final UndoView[] f42254j0;
    public final LinearLayout f42255j1;
    public Boolean f42256j2;
    public int f42257j3;
    public final org.telegram.ui.Cells.k f42258k0;
    public final org.telegram.ui.ActionBar.u0 f42259k1;
    public int f42260k2;
    public int f42261k3;
    public boolean f42262l0;
    public final org.telegram.ui.ActionBar.u0 l1;
    public boolean f42263l2;
    public int f42264l3;
    public org.telegram.ui.Components.p40 m0;
    public final org.telegram.ui.ActionBar.u0 f42265m1;
    public final g30 f42266m2;
    public int f42267m3;
    public final org.telegram.ui.Components.voip.t2 f42268n;
    public org.telegram.ui.Components.p40 f42269n0;
    public final org.telegram.ui.ActionBar.e1 f42270n1;
    public final org.telegram.ui.Components.lm0 f42271n2;
    public int f42272n3;
    public int f42273o0;
    public final org.telegram.ui.ActionBar.e1 f42274o1;
    public final a60 f42275o2;
    public int f42276o3;
    public f50 f42277p0;
    public final org.telegram.ui.ActionBar.e1 f42278p1;
    public final org.telegram.ui.Components.y20 f42279p2;
    public int f42280p3;
    public final ArrayList f42281q0;
    public final org.telegram.ui.ActionBar.e1 f42282q1;
    public ViewTreeObserver.OnPreDrawListener f42283q2;
    public int f42284q3;
    public final org.telegram.ui.Components.voip.t2 f42285r;
    public n40 f42286r0;
    public final org.telegram.ui.ActionBar.e1 f42287r1;
    public final org.telegram.ui.Components.voip.h f42288r2;
    public int f42289r3;
    public final org.telegram.ui.Components.voip.t2 f42290s;
    public boolean f42291s0;
    public final org.telegram.ui.ActionBar.e1 f42292s1;
    public boolean f42293s2;
    public int f42294s3;
    public long f42295t0;
    public final org.telegram.ui.ActionBar.e1 f42296t1;
    public final ArrayList f42297t2;
    public int f42298t3;
    public boolean f42299u0;
    public final org.telegram.ui.ActionBar.e1 f42300u1;
    public boolean f42301u2;
    public int f42302u3;
    public final org.telegram.ui.Components.voip.t2 v;
    public final RectF f42303v0;
    public final org.telegram.ui.ActionBar.e1 f42304v1;
    public final f20 f42305v2;
    public int f42306v3;
    public final org.telegram.ui.Components.voip.t2 f42307w;
    public boolean f42308w0;
    public final org.telegram.ui.ActionBar.e1 f42309w1;
    public final b30 f42310w2;
    public final u40 f42311w3;
    public final y20 f42312x;
    public boolean f42313x0;
    public final org.telegram.ui.ActionBar.e1 f42314x1;
    public final org.telegram.ui.Components.pc f42315x2;
    public Boolean f42316x3;
    public final ImageView f42317y;
    public float f42318y0;
    public final org.telegram.ui.ActionBar.e1 f42319y1;
    public final f20 f42320y2;
    public Integer y3;
    public e40 f42321z0;
    public final LinearLayout f42322z1;
    public boolean f42323z2;
    public final ne.b f42324z3;

    public u50(final LaunchActivity launchActivity, AccountInstance accountInstance, ChatObject.Call call, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        super((Context) launchActivity, (org.telegram.ui.ActionBar.g6) null, true, true);
        String string;
        int i10;
        u50 u50Var;
        TLRPC.Chat chat2;
        ConferenceCall conferenceCall;
        this.E = new Paint(1);
        this.f42254j0 = new UndoView[2];
        this.f42281q0 = new ArrayList();
        this.f42303v0 = new RectF();
        this.C0 = new Paint(1);
        this.D0 = new ArrayList();
        this.E0 = new ArrayList();
        this.F0 = new ArrayList();
        this.G0 = new ArrayList();
        this.H0 = new ArrayList();
        this.C1 = new qh.i(new f20(this, 8));
        this.F1 = 0;
        this.G1 = false;
        this.I1 = new Paint(7);
        this.J1 = new Paint(7);
        this.K1 = new t50[8];
        this.L1 = 1.0f;
        this.W1 = true;
        this.X1 = new int[4];
        this.Y1 = new ArrayList();
        this.Z1 = new ArrayList();
        this.f42288r2 = new org.telegram.ui.Components.voip.h();
        this.f42297t2 = new ArrayList();
        this.f42305v2 = new f20(this, 0);
        this.f42310w2 = new b30(this);
        this.f42315x2 = new org.telegram.ui.Components.pc(24);
        this.f42320y2 = new f20(this, 1);
        this.f42323z2 = false;
        this.A2 = new z5(this, 6);
        this.B2 = new LongSparseIntArray();
        this.M2 = new int[2];
        this.P2 = true;
        this.T2 = new String[2];
        this.f42232d3 = -1;
        this.f42311w3 = new u40(this);
        org.telegram.ui.Components.zr zrVar = org.telegram.ui.Components.zr.f33337f;
        this.f42324z3 = new ne.b(2, this, zrVar, 350L);
        this.A3 = new ne.b(3, this, zrVar, 220L, true);
        this.B3 = new ne.e(4, this, zrVar, 350L);
        this.C3 = new ne.b(5, this, zrVar, 350L);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        setOpenNoDelay(true);
        this.d = accountInstance;
        this.f42217a1 = call;
        this.Y0 = inputPeer;
        this.Z0 = chat;
        this.f42226c1 = str;
        this.currentAccount = accountInstance.getCurrentAccount();
        this.f42221b1 = z10;
        this.resourcesProvider = new ci.k0();
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        this.f42229d0 = MessagesController.getInstance(this.currentAccount).config.groupCallMessageLengthLimit.get();
        this.fullWidth = true;
        G3 = false;
        F3 = false;
        I3 = false;
        setDelegate(new w30(this));
        this.drawDoubleNavigationBar = true;
        this.drawNavigationBar = true;
        if (Build.VERSION.SDK_INT >= 30) {
            getWindow().setNavigationBarColor(-16777216);
        }
        this.scrollNavBar = true;
        this.navBarColorKey = -1;
        this.W2 = new h40(this);
        setOnDismissListener(new j20(this, 0));
        setDimBehindAlpha(75);
        o50 o50Var = new o50(this, launchActivity);
        this.P = o50Var;
        org.telegram.ui.Components.aq aqVar = new org.telegram.ui.Components.aq(true);
        int i11 = org.telegram.ui.ActionBar.k6.f21431qg;
        aqVar.b(org.telegram.ui.ActionBar.k6.v0(i11));
        aqVar.d();
        p40 p40Var = new p40(this, launchActivity, aqVar);
        this.O = p40Var;
        p40Var.setSubtitle("");
        p40Var.getSubtitleTextView().setVisibility(0);
        p40Var.k();
        p40Var.getAdditionalSubtitleTextView().setPadding(AndroidUtilities.dp(24.0f), 0, 0, 0);
        AndroidUtilities.updateViewVisibilityAnimated(p40Var.getAdditionalSubtitleTextView(), this.f42301u2, 1.0f, false);
        p40Var.getAdditionalSubtitleTextView().setTextColor(org.telegram.ui.ActionBar.k6.v0(i11));
        int i12 = org.telegram.ui.ActionBar.k6.f21338lg;
        org.telegram.ui.ActionBar.r6.m(p40Var, 6, i12, null);
        p40Var.setBackButtonImage(R.drawable.ic_ab_back);
        p40Var.setOccupyStatusBar(false);
        p40Var.setAllowOverlayTitle(false);
        int i13 = org.telegram.ui.ActionBar.k6.f21263hg;
        org.telegram.ui.ActionBar.r6.m(p40Var, 1, i13, null);
        org.telegram.ui.ActionBar.r6.m(p40Var, 3, org.telegram.ui.ActionBar.k6.f21591z8, null);
        org.telegram.ui.ActionBar.r6.e(p40Var, i13);
        org.telegram.ui.ActionBar.r6.m(p40Var, 6, i12, null);
        p40Var.setActionBarMenuOnItemClick(new w40(this, launchActivity));
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
        VoIPService.audioLevelsCallback = new c20(this, 3);
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
        this.f42238f0 = launchActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        org.telegram.ui.Components.xj0 xj0Var = new org.telegram.ui.Components.xj0(R.raw.voip_filled, AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f), true, null);
        this.J0 = xj0Var;
        this.K0 = new org.telegram.ui.Components.xj0(R.raw.hand_2, AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f), true, null);
        x40 x40Var = new x40(this, launchActivity);
        this.L = x40Var;
        this.containerView = x40Var;
        x40Var.setClipToPadding(false);
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
            org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(launchActivity);
            this.U = n5Var;
            n5Var.setGravity(17);
            n5Var.setTextColor(-1);
            n5Var.setTypeface(AndroidUtilities.bold());
            n5Var.setTextSize(18);
            n5Var.k(LocaleController.getString(R.string.VoipChatStartsIn));
            this.containerView.addView(n5Var, w7.z5.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 311.0f));
            y40 y40Var = new y40(this, launchActivity);
            this.V = y40Var;
            y40Var.setGravity(17);
            y40Var.setTextColor(-1);
            y40Var.setTypeface(AndroidUtilities.bold());
            y40Var.setTextSize(60);
            this.containerView.addView(y40Var, w7.z5.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 231.0f));
            org.telegram.ui.ActionBar.n5 n5Var2 = new org.telegram.ui.ActionBar.n5(launchActivity);
            this.W = n5Var2;
            n5Var2.setGravity(17);
            n5Var2.setTextColor(-1);
            n5Var2.setTypeface(AndroidUtilities.bold());
            n5Var2.setTextSize(18);
            this.containerView.addView(n5Var2, w7.z5.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 201.0f));
        }
        if (r1()) {
            j50 j50Var = new j50(this, launchActivity);
            this.U0 = j50Var;
            this.containerView.addView(j50Var, w7.z5.d(-1, 80.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
        }
        z40 z40Var = new z40(this, launchActivity);
        this.Q = z40Var;
        z40Var.setClipToPadding(false);
        z40Var.setClipChildren(false);
        i50 i50Var = new i50(this);
        this.X = i50Var;
        i50Var.f46405o = zrVar;
        i50Var.d = 350L;
        i50Var.f46421c = 350L;
        i50Var.e = 350L;
        i50Var.S();
        z40Var.setItemAnimator(i50Var);
        z40Var.setOnScrollListener(new q20(this));
        z40Var.setVerticalScrollBarEnabled(false);
        getContext();
        org.telegram.ui.Components.vz vzVar = new org.telegram.ui.Components.vz(F3 ? 6 : 2, z40Var);
        this.Y = vzVar;
        z40Var.setLayoutManager(vzVar);
        r20 r20Var = new r20(this);
        this.f42224c = r20Var;
        vzVar.z1(r20Var);
        z40Var.i(new s20(this));
        vzVar.C1();
        this.containerView.addView(z40Var, w7.z5.d(-1, -1.0f, 51, 14.0f, 14.0f, 14.0f, 231.0f));
        z40Var.setAdapter(o50Var);
        z40Var.setTopBottomSelectorRadius(13);
        org.telegram.ui.ActionBar.r6.K(org.telegram.ui.ActionBar.k6.f21210eg, z40Var);
        z40Var.setOnItemClickListener(new e7(this, launchActivity, call, 14));
        z40Var.setOnItemLongClickListener(new c20(this, 4));
        if (r1()) {
            s50 s50Var = new s50(this, getContext());
            this.B1 = s50Var;
            this.containerView.addView(s50Var, w7.z5.d(-1, 0.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        org.telegram.ui.Components.lm0 lm0Var = new org.telegram.ui.Components.lm0(launchActivity);
        this.f42271n2 = lm0Var;
        this.containerView.addView(lm0Var, w7.z5.d(-1, -1.0f, 51, 14.0f, 14.0f, 324.0f, 14.0f));
        a60 a60Var = new a60(call, this.currentAccount, this);
        this.f42275o2 = a60Var;
        lm0Var.setAdapter(a60Var);
        s4.s sVar = new s4.s(6, false);
        lm0Var.setLayoutManager(sVar);
        sVar.z1(new u20(this));
        lm0Var.setOnItemClickListener(new org.telegram.ui.Components.zl0(this) {
            public final u50 f36789b;

            {
                this.f36789b = this;
            }

            @Override
            public final void d(int i15, View view) {
                switch (r2) {
                    case 0:
                        u50 u50Var2 = this.f36789b;
                        u50Var2.getClass();
                        org.telegram.ui.Components.x20 x20Var = (org.telegram.ui.Components.x20) view;
                        if (x20Var.getVideoParticipant() == null) {
                            u50Var2.e1(new ChatObject.VideoParticipant(x20Var.getParticipant(), false, false));
                            return;
                        } else {
                            u50Var2.e1(x20Var.getVideoParticipant());
                            return;
                        }
                    default:
                        u50 u50Var3 = this.f36789b;
                        u50Var3.getClass();
                        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) view;
                        if (lVar.getParticipant() != null) {
                            u50Var3.e1(lVar.getParticipant());
                            return;
                        }
                        return;
                }
            }
        });
        s4.k kVar = new s4.k();
        kVar.S();
        kVar.f46405o = zrVar;
        kVar.d = 350L;
        kVar.f46421c = 350L;
        kVar.e = 350L;
        lm0Var.setItemAnimator(new v20(this));
        lm0Var.setOnScrollListener(new w20(this));
        a60Var.H(lm0Var, false, false);
        lm0Var.setVisibility(8);
        x20 x20Var = new x20(this, launchActivity);
        this.e = x20Var;
        int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Jg);
        int red = Color.red(v02);
        int green = Color.green(v02);
        int blue = Color.blue(v02);
        this.S0 = new Matrix();
        this.R0 = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(72.72727f), new int[]{Color.argb(50, red, green, blue), Color.argb(0, red, green, blue)}, (float[]) null, Shader.TileMode.CLAMP);
        Paint paint = new Paint(1);
        this.T0 = paint;
        paint.setShader(this.R0);
        org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(9);
        this.M0 = z9Var;
        org.telegram.ui.Components.z9 z9Var2 = new org.telegram.ui.Components.z9(12);
        this.N0 = z9Var2;
        z9Var.f33181a = AndroidUtilities.dp(62.0f) * 0.45454547f;
        z9Var.f33182b = AndroidUtilities.dp(72.0f) * 0.45454547f;
        z9Var.b();
        z9Var2.f33181a = AndroidUtilities.dp(65.0f) * 0.45454547f;
        z9Var2.f33182b = AndroidUtilities.dp(75.0f) * 0.45454547f;
        z9Var2.b();
        int i15 = org.telegram.ui.ActionBar.k6.Ig;
        z9Var.d.setColor(i0.a.o(org.telegram.ui.ActionBar.k6.v0(i15), 38));
        z9Var2.d.setColor(i0.a.o(org.telegram.ui.ActionBar.k6.v0(i15), 76));
        org.telegram.ui.Components.voip.t2 t2Var = new org.telegram.ui.Components.voip.t2(launchActivity, 50.0f);
        this.f42285r = t2Var;
        t2Var.setCheckable(true);
        t2Var.setTextSize(12);
        x20Var.a(t2Var);
        t2Var.setOnClickListener(new d20(this, 7));
        org.telegram.ui.Components.voip.t2 t2Var2 = new org.telegram.ui.Components.voip.t2(launchActivity, 50.0f);
        this.f42268n = t2Var2;
        t2Var2.setCheckable(true);
        t2Var2.setTextSize(12);
        t2Var2.d(false, false);
        t2Var2.setCrossOffset(-AndroidUtilities.dpf2(3.5f));
        t2Var2.c(R.drawable.calls_video, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipCamera), false, false);
        org.telegram.ui.Components.voip.t2 t2Var3 = new org.telegram.ui.Components.voip.t2(launchActivity, 50.0f);
        this.f42237f = t2Var3;
        t2Var3.setCheckable(true);
        t2Var3.setTextSize(12);
        t2Var3.d(false, false);
        org.telegram.ui.Components.ak0 ak0Var = new org.telegram.ui.Components.ak0(launchActivity);
        t2Var3.addView(ak0Var, w7.z5.d(32, 32.0f, 1, 0.0f, 10.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.xj0 xj0Var2 = new org.telegram.ui.Components.xj0(R.raw.camera_flip, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        this.G2 = xj0Var2;
        ak0Var.setAnimation(xj0Var2);
        t2Var3.setOnClickListener(new d20(this, 10));
        x20Var.a(t2Var3);
        org.telegram.ui.Components.voip.t2 t2Var4 = new org.telegram.ui.Components.voip.t2(launchActivity, 50.0f);
        this.h = t2Var4;
        t2Var4.setCheckable(true);
        t2Var4.setTextSize(12);
        t2Var4.d(false, false);
        ImageView imageView = new ImageView(launchActivity);
        this.f42220b0 = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        int i16 = R.drawable.filled_sound_on;
        this.f42216a0 = i16;
        imageView.setImageResource(i16);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setScaleX(1.11f);
        imageView.setScaleY(1.11f);
        t2Var4.addView(imageView, w7.z5.d(30, 30.0f, 1, 0.0f, 11.0f, 0.0f, 0.0f));
        t2Var4.setOnClickListener(new d20(this, 11));
        x20Var.a(t2Var4);
        x20Var.a(t2Var2);
        org.telegram.ui.Components.voip.t2 t2Var5 = new org.telegram.ui.Components.voip.t2(launchActivity, 50.0f);
        this.f42290s = t2Var5;
        t2Var5.setTextSize(12);
        t2Var5.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Dg), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
        t2Var5.setOnClickListener(new View.OnClickListener(this) {
            public final u50 f38128b;

            {
                this.f38128b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        u50.p(this.f38128b, launchActivity);
                        return;
                    default:
                        u50 u50Var2 = this.f38128b;
                        u50Var2.a2.e();
                        ChatObject.Call call2 = u50Var2.f42217a1;
                        if (call2 != null && !call2.isScheduled()) {
                            u50Var2.J1();
                            u50.t1(launchActivity, new f20(u50Var2, 5), false, false);
                            return;
                        }
                        u50Var2.dismiss();
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
        y20 y20Var = new y20(this, launchActivity);
        this.f42312x = y20Var;
        y20Var.setAnimation(xj0Var);
        y20Var.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.Components.voip.t2 t2Var7 = new org.telegram.ui.Components.voip.t2(launchActivity, 50.0f);
        this.f42307w = t2Var7;
        t2Var7.setDrawBackground(false);
        t2Var7.setTextSize(12);
        t2Var7.c(0, 0, 0, 1.0f, true, "Text", false, false);
        t2Var7.addView(y20Var, w7.z5.e(50, 50, 49));
        x20Var.a(t2Var7);
        t2Var7.setOnClickListener(new a30(this));
        x20Var.a(t2Var6);
        x20Var.a(t2Var5);
        ImageView imageView2 = new ImageView(launchActivity);
        this.f42317y = imageView2;
        imageView2.setVisibility(8);
        imageView2.setImageResource(R.drawable.voice_expand);
        t2Var7.addView(imageView2, w7.z5.d(24, 24.0f, 49, 0.0f, 13.0f, 0.0f, 0.0f));
        if (this.f42217a1 != null && r1() && !this.f42217a1.isScheduled()) {
            imageView2.setVisibility(0);
            y20Var.setVisibility(8);
        }
        RadialProgressView radialProgressView = new RadialProgressView(launchActivity);
        this.f42233e0 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(50.0f));
        radialProgressView.setStrokeWidth(2.0f);
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Og));
        p40Var.setAlpha(0.0f);
        p40Var.getBackButton().setScaleX(0.9f);
        p40Var.getBackButton().setScaleY(0.9f);
        p40Var.getBackButton().setTranslationX(-AndroidUtilities.dp(14.0f));
        p40Var.getTitleTextView().setTranslationY(AndroidUtilities.dp(23.0f));
        p40Var.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        p40Var.getAdditionalSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(launchActivity, (org.telegram.ui.ActionBar.y) null, 0, org.telegram.ui.ActionBar.k6.v0(i13));
        this.f42259k1 = u0Var;
        u0Var.setLongClickEnabled(false);
        u0Var.setIcon(R.drawable.ic_ab_other);
        u0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        u0Var.setSubMenuOpenSide(2);
        u0Var.setDelegate(new c20(this, 0));
        int i17 = org.telegram.ui.ActionBar.k6.f21281ig;
        org.telegram.ui.ActionBar.r6.T(u0Var, org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.v0(i17), 6), null, org.telegram.ui.ActionBar.r6.O(i17));
        u0Var.setOnClickListener(new d20(this, 0));
        u0Var.G(org.telegram.ui.ActionBar.k6.v0(i13), false);
        u0Var.G(org.telegram.ui.ActionBar.k6.v0(i13), true);
        org.telegram.ui.ActionBar.u0 u0Var2 = new org.telegram.ui.ActionBar.u0(launchActivity, (org.telegram.ui.ActionBar.y) null, 0, org.telegram.ui.ActionBar.k6.v0(i13));
        this.l1 = u0Var2;
        u0Var2.setLongClickEnabled(false);
        u0Var2.setIcon(R.drawable.msg_voice_pip);
        u0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        org.telegram.ui.ActionBar.r6.T(u0Var2, org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.v0(i17), 6), null, org.telegram.ui.ActionBar.r6.O(i17));
        u0Var2.setOnClickListener(new d20(this, 1));
        org.telegram.ui.ActionBar.u0 u0Var3 = new org.telegram.ui.ActionBar.u0(launchActivity, (org.telegram.ui.ActionBar.y) null, 0, org.telegram.ui.ActionBar.k6.v0(i13));
        this.f42265m1 = u0Var3;
        u0Var3.setLongClickEnabled(false);
        u0Var3.setIcon(R.drawable.msg_screencast);
        u0Var3.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        org.telegram.ui.ActionBar.r6.T(u0Var3, org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.v0(i17), 6), null, org.telegram.ui.ActionBar.r6.O(i17));
        u0Var3.setOnClickListener(new d20(this, 2));
        c30 c30Var = new c30(this, launchActivity, launchActivity);
        this.f42234e1 = c30Var;
        d30 d30Var = new d30(launchActivity);
        this.N = d30Var;
        d30Var.setAlpha(0.0f);
        Paint paint2 = new Paint(1);
        this.f42243g1 = paint2;
        paint2.setColor(-12761513);
        e30 e30Var = new e30(this, getContext());
        this.f42239f1 = e30Var;
        org.telegram.ui.ActionBar.r6.W(e30Var, i13, this.resourcesProvider);
        e30Var.setTextSize(1, 11.0f);
        e30Var.setText(LocaleController.getString(R.string.VoipChannelLabelLive));
        e30Var.setMaxLines(1);
        e30Var.setGravity(17);
        e30Var.setTypeface(AndroidUtilities.bold());
        e30Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f));
        e30Var.setTag(-1);
        if (!r1()) {
            e30Var.setVisibility(8);
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f42255j1 = linearLayout;
        linearLayout.setOrientation(0);
        TLRPC.InputPeer inputPeer2 = groupCallPeer;
        linearLayout.addView(c30Var, w7.z5.l(1.0f, 0, -2));
        linearLayout.addView(e30Var, w7.z5.k(6.0f, 4.0f, 0.0f, 0.0f, -2, 18));
        this.containerView.addView(d30Var, w7.z5.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.containerView.addView(linearLayout, w7.z5.d(-2, -2.0f, 51, 23.0f, 0.0f, 48.0f, 0.0f));
        this.containerView.addView(p40Var, w7.z5.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(launchActivity);
        this.f42322z1 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.addView(u0Var3, w7.z5.n(48, 48));
        linearLayout2.addView(u0Var2, w7.z5.n(48, 48));
        linearLayout2.addView(u0Var, w7.z5.n(48, 48));
        this.containerView.addView(linearLayout2, w7.z5.e(-2, 48, 53));
        View view = new View(launchActivity);
        this.f42242g0 = view;
        view.setAlpha(0.0f);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.V5, view, null);
        this.containerView.addView(view, w7.z5.c(1.0f, -1));
        for (int i18 = 0; i18 < 2; i18++) {
            this.f42254j0[i18] = new f30(this, launchActivity);
            this.f42254j0[i18].setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            this.f42254j0[i18].setTranslationZ(AndroidUtilities.dp(5.0f));
            this.containerView.addView(this.f42254j0[i18], w7.z5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        org.telegram.ui.Cells.k kVar2 = new org.telegram.ui.Cells.k(launchActivity, true);
        this.f42258k0 = kVar2;
        kVar2.setTag(R.id.fit_width_tag, 240);
        this.f42259k1.h(kVar2, AndroidUtilities.dp(48.0f));
        this.f42259k1.setShowSubmenuByMove(false);
        int i19 = org.telegram.ui.ActionBar.k6.f21210eg;
        org.telegram.ui.ActionBar.r6.T(kVar2, org.telegram.ui.ActionBar.k6.Z(org.telegram.ui.ActionBar.k6.v0(i19), 6, 6), null, org.telegram.ui.ActionBar.r6.O(i19));
        org.telegram.ui.ActionBar.u0 u0Var4 = this.f42259k1;
        org.telegram.ui.ActionBar.e1 d = u0Var4.d(1, 0, null, LocaleController.getString(R.string.VoipGroupAllCanSpeak), true, true, u0Var4.m0);
        this.f42300u1 = d;
        d.m(true, false);
        org.telegram.ui.ActionBar.u0 u0Var5 = this.f42259k1;
        org.telegram.ui.ActionBar.e1 d10 = u0Var5.d(2, 0, null, LocaleController.getString(R.string.VoipGroupOnlyAdminsCanSpeak), true, true, u0Var5.m0);
        this.f42304v1 = d10;
        d10.m(false, true);
        int i20 = org.telegram.ui.ActionBar.k6.f21545wg;
        d.setCheckColor(i20);
        d.d(org.telegram.ui.ActionBar.k6.v0(i20), org.telegram.ui.ActionBar.k6.v0(i20));
        d10.setCheckColor(i20);
        d10.d(org.telegram.ui.ActionBar.k6.v0(i20), org.telegram.ui.ActionBar.k6.v0(i20));
        Paint paint3 = new Paint(1);
        int i21 = org.telegram.ui.ActionBar.k6.f21263hg;
        paint3.setColor(org.telegram.ui.ActionBar.k6.v0(i21));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(AndroidUtilities.dp(1.5f));
        paint3.setStrokeCap(Paint.Cap.ROUND);
        org.telegram.ui.ActionBar.u0 u0Var6 = this.f42259k1;
        org.telegram.ui.ActionBar.e1 d11 = u0Var6.d(10, R.drawable.msg_voice_speaker, null, LocaleController.getString(R.string.VoipGroupAudio), true, false, u0Var6.m0);
        this.f42278p1 = d11;
        d11.setItemHeight(56);
        org.telegram.ui.ActionBar.u0 u0Var7 = this.f42259k1;
        org.telegram.ui.ActionBar.e1 d12 = u0Var7.d(11, R.drawable.msg_noise_on, null, LocaleController.getString(R.string.VoipNoiseCancellation), true, false, u0Var7.m0);
        this.f42282q1 = d12;
        d12.setItemHeight(56);
        TextView b10 = this.f42259k1.b(i0.a.f(0.3f, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21247gg), -16777216));
        this.A1 = b10;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).topMargin = 0;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).bottomMargin = 0;
        org.telegram.ui.ActionBar.u0 u0Var8 = this.f42259k1;
        org.telegram.ui.ActionBar.e1 d13 = u0Var8.d(6, R.drawable.msg_edit, this.f42230d1, LocaleController.getString(ChatObject.isChannelOrGiga(this.Z0) ? R.string.VoipChannelEditTitle : R.string.VoipGroupEditTitle), true, false, u0Var8.m0);
        this.f42274o1 = d13;
        org.telegram.ui.ActionBar.u0 u0Var9 = this.f42259k1;
        org.telegram.ui.ActionBar.e1 d14 = u0Var9.d(7, R.drawable.msg_permissions, this.f42230d1, LocaleController.getString(R.string.VoipGroupEditPermissions), false, false, u0Var9.m0);
        this.f42287r1 = d14;
        org.telegram.ui.ActionBar.e1 e = this.f42259k1.e(3, R.drawable.msg_link, LocaleController.getString(R.string.VoipGroupShareInviteLink));
        this.f42270n1 = e;
        p50 p50Var = new p50();
        this.f42230d1 = p50Var;
        org.telegram.ui.ActionBar.e1 e7 = this.f42259k1.e(9, R.drawable.msg_screencast, LocaleController.getString(R.string.VoipChatStartScreenCapture));
        this.f42296t1 = e7;
        org.telegram.ui.ActionBar.u0 u0Var10 = this.f42259k1;
        org.telegram.ui.ActionBar.e1 d15 = u0Var10.d(5, 0, p50Var, LocaleController.getString(R.string.VoipGroupRecordCall), true, false, u0Var10.m0);
        this.f42292s1 = d15;
        p50Var.a(d15.getImageView());
        org.telegram.ui.ActionBar.e1 e10 = this.f42259k1.e(12, R.drawable.menu_stream_comments_24, LocaleController.getString(R.string.VoipChannelEnableComments));
        this.f42314x1 = e10;
        org.telegram.ui.ActionBar.e1 e11 = this.f42259k1.e(13, R.drawable._menu_stream_comments_off_24, LocaleController.getString(R.string.VoipChannelDisableComments));
        this.f42319y1 = e11;
        org.telegram.ui.ActionBar.u0 u0Var11 = this.f42259k1;
        int i22 = R.drawable.msg_cancel;
        if (o1()) {
            i10 = i21;
            string = LocaleController.getString(R.string.VoipGroupEndConference);
        } else {
            string = LocaleController.getString(ChatObject.isChannelOrGiga(this.Z0) ? R.string.VoipChannelEndChat : R.string.VoipGroupEndChat);
            i10 = i21;
        }
        org.telegram.ui.ActionBar.e1 e12 = u0Var11.e(4, i22, string);
        this.f42309w1 = e12;
        this.f42259k1.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.k6.v0(i19));
        this.f42259k1.getPopupLayout().setFitItems(true);
        e10.d(org.telegram.ui.ActionBar.k6.v0(i10), org.telegram.ui.ActionBar.k6.v0(i10));
        e11.d(org.telegram.ui.ActionBar.k6.v0(i10), org.telegram.ui.ActionBar.k6.v0(i10));
        d11.d(org.telegram.ui.ActionBar.k6.v0(i10), org.telegram.ui.ActionBar.k6.v0(i10));
        d12.d(org.telegram.ui.ActionBar.k6.v0(i10), org.telegram.ui.ActionBar.k6.v0(i10));
        int i23 = org.telegram.ui.ActionBar.k6.f21527vg;
        e12.d(org.telegram.ui.ActionBar.k6.v0(i23), org.telegram.ui.ActionBar.k6.v0(i23));
        e.d(org.telegram.ui.ActionBar.k6.v0(i10), org.telegram.ui.ActionBar.k6.v0(i10));
        d13.d(org.telegram.ui.ActionBar.k6.v0(i10), org.telegram.ui.ActionBar.k6.v0(i10));
        d14.d(org.telegram.ui.ActionBar.k6.v0(i10), org.telegram.ui.ActionBar.k6.v0(i10));
        d15.d(org.telegram.ui.ActionBar.k6.v0(i10), org.telegram.ui.ActionBar.k6.v0(i10));
        e7.d(org.telegram.ui.ActionBar.k6.v0(i10), org.telegram.ui.ActionBar.k6.v0(i10));
        if (this.f42217a1 != null) {
            l1();
        }
        if (o1()) {
            this.f42277p0 = new f50();
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            this.f42277p0.b((sharedInstance == null || (conferenceCall = sharedInstance.conference) == null) ? null : conferenceCall.getEmojis());
        }
        Q1(false);
        this.O.getTitleTextView().setOnClickListener(new d20(this, 3));
        g30 g30Var = new g30(this, launchActivity);
        this.f42266m2 = g30Var;
        h30 h30Var = new h30(this);
        this.N2 = h30Var;
        g30Var.setClipToPadding(false);
        h30Var.S();
        h30Var.f46405o = org.telegram.ui.Components.zr.f33337f;
        h30Var.d = 350L;
        h30Var.f46421c = 350L;
        h30Var.e = 350L;
        g30Var.setItemAnimator(h30Var);
        g30Var.setOnScrollListener(new i30(this));
        g30Var.setClipChildren(false);
        s4.b0 b0Var = new s4.b0();
        b0Var.j1(0);
        g30Var.setLayoutManager(b0Var);
        org.telegram.ui.Components.y20 y20Var2 = new org.telegram.ui.Components.y20(call, this.currentAccount, this);
        this.f42279p2 = y20Var2;
        g30Var.setAdapter(y20Var2);
        y20Var2.F(g30Var, false);
        g30Var.setOnItemClickListener(new org.telegram.ui.Components.zl0(this) {
            public final u50 f36789b;

            {
                this.f36789b = this;
            }

            @Override
            public final void d(int i152, View view2) {
                switch (r2) {
                    case 0:
                        u50 u50Var2 = this.f36789b;
                        u50Var2.getClass();
                        org.telegram.ui.Components.x20 x20Var2 = (org.telegram.ui.Components.x20) view2;
                        if (x20Var2.getVideoParticipant() == null) {
                            u50Var2.e1(new ChatObject.VideoParticipant(x20Var2.getParticipant(), false, false));
                            return;
                        } else {
                            u50Var2.e1(x20Var2.getVideoParticipant());
                            return;
                        }
                    default:
                        u50 u50Var3 = this.f36789b;
                        u50Var3.getClass();
                        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) view2;
                        if (lVar.getParticipant() != null) {
                            u50Var3.e1(lVar.getParticipant());
                            return;
                        }
                        return;
                }
            }
        });
        g30Var.setOnItemLongClickListener(new c20(this, 1));
        g30Var.setVisibility(8);
        g30Var.i(new j30());
        k30 k30Var = new k30(this, launchActivity, this.Q, g30Var, this.Y1, this.f42217a1, this);
        this.a2 = k30Var;
        k30Var.setClipChildren(false);
        y20Var2.E(this.Y1, k30Var);
        if (this.f42271n2 != null) {
            this.f42275o2.G(this.Y1, k30Var);
        }
        l30 l30Var = new l30(this, launchActivity);
        this.D2 = l30Var;
        m30 m30Var = new m30(this, launchActivity, this.O, this.Q, l30Var);
        this.f42219b = m30Var;
        m30Var.setImagesLayerNum(Integer.MAX_VALUE);
        m30Var.setInvalidateWithParent(true);
        l30Var.setProfileGalleryView(m30Var);
        n30 n30Var = new n30(this, launchActivity);
        this.C2 = n30Var;
        n30Var.setVisibility(8);
        m30Var.setVisibility(0);
        m30Var.b(new o30(this));
        p30 p30Var = new p30(this, launchActivity);
        this.f42222b2 = p30Var;
        this.containerView.addView(k30Var);
        k30Var.addView(g30Var, w7.z5.d(-1, 80.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
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
        this.f42225c0 = hVar;
        hVar.setDelegate(new q30(this));
        hVar.setClickCellDelegate(new r30(this));
        if (this.f42217a1 != null) {
            hVar.C0(this.d.getCurrentAccount(), this.f42217a1.getInputGroupCall(false));
        }
        this.containerView.addView(hVar, w7.z5.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(launchActivity, false, true, true);
        this.M = o6Var;
        o6Var.setGravity(17);
        o6Var.setTextSize(AndroidUtilities.dp(15.0f));
        o6Var.setTextColor(-1);
        o6Var.b(0.4f, 320L, org.telegram.ui.Components.zr.h);
        o6Var.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(this.e);
        s30 s30Var = new s30(this, launchActivity, this.L, LaunchActivity.R(), this.resourcesProvider);
        this.H = s30Var;
        s30Var.J = true;
        s30Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.f42229d0)});
        s30Var.getEditText().setLinkTextColor(-11683585);
        s30Var.setHint(LocaleController.getString(R.string.TypeMessage));
        s30Var.getEditText().addTextChangedListener(new t30(this));
        s30Var.s();
        u30 u30Var = new u30(this, launchActivity);
        this.G = u30Var;
        this.containerView.addView(u30Var, w7.z5.c(-1.0f, -1));
        v30 v30Var = new v30(launchActivity);
        this.F = v30Var;
        v30Var.addView(s30Var, w7.z5.d(-1, -2.0f, 80, 0.0f, 0.0f, 48.0f, 0.0f));
        v30Var.addView(o6Var, w7.z5.d(52, 16.0f, 85, 0.0f, 0.0f, 0.0f, 32.0f));
        o6Var.setTranslationY(-AndroidUtilities.dp(20.0f));
        this.containerView.addView(v30Var, w7.z5.e(-1, -2, 80));
        ImageView imageView3 = new ImageView(launchActivity);
        this.J = imageView3;
        int i24 = org.telegram.ui.ActionBar.k6.f21273i6;
        org.telegram.ui.ActionBar.r6.S(imageView3, org.telegram.ui.ActionBar.k6.g0(getThemedColor(i24), 1, -1), null, org.telegram.ui.ActionBar.r6.O(i24), this.resourcesProvider);
        int i25 = org.telegram.ui.ActionBar.k6.f7;
        org.telegram.ui.ActionBar.g6 g6Var = this.resourcesProvider;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.t(imageView3, i25, g6Var, mode);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.arrow_more);
        imageView3.setOnClickListener(new d20(this, 4));
        ImageView imageView4 = new ImageView(launchActivity);
        this.I = imageView4;
        org.telegram.ui.ActionBar.r6.S(imageView4, org.telegram.ui.ActionBar.k6.g0(getThemedColor(i24), 1, -1), null, org.telegram.ui.ActionBar.r6.O(i24), this.resourcesProvider);
        org.telegram.ui.ActionBar.r6.t(imageView4, org.telegram.ui.ActionBar.k6.f21517v6, this.resourcesProvider, mode);
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_send);
        imageView4.setOnClickListener(new d20(this, 5));
        v30Var.addView(imageView3, w7.z5.e(48, 48, 85));
        v30Var.addView(imageView4, w7.z5.e(48, 48, 85));
        this.containerView.addView(p30Var);
        n30Var.addView(m30Var, w7.z5.c(-1.0f, -1));
        n30Var.addView(l30Var, w7.z5.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.containerView.addView(n30Var, w7.z5.d(-1, -1.0f, 0, 14.0f, 14.0f, 14.0f, 14.0f));
        O0(false);
        this.P.l();
        if (G3) {
            this.f42275o2.I(this.f42271n2, false);
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
            this.containerView.addView(textView, w7.z5.d(-2, -2.0f, 81, 21.0f, 0.0f, 21.0f, 100.0f));
            org.telegram.ui.Components.od0 od0Var = new org.telegram.ui.Components.od0(launchActivity);
            od0Var.setTextColor(-1);
            od0Var.setSelectorColor(-9598483);
            od0Var.setTextOffset(AndroidUtilities.dp(10.0f));
            od0Var.setItemCount(5);
            x30 x30Var = new x30(launchActivity);
            x30Var.setItemCount(5);
            x30Var.setTextColor(-1);
            x30Var.setSelectorColor(-9598483);
            x30Var.setTextOffset(-AndroidUtilities.dp(10.0f));
            y30 y30Var = new y30(launchActivity);
            y30Var.setItemCount(5);
            y30Var.setTextColor(-1);
            y30Var.setSelectorColor(-9598483);
            y30Var.setTextOffset(-AndroidUtilities.dp(34.0f));
            z30 z30Var = new z30(launchActivity);
            this.T = z30Var;
            z30Var.setLines(1);
            z30Var.setSingleLine(true);
            z30Var.setEllipsize(TextUtils.TruncateAt.END);
            z30Var.setGravity(17);
            z30Var.setTextColor(-1);
            z30Var.setTypeface(AndroidUtilities.bold());
            z30Var.setTextSize(1, 14.0f);
            this.containerView.addView(z30Var, w7.z5.d(-1, 48.0f, 81, 21.0f, 0.0f, 21.0f, 20.5f));
            z30Var.setOnClickListener(new org.telegram.messenger.video.f(this, od0Var, x30Var, y30Var, chat, accountInstance, inputPeer2, 1));
            b40 b40Var = new b40(launchActivity, od0Var, x30Var, y30Var);
            this.R = b40Var;
            b40Var.setWeightSum(1.0f);
            b40Var.setOrientation(0);
            this.containerView.addView(b40Var, w7.z5.d(-1, 270.0f, 51, 0.0f, 50.0f, 0.0f, 0.0f));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i26 = calendar.get(1);
            int i27 = calendar.get(6);
            b40Var.addView(od0Var, w7.z5.l(0.5f, 0, 270));
            od0Var.setMinValue(0);
            od0Var.setMaxValue(365);
            od0Var.setWrapSelectorWheel(false);
            od0Var.setFormatter(new h20(currentTimeMillis, calendar, i26, 0));
            a1.d dVar = new a1.d(this, od0Var, x30Var, y30Var, 13);
            u50Var = this;
            od0Var.setOnValueChangedListener(dVar);
            x30Var.setMinValue(0);
            x30Var.setMaxValue(23);
            b40Var.addView(x30Var, w7.z5.l(0.2f, 0, 270));
            x30Var.setFormatter(new wv(2));
            x30Var.setOnValueChangedListener(dVar);
            y30Var.setMinValue(0);
            y30Var.setMaxValue(59);
            y30Var.setValue(0);
            y30Var.setFormatter(new wv(3));
            b40Var.addView(y30Var, w7.z5.l(0.3f, 0, 270));
            y30Var.setOnValueChangedListener(dVar);
            calendar.setTimeInMillis(currentTimeMillis + 10800000);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            int i28 = calendar.get(6);
            int i29 = calendar.get(12);
            int i30 = calendar.get(11);
            od0Var.setValue(i27 != i28 ? 1 : 0);
            y30Var.setValue(i29);
            x30Var.setValue(i30);
            org.telegram.ui.Components.d5.g(z30Var, textView, 0L, 604800L, 2, od0Var, x30Var, y30Var);
        } else {
            u50Var = this;
        }
        c40 c40Var = new c40(u50Var, (ViewGroup) u50Var.getWindow().getDecorView(), u50Var.containerView);
        u50Var.f42227c2 = c40Var;
        c40Var.E = new d40(u50Var);
        m30Var.setPinchToZoomHelper(c40Var);
        u50Var.f42268n.setOnClickListener(new View.OnClickListener(u50Var) {
            public final u50 f38128b;

            {
                this.f38128b = u50Var;
            }

            @Override
            public final void onClick(View view4) {
                switch (r3) {
                    case 0:
                        u50.p(this.f38128b, launchActivity);
                        return;
                    default:
                        u50 u50Var2 = this.f38128b;
                        u50Var2.a2.e();
                        ChatObject.Call call2 = u50Var2.f42217a1;
                        if (call2 != null && !call2.isScheduled()) {
                            u50Var2.J1();
                            u50.t1(launchActivity, new f20(u50Var2, 5), false, false);
                            return;
                        }
                        u50Var2.dismiss();
                        return;
                }
            }
        });
        u50Var.M1(false);
        u50Var.J1();
        u50Var.N1(false);
        u50Var.O1(false, false);
        u50Var.B1(0.0f);
        u50Var.P1();
        u50Var.containerView.addView(new FrameLayout(launchActivity), w7.z5.e(-1, 200, 87));
        u50Var.v.setOnClickListener(new d20(u50Var, 6));
        u50Var.T0();
        w7.b6.a(u50Var.f42268n);
        w7.b6.a(u50Var.f42285r);
        w7.b6.a(u50Var.f42237f);
        w7.b6.a(u50Var.h);
        w7.b6.a(u50Var.f42307w);
        w7.b6.a(u50Var.f42290s);
        w7.b6.a(u50Var.v);
        r0.i0.l(u50Var.containerView, new c20(u50Var, 2));
    }

    public static r0.k1 A(u50 u50Var, r0.k1 k1Var) {
        int keyboardHeight;
        r0.h1 h1Var = k1Var.f45250a;
        i0.b f7 = h1Var.f(647);
        i0.b f10 = h1Var.f(8);
        s30 s30Var = u50Var.H;
        if (!s30Var.N && !s30Var.e) {
            keyboardHeight = 0;
        } else {
            keyboardHeight = s30Var.getKeyboardHeight();
        }
        int max = Math.max(f10.d, keyboardHeight);
        ViewGroup.LayoutParams layoutParams = u50Var.f42222b2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = -f7.d;
        }
        if (s30Var.getEmojiView() != null) {
            s30Var.getEmojiView().setBottomInset(f7.d);
        }
        if (u50Var.S2) {
            ViewGroup viewGroup = u50Var.containerView;
            int i10 = u50Var.backgroundPaddingLeft;
            viewGroup.setPadding(i10, 0, i10, 0);
        } else {
            ViewGroup viewGroup2 = u50Var.containerView;
            int i11 = u50Var.backgroundPaddingLeft;
            viewGroup2.setPadding(f7.f12315a + i11, f7.f12316b, i11 + f7.f12317c, f7.d);
        }
        u50Var.containerView.requestLayout();
        if (max == 0 && !s30Var.N && !s30Var.e && !s30Var.O) {
            s30Var.j();
        }
        if (max > 0) {
            org.telegram.ui.Components.fl0 fl0Var = u50Var.K;
            if (fl0Var == null) {
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                fl0Var = null;
                if (R != null) {
                    org.telegram.ui.Components.fl0 fl0Var2 = new org.telegram.ui.Components.fl0(1, u50Var.currentAccount, u50Var.getContext(), R, u50Var.resourcesProvider);
                    u50Var.K = fl0Var2;
                    fl0Var2.setDelegate(new v40(u50Var));
                    u50Var.containerView.addView(u50Var.K, w7.z5.e(-2, 52, 81));
                    u50Var.K.p(null, null, false);
                    u50Var.G.bringToFront();
                    u50Var.F.bringToFront();
                    fl0Var = u50Var.K;
                }
            }
            u50Var.K = fl0Var;
        }
        s30Var.G(f10.d, false);
        u50Var.C1.j(k1Var);
        return r0.k1.f45249b;
    }

    public static String A0() {
        String[][] strArr = EmojiData.data;
        String[] strArr2 = strArr[(int) Math.floor(Math.random() * strArr.length)];
        return strArr2[(int) Math.floor(Math.random() * strArr2.length)];
    }

    public static void B(u50 u50Var, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, TL_phone.exportGroupCallInvite exportgroupcallinvite, TLRPC.TL_error tL_error) {
        TLRPC.GroupCall groupCall;
        c2Var.dismiss();
        boolean z10 = false;
        if (tLObject instanceof TL_phone.exportedGroupCallInvite) {
            Context context = u50Var.getContext();
            int i10 = u50Var.currentAccount;
            TLRPC.InputGroupCall inputGroupCall = exportgroupcallinvite.call;
            String str = ((TL_phone.exportedGroupCallInvite) tLObject).link;
            org.telegram.ui.ActionBar.g6 g6Var = u50Var.resourcesProvider;
            ChatObject.Call call = u50Var.f42217a1;
            if (call != null && (groupCall = call.call) != null && groupCall.creator) {
                z10 = true;
            }
            m9.n0(context, i10, inputGroupCall, str, g6Var, false, z10);
        } else if (tL_error != null) {
            new org.telegram.ui.Components.vc(u50Var.topBulletinContainer, new ci.k0()).f0(tL_error, false);
        }
    }

    public static void B0(u50 u50Var) {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("reminderhint", false)) {
            return;
        }
        globalMainSettings.edit().putBoolean("reminderhint", true).commit();
        if (u50Var.f42269n0 == null) {
            org.telegram.ui.Components.p40 p40Var = new org.telegram.ui.Components.p40(u50Var.getContext(), 8);
            u50Var.f42269n0 = p40Var;
            p40Var.setAlpha(0.0f);
            u50Var.f42269n0.setVisibility(4);
            u50Var.f42269n0.setShowingDuration(4000L);
            u50Var.containerView.addView(u50Var.f42269n0, w7.z5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            u50Var.f42269n0.setText(LocaleController.getString(R.string.VoipChatReminderHint));
            u50Var.f42269n0.d();
        }
        u50Var.f42269n0.setExtraTranslationY(-AndroidUtilities.statusBarHeight);
        u50Var.f42269n0.f(u50Var.f42307w, true);
    }

    public static void C(u50 u50Var, int[] iArr, float[] fArr) {
        ArrayList<TLRPC.GroupCallParticipant> arrayList;
        s4.b1 K;
        g30 g30Var = u50Var.f42266m2;
        k30 k30Var = u50Var.a2;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            TLRPC.GroupCallParticipant groupCallParticipant = u50Var.f42217a1.participantsBySources.get(iArr[i10]);
            if (groupCallParticipant != null) {
                if (!k30Var.f31670b) {
                    if (u50Var.f42291s0) {
                        arrayList = u50Var.D0;
                    } else {
                        arrayList = u50Var.f42217a1.visibleParticipants;
                    }
                    int indexOf = arrayList.indexOf(groupCallParticipant);
                    if (indexOf >= 0 && (K = u50Var.Q.K(indexOf + u50Var.P.d)) != null) {
                        View view = K.f46342a;
                        if (view instanceof org.telegram.ui.Cells.d4) {
                            ((org.telegram.ui.Cells.d4) view).setAmplitude(fArr[i10] * 15.0f);
                            if (view == u50Var.X2 && !u50Var.f42263l2) {
                                u50Var.containerView.invalidate();
                            }
                        }
                    }
                } else {
                    for (int i11 = 0; i11 < g30Var.getChildCount(); i11++) {
                        org.telegram.ui.Components.x20 x20Var = (org.telegram.ui.Components.x20) g30Var.getChildAt(i11);
                        if (MessageObject.getPeerId(x20Var.getParticipant().peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                            x20Var.setAmplitude(fArr[i10] * 15.0f);
                        }
                    }
                }
                k30Var.k(groupCallParticipant, fArr[i10] * 15.0f);
            }
        }
    }

    public static void D(u50 u50Var) {
        Editable text = u50Var.H.getText();
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = text.toString();
        tL_textWithEntities.entities = MediaDataController.getInstance(u50Var.currentAccount).getEntities(new CharSequence[]{text}, true);
        u50Var.A1(tL_textWithEntities);
    }

    public static void F0(u50 u50Var) {
        ChatObject.Call call = u50Var.f42217a1;
        if (call != null && call.call != null) {
            TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
            togglegroupcallsettings.call = u50Var.f42217a1.getInputGroupCall();
            togglegroupcallsettings.join_muted = Boolean.valueOf(u50Var.f42217a1.call.join_muted);
            ConnectionsManager connectionsManager = u50Var.d.getConnectionsManager();
            DispatchQueue2 dispatchQueue2 = Utilities.stageQueue;
            Objects.requireNonNull(dispatchQueue2);
            connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.g1(dispatchQueue2), new o20(u50Var, 1));
        }
    }

    public static void F1(org.telegram.ui.ActionBar.e1 e1Var, int i10) {
        if (e1Var != null) {
            e1Var.d(i10, i10);
        }
    }

    public static void G0(u50 u50Var, boolean z10) {
        if (u50Var.f42217a1 == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        togglegroupcallsettings.call = u50Var.f42217a1.getInputGroupCall();
        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
        u50Var.f42316x3 = Boolean.valueOf(z10);
        u50Var.I1(true);
        ConnectionsManager connectionsManager = u50Var.d.getConnectionsManager();
        DispatchQueue2 dispatchQueue2 = Utilities.stageQueue;
        Objects.requireNonNull(dispatchQueue2);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.g1(dispatchQueue2), new o20(u50Var, 0));
    }

    public static void H0(u50 u50Var) {
        boolean z10;
        int i10;
        if (u50Var.r1()) {
            k30 k30Var = u50Var.a2;
            if (!k30Var.V && k30Var.f31670b && (F3 == u50Var.q1() || AndroidUtilities.isTablet())) {
                z10 = false;
            } else {
                z10 = true;
            }
            Boolean bool = u50Var.f42256j2;
            if (bool != null && z10 == bool.booleanValue()) {
                return;
            }
            int systemUiVisibility = u50Var.containerView.getSystemUiVisibility();
            if (z10) {
                i10 = systemUiVisibility & (-7);
                u50Var.getWindow().clearFlags(1024);
                u50Var.setHideSystemVerticalInsets(false);
            } else {
                u50Var.setHideSystemVerticalInsets(true);
                i10 = systemUiVisibility | 6;
                u50Var.getWindow().addFlags(1024);
            }
            u50Var.containerView.setSystemUiVisibility(i10);
            u50Var.f42256j2 = Boolean.valueOf(z10);
            u50Var.S2 = !z10;
            u50Var.containerView.requestApplyInsets();
            return;
        }
        u50Var.isFullscreen = false;
    }

    public static org.telegram.ui.Components.voip.l I0(u50 u50Var) {
        z40 z40Var = u50Var.Q;
        for (int i10 = 0; i10 < z40Var.getChildCount(); i10++) {
            View childAt = z40Var.getChildAt(i10);
            if (childAt.isAttachedToWindow() && (childAt instanceof org.telegram.ui.Components.voip.l) && RecyclerView.R(childAt) >= 0) {
                return (org.telegram.ui.Components.voip.l) childAt;
            }
        }
        return null;
    }

    public static void J0(u50 u50Var) {
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
        p40 p40Var = u50Var.O;
        z40 z40Var = u50Var.Q;
        int childCount = z40Var.getChildCount();
        boolean z12 = false;
        float f14 = 2.1474836E9f;
        for (int i10 = 0; i10 < childCount; i10++) {
            if (RecyclerView.R(z40Var.getChildAt(i10)) >= 0) {
                f14 = Math.min(f14, childAt.getTop());
            }
        }
        if (f14 < 0.0f || f14 == 2.1474836E9f) {
            if (childCount != 0) {
                f14 = 0.0f;
            } else {
                f14 = z40Var.getPaddingTop();
            }
        }
        if (f14 <= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(14.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        float dp4 = f14 + AndroidUtilities.dp(14.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if ((z10 && p40Var.getTag() == null) || (!z10 && p40Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            p40Var.setTag(num);
            AnimatorSet animatorSet = u50Var.f42246h0;
            if (animatorSet != null) {
                animatorSet.cancel();
                u50Var.f42246h0 = null;
            }
            if (p40Var.getTag() == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            u50Var.setUseLightStatusBar(z11);
            ViewPropertyAnimator animate = p40Var.getBackButton().animate();
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
            org.telegram.ui.Components.zr zrVar = org.telegram.ui.Components.zr.f33337f;
            duration.setInterpolator(zrVar).start();
            ViewPropertyAnimator animate2 = p40Var.getTitleTextView().animate();
            if (z10) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(23.0f);
            }
            animate2.translationY(dp).setDuration(300L).setInterpolator(zrVar).start();
            ObjectAnimator objectAnimator = u50Var.U2;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                u50Var.U2.cancel();
            }
            org.telegram.ui.ActionBar.n5 subtitleTextView = p40Var.getSubtitleTextView();
            Property property = View.TRANSLATION_Y;
            float translationY = p40Var.getSubtitleTextView().getTranslationY();
            if (z10) {
                dp2 = 0.0f;
            } else {
                dp2 = AndroidUtilities.dp(20.0f);
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(subtitleTextView, property, translationY, dp2);
            u50Var.U2 = ofFloat;
            ofFloat.setDuration(300L);
            u50Var.U2.setInterpolator(zrVar);
            u50Var.U2.addListener(new o40(0, u50Var, z10));
            u50Var.U2.start();
            ObjectAnimator objectAnimator2 = u50Var.V2;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            org.telegram.ui.ActionBar.n5 additionalSubtitleTextView = p40Var.getAdditionalSubtitleTextView();
            if (z10) {
                dp3 = 0.0f;
            } else {
                dp3 = AndroidUtilities.dp(20.0f);
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(additionalSubtitleTextView, property, dp3);
            u50Var.V2 = ofFloat2;
            ofFloat2.setDuration(300L);
            u50Var.V2.setInterpolator(zrVar);
            u50Var.V2.start();
            AnimatorSet animatorSet2 = new AnimatorSet();
            u50Var.f42246h0 = animatorSet2;
            animatorSet2.setDuration(140L);
            AnimatorSet animatorSet3 = u50Var.f42246h0;
            Property property2 = View.ALPHA;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(p40Var, property2, f11);
            d30 d30Var = u50Var.N;
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(d30Var, property2, f12);
            View view = u50Var.f42242g0;
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(view, property2, f13));
            u50Var.f42246h0.addListener(new m40(u50Var, 1));
            u50Var.f42246h0.start();
            u50Var.a2.v.setClickable((!z10 || F3) ? true : true);
        }
        if (u50Var.f42318y0 != dp4) {
            u50Var.E1(dp4);
        }
    }

    public static void N(u50 u50Var, org.telegram.ui.Components.voip.l lVar, boolean z10) {
        if (!u50Var.isDismissed()) {
            if (z10 && lVar.getRenderer() == null) {
                lVar.setRenderer(org.telegram.ui.Components.voip.t.c(u50Var.Y1, u50Var.a2, lVar, null, null, lVar.getParticipant(), u50Var.f42217a1, u50Var));
            } else if (!z10 && lVar.getRenderer() != null) {
                lVar.getRenderer().setPrimaryView(null);
                lVar.setRenderer(null);
            }
        }
    }

    public static void S(u50 u50Var, int i10, int[] iArr) {
        if (u50Var.r1()) {
            int i11 = org.telegram.ui.ActionBar.k6.Kg;
            iArr[0] = org.telegram.ui.ActionBar.k6.x0(null, i11, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Lg, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21598zg, false), u50Var.U1, 1.0f);
            iArr[2] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21320kg, false), org.telegram.ui.ActionBar.k6.x0(null, i11, false), u50Var.U1, 1.0f);
        } else if (i10 == 0) {
            iArr[0] = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Jg, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21580yg, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21598zg, false), u50Var.U1, 1.0f);
            iArr[2] = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21564xg, false);
        } else if (i10 == 1) {
            iArr[0] = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Gg, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Bg, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Cg, false), u50Var.U1, 1.0f);
            iArr[2] = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ag, false);
        } else if (p1(i10)) {
            iArr[0] = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21321kh, false);
            iArr[1] = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21339lh, false);
            iArr[2] = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21358mh, false);
        } else {
            int i12 = org.telegram.ui.ActionBar.k6.Kg;
            iArr[0] = org.telegram.ui.ActionBar.k6.x0(null, i12, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Mg, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ng, false), u50Var.U1, 1.0f);
            iArr[2] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21320kg, false), org.telegram.ui.ActionBar.k6.x0(null, i12, false), u50Var.U1, 1.0f);
        }
        if (p1(i10)) {
            iArr[3] = i0.a.f(0.5f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21282ih, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21321kh, false));
        } else if (i10 == 1) {
            iArr[3] = i0.a.f(0.75f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Bg, false), i0.a.f(0.5f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Fg, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Hg, false)));
        } else {
            iArr[3] = i0.a.f(0.5f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Jg, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ig, false));
        }
    }

    public static void c1(LaunchActivity launchActivity, AccountInstance accountInstance, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        if (D3 == null) {
            if (inputPeer != null || VoIPService.getSharedInstance() != null) {
                if (inputPeer != null) {
                    D3 = new u50(launchActivity, accountInstance, accountInstance.getMessagesController().getGroupCall(chat.f20344id, false), chat, inputPeer, z10, str);
                } else {
                    ChatObject.Call call = VoIPService.getSharedInstance().groupCall;
                    if (call != null) {
                        TLRPC.Chat chat2 = accountInstance.getMessagesController().getChat(Long.valueOf(call.chatId));
                        call.addSelfDummyParticipant(true);
                        D3 = new u50(launchActivity, accountInstance, call, chat2, null, z10, str);
                    } else {
                        return;
                    }
                }
                D3.f42250i0 = launchActivity;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.pc(23));
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

    public static void m(u50 u50Var, ChatObject.Call.InvitedUser invitedUser, Long l4) {
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = invitedUser.msg_id;
        ConnectionsManager.getInstance(u50Var.currentAccount).sendRequest(declineconferencecallinvite, new n20(u50Var, 0));
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(invitedUser.msg_id));
        MessagesController.getInstance(u50Var.currentAccount).deleteMessages(arrayList, null, null, 0L, 0, true, 0);
        ChatObject.Call call = u50Var.f42217a1;
        if (call != null) {
            call.invitedUsers.remove(l4);
            u50Var.f42217a1.invitedUsersMap.remove(l4);
            u50Var.f42217a1.invitedUsersMessageIds.remove(l4);
            u50Var.O0(true);
        }
    }

    public static void n(u50 u50Var, Activity activity, ChatObject.Call call, View view, int i10) {
        TLRPC.Chat chat;
        final ChatObject.Call.InvitedUser invitedUser;
        AccountInstance accountInstance = u50Var.d;
        ArrayList arrayList = u50Var.F0;
        o50 o50Var = u50Var.P;
        if (view instanceof org.telegram.ui.Components.voip.l) {
            u50Var.e1(((org.telegram.ui.Components.voip.l) view).getParticipant());
        } else if (view instanceof org.telegram.ui.Cells.d4) {
            u50Var.G1((org.telegram.ui.Cells.d4) view);
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
                    if (u50Var.o1()) {
                        int i11 = i10 - o50Var.f40081n;
                        if (i11 >= 0 && i11 < u50Var.f42217a1.shadyJoinParticipants.size()) {
                            l4 = u50Var.f42217a1.shadyJoinParticipants.get(i10 - o50Var.f40081n);
                        } else {
                            int i12 = i10 - o50Var.f40083s;
                            if (i12 >= 0 && i12 < u50Var.f42217a1.shadyLeftParticipants.size()) {
                                l4 = u50Var.f42217a1.shadyLeftParticipants.get(i10 - o50Var.f40083s);
                            } else {
                                int i13 = i10 - o50Var.f40080f;
                                if (u50Var.f42291s0) {
                                    if (i13 >= 0 && i13 < arrayList.size()) {
                                        l4 = (Long) arrayList.get(i13);
                                    }
                                } else if (i13 >= 0 && i13 < u50Var.f42217a1.invitedUsers.size()) {
                                    l4 = u50Var.f42217a1.invitedUsers.get(i13);
                                }
                                z10 = false;
                            }
                        }
                        if (!z10 && (invitedUser = u50Var.f42217a1.invitedUsersMessageIds.get(l4)) != null) {
                            org.telegram.ui.Components.h80 F = org.telegram.ui.Components.h80.F(u50Var.container, u50Var.resourcesProvider, v3Var);
                            F.l(R.drawable.msg_endcall, LocaleController.getString(R.string.GroupCallStopCallingInvite), new Runnable(u50Var) {
                                public final u50 f39107b;

                                {
                                    this.f39107b = u50Var;
                                }

                                @Override
                                public final void run() {
                                    switch (r4) {
                                        case 0:
                                            u50.s(this.f39107b, invitedUser, l4);
                                            return;
                                        default:
                                            u50.m(this.f39107b, invitedUser, l4);
                                            return;
                                    }
                                }
                            }, invitedUser.isCalling());
                            F.c(R.drawable.msg_remove, LocaleController.getString(R.string.GroupCallDiscardInvite), new Runnable(u50Var) {
                                public final u50 f39107b;

                                {
                                    this.f39107b = u50Var;
                                }

                                @Override
                                public final void run() {
                                    switch (r4) {
                                        case 0:
                                            u50.s(this.f39107b, invitedUser, l4);
                                            return;
                                        default:
                                            u50.m(this.f39107b, invitedUser, l4);
                                            return;
                                    }
                                }
                            }, false);
                            F.W(org.telegram.ui.ActionBar.k6.d0(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), u50Var.C0.getColor()));
                            F.f26929s = 96;
                            F.Z();
                            return;
                        }
                        return;
                    }
                    u50Var.f42250i0.P0(u50Var.currentAccount);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", v3Var.getUser().f20491id);
                    if (v3Var.f23835a.getImageReceiver().hasNotThumb()) {
                        bundle.putBoolean("expandPhoto", true);
                    }
                    u50Var.f42250i0.u0(new ProfileActivity(bundle, null));
                    u50Var.dismiss();
                }
            } else if (i10 == o50Var.f40084w) {
                if (ChatObject.isChannel(u50Var.Z0) && (chat = u50Var.Z0) != null && !chat.megagroup && ChatObject.isPublic(chat)) {
                    u50Var.j1(false);
                    return;
                }
                TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(u50Var.i1());
                if (chatFull != null) {
                    u50Var.f42308w0 = false;
                    Context context = u50Var.getContext();
                    int currentAccount = accountInstance.getCurrentAccount();
                    TLRPC.Chat chat2 = u50Var.Z0;
                    ChatObject.Call call2 = u50Var.f42217a1;
                    org.telegram.ui.Components.y30 y30Var = new org.telegram.ui.Components.y30(context, currentAccount, chat2, chatFull, call2.participants, call2.invitedUsersMap);
                    u50Var.E1 = y30Var;
                    y30Var.setOnDismissListener(new j20(u50Var, 2));
                    org.telegram.ui.Components.y30 y30Var2 = u50Var.E1;
                    y30Var2.f32803g0 = new t20(u50Var);
                    y30Var2.show();
                }
            } else if (i10 == o50Var.f40085x) {
                ChatObject.Call call3 = u50Var.f42217a1;
                if (call3 != null && call3.call != null) {
                    ug.l1 l1Var = new ug.l1(activity, u50Var.currentAccount, null, 4, new ci.k0());
                    ChatObject.Call call4 = u50Var.f42217a1;
                    if (call4 != null) {
                        collection = (Collection) Collection.EL.stream(call4.sortedParticipants).map(new k2.g(5)).collect(Collectors.toSet());
                    }
                    l1Var.C0.addAll(collection);
                    l1Var.h0(false, true);
                    l1Var.A0 = new f20(u50Var, 3);
                    l1Var.h0(false, true);
                    l1Var.D0 = new ai.r5(18, u50Var, call);
                    l1Var.show();
                }
            } else if (i10 == o50Var.f40086y) {
                u50Var.v1();
            }
        }
    }

    public static void p(u50 u50Var, Activity activity) {
        LaunchActivity launchActivity = u50Var.f42250i0;
        if (launchActivity != null && launchActivity.checkSelfPermission("android.permission.CAMERA") != 0) {
            u50Var.f42250i0.requestPermissions(new String[]{"android.permission.CAMERA"}, 104);
        } else if (VoIPService.getSharedInstance() != null) {
            boolean z10 = false;
            if (VoIPService.getSharedInstance().getVideoState(false) != 2) {
                u50Var.f42254j0[0].d(1, false);
                if (u50Var.f42321z0 == null) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null) {
                        sharedInstance.createCaptureDevice(false);
                    }
                    if (VoIPService.getSharedInstance().getVideoState(true) != 2) {
                        z10 = true;
                    }
                    e40 e40Var = new e40(u50Var, activity, z10);
                    u50Var.f42321z0 = e40Var;
                    e40Var.setBottomPadding(u50Var.containerView.getPaddingBottom());
                    u50Var.container.addView(u50Var.f42321z0);
                    if (sharedInstance != null && !sharedInstance.isFrontFaceCamera()) {
                        sharedInstance.switchCamera();
                        return;
                    }
                    return;
                }
                return;
            }
            VoIPService.getSharedInstance().setVideoState(false, 0);
            u50Var.O1(true, false);
            u50Var.N1(false);
            u50Var.f42217a1.sortParticipants();
            u50Var.O0(true);
            u50Var.e.requestLayout();
        }
    }

    public static boolean p1(int i10) {
        if ((VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().groupCall == null || !VoIPService.getSharedInstance().groupCall.call.rtmp_stream) && i10 != 2 && i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            return false;
        }
        return true;
    }

    public static void q(u50 u50Var, float f7, float f10, float f11, int i10, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        u50Var.f42231d2 = floatValue;
        u50Var.a2.f31684n = floatValue;
        float f12 = (floatValue * 1.0f) + ((1.0f - floatValue) * f7);
        n30 n30Var = u50Var.C2;
        n30Var.setScaleX(f12);
        n30Var.setScaleY(f12);
        n30Var.setTranslationX((1.0f - u50Var.f42231d2) * f10);
        n30Var.setTranslationY((1.0f - u50Var.f42231d2) * f11);
        if (!u50Var.f42244g2) {
            u50Var.W2.setAlpha((int) (u50Var.f42231d2 * 100.0f));
        }
        org.telegram.ui.Components.voip.t tVar = u50Var.Z2;
        if (tVar != null) {
            tVar.f31863a.setRoundCorners((1.0f - u50Var.f42231d2) * AndroidUtilities.dp(8.0f));
        }
        n30Var.invalidate();
        u50Var.containerView.invalidate();
        m30 m30Var = u50Var.f42219b;
        int i11 = (int) ((1.0f - u50Var.f42231d2) * i10);
        m30Var.N(i11, i11);
    }

    public static void r(u50 u50Var, ChatObject.Call call, Boolean bool, HashSet hashSet) {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance;
        ChatObject.Call call2 = u50Var.f42217a1;
        if (call2 != null && (groupCall = call2.call) != null) {
            String str = groupCall.invite_link;
            int size = hashSet.size();
            AtomicInteger atomicInteger = new AtomicInteger(0);
            HashSet hashSet2 = new HashSet();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                long longValue = ((Long) it.next()).longValue();
                u50Var.f42217a1.addInvitedUser(longValue);
                TL_phone.inviteConferenceCallParticipant inviteconferencecallparticipant = new TL_phone.inviteConferenceCallParticipant();
                TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                inviteconferencecallparticipant.call = tL_inputGroupCall;
                TLRPC.GroupCall groupCall2 = u50Var.f42217a1.call;
                tL_inputGroupCall.f20361id = groupCall2.f20354id;
                tL_inputGroupCall.access_hash = groupCall2.access_hash;
                inviteconferencecallparticipant.user_id = MessagesController.getInstance(u50Var.currentAccount).getInputUser(longValue);
                inviteconferencecallparticipant.video = bool.booleanValue();
                ConnectionsManager.getInstance(u50Var.currentAccount).sendRequest(inviteconferencecallparticipant, new gi.z0(u50Var, longValue, hashSet2, atomicInteger, size, call, str));
            }
            u50Var.O0(true);
            if (bool.booleanValue() && (sharedInstance = VoIPService.getSharedInstance()) != null && sharedInstance.getVideoState(false) != 2 && sharedInstance.getVideoState(false) != 1) {
                sharedInstance.createCaptureDevice(false);
                if (!sharedInstance.isFrontFaceCamera()) {
                    sharedInstance.switchCamera();
                }
                sharedInstance.requestVideoCall(false);
                sharedInstance.setVideoState(false, 2);
                sharedInstance.setMicMute(false, false, true);
                sharedInstance.switchToSpeaker();
                u50Var.O1(true, true);
            }
        }
    }

    public static void s(u50 u50Var, ChatObject.Call.InvitedUser invitedUser, Long l4) {
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = invitedUser.msg_id;
        ConnectionsManager.getInstance(u50Var.currentAccount).sendRequest(declineconferencecallinvite, new n20(u50Var, 1));
        ChatObject.Call call = u50Var.f42217a1;
        if (call != null) {
            invitedUser.calling = false;
            call.invitedUsersMessageIds.put(l4, invitedUser);
            u50Var.O0(true);
        }
    }

    public static void t(u50 u50Var, TLObject tLObject) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(u50Var.currentAccount).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
        }
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
                    alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertTitle);
                    alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertText);
                } else if (ChatObject.isChannelOrGiga(chat)) {
                    alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.VoipChannelLeaveAlertTitle);
                    alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.VoipChannelLeaveAlertText);
                } else {
                    alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.VoipGroupLeaveAlertTitle);
                    alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.VoipGroupLeaveAlertText);
                }
                sharedInstance.getAccount();
                org.telegram.ui.Cells.z1[] z1VarArr = new org.telegram.ui.Cells.z1[1];
                LinearLayout e = org.telegram.messenger.tl.e(context, 1);
                if (!sharedInstance.isConference() || (call != null && (groupCall = call.call) != null && groupCall.creator)) {
                    org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(context, 1);
                    z1VarArr[0] = z1Var;
                    z1Var.setBackground(org.telegram.ui.ActionBar.k6.M0(false));
                    if (z10) {
                        z1VarArr[0].setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21290j5, false));
                    } else {
                        z1VarArr[0].setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21263hg, false));
                        CheckBoxSquare checkBoxSquare = (CheckBoxSquare) z1VarArr[0].getCheckBoxView();
                        int i10 = org.telegram.ui.ActionBar.k6.f21451rg;
                        int i11 = org.telegram.ui.ActionBar.k6.f21412pg;
                        int i12 = org.telegram.ui.ActionBar.k6.f21377ng;
                        checkBoxSquare.f24312s = i10;
                        checkBoxSquare.v = i11;
                        checkBoxSquare.f24313w = i12;
                        checkBoxSquare.invalidate();
                    }
                    z1VarArr[0].setTag(0);
                    if (sharedInstance.isConference()) {
                        z1VarArr[0].e(LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertEndChat), "", false, false, false);
                    } else if (ChatObject.isChannelOrGiga(chat)) {
                        z1VarArr[0].e(LocaleController.getString(R.string.VoipChannelLeaveAlertEndChat), "", false, false, false);
                    } else {
                        z1VarArr[0].e(LocaleController.getString(R.string.VoipGroupLeaveAlertEndChat), "", false, false, false);
                    }
                    org.telegram.ui.Cells.z1 z1Var2 = z1VarArr[0];
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
                    z1Var2.setPadding(dp, 0, dp2, 0);
                    e.addView(z1VarArr[0], w7.z5.n(-1, -2));
                    z1VarArr[0].setOnClickListener(new g20(z1VarArr, 0));
                }
                alertDialog$Builder.o(e);
                alertDialog$Builder.f20679a.I = org.telegram.ui.ActionBar.k6.f21412pg;
                alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupLeave), new ai.y3(call, z1VarArr, selfId, runnable, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                if (z10) {
                    alertDialog$Builder.f20679a.R0 = false;
                }
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
                if (z10) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        c2Var.getWindow().setType(2038);
                    } else {
                        c2Var.getWindow().setType(2003);
                    }
                    c2Var.getWindow().clearFlags(2);
                }
                if (!z10) {
                    c2Var.j(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21509ug, false));
                }
                c2Var.show();
                if (!z10) {
                    TextView textView = (TextView) c2Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21527vg, null);
                    }
                    c2Var.p(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21263hg, false));
                    return;
                }
                return;
            }
            w1(call, false, selfId, runnable);
        }
    }

    public static void u(u50 u50Var) {
        u50Var.Y0();
        u50Var.V0();
        u50Var.U0();
        u50Var.F.setTranslationY((-u50Var.C1.d()) + u50Var.containerView.getPaddingBottom());
        u50Var.G.invalidate();
        u50Var.Z0();
        u50Var.containerView.invalidate();
    }

    public static void v(u50 u50Var, TLObject tLObject) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(u50Var.currentAccount).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
        }
    }

    public static void w(u50 u50Var, long j10, HashSet hashSet, AtomicInteger atomicInteger, int i10, ChatObject.Call call, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(u50Var.currentAccount).lambda$processUpdates$377(updates, false);
            AndroidUtilities.runOnUIThread(new a3.i0(u50Var, updates, j10, 27));
        } else if (tL_error != null && "USER_PRIVACY_RESTRICTED".equalsIgnoreCase(tL_error.text)) {
            hashSet.add(Long.valueOf(j10));
        }
        if (atomicInteger.incrementAndGet() == i10 && !hashSet.isEmpty()) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.h90(u50Var, hashSet, call, str, 12));
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

    public static void x(u50 u50Var, HashSet hashSet, ChatObject.Call call, String str) {
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
            arrayList.add(MessagesController.getInstance(u50Var.currentAccount).getUser(l4));
            getrequirementstocontact.f20548id.add(MessagesController.getInstance(u50Var.currentAccount).getInputUser(longValue));
        }
        org.telegram.ui.Components.e30 e30Var = new org.telegram.ui.Components.e30(u50Var, arrayList, arrayList2, arrayList3, str, 7);
        if (UserConfig.getInstance(u50Var.currentAccount).isPremium()) {
            e30Var.run();
        } else {
            ConnectionsManager.getInstance(u50Var.currentAccount).sendRequest(getrequirementstocontact, new ca(arrayList, arrayList2, e30Var, 13));
        }
    }

    public static void y(u50 u50Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        sg.j0 j0Var = new sg.j0(34, u50Var.currentAccount, U.getContext(), U, new ci.k0());
        j0Var.M1(null, arrayList, arrayList2, arrayList3, str);
        j0Var.show();
    }

    public static void z(u50 u50Var, org.telegram.ui.ActionBar.c2[] c2VarArr, boolean z10, TLRPC.TL_error tL_error, long j10, TL_phone.inviteToGroupCall invitetogroupcall) {
        try {
            c2VarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        c2VarArr[0] = null;
        if (z10 && "USER_NOT_PARTICIPANT".equals(tL_error.text)) {
            u50Var.x1(null, j10, 3);
            return;
        }
        org.telegram.ui.Components.d5.e0(u50Var.currentAccount, tL_error, (org.telegram.ui.ActionBar.o2) u50Var.f42250i0.O().getFragmentStack().get(u50Var.f42250i0.O().getFragmentStack().size() - 1), invitetogroupcall, new Object[0]);
    }

    public final void A1(TLRPC.TL_textWithEntities tL_textWithEntities) {
        TLRPC.InputGroupCall inputGroupCall;
        long j10;
        this.H.setText("");
        ChatObject.Call call = this.f42217a1;
        if (call != null && call.call != null && (inputGroupCall = call.getInputGroupCall()) != null) {
            ChatObject.Call call2 = this.f42217a1;
            long j11 = call2.call.f20354id;
            TLRPC.Peer peer = call2.selfPeer;
            if (peer != null) {
                j10 = DialogObject.getPeerDialogId(peer);
            } else {
                j10 = UserConfig.getInstance(this.currentAccount).clientUserId;
            }
            GroupCallMessagesController.getInstance(this.currentAccount).sendCallMessage(j10, tL_textWithEntities, j11, inputGroupCall);
        }
    }

    public final void B1(float f7) {
        float f10;
        int i10;
        int i11;
        this.U1 = f7;
        k30 k30Var = this.a2;
        if (k30Var == null) {
            f10 = 0.0f;
        } else {
            f10 = k30Var.f31672c;
        }
        float max = Math.max(f7, f10);
        int i12 = org.telegram.ui.ActionBar.k6.f21301jg;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i12, false);
        int i13 = org.telegram.ui.ActionBar.k6.f21247gg;
        int offsetColor = AndroidUtilities.getOffsetColor(x02, org.telegram.ui.ActionBar.k6.x0(null, i13, false), f7, 1.0f);
        this.V1 = offsetColor;
        this.N.setBackgroundColor(offsetColor);
        this.f42259k1.B(-14472653);
        this.f42238f0.setColorFilter(new PorterDuffColorFilter(this.V1, PorterDuff.Mode.MULTIPLY));
        this.navBarColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.x0(null, i12, false), org.telegram.ui.ActionBar.k6.x0(null, i13, false), max, 1.0f);
        int offsetColor2 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21320kg, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21490tg, false), f7, 1.0f);
        f50 f50Var = this.f42277p0;
        if (f50Var != null) {
            f50Var.f37199j = offsetColor2;
            e50 e50Var = f50Var.f37197g;
            if (e50Var != null) {
                e50Var.invalidate();
            }
        }
        this.C0.setColor(offsetColor2);
        this.E.setColor(offsetColor2);
        this.F.invalidate();
        z40 z40Var = this.Q;
        z40Var.setGlowColor(offsetColor2);
        int i14 = this.F1;
        if (i14 == 3 || p1(i14)) {
            this.f42307w.invalidate();
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
        int offsetColor3 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Dg, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Eg, false), f7, 1.0f);
        this.f42290s.a(offsetColor3, offsetColor3);
        int offsetColor4 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21338lg, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21395og, false), f7, 1.0f);
        int offsetColor5 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21357mg, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21451rg, false), f7, 1.0f);
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oh, this.resourcesProvider);
        int childCount = z40Var.getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = z40Var.getChildAt(i16);
            if (childAt instanceof org.telegram.ui.Cells.w3) {
                org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) childAt;
                if (o1()) {
                    w3Var.a(w02, w02);
                } else {
                    w3Var.a(offsetColor5, offsetColor4);
                }
            } else {
                boolean z10 = childAt instanceof org.telegram.ui.Cells.d4;
                p40 p40Var = this.O;
                if (z10) {
                    org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) childAt;
                    if (p40Var.getTag() != null) {
                        i11 = org.telegram.ui.ActionBar.k6.f21451rg;
                    } else {
                        i11 = org.telegram.ui.ActionBar.k6.f21357mg;
                    }
                    d4Var.f(i11, offsetColor5);
                } else if (childAt instanceof org.telegram.ui.Cells.v3) {
                    org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) childAt;
                    if (p40Var.getTag() != null) {
                        i10 = org.telegram.ui.ActionBar.k6.f21451rg;
                    } else {
                        i10 = org.telegram.ui.ActionBar.k6.f21357mg;
                    }
                    v3Var.a(i10, offsetColor5);
                }
            }
        }
        this.containerView.invalidate();
        z40Var.invalidate();
        this.container.invalidate();
    }

    public final void C1(float f7) {
        z40 z40Var;
        TLRPC.GroupCallParticipant groupCallParticipant;
        ArrayList<TLRPC.GroupCallParticipant> arrayList;
        s4.b1 K;
        f7 = (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) ? 0.0f : 0.0f;
        float min = (float) (Math.min(8500.0d, 4000.0f * f7) / 8500.0d);
        this.P0 = min;
        this.Q0 = (min - this.O0) / 265.0f;
        ChatObject.Call call = this.f42217a1;
        if (call != null && (z40Var = this.Q) != null && (groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(MessageObject.getPeerId(this.A0))) != null) {
            k30 k30Var = this.a2;
            if (!k30Var.f31670b) {
                if (this.f42291s0) {
                    arrayList = this.D0;
                } else {
                    arrayList = this.f42217a1.visibleParticipants;
                }
                int indexOf = arrayList.indexOf(groupCallParticipant);
                if (indexOf >= 0 && (K = z40Var.K(indexOf + this.P.d)) != null) {
                    View view = K.f46342a;
                    if (view instanceof org.telegram.ui.Cells.d4) {
                        ((org.telegram.ui.Cells.d4) view).setAmplitude(f7 * 15.0f);
                        if (view == this.X2 && !this.f42263l2) {
                            this.containerView.invalidate();
                        }
                    }
                }
            } else {
                int i10 = 0;
                while (true) {
                    g30 g30Var = this.f42266m2;
                    if (i10 >= g30Var.getChildCount()) {
                        break;
                    }
                    org.telegram.ui.Components.x20 x20Var = (org.telegram.ui.Components.x20) g30Var.getChildAt(i10);
                    if (MessageObject.getPeerId(x20Var.getParticipant().peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                        x20Var.setAmplitude(f7 * 15.0f);
                    }
                    i10++;
                }
            }
            k30Var.k(groupCallParticipant, f7 * 15.0f);
        }
    }

    public final void D1(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25) {
        this.f42245g3 = i10;
        this.f42249h3 = i11;
        this.f42253i3 = i12;
        this.f42257j3 = i13;
        this.f42261k3 = i14;
        this.f42264l3 = i15;
        this.f42267m3 = i16;
        this.f42272n3 = i17;
        this.f42276o3 = i18;
        this.f42280p3 = i19;
        this.f42284q3 = i20;
        this.f42289r3 = i21;
        this.f42294s3 = i22;
        this.f42298t3 = i23;
        this.f42302u3 = i24;
        this.f42306v3 = i25;
    }

    public final void E1(float f7) {
        z40 z40Var;
        int dp;
        int i10;
        float f10;
        this.f42318y0 = f7;
        this.Q.setTopGlowOffset((int) (f7 - ((FrameLayout.LayoutParams) z40Var.getLayoutParams()).topMargin));
        float dp2 = f7 - AndroidUtilities.dp(74.0f);
        int i11 = ((this.backgroundPaddingTop + dp2) > (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2) ? 1 : ((this.backgroundPaddingTop + dp2) == (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2) ? 0 : -1));
        j50 j50Var = this.U0;
        k30 k30Var = this.a2;
        e30 e30Var = this.f42239f1;
        c30 c30Var = this.f42234e1;
        if (i11 < 0) {
            float min = Math.min(1.0f, (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2) - dp2) - this.backgroundPaddingTop) / (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + ((dp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f))));
            if (AndroidUtilities.isTablet()) {
                f10 = 17.0f;
            } else {
                f10 = 13.0f;
            }
            i10 = (int) (AndroidUtilities.dp(f10) * min);
            if (j50Var != null) {
                j50Var.setShadowOffset((int) (AndroidUtilities.dp(8.0f) * min));
            }
            if (Math.abs(Math.min(1.0f, min) - this.U1) > 1.0E-4f) {
                B1(Math.min(1.0f, min));
            }
            float x10 = org.telegram.ui.Cells.b1.x(min, 0.1f, 1.2f, 1.0f);
            c30Var.setScaleX(Math.max(0.9f, x10));
            c30Var.setScaleY(Math.max(0.9f, x10));
            float f11 = 1.0f - (min * 1.2f);
            c30Var.setAlpha((1.0f - k30Var.f31672c) * Math.max(0.0f, f11));
            e30Var.setScaleX(Math.max(0.9f, x10));
            e30Var.setScaleY(Math.max(0.9f, x10));
            e30Var.setAlpha((1.0f - k30Var.f31672c) * Math.max(0.0f, f11));
        } else {
            c30Var.setScaleX(1.0f);
            c30Var.setScaleY(1.0f);
            c30Var.setAlpha(1.0f - k30Var.f31672c);
            e30Var.setScaleX(1.0f);
            e30Var.setScaleY(1.0f);
            e30Var.setAlpha(1.0f - k30Var.f31672c);
            if (this.U1 > 1.0E-4f) {
                B1(0.0f);
            }
            i10 = 0;
        }
        Y0();
        float f12 = i10;
        this.f42322z1.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f7 - AndroidUtilities.dp(53.0f)) - f12));
        this.f42255j1.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f7 - AndroidUtilities.dp(44.0f)) - f12));
        if (j50Var != null) {
            j50Var.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), f7 - AndroidUtilities.dp(37.0f)));
        }
        b40 b40Var = this.R;
        if (b40Var != null) {
            b40Var.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f7 - AndroidUtilities.dp(44.0f)) - f12));
        }
        this.containerView.invalidate();
        R1();
    }

    public final boolean G1(android.view.View r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.u50.G1(android.view.View):boolean");
    }

    public final void H1(View view) {
        if (this.m0 == null) {
            org.telegram.ui.Components.p40 p40Var = new org.telegram.ui.Components.p40(8, getContext(), null, true);
            this.m0 = p40Var;
            p40Var.setAlpha(0.0f);
            this.m0.setVisibility(4);
            this.m0.setShowingDuration(3000L);
            this.containerView.addView(this.m0, w7.z5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
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
        ChatObject.Call call = this.f42217a1;
        org.telegram.ui.Components.voip.t2 t2Var = this.v;
        org.telegram.ui.Components.voip.t2 t2Var2 = this.h;
        org.telegram.ui.Components.voip.t2 t2Var3 = this.f42285r;
        org.telegram.ui.Components.voip.t2 t2Var4 = this.f42237f;
        org.telegram.ui.Components.voip.t2 t2Var5 = this.f42268n;
        org.telegram.ui.Components.voip.t2 t2Var6 = this.f42290s;
        org.telegram.ui.Components.voip.t2 t2Var7 = this.f42307w;
        boolean z19 = true;
        x20 x20Var = this.e;
        boolean z20 = false;
        if (call != null && !call.isScheduled()) {
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(false) == 2) {
                z13 = true;
            } else {
                z13 = false;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f42217a1.participants.f(MessageObject.getPeerId(this.A0));
            if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !Q0()) {
                z14 = true;
            } else {
                z14 = false;
            }
            Boolean bool = this.f42316x3;
            if (bool != null) {
                z15 = bool.booleanValue();
            } else {
                TLRPC.GroupCall groupCall = this.f42217a1.call;
                if (groupCall != null && groupCall.messages_enabled) {
                    z15 = true;
                } else {
                    z15 = false;
                }
            }
            if (((!z14 && this.f42217a1.canRecordVideo()) || z13) && !r1()) {
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
            x20Var.c(t2Var7, true, z10);
            x20Var.c(t2Var6, true, z10);
            x20Var.c(t2Var5, z16, z10);
            x20Var.c(t2Var4, z18, z10);
            x20Var.c(t2Var3, z20, z10);
            x20Var.c(t2Var2, z17, z10);
            x20Var.c(t2Var, z15, z10);
            return;
        }
        if (this.V0 > 0.1f) {
            z11 = true;
        } else {
            z11 = false;
        }
        x20Var.c(t2Var7, z11, z10);
        if (this.V0 > 0.1f) {
            z12 = true;
        } else {
            z12 = false;
        }
        x20Var.c(t2Var6, z12, z10);
        if (this.V0 <= 0.1f) {
            z19 = false;
        }
        x20Var.c(t2Var3, z19, z10);
        x20Var.c(t2Var5, false, z10);
        x20Var.c(t2Var4, false, z10);
        x20Var.c(t2Var2, false, z10);
        x20Var.c(t2Var, false, z10);
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
        ChatObject.Call call2 = this.f42217a1;
        org.telegram.ui.ActionBar.u0 u0Var = this.f42259k1;
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f42265m1;
        if (call2 == null || call2.isScheduled()) {
            this.l1.setVisibility(4);
            u0Var2.setVisibility(8);
            if (this.f42217a1 == null) {
                u0Var.setVisibility(8);
                return;
            }
        }
        if (this.f42262l0) {
            return;
        }
        AccountInstance accountInstance = this.d;
        TLRPC.Chat chat4 = accountInstance.getMessagesController().getChat(Long.valueOf(i1()));
        if (chat4 != null) {
            this.Z0 = chat4;
        }
        boolean canUserDoAdminAction = ChatObject.canUserDoAdminAction(this.Z0, 3);
        org.telegram.ui.ActionBar.e1 e1Var = this.f42270n1;
        if (!canUserDoAdminAction && (((ChatObject.isChannel(this.Z0) && ((chat3 = this.Z0) == null || !chat3.megagroup)) || (!ChatObject.isPublic(this.Z0) && !ChatObject.canUserDoAdminAction(this.Z0, 3))) && (!ChatObject.isChannel(this.Z0) || (chat2 = this.Z0) == null || chat2.megagroup || !ChatObject.isPublic(chat2)))) {
            e1Var.setVisibility(8);
        } else {
            e1Var.setVisibility(0);
        }
        ChatObject.Call call3 = this.f42217a1;
        org.telegram.ui.ActionBar.e1 e1Var2 = this.f42319y1;
        org.telegram.ui.ActionBar.e1 e1Var3 = this.f42314x1;
        if (call3 != null && (groupCall2 = call3.call) != null && groupCall2.can_change_messages_enabled) {
            if (groupCall2.messages_enabled) {
                i13 = 8;
            } else {
                i13 = 0;
            }
            e1Var3.setVisibility(i13);
            if (this.f42217a1.call.messages_enabled) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            e1Var2.setVisibility(i14);
        } else {
            e1Var3.setVisibility(8);
            e1Var2.setVisibility(8);
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f42217a1.participants.f(MessageObject.getPeerId(this.A0));
        ChatObject.Call call4 = this.f42217a1;
        org.telegram.ui.ActionBar.e1 e1Var4 = this.f42282q1;
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
        boolean Q0 = Q0();
        org.telegram.ui.ActionBar.e1 e1Var5 = this.f42309w1;
        org.telegram.ui.ActionBar.e1 e1Var6 = this.f42274o1;
        boolean z12 = true;
        org.telegram.ui.ActionBar.e1 e1Var7 = this.f42292s1;
        org.telegram.ui.ActionBar.e1 e1Var8 = this.f42296t1;
        if (Q0) {
            e1Var5.setVisibility(0);
            e1Var6.setVisibility(0);
            if (r1()) {
                e1Var7.setVisibility(0);
                e1Var8.setVisibility(8);
            } else if (this.f42217a1.isScheduled()) {
                e1Var7.setVisibility(8);
                e1Var8.setVisibility(8);
            } else {
                e1Var7.setVisibility(0);
            }
            if (o1()) {
                e1Var7.setVisibility(8);
                e1Var6.setVisibility(8);
            }
            if (this.f42217a1.canRecordVideo() && !this.f42217a1.isScheduled() && !r1()) {
                e1Var8.setVisibility(0);
            } else {
                e1Var8.setVisibility(8);
            }
            u0Var2.setVisibility(8);
            boolean z13 = this.f42217a1.recording;
            p50 p50Var = this.f42230d1;
            p50Var.f40333f = z13;
            p50Var.d = 1.0f;
            p50Var.invalidateSelf();
            if (this.f42217a1.recording) {
                if (this.D1 == null) {
                    f20 f20Var = new f20(this, 6);
                    this.D1 = f20Var;
                    AndroidUtilities.runOnUIThread(f20Var, 1000L);
                }
                e1Var7.setText(LocaleController.getString(R.string.VoipGroupStopRecordCall));
            } else {
                f20 f20Var2 = this.D1;
                if (f20Var2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(f20Var2);
                    this.D1 = null;
                }
                e1Var7.setText(LocaleController.getString(R.string.VoipGroupRecordCall));
            }
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(true) == 2) {
                e1Var8.j(LocaleController.getString(R.string.VoipChatStopScreenCapture), R.drawable.msg_screencast_off, null);
            } else {
                e1Var8.j(LocaleController.getString(R.string.VoipChatStartScreenCapture), R.drawable.msg_screencast, null);
            }
            L1();
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
            if (!z10 && ((this.f42217a1.canRecordVideo() || z11) && !this.f42217a1.isScheduled() && !r1())) {
                if (z11) {
                    u0Var2.setVisibility(8);
                    e1Var8.setVisibility(0);
                    e1Var8.j(LocaleController.getString(R.string.VoipChatStopScreenCapture), R.drawable.msg_screencast_off, null);
                    e1Var8.setContentDescription(LocaleController.getString(R.string.VoipChatStopScreenCapture));
                } else {
                    e1Var8.j(LocaleController.getString(R.string.VoipChatStartScreenCapture), R.drawable.msg_screencast, null);
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
        boolean Q02 = Q0();
        org.telegram.ui.ActionBar.e1 e1Var9 = this.f42287r1;
        if (Q02 && this.f42217a1.call.can_change_join_muted && !o1()) {
            e1Var9.setVisibility(0);
        } else {
            e1Var9.setVisibility(8);
        }
        if (o1() && ((call = this.f42217a1) == null || (groupCall = call.call) == null || !groupCall.creator)) {
            z12 = false;
        }
        u0Var.I(4, z12);
        if (r1() && !this.f42217a1.isScheduled()) {
            i12 = 8;
        } else {
            i12 = 0;
        }
        this.f42278p1.setVisibility(i12);
        int visibility = e1Var6.getVisibility();
        TextView textView = this.A1;
        if (visibility != 0 && e1Var9.getVisibility() != 0 && e1Var.getVisibility() != 0 && e1Var8.getVisibility() != 0 && e1Var7.getVisibility() != 0 && e1Var5.getVisibility() != 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        org.telegram.ui.Cells.k kVar = this.f42258k0;
        if (((sharedInstance != null && VoIPService.getSharedInstance().hasFewPeers) || this.f42221b1) && !r1() && this.A0 != null) {
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
        if (chat5 != null && !ChatObject.isChannelOrGiga(chat5) && r1() && e1Var.getVisibility() == 8) {
            u0Var.setVisibility(8);
        } else {
            u0Var.setVisibility(0);
        }
        LinearLayout linearLayout = this.f42255j1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        float f7 = 96;
        if (layoutParams.rightMargin != AndroidUtilities.dp(f7)) {
            layoutParams.rightMargin = AndroidUtilities.dp(f7);
            linearLayout.requestLayout();
        }
        ((FrameLayout.LayoutParams) this.f42322z1.getLayoutParams()).rightMargin = 0;
        this.O.setTitleRightMargin(AndroidUtilities.dp(48.0f) * 2);
    }

    public final void K1(int r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.u50.K1(int, boolean):void");
    }

    public final void L1() {
        if (this.f42217a1 == null) {
            return;
        }
        int currentTime = this.d.getConnectionsManager().getCurrentTime();
        ChatObject.Call call = this.f42217a1;
        int i10 = currentTime - call.call.record_start_date;
        boolean z10 = call.recording;
        org.telegram.ui.ActionBar.e1 e1Var = this.f42292s1;
        if (z10) {
            e1Var.setSubtext(AndroidUtilities.formatDuration(i10, false));
        } else {
            e1Var.setSubtext(null);
        }
    }

    public final void M1(boolean z10) {
        float interpolation;
        float f7;
        b40 b40Var = this.R;
        if ((b40Var == null || this.f42217a1 != null) && this.X0 == null) {
            this.W0 = 1.0f;
            this.V0 = 1.0f;
            if (b40Var == null) {
                return;
            }
        }
        int i10 = 4;
        if (!z10) {
            b30 b30Var = this.f42310w2;
            AndroidUtilities.cancelRunOnUIThread(b30Var);
            b30Var.run();
            ChatObject.Call call = this.f42217a1;
            z40 z40Var = this.Q;
            if (call != null && !call.isScheduled()) {
                z40Var.setVisibility(0);
            } else {
                z40Var.setVisibility(4);
            }
            boolean isChannelOrGiga = ChatObject.isChannelOrGiga(this.Z0);
            org.telegram.ui.ActionBar.e1 e1Var = this.f42309w1;
            if (isChannelOrGiga) {
                e1Var.setText(LocaleController.getString(R.string.VoipChannelCancelChat));
            } else {
                e1Var.setText(LocaleController.getString(R.string.VoipGroupCancelChat));
            }
        }
        float f10 = this.V0;
        if (f10 > 0.6f) {
            interpolation = 1.05f - (org.telegram.ui.Components.zr.f33337f.getInterpolation((f10 - 0.6f) / 0.4f) * 0.05f);
            this.W0 = 1.0f;
            f7 = 1.0f;
        } else {
            org.telegram.ui.Components.zr zrVar = org.telegram.ui.Components.zr.f33337f;
            this.W0 = zrVar.getInterpolation(f10 / 0.6f);
            interpolation = 1.05f * zrVar.getInterpolation(this.V0 / 0.6f);
            f7 = this.V0 / 0.6f;
        }
        I1(true);
        float f11 = 1.0f - f7;
        b40Var.setAlpha(f11);
        this.U.setAlpha(f7);
        this.W.setAlpha(f7);
        y40 y40Var = this.V;
        y40Var.setAlpha(f7);
        y40Var.setScaleX(interpolation);
        y40Var.setScaleY(interpolation);
        z30 z30Var = this.T;
        z30Var.setScaleX(f11);
        z30Var.setScaleY(f11);
        z30Var.setAlpha(f11);
        this.S.setAlpha(f11);
        this.f42259k1.setAlpha(f7);
        if (f11 != 0.0f) {
            i10 = 0;
        }
        if (i10 != b40Var.getVisibility()) {
            b40Var.setVisibility(i10);
            z30Var.setVisibility(i10);
        }
    }

    public final void N1(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        org.telegram.ui.Components.voip.t2 t2Var = this.f42285r;
        if (t2Var != null && t2Var.getVisibility() == 0) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            x20 x20Var = this.e;
            boolean z14 = false;
            if (sharedInstance != null && !r1()) {
                lh.a aVar = (lh.a) x20Var.f16146c.get(t2Var);
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
                h1();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.isBluetoothHeadsetConnected()) {
                    i10 = R.drawable.filled_calls_bluetooth_s;
                } else {
                    i10 = R.drawable.filled_sound_on;
                }
                if (this.f42216a0 != i10) {
                    this.f42216a0 = i10;
                    AndroidUtilities.updateImageViewImageAnimated(this.f42220b0, i10);
                }
                org.telegram.ui.Components.voip.t2 t2Var2 = this.h;
                if (t2Var2.getVisibility() == 0) {
                    t2Var2.c(0, -1, 0, 1.0f, true, f1(h1()), false, z10);
                    if (h1() != 1) {
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
            lh.a aVar2 = (lh.a) x20Var.f16146c.get(t2Var);
            if (aVar2 != null) {
                aVar2.d.a(z11, z10);
                t2Var.setEnabled(z11);
            }
            t2Var.b(true, false);
        }
    }

    public final void O0(boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.u50.O0(boolean):void");
    }

    public final void O1(boolean r36, boolean r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.u50.O1(boolean, boolean):void");
    }

    public final int P0() {
        z40 z40Var = this.Q;
        int childCount = z40Var.getChildCount();
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = z40Var.getChildAt(i11);
            if (RecyclerView.R(childAt) >= 0) {
                i10 = Math.min(i10, childAt.getTop());
            }
        }
        return i10;
    }

    public final void P1() {
        boolean z10;
        String str;
        float f7;
        float f10;
        s50 s50Var;
        TLRPC.User user;
        TLRPC.Chat chat;
        p40 p40Var = this.O;
        if (p40Var != null && this.f42217a1 != null) {
            SpannableStringBuilder spannableStringBuilder = null;
            int i10 = 0;
            for (int i11 = 0; i11 < this.f42217a1.currentSpeakingPeers.m(); i11++) {
                long j10 = this.f42217a1.currentSpeakingPeers.j(i11);
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f42217a1.currentSpeakingPeers.f(j10);
                if (!groupCallParticipant.self) {
                    k30 k30Var = this.a2;
                    k30Var.getClass();
                    if (k30Var.f31696w.get(MessageObject.getPeerId(groupCallParticipant.peer)) <= 0 && this.B2.get(j10, 0) != 1) {
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
                                    spannableStringBuilder.append(UserObject.getFirstName(user), new org.telegram.ui.Components.i61(AndroidUtilities.bold()), 0);
                                } else {
                                    spannableStringBuilder.append(chat.title, new org.telegram.ui.Components.i61(AndroidUtilities.bold()), 0);
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
                p40Var.getAdditionalSubtitleTextView().k(spannableStringBuilder2);
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.ActionBar.n5 subtitleTextView = p40Var.getSubtitleTextView();
            if (r1()) {
                str = "ViewersWatching";
            } else {
                str = "Participants";
            }
            int i13 = this.f42217a1.call.participants_count;
            o50 o50Var = this.P;
            subtitleTextView.k(LocaleController.formatPluralString(str, i13 + ((o50Var.M.r1() || o50Var.L || VoIPService.getSharedInstance() == null) ? 0 : !VoIPService.getSharedInstance().isJoined()), new Object[0]));
            if (r1() && (s50Var = this.B1) != null) {
                s50Var.setWatchersCount(this.f42217a1.call.participants_count);
            }
            if (z10 != this.f42301u2) {
                this.f42301u2 = z10;
                p40Var.invalidate();
                float f11 = 0.0f;
                p40Var.getSubtitleTextView().setPivotX(0.0f);
                p40Var.getSubtitleTextView().setPivotY(p40Var.getMeasuredHeight() >> 1);
                ViewPropertyAnimator animate = p40Var.getSubtitleTextView().animate();
                if (this.f42301u2) {
                    f7 = 0.98f;
                } else {
                    f7 = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f7);
                if (this.f42301u2) {
                    f10 = 0.9f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f10);
                if (!this.f42301u2) {
                    f11 = 1.0f;
                }
                scaleY.alpha(f11).setDuration(150L);
                AndroidUtilities.updateViewVisibilityAnimated(p40Var.getAdditionalSubtitleTextView(), this.f42301u2);
            }
        }
    }

    public final boolean Q0() {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isConference()) {
            ChatObject.Call call = this.f42217a1;
            if (call != null && (groupCall = call.call) != null && groupCall.creator) {
                return true;
            }
            return false;
        }
        return ChatObject.canManageCalls(this.Z0);
    }

    public final void Q1(boolean z10) {
        ChatObject.Call call = this.f42217a1;
        c30 c30Var = this.f42234e1;
        if (call == null) {
            if (ChatObject.isChannelOrGiga(this.Z0)) {
                c30Var.b(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), z10);
                return;
            } else {
                c30Var.b(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), z10);
                return;
            }
        }
        boolean isEmpty = TextUtils.isEmpty(call.call.title);
        p40 p40Var = this.O;
        if (!isEmpty) {
            if (!this.f42217a1.call.title.equals(p40Var.getTitle())) {
                if (z10) {
                    this.O.I(this.f42217a1.call.title, true, 180L, null);
                    p40Var.getTitleTextView().setOnClickListener(new d20(this, 8));
                } else {
                    p40Var.setTitle(this.f42217a1.call.title);
                }
                c30Var.b(this.f42217a1.call.title, z10);
            }
        } else {
            TLRPC.Chat chat = this.Z0;
            if (chat != null && !chat.title.equals(p40Var.getTitle())) {
                if (z10) {
                    this.O.I(this.Z0.title, true, 180L, null);
                    p40Var.getTitleTextView().setOnClickListener(new d20(this, 9));
                } else {
                    p40Var.setTitle(this.Z0.title);
                }
                if (ChatObject.isChannelOrGiga(this.Z0)) {
                    if (r1()) {
                        c30Var.b(this.Z0.title, z10);
                    } else {
                        c30Var.b(LocaleController.getString(R.string.VoipChannelVoiceChat), z10);
                    }
                } else {
                    c30Var.b(LocaleController.getString(R.string.VoipGroupVoiceChat), z10);
                }
            } else if (this.Z0 == null) {
                p40Var.setTitle(LocaleController.getString(R.string.ConferenceChat));
                c30Var.b(LocaleController.getString(R.string.ConferenceChat), z10);
            }
        }
        org.telegram.ui.ActionBar.n5 titleTextView = p40Var.getTitleTextView();
        if (this.f42217a1.recording) {
            if (titleTextView.getRightDrawable() == null) {
                titleTextView.i(new q50(titleTextView));
                TextView textView = c30Var.getTextView();
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new q50(textView), (Drawable) null);
                TextView nextTextView = c30Var.getNextTextView();
                nextTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new q50(nextTextView), (Drawable) null);
            }
        } else if (titleTextView.getRightDrawable() != null) {
            titleTextView.i(null);
            c30Var.getTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            c30Var.getNextTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public final void R0() {
        if (this.R1) {
            this.R1 = false;
            AndroidUtilities.cancelRunOnUIThread(this.f42320y2);
        }
        if (this.S1) {
            this.S1 = false;
            MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
            this.f42307w.onTouchEvent(obtain);
            obtain.recycle();
        }
    }

    public final void R1() {
        float f7;
        org.telegram.ui.Components.sb sbVar;
        boolean z10;
        if (this.topBulletinContainer != null) {
            int dp = AndroidUtilities.dp(74.0f);
            float f10 = this.f42318y0 - dp;
            if (this.backgroundPaddingTop + f10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                int dp2 = (dp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f);
                f7 = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f10) - this.backgroundPaddingTop) / dp2);
                f10 -= (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp2) * f7);
            } else {
                f7 = 0.0f;
            }
            float paddingTop = f10 + this.containerView.getPaddingTop();
            FrameLayout frameLayout = this.topBulletinContainer;
            p40 p40Var = this.O;
            frameLayout.setTranslationY(AndroidUtilities.lerp(((-frameLayout.getTop()) - this.topBulletinContainer.getHeight()) + paddingTop + AndroidUtilities.dp(10.0f), p40Var.getY() + (-this.topBulletinContainer.getTop()) + p40Var.getHeight(), f7));
            org.telegram.ui.Components.oc ocVar = org.telegram.ui.Components.oc.f29196w;
            if (ocVar != null && (sbVar = ocVar.e) != null && sbVar.getParent() != null && sbVar.getParent().getParent() == this.topBulletinContainer) {
                if (f7 > 0.5f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                sbVar.setTop(z10);
            }
        }
    }

    public final void S0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.u50.S0():void");
    }

    public final void T0() {
        this.F.setTranslationY((-this.C1.d()) + this.containerView.getPaddingBottom());
        this.G.invalidate();
        Z0();
        Y0();
        W0();
        X0();
        a1();
        this.e.setAlpha(1.0f - this.f42324z3.e);
        U0();
        V0();
    }

    public final void U0() {
        int i10;
        float f7 = this.C1.f45152b.f17470a;
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        v30 v30Var = this.F;
        v30Var.setAlpha(f7);
        u30 u30Var = this.G;
        u30Var.setAlpha(f7);
        if (v30Var.getVisibility() != i10) {
            v30Var.setVisibility(i10);
            u30Var.setVisibility(i10);
            if (i10 == 8) {
                s30 s30Var = this.H;
                if (s30Var.isFocused()) {
                    s30Var.clearFocus();
                }
            }
        }
    }

    public final void V0() {
        int i10;
        org.telegram.ui.Components.fl0 fl0Var = this.K;
        if (fl0Var != null) {
            float f7 = this.C1.f45152b.f17470a * this.A3.e;
            fl0Var.setAlpha(f7);
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
            org.telegram.ui.Components.fl0 fl0Var2 = this.K;
            if (!fl0Var2.N0 && f7 == 1.0f) {
                fl0Var2.N0 = true;
            }
        }
    }

    public final void W0() {
        boolean z10 = G3;
        x20 x20Var = this.e;
        if (z10) {
            x20Var.setTranslationX(0.0f);
            x20Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = F3;
        ne.b bVar = this.f42324z3;
        if (z11) {
            x20Var.setTranslationX(bVar.e * AndroidUtilities.dp(94.0f));
            x20Var.setTranslationY(0.0f);
            return;
        }
        x20Var.setTranslationX(0.0f);
        x20Var.setTranslationY(bVar.e * AndroidUtilities.dp(94.0f));
    }

    public final void X0() {
        boolean z10 = G3;
        g30 g30Var = this.f42266m2;
        if (z10) {
            g30Var.setTranslationX(0.0f);
            g30Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = F3;
        ne.b bVar = this.f42324z3;
        if (z11) {
            g30Var.setTranslationX(bVar.e * AndroidUtilities.dp(94.0f));
            g30Var.setTranslationY(0.0f);
            return;
        }
        g30Var.setTranslationX(0.0f);
        g30Var.setTranslationY(bVar.e * AndroidUtilities.dp(94.0f));
    }

    public final void Y0() {
        float dp;
        float f7 = this.B3.e;
        qh.i iVar = this.C1;
        float f10 = -((iVar.d() - this.containerView.getPaddingBottom()) + f7 + (AndroidUtilities.dp(68.0f) * this.A3.e) + AndroidUtilities.dp(10.0f));
        if (G3) {
            dp = (1.0f - this.C3.e) * AndroidUtilities.dp(-91.0f);
        } else if (F3) {
            dp = 0.0f;
        } else {
            dp = ((this.f42324z3.e * AndroidUtilities.dp(94.0f)) - (AndroidUtilities.dp(104.0f) * this.a2.f31672c)) - AndroidUtilities.dp(91.0f);
        }
        float lerp = AndroidUtilities.lerp(dp, f10, iVar.f45152b.f17470a);
        float measuredHeight = ((this.containerView.getMeasuredHeight() - this.f42318y0) + lerp) - this.backgroundPaddingTop;
        float max = Math.max((measuredHeight / 3.0f) * 2.0f, measuredHeight - AndroidUtilities.dp(250.0f));
        mh.h hVar = this.f42225c0;
        hVar.setTranslationY(lerp);
        hVar.setVisibleHeight((int) max);
    }

    public final void Z0() {
        if (this.K != null) {
            this.K.setTranslationY((-this.C1.d()) + this.containerView.getPaddingBottom() + ((-this.A3.e) * AndroidUtilities.dp(64.0f)));
        }
    }

    public final void a1() {
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

    public final void b1() {
        org.telegram.ui.Components.voip.t tVar = this.Z2;
        if (tVar != null) {
            tVar.f31863a.setRoundCorners(AndroidUtilities.dp(8.0f));
            org.telegram.ui.Components.voip.t tVar2 = this.Z2;
            tVar2.h = false;
            tVar2.j(false);
            this.Z2.invalidate();
            this.a2.invalidate();
        }
        org.telegram.ui.Cells.d4 d4Var = this.X2;
        if (d4Var != null && !this.f42223b3 && d4Var.getParent() != null) {
            this.containerView.removeView(this.X2);
        }
        org.telegram.ui.Cells.d4 d4Var2 = this.X2;
        if (d4Var2 != null) {
            d4Var2.setProgressToAvatarPreview(0.0f);
            this.X2.setAboutVisible(false);
            this.X2.getAvatarImageView().setAlpha(1.0f);
        }
        org.telegram.ui.Components.x20 x20Var = this.f42218a3;
        if (x20Var != null) {
            x20Var.getAvatarImageView().setAlpha(1.0f);
        }
        this.X2 = null;
        this.Y2 = null;
        this.f42218a3 = null;
        this.Z2 = null;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final boolean canDismissWithTouchOutside() {
        return !this.a2.f31670b;
    }

    public final void d1(boolean z10) {
        if (!this.f42228c3 && this.f42240f2) {
            if (z10) {
                this.f42228c3 = true;
                y1(false, this.X2);
                return;
            }
            b1();
            this.containerView.removeView(this.f42235e2);
            this.f42235e2 = null;
            this.C2.setVisibility(8);
            this.containerView.invalidate();
            this.f42240f2 = false;
            this.Y.X = true;
            this.Q.invalidate();
            this.f42222b2.setVisibility(8);
            if (this.f42291s0) {
                this.f42291s0 = false;
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
        z40 z40Var = this.Q;
        int i19 = 0;
        if (i10 == i18) {
            Long l4 = (Long) objArr[1];
            ChatObject.Call call = this.f42217a1;
            if (call != null && call.call.f20354id == l4.longValue()) {
                ChatObject.Call call2 = this.f42217a1;
                if (call2.call instanceof TLRPC.TL_groupCallDiscarded) {
                    dismiss();
                    return;
                }
                int i20 = (this.f42295t0 > 0L ? 1 : (this.f42295t0 == 0L ? 0 : -1));
                AccountInstance accountInstance = this.d;
                if (i20 == 0 && (((i17 = this.F1) == 7 || i17 == 5 || i17 == 6) && !call2.isScheduled())) {
                    try {
                        Intent intent = new Intent(this.f42250i0, VoIPService.class);
                        intent.putExtra("chat_id", i1());
                        intent.putExtra("createGroupCall", false);
                        intent.putExtra("hasFewPeers", this.f42221b1);
                        intent.putExtra("peerChannelId", this.Y0.channel_id);
                        intent.putExtra("peerChatId", this.Y0.chat_id);
                        intent.putExtra("peerUserId", this.Y0.user_id);
                        intent.putExtra("hash", this.f42226c1);
                        intent.putExtra("peerAccessHash", this.Y0.access_hash);
                        intent.putExtra("is_outgoing", true);
                        intent.putExtra("start_incall_activity", false);
                        intent.putExtra("account", accountInstance.getCurrentAccount());
                        intent.putExtra("scheduleDate", this.f42260k2);
                        this.f42250i0.startService(intent);
                    } catch (Throwable th2) {
                        FileLog.e(th2);
                    }
                    this.f42295t0 = SystemClock.elapsedRealtime();
                    AndroidUtilities.runOnUIThread(new f20(this, 2), 3000L);
                }
                if (!this.f42299u0 && VoIPService.getSharedInstance() != null) {
                    this.f42217a1.addSelfDummyParticipant(false);
                    l1();
                    VoIPService.getSharedInstance().playConnectedSound();
                }
                J1();
                int childCount = z40Var.getChildCount();
                for (int i21 = 0; i21 < childCount; i21++) {
                    View childAt = z40Var.getChildAt(i21);
                    if (childAt instanceof org.telegram.ui.Cells.d4) {
                        ((org.telegram.ui.Cells.d4) childAt).a(true, false);
                    }
                }
                if (this.X2 != null) {
                    this.f42291s0 = true;
                } else {
                    O0(true);
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
                    k1().j(38, 0L, null);
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().playAllowTalkSound();
                    }
                }
                if (objArr.length >= 4) {
                    Long l10 = (Long) objArr[3];
                    long longValue = l10.longValue();
                    if (longValue != 0 && !r1()) {
                        if (!o1() || (sharedInstance = VoIPService.getSharedInstance()) == null || longValue != sharedInstance.convertingFromCallWithUserId) {
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
                                        if (dialog.f20348id == longValue) {
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
                                    if (this.f42217a1.call.participants_count < 250 || UserObject.isContact(user) || user.verified || i19 != 0) {
                                        k1().k(0L, 44, user, this.Z0, null, null);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(-longValue));
                            if (chat != null) {
                                if (this.f42217a1.call.participants_count < 250 || !ChatObject.isNotInChat(chat) || chat.verified || i19 != 0) {
                                    k1().k(0L, 44, chat, this.Z0, null, null);
                                }
                            }
                        }
                    }
                }
            }
        } else if (i10 == NotificationCenter.groupCallSpeakingUsersUpdated) {
            k30 k30Var = this.a2;
            if (k30Var.f31670b && this.f42217a1 != null) {
                boolean c10 = k30Var.c();
                ChatObject.Call call3 = this.f42217a1;
                if (call3 != null && k30Var.f31670b && (videoParticipant = k30Var.e) != null && call3.participants.f(MessageObject.getPeerId(videoParticipant.participant.peer)) == null) {
                    c10 = true;
                }
                if (c10) {
                    ChatObject.VideoParticipant videoParticipant2 = null;
                    int i23 = 0;
                    while (true) {
                        ArrayList arrayList = this.f42281q0;
                        if (i23 >= arrayList.size()) {
                            break;
                        }
                        ChatObject.VideoParticipant videoParticipant3 = (ChatObject.VideoParticipant) arrayList.get(i23);
                        if (this.f42217a1.currentSpeakingPeers.g(null, MessageObject.getPeerId(videoParticipant3.participant.peer)) != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            TLRPC.GroupCallParticipant groupCallParticipant3 = videoParticipant3.participant;
                            if (!groupCallParticipant3.muted_by_you && k30Var.d != MessageObject.getPeerId(groupCallParticipant3.peer)) {
                                videoParticipant2 = videoParticipant3;
                            }
                        }
                        i23++;
                    }
                    if (videoParticipant2 != null) {
                        e1(videoParticipant2);
                    }
                }
            }
            k30Var.setVisibleParticipant(true);
            P1();
        } else if (i10 == NotificationCenter.webRtcMicAmplitudeEvent) {
            C1(((Float) objArr[0]).floatValue());
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
                AlertDialog$Builder M = org.telegram.ui.Components.d5.M(getContext(), LocaleController.getString(R.string.VoipGroupVoiceChat), string);
                M.j(new j20(this, 1));
                try {
                    M.p();
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
            if (chatFull.f20345id == i1()) {
                J1();
                O1(isShowing(), false);
            }
            long peerId = MessageObject.getPeerId(this.A0);
            ChatObject.Call call4 = this.f42217a1;
            if (call4 != null && chatFull.f20345id == (-peerId) && (groupCallParticipant2 = (TLRPC.GroupCallParticipant) call4.participants.f(peerId)) != null) {
                groupCallParticipant2.about = chatFull.about;
                O0(true);
                AndroidUtilities.updateVisibleRows(z40Var);
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
                            e1Var.j(string2, i15, null);
                        }
                        i19++;
                    }
                }
            }
        } else if (i10 == NotificationCenter.didLoadChatAdmins) {
            if (((Long) objArr[0]).longValue() == i1()) {
                J1();
                O1(isShowing(), false);
            }
        } else if (i10 == NotificationCenter.applyGroupCallVisibleParticipants) {
            int childCount2 = z40Var.getChildCount();
            long longValue2 = ((Long) objArr[0]).longValue();
            while (i19 < childCount2) {
                s4.b1 G = z40Var.G(z40Var.getChildAt(i19));
                if (G != null) {
                    View view = G.f46342a;
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
            if (this.f42217a1 != null && peerId2 == l11.longValue() && (groupCallParticipant = (TLRPC.GroupCallParticipant) this.f42217a1.participants.f(peerId2)) != null) {
                groupCallParticipant.about = ((TLRPC.UserFull) objArr[1]).about;
                O0(true);
                AndroidUtilities.updateVisibleRows(z40Var);
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
                            e1Var2.j(string3, i13, null);
                        }
                        i19++;
                    }
                }
            }
        } else if (i10 == NotificationCenter.mainUserInfoChanged) {
            O0(true);
            AndroidUtilities.updateVisibleRows(z40Var);
        } else if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0) {
                O0(true);
            }
            if ((MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0 || (intValue & MessagesController.UPDATE_MASK_EMOJI_STATUS) != 0) {
                AndroidUtilities.updateVisibleRows(z40Var);
            }
        } else if (i10 == NotificationCenter.groupCallScreencastStateChanged) {
            e40 e40Var = this.f42321z0;
            if (e40Var != null) {
                e40Var.b(true, true);
            }
            J1();
        } else if (i10 == NotificationCenter.conferenceEmojiUpdated) {
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            f50 f50Var = this.f42277p0;
            if (sharedInstance2 != null && (conferenceCall = sharedInstance2.conference) != null) {
                strArr = conferenceCall.getEmojis();
            }
            f50Var.b(strArr);
        }
    }

    @Override
    public final void dismiss() {
        LaunchActivity launchActivity = this.f42250i0;
        launchActivity.f33462b1.remove(this.f42305v2);
        this.f42250i0.setRequestedOrientation(-1);
        E3 = false;
        org.telegram.ui.Components.y30 y30Var = this.E1;
        if (y30Var != null) {
            y30Var.dismiss();
        }
        this.f42291s0 = true;
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
        k30 k30Var = this.a2;
        if (k30Var != null) {
            if (this.f42283q2 != null) {
                this.Q.getViewTreeObserver().removeOnPreDrawListener(this.f42283q2);
                this.f42283q2 = null;
            }
            ArrayList arrayList = this.Z1;
            arrayList.clear();
            ArrayList arrayList2 = this.Y1;
            arrayList.addAll(arrayList2);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).f();
                k30Var.removeView((View) arrayList.get(i10));
                ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).e();
                ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).b(true);
            }
            arrayList2.clear();
            if (k30Var.getParent() != null) {
                arrayList2.clear();
                this.containerView.removeView(k30Var);
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
        org.telegram.ui.Components.g30.j(getContext());
        ChatObject.Call call = this.f42217a1;
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
        if (this.f42250i0 == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0 && ((keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25) && VoIPService.getSharedInstance() != null && Build.VERSION.SDK_INT >= 32)) {
            boolean isSpeakerMuted = WebRtcAudioTrack.isSpeakerMuted();
            AudioManager audioManager = (AudioManager) this.f42250i0.getSystemService("audio");
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
            this.f42250i0.setRequestedOrientation(-1);
        }
        if (VoIPService.getSharedInstance() != null) {
            k30 k30Var = this.a2;
            if (k30Var.f31689r != null) {
                return;
            }
            boolean z10 = G3;
            z40 z40Var = this.Q;
            int i10 = 0;
            if (z10) {
                if (this.f42283q2 != null) {
                    z40Var.getViewTreeObserver().removeOnPreDrawListener(this.f42283q2);
                    this.f42283q2 = null;
                }
                ArrayList arrayList = new ArrayList();
                a60 a60Var = this.f42275o2;
                ArrayList arrayList2 = this.Y1;
                ArrayList arrayList3 = this.Z1;
                if (videoParticipant == null) {
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) arrayList3.get(i11);
                        org.telegram.ui.Components.voip.l lVar = tVar.f31867c;
                        if (lVar != null) {
                            lVar.setRenderer(null);
                            org.telegram.ui.Components.x20 x20Var = tVar.d;
                            if (x20Var != null) {
                                x20Var.setRenderer(null);
                            }
                            org.telegram.ui.Components.voip.l lVar2 = tVar.e;
                            if (lVar2 != null) {
                                lVar2.setRenderer(null);
                            }
                            arrayList.add(tVar.f31891w);
                            tVar.b(false);
                            tVar.animate().alpha(0.0f).setListener(new f40(this, tVar));
                        }
                    }
                    this.P2 = false;
                    a60Var.H(this.f42271n2, true, true);
                } else {
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) arrayList3.get(i12);
                        if (tVar2.e != null && ((videoParticipant2 = tVar2.f31891w) == null || !videoParticipant2.equals(videoParticipant))) {
                            arrayList.add(tVar2.f31891w);
                            tVar2.b(false);
                            org.telegram.ui.Components.x20 x20Var2 = tVar2.d;
                            if (x20Var2 != null) {
                                x20Var2.setRenderer(null);
                            }
                            org.telegram.ui.Components.voip.l lVar3 = tVar2.f31867c;
                            if (lVar3 != null) {
                                lVar3.setRenderer(null);
                            }
                            tVar2.animate().alpha(0.0f).setListener(new g40(this, tVar2));
                        }
                    }
                    this.P2 = true;
                    a60Var.f35600r = false;
                    if (!arrayList.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new ot(20, this, arrayList));
                    }
                }
                ViewTreeObserver viewTreeObserver = z40Var.getViewTreeObserver();
                i40 i40Var = new i40(this, videoParticipant, !k30Var.f31670b);
                this.f42283q2 = i40Var;
                viewTreeObserver.addOnPreDrawListener(i40Var);
                return;
            }
            if (this.f42283q2 != null) {
                z40Var.getViewTreeObserver().removeOnPreDrawListener(this.f42283q2);
                this.f42283q2 = null;
            }
            if (videoParticipant != null) {
                g30 g30Var = this.f42266m2;
                if (g30Var.getVisibility() != 0) {
                    g30Var.setVisibility(0);
                    org.telegram.ui.Components.y20 y20Var = this.f42279p2;
                    y20Var.G(g30Var, false);
                    this.f42291s0 = true;
                    if (!k30Var.f31670b) {
                        ArrayList arrayList4 = y20Var.e;
                        s4.b0 b0Var = (s4.b0) g30Var.getLayoutManager();
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
                    ViewTreeObserver viewTreeObserver2 = z40Var.getViewTreeObserver();
                    j40 j40Var = new j40(this, videoParticipant);
                    this.f42283q2 = j40Var;
                    viewTreeObserver2.addOnPreDrawListener(j40Var);
                    return;
                }
                k30Var.j(videoParticipant);
                AndroidUtilities.updateVisibleRows(g30Var);
            } else if (z40Var.getVisibility() != 0) {
                z40Var.setVisibility(0);
                O0(false);
                this.f42291s0 = true;
                ViewTreeObserver viewTreeObserver3 = z40Var.getViewTreeObserver();
                k40 k40Var = new k40(this);
                this.f42283q2 = k40Var;
                viewTreeObserver3.addOnPreDrawListener(k40Var);
            } else {
                ViewTreeObserver viewTreeObserver4 = z40Var.getViewTreeObserver();
                l40 l40Var = new l40(this);
                this.f42283q2 = l40Var;
                viewTreeObserver4.addOnPreDrawListener(l40Var);
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    public final int h1() {
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

    public final long i1() {
        TLRPC.Chat chat = this.Z0;
        if (chat == null) {
            return 0L;
        }
        return chat.f20344id;
    }

    public final void j1(boolean z10) {
        boolean z11;
        String str;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        AccountInstance accountInstance = this.d;
        TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(i1()));
        if (chat != null && !ChatObject.isPublic(chat)) {
            TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(i1());
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
            u1(null, str, true, z10);
        } else if (this.f42217a1 != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                exportgroupcallinvite.call = this.f42217a1.getInputGroupCall();
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
        if (!G3) {
            k30 k30Var = this.a2;
            if (k30Var.f31670b) {
                return k30Var.getUndoView();
            }
        }
        UndoView[] undoViewArr = this.f42254j0;
        if (undoViewArr[0].getVisibility() == 0) {
            UndoView undoView = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView;
            undoView.d(2, true);
            this.containerView.removeView(undoViewArr[0]);
            this.containerView.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final void l1() {
        VoIPService sharedInstance;
        int i10;
        if (!this.f42299u0 && (sharedInstance = VoIPService.getSharedInstance()) != null) {
            this.f42299u0 = true;
            this.D0.addAll(this.f42217a1.visibleParticipants);
            this.E0.addAll(this.f42281q0);
            this.F0.addAll(this.f42217a1.invitedUsers);
            this.G0.addAll(this.f42217a1.shadyJoinParticipants);
            this.H0.addAll(this.f42217a1.shadyLeftParticipants);
            this.T1 = sharedInstance.getCallState();
            if (this.f42217a1 == null) {
                ChatObject.Call call = sharedInstance.groupCall;
                this.f42217a1 = call;
                this.f42279p2.f32789c = call;
                this.a2.setGroupCall(call);
                this.f42275o2.f35597c = this.f42217a1;
            }
            mh.h hVar = this.f42225c0;
            if (hVar != null) {
                hVar.C0(this.d.getCurrentAccount(), this.f42217a1.getInputGroupCall(false));
            }
            this.O.setTitleRightMargin(AndroidUtilities.dp(48.0f) * 2);
            this.f42217a1.saveActiveDates();
            VoIPService.getSharedInstance().registerStateListener(this);
            y40 y40Var = this.V;
            if (y40Var != null && y40Var.getVisibility() == 0) {
                this.f42290s.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Dg, false), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, true);
                N1(true);
                if (ChatObject.isChannelOrGiga(this.Z0)) {
                    i10 = R.string.VoipChannelEndChat;
                } else {
                    i10 = R.string.VoipGroupEndChat;
                }
                this.f42309w1.setText(LocaleController.getString(i10));
                z40 z40Var = this.Q;
                z40Var.setVisibility(0);
                org.telegram.ui.ActionBar.u0 u0Var = this.l1;
                u0Var.setVisibility(0);
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(z40Var, property, 0.0f, 1.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(z40Var, View.TRANSLATION_Y, AndroidUtilities.dp(200.0f), 0.0f);
                Property property2 = View.SCALE_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(y40Var, property2, 0.0f);
                Property property3 = View.SCALE_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(y40Var, property3, 0.0f);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(y40Var, property, 0.0f);
                org.telegram.ui.ActionBar.n5 n5Var = this.U;
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(n5Var, property2, 0.0f);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(n5Var, property3, 0.0f);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(n5Var, property, 0.0f);
                org.telegram.ui.ActionBar.n5 n5Var2 = this.W;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(n5Var2, property2, 0.0f), ObjectAnimator.ofFloat(n5Var2, property3, 0.0f), ObjectAnimator.ofFloat(n5Var2, property, 0.0f), ObjectAnimator.ofFloat(u0Var, property2, 0.0f, 1.0f), ObjectAnimator.ofFloat(u0Var, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(u0Var, property, 0.0f, 1.0f));
                animatorSet.setInterpolator(org.telegram.ui.Components.zr.f33338g);
                animatorSet.addListener(new m40(this, 0));
                animatorSet.setDuration(300L);
                animatorSet.start();
            }
        }
    }

    public final void m1(final long j10, final boolean z10) {
        if (this.f42217a1 != null) {
            AccountInstance accountInstance = this.d;
            final TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(j10));
            if (user != null) {
                final org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(getContext(), 3, null)};
                final TL_phone.inviteToGroupCall invitetogroupcall = new TL_phone.inviteToGroupCall();
                invitetogroupcall.call = this.f42217a1.getInputGroupCall();
                TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                tL_inputUser.user_id = user.f20491id;
                tL_inputUser.access_hash = user.access_hash;
                invitetogroupcall.users.add(tL_inputUser);
                int sendRequest = accountInstance.getConnectionsManager().sendRequest(invitetogroupcall, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        u50 u50Var = u50.this;
                        long j11 = j10;
                        org.telegram.ui.ActionBar.c2[] c2VarArr2 = c2VarArr;
                        if (tLObject != null) {
                            u50Var.d.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                            AndroidUtilities.runOnUIThread(new ai.c3(u50Var, j11, c2VarArr2, user, 20));
                            return;
                        }
                        AndroidUtilities.runOnUIThread(new ai.m(u50Var, c2VarArr2, z10, tL_error, j11, invitetogroupcall));
                    }
                });
                if (sendRequest != 0) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.b41(this, c2VarArr, sendRequest, 3), 500L);
                }
            }
        }
    }

    public final boolean n1() {
        float f7;
        int dp = AndroidUtilities.dp(74.0f);
        float f10 = this.f42318y0 - dp;
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
    public final void o(int i10, float f7, float f10, ne.e eVar) {
        if (i10 == 2) {
            Y0();
            W0();
            X0();
            float f11 = 1.0f - this.f42324z3.e;
            x20 x20Var = this.e;
            x20Var.setAlpha(f11);
            this.a2.setProgressToHideUi(f7);
            this.f42266m2.invalidate();
            this.containerView.invalidate();
            x20Var.invalidate();
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
            this.G.invalidate();
            this.H.invalidate();
        }
        if (i10 == 5) {
            Y0();
            this.containerView.invalidate();
        }
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
        N1(true);
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            C1(0.0f);
        }
        z40 z40Var = this.Q;
        if (z40Var.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(z40Var);
        }
        g30 g30Var = this.f42266m2;
        if (g30Var.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(g30Var);
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
        e40 e40Var = this.f42321z0;
        if (e40Var != null) {
            e40Var.b(false, false);
        } else if (this.f42240f2) {
            d1(true);
        } else if (this.a2.f31670b) {
            e1(null);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.t0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
        ArrayList arrayList = this.Z1;
        arrayList.clear();
        arrayList.addAll(this.Y1);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).j(true);
        }
        e40 e40Var = this.f42321z0;
        if (e40Var != null && VoIPService.getSharedInstance() != null) {
            e40Var.h.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LaunchActivity launchActivity = this.f42250i0;
        launchActivity.f33462b1.add(this.f42305v2);
    }

    @Override
    public final boolean onCustomOpenAnimation() {
        E3 = true;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        org.telegram.ui.Components.g30.j(getContext());
        return super.onCustomOpenAnimation();
    }

    @Override
    public final void onMediaStateUpdated(int i10, int i11) {
        org.telegram.messenger.voip.t0.d(this, i10, i11);
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.t0.e(this, z10);
    }

    @Override
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.messenger.voip.t0.f(this, i10);
    }

    @Override
    public final void onStateChanged(int i10) {
        this.T1 = i10;
        O1(isShowing(), false);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            RadialProgressView radialProgressView = this.f42233e0;
            if (radialProgressView != null) {
                radialProgressView.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Og, false));
            }
            org.telegram.ui.ActionBar.u0 u0Var = this.f42259k1;
            if (u0Var != null) {
                int i10 = org.telegram.ui.ActionBar.k6.f21263hg;
                u0Var.G(org.telegram.ui.ActionBar.k6.x0(null, i10, false), false);
                u0Var.G(org.telegram.ui.ActionBar.k6.x0(null, i10, false), true);
                u0Var.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21210eg, false));
            }
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21263hg, false);
            F1(this.f42314x1, x02);
            F1(this.f42319y1, x02);
            F1(this.f42278p1, x02);
            F1(this.f42282q1, x02);
            F1(this.f42309w1, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21527vg, false));
            F1(this.f42270n1, x02);
            F1(this.f42274o1, x02);
            F1(this.f42287r1, x02);
            F1(this.f42292s1, x02);
            F1(this.f42296t1, x02);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.t0.h(this, z10);
    }

    public final boolean q1() {
        if (!r1() || this.f42217a1.visibleVideoParticipants.isEmpty() || (this.f42217a1.visibleVideoParticipants.get(0).aspectRatio != 0.0f && this.f42217a1.visibleVideoParticipants.get(0).aspectRatio < 1.0f)) {
            return false;
        }
        return true;
    }

    public final boolean r1() {
        ChatObject.Call call = this.f42217a1;
        if (call != null && call.call.rtmp_stream) {
            return true;
        }
        return false;
    }

    public final void s1(org.telegram.ui.ActionBar.h3 h3Var, org.telegram.ui.ActionBar.c2 c2Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
        long j10;
        if (!this.f42308w0) {
            org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f42250i0.O().getFragmentStack().get(this.f42250i0.O().getFragmentStack().size() - 1);
            if (o2Var instanceof sn) {
                boolean U9 = ((sn) o2Var).U9();
                this.f42308w0 = true;
                this.f42313x0 = true;
                ai.x9 x9Var = new ai.x9(h3Var, editTextBoldCursor, z10, c2Var, 21);
                if (U9) {
                    j10 = 200;
                } else {
                    j10 = 0;
                }
                AndroidUtilities.runOnUIThread(x9Var, j10);
                return;
            }
            this.f42308w0 = true;
            this.f42313x0 = true;
            if (h3Var != null) {
                h3Var.setFocusable(true);
            } else if (c2Var != null) {
                c2Var.l(true);
            }
            if (z10) {
                AndroidUtilities.runOnUIThread(new ah(editTextBoldCursor, 2), 100L);
            }
        }
    }

    @Override
    public final void show() {
        super.show();
        if (org.telegram.ui.Components.voip.h1.f31596d0.V) {
            org.telegram.ui.Components.voip.h1.j();
        }
    }

    public final void u1(java.lang.String r11, java.lang.String r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.u50.u1(java.lang.String, java.lang.String, boolean, boolean):void");
    }

    public final void v1() {
        ChatObject.Call call = this.f42217a1;
        if (call != null && call.call != null) {
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(getContext(), 3, null);
            c2Var.r(300L);
            TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
            exportgroupcallinvite.call = tL_inputGroupCall;
            TLRPC.GroupCall groupCall = this.f42217a1.call;
            tL_inputGroupCall.f20361id = groupCall.f20354id;
            tL_inputGroupCall.access_hash = groupCall.access_hash;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(exportgroupcallinvite, new ca(this, c2Var, exportgroupcallinvite, 12));
        }
    }

    public final void x1(TLRPC.GroupCallParticipant groupCallParticipant, final long j10, int i10) {
        TLObject chat;
        int i11;
        int i12;
        ?? r16;
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
        float f7;
        int i26;
        int i27;
        int i28;
        int i29;
        int dp;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            int i30 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            AccountInstance accountInstance = this.d;
            if (i30 > 0) {
                chat = accountInstance.getMessagesController().getUser(Long.valueOf(j10));
            } else {
                chat = accountInstance.getMessagesController().getChat(Long.valueOf(-j10));
            }
            TLObject tLObject = chat;
            boolean z10 = true;
            if (i10 != 0 && i10 != 2 && i10 != 3) {
                if (i10 == 6) {
                    this.f42250i0.P0(this.currentAccount);
                    Bundle bundle = new Bundle();
                    if (i30 > 0) {
                        bundle.putLong("user_id", j10);
                    } else {
                        bundle.putLong("chat_id", -j10);
                    }
                    this.f42250i0.u0(new sn(bundle));
                    dismiss();
                } else if (i10 == 8) {
                    this.f42250i0.P0(this.currentAccount);
                    org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f42250i0.O().getFragmentStack().get(this.f42250i0.O().getFragmentStack().size() - 1);
                    if ((o2Var instanceof sn) && ((sn) o2Var).a() == j10) {
                        dismiss();
                        return;
                    }
                    Bundle bundle2 = new Bundle();
                    if (i30 > 0) {
                        bundle2.putLong("user_id", j10);
                    } else {
                        bundle2.putLong("chat_id", -j10);
                    }
                    this.f42250i0.u0(new sn(bundle2));
                    dismiss();
                } else if (i10 == 7) {
                    sharedInstance.editCallMember(tLObject, Boolean.TRUE, null, null, Boolean.FALSE, null);
                    K1(2, true);
                } else if (i10 == 9) {
                    org.telegram.ui.Components.c50 c50Var = this.f42248h2;
                    if (c50Var == null || !c50Var.g()) {
                        TLRPC.User currentUser = accountInstance.getUserConfig().getCurrentUser();
                        org.telegram.ui.Components.c50 c50Var2 = new org.telegram.ui.Components.c50(0, true, true);
                        this.f42248h2 = c50Var2;
                        c50Var2.H = true;
                        c50Var2.R = true;
                        c50Var2.G = true;
                        c50Var2.J = true;
                        c50Var2.S = true;
                        c50Var2.f25185a = this.f42250i0.O().getLastFragment();
                        org.telegram.ui.Components.c50 c50Var3 = this.f42248h2;
                        b50 b50Var = new b50(this, j10);
                        this.f42252i2 = b50Var;
                        c50Var3.f25186b = b50Var;
                        TLRPC.UserProfilePhoto userProfilePhoto = currentUser.photo;
                        if (userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                            z10 = false;
                        }
                        c50Var3.n(z10, new f20(this, 9), new ei.e1(5), 0);
                    }
                } else if (i10 == 10) {
                    String str5 = groupCallParticipant.about;
                    Context context = getContext();
                    int i31 = this.currentAccount;
                    Pattern pattern = org.telegram.ui.Components.d5.f25562a;
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
                    if (i30 > 0) {
                        i24 = R.string.UserBio;
                    } else {
                        i24 = R.string.DescriptionPlaceholder;
                    }
                    String string = LocaleController.getString(i24);
                    final org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder2.f20679a;
                    c2Var.R = string;
                    if (i30 > 0) {
                        i25 = R.string.VoipGroupBioEditAlertText;
                    } else {
                        i25 = R.string.DescriptionInfo;
                    }
                    c2Var.T = LocaleController.getString(i25);
                    FrameLayout frameLayout = new FrameLayout(context);
                    frameLayout.setClipChildren(false);
                    if (i30 < 0) {
                        alertDialog$Builder = alertDialog$Builder2;
                        f7 = 8.0f;
                        long j11 = -j10;
                        if (MessagesController.getInstance(i31).getChatFull(j11) == null) {
                            MessagesController.getInstance(i31).loadFullChat(j11, ConnectionsManager.generateClassGuid(), true);
                        }
                    } else {
                        alertDialog$Builder = alertDialog$Builder2;
                        f7 = 8.0f;
                    }
                    NumberTextView numberTextView = new NumberTextView(context);
                    EditText editText2 = new EditText(context);
                    int i32 = org.telegram.ui.ActionBar.k6.f21263hg;
                    org.telegram.ui.ActionBar.r6.W(editText2, i32, null);
                    if (i30 > 0) {
                        i26 = R.string.UserBio;
                    } else {
                        i26 = R.string.DescriptionPlaceholder;
                    }
                    editText2.setHint(LocaleController.getString(i26));
                    editText2.setTextSize(1, 16.0f);
                    editText2.setBackground(org.telegram.ui.ActionBar.k6.T(context));
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
                    numberTextView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.B6, false));
                    numberTextView.setImportantForAccessibility(2);
                    if (LocaleController.isRTL) {
                        i28 = 3;
                    } else {
                        i28 = 5;
                    }
                    frameLayout.addView(numberTextView, w7.z5.d(20, 20.0f, i28, 0.0f, 14.0f, 21.0f, 0.0f));
                    if (LocaleController.isRTL) {
                        i29 = AndroidUtilities.dp(24.0f);
                    } else {
                        i29 = 0;
                    }
                    int dp2 = AndroidUtilities.dp(f7);
                    if (LocaleController.isRTL) {
                        dp = 0;
                    } else {
                        dp = AndroidUtilities.dp(24.0f);
                    }
                    editText2.setPadding(i29, dp2, dp, AndroidUtilities.dp(f7));
                    editText2.addTextChangedListener(new org.telegram.ui.Components.rq(i27, numberTextView));
                    AndroidUtilities.updateViewVisibilityAnimated(numberTextView, false, 0.0f, false);
                    editText2.setText(str5);
                    editText2.setSelection(editText2.getText().toString().length());
                    AlertDialog$Builder alertDialog$Builder3 = alertDialog$Builder;
                    alertDialog$Builder3.o(frameLayout);
                    final j2.c cVar = new j2.c(j10, i31, editText2, 4);
                    alertDialog$Builder3.k(LocaleController.getString(R.string.Save), cVar);
                    alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                    c2Var.N = new org.telegram.ui.Components.o1(editText2, 1);
                    frameLayout.addView(editText2, w7.z5.d(-1, -2.0f, 0, 23.0f, 12.0f, 23.0f, 21.0f));
                    editText2.requestFocus();
                    AndroidUtilities.showKeyboard(editText2);
                    editText2.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                        @Override
                        public final boolean onEditorAction(TextView textView2, int i33, KeyEvent keyEvent) {
                            if (i33 == 6 || (j10 > 0 && keyEvent.getKeyCode() == 66)) {
                                org.telegram.ui.ActionBar.c2 c2Var2 = c2Var;
                                if (c2Var2.isShowing()) {
                                    cVar.g(c2Var2, 0);
                                    return true;
                                }
                            }
                            return false;
                        }
                    });
                    c2Var.j(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21509ug, false));
                    c2Var.show();
                    c2Var.p(org.telegram.ui.ActionBar.k6.x0(null, i32, false));
                } else if (i10 == 11) {
                    Context context2 = getContext();
                    int i33 = this.currentAccount;
                    Pattern pattern2 = org.telegram.ui.Components.d5.f25562a;
                    if (DialogObject.isUserDialog(j10)) {
                        TLRPC.User user = MessagesController.getInstance(i33).getUser(Long.valueOf(j10));
                        str3 = user.first_name;
                        str4 = user.last_name;
                    } else {
                        str3 = MessagesController.getInstance(i33).getChat(Long.valueOf(-j10)).title;
                        str4 = null;
                    }
                    ?? alertDialog$Builder4 = new AlertDialog$Builder(context2);
                    if (i30 > 0) {
                        i19 = R.string.VoipEditName;
                    } else {
                        i19 = R.string.VoipEditTitle;
                    }
                    String string2 = LocaleController.getString(i19);
                    org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder4.f20679a;
                    c2Var2.R = string2;
                    LinearLayout e = org.telegram.messenger.tl.e(context2, 1);
                    EditText editText3 = new EditText(context2);
                    int i34 = org.telegram.ui.ActionBar.k6.f21263hg;
                    org.telegram.ui.ActionBar.r6.W(editText3, i34, null);
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
                    editText3.setBackground(org.telegram.ui.ActionBar.k6.T(context2));
                    editText3.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                    editText3.requestFocus();
                    if (i30 > 0) {
                        editText = new EditText(context2);
                        org.telegram.ui.ActionBar.r6.W(editText, i34, null);
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
                        editText.setBackground(org.telegram.ui.ActionBar.k6.T(context2));
                        editText.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                    } else {
                        editText = null;
                    }
                    AndroidUtilities.showKeyboard(editText3);
                    e.addView(editText3, w7.z5.t(-1, -2, 0, 23, 12, 23, 21));
                    if (editText != null) {
                        e.addView(editText, w7.z5.t(-1, -2, 0, 23, 12, 23, 21));
                    }
                    editText3.setText(str3);
                    editText3.setSelection(editText3.getText().toString().length());
                    if (editText != null) {
                        editText.setText(str4);
                        editText.setSelection(editText.getText().toString().length());
                    }
                    alertDialog$Builder4.o(e);
                    gi.q1 q1Var = new gi.q1(editText3, j10, i33, editText);
                    alertDialog$Builder4.k(LocaleController.getString(R.string.Save), q1Var);
                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                    c2Var2.N = new ai.z3(8, editText3, editText);
                    c2Var2.j(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21509ug, false));
                    c2Var2.show();
                    c2Var2.p(org.telegram.ui.ActionBar.k6.x0(null, i34, false));
                    wd wdVar = new wd(1, c2Var2, q1Var);
                    if (editText != null) {
                        editText.setOnEditorActionListener(wdVar);
                    } else {
                        editText3.setOnEditorActionListener(wdVar);
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
                ?? alertDialog$Builder5 = new AlertDialog$Builder(getContext());
                int i35 = org.telegram.ui.ActionBar.k6.f21412pg;
                org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder5.f20679a;
                c2Var3.I = i35;
                TextView textView2 = new TextView(getContext());
                int i36 = org.telegram.ui.ActionBar.k6.f21263hg;
                org.telegram.ui.ActionBar.r6.W(textView2, i36, null);
                textView2.setTextSize(1, 16.0f);
                if (LocaleController.isRTL) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                textView2.setGravity(i11 | 48);
                ?? frameLayout2 = new FrameLayout(getContext());
                alertDialog$Builder5.o(frameLayout2);
                org.telegram.ui.Components.f9 f9Var = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.g6) null);
                f9Var.u(AndroidUtilities.dp(12.0f));
                org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(getContext());
                u9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                frameLayout2.addView(u9Var, w7.z5.d(40, 40.0f, i12 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                f9Var.j(this.currentAccount, tLObject);
                boolean z11 = tLObject instanceof TLRPC.User;
                if (z11) {
                    r16 = 0;
                    TLRPC.User user2 = (TLRPC.User) tLObject;
                    u9Var.e(user2, f9Var);
                    str = UserObject.getFirstName(user2);
                } else {
                    r16 = 0;
                    TLRPC.Chat chat2 = (TLRPC.Chat) tLObject;
                    u9Var.e(chat2, f9Var);
                    str = chat2.title;
                }
                TextView textView3 = new TextView(getContext());
                org.telegram.messenger.v0.q(textView3, i36, null, 1, 20.0f);
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
                TLRPC.Chat chat3 = this.Z0;
                if (chat3 != null) {
                    str2 = chat3.title;
                } else {
                    str2 = "";
                }
                if (i10 == 2) {
                    if (o1()) {
                        textView3.setText(LocaleController.getString(R.string.VoipConferenceRemoveMemberAlertTitle2));
                        int i37 = R.string.VoipConferenceRemoveMemberAlertText2;
                        Object[] objArr = new Object[1];
                        objArr[r16] = str;
                        org.telegram.messenger.tl.r(i37, objArr, textView2);
                    } else {
                        textView3.setText(LocaleController.getString(R.string.VoipGroupRemoveMemberAlertTitle2));
                        if (ChatObject.isChannelOrGiga(this.Z0)) {
                            int i38 = R.string.VoipChannelRemoveMemberAlertText2;
                            Object[] objArr2 = new Object[2];
                            objArr2[r16] = str;
                            objArr2[1] = str2;
                            org.telegram.messenger.tl.r(i38, objArr2, textView2);
                        } else {
                            int i39 = R.string.VoipGroupRemoveMemberAlertText2;
                            Object[] objArr3 = new Object[2];
                            objArr3[r16] = str;
                            objArr3[1] = str2;
                            org.telegram.messenger.tl.r(i39, objArr3, textView2);
                        }
                    }
                } else {
                    textView3.setText(LocaleController.getString(R.string.VoipGroupAddMemberTitle));
                    int i40 = R.string.VoipGroupAddMemberText;
                    Object[] objArr4 = new Object[2];
                    objArr4[r16] = str;
                    objArr4[1] = str2;
                    org.telegram.messenger.tl.r(i40, objArr4, textView2);
                }
                boolean z12 = LocaleController.isRTL;
                if (z12) {
                    i14 = 5;
                } else {
                    i14 = 3;
                }
                int i41 = i14 | 48;
                int i42 = 76;
                if (z12) {
                    i15 = 21;
                } else {
                    i15 = 76;
                }
                float f10 = i15;
                if (!z12) {
                    i42 = 21;
                }
                frameLayout2.addView(textView3, w7.z5.d(-1, -2.0f, i41, f10, 11.0f, i42, 0.0f));
                if (LocaleController.isRTL) {
                    i16 = 5;
                } else {
                    i16 = 3;
                }
                frameLayout2.addView(textView2, w7.z5.d(-2, -2.0f, i16 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
                if (i10 == 2) {
                    alertDialog$Builder5.k(LocaleController.getString(R.string.VoipGroupUserRemove), new ks(9, this, tLObject));
                } else if (z11) {
                    alertDialog$Builder5.k(LocaleController.getString(R.string.VoipGroupAdd), new ai.f(this, (TLRPC.User) tLObject, j10, 6));
                }
                alertDialog$Builder5.h(LocaleController.getString(R.string.Cancel), null);
                c2Var3.j(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21509ug, r16));
                c2Var3.show();
                if (i10 == 2 && (textView = (TextView) c2Var3.d(-1)) != null) {
                    org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21527vg, null);
                }
            }
        }
    }

    public final void y1(boolean r18, org.telegram.ui.Cells.d4 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.u50.y1(boolean, org.telegram.ui.Cells.d4):void");
    }

    public final void z1() {
        z5 z5Var = this.A2;
        AndroidUtilities.cancelRunOnUIThread(z5Var);
        if (this.f42323z2 && this.U0 != null && VoIPService.getSharedInstance() != null && r1() && this.Q != null && LiteMode.isEnabled(512)) {
            AndroidUtilities.runOnUIThread(z5Var, 30L);
        }
    }

    @Override
    public final void H(float f7, int i10) {
    }
}
