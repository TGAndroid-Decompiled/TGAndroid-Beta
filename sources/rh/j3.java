package rh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.iv0;
public class j3 extends View {
    public final iv0 f43633a;
    public final Paint f43634b;
    public float f43635c;
    public o1.j d;

    public j3(Context context, f6 f6Var) {
        super(context);
        iv0 iv0Var = new iv0(new rg.a(13), new rg.a(14));
        iv0Var.f25780c = 100.0f;
        this.f43633a = iv0Var;
        Paint paint = new Paint(1);
        this.f43634b = paint;
        paint.setColor(j6.v0(j6.Oh, f6Var));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f43635c > 0.0f) {
            Paint paint = this.f43634b;
            float height = getHeight() - (paint.getStrokeWidth() / 2.0f);
            canvas.drawLine(0.0f, height, getWidth() * this.f43635c, height, paint);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o1.j jVar = new o1.j(this, this.f43633a);
        o1.k kVar = new o1.k();
        kVar.b(400.0f);
        kVar.a(1.0f);
        jVar.f16178u = kVar;
        this.d = jVar;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.c();
        this.d = null;
    }

    public void setLoadProgress(float f10) {
        this.f43635c = f10;
        invalidate();
    }

    public void setLoadProgressAnimated(float f10) {
        o1.j jVar = this.d;
        if (jVar == null) {
            setLoadProgress(f10);
            return;
        }
        jVar.f16178u.f16184i = f10 * 100.0f;
        jVar.f();
    }
}
