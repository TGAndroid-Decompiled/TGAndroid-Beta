package org.telegram.ui;

import android.os.AsyncTask;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class rn0 extends AsyncTask {
    public final ec.a f42163a;
    public final bo0 f42164b;

    public rn0(bo0 bo0Var, ec.a aVar) {
        this.f42164b = bo0Var;
        this.f42163a = aVar;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rn0.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        bo0 bo0Var = this.f42164b;
        if (bo0Var.M0) {
            return;
        }
        if (str == null) {
            org.telegram.ui.Components.c5.w0(bo0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        } else {
            bo0Var.f36865s0 = str;
            bo0Var.t0();
        }
        bo0Var.H0(true, false);
        bo0Var.D0(false);
    }
}
