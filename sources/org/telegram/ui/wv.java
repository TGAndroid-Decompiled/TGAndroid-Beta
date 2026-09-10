package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class wv implements DialogInterface.OnClickListener {
    public final int f38393a;
    public final NotificationCenter.NotificationCenterDelegate f38394b;

    public wv(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f38393a = i10;
        this.f38394b = notificationCenterDelegate;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        String str;
        int i11 = 0;
        switch (this.f38393a) {
            case 0:
                wy wyVar = (wy) this.f38394b;
                if (i10 == 0) {
                    wyVar.getMessagesStorage().readAllDialogs(1);
                    return;
                } else if (i10 != 1 || wyVar.f38431e0 == null) {
                    return;
                } else {
                    while (true) {
                        vy[] vyVarArr = wyVar.f38431e0;
                        if (i11 < vyVarArr.length) {
                            vy vyVar = vyVarArr[i11];
                            if (vyVar.f37651s == 0 && vyVar.getVisibility() == 0) {
                                org.telegram.ui.Cells.r2 Q3 = wy.Q3(wyVar.f38431e0[i11]);
                                sy syVar = wyVar.f38431e0[i11].f37645a;
                                int i12 = sy.f36776v3;
                                syVar.y1(true, Q3);
                            }
                            i11++;
                        } else {
                            return;
                        }
                    }
                }
                break;
            case 1:
                wg0 wg0Var = (wg0) this.f38394b;
                if (i10 == 0) {
                    BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
                    ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
                    org.telegram.ui.Components.wc a02 = org.telegram.ui.Components.wc.a0(wg0Var.V);
                    int i13 = R.raw.chats_infotip;
                    if (BuildVars.LOGS_ENABLED) {
                        str = "Logs enabled.";
                    } else {
                        str = "Logs disabled.";
                    }
                    a02.Q(i13, 36, str).j();
                    if (BuildVars.LOGS_ENABLED) {
                        hc.b.x(new StringBuilder("app start time = "), ApplicationLoader.startTime);
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
                ProfileActivity.H4(wg0Var.V.getParentActivity(), false);
                return;
            case 2:
                on0 on0Var = (on0) this.f38394b;
                if (i10 == 0) {
                    on0Var.f35566w = "male";
                    on0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    return;
                } else if (i10 == 1) {
                    on0Var.f35566w = "female";
                    on0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                    return;
                } else {
                    on0Var.getClass();
                    return;
                }
            default:
                k91.d0((k91) this.f38394b, i10);
                return;
        }
    }
}
