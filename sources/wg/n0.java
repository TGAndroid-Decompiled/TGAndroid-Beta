package wg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import c8.ma;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.q9;
import org.telegram.ui.i2;
public final class n0 extends FrameLayout implements c6 {
    public final q9 f59796a;
    public final i2 f59797b;
    public final Paint f59798c;
    public TLRPC.Chat d;
    public final b9 f59799e;

    public n0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f59798c = paint;
        this.f59799e = new b9((i6) null);
        q9 q9Var = new q9(getContext());
        this.f59796a = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
        i2 i2Var = new i2(context);
        Paint paint2 = new Paint(1);
        i2Var.f48564b = paint2;
        i2Var.f48565c = i2Var.getContext().getDrawable(2131231933);
        int i7 = n6.f29469h5;
        paint2.setColor(n6.x0(null, i7, false));
        this.f59797b = i2Var;
        i2Var.setAlpha(0.0f);
        addView(q9Var, ma.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView(i2Var, ma.d(28, 28.0f, 85, 0.0f, 0.0f, 0.0f, 3.0f));
        paint.setColor(n6.x0(null, i7, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(2.0f), this.f59798c);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void updateColors() {
        this.f59798c.setColor(n6.x0(null, n6.f29469h5, false));
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
