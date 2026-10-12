package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.y9;
import w7.w5;
public final class o0 extends FrameLayout {
    public final y9 f48626a;
    public final p0 f48627b;
    public final Paint f48628c;
    public TLRPC.Chat d;
    public final j9 f48629e;

    public o0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f48628c = paint;
        this.f48629e = new j9((c6) null);
        y9 y9Var = new y9(getContext());
        this.f48626a = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(30.0f));
        ?? view = new View(context);
        Paint paint2 = new Paint(1);
        view.f48632a = paint2;
        view.f48633b = view.getContext().getDrawable(R.drawable.mini_boost_remove);
        int i10 = h6.f20631h5;
        paint2.setColor(h6.x0(null, i10, false));
        this.f48627b = view;
        view.setAlpha(0.0f);
        addView(y9Var, w5.a(-1.0f, 5.0f, 5.0f, 5.0f, 5.0f, -1, 0));
        addView((View) view, w5.a(28.0f, 0.0f, 0.0f, 0.0f, 3.0f, 28, 85));
        paint.setColor(h6.x0(null, i10, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(2.0f), this.f48628c);
        super.dispatchDraw(canvas);
    }
}
