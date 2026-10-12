package qg;

import android.content.Context;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.sl0;
public abstract class i extends FrameLayout {
    public final Paint f46213a;
    public final Paint f46214b;
    public final Paint f46215c;
    public int d;
    public final g6 f46216e;
    public boolean f46217f;
    public final j h;

    public i(j jVar, Context context) {
        super(context);
        this.h = jVar;
        Paint paint = new Paint(1);
        this.f46213a = paint;
        Paint paint2 = new Paint(1);
        this.f46214b = paint2;
        Paint paint3 = new Paint(1);
        this.f46215c = paint3;
        this.f46216e = new g6(this, 0L, 250L, js.h);
        this.f46217f = true;
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
        sl0 selectionBounds = jVar.getSelectionBounds();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.leftMargin = (int) selectionBounds.f30589a;
        layoutParams.topMargin = (int) selectionBounds.f30590b;
        layoutParams.width = (int) selectionBounds.f30591c;
        layoutParams.height = (int) selectionBounds.d;
        setLayoutParams(layoutParams);
        setRotation(jVar.getRotation());
    }

    public float getShowAlpha() {
        return this.f46216e.e(this.f46217f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: qg.i.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
