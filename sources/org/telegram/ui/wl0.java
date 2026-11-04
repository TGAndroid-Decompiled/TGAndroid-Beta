package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class wl0 extends FrameLayout {
    public static final int f51199r0 = 0;
    public vl0 E;
    public final bm0 F;
    public View G;
    public boolean H;
    public boolean I;
    public TL_stars.TL_starGiftUnique J;
    public ai.w5 K;
    public TL_stars.StarGift L;
    public final ArrayList M;
    public final HashMap N;
    public final SpannableStringBuilder O;
    public final String P;
    public final String Q;
    public int R;
    public int S;
    public int T;
    public final int U;
    public int V;
    public int W;
    public final am0 f51200a;
    public int f51201a0;
    public final nl0 f51202b;
    public int f51203b0;
    public final u4.s f51204c;
    public int f51205c0;
    public final pl0 d;
    public int f51206d0;
    public final mi.h0 f51207e;
    public int f51208e0;
    public zl0 f51209f;
    public int f51210f0;
    public int f51211g0;
    public int h;
    public int f51212h0;
    public int f51213i0;
    public int f51214j0;
    public int f51215k0;
    public int f51216l0;
    public final ArrayList m0;
    public long f51217n;
    public final int f51218n0;
    public int f51219o0;
    public tl0 f51220p0;
    public final cm0 f51221q0;
    public TLRPC.TL_emojiStatusCollectible f51222r;
    public TLRPC.TL_peerColorCollectible f51223s;
    public final rl0 f51224w;
    public final View f51225x;
    public final View f51226y;

    public wl0(cm0 cm0Var, Context context, int i3) {
        super(context);
        int i10;
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        org.telegram.ui.ActionBar.e6 e6Var3;
        int i11;
        org.telegram.ui.ActionBar.e6 e6Var4;
        this.f51221q0 = cm0Var;
        this.f51207e = new mi.h0(14, false);
        this.h = -1;
        this.f51217n = 0L;
        this.f51222r = null;
        this.f51223s = null;
        this.L = null;
        this.M = new ArrayList();
        this.N = new HashMap();
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.f51201a0 = -1;
        this.f51203b0 = -1;
        this.f51205c0 = -1;
        this.f51206d0 = -1;
        this.f51208e0 = -1;
        this.f51210f0 = -1;
        this.f51211g0 = 0;
        this.f51212h0 = -1;
        this.f51213i0 = -1;
        this.f51214j0 = -1;
        this.f51215k0 = -1;
        this.m0 = new ArrayList();
        this.f51218n0 = i3;
        d();
        Context context2 = getContext();
        org.telegram.ui.ActionBar.e6 resourceProvider = cm0Var.getResourceProvider();
        eh.c cVar = cm0Var.H;
        nl0 nl0Var = new nl0(this, context2, resourceProvider, i3);
        this.f51202b = nl0Var;
        nl0Var.setClipToPadding(false);
        nl0Var.setSections(true);
        ((u4.k) nl0Var.getItemAnimator()).f55567m = false;
        getContext();
        u4.s sVar = new u4.s(3);
        this.f51204c = sVar;
        sVar.O = new ai.g2(this, 15);
        nl0Var.i(new gi.o1(this, 7));
        nl0Var.setLayoutManager(sVar);
        pl0 pl0Var = new pl0(this, context, i3);
        this.d = pl0Var;
        nl0Var.setAdapter(pl0Var);
        nl0Var.setOnItemClickListener(new org.telegram.ui.Components.cl0(this, i3, 1));
        nl0Var.j(new ql0(this, i3));
        addView(nl0Var, b8.mf.c(-1.0f, -1));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.wp(2131232242, 0), 0, 1, 33);
        if (cm0Var.f44388a) {
            i10 = 2131752435;
        } else {
            i10 = 2131743765;
        }
        String M0 = org.telegram.messenger.bd.M0(i10, null);
        this.P = M0;
        this.O = new SpannableStringBuilder(spannableStringBuilder).append((CharSequence) " ").append((CharSequence) M0);
        this.Q = org.telegram.messenger.bd.M0(2131743764, null);
        f(false);
        u4.k kVar = new u4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.xq.h);
        kVar.C = false;
        kVar.f55567m = false;
        nl0Var.setItemAnimator(kVar);
        View view = new View(getContext());
        this.f51225x = view;
        eh.d dVar = new eh.d(cVar.c(view, null, false));
        dVar.b(-org.telegram.messenger.g0.L(24.0f), true);
        dVar.H = 220;
        view.setBackground(dVar);
        addView(view, b8.mf.e(-1, 72, 55));
        if (i3 == 0) {
            Context context3 = getContext();
            i11 = ((org.telegram.ui.ActionBar.d2) cm0Var).currentAccount;
            e6Var4 = ((org.telegram.ui.ActionBar.d2) cm0Var).resourceProvider;
            this.f51200a = new am0(i11, 0L, context3, e6Var4);
            j(false);
        } else {
            View view2 = new View(getContext());
            this.f51226y = view2;
            eh.d dVar2 = new eh.d(cVar.c(view2, null, false));
            dVar2.b(-org.telegram.messenger.g0.L(16.0f), false);
            view2.setBackground(dVar2);
            addView(view2, b8.mf.e(-1, 16, 55));
            Context context4 = getContext();
            q4Var = ((org.telegram.ui.ActionBar.d2) cm0Var).parentLayout;
            e6Var = ((org.telegram.ui.ActionBar.d2) cm0Var).resourceProvider;
            rl0 rl0Var = new rl0(context4, q4Var, 3, 0L, e6Var);
            this.f51224w = rl0Var;
            rl0Var.setImportantForAccessibility(4);
            rl0Var.f31070x = cm0Var;
            rl0Var.setClipToOutline(true);
            cg.p0 p0Var = cg.t0.f4745a;
            rl0Var.setOutlineProvider(new cg.r0(0, org.telegram.messenger.g0.L(16.0f)));
            addView(rl0Var, b8.mf.d(-1, -2.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        Context context5 = getContext();
        e6Var2 = ((org.telegram.ui.ActionBar.d2) cm0Var).resourceProvider;
        bm0 bm0Var = new bm0(context5, e6Var2);
        this.F = bm0Var;
        gh.g c2 = cm0Var.F.c(bm0Var, null, false);
        e6Var3 = ((org.telegram.ui.ActionBar.d2) cm0Var).resourceProvider;
        hh.e eVar = new hh.e(e6Var3);
        eVar.f14417e = new gi.i8(17);
        eVar.f(0, 0);
        eVar.e(0, 0);
        eVar.d(0, 0);
        c2.p(eVar);
        c2.r(org.telegram.messenger.g0.L(18.0f));
        c2.R.f12302e = true;
        bm0Var.I = c2;
        bm0Var.H = c2;
        bm0Var.G = new ml0(this, 0);
        bm0Var.setVisibility(4);
        addView(bm0Var, b8.mf.d(-1, 36.0f, 55, 12.0f, 0.0f, 12.0f, 0.0f));
        View view3 = this.f51200a;
        if (view3 != null) {
            addView(view3, b8.mf.e(-1, -2, 55));
        }
        g();
        k();
        setWillNotDraw(false);
    }

    public static void a(wl0 wl0Var) {
        int i3;
        nl0 nl0Var = wl0Var.f51202b;
        boolean z10 = wl0Var.I;
        if (z10) {
            nl0Var.C0();
        }
        wl0Var.e();
        if (z10 && (i3 = wl0Var.f51213i0) >= 0) {
            wl0Var.f51204c.h1(i3, wl0Var.f51221q0.f44397f);
            nl0Var.post(new ml0(wl0Var, 1));
        }
    }

    public final boolean b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wl0.b():boolean");
    }

    public final boolean c() {
        nl0 nl0Var = this.f51202b;
        if (nl0Var != null) {
            for (int i3 = 0; i3 < nl0Var.getChildCount(); i3++) {
                if (nl0Var.getChildAt(i3) instanceof org.telegram.ui.Components.iz) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void d() {
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible;
        int i3 = this.f51218n0;
        cm0 cm0Var = this.f51221q0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible = null;
        if (i3 == 0) {
            TLRPC.User f10 = cm0Var.getUserConfig().f();
            this.h = org.telegram.messenger.l10.l(f10);
            this.f51217n = org.telegram.messenger.l10.m(f10);
            if (f10 != null) {
                TLRPC.EmojiStatus emojiStatus = f10.emoji_status;
                if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                    tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                    this.f51222r = tL_emojiStatusCollectible;
                    this.f51223s = null;
                }
            }
            tL_emojiStatusCollectible = null;
            this.f51222r = tL_emojiStatusCollectible;
            this.f51223s = null;
        } else {
            TLRPC.User f11 = cm0Var.getUserConfig().f();
            this.h = org.telegram.messenger.l10.e(f11);
            this.f51217n = org.telegram.messenger.l10.f(f11);
            this.f51222r = null;
            if (f11 != null) {
                TLRPC.PeerColor peerColor = f11.color;
                if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                    tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                }
            }
            this.f51223s = tL_peerColorCollectible;
        }
        if (this.f51222r == null && this.f51223s == null) {
            return;
        }
        this.h = -1;
        this.f51217n = 0L;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.F && !this.I) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e() {
        k();
        this.d.f();
    }

    public final void f(boolean z10) {
        Object obj;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.J;
        cm0 cm0Var = this.f51221q0;
        mi.h0 h0Var = this.f51207e;
        if (tL_starGiftUnique != null) {
            dg.a resellAmount = tL_starGiftUnique.getResellAmount(dg.b.f8925a);
            if (tL_starGiftUnique.resale_ton_only) {
                h0Var.f19644b = ci.wb.s1(ci.wb.V0(org.telegram.messenger.bd.a0(null, null, 2131746156, tL_starGiftUnique.getResellAmount(dg.b.f8926b).d()), true), true);
                h0Var.f19645c = ci.wb.T0(org.telegram.messenger.bd.H(',', "ResellGiftBuyEq", (int) resellAmount.a()));
            } else {
                h0Var.f19644b = ci.wb.T0(org.telegram.messenger.bd.H(',', "ResellGiftBuy", (int) resellAmount.a()));
                h0Var.f19645c = null;
            }
        } else {
            if (!cm0Var.getUserConfig().q() && !cm0Var.f44388a) {
                obj = this.O;
            } else if (this.f51222r != null) {
                obj = this.Q;
            } else {
                obj = this.P;
            }
            h0Var.f19644b = obj;
            h0Var.f19645c = null;
        }
        if (cm0Var.H0() == this) {
            cm0Var.S = this;
            cm0Var.R.i((CharSequence) h0Var.f19644b, z10, true);
            cm0Var.R.g((SpannableStringBuilder) h0Var.f19645c, z10);
        }
    }

    public final void g() {
        gi.d dVar = this.f51221q0.R;
        if (dVar != null) {
            dVar.updateColors();
        }
        rl0 rl0Var = this.f51224w;
        if (rl0Var != null) {
            rl0Var.invalidate();
        }
        j(true);
        org.telegram.messenger.g0.d0(this.f51202b, new s3(this, 15));
        bm0 bm0Var = this.F;
        if (bm0Var != null) {
            l(bm0Var);
        }
    }

    public final void h() {
        int i3;
        boolean z10;
        int i10 = this.f51221q0.f44397f;
        float f10 = 0.0f;
        View view = this.f51225x;
        bm0 bm0Var = this.F;
        if (bm0Var != null && (i3 = this.f51213i0) >= 0) {
            u4.s sVar = this.f51204c;
            this.G = sVar.m(i3);
            nl0 nl0Var = this.f51202b;
            int paddingTop = nl0Var.getPaddingTop() + i10;
            int L0 = sVar.L0();
            View view2 = this.G;
            if (view2 != null) {
                if (view2.getTop() <= paddingTop) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.I = z10;
                this.H = !z10;
                bm0Var.setVisibility(0);
                bm0Var.setTranslationY((Math.max(this.G.getTop(), paddingTop) + nl0Var.getTop()) - bm0Var.getTop());
            } else if (L0 != -1 && L0 > this.f51213i0) {
                this.I = true;
                this.H = false;
                bm0Var.setVisibility(0);
                bm0Var.setTranslationY((nl0Var.getTop() + paddingTop) - bm0Var.getTop());
            } else {
                this.I = false;
                this.H = false;
                bm0Var.setVisibility(0);
                bm0Var.setTranslationY((org.telegram.messenger.g0.L(1.0f) + getHeight()) - bm0Var.getTop());
            }
            boolean z11 = this.H;
            if (bm0Var.J != z11) {
                bm0Var.J = z11;
                bm0Var.invalidate();
            }
            if (this.I) {
                f10 = org.telegram.messenger.g0.L(36.0f) + i10;
            }
            view.setTranslationY(f10);
            nl0Var.invalidate();
            invalidate();
            return;
        }
        this.H = false;
        this.I = false;
        if (view != null) {
            view.setTranslationY(0.0f);
        }
        if (bm0Var != null) {
            bm0Var.setVisibility(4);
            boolean z12 = this.H;
            if (bm0Var.J != z12) {
                bm0Var.J = z12;
                bm0Var.invalidate();
            }
        }
    }

    public final void i() {
        org.telegram.messenger.zi messageObject;
        rl0 rl0Var = this.f51224w;
        if (rl0Var != null) {
            org.telegram.ui.Cells.q1[] cells = rl0Var.getCells();
            for (int i3 = 0; i3 < cells.length; i3++) {
                org.telegram.ui.Cells.q1 q1Var = cells[i3];
                if (q1Var != null && (messageObject = q1Var.getMessageObject()) != null) {
                    messageObject.f26907u1 = true;
                    zl0 zl0Var = this.f51209f;
                    if (zl0Var != null) {
                        messageObject.f26834c1 = zl0Var.getColorId();
                    }
                    messageObject.f26837d1 = this.f51217n;
                    messageObject.f26842e1 = this.f51223s;
                    cells[i3].setAvatar(messageObject);
                    cells[i3].invalidate();
                }
            }
        }
    }

    public final void j(boolean z10) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        boolean z11;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        boolean z12;
        int i3;
        cm0 cm0Var;
        hl0 hl0Var;
        int i10;
        zl0 zl0Var = this.f51209f;
        if (zl0Var != null) {
            zl0Var.a(this.h, z10);
        }
        am0 am0Var = this.f51200a;
        if (am0Var != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.f51222r;
            if (tL_emojiStatusCollectible != null) {
                am0Var.e(tL_emojiStatusCollectible.document_id, true, z10);
                am0Var.c(org.telegram.messenger.wo.a(this.f51222r), z10);
                am0Var.d(this.f51222r.pattern_document_id, true, z10);
            } else {
                long j10 = 0;
                if (org.telegram.messenger.m5.A()) {
                    am0Var.e(0L, false, z10);
                } else {
                    TLRPC.User a22 = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).a2(0L);
                    if (a22 != null) {
                        j10 = org.telegram.messenger.m5.f(a22.emoji_status);
                    }
                    am0Var.e(j10, org.telegram.messenger.m5.A(), z10);
                }
                am0Var.b(this.h, z10);
                am0Var.d(this.f51217n, false, z10);
            }
        }
        int i11 = this.f51218n0;
        if (i11 == 0 && (hl0Var = (cm0Var = this.f51221q0).f44395e) != null) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = this.f51222r;
            if (tL_emojiStatusCollectible2 == null) {
                i10 = ((org.telegram.ui.ActionBar.d2) cm0Var).currentAccount;
                hl0Var.b(i10, this.h, z10);
            } else {
                hl0Var.c(org.telegram.messenger.wo.a(tL_emojiStatusCollectible2), z10);
            }
        }
        if (i11 == 0) {
            int i12 = this.W;
            k();
            pl0 pl0Var = this.d;
            if (i12 >= 0 && this.W < 0) {
                pl0Var.p(i12, 2);
            } else if (i12 < 0 && (i3 = this.W) >= 0) {
                pl0Var.o(i3, 2);
            }
        }
        int i13 = 0;
        while (true) {
            nl0 nl0Var = this.f51202b;
            if (i13 < nl0Var.getChildCount()) {
                View childAt = nl0Var.getChildAt(i13);
                if (childAt instanceof ll0) {
                    ll0 ll0Var = (ll0) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible3 = this.f51222r;
                    if ((tL_emojiStatusCollectible3 != null && tL_emojiStatusCollectible3.collectible_id == ll0Var.getGiftId()) || ((tL_peerColorCollectible2 = this.f51223s) != null && tL_peerColorCollectible2.collectible_id == ll0Var.getGiftId())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    ll0Var.b(z12, true);
                } else if (childAt instanceof ai.q2) {
                    ai.q2 q2Var = (ai.q2) childAt;
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible4 = this.f51222r;
                    if ((tL_emojiStatusCollectible4 != null && tL_emojiStatusCollectible4.collectible_id == q2Var.getGiftId()) || ((tL_peerColorCollectible = this.f51223s) != null && tL_peerColorCollectible.collectible_id == q2Var.getGiftId())) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    q2Var.f(z11, true);
                }
                i13++;
            } else {
                return;
            }
        }
    }

    public final void k() {
        ci.v8 v8Var;
        int i3;
        cm0 cm0Var = this.f51221q0;
        ci.v8 v8Var2 = cm0Var.f44390b;
        this.W = -1;
        this.f51201a0 = -1;
        this.f51203b0 = -1;
        this.f51205c0 = -1;
        this.f51208e0 = -1;
        this.f51210f0 = -1;
        this.f51206d0 = -1;
        this.f51212h0 = -1;
        this.f51213i0 = -1;
        this.f51214j0 = -1;
        this.f51215k0 = -1;
        this.f51211g0 = 0;
        ArrayList arrayList = this.m0;
        arrayList.clear();
        this.R = 0;
        this.T = 1;
        int i10 = 3;
        this.f51216l0 = 3;
        this.S = 2;
        int i11 = this.f51218n0;
        if (i11 == 0 && (this.h >= 0 || this.f51222r != null || this.f51223s != null)) {
            this.W = 3;
            this.f51216l0 = 5;
            this.f51201a0 = 4;
        }
        if (i11 == 1) {
            v8Var = cm0Var.f44392c;
        } else {
            v8Var = v8Var2;
        }
        if ((i11 == 0 || i11 == 1) && v8Var != null) {
            ArrayList arrayList2 = v8Var.f6203l;
            int i12 = this.f51216l0;
            this.f51216l0 = i12 + 1;
            this.f51213i0 = i12;
            if (this.L == null) {
                for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                    TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) arrayList2.get(i13)).gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        arrayList.add((TL_stars.TL_starGiftUnique) starGift);
                    }
                }
                int i14 = this.f51216l0;
                this.f51205c0 = i14;
                this.f51216l0 = arrayList.size() + i14;
                int size = arrayList.size() + this.f51211g0;
                this.f51211g0 = size;
                int i15 = this.f51216l0;
                this.f51206d0 = i15;
                if (!v8Var2.f6200i && v8Var2.f6201j) {
                    if (arrayList.isEmpty()) {
                        int i16 = this.f51216l0;
                        this.f51215k0 = i16;
                        this.f51216l0 = i16 + 2;
                        this.f51214j0 = i16 + 1;
                    }
                } else {
                    this.f51208e0 = i15;
                    int i17 = 3 - (size % 3);
                    if (size <= 0) {
                        i10 = 9;
                    } else if (i17 > 0) {
                        i10 = i17;
                    }
                    int i18 = i15 + i10;
                    this.f51216l0 = i18;
                    this.f51211g0 = size + i10;
                    this.f51210f0 = i18;
                }
                if (c()) {
                    v8Var.a();
                }
            } else if (this.K != null) {
                i3 = ((org.telegram.ui.ActionBar.d2) cm0Var).currentAccount;
                long e10 = org.telegram.messenger.h10.i(i3).e();
                for (int i19 = 0; i19 < this.K.d.size(); i19++) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.K.d.get(i19);
                    if (org.telegram.messenger.m5.o(tL_starGiftUnique.owner_id) != e10 && org.telegram.messenger.m5.o(tL_starGiftUnique.host_id) != e10) {
                        arrayList.add(tL_starGiftUnique);
                    }
                }
                int i20 = this.f51216l0;
                this.f51205c0 = i20;
                this.f51216l0 = arrayList.size() + i20;
                int size2 = arrayList.size() + this.f51211g0;
                this.f51211g0 = size2;
                int i21 = this.f51216l0;
                this.f51206d0 = i21;
                ai.w5 w5Var = this.K;
                if (w5Var.f1084t || !w5Var.f1085u) {
                    this.f51208e0 = i21;
                    int i22 = 3 - (size2 % 3);
                    if (size2 <= 0) {
                        i10 = 9;
                    } else if (i22 > 0) {
                        i10 = i22;
                    }
                    int i23 = i21 + i10;
                    this.f51216l0 = i23;
                    this.f51211g0 = size2 + i10;
                    this.f51210f0 = i23;
                }
                if (c()) {
                    this.K.g(false);
                }
            }
            int i24 = this.f51216l0;
            this.f51216l0 = i24 + 1;
            this.f51212h0 = i24;
        }
        int i25 = this.f51216l0;
        this.f51216l0 = i25 + 1;
        this.V = i25;
        bm0 bm0Var = this.F;
        if (bm0Var != null) {
            bm0Var.post(new ml0(this, 1));
        }
    }

    public final void l(bm0 bm0Var) {
        int i3;
        int i10 = org.telegram.ui.ActionBar.k6.f27878d6;
        cm0 cm0Var = this.f51221q0;
        int themedColor = cm0Var.getThemedColor(i10);
        cm0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f27824a7);
        int themedColor2 = cm0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f28290z6);
        int themedColor3 = cm0Var.getThemedColor(org.telegram.ui.ActionBar.k6.G6);
        bm0Var.f44079w.setColor(themedColor);
        bm0Var.f44081y = org.telegram.ui.ActionBar.k6.r1(0.06f, themedColor3);
        bm0Var.E = themedColor2;
        bm0Var.F = themedColor3;
        xs xsVar = bm0Var.f44071a;
        for (int i11 = 0; i11 < xsVar.getChildCount(); i11++) {
            View childAt = xsVar.getChildAt(i11);
            int R = RecyclerView.R(childAt);
            if (R != -1 && (childAt instanceof TextView)) {
                TextView textView = (TextView) childAt;
                if (R == bm0Var.d) {
                    i3 = bm0Var.F;
                } else {
                    i3 = bm0Var.E;
                }
                textView.setTextColor(i3);
                childAt.invalidate();
            }
        }
        xsVar.invalidate();
        bm0Var.invalidate();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11 = this.f51218n0;
        View view = this.f51225x;
        nl0 nl0Var = this.f51202b;
        if (i11 == 1) {
            super.onMeasure(i3, i10);
            rl0 rl0Var = this.f51224w;
            this.f51219o0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + rl0Var.getMeasuredHeight() + org.telegram.messenger.g0.f22602m;
            ((ViewGroup.MarginLayoutParams) rl0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22602m;
            ((ViewGroup.MarginLayoutParams) nl0Var.getLayoutParams()).topMargin = this.f51219o0 - org.telegram.messenger.g0.L(16.0f);
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.f51219o0 - org.telegram.messenger.g0.L(64.0f);
            ((ViewGroup.MarginLayoutParams) this.f51226y.getLayoutParams()).topMargin = this.f51219o0 - org.telegram.messenger.g0.L(16.0f);
            nl0Var.setPadding(nl0Var.getPaddingLeft(), org.telegram.messenger.g0.L(16.0f), nl0Var.getPaddingRight(), nl0Var.getPaddingBottom());
        } else {
            this.f51219o0 = org.telegram.messenger.g0.L(230.0f) + org.telegram.messenger.g0.f22602m;
            ((ViewGroup.MarginLayoutParams) nl0Var.getLayoutParams()).topMargin = this.f51219o0;
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = this.f51219o0 - org.telegram.messenger.g0.L(64.0f);
            ((ViewGroup.MarginLayoutParams) this.f51200a.getLayoutParams()).height = this.f51219o0;
        }
        super.onMeasure(i3, i10);
    }
}
