package org.telegram.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class te0 extends org.telegram.ui.Components.ow0 {
    public final eg0 E;
    public final org.telegram.ui.Components.sd0 f41659a;
    public final EditTextBoldCursor f41660b;
    public final TextView f41661c;
    public final org.telegram.ui.Components.x90 d;
    public final TextView e;
    public final org.telegram.ui.Components.ea0 f41662f;
    public final org.telegram.ui.Components.xj0 h;
    public Bundle f41663n;
    public boolean f41664r;
    public String f41665s;
    public String v;
    public String f41666w;
    public String f41667x;
    public GoogleSignInAccount f41668y;

    public te0(org.telegram.ui.eg0 r26, android.content.Context r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.te0.<init>(org.telegram.ui.eg0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return !this.E.f36500h0;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("AddEmailTitle", R.string.AddEmailTitle);
    }

    @Override
    public final void h(String str) {
        String obj;
        int i10;
        int i11;
        if (this.f41664r) {
            return;
        }
        GoogleSignInAccount googleSignInAccount = this.f41668y;
        if (googleSignInAccount != null) {
            obj = googleSignInAccount.d;
        } else {
            obj = this.f41660b.getText().toString();
        }
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.f41665s);
        bundle.putString("ephone", this.v);
        bundle.putString("phoneFormated", this.f41666w);
        bundle.putString("phoneHash", this.f41667x);
        bundle.putString("email", obj);
        bundle.putBoolean("setup", true);
        GoogleSignInAccount googleSignInAccount2 = this.f41668y;
        eg0 eg0Var = this.E;
        if (googleSignInAccount2 != null) {
            TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
            if (eg0Var.F == 3) {
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup.phone_number = this.f41666w;
                tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.f41667x;
                verifyemail.purpose = tL_emailVerifyPurposeLoginSetup;
            }
            TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
            tL_emailVerificationGoogle.token = this.f41668y.f6277c;
            verifyemail.verification = tL_emailVerificationGoogle;
            this.f41668y = null;
            i11 = ((org.telegram.ui.ActionBar.n2) eg0Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(verifyemail, new ea(this, bundle, verifyemail, 21), 10);
        } else if (TextUtils.isEmpty(obj)) {
            o();
        } else {
            this.f41664r = true;
            eg0Var.n1(0, true);
            TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
            if (eg0Var.F == 3) {
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup2 = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup2.phone_number = this.f41666w;
                tL_emailVerifyPurposeLoginSetup2.phone_code_hash = this.f41667x;
                sendverifyemailcode.purpose = tL_emailVerifyPurposeLoginSetup2;
            }
            sendverifyemailcode.email = obj;
            i10 = ((org.telegram.ui.ActionBar.n2) eg0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(sendverifyemailcode, new ea(this, bundle, sendverifyemailcode, 22), 10);
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new re0(this, 0), eg0.f36488t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailsetup_params");
        this.f41663n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailsetup_email");
        if (string != null) {
            this.f41660b.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f41660b.getText().toString();
        if (obj != null && obj.length() != 0) {
            bundle.putString("emailsetup_email", obj);
        }
        Bundle bundle2 = this.f41663n;
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
        EditTextBoldCursor editTextBoldCursor = this.f41660b;
        editTextBoldCursor.setText("");
        this.f41663n = bundle;
        this.f41665s = bundle.getString("phone");
        this.v = this.f41663n.getString("ephone");
        this.f41666w = this.f41663n.getString("phoneFormated");
        this.f41667x = this.f41663n.getString("phoneHash");
        if (bundle.getBoolean("googleSignInAllowed") && PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f41662f.setVisibility(i10);
        this.e.setVisibility(i10);
        eg0.T0(this.E, editTextBoldCursor);
        editTextBoldCursor.requestFocus();
    }

    @Override
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        this.f41661c.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.D6, false);
        org.telegram.ui.Components.x90 x90Var = this.d;
        x90Var.setTextColor(x02);
        x90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21045gc, false));
        this.f41660b.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        this.e.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q6, false));
        this.f41662f.a();
        this.f41659a.invalidate();
    }

    public final void o() {
        org.telegram.ui.Components.sd0 sd0Var = this.f41659a;
        eg0 eg0Var = this.E;
        if (eg0Var.getParentActivity() == null) {
            return;
        }
        try {
            sd0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        this.f41660b.requestFocus();
        eg0.U0(eg0Var, sd0Var, true);
        postDelayed(new re0(this, 1), 300L);
    }
}
