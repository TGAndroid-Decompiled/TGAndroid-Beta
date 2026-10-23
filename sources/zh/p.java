package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.play_billing.k3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.r5;
public final class p extends View {
    public final r5 f52073a;
    public final Drawable f52074b;
    public float f52075c;
    public boolean d;

    public p(k0 k0Var, Context context, int i10, TLRPC.Document document) {
        super(context);
        int i11;
        if (document != null) {
            this.f52073a = r5.m(k0Var.f52087a, 5, document);
            this.f52074b = null;
            return;
        }
        this.f52073a = null;
        if (i10 == 0) {
            i11 = R.drawable.emoji_tabs_faves;
        } else {
            i11 = R.drawable.msg_emoji_recent;
        }
        Drawable mutate = context.getDrawable(i11).mutate();
        this.f52074b = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1711276033, PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        r5 r5Var = this.f52073a;
        if (r5Var != null) {
            r5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        r5 r5Var = this.f52073a;
        if (r5Var != null) {
            r5Var.o(this);
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
        float f10 = this.f52075c;
        if (f10 != f7) {
            if (Math.abs(f10 - f7) >= 0.02f) {
                float f11 = this.f52075c;
                f7 = k3.y(f7, f11, 0.35f, f11);
            }
            this.f52075c = f7;
            invalidate();
        }
        float interpolation = (1.0f - (bs.f25026g.getInterpolation(this.f52075c) * 0.15f)) * AndroidUtilities.dp(26.0f);
        float f12 = interpolation / 2.0f;
        int width = (int) ((getWidth() / 2.0f) - f12);
        int height = (int) ((getHeight() / 2.0f) - f12);
        Drawable drawable = this.f52073a;
        if (drawable == null) {
            drawable = this.f52074b;
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
