package org.telegram.ui;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class te0 extends org.telegram.ui.Components.wv0 {
    public final wd0 f41586a;
    public final TextView f41587b;
    public final TextView f41588c;
    public final jh.s d;
    public final org.telegram.ui.Components.lj0 f41589e;
    public Bundle f41590f;
    public String h;
    public boolean f41591n;
    public String f41592r;
    public String f41593s;
    public String v;
    public boolean f41594w;
    public final re0 f41595x;
    public final og0 f41596y;

    public te0(org.telegram.ui.og0 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.te0.<init>(org.telegram.ui.og0, android.content.Context):void");
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
        this.f41596y.k1(true, true);
        this.f41590f = null;
        this.f41591n = false;
        return true;
    }

    @Override
    public final void d() {
        this.f41591n = false;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("LoginPassword", R.string.LoginPassword);
    }

    @Override
    public final void h(String str) {
        int i10;
        if (this.f41591n) {
            return;
        }
        wd0 wd0Var = this.f41586a;
        wd0Var.f43981e = true;
        for (cs csVar : wd0Var.f43982f) {
            csVar.j(0.0f);
        }
        String code = wd0Var.getCode();
        if (code.length() == 0) {
            o(false);
            return;
        }
        this.f41591n = true;
        og0 og0Var = this.f41596y;
        og0Var.n1(0, true);
        TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
        tL_auth_checkRecoveryPassword.code = code;
        i10 = ((org.telegram.ui.ActionBar.p2) og0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkRecoveryPassword, new tb0(2, this, code), 10);
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new re0(this, 0), og0.f39749q0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params");
        this.f41590f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("recoveryview_code");
        if (string != null) {
            this.f41586a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f41586a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("recoveryview_code", code);
        }
        Bundle bundle2 = this.f41590f;
        if (bundle2 != null) {
            bundle.putBundle("recoveryview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z4) {
        if (bundle == null) {
            return;
        }
        wd0 wd0Var = this.f41586a;
        wd0Var.setText("");
        this.f41590f = bundle;
        this.h = bundle.getString("password");
        this.f41592r = this.f41590f.getString("requestPhone");
        this.f41593s = this.f41590f.getString("phoneHash");
        this.v = this.f41590f.getString("phoneCode");
        String string = this.f41590f.getString("email_unconfirmed_pattern");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            ?? obj = new Object();
            obj.f31225a |= 256;
            obj.f31226b = indexOf;
            int i10 = lastIndexOf + 1;
            obj.f31227c = i10;
            valueOf.setSpan(new org.telegram.ui.Components.u01(obj, 0), indexOf, i10, 0);
        }
        this.d.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailNoAccess), valueOf));
        og0.T0(this.f41596y, wd0Var);
        wd0Var.requestFocus();
    }

    @Override
    public final void n() {
        this.f41587b.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G6, false));
        this.f41588c.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.D6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21894q6, false));
        this.f41586a.invalidate();
    }

    public final void o(boolean z4) {
        wd0 wd0Var = this.f41586a;
        if (this.f41596y.getParentActivity() == null) {
            return;
        }
        try {
            wd0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z4) {
            for (cs csVar : wd0Var.f43982f) {
                csVar.setText("");
            }
        }
        for (cs csVar2 : wd0Var.f43982f) {
            csVar2.i(1.0f);
        }
        wd0Var.f43982f[0].requestFocus();
        AndroidUtilities.shakeViewSpring(wd0Var, new re0(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f41595x);
    }
}
