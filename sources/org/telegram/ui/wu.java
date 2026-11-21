package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class wu implements eh.a {
    public final int f53525a;
    public final org.telegram.ui.ActionBar.g2 f53526b;
    public final FrameLayout f53527c;
    public final Object d;

    public wu(org.telegram.ui.ActionBar.g2 g2Var, FrameLayout frameLayout, Object obj, int i7) {
        this.f53525a = i7;
        this.f53526b = g2Var;
        this.f53527c = frameLayout;
        this.d = obj;
    }

    @Override
    public final void c(dh.a aVar, RectF rectF) {
        switch (this.f53525a) {
            case 0:
            default:
                aVar.f8398a = true;
                return;
        }
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        int i7;
        Canvas canvas2;
        RectF rectF2;
        switch (this.f53525a) {
            case 0:
                cx cxVar = (cx) this.f53526b;
                vw vwVar = (vw) this.f53527c;
                PointF pointF = (PointF) this.d;
                kw kwVar = cxVar.D0;
                if (kwVar != null) {
                    i7 = (int) (kwVar.getAlpha() * 255.0f);
                } else {
                    i7 = 0;
                }
                bx[] bxVarArr = cxVar.f46719f0;
                int length = bxVarArr.length;
                int i10 = 0;
                while (i10 < length) {
                    bx bxVar = bxVarArr[i10];
                    if (bxVar != null && bxVar.getVisibility() == 0 && bxVar.getAlpha() > 0.0f) {
                        float i42 = cxVar.i4();
                        if (bxVar.G != null && i42 > 0.0f) {
                            if (jh.k.b(bxVar.f46321a, vwVar, pointF)) {
                                canvas.save();
                                canvas.clipRect(rectF);
                                canvas.translate(pointF.x, pointF.y);
                                bxVar.f46321a.dispatchDraw(canvas);
                                canvas.restore();
                            } else {
                                return;
                            }
                        } else {
                            yw ywVar = bxVar.f46321a;
                            canvas2 = canvas;
                            rectF2 = rectF;
                            ih.d.b(ywVar, canvas2, rectF2, ywVar, vwVar, 255 - i7);
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
                kw kwVar2 = cxVar.D0;
                if (kwVar2 != null && kwVar2.getVisibility() == 0 && cxVar.D0.getAlpha() > 0.0f) {
                    kw kwVar3 = cxVar.D0;
                    ih.d.b(kwVar3, canvas3, rectF3, kwVar3, vwVar, i7);
                    return;
                }
                return;
            default:
                c51 c51Var = (c51) this.f53526b;
                z5 z5Var = (z5) this.d;
                c41 c41Var = c51Var.T;
                FrameLayout frameLayout = this.f53527c;
                if (c41Var != null) {
                    ih.d.a(c41Var, canvas, rectF, c41Var, frameLayout);
                }
                sb sbVar = c51Var.f46442j0;
                if (sbVar != null) {
                    org.telegram.ui.Components.ek0 ek0Var = sbVar.G;
                    ih.d.a(ek0Var, canvas, rectF, ek0Var, frameLayout);
                }
                xd xdVar = c51Var.f46443k0;
                if (xdVar != null && xdVar.getParent() == c51Var.f46441i0 && c51Var.f46443k0.getVisibility() == 0) {
                    c51Var.f46443k0.d(canvas, rectF, z5Var);
                    return;
                }
                return;
        }
    }
}
