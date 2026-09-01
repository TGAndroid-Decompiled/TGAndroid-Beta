package yf;

import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
public final class h extends f {
    public final Paint f50936q;
    public int f50937r;
    public final g6 f50938s;

    public h(xf.a aVar, g6 g6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f50936q = paint;
        this.f50937r = 0;
        this.f50938s = g6Var;
        this.f50924c.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        Paint paint2 = this.f50924c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f50924c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f50937r = i0.a.d(0.3f, k6.v0(k6.f21659d6, this.f50938s), this.f50932m);
    }
}
