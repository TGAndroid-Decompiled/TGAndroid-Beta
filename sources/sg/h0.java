package sg;

import android.content.Context;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.nt0;
public final class h0 extends d {
    public final Paint h;
    public long f48225n;
    public float f48226r;
    public float f48227s;
    public final nt0 v;

    public h0(nt0 nt0Var, Context context, g0 g0Var) {
        super(context, g0Var);
        this.v = nt0Var;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: sg.h0.onDraw(android.graphics.Canvas):void");
    }
}
