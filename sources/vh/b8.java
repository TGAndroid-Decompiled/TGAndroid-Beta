package vh;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RenderNode;
import android.os.Build;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.Arrays;
import org.telegram.ui.Components.fe0;
import org.telegram.ui.Components.he0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.s9;
public final class b8 extends FrameLayout {
    public final Rect f51020a;
    public final Rect f51021b;
    public RenderNode f51022c;
    public final o8 d;

    public b8(o8 o8Var, Activity activity) {
        super(activity);
        this.d = o8Var;
        this.f51020a = new Rect();
        this.f51021b = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        RecordingCanvas recordingCanvas;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 && canvas.isHardwareAccelerated() && !org.telegram.messenger.i0.m0) {
            if (this.f51022c == null) {
                this.f51022c = new RenderNode("StoryRecorder.PreviewView");
            }
            this.f51022c.setPosition(0, 0, getWidth(), getHeight());
            recordingCanvas = this.f51022c.beginRecording();
            z10 = true;
        } else {
            z10 = false;
            recordingCanvas = canvas;
        }
        super.dispatchDraw(recordingCanvas);
        if (z10 && i10 >= 31) {
            this.f51022c.endRecording();
            s9 s9Var = this.d.f51673r0;
            if (s9Var != null) {
                s9Var.g(this, this.f51022c);
            }
            canvas.drawRenderNode(this.f51022c);
        }
    }

    @Override
    public final void invalidate() {
        ValueAnimator valueAnimator = this.d.E;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (Build.VERSION.SDK_INT >= 29) {
            int i14 = i12 - i10;
            int i15 = i13 - i11;
            int L = org.telegram.messenger.i0.L(40.0f);
            Rect rect = this.f51020a;
            rect.set(0, i15 - org.telegram.messenger.i0.L(120.0f), L, i15);
            Rect rect2 = this.f51021b;
            rect2.set(i14 - org.telegram.messenger.i0.L(40.0f), i15 - org.telegram.messenger.i0.L(120.0f), i14, i15);
            setSystemGestureExclusionRects(Arrays.asList(rect, rect2));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        o8 o8Var = this.d;
        he0 he0Var = o8Var.F1;
        if (he0Var != null) {
            pj0 pj0Var = he0Var.e;
            pj0Var.f29439a = 0.0f;
            pj0Var.f29440b = 0.0f;
            pj0Var.f29441c = he0Var.getMeasuredWidth();
            pj0Var.d = o8Var.F1.getMeasuredHeight();
        }
        fe0 fe0Var = o8Var.E1;
        if (fe0Var != null) {
            qu0 qu0Var = fe0Var.d;
            qu0Var.f29808a = fe0Var.getMeasuredWidth();
            qu0Var.f29809b = o8Var.E1.getMeasuredHeight();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ?? r02 = this.d.f51688v2;
        if (r02 != 0) {
            r02.i(motionEvent);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
