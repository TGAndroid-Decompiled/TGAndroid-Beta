package yf;

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
import org.telegram.messenger.ll;
import org.telegram.ui.ActionBar.v5;
public final class n1 extends TextView {
    public boolean f50032a;
    public Drawable f50033b;

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
        if (this.f50032a) {
            int y10 = ll.y(16.0f, getHeight(), 2);
            if (LocaleController.isRTL) {
                this.f50033b.setBounds(AndroidUtilities.dp(7.0f), y10, AndroidUtilities.dp(23.0f), AndroidUtilities.dp(16.0f) + y10);
            } else {
                this.f50033b.setBounds(getWidth() - AndroidUtilities.dp(23.0f), y10, getWidth() - AndroidUtilities.dp(7.0f), AndroidUtilities.dp(16.0f) + y10);
            }
            this.f50033b.draw(canvas);
        }
    }

    public void setCurrent(boolean z10) {
        float f10;
        this.f50032a = z10;
        if (z10) {
            float f11 = 12.0f;
            if (LocaleController.isRTL) {
                f10 = 27.0f;
            } else {
                f10 = 12.0f;
            }
            int dp = AndroidUtilities.dp(f10);
            int dp2 = AndroidUtilities.dp(6.0f);
            if (!LocaleController.isRTL) {
                f11 = 27.0f;
            }
            setPadding(dp, dp2, AndroidUtilities.dp(f11), AndroidUtilities.dp(6.0f));
            setBackground(v5.d(new float[]{AndroidUtilities.dp(32.0f)}, 0, v5.b(1090519039)));
        } else {
            setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(14.0f));
            setBackground(v5.d(new float[]{0.0f}, 0, v5.b(-14145495)));
        }
        if (this.f50032a && this.f50033b == null) {
            Drawable drawable = getContext().getDrawable(R.drawable.photo_expand);
            this.f50033b = drawable;
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }
}
