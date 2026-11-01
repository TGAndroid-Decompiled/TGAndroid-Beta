package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableString;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.u80;
public final class s5 extends FrameLayout {
    public final Paint f51939a;
    public final ImageView f51940b;
    public final ImageView f51941c;
    public final org.telegram.ui.Components.f6 d;
    public final org.telegram.ui.Components.f6 e;
    public final ImageView f51942f;
    public final SpannableString h;
    public final SpannableString f51943n;

    public s5(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f51939a = paint;
        setWillNotDraw(false);
        paint.setColor(-16777216);
        ImageView imageView = new ImageView(context);
        this.f51940b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131231128);
        imageView.setColorFilter(new PorterDuffColorFilter(-15033089, PorterDuff.Mode.SRC_IN));
        addView(imageView, w7.b6.d(48, 48.0f, 19, 9.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f51941c = imageView2;
        imageView2.setBackground(new ag.s1(org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(2.4f), -15033089));
        addView(imageView2, w7.b6.d(48, 48.0f, 19, 9.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(context, false, false, false);
        this.d = f6Var;
        f6Var.setTextColor(-15033089);
        f6Var.setTextSize(org.telegram.messenger.i0.L(14.21f));
        f6Var.setTypeface(org.telegram.messenger.i0.o());
        f6Var.setEllipsizeByGradient(true);
        org.telegram.ui.Components.e6 drawable = f6Var.getDrawable();
        Point point = org.telegram.messenger.i0.f16172q;
        drawable.M = point.x;
        addView(f6Var, w7.b6.d(-1, 24.0f, 55, 57.0f, 2.33f, 48.0f, 0.0f));
        org.telegram.ui.Components.f6 f6Var2 = new org.telegram.ui.Components.f6(context, false, false, false);
        this.e = f6Var2;
        f6Var2.setTextColor(-8355712);
        f6Var2.setTextSize(org.telegram.messenger.i0.L(14.21f));
        f6Var2.setEllipsizeByGradient(true);
        f6Var2.getDrawable().M = point.x;
        addView(f6Var2, w7.b6.d(-1, 24.0f, 55, 57.0f, 20.66f, 48.0f, 0.0f));
        int textColor = f6Var.getTextColor();
        SpannableString spannableString = new SpannableString("x");
        this.h = spannableString;
        u80 u80Var = new u80(org.telegram.messenger.i0.L(200.0f), f6Var);
        u80Var.e = 0.8f;
        u80Var.a(org.telegram.ui.ActionBar.t6.r1(0.4f, textColor), org.telegram.ui.ActionBar.t6.r1(0.08f, textColor));
        spannableString.setSpan(u80Var, 0, spannableString.length(), 33);
        int textColor2 = f6Var2.getTextColor();
        SpannableString spannableString2 = new SpannableString("x");
        this.f51943n = spannableString2;
        u80 u80Var2 = new u80(org.telegram.messenger.i0.L(140.0f), f6Var2);
        u80Var2.e = 0.8f;
        u80Var2.a(org.telegram.ui.ActionBar.t6.r1(0.4f, textColor2), org.telegram.ui.ActionBar.t6.r1(0.08f, textColor2));
        spannableString2.setSpan(u80Var2, 0, spannableString2.length(), 33);
        ImageView imageView3 = new ImageView(context);
        this.f51942f = imageView3;
        imageView3.setColorFilter(new PorterDuffColorFilter(1694498815, PorterDuff.Mode.MULTIPLY));
        imageView3.setImageResource(2131231501);
        imageView3.setScaleType(scaleType);
        imageView3.setBackground(org.telegram.ui.ActionBar.t6.h0(436207615, 1, org.telegram.messenger.i0.L(18.0f)));
        addView(imageView3, w7.b6.d(48, 48.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.f51939a;
        canvas.drawRect(0.0f, 0.0f, getWidth(), org.telegram.messenger.i0.f1(), paint);
        canvas.drawRect(0.0f, getHeight() - org.telegram.messenger.i0.f1(), getWidth(), getHeight(), paint);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), 1073741824));
    }
}
