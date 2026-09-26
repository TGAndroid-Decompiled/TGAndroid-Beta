package org.telegram.ui;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ue0 extends org.telegram.ui.Components.gw0 {
    public final xd0 f38442a;
    public final TextView f38443b;
    public final TextView f38444c;
    public final vh.n d;
    public final org.telegram.ui.Components.mj0 e;
    public Bundle f38445f;
    public String h;
    public boolean f38446n;
    public String f38447r;
    public String f38448s;
    public String v;
    public boolean f38449w;
    public final se0 f38450x;
    public final qg0 f38451y;

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
        this.f38451y.k1(true, true);
        this.f38445f = null;
        this.f38446n = false;
        return true;
    }

    @Override
    public final void d() {
        this.f38446n = false;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("LoginPassword", R.string.LoginPassword);
    }

    @Override
    public final void h(String str) {
        int i10;
        if (this.f38446n) {
            return;
        }
        xd0 xd0Var = this.f38442a;
        xd0Var.e = true;
        for (as asVar : xd0Var.f40236f) {
            asVar.j(0.0f);
        }
        String code = xd0Var.getCode();
        if (code.length() == 0) {
            o(false);
            return;
        }
        this.f38446n = true;
        qg0 qg0Var = this.f38451y;
        qg0Var.n1(0, true);
        TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
        tL_auth_checkRecoveryPassword.code = code;
        i10 = ((org.telegram.ui.ActionBar.m2) qg0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkRecoveryPassword, new vb0(2, this, code), 10);
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new se0(this, 0), qg0.f36883t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params");
        this.f38445f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("recoveryview_code");
        if (string != null) {
            this.f38442a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f38442a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("recoveryview_code", code);
        }
        Bundle bundle2 = this.f38445f;
        if (bundle2 != null) {
            bundle.putBundle("recoveryview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        xd0 xd0Var = this.f38442a;
        xd0Var.setText("");
        this.f38445f = bundle;
        this.h = bundle.getString("password");
        this.f38447r = this.f38445f.getString("requestPhone");
        this.f38448s = this.f38445f.getString("phoneHash");
        this.v = this.f38445f.getString("phoneCode");
        String string = this.f38445f.getString("email_unconfirmed_pattern");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            ?? obj = new Object();
            obj.f23182a |= 256;
            obj.f23183b = indexOf;
            int i10 = lastIndexOf + 1;
            obj.f23184c = i10;
            valueOf.setSpan(new org.telegram.ui.Components.d11(obj, 0), indexOf, i10, 0);
        }
        this.d.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailNoAccess), valueOf));
        qg0.T0(this.f38451y, xd0Var);
        xd0Var.requestFocus();
    }

    @Override
    public final void n() {
        this.f38443b.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.G6, false));
        this.f38444c.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.D6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.q6, false));
        this.f38442a.invalidate();
    }

    public final void o(boolean z10) {
        xd0 xd0Var = this.f38442a;
        if (this.f38451y.getParentActivity() == null) {
            return;
        }
        try {
            xd0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z10) {
            for (as asVar : xd0Var.f40236f) {
                asVar.setText("");
            }
        }
        for (as asVar2 : xd0Var.f40236f) {
            asVar2.i(1.0f);
        }
        xd0Var.f40236f[0].requestFocus();
        AndroidUtilities.shakeViewSpring(xd0Var, new se0(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f38450x);
    }
}
