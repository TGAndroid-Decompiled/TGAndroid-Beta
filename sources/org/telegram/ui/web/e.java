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
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.v51;
public final class e extends g51 {
    public static final int f42071a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        int i10;
        f fVar = (f) view;
        if (h51Var.G == null) {
            fVar.setAsShowMore((l) h51Var.H);
            return;
        }
        int i11 = h51Var.f26607z;
        String charSequence = h51Var.f26594l.toString();
        View.OnClickListener onClickListener = h51Var.D;
        l lVar = (l) h51Var.H;
        ImageView imageView = fVar.f42082a;
        imageView.setVisibility(0);
        int i12 = lVar.F;
        int i13 = lVar.H;
        TextView textView = fVar.f42083b;
        textView.setTextColor(i13);
        int l1 = j6.l1(0.6f, i13);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(l1, mode));
        ImageView imageView2 = fVar.f42084c;
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
        fVar.d.setColor(j6.l1(0.1f, lVar.H));
        fVar.f42085e = z10;
        fVar.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, f6 f6Var) {
        return new f(context);
    }
}
