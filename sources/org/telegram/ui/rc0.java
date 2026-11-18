package org.telegram.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class rc0 extends org.telegram.ui.Components.fu0 {
    public GoogleSignInAccount E;
    public final de0 F;
    public final org.telegram.ui.Components.xb0 f51566a;
    public final EditTextBoldCursor f51567b;
    public final TextView f51568c;
    public final org.telegram.ui.Components.k80 d;
    public final TextView f51569e;
    public final org.telegram.ui.Components.r80 f51570f;
    public final org.telegram.ui.Components.ph0 h;
    public Bundle f51571n;
    public boolean f51572r;
    public String f51573s;
    public String f51574w;
    public String f51575x;
    public String f51576y;

    public rc0(org.telegram.ui.de0 r28, android.content.Context r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rc0.<init>(org.telegram.ui.de0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return !this.F.f46946i0;
    }

    @Override
    public String getHeaderName() {
        return org.telegram.messenger.gd.M0(2131754439, "AddEmailTitle");
    }

    @Override
    public final void h(String str) {
        String obj;
        int i7;
        int i10;
        if (this.f51572r) {
            return;
        }
        GoogleSignInAccount googleSignInAccount = this.E;
        if (googleSignInAccount != null) {
            obj = googleSignInAccount.f6122c;
        } else {
            obj = this.f51567b.getText().toString();
        }
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.f51573s);
        bundle.putString("ephone", this.f51574w);
        bundle.putString("phoneFormated", this.f51575x);
        bundle.putString("phoneHash", this.f51576y);
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
                tL_emailVerifyPurposeLoginSetup.phone_number = this.f51575x;
                tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.f51576y;
                verifyemail.purpose = tL_emailVerifyPurposeLoginSetup;
            }
            TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
            tL_emailVerificationGoogle.token = this.E.f6121b;
            verifyemail.verification = tL_emailVerificationGoogle;
            this.E = null;
            i10 = ((org.telegram.ui.ActionBar.h2) de0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(verifyemail, new z9(this, bundle, verifyemail, 21), 10);
        } else if (TextUtils.isEmpty(obj)) {
            n();
        } else {
            this.f51572r = true;
            de0Var.F1(0, true);
            TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
            if (de0Var.G == 3) {
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup2 = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup2.phone_number = this.f51575x;
                tL_emailVerifyPurposeLoginSetup2.phone_code_hash = this.f51576y;
                sendverifyemailcode.purpose = tL_emailVerifyPurposeLoginSetup2;
            }
            sendverifyemailcode.email = obj;
            i7 = ((org.telegram.ui.ActionBar.h2) de0Var).currentAccount;
            ConnectionsManager.getInstance(i7).sendRequest(sendverifyemailcode, new z9(this, bundle, sendverifyemailcode, 22), 10);
        }
    }

    @Override
    public final void j() {
        org.telegram.messenger.g0.h3(new qc0(this, 0), de0.A0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailsetup_params");
        this.f51571n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailsetup_email");
        if (string != null) {
            this.f51567b.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f51567b.getText().toString();
        if (obj != null && obj.length() != 0) {
            bundle.putString("emailsetup_email", obj);
        }
        Bundle bundle2 = this.f51571n;
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
        EditTextBoldCursor editTextBoldCursor = this.f51567b;
        editTextBoldCursor.setText("");
        this.f51571n = bundle;
        this.f51573s = bundle.getString("phone");
        this.f51574w = this.f51571n.getString("ephone");
        this.f51575x = this.f51571n.getString("phoneFormated");
        this.f51576y = this.f51571n.getString("phoneHash");
        if (bundle.getBoolean("googleSignInAllowed") && org.telegram.messenger.nt.f25968b.hasServices()) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        this.f51570f.setVisibility(i7);
        this.f51569e.setVisibility(i7);
        de0.b1(this.F, editTextBoldCursor);
        editTextBoldCursor.requestFocus();
    }

    public final void n() {
        org.telegram.ui.Components.xb0 xb0Var = this.f51566a;
        de0 de0Var = this.F;
        if (de0Var.getParentActivity() == null) {
            return;
        }
        try {
            xb0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        this.f51567b.requestFocus();
        de0.c1(de0Var, xb0Var, true);
        postDelayed(new qc0(this, 1), 300L);
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.n6.G6;
        this.f51568c.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, i7, false));
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.D6, false);
        org.telegram.ui.Components.k80 k80Var = this.d;
        k80Var.setTextColor(x02);
        k80Var.setLinkTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Xc, false));
        this.f51567b.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, i7, false));
        this.f51569e.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29636q6, false));
        this.f51570f.updateColors();
        this.f51566a.invalidate();
    }
}
