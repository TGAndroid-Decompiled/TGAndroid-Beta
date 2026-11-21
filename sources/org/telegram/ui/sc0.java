package org.telegram.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class sc0 extends org.telegram.ui.Components.iu0 {
    public GoogleSignInAccount E;
    public final de0 F;
    public final org.telegram.ui.Components.yb0 f52005a;
    public final EditTextBoldCursor f52006b;
    public final TextView f52007c;
    public final org.telegram.ui.Components.m80 d;
    public final TextView f52008e;
    public final org.telegram.ui.Components.t80 f52009f;
    public final org.telegram.ui.Components.rh0 h;
    public Bundle f52010n;
    public boolean f52011r;
    public String f52012s;
    public String f52013w;
    public String f52014x;
    public String f52015y;

    public sc0(org.telegram.ui.de0 r28, android.content.Context r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sc0.<init>(org.telegram.ui.de0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return !this.F.f46936i0;
    }

    @Override
    public String getHeaderName() {
        return org.telegram.messenger.gd.N0(2131754438, "AddEmailTitle");
    }

    @Override
    public final void h(String str) {
        String obj;
        int i7;
        int i10;
        if (this.f52011r) {
            return;
        }
        GoogleSignInAccount googleSignInAccount = this.E;
        if (googleSignInAccount != null) {
            obj = googleSignInAccount.f6148c;
        } else {
            obj = this.f52006b.getText().toString();
        }
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.f52012s);
        bundle.putString("ephone", this.f52013w);
        bundle.putString("phoneFormated", this.f52014x);
        bundle.putString("phoneHash", this.f52015y);
        bundle.putString("email", obj);
        bundle.putBoolean("setup", true);
        GoogleSignInAccount googleSignInAccount2 = this.E;
        de0 de0Var = this.F;
        if (googleSignInAccount2 != null) {
            TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
            if (de0Var.G == 3) {
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup.phone_number = this.f52014x;
                tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.f52015y;
                verifyemail.purpose = tL_emailVerifyPurposeLoginSetup;
            }
            TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
            tL_emailVerificationGoogle.token = this.E.f6147b;
            verifyemail.verification = tL_emailVerificationGoogle;
            this.E = null;
            i10 = ((org.telegram.ui.ActionBar.g2) de0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(verifyemail, new z9(this, bundle, verifyemail, 21), 10);
        } else if (TextUtils.isEmpty(obj)) {
            n();
        } else {
            this.f52011r = true;
            de0Var.F1(0, true);
            TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
            if (de0Var.G == 3) {
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup2 = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup2.phone_number = this.f52014x;
                tL_emailVerifyPurposeLoginSetup2.phone_code_hash = this.f52015y;
                sendverifyemailcode.purpose = tL_emailVerifyPurposeLoginSetup2;
            }
            sendverifyemailcode.email = obj;
            i7 = ((org.telegram.ui.ActionBar.g2) de0Var).currentAccount;
            ConnectionsManager.getInstance(i7).sendRequest(sendverifyemailcode, new z9(this, bundle, sendverifyemailcode, 22), 10);
        }
    }

    @Override
    public final void j() {
        org.telegram.messenger.g0.h3(new rc0(this, 0), de0.A0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailsetup_params");
        this.f52010n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailsetup_email");
        if (string != null) {
            this.f52006b.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f52006b.getText().toString();
        if (obj != null && obj.length() != 0) {
            bundle.putString("emailsetup_email", obj);
        }
        Bundle bundle2 = this.f52010n;
        if (bundle2 != null) {
            bundle.putBundle("emailsetup_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        int i7;
        if (bundle == null) {
            return;
        }
        EditTextBoldCursor editTextBoldCursor = this.f52006b;
        editTextBoldCursor.setText("");
        this.f52010n = bundle;
        this.f52012s = bundle.getString("phone");
        this.f52013w = this.f52010n.getString("ephone");
        this.f52014x = this.f52010n.getString("phoneFormated");
        this.f52015y = this.f52010n.getString("phoneHash");
        if (bundle.getBoolean("googleSignInAllowed") && org.telegram.messenger.nt.f25994b.hasServices()) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        this.f52009f.setVisibility(i7);
        this.f52008e.setVisibility(i7);
        de0.b1(this.F, editTextBoldCursor);
        editTextBoldCursor.requestFocus();
    }

    public final void n() {
        org.telegram.ui.Components.yb0 yb0Var = this.f52005a;
        de0 de0Var = this.F;
        if (de0Var.getParentActivity() == null) {
            return;
        }
        try {
            yb0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        this.f52006b.requestFocus();
        de0.c1(de0Var, yb0Var, true);
        postDelayed(new rc0(this, 1), 300L);
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        this.f52007c.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.D6, false);
        org.telegram.ui.Components.m80 m80Var = this.d;
        m80Var.setTextColor(x02);
        m80Var.setLinkTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Xc, false));
        this.f52006b.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
        this.f52008e.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29618q6, false));
        this.f52009f.updateColors();
        this.f52005a.invalidate();
    }
}
