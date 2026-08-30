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
    public final vd0 f38312a;
    public final TextView f38313b;
    public final TextView f38314c;
    public final ih.s d;
    public final org.telegram.ui.Components.jj0 e;
    public Bundle f38315f;
    public String h;
    public boolean f38316n;
    public String f38317r;
    public String f38318s;
    public String v;
    public boolean f38319w;
    public final qe0 f38320x;
    public final ng0 f38321y;

    public se0(org.telegram.ui.ng0 r20, android.content.Context r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.se0.<init>(org.telegram.ui.ng0, android.content.Context):void");
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
        this.f38321y.k1(true, true);
        this.f38315f = null;
        this.f38316n = false;
        return true;
    }

    @Override
    public final void d() {
        this.f38316n = false;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("LoginPassword", R.string.LoginPassword);
    }

    @Override
    public final void h(String str) {
        int i10;
        if (this.f38316n) {
            return;
        }
        vd0 vd0Var = this.f38312a;
        vd0Var.e = true;
        for (bs bsVar : vd0Var.f40565f) {
            bsVar.j(0.0f);
        }
        String code = vd0Var.getCode();
        if (code.length() == 0) {
            o(false);
            return;
        }
        this.f38316n = true;
        ng0 ng0Var = this.f38321y;
        ng0Var.n1(0, true);
        TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
        tL_auth_checkRecoveryPassword.code = code;
        i10 = ((org.telegram.ui.ActionBar.p2) ng0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_checkRecoveryPassword, new sb0(2, this, code), 10);
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new qe0(this, 0), ng0.f36621q0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params");
        this.f38315f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("recoveryview_code");
        if (string != null) {
            this.f38312a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f38312a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("recoveryview_code", code);
        }
        Bundle bundle2 = this.f38315f;
        if (bundle2 != null) {
            bundle.putBundle("recoveryview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z4) {
        if (bundle == null) {
            return;
        }
        vd0 vd0Var = this.f38312a;
        vd0Var.setText("");
        this.f38315f = bundle;
        this.h = bundle.getString("password");
        this.f38317r = this.f38315f.getString("requestPhone");
        this.f38318s = this.f38315f.getString("phoneHash");
        this.v = this.f38315f.getString("phoneCode");
        String string = this.f38315f.getString("email_unconfirmed_pattern");
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        int indexOf = string.indexOf(42);
        int lastIndexOf = string.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            ?? obj = new Object();
            obj.f28583a |= 256;
            obj.f28584b = indexOf;
            int i10 = lastIndexOf + 1;
            obj.f28585c = i10;
            valueOf.setSpan(new org.telegram.ui.Components.t01(obj, 0), indexOf, i10, 0);
        }
        this.d.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailNoAccess), valueOf));
        ng0.T0(this.f38321y, vd0Var);
        vd0Var.requestFocus();
    }

    @Override
    public final void n() {
        this.f38313b.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        this.f38314c.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.D6, false));
        this.d.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20140q6, false));
        this.f38312a.invalidate();
    }

    public final void o(boolean z4) {
        vd0 vd0Var = this.f38312a;
        if (this.f38321y.getParentActivity() == null) {
            return;
        }
        try {
            vd0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z4) {
            for (bs bsVar : vd0Var.f40565f) {
                bsVar.setText("");
            }
        }
        for (bs bsVar2 : vd0Var.f40565f) {
            bsVar2.i(1.0f);
        }
        vd0Var.f40565f[0].requestFocus();
        AndroidUtilities.shakeViewSpring(vd0Var, new qe0(this, 2));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f38320x);
    }
}
