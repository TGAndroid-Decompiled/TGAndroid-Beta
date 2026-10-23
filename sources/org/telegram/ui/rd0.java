package org.telegram.ui;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
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
public final class rd0 extends org.telegram.ui.Components.tw0 {
    public boolean E;
    public GoogleSignInAccount F;
    public int G;
    public int H;
    public String I;
    public String J;
    public String K;
    public String L;
    public String M;
    public boolean N;
    public int O;
    public final boolean P;
    public final qd0 Q;
    public boolean R;
    public final kd0 S;
    public final kd0 T;
    public final kd0 U;
    public boolean V;
    public final ig0 W;
    public final od0 f41094a;
    public final TextView f41095b;
    public final wh.n f41096c;
    public final TextView d;
    public final FrameLayout e;
    public final TextView f41097f;
    public final FrameLayout h;
    public final ai.wd f41098n;
    public final ai.wd f41099r;
    public final TextView f41100s;
    public final org.telegram.ui.Components.fa0 v;
    public final org.telegram.ui.Components.bk0 f41101w;
    public boolean f41102x;
    public Bundle f41103y;

    public rd0(org.telegram.ui.ig0 r30, android.content.Context r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rd0.<init>(org.telegram.ui.ig0, android.content.Context, boolean):void");
    }

