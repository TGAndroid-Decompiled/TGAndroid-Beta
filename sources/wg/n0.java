package wg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import c8.ha;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.w8;
import org.telegram.ui.i2;
public final class n0 extends FrameLayout implements a6 {
    public final l9 f57667a;
    public final i2 f57668b;
    public final Paint f57669c;
    public TLRPC.Chat d;
    public final w8 f57670e;

    public n0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f57669c = paint;
        this.f57670e = new w8((f6) null);
        l9 l9Var = new l9(getContext());
        this.f57667a = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
        i2 i2Var = new i2(context);
        Paint paint2 = new Paint(1);
        i2Var.f46544b = paint2;
        i2Var.f46545c = i2Var.getContext().getDrawable(2131231932);
        int i7 = k6.f27921h5;
        paint2.setColor(k6.x0(null, i7, false));
        this.f57668b = i2Var;
        i2Var.setAlpha(0.0f);
        addView(l9Var, ha.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView(i2Var, ha.d(28, 28.0f, 85, 0.0f, 0.0f, 0.0f, 3.0f));
        paint.setColor(k6.x0(null, i7, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(2.0f), this.f57669c);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void updateColors() {
        this.f57669c.setColor(k6.x0(null, k6.f27921h5, false));
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
