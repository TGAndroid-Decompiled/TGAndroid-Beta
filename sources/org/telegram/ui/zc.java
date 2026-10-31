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
public class zc extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
    public TLRPC.EmojiStatus D;
    public TLRPC.WallPaper E;
    public TLRPC.WallPaper F;
    public TLRPC.WallPaper G;
    public Drawable H;
    public SpannableStringBuilder I;
    public boolean J;
    public org.telegram.ui.Components.bi0 K;
    public org.telegram.ui.ActionBar.t0 L;
    public org.telegram.ui.Components.tk0 M;
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
    public final long f44086a;
    public int f44087a0;
    public int f44088b;
    public int f44089b0;
    public TL_stories.TL_premium_boostsStatus f44090c;
    public int f44091c0;
    public boolean d;
    public int f44092d0;
    public int e;
    public int f44093e0;
    public int f44094f;
    public int f44095f0;
    public int f44096g0;
    public long h;
    public int f44097h0;
    public int f44098i0;
    public int f44099j0;
    public int f44100k0;
    public org.telegram.ui.ActionBar.k2 f44101l0;
    public ic m0;
    public long f44102n;
    public float f44103n0;
    public ValueAnimator f44104o0;
    public boolean f44105p0;
    public org.telegram.ui.ActionBar.p6 f44106q0;
    public int f44107r;
    public final SparseIntArray f44108r0;
    public int f44109s;
    public final org.telegram.ui.ActionBar.c5 f44110s0;
    public final org.telegram.ui.ActionBar.c5 f44111t0;
    public final org.telegram.ui.ActionBar.c5 f44112u0;
    public final org.telegram.ui.ActionBar.c5 f44113v0;
    public long f44114w;
    public final Drawable f44115w0;
    public long f44116x;
    public final Drawable f44117x0;
    public TLRPC.EmojiStatus f44118y;
    public final Paint f44119y0;

    public zc(long j10) {
        super(null);
        boolean q6 = org.telegram.ui.ActionBar.t6.I.q();
        this.J = q6;
        this.R = 0;
        this.f44105p0 = q6;
        this.f44108r0 = new SparseIntArray();
        Paint paint = new Paint(1);
        this.f44119y0 = paint;
        paint.setStrokeWidth(1.0f);
        paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20930d7, this.resourceProvider));
        this.f44115w0 = org.telegram.messenger.w0.f19025b.getDrawable(2131232090).mutate();
        this.f44117x0 = org.telegram.messenger.w0.f19025b.getDrawable(2131232176).mutate();
        this.f44086a = j10;
        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-j10));
        if (L0 != null) {
            this.f44088b = L0.level;
        }
        org.telegram.messenger.vp.r1(this.currentAccount).G0().a(j10, new ag.e0(13, this, L0));
        this.resourceProvider = new yc(this);
        this.f44110s0 = new org.telegram.ui.ActionBar.c5(0, false, false, this.resourceProvider);
        this.f44111t0 = new org.telegram.ui.ActionBar.c5(0, false, true, this.resourceProvider);
        this.f44112u0 = new org.telegram.ui.ActionBar.c5(0, true, false, this.resourceProvider);
        this.f44113v0 = new org.telegram.ui.ActionBar.c5(0, true, true, this.resourceProvider);
    }

    public static void Y(zc zcVar) {
        org.telegram.ui.ActionBar.p6 p6Var = zcVar.resourceProvider;
        if (p6Var instanceof yc) {
            zc zcVar2 = ((yc) p6Var).f43817a;
            zcVar2.J = !zcVar2.J;
            zcVar2.j1();
            zcVar2.f1(false);
        } else {
            zcVar.J = !zcVar.J;
            zcVar.j1();
        }
        zcVar.a1(zcVar.J, true);
        zcVar.f1(false);
        org.telegram.ui.ActionBar.t6.Am++;
    }

    public static void Z(org.telegram.ui.zc r13, org.telegram.messenger.h3 r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zc.Z(org.telegram.ui.zc, org.telegram.messenger.h3):void");
    }

    public static void a0(org.telegram.ui.zc r22, org.telegram.tgnet.TLRPC.ChatFull r23, android.view.View r24, int r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zc.a0(org.telegram.ui.zc, org.telegram.tgnet.TLRPC$ChatFull, android.view.View, int):void");
    }

    public static void e1(View view) {
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

    public final void A0() {
        int themedColor;
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar == null) {
            return;
        }
        int i10 = -1;
        if (this.d && this.f44109s != -1) {
            themedColor = -1;
        } else {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.A8);
        }
        lVar.setTitleColor(themedColor);
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        if (!this.d || this.f44109s == -1) {
            i10 = getThemedColor(org.telegram.ui.ActionBar.t6.f21261v8);
        }
        lVar2.D(i10, false);
    }

    public void B0() {
        A0();
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null) {
            lVar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.t6.f21206s8));
        }
        org.telegram.ui.Components.tk0 tk0Var = this.M;
        if (tk0Var != null && this.d) {
            tk0Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.t6.f20872a7));
        }
        FrameLayout frameLayout = this.O;
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.t6.f20872a7));
        }
    }

    public final void C0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zc.C0():void");
    }

    public void D0() {
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(getParentActivity(), this.resourceProvider);
        this.M = tk0Var;
        tk0Var.setSections(false);
    }

    public final View E0(int i10) {
        for (int i11 = 0; i11 < this.M.getChildCount(); i11++) {
            View childAt = this.M.getChildAt(i11);
            this.M.getClass();
            if (RecyclerView.R(childAt) == i10) {
                return childAt;
            }
        }
        return null;
    }

    public int F0() {
        return getMessagesController().f18926v5;
    }

    public int G0() {
        return 0;
    }

    public int H0() {
        return 0;
    }

    public final TLRPC.Document I0(TLRPC.StickerSet stickerSet) {
        if (stickerSet != null && stickerSet.thumb_document_id == 0) {
            TLRPC.TL_messages_stickerSet Y = getMediaDataController().Y(stickerSet);
            if (!Y.documents.isEmpty()) {
                return Y.documents.get(0);
            }
        }
        return null;
    }

    public final long J0(TLRPC.StickerSet stickerSet) {
        if (stickerSet == null) {
            return 0L;
        }
        long j10 = stickerSet.thumb_document_id;
        if (j10 == 0) {
            TLRPC.TL_messages_stickerSet Y = getMediaDataController().Y(stickerSet);
            if (!Y.documents.isEmpty()) {
                return Y.documents.get(0).f19799id;
            }
        }
        return j10;
    }

    public int K0() {
        return 2131752412;
    }

    public int L0() {
        return getMessagesController().f18908t5;
    }

    public int M0() {
        return 2131752413;
    }

    public int N0() {
        return 0;
    }

    public int O0() {
        return 3;
    }

    public int P0() {
        return getMessagesController().f18899s5;
    }

    public int Q0() {
        return 2131752320;
    }

    public int R0() {
        return 0;
    }

    public int S0() {
        return 0;
    }

    public int T0() {
        return 2131752263;
    }

    public int U0() {
        return getMessagesController().f18917u5;
    }

    public int V0() {
        return 2131752264;
    }

    public final boolean W0() {
        if (this.e == this.f44094f && this.h == this.f44102n && this.f44107r == this.f44109s && this.f44114w == this.f44116x && org.telegram.messenger.o5.a(this.f44118y, this.D) && org.telegram.messenger.g4.v(this.E, this.F)) {
            return false;
        }
        return true;
    }

    public boolean X0() {
        return false;
    }

    public final int Y0() {
        org.telegram.messenger.kp d;
        org.telegram.messenger.kp kpVar = null;
        int i10 = 0;
        if (this.e != this.f44094f) {
            org.telegram.messenger.lp lpVar = getMessagesController().f18888r4;
            if (lpVar == null) {
                d = null;
            } else {
                d = lpVar.d(this.f44094f);
            }
            if (d != null) {
                i10 = Math.max(0, d.l(this.d));
            }
        }
        if (this.h != this.f44102n) {
            i10 = Math.max(i10, getMessagesController().f18889r5);
        }
        if (this.f44107r != this.f44109s) {
            org.telegram.messenger.lp lpVar2 = getMessagesController().f18898s4;
            if (lpVar2 != null) {
                kpVar = lpVar2.d(this.f44109s);
            }
            if (kpVar != null) {
                i10 = Math.max(i10, kpVar.l(this.d));
            }
        }
        if (this.f44114w != this.f44116x) {
            i10 = Math.max(i10, P0());
        }
        if (!org.telegram.messenger.o5.a(this.f44118y, this.D)) {
            i10 = Math.max(i10, L0());
        }
        if (!org.telegram.messenger.g4.v(this.E, this.F)) {
            return Math.max(i10, U0());
        }
        return i10;
    }

    public final void a1(boolean z10, boolean z11) {
        int i10;
        if (this.f44105p0 != z10) {
            this.f44105p0 = z10;
            int i11 = 0;
            if (z11) {
                org.telegram.ui.Components.bi0 bi0Var = this.K;
                if (z10) {
                    i11 = bi0Var.e[0];
                }
                bi0Var.P(i11);
                org.telegram.ui.Components.bi0 bi0Var2 = this.K;
                if (bi0Var2 != null) {
                    bi0Var2.start();
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

    public final void b1() {
        if (getVisibleDialog() != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
        String L0 = org.telegram.messenger.cd.L0(2131752426, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.cd.L0(2131752425, null);
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131751370, null), new org.telegram.ui.ActionBar.u1(this) {
            public final zc f37012b;

            {
                this.f37012b = this;
            }

            @Override
            public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i10) {
                switch (r2) {
                    case 0:
                        this.f37012b.finishFragment();
                        return;
                    default:
                        this.f37012b.C0();
                        return;
                }
            }
        });
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131754216, null), new org.telegram.ui.ActionBar.u1(this) {
            public final zc f37012b;

            {
                this.f37012b = this;
            }

            @Override
            public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i10) {
                switch (r2) {
                    case 0:
                        this.f37012b.finishFragment();
                        return;
                    default:
                        this.f37012b.C0();
                        return;
                }
            }
        });
        showDialog(x1Var);
        org.telegram.ui.ActionBar.a7.V((TextView) x1Var.d(-2), org.telegram.ui.ActionBar.t6.f21170q7, getResourceProvider());
    }

    public final void c1(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        if (tL_premium_boostsStatus != null) {
            TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-this.f44086a));
            this.f44090c = tL_premium_boostsStatus;
            int i10 = tL_premium_boostsStatus.level;
            this.f44088b = i10;
            if (L0 != null) {
                L0.level = i10;
            }
            lc lcVar = this.N;
            if (lcVar != null) {
                lcVar.f();
            }
            d1(true);
        }
    }

    @Override
    public View createView(Context context) {
        org.telegram.ui.ActionBar.t0 d;
        float f7;
        org.telegram.messenger.vp messagesController = getMessagesController();
        long j10 = -this.f44086a;
        TLRPC.Chat L0 = messagesController.L0(Long.valueOf(j10));
        if (L0 != null) {
            int F = org.telegram.messenger.w3.F(L0);
            this.f44094f = F;
            this.e = F;
            long G = org.telegram.messenger.w3.G(L0);
            this.f44102n = G;
            this.h = G;
            int I = org.telegram.messenger.w3.I(L0);
            this.f44109s = I;
            this.f44107r = I;
            long J = org.telegram.messenger.w3.J(L0);
            this.f44116x = J;
            this.f44114w = J;
            TLRPC.EmojiStatus emojiStatus = L0.emoji_status;
            this.D = emojiStatus;
            this.f44118y = emojiStatus;
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
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131752427, null));
            this.simpleActionBar.setActionBarMenuOnItemClick(eVar);
        } else {
            this.actionBar.setBackButtonImage(2131231241);
            this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131752427, null));
            this.actionBar.setActionBarMenuOnItemClick(eVar);
        }
        org.telegram.ui.Components.bi0 bi0Var = new org.telegram.ui.Components.bi0(2131624238, org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(28.0f), true, null);
        this.K = bi0Var;
        bi0Var.h = true;
        if (!this.J) {
            bi0Var.P(0);
            this.K.M(0);
        } else {
            bi0Var.M(35);
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
            org.telegram.ui.Components.bi0 bi0Var2 = this.K;
            o10.getClass();
            d = o10.c(1, 0, null, bi0Var2, org.telegram.messenger.i0.L(48.0f), null);
        } else {
            d = this.actionBar.p().d(1, this.K);
        }
        this.L = d;
        FrameLayout frameLayout = new FrameLayout(context);
        i1();
        D0();
        if (!this.d) {
            setHasOwnBackground(true);
            this.M.setSectionsDrawBackground(true);
        } else {
            this.M.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.t6.f20872a7));
        }
        org.telegram.ui.Components.tk0 tk0Var = this.M;
        lc lcVar = new lc(this);
        this.N = lcVar;
        tk0Var.setAdapter(lcVar);
        new s4.r(3);
        this.M.setLayoutManager(new s4.a0());
        org.telegram.ui.Components.tk0 tk0Var2 = this.M;
        if (this.d) {
            f7 = 68.0f;
        } else {
            f7 = 0.0f;
        }
        frameLayout.addView(tk0Var2, w7.b6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, f7));
        this.M.setOnItemClickListener(new mg.q0(3, this, M0));
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(org.telegram.ui.Components.gr.h);
        jVar.C = false;
        jVar.f47927m = false;
        this.M.setItemAnimator(jVar);
        vh.d dVar = new vh.d(context, this.resourceProvider, true);
        dVar.setRoundRadius(24);
        this.P = dVar;
        dVar.i(org.telegram.messenger.cd.L0(2131754218, null), false, true);
        this.P.setOnClickListener(new a(this, 11));
        d1(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.O = frameLayout2;
        if (this.d) {
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20872a7, frameLayout2, getResourceProvider());
        } else {
            frameLayout2.setBackground(getBaseSimpleGlass().b(this.O));
        }
        this.O.addView(this.P, w7.b6.d(-1, 48.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
        frameLayout.addView(this.O, w7.b6.e(-1, 68, 80));
        setBulletinDelegate(new z8(this, 1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public void d1(boolean z10) {
        if (this.P != null && this.f44090c != null) {
            int Y0 = Y0();
            if (this.f44088b >= Y0) {
                this.P.g(null, z10);
                return;
            }
            if (this.I == null) {
                this.I = new SpannableStringBuilder("l");
                org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(2131231975, 0);
                dqVar.f25507n = 1;
                this.I.setSpan(dqVar, 0, 1, 33);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.I).append((CharSequence) org.telegram.messenger.cd.G(Y0, "BoostLevelRequired", new Object[0]));
            this.P.g(spannableStringBuilder, z10);
        }
    }

    public void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = org.telegram.messenger.zs.f19668p3;
        long j10 = this.f44086a;
        if (i10 == i12) {
            if (j10 == ((Long) objArr[2]).longValue()) {
                c1((TL_stories.TL_premium_boostsStatus) objArr[0]);
            }
        } else if (i10 == org.telegram.messenger.zs.V2) {
            if (!((Boolean) objArr[1]).booleanValue()) {
                getMessagesController().G0().a(j10, new cc(this, 2));
            }
        } else if (i10 == org.telegram.messenger.zs.f19726y1 && j10 == ((Long) objArr[0]).longValue()) {
            org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
            if (z4Var != null && z4Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    public void f1(boolean z10) {
        int themedColor;
        org.telegram.ui.ActionBar.i5 i5Var = this.simpleActionBar;
        if (i5Var != null) {
            i5Var.updateColors();
        } else {
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            int i10 = -1;
            if (this.d && this.f44109s != -1) {
                themedColor = -1;
            } else {
                themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.A8);
            }
            lVar.setTitleColor(themedColor);
            org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
            if (!this.d || this.f44109s == -1) {
                i10 = getThemedColor(org.telegram.ui.ActionBar.t6.f21261v8);
            }
            lVar2.D(i10, false);
            this.actionBar.C(getThemedColor(org.telegram.ui.ActionBar.t6.f21225t8), false);
        }
        if (!z10) {
            this.N.f();
            org.telegram.messenger.i0.d0(this.M, new ag.z0(this));
            if (this.d) {
                this.O.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.t6.f20872a7));
            }
            this.P.updateColors();
            setNavigationBarColor(getNavigationBarColor());
        }
    }

    public final void g1(boolean z10) {
        org.telegram.messenger.jj messageObject;
        View E0 = E0(this.S);
        View E02 = E0(this.T);
        View E03 = E0(this.U);
        View E04 = E0(this.W);
        if (E0 instanceof org.telegram.ui.Cells.z9) {
            org.telegram.ui.Cells.z9 z9Var = (org.telegram.ui.Cells.z9) E0;
            org.telegram.ui.Cells.q1[] cells = z9Var.getCells();
            for (int i10 = 0; i10 < cells.length; i10++) {
                org.telegram.ui.Cells.q1 q1Var = cells[i10];
                if (q1Var != null && (messageObject = q1Var.getMessageObject()) != null) {
                    messageObject.f16305c1 = this.f44094f;
                    messageObject.f16309d1 = this.f44102n;
                    cells[i10].setAvatar(messageObject);
                    cells[i10].invalidate();
                }
            }
            Drawable f7 = vh.k4.f(this.H, this.currentAccount, this.F, this.J);
            this.H = f7;
            z9Var.setOverrideBackground(f7);
        }
        if (E02 instanceof qn0) {
            ((qn0) E02).a(this.f44094f, z10);
        } else if (E02 instanceof qc) {
            ((qc) E02).a(this.f44094f, z10);
        }
        if (E03 instanceof mc) {
            mc mcVar = (mc) E03;
            mcVar.a(this.currentAccount, this.f44094f, true);
            mcVar.c(this.f44102n, false, z10);
        }
        if (E04 instanceof xc) {
            xc xcVar = (xc) E04;
            String j10 = org.telegram.messenger.g4.j(this.F);
            if (j10 == null && this.F == null && this.G != null) {
                j10 = "❌";
            }
            xcVar.a(j10, z10);
            xcVar.setGalleryWallpaper(this.G);
        }
    }

    @Override
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        if (!this.d) {
            return this.M;
        }
        return null;
    }

    public final void h1() {
        TLRPC.StickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        View E0 = E0(this.Z);
        View E02 = E0(this.f44089b0);
        View E03 = E0(this.f44091c0);
        View E04 = E0(this.f44095f0);
        View E05 = E0(this.f44097h0);
        View E06 = E0(this.f44099j0);
        if (E0 instanceof sc) {
            TLRPC.EmojiStatus emojiStatus = this.D;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                sc scVar = (sc) E0;
                rc rcVar = scVar.f41467b;
                org.telegram.messenger.kp a2 = org.telegram.messenger.kp.a(emojiStatus);
                rcVar.c(a2, true);
                scVar.f41466a.c(a2, true);
                rcVar.d(((TLRPC.TL_emojiStatusCollectible) this.D).pattern_document_id, true, true);
            } else {
                sc scVar2 = (sc) E0;
                rc rcVar2 = scVar2.f41467b;
                int i10 = this.f44109s;
                rcVar2.b(i10, true);
                scVar2.f41466a.b(scVar2.h.currentAccount, i10, true);
                rcVar2.d(this.f44116x, false, true);
            }
            sc scVar3 = (sc) E0;
            rc rcVar3 = scVar3.f41467b;
            rcVar3.e(org.telegram.messenger.o5.f(this.D), false, true);
            rcVar3.a(this.f44094f);
            scVar3.updateColors();
        }
        if (E02 instanceof qn0) {
            ((qn0) E02).a(this.f44109s, true);
        } else if (E02 instanceof qc) {
            ((qc) E02).a(this.f44094f, true);
        }
        if (E03 instanceof mc) {
            mc mcVar = (mc) E03;
            mcVar.a(this.currentAccount, this.f44109s, false);
            mcVar.c(this.f44116x, false, true);
        }
        if (E04 instanceof mc) {
            TLRPC.EmojiStatus emojiStatus2 = this.D;
            if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                ((mc) E04).b(org.telegram.messenger.kp.a(emojiStatus2));
            } else {
                ((mc) E04).a(this.currentAccount, this.f44109s, false);
            }
            ((mc) E04).c(org.telegram.messenger.o5.f(this.D), org.telegram.messenger.o5.B(this.D), true);
        }
        boolean z10 = E05 instanceof mc;
        long j10 = this.f44086a;
        if (z10) {
            mc mcVar2 = (mc) E05;
            mcVar2.a(this.currentAccount, this.f44109s, false);
            TLRPC.ChatFull M0 = getMessagesController().M0(-j10);
            if (M0 != null && (stickerSet2 = M0.emojiset) != null) {
                mcVar2.c(J0(stickerSet2), false, false);
            } else {
                mcVar2.c(0L, false, false);
            }
        }
        if (E06 instanceof mc) {
            TLRPC.ChatFull M02 = getMessagesController().M0(-j10);
            if (M02 != null && (stickerSet = M02.stickerset) != null) {
                ((mc) E06).d(I0(stickerSet));
            } else {
                ((mc) E06).c(0L, false, false);
            }
        }
        i1();
    }

    public void i1() {
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
        this.f44089b0 = i10 + 6;
        int i11 = i10 + 8;
        this.R = i11;
        this.f44091c0 = i10 + 7;
        if (this.f44116x == 0 && this.f44109s < 0 && !(this.D instanceof TLRPC.TL_emojiStatusCollectible)) {
            int i12 = this.f44093e0;
            this.f44093e0 = -1;
            if (i12 >= 0 && (lcVar2 = this.N) != null) {
                lcVar2.s(i12);
                this.N.g(this.f44091c0);
            }
        } else {
            if (this.f44093e0 >= 0) {
                z10 = true;
            }
            this.R = i10 + 9;
            this.f44093e0 = i11;
            if (!z10 && (lcVar = this.N) != null) {
                lcVar.i(i11);
                this.N.g(this.f44091c0);
            }
        }
        int i13 = this.R;
        this.f44092d0 = i13;
        this.f44095f0 = i13 + 1;
        this.R = i13 + 3;
        this.f44096g0 = i13 + 2;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return !this.d;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (W0() && this.f44088b >= Y0()) {
            return false;
        }
        return true;
    }

    public final void j1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zc.j1():void");
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.f44088b >= Y0() && W0()) {
            if (z10) {
                b1();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public boolean onFragmentCreate() {
        getMediaDataController().Y0();
        getNotificationCenter().c(this, org.telegram.messenger.zs.V2);
        getNotificationCenter().c(this, org.telegram.messenger.zs.f19668p3);
        getNotificationCenter().c(this, org.telegram.messenger.zs.f19726y1);
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.zs.V2);
        getNotificationCenter().n(this, org.telegram.messenger.zs.f19668p3);
        getNotificationCenter().n(this, org.telegram.messenger.zs.f19726y1);
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
            B0();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        i0.c cVar = this.mSystemInsets;
        onInsets(cVar.f7765a, cVar.f7766b, cVar.f7767c, cVar.d);
    }

    @Override
    public final void setResourceProvider(org.telegram.ui.ActionBar.p6 p6Var) {
        this.f44106q0 = p6Var;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return !this.d;
    }

    public void Z0(int i10) {
    }
}
