package ug;

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
import org.telegram.ui.Cells.r6;
import org.telegram.ui.Components.c11;
import w7.a6;
public final class t extends FrameLayout {
    public final uh.o f42720a;
    public final FrameLayout f42721b;
    public String f42722c;
    public String d;
    public final ImageView e;

    public t(Context context, f6 f6Var) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f42721b = frameLayout;
        uh.o oVar = new uh.o(context);
        this.f42720a = oVar;
        oVar.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(13.0f));
        oVar.setTextSize(1, 16.0f);
        oVar.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        oVar.setSingleLine(true);
        oVar.setTextColor(j6.v0(j6.G6, f6Var));
        oVar.f42822f = false;
        frameLayout.addView(oVar, a6.e(-2, -2, 17));
        int dp = AndroidUtilities.dp(8.0f);
        int v02 = j6.v0(j6.e7, f6Var);
        int i10 = j6.f18017i6;
        int k10 = i0.a.k(j6.v0(i10, f6Var), 76);
        frameLayout.setBackground(j6.i0(dp, dp, dp, dp, v02, k10, k10));
        addView(frameLayout, a6.d(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final t f42719b;

            {
                this.f42719b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        AndroidUtilities.addToClipboard(this.f42719b.d);
                        return;
                    default:
                        AndroidUtilities.addToClipboard(this.f42719b.d);
                        return;
                }
            }
        });
        ImageView imageView = new ImageView(getContext());
        this.e = imageView;
        imageView.setImageResource(R.drawable.menu_copy_s);
        imageView.setColorFilter(j6.v0(j6.f18034j5, f6Var));
        imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        int dp2 = AndroidUtilities.dp(20.0f);
        int k11 = i0.a.k(j6.v0(i10, f6Var), 76);
        imageView.setBackground(j6.i0(dp2, dp2, dp2, dp2, 0, k11, k11));
        addView(imageView, a6.d(40, 40.0f, 21, 15.0f, 0.0f, 17.0f, 0.0f));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final t f42719b;

            {
                this.f42719b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        AndroidUtilities.addToClipboard(this.f42719b.d);
                        return;
                    default:
                        AndroidUtilities.addToClipboard(this.f42719b.d);
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
        uh.o oVar = this.f42720a;
        oVar.setPadding(dp, dp2, dp3, dp4);
        ?? obj = new Object();
        obj.f21677a |= 256;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("t.me/giftcode/" + this.f42722c);
        if (this.f42722c == null) {
            spannableStringBuilder.append((CharSequence) "1234567891011123654897566536223");
        }
        spannableStringBuilder.setSpan(new c11(obj, 0), 0, spannableStringBuilder.length(), 33);
        oVar.setText(spannableStringBuilder);
        this.f42721b.setOnClickListener(new ai.v(4, runnable));
    }

    public void setSlug(String str) {
        this.f42722c = str;
        this.d = r6.i("https://t.me/giftcode/", str);
        this.f42720a.setText("t.me/giftcode/" + str);
    }
}
