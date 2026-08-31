package sh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.jv0;
public class j3 extends View {
    public final jv0 f47476a;
    public final Paint f47477b;
    public float f47478c;
    public o1.j d;

    public j3(Context context, g6 g6Var) {
        super(context);
        jv0 jv0Var = new jv0(new sg.a(4), new sg.a(5));
        jv0Var.f28218c = 100.0f;
        this.f47476a = jv0Var;
        Paint paint = new Paint(1);
        this.f47477b = paint;
        paint.setColor(k6.v0(k6.Oh, g6Var));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f47478c > 0.0f) {
            Paint paint = this.f47477b;
            float height = getHeight() - (paint.getStrokeWidth() / 2.0f);
            canvas.drawLine(0.0f, height, getWidth() * this.f47478c, height, paint);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o1.j jVar = new o1.j(this, this.f47476a);
        o1.k kVar = new o1.k();
        kVar.b(400.0f);
        kVar.a(1.0f);
        jVar.f16336u = kVar;
        this.d = jVar;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.c();
        this.d = null;
    }

    public void setLoadProgress(float f10) {
        this.f47478c = f10;
        invalidate();
    }

    public void setLoadProgressAnimated(float f10) {
        o1.j jVar = this.d;
        if (jVar == null) {
            setLoadProgress(f10);
            return;
        }
        jVar.f16336u.f16343i = f10 * 100.0f;
        jVar.f();
    }
}
