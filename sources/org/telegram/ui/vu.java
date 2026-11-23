package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class vu implements eh.a {
    public final int f53030a;
    public final org.telegram.ui.ActionBar.g2 f53031b;
    public final FrameLayout f53032c;
    public final Object d;

    public vu(org.telegram.ui.ActionBar.g2 g2Var, FrameLayout frameLayout, Object obj, int i7) {
        this.f53030a = i7;
        this.f53031b = g2Var;
        this.f53032c = frameLayout;
        this.d = obj;
    }

    @Override
    public final void c(dh.a aVar, RectF rectF) {
        switch (this.f53030a) {
            case 0:
            default:
                aVar.f8363a = true;
                return;
        }
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        int i7;
        Canvas canvas2;
        RectF rectF2;
        switch (this.f53030a) {
            case 0:
                bx bxVar = (bx) this.f53031b;
                uw uwVar = (uw) this.f53032c;
                PointF pointF = (PointF) this.d;
                jw jwVar = bxVar.D0;
                if (jwVar != null) {
                    i7 = (int) (jwVar.getAlpha() * 255.0f);
                } else {
                    i7 = 0;
                }
                ax[] axVarArr = bxVar.f46549f0;
                int length = axVarArr.length;
                int i10 = 0;
                while (i10 < length) {
                    ax axVar = axVarArr[i10];
                    if (axVar != null && axVar.getVisibility() == 0 && axVar.getAlpha() > 0.0f) {
                        float i42 = bxVar.i4();
                        if (axVar.G != null && i42 > 0.0f) {
                            if (jh.k.b(axVar.f45822a, uwVar, pointF)) {
                                canvas.save();
                                canvas.clipRect(rectF);
                                canvas.translate(pointF.x, pointF.y);
                                axVar.f45822a.dispatchDraw(canvas);
                                canvas.restore();
                            } else {
                                return;
                            }
                        } else {
                            xw xwVar = axVar.f45822a;
                            canvas2 = canvas;
                            rectF2 = rectF;
                            ih.d.b(xwVar, canvas2, rectF2, xwVar, uwVar, 255 - i7);
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
                jw jwVar2 = bxVar.D0;
                if (jwVar2 != null && jwVar2.getVisibility() == 0 && bxVar.D0.getAlpha() > 0.0f) {
                    jw jwVar3 = bxVar.D0;
                    ih.d.b(jwVar3, canvas3, rectF3, jwVar3, uwVar, i7);
                    return;
                }
                return;
            default:
                b51 b51Var = (b51) this.f53031b;
                a6 a6Var = (a6) this.d;
                b41 b41Var = b51Var.T;
                FrameLayout frameLayout = this.f53032c;
                if (b41Var != null) {
                    ih.d.a(b41Var, canvas, rectF, b41Var, frameLayout);
                }
                sb sbVar = b51Var.f45938j0;
                if (sbVar != null) {
                    org.telegram.ui.Components.ek0 ek0Var = sbVar.G;
                    ih.d.a(ek0Var, canvas, rectF, ek0Var, frameLayout);
                }
                xd xdVar = b51Var.f45939k0;
                if (xdVar != null && xdVar.getParent() == b51Var.f45937i0 && b51Var.f45939k0.getVisibility() == 0) {
                    b51Var.f45939k0.d(canvas, rectF, a6Var);
                    return;
                }
                return;
        }
    }
}
