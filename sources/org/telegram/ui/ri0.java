package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_account;
public final class ri0 extends org.telegram.ui.Components.n41 {
    public static final int f51619b = 0;

    static {
        org.telegram.ui.Components.n41.h(new org.telegram.ui.Components.n41());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.o41 o41Var, boolean z10, org.telegram.ui.Components.c51 c51Var, org.telegram.ui.Components.h51 h51Var) {
        si0 si0Var = (si0) view;
        TL_account.Passkey passkey = (TL_account.Passkey) o41Var.H;
        View.OnClickListener onClickListener = o41Var.E;
        TextView textView = si0Var.f52025n;
        TextView textView2 = si0Var.h;
        org.telegram.ui.ActionBar.h6 h6Var = si0Var.d;
        FrameLayout frameLayout = si0Var.f52023e;
        org.telegram.ui.Components.q9 q9Var = si0Var.f52024f;
        si0Var.f52028w = passkey.f28605id;
        long j3 = passkey.software_emoji_id;
        if (j3 != 0) {
            q9Var.setAnimatedEmojiDrawable(org.telegram.ui.Components.p5.m(si0Var.f52022c, j3, null, 3));
            frameLayout.setBackground(null);
            q9Var.setColorFilter(null);
            si0Var.f52020a = false;
            q9Var.setScaleX(1.0f);
            q9Var.setScaleY(1.0f);
        } else {
            int L = org.telegram.messenger.g0.L(4.0f);
            int i7 = org.telegram.ui.ActionBar.m6.G6;
            org.telegram.ui.ActionBar.t6.B(frameLayout, org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.r1(0.04f, org.telegram.ui.ActionBar.m6.w0(i7, h6Var))), org.telegram.ui.ActionBar.t6.K(0.04f, i7), h6Var);
            si0Var.a();
            q9Var.setImageResource(2131232034);
            q9Var.setScaleX(0.666f);
            q9Var.setScaleY(0.666f);
            q9Var.setAnimatedEmojiDrawable(null);
        }
        if (TextUtils.isEmpty(passkey.name)) {
            textView2.setText(org.telegram.messenger.hd.N0(2131747434, null));
        } else {
            textView2.setText(passkey.name);
        }
        int i10 = passkey.last_usage_date;
        if (i10 != 0) {
            textView.setText(org.telegram.messenger.hd.a0(null, null, 2131747440, org.telegram.messenger.hd.x(i10, false)));
        } else {
            textView.setText(org.telegram.messenger.hd.a0(null, null, 2131747453, org.telegram.messenger.hd.x(passkey.date, false)));
        }
        si0Var.f52026r.setOnClickListener(onClickListener);
        si0Var.f52027s = z10;
        si0Var.setWillNotDraw(!z10);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new si0(i7, context, h6Var);
    }
}
