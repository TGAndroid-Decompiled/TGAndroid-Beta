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
public final class v50 extends org.telegram.ui.ActionBar.k3 implements NotificationCenter.NotificationCenterDelegate, VoIPService.StateListener, oe.d {
    public static v50 D3;
    public static boolean E3;
    public static boolean F3;
    public static boolean G3;
    public static volatile DispatchQueue H3 = new DispatchQueue("updateTextureLightningQueue");
    public static boolean I3;
    public TLRPC.Peer A0;
    public final TextView A1;
    public final y5 A2;
    public final oe.b A3;
    public TLObject B0;
    public final t50 B1;
    public final LongSparseIntArray B2;
    public final oe.e B3;
    public final Paint C0;
    public final rh.i C1;
    public final p30 C2;
    public final oe.b C3;
    public final ArrayList D0;
    public h20 D1;
    public final n30 D2;
    public final Paint E;
    public final ArrayList E0;
    public org.telegram.ui.Components.c40 E1;
    public LinearLayout E2;
    public final x30 F;
    public final ArrayList F0;
    public int F1;
    public boolean F2;
    public final w30 G;
    public final ArrayList G0;
    public boolean G1;
    public final org.telegram.ui.Components.xj0 G2;
    public final u30 H;
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
    public final u50[] K1;
    public final View K2;
    public final z40 L;
    public boolean L0;
    public float L1;
    public GradientDrawable L2;
    public final org.telegram.ui.Components.s6 M;
    public final org.telegram.ui.Components.fa M0;
    public u50 M1;
    public final int[] M2;
    public final f30 N;
    public final org.telegram.ui.Components.fa N0;
    public u50 N1;
    public final j30 N2;
    public final r40 O;
    public float O0;
    public long O1;
    public boolean O2;
    public final p50 P;
    public float P0;
    public float P1;
    public boolean P2;
    public final b50 Q;
    public float Q0;
    public float Q1;
    public RenderNode Q2;
    public final d40 R;
    public RadialGradient R0;
    public boolean R1;
    public float R2;
    public final TextView S;
    public final Matrix S0;
    public boolean S1;
    public boolean S2;
    public final b40 T;
    public final Paint T0;
    public int T1;
    public final String[] T2;
    public final org.telegram.ui.ActionBar.b6 U;
    public final k50 U0;
    public float U1;
    public ObjectAnimator U2;
    public final a50 V;
    public float V0;
    public int V1;
    public ObjectAnimator V2;
    public final org.telegram.ui.ActionBar.b6 W;
    public float W0;
    public boolean W1;
    public final j40 W2;
    public final j50 X;
    public ValueAnimator X0;
    public final int[] X1;
    public org.telegram.ui.Cells.i4 X2;
    public final org.telegram.ui.Components.xz Y;
    public TLRPC.InputPeer Y0;
    public final ArrayList Y1;
    public org.telegram.ui.Components.voip.l Y2;
    public final ImageReceiver Z;
    public TLRPC.Chat Z0;
    public final ArrayList Z1;
    public org.telegram.ui.Components.voip.t Z2;
    public int f44609a0;
    public ChatObject.Call f44610a1;
    public final m30 a2;
    public org.telegram.ui.Components.b30 f44611a3;
    public final o30 f44612b;
    public final ImageView f44613b0;
    public final boolean f44614b1;
    public final r30 f44615b2;
    public boolean f44616b3;
    public final t20 f44617c;
    public final nh.h f44618c0;
    public final String f44619c1;
    public final e40 f44620c2;
    public boolean f44621c3;
    public final AccountInstance d;
    public final int f44622d0;
    public final q50 f44623d1;
    public float f44624d2;
    public int f44625d3;
    public final z20 e;
    public final RadialProgressView f44626e0;
    public final e30 f44627e1;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f44628e2;
    public AnimatorSet f44629e3;
    public final org.telegram.ui.Components.voip.w2 f44630f;
    public final Drawable f44631f0;
    public final g30 f44632f1;
    public boolean f44633f2;
    public v40 f44634f3;
    public final View f44635g0;
    public final Paint f44636g1;
    public boolean f44637g2;
    public int f44638g3;
    public final org.telegram.ui.Components.voip.w2 h;
    public AnimatorSet f44639h0;
    public ValueAnimator f44640h1;
    public org.telegram.ui.Components.g50 f44641h2;
    public int f44642h3;
    public LaunchActivity f44643i0;
    public float f44644i1;
    public c50 f44645i2;
    public int f44646i3;
    public final UndoView[] f44647j0;
    public final LinearLayout f44648j1;
    public Boolean f44649j2;
    public int f44650j3;
    public final org.telegram.ui.Cells.k f44651k0;
    public final org.telegram.ui.ActionBar.w0 f44652k1;
    public int f44653k2;
    public int f44654k3;
    public boolean f44655l0;
    public final org.telegram.ui.ActionBar.w0 l1;
    public boolean f44656l2;
    public int f44657l3;
    public org.telegram.ui.Components.t40 m0;
    public final org.telegram.ui.ActionBar.w0 f44658m1;
    public final i30 f44659m2;
    public int f44660m3;
    public final org.telegram.ui.Components.voip.w2 f44661n;
    public org.telegram.ui.Components.t40 f44662n0;
    public final org.telegram.ui.ActionBar.g1 f44663n1;
    public final org.telegram.ui.Components.mm0 f44664n2;
    public int f44665n3;
    public int f44666o0;
    public final org.telegram.ui.ActionBar.g1 f44667o1;
    public final b60 f44668o2;
    public int f44669o3;
    public f50 f44670p0;
    public final org.telegram.ui.ActionBar.g1 f44671p1;
    public final org.telegram.ui.Components.c30 f44672p2;
    public int f44673p3;
    public final ArrayList f44674q0;
    public final org.telegram.ui.ActionBar.g1 f44675q1;
    public ViewTreeObserver.OnPreDrawListener f44676q2;
    public int f44677q3;
    public final org.telegram.ui.Components.voip.w2 f44678r;
    public p40 f44679r0;
    public final org.telegram.ui.ActionBar.g1 f44680r1;
    public final org.telegram.ui.Components.voip.h f44681r2;
    public int f44682r3;
    public final org.telegram.ui.Components.voip.w2 f44683s;
    public boolean f44684s0;
    public final org.telegram.ui.ActionBar.g1 f44685s1;
    public boolean f44686s2;
    public int f44687s3;
    public long f44688t0;
    public final org.telegram.ui.ActionBar.g1 f44689t1;
    public final ArrayList f44690t2;
    public int f44691t3;
    public boolean f44692u0;
    public final org.telegram.ui.ActionBar.g1 f44693u1;
    public boolean f44694u2;
    public int f44695u3;
    public final org.telegram.ui.Components.voip.w2 v;
    public final RectF f44696v0;
    public final org.telegram.ui.ActionBar.g1 f44697v1;
    public final h20 f44698v2;
    public int f44699v3;
    public final org.telegram.ui.Components.voip.w2 f44700w;
    public boolean f44701w0;
    public final org.telegram.ui.ActionBar.g1 f44702w1;
    public final d30 f44703w2;
    public final w40 f44704w3;
    public final a30 f44705x;
    public boolean f44706x0;
    public final org.telegram.ui.ActionBar.g1 f44707x1;
    public final org.telegram.ui.Components.k5 f44708x2;
    public Boolean f44709x3;
    public final ImageView f44710y;
    public float f44711y0;
    public final org.telegram.ui.ActionBar.g1 f44712y1;
    public final h20 f44713y2;
    public Integer y3;
    public g40 f44714z0;
    public final LinearLayout f44715z1;
    public boolean f44716z2;
    public final oe.b f44717z3;

