package org.telegram.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class wc0 extends org.telegram.ui.Components.xt0 {
    public GoogleSignInAccount D;
    public final fe0 E;
    public final org.telegram.ui.Components.lb0 f50980a;
    public final EditTextBoldCursor f50981b;
    public final TextView f50982c;
    public final org.telegram.ui.Components.w70 d;
    public final TextView f50983e;
    public final org.telegram.ui.Components.d80 f50984f;
    public final org.telegram.ui.Components.ch0 h;
    public Bundle f50985n;
    public boolean f50986r;
    public String f50987s;
    public String f50988w;
    public String f50989x;
    public String f50990y;

    public wc0(org.telegram.ui.fe0 r28, android.content.Context r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wc0.<init>(org.telegram.ui.fe0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return !this.E.f45704h0;
    }

    @Override
    public String getHeaderName() {
        return org.telegram.messenger.id.M0(2131754441, "AddEmailTitle");
    }

    @Override
    public final void h(String str) {
        String obj;
        int i7;
        int i10;
        if (this.f50986r) {
            return;
        }
        GoogleSignInAccount googleSignInAccount = this.D;
        if (googleSignInAccount != null) {
            obj = googleSignInAccount.f6457c;
        } else {
            obj = this.f50981b.getText().toString();
        }
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.f50987s);
        bundle.putString("ephone", this.f50988w);
        bundle.putString("phoneFormated", this.f50989x);
        bundle.putString("phoneHash", this.f50990y);
        bundle.putString("email", obj);
        bundle.putBoolean("setup", true);
        GoogleSignInAccount googleSignInAccount2 = this.D;
        fe0 fe0Var = this.E;
        if (googleSignInAccount2 != null) {
            TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
            if (fe0Var.F == 3) {
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup.phone_number = this.f50989x;
                tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.f50990y;
                verifyemail.purpose = tL_emailVerifyPurposeLoginSetup;
            }
            TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
            tL_emailVerificationGoogle.token = this.D.f6456b;
            verifyemail.verification = tL_emailVerificationGoogle;
            this.D = null;
            i10 = ((org.telegram.ui.ActionBar.f2) fe0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(verifyemail, new z9(this, bundle, verifyemail, 21), 10);
        } else if (TextUtils.isEmpty(obj)) {
            n();
        } else {
            this.f50986r = true;
            fe0Var.F1(0, true);
            TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
            if (fe0Var.F == 3) {
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup2 = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup2.phone_number = this.f50989x;
                tL_emailVerifyPurposeLoginSetup2.phone_code_hash = this.f50990y;
                sendverifyemailcode.purpose = tL_emailVerifyPurposeLoginSetup2;
            }
            sendverifyemailcode.email = obj;
            i7 = ((org.telegram.ui.ActionBar.f2) fe0Var).currentAccount;
            ConnectionsManager.getInstance(i7).sendRequest(sendverifyemailcode, new z9(this, bundle, sendverifyemailcode, 22), 10);
        }
    }

    @Override
    public final void j() {
        org.telegram.messenger.g0.i3(new vc0(this, 0), fe0.f45691y0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailsetup_params");
        this.f50985n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailsetup_email");
        if (string != null) {
            this.f50981b.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f50981b.getText().toString();
        if (obj != null && obj.length() != 0) {
            bundle.putString("emailsetup_email", obj);
        }
        Bundle bundle2 = this.f50985n;
        if (bundle2 != null) {
            bundle.putBundle("emailsetup_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z9) {
        int i7;
        if (bundle == null) {
            return;
        }
        EditTextBoldCursor editTextBoldCursor = this.f50981b;
        editTextBoldCursor.setText("");
        this.f50985n = bundle;
        this.f50987s = bundle.getString("phone");
        this.f50988w = this.f50985n.getString("ephone");
        this.f50989x = this.f50985n.getString("phoneFormated");
        this.f50990y = this.f50985n.getString("phoneHash");
        if (bundle.getBoolean("googleSignInAllowed") && org.telegram.messenger.tt.f25665b.hasServices()) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        this.f50984f.setVisibility(i7);
        this.f50983e.setVisibility(i7);
        fe0.b1(this.E, editTextBoldCursor);
        editTextBoldCursor.requestFocus();
    }

    public final void n() {
        org.telegram.ui.Components.lb0 lb0Var = this.f50980a;
        fe0 fe0Var = this.E;
        if (fe0Var.getParentActivity() == null) {
            return;
        }
        try {
            lb0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        this.f50981b.requestFocus();
        fe0.c1(fe0Var, lb0Var, true);
        postDelayed(new vc0(this, 1), 300L);
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        this.f50982c.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.D6, false);
        org.telegram.ui.Components.w70 w70Var = this.d;
        w70Var.setTextColor(x02);
        w70Var.setLinkTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Uc, false));
        this.f50981b.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
        this.f50983e.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28130q6, false));
        this.f50984f.updateColors();
        this.f50980a.invalidate();
    }
}
