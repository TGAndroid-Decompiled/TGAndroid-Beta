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
import org.telegram.ui.Components.pu0;
public class f3 extends View implements k6 {
    public final pu0 f53780a;
    public final Paint f53781b;
    public float f53782c;
    public o1.j d;
    public final p6 e;

    public f3(Context context, p6 p6Var) {
        super(context);
        pu0 pu0Var = new pu0(new xg.a(18), new xg.a(19));
        pu0Var.f29554c = 100.0f;
        this.f53780a = pu0Var;
        Paint paint = new Paint(1);
        this.f53781b = paint;
        this.e = p6Var;
        paint.setColor(t6.w0(t6.Ci, p6Var));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f53782c > 0.0f) {
            Paint paint = this.f53781b;
            float height = getHeight() - (paint.getStrokeWidth() / 2.0f);
            canvas.drawLine(0.0f, height, getWidth() * this.f53782c, height, paint);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o1.j jVar = new o1.j(this, this.f53780a);
        o1.k kVar = new o1.k();
        kVar.b(400.0f);
        kVar.a(1.0f);
        jVar.f13958m = kVar;
        this.d = jVar;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.d();
        this.d = null;
    }

    public void setLoadProgress(float f7) {
        this.f53782c = f7;
        invalidate();
    }

    public void setLoadProgressAnimated(float f7) {
        o1.j jVar = this.d;
        if (jVar == null) {
            setLoadProgress(f7);
            return;
        }
        jVar.f13958m.f13965i = f7 * 100.0f;
        jVar.h();
    }

    @Override
    public final void updateColors() {
        try {
            this.f53781b.setColor(t6.w0(t6.Ci, this.e));
            invalidate();
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
