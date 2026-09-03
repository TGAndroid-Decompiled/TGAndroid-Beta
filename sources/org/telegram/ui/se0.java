package org.telegram.ui;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class se0 extends org.telegram.ui.Components.vv0 {
    public final wd0 f41139a;
    public final TextView f41140b;
    public final TextView f41141c;
    public final jh.s d;
    public final org.telegram.ui.Components.kj0 f41142e;
    public Bundle f41143f;
    public String h;
    public boolean f41144n;
    public String f41145r;
    public String f41146s;
    public String v;
    public boolean f41147w;
    public final qe0 f41148x;
    public final og0 f41149y;

    public se0(org.telegram.ui.og0 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.se0.<init>(org.telegram.ui.og0, android.content.Context):void");
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
    public final boolean c(boolean z4) {
        this.f41149y.k1(true, true);
        this.f41143f = null;
        this.f41144n = false;
        return true;
    }

    @Override
    public final void d() {
        this.f41144n = false;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("LoginPassword", R.string.LoginPassword);
    }

    @Override
    public final void h(String str) {
        int i10;
        if (this.f41144n) {
            return;
        }
        wd0 wd0Var = this.f41139a;
        wd0Var.f44010e = true;
        for (cs csVar : wd0Var.f44011f) {
            csVar.j(0.0f);
        }
        String code = wd0Var.getCode();
        if (code.length() == 0) {
            o(false);
            return;
        }
        this.f41144n = true;
        og0 og0Var = this.f41149y;
        og0Var.n1(0, true);
        TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
        tL_auth_checkRecoveryPassword.code = code;
        i10 = ((org.telegram.ui.ActionBar.p2) og0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkRecoveryPassword, new tb0(2, this, code), 10);
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new qe0(this, 0), og0.f39709q0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params");
        this.f41143f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("recoveryview_code");
        if (string != null) {
            this.f41139a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f41139a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("recoveryview_code", code);
        }
        Bundle bundle2 = this.f41143f;
        if (bundle2 != null) {
            bundle.putBundle("recoveryview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z4) {
        if (bundle == null) {
            return;
        }
        wd0 wd0Var = this.f41139a;
        wd0Var.setText("");
        this.f41143f = bundle;
        this.h = bundle.getString("password");
        this.f41145r = this.f41143f.getString("requestPhone");
        this.f41146s = this.f41143f.getString("phoneHash");
        this.v = this.f41143f.getString("phoneCode");
        String string = this.f41143f.getString("email_unconfirmed_pattern");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            ?? obj = new Object();
            obj.f30949a |= 256;
            obj.f30950b = indexOf;
            int i10 = lastIndexOf + 1;
            obj.f30951c = i10;
            valueOf.setSpan(new org.telegram.ui.Components.t01(obj, 0), indexOf, i10, 0);
        }
        this.d.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailNoAccess), valueOf));
        og0.T0(this.f41149y, wd0Var);
        wd0Var.requestFocus();
    }

    @Override
    public final void n() {
        this.f41140b.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G6, false));
        this.f41141c.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.D6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21896q6, false));
        this.f41139a.invalidate();
    }

    public final void o(boolean z4) {
        wd0 wd0Var = this.f41139a;
        if (this.f41149y.getParentActivity() == null) {
            return;
        }
        try {
            wd0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z4) {
            for (cs csVar : wd0Var.f44011f) {
                csVar.setText("");
            }
        }
        for (cs csVar2 : wd0Var.f44011f) {
            csVar2.i(1.0f);
        }
        wd0Var.f44011f[0].requestFocus();
        AndroidUtilities.shakeViewSpring(wd0Var, new qe0(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f41148x);
    }
}
