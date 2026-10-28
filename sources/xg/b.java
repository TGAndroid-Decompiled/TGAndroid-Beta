package xg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.wh;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ar;
public final class b extends FrameLayout {
    public final b6 f51815a;
    public final ImageView f51816b;

    public b(Context context, u6 u6Var) {
        super(context);
        int i10;
        b6 b6Var = new b6(context);
        this.f51815a = b6Var;
        b6Var.setTextSize(16);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        b6Var.setGravity(i10);
        int i11 = y6.L6;
        f7.Y(b6Var, i11, u6Var);
        b6Var.setTag(Integer.valueOf(i11));
        addView(b6Var);
        ImageView imageView = new ImageView(context);
        this.f51816b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView);
        b6Var.k(LocaleController.getString(R.string.BoostingAddChannelOrGroup));
        Drawable drawable = getResources().getDrawable(R.drawable.poll_add_circle);
        Drawable drawable2 = getResources().getDrawable(R.drawable.poll_add_plus);
        int i12 = y6.N6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        f7.y(this, drawable, i12, u6Var, mode);
        f7.y(this, drawable2, y6.f23486k7, u6Var, mode);
        imageView.setImageDrawable(new ar(drawable, drawable2));
        f7.i(y6.f23428h5, this, u6Var);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int dp;
        int measuredWidth;
        int i14 = i12 - i10;
        b6 b6Var = this.f51815a;
        int textHeight = ((i13 - i11) - b6Var.getTextHeight()) / 2;
        boolean z11 = LocaleController.isRTL;
        float f7 = 23.0f;
        ImageView imageView = this.f51816b;
        if (z11) {
            int measuredWidth2 = getMeasuredWidth() - b6Var.getMeasuredWidth();
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
        b6Var.layout(dp, textHeight, b6Var.getMeasuredWidth() + dp, b6Var.getMeasuredHeight() + textHeight);
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
        this.f51815a.measure(wh.x(94.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        this.f51816b.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
        setMeasuredDimension(size, AndroidUtilities.dp(50.0f));
    }
}
