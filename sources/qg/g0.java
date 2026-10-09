package qg;

import android.content.Context;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.bu0;
public final class g0 extends d {
    public final Paint h;
    public long f46251n;
    public float f46252r;
    public float f46253s;
    public final bu0 v;

    public g0(bu0 bu0Var, Context context, f0 f0Var) {
        super(context, f0Var);
        this.v = bu0Var;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: qg.g0.onDraw(android.graphics.Canvas):void");
    }
}
