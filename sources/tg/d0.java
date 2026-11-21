package tg;

import android.content.Context;
import android.graphics.Paint;
import org.telegram.ui.Cells.c5;
import org.telegram.ui.vp0;
public final class d0 extends d {
    public final Paint h;
    public long f57808n;
    public float f57809r;
    public float f57810s;
    public final vp0 f57811w;

    public d0(vp0 vp0Var, Context context, c5 c5Var) {
        super(context, c5Var);
        this.f57811w = vp0Var;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: tg.d0.onDraw(android.graphics.Canvas):void");
    }
}
