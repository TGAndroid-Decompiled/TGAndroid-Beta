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
public final class yd0 extends org.telegram.ui.Components.vv0 {
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
    public final xd0 N;
    public boolean O;
    public final rd0 P;
    public final rd0 Q;
    public final rd0 R;
    public boolean S;
    public final ng0 T;
    public final vd0 f40482a;
    public final TextView f40483b;
    public final ih.s f40484c;
    public final TextView d;
    public final FrameLayout e;
    public final TextView f40485f;
    public final FrameLayout h;
    public final gg.q f40486n;
    public final gg.q f40487r;
    public final TextView f40488s;
    public final org.telegram.ui.Components.l90 v;
    public final org.telegram.ui.Components.jj0 f40489w;
    public boolean f40490x;
    public Bundle f40491y;

    public yd0(org.telegram.ui.ng0 r30, android.content.Context r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yd0.<init>(org.telegram.ui.ng0, android.content.Context, boolean):void");
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
            vd0 vd0Var = this.f40482a;
            vd0Var.e = true;
            bs[] bsVarArr = vd0Var.f40565f;
            if (bsVarArr != null) {
                for (bs bsVar : bsVarArr) {
                    bsVar.j(0.0f);
                }
            }
            String code = vd0Var.getCode();
            int length = code.length();
            ng0 ng0Var = this.T;
            if (length == 0 && this.C == null) {
                if (ng0Var.getParentActivity() == null) {
                    return;
                }
                try {
                    vd0Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                for (bs bsVar2 : vd0Var.f40565f) {
                    bsVar2.i(1.0f);
                }
                vd0Var.f40565f[0].requestFocus();
                AndroidUtilities.shakeViewSpring(vd0Var, new rd0(this, 1));
                return;
            }
            this.B = true;
            ng0Var.n1(0, true);
            if (ng0Var.C == 3) {
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
                    tL_emailVerificationGoogle.token = this.C.f2650c;
                    tL_auth_signIn2.email_verification = tL_emailVerificationGoogle;
                } else {
                    TLRPC.TL_emailVerificationCode tL_emailVerificationCode3 = new TLRPC.TL_emailVerificationCode();
                    tL_emailVerificationCode3.code = code;
                    tL_auth_signIn2.email_verification = tL_emailVerificationCode3;
                }
                tL_auth_signIn2.flags = 2 | tL_auth_signIn2.flags;
                tL_auth_signIn = tL_auth_signIn2;
            }
            vd0Var.e = true;
            bs[] bsVarArr2 = vd0Var.f40565f;
            if (bsVarArr2 != null) {
                for (bs bsVar3 : bsVarArr2) {
                    bsVar3.j(0.0f);
                }
            }
            i10 = ((org.telegram.ui.ActionBar.p2) ng0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(tL_auth_signIn, new od0(this, code, 0), 10);
        }
    }

