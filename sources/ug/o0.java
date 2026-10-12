package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.z9;
import w7.a6;
public final class o0 extends FrameLayout {
    public final z9 f46370a;
    public final p0 f46371b;
    public final Paint f46372c;
    public TLRPC.Chat d;
    public final k9 e;

    public o0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f46372c = paint;
        this.e = new k9((c6) null);
        z9 z9Var = new z9(getContext());
        this.f46370a = z9Var;
        z9Var.setRoundRadius(AndroidUtilities.dp(30.0f));
        ?? view = new View(context);
        Paint paint2 = new Paint(1);
        view.f46376a = paint2;
        view.f46377b = view.getContext().getDrawable(R.drawable.mini_boost_remove);
        int i10 = g6.f19972h5;
        paint2.setColor(g6.x0(null, i10, false));
        this.f46371b = view;
        view.setAlpha(0.0f);
        addView(z9Var, a6.a(-1.0f, 5.0f, 5.0f, 5.0f, 5.0f, -1, 0));
        addView((View) view, a6.a(28.0f, 0.0f, 0.0f, 0.0f, 3.0f, 28, 85));
        paint.setColor(g6.x0(null, i10, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(2.0f), this.f46372c);
        super.dispatchDraw(canvas);
    }
}
