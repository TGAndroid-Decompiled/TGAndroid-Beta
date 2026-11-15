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
public final class xb1 extends org.telegram.ui.Components.voip.s2 {
    public final Path f53165s;
    public final RectF f53166w;
    public tn0 f53167x;
    public final ec1 f53168y;

    public xb1(Activity activity, boolean z10, ec1 ec1Var) {
        super(activity);
        this.f53168y = ec1Var;
        this.f40947c = new h2.f((int[]) null);
        this.f40945a = activity;
        setSystemUiVisibility(1792);
        org.telegram.messenger.g0.g2(activity);
        OrientationHelper.cameraRotationDisabled = true;
        if (!z10) {
            this.f40948e = true;
        }
        this.f53165s = new Path();
        this.f53166w = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ec1 ec1Var = this.f53168y;
        if (ec1Var.E0 && getAlpha() != 0.0f) {
            float scaleX = ec1Var.f46680d0.getScaleX() * ec1Var.f46680d0.getWidth();
            float scaleY = ec1Var.f46680d0.getScaleY() * ec1Var.f46680d0.getHeight();
            float x10 = ec1Var.f46680d0.getX() + ((ec1Var.f46680d0.getWidth() - scaleX) / 2.0f);
            float y10 = ec1Var.f46680d0.getY() + ((ec1Var.f46680d0.getHeight() - scaleY) / 2.0f);
            canvas.save();
            Path path = this.f53165s;
            path.rewind();
            RectF rectF = this.f53166w;
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
        ec1 ec1Var = this.f53168y;
        if (!ec1Var.G0 && !ec1Var.E0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 4 && keyEvent.getAction() == 1) {
                ec1Var.g();
                return true;
            } else if ((keyCode == 25 || keyCode == 24) && ec1Var.f46702p0 == 15 && (sharedState = VoIPService.getSharedState()) != null) {
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
        if (this.f53168y.l1) {
            return;
        }
        super.draw(canvas);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (Build.VERSION.SDK_INT >= 33 && this.f53167x == null) {
            this.f53167x = ai.d.j(this, new qb1(this.f53168y, 14));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        tn0 tn0Var;
        if (Build.VERSION.SDK_INT >= 33 && (tn0Var = this.f53167x) != null) {
            ai.d.l(this, tn0Var);
            this.f53167x = null;
        }
        super.onDetachedFromWindow();
    }
}
