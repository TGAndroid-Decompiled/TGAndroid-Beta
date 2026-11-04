package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
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
import java.util.regex.Pattern;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;
import org.webrtc.voiceengine.WebRtcAudioTrack;
public final class x30 extends org.telegram.ui.ActionBar.t2 implements org.telegram.messenger.cs, VoIPService.StateListener, qe.b {
    public static boolean A5;
    public static x30 f51711v5;
    public static boolean f51712w5;
    public static boolean f51713x5;
    public static boolean f51714y5;
    public static volatile org.telegram.messenger.q5 f51715z5 = new org.telegram.messenger.q5("updateTextureLightningQueue", true);
    public final ImageView A1;
    public int A2;
    public final Paint A3;
    public boolean A4;
    public final ImageView B1;
    public final org.telegram.ui.Components.ch0 B2;
    public final Paint B3;
    public final View B4;
    public org.telegram.ui.Components.li0 C1;
    public final org.telegram.ui.Components.ch0 C2;
    public final w30[] C3;
    public final View C4;
    public final d30 D1;
    public boolean D2;
    public float D3;
    public GradientDrawable D4;
    public final org.telegram.ui.Components.h6 E1;
    public final org.telegram.ui.Components.q9 E2;
    public w30 E3;
    public final int[] E4;
    public final n10 F1;
    public final org.telegram.ui.Components.q9 F2;
    public w30 F3;
    public final r10 F4;
    public final u20 G1;
    public float G2;
    public long G3;
    public boolean G4;
    public final r30 H1;
    public float H2;
    public float H3;
    public boolean H4;
    public final f30 I1;
    public float I2;
    public float I3;
    public RenderNode I4;
    public final l20 J1;
    public RadialGradient J2;
    public boolean J3;
    public float J4;
    public final TextView K1;
    public final Matrix K2;
    public boolean K3;
    public boolean K4;
    public final j20 L1;
    public final Paint L2;
    public int L3;
    public final String[] L4;
    public final org.telegram.ui.ActionBar.k5 M1;
    public final m30 M2;
    public float M3;
    public ObjectAnimator M4;
    public final e30 N1;
    public float N2;
    public int N3;
    public ObjectAnimator N4;
    public final org.telegram.ui.ActionBar.k5 O1;
    public float O2;
    public boolean O3;
    public final q20 O4;
    public final l30 P1;
    public ValueAnimator P2;
    public final int[] P3;
    public org.telegram.ui.Cells.f4 P4;
    public final org.telegram.ui.Components.iy Q1;
    public TLRPC.InputPeer Q2;
    public final ArrayList Q3;
    public org.telegram.ui.Components.voip.k Q4;
    public final ImageReceiver R1;
    public TLRPC.Chat R2;
    public final ArrayList R3;
    public org.telegram.ui.Components.voip.r R4;
    public int S1;
    public org.telegram.messenger.r3 S2;
    public final u10 S3;
    public org.telegram.ui.Components.d10 S4;
    public final ImageView T1;
    public final boolean T2;
    public final z10 T3;
    public boolean T4;
    public final oh.h U1;
    public final String U2;
    public final m20 U3;
    public boolean U4;
    public final int V1;
    public final s30 V2;
    public float V3;
    public int V4;
    public final RadialProgressView W1;
    public final m10 W2;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout W3;
    public AnimatorSet W4;
    public final Drawable X1;
    public final o10 X2;
    public boolean X3;
    public z20 X4;
    public final View Y1;
    public final Paint Y2;
    public boolean Y3;
    public int Y4;
    public AnimatorSet Z1;
    public ValueAnimator Z2;
    public org.telegram.ui.Components.f30 Z3;
    public int Z4;
    public LaunchActivity f51716a2;
    public float f51717a3;
    public g30 f51718a4;
    public int f51719a5;
    public final UndoView[] f51720b2;
    public final LinearLayout f51721b3;
    public Boolean f51722b4;
    public int f51723b5;
    public final org.telegram.ui.Cells.k c2;
    public final org.telegram.ui.ActionBar.q0 f51724c3;
    public int f51725c4;
    public int f51726c5;
    public boolean f51727d2;
    public final org.telegram.ui.ActionBar.q0 f51728d3;
    public boolean f51729d4;
    public int f51730d5;
    public org.telegram.ui.Components.u20 f51731e2;
    public final org.telegram.ui.ActionBar.q0 f51732e3;
    public final q10 f51733e4;
    public int f51734e5;
    public org.telegram.ui.Components.u20 f51735f2;
    public final org.telegram.ui.ActionBar.y0 f51736f3;
    public final org.telegram.ui.Components.tj0 f51737f4;
    public int f51738f5;
    public int f51739g2;
    public final org.telegram.ui.ActionBar.y0 f51740g3;
    public final a40 f51741g4;
    public int f51742g5;
    public g.b f51743h2;
    public final org.telegram.ui.ActionBar.y0 f51744h3;
    public final org.telegram.ui.Components.e10 f51745h4;
    public int f51746h5;
    public final ArrayList f51747i2;
    public final org.telegram.ui.ActionBar.y0 i3;
    public ViewTreeObserver.OnPreDrawListener f51748i4;
    public int f51749i5;
    public final w10 f51750j1;
    public t20 f51751j2;
    public final org.telegram.ui.ActionBar.y0 f51752j3;
    public final org.telegram.ui.Components.voip.g f51753j4;
    public int f51754j5;
    public final b10 k1;
    public boolean f51755k2;
    public final org.telegram.ui.ActionBar.y0 f51756k3;
    public boolean f51757k4;
    public int f51758k5;
    public final org.telegram.messenger.c f51759l1;
    public long f51760l2;
    public final org.telegram.ui.ActionBar.y0 f51761l3;
    public final ArrayList f51762l4;
    public int f51763l5;
    public final h10 m1;
    public boolean f51764m2;
    public final org.telegram.ui.ActionBar.y0 f51765m3;
    public boolean f51766m4;
    public int f51767m5;
    public final org.telegram.ui.Components.voip.c2 f51768n1;
    public final RectF f51769n2;
    public final org.telegram.ui.ActionBar.y0 f51770n3;
    public final p00 n4;
    public int f51771n5;
    public final org.telegram.ui.Components.voip.c2 f51772o1;
    public boolean f51773o2;
    public final org.telegram.ui.ActionBar.y0 f51774o3;
    public final l10 f51775o4;
    public final a30 f51776o5;
    public final org.telegram.ui.Components.voip.c2 f51777p1;
    public boolean f51778p2;
    public final org.telegram.ui.ActionBar.y0 f51779p3;
    public final org.telegram.ui.Components.go f51780p4;
    public Boolean f51781p5;
    public final org.telegram.ui.Components.voip.c2 f51782q1;
    public float f51783q2;
    public final org.telegram.ui.ActionBar.y0 f51784q3;
    public final p00 f51785q4;
    public Integer f51786q5;
    public final org.telegram.ui.Components.voip.c2 f51787r1;
    public o20 f51788r2;
    public final LinearLayout f51789r3;
    public boolean f51790r4;
    public final qe.a r5;
    public final org.telegram.ui.Components.voip.c2 f51791s1;
    public TLRPC.Peer f51792s2;
    public final TextView f51793s3;
    public final o4 f51794s4;
    public final qe.a f51795s5;
    public final org.telegram.ui.Components.voip.c2 f51796t1;
    public TLObject f51797t2;
    public final v30 f51798t3;
    public final LongSparseIntArray f51799t4;
    public final qe.c f51800t5;
    public final i10 f51801u1;
    public final Paint f51802u2;
    public final sh.h f51803u3;
    public final x10 f51804u4;
    public final qe.a f51805u5;
    public final ImageView f51806v1;
    public final ArrayList f51807v2;
    public p00 f51808v3;
    public final v10 f51809v4;
    public final Paint f51810w1;
    public final ArrayList f51811w2;
    public org.telegram.ui.Components.d20 f51812w3;
    public LinearLayout f51813w4;
    public final f20 f51814x1;
    public final ArrayList f51815x2;
    public int f51816x3;
    public boolean f51817x4;
    public final e20 f51818y1;
    public final ArrayList f51819y2;
    public boolean f51820y3;
    public final org.telegram.ui.Components.ch0 f51821y4;
    public final c20 f51822z1;
    public final ArrayList f51823z2;
    public boolean f51824z3;
    public int f51825z4;

