package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.x9;
import w7.x5;
public final class p0 extends FrameLayout {
    public final x9 f47217a;
    public final q0 f47218b;
    public final Paint f47219c;
    public TLRPC.Chat d;
    public final i9 f47220e;

    public p0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f47219c = paint;
        this.f47220e = new i9((f6) null);
        x9 x9Var = new x9(getContext());
        this.f47217a = x9Var;
        x9Var.setRoundRadius(AndroidUtilities.dp(30.0f));
        ?? view = new View(context);
        Paint paint2 = new Paint(1);
        view.f47223a = paint2;
        view.f47224b = view.getContext().getDrawable(R.drawable.mini_boost_remove);
        int i10 = j6.f20761h5;
        paint2.setColor(j6.w0(null, i10, false));
        this.f47218b = view;
        view.setAlpha(0.0f);
        addView(x9Var, x5.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView((View) view, x5.d(28, 28.0f, 85, 0.0f, 0.0f, 0.0f, 3.0f));
        paint.setColor(j6.w0(null, i10, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(2.0f), this.f47219c);
        super.dispatchDraw(canvas);
    }
}
