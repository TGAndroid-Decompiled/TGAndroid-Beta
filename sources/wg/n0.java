package wg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import c8.na;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.q9;
import org.telegram.ui.i2;
public final class n0 extends FrameLayout implements b6 {
    public final q9 f59807a;
    public final i2 f59808b;
    public final Paint f59809c;
    public TLRPC.Chat d;
    public final b9 f59810e;

    public n0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f59809c = paint;
        this.f59810e = new b9((h6) null);
        q9 q9Var = new q9(getContext());
        this.f59807a = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
        i2 i2Var = new i2(context);
        Paint paint2 = new Paint(1);
        i2Var.f48534b = paint2;
        i2Var.f48535c = i2Var.getContext().getDrawable(2131231933);
        int i7 = m6.f29420h5;
        paint2.setColor(m6.x0(null, i7, false));
        this.f59808b = i2Var;
        i2Var.setAlpha(0.0f);
        addView(q9Var, na.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView(i2Var, na.d(28, 28.0f, 85, 0.0f, 0.0f, 0.0f, 3.0f));
        paint.setColor(m6.x0(null, i7, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(2.0f), this.f59809c);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void updateColors() {
        this.f59809c.setColor(m6.x0(null, m6.f29420h5, false));
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
