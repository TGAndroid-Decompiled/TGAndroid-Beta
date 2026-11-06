package tg;

import android.content.Context;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ki0;
import org.telegram.ui.Components.w5;
import org.telegram.ui.Components.xq;
public abstract class i extends FrameLayout {
    public final Paint f55605a;
    public final Paint f55606b;
    public final Paint f55607c;
    public int d;
    public final w5 f55608e;
    public boolean f55609f;
    public final j h;

    public i(j jVar, Context context) {
        super(context);
        this.h = jVar;
        Paint paint = new Paint(1);
        this.f55605a = paint;
        Paint paint2 = new Paint(1);
        this.f55606b = paint2;
        Paint paint3 = new Paint(1);
        this.f55607c = paint3;
        this.f55608e = new w5(this, 0L, 250L, xq.h);
        this.f55609f = true;
        setWillNotDraw(false);
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setPathEffect(new DashPathEffect(new float[]{org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f)}, 0.5f));
        paint.setShadowLayer(org.telegram.messenger.g0.N(0.75f), 0.0f, 0.0f, 1342177280);
        paint2.setColor(-15033089);
        paint3.setColor(-1);
        paint3.setStyle(style);
        paint3.setStrokeWidth(org.telegram.messenger.g0.N(2.66f));
        paint3.setShadowLayer(org.telegram.messenger.g0.N(0.75f), 0.0f, 0.0f, 1342177280);
    }

    public abstract int a(float f10, float f11);

    public final void b() {
        j jVar = this.h;
        ki0 selectionBounds = jVar.getSelectionBounds();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.leftMargin = (int) selectionBounds.f35319a;
        layoutParams.topMargin = (int) selectionBounds.f35320b;
        layoutParams.width = (int) selectionBounds.f35321c;
        layoutParams.height = (int) selectionBounds.d;
        setLayoutParams(layoutParams);
        setRotation(jVar.getRotation());
    }

    public float getShowAlpha() {
        return this.f55608e.d(this.f55609f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: tg.i.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
