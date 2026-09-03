package rh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import k7.b6;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.ll0;
import ph.d4;
import ph.z8;
public final class x3 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public final long f43913a;
    public org.telegram.ui.ActionBar.i2 f43914b;
    public g61 f43915c;

    public x3(long j10) {
        super(null);
        this.f43913a = j10;
    }

    public final void U(ArrayList arrayList, w51 w51Var) {
        lh.z e = lh.b0.g(this.currentAccount).e(this.f43913a);
        ArrayList arrayList2 = e.e;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            Object obj = arrayList2.get(i10);
            int i11 = z2.f43947a;
            i51 J = i51.J(z2.class);
            J.G = obj;
            J.f25591r = false;
            arrayList.add(J);
        }
        if (e.h) {
            arrayList.add(i51.n(29));
            arrayList.add(i51.n(29));
            arrayList.add(i51.n(29));
        }
    }

    public final void V(i51 i51Var) {
        Object obj = i51Var.G;
        if (obj instanceof TL_payments.starRefProgram) {
            d3.G0(getParentActivity(), this.currentAccount, (TL_payments.starRefProgram) obj, this.f43913a, this.resourceProvider, false);
        }
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2(false);
        this.f43914b = i2Var;
        kVar.setBackButtonDrawable(i2Var);
        this.f43914b.f19770k = 240.0f;
        this.actionBar.setActionBarMenuOnItemClick(new ll0(this, 29));
        this.actionBar.setBackgroundColor(j6.w0(null, j6.f19881d6, false));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = j6.G6;
        kVar2.C(j6.w0(null, i10, false), false);
        this.actionBar.C(j6.w0(null, i10, false), true);
        this.actionBar.B(j6.w0(null, j6.f20275z8, false), false);
        this.actionBar.setTitleColor(j6.w0(null, i10, false));
        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAffiliatePrograms));
        qv0 qv0Var = new qv0(context, null);
        g61 g61Var = new g61(this, new d4(this, 13), new z8(this, 4), null);
        this.f43915c = g61Var;
        qv0Var.addView(g61Var, b6.e(-1, -1, 119));
        this.fragmentView = qv0Var;
        return qv0Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        g61 g61Var;
        if (i10 == NotificationCenter.channelSuggestedBotsUpdate && ((Long) objArr[0]).longValue() == this.f43913a && (g61Var = this.f43915c) != null && (g61Var.getAdapter() instanceof w51)) {
            ((w51) this.f43915c.getAdapter()).N(true);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().E0) {
            int w02 = j6.w0(null, j6.f19881d6, false);
            if (this.actionBar.s()) {
                w02 = j6.w0(null, j6.f20221w8, false);
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
