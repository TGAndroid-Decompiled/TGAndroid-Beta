package rg;

import android.content.Context;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.fl0;
public abstract class i extends FrameLayout {
    public final Paint f45373a;
    public final Paint f45374b;
    public final Paint f45375c;
    public int d;
    public final f6 e;
    public boolean f45376f;
    public final j h;

    public i(j jVar, Context context) {
        super(context);
        this.h = jVar;
        Paint paint = new Paint(1);
        this.f45373a = paint;
        Paint paint2 = new Paint(1);
        this.f45374b = paint2;
        Paint paint3 = new Paint(1);
        this.f45375c = paint3;
        this.e = new f6(this, 0L, 250L, bs.h);
        this.f45376f = true;
        setWillNotDraw(false);
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setPathEffect(new DashPathEffect(new float[]{AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f)}, 0.5f));
        paint.setShadowLayer(AndroidUtilities.dpf2(0.75f), 0.0f, 0.0f, 1342177280);
        paint2.setColor(-15033089);
        paint3.setColor(-1);
        paint3.setStyle(style);
        paint3.setStrokeWidth(AndroidUtilities.dpf2(2.66f));
        paint3.setShadowLayer(AndroidUtilities.dpf2(0.75f), 0.0f, 0.0f, 1342177280);
    }

    public abstract int a(float f7, float f10);

    public final void b() {
        j jVar = this.h;
        fl0 selectionBounds = jVar.getSelectionBounds();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.leftMargin = (int) selectionBounds.f26276a;
        layoutParams.topMargin = (int) selectionBounds.f26277b;
        layoutParams.width = (int) selectionBounds.f26278c;
        layoutParams.height = (int) selectionBounds.d;
        setLayoutParams(layoutParams);
        setRotation(jVar.getRotation());
    }

    public float getShowAlpha() {
        return this.e.e(this.f45376f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: rg.i.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
