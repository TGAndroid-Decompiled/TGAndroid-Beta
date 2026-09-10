package pg;

import android.content.Context;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.zt0;
public final class g0 extends d {
    public final Paint h;
    public long f40005n;
    public float f40006r;
    public float f40007s;
    public final zt0 v;

    public g0(zt0 zt0Var, Context context, f0 f0Var) {
        super(context, f0Var);
        this.v = zt0Var;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: pg.g0.onDraw(android.graphics.Canvas):void");
    }
}
