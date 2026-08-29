package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import j$.util.Objects;
public final class rf implements mg.a {
    public final int f42085a;
    public final km f42086b;

    public rf(km kmVar, int i10) {
        this.f42085a = i10;
        this.f42086b = kmVar;
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        km kmVar;
        switch (this.f42085a) {
            case 0:
                km kmVar2 = this.f42086b;
                tn tnVar = kmVar2.F0;
                tn tnVar2 = tnVar.Z9;
                if (tnVar2 != null) {
                    kmVar = tnVar2.T0;
                } else {
                    kmVar = tnVar.T0;
                }
                km kmVar3 = kmVar;
                float f9 = tnVar.f42998uc.f49505e;
                int i10 = (int) ((1.0f - f9) * 255.0f);
                int i11 = (int) (255.0f * f9);
                if (f9 > 0.0f) {
                    canvas.drawColor(org.telegram.ui.ActionBar.g6.l1(f9 * 0.85f, tnVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6)));
                }
                rg.c.a(new rf(kmVar2, 1), canvas, rectF, tnVar.f42973t0, kmVar3, i10);
                jh.e1 e1Var = tnVar.H3;
                if (e1Var != null) {
                    rg.c.a(e1Var, canvas, rectF, e1Var, kmVar3, i11);
                }
                nh.g1 g1Var = tnVar.f42887m1;
                if (g1Var != null && g1Var.getVisibility() == 0) {
                    int childCount = tnVar.f42887m1.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = tnVar.f42887m1.getChildAt(i12);
                        if ((childAt instanceof vn) && childAt.getVisibility() == 0) {
                            vn vnVar = (vn) childAt;
                            un unVar = vnVar.f43683a;
                            km kmVar4 = unVar.T0;
                            Objects.requireNonNull(kmVar4);
                            rg.c.b(new rf(kmVar4, 0), canvas, rectF, unVar.T0, vnVar);
                        }
                    }
                    return;
                }
                return;
            default:
                long uptimeMillis = SystemClock.uptimeMillis();
                tn tnVar3 = this.f42086b.F0;
                if (tnVar3.f42973t0.Z0()) {
                    tnVar3.f42973t0.e(canvas, rectF);
                    return;
                }
                tnVar3.f42973t0.w1(canvas, rectF);
                for (int i13 = 0; i13 < tnVar3.f42973t0.getChildCount(); i13++) {
                    View childAt2 = tnVar3.f42973t0.getChildAt(i13);
                    if (!tn.d2(tnVar3, childAt2, rectF)) {
                        if (childAt2 instanceof org.telegram.ui.Cells.s1) {
                            canvas.save();
                            canvas.translate(childAt2.getX(), childAt2.getY());
                            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt2;
                            if (s1Var.C1()) {
                                canvas.save();
                                canvas.translate(0.0f, s1Var.R);
                                s1Var.D1(canvas, true, false);
                                canvas.restore();
                            }
                            canvas.restore();
                            tnVar3.f42973t0.drawChild(canvas, childAt2, uptimeMillis);
                            if (s1Var.U2()) {
                                canvas.save();
                                canvas.translate(s1Var.getX(), s1Var.getY());
                                s1Var.X1(canvas);
                                canvas.restore();
                            }
                        } else if (childAt2 instanceof org.telegram.ui.Cells.v0) {
                            tnVar3.f42973t0.drawChild(canvas, childAt2, uptimeMillis);
                            canvas.save();
                            canvas.translate(childAt2.getX(), childAt2.getY());
                            ((org.telegram.ui.Cells.v0) childAt2).A(canvas);
                            canvas.restore();
                        } else {
                            tnVar3.f42973t0.drawChild(canvas, childAt2, uptimeMillis);
                        }
                    }
                }
                tnVar3.f42973t0.x1(canvas, rectF);
                return;
        }
    }

    @Override
    public final void g(g.x xVar, RectF rectF) {
        switch (this.f42085a) {
            case 0:
            default:
                xVar.f6956b = true;
                return;
        }
    }
}
