package yg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.x5;
public final class d extends FrameLayout implements x5 {
    public final c6 f50545a;
    public final ImageView f50546b;
    public final TextView f50547c;

    public d(Context context, c6 c6Var) {
        super(context);
        this.f50545a = c6Var;
        ImageView imageView = new ImageView(context);
        this.f50546b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_arrow_back);
        addView(imageView, f6.d(48, 48.0f, 8388627, 6.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f50547c = textView;
        textView.setText(LocaleController.getString(R.string.EmojiSearchBackToSearch));
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, f6.d(-2, -2.0f, 8388627, 50.0f, 0.0f, 16.0f, 0.0f));
        e();
    }

    @Override
    public final void e() {
        int i10 = g6.Wk;
        c6 c6Var = this.f50545a;
        int i11 = (int) 153.0f;
        this.f50547c.setTextColor(i0.a.k(g6.v0(i10, c6Var), i11));
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i0.a.k(g6.v0(i10, c6Var), i11), PorterDuff.Mode.MULTIPLY);
        ImageView imageView = this.f50546b;
        imageView.setColorFilter(porterDuffColorFilter);
        imageView.setBackground(g6.f0(i0.a.k(g6.v0(i10, c6Var), (int) 25.5f), 1, -1));
    }

    public int[] getColorKeys() {
        return null;
    }

    public void setOnBackClickListener(View.OnClickListener onClickListener) {
        this.f50546b.setOnClickListener(onClickListener);
    }
}
