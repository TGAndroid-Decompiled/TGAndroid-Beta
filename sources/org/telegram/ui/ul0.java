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
public final class ul0 extends org.telegram.ui.Components.h51 {
    public static final int f38068a = 0;

    static {
        org.telegram.ui.Components.h51.setup(new org.telegram.ui.Components.h51());
    }

    @Override
    public final void bindView(View view, org.telegram.ui.Components.i51 i51Var, boolean z10, org.telegram.ui.Components.w51 w51Var, org.telegram.ui.Components.e61 e61Var) {
        vl0 vl0Var = (vl0) view;
        TL_account.Passkey passkey = (TL_account.Passkey) i51Var.G;
        View.OnClickListener onClickListener = i51Var.D;
        TextView textView = vl0Var.f38583f;
        TextView textView2 = vl0Var.e;
        org.telegram.ui.ActionBar.e6 e6Var = vl0Var.f38581b;
        FrameLayout frameLayout = vl0Var.f38582c;
        org.telegram.ui.Components.u9 u9Var = vl0Var.d;
        vl0Var.f38585r = passkey.f18312id;
        long j3 = passkey.software_emoji_id;
        if (j3 != 0) {
            u9Var.setAnimatedEmojiDrawable(org.telegram.ui.Components.o5.n(vl0Var.f38580a, j3, null, 3));
            frameLayout.setBackground(null);
            u9Var.setColorFilter(null);
            u9Var.setScaleX(1.0f);
            u9Var.setScaleY(1.0f);
        } else {
            int dp = AndroidUtilities.dp(4.0f);
            int i10 = org.telegram.ui.ActionBar.i6.G6;
            frameLayout.setBackground(org.telegram.ui.ActionBar.i6.b0(dp, org.telegram.ui.ActionBar.i6.l1(0.04f, org.telegram.ui.ActionBar.i6.v0(i10, e6Var))));
            u9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.l1(0.3f, org.telegram.ui.ActionBar.i6.v0(i10, e6Var)), PorterDuff.Mode.SRC_IN));
            u9Var.setImageResource(R.drawable.msg2_permissions);
            u9Var.setScaleX(0.666f);
            u9Var.setScaleY(0.666f);
            u9Var.setAnimatedEmojiDrawable(null);
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
        vl0Var.f38584n = z10;
        vl0Var.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, org.telegram.ui.Components.ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new vl0(context, i10, e6Var);
    }
}
