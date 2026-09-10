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
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
public final class e extends u51 {
    public static final int f37923a = 0;

    static {
        u51.setup(new u51());
    }

    @Override
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        int i10;
        f fVar = (f) view;
        if (v51Var.G == null) {
            fVar.setAsShowMore((l) v51Var.H);
            return;
        }
        int i11 = v51Var.f27842z;
        String charSequence = v51Var.f27829l.toString();
        View.OnClickListener onClickListener = v51Var.D;
        l lVar = (l) v51Var.H;
        ImageView imageView = fVar.f37929a;
        imageView.setVisibility(0);
        int i12 = lVar.F;
        int i13 = lVar.H;
        TextView textView = fVar.f37930b;
        textView.setTextColor(i13);
        int l1 = j6.l1(0.6f, i13);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(l1, mode));
        ImageView imageView2 = fVar.f37931c;
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
        fVar.e = z10;
        fVar.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, f6 f6Var) {
        return new f(context);
    }
}
