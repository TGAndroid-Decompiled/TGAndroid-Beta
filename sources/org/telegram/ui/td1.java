package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.KeyEvent;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoIPServiceState;
import org.webrtc.OrientationHelper;
public final class td1 extends org.telegram.ui.Components.voip.c2 {
    public final Path f41818s;
    public final RectF f41819w;
    public final be1 f41820x;

    public td1(Activity activity, boolean z10, be1 be1Var) {
        super(activity);
        this.f41820x = be1Var;
        this.f31370c = new e2.f(null);
        this.f31368a = activity;
        setSystemUiVisibility(1792);
        org.telegram.messenger.i0.g2(activity);
        OrientationHelper.cameraRotationDisabled = true;
        if (!z10) {
            this.e = true;
        }
        this.f41818s = new Path();
        this.f41819w = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        be1 be1Var = this.f41820x;
        if (be1Var.E0 && getAlpha() != 0.0f) {
            float scaleX = be1Var.f36203c0.getScaleX() * be1Var.f36203c0.getWidth();
            float scaleY = be1Var.f36203c0.getScaleY() * be1Var.f36203c0.getHeight();
            float x10 = be1Var.f36203c0.getX() + ((be1Var.f36203c0.getWidth() - scaleX) / 2.0f);
            float y3 = be1Var.f36203c0.getY() + ((be1Var.f36203c0.getHeight() - scaleY) / 2.0f);
            canvas.save();
            Path path = this.f41818s;
            path.rewind();
            RectF rectF = this.f41819w;
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
        be1 be1Var = this.f41820x;
        if (!be1Var.G0 && !be1Var.E0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 4 && keyEvent.getAction() == 1) {
                be1Var.j();
                return true;
            } else if ((keyCode == 25 || keyCode == 24) && be1Var.f36227p0 == 15 && (sharedState = VoIPService.getSharedState()) != null) {
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
        if (this.f41820x.f36223m1) {
            return;
        }
        super.draw(canvas);
    }
}
