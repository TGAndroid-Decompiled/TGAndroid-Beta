package tg;

import android.content.Context;
import android.graphics.Paint;
import org.telegram.ui.Cells.b5;
import org.telegram.ui.vp0;
public final class c0 extends d {
    public final Paint h;
    public long f57749n;
    public float f57750r;
    public float f57751s;
    public final vp0 f57752w;

    public c0(vp0 vp0Var, Context context, b5 b5Var) {
        super(context, b5Var);
        this.f57752w = vp0Var;
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
