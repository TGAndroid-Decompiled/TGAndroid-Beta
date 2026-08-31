package org.telegram.ui.web;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.x51;
public final class d extends i51 {
    public static final int f42519a = 0;

    static {
        i51.setup(new i51());
    }

    @Override
    public final void bindView(View view, j51 j51Var, boolean z4, x51 x51Var, i61 i61Var) {
        int i10;
        e eVar = (e) view;
        if (j51Var.G == null) {
            eVar.setAsShowMore((k) j51Var.H);
            return;
        }
        int i11 = j51Var.f28027z;
        String charSequence = j51Var.f28014l.toString();
        View.OnClickListener onClickListener = j51Var.D;
        k kVar = (k) j51Var.H;
        ImageView imageView = eVar.f42523a;
        imageView.setVisibility(0);
        int i12 = kVar.C;
        int i13 = kVar.E;
        TextView textView = eVar.f42524b;
        textView.setTextColor(i13);
        int l1 = k6.l1(0.6f, i13);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(l1, mode));
        ImageView imageView2 = eVar.f42525c;
        imageView2.setColorFilter(new PorterDuffColorFilter(k6.l1(0.6f, i13), mode));
        imageView2.setBackground(k6.Z(0, k6.l1(0.15f, i13), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
        if (i11 == 0) {
            i10 = R.drawable.msg_clear_recent;
        } else {
            i10 = R.drawable.msg_search;
        }
        imageView.setImageResource(i10);
        textView.setText(charSequence);
        imageView2.setOnClickListener(onClickListener);
        eVar.d.setColor(k6.l1(0.1f, kVar.E));
        eVar.f42526e = z4;
        eVar.setWillNotDraw(!z4);
    }

    @Override
    public final View createView(Context context, tl0 tl0Var, int i10, int i11, g6 g6Var) {
        return new e(context);
    }
}
