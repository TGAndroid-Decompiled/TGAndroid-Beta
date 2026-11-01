package uh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.zz;
public final class f extends zz {
    public final Paint U;
    public final i V;

    public f(i iVar, Context context) {
        super(context, null);
        this.V = iVar;
        this.U = new Paint();
    }

    @Override
    public final int getColumnsCount() {
        return this.V.d;
    }

    @Override
    public final int getViewType() {
        setIsSingleCell(false);
        return 27;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int w02 = t6.w0(t6.f20930d6, this.V.W.f50275c);
        Paint paint = this.U;
        paint.setColor(w02);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
        super.onDraw(canvas);
    }
}
