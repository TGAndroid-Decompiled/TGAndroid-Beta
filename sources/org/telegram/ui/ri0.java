package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_account;
public final class ri0 extends org.telegram.ui.Components.k41 {
    public static final int f51608b = 0;

    static {
        org.telegram.ui.Components.k41.h(new org.telegram.ui.Components.k41());
    }

    @Override
    public final void b(View view, org.telegram.ui.Components.l41 l41Var, boolean z10, org.telegram.ui.Components.z41 z41Var, org.telegram.ui.Components.e51 e51Var) {
        si0 si0Var = (si0) view;
        TL_account.Passkey passkey = (TL_account.Passkey) l41Var.H;
        View.OnClickListener onClickListener = l41Var.E;
        TextView textView = si0Var.f52007n;
        TextView textView2 = si0Var.h;
        org.telegram.ui.ActionBar.i6 i6Var = si0Var.d;
        FrameLayout frameLayout = si0Var.f52005e;
        org.telegram.ui.Components.q9 q9Var = si0Var.f52006f;
        si0Var.f52010w = passkey.f28610id;
        long j3 = passkey.software_emoji_id;
        if (j3 != 0) {
            q9Var.setAnimatedEmojiDrawable(org.telegram.ui.Components.o5.m(si0Var.f52004c, j3, null, 3));
            frameLayout.setBackground(null);
            q9Var.setColorFilter(null);
            si0Var.f52002a = false;
            q9Var.setScaleX(1.0f);
            q9Var.setScaleY(1.0f);
        } else {
            int L = org.telegram.messenger.g0.L(4.0f);
            int i7 = org.telegram.ui.ActionBar.n6.G6;
            org.telegram.ui.ActionBar.u6.B(frameLayout, org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.r1(0.04f, org.telegram.ui.ActionBar.n6.w0(i7, i6Var))), org.telegram.ui.ActionBar.u6.K(0.04f, i7), i6Var);
            si0Var.a();
            q9Var.setImageResource(2131232034);
            q9Var.setScaleX(0.666f);
            q9Var.setScaleY(0.666f);
            q9Var.setAnimatedEmojiDrawable(null);
        }
        if (TextUtils.isEmpty(passkey.name)) {
            textView2.setText(org.telegram.messenger.gd.M0(2131747435, null));
        } else {
            textView2.setText(passkey.name);
        }
        int i10 = passkey.last_usage_date;
        if (i10 != 0) {
            textView.setText(org.telegram.messenger.gd.a0(null, null, 2131747441, org.telegram.messenger.gd.x(i10, false)));
        } else {
            textView.setText(org.telegram.messenger.gd.a0(null, null, 2131747454, org.telegram.messenger.gd.x(passkey.date, false)));
        }
        si0Var.f52008r.setOnClickListener(onClickListener);
        si0Var.f52009s = z10;
        si0Var.setWillNotDraw(!z10);
    }

    @Override
    public final View d(Context context, org.telegram.ui.Components.ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new si0(i7, context, i6Var);
    }
}
