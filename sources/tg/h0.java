package tg;

import android.content.Context;
import android.graphics.Paint;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.vp0;
public final class h0 extends h {
    public final Paint h;
    public long f57943n;
    public float f57944r;
    public float f57945s;
    public final vp0 f57946w;

    public h0(vp0 vp0Var, Context context, nd0 nd0Var) {
        super(context, nd0Var);
        this.f57946w = vp0Var;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: tg.h0.onDraw(android.graphics.Canvas):void");
    }
}
