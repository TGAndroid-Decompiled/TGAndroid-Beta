package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.bd;
import org.telegram.ui.ActionBar.y5;
public final class c1 extends TextView {
    public boolean f55892a;
    public Drawable f55893b;

    public c1(Context context) {
        super(context);
        setTextColor(-1);
        setTextSize(1, 14.0f);
        setCurrent(false);
        setEllipsize(TextUtils.TruncateAt.END);
        setSingleLine();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(0.0f, org.telegram.messenger.g0.L(-1.0f));
        super.onDraw(canvas);
        canvas.restore();
        if (this.f55892a) {
            int y9 = org.telegram.messenger.camera.q.y(16.0f, getHeight(), 2);
            if (bd.f21784a0) {
                this.f55893b.setBounds(org.telegram.messenger.g0.L(7.0f), y9, org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(16.0f) + y9);
            } else {
                this.f55893b.setBounds(getWidth() - org.telegram.messenger.g0.L(23.0f), y9, getWidth() - org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(16.0f) + y9);
            }
            this.f55893b.draw(canvas);
        }
    }

    public void setCurrent(boolean z10) {
        float f10;
        this.f55892a = z10;
        if (z10) {
            float f11 = 12.0f;
            if (bd.f21784a0) {
                f10 = 27.0f;
            } else {
                f10 = 12.0f;
            }
            int L = org.telegram.messenger.g0.L(f10);
            int L2 = org.telegram.messenger.g0.L(6.0f);
            if (!bd.f21784a0) {
                f11 = 27.0f;
            }
            setPadding(L, L2, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(6.0f));
            setBackground(y5.d(0, y5.b(1090519039), org.telegram.messenger.g0.L(32.0f)));
        } else {
            setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(14.0f));
            setBackground(y5.d(0, y5.b(-14145495), 0.0f));
        }
        if (this.f55892a && this.f55893b == null) {
            Drawable drawable = getContext().getDrawable(2131232522);
            this.f55893b = drawable;
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }
}
