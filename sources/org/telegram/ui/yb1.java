package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.KeyEvent;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoIPServiceState;
import org.webrtc.OrientationHelper;
public final class yb1 extends org.telegram.ui.Components.voip.s2 {
    public final Path f54336s;
    public final RectF f54337w;
    public wn0 f54338x;
    public final fc1 f54339y;

    public yb1(Activity activity, boolean z10, fc1 fc1Var) {
        super(activity);
        this.f54339y = fc1Var;
        this.f41224c = new h2.f((int[]) null);
        this.f41222a = activity;
        setSystemUiVisibility(1792);
        org.telegram.messenger.g0.g2(activity);
        OrientationHelper.cameraRotationDisabled = true;
        if (!z10) {
            this.f41225e = true;
        }
        this.f54336s = new Path();
        this.f54337w = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        fc1 fc1Var = this.f54339y;
        if (fc1Var.E0 && getAlpha() != 0.0f) {
            float scaleX = fc1Var.f47761d0.getScaleX() * fc1Var.f47761d0.getWidth();
            float scaleY = fc1Var.f47761d0.getScaleY() * fc1Var.f47761d0.getHeight();
            float x10 = fc1Var.f47761d0.getX() + ((fc1Var.f47761d0.getWidth() - scaleX) / 2.0f);
            float y10 = fc1Var.f47761d0.getY() + ((fc1Var.f47761d0.getHeight() - scaleY) / 2.0f);
            canvas.save();
            Path path = this.f54336s;
            path.rewind();
            RectF rectF = this.f54337w;
            rectF.set(x10, y10, scaleX + x10, scaleY + y10);
            float L = org.telegram.messenger.g0.L(4.0f);
            path.addRoundRect(rectF, L, L, Path.Direction.CW);
            path.close();
            canvas.clipPath(path);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        VoIPServiceState sharedState;
        fc1 fc1Var = this.f54339y;
        if (!fc1Var.G0 && !fc1Var.E0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 4 && keyEvent.getAction() == 1) {
                fc1Var.g();
                return true;
            } else if ((keyCode == 25 || keyCode == 24) && fc1Var.f47783p0 == 15 && (sharedState = VoIPService.getSharedState()) != null) {
                sharedState.stopRinging();
                return true;
            } else {
                return super.dispatchKeyEvent(keyEvent);
            }
        }
        return false;
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.f54339y.l1) {
            return;
        }
        super.draw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (Build.VERSION.SDK_INT >= 33 && this.f54338x == null) {
            this.f54338x = g0.a.h(this, new rb1(this.f54339y, 14));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        wn0 wn0Var;
        if (Build.VERSION.SDK_INT >= 33 && (wn0Var = this.f54338x) != null) {
            g0.a.j(this, wn0Var);
            this.f54338x = null;
        }
        super.onDetachedFromWindow();
    }
}
