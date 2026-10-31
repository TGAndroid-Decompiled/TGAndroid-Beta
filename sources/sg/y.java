package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.tz;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.oh;
import org.telegram.ui.Components.s51;
import org.telegram.ui.Components.v71;
import org.telegram.ui.g3;
import org.telegram.ui.nb0;
import org.telegram.ui.xy0;
import th.o7;
import th.p1;
import th.s0;
import th.w0;
import th.z2;
import vh.b4;
import vh.k2;
import vh.o8;
import vh.p6;
import vh.y2;
import xh.m2;
import zf.a1;
public final class y extends AnimatorListenerAdapter {
    public final int f48487a;
    public final boolean f48488b;
    public final Object f48489c;

    public y(int i10, Object obj, boolean z10) {
        this.f48487a = i10;
        this.f48489c = obj;
        this.f48488b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f48487a) {
            case 16:
                ((yh.l) this.f48489c).f54507y = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float f10;
        float f11;
        s0 s0Var;
        float f12;
        float f13;
        float f14;
        View m10;
        float f15;
        float f16;
        int i10;
        float f17;
        RadialProgressView radialProgressView;
        float f18;
        boolean z10;
        int i11;
        float f19;
        float f20;
        boolean z11;
        float f21;
        float f22;
        switch (this.f48487a) {
            case 0:
                b0 b0Var = (b0) this.f48489c;
                mj0 mj0Var = b0Var.f48285n;
                b0Var.k();
                b0Var.l();
                boolean z12 = this.f48488b;
                b0.a(b0Var, z12);
                b0Var.f48284m.invalidateOutline();
                if (z12) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                b0Var.f48281j = f7;
                boolean z13 = true;
                if (z12) {
                    b0Var.f48282k = true;
                    b0Var.f48275a.invalidate();
                }
                mj0Var.setCustomEmojiEnterProgress(Utilities.i(b0Var.f48281j, 1.0f, 0.0f));
                if (!z12) {
                    mj0Var.setImportantForAccessibility(0);
                    mj0Var.setSkipDraw(false);
                    b0Var.f();
                    Runtime.getRuntime().gc();
                    int i12 = b0Var.f48295y;
                    mj0Var.setCustomEmojiReactionsBackground((i12 == 4 || i12 == 5) ? false : false);
                }
                b0Var.C = false;
                return;
            case 1:
                th.m mVar = (th.m) this.f48489c;
                if (this.f48488b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                mVar.f49201d0 = f10;
                mVar.b();
                return;
            case 2:
                p1 p1Var = (p1) this.f48489c;
                nb0 nb0Var = p1Var.f49083c;
                float f23 = 0.0f;
                boolean z14 = this.f48488b;
                if (z14) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                nb0Var.setAlpha(f11);
                View view = p1Var.f49079a;
                if (!z14) {
                    f23 = 0.5f;
                }
                view.setAlpha(f23);
                p1Var.invalidate();
                return;
            case 3:
                w0 w0Var = (w0) this.f48489c;
                w0Var.f49550b.removeViewImmediate(w0Var.d);
                w0Var.f49552f.b();
                if (this.f48488b && (s0Var = w0Var.f49556w) != null && s0Var != s0.W) {
                    s0Var.e();
                }
                w0Var.f49556w = null;
                w0Var.f49555s = true;
                w0Var.G = null;
                w0Var.E = false;
                return;
            case 4:
                o7 o7Var = (o7) this.f48489c;
                o7Var.J0.e();
                if (this.f48488b) {
                    f12 = o7Var.f49342x.f48963c;
                } else {
                    f12 = 0.0f;
                }
                o7Var.f49301e0 = f12;
                z2 currentPeerView = o7Var.f49319n0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                o7Var.f49339w.invalidate();
                o7Var.f49338v1 = null;
                return;
            case 5:
                uh.m mVar2 = (uh.m) this.f48489c;
                float f24 = 0.0f;
                boolean z15 = this.f48488b;
                if (z15) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                mVar2.f50267x = f13;
                v71 v71Var = mVar2.f50264r;
                if (z15) {
                    f14 = 0.0f;
                } else {
                    f14 = -42.0f;
                }
                v71Var.setTranslationY(org.telegram.messenger.i0.L(f14));
                xy0 xy0Var = mVar2.f50263n;
                if (z15) {
                    f24 = 42.0f;
                }
                xy0Var.setTranslationY(org.telegram.messenger.i0.L(f24));
                return;
            case 6:
                uh.i iVar = (uh.i) this.f48489c;
                s51 s51Var = iVar.h;
                uh.c cVar = iVar.f50248f;
                uh.e eVar = iVar.f50252w;
                iVar.f50246b = false;
                boolean z16 = this.f48488b;
                if (z16) {
                    int i13 = iVar.e;
                    iVar.d = i13;
                    iVar.W.D = i13;
                    tz.F(i13);
                }
                int b10 = eVar.b();
                if (z16) {
                    s51Var.y1(iVar.d);
                    cVar.a0();
                    if (eVar.b() == b10) {
                        org.telegram.messenger.i0.a4(cVar);
                    } else {
                        eVar.f();
                    }
                }
                iVar.f50250r.setVisibility(8);
                int i14 = iVar.S;
                if (i14 >= 0) {
                    if (z16 && (m10 = iVar.f50251s.m(i14)) != null) {
                        iVar.T = m10.getTop();
                    }
                    s51Var.h1(iVar.S, (-cVar.getPaddingTop()) + iVar.T);
                }
                super.onAnimationEnd(animator);
                return;
            case 7:
                vh.d dVar = (vh.d) this.f48489c;
                if (this.f48488b) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                dVar.P = f15;
                dVar.invalidate();
                return;
            case 8:
                vh.k kVar = (vh.k) this.f48489c;
                boolean z17 = this.f48488b;
                if (!z17) {
                    kVar.f51353r.setVisibility(8);
                    oh ohVar = kVar.M;
                    if (ohVar != null) {
                        ohVar.setVisibility(8);
                    }
                }
                if (z17) {
                    kVar.f51340f.getEditText().setAllowDrawCursor(true);
                }
                kVar.c(z17);
                return;
            case 9:
                vh.t tVar = (vh.t) this.f48489c;
                g3 g3Var = tVar.f51945a;
                boolean z18 = this.f48488b;
                if (z18) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                tVar.d = f16;
                g3Var.invalidate();
                if (z18) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                g3Var.setVisibility(i10);
                return;
            case 10:
                if (!this.f48488b) {
                    ((k2) this.f48489c).I.setVisibility(8);
                    return;
                }
                return;
            case 11:
                if (!this.f48488b) {
                    ((y2) this.f48489c).f52192b.setVisibility(8);
                    return;
                }
                return;
            case 12:
                b4 b4Var = (b4) this.f48489c;
                if (!this.f48488b) {
                    b4Var.I1.setVisibility(8);
                    b4Var.I1.n();
                    return;
                }
                return;
            case 13:
                p6 p6Var = (p6) this.f48489c;
                if (this.f48488b) {
                    p6Var.setVisibility(8);
                }
                p6Var.f51768c = null;
                return;
            case 14:
                o8 o8Var = (o8) this.f48489c;
                if (!this.f48488b) {
                    o8Var.V0.setVisibility(8);
                }
                o8Var.f51624f2 = null;
                return;
            case 15:
                m2 m2Var = (m2) this.f48489c;
                if (this.f48488b) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                m2Var.R0 = f17;
                m2Var.l();
                return;
            case 16:
                yh.l lVar = (yh.l) this.f48489c;
                if (lVar.f54507y != null && (radialProgressView = lVar.D) != null) {
                    if (!this.f48488b) {
                        radialProgressView.setVisibility(4);
                        lVar.f54505w.setVisibility(4);
                    }
                    lVar.f54507y = null;
                    return;
                }
                return;
            default:
                a1 a1Var = (a1) this.f48489c;
                boolean z19 = this.f48488b;
                if (z19) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                a1Var.e = f18;
                a1Var.invalidate();
                for (int i15 = 0; i15 < 2; i15++) {
                    a1Var.f55441c[i15].setTranslationX(org.telegram.messenger.i0.W1(a1Var.e, 0, -org.telegram.messenger.i0.L(62.0f)));
                    TextView textView = a1Var.f55441c[i15];
                    if (i15 == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int i16 = 8;
                    if (z10 == z19) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    textView.setVisibility(i11);
                    TextView textView2 = a1Var.f55441c[i15];
                    if (i15 == 0) {
                        f19 = 1.0f;
                    } else {
                        f19 = 0.0f;
                    }
                    if (i15 == 1) {
                        f20 = 1.0f;
                    } else {
                        f20 = 0.0f;
                    }
                    textView2.setAlpha(org.telegram.messenger.i0.T1(f19, f20, a1Var.e));
                    a1Var.d[i15].setTranslationX(org.telegram.messenger.i0.W1(a1Var.e, 0, -org.telegram.messenger.i0.L(62.0f)));
                    TextView textView3 = a1Var.d[i15];
                    if (i15 == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11 == z19) {
                        i16 = 0;
                    }
                    textView3.setVisibility(i16);
                    TextView textView4 = a1Var.d[i15];
                    if (i15 == 0) {
                        f21 = 1.0f;
                    } else {
                        f21 = 0.0f;
                    }
                    if (i15 == 1) {
                        f22 = 1.0f;
                    } else {
                        f22 = 0.0f;
                    }
                    textView4.setAlpha(org.telegram.messenger.i0.T1(f21, f22, a1Var.e));
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f48487a) {
            case 1:
                super.onAnimationStart(animator);
                try {
                    ((th.m) this.f48489c).performHapticFeedback(3);
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
