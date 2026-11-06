package org.telegram.ui.web;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.w31;
public final class c extends v31 {
    public static final int f51108b = 0;

    static {
        v31.h(new v31());
    }

    @Override
    public final void b(View view, w31 w31Var, boolean z9, k41 k41Var, p41 p41Var) {
        int i7;
        d dVar = (d) view;
        if (w31Var.G == null) {
            dVar.setAsShowMore((j) w31Var.H);
            return;
        }
        int i10 = w31Var.f39843z;
        String charSequence = w31Var.f39830l.toString();
        View.OnClickListener onClickListener = w31Var.D;
        j jVar = (j) w31Var.H;
        ImageView imageView = dVar.f51114a;
        imageView.setVisibility(0);
        int i11 = jVar.F;
        int i12 = jVar.H;
        TextView textView = dVar.f51115b;
        textView.setTextColor(i12);
        int r12 = k6.r1(0.6f, i12);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(r12, mode));
        ImageView imageView2 = dVar.f51116c;
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
        dVar.f51117e = z9;
        dVar.setWillNotDraw(!z9);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, f6 f6Var) {
        return new d(context);
    }
}
