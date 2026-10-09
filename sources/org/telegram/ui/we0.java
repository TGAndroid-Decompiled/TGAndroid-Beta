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
public final class we0 extends org.telegram.ui.Components.xw0 {
    public int E;
    public int F;
    public String G;
    public String H;
    public String I;
    public String J;
    public String K;
    public Bundle L;
    public boolean M;
    public Timer N;
    public final Object O;
    public int P;
    public double Q;
    public boolean R;
    public Bundle S;
    public TLRPC.TL_auth_sentCode T;
    public final te0 U;
    public final te0 V;
    public float W;
    public final int f43197a;
    public final wg0 f43198a0;
    public final org.telegram.ui.Components.zd0 f43199b;
    public final ci.g2 f43200c;
    public final org.telegram.ui.Components.voip.n2 d;
    public final TextView f43201e;
    public final TextView f43202f;
    public final org.telegram.ui.Components.fk0 h;
    public final TextView f43203n;
    public final TextView f43204r;
    public final TextView f43205s;
    public final xf0 v;
    public boolean f43206w;
    public boolean f43207x;
    public boolean f43208y;

    public we0(org.telegram.ui.wg0 r28, android.content.Context r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.we0.<init>(org.telegram.ui.wg0, android.content.Context, int):void");
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
    public final boolean c(boolean z10) {
        wg0 wg0Var = this.f43198a0;
        wg0Var.k1(true, true);
        int i10 = this.F;
        if (i10 != 0) {
            wg0Var.u1(i10, true, null, true);
            return false;
        }
        this.L = null;
        this.R = false;
        return true;
    }

    @Override
    public final void d() {
        this.R = false;
    }

    @Override
    public final void g() {
        AndroidUtilities.cancelRunOnUIThread(this.U);
    }

    @Override
    public String getHeaderName() {
        return LocaleController.getString("NewPassword", R.string.NewPassword);
    }

    @Override
    public final void h(String str) {
        if (this.R) {
            return;
        }
        String obj = this.f43200c.getText().toString();
        if (obj.length() == 0) {
            s(false);
        } else if (!p(obj)) {
            s(true);
        } else {
            this.R = true;
            TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
            tL_auth_signIn.phone_number = this.G;
            tL_auth_signIn.phone_code = obj;
            tL_auth_signIn.phone_code_hash = this.H;
            tL_auth_signIn.flags |= 1;
            wg0 wg0Var = this.f43198a0;
            wg0Var.n1(wg0Var.getConnectionsManager().sendRequest(tL_auth_signIn, new pe0(this, tL_auth_signIn, 0), 10), true);
            wg0Var.v1(true, true);
        }
    }

    @Override
    public final void i() {
        q(true);
    }

    @Override
    public final void j() {
        AndroidUtilities.runOnUIThread(new te0(this, 3), wg0.f43571t0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_word" + this.f43197a);
        this.L = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        if (this.L != null) {
            bundle.putBundle("recoveryview_word" + this.f43197a, this.L);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z10) {
        boolean z11;
        int i10;
        int i11;
        int i12;
        xf0 xf0Var = this.v;
        if (bundle == null) {
            if (this.S != null && this.T != null) {
                xf0Var.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.I6, false));
                int i13 = this.E;
                if (i13 == 17) {
                    i12 = R.string.ReturnEnteringPhrase;
                } else if (i13 == 16) {
                    i12 = R.string.ReturnEnteringWord;
                } else if (i13 == 3) {
                    i12 = R.string.ReturnPhoneCall;
                } else {
                    i12 = R.string.ReturnEnteringSMS;
                }
                xf0Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(i12), true, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
                return;
            }
            return;
        }
        ci.g2 g2Var = this.f43200c;
        g2Var.setText("");
        this.L = bundle;
        this.K = null;
        this.E = bundle.getInt("nextType");
        this.F = bundle.getInt("prevType", 0);
        this.I = bundle.getString("ephone");
        if (this.L.containsKey("beginning")) {
            this.K = this.L.getString("beginning");
        }
        this.G = bundle.getString("phoneFormated");
        this.H = bundle.getString("phoneHash");
        this.J = this.L.getString("phone");
        this.P = bundle.getInt("timeout");
        int i14 = this.F;
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
        this.S = null;
        this.T = null;
        this.R = false;
        this.M = false;
        wg0 wg0Var = this.f43198a0;
        wg0Var.f43591o0 = false;
        xf0Var.invalidate();
        if (this.f43197a == 16) {
            z11 = false;
        } else {
            z11 = true;
        }
        String str = "+" + hf.b.c().b(hf.b.d(this.J, false));
        String str2 = this.K;
        TextView textView = this.f43204r;
        if (str2 == null) {
            if (!z11) {
                i11 = R.string.SMSWordText;
            } else {
                i11 = R.string.SMSPhraseText;
            }
            org.telegram.messenger.bi.r(i11, new Object[]{str}, textView);
        } else {
            if (!z11) {
                i10 = R.string.SMSWordBeginningText;
            } else {
                i10 = R.string.SMSPhraseBeginningText;
            }
            org.telegram.messenger.bi.r(i10, new Object[]{str, str2}, textView);
        }
        wg0.T0(wg0Var, g2Var);
        g2Var.requestFocus();
        org.telegram.ui.Components.fk0 fk0Var = this.h;
        if (fk0Var.getAnimatedDrawable() != null) {
            fk0Var.getAnimatedDrawable().N(0, false, false);
        }
        AndroidUtilities.runOnUIThread(new uz(fk0Var, 21), 500L);
        q(false);
        o(false);
        this.Q = System.currentTimeMillis();
        int i15 = org.telegram.ui.ActionBar.i6.f21181y6;
        xf0Var.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i15, false));
        int i16 = this.E;
        if (i16 != 2 && i16 != 4 && i16 != 3) {
            xf0Var.setVisibility(8);
        } else if (this.N != null) {
        } else {
            xf0Var.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i15, false));
            xf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i15));
            Timer timer = new Timer();
            this.N = timer;
            timer.schedule(new ve0(this), 0L, 1000L);
        }
    }

    @Override
    public final void n() {
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        wg0 wg0Var = this.f43198a0;
        this.f43203n.setTextColor(wg0Var.getThemedColor(i10));
        this.f43204r.setTextColor(wg0Var.getThemedColor(org.telegram.ui.ActionBar.i6.D6));
        int themedColor = wg0Var.getThemedColor(i10);
        ci.g2 g2Var = this.f43200c;
        g2Var.setTextColor(themedColor);
        g2Var.setCursorColor(wg0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20943l6));
        g2Var.setHintTextColor(wg0Var.getThemedColor(org.telegram.ui.ActionBar.i6.H6));
        this.f43199b.f();
    }

    public final void o(boolean z10) {
        float f7;
        this.f43207x = z10;
        float f10 = 0.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f43199b.a(f7);
        float f11 = (f7 * 0.1f) + 0.9f;
        float f12 = -5.0f;
        ViewPropertyAnimator translationY = this.f43201e.animate().scaleX(f11).scaleY(f11).alpha(f7).translationY((1.0f - f7) * AndroidUtilities.dp(-5.0f));
        org.telegram.ui.Components.hs hsVar = org.telegram.ui.Components.hs.h;
        org.telegram.messenger.bi.t(translationY, hsVar, 290L);
        if (this.f43206w && !this.f43207x) {
            f10 = 1.0f;
        }
        float f13 = (0.1f * f10) + 0.9f;
        ViewPropertyAnimator alpha = this.f43202f.animate().scaleX(f13).scaleY(f13).alpha(f10);
        float f14 = 1.0f - f10;
        if (this.f43207x) {
            f12 = 5.0f;
        }
        alpha.translationY(f14 * AndroidUtilities.dp(f12)).setInterpolator(hsVar).setDuration(290L).start();
    }

    public final boolean p(String str) {
        if (this.K != null) {
            String lowerCase = t(str).toLowerCase();
            String lowerCase2 = this.K.toLowerCase();
            int min = Math.min(lowerCase.length(), lowerCase2.length());
            if (min <= 0) {
                return true;
            }
            return TextUtils.equals(lowerCase.substring(0, min), lowerCase2.substring(0, min));
        }
        return true;
    }

    public final void q(boolean z10) {
        boolean z11;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        te0 te0Var = this.U;
        AndroidUtilities.cancelRunOnUIThread(te0Var);
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        if (TextUtils.isEmpty(this.f43200c.getText()) && clipboardManager != null && clipboardManager.hasPrimaryClip()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f43206w != z11) {
            this.f43206w = z11;
            float f15 = -5.0f;
            float f16 = 0.9f;
            float f17 = 0.7f;
            TextView textView = this.f43205s;
            TextView textView2 = this.f43202f;
            float f18 = 0.0f;
            float f19 = 1.0f;
            if (z10) {
                ViewPropertyAnimator animate = textView.animate();
                if (z11) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f12);
                if (z11) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.7f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f13);
                if (z11) {
                    f17 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f17);
                org.telegram.ui.Components.hs hsVar = org.telegram.ui.Components.hs.h;
                scaleY.setInterpolator(hsVar).setDuration(300L).start();
                ViewPropertyAnimator animate2 = textView2.animate();
                if (this.f43206w && !this.f43207x) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.9f;
                }
                ViewPropertyAnimator scaleX2 = animate2.scaleX(f14);
                if (this.f43206w && !this.f43207x) {
                    f16 = 1.0f;
                }
                ViewPropertyAnimator scaleY2 = scaleX2.scaleY(f16);
                if (!this.f43206w || this.f43207x) {
                    f19 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = scaleY2.alpha(f19);
                if (!this.f43206w || this.f43207x) {
                    if (this.f43207x) {
                        f15 = 5.0f;
                    }
                    f18 = AndroidUtilities.dp(f15);
                }
                alpha2.translationY(f18).setInterpolator(hsVar).setDuration(300L).start();
            } else {
                if (z11) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                textView.setAlpha(f7);
                if (z11) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.7f;
                }
                textView.setScaleX(f10);
                if (z11) {
                    f17 = 1.0f;
                }
                textView.setScaleY(f17);
                if (this.f43206w && !this.f43207x) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.9f;
                }
                textView2.setScaleX(f11);
                if (this.f43206w && !this.f43207x) {
                    f16 = 1.0f;
                }
                textView2.setScaleY(f16);
                if (!this.f43206w || this.f43207x) {
                    f19 = 0.0f;
                }
                textView2.setAlpha(f19);
                if (!this.f43206w || this.f43207x) {
                    if (this.f43207x) {
                        f15 = 5.0f;
                    }
                    f18 = AndroidUtilities.dp(f15);
                }
                textView2.setTranslationY(f18);
            }
        }
        AndroidUtilities.runOnUIThread(te0Var, 5000L);
    }

    public final void r() {
        xf0 xf0Var = this.v;
        int i10 = org.telegram.ui.ActionBar.i6.f21181y6;
        xf0Var.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i10, false));
        this.v.setTag(R.id.color_key_tag, Integer.valueOf(i10));
        try {
            synchronized (this.O) {
                Timer timer = this.N;
                if (timer != null) {
                    timer.cancel();
                    this.N = null;
                }
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final void s(boolean z10) {
        boolean z11;
        int i10;
        int i11;
        ci.g2 g2Var = this.f43200c;
        if (this.f43198a0.getParentActivity() == null) {
            return;
        }
        try {
            g2Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (this.f43197a == 16) {
            z11 = false;
        } else {
            z11 = true;
        }
        TextView textView = this.f43201e;
        if (z10) {
            if (!z11) {
                i11 = R.string.SMSWordBeginningError;
            } else {
                i11 = R.string.SMSPhraseBeginningError;
            }
            textView.setText(LocaleController.getString(i11));
        } else if (TextUtils.isEmpty(g2Var.getText())) {
            textView.setText("");
        } else {
            if (!z11) {
                i10 = R.string.SMSWordError;
            } else {
                i10 = R.string.SMSPhraseError;
            }
            textView.setText(LocaleController.getString(i10));
        }
        if (!this.f43207x && !this.f43208y) {
            AndroidUtilities.shakeViewSpring(g2Var, this.W);
            AndroidUtilities.shakeViewSpring(textView, this.W);
        }
        te0 te0Var = this.V;
        AndroidUtilities.cancelRunOnUIThread(te0Var);
        o(true);
        AndroidUtilities.runOnUIThread(te0Var, 10000L);
        this.W = -this.W;
    }
}
