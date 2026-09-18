package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.w9;
import w7.y5;
public final class o0 extends FrameLayout {
    public final w9 f43438a;
    public final p0 f43439b;
    public final Paint f43440c;
    public TLRPC.Chat d;
    public final h9 e;

    public o0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f43440c = paint;
        this.e = new h9((e6) null);
        w9 w9Var = new w9(getContext());
        this.f43438a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(30.0f));
        ?? view = new View(context);
        Paint paint2 = new Paint(1);
        view.f43443a = paint2;
        view.f43444b = view.getContext().getDrawable(R.drawable.mini_boost_remove);
        int i10 = j6.f19133h5;
        paint2.setColor(j6.w0(null, i10, false));
        this.f43439b = view;
        view.setAlpha(0.0f);
        addView(w9Var, y5.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView((View) view, y5.d(28, 28.0f, 85, 0.0f, 0.0f, 0.0f, 3.0f));
        paint.setColor(j6.w0(null, i10, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(2.0f), this.f43440c);
        super.dispatchDraw(canvas);
    }
}
