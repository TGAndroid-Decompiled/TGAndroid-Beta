package ph;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import c8.ha;
import java.util.HashSet;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
public final class c extends FrameLayout implements a6 {
    public final f6 f53523a;
    public final ImageView f53524b;
    public final TextView f53525c;
    public int d;
    public boolean f53526e;

    public c(Context context, f6 f6Var) {
        super(context);
        this.f53523a = f6Var;
        ImageView imageView = new ImageView(context);
        this.f53524b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232057);
        addView(imageView, ha.d(48, 48.0f, 8388627, 6.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f53525c = textView;
        textView.setText(hd.M0(2131751167, null));
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(g0.o());
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, ha.d(-2, -2.0f, 8388627, 50.0f, 0.0f, 16.0f, 0.0f));
        updateColors();
    }

    public final int a(float f10) {
        return i0.a.o(k6.w0(k6.Kl, this.f53523a), (int) (f10 * 255.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.Kl));
    }

    public void setOnBackClickListener(View.OnClickListener onClickListener) {
        this.f53524b.setOnClickListener(onClickListener);
    }

    @Override
    public final void updateColors() {
        this.f53525c.setTextColor(a(0.6f));
        int a10 = a(1.0f);
        if (this.f53526e && a10 == this.d) {
            return;
        }
        this.f53526e = true;
        this.d = a10;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(a(0.6f), PorterDuff.Mode.MULTIPLY);
        ImageView imageView = this.f53524b;
        imageView.setColorFilter(porterDuffColorFilter);
        if (imageView.getBackground() != null) {
            k6.H1(imageView.getBackground(), a(0.1f), true);
        } else {
            imageView.setBackground(k6.h0(a(0.1f), 1, -1));
        }
    }
}
