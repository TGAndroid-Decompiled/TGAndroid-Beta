package tg;

import android.content.Context;
import android.graphics.Paint;
import org.telegram.ui.Components.cf;
import org.telegram.ui.tp0;
public final class c0 extends d {
    public final Paint h;
    public long f57177n;
    public float f57178r;
    public float f57179s;
    public final tp0 f57180w;

    public c0(tp0 tp0Var, Context context, cf cfVar) {
        super(context, cfVar);
        this.f57180w = tp0Var;
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
