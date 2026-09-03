package org.telegram.ui;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class zd0 extends org.telegram.ui.Components.vv0 {
    public boolean B;
    public GoogleSignInAccount C;
    public int D;
    public int E;
    public String F;
    public String G;
    public String H;
    public String I;
    public String J;
    public boolean K;
    public int L;
    public final boolean M;
    public final yd0 N;
    public boolean O;
    public final sd0 P;
    public final sd0 Q;
    public final sd0 R;
    public boolean S;
    public final og0 T;
    public final wd0 f43912a;
    public final TextView f43913b;
    public final jh.s f43914c;
    public final TextView d;
    public final FrameLayout f43915e;
    public final TextView f43916f;
    public final FrameLayout h;
    public final hg.q f43917n;
    public final hg.q f43918r;
    public final TextView f43919s;
    public final org.telegram.ui.Components.n90 v;
    public final org.telegram.ui.Components.kj0 f43920w;
    public boolean f43921x;
    public Bundle f43922y;

    public zd0(org.telegram.ui.og0 r30, android.content.Context r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zd0.<init>(org.telegram.ui.og0, android.content.Context, boolean):void");
    }

    @Override
    public final void g() {
        if (this.E != 0) {
            AndroidUtilities.cancelRunOnUIThread(this.R);
        }
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString(R.string.VerificationCode);
    }

    @Override
    public final void h(String str) {
        TLRPC.TL_auth_signIn tL_auth_signIn;
        int i10;
        if (!this.B) {
            AndroidUtilities.cancelRunOnUIThread(this.Q);
            wd0 wd0Var = this.f43912a;
            wd0Var.f44010e = true;
            cs[] csVarArr = wd0Var.f44011f;
            if (csVarArr != null) {
                for (cs csVar : csVarArr) {
                    csVar.j(0.0f);
                }
            }
            String code = wd0Var.getCode();
            int length = code.length();
            og0 og0Var = this.T;
            if (length == 0 && this.C == null) {
                if (og0Var.getParentActivity() == null) {
                    return;
                }
                try {
                    wd0Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                for (cs csVar2 : wd0Var.f44011f) {
                    csVar2.i(1.0f);
                }
                wd0Var.f44011f[0].requestFocus();
                AndroidUtilities.shakeViewSpring(wd0Var, new sd0(this, 1));
                return;
            }
            this.B = true;
            og0Var.n1(0, true);
            if (og0Var.C == 3) {
                TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
                TLRPC.TL_emailVerificationCode tL_emailVerificationCode = new TLRPC.TL_emailVerificationCode();
                tL_emailVerificationCode.code = code;
                verifyemail.verification = tL_emailVerificationCode;
                tL_auth_signIn = verifyemail;
            } else if (this.K) {
                TL_account.verifyEmail verifyemail2 = new TL_account.verifyEmail();
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup.phone_number = this.I;
                tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.J;
                verifyemail2.purpose = tL_emailVerifyPurposeLoginSetup;
                TLRPC.TL_emailVerificationCode tL_emailVerificationCode2 = new TLRPC.TL_emailVerificationCode();
                tL_emailVerificationCode2.code = code;
                verifyemail2.verification = tL_emailVerificationCode2;
                tL_auth_signIn = verifyemail2;
            } else {
                TLRPC.TL_auth_signIn tL_auth_signIn2 = new TLRPC.TL_auth_signIn();
                tL_auth_signIn2.phone_number = this.I;
                tL_auth_signIn2.phone_code_hash = this.J;
                if (this.C != null) {
                    TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
                    tL_emailVerificationGoogle.token = this.C.f2571c;
                    tL_auth_signIn2.email_verification = tL_emailVerificationGoogle;
                } else {
                    TLRPC.TL_emailVerificationCode tL_emailVerificationCode3 = new TLRPC.TL_emailVerificationCode();
                    tL_emailVerificationCode3.code = code;
                    tL_auth_signIn2.email_verification = tL_emailVerificationCode3;
                }
                tL_auth_signIn2.flags = 2 | tL_auth_signIn2.flags;
                tL_auth_signIn = tL_auth_signIn2;
            }
            wd0Var.f44010e = true;
            cs[] csVarArr2 = wd0Var.f44011f;
            if (csVarArr2 != null) {
                for (cs csVar3 : csVarArr2) {
                    csVar3.j(0.0f);
                }
            }
            i10 = ((org.telegram.ui.ActionBar.p2) og0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(tL_auth_signIn, new pd0(this, code, 0), 10);
        }
    }

    @Override
    public final void j() {
        if (this.f43921x) {
            this.f43921x = false;
        } else {
            AndroidUtilities.runOnUIThread(new sd0(this, 8), og0.f39709q0);
        }
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailcode_params");
        this.f43922y = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailcode_code");
        if (string != null) {
            this.f43912a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f43912a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("emailcode_code", code);
        }
        Bundle bundle2 = this.f43922y;
        if (bundle2 != null) {
            bundle.putBundle("emailcode_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z4) {
        int i10;
        int i11;
        cs[] csVarArr;
        if (bundle != null) {
            this.f43922y = bundle;
            this.I = bundle.getString("phoneFormated");
            this.J = this.f43922y.getString("phoneHash");
            this.F = this.f43922y.getString("phone");
            this.G = this.f43922y.getString("ephone");
            this.K = this.f43922y.getBoolean("setup");
            this.L = this.f43922y.getInt("length");
            this.H = this.f43922y.getString("email");
            this.D = this.f43922y.getInt("resetAvailablePeriod");
            this.E = this.f43922y.getInt("resetPendingDate");
            og0 og0Var = this.T;
            int i12 = og0Var.C;
            int i13 = 8;
            FrameLayout frameLayout = this.h;
            jh.s sVar = this.f43914c;
            if (i12 == 3) {
                sVar.setText(LocaleController.formatString(R.string.CheckYourNewEmailSubtitle, this.H));
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout, false, 1.0f, false);
            } else if (this.M) {
                sVar.setText(LocaleController.formatString(R.string.VerificationCodeSubtitle, this.H));
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout, false, 1.0f, false);
            } else {
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 1.0f, false);
                if (this.E == 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                this.f43917n.setVisibility(i10);
                if (this.E != 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                this.f43918r.setVisibility(i11);
                if (this.E != 0) {
                    r();
                }
            }
            int i14 = this.L;
            wd0 wd0Var = this.f43912a;
            wd0Var.b(i14, 1);
            for (cs csVar : wd0Var.f44011f) {
                csVar.setShowSoftInputOnFocusCompat(AndroidUtilities.isAccessibilityTouchExplorationEnabled());
                csVar.addTextChangedListener(new n0(this, 7));
                csVar.setOnFocusChangeListener(new qd(this, 2));
            }
            wd0Var.setText("");
            if (!this.K && og0Var.C != 3) {
                String string = this.f43922y.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    ?? obj = new Object();
                    obj.f30949a |= 256;
                    obj.f30950b = indexOf;
                    int i15 = lastIndexOf + 1;
                    obj.f30951c = i15;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.t01(obj, 0), indexOf, i15, 0);
                }
                sVar.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.CheckYourEmailSubtitle), spannableStringBuilder));
            }
            if (bundle.getBoolean("googleSignInAllowed") && PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
                i13 = 0;
            }
            this.v.setVisibility(i13);
            this.d.setVisibility(i13);
            og0.T0(og0Var, wd0Var.f44011f[0]);
            wd0Var.requestFocus();
            if (!z4 && bundle.containsKey("nextType")) {
                AndroidUtilities.runOnUIThread(this.Q, bundle.getInt("timeout"));
            }
            if (this.E != 0) {
                AndroidUtilities.runOnUIThread(this.R, 1000L);
            }
        }
    }

    @Override
    public final void n() {
        this.f43913b.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G6, false));
        int i10 = org.telegram.ui.ActionBar.k6.D6;
        this.f43914c.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
        int i11 = org.telegram.ui.ActionBar.k6.f21896q6;
        this.d.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
        this.v.a();
        this.f43916f.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
        this.f43917n.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
        this.f43918r.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
        this.f43919s.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21897q7, false));
        this.f43912a.invalidate();
    }

    public final void o(Runnable runnable) {
        if (this.C != null) {
            runnable.run();
            return;
        }
        int i10 = 0;
        while (true) {
            wd0 wd0Var = this.f43912a;
            cs[] csVarArr = wd0Var.f44011f;
            if (i10 < csVarArr.length) {
                wd0Var.postDelayed(new org.telegram.ui.Components.im(this, i10, 16), i10 * 75);
                i10++;
            } else {
                wd0Var.postDelayed(new z10(27, this, runnable), (csVarArr.length * 75) + 400);
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.P);
        removeCallbacks(this.Q);
    }

    public final void p() {
        if (this.S) {
            return;
        }
        this.S = true;
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.F);
        bundle.putString("ephone", this.G);
        bundle.putString("phoneFormated", this.I);
        TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
        tL_auth_resetLoginEmail.phone_number = this.I;
        tL_auth_resetLoginEmail.phone_code_hash = this.J;
        this.T.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new qd0(this, bundle, tL_auth_resetLoginEmail, 0), 10);
    }

    public final void q(boolean z4) {
        boolean z10;
        float f10;
        AndroidUtilities.updateViewVisibilityAnimated(this.f43916f, z4);
        if (!z4 && this.T.C != 3 && !this.M) {
            z10 = true;
        } else {
            z10 = false;
        }
        AndroidUtilities.updateViewVisibilityAnimated(this.h, z10);
        org.telegram.ui.Components.n90 n90Var = this.v;
        if (n90Var.getVisibility() != 8) {
            if (z4) {
                f10 = 8.0f;
            } else {
                f10 = 16.0f;
            }
            n90Var.setLayoutParams(k7.c6.d(-1, 16.0f, 17, 0.0f, 0.0f, 0.0f, f10));
            n90Var.requestLayout();
        }
    }

    public final void r() {
        String str;
        String formatString;
        int currentTimeMillis = (int) (this.E - (System.currentTimeMillis() / 1000));
        int i10 = this.E;
        hg.q qVar = this.f43918r;
        if (i10 > 0 && currentTimeMillis > 0) {
            int i11 = R.string.LoginEmailResetInTime;
            int i12 = currentTimeMillis / 86400;
            int i13 = currentTimeMillis % 86400;
            int i14 = i13 / 3600;
            int i15 = i13 % 3600;
            int i16 = i15 / 60;
            int i17 = i15 % 60;
            if (i14 >= 16) {
                i12++;
            }
            if (i12 != 0) {
                formatString = LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Days", i12, new Object[0]));
            } else {
                StringBuilder sb = new StringBuilder();
                if (i14 == 0) {
                    str = "";
                } else {
                    str = String.format(Locale.ROOT, "%02d:", Integer.valueOf(i14));
                }
                sb.append(str);
                Locale locale = Locale.ROOT;
                sb.append(String.format(locale, "%02d:", Integer.valueOf(i16)));
                sb.append(String.format(locale, "%02d", Integer.valueOf(i17)));
                formatString = LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, sb.toString());
            }
            String formatString2 = LocaleController.formatString(i11, formatString);
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(formatString2);
            int indexOf = formatString2.indexOf(42);
            int lastIndexOf = formatString2.lastIndexOf(42);
            if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                valueOf.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                valueOf.replace(indexOf, indexOf + 1, (CharSequence) "");
                valueOf.setSpan(new ForegroundColorSpan(this.T.getThemedColor(org.telegram.ui.ActionBar.k6.f21896q6)), indexOf, lastIndexOf - 1, 33);
            }
            qVar.setText(valueOf);
            AndroidUtilities.runOnUIThread(this.R, 1000L);
            return;
        }
        qVar.setVisibility(0);
        qVar.setText(LocaleController.getString(R.string.LoginEmailResetPleaseWait));
        AndroidUtilities.runOnUIThread(new sd0(this, 0), 1000L);
    }
}
