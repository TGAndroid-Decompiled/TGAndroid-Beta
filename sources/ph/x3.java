package ph;

import android.content.Context;
import android.view.View;
import i7.f6;
import java.util.ArrayList;
import nh.t4;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.w41;
import org.telegram.ui.al0;
public final class x3 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public final long f46156a;
    public org.telegram.ui.ActionBar.h2 f46157b;
    public u51 f46158c;

    public x3(long j10) {
        super(null);
        this.f46156a = j10;
    }

    public final void U(ArrayList arrayList, k51 k51Var) {
        jh.z e10 = jh.b0.g(this.currentAccount).e(this.f46156a);
        ArrayList arrayList2 = e10.f13146e;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            Object obj = arrayList2.get(i10);
            int i11 = z2.f46193a;
            w41 J = w41.J(z2.class);
            J.G = obj;
            J.f34306r = false;
            arrayList.add(J);
        }
        if (e10.h) {
            arrayList.add(w41.n(29));
            arrayList.add(w41.n(29));
            arrayList.add(w41.n(29));
        }
    }

    public final void V(w41 w41Var) {
        Object obj = w41Var.G;
        if (obj instanceof TL_payments.starRefProgram) {
            d3.G0(getParentActivity(), this.currentAccount, (TL_payments.starRefProgram) obj, this.f46156a, this.resourceProvider, false);
        }
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
        this.f46157b = h2Var;
        lVar.setBackButtonDrawable(h2Var);
        this.f46157b.f23476k = 240.0f;
        this.actionBar.setActionBarMenuOnItemClick(new al0(this, 29));
        this.actionBar.setBackgroundColor(g6.w0(null, g6.f23062d6, false));
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        int i10 = g6.G6;
        lVar2.C(g6.w0(null, i10, false), false);
        this.actionBar.C(g6.w0(null, i10, false), true);
        this.actionBar.B(g6.w0(null, g6.f23452z8, false), false);
        this.actionBar.setTitleColor(g6.w0(null, i10, false));
        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAffiliatePrograms));
        hv0 hv0Var = new hv0(context, null);
        u51 u51Var = new u51(this, new t4(this, 13), new l4.s0(this, 26), null);
        this.f46158c = u51Var;
        hv0Var.addView(u51Var, f6.e(-1, -1, 119));
        this.fragmentView = hv0Var;
        return hv0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        u51 u51Var;
        if (i10 == NotificationCenter.channelSuggestedBotsUpdate && ((Long) objArr[0]).longValue() == this.f46156a && (u51Var = this.f46158c) != null && (u51Var.getAdapter() instanceof k51)) {
            ((k51) this.f46158c.getAdapter()).N(true);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().D0) {
            int w02 = g6.w0(null, g6.f23062d6, false);
            if (this.actionBar.s()) {
                w02 = g6.w0(null, g6.f23403w8, false);
            }
            if (i0.a.f(w02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.channelSuggestedBotsUpdate);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.channelSuggestedBotsUpdate);
        super.onFragmentDestroy();
    }
}
