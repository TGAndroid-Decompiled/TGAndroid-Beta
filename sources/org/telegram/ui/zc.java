package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public class zc extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.vs {
    public TLRPC.EmojiStatus D;
    public TLRPC.WallPaper E;
    public TLRPC.WallPaper F;
    public TLRPC.WallPaper G;
    public Drawable H;
    public SpannableStringBuilder I;
    public boolean J;
    public org.telegram.ui.Components.ci0 K;
    public org.telegram.ui.ActionBar.t0 L;
    public org.telegram.ui.Components.uk0 M;
    public lc N;
    public FrameLayout O;
    public vh.d P;
    public hc Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public final long f43889a;
    public int f43890a0;
    public int f43891b;
    public int f43892b0;
    public TL_stories.TL_premium_boostsStatus f43893c;
    public int f43894c0;
    public boolean d;
    public int f43895d0;
    public int e;
    public int f43896e0;
    public int f43897f;
    public int f43898f0;
    public int f43899g0;
    public long h;
    public int f43900h0;
    public int f43901i0;
    public int f43902j0;
    public int f43903k0;
    public org.telegram.ui.ActionBar.k2 f43904l0;
    public ic m0;
    public long f43905n;
    public float f43906n0;
    public ValueAnimator f43907o0;
    public boolean f43908p0;
    public org.telegram.ui.ActionBar.p6 f43909q0;
    public int f43910r;
    public final SparseIntArray f43911r0;
    public int f43912s;
    public final org.telegram.ui.ActionBar.c5 f43913s0;
    public final org.telegram.ui.ActionBar.c5 f43914t0;
    public final org.telegram.ui.ActionBar.c5 f43915u0;
    public final org.telegram.ui.ActionBar.c5 f43916v0;
    public long f43917w;
    public final Drawable f43918w0;
    public long f43919x;
    public final Drawable f43920x0;
    public TLRPC.EmojiStatus f43921y;
    public final Paint f43922y0;

    public zc(long j10) {
        super(null);
        boolean q6 = org.telegram.ui.ActionBar.t6.I.q();
        this.J = q6;
        this.R = 0;
        this.f43908p0 = q6;
        this.f43911r0 = new SparseIntArray();
        Paint paint = new Paint(1);
        this.f43922y0 = paint;
        paint.setStrokeWidth(1.0f);
        paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20931d7, this.resourceProvider));
        this.f43918w0 = org.telegram.messenger.w0.f18945b.getDrawable(2131232090).mutate();
        this.f43920x0 = org.telegram.messenger.w0.f18945b.getDrawable(2131232176).mutate();
        this.f43889a = j10;
        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-j10));
        if (L0 != null) {
            this.f43891b = L0.level;
        }
        org.telegram.messenger.wp.r1(this.currentAccount).G0().a(j10, new ag.e0(13, this, L0));
        this.resourceProvider = new yc(this);
        this.f43913s0 = new org.telegram.ui.ActionBar.c5(0, false, false, this.resourceProvider);
        this.f43914t0 = new org.telegram.ui.ActionBar.c5(0, false, true, this.resourceProvider);
        this.f43915u0 = new org.telegram.ui.ActionBar.c5(0, true, false, this.resourceProvider);
        this.f43916v0 = new org.telegram.ui.ActionBar.c5(0, true, true, this.resourceProvider);
    }

    public static void Z(zc zcVar) {
        org.telegram.ui.ActionBar.p6 p6Var = zcVar.resourceProvider;
        if (p6Var instanceof yc) {
            zc zcVar2 = ((yc) p6Var).f43636a;
            zcVar2.J = !zcVar2.J;
            zcVar2.k1();
            zcVar2.g1(false);
        } else {
            zcVar.J = !zcVar.J;
            zcVar.k1();
        }
        zcVar.b1(zcVar.J, true);
        zcVar.g1(false);
        org.telegram.ui.ActionBar.t6.Am++;
    }

    public static void a0(org.telegram.ui.zc r13, org.telegram.messenger.h3 r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zc.a0(org.telegram.ui.zc, org.telegram.messenger.h3):void");
    }

    public static void b0(org.telegram.ui.zc r22, org.telegram.tgnet.TLRPC.ChatFull r23, android.view.View r24, int r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zc.b0(org.telegram.ui.zc, org.telegram.tgnet.TLRPC$ChatFull, android.view.View, int):void");
    }

    public static void f1(View view) {
        if (view instanceof mc) {
            ((mc) view).updateColors();
        } else if (view instanceof org.telegram.ui.Cells.p8) {
            ((org.telegram.ui.Cells.p8) view).updateColors();
        } else if (view instanceof qc) {
            ((qc) view).updateColors();
        } else if (view instanceof xc) {
            ((xc) view).updateColors();
        }
    }

    public final void B0() {
        int themedColor;
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar == null) {
            return;
        }
        int i10 = -1;
        if (this.d && this.f43912s != -1) {
            themedColor = -1;
        } else {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.A8);
        }
        lVar.setTitleColor(themedColor);
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        if (!this.d || this.f43912s == -1) {
            i10 = getThemedColor(org.telegram.ui.ActionBar.t6.f21262v8);
        }
        lVar2.D(i10, false);
    }

    public void C0() {
        B0();
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null) {
            lVar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.t6.f21207s8));
        }
        org.telegram.ui.Components.uk0 uk0Var = this.M;
        if (uk0Var != null && this.d) {
            uk0Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.t6.f20873a7));
        }
        FrameLayout frameLayout = this.O;
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.t6.f20873a7));
        }
    }

    public final void D0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zc.D0():void");
    }

    public void E0() {
        org.telegram.ui.Components.uk0 uk0Var = new org.telegram.ui.Components.uk0(getParentActivity(), this.resourceProvider);
        this.M = uk0Var;
        uk0Var.setSections(false);
    }

    public final View F0(int i10) {
        for (int i11 = 0; i11 < this.M.getChildCount(); i11++) {
            View childAt = this.M.getChildAt(i11);
            this.M.getClass();
            if (RecyclerView.R(childAt) == i10) {
                return childAt;
            }
        }
        return null;
    }

    public int G0() {
        return getMessagesController().f19269v5;
    }

    public int H0() {
        return 0;
    }

    public int I0() {
        return 0;
    }

    public final TLRPC.Document J0(TLRPC.StickerSet stickerSet) {
        if (stickerSet != null && stickerSet.thumb_document_id == 0) {
            TLRPC.TL_messages_stickerSet Y = getMediaDataController().Y(stickerSet);
            if (!Y.documents.isEmpty()) {
                return Y.documents.get(0);
            }
        }
        return null;
    }

    public final long K0(TLRPC.StickerSet stickerSet) {
        if (stickerSet == null) {
            return 0L;
        }
        long j10 = stickerSet.thumb_document_id;
        if (j10 == 0) {
            TLRPC.TL_messages_stickerSet Y = getMediaDataController().Y(stickerSet);
            if (!Y.documents.isEmpty()) {
                return Y.documents.get(0).f19800id;
            }
        }
        return j10;
    }

    public int L0() {
        return 2131752412;
    }

    public int M0() {
        return getMessagesController().f19251t5;
    }

    public int N0() {
        return 2131752413;
    }

    public int O0() {
        return 0;
    }

    public int P0() {
        return 3;
    }

    public int Q0() {
        return getMessagesController().f19242s5;
    }

    public int R0() {
        return 2131752320;
    }

    public int S0() {
        return 0;
    }

    public int T0() {
        return 0;
    }

    public int U0() {
        return 2131752263;
    }

    public int V0() {
        return getMessagesController().f19260u5;
    }

    public int W0() {
        return 2131752264;
    }

    public final boolean X0() {
        if (this.e == this.f43897f && this.h == this.f43905n && this.f43910r == this.f43912s && this.f43917w == this.f43919x && org.telegram.messenger.o5.a(this.f43921y, this.D) && org.telegram.messenger.g4.v(this.E, this.F)) {
            return false;
        }
        return true;
    }

    public boolean Y0() {
        return false;
    }

    public final int Z0() {
        org.telegram.messenger.lp d;
        org.telegram.messenger.lp lpVar = null;
        int i10 = 0;
        if (this.e != this.f43897f) {
            org.telegram.messenger.mp mpVar = getMessagesController().f19231r4;
            if (mpVar == null) {
                d = null;
            } else {
                d = mpVar.d(this.f43897f);
            }
            if (d != null) {
                i10 = Math.max(0, d.l(this.d));
            }
        }
        if (this.h != this.f43905n) {
            i10 = Math.max(i10, getMessagesController().f19232r5);
        }
        if (this.f43910r != this.f43912s) {
            org.telegram.messenger.mp mpVar2 = getMessagesController().f19241s4;
            if (mpVar2 != null) {
                lpVar = mpVar2.d(this.f43912s);
            }
            if (lpVar != null) {
                i10 = Math.max(i10, lpVar.l(this.d));
            }
        }
        if (this.f43917w != this.f43919x) {
            i10 = Math.max(i10, Q0());
        }
        if (!org.telegram.messenger.o5.a(this.f43921y, this.D)) {
            i10 = Math.max(i10, M0());
        }
        if (!org.telegram.messenger.g4.v(this.E, this.F)) {
            return Math.max(i10, V0());
        }
        return i10;
    }

    public final void b1(boolean z10, boolean z11) {
        int i10;
        if (this.f43908p0 != z10) {
            this.f43908p0 = z10;
            int i11 = 0;
            if (z11) {
                org.telegram.ui.Components.ci0 ci0Var = this.K;
                if (z10) {
                    i11 = ci0Var.e[0];
                }
                ci0Var.P(i11);
                org.telegram.ui.Components.ci0 ci0Var2 = this.K;
                if (ci0Var2 != null) {
                    ci0Var2.start();
                    return;
                }
                return;
            }
            if (z10) {
                i10 = this.K.e[0] - 1;
            } else {
                i10 = 0;
            }
            this.K.N(i10, false, true);
            this.K.P(i10);
            org.telegram.ui.ActionBar.t0 t0Var = this.L;
            if (t0Var != null) {
                t0Var.invalidate();
            }
        }
    }

    public final void c1() {
        if (getVisibleDialog() != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
        String L0 = org.telegram.messenger.dd.L0(2131752426, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.dd.L0(2131752425, null);
        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131751370, null), new org.telegram.ui.ActionBar.u1(this) {
            public final zc f36791b;

            {
                this.f36791b = this;
            }

            @Override
            public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i10) {
                switch (r2) {
                    case 0:
                        this.f36791b.finishFragment();
                        return;
                    default:
                        this.f36791b.D0();
                        return;
                }
            }
        });
        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131754216, null), new org.telegram.ui.ActionBar.u1(this) {
            public final zc f36791b;

            {
                this.f36791b = this;
            }

            @Override
            public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i10) {
                switch (r2) {
                    case 0:
                        this.f36791b.finishFragment();
                        return;
                    default:
                        this.f36791b.D0();
                        return;
                }
            }
        });
        showDialog(x1Var);
        org.telegram.ui.ActionBar.a7.V((TextView) x1Var.d(-2), org.telegram.ui.ActionBar.t6.f21171q7, getResourceProvider());
    }

    @Override
    public View createView(Context context) {
        org.telegram.ui.ActionBar.t0 d;
        float f7;
        org.telegram.messenger.wp messagesController = getMessagesController();
        long j10 = -this.f43889a;
        TLRPC.Chat L0 = messagesController.L0(Long.valueOf(j10));
        if (L0 != null) {
            int F = org.telegram.messenger.w3.F(L0);
            this.f43897f = F;
            this.e = F;
            long G = org.telegram.messenger.w3.G(L0);
            this.f43905n = G;
            this.h = G;
            int I = org.telegram.messenger.w3.I(L0);
            this.f43912s = I;
            this.f43910r = I;
            long J = org.telegram.messenger.w3.J(L0);
            this.f43919x = J;
            this.f43917w = J;
            TLRPC.EmojiStatus emojiStatus = L0.emoji_status;
            this.D = emojiStatus;
            this.f43921y = emojiStatus;
        }
        TLRPC.ChatFull M0 = getMessagesController().M0(j10);
        if (M0 != null) {
            TLRPC.WallPaper wallPaper = M0.wallpaper;
            this.F = wallPaper;
            this.E = wallPaper;
            String j11 = org.telegram.messenger.g4.j(wallPaper);
            if (j11 != null && j11.length() == 0) {
                this.G = this.E;
            }
        }
        ag.e eVar = new ag.e(this, 23);
        org.telegram.ui.ActionBar.i5 i5Var = this.simpleActionBar;
        if (i5Var != null) {
            i5Var.setBackButtonImage(2131231241);
            this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131752427, null));
            this.simpleActionBar.setActionBarMenuOnItemClick(eVar);
        } else {
            this.actionBar.setBackButtonImage(2131231241);
            this.actionBar.setTitle(org.telegram.messenger.dd.L0(2131752427, null));
            this.actionBar.setActionBarMenuOnItemClick(eVar);
        }
        org.telegram.ui.Components.ci0 ci0Var = new org.telegram.ui.Components.ci0(2131624238, org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(28.0f), true, null);
        this.K = ci0Var;
        ci0Var.h = true;
        if (!this.J) {
            ci0Var.P(0);
            this.K.M(0);
        } else {
            ci0Var.M(35);
            this.K.P(36);
        }
        this.K.Z = true;
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.J9, this.resourceProvider);
        this.K.Q(w02, "Sunny");
        this.K.Q(w02, "Path 6");
        this.K.Q(w02, "Path");
        this.K.Q(w02, "Path 5");
        org.telegram.ui.ActionBar.i5 i5Var2 = this.simpleActionBar;
        if (i5Var2 != null) {
            org.telegram.ui.ActionBar.o5 o10 = i5Var2.o();
            org.telegram.ui.Components.ci0 ci0Var2 = this.K;
            o10.getClass();
            d = o10.c(1, 0, null, ci0Var2, org.telegram.messenger.i0.L(48.0f), null);
        } else {
            d = this.actionBar.p().d(1, this.K);
        }
        this.L = d;
        FrameLayout frameLayout = new FrameLayout(context);
        j1();
        E0();
        if (!this.d) {
            setHasOwnBackground(true);
            this.M.setSectionsDrawBackground(true);
        } else {
            this.M.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.t6.f20873a7));
        }
        org.telegram.ui.Components.uk0 uk0Var = this.M;
        lc lcVar = new lc(this);
        this.N = lcVar;
        uk0Var.setAdapter(lcVar);
        new s4.r(3);
        this.M.setLayoutManager(new s4.a0());
        org.telegram.ui.Components.uk0 uk0Var2 = this.M;
        if (this.d) {
            f7 = 68.0f;
        } else {
            f7 = 0.0f;
        }
        frameLayout.addView(uk0Var2, w7.b6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, f7));
        this.M.setOnItemClickListener(new mg.q0(3, this, M0));
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(org.telegram.ui.Components.gr.h);
        jVar.C = false;
        jVar.f47938m = false;
        this.M.setItemAnimator(jVar);
        vh.d dVar = new vh.d(context, this.resourceProvider, true);
        dVar.setRoundRadius(24);
        this.P = dVar;
        dVar.i(org.telegram.messenger.dd.L0(2131754218, null), false, true);
        this.P.setOnClickListener(new a(this, 11));
        e1(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.O = frameLayout2;
        if (this.d) {
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20873a7, frameLayout2, getResourceProvider());
        } else {
            frameLayout2.setBackground(getBaseSimpleGlass().b(this.O));
        }
        this.O.addView(this.P, w7.b6.d(-1, 48.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
        frameLayout.addView(this.O, w7.b6.e(-1, 68, 80));
        setBulletinDelegate(new z8(this, 1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d1(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        if (tL_premium_boostsStatus != null) {
            TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-this.f43889a));
            this.f43893c = tL_premium_boostsStatus;
            int i10 = tL_premium_boostsStatus.level;
            this.f43891b = i10;
            if (L0 != null) {
                L0.level = i10;
            }
            lc lcVar = this.N;
            if (lcVar != null) {
                lcVar.f();
            }
            e1(true);
        }
    }

    public void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = org.telegram.messenger.at.f14764p3;
        long j10 = this.f43889a;
        if (i10 == i12) {
            if (j10 == ((Long) objArr[2]).longValue()) {
                d1((TL_stories.TL_premium_boostsStatus) objArr[0]);
            }
        } else if (i10 == org.telegram.messenger.at.V2) {
            if (!((Boolean) objArr[1]).booleanValue()) {
                getMessagesController().G0().a(j10, new cc(this, 2));
            }
        } else if (i10 == org.telegram.messenger.at.f14822y1 && j10 == ((Long) objArr[0]).longValue()) {
            org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
            if (z4Var != null && z4Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    public void e1(boolean z10) {
        if (this.P != null && this.f43893c != null) {
            int Z0 = Z0();
            if (this.f43891b >= Z0) {
                this.P.g(null, z10);
                return;
            }
            if (this.I == null) {
                this.I = new SpannableStringBuilder("l");
                org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(2131231975, 0);
                dqVar.f25567n = 1;
                this.I.setSpan(dqVar, 0, 1, 33);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.I).append((CharSequence) org.telegram.messenger.dd.G(Z0, "BoostLevelRequired", new Object[0]));
            this.P.g(spannableStringBuilder, z10);
        }
    }

    public void g1(boolean z10) {
        int themedColor;
        org.telegram.ui.ActionBar.i5 i5Var = this.simpleActionBar;
        if (i5Var != null) {
            i5Var.updateColors();
        } else {
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            int i10 = -1;
            if (this.d && this.f43912s != -1) {
                themedColor = -1;
            } else {
                themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.A8);
            }
            lVar.setTitleColor(themedColor);
            org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
            if (!this.d || this.f43912s == -1) {
                i10 = getThemedColor(org.telegram.ui.ActionBar.t6.f21262v8);
            }
            lVar2.D(i10, false);
            this.actionBar.C(getThemedColor(org.telegram.ui.ActionBar.t6.f21226t8), false);
        }
        if (!z10) {
            this.N.f();
            org.telegram.messenger.i0.d0(this.M, new ag.z0(this));
            if (this.d) {
                this.O.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.t6.f20873a7));
            }
            this.P.updateColors();
            setNavigationBarColor(getNavigationBarColor());
        }
    }

    @Override
    public final org.telegram.ui.Components.uk0 getListViewForSimpleGlass() {
        if (!this.d) {
            return this.M;
        }
        return null;
    }

    public final void h1(boolean z10) {
        org.telegram.messenger.kj messageObject;
        View F0 = F0(this.S);
        View F02 = F0(this.T);
        View F03 = F0(this.U);
        View F04 = F0(this.W);
        if (F0 instanceof org.telegram.ui.Cells.z9) {
            org.telegram.ui.Cells.z9 z9Var = (org.telegram.ui.Cells.z9) F0;
            org.telegram.ui.Cells.q1[] cells = z9Var.getCells();
            for (int i10 = 0; i10 < cells.length; i10++) {
                org.telegram.ui.Cells.q1 q1Var = cells[i10];
                if (q1Var != null && (messageObject = q1Var.getMessageObject()) != null) {
                    messageObject.f16658c1 = this.f43897f;
                    messageObject.f16662d1 = this.f43905n;
                    cells[i10].setAvatar(messageObject);
                    cells[i10].invalidate();
                }
            }
            Drawable f7 = vh.k4.f(this.H, this.currentAccount, this.F, this.J);
            this.H = f7;
            z9Var.setOverrideBackground(f7);
        }
        if (F02 instanceof on0) {
            ((on0) F02).a(this.f43897f, z10);
        } else if (F02 instanceof qc) {
            ((qc) F02).a(this.f43897f, z10);
        }
        if (F03 instanceof mc) {
            mc mcVar = (mc) F03;
            mcVar.a(this.currentAccount, this.f43897f, true);
            mcVar.c(this.f43905n, false, z10);
        }
        if (F04 instanceof xc) {
            xc xcVar = (xc) F04;
            String j10 = org.telegram.messenger.g4.j(this.F);
            if (j10 == null && this.F == null && this.G != null) {
                j10 = "❌";
            }
            xcVar.a(j10, z10);
            xcVar.setGalleryWallpaper(this.G);
        }
    }

    public final void i1() {
        TLRPC.StickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        View F0 = F0(this.Z);
        View F02 = F0(this.f43892b0);
        View F03 = F0(this.f43894c0);
        View F04 = F0(this.f43898f0);
        View F05 = F0(this.f43900h0);
        View F06 = F0(this.f43902j0);
        if (F0 instanceof sc) {
            TLRPC.EmojiStatus emojiStatus = this.D;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                sc scVar = (sc) F0;
                rc rcVar = scVar.f41338b;
                org.telegram.messenger.lp a2 = org.telegram.messenger.lp.a(emojiStatus);
                rcVar.c(a2, true);
                scVar.f41337a.c(a2, true);
                rcVar.d(((TLRPC.TL_emojiStatusCollectible) this.D).pattern_document_id, true, true);
            } else {
                sc scVar2 = (sc) F0;
                rc rcVar2 = scVar2.f41338b;
                int i10 = this.f43912s;
                rcVar2.b(i10, true);
                scVar2.f41337a.b(scVar2.h.currentAccount, i10, true);
                rcVar2.d(this.f43919x, false, true);
            }
            sc scVar3 = (sc) F0;
            rc rcVar3 = scVar3.f41338b;
            rcVar3.e(org.telegram.messenger.o5.f(this.D), false, true);
            rcVar3.a(this.f43897f);
            scVar3.updateColors();
        }
        if (F02 instanceof on0) {
            ((on0) F02).a(this.f43912s, true);
        } else if (F02 instanceof qc) {
            ((qc) F02).a(this.f43897f, true);
        }
        if (F03 instanceof mc) {
            mc mcVar = (mc) F03;
            mcVar.a(this.currentAccount, this.f43912s, false);
            mcVar.c(this.f43919x, false, true);
        }
        if (F04 instanceof mc) {
            TLRPC.EmojiStatus emojiStatus2 = this.D;
            if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                ((mc) F04).b(org.telegram.messenger.lp.a(emojiStatus2));
            } else {
                ((mc) F04).a(this.currentAccount, this.f43912s, false);
            }
            ((mc) F04).c(org.telegram.messenger.o5.f(this.D), org.telegram.messenger.o5.B(this.D), true);
        }
        boolean z10 = F05 instanceof mc;
        long j10 = this.f43889a;
        if (z10) {
            mc mcVar2 = (mc) F05;
            mcVar2.a(this.currentAccount, this.f43912s, false);
            TLRPC.ChatFull M0 = getMessagesController().M0(-j10);
            if (M0 != null && (stickerSet2 = M0.emojiset) != null) {
                mcVar2.c(K0(stickerSet2), false, false);
            } else {
                mcVar2.c(0L, false, false);
            }
        }
        if (F06 instanceof mc) {
            TLRPC.ChatFull M02 = getMessagesController().M0(-j10);
            if (M02 != null && (stickerSet = M02.stickerset) != null) {
                ((mc) F06).d(J0(stickerSet));
            } else {
                ((mc) F06).c(0L, false, false);
            }
        }
        j1();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return !this.d;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (X0() && this.f43891b >= Z0()) {
            return false;
        }
        return true;
    }

    public void j1() {
        lc lcVar;
        lc lcVar2;
        boolean z10 = false;
        this.S = 0;
        int i10 = 1 + 1;
        this.T = 1;
        this.U = i10;
        this.V = i10 + 1;
        this.W = i10 + 2;
        this.X = i10 + 3;
        this.Y = i10 + 4;
        this.Z = i10 + 5;
        this.f43892b0 = i10 + 6;
        int i11 = i10 + 8;
        this.R = i11;
        this.f43894c0 = i10 + 7;
        if (this.f43919x == 0 && this.f43912s < 0 && !(this.D instanceof TLRPC.TL_emojiStatusCollectible)) {
            int i12 = this.f43896e0;
            this.f43896e0 = -1;
            if (i12 >= 0 && (lcVar2 = this.N) != null) {
                lcVar2.s(i12);
                this.N.g(this.f43894c0);
            }
        } else {
            if (this.f43896e0 >= 0) {
                z10 = true;
            }
            this.R = i10 + 9;
            this.f43896e0 = i11;
            if (!z10 && (lcVar = this.N) != null) {
                lcVar.i(i11);
                this.N.g(this.f43894c0);
            }
        }
        int i13 = this.R;
        this.f43895d0 = i13;
        this.f43898f0 = i13 + 1;
        this.R = i13 + 3;
        this.f43899g0 = i13 + 2;
    }

    public final void k1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zc.k1():void");
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.f43891b >= Z0() && X0()) {
            if (z10) {
                c1();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public boolean onFragmentCreate() {
        getMediaDataController().Y0();
        getNotificationCenter().c(this, org.telegram.messenger.at.V2);
        getNotificationCenter().c(this, org.telegram.messenger.at.f14764p3);
        getNotificationCenter().c(this, org.telegram.messenger.at.f14822y1);
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.at.V2);
        getNotificationCenter().n(this, org.telegram.messenger.at.f14764p3);
        getNotificationCenter().n(this, org.telegram.messenger.at.f14822y1);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        if (!this.d && this.O != null) {
            int L = org.telegram.messenger.i0.L(68.0f) + i13;
            ViewGroup.LayoutParams layoutParams = this.O.getLayoutParams();
            if (layoutParams.height != L) {
                layoutParams.height = L;
                this.O.setLayoutParams(layoutParams);
            }
            if (this.O.getPaddingLeft() != i10 || this.O.getPaddingRight() != i12 || this.O.getPaddingBottom() != i13) {
                this.O.setPadding(i10, 0, i12, i13);
            }
            ei.b.e(this.M, i11, i13, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), org.telegram.messenger.i0.L(68.0f));
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            C0();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        i0.c cVar = this.mSystemInsets;
        onInsets(cVar.f7766a, cVar.f7767b, cVar.f7768c, cVar.d);
    }

    @Override
    public final void setResourceProvider(org.telegram.ui.ActionBar.p6 p6Var) {
        this.f43909q0 = p6Var;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return !this.d;
    }

    public void a1(int i10) {
    }
}
