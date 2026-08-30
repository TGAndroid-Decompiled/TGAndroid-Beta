package xf;

import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
public final class h extends f {
    public final Paint f46962q;
    public int f46963r;
    public final f6 f46964s;

    public h(wf.a aVar, f6 f6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f46962q = paint;
        this.f46963r = 0;
        this.f46964s = f6Var;
        this.f46951c.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        Paint paint2 = this.f46951c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f46951c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f46963r = i0.a.d(0.3f, j6.v0(j6.f19906d6, this.f46964s), this.f46958m);
    }
}
