package org.telegram.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class zd0 extends org.telegram.ui.Components.zu0 {
    public GoogleSignInAccount D;
    public final hf0 E;
    public final org.telegram.ui.Components.ec0 f44126a;
    public final EditTextBoldCursor f44127b;
    public final TextView f44128c;
    public final org.telegram.ui.Components.p80 d;
    public final TextView e;
    public final org.telegram.ui.Components.w80 f44129f;
    public final org.telegram.ui.Components.ei0 h;
    public Bundle f44130n;
    public boolean f44131r;
    public String f44132s;
    public String f44133w;
    public String f44134x;
    public String f44135y;

    public zd0(org.telegram.ui.hf0 r28, android.content.Context r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zd0.<init>(org.telegram.ui.hf0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return !this.E.f37929h0;
    }

    @Override
    public String getHeaderName() {
        return org.telegram.messenger.cd.L0(2131754441, "AddEmailTitle");
    }

    @Override
    public final void h(String str) {
        String obj;
        int i10;
        int i11;
        if (this.f44131r) {
            return;
        }
        GoogleSignInAccount googleSignInAccount = this.D;
        if (googleSignInAccount != null) {
            obj = googleSignInAccount.d;
        } else {
            obj = this.f44127b.getText().toString();
        }
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.f44132s);
        bundle.putString("ephone", this.f44133w);
        bundle.putString("phoneFormated", this.f44134x);
        bundle.putString("phoneHash", this.f44135y);
        bundle.putString("email", obj);
        bundle.putBoolean("setup", true);
        GoogleSignInAccount googleSignInAccount2 = this.D;
        hf0 hf0Var = this.E;
        if (googleSignInAccount2 != null) {
            TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
            if (hf0Var.F == 3) {
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup.phone_number = this.f44134x;
                tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.f44135y;
                verifyemail.purpose = tL_emailVerifyPurposeLoginSetup;
            }
            TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
            tL_emailVerificationGoogle.token = this.D.f4265c;
            verifyemail.verification = tL_emailVerificationGoogle;
            this.D = null;
            i11 = ((org.telegram.ui.ActionBar.k2) hf0Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(verifyemail, new aa(this, bundle, verifyemail, 21), 10);
        } else if (TextUtils.isEmpty(obj)) {
            n();
        } else {
            this.f44131r = true;
            hf0Var.v1(0, true);
            TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
            if (hf0Var.F == 3) {
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup2 = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup2.phone_number = this.f44134x;
                tL_emailVerifyPurposeLoginSetup2.phone_code_hash = this.f44135y;
                sendverifyemailcode.purpose = tL_emailVerifyPurposeLoginSetup2;
            }
            sendverifyemailcode.email = obj;
            i10 = ((org.telegram.ui.ActionBar.k2) hf0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(sendverifyemailcode, new aa(this, bundle, sendverifyemailcode, 22), 10);
        }
    }

    @Override
    public final void j() {
        org.telegram.messenger.i0.h3(new yd0(this, 0), hf0.f37917y0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailsetup_params");
        this.f44130n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailsetup_email");
        if (string != null) {
            this.f44127b.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f44127b.getText().toString();
        if (obj != null && obj.length() != 0) {
            bundle.putString("emailsetup_email", obj);
        }
        Bundle bundle2 = this.f44130n;
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
        EditTextBoldCursor editTextBoldCursor = this.f44127b;
        editTextBoldCursor.setText("");
        this.f44130n = bundle;
        this.f44132s = bundle.getString("phone");
        this.f44133w = this.f44130n.getString("ephone");
        this.f44134x = this.f44130n.getString("phoneFormated");
        this.f44135y = this.f44130n.getString("phoneHash");
        if (bundle.getBoolean("googleSignInAllowed") && org.telegram.messenger.eu.f15451b.hasServices()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f44129f.setVisibility(i10);
        this.e.setVisibility(i10);
        hf0.Z0(this.E, editTextBoldCursor);
        editTextBoldCursor.requestFocus();
    }

    public final void n() {
        org.telegram.ui.Components.ec0 ec0Var = this.f44126a;
        hf0 hf0Var = this.E;
        if (hf0Var.getParentActivity() == null) {
            return;
        }
        try {
            ec0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        this.f44127b.requestFocus();
        hf0.a1(hf0Var, ec0Var, true);
        postDelayed(new yd0(this, 1), 300L);
    }

    @Override
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        this.f44128c.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.D6, false);
        org.telegram.ui.Components.p80 p80Var = this.d;
        p80Var.setTextColor(x02);
        p80Var.setLinkTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Uc, false));
        this.f44127b.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
        this.e.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.q6, false));
        this.f44129f.updateColors();
        this.f44126a.invalidate();
    }
}
