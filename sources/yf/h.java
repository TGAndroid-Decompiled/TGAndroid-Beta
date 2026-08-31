package yf;

import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
public final class h extends f {
    public final Paint f50935q;
    public int f50936r;
    public final g6 f50937s;

    public h(xf.a aVar, g6 g6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f50935q = paint;
        this.f50936r = 0;
        this.f50937s = g6Var;
        this.f50923c.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        Paint paint2 = this.f50923c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f50923c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f50936r = i0.a.d(0.3f, k6.v0(k6.f21659d6, this.f50937s), this.f50931m);
    }
}
