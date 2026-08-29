package ph;

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
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.t9;
import org.telegram.ui.th;
public final class a3 extends FrameLayout {
    public final int f45730a;
    public final c6 f45731b;
    public final t9 f45732c;
    public final View d;
    public final View f45733e;
    public final ImageView f45734f;
    public final TextView h;
    public final TextView f45735n;
    public final ImageView f45736r;
    public boolean f45737s;

    public a3(Context context, int i10, c6 c6Var) {
        super(context);
        this.f45730a = i10;
        this.f45731b = c6Var;
        t9 t9Var = new t9(context);
        this.f45732c = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(46.0f));
        addView(t9Var, f6.d(46, 46.0f, 19, 13.0f, 0.0f, 13.0f, 0.0f));
        View view = new View(context);
        this.d = view;
        view.setBackground(g6.K(AndroidUtilities.dp(11.0f), g6.v0(g6.f23062d6, c6Var)));
        addView(view, f6.d(22, 22.0f, 19, 40.0f, 15.0f, 0.0f, 0.0f));
        View view2 = new View(context);
        this.f45733e = view2;
        view2.setBackground(g6.K(AndroidUtilities.dp(9.665f), g6.v0(g6.uj, c6Var)));
        addView(view2, f6.b(19.33f, 19.33f, 19, 41.33f, 15.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f45734f = imageView;
        imageView.setScaleX(0.6f);
        imageView.setScaleY(0.6f);
        addView(imageView, f6.b(19.33f, 19.33f, 19, 41.33f, 15.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, f6.d(-1, -2.0f, 55, 66.0f, 8.66f, 10.0f, 0.0f));
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(g6.v0(g6.G6, c6Var));
        NotificationCenter.listenEmojiLoading(textView);
        TextView i11 = th.i(linearLayout, textView, f6.t(-1, -2, 55, 6, 0, 24, 0), context);
        this.f45735n = i11;
        i11.setMaxLines(1);
        i11.setSingleLine(true);
        i11.setEllipsize(truncateAt);
        i11.setTextSize(1, 14.0f);
        i11.setTextColor(g6.v0(g6.f23450z6, c6Var));
        linearLayout.addView(i11, f6.t(-1, -2, 55, 6, 1, 24, 0));
        ImageView imageView2 = new ImageView(context);
        this.f45736r = imageView2;
        imageView2.setColorFilter(new PorterDuffColorFilter(g6.v0(g6.M6, c6Var), PorterDuff.Mode.SRC_IN));
        imageView2.setImageResource(R.drawable.msg_arrowright);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView2, f6.d(24, 24.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f45737s) {
            canvas.drawRect(AndroidUtilities.dp(72.0f), getHeight() - 1, getWidth(), getHeight(), g6.f23183k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), 1073741824));
    }
}
