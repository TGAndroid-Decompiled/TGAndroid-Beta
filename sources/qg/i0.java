package qg;

import android.content.Context;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.cu0;
public final class i0 extends d {
    public final Paint h;
    public long f41414n;
    public float f41415r;
    public float f41416s;
    public final cu0 v;

    public i0(cu0 cu0Var, Context context, h0 h0Var) {
        super(context, h0Var);
        this.v = cu0Var;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: qg.i0.onDraw(android.graphics.Canvas):void");
    }
}
