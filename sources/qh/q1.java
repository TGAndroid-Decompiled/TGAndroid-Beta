package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.xu0;
public final class q1 extends xu0 {
    public boolean f46627s0;
    public final Paint f46628t0;
    public final RectF f46629u0;
    public final x1 f46630v0;

    public q1(x1 x1Var, Context context) {
        super(context, null);
        this.f46630v0 = x1Var;
        this.f46628t0 = new Paint(1);
        new Path();
        this.f46629u0 = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        x1 x1Var = this.f46630v0;
        Rect rect = x1Var.f46820w;
        int l1 = f6.l1(x1Var.E, x1Var.getThemedColor(f6.f23001d6));
        Paint paint = this.f46628t0;
        paint.setColor(l1);
        if (x1Var.A && x1Var.f46822x != null) {
            RectF rectF = this.f46629u0;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            rectF.inset(-AndroidUtilities.dp(7.0f), -AndroidUtilities.dp(7.0f));
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dpf2(22.0f), 0.0f, x1Var.E);
            AndroidUtilities.lerp(x1Var.f46824y, rectF, x1Var.E, rectF);
            rect.set(x1Var.f46822x.getBounds());
            x1Var.f46822x.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            x1Var.f46822x.p(lerp);
            x1Var.f46822x.setAlpha((int) ((1.0f - x1Var.E) * 255.0f));
            x1Var.f46822x.draw(canvas);
            x1Var.f46822x.setBounds(rect);
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
                canvas.translate(AndroidUtilities.lerp(rectF.right, (x1Var.f46818u0.getX() + (x1Var.W.getX() + (x1Var.V.getX() + x1Var.U.getX()))) + x1Var.f46818u0.getWidth(), x1Var.E) - x1Var.v.f26193v1.getWidth(), AndroidUtilities.lerp(rectF.bottom, (x1Var.f46818u0.getY() + (x1Var.W.getY() + (x1Var.V.getY() + x1Var.U.getY()))) + x1Var.f46818u0.getHeight(), x1Var.E) - x1Var.v.f26193v1.getHeight());
                canvas.saveLayerAlpha(-AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(6.0f), x1Var.v.f26193v1.getWidth(), x1Var.v.f26193v1.getHeight(), (int) ((1.0f - x1Var.E) * 255.0f), 31);
                x1Var.v.f26193v1.draw(canvas);
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
        x1 x1Var = this.f46630v0;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if (x1Var.p0()) {
                org.telegram.messenger.l0.p(R.string.RichEditorDraftSaved, new oc(x1Var.T, x1Var.getResourceProvider()), R.raw.contact_check, 36);
                return true;
            }
        } else if (!x1Var.L.h3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: qh.q1.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }
}
