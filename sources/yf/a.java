package yf;

import android.graphics.Paint;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
public final class a extends f {
    public final g6 f50891q;
    public final Paint f50892r;
    public int f50893s;

    public a(xf.a aVar, g6 g6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f50892r = paint;
        this.f50893s = 0;
        this.f50891q = g6Var;
        Paint paint2 = this.f50924c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f50924c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f50893s = i0.a.d(0.3f, k6.v0(k6.f21659d6, this.f50891q), this.f50932m);
    }
}
