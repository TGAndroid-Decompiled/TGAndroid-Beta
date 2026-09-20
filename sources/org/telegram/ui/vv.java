package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class vv implements DialogInterface.OnClickListener {
    public final int f38604a;
    public final NotificationCenter.NotificationCenterDelegate f38605b;

    public vv(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f38604a = i10;
        this.f38605b = notificationCenterDelegate;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        String str;
        int i11 = 0;
        switch (this.f38604a) {
            case 0:
                uy uyVar = (uy) this.f38605b;
                if (i10 == 0) {
                    uyVar.getMessagesStorage().readAllDialogs(1);
                    return;
                } else if (i10 != 1 || uyVar.f38256e0 == null) {
                    return;
                } else {
                    while (true) {
                        ty[] tyVarArr = uyVar.f38256e0;
                        if (i11 < tyVarArr.length) {
                            ty tyVar = tyVarArr[i11];
                            if (tyVar.f37910s == 0 && tyVar.getVisibility() == 0) {
                                org.telegram.ui.Cells.s2 Q3 = uy.Q3(uyVar.f38256e0[i11]);
                                qy qyVar = uyVar.f38256e0[i11].f37904a;
                                int i12 = qy.f36981v3;
                                qyVar.A1(true, Q3);
                            }
                            i11++;
                        } else {
                            return;
                        }
                    }
                }
                break;
            case 1:
                xg0 xg0Var = (xg0) this.f38605b;
                if (i10 == 0) {
                    BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
                    ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
                    org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(xg0Var.V);
                    int i13 = R.raw.chats_infotip;
                    if (BuildVars.LOGS_ENABLED) {
                        str = "Logs enabled.";
                    } else {
                        str = "Logs disabled.";
                    }
                    a02.Q(i13, 36, str).j();
                    if (BuildVars.LOGS_ENABLED) {
                        hg.k0.u(new StringBuilder("app start time = "), ApplicationLoader.startTime);
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
                ProfileActivity.H4(xg0Var.V.getParentActivity(), false);
                return;
            case 2:
                pn0 pn0Var = (pn0) this.f38605b;
                if (i10 == 0) {
                    pn0Var.f36650w = "male";
                    pn0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    return;
                } else if (i10 == 1) {
                    pn0Var.f36650w = "female";
                    pn0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                    return;
                } else {
                    pn0Var.getClass();
                    return;
                }
            default:
                i91.d0((i91) this.f38605b, i10);
                return;
        }
    }
}
