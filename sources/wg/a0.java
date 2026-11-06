package wg;

import android.graphics.Canvas;
import android.view.ViewGroup;
import bi.ea;
import c8.ha;
import di.p4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.rq;
import org.telegram.ui.Components.xq;
public final class a0 extends na implements ls {
    public final ArrayList P1;
    public final List Q1;
    public final List R1;
    public final List S1;
    public final TLRPC.Chat T1;
    public final ArrayList U1;
    public final ArrayList V1;
    public final ArrayList W1;
    public final ArrayList X1;
    public xg.c Y1;
    public int Z1;
    public int f57586a2;
    public int f57587b2;
    public boolean f57588c2;
    public int d2;
    public long f57589e2;
    public int f57590f2;
    public int f57591g2;
    public long f57592h2;
    public final yg.a f57593i2;
    public sg.i0 f57594j2;
    public int f57595k2;
    public i f57596l2;
    public final TL_stories.PrepaidGiveaway f57597m2;
    public String f57598n2;
    public boolean f57599o2;
    public boolean f57600p2;
    public final t f57601q2;

    public a0(f2 f2Var, long j3, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        super(f2Var, false);
        List asList;
        List asList2;
        this.P1 = new ArrayList();
        if (s.h()) {
            asList = Arrays.asList(1, 3, 5, 7, 10, 25, 50);
        } else {
            asList = Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        }
        this.Q1 = asList;
        if (s.h()) {
            asList2 = Arrays.asList(1, 3, 5, 7, 10, 25, 50);
        } else {
            asList2 = Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        }
        this.R1 = asList2;
        this.S1 = Arrays.asList(750, 10000, 50000);
        this.U1 = new ArrayList();
        this.V1 = new ArrayList();
        this.W1 = new ArrayList();
        this.X1 = new ArrayList();
        int i7 = yg.d.f59352w;
        this.Z1 = 2;
        this.f57586a2 = 0;
        int i10 = yg.u.f59392w;
        this.f57587b2 = 0;
        this.d2 = 12;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(new Date().getTime() + 259200000);
        calendar.set(14, 0);
        calendar.set(13, 0);
        int i11 = calendar.get(12);
        while (i11 % 5 != 0) {
            i11++;
        }
        calendar.set(12, i11);
        this.f57589e2 = calendar.getTimeInMillis();
        this.f57590f2 = 2;
        this.f57591g2 = 2;
        this.f57598n2 = "";
        this.f57600p2 = true;
        this.f57601q2 = new t(this, 0);
        this.f57597m2 = prepaidGiveaway;
        this.f36227r1 = 0.15f;
        this.f28646u0 = false;
        this.f28647v0 = false;
        this.T0 = false;
        this.f28645t0 = 0;
        b1();
        ((ViewGroup.MarginLayoutParams) this.l1.getLayoutParams()).leftMargin = 0;
        ((ViewGroup.MarginLayoutParams) this.l1.getLayoutParams()).rightMargin = 0;
        if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
            int i12 = yg.d.f59352w;
            this.Z1 = 3;
        }
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(xq.h);
        kVar.C = false;
        kVar.f56979m = false;
        this.f36222k1.setItemAnimator(kVar);
        pj0 pj0Var = this.f36222k1;
        int i13 = this.f28645t0;
        pj0Var.setPadding(i13, 0, i13, org.telegram.messenger.g0.L(68.0f));
        this.f36222k1.setOnScrollListener(new Object());
        this.f36222k1.setOnItemClickListener(new p4(23, this, f2Var));
        TLRPC.Chat M0 = qp.s1(this.f28612a).M0(Long.valueOf(-j3));
        this.T1 = M0;
        xg.c cVar = this.Y1;
        ArrayList arrayList = this.P1;
        pj0 pj0Var2 = this.f36222k1;
        u uVar = new u(this);
        u uVar2 = new u(this);
        u uVar3 = new u(this);
        cVar.f58619e = arrayList;
        cVar.f58624w = M0;
        cVar.f58620f = pj0Var2;
        cVar.h = uVar;
        cVar.f58621n = uVar2;
        cVar.f58623s = uVar3;
        k1(false, false);
        yg.a aVar = new yg.a(getContext(), this.I0);
        this.f57593i2 = aVar;
        aVar.setOnClickListener(new rq(this, prepaidGiveaway, j3, f2Var));
        j1(false);
        this.f28615b.addView(aVar, ha.d(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        s.j(this.f28612a, M0, new v(this, 5));
        qs.f(this.f28612a).c(this, qs.f25090x3);
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        xg.c cVar = new xg.c(this.I0);
        this.Y1 = cVar;
        return cVar;
    }

    @Override
    public final CharSequence O0() {
        int i7 = this.f57586a2;
        int i10 = yg.d.f59352w;
        if (i7 == 1) {
            return hd.M0(2131749679, null);
        }
        return hd.a0("BoostingStartGiveaway", null, 2131753193, new Object[0]);
    }

    @Override
    public final void R0(Canvas canvas, int i7) {
        this.f57595k2 = i7;
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
        if (i7 == qs.f25090x3 && (pj0Var = this.f36222k1) != null && pj0Var.G) {
            k1(true, true);
        }
    }

    @Override
    public final void dismiss() {
        i iVar = this.f57596l2;
        if (iVar != null) {
            iVar.run();
        }
        qs.f(this.f28612a).n(this, qs.f25090x3);
    }

    public final int e1() {
        int i7 = this.Z1;
        int i10 = yg.d.f59352w;
        if (i7 == 2) {
            return ((Integer) this.Q1.get(this.f57590f2)).intValue();
        }
        List h12 = h1();
        int i11 = this.f57591g2;
        if (i11 < 0 || i11 >= h12.size()) {
            this.f57591g2 = 0;
        }
        if (this.f57591g2 >= h12.size()) {
            return 0;
        }
        return ((Integer) h12.get(this.f57591g2)).intValue();
    }

    public final int f1() {
        int e12;
        int g10;
        int i7 = this.Z1;
        int i10 = yg.d.f59352w;
        if (i7 == 2) {
            e12 = ((Integer) this.Q1.get(this.f57590f2)).intValue();
            g10 = s.g();
        } else {
            TL_stars.TL_starsGiveawayOption g12 = g1(this.f57592h2);
            if (g12 != null) {
                return g12.yearly_boosts;
            }
            e12 = e1();
            g10 = s.g();
        }
        return g10 * e12;
    }

    public final TL_stars.TL_starsGiveawayOption g1(long j3) {
        ArrayList v = ea.y(this.f28612a, false).v();
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
        int i7 = this.Z1;
        int i10 = yg.d.f59352w;
        if (i7 == 2) {
            return this.Q1;
        }
        ArrayList arrayList = new ArrayList();
        TL_stars.TL_starsGiveawayOption g12 = g1(this.f57592h2);
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
        if (this.f57597m2 != null) {
            return true;
        }
        return false;
    }

    public final void j1(boolean z9) {
        boolean z10;
        boolean i12 = i1();
        yg.a aVar = this.f57593i2;
        if (i12) {
            TL_stories.PrepaidGiveaway prepaidGiveaway = this.f57597m2;
            if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                aVar.a(prepaidGiveaway.quantity, z9);
                return;
            }
            aVar.a(s.g() * prepaidGiveaway.quantity, z9);
            return;
        }
        int i7 = this.f57586a2;
        int i10 = yg.d.f59352w;
        if (i7 == 0) {
            aVar.a(f1(), z9);
            return;
        }
        ArrayList arrayList = this.V1;
        int g10 = s.g() * arrayList.size();
        if (arrayList.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        aVar.f59326e = true;
        fi.d dVar = aVar.f59323a;
        dVar.k();
        dVar.setShowZero(true);
        dVar.setEnabled(z10);
        dVar.c(g10, z9);
        dVar.i(hd.M0(2131749679, null), z9, true);
        r6.i(k6.f27921h5, aVar.f59324b, aVar.f59325c);
    }

    public final void k1(boolean r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: wg.a0.k1(boolean, boolean):void");
    }
}
