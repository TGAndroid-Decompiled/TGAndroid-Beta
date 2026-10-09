package vg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.u11;
import w7.x5;
public final class t extends FrameLayout {
    public final vh.n f49621a;
    public final FrameLayout f49622b;
    public String f49623c;
    public String d;
    public final ImageView f49624e;

    public t(Context context, e6 e6Var) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f49622b = frameLayout;
        vh.n nVar = new vh.n(context);
        this.f49621a = nVar;
        nVar.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(13.0f));
        nVar.setTextSize(1, 16.0f);
        nVar.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        nVar.setSingleLine(true);
        nVar.setTextColor(i6.w0(i6.G6, e6Var));
        nVar.f49734r = false;
        frameLayout.addView(nVar, x5.e(-2, -2, 17));
        int dp = AndroidUtilities.dp(8.0f);
        int w02 = i6.w0(i6.e7, e6Var);
        int i10 = i6.f20888i6;
        int k10 = i0.a.k(i6.w0(i10, e6Var), 76);
        frameLayout.setBackground(i6.j0(dp, dp, dp, dp, w02, k10, k10));
        addView(frameLayout, x5.a(-2.0f, 14.0f, 0.0f, 14.0f, 0.0f, -1, 0));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final t f49620b;

            {
                this.f49620b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        AndroidUtilities.addToClipboard(this.f49620b.d);
                        return;
                    default:
                        AndroidUtilities.addToClipboard(this.f49620b.d);
                        return;
                }
            }
        });
        ImageView imageView = new ImageView(getContext());
        this.f49624e = imageView;
        imageView.setImageResource(R.drawable.menu_copy_s);
        imageView.setColorFilter(i6.w0(i6.f20905j5, e6Var));
        imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        int dp2 = AndroidUtilities.dp(20.0f);
        int k11 = i0.a.k(i6.w0(i10, e6Var), 76);
        imageView.setBackground(i6.j0(dp2, dp2, dp2, dp2, 0, k11, k11));
        addView(imageView, x5.a(40.0f, 15.0f, 0.0f, 17.0f, 0.0f, 40, 21));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final t f49620b;

            {
                this.f49620b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        AndroidUtilities.addToClipboard(this.f49620b.d);
                        return;
                    default:
                        AndroidUtilities.addToClipboard(this.f49620b.d);
                        return;
                }
            }
        });
    }

    public final void a(Runnable runnable) {
        this.f49624e.setVisibility(4);
        int dp = AndroidUtilities.dp(18.0f);
        int dp2 = AndroidUtilities.dp(14.0f);
        int dp3 = AndroidUtilities.dp(14.0f);
        int dp4 = AndroidUtilities.dp(18.0f);
        vh.n nVar = this.f49621a;
        nVar.setPadding(dp, dp2, dp3, dp4);
        ?? obj = new Object();
        obj.f30974a |= 256;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("t.me/giftcode/" + this.f49623c);
        if (this.f49623c == null) {
            spannableStringBuilder.append((CharSequence) "1234567891011123654897566536223");
        }
        spannableStringBuilder.setSpan(new u11(obj, 0), 0, spannableStringBuilder.length(), 33);
        nVar.setText(spannableStringBuilder);
        this.f49622b.setOnClickListener(new bi.p(4, runnable));
    }

    public void setSlug(String str) {
        this.f49623c = str;
        this.d = sc.v.i("https://t.me/giftcode/", str);
        this.f49621a.setText("t.me/giftcode/" + str);
    }
}
