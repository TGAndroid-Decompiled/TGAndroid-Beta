package xh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.a30;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import w7.b6;
public final class h extends FrameLayout {
    public final ImageView f53791a;
    public final TextView f53792b;
    public final TextView f53793c;

    public h(Context context, p6 p6Var, boolean z10) {
        super(context);
        float f7;
        ImageView imageView = new ImageView(context);
        this.f53791a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i10 = t6.G6;
        a7.t(imageView, i10, p6Var, PorterDuff.Mode.SRC_IN);
        addView(imageView, b6.d(24, 24.0f, 51, 20.0f, 11.46f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        if (z10) {
            f7 = 2.0f;
        } else {
            f7 = 9.8f;
        }
        addView(linearLayout, b6.d(-1, -2.0f, 23, 64.0f, f7, 24.0f, z10 ? 4.0f : 9.8f));
        TextView textView = new TextView(context);
        this.f53792b = textView;
        a7.V(textView, i10, p6Var);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setTextSize(1, 14.0f);
        TextView f10 = a30.f(linearLayout, textView, b6.t(-1, -2, 55, 0, 0, 0, 1), context);
        this.f53793c = f10;
        a7.V(f10, t6.f21331z6, p6Var);
        f10.setTextSize(1, 14.0f);
        linearLayout.addView(f10, b6.t(-1, -2, 55, 0, 0, 0, 0));
    }

    public final void a(int i10, CharSequence charSequence, CharSequence charSequence2) {
        this.f53791a.setImageResource(i10);
        this.f53792b.setText(charSequence);
        this.f53793c.setText(charSequence2);
    }

    public void setText(CharSequence charSequence) {
        this.f53793c.setText(charSequence);
    }
}
