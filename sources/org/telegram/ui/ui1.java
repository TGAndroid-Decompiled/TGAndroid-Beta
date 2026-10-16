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
public final class ui1 extends org.telegram.ui.Components.voip.v2 {
    public final Path f40415s;
    public final RectF v;
    public final cj1 f40416w;

    public ui1(Activity activity, boolean z10, cj1 cj1Var) {
        super(activity);
        this.f40416w = cj1Var;
        this.f30231c = new AnimationNotificationsLocker();
        this.f30229a = activity;
        setSystemUiVisibility(1792);
        AndroidUtilities.lockOrientation(activity, 1);
        OrientationHelper.cameraRotationDisabled = true;
        if (!z10) {
            this.e = true;
        }
        this.f40415s = new Path();
        this.v = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        cj1 cj1Var = this.f40416w;
        if (cj1Var.E0 && getAlpha() != 0.0f) {
            float scaleX = cj1Var.f34683c0.getScaleX() * cj1Var.f34683c0.getWidth();
            float scaleY = cj1Var.f34683c0.getScaleY() * cj1Var.f34683c0.getHeight();
            float x10 = cj1Var.f34683c0.getX() + ((cj1Var.f34683c0.getWidth() - scaleX) / 2.0f);
            float y3 = cj1Var.f34683c0.getY() + ((cj1Var.f34683c0.getHeight() - scaleY) / 2.0f);
            canvas.save();
            Path path = this.f40415s;
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
        cj1 cj1Var = this.f40416w;
        if (!cj1Var.G0 && !cj1Var.E0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 4 && keyEvent.getAction() == 1) {
                cj1Var.o();
                return true;
            } else if ((keyCode == 25 || keyCode == 24) && cj1Var.f34707p0 == 15 && (sharedState = VoIPService.getSharedState()) != null) {
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
        if (this.f40416w.f34703m1) {
            return;
        }
        super.draw(canvas);
    }
}
