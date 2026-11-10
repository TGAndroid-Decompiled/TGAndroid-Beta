package org.telegram.ui;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.Locale;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class rb0 extends org.telegram.ui.Components.xt0 {
    public Bundle D;
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
    public final qb0 Q;
    public boolean R;
    public final kb0 S;
    public final kb0 T;
    public final kb0 U;
    public boolean V;
    public final fe0 W;
    public final ob0 f49332a;
    public final TextView f49333b;
    public final xh.l f49334c;
    public final TextView d;
    public final FrameLayout f49335e;
    public final TextView f49336f;
    public final FrameLayout h;
    public final pb0 f49337n;
    public final pb0 f49338r;
    public final TextView f49339s;
    public final org.telegram.ui.Components.d80 f49340w;
    public final org.telegram.ui.Components.ch0 f49341x;
    public boolean f49342y;

    public rb0(org.telegram.ui.fe0 r30, android.content.Context r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rb0.<init>(org.telegram.ui.fe0, android.content.Context, boolean):void");
    }

    @Override
    public final void g() {
        if (this.H != 0) {
            org.telegram.messenger.g0.r(this.U);
        }
    }

    @Override
    public String getHeaderName() {
        return org.telegram.messenger.id.M0(2131743619, null);
    }

    @Override
    public final void h(String str) {
        TLRPC.TL_auth_signIn tL_auth_signIn;
        int i7;
        if (!this.E) {
            org.telegram.messenger.g0.r(this.T);
            ob0 ob0Var = this.f49332a;
            ob0Var.f44117e = true;
            er[] erVarArr = ob0Var.f44118f;
            if (erVarArr != null) {
                for (er erVar : erVarArr) {
                    erVar.A(0.0f);
                }
            }
            String code = ob0Var.getCode();
            int length = code.length();
            fe0 fe0Var = this.W;
            if (length == 0 && this.F == null) {
                if (fe0Var.getParentActivity() == null) {
                    return;
                }
                try {
                    ob0Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                for (er erVar2 : ob0Var.f44118f) {
                    erVar2.z(1.0f);
                }
                ob0Var.f44118f[0].requestFocus();
                org.telegram.messenger.g0.G3(10.0f, ob0Var, new kb0(this, 1));
                return;
            }
            this.E = true;
            fe0Var.F1(0, true);
            if (fe0Var.F == 3) {
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
                    tL_emailVerificationGoogle.token = this.F.f6456b;
                    tL_auth_signIn2.email_verification = tL_emailVerificationGoogle;
                } else {
                    TLRPC.TL_emailVerificationCode tL_emailVerificationCode3 = new TLRPC.TL_emailVerificationCode();
                    tL_emailVerificationCode3.code = code;
                    tL_auth_signIn2.email_verification = tL_emailVerificationCode3;
                }
                tL_auth_signIn2.flags = 2 | tL_auth_signIn2.flags;
                tL_auth_signIn = tL_auth_signIn2;
            }
            ob0Var.f44117e = true;
            er[] erVarArr2 = ob0Var.f44118f;
            if (erVarArr2 != null) {
                for (er erVar3 : erVarArr2) {
                    erVar3.A(0.0f);
                }
            }
            i7 = ((org.telegram.ui.ActionBar.f2) fe0Var).currentAccount;
            ConnectionsManager.getInstance(i7).sendRequest(tL_auth_signIn, new hb0(this, code, 0), 10);
        }
    }

    @Override
    public final void j() {
        if (this.f49342y) {
            this.f49342y = false;
        } else {
            org.telegram.messenger.g0.i3(new kb0(this, 8), fe0.f45691y0);
        }
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailcode_params");
        this.D = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailcode_code");
        if (string != null) {
            this.f49332a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f49332a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("emailcode_code", code);
        }
        Bundle bundle2 = this.D;
        if (bundle2 != null) {
            bundle.putBundle("emailcode_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z9) {
        int i7;
        int i10;
        er[] erVarArr;
        if (bundle != null) {
            this.D = bundle;
            this.L = bundle.getString("phoneFormated");
            this.M = this.D.getString("phoneHash");
            this.I = this.D.getString("phone");
            this.J = this.D.getString("ephone");
            this.N = this.D.getBoolean("setup");
            this.O = this.D.getInt("length");
            this.K = this.D.getString("email");
            this.G = this.D.getInt("resetAvailablePeriod");
            this.H = this.D.getInt("resetPendingDate");
            fe0 fe0Var = this.W;
            int i11 = fe0Var.F;
            int i12 = 8;
            FrameLayout frameLayout = this.h;
            xh.l lVar = this.f49334c;
            if (i11 == 3) {
                lVar.setText(org.telegram.messenger.id.a0(null, null, 2131752142, this.K));
                org.telegram.messenger.g0.Z3(frameLayout, false, 1.0f, true, false);
            } else if (this.P) {
                lVar.setText(org.telegram.messenger.id.a0(null, null, 2131743618, this.K));
                org.telegram.messenger.g0.Z3(frameLayout, false, 1.0f, true, false);
            } else {
                org.telegram.messenger.g0.Z3(frameLayout, true, 1.0f, true, false);
                if (this.H == 0) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                this.f49337n.setVisibility(i7);
                if (this.H != 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                this.f49338r.setVisibility(i10);
                if (this.H != 0) {
                    q();
                }
            }
            int i13 = this.O;
            ob0 ob0Var = this.f49332a;
            ob0Var.b(i13, 1);
            for (er erVar : ob0Var.f44118f) {
                erVar.setShowSoftInputOnFocusCompat(org.telegram.messenger.g0.C1());
                erVar.addTextChangedListener(new m0(this, 9));
                erVar.setOnFocusChangeListener(new fd(this, 2));
            }
            ob0Var.setText("");
            if (!this.N && fe0Var.F != 3) {
                String string = this.D.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    ?? obj = new Object();
                    obj.f38777a |= 256;
                    obj.f38778b = indexOf;
                    int i14 = lastIndexOf + 1;
                    obj.f38779c = i14;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.vy0(obj, 0), indexOf, i14, 0);
                }
                lVar.setText(org.telegram.messenger.g0.m0(org.telegram.messenger.id.M0(2131752144, null), spannableStringBuilder));
            }
            if (bundle.getBoolean("googleSignInAllowed") && org.telegram.messenger.tt.f25665b.hasServices()) {
                i12 = 0;
            }
            this.f49340w.setVisibility(i12);
            this.d.setVisibility(i12);
            fe0.b1(fe0Var, ob0Var.f44118f[0]);
            ob0Var.requestFocus();
            if (!z9 && bundle.containsKey("nextType")) {
                org.telegram.messenger.g0.i3(this.T, bundle.getInt("timeout"));
            }
            if (this.H != 0) {
                org.telegram.messenger.g0.i3(this.U, 1000L);
            }
        }
    }

    public final void n(Runnable runnable) {
        if (this.F != null) {
            runnable.run();
            return;
        }
        int i7 = 0;
        while (true) {
            ob0 ob0Var = this.f49332a;
            er[] erVarArr = ob0Var.f44118f;
            if (i7 < erVarArr.length) {
                ob0Var.postDelayed(new org.telegram.ui.Components.q2(this, i7, 18), i7 * 75);
                i7++;
            } else {
                ob0Var.postDelayed(new f10(25, this, runnable), (erVarArr.length * 75) + 400);
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
        this.W.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new ib0(this, bundle, tL_auth_resetLoginEmail, 0), 10);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.S);
        removeCallbacks(this.T);
    }

    public final void p(boolean z9) {
        boolean z10;
        float f10;
        org.telegram.messenger.g0.X3(this.f49336f, z9);
        if (!z9 && this.W.F != 3 && !this.P) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.messenger.g0.X3(this.h, z10);
        org.telegram.ui.Components.d80 d80Var = this.f49340w;
        if (d80Var.getVisibility() != 8) {
            if (z9) {
                f10 = 8.0f;
            } else {
                f10 = 16.0f;
            }
            d80Var.setLayoutParams(c8.ha.d(-1, 16.0f, 17, 0.0f, 0.0f, 0.0f, f10));
            d80Var.requestLayout();
        }
    }

    public final void q() {
        String str;
        String a02;
        int currentTimeMillis = (int) (this.H - (System.currentTimeMillis() / 1000));
        int i7 = this.H;
        pb0 pb0Var = this.f49338r;
        if (i7 > 0 && currentTimeMillis > 0) {
            int i10 = currentTimeMillis / 86400;
            int i11 = currentTimeMillis % 86400;
            int i12 = i11 / 3600;
            int i13 = i11 % 3600;
            int i14 = i13 / 60;
            int i15 = i13 % 60;
            if (i12 >= 16) {
                i10++;
            }
            if (i10 != 0) {
                a02 = org.telegram.messenger.id.a0(null, null, 2131748734, org.telegram.messenger.id.G(i10, "Days", new Object[0]));
            } else {
                StringBuilder sb2 = new StringBuilder();
                if (i12 == 0) {
                    str = "";
                } else {
                    str = String.format(Locale.ROOT, "%02d:", Integer.valueOf(i12));
                }
                sb2.append(str);
                Locale locale = Locale.ROOT;
                sb2.append(String.format(locale, "%02d:", Integer.valueOf(i14)));
                sb2.append(String.format(locale, "%02d", Integer.valueOf(i15)));
                a02 = org.telegram.messenger.id.a0(null, null, 2131748734, sb2.toString());
            }
            String a03 = org.telegram.messenger.id.a0(null, null, 2131748733, a02);
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(a03);
            int indexOf = a03.indexOf(42);
            int lastIndexOf = a03.lastIndexOf(42);
            if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                valueOf.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                valueOf.replace(indexOf, indexOf + 1, (CharSequence) "");
                valueOf.setSpan(new org.telegram.ui.Components.xz(org.telegram.ui.ActionBar.m6.f28130q6, this.W.getResourceProvider()), indexOf, lastIndexOf - 1, 33);
            }
            pb0Var.setText(valueOf);
            org.telegram.messenger.g0.i3(this.U, 1000L);
            return;
        }
        pb0Var.setVisibility(0);
        pb0Var.setText(org.telegram.messenger.id.M0(2131748731, null));
        org.telegram.messenger.g0.i3(new kb0(this, 0), 1000L);
    }

    @Override
    public final void updateColors() {
        this.f49333b.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.G6, false));
        int i7 = org.telegram.ui.ActionBar.m6.D6;
        this.f49334c.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
        int i10 = org.telegram.ui.ActionBar.m6.f28130q6;
        this.d.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i10, false));
        this.f49340w.updateColors();
        this.f49336f.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i10, false));
        this.f49337n.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i10, false));
        this.f49338r.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
        this.f49339s.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28131q7, false));
        this.f49332a.invalidate();
    }
}
