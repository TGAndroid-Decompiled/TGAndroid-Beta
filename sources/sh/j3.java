package sh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.iv0;
public class j3 extends View {
    public final iv0 f47512a;
    public final Paint f47513b;
    public float f47514c;
    public o1.j d;

    public j3(Context context, g6 g6Var) {
        super(context);
        iv0 iv0Var = new iv0(new sg.a(5), new sg.a(6));
        iv0Var.f27906c = 100.0f;
        this.f47512a = iv0Var;
        Paint paint = new Paint(1);
        this.f47513b = paint;
        paint.setColor(k6.v0(k6.Oh, g6Var));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f47514c > 0.0f) {
            Paint paint = this.f47513b;
            float height = getHeight() - (paint.getStrokeWidth() / 2.0f);
            canvas.drawLine(0.0f, height, getWidth() * this.f47514c, height, paint);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o1.j jVar = new o1.j(this, this.f47512a);
        o1.k kVar = new o1.k();
        kVar.b(400.0f);
        kVar.a(1.0f);
        jVar.f16338u = kVar;
        this.d = jVar;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.c();
        this.d = null;
    }

    public void setLoadProgress(float f10) {
        this.f47514c = f10;
        invalidate();
    }

    public void setLoadProgressAnimated(float f10) {
        o1.j jVar = this.d;
        if (jVar == null) {
            setLoadProgress(f10);
            return;
        }
        jVar.f16338u.f16345i = f10 * 100.0f;
        jVar.f();
    }
}
