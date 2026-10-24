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
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.u9;
import w7.z5;
public final class m0 extends FrameLayout implements b6 {
    public final u9 f48174a;
    public final n0 f48175b;
    public final Paint f48176c;
    public TLRPC.Chat d;
    public final f9 e;

    public m0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f48176c = paint;
        this.e = new f9((g6) null);
        u9 u9Var = new u9(getContext());
        this.f48174a = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(30.0f));
        ?? view = new View(context);
        Paint paint2 = new Paint(1);
        view.f48180a = paint2;
        view.f48181b = view.getContext().getDrawable(R.drawable.mini_boost_remove);
        int i10 = k6.f21255h5;
        paint2.setColor(k6.x0(null, i10, false));
        this.f48175b = view;
        view.setAlpha(0.0f);
        addView(u9Var, z5.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView((View) view, z5.d(28, 28.0f, 85, 0.0f, 0.0f, 0.0f, 3.0f));
        paint.setColor(k6.x0(null, i10, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(2.0f), this.f48176c);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void updateColors() {
        this.f48176c.setColor(k6.x0(null, k6.f21255h5, false));
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
