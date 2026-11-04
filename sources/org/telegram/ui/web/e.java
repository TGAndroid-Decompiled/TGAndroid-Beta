package org.telegram.ui.web;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
public final class e extends q31 {
    public static final int f50832b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        int i3;
        f fVar = (f) view;
        if (r31Var.G == null) {
            fVar.setAsShowMore((l) r31Var.H);
            return;
        }
        int i10 = r31Var.f37640z;
        String charSequence = r31Var.f37627l.toString();
        View.OnClickListener onClickListener = r31Var.D;
        l lVar = (l) r31Var.H;
        ImageView imageView = fVar.f50837a;
        imageView.setVisibility(0);
        int i11 = lVar.G;
        int i12 = lVar.I;
        TextView textView = fVar.f50838b;
        textView.setTextColor(i12);
        int r12 = k6.r1(0.6f, i12);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(r12, mode));
        ImageView imageView2 = fVar.f50839c;
        imageView2.setColorFilter(new PorterDuffColorFilter(k6.r1(0.6f, i12), mode));
        imageView2.setBackground(k6.b0(0, k6.r1(0.15f, i12), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f)));
        if (i10 == 0) {
            i3 = 2131232094;
        } else {
            i3 = 2131232354;
        }
        imageView.setImageResource(i3);
        textView.setText(charSequence);
        imageView2.setOnClickListener(onClickListener);
        fVar.d.setColor(k6.r1(0.1f, lVar.I));
        fVar.f50840e = z10;
        fVar.setWillNotDraw(!z10);
    }

    @Override
    public final View d(Context context, tj0 tj0Var, int i3, e6 e6Var) {
        return new f(context);
    }
}
