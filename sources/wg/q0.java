package wg;

import android.view.ViewGroup;
import c8.ma;
import fi.g4;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.n5;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.sa;
import org.telegram.ui.jg0;
public final class q0 extends sa {
    public final ArrayList T1;
    public final ArrayList U1;
    public final TLRPC.Chat V1;
    public final d0 W1;
    public p0 X1;
    public l0 Y1;

    public q0(g2 g2Var, TL_stories.TL_premium_myBoosts tL_premium_myBoosts, TLRPC.Chat chat) {
        super(g2Var, false);
        this.T1 = new ArrayList();
        this.U1 = new ArrayList();
        this.f39538v1 = 0.3f;
        this.V1 = chat;
        ArrayList<TL_stories.TL_myBoost> arrayList = tL_premium_myBoosts.my_boosts;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            TL_stories.TL_myBoost tL_myBoost = arrayList.get(i7);
            i7++;
            TL_stories.TL_myBoost tL_myBoost2 = tL_myBoost;
            TLRPC.Peer peer = tL_myBoost2.peer;
            if (peer != null && n5.o(peer) != (-chat.f28434id)) {
                this.U1.add(tL_myBoost2);
            }
        }
        ah.a aVar = new ah.a(getContext(), this.J0, this.f39531o1);
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        t6.h(m6.f29454h5, aVar, this.J0);
        d0 d0Var = new d0(getContext(), this.J0);
        this.W1 = d0Var;
        d0Var.k();
        d0Var.setCounterColor(-6785796);
        d0Var.setOnClickListener(new jg0(29, this, chat));
        aVar.addView(d0Var, ma.r(-1, 48, 87));
        ViewGroup viewGroup = this.f30176b;
        int i10 = this.f30211u0;
        viewGroup.addView(aVar, ma.f(-2.0f, -1, 87, i10, 0, i10, 0));
        ek0 ek0Var = this.f39531o1;
        int i11 = this.f30211u0;
        ek0Var.setPadding(i11, 0, i11, org.telegram.messenger.g0.L(64.0f));
        this.f39531o1.setOnItemClickListener(new g4(24, this, chat));
        O();
        c1();
        e1(false);
        gc.a(this.f30179c, new Object());
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        return new m0(this);
    }

    @Override
    public final CharSequence P0() {
        return hd.N0(2131753318, null);
    }

    public final void e1(boolean z10) {
        d0 d0Var = this.W1;
        boolean z11 = false;
        d0Var.setShowZero(false);
        ArrayList arrayList = this.T1;
        if (arrayList.size() > 1) {
            d0Var.i(hd.N0(2131753313, null), z10, true);
        } else {
            d0Var.i(hd.N0(2131753318, null), z10, true);
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
        this.Y1 = new l0(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.Y1.cancel();
    }

    @Override
    public final void v() {
        this.Y1.start();
    }
}
