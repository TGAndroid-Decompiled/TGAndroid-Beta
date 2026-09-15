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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.u9;
import w7.x5;
public final class p0 extends FrameLayout {
    public final u9 f43204a;
    public final q0 f43205b;
    public final Paint f43206c;
    public TLRPC.Chat d;
    public final f9 e;

    public p0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f43206c = paint;
        this.e = new f9((e6) null);
        u9 u9Var = new u9(getContext());
        this.f43204a = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(30.0f));
        ?? view = new View(context);
        Paint paint2 = new Paint(1);
        view.f43210a = paint2;
        view.f43211b = view.getContext().getDrawable(R.drawable.mini_boost_remove);
        int i10 = i6.f18907h5;
        paint2.setColor(i6.w0(null, i10, false));
        this.f43205b = view;
        view.setAlpha(0.0f);
        addView(u9Var, x5.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView((View) view, x5.d(28, 28.0f, 85, 0.0f, 0.0f, 0.0f, 3.0f));
        paint.setColor(i6.w0(null, i10, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(2.0f), this.f43206c);
        super.dispatchDraw(canvas);
    }
}
