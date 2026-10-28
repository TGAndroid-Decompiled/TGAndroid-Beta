package xg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bi.w6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.a21;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.kb1;
public final class t extends FrameLayout {
    public final xh.n f51867a;
    public final FrameLayout f51868b;
    public String f51869c;
    public String d;
    public final ImageView e;

    public t(Context context, u6 u6Var) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f51868b = frameLayout;
        xh.n nVar = new xh.n(context);
        this.f51867a = nVar;
        nVar.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(13.0f));
        nVar.setTextSize(1, 16.0f);
        nVar.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        nVar.setSingleLine(true);
        f7.V(nVar, y6.G6, u6Var);
        nVar.f51971r = false;
        frameLayout.addView(nVar, kb1.i(-2, -2, 17));
        int dp = AndroidUtilities.dp(8.0f);
        int i10 = y6.f23377e7;
        int w02 = y6.w0(i10, u6Var);
        int i11 = y6.f23449i6;
        int o10 = i0.a.o(y6.w0(i11, u6Var), 76);
        org.telegram.ui.Cells.y j02 = y6.j0(dp, dp, dp, dp, w02, o10, o10);
        b7 N = f7.N(i10);
        b7 h = f7.h(i11, 76);
        frameLayout.setBackground(j02);
        f7.k(frameLayout, j02, N, h, u6Var);
        addView(frameLayout, kb1.h(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final t f51866b;

            {
                this.f51866b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        AndroidUtilities.addToClipboard(this.f51866b.d);
                        return;
                    default:
                        AndroidUtilities.addToClipboard(this.f51866b.d);
                        return;
                }
            }
        });
        ImageView imageView = new ImageView(getContext());
        this.e = imageView;
        imageView.setImageResource(R.drawable.menu_copy_s);
        f7.t(imageView, y6.f23465j5, u6Var, PorterDuff.Mode.SRC_ATOP);
        imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        int dp2 = AndroidUtilities.dp(20.0f);
        int o11 = i0.a.o(y6.w0(i11, u6Var), 76);
        imageView.setBackground(y6.j0(dp2, dp2, dp2, dp2, 0, o11, o11));
        addView(imageView, kb1.h(40, 40.0f, 21, 15.0f, 0.0f, 17.0f, 0.0f));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final t f51866b;

            {
                this.f51866b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        AndroidUtilities.addToClipboard(this.f51866b.d);
                        return;
                    default:
                        AndroidUtilities.addToClipboard(this.f51866b.d);
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
        xh.n nVar = this.f51867a;
        nVar.setPadding(dp, dp2, dp3, dp4);
        ?? obj = new Object();
        obj.f35208a |= 256;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("t.me/giftcode/" + this.f51869c);
        if (this.f51869c == null) {
            spannableStringBuilder.append((CharSequence) "1234567891011123654897566536223");
        }
        spannableStringBuilder.setSpan(new a21(obj, 0), 0, spannableStringBuilder.length(), 33);
        nVar.setText(spannableStringBuilder);
        this.f51868b.setOnClickListener(new w6(5, runnable));
    }

    public void setSlug(String str) {
        this.f51869c = str;
        this.d = b10.j("https://t.me/giftcode/", str);
        this.f51867a.setText("t.me/giftcode/" + str);
    }
}
