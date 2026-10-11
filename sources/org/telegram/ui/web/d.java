package org.telegram.ui.web;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.sm0;
public final class d extends q61 {
    public static final int f43471a = 0;

    static {
        q61.setup(new q61());
    }

    @Override
    public final void bindView(View view, r61 r61Var, boolean z10, e71 e71Var, m71 m71Var) {
        int i10;
        e eVar = (e) view;
        if (r61Var.G == null) {
            eVar.setAsShowMore((k) r61Var.H);
            return;
        }
        int i11 = r61Var.f30374z;
        String charSequence = r61Var.f30361l.toString();
        View.OnClickListener onClickListener = r61Var.D;
        k kVar = (k) r61Var.H;
        ImageView imageView = eVar.f43479a;
        imageView.setVisibility(0);
        int i12 = kVar.F;
        int i13 = kVar.H;
        TextView textView = eVar.f43480b;
        textView.setTextColor(i13);
        int m12 = h6.m1(0.6f, i13);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(m12, mode));
        ImageView imageView2 = eVar.f43481c;
        imageView2.setColorFilter(new PorterDuffColorFilter(h6.m1(0.6f, i13), mode));
        imageView2.setBackground(h6.a0(0, h6.m1(0.15f, i13), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
        if (i11 == 0) {
            i10 = R.drawable.msg_clear_recent;
        } else {
            i10 = R.drawable.msg_search;
        }
        imageView.setImageResource(i10);
        textView.setText(charSequence);
        imageView2.setOnClickListener(onClickListener);
        eVar.d.setColor(h6.m1(0.1f, kVar.H));
        eVar.f43482e = z10;
        eVar.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, sm0 sm0Var, int i10, int i11, d6 d6Var) {
        return new e(context);
    }
}
