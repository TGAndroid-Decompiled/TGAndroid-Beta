package yh;

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
import org.telegram.messenger.qk;
import org.telegram.ui.Components.sr;
public final class i7 extends FrameLayout {
    public final org.telegram.ui.ActionBar.e6 f47583a;
    public final Drawable f47584b;
    public final Drawable f47585c;
    public final TextView d;
    public final org.telegram.ui.Components.p6 e;
    public SpannableString f47586f;
    public boolean h;
    public int f47587n;
    public final org.telegram.ui.Components.e6 f47588r;

    public i7(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i10;
        this.f47588r = new org.telegram.ui.Components.e6(this, 0L, 500L, sr.h);
        this.f47583a = e6Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.star_small_outline).mutate();
        this.f47584b = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19128h5, e6Var), PorterDuff.Mode.SRC_IN));
        this.f47585c = context.getResources().getDrawable(R.drawable.star_small_inner).mutate();
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.d = textView;
        qk.k(15.0f, 1, textView);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, e6Var));
        addView(textView, w7.y5.i(-2.0f, -2.0f, 8388627, 48.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(context, false, false, false);
        this.e = p6Var;
        p6Var.setTextSize(AndroidUtilities.dp(15.0f));
        p6Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19461z6, e6Var));
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        p6Var.setGravity(i10);
        addView(p6Var, w7.y5.i(-2.0f, 21.0f, 8388629, 0.0f, 0.0f, 19.0f, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        float dp;
        Paint paint;
        float dp2;
        int i10;
        super.onDraw(canvas);
        float d = this.f47588r.d(this.f47587n, false);
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
            Drawable drawable = this.f47584b;
            drawable.setBounds(i11, i12, i13, i14);
            int i15 = (int) (clamp * 255.0f);
            drawable.setAlpha(i15);
            drawable.draw(canvas);
            Drawable drawable2 = this.f47585c;
            drawable2.setBounds(i11, i12, i13, i14);
            drawable2.setAlpha(i15);
            drawable2.draw(canvas);
        }
        if (this.h) {
            org.telegram.ui.ActionBar.e6 e6Var = this.f47583a;
            if (e6Var != null) {
                paint = e6Var.G("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.i6.f19179k0;
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
