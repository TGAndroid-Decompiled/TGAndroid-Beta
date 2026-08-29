package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class vq extends f2.j0 {
    public final int I;
    public final Object J;

    public vq(ViewGroup viewGroup, int i10) {
        super(0, false);
        this.I = i10;
        this.J = viewGroup;
    }

    @Override
    public void S(f2.d1 d1Var, f2.k1 k1Var, s0.c cVar) {
        switch (this.I) {
            case 5:
                super.S(d1Var, k1Var, cVar);
                if (((org.telegram.ui.Components.y71) this.J).R) {
                    cVar.p(false);
                    return;
                }
                return;
            case 6:
            default:
                super.S(d1Var, k1Var, cVar);
                return;
            case 7:
                super.S(d1Var, k1Var, cVar);
                if (!((rf.h0) this.J).isEnabled()) {
                    cVar.p(false);
                    return;
                }
                return;
        }
    }

    @Override
    public int W0(f2.k1 k1Var) {
        switch (this.I) {
            case 4:
                if (((org.telegram.ui.Components.a21) this.J).W2) {
                    return AndroidUtilities.displaySize.y;
                }
                return super.W0(k1Var);
            default:
                return super.W0(k1Var);
        }
    }

    @Override
    public void k1(boolean z10) {
        int i10;
        switch (this.I) {
            case 2:
                super.k1(z10);
                org.telegram.ui.Components.ja0 ja0Var = ((org.telegram.ui.Components.ka0) this.J).f29996b;
                if (z10) {
                    i10 = -1;
                } else {
                    i10 = 1;
                }
                ja0Var.setTranslationY(AndroidUtilities.dp(6.0f) * i10);
                return;
            default:
                super.k1(z10);
                return;
        }
    }

    @Override
    public int m0(int i10, f2.d1 d1Var, f2.k1 k1Var) {
        float f9;
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.I) {
            case 1:
                org.telegram.ui.Components.j70 j70Var = ((fw) ((org.telegram.ui.Components.f00) this.J).F).f38242b.H0;
                if (j70Var != null && j70Var.D()) {
                    i10 = 0;
                }
                return super.m0(i10, d1Var, k1Var);
            case 2:
            default:
                return super.m0(i10, d1Var, k1Var);
            case 3:
                org.telegram.ui.Components.fk0 fk0Var = (org.telegram.ui.Components.fk0) this.J;
                jh.e1 e1Var = fk0Var.f28434b;
                boolean z13 = false;
                if (i10 < 0 && fk0Var.f28469x0 != 0.0f) {
                    float pullingLeftProgress = fk0Var.getPullingLeftProgress();
                    fk0Var.f28469x0 += i10;
                    float pullingLeftProgress2 = fk0Var.getPullingLeftProgress();
                    if (pullingLeftProgress > 1.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (pullingLeftProgress2 > 1.0f) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z11 != z12) {
                        try {
                            e1Var.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    float f10 = fk0Var.f28469x0;
                    if (f10 < 0.0f) {
                        i10 = (int) f10;
                        fk0Var.f28469x0 = 0.0f;
                    } else {
                        i10 = 0;
                    }
                    bg.d1 d1Var2 = fk0Var.O;
                    if (d1Var2 != null) {
                        d1Var2.invalidate();
                    }
                    e1Var.invalidate();
                }
                int m0 = super.m0(i10, d1Var, k1Var);
                if (i10 > 0 && m0 == 0 && e1Var.getScrollState() == 1 && fk0Var.q()) {
                    ValueAnimator valueAnimator = fk0Var.f28464u0;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        fk0Var.f28464u0.cancel();
                    }
                    int i11 = (fk0Var.getPullingLeftProgress() > 1.0f ? 1 : (fk0Var.getPullingLeftProgress() == 1.0f ? 0 : -1));
                    if (i11 > 0) {
                        f9 = 0.05f;
                    } else {
                        f9 = 0.6f;
                    }
                    fk0Var.f28469x0 = (i10 * f9) + fk0Var.f28469x0;
                    float pullingLeftProgress3 = fk0Var.getPullingLeftProgress();
                    if (i11 > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (pullingLeftProgress3 > 1.0f) {
                        z13 = true;
                    }
                    if (z10 != z13) {
                        try {
                            e1Var.performHapticFeedback(3);
                        } catch (Exception unused2) {
                        }
                    }
                    bg.d1 d1Var3 = fk0Var.O;
                    if (d1Var3 != null) {
                        d1Var3.invalidate();
                    }
                    e1Var.invalidate();
                }
                return m0;
        }
    }

    @Override
    public int o0(int i10, f2.d1 d1Var, f2.k1 k1Var) {
        switch (this.I) {
            case 0:
                jr jrVar = (jr) this.J;
                if (!jrVar.N && jrVar.K == 0 && jrVar.B.size() == 0) {
                    return 0;
                }
                return super.o0(i10, d1Var, k1Var);
            default:
                return super.o0(i10, d1Var, k1Var);
        }
    }

    @Override
    public void v0(RecyclerView recyclerView, f2.k1 k1Var, int i10) {
        switch (this.I) {
            case 1:
                org.telegram.ui.Components.yz yzVar = new org.telegram.ui.Components.yz(this, recyclerView.getContext());
                yzVar.f6373a = i10;
                w0(yzVar);
                return;
            case 5:
                org.telegram.ui.Components.s71 s71Var = new org.telegram.ui.Components.s71(this, recyclerView.getContext());
                s71Var.f6373a = i10;
                w0(s71Var);
                return;
            default:
                super.v0(recyclerView, k1Var, i10);
                return;
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
    public void z0(f2.k1 k1Var, int[] iArr) {
        switch (this.I) {
            case 6:
                iArr[1] = ((StickersActivity) this.J).f36251a.getHeight();
                return;
            default:
                super.z0(k1Var, iArr);
                return;
        }
    }

    public vq(Object obj, int i10) {
        this.I = i10;
        this.J = obj;
    }

    public vq(jr jrVar) {
        super(1, false);
        this.I = 0;
        this.J = jrVar;
    }
}
