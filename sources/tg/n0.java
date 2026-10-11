package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.y9;
import w7.x5;
public final class n0 extends FrameLayout {
    public final y9 f48451a;
    public final o0 f48452b;
    public final Paint f48453c;
    public TLRPC.Chat d;
    public final j9 f48454e;

    public n0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f48453c = paint;
        this.f48454e = new j9((d6) null);
        y9 y9Var = new y9(getContext());
        this.f48451a = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(30.0f));
        ?? view = new View(context);
        Paint paint2 = new Paint(1);
        view.f48458a = paint2;
        view.f48459b = view.getContext().getDrawable(R.drawable.mini_boost_remove);
        int i10 = h6.f20857h5;
        paint2.setColor(h6.x0(null, i10, false));
        this.f48452b = view;
        view.setAlpha(0.0f);
        addView(y9Var, x5.a(-1.0f, 5.0f, 5.0f, 5.0f, 5.0f, -1, 0));
        addView((View) view, x5.a(28.0f, 0.0f, 0.0f, 0.0f, 3.0f, 28, 85));
        paint.setColor(h6.x0(null, i10, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(2.0f), this.f48453c);
        super.dispatchDraw(canvas);
    }
}
