package org.telegram.ui;

import android.os.AsyncTask;
public final class vk0 extends AsyncTask {
    public final rc.a f50546a;
    public final dl0 f50547b;

    public vk0(dl0 dl0Var, rc.a aVar) {
        this.f50547b = dl0Var;
        this.f50546a = aVar;
    }

    @Override
    public final java.lang.Object doInBackground(java.lang.Object[] r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vk0.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        dl0 dl0Var = this.f50547b;
        if (dl0Var.R0) {
            return;
        }
        if (str == null) {
            org.telegram.ui.Components.t4.v0(org.telegram.messenger.bd.M0(2131747412, null), dl0Var);
        } else {
            dl0Var.f44775x0 = str;
            dl0Var.z0();
        }
        dl0Var.N0(true, false);
        dl0Var.J0(false);
    }
}
