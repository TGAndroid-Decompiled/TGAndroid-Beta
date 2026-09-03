package org.telegram.ui.web;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.w51;
public final class d extends h51 {
    public static final int f39419a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        int i10;
        e eVar = (e) view;
        if (i51Var.G == null) {
            eVar.setAsShowMore((k) i51Var.H);
            return;
        }
        int i11 = i51Var.f25598z;
        String charSequence = i51Var.f25585l.toString();
        View.OnClickListener onClickListener = i51Var.D;
        k kVar = (k) i51Var.H;
        ImageView imageView = eVar.f39425a;
        imageView.setVisibility(0);
        int i12 = kVar.C;
        int i13 = kVar.E;
        TextView textView = eVar.f39426b;
        textView.setTextColor(i13);
        int l1 = j6.l1(0.6f, i13);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(l1, mode));
        ImageView imageView2 = eVar.f39427c;
        imageView2.setColorFilter(new PorterDuffColorFilter(j6.l1(0.6f, i13), mode));
        imageView2.setBackground(j6.Z(0, j6.l1(0.15f, i13), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
        if (i11 == 0) {
            i10 = R.drawable.msg_clear_recent;
        } else {
            i10 = R.drawable.msg_search;
        }
        imageView.setImageResource(i10);
        textView.setText(charSequence);
        imageView2.setOnClickListener(onClickListener);
        eVar.d.setColor(j6.l1(0.1f, kVar.E));
        eVar.e = z4;
        eVar.setWillNotDraw(!z4);
    }

    @Override
    public final View createView(Context context, rl0 rl0Var, int i10, int i11, f6 f6Var) {
        return new e(context);
    }
}
