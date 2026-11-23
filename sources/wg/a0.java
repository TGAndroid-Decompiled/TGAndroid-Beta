package wg;

import android.graphics.Canvas;
import android.view.ViewGroup;
import c8.na;
import di.y8;
import fi.g4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.hr;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.sa;
public final class a0 extends sa implements gs {
    public final ArrayList T1;
    public final List U1;
    public final List V1;
    public final List W1;
    public final TLRPC.Chat X1;
    public final ArrayList Y1;
    public final ArrayList Z1;
    public final ArrayList f59703a2;
    public final ArrayList f59704b2;
    public xg.b f59705c2;
    public int d2;
    public int f59706e2;
    public int f59707f2;
    public boolean f59708g2;
    public int f59709h2;
    public long f59710i2;
    public int f59711j2;
    public int f59712k2;
    public long f59713l2;
    public final yg.a f59714m2;
    public sg.h0 f59715n2;
    public int f59716o2;
    public i f59717p2;
    public final TL_stories.PrepaidGiveaway f59718q2;
    public String f59719r2;
    public boolean f59720s2;
    public boolean f59721t2;
    public final t f59722u2;

    public a0(g2 g2Var, long j3, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        super(g2Var, false);
        List asList;
        List asList2;
        this.T1 = new ArrayList();
        if (s.h()) {
            asList = Arrays.asList(1, 3, 5, 7, 10, 25, 50);
        } else {
            asList = Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        }
        this.U1 = asList;
        if (s.h()) {
            asList2 = Arrays.asList(1, 3, 5, 7, 10, 25, 50);
        } else {
            asList2 = Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        }
        this.V1 = asList2;
        this.W1 = Arrays.asList(750, 10000, 50000);
        this.Y1 = new ArrayList();
        this.Z1 = new ArrayList();
        this.f59703a2 = new ArrayList();
        this.f59704b2 = new ArrayList();
        int i7 = yg.d.f61239w;
        this.d2 = 2;
        this.f59706e2 = 0;
        int i10 = yg.u.f61279w;
        this.f59707f2 = 0;
        this.f59709h2 = 12;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(new Date().getTime() + 259200000);
        calendar.set(14, 0);
        calendar.set(13, 0);
        int i11 = calendar.get(12);
        while (i11 % 5 != 0) {
            i11++;
        }
        calendar.set(12, i11);
        this.f59710i2 = calendar.getTimeInMillis();
        this.f59711j2 = 2;
        this.f59712k2 = 2;
        this.f59719r2 = "";
        this.f59721t2 = true;
        this.f59722u2 = new t(this, 0);
        this.f59718q2 = prepaidGiveaway;
        this.f39494v1 = 0.15f;
        this.f30178v0 = false;
        this.f30180w0 = false;
        this.U0 = false;
        this.f30177u0 = 0;
        c1();
        ((ViewGroup.MarginLayoutParams) this.f39488p1.getLayoutParams()).leftMargin = 0;
        ((ViewGroup.MarginLayoutParams) this.f39488p1.getLayoutParams()).rightMargin = 0;
        if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
            int i12 = yg.d.f61239w;
            this.d2 = 3;
        }
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(nr.h);
        kVar.C = false;
        kVar.f59139m = false;
        this.f39487o1.setItemAnimator(kVar);
        ek0 ek0Var = this.f39487o1;
        int i13 = this.f30177u0;
        ek0Var.setPadding(i13, 0, i13, org.telegram.messenger.g0.L(68.0f));
        this.f39487o1.setOnScrollListener(new Object());
        this.f39487o1.setOnItemClickListener(new g4(23, this, g2Var));
        TLRPC.Chat O0 = np.u1(this.f30139a).O0(Long.valueOf(-j3));
        this.X1 = O0;
        xg.b bVar = this.f59705c2;
        ArrayList arrayList = this.T1;
        ek0 ek0Var2 = this.f39487o1;
        u uVar = new u(this);
        u uVar2 = new u(this);
        u uVar3 = new u(this);
        bVar.f60483e = arrayList;
        bVar.f60488w = O0;
        bVar.f60484f = ek0Var2;
        bVar.h = uVar;
        bVar.f60485n = uVar2;
        bVar.f60487s = uVar3;
        l1(false, false);
        yg.a aVar = new yg.a(getContext(), this.J0);
        this.f59714m2 = aVar;
        aVar.setOnClickListener(new hr(this, prepaidGiveaway, j3, g2Var));
        k1(false);
        this.f30142b.addView(aVar, na.d(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        s.j(this.f30139a, O0, new v(this, 5));
        ls.f(this.f30139a).c(this, ls.f25393z3);
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        xg.b bVar = new xg.b(this.J0);
        this.f59705c2 = bVar;
        return bVar;
    }

    @Override
    public final CharSequence P0() {
        int i7 = this.f59706e2;
        int i10 = yg.d.f61239w;
        if (i7 == 1) {
            return hd.N0(2131749507, null);
        }
        return hd.a0("BoostingStartGiveaway", null, 2131753190, new Object[0]);
    }

    @Override
    public final void S0(Canvas canvas, int i7) {
        this.f59716o2 = i7;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ek0 ek0Var;
        if (i7 == ls.f25393z3 && (ek0Var = this.f39487o1) != null && ek0Var.H) {
            l1(true, true);
        }
    }

    @Override
    public final void dismiss() {
        i iVar = this.f59717p2;
        if (iVar != null) {
            iVar.run();
        }
        ls.f(this.f30139a).n(this, ls.f25393z3);
    }

    public final ArrayList e1(long j3) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TL_stars.TL_starsGiveawayOption h12 = h1(j3);
        if (h12 != null) {
            for (int i7 = 0; i7 < h12.winners.size(); i7++) {
                TL_stars.TL_starsGiveawayWinnersOption tL_starsGiveawayWinnersOption = h12.winners.get(i7);
                if (!arrayList.contains(Integer.valueOf(tL_starsGiveawayWinnersOption.users))) {
                    arrayList.add(Integer.valueOf(tL_starsGiveawayWinnersOption.users));
                    arrayList2.add(Long.valueOf(tL_starsGiveawayWinnersOption.per_user_stars));
                }
            }
        }
        return arrayList2;
    }

