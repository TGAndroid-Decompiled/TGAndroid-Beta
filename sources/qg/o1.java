package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.ok;
import org.telegram.ui.ActionBar.w5;
public final class o1 extends TextView {
    public boolean f41829a;
    public Drawable f41830b;

    public o1(Context context) {
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
        canvas.translate(0.0f, AndroidUtilities.dp(-1.0f));
        super.onDraw(canvas);
        canvas.restore();
        if (this.f41829a) {
            int A = ok.A(16.0f, getHeight(), 2);
            if (LocaleController.isRTL) {
                this.f41830b.setBounds(AndroidUtilities.dp(7.0f), A, AndroidUtilities.dp(23.0f), AndroidUtilities.dp(16.0f) + A);
            } else {
                this.f41830b.setBounds(getWidth() - AndroidUtilities.dp(23.0f), A, getWidth() - AndroidUtilities.dp(7.0f), AndroidUtilities.dp(16.0f) + A);
            }
            this.f41830b.draw(canvas);
        }
    }

    public void setCurrent(boolean z10) {
        float f7;
        this.f41829a = z10;
        if (z10) {
            float f10 = 12.0f;
            if (LocaleController.isRTL) {
                f7 = 27.0f;
            } else {
                f7 = 12.0f;
            }
            int dp = AndroidUtilities.dp(f7);
            int dp2 = AndroidUtilities.dp(6.0f);
            if (!LocaleController.isRTL) {
                f10 = 27.0f;
            }
            setPadding(dp, dp2, AndroidUtilities.dp(f10), AndroidUtilities.dp(6.0f));
            setBackground(w5.d(new float[]{AndroidUtilities.dp(32.0f)}, 0, w5.b(1090519039)));
        } else {
            setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(14.0f));
            setBackground(w5.d(new float[]{0.0f}, 0, w5.b(-14145495)));
        }
        if (this.f41829a && this.f41830b == null) {
            Drawable drawable = getContext().getDrawable(R.drawable.photo_expand);
            this.f41830b = drawable;
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }
}
