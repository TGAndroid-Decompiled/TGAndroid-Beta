package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.KeyEvent;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoIPServiceState;
import org.webrtc.OrientationHelper;
public final class rb1 extends org.telegram.ui.Components.voip.d2 {
    public final Path f49189s;
    public final RectF f49190w;
    public final zb1 f49191x;

    public rb1(Activity activity, boolean z10, zb1 zb1Var) {
        super(activity);
        this.f49191x = zb1Var;
        this.f39290c = new g2.g((int[]) null);
        this.f39288a = activity;
        setSystemUiVisibility(1792);
        org.telegram.messenger.g0.g2(activity);
        OrientationHelper.cameraRotationDisabled = true;
        if (!z10) {
            this.f39291e = true;
        }
        this.f49189s = new Path();
        this.f49190w = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        zb1 zb1Var = this.f49191x;
        if (zb1Var.F0 && getAlpha() != 0.0f) {
            float scaleX = zb1Var.f52613d0.getScaleX() * zb1Var.f52613d0.getWidth();
            float scaleY = zb1Var.f52613d0.getScaleY() * zb1Var.f52613d0.getHeight();
            float x10 = zb1Var.f52613d0.getX() + ((zb1Var.f52613d0.getWidth() - scaleX) / 2.0f);
            float y9 = zb1Var.f52613d0.getY() + ((zb1Var.f52613d0.getHeight() - scaleY) / 2.0f);
            canvas.save();
            Path path = this.f49189s;
            path.rewind();
            RectF rectF = this.f49190w;
            rectF.set(x10, y9, scaleX + x10, scaleY + y9);
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
        zb1 zb1Var = this.f49191x;
        if (!zb1Var.H0 && !zb1Var.F0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 4 && keyEvent.getAction() == 1) {
                zb1Var.j();
                return true;
            } else if ((keyCode == 25 || keyCode == 24) && zb1Var.f52637q0 == 15 && (sharedState = VoIPService.getSharedState()) != null) {
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
        if (this.f49191x.f52634n1) {
            return;
        }
        super.draw(canvas);
    }
}
