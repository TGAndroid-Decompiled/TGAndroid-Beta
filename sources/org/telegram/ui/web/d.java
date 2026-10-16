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
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
public final class d extends l61 {
    public static final int f41016a = 0;

    static {
        l61.setup(new l61());
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, a71 a71Var, i71 i71Var) {
        int i10;
        e eVar = (e) view;
        if (m61Var.G == null) {
            eVar.setAsShowMore((k) m61Var.H);
            return;
        }
        int i11 = m61Var.f26959z;
        String charSequence = m61Var.f26946l.toString();
        View.OnClickListener onClickListener = m61Var.D;
        k kVar = (k) m61Var.H;
        ImageView imageView = eVar.f41025a;
        imageView.setVisibility(0);
        int i12 = kVar.F;
        int i13 = kVar.H;
        TextView textView = eVar.f41026b;
        textView.setTextColor(i13);
        int m12 = g6.m1(0.6f, i13);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(m12, mode));
        ImageView imageView2 = eVar.f41027c;
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
