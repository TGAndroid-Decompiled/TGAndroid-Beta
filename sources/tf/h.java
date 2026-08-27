package tf;

import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;

public final class h extends f {

    public final Paint f48209q;

    public int f48210r;

    public final c6 f48211s;

    public h(sf.a aVar, c6 c6Var) {
        super(aVar, false, null);
        Paint paint = new Paint();
        this.f48209q = paint;
        this.f48210r = 0;
        this.f48211s = c6Var;
        this.f48197c.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        Paint paint2 = this.f48197c;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint.setStyle(style);
        this.f48197c.setAntiAlias(false);
    }

    @Override
    public final void a() {
        super.a();
        this.f48210r = i0.b.d(0.3f, g6.v0(g6.f23053d6, this.f48211s), this.f48205m);
    }
}
