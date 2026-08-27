package zf;

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
import org.telegram.messenger.rl;
import org.telegram.ui.ActionBar.w5;

public final class n1 extends TextView {

    public boolean f50605a;

    public Drawable f50606b;

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
        if (this.f50605a) {
            int iX = rl.x(16.0f, getHeight(), 2);
            if (LocaleController.isRTL) {
                this.f50606b.setBounds(AndroidUtilities.dp(7.0f), iX, AndroidUtilities.dp(23.0f), AndroidUtilities.dp(16.0f) + iX);
            } else {
                this.f50606b.setBounds(getWidth() - AndroidUtilities.dp(23.0f), iX, getWidth() - AndroidUtilities.dp(7.0f), AndroidUtilities.dp(16.0f) + iX);
            }
            this.f50606b.draw(canvas);
        }
    }

    public void setCurrent(boolean z10) {
        this.f50605a = z10;
        if (z10) {
            setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 27.0f : 12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(LocaleController.isRTL ? 12.0f : 27.0f), AndroidUtilities.dp(6.0f));
            setBackground(w5.d(new float[]{AndroidUtilities.dp(32.0f)}, 0, w5.b(1090519039)));
        } else {
            setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(14.0f));
            setBackground(w5.d(new float[]{0.0f}, 0, w5.b(-14145495)));
        }
        if (this.f50605a && this.f50606b == null) {
            Drawable drawable = getContext().getDrawable(R.drawable.photo_expand);
            this.f50606b = drawable;
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }
}
