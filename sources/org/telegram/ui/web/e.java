package org.telegram.ui.web;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
public final class e extends t61 {
    public static final int f44729a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        int i10;
        f fVar = (f) view;
        if (u61Var.G == null) {
            fVar.setAsShowMore((l) u61Var.H);
            return;
        }
        int i11 = u61Var.f33262z;
        String charSequence = u61Var.f33249l.toString();
        View.OnClickListener onClickListener = u61Var.D;
        l lVar = (l) u61Var.H;
        ImageView imageView = fVar.f44738a;
        imageView.setVisibility(0);
        int i12 = lVar.F;
        int i13 = lVar.H;
        TextView textView = fVar.f44739b;
        textView.setTextColor(i13);
        int o12 = y6.o1(0.6f, i13);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(o12, mode));
        ImageView imageView2 = fVar.f44740c;
        imageView2.setColorFilter(new PorterDuffColorFilter(y6.o1(0.6f, i13), mode));
        imageView2.setBackground(y6.a0(0, y6.o1(0.15f, i13), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
        if (i11 == 0) {
            i10 = R.drawable.msg_clear_recent;
        } else {
            i10 = R.drawable.msg_search;
        }
        imageView.setImageResource(i10);
        textView.setText(charSequence);
        imageView2.setOnClickListener(onClickListener);
        fVar.d.setColor(y6.o1(0.1f, lVar.H));
        fVar.e = z10;
        fVar.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, u6 u6Var) {
        return new f(context);
    }
}
