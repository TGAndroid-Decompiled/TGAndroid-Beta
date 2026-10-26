package ph;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
public final class d extends FrameLayout implements p6 {
    public final u6 f46861a;
    public final ImageView f46862b;
    public final TextView f46863c;
    public int d;
    public boolean e;

    public d(Context context, u6 u6Var) {
        super(context);
        this.f46861a = u6Var;
        ImageView imageView = new ImageView(context);
        this.f46862b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_arrow_back);
        addView(imageView, gb1.h(48, 48.0f, 8388627, 6.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f46863c = textView;
        textView.setText(LocaleController.getString(R.string.EmojiSearchBackToSearch));
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, gb1.h(-2, -2.0f, 8388627, 50.0f, 0.0f, 16.0f, 0.0f));
        updateColors();
    }

    public final int a(float f7) {
        return i0.a.o(y6.w0(y6.Wk, this.f46861a), (int) (f7 * 255.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(y6.Wk));
    }

    public void setOnBackClickListener(View.OnClickListener onClickListener) {
        this.f46862b.setOnClickListener(onClickListener);
    }

    @Override
    public final void updateColors() {
        this.f46863c.setTextColor(a(0.6f));
        int a2 = a(1.0f);
        if (this.e && a2 == this.d) {
            return;
        }
        this.e = true;
        this.d = a2;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(a(0.6f), PorterDuff.Mode.MULTIPLY);
        ImageView imageView = this.f46862b;
        imageView.setColorFilter(porterDuffColorFilter);
        if (imageView.getBackground() != null) {
            y6.E1(imageView.getBackground(), a(0.1f), true);
        } else {
            imageView.setBackground(y6.g0(a(0.1f), 1, -1));
        }
    }
}
