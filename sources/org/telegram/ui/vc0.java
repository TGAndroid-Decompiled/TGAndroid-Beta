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
public final class vc0 extends org.telegram.ui.Components.av0 {
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
    public final uc0 Q;
    public boolean R;
    public final pc0 S;
    public final pc0 T;
    public final pc0 U;
    public boolean V;
    public final gf0 W;
    public final tc0 f42478a;
    public final TextView f42479b;
    public final nh.p f42480c;
    public final TextView d;
    public final FrameLayout e;
    public final TextView f42481f;
    public final FrameLayout h;
    public final ag.j3 f42482n;
    public final ag.j3 f42483r;
    public final TextView f42484s;
    public final org.telegram.ui.Components.w80 f42485w;
    public final org.telegram.ui.Components.fi0 f42486x;
    public boolean f42487y;

    public vc0(org.telegram.ui.gf0 r30, android.content.Context r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vc0.<init>(org.telegram.ui.gf0, android.content.Context, boolean):void");
    }

    @Override
    public final void g() {
        if (this.H != 0) {
            org.telegram.messenger.i0.r(this.U);
        }
    }

    @Override
    public String getHeaderName() {
        return org.telegram.messenger.dd.L0(2131743645, null);
    }

    @Override
    public final void h(String str) {
        TLRPC.TL_auth_signIn tL_auth_signIn;
        int i10;
        if (!this.E) {
            org.telegram.messenger.i0.r(this.T);
            tc0 tc0Var = this.f42478a;
            tc0Var.e = true;
            bs[] bsVarArr = tc0Var.f44045f;
            if (bsVarArr != null) {
                for (bs bsVar : bsVarArr) {
                    bsVar.A(0.0f);
                }
            }
            String code = tc0Var.getCode();
            int length = code.length();
            gf0 gf0Var = this.W;
            if (length == 0 && this.F == null) {
                if (gf0Var.getParentActivity() == null) {
                    return;
                }
                try {
                    tc0Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                for (bs bsVar2 : tc0Var.f44045f) {
                    bsVar2.z(1.0f);
                }
                tc0Var.f44045f[0].requestFocus();
                org.telegram.messenger.i0.F3(10.0f, tc0Var, new pc0(this, 1));
                return;
            }
            this.E = true;
            gf0Var.w1(0, true);
            if (gf0Var.F == 3) {
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
                    tL_emailVerificationGoogle.token = this.F.f4265c;
                    tL_auth_signIn2.email_verification = tL_emailVerificationGoogle;
                } else {
                    TLRPC.TL_emailVerificationCode tL_emailVerificationCode3 = new TLRPC.TL_emailVerificationCode();
                    tL_emailVerificationCode3.code = code;
                    tL_auth_signIn2.email_verification = tL_emailVerificationCode3;
                }
                tL_auth_signIn2.flags = 2 | tL_auth_signIn2.flags;
                tL_auth_signIn = tL_auth_signIn2;
            }
            tc0Var.e = true;
            bs[] bsVarArr2 = tc0Var.f44045f;
            if (bsVarArr2 != null) {
                for (bs bsVar3 : bsVarArr2) {
                    bsVar3.A(0.0f);
                }
            }
            i10 = ((org.telegram.ui.ActionBar.k2) gf0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(tL_auth_signIn, new mc0(this, code, 0), 10);
        }
    }

    @Override
    public final void j() {
        if (this.f42487y) {
            this.f42487y = false;
        } else {
            org.telegram.messenger.i0.h3(new pc0(this, 8), gf0.f37470y0);
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
            this.f42478a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String code = this.f42478a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("emailcode_code", code);
        }
        Bundle bundle2 = this.D;
        if (bundle2 != null) {
            bundle.putBundle("emailcode_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        int i10;
        int i11;
        bs[] bsVarArr;
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
            gf0 gf0Var = this.W;
            int i12 = gf0Var.F;
            int i13 = 8;
            FrameLayout frameLayout = this.h;
            nh.p pVar = this.f42480c;
            if (i12 == 3) {
                pVar.setText(org.telegram.messenger.dd.a0(null, null, 2131752142, this.K));
                org.telegram.messenger.i0.Y3(frameLayout, false, 1.0f, true, false);
            } else if (this.P) {
                pVar.setText(org.telegram.messenger.dd.a0(null, null, 2131743644, this.K));
                org.telegram.messenger.i0.Y3(frameLayout, false, 1.0f, true, false);
            } else {
                org.telegram.messenger.i0.Y3(frameLayout, true, 1.0f, true, false);
                if (this.H == 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                this.f42482n.setVisibility(i10);
                if (this.H != 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                this.f42483r.setVisibility(i11);
                if (this.H != 0) {
                    q();
                }
            }
            int i14 = this.O;
            tc0 tc0Var = this.f42478a;
            tc0Var.b(i14, 1);
            for (bs bsVar : tc0Var.f44045f) {
                bsVar.setShowSoftInputOnFocusCompat(org.telegram.messenger.i0.C1());
                bsVar.addTextChangedListener(new n0(this, 9));
                bsVar.setOnFocusChangeListener(new od(this, 2));
            }
            tc0Var.setText("");
            if (!this.N && gf0Var.F != 3) {
                String string = this.D.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    ?? obj = new Object();
                    obj.f33282a |= 256;
                    obj.f33283b = indexOf;
                    int i15 = lastIndexOf + 1;
                    obj.f33284c = i15;
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.a01(obj, 0), indexOf, i15, 0);
                }
                pVar.setText(org.telegram.messenger.i0.m0(org.telegram.messenger.dd.L0(2131752144, null), spannableStringBuilder));
            }
            if (bundle.getBoolean("googleSignInAllowed") && org.telegram.messenger.fu.f15792b.hasServices()) {
                i13 = 0;
            }
            this.f42485w.setVisibility(i13);
            this.d.setVisibility(i13);
            gf0.a1(gf0Var, tc0Var.f44045f[0]);
            tc0Var.requestFocus();
            if (!z10 && bundle.containsKey("nextType")) {
                org.telegram.messenger.i0.h3(this.T, bundle.getInt("timeout"));
            }
            if (this.H != 0) {
                org.telegram.messenger.i0.h3(this.U, 1000L);
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
            tc0 tc0Var = this.f42478a;
            bs[] bsVarArr = tc0Var.f44045f;
            if (i10 < bsVarArr.length) {
                tc0Var.postDelayed(new org.telegram.ui.Components.qq(this, i10, 13), i10 * 75);
                i10++;
            } else {
                tc0Var.postDelayed(new y60(18, this, runnable), (bsVarArr.length * 75) + 400);
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
        this.W.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new nc0(this, bundle, tL_auth_resetLoginEmail, 0), 10);
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
        org.telegram.messenger.i0.W3(this.f42481f, z10);
        if (!z10 && this.W.F != 3 && !this.P) {
            z11 = true;
        } else {
            z11 = false;
        }
        org.telegram.messenger.i0.W3(this.h, z11);
        org.telegram.ui.Components.w80 w80Var = this.f42485w;
        if (w80Var.getVisibility() != 8) {
            if (z10) {
                f7 = 8.0f;
            } else {
                f7 = 16.0f;
            }
            w80Var.setLayoutParams(w7.b6.d(-1, 16.0f, 17, 0.0f, 0.0f, 0.0f, f7));
            w80Var.requestLayout();
        }
    }

    public final void q() {
        String str;
        String a02;
        int currentTimeMillis = (int) (this.H - (System.currentTimeMillis() / 1000));
        int i10 = this.H;
        ag.j3 j3Var = this.f42483r;
        if (i10 > 0 && currentTimeMillis > 0) {
            int i11 = currentTimeMillis / 86400;
            int i12 = currentTimeMillis % 86400;
            int i13 = i12 / 3600;
            int i14 = i12 % 3600;
            int i15 = i14 / 60;
            int i16 = i14 % 60;
            if (i13 >= 16) {
                i11++;
            }
            if (i11 != 0) {
                a02 = org.telegram.messenger.dd.a0(null, null, 2131748745, org.telegram.messenger.dd.G(i11, "Days", new Object[0]));
            } else {
                StringBuilder sb2 = new StringBuilder();
                if (i13 == 0) {
                    str = "";
                } else {
                    str = String.format(Locale.ROOT, "%02d:", Integer.valueOf(i13));
                }
                sb2.append(str);
                Locale locale = Locale.ROOT;
                sb2.append(String.format(locale, "%02d:", Integer.valueOf(i15)));
                sb2.append(String.format(locale, "%02d", Integer.valueOf(i16)));
                a02 = org.telegram.messenger.dd.a0(null, null, 2131748745, sb2.toString());
            }
            String a03 = org.telegram.messenger.dd.a0(null, null, 2131748744, a02);
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(a03);
            int indexOf = a03.indexOf(42);
            int lastIndexOf = a03.lastIndexOf(42);
            if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                valueOf.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                valueOf.replace(indexOf, indexOf + 1, (CharSequence) "");
                valueOf.setSpan(new org.telegram.ui.Components.l00(org.telegram.ui.ActionBar.t6.q6, this.W.getResourceProvider()), indexOf, lastIndexOf - 1, 33);
            }
            j3Var.setText(valueOf);
            org.telegram.messenger.i0.h3(this.U, 1000L);
            return;
        }
        j3Var.setVisibility(0);
        j3Var.setText(org.telegram.messenger.dd.L0(2131748742, null));
        org.telegram.messenger.i0.h3(new pc0(this, 0), 1000L);
    }

    @Override
    public final void updateColors() {
        this.f42479b.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false));
        int i10 = org.telegram.ui.ActionBar.t6.D6;
        this.f42480c.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
        int i11 = org.telegram.ui.ActionBar.t6.q6;
        this.d.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
        this.f42485w.updateColors();
        this.f42481f.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
        this.f42482n.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
        this.f42483r.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
        this.f42484s.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21171q7, false));
        this.f42478a.invalidate();
    }
}
