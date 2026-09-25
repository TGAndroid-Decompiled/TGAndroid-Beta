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
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wl0;
public final class d extends u51 {
    public static final int f39043a = 0;

    static {
        u51.setup(new u51());
    }

    @Override
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        int i10;
        e eVar = (e) view;
        if (v51Var.G == null) {
            eVar.setAsShowMore((k) v51Var.H);
            return;
        }
        int i11 = v51Var.f29062z;
        String charSequence = v51Var.f29049l.toString();
        View.OnClickListener onClickListener = v51Var.D;
        k kVar = (k) v51Var.H;
        ImageView imageView = eVar.f39052a;
        imageView.setVisibility(0);
        int i12 = kVar.F;
        int i13 = kVar.H;
        TextView textView = eVar.f39053b;
        textView.setTextColor(i13);
        int l1 = h6.l1(0.6f, i13);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(l1, mode));
        ImageView imageView2 = eVar.f39054c;
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
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, d6 d6Var) {
        return new e(context);
    }
}
