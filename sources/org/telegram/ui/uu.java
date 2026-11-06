package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class uu implements eh.a {
    public final int f50494a;
    public final org.telegram.ui.ActionBar.f2 f50495b;
    public final FrameLayout f50496c;
    public final Object d;

    public uu(org.telegram.ui.ActionBar.f2 f2Var, FrameLayout frameLayout, Object obj, int i7) {
        this.f50494a = i7;
        this.f50495b = f2Var;
        this.f50496c = frameLayout;
        this.d = obj;
    }

    @Override
    public final void c(dh.a aVar, RectF rectF) {
        switch (this.f50494a) {
            case 0:
            default:
                aVar.f8700a = true;
                return;
        }
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        int i7;
        Canvas canvas2;
        RectF rectF2;
        switch (this.f50494a) {
            case 0:
                ww wwVar = (ww) this.f50495b;
                pw pwVar = (pw) this.f50496c;
                PointF pointF = (PointF) this.d;
                fw fwVar = wwVar.C0;
                if (fwVar != null) {
                    i7 = (int) (fwVar.getAlpha() * 255.0f);
                } else {
                    i7 = 0;
                }
                vw[] vwVarArr = wwVar.f51534e0;
                int length = vwVarArr.length;
                int i10 = 0;
                while (i10 < length) {
                    vw vwVar = vwVarArr[i10];
                    if (vwVar != null && vwVar.getVisibility() == 0 && vwVar.getAlpha() > 0.0f) {
                        float h42 = wwVar.h4();
                        if (vwVar.F != null && h42 > 0.0f) {
                            if (jh.k.b(vwVar.f50833a, pwVar, pointF)) {
                                canvas.save();
                                canvas.clipRect(rectF);
                                canvas.translate(pointF.x, pointF.y);
                                vwVar.f50833a.dispatchDraw(canvas);
                                canvas.restore();
                            } else {
                                return;
                            }
                        } else {
                            sw swVar = vwVar.f50833a;
                            canvas2 = canvas;
                            rectF2 = rectF;
                            ih.d.b(swVar, canvas2, rectF2, swVar, pwVar, 255 - i7);
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
                fw fwVar2 = wwVar.C0;
                if (fwVar2 != null && fwVar2.getVisibility() == 0 && wwVar.C0.getAlpha() > 0.0f) {
                    fw fwVar3 = wwVar.C0;
                    ih.d.b(fwVar3, canvas3, rectF3, fwVar3, pwVar, i7);
                    return;
                }
                return;
            default:
                c51 c51Var = (c51) this.f50495b;
                z5 z5Var = (z5) this.d;
                b41 b41Var = c51Var.S;
                FrameLayout frameLayout = this.f50496c;
                if (b41Var != null) {
                    ih.d.a(b41Var, canvas, rectF, b41Var, frameLayout);
                }
                tb tbVar = c51Var.f44656i0;
                if (tbVar != null) {
                    org.telegram.ui.Components.pj0 pj0Var = tbVar.F;
                    ih.d.a(pj0Var, canvas, rectF, pj0Var, frameLayout);
                }
                zd zdVar = c51Var.f44657j0;
                if (zdVar != null && zdVar.getParent() == c51Var.f44655h0 && c51Var.f44657j0.getVisibility() == 0) {
                    c51Var.f44657j0.d(canvas, rectF, z5Var);
                    return;
                }
                return;
        }
    }
}
