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
public final class x01 extends org.telegram.ui.Components.im0 {
    public final Context f42992c;
    public final z01 d;

    public x01(z01 z01Var, Context context) {
        this.d = z01Var;
        this.f42992c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int b10 = b1Var.b();
        z01 z01Var = this.d;
        if (b10 == z01Var.E) {
            return z01Var.f43595n;
        }
        if (b1Var.b() == z01Var.W) {
            return true;
        }
        switch (b1Var.f45924f) {
            case 0:
            case 2:
            case 5:
            case 6:
                return false;
            case 1:
            case 3:
            case 4:
                return z01Var.f43595n;
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
        z01 z01Var = this.d;
        if (i10 == z01Var.v || i10 == z01Var.K || i10 == z01Var.T || i10 == z01Var.P) {
            return 0;
        }
        if (i10 != z01Var.F && i10 != z01Var.G && i10 != z01Var.I && i10 != z01Var.H && i10 != z01Var.Q && i10 != z01Var.R && i10 != z01Var.W) {
            if (i10 != z01Var.N && i10 != z01Var.V && i10 != z01Var.J && i10 != z01Var.S) {
                if (i10 == z01Var.U) {
                    return 3;
                }
                if (i10 != z01Var.L && i10 != z01Var.M) {
                    if (i10 == z01Var.f43598w) {
                        return 5;
                    }
                    if (i10 != z01Var.f43599x && i10 != z01Var.X) {
                        if (i10 != z01Var.f43600y && i10 != z01Var.E && i10 != z01Var.O) {
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
    public final void v(s4.b1 b1Var, int i10) {
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
        z01 z01Var = this.d;
        long j10 = z01Var.f43594f;
        long j11 = z01Var.e;
        int i18 = b1Var.f45924f;
        View view = b1Var.f45921a;
        boolean z11 = true;
        boolean z12 = false;
        switch (i18) {
            case 0:
                org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                if (i10 == z01Var.v) {
                    l4Var.setText(LocaleController.getString(R.string.General));
                    return;
                } else if (i10 == z01Var.K) {
                    l4Var.setText(LocaleController.getString(R.string.ProfilePopupNotification));
                    return;
                } else if (i10 == z01Var.T) {
                    l4Var.setText(LocaleController.getString(R.string.NotificationsLed));
                    return;
                } else if (i10 == z01Var.P) {
                    l4Var.setText(LocaleController.getString(R.string.VoipNotificationSettings));
                    return;
                } else {
                    return;
                }
            case 1:
                org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) view;
                String sharedPrefKey = NotificationsController.getSharedPrefKey(j11, j10);
                i11 = ((org.telegram.ui.ActionBar.n2) z01Var).currentAccount;
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i11);
                if (i10 == z01Var.W) {
                    baVar.b(LocaleController.getString(R.string.ResetCustomNotifications), false);
                    baVar.setTextColor(z01Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21232q7));
                    return;
                }
                baVar.setTextColor(z01Var.getThemedColor(org.telegram.ui.ActionBar.h6.G6));
                if (i10 == z01Var.F) {
                    String string = notificationsSettings.getString(r4.c.h("sound_", sharedPrefKey), LocaleController.getString(R.string.SoundDefault));
                    long j12 = notificationsSettings.getLong("sound_document_id_" + sharedPrefKey, 0L);
                    if (j12 != 0) {
                        TLRPC.Document c10 = z01Var.getMediaDataController().ringtoneDataStore.c(j12);
                        if (c10 == null) {
                            string = LocaleController.getString(R.string.CustomSound);
                        } else {
                            string = kk0.a0(c10, c10.file_name_fixed);
                        }
                    } else if (string.equals("NoSound")) {
                        string = LocaleController.getString(R.string.NoSound);
                    } else if (string.equals("Default")) {
                        string = LocaleController.getString(R.string.SoundDefault);
                    }
                    baVar.c(LocaleController.getString(R.string.Sound), string, false, true);
                    return;
                } else if (i10 == z01Var.Q) {
                    String string2 = notificationsSettings.getString(r4.c.h("ringtone_", sharedPrefKey), LocaleController.getString(R.string.DefaultRingtone));
                    if (string2.equals("NoSound")) {
                        string2 = LocaleController.getString(R.string.NoSound);
                    }
                    baVar.c(LocaleController.getString(R.string.VoipSettingsRingtone), string2, false, false);
                    return;
                } else if (i10 == z01Var.G) {
                    int c11 = org.telegram.messenger.g0.c("vibrate_", sharedPrefKey, notificationsSettings, 0);
                    if (c11 != 0 && c11 != 4) {
                        if (c11 == 1) {
                            String string3 = LocaleController.getString(R.string.Vibrate);
                            String string4 = LocaleController.getString(R.string.Short);
                            if (z01Var.H == -1 && z01Var.I == -1) {
                                z11 = false;
                            }
                            baVar.c(string3, string4, false, z11);
                            return;
                        } else if (c11 == 2) {
                            String string5 = LocaleController.getString(R.string.Vibrate);
                            String string6 = LocaleController.getString(R.string.VibrationDisabled);
                            if (z01Var.H == -1 && z01Var.I == -1) {
                                z11 = false;
                            }
                            baVar.c(string5, string6, false, z11);
                            return;
                        } else if (c11 == 3) {
                            String string7 = LocaleController.getString(R.string.Vibrate);
                            String string8 = LocaleController.getString(R.string.Long);
                            if (z01Var.H == -1 && z01Var.I == -1) {
                                z11 = false;
                            }
                            baVar.c(string7, string8, false, z11);
                            return;
                        } else {
                            return;
                        }
                    }
                    String string9 = LocaleController.getString(R.string.Vibrate);
                    String string10 = LocaleController.getString(R.string.VibrationDefault);
                    if (z01Var.H == -1 && z01Var.I == -1) {
                        z11 = false;
                    }
                    baVar.c(string9, string10, false, z11);
                    return;
                } else if (i10 == z01Var.I) {
                    int c12 = org.telegram.messenger.g0.c("priority_", sharedPrefKey, notificationsSettings, 3);
                    if (c12 == 0) {
                        baVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityHigh), false, false);
                        return;
                    } else if (c12 != 1 && c12 != 2) {
                        if (c12 == 3) {
                            baVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPrioritySettings), false, false);
                            return;
                        } else if (c12 == 4) {
                            baVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityLow), false, false);
                            return;
                        } else if (c12 == 5) {
                            baVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityMedium), false, false);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        baVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityUrgent), false, false);
                        return;
                    }
                } else if (i10 == z01Var.H) {
                    int c13 = org.telegram.messenger.g0.c("smart_max_count_", sharedPrefKey, notificationsSettings, 2);
                    int c14 = org.telegram.messenger.g0.c("smart_delay_", sharedPrefKey, notificationsSettings, 180);
                    if (c13 == 0) {
                        String string11 = LocaleController.getString(R.string.SmartNotifications);
                        String string12 = LocaleController.getString(R.string.SmartNotificationsDisabled);
                        if (z01Var.I == -1) {
                            z11 = false;
                        }
                        baVar.c(string11, string12, false, z11);
                        return;
                    }
                    String formatPluralString = LocaleController.formatPluralString("Minutes", c14 / 60, new Object[0]);
                    String string13 = LocaleController.getString(R.string.SmartNotifications);
                    String formatString = LocaleController.formatString("SmartNotificationsInfo", R.string.SmartNotificationsInfo, Integer.valueOf(c13), formatPluralString);
                    if (z01Var.I == -1) {
                        z11 = false;
                    }
                    baVar.c(string13, formatString, false, z11);
                    return;
                } else if (i10 == z01Var.R) {
                    int c15 = org.telegram.messenger.g0.c("calls_vibrate_", sharedPrefKey, notificationsSettings, 0);
                    if (c15 != 0 && c15 != 4) {
                        if (c15 == 1) {
                            baVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.Short), false, true);
                            return;
                        } else if (c15 == 2) {
                            baVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.VibrationDisabled), false, true);
                            return;
                        } else if (c15 == 3) {
                            baVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.Long), false, true);
                            return;
                        } else {
                            return;
                        }
                    }
                    baVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.VibrationDefault), false, true);
                    return;
                } else {
                    return;
                }
            case 2:
                org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
                d9Var.setFixedSize(0);
                if (i10 == z01Var.N) {
                    d9Var.setText(LocaleController.getString(R.string.ProfilePopupNotificationInfo));
                    return;
                } else if (i10 == z01Var.V) {
                    d9Var.setText(LocaleController.getString(R.string.NotificationsLedInfo));
                    return;
                } else if (i10 == z01Var.J) {
                    if (z01Var.I == -1) {
                        d9Var.setText("");
                        return;
                    } else {
                        d9Var.setText(LocaleController.getString(R.string.PriorityInfo));
                        return;
                    }
                } else if (i10 == z01Var.S) {
                    d9Var.setText(LocaleController.getString(R.string.VoipRingtoneInfo));
                    return;
                } else {
                    return;
                }
            case 3:
                org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
                String sharedPrefKey2 = NotificationsController.getSharedPrefKey(j11, j10);
                i12 = ((org.telegram.ui.ActionBar.n2) z01Var).currentAccount;
                SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(i12);
                if (notificationsSettings2.contains("color_" + sharedPrefKey2)) {
                    i13 = org.telegram.messenger.g0.c("color_", sharedPrefKey2, notificationsSettings2, -16776961);
                } else if (DialogObject.isChatDialog(j11)) {
                    i13 = notificationsSettings2.getInt("GroupLed", -16776961);
                } else {
                    i13 = notificationsSettings2.getInt("MessagesLed", -16776961);
                }
                int i19 = 0;
                while (true) {
                    if (i19 < 9) {
                        if (org.telegram.ui.Cells.x8.f23815f[i19] == i13) {
                            i13 = org.telegram.ui.Cells.x8.e[i19];
                        } else {
                            i19++;
                        }
                    }
                }
                x8Var.b(i13, LocaleController.getString(R.string.NotificationsLedColor), false);
                return;
            case 4:
                org.telegram.ui.Cells.j6 j6Var = (org.telegram.ui.Cells.j6) view;
                i14 = ((org.telegram.ui.ActionBar.n2) z01Var).currentAccount;
                SharedPreferences notificationsSettings3 = MessagesController.getNotificationsSettings(i14);
                int c16 = org.telegram.messenger.g0.c("popup_", NotificationsController.getSharedPrefKey(j11, j10), notificationsSettings3, 0);
                if (c16 == 0) {
                    if (DialogObject.isChatDialog(j11)) {
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
                if (i10 == z01Var.L) {
                    String string14 = LocaleController.getString(R.string.PopupEnabled);
                    if (c16 == 1) {
                        z12 = true;
                    }
                    j6Var.c(string14, z12, true);
                    j6Var.setTag(1);
                    return;
                } else if (i10 == z01Var.M) {
                    String string15 = LocaleController.getString(R.string.PopupDisabled);
                    if (c16 != 2) {
                        z11 = false;
                    }
                    j6Var.c(string15, z11, false);
                    j6Var.setTag(2);
                    return;
                } else {
                    return;
                }
            case 5:
                org.telegram.ui.Cells.ua uaVar = (org.telegram.ui.Cells.ua) view;
                if (DialogObject.isUserDialog(j11)) {
                    i16 = ((org.telegram.ui.ActionBar.n2) z01Var).currentAccount;
                    chat = MessagesController.getInstance(i16).getUser(Long.valueOf(j11));
                } else {
                    i15 = ((org.telegram.ui.ActionBar.n2) z01Var).currentAccount;
                    chat = MessagesController.getInstance(i15).getChat(Long.valueOf(-j11));
                }
                uaVar.a(chat, null);
                return;
            case 6:
                org.telegram.ui.Cells.z6 z6Var = (org.telegram.ui.Cells.z6) view;
                if (i10 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i10 >= z01Var.Y - 1) {
                    z11 = false;
                }
                if (z6Var.f23882c != z10 || z6Var.d != z11) {
                    z6Var.f23882c = z10;
                    z6Var.d = z11;
                    int i20 = z6Var.f23881b;
                    if (i20 == 0) {
                        z6Var.setBackground(null);
                        return;
                    } else {
                        z6Var.setBackgroundColor(i20);
                        return;
                    }
                }
                return;
            case 7:
                org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
                i17 = ((org.telegram.ui.ActionBar.n2) z01Var).currentAccount;
                SharedPreferences notificationsSettings4 = MessagesController.getNotificationsSettings(i17);
                if (i10 == z01Var.f43600y) {
                    v8Var.f(LocaleController.getString(R.string.Notifications), z01Var.f43595n, true);
                    return;
                } else if (i10 == z01Var.E) {
                    String sharedPrefKey3 = NotificationsController.getSharedPrefKey(j11, j10);
                    v8Var.f(LocaleController.getString(R.string.MessagePreview), notificationsSettings4.getBoolean("content_preview_" + sharedPrefKey3, true), true);
                    return;
                } else if (i10 == z01Var.O) {
                    String h = r4.c.h("stories_", NotificationsController.getSharedPrefKey(j11, j10));
                    if (z01Var.Z || (notificationsSettings4.contains("EnableAllStories") && notificationsSettings4.getBoolean("EnableAllStories", true))) {
                        z12 = true;
                    }
                    v8Var.f(LocaleController.getString(R.string.StoriesSoundEnabled), notificationsSettings4.getBoolean(h, z12), true);
                    return;
                } else {
                    return;
                }
            default:
                return;
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View l4Var;
        z01 z01Var = this.d;
        org.telegram.ui.ActionBar.d6 d6Var = z01Var.d;
        Context context = this.f42992c;
        switch (i10) {
            case 0:
                l4Var = new org.telegram.ui.Cells.l4(context, d6Var);
                l4Var.setBackgroundColor(z01Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20994d6));
                break;
            case 1:
                l4Var = new org.telegram.ui.Cells.ba(context, 0, d6Var);
                l4Var.setBackgroundColor(z01Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20994d6));
                break;
            case 2:
                l4Var = new org.telegram.ui.Cells.d9(context, d6Var);
                break;
            case 3:
                l4Var = new org.telegram.ui.Cells.x8(context, d6Var);
                l4Var.setBackgroundColor(z01Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20994d6));
                break;
            case 4:
                l4Var = new org.telegram.ui.Cells.j6(context, d6Var);
                l4Var.setBackgroundColor(z01Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20994d6));
                break;
            case 5:
                l4Var = new org.telegram.ui.Cells.ua(context, d6Var);
                l4Var.setBackgroundColor(z01Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20994d6));
                break;
            case 6:
                l4Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c1) null);
                break;
            default:
                l4Var = new org.telegram.ui.Cells.v8(context, d6Var);
                l4Var.setBackgroundColor(z01Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20994d6));
                break;
        }
        return com.google.android.gms.internal.play_billing.k3.l(l4Var, l4Var, -1, -2);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        int i10 = b1Var.f45924f;
        View view = b1Var.f45921a;
        z01 z01Var = this.d;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 7) {
                                return;
                            }
                            org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
                            if (b1Var.b() == z01Var.E) {
                                v8Var.e(null, z01Var.f43595n);
                                return;
                            } else if (b1Var.b() == z01Var.O) {
                                v8Var.e(null, z01Var.f43595n);
                                return;
                            } else {
                                v8Var.e(null, true);
                                return;
                            }
                        }
                        ((org.telegram.ui.Cells.j6) view).b(null, z01Var.f43595n);
                        return;
                    }
                    ((org.telegram.ui.Cells.x8) view).a(null, z01Var.f43595n);
                    return;
                }
                ((org.telegram.ui.Cells.d9) view).c(null, z01Var.f43595n);
                return;
            }
            org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) view;
            if (b1Var.b() == z01Var.W) {
                baVar.a(null, true);
                return;
            } else {
                baVar.a(null, z01Var.f43595n);
                return;
            }
        }
        ((org.telegram.ui.Cells.l4) view).a(null, z01Var.f43595n);
    }
}
