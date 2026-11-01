package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.uz;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.Components.oh;
import org.telegram.ui.Components.t51;
import org.telegram.ui.Components.w71;
import org.telegram.ui.g3;
import org.telegram.ui.mb0;
import org.telegram.ui.wy0;
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
    public final int f48498a;
    public final boolean f48499b;
    public final Object f48500c;

    public y(int i10, Object obj, boolean z10) {
        this.f48498a = i10;
        this.f48500c = obj;
        this.f48499b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f48498a) {
            case 16:
                ((yh.l) this.f48500c).f54511y = null;
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
        switch (this.f48498a) {
            case 0:
                b0 b0Var = (b0) this.f48500c;
                nj0 nj0Var = b0Var.f48296n;
                b0Var.k();
                b0Var.l();
                boolean z12 = this.f48499b;
                b0.a(b0Var, z12);
                b0Var.f48295m.invalidateOutline();
                if (z12) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                b0Var.f48292j = f7;
                boolean z13 = true;
                if (z12) {
                    b0Var.f48293k = true;
                    b0Var.f48286a.invalidate();
                }
                nj0Var.setCustomEmojiEnterProgress(Utilities.i(b0Var.f48292j, 1.0f, 0.0f));
                if (!z12) {
                    nj0Var.setImportantForAccessibility(0);
                    nj0Var.setSkipDraw(false);
                    b0Var.f();
                    Runtime.getRuntime().gc();
                    int i12 = b0Var.f48306y;
                    nj0Var.setCustomEmojiReactionsBackground((i12 == 4 || i12 == 5) ? false : false);
                }
                b0Var.C = false;
                return;
            case 1:
                th.m mVar = (th.m) this.f48500c;
                if (this.f48499b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                mVar.f49215d0 = f10;
                mVar.b();
                return;
            case 2:
                p1 p1Var = (p1) this.f48500c;
                mb0 mb0Var = p1Var.f49097c;
                float f23 = 0.0f;
                boolean z14 = this.f48499b;
                if (z14) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                mb0Var.setAlpha(f11);
                View view = p1Var.f49093a;
                if (!z14) {
                    f23 = 0.5f;
                }
                view.setAlpha(f23);
                p1Var.invalidate();
                return;
            case 3:
                w0 w0Var = (w0) this.f48500c;
                w0Var.f49564b.removeViewImmediate(w0Var.d);
                w0Var.f49566f.b();
                if (this.f48499b && (s0Var = w0Var.f49570w) != null && s0Var != s0.W) {
                    s0Var.e();
                }
                w0Var.f49570w = null;
                w0Var.f49569s = true;
                w0Var.G = null;
                w0Var.E = false;
                return;
            case 4:
                o7 o7Var = (o7) this.f48500c;
                o7Var.J0.e();
                if (this.f48499b) {
                    f12 = o7Var.f49356x.f48977c;
                } else {
                    f12 = 0.0f;
                }
                o7Var.f49315e0 = f12;
                z2 currentPeerView = o7Var.f49333n0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                o7Var.f49353w.invalidate();
                o7Var.f49352v1 = null;
                return;
            case 5:
                uh.m mVar2 = (uh.m) this.f48500c;
                float f24 = 0.0f;
                boolean z15 = this.f48499b;
                if (z15) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                mVar2.f50281x = f13;
                w71 w71Var = mVar2.f50278r;
                if (z15) {
                    f14 = 0.0f;
                } else {
                    f14 = -42.0f;
                }
                w71Var.setTranslationY(org.telegram.messenger.i0.L(f14));
                wy0 wy0Var = mVar2.f50277n;
                if (z15) {
                    f24 = 42.0f;
                }
                wy0Var.setTranslationY(org.telegram.messenger.i0.L(f24));
                return;
            case 6:
                uh.i iVar = (uh.i) this.f48500c;
                t51 t51Var = iVar.h;
                uh.c cVar = iVar.f50262f;
                uh.e eVar = iVar.f50266w;
                iVar.f50260b = false;
                boolean z16 = this.f48499b;
                if (z16) {
                    int i13 = iVar.e;
                    iVar.d = i13;
                    iVar.W.D = i13;
                    uz.F(i13);
                }
                int b10 = eVar.b();
                if (z16) {
                    t51Var.y1(iVar.d);
                    cVar.a0();
                    if (eVar.b() == b10) {
                        org.telegram.messenger.i0.a4(cVar);
                    } else {
                        eVar.f();
                    }
                }
                iVar.f50264r.setVisibility(8);
                int i14 = iVar.S;
                if (i14 >= 0) {
                    if (z16 && (m10 = iVar.f50265s.m(i14)) != null) {
                        iVar.T = m10.getTop();
                    }
                    t51Var.h1(iVar.S, (-cVar.getPaddingTop()) + iVar.T);
                }
                super.onAnimationEnd(animator);
                return;
            case 7:
                vh.d dVar = (vh.d) this.f48500c;
                if (this.f48499b) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                dVar.P = f15;
                dVar.invalidate();
                return;
            case 8:
                vh.k kVar = (vh.k) this.f48500c;
                boolean z17 = this.f48499b;
                if (!z17) {
                    kVar.f51368r.setVisibility(8);
                    oh ohVar = kVar.M;
                    if (ohVar != null) {
                        ohVar.setVisibility(8);
                    }
                }
                if (z17) {
                    kVar.f51355f.getEditText().setAllowDrawCursor(true);
                }
                kVar.c(z17);
                return;
            case 9:
                vh.t tVar = (vh.t) this.f48500c;
                g3 g3Var = tVar.f51958a;
                boolean z18 = this.f48499b;
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
                if (!this.f48499b) {
                    ((k2) this.f48500c).I.setVisibility(8);
                    return;
                }
                return;
            case 11:
                if (!this.f48499b) {
                    ((y2) this.f48500c).f52207b.setVisibility(8);
                    return;
                }
                return;
            case 12:
                b4 b4Var = (b4) this.f48500c;
                if (!this.f48499b) {
                    b4Var.I1.setVisibility(8);
                    b4Var.I1.n();
                    return;
                }
                return;
            case 13:
                p6 p6Var = (p6) this.f48500c;
                if (this.f48499b) {
                    p6Var.setVisibility(8);
                }
                p6Var.f51783c = null;
                return;
            case 14:
                o8 o8Var = (o8) this.f48500c;
                if (!this.f48499b) {
                    o8Var.V0.setVisibility(8);
                }
                o8Var.f51639f2 = null;
                return;
            case 15:
                m2 m2Var = (m2) this.f48500c;
                if (this.f48499b) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                m2Var.R0 = f17;
                m2Var.l();
                return;
            case 16:
                yh.l lVar = (yh.l) this.f48500c;
                if (lVar.f54511y != null && (radialProgressView = lVar.D) != null) {
                    if (!this.f48499b) {
                        radialProgressView.setVisibility(4);
                        lVar.f54509w.setVisibility(4);
                    }
                    lVar.f54511y = null;
                    return;
                }
                return;
            default:
                a1 a1Var = (a1) this.f48500c;
                boolean z19 = this.f48499b;
                if (z19) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                a1Var.e = f18;
                a1Var.invalidate();
                for (int i15 = 0; i15 < 2; i15++) {
                    a1Var.f55459c[i15].setTranslationX(org.telegram.messenger.i0.W1(a1Var.e, 0, -org.telegram.messenger.i0.L(62.0f)));
                    TextView textView = a1Var.f55459c[i15];
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
                    TextView textView2 = a1Var.f55459c[i15];
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
        switch (this.f48498a) {
            case 1:
                super.onAnimationStart(animator);
                try {
                    ((th.m) this.f48500c).performHapticFeedback(3);
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
