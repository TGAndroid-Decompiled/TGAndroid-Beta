package org.telegram.ui;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ye0 extends org.telegram.ui.Components.yw0 {
    public final be0 f44369a;
    public final TextView f44370b;
    public final TextView f44371c;
    public final vh.n d;
    public final org.telegram.ui.Components.gk0 f44372e;
    public Bundle f44373f;
    public String h;
    public boolean f44374n;
    public String f44375r;
    public String f44376s;
    public String v;
    public boolean f44377w;
    public final we0 f44378x;
    public final vg0 f44379y;

    public ye0(org.telegram.ui.vg0 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ye0.<init>(org.telegram.ui.vg0, android.content.Context):void");
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
        this.f44379y.k1(true, true);
        this.f44373f = null;
        this.f44374n = false;
        return true;
    }

    @Override
    public final void d() {
        this.f44374n = false;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("LoginPassword", R.string.LoginPassword);
    }

    @Override
    public final void h(String str) {
        int i10;
        if (this.f44374n) {
            return;
        }
        be0 be0Var = this.f44369a;
        be0Var.f36483e = true;
        for (ds dsVar : be0Var.f36484f) {
            dsVar.j(0.0f);
        }
        String code = be0Var.getCode();
        if (code.length() == 0) {
            o(false);
            return;
        }
        this.f44374n = true;
        vg0 vg0Var = this.f44379y;
        vg0Var.n1(0, true);
        TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
        tL_auth_checkRecoveryPassword.code = code;
        i10 = ((org.telegram.ui.ActionBar.m2) vg0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkRecoveryPassword, new zb0(2, this, code), 10);
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new we0(this, 0), vg0.f43044t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params");
        this.f44373f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("recoveryview_code");
        if (string != null) {
            this.f44369a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f44369a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("recoveryview_code", code);
        }
        Bundle bundle2 = this.f44373f;
        if (bundle2 != null) {
            bundle.putBundle("recoveryview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        be0 be0Var = this.f44369a;
        be0Var.setText("");
        this.f44373f = bundle;
        this.h = bundle.getString("password");
        this.f44375r = this.f44373f.getString("requestPhone");
        this.f44376s = this.f44373f.getString("phoneHash");
        this.v = this.f44373f.getString("phoneCode");
        String string = this.f44373f.getString("email_unconfirmed_pattern");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            ?? obj = new Object();
            obj.f31418a |= 256;
            obj.f31419b = indexOf;
            int i10 = lastIndexOf + 1;
            obj.f31420c = i10;
            valueOf.setSpan(new org.telegram.ui.Components.v11(obj, 0), indexOf, i10, 0);
        }
        this.d.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailNoAccess), valueOf));
        vg0.T0(this.f44379y, be0Var);
        be0Var.requestFocus();
    }

    @Override
    public final void n() {
        this.f44370b.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false));
        this.f44371c.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.D6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q6, false));
        this.f44369a.invalidate();
    }

    public final void o(boolean z10) {
        be0 be0Var = this.f44369a;
        if (this.f44379y.getParentActivity() == null) {
            return;
        }
        try {
            be0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z10) {
            for (ds dsVar : be0Var.f36484f) {
                dsVar.setText("");
            }
        }
        for (ds dsVar2 : be0Var.f36484f) {
            dsVar2.i(1.0f);
        }
        be0Var.f36484f[0].requestFocus();
        AndroidUtilities.shakeViewSpring(be0Var, new we0(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f44378x);
    }
}
