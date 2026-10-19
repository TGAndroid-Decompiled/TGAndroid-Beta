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
public final class zg1 extends org.telegram.ui.Components.voip.u2 {
    public final Path f43747s;
    public final RectF v;
    public final hh1 f43748w;

    public zg1(Activity activity, boolean z10, hh1 hh1Var) {
        super(activity);
        this.f43748w = hh1Var;
        this.f31822c = new AnimationNotificationsLocker();
        this.f31820a = activity;
        setSystemUiVisibility(1792);
        AndroidUtilities.lockOrientation(activity, 1);
        OrientationHelper.cameraRotationDisabled = true;
        if (!z10) {
            this.e = true;
        }
        this.f43747s = new Path();
        this.v = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        hh1 hh1Var = this.f43748w;
        if (hh1Var.E0 && getAlpha() != 0.0f) {
            float scaleX = hh1Var.f37631c0.getScaleX() * hh1Var.f37631c0.getWidth();
            float scaleY = hh1Var.f37631c0.getScaleY() * hh1Var.f37631c0.getHeight();
            float x10 = hh1Var.f37631c0.getX() + ((hh1Var.f37631c0.getWidth() - scaleX) / 2.0f);
            float y3 = hh1Var.f37631c0.getY() + ((hh1Var.f37631c0.getHeight() - scaleY) / 2.0f);
            canvas.save();
            Path path = this.f43747s;
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
        hh1 hh1Var = this.f43748w;
        if (!hh1Var.G0 && !hh1Var.E0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 4 && keyEvent.getAction() == 1) {
                hh1Var.o();
                return true;
            } else if ((keyCode == 25 || keyCode == 24) && hh1Var.f37655p0 == 15 && (sharedState = VoIPService.getSharedState()) != null) {
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
        if (this.f43748w.f37651m1) {
            return;
        }
        super.draw(canvas);
    }
}
