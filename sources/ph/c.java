package ph;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import c8.ja;
import java.util.HashSet;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.z5;
public final class c extends FrameLayout implements z5 {
    public final e6 f55057a;
    public final ImageView f55058b;
    public final TextView f55059c;
    public int d;
    public boolean f55060e;

    public c(Context context, e6 e6Var) {
        super(context);
        this.f55057a = e6Var;
        ImageView imageView = new ImageView(context);
        this.f55058b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232058);
        addView(imageView, ja.d(48, 48.0f, 8388627, 6.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f55059c = textView;
        textView.setText(hd.M0(2131751166, null));
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(g0.o());
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, ja.d(-2, -2.0f, 8388627, 50.0f, 0.0f, 16.0f, 0.0f));
        updateColors();
    }

    public final int a(float f10) {
        return i0.a.o(j6.w0(j6.Nl, this.f55057a), (int) (f10 * 255.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(j6.Nl));
    }

    public void setOnBackClickListener(View.OnClickListener onClickListener) {
        this.f55058b.setOnClickListener(onClickListener);
    }

    @Override
    public final void updateColors() {
        this.f55059c.setTextColor(a(0.6f));
        int a10 = a(1.0f);
        if (this.f55060e && a10 == this.d) {
            return;
        }
        this.f55060e = true;
        this.d = a10;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(a(0.6f), PorterDuff.Mode.MULTIPLY);
        ImageView imageView = this.f55058b;
        imageView.setColorFilter(porterDuffColorFilter);
        if (imageView.getBackground() != null) {
            j6.H1(imageView.getBackground(), a(0.1f), true);
        } else {
            imageView.setBackground(j6.h0(a(0.1f), 1, -1));
        }
    }
}
