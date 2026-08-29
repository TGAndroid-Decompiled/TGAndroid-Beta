package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.av0;
import org.telegram.ui.xx0;
public class j3 extends View {
    public final av0 f45851a;
    public final Paint f45852b;
    public float f45853c;
    public o1.k d;

    public j3(Context context, c6 c6Var) {
        super(context);
        av0 av0Var = new av0(new xx0(24), new xx0(25));
        av0Var.f26899c = 100.0f;
        this.f45851a = av0Var;
        Paint paint = new Paint(1);
        this.f45852b = paint;
        paint.setColor(g6.v0(g6.Oh, c6Var));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f45853c > 0.0f) {
            Paint paint = this.f45852b;
            float height = getHeight() - (paint.getStrokeWidth() / 2.0f);
            canvas.drawLine(0.0f, height, getWidth() * this.f45853c, height, paint);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o1.k kVar = new o1.k(this, this.f45851a);
        o1.l lVar = new o1.l();
        lVar.b(400.0f);
        lVar.a(1.0f);
        kVar.f19045u = lVar;
        this.d = kVar;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.c();
        this.d = null;
    }

    public void setLoadProgress(float f9) {
        this.f45853c = f9;
        invalidate();
    }

    public void setLoadProgressAnimated(float f9) {
        o1.k kVar = this.d;
        if (kVar == null) {
            setLoadProgress(f9);
            return;
        }
        kVar.f19045u.f19052i = f9 * 100.0f;
        kVar.f();
    }
}
