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
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.sk0;
public final class m9 extends FrameLayout {
    public final Rect f45772a;
    public final Rect f45773b;
    public RenderNode f45774c;
    public final ba d;

    public m9(ba baVar, Activity activity) {
        super(activity);
        this.d = baVar;
        this.f45772a = new Rect();
        this.f45773b = new Rect();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RecordingCanvas recordingCanvas;
        boolean z4;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 && canvas.isHardwareAccelerated() && !AndroidUtilities.makingGlobalBlurBitmap) {
            if (this.f45774c == null) {
                this.f45774c = new RenderNode("StoryRecorder.PreviewView");
            }
            this.f45774c.setPosition(0, 0, getWidth(), getHeight());
            recordingCanvas = this.f45774c.beginRecording();
            z4 = true;
        } else {
            recordingCanvas = canvas;
            z4 = false;
        }
        super.dispatchDraw(recordingCanvas);
        if (z4 && i10 >= 31) {
            this.f45774c.endRecording();
            org.telegram.ui.Components.ba baVar = this.d.f45085o0;
            if (baVar != null) {
                baVar.g(this, this.f45774c);
            }
            canvas.drawRenderNode(this.f45774c);
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
            Rect rect = this.f45772a;
            rect.set(0, i15 - AndroidUtilities.dp(120.0f), dp, i15);
            Rect rect2 = this.f45773b;
            rect2.set(i14 - AndroidUtilities.dp(40.0f), i15 - AndroidUtilities.dp(120.0f), i14, i15);
            setSystemGestureExclusionRects(Arrays.asList(rect, rect2));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ba baVar = this.d;
        gf0 gf0Var = baVar.C1;
        if (gf0Var != null) {
            sk0 sk0Var = gf0Var.f27154e;
            sk0Var.f31078a = 0.0f;
            sk0Var.f31079b = 0.0f;
            sk0Var.f31080c = gf0Var.getMeasuredWidth();
            sk0Var.d = baVar.C1.getMeasuredHeight();
        }
        ef0 ef0Var = baVar.B1;
        if (ef0Var != null) {
            jv0 jv0Var = ef0Var.d;
            jv0Var.f28201a = ef0Var.getMeasuredWidth();
            jv0Var.f28202b = baVar.B1.getMeasuredHeight();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ?? r02 = this.d.f45101s2;
        if (r02 != 0) {
            r02.m(motionEvent);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
