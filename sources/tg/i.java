package tg;

import android.content.Context;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.Components.u5;
public abstract class i extends FrameLayout {
    public final Paint f57335a;
    public final Paint f57336b;
    public final Paint f57337c;
    public int d;
    public final u5 f57338e;
    public boolean f57339f;
    public final j h;

    public i(j jVar, Context context) {
        super(context);
        this.h = jVar;
        Paint paint = new Paint(1);
        this.f57335a = paint;
        Paint paint2 = new Paint(1);
        this.f57336b = paint2;
        Paint paint3 = new Paint(1);
        this.f57337c = paint3;
        this.f57338e = new u5(this, 0L, 250L, er.h);
        this.f57339f = true;
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
        pi0 selectionBounds = jVar.getSelectionBounds();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.leftMargin = (int) selectionBounds.f38312a;
        layoutParams.topMargin = (int) selectionBounds.f38313b;
        layoutParams.width = (int) selectionBounds.f38314c;
        layoutParams.height = (int) selectionBounds.d;
        setLayoutParams(layoutParams);
        setRotation(jVar.getRotation());
    }

    public float getShowAlpha() {
        return this.f57338e.d(this.f57339f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: tg.i.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
