package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class xv implements ug.a {
    public final int f43460a;
    public final org.telegram.ui.ActionBar.k2 f43461b;
    public final FrameLayout f43462c;
    public final Object d;

    public xv(org.telegram.ui.ActionBar.k2 k2Var, FrameLayout frameLayout, Object obj, int i10) {
        this.f43460a = i10;
        this.f43461b = k2Var;
        this.f43462c = frameLayout;
        this.d = obj;
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        int i10;
        Canvas canvas2;
        RectF rectF2;
        switch (this.f43460a) {
            case 0:
                zx zxVar = (zx) this.f43461b;
                sx sxVar = (sx) this.f43462c;
                PointF pointF = (PointF) this.d;
                jx jxVar = zxVar.C0;
                if (jxVar != null) {
                    i10 = (int) (jxVar.getAlpha() * 255.0f);
                } else {
                    i10 = 0;
                }
                yx[] yxVarArr = zxVar.f44137e0;
                int length = yxVarArr.length;
                int i11 = 0;
                while (i11 < length) {
                    yx yxVar = yxVarArr[i11];
                    if (yxVar != null && yxVar.getVisibility() == 0 && yxVar.getAlpha() > 0.0f) {
                        float h42 = zxVar.h4();
                        if (yxVar.F != null && h42 > 0.0f) {
                            if (zg.h.b(yxVar.f43733a, sxVar, pointF)) {
                                canvas.save();
                                canvas.clipRect(rectF);
                                canvas.translate(pointF.x, pointF.y);
                                yxVar.f43733a.dispatchDraw(canvas);
                                canvas.restore();
                            } else {
                                return;
                            }
                        } else {
                            vx vxVar = yxVar.f43733a;
                            canvas2 = canvas;
                            rectF2 = rectF;
                            yg.d.b(vxVar, canvas2, rectF2, vxVar, sxVar, 255 - i10);
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
                jx jxVar2 = zxVar.C0;
                if (jxVar2 != null && jxVar2.getVisibility() == 0 && zxVar.C0.getAlpha() > 0.0f) {
                    jx jxVar3 = zxVar.C0;
                    yg.d.b(jxVar3, canvas3, rectF3, jxVar3, sxVar, i10);
                    return;
                }
                return;
            default:
                s61 s61Var = (s61) this.f43461b;
                z5 z5Var = (z5) this.d;
                s51 s51Var = s61Var.S;
                FrameLayout frameLayout = this.f43462c;
                if (s51Var != null) {
                    yg.d.a(s51Var, canvas, rectF, s51Var, frameLayout);
                }
                zb zbVar = s61Var.f41248i0;
                if (zbVar != null) {
                    org.telegram.ui.Components.uk0 uk0Var = zbVar.F;
                    yg.d.a(uk0Var, canvas, rectF, uk0Var, frameLayout);
                }
                le leVar = s61Var.f41249j0;
                if (leVar != null && leVar.getParent() == s61Var.f41247h0 && s61Var.f41249j0.getVisibility() == 0) {
                    s61Var.f41249j0.d(canvas, rectF, z5Var);
                    return;
                }
                return;
        }
    }

    @Override
    public final void g(g.y yVar, RectF rectF) {
        switch (this.f43460a) {
            case 0:
            default:
                yVar.f7259b = true;
                return;
        }
    }
}
