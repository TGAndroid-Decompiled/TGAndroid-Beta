package sh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.p9;
import org.telegram.ui.yh;
public final class a3 extends FrameLayout {
    public final int f47353a;
    public final g6 f47354b;
    public final p9 f47355c;
    public final View d;
    public final View f47356e;
    public final ImageView f47357f;
    public final TextView h;
    public final TextView f47358n;
    public final ImageView f47359r;
    public boolean f47360s;

    public a3(Context context, int i10, g6 g6Var) {
        super(context);
        this.f47353a = i10;
        this.f47354b = g6Var;
        p9 p9Var = new p9(context);
        this.f47355c = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(46.0f));
        addView(p9Var, c6.d(46, 46.0f, 19, 13.0f, 0.0f, 13.0f, 0.0f));
        View view = new View(context);
        this.d = view;
        view.setBackground(k6.K(AndroidUtilities.dp(11.0f), k6.v0(k6.f21659d6, g6Var)));
        addView(view, c6.d(22, 22.0f, 19, 40.0f, 15.0f, 0.0f, 0.0f));
        View view2 = new View(context);
        this.f47356e = view2;
        view2.setBackground(k6.K(AndroidUtilities.dp(9.665f), k6.v0(k6.uj, g6Var)));
        addView(view2, c6.b(19.33f, 19.33f, 19, 41.33f, 15.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f47357f = imageView;
        imageView.setScaleX(0.6f);
        imageView.setScaleY(0.6f);
        addView(imageView, c6.b(19.33f, 19.33f, 19, 41.33f, 15.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, c6.d(-1, -2.0f, 55, 66.0f, 8.66f, 10.0f, 0.0f));
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(k6.v0(k6.G6, g6Var));
        NotificationCenter.listenEmojiLoading(textView);
        TextView i11 = yh.i(linearLayout, textView, c6.t(-1, -2, 55, 6, 0, 24, 0), context);
        this.f47358n = i11;
        i11.setMaxLines(1);
        i11.setSingleLine(true);
        i11.setEllipsize(truncateAt);
        i11.setTextSize(1, 14.0f);
        i11.setTextColor(k6.v0(k6.f22053z6, g6Var));
        linearLayout.addView(i11, c6.t(-1, -2, 55, 6, 1, 24, 0));
        ImageView imageView2 = new ImageView(context);
        this.f47359r = imageView2;
        imageView2.setColorFilter(new PorterDuffColorFilter(k6.v0(k6.M6, g6Var), PorterDuff.Mode.SRC_IN));
        imageView2.setImageResource(R.drawable.msg_arrowright);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView2, c6.d(24, 24.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f47360s) {
            canvas.drawRect(AndroidUtilities.dp(72.0f), getHeight() - 1, getWidth(), getHeight(), k6.f21779k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), 1073741824));
    }
}
