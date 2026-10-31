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
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.z41;
public final class c extends z41 {
    public static final int f43003b = 0;

    static {
        z41.h(new z41());
    }

    @Override
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        int i10;
        d dVar = (d) view;
        if (a51Var.G == null) {
            dVar.setAsShowMore((j) a51Var.H);
            return;
        }
        int i11 = a51Var.f24305z;
        String charSequence = a51Var.f24292l.toString();
        View.OnClickListener onClickListener = a51Var.D;
        j jVar = (j) a51Var.H;
        ImageView imageView = dVar.f43013a;
        imageView.setVisibility(0);
        int i12 = jVar.F;
        int i13 = jVar.H;
        TextView textView = dVar.f43014b;
        textView.setTextColor(i13);
        int r12 = t6.r1(0.6f, i13);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(r12, mode));
        ImageView imageView2 = dVar.f43015c;
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
    public final View d(Context context, tk0 tk0Var, int i10, p6 p6Var) {
        return new d(context);
    }
}
