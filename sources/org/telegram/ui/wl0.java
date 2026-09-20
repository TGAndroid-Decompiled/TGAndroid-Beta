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
public final class wl0 extends org.telegram.ui.Components.v51 {
    public static final int f39178a = 0;

    static {
        org.telegram.ui.Components.v51.setup(new org.telegram.ui.Components.v51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.w51 w51Var, boolean z10, org.telegram.ui.Components.k61 k61Var, org.telegram.ui.Components.s61 s61Var) {
        xl0 xl0Var = (xl0) view;
        TL_account.Passkey passkey = (TL_account.Passkey) w51Var.G;
        View.OnClickListener onClickListener = w51Var.D;
        TextView textView = xl0Var.f39620f;
        TextView textView2 = xl0Var.e;
        org.telegram.ui.ActionBar.f6 f6Var = xl0Var.f39618b;
        FrameLayout frameLayout = xl0Var.f39619c;
        org.telegram.ui.Components.v9 v9Var = xl0Var.d;
        xl0Var.f39622r = passkey.f18531id;
        long j3 = passkey.software_emoji_id;
        if (j3 != 0) {
            v9Var.setAnimatedEmojiDrawable(org.telegram.ui.Components.p5.n(xl0Var.f39617a, j3, null, 3));
            frameLayout.setBackground(null);
            v9Var.setColorFilter(null);
            v9Var.setScaleX(1.0f);
            v9Var.setScaleY(1.0f);
        } else {
            int dp = AndroidUtilities.dp(4.0f);
            int i10 = org.telegram.ui.ActionBar.j6.G6;
            frameLayout.setBackground(org.telegram.ui.ActionBar.j6.b0(dp, org.telegram.ui.ActionBar.j6.l1(0.04f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var))));
            v9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.l1(0.3f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var)), PorterDuff.Mode.SRC_IN));
            v9Var.setImageResource(R.drawable.msg2_permissions);
            v9Var.setScaleX(0.666f);
            v9Var.setScaleY(0.666f);
            v9Var.setAnimatedEmojiDrawable(null);
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
        xl0Var.f39621n = z10;
        xl0Var.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new xl0(context, i10, f6Var);
    }
}
