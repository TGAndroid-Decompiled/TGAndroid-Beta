package vg;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import org.telegram.ui.ActionBar.t6;
import w7.k8;
public final class b extends k8 {
    public final Paint f50831a = new Paint(1);
    public final Paint f50832b;
    public final f f50833c;

    public b(f fVar) {
        this.f50833c = fVar;
        Paint paint = new Paint(1);
        this.f50832b = paint;
        paint.setColor(0);
    }

    @Override
    public final void b(Canvas canvas, hi.a aVar) {
        boolean z10;
        f fVar = this.f50833c;
        e eVar = fVar.P;
        int i10 = fVar.f6650c;
        if (i10 != 0) {
            int r12 = t6.r1(i10 / 255.0f, fVar.f50867y);
            if (Color.alpha(fVar.f50866x) > 0 && i10 == 255) {
                float f7 = fVar.U;
                if (f7 > 0.0f) {
                    float f10 = fVar.S;
                    float f11 = fVar.T;
                    int r13 = t6.r1(f7, fVar.f50866x);
                    Paint paint = this.f50832b;
                    paint.setShadowLayer(f10, 0.0f, f11, r13);
                    eVar.c(canvas, paint, fVar.R);
                }
            }
            Rect rect = eVar.f50854m;
            float f12 = rect.left;
            float f13 = fVar.d;
            float f14 = f12 + f13;
            float f15 = rect.top;
            float f16 = fVar.e;
            float f17 = f15 + f16;
            float f18 = rect.right;
            float f19 = f18 + f13;
            float f20 = rect.bottom;
            float f21 = f20 + f16;
            if (i10 != 255) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = z10;
            if (z11) {
                canvas.saveLayerAlpha(f12, f15, f18, f20, i10);
            }
            canvas.save();
            canvas.clipPath(eVar.f50852k);
            canvas.translate(rect.left, rect.top);
            canvas.translate(-f14, -f17);
            aVar.e(canvas, f14, f17, f19, f21);
            canvas.restore();
            if (Color.alpha(r12) > 0) {
                Paint paint2 = this.f50831a;
                paint2.setColor(r12);
                eVar.b(canvas, paint2);
            }
            if (z11) {
                canvas.restore();
            }
        }
    }
}
