package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import org.telegram.ui.ActionBar.k6;
public final class j extends ScrollView {
    public final LinearLayout f55214a;
    public final q f55215b;

    public j(q qVar, Context context, LinearLayout linearLayout) {
        super(context);
        this.f55215b = qVar;
        this.f55214a = linearLayout;
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float y9 = this.f55214a.getY() + org.telegram.messenger.g0.L(1.0f);
        int L = org.telegram.messenger.g0.L(36.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set((getMeasuredWidth() - L) / 2.0f, y9, (getMeasuredWidth() + L) / 2.0f, org.telegram.messenger.g0.L(4.0f) + y9);
        k6.f28171t0.setColor(-10790053);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), k6.f28171t0);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        ((LinearLayout.LayoutParams) this.f55215b.f55286j1.getLayoutParams()).height = (int) (((View.MeasureSpec.getSize(i3) - org.telegram.messenger.g0.L(24.0f)) * 0.8333333f) + org.telegram.messenger.g0.L(88.0f));
    }
}
