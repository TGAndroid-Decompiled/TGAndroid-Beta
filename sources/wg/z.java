package wg;

import android.graphics.Canvas;
import android.view.ViewGroup;
import bi.ea;
import c8.ha;
import di.q4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.wq;
public final class z extends ma implements ls {
    public final ArrayList S1;
    public final List T1;
    public final List U1;
    public final List V1;
    public final TLRPC.Chat W1;
    public final ArrayList X1;
    public final ArrayList Y1;
    public final ArrayList Z1;
    public final ArrayList f57841a2;
    public xg.c f57842b2;
    public int f57843c2;
    public int d2;
    public int f57844e2;
    public boolean f57845f2;
    public int f57846g2;
    public long f57847h2;
    public int f57848i2;
    public int f57849j2;
    public long f57850k2;
    public final yg.a f57851l2;
    public sg.i0 f57852m2;
    public int f57853n2;
    public i f57854o2;
    public final TL_stories.PrepaidGiveaway f57855p2;
    public String f57856q2;
    public boolean f57857r2;
    public boolean f57858s2;
    public final s f57859t2;

    public z(f2 f2Var, long j3, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        super(f2Var, false);
        List asList;
        List asList2;
        this.S1 = new ArrayList();
        if (r.h()) {
            asList = Arrays.asList(1, 3, 5, 7, 10, 25, 50);
        } else {
            asList = Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        }
        this.T1 = asList;
        if (r.h()) {
            asList2 = Arrays.asList(1, 3, 5, 7, 10, 25, 50);
        } else {
            asList2 = Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        }
        this.U1 = asList2;
        this.V1 = Arrays.asList(750, 10000, 50000);
        this.X1 = new ArrayList();
        this.Y1 = new ArrayList();
        this.Z1 = new ArrayList();
        this.f57841a2 = new ArrayList();
        int i7 = yg.d.f59457w;
        this.f57843c2 = 2;
        this.d2 = 0;
        int i10 = yg.u.f59497w;
        this.f57844e2 = 0;
        this.f57846g2 = 12;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(new Date().getTime() + 259200000);
        calendar.set(14, 0);
        calendar.set(13, 0);
        int i11 = calendar.get(12);
        while (i11 % 5 != 0) {
            i11++;
        }
        calendar.set(12, i11);
        this.f57847h2 = calendar.getTimeInMillis();
        this.f57848i2 = 2;
        this.f57849j2 = 2;
        this.f57856q2 = "";
        this.f57858s2 = true;
        this.f57859t2 = new s(this, 0);
        this.f57855p2 = prepaidGiveaway;
        this.f35908u1 = 0.15f;
        this.f28706u0 = false;
        this.f28707v0 = false;
        this.T0 = false;
        this.f28705t0 = 0;
        b1();
        ((ViewGroup.MarginLayoutParams) this.f35902o1.getLayoutParams()).leftMargin = 0;
        ((ViewGroup.MarginLayoutParams) this.f35902o1.getLayoutParams()).rightMargin = 0;
        if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
            int i12 = yg.d.f59457w;
            this.f57843c2 = 3;
        }
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(wq.h);
        kVar.C = false;
        kVar.f57079m = false;
        this.n1.setItemAnimator(kVar);
        pj0 pj0Var = this.n1;
        int i13 = this.f28705t0;
        pj0Var.setPadding(i13, 0, i13, org.telegram.messenger.g0.L(68.0f));
        this.n1.setOnScrollListener(new Object());
        this.n1.setOnItemClickListener(new q4(23, this, f2Var));
        TLRPC.Chat M0 = qp.s1(this.f28669a).M0(Long.valueOf(-j3));
        this.W1 = M0;
        xg.c cVar = this.f57842b2;
        ArrayList arrayList = this.S1;
        pj0 pj0Var2 = this.n1;
        t tVar = new t(this);
        t tVar2 = new t(this);
        t tVar3 = new t(this);
        cVar.f58721e = arrayList;
        cVar.f58726w = M0;
        cVar.f58722f = pj0Var2;
        cVar.h = tVar;
        cVar.f58723n = tVar2;
        cVar.f58725s = tVar3;
        k1(false, false);
        yg.a aVar = new yg.a(getContext(), this.I0);
        this.f57851l2 = aVar;
        aVar.setOnClickListener(new qq(this, prepaidGiveaway, j3, f2Var));
        j1(false);
        this.f28672b.addView(aVar, ha.d(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        r.j(this.f28669a, M0, new u(this, 5));
        qs.f(this.f28669a).c(this, qs.f25111x3);
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        xg.c cVar = new xg.c(this.I0);
        this.f57842b2 = cVar;
        return cVar;
    }

    @Override
    public final CharSequence O0() {
        int i7 = this.d2;
        int i10 = yg.d.f59457w;
        if (i7 == 1) {
            return id.M0(2131749680, null);
        }
        return id.a0("BoostingStartGiveaway", null, 2131753193, new Object[0]);
    }

    @Override
    public final void R0(Canvas canvas, int i7) {
        this.f57853n2 = i7;
    }

    public final ArrayList d1(long j3) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TL_stars.TL_starsGiveawayOption g12 = g1(j3);
        if (g12 != null) {
            for (int i7 = 0; i7 < g12.winners.size(); i7++) {
                TL_stars.TL_starsGiveawayWinnersOption tL_starsGiveawayWinnersOption = g12.winners.get(i7);
                if (!arrayList.contains(Integer.valueOf(tL_starsGiveawayWinnersOption.users))) {
                    arrayList.add(Integer.valueOf(tL_starsGiveawayWinnersOption.users));
                    arrayList2.add(Long.valueOf(tL_starsGiveawayWinnersOption.per_user_stars));
                }
            }
        }
        return arrayList2;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        pj0 pj0Var;
        if (i7 == qs.f25111x3 && (pj0Var = this.n1) != null && pj0Var.G) {
            k1(true, true);
        }
    }

