package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r01 extends org.telegram.ui.Components.il0 {
    public final Context f41839c;
    public final t01 d;

    public r01(t01 t01Var, Context context) {
        this.d = t01Var;
        this.f41839c = context;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        int b10 = n1Var.b();
        t01 t01Var = this.d;
        if (b10 == t01Var.A) {
            return t01Var.f42516n;
        }
        if (n1Var.b() == t01Var.S) {
            return true;
        }
        switch (n1Var.f6436f) {
            case 0:
            case 2:
            case 5:
            case 6:
                return false;
            case 1:
            case 3:
            case 4:
                return t01Var.f42516n;
            default:
                return true;
        }
    }

    @Override
    public final int h() {
        return this.d.U;
    }

    @Override
    public final int j(int i10) {
        t01 t01Var = this.d;
        if (i10 == t01Var.v || i10 == t01Var.G || i10 == t01Var.P || i10 == t01Var.L) {
            return 0;
        }
        if (i10 != t01Var.B && i10 != t01Var.C && i10 != t01Var.E && i10 != t01Var.D && i10 != t01Var.M && i10 != t01Var.N && i10 != t01Var.S) {
            if (i10 != t01Var.J && i10 != t01Var.R && i10 != t01Var.F && i10 != t01Var.O) {
                if (i10 == t01Var.Q) {
                    return 3;
                }
                if (i10 != t01Var.H && i10 != t01Var.I) {
                    if (i10 == t01Var.f42519w) {
                        return 5;
                    }
                    if (i10 != t01Var.f42520x && i10 != t01Var.T) {
                        if (i10 != t01Var.f42521y && i10 != t01Var.A && i10 != t01Var.K) {
                            return 0;
                        }
                        return 7;
                    }
                    return 6;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        String str;
        int i15;
        TLObject chat;
        int i16;
        boolean z10;
        int i17;
        t01 t01Var = this.d;
        long j10 = t01Var.f42515f;
        long j11 = t01Var.f42514e;
        int i18 = n1Var.f6436f;
        View view = n1Var.f6432a;
        boolean z11 = true;
        boolean z12 = false;
        switch (i18) {
            case 0:
                org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
                if (i10 == t01Var.v) {
                    k4Var.setText(LocaleController.getString(R.string.General));
                    return;
                } else if (i10 == t01Var.G) {
                    k4Var.setText(LocaleController.getString(R.string.ProfilePopupNotification));
                    return;
                } else if (i10 == t01Var.P) {
                    k4Var.setText(LocaleController.getString(R.string.NotificationsLed));
                    return;
                } else if (i10 == t01Var.L) {
                    k4Var.setText(LocaleController.getString(R.string.VoipNotificationSettings));
                    return;
                } else {
                    return;
                }
            case 1:
                org.telegram.ui.Cells.y9 y9Var = (org.telegram.ui.Cells.y9) view;
                String sharedPrefKey = NotificationsController.getSharedPrefKey(j11, j10);
                i11 = ((org.telegram.ui.ActionBar.o2) t01Var).currentAccount;
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i11);
                if (i10 == t01Var.S) {
                    y9Var.b(LocaleController.getString(R.string.ResetCustomNotifications), false);
                    y9Var.setTextColor(t01Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23295q7));
                    return;
                }
                y9Var.setTextColor(t01Var.getThemedColor(org.telegram.ui.ActionBar.g6.G6));
                if (i10 == t01Var.B) {
                    String string = notificationsSettings.getString(u3.c.e("sound_", sharedPrefKey), LocaleController.getString(R.string.SoundDefault));
                    long j12 = notificationsSettings.getLong("sound_document_id_" + sharedPrefKey, 0L);
                    if (j12 != 0) {
                        TLRPC.Document c3 = t01Var.getMediaDataController().ringtoneDataStore.c(j12);
                        if (c3 == null) {
                            string = LocaleController.getString(R.string.CustomSound);
                        } else {
                            string = gk0.a0(c3, c3.file_name_fixed);
                        }
                    } else if (string.equals("NoSound")) {
                        string = LocaleController.getString(R.string.NoSound);
                    } else if (string.equals("Default")) {
                        string = LocaleController.getString(R.string.SoundDefault);
                    }
                    y9Var.c(LocaleController.getString(R.string.Sound), string, false, true);
                    return;
                } else if (i10 == t01Var.M) {
                    String string2 = notificationsSettings.getString(u3.c.e("ringtone_", sharedPrefKey), LocaleController.getString(R.string.DefaultRingtone));
                    if (string2.equals("NoSound")) {
                        string2 = LocaleController.getString(R.string.NoSound);
                    }
                    y9Var.c(LocaleController.getString(R.string.VoipSettingsRingtone), string2, false, false);
                    return;
                } else if (i10 == t01Var.C) {
                    int c6 = org.telegram.messenger.x3.c("vibrate_", sharedPrefKey, notificationsSettings, 0);
                    if (c6 != 0 && c6 != 4) {
                        if (c6 == 1) {
                            String string3 = LocaleController.getString(R.string.Vibrate);
                            String string4 = LocaleController.getString(R.string.Short);
                            if (t01Var.D == -1 && t01Var.E == -1) {
                                z11 = false;
                            }
                            y9Var.c(string3, string4, false, z11);
                            return;
                        } else if (c6 == 2) {
                            String string5 = LocaleController.getString(R.string.Vibrate);
                            String string6 = LocaleController.getString(R.string.VibrationDisabled);
                            if (t01Var.D == -1 && t01Var.E == -1) {
                                z11 = false;
                            }
                            y9Var.c(string5, string6, false, z11);
                            return;
                        } else if (c6 == 3) {
                            String string7 = LocaleController.getString(R.string.Vibrate);
                            String string8 = LocaleController.getString(R.string.Long);
                            if (t01Var.D == -1 && t01Var.E == -1) {
                                z11 = false;
                            }
                            y9Var.c(string7, string8, false, z11);
                            return;
                        } else {
                            return;
                        }
                    }
                    String string9 = LocaleController.getString(R.string.Vibrate);
                    String string10 = LocaleController.getString(R.string.VibrationDefault);
                    if (t01Var.D == -1 && t01Var.E == -1) {
                        z11 = false;
                    }
                    y9Var.c(string9, string10, false, z11);
                    return;
                } else if (i10 == t01Var.E) {
                    int c10 = org.telegram.messenger.x3.c("priority_", sharedPrefKey, notificationsSettings, 3);
                    if (c10 == 0) {
                        y9Var.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityHigh), false, false);
                        return;
                    } else if (c10 != 1 && c10 != 2) {
                        if (c10 == 3) {
                            y9Var.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPrioritySettings), false, false);
                            return;
                        } else if (c10 == 4) {
                            y9Var.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityLow), false, false);
                            return;
                        } else if (c10 == 5) {
                            y9Var.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityMedium), false, false);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        y9Var.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityUrgent), false, false);
                        return;
                    }
                } else if (i10 == t01Var.D) {
                    int c11 = org.telegram.messenger.x3.c("smart_max_count_", sharedPrefKey, notificationsSettings, 2);
                    int c12 = org.telegram.messenger.x3.c("smart_delay_", sharedPrefKey, notificationsSettings, 180);
                    if (c11 == 0) {
                        String string11 = LocaleController.getString(R.string.SmartNotifications);
                        String string12 = LocaleController.getString(R.string.SmartNotificationsDisabled);
                        if (t01Var.E == -1) {
                            z11 = false;
                        }
                        y9Var.c(string11, string12, false, z11);
                        return;
                    }
                    String formatPluralString = LocaleController.formatPluralString("Minutes", c12 / 60, new Object[0]);
                    String string13 = LocaleController.getString(R.string.SmartNotifications);
                    String formatString = LocaleController.formatString("SmartNotificationsInfo", R.string.SmartNotificationsInfo, Integer.valueOf(c11), formatPluralString);
                    if (t01Var.E == -1) {
                        z11 = false;
                    }
                    y9Var.c(string13, formatString, false, z11);
                    return;
                } else if (i10 == t01Var.N) {
                    int c13 = org.telegram.messenger.x3.c("calls_vibrate_", sharedPrefKey, notificationsSettings, 0);
                    if (c13 != 0 && c13 != 4) {
                        if (c13 == 1) {
                            y9Var.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.Short), false, true);
                            return;
                        } else if (c13 == 2) {
                            y9Var.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.VibrationDisabled), false, true);
                            return;
                        } else if (c13 == 3) {
                            y9Var.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.Long), false, true);
                            return;
                        } else {
                            return;
                        }
                    }
                    y9Var.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.VibrationDefault), false, true);
                    return;
                } else {
                    return;
                }
            case 2:
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                y8Var.setFixedSize(0);
                if (i10 == t01Var.J) {
                    y8Var.setText(LocaleController.getString(R.string.ProfilePopupNotificationInfo));
                    return;
                } else if (i10 == t01Var.R) {
                    y8Var.setText(LocaleController.getString(R.string.NotificationsLedInfo));
                    return;
                } else if (i10 == t01Var.F) {
                    if (t01Var.E == -1) {
                        y8Var.setText("");
                        return;
                    } else {
                        y8Var.setText(LocaleController.getString(R.string.PriorityInfo));
                        return;
                    }
                } else if (i10 == t01Var.O) {
                    y8Var.setText(LocaleController.getString(R.string.VoipRingtoneInfo));
                    return;
                } else {
                    return;
                }
            case 3:
                org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                String sharedPrefKey2 = NotificationsController.getSharedPrefKey(j11, j10);
                i12 = ((org.telegram.ui.ActionBar.o2) t01Var).currentAccount;
                SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(i12);
                if (notificationsSettings2.contains("color_" + sharedPrefKey2)) {
                    i13 = org.telegram.messenger.x3.c("color_", sharedPrefKey2, notificationsSettings2, -16776961);
                } else if (DialogObject.isChatDialog(j11)) {
                    i13 = notificationsSettings2.getInt("GroupLed", -16776961);
                } else {
                    i13 = notificationsSettings2.getInt("MessagesLed", -16776961);
                }
                int i19 = 0;
                while (true) {
                    if (i19 < 9) {
                        if (org.telegram.ui.Cells.s8.f25670f[i19] == i13) {
                            i13 = org.telegram.ui.Cells.s8.f25669e[i19];
                        } else {
                            i19++;
                        }
                    }
                }
                s8Var.b(i13, LocaleController.getString(R.string.NotificationsLedColor), false);
                return;
            case 4:
                org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
                i14 = ((org.telegram.ui.ActionBar.o2) t01Var).currentAccount;
                SharedPreferences notificationsSettings3 = MessagesController.getNotificationsSettings(i14);
                int c14 = org.telegram.messenger.x3.c("popup_", NotificationsController.getSharedPrefKey(j11, j10), notificationsSettings3, 0);
                if (c14 == 0) {
                    if (DialogObject.isChatDialog(j11)) {
                        str = "popupGroup";
                    } else {
                        str = "popupAll";
                    }
                    if (notificationsSettings3.getInt(str, 0) != 0) {
                        c14 = 1;
                    } else {
                        c14 = 2;
                    }
                }
                if (i10 == t01Var.H) {
                    String string14 = LocaleController.getString(R.string.PopupEnabled);
                    if (c14 == 1) {
                        z12 = true;
                    }
                    h6Var.c(string14, z12, true);
                    h6Var.setTag(1);
                    return;
                } else if (i10 == t01Var.I) {
                    String string15 = LocaleController.getString(R.string.PopupDisabled);
                    if (c14 != 2) {
                        z11 = false;
                    }
                    h6Var.c(string15, z11, false);
                    h6Var.setTag(2);
                    return;
                } else {
                    return;
                }
            case 5:
                org.telegram.ui.Cells.ra raVar = (org.telegram.ui.Cells.ra) view;
                if (DialogObject.isUserDialog(j11)) {
                    i16 = ((org.telegram.ui.ActionBar.o2) t01Var).currentAccount;
                    chat = MessagesController.getInstance(i16).getUser(Long.valueOf(j11));
                } else {
                    i15 = ((org.telegram.ui.ActionBar.o2) t01Var).currentAccount;
                    chat = MessagesController.getInstance(i15).getChat(Long.valueOf(-j11));
                }
                raVar.a(chat, null);
                return;
            case 6:
                org.telegram.ui.Cells.x6 x6Var = (org.telegram.ui.Cells.x6) view;
                if (i10 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i10 >= t01Var.U - 1) {
                    z11 = false;
                }
                if (x6Var.f25927c != z10 || x6Var.d != z11) {
                    x6Var.f25927c = z10;
                    x6Var.d = z11;
                    int i20 = x6Var.f25926b;
                    if (i20 == 0) {
                        x6Var.setBackground(null);
                        return;
                    } else {
                        x6Var.setBackgroundColor(i20);
                        return;
                    }
                }
                return;
            case 7:
                org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                i17 = ((org.telegram.ui.ActionBar.o2) t01Var).currentAccount;
                SharedPreferences notificationsSettings4 = MessagesController.getNotificationsSettings(i17);
                if (i10 == t01Var.f42521y) {
                    q8Var.f(LocaleController.getString(R.string.Notifications), t01Var.f42516n, true);
                    return;
                } else if (i10 == t01Var.A) {
                    String sharedPrefKey3 = NotificationsController.getSharedPrefKey(j11, j10);
                    String string16 = LocaleController.getString(R.string.MessagePreview);
                    q8Var.f(string16, notificationsSettings4.getBoolean("content_preview_" + sharedPrefKey3, true), true);
                    return;
                } else if (i10 == t01Var.K) {
                    String e10 = u3.c.e("stories_", NotificationsController.getSharedPrefKey(j11, j10));
                    if (t01Var.V || (notificationsSettings4.contains("EnableAllStories") && notificationsSettings4.getBoolean("EnableAllStories", true))) {
                        z12 = true;
                    }
                    q8Var.f(LocaleController.getString(R.string.StoriesSoundEnabled), notificationsSettings4.getBoolean(e10, z12), true);
                    return;
                } else {
                    return;
                }
            default:
                return;
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View k4Var;
        t01 t01Var = this.d;
        org.telegram.ui.ActionBar.c6 c6Var = t01Var.d;
        Context context = this.f41839c;
        switch (i10) {
            case 0:
                k4Var = new org.telegram.ui.Cells.k4(context, c6Var);
                k4Var.setBackgroundColor(t01Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6));
                break;
            case 1:
                k4Var = new org.telegram.ui.Cells.y9(context, 0, c6Var);
                k4Var.setBackgroundColor(t01Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6));
                break;
            case 2:
                k4Var = new org.telegram.ui.Cells.y8(context, c6Var);
                break;
            case 3:
                k4Var = new org.telegram.ui.Cells.s8(context, c6Var);
                k4Var.setBackgroundColor(t01Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6));
                break;
            case 4:
                k4Var = new org.telegram.ui.Cells.h6(context, c6Var);
                k4Var.setBackgroundColor(t01Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6));
                break;
            case 5:
                k4Var = new org.telegram.ui.Cells.ra(context, c6Var);
                k4Var.setBackgroundColor(t01Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6));
                break;
            case 6:
                k4Var = new org.telegram.ui.Cells.x6(context, (b) null);
                break;
            default:
                k4Var = new org.telegram.ui.Cells.q8(context, c6Var);
                k4Var.setBackgroundColor(t01Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6));
                break;
        }
        return th.m(k4Var, k4Var, -1, -2);
    }

    @Override
    public final void y(f2.n1 n1Var) {
        int i10 = n1Var.f6436f;
        View view = n1Var.f6432a;
        t01 t01Var = this.d;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 7) {
                                return;
                            }
                            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                            if (n1Var.b() == t01Var.A) {
                                q8Var.e(null, t01Var.f42516n);
                                return;
                            } else if (n1Var.b() == t01Var.K) {
                                q8Var.e(null, t01Var.f42516n);
                                return;
                            } else {
                                q8Var.e(null, true);
                                return;
                            }
                        }
                        ((org.telegram.ui.Cells.h6) view).b(null, t01Var.f42516n);
                        return;
                    }
                    ((org.telegram.ui.Cells.s8) view).a(null, t01Var.f42516n);
                    return;
                }
                ((org.telegram.ui.Cells.y8) view).c(null, t01Var.f42516n);
                return;
            }
            org.telegram.ui.Cells.y9 y9Var = (org.telegram.ui.Cells.y9) view;
            if (n1Var.b() == t01Var.S) {
                y9Var.a(null, true);
                return;
            } else {
                y9Var.a(null, t01Var.f42516n);
                return;
            }
        }
        ((org.telegram.ui.Cells.k4) view).a(null, t01Var.f42516n);
    }
}
