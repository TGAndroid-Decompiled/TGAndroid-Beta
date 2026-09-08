package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class vv implements DialogInterface.OnClickListener {
    public final int f41729a;
    public final NotificationCenter.NotificationCenterDelegate f41730b;

    public vv(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f41729a = i10;
        this.f41730b = notificationCenterDelegate;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        String str;
        int i11 = 0;
        switch (this.f41729a) {
            case 0:
                uy uyVar = (uy) this.f41730b;
                if (i10 == 0) {
                    uyVar.getMessagesStorage().readAllDialogs(1);
                    return;
                } else if (i10 != 1 || uyVar.f41286e0 == null) {
                    return;
                } else {
                    while (true) {
                        ty[] tyVarArr = uyVar.f41286e0;
                        if (i11 < tyVarArr.length) {
                            ty tyVar = tyVarArr[i11];
                            if (tyVar.f40892s == 0 && tyVar.getVisibility() == 0) {
                                org.telegram.ui.Cells.r2 Q3 = uy.Q3(uyVar.f41286e0[i11]);
                                qy qyVar = uyVar.f41286e0[i11].f40885a;
                                int i12 = qy.f40025v3;
                                qyVar.y1(true, Q3);
                            }
                            i11++;
                        } else {
                            return;
                        }
                    }
                }
                break;
            case 1:
                vg0 vg0Var = (vg0) this.f41730b;
                if (i10 == 0) {
                    BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
                    ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
                    org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(vg0Var.V);
                    int i13 = R.raw.chats_infotip;
                    if (BuildVars.LOGS_ENABLED) {
                        str = "Logs enabled.";
                    } else {
                        str = "Logs disabled.";
                    }
                    a02.Q(i13, 36, str).j();
                    if (BuildVars.LOGS_ENABLED) {
                        i2.g.w(new StringBuilder("app start time = "), ApplicationLoader.startTime);
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
                ProfileActivity.H4(vg0Var.V.getParentActivity(), false);
                return;
            case 2:
                pn0 pn0Var = (pn0) this.f41730b;
                if (i10 == 0) {
                    pn0Var.f39625w = "male";
                    pn0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    return;
                } else if (i10 == 1) {
                    pn0Var.f39625w = "female";
                    pn0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                    return;
                } else {
                    pn0Var.getClass();
                    return;
                }
            default:
                i91.d0((i91) this.f41730b, i10);
                return;
        }
    }
}
