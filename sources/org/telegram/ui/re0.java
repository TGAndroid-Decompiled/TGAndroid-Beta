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
public final class re0 extends org.telegram.ui.Components.pw0 {
    public final dg0 E;
    public final org.telegram.ui.Components.sd0 f41131a;
    public final EditTextBoldCursor f41132b;
    public final TextView f41133c;
    public final org.telegram.ui.Components.x90 d;
    public final TextView e;
    public final org.telegram.ui.Components.ea0 f41134f;
    public final org.telegram.ui.Components.xj0 h;
    public Bundle f41135n;
    public boolean f41136r;
    public String f41137s;
    public String v;
    public String f41138w;
    public String f41139x;
    public GoogleSignInAccount f41140y;

    public re0(org.telegram.ui.dg0 r27, android.content.Context r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.re0.<init>(org.telegram.ui.dg0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return !this.E.f36371h0;
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
        if (this.f41136r) {
            return;
        }
        GoogleSignInAccount googleSignInAccount = this.f41140y;
        if (googleSignInAccount != null) {
            obj = googleSignInAccount.d;
        } else {
            obj = this.f41132b.getText().toString();
        }
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.f41137s);
        bundle.putString("ephone", this.v);
        bundle.putString("phoneFormated", this.f41138w);
        bundle.putString("phoneHash", this.f41139x);
        bundle.putString("email", obj);
        bundle.putBoolean("setup", true);
        GoogleSignInAccount googleSignInAccount2 = this.f41140y;
        dg0 dg0Var = this.E;
        if (googleSignInAccount2 != null) {
            TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
            if (dg0Var.F == 3) {
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup.phone_number = this.f41138w;
                tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.f41139x;
                verifyemail.purpose = tL_emailVerifyPurposeLoginSetup;
            }
            TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
            tL_emailVerificationGoogle.token = this.f41140y.f6276c;
            verifyemail.verification = tL_emailVerificationGoogle;
            this.f41140y = null;
            i11 = ((org.telegram.ui.ActionBar.n2) dg0Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(verifyemail, new ca(this, bundle, verifyemail, 21), 10);
        } else if (TextUtils.isEmpty(obj)) {
            o();
        } else {
            this.f41136r = true;
            dg0Var.n1(0, true);
            TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
            if (dg0Var.F == 3) {
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup2 = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup2.phone_number = this.f41138w;
                tL_emailVerifyPurposeLoginSetup2.phone_code_hash = this.f41139x;
                sendverifyemailcode.purpose = tL_emailVerifyPurposeLoginSetup2;
            }
            sendverifyemailcode.email = obj;
            i10 = ((org.telegram.ui.ActionBar.n2) dg0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(sendverifyemailcode, new ca(this, bundle, sendverifyemailcode, 22), 10);
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new pe0(this, 0), dg0.f36359t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailsetup_params");
        this.f41135n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailsetup_email");
        if (string != null) {
            this.f41132b.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f41132b.getText().toString();
        if (obj != null && obj.length() != 0) {
            bundle.putString("emailsetup_email", obj);
        }
        Bundle bundle2 = this.f41135n;
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
        EditTextBoldCursor editTextBoldCursor = this.f41132b;
        editTextBoldCursor.setText("");
        this.f41135n = bundle;
        this.f41137s = bundle.getString("phone");
        this.v = this.f41135n.getString("ephone");
        this.f41138w = this.f41135n.getString("phoneFormated");
        this.f41139x = this.f41135n.getString("phoneHash");
        if (bundle.getBoolean("googleSignInAllowed") && PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f41134f.setVisibility(i10);
        this.e.setVisibility(i10);
        dg0.T0(this.E, editTextBoldCursor);
        editTextBoldCursor.requestFocus();
    }

    @Override
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        this.f41133c.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.D6, false);
        org.telegram.ui.Components.x90 x90Var = this.d;
        x90Var.setTextColor(x02);
        x90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21046gc, false));
        this.f41132b.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        this.e.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q6, false));
        this.f41134f.a();
        this.f41131a.invalidate();
    }

    public final void o() {
        org.telegram.ui.Components.sd0 sd0Var = this.f41131a;
        dg0 dg0Var = this.E;
        if (dg0Var.getParentActivity() == null) {
            return;
        }
        try {
            sd0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        this.f41132b.requestFocus();
        dg0.U0(dg0Var, sd0Var, true);
        postDelayed(new pe0(this, 1), 300L);
    }
}
