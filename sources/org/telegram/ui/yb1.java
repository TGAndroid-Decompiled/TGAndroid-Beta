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
public final class yb1 extends org.telegram.ui.Components.voip.o2 {
    public final Path f52189s;
    public final RectF f52190w;
    public sn0 f52191x;
    public final fc1 f52192y;

    public yb1(Activity activity, boolean z9, fc1 fc1Var) {
        super(activity);
        this.f52192y = fc1Var;
        this.f39441c = new h2.f((int[]) null);
        this.f39439a = activity;
        setSystemUiVisibility(1792);
        org.telegram.messenger.g0.g2(activity);
        OrientationHelper.cameraRotationDisabled = true;
        if (!z9) {
            this.f39442e = true;
        }
        this.f52189s = new Path();
        this.f52190w = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        fc1 fc1Var = this.f52192y;
        if (fc1Var.D0 && getAlpha() != 0.0f) {
            float scaleX = fc1Var.f45546c0.getScaleX() * fc1Var.f45546c0.getWidth();
            float scaleY = fc1Var.f45546c0.getScaleY() * fc1Var.f45546c0.getHeight();
            float x10 = fc1Var.f45546c0.getX() + ((fc1Var.f45546c0.getWidth() - scaleX) / 2.0f);
            float y10 = fc1Var.f45546c0.getY() + ((fc1Var.f45546c0.getHeight() - scaleY) / 2.0f);
            canvas.save();
            Path path = this.f52189s;
            path.rewind();
            RectF rectF = this.f52190w;
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
        fc1 fc1Var = this.f52192y;
        if (!fc1Var.F0 && !fc1Var.D0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 4 && keyEvent.getAction() == 1) {
                fc1Var.g();
                return true;
            } else if ((keyCode == 25 || keyCode == 24) && fc1Var.f45569o0 == 15 && (sharedState = VoIPService.getSharedState()) != null) {
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
        if (this.f52192y.f45565k1) {
            return;
        }
        super.draw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (Build.VERSION.SDK_INT >= 33 && this.f52191x == null) {
            this.f52191x = g0.a.h(this, new rb1(this.f52192y, 14));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        sn0 sn0Var;
        if (Build.VERSION.SDK_INT >= 33 && (sn0Var = this.f52191x) != null) {
            g0.a.j(this, sn0Var);
            this.f52191x = null;
        }
        super.onDetachedFromWindow();
    }
}
