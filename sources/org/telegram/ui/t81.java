package org.telegram.ui;

import android.view.View;
public final class t81 implements View.OnClickListener {
    public final m91 f49739a;

    public t81(m91 m91Var) {
        this.f49739a = m91Var;
    }

    @Override
    public final void onClick(View view) {
        m91 m91Var = this.f49739a;
        if (m91Var.N == 1) {
            org.telegram.ui.Components.t4.i0(m91Var, -m91Var.f47575a, null, m91Var.g(), null, false, m91Var.K, new ma(this, 4), m91Var.getResourceProvider());
            return;
        }
        m91Var.getMessagesController().m(m91Var.f47575a, m91Var.getUserConfig().f(), 0, null, m91Var, false, new n81(m91Var, 2), new o81(m91Var), null);
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.I4, new Object[0]);
        m91Var.S0(false);
    }
}
