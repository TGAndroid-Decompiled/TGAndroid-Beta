package qh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import b8.mf;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.z5;
public final class c extends FrameLayout implements z5 {
    public final e6 f53947a;
    public final ImageView f53948b;
    public final TextView f53949c;
    public int d;
    public boolean f53950e;

    public c(Context context, e6 e6Var) {
        super(context);
        this.f53947a = e6Var;
        ImageView imageView = new ImageView(context);
        this.f53948b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232057);
        addView(imageView, mf.d(48, 48.0f, 8388627, 6.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f53949c = textView;
        textView.setText(bd.M0(2131751167, null));
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(g0.o());
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, mf.d(-2, -2.0f, 8388627, 50.0f, 0.0f, 16.0f, 0.0f));
        updateColors();
    }

    public final int a(float f10) {
        return i0.a.o(k6.w0(k6.Kl, this.f53947a), (int) (f10 * 255.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.Kl));
    }

    public void setOnBackClickListener(View.OnClickListener onClickListener) {
        this.f53948b.setOnClickListener(onClickListener);
    }

    @Override
    public final void updateColors() {
        this.f53949c.setTextColor(a(0.6f));
        int a10 = a(1.0f);
        if (this.f53950e && a10 == this.d) {
            return;
        }
        this.f53950e = true;
        this.d = a10;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(a(0.6f), PorterDuff.Mode.MULTIPLY);
        ImageView imageView = this.f53948b;
        imageView.setColorFilter(porterDuffColorFilter);
        if (imageView.getBackground() != null) {
            k6.H1(imageView.getBackground(), a(0.1f), true);
        } else {
            imageView.setBackground(k6.h0(a(0.1f), 1, -1));
        }
    }
}
