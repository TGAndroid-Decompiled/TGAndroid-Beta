package xh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.a30;
import org.telegram.messenger.at;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w6;
import org.telegram.ui.Components.g9;
import w7.b6;
public final class w2 extends FrameLayout {
    public final int f54117a;
    public final p6 f54118b;
    public final g9 f54119c;
    public final View d;
    public final View e;
    public final ImageView f54120f;
    public final TextView h;
    public final TextView f54121n;
    public final ImageView f54122r;
    public boolean f54123s;

    public w2(int i10, Context context, p6 p6Var) {
        super(context);
        this.f54117a = i10;
        this.f54118b = p6Var;
        g9 g9Var = new g9(context);
        this.f54119c = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(46.0f));
        addView(g9Var, b6.d(46, 46.0f, 19, 13.0f, 0.0f, 13.0f, 0.0f));
        View view = new View(context);
        this.d = view;
        int L = org.telegram.messenger.i0.L(11.0f);
        int i11 = t6.f20930d6;
        Drawable L2 = t6.L(L, t6.w0(i11, p6Var));
        w6 N = a7.N(i11);
        view.setBackground(L2);
        a7.k(view, L2, N, null, p6Var);
        addView(view, b6.d(22, 22.0f, 19, 40.0f, 15.0f, 0.0f, 0.0f));
        View view2 = new View(context);
        this.e = view2;
        int L3 = org.telegram.messenger.i0.L(9.665f);
        int i12 = t6.ik;
        Drawable L4 = t6.L(L3, t6.w0(i12, p6Var));
        w6 N2 = a7.N(i12);
        view2.setBackground(L4);
        a7.k(view2, L4, N2, null, p6Var);
        addView(view2, b6.b(19.33f, 19.33f, 19, 41.33f, 15.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f54120f = imageView;
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
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setTextSize(1, 16.0f);
        a7.V(textView, t6.G6, p6Var);
        at.i(textView);
        TextView f7 = a30.f(linearLayout, textView, b6.t(-1, -2, 55, 6, 0, 24, 0), context);
        this.f54121n = f7;
        f7.setMaxLines(1);
        f7.setSingleLine(true);
        f7.setEllipsize(truncateAt);
        f7.setTextSize(1, 14.0f);
        a7.V(f7, t6.f21331z6, p6Var);
        linearLayout.addView(f7, b6.t(-1, -2, 55, 6, 1, 24, 0));
        ImageView imageView2 = new ImageView(context);
        this.f54122r = imageView2;
        a7.t(imageView2, t6.M6, p6Var, PorterDuff.Mode.SRC_IN);
        imageView2.setImageResource(2131232058);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView2, b6.d(24, 24.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f54123s) {
            canvas.drawRect(org.telegram.messenger.i0.L(72.0f), getHeight() - 1, getWidth(), getHeight(), t6.f21053k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(58.0f), 1073741824));
    }
}