    @Override
    public final void dismiss() {
        i iVar = this.f57854o2;
        if (iVar != null) {
            iVar.run();
        }
        qs.f(this.f28669a).n(this, qs.f25111x3);
    }

    public final int e1() {
        int i7 = this.f57843c2;
        int i10 = yg.d.f59457w;
        if (i7 == 2) {
            return ((Integer) this.T1.get(this.f57848i2)).intValue();
        }
        List h12 = h1();
        int i11 = this.f57849j2;
        if (i11 < 0 || i11 >= h12.size()) {
            this.f57849j2 = 0;
        }
        if (this.f57849j2 >= h12.size()) {
            return 0;
        }
        return ((Integer) h12.get(this.f57849j2)).intValue();
    }

    public final int f1() {
        int e12;
        int g10;
        int i7 = this.f57843c2;
        int i10 = yg.d.f59457w;
        if (i7 == 2) {
            e12 = ((Integer) this.T1.get(this.f57848i2)).intValue();
            g10 = r.g();
        } else {
            TL_stars.TL_starsGiveawayOption g12 = g1(this.f57850k2);
            if (g12 != null) {
                return g12.yearly_boosts;
            }
            e12 = e1();
            g10 = r.g();
        }
        return g10 * e12;
    }

    public final TL_stars.TL_starsGiveawayOption g1(long j3) {
        ArrayList v = ea.y(this.f28669a, false).v();
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

    public final List h1() {
        int i7 = this.f57843c2;
        int i10 = yg.d.f59457w;
        if (i7 == 2) {
            return this.T1;
        }
        ArrayList arrayList = new ArrayList();
        TL_stars.TL_starsGiveawayOption g12 = g1(this.f57850k2);
        if (g12 != null) {
            for (int i11 = 0; i11 < g12.winners.size(); i11++) {
                TL_stars.TL_starsGiveawayWinnersOption tL_starsGiveawayWinnersOption = g12.winners.get(i11);
                if (!arrayList.contains(Integer.valueOf(tL_starsGiveawayWinnersOption.users))) {
                    arrayList.add(Integer.valueOf(tL_starsGiveawayWinnersOption.users));
                }
            }
        }
        return arrayList;
    }

    public final boolean i1() {
        if (this.f57855p2 != null) {
            return true;
        }
        return false;
    }

    public final void j1(boolean z9) {
        boolean z10;
        boolean i12 = i1();
        yg.a aVar = this.f57851l2;
        if (i12) {
            TL_stories.PrepaidGiveaway prepaidGiveaway = this.f57855p2;
            if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                aVar.a(prepaidGiveaway.quantity, z9);
                return;
            }
            aVar.a(r.g() * prepaidGiveaway.quantity, z9);
            return;
        }
        int i7 = this.d2;
        int i10 = yg.d.f59457w;
        if (i7 == 0) {
            aVar.a(f1(), z9);
            return;
        }
        ArrayList arrayList = this.Y1;
        int g10 = r.g() * arrayList.size();
        if (arrayList.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        aVar.f59431e = true;
        fi.d dVar = aVar.f59428a;
        dVar.k();
        dVar.setShowZero(true);
        dVar.setEnabled(z10);
        dVar.c(g10, z9);
        dVar.i(id.M0(2131749680, null), z9, true);
        t6.h(m6.f27963h5, aVar.f59429b, aVar.f59430c);
    }

    public final void k1(boolean r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: wg.z.k1(boolean, boolean):void");
    }
}
