package vg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import ff.c0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ll;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import yf.k0;
import zf.x0;
import zf.z0;
public final class c extends FrameLayout {
    public final int f48405a = 0;
    public final Object f48406b;
    public final Object f48407c;

    public c(Context context, b6 b6Var) {
        super(context);
        this.f48407c = new c0(8);
        this.f48406b = b6Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f48405a) {
            case 0:
                c0 c0Var = (c0) this.f48407c;
                c0Var.b(f6.l1(0.65f, f6.v0(f6.f23001d6, (b6) this.f48406b)));
                c0Var.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            case 1:
            default:
                super.dispatchDraw(canvas);
                return;
            case 2:
                ((z0) this.f48406b).d(0, 0.0f, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, AndroidUtilities.dp(2.0f), getMeasuredWidth(), AndroidUtilities.dp(18.0f) + getMeasuredHeight());
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                z0 z0Var = (z0) this.f48406b;
                z0Var.f50792f.setAlpha(((x0) this.f48407c).G);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(24.0f) - 1, AndroidUtilities.dp(24.0f) - 1, z0Var.f50792f);
                canvas.restore();
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f48405a) {
            case 0:
                super.dispatchTouchEvent(motionEvent);
                return true;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        float f10;
        switch (this.f48405a) {
            case 1:
                Path path = (Path) this.f48406b;
                k0 k0Var = (k0) this.f48407c;
                if (k0Var.h != null && (((z10 = k0Var.f49901f) && view == k0Var.d) || (!z10 && view == k0Var.f49899c))) {
                    if (z10) {
                        f10 = k0Var.f49900e;
                    } else {
                        f10 = 1.0f - k0Var.f49900e;
                    }
                    canvas.save();
                    path.rewind();
                    path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (f10 * getMeasuredWidth()) / 2.0f, Path.Direction.CW);
                    canvas.clipPath(path);
                    boolean drawChild = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    return drawChild;
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onMeasure(int i9, int i10) {
        switch (this.f48405a) {
            case 2:
                super.onMeasure(i9, ll.C(2.0f, ((x0) this.f48407c).f50778s, 1073741824));
                return;
            default:
                super.onMeasure(i9, i10);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        switch (this.f48405a) {
            case 0:
                super.onSizeChanged(i9, i10, i11, i12);
                c0 c0Var = (c0) this.f48407c;
                c0Var.setBounds(0, 0, i9, i10);
                c0Var.c(0, AndroidUtilities.dp(24.0f) + getPaddingBottom());
                return;
            default:
                super.onSizeChanged(i9, i10, i11, i12);
                return;
        }
    }

    public c(x0 x0Var, Context context, z0 z0Var) {
        super(context);
        this.f48407c = x0Var;
        this.f48406b = z0Var;
    }

    public c(k0 k0Var, Context context) {
        super(context);
        this.f48407c = k0Var;
        this.f48406b = new Path();
    }
}
