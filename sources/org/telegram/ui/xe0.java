package org.telegram.ui;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class xe0 extends org.telegram.ui.Components.hw0 {
    public final ae0 f39618a;
    public final TextView f39619b;
    public final TextView f39620c;
    public final vh.n d;
    public final org.telegram.ui.Components.nj0 e;
    public Bundle f39621f;
    public String h;
    public boolean f39622n;
    public String f39623r;
    public String f39624s;
    public String v;
    public boolean f39625w;
    public final ve0 f39626x;
    public final tg0 f39627y;

    public xe0(org.telegram.ui.tg0 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xe0.<init>(org.telegram.ui.tg0, android.content.Context):void");
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
        this.f39627y.k1(true, true);
        this.f39621f = null;
        this.f39622n = false;
        return true;
    }

    @Override
    public final void d() {
        this.f39622n = false;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("LoginPassword", R.string.LoginPassword);
    }

    @Override
    public final void h(String str) {
        int i10;
        if (this.f39622n) {
            return;
        }
        ae0 ae0Var = this.f39618a;
        ae0Var.e = true;
        for (ds dsVar : ae0Var.f32431f) {
            dsVar.j(0.0f);
        }
        String code = ae0Var.getCode();
        if (code.length() == 0) {
            o(false);
            return;
        }
        this.f39622n = true;
        tg0 tg0Var = this.f39627y;
        tg0Var.n1(0, true);
        TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
        tL_auth_checkRecoveryPassword.code = code;
        i10 = ((org.telegram.ui.ActionBar.o2) tg0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkRecoveryPassword, new yb0(2, this, code), 10);
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new ve0(this, 0), tg0.f37783t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params");
        this.f39621f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("recoveryview_code");
        if (string != null) {
            this.f39618a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f39618a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("recoveryview_code", code);
        }
        Bundle bundle2 = this.f39621f;
        if (bundle2 != null) {
            bundle.putBundle("recoveryview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        ae0 ae0Var = this.f39618a;
        ae0Var.setText("");
        this.f39621f = bundle;
        this.h = bundle.getString("password");
        this.f39623r = this.f39621f.getString("requestPhone");
        this.f39624s = this.f39621f.getString("phoneHash");
        this.v = this.f39621f.getString("phoneCode");
        String string = this.f39621f.getString("email_unconfirmed_pattern");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            ?? obj = new Object();
            obj.f23485a |= 256;
            obj.f23486b = indexOf;
            int i10 = lastIndexOf + 1;
            obj.f23487c = i10;
            valueOf.setSpan(new org.telegram.ui.Components.e11(obj, 0), indexOf, i10, 0);
        }
        this.d.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailNoAccess), valueOf));
        tg0.T0(this.f39627y, ae0Var);
        ae0Var.requestFocus();
    }

    @Override
    public final void n() {
        this.f39619b.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.G6, false));
        this.f39620c.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.D6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.q6, false));
        this.f39618a.invalidate();
    }

    public final void o(boolean z10) {
        ae0 ae0Var = this.f39618a;
        if (this.f39627y.getParentActivity() == null) {
            return;
        }
        try {
            ae0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z10) {
            for (ds dsVar : ae0Var.f32431f) {
                dsVar.setText("");
            }
        }
        for (ds dsVar2 : ae0Var.f32431f) {
            dsVar2.i(1.0f);
        }
        ae0Var.f32431f[0].requestFocus();
        AndroidUtilities.shakeViewSpring(ae0Var, new ve0(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f39626x);
    }
}
