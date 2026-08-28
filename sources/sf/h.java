package sf;

import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
public final class h extends f {
    public final Paint f47560q;
    public int f47561r;
    public final b6 f47562s;

    public h(rf.a aVar, b6 b6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f47560q = paint;
        this.f47561r = 0;
        this.f47562s = b6Var;
        this.f47548c.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        Paint paint2 = this.f47548c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f47548c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f47561r = i0.a.d(0.3f, f6.v0(f6.f23001d6, this.f47562s), this.f47556m);
    }
}
