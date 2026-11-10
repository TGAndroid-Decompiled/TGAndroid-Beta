package wg;

import android.view.ViewGroup;
import c8.ha;
import di.q4;
import java.util.ArrayList;
import org.telegram.messenger.id;
import org.telegram.messenger.m5;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.ik0;
public final class q0 extends ma {
    public final ArrayList S1;
    public final ArrayList T1;
    public final TLRPC.Chat U1;
    public final d0 V1;
    public p0 W1;
    public l0 X1;

    public q0(f2 f2Var, TL_stories.TL_premium_myBoosts tL_premium_myBoosts, TLRPC.Chat chat) {
        super(f2Var, false);
        this.S1 = new ArrayList();
        this.T1 = new ArrayList();
        this.f35908u1 = 0.3f;
        this.U1 = chat;
        ArrayList<TL_stories.TL_myBoost> arrayList = tL_premium_myBoosts.my_boosts;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            TL_stories.TL_myBoost tL_myBoost = arrayList.get(i7);
            i7++;
            TL_stories.TL_myBoost tL_myBoost2 = tL_myBoost;
            TLRPC.Peer peer = tL_myBoost2.peer;
            if (peer != null && m5.o(peer) != (-chat.f26960id)) {
                this.T1.add(tL_myBoost2);
            }
        }
        ah.a aVar = new ah.a(getContext(), this.I0, this.n1);
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        t6.h(m6.f27963h5, aVar, this.I0);
        d0 d0Var = new d0(getContext(), this.I0);
        this.V1 = d0Var;
        d0Var.k();
        d0Var.setCounterColor(-6785796);
        d0Var.setOnClickListener(new ik0(28, this, chat));
        aVar.addView(d0Var, ha.r(-1, 48, 87));
        ViewGroup viewGroup = this.f28672b;
        int i10 = this.f28705t0;
        viewGroup.addView(aVar, ha.f(-2.0f, -1, 87, i10, 0, i10, 0));
        pj0 pj0Var = this.n1;
        int i11 = this.f28705t0;
        pj0Var.setPadding(i11, 0, i11, org.telegram.messenger.g0.L(64.0f));
        this.n1.setOnItemClickListener(new q4(24, this, chat));
        N();
        b1();
        d1(false);
        bc.a(this.f28675c, new Object());
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        return new m0(this);
    }

    @Override
    public final CharSequence O0() {
        return id.M0(2131753321, null);
    }

    public final void d1(boolean z9) {
        d0 d0Var = this.V1;
        boolean z10 = false;
        d0Var.setShowZero(false);
        ArrayList arrayList = this.S1;
        if (arrayList.size() > 1) {
            d0Var.i(id.M0(2131753316, null), z9, true);
        } else {
            d0Var.i(id.M0(2131753321, null), z9, true);
        }
        d0Var.c(arrayList.size(), z9);
        if (arrayList.size() > 0) {
            z10 = true;
        }
        d0Var.setEnabled(z10);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.X1 = new l0(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.X1.cancel();
    }

    @Override
    public final void v() {
        this.X1.start();
    }
}
