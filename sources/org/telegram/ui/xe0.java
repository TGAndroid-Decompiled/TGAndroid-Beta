package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.widget.FrameLayout;
import android.widget.Space;
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

public final class xe0 extends org.telegram.ui.Components.ev0 {
    public final ig0 A;

    public final org.telegram.ui.Components.jc0 f44425a;

    public final EditTextBoldCursor f44426b;

    public final TextView f44427c;
    public final org.telegram.ui.Components.p80 d;

    public final TextView f44428e;

    public final org.telegram.ui.Components.w80 f44429f;
    public final org.telegram.ui.Components.ri0 h;

    public Bundle f44430n;

    public boolean f44431r;

    public String f44432s;
    public String v;

    public String f44433w;

    public String f44434x;

    public GoogleSignInAccount f44435y;

    public xe0(ig0 ig0Var, Context context) {
        int i10;
        super(context);
        this.A = ig0Var;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.ri0 ri0Var = new org.telegram.ui.Components.ri0(context);
        this.h = ri0Var;
        ri0Var.f(R.raw.tsv_setup_mail, 120, 120, null);
        ri0Var.setAutoRepeat(false);
        frameLayout.addView(ri0Var, h7.z5.e(120, 120, 1));
        if (AndroidUtilities.isSmallScreen()) {
            i10 = 8;
        } else {
            Point point = AndroidUtilities.displaySize;
            if (point.x <= point.y || AndroidUtilities.isTablet()) {
                i10 = 0;
            } else {
                i10 = 8;
            }
        }
        frameLayout.setVisibility(i10);
        addView(frameLayout, h7.z5.e(-1, -2, 1));
        TextView textView = new TextView(context);
        this.f44427c = textView;
        org.telegram.ui.Cells.pa.m(18.0f, 1, textView);
        textView.setText(LocaleController.getString(ig0Var.B == 3 ? R.string.EnterNewEmail : R.string.AddEmailTitle));
        textView.setGravity(17);
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView, h7.z5.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
        org.telegram.ui.Components.p80 p80Var = new org.telegram.ui.Components.p80(context, null);
        this.d = p80Var;
        p80Var.setTextSize(1, 14.0f);
        p80Var.setGravity(17);
        p80Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        p80Var.setText(LocaleController.getString(R.string.AddEmailSubtitle));
        addView(p80Var, h7.z5.t(-2, -2, 1, 32, 8, 32, 0));
        org.telegram.ui.Components.jc0 jc0Var = new org.telegram.ui.Components.jc0(context, null);
        this.f44425a = jc0Var;
        jc0Var.setText(LocaleController.getString(ig0Var.B == 3 ? R.string.YourNewEmail : R.string.YourEmail));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f44426b = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435461);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setInputType(33);
        editTextBoldCursor.setOnFocusChangeListener(new ld(this, 7));
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        jc0Var.e(editTextBoldCursor);
        jc0Var.addView(editTextBoldCursor, h7.z5.e(-1, -2, 48));
        editTextBoldCursor.setOnEditorActionListener(new fa(this, 7));
        addView(jc0Var, h7.z5.k(16.0f, 24.0f, 16.0f, 0.0f, -1, 58));
        TextView textView2 = new TextView(context);
        this.f44428e = textView2;
        textView2.setGravity(3);
        textView2.setTextSize(1, 14.0f);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        textView2.setMaxLines(2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
        Drawable drawable = context.getDrawable(2131231175);
        drawable.setBounds(0, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(27.0f));
        spannableStringBuilder.setSpan(new ImageSpan(drawable, 0), 0, 1, 33);
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.zy(3), 1, 2, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.SignInWithGoogle));
        textView2.setText(spannableStringBuilder);
        org.telegram.ui.Components.w80 w80Var = new org.telegram.ui.Components.w80(context);
        this.f44429f = w80Var;
        addView(new Space(context), h7.z5.l(1.0f, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.addView(textView2, h7.z5.d(-2, -2.0f, 83, 0.0f, 0.0f, 0.0f, 24.0f));
        frameLayout2.addView(w80Var, h7.z5.d(-2, 16.0f, 83, 0.0f, 0.0f, 0.0f, 70.0f));
        w80Var.setMeasureAfter(textView2);
        addView(frameLayout2, h7.z5.n(-1, -2));
        i6.q2(frameLayout2);
        frameLayout2.setOnClickListener(new u50(this, 8));
    }

    @Override
    public final boolean b() {
        return !this.A.f39085d0;
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("AddEmailTitle", R.string.AddEmailTitle);
    }

    @Override
    public final void h(String str) {
        if (this.f44431r) {
            return;
        }
        GoogleSignInAccount googleSignInAccount = this.f44435y;
        String string = googleSignInAccount != null ? googleSignInAccount.d : this.f44426b.getText().toString();
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.f44432s);
        bundle.putString("ephone", this.v);
        bundle.putString("phoneFormated", this.f44433w);
        bundle.putString("phoneHash", this.f44434x);
        bundle.putString("email", string);
        bundle.putBoolean("setup", true);
        GoogleSignInAccount googleSignInAccount2 = this.f44435y;
        ig0 ig0Var = this.A;
        if (googleSignInAccount2 != null) {
            TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
            if (ig0Var.B == 3) {
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup.phone_number = this.f44433w;
                tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.f44434x;
                verifyemail.purpose = tL_emailVerifyPurposeLoginSetup;
            }
            TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
            tL_emailVerificationGoogle.token = this.f44435y.f3103c;
            verifyemail.verification = tL_emailVerificationGoogle;
            this.f44435y = null;
            ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) ig0Var).currentAccount).sendRequest(verifyemail, new z9(this, bundle, verifyemail, 21), 10);
            return;
        }
        if (TextUtils.isEmpty(string)) {
            o();
            return;
        }
        this.f44431r = true;
        ig0Var.n1(0, true);
        TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
        if (ig0Var.B == 3) {
            sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
        } else {
            TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup2 = new TLRPC.TL_emailVerifyPurposeLoginSetup();
            tL_emailVerifyPurposeLoginSetup2.phone_number = this.f44433w;
            tL_emailVerifyPurposeLoginSetup2.phone_code_hash = this.f44434x;
            sendverifyemailcode.purpose = tL_emailVerifyPurposeLoginSetup2;
        }
        sendverifyemailcode.email = string;
        ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) ig0Var).currentAccount).sendRequest(sendverifyemailcode, new z9(this, bundle, sendverifyemailcode, 22), 10);
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new ve0(this, 0), ig0.f39078p0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailsetup_params");
        this.f44430n = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailsetup_email");
        if (string != null) {
            this.f44426b.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String string = this.f44426b.getText().toString();
        if (string != null && string.length() != 0) {
            bundle.putString("emailsetup_email", string);
        }
        Bundle bundle2 = this.f44430n;
        if (bundle2 != null) {
            bundle.putBundle("emailsetup_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        EditTextBoldCursor editTextBoldCursor = this.f44426b;
        editTextBoldCursor.setText("");
        this.f44430n = bundle;
        this.f44432s = bundle.getString("phone");
        this.v = this.f44430n.getString("ephone");
        this.f44433w = this.f44430n.getString("phoneFormated");
        this.f44434x = this.f44430n.getString("phoneHash");
        int i10 = (bundle.getBoolean("googleSignInAllowed") && PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) ? 0 : 8;
        this.f44429f.setVisibility(i10);
        this.f44428e.setVisibility(i10);
        ig0.T0(this.A, editTextBoldCursor);
        editTextBoldCursor.requestFocus();
    }

    @Override
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        this.f44427c.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.D6, false);
        org.telegram.ui.Components.p80 p80Var = this.d;
        p80Var.setTextColor(iW0);
        p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.gc, false));
        this.f44426b.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        this.f44428e.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q6, false));
        this.f44429f.a();
        this.f44425a.invalidate();
    }

    public final void o() {
        org.telegram.ui.Components.jc0 jc0Var = this.f44425a;
        ig0 ig0Var = this.A;
        if (ig0Var.getParentActivity() == null) {
            return;
        }
        try {
            jc0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        this.f44426b.requestFocus();
        ig0.U0(ig0Var, jc0Var, true);
        postDelayed(new ve0(this, 1), 300L);
    }
}
