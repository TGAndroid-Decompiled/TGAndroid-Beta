package wg;

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
import org.telegram.messenger.wl;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.oq;
public final class b extends FrameLayout {
    public final j5 f48501a;
    public final ImageView f48502b;

    public b(Context context, f6 f6Var) {
        super(context);
        int i10;
        j5 j5Var = new j5(context);
        this.f48501a = j5Var;
        j5Var.setTextSize(16);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        j5Var.setGravity(i10);
        int i11 = j6.L6;
        j5Var.setTextColor(j6.v0(i11, f6Var));
        j5Var.setTag(Integer.valueOf(i11));
        addView(j5Var);
        ImageView imageView = new ImageView(context);
        this.f48502b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView);
        j5Var.k(LocaleController.getString(R.string.BoostingAddChannelOrGroup));
        Drawable drawable = getResources().getDrawable(R.drawable.poll_add_circle);
        Drawable drawable2 = getResources().getDrawable(R.drawable.poll_add_plus);
        int v02 = j6.v0(j6.N6, f6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(v02, mode));
        drawable2.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.f20792k7, f6Var), mode));
        imageView.setImageDrawable(new oq(drawable, drawable2));
        setBackgroundColor(j6.v0(j6.f20734h5, f6Var));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int dp;
        int measuredWidth;
        int i14 = i12 - i10;
        j5 j5Var = this.f48501a;
        int textHeight = ((i13 - i11) - j5Var.getTextHeight()) / 2;
        boolean z11 = LocaleController.isRTL;
        float f7 = 23.0f;
        ImageView imageView = this.f48502b;
        if (z11) {
            int measuredWidth2 = getMeasuredWidth() - j5Var.getMeasuredWidth();
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
        j5Var.layout(dp, textHeight, j5Var.getMeasuredWidth() + dp, j5Var.getMeasuredHeight() + textHeight);
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
        this.f48501a.measure(wl.d(94.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        this.f48502b.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
        setMeasuredDimension(size, AndroidUtilities.dp(50.0f));
    }
}
