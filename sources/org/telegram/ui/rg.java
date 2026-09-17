package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class rg implements DialogInterface.OnCancelListener {
    public final int f37222a;
    public final Object f37223b;

    public rg(Object obj, int i10) {
        this.f37222a = i10;
        this.f37223b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f37222a) {
            case 0:
                bo boVar = (bo) this.f37223b;
                boVar.f32236b9 = true;
                boVar.Z8 = 0;
                boVar.f32421qb = 0;
                boVar.N4 = 0;
                boVar.r9();
                boVar.Nb(false);
                return;
            case 1:
                wo woVar = (wo) this.f37223b;
                woVar.M0 = false;
                woVar.f39084b = null;
                woVar.N0 = false;
                return;
            case 2:
                ((wp) this.f37223b).f39121n = null;
                return;
            default:
                hc0 hc0Var = (hc0) this.f37223b;
                if (hc0Var.h >= 0) {
                    ConnectionsManager.getInstance(hc0Var.f34231b).cancelRequest(hc0Var.h, true);
                    hc0Var.h = -1;
                    return;
                }
                return;
        }
    }
}
