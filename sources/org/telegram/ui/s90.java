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
    public final int f41326a;
    public final LaunchActivity f41327b;

    public s90(LaunchActivity launchActivity, int i10) {
        this.f41326a = i10;
        this.f41327b = launchActivity;
    }

    @Override
    public final void run(Object obj) {
        org.telegram.ui.ActionBar.o2 lastFragment;
        int i10 = this.f41326a;
        LaunchActivity launchActivity = this.f41327b;
        switch (i10) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (launchActivity.f33487q0 != null && booleanValue && LiteMode.getPowerSaverLevel() < 100 && (lastFragment = launchActivity.f33487q0.getLastFragment()) != null && !(lastFragment instanceof wb0)) {
                    int batteryLevel = LiteMode.getBatteryLevel();
                    org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(lastFragment);
                    org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(batteryLevel / 100.0f, lastFragment.getThemedColor(org.telegram.ui.ActionBar.k6.Y5));
                    String string = LocaleController.getString(R.string.LowPowerEnabledTitle);
                    String formatString = LocaleController.formatString("LowPowerEnabledSubtitle", R.string.LowPowerEnabledSubtitle, String.format("%d%%", Integer.valueOf(batteryLevel)));
                    String string2 = LocaleController.getString(R.string.Disable);
                    p80 p80Var = new p80(launchActivity, 9);
                    a02.getClass();
                    Context W = a02.W();
                    org.telegram.ui.ActionBar.g6 g6Var = a02.f32517c;
                    org.telegram.ui.Components.nc ncVar = new org.telegram.ui.Components.nc(W, g6Var);
                    ncVar.f28932a.setImageDrawable(y9Var);
                    ncVar.f28933b.setText(string);
                    ncVar.f28934c.setText(formatString);
                    org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(a02.W(), g6Var, true);
                    ocVar.e(string2);
                    ocVar.f29152b = p80Var;
                    ncVar.setButton(ocVar);
                    org.telegram.ui.Components.qc b10 = a02.b(ncVar, 2750);
                    b10.f29832j = 5000;
                    b10.j();
                    return;
                }
                return;
            default:
                Pattern pattern = LaunchActivity.E1;
                MessagesController.getInstance(launchActivity.O).openApp((TLRPC.User) obj, 0);
                return;
        }
    }
}
