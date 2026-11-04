package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class ru implements fh.a {
    public final int f49288a;
    public final org.telegram.ui.ActionBar.d2 f49289b;
    public final FrameLayout f49290c;
    public final Object d;

    public ru(org.telegram.ui.ActionBar.d2 d2Var, FrameLayout frameLayout, Object obj, int i3) {
        this.f49288a = i3;
        this.f49289b = d2Var;
        this.f49290c = frameLayout;
        this.d = obj;
    }

    @Override
    public final void b(eh.a aVar, RectF rectF) {
        switch (this.f49288a) {
            case 0:
            default:
                aVar.f9978a = true;
                return;
        }
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        int i3;
        Canvas canvas2;
        RectF rectF2;
        switch (this.f49288a) {
            case 0:
                uw uwVar = (uw) this.f49289b;
                mw mwVar = (mw) this.f49290c;
                PointF pointF = (PointF) this.d;
                cw cwVar = uwVar.D0;
                if (cwVar != null) {
                    i3 = (int) (cwVar.getAlpha() * 255.0f);
                } else {
                    i3 = 0;
                }
                tw[] twVarArr = uwVar.f50230f0;
                int length = twVarArr.length;
                int i10 = 0;
                while (i10 < length) {
                    tw twVar = twVarArr[i10];
                    if (twVar != null && twVar.getVisibility() == 0 && twVar.getAlpha() > 0.0f) {
                        float h42 = uwVar.h4();
                        if (twVar.G != null && h42 > 0.0f) {
                            if (kh.k.b(twVar.f49897a, mwVar, pointF)) {
                                canvas.save();
                                canvas.clipRect(rectF);
                                canvas.translate(pointF.x, pointF.y);
                                twVar.f49897a.dispatchDraw(canvas);
                                canvas.restore();
                            } else {
                                return;
                            }
                        } else {
                            pw pwVar = twVar.f49897a;
                            canvas2 = canvas;
                            rectF2 = rectF;
                            jh.d.b(pwVar, canvas2, rectF2, pwVar, mwVar, 255 - i3);
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
                cw cwVar2 = uwVar.D0;
                if (cwVar2 != null && cwVar2.getVisibility() == 0 && uwVar.D0.getAlpha() > 0.0f) {
                    cw cwVar3 = uwVar.D0;
                    jh.d.b(cwVar3, canvas3, rectF3, cwVar3, mwVar, i3);
                    return;
                }
                return;
            default:
                r41 r41Var = (r41) this.f49289b;
                b6 b6Var = (b6) this.d;
                r31 r31Var = r41Var.T;
                FrameLayout frameLayout = this.f49290c;
                if (r31Var != null) {
                    jh.d.a(r31Var, canvas, rectF, r31Var, frameLayout);
                }
                rb rbVar = r41Var.f49077j0;
                if (rbVar != null) {
                    org.telegram.ui.Components.tj0 tj0Var = rbVar.G;
                    jh.d.a(tj0Var, canvas, rectF, tj0Var, frameLayout);
                }
                xd xdVar = r41Var.f49078k0;
                if (xdVar != null && xdVar.getParent() == r41Var.f49076i0 && r41Var.f49078k0.getVisibility() == 0) {
                    r41Var.f49078k0.d(canvas, rectF, b6Var);
                    return;
                }
                return;
        }
    }
}
