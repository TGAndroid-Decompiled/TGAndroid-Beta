package sg;

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
import org.telegram.messenger.vh;
import org.telegram.ui.ActionBar.o6;
public final class p1 extends TextView {
    public boolean f48433a;
    public Drawable f48434b;

    public p1(Context context) {
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
        if (this.f48433a) {
            int B = vh.B(16.0f, getHeight(), 2);
            if (LocaleController.isRTL) {
                this.f48434b.setBounds(AndroidUtilities.dp(7.0f), B, AndroidUtilities.dp(23.0f), AndroidUtilities.dp(16.0f) + B);
            } else {
                this.f48434b.setBounds(getWidth() - AndroidUtilities.dp(23.0f), B, getWidth() - AndroidUtilities.dp(7.0f), AndroidUtilities.dp(16.0f) + B);
            }
            this.f48434b.draw(canvas);
        }
    }

    public void setCurrent(boolean z10) {
        float f7;
        this.f48433a = z10;
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
            setBackground(o6.d(new float[]{AndroidUtilities.dp(32.0f)}, 0, o6.b(1090519039)));
        } else {
            setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(14.0f));
            setBackground(o6.d(new float[]{0.0f}, 0, o6.b(-14145495)));
        }
        if (this.f48433a && this.f48434b == null) {
            Drawable drawable = getContext().getDrawable(R.drawable.photo_expand);
            this.f48434b = drawable;
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }
}
