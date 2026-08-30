package org.telegram.ui;

import android.os.AsyncTask;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class zn0 extends AsyncTask {
    public final gc.a f40840a;
    public final jo0 f40841b;

    public zn0(jo0 jo0Var, gc.a aVar) {
        this.f40841b = jo0Var;
        this.f40840a = aVar;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zn0.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        jo0 jo0Var = this.f40841b;
        if (jo0Var.N0) {
            return;
        }
        if (str == null) {
            org.telegram.ui.Components.z4.w0(jo0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        } else {
            jo0Var.f35416t0 = str;
            jo0Var.t0();
        }
        jo0Var.H0(true, false);
        jo0Var.D0(false);
    }
}
