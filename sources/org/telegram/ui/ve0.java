package org.telegram.ui;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ve0 extends org.telegram.ui.Components.uv0 {
    public final yd0 f38367a;
    public final TextView f38368b;
    public final TextView f38369c;
    public final vh.o d;
    public final org.telegram.ui.Components.bj0 e;
    public Bundle f38370f;
    public String h;
    public boolean f38371n;
    public String f38372r;
    public String f38373s;
    public String v;
    public boolean f38374w;
    public final te0 f38375x;
    public final rg0 f38376y;

    public ve0(org.telegram.ui.rg0 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ve0.<init>(org.telegram.ui.rg0, android.content.Context):void");
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
        this.f38376y.k1(true, true);
        this.f38370f = null;
        this.f38371n = false;
        return true;
    }

    @Override
    public final void d() {
        this.f38371n = false;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("LoginPassword", R.string.LoginPassword);
    }

    @Override
    public final void h(String str) {
        int i10;
        if (this.f38371n) {
            return;
        }
        yd0 yd0Var = this.f38367a;
        yd0Var.e = true;
        for (bs bsVar : yd0Var.f40230f) {
            bsVar.j(0.0f);
        }
        String code = yd0Var.getCode();
        if (code.length() == 0) {
            o(false);
            return;
        }
        this.f38371n = true;
        rg0 rg0Var = this.f38376y;
        rg0Var.n1(0, true);
        TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
        tL_auth_checkRecoveryPassword.code = code;
        i10 = ((org.telegram.ui.ActionBar.n2) rg0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkRecoveryPassword, new wb0(2, this, code), 10);
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new te0(this, 0), rg0.f36817t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params");
        this.f38370f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("recoveryview_code");
        if (string != null) {
            this.f38367a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f38367a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("recoveryview_code", code);
        }
        Bundle bundle2 = this.f38370f;
        if (bundle2 != null) {
            bundle.putBundle("recoveryview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        yd0 yd0Var = this.f38367a;
        yd0Var.setText("");
        this.f38370f = bundle;
        this.h = bundle.getString("password");
        this.f38372r = this.f38370f.getString("requestPhone");
        this.f38373s = this.f38370f.getString("phoneHash");
        this.v = this.f38370f.getString("phoneCode");
        String string = this.f38370f.getString("email_unconfirmed_pattern");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            ?? obj = new Object();
            obj.f26312a |= 256;
            obj.f26313b = indexOf;
            int i10 = lastIndexOf + 1;
            obj.f26314c = i10;
            valueOf.setSpan(new org.telegram.ui.Components.o01(obj, 0), indexOf, i10, 0);
        }
        this.d.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailNoAccess), valueOf));
        rg0.T0(this.f38376y, yd0Var);
        yd0Var.requestFocus();
    }

    @Override
    public final void n() {
        this.f38368b.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.G6, false));
        this.f38369c.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.D6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.q6, false));
        this.f38367a.invalidate();
    }

    public final void o(boolean z10) {
        yd0 yd0Var = this.f38367a;
        if (this.f38376y.getParentActivity() == null) {
            return;
        }
        try {
            yd0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z10) {
            for (bs bsVar : yd0Var.f40230f) {
                bsVar.setText("");
            }
        }
        for (bs bsVar2 : yd0Var.f40230f) {
            bsVar2.i(1.0f);
        }
        yd0Var.f40230f[0].requestFocus();
        AndroidUtilities.shakeViewSpring(yd0Var, new te0(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f38375x);
    }
}
