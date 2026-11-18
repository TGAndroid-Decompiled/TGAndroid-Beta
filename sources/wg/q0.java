package wg;

import android.view.ViewGroup;
import c8.ma;
import fi.g4;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.n5;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.sa;
public final class q0 extends sa {
    public final ArrayList T1;
    public final ArrayList U1;
    public final TLRPC.Chat V1;
    public final d0 W1;
    public p0 X1;
    public l0 Y1;

    public q0(h2 h2Var, TL_stories.TL_premium_myBoosts tL_premium_myBoosts, TLRPC.Chat chat) {
        super(h2Var, false);
        this.T1 = new ArrayList();
        this.U1 = new ArrayList();
        this.f39541v1 = 0.3f;
        this.V1 = chat;
        ArrayList<TL_stories.TL_myBoost> arrayList = tL_premium_myBoosts.my_boosts;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            TL_stories.TL_myBoost tL_myBoost = arrayList.get(i7);
            i7++;
            TL_stories.TL_myBoost tL_myBoost2 = tL_myBoost;
            TLRPC.Peer peer = tL_myBoost2.peer;
            if (peer != null && n5.o(peer) != (-chat.f28405id)) {
                this.U1.add(tL_myBoost2);
            }
        }
        ah.a aVar = new ah.a(getContext(), this.J0, this.f39534o1);
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        u6.h(n6.f29469h5, aVar, this.J0);
        d0 d0Var = new d0(getContext(), this.J0);
        this.W1 = d0Var;
        d0Var.k();
        d0Var.setCounterColor(-6785796);
        d0Var.setOnClickListener(new ug.a0(1, this, chat));
        aVar.addView(d0Var, ma.r(-1, 48, 87));
        ViewGroup viewGroup = this.f30192b;
        int i10 = this.f30227u0;
        viewGroup.addView(aVar, ma.f(-2.0f, -1, 87, i10, 0, i10, 0));
        ck0 ck0Var = this.f39534o1;
        int i11 = this.f30227u0;
        ck0Var.setPadding(i11, 0, i11, org.telegram.messenger.g0.L(64.0f));
        this.f39534o1.setOnItemClickListener(new g4(24, this, chat));
        O();
        c1();
        e1(false);
        gc.a(this.f30195c, new Object());
    }

    @Override
    public final bk0 M0(ck0 ck0Var) {
        return new m0(this);
    }

    @Override
    public final CharSequence P0() {
        return gd.M0(2131753319, null);
    }

    public final void e1(boolean z10) {
        d0 d0Var = this.W1;
        boolean z11 = false;
        d0Var.setShowZero(false);
        ArrayList arrayList = this.T1;
        if (arrayList.size() > 1) {
            d0Var.i(gd.M0(2131753314, null), z10, true);
        } else {
            d0Var.i(gd.M0(2131753319, null), z10, true);
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
