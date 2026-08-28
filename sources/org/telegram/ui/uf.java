package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import j$.util.Objects;
public final class uf implements jg.a {
    public final int f43242a;
    public final im f43243b;

    public uf(im imVar, int i9) {
        this.f43242a = i9;
        this.f43243b = imVar;
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        im imVar;
        switch (this.f43242a) {
            case 0:
                im imVar2 = this.f43243b;
                qn qnVar = imVar2.F0;
                qn qnVar2 = qnVar.Z9;
                if (qnVar2 != null) {
                    imVar = qnVar2.T0;
                } else {
                    imVar = qnVar.T0;
                }
                im imVar3 = imVar;
                float f10 = qnVar.f42102uc.f47775e;
                int i9 = (int) ((1.0f - f10) * 255.0f);
                int i10 = (int) (255.0f * f10);
                if (f10 > 0.0f) {
                    canvas.drawColor(org.telegram.ui.ActionBar.f6.l1(f10 * 0.85f, qnVar.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6)));
                }
                og.d.a(new uf(imVar2, 1), canvas, rectF, qnVar.f42077t0, imVar3, i9);
                gh.f1 f1Var = qnVar.H3;
                if (f1Var != null) {
                    og.d.a(f1Var, canvas, rectF, f1Var, imVar3, i10);
                }
                kh.j1 j1Var = qnVar.f41990m1;
                if (j1Var != null && j1Var.getVisibility() == 0) {
                    int childCount = qnVar.f41990m1.getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = qnVar.f41990m1.getChildAt(i11);
                        if ((childAt instanceof sn) && childAt.getVisibility() == 0) {
                            sn snVar = (sn) childAt;
                            rn rnVar = snVar.f42731a;
                            im imVar4 = rnVar.T0;
                            Objects.requireNonNull(imVar4);
                            og.d.b(new uf(imVar4, 0), canvas, rectF, rnVar.T0, snVar);
                        }
                    }
                    return;
                }
                return;
            default:
                long uptimeMillis = SystemClock.uptimeMillis();
                qn qnVar3 = this.f43243b.F0;
                if (qnVar3.f42077t0.Z0()) {
                    qnVar3.f42077t0.e(canvas, rectF);
                    return;
                }
                qnVar3.f42077t0.w1(canvas, rectF);
                for (int i12 = 0; i12 < qnVar3.f42077t0.getChildCount(); i12++) {
                    View childAt2 = qnVar3.f42077t0.getChildAt(i12);
                    if (!qn.d2(qnVar3, childAt2, rectF)) {
                        if (childAt2 instanceof org.telegram.ui.Cells.t1) {
                            canvas.save();
                            canvas.translate(childAt2.getX(), childAt2.getY());
                            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt2;
                            if (t1Var.C1()) {
                                canvas.save();
                                canvas.translate(0.0f, t1Var.R);
                                t1Var.D1(canvas, true, false);
                                canvas.restore();
                            }
                            canvas.restore();
                            qnVar3.f42077t0.drawChild(canvas, childAt2, uptimeMillis);
                            if (t1Var.U2()) {
                                canvas.save();
                                canvas.translate(t1Var.getX(), t1Var.getY());
                                t1Var.X1(canvas);
                                canvas.restore();
                            }
                        } else if (childAt2 instanceof org.telegram.ui.Cells.w0) {
                            qnVar3.f42077t0.drawChild(canvas, childAt2, uptimeMillis);
                            canvas.save();
                            canvas.translate(childAt2.getX(), childAt2.getY());
                            ((org.telegram.ui.Cells.w0) childAt2).z(canvas);
                            canvas.restore();
                        } else {
                            qnVar3.f42077t0.drawChild(canvas, childAt2, uptimeMillis);
                        }
                    }
                }
                qnVar3.f42077t0.x1(canvas, rectF);
                return;
        }
    }

    @Override
    public final void g(g.x xVar, RectF rectF) {
        switch (this.f43242a) {
            case 0:
            default:
                xVar.f7046b = true;
                return;
        }
    }
}
