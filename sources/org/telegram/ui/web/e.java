package org.telegram.ui.web;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w41;
public final class e extends v41 {
    public static final int f44016a = 0;

    static {
        v41.setup(new v41());
    }

    @Override
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        int i10;
        f fVar = (f) view;
        if (w41Var.G == null) {
            fVar.setAsShowMore((l) w41Var.H);
            return;
        }
        int i11 = w41Var.f34313z;
        String charSequence = w41Var.f34300l.toString();
        View.OnClickListener onClickListener = w41Var.D;
        l lVar = (l) w41Var.H;
        ImageView imageView = fVar.f44025a;
        imageView.setVisibility(0);
        int i12 = lVar.B;
        int i13 = lVar.D;
        TextView textView = fVar.f44026b;
        textView.setTextColor(i13);
        int l1 = g6.l1(0.6f, i13);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(l1, mode));
        ImageView imageView2 = fVar.f44027c;
        imageView2.setColorFilter(new PorterDuffColorFilter(g6.l1(0.6f, i13), mode));
        imageView2.setBackground(g6.Z(0, g6.l1(0.15f, i13), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
        if (i11 == 0) {
            i10 = R.drawable.msg_clear_recent;
        } else {
            i10 = R.drawable.msg_search;
        }
        imageView.setImageResource(i10);
        textView.setText(charSequence);
        imageView2.setOnClickListener(onClickListener);
        fVar.d.setColor(g6.l1(0.1f, lVar.D));
        fVar.f44028e = z10;
        fVar.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, c6 c6Var) {
        return new f(context);
    }
}
