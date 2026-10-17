package wg;

import ai.z6;
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
import org.telegram.ui.Components.m11;
import w7.z5;
public final class t extends FrameLayout {
    public final wh.n f49017a;
    public final FrameLayout f49018b;
    public String f49019c;
    public String d;
    public final ImageView e;

    public t(Context context, d6 d6Var) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f49018b = frameLayout;
        wh.n nVar = new wh.n(context);
        this.f49017a = nVar;
        nVar.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(13.0f));
        nVar.setTextSize(1, 16.0f);
        nVar.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        nVar.setSingleLine(true);
        nVar.setTextColor(h6.w0(h6.G6, d6Var));
        nVar.f49121r = false;
        frameLayout.addView(nVar, z5.e(-2, -2, 17));
        int dp = AndroidUtilities.dp(8.0f);
        int w02 = h6.w0(h6.e7, d6Var);
        int i10 = h6.f21075i6;
        int o10 = i0.b.o(h6.w0(i10, d6Var), 76);
        frameLayout.setBackground(h6.j0(dp, dp, dp, dp, w02, o10, o10));
        addView(frameLayout, z5.a(-2.0f, 14.0f, 0.0f, 14.0f, 0.0f, -1, 0));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final t f49016b;

            {
                this.f49016b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        AndroidUtilities.addToClipboard(this.f49016b.d);
                        return;
                    default:
                        AndroidUtilities.addToClipboard(this.f49016b.d);
                        return;
                }
            }
        });
        ImageView imageView = new ImageView(getContext());
        this.e = imageView;
        imageView.setImageResource(R.drawable.menu_copy_s);
        imageView.setColorFilter(h6.w0(h6.f21092j5, d6Var));
        imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        int dp2 = AndroidUtilities.dp(20.0f);
        int o11 = i0.b.o(h6.w0(i10, d6Var), 76);
        imageView.setBackground(h6.j0(dp2, dp2, dp2, dp2, 0, o11, o11));
        addView(imageView, z5.a(40.0f, 15.0f, 0.0f, 17.0f, 0.0f, 40, 21));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final t f49016b;

            {
                this.f49016b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        AndroidUtilities.addToClipboard(this.f49016b.d);
                        return;
                    default:
                        AndroidUtilities.addToClipboard(this.f49016b.d);
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
        wh.n nVar = this.f49017a;
        nVar.setPadding(dp, dp2, dp3, dp4);
        ?? obj = new Object();
        obj.f28049a |= 256;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("t.me/giftcode/" + this.f49019c);
        if (this.f49019c == null) {
            spannableStringBuilder.append((CharSequence) "1234567891011123654897566536223");
        }
        spannableStringBuilder.setSpan(new m11(obj, 0), 0, spannableStringBuilder.length(), 33);
        nVar.setText(spannableStringBuilder);
        this.f49018b.setOnClickListener(new z6(5, runnable));
    }

    public void setSlug(String str) {
        this.f49019c = str;
        this.d = r.c.g("https://t.me/giftcode/", str);
        this.f49017a.setText("t.me/giftcode/" + str);
    }
}
