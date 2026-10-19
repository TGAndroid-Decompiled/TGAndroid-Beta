package org.telegram.ui;

import android.os.AsyncTask;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class un0 extends AsyncTask {
    public final wc.a f42014a;
    public final eo0 f42015b;

    public un0(eo0 eo0Var, wc.a aVar) {
        this.f42015b = eo0Var;
        this.f42014a = aVar;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un0.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        eo0 eo0Var = this.f42015b;
        if (eo0Var.Q0) {
            return;
        }
        if (str == null) {
            org.telegram.ui.Components.f5.v0(eo0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        } else {
            eo0Var.f36727w0 = str;
            eo0Var.t0();
        }
        eo0Var.H0(true, false);
        eo0Var.D0(false);
    }
}
