package vf;

import android.graphics.Paint;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
public final class a extends f {
    public final c6 f49541q;
    public final Paint f49542r;
    public int f49543s;

    public a(uf.a aVar, c6 c6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f49542r = paint;
        this.f49543s = 0;
        this.f49541q = c6Var;
        Paint paint2 = this.f49574c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f49574c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f49543s = i0.a.d(0.3f, g6.v0(g6.f23062d6, this.f49541q), this.f49582m);
    }
}
