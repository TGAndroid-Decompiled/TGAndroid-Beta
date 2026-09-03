package xf;

import android.graphics.Paint;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
public final class a extends f {
    public final f6 f47018q;
    public final Paint f47019r;
    public int f47020s;

    public a(wf.a aVar, f6 f6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f47019r = paint;
        this.f47020s = 0;
        this.f47018q = f6Var;
        Paint paint2 = this.f47047c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f47047c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f47020s = i0.a.d(0.3f, j6.v0(j6.f19881d6, this.f47018q), this.f47054m);
    }
}
