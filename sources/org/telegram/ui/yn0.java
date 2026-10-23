package org.telegram.ui;

import android.os.AsyncTask;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class yn0 extends AsyncTask {
    public final wc.a f43910a;
    public final io0 f43911b;

    public yn0(io0 io0Var, wc.a aVar) {
        this.f43911b = io0Var;
        this.f43910a = aVar;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yn0.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        io0 io0Var = this.f43911b;
        if (io0Var.Q0) {
            return;
        }
        if (str == null) {
            org.telegram.ui.Components.f5.w0(io0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        } else {
            io0Var.f38322w0 = str;
            io0Var.t0();
        }
        io0Var.H0(true, false);
        io0Var.D0(false);
    }
}
