package org.telegram.ui;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ze0 extends org.telegram.ui.Components.xw0 {
    public final ce0 f44563a;
    public final TextView f44564b;
    public final TextView f44565c;
    public final vh.n d;
    public final org.telegram.ui.Components.fk0 f44566e;
    public Bundle f44567f;
    public String h;
    public boolean f44568n;
    public String f44569r;
    public String f44570s;
    public String v;
    public boolean f44571w;
    public final xe0 f44572x;
    public final wg0 f44573y;

    public ze0(org.telegram.ui.wg0 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ze0.<init>(org.telegram.ui.wg0, android.content.Context):void");
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
        this.f44573y.k1(true, true);
        this.f44567f = null;
        this.f44568n = false;
        return true;
    }

    @Override
    public final void d() {
        this.f44568n = false;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("LoginPassword", R.string.LoginPassword);
    }

    @Override
    public final void h(String str) {
        int i10;
        if (this.f44568n) {
            return;
        }
        ce0 ce0Var = this.f44563a;
        ce0Var.f36731e = true;
        for (es esVar : ce0Var.f36732f) {
            esVar.j(0.0f);
        }
        String code = ce0Var.getCode();
        if (code.length() == 0) {
            o(false);
            return;
        }
        this.f44568n = true;
        wg0 wg0Var = this.f44573y;
        wg0Var.n1(0, true);
        TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
        tL_auth_checkRecoveryPassword.code = code;
        i10 = ((org.telegram.ui.ActionBar.n2) wg0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkRecoveryPassword, new ac0(2, this, code), 10);
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new xe0(this, 0), wg0.f43571t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params");
        this.f44567f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("recoveryview_code");
        if (string != null) {
            this.f44563a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f44563a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("recoveryview_code", code);
        }
        Bundle bundle2 = this.f44567f;
        if (bundle2 != null) {
            bundle.putBundle("recoveryview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        ce0 ce0Var = this.f44563a;
        ce0Var.setText("");
        this.f44567f = bundle;
        this.h = bundle.getString("password");
        this.f44569r = this.f44567f.getString("requestPhone");
        this.f44570s = this.f44567f.getString("phoneHash");
        this.v = this.f44567f.getString("phoneCode");
        String string = this.f44567f.getString("email_unconfirmed_pattern");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            ?? obj = new Object();
            obj.f30974a |= 256;
            obj.f30975b = indexOf;
            int i10 = lastIndexOf + 1;
            obj.f30976c = i10;
            valueOf.setSpan(new org.telegram.ui.Components.u11(obj, 0), indexOf, i10, 0);
        }
        this.d.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailNoAccess), valueOf));
        wg0.T0(this.f44573y, ce0Var);
        ce0Var.requestFocus();
    }

    @Override
    public final void n() {
        this.f44564b.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.G6, false));
        this.f44565c.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.D6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.q6, false));
        this.f44563a.invalidate();
    }

    public final void o(boolean z10) {
        ce0 ce0Var = this.f44563a;
        if (this.f44573y.getParentActivity() == null) {
            return;
        }
        try {
            ce0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z10) {
            for (es esVar : ce0Var.f36732f) {
                esVar.setText("");
            }
        }
        for (es esVar2 : ce0Var.f36732f) {
            esVar2.i(1.0f);
        }
        ce0Var.f36732f[0].requestFocus();
        AndroidUtilities.shakeViewSpring(ce0Var, new xe0(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f44572x);
    }
}
