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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.d11;
import w7.y5;
public final class t extends FrameLayout {
    public final vh.n f44632a;
    public final FrameLayout f44633b;
    public String f44634c;
    public String d;
    public final ImageView e;

    public t(Context context, d6 d6Var) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f44633b = frameLayout;
        vh.n nVar = new vh.n(context);
        this.f44632a = nVar;
        nVar.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(13.0f));
        nVar.setTextSize(1, 16.0f);
        nVar.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        nVar.setSingleLine(true);
        nVar.setTextColor(h6.v0(h6.G6, d6Var));
        nVar.f44733f = false;
        frameLayout.addView(nVar, y5.e(-2, -2, 17));
        int dp = AndroidUtilities.dp(8.0f);
        int v02 = h6.v0(h6.e7, d6Var);
        int i10 = h6.f19148i6;
        int k10 = i0.a.k(h6.v0(i10, d6Var), 76);
        frameLayout.setBackground(h6.i0(dp, dp, dp, dp, v02, k10, k10));
        addView(frameLayout, y5.d(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final t f44631b;

            {
                this.f44631b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        AndroidUtilities.addToClipboard(this.f44631b.d);
                        return;
                    default:
                        AndroidUtilities.addToClipboard(this.f44631b.d);
                        return;
                }
            }
        });
        ImageView imageView = new ImageView(getContext());
        this.e = imageView;
        imageView.setImageResource(R.drawable.menu_copy_s);
        imageView.setColorFilter(h6.v0(h6.f19165j5, d6Var));
        imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        int dp2 = AndroidUtilities.dp(20.0f);
        int k11 = i0.a.k(h6.v0(i10, d6Var), 76);
        imageView.setBackground(h6.i0(dp2, dp2, dp2, dp2, 0, k11, k11));
        addView(imageView, y5.d(40, 40.0f, 21, 15.0f, 0.0f, 17.0f, 0.0f));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final t f44631b;

            {
                this.f44631b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        AndroidUtilities.addToClipboard(this.f44631b.d);
                        return;
                    default:
                        AndroidUtilities.addToClipboard(this.f44631b.d);
                        return;
                }
            }
        });
    }

    public final void a(Runnable runnable) {
        this.e.setVisibility(4);
        int dp = AndroidUtilities.dp(18.0f);
        int dp2 = AndroidUtilities.dp(14.0f);
        int dp3 = AndroidUtilities.dp(14.0f);
        int dp4 = AndroidUtilities.dp(18.0f);
        vh.n nVar = this.f44632a;
        nVar.setPadding(dp, dp2, dp3, dp4);
        ?? obj = new Object();
        obj.f23182a |= 256;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("t.me/giftcode/" + this.f44634c);
        if (this.f44634c == null) {
            spannableStringBuilder.append((CharSequence) "1234567891011123654897566536223");
        }
        spannableStringBuilder.setSpan(new d11(obj, 0), 0, spannableStringBuilder.length(), 33);
        nVar.setText(spannableStringBuilder);
        this.f44633b.setOnClickListener(new bi.p(4, runnable));
    }

    public void setSlug(String str) {
        this.f44634c = str;
        this.d = v7.j.g("https://t.me/giftcode/", str);
        this.f44632a.setText("t.me/giftcode/" + str);
    }
}
