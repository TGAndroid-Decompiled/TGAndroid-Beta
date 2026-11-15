package wg;

import android.graphics.Canvas;
import android.view.ViewGroup;
import di.v8;
import fi.i4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.yq;
public final class y extends ja implements is {
    public final ArrayList T1;
    public final List U1;
    public final List V1;
    public final List W1;
    public final TLRPC.Chat X1;
    public final ArrayList Y1;
    public final ArrayList Z1;
    public final ArrayList f59273a2;
    public final ArrayList f59274b2;
    public xg.b f59275c2;
    public int d2;
    public int f59276e2;
    public int f59277f2;
    public boolean f59278g2;
    public int f59279h2;
    public long f59280i2;
    public int f59281j2;
    public int f59282k2;
    public long f59283l2;
    public final yg.a f59284m2;
    public sg.h0 f59285n2;
    public int f59286o2;
    public i f59287p2;
    public final TL_stories.PrepaidGiveaway f59288q2;
    public String f59289r2;
    public boolean f59290s2;
    public boolean f59291t2;
    public final r f59292u2;

    public y(e2 e2Var, long j3, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        super(e2Var, false);
        List asList;
        List asList2;
        this.T1 = new ArrayList();
        if (q.h()) {
            asList = Arrays.asList(1, 3, 5, 7, 10, 25, 50);
        } else {
            asList = Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        }
        this.U1 = asList;
        if (q.h()) {
            asList2 = Arrays.asList(1, 3, 5, 7, 10, 25, 50);
        } else {
            asList2 = Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        }
        this.V1 = asList2;
        this.W1 = Arrays.asList(750, 10000, 50000);
        this.Y1 = new ArrayList();
        this.Z1 = new ArrayList();
        this.f59273a2 = new ArrayList();
        this.f59274b2 = new ArrayList();
        int i7 = yg.d.f60661w;
        this.d2 = 2;
        this.f59276e2 = 0;
        int i10 = yg.u.f60701w;
        this.f59277f2 = 0;
        this.f59279h2 = 12;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(new Date().getTime() + 259200000);
        calendar.set(14, 0);
        calendar.set(13, 0);
        int i11 = calendar.get(12);
        while (i11 % 5 != 0) {
            i11++;
        }
        calendar.set(12, i11);
        this.f59280i2 = calendar.getTimeInMillis();
        this.f59281j2 = 2;
        this.f59282k2 = 2;
        this.f59289r2 = "";
        this.f59291t2 = true;
        this.f59292u2 = new r(this, 0);
        this.f59288q2 = prepaidGiveaway;
        this.f35943v1 = 0.15f;
        this.f29718v0 = false;
        this.f29720w0 = false;
        this.U0 = false;
        this.f29717u0 = 0;
        b1();
        ((ViewGroup.MarginLayoutParams) this.f35937p1.getLayoutParams()).leftMargin = 0;
        ((ViewGroup.MarginLayoutParams) this.f35937p1.getLayoutParams()).rightMargin = 0;
        if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
            int i12 = yg.d.f60661w;
            this.d2 = 3;
        }
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(er.h);
        kVar.C = false;
        kVar.f58564m = false;
        this.f35936o1.setItemAnimator(kVar);
        uj0 uj0Var = this.f35936o1;
        int i13 = this.f29717u0;
        uj0Var.setPadding(i13, 0, i13, org.telegram.messenger.g0.L(68.0f));
        this.f35936o1.setOnScrollListener(new Object());
        this.f35936o1.setOnItemClickListener(new i4(23, this, e2Var));
        TLRPC.Chat M0 = np.s1(this.f29679a).M0(Long.valueOf(-j3));
        this.X1 = M0;
        xg.b bVar = this.f59275c2;
        ArrayList arrayList = this.T1;
        uj0 uj0Var2 = this.f35936o1;
        s sVar = new s(this);
        s sVar2 = new s(this);
        s sVar3 = new s(this);
        bVar.f59903e = arrayList;
        bVar.f59908w = M0;
        bVar.f59904f = uj0Var2;
        bVar.h = sVar;
        bVar.f59905n = sVar2;
        bVar.f59907s = sVar3;
        k1(false, false);
        yg.a aVar = new yg.a(getContext(), this.J0);
        this.f59284m2 = aVar;
        aVar.setOnClickListener(new yq(this, prepaidGiveaway, j3, e2Var));
        j1(false);
        this.f29682b.addView(aVar, c8.ja.d(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        q.j(this.f29679a, M0, new t(this, 5));
        ns.f(this.f29679a).c(this, ns.f25603x3);
    }

    @Override
    public final tj0 L0(uj0 uj0Var) {
        xg.b bVar = new xg.b(this.J0);
        this.f59275c2 = bVar;
        return bVar;
    }

    @Override
    public final CharSequence O0() {
        int i7 = this.f59276e2;
        int i10 = yg.d.f60661w;
        if (i7 == 1) {
            return hd.M0(2131749680, null);
        }
        return hd.a0("BoostingStartGiveaway", null, 2131753193, new Object[0]);
    }

    @Override
    public final void R0(Canvas canvas, int i7) {
        this.f59286o2 = i7;
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
        uj0 uj0Var;
        if (i7 == ns.f25603x3 && (uj0Var = this.f35936o1) != null && uj0Var.H) {
            k1(true, true);
        }
    }

    @Override
    public final void dismiss() {
        i iVar = this.f59287p2;
        if (iVar != null) {
            iVar.run();
        }
        ns.f(this.f29679a).n(this, ns.f25603x3);
    }

    public final int e1() {
        int i7 = this.d2;
        int i10 = yg.d.f60661w;
        if (i7 == 2) {
            return ((Integer) this.U1.get(this.f59281j2)).intValue();
        }
        List h12 = h1();
        int i11 = this.f59282k2;
        if (i11 < 0 || i11 >= h12.size()) {
            this.f59282k2 = 0;
        }
        if (this.f59282k2 >= h12.size()) {
            return 0;
        }
        return ((Integer) h12.get(this.f59282k2)).intValue();
    }

    public final int f1() {
        int e12;
        int g10;
        int i7 = this.d2;
        int i10 = yg.d.f60661w;
        if (i7 == 2) {
            e12 = ((Integer) this.U1.get(this.f59281j2)).intValue();
            g10 = q.g();
        } else {
            TL_stars.TL_starsGiveawayOption g12 = g1(this.f59283l2);
            if (g12 != null) {
                return g12.yearly_boosts;
            }
            e12 = e1();
            g10 = q.g();
        }
        return g10 * e12;
    }

    public final TL_stars.TL_starsGiveawayOption g1(long j3) {
        ArrayList v = v8.y(this.f29679a, false).v();
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
        int i7 = this.d2;
        int i10 = yg.d.f60661w;
        if (i7 == 2) {
            return this.U1;
        }
        ArrayList arrayList = new ArrayList();
        TL_stars.TL_starsGiveawayOption g12 = g1(this.f59283l2);
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
        if (this.f59288q2 != null) {
            return true;
        }
        return false;
    }

    public final void j1(boolean z10) {
        boolean z11;
        boolean i12 = i1();
        yg.a aVar = this.f59284m2;
        if (i12) {
            TL_stories.PrepaidGiveaway prepaidGiveaway = this.f59288q2;
            if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                aVar.a(prepaidGiveaway.quantity, z10);
                return;
            }
            aVar.a(q.g() * prepaidGiveaway.quantity, z10);
            return;
        }
        int i7 = this.f59276e2;
        int i10 = yg.d.f60661w;
        if (i7 == 0) {
            aVar.a(f1(), z10);
            return;
        }
        ArrayList arrayList = this.Z1;
        int g10 = q.g() * arrayList.size();
        if (arrayList.size() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        aVar.f60635e = true;
        hi.d dVar = aVar.f60632a;
        dVar.k();
        dVar.setShowZero(true);
        dVar.setEnabled(z11);
        dVar.c(g10, z10);
        dVar.i(hd.M0(2131749680, null), z10, true);
        q6.h(j6.f28922h5, aVar.f60633b, aVar.f60634c);
    }

    public final void k1(boolean r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: wg.y.k1(boolean, boolean):void");
    }
}
