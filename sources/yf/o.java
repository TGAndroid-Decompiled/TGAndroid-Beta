package yf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;

public final class o extends ScrollView {

    public final LinearLayout f49993a;

    public final x f49994b;

    public o(x xVar, Context context, LinearLayout linearLayout) {
        super(context);
        this.f49994b = xVar;
        this.f49993a = linearLayout;
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float y10 = this.f49993a.getY() + AndroidUtilities.dp(1.0f);
        int iDp = AndroidUtilities.dp(36.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getMeasuredWidth() - iDp) / 2.0f, y10, (getMeasuredWidth() + iDp) / 2.0f, AndroidUtilities.dp(4.0f) + y10);
        g6.f23333t0.setColor(-10790053);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), g6.f23333t0);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ((LinearLayout.LayoutParams) this.f49994b.f50112b.getLayoutParams()).height = (int) (((View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(24.0f)) * 0.8333333f) + AndroidUtilities.dp(88.0f));
    }
}
