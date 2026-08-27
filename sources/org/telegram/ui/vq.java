package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

public final class vq extends f2.k0 {
    public final int I;
    public final Object J;

    public vq(ViewGroup viewGroup, int i10) {
        super(0, false);
        this.I = i10;
        this.J = viewGroup;
    }

    @Override
    public void S(f2.e1 e1Var, f2.l1 l1Var, s0.c cVar) {
        switch (this.I) {
            case 5:
                super.S(e1Var, l1Var, cVar);
                if (((org.telegram.ui.Components.o71) this.J).R) {
                    cVar.p(false);
                }
                break;
            case 6:
            default:
                super.S(e1Var, l1Var, cVar);
                break;
            case 7:
                super.S(e1Var, l1Var, cVar);
                if (!((pf.g0) this.J).isEnabled()) {
                    cVar.p(false);
                }
                break;
        }
    }

    @Override
    public int W0(f2.l1 l1Var) {
        switch (this.I) {
            case 4:
                return ((org.telegram.ui.Components.r11) this.J).W2 ? AndroidUtilities.displaySize.y : super.W0(l1Var);
            default:
                return super.W0(l1Var);
        }
    }

    @Override
    public void k1(boolean z10) {
        switch (this.I) {
            case 2:
                super.k1(z10);
                ((org.telegram.ui.Components.aa0) this.J).f26700b.setTranslationY(AndroidUtilities.dp(6.0f) * (z10 ? -1 : 1));
                break;
            default:
                super.k1(z10);
                break;
        }
    }

    @Override
    public int m0(int i10, f2.e1 e1Var, f2.l1 l1Var) {
        switch (this.I) {
            case 1:
                org.telegram.ui.Components.b70 b70Var = ((gw) ((org.telegram.ui.Components.yz) this.J).F).f38485b.H0;
                if (b70Var != null && b70Var.D()) {
                    i10 = 0;
                }
                return super.m0(i10, e1Var, l1Var);
            case 2:
            default:
                return super.m0(i10, e1Var, l1Var);
            case 3:
                org.telegram.ui.Components.wj0 wj0Var = (org.telegram.ui.Components.wj0) this.J;
                hh.f1 f1Var = wj0Var.f34236b;
                if (i10 < 0 && wj0Var.f34271x0 != 0.0f) {
                    float pullingLeftProgress = wj0Var.getPullingLeftProgress();
                    wj0Var.f34271x0 += i10;
                    if ((pullingLeftProgress > 1.0f) != (wj0Var.getPullingLeftProgress() > 1.0f)) {
                        try {
                            f1Var.performHapticFeedback(3);
                            break;
                        } catch (Exception unused) {
                        }
                    }
                    float f10 = wj0Var.f34271x0;
                    if (f10 < 0.0f) {
                        i10 = (int) f10;
                        wj0Var.f34271x0 = 0.0f;
                    } else {
                        i10 = 0;
                    }
                    ag.y1 y1Var = wj0Var.O;
                    if (y1Var != null) {
                        y1Var.invalidate();
                    }
                    f1Var.invalidate();
                }
                int iM0 = super.m0(i10, e1Var, l1Var);
                if (i10 > 0 && iM0 == 0 && f1Var.getScrollState() == 1 && wj0Var.q()) {
                    ValueAnimator valueAnimator = wj0Var.f34266u0;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        wj0Var.f34266u0.cancel();
                    }
                    float pullingLeftProgress2 = wj0Var.getPullingLeftProgress();
                    wj0Var.f34271x0 = (i10 * (pullingLeftProgress2 > 1.0f ? 0.05f : 0.6f)) + wj0Var.f34271x0;
                    if ((pullingLeftProgress2 > 1.0f) != (wj0Var.getPullingLeftProgress() > 1.0f)) {
                        try {
                            f1Var.performHapticFeedback(3);
                            break;
                        } catch (Exception unused2) {
                        }
                    }
                    ag.y1 y1Var2 = wj0Var.O;
                    if (y1Var2 != null) {
                        y1Var2.invalidate();
                    }
                    f1Var.invalidate();
                }
                return iM0;
        }
    }

    @Override
    public int o0(int i10, f2.e1 e1Var, f2.l1 l1Var) {
        switch (this.I) {
            case 0:
                lr lrVar = (lr) this.J;
                if (!lrVar.N && lrVar.K == 0 && lrVar.B.size() == 0) {
                    return 0;
                }
                return super.o0(i10, e1Var, l1Var);
            default:
                return super.o0(i10, e1Var, l1Var);
        }
    }

    @Override
    public void v0(RecyclerView recyclerView, f2.l1 l1Var, int i10) {
        switch (this.I) {
            case 1:
                org.telegram.ui.Components.rz rzVar = new org.telegram.ui.Components.rz(this, recyclerView.getContext());
                rzVar.f5731a = i10;
                w0(rzVar);
                break;
            case 5:
                org.telegram.ui.Components.i71 i71Var = new org.telegram.ui.Components.i71(this, recyclerView.getContext());
                i71Var.f5731a = i10;
                w0(i71Var);
                break;
            default:
                super.v0(recyclerView, l1Var, i10);
                break;
        }
    }

    @Override
    public boolean y0() {
        switch (this.I) {
            case 1:
                return true;
            case 2:
                return false;
            case 3:
            case 4:
            case 5:
            default:
                return super.y0();
            case 6:
                return false;
            case 7:
                return false;
        }
    }

    @Override
    public void z0(f2.l1 l1Var, int[] iArr) {
        switch (this.I) {
            case 6:
                iArr[1] = ((StickersActivity) this.J).f36189a.getHeight();
                break;
            default:
                super.z0(l1Var, iArr);
                break;
        }
    }

    public vq(Object obj, int i10) {
        this.I = i10;
        this.J = obj;
    }

    public vq(lr lrVar) {
        super(1, false);
        this.I = 0;
        this.J = lrVar;
    }
}
