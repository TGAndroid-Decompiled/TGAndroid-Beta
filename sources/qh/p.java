package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.gr;
public final class p extends View {
    public final f5 f45720a;
    public final Drawable f45721b;
    public float f45722c;
    public boolean d;

    public p(g0 g0Var, Context context, int i10, TLRPC.Document document) {
        super(context);
        int i11;
        if (document != null) {
            this.f45720a = f5.l(g0Var.f45730a, 5, document);
            this.f45721b = null;
            return;
        }
        this.f45720a = null;
        if (i10 == 0) {
            i11 = 2131231064;
        } else {
            i11 = 2131232124;
        }
        Drawable mutate = context.getDrawable(i11).mutate();
        this.f45721b = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1711276033, PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f5 f5Var = this.f45720a;
        if (f5Var != null) {
            f5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f5 f5Var = this.f45720a;
        if (f5Var != null) {
            f5Var.n(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        if (this.d) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float f10 = this.f45722c;
        if (f10 != f7) {
            if (Math.abs(f10 - f7) >= 0.02f) {
                float f11 = this.f45722c;
                f7 = c3.i0.z(f7, f11, 0.35f, f11);
            }
            this.f45722c = f7;
            invalidate();
        }
        float interpolation = (1.0f - (gr.f26524g.getInterpolation(this.f45722c) * 0.15f)) * org.telegram.messenger.i0.L(26.0f);
        float f12 = interpolation / 2.0f;
        int width = (int) ((getWidth() / 2.0f) - f12);
        int height = (int) ((getHeight() / 2.0f) - f12);
        Drawable drawable = this.f45720a;
        if (drawable == null) {
            drawable = this.f45721b;
        }
        if (drawable != null) {
            drawable.setBounds(width, height, (int) (width + interpolation), (int) (height + interpolation));
            r.b(canvas, drawable);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.d = true;
            invalidate();
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.d = false;
            invalidate();
        }
        return super.onTouchEvent(motionEvent);
    }
}
