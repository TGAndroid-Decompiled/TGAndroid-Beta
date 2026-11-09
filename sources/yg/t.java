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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.wy0;
public final class t extends FrameLayout {
    public final xh.l f59495a;
    public final FrameLayout f59496b;
    public String f59497c;
    public String d;
    public final ImageView f59498e;

    public t(Context context, g6 g6Var) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f59496b = frameLayout;
        xh.l lVar = new xh.l(context);
        this.f59495a = lVar;
        lVar.setPadding(g0.L(18.0f), g0.L(13.0f), g0.L(50.0f), g0.L(13.0f));
        lVar.setTextSize(1, 16.0f);
        lVar.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        lVar.setSingleLine(true);
        s6.U(lVar, l6.G6, g6Var);
        lVar.f58852r = false;
        frameLayout.addView(lVar, ha.e(-2, -2, 17));
        int L = g0.L(8.0f);
        int i7 = l6.f27885e7;
        int w02 = l6.w0(i7, g6Var);
        int i10 = l6.f27957i6;
        int o4 = i0.a.o(l6.w0(i10, g6Var), 76);
        org.telegram.ui.Cells.y k02 = l6.k0(L, L, L, L, w02, o4, o4);
        o6 M = s6.M(i7);
        o6 g10 = s6.g(i10, 76);
        frameLayout.setBackground(k02);
        s6.j(frameLayout, k02, M, g10, g6Var);
        addView(frameLayout, ha.d(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final t f59494b;

            {
                this.f59494b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g0.g(this.f59494b.d);
                        return;
                    default:
                        g0.g(this.f59494b.d);
                        return;
                }
            }
        });
        ImageView imageView = new ImageView(getContext());
        this.f59498e = imageView;
        imageView.setImageResource(2131231782);
        s6.s(imageView, l6.f27973j5, g6Var, PorterDuff.Mode.SRC_ATOP);
        imageView.setPadding(g0.L(8.0f), g0.L(8.0f), g0.L(8.0f), g0.L(8.0f));
        int L2 = g0.L(20.0f);
        int o10 = i0.a.o(l6.w0(i10, g6Var), 76);
        imageView.setBackground(l6.k0(L2, L2, L2, L2, 0, o10, o10));
        addView(imageView, ha.d(40, 40.0f, 21, 15.0f, 0.0f, 17.0f, 0.0f));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final t f59494b;

            {
                this.f59494b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g0.g(this.f59494b.d);
                        return;
                    default:
                        g0.g(this.f59494b.d);
                        return;
                }
            }
        });
    }

    public final void a(Runnable runnable) {
        this.f59498e.setVisibility(4);
        int L = g0.L(18.0f);
        int L2 = g0.L(14.0f);
        int L3 = g0.L(14.0f);
        int L4 = g0.L(18.0f);
        xh.l lVar = this.f59495a;
        lVar.setPadding(L, L2, L3, L4);
        ?? obj = new Object();
        obj.f39836a |= 256;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("t.me/giftcode/" + this.f59497c);
        if (this.f59497c == null) {
            spannableStringBuilder.append((CharSequence) "1234567891011123654897566536223");
        }
        spannableStringBuilder.setSpan(new wy0(obj, 0), 0, spannableStringBuilder.length(), 33);
        lVar.setText(spannableStringBuilder);
        this.f59496b.setOnClickListener(new z6(5, runnable));
    }

    public void setSlug(String str) {
        this.f59497c = str;
        this.d = rf.b.i("https://t.me/giftcode/", str);
        this.f59495a.setText("t.me/giftcode/" + str);
    }
}
