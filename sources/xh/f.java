package xh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.z20;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w6;
import w7.b6;
public final class f extends FrameLayout {
    public final p6 f53748a;
    public final ImageView f53749b;
    public final FrameLayout.LayoutParams f53750c;
    public final FrameLayout.LayoutParams d;
    public final TextView e;
    public final TextView f53751f;
    public final TextView h;

    public f(Context context, p6 p6Var) {
        super(context);
        this.f53748a = p6Var;
        ImageView imageView = new ImageView(context);
        this.f53749b = imageView;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        FrameLayout.LayoutParams d = b6.d(28, 28.0f, 51, 17.0f, 14.33f, 0.0f, 0.0f);
        this.f53750c = d;
        addView(imageView, d);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout.LayoutParams d10 = b6.d(-1, -2.0f, 55, 62.0f, 10.0f, 40.0f, 8.66f);
        this.d = d10;
        addView(linearLayout, d10);
        TextView textView = new TextView(context);
        this.e = textView;
        z20.n(textView, 1, 15.0f);
        a7.V(textView, t6.G6, p6Var);
        TextView f7 = z20.f(linearLayout, textView, b6.t(-1, -2, 55, 0, 0, 0, 0), context);
        this.f53751f = f7;
        f7.setTextSize(1, 14.0f);
        a7.V(f7, t6.f21330z6, p6Var);
        linearLayout.addView(f7, b6.t(-1, -2, 55, 0, 3, 0, 0));
        ImageView imageView2 = new ImageView(context);
        a7.t(imageView2, t6.M6, p6Var, mode);
        imageView2.setImageResource(2131232058);
        imageView2.setScaleType(scaleType);
        addView(imageView2, b6.d(24, 24.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setTextColor(-1);
        int L = org.telegram.messenger.i0.L(4.0f);
        int i10 = t6.ik;
        ShapeDrawable d02 = t6.d0(L, t6.w0(i10, p6Var));
        w6 N = a7.N(i10);
        textView2.setBackground(d02);
        a7.k(textView2, d02, N, null, p6Var);
        textView2.setTextSize(1, 13.0f);
        textView2.setTypeface(org.telegram.messenger.i0.o());
        textView2.setPadding(org.telegram.messenger.i0.L(5.0f), 0, org.telegram.messenger.i0.L(4.0f), 0);
        textView2.setGravity(17);
        textView2.setVisibility(8);
        addView(textView2, b6.d(-2, 18.0f, 21, 0.0f, 0.0f, 35.33f, 0.0f));
    }

    public final void a(int i10, int i11, CharSequence charSequence, CharSequence charSequence2) {
        ImageView imageView = this.f53749b;
        imageView.setImageResource(i11);
        ShapeDrawable d02 = t6.d0(org.telegram.messenger.i0.L(9.0f), i10);
        int i12 = t6.ik;
        p6 p6Var = this.f53748a;
        if (i10 == t6.w0(i12, p6Var)) {
            a7.C(imageView, d02, a7.N(i12), p6Var);
        } else {
            imageView.setBackground(d02);
        }
        TextView textView = this.e;
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        TextView textView2 = this.f53751f;
        FrameLayout.LayoutParams layoutParams = this.d;
        FrameLayout.LayoutParams layoutParams2 = this.f53750c;
        if (isEmpty) {
            layoutParams2.topMargin = org.telegram.messenger.i0.L(10.0f);
            layoutParams2.bottomMargin = org.telegram.messenger.i0.L(10.0f);
            textView.setTypeface(null);
            textView.setTextSize(1, 16.0f);
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
            layoutParams.gravity = 23;
            textView2.setVisibility(8);
            return;
        }
        layoutParams2.topMargin = org.telegram.messenger.i0.L(14.33f);
        layoutParams2.bottomMargin = org.telegram.messenger.i0.L(10.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setTextSize(1, 15.0f);
        layoutParams.topMargin = org.telegram.messenger.i0.L(10.0f);
        layoutParams.bottomMargin = org.telegram.messenger.i0.L(8.66f);
        layoutParams.gravity = 55;
        textView2.setText(charSequence2);
        textView2.setVisibility(0);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setPercent(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        TextView textView = this.h;
        if (isEmpty) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        textView.setText(charSequence);
    }
}
