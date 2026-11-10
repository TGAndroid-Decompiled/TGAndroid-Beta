package wg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import c8.ha;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.v8;
import org.telegram.ui.i2;
public final class n0 extends FrameLayout implements c6 {
    public final k9 f57780a;
    public final i2 f57781b;
    public final Paint f57782c;
    public TLRPC.Chat d;
    public final v8 f57783e;

    public n0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f57782c = paint;
        this.f57783e = new v8((h6) null);
        k9 k9Var = new k9(getContext());
        this.f57780a = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
        i2 i2Var = new i2(context);
        Paint paint2 = new Paint(1);
        i2Var.f46469b = paint2;
        i2Var.f46470c = i2Var.getContext().getDrawable(2131231932);
        int i7 = m6.f27963h5;
        paint2.setColor(m6.x0(null, i7, false));
        this.f57781b = i2Var;
        i2Var.setAlpha(0.0f);
        addView(k9Var, ha.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView(i2Var, ha.d(28, 28.0f, 85, 0.0f, 0.0f, 0.0f, 3.0f));
        paint.setColor(m6.x0(null, i7, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(2.0f), this.f57782c);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void updateColors() {
        this.f57782c.setColor(m6.x0(null, m6.f27963h5, false));
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
