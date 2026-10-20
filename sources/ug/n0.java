package ug;

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
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.w9;
import w7.z5;
public final class n0 extends FrameLayout {
    public final w9 f47738a;
    public final o0 f47739b;
    public final Paint f47740c;
    public TLRPC.Chat d;
    public final h9 e;

    public n0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f47740c = paint;
        this.e = new h9((d6) null);
        w9 w9Var = new w9(getContext());
        this.f47738a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(30.0f));
        ?? view = new View(context);
        Paint paint2 = new Paint(1);
        view.f47744a = paint2;
        view.f47745b = view.getContext().getDrawable(R.drawable.mini_boost_remove);
        int i10 = h6.f21061h5;
        paint2.setColor(h6.x0(null, i10, false));
        this.f47739b = view;
        view.setAlpha(0.0f);
        addView(w9Var, z5.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView((View) view, z5.d(28, 28.0f, 85, 0.0f, 0.0f, 0.0f, 3.0f));
        paint.setColor(h6.x0(null, i10, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(2.0f), this.f47740c);
        super.dispatchDraw(canvas);
    }
}
