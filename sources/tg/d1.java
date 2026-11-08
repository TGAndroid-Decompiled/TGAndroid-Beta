package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.z5;
public final class d1 extends TextView {
    public boolean f55622a;
    public Drawable f55623b;

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
        if (this.f55622a) {
            int y10 = org.telegram.messenger.camera.q.y(16.0f, getHeight(), 2);
            if (id.f23157a0) {
                this.f55623b.setBounds(org.telegram.messenger.g0.L(7.0f), y10, org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(16.0f) + y10);
            } else {
                this.f55623b.setBounds(getWidth() - org.telegram.messenger.g0.L(23.0f), y10, getWidth() - org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(16.0f) + y10);
            }
            this.f55623b.draw(canvas);
        }
    }

    public void setCurrent(boolean z9) {
        float f10;
        this.f55622a = z9;
        if (z9) {
            float f11 = 12.0f;
            if (id.f23157a0) {
                f10 = 27.0f;
            } else {
                f10 = 12.0f;
            }
            int L = org.telegram.messenger.g0.L(f10);
            int L2 = org.telegram.messenger.g0.L(6.0f);
            if (!id.f23157a0) {
                f11 = 27.0f;
            }
            setPadding(L, L2, org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(6.0f));
            setBackground(z5.d(0, z5.b(1090519039), org.telegram.messenger.g0.L(32.0f)));
        } else {
            setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(14.0f));
            setBackground(z5.d(0, z5.b(-14145495), 0.0f));
        }
        if (this.f55622a && this.f55623b == null) {
            Drawable drawable = getContext().getDrawable(2131232522);
            this.f55623b = drawable;
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }
}
