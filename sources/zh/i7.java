package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wl;
import org.telegram.ui.Components.pr;
public final class i7 extends FrameLayout {
    public final org.telegram.ui.ActionBar.f6 f52047a;
    public final Drawable f52048b;
    public final Drawable f52049c;
    public final TextView d;
    public final org.telegram.ui.Components.q6 f52050e;
    public SpannableString f52051f;
    public boolean h;
    public int f52052n;
    public final org.telegram.ui.Components.e6 f52053r;

    public i7(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int i10;
        this.f52053r = new org.telegram.ui.Components.e6(this, 0L, 500L, pr.h);
        this.f52047a = f6Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.star_small_outline).mutate();
        this.f52048b = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20734h5, f6Var), PorterDuff.Mode.SRC_IN));
        this.f52049c = context.getResources().getDrawable(R.drawable.star_small_inner).mutate();
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.d = textView;
        wl.j(15.0f, 1, textView);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        addView(textView, w7.x5.i(-2.0f, -2.0f, 8388627, 48.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(context, false, false, false);
        this.f52050e = q6Var;
        q6Var.setTextSize(AndroidUtilities.dp(15.0f));
        q6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f21061z6, f6Var));
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        q6Var.setGravity(i10);
        addView(q6Var, w7.x5.i(-2.0f, 21.0f, 8388629, 0.0f, 0.0f, 19.0f, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        float dp;
        Paint paint;
        float dp2;
        int i10;
        super.onDraw(canvas);
        float d = this.f52053r.d(this.f52052n, false);
        if (LocaleController.isRTL) {
            f7 = -1.0f;
        } else {
            f7 = 1.0f;
        }
        float dp3 = AndroidUtilities.dp(24.0f);
        float dp4 = AndroidUtilities.dp(24.0f);
        float dp5 = AndroidUtilities.dp(2.5f);
        if (LocaleController.isRTL) {
            dp = (getWidth() - AndroidUtilities.dp(19.0f)) - dp3;
        } else {
            dp = AndroidUtilities.dp(19.0f);
        }
        for (int ceil = ((int) Math.ceil(d)) - 1; ceil >= 0; ceil--) {
            float clamp = Utilities.clamp(d - ceil, 1.0f, 0.0f);
            float f10 = (((ceil - 1) - (1.0f - clamp)) * dp5 * f7) + dp;
            float measuredHeight = (getMeasuredHeight() - dp4) / 2.0f;
            int i11 = (int) f10;
            int i12 = (int) measuredHeight;
            int i13 = (int) (f10 + dp3);
            int i14 = (int) (measuredHeight + dp4);
            Drawable drawable = this.f52048b;
            drawable.setBounds(i11, i12, i13, i14);
            int i15 = (int) (clamp * 255.0f);
            drawable.setAlpha(i15);
            drawable.draw(canvas);
            Drawable drawable2 = this.f52049c;
            drawable2.setBounds(i11, i12, i13, i14);
            drawable2.setAlpha(i15);
            drawable2.draw(canvas);
        }
        if (this.h) {
            org.telegram.ui.ActionBar.f6 f6Var = this.f52047a;
            if (f6Var != null) {
                paint = f6Var.G("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.j6.f20785k0;
            }
            Paint paint2 = paint;
            if (LocaleController.isRTL) {
                dp2 = 0.0f;
            } else {
                dp2 = AndroidUtilities.dp(22.0f);
            }
            float measuredHeight2 = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(22.0f);
            } else {
                i10 = 0;
            }
            canvas.drawRect(dp2, measuredHeight2, measuredWidth - i10, getMeasuredHeight(), paint2);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
