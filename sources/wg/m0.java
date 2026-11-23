package wg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import c8.na;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.p9;
import org.telegram.ui.i2;
public final class m0 extends FrameLayout implements c6 {
    public final p9 f59902a;
    public final i2 f59903b;
    public final Paint f59904c;
    public TLRPC.Chat d;
    public final a9 f59905e;

    public m0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f59904c = paint;
        this.f59905e = new a9((i6) null);
        p9 p9Var = new p9(getContext());
        this.f59902a = p9Var;
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
        i2 i2Var = new i2(context);
        Paint paint2 = new Paint(1);
        i2Var.f48693b = paint2;
        i2Var.f48694c = i2Var.getContext().getDrawable(2131231936);
        int i7 = n6.f29524h5;
        paint2.setColor(n6.x0(null, i7, false));
        this.f59903b = i2Var;
        i2Var.setAlpha(0.0f);
        addView(p9Var, na.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView(i2Var, na.d(28, 28.0f, 85, 0.0f, 0.0f, 0.0f, 3.0f));
        paint.setColor(n6.x0(null, i7, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(2.0f), this.f59904c);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void updateColors() {
        this.f59904c.setColor(n6.x0(null, n6.f29524h5, false));
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
