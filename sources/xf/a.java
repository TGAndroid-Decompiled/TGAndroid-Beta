package xf;

import android.graphics.Paint;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
public final class a extends f {
    public final f6 f46922q;
    public final Paint f46923r;
    public int f46924s;

    public a(wf.a aVar, f6 f6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f46923r = paint;
        this.f46924s = 0;
        this.f46922q = f6Var;
        Paint paint2 = this.f46951c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f46951c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f46924s = i0.a.d(0.3f, j6.v0(j6.f19906d6, this.f46922q), this.f46958m);
    }
}
