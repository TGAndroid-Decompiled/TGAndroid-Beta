package rg;

import android.content.Context;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.pr;
public abstract class j extends FrameLayout {
    public final Paint f45219a;
    public final Paint f45220b;
    public final Paint f45221c;
    public int d;
    public final e6 f45222e;
    public boolean f45223f;
    public final k h;

    public j(k kVar, Context context) {
        super(context);
        this.h = kVar;
        Paint paint = new Paint(1);
        this.f45219a = paint;
        Paint paint2 = new Paint(1);
        this.f45220b = paint2;
        Paint paint3 = new Paint(1);
        this.f45221c = paint3;
        this.f45222e = new e6(this, 0L, 250L, pr.h);
        this.f45223f = true;
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
        k kVar = this.h;
        hk0 selectionBounds = kVar.getSelectionBounds();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.leftMargin = (int) selectionBounds.f26743a;
        layoutParams.topMargin = (int) selectionBounds.f26744b;
        layoutParams.width = (int) selectionBounds.f26745c;
        layoutParams.height = (int) selectionBounds.d;
        setLayoutParams(layoutParams);
        setRotation(kVar.getRotation());
    }

    public float getShowAlpha() {
        return this.f45222e.e(this.f45223f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: rg.j.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
