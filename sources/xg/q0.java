package xg;

import android.view.ViewGroup;
import b8.mf;
import ei.q4;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.m5;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;
public final class q0 extends ma {
    public final ArrayList Q1;
    public final ArrayList R1;
    public final TLRPC.Chat S1;
    public final d0 T1;
    public p0 U1;
    public l0 V1;

    public q0(d2 d2Var, TL_stories.TL_premium_myBoosts tL_premium_myBoosts, TLRPC.Chat chat) {
        super(d2Var, false);
        this.Q1 = new ArrayList();
        this.R1 = new ArrayList();
        this.f36108s1 = 0.3f;
        this.S1 = chat;
        ArrayList<TL_stories.TL_myBoost> arrayList = tL_premium_myBoosts.my_boosts;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            TL_stories.TL_myBoost tL_myBoost = arrayList.get(i3);
            i3++;
            TL_stories.TL_myBoost tL_myBoost2 = tL_myBoost;
            TLRPC.Peer peer = tL_myBoost2.peer;
            if (peer != null && m5.o(peer) != (-chat.f27001id)) {
                this.R1.add(tL_myBoost2);
            }
        }
        bh.a aVar = new bh.a(getContext(), this.J0, this.f36102l1);
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        r6.i(k6.f27954h5, aVar, this.J0);
        d0 d0Var = new d0(getContext(), this.J0);
        this.T1 = d0Var;
        d0Var.k();
        d0Var.setCounterColor(-6785796);
        d0Var.setOnClickListener(new org.telegram.ui.web.d(5, this, chat));
        aVar.addView(d0Var, mf.r(-1, 48, 87));
        ViewGroup viewGroup = this.f28586b;
        int i10 = this.f28618u0;
        viewGroup.addView(aVar, mf.f(-2.0f, -1, 87, i10, 0, i10, 0));
        tj0 tj0Var = this.f36102l1;
        int i11 = this.f28618u0;
        tj0Var.setPadding(i11, 0, i11, org.telegram.messenger.g0.L(64.0f));
        this.f36102l1.setOnItemClickListener(new q4(24, this, chat));
        N();
        b1();
        d1(false);
        ac.a(this.f28589c, new Object());
    }

    @Override
    public final sj0 L0(tj0 tj0Var) {
        return new m0(this);
    }

    @Override
    public final CharSequence O0() {
        return bd.M0(2131753321, null);
    }

    public final void d1(boolean z10) {
        d0 d0Var = this.T1;
        boolean z11 = false;
        d0Var.setShowZero(false);
        ArrayList arrayList = this.Q1;
        if (arrayList.size() > 1) {
            d0Var.i(bd.M0(2131753316, null), z10, true);
        } else {
            d0Var.i(bd.M0(2131753321, null), z10, true);
        }
        d0Var.c(arrayList.size(), z10);
        if (arrayList.size() > 0) {
            z11 = true;
        }
        d0Var.setEnabled(z11);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.V1 = new l0(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.V1.cancel();
    }

    @Override
    public final void v() {
        this.V1.start();
    }
}
