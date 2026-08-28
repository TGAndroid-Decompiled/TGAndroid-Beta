package org.telegram.ui.web;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
public final class d extends k41 {
    public static final int f43829a = 0;

    static {
        k41.setup(new k41());
    }

    @Override
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        int i9;
        e eVar = (e) view;
        if (l41Var.G == null) {
            eVar.setAsShowMore((k) l41Var.H);
            return;
        }
        int i10 = l41Var.f30352z;
        String charSequence = l41Var.f30339l.toString();
        View.OnClickListener onClickListener = l41Var.D;
        k kVar = (k) l41Var.H;
        ImageView imageView = eVar.f43840a;
        imageView.setVisibility(0);
        int i11 = kVar.B;
        int i12 = kVar.D;
        TextView textView = eVar.f43841b;
        textView.setTextColor(i12);
        int l1 = f6.l1(0.6f, i12);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(l1, mode));
        ImageView imageView2 = eVar.f43842c;
        imageView2.setColorFilter(new PorterDuffColorFilter(f6.l1(0.6f, i12), mode));
        imageView2.setBackground(f6.Z(0, f6.l1(0.15f, i12), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f)));
        if (i10 == 0) {
            i9 = R.drawable.msg_clear_recent;
        } else {
            i9 = R.drawable.msg_search;
        }
        imageView.setImageResource(i9);
        textView.setText(charSequence);
        imageView2.setOnClickListener(onClickListener);
        eVar.d.setColor(f6.l1(0.1f, kVar.D));
        eVar.f43843e = z10;
        eVar.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, b6 b6Var) {
        return new e(context);
    }
}
