package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import j$.util.Objects;
public final class yf implements pg.a {
    public final int f43618a;
    public final pm f43619b;

    public yf(pm pmVar, int i10) {
        this.f43618a = i10;
        this.f43619b = pmVar;
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        pm pmVar;
        switch (this.f43618a) {
            case 0:
                pm pmVar2 = this.f43619b;
                xn xnVar = pmVar2.G0;
                xn xnVar2 = xnVar.f43122aa;
                if (xnVar2 != null) {
                    pmVar = xnVar2.U0;
                } else {
                    pmVar = xnVar.U0;
                }
                pm pmVar3 = pmVar;
                float f10 = xnVar.f43387vc.f50505e;
                int i10 = (int) ((1.0f - f10) * 255.0f);
                int i11 = (int) (255.0f * f10);
                if (f10 > 0.0f) {
                    canvas.drawColor(org.telegram.ui.ActionBar.k6.l1(f10 * 0.85f, xnVar.getThemedColor(org.telegram.ui.ActionBar.k6.f21659d6)));
                }
                ug.c.a(new yf(pmVar2, 1), canvas, rectF, xnVar.f43362u0, pmVar3, i10);
                mh.d1 d1Var = xnVar.I3;
                if (d1Var != null) {
                    ug.c.a(d1Var, canvas, rectF, d1Var, pmVar3, i11);
                }
                ek ekVar = xnVar.f43278n1;
                if (ekVar != null && ekVar.getVisibility() == 0) {
                    int childCount = xnVar.f43278n1.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = xnVar.f43278n1.getChildAt(i12);
                        if ((childAt instanceof zn) && childAt.getVisibility() == 0) {
                            zn znVar = (zn) childAt;
                            yn ynVar = znVar.f43958a;
                            pm pmVar4 = ynVar.U0;
                            Objects.requireNonNull(pmVar4);
                            ug.c.b(new yf(pmVar4, 0), canvas, rectF, ynVar.U0, znVar);
                        }
                    }
                    return;
                }
                return;
            default:
                long uptimeMillis = SystemClock.uptimeMillis();
                xn xnVar3 = this.f43619b.G0;
                if (xnVar3.f43362u0.Z0()) {
                    xnVar3.f43362u0.e(canvas, rectF);
                    return;
                }
                xnVar3.f43362u0.w1(canvas, rectF);
                for (int i13 = 0; i13 < xnVar3.f43362u0.getChildCount(); i13++) {
                    View childAt2 = xnVar3.f43362u0.getChildAt(i13);
                    if (!xn.d2(xnVar3, childAt2, rectF)) {
                        if (childAt2 instanceof org.telegram.ui.Cells.t1) {
                            canvas.save();
                            canvas.translate(childAt2.getX(), childAt2.getY());
                            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt2;
                            if (t1Var.C1()) {
                                canvas.save();
                                canvas.translate(0.0f, t1Var.S);
                                t1Var.D1(canvas, true, false);
                                canvas.restore();
                            }
                            canvas.restore();
                            xnVar3.f43362u0.drawChild(canvas, childAt2, uptimeMillis);
                            if (t1Var.U2()) {
                                canvas.save();
                                canvas.translate(t1Var.getX(), t1Var.getY());
                                t1Var.X1(canvas);
                                canvas.restore();
                            }
                        } else if (childAt2 instanceof org.telegram.ui.Cells.v0) {
                            xnVar3.f43362u0.drawChild(canvas, childAt2, uptimeMillis);
                            canvas.save();
                            canvas.translate(childAt2.getX(), childAt2.getY());
                            ((org.telegram.ui.Cells.v0) childAt2).A(canvas);
                            canvas.restore();
                        } else {
                            xnVar3.f43362u0.drawChild(canvas, childAt2, uptimeMillis);
                        }
                    }
                }
                xnVar3.f43362u0.x1(canvas, rectF);
                return;
        }
    }

    @Override
    public final void g(g.x xVar, RectF rectF) {
        switch (this.f43618a) {
            case 0:
            default:
                xVar.f6800b = true;
                return;
        }
    }
}
