package vg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.ao;
import s5.m;
public final class j {
    public static final Rect f49304f = new Rect();
    public final tg.c f49305a = new tg.c();
    public final tg.b f49306b = new tg.b();
    public final m f49307c = new m(new sg.a(20));
    public final m d = new m(new sg.a(21));
    public final m f49308e = new m(new sg.a(22));

    public final int a(tg.a aVar) {
        if (aVar instanceof tg.c) {
            return ((tg.c) aVar).f48086a.getColor();
        }
        if (aVar instanceof tg.b) {
            return ((Integer) this.d.i(((tg.b) aVar).d)).intValue();
        } else if (aVar instanceof tg.e) {
            return a(((tg.e) aVar).f48095a);
        } else {
            return 0;
        }
    }

    public final int b(tg.a aVar) {
        if (aVar instanceof tg.c) {
            return ((tg.c) aVar).f48086a.getColor();
        }
        if (aVar instanceof tg.b) {
            return ((Integer) this.f49308e.i(((tg.b) aVar).d)).intValue();
        } else if (aVar instanceof tg.e) {
            return b(((tg.e) aVar).f48095a);
        } else {
            return 0;
        }
    }

    public final tg.a c(Drawable drawable) {
        boolean z4 = drawable instanceof ColorDrawable;
        tg.c cVar = this.f49305a;
        if (z4) {
            cVar.a(((ColorDrawable) drawable).getColor());
            return cVar;
        }
        boolean z10 = drawable instanceof fc0;
        tg.b bVar = this.f49306b;
        if (z10) {
            fc0 fc0Var = (fc0) drawable;
            if (fc0Var.f26885q < 0) {
                cVar.a(-16777216);
                return cVar;
            }
            bVar.a(fc0Var.f26879k);
            return bVar;
        }
        boolean z11 = drawable instanceof BitmapDrawable;
        m mVar = this.f49307c;
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
                Bitmap bitmap = bVar.f48084f;
                if (bitmap != null && !bitmap.isRecycled() && bVar.f48084f.getWidth() == round2 && bVar.f48084f.getHeight() == round2) {
                    bVar.f48084f.eraseColor(0);
                } else {
                    bVar.f48084f = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
                }
                Canvas canvas = new Canvas(bVar.f48084f);
                canvas.scale(f10 / round, 160 / round2);
                Rect bounds = drawable.getBounds();
                Rect rect = f49304f;
                rect.set(bounds);
                drawable.setBounds(0, 0, 120, 160);
                drawable.draw(canvas);
                drawable.setBounds(rect);
                bVar.a(bVar.f48084f);
                bVar.f48084f = null;
                bVar.a((Bitmap) mVar.i(bVar.d));
            }
            return bVar;
        }
    }
}
