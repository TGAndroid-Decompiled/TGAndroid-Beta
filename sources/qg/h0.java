package qg;

import android.content.Context;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.st0;
public final class h0 extends d {
    public final Paint h;
    public long f41651n;
    public float f41652r;
    public float f41653s;
    public final st0 v;

    public h0(st0 st0Var, Context context, g0 g0Var) {
        super(context, g0Var);
        this.v = st0Var;
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
