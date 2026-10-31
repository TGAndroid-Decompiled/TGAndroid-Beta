package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class yv implements ug.a {
    public final int f43894a;
    public final org.telegram.ui.ActionBar.k2 f43895b;
    public final FrameLayout f43896c;
    public final Object d;

    public yv(org.telegram.ui.ActionBar.k2 k2Var, FrameLayout frameLayout, Object obj, int i10) {
        this.f43894a = i10;
        this.f43895b = k2Var;
        this.f43896c = frameLayout;
        this.d = obj;
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        int i10;
        Canvas canvas2;
        RectF rectF2;
        switch (this.f43894a) {
            case 0:
                ay ayVar = (ay) this.f43895b;
                tx txVar = (tx) this.f43896c;
                PointF pointF = (PointF) this.d;
                kx kxVar = ayVar.C0;
                if (kxVar != null) {
                    i10 = (int) (kxVar.getAlpha() * 255.0f);
                } else {
                    i10 = 0;
                }
                zx[] zxVarArr = ayVar.f35794e0;
                int length = zxVarArr.length;
                int i11 = 0;
                while (i11 < length) {
                    zx zxVar = zxVarArr[i11];
                    if (zxVar != null && zxVar.getVisibility() == 0 && zxVar.getAlpha() > 0.0f) {
                        float g42 = ayVar.g4();
                        if (zxVar.F != null && g42 > 0.0f) {
                            if (zg.h.b(zxVar.f44239a, txVar, pointF)) {
                                canvas.save();
                                canvas.clipRect(rectF);
                                canvas.translate(pointF.x, pointF.y);
                                zxVar.f44239a.dispatchDraw(canvas);
                                canvas.restore();
                            } else {
                                return;
                            }
                        } else {
                            wx wxVar = zxVar.f44239a;
                            canvas2 = canvas;
                            rectF2 = rectF;
                            yg.d.b(wxVar, canvas2, rectF2, wxVar, txVar, 255 - i10);
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
                kx kxVar2 = ayVar.C0;
                if (kxVar2 != null && kxVar2.getVisibility() == 0 && ayVar.C0.getAlpha() > 0.0f) {
                    kx kxVar3 = ayVar.C0;
                    yg.d.b(kxVar3, canvas3, rectF3, kxVar3, txVar, i10);
                    return;
                }
                return;
            default:
                u61 u61Var = (u61) this.f43895b;
                z5 z5Var = (z5) this.d;
                u51 u51Var = u61Var.S;
                FrameLayout frameLayout = this.f43896c;
                if (u51Var != null) {
                    yg.d.a(u51Var, canvas, rectF, u51Var, frameLayout);
                }
                zb zbVar = u61Var.f42035i0;
                if (zbVar != null) {
                    org.telegram.ui.Components.tk0 tk0Var = zbVar.F;
                    yg.d.a(tk0Var, canvas, rectF, tk0Var, frameLayout);
                }
                le leVar = u61Var.f42036j0;
                if (leVar != null && leVar.getParent() == u61Var.f42034h0 && u61Var.f42036j0.getVisibility() == 0) {
                    u61Var.f42036j0.d(canvas, rectF, z5Var);
                    return;
                }
                return;
        }
    }

    @Override
    public final void g(g.y yVar, RectF rectF) {
        switch (this.f43894a) {
            case 0:
            default:
                yVar.f7258b = true;
                return;
        }
    }
}
