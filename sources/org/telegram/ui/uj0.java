package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_account;
public final class uj0 extends org.telegram.ui.Components.z41 {
    public static final int f42153b = 0;

    static {
        org.telegram.ui.Components.z41.h(new org.telegram.ui.Components.z41());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.a51 a51Var, boolean z10, org.telegram.ui.Components.p51 p51Var, org.telegram.ui.Components.u51 u51Var) {
        vj0 vj0Var = (vj0) view;
        TL_account.Passkey passkey = (TL_account.Passkey) a51Var.G;
        View.OnClickListener onClickListener = a51Var.D;
        TextView textView = vj0Var.f42759n;
        TextView textView2 = vj0Var.h;
        org.telegram.ui.ActionBar.p6 p6Var = vj0Var.d;
        FrameLayout frameLayout = vj0Var.e;
        org.telegram.ui.Components.g9 g9Var = vj0Var.f42758f;
        vj0Var.f42762w = passkey.f19999id;
        long j10 = passkey.software_emoji_id;
        if (j10 != 0) {
            g9Var.setAnimatedEmojiDrawable(org.telegram.ui.Components.f5.m(vj0Var.f42757c, j10, null, 3));
            frameLayout.setBackground(null);
            g9Var.setColorFilter(null);
            vj0Var.f42755a = false;
            g9Var.setScaleX(1.0f);
            g9Var.setScaleY(1.0f);
        } else {
            int L = org.telegram.messenger.i0.L(4.0f);
            int i10 = org.telegram.ui.ActionBar.t6.G6;
            org.telegram.ui.ActionBar.a7.C(frameLayout, org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.r1(0.04f, org.telegram.ui.ActionBar.t6.w0(i10, p6Var))), org.telegram.ui.ActionBar.a7.L(0.04f, i10), p6Var);
            vj0Var.a();
            g9Var.setImageResource(2131232032);
            g9Var.setScaleX(0.666f);
            g9Var.setScaleY(0.666f);
            g9Var.setAnimatedEmojiDrawable(null);
        }
        if (TextUtils.isEmpty(passkey.name)) {
            textView2.setText(org.telegram.messenger.cd.L0(2131747644, null));
        } else {
            textView2.setText(passkey.name);
        }
        int i11 = passkey.last_usage_date;
        if (i11 != 0) {
            textView.setText(org.telegram.messenger.cd.a0(null, null, 2131747650, org.telegram.messenger.cd.x(i11, false)));
        } else {
            textView.setText(org.telegram.messenger.cd.a0(null, null, 2131747663, org.telegram.messenger.cd.x(passkey.date, false)));
        }
        vj0Var.f42760r.setOnClickListener(onClickListener);
        vj0Var.f42761s = z10;
        vj0Var.setWillNotDraw(!z10);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new vj0(i10, context, p6Var);
    }
}
