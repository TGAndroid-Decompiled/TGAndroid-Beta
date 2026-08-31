package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoIPServiceState;
import org.webrtc.OrientationHelper;
public final class uh1 extends org.telegram.ui.Components.voip.x2 {
    public final Path f41940s;
    public final RectF v;
    public final ci1 f41941w;

    public uh1(Activity activity, boolean z4, ci1 ci1Var) {
        super(activity);
        this.f41941w = ci1Var;
        this.f32466c = new AnimationNotificationsLocker();
        this.f32464a = activity;
        setSystemUiVisibility(1792);
        AndroidUtilities.lockOrientation(activity, 1);
        OrientationHelper.cameraRotationDisabled = true;
        if (!z4) {
            this.f32467e = true;
        }
        this.f41940s = new Path();
        this.v = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ci1 ci1Var = this.f41941w;
        if (ci1Var.B0 && getAlpha() != 0.0f) {
            float scaleX = ci1Var.Z.getScaleX() * ci1Var.Z.getWidth();
            float scaleY = ci1Var.Z.getScaleY() * ci1Var.Z.getHeight();
            float x10 = ci1Var.Z.getX() + ((ci1Var.Z.getWidth() - scaleX) / 2.0f);
            float y10 = ci1Var.Z.getY() + ((ci1Var.Z.getHeight() - scaleY) / 2.0f);
            canvas.save();
            Path path = this.f41940s;
            path.rewind();
            RectF rectF = this.v;
            rectF.set(x10, y10, scaleX + x10, scaleY + y10);
            float dp = AndroidUtilities.dp(4.0f);
            path.addRoundRect(rectF, dp, dp, Path.Direction.CW);
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
        ci1 ci1Var = this.f41941w;
        if (!ci1Var.D0 && !ci1Var.B0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 4 && keyEvent.getAction() == 1) {
                ci1Var.p();
                return true;
            } else if ((keyCode == 25 || keyCode == 24) && ci1Var.m0 == 15 && (sharedState = VoIPService.getSharedState()) != null) {
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
        if (this.f41941w.f35842j1) {
            return;
        }
        super.draw(canvas);
    }
}
