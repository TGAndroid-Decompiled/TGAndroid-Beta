package vg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.y9;
public final class o0 extends FrameLayout implements p6 {
    public final y9 f50272a;
    public final p0 f50273b;
    public final Paint f50274c;
    public TLRPC.Chat d;
    public final j9 e;

    public o0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f50274c = paint;
        this.e = new j9((u6) null);
        y9 y9Var = new y9(getContext());
        this.f50272a = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(30.0f));
        ?? view = new View(context);
        Paint paint2 = new Paint(1);
        view.f50278a = paint2;
        view.f50279b = view.getContext().getDrawable(R.drawable.mini_boost_remove);
        int i10 = y6.f23428h5;
        paint2.setColor(y6.x0(null, i10, false));
        this.f50273b = view;
        view.setAlpha(0.0f);
        addView(y9Var, kb1.h(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView((View) view, kb1.h(28, 28.0f, 85, 0.0f, 0.0f, 0.0f, 3.0f));
        paint.setColor(y6.x0(null, i10, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(2.0f), this.f50274c);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void updateColors() {
        this.f50274c.setColor(y6.x0(null, y6.f23428h5, false));
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
