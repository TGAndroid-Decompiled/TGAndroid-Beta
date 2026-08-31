package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class rv implements DialogInterface.OnClickListener {
    public final int f41054a;
    public final NotificationCenter.NotificationCenterDelegate f41055b;

    public rv(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f41054a = i10;
        this.f41055b = notificationCenterDelegate;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        String str;
        int i11 = 0;
        switch (this.f41054a) {
            case 0:
                py pyVar = (py) this.f41055b;
                if (i10 == 0) {
                    pyVar.getMessagesStorage().readAllDialogs(1);
                    return;
                } else if (i10 != 1 || pyVar.f40185b0 == null) {
                    return;
                } else {
                    while (true) {
                        oy[] oyVarArr = pyVar.f40185b0;
                        if (i11 < oyVarArr.length) {
                            oy oyVar = oyVarArr[i11];
                            if (oyVar.f39873s == 0 && oyVar.getVisibility() == 0) {
                                org.telegram.ui.Cells.r2 Q3 = py.Q3(pyVar.f40185b0[i11]);
                                ly lyVar = pyVar.f40185b0[i11].f39866a;
                                int i12 = ly.f38903s3;
                                lyVar.z1(true, Q3);
                            }
                            i11++;
                        } else {
                            return;
                        }
                    }
                }
                break;
            case 1:
                ng0 ng0Var = (ng0) this.f41055b;
                if (i10 == 0) {
                    BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
                    ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
                    org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(ng0Var.S);
                    int i13 = R.raw.chats_infotip;
                    if (BuildVars.LOGS_ENABLED) {
                        str = "Logs enabled.";
                    } else {
                        str = "Logs disabled.";
                    }
                    a02.Q(i13, 36, str).j();
                    if (BuildVars.LOGS_ENABLED) {
                        l.d.x(new StringBuilder("app start time = "), ApplicationLoader.startTime);
                        try {
                            FileLog.d("buildVersion = " + ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0).versionCode);
                            return;
                        } catch (Exception e6) {
                            FileLog.e(e6);
                            return;
                        }
                    }
                    return;
                }
                ProfileActivity.H4(ng0Var.S.getParentActivity(), false);
                return;
            case 2:
                fn0 fn0Var = (fn0) this.f41055b;
                if (i10 == 0) {
                    fn0Var.f36967w = "male";
                    fn0Var.V[4].setText(LocaleController.getString(R.string.PassportMale));
                    return;
                } else if (i10 == 1) {
                    fn0Var.f36967w = "female";
                    fn0Var.V[4].setText(LocaleController.getString(R.string.PassportFemale));
                    return;
                } else {
                    fn0Var.getClass();
                    return;
                }
            default:
                p81.c0((p81) this.f41055b, i10);
                return;
        }
    }
}
