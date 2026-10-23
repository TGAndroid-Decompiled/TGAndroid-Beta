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
public final class ye0 extends org.telegram.ui.Components.tw0 {
    public final ig0 E;
    public final org.telegram.ui.Components.vd0 f43781a;
    public final EditTextBoldCursor f43782b;
    public final TextView f43783c;
    public final org.telegram.ui.Components.y90 d;
    public final TextView e;
    public final org.telegram.ui.Components.fa0 f43784f;
    public final org.telegram.ui.Components.bk0 h;
    public Bundle f43785n;
    public boolean f43786r;
    public String f43787s;
    public String v;
    public String f43788w;
    public String f43789x;
    public GoogleSignInAccount f43790y;

    public ye0(org.telegram.ui.ig0 r27, android.content.Context r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ye0.<init>(org.telegram.ui.ig0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return !this.E.f38203h0;
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
        if (this.f43786r) {
            return;
        }
        GoogleSignInAccount googleSignInAccount = this.f43790y;
        if (googleSignInAccount != null) {
            obj = googleSignInAccount.d;
        } else {
            obj = this.f43782b.getText().toString();
        }
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.f43787s);
        bundle.putString("ephone", this.v);
        bundle.putString("phoneFormated", this.f43788w);
        bundle.putString("phoneHash", this.f43789x);
        bundle.putString("email", obj);
        bundle.putBoolean("setup", true);
        GoogleSignInAccount googleSignInAccount2 = this.f43790y;
        ig0 ig0Var = this.E;
        if (googleSignInAccount2 != null) {
            TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
            if (ig0Var.F == 3) {
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup.phone_number = this.f43788w;
                tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.f43789x;
                verifyemail.purpose = tL_emailVerifyPurposeLoginSetup;
            }
            TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
            tL_emailVerificationGoogle.token = this.f43790y.f6288c;
            verifyemail.verification = tL_emailVerificationGoogle;
            this.f43790y = null;
            i11 = ((org.telegram.ui.ActionBar.o2) ig0Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(verifyemail, new ca(this, bundle, verifyemail, 21), 10);
        } else if (TextUtils.isEmpty(obj)) {
            n();
        } else {
            this.f43786r = true;
            ig0Var.r1(0, true);
            TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
            if (ig0Var.F == 3) {
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup2 = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup2.phone_number = this.f43788w;
                tL_emailVerifyPurposeLoginSetup2.phone_code_hash = this.f43789x;
                sendverifyemailcode.purpose = tL_emailVerifyPurposeLoginSetup2;
            }
            sendverifyemailcode.email = obj;
            i10 = ((org.telegram.ui.ActionBar.o2) ig0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(sendverifyemailcode, new ca(this, bundle, sendverifyemailcode, 22), 10);
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new we0(this, 0), ig0.f38191x0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailsetup_params");
        this.f43785n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailsetup_email");
        if (string != null) {
            this.f43782b.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f43782b.getText().toString();
        if (obj != null && obj.length() != 0) {
            bundle.putString("emailsetup_email", obj);
        }
        Bundle bundle2 = this.f43785n;
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
        EditTextBoldCursor editTextBoldCursor = this.f43782b;
        editTextBoldCursor.setText("");
        this.f43785n = bundle;
        this.f43787s = bundle.getString("phone");
        this.v = this.f43785n.getString("ephone");
        this.f43788w = this.f43785n.getString("phoneFormated");
        this.f43789x = this.f43785n.getString("phoneHash");
        if (bundle.getBoolean("googleSignInAllowed") && PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f43784f.setVisibility(i10);
        this.e.setVisibility(i10);
        ig0.V0(this.E, editTextBoldCursor);
        editTextBoldCursor.requestFocus();
    }

    public final void n() {
        org.telegram.ui.Components.vd0 vd0Var = this.f43781a;
        ig0 ig0Var = this.E;
        if (ig0Var.getParentActivity() == null) {
            return;
        }
        try {
            vd0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        this.f43782b.requestFocus();
        ig0.W0(ig0Var, vd0Var, true);
        postDelayed(new we0(this, 1), 300L);
    }

    @Override
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        this.f43783c.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.D6, false);
        org.telegram.ui.Components.y90 y90Var = this.d;
        y90Var.setTextColor(x02);
        y90Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21242gc, false));
        this.f43782b.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        this.e.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q6, false));
        this.f43784f.updateColors();
        this.f43781a.invalidate();
    }
}
