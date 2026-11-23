package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.messenger.o10;
import org.telegram.ui.ActionBar.a6;
public final class e1 extends TextView {
    public boolean f57839a;
    public Drawable f57840b;

    public e1(Context context) {
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
        if (this.f57839a) {
            int z10 = o10.z(16.0f, getHeight(), 2);
            if (hd.f24444a0) {
                this.f57840b.setBounds(org.telegram.messenger.g0.L(7.0f), z10, org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(16.0f) + z10);
            } else {
                this.f57840b.setBounds(getWidth() - org.telegram.messenger.g0.L(23.0f), z10, getWidth() - org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(16.0f) + z10);
            }
            this.f57840b.draw(canvas);
        }
    }

    public void setCurrent(boolean z10) {
        float f10;
        this.f57839a = z10;
        if (z10) {
            float f11 = 12.0f;
            if (hd.f24444a0) {
                f10 = 27.0f;
            } else {
                f10 = 12.0f;
            }
            int L = org.telegram.messenger.g0.L(f10);
            int L2 = org.telegram.messenger.g0.L(6.0f);
            if (!hd.f24444a0) {
                f11 = 27.0f;
            }
            setPadding(L, L2, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(6.0f));
            setBackground(a6.d(0, a6.b(1090519039), org.telegram.messenger.g0.L(32.0f)));
        } else {
            setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(14.0f));
            setBackground(a6.d(0, a6.b(-14145495), 0.0f));
        }
        if (this.f57839a && this.f57840b == null) {
            Drawable drawable = getContext().getDrawable(2131232524);
            this.f57840b = drawable;
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }
}
