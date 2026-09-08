package wg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Components.o01;
import w7.x5;
public final class t extends FrameLayout {
    public final wh.p f48584a;
    public final FrameLayout f48585b;
    public String f48586c;
    public String d;
    public final ImageView f48587e;

    public t(Context context, f6 f6Var) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f48585b = frameLayout;
        wh.p pVar = new wh.p(context);
        this.f48584a = pVar;
        pVar.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(13.0f));
        pVar.setTextSize(1, 16.0f);
        pVar.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        pVar.setSingleLine(true);
        pVar.setTextColor(j6.v0(j6.G6, f6Var));
        pVar.f48698f = false;
        frameLayout.addView(pVar, x5.e(-2, -2, 17));
        int dp = AndroidUtilities.dp(8.0f);
        int v02 = j6.v0(j6.e7, f6Var);
        int i10 = j6.f20780i6;
        int k10 = i0.a.k(j6.v0(i10, f6Var), 76);
        frameLayout.setBackground(j6.i0(dp, dp, dp, dp, v02, k10, k10));
        addView(frameLayout, x5.d(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final t f48583b;

            {
                this.f48583b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        AndroidUtilities.addToClipboard(this.f48583b.d);
                        return;
                    default:
                        AndroidUtilities.addToClipboard(this.f48583b.d);
                        return;
                }
            }
        });
        ImageView imageView = new ImageView(getContext());
        this.f48587e = imageView;
        imageView.setImageResource(R.drawable.menu_copy_s);
        imageView.setColorFilter(j6.v0(j6.f20797j5, f6Var));
        imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        int dp2 = AndroidUtilities.dp(20.0f);
        int k11 = i0.a.k(j6.v0(i10, f6Var), 76);
        imageView.setBackground(j6.i0(dp2, dp2, dp2, dp2, 0, k11, k11));
        addView(imageView, x5.d(40, 40.0f, 21, 15.0f, 0.0f, 17.0f, 0.0f));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final t f48583b;

            {
                this.f48583b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        AndroidUtilities.addToClipboard(this.f48583b.d);
                        return;
                    default:
                        AndroidUtilities.addToClipboard(this.f48583b.d);
                        return;
                }
            }
        });
    }

    public final void a(Runnable runnable) {
        this.f48587e.setVisibility(4);
        int dp = AndroidUtilities.dp(18.0f);
        int dp2 = AndroidUtilities.dp(14.0f);
        int dp3 = AndroidUtilities.dp(14.0f);
        int dp4 = AndroidUtilities.dp(18.0f);
        wh.p pVar = this.f48584a;
        pVar.setPadding(dp, dp2, dp3, dp4);
        ?? obj = new Object();
        obj.f28618a |= 256;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("t.me/giftcode/" + this.f48586c);
        if (this.f48586c == null) {
            spannableStringBuilder.append((CharSequence) "1234567891011123654897566536223");
        }
        spannableStringBuilder.setSpan(new o01(obj, 0), 0, spannableStringBuilder.length(), 33);
        pVar.setText(spannableStringBuilder);
        this.f48585b.setOnClickListener(new ci.o(4, runnable));
    }

    public void setSlug(String str) {
        this.f48586c = str;
        this.d = p6.i("https://t.me/giftcode/", str);
        this.f48584a.setText("t.me/giftcode/" + str);
    }
}
