package org.telegram.ui.web;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
public final class d extends k41 {
    public static final int f53069b = 0;

    static {
        k41.h(new k41());
    }

    @Override
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        int i7;
        e eVar = (e) view;
        if (l41Var.H == null) {
            eVar.setAsShowMore((k) l41Var.I);
            return;
        }
        int i10 = l41Var.A;
        String charSequence = l41Var.f37018m.toString();
        View.OnClickListener onClickListener = l41Var.E;
        k kVar = (k) l41Var.I;
        ImageView imageView = eVar.f53072a;
        imageView.setVisibility(0);
        int i11 = kVar.G;
        int i12 = kVar.I;
        TextView textView = eVar.f53073b;
        textView.setTextColor(i12);
        int r12 = n6.r1(0.6f, i12);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(r12, mode));
        ImageView imageView2 = eVar.f53074c;
        imageView2.setColorFilter(new PorterDuffColorFilter(n6.r1(0.6f, i12), mode));
        imageView2.setBackground(n6.b0(0, n6.r1(0.15f, i12), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f)));
        if (i10 == 0) {
            i7 = 2131232096;
        } else {
            i7 = 2131232356;
        }
        imageView.setImageResource(i7);
        textView.setText(charSequence);
        imageView2.setOnClickListener(onClickListener);
        eVar.d.setColor(n6.r1(0.1f, kVar.I));
        eVar.f53075e = z10;
        eVar.setWillNotDraw(!z10);
    }

    @Override
    public final View d(Context context, ck0 ck0Var, int i7, i6 i6Var) {
        return new e(context);
    }
}
