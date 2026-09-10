package sg;

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
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.w9;
import w7.a6;
public final class q0 extends FrameLayout {
    public final w9 f41994a;
    public final r0 f41995b;
    public final Paint f41996c;
    public TLRPC.Chat d;
    public final g9 e;

    public q0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f41996c = paint;
        this.e = new g9((f6) null);
        w9 w9Var = new w9(getContext());
        this.f41994a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(30.0f));
        ?? view = new View(context);
        Paint paint2 = new Paint(1);
        view.f41999a = paint2;
        view.f42000b = view.getContext().getDrawable(R.drawable.mini_boost_remove);
        int i10 = j6.f17998h5;
        paint2.setColor(j6.w0(null, i10, false));
        this.f41995b = view;
        view.setAlpha(0.0f);
        addView(w9Var, a6.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView((View) view, a6.d(28, 28.0f, 85, 0.0f, 0.0f, 0.0f, 3.0f));
        paint.setColor(j6.w0(null, i10, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(2.0f), this.f41996c);
        super.dispatchDraw(canvas);
    }
}
