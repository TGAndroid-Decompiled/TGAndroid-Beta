package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class wu implements eh.a {
    public final int f51480a;
    public final org.telegram.ui.ActionBar.f2 f51481b;
    public final FrameLayout f51482c;
    public final Object d;

    public wu(org.telegram.ui.ActionBar.f2 f2Var, FrameLayout frameLayout, Object obj, int i7) {
        this.f51480a = i7;
        this.f51481b = f2Var;
        this.f51482c = frameLayout;
        this.d = obj;
    }

    @Override
    public final void c(dh.a aVar, RectF rectF) {
        switch (this.f51480a) {
            case 0:
            default:
                aVar.f8698a = true;
                return;
        }
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        int i7;
        Canvas canvas2;
        RectF rectF2;
        switch (this.f51480a) {
            case 0:
                yw ywVar = (yw) this.f51481b;
                rw rwVar = (rw) this.f51482c;
                PointF pointF = (PointF) this.d;
                hw hwVar = ywVar.C0;
                if (hwVar != null) {
                    i7 = (int) (hwVar.getAlpha() * 255.0f);
                } else {
                    i7 = 0;
                }
                xw[] xwVarArr = ywVar.f52231e0;
                int length = xwVarArr.length;
                int i10 = 0;
                while (i10 < length) {
                    xw xwVar = xwVarArr[i10];
                    if (xwVar != null && xwVar.getVisibility() == 0 && xwVar.getAlpha() > 0.0f) {
                        float h42 = ywVar.h4();
                        if (xwVar.F != null && h42 > 0.0f) {
                            if (jh.k.b(xwVar.f51772a, rwVar, pointF)) {
                                canvas.save();
                                canvas.clipRect(rectF);
                                canvas.translate(pointF.x, pointF.y);
                                xwVar.f51772a.dispatchDraw(canvas);
                                canvas.restore();
                            } else {
                                return;
                            }
                        } else {
                            uw uwVar = xwVar.f51772a;
                            canvas2 = canvas;
                            rectF2 = rectF;
                            ih.d.b(uwVar, canvas2, rectF2, uwVar, rwVar, 255 - i7);
                            i10++;
                            canvas = canvas2;
                            rectF = rectF2;
                        }
                    }
                    canvas2 = canvas;
                    rectF2 = rectF;
                    i10++;
                    canvas = canvas2;
                    rectF = rectF2;
                }
                Canvas canvas3 = canvas;
                RectF rectF3 = rectF;
                hw hwVar2 = ywVar.C0;
                if (hwVar2 != null && hwVar2.getVisibility() == 0 && ywVar.C0.getAlpha() > 0.0f) {
                    hw hwVar3 = ywVar.C0;
                    ih.d.b(hwVar3, canvas3, rectF3, hwVar3, rwVar, i7);
                    return;
                }
                return;
            default:
                d51 d51Var = (d51) this.f51481b;
                z5 z5Var = (z5) this.d;
                c41 c41Var = d51Var.S;
                FrameLayout frameLayout = this.f51482c;
                if (c41Var != null) {
                    ih.d.a(c41Var, canvas, rectF, c41Var, frameLayout);
                }
                tb tbVar = d51Var.f44838i0;
                if (tbVar != null) {
                    org.telegram.ui.Components.qj0 qj0Var = tbVar.F;
                    ih.d.a(qj0Var, canvas, rectF, qj0Var, frameLayout);
                }
                zd zdVar = d51Var.f44839j0;
                if (zdVar != null && zdVar.getParent() == d51Var.f44837h0 && d51Var.f44839j0.getVisibility() == 0) {
                    d51Var.f44839j0.d(canvas, rectF, z5Var);
                    return;
                }
                return;
        }
    }
}
