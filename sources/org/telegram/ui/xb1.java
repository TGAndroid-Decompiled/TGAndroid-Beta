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
public final class xb1 extends org.telegram.ui.Components.voip.o2 {
    public final Path f51812s;
    public final RectF f51813w;
    public sn0 f51814x;
    public final ec1 f51815y;

    public xb1(Activity activity, boolean z9, ec1 ec1Var) {
        super(activity);
        this.f51815y = ec1Var;
        this.f39388c = new h2.f((int[]) null);
        this.f39386a = activity;
        setSystemUiVisibility(1792);
        org.telegram.messenger.g0.g2(activity);
        OrientationHelper.cameraRotationDisabled = true;
        if (!z9) {
            this.f39389e = true;
        }
        this.f51812s = new Path();
        this.f51813w = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ec1 ec1Var = this.f51815y;
        if (ec1Var.D0 && getAlpha() != 0.0f) {
            float scaleX = ec1Var.f45249c0.getScaleX() * ec1Var.f45249c0.getWidth();
            float scaleY = ec1Var.f45249c0.getScaleY() * ec1Var.f45249c0.getHeight();
            float x10 = ec1Var.f45249c0.getX() + ((ec1Var.f45249c0.getWidth() - scaleX) / 2.0f);
            float y10 = ec1Var.f45249c0.getY() + ((ec1Var.f45249c0.getHeight() - scaleY) / 2.0f);
            canvas.save();
            Path path = this.f51812s;
            path.rewind();
            RectF rectF = this.f51813w;
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
        ec1 ec1Var = this.f51815y;
        if (!ec1Var.F0 && !ec1Var.D0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 4 && keyEvent.getAction() == 1) {
                ec1Var.g();
                return true;
            } else if ((keyCode == 25 || keyCode == 24) && ec1Var.f45272o0 == 15 && (sharedState = VoIPService.getSharedState()) != null) {
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
        if (this.f51815y.f45268k1) {
            return;
        }
        super.draw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (Build.VERSION.SDK_INT >= 33 && this.f51814x == null) {
            this.f51814x = g0.a.h(this, new qb1(this.f51815y, 14));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        sn0 sn0Var;
        if (Build.VERSION.SDK_INT >= 33 && (sn0Var = this.f51814x) != null) {
            g0.a.j(this, sn0Var);
            this.f51814x = null;
        }
        super.onDetachedFromWindow();
    }
}
