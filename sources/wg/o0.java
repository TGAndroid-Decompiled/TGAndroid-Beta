package wg;

import android.view.ViewGroup;
import fi.i4;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.m5;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.xb;
import org.telegram.ui.sc1;
public final class o0 extends ja {
    public final ArrayList T1;
    public final ArrayList U1;
    public final TLRPC.Chat V1;
    public final b0 W1;
    public n0 X1;
    public j0 Y1;

    public o0(e2 e2Var, TL_stories.TL_premium_myBoosts tL_premium_myBoosts, TLRPC.Chat chat) {
        super(e2Var, false);
        this.T1 = new ArrayList();
        this.U1 = new ArrayList();
        this.f35943v1 = 0.3f;
        this.V1 = chat;
        ArrayList<TL_stories.TL_myBoost> arrayList = tL_premium_myBoosts.my_boosts;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            TL_stories.TL_myBoost tL_myBoost = arrayList.get(i7);
            i7++;
            TL_stories.TL_myBoost tL_myBoost2 = tL_myBoost;
            TLRPC.Peer peer = tL_myBoost2.peer;
            if (peer != null && m5.o(peer) != (-chat.f28051id)) {
                this.U1.add(tL_myBoost2);
            }
        }
        ah.a aVar = new ah.a(getContext(), this.J0, this.f35936o1);
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        q6.h(j6.f28922h5, aVar, this.J0);
        b0 b0Var = new b0(getContext(), this.J0);
        this.W1 = b0Var;
        b0Var.k();
        b0Var.setCounterColor(-6785796);
        b0Var.setOnClickListener(new sc1(6, this, chat));
        aVar.addView(b0Var, c8.ja.r(-1, 48, 87));
        ViewGroup viewGroup = this.f29682b;
        int i10 = this.f29717u0;
        viewGroup.addView(aVar, c8.ja.f(-2.0f, -1, 87, i10, 0, i10, 0));
        uj0 uj0Var = this.f35936o1;
        int i11 = this.f29717u0;
        uj0Var.setPadding(i11, 0, i11, org.telegram.messenger.g0.L(64.0f));
        this.f35936o1.setOnItemClickListener(new i4(24, this, chat));
        O();
        b1();
        d1(false);
        xb.a(this.f29685c, new Object());
    }

    @Override
    public final tj0 L0(uj0 uj0Var) {
        return new k0(this);
    }

    @Override
    public final CharSequence O0() {
        return hd.M0(2131753321, null);
    }

    public final void d1(boolean z10) {
        b0 b0Var = this.W1;
        boolean z11 = false;
        b0Var.setShowZero(false);
        ArrayList arrayList = this.T1;
        if (arrayList.size() > 1) {
            b0Var.i(hd.M0(2131753316, null), z10, true);
        } else {
            b0Var.i(hd.M0(2131753321, null), z10, true);
        }
        b0Var.c(arrayList.size(), z10);
        if (arrayList.size() > 0) {
            z11 = true;
        }
        b0Var.setEnabled(z11);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Y1 = new j0(this);
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
