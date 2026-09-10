package ug;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.em;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.Components.vq;
public final class b extends FrameLayout {
    public final l5 f42671a;
    public final ImageView f42672b;

    public b(Context context, f6 f6Var) {
        super(context);
        int i10;
        l5 l5Var = new l5(context);
        this.f42671a = l5Var;
        l5Var.setTextSize(16);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        l5Var.setGravity(i10);
        int i11 = j6.L6;
        l5Var.setTextColor(j6.v0(i11, f6Var));
        l5Var.setTag(Integer.valueOf(i11));
        addView(l5Var);
        ImageView imageView = new ImageView(context);
        this.f42672b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView);
        l5Var.k(LocaleController.getString(R.string.BoostingAddChannelOrGroup));
        Drawable drawable = getResources().getDrawable(R.drawable.poll_add_circle);
        Drawable drawable2 = getResources().getDrawable(R.drawable.poll_add_plus);
        int v02 = j6.v0(j6.N6, f6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(v02, mode));
        drawable2.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.f18056k7, f6Var), mode));
        imageView.setImageDrawable(new vq(drawable, drawable2));
        setBackgroundColor(j6.v0(j6.f17998h5, f6Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int dp;
        int measuredWidth;
        int i14 = i12 - i10;
        l5 l5Var = this.f42671a;
        int textHeight = ((i13 - i11) - l5Var.getTextHeight()) / 2;
        boolean z11 = LocaleController.isRTL;
        float f7 = 23.0f;
        ImageView imageView = this.f42672b;
        if (z11) {
            int measuredWidth2 = getMeasuredWidth() - l5Var.getMeasuredWidth();
            if (imageView.getVisibility() == 0) {
                f7 = 68.0f;
            }
            dp = measuredWidth2 - AndroidUtilities.dp(f7);
        } else {
            if (imageView.getVisibility() == 0) {
                f7 = 68.0f;
            }
            dp = AndroidUtilities.dp(f7);
        }
        l5Var.layout(dp, textHeight, l5Var.getMeasuredWidth() + dp, l5Var.getMeasuredHeight() + textHeight);
        if (!LocaleController.isRTL) {
            measuredWidth = AndroidUtilities.dp(24.0f);
        } else {
            measuredWidth = (i14 - imageView.getMeasuredWidth()) - AndroidUtilities.dp(24.0f);
        }
        imageView.layout(measuredWidth, 0, imageView.getMeasuredWidth() + measuredWidth, imageView.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        this.f42671a.measure(em.d(94.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        this.f42672b.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
        setMeasuredDimension(size, AndroidUtilities.dp(50.0f));
    }
}
