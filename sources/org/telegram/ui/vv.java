package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class vv implements dh.a {
    public final int f44430a;
    public final org.telegram.ui.ActionBar.r2 f44431b;
    public final FrameLayout f44432c;
    public final Object d;

    public vv(org.telegram.ui.ActionBar.r2 r2Var, FrameLayout frameLayout, Object obj, int i10) {
        this.f44430a = i10;
        this.f44431b = r2Var;
        this.f44432c = frameLayout;
        this.d = obj;
    }

    @Override
    public final void b(ch.a aVar, RectF rectF) {
        switch (this.f44430a) {
            case 0:
            default:
                aVar.f6296a = true;
                return;
        }
    }

    @Override
    public final void f(Canvas canvas, RectF rectF) {
        int i10;
        Canvas canvas2;
        RectF rectF2;
        switch (this.f44430a) {
            case 0:
                ey eyVar = (ey) this.f44431b;
                wx wxVar = (wx) this.f44432c;
                PointF pointF = (PointF) this.d;
                mx mxVar = eyVar.C0;
                if (mxVar != null) {
                    i10 = (int) (mxVar.getAlpha() * 255.0f);
                } else {
                    i10 = 0;
                }
                dy[] dyVarArr = eyVar.f38998e0;
                int length = dyVarArr.length;
                int i11 = 0;
                while (i11 < length) {
                    dy dyVar = dyVarArr[i11];
                    if (dyVar != null && dyVar.getVisibility() == 0 && dyVar.getAlpha() > 0.0f) {
                        float d42 = eyVar.d4();
                        if (dyVar.F != null && d42 > 0.0f) {
                            if (jh.k.b(dyVar.f38702a, wxVar, pointF)) {
                                canvas.save();
                                canvas.clipRect(rectF);
                                canvas.translate(pointF.x, pointF.y);
                                dyVar.f38702a.dispatchDraw(canvas);
                                canvas.restore();
                            } else {
                                return;
                            }
                        } else {
                            zx zxVar = dyVar.f38702a;
                            canvas2 = canvas;
                            rectF2 = rectF;
                            ih.d.b(zxVar, canvas2, rectF2, zxVar, wxVar, 255 - i10);
                            i11++;
                            canvas = canvas2;
                            rectF = rectF2;
                        }
                    }
                    canvas2 = canvas;
                    rectF2 = rectF;
                    i11++;
                    canvas = canvas2;
                    rectF = rectF2;
                }
                Canvas canvas3 = canvas;
                RectF rectF3 = rectF;
                mx mxVar2 = eyVar.C0;
                if (mxVar2 != null && mxVar2.getVisibility() == 0 && eyVar.C0.getAlpha() > 0.0f) {
                    mx mxVar3 = eyVar.C0;
                    ih.d.b(mxVar3, canvas3, rectF3, mxVar3, wxVar, i10);
                    return;
                }
                return;
            default:
                y91 y91Var = (y91) this.f44431b;
                e6 e6Var = (e6) this.d;
                x81 x81Var = y91Var.S;
                FrameLayout frameLayout = this.f44432c;
                if (x81Var != null) {
                    ih.d.a(x81Var, canvas, rectF, x81Var, frameLayout);
                }
                dc dcVar = y91Var.f45920i0;
                if (dcVar != null) {
                    org.telegram.ui.Components.nm0 nm0Var = dcVar.F;
                    ih.d.a(nm0Var, canvas, rectF, nm0Var, frameLayout);
                }
                ke keVar = y91Var.f45921j0;
                if (keVar != null && keVar.getParent() == y91Var.f45919h0 && y91Var.f45921j0.getVisibility() == 0) {
                    y91Var.f45921j0.d(canvas, rectF, e6Var);
                    return;
                }
                return;
        }
    }
}
