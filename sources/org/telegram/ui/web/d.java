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
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.v51;
public final class d extends g51 {
    public static final int f38674a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        int i10;
        e eVar = (e) view;
        if (h51Var.G == null) {
            eVar.setAsShowMore((k) h51Var.H);
            return;
        }
        int i11 = h51Var.f24520z;
        String charSequence = h51Var.f24507l.toString();
        View.OnClickListener onClickListener = h51Var.D;
        k kVar = (k) h51Var.H;
        ImageView imageView = eVar.f38680a;
        imageView.setVisibility(0);
        int i12 = kVar.F;
        int i13 = kVar.H;
        TextView textView = eVar.f38681b;
        textView.setTextColor(i13);
        int l1 = h6.l1(0.6f, i13);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(l1, mode));
        ImageView imageView2 = eVar.f38682c;
        imageView2.setColorFilter(new PorterDuffColorFilter(h6.l1(0.6f, i13), mode));
        imageView2.setBackground(h6.Z(0, h6.l1(0.15f, i13), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
        if (i11 == 0) {
            i10 = R.drawable.msg_clear_recent;
        } else {
            i10 = R.drawable.msg_search;
        }
        imageView.setImageResource(i10);
        textView.setText(charSequence);
        imageView2.setOnClickListener(onClickListener);
        eVar.d.setColor(h6.l1(0.1f, kVar.H));
        eVar.e = z10;
        eVar.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, d6 d6Var) {
        return new e(context);
    }
}
