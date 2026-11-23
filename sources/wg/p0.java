package wg;

import android.view.ViewGroup;
import c8.na;
import fi.g4;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.n5;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.ra;
import org.telegram.ui.ig0;
public final class p0 extends ra {
    public final ArrayList T1;
    public final ArrayList U1;
    public final TLRPC.Chat V1;
    public final c0 W1;
    public o0 X1;
    public k0 Y1;

    public p0(g2 g2Var, TL_stories.TL_premium_myBoosts tL_premium_myBoosts, TLRPC.Chat chat) {
        super(g2Var, false);
        this.T1 = new ArrayList();
        this.U1 = new ArrayList();
        this.f39253v1 = 0.3f;
        this.V1 = chat;
        ArrayList<TL_stories.TL_myBoost> arrayList = tL_premium_myBoosts.my_boosts;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            TL_stories.TL_myBoost tL_myBoost = arrayList.get(i7);
            i7++;
            TL_stories.TL_myBoost tL_myBoost2 = tL_myBoost;
            TLRPC.Peer peer = tL_myBoost2.peer;
            if (peer != null && n5.o(peer) != (-chat.f28492id)) {
                this.U1.add(tL_myBoost2);
            }
        }
        ah.a aVar = new ah.a(getContext(), this.J0, this.f39246o1);
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        u6.h(n6.f29524h5, aVar, this.J0);
        c0 c0Var = new c0(getContext(), this.J0);
        this.W1 = c0Var;
        c0Var.k();
        c0Var.setCounterColor(-6785796);
        c0Var.setOnClickListener(new ig0(29, this, chat));
        aVar.addView(c0Var, na.r(-1, 48, 87));
        ViewGroup viewGroup = this.f30226b;
        int i10 = this.f30261u0;
        viewGroup.addView(aVar, na.f(-2.0f, -1, 87, i10, 0, i10, 0));
        ek0 ek0Var = this.f39246o1;
        int i11 = this.f30261u0;
        ek0Var.setPadding(i11, 0, i11, org.telegram.messenger.g0.L(64.0f));
        this.f39246o1.setOnItemClickListener(new g4(24, this, chat));
        O();
        c1();
        e1(false);
        fc.a(this.f30229c, new Object());
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        return new l0(this);
    }

    @Override
    public final CharSequence P0() {
        return gd.N0(2131753318, null);
    }

    public final void e1(boolean z10) {
        c0 c0Var = this.W1;
        boolean z11 = false;
        c0Var.setShowZero(false);
        ArrayList arrayList = this.T1;
        if (arrayList.size() > 1) {
            c0Var.i(gd.N0(2131753313, null), z10, true);
        } else {
            c0Var.i(gd.N0(2131753318, null), z10, true);
        }
        c0Var.c(arrayList.size(), z10);
        if (arrayList.size() > 0) {
            z11 = true;
        }
        c0Var.setEnabled(z11);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Y1 = new k0(this);
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
