package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class vu implements eh.a {
    public final int f52296a;
    public final org.telegram.ui.ActionBar.e2 f52297b;
    public final FrameLayout f52298c;
    public final Object d;

    public vu(org.telegram.ui.ActionBar.e2 e2Var, FrameLayout frameLayout, Object obj, int i7) {
        this.f52296a = i7;
        this.f52297b = e2Var;
        this.f52298c = frameLayout;
        this.d = obj;
    }

    @Override
    public final void c(dh.a aVar, RectF rectF) {
        switch (this.f52296a) {
            case 0:
            default:
                aVar.f8090a = true;
                return;
        }
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        int i7;
        Canvas canvas2;
        RectF rectF2;
        switch (this.f52296a) {
            case 0:
                yw ywVar = (yw) this.f52297b;
                rw rwVar = (rw) this.f52298c;
                PointF pointF = (PointF) this.d;
                hw hwVar = ywVar.D0;
                if (hwVar != null) {
                    i7 = (int) (hwVar.getAlpha() * 255.0f);
                } else {
                    i7 = 0;
                }
                xw[] xwVarArr = ywVar.f53638f0;
                int length = xwVarArr.length;
                int i10 = 0;
                while (i10 < length) {
                    xw xwVar = xwVarArr[i10];
                    if (xwVar != null && xwVar.getVisibility() == 0 && xwVar.getAlpha() > 0.0f) {
                        float h42 = ywVar.h4();
                        if (xwVar.G != null && h42 > 0.0f) {
                            if (jh.k.b(xwVar.f53335a, rwVar, pointF)) {
                                canvas.save();
                                canvas.clipRect(rectF);
                                canvas.translate(pointF.x, pointF.y);
                                xwVar.f53335a.dispatchDraw(canvas);
                                canvas.restore();
                            } else {
                                return;
                            }
                        } else {
                            uw uwVar = xwVar.f53335a;
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
                hw hwVar2 = ywVar.D0;
                if (hwVar2 != null && hwVar2.getVisibility() == 0 && ywVar.D0.getAlpha() > 0.0f) {
                    hw hwVar3 = ywVar.D0;
                    ih.d.b(hwVar3, canvas3, rectF3, hwVar3, rwVar, i7);
                    return;
                }
                return;
            default:
                z41 z41Var = (z41) this.f52297b;
                a6 a6Var = (a6) this.d;
                z31 z31Var = z41Var.T;
                FrameLayout frameLayout = this.f52298c;
                if (z31Var != null) {
                    ih.d.a(z31Var, canvas, rectF, z31Var, frameLayout);
                }
                sb sbVar = z41Var.f53821j0;
                if (sbVar != null) {
                    org.telegram.ui.Components.uj0 uj0Var = sbVar.G;
                    ih.d.a(uj0Var, canvas, rectF, uj0Var, frameLayout);
                }
                xd xdVar = z41Var.f53822k0;
                if (xdVar != null && xdVar.getParent() == z41Var.f53820i0 && z41Var.f53822k0.getVisibility() == 0) {
                    z41Var.f53822k0.d(canvas, rectF, a6Var);
                    return;
                }
                return;
        }
    }
}
