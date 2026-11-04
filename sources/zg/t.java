package zg;

import ai.j0;
import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import b8.mf;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.uy0;
public final class t extends FrameLayout {
    public final yh.l f60526a;
    public final FrameLayout f60527b;
    public String f60528c;
    public String d;
    public final ImageView f60529e;

    public t(Context context, e6 e6Var) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f60527b = frameLayout;
        yh.l lVar = new yh.l(context);
        this.f60526a = lVar;
        lVar.setPadding(g0.L(18.0f), g0.L(13.0f), g0.L(50.0f), g0.L(13.0f));
        lVar.setTextSize(1, 16.0f);
        lVar.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        lVar.setSingleLine(true);
        r6.V(lVar, k6.G6, e6Var);
        lVar.f59560r = false;
        frameLayout.addView(lVar, mf.e(-2, -2, 17));
        int L = g0.L(8.0f);
        int i3 = k6.f27899e7;
        int w02 = k6.w0(i3, e6Var);
        int i10 = k6.f27972i6;
        int o10 = i0.a.o(k6.w0(i10, e6Var), 76);
        org.telegram.ui.Cells.y k02 = k6.k0(L, L, L, L, w02, o10, o10);
        n6 N = r6.N(i3);
        n6 h = r6.h(i10, 76);
        frameLayout.setBackground(k02);
        r6.k(frameLayout, k02, N, h, e6Var);
        addView(frameLayout, mf.d(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final t f60525b;

            {
                this.f60525b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g0.g(this.f60525b.d);
                        return;
                    default:
                        g0.g(this.f60525b.d);
                        return;
                }
            }
        });
        ImageView imageView = new ImageView(getContext());
        this.f60529e = imageView;
        imageView.setImageResource(2131231782);
        r6.t(imageView, k6.f27988j5, e6Var, PorterDuff.Mode.SRC_ATOP);
        imageView.setPadding(g0.L(8.0f), g0.L(8.0f), g0.L(8.0f), g0.L(8.0f));
        int L2 = g0.L(20.0f);
        int o11 = i0.a.o(k6.w0(i10, e6Var), 76);
        imageView.setBackground(k6.k0(L2, L2, L2, L2, 0, o11, o11));
        addView(imageView, mf.d(40, 40.0f, 21, 15.0f, 0.0f, 17.0f, 0.0f));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final t f60525b;

            {
                this.f60525b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g0.g(this.f60525b.d);
                        return;
                    default:
                        g0.g(this.f60525b.d);
                        return;
                }
            }
        });
    }

    public final void a(Runnable runnable) {
        this.f60529e.setVisibility(4);
        int L = g0.L(18.0f);
        int L2 = g0.L(14.0f);
        int L3 = g0.L(14.0f);
        int L4 = g0.L(18.0f);
        yh.l lVar = this.f60526a;
        lVar.setPadding(L, L2, L3, L4);
        ?? obj = new Object();
        obj.f38578a |= 256;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("t.me/giftcode/" + this.f60528c);
        if (this.f60528c == null) {
            spannableStringBuilder.append((CharSequence) "1234567891011123654897566536223");
        }
        spannableStringBuilder.setSpan(new uy0(obj, 0), 0, spannableStringBuilder.length(), 33);
        lVar.setText(spannableStringBuilder);
        this.f60527b.setOnClickListener(new j0(6, runnable));
    }

    public void setSlug(String str) {
        this.f60528c = str;
        this.d = t4.c.f("https://t.me/giftcode/", str);
        this.f60526a.setText("t.me/giftcode/" + str);
    }
}
