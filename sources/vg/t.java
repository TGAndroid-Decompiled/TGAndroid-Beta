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
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Components.p01;
import w7.x5;
public final class t extends FrameLayout {
    public final vh.o f44352a;
    public final FrameLayout f44353b;
    public String f44354c;
    public String d;
    public final ImageView e;

    public t(Context context, e6 e6Var) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f44353b = frameLayout;
        vh.o oVar = new vh.o(context);
        this.f44352a = oVar;
        oVar.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(13.0f));
        oVar.setTextSize(1, 16.0f);
        oVar.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        oVar.setSingleLine(true);
        oVar.setTextColor(i6.v0(i6.G6, e6Var));
        oVar.f44454f = false;
        frameLayout.addView(oVar, x5.e(-2, -2, 17));
        int dp = AndroidUtilities.dp(8.0f);
        int v02 = i6.v0(i6.e7, e6Var);
        int i10 = i6.f18926i6;
        int k10 = i0.a.k(i6.v0(i10, e6Var), 76);
        frameLayout.setBackground(i6.i0(dp, dp, dp, dp, v02, k10, k10));
        addView(frameLayout, x5.d(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final t f44351b;

            {
                this.f44351b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        AndroidUtilities.addToClipboard(this.f44351b.d);
                        return;
                    default:
                        AndroidUtilities.addToClipboard(this.f44351b.d);
                        return;
                }
            }
        });
        ImageView imageView = new ImageView(getContext());
        this.e = imageView;
        imageView.setImageResource(R.drawable.menu_copy_s);
        imageView.setColorFilter(i6.v0(i6.f18943j5, e6Var));
        imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        int dp2 = AndroidUtilities.dp(20.0f);
        int k11 = i0.a.k(i6.v0(i10, e6Var), 76);
        imageView.setBackground(i6.i0(dp2, dp2, dp2, dp2, 0, k11, k11));
        addView(imageView, x5.d(40, 40.0f, 21, 15.0f, 0.0f, 17.0f, 0.0f));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final t f44351b;

            {
                this.f44351b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        AndroidUtilities.addToClipboard(this.f44351b.d);
                        return;
                    default:
                        AndroidUtilities.addToClipboard(this.f44351b.d);
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
        vh.o oVar = this.f44352a;
        oVar.setPadding(dp, dp2, dp3, dp4);
        ?? obj = new Object();
        obj.f26643a |= 256;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("t.me/giftcode/" + this.f44354c);
        if (this.f44354c == null) {
            spannableStringBuilder.append((CharSequence) "1234567891011123654897566536223");
        }
        spannableStringBuilder.setSpan(new p01(obj, 0), 0, spannableStringBuilder.length(), 33);
        oVar.setText(spannableStringBuilder);
        this.f44353b.setOnClickListener(new bi.p(4, runnable));
    }

    public void setSlug(String str) {
        this.f44354c = str;
        this.d = p6.i("https://t.me/giftcode/", str);
        this.f44352a.setText("t.me/giftcode/" + str);
    }
}
