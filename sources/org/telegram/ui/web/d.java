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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wm0;
public final class d extends t61 {
    public static final int f43226a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, h71 h71Var, p71 p71Var) {
        int i10;
        e eVar = (e) view;
        if (u61Var.G == null) {
            eVar.setAsShowMore((k) u61Var.H);
            return;
        }
        int i11 = u61Var.f31084z;
        String charSequence = u61Var.f31071l.toString();
        View.OnClickListener onClickListener = u61Var.D;
        k kVar = (k) u61Var.H;
        ImageView imageView = eVar.f43234a;
        imageView.setVisibility(0);
        int i12 = kVar.F;
        int i13 = kVar.H;
        TextView textView = eVar.f43235b;
        textView.setTextColor(i13);
        int m12 = h6.m1(0.6f, i13);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(m12, mode));
        ImageView imageView2 = eVar.f43236c;
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
        eVar.f43237e = z10;
        eVar.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, wm0 wm0Var, int i10, int i11, c6 c6Var) {
        return new e(context);
    }
}
