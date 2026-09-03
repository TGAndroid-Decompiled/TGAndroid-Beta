package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class rv implements DialogInterface.OnClickListener {
    public final int f40945a;
    public final NotificationCenter.NotificationCenterDelegate f40946b;

    public rv(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f40945a = i10;
        this.f40946b = notificationCenterDelegate;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        String str;
        int i11 = 0;
        switch (this.f40945a) {
            case 0:
                py pyVar = (py) this.f40946b;
                if (i10 == 0) {
                    pyVar.getMessagesStorage().readAllDialogs(1);
                    return;
                } else if (i10 != 1 || pyVar.f40155b0 == null) {
                    return;
                } else {
                    while (true) {
                        oy[] oyVarArr = pyVar.f40155b0;
                        if (i11 < oyVarArr.length) {
                            oy oyVar = oyVarArr[i11];
                            if (oyVar.f39829s == 0 && oyVar.getVisibility() == 0) {
                                org.telegram.ui.Cells.r2 Q3 = py.Q3(pyVar.f40155b0[i11]);
                                ly lyVar = pyVar.f40155b0[i11].f39822a;
                                int i12 = ly.f38799s3;
                                lyVar.y1(true, Q3);
                            }
                            i11++;
                        } else {
                            return;
                        }
                    }
                }
                break;
            case 1:
                ng0 ng0Var = (ng0) this.f40946b;
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
                fn0 fn0Var = (fn0) this.f40946b;
                if (i10 == 0) {
                    fn0Var.f36870w = "male";
                    fn0Var.V[4].setText(LocaleController.getString(R.string.PassportMale));
                    return;
                } else if (i10 == 1) {
                    fn0Var.f36870w = "female";
                    fn0Var.V[4].setText(LocaleController.getString(R.string.PassportFemale));
                    return;
                } else {
                    fn0Var.getClass();
                    return;
                }
            default:
                v81.c0((v81) this.f40946b, i10);
                return;
        }
    }
}
