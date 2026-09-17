package vg;

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
import org.telegram.ui.Components.q01;
import w7.x5;
public final class t extends FrameLayout {
    public final vh.o f44375a;
    public final FrameLayout f44376b;
    public String f44377c;
    public String d;
    public final ImageView e;

    public t(Context context, f6 f6Var) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f44376b = frameLayout;
        vh.o oVar = new vh.o(context);
        this.f44375a = oVar;
        oVar.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(13.0f));
        oVar.setTextSize(1, 16.0f);
        oVar.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        oVar.setSingleLine(true);
        oVar.setTextColor(j6.v0(j6.G6, f6Var));
        oVar.f44477f = false;
        frameLayout.addView(oVar, x5.e(-2, -2, 17));
        int dp = AndroidUtilities.dp(8.0f);
        int v02 = j6.v0(j6.e7, f6Var);
        int i10 = j6.f18952i6;
        int k10 = i0.a.k(j6.v0(i10, f6Var), 76);
        frameLayout.setBackground(j6.i0(dp, dp, dp, dp, v02, k10, k10));
        addView(frameLayout, x5.d(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final t f44374b;

            {
                this.f44374b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        AndroidUtilities.addToClipboard(this.f44374b.d);
                        return;
                    default:
                        AndroidUtilities.addToClipboard(this.f44374b.d);
                        return;
                }
            }
        });
        ImageView imageView = new ImageView(getContext());
        this.e = imageView;
        imageView.setImageResource(R.drawable.menu_copy_s);
        imageView.setColorFilter(j6.v0(j6.f18969j5, f6Var));
        imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        int dp2 = AndroidUtilities.dp(20.0f);
        int k11 = i0.a.k(j6.v0(i10, f6Var), 76);
        imageView.setBackground(j6.i0(dp2, dp2, dp2, dp2, 0, k11, k11));
        addView(imageView, x5.d(40, 40.0f, 21, 15.0f, 0.0f, 17.0f, 0.0f));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final t f44374b;

            {
                this.f44374b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        AndroidUtilities.addToClipboard(this.f44374b.d);
                        return;
                    default:
                        AndroidUtilities.addToClipboard(this.f44374b.d);
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
        vh.o oVar = this.f44375a;
        oVar.setPadding(dp, dp2, dp3, dp4);
        ?? obj = new Object();
        obj.f26905a |= 256;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("t.me/giftcode/" + this.f44377c);
        if (this.f44377c == null) {
            spannableStringBuilder.append((CharSequence) "1234567891011123654897566536223");
        }
        spannableStringBuilder.setSpan(new q01(obj, 0), 0, spannableStringBuilder.length(), 33);
        oVar.setText(spannableStringBuilder);
        this.f44376b.setOnClickListener(new bi.p(4, runnable));
    }

    public void setSlug(String str) {
        this.f44377c = str;
        this.d = p6.i("https://t.me/giftcode/", str);
        this.f44375a.setText("t.me/giftcode/" + str);
    }
}
