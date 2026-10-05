package org.telegram.ui;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ye0 extends org.telegram.ui.Components.rw0 {
    public final be0 f43203a;
    public final TextView f43204b;
    public final TextView f43205c;
    public final vh.n d;
    public final org.telegram.ui.Components.nj0 f43206e;
    public Bundle f43207f;
    public String h;
    public boolean f43208n;
    public String f43209r;
    public String f43210s;
    public String v;
    public boolean f43211w;
    public final we0 f43212x;
    public final ug0 f43213y;

    public ye0(org.telegram.ui.ug0 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ye0.<init>(org.telegram.ui.ug0, android.content.Context):void");
    }

    @Override
    public final boolean a() {
        return true;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z10) {
        this.f43213y.k1(true, true);
        this.f43207f = null;
        this.f43208n = false;
        return true;
    }

    @Override
    public final void d() {
        this.f43208n = false;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("LoginPassword", R.string.LoginPassword);
    }

    @Override
    public final void h(String str) {
        int i10;
        if (this.f43208n) {
            return;
        }
        be0 be0Var = this.f43203a;
        be0Var.f35540e = true;
        for (es esVar : be0Var.f35541f) {
            esVar.j(0.0f);
        }
        String code = be0Var.getCode();
        if (code.length() == 0) {
            o(false);
            return;
        }
        this.f43208n = true;
        ug0 ug0Var = this.f43213y;
        ug0Var.n1(0, true);
        TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
        tL_auth_checkRecoveryPassword.code = code;
        i10 = ((org.telegram.ui.ActionBar.n2) ug0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkRecoveryPassword, new zb0(2, this, code), 10);
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new we0(this, 0), ug0.f41235t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params");
        this.f43207f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("recoveryview_code");
        if (string != null) {
            this.f43203a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f43203a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("recoveryview_code", code);
        }
        Bundle bundle2 = this.f43207f;
        if (bundle2 != null) {
            bundle.putBundle("recoveryview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        be0 be0Var = this.f43203a;
        be0Var.setText("");
        this.f43207f = bundle;
        this.h = bundle.getString("password");
        this.f43209r = this.f43207f.getString("requestPhone");
        this.f43210s = this.f43207f.getString("phoneHash");
        this.v = this.f43207f.getString("phoneCode");
        String string = this.f43207f.getString("email_unconfirmed_pattern");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            ?? obj = new Object();
            obj.f28925a |= 256;
            obj.f28926b = indexOf;
            int i10 = lastIndexOf + 1;
            obj.f28927c = i10;
            valueOf.setSpan(new org.telegram.ui.Components.o11(obj, 0), indexOf, i10, 0);
        }
        this.d.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailNoAccess), valueOf));
        ug0.T0(this.f43213y, be0Var);
        be0Var.requestFocus();
    }

    @Override
    public final void n() {
        this.f43204b.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.G6, false));
        this.f43205c.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.D6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.q6, false));
        this.f43203a.invalidate();
    }

    public final void o(boolean z10) {
        be0 be0Var = this.f43203a;
        if (this.f43213y.getParentActivity() == null) {
            return;
        }
        try {
            be0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z10) {
            for (es esVar : be0Var.f35541f) {
                esVar.setText("");
            }
        }
        for (es esVar2 : be0Var.f35541f) {
            esVar2.i(1.0f);
        }
        be0Var.f35541f[0].requestFocus();
        AndroidUtilities.shakeViewSpring(be0Var, new we0(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f43212x);
    }
}
