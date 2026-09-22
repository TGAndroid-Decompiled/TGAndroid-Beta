package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class uv implements DialogInterface.OnClickListener {
    public final int f38182a;
    public final NotificationCenter.NotificationCenterDelegate f38183b;

    public uv(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f38182a = i10;
        this.f38183b = notificationCenterDelegate;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        String str;
        int i11 = 0;
        switch (this.f38182a) {
            case 0:
                uy uyVar = (uy) this.f38183b;
                if (i10 == 0) {
                    uyVar.getMessagesStorage().readAllDialogs(1);
                    return;
                } else if (i10 != 1 || uyVar.f38222e0 == null) {
                    return;
                } else {
                    while (true) {
                        ty[] tyVarArr = uyVar.f38222e0;
                        if (i11 < tyVarArr.length) {
                            ty tyVar = tyVarArr[i11];
                            if (tyVar.f37758s == 0 && tyVar.getVisibility() == 0) {
                                org.telegram.ui.Cells.r2 Q3 = uy.Q3(uyVar.f38222e0[i11]);
                                qy qyVar = uyVar.f38222e0[i11].f37752a;
                                int i12 = qy.f36957v3;
                                qyVar.z1(true, Q3);
                            }
                            i11++;
                        } else {
                            return;
                        }
                    }
                }
                break;
            case 1:
                vg0 vg0Var = (vg0) this.f38183b;
                if (i10 == 0) {
                    BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
                    ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
                    org.telegram.ui.Components.vc a02 = org.telegram.ui.Components.vc.a0(vg0Var.V);
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
                ProfileActivity.H4(vg0Var.V.getParentActivity(), false);
                return;
            case 2:
                on0 on0Var = (on0) this.f38183b;
                if (i10 == 0) {
                    on0Var.f36305w = "male";
                    on0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    return;
                } else if (i10 == 1) {
                    on0Var.f36305w = "female";
                    on0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                    return;
                } else {
                    on0Var.getClass();
                    return;
                }
            default:
                f91.d0((f91) this.f38183b, i10);
                return;
        }
    }
}
