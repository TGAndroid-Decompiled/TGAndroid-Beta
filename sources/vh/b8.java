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
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pu0;
import org.telegram.ui.Components.s9;
public final class b8 extends FrameLayout {
    public final Rect f51013a;
    public final Rect f51014b;
    public RenderNode f51015c;
    public final o8 d;

    public b8(o8 o8Var, Activity activity) {
        super(activity);
        this.d = o8Var;
        this.f51013a = new Rect();
        this.f51014b = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        RecordingCanvas recordingCanvas;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 && canvas.isHardwareAccelerated() && !org.telegram.messenger.i0.m0) {
            if (this.f51015c == null) {
                this.f51015c = new RenderNode("StoryRecorder.PreviewView");
            }
            this.f51015c.setPosition(0, 0, getWidth(), getHeight());
            recordingCanvas = this.f51015c.beginRecording();
            z10 = true;
        } else {
            z10 = false;
            recordingCanvas = canvas;
        }
        super.dispatchDraw(recordingCanvas);
        if (z10 && i10 >= 31) {
            this.f51015c.endRecording();
            s9 s9Var = this.d.f51658r0;
            if (s9Var != null) {
                s9Var.g(this, this.f51015c);
            }
            canvas.drawRenderNode(this.f51015c);
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
            Rect rect = this.f51013a;
            rect.set(0, i15 - org.telegram.messenger.i0.L(120.0f), L, i15);
            Rect rect2 = this.f51014b;
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
            oj0 oj0Var = he0Var.e;
            oj0Var.f29084a = 0.0f;
            oj0Var.f29085b = 0.0f;
            oj0Var.f29086c = he0Var.getMeasuredWidth();
            oj0Var.d = o8Var.F1.getMeasuredHeight();
        }
        fe0 fe0Var = o8Var.E1;
        if (fe0Var != null) {
            pu0 pu0Var = fe0Var.d;
            pu0Var.f29435a = fe0Var.getMeasuredWidth();
            pu0Var.f29436b = o8Var.E1.getMeasuredHeight();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ?? r02 = this.d.f51673v2;
        if (r02 != 0) {
            r02.i(motionEvent);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
