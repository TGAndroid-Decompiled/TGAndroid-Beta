package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class rg implements DialogInterface.OnCancelListener {
    public final int f40121a;
    public final Object f40122b;

    public rg(Object obj, int i10) {
        this.f40121a = i10;
        this.f40122b = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f40121a) {
            case 0:
                yn ynVar = (yn) this.f40122b;
                ynVar.Z8 = true;
                ynVar.X8 = 0;
                ynVar.nb = 0;
                ynVar.L4 = 0;
                ynVar.q9();
                ynVar.Mb(false);
                return;
            case 1:
                to toVar = (to) this.f40122b;
                toVar.M0 = false;
                toVar.f40890b = null;
                toVar.N0 = false;
                return;
            case 2:
                ((tp) this.f40122b).f40931n = null;
                return;
            default:
                dc0 dc0Var = (dc0) this.f40122b;
                if (dc0Var.h >= 0) {
                    ConnectionsManager.getInstance(dc0Var.f35741b).cancelRequest(dc0Var.h, true);
                    dc0Var.h = -1;
                    return;
                }
                return;
        }
    }
}
