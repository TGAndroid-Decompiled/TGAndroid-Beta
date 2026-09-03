package wh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.qc;
public final class r1 extends pv0 {
    public boolean f50003t0;
    public final Paint f50004u0;
    public final RectF f50005v0;
    public final z1 f50006w0;

    public r1(z1 z1Var, Context context) {
        super(context, null);
        this.f50006w0 = z1Var;
        this.f50004u0 = new Paint(1);
        new Path();
        this.f50005v0 = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        z1 z1Var = this.f50006w0;
        Rect rect = z1Var.f50247w;
        int l1 = k6.l1(z1Var.F, z1Var.getThemedColor(k6.f21661d6));
        Paint paint = this.f50004u0;
        paint.setColor(l1);
        if (z1Var.B && z1Var.f50249x != null) {
            RectF rectF = this.f50005v0;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            rectF.inset(-AndroidUtilities.dp(7.0f), -AndroidUtilities.dp(7.0f));
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dpf2(22.0f), 0.0f, z1Var.F);
            AndroidUtilities.lerp(z1Var.f50251y, rectF, z1Var.F, rectF);
            rect.set(z1Var.f50249x.getBounds());
            z1Var.f50249x.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            z1Var.f50249x.p(lerp);
            z1Var.f50249x.setAlpha((int) ((1.0f - z1Var.F) * 255.0f));
            z1Var.f50249x.draw(canvas);
            z1Var.f50249x.setBounds(rect);
            rectF.inset(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
            canvas.drawRoundRect(rectF, lerp, lerp, paint);
            if (z1Var.v != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.lerp(z1Var.D[0], z1Var.E[0], z1Var.F), AndroidUtilities.lerp(z1Var.D[1], z1Var.E[1], z1Var.F));
                canvas.saveLayerAlpha(0.0f, 0.0f, z1Var.v.getWidth(), z1Var.v.getHeight(), (int) ((1.0f - z1Var.F) * 255.0f), 31);
                z1Var.v.draw(canvas);
                canvas.restore();
                canvas.restore();
                canvas.save();
                canvas.translate(AndroidUtilities.lerp(rectF.right, (z1Var.f50246v0.getX() + (z1Var.X.getX() + (z1Var.W.getX() + z1Var.V.getX()))) + z1Var.f50246v0.getWidth(), z1Var.F) - z1Var.v.f24696w1.getWidth(), AndroidUtilities.lerp(rectF.bottom, (z1Var.f50246v0.getY() + (z1Var.X.getY() + (z1Var.W.getY() + z1Var.V.getY()))) + z1Var.f50246v0.getHeight(), z1Var.F) - z1Var.v.f24696w1.getHeight());
                canvas.saveLayerAlpha(-AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(6.0f), z1Var.v.f24696w1.getWidth(), z1Var.v.f24696w1.getHeight(), (int) ((1.0f - z1Var.F) * 255.0f), 31);
                z1Var.v.f24696w1.draw(canvas);
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
        z1 z1Var = this.f50006w0;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if (z1Var.q0()) {
                l.d.v(R.string.RichEditorDraftSaved, new qc(z1Var.U, z1Var.getResourceProvider()), R.raw.contact_check, 36);
                return true;
            }
        } else if (!z1Var.M.g3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: wh.r1.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }
}
