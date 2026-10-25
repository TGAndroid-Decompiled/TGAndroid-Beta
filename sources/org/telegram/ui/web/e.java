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
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;
public final class e extends s61 {
    public static final int f45215a = 0;

    static {
        s61.setup(new s61());
    }

    @Override
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        int i10;
        f fVar = (f) view;
        if (t61Var.G == null) {
            fVar.setAsShowMore((l) t61Var.H);
            return;
        }
        int i11 = t61Var.f32885z;
        String charSequence = t61Var.f32872l.toString();
        View.OnClickListener onClickListener = t61Var.D;
        l lVar = (l) t61Var.H;
        ImageView imageView = fVar.f45224a;
        imageView.setVisibility(0);
        int i12 = lVar.F;
        int i13 = lVar.H;
        TextView textView = fVar.f45225b;
        textView.setTextColor(i13);
        int o12 = y6.o1(0.6f, i13);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(o12, mode));
        ImageView imageView2 = fVar.f45226c;
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
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, u6 u6Var) {
        return new f(context);
    }
}
