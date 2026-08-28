package sf;

import android.graphics.Paint;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
public final class a extends f {
    public final b6 f47515q;
    public final Paint f47516r;
    public int f47517s;

    public a(rf.a aVar, b6 b6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f47516r = paint;
        this.f47517s = 0;
        this.f47515q = b6Var;
        Paint paint2 = this.f47548c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f47548c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f47517s = i0.a.d(0.3f, f6.v0(f6.f23001d6, this.f47515q), this.f47556m);
    }
}
