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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.ez0;
public final class t extends FrameLayout {
    public final xh.l f61265a;
    public final FrameLayout f61266b;
    public String f61267c;
    public String d;
    public final ImageView f61268e;

    public t(Context context, i6 i6Var) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f61266b = frameLayout;
        xh.l lVar = new xh.l(context);
        this.f61265a = lVar;
        lVar.setPadding(g0.L(18.0f), g0.L(13.0f), g0.L(50.0f), g0.L(13.0f));
        lVar.setTextSize(1, 16.0f);
        lVar.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        lVar.setSingleLine(true);
        u6.U(lVar, n6.G6, i6Var);
        lVar.f60600r = false;
        frameLayout.addView(lVar, ma.e(-2, -2, 17));
        int L = g0.L(8.0f);
        int i7 = n6.f29414e7;
        int w02 = n6.w0(i7, i6Var);
        int i10 = n6.f29486i6;
        int o4 = i0.a.o(n6.w0(i10, i6Var), 76);
        org.telegram.ui.Cells.y k02 = n6.k0(L, L, L, L, w02, o4, o4);
        q6 M = u6.M(i7);
        q6 g10 = u6.g(i10, 76);
        frameLayout.setBackground(k02);
        u6.j(frameLayout, k02, M, g10, i6Var);
        addView(frameLayout, ma.d(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final t f61264b;

            {
                this.f61264b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g0.g(this.f61264b.d);
                        return;
                    default:
                        g0.g(this.f61264b.d);
                        return;
                }
            }
        });
        ImageView imageView = new ImageView(getContext());
        this.f61268e = imageView;
        imageView.setImageResource(2131231783);
        u6.s(imageView, n6.f29502j5, i6Var, PorterDuff.Mode.SRC_ATOP);
        imageView.setPadding(g0.L(8.0f), g0.L(8.0f), g0.L(8.0f), g0.L(8.0f));
        int L2 = g0.L(20.0f);
        int o10 = i0.a.o(n6.w0(i10, i6Var), 76);
        imageView.setBackground(n6.k0(L2, L2, L2, L2, 0, o10, o10));
        addView(imageView, ma.d(40, 40.0f, 21, 15.0f, 0.0f, 17.0f, 0.0f));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final t f61264b;

            {
                this.f61264b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g0.g(this.f61264b.d);
                        return;
                    default:
                        g0.g(this.f61264b.d);
                        return;
                }
            }
        });
    }

    public final void a(Runnable runnable) {
        this.f61268e.setVisibility(4);
        int L = g0.L(18.0f);
        int L2 = g0.L(14.0f);
        int L3 = g0.L(14.0f);
        int L4 = g0.L(18.0f);
        xh.l lVar = this.f61265a;
        lVar.setPadding(L, L2, L3, L4);
        ?? obj = new Object();
        obj.f34537a |= 256;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("t.me/giftcode/" + this.f61267c);
        if (this.f61267c == null) {
            spannableStringBuilder.append((CharSequence) "1234567891011123654897566536223");
        }
        spannableStringBuilder.setSpan(new ez0(obj, 0), 0, spannableStringBuilder.length(), 33);
        lVar.setText(spannableStringBuilder);
        this.f61266b.setOnClickListener(new bi.d0(6, runnable));
    }

    public void setSlug(String str) {
        this.f61267c = str;
        this.d = p5.c.k("https://t.me/giftcode/", str);
        this.f61265a.setText("t.me/giftcode/" + str);
    }
}
