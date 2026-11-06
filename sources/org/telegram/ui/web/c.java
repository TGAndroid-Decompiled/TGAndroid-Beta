package org.telegram.ui.web;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.Components.x31;
public final class c extends w31 {
    public static final int f51103b = 0;

    static {
        w31.h(new w31());
    }

    @Override
    public final void b(View view, x31 x31Var, boolean z9, l41 l41Var, q41 q41Var) {
        int i7;
        d dVar = (d) view;
        if (x31Var.G == null) {
            dVar.setAsShowMore((j) x31Var.H);
            return;
        }
        int i10 = x31Var.f40172z;
        String charSequence = x31Var.f40159l.toString();
        View.OnClickListener onClickListener = x31Var.D;
        j jVar = (j) x31Var.H;
        ImageView imageView = dVar.f51107a;
        imageView.setVisibility(0);
        int i11 = jVar.F;
        int i12 = jVar.H;
        TextView textView = dVar.f51108b;
        textView.setTextColor(i12);
        int r12 = k6.r1(0.6f, i12);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(r12, mode));
        ImageView imageView2 = dVar.f51109c;
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
        dVar.f51110e = z9;
        dVar.setWillNotDraw(!z9);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        return new d(context);
    }
}
