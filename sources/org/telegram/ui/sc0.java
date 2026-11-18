package org.telegram.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class sc0 extends org.telegram.ui.Components.fu0 {
    public GoogleSignInAccount E;
    public final ee0 F;
    public final org.telegram.ui.Components.xb0 f51965a;
    public final EditTextBoldCursor f51966b;
    public final TextView f51967c;
    public final org.telegram.ui.Components.k80 d;
    public final TextView f51968e;
    public final org.telegram.ui.Components.r80 f51969f;
    public final org.telegram.ui.Components.ph0 h;
    public Bundle f51970n;
    public boolean f51971r;
    public String f51972s;
    public String f51973w;
    public String f51974x;
    public String f51975y;

    public sc0(org.telegram.ui.ee0 r28, android.content.Context r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sc0.<init>(org.telegram.ui.ee0, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return !this.F.f47190i0;
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
        if (this.f51971r) {
            return;
        }
        GoogleSignInAccount googleSignInAccount = this.E;
        if (googleSignInAccount != null) {
            obj = googleSignInAccount.f6119c;
        } else {
            obj = this.f51966b.getText().toString();
        }
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.f51972s);
        bundle.putString("ephone", this.f51973w);
        bundle.putString("phoneFormated", this.f51974x);
        bundle.putString("phoneHash", this.f51975y);
        bundle.putString("email", obj);
        bundle.putBoolean("setup", true);
        GoogleSignInAccount googleSignInAccount2 = this.E;
        ee0 ee0Var = this.F;
        if (googleSignInAccount2 != null) {
            TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
            if (ee0Var.G == 3) {
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup.phone_number = this.f51974x;
                tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.f51975y;
                verifyemail.purpose = tL_emailVerifyPurposeLoginSetup;
            }
            TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
            tL_emailVerificationGoogle.token = this.E.f6118b;
            verifyemail.verification = tL_emailVerificationGoogle;
            this.E = null;
            i10 = ((org.telegram.ui.ActionBar.h2) ee0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(verifyemail, new z9(this, bundle, verifyemail, 21), 10);
        } else if (TextUtils.isEmpty(obj)) {
            n();
        } else {
            this.f51971r = true;
            ee0Var.F1(0, true);
            TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
            if (ee0Var.G == 3) {
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup2 = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup2.phone_number = this.f51974x;
                tL_emailVerifyPurposeLoginSetup2.phone_code_hash = this.f51975y;
                sendverifyemailcode.purpose = tL_emailVerifyPurposeLoginSetup2;
            }
            sendverifyemailcode.email = obj;
            i7 = ((org.telegram.ui.ActionBar.h2) ee0Var).currentAccount;
            ConnectionsManager.getInstance(i7).sendRequest(sendverifyemailcode, new z9(this, bundle, sendverifyemailcode, 22), 10);
        }
    }

    @Override
    public final void j() {
        org.telegram.messenger.g0.h3(new rc0(this, 0), ee0.A0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailsetup_params");
        this.f51970n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailsetup_email");
        if (string != null) {
            this.f51966b.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.f51966b.getText().toString();
        if (obj != null && obj.length() != 0) {
            bundle.putString("emailsetup_email", obj);
        }
        Bundle bundle2 = this.f51970n;
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
        EditTextBoldCursor editTextBoldCursor = this.f51966b;
        editTextBoldCursor.setText("");
        this.f51970n = bundle;
        this.f51972s = bundle.getString("phone");
        this.f51973w = this.f51970n.getString("ephone");
        this.f51974x = this.f51970n.getString("phoneFormated");
        this.f51975y = this.f51970n.getString("phoneHash");
        if (bundle.getBoolean("googleSignInAllowed") && org.telegram.messenger.nt.f25966b.hasServices()) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        this.f51969f.setVisibility(i7);
        this.f51968e.setVisibility(i7);
        ee0.b1(this.F, editTextBoldCursor);
        editTextBoldCursor.requestFocus();
    }

    public final void n() {
        org.telegram.ui.Components.xb0 xb0Var = this.f51965a;
        ee0 ee0Var = this.F;
        if (ee0Var.getParentActivity() == null) {
            return;
        }
        try {
            xb0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        this.f51966b.requestFocus();
        ee0.c1(ee0Var, xb0Var, true);
        postDelayed(new rc0(this, 1), 300L);
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.n6.G6;
        this.f51967c.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, i7, false));
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.D6, false);
        org.telegram.ui.Components.k80 k80Var = this.d;
        k80Var.setTextColor(x02);
        k80Var.setLinkTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Xc, false));
        this.f51966b.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, i7, false));
        this.f51968e.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29634q6, false));
        this.f51969f.updateColors();
        this.f51965a.invalidate();
    }
}
