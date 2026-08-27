package pg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.s5;
import qg.j;

public abstract class c {

    public static final Matrix f46019a = new Matrix();

    public static final RectF f46020b = new RectF();

    public static final RectF f46021c = new RectF();

    public static void a(kg.a aVar, Canvas canvas, RectF rectF, View view, ViewGroup viewGroup, int i10) {
        if (i10 <= 0) {
            return;
        }
        RectF rectF2 = f46021c;
        if (j.c(view, viewGroup, rectF2)) {
            float f10 = rectF2.left;
            float f11 = rectF2.top;
            RectF rectF3 = f46020b;
            rectF3.set(rectF);
            rectF3.offset(-f10, -f11);
            boolean z10 = (f10 == 0.0f && f11 == 0.0f) ? false : true;
            boolean z11 = i10 != 255;
            if (z10) {
                canvas.save();
                canvas.translate(f10, f11);
            }
            if (z11) {
                canvas.saveLayerAlpha(rectF3, i10);
            }
            aVar.e(canvas, rectF3);
            if (z11) {
                canvas.restore();
            }
            if (z10) {
                canvas.restore();
            }
        }
    }

    public static void b(kg.a aVar, Canvas canvas, RectF rectF, View view, FrameLayout frameLayout) {
        a(aVar, canvas, rectF, view, frameLayout, 255);
    }

    public static void c(og.b bVar, View view) {
        Bitmap bitmap;
        if (bVar == null || view == null || view.getWidth() == 0 || view.getHeight() == 0 || (bitmap = bVar.d) == null || bitmap.isRecycled() || bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
            return;
        }
        Matrix matrix = f46019a;
        matrix.reset();
        matrix.setScale(view.getWidth() / bitmap.getWidth(), view.getHeight() / bitmap.getHeight());
        bVar.f19444b.set(matrix);
    }

    public static s5 d(lg.d dVar, int i10, int i11) {
        return new s5(i10, i11, dVar);
    }
}
