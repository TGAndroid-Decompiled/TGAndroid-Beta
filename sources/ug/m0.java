package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.w9;
import w7.z5;
public final class m0 extends FrameLayout implements b6 {
    public final w9 f48175a;
    public final n0 f48176b;
    public final Paint f48177c;
    public TLRPC.Chat d;
    public final h9 e;

    public m0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f48177c = paint;
        this.e = new h9((g6) null);
        w9 w9Var = new w9(getContext());
        this.f48175a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(30.0f));
        ?? view = new View(context);
        Paint paint2 = new Paint(1);
        view.f48181a = paint2;
        view.f48182b = view.getContext().getDrawable(R.drawable.mini_boost_remove);
        int i10 = k6.f21254h5;
        paint2.setColor(k6.x0(null, i10, false));
        this.f48176b = view;
        view.setAlpha(0.0f);
        addView(w9Var, z5.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView((View) view, z5.d(28, 28.0f, 85, 0.0f, 0.0f, 0.0f, 3.0f));
        paint.setColor(k6.x0(null, i10, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(2.0f), this.f48177c);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void updateColors() {
        this.f48177c.setColor(k6.x0(null, k6.f21254h5, false));
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
