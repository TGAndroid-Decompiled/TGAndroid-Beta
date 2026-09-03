package xf;

import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
public final class h extends f {
    public final Paint f47058q;
    public int f47059r;
    public final f6 f47060s;

    public h(wf.a aVar, f6 f6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f47058q = paint;
        this.f47059r = 0;
        this.f47060s = f6Var;
        this.f47047c.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        Paint paint2 = this.f47047c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f47047c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f47059r = i0.a.d(0.3f, j6.v0(j6.f19881d6, this.f47060s), this.f47054m);
    }
}
