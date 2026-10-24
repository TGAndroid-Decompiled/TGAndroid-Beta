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
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.lm0;
public final class e extends k61 {
    public static final int f43087a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, a71 a71Var, i71 i71Var) {
        int i10;
        f fVar = (f) view;
        if (l61Var.G == null) {
            fVar.setAsShowMore((l) l61Var.H);
            return;
        }
        int i11 = l61Var.f28240z;
        String charSequence = l61Var.f28227l.toString();
        View.OnClickListener onClickListener = l61Var.D;
        l lVar = (l) l61Var.H;
        ImageView imageView = fVar.f43091a;
        imageView.setVisibility(0);
        int i12 = lVar.F;
        int i13 = lVar.H;
        TextView textView = fVar.f43092b;
        textView.setTextColor(i13);
        int o12 = k6.o1(0.6f, i13);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(o12, mode));
        ImageView imageView2 = fVar.f43093c;
        imageView2.setColorFilter(new PorterDuffColorFilter(k6.o1(0.6f, i13), mode));
        imageView2.setBackground(k6.a0(0, k6.o1(0.15f, i13), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
        if (i11 == 0) {
            i10 = R.drawable.msg_clear_recent;
        } else {
            i10 = R.drawable.msg_search;
        }
        imageView.setImageResource(i10);
        textView.setText(charSequence);
        imageView2.setOnClickListener(onClickListener);
        fVar.d.setColor(k6.o1(0.1f, lVar.H));
        fVar.e = z10;
        fVar.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, lm0 lm0Var, int i10, int i11, g6 g6Var) {
        return new f(context);
    }
}
