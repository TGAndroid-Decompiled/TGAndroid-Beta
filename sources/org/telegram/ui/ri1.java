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
public final class ri1 extends org.telegram.ui.Components.voip.w2 {
    public final Path f36377s;
    public final RectF v;
    public final zi1 f36378w;

    public ri1(Activity activity, boolean z10, zi1 zi1Var) {
        super(activity);
        this.f36378w = zi1Var;
        this.f28523c = new AnimationNotificationsLocker();
        this.f28521a = activity;
        setSystemUiVisibility(1792);
        AndroidUtilities.lockOrientation(activity, 1);
        OrientationHelper.cameraRotationDisabled = true;
        if (!z10) {
            this.e = true;
        }
        this.f36377s = new Path();
        this.v = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        zi1 zi1Var = this.f36378w;
        if (zi1Var.E0 && getAlpha() != 0.0f) {
            float scaleX = zi1Var.f39363c0.getScaleX() * zi1Var.f39363c0.getWidth();
            float scaleY = zi1Var.f39363c0.getScaleY() * zi1Var.f39363c0.getHeight();
            float x10 = zi1Var.f39363c0.getX() + ((zi1Var.f39363c0.getWidth() - scaleX) / 2.0f);
            float y3 = zi1Var.f39363c0.getY() + ((zi1Var.f39363c0.getHeight() - scaleY) / 2.0f);
            canvas.save();
            Path path = this.f36377s;
            path.rewind();
            RectF rectF = this.v;
            rectF.set(x10, y3, scaleX + x10, scaleY + y3);
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
        zi1 zi1Var = this.f36378w;
        if (!zi1Var.G0 && !zi1Var.E0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 4 && keyEvent.getAction() == 1) {
                zi1Var.p();
                return true;
            } else if ((keyCode == 25 || keyCode == 24) && zi1Var.f39387p0 == 15 && (sharedState = VoIPService.getSharedState()) != null) {
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
        if (this.f36378w.f39383m1) {
            return;
        }
        super.draw(canvas);
    }
}
