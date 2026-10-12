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
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z61;
public final class d extends k61 {
    public static final int f41327a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        int i10;
        e eVar = (e) view;
        if (l61Var.G == null) {
            eVar.setAsShowMore((k) l61Var.H);
            return;
        }
        int i11 = l61Var.f26967z;
        String charSequence = l61Var.f26954l.toString();
        View.OnClickListener onClickListener = l61Var.D;
        k kVar = (k) l61Var.H;
        ImageView imageView = eVar.f41333a;
        imageView.setVisibility(0);
        int i12 = kVar.F;
        int i13 = kVar.H;
        TextView textView = eVar.f41334b;
        textView.setTextColor(i13);
        int m12 = g6.m1(0.6f, i13);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(m12, mode));
        ImageView imageView2 = eVar.f41335c;
        imageView2.setColorFilter(new PorterDuffColorFilter(g6.m1(0.6f, i13), mode));
        imageView2.setBackground(g6.a0(0, g6.m1(0.15f, i13), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
        if (i11 == 0) {
            i10 = R.drawable.msg_clear_recent;
        } else {
            i10 = R.drawable.msg_search;
        }
        imageView.setImageResource(i10);
        textView.setText(charSequence);
        imageView2.setOnClickListener(onClickListener);
        eVar.d.setColor(g6.m1(0.1f, kVar.H));
        eVar.e = z10;
        eVar.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, c6 c6Var) {
        return new e(context);
    }
}
