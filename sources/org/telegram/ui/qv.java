package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class qv implements DialogInterface.OnClickListener {
    public final int f37098a;
    public final NotificationCenter.NotificationCenterDelegate f37099b;

    public qv(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f37098a = i10;
        this.f37099b = notificationCenterDelegate;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        String str;
        int i11 = 0;
        switch (this.f37098a) {
            case 0:
                qy qyVar = (qy) this.f37099b;
                if (i10 == 0) {
                    qyVar.getMessagesStorage().readAllDialogs(1);
                    return;
                } else if (i10 != 1 || qyVar.f37134e0 == null) {
                    return;
                } else {
                    while (true) {
                        py[] pyVarArr = qyVar.f37134e0;
                        if (i11 < pyVarArr.length) {
                            py pyVar = pyVarArr[i11];
                            if (pyVar.f36800s == 0 && pyVar.getVisibility() == 0) {
                                org.telegram.ui.Cells.s2 Q3 = qy.Q3(qyVar.f37134e0[i11]);
                                my myVar = qyVar.f37134e0[i11].f36794a;
                                int i12 = my.C3;
                                myVar.B1(true, Q3);
                            }
                            i11++;
                        } else {
                            return;
                        }
                    }
                }
                break;
            case 1:
                pg0 pg0Var = (pg0) this.f37099b;
                if (i10 == 0) {
                    BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
                    ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
                    org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(pg0Var.V);
                    int i13 = R.raw.chats_infotip;
                    if (BuildVars.LOGS_ENABLED) {
                        str = "Logs enabled.";
                    } else {
                        str = "Logs disabled.";
                    }
                    a02.Q(i13, 36, str).j();
                    if (BuildVars.LOGS_ENABLED) {
                        hg.c.u(new StringBuilder("app start time = "), ApplicationLoader.startTime);
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
                ProfileActivity.H4(pg0Var.V.getParentActivity(), false);
                return;
            case 2:
                fn0 fn0Var = (fn0) this.f37099b;
                if (i10 == 0) {
                    fn0Var.f33836w = "male";
                    fn0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    return;
                } else if (i10 == 1) {
                    fn0Var.f33836w = "female";
                    fn0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                    return;
                } else {
                    fn0Var.getClass();
                    return;
                }
            default:
                z81.d0((z81) this.f37099b, i10);
                return;
        }
    }
}
