package tf;

import android.graphics.Paint;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;

public final class a extends f {

    public final c6 f48164q;

    public final Paint f48165r;

    public int f48166s;

    public a(sf.a aVar, c6 c6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f48165r = paint;
        this.f48166s = 0;
        this.f48164q = c6Var;
        Paint paint2 = this.f48197c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f48197c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f48166s = i0.b.d(0.3f, g6.v0(g6.f23053d6, this.f48164q), this.f48205m);
    }
}
