package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qv0;
public final class r1 extends qv0 {
    public boolean f46180t0;
    public final Paint f46181u0;
    public final RectF f46182v0;
    public final y1 f46183w0;

    public r1(y1 y1Var, Context context) {
        super(context, null);
        this.f46183w0 = y1Var;
        this.f46181u0 = new Paint(1);
        new Path();
        this.f46182v0 = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        y1 y1Var = this.f46183w0;
        Rect rect = y1Var.f46402w;
        int l1 = j6.l1(y1Var.F, y1Var.getThemedColor(j6.f19881d6));
        Paint paint = this.f46181u0;
        paint.setColor(l1);
        if (y1Var.B && y1Var.f46404x != null) {
            RectF rectF = this.f46182v0;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            rectF.inset(-AndroidUtilities.dp(7.0f), -AndroidUtilities.dp(7.0f));
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dpf2(22.0f), 0.0f, y1Var.F);
            AndroidUtilities.lerp(y1Var.f46406y, rectF, y1Var.F, rectF);
            rect.set(y1Var.f46404x.getBounds());
            y1Var.f46404x.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            y1Var.f46404x.p(lerp);
            y1Var.f46404x.setAlpha((int) ((1.0f - y1Var.F) * 255.0f));
            y1Var.f46404x.draw(canvas);
            y1Var.f46404x.setBounds(rect);
            rectF.inset(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
            canvas.drawRoundRect(rectF, lerp, lerp, paint);
            if (y1Var.v != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.lerp(y1Var.D[0], y1Var.E[0], y1Var.F), AndroidUtilities.lerp(y1Var.D[1], y1Var.E[1], y1Var.F));
                canvas.saveLayerAlpha(0.0f, 0.0f, y1Var.v.getWidth(), y1Var.v.getHeight(), (int) ((1.0f - y1Var.F) * 255.0f), 31);
                y1Var.v.draw(canvas);
                canvas.restore();
                canvas.restore();
                canvas.save();
                canvas.translate(AndroidUtilities.lerp(rectF.right, (y1Var.f46401v0.getX() + (y1Var.X.getX() + (y1Var.W.getX() + y1Var.V.getX()))) + y1Var.f46401v0.getWidth(), y1Var.F) - y1Var.v.f22827w1.getWidth(), AndroidUtilities.lerp(rectF.bottom, (y1Var.f46401v0.getY() + (y1Var.X.getY() + (y1Var.W.getY() + y1Var.V.getY()))) + y1Var.f46401v0.getHeight(), y1Var.F) - y1Var.v.f22827w1.getHeight());
                canvas.saveLayerAlpha(-AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(6.0f), y1Var.v.f22827w1.getWidth(), y1Var.v.f22827w1.getHeight(), (int) ((1.0f - y1Var.F) * 255.0f), 31);
                y1Var.v.f22827w1.draw(canvas);
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
        y1 y1Var = this.f46183w0;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if (y1Var.q0()) {
                kf.k0.v(R.string.RichEditorDraftSaved, new qc(y1Var.U, y1Var.getResourceProvider()), R.raw.contact_check, 36);
                return true;
            }
        } else if (!y1Var.M.g3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: vh.r1.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }
}
