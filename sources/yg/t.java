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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.vy0;
public final class t extends FrameLayout {
    public final xh.l f59393a;
    public final FrameLayout f59394b;
    public String f59395c;
    public String d;
    public final ImageView f59396e;

    public t(Context context, f6 f6Var) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f59394b = frameLayout;
        xh.l lVar = new xh.l(context);
        this.f59393a = lVar;
        lVar.setPadding(g0.L(18.0f), g0.L(13.0f), g0.L(50.0f), g0.L(13.0f));
        lVar.setTextSize(1, 16.0f);
        lVar.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        lVar.setSingleLine(true);
        r6.V(lVar, k6.G6, f6Var);
        lVar.f58753r = false;
        frameLayout.addView(lVar, ha.e(-2, -2, 17));
        int L = g0.L(8.0f);
        int i7 = k6.f27869e7;
        int w02 = k6.w0(i7, f6Var);
        int i10 = k6.f27941i6;
        int o4 = i0.a.o(k6.w0(i10, f6Var), 76);
        org.telegram.ui.Cells.y k02 = k6.k0(L, L, L, L, w02, o4, o4);
        n6 N = r6.N(i7);
        n6 h = r6.h(i10, 76);
        frameLayout.setBackground(k02);
        r6.k(frameLayout, k02, N, h, f6Var);
        addView(frameLayout, ha.d(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final t f59392b;

            {
                this.f59392b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g0.g(this.f59392b.d);
                        return;
                    default:
                        g0.g(this.f59392b.d);
                        return;
                }
            }
        });
        ImageView imageView = new ImageView(getContext());
        this.f59396e = imageView;
        imageView.setImageResource(2131231782);
        r6.t(imageView, k6.f27957j5, f6Var, PorterDuff.Mode.SRC_ATOP);
        imageView.setPadding(g0.L(8.0f), g0.L(8.0f), g0.L(8.0f), g0.L(8.0f));
        int L2 = g0.L(20.0f);
        int o10 = i0.a.o(k6.w0(i10, f6Var), 76);
        imageView.setBackground(k6.k0(L2, L2, L2, L2, 0, o10, o10));
        addView(imageView, ha.d(40, 40.0f, 21, 15.0f, 0.0f, 17.0f, 0.0f));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final t f59392b;

            {
                this.f59392b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g0.g(this.f59392b.d);
                        return;
                    default:
                        g0.g(this.f59392b.d);
                        return;
                }
            }
        });
    }

    public final void a(Runnable runnable) {
        this.f59396e.setVisibility(4);
        int L = g0.L(18.0f);
        int L2 = g0.L(14.0f);
        int L3 = g0.L(14.0f);
        int L4 = g0.L(18.0f);
        xh.l lVar = this.f59393a;
        lVar.setPadding(L, L2, L3, L4);
        ?? obj = new Object();
        obj.f38751a |= 256;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("t.me/giftcode/" + this.f59395c);
        if (this.f59395c == null) {
            spannableStringBuilder.append((CharSequence) "1234567891011123654897566536223");
        }
        spannableStringBuilder.setSpan(new vy0(obj, 0), 0, spannableStringBuilder.length(), 33);
        lVar.setText(spannableStringBuilder);
        this.f59394b.setOnClickListener(new z6(5, runnable));
    }

    public void setSlug(String str) {
        this.f59395c = str;
        this.d = rf.b.i("https://t.me/giftcode/", str);
        this.f59393a.setText("t.me/giftcode/" + str);
    }
}
