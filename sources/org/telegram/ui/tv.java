package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.widget.FrameLayout;
public final class tv implements dh.a {
    public final int f43915a;
    public final org.telegram.ui.ActionBar.r2 f43916b;
    public final FrameLayout f43917c;
    public final Object d;

    public tv(org.telegram.ui.ActionBar.r2 r2Var, FrameLayout frameLayout, Object obj, int i10) {
        this.f43915a = i10;
        this.f43916b = r2Var;
        this.f43917c = frameLayout;
        this.d = obj;
    }

    @Override
    public final void b(ch.a aVar, RectF rectF) {
        switch (this.f43915a) {
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
        switch (this.f43915a) {
            case 0:
                cy cyVar = (cy) this.f43916b;
                tx txVar = (tx) this.f43917c;
                PointF pointF = (PointF) this.d;
                jx jxVar = cyVar.C0;
                if (jxVar != null) {
                    i10 = (int) (jxVar.getAlpha() * 255.0f);
                } else {
                    i10 = 0;
                }
                ay[] ayVarArr = cyVar.f38583e0;
                int length = ayVarArr.length;
                int i11 = 0;
                while (i11 < length) {
                    ay ayVar = ayVarArr[i11];
                    if (ayVar != null && ayVar.getVisibility() == 0 && ayVar.getAlpha() > 0.0f) {
                        float d42 = cyVar.d4();
                        if (ayVar.F != null && d42 > 0.0f) {
                            if (jh.k.b(ayVar.f37910a, txVar, pointF)) {
                                canvas.save();
                                canvas.clipRect(rectF);
                                canvas.translate(pointF.x, pointF.y);
                                ayVar.f37910a.dispatchDraw(canvas);
                                canvas.restore();
                            } else {
                                return;
                            }
                        } else {
                            wx wxVar = ayVar.f37910a;
                            canvas2 = canvas;
                            rectF2 = rectF;
                            ih.d.b(wxVar, canvas2, rectF2, wxVar, txVar, 255 - i10);
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
                jx jxVar2 = cyVar.C0;
                if (jxVar2 != null && jxVar2.getVisibility() == 0 && cyVar.C0.getAlpha() > 0.0f) {
                    jx jxVar3 = cyVar.C0;
                    ih.d.b(jxVar3, canvas3, rectF3, jxVar3, txVar, i10);
                    return;
                }
                return;
            default:
                w91 w91Var = (w91) this.f43916b;
                e6 e6Var = (e6) this.d;
                v81 v81Var = w91Var.S;
                FrameLayout frameLayout = this.f43917c;
                if (v81Var != null) {
                    ih.d.a(v81Var, canvas, rectF, v81Var, frameLayout);
                }
                dc dcVar = w91Var.f45029i0;
                if (dcVar != null) {
                    org.telegram.ui.Components.mm0 mm0Var = dcVar.F;
                    ih.d.a(mm0Var, canvas, rectF, mm0Var, frameLayout);
                }
                ke keVar = w91Var.f45030j0;
                if (keVar != null && keVar.getParent() == w91Var.f45028h0 && w91Var.f45030j0.getVisibility() == 0) {
                    w91Var.f45030j0.d(canvas, rectF, e6Var);
                    return;
                }
                return;
        }
    }
}
