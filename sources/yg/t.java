package yg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.ja;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.xy0;
public final class t extends FrameLayout {
    public final xh.l f60697a;
    public final FrameLayout f60698b;
    public String f60699c;
    public String d;
    public final ImageView f60700e;

    public t(Context context, e6 e6Var) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f60698b = frameLayout;
        xh.l lVar = new xh.l(context);
        this.f60697a = lVar;
        lVar.setPadding(g0.L(18.0f), g0.L(13.0f), g0.L(50.0f), g0.L(13.0f));
        lVar.setTextSize(1, 16.0f);
        lVar.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        lVar.setSingleLine(true);
        q6.U(lVar, j6.G6, e6Var);
        lVar.f60034r = false;
        frameLayout.addView(lVar, ja.e(-2, -2, 17));
        int L = g0.L(8.0f);
        int i7 = j6.f28869e7;
        int w02 = j6.w0(i7, e6Var);
        int i10 = j6.f28941i6;
        int o4 = i0.a.o(j6.w0(i10, e6Var), 76);
        org.telegram.ui.Cells.y k02 = j6.k0(L, L, L, L, w02, o4, o4);
        m6 M = q6.M(i7);
        m6 g10 = q6.g(i10, 76);
        frameLayout.setBackground(k02);
        q6.j(frameLayout, k02, M, g10, e6Var);
        addView(frameLayout, ja.d(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final t f60696b;

            {
                this.f60696b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g0.g(this.f60696b.d);
                        return;
                    default:
                        g0.g(this.f60696b.d);
                        return;
                }
            }
        });
        ImageView imageView = new ImageView(getContext());
        this.f60700e = imageView;
        imageView.setImageResource(2131231782);
        q6.s(imageView, j6.f28957j5, e6Var, PorterDuff.Mode.SRC_ATOP);
        imageView.setPadding(g0.L(8.0f), g0.L(8.0f), g0.L(8.0f), g0.L(8.0f));
        int L2 = g0.L(20.0f);
        int o10 = i0.a.o(j6.w0(i10, e6Var), 76);
        imageView.setBackground(j6.k0(L2, L2, L2, L2, 0, o10, o10));
        addView(imageView, ja.d(40, 40.0f, 21, 15.0f, 0.0f, 17.0f, 0.0f));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final t f60696b;

            {
                this.f60696b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g0.g(this.f60696b.d);
                        return;
                    default:
                        g0.g(this.f60696b.d);
                        return;
                }
            }
        });
    }

    public final void a(Runnable runnable) {
        this.f60700e.setVisibility(4);
        int L = g0.L(18.0f);
        int L2 = g0.L(14.0f);
        int L3 = g0.L(14.0f);
        int L4 = g0.L(18.0f);
        xh.l lVar = this.f60697a;
        lVar.setPadding(L, L2, L3, L4);
        ?? obj = new Object();
        obj.f41484a |= 256;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("t.me/giftcode/" + this.f60699c);
        if (this.f60699c == null) {
            spannableStringBuilder.append((CharSequence) "1234567891011123654897566536223");
        }
        spannableStringBuilder.setSpan(new xy0(obj, 0), 0, spannableStringBuilder.length(), 33);
        lVar.setText(spannableStringBuilder);
        this.f60698b.setOnClickListener(new bi.d0(6, runnable));
    }

    public void setSlug(String str) {
        this.f60699c = str;
        this.d = r.b.k("https://t.me/giftcode/", str);
        this.f60697a.setText("t.me/giftcode/" + str);
    }
}
