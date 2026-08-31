package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableString;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.l90;
public final class a7 extends FrameLayout {
    public final Paint f44911a;
    public final ImageView f44912b;
    public final ImageView f44913c;
    public final org.telegram.ui.Components.k6 d;
    public final org.telegram.ui.Components.k6 f44914e;
    public final ImageView f44915f;
    public final SpannableString h;
    public final SpannableString f44916n;

    public a7(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f44911a = paint;
        setWillNotDraw(false);
        paint.setColor(-16777216);
        ImageView imageView = new ImageView(context);
        this.f44912b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.filled_link);
        imageView.setColorFilter(new PorterDuffColorFilter(-15033089, PorterDuff.Mode.SRC_IN));
        addView(imageView, k7.c6.d(48, 48.0f, 19, 9.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f44913c = imageView2;
        imageView2.setBackground(new y6(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(2.4f), -15033089));
        addView(imageView2, k7.c6.d(48, 48.0f, 19, 9.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, false, false, false);
        this.d = k6Var;
        k6Var.setTextColor(-15033089);
        k6Var.setTextSize(AndroidUtilities.dp(14.21f));
        k6Var.setTypeface(AndroidUtilities.bold());
        k6Var.setEllipsizeByGradient(true);
        k6Var.getDrawable().G = AndroidUtilities.displaySize.x;
        addView(k6Var, k7.c6.d(-1, 24.0f, 55, 57.0f, 2.33f, 48.0f, 0.0f));
        org.telegram.ui.Components.k6 k6Var2 = new org.telegram.ui.Components.k6(context, false, false, false);
        this.f44914e = k6Var2;
        k6Var2.setTextColor(-8355712);
        k6Var2.setTextSize(AndroidUtilities.dp(14.21f));
        k6Var2.setEllipsizeByGradient(true);
        k6Var2.getDrawable().G = AndroidUtilities.displaySize.x;
        addView(k6Var2, k7.c6.d(-1, 24.0f, 55, 57.0f, 20.66f, 48.0f, 0.0f));
        int textColor = k6Var.getTextColor();
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        l90 l90Var = new l90(AndroidUtilities.dp(200.0f), k6Var);
        l90Var.f28677e = 0.8f;
        l90Var.a(org.telegram.ui.ActionBar.k6.l1(0.4f, textColor), org.telegram.ui.ActionBar.k6.l1(0.08f, textColor));
        spannableString.setSpan(l90Var, 0, spannableString.length(), 33);
        int textColor2 = k6Var2.getTextColor();
        SpannableString spannableString2 = new SpannableString("x");
        this.f44916n = spannableString2;
        l90 l90Var2 = new l90(AndroidUtilities.dp(140.0f), k6Var2);
        l90Var2.f28677e = 0.8f;
        l90Var2.a(org.telegram.ui.ActionBar.k6.l1(0.4f, textColor2), org.telegram.ui.ActionBar.k6.l1(0.08f, textColor2));
        spannableString2.setSpan(l90Var2, 0, spannableString2.length(), 33);
        ImageView imageView3 = new ImageView(context);
        this.f44915f = imageView3;
        imageView3.setColorFilter(new PorterDuffColorFilter(1694498815, PorterDuff.Mode.MULTIPLY));
        imageView3.setImageResource(R.drawable.input_clear);
        imageView3.setScaleType(scaleType);
        imageView3.setBackground(org.telegram.ui.ActionBar.k6.f0(436207615, 1, AndroidUtilities.dp(18.0f)));
        addView(imageView3, k7.c6.d(48, 48.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.f44911a;
        canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.getShadowHeight(), paint);
        canvas.drawRect(0.0f, getHeight() - AndroidUtilities.getShadowHeight(), getWidth(), getHeight(), paint);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
    }
}
