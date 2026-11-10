package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.b6;
public final class d1 extends TextView {
    public boolean f55634a;
    public Drawable f55635b;

    public d1(Context context) {
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
        if (this.f55634a) {
            int y10 = org.telegram.messenger.camera.q.y(16.0f, getHeight(), 2);
            if (id.f23161a0) {
                this.f55635b.setBounds(org.telegram.messenger.g0.L(7.0f), y10, org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(16.0f) + y10);
            } else {
                this.f55635b.setBounds(getWidth() - org.telegram.messenger.g0.L(23.0f), y10, getWidth() - org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(16.0f) + y10);
            }
            this.f55635b.draw(canvas);
        }
    }

    public void setCurrent(boolean z9) {
        float f10;
        this.f55634a = z9;
        if (z9) {
            float f11 = 12.0f;
            if (id.f23161a0) {
                f10 = 27.0f;
            } else {
                f10 = 12.0f;
            }
            int L = org.telegram.messenger.g0.L(f10);
            int L2 = org.telegram.messenger.g0.L(6.0f);
            if (!id.f23161a0) {
                f11 = 27.0f;
            }
            setPadding(L, L2, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(6.0f));
            setBackground(b6.d(0, b6.b(1090519039), org.telegram.messenger.g0.L(32.0f)));
        } else {
            setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(14.0f));
            setBackground(b6.d(0, b6.b(-14145495), 0.0f));
        }
        if (this.f55634a && this.f55635b == null) {
            Drawable drawable = getContext().getDrawable(2131232522);
            this.f55635b = drawable;
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }
}
