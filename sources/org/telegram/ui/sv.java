package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class sv implements DialogInterface.OnClickListener {
    public final int f41897a;
    public final NotificationCenter.NotificationCenterDelegate f41898b;

    public sv(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f41897a = i10;
        this.f41898b = notificationCenterDelegate;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        String str;
        int i11 = 0;
        switch (this.f41897a) {
            case 0:
                sy syVar = (sy) this.f41898b;
                if (i10 == 0) {
                    syVar.getMessagesStorage().readAllDialogs(1);
                    return;
                } else if (i10 != 1 || syVar.f41941e0 == null) {
                    return;
                } else {
                    while (true) {
                        ry[] ryVarArr = syVar.f41941e0;
                        if (i11 < ryVarArr.length) {
                            ry ryVar = ryVarArr[i11];
                            if (ryVar.f41571s == 0 && ryVar.getVisibility() == 0) {
                                org.telegram.ui.Cells.s2 N3 = sy.N3(syVar.f41941e0[i11]);
                                oy oyVar = syVar.f41941e0[i11].f41564a;
                                int i12 = oy.f40677t3;
                                oyVar.A1(true, N3);
                            }
                            i11++;
                        } else {
                            return;
                        }
                    }
                }
                break;
            case 1:
                ug0 ug0Var = (ug0) this.f41898b;
                if (i10 == 0) {
                    BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
                    ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
                    org.telegram.ui.Components.ad a02 = org.telegram.ui.Components.ad.a0(ug0Var.V);
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
                ProfileActivity.H4(ug0Var.V.getParentActivity(), false);
                return;
            case 2:
                mn0 mn0Var = (mn0) this.f41898b;
                if (i10 == 0) {
                    mn0Var.f40066w = "male";
                    mn0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    return;
                } else if (i10 == 1) {
                    mn0Var.f40066w = "female";
                    mn0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                    return;
                } else {
                    mn0Var.getClass();
                    return;
                }
            default:
                h91.d0((h91) this.f41898b, i10);
                return;
        }
    }
}
