package yg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.ma;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.gz0;
public final class t extends FrameLayout {
    public final xh.l f61310a;
    public final FrameLayout f61311b;
    public String f61312c;
    public String d;
    public final ImageView f61313e;

    public t(Context context, h6 h6Var) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f61311b = frameLayout;
        xh.l lVar = new xh.l(context);
        this.f61310a = lVar;
        lVar.setPadding(g0.L(18.0f), g0.L(13.0f), g0.L(50.0f), g0.L(13.0f));
        lVar.setTextSize(1, 16.0f);
        lVar.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        lVar.setSingleLine(true);
        t6.U(lVar, m6.G6, h6Var);
        lVar.f60645r = false;
        frameLayout.addView(lVar, ma.e(-2, -2, 17));
        int L = g0.L(8.0f);
        int i7 = m6.f29401e7;
        int w02 = m6.w0(i7, h6Var);
        int i10 = m6.f29473i6;
        int o4 = i0.a.o(m6.w0(i10, h6Var), 76);
        org.telegram.ui.Cells.y k02 = m6.k0(L, L, L, L, w02, o4, o4);
        p6 M = t6.M(i7);
        p6 g10 = t6.g(i10, 76);
        frameLayout.setBackground(k02);
        t6.j(frameLayout, k02, M, g10, h6Var);
        addView(frameLayout, ma.d(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final t f61309b;

            {
                this.f61309b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g0.g(this.f61309b.d);
                        return;
                    default:
                        g0.g(this.f61309b.d);
                        return;
                }
            }
        });
        ImageView imageView = new ImageView(getContext());
        this.f61313e = imageView;
        imageView.setImageResource(2131231783);
        t6.s(imageView, m6.f29489j5, h6Var, PorterDuff.Mode.SRC_ATOP);
        imageView.setPadding(g0.L(8.0f), g0.L(8.0f), g0.L(8.0f), g0.L(8.0f));
        int L2 = g0.L(20.0f);
        int o10 = i0.a.o(m6.w0(i10, h6Var), 76);
        imageView.setBackground(m6.k0(L2, L2, L2, L2, 0, o10, o10));
        addView(imageView, ma.d(40, 40.0f, 21, 15.0f, 0.0f, 17.0f, 0.0f));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final t f61309b;

            {
                this.f61309b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g0.g(this.f61309b.d);
                        return;
                    default:
                        g0.g(this.f61309b.d);
                        return;
                }
            }
        });
    }

    public final void a(Runnable runnable) {
        this.f61313e.setVisibility(4);
        int L = g0.L(18.0f);
        int L2 = g0.L(14.0f);
        int L3 = g0.L(14.0f);
        int L4 = g0.L(18.0f);
        xh.l lVar = this.f61310a;
        lVar.setPadding(L, L2, L3, L4);
        ?? obj = new Object();
        obj.f35337a |= 256;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("t.me/giftcode/" + this.f61312c);
        if (this.f61312c == null) {
            spannableStringBuilder.append((CharSequence) "1234567891011123654897566536223");
        }
        spannableStringBuilder.setSpan(new gz0(obj, 0), 0, spannableStringBuilder.length(), 33);
        lVar.setText(spannableStringBuilder);
        this.f61311b.setOnClickListener(new bi.d0(6, runnable));
    }

    public void setSlug(String str) {
        this.f61312c = str;
        this.d = p5.c.k("https://t.me/giftcode/", str);
        this.f61310a.setText("t.me/giftcode/" + str);
    }
}
