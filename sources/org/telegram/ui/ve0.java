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
public final class ve0 extends org.telegram.ui.Components.ax0 {
    public final gg0 E;
    public final org.telegram.ui.Components.rd0 f44781a;
    public final EditTextBoldCursor f44782b;
    public final TextView f44783c;
    public final org.telegram.ui.Components.z90 d;
    public final TextView e;
    public final org.telegram.ui.Components.ga0 f44784f;
    public final org.telegram.ui.Components.ak0 h;
    public Bundle f44785n;
    public boolean f44786r;
    public String f44787s;
    public String v;
    public String f44788w;
    public String f44789x;
    public GoogleSignInAccount f44790y;

    public ve0(org.telegram.ui.gg0 r26, android.content.Context r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ve0.<init>(org.telegram.ui.gg0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return !this.E.f39662h0;
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
        if (this.f44786r) {
            return;
        }
        GoogleSignInAccount googleSignInAccount = this.f44790y;
        if (googleSignInAccount != null) {
            obj = googleSignInAccount.d;
        } else {
            obj = this.f44782b.getText().toString();
        }
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.f44787s);
        bundle.putString("ephone", this.v);
        bundle.putString("phoneFormated", this.f44788w);
        bundle.putString("phoneHash", this.f44789x);
        bundle.putString("email", obj);
        bundle.putBoolean("setup", true);
        GoogleSignInAccount googleSignInAccount2 = this.f44790y;
        gg0 gg0Var = this.E;
        if (googleSignInAccount2 != null) {
            TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
            if (gg0Var.F == 3) {
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup.phone_number = this.f44788w;
                tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.f44789x;
                verifyemail.purpose = tL_emailVerifyPurposeLoginSetup;
            }
            TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
            tL_emailVerificationGoogle.token = this.f44790y.f6398c;
            verifyemail.verification = tL_emailVerificationGoogle;
            this.f44790y = null;
            i11 = ((org.telegram.ui.ActionBar.r2) gg0Var).currentAccount;
            ConnectionsManager.getInstance(i11).sendRequest(verifyemail, new ea(this, bundle, verifyemail, 21), 10);
        } else if (TextUtils.isEmpty(obj)) {
            n();
        } else {
            this.f44786r = true;
            gg0Var.s1(0, true);
            TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
            if (gg0Var.F == 3) {
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup2 = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup2.phone_number = this.f44788w;
                tL_emailVerifyPurposeLoginSetup2.phone_code_hash = this.f44789x;
                sendverifyemailcode.purpose = tL_emailVerifyPurposeLoginSetup2;
            }
            sendverifyemailcode.email = obj;
            i10 = ((org.telegram.ui.ActionBar.r2) gg0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(sendverifyemailcode, new ea(this, bundle, sendverifyemailcode, 22), 10);
        }
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new te0(this, 0), gg0.f39650x0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailsetup_params");
        this.f44785n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailsetup_email");
        if (string != null) {
            this.f44782b.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f44782b.getText().toString();
        if (obj != null && obj.length() != 0) {
            bundle.putString("emailsetup_email", obj);
        }
        Bundle bundle2 = this.f44785n;
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
        EditTextBoldCursor editTextBoldCursor = this.f44782b;
        editTextBoldCursor.setText("");
        this.f44785n = bundle;
        this.f44787s = bundle.getString("phone");
        this.v = this.f44785n.getString("ephone");
        this.f44788w = this.f44785n.getString("phoneFormated");
        this.f44789x = this.f44785n.getString("phoneHash");
        if (bundle.getBoolean("googleSignInAllowed") && PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f44784f.setVisibility(i10);
        this.e.setVisibility(i10);
        gg0.W0(this.E, editTextBoldCursor);
        editTextBoldCursor.requestFocus();
    }

    public final void n() {
        org.telegram.ui.Components.rd0 rd0Var = this.f44781a;
        gg0 gg0Var = this.E;
        if (gg0Var.getParentActivity() == null) {
            return;
        }
        try {
            rd0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        this.f44782b.requestFocus();
        gg0.X0(gg0Var, rd0Var, true);
        postDelayed(new te0(this, 1), 300L);
    }

    @Override
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.y6.G6;
        this.f44783c.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.D6, false);
        org.telegram.ui.Components.z90 z90Var = this.d;
        z90Var.setTextColor(x02);
        z90Var.setLinkTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.gc, false));
        this.f44782b.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
        this.e.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23597q6, false));
        this.f44784f.updateColors();
        this.f44781a.invalidate();
    }
}
