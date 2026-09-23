package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class rv implements DialogInterface.OnClickListener {
    public final int f36941a;
    public final NotificationCenter.NotificationCenterDelegate f36942b;

    public rv(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f36941a = i10;
        this.f36942b = notificationCenterDelegate;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        String str;
        int i11 = 0;
        switch (this.f36941a) {
            case 0:
                ry ryVar = (ry) this.f36942b;
                if (i10 == 0) {
                    ryVar.getMessagesStorage().readAllDialogs(1);
                    return;
                } else if (i10 != 1 || ryVar.f36978e0 == null) {
                    return;
                } else {
                    while (true) {
                        qy[] qyVarArr = ryVar.f36978e0;
                        if (i11 < qyVarArr.length) {
                            qy qyVar = qyVarArr[i11];
                            if (qyVar.f36635s == 0 && qyVar.getVisibility() == 0) {
                                org.telegram.ui.Cells.r2 Q3 = ry.Q3(ryVar.f36978e0[i11]);
                                ny nyVar = ryVar.f36978e0[i11].f36629a;
                                int i12 = ny.f35622v3;
                                nyVar.z1(true, Q3);
                            }
                            i11++;
                        } else {
                            return;
                        }
                    }
                }
                break;
            case 1:
                qg0 qg0Var = (qg0) this.f36942b;
                if (i10 == 0) {
                    BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
                    ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
                    org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(qg0Var.V);
                    int i13 = R.raw.chats_infotip;
                    if (BuildVars.LOGS_ENABLED) {
                        str = "Logs enabled.";
                    } else {
                        str = "Logs disabled.";
                    }
                    a02.Q(i13, 36, str).j();
                    if (BuildVars.LOGS_ENABLED) {
                        hg.c.w(new StringBuilder("app start time = "), ApplicationLoader.startTime);
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
                ProfileActivity.H4(qg0Var.V.getParentActivity(), false);
                return;
            case 2:
                in0 in0Var = (in0) this.f36942b;
                if (i10 == 0) {
                    in0Var.f34211w = "male";
                    in0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    return;
                } else if (i10 == 1) {
                    in0Var.f34211w = "female";
                    in0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                    return;
                } else {
                    in0Var.getClass();
                    return;
                }
            default:
                x81.d0((x81) this.f36942b, i10);
                return;
        }
    }
}
