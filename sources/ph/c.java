package ph;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import c8.na;
import java.util.HashSet;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
public final class c extends FrameLayout implements b6 {
    public final h6 f55643a;
    public final ImageView f55644b;
    public final TextView f55645c;
    public int d;
    public boolean f55646e;

    public c(Context context, h6 h6Var) {
        super(context);
        this.f55643a = h6Var;
        ImageView imageView = new ImageView(context);
        this.f55644b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232059);
        addView(imageView, na.d(48, 48.0f, 8388627, 6.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f55645c = textView;
        textView.setText(hd.N0(2131751154, null));
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(g0.o());
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, na.d(-2, -2.0f, 8388627, 50.0f, 0.0f, 16.0f, 0.0f));
        updateColors();
    }

    public final int a(float f10) {
        return i0.a.o(m6.w0(m6.Nl, this.f55643a), (int) (f10 * 255.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(m6.Nl));
    }

    public void setOnBackClickListener(View.OnClickListener onClickListener) {
        this.f55644b.setOnClickListener(onClickListener);
    }

    @Override
    public final void updateColors() {
        this.f55645c.setTextColor(a(0.6f));
        int a10 = a(1.0f);
        if (this.f55646e && a10 == this.d) {
            return;
        }
        this.f55646e = true;
        this.d = a10;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(a(0.6f), PorterDuff.Mode.MULTIPLY);
        ImageView imageView = this.f55644b;
        imageView.setColorFilter(porterDuffColorFilter);
        if (imageView.getBackground() != null) {
            m6.H1(imageView.getBackground(), a(0.1f), true);
        } else {
            imageView.setBackground(m6.h0(a(0.1f), 1, -1));
        }
    }
}
