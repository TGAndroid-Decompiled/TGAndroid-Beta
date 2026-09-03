package org.telegram.ui;

import android.content.ClipboardManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import java.util.Timer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class re0 extends org.telegram.ui.Components.vv0 {
    public int B;
    public int C;
    public String D;
    public String E;
    public String F;
    public String G;
    public String H;
    public Bundle I;
    public boolean J;
    public Timer K;
    public final Object L;
    public int M;
    public double N;
    public boolean O;
    public Bundle P;
    public TLRPC.TL_auth_sentCode Q;
    public final oe0 R;
    public final oe0 S;
    public float T;
    public final pg0 U;
    public final int f37809a;
    public final org.telegram.ui.Components.bd0 f37810b;
    public final kg.f f37811c;
    public final org.telegram.ui.Components.voip.n2 d;
    public final TextView e;
    public final TextView f37812f;
    public final org.telegram.ui.Components.jj0 h;
    public final TextView f37813n;
    public final TextView f37814r;
    public final TextView f37815s;
    public final rf0 v;
    public boolean f37816w;
    public boolean f37817x;
    public boolean f37818y;

    public re0(org.telegram.ui.pg0 r28, android.content.Context r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.re0.<init>(org.telegram.ui.pg0, android.content.Context, int):void");
    }

    public static String t(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length && str.charAt(i10) <= ' ') {
            i10++;
        }
        if (i10 <= 0 && length >= str.length()) {
            return str;
        }
        return str.substring(i10, length);
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z4) {
        pg0 pg0Var = this.U;
        pg0Var.k1(true, true);
        int i10 = this.C;
        if (i10 != 0) {
            pg0Var.u1(i10, true, null, true);
            return false;
        }
        this.I = null;
        this.O = false;
        return true;
    }

    @Override
    public final void d() {
        this.O = false;
    }

    @Override
    public final void g() {
        AndroidUtilities.cancelRunOnUIThread(this.R);
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("NewPassword", R.string.NewPassword);
    }

    @Override
    public final void h(String str) {
        if (this.O) {
            return;
        }
        String obj = this.f37811c.getText().toString();
        if (obj.length() == 0) {
            s(false);
        } else if (!p(obj)) {
            s(true);
        } else {
            this.O = true;
            TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
            tL_auth_signIn.phone_number = this.D;
            tL_auth_signIn.phone_code = obj;
            tL_auth_signIn.phone_code_hash = this.E;
            tL_auth_signIn.flags |= 1;
            pg0 pg0Var = this.U;
            pg0Var.n1(pg0Var.getConnectionsManager().sendRequest(tL_auth_signIn, new ke0(this, tL_auth_signIn, 0), 10), true);
            pg0Var.v1(true, true);
        }
    }

    @Override
    public final void i() {
        q(true);
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new oe0(this, 3), pg0.f37125q0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_word" + this.f37809a);
        this.I = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        if (this.I != null) {
            bundle.putBundle("recoveryview_word" + this.f37809a, this.I);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z4) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        rf0 rf0Var = this.v;
        if (bundle == null) {
            if (this.P != null && this.Q != null) {
                rf0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I6, false));
                int i13 = this.B;
                if (i13 == 17) {
                    i12 = R.string.ReturnEnteringPhrase;
                } else if (i13 == 16) {
                    i12 = R.string.ReturnEnteringWord;
                } else if (i13 == 3) {
                    i12 = R.string.ReturnPhoneCall;
                } else {
                    i12 = R.string.ReturnEnteringSMS;
                }
                rf0Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(i12), true, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
                return;
            }
            return;
        }
        kg.f fVar = this.f37811c;
        fVar.setText("");
        this.I = bundle;
        this.H = null;
        this.B = bundle.getInt("nextType");
        this.C = bundle.getInt("prevType", 0);
        this.F = bundle.getString("ephone");
        if (this.I.containsKey("beginning")) {
            this.H = this.I.getString("beginning");
        }
        this.D = bundle.getString("phoneFormated");
        this.E = bundle.getString("phoneHash");
        this.G = this.I.getString("phone");
        this.M = bundle.getInt("timeout");
        int i14 = this.C;
        org.telegram.ui.Components.voip.n2 n2Var = this.d;
        if (i14 == 17) {
            n2Var.setVisibility(0);
            n2Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringPhrase), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
        } else if (i14 == 16) {
            n2Var.setVisibility(0);
            n2Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringWord), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
        } else if (i14 != 1 && i14 != 2 && i14 != 4 && i14 != 3 && i14 != 15) {
            n2Var.setVisibility(8);
        } else {
            n2Var.setVisibility(0);
            n2Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringCode), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
        }
        this.P = null;
        this.Q = null;
        this.O = false;
        this.J = false;
        pg0 pg0Var = this.U;
        pg0Var.f37141l0 = false;
        rf0Var.invalidate();
        if (this.f37809a == 16) {
            z10 = false;
        } else {
            z10 = true;
        }
        String str = "+" + se.b.c().b(se.b.d(this.G, false));
        String str2 = this.H;
        TextView textView = this.f37814r;
        if (str2 == null) {
            if (!z10) {
                i11 = R.string.SMSWordText;
            } else {
                i11 = R.string.SMSPhraseText;
            }
            b.o(i11, new Object[]{str}, textView);
        } else {
            if (!z10) {
                i10 = R.string.SMSWordBeginningText;
            } else {
                i10 = R.string.SMSPhraseBeginningText;
            }
            b.o(i10, new Object[]{str, str2}, textView);
        }
        pg0.T0(pg0Var, fVar);
        fVar.requestFocus();
        org.telegram.ui.Components.jj0 jj0Var = this.h;
        if (jj0Var.getAnimatedDrawable() != null) {
            jj0Var.getAnimatedDrawable().L(0, false, false);
        }
        AndroidUtilities.runOnUIThread(new d10(jj0Var, 20), 500L);
        q(false);
        o(false);
        this.N = System.currentTimeMillis();
        int i15 = org.telegram.ui.ActionBar.j6.f20256y6;
        rf0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        int i16 = this.B;
        if (i16 != 2 && i16 != 4 && i16 != 3) {
            rf0Var.setVisibility(8);
        } else if (this.K != null) {
        } else {
            rf0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
            rf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i15));
            Timer timer = new Timer();
            this.K = timer;
            timer.schedule(new qe0(this), 0L, 1000L);
        }
    }

    @Override
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        pg0 pg0Var = this.U;
        this.f37813n.setTextColor(pg0Var.getThemedColor(i10));
        this.f37814r.setTextColor(pg0Var.getThemedColor(org.telegram.ui.ActionBar.j6.D6));
        int themedColor = pg0Var.getThemedColor(i10);
        kg.f fVar = this.f37811c;
        fVar.setTextColor(themedColor);
        fVar.setCursorColor(pg0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20024l6));
        fVar.setHintTextColor(pg0Var.getThemedColor(org.telegram.ui.ActionBar.j6.H6));
        this.f37810b.f();
    }

    public final void o(boolean z4) {
        float f10;
        this.f37817x = z4;
        float f11 = 0.0f;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f37810b.a(f10);
        float f12 = (f10 * 0.1f) + 0.9f;
        float f13 = -5.0f;
        ViewPropertyAnimator translationY = this.e.animate().scaleX(f12).scaleY(f12).alpha(f10).translationY((1.0f - f10) * AndroidUtilities.dp(-5.0f));
        org.telegram.ui.Components.mr mrVar = org.telegram.ui.Components.mr.h;
        b.p(translationY, mrVar, 290L);
        if (this.f37816w && !this.f37817x) {
            f11 = 1.0f;
        }
        float f14 = (0.1f * f11) + 0.9f;
        ViewPropertyAnimator alpha = this.f37812f.animate().scaleX(f14).scaleY(f14).alpha(f11);
        float f15 = 1.0f - f11;
        if (this.f37817x) {
            f13 = 5.0f;
        }
        alpha.translationY(f15 * AndroidUtilities.dp(f13)).setInterpolator(mrVar).setDuration(290L).start();
    }

    public final boolean p(String str) {
        if (this.H != null) {
            String lowerCase = t(str).toLowerCase();
            String lowerCase2 = this.H.toLowerCase();
            int min = Math.min(lowerCase.length(), lowerCase2.length());
            if (min <= 0) {
                return true;
            }
            return TextUtils.equals(lowerCase.substring(0, min), lowerCase2.substring(0, min));
        }
        return true;
    }

    public final void q(boolean z4) {
        boolean z10;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        oe0 oe0Var = this.R;
        AndroidUtilities.cancelRunOnUIThread(oe0Var);
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        if (TextUtils.isEmpty(this.f37811c.getText()) && clipboardManager != null && clipboardManager.hasPrimaryClip()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f37816w != z10) {
            this.f37816w = z10;
            float f16 = -5.0f;
            float f17 = 0.9f;
            float f18 = 0.7f;
            TextView textView = this.f37815s;
            TextView textView2 = this.f37812f;
            float f19 = 0.0f;
            float f20 = 1.0f;
            if (z4) {
                ViewPropertyAnimator animate = textView.animate();
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f13);
                if (z10) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.7f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f14);
                if (z10) {
                    f18 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f18);
                org.telegram.ui.Components.mr mrVar = org.telegram.ui.Components.mr.h;
                scaleY.setInterpolator(mrVar).setDuration(300L).start();
                ViewPropertyAnimator animate2 = textView2.animate();
                if (this.f37816w && !this.f37817x) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.9f;
                }
                ViewPropertyAnimator scaleX2 = animate2.scaleX(f15);
                if (this.f37816w && !this.f37817x) {
                    f17 = 1.0f;
                }
                ViewPropertyAnimator alpha2 = scaleX2.scaleY(f17).alpha((!this.f37816w || this.f37817x) ? 0.0f : 0.0f);
                if (!this.f37816w || this.f37817x) {
                    if (this.f37817x) {
                        f16 = 5.0f;
                    }
                    f19 = AndroidUtilities.dp(f16);
                }
                alpha2.translationY(f19).setInterpolator(mrVar).setDuration(300L).start();
            } else {
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                textView.setAlpha(f10);
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.7f;
                }
                textView.setScaleX(f11);
                if (z10) {
                    f18 = 1.0f;
                }
                textView.setScaleY(f18);
                if (this.f37816w && !this.f37817x) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.9f;
                }
                textView2.setScaleX(f12);
                if (this.f37816w && !this.f37817x) {
                    f17 = 1.0f;
                }
                textView2.setScaleY(f17);
                textView2.setAlpha((!this.f37816w || this.f37817x) ? 0.0f : 0.0f);
                if (!this.f37816w || this.f37817x) {
                    if (this.f37817x) {
                        f16 = 5.0f;
                    }
                    f19 = AndroidUtilities.dp(f16);
                }
                textView2.setTranslationY(f19);
            }
        }
        AndroidUtilities.runOnUIThread(oe0Var, 5000L);
    }

    public final void r() {
        rf0 rf0Var = this.v;
        int i10 = org.telegram.ui.ActionBar.j6.f20256y6;
        rf0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.v.setTag(R.id.color_key_tag, Integer.valueOf(i10));
        try {
            synchronized (this.L) {
                Timer timer = this.K;
                if (timer != null) {
                    timer.cancel();
                    this.K = null;
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void s(boolean z4) {
        boolean z10;
        int i10;
        int i11;
        kg.f fVar = this.f37811c;
        if (this.U.getParentActivity() == null) {
            return;
        }
        try {
            fVar.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (this.f37809a == 16) {
            z10 = false;
        } else {
            z10 = true;
        }
        TextView textView = this.e;
        if (z4) {
            if (!z10) {
                i11 = R.string.SMSWordBeginningError;
            } else {
                i11 = R.string.SMSPhraseBeginningError;
            }
            textView.setText(LocaleController.getString(i11));
        } else if (TextUtils.isEmpty(fVar.getText())) {
            textView.setText("");
        } else {
            if (!z10) {
                i10 = R.string.SMSWordError;
            } else {
                i10 = R.string.SMSPhraseError;
            }
            textView.setText(LocaleController.getString(i10));
        }
        if (!this.f37817x && !this.f37818y) {
            AndroidUtilities.shakeViewSpring(fVar, this.T);
            AndroidUtilities.shakeViewSpring(textView, this.T);
        }
        oe0 oe0Var = this.S;
        AndroidUtilities.cancelRunOnUIThread(oe0Var);
        o(true);
        AndroidUtilities.runOnUIThread(oe0Var, 10000L);
        this.T = -this.T;
    }
}
