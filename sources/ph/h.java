package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.u00;
public final class h extends u00 {
    public final Paint R;
    public final l S;

    public h(l lVar, Context context) {
        super(context, null);
        this.S = lVar;
        this.R = new Paint();
    }

    @Override
    public final int getColumnsCount() {
        return this.S.d;
    }

    @Override
    public final int getViewType() {
        setIsSingleCell(false);
        return 27;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int v02 = k6.v0(k6.f21661d6, this.S.T.f44439c);
        Paint paint = this.R;
        paint.setColor(v02);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
        super.onDraw(canvas);
    }
}
