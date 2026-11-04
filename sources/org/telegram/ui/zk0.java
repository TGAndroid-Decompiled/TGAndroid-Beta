package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class zk0 extends FrameLayout {
    public final Paint f52693a;
    public float f52694b;
    public q1.g f52695c;
    public final dl0 d;

    public zk0(dl0 dl0Var, Context context) {
        super(context);
        this.d = dl0Var;
        this.f52693a = new Paint(1);
        setWillNotDraw(false);
    }

    public final void a(boolean z10, boolean z11) {
        float f10;
        float f11;
        q1.g gVar = this.f52695c;
        if (gVar != null) {
            gVar.d();
        }
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        if (z11) {
            float f12 = this.f52694b;
            if (f12 == f10) {
                return;
            }
            q1.g gVar2 = new q1.g(new q1.f(f12 * 100.0f));
            q1.h hVar = new q1.h(f10 * 100.0f);
            if (z10) {
                f11 = 500.0f;
            } else {
                f11 = 650.0f;
            }
            hVar.b(f11);
            hVar.a(1.0f);
            gVar2.f53653m = hVar;
            this.f52695c = gVar2;
            gVar2.b(new wa0(this, 1));
            this.f52695c.a(new k9(this, 1));
            this.f52695c.h();
            return;
        }
        this.f52694b = f10;
        TextView textView = this.d.V;
        if (textView != null) {
            textView.setAlpha((f10 * 0.2f) + 0.8f);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int L;
        super.onDraw(canvas);
        int i3 = org.telegram.ui.ActionBar.k6.O6;
        dl0 dl0Var = this.d;
        canvas.drawColor(dl0Var.getThemedColor(i3));
        int themedColor = dl0Var.getThemedColor(org.telegram.ui.ActionBar.k6.Si);
        Paint paint = this.f52693a;
        paint.setColor(themedColor);
        if (org.telegram.messenger.bd.f21784a0) {
            L = getWidth() - org.telegram.messenger.g0.L(28.0f);
        } else {
            L = org.telegram.messenger.g0.L(28.0f);
        }
        canvas.drawCircle(L, -org.telegram.messenger.g0.L(28.0f), Math.max(getWidth(), getHeight()) * this.f52694b, paint);
    }
}
