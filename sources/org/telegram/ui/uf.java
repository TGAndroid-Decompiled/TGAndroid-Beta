package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import j$.util.Objects;

public final class uf implements kg.a {

    public final int f43211a;

    public final jm f43212b;

    public uf(jm jmVar, int i10) {
        this.f43211a = i10;
        this.f43212b = jmVar;
    }

    @Override
    public final void e(Canvas canvas, RectF rectF) {
        switch (this.f43211a) {
            case 0:
                jm jmVar = this.f43212b;
                rn rnVar = jmVar.F0;
                rn rnVar2 = rnVar.Z9;
                jm jmVar2 = rnVar2 != null ? rnVar2.T0 : rnVar.T0;
                float f10 = rnVar.f42238uc.f48497e;
                int i10 = (int) ((1.0f - f10) * 255.0f);
                int i11 = (int) (255.0f * f10);
                if (f10 > 0.0f) {
                    canvas.drawColor(org.telegram.ui.ActionBar.g6.l1(f10 * 0.85f, rnVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6)));
                }
                pg.c.a(new uf(jmVar, 1), canvas, rectF, rnVar.f42213t0, jmVar2, i10);
                hh.f1 f1Var = rnVar.H3;
                if (f1Var != null) {
                    pg.c.a(f1Var, canvas, rectF, f1Var, jmVar2, i11);
                }
                lh.h1 h1Var = rnVar.f42126m1;
                if (h1Var != null && h1Var.getVisibility() == 0) {
                    int childCount = rnVar.f42126m1.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = rnVar.f42126m1.getChildAt(i12);
                        if ((childAt instanceof tn) && childAt.getVisibility() == 0) {
                            tn tnVar = (tn) childAt;
                            sn snVar = tnVar.f42977a;
                            jm jmVar3 = snVar.T0;
                            Objects.requireNonNull(jmVar3);
                            pg.c.b(new uf(jmVar3, 0), canvas, rectF, snVar.T0, tnVar);
                        }
                    }
                    break;
                }
                break;
            default:
                long jUptimeMillis = SystemClock.uptimeMillis();
                rn rnVar3 = this.f43212b.F0;
                if (rnVar3.f42213t0.Z0()) {
                    rnVar3.f42213t0.e(canvas, rectF);
                } else {
                    rnVar3.f42213t0.w1(canvas, rectF);
                    for (int i13 = 0; i13 < rnVar3.f42213t0.getChildCount(); i13++) {
                        View childAt2 = rnVar3.f42213t0.getChildAt(i13);
                        if (!rn.d2(rnVar3, childAt2, rectF)) {
                            if (childAt2 instanceof org.telegram.ui.Cells.s1) {
                                canvas.save();
                                canvas.translate(childAt2.getX(), childAt2.getY());
                                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt2;
                                if (s1Var.B1()) {
                                    canvas.save();
                                    canvas.translate(0.0f, s1Var.R);
                                    s1Var.C1(canvas, true, false);
                                    canvas.restore();
                                }
                                canvas.restore();
                                rnVar3.f42213t0.drawChild(canvas, childAt2, jUptimeMillis);
                                if (s1Var.T2()) {
                                    canvas.save();
                                    canvas.translate(s1Var.getX(), s1Var.getY());
                                    s1Var.W1(canvas);
                                    canvas.restore();
                                }
                            } else if (childAt2 instanceof org.telegram.ui.Cells.v0) {
                                rnVar3.f42213t0.drawChild(canvas, childAt2, jUptimeMillis);
                                canvas.save();
                                canvas.translate(childAt2.getX(), childAt2.getY());
                                ((org.telegram.ui.Cells.v0) childAt2).B(canvas);
                                canvas.restore();
                            } else {
                                rnVar3.f42213t0.drawChild(canvas, childAt2, jUptimeMillis);
                            }
                        }
                    }
                    rnVar3.f42213t0.x1(canvas, rectF);
                }
                break;
        }
    }

    @Override
    public final void g(g.y yVar, RectF rectF) {
        switch (this.f43211a) {
        }
        yVar.f6327b = true;
    }
}
