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
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
public final class c extends FrameLayout implements c6 {
    public final i6 f55756a;
    public final ImageView f55757b;
    public final TextView f55758c;
    public int d;
    public boolean f55759e;

    public c(Context context, i6 i6Var) {
        super(context);
        this.f55756a = i6Var;
        ImageView imageView = new ImageView(context);
        this.f55757b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232062);
        addView(imageView, na.d(48, 48.0f, 8388627, 6.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f55758c = textView;
        textView.setText(gd.N0(2131751154, null));
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(g0.o());
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, na.d(-2, -2.0f, 8388627, 50.0f, 0.0f, 16.0f, 0.0f));
        updateColors();
    }

    public final int a(float f10) {
        return i0.a.o(n6.w0(n6.Nl, this.f55756a), (int) (f10 * 255.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(n6.Nl));
    }

    public void setOnBackClickListener(View.OnClickListener onClickListener) {
        this.f55757b.setOnClickListener(onClickListener);
    }

    @Override
    public final void updateColors() {
        this.f55758c.setTextColor(a(0.6f));
        int a10 = a(1.0f);
        if (this.f55759e && a10 == this.d) {
            return;
        }
        this.f55759e = true;
        this.d = a10;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(a(0.6f), PorterDuff.Mode.MULTIPLY);
        ImageView imageView = this.f55757b;
        imageView.setColorFilter(porterDuffColorFilter);
        if (imageView.getBackground() != null) {
            n6.H1(imageView.getBackground(), a(0.1f), true);
        } else {
            imageView.setBackground(n6.h0(a(0.1f), 1, -1));
        }
    }
}
