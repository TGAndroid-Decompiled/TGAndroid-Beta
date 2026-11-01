package org.telegram.ui.web;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;
public final class c extends a51 {
    public static final int f42805b = 0;

    static {
        a51.h(new a51());
    }

    @Override
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        int i10;
        d dVar = (d) view;
        if (b51Var.G == null) {
            dVar.setAsShowMore((j) b51Var.H);
            return;
        }
        int i11 = b51Var.f24656z;
        String charSequence = b51Var.f24643l.toString();
        View.OnClickListener onClickListener = b51Var.D;
        j jVar = (j) b51Var.H;
        ImageView imageView = dVar.f42815a;
        imageView.setVisibility(0);
        int i12 = jVar.F;
        int i13 = jVar.H;
        TextView textView = dVar.f42816b;
        textView.setTextColor(i13);
        int r12 = t6.r1(0.6f, i13);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(r12, mode));
        ImageView imageView2 = dVar.f42817c;
        imageView2.setColorFilter(new PorterDuffColorFilter(t6.r1(0.6f, i13), mode));
        imageView2.setBackground(t6.b0(0, t6.r1(0.15f, i13), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f)));
        if (i11 == 0) {
            i10 = 2131232093;
        } else {
            i10 = 2131232353;
        }
        imageView.setImageResource(i10);
        textView.setText(charSequence);
        imageView2.setOnClickListener(onClickListener);
        dVar.d.setColor(t6.r1(0.1f, jVar.H));
        dVar.e = z10;
        dVar.setWillNotDraw(!z10);
    }

    @Override
    public final View d(Context context, uk0 uk0Var, int i10, p6 p6Var) {
        return new d(context);
    }
}
