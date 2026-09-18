package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class rg implements DialogInterface.OnCancelListener {
    public final int f37227a;
    public final Object f37228b;

    public rg(Object obj, int i10) {
        this.f37227a = i10;
        this.f37228b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f37227a) {
            case 0:
                bo boVar = (bo) this.f37228b;
                boVar.f32240b9 = true;
                boVar.Z8 = 0;
                boVar.f32413pb = 0;
                boVar.N4 = 0;
                boVar.r9();
                boVar.Nb(false);
                return;
            case 1:
                wo woVar = (wo) this.f37228b;
                woVar.M0 = false;
                woVar.f39089b = null;
                woVar.N0 = false;
                return;
            case 2:
                ((wp) this.f37228b).f39126n = null;
                return;
            default:
                hc0 hc0Var = (hc0) this.f37228b;
                if (hc0Var.h >= 0) {
                    ConnectionsManager.getInstance(hc0Var.f34236b).cancelRequest(hc0Var.h, true);
                    hc0Var.h = -1;
                    return;
                }
                return;
        }
    }
}
