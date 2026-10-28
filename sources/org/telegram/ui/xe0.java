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
public final class xe0 extends org.telegram.ui.Components.bx0 {
    public final ig0 E;
    public final org.telegram.ui.Components.sd0 f45663a;
    public final EditTextBoldCursor f45664b;
    public final TextView f45665c;
    public final org.telegram.ui.Components.aa0 d;
    public final TextView e;
    public final org.telegram.ui.Components.ha0 f45666f;
    public final org.telegram.ui.Components.bk0 h;
    public Bundle f45667n;
    public boolean f45668r;
    public String f45669s;
    public String v;
    public String f45670w;
    public String f45671x;
    public GoogleSignInAccount f45672y;

    public xe0(org.telegram.ui.ig0 r26, android.content.Context r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xe0.<init>(org.telegram.ui.ig0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return !this.E.f40151h0;
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
        if (this.f45668r) {
            return;
        }
        GoogleSignInAccount googleSignInAccount = this.f45672y;
        if (googleSignInAccount != null) {
            obj = googleSignInAccount.d;
        } else {
            obj = this.f45664b.getText().toString();
        }
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.f45669s);
        bundle.putString("ephone", this.v);
        bundle.putString("phoneFormated", this.f45670w);
        bundle.putString("phoneHash", this.f45671x);
        bundle.putString("email", obj);
        bundle.putBoolean("setup", true);
        GoogleSignInAccount googleSignInAccount2 = this.f45672y;
        ig0 ig0Var = this.E;
        if (googleSignInAccount2 != null) {
            TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
            if (ig0Var.F == 3) {
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup.phone_number = this.f45670w;
                tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.f45671x;
                verifyemail.purpose = tL_emailVerifyPurposeLoginSetup;
            }
            TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
            tL_emailVerificationGoogle.token = this.f45672y.f6398c;
            verifyemail.verification = tL_emailVerificationGoogle;
            this.f45672y = null;
            i11 = ((org.telegram.ui.ActionBar.r2) ig0Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(verifyemail, new ea(this, bundle, verifyemail, 21), 10);
        } else if (TextUtils.isEmpty(obj)) {
            n();
        } else {
            this.f45668r = true;
            ig0Var.s1(0, true);
            TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
            if (ig0Var.F == 3) {
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup2 = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup2.phone_number = this.f45670w;
                tL_emailVerifyPurposeLoginSetup2.phone_code_hash = this.f45671x;
                sendverifyemailcode.purpose = tL_emailVerifyPurposeLoginSetup2;
            }
            sendverifyemailcode.email = obj;
            i10 = ((org.telegram.ui.ActionBar.r2) ig0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(sendverifyemailcode, new ea(this, bundle, sendverifyemailcode, 22), 10);
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new ve0(this, 0), ig0.f40139y0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailsetup_params");
        this.f45667n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailsetup_email");
        if (string != null) {
            this.f45664b.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f45664b.getText().toString();
        if (obj != null && obj.length() != 0) {
            bundle.putString("emailsetup_email", obj);
        }
        Bundle bundle2 = this.f45667n;
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
        EditTextBoldCursor editTextBoldCursor = this.f45664b;
        editTextBoldCursor.setText("");
        this.f45667n = bundle;
        this.f45669s = bundle.getString("phone");
        this.v = this.f45667n.getString("ephone");
        this.f45670w = this.f45667n.getString("phoneFormated");
        this.f45671x = this.f45667n.getString("phoneHash");
        if (bundle.getBoolean("googleSignInAllowed") && PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f45666f.setVisibility(i10);
        this.e.setVisibility(i10);
        ig0.W0(this.E, editTextBoldCursor);
        editTextBoldCursor.requestFocus();
    }

    public final void n() {
        org.telegram.ui.Components.sd0 sd0Var = this.f45663a;
        ig0 ig0Var = this.E;
        if (ig0Var.getParentActivity() == null) {
            return;
        }
        try {
            sd0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        this.f45664b.requestFocus();
        ig0.X0(ig0Var, sd0Var, true);
        postDelayed(new ve0(this, 1), 300L);
    }

    @Override
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.y6.G6;
        this.f45665c.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.D6, false);
        org.telegram.ui.Components.aa0 aa0Var = this.d;
        aa0Var.setTextColor(x02);
        aa0Var.setLinkTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.gc, false));
        this.f45664b.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
        this.e.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23598q6, false));
        this.f45666f.updateColors();
        this.f45663a.invalidate();
    }
}
