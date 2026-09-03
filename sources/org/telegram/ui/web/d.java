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
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
public final class d extends g51 {
    public static final int f42482a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        int i10;
        e eVar = (e) view;
        if (h51Var.G == null) {
            eVar.setAsShowMore((k) h51Var.H);
            return;
        }
        int i11 = h51Var.f27388z;
        String charSequence = h51Var.f27375l.toString();
        View.OnClickListener onClickListener = h51Var.D;
        k kVar = (k) h51Var.H;
        ImageView imageView = eVar.f42486a;
        imageView.setVisibility(0);
        int i12 = kVar.C;
        int i13 = kVar.E;
        TextView textView = eVar.f42487b;
        textView.setTextColor(i13);
        int l1 = k6.l1(0.6f, i13);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(l1, mode));
        ImageView imageView2 = eVar.f42488c;
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
        eVar.f42489e = z4;
        eVar.setWillNotDraw(!z4);
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, g6 g6Var) {
        return new e(context);
    }
}
