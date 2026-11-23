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
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.ra;
public final class z extends ra implements fs {
    public final ArrayList T1;
    public final List U1;
    public final List V1;
    public final List W1;
    public final TLRPC.Chat X1;
    public final ArrayList Y1;
    public final ArrayList Z1;
    public final ArrayList f59969a2;
    public final ArrayList f59970b2;
    public xg.b f59971c2;
    public int d2;
    public int f59972e2;
    public int f59973f2;
    public boolean f59974g2;
    public int f59975h2;
    public long f59976i2;
    public int f59977j2;
    public int f59978k2;
    public long f59979l2;
    public final yg.a f59980m2;
    public s2.e f59981n2;
    public int f59982o2;
    public i f59983p2;
    public final TL_stories.PrepaidGiveaway f59984q2;
    public String f59985r2;
    public boolean f59986s2;
    public boolean f59987t2;
    public final s f59988u2;

    public z(g2 g2Var, long j3, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        super(g2Var, false);
        List asList;
        List asList2;
        this.T1 = new ArrayList();
        if (r.h()) {
            asList = Arrays.asList(1, 3, 5, 7, 10, 25, 50);
        } else {
            asList = Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        }
        this.U1 = asList;
        if (r.h()) {
            asList2 = Arrays.asList(1, 3, 5, 7, 10, 25, 50);
        } else {
            asList2 = Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        }
        this.V1 = asList2;
        this.W1 = Arrays.asList(750, 10000, 50000);
        this.Y1 = new ArrayList();
        this.Z1 = new ArrayList();
        this.f59969a2 = new ArrayList();
        this.f59970b2 = new ArrayList();
        int i7 = yg.d.f61358w;
        this.d2 = 2;
        this.f59972e2 = 0;
        int i10 = yg.u.f61398w;
        this.f59973f2 = 0;
        this.f59975h2 = 12;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(new Date().getTime() + 259200000);
        calendar.set(14, 0);
        calendar.set(13, 0);
        int i11 = calendar.get(12);
        while (i11 % 5 != 0) {
            i11++;
        }
        calendar.set(12, i11);
        this.f59976i2 = calendar.getTimeInMillis();
        this.f59977j2 = 2;
        this.f59978k2 = 2;
        this.f59985r2 = "";
        this.f59987t2 = true;
        this.f59988u2 = new s(this, 0);
        this.f59984q2 = prepaidGiveaway;
        this.f39253v1 = 0.15f;
        this.f30262v0 = false;
        this.f30264w0 = false;
        this.U0 = false;
        this.f30261u0 = 0;
        c1();
        ((ViewGroup.MarginLayoutParams) this.f39247p1.getLayoutParams()).leftMargin = 0;
        ((ViewGroup.MarginLayoutParams) this.f39247p1.getLayoutParams()).rightMargin = 0;
        if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
            int i12 = yg.d.f61358w;
            this.d2 = 3;
        }
        v4.l lVar = new v4.l();
        lVar.n(350L);
        lVar.o(kr.h);
        lVar.C = false;
        lVar.f59274m = false;
        this.f39246o1.setItemAnimator(lVar);
        ek0 ek0Var = this.f39246o1;
        int i13 = this.f30261u0;
        ek0Var.setPadding(i13, 0, i13, org.telegram.messenger.g0.L(68.0f));
        this.f39246o1.setOnScrollListener(new Object());
        this.f39246o1.setOnItemClickListener(new g4(23, this, g2Var));
        TLRPC.Chat O0 = mp.u1(this.f30223a).O0(Long.valueOf(-j3));
        this.X1 = O0;
        xg.b bVar = this.f59971c2;
        ArrayList arrayList = this.T1;
        ek0 ek0Var2 = this.f39246o1;
        t tVar = new t(this);
        t tVar2 = new t(this);
        t tVar3 = new t(this);
        bVar.f60601e = arrayList;
        bVar.f60606w = O0;
        bVar.f60602f = ek0Var2;
        bVar.h = tVar;
        bVar.f60603n = tVar2;
        bVar.f60605s = tVar3;
        l1(false, false);
        yg.a aVar = new yg.a(getContext(), this.J0);
        this.f59980m2 = aVar;
        aVar.setOnClickListener(new er(this, prepaidGiveaway, j3, g2Var));
        k1(false);
        this.f30226b.addView(aVar, na.d(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        r.j(this.f30223a, O0, new u(this, 5));
        ks.f(this.f30223a).c(this, ks.f25334z3);
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        xg.b bVar = new xg.b(this.J0);
        this.f59971c2 = bVar;
        return bVar;
    }

    @Override
    public final CharSequence P0() {
        int i7 = this.f59972e2;
        int i10 = yg.d.f61358w;
        if (i7 == 1) {
            return gd.N0(2131749507, null);
        }
        return gd.a0("BoostingStartGiveaway", null, 2131753190, new Object[0]);
    }

    @Override
    public final void S0(Canvas canvas, int i7) {
        this.f59982o2 = i7;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ek0 ek0Var;
        if (i7 == ks.f25334z3 && (ek0Var = this.f39246o1) != null && ek0Var.H) {
            l1(true, true);
        }
    }

    @Override
    public final void dismiss() {
        i iVar = this.f59983p2;
        if (iVar != null) {
            iVar.run();
        }
        ks.f(this.f30223a).n(this, ks.f25334z3);
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
        int i10 = yg.d.f61358w;
        if (i7 == 2) {
            return ((Integer) this.U1.get(this.f59977j2)).intValue();
        }
        List i12 = i1();
        int i11 = this.f59978k2;
        if (i11 < 0 || i11 >= i12.size()) {
            this.f59978k2 = 0;
        }
        if (this.f59978k2 >= i12.size()) {
            return 0;
        }
        return ((Integer) i12.get(this.f59978k2)).intValue();
    }

    public final int g1() {
        int f12;
        int g10;
        int i7 = this.d2;
        int i10 = yg.d.f61358w;
        if (i7 == 2) {
            f12 = ((Integer) this.U1.get(this.f59977j2)).intValue();
            g10 = r.g();
        } else {
            TL_stars.TL_starsGiveawayOption h12 = h1(this.f59979l2);
            if (h12 != null) {
                return h12.yearly_boosts;
            }
            f12 = f1();
            g10 = r.g();
        }
        return g10 * f12;
    }

    public final TL_stars.TL_starsGiveawayOption h1(long j3) {
        ArrayList v = y8.y(this.f30223a, false).v();
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
        int i10 = yg.d.f61358w;
        if (i7 == 2) {
            return this.U1;
        }
        ArrayList arrayList = new ArrayList();
        TL_stars.TL_starsGiveawayOption h12 = h1(this.f59979l2);
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
        if (this.f59984q2 != null) {
            return true;
        }
        return false;
    }

    public final void k1(boolean z10) {
        boolean z11;
        boolean j12 = j1();
        yg.a aVar = this.f59980m2;
        if (j12) {
            TL_stories.PrepaidGiveaway prepaidGiveaway = this.f59984q2;
            if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                aVar.a(prepaidGiveaway.quantity, z10);
                return;
            }
            aVar.a(r.g() * prepaidGiveaway.quantity, z10);
            return;
        }
        int i7 = this.f59972e2;
        int i10 = yg.d.f61358w;
        if (i7 == 0) {
            aVar.a(g1(), z10);
            return;
        }
        ArrayList arrayList = this.Z1;
        int g10 = r.g() * arrayList.size();
        if (arrayList.size() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        aVar.f61332e = true;
        hi.e eVar = aVar.f61329a;
        eVar.k();
        eVar.setShowZero(true);
        eVar.setEnabled(z11);
        eVar.c(g10, z10);
        eVar.i(gd.N0(2131749507, null), z10, true);
        u6.h(n6.f29524h5, aVar.f61330b, aVar.f61331c);
    }

    public final void l1(boolean r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: wg.z.l1(boolean, boolean):void");
    }
}
