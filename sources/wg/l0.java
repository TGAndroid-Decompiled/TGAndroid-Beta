package wg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import c8.ja;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.t8;
import org.telegram.ui.i2;
public final class l0 extends FrameLayout implements z5 {
    public final i9 f59205a;
    public final i2 f59206b;
    public final Paint f59207c;
    public TLRPC.Chat d;
    public final t8 f59208e;

    public l0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f59207c = paint;
        this.f59208e = new t8((e6) null);
        i9 i9Var = new i9(getContext());
        this.f59205a = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
        i2 i2Var = new i2(context);
        Paint paint2 = new Paint(1);
        i2Var.f47873b = paint2;
        i2Var.f47874c = i2Var.getContext().getDrawable(2131231932);
        int i7 = j6.f28922h5;
        paint2.setColor(j6.x0(null, i7, false));
        this.f59206b = i2Var;
        i2Var.setAlpha(0.0f);
        addView(i9Var, ja.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView(i2Var, ja.d(28, 28.0f, 85, 0.0f, 0.0f, 0.0f, 3.0f));
        paint.setColor(j6.x0(null, i7, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(2.0f), this.f59207c);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void updateColors() {
        this.f59207c.setColor(j6.x0(null, j6.f28922h5, false));
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
