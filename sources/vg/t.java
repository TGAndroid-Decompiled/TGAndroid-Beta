package vg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.n11;
import w7.z5;
public final class t extends FrameLayout {
    public final vh.n f48326a;
    public final FrameLayout f48327b;
    public String f48328c;
    public String d;
    public final ImageView f48329e;

    public t(Context context, d6 d6Var) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f48327b = frameLayout;
        vh.n nVar = new vh.n(context);
        this.f48326a = nVar;
        nVar.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(13.0f));
        nVar.setTextSize(1, 16.0f);
        nVar.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        nVar.setSingleLine(true);
        nVar.setTextColor(i6.v0(i6.G6, d6Var));
        nVar.f48436f = false;
        frameLayout.addView(nVar, z5.e(-2, -2, 17));
        int dp = AndroidUtilities.dp(8.0f);
        int v02 = i6.v0(i6.e7, d6Var);
        int i10 = i6.f20909i6;
        int k10 = i0.a.k(i6.v0(i10, d6Var), 76);
        frameLayout.setBackground(i6.i0(dp, dp, dp, dp, v02, k10, k10));
        addView(frameLayout, z5.d(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final t f48325b;

            {
                this.f48325b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        AndroidUtilities.addToClipboard(this.f48325b.d);
                        return;
                    default:
                        AndroidUtilities.addToClipboard(this.f48325b.d);
                        return;
                }
            }
        });
        ImageView imageView = new ImageView(getContext());
        this.f48329e = imageView;
        imageView.setImageResource(R.drawable.menu_copy_s);
        imageView.setColorFilter(i6.v0(i6.f20926j5, d6Var));
        imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        int dp2 = AndroidUtilities.dp(20.0f);
        int k11 = i0.a.k(i6.v0(i10, d6Var), 76);
        imageView.setBackground(i6.i0(dp2, dp2, dp2, dp2, 0, k11, k11));
        addView(imageView, z5.d(40, 40.0f, 21, 15.0f, 0.0f, 17.0f, 0.0f));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final t f48325b;

            {
                this.f48325b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        AndroidUtilities.addToClipboard(this.f48325b.d);
                        return;
                    default:
                        AndroidUtilities.addToClipboard(this.f48325b.d);
                        return;
                }
            }
        });
    }

    public final void a(Runnable runnable) {
        this.f48329e.setVisibility(4);
        int dp = AndroidUtilities.dp(18.0f);
        int dp2 = AndroidUtilities.dp(14.0f);
        int dp3 = AndroidUtilities.dp(14.0f);
        int dp4 = AndroidUtilities.dp(18.0f);
        vh.n nVar = this.f48326a;
        nVar.setPadding(dp, dp2, dp3, dp4);
        ?? obj = new Object();
        obj.f28497a |= 256;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("t.me/giftcode/" + this.f48328c);
        if (this.f48328c == null) {
            spannableStringBuilder.append((CharSequence) "1234567891011123654897566536223");
        }
        spannableStringBuilder.setSpan(new n11(obj, 0), 0, spannableStringBuilder.length(), 33);
        nVar.setText(spannableStringBuilder);
        this.f48327b.setOnClickListener(new bi.p(4, runnable));
    }

    public void setSlug(String str) {
        this.f48328c = str;
        this.d = t8.b.i("https://t.me/giftcode/", str);
        this.f48326a.setText("t.me/giftcode/" + str);
    }
}
