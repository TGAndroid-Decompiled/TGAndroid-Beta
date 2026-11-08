package org.telegram.ui;

import android.os.AsyncTask;
public final class zk0 extends AsyncTask {
    public final uc.a f52607a;
    public final hl0 f52608b;

    public zk0(hl0 hl0Var, uc.a aVar) {
        this.f52608b = hl0Var;
        this.f52607a = aVar;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zk0.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        hl0 hl0Var = this.f52608b;
        if (hl0Var.Q0) {
            return;
        }
        if (str == null) {
            org.telegram.ui.Components.v4.t0(org.telegram.messenger.id.M0(2131747405, null), hl0Var);
        } else {
            hl0Var.f46441w0 = str;
            hl0Var.z0();
        }
        hl0Var.N0(true, false);
        hl0Var.J0(false);
    }
}
