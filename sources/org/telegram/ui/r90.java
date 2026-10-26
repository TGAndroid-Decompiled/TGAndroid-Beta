package org.telegram.ui;

import android.content.Context;
import java.util.regex.Pattern;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class r90 implements Utilities.Callback {
    public final int f43059a;
    public final LaunchActivity f43060b;

    public r90(LaunchActivity launchActivity, int i10) {
        this.f43059a = i10;
        this.f43060b = launchActivity;
    }

    @Override
    public final void run(Object obj) {
        org.telegram.ui.ActionBar.r2 lastFragment;
        int i10 = this.f43059a;
        LaunchActivity launchActivity = this.f43060b;
        switch (i10) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (launchActivity.f35553q0 != null && booleanValue && LiteMode.getPowerSaverLevel() < 100 && (lastFragment = launchActivity.f35553q0.getLastFragment()) != null && !(lastFragment instanceof tb0)) {
                    int batteryLevel = LiteMode.getBatteryLevel();
                    org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(lastFragment);
                    org.telegram.ui.Components.ba baVar = new org.telegram.ui.Components.ba(batteryLevel / 100.0f, lastFragment.getThemedColor(org.telegram.ui.ActionBar.y6.Y5));
                    String string = LocaleController.getString(R.string.LowPowerEnabledTitle);
                    String formatString = LocaleController.formatString("LowPowerEnabledSubtitle", R.string.LowPowerEnabledSubtitle, String.format("%d%%", Integer.valueOf(batteryLevel)));
                    String string2 = LocaleController.getString(R.string.Disable);
                    o80 o80Var = new o80(launchActivity, 9);
                    b02.getClass();
                    Context X = b02.X();
                    org.telegram.ui.ActionBar.u6 u6Var = b02.f34410c;
                    org.telegram.ui.Components.nc ncVar = new org.telegram.ui.Components.nc(X, u6Var);
                    ncVar.f30953a.setImageDrawable(baVar);
                    ncVar.f30954b.setText(string);
                    ncVar.f30955c.setText(formatString);
                    org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(b02.X(), u6Var, true);
                    ocVar.e(string2);
                    ocVar.f31255b = o80Var;
                    ncVar.setButton(ocVar);
                    org.telegram.ui.Components.qc b10 = b02.b(ncVar, 2750);
                    b10.f31889j = 5000;
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
