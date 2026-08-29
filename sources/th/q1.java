package th;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.tc;
public final class q1 extends hv0 {
    public boolean f48688s0;
    public final Paint f48689t0;
    public final RectF f48690u0;
    public final x1 f48691v0;

    public q1(x1 x1Var, Context context) {
        super(context, null);
        this.f48691v0 = x1Var;
        this.f48689t0 = new Paint(1);
        new Path();
        this.f48690u0 = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        x1 x1Var = this.f48691v0;
        Rect rect = x1Var.f48874w;
        int l1 = g6.l1(x1Var.E, x1Var.getThemedColor(g6.f23062d6));
        Paint paint = this.f48689t0;
        paint.setColor(l1);
        if (x1Var.A && x1Var.f48876x != null) {
            RectF rectF = this.f48690u0;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            rectF.inset(-AndroidUtilities.dp(7.0f), -AndroidUtilities.dp(7.0f));
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dpf2(22.0f), 0.0f, x1Var.E);
            AndroidUtilities.lerp(x1Var.f48878y, rectF, x1Var.E, rectF);
            rect.set(x1Var.f48876x.getBounds());
            x1Var.f48876x.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            x1Var.f48876x.p(lerp);
            x1Var.f48876x.setAlpha((int) ((1.0f - x1Var.E) * 255.0f));
            x1Var.f48876x.draw(canvas);
            x1Var.f48876x.setBounds(rect);
            rectF.inset(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
            canvas.drawRoundRect(rectF, lerp, lerp, paint);
            if (x1Var.v != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.lerp(x1Var.C[0], x1Var.D[0], x1Var.E), AndroidUtilities.lerp(x1Var.C[1], x1Var.D[1], x1Var.E));
                canvas.saveLayerAlpha(0.0f, 0.0f, x1Var.v.getWidth(), x1Var.v.getHeight(), (int) ((1.0f - x1Var.E) * 255.0f), 31);
                x1Var.v.draw(canvas);
                canvas.restore();
                canvas.restore();
                canvas.save();
                canvas.translate(AndroidUtilities.lerp(rectF.right, (x1Var.f48872u0.getX() + (x1Var.W.getX() + (x1Var.V.getX() + x1Var.U.getX()))) + x1Var.f48872u0.getWidth(), x1Var.E) - x1Var.v.f26204v1.getWidth(), AndroidUtilities.lerp(rectF.bottom, (x1Var.f48872u0.getY() + (x1Var.W.getY() + (x1Var.V.getY() + x1Var.U.getY()))) + x1Var.f48872u0.getHeight(), x1Var.E) - x1Var.v.f26204v1.getHeight());
                canvas.saveLayerAlpha(-AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(6.0f), x1Var.v.f26204v1.getWidth(), x1Var.v.f26204v1.getHeight(), (int) ((1.0f - x1Var.E) * 255.0f), 31);
                x1Var.v.f26204v1.draw(canvas);
                canvas.restore();
                canvas.restore();
            }
            canvas.save();
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        x1 x1Var = this.f48691v0;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if (x1Var.q0()) {
                j7.l1.v(R.string.RichEditorDraftSaved, new tc(x1Var.T, x1Var.getResourceProvider()), R.raw.contact_check, 36);
                return true;
            }
        } else if (!x1Var.L.h3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: th.q1.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }
}
