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
public final class rl0 extends org.telegram.ui.Components.g61 {
    public static final int f40141a = 0;

    static {
        org.telegram.ui.Components.g61.setup(new org.telegram.ui.Components.g61());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.h61 h61Var, boolean z10, org.telegram.ui.Components.w61 w61Var, org.telegram.ui.Components.e71 e71Var) {
        sl0 sl0Var = (sl0) view;
        TL_account.Passkey passkey = (TL_account.Passkey) h61Var.G;
        View.OnClickListener onClickListener = h61Var.D;
        TextView textView = sl0Var.f40544f;
        TextView textView2 = sl0Var.f40543e;
        org.telegram.ui.ActionBar.d6 d6Var = sl0Var.f40541b;
        FrameLayout frameLayout = sl0Var.f40542c;
        org.telegram.ui.Components.w9 w9Var = sl0Var.d;
        sl0Var.f40546r = passkey.f20252id;
        long j3 = passkey.software_emoji_id;
        if (j3 != 0) {
            w9Var.setAnimatedEmojiDrawable(org.telegram.ui.Components.q5.n(sl0Var.f40540a, j3, null, 3));
            frameLayout.setBackground(null);
            w9Var.setColorFilter(null);
            w9Var.setScaleX(1.0f);
            w9Var.setScaleY(1.0f);
        } else {
            int dp = AndroidUtilities.dp(4.0f);
            int i10 = org.telegram.ui.ActionBar.i6.G6;
            frameLayout.setBackground(org.telegram.ui.ActionBar.i6.b0(dp, org.telegram.ui.ActionBar.i6.l1(0.04f, org.telegram.ui.ActionBar.i6.v0(i10, d6Var))));
            w9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.l1(0.3f, org.telegram.ui.ActionBar.i6.v0(i10, d6Var)), PorterDuff.Mode.SRC_IN));
            w9Var.setImageResource(R.drawable.msg2_permissions);
            w9Var.setScaleX(0.666f);
            w9Var.setScaleY(0.666f);
            w9Var.setAnimatedEmojiDrawable(null);
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
        sl0Var.h.setOnClickListener(onClickListener);
        sl0Var.f40545n = z10;
        sl0Var.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new sl0(context, i10, d6Var);
    }
}
