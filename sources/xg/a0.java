package xg;

import android.graphics.Canvas;
import android.view.ViewGroup;
import b8.mf;
import ci.e9;
import ei.q4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.rq;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.xq;
public final class a0 extends ma implements cs {
    public final ArrayList Q1;
    public final List R1;
    public final List S1;
    public final List T1;
    public final TLRPC.Chat U1;
    public final ArrayList V1;
    public final ArrayList W1;
    public final ArrayList X1;
    public final ArrayList Y1;
    public yg.b Z1;
    public int f58632a2;
    public int f58633b2;
    public int c2;
    public boolean f58634d2;
    public int f58635e2;
    public long f58636f2;
    public int f58637g2;
    public int f58638h2;
    public long f58639i2;
    public final zg.a f58640j2;
    public ua.b f58641k2;
    public int f58642l2;
    public k f58643m2;
    public final TL_stories.PrepaidGiveaway f58644n2;
    public String f58645o2;
    public boolean f58646p2;
    public boolean f58647q2;
    public final t f58648r2;

    public a0(d2 d2Var, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        super(d2Var, false);
        List asList;
        List asList2;
        this.Q1 = new ArrayList();
        if (s.h()) {
            asList = Arrays.asList(1, 3, 5, 7, 10, 25, 50);
        } else {
            asList = Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        }
        this.R1 = asList;
        if (s.h()) {
            asList2 = Arrays.asList(1, 3, 5, 7, 10, 25, 50);
        } else {
            asList2 = Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        }
        this.S1 = asList2;
        this.T1 = Arrays.asList(750, 10000, 50000);
        this.V1 = new ArrayList();
        this.W1 = new ArrayList();
        this.X1 = new ArrayList();
        this.Y1 = new ArrayList();
        int i3 = zg.d.f60490w;
        this.f58632a2 = 2;
        this.f58633b2 = 0;
        int i10 = zg.u.f60530w;
        this.c2 = 0;
        this.f58635e2 = 12;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(new Date().getTime() + 259200000);
        calendar.set(14, 0);
        calendar.set(13, 0);
        int i11 = calendar.get(12);
        while (i11 % 5 != 0) {
            i11++;
        }
        calendar.set(12, i11);
        this.f58636f2 = calendar.getTimeInMillis();
        this.f58637g2 = 2;
        this.f58638h2 = 2;
        this.f58645o2 = "";
        this.f58647q2 = true;
        this.f58648r2 = new t(this, 0);
        this.f58644n2 = prepaidGiveaway;
        this.f36108s1 = 0.15f;
        this.f28619v0 = false;
        this.f28621w0 = false;
        this.U0 = false;
        this.f28618u0 = 0;
        b1();
        ((ViewGroup.MarginLayoutParams) this.m1.getLayoutParams()).leftMargin = 0;
        ((ViewGroup.MarginLayoutParams) this.m1.getLayoutParams()).rightMargin = 0;
        if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
            int i12 = zg.d.f60490w;
            this.f58632a2 = 3;
        }
        u4.k kVar = new u4.k();
        kVar.n(350L);
        kVar.o(xq.h);
        kVar.C = false;
        kVar.f55567m = false;
        this.f36102l1.setItemAnimator(kVar);
        tj0 tj0Var = this.f36102l1;
        int i13 = this.f28618u0;
        tj0Var.setPadding(i13, 0, i13, org.telegram.messenger.g0.L(68.0f));
        this.f36102l1.setOnScrollListener(new Object());
        this.f36102l1.setOnItemClickListener(new q4(23, this, d2Var));
        TLRPC.Chat M0 = hp.s1(this.f28583a).M0(Long.valueOf(-j10));
        this.U1 = M0;
        yg.b bVar = this.Z1;
        ArrayList arrayList = this.Q1;
        tj0 tj0Var2 = this.f36102l1;
        u uVar = new u(this);
        u uVar2 = new u(this);
        u uVar3 = new u(this);
        bVar.f59431e = arrayList;
        bVar.f59436w = M0;
        bVar.f59432f = tj0Var2;
        bVar.h = uVar;
        bVar.f59433n = uVar2;
        bVar.f59435s = uVar3;
        k1(false, false);
        zg.a aVar = new zg.a(getContext(), this.J0);
        this.f58640j2 = aVar;
        aVar.setOnClickListener(new rq(this, prepaidGiveaway, j10, d2Var));
        j1(false);
        this.f28586b.addView(aVar, mf.d(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        s.j(this.f28583a, M0, new v(this, 5));
        hs.f(this.f28583a).c(this, hs.f23336x3);
    }

    @Override
    public final sj0 L0(tj0 tj0Var) {
        yg.b bVar = new yg.b(this.J0);
        this.Z1 = bVar;
        return bVar;
    }

    @Override
    public final CharSequence O0() {
        int i3 = this.f58633b2;
        int i10 = zg.d.f60490w;
        if (i3 == 1) {
            return bd.M0(2131749688, null);
        }
        return bd.a0("BoostingStartGiveaway", null, 2131753193, new Object[0]);
    }

    @Override
    public final void R0(Canvas canvas, int i3) {
        this.f58642l2 = i3;
    }

    public final ArrayList d1(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TL_stars.TL_starsGiveawayOption g12 = g1(j10);
        if (g12 != null) {
            for (int i3 = 0; i3 < g12.winners.size(); i3++) {
                TL_stars.TL_starsGiveawayWinnersOption tL_starsGiveawayWinnersOption = g12.winners.get(i3);
                if (!arrayList.contains(Integer.valueOf(tL_starsGiveawayWinnersOption.users))) {
                    arrayList.add(Integer.valueOf(tL_starsGiveawayWinnersOption.users));
                    arrayList2.add(Long.valueOf(tL_starsGiveawayWinnersOption.per_user_stars));
                }
            }
        }
        return arrayList2;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        tj0 tj0Var;
        if (i3 == hs.f23336x3 && (tj0Var = this.f36102l1) != null && tj0Var.H) {
            k1(true, true);
        }
    }

    @Override
    public final void dismiss() {
        k kVar = this.f58643m2;
        if (kVar != null) {
            kVar.run();
        }
        hs.f(this.f28583a).n(this, hs.f23336x3);
    }

    public final int e1() {
        int i3 = this.f58632a2;
        int i10 = zg.d.f60490w;
        if (i3 == 2) {
            return ((Integer) this.R1.get(this.f58637g2)).intValue();
        }
        List h12 = h1();
        int i11 = this.f58638h2;
        if (i11 < 0 || i11 >= h12.size()) {
            this.f58638h2 = 0;
        }
        if (this.f58638h2 >= h12.size()) {
            return 0;
        }
        return ((Integer) h12.get(this.f58638h2)).intValue();
    }

    public final int f1() {
        int e12;
        int g7;
        int i3 = this.f58632a2;
        int i10 = zg.d.f60490w;
        if (i3 == 2) {
            e12 = ((Integer) this.R1.get(this.f58637g2)).intValue();
            g7 = s.g();
        } else {
            TL_stars.TL_starsGiveawayOption g12 = g1(this.f58639i2);
            if (g12 != null) {
                return g12.yearly_boosts;
            }
            e12 = e1();
            g7 = s.g();
        }
        return g7 * e12;
    }

    public final TL_stars.TL_starsGiveawayOption g1(long j10) {
        ArrayList v = e9.y(this.f28583a, false).v();
        if (v != null) {
            for (int i3 = 0; i3 < v.size(); i3++) {
                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) v.get(i3);
                if (tL_starsGiveawayOption != null && tL_starsGiveawayOption.stars == j10) {
                    return tL_starsGiveawayOption;
                }
            }
            return null;
        }
        return null;
    }

