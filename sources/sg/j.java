package sg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import org.telegram.ui.ActionBar.n6;
public final class j extends ScrollView {
    public final LinearLayout f57368a;
    public final q f57369b;

    public j(q qVar, Context context, LinearLayout linearLayout) {
        super(context);
        this.f57369b = qVar;
        this.f57368a = linearLayout;
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float y10 = this.f57368a.getY() + org.telegram.messenger.g0.L(1.0f);
        int L = org.telegram.messenger.g0.L(36.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set((getMeasuredWidth() - L) / 2.0f, y10, (getMeasuredWidth() + L) / 2.0f, org.telegram.messenger.g0.L(4.0f) + y10);
        n6.f29742t0.setColor(-10790053);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), n6.f29742t0);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        ((LinearLayout.LayoutParams) this.f57369b.f57438m1.getLayoutParams()).height = (int) (((View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(24.0f)) * 0.8333333f) + org.telegram.messenger.g0.L(88.0f));
    }
}
