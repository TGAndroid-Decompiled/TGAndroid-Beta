package vf;

import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
public final class h extends f {
    public final Paint f49586q;
    public int f49587r;
    public final c6 f49588s;

    public h(uf.a aVar, c6 c6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f49586q = paint;
        this.f49587r = 0;
        this.f49588s = c6Var;
        this.f49574c.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        Paint paint2 = this.f49574c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f49574c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f49587r = i0.a.d(0.3f, g6.v0(g6.f23062d6, this.f49588s), this.f49582m);
    }
}
