package xh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.f8;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ou0;
public class e3 extends View implements k6 {
    public final ou0 f53745a;
    public final Paint f53746b;
    public float f53747c;
    public o1.j d;
    public final p6 e;

    public e3(Context context, p6 p6Var) {
        super(context);
        ou0 ou0Var = new ou0(new xg.a(18), new xg.a(19));
        ou0Var.f29199c = 100.0f;
        this.f53745a = ou0Var;
        Paint paint = new Paint(1);
        this.f53746b = paint;
        this.e = p6Var;
        paint.setColor(t6.w0(t6.Ci, p6Var));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f53747c > 0.0f) {
            Paint paint = this.f53746b;
            float height = getHeight() - (paint.getStrokeWidth() / 2.0f);
            canvas.drawLine(0.0f, height, getWidth() * this.f53747c, height, paint);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o1.j jVar = new o1.j(this, this.f53745a);
        o1.k kVar = new o1.k();
        kVar.b(400.0f);
        kVar.a(1.0f);
        jVar.f13957m = kVar;
        this.d = jVar;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.d();
        this.d = null;
    }

    public void setLoadProgress(float f7) {
        this.f53747c = f7;
        invalidate();
    }

    public void setLoadProgressAnimated(float f7) {
        o1.j jVar = this.d;
        if (jVar == null) {
            setLoadProgress(f7);
            return;
        }
        jVar.f13957m.f13964i = f7 * 100.0f;
        jVar.h();
    }

    @Override
    public final void updateColors() {
        try {
            this.f53746b.setColor(t6.w0(t6.Ci, this.e));
            invalidate();
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
