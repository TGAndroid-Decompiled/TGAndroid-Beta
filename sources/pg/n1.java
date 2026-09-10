package pg;

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
import org.telegram.messenger.em;
import org.telegram.ui.ActionBar.z5;
public final class n1 extends TextView {
    public boolean f40172a;
    public Drawable f40173b;

    public n1(Context context) {
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
        if (this.f40172a) {
            int y3 = em.y(16.0f, getHeight(), 2);
            if (LocaleController.isRTL) {
                this.f40173b.setBounds(AndroidUtilities.dp(7.0f), y3, AndroidUtilities.dp(23.0f), AndroidUtilities.dp(16.0f) + y3);
            } else {
                this.f40173b.setBounds(getWidth() - AndroidUtilities.dp(23.0f), y3, getWidth() - AndroidUtilities.dp(7.0f), AndroidUtilities.dp(16.0f) + y3);
            }
            this.f40173b.draw(canvas);
        }
    }

    public void setCurrent(boolean z10) {
        float f7;
        this.f40172a = z10;
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
            setBackground(z5.d(new float[]{AndroidUtilities.dp(32.0f)}, 0, z5.b(1090519039)));
        } else {
            setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(14.0f));
            setBackground(z5.d(new float[]{0.0f}, 0, z5.b(-14145495)));
        }
        if (this.f40172a && this.f40173b == null) {
            Drawable drawable = getContext().getDrawable(R.drawable.photo_expand);
            this.f40173b = drawable;
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }
}