    @Override
    public final void j() {
        if (this.f40490x) {
            this.f40490x = false;
        } else {
            AndroidUtilities.runOnUIThread(new rd0(this, 8), ng0.f36621q0);
        }
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailcode_params");
        this.f40491y = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailcode_code");
        if (string != null) {
            this.f40482a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f40482a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("emailcode_code", code);
        }
        Bundle bundle2 = this.f40491y;
        if (bundle2 != null) {
            bundle.putBundle("emailcode_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z4) {
        int i10;
        int i11;
        bs[] bsVarArr;
        if (bundle != null) {
            this.f40491y = bundle;
            this.I = bundle.getString("phoneFormated");
            this.J = this.f40491y.getString("phoneHash");
            this.F = this.f40491y.getString("phone");
            this.G = this.f40491y.getString("ephone");
            this.K = this.f40491y.getBoolean("setup");
            this.L = this.f40491y.getInt("length");
            this.H = this.f40491y.getString("email");
            this.D = this.f40491y.getInt("resetAvailablePeriod");
            this.E = this.f40491y.getInt("resetPendingDate");
            ng0 ng0Var = this.T;
            int i12 = ng0Var.C;
            int i13 = 8;
            FrameLayout frameLayout = this.h;
            ih.s sVar = this.f40484c;
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
                this.f40486n.setVisibility(i10);
                if (this.E != 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                this.f40487r.setVisibility(i11);
                if (this.E != 0) {
                    r();
                }
            }
            int i14 = this.L;
            vd0 vd0Var = this.f40482a;
            vd0Var.b(i14, 1);
            for (bs bsVar : vd0Var.f40565f) {
                bsVar.setShowSoftInputOnFocusCompat(AndroidUtilities.isAccessibilityTouchExplorationEnabled());
                bsVar.addTextChangedListener(new n0(this, 7));
                bsVar.setOnFocusChangeListener(new qd(this, 2));
            }
            vd0Var.setText("");
            if (!this.K && ng0Var.C != 3) {
                String string = this.f40491y.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    ?? obj = new Object();
                    obj.f28583a |= 256;
                    obj.f28584b = indexOf;
                    int i15 = lastIndexOf + 1;
                    obj.f28585c = i15;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.t01(obj, 0), indexOf, i15, 0);
                }
                sVar.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.CheckYourEmailSubtitle), spannableStringBuilder));
            }
            if (bundle.getBoolean("googleSignInAllowed") && PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
                i13 = 0;
            }
            this.v.setVisibility(i13);
            this.d.setVisibility(i13);
            ng0.T0(ng0Var, vd0Var.f40565f[0]);
            vd0Var.requestFocus();
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
        this.f40483b.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        int i10 = org.telegram.ui.ActionBar.j6.D6;
        this.f40484c.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        int i11 = org.telegram.ui.ActionBar.j6.f20140q6;
        this.d.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.v.a();
        this.f40485f.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.f40486n.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.f40487r.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.f40488s.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20141q7, false));
        this.f40482a.invalidate();
    }

    public final void o(Runnable runnable) {
        if (this.C != null) {
            runnable.run();
            return;
        }
        int i10 = 0;
        while (true) {
            vd0 vd0Var = this.f40482a;
            bs[] bsVarArr = vd0Var.f40565f;
            if (i10 < bsVarArr.length) {
                vd0Var.postDelayed(new org.telegram.ui.Components.hm(this, i10, 16), i10 * 75);
                i10++;
            } else {
                vd0Var.postDelayed(new g00(29, this, runnable), (bsVarArr.length * 75) + 400);
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
        this.T.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new pd0(this, bundle, tL_auth_resetLoginEmail, 0), 10);
    }

    public final void q(boolean z4) {
        boolean z10;
        float f10;
        AndroidUtilities.updateViewVisibilityAnimated(this.f40485f, z4);
        if (!z4 && this.T.C != 3 && !this.M) {
            z10 = true;
        } else {
            z10 = false;
        }
        AndroidUtilities.updateViewVisibilityAnimated(this.h, z10);
        org.telegram.ui.Components.l90 l90Var = this.v;
        if (l90Var.getVisibility() != 8) {
            if (z4) {
                f10 = 8.0f;
            } else {
                f10 = 16.0f;
            }
            l90Var.setLayoutParams(k7.b6.d(-1, 16.0f, 17, 0.0f, 0.0f, 0.0f, f10));
            l90Var.requestLayout();
        }
    }

    public final void r() {
        String str;
        String formatString;
        int currentTimeMillis = (int) (this.E - (System.currentTimeMillis() / 1000));
        int i10 = this.E;
        gg.q qVar = this.f40487r;
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
                valueOf.setSpan(new ForegroundColorSpan(this.T.getThemedColor(org.telegram.ui.ActionBar.j6.f20140q6)), indexOf, lastIndexOf - 1, 33);
            }
            qVar.setText(valueOf);
            AndroidUtilities.runOnUIThread(this.R, 1000L);
            return;
        }
        qVar.setVisibility(0);
        qVar.setText(LocaleController.getString(R.string.LoginEmailResetPleaseWait));
        AndroidUtilities.runOnUIThread(new rd0(this, 0), 1000L);
    }
}