    public final int f1() {
        int i7 = this.d2;
        int i10 = yg.d.f61239w;
        if (i7 == 2) {
            return ((Integer) this.U1.get(this.f59711j2)).intValue();
        }
        List i12 = i1();
        int i11 = this.f59712k2;
        if (i11 < 0 || i11 >= i12.size()) {
            this.f59712k2 = 0;
        }
        if (this.f59712k2 >= i12.size()) {
            return 0;
        }
        return ((Integer) i12.get(this.f59712k2)).intValue();
    }

    public final int g1() {
        int f12;
        int g10;
        int i7 = this.d2;
        int i10 = yg.d.f61239w;
        if (i7 == 2) {
            f12 = ((Integer) this.U1.get(this.f59711j2)).intValue();
            g10 = s.g();
        } else {
            TL_stars.TL_starsGiveawayOption h12 = h1(this.f59713l2);
            if (h12 != null) {
                return h12.yearly_boosts;
            }
            f12 = f1();
            g10 = s.g();
        }
        return g10 * f12;
    }

    public final TL_stars.TL_starsGiveawayOption h1(long j3) {
        ArrayList v = y8.y(this.f30139a, false).v();
        if (v != null) {
            for (int i7 = 0; i7 < v.size(); i7++) {
                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) v.get(i7);
                if (tL_starsGiveawayOption != null && tL_starsGiveawayOption.stars == j3) {
                    return tL_starsGiveawayOption;
                }
            }
            return null;
        }
        return null;
    }

    public final List i1() {
        int i7 = this.d2;
        int i10 = yg.d.f61239w;
        if (i7 == 2) {
            return this.U1;
        }
        ArrayList arrayList = new ArrayList();
        TL_stars.TL_starsGiveawayOption h12 = h1(this.f59713l2);
        if (h12 != null) {
            for (int i11 = 0; i11 < h12.winners.size(); i11++) {
                TL_stars.TL_starsGiveawayWinnersOption tL_starsGiveawayWinnersOption = h12.winners.get(i11);
                if (!arrayList.contains(Integer.valueOf(tL_starsGiveawayWinnersOption.users))) {
                    arrayList.add(Integer.valueOf(tL_starsGiveawayWinnersOption.users));
                }
            }
        }
        return arrayList;
    }

    public final boolean j1() {
        if (this.f59718q2 != null) {
            return true;
        }
        return false;
    }

    public final void k1(boolean z10) {
        boolean z11;
        boolean j12 = j1();
        yg.a aVar = this.f59714m2;
        if (j12) {
            TL_stories.PrepaidGiveaway prepaidGiveaway = this.f59718q2;
            if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                aVar.a(prepaidGiveaway.quantity, z10);
                return;
            }
            aVar.a(s.g() * prepaidGiveaway.quantity, z10);
            return;
        }
        int i7 = this.f59706e2;
        int i10 = yg.d.f61239w;
        if (i7 == 0) {
            aVar.a(g1(), z10);
            return;
        }
        ArrayList arrayList = this.Z1;
        int g10 = s.g() * arrayList.size();
        if (arrayList.size() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        aVar.f61213e = true;
        hi.d dVar = aVar.f61210a;
        dVar.k();
        dVar.setShowZero(true);
        dVar.setEnabled(z11);
        dVar.c(g10, z10);
        dVar.i(hd.N0(2131749507, null), z10, true);
        t6.h(m6.f29420h5, aVar.f61211b, aVar.f61212c);
    }

    public final void l1(boolean r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: wg.a0.l1(boolean, boolean):void");
    }
}
