package rh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.ui.Components.p80;
public final class v extends LinearLayout {
    public final ImageView f47568a;
    public final p80 f47569b;
    public final p80 f47570c;

    public v(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        float f7;
        float f10;
        setOrientation(0);
        if (i10 == 1) {
            f7 = 11.0f;
        } else {
            f7 = 32.0f;
        }
        int L = org.telegram.messenger.i0.L(f7);
        int L2 = org.telegram.messenger.i0.L(i10 == 1 ? 11.0f : 32.0f);
        if (i10 == 1) {
            f10 = 8.0f;
        } else {
            f10 = 12.0f;
        }
        setPadding(L, 0, L2, org.telegram.messenger.i0.L(f10));
        ImageView imageView = new ImageView(context);
        this.f47568a = imageView;
        int i11 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.t(imageView, i11, null, PorterDuff.Mode.SRC_IN);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.b6.t(24, 24, 51, 0, 6, 16, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        p80 p80Var = new p80(context, null);
        this.f47569b = p80Var;
        p80Var.setTypeface(org.telegram.messenger.i0.o());
        p80Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(p80Var, i11, p6Var);
        int i12 = org.telegram.ui.ActionBar.t6.Uc;
        org.telegram.ui.ActionBar.a7.H(p80Var, i12, p6Var);
        linearLayout.addView(p80Var, w7.b6.t(-1, -2, 7, 0, 0, 0, 3));
        p80 p80Var2 = new p80(context, null);
        this.f47570c = p80Var2;
        p80Var2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(p80Var2, org.telegram.ui.ActionBar.t6.f21331z6, p6Var);
        org.telegram.ui.ActionBar.a7.H(p80Var2, i12, p6Var);
        linearLayout.addView(p80Var2, w7.b6.r(-1, -2, 7));
        addView(linearLayout, w7.b6.q(-1, -2, 1.0f, 55, 0, 0, 0, 0));
    }

    public final void a(int i10, CharSequence charSequence, CharSequence charSequence2) {
        this.f47568a.setImageResource(i10);
        this.f47569b.setText(charSequence);
        this.f47570c.setText(charSequence2);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f47570c.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.f47569b.setText(charSequence);
    }
}
