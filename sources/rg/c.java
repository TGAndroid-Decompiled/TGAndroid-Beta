package rg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.s5;
import sg.i;
public abstract class c {
    public static final Matrix f47423a = new Matrix();
    public static final RectF f47424b = new RectF();
    public static final RectF f47425c = new RectF();

    public static void a(mg.a aVar, Canvas canvas, RectF rectF, View view, ViewGroup viewGroup, int i10) {
        boolean z10;
        if (i10 > 0) {
            RectF rectF2 = f47425c;
            if (i.c(view, viewGroup, rectF2)) {
                float f9 = rectF2.left;
                float f10 = rectF2.top;
                RectF rectF3 = f47424b;
                rectF3.set(rectF);
                rectF3.offset(-f9, -f10);
                boolean z11 = true;
                if (f9 == 0.0f && f10 == 0.0f) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (i10 == 255) {
                    z11 = false;
                }
                if (z10) {
                    canvas.save();
                    canvas.translate(f9, f10);
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
    }

    public static void b(mg.a aVar, Canvas canvas, RectF rectF, View view, FrameLayout frameLayout) {
        a(aVar, canvas, rectF, view, frameLayout, 255);
    }

    public static void c(qg.b bVar, View view) {
        Bitmap bitmap;
        if (bVar != null && view != null && view.getWidth() != 0 && view.getHeight() != 0 && (bitmap = bVar.d) != null && !bitmap.isRecycled() && bitmap.getWidth() != 0 && bitmap.getHeight() != 0) {
            Matrix matrix = f47423a;
            matrix.reset();
            matrix.setScale(view.getWidth() / bitmap.getWidth(), view.getHeight() / bitmap.getHeight());
            bVar.f46662b.set(matrix);
        }
    }

    public static s5 d(ng.d dVar, int i10, int i11) {
        return new s5(i10, i11, dVar);
    }
}
