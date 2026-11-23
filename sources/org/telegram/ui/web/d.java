package org.telegram.ui.web;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;
public final class d extends n41 {
    public static final int f53116b = 0;

    static {
        n41.h(new n41());
    }

    @Override
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        int i7;
        e eVar = (e) view;
        if (o41Var.H == null) {
            eVar.setAsShowMore((k) o41Var.I);
            return;
        }
        int i10 = o41Var.A;
        String charSequence = o41Var.f38092m.toString();
        View.OnClickListener onClickListener = o41Var.E;
        k kVar = (k) o41Var.I;
        ImageView imageView = eVar.f53119a;
        imageView.setVisibility(0);
        int i11 = kVar.G;
        int i12 = kVar.I;
        TextView textView = eVar.f53120b;
        textView.setTextColor(i12);
        int r12 = m6.r1(0.6f, i12);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(r12, mode));
        ImageView imageView2 = eVar.f53121c;
        imageView2.setColorFilter(new PorterDuffColorFilter(m6.r1(0.6f, i12), mode));
        imageView2.setBackground(m6.b0(0, m6.r1(0.15f, i12), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f)));
        if (i10 == 0) {
            i7 = 2131232096;
        } else {
            i7 = 2131232356;
        }
        imageView.setImageResource(i7);
        textView.setText(charSequence);
        imageView2.setOnClickListener(onClickListener);
        eVar.d.setColor(m6.r1(0.1f, kVar.I));
        eVar.f53122e = z10;
        eVar.setWillNotDraw(!z10);
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, h6 h6Var) {
        return new e(context);
    }
}
