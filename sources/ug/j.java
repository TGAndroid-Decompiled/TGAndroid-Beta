package ug;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.ao;
import s5.m;
public final class j {
    public static final Rect f45535f = new Rect();
    public final sg.c f45536a = new sg.c();
    public final sg.b f45537b = new sg.b();
    public final m f45538c = new m(new s0.b(14));
    public final m d = new m(new s0.b(15));
    public final m e = new m(new s0.b(16));

    public final int a(sg.a aVar) {
        if (aVar instanceof sg.c) {
            return ((sg.c) aVar).f44309a.getColor();
        }
        if (aVar instanceof sg.b) {
            return ((Integer) this.d.i(((sg.b) aVar).d)).intValue();
        } else if (aVar instanceof sg.e) {
            return a(((sg.e) aVar).f44317a);
        } else {
            return 0;
        }
    }

    public final int b(sg.a aVar) {
        if (aVar instanceof sg.c) {
            return ((sg.c) aVar).f44309a.getColor();
        }
        if (aVar instanceof sg.b) {
            return ((Integer) this.e.i(((sg.b) aVar).d)).intValue();
        } else if (aVar instanceof sg.e) {
            return b(((sg.e) aVar).f44317a);
        } else {
            return 0;
        }
    }

    public final sg.a c(Drawable drawable) {
        boolean z4 = drawable instanceof ColorDrawable;
        sg.c cVar = this.f45536a;
        if (z4) {
            cVar.a(((ColorDrawable) drawable).getColor());
            return cVar;
        }
        boolean z10 = drawable instanceof dc0;
        sg.b bVar = this.f45537b;
        if (z10) {
            dc0 dc0Var = (dc0) drawable;
            if (dc0Var.f24247q < 0) {
                cVar.a(-16777216);
                return cVar;
            }
            bVar.a(dc0Var.f24241k);
            return bVar;
        }
        boolean z11 = drawable instanceof BitmapDrawable;
        m mVar = this.f45538c;
        if (z11) {
            bVar.a((Bitmap) mVar.i(((BitmapDrawable) drawable).getBitmap()));
            return bVar;
        } else if (drawable instanceof ao) {
            return c(((ao) drawable).c(false));
        } else {
            if (drawable != null) {
                bVar.getClass();
                float f10 = 120;
                float f11 = f10 / 1.0f;
                int round = Math.round(f11);
                int round2 = Math.round(f11);
                Bitmap bitmap = bVar.f44307f;
                if (bitmap != null && !bitmap.isRecycled() && bVar.f44307f.getWidth() == round2 && bVar.f44307f.getHeight() == round2) {
                    bVar.f44307f.eraseColor(0);
                } else {
                    bVar.f44307f = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
                }
                Canvas canvas = new Canvas(bVar.f44307f);
                canvas.scale(f10 / round, 160 / round2);
                Rect bounds = drawable.getBounds();
                Rect rect = f45535f;
                rect.set(bounds);
                drawable.setBounds(0, 0, 120, 160);
                drawable.draw(canvas);
                drawable.setBounds(rect);
                bVar.a(bVar.f44307f);
                bVar.f44307f = null;
                bVar.a((Bitmap) mVar.i(bVar.d));
            }
            return bVar;
        }
    }
}
