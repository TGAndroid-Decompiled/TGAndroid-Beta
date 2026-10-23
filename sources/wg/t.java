package wg;

import ai.a7;
import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.r11;
import si.o0;
import w7.z5;
public final class t extends FrameLayout {
    public final wh.n f49447a;
    public final FrameLayout f49448b;
    public String f49449c;
    public String d;
    public final ImageView e;

    public t(Context context, g6 g6Var) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f49448b = frameLayout;
        wh.n nVar = new wh.n(context);
        this.f49447a = nVar;
        nVar.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(13.0f));
        nVar.setTextSize(1, 16.0f);
        nVar.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        nVar.setSingleLine(true);
        r6.W(nVar, k6.G6, g6Var);
        nVar.f49551r = false;
        frameLayout.addView(nVar, z5.e(-2, -2, 17));
        int dp = AndroidUtilities.dp(8.0f);
        int i10 = k6.e7;
        int w02 = k6.w0(i10, g6Var);
        int i11 = k6.f21272i6;
        int o10 = i0.a.o(k6.w0(i11, g6Var), 76);
        org.telegram.ui.Cells.y j02 = k6.j0(dp, dp, dp, dp, w02, o10, o10);
        n6 O = r6.O(i10);
        n6 h = r6.h(i11, 76);
        frameLayout.setBackground(j02);
        r6.k(frameLayout, j02, O, h, g6Var);
        addView(frameLayout, z5.d(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final t f49446b;

            {
                this.f49446b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        AndroidUtilities.addToClipboard(this.f49446b.d);
                        return;
                    default:
                        AndroidUtilities.addToClipboard(this.f49446b.d);
                        return;
                }
            }
        });
        ImageView imageView = new ImageView(getContext());
        this.e = imageView;
        imageView.setImageResource(R.drawable.menu_copy_s);
        r6.t(imageView, k6.f21289j5, g6Var, PorterDuff.Mode.SRC_ATOP);
        imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        int dp2 = AndroidUtilities.dp(20.0f);
        int o11 = i0.a.o(k6.w0(i11, g6Var), 76);
        imageView.setBackground(k6.j0(dp2, dp2, dp2, dp2, 0, o11, o11));
        addView(imageView, z5.d(40, 40.0f, 21, 15.0f, 0.0f, 17.0f, 0.0f));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final t f49446b;

            {
                this.f49446b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        AndroidUtilities.addToClipboard(this.f49446b.d);
                        return;
                    default:
                        AndroidUtilities.addToClipboard(this.f49446b.d);
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
        wh.n nVar = this.f49447a;
        nVar.setPadding(dp, dp2, dp3, dp4);
        ?? obj = new Object();
        obj.f29754a |= 256;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("t.me/giftcode/" + this.f49449c);
        if (this.f49449c == null) {
            spannableStringBuilder.append((CharSequence) "1234567891011123654897566536223");
        }
        spannableStringBuilder.setSpan(new r11(obj, 0), 0, spannableStringBuilder.length(), 33);
        nVar.setText(spannableStringBuilder);
        this.f49448b.setOnClickListener(new a7(5, runnable));
    }

    public void setSlug(String str) {
        this.f49449c = str;
        this.d = o0.h("https://t.me/giftcode/", str);
        this.f49447a.setText("t.me/giftcode/" + str);
    }
}
