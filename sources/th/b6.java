package th;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.media.AudioManager;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.ui.Components.ew;
public final class b6 extends View {
    public Paint f48804a;
    public boolean f48805b;
    public ew f48806c;
    public org.telegram.ui.Components.t5 d;
    public org.telegram.ui.Components.t5 e;
    public float f48807f;

    public final void a(boolean z10) {
        ew ewVar = this.f48806c;
        AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        float f7 = streamMaxVolume;
        int max = (int) Math.max(1.0f, f7 / 15.0f);
        if (z10) {
            int i10 = streamVolume + max;
            if (i10 <= streamMaxVolume) {
                streamMaxVolume = i10;
            }
        } else {
            streamMaxVolume = streamVolume - max;
            if (streamMaxVolume < 0) {
                streamMaxVolume = 0;
            }
        }
        audioManager.setStreamVolume(3, streamMaxVolume, 0);
        float f10 = streamMaxVolume / f7;
        this.f48807f = f10;
        if (!this.f48805b) {
            this.e.e(true, f10);
        }
        invalidate();
        this.f48805b = true;
        org.telegram.messenger.i0.r(ewVar);
        org.telegram.messenger.i0.h3(ewVar, 2000L);
    }

    public final void b() {
        int i10;
        ew ewVar = this.f48806c;
        AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        if (Build.VERSION.SDK_INT >= 28) {
            i10 = audioManager.getStreamMinVolume(3);
        } else {
            i10 = 0;
        }
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamVolume <= i10) {
            a(true);
        } else if (!this.f48805b) {
            float f7 = streamVolume / streamMaxVolume;
            this.f48807f = f7;
            this.e.e(true, f7);
            this.f48805b = true;
            invalidate();
            org.telegram.messenger.i0.r(ewVar);
            org.telegram.messenger.i0.h3(ewVar, 2000L);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        Paint paint = this.f48804a;
        super.onDraw(canvas);
        org.telegram.ui.Components.t5 t5Var = this.e;
        t5Var.e(false, this.f48807f);
        org.telegram.ui.Components.t5 t5Var2 = this.d;
        if (this.f48805b) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        t5Var2.e(false, f7);
        if (t5Var2.f30445c != 0.0f) {
            float measuredHeight = getMeasuredHeight() / 2.0f;
            paint.setAlpha((int) (t5Var2.f30445c * 255.0f));
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(0.0f, 0.0f, getMeasuredWidth() * t5Var.f30445c, getMeasuredHeight());
            canvas.drawRoundRect(rectF, measuredHeight, measuredHeight, paint);
        }
    }

    @Override
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && i10 == 24) {
            a(true);
            return true;
        } else if (keyEvent.getAction() == 0 && i10 == 25) {
            a(false);
            return true;
        } else {
            return super.onKeyDown(i10, keyEvent);
        }
    }
}
