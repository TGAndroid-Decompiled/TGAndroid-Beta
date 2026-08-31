package sh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import k7.c6;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.x51;
import org.telegram.ui.ll0;
import qh.d4;
public final class x3 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public final long f47781a;
    public org.telegram.ui.ActionBar.i2 f47782b;
    public i61 f47783c;

    public x3(long j10) {
        super(null);
        this.f47781a = j10;
    }

    public final void U(ArrayList arrayList, x51 x51Var) {
        mh.y e6 = mh.a0.g(this.currentAccount).e(this.f47781a);
        ArrayList arrayList2 = e6.f15071e;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            Object obj = arrayList2.get(i10);
            int i11 = z2.f47818a;
            j51 J = j51.J(z2.class);
            J.G = obj;
            J.f28020r = false;
            arrayList.add(J);
        }
        if (e6.h) {
            arrayList.add(j51.n(29));
            arrayList.add(j51.n(29));
            arrayList.add(j51.n(29));
        }
    }

    public final void V(j51 j51Var) {
        Object obj = j51Var.G;
        if (obj instanceof TL_payments.starRefProgram) {
            d3.G0(getParentActivity(), this.currentAccount, (TL_payments.starRefProgram) obj, this.f47781a, this.resourceProvider, false);
        }
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2(false);
        this.f47782b = i2Var;
        kVar.setBackButtonDrawable(i2Var);
        this.f47782b.f21458k = 240.0f;
        this.actionBar.setActionBarMenuOnItemClick(new ll0(this, 29));
        this.actionBar.setBackgroundColor(k6.w0(null, k6.f21659d6, false));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = k6.G6;
        kVar2.C(k6.w0(null, i10, false), false);
        this.actionBar.C(k6.w0(null, i10, false), true);
        this.actionBar.B(k6.w0(null, k6.f22055z8, false), false);
        this.actionBar.setTitleColor(k6.w0(null, i10, false));
        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAffiliatePrograms));
        qv0 qv0Var = new qv0(context, null);
        i61 i61Var = new i61(this, new d4(this, 13), new sf.g(this, 3), null);
        this.f47783c = i61Var;
        qv0Var.addView(i61Var, c6.e(-1, -1, 119));
        this.fragmentView = qv0Var;
        return qv0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        i61 i61Var;
        if (i10 == NotificationCenter.channelSuggestedBotsUpdate && ((Long) objArr[0]).longValue() == this.f47781a && (i61Var = this.f47783c) != null && (i61Var.getAdapter() instanceof x51)) {
            ((x51) this.f47783c.getAdapter()).N(true);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().E0) {
            int w02 = k6.w0(null, k6.f21659d6, false);
            if (this.actionBar.s()) {
                w02 = k6.w0(null, k6.f22000w8, false);
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