    public final List h1() {
        int i3 = this.f58632a2;
        int i10 = zg.d.f60490w;
        if (i3 == 2) {
            return this.R1;
        }
        ArrayList arrayList = new ArrayList();
        TL_stars.TL_starsGiveawayOption g12 = g1(this.f58639i2);
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
        if (this.f58644n2 != null) {
            return true;
        }
        return false;
    }

    public final void j1(boolean z10) {
        boolean z11;
        boolean i12 = i1();
        zg.a aVar = this.f58640j2;
        if (i12) {
            TL_stories.PrepaidGiveaway prepaidGiveaway = this.f58644n2;
            if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                aVar.a(prepaidGiveaway.quantity, z10);
                return;
            }
            aVar.a(s.g() * prepaidGiveaway.quantity, z10);
            return;
        }
        int i3 = this.f58633b2;
        int i10 = zg.d.f60490w;
        if (i3 == 0) {
            aVar.a(f1(), z10);
            return;
        }
        ArrayList arrayList = this.W1;
        int g7 = s.g() * arrayList.size();
        if (arrayList.size() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        aVar.f60464e = true;
        gi.d dVar = aVar.f60461a;
        dVar.k();
        dVar.setShowZero(true);
        dVar.setEnabled(z11);
        dVar.c(g7, z10);
        dVar.i(bd.M0(2131749688, null), z10, true);
        r6.i(k6.f27954h5, aVar.f60462b, aVar.f60463c);
    }

    public final void k1(boolean r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: xg.a0.k1(boolean, boolean):void");
    }
}
