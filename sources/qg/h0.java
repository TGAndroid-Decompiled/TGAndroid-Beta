package qg;

import android.content.Context;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.au0;
public final class h0 extends d {
    public final Paint h;
    public long f41686n;
    public float f41687r;
    public float f41688s;
    public final au0 v;

    public h0(au0 au0Var, Context context, g0 g0Var) {
        super(context, g0Var);
        this.v = au0Var;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: qg.h0.onDraw(android.graphics.Canvas):void");
    }
}
