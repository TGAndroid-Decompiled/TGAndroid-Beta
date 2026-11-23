package tg;

import android.content.Context;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.kr;
public abstract class m extends FrameLayout {
    public final Paint f58066a;
    public final Paint f58067b;
    public final Paint f58068c;
    public int d;
    public final c6 f58069e;
    public boolean f58070f;
    public final n h;

    public m(n nVar, Context context) {
        super(context);
        this.h = nVar;
        Paint paint = new Paint(1);
        this.f58066a = paint;
        Paint paint2 = new Paint(1);
        this.f58067b = paint2;
        Paint paint3 = new Paint(1);
        this.f58068c = paint3;
        this.f58069e = new c6(this, 0L, 250L, kr.h);
        this.f58070f = true;
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
        n nVar = this.h;
        aj0 selectionBounds = nVar.getSelectionBounds();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.leftMargin = (int) selectionBounds.f33482a;
        layoutParams.topMargin = (int) selectionBounds.f33483b;
        layoutParams.width = (int) selectionBounds.f33484c;
        layoutParams.height = (int) selectionBounds.d;
        setLayoutParams(layoutParams);
        setRotation(nVar.getRotation());
    }

    public float getShowAlpha() {
        return this.f58069e.d(this.f58070f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: tg.m.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
