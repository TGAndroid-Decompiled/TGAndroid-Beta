package org.telegram.ui;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ue0 extends org.telegram.ui.Components.fw0 {
    public final xd0 f38424a;
    public final TextView f38425b;
    public final TextView f38426c;
    public final vh.n d;
    public final org.telegram.ui.Components.lj0 e;
    public Bundle f38427f;
    public String h;
    public boolean f38428n;
    public String f38429r;
    public String f38430s;
    public String v;
    public boolean f38431w;
    public final se0 f38432x;
    public final qg0 f38433y;

    public ue0(org.telegram.ui.qg0 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ue0.<init>(org.telegram.ui.qg0, android.content.Context):void");
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
        this.f38433y.k1(true, true);
        this.f38427f = null;
        this.f38428n = false;
        return true;
    }

    @Override
    public final void d() {
        this.f38428n = false;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("LoginPassword", R.string.LoginPassword);
    }

    @Override
    public final void h(String str) {
        int i10;
        if (this.f38428n) {
            return;
        }
        xd0 xd0Var = this.f38424a;
        xd0Var.e = true;
        for (as asVar : xd0Var.f40221f) {
            asVar.j(0.0f);
        }
        String code = xd0Var.getCode();
        if (code.length() == 0) {
            o(false);
            return;
        }
        this.f38428n = true;
        qg0 qg0Var = this.f38433y;
        qg0Var.n1(0, true);
        TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
        tL_auth_checkRecoveryPassword.code = code;
        i10 = ((org.telegram.ui.ActionBar.m2) qg0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkRecoveryPassword, new vb0(2, this, code), 10);
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new se0(this, 0), qg0.f36869t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params");
        this.f38427f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("recoveryview_code");
        if (string != null) {
            this.f38424a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f38424a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("recoveryview_code", code);
        }
        Bundle bundle2 = this.f38427f;
        if (bundle2 != null) {
            bundle.putBundle("recoveryview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        xd0 xd0Var = this.f38424a;
        xd0Var.setText("");
        this.f38427f = bundle;
        this.h = bundle.getString("password");
        this.f38429r = this.f38427f.getString("requestPhone");
        this.f38430s = this.f38427f.getString("phoneHash");
        this.v = this.f38427f.getString("phoneCode");
        String string = this.f38427f.getString("email_unconfirmed_pattern");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            ?? obj = new Object();
            obj.f22840a |= 256;
            obj.f22841b = indexOf;
            int i10 = lastIndexOf + 1;
            obj.f22842c = i10;
            valueOf.setSpan(new org.telegram.ui.Components.c11(obj, 0), indexOf, i10, 0);
        }
        this.d.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailNoAccess), valueOf));
        qg0.T0(this.f38433y, xd0Var);
        xd0Var.requestFocus();
    }

    @Override
    public final void n() {
        this.f38425b.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.G6, false));
        this.f38426c.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.D6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.q6, false));
        this.f38424a.invalidate();
    }

    public final void o(boolean z10) {
        xd0 xd0Var = this.f38424a;
        if (this.f38433y.getParentActivity() == null) {
            return;
        }
        try {
            xd0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z10) {
            for (as asVar : xd0Var.f40221f) {
                asVar.setText("");
            }
        }
        for (as asVar2 : xd0Var.f40221f) {
            asVar2.i(1.0f);
        }
        xd0Var.f40221f[0].requestFocus();
        AndroidUtilities.shakeViewSpring(xd0Var, new se0(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f38432x);
    }
}
