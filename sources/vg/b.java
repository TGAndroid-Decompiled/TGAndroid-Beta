package vg;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import org.telegram.ui.ActionBar.t6;
import w7.k8;
public final class b extends k8 {
    public final Paint f50817a = new Paint(1);
    public final Paint f50818b;
    public final f f50819c;

    public b(f fVar) {
        this.f50819c = fVar;
        Paint paint = new Paint(1);
        this.f50818b = paint;
        paint.setColor(0);
    }

    @Override
    public final void b(Canvas canvas, hi.a aVar) {
        boolean z10;
        f fVar = this.f50819c;
        e eVar = fVar.M;
        int i10 = fVar.f6649c;
        if (i10 != 0) {
            int r12 = t6.r1(i10 / 255.0f, fVar.f50846s);
            if (Color.alpha(fVar.f50845r) > 0 && i10 == 255) {
                float f7 = fVar.R;
                if (f7 > 0.0f) {
                    float f10 = fVar.P;
                    float f11 = fVar.Q;
                    int r13 = t6.r1(f7, fVar.f50845r);
                    Paint paint = this.f50818b;
                    paint.setShadowLayer(f10, 0.0f, f11, r13);
                    eVar.c(canvas, paint, fVar.O);
                }
            }
            Rect rect = eVar.f50839m;
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
            canvas.clipPath(eVar.f50837k);
            canvas.translate(rect.left, rect.top);
            canvas.translate(-f14, -f17);
            aVar.e(canvas, f14, f17, f19, f21);
            canvas.restore();
            if (Color.alpha(r12) > 0) {
                Paint paint2 = this.f50817a;
                paint2.setColor(r12);
                eVar.b(canvas, paint2);
            }
            if (z11) {
                canvas.restore();
            }
        }
    }
}
