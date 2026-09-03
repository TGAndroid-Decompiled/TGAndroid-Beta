package yf;

import android.graphics.Paint;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
public final class a extends f {
    public final g6 f50927q;
    public final Paint f50928r;
    public int f50929s;

    public a(xf.a aVar, g6 g6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f50928r = paint;
        this.f50929s = 0;
        this.f50927q = g6Var;
        Paint paint2 = this.f50960c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f50960c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f50929s = i0.a.d(0.3f, k6.v0(k6.f21661d6, this.f50927q), this.f50968m);
    }
}
