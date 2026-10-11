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
public final class ul0 extends org.telegram.ui.Components.q61 {
    public static final int f42646a = 0;

    static {
        org.telegram.ui.Components.q61.setup(new org.telegram.ui.Components.q61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.r61 r61Var, boolean z10, org.telegram.ui.Components.e71 e71Var, org.telegram.ui.Components.m71 m71Var) {
        vl0 vl0Var = (vl0) view;
        TL_account.Passkey passkey = (TL_account.Passkey) r61Var.G;
        View.OnClickListener onClickListener = r61Var.D;
        TextView textView = vl0Var.f43083f;
        TextView textView2 = vl0Var.f43082e;
        org.telegram.ui.ActionBar.d6 d6Var = vl0Var.f43080b;
        FrameLayout frameLayout = vl0Var.f43081c;
        org.telegram.ui.Components.y9 y9Var = vl0Var.d;
        vl0Var.f43085r = passkey.f20237id;
        long j3 = passkey.software_emoji_id;
        if (j3 != 0) {
            y9Var.setAnimatedEmojiDrawable(org.telegram.ui.Components.s5.n(vl0Var.f43079a, j3, null, 3));
            frameLayout.setBackground(null);
            y9Var.setColorFilter(null);
            y9Var.setScaleX(1.0f);
            y9Var.setScaleY(1.0f);
        } else {
            int dp = AndroidUtilities.dp(4.0f);
            int i10 = org.telegram.ui.ActionBar.h6.G6;
            frameLayout.setBackground(org.telegram.ui.ActionBar.h6.c0(dp, org.telegram.ui.ActionBar.h6.m1(0.04f, org.telegram.ui.ActionBar.h6.w0(i10, d6Var))));
            y9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.m1(0.3f, org.telegram.ui.ActionBar.h6.w0(i10, d6Var)), PorterDuff.Mode.SRC_IN));
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
        vl0Var.h.setOnClickListener(onClickListener);
        vl0Var.f43084n = z10;
        vl0Var.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.sm0 sm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new vl0(context, i10, d6Var);
    }
}