    @Override
    public final void g() {
        if (this.H != 0) {
            AndroidUtilities.cancelRunOnUIThread(this.U);
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
        if (!this.E) {
            AndroidUtilities.cancelRunOnUIThread(this.T);
            od0 od0Var = this.f41094a;
            od0Var.e = true;
            vr[] vrVarArr = od0Var.f41793f;
            if (vrVarArr != null) {
                for (vr vrVar : vrVarArr) {
                    vrVar.j(0.0f);
                }
            }
            String code = od0Var.getCode();
            int length = code.length();
            ig0 ig0Var = this.W;
            if (length == 0 && this.F == null) {
                if (ig0Var.getParentActivity() == null) {
                    return;
                }
                try {
                    od0Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                for (vr vrVar2 : od0Var.f41793f) {
                    vrVar2.i(1.0f);
                }
                od0Var.f41793f[0].requestFocus();
                AndroidUtilities.shakeViewSpring(od0Var, new kd0(this, 1));
                return;
            }
            this.E = true;
            ig0Var.r1(0, true);
            if (ig0Var.F == 3) {
                TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
                TLRPC.TL_emailVerificationCode tL_emailVerificationCode = new TLRPC.TL_emailVerificationCode();
                tL_emailVerificationCode.code = code;
                verifyemail.verification = tL_emailVerificationCode;
                tL_auth_signIn = verifyemail;
            } else if (this.N) {
                TL_account.verifyEmail verifyemail2 = new TL_account.verifyEmail();
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup.phone_number = this.L;
                tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.M;
                verifyemail2.purpose = tL_emailVerifyPurposeLoginSetup;
                TLRPC.TL_emailVerificationCode tL_emailVerificationCode2 = new TLRPC.TL_emailVerificationCode();
                tL_emailVerificationCode2.code = code;
                verifyemail2.verification = tL_emailVerificationCode2;
                tL_auth_signIn = verifyemail2;
            } else {
                TLRPC.TL_auth_signIn tL_auth_signIn2 = new TLRPC.TL_auth_signIn();
                tL_auth_signIn2.phone_number = this.L;
                tL_auth_signIn2.phone_code_hash = this.M;
                if (this.F != null) {
                    TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
                    tL_emailVerificationGoogle.token = this.F.f6288c;
                    tL_auth_signIn2.email_verification = tL_emailVerificationGoogle;
                } else {
                    TLRPC.TL_emailVerificationCode tL_emailVerificationCode3 = new TLRPC.TL_emailVerificationCode();
                    tL_emailVerificationCode3.code = code;
                    tL_auth_signIn2.email_verification = tL_emailVerificationCode3;
                }
                tL_auth_signIn2.flags = 2 | tL_auth_signIn2.flags;
                tL_auth_signIn = tL_auth_signIn2;
            }
            od0Var.e = true;
            vr[] vrVarArr2 = od0Var.f41793f;
            if (vrVarArr2 != null) {
                for (vr vrVar3 : vrVarArr2) {
                    vrVar3.j(0.0f);
                }
            }
            i10 = ((org.telegram.ui.ActionBar.o2) ig0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(tL_auth_signIn, new hd0(this, code, 0), 10);
        }
    }

    @Override
    public final void j() {
        if (this.f41102x) {
            this.f41102x = false;
        } else {
            AndroidUtilities.runOnUIThread(new kd0(this, 8), ig0.f38191x0);
        }
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailcode_params");
        this.f41103y = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailcode_code");
        if (string != null) {
            this.f41094a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f41094a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("emailcode_code", code);
        }
        Bundle bundle2 = this.f41103y;
        if (bundle2 != null) {
            bundle.putBundle("emailcode_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        int i10;
        int i11;
        vr[] vrVarArr;
        if (bundle != null) {
            this.f41103y = bundle;
            this.L = bundle.getString("phoneFormated");
            this.M = this.f41103y.getString("phoneHash");
            this.I = this.f41103y.getString("phone");
            this.J = this.f41103y.getString("ephone");
            this.N = this.f41103y.getBoolean("setup");
            this.O = this.f41103y.getInt("length");
            this.K = this.f41103y.getString("email");
            this.G = this.f41103y.getInt("resetAvailablePeriod");
            this.H = this.f41103y.getInt("resetPendingDate");
            ig0 ig0Var = this.W;
            int i12 = ig0Var.F;
            int i13 = 8;
            FrameLayout frameLayout = this.h;
            wh.n nVar = this.f41096c;
            if (i12 == 3) {
                nVar.setText(LocaleController.formatString(R.string.CheckYourNewEmailSubtitle, this.K));
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout, false, 1.0f, false);
            } else if (this.P) {
                nVar.setText(LocaleController.formatString(R.string.VerificationCodeSubtitle, this.K));
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout, false, 1.0f, false);
            } else {
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 1.0f, false);
                if (this.H == 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                this.f41098n.setVisibility(i10);
                if (this.H != 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                this.f41099r.setVisibility(i11);
                if (this.H != 0) {
                    q();
                }
            }
            int i14 = this.O;
            od0 od0Var = this.f41094a;
            od0Var.b(i14, 1);
            for (vr vrVar : od0Var.f41793f) {
                vrVar.setShowSoftInputOnFocusCompat(AndroidUtilities.isAccessibilityTouchExplorationEnabled());
                vrVar.addTextChangedListener(new n0(this, 7));
                vrVar.setOnFocusChangeListener(new pd(this, 2));
            }
            od0Var.setText("");
            if (!this.N && ig0Var.F != 3) {
                String string = this.f41103y.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    ?? obj = new Object();
                    obj.f29754a |= 256;
                    obj.f29755b = indexOf;
                    int i15 = lastIndexOf + 1;
                    obj.f29756c = i15;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.r11(obj, 0), indexOf, i15, 0);
                }
                nVar.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.CheckYourEmailSubtitle), spannableStringBuilder));
            }
            if (bundle.getBoolean("googleSignInAllowed") && PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
                i13 = 0;
            }
            this.v.setVisibility(i13);
            this.d.setVisibility(i13);
            ig0.V0(ig0Var, od0Var.f41793f[0]);
            od0Var.requestFocus();
            if (!z10 && bundle.containsKey("nextType")) {
                AndroidUtilities.runOnUIThread(this.T, bundle.getInt("timeout"));
            }
            if (this.H != 0) {
                AndroidUtilities.runOnUIThread(this.U, 1000L);
            }
        }
    }

    public final void n(Runnable runnable) {
        if (this.F != null) {
            runnable.run();
            return;
        }
        int i10 = 0;
        while (true) {
            od0 od0Var = this.f41094a;
            vr[] vrVarArr = od0Var.f41793f;
            if (i10 < vrVarArr.length) {
                od0Var.postDelayed(new org.telegram.ui.Components.d2(this, i10, 21), i10 * 75);
                i10++;
            } else {
                od0Var.postDelayed(new f80(16, this, runnable), (vrVarArr.length * 75) + 400);
                return;
            }
        }
    }

    public final void o() {
        if (this.V) {
            return;
        }
        this.V = true;
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.I);
        bundle.putString("ephone", this.J);
        bundle.putString("phoneFormated", this.L);
        TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
        tL_auth_resetLoginEmail.phone_number = this.L;
        tL_auth_resetLoginEmail.phone_code_hash = this.M;
        this.W.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new id0(this, bundle, tL_auth_resetLoginEmail, 0), 10);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.S);
        removeCallbacks(this.T);
    }

    public final void p(boolean z10) {
        boolean z11;
        float f7;
        AndroidUtilities.updateViewVisibilityAnimated(this.f41097f, z10);
        if (!z10 && this.W.F != 3 && !this.P) {
            z11 = true;
        } else {
            z11 = false;
        }
        AndroidUtilities.updateViewVisibilityAnimated(this.h, z11);
        org.telegram.ui.Components.fa0 fa0Var = this.v;
        if (fa0Var.getVisibility() != 8) {
            if (z10) {
                f7 = 8.0f;
            } else {
                f7 = 16.0f;
            }
            fa0Var.setLayoutParams(w7.z5.d(-1, 16.0f, 17, 0.0f, 0.0f, 0.0f, f7));
            fa0Var.requestLayout();
        }
    }

    public final void q() {
        String str;
        String formatString;
        int currentTimeMillis = (int) (this.H - (System.currentTimeMillis() / 1000));
        int i10 = this.H;
        ai.wd wdVar = this.f41099r;
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
                StringBuilder sb2 = new StringBuilder();
                if (i14 == 0) {
                    str = "";
                } else {
                    str = String.format(Locale.ROOT, "%02d:", Integer.valueOf(i14));
                }
                sb2.append(str);
                Locale locale = Locale.ROOT;
                sb2.append(String.format(locale, "%02d:", Integer.valueOf(i16)));
                sb2.append(String.format(locale, "%02d", Integer.valueOf(i17)));
                formatString = LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, sb2.toString());
            }
            String formatString2 = LocaleController.formatString(i11, formatString);
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(formatString2);
            int indexOf = formatString2.indexOf(42);
            int lastIndexOf = formatString2.lastIndexOf(42);
            if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                valueOf.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                valueOf.replace(indexOf, indexOf + 1, (CharSequence) "");
                valueOf.setSpan(new org.telegram.ui.Components.m10(org.telegram.ui.ActionBar.k6.q6, this.W.getResourceProvider()), indexOf, lastIndexOf - 1, 33);
            }
            wdVar.setText(valueOf);
            AndroidUtilities.runOnUIThread(this.U, 1000L);
            return;
        }
        wdVar.setVisibility(0);
        wdVar.setText(LocaleController.getString(R.string.LoginEmailResetPleaseWait));
        AndroidUtilities.runOnUIThread(new kd0(this, 0), 1000L);
    }

    @Override
    public final void updateColors() {
        this.f41095b.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
        int i10 = org.telegram.ui.ActionBar.k6.D6;
        this.f41096c.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        int i11 = org.telegram.ui.ActionBar.k6.q6;
        this.d.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        this.v.updateColors();
        this.f41097f.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        this.f41098n.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        this.f41099r.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        this.f41100s.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21421q7, false));
        this.f41094a.invalidate();
    }
}
