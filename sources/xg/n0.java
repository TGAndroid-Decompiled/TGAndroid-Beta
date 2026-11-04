package xg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import b8.mf;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.u8;
import org.telegram.ui.j2;
public final class n0 extends FrameLayout implements z5 {
    public final k9 f58733a;
    public final j2 f58734b;
    public final Paint f58735c;
    public TLRPC.Chat d;
    public final u8 f58736e;

    public n0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f58735c = paint;
        this.f58736e = new u8((e6) null);
        k9 k9Var = new k9(getContext());
        this.f58733a = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
        j2 j2Var = new j2(context);
        Paint paint2 = new Paint(1);
        j2Var.f46485b = paint2;
        j2Var.f46486c = j2Var.getContext().getDrawable(2131231932);
        int i3 = k6.f27954h5;
        paint2.setColor(k6.x0(null, i3, false));
        this.f58734b = j2Var;
        j2Var.setAlpha(0.0f);
        addView(k9Var, mf.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView(j2Var, mf.d(28, 28.0f, 85, 0.0f, 0.0f, 0.0f, 3.0f));
        paint.setColor(k6.x0(null, i3, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(2.0f), this.f58735c);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void updateColors() {
        this.f58735c.setColor(k6.x0(null, k6.f27954h5, false));
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
