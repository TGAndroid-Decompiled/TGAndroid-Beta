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
public final class s11 extends org.telegram.ui.Components.qm0 {
    public final Context f41600c;
    public final u11 d;

    public s11(u11 u11Var, Context context) {
        this.d = u11Var;
        this.f41600c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int b10 = d1Var.b();
        u11 u11Var = this.d;
        if (b10 == u11Var.E) {
            return u11Var.f42352n;
        }
        if (d1Var.b() == u11Var.W) {
            return true;
        }
        switch (d1Var.f47786f) {
            case 0:
            case 2:
            case 5:
            case 6:
                return false;
            case 1:
            case 3:
            case 4:
                return u11Var.f42352n;
            default:
                return true;
        }
    }

    @Override
    public final int h() {
        return this.d.Y;
    }

    @Override
    public final int j(int i10) {
        u11 u11Var = this.d;
        if (i10 == u11Var.v || i10 == u11Var.K || i10 == u11Var.T || i10 == u11Var.P) {
            return 0;
        }
        if (i10 != u11Var.F && i10 != u11Var.G && i10 != u11Var.I && i10 != u11Var.H && i10 != u11Var.Q && i10 != u11Var.R && i10 != u11Var.W) {
            if (i10 != u11Var.N && i10 != u11Var.V && i10 != u11Var.J && i10 != u11Var.S) {
                if (i10 == u11Var.U) {
                    return 3;
                }
                if (i10 != u11Var.L && i10 != u11Var.M) {
                    if (i10 == u11Var.f42355w) {
                        return 5;
                    }
                    if (i10 != u11Var.f42356x && i10 != u11Var.X) {
                        if (i10 != u11Var.f42357y && i10 != u11Var.E && i10 != u11Var.O) {
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
    public final void v(s4.d1 d1Var, int i10) {
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
        u11 u11Var = this.d;
        long j3 = u11Var.f42351f;
        long j10 = u11Var.f42350e;
        int i18 = d1Var.f47786f;
        View view = d1Var.f47782a;
        boolean z11 = true;
        boolean z12 = false;
        switch (i18) {
            case 0:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (i10 == u11Var.v) {
                    m4Var.setText(LocaleController.getString(R.string.General));
                    return;
                } else if (i10 == u11Var.K) {
                    m4Var.setText(LocaleController.getString(R.string.ProfilePopupNotification));
                    return;
                } else if (i10 == u11Var.T) {
                    m4Var.setText(LocaleController.getString(R.string.NotificationsLed));
                    return;
                } else if (i10 == u11Var.P) {
                    m4Var.setText(LocaleController.getString(R.string.VoipNotificationSettings));
                    return;
                } else {
                    return;
                }
            case 1:
                org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) view;
                String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, j3);
                i11 = ((org.telegram.ui.ActionBar.m2) u11Var).currentAccount;
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i11);
                if (i10 == u11Var.W) {
                    caVar.b(LocaleController.getString(R.string.ResetCustomNotifications), false);
                    caVar.setTextColor(u11Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21062q7));
                    return;
                }
                caVar.setTextColor(u11Var.getThemedColor(org.telegram.ui.ActionBar.h6.G6));
                if (i10 == u11Var.F) {
                    String string = notificationsSettings.getString(sc.v.i("sound_", sharedPrefKey), LocaleController.getString(R.string.SoundDefault));
                    long j11 = notificationsSettings.getLong("sound_document_id_" + sharedPrefKey, 0L);
                    if (j11 != 0) {
                        TLRPC.Document c10 = u11Var.getMediaDataController().ringtoneDataStore.c(j11);
                        if (c10 == null) {
                            string = LocaleController.getString(R.string.CustomSound);
                        } else {
                            string = zk0.a0(c10, c10.file_name_fixed);
                        }
                    } else if (string.equals("NoSound")) {
                        string = LocaleController.getString(R.string.NoSound);
                    } else if (string.equals("Default")) {
                        string = LocaleController.getString(R.string.SoundDefault);
                    }
                    caVar.c(LocaleController.getString(R.string.Sound), string, false, true);
                    return;
                } else if (i10 == u11Var.Q) {
                    String string2 = notificationsSettings.getString(sc.v.i("ringtone_", sharedPrefKey), LocaleController.getString(R.string.DefaultRingtone));
                    if (string2.equals("NoSound")) {
                        string2 = LocaleController.getString(R.string.NoSound);
                    }
                    caVar.c(LocaleController.getString(R.string.VoipSettingsRingtone), string2, false, false);
                    return;
                } else if (i10 == u11Var.G) {
                    int c11 = org.telegram.messenger.q.c("vibrate_", sharedPrefKey, notificationsSettings, 0);
                    if (c11 != 0 && c11 != 4) {
                        if (c11 == 1) {
                            String string3 = LocaleController.getString(R.string.Vibrate);
                            String string4 = LocaleController.getString(R.string.Short);
                            if (u11Var.H == -1 && u11Var.I == -1) {
                                z11 = false;
                            }
                            caVar.c(string3, string4, false, z11);
                            return;
                        } else if (c11 == 2) {
                            String string5 = LocaleController.getString(R.string.Vibrate);
                            String string6 = LocaleController.getString(R.string.VibrationDisabled);
                            if (u11Var.H == -1 && u11Var.I == -1) {
                                z11 = false;
                            }
                            caVar.c(string5, string6, false, z11);
                            return;
                        } else if (c11 == 3) {
                            String string7 = LocaleController.getString(R.string.Vibrate);
                            String string8 = LocaleController.getString(R.string.Long);
                            if (u11Var.H == -1 && u11Var.I == -1) {
                                z11 = false;
                            }
                            caVar.c(string7, string8, false, z11);
                            return;
                        } else {
                            return;
                        }
                    }
                    String string9 = LocaleController.getString(R.string.Vibrate);
                    String string10 = LocaleController.getString(R.string.VibrationDefault);
                    if (u11Var.H == -1 && u11Var.I == -1) {
                        z11 = false;
                    }
                    caVar.c(string9, string10, false, z11);
                    return;
                } else if (i10 == u11Var.I) {
                    int c12 = org.telegram.messenger.q.c("priority_", sharedPrefKey, notificationsSettings, 3);
                    if (c12 == 0) {
                        caVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityHigh), false, false);
                        return;
                    } else if (c12 != 1 && c12 != 2) {
                        if (c12 == 3) {
                            caVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPrioritySettings), false, false);
                            return;
                        } else if (c12 == 4) {
                            caVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityLow), false, false);
                            return;
                        } else if (c12 == 5) {
                            caVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityMedium), false, false);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        caVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityUrgent), false, false);
                        return;
                    }
                } else if (i10 == u11Var.H) {
                    int c13 = org.telegram.messenger.q.c("smart_max_count_", sharedPrefKey, notificationsSettings, 2);
                    int c14 = org.telegram.messenger.q.c("smart_delay_", sharedPrefKey, notificationsSettings, 180);
                    if (c13 == 0) {
                        String string11 = LocaleController.getString(R.string.SmartNotifications);
                        String string12 = LocaleController.getString(R.string.SmartNotificationsDisabled);
                        if (u11Var.I == -1) {
                            z11 = false;
                        }
                        caVar.c(string11, string12, false, z11);
                        return;
                    }
                    String formatPluralString = LocaleController.formatPluralString("Minutes", c14 / 60, new Object[0]);
                    String string13 = LocaleController.getString(R.string.SmartNotifications);
                    String formatString = LocaleController.formatString("SmartNotificationsInfo", R.string.SmartNotificationsInfo, Integer.valueOf(c13), formatPluralString);
                    if (u11Var.I == -1) {
                        z11 = false;
                    }
                    caVar.c(string13, formatString, false, z11);
                    return;
                } else if (i10 == u11Var.R) {
                    int c15 = org.telegram.messenger.q.c("calls_vibrate_", sharedPrefKey, notificationsSettings, 0);
                    if (c15 != 0 && c15 != 4) {
                        if (c15 == 1) {
                            caVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.Short), false, true);
                            return;
                        } else if (c15 == 2) {
                            caVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.VibrationDisabled), false, true);
                            return;
                        } else if (c15 == 3) {
                            caVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.Long), false, true);
                            return;
                        } else {
                            return;
                        }
                    }
                    caVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.VibrationDefault), false, true);
                    return;
                } else {
                    return;
                }
            case 2:
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                e9Var.setFixedSize(0);
                if (i10 == u11Var.N) {
                    e9Var.setText(LocaleController.getString(R.string.ProfilePopupNotificationInfo));
                    return;
                } else if (i10 == u11Var.V) {
                    e9Var.setText(LocaleController.getString(R.string.NotificationsLedInfo));
                    return;
                } else if (i10 == u11Var.J) {
                    if (u11Var.I == -1) {
                        e9Var.setText("");
                        return;
                    } else {
                        e9Var.setText(LocaleController.getString(R.string.PriorityInfo));
                        return;
                    }
                } else if (i10 == u11Var.S) {
                    e9Var.setText(LocaleController.getString(R.string.VoipRingtoneInfo));
                    return;
                } else {
                    return;
                }
            case 3:
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                String sharedPrefKey2 = NotificationsController.getSharedPrefKey(j10, j3);
                i12 = ((org.telegram.ui.ActionBar.m2) u11Var).currentAccount;
                SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(i12);
                if (notificationsSettings2.contains("color_" + sharedPrefKey2)) {
                    i13 = org.telegram.messenger.q.c("color_", sharedPrefKey2, notificationsSettings2, -16776961);
                } else if (DialogObject.isChatDialog(j10)) {
                    i13 = notificationsSettings2.getInt("GroupLed", -16776961);
                } else {
                    i13 = notificationsSettings2.getInt("MessagesLed", -16776961);
                }
                int i19 = 0;
                while (true) {
                    if (i19 < 9) {
                        if (org.telegram.ui.Cells.y8.f23812f[i19] == i13) {
                            i13 = org.telegram.ui.Cells.y8.f23811e[i19];
                        } else {
                            i19++;
                        }
                    }
                }
                y8Var.b(i13, LocaleController.getString(R.string.NotificationsLedColor), false);
                return;
            case 4:
                org.telegram.ui.Cells.k6 k6Var = (org.telegram.ui.Cells.k6) view;
                i14 = ((org.telegram.ui.ActionBar.m2) u11Var).currentAccount;
                SharedPreferences notificationsSettings3 = MessagesController.getNotificationsSettings(i14);
                int c16 = org.telegram.messenger.q.c("popup_", NotificationsController.getSharedPrefKey(j10, j3), notificationsSettings3, 0);
                if (c16 == 0) {
                    if (DialogObject.isChatDialog(j10)) {
                        str = "popupGroup";
                    } else {
                        str = "popupAll";
                    }
                    if (notificationsSettings3.getInt(str, 0) != 0) {
                        c16 = 1;
                    } else {
                        c16 = 2;
                    }
                }
                if (i10 == u11Var.L) {
                    String string14 = LocaleController.getString(R.string.PopupEnabled);
                    if (c16 == 1) {
                        z12 = true;
                    }
                    k6Var.c(string14, z12, true);
                    k6Var.setTag(1);
                    return;
                } else if (i10 == u11Var.M) {
                    String string15 = LocaleController.getString(R.string.PopupDisabled);
                    if (c16 != 2) {
                        z11 = false;
                    }
                    k6Var.c(string15, z11, false);
                    k6Var.setTag(2);
                    return;
                } else {
                    return;
                }
            case 5:
                org.telegram.ui.Cells.wa waVar = (org.telegram.ui.Cells.wa) view;
                if (DialogObject.isUserDialog(j10)) {
                    i16 = ((org.telegram.ui.ActionBar.m2) u11Var).currentAccount;
                    chat = MessagesController.getInstance(i16).getUser(Long.valueOf(j10));
                } else {
                    i15 = ((org.telegram.ui.ActionBar.m2) u11Var).currentAccount;
                    chat = MessagesController.getInstance(i15).getChat(Long.valueOf(-j10));
                }
                waVar.a(chat, null);
                return;
            case 6:
                org.telegram.ui.Cells.b7 b7Var = (org.telegram.ui.Cells.b7) view;
                if (i10 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i10 >= u11Var.Y - 1) {
                    z11 = false;
                }
                if (b7Var.f21879c != z10 || b7Var.d != z11) {
                    b7Var.f21879c = z10;
                    b7Var.d = z11;
                    int i20 = b7Var.f21878b;
                    if (i20 == 0) {
                        b7Var.setBackground(null);
                        return;
                    } else {
                        b7Var.setBackgroundColor(i20);
                        return;
                    }
                }
                return;
            case 7:
                org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                i17 = ((org.telegram.ui.ActionBar.m2) u11Var).currentAccount;
                SharedPreferences notificationsSettings4 = MessagesController.getNotificationsSettings(i17);
                if (i10 == u11Var.f42357y) {
                    w8Var.f(LocaleController.getString(R.string.Notifications), u11Var.f42352n, true);
                    return;
                } else if (i10 == u11Var.E) {
                    String sharedPrefKey3 = NotificationsController.getSharedPrefKey(j10, j3);
                    w8Var.f(LocaleController.getString(R.string.MessagePreview), notificationsSettings4.getBoolean("content_preview_" + sharedPrefKey3, true), true);
                    return;
                } else if (i10 == u11Var.O) {
                    String i21 = sc.v.i("stories_", NotificationsController.getSharedPrefKey(j10, j3));
                    if (u11Var.Z || (notificationsSettings4.contains("EnableAllStories") && notificationsSettings4.getBoolean("EnableAllStories", true))) {
                        z12 = true;
                    }
                    w8Var.f(LocaleController.getString(R.string.StoriesSoundEnabled), notificationsSettings4.getBoolean(i21, z12), true);
                    return;
                } else {
                    return;
                }
            default:
                return;
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View m4Var;
        u11 u11Var = this.d;
        org.telegram.ui.ActionBar.d6 d6Var = u11Var.d;
        Context context = this.f41600c;
        switch (i10) {
            case 0:
                m4Var = new org.telegram.ui.Cells.m4(context, d6Var);
                m4Var.setBackgroundColor(u11Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20822d6));
                break;
            case 1:
                m4Var = new org.telegram.ui.Cells.ca(context, 0, d6Var);
                m4Var.setBackgroundColor(u11Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20822d6));
                break;
            case 2:
                m4Var = new org.telegram.ui.Cells.e9(context, d6Var);
                break;
            case 3:
                m4Var = new org.telegram.ui.Cells.y8(context, d6Var);
                m4Var.setBackgroundColor(u11Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20822d6));
                break;
            case 4:
                m4Var = new org.telegram.ui.Cells.k6(context, d6Var);
                m4Var.setBackgroundColor(u11Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20822d6));
                break;
            case 5:
                m4Var = new org.telegram.ui.Cells.wa(context, d6Var);
                m4Var.setBackgroundColor(u11Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20822d6));
                break;
            case 6:
                m4Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                break;
            default:
                m4Var = new org.telegram.ui.Cells.w8(context, d6Var);
                m4Var.setBackgroundColor(u11Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20822d6));
                break;
        }
        return com.google.android.gms.internal.vision.e2.k(m4Var, m4Var, -1, -2);
    }

    @Override
    public final void y(s4.d1 d1Var) {
        int i10 = d1Var.f47786f;
        View view = d1Var.f47782a;
        u11 u11Var = this.d;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 7) {
                                return;
                            }
                            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                            if (d1Var.b() == u11Var.E) {
                                w8Var.e(null, u11Var.f42352n);
                                return;
                            } else if (d1Var.b() == u11Var.O) {
                                w8Var.e(null, u11Var.f42352n);
                                return;
                            } else {
                                w8Var.e(null, true);
                                return;
                            }
                        }
                        ((org.telegram.ui.Cells.k6) view).b(null, u11Var.f42352n);
                        return;
                    }
                    ((org.telegram.ui.Cells.y8) view).a(null, u11Var.f42352n);
                    return;
                }
                ((org.telegram.ui.Cells.e9) view).c(null, u11Var.f42352n);
                return;
            }
            org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) view;
            if (d1Var.b() == u11Var.W) {
                caVar.a(null, true);
                return;
            } else {
                caVar.a(null, u11Var.f42352n);
                return;
            }
        }
        ((org.telegram.ui.Cells.m4) view).a(null, u11Var.f42352n);
    }
}
