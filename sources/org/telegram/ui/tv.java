package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class tv implements DialogInterface.OnClickListener {
    public final int f42130a;
    public final NotificationCenter.NotificationCenterDelegate f42131b;

    public tv(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f42130a = i10;
        this.f42131b = notificationCenterDelegate;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        String str;
        int i11 = 0;
        switch (this.f42130a) {
            case 0:
                ty tyVar = (ty) this.f42131b;
                if (i10 == 0) {
                    tyVar.getMessagesStorage().readAllDialogs(1);
                    return;
                } else if (i10 != 1 || tyVar.f42174e0 == null) {
                    return;
                } else {
                    while (true) {
                        sy[] syVarArr = tyVar.f42174e0;
                        if (i11 < syVarArr.length) {
                            sy syVar = syVarArr[i11];
                            if (syVar.f41797s == 0 && syVar.getVisibility() == 0) {
                                org.telegram.ui.Cells.s2 N3 = ty.N3(tyVar.f42174e0[i11]);
                                py pyVar = tyVar.f42174e0[i11].f41790a;
                                int i12 = py.f40913t3;
                                pyVar.A1(true, N3);
                            }
                            i11++;
                        } else {
                            return;
                        }
                    }
                }
                break;
            case 1:
                vg0 vg0Var = (vg0) this.f42131b;
                if (i10 == 0) {
                    BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
                    ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
                    org.telegram.ui.Components.ad a02 = org.telegram.ui.Components.ad.a0(vg0Var.V);
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
                ProfileActivity.H4(vg0Var.V.getParentActivity(), false);
                return;
            case 2:
                nn0 nn0Var = (nn0) this.f42131b;
                if (i10 == 0) {
                    nn0Var.f40290w = "male";
                    nn0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    return;
                } else if (i10 == 1) {
                    nn0Var.f40290w = "female";
                    nn0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                    return;
                } else {
                    nn0Var.getClass();
                    return;
                }
            default:
                i91.d0((i91) this.f42131b, i10);
                return;
        }
    }
}
