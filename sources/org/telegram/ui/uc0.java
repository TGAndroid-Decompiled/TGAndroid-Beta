package org.telegram.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class uc0 extends org.telegram.ui.Components.yt0 {
    public GoogleSignInAccount D;
    public final ee0 E;
    public final org.telegram.ui.Components.mb0 f50365a;
    public final EditTextBoldCursor f50366b;
    public final TextView f50367c;
    public final org.telegram.ui.Components.x70 d;
    public final TextView f50368e;
    public final org.telegram.ui.Components.e80 f50369f;
    public final org.telegram.ui.Components.dh0 h;
    public Bundle f50370n;
    public boolean f50371r;
    public String f50372s;
    public String f50373w;
    public String f50374x;
    public String f50375y;

    public uc0(org.telegram.ui.ee0 r28, android.content.Context r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uc0.<init>(org.telegram.ui.ee0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return !this.E.f45380h0;
    }

    @Override
    public String getHeaderName() {
        return org.telegram.messenger.id.M0(2131754441, "AddEmailTitle");
    }

    @Override
    public final void h(String str) {
        String obj;
        int i7;
        int i10;
        if (this.f50371r) {
            return;
        }
        GoogleSignInAccount googleSignInAccount = this.D;
        if (googleSignInAccount != null) {
            obj = googleSignInAccount.f6452c;
        } else {
            obj = this.f50366b.getText().toString();
        }
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.f50372s);
        bundle.putString("ephone", this.f50373w);
        bundle.putString("phoneFormated", this.f50374x);
        bundle.putString("phoneHash", this.f50375y);
        bundle.putString("email", obj);
        bundle.putBoolean("setup", true);
        GoogleSignInAccount googleSignInAccount2 = this.D;
        ee0 ee0Var = this.E;
        if (googleSignInAccount2 != null) {
            TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
            if (ee0Var.F == 3) {
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup.phone_number = this.f50374x;
                tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.f50375y;
                verifyemail.purpose = tL_emailVerifyPurposeLoginSetup;
            }
            TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
            tL_emailVerificationGoogle.token = this.D.f6451b;
            verifyemail.verification = tL_emailVerificationGoogle;
            this.D = null;
            i10 = ((org.telegram.ui.ActionBar.f2) ee0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(verifyemail, new z9(this, bundle, verifyemail, 21), 10);
        } else if (TextUtils.isEmpty(obj)) {
            n();
        } else {
            this.f50371r = true;
            ee0Var.F1(0, true);
            TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
            if (ee0Var.F == 3) {
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup2 = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup2.phone_number = this.f50374x;
                tL_emailVerifyPurposeLoginSetup2.phone_code_hash = this.f50375y;
                sendverifyemailcode.purpose = tL_emailVerifyPurposeLoginSetup2;
            }
            sendverifyemailcode.email = obj;
            i7 = ((org.telegram.ui.ActionBar.f2) ee0Var).currentAccount;
            ConnectionsManager.getInstance(i7).sendRequest(sendverifyemailcode, new z9(this, bundle, sendverifyemailcode, 22), 10);
        }
    }

    @Override
    public final void j() {
        org.telegram.messenger.g0.i3(new tc0(this, 0), ee0.f45367y0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailsetup_params");
        this.f50370n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailsetup_email");
        if (string != null) {
            this.f50366b.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f50366b.getText().toString();
        if (obj != null && obj.length() != 0) {
            bundle.putString("emailsetup_email", obj);
        }
        Bundle bundle2 = this.f50370n;
        if (bundle2 != null) {
            bundle.putBundle("emailsetup_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z9) {
        int i7;
        if (bundle == null) {
            return;
        }
        EditTextBoldCursor editTextBoldCursor = this.f50366b;
        editTextBoldCursor.setText("");
        this.f50370n = bundle;
        this.f50372s = bundle.getString("phone");
        this.f50373w = this.f50370n.getString("ephone");
        this.f50374x = this.f50370n.getString("phoneFormated");
        this.f50375y = this.f50370n.getString("phoneHash");
        if (bundle.getBoolean("googleSignInAllowed") && org.telegram.messenger.tt.f25661b.hasServices()) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        this.f50369f.setVisibility(i7);
        this.f50368e.setVisibility(i7);
        ee0.b1(this.E, editTextBoldCursor);
        editTextBoldCursor.requestFocus();
    }

    public final void n() {
        org.telegram.ui.Components.mb0 mb0Var = this.f50365a;
        ee0 ee0Var = this.E;
        if (ee0Var.getParentActivity() == null) {
            return;
        }
        try {
            mb0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        this.f50366b.requestFocus();
        ee0.c1(ee0Var, mb0Var, true);
        postDelayed(new tc0(this, 1), 300L);
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.l6.G6;
        this.f50367c.setTextColor(org.telegram.ui.ActionBar.l6.x0(null, i7, false));
        int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.D6, false);
        org.telegram.ui.Components.x70 x70Var = this.d;
        x70Var.setTextColor(x02);
        x70Var.setLinkTextColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Uc, false));
        this.f50366b.setTextColor(org.telegram.ui.ActionBar.l6.x0(null, i7, false));
        this.f50368e.setTextColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28105q6, false));
        this.f50369f.updateColors();
        this.f50365a.invalidate();
    }
}
