package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class xu implements eh.a {
    public final int f51821a;
    public final org.telegram.ui.ActionBar.f2 f51822b;
    public final FrameLayout f51823c;
    public final Object d;

    public xu(org.telegram.ui.ActionBar.f2 f2Var, FrameLayout frameLayout, Object obj, int i7) {
        this.f51821a = i7;
        this.f51822b = f2Var;
        this.f51823c = frameLayout;
        this.d = obj;
    }

    @Override
    public final void c(dh.a aVar, RectF rectF) {
        switch (this.f51821a) {
            case 0:
            default:
                aVar.f8703a = true;
                return;
        }
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        int i7;
        Canvas canvas2;
        RectF rectF2;
        switch (this.f51821a) {
            case 0:
                zw zwVar = (zw) this.f51822b;
                sw swVar = (sw) this.f51823c;
                PointF pointF = (PointF) this.d;
                iw iwVar = zwVar.C0;
                if (iwVar != null) {
                    i7 = (int) (iwVar.getAlpha() * 255.0f);
                } else {
                    i7 = 0;
                }
                yw[] ywVarArr = zwVar.f52577e0;
                int length = ywVarArr.length;
                int i10 = 0;
                while (i10 < length) {
                    yw ywVar = ywVarArr[i10];
                    if (ywVar != null && ywVar.getVisibility() == 0 && ywVar.getAlpha() > 0.0f) {
                        float h42 = zwVar.h4();
                        if (ywVar.F != null && h42 > 0.0f) {
                            if (jh.k.b(ywVar.f52125a, swVar, pointF)) {
                                canvas.save();
                                canvas.clipRect(rectF);
                                canvas.translate(pointF.x, pointF.y);
                                ywVar.f52125a.dispatchDraw(canvas);
                                canvas.restore();
                            } else {
                                return;
                            }
                        } else {
                            vw vwVar = ywVar.f52125a;
                            canvas2 = canvas;
                            rectF2 = rectF;
                            ih.d.b(vwVar, canvas2, rectF2, vwVar, swVar, 255 - i7);
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
                iw iwVar2 = zwVar.C0;
                if (iwVar2 != null && iwVar2.getVisibility() == 0 && zwVar.C0.getAlpha() > 0.0f) {
                    iw iwVar3 = zwVar.C0;
                    ih.d.b(iwVar3, canvas3, rectF3, iwVar3, swVar, i7);
                    return;
                }
                return;
            default:
                e51 e51Var = (e51) this.f51822b;
                z5 z5Var = (z5) this.d;
                d41 d41Var = e51Var.S;
                FrameLayout frameLayout = this.f51823c;
                if (d41Var != null) {
                    ih.d.a(d41Var, canvas, rectF, d41Var, frameLayout);
                }
                tb tbVar = e51Var.f45151i0;
                if (tbVar != null) {
                    org.telegram.ui.Components.pj0 pj0Var = tbVar.F;
                    ih.d.a(pj0Var, canvas, rectF, pj0Var, frameLayout);
                }
                zd zdVar = e51Var.f45152j0;
                if (zdVar != null && zdVar.getParent() == e51Var.f45150h0 && e51Var.f45152j0.getVisibility() == 0) {
                    e51Var.f45152j0.d(canvas, rectF, z5Var);
                    return;
                }
                return;
        }
    }
}
