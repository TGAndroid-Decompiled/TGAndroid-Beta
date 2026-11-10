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
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
public final class c extends FrameLayout implements c6 {
    public final h6 f53652a;
    public final ImageView f53653b;
    public final TextView f53654c;
    public int d;
    public boolean f53655e;

    public c(Context context, h6 h6Var) {
        super(context);
        this.f53652a = h6Var;
        ImageView imageView = new ImageView(context);
        this.f53653b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232057);
        addView(imageView, ha.d(48, 48.0f, 8388627, 6.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f53654c = textView;
        textView.setText(id.M0(2131751166, null));
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(g0.o());
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, ha.d(-2, -2.0f, 8388627, 50.0f, 0.0f, 16.0f, 0.0f));
        updateColors();
    }

    public final int a(float f10) {
        return i0.a.o(m6.w0(m6.Kl, this.f53652a), (int) (f10 * 255.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(m6.Kl));
    }

    public void setOnBackClickListener(View.OnClickListener onClickListener) {
        this.f53653b.setOnClickListener(onClickListener);
    }

    @Override
    public final void updateColors() {
        this.f53654c.setTextColor(a(0.6f));
        int a10 = a(1.0f);
        if (this.f53655e && a10 == this.d) {
            return;
        }
        this.f53655e = true;
        this.d = a10;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(a(0.6f), PorterDuff.Mode.MULTIPLY);
        ImageView imageView = this.f53653b;
        imageView.setColorFilter(porterDuffColorFilter);
        if (imageView.getBackground() != null) {
            m6.H1(imageView.getBackground(), a(0.1f), true);
        } else {
            imageView.setBackground(m6.h0(a(0.1f), 1, -1));
        }
    }
}
