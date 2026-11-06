package org.telegram.ui.web;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
public final class c extends q31 {
    public static final int f51098b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z9, f41 f41Var, k41 k41Var) {
        int i7;
        d dVar = (d) view;
        if (r31Var.G == null) {
            dVar.setAsShowMore((j) r31Var.H);
            return;
        }
        int i10 = r31Var.f37611z;
        String charSequence = r31Var.f37598l.toString();
        View.OnClickListener onClickListener = r31Var.D;
        j jVar = (j) r31Var.H;
        ImageView imageView = dVar.f51102a;
        imageView.setVisibility(0);
        int i11 = jVar.F;
        int i12 = jVar.H;
        TextView textView = dVar.f51103b;
        textView.setTextColor(i12);
        int r12 = k6.r1(0.6f, i12);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(r12, mode));
        ImageView imageView2 = dVar.f51104c;
        imageView2.setColorFilter(new PorterDuffColorFilter(k6.r1(0.6f, i12), mode));
        imageView2.setBackground(k6.b0(0, k6.r1(0.15f, i12), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f)));
        if (i10 == 0) {
            i7 = 2131232094;
        } else {
            i7 = 2131232354;
        }
        imageView.setImageResource(i7);
        textView.setText(charSequence);
        imageView2.setOnClickListener(onClickListener);
        dVar.d.setColor(k6.r1(0.1f, jVar.H));
        dVar.f51105e = z9;
        dVar.setWillNotDraw(!z9);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        return new d(context);
    }
}
