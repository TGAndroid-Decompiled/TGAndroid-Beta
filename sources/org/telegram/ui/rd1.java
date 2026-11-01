package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.KeyEvent;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoIPServiceState;
import org.webrtc.OrientationHelper;
public final class rd1 extends org.telegram.ui.Components.voip.d2 {
    public final Path f41062s;
    public final RectF f41063w;
    public final zd1 f41064x;

    public rd1(Activity activity, boolean z10, zd1 zd1Var) {
        super(activity);
        this.f41064x = zd1Var;
        this.f31447c = new e2.f((int[]) null);
        this.f31445a = activity;
        setSystemUiVisibility(1792);
        org.telegram.messenger.i0.g2(activity);
        OrientationHelper.cameraRotationDisabled = true;
        if (!z10) {
            this.e = true;
        }
        this.f41062s = new Path();
        this.f41063w = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        zd1 zd1Var = this.f41064x;
        if (zd1Var.E0 && getAlpha() != 0.0f) {
            float scaleX = zd1Var.f43942c0.getScaleX() * zd1Var.f43942c0.getWidth();
            float scaleY = zd1Var.f43942c0.getScaleY() * zd1Var.f43942c0.getHeight();
            float x10 = zd1Var.f43942c0.getX() + ((zd1Var.f43942c0.getWidth() - scaleX) / 2.0f);
            float y3 = zd1Var.f43942c0.getY() + ((zd1Var.f43942c0.getHeight() - scaleY) / 2.0f);
            canvas.save();
            Path path = this.f41062s;
            path.rewind();
            RectF rectF = this.f41063w;
            rectF.set(x10, y3, scaleX + x10, scaleY + y3);
            float L = org.telegram.messenger.i0.L(4.0f);
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
        zd1 zd1Var = this.f41064x;
        if (!zd1Var.G0 && !zd1Var.E0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 4 && keyEvent.getAction() == 1) {
                zd1Var.j();
                return true;
            } else if ((keyCode == 25 || keyCode == 24) && zd1Var.f43966p0 == 15 && (sharedState = VoIPService.getSharedState()) != null) {
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
        if (this.f41064x.f43962m1) {
            return;
        }
        super.draw(canvas);
    }
}
