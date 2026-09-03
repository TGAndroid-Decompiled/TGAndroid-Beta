package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class e7 extends LinearLayout {
    public final RectF f41617a;
    public final RectF f41618b;
    public final RectF f41619c;
    public final Paint d;
    public final f7 e;

    public e7(f7 f7Var, Context context) {
        super(context);
        this.e = f7Var;
        this.f41617a = new RectF();
        this.f41618b = new RectF();
        this.f41619c = new RectF();
        this.d = new Paint(1);
    }

    public final void a(RectF rectF, int i10) {
        FrameLayout frameLayout;
        f7 f7Var = this.e;
        if (i10 <= -1) {
            frameLayout = f7Var.f41698b;
        } else if (i10 >= 1) {
            frameLayout = f7Var.f41700f;
        } else {
            frameLayout = f7Var.d;
        }
        rectF.set(frameLayout.getLeft(), frameLayout.getBottom() - AndroidUtilities.dp(30.0f), frameLayout.getRight(), frameLayout.getBottom());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        f7 f7Var = this.e;
        RectF rectF = this.f41617a;
        a(rectF, (int) Math.floor(f7Var.f41702r));
        int ceil = (int) Math.ceil(f7Var.f41702r);
        RectF rectF2 = this.f41618b;
        a(rectF2, ceil);
        float f10 = f7Var.f41702r;
        float floor = f10 - ((float) Math.floor(f10));
        RectF rectF3 = this.f41619c;
        AndroidUtilities.lerp(rectF, rectF2, floor, rectF3);
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.15f, i0.a.d(f7Var.f41701n, -1, -16777216));
        Paint paint = this.d;
        paint.setColor(l1);
        canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, rectF3.height() / 2.0f, paint);
        super.dispatchDraw(canvas);
    }
}
