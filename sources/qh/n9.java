package qh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ef0;
import org.telegram.ui.Components.gf0;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.tk0;
public final class n9 extends FrameLayout {
    public final Rect f45795a;
    public final Rect f45796b;
    public RenderNode f45797c;
    public final ca d;

    public n9(ca caVar, Activity activity) {
        super(activity);
        this.d = caVar;
        this.f45795a = new Rect();
        this.f45796b = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RecordingCanvas recordingCanvas;
        boolean z4;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 && canvas.isHardwareAccelerated() && !AndroidUtilities.makingGlobalBlurBitmap) {
            if (this.f45797c == null) {
                this.f45797c = new RenderNode("StoryRecorder.PreviewView");
            }
            this.f45797c.setPosition(0, 0, getWidth(), getHeight());
            recordingCanvas = this.f45797c.beginRecording();
            z4 = true;
        } else {
            recordingCanvas = canvas;
            z4 = false;
        }
        super.dispatchDraw(recordingCanvas);
        if (z4 && i10 >= 31) {
            this.f45797c.endRecording();
            org.telegram.ui.Components.ba baVar = this.d.f45119o0;
            if (baVar != null) {
                baVar.g(this, this.f45797c);
            }
            canvas.drawRenderNode(this.f45797c);
        }
    }

    @Override
    public final void invalidate() {
        ValueAnimator valueAnimator = this.d.B;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        if (Build.VERSION.SDK_INT >= 29) {
            int i14 = i12 - i10;
            int i15 = i13 - i11;
            int dp = AndroidUtilities.dp(40.0f);
            Rect rect = this.f45795a;
            rect.set(0, i15 - AndroidUtilities.dp(120.0f), dp, i15);
            Rect rect2 = this.f45796b;
            rect2.set(i14 - AndroidUtilities.dp(40.0f), i15 - AndroidUtilities.dp(120.0f), i14, i15);
            setSystemGestureExclusionRects(Arrays.asList(rect, rect2));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ca caVar = this.d;
        gf0 gf0Var = caVar.C1;
        if (gf0Var != null) {
            tk0 tk0Var = gf0Var.f27176e;
            tk0Var.f31355a = 0.0f;
            tk0Var.f31356b = 0.0f;
            tk0Var.f31357c = gf0Var.getMeasuredWidth();
            tk0Var.d = caVar.C1.getMeasuredHeight();
        }
        ef0 ef0Var = caVar.B1;
        if (ef0Var != null) {
            kv0 kv0Var = ef0Var.d;
            kv0Var.f28463a = ef0Var.getMeasuredWidth();
            kv0Var.f28464b = caVar.B1.getMeasuredHeight();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ?? r02 = this.d.f45135s2;
        if (r02 != 0) {
            r02.m(motionEvent);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
