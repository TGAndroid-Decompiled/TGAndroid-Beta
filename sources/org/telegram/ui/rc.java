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
public class rc extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public TLRPC.EmojiStatus D;
    public TLRPC.WallPaper E;
    public TLRPC.WallPaper F;
    public TLRPC.WallPaper G;
    public Drawable H;
    public SpannableStringBuilder I;
    public boolean J;
    public org.telegram.ui.Components.zg0 K;
    public org.telegram.ui.ActionBar.r0 L;
    public org.telegram.ui.Components.pj0 M;
    public ec N;
    public FrameLayout O;
    public fi.d P;
    public bc Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public final long f49446a;
    public int f49447a0;
    public int f49448b;
    public int f49449b0;
    public TL_stories.TL_premium_boostsStatus f49450c;
    public int f49451c0;
    public boolean d;
    public int f49452d0;
    public int f49453e;
    public int f49454e0;
    public int f49455f;
    public int f49456f0;
    public int f49457g0;
    public long h;
    public int f49458h0;
    public int f49459i0;
    public int f49460j0;
    public int f49461k0;
    public org.telegram.ui.ActionBar.f2 f49462l0;
    public cc m0;
    public long f49463n;
    public float f49464n0;
    public ValueAnimator f49465o0;
    public boolean f49466p0;
    public org.telegram.ui.ActionBar.f6 f49467q0;
    public int f49468r;
    public final SparseIntArray f49469r0;
    public int f49470s;
    public final org.telegram.ui.ActionBar.t4 f49471s0;
    public final org.telegram.ui.ActionBar.t4 f49472t0;
    public final org.telegram.ui.ActionBar.t4 f49473u0;
    public final org.telegram.ui.ActionBar.t4 f49474v0;
    public long f49475w;
    public final Drawable f49476w0;
    public long f49477x;
    public final Drawable f49478x0;
    public TLRPC.EmojiStatus f49479y;
    public final Paint f49480y0;

    public rc(long j3) {
        super(null);
        boolean q10 = org.telegram.ui.ActionBar.k6.I.q();
        this.J = q10;
        this.R = 0;
        this.f49466p0 = q10;
        this.f49469r0 = new SparseIntArray();
        Paint paint = new Paint(1);
        this.f49480y0 = paint;
        paint.setStrokeWidth(1.0f);
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27850d7, this.resourceProvider));
        this.f49476w0 = org.telegram.messenger.t0.f25563b.getDrawable(2131232091).mutate();
        this.f49478x0 = org.telegram.messenger.t0.f25563b.getDrawable(2131232177).mutate();
        this.f49446a = j3;
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-j3));
        if (M0 != null) {
            this.f49448b = M0.level;
        }
        org.telegram.messenger.qp.s1(this.currentAccount).G0().a(j3, new org.telegram.messenger.voip.k(6, this, M0));
        this.resourceProvider = new qc(this);
        this.f49471s0 = new org.telegram.ui.ActionBar.t4(0, false, false, this.resourceProvider);
        this.f49472t0 = new org.telegram.ui.ActionBar.t4(0, false, true, this.resourceProvider);
        this.f49473u0 = new org.telegram.ui.ActionBar.t4(0, true, false, this.resourceProvider);
        this.f49474v0 = new org.telegram.ui.ActionBar.t4(0, true, true, this.resourceProvider);
    }

    public static void Z(rc rcVar) {
        org.telegram.ui.ActionBar.f6 f6Var = rcVar.resourceProvider;
        if (f6Var instanceof qc) {
            rc rcVar2 = ((qc) f6Var).f49188a;
            rcVar2.J = !rcVar2.J;
            rcVar2.k1();
            rcVar2.g1(false);
        } else {
            rcVar.J = !rcVar.J;
            rcVar.k1();
        }
        rcVar.b1(rcVar.J, true);
        rcVar.g1(false);
        org.telegram.ui.ActionBar.k6.Am++;
    }

    public static void a0(org.telegram.ui.rc r13, org.telegram.messenger.e3 r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rc.a0(org.telegram.ui.rc, org.telegram.messenger.e3):void");
    }

    public static void b0(org.telegram.ui.rc r22, org.telegram.tgnet.TLRPC.ChatFull r23, android.view.View r24, int r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rc.b0(org.telegram.ui.rc, org.telegram.tgnet.TLRPC$ChatFull, android.view.View, int):void");
    }

    public static void f1(View view) {
        if (view instanceof fc) {
            ((fc) view).updateColors();
        } else if (view instanceof org.telegram.ui.Cells.m8) {
            ((org.telegram.ui.Cells.m8) view).updateColors();
        } else if (view instanceof ic) {
            ((ic) view).updateColors();
        } else if (view instanceof pc) {
            ((pc) view).updateColors();
        }
    }

    public final void B0() {
        int themedColor;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar == null) {
            return;
        }
        int i7 = -1;
        if (this.d && this.f49470s != -1) {
            themedColor = -1;
        } else {
            themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.A8);
        }
        kVar.setTitleColor(themedColor);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        if (!this.d || this.f49470s == -1) {
            i7 = getThemedColor(org.telegram.ui.ActionBar.k6.f28186v8);
        }
        kVar2.D(i7, false);
    }

    public void C0() {
        B0();
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.f28129s8));
        }
        org.telegram.ui.Components.pj0 pj0Var = this.M;
        if (pj0Var != null && this.d) {
            pj0Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.f27793a7));
        }
        FrameLayout frameLayout = this.O;
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.f27793a7));
        }
    }

    public final void D0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rc.D0():void");
    }

    public void E0() {
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(getParentActivity(), this.resourceProvider);
        this.M = pj0Var;
        pj0Var.setSections(false);
    }

    public final View F0(int i7) {
        for (int i10 = 0; i10 < this.M.getChildCount(); i10++) {
            View childAt = this.M.getChildAt(i10);
            this.M.getClass();
            if (RecyclerView.R(childAt) == i7) {
                return childAt;
            }
        }
        return null;
    }

    public int G0() {
        return getMessagesController().f24904u5;
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
        long j3 = stickerSet.thumb_document_id;
        if (j3 == 0) {
            TLRPC.TL_messages_stickerSet Y = getMediaDataController().Y(stickerSet);
            if (!Y.documents.isEmpty()) {
                return Y.documents.get(0).f26959id;
            }
        }
        return j3;
    }

    public int L0() {
        return 2131752412;
    }

    public int M0() {
        return getMessagesController().s5;
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
        return getMessagesController().f24878r5;
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
        return getMessagesController().f24896t5;
    }

    public int W0() {
        return 2131752264;
    }

    public final boolean X0() {
        if (this.f49453e == this.f49455f && this.h == this.f49463n && this.f49468r == this.f49470s && this.f49475w == this.f49477x && org.telegram.messenger.m5.a(this.f49479y, this.D) && org.telegram.messenger.d4.v(this.E, this.F)) {
            return false;
        }
        return true;
    }

    public boolean Y0() {
        return false;
    }

    public final int Z0() {
        org.telegram.messenger.fp d;
        org.telegram.messenger.fp fpVar = null;
        int i7 = 0;
        if (this.f49453e != this.f49455f) {
            org.telegram.messenger.gp gpVar = getMessagesController().f24867q4;
            if (gpVar == null) {
                d = null;
            } else {
                d = gpVar.d(this.f49455f);
            }
            if (d != null) {
                i7 = Math.max(0, d.l(this.d));
            }
        }
        if (this.h != this.f49463n) {
            i7 = Math.max(i7, getMessagesController().f24868q5);
        }
        if (this.f49468r != this.f49470s) {
            org.telegram.messenger.gp gpVar2 = getMessagesController().f24877r4;
            if (gpVar2 != null) {
                fpVar = gpVar2.d(this.f49470s);
            }
            if (fpVar != null) {
                i7 = Math.max(i7, fpVar.l(this.d));
            }
        }
        if (this.f49475w != this.f49477x) {
            i7 = Math.max(i7, Q0());
        }
        if (!org.telegram.messenger.m5.a(this.f49479y, this.D)) {
            i7 = Math.max(i7, M0());
        }
        if (!org.telegram.messenger.d4.v(this.E, this.F)) {
            return Math.max(i7, V0());
        }
        return i7;
    }

    public final void b1(boolean z9, boolean z10) {
        int i7;
        if (this.f49466p0 != z9) {
            this.f49466p0 = z9;
            int i10 = 0;
            if (z10) {
                org.telegram.ui.Components.zg0 zg0Var = this.K;
                if (z9) {
                    i10 = zg0Var.f40976e[0];
                }
                zg0Var.P(i10);
                org.telegram.ui.Components.zg0 zg0Var2 = this.K;
                if (zg0Var2 != null) {
                    zg0Var2.start();
                    return;
                }
                return;
            }
            if (z9) {
                i7 = this.K.f40976e[0] - 1;
            } else {
                i7 = 0;
            }
            this.K.N(i7, false, true);
            this.K.P(i7);
            org.telegram.ui.ActionBar.r0 r0Var = this.L;
            if (r0Var != null) {
                r0Var.invalidate();
            }
        }
    }

    public final void c1() {
        if (getVisibleDialog() != null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
        String M0 = org.telegram.messenger.hd.M0(2131752426, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.hd.M0(2131752425, null);
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131751370, null), new org.telegram.ui.ActionBar.r1(this) {
            public final rc f52202b;

            {
                this.f52202b = this;
            }

            @Override
            public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i7) {
                switch (r2) {
                    case 0:
                        this.f52202b.finishFragment();
                        return;
                    default:
                        this.f52202b.D0();
                        return;
                }
            }
        });
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131754216, null), new org.telegram.ui.ActionBar.r1(this) {
            public final rc f52202b;

            {
                this.f52202b = this;
            }

            @Override
            public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i7) {
                switch (r2) {
                    case 0:
                        this.f52202b.finishFragment();
                        return;
                    default:
                        this.f52202b.D0();
                        return;
                }
            }
        });
        showDialog(u1Var);
        org.telegram.ui.ActionBar.r6.V((TextView) u1Var.d(-2), org.telegram.ui.ActionBar.k6.f28090q7, getResourceProvider());
    }

    @Override
    public View createView(Context context) {
        org.telegram.ui.ActionBar.r0 d;
        float f10;
        org.telegram.messenger.qp messagesController = getMessagesController();
        long j3 = -this.f49446a;
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j3));
        if (M0 != null) {
            int F = org.telegram.messenger.t3.F(M0);
            this.f49455f = F;
            this.f49453e = F;
            long G = org.telegram.messenger.t3.G(M0);
            this.f49463n = G;
            this.h = G;
            int I = org.telegram.messenger.t3.I(M0);
            this.f49470s = I;
            this.f49468r = I;
            long J = org.telegram.messenger.t3.J(M0);
            this.f49477x = J;
            this.f49475w = J;
            TLRPC.EmojiStatus emojiStatus = M0.emoji_status;
            this.D = emojiStatus;
            this.f49479y = emojiStatus;
        }
        TLRPC.ChatFull N0 = getMessagesController().N0(j3);
        if (N0 != null) {
            TLRPC.WallPaper wallPaper = N0.wallpaper;
            this.F = wallPaper;
            this.E = wallPaper;
            String j10 = org.telegram.messenger.d4.j(wallPaper);
            if (j10 != null && j10.length() == 0) {
                this.G = this.E;
            }
        }
        w9 w9Var = new w9(this, 3);
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        if (y4Var != null) {
            y4Var.setBackButtonImage(2131231240);
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131752427, null));
            this.simpleActionBar.setActionBarMenuOnItemClick(w9Var);
        } else {
            this.actionBar.setBackButtonImage(2131231240);
            this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131752427, null));
            this.actionBar.setActionBarMenuOnItemClick(w9Var);
        }
        org.telegram.ui.Components.zg0 zg0Var = new org.telegram.ui.Components.zg0(2131624240, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        this.K = zg0Var;
        zg0Var.h = true;
        if (!this.J) {
            zg0Var.P(0);
            this.K.M(0);
        } else {
            zg0Var.M(35);
            this.K.P(36);
        }
        this.K.Z = true;
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.J9, this.resourceProvider);
        this.K.Q(w02, "Sunny");
        this.K.Q(w02, "Path 6");
        this.K.Q(w02, "Path");
        this.K.Q(w02, "Path 5");
        org.telegram.ui.ActionBar.y4 y4Var2 = this.simpleActionBar;
        if (y4Var2 != null) {
            org.telegram.ui.ActionBar.e5 o4 = y4Var2.o();
            org.telegram.ui.Components.zg0 zg0Var2 = this.K;
            o4.getClass();
            d = o4.c(1, 0, null, zg0Var2, org.telegram.messenger.g0.L(48.0f), null);
        } else {
            d = this.actionBar.q().d(1, this.K);
        }
        this.L = d;
        FrameLayout frameLayout = new FrameLayout(context);
        j1();
        E0();
        if (!this.d) {
            setHasOwnBackground(true);
            this.M.setSectionsDrawBackground(true);
        } else {
            this.M.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.f27793a7));
        }
        org.telegram.ui.Components.pj0 pj0Var = this.M;
        ec ecVar = new ec(this);
        this.N = ecVar;
        pj0Var.setAdapter(ecVar);
        new v4.s(3);
        this.M.setLayoutManager(new v4.b0());
        org.telegram.ui.Components.pj0 pj0Var2 = this.M;
        if (this.d) {
            f10 = 68.0f;
        } else {
            f10 = 0.0f;
        }
        frameLayout.addView(pj0Var2, c8.ha.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, f10));
        this.M.setOnItemClickListener(new di.p4(4, this, N0));
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.xq.h);
        kVar.C = false;
        kVar.f56978m = false;
        this.M.setItemAnimator(kVar);
        fi.d dVar = new fi.d(context, this.resourceProvider, true);
        dVar.setRoundRadius(24);
        this.P = dVar;
        dVar.i(org.telegram.messenger.hd.M0(2131754218, null), false, true);
        this.P.setOnClickListener(new a(this, 11));
        e1(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.O = frameLayout2;
        if (this.d) {
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27793a7, frameLayout2, getResourceProvider());
        } else {
            frameLayout2.setBackground(getBaseSimpleGlass().b(this.O));
        }
        this.O.addView(this.P, c8.ha.d(-1, 48.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
        frameLayout.addView(this.O, c8.ha.e(-1, 68, 80));
        setBulletinDelegate(new y8(this, 1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d1(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        if (tL_premium_boostsStatus != null) {
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-this.f49446a));
            this.f49450c = tL_premium_boostsStatus;
            int i7 = tL_premium_boostsStatus.level;
            this.f49448b = i7;
            if (M0 != null) {
                M0.level = i7;
            }
            ec ecVar = this.N;
            if (ecVar != null) {
                ecVar.f();
            }
            e1(true);
        }
    }

    public void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.qs.f25045p3;
        long j3 = this.f49446a;
        if (i7 == i11) {
            if (j3 == ((Long) objArr[2]).longValue()) {
                d1((TL_stories.TL_premium_boostsStatus) objArr[0]);
            }
        } else if (i7 == org.telegram.messenger.qs.V2) {
            if (!((Boolean) objArr[1]).booleanValue()) {
                getMessagesController().G0().a(j3, new wb(this, 2));
            }
        } else if (i7 == org.telegram.messenger.qs.f25103y1 && j3 == ((Long) objArr[0]).longValue()) {
            org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
            if (q4Var != null && q4Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    public void e1(boolean z9) {
        if (this.P != null && this.f49450c != null) {
            int Z0 = Z0();
            if (this.f49448b >= Z0) {
                this.P.g(null, z9);
                return;
            }
            if (this.I == null) {
                this.I = new SpannableStringBuilder("l");
                org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(2131231976, 0);
                wpVar.f40069n = 1;
                this.I.setSpan(wpVar, 0, 1, 33);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.I).append((CharSequence) org.telegram.messenger.hd.G(Z0, "BoostLevelRequired", new Object[0]));
            this.P.g(spannableStringBuilder, z9);
        }
    }

    public void g1(boolean z9) {
        int themedColor;
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        if (y4Var != null) {
            y4Var.updateColors();
        } else {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i7 = -1;
            if (this.d && this.f49470s != -1) {
                themedColor = -1;
            } else {
                themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.A8);
            }
            kVar.setTitleColor(themedColor);
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            if (!this.d || this.f49470s == -1) {
                i7 = getThemedColor(org.telegram.ui.ActionBar.k6.f28186v8);
            }
            kVar2.D(i7, false);
            this.actionBar.C(getThemedColor(org.telegram.ui.ActionBar.k6.f28147t8), false);
        }
        if (!z9) {
            this.N.f();
            org.telegram.messenger.g0.d0(this.M, new di.e(this));
            if (this.d) {
                this.O.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.f27793a7));
            }
            this.P.updateColors();
            setNavigationBarColor(getNavigationBarColor());
        }
    }

    @Override
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        if (!this.d) {
            return this.M;
        }
        return null;
    }

    public final void h1(boolean z9) {
        org.telegram.messenger.ij messageObject;
        View F0 = F0(this.S);
        View F02 = F0(this.T);
        View F03 = F0(this.U);
        View F04 = F0(this.W);
        if (F0 instanceof org.telegram.ui.Cells.z9) {
            org.telegram.ui.Cells.z9 z9Var = (org.telegram.ui.Cells.z9) F0;
            org.telegram.ui.Cells.q1[] cells = z9Var.getCells();
            for (int i7 = 0; i7 < cells.length; i7++) {
                org.telegram.ui.Cells.q1 q1Var = cells[i7];
                if (q1Var != null && (messageObject = q1Var.getMessageObject()) != null) {
                    messageObject.f23210c1 = this.f49455f;
                    messageObject.f23214d1 = this.f49463n;
                    cells[i7].setAvatar(messageObject);
                    cells[i7].invalidate();
                }
            }
            Drawable f10 = fi.y5.f(this.H, this.currentAccount, this.F, this.J);
            this.H = f10;
            z9Var.setOverrideBackground(f10);
        }
        if (F02 instanceof em0) {
            ((em0) F02).a(this.f49455f, z9);
        } else if (F02 instanceof ic) {
            ((ic) F02).a(this.f49455f, z9);
        }
        if (F03 instanceof fc) {
            fc fcVar = (fc) F03;
            fcVar.a(this.currentAccount, this.f49455f, true);
            fcVar.c(this.f49463n, false, z9);
        }
        if (F04 instanceof pc) {
            pc pcVar = (pc) F04;
            String j3 = org.telegram.messenger.d4.j(this.F);
            if (j3 == null && this.F == null && this.G != null) {
                j3 = "❌";
            }
            pcVar.a(j3, z9);
            pcVar.setGalleryWallpaper(this.G);
        }
    }

    public final void i1() {
        TLRPC.StickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        View F0 = F0(this.Z);
        View F02 = F0(this.f49449b0);
        View F03 = F0(this.f49451c0);
        View F04 = F0(this.f49456f0);
        View F05 = F0(this.f49458h0);
        View F06 = F0(this.f49460j0);
        if (F0 instanceof kc) {
            TLRPC.EmojiStatus emojiStatus = this.D;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                kc kcVar = (kc) F0;
                jc jcVar = kcVar.f47162b;
                org.telegram.messenger.fp a10 = org.telegram.messenger.fp.a(emojiStatus);
                jcVar.c(a10, true);
                kcVar.f47161a.c(a10, true);
                jcVar.d(((TLRPC.TL_emojiStatusCollectible) this.D).pattern_document_id, true, true);
            } else {
                kc kcVar2 = (kc) F0;
                jc jcVar2 = kcVar2.f47162b;
                int i7 = this.f49470s;
                jcVar2.b(i7, true);
                kcVar2.f47161a.b(kcVar2.h.currentAccount, i7, true);
                jcVar2.d(this.f49477x, false, true);
            }
            kc kcVar3 = (kc) F0;
            jc jcVar3 = kcVar3.f47162b;
            jcVar3.e(org.telegram.messenger.m5.f(this.D), false, true);
            jcVar3.a(this.f49455f);
            kcVar3.updateColors();
        }
        if (F02 instanceof em0) {
            ((em0) F02).a(this.f49470s, true);
        } else if (F02 instanceof ic) {
            ((ic) F02).a(this.f49455f, true);
        }
        if (F03 instanceof fc) {
            fc fcVar = (fc) F03;
            fcVar.a(this.currentAccount, this.f49470s, false);
            fcVar.c(this.f49477x, false, true);
        }
        if (F04 instanceof fc) {
            TLRPC.EmojiStatus emojiStatus2 = this.D;
            if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                ((fc) F04).b(org.telegram.messenger.fp.a(emojiStatus2));
            } else {
                ((fc) F04).a(this.currentAccount, this.f49470s, false);
            }
            ((fc) F04).c(org.telegram.messenger.m5.f(this.D), org.telegram.messenger.m5.B(this.D), true);
        }
        boolean z9 = F05 instanceof fc;
        long j3 = this.f49446a;
        if (z9) {
            fc fcVar2 = (fc) F05;
            fcVar2.a(this.currentAccount, this.f49470s, false);
            TLRPC.ChatFull N0 = getMessagesController().N0(-j3);
            if (N0 != null && (stickerSet2 = N0.emojiset) != null) {
                fcVar2.c(K0(stickerSet2), false, false);
            } else {
                fcVar2.c(0L, false, false);
            }
        }
        if (F06 instanceof fc) {
            TLRPC.ChatFull N02 = getMessagesController().N0(-j3);
            if (N02 != null && (stickerSet = N02.stickerset) != null) {
                ((fc) F06).d(J0(stickerSet));
            } else {
                ((fc) F06).c(0L, false, false);
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
        if (X0() && this.f49448b >= Z0()) {
            return false;
        }
        return true;
    }

    public void j1() {
        ec ecVar;
        ec ecVar2;
        boolean z9 = false;
        this.S = 0;
        int i7 = 1 + 1;
        this.T = 1;
        this.U = i7;
        this.V = i7 + 1;
        this.W = i7 + 2;
        this.X = i7 + 3;
        this.Y = i7 + 4;
        this.Z = i7 + 5;
        this.f49449b0 = i7 + 6;
        int i10 = i7 + 8;
        this.R = i10;
        this.f49451c0 = i7 + 7;
        if (this.f49477x == 0 && this.f49470s < 0 && !(this.D instanceof TLRPC.TL_emojiStatusCollectible)) {
            int i11 = this.f49454e0;
            this.f49454e0 = -1;
            if (i11 >= 0 && (ecVar2 = this.N) != null) {
                ecVar2.s(i11);
                this.N.g(this.f49451c0);
            }
        } else {
            if (this.f49454e0 >= 0) {
                z9 = true;
            }
            this.R = i7 + 9;
            this.f49454e0 = i10;
            if (!z9 && (ecVar = this.N) != null) {
                ecVar.i(i10);
                this.N.g(this.f49451c0);
            }
        }
        int i12 = this.R;
        this.f49452d0 = i12;
        this.f49456f0 = i12 + 1;
        this.R = i12 + 3;
        this.f49457g0 = i12 + 2;
    }

    public final void k1() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rc.k1():void");
    }

    @Override
    public final boolean onBackPressed(boolean z9) {
        if (this.f49448b >= Z0() && X0()) {
            if (z9) {
                c1();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z9);
    }

    @Override
    public boolean onFragmentCreate() {
        getMediaDataController().Y0();
        getNotificationCenter().c(this, org.telegram.messenger.qs.V2);
        getNotificationCenter().c(this, org.telegram.messenger.qs.f25045p3);
        getNotificationCenter().c(this, org.telegram.messenger.qs.f25103y1);
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.qs.V2);
        getNotificationCenter().n(this, org.telegram.messenger.qs.f25045p3);
        getNotificationCenter().n(this, org.telegram.messenger.qs.f25103y1);
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        if (!this.d && this.O != null) {
            int L = org.telegram.messenger.g0.L(68.0f) + i12;
            ViewGroup.LayoutParams layoutParams = this.O.getLayoutParams();
            if (layoutParams.height != L) {
                layoutParams.height = L;
                this.O.setLayoutParams(layoutParams);
            }
            if (this.O.getPaddingLeft() != i7 || this.O.getPaddingRight() != i11 || this.O.getPaddingBottom() != i12) {
                this.O.setPadding(i7, 0, i11, i12);
            }
            oi.a.e(this.M, i10, i12, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), org.telegram.messenger.g0.L(68.0f));
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            C0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        i0.b bVar = this.mSystemInsets;
        onInsets(bVar.f15117a, bVar.f15118b, bVar.f15119c, bVar.d);
    }

    @Override
    public final void setResourceProvider(org.telegram.ui.ActionBar.f6 f6Var) {
        this.f49467q0 = f6Var;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return !this.d;
    }

    public void a1(int i7) {
    }
}
