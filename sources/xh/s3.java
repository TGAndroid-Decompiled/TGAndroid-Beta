package xh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.vs;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vu0;
import org.telegram.ui.z01;
import w7.b6;
public final class s3 extends org.telegram.ui.ActionBar.k2 implements vs {
    public final long f54058a;
    public org.telegram.ui.ActionBar.c2 f54059b;
    public v51 f54060c;

    public s3(long j10) {
        super(null);
        this.f54058a = j10;
    }

    public final void Z(ArrayList arrayList, q51 q51Var) {
        rh.p e = rh.r.g(this.currentAccount).e(this.f54058a);
        ArrayList arrayList2 = e.e;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            Object obj = arrayList2.get(i10);
            int i11 = v2.f54104b;
            b51 K = b51.K(v2.class);
            K.G = obj;
            K.f24649r = false;
            arrayList.add(K);
        }
        if (e.h) {
            arrayList.add(b51.p(29));
            arrayList.add(b51.p(29));
            arrayList.add(b51.p(29));
        }
    }

    public final void a0(b51 b51Var) {
        Object obj = b51Var.G;
        if (obj instanceof TL_payments.starRefProgram) {
            z2.J0(getParentActivity(), this.currentAccount, (TL_payments.starRefProgram) obj, this.f54058a, this.resourceProvider, false);
        }
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(false);
        this.f54059b = c2Var;
        lVar.setBackButtonDrawable(c2Var);
        this.f54059b.f20203k = 240.0f;
        this.actionBar.setActionBarMenuOnItemClick(new z01(this, 19));
        a7.i(t6.f20930d6, this.actionBar, null);
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        int i10 = t6.G6;
        a7.m(lVar2, 1, i10, null);
        a7.b(this.actionBar, i10, null, true);
        a7.m(this.actionBar, 3, t6.f21333z8, null);
        a7.m(this.actionBar, 5, i10, null);
        this.actionBar.setTitle(dd.L0(2131752471, null));
        vu0 vu0Var = new vu0(context, null);
        v51 v51Var = new v51(this, new n1(this, 2), new wh.b(this, 11), null);
        this.f54060c = v51Var;
        vu0Var.addView(v51Var, b6.e(-1, -1, 119));
        this.fragmentView = vu0Var;
        return vu0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        v51 v51Var;
        if (i10 == at.K3 && ((Long) objArr[0]).longValue() == this.f54058a && (v51Var = this.f54060c) != null && (v51Var.getAdapter() instanceof q51)) {
            ((q51) this.f54060c.getAdapter()).O(true);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int x02 = t6.x0(null, t6.f20930d6, false);
            if (this.actionBar.u()) {
                x02 = t6.x0(null, t6.f21280w8, false);
            }
            if (i0.b.h(x02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        at.f(this.currentAccount).c(this, at.K3);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        at.f(this.currentAccount).n(this, at.K3);
        super.onFragmentDestroy();
    }
}
