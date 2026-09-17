package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class wv implements DialogInterface.OnClickListener {
    public final int f39176a;
    public final NotificationCenter.NotificationCenterDelegate f39177b;

    public wv(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f39176a = i10;
        this.f39177b = notificationCenterDelegate;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        String str;
        int i11 = 0;
        switch (this.f39176a) {
            case 0:
                wy wyVar = (wy) this.f39177b;
                if (i10 == 0) {
                    wyVar.getMessagesStorage().readAllDialogs(1);
                    return;
                } else if (i10 != 1 || wyVar.f39215e0 == null) {
                    return;
                } else {
                    while (true) {
                        vy[] vyVarArr = wyVar.f39215e0;
                        if (i11 < vyVarArr.length) {
                            vy vyVar = vyVarArr[i11];
                            if (vyVar.f38528s == 0 && vyVar.getVisibility() == 0) {
                                org.telegram.ui.Cells.r2 Q3 = wy.Q3(wyVar.f39215e0[i11]);
                                sy syVar = wyVar.f39215e0[i11].f38522a;
                                int i12 = sy.f37567v3;
                                syVar.A1(true, Q3);
                            }
                            i11++;
                        } else {
                            return;
                        }
                    }
                }
                break;
            case 1:
                xg0 xg0Var = (xg0) this.f39177b;
                if (i10 == 0) {
                    BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
                    ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
                    org.telegram.ui.Components.vc a02 = org.telegram.ui.Components.vc.a0(xg0Var.V);
                    int i13 = R.raw.chats_infotip;
                    if (BuildVars.LOGS_ENABLED) {
                        str = "Logs enabled.";
                    } else {
                        str = "Logs disabled.";
                    }
                    a02.Q(i13, 36, str).j();
                    if (BuildVars.LOGS_ENABLED) {
                        hg.k0.w(new StringBuilder("app start time = "), ApplicationLoader.startTime);
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
                qn0 qn0Var = (qn0) this.f39177b;
                if (i10 == 0) {
                    qn0Var.f36991w = "male";
                    qn0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    return;
                } else if (i10 == 1) {
                    qn0Var.f36991w = "female";
                    qn0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                    return;
                } else {
                    qn0Var.getClass();
                    return;
                }
            default:
                g91.d0((g91) this.f39177b, i10);
                return;
        }
    }
}
