package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import j$.util.Objects;
public final class xf implements ch.a {
    public final int f43200a;
    public final jm f43201b;

    public xf(jm jmVar, int i10) {
        this.f43200a = i10;
        this.f43201b = jmVar;
    }

    @Override
    public final void e(bh.a aVar, RectF rectF) {
        switch (this.f43200a) {
            case 0:
            default:
                aVar.f4355a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        jm jmVar;
        switch (this.f43200a) {
            case 0:
                jm jmVar2 = this.f43201b;
                qn qnVar = jmVar2.J0;
                qn qnVar2 = qnVar.f40664da;
                if (qnVar2 != null) {
                    jmVar = qnVar2.X0;
                } else {
                    jmVar = qnVar.X0;
                }
                jm jmVar3 = jmVar;
                float f7 = qnVar.zc.e;
                int i10 = (int) ((1.0f - f7) * 255.0f);
                int i11 = (int) (255.0f * f7);
                if (f7 > 0.0f) {
                    canvas.drawColor(org.telegram.ui.ActionBar.h6.m1(f7 * 0.85f, qnVar.getThemedColor(org.telegram.ui.ActionBar.h6.f20989d6)));
                }
                hh.d.b(new xf(jmVar2, 1), canvas, rectF, qnVar.f40903x0, jmVar3, i10);
                ai.u1 u1Var = qnVar.L3;
                if (u1Var != null) {
                    hh.d.b(u1Var, canvas, rectF, u1Var, jmVar3, i11);
                }
                ei.h1 h1Var = qnVar.f40812q1;
                if (h1Var != null && h1Var.getVisibility() == 0) {
                    int childCount = qnVar.f40812q1.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = qnVar.f40812q1.getChildAt(i12);
                        if ((childAt instanceof sn) && childAt.getVisibility() == 0) {
                            sn snVar = (sn) childAt;
                            rn rnVar = snVar.f41491a;
                            jm jmVar4 = rnVar.X0;
                            Objects.requireNonNull(jmVar4);
                            hh.d.a(new xf(jmVar4, 0), canvas, rectF, rnVar.X0, snVar);
                        }
                    }
                    return;
                }
                return;
            default:
                long uptimeMillis = SystemClock.uptimeMillis();
                qn qnVar3 = this.f43201b.J0;
                if (qnVar3.f40903x0.Z0()) {
                    qnVar3.f40903x0.f(canvas, rectF);
                    return;
                }
                qnVar3.f40903x0.x1(canvas, rectF);
                for (int i13 = 0; i13 < qnVar3.f40903x0.getChildCount(); i13++) {
                    View childAt2 = qnVar3.f40903x0.getChildAt(i13);
                    if (!qn.e2(qnVar3, childAt2, rectF)) {
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
                            qnVar3.f40903x0.drawChild(canvas, childAt2, uptimeMillis);
                            if (u1Var2.U2()) {
                                canvas.save();
                                canvas.translate(u1Var2.getX(), u1Var2.getY());
                                u1Var2.X1(canvas);
                                canvas.restore();
                            }
                        } else if (childAt2 instanceof org.telegram.ui.Cells.w0) {
                            qnVar3.f40903x0.drawChild(canvas, childAt2, uptimeMillis);
                            canvas.save();
                            canvas.translate(childAt2.getX(), childAt2.getY());
                            ((org.telegram.ui.Cells.w0) childAt2).B(canvas);
                            canvas.restore();
                        } else {
                            qnVar3.f40903x0.drawChild(canvas, childAt2, uptimeMillis);
                        }
                    }
                }
                qnVar3.f40903x0.y1(canvas, rectF);
                return;
        }
    }
}
