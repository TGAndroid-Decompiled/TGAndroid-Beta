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
import w7.z5;
public final class o0 extends FrameLayout {
    public final z9 f46369a;
    public final p0 f46370b;
    public final Paint f46371c;
    public TLRPC.Chat d;
    public final k9 e;

    public o0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f46371c = paint;
        this.e = new k9((c6) null);
        z9 z9Var = new z9(getContext());
        this.f46369a = z9Var;
        z9Var.setRoundRadius(AndroidUtilities.dp(30.0f));
        ?? view = new View(context);
        Paint paint2 = new Paint(1);
        view.f46375a = paint2;
        view.f46376b = view.getContext().getDrawable(R.drawable.mini_boost_remove);
        int i10 = g6.f19672h5;
        paint2.setColor(g6.x0(null, i10, false));
        this.f46370b = view;
        view.setAlpha(0.0f);
        addView(z9Var, z5.a(-1.0f, 5.0f, 5.0f, 5.0f, 5.0f, -1, 0));
        addView((View) view, z5.a(28.0f, 0.0f, 0.0f, 0.0f, 3.0f, 28, 85));
        paint.setColor(g6.x0(null, i10, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(2.0f), this.f46371c);
        super.dispatchDraw(canvas);
    }
}
