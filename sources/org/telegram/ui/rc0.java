package org.telegram.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class rc0 extends org.telegram.ui.Components.xt0 {
    public GoogleSignInAccount E;
    public final ce0 F;
    public final org.telegram.ui.Components.mb0 f50907a;
    public final EditTextBoldCursor f50908b;
    public final TextView f50909c;
    public final org.telegram.ui.Components.z70 d;
    public final TextView f50910e;
    public final org.telegram.ui.Components.g80 f50911f;
    public final org.telegram.ui.Components.fh0 h;
    public Bundle f50912n;
    public boolean f50913r;
    public String f50914s;
    public String f50915w;
    public String f50916x;
    public String f50917y;

    public rc0(org.telegram.ui.ce0 r28, android.content.Context r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rc0.<init>(org.telegram.ui.ce0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return !this.F.f46087i0;
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
        if (this.f50913r) {
            return;
        }
        GoogleSignInAccount googleSignInAccount = this.E;
        if (googleSignInAccount != null) {
            obj = googleSignInAccount.f5839c;
        } else {
            obj = this.f50908b.getText().toString();
        }
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.f50914s);
        bundle.putString("ephone", this.f50915w);
        bundle.putString("phoneFormated", this.f50916x);
        bundle.putString("phoneHash", this.f50917y);
        bundle.putString("email", obj);
        bundle.putBoolean("setup", true);
        GoogleSignInAccount googleSignInAccount2 = this.E;
        ce0 ce0Var = this.F;
        if (googleSignInAccount2 != null) {
            TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
            if (ce0Var.G == 3) {
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup.phone_number = this.f50916x;
                tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.f50917y;
                verifyemail.purpose = tL_emailVerifyPurposeLoginSetup;
            }
            TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
            tL_emailVerificationGoogle.token = this.E.f5838b;
            verifyemail.verification = tL_emailVerificationGoogle;
            this.E = null;
            i10 = ((org.telegram.ui.ActionBar.e2) ce0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(verifyemail, new z9(this, bundle, verifyemail, 21), 10);
        } else if (TextUtils.isEmpty(obj)) {
            n();
        } else {
            this.f50913r = true;
            ce0Var.F1(0, true);
            TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
            if (ce0Var.G == 3) {
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup2 = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup2.phone_number = this.f50916x;
                tL_emailVerifyPurposeLoginSetup2.phone_code_hash = this.f50917y;
                sendverifyemailcode.purpose = tL_emailVerifyPurposeLoginSetup2;
            }
            sendverifyemailcode.email = obj;
            i7 = ((org.telegram.ui.ActionBar.e2) ce0Var).currentAccount;
            ConnectionsManager.getInstance(i7).sendRequest(sendverifyemailcode, new z9(this, bundle, sendverifyemailcode, 22), 10);
        }
    }

    @Override
    public final void j() {
        org.telegram.messenger.g0.i3(new qc0(this, 0), ce0.A0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailsetup_params");
        this.f50912n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailsetup_email");
        if (string != null) {
            this.f50908b.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f50908b.getText().toString();
        if (obj != null && obj.length() != 0) {
            bundle.putString("emailsetup_email", obj);
        }
        Bundle bundle2 = this.f50912n;
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
        EditTextBoldCursor editTextBoldCursor = this.f50908b;
        editTextBoldCursor.setText("");
        this.f50912n = bundle;
        this.f50914s = bundle.getString("phone");
        this.f50915w = this.f50912n.getString("ephone");
        this.f50916x = this.f50912n.getString("phoneFormated");
        this.f50917y = this.f50912n.getString("phoneHash");
        if (bundle.getBoolean("googleSignInAllowed") && org.telegram.messenger.qt.f26137b.hasServices()) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        this.f50911f.setVisibility(i7);
        this.f50910e.setVisibility(i7);
        ce0.b1(this.F, editTextBoldCursor);
        editTextBoldCursor.requestFocus();
    }

    public final void n() {
        org.telegram.ui.Components.mb0 mb0Var = this.f50907a;
        ce0 ce0Var = this.F;
        if (ce0Var.getParentActivity() == null) {
            return;
        }
        try {
            mb0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        this.f50908b.requestFocus();
        ce0.c1(ce0Var, mb0Var, true);
        postDelayed(new qc0(this, 1), 300L);
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.j6.G6;
        this.f50909c.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, i7, false));
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.D6, false);
        org.telegram.ui.Components.z70 z70Var = this.d;
        z70Var.setTextColor(x02);
        z70Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Xc, false));
        this.f50908b.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, i7, false));
        this.f50910e.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29089q6, false));
        this.f50911f.updateColors();
        this.f50907a.invalidate();
    }
}
