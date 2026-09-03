package org.telegram.ui;

import android.content.Context;
import java.util.regex.Pattern;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class y90 implements Utilities.Callback {
    public final int f40187a;
    public final LaunchActivity f40188b;

    public y90(LaunchActivity launchActivity, int i10) {
        this.f40187a = i10;
        this.f40188b = launchActivity;
    }

    @Override
    public final void run(Object obj) {
        org.telegram.ui.ActionBar.p2 lastFragment;
        int i10 = this.f40187a;
        LaunchActivity launchActivity = this.f40188b;
        switch (i10) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (launchActivity.f31612n0 != null && booleanValue && LiteMode.getPowerSaverLevel() < 100 && (lastFragment = launchActivity.f31612n0.getLastFragment()) != null && !(lastFragment instanceof gc0)) {
                    int batteryLevel = LiteMode.getBatteryLevel();
                    org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(lastFragment);
                    org.telegram.ui.Components.r9 r9Var = new org.telegram.ui.Components.r9(batteryLevel / 100.0f, lastFragment.getThemedColor(org.telegram.ui.ActionBar.j6.Y5));
                    String string = LocaleController.getString(R.string.LowPowerEnabledTitle);
                    String formatString = LocaleController.formatString("LowPowerEnabledSubtitle", R.string.LowPowerEnabledSubtitle, String.format("%d%%", Integer.valueOf(batteryLevel)));
                    String string2 = LocaleController.getString(R.string.Disable);
                    z80 z80Var = new z80(launchActivity, 8);
                    a02.getClass();
                    Context W = a02.W();
                    org.telegram.ui.ActionBar.f6 f6Var = a02.f28142c;
                    org.telegram.ui.Components.fc fcVar = new org.telegram.ui.Components.fc(W, f6Var);
                    fcVar.f24858a.setImageDrawable(r9Var);
                    fcVar.f24859b.setText(string);
                    fcVar.f24860c.setText(formatString);
                    org.telegram.ui.Components.gc gcVar = new org.telegram.ui.Components.gc(a02.W(), f6Var, true);
                    gcVar.e(string2);
                    gcVar.f25112a = z80Var;
                    fcVar.setButton(gcVar);
                    org.telegram.ui.Components.ic b10 = a02.b(fcVar, 2750);
                    b10.f25671j = 5000;
                    b10.j();
                    return;
                }
                return;
            default:
                Pattern pattern = LaunchActivity.f31586y1;
                MessagesController.getInstance(launchActivity.L).openApp((TLRPC.User) obj, 0);
                return;
        }
    }
}