    public x30(final LaunchActivity launchActivity, org.telegram.messenger.c cVar, org.telegram.messenger.r3 r3Var, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        super((Context) launchActivity, (org.telegram.ui.ActionBar.e6) null, true, true);
        int i3;
        final LaunchActivity launchActivity2;
        final x30 x30Var;
        final ?? r13;
        TLRPC.Chat chat2;
        ConferenceCall conferenceCall;
        this.f51810w1 = new Paint(1);
        this.f51720b2 = new UndoView[2];
        this.f51747i2 = new ArrayList();
        this.f51769n2 = new RectF();
        this.f51802u2 = new Paint(1);
        this.f51807v2 = new ArrayList();
        this.f51811w2 = new ArrayList();
        this.f51815x2 = new ArrayList();
        this.f51819y2 = new ArrayList();
        this.f51823z2 = new ArrayList();
        this.f51803u3 = new sh.h(new p00(this, 8));
        this.f51816x3 = 0;
        this.f51820y3 = false;
        this.A3 = new Paint(7);
        this.B3 = new Paint(7);
        this.C3 = new w30[8];
        this.D3 = 1.0f;
        this.O3 = true;
        this.P3 = new int[4];
        this.Q3 = new ArrayList();
        this.R3 = new ArrayList();
        this.f51753j4 = new org.telegram.ui.Components.voip.g();
        this.f51762l4 = new ArrayList();
        this.n4 = new p00(this, 0);
        this.f51775o4 = new l10(this);
        this.f51780p4 = new org.telegram.ui.Components.go(17);
        this.f51785q4 = new p00(this, 1);
        this.f51790r4 = false;
        this.f51794s4 = new o4(this, 7);
        this.f51799t4 = new LongSparseIntArray();
        this.E4 = new int[2];
        this.H4 = true;
        this.L4 = new String[2];
        this.V4 = -1;
        this.f51776o5 = new a30(this);
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f40452f;
        this.r5 = new qe.a(2, this, xqVar, 350L);
        this.f51795s5 = new qe.a(3, this, xqVar, 220L, true);
        this.f51800t5 = new qe.c(4, this, xqVar, 350L);
        this.f51805u5 = new qe.a(5, this, xqVar, 350L);
        org.telegram.messenger.g0.S(getWindow());
        D0();
        this.f51759l1 = cVar;
        this.S2 = r3Var;
        this.Q2 = inputPeer;
        this.R2 = chat;
        this.U2 = str;
        this.f28583a = cVar.f21919a;
        this.T2 = z10;
        this.J0 = new ei.k0();
        this.Q0 = true;
        this.R0 = true;
        this.V1 = org.telegram.messenger.hp.s1(this.f28583a).f23167x7.f24678x.T();
        this.V = true;
        f51714y5 = false;
        f51713x5 = false;
        A5 = false;
        this.f28626z0 = new g20(this);
        this.f28615s = true;
        this.f28608n = true;
        if (Build.VERSION.SDK_INT >= 30) {
            getWindow().setNavigationBarColor(-16777216);
        }
        this.f28620w = true;
        this.G0 = -1;
        this.O4 = new q20(this);
        setOnDismissListener(new t00(this, 0));
        z0();
        r30 r30Var = new r30(this, launchActivity);
        this.H1 = r30Var;
        org.telegram.ui.Components.ap apVar = new org.telegram.ui.Components.ap(true);
        int i10 = org.telegram.ui.ActionBar.k6.f27908eh;
        apVar.b(org.telegram.ui.ActionBar.k6.v0(i10));
        apVar.d();
        u20 u20Var = new u20(this, launchActivity, apVar);
        this.G1 = u20Var;
        u20Var.setSubtitle("");
        u20Var.getSubtitleTextView().setVisibility(0);
        u20Var.o();
        u20Var.getAdditionalSubtitleTextView().setPadding(org.telegram.messenger.g0.L(24.0f), 0, 0, 0);
        org.telegram.messenger.g0.W3(1.0f, u20Var.getAdditionalSubtitleTextView(), this.f51766m4, false);
        u20Var.getAdditionalSubtitleTextView().setTextColor(org.telegram.ui.ActionBar.k6.v0(i10));
        int i11 = org.telegram.ui.ActionBar.k6.Zg;
        org.telegram.ui.ActionBar.r6.m(u20Var, 6, i11, null);
        u20Var.setBackButtonImage(2131231240);
        u20Var.setOccupyStatusBar(false);
        u20Var.setAllowOverlayTitle(false);
        int i12 = org.telegram.ui.ActionBar.k6.Vg;
        org.telegram.ui.ActionBar.r6.m(u20Var, 1, i12, null);
        org.telegram.ui.ActionBar.r6.m(u20Var, 3, org.telegram.ui.ActionBar.k6.f28292z8, null);
        org.telegram.ui.ActionBar.r6.e(u20Var, i12);
        org.telegram.ui.ActionBar.r6.m(u20Var, 6, i11, null);
        u20Var.setActionBarMenuOnItemClick(new c30(this, launchActivity));
        TLRPC.InputPeer groupCallPeer = inputPeer != null ? inputPeer : VoIPService.getSharedInstance().getGroupCallPeer();
        if (groupCallPeer == null) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            this.f51792s2 = tL_peerUser;
            i3 = i12;
            tL_peerUser.user_id = cVar.d().e();
        } else {
            i3 = i12;
            if (groupCallPeer instanceof TLRPC.TL_inputPeerChannel) {
                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                this.f51792s2 = tL_peerChannel;
                tL_peerChannel.channel_id = groupCallPeer.channel_id;
            } else if (groupCallPeer instanceof TLRPC.TL_inputPeerUser) {
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                this.f51792s2 = tL_peerUser2;
                tL_peerUser2.user_id = groupCallPeer.user_id;
            } else if (groupCallPeer instanceof TLRPC.TL_inputPeerChat) {
                TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                this.f51792s2 = tL_peerChat;
                tL_peerChat.chat_id = groupCallPeer.chat_id;
            }
        }
        VoIPService.audioLevelsCallback = new m00(this, 3);
        cVar.b().c(this, org.telegram.messenger.hs.f23328w2);
        cVar.b().c(this, org.telegram.messenger.hs.M0);
        cVar.b().c(this, org.telegram.messenger.hs.T);
        cVar.b().c(this, org.telegram.messenger.hs.f23314u1);
        cVar.b().c(this, org.telegram.messenger.hs.B2);
        cVar.b().c(this, org.telegram.messenger.hs.E0);
        cVar.b().c(this, org.telegram.messenger.hs.f23248j0);
        cVar.b().c(this, org.telegram.messenger.hs.f23292r);
        cVar.b().c(this, org.telegram.messenger.hs.f23349z2);
        cVar.b().c(this, org.telegram.messenger.hs.f23342y2);
        cVar.b().c(this, org.telegram.messenger.hs.R3);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.N4);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.D2);
        this.X1 = launchActivity.getResources().getDrawable(2131232726).mutate();
        org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(2131624344, org.telegram.messenger.g0.L(46.0f), org.telegram.messenger.g0.L(46.0f), true, null);
        this.B2 = ch0Var;
        this.C2 = new org.telegram.ui.Components.ch0(2131624044, org.telegram.messenger.g0.L(46.0f), org.telegram.messenger.g0.L(46.0f), true, null);
        d30 d30Var = new d30(this, launchActivity);
        this.D1 = d30Var;
        this.f28586b = d30Var;
        d30Var.setClipToPadding(false);
        this.f28586b.setFocusable(true);
        this.f28586b.setFocusableInTouchMode(true);
        this.f28586b.setWillNotDraw(false);
        ViewGroup viewGroup = this.f28586b;
        int i13 = this.f28618u0;
        viewGroup.setPadding(i13, 0, i13, 0);
        this.f28586b.setKeepScreenOn(true);
        this.f28586b.setClipChildren(false);
        this.R1 = new ImageReceiver(this.f28586b);
        if (inputPeer != null) {
            org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(launchActivity);
            this.M1 = k5Var;
            k5Var.setGravity(17);
            k5Var.setTextColor(-1);
            k5Var.setTypeface(org.telegram.messenger.g0.o());
            k5Var.setTextSize(18);
            k5Var.k(org.telegram.messenger.bd.L0(2131743445));
            this.f28586b.addView(k5Var, b8.mf.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 311.0f));
            e30 e30Var = new e30(this, launchActivity);
            this.N1 = e30Var;
            e30Var.setGravity(17);
            e30Var.setTextColor(-1);
            e30Var.setTypeface(org.telegram.messenger.g0.o());
            e30Var.setTextSize(60);
            this.f28586b.addView(e30Var, b8.mf.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 231.0f));
            org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(launchActivity);
            this.O1 = k5Var2;
            k5Var2.setGravity(17);
            k5Var2.setTextColor(-1);
            k5Var2.setTypeface(org.telegram.messenger.g0.o());
            k5Var2.setTextSize(18);
            this.f28586b.addView(k5Var2, b8.mf.d(-2, -2.0f, 49, 21.0f, 0.0f, 21.0f, 201.0f));
        }
        if (t1()) {
            m30 m30Var = new m30(this, launchActivity);
            this.M2 = m30Var;
            this.f28586b.addView(m30Var, b8.mf.d(-1, 80.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
        }
        f30 f30Var = new f30(this, launchActivity);
        this.I1 = f30Var;
        f30Var.setClipToPadding(false);
        f30Var.setClipChildren(false);
        l30 l30Var = new l30(this);
        this.P1 = l30Var;
        l30Var.f55597o = xqVar;
        l30Var.d = 350L;
        l30Var.f55616c = 350L;
        l30Var.f55617e = 350L;
        l30Var.S();
        f30Var.setItemAnimator(l30Var);
        f30Var.setOnScrollListener(new a10(this));
        f30Var.setVerticalScrollBarEnabled(false);
        getContext();
        org.telegram.ui.Components.iy iyVar = new org.telegram.ui.Components.iy(f51713x5 ? 6 : 2, f30Var);
        this.Q1 = iyVar;
        f30Var.setLayoutManager(iyVar);
        b10 b10Var = new b10(this);
        this.k1 = b10Var;
        iyVar.z1(b10Var);
        f30Var.i(new c10(this));
        iyVar.C1();
        this.f28586b.addView(f30Var, b8.mf.d(-1, -1.0f, 51, 14.0f, 14.0f, 14.0f, 231.0f));
        f30Var.setAdapter(r30Var);
        f30Var.setTopBottomSelectorRadius(13);
        org.telegram.ui.ActionBar.r6.J(org.telegram.ui.ActionBar.k6.Sg, f30Var);
        f30Var.setOnItemClickListener(new b7(this, launchActivity, r3Var, 14));
        f30Var.setOnItemLongClickListener(new m00(this, 4));
        if (t1()) {
            v30 v30Var = new v30(this, getContext());
            this.f51798t3 = v30Var;
            this.f28586b.addView(v30Var, b8.mf.d(-1, 0.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(launchActivity);
        this.f51737f4 = tj0Var;
        this.f28586b.addView(tj0Var, b8.mf.d(-1, -1.0f, 51, 14.0f, 14.0f, 324.0f, 14.0f));
        a40 a40Var = new a40(r3Var, this.f28583a, this);
        this.f51741g4 = a40Var;
        tj0Var.setAdapter(a40Var);
        u4.s sVar = new u4.s(6, false);
        tj0Var.setLayoutManager(sVar);
        sVar.z1(new e10(this));
        tj0Var.setOnItemClickListener(new org.telegram.ui.Components.fj0(this) {
            public final x30 f48163b;

            {
                this.f48163b = this;
            }

            @Override
            public final void f(int i14, View view) {
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.d10 d10Var = (org.telegram.ui.Components.d10) view;
                        org.telegram.messenger.s3 videoParticipant = d10Var.getVideoParticipant();
                        x30 x30Var2 = this.f48163b;
                        if (videoParticipant == null) {
                            x30Var2.g1(new org.telegram.messenger.s3(d10Var.getParticipant(), false));
                            return;
                        } else {
                            x30Var2.g1(d10Var.getVideoParticipant());
                            return;
                        }
                    default:
                        x30 x30Var3 = this.f48163b;
                        x30Var3.getClass();
                        org.telegram.ui.Components.voip.k kVar = (org.telegram.ui.Components.voip.k) view;
                        if (kVar.getParticipant() != null) {
                            x30Var3.g1(kVar.getParticipant());
                            return;
                        }
                        return;
                }
            }
        });
        u4.k kVar = new u4.k();
        kVar.S();
        kVar.f55597o = xqVar;
        kVar.d = 350L;
        kVar.f55616c = 350L;
        kVar.f55617e = 350L;
        tj0Var.setItemAnimator(new f10(this));
        tj0Var.setOnScrollListener(new g10(this));
        a40Var.H(tj0Var, false, false);
        tj0Var.setVisibility(8);
        h10 h10Var = new h10(this, launchActivity);
        this.m1 = h10Var;
        int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f28264xh);
        int red = Color.red(v02);
        int green = Color.green(v02);
        int blue = Color.blue(v02);
        this.K2 = new Matrix();
        this.J2 = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(72.72727f), new int[]{Color.argb(50, red, green, blue), Color.argb(0, red, green, blue)}, (float[]) null, Shader.TileMode.CLAMP);
        Paint paint = new Paint(1);
        this.L2 = paint;
        paint.setShader(this.J2);
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(9);
        this.E2 = q9Var;
        org.telegram.ui.Components.q9 q9Var2 = new org.telegram.ui.Components.q9(12);
        this.F2 = q9Var2;
        q9Var.f37381a = org.telegram.messenger.g0.L(62.0f) * 0.45454547f;
        q9Var.f37382b = org.telegram.messenger.g0.L(72.0f) * 0.45454547f;
        q9Var.b();
        q9Var2.f37381a = org.telegram.messenger.g0.L(65.0f) * 0.45454547f;
        q9Var2.f37382b = org.telegram.messenger.g0.L(75.0f) * 0.45454547f;
        q9Var2.b();
        int i14 = org.telegram.ui.ActionBar.k6.f28245wh;
        q9Var.d.setColor(i0.a.o(org.telegram.ui.ActionBar.k6.v0(i14), 38));
        q9Var2.d.setColor(i0.a.o(org.telegram.ui.ActionBar.k6.v0(i14), 76));
        org.telegram.ui.Components.voip.c2 c2Var = new org.telegram.ui.Components.voip.c2(launchActivity, 50.0f);
        this.f51782q1 = c2Var;
        c2Var.setCheckable(true);
        c2Var.setTextSize(12);
        h10Var.a(c2Var);
        c2Var.setOnClickListener(new n00(this, 7));
        org.telegram.ui.Components.voip.c2 c2Var2 = new org.telegram.ui.Components.voip.c2(launchActivity, 50.0f);
        this.f51777p1 = c2Var2;
        c2Var2.setCheckable(true);
        c2Var2.setTextSize(12);
        c2Var2.d(false, false);
        c2Var2.setCrossOffset(-org.telegram.messenger.g0.N(3.5f));
        c2Var2.c(2131230926, -1, 0, 1.0f, true, org.telegram.messenger.bd.L0(2131743499), false, false);
        org.telegram.ui.Components.voip.c2 c2Var3 = new org.telegram.ui.Components.voip.c2(launchActivity, 50.0f);
        this.f51768n1 = c2Var3;
        c2Var3.setCheckable(true);
        c2Var3.setTextSize(12);
        c2Var3.d(false, false);
        org.telegram.ui.Components.fh0 fh0Var = new org.telegram.ui.Components.fh0(launchActivity);
        c2Var3.addView(fh0Var, b8.mf.d(32, 32.0f, 1, 0.0f, 10.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.ch0 ch0Var2 = new org.telegram.ui.Components.ch0(2131623962, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), true, null);
        this.f51821y4 = ch0Var2;
        fh0Var.setAnimation(ch0Var2);
        c2Var3.setOnClickListener(new n00(this, 10));
        h10Var.a(c2Var3);
        org.telegram.ui.Components.voip.c2 c2Var4 = new org.telegram.ui.Components.voip.c2(launchActivity, 50.0f);
        this.f51772o1 = c2Var4;
        c2Var4.setCheckable(true);
        c2Var4.setTextSize(12);
        c2Var4.d(false, false);
        ImageView imageView = new ImageView(launchActivity);
        this.T1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.S1 = 2131231171;
        imageView.setImageResource(2131231171);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setScaleX(1.11f);
        imageView.setScaleY(1.11f);
        c2Var4.addView(imageView, b8.mf.d(30, 30.0f, 1, 0.0f, 11.0f, 0.0f, 0.0f));
        c2Var4.setOnClickListener(new n00(this, 11));
        h10Var.a(c2Var4);
        h10Var.a(c2Var2);
        org.telegram.ui.Components.voip.c2 c2Var5 = new org.telegram.ui.Components.voip.c2(launchActivity, 50.0f);
        this.f51787r1 = c2Var5;
        c2Var5.setTextSize(12);
        c2Var5.c(2131230918, -1, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f28150rh), 0.3f, false, org.telegram.messenger.bd.L0(2131743374), false, false);
        c2Var5.setOnClickListener(new View.OnClickListener(this) {
            public final x30 f49318b;

            {
                this.f49318b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        x30 x30Var2 = this.f49318b;
                        LaunchActivity launchActivity3 = x30Var2.f51716a2;
                        if (launchActivity3 != null && launchActivity3.checkSelfPermission("android.permission.CAMERA") != 0) {
                            x30Var2.f51716a2.requestPermissions(new String[]{"android.permission.CAMERA"}, 104);
                            return;
                        } else if (VoIPService.getSharedInstance() != null) {
                            boolean z11 = false;
                            if (VoIPService.getSharedInstance().getVideoState(false) != 2) {
                                x30Var2.f51720b2[0].d(1, false);
                                if (x30Var2.f51788r2 == null) {
                                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                                    if (sharedInstance != null) {
                                        sharedInstance.createCaptureDevice(false);
                                    }
                                    if (VoIPService.getSharedInstance().getVideoState(true) != 2) {
                                        z11 = true;
                                    }
                                    o20 o20Var = new o20(x30Var2, launchActivity, z11);
                                    x30Var2.f51788r2 = o20Var;
                                    o20Var.setBottomPadding(x30Var2.f28586b.getPaddingBottom());
                                    x30Var2.f28589c.addView(x30Var2.f51788r2);
                                    if (sharedInstance != null && !sharedInstance.isFrontFaceCamera()) {
                                        sharedInstance.switchCamera();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            VoIPService.getSharedInstance().setVideoState(false, 0);
                            x30Var2.Q1(true, false);
                            x30Var2.P1(false);
                            x30Var2.S2.z();
                            x30Var2.Q0(true);
                            x30Var2.m1.requestLayout();
                            return;
                        } else {
                            return;
                        }
                    default:
                        x30 x30Var3 = this.f49318b;
                        x30Var3.S3.e();
                        org.telegram.messenger.r3 r3Var2 = x30Var3.S2;
                        if (r3Var2 != null && !r3Var2.j()) {
                            x30Var3.L1();
                            x30.v1(launchActivity, new p00(x30Var3, 5), false, false);
                            return;
                        }
                        x30Var3.dismiss();
                        return;
                }
            }
        });
        org.telegram.ui.Components.voip.c2 c2Var6 = new org.telegram.ui.Components.voip.c2(launchActivity, 50.0f);
        this.f51791s1 = c2Var6;
        c2Var6.setCheckable(true);
        c2Var6.b(true, false);
        c2Var6.setTextSize(12);
        c2Var6.c(2131231186, -1, 0, 1.0f, true, org.telegram.messenger.bd.L0(2131743304), false, false);
        i10 i10Var = new i10(this, launchActivity);
        this.f51801u1 = i10Var;
        i10Var.setAnimation(ch0Var);
        i10Var.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.Components.voip.c2 c2Var7 = new org.telegram.ui.Components.voip.c2(launchActivity, 50.0f);
        this.f51796t1 = c2Var7;
        c2Var7.setDrawBackground(false);
        c2Var7.setTextSize(12);
        c2Var7.c(0, 0, 0, 1.0f, true, "Text", false, false);
        c2Var7.addView(i10Var, b8.mf.e(50, 50, 49));
        h10Var.a(c2Var7);
        c2Var7.setOnClickListener(new k10(this));
        h10Var.a(c2Var6);
        h10Var.a(c2Var5);
        ImageView imageView2 = new ImageView(launchActivity);
        this.f51806v1 = imageView2;
        imageView2.setVisibility(8);
        imageView2.setImageResource(2131232797);
        c2Var7.addView(imageView2, b8.mf.d(24, 24.0f, 49, 0.0f, 13.0f, 0.0f, 0.0f));
        if (this.S2 != null && t1() && !this.S2.j()) {
            imageView2.setVisibility(0);
            i10Var.setVisibility(8);
        }
        RadialProgressView radialProgressView = new RadialProgressView(launchActivity);
        this.W1 = radialProgressView;
        radialProgressView.setSize(org.telegram.messenger.g0.L(50.0f));
        radialProgressView.setStrokeWidth(2.0f);
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Ch));
        u20Var.setAlpha(0.0f);
        u20Var.getBackButton().setScaleX(0.9f);
        u20Var.getBackButton().setScaleY(0.9f);
        u20Var.getBackButton().setTranslationX(-org.telegram.messenger.g0.L(14.0f));
        u20Var.getTitleTextView().setTranslationY(org.telegram.messenger.g0.L(23.0f));
        u20Var.getSubtitleTextView().setTranslationY(org.telegram.messenger.g0.L(20.0f));
        u20Var.getAdditionalSubtitleTextView().setTranslationY(org.telegram.messenger.g0.L(20.0f));
        org.telegram.ui.ActionBar.q0 q0Var = new org.telegram.ui.ActionBar.q0(launchActivity, (org.telegram.ui.ActionBar.x) null, org.telegram.ui.ActionBar.k6.v0(i3));
        this.f51724c3 = q0Var;
        q0Var.setLongClickEnabled(false);
        q0Var.setIcon(2131231244);
        q0Var.setContentDescription(org.telegram.messenger.bd.L0(2131754839));
        q0Var.setSubMenuOpenSide(2);
        q0Var.setDelegate(new m00(this, 0));
        int i15 = org.telegram.ui.ActionBar.k6.Wg;
        org.telegram.ui.ActionBar.r6.S(q0Var, org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.v0(i15), 6), null, org.telegram.ui.ActionBar.r6.N(i15));
        q0Var.setOnClickListener(new n00(this, 0));
        q0Var.O(org.telegram.ui.ActionBar.k6.v0(i3), false);
        q0Var.O(org.telegram.ui.ActionBar.k6.v0(i3), true);
        org.telegram.ui.ActionBar.q0 q0Var2 = new org.telegram.ui.ActionBar.q0(launchActivity, (org.telegram.ui.ActionBar.x) null, org.telegram.ui.ActionBar.k6.v0(i3));
        this.f51728d3 = q0Var2;
        q0Var2.setLongClickEnabled(false);
        q0Var2.setIcon(2131232429);
        q0Var2.setContentDescription(org.telegram.messenger.bd.L0(2131754808));
        org.telegram.ui.ActionBar.r6.S(q0Var2, org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.v0(i15), 6), null, org.telegram.ui.ActionBar.r6.N(i15));
        q0Var2.setOnClickListener(new n00(this, 1));
        org.telegram.ui.ActionBar.q0 q0Var3 = new org.telegram.ui.ActionBar.q0(launchActivity, (org.telegram.ui.ActionBar.x) null, org.telegram.ui.ActionBar.k6.v0(i3));
        this.f51732e3 = q0Var3;
        q0Var3.setLongClickEnabled(false);
        q0Var3.setIcon(2131232352);
        q0Var3.setContentDescription(org.telegram.messenger.bd.L0(2131754808));
        org.telegram.ui.ActionBar.r6.S(q0Var3, org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.v0(i15), 6), null, org.telegram.ui.ActionBar.r6.N(i15));
        q0Var3.setOnClickListener(new n00(this, 2));
        m10 m10Var = new m10(this, launchActivity, launchActivity);
        this.W2 = m10Var;
        n10 n10Var = new n10(launchActivity);
        this.F1 = n10Var;
        n10Var.setAlpha(0.0f);
        Paint paint2 = new Paint(1);
        this.Y2 = paint2;
        paint2.setColor(-12761513);
        o10 o10Var = new o10(this, getContext());
        this.X2 = o10Var;
        org.telegram.ui.ActionBar.r6.V(o10Var, i3, this.J0);
        o10Var.setTextSize(1, 11.0f);
        o10Var.setText(org.telegram.messenger.bd.L0(2131743484));
        o10Var.setMaxLines(1);
        o10Var.setGravity(17);
        o10Var.setTypeface(org.telegram.messenger.g0.o());
        TLRPC.InputPeer inputPeer2 = groupCallPeer;
        o10Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(0.0f));
        o10Var.setTag(-1);
        if (!t1()) {
            o10Var.setVisibility(8);
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f51721b3 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.addView(m10Var, b8.mf.l(1.0f, 0, -2));
        linearLayout.addView(o10Var, b8.mf.k(6.0f, 4.0f, 0.0f, 0.0f, -2, 18));
        this.f28586b.addView(n10Var, b8.mf.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f28586b.addView(linearLayout, b8.mf.d(-2, -2.0f, 51, 23.0f, 0.0f, 48.0f, 0.0f));
        this.f28586b.addView(u20Var, b8.mf.d(-1, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(launchActivity);
        this.f51789r3 = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.addView(q0Var3, b8.mf.o(48, 48));
        linearLayout2.addView(q0Var2, b8.mf.o(48, 48));
        linearLayout2.addView(q0Var, b8.mf.o(48, 48));
        this.f28586b.addView(linearLayout2, b8.mf.e(-2, 48, 53));
        View view = new View(launchActivity);
        this.Y1 = view;
        view.setAlpha(0.0f);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.V5, view, null);
        this.f28586b.addView(view, b8.mf.c(1.0f, -1));
        for (int i16 = 0; i16 < 2; i16++) {
            this.f51720b2[i16] = new p10(this, launchActivity);
            this.f51720b2[i16].setAdditionalTranslationY(org.telegram.messenger.g0.L(10.0f));
            this.f51720b2[i16].setTranslationZ(org.telegram.messenger.g0.L(5.0f));
            this.f28586b.addView(this.f51720b2[i16], b8.mf.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        org.telegram.ui.Cells.k kVar2 = new org.telegram.ui.Cells.k(launchActivity, true);
        this.c2 = kVar2;
        kVar2.setTag(2131296437, 240);
        this.f51724c3.g(kVar2, org.telegram.messenger.g0.L(48.0f));
        this.f51724c3.setShowSubmenuByMove(false);
        int i17 = org.telegram.ui.ActionBar.k6.Sg;
        org.telegram.ui.ActionBar.r6.S(kVar2, org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.v0(i17), 6, 6), null, org.telegram.ui.ActionBar.r6.N(i17));
        org.telegram.ui.ActionBar.q0 q0Var4 = this.f51724c3;
        org.telegram.ui.ActionBar.y0 d = q0Var4.d(1, 0, null, org.telegram.messenger.bd.L0(2131743411), true, true, q0Var4.f28456n0);
        this.f51765m3 = d;
        d.m(true, false);
        org.telegram.ui.ActionBar.q0 q0Var5 = this.f51724c3;
        org.telegram.ui.ActionBar.y0 d10 = q0Var5.d(2, 0, null, org.telegram.messenger.bd.L0(2131743364), true, true, q0Var5.f28456n0);
        this.f51770n3 = d10;
        d10.m(false, true);
        int i18 = org.telegram.ui.ActionBar.k6.f28017kh;
        d.setCheckColor(i18);
        d.d(org.telegram.ui.ActionBar.k6.v0(i18), org.telegram.ui.ActionBar.k6.v0(i18));
        d10.setCheckColor(i18);
        d10.d(org.telegram.ui.ActionBar.k6.v0(i18), org.telegram.ui.ActionBar.k6.v0(i18));
        Paint paint3 = new Paint(1);
        int i19 = org.telegram.ui.ActionBar.k6.Vg;
        paint3.setColor(org.telegram.ui.ActionBar.k6.v0(i19));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
        paint3.setStrokeCap(Paint.Cap.ROUND);
        org.telegram.ui.ActionBar.q0 q0Var6 = this.f51724c3;
        org.telegram.ui.ActionBar.y0 d11 = q0Var6.d(10, 2131232430, null, org.telegram.messenger.bd.L0(2131743409), true, false, q0Var6.f28456n0);
        this.f51744h3 = d11;
        d11.setItemHeight(56);
        org.telegram.ui.ActionBar.q0 q0Var7 = this.f51724c3;
        org.telegram.ui.ActionBar.y0 d12 = q0Var7.d(11, 2131232261, null, org.telegram.messenger.bd.L0(2131743292), true, false, q0Var7.f28456n0);
        this.i3 = d12;
        d12.setItemHeight(56);
        TextView b10 = this.f51724c3.b(i0.a.f(0.3f, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Ug), -16777216));
        this.f51793s3 = b10;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).topMargin = 0;
        ((ViewGroup.MarginLayoutParams) b10.getLayoutParams()).bottomMargin = 0;
        org.telegram.ui.ActionBar.q0 q0Var8 = this.f51724c3;
        org.telegram.ui.ActionBar.y0 d13 = q0Var8.d(6, 2131232116, this.V2, org.telegram.messenger.bd.L0(org.telegram.messenger.t3.W(this.R2) ? 2131743495 : 2131743394), true, false, q0Var8.f28456n0);
        this.f51740g3 = d13;
        org.telegram.ui.ActionBar.q0 q0Var9 = this.f51724c3;
        org.telegram.ui.ActionBar.y0 d14 = q0Var9.d(7, 2131232276, this.V2, org.telegram.messenger.bd.L0(2131743395), false, false, q0Var9.f28456n0);
        this.f51752j3 = d14;
        org.telegram.ui.ActionBar.y0 e10 = this.f51724c3.e(3, 2131232203, org.telegram.messenger.bd.L0(2131743347));
        this.f51736f3 = e10;
        s30 s30Var = new s30();
        this.V2 = s30Var;
        org.telegram.ui.ActionBar.y0 e11 = this.f51724c3.e(9, 2131232352, org.telegram.messenger.bd.L0(2131743446));
        this.f51761l3 = e11;
        org.telegram.ui.ActionBar.q0 q0Var10 = this.f51724c3;
        org.telegram.ui.ActionBar.y0 d15 = q0Var10.d(5, 0, s30Var, org.telegram.messenger.bd.L0(2131743358), true, false, q0Var10.f28456n0);
        this.f51756k3 = d15;
        s30Var.a(d15.getImageView());
        org.telegram.ui.ActionBar.y0 e12 = this.f51724c3.e(12, 2131231895, org.telegram.messenger.bd.L0(2131743494));
        this.f51779p3 = e12;
        org.telegram.ui.ActionBar.y0 e13 = this.f51724c3.e(13, 2131230781, org.telegram.messenger.bd.L0(2131743496));
        this.f51784q3 = e13;
        org.telegram.ui.ActionBar.y0 e14 = this.f51724c3.e(4, 2131232087, org.telegram.messenger.bd.L0(q1() ? 2131743389 : org.telegram.messenger.t3.W(this.R2) ? 2131743491 : 2131743390));
        this.f51774o3 = e14;
        this.f51724c3.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.k6.v0(i17));
        this.f51724c3.getPopupLayout().setFitItems(true);
        e12.d(org.telegram.ui.ActionBar.k6.v0(i19), org.telegram.ui.ActionBar.k6.v0(i19));
        e13.d(org.telegram.ui.ActionBar.k6.v0(i19), org.telegram.ui.ActionBar.k6.v0(i19));
        d11.d(org.telegram.ui.ActionBar.k6.v0(i19), org.telegram.ui.ActionBar.k6.v0(i19));
        d12.d(org.telegram.ui.ActionBar.k6.v0(i19), org.telegram.ui.ActionBar.k6.v0(i19));
        int i20 = org.telegram.ui.ActionBar.k6.f27999jh;
        e14.d(org.telegram.ui.ActionBar.k6.v0(i20), org.telegram.ui.ActionBar.k6.v0(i20));
        e10.d(org.telegram.ui.ActionBar.k6.v0(i19), org.telegram.ui.ActionBar.k6.v0(i19));
        d13.d(org.telegram.ui.ActionBar.k6.v0(i19), org.telegram.ui.ActionBar.k6.v0(i19));
        d14.d(org.telegram.ui.ActionBar.k6.v0(i19), org.telegram.ui.ActionBar.k6.v0(i19));
        d15.d(org.telegram.ui.ActionBar.k6.v0(i19), org.telegram.ui.ActionBar.k6.v0(i19));
        e11.d(org.telegram.ui.ActionBar.k6.v0(i19), org.telegram.ui.ActionBar.k6.v0(i19));
        if (this.S2 != null) {
            n1();
        }
        if (q1()) {
            this.f51743h2 = new g.b();
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            this.f51743h2.b((sharedInstance == null || (conferenceCall = sharedInstance.conference) == null) ? null : conferenceCall.getEmojis());
        }
        S1(false);
        this.G1.getTitleTextView().setOnClickListener(new n00(this, 3));
        q10 q10Var = new q10(this, launchActivity);
        this.f51733e4 = q10Var;
        r10 r10Var = new r10(this);
        this.F4 = r10Var;
        q10Var.setClipToPadding(false);
        r10Var.S();
        r10Var.f55597o = org.telegram.ui.Components.xq.f40452f;
        r10Var.d = 350L;
        r10Var.f55616c = 350L;
        r10Var.f55617e = 350L;
        q10Var.setItemAnimator(r10Var);
        q10Var.setOnScrollListener(new s10(this));
        q10Var.setClipChildren(false);
        u4.b0 b0Var = new u4.b0();
        b0Var.j1(0);
        q10Var.setLayoutManager(b0Var);
        org.telegram.ui.Components.e10 e10Var = new org.telegram.ui.Components.e10(r3Var, this.f28583a, this);
        this.f51745h4 = e10Var;
        q10Var.setAdapter(e10Var);
        e10Var.F(q10Var, false);
        q10Var.setOnItemClickListener(new org.telegram.ui.Components.fj0(this) {
            public final x30 f48163b;

            {
                this.f48163b = this;
            }

            @Override
            public final void f(int i142, View view2) {
                switch (r2) {
                    case 0:
                        org.telegram.ui.Components.d10 d10Var = (org.telegram.ui.Components.d10) view2;
                        org.telegram.messenger.s3 videoParticipant = d10Var.getVideoParticipant();
                        x30 x30Var2 = this.f48163b;
                        if (videoParticipant == null) {
                            x30Var2.g1(new org.telegram.messenger.s3(d10Var.getParticipant(), false));
                            return;
                        } else {
                            x30Var2.g1(d10Var.getVideoParticipant());
                            return;
                        }
                    default:
                        x30 x30Var3 = this.f48163b;
                        x30Var3.getClass();
                        org.telegram.ui.Components.voip.k kVar3 = (org.telegram.ui.Components.voip.k) view2;
                        if (kVar3.getParticipant() != null) {
                            x30Var3.g1(kVar3.getParticipant());
                            return;
                        }
                        return;
                }
            }
        });
        q10Var.setOnItemLongClickListener(new m00(this, 1));
        q10Var.setVisibility(8);
        q10Var.i(new t10());
        u10 u10Var = new u10(this, launchActivity, this.I1, q10Var, this.Q3, this.S2, this);
        this.S3 = u10Var;
        u10Var.setClipChildren(false);
        e10Var.E(this.Q3, u10Var);
        if (this.f51737f4 != null) {
            this.f51741g4.G(this.Q3, u10Var);
        }
        v10 v10Var = new v10(this, launchActivity);
        this.f51809v4 = v10Var;
        w10 w10Var = new w10(this, launchActivity, this.G1, this.I1, v10Var);
        this.f51750j1 = w10Var;
        w10Var.setImagesLayerNum(Integer.MAX_VALUE);
        w10Var.setInvalidateWithParent(true);
        v10Var.setProfileGalleryView(w10Var);
        x10 x10Var = new x10(this, launchActivity);
        this.f51804u4 = x10Var;
        x10Var.setVisibility(8);
        w10Var.setVisibility(0);
        w10Var.b(new y10(this));
        z10 z10Var = new z10(this, launchActivity);
        this.T3 = z10Var;
        this.f28586b.addView(u10Var);
        u10Var.addView(q10Var, b8.mf.d(-1, 80.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        this.m1.setWillNotDraw(false);
        View view2 = new View(launchActivity);
        this.B4 = view2;
        int[] iArr = this.E4;
        iArr[0] = this.N3;
        iArr[1] = 0;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, this.E4);
        this.D4 = gradientDrawable;
        view2.setBackground(gradientDrawable);
        this.f28586b.addView(view2, b8.mf.e(-1, 60, 83));
        View view3 = new View(launchActivity);
        this.C4 = view3;
        view3.setBackgroundColor(this.E4[0]);
        this.f28586b.addView(view3, b8.mf.e(-1, 0, 83));
        oh.h hVar = new oh.h(launchActivity);
        this.U1 = hVar;
        hVar.setDelegate(new a20(this));
        hVar.setClickCellDelegate(new b20(this));
        org.telegram.messenger.r3 r3Var2 = this.S2;
        if (r3Var2 != null) {
            hVar.D0(this.f51759l1.f21919a, r3Var2.g(false));
        }
        this.f28586b.addView(hVar, b8.mf.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(launchActivity, false, true, true);
        this.E1 = h6Var;
        h6Var.setGravity(17);
        h6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        h6Var.setTextColor(-1);
        h6Var.b(0.4f, 320L, org.telegram.ui.Components.xq.h);
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        this.f28586b.addView(this.m1);
        c20 c20Var = new c20(this, launchActivity, this.D1, LaunchActivity.Q(), this.J0);
        this.f51822z1 = c20Var;
        c20Var.K = true;
        c20Var.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.V1)});
        c20Var.getEditText().setLinkTextColor(-11683585);
        c20Var.setHint(org.telegram.messenger.bd.L0(2131743938));
        c20Var.getEditText().addTextChangedListener(new d20(this));
        c20Var.s();
        e20 e20Var = new e20(this, launchActivity);
        this.f51818y1 = e20Var;
        this.f28586b.addView(e20Var, b8.mf.c(-1.0f, -1));
        f20 f20Var = new f20(launchActivity);
        this.f51814x1 = f20Var;
        f20Var.addView(c20Var, b8.mf.d(-1, -2.0f, 80, 0.0f, 0.0f, 48.0f, 0.0f));
        f20Var.addView(h6Var, b8.mf.d(52, 16.0f, 85, 0.0f, 0.0f, 0.0f, 32.0f));
        h6Var.setTranslationY(-org.telegram.messenger.g0.L(20.0f));
        this.f28586b.addView(f20Var, b8.mf.e(-1, -2, 80));
        ImageView imageView3 = new ImageView(launchActivity);
        this.B1 = imageView3;
        int i21 = org.telegram.ui.ActionBar.k6.f27972i6;
        org.telegram.ui.ActionBar.r6.R(imageView3, org.telegram.ui.ActionBar.k6.h0(V(i21), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i21), this.J0);
        int i22 = org.telegram.ui.ActionBar.k6.f27918f7;
        org.telegram.ui.ActionBar.e6 e6Var = this.J0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.t(imageView3, i22, e6Var, mode);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(2131230871);
        imageView3.setOnClickListener(new n00(this, 4));
        ImageView imageView4 = new ImageView(launchActivity);
        this.A1 = imageView4;
        org.telegram.ui.ActionBar.r6.R(imageView4, org.telegram.ui.ActionBar.k6.h0(V(i21), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i21), this.J0);
        org.telegram.ui.ActionBar.r6.t(imageView4, org.telegram.ui.ActionBar.k6.f28214v6, this.J0, mode);
        imageView4.setScaleType(scaleType);
        imageView4.setImageResource(2131231460);
        imageView4.setOnClickListener(new n00(this, 5));
        f20Var.addView(imageView3, b8.mf.e(48, 48, 85));
        f20Var.addView(imageView4, b8.mf.e(48, 48, 85));
        this.f28586b.addView(z10Var);
        x10Var.addView(w10Var, b8.mf.c(-1.0f, -1));
        x10Var.addView(v10Var, b8.mf.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f28586b.addView(x10Var, b8.mf.d(-1, -1.0f, 0, 14.0f, 14.0f, 14.0f, 14.0f));
        Q0(false);
        this.H1.f();
        if (f51714y5) {
            this.f51741g4.I(this.f51737f4, false);
        }
        this.A2 = this.H1.b();
        if (inputPeer != null) {
            TextView textView = new TextView(launchActivity);
            this.K1 = textView;
            textView.setGravity(17);
            textView.setTextColor(-8682615);
            textView.setTextSize(1, 14.0f);
            if (org.telegram.messenger.t3.T(this.R2) && (chat2 = this.R2) != null && !chat2.megagroup) {
                textView.setTag(1);
            }
            this.f28586b.addView(textView, b8.mf.d(-2, -2.0f, 81, 21.0f, 0.0f, 21.0f, 100.0f));
            org.telegram.ui.Components.cb0 cb0Var = new org.telegram.ui.Components.cb0(launchActivity);
            cb0Var.setTextColor(-1);
            cb0Var.setSelectorColor(-9598483);
            cb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
            cb0Var.setItemCount(5);
            h20 h20Var = new h20(launchActivity);
            h20Var.setItemCount(5);
            h20Var.setTextColor(-1);
            h20Var.setSelectorColor(-9598483);
            h20Var.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
            i20 i20Var = new i20(launchActivity);
            i20Var.setItemCount(5);
            i20Var.setTextColor(-1);
            i20Var.setSelectorColor(-9598483);
            i20Var.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
            j20 j20Var = new j20(launchActivity);
            this.L1 = j20Var;
            j20Var.setLines(1);
            j20Var.setSingleLine(true);
            j20Var.setEllipsize(TextUtils.TruncateAt.END);
            j20Var.setGravity(17);
            j20Var.setTextColor(-1);
            j20Var.setTypeface(org.telegram.messenger.g0.o());
            j20Var.setTextSize(1, 14.0f);
            this.f28586b.addView(j20Var, b8.mf.d(-1, 48.0f, 81, 21.0f, 0.0f, 21.0f, 20.5f));
            launchActivity2 = launchActivity;
            r13 = 0;
            j20Var.setOnClickListener(new org.telegram.messenger.video.f(this, cb0Var, h20Var, i20Var, chat, cVar, inputPeer2, 1));
            l20 l20Var = new l20(launchActivity2, cb0Var, h20Var, i20Var);
            this.J1 = l20Var;
            l20Var.setWeightSum(1.0f);
            l20Var.setOrientation(0);
            this.f28586b.addView(l20Var, b8.mf.d(-1, 270.0f, 51, 0.0f, 50.0f, 0.0f, 0.0f));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i23 = calendar.get(1);
            int i24 = calendar.get(6);
            l20Var.addView(cb0Var, b8.mf.l(0.5f, 0, 270));
            cb0Var.setMinValue(0);
            cb0Var.setMaxValue(365);
            cb0Var.setWrapSelectorWheel(false);
            cb0Var.setFormatter(new r00(currentTimeMillis, calendar, i23, 0));
            a1.d dVar = new a1.d(this, cb0Var, h20Var, i20Var, 13);
            x30Var = this;
            cb0Var.setOnValueChangedListener(dVar);
            h20Var.setMinValue(0);
            h20Var.setMaxValue(23);
            l20Var.addView(h20Var, b8.mf.l(0.2f, 0, 270));
            h20Var.setFormatter(new org.telegram.ui.Components.lf0(24));
            h20Var.setOnValueChangedListener(dVar);
            i20Var.setMinValue(0);
            i20Var.setMaxValue(59);
            i20Var.setValue(0);
            i20Var.setFormatter(new org.telegram.ui.Components.lf0(25));
            l20Var.addView(i20Var, b8.mf.l(0.3f, 0, 270));
            i20Var.setOnValueChangedListener(dVar);
            calendar.setTimeInMillis(currentTimeMillis + 10800000);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            int i25 = calendar.get(6);
            int i26 = calendar.get(12);
            int i27 = calendar.get(11);
            cb0Var.setValue(i24 != i25 ? 1 : 0);
            i20Var.setValue(i26);
            h20Var.setValue(i27);
            org.telegram.ui.Components.t4.g(j20Var, textView, 0L, 604800L, 2, cb0Var, h20Var, i20Var);
        } else {
            launchActivity2 = launchActivity;
            x30Var = this;
            r13 = 0;
        }
        m20 m20Var = new m20(x30Var, (ViewGroup) x30Var.getWindow().getDecorView(), x30Var.f28586b);
        x30Var.U3 = m20Var;
        m20Var.E = new n20(x30Var);
        w10Var.setPinchToZoomHelper(m20Var);
        x30Var.f51777p1.setOnClickListener(new View.OnClickListener(x30Var) {
            public final x30 f49318b;

            {
                this.f49318b = x30Var;
            }

            @Override
            public final void onClick(View view4) {
                switch (r13) {
                    case 0:
                        x30 x30Var2 = this.f49318b;
                        LaunchActivity launchActivity3 = x30Var2.f51716a2;
                        if (launchActivity3 != null && launchActivity3.checkSelfPermission("android.permission.CAMERA") != 0) {
                            x30Var2.f51716a2.requestPermissions(new String[]{"android.permission.CAMERA"}, 104);
                            return;
                        } else if (VoIPService.getSharedInstance() != null) {
                            boolean z11 = false;
                            if (VoIPService.getSharedInstance().getVideoState(false) != 2) {
                                x30Var2.f51720b2[0].d(1, false);
                                if (x30Var2.f51788r2 == null) {
                                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                                    if (sharedInstance2 != null) {
                                        sharedInstance2.createCaptureDevice(false);
                                    }
                                    if (VoIPService.getSharedInstance().getVideoState(true) != 2) {
                                        z11 = true;
                                    }
                                    o20 o20Var = new o20(x30Var2, launchActivity2, z11);
                                    x30Var2.f51788r2 = o20Var;
                                    o20Var.setBottomPadding(x30Var2.f28586b.getPaddingBottom());
                                    x30Var2.f28589c.addView(x30Var2.f51788r2);
                                    if (sharedInstance2 != null && !sharedInstance2.isFrontFaceCamera()) {
                                        sharedInstance2.switchCamera();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            VoIPService.getSharedInstance().setVideoState(false, 0);
                            x30Var2.Q1(true, false);
                            x30Var2.P1(false);
                            x30Var2.S2.z();
                            x30Var2.Q0(true);
                            x30Var2.m1.requestLayout();
                            return;
                        } else {
                            return;
                        }
                    default:
                        x30 x30Var3 = this.f49318b;
                        x30Var3.S3.e();
                        org.telegram.messenger.r3 r3Var22 = x30Var3.S2;
                        if (r3Var22 != null && !r3Var22.j()) {
                            x30Var3.L1();
                            x30.v1(launchActivity2, new p00(x30Var3, 5), false, false);
                            return;
                        }
                        x30Var3.dismiss();
                        return;
                }
            }
        });
        x30Var.O1(r13);
        x30Var.L1();
        x30Var.P1(r13);
        x30Var.Q1(r13, r13);
        x30Var.D1(0.0f);
        x30Var.R1();
        x30Var.f28586b.addView(new FrameLayout(launchActivity2), b8.mf.e(-1, 200, 87));
        x30Var.f51791s1.setOnClickListener(new n00(x30Var, 6));
        x30Var.V0();
        b8.pf.a(x30Var.f51777p1);
        b8.pf.a(x30Var.f51782q1);
        b8.pf.a(x30Var.f51768n1);
        b8.pf.a(x30Var.f51772o1);
        b8.pf.a(x30Var.f51796t1);
        b8.pf.a(x30Var.f51787r1);
        b8.pf.a(x30Var.f51791s1);
        r0.i0.l(x30Var.f28586b, new m00(x30Var, 2));
    }

    public static void H1(org.telegram.ui.ActionBar.y0 y0Var, int i3) {
        if (y0Var != null) {
            y0Var.d(i3, i3);
        }
    }

    public static void I0(final x30 x30Var, Activity activity, org.telegram.messenger.r3 r3Var, View view, int i3) {
        TLRPC.Chat chat;
        final Long l10;
        boolean z10;
        final org.telegram.messenger.q3 q3Var;
        org.telegram.messenger.c cVar = x30Var.f51759l1;
        ArrayList arrayList = x30Var.f51815x2;
        r30 r30Var = x30Var.H1;
        if (view instanceof org.telegram.ui.Components.voip.k) {
            x30Var.g1(((org.telegram.ui.Components.voip.k) view).getParticipant());
        } else if (view instanceof org.telegram.ui.Cells.f4) {
            x30Var.I1((org.telegram.ui.Cells.f4) view);
        } else {
            Collection collection = null;
            if (view instanceof org.telegram.ui.Cells.y3) {
                org.telegram.ui.Cells.y3 y3Var = (org.telegram.ui.Cells.y3) view;
                if (y3Var.getUser() != null) {
                    if (x30Var.q1()) {
                        int i10 = i3 - r30Var.f49016n;
                        if (i10 >= 0 && i10 < x30Var.S2.f25058m.size()) {
                            l10 = (Long) x30Var.S2.f25058m.get(i3 - r30Var.f49016n);
                        } else {
                            int i11 = i3 - r30Var.f49018s;
                            if (i11 >= 0 && i11 < x30Var.S2.f25057l.size()) {
                                l10 = (Long) x30Var.S2.f25057l.get(i3 - r30Var.f49018s);
                            } else {
                                int i12 = i3 - r30Var.f49015f;
                                if (x30Var.f51755k2) {
                                    if (i12 >= 0 && i12 < arrayList.size()) {
                                        l10 = (Long) arrayList.get(i12);
                                        z10 = false;
                                    }
                                    l10 = null;
                                    z10 = false;
                                } else {
                                    if (i12 >= 0 && i12 < x30Var.S2.f25055j.size()) {
                                        l10 = (Long) x30Var.S2.f25055j.get(i12);
                                        z10 = false;
                                    }
                                    l10 = null;
                                    z10 = false;
                                }
                                if (!z10 && (q3Var = (org.telegram.messenger.q3) x30Var.S2.f25056k.get(l10)) != null) {
                                    org.telegram.ui.Components.f60 F = org.telegram.ui.Components.f60.F(x30Var.f28589c, x30Var.J0, y3Var);
                                    F.l(2131232129, org.telegram.messenger.bd.M0(2131749468, null), new Runnable(x30Var) {
                                        public final x30 f50358b;

                                        {
                                            this.f50358b = x30Var;
                                        }

                                        @Override
                                        public final void run() {
                                            switch (r4) {
                                                case 0:
                                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                                                    org.telegram.messenger.q3 q3Var2 = q3Var;
                                                    declineconferencecallinvite.msg_id = q3Var2.f24848a;
                                                    final x30 x30Var2 = this.f50358b;
                                                    ConnectionsManager.getInstance(x30Var2.f28583a).sendRequest(declineconferencecallinvite, new RequestDelegate() {
                                                        @Override
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            switch (r2) {
                                                                case 0:
                                                                    boolean z11 = tLObject instanceof TLRPC.Updates;
                                                                    x30 x30Var3 = x30Var2;
                                                                    if (z11) {
                                                                        org.telegram.messenger.hp.s1(x30Var3.f28583a).O3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        x30Var3.getClass();
                                                                        return;
                                                                    }
                                                                default:
                                                                    boolean z12 = tLObject instanceof TLRPC.Updates;
                                                                    x30 x30Var4 = x30Var2;
                                                                    if (z12) {
                                                                        org.telegram.messenger.hp.s1(x30Var4.f28583a).O3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        x30Var4.getClass();
                                                                        return;
                                                                    }
                                                            }
                                                        }
                                                    });
                                                    org.telegram.messenger.r3 r3Var2 = x30Var2.S2;
                                                    if (r3Var2 != null) {
                                                        q3Var2.f24849b = false;
                                                        r3Var2.f25056k.put(l10, q3Var2);
                                                        x30Var2.Q0(true);
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                                                    org.telegram.messenger.q3 q3Var3 = q3Var;
                                                    declineconferencecallinvite2.msg_id = q3Var3.f24848a;
                                                    final x30 x30Var3 = this.f50358b;
                                                    ConnectionsManager.getInstance(x30Var3.f28583a).sendRequest(declineconferencecallinvite2, new RequestDelegate() {
                                                        @Override
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            switch (r2) {
                                                                case 0:
                                                                    boolean z11 = tLObject instanceof TLRPC.Updates;
                                                                    x30 x30Var32 = x30Var3;
                                                                    if (z11) {
                                                                        org.telegram.messenger.hp.s1(x30Var32.f28583a).O3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        x30Var32.getClass();
                                                                        return;
                                                                    }
                                                                default:
                                                                    boolean z12 = tLObject instanceof TLRPC.Updates;
                                                                    x30 x30Var4 = x30Var3;
                                                                    if (z12) {
                                                                        org.telegram.messenger.hp.s1(x30Var4.f28583a).O3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        x30Var4.getClass();
                                                                        return;
                                                                    }
                                                            }
                                                        }
                                                    });
                                                    ArrayList arrayList2 = new ArrayList();
                                                    arrayList2.add(Integer.valueOf(q3Var3.f24848a));
                                                    org.telegram.messenger.hp.s1(x30Var3.f28583a).Z(arrayList2, null, null, 0L, 0, true, 0);
                                                    org.telegram.messenger.r3 r3Var3 = x30Var3.S2;
                                                    if (r3Var3 != null) {
                                                        ArrayList arrayList3 = r3Var3.f25055j;
                                                        Long l11 = l10;
                                                        arrayList3.remove(l11);
                                                        x30Var3.S2.f25059n.remove(l11);
                                                        x30Var3.S2.f25056k.remove(l11);
                                                        x30Var3.Q0(true);
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    }, q3Var.a());
                                    F.c(2131232328, org.telegram.messenger.bd.M0(2131749479, null), new Runnable(x30Var) {
                                        public final x30 f50358b;

                                        {
                                            this.f50358b = x30Var;
                                        }

                                        @Override
                                        public final void run() {
                                            switch (r4) {
                                                case 0:
                                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                                                    org.telegram.messenger.q3 q3Var2 = q3Var;
                                                    declineconferencecallinvite.msg_id = q3Var2.f24848a;
                                                    final x30 x30Var2 = this.f50358b;
                                                    ConnectionsManager.getInstance(x30Var2.f28583a).sendRequest(declineconferencecallinvite, new RequestDelegate() {
                                                        @Override
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            switch (r2) {
                                                                case 0:
                                                                    boolean z11 = tLObject instanceof TLRPC.Updates;
                                                                    x30 x30Var32 = x30Var2;
                                                                    if (z11) {
                                                                        org.telegram.messenger.hp.s1(x30Var32.f28583a).O3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        x30Var32.getClass();
                                                                        return;
                                                                    }
                                                                default:
                                                                    boolean z12 = tLObject instanceof TLRPC.Updates;
                                                                    x30 x30Var4 = x30Var2;
                                                                    if (z12) {
                                                                        org.telegram.messenger.hp.s1(x30Var4.f28583a).O3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        x30Var4.getClass();
                                                                        return;
                                                                    }
                                                            }
                                                        }
                                                    });
                                                    org.telegram.messenger.r3 r3Var2 = x30Var2.S2;
                                                    if (r3Var2 != null) {
                                                        q3Var2.f24849b = false;
                                                        r3Var2.f25056k.put(l10, q3Var2);
                                                        x30Var2.Q0(true);
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                                                    org.telegram.messenger.q3 q3Var3 = q3Var;
                                                    declineconferencecallinvite2.msg_id = q3Var3.f24848a;
                                                    final x30 x30Var3 = this.f50358b;
                                                    ConnectionsManager.getInstance(x30Var3.f28583a).sendRequest(declineconferencecallinvite2, new RequestDelegate() {
                                                        @Override
                                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                            switch (r2) {
                                                                case 0:
                                                                    boolean z11 = tLObject instanceof TLRPC.Updates;
                                                                    x30 x30Var32 = x30Var3;
                                                                    if (z11) {
                                                                        org.telegram.messenger.hp.s1(x30Var32.f28583a).O3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        x30Var32.getClass();
                                                                        return;
                                                                    }
                                                                default:
                                                                    boolean z12 = tLObject instanceof TLRPC.Updates;
                                                                    x30 x30Var4 = x30Var3;
                                                                    if (z12) {
                                                                        org.telegram.messenger.hp.s1(x30Var4.f28583a).O3((TLRPC.Updates) tLObject, false);
                                                                        return;
                                                                    } else {
                                                                        x30Var4.getClass();
                                                                        return;
                                                                    }
                                                            }
                                                        }
                                                    });
                                                    ArrayList arrayList2 = new ArrayList();
                                                    arrayList2.add(Integer.valueOf(q3Var3.f24848a));
                                                    org.telegram.messenger.hp.s1(x30Var3.f28583a).Z(arrayList2, null, null, 0L, 0, true, 0);
                                                    org.telegram.messenger.r3 r3Var3 = x30Var3.S2;
                                                    if (r3Var3 != null) {
                                                        ArrayList arrayList3 = r3Var3.f25055j;
                                                        Long l11 = l10;
                                                        arrayList3.remove(l11);
                                                        x30Var3.S2.f25059n.remove(l11);
                                                        x30Var3.S2.f25056k.remove(l11);
                                                        x30Var3.Q0(true);
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    }, false);
                                    F.W(org.telegram.ui.ActionBar.k6.e0(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), x30Var.f51802u2.getColor()));
                                    F.f33747s = 96;
                                    F.Z();
                                    return;
                                }
                                return;
                            }
                        }
                        z10 = true;
                        if (!z10) {
                            org.telegram.ui.Components.f60 F2 = org.telegram.ui.Components.f60.F(x30Var.f28589c, x30Var.J0, y3Var);
                            F2.l(2131232129, org.telegram.messenger.bd.M0(2131749468, null), new Runnable(x30Var) {
                                public final x30 f50358b;

                                {
                                    this.f50358b = x30Var;
                                }

                                @Override
                                public final void run() {
                                    switch (r4) {
                                        case 0:
                                            TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                                            org.telegram.messenger.q3 q3Var2 = q3Var;
                                            declineconferencecallinvite.msg_id = q3Var2.f24848a;
                                            final x30 x30Var2 = this.f50358b;
                                            ConnectionsManager.getInstance(x30Var2.f28583a).sendRequest(declineconferencecallinvite, new RequestDelegate() {
                                                @Override
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (r2) {
                                                        case 0:
                                                            boolean z11 = tLObject instanceof TLRPC.Updates;
                                                            x30 x30Var32 = x30Var2;
                                                            if (z11) {
                                                                org.telegram.messenger.hp.s1(x30Var32.f28583a).O3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                x30Var32.getClass();
                                                                return;
                                                            }
                                                        default:
                                                            boolean z12 = tLObject instanceof TLRPC.Updates;
                                                            x30 x30Var4 = x30Var2;
                                                            if (z12) {
                                                                org.telegram.messenger.hp.s1(x30Var4.f28583a).O3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                x30Var4.getClass();
                                                                return;
                                                            }
                                                    }
                                                }
                                            });
                                            org.telegram.messenger.r3 r3Var2 = x30Var2.S2;
                                            if (r3Var2 != null) {
                                                q3Var2.f24849b = false;
                                                r3Var2.f25056k.put(l10, q3Var2);
                                                x30Var2.Q0(true);
                                                return;
                                            }
                                            return;
                                        default:
                                            TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                                            org.telegram.messenger.q3 q3Var3 = q3Var;
                                            declineconferencecallinvite2.msg_id = q3Var3.f24848a;
                                            final x30 x30Var3 = this.f50358b;
                                            ConnectionsManager.getInstance(x30Var3.f28583a).sendRequest(declineconferencecallinvite2, new RequestDelegate() {
                                                @Override
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (r2) {
                                                        case 0:
                                                            boolean z11 = tLObject instanceof TLRPC.Updates;
                                                            x30 x30Var32 = x30Var3;
                                                            if (z11) {
                                                                org.telegram.messenger.hp.s1(x30Var32.f28583a).O3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                x30Var32.getClass();
                                                                return;
                                                            }
                                                        default:
                                                            boolean z12 = tLObject instanceof TLRPC.Updates;
                                                            x30 x30Var4 = x30Var3;
                                                            if (z12) {
                                                                org.telegram.messenger.hp.s1(x30Var4.f28583a).O3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                x30Var4.getClass();
                                                                return;
                                                            }
                                                    }
                                                }
                                            });
                                            ArrayList arrayList2 = new ArrayList();
                                            arrayList2.add(Integer.valueOf(q3Var3.f24848a));
                                            org.telegram.messenger.hp.s1(x30Var3.f28583a).Z(arrayList2, null, null, 0L, 0, true, 0);
                                            org.telegram.messenger.r3 r3Var3 = x30Var3.S2;
                                            if (r3Var3 != null) {
                                                ArrayList arrayList3 = r3Var3.f25055j;
                                                Long l11 = l10;
                                                arrayList3.remove(l11);
                                                x30Var3.S2.f25059n.remove(l11);
                                                x30Var3.S2.f25056k.remove(l11);
                                                x30Var3.Q0(true);
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, q3Var.a());
                            F2.c(2131232328, org.telegram.messenger.bd.M0(2131749479, null), new Runnable(x30Var) {
                                public final x30 f50358b;

                                {
                                    this.f50358b = x30Var;
                                }

                                @Override
                                public final void run() {
                                    switch (r4) {
                                        case 0:
                                            TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
                                            org.telegram.messenger.q3 q3Var2 = q3Var;
                                            declineconferencecallinvite.msg_id = q3Var2.f24848a;
                                            final x30 x30Var2 = this.f50358b;
                                            ConnectionsManager.getInstance(x30Var2.f28583a).sendRequest(declineconferencecallinvite, new RequestDelegate() {
                                                @Override
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (r2) {
                                                        case 0:
                                                            boolean z11 = tLObject instanceof TLRPC.Updates;
                                                            x30 x30Var32 = x30Var2;
                                                            if (z11) {
                                                                org.telegram.messenger.hp.s1(x30Var32.f28583a).O3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                x30Var32.getClass();
                                                                return;
                                                            }
                                                        default:
                                                            boolean z12 = tLObject instanceof TLRPC.Updates;
                                                            x30 x30Var4 = x30Var2;
                                                            if (z12) {
                                                                org.telegram.messenger.hp.s1(x30Var4.f28583a).O3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                x30Var4.getClass();
                                                                return;
                                                            }
                                                    }
                                                }
                                            });
                                            org.telegram.messenger.r3 r3Var2 = x30Var2.S2;
                                            if (r3Var2 != null) {
                                                q3Var2.f24849b = false;
                                                r3Var2.f25056k.put(l10, q3Var2);
                                                x30Var2.Q0(true);
                                                return;
                                            }
                                            return;
                                        default:
                                            TL_phone.declineConferenceCallInvite declineconferencecallinvite2 = new TL_phone.declineConferenceCallInvite();
                                            org.telegram.messenger.q3 q3Var3 = q3Var;
                                            declineconferencecallinvite2.msg_id = q3Var3.f24848a;
                                            final x30 x30Var3 = this.f50358b;
                                            ConnectionsManager.getInstance(x30Var3.f28583a).sendRequest(declineconferencecallinvite2, new RequestDelegate() {
                                                @Override
                                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                                    switch (r2) {
                                                        case 0:
                                                            boolean z11 = tLObject instanceof TLRPC.Updates;
                                                            x30 x30Var32 = x30Var3;
                                                            if (z11) {
                                                                org.telegram.messenger.hp.s1(x30Var32.f28583a).O3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                x30Var32.getClass();
                                                                return;
                                                            }
                                                        default:
                                                            boolean z12 = tLObject instanceof TLRPC.Updates;
                                                            x30 x30Var4 = x30Var3;
                                                            if (z12) {
                                                                org.telegram.messenger.hp.s1(x30Var4.f28583a).O3((TLRPC.Updates) tLObject, false);
                                                                return;
                                                            } else {
                                                                x30Var4.getClass();
                                                                return;
                                                            }
                                                    }
                                                }
                                            });
                                            ArrayList arrayList2 = new ArrayList();
                                            arrayList2.add(Integer.valueOf(q3Var3.f24848a));
                                            org.telegram.messenger.hp.s1(x30Var3.f28583a).Z(arrayList2, null, null, 0L, 0, true, 0);
                                            org.telegram.messenger.r3 r3Var3 = x30Var3.S2;
                                            if (r3Var3 != null) {
                                                ArrayList arrayList3 = r3Var3.f25055j;
                                                Long l11 = l10;
                                                arrayList3.remove(l11);
                                                x30Var3.S2.f25059n.remove(l11);
                                                x30Var3.S2.f25056k.remove(l11);
                                                x30Var3.Q0(true);
                                                return;
                                            }
                                            return;
                                    }
                                }
                            }, false);
                            F2.W(org.telegram.ui.ActionBar.k6.e0(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), x30Var.f51802u2.getColor()));
                            F2.f33747s = 96;
                            F2.Z();
                            return;
                        }
                        return;
                    }
                    x30Var.f51716a2.O0(x30Var.f28583a);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", y3Var.getUser().f27150id);
                    if (y3Var.f30981a.getImageReceiver().L()) {
                        bundle.putBoolean("expandPhoto", true);
                    }
                    x30Var.f51716a2.t0(new ProfileActivity(bundle, null));
                    x30Var.dismiss();
                }
            } else if (i3 == r30Var.f49020x) {
                if (org.telegram.messenger.t3.T(x30Var.R2) && (chat = x30Var.R2) != null && !chat.megagroup && org.telegram.messenger.t3.t0(chat)) {
                    x30Var.l1(false);
                    return;
                }
                TLRPC.ChatFull N0 = org.telegram.messenger.hp.s1(cVar.f21919a).N0(x30Var.k1());
                if (N0 != null) {
                    x30Var.f51773o2 = false;
                    Context context = x30Var.getContext();
                    int i13 = cVar.f21919a;
                    TLRPC.Chat chat2 = x30Var.R2;
                    org.telegram.messenger.r3 r3Var2 = x30Var.S2;
                    org.telegram.ui.Components.d20 d20Var = new org.telegram.ui.Components.d20(context, i13, chat2, N0, r3Var2.d, r3Var2.f25059n);
                    x30Var.f51812w3 = d20Var;
                    d20Var.setOnDismissListener(new t00(x30Var, 2));
                    org.telegram.ui.Components.d20 d20Var2 = x30Var.f51812w3;
                    d20Var2.Y1 = new d10(x30Var);
                    d20Var2.show();
                }
            } else if (i3 == r30Var.f49021y) {
                org.telegram.messenger.r3 r3Var3 = x30Var.S2;
                if (r3Var3 != null && r3Var3.f25049b != null) {
                    xg.e1 e1Var = new xg.e1(activity, x30Var.f28583a, null, 4, new ei.k0());
                    org.telegram.messenger.r3 r3Var4 = x30Var.S2;
                    if (r3Var4 != null) {
                        collection = (Collection) Collection.EL.stream(r3Var4.f25051e).map(new fa.b(11)).collect(Collectors.toSet());
                    }
                    e1Var.f58693v2.addAll(collection);
                    e1Var.o1(false, true);
                    e1Var.f58691t2 = new p00(x30Var, 3);
                    e1Var.o1(false, true);
                    e1Var.f58694w2 = new ai.q4(18, x30Var, r3Var);
                    e1Var.show();
                }
            } else if (i3 == r30Var.E) {
                x30Var.x1();
            }
        }
    }

    public static void J0(x30 x30Var, org.telegram.ui.Components.voip.k kVar, boolean z10) {
        if (!x30Var.J) {
            if (z10 && kVar.getRenderer() == null) {
                kVar.setRenderer(org.telegram.ui.Components.voip.r.c(x30Var.Q3, x30Var.S3, kVar, null, null, kVar.getParticipant(), x30Var.S2, x30Var));
            } else if (!z10 && kVar.getRenderer() != null) {
                kVar.getRenderer().setPrimaryView(null);
                kVar.setRenderer(null);
            }
        }
    }

    public static void K0(x30 x30Var, int i3, int[] iArr) {
        if (x30Var.t1()) {
            int i10 = org.telegram.ui.ActionBar.k6.f28282yh;
            iArr[0] = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
            iArr[1] = org.telegram.messenger.g0.S0(x30Var.M3, 1.0f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28301zh, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28072nh, false));
            iArr[2] = org.telegram.messenger.g0.S0(x30Var.M3, 1.0f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Yg, false), org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        } else if (i3 == 0) {
            iArr[0] = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28264xh, false);
            iArr[1] = org.telegram.messenger.g0.S0(x30Var.M3, 1.0f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28054mh, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28072nh, false));
            iArr[2] = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28036lh, false);
        } else if (i3 == 1) {
            iArr[0] = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28206uh, false);
            iArr[1] = org.telegram.messenger.g0.S0(x30Var.M3, 1.0f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28112ph, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28132qh, false));
            iArr[2] = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28092oh, false);
        } else if (r1(i3)) {
            iArr[0] = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Yh, false);
            iArr[1] = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Zh, false);
            iArr[2] = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27834ai, false);
        } else {
            int i11 = org.telegram.ui.ActionBar.k6.f28282yh;
            iArr[0] = org.telegram.ui.ActionBar.k6.x0(null, i11, false);
            iArr[1] = org.telegram.messenger.g0.S0(x30Var.M3, 1.0f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ah, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Bh, false));
            iArr[2] = org.telegram.messenger.g0.S0(x30Var.M3, 1.0f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Yg, false), org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        }
        if (r1(i3)) {
            iArr[3] = i0.a.f(0.5f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Wh, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Yh, false));
        } else if (i3 == 1) {
            iArr[3] = i0.a.f(0.75f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28112ph, false), i0.a.f(0.5f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28187th, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28225vh, false)));
        } else {
            iArr[3] = i0.a.f(0.5f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28264xh, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28245wh, false));
        }
    }

    public static String L0() {
        String[] strArr = org.telegram.messenger.j6.f23646i[(int) Math.floor(Math.random() * 8)];
        return strArr[(int) Math.floor(Math.random() * strArr.length)];
    }

    public static void M0(x30 x30Var) {
        org.telegram.messenger.r3 r3Var = x30Var.S2;
        if (r3Var != null && r3Var.f25049b != null) {
            TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
            org.telegram.messenger.r3 r3Var2 = x30Var.S2;
            togglegroupcallsettings.call = r3Var2.g(r3Var2.f25048a);
            togglegroupcallsettings.join_muted = Boolean.valueOf(x30Var.S2.f25049b.join_muted);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(x30Var.f51759l1.f21919a);
            org.telegram.messenger.p5 p5Var = Utilities.d;
            Objects.requireNonNull(p5Var);
            connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.v3(p5Var), new y00(x30Var, 1));
        }
    }

    public static void N0(x30 x30Var, boolean z10) {
        if (x30Var.S2 == null) {
            return;
        }
        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
        org.telegram.messenger.r3 r3Var = x30Var.S2;
        togglegroupcallsettings.call = r3Var.g(r3Var.f25048a);
        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
        x30Var.f51781p5 = Boolean.valueOf(z10);
        x30Var.K1(true);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(x30Var.f51759l1.f21919a);
        org.telegram.messenger.p5 p5Var = Utilities.d;
        Objects.requireNonNull(p5Var);
        connectionsManager.sendRequestTyped(togglegroupcallsettings, new org.telegram.messenger.v3(p5Var), new y00(x30Var, 0));
    }

    public static org.telegram.ui.Components.voip.k O0(x30 x30Var) {
        f30 f30Var = x30Var.I1;
        for (int i3 = 0; i3 < f30Var.getChildCount(); i3++) {
            View childAt = f30Var.getChildAt(i3);
            if (childAt.isAttachedToWindow() && (childAt instanceof org.telegram.ui.Components.voip.k) && RecyclerView.R(childAt) >= 0) {
                return (org.telegram.ui.Components.voip.k) childAt;
            }
        }
        return null;
    }

    public static void P0(x30 x30Var) {
        boolean z10;
        Integer num;
        boolean z11;
        float f10;
        float f11;
        float L;
        float L2;
        float L3;
        float f12;
        float f13;
        float f14;
        boolean z12;
        View childAt;
        u20 u20Var = x30Var.G1;
        f30 f30Var = x30Var.I1;
        int childCount = f30Var.getChildCount();
        float f15 = 2.1474836E9f;
        for (int i3 = 0; i3 < childCount; i3++) {
            if (RecyclerView.R(f30Var.getChildAt(i3)) >= 0) {
                f15 = Math.min(f15, childAt.getTop());
            }
        }
        if (f15 < 0.0f || f15 == 2.1474836E9f) {
            if (childCount != 0) {
                f15 = 0.0f;
            } else {
                f15 = f30Var.getPaddingTop();
            }
        }
        if (f15 <= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - org.telegram.messenger.g0.L(14.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        float L4 = f15 + org.telegram.messenger.g0.L(14.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        if ((z10 && u20Var.getTag() == null) || (!z10 && u20Var.getTag() != null)) {
            if (z10) {
                num = 1;
            } else {
                num = null;
            }
            u20Var.setTag(num);
            AnimatorSet animatorSet = x30Var.Z1;
            if (animatorSet != null) {
                animatorSet.cancel();
                x30Var.Z1 = null;
            }
            if (u20Var.getTag() == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            x30Var.G0(z11);
            ViewPropertyAnimator animate = u20Var.getBackButton().animate();
            float f16 = 0.9f;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.9f;
            }
            ViewPropertyAnimator scaleX = animate.scaleX(f10);
            if (z10) {
                f16 = 1.0f;
            }
            ViewPropertyAnimator scaleY = scaleX.scaleY(f16);
            if (z10) {
                f11 = 0.0f;
            } else {
                f11 = -org.telegram.messenger.g0.L(14.0f);
            }
            ViewPropertyAnimator duration = scaleY.translationX(f11).setDuration(300L);
            org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f40452f;
            duration.setInterpolator(xqVar).start();
            ViewPropertyAnimator animate2 = u20Var.getTitleTextView().animate();
            if (z10) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(23.0f);
            }
            animate2.translationY(L).setDuration(300L).setInterpolator(xqVar).start();
            ObjectAnimator objectAnimator = x30Var.M4;
            if (objectAnimator != null) {
                objectAnimator.removeAllListeners();
                x30Var.M4.cancel();
            }
            org.telegram.ui.ActionBar.k5 subtitleTextView = u20Var.getSubtitleTextView();
            Property property = View.TRANSLATION_Y;
            float translationY = u20Var.getSubtitleTextView().getTranslationY();
            if (z10) {
                L2 = 0.0f;
            } else {
                L2 = org.telegram.messenger.g0.L(20.0f);
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(subtitleTextView, property, translationY, L2);
            x30Var.M4 = ofFloat;
            ofFloat.setDuration(300L);
            x30Var.M4.setInterpolator(xqVar);
            x30Var.M4.addListener(new org.telegram.ui.Components.s9(29, x30Var, z10));
            x30Var.M4.start();
            ObjectAnimator objectAnimator2 = x30Var.N4;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            org.telegram.ui.ActionBar.k5 additionalSubtitleTextView = u20Var.getAdditionalSubtitleTextView();
            if (z10) {
                L3 = 0.0f;
            } else {
                L3 = org.telegram.messenger.g0.L(20.0f);
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(additionalSubtitleTextView, property, L3);
            x30Var.N4 = ofFloat2;
            ofFloat2.setDuration(300L);
            x30Var.N4.setInterpolator(xqVar);
            x30Var.N4.start();
            AnimatorSet animatorSet2 = new AnimatorSet();
            x30Var.Z1 = animatorSet2;
            animatorSet2.setDuration(140L);
            AnimatorSet animatorSet3 = x30Var.Z1;
            Property property2 = View.ALPHA;
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(u20Var, property2, f12);
            n10 n10Var = x30Var.F1;
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(n10Var, property2, f13);
            View view = x30Var.Y1;
            if (z10) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(view, property2, f14));
            x30Var.Z1.addListener(new s20(x30Var, 1));
            x30Var.Z1.start();
            ImageView imageView = x30Var.S3.f39697w;
            if (z10 && !f51713x5) {
                z12 = false;
            } else {
                z12 = true;
            }
            imageView.setClickable(z12);
        }
        if (x30Var.f51783q2 != L4) {
            x30Var.G1(L4);
        }
    }

    public static void e1(LaunchActivity launchActivity, org.telegram.messenger.c cVar, TLRPC.Chat chat, TLRPC.InputPeer inputPeer, boolean z10, String str) {
        if (f51711v5 == null) {
            if (inputPeer != null || VoIPService.getSharedInstance() != null) {
                if (inputPeer != null) {
                    f51711v5 = new x30(launchActivity, cVar, org.telegram.messenger.hp.s1(cVar.f21919a).g1(chat.f27001id, false, null), chat, inputPeer, z10, str);
                } else {
                    org.telegram.messenger.r3 r3Var = VoIPService.getSharedInstance().groupCall;
                    if (r3Var != null) {
                        TLRPC.Chat M0 = org.telegram.messenger.hp.s1(cVar.f21919a).M0(Long.valueOf(r3Var.f25050c));
                        r3Var.b(true);
                        f51711v5 = new x30(launchActivity, cVar, r3Var, M0, null, z10, str);
                    } else {
                        return;
                    }
                }
                f51711v5.f51716a2 = launchActivity;
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.go(16));
            }
        }
    }

    public static String h1(int i3) {
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    return null;
                }
                if (sharedInstance != null && (str = sharedInstance.currentBluetoothDeviceName) != null) {
                    return str;
                }
                return org.telegram.messenger.bd.M0(2131743513, null);
            } else if (sharedInstance != null && sharedInstance.isHeadsetPlugged()) {
                return org.telegram.messenger.bd.M0(2131743511, null);
            } else {
                return org.telegram.messenger.bd.M0(2131743510, null);
            }
        }
        return org.telegram.messenger.bd.M0(2131743509, null);
    }

    public static String i1(int i3) {
        String str;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (i3 == 2) {
            if (sharedInstance != null && (str = sharedInstance.currentBluetoothDeviceName) != null) {
                return org.telegram.messenger.bd.a0(null, null, 2131743507, str);
            }
            return org.telegram.messenger.bd.M0(2131743508, null);
        } else if (i3 == 1) {
            if (sharedInstance != null && sharedInstance.isHeadsetPlugged()) {
                return org.telegram.messenger.bd.M0(2131743506, null);
            }
            return org.telegram.messenger.bd.M0(2131743505, null);
        } else {
            return org.telegram.messenger.bd.M0(2131743504, null);
        }
    }

    public static boolean r1(int i3) {
        if ((VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().groupCall == null || !VoIPService.getSharedInstance().groupCall.f25049b.rtmp_stream) && i3 != 2 && i3 != 4 && i3 != 5 && i3 != 6 && i3 != 7) {
            return false;
        }
        return true;
    }

    public static void v1(Context context, Runnable runnable, boolean z10, boolean z11) {
        int L;
        int L2;
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            TLRPC.Chat chat = sharedInstance.getChat();
            org.telegram.messenger.r3 r3Var = sharedInstance.groupCall;
            long selfId = sharedInstance.getSelfId();
            if (!z11 && org.telegram.messenger.t3.w(14, chat)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                boolean isConference = sharedInstance.isConference();
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                if (isConference) {
                    s1Var.S = org.telegram.messenger.bd.M0(2131743478, null);
                    s1Var.U = org.telegram.messenger.bd.M0(2131743479, null);
                } else if (org.telegram.messenger.t3.W(chat)) {
                    s1Var.S = org.telegram.messenger.bd.M0(2131743481, null);
                    s1Var.U = org.telegram.messenger.bd.M0(2131743482, null);
                } else {
                    s1Var.S = org.telegram.messenger.bd.M0(2131743371, null);
                    s1Var.U = org.telegram.messenger.bd.M0(2131743372, null);
                }
                sharedInstance.getAccount();
                org.telegram.ui.Cells.c2[] c2VarArr = new org.telegram.ui.Cells.c2[1];
                LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
                if (!sharedInstance.isConference() || (r3Var != null && (groupCall = r3Var.f25049b) != null && groupCall.creator)) {
                    org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(context, 1);
                    c2VarArr[0] = c2Var;
                    c2Var.setBackground(org.telegram.ui.ActionBar.k6.N0(false));
                    if (z10) {
                        c2VarArr[0].setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27988j5, false));
                    } else {
                        c2VarArr[0].setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Vg, false));
                        CheckBoxSquare checkBoxSquare = (CheckBoxSquare) c2VarArr[0].getCheckBoxView();
                        int i3 = org.telegram.ui.ActionBar.k6.f27928fh;
                        int i10 = org.telegram.ui.ActionBar.k6.f27889dh;
                        int i11 = org.telegram.ui.ActionBar.k6.f27853bh;
                        checkBoxSquare.f31350s = i3;
                        checkBoxSquare.f31351w = i10;
                        checkBoxSquare.f31352x = i11;
                        checkBoxSquare.invalidate();
                    }
                    c2VarArr[0].setTag(0);
                    if (sharedInstance.isConference()) {
                        c2VarArr[0].e(org.telegram.messenger.bd.M0(2131743480, null), "", false, false, false);
                    } else if (org.telegram.messenger.t3.W(chat)) {
                        c2VarArr[0].e(org.telegram.messenger.bd.M0(2131743483, null), "", false, false, false);
                    } else {
                        c2VarArr[0].e(org.telegram.messenger.bd.M0(2131743373, null), "", false, false, false);
                    }
                    org.telegram.ui.Cells.c2 c2Var2 = c2VarArr[0];
                    if (org.telegram.messenger.bd.f21784a0) {
                        L = org.telegram.messenger.g0.L(16.0f);
                    } else {
                        L = org.telegram.messenger.g0.L(8.0f);
                    }
                    if (org.telegram.messenger.bd.f21784a0) {
                        L2 = org.telegram.messenger.g0.L(8.0f);
                    } else {
                        L2 = org.telegram.messenger.g0.L(16.0f);
                    }
                    c2Var2.setPadding(L, 0, L2, 0);
                    f10.addView(c2VarArr[0], b8.mf.o(-1, -2));
                    c2VarArr[0].setOnClickListener(new q00(c2VarArr, 0));
                }
                alertDialog$Builder.o(f10);
                s1Var.J = org.telegram.ui.ActionBar.k6.f27889dh;
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131743374, null), new cg.d0(r3Var, c2VarArr, selfId, runnable, 4));
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                if (z10) {
                    s1Var.S0 = false;
                }
                if (z10) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        s1Var.getWindow().setType(2038);
                    } else {
                        s1Var.getWindow().setType(2003);
                    }
                    s1Var.getWindow().clearFlags(2);
                }
                if (!z10) {
                    s1Var.j(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27980ih, false));
                }
                s1Var.show();
                if (!z10) {
                    TextView textView = (TextView) s1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27999jh, null);
                    }
                    s1Var.p(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Vg, false));
                    return;
                }
                return;
            }
            y1(r3Var, false, selfId, runnable);
        }
    }

    public static void y1(org.telegram.messenger.r3 r3Var, boolean z10, long j10, Runnable runnable) {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(z10 ? 1 : 0);
        }
        if (r3Var != null) {
            ArrayList arrayList = r3Var.f25052f;
            ArrayList arrayList2 = r3Var.f25051e;
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) r3Var.d.f(j10);
            if (groupCallParticipant != null) {
                r3Var.d.e(j10);
                arrayList2.remove(groupCallParticipant);
                r3Var.f25053g.remove(groupCallParticipant);
                int i3 = 0;
                while (i3 < arrayList.size()) {
                    if (org.telegram.messenger.zi.C1(((org.telegram.messenger.s3) arrayList.get(i3)).f25270a.peer) == org.telegram.messenger.zi.C1(groupCallParticipant.peer)) {
                        arrayList.remove(i3);
                        i3--;
                    }
                    i3++;
                }
                TLRPC.GroupCall groupCall = r3Var.f25049b;
                groupCall.participants_count--;
            }
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) arrayList2.get(i10);
                groupCallParticipant2.lastActiveDate = groupCallParticipant2.lastSpeakTime;
            }
        }
        if (runnable != null) {
            runnable.run();
        }
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.f23321v2, new Object[0]);
    }

    public final void A1(boolean r18, org.telegram.ui.Cells.f4 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.x30.A1(boolean, org.telegram.ui.Cells.f4):void");
    }

    public final void B1() {
        o4 o4Var = this.f51794s4;
        org.telegram.messenger.g0.r(o4Var);
        if (this.f51790r4 && this.M2 != null && VoIPService.getSharedInstance() != null && t1() && this.I1 != null && org.telegram.messenger.lc.e(512)) {
            org.telegram.messenger.g0.i3(o4Var, 30L);
        }
    }

    public final void C1(TLRPC.TL_textWithEntities tL_textWithEntities) {
        TLRPC.InputGroupCall g7;
        long j10;
        this.f51822z1.setText("");
        org.telegram.messenger.r3 r3Var = this.S2;
        if (r3Var != null && r3Var.f25049b != null && (g7 = r3Var.g(r3Var.f25048a)) != null) {
            org.telegram.messenger.r3 r3Var2 = this.S2;
            long j11 = r3Var2.f25049b.f27011id;
            TLRPC.Peer peer = r3Var2.J;
            if (peer != null) {
                j10 = org.telegram.messenger.m5.o(peer);
            } else {
                j10 = org.telegram.messenger.h10.i(this.f28583a).f22848n;
            }
            GroupCallMessagesController.getInstance(this.f28583a).sendCallMessage(j10, tL_textWithEntities, j11, g7);
        }
    }

    public final void D1(float f10) {
        float f11;
        int i3;
        int i10;
        this.M3 = f10;
        u10 u10Var = this.S3;
        if (u10Var == null) {
            f11 = 0.0f;
        } else {
            f11 = u10Var.f39672c;
        }
        float max = Math.max(f10, f11);
        int i11 = org.telegram.ui.ActionBar.k6.Xg;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i11, false);
        int i12 = org.telegram.ui.ActionBar.k6.Ug;
        int S0 = org.telegram.messenger.g0.S0(f10, 1.0f, x02, org.telegram.ui.ActionBar.k6.x0(null, i12, false));
        this.N3 = S0;
        this.F1.setBackgroundColor(S0);
        this.f51724c3.H(-14472653);
        this.X1.setColorFilter(new PorterDuffColorFilter(this.N3, PorterDuff.Mode.MULTIPLY));
        this.H0 = org.telegram.messenger.g0.S0(max, 1.0f, org.telegram.ui.ActionBar.k6.x0(null, i11, false), org.telegram.ui.ActionBar.k6.x0(null, i12, false));
        int S02 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Yg, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27964hh, false));
        g.b bVar = this.f51743h2;
        if (bVar != null) {
            bVar.f11648b = S02;
            org.telegram.ui.Components.voip.r0 r0Var = (org.telegram.ui.Components.voip.r0) bVar.f11653i;
            if (r0Var != null) {
                r0Var.invalidate();
            }
        }
        this.f51802u2.setColor(S02);
        this.f51810w1.setColor(S02);
        this.f51814x1.invalidate();
        f30 f30Var = this.I1;
        f30Var.setGlowColor(S02);
        int i13 = this.f51816x3;
        if (i13 == 3 || r1(i13)) {
            this.f51796t1.invalidate();
        }
        View view = this.B4;
        if (view != null) {
            int i14 = this.N3;
            int[] iArr = this.E4;
            iArr[0] = i14;
            iArr[1] = 0;
            if (Build.VERSION.SDK_INT > 29) {
                this.D4.setColors(iArr);
            } else {
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, iArr);
                this.D4 = gradientDrawable;
                view.setBackground(gradientDrawable);
            }
            this.C4.setBackgroundColor(iArr[0]);
        }
        int S03 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28150rh, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28168sh, false));
        this.f51787r1.a(S03, S03);
        int S04 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Zg, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27870ch, false));
        int S05 = org.telegram.messenger.g0.S0(f10, 1.0f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27833ah, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27928fh, false));
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, this.J0);
        int childCount = f30Var.getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = f30Var.getChildAt(i15);
            if (childAt instanceof org.telegram.ui.Cells.z3) {
                org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) childAt;
                if (q1()) {
                    z3Var.a(w02, w02);
                } else {
                    z3Var.a(S05, S04);
                }
            } else {
                boolean z10 = childAt instanceof org.telegram.ui.Cells.f4;
                u20 u20Var = this.G1;
                if (z10) {
                    org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) childAt;
                    if (u20Var.getTag() != null) {
                        i10 = org.telegram.ui.ActionBar.k6.f27928fh;
                    } else {
                        i10 = org.telegram.ui.ActionBar.k6.f27833ah;
                    }
                    f4Var.f(i10, S05);
                } else if (childAt instanceof org.telegram.ui.Cells.y3) {
                    org.telegram.ui.Cells.y3 y3Var = (org.telegram.ui.Cells.y3) childAt;
                    if (u20Var.getTag() != null) {
                        i3 = org.telegram.ui.ActionBar.k6.f27928fh;
                    } else {
                        i3 = org.telegram.ui.ActionBar.k6.f27833ah;
                    }
                    y3Var.a(i3, S05);
                }
            }
        }
        this.f28586b.invalidate();
        f30Var.invalidate();
        this.f28589c.invalidate();
    }

    public final void E1(float f10) {
        f30 f30Var;
        TLRPC.GroupCallParticipant groupCallParticipant;
        ArrayList arrayList;
        u4.d1 K;
        f10 = (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) ? 0.0f : 0.0f;
        float min = (float) (Math.min(8500.0d, 4000.0f * f10) / 8500.0d);
        this.H2 = min;
        this.I2 = (min - this.G2) / 265.0f;
        org.telegram.messenger.r3 r3Var = this.S2;
        if (r3Var != null && (f30Var = this.I1) != null && (groupCallParticipant = (TLRPC.GroupCallParticipant) r3Var.d.f(org.telegram.messenger.zi.C1(this.f51792s2))) != null) {
            u10 u10Var = this.S3;
            if (!u10Var.f39670b) {
                if (this.f51755k2) {
                    arrayList = this.f51807v2;
                } else {
                    arrayList = this.S2.f25053g;
                }
                int indexOf = arrayList.indexOf(groupCallParticipant);
                if (indexOf >= 0 && (K = f30Var.K(indexOf + this.H1.d)) != null) {
                    View view = K.f55540a;
                    if (view instanceof org.telegram.ui.Cells.f4) {
                        ((org.telegram.ui.Cells.f4) view).setAmplitude(f10 * 15.0f);
                        if (view == this.P4 && !this.f51729d4) {
                            this.f28586b.invalidate();
                        }
                    }
                }
            } else {
                int i3 = 0;
                while (true) {
                    q10 q10Var = this.f51733e4;
                    if (i3 >= q10Var.getChildCount()) {
                        break;
                    }
                    org.telegram.ui.Components.d10 d10Var = (org.telegram.ui.Components.d10) q10Var.getChildAt(i3);
                    if (org.telegram.messenger.zi.C1(d10Var.getParticipant().peer) == org.telegram.messenger.zi.C1(groupCallParticipant.peer)) {
                        d10Var.setAmplitude(f10 * 15.0f);
                    }
                    i3++;
                }
            }
            u10Var.k(groupCallParticipant, f10 * 15.0f);
        }
    }

    public final void F1(int i3, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24) {
        this.Y4 = i3;
        this.Z4 = i10;
        this.f51719a5 = i11;
        this.f51723b5 = i12;
        this.f51726c5 = i13;
        this.f51730d5 = i14;
        this.f51734e5 = i15;
        this.f51738f5 = i16;
        this.f51742g5 = i17;
        this.f51746h5 = i18;
        this.f51749i5 = i19;
        this.f51754j5 = i20;
        this.f51758k5 = i21;
        this.f51763l5 = i22;
        this.f51767m5 = i23;
        this.f51771n5 = i24;
    }

    @Override
    public final boolean G() {
        return false;
    }

    public final void G1(float f10) {
        f30 f30Var;
        int L;
        int i3;
        float f11;
        this.f51783q2 = f10;
        this.I1.setTopGlowOffset((int) (f10 - ((FrameLayout.LayoutParams) f30Var.getLayoutParams()).topMargin));
        float L2 = f10 - org.telegram.messenger.g0.L(74.0f);
        int i10 = ((this.f28617t0 + L2) > (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2) ? 1 : ((this.f28617t0 + L2) == (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2) ? 0 : -1));
        m30 m30Var = this.M2;
        u10 u10Var = this.S3;
        o10 o10Var = this.X2;
        m10 m10Var = this.W2;
        if (i10 < 0) {
            float min = Math.min(1.0f, (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() * 2) - L2) - this.f28617t0) / (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + ((L - this.f28617t0) - org.telegram.messenger.g0.L(14.0f))));
            if (org.telegram.messenger.g0.Q1()) {
                f11 = 17.0f;
            } else {
                f11 = 13.0f;
            }
            i3 = (int) (org.telegram.messenger.g0.L(f11) * min);
            if (m30Var != null) {
                m30Var.setShadowOffset((int) (org.telegram.messenger.g0.L(8.0f) * min));
            }
            if (Math.abs(Math.min(1.0f, min) - this.M3) > 1.0E-4f) {
                D1(Math.min(1.0f, min));
            }
            float A = org.telegram.ui.Cells.f1.A(min, 0.1f, 1.2f, 1.0f);
            m10Var.setScaleX(Math.max(0.9f, A));
            m10Var.setScaleY(Math.max(0.9f, A));
            float f12 = 1.0f - (min * 1.2f);
            m10Var.setAlpha((1.0f - u10Var.f39672c) * Math.max(0.0f, f12));
            o10Var.setScaleX(Math.max(0.9f, A));
            o10Var.setScaleY(Math.max(0.9f, A));
            o10Var.setAlpha((1.0f - u10Var.f39672c) * Math.max(0.0f, f12));
        } else {
            m10Var.setScaleX(1.0f);
            m10Var.setScaleY(1.0f);
            m10Var.setAlpha(1.0f - u10Var.f39672c);
            o10Var.setScaleX(1.0f);
            o10Var.setScaleY(1.0f);
            o10Var.setAlpha(1.0f - u10Var.f39672c);
            if (this.M3 > 1.0E-4f) {
                D1(0.0f);
            }
            i3 = 0;
        }
        a1();
        float f13 = i3;
        this.f51789r3.setTranslationY(Math.max(org.telegram.messenger.g0.L(4.0f), (f10 - org.telegram.messenger.g0.L(53.0f)) - f13));
        this.f51721b3.setTranslationY(Math.max(org.telegram.messenger.g0.L(4.0f), (f10 - org.telegram.messenger.g0.L(44.0f)) - f13));
        if (m30Var != null) {
            m30Var.setTranslationY(Math.max(org.telegram.messenger.g0.L(4.0f), f10 - org.telegram.messenger.g0.L(37.0f)));
        }
        l20 l20Var = this.J1;
        if (l20Var != null) {
            l20Var.setTranslationY(Math.max(org.telegram.messenger.g0.L(4.0f), (f10 - org.telegram.messenger.g0.L(44.0f)) - f13));
        }
        this.f28586b.invalidate();
        T1();
    }

    @Override
    public final boolean H() {
        return !this.S3.f39670b;
    }

    public final boolean I1(android.view.View r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.x30.I1(android.view.View):boolean");
    }

    public final void J1(View view) {
        if (this.f51731e2 == null) {
            org.telegram.ui.Components.u20 u20Var = new org.telegram.ui.Components.u20(8, getContext(), null, true);
            this.f51731e2 = u20Var;
            u20Var.setAlpha(0.0f);
            this.f51731e2.setVisibility(4);
            this.f51731e2.setShowingDuration(3000L);
            this.f28586b.addView(this.f51731e2, b8.mf.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            if (org.telegram.messenger.t3.W(this.R2)) {
                this.f51731e2.setText(org.telegram.messenger.bd.M0(2131743475, null));
            } else {
                this.f51731e2.setText(org.telegram.messenger.bd.M0(2131743357, null));
            }
            this.f51731e2.b();
        }
        this.f51731e2.setExtraTranslationY(-org.telegram.messenger.g0.f22602m);
        this.f51731e2.c(view);
    }

    @Override
    public final void K() {
        u10 u10Var = this.S3;
        if (u10Var != null) {
            if (this.f51748i4 != null) {
                this.I1.getViewTreeObserver().removeOnPreDrawListener(this.f51748i4);
                this.f51748i4 = null;
            }
            ArrayList arrayList = this.R3;
            arrayList.clear();
            ArrayList arrayList2 = this.Q3;
            arrayList.addAll(arrayList2);
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ((org.telegram.ui.Components.voip.r) arrayList.get(i3)).f();
                u10Var.removeView((View) arrayList.get(i3));
                ((org.telegram.ui.Components.voip.r) arrayList.get(i3)).e();
                ((org.telegram.ui.Components.voip.r) arrayList.get(i3)).b(true);
            }
            arrayList2.clear();
            if (u10Var.getParent() != null) {
                arrayList2.clear();
                this.f28586b.removeView(u10Var);
            }
        }
        super.K();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
            VoIPService.getSharedInstance().setSinks(null, null);
        }
        if (f51711v5 == this) {
            f51711v5 = null;
        }
        f51712w5 = false;
        VoIPService.audioLevelsCallback = null;
        org.telegram.ui.Components.l10.j(getContext());
        org.telegram.messenger.r3 r3Var = this.S2;
        if (r3Var != null) {
            ArrayList arrayList3 = r3Var.f25051e;
            for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                ((TLRPC.GroupCallParticipant) arrayList3.get(i10)).hasCameraFrame = 0;
                ((TLRPC.GroupCallParticipant) arrayList3.get(i10)).hasPresentationFrame = 0;
                ((TLRPC.GroupCallParticipant) arrayList3.get(i10)).videoIndex = 0;
            }
            r3Var.z();
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().clearRemoteSinks();
        }
    }

    public final void K1(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        org.telegram.messenger.r3 r3Var = this.S2;
        org.telegram.ui.Components.voip.c2 c2Var = this.f51791s1;
        org.telegram.ui.Components.voip.c2 c2Var2 = this.f51772o1;
        org.telegram.ui.Components.voip.c2 c2Var3 = this.f51782q1;
        org.telegram.ui.Components.voip.c2 c2Var4 = this.f51768n1;
        org.telegram.ui.Components.voip.c2 c2Var5 = this.f51777p1;
        org.telegram.ui.Components.voip.c2 c2Var6 = this.f51787r1;
        org.telegram.ui.Components.voip.c2 c2Var7 = this.f51796t1;
        boolean z19 = true;
        h10 h10Var = this.m1;
        boolean z20 = false;
        if (r3Var != null && !r3Var.j()) {
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(false) == 2) {
                z13 = true;
            } else {
                z13 = false;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.S2.d.f(org.telegram.messenger.zi.C1(this.f51792s2));
            if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !S0()) {
                z14 = true;
            } else {
                z14 = false;
            }
            Boolean bool = this.f51781p5;
            if (bool != null) {
                z15 = bool.booleanValue();
            } else {
                TLRPC.GroupCall groupCall = this.S2.f25049b;
                if (groupCall != null && groupCall.messages_enabled) {
                    z15 = true;
                } else {
                    z15 = false;
                }
            }
            if (((!z14 && this.S2.c()) || z13) && !t1()) {
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
            if (f51713x5) {
                z17 = false;
                z18 = false;
            }
            h10Var.c(c2Var7, true, z10);
            h10Var.c(c2Var6, true, z10);
            h10Var.c(c2Var5, z16, z10);
            h10Var.c(c2Var4, z18, z10);
            h10Var.c(c2Var3, z20, z10);
            h10Var.c(c2Var2, z17, z10);
            h10Var.c(c2Var, z15, z10);
            return;
        }
        if (this.N2 > 0.1f) {
            z11 = true;
        } else {
            z11 = false;
        }
        h10Var.c(c2Var7, z11, z10);
        if (this.N2 > 0.1f) {
            z12 = true;
        } else {
            z12 = false;
        }
        h10Var.c(c2Var6, z12, z10);
        if (this.N2 <= 0.1f) {
            z19 = false;
        }
        h10Var.c(c2Var3, z19, z10);
        h10Var.c(c2Var5, false, z10);
        h10Var.c(c2Var4, false, z10);
        h10Var.c(c2Var2, false, z10);
        h10Var.c(c2Var, false, z10);
    }

    public final void L1() {
        int i3;
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        int i11;
        TLObject M0;
        org.telegram.messenger.r3 r3Var;
        TLRPC.GroupCall groupCall;
        TLRPC.GroupCall groupCall2;
        int i12;
        int i13;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        org.telegram.messenger.r3 r3Var2 = this.S2;
        org.telegram.ui.ActionBar.q0 q0Var = this.f51724c3;
        org.telegram.ui.ActionBar.q0 q0Var2 = this.f51732e3;
        if (r3Var2 == null || r3Var2.j()) {
            this.f51728d3.setVisibility(4);
            q0Var2.setVisibility(8);
            if (this.S2 == null) {
                q0Var.setVisibility(8);
                return;
            }
        }
        if (this.f51727d2) {
            return;
        }
        org.telegram.messenger.c cVar = this.f51759l1;
        int i14 = cVar.f21919a;
        int i15 = cVar.f21919a;
        TLRPC.Chat M02 = org.telegram.messenger.hp.s1(i14).M0(Long.valueOf(k1()));
        if (M02 != null) {
            this.R2 = M02;
        }
        boolean y9 = org.telegram.messenger.t3.y(3, this.R2);
        org.telegram.ui.ActionBar.y0 y0Var = this.f51736f3;
        if (!y9 && (((org.telegram.messenger.t3.T(this.R2) && ((chat2 = this.R2) == null || !chat2.megagroup)) || (!org.telegram.messenger.t3.t0(this.R2) && !org.telegram.messenger.t3.y(3, this.R2))) && (!org.telegram.messenger.t3.T(this.R2) || (chat = this.R2) == null || chat.megagroup || !org.telegram.messenger.t3.t0(chat)))) {
            y0Var.setVisibility(8);
        } else {
            y0Var.setVisibility(0);
        }
        org.telegram.messenger.r3 r3Var3 = this.S2;
        org.telegram.ui.ActionBar.y0 y0Var2 = this.f51784q3;
        org.telegram.ui.ActionBar.y0 y0Var3 = this.f51779p3;
        if (r3Var3 != null && (groupCall2 = r3Var3.f25049b) != null && groupCall2.can_change_messages_enabled) {
            if (groupCall2.messages_enabled) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            y0Var3.setVisibility(i12);
            if (this.S2.f25049b.messages_enabled) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            y0Var2.setVisibility(i13);
        } else {
            y0Var3.setVisibility(8);
            y0Var2.setVisibility(8);
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.S2.d.f(org.telegram.messenger.zi.C1(this.f51792s2));
        org.telegram.messenger.r3 r3Var4 = this.S2;
        org.telegram.ui.ActionBar.y0 y0Var4 = this.i3;
        if (r3Var4 != null && !r3Var4.j() && (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted)) {
            y0Var4.setVisibility(0);
        } else {
            y0Var4.setVisibility(8);
        }
        if (org.telegram.messenger.az.I0) {
            i3 = 2131232261;
        } else {
            i3 = 2131232260;
        }
        y0Var4.setIcon(i3);
        if (org.telegram.messenger.az.I0) {
            i10 = 2131743290;
        } else {
            i10 = 2131743291;
        }
        y0Var4.setSubtext(org.telegram.messenger.bd.M0(i10, null));
        boolean S0 = S0();
        org.telegram.ui.ActionBar.y0 y0Var5 = this.f51774o3;
        org.telegram.ui.ActionBar.y0 y0Var6 = this.f51740g3;
        org.telegram.ui.ActionBar.y0 y0Var7 = this.f51756k3;
        org.telegram.ui.ActionBar.y0 y0Var8 = this.f51761l3;
        if (S0) {
            y0Var5.setVisibility(0);
            y0Var6.setVisibility(0);
            if (t1()) {
                y0Var7.setVisibility(0);
                y0Var8.setVisibility(8);
            } else if (this.S2.j()) {
                y0Var7.setVisibility(8);
                y0Var8.setVisibility(8);
            } else {
                y0Var7.setVisibility(0);
            }
            if (q1()) {
                y0Var7.setVisibility(8);
                y0Var6.setVisibility(8);
            }
            if (this.S2.c() && !this.S2.j() && !t1()) {
                y0Var8.setVisibility(0);
            } else {
                y0Var8.setVisibility(8);
            }
            q0Var2.setVisibility(8);
            boolean z13 = this.S2.f25067w;
            s30 s30Var = this.V2;
            s30Var.f49345f = z13;
            s30Var.d = 1.0f;
            s30Var.invalidateSelf();
            if (this.S2.f25067w) {
                if (this.f51808v3 == null) {
                    p00 p00Var = new p00(this, 6);
                    this.f51808v3 = p00Var;
                    org.telegram.messenger.g0.i3(p00Var, 1000L);
                }
                y0Var7.setText(org.telegram.messenger.bd.M0(2131743333, null));
            } else {
                p00 p00Var2 = this.f51808v3;
                if (p00Var2 != null) {
                    org.telegram.messenger.g0.r(p00Var2);
                    this.f51808v3 = null;
                }
                y0Var7.setText(org.telegram.messenger.bd.M0(2131743358, null));
            }
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(true) == 2) {
                y0Var8.j(org.telegram.messenger.bd.M0(2131743444, null), 2131232353, null);
            } else {
                y0Var8.j(org.telegram.messenger.bd.M0(2131743446, null), 2131232352, null);
            }
            N1();
        } else {
            if (groupCallParticipant != null && !groupCallParticipant.can_self_unmute && groupCallParticipant.muted && !S0()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(true) == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z10 && ((this.S2.c() || z11) && !this.S2.j() && !t1())) {
                if (z11) {
                    q0Var2.setVisibility(8);
                    y0Var8.setVisibility(0);
                    y0Var8.j(org.telegram.messenger.bd.M0(2131743444, null), 2131232353, null);
                    y0Var8.setContentDescription(org.telegram.messenger.bd.M0(2131743444, null));
                } else {
                    y0Var8.j(org.telegram.messenger.bd.M0(2131743446, null), 2131232352, null);
                    y0Var8.setContentDescription(org.telegram.messenger.bd.M0(2131743446, null));
                    q0Var2.setVisibility(8);
                    y0Var8.setVisibility(0);
                }
            } else {
                q0Var2.setVisibility(8);
                y0Var8.setVisibility(8);
            }
            y0Var5.setVisibility(8);
            y0Var6.setVisibility(8);
            y0Var7.setVisibility(8);
        }
        boolean S02 = S0();
        org.telegram.ui.ActionBar.y0 y0Var9 = this.f51752j3;
        if (S02 && this.S2.f25049b.can_change_join_muted && !q1()) {
            y0Var9.setVisibility(0);
        } else {
            y0Var9.setVisibility(8);
        }
        if (q1() && ((r3Var = this.S2) == null || (groupCall = r3Var.f25049b) == null || !groupCall.creator)) {
            z12 = false;
        } else {
            z12 = true;
        }
        q0Var.Q(4, z12);
        if (t1() && !this.S2.j()) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        this.f51744h3.setVisibility(i11);
        int visibility = y0Var6.getVisibility();
        TextView textView = this.f51793s3;
        if (visibility != 0 && y0Var9.getVisibility() != 0 && y0Var.getVisibility() != 0 && y0Var8.getVisibility() != 0 && y0Var7.getVisibility() != 0 && y0Var5.getVisibility() != 0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        org.telegram.ui.Cells.k kVar = this.c2;
        if (((sharedInstance != null && VoIPService.getSharedInstance().hasFewPeers) || this.T2) && !t1() && this.f51792s2 != null) {
            kVar.setVisibility(0);
            long C1 = org.telegram.messenger.zi.C1(this.f51792s2);
            if (org.telegram.messenger.m5.E(C1)) {
                M0 = org.telegram.messenger.hp.s1(i15).a2(Long.valueOf(C1));
            } else {
                M0 = org.telegram.messenger.hp.s1(i15).M0(Long.valueOf(-C1));
            }
            kVar.setObject(M0);
        } else {
            kVar.setVisibility(8);
        }
        TLRPC.Chat chat3 = this.R2;
        if (chat3 != null && !org.telegram.messenger.t3.W(chat3) && t1() && y0Var.getVisibility() == 8) {
            q0Var.setVisibility(8);
        } else {
            q0Var.setVisibility(0);
        }
        LinearLayout linearLayout = this.f51721b3;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        float f10 = 96;
        if (layoutParams.rightMargin != org.telegram.messenger.g0.L(f10)) {
            layoutParams.rightMargin = org.telegram.messenger.g0.L(f10);
            linearLayout.requestLayout();
        }
        ((FrameLayout.LayoutParams) this.f51789r3.getLayoutParams()).rightMargin = 0;
        this.G1.setTitleRightMargin(org.telegram.messenger.g0.L(48.0f) * 2);
    }

    public final void M1(int r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.x30.M1(int, boolean):void");
    }

    public final void N1() {
        if (this.S2 == null) {
            return;
        }
        int currentTime = ConnectionsManager.getInstance(this.f51759l1.f21919a).getCurrentTime();
        org.telegram.messenger.r3 r3Var = this.S2;
        int i3 = currentTime - r3Var.f25049b.record_start_date;
        boolean z10 = r3Var.f25067w;
        org.telegram.ui.ActionBar.y0 y0Var = this.f51756k3;
        if (z10) {
            y0Var.setSubtext(org.telegram.messenger.g0.g0(i3, false, false));
        } else {
            y0Var.setSubtext(null);
        }
    }

    public final void O1(boolean z10) {
        float interpolation;
        float f10;
        l20 l20Var = this.J1;
        if ((l20Var == null || this.S2 != null) && this.P2 == null) {
            this.O2 = 1.0f;
            this.N2 = 1.0f;
            if (l20Var == null) {
                return;
            }
        }
        int i3 = 4;
        if (!z10) {
            l10 l10Var = this.f51775o4;
            org.telegram.messenger.g0.r(l10Var);
            l10Var.run();
            org.telegram.messenger.r3 r3Var = this.S2;
            f30 f30Var = this.I1;
            if (r3Var != null && !r3Var.j()) {
                f30Var.setVisibility(0);
            } else {
                f30Var.setVisibility(4);
            }
            boolean W = org.telegram.messenger.t3.W(this.R2);
            org.telegram.ui.ActionBar.y0 y0Var = this.f51774o3;
            if (W) {
                y0Var.setText(org.telegram.messenger.bd.M0(2131743498, null));
            } else {
                y0Var.setText(org.telegram.messenger.bd.M0(2131743405, null));
            }
        }
        float f11 = this.N2;
        if (f11 > 0.6f) {
            interpolation = 1.05f - (org.telegram.ui.Components.xq.f40452f.getInterpolation((f11 - 0.6f) / 0.4f) * 0.05f);
            this.O2 = 1.0f;
            f10 = 1.0f;
        } else {
            org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f40452f;
            this.O2 = xqVar.getInterpolation(f11 / 0.6f);
            interpolation = 1.05f * xqVar.getInterpolation(this.N2 / 0.6f);
            f10 = this.N2 / 0.6f;
        }
        K1(true);
        float f12 = 1.0f - f10;
        l20Var.setAlpha(f12);
        this.M1.setAlpha(f10);
        this.O1.setAlpha(f10);
        e30 e30Var = this.N1;
        e30Var.setAlpha(f10);
        e30Var.setScaleX(interpolation);
        e30Var.setScaleY(interpolation);
        j20 j20Var = this.L1;
        j20Var.setScaleX(f12);
        j20Var.setScaleY(f12);
        j20Var.setAlpha(f12);
        this.K1.setAlpha(f12);
        this.f51724c3.setAlpha(f10);
        if (f12 != 0.0f) {
            i3 = 0;
        }
        if (i3 != l20Var.getVisibility()) {
            l20Var.setVisibility(i3);
            j20Var.setVisibility(i3);
        }
    }

    public final void P1(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i3;
        org.telegram.ui.Components.voip.c2 c2Var = this.f51782q1;
        if (c2Var != null && c2Var.getVisibility() == 0) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            h10 h10Var = this.m1;
            boolean z14 = false;
            if (sharedInstance != null && !t1()) {
                nh.a aVar = (nh.a) h10Var.f20395c.get(c2Var);
                if (aVar != null) {
                    aVar.d.a(true, z10);
                    c2Var.setEnabled(true);
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
                    c2Var.c(2131230916, -1, 0, 0.1f, true, org.telegram.messenger.bd.M0(2131743513, null), false, z10);
                } else if (z13) {
                    c2Var.c(2131230924, -1, 0, 0.3f, true, org.telegram.messenger.bd.M0(2131743249, null), false, z10);
                } else if (sharedInstance.isHeadsetPlugged()) {
                    c2Var.c(2131230919, -1, 0, 0.1f, true, org.telegram.messenger.bd.M0(2131743511, null), false, z10);
                } else {
                    c2Var.c(2131230924, -1, 0, 0.1f, true, org.telegram.messenger.bd.M0(2131743249, null), false, z10);
                }
                c2Var.b(z13, z10);
                j1();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.isBluetoothHeadsetConnected()) {
                    i3 = 2131231089;
                } else {
                    i3 = 2131231171;
                }
                if (this.S1 != i3) {
                    this.S1 = i3;
                    org.telegram.messenger.g0.R3(this.T1, i3);
                }
                org.telegram.ui.Components.voip.c2 c2Var2 = this.f51772o1;
                if (c2Var2.getVisibility() == 0) {
                    c2Var2.c(0, -1, 0, 1.0f, true, h1(j1()), false, z10);
                    if (j1() != 1) {
                        z14 = true;
                    }
                    c2Var2.b(z14, z10);
                    return;
                }
                return;
            }
            c2Var.c(2131232435, -1, 0, 0.3f, true, org.telegram.messenger.bd.M0(2131743447, null), false, z10);
            if (!org.telegram.messenger.t3.t0(this.R2) && (!org.telegram.messenger.t3.N(this.R2) || !org.telegram.messenger.t3.w(3, this.R2))) {
                z11 = false;
            } else {
                z11 = true;
            }
            nh.a aVar2 = (nh.a) h10Var.f20395c.get(c2Var);
            if (aVar2 != null) {
                aVar2.d.a(z11, z10);
                c2Var.setEnabled(z11);
            }
            c2Var.b(true, false);
        }
    }

    public final void Q0(boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.x30.Q0(boolean):void");
    }

    public final void Q1(boolean r36, boolean r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.x30.Q1(boolean, boolean):void");
    }

    public final int R0() {
        f30 f30Var = this.I1;
        int childCount = f30Var.getChildCount();
        int i3 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = f30Var.getChildAt(i10);
            if (RecyclerView.R(childAt) >= 0) {
                i3 = Math.min(i3, childAt.getTop());
            }
        }
        return i3;
    }

    public final void R1() {
        boolean z10;
        String str;
        float f10;
        float f11;
        v30 v30Var;
        TLRPC.User user;
        TLRPC.Chat chat;
        u20 u20Var = this.G1;
        if (u20Var != null && this.S2 != null) {
            SpannableStringBuilder spannableStringBuilder = null;
            int i3 = 0;
            for (int i10 = 0; i10 < this.S2.P.m(); i10++) {
                long j10 = this.S2.P.j(i10);
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.S2.P.f(j10);
                if (!groupCallParticipant.self) {
                    u10 u10Var = this.S3;
                    u10Var.getClass();
                    if (u10Var.f39699x.get(org.telegram.messenger.zi.C1(groupCallParticipant.peer)) <= 0 && this.f51799t4.get(j10, 0) != 1) {
                        long C1 = org.telegram.messenger.zi.C1(groupCallParticipant.peer);
                        if (spannableStringBuilder == null) {
                            spannableStringBuilder = new SpannableStringBuilder();
                        }
                        if (i3 < 2) {
                            int i11 = (C1 > 0L ? 1 : (C1 == 0L ? 0 : -1));
                            if (i11 > 0) {
                                user = org.telegram.messenger.hp.s1(this.f28583a).a2(Long.valueOf(C1));
                            } else {
                                user = null;
                            }
                            if (i11 <= 0) {
                                chat = org.telegram.messenger.hp.s1(this.f28583a).M0(Long.valueOf(C1));
                            } else {
                                chat = null;
                            }
                            if (user != null || chat != null) {
                                if (i3 != 0) {
                                    spannableStringBuilder.append((CharSequence) ", ");
                                }
                                if (user != null) {
                                    spannableStringBuilder.append(org.telegram.messenger.l10.j(user, true), new org.telegram.ui.Components.o31(org.telegram.messenger.g0.o()), 0);
                                } else {
                                    spannableStringBuilder.append(chat.title, new org.telegram.ui.Components.o31(org.telegram.messenger.g0.o()), 0);
                                }
                            }
                        }
                        i3++;
                        if (i3 == 2) {
                            break;
                        }
                    }
                }
            }
            if (i3 > 0) {
                String K0 = org.telegram.messenger.bd.K0(i3, "MembersAreSpeakingToast");
                int indexOf = K0.indexOf("un1");
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(K0);
                spannableStringBuilder2.replace(indexOf, indexOf + 3, (CharSequence) spannableStringBuilder);
                u20Var.getAdditionalSubtitleTextView().k(spannableStringBuilder2);
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.ActionBar.k5 subtitleTextView = u20Var.getSubtitleTextView();
            if (t1()) {
                str = "ViewersWatching";
            } else {
                str = "Participants";
            }
            int i12 = this.S2.f25049b.participants_count;
            r30 r30Var = this.H1;
            subtitleTextView.k(org.telegram.messenger.bd.G(i12 + ((r30Var.N.t1() || r30Var.M || VoIPService.getSharedInstance() == null) ? 0 : !VoIPService.getSharedInstance().isJoined()), str, new Object[0]));
            if (t1() && (v30Var = this.f51798t3) != null) {
                v30Var.setWatchersCount(this.S2.f25049b.participants_count);
            }
            if (z10 != this.f51766m4) {
                this.f51766m4 = z10;
                u20Var.invalidate();
                float f12 = 0.0f;
                u20Var.getSubtitleTextView().setPivotX(0.0f);
                u20Var.getSubtitleTextView().setPivotY(u20Var.getMeasuredHeight() >> 1);
                ViewPropertyAnimator animate = u20Var.getSubtitleTextView().animate();
                if (this.f51766m4) {
                    f10 = 0.98f;
                } else {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f10);
                if (this.f51766m4) {
                    f11 = 0.9f;
                } else {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f11);
                if (!this.f51766m4) {
                    f12 = 1.0f;
                }
                scaleY.alpha(f12).setDuration(150L);
                org.telegram.messenger.g0.X3(u20Var.getAdditionalSubtitleTextView(), this.f51766m4);
            }
        }
    }

    public final boolean S0() {
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isConference()) {
            org.telegram.messenger.r3 r3Var = this.S2;
            if (r3Var != null && (groupCall = r3Var.f25049b) != null && groupCall.creator) {
                return true;
            }
            return false;
        }
        return org.telegram.messenger.t3.w(14, this.R2);
    }

    public final void S1(boolean z10) {
        org.telegram.messenger.r3 r3Var = this.S2;
        m10 m10Var = this.W2;
        if (r3Var == null) {
            if (org.telegram.messenger.t3.W(this.R2)) {
                m10Var.b(org.telegram.messenger.bd.M0(2131743472, null), z10);
                return;
            } else {
                m10Var.b(org.telegram.messenger.bd.M0(2131743351, null), z10);
                return;
            }
        }
        boolean isEmpty = TextUtils.isEmpty(r3Var.f25049b.title);
        u20 u20Var = this.G1;
        if (!isEmpty) {
            if (!this.S2.f25049b.title.equals(u20Var.getTitle())) {
                if (z10) {
                    this.G1.K(this.S2.f25049b.title, true, 180L, null);
                    u20Var.getTitleTextView().setOnClickListener(new n00(this, 8));
                } else {
                    u20Var.setTitle(this.S2.f25049b.title);
                }
                m10Var.b(this.S2.f25049b.title, z10);
            }
        } else {
            TLRPC.Chat chat = this.R2;
            if (chat != null && !chat.title.equals(u20Var.getTitle())) {
                if (z10) {
                    this.G1.K(this.R2.title, true, 180L, null);
                    u20Var.getTitleTextView().setOnClickListener(new n00(this, 9));
                } else {
                    u20Var.setTitle(this.R2.title);
                }
                if (org.telegram.messenger.t3.W(this.R2)) {
                    if (t1()) {
                        m10Var.b(this.R2.title, z10);
                    } else {
                        m10Var.b(org.telegram.messenger.bd.M0(2131743457, null), z10);
                    }
                } else {
                    m10Var.b(org.telegram.messenger.bd.M0(2131743316, null), z10);
                }
            } else if (this.R2 == null) {
                u20Var.setTitle(org.telegram.messenger.bd.M0(2131751823, null));
                m10Var.b(org.telegram.messenger.bd.M0(2131751823, null), z10);
            }
        }
        org.telegram.ui.ActionBar.k5 titleTextView = u20Var.getTitleTextView();
        if (this.S2.f25067w) {
            if (titleTextView.getRightDrawable() == null) {
                titleTextView.i(new t30(titleTextView));
                TextView textView = m10Var.getTextView();
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new t30(textView), (Drawable) null);
                TextView nextTextView = m10Var.getNextTextView();
                nextTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, new t30(nextTextView), (Drawable) null);
            }
        } else if (titleTextView.getRightDrawable() != null) {
            titleTextView.i(null);
            m10Var.getTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            m10Var.getNextTextView().setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public final void T0() {
        if (this.J3) {
            this.J3 = false;
            org.telegram.messenger.g0.r(this.f51785q4);
        }
        if (this.K3) {
            this.K3 = false;
            MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
            this.f51796t1.onTouchEvent(obtain);
            obtain.recycle();
        }
    }

    public final void T1() {
        float f10;
        org.telegram.ui.Components.fb fbVar;
        boolean z10;
        if (this.F != null) {
            int L = org.telegram.messenger.g0.L(74.0f);
            float f11 = this.f51783q2 - L;
            if (this.f28617t0 + f11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                int L2 = (L - this.f28617t0) - org.telegram.messenger.g0.L(14.0f);
                f10 = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f11) - this.f28617t0) / L2);
                f11 -= (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - L2) * f10);
            } else {
                f10 = 0.0f;
            }
            float paddingTop = f11 + this.f28586b.getPaddingTop();
            FrameLayout frameLayout = this.F;
            u20 u20Var = this.G1;
            frameLayout.setTranslationY(org.telegram.messenger.g0.T1(((-frameLayout.getTop()) - this.F.getHeight()) + paddingTop + org.telegram.messenger.g0.L(10.0f), u20Var.getY() + (-this.F.getTop()) + u20Var.getHeight(), f10));
            org.telegram.ui.Components.ac acVar = org.telegram.ui.Components.ac.f31784w;
            if (acVar != null && (fbVar = acVar.f31788e) != null && fbVar.getParent() != null && fbVar.getParent().getParent() == this.F) {
                if (f10 > 0.5f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                fbVar.setTop(z10);
            }
        }
    }

    @Override
    public final ArrayList U() {
        return new ArrayList();
    }

    public final void U0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.x30.U0():void");
    }

    public final void V0() {
        this.f51814x1.setTranslationY((-this.f51803u3.d()) + this.f28586b.getPaddingBottom());
        this.f51818y1.invalidate();
        b1();
        a1();
        Y0();
        Z0();
        c1();
        this.m1.setAlpha(1.0f - this.r5.f53840e);
        W0();
        X0();
    }

    public final void W0() {
        int i3;
        float f10 = this.f51803u3.f54730b.f53866a;
        if (f10 > 0.0f) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        f20 f20Var = this.f51814x1;
        f20Var.setAlpha(f10);
        e20 e20Var = this.f51818y1;
        e20Var.setAlpha(f10);
        if (f20Var.getVisibility() != i3) {
            f20Var.setVisibility(i3);
            e20Var.setVisibility(i3);
            if (i3 == 8) {
                c20 c20Var = this.f51822z1;
                if (c20Var.isFocused()) {
                    c20Var.clearFocus();
                }
            }
        }
    }

    public final void X0() {
        int i3;
        org.telegram.ui.Components.li0 li0Var = this.C1;
        if (li0Var != null) {
            float f10 = this.f51803u3.f54730b.f53866a * this.f51795s5.f53840e;
            li0Var.setAlpha(f10);
            if (f10 > 0.0f) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            if (this.C1.getVisibility() != i3) {
                this.C1.setVisibility(i3);
                if (i3 == 8) {
                    this.C1.n();
                }
            }
            org.telegram.ui.Components.li0 li0Var2 = this.C1;
            if (!li0Var2.O0 && f10 == 1.0f) {
                li0Var2.O0 = true;
            }
        }
    }

    @Override
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        if (i3 == 2) {
            a1();
            Y0();
            Z0();
            float f12 = 1.0f - this.r5.f53840e;
            h10 h10Var = this.m1;
            h10Var.setAlpha(f12);
            this.S3.setProgressToHideUi(f10);
            this.f51733e4.invalidate();
            this.f28586b.invalidate();
            h10Var.invalidate();
        }
        if (i3 == 3) {
            b1();
            a1();
            c1();
            X0();
            this.f28586b.invalidate();
        }
        if (i3 == 4) {
            a1();
            this.f51818y1.invalidate();
            this.f51822z1.invalidate();
        }
        if (i3 == 5) {
            a1();
            this.f28586b.invalidate();
        }
    }

    public final void Y0() {
        boolean z10 = f51714y5;
        h10 h10Var = this.m1;
        if (z10) {
            h10Var.setTranslationX(0.0f);
            h10Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = f51713x5;
        qe.a aVar = this.r5;
        if (z11) {
            h10Var.setTranslationX(aVar.f53840e * org.telegram.messenger.g0.L(94.0f));
            h10Var.setTranslationY(0.0f);
            return;
        }
        h10Var.setTranslationX(0.0f);
        h10Var.setTranslationY(aVar.f53840e * org.telegram.messenger.g0.L(94.0f));
    }

    public final void Z0() {
        boolean z10 = f51714y5;
        q10 q10Var = this.f51733e4;
        if (z10) {
            q10Var.setTranslationX(0.0f);
            q10Var.setTranslationY(0.0f);
            return;
        }
        boolean z11 = f51713x5;
        qe.a aVar = this.r5;
        if (z11) {
            q10Var.setTranslationX(aVar.f53840e * org.telegram.messenger.g0.L(94.0f));
            q10Var.setTranslationY(0.0f);
            return;
        }
        q10Var.setTranslationX(0.0f);
        q10Var.setTranslationY(aVar.f53840e * org.telegram.messenger.g0.L(94.0f));
    }

    public final void a1() {
        float L;
        float f10 = this.f51800t5.f53846f;
        sh.h hVar = this.f51803u3;
        float f11 = -((hVar.d() - this.f28586b.getPaddingBottom()) + f10 + (org.telegram.messenger.g0.L(68.0f) * this.f51795s5.f53840e) + org.telegram.messenger.g0.L(10.0f));
        if (f51714y5) {
            L = (1.0f - this.f51805u5.f53840e) * org.telegram.messenger.g0.L(-91.0f);
        } else if (f51713x5) {
            L = 0.0f;
        } else {
            L = ((this.r5.f53840e * org.telegram.messenger.g0.L(94.0f)) - (org.telegram.messenger.g0.L(104.0f) * this.S3.f39672c)) - org.telegram.messenger.g0.L(91.0f);
        }
        float T1 = org.telegram.messenger.g0.T1(L, f11, hVar.f54730b.f53866a);
        float measuredHeight = ((this.f28586b.getMeasuredHeight() - this.f51783q2) + T1) - this.f28617t0;
        float max = Math.max((measuredHeight / 3.0f) * 2.0f, measuredHeight - org.telegram.messenger.g0.L(250.0f));
        oh.h hVar2 = this.U1;
        hVar2.setTranslationY(T1);
        hVar2.setVisibleHeight((int) max);
    }

    public final void b1() {
        if (this.C1 != null) {
            this.C1.setTranslationY((-this.f51803u3.d()) + this.f28586b.getPaddingBottom() + ((-this.f51795s5.f53840e) * org.telegram.messenger.g0.L(64.0f)));
        }
    }

    public final void c1() {
        boolean z10;
        float f10 = this.f51795s5.f53840e;
        float T1 = org.telegram.messenger.g0.T1(0.25f, 1.0f, f10);
        ImageView imageView = this.B1;
        imageView.setScaleX(T1);
        imageView.setScaleY(org.telegram.messenger.g0.T1(0.25f, 1.0f, f10));
        imageView.setAlpha(f10);
        boolean z11 = false;
        if (f10 > 0.9f) {
            z10 = true;
        } else {
            z10 = false;
        }
        imageView.setClickable(z10);
        float f11 = 1.0f - f10;
        float T12 = org.telegram.messenger.g0.T1(0.25f, 1.0f, f11);
        ImageView imageView2 = this.A1;
        imageView2.setScaleX(T12);
        imageView2.setScaleY(org.telegram.messenger.g0.T1(0.25f, 1.0f, f11));
        imageView2.setAlpha(f11);
        if (f11 > 0.9f) {
            z11 = true;
        }
        imageView2.setClickable(z11);
    }

    public final void d1() {
        org.telegram.ui.Components.voip.r rVar = this.R4;
        if (rVar != null) {
            rVar.f39546a.setRoundCorners(org.telegram.messenger.g0.L(8.0f));
            org.telegram.ui.Components.voip.r rVar2 = this.R4;
            rVar2.h = false;
            rVar2.j(false);
            this.R4.invalidate();
            this.S3.invalidate();
        }
        org.telegram.ui.Cells.f4 f4Var = this.P4;
        if (f4Var != null && !this.T4 && f4Var.getParent() != null) {
            this.f28586b.removeView(this.P4);
        }
        org.telegram.ui.Cells.f4 f4Var2 = this.P4;
        if (f4Var2 != null) {
            f4Var2.setProgressToAvatarPreview(0.0f);
            this.P4.setAboutVisible(false);
            this.P4.getAvatarImageView().setAlpha(1.0f);
        }
        org.telegram.ui.Components.d10 d10Var = this.S4;
        if (d10Var != null) {
            d10Var.getAvatarImageView().setAlpha(1.0f);
        }
        this.P4 = null;
        this.Q4 = null;
        this.S4 = null;
        this.R4 = null;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        ConferenceCall conferenceCall;
        TLRPC.GroupCallParticipant groupCallParticipant;
        int i11;
        int i12;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        int i13;
        int i14;
        String M0;
        boolean z10;
        org.telegram.messenger.s3 s3Var;
        boolean z11;
        VoIPService sharedInstance;
        int i15;
        int i16;
        int i17 = org.telegram.messenger.hs.f23328w2;
        f30 f30Var = this.I1;
        String[] strArr = null;
        int i18 = 0;
        if (i3 == i17) {
            Long l10 = (Long) objArr[1];
            org.telegram.messenger.r3 r3Var = this.S2;
            if (r3Var != null && r3Var.f25049b.f27011id == l10.longValue()) {
                org.telegram.messenger.r3 r3Var2 = this.S2;
                if (r3Var2.f25049b instanceof TLRPC.TL_groupCallDiscarded) {
                    dismiss();
                    return;
                }
                int i19 = (this.f51760l2 > 0L ? 1 : (this.f51760l2 == 0L ? 0 : -1));
                org.telegram.messenger.c cVar = this.f51759l1;
                if (i19 == 0 && (((i16 = this.f51816x3) == 7 || i16 == 5 || i16 == 6) && !r3Var2.j())) {
                    try {
                        Intent intent = new Intent(this.f51716a2, VoIPService.class);
                        intent.putExtra("chat_id", k1());
                        intent.putExtra("createGroupCall", false);
                        intent.putExtra("hasFewPeers", this.T2);
                        intent.putExtra("peerChannelId", this.Q2.channel_id);
                        intent.putExtra("peerChatId", this.Q2.chat_id);
                        intent.putExtra("peerUserId", this.Q2.user_id);
                        intent.putExtra("hash", this.U2);
                        intent.putExtra("peerAccessHash", this.Q2.access_hash);
                        intent.putExtra("is_outgoing", true);
                        intent.putExtra("start_incall_activity", false);
                        intent.putExtra("account", cVar.f21919a);
                        intent.putExtra("scheduleDate", this.f51725c4);
                        this.f51716a2.startService(intent);
                    } catch (Throwable th2) {
                        org.telegram.messenger.a8.g(th2, true);
                    }
                    this.f51760l2 = SystemClock.elapsedRealtime();
                    org.telegram.messenger.g0.i3(new p00(this, 2), 3000L);
                }
                if (!this.f51764m2 && VoIPService.getSharedInstance() != null) {
                    this.S2.b(false);
                    n1();
                    VoIPService.getSharedInstance().playConnectedSound();
                }
                L1();
                int childCount = f30Var.getChildCount();
                for (int i20 = 0; i20 < childCount; i20++) {
                    View childAt = f30Var.getChildAt(i20);
                    if (childAt instanceof org.telegram.ui.Cells.f4) {
                        ((org.telegram.ui.Cells.f4) childAt).a(true, false);
                    }
                }
                if (this.P4 != null) {
                    this.f51755k2 = true;
                } else {
                    Q0(true);
                }
                R1();
                boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                if (this.f51816x3 == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                Q1(true, booleanValue);
                S1(true);
                if (z11 && ((i15 = this.f51816x3) == 1 || i15 == 0)) {
                    m1().j(38, 0L, null);
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().playAllowTalkSound();
                    }
                }
                if (objArr.length >= 4) {
                    Long l11 = (Long) objArr[3];
                    long longValue = l11.longValue();
                    if (longValue != 0 && !t1()) {
                        if (!q1() || (sharedInstance = VoIPService.getSharedInstance()) == null || longValue != sharedInstance.convertingFromCallWithUserId) {
                            try {
                                ArrayList arrayList = org.telegram.messenger.hp.s1(cVar.f21919a).f23169y;
                                if (arrayList != null) {
                                    int size = arrayList.size();
                                    int i21 = 0;
                                    while (true) {
                                        if (i21 >= size) {
                                            break;
                                        }
                                        Object obj = arrayList.get(i21);
                                        i21++;
                                        if (((TLRPC.Dialog) obj).f27005id == longValue) {
                                            i18 = 1;
                                            break;
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                            }
                            if (org.telegram.messenger.m5.E(longValue)) {
                                TLRPC.User a22 = org.telegram.messenger.hp.s1(cVar.f21919a).a2(l11);
                                if (a22 != null) {
                                    if (this.S2.f25049b.participants_count < 250 || org.telegram.messenger.l10.w(a22) || a22.verified || i18 != 0) {
                                        m1().k(0L, 44, a22, this.R2, null, null);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            TLRPC.Chat M02 = org.telegram.messenger.hp.s1(cVar.f21919a).M0(Long.valueOf(-longValue));
                            if (M02 != null) {
                                if (this.S2.f25049b.participants_count < 250 || !org.telegram.messenger.t3.r0(M02) || M02.verified || i18 != 0) {
                                    m1().k(0L, 44, M02, this.R2, null, null);
                                }
                            }
                        }
                    }
                }
            }
        } else if (i3 == org.telegram.messenger.hs.f23342y2) {
            u10 u10Var = this.S3;
            if (u10Var.f39670b && this.S2 != null) {
                boolean c2 = u10Var.c();
                org.telegram.messenger.r3 r3Var3 = this.S2;
                if (r3Var3 != null && u10Var.f39670b && (s3Var = u10Var.f39675e) != null && r3Var3.d.f(org.telegram.messenger.zi.C1(s3Var.f25270a.peer)) == null) {
                    c2 = true;
                }
                if (c2) {
                    org.telegram.messenger.s3 s3Var2 = null;
                    int i22 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.f51747i2;
                        if (i22 >= arrayList2.size()) {
                            break;
                        }
                        org.telegram.messenger.s3 s3Var3 = (org.telegram.messenger.s3) arrayList2.get(i22);
                        if (this.S2.P.g(null, org.telegram.messenger.zi.C1(s3Var3.f25270a.peer)) != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            TLRPC.GroupCallParticipant groupCallParticipant3 = s3Var3.f25270a;
                            if (!groupCallParticipant3.muted_by_you && u10Var.d != org.telegram.messenger.zi.C1(groupCallParticipant3.peer)) {
                                s3Var2 = s3Var3;
                            }
                        }
                        i22++;
                    }
                    if (s3Var2 != null) {
                        g1(s3Var2);
                    }
                }
            }
            u10Var.setVisibleParticipant(true);
            R1();
        } else if (i3 == org.telegram.messenger.hs.N4) {
            E1(((Float) objArr[0]).floatValue());
        } else if (i3 == org.telegram.messenger.hs.M0) {
            if (((Integer) objArr[0]).intValue() == 6) {
                String str = (String) objArr[1];
                if ("GROUPCALL_PARTICIPANTS_TOO_MUCH".equals(str)) {
                    if (org.telegram.messenger.t3.W(this.R2)) {
                        M0 = org.telegram.messenger.bd.M0(2131743462, null);
                    } else {
                        M0 = org.telegram.messenger.bd.M0(2131743329, null);
                    }
                } else if (!"ANONYMOUS_CALLS_DISABLED".equals(str) && !"GROUPCALL_ANONYMOUS_FORBIDDEN".equals(str)) {
                    M0 = org.telegram.messenger.bd.M0(2131751106, null) + "\n" + str;
                } else if (org.telegram.messenger.t3.W(this.R2)) {
                    M0 = org.telegram.messenger.bd.M0(2131743488, null);
                } else {
                    M0 = org.telegram.messenger.bd.M0(2131743380, null);
                }
                AlertDialog$Builder M = org.telegram.ui.Components.t4.M(getContext(), org.telegram.messenger.bd.M0(2131743316, null), M0);
                M.j(new t00(this, 1));
                try {
                    M.p();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        } else if (i3 == org.telegram.messenger.hs.D2) {
            if (VoIPService.getSharedInstance() == null) {
                dismiss();
            }
        } else if (i3 == org.telegram.messenger.hs.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.f27002id == k1()) {
                L1();
                Q1(isShowing(), false);
            }
            long C1 = org.telegram.messenger.zi.C1(this.f51792s2);
            org.telegram.messenger.r3 r3Var4 = this.S2;
            if (r3Var4 != null && chatFull.f27002id == (-C1) && (groupCallParticipant2 = (TLRPC.GroupCallParticipant) r3Var4.d.f(C1)) != null) {
                groupCallParticipant2.about = chatFull.about;
                Q0(true);
                org.telegram.messenger.g0.b4(f30Var);
                if (this.f51813w4 != null) {
                    while (i18 < this.f51813w4.getChildCount()) {
                        View childAt2 = this.f51813w4.getChildAt(i18);
                        if ((childAt2 instanceof org.telegram.ui.ActionBar.y0) && childAt2.getTag() != null && ((Integer) childAt2.getTag()).intValue() == 10) {
                            org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) childAt2;
                            if (TextUtils.isEmpty(groupCallParticipant2.about)) {
                                i13 = 2131743516;
                            } else {
                                i13 = 2131743426;
                            }
                            String M03 = org.telegram.messenger.bd.M0(i13, null);
                            if (TextUtils.isEmpty(groupCallParticipant2.about)) {
                                i14 = 2131232043;
                            } else {
                                i14 = 2131232185;
                            }
                            y0Var.j(M03, i14, null);
                        }
                        i18++;
                    }
                }
            }
        } else if (i3 == org.telegram.messenger.hs.f23314u1) {
            if (((Long) objArr[0]).longValue() == k1()) {
                L1();
                Q1(isShowing(), false);
            }
        } else if (i3 == org.telegram.messenger.hs.B2) {
            int childCount2 = f30Var.getChildCount();
            long longValue2 = ((Long) objArr[0]).longValue();
            while (i18 < childCount2) {
                u4.d1 G = f30Var.G(f30Var.getChildAt(i18));
                if (G != null) {
                    View view = G.f55540a;
                    if (view instanceof org.telegram.ui.Cells.f4) {
                        org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
                        if (f4Var.getParticipant() != null) {
                            f4Var.getParticipant().lastVisibleDate = longValue2;
                        }
                    }
                }
                i18++;
            }
        } else if (i3 == org.telegram.messenger.hs.E0) {
            Long l12 = (Long) objArr[0];
            long C12 = org.telegram.messenger.zi.C1(this.f51792s2);
            if (this.S2 != null && C12 == l12.longValue() && (groupCallParticipant = (TLRPC.GroupCallParticipant) this.S2.d.f(C12)) != null) {
                groupCallParticipant.about = ((TLRPC.UserFull) objArr[1]).about;
                Q0(true);
                org.telegram.messenger.g0.b4(f30Var);
                if (this.f51813w4 != null) {
                    while (i18 < this.f51813w4.getChildCount()) {
                        View childAt3 = this.f51813w4.getChildAt(i18);
                        if ((childAt3 instanceof org.telegram.ui.ActionBar.y0) && childAt3.getTag() != null && ((Integer) childAt3.getTag()).intValue() == 10) {
                            org.telegram.ui.ActionBar.y0 y0Var2 = (org.telegram.ui.ActionBar.y0) childAt3;
                            if (TextUtils.isEmpty(groupCallParticipant.about)) {
                                i11 = 2131743517;
                            } else {
                                i11 = 2131743427;
                            }
                            String M04 = org.telegram.messenger.bd.M0(i11, null);
                            if (TextUtils.isEmpty(groupCallParticipant.about)) {
                                i12 = 2131232043;
                            } else {
                                i12 = 2131232185;
                            }
                            y0Var2.j(M04, i12, null);
                        }
                        i18++;
                    }
                }
            }
        } else if (i3 == org.telegram.messenger.hs.f23248j0) {
            Q0(true);
            org.telegram.messenger.g0.b4(f30Var);
        } else if (i3 == org.telegram.messenger.hs.f23292r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i23 = org.telegram.messenger.hp.C8;
            int i24 = intValue & 16;
            if (i24 != 0) {
                Q0(true);
            }
            if (i24 != 0 || (intValue & 524288) != 0) {
                org.telegram.messenger.g0.b4(f30Var);
            }
        } else if (i3 == org.telegram.messenger.hs.f23349z2) {
            o20 o20Var = this.f51788r2;
            if (o20Var != null) {
                o20Var.b(true, true);
            }
            L1();
        } else if (i3 == org.telegram.messenger.hs.R3) {
            VoIPService sharedInstance2 = VoIPService.getSharedInstance();
            g.b bVar = this.f51743h2;
            if (sharedInstance2 != null && (conferenceCall = sharedInstance2.conference) != null) {
                strArr = conferenceCall.getEmojis();
            }
            bVar.b(strArr);
        }
    }

    @Override
    public final void dismiss() {
        LaunchActivity launchActivity = this.f51716a2;
        launchActivity.f41288c1.remove(this.n4);
        this.f51716a2.setRequestedOrientation(-1);
        f51712w5 = false;
        org.telegram.ui.Components.d20 d20Var = this.f51812w3;
        if (d20Var != null) {
            d20Var.dismiss();
        }
        this.f51755k2 = true;
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.F2, new Object[0]);
        org.telegram.messenger.c cVar = this.f51759l1;
        int i3 = cVar.f21919a;
        int i10 = cVar.f21919a;
        org.telegram.messenger.hs.f(i3).n(this, org.telegram.messenger.hs.M0);
        org.telegram.messenger.hs.f(i10).n(this, org.telegram.messenger.hs.f23328w2);
        org.telegram.messenger.hs.f(i10).n(this, org.telegram.messenger.hs.T);
        org.telegram.messenger.hs.f(i10).n(this, org.telegram.messenger.hs.f23314u1);
        org.telegram.messenger.hs.f(i10).n(this, org.telegram.messenger.hs.B2);
        org.telegram.messenger.hs.f(i10).n(this, org.telegram.messenger.hs.E0);
        org.telegram.messenger.hs.f(i10).n(this, org.telegram.messenger.hs.f23248j0);
        org.telegram.messenger.hs.f(i10).n(this, org.telegram.messenger.hs.f23292r);
        org.telegram.messenger.hs.f(i10).n(this, org.telegram.messenger.hs.f23349z2);
        org.telegram.messenger.hs.f(i10).n(this, org.telegram.messenger.hs.f23342y2);
        org.telegram.messenger.hs.f(i10).n(this, org.telegram.messenger.hs.R3);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.N4);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.D2);
        super.dismiss();
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i3;
        if (this.f51716a2 == null) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0 && ((keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25) && VoIPService.getSharedInstance() != null && Build.VERSION.SDK_INT >= 32)) {
            boolean isSpeakerMuted = WebRtcAudioTrack.isSpeakerMuted();
            AudioManager audioManager = (AudioManager) this.f51716a2.getSystemService("audio");
            boolean z10 = false;
            if (audioManager.getStreamVolume(0) == audioManager.getStreamMinVolume(0) && keyEvent.getKeyCode() == 25) {
                z10 = true;
            }
            WebRtcAudioTrack.setSpeakerMute(z10);
            if (isSpeakerMuted != WebRtcAudioTrack.isSpeakerMuted()) {
                UndoView m1 = m1();
                if (z10) {
                    i3 = 42;
                } else {
                    i3 = 43;
                }
                m1.j(i3, 0L, null);
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void f1(boolean z10) {
        if (!this.U4 && this.X3) {
            if (z10) {
                this.U4 = true;
                A1(false, this.P4);
                return;
            }
            d1();
            this.f28586b.removeView(this.W3);
            this.W3 = null;
            this.f51804u4.setVisibility(8);
            this.f28586b.invalidate();
            this.X3 = false;
            this.Q1.X = true;
            this.I1.invalidate();
            this.T3.setVisibility(8);
            if (this.f51755k2) {
                this.f51755k2 = false;
                Q0(true);
            }
            U0();
        }
    }

    public final void g1(org.telegram.messenger.s3 s3Var) {
        org.telegram.messenger.s3 s3Var2;
        if (s3Var == null) {
            this.f51716a2.setRequestedOrientation(-1);
        }
        if (VoIPService.getSharedInstance() != null) {
            u10 u10Var = this.S3;
            if (u10Var.f39690r != null) {
                return;
            }
            boolean z10 = f51714y5;
            f30 f30Var = this.I1;
            int i3 = 0;
            if (z10) {
                if (this.f51748i4 != null) {
                    f30Var.getViewTreeObserver().removeOnPreDrawListener(this.f51748i4);
                    this.f51748i4 = null;
                }
                ArrayList arrayList = new ArrayList();
                a40 a40Var = this.f51741g4;
                ArrayList arrayList2 = this.Q3;
                ArrayList arrayList3 = this.R3;
                if (s3Var == null) {
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                        org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) arrayList3.get(i10);
                        org.telegram.ui.Components.voip.k kVar = rVar.f39550c;
                        if (kVar != null) {
                            kVar.setRenderer(null);
                            org.telegram.ui.Components.d10 d10Var = rVar.d;
                            if (d10Var != null) {
                                d10Var.setRenderer(null);
                            }
                            org.telegram.ui.Components.voip.k kVar2 = rVar.f39553e;
                            if (kVar2 != null) {
                                kVar2.setRenderer(null);
                            }
                            arrayList.add(rVar.f39577x);
                            rVar.b(false);
                            rVar.animate().alpha(0.0f).setListener(new p20(this, rVar, 0));
                        }
                    }
                    this.H4 = false;
                    a40Var.H(this.f51737f4, true, true);
                } else {
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        org.telegram.ui.Components.voip.r rVar2 = (org.telegram.ui.Components.voip.r) arrayList3.get(i11);
                        if (rVar2.f39553e != null && ((s3Var2 = rVar2.f39577x) == null || !s3Var2.equals(s3Var))) {
                            arrayList.add(rVar2.f39577x);
                            rVar2.b(false);
                            org.telegram.ui.Components.d10 d10Var2 = rVar2.d;
                            if (d10Var2 != null) {
                                d10Var2.setRenderer(null);
                            }
                            org.telegram.ui.Components.voip.k kVar3 = rVar2.f39550c;
                            if (kVar3 != null) {
                                kVar3.setRenderer(null);
                            }
                            rVar2.animate().alpha(0.0f).setListener(new p20(this, rVar2, 1));
                        }
                    }
                    this.H4 = true;
                    a40Var.f43592r = false;
                    if (!arrayList.isEmpty()) {
                        org.telegram.messenger.g0.h3(new ly(3, this, arrayList));
                    }
                }
                ViewTreeObserver viewTreeObserver = f30Var.getViewTreeObserver();
                hh hhVar = new hh(this, s3Var, !u10Var.f39670b);
                this.f51748i4 = hhVar;
                viewTreeObserver.addOnPreDrawListener(hhVar);
                return;
            }
            if (this.f51748i4 != null) {
                f30Var.getViewTreeObserver().removeOnPreDrawListener(this.f51748i4);
                this.f51748i4 = null;
            }
            if (s3Var != null) {
                q10 q10Var = this.f51733e4;
                if (q10Var.getVisibility() != 0) {
                    q10Var.setVisibility(0);
                    org.telegram.ui.Components.e10 e10Var = this.f51745h4;
                    e10Var.G(q10Var, false);
                    this.f51755k2 = true;
                    if (!u10Var.f39670b) {
                        ArrayList arrayList4 = e10Var.f33265e;
                        u4.b0 b0Var = (u4.b0) q10Var.getLayoutManager();
                        if (b0Var != null) {
                            while (true) {
                                if (i3 >= arrayList4.size()) {
                                    break;
                                } else if (((org.telegram.messenger.s3) arrayList4.get(i3)).equals(s3Var)) {
                                    b0Var.h1(i3, org.telegram.messenger.g0.L(13.0f));
                                    break;
                                } else {
                                    i3++;
                                }
                            }
                        }
                    }
                    ViewTreeObserver viewTreeObserver2 = f30Var.getViewTreeObserver();
                    hw hwVar = new hw(1, this, s3Var);
                    this.f51748i4 = hwVar;
                    viewTreeObserver2.addOnPreDrawListener(hwVar);
                    return;
                }
                u10Var.j(s3Var);
                org.telegram.messenger.g0.b4(q10Var);
            } else if (f30Var.getVisibility() != 0) {
                f30Var.setVisibility(0);
                Q0(false);
                this.f51755k2 = true;
                ViewTreeObserver viewTreeObserver3 = f30Var.getViewTreeObserver();
                r20 r20Var = new r20(this, 0);
                this.f51748i4 = r20Var;
                viewTreeObserver3.addOnPreDrawListener(r20Var);
            } else {
                ViewTreeObserver viewTreeObserver4 = f30Var.getViewTreeObserver();
                r20 r20Var2 = new r20(this, 1);
                this.f51748i4 = r20Var2;
                viewTreeObserver4.addOnPreDrawListener(r20Var2);
            }
        }
    }

    public final int j1() {
        Integer num = this.f51786q5;
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

    public final long k1() {
        TLRPC.Chat chat = this.R2;
        if (chat == null) {
            return 0L;
        }
        return chat.f27001id;
    }

    public final void l1(boolean z10) {
        boolean z11;
        String str;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        org.telegram.messenger.c cVar = this.f51759l1;
        int i3 = cVar.f21919a;
        int i10 = cVar.f21919a;
        TLRPC.Chat M0 = org.telegram.messenger.hp.s1(i3).M0(Long.valueOf(k1()));
        if (M0 != null && !org.telegram.messenger.t3.t0(M0)) {
            TLRPC.ChatFull N0 = org.telegram.messenger.hp.s1(i10).N0(k1());
            String K = org.telegram.messenger.t3.K(this.R2, false);
            if (!TextUtils.isEmpty(K)) {
                str = org.telegram.ui.Cells.f1.r(org.telegram.messenger.hp.s1(i10).V2, "/", K, new StringBuilder());
            } else if (N0 != null && (tL_chatInviteExported = N0.exported_invite) != null) {
                str = tL_chatInviteExported.link;
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                tL_messages_exportChatInvite.peer = org.telegram.messenger.hp.l1(this.R2);
                ConnectionsManager.getInstance(i10).sendRequest(tL_messages_exportChatInvite, new ci.t8(this, N0, z10, 6));
                return;
            }
            w1(null, str, true, z10);
        } else if (this.S2 != null) {
            for (int i11 = 0; i11 < 2; i11++) {
                TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                org.telegram.messenger.r3 r3Var = this.S2;
                exportgroupcallinvite.call = r3Var.g(r3Var.f25048a);
                if (i11 == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                exportgroupcallinvite.can_self_unmute = z11;
                ConnectionsManager.getInstance(i10).sendRequest(exportgroupcallinvite, new org.telegram.messenger.vc(this, i11, z10, 2));
            }
        }
    }

    @Override
    public final boolean m0() {
        f51712w5 = true;
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.F2, new Object[0]);
        org.telegram.ui.Components.l10.j(getContext());
        return false;
    }

    public final UndoView m1() {
        if (!f51714y5) {
            u10 u10Var = this.S3;
            if (u10Var.f39670b) {
                return u10Var.getUndoView();
            }
        }
        UndoView[] undoViewArr = this.f51720b2;
        if (undoViewArr[0].getVisibility() == 0) {
            UndoView undoView = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView;
            undoView.d(2, true);
            this.f28586b.removeView(undoViewArr[0]);
            this.f28586b.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final void n1() {
        VoIPService sharedInstance;
        int i3;
        TLRPC.GroupCallParticipant groupCallParticipant;
        if (!this.f51764m2 && (sharedInstance = VoIPService.getSharedInstance()) != null) {
            this.f51764m2 = true;
            this.f51807v2.addAll(this.S2.f25053g);
            this.f51811w2.addAll(this.f51747i2);
            this.f51815x2.addAll(this.S2.f25055j);
            this.f51819y2.addAll(this.S2.f25058m);
            this.f51823z2.addAll(this.S2.f25057l);
            this.L3 = sharedInstance.getCallState();
            if (this.S2 == null) {
                org.telegram.messenger.r3 r3Var = sharedInstance.groupCall;
                this.S2 = r3Var;
                this.f51745h4.f33264c = r3Var;
                this.S3.setGroupCall(r3Var);
                this.f51741g4.f43588c = this.S2;
            }
            oh.h hVar = this.U1;
            if (hVar != null) {
                hVar.D0(this.f51759l1.f21919a, this.S2.g(false));
            }
            this.G1.setTitleRightMargin(org.telegram.messenger.g0.L(48.0f) * 2);
            ArrayList arrayList = this.S2.f25051e;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((TLRPC.GroupCallParticipant) arrayList.get(i10)).lastActiveDate = groupCallParticipant.active_date;
            }
            VoIPService.getSharedInstance().registerStateListener(this);
            e30 e30Var = this.N1;
            if (e30Var != null && e30Var.getVisibility() == 0) {
                this.f51787r1.c(2131230918, -1, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28150rh, false), 0.3f, false, org.telegram.messenger.bd.M0(2131743374, null), false, true);
                P1(true);
                if (org.telegram.messenger.t3.W(this.R2)) {
                    i3 = 2131743491;
                } else {
                    i3 = 2131743390;
                }
                this.f51774o3.setText(org.telegram.messenger.bd.M0(i3, null));
                f30 f30Var = this.I1;
                f30Var.setVisibility(0);
                org.telegram.ui.ActionBar.q0 q0Var = this.f51728d3;
                q0Var.setVisibility(0);
                AnimatorSet animatorSet = new AnimatorSet();
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(f30Var, property, 0.0f, 1.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(f30Var, View.TRANSLATION_Y, org.telegram.messenger.g0.L(200.0f), 0.0f);
                Property property2 = View.SCALE_X;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(e30Var, property2, 0.0f);
                Property property3 = View.SCALE_Y;
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(e30Var, property3, 0.0f);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(e30Var, property, 0.0f);
                org.telegram.ui.ActionBar.k5 k5Var = this.M1;
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(k5Var, property2, 0.0f);
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(k5Var, property3, 0.0f);
                ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(k5Var, property, 0.0f);
                org.telegram.ui.ActionBar.k5 k5Var2 = this.O1;
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(k5Var2, property2, 0.0f), ObjectAnimator.ofFloat(k5Var2, property3, 0.0f), ObjectAnimator.ofFloat(k5Var2, property, 0.0f), ObjectAnimator.ofFloat(q0Var, property2, 0.0f, 1.0f), ObjectAnimator.ofFloat(q0Var, property3, 0.0f, 1.0f), ObjectAnimator.ofFloat(q0Var, property, 0.0f, 1.0f));
                animatorSet.setInterpolator(org.telegram.ui.Components.xq.f40453g);
                animatorSet.addListener(new s20(this, 0));
                animatorSet.setDuration(300L);
                animatorSet.start();
            }
        }
    }

    public final void o1(final long j10, final boolean z10) {
        if (this.S2 != null) {
            org.telegram.messenger.c cVar = this.f51759l1;
            final TLRPC.User a22 = org.telegram.messenger.hp.s1(cVar.f21919a).a2(Long.valueOf(j10));
            if (a22 != null) {
                final org.telegram.ui.ActionBar.s1[] s1VarArr = {new org.telegram.ui.ActionBar.s1(3, getContext(), null)};
                final TL_phone.inviteToGroupCall invitetogroupcall = new TL_phone.inviteToGroupCall();
                org.telegram.messenger.r3 r3Var = this.S2;
                invitetogroupcall.call = r3Var.g(r3Var.f25048a);
                TLRPC.TL_inputUser tL_inputUser = new TLRPC.TL_inputUser();
                tL_inputUser.user_id = a22.f27150id;
                tL_inputUser.access_hash = a22.access_hash;
                invitetogroupcall.users.add(tL_inputUser);
                int sendRequest = ConnectionsManager.getInstance(cVar.f21919a).sendRequest(invitetogroupcall, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        x30 x30Var = x30.this;
                        long j11 = j10;
                        org.telegram.ui.ActionBar.s1[] s1VarArr2 = s1VarArr;
                        if (tLObject != null) {
                            org.telegram.messenger.hp.s1(x30Var.f51759l1.f21919a).O3((TLRPC.Updates) tLObject, false);
                            org.telegram.messenger.g0.h3(new ci.l2(x30Var, j11, s1VarArr2, a22, 20));
                            return;
                        }
                        org.telegram.messenger.g0.h3(new ci.n(x30Var, s1VarArr2, z10, tL_error, j11, invitetogroupcall));
                    }
                });
                if (sendRequest != 0) {
                    org.telegram.messenger.g0.i3(new rw(this, s1VarArr, sendRequest, 1), 500L);
                }
            }
        }
    }

    @Override
    public final void onAudioSettingsChanged() {
        P1(true);
        if (VoIPService.getSharedInstance() == null || VoIPService.getSharedInstance().isMicMute()) {
            E1(0.0f);
        }
        f30 f30Var = this.I1;
        if (f30Var.getVisibility() == 0) {
            org.telegram.messenger.g0.b4(f30Var);
        }
        q10 q10Var = this.f51733e4;
        if (q10Var.getVisibility() == 0) {
            org.telegram.messenger.g0.b4(q10Var);
        }
        ArrayList arrayList = this.R3;
        arrayList.clear();
        arrayList.addAll(this.Q3);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((org.telegram.ui.Components.voip.r) arrayList.get(i3)).j(true);
        }
    }

    @Override
    public final void onBackPressed() {
        o20 o20Var = this.f51788r2;
        if (o20Var != null) {
            o20Var.b(false, false);
        } else if (this.X3) {
            f1(true);
        } else if (this.S3.f39670b) {
            g1(null);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.s0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
        ArrayList arrayList = this.R3;
        arrayList.clear();
        arrayList.addAll(this.Q3);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((org.telegram.ui.Components.voip.r) arrayList.get(i3)).j(true);
        }
        o20 o20Var = this.f51788r2;
        if (o20Var != null && VoIPService.getSharedInstance() != null) {
            o20Var.h.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LaunchActivity launchActivity = this.f51716a2;
        launchActivity.f41288c1.add(this.n4);
    }

    @Override
    public final void onMediaStateUpdated(int i3, int i10) {
        org.telegram.messenger.voip.s0.d(this, i3, i10);
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.s0.e(this, z10);
    }

    @Override
    public final void onSignalBarsCountChanged(int i3) {
        org.telegram.messenger.voip.s0.f(this, i3);
    }

    @Override
    public final void onStateChanged(int i3) {
        this.L3 = i3;
        Q1(isShowing(), false);
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.s0.h(this, z10);
    }

    public final boolean p1() {
        float f10;
        int L = org.telegram.messenger.g0.L(74.0f);
        float f11 = this.f51783q2 - L;
        if (this.f28617t0 + f11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
            f10 = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - f11) - this.f28617t0) / ((L - this.f28617t0) - org.telegram.messenger.g0.L(14.0f)));
        } else {
            f10 = 0.0f;
        }
        if (f10 > 0.5f) {
            return true;
        }
        return false;
    }

    public final boolean q1() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.isConference()) {
            return true;
        }
        return false;
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            RadialProgressView radialProgressView = this.W1;
            if (radialProgressView != null) {
                radialProgressView.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ch, false));
            }
            org.telegram.ui.ActionBar.q0 q0Var = this.f51724c3;
            if (q0Var != null) {
                int i3 = org.telegram.ui.ActionBar.k6.Vg;
                q0Var.O(org.telegram.ui.ActionBar.k6.x0(null, i3, false), false);
                q0Var.O(org.telegram.ui.ActionBar.k6.x0(null, i3, false), true);
                q0Var.setPopupItemsSelectorColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Sg, false));
            }
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Vg, false);
            H1(this.f51779p3, x02);
            H1(this.f51784q3, x02);
            H1(this.f51744h3, x02);
            H1(this.i3, x02);
            H1(this.f51774o3, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27999jh, false));
            H1(this.f51736f3, x02);
            H1(this.f51740g3, x02);
            H1(this.f51752j3, x02);
            H1(this.f51756k3, x02);
            H1(this.f51761l3, x02);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final boolean s1() {
        if (!t1() || this.S2.f25052f.isEmpty() || (((org.telegram.messenger.s3) this.S2.f25052f.get(0)).f25272c != 0.0f && ((org.telegram.messenger.s3) this.S2.f25052f.get(0)).f25272c < 1.0f)) {
            return false;
        }
        return true;
    }

    @Override
    public final void show() {
        super.show();
        if (org.telegram.ui.Components.voip.s0.f39589e0.W) {
            org.telegram.ui.Components.voip.s0.b();
        }
    }

    public final boolean t1() {
        org.telegram.messenger.r3 r3Var = this.S2;
        if (r3Var != null && r3Var.f25049b.rtmp_stream) {
            return true;
        }
        return false;
    }

    public final void u1(org.telegram.ui.ActionBar.t2 t2Var, org.telegram.ui.ActionBar.s1 s1Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
        long j10;
        if (!this.f51773o2) {
            org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.f51716a2.M().getFragmentStack().get(this.f51716a2.M().getFragmentStack().size() - 1);
            if (d2Var instanceof wm) {
                boolean pa2 = ((wm) d2Var).pa();
                this.f51773o2 = true;
                this.f51778p2 = true;
                rn rnVar = new rn(t2Var, editTextBoldCursor, z10, s1Var, 7);
                if (pa2) {
                    j10 = 200;
                } else {
                    j10 = 0;
                }
                org.telegram.messenger.g0.i3(rnVar, j10);
                return;
            }
            this.f51773o2 = true;
            this.f51778p2 = true;
            if (t2Var != null) {
                t2Var.A0(true);
            } else if (s1Var != null) {
                s1Var.l(true);
            }
            if (z10) {
                org.telegram.messenger.g0.i3(new og(editTextBoldCursor, 2), 100L);
            }
        }
    }

    public final void w1(java.lang.String r11, java.lang.String r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.x30.w1(java.lang.String, java.lang.String, boolean, boolean):void");
    }

    public final void x1() {
        org.telegram.messenger.r3 r3Var = this.S2;
        if (r3Var != null && r3Var.f25049b != null) {
            org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, getContext(), null);
            s1Var.r(300L);
            TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
            exportgroupcallinvite.call = tL_inputGroupCall;
            TLRPC.GroupCall groupCall = this.S2.f25049b;
            tL_inputGroupCall.f27018id = groupCall.f27011id;
            tL_inputGroupCall.access_hash = groupCall.access_hash;
            ConnectionsManager.getInstance(this.f28583a).sendRequest(exportgroupcallinvite, new y9(this, s1Var, exportgroupcallinvite, 12));
        }
    }

    public final void z1(TLRPC.GroupCallParticipant groupCallParticipant, final long j10, int i3) {
        TLObject M0;
        int i10;
        int i11;
        String str;
        int i12;
        String str2;
        int i13;
        int i14;
        int i15;
        ?? r14;
        TextView textView;
        VoIPService voIPService;
        int i16;
        int i17;
        String str3;
        String str4;
        ?? r142;
        int i18;
        int i19;
        int i20;
        String str5;
        int i21;
        EditText editText;
        int i22;
        String str6;
        float f10;
        String M02;
        int i23;
        ?? r22;
        org.telegram.ui.ActionBar.s1 s1Var;
        String M03;
        int i24;
        int i25;
        int i26;
        int L;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            int i27 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            org.telegram.messenger.c cVar = this.f51759l1;
            if (i27 > 0) {
                M0 = org.telegram.messenger.hp.s1(cVar.f21919a).a2(Long.valueOf(j10));
            } else {
                M0 = org.telegram.messenger.hp.s1(cVar.f21919a).M0(Long.valueOf(-j10));
            }
            TLObject tLObject = M0;
            boolean z10 = true;
            if (i3 != 0 && i3 != 2 && i3 != 3) {
                if (i3 == 6) {
                    this.f51716a2.O0(this.f28583a);
                    Bundle bundle = new Bundle();
                    if (i27 > 0) {
                        bundle.putLong("user_id", j10);
                    } else {
                        bundle.putLong("chat_id", -j10);
                    }
                    this.f51716a2.t0(new wm(bundle));
                    dismiss();
                } else if (i3 == 8) {
                    this.f51716a2.O0(this.f28583a);
                    org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.f51716a2.M().getFragmentStack().get(this.f51716a2.M().getFragmentStack().size() - 1);
                    if ((d2Var instanceof wm) && ((wm) d2Var).a() == j10) {
                        dismiss();
                        return;
                    }
                    Bundle bundle2 = new Bundle();
                    if (i27 > 0) {
                        bundle2.putLong("user_id", j10);
                    } else {
                        bundle2.putLong("chat_id", -j10);
                    }
                    this.f51716a2.t0(new wm(bundle2));
                    dismiss();
                } else if (i3 == 7) {
                    sharedInstance.editCallMember(tLObject, Boolean.TRUE, null, null, Boolean.FALSE, null);
                    M1(2, true);
                } else if (i3 == 9) {
                    org.telegram.ui.Components.f30 f30Var = this.Z3;
                    if (f30Var == null || !f30Var.g()) {
                        TLRPC.User f11 = org.telegram.messenger.h10.i(cVar.f21919a).f();
                        org.telegram.ui.Components.f30 f30Var2 = new org.telegram.ui.Components.f30(0, true, true);
                        this.Z3 = f30Var2;
                        f30Var2.I = true;
                        f30Var2.S = true;
                        f30Var2.H = true;
                        f30Var2.K = true;
                        f30Var2.T = true;
                        f30Var2.f33681a = this.f51716a2.M().getLastFragment();
                        org.telegram.ui.Components.f30 f30Var3 = this.Z3;
                        g30 g30Var = new g30(this, j10);
                        this.f51718a4 = g30Var;
                        f30Var3.f33682b = g30Var;
                        TLRPC.UserProfilePhoto userProfilePhoto = f11.photo;
                        if (userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                            z10 = false;
                        }
                        f30Var3.n(z10, new p00(this, 9), new gi.d1(5), 0);
                    }
                } else if (i3 == 10) {
                    String str7 = groupCallParticipant.about;
                    Context context = getContext();
                    int i28 = this.f28583a;
                    Pattern pattern = org.telegram.ui.Components.t4.f38241a;
                    ?? alertDialog$Builder = new AlertDialog$Builder(context);
                    if (i27 > 0) {
                        str6 = null;
                        f10 = 8.0f;
                        M02 = org.telegram.messenger.bd.M0(2131743775, null);
                    } else {
                        str6 = null;
                        f10 = 8.0f;
                        M02 = org.telegram.messenger.bd.M0(2131751460, null);
                    }
                    String str8 = M02;
                    org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder.f27343a;
                    s1Var2.S = str8;
                    if (i27 > 0) {
                        i23 = 2131743406;
                    } else {
                        i23 = 2131751463;
                    }
                    s1Var2.U = org.telegram.messenger.bd.M0(i23, str6);
                    FrameLayout frameLayout = new FrameLayout(context);
                    frameLayout.setClipChildren(false);
                    if (i27 < 0) {
                        s1Var = s1Var2;
                        long j11 = -j10;
                        r22 = false;
                        if (org.telegram.messenger.hp.s1(i28).N0(j11) == null) {
                            org.telegram.messenger.hp.s1(i28).V2(ConnectionsManager.generateClassGuid(), j11, true);
                            r22 = false;
                        }
                    } else {
                        r22 = 0;
                        s1Var = s1Var2;
                    }
                    NumberTextView numberTextView = new NumberTextView(context);
                    EditText editText2 = new EditText(context);
                    int i29 = org.telegram.ui.ActionBar.k6.Vg;
                    org.telegram.ui.ActionBar.r6.V(editText2, i29, null);
                    if (i27 > 0) {
                        M03 = org.telegram.messenger.bd.M0(2131743775, null);
                    } else {
                        M03 = org.telegram.messenger.bd.M0(2131751460, null);
                    }
                    editText2.setHint(M03);
                    editText2.setTextSize(1, 16.0f);
                    editText2.setBackground(org.telegram.ui.ActionBar.k6.U(context));
                    editText2.setMaxLines(4);
                    editText2.setRawInputType(147457);
                    editText2.setImeOptions(6);
                    if (i27 > 0) {
                        i24 = 70;
                    } else {
                        i24 = 255;
                    }
                    org.telegram.ui.Components.k3 k3Var = new org.telegram.ui.Components.k3(i24, context, numberTextView);
                    InputFilter[] inputFilterArr = new InputFilter[1];
                    inputFilterArr[r22] = k3Var;
                    editText2.setFilters(inputFilterArr);
                    numberTextView.setCenterAlign(true);
                    numberTextView.setTextSize(15);
                    numberTextView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.B6, r22));
                    numberTextView.setImportantForAccessibility(2);
                    if (org.telegram.messenger.bd.f21784a0) {
                        i25 = 3;
                    } else {
                        i25 = 5;
                    }
                    frameLayout.addView(numberTextView, b8.mf.d(20, 20.0f, i25, 0.0f, 14.0f, 21.0f, 0.0f));
                    if (org.telegram.messenger.bd.f21784a0) {
                        i26 = org.telegram.messenger.g0.L(24.0f);
                    } else {
                        i26 = 0;
                    }
                    int L2 = org.telegram.messenger.g0.L(f10);
                    if (org.telegram.messenger.bd.f21784a0) {
                        L = 0;
                    } else {
                        L = org.telegram.messenger.g0.L(24.0f);
                    }
                    editText2.setPadding(i26, L2, L, org.telegram.messenger.g0.L(f10));
                    editText2.addTextChangedListener(new org.telegram.ui.Components.sp(i24, numberTextView));
                    org.telegram.messenger.g0.Z3(numberTextView, false, 0.0f, true, false);
                    editText2.setText(str7);
                    editText2.setSelection(editText2.getText().toString().length());
                    alertDialog$Builder.o(frameLayout);
                    final b4.o oVar = new b4.o(j10, i28, editText2, 5);
                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131745956, null), oVar);
                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                    final org.telegram.ui.ActionBar.s1 s1Var3 = s1Var;
                    s1Var3.O = new org.telegram.ui.Components.h1(editText2, 1);
                    frameLayout.addView(editText2, b8.mf.d(-1, -2.0f, 0, 23.0f, 12.0f, 23.0f, 21.0f));
                    editText2.requestFocus();
                    org.telegram.messenger.g0.K3(editText2);
                    editText2.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                        @Override
                        public final boolean onEditorAction(TextView textView2, int i30, KeyEvent keyEvent) {
                            if (i30 == 6 || (j10 > 0 && keyEvent.getKeyCode() == 66)) {
                                org.telegram.ui.ActionBar.s1 s1Var4 = s1Var3;
                                if (s1Var4.isShowing()) {
                                    oVar.g(s1Var4, 0);
                                    return true;
                                }
                            }
                            return false;
                        }
                    });
                    s1Var3.j(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27980ih, false));
                    s1Var3.show();
                    s1Var3.p(org.telegram.ui.ActionBar.k6.x0(null, i29, false));
                } else if (i3 == 11) {
                    Context context2 = getContext();
                    int i30 = this.f28583a;
                    Pattern pattern2 = org.telegram.ui.Components.t4.f38241a;
                    if (org.telegram.messenger.m5.E(j10)) {
                        TLRPC.User a22 = org.telegram.messenger.hp.s1(i30).a2(Long.valueOf(j10));
                        str3 = a22.first_name;
                        str4 = a22.last_name;
                    } else {
                        str3 = org.telegram.messenger.hp.s1(i30).M0(Long.valueOf(-j10)).title;
                        str4 = null;
                    }
                    ?? alertDialog$Builder2 = new AlertDialog$Builder(context2);
                    if (i27 > 0) {
                        i18 = 2131743425;
                        r142 = 0;
                    } else {
                        r142 = 0;
                        i18 = 2131743424;
                    }
                    String M04 = org.telegram.messenger.bd.M0(i18, r142);
                    org.telegram.ui.ActionBar.s1 s1Var4 = alertDialog$Builder2.f27343a;
                    s1Var4.S = M04;
                    LinearLayout f12 = org.telegram.messenger.k5.f(context2, 1);
                    EditText editText3 = new EditText(context2);
                    int i31 = org.telegram.ui.ActionBar.k6.Vg;
                    org.telegram.ui.ActionBar.r6.V(editText3, i31, r142);
                    editText3.setTextSize(1, 16.0f);
                    editText3.setMaxLines(1);
                    editText3.setLines(1);
                    editText3.setSingleLine(true);
                    if (org.telegram.messenger.bd.f21784a0) {
                        i19 = 5;
                    } else {
                        i19 = 3;
                    }
                    editText3.setGravity(i19);
                    editText3.setInputType(49152);
                    if (i27 > 0) {
                        i20 = 5;
                    } else {
                        i20 = 6;
                    }
                    editText3.setImeOptions(i20);
                    if (i27 > 0) {
                        i21 = 2131750695;
                        str5 = null;
                    } else {
                        str5 = null;
                        i21 = 2131743423;
                    }
                    editText3.setHint(org.telegram.messenger.bd.M0(i21, str5));
                    editText3.setBackground(org.telegram.ui.ActionBar.k6.U(context2));
                    editText3.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
                    editText3.requestFocus();
                    if (i27 > 0) {
                        editText = new EditText(context2);
                        org.telegram.ui.ActionBar.r6.V(editText, i31, null);
                        editText.setTextSize(1, 16.0f);
                        editText.setMaxLines(1);
                        editText.setLines(1);
                        editText.setSingleLine(true);
                        if (org.telegram.messenger.bd.f21784a0) {
                            i22 = 5;
                        } else {
                            i22 = 3;
                        }
                        editText.setGravity(i22);
                        editText.setInputType(49152);
                        editText.setImeOptions(6);
                        editText.setHint(org.telegram.messenger.bd.M0(2131749040, null));
                        editText.setBackground(org.telegram.ui.ActionBar.k6.U(context2));
                        editText.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
                    } else {
                        editText = null;
                    }
                    org.telegram.messenger.g0.K3(editText3);
                    f12.addView(editText3, b8.mf.t(-1, -2, 0, 23, 12, 23, 21));
                    if (editText != null) {
                        f12.addView(editText, b8.mf.t(-1, -2, 0, 23, 12, 23, 21));
                    }
                    editText3.setText(str3);
                    editText3.setSelection(editText3.getText().toString().length());
                    if (editText != null) {
                        editText.setText(str4);
                        editText.setSelection(editText.getText().toString().length());
                    }
                    alertDialog$Builder2.o(f12);
                    ii.o1 o1Var = new ii.o1(editText3, j10, i30, editText);
                    alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131745956, null), o1Var);
                    alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                    s1Var4.O = new ci.h3(7, editText3, editText);
                    s1Var4.j(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27980ih, false));
                    s1Var4.show();
                    s1Var4.p(org.telegram.ui.ActionBar.k6.x0(null, i31, false));
                    ld ldVar = new ld(1, s1Var4, o1Var);
                    if (editText != null) {
                        editText.setOnEditorActionListener(ldVar);
                    } else {
                        editText3.setOnEditorActionListener(ldVar);
                    }
                } else if (i3 == 5) {
                    sharedInstance.editCallMember(tLObject, Boolean.TRUE, null, null, null, null);
                    m1().m(0L, tLObject, 35);
                    sharedInstance.setParticipantVolume(groupCallParticipant, 0);
                } else {
                    if ((groupCallParticipant.flags & 128) != 0 && groupCallParticipant.volume == 0) {
                        groupCallParticipant.volume = 10000;
                        groupCallParticipant.volume_by_admin = false;
                        voIPService = sharedInstance;
                        i16 = 1;
                        voIPService.editCallMember(tLObject, Boolean.FALSE, null, 10000, null, null);
                    } else {
                        voIPService = sharedInstance;
                        i16 = 1;
                        voIPService.editCallMember(tLObject, Boolean.FALSE, null, null, null, null);
                    }
                    voIPService.setParticipantVolume(groupCallParticipant, org.telegram.messenger.t3.H(groupCallParticipant));
                    UndoView m1 = m1();
                    if (i3 == i16) {
                        i17 = 31;
                    } else {
                        i17 = 36;
                    }
                    m1.k(0L, i17, tLObject, null, null, null);
                }
            } else if (i3 == 0) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().editCallMember(tLObject, Boolean.TRUE, null, null, null, null);
                    m1().k(0L, 30, tLObject, null, null, null);
                }
            } else {
                ?? alertDialog$Builder3 = new AlertDialog$Builder(getContext());
                int i32 = org.telegram.ui.ActionBar.k6.f27889dh;
                org.telegram.ui.ActionBar.s1 s1Var5 = alertDialog$Builder3.f27343a;
                s1Var5.J = i32;
                TextView textView2 = new TextView(getContext());
                int i33 = org.telegram.ui.ActionBar.k6.Vg;
                org.telegram.ui.ActionBar.r6.V(textView2, i33, null);
                textView2.setTextSize(1, 16.0f);
                if (org.telegram.messenger.bd.f21784a0) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView2.setGravity(i10 | 48);
                ?? frameLayout2 = new FrameLayout(getContext());
                alertDialog$Builder3.o(frameLayout2);
                org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
                u8Var.u(org.telegram.messenger.g0.L(12.0f));
                org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(getContext());
                k9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
                if (org.telegram.messenger.bd.f21784a0) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                frameLayout2.addView(k9Var, b8.mf.d(40, 40.0f, i11 | 48, 22.0f, 5.0f, 22.0f, 0.0f));
                u8Var.p(tLObject);
                boolean z11 = tLObject instanceof TLRPC.User;
                if (z11) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    k9Var.e(user, u8Var);
                    str = org.telegram.messenger.l10.j(user, true);
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    k9Var.e(chat, u8Var);
                    str = chat.title;
                }
                TextView textView3 = new TextView(getContext());
                org.telegram.messenger.k5.n(textView3, i33, null, 1, 20.0f);
                textView3.setLines(1);
                textView3.setMaxLines(1);
                textView3.setSingleLine(true);
                if (org.telegram.messenger.bd.f21784a0) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                textView3.setGravity(i12 | 16);
                textView3.setEllipsize(TextUtils.TruncateAt.END);
                TLRPC.Chat chat2 = this.R2;
                if (chat2 != null) {
                    str2 = chat2.title;
                } else {
                    str2 = "";
                }
                if (i3 == 2) {
                    if (q1()) {
                        textView3.setText(org.telegram.messenger.bd.M0(2131743431, null));
                        org.telegram.messenger.k5.r(null, null, 2131743432, new Object[]{str}, textView2);
                    } else {
                        textView3.setText(org.telegram.messenger.bd.M0(2131743355, null));
                        if (org.telegram.messenger.t3.W(this.R2)) {
                            org.telegram.messenger.k5.r(null, null, 2131743474, new Object[]{str, str2}, textView2);
                        } else {
                            org.telegram.messenger.k5.r(null, null, 2131743356, new Object[]{str, str2}, textView2);
                        }
                    }
                } else {
                    textView3.setText(org.telegram.messenger.bd.M0(2131743412, null));
                    org.telegram.messenger.k5.r(null, null, 2131743413, new Object[]{str, str2}, textView2);
                }
                boolean z12 = org.telegram.messenger.bd.f21784a0;
                if (z12) {
                    i13 = 5;
                } else {
                    i13 = 3;
                }
                int i34 = i13 | 48;
                int i35 = 76;
                if (z12) {
                    i14 = 21;
                } else {
                    i14 = 76;
                }
                float f13 = i14;
                if (!z12) {
                    i35 = 21;
                }
                frameLayout2.addView(textView3, b8.mf.d(-1, -2.0f, i34, f13, 11.0f, i35, 0.0f));
                if (org.telegram.messenger.bd.f21784a0) {
                    i15 = 5;
                } else {
                    i15 = 3;
                }
                frameLayout2.addView(textView2, b8.mf.d(-2, -2.0f, i15 | 48, 24.0f, 57.0f, 24.0f, 9.0f));
                if (i3 == 2) {
                    r14 = 0;
                    alertDialog$Builder3.k(org.telegram.messenger.bd.M0(2131743321, null), new org.telegram.ui.Components.i41(15, this, tLObject));
                } else {
                    r14 = 0;
                    r14 = 0;
                    if (z11) {
                        alertDialog$Builder3.k(org.telegram.messenger.bd.M0(2131743414, null), new ci.i(this, (TLRPC.User) tLObject, j10, 6));
                    }
                }
                alertDialog$Builder3.h(org.telegram.messenger.bd.M0(2131752589, r14), r14);
                s1Var5.j(org.telegram.ui.ActionBar.k6.x0(r14, org.telegram.ui.ActionBar.k6.f27980ih, false));
                s1Var5.show();
                if (i3 == 2 && (textView = (TextView) s1Var5.d(-1)) != null) {
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27999jh, r14);
                }
            }
        }
    }

    @Override
    public final void F(float f10, int i3) {
    }
}
