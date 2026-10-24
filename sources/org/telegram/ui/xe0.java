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
public final class xe0 extends org.telegram.ui.Components.sw0 {
    public final hg0 E;
    public final org.telegram.ui.Components.td0 f43534a;
    public final EditTextBoldCursor f43535b;
    public final TextView f43536c;
    public final org.telegram.ui.Components.w90 d;
    public final TextView e;
    public final org.telegram.ui.Components.da0 f43537f;
    public final org.telegram.ui.Components.ak0 h;
    public Bundle f43538n;
    public boolean f43539r;
    public String f43540s;
    public String v;
    public String f43541w;
    public String f43542x;
    public GoogleSignInAccount f43543y;

    public xe0(org.telegram.ui.hg0 r27, android.content.Context r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xe0.<init>(org.telegram.ui.hg0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return !this.E.f37844h0;
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
        if (this.f43539r) {
            return;
        }
        GoogleSignInAccount googleSignInAccount = this.f43543y;
        if (googleSignInAccount != null) {
            obj = googleSignInAccount.d;
        } else {
            obj = this.f43535b.getText().toString();
        }
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.f43540s);
        bundle.putString("ephone", this.v);
        bundle.putString("phoneFormated", this.f43541w);
        bundle.putString("phoneHash", this.f43542x);
        bundle.putString("email", obj);
        bundle.putBoolean("setup", true);
        GoogleSignInAccount googleSignInAccount2 = this.f43543y;
        hg0 hg0Var = this.E;
        if (googleSignInAccount2 != null) {
            TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
            if (hg0Var.F == 3) {
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup.phone_number = this.f43541w;
                tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.f43542x;
                verifyemail.purpose = tL_emailVerifyPurposeLoginSetup;
            }
            TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
            tL_emailVerificationGoogle.token = this.f43543y.f6288c;
            verifyemail.verification = tL_emailVerificationGoogle;
            this.f43543y = null;
            i11 = ((org.telegram.ui.ActionBar.o2) hg0Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(verifyemail, new ca(this, bundle, verifyemail, 21), 10);
        } else if (TextUtils.isEmpty(obj)) {
            n();
        } else {
            this.f43539r = true;
            hg0Var.r1(0, true);
            TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
            if (hg0Var.F == 3) {
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup2 = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup2.phone_number = this.f43541w;
                tL_emailVerifyPurposeLoginSetup2.phone_code_hash = this.f43542x;
                sendverifyemailcode.purpose = tL_emailVerifyPurposeLoginSetup2;
            }
            sendverifyemailcode.email = obj;
            i10 = ((org.telegram.ui.ActionBar.o2) hg0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(sendverifyemailcode, new ca(this, bundle, sendverifyemailcode, 22), 10);
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new ve0(this, 0), hg0.f37832x0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailsetup_params");
        this.f43538n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailsetup_email");
        if (string != null) {
            this.f43535b.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f43535b.getText().toString();
        if (obj != null && obj.length() != 0) {
            bundle.putString("emailsetup_email", obj);
        }
        Bundle bundle2 = this.f43538n;
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
        EditTextBoldCursor editTextBoldCursor = this.f43535b;
        editTextBoldCursor.setText("");
        this.f43538n = bundle;
        this.f43540s = bundle.getString("phone");
        this.v = this.f43538n.getString("ephone");
        this.f43541w = this.f43538n.getString("phoneFormated");
        this.f43542x = this.f43538n.getString("phoneHash");
        if (bundle.getBoolean("googleSignInAllowed") && PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f43537f.setVisibility(i10);
        this.e.setVisibility(i10);
        hg0.V0(this.E, editTextBoldCursor);
        editTextBoldCursor.requestFocus();
    }

    public final void n() {
        org.telegram.ui.Components.td0 td0Var = this.f43534a;
        hg0 hg0Var = this.E;
        if (hg0Var.getParentActivity() == null) {
            return;
        }
        try {
            td0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        this.f43535b.requestFocus();
        hg0.W0(hg0Var, td0Var, true);
        postDelayed(new ve0(this, 1), 300L);
    }

    @Override
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        this.f43536c.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.D6, false);
        org.telegram.ui.Components.w90 w90Var = this.d;
        w90Var.setTextColor(x02);
        w90Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21243gc, false));
        this.f43535b.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        this.e.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q6, false));
        this.f43537f.updateColors();
        this.f43534a.invalidate();
    }
}
