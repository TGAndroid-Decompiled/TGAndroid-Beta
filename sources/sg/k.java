package sg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import l3.g0;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.wn;
public final class k {
    public static final Rect f48069f = new Rect();
    public final qg.c f48070a = new qg.c();
    public final qg.b f48071b = new qg.b();
    public final g0 f48072c = new g0(new r.a(29));
    public final g0 d = new g0(new j(0));
    public final g0 f48073e = new g0(new j(1));

    public final int a(qg.a aVar) {
        if (aVar instanceof qg.c) {
            return ((qg.c) aVar).f46667a.getColor();
        }
        if (aVar instanceof qg.b) {
            return ((Integer) this.d.o(((qg.b) aVar).d)).intValue();
        } else if (aVar instanceof qg.e) {
            return a(((qg.e) aVar).f46676a);
        } else {
            return 0;
        }
    }

    public final int b(qg.a aVar) {
        if (aVar instanceof qg.c) {
            return ((qg.c) aVar).f46667a.getColor();
        }
        if (aVar instanceof qg.b) {
            return ((Integer) this.f48073e.o(((qg.b) aVar).d)).intValue();
        } else if (aVar instanceof qg.e) {
            return b(((qg.e) aVar).f46676a);
        } else {
            return 0;
        }
    }

    public final qg.a c(Drawable drawable) {
        boolean z10 = drawable instanceof ColorDrawable;
        qg.c cVar = this.f48070a;
        if (z10) {
            cVar.a(((ColorDrawable) drawable).getColor());
            return cVar;
        }
        boolean z11 = drawable instanceof yb0;
        qg.b bVar = this.f48071b;
        if (z11) {
            yb0 yb0Var = (yb0) drawable;
            if (yb0Var.f35032q < 0) {
                cVar.a(-16777216);
                return cVar;
            }
            bVar.a(yb0Var.f35026k);
            return bVar;
        }
        boolean z12 = drawable instanceof BitmapDrawable;
        g0 g0Var = this.f48072c;
        if (z12) {
            bVar.a((Bitmap) g0Var.o(((BitmapDrawable) drawable).getBitmap()));
            return bVar;
        } else if (drawable instanceof wn) {
            return c(((wn) drawable).c(false));
        } else {
            if (drawable != null) {
                bVar.getClass();
                float f9 = 120;
                float f10 = f9 / 1.0f;
                int round = Math.round(f10);
                int round2 = Math.round(f10);
                Bitmap bitmap = bVar.f46665f;
                if (bitmap != null && !bitmap.isRecycled() && bVar.f46665f.getWidth() == round2 && bVar.f46665f.getHeight() == round2) {
                    bVar.f46665f.eraseColor(0);
                } else {
                    bVar.f46665f = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
                }
                Canvas canvas = new Canvas(bVar.f46665f);
                canvas.scale(f9 / round, 160 / round2);
                Rect bounds = drawable.getBounds();
                Rect rect = f48069f;
                rect.set(bounds);
                drawable.setBounds(0, 0, 120, 160);
                drawable.draw(canvas);
                drawable.setBounds(rect);
                bVar.a(bVar.f46665f);
                bVar.f46665f = null;
                bVar.a((Bitmap) g0Var.o(bVar.d));
            }
            return bVar;
        }
    }
}
