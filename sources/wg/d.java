package wg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.x5;

public final class d extends FrameLayout implements x5 {

    public final c6 f49320a;

    public final ImageView f49321b;

    public final TextView f49322c;

    public d(Context context, c6 c6Var) {
        super(context);
        this.f49320a = c6Var;
        ImageView imageView = new ImageView(context);
        this.f49321b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_arrow_back);
        addView(imageView, z5.d(48, 48.0f, 8388627, 6.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f49322c = textView;
        textView.setText(LocaleController.getString(R.string.EmojiSearchBackToSearch));
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, z5.d(-2, -2.0f, 8388627, 50.0f, 0.0f, 16.0f, 0.0f));
        d();
    }

    @Override
    public final void d() {
        int i10 = g6.Wk;
        c6 c6Var = this.f49320a;
        int i11 = (int) 153.0f;
        this.f49322c.setTextColor(i0.b.k(g6.v0(i10, c6Var), i11));
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i0.b.k(g6.v0(i10, c6Var), i11), PorterDuff.Mode.MULTIPLY);
        ImageView imageView = this.f49321b;
        imageView.setColorFilter(porterDuffColorFilter);
        imageView.setBackground(g6.f0(i0.b.k(g6.v0(i10, c6Var), (int) 25.5f), 1, -1));
    }

    public int[] getColorKeys() {
        return null;
    }

    public void setOnBackClickListener(View.OnClickListener onClickListener) {
        this.f49321b.setOnClickListener(onClickListener);
    }
}