    public v50(final LaunchActivity launchActivity, AccountInstance accountInstance, ChatObject.Call call, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        super((Context) launchActivity, (org.telegram.ui.ActionBar.u6) null, true, true);
        String string;
        int i10;
        v50 v50Var;
        TLRPC.Chat chat2;
        ConferenceCall conferenceCall;
        this.E = new Paint(1);
        this.f44647j0 = new UndoView[2];
        this.f44674q0 = new ArrayList();
        this.f44696v0 = new RectF();
        this.C0 = new Paint(1);
        this.D0 = new ArrayList();
        this.E0 = new ArrayList();
        this.F0 = new ArrayList();
        this.G0 = new ArrayList();
        this.H0 = new ArrayList();
        this.C1 = new rh.i(new h20(this, 8));
        this.F1 = 0;
        this.G1 = false;
        this.I1 = new Paint(7);
        this.J1 = new Paint(7);
        this.K1 = new u50[8];
        this.L1 = 1.0f;
        this.W1 = true;
        this.X1 = new int[4];
        this.Y1 = new ArrayList();
        this.Z1 = new ArrayList();
        this.f44681r2 = new org.telegram.ui.Components.voip.h();
        this.f44690t2 = new ArrayList();
        this.f44698v2 = new h20(this, 0);
        this.f44703w2 = new d30(this);
        this.f44708x2 = new org.telegram.ui.Components.k5(27);
        this.f44713y2 = new h20(this, 1);
        this.f44716z2 = false;
        this.A2 = new y5(this, 6);
        this.B2 = new LongSparseIntArray();
        this.M2 = new int[2];
        this.P2 = true;
        this.T2 = new String[2];
        this.f44625d3 = -1;
        this.f44704w3 = new w40(this);
        org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.f27586f;
        this.f44717z3 = new oe.b(2, this, dsVar, 350L);
        this.A3 = new oe.b(3, this, dsVar, 220L, true);
        this.B3 = new oe.e(4, this, dsVar, 350L);
        this.C3 = new oe.b(5, this, dsVar, 350L);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        setOpenNoDelay(true);
        this.d = accountInstance;
        this.f44610a1 = call;
        this.Y0 = inputPeer;
        this.Z0 = chat;
        this.f44619c1 = str;
        this.currentAccount = accountInstance.getCurrentAccount();
        this.f44614b1 = z10;
        this.resourcesProvider = new di.k0();
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        this.f44622d0 = MessagesController.getInstance(this.currentAccount).config.groupCallMessageLengthLimit.get();
        this.fullWidth = true;
        G3 = false;
        F3 = false;
        I3 = false;
        setDelegate(new y30(this));
        this.drawDoubleNavigationBar = true;
        this.drawNavigationBar = true;
        if (Build.VERSION.SDK_INT >= 30) {
            getWindow().setNavigationBarColor(-16777216);
        }
        this.scrollNavBar = true;
        this.navBarColorKey = -1;
        this.W2 = new j40(this);
        setOnDismissListener(new l20(this, 0));
        setDimBehindAlpha(75);
        p50 p50Var = new p50(this, launchActivity);
        this.P = p50Var;
        org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(true);
        int i11 = org.telegram.ui.ActionBar.y6.f23605qg;
        eqVar.b(org.telegram.ui.ActionBar.y6.v0(i11));
        eqVar.d();
        r40 r40Var = new r40(this, launchActivity, eqVar);
        this.O = r40Var;
        r40Var.setSubtitle("");
        r40Var.getSubtitleTextView().setVisibility(0);
        r40Var.j();
        r40Var.getAdditionalSubtitleTextView().setPadding(AndroidUtilities.dp(24.0f), 0, 0, 0);
        AndroidUtilities.updateViewVisibilityAnimated(r40Var.getAdditionalSubtitleTextView(), this.f44694u2, 1.0f, false);
        r40Var.getAdditionalSubtitleTextView().setTextColor(org.telegram.ui.ActionBar.y6.v0(i11));
        int i12 = org.telegram.ui.ActionBar.y6.f23511lg;
        org.telegram.ui.ActionBar.f7.m(r40Var, 6, i12, null);
        r40Var.setBackButtonImage(R.drawable.ic_ab_back);
        r40Var.setOccupyStatusBar(false);
        r40Var.setAllowOverlayTitle(false);
        int i13 = org.telegram.ui.ActionBar.y6.f23438hg;
        org.telegram.ui.ActionBar.f7.m(r40Var, 1, i13, null);
        org.telegram.ui.ActionBar.f7.m(r40Var, 3, org.telegram.ui.ActionBar.y6.f23769z8, null);
        org.telegram.ui.ActionBar.f7.e(r40Var, i13);
        org.telegram.ui.ActionBar.f7.m(r40Var, 6, i12, null);
        r40Var.setActionBarMenuOnItemClick(new y40(this, launchActivity));
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
        VoIPService.audioLevelsCallback = new e20(this, 3);
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
        this.f44631f0 = launchActivity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        org.telegram.ui.Components.xj0 xj0Var = new org.telegram.ui.Components.xj0(R.raw.voip_filled, AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f), true, null);
        this.J0 = xj0Var;
        this.K0 = new org.telegram.ui.Components.xj0(R.raw.hand_2, AndroidUtilities.dp(46.0f), AndroidUtilities.dp(46.0f), true, null);
        z40 z40Var = new z40(this, launchActivity);
        this.L = z40Var;
        this.containerView = z40Var;
        z40Var.setClipToPadding(false);
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
            org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(launchActivity);
            this.U = b6Var;
            b6Var.setGravity(17);
            b6Var.setTextColor(-1);
            b6Var.setTypeface(AndroidUtilities.bold());
            b6Var.setTextSize(18);
            b6Var.k(LocaleController.getString(R.string.VoipChatStartsIn));
            this.containerView.addView(b6Var, org.telegram.ui.Components.gb1.h(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 311.0f));
            a50 a50Var = new a50(this, launchActivity);
            this.V = a50Var;
            a50Var.setGravity(17);
            a50Var.setTextColor(-1);
            a50Var.setTypeface(AndroidUtilities.bold());
            a50Var.setTextSize(60);
            this.containerView.addView(a50Var, org.telegram.ui.Components.gb1.h(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 231.0f));
            org.telegram.ui.ActionBar.b6 b6Var2 = new org.telegram.ui.ActionBar.b6(launchActivity);
            this.W = b6Var2;
            b6Var2.setGravity(17);
            b6Var2.setTextColor(-1);
            b6Var2.setTypeface(AndroidUtilities.bold());
            b6Var2.setTextSize(18);
            this.containerView.addView(b6Var2, org.telegram.ui.Components.gb1.h(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 201.0f));
        }
        if (r1()) {
            k50 k50Var = new k50(this, launchActivity);
            this.U0 = k50Var;
            this.containerView.addView(k50Var, org.telegram.ui.Components.gb1.h(-1, 80.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
        }
        b50 b50Var = new b50(this, launchActivity);
        this.Q = b50Var;
        b50Var.setClipToPadding(false);
        b50Var.setClipChildren(false);
        j50 j50Var = new j50(this);
        this.X = j50Var;
        j50Var.f47787o = dsVar;
        j50Var.d = 350L;
        j50Var.f47803c = 350L;
        j50Var.e = 350L;
        j50Var.S();
        b50Var.setItemAnimator(j50Var);
        b50Var.setOnScrollListener(new s20(this));
        b50Var.setVerticalScrollBarEnabled(false);
        getContext();
        org.telegram.ui.Components.xz xzVar = new org.telegram.ui.Components.xz(F3 ? 6 : 2, b50Var);
        this.Y = xzVar;
        b50Var.setLayoutManager(xzVar);
        t20 t20Var = new t20(this);
        this.f44617c = t20Var;
        xzVar.A1(t20Var);
        b50Var.i(new u20(this));
        xzVar.D1();
        this.containerView.addView(b50Var, org.telegram.ui.Components.gb1.h(-1, -1.0f, 51, 14.0f, 14.0f, 14.0f, 231.0f));
        b50Var.setAdapter(p50Var);
        b50Var.setTopBottomSelectorRadius(13);
        org.telegram.ui.ActionBar.f7.J(org.telegram.ui.ActionBar.y6.f23383eg, b50Var);
        b50Var.setOnItemClickListener(new e7(this, launchActivity, call, 14));
        b50Var.setOnItemLongClickListener(new e20(this, 4));
        if (r1()) {
            t50 t50Var = new t50(this, getContext());
            this.B1 = t50Var;
            this.containerView.addView(t50Var, org.telegram.ui.Components.gb1.h(-1, 0.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(launchActivity);
        this.f44664n2 = mm0Var;
        this.containerView.addView(mm0Var, org.telegram.ui.Components.gb1.h(-1, -1.0f, 51, 14.0f, 14.0f, 324.0f, 14.0f));
        b60 b60Var = new b60(call, this.currentAccount, this);
        this.f44668o2 = b60Var;
        mm0Var.setAdapter(b60Var);
        s4.t tVar = new s4.t(6, false);
        mm0Var.setLayoutManager(tVar);
        tVar.A1(new w20(this));
        mm0Var.setOnItemClickListener(new org.telegram.ui.Components.zl0(this) {
            public final v50 f39525b;

            {
                this.f39525b = this;
            }

            @Override
            public final void c(int i15, View view) {
                switch (r2) {
                    case 0:
                        v50 v50Var2 = this.f39525b;
                        v50Var2.getClass();
                        org.telegram.ui.Components.b30 b30Var = (org.telegram.ui.Components.b30) view;
                        if (b30Var.getVideoParticipant() == null) {
                            v50Var2.e1(new ChatObject.VideoParticipant(b30Var.getParticipant(), false, false));
                            return;
                        } else {
                            v50Var2.e1(b30Var.getVideoParticipant());
                            return;
                        }
                    default:
                        v50 v50Var3 = this.f39525b;
                        v50Var3.getClass();
                        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) view;
                        if (lVar.getParticipant() != null) {
                            v50Var3.e1(lVar.getParticipant());
                            return;
                        }
                        return;
                }
            }
        });
        s4.l lVar = new s4.l();
        lVar.S();
        lVar.f47787o = dsVar;
        lVar.d = 350L;
        lVar.f47803c = 350L;
        lVar.e = 350L;
        mm0Var.setItemAnimator(new x20(this));
        mm0Var.setOnScrollListener(new y20(this));
        b60Var.H(mm0Var, false, false);
        mm0Var.setVisibility(8);
        z20 z20Var = new z20(this, launchActivity);
        this.e = z20Var;
        int v02 = org.telegram.ui.ActionBar.y6.v0(org.telegram.ui.ActionBar.y6.Jg);
        int red = Color.red(v02);
        int green = Color.green(v02);
        int blue = Color.blue(v02);
        this.S0 = new Matrix();
        this.R0 = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dp(72.72727f), new int[]{Color.argb(50, red, green, blue), Color.argb(0, red, green, blue)}, (float[]) null, Shader.TileMode.CLAMP);
        Paint paint = new Paint(1);
        this.T0 = paint;
        paint.setShader(this.R0);
        org.telegram.ui.Components.fa faVar = new org.telegram.ui.Components.fa(9);
        this.M0 = faVar;
        org.telegram.ui.Components.fa faVar2 = new org.telegram.ui.Components.fa(12);
        this.N0 = faVar2;
        faVar.f28111a = AndroidUtilities.dp(62.0f) * 0.45454547f;
        faVar.f28112b = AndroidUtilities.dp(72.0f) * 0.45454547f;
        faVar.b();
        faVar2.f28111a = AndroidUtilities.dp(65.0f) * 0.45454547f;
        faVar2.f28112b = AndroidUtilities.dp(75.0f) * 0.45454547f;
        faVar2.b();
        int i15 = org.telegram.ui.ActionBar.y6.Ig;
        faVar.d.setColor(i0.a.o(org.telegram.ui.ActionBar.y6.v0(i15), 38));
        faVar2.d.setColor(i0.a.o(org.telegram.ui.ActionBar.y6.v0(i15), 76));
        org.telegram.ui.Components.voip.w2 w2Var = new org.telegram.ui.Components.voip.w2(launchActivity, 50.0f);
        this.f44678r = w2Var;
        w2Var.setCheckable(true);
        w2Var.setTextSize(12);
        z20Var.a(w2Var);
        w2Var.setOnClickListener(new f20(this, 7));
        org.telegram.ui.Components.voip.w2 w2Var2 = new org.telegram.ui.Components.voip.w2(launchActivity, 50.0f);
        this.f44661n = w2Var2;
        w2Var2.setCheckable(true);
        w2Var2.setTextSize(12);
        w2Var2.d(false, false);
        w2Var2.setCrossOffset(-AndroidUtilities.dpf2(3.5f));
        w2Var2.c(R.drawable.calls_video, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipCamera), false, false);
        org.telegram.ui.Components.voip.w2 w2Var3 = new org.telegram.ui.Components.voip.w2(launchActivity, 50.0f);
        this.f44630f = w2Var3;
        w2Var3.setCheckable(true);
        w2Var3.setTextSize(12);
        w2Var3.d(false, false);
        org.telegram.ui.Components.ak0 ak0Var = new org.telegram.ui.Components.ak0(launchActivity);
        w2Var3.addView(ak0Var, org.telegram.ui.Components.gb1.h(32, 32.0f, 1, 0.0f, 10.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.xj0 xj0Var2 = new org.telegram.ui.Components.xj0(R.raw.camera_flip, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        this.G2 = xj0Var2;
        ak0Var.setAnimation(xj0Var2);
        w2Var3.setOnClickListener(new f20(this, 10));
        z20Var.a(w2Var3);
        org.telegram.ui.Components.voip.w2 w2Var4 = new org.telegram.ui.Components.voip.w2(launchActivity, 50.0f);
        this.h = w2Var4;
        w2Var4.setCheckable(true);
        w2Var4.setTextSize(12);
        w2Var4.d(false, false);
        ImageView imageView = new ImageView(launchActivity);
        this.f44613b0 = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        int i16 = R.drawable.filled_sound_on;
        this.f44609a0 = i16;
        imageView.setImageResource(i16);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setScaleX(1.11f);
        imageView.setScaleY(1.11f);
        w2Var4.addView(imageView, org.telegram.ui.Components.gb1.h(30, 30.0f, 1, 0.0f, 11.0f, 0.0f, 0.0f));
        w2Var4.setOnClickListener(new f20(this, 11));
        z20Var.a(w2Var4);
        z20Var.a(w2Var2);
        org.telegram.ui.Components.voip.w2 w2Var5 = new org.telegram.ui.Components.voip.w2(launchActivity, 50.0f);
        this.f44683s = w2Var5;
        w2Var5.setTextSize(12);
        w2Var5.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.y6.v0(org.telegram.ui.ActionBar.y6.Dg), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, false);
        w2Var5.setOnClickListener(new View.OnClickListener(this) {
            public final v50 f40789b;

            {
                this.f40789b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        v50.o(this.f40789b, launchActivity);
                        return;
                    default:
                        v50 v50Var2 = this.f40789b;
                        v50Var2.a2.e();
                        ChatObject.Call call2 = v50Var2.f44610a1;
                        if (call2 != null && !call2.isScheduled()) {
                            v50Var2.J1();
                            v50.t1(launchActivity, new h20(v50Var2, 5), false, false);
                            return;
                        }
                        v50Var2.dismiss();
                        return;
                }
            }
        });
        org.telegram.ui.Components.voip.w2 w2Var6 = new org.telegram.ui.Components.voip.w2(launchActivity, 50.0f);
        this.v = w2Var6;
        w2Var6.setCheckable(true);
        w2Var6.b(true, false);
        w2Var6.setTextSize(12);
        w2Var6.c(R.drawable.filled_voice_comment_32, -1, 0, 1.0f, true, LocaleController.getString(R.string.VoipMessage), false, false);
        a30 a30Var = new a30(this, launchActivity);
        this.f44705x = a30Var;
        a30Var.setAnimation(xj0Var);
        a30Var.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.Components.voip.w2 w2Var7 = new org.telegram.ui.Components.voip.w2(launchActivity, 50.0f);
        this.f44700w = w2Var7;
        w2Var7.setDrawBackground(false);
        w2Var7.setTextSize(12);
        w2Var7.c(0, 0, 0, 1.0f, true, "Text", false, false);
        w2Var7.addView(a30Var, org.telegram.ui.Components.gb1.i(50, 50, 49));
        z20Var.a(w2Var7);
        w2Var7.setOnClickListener(new c30(this));
        z20Var.a(w2Var6);
        z20Var.a(w2Var5);
        ImageView imageView2 = new ImageView(launchActivity);
        this.f44710y = imageView2;
        imageView2.setVisibility(8);
        imageView2.setImageResource(R.drawable.voice_expand);
        w2Var7.addView(imageView2, org.telegram.ui.Components.gb1.h(24, 24.0f, 49, 0.0f, 13.0f, 0.0f, 0.0f));
        if (this.f44610a1 != null && r1() && !this.f44610a1.isScheduled()) {
            imageView2.setVisibility(0);
            a30Var.setVisibility(8);
        }
        RadialProgressView radialProgressView = new RadialProgressView(launchActivity);
        this.f44626e0 = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(50.0f));
        radialProgressView.setStrokeWidth(2.0f);
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.y6.v0(org.telegram.ui.ActionBar.y6.Og));
        r40Var.setAlpha(0.0f);
        r40Var.getBackButton().setScaleX(0.9f);
        r40Var.getBackButton().setScaleY(0.9f);
        r40Var.getBackButton().setTranslationX(-AndroidUtilities.dp(14.0f));
        r40Var.getTitleTextView().setTranslationY(AndroidUtilities.dp(23.0f));
        r40Var.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        r40Var.getAdditionalSubtitleTextView().setTranslationY(AndroidUtilities.dp(20.0f));
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(launchActivity, (org.telegram.ui.ActionBar.z) null, org.telegram.ui.ActionBar.y6.v0(i13));
        this.f44652k1 = w0Var;
        w0Var.setLongClickEnabled(false);
        w0Var.setIcon(R.drawable.ic_ab_other);
        w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        w0Var.setSubMenuOpenSide(2);
        w0Var.setDelegate(new e20(this, 0));
        int i17 = org.telegram.ui.ActionBar.y6.f23455ig;
        org.telegram.ui.ActionBar.f7.S(w0Var, org.telegram.ui.ActionBar.y6.f0(org.telegram.ui.ActionBar.y6.v0(i17), 6), null, org.telegram.ui.ActionBar.f7.N(i17));
        w0Var.setOnClickListener(new f20(this, 0));
        w0Var.O(org.telegram.ui.ActionBar.y6.v0(i13), false);
        w0Var.O(org.telegram.ui.ActionBar.y6.v0(i13), true);
        org.telegram.ui.ActionBar.w0 w0Var2 = new org.telegram.ui.ActionBar.w0(launchActivity, (org.telegram.ui.ActionBar.z) null, org.telegram.ui.ActionBar.y6.v0(i13));
        this.l1 = w0Var2;
        w0Var2.setLongClickEnabled(false);
        w0Var2.setIcon(R.drawable.msg_voice_pip);
        w0Var2.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        org.telegram.ui.ActionBar.f7.S(w0Var2, org.telegram.ui.ActionBar.y6.f0(org.telegram.ui.ActionBar.y6.v0(i17), 6), null, org.telegram.ui.ActionBar.f7.N(i17));
        w0Var2.setOnClickListener(new f20(this, 1));
        org.telegram.ui.ActionBar.w0 w0Var3 = new org.telegram.ui.ActionBar.w0(launchActivity, (org.telegram.ui.ActionBar.z) null, org.telegram.ui.ActionBar.y6.v0(i13));
        this.f44658m1 = w0Var3;
        w0Var3.setLongClickEnabled(false);
        w0Var3.setIcon(R.drawable.msg_screencast);
        w0Var3.setContentDescription(LocaleController.getString(R.string.AccDescrPipMode));
        org.telegram.ui.ActionBar.f7.S(w0Var3, org.telegram.ui.ActionBar.y6.f0(org.telegram.ui.ActionBar.y6.v0(i17), 6), null, org.telegram.ui.ActionBar.f7.N(i17));
        w0Var3.setOnClickListener(new f20(this, 2));
        e30 e30Var = new e30(this, launchActivity, launchActivity);
        this.f44627e1 = e30Var;
        f30 f30Var = new f30(launchActivity);
        this.N = f30Var;
        f30Var.setAlpha(0.0f);
        Paint paint2 = new Paint(1);
        this.f44636g1 = paint2;
        paint2.setColor(-12761513);
        g30 g30Var = new g30(this, getContext());
        this.f44632f1 = g30Var;
        org.telegram.ui.ActionBar.f7.V(g30Var, i13, this.resourcesProvider);
        g30Var.setTextSize(1, 11.0f);
        g30Var.setText(LocaleController.getString(R.string.VoipChannelLabelLive));
        g30Var.setMaxLines(1);
        g30Var.setGravity(17);
        g30Var.setTypeface(AndroidUtilities.bold());
        g30Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(0.0f));
        g30Var.setTag(-1);
        if (!r1()) {
            g30Var.setVisibility(8);
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f44648j1 = linearLayout;
        linearLayout.setOrientation(0);
        TLRPC.InputPeer inputPeer2 = groupCallPeer;
        linearLayout.addView(e30Var, org.telegram.ui.Components.gb1.p(1.0f, 0, -2));
        linearLayout.addView(g30Var, org.telegram.ui.Components.gb1.o(6.0f, 4.0f, 0.0f, 0.0f, -2, 18));
        this.containerView.addView(f30Var, org.telegram.ui.Components.gb1.h(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.containerView.addView(linearLayout, org.telegram.ui.Components.gb1.h(-2, -2.0f, 51, 23.0f, 0.0f, 48.0f, 0.0f));
        this.containerView.addView(r40Var, org.telegram.ui.Components.gb1.h(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(launchActivity);
        this.f44715z1 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.addView(w0Var3, org.telegram.ui.Components.gb1.r(48, 48));
        linearLayout2.addView(w0Var2, org.telegram.ui.Components.gb1.r(48, 48));
        linearLayout2.addView(w0Var, org.telegram.ui.Components.gb1.r(48, 48));
        this.containerView.addView(linearLayout2, org.telegram.ui.Components.gb1.i(-2, 48, 53));
        View view = new View(launchActivity);
        this.f44635g0 = view;
        view.setAlpha(0.0f);
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.V5, view, null);
        this.containerView.addView(view, org.telegram.ui.Components.gb1.g(1.0f, -1));
        for (int i18 = 0; i18 < 2; i18++) {
            this.f44647j0[i18] = new h30(this, launchActivity);
            this.f44647j0[i18].setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            this.f44647j0[i18].setTranslationZ(AndroidUtilities.dp(5.0f));
            this.containerView.addView(this.f44647j0[i18], org.telegram.ui.Components.gb1.h(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        org.telegram.ui.Cells.k kVar = new org.telegram.ui.Cells.k(launchActivity, true);
        this.f44651k0 = kVar;
        kVar.setTag(R.id.fit_width_tag, 240);
        this.f44652k1.h(kVar, AndroidUtilities.dp(48.0f));
        this.f44652k1.setShowSubmenuByMove(false);
        int i19 = org.telegram.ui.ActionBar.y6.f23383eg;
        org.telegram.ui.ActionBar.f7.S(kVar, org.telegram.ui.ActionBar.y6.Z(org.telegram.ui.ActionBar.y6.v0(i19), 6, 6), null, org.telegram.ui.ActionBar.f7.N(i19));
        org.telegram.ui.ActionBar.w0 w0Var4 = this.f44652k1;
        org.telegram.ui.ActionBar.g1 d = w0Var4.d(1, 0, null, LocaleController.getString(R.string.VoipGroupAllCanSpeak), true, true, w0Var4.m0);
        this.f44693u1 = d;
        d.m(true, false);
        org.telegram.ui.ActionBar.w0 w0Var5 = this.f44652k1;
        org.telegram.ui.ActionBar.g1 d10 = w0Var5.d(2, 0, null, LocaleController.getString(R.string.VoipGroupOnlyAdminsCanSpeak), true, true, w0Var5.m0);
        this.f44697v1 = d10;
        d10.m(false, true);
        int i20 = org.telegram.ui.ActionBar.y6.f23721wg;
        d.setCheckColor(i20);
        d.d(org.telegram.ui.ActionBar.y6.v0(i20), org.telegram.ui.ActionBar.y6.v0(i20));
        d10.setCheckColor(i20);
        d10.d(org.telegram.ui.ActionBar.y6.v0(i20), org.telegram.ui.ActionBar.y6.v0(i20));
        Paint paint3 = new Paint(1);
        int i21 = org.telegram.ui.ActionBar.y6.f23438hg;
        paint3.setColor(org.telegram.ui.ActionBar.y6.v0(i21));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(AndroidUtilities.dp(1.5f));
        paint3.setStrokeCap(Paint.Cap.ROUND);
        org.telegram.ui.ActionBar.w0 w0Var6 = this.f44652k1;
        org.telegram.ui.ActionBar.g1 d11 = w0Var6.d(10, R.drawable.msg_voice_speaker, null, LocaleController.getString(R.string.VoipGroupAudio), true, false, w0Var6.m0);
        this.f44671p1 = d11;
        d11.setItemHeight(56);
        org.telegram.ui.ActionBar.w0 w0Var7 = this.f44652k1;
        org.telegram.ui.ActionBar.g1 d12 = w0Var7.d(11, R.drawable.msg_noise_on, null, LocaleController.getString(R.string.VoipNoiseCancellation), true, false, w0Var7.m0);
        this.f44675q1 = d12;
        d12.setItemHeight(56);
        TextView b10 = this.f44652k1.b(i0.a.f(0.3f, org.telegram.ui.ActionBar.y6.v0(org.telegram.ui.ActionBar.y6.gg), -16777216));
        this.A1 = b10;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).topMargin = 0;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).bottomMargin = 0;
        org.telegram.ui.ActionBar.w0 w0Var8 = this.f44652k1;
        org.telegram.ui.ActionBar.g1 d13 = w0Var8.d(6, R.drawable.msg_edit, this.f44623d1, LocaleController.getString(ChatObject.isChannelOrGiga(this.Z0) ? R.string.VoipChannelEditTitle : R.string.VoipGroupEditTitle), true, false, w0Var8.m0);
        this.f44667o1 = d13;
        org.telegram.ui.ActionBar.w0 w0Var9 = this.f44652k1;
        org.telegram.ui.ActionBar.g1 d14 = w0Var9.d(7, R.drawable.msg_permissions, this.f44623d1, LocaleController.getString(R.string.VoipGroupEditPermissions), false, false, w0Var9.m0);
        this.f44680r1 = d14;
        org.telegram.ui.ActionBar.g1 e = this.f44652k1.e(3, R.drawable.msg_link, LocaleController.getString(R.string.VoipGroupShareInviteLink));
        this.f44663n1 = e;
        q50 q50Var = new q50();
        this.f44623d1 = q50Var;
        org.telegram.ui.ActionBar.g1 e10 = this.f44652k1.e(9, R.drawable.msg_screencast, LocaleController.getString(R.string.VoipChatStartScreenCapture));
        this.f44689t1 = e10;
        org.telegram.ui.ActionBar.w0 w0Var10 = this.f44652k1;
        org.telegram.ui.ActionBar.g1 d15 = w0Var10.d(5, 0, q50Var, LocaleController.getString(R.string.VoipGroupRecordCall), true, false, w0Var10.m0);
        this.f44685s1 = d15;
        q50Var.a(d15.getImageView());
        org.telegram.ui.ActionBar.g1 e11 = this.f44652k1.e(12, R.drawable.menu_stream_comments_24, LocaleController.getString(R.string.VoipChannelEnableComments));
        this.f44707x1 = e11;
        org.telegram.ui.ActionBar.g1 e12 = this.f44652k1.e(13, R.drawable._menu_stream_comments_off_24, LocaleController.getString(R.string.VoipChannelDisableComments));
        this.f44712y1 = e12;
        org.telegram.ui.ActionBar.w0 w0Var11 = this.f44652k1;
        int i22 = R.drawable.msg_cancel;
        if (o1()) {
            i10 = i21;
            string = LocaleController.getString(R.string.VoipGroupEndConference);
        } else {
            string = LocaleController.getString(ChatObject.isChannelOrGiga(this.Z0) ? R.string.VoipChannelEndChat : R.string.VoipGroupEndChat);
            i10 = i21;
        }
        org.telegram.ui.ActionBar.g1 e13 = w0Var11.e(4, i22, string);
        this.f44702w1 = e13;
        this.f44652k1.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.y6.v0(i19));
        this.f44652k1.getPopupLayout().setFitItems(true);
        e11.d(org.telegram.ui.ActionBar.y6.v0(i10), org.telegram.ui.ActionBar.y6.v0(i10));
        e12.d(org.telegram.ui.ActionBar.y6.v0(i10), org.telegram.ui.ActionBar.y6.v0(i10));
        d11.d(org.telegram.ui.ActionBar.y6.v0(i10), org.telegram.ui.ActionBar.y6.v0(i10));
        d12.d(org.telegram.ui.ActionBar.y6.v0(i10), org.telegram.ui.ActionBar.y6.v0(i10));
        int i23 = org.telegram.ui.ActionBar.y6.f23701vg;
        e13.d(org.telegram.ui.ActionBar.y6.v0(i23), org.telegram.ui.ActionBar.y6.v0(i23));
        e.d(org.telegram.ui.ActionBar.y6.v0(i10), org.telegram.ui.ActionBar.y6.v0(i10));
        d13.d(org.telegram.ui.ActionBar.y6.v0(i10), org.telegram.ui.ActionBar.y6.v0(i10));
        d14.d(org.telegram.ui.ActionBar.y6.v0(i10), org.telegram.ui.ActionBar.y6.v0(i10));
        d15.d(org.telegram.ui.ActionBar.y6.v0(i10), org.telegram.ui.ActionBar.y6.v0(i10));
        e10.d(org.telegram.ui.ActionBar.y6.v0(i10), org.telegram.ui.ActionBar.y6.v0(i10));
        if (this.f44610a1 != null) {
            l1();
        }
        if (o1()) {
            this.f44670p0 = new f50();
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            this.f44670p0.b((sharedInstance == null || (conferenceCall = sharedInstance.conference) == null) ? null : conferenceCall.getEmojis());
        }
        Q1(false);
        this.O.getTitleTextView().setOnClickListener(new f20(this, 3));
        i30 i30Var = new i30(this, launchActivity);
        this.f44659m2 = i30Var;
        j30 j30Var = new j30(this);
        this.N2 = j30Var;
        i30Var.setClipToPadding(false);
        j30Var.S();
        j30Var.f47787o = org.telegram.ui.Components.ds.f27586f;
        j30Var.d = 350L;
        j30Var.f47803c = 350L;
        j30Var.e = 350L;
        i30Var.setItemAnimator(j30Var);
        i30Var.setOnScrollListener(new k30(this));
        i30Var.setClipChildren(false);
        s4.c0 c0Var = new s4.c0();
        c0Var.k1(0);
        i30Var.setLayoutManager(c0Var);
        org.telegram.ui.Components.c30 c30Var = new org.telegram.ui.Components.c30(call, this.currentAccount, this);
        this.f44672p2 = c30Var;
        i30Var.setAdapter(c30Var);
        c30Var.F(i30Var, false);
        i30Var.setOnItemClickListener(new org.telegram.ui.Components.zl0(this) {
            public final v50 f39525b;

            {
                this.f39525b = this;
            }

            @Override
            public final void c(int i152, View view2) {
                switch (r2) {
                    case 0:
                        v50 v50Var2 = this.f39525b;
                        v50Var2.getClass();
                        org.telegram.ui.Components.b30 b30Var = (org.telegram.ui.Components.b30) view2;
                        if (b30Var.getVideoParticipant() == null) {
                            v50Var2.e1(new ChatObject.VideoParticipant(b30Var.getParticipant(), false, false));
                            return;
                        } else {
                            v50Var2.e1(b30Var.getVideoParticipant());
                            return;
                        }
                    default:
                        v50 v50Var3 = this.f39525b;
                        v50Var3.getClass();
                        org.telegram.ui.Components.voip.l lVar2 = (org.telegram.ui.Components.voip.l) view2;
                        if (lVar2.getParticipant() != null) {
                            v50Var3.e1(lVar2.getParticipant());
                            return;
                        }
                        return;
                }
            }
        });
        i30Var.setOnItemLongClickListener(new e20(this, 1));
        i30Var.setVisibility(8);
        i30Var.i(new l30());
        m30 m30Var = new m30(this, launchActivity, this.Q, i30Var, this.Y1, this.f44610a1, this);
        this.a2 = m30Var;
        m30Var.setClipChildren(false);
        c30Var.E(this.Y1, m30Var);
        if (this.f44664n2 != null) {
            this.f44668o2.G(this.Y1, m30Var);
        }
        n30 n30Var = new n30(this, launchActivity);
        this.D2 = n30Var;
        o30 o30Var = new o30(this, launchActivity, this.O, this.Q, n30Var);
        this.f44612b = o30Var;
        o30Var.setImagesLayerNum(Integer.MAX_VALUE);
        o30Var.setInvalidateWithParent(true);
        n30Var.setProfileGalleryView(o30Var);
        p30 p30Var = new p30(this, launchActivity);
        this.C2 = p30Var;
        p30Var.setVisibility(8);
        o30Var.setVisibility(0);
        o30Var.b(new q30(this));
        r30 r30Var = new r30(this, launchActivity);
        this.f44615b2 = r30Var;
        this.containerView.addView(m30Var);
        m30Var.addView(i30Var, org.telegram.ui.Components.gb1.h(-1, 80.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        this.e.setWillNotDraw(false);
        View view2 = new View(launchActivity);
        this.J2 = view2;
        int[] iArr = this.M2;
        iArr[0] = this.V1;
        iArr[1] = 0;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, this.M2);
        this.L2 = gradientDrawable;
        view2.setBackground(gradientDrawable);
        this.containerView.addView(view2, org.telegram.ui.Components.gb1.i(-1, 60, 83));
        View view3 = new View(launchActivity);
        this.K2 = view3;
        view3.setBackgroundColor(this.M2[0]);
        this.containerView.addView(view3, org.telegram.ui.Components.gb1.i(-1, 0, 83));
        nh.h hVar = new nh.h(launchActivity);
        this.f44618c0 = hVar;
        hVar.setDelegate(new s30(this));
        hVar.setClickCellDelegate(new t30(this));
        if (this.f44610a1 != null) {
            hVar.D0(this.d.getCurrentAccount(), this.f44610a1.getInputGroupCall(false));
        }
        this.containerView.addView(hVar, org.telegram.ui.Components.gb1.h(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(launchActivity, false, true, true);
        this.M = s6Var;
        s6Var.setGravity(17);
        s6Var.setTextSize(AndroidUtilities.dp(15.0f));
        s6Var.setTextColor(-1);
        s6Var.b(0.4f, 320L, org.telegram.ui.Components.ds.h);
        s6Var.setTypeface(AndroidUtilities.bold());
        this.containerView.addView(this.e);
        u30 u30Var = new u30(this, launchActivity, this.L, LaunchActivity.R(), this.resourcesProvider);
        this.H = u30Var;
        u30Var.J = true;
        u30Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.f44622d0)});
        u30Var.getEditText().setLinkTextColor(-11683585);
        u30Var.setHint(LocaleController.getString(R.string.TypeMessage));
        u30Var.getEditText().addTextChangedListener(new v30(this));
        u30Var.s();
        w30 w30Var = new w30(this, launchActivity);
        this.G = w30Var;
        this.containerView.addView(w30Var, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        x30 x30Var = new x30(launchActivity);
        this.F = x30Var;
        x30Var.addView(u30Var, org.telegram.ui.Components.gb1.h(-1, -2.0f, 80, 0.0f, 0.0f, 48.0f, 0.0f));
        x30Var.addView(s6Var, org.telegram.ui.Components.gb1.h(52, 16.0f, 85, 0.0f, 0.0f, 0.0f, 32.0f));
        s6Var.setTranslationY(-AndroidUtilities.dp(20.0f));
        this.containerView.addView(x30Var, org.telegram.ui.Components.gb1.i(-1, -2, 80));
        ImageView imageView3 = new ImageView(launchActivity);
        this.J = imageView3;
        int i24 = org.telegram.ui.ActionBar.y6.f23448i6;
        org.telegram.ui.ActionBar.f7.R(imageView3, org.telegram.ui.ActionBar.y6.g0(getThemedColor(i24), 1, -1), null, org.telegram.ui.ActionBar.f7.N(i24), this.resourcesProvider);
        int i25 = org.telegram.ui.ActionBar.y6.f7;
        org.telegram.ui.ActionBar.u6 u6Var = this.resourcesProvider;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.f7.t(imageView3, i25, u6Var, mode);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.arrow_more);
        imageView3.setOnClickListener(new f20(this, 4));
        ImageView imageView4 = new ImageView(launchActivity);
        this.I = imageView4;
        org.telegram.ui.ActionBar.f7.R(imageView4, org.telegram.ui.ActionBar.y6.g0(getThemedColor(i24), 1, -1), null, org.telegram.ui.ActionBar.f7.N(i24), this.resourcesProvider);
        org.telegram.ui.ActionBar.f7.t(imageView4, org.telegram.ui.ActionBar.y6.f23692v6, this.resourcesProvider, mode);
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(R.drawable.ic_send);
        imageView4.setOnClickListener(new f20(this, 5));
        x30Var.addView(imageView3, org.telegram.ui.Components.gb1.i(48, 48, 85));
        x30Var.addView(imageView4, org.telegram.ui.Components.gb1.i(48, 48, 85));
        this.containerView.addView(r30Var);
        p30Var.addView(o30Var, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        p30Var.addView(n30Var, org.telegram.ui.Components.gb1.h(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.containerView.addView(p30Var, org.telegram.ui.Components.gb1.h(-1, -1.0f, 0, 14.0f, 14.0f, 14.0f, 14.0f));
        O0(false);
        this.P.l();
        if (G3) {
            this.f44668o2.I(this.f44664n2, false);
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
            this.containerView.addView(textView, org.telegram.ui.Components.gb1.h(-2, -2.0f, 81, 21.0f, 0.0f, 21.0f, 100.0f));
            org.telegram.ui.Components.md0 md0Var = new org.telegram.ui.Components.md0(launchActivity);
            md0Var.setTextColor(-1);
            md0Var.setSelectorColor(-9598483);
            md0Var.setTextOffset(AndroidUtilities.dp(10.0f));
            md0Var.setItemCount(5);
            z30 z30Var = new z30(launchActivity);
            z30Var.setItemCount(5);
            z30Var.setTextColor(-1);
            z30Var.setSelectorColor(-9598483);
            z30Var.setTextOffset(-AndroidUtilities.dp(10.0f));
            a40 a40Var = new a40(launchActivity);
            a40Var.setItemCount(5);
            a40Var.setTextColor(-1);
            a40Var.setSelectorColor(-9598483);
            a40Var.setTextOffset(-AndroidUtilities.dp(34.0f));
            b40 b40Var = new b40(launchActivity);
            this.T = b40Var;
            b40Var.setLines(1);
            b40Var.setSingleLine(true);
            b40Var.setEllipsize(TextUtils.TruncateAt.END);
            b40Var.setGravity(17);
            b40Var.setTextColor(-1);
            b40Var.setTypeface(AndroidUtilities.bold());
            b40Var.setTextSize(1, 14.0f);
            this.containerView.addView(b40Var, org.telegram.ui.Components.gb1.h(-1, 48.0f, 81, 21.0f, 0.0f, 21.0f, 20.5f));
            b40Var.setOnClickListener(new org.telegram.messenger.video.f(this, md0Var, z30Var, a40Var, chat, accountInstance, inputPeer2, 1));
            d40 d40Var = new d40(launchActivity, md0Var, z30Var, a40Var);
            this.R = d40Var;
            d40Var.setWeightSum(1.0f);
            d40Var.setOrientation(0);
            this.containerView.addView(d40Var, org.telegram.ui.Components.gb1.h(-1, 270.0f, 51, 0.0f, 50.0f, 0.0f, 0.0f));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i26 = calendar.get(1);
            int i27 = calendar.get(6);
            d40Var.addView(md0Var, org.telegram.ui.Components.gb1.p(0.5f, 0, 270));
            md0Var.setMinValue(0);
            md0Var.setMaxValue(365);
            md0Var.setWrapSelectorWheel(false);
            md0Var.setFormatter(new j20(currentTimeMillis, calendar, i26, 0));
            a1.d dVar = new a1.d(this, md0Var, z30Var, a40Var, 13);
            v50Var = this;
            md0Var.setOnValueChangedListener(dVar);
            z30Var.setMinValue(0);
            z30Var.setMaxValue(23);
            d40Var.addView(z30Var, org.telegram.ui.Components.gb1.p(0.2f, 0, 270));
            z30Var.setFormatter(new org.telegram.ui.Components.voip.c1(7));
            z30Var.setOnValueChangedListener(dVar);
            a40Var.setMinValue(0);
            a40Var.setMaxValue(59);
            a40Var.setValue(0);
            a40Var.setFormatter(new org.telegram.ui.Components.voip.c1(8));
            d40Var.addView(a40Var, org.telegram.ui.Components.gb1.p(0.3f, 0, 270));
            a40Var.setOnValueChangedListener(dVar);
            calendar.setTimeInMillis(currentTimeMillis + 10800000);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            int i28 = calendar.get(6);
            int i29 = calendar.get(12);
            int i30 = calendar.get(11);
            md0Var.setValue(i27 != i28 ? 1 : 0);
            a40Var.setValue(i29);
            z30Var.setValue(i30);
            org.telegram.ui.Components.g5.g(b40Var, textView, 0L, 604800L, 2, md0Var, z30Var, a40Var);
        } else {
            v50Var = this;
        }
        e40 e40Var = new e40(v50Var, (ViewGroup) v50Var.getWindow().getDecorView(), v50Var.containerView);
        v50Var.f44620c2 = e40Var;
        e40Var.E = new f40(v50Var);
        o30Var.setPinchToZoomHelper(e40Var);
        v50Var.f44661n.setOnClickListener(new View.OnClickListener(v50Var) {
            public final v50 f40789b;

            {
                this.f40789b = v50Var;
            }

            @Override
            public final void onClick(View view4) {
                switch (r3) {
                    case 0:
                        v50.o(this.f40789b, launchActivity);
                        return;
                    default:
                        v50 v50Var2 = this.f40789b;
                        v50Var2.a2.e();
                        ChatObject.Call call2 = v50Var2.f44610a1;
                        if (call2 != null && !call2.isScheduled()) {
                            v50Var2.J1();
                            v50.t1(launchActivity, new h20(v50Var2, 5), false, false);
                            return;
                        }
                        v50Var2.dismiss();
                        return;
                }
            }
        });
        v50Var.M1(false);
        v50Var.J1();
        v50Var.N1(false);
        v50Var.O1(false, false);
        v50Var.B1(0.0f);
        v50Var.P1();
        v50Var.containerView.addView(new FrameLayout(launchActivity), org.telegram.ui.Components.gb1.i(-1, 200, 87));
        v50Var.v.setOnClickListener(new f20(v50Var, 6));
        v50Var.T0();
        org.telegram.ui.Components.gb1.b(v50Var.f44661n);
        org.telegram.ui.Components.gb1.b(v50Var.f44678r);
        org.telegram.ui.Components.gb1.b(v50Var.f44630f);
        org.telegram.ui.Components.gb1.b(v50Var.h);
        org.telegram.ui.Components.gb1.b(v50Var.f44700w);
        org.telegram.ui.Components.gb1.b(v50Var.f44683s);
        org.telegram.ui.Components.gb1.b(v50Var.v);
        r0.i0.m(v50Var.containerView, new e20(v50Var, 2));
    }

    public static r0.k1 A(v50 v50Var, r0.k1 k1Var) {
        int keyboardHeight;
        r0.h1 h1Var = k1Var.f47118a;
        i0.b f7 = h1Var.f(647);
        i0.b f10 = h1Var.f(8);
        u30 u30Var = v50Var.H;
        if (!u30Var.N && !u30Var.e) {
            keyboardHeight = 0;
        } else {
            keyboardHeight = u30Var.getKeyboardHeight();
        }
        int max = Math.max(f10.d, keyboardHeight);
        ViewGroup.LayoutParams layoutParams = v50Var.f44615b2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = -f7.d;
        }
        if (u30Var.getEmojiView() != null) {
            u30Var.getEmojiView().setBottomInset(f7.d);
        }
        if (v50Var.S2) {
            ViewGroup viewGroup = v50Var.containerView;
            int i10 = v50Var.backgroundPaddingLeft;
            viewGroup.setPadding(i10, 0, i10, 0);
        } else {
            ViewGroup viewGroup2 = v50Var.containerView;
            int i11 = v50Var.backgroundPaddingLeft;
            viewGroup2.setPadding(f7.f13450a + i11, f7.f13451b, i11 + f7.f13452c, f7.d);
        }
        v50Var.containerView.requestLayout();
        if (max == 0 && !u30Var.N && !u30Var.e && !u30Var.O) {
            u30Var.j();
        }
        if (max > 0) {
            org.telegram.ui.Components.fl0 fl0Var = v50Var.K;
            if (fl0Var == null) {
                org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
                fl0Var = null;
                if (R != null) {
                    org.telegram.ui.Components.fl0 fl0Var2 = new org.telegram.ui.Components.fl0(1, v50Var.currentAccount, v50Var.getContext(), R, v50Var.resourcesProvider);
                    v50Var.K = fl0Var2;
                    fl0Var2.setDelegate(new x40(v50Var));
                    v50Var.containerView.addView(v50Var.K, org.telegram.ui.Components.gb1.i(-2, 52, 81));
                    v50Var.K.p(null, null, false);
                    v50Var.G.bringToFront();
                    v50Var.F.bringToFront();
                    fl0Var = v50Var.K;
                }
            }
            v50Var.K = fl0Var;
        }
        u30Var.I(f10.d, false);
        v50Var.C1.j(k1Var);
        return r0.k1.f47117b;
    }

    public static String A0() {
        String[][] strArr = EmojiData.data;
        String[] strArr2 = strArr[(int) Math.floor(Math.random() * strArr.length)];
        return strArr2[(int) Math.floor(Math.random() * strArr2.length)];
    }

    public static void B(v50 v50Var, org.telegram.ui.ActionBar.e2 e2Var, TLObject tLObject, TL_phone.exportGroupCallInvite exportgroupcallinvite, TLRPC.TL_error tL_error) {
        TLRPC.GroupCall groupCall;
        e2Var.dismiss();
        boolean z10 = false;
        if (tLObject instanceof TL_phone.exportedGroupCallInvite) {
            Context context = v50Var.getContext();
            int i10 = v50Var.currentAccount;
            TLRPC.InputGroupCall inputGroupCall = exportgroupcallinvite.call;
            String str = ((TL_phone.exportedGroupCallInvite) tLObject).link;
            org.telegram.ui.ActionBar.u6 u6Var = v50Var.resourcesProvider;
            ChatObject.Call call = v50Var.f44610a1;
            if (call != null && (groupCall = call.call) != null && groupCall.creator) {
                z10 = true;
            }
            o9.i0(context, i10, inputGroupCall, str, u6Var, false, z10);
        } else if (tL_error != null) {
            new org.telegram.ui.Components.wc(v50Var.topBulletinContainer, new di.k0()).g0(tL_error, false);
        }
    }

    public static void B0(v50 v50Var) {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("reminderhint", false)) {
            return;
        }
        globalMainSettings.edit().putBoolean("reminderhint", true).commit();
        if (v50Var.f44662n0 == null) {
            org.telegram.ui.Components.t40 t40Var = new org.telegram.ui.Components.t40(v50Var.getContext(), 8);
            v50Var.f44662n0 = t40Var;
            t40Var.setAlpha(0.0f);
            v50Var.f44662n0.setVisibility(4);
            v50Var.f44662n0.setShowingDuration(4000L);
            v50Var.containerView.addView(v50Var.f44662n0, org.telegram.ui.Components.gb1.h(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            v50Var.f44662n0.setText(LocaleController.getString(R.string.VoipChatReminderHint));
            v50Var.f44662n0.d();
        }
        v50Var.f44662n0.setExtraTranslationY(-AndroidUtilities.statusBarHeight);
        v50Var.f44662n0.f(v50Var.f44700w, true);
    }

    public static void C(v50 v50Var, int[] iArr, float[] fArr) {
        ArrayList<TLRPC.GroupCallParticipant> arrayList;
        s4.e1 K;
        i30 i30Var = v50Var.f44659m2;
        m30 m30Var = v50Var.a2;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            TLRPC.GroupCallParticipant groupCallParticipant = v50Var.f44610a1.participantsBySources.get(iArr[i10]);
            if (groupCallParticipant != null) {
                if (!m30Var.f33903b) {
                    if (v50Var.f44684s0) {
                        arrayList = v50Var.D0;
                    } else {
                        arrayList = v50Var.f44610a1.visibleParticipants;
                    }
                    int indexOf = arrayList.indexOf(groupCallParticipant);
                    if (indexOf >= 0 && (K = v50Var.Q.K(indexOf + v50Var.P.d)) != null) {
                        View view = K.f47738a;
                        if (view instanceof org.telegram.ui.Cells.i4) {
                            ((org.telegram.ui.Cells.i4) view).setAmplitude(fArr[i10] * 15.0f);
                            if (view == v50Var.X2 && !v50Var.f44656l2) {
                                v50Var.containerView.invalidate();
                            }
                        }
                    }
                } else {
                    for (int i11 = 0; i11 < i30Var.getChildCount(); i11++) {
                        org.telegram.ui.Components.b30 b30Var = (org.telegram.ui.Components.b30) i30Var.getChildAt(i11);
                        if (MessageObject.getPeerId(b30Var.getParticipant().peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                            b30Var.setAmplitude(fArr[i10] * 15.0f);
                        }
                    }
                }
                m30Var.k(groupCallParticipant, fArr[i10] * 15.0f);
            }
        }
    }

    public static void D(v50 v50Var) {
        Editable text = v50Var.H.getText();
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = text.toString();
        tL_textWithEntities.entities = MediaDataController.getInstance(v50Var.currentAccount).getEntities(new CharSequence[]{text}, true);
        v50Var.A1(tL_textWithEntities);
    }

    public static void F0(v50 v50Var) {
        ChatObject.Call call = v50Var.f44610a1;
        if (call != null && call.call != null) {
            TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
            togglegroupcallsettings.call = v50Var.f44610a1.getInputGroupCall();
            togglegroupcallsettings.join_muted = Boolean.valueOf(v50Var.f44610a1.call.join_muted);
            ConnectionsManager connectionsManager = v50Var.d.getConnectionsManager();
            DispatchQueue2 dispatchQueue2 = Utilities.stageQueue;
            Objects.requireNonNull(dispatchQueue2);
            connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.i1(dispatchQueue2), new q20(v50Var, 1));
        }
    }

    public static void F1(org.telegram.ui.ActionBar.g1 g1Var, int i10) {
        if (g1Var != null) {
            g1Var.d(i10, i10);
        }
    }

    public static void G0(v50 v50Var, boolean z10) {
        if (v50Var.f44610a1 == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        togglegroupcallsettings.call = v50Var.f44610a1.getInputGroupCall();
        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
        v50Var.f44709x3 = Boolean.valueOf(z10);
        v50Var.I1(true);
        ConnectionsManager connectionsManager = v50Var.d.getConnectionsManager();
        DispatchQueue2 dispatchQueue2 = Utilities.stageQueue;
        Objects.requireNonNull(dispatchQueue2);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.i1(dispatchQueue2), new q20(v50Var, 0));
    }

    public static void H0(v50 v50Var) {
        boolean z10;
        int i10;
        if (v50Var.r1()) {
            m30 m30Var = v50Var.a2;
            if (!m30Var.V && m30Var.f33903b && (F3 == v50Var.q1() || AndroidUtilities.isTablet())) {
                z10 = false;
            } else {
                z10 = true;
            }
            Boolean bool = v50Var.f44649j2;
            if (bool != null && z10 == bool.booleanValue()) {
                return;
            }
            int systemUiVisibility = v50Var.containerView.getSystemUiVisibility();
            if (z10) {
                i10 = systemUiVisibility & (-7);
                v50Var.getWindow().clearFlags(1024);
                v50Var.setHideSystemVerticalInsets(false);
            } else {
                v50Var.setHideSystemVerticalInsets(true);
                i10 = systemUiVisibility | 6;
                v50Var.getWindow().addFlags(1024);
            }
            v50Var.containerView.setSystemUiVisibility(i10);
            v50Var.f44649j2 = Boolean.valueOf(z10);
            v50Var.S2 = !z10;
            v50Var.containerView.requestApplyInsets();
            return;
        }
        v50Var.isFullscreen = false;
    }

    public static org.telegram.ui.Components.voip.l I0(v50 v50Var) {
        b50 b50Var = v50Var.Q;
        for (int i10 = 0; i10 < b50Var.getChildCount(); i10++) {
            View childAt = b50Var.getChildAt(i10);
            if (childAt.isAttachedToWindow() && (childAt instanceof org.telegram.ui.Components.voip.l) && RecyclerView.R(childAt) >= 0) {
                return (org.telegram.ui.Components.voip.l) childAt;
            }
        }
        return null;
    }

    public static void J0(v50 v50Var) {
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
        r40 r40Var = v50Var.O;
        b50 b50Var = v50Var.Q;
        int childCount = b50Var.getChildCount();
        boolean z12 = false;
        float f14 = 2.1474836E9f;
        for (int i10 = 0; i10 < childCount; i10++) {
            if (RecyclerView.R(b50Var.getChildAt(i10)) >= 0) {
                f14 = Math.min(f14, childAt.getTop());
            }
        }
        if (f14 < 0.0f || f14 == 2.1474836E9f) {
            if (childCount != 0) {
                f14 = 0.0f;
            } else {
                f14 = b50Var.getPaddingTop();
            }
        }
        if (f14 <= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - AndroidUtilities.dp(14.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        float dp4 = f14 + AndroidUtilities.dp(14.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if ((z10 && r40Var.getTag() == null) || (!z10 && r40Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            r40Var.setTag(num);
            AnimatorSet animatorSet = v50Var.f44639h0;
            if (animatorSet != null) {
                animatorSet.cancel();
                v50Var.f44639h0 = null;
            }
            if (r40Var.getTag() == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            v50Var.setUseLightStatusBar(z11);
            ViewPropertyAnimator animate = r40Var.getBackButton().animate();
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
            org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.f27586f;
            duration.setInterpolator(dsVar).start();
            ViewPropertyAnimator animate2 = r40Var.getTitleTextView().animate();
            if (z10) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(23.0f);
            }
            animate2.translationY(dp).setDuration(300L).setInterpolator(dsVar).start();
            ObjectAnimator objectAnimator = v50Var.U2;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                v50Var.U2.cancel();
            }
            org.telegram.ui.ActionBar.b6 subtitleTextView = r40Var.getSubtitleTextView();
            Property property = View.TRANSLATION_Y;
            float translationY = r40Var.getSubtitleTextView().getTranslationY();
            if (z10) {
                dp2 = 0.0f;
            } else {
                dp2 = AndroidUtilities.dp(20.0f);
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(subtitleTextView, property, translationY, dp2);
            v50Var.U2 = ofFloat;
            ofFloat.setDuration(300L);
            v50Var.U2.setInterpolator(dsVar);
            v50Var.U2.addListener(new q40(0, v50Var, z10));
            v50Var.U2.start();
            ObjectAnimator objectAnimator2 = v50Var.V2;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            org.telegram.ui.ActionBar.b6 additionalSubtitleTextView = r40Var.getAdditionalSubtitleTextView();
            if (z10) {
                dp3 = 0.0f;
            } else {
                dp3 = AndroidUtilities.dp(20.0f);
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(additionalSubtitleTextView, property, dp3);
            v50Var.V2 = ofFloat2;
            ofFloat2.setDuration(300L);
            v50Var.V2.setInterpolator(dsVar);
            v50Var.V2.start();
            AnimatorSet animatorSet2 = new AnimatorSet();
            v50Var.f44639h0 = animatorSet2;
            animatorSet2.setDuration(140L);
            AnimatorSet animatorSet3 = v50Var.f44639h0;
            Property property2 = View.ALPHA;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(r40Var, property2, f11);
            f30 f30Var = v50Var.N;
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(f30Var, property2, f12);
            View view = v50Var.f44635g0;
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(view, property2, f13));
            v50Var.f44639h0.addListener(new o40(v50Var, 1));
            v50Var.f44639h0.start();
            v50Var.a2.v.setClickable((!z10 || F3) ? true : true);
        }
        if (v50Var.f44711y0 != dp4) {
            v50Var.E1(dp4);
        }
    }

    public static void N(v50 v50Var, org.telegram.ui.Components.voip.l lVar, boolean z10) {
        if (!v50Var.isDismissed()) {
            if (z10 && lVar.getRenderer() == null) {
                lVar.setRenderer(org.telegram.ui.Components.voip.t.c(v50Var.Y1, v50Var.a2, lVar, null, null, lVar.getParticipant(), v50Var.f44610a1, v50Var));
            } else if (!z10 && lVar.getRenderer() != null) {
                lVar.getRenderer().setPrimaryView(null);
                lVar.setRenderer(null);
            }
        }
    }

    public static void S(v50 v50Var, int i10, int[] iArr) {
        if (v50Var.r1()) {
            int i11 = org.telegram.ui.ActionBar.y6.Kg;
            iArr[0] = org.telegram.ui.ActionBar.y6.x0(null, i11, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Lg, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23775zg, false), v50Var.U1, 1.0f);
            iArr[2] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23494kg, false), org.telegram.ui.ActionBar.y6.x0(null, i11, false), v50Var.U1, 1.0f);
        } else if (i10 == 0) {
            iArr[0] = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Jg, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23758yg, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23775zg, false), v50Var.U1, 1.0f);
            iArr[2] = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23740xg, false);
        } else if (i10 == 1) {
            iArr[0] = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Gg, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Bg, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Cg, false), v50Var.U1, 1.0f);
            iArr[2] = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Ag, false);
        } else if (p1(i10)) {
            iArr[0] = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23495kh, false);
            iArr[1] = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23512lh, false);
            iArr[2] = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23531mh, false);
        } else {
            int i12 = org.telegram.ui.ActionBar.y6.Kg;
            iArr[0] = org.telegram.ui.ActionBar.y6.x0(null, i12, false);
            iArr[1] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Mg, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Ng, false), v50Var.U1, 1.0f);
            iArr[2] = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23494kg, false), org.telegram.ui.ActionBar.y6.x0(null, i12, false), v50Var.U1, 1.0f);
        }
        if (p1(i10)) {
            iArr[3] = i0.a.f(0.5f, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23456ih, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23495kh, false));
        } else if (i10 == 1) {
            iArr[3] = i0.a.f(0.75f, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Bg, false), i0.a.f(0.5f, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Fg, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Hg, false)));
        } else {
            iArr[3] = i0.a.f(0.5f, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Jg, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Ig, false));
        }
    }

    public static void c1(LaunchActivity launchActivity, AccountInstance accountInstance, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        if (D3 == null) {
            if (inputPeer != null || VoIPService.getSharedInstance() != null) {
                if (inputPeer != null) {
                    D3 = new v50(launchActivity, accountInstance, accountInstance.getMessagesController().getGroupCall(chat.f22027id, false), chat, inputPeer, z10, str);
                } else {
                    ChatObject.Call call = VoIPService.getSharedInstance().groupCall;
                    if (call != null) {
                        TLRPC.Chat chat2 = accountInstance.getMessagesController().getChat(Long.valueOf(call.chatId));
                        call.addSelfDummyParticipant(true);
                        D3 = new v50(launchActivity, accountInstance, call, chat2, null, z10, str);
                    } else {
                        return;
                    }
                }
                D3.f44643i0 = launchActivity;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.k5(26));
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

    public static void m(v50 v50Var, ChatObject.Call.InvitedUser invitedUser, Long l4) {
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = invitedUser.msg_id;
        ConnectionsManager.getInstance(v50Var.currentAccount).sendRequest(declineconferencecallinvite, new p20(v50Var, 0));
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(invitedUser.msg_id));
        MessagesController.getInstance(v50Var.currentAccount).deleteMessages(arrayList, null, null, 0L, 0, true, 0);
        ChatObject.Call call = v50Var.f44610a1;
        if (call != null) {
            call.invitedUsers.remove(l4);
            v50Var.f44610a1.invitedUsersMap.remove(l4);
            v50Var.f44610a1.invitedUsersMessageIds.remove(l4);
            v50Var.O0(true);
        }
    }

    public static void n(v50 v50Var, Activity activity, ChatObject.Call call, View view, int i10) {
        TLRPC.Chat chat;
        final ChatObject.Call.InvitedUser invitedUser;
        AccountInstance accountInstance = v50Var.d;
        ArrayList arrayList = v50Var.F0;
        p50 p50Var = v50Var.P;
        if (view instanceof org.telegram.ui.Components.voip.l) {
            v50Var.e1(((org.telegram.ui.Components.voip.l) view).getParticipant());
        } else if (view instanceof org.telegram.ui.Cells.i4) {
            v50Var.G1((org.telegram.ui.Cells.i4) view);
        } else {
            Collection collection = null;
            r7 = null;
            r7 = null;
            r7 = null;
            final Long l4 = null;
            boolean z10 = true;
            if (view instanceof org.telegram.ui.Cells.a4) {
                org.telegram.ui.Cells.a4 a4Var = (org.telegram.ui.Cells.a4) view;
                if (a4Var.getUser() != null) {
                    if (v50Var.o1()) {
                        int i11 = i10 - p50Var.f42357n;
                        if (i11 >= 0 && i11 < v50Var.f44610a1.shadyJoinParticipants.size()) {
                            l4 = v50Var.f44610a1.shadyJoinParticipants.get(i10 - p50Var.f42357n);
                        } else {
                            int i12 = i10 - p50Var.f42359s;
                            if (i12 >= 0 && i12 < v50Var.f44610a1.shadyLeftParticipants.size()) {
                                l4 = v50Var.f44610a1.shadyLeftParticipants.get(i10 - p50Var.f42359s);
                            } else {
                                int i13 = i10 - p50Var.f42356f;
                                if (v50Var.f44684s0) {
                                    if (i13 >= 0 && i13 < arrayList.size()) {
                                        l4 = (Long) arrayList.get(i13);
                                    }
                                } else if (i13 >= 0 && i13 < v50Var.f44610a1.invitedUsers.size()) {
                                    l4 = v50Var.f44610a1.invitedUsers.get(i13);
                                }
                                z10 = false;
                            }
                        }
                        if (!z10 && (invitedUser = v50Var.f44610a1.invitedUsersMessageIds.get(l4)) != null) {
                            org.telegram.ui.Components.k80 F = org.telegram.ui.Components.k80.F(v50Var.container, v50Var.resourcesProvider, a4Var);
                            F.l(R.drawable.msg_endcall, LocaleController.getString(R.string.GroupCallStopCallingInvite), new Runnable(v50Var) {
                                public final v50 f41744b;

                                {
                                    this.f41744b = v50Var;
                                }

                                @Override
                                public final void run() {
                                    switch (r4) {
                                        case 0:
                                            v50.r(this.f41744b, invitedUser, l4);
                                            return;
                                        default:
                                            v50.m(this.f41744b, invitedUser, l4);
                                            return;
                                    }
                                }
                            }, invitedUser.isCalling());
                            F.c(R.drawable.msg_remove, LocaleController.getString(R.string.GroupCallDiscardInvite), new Runnable(v50Var) {
                                public final v50 f41744b;

                                {
                                    this.f41744b = v50Var;
                                }

                                @Override
                                public final void run() {
                                    switch (r4) {
                                        case 0:
                                            v50.r(this.f41744b, invitedUser, l4);
                                            return;
                                        default:
                                            v50.m(this.f41744b, invitedUser, l4);
                                            return;
                                    }
                                }
                            }, false);
                            F.W(org.telegram.ui.ActionBar.y6.d0(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), v50Var.C0.getColor()));
                            F.f29868s = 96;
                            F.Z();
                            return;
                        }
                        return;
                    }
                    v50Var.f44643i0.P0(v50Var.currentAccount);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", a4Var.getUser().f22176id);
                    if (a4Var.f23847a.getImageReceiver().hasNotThumb()) {
                        bundle.putBoolean("expandPhoto", true);
                    }
                    v50Var.f44643i0.u0(new ProfileActivity(bundle, null));
                    v50Var.dismiss();
                }
            } else if (i10 == p50Var.f42360w) {
                if (ChatObject.isChannel(v50Var.Z0) && (chat = v50Var.Z0) != null && !chat.megagroup && ChatObject.isPublic(chat)) {
                    v50Var.j1(false);
                    return;
                }
                TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(v50Var.i1());
                if (chatFull != null) {
                    v50Var.f44701w0 = false;
                    Context context = v50Var.getContext();
                    int currentAccount = accountInstance.getCurrentAccount();
                    TLRPC.Chat chat2 = v50Var.Z0;
                    ChatObject.Call call2 = v50Var.f44610a1;
                    org.telegram.ui.Components.c40 c40Var = new org.telegram.ui.Components.c40(context, currentAccount, chat2, chatFull, call2.participants, call2.invitedUsersMap);
                    v50Var.E1 = c40Var;
                    c40Var.setOnDismissListener(new l20(v50Var, 2));
                    org.telegram.ui.Components.c40 c40Var2 = v50Var.E1;
                    c40Var2.f27063g0 = new v20(v50Var);
                    c40Var2.show();
                }
            } else if (i10 == p50Var.f42361x) {
                ChatObject.Call call3 = v50Var.f44610a1;
                if (call3 != null && call3.call != null) {
                    vg.n1 n1Var = new vg.n1(activity, v50Var.currentAccount, null, 4, new di.k0());
                    ChatObject.Call call4 = v50Var.f44610a1;
                    if (call4 != null) {
                        collection = (Collection) Collection.EL.stream(call4.sortedParticipants).map(new k2.g(5)).collect(Collectors.toSet());
                    }
                    n1Var.C0.addAll(collection);
                    n1Var.h0(false, true);
                    n1Var.A0 = new h20(v50Var, 3);
                    n1Var.h0(false, true);
                    n1Var.D0 = new bi.m5(18, v50Var, call);
                    n1Var.show();
                }
            } else if (i10 == p50Var.f42362y) {
                v50Var.v1();
            }
        }
    }

    public static void o(v50 v50Var, Activity activity) {
        LaunchActivity launchActivity = v50Var.f44643i0;
        if (launchActivity != null && launchActivity.checkSelfPermission("android.permission.CAMERA") != 0) {
            v50Var.f44643i0.requestPermissions(new String[]{"android.permission.CAMERA"}, 104);
        } else if (VoIPService.getSharedInstance() != null) {
            boolean z10 = false;
            if (VoIPService.getSharedInstance().getVideoState(false) != 2) {
                v50Var.f44647j0[0].d(1, false);
                if (v50Var.f44714z0 == null) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    if (sharedInstance != null) {
                        sharedInstance.createCaptureDevice(false);
                    }
                    if (VoIPService.getSharedInstance().getVideoState(true) != 2) {
                        z10 = true;
                    }
                    g40 g40Var = new g40(v50Var, activity, z10);
                    v50Var.f44714z0 = g40Var;
                    g40Var.setBottomPadding(v50Var.containerView.getPaddingBottom());
                    v50Var.container.addView(v50Var.f44714z0);
                    if (sharedInstance != null && !sharedInstance.isFrontFaceCamera()) {
                        sharedInstance.switchCamera();
                        return;
                    }
                    return;
                }
                return;
            }
            VoIPService.getSharedInstance().setVideoState(false, 0);
            v50Var.O1(true, false);
            v50Var.N1(false);
            v50Var.f44610a1.sortParticipants();
            v50Var.O0(true);
            v50Var.e.requestLayout();
        }
    }

    public static void p(v50 v50Var, float f7, float f10, float f11, int i10, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        v50Var.f44624d2 = floatValue;
        v50Var.a2.f33917n = floatValue;
        float f12 = (floatValue * 1.0f) + ((1.0f - floatValue) * f7);
        p30 p30Var = v50Var.C2;
        p30Var.setScaleX(f12);
        p30Var.setScaleY(f12);
        p30Var.setTranslationX((1.0f - v50Var.f44624d2) * f10);
        p30Var.setTranslationY((1.0f - v50Var.f44624d2) * f11);
        if (!v50Var.f44637g2) {
            v50Var.W2.setAlpha((int) (v50Var.f44624d2 * 100.0f));
        }
        org.telegram.ui.Components.voip.t tVar = v50Var.Z2;
        if (tVar != null) {
            tVar.f34074a.setRoundCorners((1.0f - v50Var.f44624d2) * AndroidUtilities.dp(8.0f));
        }
        p30Var.invalidate();
        v50Var.containerView.invalidate();
        o30 o30Var = v50Var.f44612b;
        int i11 = (int) ((1.0f - v50Var.f44624d2) * i10);
        o30Var.N(i11, i11);
    }

    public static boolean p1(int i10) {
        if ((VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().groupCall == null || !VoIPService.getSharedInstance().groupCall.call.rtmp_stream) && i10 != 2 && i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            return false;
        }
        return true;
    }

    public static void q(v50 v50Var, ChatObject.Call call, Boolean bool, HashSet hashSet) {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance;
        ChatObject.Call call2 = v50Var.f44610a1;
        if (call2 != null && (groupCall = call2.call) != null) {
            String str = groupCall.invite_link;
            int size = hashSet.size();
            AtomicInteger atomicInteger = new AtomicInteger(0);
            HashSet hashSet2 = new HashSet();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                long longValue = ((Long) it.next()).longValue();
                v50Var.f44610a1.addInvitedUser(longValue);
                TL_phone.inviteConferenceCallParticipant inviteconferencecallparticipant = new TL_phone.inviteConferenceCallParticipant();
                TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                inviteconferencecallparticipant.call = tL_inputGroupCall;
                TLRPC.GroupCall groupCall2 = v50Var.f44610a1.call;
                tL_inputGroupCall.f22044id = groupCall2.f22037id;
                tL_inputGroupCall.access_hash = groupCall2.access_hash;
                inviteconferencecallparticipant.user_id = MessagesController.getInstance(v50Var.currentAccount).getInputUser(longValue);
                inviteconferencecallparticipant.video = bool.booleanValue();
                ConnectionsManager.getInstance(v50Var.currentAccount).sendRequest(inviteconferencecallparticipant, new hi.g1(v50Var, longValue, hashSet2, atomicInteger, size, call, str));
            }
            v50Var.O0(true);
            if (bool.booleanValue() && (sharedInstance = VoIPService.getSharedInstance()) != null && sharedInstance.getVideoState(false) != 2 && sharedInstance.getVideoState(false) != 1) {
                sharedInstance.createCaptureDevice(false);
                if (!sharedInstance.isFrontFaceCamera()) {
                    sharedInstance.switchCamera();
                }
                sharedInstance.requestVideoCall(false);
                sharedInstance.setVideoState(false, 2);
                sharedInstance.setMicMute(false, false, true);
                sharedInstance.switchToSpeaker();
                v50Var.O1(true, true);
            }
        }
    }

    public static void r(v50 v50Var, ChatObject.Call.InvitedUser invitedUser, Long l4) {
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = invitedUser.msg_id;
        ConnectionsManager.getInstance(v50Var.currentAccount).sendRequest(declineconferencecallinvite, new p20(v50Var, 1));
        ChatObject.Call call = v50Var.f44610a1;
        if (call != null) {
            invitedUser.calling = false;
            call.invitedUsersMessageIds.put(l4, invitedUser);
            v50Var.O0(true);
        }
    }

    public static void s(v50 v50Var, TLObject tLObject) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(v50Var.currentAccount).lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
        }
    }

    public static void t(v50 v50Var) {
        v50Var.Y0();
        v50Var.V0();
        v50Var.U0();
        v50Var.F.setTranslationY((-v50Var.C1.d()) + v50Var.containerView.getPaddingBottom());
        v50Var.G.invalidate();
        v50Var.Z0();
        v50Var.containerView.invalidate();
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
                    alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertTitle);
                    alertDialog$Builder.f22368a.T = LocaleController.getString(R.string.VoipChannelLeaveConferenceAlertText);
                } else if (ChatObject.isChannelOrGiga(chat)) {
                    alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.VoipChannelLeaveAlertTitle);
                    alertDialog$Builder.f22368a.T = LocaleController.getString(R.string.VoipChannelLeaveAlertText);
                } else {
                    alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.VoipGroupLeaveAlertTitle);
                    alertDialog$Builder.f22368a.T = LocaleController.getString(R.string.VoipGroupLeaveAlertText);
                }
                sharedInstance.getAccount();
                org.telegram.ui.Cells.y1[] y1VarArr = new org.telegram.ui.Cells.y1[1];
                LinearLayout d = org.telegram.messenger.vh.d(context, 1);
                if (!sharedInstance.isConference() || (call != null && (groupCall = call.call) != null && groupCall.creator)) {
                    org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(context, 1);
                    y1VarArr[0] = y1Var;
                    y1Var.setBackground(org.telegram.ui.ActionBar.y6.M0(false));
                    if (z10) {
                        y1VarArr[0].setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23464j5, false));
                    } else {
                        y1VarArr[0].setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23438hg, false));
                        CheckBoxSquare checkBoxSquare = (CheckBoxSquare) y1VarArr[0].getCheckBoxView();
                        int i10 = org.telegram.ui.ActionBar.y6.f23624rg;
                        int i11 = org.telegram.ui.ActionBar.y6.f23588pg;
                        int i12 = org.telegram.ui.ActionBar.y6.f23550ng;
                        checkBoxSquare.f26104s = i10;
                        checkBoxSquare.v = i11;
                        checkBoxSquare.f26105w = i12;
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
                    d.addView(y1VarArr[0], org.telegram.ui.Components.gb1.r(-1, -2));
                    y1VarArr[0].setOnClickListener(new i20(y1VarArr, 0));
                }
                alertDialog$Builder.o(d);
                alertDialog$Builder.f22368a.I = org.telegram.ui.ActionBar.y6.f23588pg;
                alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupLeave), new ag.j0(call, y1VarArr, selfId, runnable, 4));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                if (z10) {
                    alertDialog$Builder.f22368a.R0 = false;
                }
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
                if (z10) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        e2Var.getWindow().setType(2038);
                    } else {
                        e2Var.getWindow().setType(2003);
                    }
                    e2Var.getWindow().clearFlags(2);
                }
                if (!z10) {
                    e2Var.j(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23683ug, false));
                }
                e2Var.show();
                if (!z10) {
                    TextView textView = (TextView) e2Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23701vg, null);
                    }
                    e2Var.p(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23438hg, false));
                    return;
                }
                return;
            }
            w1(call, false, selfId, runnable);
        }
    }

    public static void u(v50 v50Var, TLObject tLObject) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(v50Var.currentAccount).lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
        }
    }

    public static void v(v50 v50Var, long j10, HashSet hashSet, AtomicInteger atomicInteger, int i10, ChatObject.Call call, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(v50Var.currentAccount).lambda$processUpdates$379(updates, false);
            AndroidUtilities.runOnUIThread(new a3.i0(v50Var, updates, j10, 27));
        } else if (tL_error != null && "USER_PRIVACY_RESTRICTED".equalsIgnoreCase(tL_error.text)) {
            hashSet.add(Long.valueOf(j10));
        }
        if (atomicInteger.incrementAndGet() == i10 && !hashSet.isEmpty()) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.e10(v50Var, hashSet, call, str, 15));
        }
    }

    public static void w(v50 v50Var, HashSet hashSet, ChatObject.Call call, String str) {
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
            arrayList.add(MessagesController.getInstance(v50Var.currentAccount).getUser(l4));
            getrequirementstocontact.f22233id.add(MessagesController.getInstance(v50Var.currentAccount).getInputUser(longValue));
        }
        org.telegram.ui.Components.i30 i30Var = new org.telegram.ui.Components.i30(v50Var, arrayList, arrayList2, arrayList3, str, 7);
        if (UserConfig.getInstance(v50Var.currentAccount).isPremium()) {
            i30Var.run();
        } else {
            ConnectionsManager.getInstance(v50Var.currentAccount).sendRequest(getrequirementstocontact, new ea(arrayList, arrayList2, i30Var, 13));
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

    public static void x(v50 v50Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        tg.j0 j0Var = new tg.j0(34, v50Var.currentAccount, U.getContext(), U, new di.k0());
        j0Var.M1(null, arrayList, arrayList2, arrayList3, str);
        j0Var.show();
    }

    public static void y(v50 v50Var, org.telegram.ui.ActionBar.e2[] e2VarArr, boolean z10, TLRPC.TL_error tL_error, long j10, TL_phone.inviteToGroupCall invitetogroupcall) {
        try {
            e2VarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        e2VarArr[0] = null;
        if (z10 && "USER_NOT_PARTICIPANT".equals(tL_error.text)) {
            v50Var.x1(null, j10, 3);
            return;
        }
        org.telegram.ui.Components.g5.e0(v50Var.currentAccount, tL_error, (org.telegram.ui.ActionBar.r2) v50Var.f44643i0.O().getFragmentStack().get(v50Var.f44643i0.O().getFragmentStack().size() - 1), invitetogroupcall, new Object[0]);
    }

    public final void A1(TLRPC.TL_textWithEntities tL_textWithEntities) {
        TLRPC.InputGroupCall inputGroupCall;
        long j10;
        this.H.setText("");
        ChatObject.Call call = this.f44610a1;
        if (call != null && call.call != null && (inputGroupCall = call.getInputGroupCall()) != null) {
            ChatObject.Call call2 = this.f44610a1;
            long j11 = call2.call.f22037id;
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
        m30 m30Var = this.a2;
        if (m30Var == null) {
            f10 = 0.0f;
        } else {
            f10 = m30Var.f33905c;
        }
        float max = Math.max(f7, f10);
        int i12 = org.telegram.ui.ActionBar.y6.f23474jg;
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, i12, false);
        int i13 = org.telegram.ui.ActionBar.y6.gg;
        int offsetColor = AndroidUtilities.getOffsetColor(x02, org.telegram.ui.ActionBar.y6.x0(null, i13, false), f7, 1.0f);
        this.V1 = offsetColor;
        this.N.setBackgroundColor(offsetColor);
        this.f44652k1.H(-14472653);
        this.f44631f0.setColorFilter(new PorterDuffColorFilter(this.V1, PorterDuff.Mode.MULTIPLY));
        this.navBarColor = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.y6.x0(null, i12, false), org.telegram.ui.ActionBar.y6.x0(null, i13, false), max, 1.0f);
        int offsetColor2 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23494kg, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23663tg, false), f7, 1.0f);
        f50 f50Var = this.f44670p0;
        if (f50Var != null) {
            f50Var.f39269j = offsetColor2;
            z10 z10Var = f50Var.f39267g;
            if (z10Var != null) {
                z10Var.invalidate();
            }
        }
        this.C0.setColor(offsetColor2);
        this.E.setColor(offsetColor2);
        this.F.invalidate();
        b50 b50Var = this.Q;
        b50Var.setGlowColor(offsetColor2);
        int i14 = this.F1;
        if (i14 == 3 || p1(i14)) {
            this.f44700w.invalidate();
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
        int offsetColor3 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Dg, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Eg, false), f7, 1.0f);
        this.f44683s.a(offsetColor3, offsetColor3);
        int offsetColor4 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23511lg, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23570og, false), f7, 1.0f);
        int offsetColor5 = AndroidUtilities.getOffsetColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23530mg, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23624rg, false), f7, 1.0f);
        int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, this.resourcesProvider);
        int childCount = b50Var.getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = b50Var.getChildAt(i16);
            if (childAt instanceof org.telegram.ui.Cells.b4) {
                org.telegram.ui.Cells.b4 b4Var = (org.telegram.ui.Cells.b4) childAt;
                if (o1()) {
                    b4Var.a(w02, w02);
                } else {
                    b4Var.a(offsetColor5, offsetColor4);
                }
            } else {
                boolean z10 = childAt instanceof org.telegram.ui.Cells.i4;
                r40 r40Var = this.O;
                if (z10) {
                    org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) childAt;
                    if (r40Var.getTag() != null) {
                        i11 = org.telegram.ui.ActionBar.y6.f23624rg;
                    } else {
                        i11 = org.telegram.ui.ActionBar.y6.f23530mg;
                    }
                    i4Var.f(i11, offsetColor5);
                } else if (childAt instanceof org.telegram.ui.Cells.a4) {
                    org.telegram.ui.Cells.a4 a4Var = (org.telegram.ui.Cells.a4) childAt;
                    if (r40Var.getTag() != null) {
                        i10 = org.telegram.ui.ActionBar.y6.f23624rg;
                    } else {
                        i10 = org.telegram.ui.ActionBar.y6.f23530mg;
                    }
                    a4Var.a(i10, offsetColor5);
                }
            }
        }
        this.containerView.invalidate();
        b50Var.invalidate();
        this.container.invalidate();
    }

    public final void C1(float f7) {
        b50 b50Var;
        TLRPC.GroupCallParticipant groupCallParticipant;
        ArrayList<TLRPC.GroupCallParticipant> arrayList;
        s4.e1 K;
        f7 = (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) ? 0.0f : 0.0f;
        float min = (float) (Math.min(8500.0d, 4000.0f * f7) / 8500.0d);
        this.P0 = min;
        this.Q0 = (min - this.O0) / 265.0f;
        ChatObject.Call call = this.f44610a1;
        if (call != null && (b50Var = this.Q) != null && (groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(MessageObject.getPeerId(this.A0))) != null) {
            m30 m30Var = this.a2;
            if (!m30Var.f33903b) {
                if (this.f44684s0) {
                    arrayList = this.D0;
                } else {
                    arrayList = this.f44610a1.visibleParticipants;
                }
                int indexOf = arrayList.indexOf(groupCallParticipant);
                if (indexOf >= 0 && (K = b50Var.K(indexOf + this.P.d)) != null) {
                    View view = K.f47738a;
                    if (view instanceof org.telegram.ui.Cells.i4) {
                        ((org.telegram.ui.Cells.i4) view).setAmplitude(f7 * 15.0f);
                        if (view == this.X2 && !this.f44656l2) {
                            this.containerView.invalidate();
                        }
                    }
                }
            } else {
                int i10 = 0;
                while (true) {
                    i30 i30Var = this.f44659m2;
                    if (i10 >= i30Var.getChildCount()) {
                        break;
                    }
                    org.telegram.ui.Components.b30 b30Var = (org.telegram.ui.Components.b30) i30Var.getChildAt(i10);
                    if (MessageObject.getPeerId(b30Var.getParticipant().peer) == MessageObject.getPeerId(groupCallParticipant.peer)) {
                        b30Var.setAmplitude(f7 * 15.0f);
                    }
                    i10++;
                }
            }
            m30Var.k(groupCallParticipant, f7 * 15.0f);
        }
    }

    public final void D1(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25) {
        this.f44638g3 = i10;
        this.f44642h3 = i11;
        this.f44646i3 = i12;
        this.f44650j3 = i13;
        this.f44654k3 = i14;
        this.f44657l3 = i15;
        this.f44660m3 = i16;
        this.f44665n3 = i17;
        this.f44669o3 = i18;
        this.f44673p3 = i19;
        this.f44677q3 = i20;
        this.f44682r3 = i21;
        this.f44687s3 = i22;
        this.f44691t3 = i23;
        this.f44695u3 = i24;
        this.f44699v3 = i25;
    }

    @Override
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        if (i10 == 2) {
            Y0();
            W0();
            X0();
            float f11 = 1.0f - this.f44717z3.e;
            z20 z20Var = this.e;
            z20Var.setAlpha(f11);
            this.a2.setProgressToHideUi(f7);
            this.f44659m2.invalidate();
            this.containerView.invalidate();
            z20Var.invalidate();
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

    public final void E1(float f7) {
        b50 b50Var;
        int dp;
        int i10;
        float f10;
        this.f44711y0 = f7;
        this.Q.setTopGlowOffset((int) (f7 - ((FrameLayout.LayoutParams) b50Var.getLayoutParams()).topMargin));
        float dp2 = f7 - AndroidUtilities.dp(74.0f);
        int i11 = ((this.backgroundPaddingTop + dp2) > (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2) ? 1 : ((this.backgroundPaddingTop + dp2) == (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2) ? 0 : -1));
        k50 k50Var = this.U0;
        m30 m30Var = this.a2;
        g30 g30Var = this.f44632f1;
        e30 e30Var = this.f44627e1;
        if (i11 < 0) {
            float min = Math.min(1.0f, (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2) - dp2) - this.backgroundPaddingTop) / (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + ((dp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f))));
            if (AndroidUtilities.isTablet()) {
                f10 = 17.0f;
            } else {
                f10 = 13.0f;
            }
            i10 = (int) (AndroidUtilities.dp(f10) * min);
            if (k50Var != null) {
                k50Var.setShadowOffset((int) (AndroidUtilities.dp(8.0f) * min));
            }
            if (Math.abs(Math.min(1.0f, min) - this.U1) > 1.0E-4f) {
                B1(Math.min(1.0f, min));
            }
            float A = d3.A(min, 0.1f, 1.2f, 1.0f);
            e30Var.setScaleX(Math.max(0.9f, A));
            e30Var.setScaleY(Math.max(0.9f, A));
            float f11 = 1.0f - (min * 1.2f);
            e30Var.setAlpha((1.0f - m30Var.f33905c) * Math.max(0.0f, f11));
            g30Var.setScaleX(Math.max(0.9f, A));
            g30Var.setScaleY(Math.max(0.9f, A));
            g30Var.setAlpha((1.0f - m30Var.f33905c) * Math.max(0.0f, f11));
        } else {
            e30Var.setScaleX(1.0f);
            e30Var.setScaleY(1.0f);
            e30Var.setAlpha(1.0f - m30Var.f33905c);
            g30Var.setScaleX(1.0f);
            g30Var.setScaleY(1.0f);
            g30Var.setAlpha(1.0f - m30Var.f33905c);
            if (this.U1 > 1.0E-4f) {
                B1(0.0f);
            }
            i10 = 0;
        }
        Y0();
        float f12 = i10;
        this.f44715z1.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f7 - AndroidUtilities.dp(53.0f)) - f12));
        this.f44648j1.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f7 - AndroidUtilities.dp(44.0f)) - f12));
        if (k50Var != null) {
            k50Var.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), f7 - AndroidUtilities.dp(37.0f)));
        }
        d40 d40Var = this.R;
        if (d40Var != null) {
            d40Var.setTranslationY(Math.max(AndroidUtilities.dp(4.0f), (f7 - AndroidUtilities.dp(44.0f)) - f12));
        }
        this.containerView.invalidate();
        R1();
    }

    public final boolean G1(android.view.View r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.v50.G1(android.view.View):boolean");
    }

    public final void H1(View view) {
        if (this.m0 == null) {
            org.telegram.ui.Components.t40 t40Var = new org.telegram.ui.Components.t40(8, getContext(), null, true);
            this.m0 = t40Var;
            t40Var.setAlpha(0.0f);
            this.m0.setVisibility(4);
            this.m0.setShowingDuration(3000L);
            this.containerView.addView(this.m0, org.telegram.ui.Components.gb1.h(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
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
        ChatObject.Call call = this.f44610a1;
        org.telegram.ui.Components.voip.w2 w2Var = this.v;
        org.telegram.ui.Components.voip.w2 w2Var2 = this.h;
        org.telegram.ui.Components.voip.w2 w2Var3 = this.f44678r;
        org.telegram.ui.Components.voip.w2 w2Var4 = this.f44630f;
        org.telegram.ui.Components.voip.w2 w2Var5 = this.f44661n;
        org.telegram.ui.Components.voip.w2 w2Var6 = this.f44683s;
        org.telegram.ui.Components.voip.w2 w2Var7 = this.f44700w;
        boolean z19 = true;
        z20 z20Var = this.e;
        boolean z20 = false;
        if (call != null && !call.isScheduled()) {
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(false) == 2) {
                z13 = true;
            } else {
                z13 = false;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f44610a1.participants.f(MessageObject.getPeerId(this.A0));
            if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !Q0()) {
                z14 = true;
            } else {
                z14 = false;
            }
            Boolean bool = this.f44709x3;
            if (bool != null) {
                z15 = bool.booleanValue();
            } else {
                TLRPC.GroupCall groupCall = this.f44610a1.call;
                if (groupCall != null && groupCall.messages_enabled) {
                    z15 = true;
                } else {
                    z15 = false;
                }
            }
            if (((!z14 && this.f44610a1.canRecordVideo()) || z13) && !r1()) {
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
            z20Var.c(w2Var7, true, z10);
            z20Var.c(w2Var6, true, z10);
            z20Var.c(w2Var5, z16, z10);
            z20Var.c(w2Var4, z18, z10);
            z20Var.c(w2Var3, z20, z10);
            z20Var.c(w2Var2, z17, z10);
            z20Var.c(w2Var, z15, z10);
            return;
        }
        if (this.V0 > 0.1f) {
            z11 = true;
        } else {
            z11 = false;
        }
        z20Var.c(w2Var7, z11, z10);
        if (this.V0 > 0.1f) {
            z12 = true;
        } else {
            z12 = false;
        }
        z20Var.c(w2Var6, z12, z10);
        if (this.V0 <= 0.1f) {
            z19 = false;
        }
        z20Var.c(w2Var3, z19, z10);
        z20Var.c(w2Var5, false, z10);
        z20Var.c(w2Var4, false, z10);
        z20Var.c(w2Var2, false, z10);
        z20Var.c(w2Var, false, z10);
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
        ChatObject.Call call2 = this.f44610a1;
        org.telegram.ui.ActionBar.w0 w0Var = this.f44652k1;
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f44658m1;
        if (call2 == null || call2.isScheduled()) {
            this.l1.setVisibility(4);
            w0Var2.setVisibility(8);
            if (this.f44610a1 == null) {
                w0Var.setVisibility(8);
                return;
            }
        }
        if (this.f44655l0) {
            return;
        }
        AccountInstance accountInstance = this.d;
        TLRPC.Chat chat4 = accountInstance.getMessagesController().getChat(Long.valueOf(i1()));
        if (chat4 != null) {
            this.Z0 = chat4;
        }
        boolean canUserDoAdminAction = ChatObject.canUserDoAdminAction(this.Z0, 3);
        org.telegram.ui.ActionBar.g1 g1Var = this.f44663n1;
        if (!canUserDoAdminAction && (((ChatObject.isChannel(this.Z0) && ((chat3 = this.Z0) == null || !chat3.megagroup)) || (!ChatObject.isPublic(this.Z0) && !ChatObject.canUserDoAdminAction(this.Z0, 3))) && (!ChatObject.isChannel(this.Z0) || (chat2 = this.Z0) == null || chat2.megagroup || !ChatObject.isPublic(chat2)))) {
            g1Var.setVisibility(8);
        } else {
            g1Var.setVisibility(0);
        }
        ChatObject.Call call3 = this.f44610a1;
        org.telegram.ui.ActionBar.g1 g1Var2 = this.f44712y1;
        org.telegram.ui.ActionBar.g1 g1Var3 = this.f44707x1;
        if (call3 != null && (groupCall2 = call3.call) != null && groupCall2.can_change_messages_enabled) {
            if (groupCall2.messages_enabled) {
                i13 = 8;
            } else {
                i13 = 0;
            }
            g1Var3.setVisibility(i13);
            if (this.f44610a1.call.messages_enabled) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            g1Var2.setVisibility(i14);
        } else {
            g1Var3.setVisibility(8);
            g1Var2.setVisibility(8);
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f44610a1.participants.f(MessageObject.getPeerId(this.A0));
        ChatObject.Call call4 = this.f44610a1;
        org.telegram.ui.ActionBar.g1 g1Var4 = this.f44675q1;
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
        org.telegram.ui.ActionBar.g1 g1Var5 = this.f44702w1;
        org.telegram.ui.ActionBar.g1 g1Var6 = this.f44667o1;
        boolean z12 = true;
        org.telegram.ui.ActionBar.g1 g1Var7 = this.f44685s1;
        org.telegram.ui.ActionBar.g1 g1Var8 = this.f44689t1;
        if (Q0) {
            g1Var5.setVisibility(0);
            g1Var6.setVisibility(0);
            if (r1()) {
                g1Var7.setVisibility(0);
                g1Var8.setVisibility(8);
            } else if (this.f44610a1.isScheduled()) {
                g1Var7.setVisibility(8);
                g1Var8.setVisibility(8);
            } else {
                g1Var7.setVisibility(0);
            }
            if (o1()) {
                g1Var7.setVisibility(8);
                g1Var6.setVisibility(8);
            }
            if (this.f44610a1.canRecordVideo() && !this.f44610a1.isScheduled() && !r1()) {
                g1Var8.setVisibility(0);
            } else {
                g1Var8.setVisibility(8);
            }
            w0Var2.setVisibility(8);
            boolean z13 = this.f44610a1.recording;
            q50 q50Var = this.f44623d1;
            q50Var.f42748f = z13;
            q50Var.d = 1.0f;
            q50Var.invalidateSelf();
            if (this.f44610a1.recording) {
                if (this.D1 == null) {
                    h20 h20Var = new h20(this, 6);
                    this.D1 = h20Var;
                    AndroidUtilities.runOnUIThread(h20Var, 1000L);
                }
                g1Var7.setText(LocaleController.getString(R.string.VoipGroupStopRecordCall));
            } else {
                h20 h20Var2 = this.D1;
                if (h20Var2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(h20Var2);
                    this.D1 = null;
                }
                g1Var7.setText(LocaleController.getString(R.string.VoipGroupRecordCall));
            }
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(true) == 2) {
                g1Var8.j(LocaleController.getString(R.string.VoipChatStopScreenCapture), R.drawable.msg_screencast_off, null);
            } else {
                g1Var8.j(LocaleController.getString(R.string.VoipChatStartScreenCapture), R.drawable.msg_screencast, null);
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
            if (!z10 && ((this.f44610a1.canRecordVideo() || z11) && !this.f44610a1.isScheduled() && !r1())) {
                if (z11) {
                    w0Var2.setVisibility(8);
                    g1Var8.setVisibility(0);
                    g1Var8.j(LocaleController.getString(R.string.VoipChatStopScreenCapture), R.drawable.msg_screencast_off, null);
                    g1Var8.setContentDescription(LocaleController.getString(R.string.VoipChatStopScreenCapture));
                } else {
                    g1Var8.j(LocaleController.getString(R.string.VoipChatStartScreenCapture), R.drawable.msg_screencast, null);
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
        org.telegram.ui.ActionBar.g1 g1Var9 = this.f44680r1;
        if (Q02 && this.f44610a1.call.can_change_join_muted && !o1()) {
            g1Var9.setVisibility(0);
        } else {
            g1Var9.setVisibility(8);
        }
        if (o1() && ((call = this.f44610a1) == null || (groupCall = call.call) == null || !groupCall.creator)) {
            z12 = false;
        }
        w0Var.Q(4, z12);
        if (r1() && !this.f44610a1.isScheduled()) {
            i12 = 8;
        } else {
            i12 = 0;
        }
        this.f44671p1.setVisibility(i12);
        int visibility = g1Var6.getVisibility();
        TextView textView = this.A1;
        if (visibility != 0 && g1Var9.getVisibility() != 0 && g1Var.getVisibility() != 0 && g1Var8.getVisibility() != 0 && g1Var7.getVisibility() != 0 && g1Var5.getVisibility() != 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        org.telegram.ui.Cells.k kVar = this.f44651k0;
        if (((sharedInstance != null && VoIPService.getSharedInstance().hasFewPeers) || this.f44614b1) && !r1() && this.A0 != null) {
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
        if (chat5 != null && !ChatObject.isChannelOrGiga(chat5) && r1() && g1Var.getVisibility() == 8) {
            w0Var.setVisibility(8);
        } else {
            w0Var.setVisibility(0);
        }
        LinearLayout linearLayout = this.f44648j1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        float f7 = 96;
        if (layoutParams.rightMargin != AndroidUtilities.dp(f7)) {
            layoutParams.rightMargin = AndroidUtilities.dp(f7);
            linearLayout.requestLayout();
        }
        ((FrameLayout.LayoutParams) this.f44715z1.getLayoutParams()).rightMargin = 0;
        this.O.setTitleRightMargin(AndroidUtilities.dp(48.0f) * 2);
    }

    public final void K1(int r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.v50.K1(int, boolean):void");
    }

    public final void L1() {
        if (this.f44610a1 == null) {
            return;
        }
        int currentTime = this.d.getConnectionsManager().getCurrentTime();
        ChatObject.Call call = this.f44610a1;
        int i10 = currentTime - call.call.record_start_date;
        boolean z10 = call.recording;
        org.telegram.ui.ActionBar.g1 g1Var = this.f44685s1;
        if (z10) {
            g1Var.setSubtext(AndroidUtilities.formatDuration(i10, false));
        } else {
            g1Var.setSubtext(null);
        }
    }

    public final void M1(boolean z10) {
        float interpolation;
        float f7;
        d40 d40Var = this.R;
        if ((d40Var == null || this.f44610a1 != null) && this.X0 == null) {
            this.W0 = 1.0f;
            this.V0 = 1.0f;
            if (d40Var == null) {
                return;
            }
        }
        int i10 = 4;
        if (!z10) {
            d30 d30Var = this.f44703w2;
            AndroidUtilities.cancelRunOnUIThread(d30Var);
            d30Var.run();
            ChatObject.Call call = this.f44610a1;
            b50 b50Var = this.Q;
            if (call != null && !call.isScheduled()) {
                b50Var.setVisibility(0);
            } else {
                b50Var.setVisibility(4);
            }
            boolean isChannelOrGiga = ChatObject.isChannelOrGiga(this.Z0);
            org.telegram.ui.ActionBar.g1 g1Var = this.f44702w1;
            if (isChannelOrGiga) {
                g1Var.setText(LocaleController.getString(R.string.VoipChannelCancelChat));
            } else {
                g1Var.setText(LocaleController.getString(R.string.VoipGroupCancelChat));
            }
        }
        float f10 = this.V0;
        if (f10 > 0.6f) {
            interpolation = 1.05f - (org.telegram.ui.Components.ds.f27586f.getInterpolation((f10 - 0.6f) / 0.4f) * 0.05f);
            this.W0 = 1.0f;
            f7 = 1.0f;
        } else {
            org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.f27586f;
            this.W0 = dsVar.getInterpolation(f10 / 0.6f);
            interpolation = 1.05f * dsVar.getInterpolation(this.V0 / 0.6f);
            f7 = this.V0 / 0.6f;
        }
        I1(true);
        float f11 = 1.0f - f7;
        d40Var.setAlpha(f11);
        this.U.setAlpha(f7);
        this.W.setAlpha(f7);
        a50 a50Var = this.V;
        a50Var.setAlpha(f7);
        a50Var.setScaleX(interpolation);
        a50Var.setScaleY(interpolation);
        b40 b40Var = this.T;
        b40Var.setScaleX(f11);
        b40Var.setScaleY(f11);
        b40Var.setAlpha(f11);
        this.S.setAlpha(f11);
        this.f44652k1.setAlpha(f7);
        if (f11 != 0.0f) {
            i10 = 0;
        }
        if (i10 != d40Var.getVisibility()) {
            d40Var.setVisibility(i10);
            b40Var.setVisibility(i10);
        }
    }

    public final void N1(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        org.telegram.ui.Components.voip.w2 w2Var = this.f44678r;
        if (w2Var != null && w2Var.getVisibility() == 0) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            z20 z20Var = this.e;
            boolean z14 = false;
            if (sharedInstance != null && !r1()) {
                mh.a aVar = (mh.a) z20Var.f18495c.get(w2Var);
                if (aVar != null) {
                    aVar.d.a(true, z10);
                    w2Var.setEnabled(true);
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
                    w2Var.c(R.drawable.calls_bluetooth, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingBluetooth), false, z10);
                } else if (z13) {
                    w2Var.c(R.drawable.calls_speaker, -1, 0, 0.3f, true, LocaleController.getString(R.string.VoipSpeaker), false, z10);
                } else if (sharedInstance.isHeadsetPlugged()) {
                    w2Var.c(R.drawable.calls_headphones, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipAudioRoutingHeadset), false, z10);
                } else {
                    w2Var.c(R.drawable.calls_speaker, -1, 0, 0.1f, true, LocaleController.getString(R.string.VoipSpeaker), false, z10);
                }
                w2Var.b(z13, z10);
                h1();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.isBluetoothHeadsetConnected()) {
                    i10 = R.drawable.filled_calls_bluetooth_s;
                } else {
                    i10 = R.drawable.filled_sound_on;
                }
                if (this.f44609a0 != i10) {
                    this.f44609a0 = i10;
                    AndroidUtilities.updateImageViewImageAnimated(this.f44613b0, i10);
                }
                org.telegram.ui.Components.voip.w2 w2Var2 = this.h;
                if (w2Var2.getVisibility() == 0) {
                    w2Var2.c(0, -1, 0, 1.0f, true, f1(h1()), false, z10);
                    if (h1() != 1) {
                        z14 = true;
                    }
                    w2Var2.b(z14, z10);
                    return;
                }
                return;
            }
            w2Var.c(R.drawable.msg_voiceshare, -1, 0, 0.3f, true, LocaleController.getString(R.string.VoipChatShare), false, z10);
            if (!ChatObject.isPublic(this.Z0) && (!ChatObject.hasAdminRights(this.Z0) || !ChatObject.canAddUsers(this.Z0))) {
                z11 = false;
            } else {
                z11 = true;
            }
            mh.a aVar2 = (mh.a) z20Var.f18495c.get(w2Var);
            if (aVar2 != null) {
                aVar2.d.a(z11, z10);
                w2Var.setEnabled(z11);
            }
            w2Var.b(true, false);
        }
    }

    public final void O0(boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.v50.O0(boolean):void");
    }

    public final void O1(boolean r36, boolean r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.v50.O1(boolean, boolean):void");
    }

    public final int P0() {
        b50 b50Var = this.Q;
        int childCount = b50Var.getChildCount();
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = b50Var.getChildAt(i11);
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
        t50 t50Var;
        TLRPC.User user;
        TLRPC.Chat chat;
        r40 r40Var = this.O;
        if (r40Var != null && this.f44610a1 != null) {
            SpannableStringBuilder spannableStringBuilder = null;
            int i10 = 0;
            for (int i11 = 0; i11 < this.f44610a1.currentSpeakingPeers.m(); i11++) {
                long j10 = this.f44610a1.currentSpeakingPeers.j(i11);
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f44610a1.currentSpeakingPeers.f(j10);
                if (!groupCallParticipant.self) {
                    m30 m30Var = this.a2;
                    m30Var.getClass();
                    if (m30Var.f33929w.get(MessageObject.getPeerId(groupCallParticipant.peer)) <= 0 && this.B2.get(j10, 0) != 1) {
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
                                    spannableStringBuilder.append(UserObject.getFirstName(user), new org.telegram.ui.Components.q61(AndroidUtilities.bold()), 0);
                                } else {
                                    spannableStringBuilder.append(chat.title, new org.telegram.ui.Components.q61(AndroidUtilities.bold()), 0);
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
                r40Var.getAdditionalSubtitleTextView().k(spannableStringBuilder2);
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.ActionBar.b6 subtitleTextView = r40Var.getSubtitleTextView();
            if (r1()) {
                str = "ViewersWatching";
            } else {
                str = "Participants";
            }
            int i13 = this.f44610a1.call.participants_count;
            p50 p50Var = this.P;
            subtitleTextView.k(LocaleController.formatPluralString(str, i13 + ((p50Var.M.r1() || p50Var.L || VoIPService.getSharedInstance() == null) ? 0 : !VoIPService.getSharedInstance().isJoined()), new Object[0]));
            if (r1() && (t50Var = this.B1) != null) {
                t50Var.setWatchersCount(this.f44610a1.call.participants_count);
            }
            if (z10 != this.f44694u2) {
                this.f44694u2 = z10;
                r40Var.invalidate();
                float f11 = 0.0f;
                r40Var.getSubtitleTextView().setPivotX(0.0f);
                r40Var.getSubtitleTextView().setPivotY(r40Var.getMeasuredHeight() >> 1);
                ViewPropertyAnimator animate = r40Var.getSubtitleTextView().animate();
                if (this.f44694u2) {
                    f7 = 0.98f;
                } else {
                    f7 = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f7);
                if (this.f44694u2) {
                    f10 = 0.9f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f10);
                if (!this.f44694u2) {
                    f11 = 1.0f;
                }
                scaleY.alpha(f11).setDuration(150L);
                AndroidUtilities.updateViewVisibilityAnimated(r40Var.getAdditionalSubtitleTextView(), this.f44694u2);
            }
        }
    }

    public final boolean Q0() {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isConference()) {
            ChatObject.Call call = this.f44610a1;
            if (call != null && (groupCall = call.call) != null && groupCall.creator) {
                return true;
            }
            return false;
        }
        return ChatObject.canManageCalls(this.Z0);
    }

    public final void Q1(boolean z10) {
        ChatObject.Call call = this.f44610a1;
        e30 e30Var = this.f44627e1;
        if (call == null) {
            if (ChatObject.isChannelOrGiga(this.Z0)) {
                e30Var.b(LocaleController.getString(R.string.VoipChannelScheduleVoiceChat), z10);
                return;
            } else {
                e30Var.b(LocaleController.getString(R.string.VoipGroupScheduleVoiceChat), z10);
                return;
            }
        }
        boolean isEmpty = TextUtils.isEmpty(call.call.title);
        r40 r40Var = this.O;
        if (!isEmpty) {
            if (!this.f44610a1.call.title.equals(r40Var.getTitle())) {
                if (z10) {
                    this.O.G(this.f44610a1.call.title, true, 180L, null);
                    r40Var.getTitleTextView().setOnClickListener(new f20(this, 8));
                } else {
                    r40Var.setTitle(this.f44610a1.call.title);
                }
                e30Var.b(this.f44610a1.call.title, z10);
            }
        } else {
            TLRPC.Chat chat = this.Z0;
            if (chat != null && !chat.title.equals(r40Var.getTitle())) {
                if (z10) {
                    this.O.G(this.Z0.title, true, 180L, null);
                    r40Var.getTitleTextView().setOnClickListener(new f20(this, 9));
                } else {
                    r40Var.setTitle(this.Z0.title);
                }
                if (ChatObject.isChannelOrGiga(this.Z0)) {
                    if (r1()) {
                        e30Var.b(this.Z0.title, z10);
                    } else {
                        e30Var.b(LocaleController.getString(R.string.VoipChannelVoiceChat), z10);
                    }
                } else {
                    e30Var.b(LocaleController.getString(R.string.VoipGroupVoiceChat), z10);
                }
            } else if (this.Z0 == null) {
                r40Var.setTitle(LocaleController.getString(R.string.ConferenceChat));
                e30Var.b(LocaleController.getString(R.string.ConferenceChat), z10);
            }
        }
        org.telegram.ui.ActionBar.b6 titleTextView = r40Var.getTitleTextView();
        if (this.f44610a1.recording) {
            if (titleTextView.getRightDrawable() == null) {
                titleTextView.i(new r50(titleTextView));
                TextView textView = e30Var.getTextView();
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new r50(textView), (Drawable) null);
                TextView nextTextView = e30Var.getNextTextView();
                nextTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new r50(nextTextView), (Drawable) null);
            }
        } else if (titleTextView.getRightDrawable() != null) {
            titleTextView.i(null);
            e30Var.getTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            e30Var.getNextTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public final void R0() {
        if (this.R1) {
            this.R1 = false;
            AndroidUtilities.cancelRunOnUIThread(this.f44713y2);
        }
        if (this.S1) {
            this.S1 = false;
            MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
            this.f44700w.onTouchEvent(obtain);
            obtain.recycle();
        }
    }

    public final void R1() {
        float f7;
        org.telegram.ui.Components.ub ubVar;
        boolean z10;
        if (this.topBulletinContainer != null) {
            int dp = AndroidUtilities.dp(74.0f);
            float f10 = this.f44711y0 - dp;
            if (this.backgroundPaddingTop + f10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                int dp2 = (dp - this.backgroundPaddingTop) - AndroidUtilities.dp(14.0f);
                f7 = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f10) - this.backgroundPaddingTop) / dp2);
                f10 -= (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp2) * f7);
            } else {
                f7 = 0.0f;
            }
            float paddingTop = f10 + this.containerView.getPaddingTop();
            FrameLayout frameLayout = this.topBulletinContainer;
            r40 r40Var = this.O;
            frameLayout.setTranslationY(AndroidUtilities.lerp(((-frameLayout.getTop()) - this.topBulletinContainer.getHeight()) + paddingTop + AndroidUtilities.dp(10.0f), r40Var.getY() + (-this.topBulletinContainer.getTop()) + r40Var.getHeight(), f7));
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f31882x;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.v50.S0():void");
    }

    public final void T0() {
        this.F.setTranslationY((-this.C1.d()) + this.containerView.getPaddingBottom());
        this.G.invalidate();
        Z0();
        Y0();
        W0();
        X0();
        a1();
        this.e.setAlpha(1.0f - this.f44717z3.e);
        U0();
        V0();
    }

    public final void U0() {
        int i10;
        float f7 = this.C1.f47620b.f19351a;
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        x30 x30Var = this.F;
        x30Var.setAlpha(f7);
        w30 w30Var = this.G;
        w30Var.setAlpha(f7);
        if (x30Var.getVisibility() != i10) {
            x30Var.setVisibility(i10);
            w30Var.setVisibility(i10);
            if (i10 == 8) {
                u30 u30Var = this.H;
                if (u30Var.isFocused()) {
                    u30Var.clearFocus();
                }
            }
        }
    }

    public final void V0() {
        int i10;
        org.telegram.ui.Components.fl0 fl0Var = this.K;
        if (fl0Var != null) {
            float f7 = this.C1.f47620b.f19351a * this.A3.e;
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
        z20 z20Var = this.e;
        if (z10) {
            z20Var.setTranslationX(0.0f);
            z20Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = F3;
        oe.b bVar = this.f44717z3;
        if (z11) {
            z20Var.setTranslationX(bVar.e * AndroidUtilities.dp(94.0f));
            z20Var.setTranslationY(0.0f);
            return;
        }
        z20Var.setTranslationX(0.0f);
        z20Var.setTranslationY(bVar.e * AndroidUtilities.dp(94.0f));
    }

    public final void X0() {
        boolean z10 = G3;
        i30 i30Var = this.f44659m2;
        if (z10) {
            i30Var.setTranslationX(0.0f);
            i30Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = F3;
        oe.b bVar = this.f44717z3;
        if (z11) {
            i30Var.setTranslationX(bVar.e * AndroidUtilities.dp(94.0f));
            i30Var.setTranslationY(0.0f);
            return;
        }
        i30Var.setTranslationX(0.0f);
        i30Var.setTranslationY(bVar.e * AndroidUtilities.dp(94.0f));
    }

    public final void Y0() {
        float dp;
        float f7 = this.B3.f19334f;
        rh.i iVar = this.C1;
        float f10 = -((iVar.d() - this.containerView.getPaddingBottom()) + f7 + (AndroidUtilities.dp(68.0f) * this.A3.e) + AndroidUtilities.dp(10.0f));
        if (G3) {
            dp = (1.0f - this.C3.e) * AndroidUtilities.dp(-91.0f);
        } else if (F3) {
            dp = 0.0f;
        } else {
            dp = ((this.f44717z3.e * AndroidUtilities.dp(94.0f)) - (AndroidUtilities.dp(104.0f) * this.a2.f33905c)) - AndroidUtilities.dp(91.0f);
        }
        float lerp = AndroidUtilities.lerp(dp, f10, iVar.f47620b.f19351a);
        float measuredHeight = ((this.containerView.getMeasuredHeight() - this.f44711y0) + lerp) - this.backgroundPaddingTop;
        float max = Math.max((measuredHeight / 3.0f) * 2.0f, measuredHeight - AndroidUtilities.dp(250.0f));
        nh.h hVar = this.f44618c0;
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
            tVar.f34074a.setRoundCorners(AndroidUtilities.dp(8.0f));
            org.telegram.ui.Components.voip.t tVar2 = this.Z2;
            tVar2.h = false;
            tVar2.j(false);
            this.Z2.invalidate();
            this.a2.invalidate();
        }
        org.telegram.ui.Cells.i4 i4Var = this.X2;
        if (i4Var != null && !this.f44616b3 && i4Var.getParent() != null) {
            this.containerView.removeView(this.X2);
        }
        org.telegram.ui.Cells.i4 i4Var2 = this.X2;
        if (i4Var2 != null) {
            i4Var2.setProgressToAvatarPreview(0.0f);
            this.X2.setAboutVisible(false);
            this.X2.getAvatarImageView().setAlpha(1.0f);
        }
        org.telegram.ui.Components.b30 b30Var = this.f44611a3;
        if (b30Var != null) {
            b30Var.getAvatarImageView().setAlpha(1.0f);
        }
        this.X2 = null;
        this.Y2 = null;
        this.f44611a3 = null;
        this.Z2 = null;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public final boolean canDismissWithTouchOutside() {
        return !this.a2.f33903b;
    }

    public final void d1(boolean z10) {
        if (!this.f44621c3 && this.f44633f2) {
            if (z10) {
                this.f44621c3 = true;
                y1(false, this.X2);
                return;
            }
            b1();
            this.containerView.removeView(this.f44628e2);
            this.f44628e2 = null;
            this.C2.setVisibility(8);
            this.containerView.invalidate();
            this.f44633f2 = false;
            this.Y.X = true;
            this.Q.invalidate();
            this.f44615b2.setVisibility(8);
            if (this.f44684s0) {
                this.f44684s0 = false;
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
        b50 b50Var = this.Q;
        int i19 = 0;
        if (i10 == i18) {
            Long l4 = (Long) objArr[1];
            ChatObject.Call call = this.f44610a1;
            if (call != null && call.call.f22037id == l4.longValue()) {
                ChatObject.Call call2 = this.f44610a1;
                if (call2.call instanceof TLRPC.TL_groupCallDiscarded) {
                    dismiss();
                    return;
                }
                int i20 = (this.f44688t0 > 0L ? 1 : (this.f44688t0 == 0L ? 0 : -1));
                AccountInstance accountInstance = this.d;
                if (i20 == 0 && (((i17 = this.F1) == 7 || i17 == 5 || i17 == 6) && !call2.isScheduled())) {
                    try {
                        Intent intent = new Intent(this.f44643i0, VoIPService.class);
                        intent.putExtra("chat_id", i1());
                        intent.putExtra("createGroupCall", false);
                        intent.putExtra("hasFewPeers", this.f44614b1);
                        intent.putExtra("peerChannelId", this.Y0.channel_id);
                        intent.putExtra("peerChatId", this.Y0.chat_id);
                        intent.putExtra("peerUserId", this.Y0.user_id);
                        intent.putExtra("hash", this.f44619c1);
                        intent.putExtra("peerAccessHash", this.Y0.access_hash);
                        intent.putExtra("is_outgoing", true);
                        intent.putExtra("start_incall_activity", false);
                        intent.putExtra("account", accountInstance.getCurrentAccount());
                        intent.putExtra("scheduleDate", this.f44653k2);
                        this.f44643i0.startService(intent);
                    } catch (Throwable th2) {
                        FileLog.e(th2);
                    }
                    this.f44688t0 = SystemClock.elapsedRealtime();
                    AndroidUtilities.runOnUIThread(new h20(this, 2), 3000L);
                }
                if (!this.f44692u0 && VoIPService.getSharedInstance() != null) {
                    this.f44610a1.addSelfDummyParticipant(false);
                    l1();
                    VoIPService.getSharedInstance().playConnectedSound();
                }
                J1();
                int childCount = b50Var.getChildCount();
                for (int i21 = 0; i21 < childCount; i21++) {
                    View childAt = b50Var.getChildAt(i21);
                    if (childAt instanceof org.telegram.ui.Cells.i4) {
                        ((org.telegram.ui.Cells.i4) childAt).a(true, false);
                    }
                }
                if (this.X2 != null) {
                    this.f44684s0 = true;
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
                                        if (dialog.f22031id == longValue) {
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
                                    if (this.f44610a1.call.participants_count < 250 || UserObject.isContact(user) || user.verified || i19 != 0) {
                                        k1().k(0L, 44, user, this.Z0, null, null);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(-longValue));
                            if (chat != null) {
                                if (this.f44610a1.call.participants_count < 250 || !ChatObject.isNotInChat(chat) || chat.verified || i19 != 0) {
                                    k1().k(0L, 44, chat, this.Z0, null, null);
                                }
                            }
                        }
                    }
                }
            }
        } else if (i10 == NotificationCenter.groupCallSpeakingUsersUpdated) {
            m30 m30Var = this.a2;
            if (m30Var.f33903b && this.f44610a1 != null) {
                boolean c10 = m30Var.c();
                ChatObject.Call call3 = this.f44610a1;
                if (call3 != null && m30Var.f33903b && (videoParticipant = m30Var.e) != null && call3.participants.f(MessageObject.getPeerId(videoParticipant.participant.peer)) == null) {
                    c10 = true;
                }
                if (c10) {
                    ChatObject.VideoParticipant videoParticipant2 = null;
                    int i23 = 0;
                    while (true) {
                        ArrayList arrayList = this.f44674q0;
                        if (i23 >= arrayList.size()) {
                            break;
                        }
                        ChatObject.VideoParticipant videoParticipant3 = (ChatObject.VideoParticipant) arrayList.get(i23);
                        if (this.f44610a1.currentSpeakingPeers.g(null, MessageObject.getPeerId(videoParticipant3.participant.peer)) != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            TLRPC.GroupCallParticipant groupCallParticipant3 = videoParticipant3.participant;
                            if (!groupCallParticipant3.muted_by_you && m30Var.d != MessageObject.getPeerId(groupCallParticipant3.peer)) {
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
            m30Var.setVisibleParticipant(true);
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
                AlertDialog$Builder M = org.telegram.ui.Components.g5.M(getContext(), LocaleController.getString(R.string.VoipGroupVoiceChat), string);
                M.j(new l20(this, 1));
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
            if (chatFull.f22028id == i1()) {
                J1();
                O1(isShowing(), false);
            }
            long peerId = MessageObject.getPeerId(this.A0);
            ChatObject.Call call4 = this.f44610a1;
            if (call4 != null && chatFull.f22028id == (-peerId) && (groupCallParticipant2 = (TLRPC.GroupCallParticipant) call4.participants.f(peerId)) != null) {
                groupCallParticipant2.about = chatFull.about;
                O0(true);
                AndroidUtilities.updateVisibleRows(b50Var);
                if (this.E2 != null) {
                    while (i19 < this.E2.getChildCount()) {
                        View childAt2 = this.E2.getChildAt(i19);
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
                            g1Var.j(string2, i15, null);
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
            int childCount2 = b50Var.getChildCount();
            long longValue2 = ((Long) objArr[0]).longValue();
            while (i19 < childCount2) {
                s4.e1 G = b50Var.G(b50Var.getChildAt(i19));
                if (G != null) {
                    View view = G.f47738a;
                    if (view instanceof org.telegram.ui.Cells.i4) {
                        org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) view;
                        if (i4Var.getParticipant() != null) {
                            i4Var.getParticipant().lastVisibleDate = longValue2;
                        }
                    }
                }
                i19++;
            }
        } else if (i10 == NotificationCenter.userInfoDidLoad) {
            Long l11 = (Long) objArr[0];
            long peerId2 = MessageObject.getPeerId(this.A0);
            if (this.f44610a1 != null && peerId2 == l11.longValue() && (groupCallParticipant = (TLRPC.GroupCallParticipant) this.f44610a1.participants.f(peerId2)) != null) {
                groupCallParticipant.about = ((TLRPC.UserFull) objArr[1]).about;
                O0(true);
                AndroidUtilities.updateVisibleRows(b50Var);
                if (this.E2 != null) {
                    while (i19 < this.E2.getChildCount()) {
                        View childAt3 = this.E2.getChildAt(i19);
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
                            g1Var2.j(string3, i13, null);
                        }
                        i19++;
                    }
                }
            }
        } else if (i10 == NotificationCenter.mainUserInfoChanged) {
            O0(true);
            AndroidUtilities.updateVisibleRows(b50Var);
        } else if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0) {
                O0(true);
            }
            if ((MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0 || (intValue & MessagesController.UPDATE_MASK_EMOJI_STATUS) != 0) {
                AndroidUtilities.updateVisibleRows(b50Var);
            }
        } else if (i10 == NotificationCenter.groupCallScreencastStateChanged) {
            g40 g40Var = this.f44714z0;
            if (g40Var != null) {
                g40Var.b(true, true);
            }
            J1();
        } else if (i10 == NotificationCenter.conferenceEmojiUpdated) {
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            f50 f50Var = this.f44670p0;
            if (sharedInstance2 != null && (conferenceCall = sharedInstance2.conference) != null) {
                strArr = conferenceCall.getEmojis();
            }
            f50Var.b(strArr);
        }
    }

    @Override
    public final void dismiss() {
        LaunchActivity launchActivity = this.f44643i0;
        launchActivity.f35526b1.remove(this.f44698v2);
        this.f44643i0.setRequestedOrientation(-1);
        E3 = false;
        org.telegram.ui.Components.c40 c40Var = this.E1;
        if (c40Var != null) {
            c40Var.dismiss();
        }
        this.f44684s0 = true;
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
        m30 m30Var = this.a2;
        if (m30Var != null) {
            if (this.f44676q2 != null) {
                this.Q.getViewTreeObserver().removeOnPreDrawListener(this.f44676q2);
                this.f44676q2 = null;
            }
            ArrayList arrayList = this.Z1;
            arrayList.clear();
            ArrayList arrayList2 = this.Y1;
            arrayList.addAll(arrayList2);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).f();
                m30Var.removeView((View) arrayList.get(i10));
                ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).e();
                ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).b(true);
            }
            arrayList2.clear();
            if (m30Var.getParent() != null) {
                arrayList2.clear();
                this.containerView.removeView(m30Var);
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
        org.telegram.ui.Components.k30.j(getContext());
        ChatObject.Call call = this.f44610a1;
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
        if (this.f44643i0 == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0 && ((keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25) && VoIPService.getSharedInstance() != null && Build.VERSION.SDK_INT >= 32)) {
            boolean isSpeakerMuted = WebRtcAudioTrack.isSpeakerMuted();
            AudioManager audioManager = (AudioManager) this.f44643i0.getSystemService("audio");
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
            this.f44643i0.setRequestedOrientation(-1);
        }
        if (VoIPService.getSharedInstance() != null) {
            m30 m30Var = this.a2;
            if (m30Var.f33922r != null) {
                return;
            }
            boolean z10 = G3;
            b50 b50Var = this.Q;
            int i10 = 0;
            if (z10) {
                if (this.f44676q2 != null) {
                    b50Var.getViewTreeObserver().removeOnPreDrawListener(this.f44676q2);
                    this.f44676q2 = null;
                }
                ArrayList arrayList = new ArrayList();
                b60 b60Var = this.f44668o2;
                ArrayList arrayList2 = this.Y1;
                ArrayList arrayList3 = this.Z1;
                if (videoParticipant == null) {
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) arrayList3.get(i11);
                        org.telegram.ui.Components.voip.l lVar = tVar.f34078c;
                        if (lVar != null) {
                            lVar.setRenderer(null);
                            org.telegram.ui.Components.b30 b30Var = tVar.d;
                            if (b30Var != null) {
                                b30Var.setRenderer(null);
                            }
                            org.telegram.ui.Components.voip.l lVar2 = tVar.e;
                            if (lVar2 != null) {
                                lVar2.setRenderer(null);
                            }
                            arrayList.add(tVar.f34102w);
                            tVar.b(false);
                            tVar.animate().alpha(0.0f).setListener(new h40(this, tVar));
                        }
                    }
                    this.P2 = false;
                    b60Var.H(this.f44664n2, true, true);
                } else {
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) arrayList3.get(i12);
                        if (tVar2.e != null && ((videoParticipant2 = tVar2.f34102w) == null || !videoParticipant2.equals(videoParticipant))) {
                            arrayList.add(tVar2.f34102w);
                            tVar2.b(false);
                            org.telegram.ui.Components.b30 b30Var2 = tVar2.d;
                            if (b30Var2 != null) {
                                b30Var2.setRenderer(null);
                            }
                            org.telegram.ui.Components.voip.l lVar3 = tVar2.f34078c;
                            if (lVar3 != null) {
                                lVar3.setRenderer(null);
                            }
                            tVar2.animate().alpha(0.0f).setListener(new i40(this, tVar2));
                        }
                    }
                    this.P2 = true;
                    b60Var.f37985r = false;
                    if (!arrayList.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new sz(7, this, arrayList));
                    }
                }
                ViewTreeObserver viewTreeObserver = b50Var.getViewTreeObserver();
                k40 k40Var = new k40(this, videoParticipant, !m30Var.f33903b);
                this.f44676q2 = k40Var;
                viewTreeObserver.addOnPreDrawListener(k40Var);
                return;
            }
            if (this.f44676q2 != null) {
                b50Var.getViewTreeObserver().removeOnPreDrawListener(this.f44676q2);
                this.f44676q2 = null;
            }
            if (videoParticipant != null) {
                i30 i30Var = this.f44659m2;
                if (i30Var.getVisibility() != 0) {
                    i30Var.setVisibility(0);
                    org.telegram.ui.Components.c30 c30Var = this.f44672p2;
                    c30Var.G(i30Var, false);
                    this.f44684s0 = true;
                    if (!m30Var.f33903b) {
                        ArrayList arrayList4 = c30Var.e;
                        s4.c0 c0Var = (s4.c0) i30Var.getLayoutManager();
                        if (c0Var != null) {
                            while (true) {
                                if (i10 >= arrayList4.size()) {
                                    break;
                                } else if (((ChatObject.VideoParticipant) arrayList4.get(i10)).equals(videoParticipant)) {
                                    c0Var.h1(i10, AndroidUtilities.dp(13.0f));
                                    break;
                                } else {
                                    i10++;
                                }
                            }
                        }
                    }
                    ViewTreeObserver viewTreeObserver2 = b50Var.getViewTreeObserver();
                    l40 l40Var = new l40(this, videoParticipant);
                    this.f44676q2 = l40Var;
                    viewTreeObserver2.addOnPreDrawListener(l40Var);
                    return;
                }
                m30Var.j(videoParticipant);
                AndroidUtilities.updateVisibleRows(i30Var);
            } else if (b50Var.getVisibility() != 0) {
                b50Var.setVisibility(0);
                O0(false);
                this.f44684s0 = true;
                ViewTreeObserver viewTreeObserver3 = b50Var.getViewTreeObserver();
                m40 m40Var = new m40(this);
                this.f44676q2 = m40Var;
                viewTreeObserver3.addOnPreDrawListener(m40Var);
            } else {
                ViewTreeObserver viewTreeObserver4 = b50Var.getViewTreeObserver();
                n40 n40Var = new n40(this);
                this.f44676q2 = n40Var;
                viewTreeObserver4.addOnPreDrawListener(n40Var);
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
        return chat.f22027id;
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
                accountInstance.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new bi.r9(this, chatFull, z10, 6));
                return;
            }
            u1(null, str, true, z10);
        } else if (this.f44610a1 != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                exportgroupcallinvite.call = this.f44610a1.getInputGroupCall();
                if (i10 == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                exportgroupcallinvite.can_self_unmute = z11;
                accountInstance.getConnectionsManager().sendRequest(exportgroupcallinvite, new org.telegram.messenger.voip.k0(this, i10, z10, 1));
            }
        }
    }

    public final UndoView k1() {
        if (!G3) {
            m30 m30Var = this.a2;
            if (m30Var.f33903b) {
                return m30Var.getUndoView();
            }
        }
        UndoView[] undoViewArr = this.f44647j0;
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
        if (!this.f44692u0 && (sharedInstance = VoIPService.getSharedInstance()) != null) {
            this.f44692u0 = true;
            this.D0.addAll(this.f44610a1.visibleParticipants);
            this.E0.addAll(this.f44674q0);
            this.F0.addAll(this.f44610a1.invitedUsers);
            this.G0.addAll(this.f44610a1.shadyJoinParticipants);
            this.H0.addAll(this.f44610a1.shadyLeftParticipants);
            this.T1 = sharedInstance.getCallState();
            if (this.f44610a1 == null) {
                ChatObject.Call call = sharedInstance.groupCall;
                this.f44610a1 = call;
                this.f44672p2.f27045c = call;
                this.a2.setGroupCall(call);
                this.f44668o2.f37982c = this.f44610a1;
            }
            nh.h hVar = this.f44618c0;
            if (hVar != null) {
                hVar.D0(this.d.getCurrentAccount(), this.f44610a1.getInputGroupCall(false));
            }
            this.O.setTitleRightMargin(AndroidUtilities.dp(48.0f) * 2);
            this.f44610a1.saveActiveDates();
            VoIPService.getSharedInstance().registerStateListener(this);
            a50 a50Var = this.V;
            if (a50Var != null && a50Var.getVisibility() == 0) {
                this.f44683s.c(R.drawable.calls_decline, -1, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Dg, false), 0.3f, false, LocaleController.getString(R.string.VoipGroupLeave), false, true);
                N1(true);
                if (ChatObject.isChannelOrGiga(this.Z0)) {
                    i10 = R.string.VoipChannelEndChat;
                } else {
                    i10 = R.string.VoipGroupEndChat;
                }
                this.f44702w1.setText(LocaleController.getString(i10));
                b50 b50Var = this.Q;
                b50Var.setVisibility(0);
                org.telegram.ui.ActionBar.w0 w0Var = this.l1;
                w0Var.setVisibility(0);
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(b50Var, property, 0.0f, 1.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(b50Var, View.TRANSLATION_Y, AndroidUtilities.dp(200.0f), 0.0f);
                Property property2 = View.SCALE_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(a50Var, property2, 0.0f);
                Property property3 = View.SCALE_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(a50Var, property3, 0.0f);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(a50Var, property, 0.0f);
                org.telegram.ui.ActionBar.b6 b6Var = this.U;
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(b6Var, property2, 0.0f);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(b6Var, property3, 0.0f);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(b6Var, property, 0.0f);
                org.telegram.ui.ActionBar.b6 b6Var2 = this.W;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(b6Var2, property2, 0.0f), ObjectAnimator.ofFloat(b6Var2, property3, 0.0f), ObjectAnimator.ofFloat(b6Var2, property, 0.0f), ObjectAnimator.ofFloat(w0Var, property2, 0.0f, 1.0f), ObjectAnimator.ofFloat(w0Var, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(w0Var, property, 0.0f, 1.0f));
                animatorSet.setInterpolator(org.telegram.ui.Components.ds.f27587g);
                animatorSet.addListener(new o40(this, 0));
                animatorSet.setDuration(300L);
                animatorSet.start();
            }
        }
    }

    public final void m1(final long j10, final boolean z10) {
        if (this.f44610a1 != null) {
            AccountInstance accountInstance = this.d;
            final TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(j10));
            if (user != null) {
                final org.telegram.ui.ActionBar.e2[] e2VarArr = {new org.telegram.ui.ActionBar.e2(getContext(), 3, null)};
                final TL_phone.inviteToGroupCall invitetogroupcall = new TL_phone.inviteToGroupCall();
                invitetogroupcall.call = this.f44610a1.getInputGroupCall();
                TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                tL_inputUser.user_id = user.f22176id;
                tL_inputUser.access_hash = user.access_hash;
                invitetogroupcall.users.add(tL_inputUser);
                int sendRequest = accountInstance.getConnectionsManager().sendRequest(invitetogroupcall, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        v50 v50Var = v50.this;
                        long j11 = j10;
                        org.telegram.ui.ActionBar.e2[] e2VarArr2 = e2VarArr;
                        if (tLObject != null) {
                            v50Var.d.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                            AndroidUtilities.runOnUIThread(new bi.y2(v50Var, j11, e2VarArr2, user, 20));
                            return;
                        }
                        AndroidUtilities.runOnUIThread(new bi.n(v50Var, e2VarArr2, z10, tL_error, j11, invitetogroupcall));
                    }
                });
                if (sendRequest != 0) {
                    AndroidUtilities.runOnUIThread(new yx(this, e2VarArr, sendRequest, 1), 500L);
                }
            }
        }
    }

    public final boolean n1() {
        float f7;
        int dp = AndroidUtilities.dp(74.0f);
        float f10 = this.f44711y0 - dp;
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
        b50 b50Var = this.Q;
        if (b50Var.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(b50Var);
        }
        i30 i30Var = this.f44659m2;
        if (i30Var.getVisibility() == 0) {
            AndroidUtilities.updateVisibleRows(i30Var);
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
        g40 g40Var = this.f44714z0;
        if (g40Var != null) {
            g40Var.b(false, false);
        } else if (this.f44633f2) {
            d1(true);
        } else if (this.a2.f33903b) {
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
        g40 g40Var = this.f44714z0;
        if (g40Var != null && VoIPService.getSharedInstance() != null) {
            g40Var.h.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LaunchActivity launchActivity = this.f44643i0;
        launchActivity.f35526b1.add(this.f44698v2);
    }

    @Override
    public final boolean onCustomOpenAnimation() {
        E3 = true;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallVisibilityChanged, new Object[0]);
        org.telegram.ui.Components.k30.j(getContext());
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
            RadialProgressView radialProgressView = this.f44626e0;
            if (radialProgressView != null) {
                radialProgressView.setProgressColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Og, false));
            }
            org.telegram.ui.ActionBar.w0 w0Var = this.f44652k1;
            if (w0Var != null) {
                int i10 = org.telegram.ui.ActionBar.y6.f23438hg;
                w0Var.O(org.telegram.ui.ActionBar.y6.x0(null, i10, false), false);
                w0Var.O(org.telegram.ui.ActionBar.y6.x0(null, i10, false), true);
                w0Var.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23383eg, false));
            }
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23438hg, false);
            F1(this.f44707x1, x02);
            F1(this.f44712y1, x02);
            F1(this.f44671p1, x02);
            F1(this.f44675q1, x02);
            F1(this.f44702w1, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23701vg, false));
            F1(this.f44663n1, x02);
            F1(this.f44667o1, x02);
            F1(this.f44680r1, x02);
            F1(this.f44685s1, x02);
            F1(this.f44689t1, x02);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.t0.h(this, z10);
    }

    public final boolean q1() {
        if (!r1() || this.f44610a1.visibleVideoParticipants.isEmpty() || (this.f44610a1.visibleVideoParticipants.get(0).aspectRatio != 0.0f && this.f44610a1.visibleVideoParticipants.get(0).aspectRatio < 1.0f)) {
            return false;
        }
        return true;
    }

    public final boolean r1() {
        ChatObject.Call call = this.f44610a1;
        if (call != null && call.call.rtmp_stream) {
            return true;
        }
        return false;
    }

    public final void s1(org.telegram.ui.ActionBar.k3 k3Var, org.telegram.ui.ActionBar.e2 e2Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
        long j10;
        if (!this.f44701w0) {
            org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.f44643i0.O().getFragmentStack().get(this.f44643i0.O().getFragmentStack().size() - 1);
            if (r2Var instanceof un) {
                boolean Z9 = ((un) r2Var).Z9();
                this.f44701w0 = true;
                this.f44706x0 = true;
                bi.s9 s9Var = new bi.s9(k3Var, editTextBoldCursor, z10, e2Var, 21);
                if (Z9) {
                    j10 = 200;
                } else {
                    j10 = 0;
                }
                AndroidUtilities.runOnUIThread(s9Var, j10);
                return;
            }
            this.f44701w0 = true;
            this.f44706x0 = true;
            if (k3Var != null) {
                k3Var.setFocusable(true);
            } else if (e2Var != null) {
                e2Var.l(true);
            }
            if (z10) {
                AndroidUtilities.runOnUIThread(new hh(editTextBoldCursor, 2), 100L);
            }
        }
    }

    @Override
    public final void show() {
        super.show();
        if (org.telegram.ui.Components.voip.i1.f33844d0.V) {
            org.telegram.ui.Components.voip.i1.j();
        }
    }

    public final void u1(java.lang.String r11, java.lang.String r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.v50.u1(java.lang.String, java.lang.String, boolean, boolean):void");
    }

    public final void v1() {
        ChatObject.Call call = this.f44610a1;
        if (call != null && call.call != null) {
            org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(getContext(), 3, null);
            e2Var.r(300L);
            TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
            exportgroupcallinvite.call = tL_inputGroupCall;
            TLRPC.GroupCall groupCall = this.f44610a1.call;
            tL_inputGroupCall.f22044id = groupCall.f22037id;
            tL_inputGroupCall.access_hash = groupCall.access_hash;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(exportgroupcallinvite, new ea(this, e2Var, exportgroupcallinvite, 12));
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
        ?? r20;
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
                    this.f44643i0.P0(this.currentAccount);
                    Bundle bundle = new Bundle();
                    if (i30 > 0) {
                        bundle.putLong("user_id", j10);
                    } else {
                        bundle.putLong("chat_id", -j10);
                    }
                    this.f44643i0.u0(new un(bundle));
                    dismiss();
                } else if (i10 == 8) {
                    this.f44643i0.P0(this.currentAccount);
                    org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.f44643i0.O().getFragmentStack().get(this.f44643i0.O().getFragmentStack().size() - 1);
                    if ((r2Var instanceof un) && ((un) r2Var).a() == j10) {
                        dismiss();
                        return;
                    }
                    Bundle bundle2 = new Bundle();
                    if (i30 > 0) {
                        bundle2.putLong("user_id", j10);
                    } else {
                        bundle2.putLong("chat_id", -j10);
                    }
                    this.f44643i0.u0(new un(bundle2));
                    dismiss();
                } else if (i10 == 7) {
                    sharedInstance.editCallMember(tLObject, Boolean.TRUE, null, null, Boolean.FALSE, null);
                    K1(2, true);
                } else if (i10 == 9) {
                    org.telegram.ui.Components.g50 g50Var = this.f44641h2;
                    if (g50Var == null || !g50Var.g()) {
                        TLRPC.User currentUser = accountInstance.getUserConfig().getCurrentUser();
                        org.telegram.ui.Components.g50 g50Var2 = new org.telegram.ui.Components.g50(0, true, true);
                        this.f44641h2 = g50Var2;
                        g50Var2.H = true;
                        g50Var2.R = true;
                        g50Var2.G = true;
                        g50Var2.J = true;
                        g50Var2.S = true;
                        g50Var2.f28421a = this.f44643i0.O().getLastFragment();
                        org.telegram.ui.Components.g50 g50Var3 = this.f44641h2;
                        c50 c50Var = new c50(this, j10);
                        this.f44645i2 = c50Var;
                        g50Var3.f28422b = c50Var;
                        TLRPC.UserProfilePhoto userProfilePhoto = currentUser.photo;
                        if (userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                            z10 = false;
                        }
                        g50Var3.n(z10, new h20(this, 9), new fi.e1(6), 0);
                    }
                } else if (i10 == 10) {
                    String str5 = groupCallParticipant.about;
                    Context context = getContext();
                    int i31 = this.currentAccount;
                    Pattern pattern = org.telegram.ui.Components.g5.f28420a;
                    ?? alertDialog$Builder = new AlertDialog$Builder(context);
                    if (i30 > 0) {
                        i24 = R.string.UserBio;
                    } else {
                        i24 = R.string.DescriptionPlaceholder;
                    }
                    String string = LocaleController.getString(i24);
                    final org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
                    e2Var.R = string;
                    if (i30 > 0) {
                        i25 = R.string.VoipGroupBioEditAlertText;
                    } else {
                        i25 = R.string.DescriptionInfo;
                    }
                    e2Var.T = LocaleController.getString(i25);
                    FrameLayout frameLayout = new FrameLayout(context);
                    frameLayout.setClipChildren(false);
                    if (i30 < 0) {
                        f7 = 8.0f;
                        long j11 = -j10;
                        if (MessagesController.getInstance(i31).getChatFull(j11) == null) {
                            r20 = 0;
                            MessagesController.getInstance(i31).loadFullChat(j11, ConnectionsManager.generateClassGuid(), true);
                        } else {
                            r20 = 0;
                        }
                    } else {
                        r20 = 0;
                        f7 = 8.0f;
                    }
                    NumberTextView numberTextView = new NumberTextView(context);
                    EditText editText2 = new EditText(context);
                    int i32 = org.telegram.ui.ActionBar.y6.f23438hg;
                    org.telegram.ui.ActionBar.f7.V(editText2, i32, null);
                    if (i30 > 0) {
                        i26 = R.string.UserBio;
                    } else {
                        i26 = R.string.DescriptionPlaceholder;
                    }
                    editText2.setHint(LocaleController.getString(i26));
                    editText2.setTextSize(1, 16.0f);
                    editText2.setBackground(org.telegram.ui.ActionBar.y6.T(context));
                    editText2.setMaxLines(4);
                    editText2.setRawInputType(147457);
                    editText2.setImeOptions(6);
                    if (i30 > 0) {
                        i27 = 70;
                    } else {
                        i27 = 255;
                    }
                    org.telegram.ui.Components.q3 q3Var = new org.telegram.ui.Components.q3(i27, context, numberTextView);
                    InputFilter[] inputFilterArr = new InputFilter[1];
                    inputFilterArr[r20] = q3Var;
                    editText2.setFilters(inputFilterArr);
                    numberTextView.setCenterAlign(true);
                    numberTextView.setTextSize(15);
                    numberTextView.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.B6, r20));
                    numberTextView.setImportantForAccessibility(2);
                    if (LocaleController.isRTL) {
                        i28 = 3;
                    } else {
                        i28 = 5;
                    }
                    frameLayout.addView(numberTextView, org.telegram.ui.Components.gb1.h(20, 20.0f, i28, 0.0f, 14.0f, 21.0f, 0.0f));
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
                    editText2.addTextChangedListener(new org.telegram.ui.Components.vq(i27, numberTextView));
                    AndroidUtilities.updateViewVisibilityAnimated(numberTextView, false, 0.0f, false);
                    editText2.setText(str5);
                    editText2.setSelection(editText2.getText().toString().length());
                    alertDialog$Builder.o(frameLayout);
                    final j2.c cVar = new j2.c(j10, i31, editText2, 4);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Save), cVar);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    e2Var.N = new org.telegram.ui.Components.q1(editText2, 1);
                    frameLayout.addView(editText2, org.telegram.ui.Components.gb1.h(-1, -2.0f, 0, 23.0f, 12.0f, 23.0f, 21.0f));
                    editText2.requestFocus();
                    AndroidUtilities.showKeyboard(editText2);
                    editText2.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                        @Override
                        public final boolean onEditorAction(TextView textView2, int i33, KeyEvent keyEvent) {
                            if (i33 == 6 || (j10 > 0 && keyEvent.getKeyCode() == 66)) {
                                org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                                if (e2Var2.isShowing()) {
                                    cVar.h(e2Var2, 0);
                                    return true;
                                }
                            }
                            return false;
                        }
                    });
                    e2Var.j(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23683ug, false));
                    e2Var.show();
                    e2Var.p(org.telegram.ui.ActionBar.y6.x0(null, i32, false));
                } else if (i10 == 11) {
                    Context context2 = getContext();
                    int i33 = this.currentAccount;
                    Pattern pattern2 = org.telegram.ui.Components.g5.f28420a;
                    if (DialogObject.isUserDialog(j10)) {
                        TLRPC.User user = MessagesController.getInstance(i33).getUser(Long.valueOf(j10));
                        str3 = user.first_name;
                        str4 = user.last_name;
                    } else {
                        str3 = MessagesController.getInstance(i33).getChat(Long.valueOf(-j10)).title;
                        str4 = null;
                    }
                    ?? alertDialog$Builder2 = new AlertDialog$Builder(context2);
                    if (i30 > 0) {
                        i19 = R.string.VoipEditName;
                    } else {
                        i19 = R.string.VoipEditTitle;
                    }
                    String string2 = LocaleController.getString(i19);
                    org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.f22368a;
                    e2Var2.R = string2;
                    LinearLayout d = org.telegram.messenger.vh.d(context2, 1);
                    EditText editText3 = new EditText(context2);
                    int i34 = org.telegram.ui.ActionBar.y6.f23438hg;
                    org.telegram.ui.ActionBar.f7.V(editText3, i34, null);
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
                    editText3.setBackground(org.telegram.ui.ActionBar.y6.T(context2));
                    editText3.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                    editText3.requestFocus();
                    if (i30 > 0) {
                        editText = new EditText(context2);
                        org.telegram.ui.ActionBar.f7.V(editText, i34, null);
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
                        editText.setBackground(org.telegram.ui.ActionBar.y6.T(context2));
                        editText.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                    } else {
                        editText = null;
                    }
                    AndroidUtilities.showKeyboard(editText3);
                    d.addView(editText3, org.telegram.ui.Components.gb1.x(-1, -2, 0, 23, 12, 23, 21));
                    if (editText != null) {
                        d.addView(editText, org.telegram.ui.Components.gb1.x(-1, -2, 0, 23, 12, 23, 21));
                    }
                    editText3.setText(str3);
                    editText3.setSelection(editText3.getText().toString().length());
                    if (editText != null) {
                        editText.setText(str4);
                        editText.setSelection(editText.getText().toString().length());
                    }
                    alertDialog$Builder2.o(d);
                    org.telegram.ui.Components.s1 s1Var = new org.telegram.ui.Components.s1(editText3, j10, i33, editText);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Save), s1Var);
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    e2Var2.N = new bi.u3(8, editText3, editText);
                    e2Var2.j(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23683ug, false));
                    e2Var2.show();
                    e2Var2.p(org.telegram.ui.ActionBar.y6.x0(null, i34, false));
                    yd ydVar = new yd(1, e2Var2, s1Var);
                    if (editText != null) {
                        editText.setOnEditorActionListener(ydVar);
                    } else {
                        editText3.setOnEditorActionListener(ydVar);
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
                ?? alertDialog$Builder3 = new AlertDialog$Builder(getContext());
                int i35 = org.telegram.ui.ActionBar.y6.f23588pg;
                org.telegram.ui.ActionBar.e2 e2Var3 = alertDialog$Builder3.f22368a;
                e2Var3.I = i35;
                TextView textView2 = new TextView(getContext());
                int i36 = org.telegram.ui.ActionBar.y6.f23438hg;
                org.telegram.ui.ActionBar.f7.V(textView2, i36, null);
                textView2.setTextSize(1, 16.0f);
                if (LocaleController.isRTL) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                textView2.setGravity(i11 | 48);
                ?? frameLayout2 = new FrameLayout(getContext());
                alertDialog$Builder3.o(frameLayout2);
                org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
                j9Var.u(AndroidUtilities.dp(12.0f));
                org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(getContext());
                y9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                frameLayout2.addView(y9Var, org.telegram.ui.Components.gb1.h(40, 40.0f, i12 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                j9Var.j(this.currentAccount, tLObject);
                boolean z11 = tLObject instanceof TLRPC.User;
                if (z11) {
                    TLRPC.User user2 = (TLRPC.User) tLObject;
                    y9Var.f(user2, j9Var);
                    str = UserObject.getFirstName(user2);
                } else {
                    TLRPC.Chat chat2 = (TLRPC.Chat) tLObject;
                    y9Var.f(chat2, j9Var);
                    str = chat2.title;
                }
                TextView textView3 = new TextView(getContext());
                org.telegram.messenger.t.r(textView3, i36, null, 1, 20.0f);
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
                        org.telegram.messenger.vh.o(R.string.VoipConferenceRemoveMemberAlertText2, new Object[]{str}, textView2);
                    } else {
                        textView3.setText(LocaleController.getString(R.string.VoipGroupRemoveMemberAlertTitle2));
                        if (ChatObject.isChannelOrGiga(this.Z0)) {
                            org.telegram.messenger.vh.o(R.string.VoipChannelRemoveMemberAlertText2, new Object[]{str, str2}, textView2);
                        } else {
                            org.telegram.messenger.vh.o(R.string.VoipGroupRemoveMemberAlertText2, new Object[]{str, str2}, textView2);
                        }
                    }
                } else {
                    textView3.setText(LocaleController.getString(R.string.VoipGroupAddMemberTitle));
                    org.telegram.messenger.vh.o(R.string.VoipGroupAddMemberText, new Object[]{str, str2}, textView2);
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
                frameLayout2.addView(textView3, org.telegram.ui.Components.gb1.h(-1, -2.0f, i37, f10, 11.0f, i38, 0.0f));
                if (LocaleController.isRTL) {
                    i16 = 5;
                } else {
                    i16 = 3;
                }
                frameLayout2.addView(textView2, org.telegram.ui.Components.gb1.h(-2, -2.0f, i16 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
                if (i10 == 2) {
                    alertDialog$Builder3.k(LocaleController.getString(R.string.VoipGroupUserRemove), new org.telegram.ui.Components.voip.k1(13, this, tLObject));
                } else if (z11) {
                    alertDialog$Builder3.k(LocaleController.getString(R.string.VoipGroupAdd), new bi.i(this, (TLRPC.User) tLObject, j10, 6));
                }
                alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                e2Var3.j(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23683ug, false));
                e2Var3.show();
                if (i10 == 2 && (textView = (TextView) e2Var3.d(-1)) != null) {
                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23701vg, null);
                }
            }
        }
    }

    public final void y1(boolean r18, org.telegram.ui.Cells.i4 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.v50.y1(boolean, org.telegram.ui.Cells.i4):void");
    }

    public final void z1() {
        y5 y5Var = this.A2;
        AndroidUtilities.cancelRunOnUIThread(y5Var);
        if (this.f44716z2 && this.U0 != null && VoIPService.getSharedInstance() != null && r1() && this.Q != null && LiteMode.isEnabled(512)) {
            AndroidUtilities.runOnUIThread(y5Var, 30L);
        }
    }

    @Override
    public final void z(float f7, int i10) {
    }
}
