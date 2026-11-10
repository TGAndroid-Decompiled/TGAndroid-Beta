package yg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bi.z6;
import c8.ha;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.vy0;
public final class t extends FrameLayout {
    public final xh.l f59493a;
    public final FrameLayout f59494b;
    public String f59495c;
    public String d;
    public final ImageView f59496e;

    public t(Context context, h6 h6Var) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f59494b = frameLayout;
        xh.l lVar = new xh.l(context);
        this.f59493a = lVar;
        lVar.setPadding(g0.L(18.0f), g0.L(13.0f), g0.L(50.0f), g0.L(13.0f));
        lVar.setTextSize(1, 16.0f);
        lVar.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        lVar.setSingleLine(true);
        t6.U(lVar, m6.G6, h6Var);
        lVar.f58850r = false;
        frameLayout.addView(lVar, ha.e(-2, -2, 17));
        int L = g0.L(8.0f);
        int i7 = m6.f27910e7;
        int w02 = m6.w0(i7, h6Var);
        int i10 = m6.f27982i6;
        int o4 = i0.a.o(m6.w0(i10, h6Var), 76);
        org.telegram.ui.Cells.y k02 = m6.k0(L, L, L, L, w02, o4, o4);
        p6 M = t6.M(i7);
        p6 g10 = t6.g(i10, 76);
        frameLayout.setBackground(k02);
        t6.j(frameLayout, k02, M, g10, h6Var);
        addView(frameLayout, ha.d(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final t f59492b;

            {
                this.f59492b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g0.g(this.f59492b.d);
                        return;
                    default:
                        g0.g(this.f59492b.d);
                        return;
                }
            }
        });
        ImageView imageView = new ImageView(getContext());
        this.f59496e = imageView;
        imageView.setImageResource(2131231782);
        t6.s(imageView, m6.f27998j5, h6Var, PorterDuff.Mode.SRC_ATOP);
        imageView.setPadding(g0.L(8.0f), g0.L(8.0f), g0.L(8.0f), g0.L(8.0f));
        int L2 = g0.L(20.0f);
        int o10 = i0.a.o(m6.w0(i10, h6Var), 76);
        imageView.setBackground(m6.k0(L2, L2, L2, L2, 0, o10, o10));
        addView(imageView, ha.d(40, 40.0f, 21, 15.0f, 0.0f, 17.0f, 0.0f));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final t f59492b;

            {
                this.f59492b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g0.g(this.f59492b.d);
                        return;
                    default:
                        g0.g(this.f59492b.d);
                        return;
                }
            }
        });
    }

    public final void a(Runnable runnable) {
        this.f59496e.setVisibility(4);
        int L = g0.L(18.0f);
        int L2 = g0.L(14.0f);
        int L3 = g0.L(14.0f);
        int L4 = g0.L(18.0f);
        xh.l lVar = this.f59493a;
        lVar.setPadding(L, L2, L3, L4);
        ?? obj = new Object();
        obj.f38777a |= 256;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("t.me/giftcode/" + this.f59495c);
        if (this.f59495c == null) {
            spannableStringBuilder.append((CharSequence) "1234567891011123654897566536223");
        }
        spannableStringBuilder.setSpan(new vy0(obj, 0), 0, spannableStringBuilder.length(), 33);
        lVar.setText(spannableStringBuilder);
        this.f59494b.setOnClickListener(new z6(5, runnable));
    }

    public void setSlug(String str) {
        this.f59495c = str;
        this.d = rf.b.i("https://t.me/giftcode/", str);
        this.f59493a.setText("t.me/giftcode/" + str);
    }
}
