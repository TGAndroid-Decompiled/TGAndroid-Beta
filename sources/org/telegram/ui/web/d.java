package org.telegram.ui.web;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
public final class d extends a41 {
    public static final int f52584b = 0;

    static {
        a41.h(new a41());
    }

    @Override
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        int i7;
        e eVar = (e) view;
        if (b41Var.G == null) {
            eVar.setAsShowMore((k) b41Var.H);
            return;
        }
        int i10 = b41Var.f33194z;
        String charSequence = b41Var.f33181l.toString();
        View.OnClickListener onClickListener = b41Var.D;
        k kVar = (k) b41Var.H;
        ImageView imageView = eVar.f52589a;
        imageView.setVisibility(0);
        int i11 = kVar.G;
        int i12 = kVar.I;
        TextView textView = eVar.f52590b;
        textView.setTextColor(i12);
        int r12 = j6.r1(0.6f, i12);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(r12, mode));
        ImageView imageView2 = eVar.f52591c;
        imageView2.setColorFilter(new PorterDuffColorFilter(j6.r1(0.6f, i12), mode));
        imageView2.setBackground(j6.b0(0, j6.r1(0.15f, i12), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f)));
        if (i10 == 0) {
            i7 = 2131232095;
        } else {
            i7 = 2131232355;
        }
        imageView.setImageResource(i7);
        textView.setText(charSequence);
        imageView2.setOnClickListener(onClickListener);
        eVar.d.setColor(j6.r1(0.1f, kVar.I));
        eVar.f52592e = z10;
        eVar.setWillNotDraw(!z10);
    }

    @Override
    public final View d(Context context, uj0 uj0Var, int i7, e6 e6Var) {
        return new e(context);
    }
}
