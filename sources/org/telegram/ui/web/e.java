package org.telegram.ui.web;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.zk0;

public final class e extends m41 {

    public static final int f43816a = 0;

    static {
        m41.setup(new e());
    }

    @Override
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        f fVar = (f) view;
        if (n41Var.G == null) {
            fVar.setAsShowMore((l) n41Var.H);
            return;
        }
        int i10 = n41Var.f30857z;
        String string = n41Var.f30844l.toString();
        View.OnClickListener onClickListener = n41Var.D;
        l lVar = (l) n41Var.H;
        ImageView imageView = fVar.f43827a;
        imageView.setVisibility(0);
        int i11 = lVar.B;
        int i12 = lVar.D;
        TextView textView = fVar.f43828b;
        textView.setTextColor(i12);
        int iL1 = g6.l1(0.6f, i12);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(iL1, mode));
        ImageView imageView2 = fVar.f43829c;
        imageView2.setColorFilter(new PorterDuffColorFilter(g6.l1(0.6f, i12), mode));
        imageView2.setBackground(g6.Z(0, g6.l1(0.15f, i12), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
        imageView.setImageResource(i10 == 0 ? R.drawable.msg_clear_recent : R.drawable.msg_search);
        textView.setText(string);
        imageView2.setOnClickListener(onClickListener);
        fVar.d.setColor(g6.l1(0.1f, lVar.D));
        fVar.f43830e = z10;
        fVar.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, c6 c6Var) {
        return new f(context);
    }
}
