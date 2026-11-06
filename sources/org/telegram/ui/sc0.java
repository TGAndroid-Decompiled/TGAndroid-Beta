package org.telegram.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class sc0 extends org.telegram.ui.Components.wt0 {
    public GoogleSignInAccount D;
    public final ce0 E;
    public final org.telegram.ui.Components.lb0 f49716a;
    public final EditTextBoldCursor f49717b;
    public final TextView f49718c;
    public final org.telegram.ui.Components.w70 d;
    public final TextView f49719e;
    public final org.telegram.ui.Components.d80 f49720f;
    public final org.telegram.ui.Components.ch0 h;
    public Bundle f49721n;
    public boolean f49722r;
    public String f49723s;
    public String f49724w;
    public String f49725x;
    public String f49726y;

    public sc0(org.telegram.ui.ce0 r28, android.content.Context r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sc0.<init>(org.telegram.ui.ce0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return !this.E.f44748h0;
    }

    @Override
    public String getHeaderName() {
        return org.telegram.messenger.hd.M0(2131754441, "AddEmailTitle");
    }

    @Override
    public final void h(String str) {
        String obj;
        int i7;
        int i10;
        if (this.f49722r) {
            return;
        }
        GoogleSignInAccount googleSignInAccount = this.D;
        if (googleSignInAccount != null) {
            obj = googleSignInAccount.f6454c;
        } else {
            obj = this.f49717b.getText().toString();
        }
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.f49723s);
        bundle.putString("ephone", this.f49724w);
        bundle.putString("phoneFormated", this.f49725x);
        bundle.putString("phoneHash", this.f49726y);
        bundle.putString("email", obj);
        bundle.putBoolean("setup", true);
        GoogleSignInAccount googleSignInAccount2 = this.D;
        ce0 ce0Var = this.E;
        if (googleSignInAccount2 != null) {
            TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
            if (ce0Var.F == 3) {
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup.phone_number = this.f49725x;
                tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.f49726y;
                verifyemail.purpose = tL_emailVerifyPurposeLoginSetup;
            }
            TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
            tL_emailVerificationGoogle.token = this.D.f6453b;
            verifyemail.verification = tL_emailVerificationGoogle;
            this.D = null;
            i10 = ((org.telegram.ui.ActionBar.f2) ce0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(verifyemail, new z9(this, bundle, verifyemail, 21), 10);
        } else if (TextUtils.isEmpty(obj)) {
            n();
        } else {
            this.f49722r = true;
            ce0Var.F1(0, true);
            TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
            if (ce0Var.F == 3) {
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup2 = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup2.phone_number = this.f49725x;
                tL_emailVerifyPurposeLoginSetup2.phone_code_hash = this.f49726y;
                sendverifyemailcode.purpose = tL_emailVerifyPurposeLoginSetup2;
            }
            sendverifyemailcode.email = obj;
            i7 = ((org.telegram.ui.ActionBar.f2) ce0Var).currentAccount;
            ConnectionsManager.getInstance(i7).sendRequest(sendverifyemailcode, new z9(this, bundle, sendverifyemailcode, 22), 10);
        }
    }

    @Override
    public final void j() {
        org.telegram.messenger.g0.i3(new rc0(this, 0), ce0.f44735y0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailsetup_params");
        this.f49721n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailsetup_email");
        if (string != null) {
            this.f49717b.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f49717b.getText().toString();
        if (obj != null && obj.length() != 0) {
            bundle.putString("emailsetup_email", obj);
        }
        Bundle bundle2 = this.f49721n;
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
        EditTextBoldCursor editTextBoldCursor = this.f49717b;
        editTextBoldCursor.setText("");
        this.f49721n = bundle;
        this.f49723s = bundle.getString("phone");
        this.f49724w = this.f49721n.getString("ephone");
        this.f49725x = this.f49721n.getString("phoneFormated");
        this.f49726y = this.f49721n.getString("phoneHash");
        if (bundle.getBoolean("googleSignInAllowed") && org.telegram.messenger.tt.f25652b.hasServices()) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        this.f49720f.setVisibility(i7);
        this.f49719e.setVisibility(i7);
        ce0.b1(this.E, editTextBoldCursor);
        editTextBoldCursor.requestFocus();
    }

    public final void n() {
        org.telegram.ui.Components.lb0 lb0Var = this.f49716a;
        ce0 ce0Var = this.E;
        if (ce0Var.getParentActivity() == null) {
            return;
        }
        try {
            lb0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        this.f49717b.requestFocus();
        ce0.c1(ce0Var, lb0Var, true);
        postDelayed(new rc0(this, 1), 300L);
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.k6.G6;
        this.f49718c.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i7, false));
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.D6, false);
        org.telegram.ui.Components.w70 w70Var = this.d;
        w70Var.setTextColor(x02);
        w70Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Uc, false));
        this.f49717b.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i7, false));
        this.f49719e.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28088q6, false));
        this.f49720f.updateColors();
        this.f49716a.invalidate();
    }
}
