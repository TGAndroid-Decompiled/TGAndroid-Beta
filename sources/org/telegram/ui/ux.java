package org.telegram.ui;

import android.content.Context;
public final class ux implements Runnable {
    public final int f43329a;
    public final vx f43330b;

    public ux(vx vxVar, int i9) {
        this.f43329a = i9;
        this.f43330b = vxVar;
    }

    @Override
    public final void run() {
        int i9;
        switch (this.f43329a) {
            case 0:
                vx vxVar = this.f43330b;
                dy dyVar = vxVar.A0;
                Context context = vxVar.getContext();
                i9 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                dyVar.showDialog(new zf.j0(3, i9, context, dyVar, null));
                return;
            default:
                dy dyVar2 = this.f43330b.A0;
                ax axVar = dyVar2.I0;
                if (axVar != null) {
                    axVar.dismiss();
                    dyVar2.I0 = null;
                    return;
                }
                return;
        }
    }
}
