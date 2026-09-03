package ug;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.co;
import s5.m;
public final class j {
    public static final Rect f45599f = new Rect();
    public final sg.c f45600a = new sg.c();
    public final sg.b f45601b = new sg.b();
    public final m f45602c = new m(new s0.b(15));
    public final m d = new m(new s0.b(16));
    public final m e = new m(new s0.b(17));

    public final int a(sg.a aVar) {
        if (aVar instanceof sg.c) {
            return ((sg.c) aVar).f44374a.getColor();
        }
        if (aVar instanceof sg.b) {
            return ((Integer) this.d.i(((sg.b) aVar).d)).intValue();
        } else if (aVar instanceof sg.e) {
            return a(((sg.e) aVar).f44382a);
        } else {
            return 0;
        }
    }

    public final int b(sg.a aVar) {
        if (aVar instanceof sg.c) {
            return ((sg.c) aVar).f44374a.getColor();
        }
        if (aVar instanceof sg.b) {
            return ((Integer) this.e.i(((sg.b) aVar).d)).intValue();
        } else if (aVar instanceof sg.e) {
            return b(((sg.e) aVar).f44382a);
        } else {
            return 0;
        }
    }

    public final sg.a c(Drawable drawable) {
        boolean z4 = drawable instanceof ColorDrawable;
        sg.c cVar = this.f45600a;
        if (z4) {
            cVar.a(((ColorDrawable) drawable).getColor());
            return cVar;
        }
        boolean z10 = drawable instanceof ec0;
        sg.b bVar = this.f45601b;
        if (z10) {
            ec0 ec0Var = (ec0) drawable;
            if (ec0Var.f24586q < 0) {
                cVar.a(-16777216);
                return cVar;
            }
            bVar.a(ec0Var.f24580k);
            return bVar;
        }
        boolean z11 = drawable instanceof BitmapDrawable;
        m mVar = this.f45602c;
        if (z11) {
            bVar.a((Bitmap) mVar.i(((BitmapDrawable) drawable).getBitmap()));
            return bVar;
        } else if (drawable instanceof co) {
            return c(((co) drawable).c(false));
        } else {
            if (drawable != null) {
                bVar.getClass();
                float f10 = 120;
                float f11 = f10 / 1.0f;
                int round = Math.round(f11);
                int round2 = Math.round(f11);
                Bitmap bitmap = bVar.f44372f;
                if (bitmap != null && !bitmap.isRecycled() && bVar.f44372f.getWidth() == round2 && bVar.f44372f.getHeight() == round2) {
                    bVar.f44372f.eraseColor(0);
                } else {
                    bVar.f44372f = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
                }
                Canvas canvas = new Canvas(bVar.f44372f);
                canvas.scale(f10 / round, 160 / round2);
                Rect bounds = drawable.getBounds();
                Rect rect = f45599f;
                rect.set(bounds);
                drawable.setBounds(0, 0, 120, 160);
                drawable.draw(canvas);
                drawable.setBounds(rect);
                bVar.a(bVar.f44372f);
                bVar.f44372f = null;
                bVar.a((Bitmap) mVar.i(bVar.d));
            }
            return bVar;
        }
    }
}
