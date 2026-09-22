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
public final class v11 extends org.telegram.ui.Components.kl0 {
    public final Context f38344c;
    public final x11 d;

    public v11(x11 x11Var, Context context) {
        this.d = x11Var;
        this.f38344c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        x11 x11Var = this.d;
        if (b10 == x11Var.E) {
            return x11Var.f39467n;
        }
        if (c1Var.b() == x11Var.W) {
            return true;
        }
        switch (c1Var.f42674f) {
            case 0:
            case 2:
            case 5:
            case 6:
                return false;
            case 1:
            case 3:
            case 4:
                return x11Var.f39467n;
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
        x11 x11Var = this.d;
        if (i10 == x11Var.v || i10 == x11Var.K || i10 == x11Var.T || i10 == x11Var.P) {
            return 0;
        }
        if (i10 != x11Var.F && i10 != x11Var.G && i10 != x11Var.I && i10 != x11Var.H && i10 != x11Var.Q && i10 != x11Var.R && i10 != x11Var.W) {
            if (i10 != x11Var.N && i10 != x11Var.V && i10 != x11Var.J && i10 != x11Var.S) {
                if (i10 == x11Var.U) {
                    return 3;
                }
                if (i10 != x11Var.L && i10 != x11Var.M) {
                    if (i10 == x11Var.f39470w) {
                        return 5;
                    }
                    if (i10 != x11Var.f39471x && i10 != x11Var.X) {
                        if (i10 != x11Var.f39472y && i10 != x11Var.E && i10 != x11Var.O) {
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
    public final void v(s4.c1 c1Var, int i10) {
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
        x11 x11Var = this.d;
        long j3 = x11Var.f39466f;
        long j10 = x11Var.e;
        int i18 = c1Var.f42674f;
        View view = c1Var.f42671a;
        boolean z11 = true;
        boolean z12 = false;
        switch (i18) {
            case 0:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (i10 == x11Var.v) {
                    m4Var.setText(LocaleController.getString(R.string.General));
                    return;
                } else if (i10 == x11Var.K) {
                    m4Var.setText(LocaleController.getString(R.string.ProfilePopupNotification));
                    return;
                } else if (i10 == x11Var.T) {
                    m4Var.setText(LocaleController.getString(R.string.NotificationsLed));
                    return;
                } else if (i10 == x11Var.P) {
                    m4Var.setText(LocaleController.getString(R.string.VoipNotificationSettings));
                    return;
                } else {
                    return;
                }
            case 1:
                org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) view;
                String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, j3);
                i11 = ((org.telegram.ui.ActionBar.n2) x11Var).currentAccount;
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i11);
                if (i10 == x11Var.W) {
                    eaVar.b(LocaleController.getString(R.string.ResetCustomNotifications), false);
                    eaVar.setTextColor(x11Var.getThemedColor(org.telegram.ui.ActionBar.i6.f19071q7));
                    return;
                }
                eaVar.setTextColor(x11Var.getThemedColor(org.telegram.ui.ActionBar.i6.G6));
                if (i10 == x11Var.F) {
                    String string = notificationsSettings.getString(org.telegram.ui.Cells.q3.i("sound_", sharedPrefKey), LocaleController.getString(R.string.SoundDefault));
                    long j11 = notificationsSettings.getLong("sound_document_id_" + sharedPrefKey, 0L);
                    if (j11 != 0) {
                        TLRPC.Document c10 = x11Var.getMediaDataController().ringtoneDataStore.c(j11);
                        if (c10 == null) {
                            string = LocaleController.getString(R.string.CustomSound);
                        } else {
                            string = yk0.a0(c10, c10.file_name_fixed);
                        }
                    } else if (string.equals("NoSound")) {
                        string = LocaleController.getString(R.string.NoSound);
                    } else if (string.equals("Default")) {
                        string = LocaleController.getString(R.string.SoundDefault);
                    }
                    eaVar.c(LocaleController.getString(R.string.Sound), string, false, true);
                    return;
                } else if (i10 == x11Var.Q) {
                    String string2 = notificationsSettings.getString(org.telegram.ui.Cells.q3.i("ringtone_", sharedPrefKey), LocaleController.getString(R.string.DefaultRingtone));
                    if (string2.equals("NoSound")) {
                        string2 = LocaleController.getString(R.string.NoSound);
                    }
                    eaVar.c(LocaleController.getString(R.string.VoipSettingsRingtone), string2, false, false);
                    return;
                } else if (i10 == x11Var.G) {
                    int c11 = org.telegram.messenger.y0.c("vibrate_", sharedPrefKey, notificationsSettings, 0);
                    if (c11 != 0 && c11 != 4) {
                        if (c11 == 1) {
                            String string3 = LocaleController.getString(R.string.Vibrate);
                            String string4 = LocaleController.getString(R.string.Short);
                            if (x11Var.H == -1 && x11Var.I == -1) {
                                z11 = false;
                            }
                            eaVar.c(string3, string4, false, z11);
                            return;
                        } else if (c11 == 2) {
                            String string5 = LocaleController.getString(R.string.Vibrate);
                            String string6 = LocaleController.getString(R.string.VibrationDisabled);
                            if (x11Var.H == -1 && x11Var.I == -1) {
                                z11 = false;
                            }
                            eaVar.c(string5, string6, false, z11);
                            return;
                        } else if (c11 == 3) {
                            String string7 = LocaleController.getString(R.string.Vibrate);
                            String string8 = LocaleController.getString(R.string.Long);
                            if (x11Var.H == -1 && x11Var.I == -1) {
                                z11 = false;
                            }
                            eaVar.c(string7, string8, false, z11);
                            return;
                        } else {
                            return;
                        }
                    }
                    String string9 = LocaleController.getString(R.string.Vibrate);
                    String string10 = LocaleController.getString(R.string.VibrationDefault);
                    if (x11Var.H == -1 && x11Var.I == -1) {
                        z11 = false;
                    }
                    eaVar.c(string9, string10, false, z11);
                    return;
                } else if (i10 == x11Var.I) {
                    int c12 = org.telegram.messenger.y0.c("priority_", sharedPrefKey, notificationsSettings, 3);
                    if (c12 == 0) {
                        eaVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityHigh), false, false);
                        return;
                    } else if (c12 != 1 && c12 != 2) {
                        if (c12 == 3) {
                            eaVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPrioritySettings), false, false);
                            return;
                        } else if (c12 == 4) {
                            eaVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityLow), false, false);
                            return;
                        } else if (c12 == 5) {
                            eaVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityMedium), false, false);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        eaVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityUrgent), false, false);
                        return;
                    }
                } else if (i10 == x11Var.H) {
                    int c13 = org.telegram.messenger.y0.c("smart_max_count_", sharedPrefKey, notificationsSettings, 2);
                    int c14 = org.telegram.messenger.y0.c("smart_delay_", sharedPrefKey, notificationsSettings, 180);
                    if (c13 == 0) {
                        String string11 = LocaleController.getString(R.string.SmartNotifications);
                        String string12 = LocaleController.getString(R.string.SmartNotificationsDisabled);
                        if (x11Var.I == -1) {
                            z11 = false;
                        }
                        eaVar.c(string11, string12, false, z11);
                        return;
                    }
                    String formatPluralString = LocaleController.formatPluralString("Minutes", c14 / 60, new Object[0]);
                    String string13 = LocaleController.getString(R.string.SmartNotifications);
                    String formatString = LocaleController.formatString("SmartNotificationsInfo", R.string.SmartNotificationsInfo, Integer.valueOf(c13), formatPluralString);
                    if (x11Var.I == -1) {
                        z11 = false;
                    }
                    eaVar.c(string13, formatString, false, z11);
                    return;
                } else if (i10 == x11Var.R) {
                    int c15 = org.telegram.messenger.y0.c("calls_vibrate_", sharedPrefKey, notificationsSettings, 0);
                    if (c15 != 0 && c15 != 4) {
                        if (c15 == 1) {
                            eaVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.Short), false, true);
                            return;
                        } else if (c15 == 2) {
                            eaVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.VibrationDisabled), false, true);
                            return;
                        } else if (c15 == 3) {
                            eaVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.Long), false, true);
                            return;
                        } else {
                            return;
                        }
                    }
                    eaVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.VibrationDefault), false, true);
                    return;
                } else {
                    return;
                }
            case 2:
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                e9Var.setFixedSize(0);
                if (i10 == x11Var.N) {
                    e9Var.setText(LocaleController.getString(R.string.ProfilePopupNotificationInfo));
                    return;
                } else if (i10 == x11Var.V) {
                    e9Var.setText(LocaleController.getString(R.string.NotificationsLedInfo));
                    return;
                } else if (i10 == x11Var.J) {
                    if (x11Var.I == -1) {
                        e9Var.setText("");
                        return;
                    } else {
                        e9Var.setText(LocaleController.getString(R.string.PriorityInfo));
                        return;
                    }
                } else if (i10 == x11Var.S) {
                    e9Var.setText(LocaleController.getString(R.string.VoipRingtoneInfo));
                    return;
                } else {
                    return;
                }
            case 3:
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                String sharedPrefKey2 = NotificationsController.getSharedPrefKey(j10, j3);
                i12 = ((org.telegram.ui.ActionBar.n2) x11Var).currentAccount;
                SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(i12);
                if (notificationsSettings2.contains("color_" + sharedPrefKey2)) {
                    i13 = org.telegram.messenger.y0.c("color_", sharedPrefKey2, notificationsSettings2, -16776961);
                } else if (DialogObject.isChatDialog(j10)) {
                    i13 = notificationsSettings2.getInt("GroupLed", -16776961);
                } else {
                    i13 = notificationsSettings2.getInt("MessagesLed", -16776961);
                }
                int i19 = 0;
                while (true) {
                    if (i19 < 9) {
                        if (org.telegram.ui.Cells.y8.f21660f[i19] == i13) {
                            i13 = org.telegram.ui.Cells.y8.e[i19];
                        } else {
                            i19++;
                        }
                    }
                }
                y8Var.b(i13, LocaleController.getString(R.string.NotificationsLedColor), false);
                return;
            case 4:
                org.telegram.ui.Cells.k6 k6Var = (org.telegram.ui.Cells.k6) view;
                i14 = ((org.telegram.ui.ActionBar.n2) x11Var).currentAccount;
                SharedPreferences notificationsSettings3 = MessagesController.getNotificationsSettings(i14);
                int c16 = org.telegram.messenger.y0.c("popup_", NotificationsController.getSharedPrefKey(j10, j3), notificationsSettings3, 0);
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
                if (i10 == x11Var.L) {
                    String string14 = LocaleController.getString(R.string.PopupEnabled);
                    if (c16 == 1) {
                        z12 = true;
                    }
                    k6Var.c(string14, z12, true);
                    k6Var.setTag(1);
                    return;
                } else if (i10 == x11Var.M) {
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
                org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) view;
                if (DialogObject.isUserDialog(j10)) {
                    i16 = ((org.telegram.ui.ActionBar.n2) x11Var).currentAccount;
                    chat = MessagesController.getInstance(i16).getUser(Long.valueOf(j10));
                } else {
                    i15 = ((org.telegram.ui.ActionBar.n2) x11Var).currentAccount;
                    chat = MessagesController.getInstance(i15).getChat(Long.valueOf(-j10));
                }
                zaVar.a(chat, null);
                return;
            case 6:
                org.telegram.ui.Cells.a7 a7Var = (org.telegram.ui.Cells.a7) view;
                if (i10 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i10 >= x11Var.Y - 1) {
                    z11 = false;
                }
                if (a7Var.f19789c != z10 || a7Var.d != z11) {
                    a7Var.f19789c = z10;
                    a7Var.d = z11;
                    int i20 = a7Var.f19788b;
                    if (i20 == 0) {
                        a7Var.setBackground(null);
                        return;
                    } else {
                        a7Var.setBackgroundColor(i20);
                        return;
                    }
                }
                return;
            case 7:
                org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                i17 = ((org.telegram.ui.ActionBar.n2) x11Var).currentAccount;
                SharedPreferences notificationsSettings4 = MessagesController.getNotificationsSettings(i17);
                if (i10 == x11Var.f39472y) {
                    w8Var.f(LocaleController.getString(R.string.Notifications), x11Var.f39467n, true);
                    return;
                } else if (i10 == x11Var.E) {
                    String sharedPrefKey3 = NotificationsController.getSharedPrefKey(j10, j3);
                    String string16 = LocaleController.getString(R.string.MessagePreview);
                    w8Var.f(string16, notificationsSettings4.getBoolean("content_preview_" + sharedPrefKey3, true), true);
                    return;
                } else if (i10 == x11Var.O) {
                    String i21 = org.telegram.ui.Cells.q3.i("stories_", NotificationsController.getSharedPrefKey(j10, j3));
                    if (x11Var.Z || (notificationsSettings4.contains("EnableAllStories") && notificationsSettings4.getBoolean("EnableAllStories", true))) {
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
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View m4Var;
        x11 x11Var = this.d;
        org.telegram.ui.ActionBar.e6 e6Var = x11Var.d;
        Context context = this.f38344c;
        switch (i10) {
            case 0:
                m4Var = new org.telegram.ui.Cells.m4(context, e6Var);
                m4Var.setBackgroundColor(x11Var.getThemedColor(org.telegram.ui.ActionBar.i6.f18834d6));
                break;
            case 1:
                m4Var = new org.telegram.ui.Cells.ea(context, 0, e6Var);
                m4Var.setBackgroundColor(x11Var.getThemedColor(org.telegram.ui.ActionBar.i6.f18834d6));
                break;
            case 2:
                m4Var = new org.telegram.ui.Cells.e9(context, e6Var);
                break;
            case 3:
                m4Var = new org.telegram.ui.Cells.y8(context, e6Var);
                m4Var.setBackgroundColor(x11Var.getThemedColor(org.telegram.ui.ActionBar.i6.f18834d6));
                break;
            case 4:
                m4Var = new org.telegram.ui.Cells.k6(context, e6Var);
                m4Var.setBackgroundColor(x11Var.getThemedColor(org.telegram.ui.ActionBar.i6.f18834d6));
                break;
            case 5:
                m4Var = new org.telegram.ui.Cells.za(context, e6Var);
                m4Var.setBackgroundColor(x11Var.getThemedColor(org.telegram.ui.ActionBar.i6.f18834d6));
                break;
            case 6:
                m4Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.q3) null);
                break;
            default:
                m4Var = new org.telegram.ui.Cells.w8(context, e6Var);
                m4Var.setBackgroundColor(x11Var.getThemedColor(org.telegram.ui.ActionBar.i6.f18834d6));
                break;
        }
        return com.google.android.gms.internal.vision.e2.k(m4Var, m4Var, -1, -2);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        int i10 = c1Var.f42674f;
        View view = c1Var.f42671a;
        x11 x11Var = this.d;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 7) {
                                return;
                            }
                            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                            if (c1Var.b() == x11Var.E) {
                                w8Var.e(null, x11Var.f39467n);
                                return;
                            } else if (c1Var.b() == x11Var.O) {
                                w8Var.e(null, x11Var.f39467n);
                                return;
                            } else {
                                w8Var.e(null, true);
                                return;
                            }
                        }
                        ((org.telegram.ui.Cells.k6) view).b(null, x11Var.f39467n);
                        return;
                    }
                    ((org.telegram.ui.Cells.y8) view).a(null, x11Var.f39467n);
                    return;
                }
                ((org.telegram.ui.Cells.e9) view).c(null, x11Var.f39467n);
                return;
            }
            org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) view;
            if (c1Var.b() == x11Var.W) {
                eaVar.a(null, true);
                return;
            } else {
                eaVar.a(null, x11Var.f39467n);
                return;
            }
        }
        ((org.telegram.ui.Cells.m4) view).a(null, x11Var.f39467n);
    }
}
