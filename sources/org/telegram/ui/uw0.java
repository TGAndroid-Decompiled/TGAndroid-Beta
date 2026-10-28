package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class uw0 extends org.telegram.ui.Components.nm0 {
    public final Paint f44125f3;
    public final Path f44126g3;
    public final xw0 f44127h3;

    public uw0(xw0 xw0Var, Context context) {
        super(context, null);
        this.f44127h3 = xw0Var;
        Paint paint = new Paint(1);
        this.f44125f3 = paint;
        paint.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23428h5, false));
        this.f44126g3 = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Path path = this.f44126g3;
        path.rewind();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        path.addRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Path.Direction.CW);
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23428h5, false);
        Paint paint = this.f44125f3;
        paint.setColor(x02);
        canvas.drawPath(path, paint);
        canvas.save();
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f44127h3.f45792n.f35909q0 >= 1.0f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f44127h3.f45792n.f35909q0 >= 1.0f) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        PremiumPreviewFragment premiumPreviewFragment = this.f44127h3.f45792n;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            ArrayList arrayList = premiumPreviewFragment.d;
            if (i14 < arrayList.size()) {
                premiumPreviewFragment.M.a((zw0) arrayList.get(i14), false);
                premiumPreviewFragment.M.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE));
                ((zw0) arrayList.get(i14)).h = i15;
                i15 += premiumPreviewFragment.M.getMeasuredHeight();
                i14++;
            } else {
                premiumPreviewFragment.O = i15;
                return;
            }
        }
    }
}
