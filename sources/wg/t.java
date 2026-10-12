package wg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.q11;
import w7.a6;
public final class t extends FrameLayout {
    public final wh.n f47609a;
    public final FrameLayout f47610b;
    public String f47611c;
    public String d;
    public final ImageView e;

    public t(Context context, c6 c6Var) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f47610b = frameLayout;
        wh.n nVar = new wh.n(context);
        this.f47609a = nVar;
        nVar.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(13.0f));
        nVar.setTextSize(1, 16.0f);
        nVar.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        nVar.setSingleLine(true);
        nVar.setTextColor(g6.w0(g6.G6, c6Var));
        nVar.f47713r = false;
        frameLayout.addView(nVar, a6.e(-2, -2, 17));
        int dp = AndroidUtilities.dp(8.0f);
        int w02 = g6.w0(g6.e7, c6Var);
        int i10 = g6.f19990i6;
        int k10 = i0.a.k(g6.w0(i10, c6Var), 76);
        frameLayout.setBackground(g6.j0(dp, dp, dp, dp, w02, k10, k10));
        addView(frameLayout, a6.a(-2.0f, 14.0f, 0.0f, 14.0f, 0.0f, -1, 0));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final t f47608b;

            {
                this.f47608b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        AndroidUtilities.addToClipboard(this.f47608b.d);
                        return;
                    default:
                        AndroidUtilities.addToClipboard(this.f47608b.d);
                        return;
                }
            }
        });
        ImageView imageView = new ImageView(getContext());
        this.e = imageView;
        imageView.setImageResource(R.drawable.menu_copy_s);
        imageView.setColorFilter(g6.w0(g6.f20007j5, c6Var));
        imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        int dp2 = AndroidUtilities.dp(20.0f);
        int k11 = i0.a.k(g6.w0(i10, c6Var), 76);
        imageView.setBackground(g6.j0(dp2, dp2, dp2, dp2, 0, k11, k11));
        addView(imageView, a6.a(40.0f, 15.0f, 0.0f, 17.0f, 0.0f, 40, 21));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final t f47608b;

            {
                this.f47608b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        AndroidUtilities.addToClipboard(this.f47608b.d);
                        return;
                    default:
                        AndroidUtilities.addToClipboard(this.f47608b.d);
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
        wh.n nVar = this.f47609a;
        nVar.setPadding(dp, dp2, dp3, dp4);
        ?? obj = new Object();
        obj.f28135a |= 256;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("t.me/giftcode/" + this.f47611c);
        if (this.f47611c == null) {
            spannableStringBuilder.append((CharSequence) "1234567891011123654897566536223");
        }
        spannableStringBuilder.setSpan(new q11(obj, 0), 0, spannableStringBuilder.length(), 33);
        nVar.setText(spannableStringBuilder);
        this.f47610b.setOnClickListener(new ci.o(4, runnable));
    }

    public void setSlug(String str) {
        this.f47611c = str;
        this.d = t8.b.h("https://t.me/giftcode/", str);
        this.f47609a.setText("t.me/giftcode/" + str);
    }
}
