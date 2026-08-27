package rh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.yy;
import org.telegram.ui.Components.zu0;

public final class q1 extends zu0 {

    public boolean f47390s0;

    public final Paint f47391t0;

    public final RectF f47392u0;

    public final x1 f47393v0;

    public q1(x1 x1Var, Context context) {
        super(context, null);
        this.f47393v0 = x1Var;
        this.f47391t0 = new Paint(1);
        new Path();
        this.f47392u0 = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        x1 x1Var = this.f47393v0;
        Rect rect = x1Var.f47576w;
        int iL1 = g6.l1(x1Var.E, x1Var.getThemedColor(g6.f23053d6));
        Paint paint = this.f47391t0;
        paint.setColor(iL1);
        if (!x1Var.A || x1Var.f47578x == null) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            super.dispatchDraw(canvas);
            return;
        }
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.f47392u0;
        rectF.set(0.0f, 0.0f, width, height);
        rectF.inset(-AndroidUtilities.dp(7.0f), -AndroidUtilities.dp(7.0f));
        float fLerp = AndroidUtilities.lerp(AndroidUtilities.dpf2(22.0f), 0.0f, x1Var.E);
        AndroidUtilities.lerp(x1Var.f47580y, rectF, x1Var.E, rectF);
        rect.set(x1Var.f47578x.getBounds());
        x1Var.f47578x.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        x1Var.f47578x.p(fLerp);
        x1Var.f47578x.setAlpha((int) ((1.0f - x1Var.E) * 255.0f));
        x1Var.f47578x.draw(canvas);
        x1Var.f47578x.setBounds(rect);
        rectF.inset(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        canvas.drawRoundRect(rectF, fLerp, fLerp, paint);
        if (x1Var.v != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.lerp(x1Var.C[0], x1Var.D[0], x1Var.E), AndroidUtilities.lerp(x1Var.C[1], x1Var.D[1], x1Var.E));
            canvas.saveLayerAlpha(0.0f, 0.0f, x1Var.v.getWidth(), x1Var.v.getHeight(), (int) ((1.0f - x1Var.E) * 255.0f), 31);
            x1Var.v.draw(canvas);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(AndroidUtilities.lerp(rectF.right, (x1Var.f47574u0.getX() + (x1Var.W.getX() + (x1Var.V.getX() + x1Var.U.getX()))) + x1Var.f47574u0.getWidth(), x1Var.E) - x1Var.v.f26189v1.getWidth(), AndroidUtilities.lerp(rectF.bottom, (x1Var.f47574u0.getY() + (x1Var.W.getY() + (x1Var.V.getY() + x1Var.U.getY()))) + x1Var.f47574u0.getHeight(), x1Var.E) - x1Var.v.f26189v1.getHeight());
            canvas.saveLayerAlpha(-AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(6.0f), x1Var.v.f26189v1.getWidth(), x1Var.v.f26189v1.getHeight(), (int) ((1.0f - x1Var.E) * 255.0f), 31);
            x1Var.v.f26189v1.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
        canvas.save();
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        x1 x1Var = this.f47393v0;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if (x1Var.q0()) {
                org.telegram.messenger.y1.q(R.string.RichEditorDraftSaved, new mc(x1Var.T, x1Var.getResourceProvider()), R.raw.contact_check, 36);
                return true;
            }
        } else if (!x1Var.L.h3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        yy yyVar;
        x1 x1Var = this.f47393v0;
        if (!x1Var.L.f47352j3.y() || !x1Var.L.f47354k3.onTouchEvent(motionEvent)) {
            int height = (!x1Var.f47581y0 || (yyVar = x1Var.f47577w0) == null) ? (getHeight() - AndroidUtilities.dp(60.0f)) - Math.max(Math.max(x1Var.f47582z0, x1Var.P0), x1Var.Q0) : (int) yyVar.getY();
            if (motionEvent.getAction() == 0 && x1Var.f47579x0 && motionEvent.getY() < height) {
                x1Var.k0(true);
            }
            if (motionEvent.getAction() == 0) {
                if (motionEvent.getY() > AndroidUtilities.dp(60.0f) + getPaddingTop() && motionEvent.getY() < height) {
                    if (x1Var.L.f47354k3.b(motionEvent)) {
                        motionEvent.setAction(3);
                    }
                }
            } else if (x1Var.L.f47354k3.b(motionEvent)) {
                motionEvent.setAction(3);
            }
            if (motionEvent.getAction() == 0) {
                this.f47390s0 = x1Var.W.getVisibility() == 0 && motionEvent.getY() >= ((float) ((getHeight() - AndroidUtilities.dp(60.0f)) - Math.max(Math.max(x1Var.f47582z0, x1Var.P0), x1Var.Q0)));
            }
            if (this.f47390s0 || !x1Var.L.i3(motionEvent)) {
                return super.dispatchTouchEvent(motionEvent);
            }
        }
        return true;
    }
}
