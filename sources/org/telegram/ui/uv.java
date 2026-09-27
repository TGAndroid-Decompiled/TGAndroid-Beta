package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class uv implements DialogInterface.OnClickListener {
    public final int f38335a;
    public final NotificationCenter.NotificationCenterDelegate f38336b;

    public uv(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f38335a = i10;
        this.f38336b = notificationCenterDelegate;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        String str;
        int i11 = 0;
        switch (this.f38335a) {
            case 0:
                ty tyVar = (ty) this.f38336b;
                if (i10 == 0) {
                    tyVar.getMessagesStorage().readAllDialogs(1);
                    return;
                } else if (i10 != 1 || tyVar.f37976e0 == null) {
                    return;
                } else {
                    while (true) {
                        sy[] syVarArr = tyVar.f37976e0;
                        if (i11 < syVarArr.length) {
                            sy syVar = syVarArr[i11];
                            if (syVar.f37599s == 0 && syVar.getVisibility() == 0) {
                                org.telegram.ui.Cells.s2 Z3 = ty.Z3(tyVar.f37976e0[i11]);
                                py pyVar = tyVar.f37976e0[i11].f37593a;
                                int i12 = py.f36563v3;
                                pyVar.A1(true, Z3);
                            }
                            i11++;
                        } else {
                            return;
                        }
                    }
                }
                break;
            case 1:
                sg0 sg0Var = (sg0) this.f38336b;
                if (i10 == 0) {
                    BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
                    ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
                    org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(sg0Var.V);
                    int i13 = R.raw.chats_infotip;
                    if (BuildVars.LOGS_ENABLED) {
                        str = "Logs enabled.";
                    } else {
                        str = "Logs disabled.";
                    }
                    a02.Q(i13, 36, str).j();
                    if (BuildVars.LOGS_ENABLED) {
                        hg.k0.u(new StringBuilder("app start time = "), ApplicationLoader.startTime);
                        try {
                            FileLog.d("buildVersion = " + ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0).versionCode);
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    }
                    return;
                }
                ProfileActivity.H4(sg0Var.V.getParentActivity(), false);
                return;
            case 2:
                jn0 jn0Var = (jn0) this.f38336b;
                if (i10 == 0) {
                    jn0Var.f34816w = "male";
                    jn0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    return;
                } else if (i10 == 1) {
                    jn0Var.f34816w = "female";
                    jn0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                    return;
                } else {
                    jn0Var.getClass();
                    return;
                }
            default:
                a91.Y((a91) this.f38336b, i10);
                return;
        }
    }
}
