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
public final class te0 extends org.telegram.ui.Components.mv0 {
    public final fg0 A;
    public final org.telegram.ui.Components.uc0 f42674a;
    public final EditTextBoldCursor f42675b;
    public final TextView f42676c;
    public final org.telegram.ui.Components.y80 d;
    public final TextView f42677e;
    public final org.telegram.ui.Components.f90 f42678f;
    public final org.telegram.ui.Components.aj0 h;
    public Bundle f42679n;
    public boolean f42680r;
    public String f42681s;
    public String v;
    public String f42682w;
    public String f42683x;
    public GoogleSignInAccount f42684y;

    public te0(org.telegram.ui.fg0 r27, android.content.Context r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.te0.<init>(org.telegram.ui.fg0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return !this.A.f38157d0;
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
        if (this.f42680r) {
            return;
        }
        GoogleSignInAccount googleSignInAccount = this.f42684y;
        if (googleSignInAccount != null) {
            obj = googleSignInAccount.d;
        } else {
            obj = this.f42675b.getText().toString();
        }
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.f42681s);
        bundle.putString("ephone", this.v);
        bundle.putString("phoneFormated", this.f42682w);
        bundle.putString("phoneHash", this.f42683x);
        bundle.putString("email", obj);
        bundle.putBoolean("setup", true);
        GoogleSignInAccount googleSignInAccount2 = this.f42684y;
        fg0 fg0Var = this.A;
        if (googleSignInAccount2 != null) {
            TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
            if (fg0Var.B == 3) {
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup.phone_number = this.f42682w;
                tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.f42683x;
                verifyemail.purpose = tL_emailVerifyPurposeLoginSetup;
            }
            TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
            tL_emailVerificationGoogle.token = this.f42684y.f3680c;
            verifyemail.verification = tL_emailVerificationGoogle;
            this.f42684y = null;
            i11 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(verifyemail, new x9(this, bundle, verifyemail, 21), 10);
        } else if (TextUtils.isEmpty(obj)) {
            o();
        } else {
            this.f42680r = true;
            fg0Var.n1(0, true);
            TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
            if (fg0Var.B == 3) {
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup2 = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup2.phone_number = this.f42682w;
                tL_emailVerifyPurposeLoginSetup2.phone_code_hash = this.f42683x;
                sendverifyemailcode.purpose = tL_emailVerifyPurposeLoginSetup2;
            }
            sendverifyemailcode.email = obj;
            i10 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(sendverifyemailcode, new x9(this, bundle, sendverifyemailcode, 22), 10);
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new re0(this, 0), fg0.f38150p0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailsetup_params");
        this.f42679n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailsetup_email");
        if (string != null) {
            this.f42675b.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f42675b.getText().toString();
        if (obj != null && obj.length() != 0) {
            bundle.putString("emailsetup_email", obj);
        }
        Bundle bundle2 = this.f42679n;
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
        EditTextBoldCursor editTextBoldCursor = this.f42675b;
        editTextBoldCursor.setText("");
        this.f42679n = bundle;
        this.f42681s = bundle.getString("phone");
        this.v = this.f42679n.getString("ephone");
        this.f42682w = this.f42679n.getString("phoneFormated");
        this.f42683x = this.f42679n.getString("phoneHash");
        if (bundle.getBoolean("googleSignInAllowed") && PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f42678f.setVisibility(i10);
        this.f42677e.setVisibility(i10);
        fg0.T0(this.A, editTextBoldCursor);
        editTextBoldCursor.requestFocus();
    }

    @Override
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        this.f42676c.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.D6, false);
        org.telegram.ui.Components.y80 y80Var = this.d;
        y80Var.setTextColor(w02);
        y80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.gc, false));
        this.f42675b.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        this.f42677e.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q6, false));
        this.f42678f.a();
        this.f42674a.invalidate();
    }

    public final void o() {
        org.telegram.ui.Components.uc0 uc0Var = this.f42674a;
        fg0 fg0Var = this.A;
        if (fg0Var.getParentActivity() == null) {
            return;
        }
        try {
            uc0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        this.f42675b.requestFocus();
        fg0.U0(fg0Var, uc0Var, true);
        postDelayed(new re0(this, 1), 300L);
    }
}
