package vg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.a21;
import w7.w5;
public final class t extends FrameLayout {
    public final vh.n f49851a;
    public final FrameLayout f49852b;
    public String f49853c;
    public String d;
    public final ImageView f49854e;

    public t(Context context, c6 c6Var) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f49852b = frameLayout;
        vh.n nVar = new vh.n(context);
        this.f49851a = nVar;
        nVar.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(13.0f));
        nVar.setTextSize(1, 16.0f);
        nVar.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        nVar.setSingleLine(true);
        nVar.setTextColor(h6.w0(h6.G6, c6Var));
        nVar.f49964r = false;
        frameLayout.addView(nVar, w5.e(-2, -2, 17));
        int dp = AndroidUtilities.dp(8.0f);
        int w02 = h6.w0(h6.e7, c6Var);
        int i10 = h6.f20650i6;
        int k10 = i0.a.k(h6.w0(i10, c6Var), 76);
        frameLayout.setBackground(h6.j0(dp, dp, dp, dp, w02, k10, k10));
        addView(frameLayout, w5.a(-2.0f, 14.0f, 0.0f, 14.0f, 0.0f, -1, 0));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final t f49850b;

            {
                this.f49850b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        AndroidUtilities.addToClipboard(this.f49850b.d);
                        return;
                    default:
                        AndroidUtilities.addToClipboard(this.f49850b.d);
                        return;
                }
            }
        });
        ImageView imageView = new ImageView(getContext());
        this.f49854e = imageView;
        imageView.setImageResource(R.drawable.menu_copy_s);
        imageView.setColorFilter(h6.w0(h6.f20667j5, c6Var));
        imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        int dp2 = AndroidUtilities.dp(20.0f);
        int k11 = i0.a.k(h6.w0(i10, c6Var), 76);
        imageView.setBackground(h6.j0(dp2, dp2, dp2, dp2, 0, k11, k11));
        addView(imageView, w5.a(40.0f, 15.0f, 0.0f, 17.0f, 0.0f, 40, 21));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final t f49850b;

            {
                this.f49850b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        AndroidUtilities.addToClipboard(this.f49850b.d);
                        return;
                    default:
                        AndroidUtilities.addToClipboard(this.f49850b.d);
                        return;
                }
            }
        });
    }

    public final void a(Runnable runnable) {
        this.f49854e.setVisibility(4);
        int dp = AndroidUtilities.dp(18.0f);
        int dp2 = AndroidUtilities.dp(14.0f);
        int dp3 = AndroidUtilities.dp(14.0f);
        int dp4 = AndroidUtilities.dp(18.0f);
        vh.n nVar = this.f49851a;
        nVar.setPadding(dp, dp2, dp3, dp4);
        ?? obj = new Object();
        obj.f33249a |= 256;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("t.me/giftcode/" + this.f49853c);
        if (this.f49853c == null) {
            spannableStringBuilder.append((CharSequence) "1234567891011123654897566536223");
        }
        spannableStringBuilder.setSpan(new a21(obj, 0), 0, spannableStringBuilder.length(), 33);
        nVar.setText(spannableStringBuilder);
        this.f49852b.setOnClickListener(new bi.p(4, runnable));
    }

    public void setSlug(String str) {
        this.f49853c = str;
        this.d = sc.v.i("https://t.me/giftcode/", str);
        this.f49851a.setText("t.me/giftcode/" + str);
    }
}
