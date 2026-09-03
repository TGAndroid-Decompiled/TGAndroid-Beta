package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class sv implements DialogInterface.OnClickListener {
    public final int f38318a;
    public final NotificationCenter.NotificationCenterDelegate f38319b;

    public sv(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f38318a = i10;
        this.f38319b = notificationCenterDelegate;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        String str;
        int i11 = 0;
        switch (this.f38318a) {
            case 0:
                qy qyVar = (qy) this.f38319b;
                if (i10 == 0) {
                    qyVar.getMessagesStorage().readAllDialogs(1);
                    return;
                } else if (i10 != 1 || qyVar.f37527b0 == null) {
                    return;
                } else {
                    while (true) {
                        py[] pyVarArr = qyVar.f37527b0;
                        if (i11 < pyVarArr.length) {
                            py pyVar = pyVarArr[i11];
                            if (pyVar.f37252s == 0 && pyVar.getVisibility() == 0) {
                                org.telegram.ui.Cells.q2 Q3 = qy.Q3(qyVar.f37527b0[i11]);
                                my myVar = qyVar.f37527b0[i11].f37246a;
                                int i12 = my.f36270s3;
                                myVar.y1(true, Q3);
                            }
                            i11++;
                        } else {
                            return;
                        }
                    }
                }
                break;
            case 1:
                og0 og0Var = (og0) this.f38319b;
                if (i10 == 0) {
                    BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
                    ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
                    org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(og0Var.S);
                    int i13 = R.raw.chats_infotip;
                    if (BuildVars.LOGS_ENABLED) {
                        str = "Logs enabled.";
                    } else {
                        str = "Logs disabled.";
                    }
                    a02.Q(i13, 36, str).j();
                    if (BuildVars.LOGS_ENABLED) {
                        kf.k0.x(new StringBuilder("app start time = "), ApplicationLoader.startTime);
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
                ProfileActivity.H4(og0Var.S.getParentActivity(), false);
                return;
            case 2:
                fn0 fn0Var = (fn0) this.f38319b;
                if (i10 == 0) {
                    fn0Var.f34159w = "male";
                    fn0Var.V[4].setText(LocaleController.getString(R.string.PassportMale));
                    return;
                } else if (i10 == 1) {
                    fn0Var.f34159w = "female";
                    fn0Var.V[4].setText(LocaleController.getString(R.string.PassportFemale));
                    return;
                } else {
                    fn0Var.getClass();
                    return;
                }
            default:
                w81.c0((w81) this.f38319b, i10);
                return;
        }
    }
}
