package org.telegram.ui;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ue0 extends org.telegram.ui.Components.vv0 {
    public final xd0 f38787a;
    public final TextView f38788b;
    public final TextView f38789c;
    public final ih.s d;
    public final org.telegram.ui.Components.jj0 e;
    public Bundle f38790f;
    public String h;
    public boolean f38791n;
    public String f38792r;
    public String f38793s;
    public String v;
    public boolean f38794w;
    public final se0 f38795x;
    public final pg0 f38796y;

    public ue0(org.telegram.ui.pg0 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ue0.<init>(org.telegram.ui.pg0, android.content.Context):void");
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
        this.f38796y.k1(true, true);
        this.f38790f = null;
        this.f38791n = false;
        return true;
    }

    @Override
    public final void d() {
        this.f38791n = false;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("LoginPassword", R.string.LoginPassword);
    }

    @Override
    public final void h(String str) {
        int i10;
        if (this.f38791n) {
            return;
        }
        xd0 xd0Var = this.f38787a;
        xd0Var.e = true;
        for (ds dsVar : xd0Var.f32635f) {
            dsVar.j(0.0f);
        }
        String code = xd0Var.getCode();
        if (code.length() == 0) {
            o(false);
            return;
        }
        this.f38791n = true;
        pg0 pg0Var = this.f38796y;
        pg0Var.n1(0, true);
        TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
        tL_auth_checkRecoveryPassword.code = code;
        i10 = ((org.telegram.ui.ActionBar.p2) pg0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkRecoveryPassword, new ub0(2, this, code), 10);
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new se0(this, 0), pg0.f37125q0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params");
        this.f38790f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("recoveryview_code");
        if (string != null) {
            this.f38787a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f38787a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("recoveryview_code", code);
        }
        Bundle bundle2 = this.f38790f;
        if (bundle2 != null) {
            bundle.putBundle("recoveryview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z4) {
        if (bundle == null) {
            return;
        }
        xd0 xd0Var = this.f38787a;
        xd0Var.setText("");
        this.f38790f = bundle;
        this.h = bundle.getString("password");
        this.f38792r = this.f38790f.getString("requestPhone");
        this.f38793s = this.f38790f.getString("phoneHash");
        this.v = this.f38790f.getString("phoneCode");
        String string = this.f38790f.getString("email_unconfirmed_pattern");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            ?? obj = new Object();
            obj.f28632a |= 256;
            obj.f28633b = indexOf;
            int i10 = lastIndexOf + 1;
            obj.f28634c = i10;
            valueOf.setSpan(new org.telegram.ui.Components.t01(obj, 0), indexOf, i10, 0);
        }
        this.d.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailNoAccess), valueOf));
        pg0.T0(this.f38796y, xd0Var);
        xd0Var.requestFocus();
    }

    @Override
    public final void n() {
        this.f38788b.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        this.f38789c.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.D6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20115q6, false));
        this.f38787a.invalidate();
    }

    public final void o(boolean z4) {
        xd0 xd0Var = this.f38787a;
        if (this.f38796y.getParentActivity() == null) {
            return;
        }
        try {
            xd0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z4) {
            for (ds dsVar : xd0Var.f32635f) {
                dsVar.setText("");
            }
        }
        for (ds dsVar2 : xd0Var.f32635f) {
            dsVar2.i(1.0f);
        }
        xd0Var.f32635f[0].requestFocus();
        AndroidUtilities.shakeViewSpring(xd0Var, new se0(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f38795x);
    }
}
