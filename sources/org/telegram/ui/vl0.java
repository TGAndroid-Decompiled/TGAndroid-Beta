package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;
public final class vl0 extends org.telegram.ui.Components.p61 {
    public static final int f42945a = 0;

    static {
        org.telegram.ui.Components.p61.setup(new org.telegram.ui.Components.p61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.q61 q61Var, boolean z10, org.telegram.ui.Components.d71 d71Var, org.telegram.ui.Components.l71 l71Var) {
        wl0 wl0Var = (wl0) view;
        TL_account.Passkey passkey = (TL_account.Passkey) q61Var.G;
        View.OnClickListener onClickListener = q61Var.D;
        TextView textView = wl0Var.f43754f;
        TextView textView2 = wl0Var.f43753e;
        org.telegram.ui.ActionBar.e6 e6Var = wl0Var.f43751b;
        FrameLayout frameLayout = wl0Var.f43752c;
        org.telegram.ui.Components.y9 y9Var = wl0Var.d;
        wl0Var.f43756r = passkey.f20247id;
        long j3 = passkey.software_emoji_id;
        if (j3 != 0) {
            y9Var.setAnimatedEmojiDrawable(org.telegram.ui.Components.s5.n(wl0Var.f43750a, j3, null, 3));
            frameLayout.setBackground(null);
            y9Var.setColorFilter(null);
            y9Var.setScaleX(1.0f);
            y9Var.setScaleY(1.0f);
        } else {
            int dp = AndroidUtilities.dp(4.0f);
            int i10 = org.telegram.ui.ActionBar.i6.G6;
            frameLayout.setBackground(org.telegram.ui.ActionBar.i6.c0(dp, org.telegram.ui.ActionBar.i6.m1(0.04f, org.telegram.ui.ActionBar.i6.w0(i10, e6Var))));
            y9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.m1(0.3f, org.telegram.ui.ActionBar.i6.w0(i10, e6Var)), PorterDuff.Mode.SRC_IN));
            y9Var.setImageResource(R.drawable.msg2_permissions);
            y9Var.setScaleX(0.666f);
            y9Var.setScaleY(0.666f);
            y9Var.setAnimatedEmojiDrawable(null);
        }
        if (TextUtils.isEmpty(passkey.name)) {
            textView2.setText(LocaleController.getString(R.string.PasskeyUnknown));
        } else {
            textView2.setText(passkey.name);
        }
        int i11 = passkey.last_usage_date;
        if (i11 != 0) {
            textView.setText(LocaleController.formatString(R.string.PasskeyLastUsedOn, LocaleController.formatDateTime(i11, false)));
        } else {
            textView.setText(LocaleController.formatString(R.string.PasskeyCreatedOn, LocaleController.formatDateTime(passkey.date, false)));
        }
        wl0Var.h.setOnClickListener(onClickListener);
        wl0Var.f43755n = z10;
        wl0Var.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.rm0 rm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new wl0(context, i10, e6Var);
    }
}
