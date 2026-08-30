package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class f7 extends LinearLayout {
    public final RectF f41653a;
    public final RectF f41654b;
    public final RectF f41655c;
    public final Paint d;
    public final g7 e;

    public f7(g7 g7Var, Context context) {
        super(context);
        this.e = g7Var;
        this.f41653a = new RectF();
        this.f41654b = new RectF();
        this.f41655c = new RectF();
        this.d = new Paint(1);
    }

    public final void a(RectF rectF, int i10) {
        FrameLayout frameLayout;
        g7 g7Var = this.e;
        if (i10 <= -1) {
            frameLayout = g7Var.f41688b;
        } else if (i10 >= 1) {
            frameLayout = g7Var.f41690f;
        } else {
            frameLayout = g7Var.d;
        }
        rectF.set(frameLayout.getLeft(), frameLayout.getBottom() - AndroidUtilities.dp(30.0f), frameLayout.getRight(), frameLayout.getBottom());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        g7 g7Var = this.e;
        RectF rectF = this.f41653a;
        a(rectF, (int) Math.floor(g7Var.f41692r));
        int ceil = (int) Math.ceil(g7Var.f41692r);
        RectF rectF2 = this.f41654b;
        a(rectF2, ceil);
        float f10 = g7Var.f41692r;
        float floor = f10 - ((float) Math.floor(f10));
        RectF rectF3 = this.f41655c;
        AndroidUtilities.lerp(rectF, rectF2, floor, rectF3);
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.15f, i0.a.d(g7Var.f41691n, -1, -16777216));
        Paint paint = this.d;
        paint.setColor(l1);
        canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, rectF3.height() / 2.0f, paint);
        super.dispatchDraw(canvas);
    }
}
