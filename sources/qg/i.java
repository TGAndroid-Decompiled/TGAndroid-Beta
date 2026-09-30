package qg;

import android.content.Context;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.vk0;
public abstract class i extends FrameLayout {
    public final Paint f41757a;
    public final Paint f41758b;
    public final Paint f41759c;
    public int d;
    public final e6 e;
    public boolean f41760f;
    public final j h;

    public i(j jVar, Context context) {
        super(context);
        this.h = jVar;
        Paint paint = new Paint(1);
        this.f41757a = paint;
        Paint paint2 = new Paint(1);
        this.f41758b = paint2;
        Paint paint3 = new Paint(1);
        this.f41759c = paint3;
        this.e = new e6(this, 0L, 250L, tr.h);
        this.f41760f = true;
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
        vk0 selectionBounds = jVar.getSelectionBounds();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.leftMargin = (int) selectionBounds.f29132a;
        layoutParams.topMargin = (int) selectionBounds.f29133b;
        layoutParams.width = (int) selectionBounds.f29134c;
        layoutParams.height = (int) selectionBounds.d;
        setLayoutParams(layoutParams);
        setRotation(jVar.getRotation());
    }

    public float getShowAlpha() {
        return this.e.e(this.f41760f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: qg.i.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
