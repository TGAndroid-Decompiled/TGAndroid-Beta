package org.telegram.ui.web;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
public final class d extends m41 {
    public static final int f53351b = 0;

    static {
        m41.h(new m41());
    }

    @Override
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        int i7;
        e eVar = (e) view;
        if (n41Var.H == null) {
            eVar.setAsShowMore((k) n41Var.I);
            return;
        }
        int i10 = n41Var.A;
        String charSequence = n41Var.f37655m.toString();
        View.OnClickListener onClickListener = n41Var.E;
        k kVar = (k) n41Var.I;
        ImageView imageView = eVar.f53354a;
        imageView.setVisibility(0);
        int i11 = kVar.G;
        int i12 = kVar.I;
        TextView textView = eVar.f53355b;
        textView.setTextColor(i12);
        int r12 = n6.r1(0.6f, i12);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(r12, mode));
        ImageView imageView2 = eVar.f53356c;
        imageView2.setColorFilter(new PorterDuffColorFilter(n6.r1(0.6f, i12), mode));
        imageView2.setBackground(n6.b0(0, n6.r1(0.15f, i12), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f)));
        if (i10 == 0) {
            i7 = 2131232099;
        } else {
            i7 = 2131232359;
        }
        imageView.setImageResource(i7);
        textView.setText(charSequence);
        imageView2.setOnClickListener(onClickListener);
        eVar.d.setColor(n6.r1(0.1f, kVar.I));
        eVar.f53357e = z10;
        eVar.setWillNotDraw(!z10);
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, i6 i6Var) {
        return new e(context);
    }
}
