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
public final class ue0 extends org.telegram.ui.Components.cv0 {
    public final fg0 A;
    public final org.telegram.ui.Components.fc0 f43228a;
    public final EditTextBoldCursor f43229b;
    public final TextView f43230c;
    public final org.telegram.ui.Components.l80 d;
    public final TextView f43231e;
    public final org.telegram.ui.Components.s80 f43232f;
    public final org.telegram.ui.Components.pi0 h;
    public Bundle f43233n;
    public boolean f43234r;
    public String f43235s;
    public String v;
    public String f43236w;
    public String f43237x;
    public GoogleSignInAccount f43238y;

    public ue0(org.telegram.ui.fg0 r27, android.content.Context r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ue0.<init>(org.telegram.ui.fg0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return !this.A.f38265d0;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("AddEmailTitle", R.string.AddEmailTitle);
    }

    @Override
    public final void h(String str) {
        String obj;
        int i9;
        int i10;
        if (this.f43234r) {
            return;
        }
        GoogleSignInAccount googleSignInAccount = this.f43238y;
        if (googleSignInAccount != null) {
            obj = googleSignInAccount.d;
        } else {
            obj = this.f43229b.getText().toString();
        }
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.f43235s);
        bundle.putString("ephone", this.v);
        bundle.putString("phoneFormated", this.f43236w);
        bundle.putString("phoneHash", this.f43237x);
        bundle.putString("email", obj);
        bundle.putBoolean("setup", true);
        GoogleSignInAccount googleSignInAccount2 = this.f43238y;
        fg0 fg0Var = this.A;
        if (googleSignInAccount2 != null) {
            TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
            if (fg0Var.B == 3) {
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup.phone_number = this.f43236w;
                tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.f43237x;
                verifyemail.purpose = tL_emailVerifyPurposeLoginSetup;
            }
            TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
            tL_emailVerificationGoogle.token = this.f43238y.f2666c;
            verifyemail.verification = tL_emailVerificationGoogle;
            this.f43238y = null;
            i10 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(verifyemail, new y9(this, bundle, verifyemail, 21), 10);
        } else if (TextUtils.isEmpty(obj)) {
            o();
        } else {
            this.f43234r = true;
            fg0Var.n1(0, true);
            TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
            if (fg0Var.B == 3) {
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup2 = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup2.phone_number = this.f43236w;
                tL_emailVerifyPurposeLoginSetup2.phone_code_hash = this.f43237x;
                sendverifyemailcode.purpose = tL_emailVerifyPurposeLoginSetup2;
            }
            sendverifyemailcode.email = obj;
            i9 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
            ConnectionsManager.getInstance(i9).sendRequest(sendverifyemailcode, new y9(this, bundle, sendverifyemailcode, 22), 10);
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new se0(this, 0), fg0.f38258p0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailsetup_params");
        this.f43233n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailsetup_email");
        if (string != null) {
            this.f43229b.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f43229b.getText().toString();
        if (obj != null && obj.length() != 0) {
            bundle.putString("emailsetup_email", obj);
        }
        Bundle bundle2 = this.f43233n;
        if (bundle2 != null) {
            bundle.putBundle("emailsetup_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        int i9;
        if (bundle == null) {
            return;
        }
        EditTextBoldCursor editTextBoldCursor = this.f43229b;
        editTextBoldCursor.setText("");
        this.f43233n = bundle;
        this.f43235s = bundle.getString("phone");
        this.v = this.f43233n.getString("ephone");
        this.f43236w = this.f43233n.getString("phoneFormated");
        this.f43237x = this.f43233n.getString("phoneHash");
        if (bundle.getBoolean("googleSignInAllowed") && PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        this.f43232f.setVisibility(i9);
        this.f43231e.setVisibility(i9);
        fg0.T0(this.A, editTextBoldCursor);
        editTextBoldCursor.requestFocus();
    }

    @Override
    public final void n() {
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        this.f43230c.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.D6, false);
        org.telegram.ui.Components.l80 l80Var = this.d;
        l80Var.setTextColor(w02);
        l80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23061gc, false));
        this.f43229b.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        this.f43231e.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23229q6, false));
        this.f43232f.a();
        this.f43228a.invalidate();
    }

    public final void o() {
        org.telegram.ui.Components.fc0 fc0Var = this.f43228a;
        fg0 fg0Var = this.A;
        if (fg0Var.getParentActivity() == null) {
            return;
        }
        try {
            fc0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        this.f43229b.requestFocus();
        fg0.U0(fg0Var, fc0Var, true);
        postDelayed(new se0(this, 1), 300L);
    }
}
