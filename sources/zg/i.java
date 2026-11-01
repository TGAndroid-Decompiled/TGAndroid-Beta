package zg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.xn;
public final class i {
    public static final Rect f55777f = new Rect();
    public final hi.c f55778a = new hi.c();
    public final hi.b f55779b = new hi.b();
    public final q5.d f55780c = new q5.d(new zf.g(1));
    public final q5.d d = new q5.d(new zf.g(2));
    public final q5.d e = new q5.d(new zf.g(3));

    public final int a(hi.a aVar) {
        if (aVar instanceof hi.c) {
            return ((hi.c) aVar).f7712b;
        }
        if (aVar instanceof hi.b) {
            return ((Integer) this.d.k(((hi.b) aVar).d)).intValue();
        } else if (aVar instanceof hi.g) {
            return a(((hi.g) aVar).f7725a);
        } else {
            return 0;
        }
    }

    public final int b(hi.a aVar) {
        if (aVar instanceof hi.c) {
            return ((hi.c) aVar).f7712b;
        }
        if (aVar instanceof hi.b) {
            return ((Integer) this.e.k(((hi.b) aVar).d)).intValue();
        } else if (aVar instanceof hi.g) {
            return b(((hi.g) aVar).f7725a);
        } else {
            return 0;
        }
    }

    public final hi.a c(Drawable drawable) {
        boolean z10 = drawable instanceof ColorDrawable;
        hi.c cVar = this.f55778a;
        if (z10) {
            cVar.a(((ColorDrawable) drawable).getColor());
            return cVar;
        }
        boolean z11 = drawable instanceof jb0;
        hi.b bVar = this.f55779b;
        if (z11) {
            jb0 jb0Var = (jb0) drawable;
            if (jb0Var.f27348q < 0) {
                cVar.a(-16777216);
                return cVar;
            }
            bVar.a(jb0Var.f27342k);
            return bVar;
        }
        boolean z12 = drawable instanceof BitmapDrawable;
        q5.d dVar = this.f55780c;
        if (z12) {
            bVar.a((Bitmap) dVar.k(((BitmapDrawable) drawable).getBitmap()));
            return bVar;
        } else if (drawable instanceof xn) {
            return c(((xn) drawable).c(false));
        } else {
            if (drawable != null) {
                bVar.getClass();
                float f7 = 120;
                float f10 = f7 / 1.0f;
                int round = Math.round(f10);
                int round2 = Math.round(f10);
                Bitmap bitmap = bVar.f7709f;
                if (bitmap != null && !bitmap.isRecycled() && bVar.f7709f.getWidth() == round2 && bVar.f7709f.getHeight() == round2) {
                    bVar.f7709f.eraseColor(0);
                } else {
                    bVar.f7709f = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
                }
                Canvas canvas = new Canvas(bVar.f7709f);
                canvas.scale(f7 / round, 160 / round2);
                Rect bounds = drawable.getBounds();
                Rect rect = f55777f;
                rect.set(bounds);
                drawable.setBounds(0, 0, 120, 160);
                drawable.draw(canvas);
                drawable.setBounds(rect);
                bVar.a(bVar.f7709f);
                bVar.f7709f = null;
                bVar.a((Bitmap) dVar.k(bVar.d));
            }
            return bVar;
        }
    }
}
