package org.telegram.ui;

import android.content.Context;
import java.util.regex.Pattern;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class s90 implements Utilities.Callback {
    public final int f41322a;
    public final LaunchActivity f41323b;

    public s90(LaunchActivity launchActivity, int i10) {
        this.f41322a = i10;
        this.f41323b = launchActivity;
    }

    @Override
    public final void run(Object obj) {
        org.telegram.ui.ActionBar.o2 lastFragment;
        int i10 = this.f41322a;
        LaunchActivity launchActivity = this.f41323b;
        switch (i10) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (launchActivity.f33489q0 != null && booleanValue && LiteMode.getPowerSaverLevel() < 100 && (lastFragment = launchActivity.f33489q0.getLastFragment()) != null && !(lastFragment instanceof wb0)) {
                    int batteryLevel = LiteMode.getBatteryLevel();
                    org.telegram.ui.Components.vc a02 = org.telegram.ui.Components.vc.a0(lastFragment);
                    org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(batteryLevel / 100.0f, lastFragment.getThemedColor(org.telegram.ui.ActionBar.k6.Y5));
                    String string = LocaleController.getString(R.string.LowPowerEnabledTitle);
                    String formatString = LocaleController.formatString("LowPowerEnabledSubtitle", R.string.LowPowerEnabledSubtitle, String.format("%d%%", Integer.valueOf(batteryLevel)));
                    String string2 = LocaleController.getString(R.string.Disable);
                    p80 p80Var = new p80(launchActivity, 9);
                    a02.getClass();
                    Context W = a02.W();
                    org.telegram.ui.ActionBar.g6 g6Var = a02.f31416c;
                    org.telegram.ui.Components.lc lcVar = new org.telegram.ui.Components.lc(W, g6Var);
                    lcVar.f28317a.setImageDrawable(w9Var);
                    lcVar.f28318b.setText(string);
                    lcVar.f28319c.setText(formatString);
                    org.telegram.ui.Components.mc mcVar = new org.telegram.ui.Components.mc(a02.W(), g6Var, true);
                    mcVar.e(string2);
                    mcVar.f28574b = p80Var;
                    lcVar.setButton(mcVar);
                    org.telegram.ui.Components.oc b10 = a02.b(lcVar, 2750);
                    b10.f29203j = 5000;
                    b10.j();
                    return;
                }
                return;
            default:
                Pattern pattern = LaunchActivity.D1;
                MessagesController.getInstance(launchActivity.O).openApp((TLRPC.User) obj, 0);
                return;
        }
    }
}
