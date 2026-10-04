package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class vv implements DialogInterface.OnClickListener {
    public final int f41849a;
    public final NotificationCenter.NotificationCenterDelegate f41850b;

    public vv(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f41849a = i10;
        this.f41850b = notificationCenterDelegate;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        String str;
        int i11 = 0;
        switch (this.f41849a) {
            case 0:
                uy uyVar = (uy) this.f41850b;
                if (i10 == 0) {
                    uyVar.getMessagesStorage().readAllDialogs(1);
                    return;
                } else if (i10 != 1 || uyVar.f41400e0 == null) {
                    return;
                } else {
                    while (true) {
                        ty[] tyVarArr = uyVar.f41400e0;
                        if (i11 < tyVarArr.length) {
                            ty tyVar = tyVarArr[i11];
                            if (tyVar.f40997s == 0 && tyVar.getVisibility() == 0) {
                                org.telegram.ui.Cells.s2 Z3 = uy.Z3(uyVar.f41400e0[i11]);
                                qy qyVar = uyVar.f41400e0[i11].f40990a;
                                int i12 = qy.C3;
                                qyVar.B1(true, Z3);
                            }
                            i11++;
                        } else {
                            return;
                        }
                    }
                }
                break;
            case 1:
                tg0 tg0Var = (tg0) this.f41850b;
                if (i10 == 0) {
                    BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
                    ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
                    org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(tg0Var.V);
                    int i13 = R.raw.chats_infotip;
                    if (BuildVars.LOGS_ENABLED) {
                        str = "Logs enabled.";
                    } else {
                        str = "Logs disabled.";
                    }
                    a02.Q(i13, 36, str).j();
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.q.r(new StringBuilder("app start time = "), ApplicationLoader.startTime);
                        try {
                            FileLog.d("buildVersion = " + ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0).versionCode);
                            return;
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            return;
                        }
                    }
                    return;
                }
                ProfileActivity.H4(tg0Var.V.getParentActivity(), false);
                return;
            case 2:
                kn0 kn0Var = (kn0) this.f41850b;
                if (i10 == 0) {
                    kn0Var.f38059w = "male";
                    kn0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    return;
                } else if (i10 == 1) {
                    kn0Var.f38059w = "female";
                    kn0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                    return;
                } else {
                    kn0Var.getClass();
                    return;
                }
            default:
                a91.Z((a91) this.f41850b, i10);
                return;
        }
    }
}
