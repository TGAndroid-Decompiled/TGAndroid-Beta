package rh;

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
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.p9;
import org.telegram.ui.yh;
public final class b3 extends FrameLayout {
    public final int f43472a;
    public final f6 f43473b;
    public final p9 f43474c;
    public final View d;
    public final View e;
    public final ImageView f43475f;
    public final TextView h;
    public final TextView f43476n;
    public final ImageView f43477r;
    public boolean f43478s;

    public b3(Context context, int i10, f6 f6Var) {
        super(context);
        this.f43472a = i10;
        this.f43473b = f6Var;
        p9 p9Var = new p9(context);
        this.f43474c = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(46.0f));
        addView(p9Var, b6.d(46, 46.0f, 19, 13.0f, 0.0f, 13.0f, 0.0f));
        View view = new View(context);
        this.d = view;
        view.setBackground(j6.K(AndroidUtilities.dp(11.0f), j6.v0(j6.f19906d6, f6Var)));
        addView(view, b6.d(22, 22.0f, 19, 40.0f, 15.0f, 0.0f, 0.0f));
        View view2 = new View(context);
        this.e = view2;
        view2.setBackground(j6.K(AndroidUtilities.dp(9.665f), j6.v0(j6.uj, f6Var)));
        addView(view2, b6.b(19.33f, 19.33f, 19, 41.33f, 15.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f43475f = imageView;
        imageView.setScaleX(0.6f);
        imageView.setScaleY(0.6f);
        addView(imageView, b6.b(19.33f, 19.33f, 19, 41.33f, 15.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, b6.d(-1, -2.0f, 55, 66.0f, 8.66f, 10.0f, 0.0f));
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(j6.v0(j6.G6, f6Var));
        NotificationCenter.listenEmojiLoading(textView);
        TextView j10 = yh.j(linearLayout, textView, b6.t(-1, -2, 55, 6, 0, 24, 0), context);
        this.f43476n = j10;
        j10.setMaxLines(1);
        j10.setSingleLine(true);
        j10.setEllipsize(truncateAt);
        j10.setTextSize(1, 14.0f);
        j10.setTextColor(j6.v0(j6.f20298z6, f6Var));
        linearLayout.addView(j10, b6.t(-1, -2, 55, 6, 1, 24, 0));
        ImageView imageView2 = new ImageView(context);
        this.f43477r = imageView2;
        imageView2.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.M6, f6Var), PorterDuff.Mode.SRC_IN));
        imageView2.setImageResource(R.drawable.msg_arrowright);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView2, b6.d(24, 24.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f43478s) {
            canvas.drawRect(AndroidUtilities.dp(72.0f), getHeight() - 1, getWidth(), getHeight(), j6.f20025k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), 1073741824));
    }
}
