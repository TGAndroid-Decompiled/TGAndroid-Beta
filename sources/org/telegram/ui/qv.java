package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class qv implements DialogInterface.OnClickListener {
    public final int f37851a;
    public final NotificationCenter.NotificationCenterDelegate f37852b;

    public qv(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f37851a = i10;
        this.f37852b = notificationCenterDelegate;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        String str;
        int i11 = 0;
        switch (this.f37851a) {
            case 0:
                oy oyVar = (oy) this.f37852b;
                if (i10 == 0) {
                    oyVar.getMessagesStorage().readAllDialogs(1);
                    return;
                } else if (i10 != 1 || oyVar.f37009b0 == null) {
                    return;
                } else {
                    while (true) {
                        ny[] nyVarArr = oyVar.f37009b0;
                        if (i11 < nyVarArr.length) {
                            ny nyVar = nyVarArr[i11];
                            if (nyVar.f36747s == 0 && nyVar.getVisibility() == 0) {
                                org.telegram.ui.Cells.r2 Q3 = oy.Q3(oyVar.f37009b0[i11]);
                                ky kyVar = oyVar.f37009b0[i11].f36741a;
                                int i12 = ky.f35832s3;
                                kyVar.z1(true, Q3);
                            }
                            i11++;
                        } else {
                            return;
                        }
                    }
                }
                break;
            case 1:
                mg0 mg0Var = (mg0) this.f37852b;
                if (i10 == 0) {
                    BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
                    ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
                    org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(mg0Var.S);
                    int i13 = R.raw.chats_infotip;
                    if (BuildVars.LOGS_ENABLED) {
                        str = "Logs enabled.";
                    } else {
                        str = "Logs disabled.";
                    }
                    a02.Q(i13, 36, str).j();
                    if (BuildVars.LOGS_ENABLED) {
                        kh.a2.x(new StringBuilder("app start time = "), ApplicationLoader.startTime);
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
                ProfileActivity.H4(mg0Var.S.getParentActivity(), false);
                return;
            case 2:
                dn0 dn0Var = (dn0) this.f37852b;
                if (i10 == 0) {
                    dn0Var.f33731w = "male";
                    dn0Var.V[4].setText(LocaleController.getString(R.string.PassportMale));
                    return;
                } else if (i10 == 1) {
                    dn0Var.f33731w = "female";
                    dn0Var.V[4].setText(LocaleController.getString(R.string.PassportFemale));
                    return;
                } else {
                    dn0Var.getClass();
                    return;
                }
            default:
                o81.c0((o81) this.f37852b, i10);
                return;
        }
    }
}
