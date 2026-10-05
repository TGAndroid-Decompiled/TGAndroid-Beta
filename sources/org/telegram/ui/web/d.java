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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.zl0;
public final class d extends g61 {
    public static final int f42178a = 0;

    static {
        g61.setup(new g61());
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, w61 w61Var, e71 e71Var) {
        int i10;
        e eVar = (e) view;
        if (h61Var.G == null) {
            eVar.setAsShowMore((k) h61Var.H);
            return;
        }
        int i11 = h61Var.f27106z;
        String charSequence = h61Var.f27093l.toString();
        View.OnClickListener onClickListener = h61Var.D;
        k kVar = (k) h61Var.H;
        ImageView imageView = eVar.f42186a;
        imageView.setVisibility(0);
        int i12 = kVar.F;
        int i13 = kVar.H;
        TextView textView = eVar.f42187b;
        textView.setTextColor(i13);
        int l1 = i6.l1(0.6f, i13);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(l1, mode));
        ImageView imageView2 = eVar.f42188c;
        imageView2.setColorFilter(new PorterDuffColorFilter(i6.l1(0.6f, i13), mode));
        imageView2.setBackground(i6.Z(0, i6.l1(0.15f, i13), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
        if (i11 == 0) {
            i10 = R.drawable.msg_clear_recent;
        } else {
            i10 = R.drawable.msg_search;
        }
        imageView.setImageResource(i10);
        textView.setText(charSequence);
        imageView2.setOnClickListener(onClickListener);
        eVar.d.setColor(i6.l1(0.1f, kVar.H));
        eVar.f42189e = z10;
        eVar.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, d6 d6Var) {
        return new e(context);
    }
}
