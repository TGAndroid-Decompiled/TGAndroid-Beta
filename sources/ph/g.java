package ph;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.th;
public final class g extends FrameLayout {
    public final ImageView f45798a;
    public final FrameLayout.LayoutParams f45799b;
    public final FrameLayout.LayoutParams f45800c;
    public final TextView d;
    public final TextView f45801e;
    public final TextView f45802f;

    public g(Context context, c6 c6Var) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.f45798a = imageView;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        FrameLayout.LayoutParams d = f6.d(28, 28.0f, 51, 17.0f, 14.33f, 0.0f, 0.0f);
        this.f45799b = d;
        addView(imageView, d);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout.LayoutParams d10 = f6.d(-1, -2.0f, 55, 62.0f, 10.0f, 40.0f, 8.66f);
        this.f45800c = d10;
        addView(linearLayout, d10);
        TextView textView = new TextView(context);
        this.d = textView;
        org.telegram.ui.b.g(15.0f, 1, textView);
        textView.setTextColor(g6.v0(g6.G6, c6Var));
        TextView i10 = th.i(linearLayout, textView, f6.t(-1, -2, 55, 0, 0, 0, 0), context);
        this.f45801e = i10;
        i10.setTextSize(1, 14.0f);
        i10.setTextColor(g6.v0(g6.f23450z6, c6Var));
        linearLayout.addView(i10, f6.t(-1, -2, 55, 0, 3, 0, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setColorFilter(new PorterDuffColorFilter(g6.v0(g6.M6, c6Var), mode));
        imageView2.setImageResource(R.drawable.msg_arrowright);
        imageView2.setScaleType(scaleType);
        addView(imageView2, f6.d(24, 24.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f45802f = textView2;
        textView2.setTextColor(-1);
        textView2.setBackground(g6.b0(AndroidUtilities.dp(4.0f), g6.v0(g6.uj, c6Var)));
        textView2.setTextSize(1, 13.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(4.0f), 0);
        textView2.setGravity(17);
        textView2.setVisibility(8);
        addView(textView2, f6.d(-2, 18.0f, 21, 0.0f, 0.0f, 35.33f, 0.0f));
    }

    public final void a(int i10, int i11, CharSequence charSequence, CharSequence charSequence2) {
        ImageView imageView = this.f45798a;
        imageView.setImageResource(i11);
        imageView.setBackground(g6.b0(AndroidUtilities.dp(9.0f), i10));
        TextView textView = this.d;
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        TextView textView2 = this.f45801e;
        FrameLayout.LayoutParams layoutParams = this.f45800c;
        FrameLayout.LayoutParams layoutParams2 = this.f45799b;
        if (isEmpty) {
            layoutParams2.topMargin = AndroidUtilities.dp(10.0f);
            layoutParams2.bottomMargin = AndroidUtilities.dp(10.0f);
            textView.setTypeface(null);
            textView.setTextSize(1, 16.0f);
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
            layoutParams.gravity = 23;
            textView2.setVisibility(8);
            return;
        }
        layoutParams2.topMargin = AndroidUtilities.dp(14.33f);
        layoutParams2.bottomMargin = AndroidUtilities.dp(10.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 15.0f);
        layoutParams.topMargin = AndroidUtilities.dp(10.0f);
        layoutParams.bottomMargin = AndroidUtilities.dp(8.66f);
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
        TextView textView = this.f45802f;
        if (isEmpty) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        textView.setText(charSequence);
    }
}
