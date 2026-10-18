package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import j$.util.Objects;
public final class zf implements ch.a {
    public final int f43760a;
    public final lm f43761b;

    public zf(lm lmVar, int i10) {
        this.f43760a = i10;
        this.f43761b = lmVar;
    }

    @Override
    public final void e(bh.a aVar, RectF rectF) {
        switch (this.f43760a) {
            case 0:
            default:
                aVar.f4357a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        lm lmVar;
        switch (this.f43760a) {
            case 0:
                lm lmVar2 = this.f43761b;
                sn snVar = lmVar2.J0;
                sn snVar2 = snVar.f41215da;
                if (snVar2 != null) {
                    lmVar = snVar2.X0;
                } else {
                    lmVar = snVar.X0;
                }
                lm lmVar3 = lmVar;
                float f7 = snVar.yc.e;
                int i10 = (int) ((1.0f - f7) * 255.0f);
                int i11 = (int) (255.0f * f7);
                if (f7 > 0.0f) {
                    canvas.drawColor(org.telegram.ui.ActionBar.h6.m1(f7 * 0.85f, snVar.getThemedColor(org.telegram.ui.ActionBar.h6.f20993d6)));
                }
                hh.d.b(new zf(lmVar2, 1), canvas, rectF, snVar.f41454x0, lmVar3, i10);
                ai.u1 u1Var = snVar.L3;
                if (u1Var != null) {
                    hh.d.b(u1Var, canvas, rectF, u1Var, lmVar3, i11);
                }
                ei.h1 h1Var = snVar.f41363q1;
                if (h1Var != null && h1Var.getVisibility() == 0) {
                    int childCount = snVar.f41363q1.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = snVar.f41363q1.getChildAt(i12);
                        if ((childAt instanceof un) && childAt.getVisibility() == 0) {
                            un unVar = (un) childAt;
                            tn tnVar = unVar.f42031a;
                            lm lmVar4 = tnVar.X0;
                            Objects.requireNonNull(lmVar4);
                            hh.d.a(new zf(lmVar4, 0), canvas, rectF, tnVar.X0, unVar);
                        }
                    }
                    return;
                }
                return;
            default:
                long uptimeMillis = SystemClock.uptimeMillis();
                sn snVar3 = this.f43761b.J0;
                if (snVar3.f41454x0.Z0()) {
                    snVar3.f41454x0.f(canvas, rectF);
                    return;
                }
                snVar3.f41454x0.x1(canvas, rectF);
                for (int i13 = 0; i13 < snVar3.f41454x0.getChildCount(); i13++) {
                    View childAt2 = snVar3.f41454x0.getChildAt(i13);
                    if (!sn.e2(snVar3, childAt2, rectF)) {
                        if (childAt2 instanceof org.telegram.ui.Cells.u1) {
                            canvas.save();
                            canvas.translate(childAt2.getX(), childAt2.getY());
                            org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) childAt2;
                            if (u1Var2.C1()) {
                                canvas.save();
                                canvas.translate(0.0f, u1Var2.V);
                                u1Var2.D1(canvas, true, false);
                                canvas.restore();
                            }
                            canvas.restore();
                            snVar3.f41454x0.drawChild(canvas, childAt2, uptimeMillis);
                            if (u1Var2.U2()) {
                                canvas.save();
                                canvas.translate(u1Var2.getX(), u1Var2.getY());
                                u1Var2.X1(canvas);
                                canvas.restore();
                            }
                        } else if (childAt2 instanceof org.telegram.ui.Cells.w0) {
                            snVar3.f41454x0.drawChild(canvas, childAt2, uptimeMillis);
                            canvas.save();
                            canvas.translate(childAt2.getX(), childAt2.getY());
                            ((org.telegram.ui.Cells.w0) childAt2).B(canvas);
                            canvas.restore();
                        } else {
                            snVar3.f41454x0.drawChild(canvas, childAt2, uptimeMillis);
                        }
                    }
                }
                snVar3.f41454x0.y1(canvas, rectF);
                return;
        }
    }
}
