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
public final class sh1 extends org.telegram.ui.Components.voip.w2 {
    public final Path f38341s;
    public final RectF v;
    public final ai1 f38342w;

    public sh1(Activity activity, boolean z4, ai1 ai1Var) {
        super(activity);
        this.f38342w = ai1Var;
        this.f30018c = new AnimationNotificationsLocker();
        this.f30016a = activity;
        setSystemUiVisibility(1792);
        AndroidUtilities.lockOrientation(activity, 1);
        OrientationHelper.cameraRotationDisabled = true;
        if (!z4) {
            this.e = true;
        }
        this.f38341s = new Path();
        this.v = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ai1 ai1Var = this.f38342w;
        if (ai1Var.B0 && getAlpha() != 0.0f) {
            float scaleX = ai1Var.Z.getScaleX() * ai1Var.Z.getWidth();
            float scaleY = ai1Var.Z.getScaleY() * ai1Var.Z.getHeight();
            float x10 = ai1Var.Z.getX() + ((ai1Var.Z.getWidth() - scaleX) / 2.0f);
            float y10 = ai1Var.Z.getY() + ((ai1Var.Z.getHeight() - scaleY) / 2.0f);
            canvas.save();
            Path path = this.f38341s;
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
        ai1 ai1Var = this.f38342w;
        if (!ai1Var.D0 && !ai1Var.B0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 4 && keyEvent.getAction() == 1) {
                ai1Var.p();
                return true;
            } else if ((keyCode == 25 || keyCode == 24) && ai1Var.m0 == 15 && (sharedState = VoIPService.getSharedState()) != null) {
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
        if (this.f38342w.f32621j1) {
            return;
        }
        super.draw(canvas);
    }
}
