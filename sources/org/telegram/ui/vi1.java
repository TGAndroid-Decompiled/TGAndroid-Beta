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
public final class vi1 extends org.telegram.ui.Components.voip.v2 {
    public final Path f41017s;
    public final RectF v;
    public final dj1 f41018w;

    public vi1(Activity activity, boolean z10, dj1 dj1Var) {
        super(activity);
        this.f41018w = dj1Var;
        this.f30562c = new AnimationNotificationsLocker();
        this.f30560a = activity;
        setSystemUiVisibility(1792);
        AndroidUtilities.lockOrientation(activity, 1);
        OrientationHelper.cameraRotationDisabled = true;
        if (!z10) {
            this.e = true;
        }
        this.f41017s = new Path();
        this.v = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        dj1 dj1Var = this.f41018w;
        if (dj1Var.E0 && getAlpha() != 0.0f) {
            float scaleX = dj1Var.f35281c0.getScaleX() * dj1Var.f35281c0.getWidth();
            float scaleY = dj1Var.f35281c0.getScaleY() * dj1Var.f35281c0.getHeight();
            float x10 = dj1Var.f35281c0.getX() + ((dj1Var.f35281c0.getWidth() - scaleX) / 2.0f);
            float y3 = dj1Var.f35281c0.getY() + ((dj1Var.f35281c0.getHeight() - scaleY) / 2.0f);
            canvas.save();
            Path path = this.f41017s;
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
        dj1 dj1Var = this.f41018w;
        if (!dj1Var.G0 && !dj1Var.E0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 4 && keyEvent.getAction() == 1) {
                dj1Var.o();
                return true;
            } else if ((keyCode == 25 || keyCode == 24) && dj1Var.f35305p0 == 15 && (sharedState = VoIPService.getSharedState()) != null) {
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
        if (this.f41018w.f35301m1) {
            return;
        }
        super.draw(canvas);
    }
}
