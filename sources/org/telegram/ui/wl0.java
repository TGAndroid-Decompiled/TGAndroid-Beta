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
public final class wl0 extends org.telegram.ui.Components.t61 {
    public static final int f43560a = 0;

    static {
        org.telegram.ui.Components.t61.setup(new org.telegram.ui.Components.t61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.u61 u61Var, boolean z10, org.telegram.ui.Components.h71 h71Var, org.telegram.ui.Components.p71 p71Var) {
        xl0 xl0Var = (xl0) view;
        TL_account.Passkey passkey = (TL_account.Passkey) u61Var.G;
        View.OnClickListener onClickListener = u61Var.D;
        TextView textView = xl0Var.f44038f;
        TextView textView2 = xl0Var.f44037e;
        org.telegram.ui.ActionBar.c6 c6Var = xl0Var.f44035b;
        FrameLayout frameLayout = xl0Var.f44036c;
        org.telegram.ui.Components.y9 y9Var = xl0Var.d;
        xl0Var.f44040r = passkey.f20009id;
        long j3 = passkey.software_emoji_id;
        if (j3 != 0) {
            y9Var.setAnimatedEmojiDrawable(org.telegram.ui.Components.s5.n(xl0Var.f44034a, j3, null, 3));
            frameLayout.setBackground(null);
            y9Var.setColorFilter(null);
            y9Var.setScaleX(1.0f);
            y9Var.setScaleY(1.0f);
        } else {
            int dp = AndroidUtilities.dp(4.0f);
            int i10 = org.telegram.ui.ActionBar.h6.G6;
            frameLayout.setBackground(org.telegram.ui.ActionBar.h6.c0(dp, org.telegram.ui.ActionBar.h6.m1(0.04f, org.telegram.ui.ActionBar.h6.w0(i10, c6Var))));
            y9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.m1(0.3f, org.telegram.ui.ActionBar.h6.w0(i10, c6Var)), PorterDuff.Mode.SRC_IN));
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
        xl0Var.h.setOnClickListener(onClickListener);
        xl0Var.f44039n = z10;
        xl0Var.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.wm0 wm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new xl0(context, i10, c6Var);
    }
}
