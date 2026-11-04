package ug;

import android.content.Context;
import android.graphics.Paint;
import org.telegram.ui.Components.nh;
import org.telegram.ui.lp0;
public final class b0 extends d {
    public final Paint h;
    public long f55882n;
    public float f55883r;
    public float f55884s;
    public final lp0 f55885w;

    public b0(lp0 lp0Var, Context context, nh nhVar) {
        super(context, nhVar);
        this.f55885w = lp0Var;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: ug.b0.onDraw(android.graphics.Canvas):void");
    }
}
