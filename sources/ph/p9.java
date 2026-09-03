package ph;

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
import org.telegram.ui.Components.df0;
import org.telegram.ui.Components.ff0;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.rk0;
public final class p9 extends FrameLayout {
    public final Rect f42217a;
    public final Rect f42218b;
    public RenderNode f42219c;
    public final da d;

    public p9(da daVar, Activity activity) {
        super(activity);
        this.d = daVar;
        this.f42217a = new Rect();
        this.f42218b = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RecordingCanvas recordingCanvas;
        boolean z4;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 && canvas.isHardwareAccelerated() && !AndroidUtilities.makingGlobalBlurBitmap) {
            if (this.f42219c == null) {
                this.f42219c = new RenderNode("StoryRecorder.PreviewView");
            }
            this.f42219c.setPosition(0, 0, getWidth(), getHeight());
            recordingCanvas = this.f42219c.beginRecording();
            z4 = true;
        } else {
            recordingCanvas = canvas;
            z4 = false;
        }
        super.dispatchDraw(recordingCanvas);
        if (z4 && i10 >= 31) {
            this.f42219c.endRecording();
            org.telegram.ui.Components.ba baVar = this.d.f41554o0;
            if (baVar != null) {
                baVar.g(this, this.f42219c);
            }
            canvas.drawRenderNode(this.f42219c);
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
            Rect rect = this.f42217a;
            rect.set(0, i15 - AndroidUtilities.dp(120.0f), dp, i15);
            Rect rect2 = this.f42218b;
            rect2.set(i14 - AndroidUtilities.dp(40.0f), i15 - AndroidUtilities.dp(120.0f), i14, i15);
            setSystemGestureExclusionRects(Arrays.asList(rect, rect2));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        da daVar = this.d;
        ff0 ff0Var = daVar.C1;
        if (ff0Var != null) {
            rk0 rk0Var = ff0Var.e;
            rk0Var.f28483a = 0.0f;
            rk0Var.f28484b = 0.0f;
            rk0Var.f28485c = ff0Var.getMeasuredWidth();
            rk0Var.d = daVar.C1.getMeasuredHeight();
        }
        df0 df0Var = daVar.B1;
        if (df0Var != null) {
            jv0 jv0Var = df0Var.d;
            jv0Var.f26062a = df0Var.getMeasuredWidth();
            jv0Var.f26063b = daVar.B1.getMeasuredHeight();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ?? r02 = this.d.f41570s2;
        if (r02 != 0) {
            r02.l(motionEvent);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
