package vg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.y6;
public final class p0 extends View implements p6 {
    public Paint f50240a;
    public Drawable f50241b;

    @Override
    public final void onDraw(Canvas canvas) {
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        canvas.drawCircle(measuredWidth, measuredHeight, getMeasuredWidth() / 2.0f, this.f50240a);
        tg.b1.d().f(-AndroidUtilities.dp(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawCircle(measuredWidth, measuredHeight, (getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(2.0f), tg.b1.d().e());
        float dp = AndroidUtilities.dp(18.0f) / 2.0f;
        Drawable drawable = this.f50241b;
        drawable.setBounds((int) (measuredWidth - dp), (int) (measuredHeight - dp), (int) (measuredWidth + dp), (int) (measuredHeight + dp));
        drawable.draw(canvas);
    }

    @Override
    public final void updateColors() {
        this.f50240a.setColor(y6.x0(null, y6.f23425h5, false));
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
