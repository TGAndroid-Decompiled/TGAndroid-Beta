package vg;

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
import org.telegram.messenger.bi;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.sq;
public final class b extends FrameLayout {
    public final i5 f48280a;
    public final ImageView f48281b;

    public b(Context context, d6 d6Var) {
        super(context);
        int i10;
        i5 i5Var = new i5(context);
        this.f48280a = i5Var;
        i5Var.setTextSize(16);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        i5Var.setGravity(i10);
        int i11 = i6.L6;
        i5Var.setTextColor(i6.v0(i11, d6Var));
        i5Var.setTag(Integer.valueOf(i11));
        addView(i5Var);
        ImageView imageView = new ImageView(context);
        this.f48281b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView);
        i5Var.k(LocaleController.getString(R.string.BoostingAddChannelOrGroup));
        Drawable drawable = getResources().getDrawable(R.drawable.poll_add_circle);
        Drawable drawable2 = getResources().getDrawable(R.drawable.poll_add_plus);
        int v02 = i6.v0(i6.N6, d6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(v02, mode));
        drawable2.setColorFilter(new PorterDuffColorFilter(i6.v0(i6.f20952k7, d6Var), mode));
        imageView.setImageDrawable(new sq(drawable, drawable2));
        setBackgroundColor(i6.v0(i6.f20894h5, d6Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int dp;
        int measuredWidth;
        int i14 = i12 - i10;
        i5 i5Var = this.f48280a;
        int textHeight = ((i13 - i11) - i5Var.getTextHeight()) / 2;
        boolean z11 = LocaleController.isRTL;
        float f7 = 23.0f;
        ImageView imageView = this.f48281b;
        if (z11) {
            int measuredWidth2 = getMeasuredWidth() - i5Var.getMeasuredWidth();
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
        i5Var.layout(dp, textHeight, i5Var.getMeasuredWidth() + dp, i5Var.getMeasuredHeight() + textHeight);
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
        this.f48280a.measure(bi.c(94.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        this.f48281b.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
        setMeasuredDimension(size, AndroidUtilities.dp(50.0f));
    }
}
