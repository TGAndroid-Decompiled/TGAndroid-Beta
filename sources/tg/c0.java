package tg;

import android.content.Context;
import android.graphics.Paint;
import org.telegram.ui.wp0;
public final class c0 extends d {
    public final Paint h;
    public long f55596n;
    public float f55597r;
    public float f55598s;
    public final wp0 f55599w;

    public c0(wp0 wp0Var, Context context, org.telegram.ui.Components.n nVar) {
        super(context, nVar);
        this.f55599w = wp0Var;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: tg.c0.onDraw(android.graphics.Canvas):void");
    }
}
