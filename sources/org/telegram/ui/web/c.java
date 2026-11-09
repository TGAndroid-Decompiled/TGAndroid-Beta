package org.telegram.ui.web;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.y31;
public final class c extends x31 {
    public static final int f51091b = 0;

    static {
        x31.h(new x31());
    }

    @Override
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        int i7;
        d dVar = (d) view;
        if (y31Var.G == null) {
            dVar.setAsShowMore((j) y31Var.H);
            return;
        }
        int i10 = y31Var.f40581z;
        String charSequence = y31Var.f40568l.toString();
        View.OnClickListener onClickListener = y31Var.D;
        j jVar = (j) y31Var.H;
        ImageView imageView = dVar.f51095a;
        imageView.setVisibility(0);
        int i11 = jVar.F;
        int i12 = jVar.H;
        TextView textView = dVar.f51096b;
        textView.setTextColor(i12);
        int r12 = l6.r1(0.6f, i12);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(r12, mode));
        ImageView imageView2 = dVar.f51097c;
        imageView2.setColorFilter(new PorterDuffColorFilter(l6.r1(0.6f, i12), mode));
        imageView2.setBackground(l6.b0(0, l6.r1(0.15f, i12), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f)));
        if (i10 == 0) {
            i7 = 2131232094;
        } else {
            i7 = 2131232354;
        }
        imageView.setImageResource(i7);
        textView.setText(charSequence);
        imageView2.setOnClickListener(onClickListener);
        dVar.d.setColor(l6.r1(0.1f, jVar.H));
        dVar.f51098e = z9;
        dVar.setWillNotDraw(!z9);
    }

    @Override
    public final View d(Context context, qj0 qj0Var, int i7, g6 g6Var) {
        return new d(context);
    }
}
