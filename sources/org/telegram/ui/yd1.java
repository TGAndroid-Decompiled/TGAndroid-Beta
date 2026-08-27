package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;

public final class yd1 extends f2.k0 {
    public boolean I;
    public final we1 J;

    public yd1(we1 we1Var) {
        this.J = we1Var;
    }

    @Override
    public final void b0(f2.e1 e1Var, f2.l1 l1Var) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            try {
                super.b0(e1Var, l1Var);
                return;
            } catch (IndexOutOfBoundsException unused) {
                throw new RuntimeException("Inconsistency detected. ");
            }
        }
        try {
            super.b0(e1Var, l1Var);
        } catch (IndexOutOfBoundsException e9) {
            FileLog.e(e9);
            AndroidUtilities.runOnUIThread(new ky0(this, 20));
        }
    }

    @Override
    public final void b1(View view, View view2, int i10, int i11) {
        this.I = true;
        super.b1(view, view2, i10, i11);
        this.I = false;
    }

    @Override
    public final void h1(int i10, int i11) {
        if (this.I) {
            i11 -= this.J.J.getPaddingTop();
        }
        super.h1(i10, i11);
    }

    @Override
    public final int o0(int i10, f2.e1 e1Var, f2.l1 l1Var) {
        int i11;
        nw nwVar;
        int i12;
        we1 we1Var = this.J;
        he1 he1Var = we1Var.J;
        boolean z10 = false;
        if (he1Var.T1) {
            return 0;
        }
        boolean z11 = he1Var.getScrollState() == 1;
        int paddingTop = we1Var.J.getPaddingTop();
        if (i10 >= 0 || we1Var.f43759x <= 0 || we1Var.f43761y != 2) {
            i11 = i10;
        } else {
            we1Var.J.setOverScrollMode(0);
            int iL0 = we1Var.B.L0();
            if (iL0 == 0) {
                View viewM = we1Var.B.m(iL0);
                if (viewM != null) {
                    viewM.setTranslationX(0.0f);
                }
                if (viewM != null && viewM.getBottom() - paddingTop <= AndroidUtilities.dp(1.0f)) {
                    iL0 = 1;
                }
            }
            if (!z11) {
                View viewM2 = we1Var.B.m(iL0);
                if (viewM2 == null) {
                    i11 = i10;
                } else {
                    int iE = i0.a.e(iL0, 1, AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 78.0f : 72.0f) + 1, -(viewM2.getTop() - paddingTop));
                    if (iE < Math.abs(i10)) {
                        i11 = -iE;
                    } else {
                        i11 = i10;
                    }
                }
            } else if (iL0 == 0) {
                View viewM3 = we1Var.B.m(iL0);
                float top = ((viewM3.getTop() - paddingTop) / viewM3.getMeasuredHeight()) + 1.0f;
                if (top > 1.0f) {
                    top = 1.0f;
                }
                we1Var.J.setOverScrollMode(2);
                i11 = (int) ((0.45f - (top * 0.25f)) * i10);
                if (i11 > -1) {
                    i11 = -1;
                }
            } else {
                i11 = i10;
            }
        }
        he1 he1Var2 = we1Var.J;
        float f10 = he1Var2.f43209b3;
        if (f10 != 0.0f && i10 > 0 && z11) {
            float f11 = ((int) f10) - i10;
            if (f11 < 0.0f) {
                i12 = (int) f11;
                f11 = 0.0f;
            } else {
                i12 = 0;
            }
            he1Var2.setViewsOffset(f11);
            i11 = i12;
        }
        if (we1Var.f43761y == 0 || we1Var.f43759x <= 0) {
            return super.o0(i11, e1Var, l1Var);
        }
        int iO0 = super.o0(i11, e1Var, l1Var);
        nw nwVar2 = we1Var.f43757w;
        if (nwVar2 != null) {
            nwVar2.f34183a = iO0;
        }
        int iL1 = we1Var.B.L0();
        View viewM4 = iL1 == 0 ? we1Var.B.m(iL1) : null;
        if (viewM4 != null) {
            viewM4.setTranslationX(0.0f);
        }
        int i13 = i11;
        if (iL1 != 0 || viewM4 == null || viewM4.getBottom() - paddingTop < AndroidUtilities.dp(4.0f)) {
            we1Var.U = 0L;
            we1Var.V = false;
            we1Var.f43761y = 2;
            nw nwVar3 = we1Var.f43757w;
            if (nwVar3 != null) {
                ValueAnimator valueAnimator = nwVar3.f34210z;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                org.telegram.ui.Cells.p2 p2Var = nwVar3.H;
                if (p2Var != null) {
                    p2Var.removeCallbacks(nwVar3.f34189d0);
                }
                nwVar3.f34208x = 0.0f;
                nwVar3.f34209y = false;
                nwVar3.f34191e0 = false;
                we1Var.f43757w.f(0.0f);
                we1Var.f43757w.I = we1Var.J;
            }
        } else {
            if (we1Var.U == 0) {
                we1Var.U = System.currentTimeMillis();
            }
            if (we1Var.f43761y == 2 && (nwVar = we1Var.f43757w) != null) {
                nwVar.h();
            }
            float top2 = ((viewM4.getTop() - paddingTop) / viewM4.getMeasuredHeight()) + 1.0f;
            if (top2 > 1.0f) {
                top2 = 1.0f;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - we1Var.U;
            if (top2 > 0.85f && jCurrentTimeMillis > 220) {
                z10 = true;
            }
            if (we1Var.V != z10) {
                we1Var.V = z10;
                if (we1Var.f43761y == 2) {
                    try {
                        we1Var.J.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    nw nwVar4 = we1Var.f43757w;
                    if (nwVar4 != null) {
                        nwVar4.a(z10);
                    }
                }
            }
            if (we1Var.f43761y == 2 && i13 - iO0 != 0 && i10 < 0 && z11) {
                float fDp = 1.0f - (we1Var.J.f43209b3 / AndroidUtilities.dp(72.0f));
                he1 he1Var3 = we1Var.J;
                he1Var3.setViewsOffset(he1Var3.f43209b3 - ((i10 * 0.2f) * fDp));
            }
            nw nwVar5 = we1Var.f43757w;
            if (nwVar5 != null) {
                nwVar5.f(top2);
                we1Var.f43757w.I = we1Var.J;
            }
        }
        if (viewM4 != null) {
            viewM4.invalidate();
        }
        return iO0;
    }

    @Override
    public final void v0(RecyclerView recyclerView, f2.l1 l1Var, int i10) {
        if (this.J.f43759x > 0 && i10 == 1) {
            super.v0(recyclerView, l1Var, i10);
            return;
        }
        sh.n nVar = new sh.n(recyclerView.getContext(), 0);
        nVar.f5731a = i10;
        w0(nVar);
    }
}
