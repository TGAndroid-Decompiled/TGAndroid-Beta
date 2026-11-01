package org.telegram.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class yd0 extends org.telegram.ui.Components.av0 {
    public GoogleSignInAccount D;
    public final gf0 E;
    public final org.telegram.ui.Components.ec0 f43640a;
    public final EditTextBoldCursor f43641b;
    public final TextView f43642c;
    public final org.telegram.ui.Components.p80 d;
    public final TextView e;
    public final org.telegram.ui.Components.w80 f43643f;
    public final org.telegram.ui.Components.fi0 h;
    public Bundle f43644n;
    public boolean f43645r;
    public String f43646s;
    public String f43647w;
    public String f43648x;
    public String f43649y;

    public yd0(org.telegram.ui.gf0 r28, android.content.Context r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yd0.<init>(org.telegram.ui.gf0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return !this.E.f37482h0;
    }

    @Override
    public String getHeaderName() {
        return org.telegram.messenger.dd.L0(2131754441, "AddEmailTitle");
    }

    @Override
    public final void h(String str) {
        String obj;
        int i10;
        int i11;
        if (this.f43645r) {
            return;
        }
        GoogleSignInAccount googleSignInAccount = this.D;
        if (googleSignInAccount != null) {
            obj = googleSignInAccount.d;
        } else {
            obj = this.f43641b.getText().toString();
        }
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.f43646s);
        bundle.putString("ephone", this.f43647w);
        bundle.putString("phoneFormated", this.f43648x);
        bundle.putString("phoneHash", this.f43649y);
        bundle.putString("email", obj);
        bundle.putBoolean("setup", true);
        GoogleSignInAccount googleSignInAccount2 = this.D;
        gf0 gf0Var = this.E;
        if (googleSignInAccount2 != null) {
            TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
            if (gf0Var.F == 3) {
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup.phone_number = this.f43648x;
                tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.f43649y;
                verifyemail.purpose = tL_emailVerifyPurposeLoginSetup;
            }
            TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
            tL_emailVerificationGoogle.token = this.D.f4265c;
            verifyemail.verification = tL_emailVerificationGoogle;
            this.D = null;
            i11 = ((org.telegram.ui.ActionBar.k2) gf0Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(verifyemail, new aa(this, bundle, verifyemail, 21), 10);
        } else if (TextUtils.isEmpty(obj)) {
            n();
        } else {
            this.f43645r = true;
            gf0Var.w1(0, true);
            TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
            if (gf0Var.F == 3) {
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup2 = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup2.phone_number = this.f43648x;
                tL_emailVerifyPurposeLoginSetup2.phone_code_hash = this.f43649y;
                sendverifyemailcode.purpose = tL_emailVerifyPurposeLoginSetup2;
            }
            sendverifyemailcode.email = obj;
            i10 = ((org.telegram.ui.ActionBar.k2) gf0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(sendverifyemailcode, new aa(this, bundle, sendverifyemailcode, 22), 10);
        }
    }

    @Override
    public final void j() {
        org.telegram.messenger.i0.h3(new xd0(this, 0), gf0.f37470y0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailsetup_params");
        this.f43644n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailsetup_email");
        if (string != null) {
            this.f43641b.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f43641b.getText().toString();
        if (obj != null && obj.length() != 0) {
            bundle.putString("emailsetup_email", obj);
        }
        Bundle bundle2 = this.f43644n;
        if (bundle2 != null) {
            bundle.putBundle("emailsetup_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        int i10;
        if (bundle == null) {
            return;
        }
        EditTextBoldCursor editTextBoldCursor = this.f43641b;
        editTextBoldCursor.setText("");
        this.f43644n = bundle;
        this.f43646s = bundle.getString("phone");
        this.f43647w = this.f43644n.getString("ephone");
        this.f43648x = this.f43644n.getString("phoneFormated");
        this.f43649y = this.f43644n.getString("phoneHash");
        if (bundle.getBoolean("googleSignInAllowed") && org.telegram.messenger.fu.f15792b.hasServices()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f43643f.setVisibility(i10);
        this.e.setVisibility(i10);
        gf0.a1(this.E, editTextBoldCursor);
        editTextBoldCursor.requestFocus();
    }

    public final void n() {
        org.telegram.ui.Components.ec0 ec0Var = this.f43640a;
        gf0 gf0Var = this.E;
        if (gf0Var.getParentActivity() == null) {
            return;
        }
        try {
            ec0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        this.f43641b.requestFocus();
        gf0.b1(gf0Var, ec0Var, true);
        postDelayed(new xd0(this, 1), 300L);
    }

    @Override
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        this.f43642c.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.D6, false);
        org.telegram.ui.Components.p80 p80Var = this.d;
        p80Var.setTextColor(x02);
        p80Var.setLinkTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Uc, false));
        this.f43641b.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
        this.e.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.q6, false));
        this.f43643f.updateColors();
        this.f43640a.invalidate();
    }
}
