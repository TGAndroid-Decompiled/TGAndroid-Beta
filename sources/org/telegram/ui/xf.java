package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import j$.util.Objects;
public final class xf implements ch.a {
    public final int f43589a;
    public final km f43590b;

    public xf(km kmVar, int i10) {
        this.f43589a = i10;
        this.f43590b = kmVar;
    }

    @Override
    public final void e(bh.a aVar, RectF rectF) {
        switch (this.f43589a) {
            case 0:
            default:
                aVar.f4360a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        km kmVar;
        switch (this.f43589a) {
            case 0:
                km kmVar2 = this.f43590b;
                sn snVar = kmVar2.J0;
                sn snVar2 = snVar.f41642pa;
                if (snVar2 != null) {
                    kmVar = snVar2.f41561j1;
                } else {
                    kmVar = snVar.f41561j1;
                }
                km kmVar3 = kmVar;
                float f7 = snVar.Mc.e;
                int i10 = (int) ((1.0f - f7) * 255.0f);
                int i11 = (int) (255.0f * f7);
                if (f7 > 0.0f) {
                    canvas.drawColor(org.telegram.ui.ActionBar.k6.o1(f7 * 0.85f, snVar.getThemedColor(org.telegram.ui.ActionBar.k6.f21183d6)));
                }
                hh.d.b(new xf(kmVar2, 1), canvas, rectF, snVar.f41737x0, kmVar3, i10);
                ai.u1 u1Var = snVar.X3;
                if (u1Var != null) {
                    hh.d.b(u1Var, canvas, rectF, u1Var, kmVar3, i11);
                }
                ei.h1 h1Var = snVar.C1;
                if (h1Var != null && h1Var.getVisibility() == 0) {
                    int childCount = snVar.C1.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = snVar.C1.getChildAt(i12);
                        if ((childAt instanceof un) && childAt.getVisibility() == 0) {
                            un unVar = (un) childAt;
                            tn tnVar = unVar.f42477a;
                            km kmVar4 = tnVar.f41561j1;
                            Objects.requireNonNull(kmVar4);
                            hh.d.a(new xf(kmVar4, 0), canvas, rectF, tnVar.f41561j1, unVar);
                        }
                    }
                    return;
                }
                return;
            default:
                long uptimeMillis = SystemClock.uptimeMillis();
                sn snVar3 = this.f43590b.J0;
                if (snVar3.f41737x0.a1()) {
                    snVar3.f41737x0.f(canvas, rectF);
                    return;
                }
                snVar3.f41737x0.C1(canvas, rectF);
                for (int i13 = 0; i13 < snVar3.f41737x0.getChildCount(); i13++) {
                    View childAt2 = snVar3.f41737x0.getChildAt(i13);
                    if (!sn.e2(snVar3, childAt2, rectF)) {
                        if (childAt2 instanceof org.telegram.ui.Cells.t1) {
                            canvas.save();
                            canvas.translate(childAt2.getX(), childAt2.getY());
                            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt2;
                            if (t1Var.B1()) {
                                canvas.save();
                                canvas.translate(0.0f, t1Var.V);
                                t1Var.C1(canvas, true, false);
                                canvas.restore();
                            }
                            canvas.restore();
                            snVar3.f41737x0.drawChild(canvas, childAt2, uptimeMillis);
                            if (t1Var.T2()) {
                                canvas.save();
                                canvas.translate(t1Var.getX(), t1Var.getY());
                                t1Var.W1(canvas);
                                canvas.restore();
                            }
                        } else if (childAt2 instanceof org.telegram.ui.Cells.v0) {
                            snVar3.f41737x0.drawChild(canvas, childAt2, uptimeMillis);
                            canvas.save();
                            canvas.translate(childAt2.getX(), childAt2.getY());
                            ((org.telegram.ui.Cells.v0) childAt2).A(canvas);
                            canvas.restore();
                        } else {
                            snVar3.f41737x0.drawChild(canvas, childAt2, uptimeMillis);
                        }
                    }
                }
                snVar3.f41737x0.D1(canvas, rectF);
                return;
        }
    }
}
