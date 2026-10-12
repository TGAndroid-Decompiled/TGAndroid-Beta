package org.telegram.ui;

import android.os.AsyncTask;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class so0 extends AsyncTask {
    public final wc.a f40187a;
    public final cp0 f40188b;

    public so0(cp0 cp0Var, wc.a aVar) {
        this.f40188b = cp0Var;
        this.f40187a = aVar;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.so0.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        cp0 cp0Var = this.f40188b;
        if (cp0Var.Q0) {
            return;
        }
        if (str == null) {
            org.telegram.ui.Components.g5.v0(cp0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        } else {
            cp0Var.f35030w0 = str;
            cp0Var.t0();
        }
        cp0Var.H0(true, false);
        cp0Var.D0(false);
    }
}
