package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_account;
public final class sj0 extends org.telegram.ui.Components.a51 {
    public static final int f41381b = 0;

    static {
        org.telegram.ui.Components.a51.h(new org.telegram.ui.Components.a51());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.b51 b51Var, boolean z10, org.telegram.ui.Components.q51 q51Var, org.telegram.ui.Components.v51 v51Var) {
        tj0 tj0Var = (tj0) view;
        TL_account.Passkey passkey = (TL_account.Passkey) b51Var.G;
        View.OnClickListener onClickListener = b51Var.D;
        TextView textView = tj0Var.f41655n;
        TextView textView2 = tj0Var.h;
        org.telegram.ui.ActionBar.p6 p6Var = tj0Var.d;
        FrameLayout frameLayout = tj0Var.e;
        org.telegram.ui.Components.g9 g9Var = tj0Var.f41654f;
        tj0Var.f41658w = passkey.f20000id;
        long j10 = passkey.software_emoji_id;
        if (j10 != 0) {
            g9Var.setAnimatedEmojiDrawable(org.telegram.ui.Components.f5.m(tj0Var.f41653c, j10, null, 3));
            frameLayout.setBackground(null);
            g9Var.setColorFilter(null);
            tj0Var.f41651a = false;
            g9Var.setScaleX(1.0f);
            g9Var.setScaleY(1.0f);
        } else {
            int L = org.telegram.messenger.i0.L(4.0f);
            int i10 = org.telegram.ui.ActionBar.t6.G6;
            org.telegram.ui.ActionBar.a7.C(frameLayout, org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.r1(0.04f, org.telegram.ui.ActionBar.t6.w0(i10, p6Var))), org.telegram.ui.ActionBar.a7.L(0.04f, i10), p6Var);
            tj0Var.a();
            g9Var.setImageResource(2131232032);
            g9Var.setScaleX(0.666f);
            g9Var.setScaleY(0.666f);
            g9Var.setAnimatedEmojiDrawable(null);
        }
        if (TextUtils.isEmpty(passkey.name)) {
            textView2.setText(org.telegram.messenger.dd.L0(2131747644, null));
        } else {
            textView2.setText(passkey.name);
        }
        int i11 = passkey.last_usage_date;
        if (i11 != 0) {
            textView.setText(org.telegram.messenger.dd.a0(null, null, 2131747650, org.telegram.messenger.dd.x(i11, false)));
        } else {
            textView.setText(org.telegram.messenger.dd.a0(null, null, 2131747663, org.telegram.messenger.dd.x(passkey.date, false)));
        }
        tj0Var.f41656r.setOnClickListener(onClickListener);
        tj0Var.f41657s = z10;
        tj0Var.setWillNotDraw(!z10);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new tj0(i10, context, p6Var);
    }
}
