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
import org.telegram.tgnet.TLRPC;

public final class r01 extends org.telegram.ui.Components.yk0 {

    public final Context f41778c;
    public final t01 d;

    public r01(t01 t01Var, Context context) {
        this.d = t01Var;
        this.f41778c = context;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        int iB = o1Var.b();
        t01 t01Var = this.d;
        if (iB == t01Var.A) {
            return t01Var.f42744n;
        }
        if (o1Var.b() == t01Var.S) {
            return true;
        }
        switch (o1Var.f5793f) {
            case 0:
            case 2:
            case 5:
            case 6:
                return false;
            case 1:
            case 3:
            case 4:
                return t01Var.f42744n;
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
        if (i10 == t01Var.B || i10 == t01Var.C || i10 == t01Var.E || i10 == t01Var.D || i10 == t01Var.M || i10 == t01Var.N || i10 == t01Var.S) {
            return 1;
        }
        if (i10 == t01Var.J || i10 == t01Var.R || i10 == t01Var.F || i10 == t01Var.O) {
            return 2;
        }
        if (i10 == t01Var.Q) {
            return 3;
        }
        if (i10 == t01Var.H || i10 == t01Var.I) {
            return 4;
        }
        if (i10 == t01Var.f42747w) {
            return 5;
        }
        if (i10 == t01Var.f42748x || i10 == t01Var.T) {
            return 6;
        }
        return (i10 == t01Var.f42749y || i10 == t01Var.A || i10 == t01Var.K) ? 7 : 0;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        t01 t01Var = this.d;
        long j10 = t01Var.f42743f;
        long j11 = t01Var.f42742e;
        int i11 = o1Var.f5793f;
        View view = o1Var.f5789a;
        boolean z10 = true;
        boolean z11 = false;
        switch (i11) {
            case 0:
                org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
                if (i10 == t01Var.v) {
                    j4Var.setText(LocaleController.getString(R.string.General));
                } else if (i10 == t01Var.G) {
                    j4Var.setText(LocaleController.getString(R.string.ProfilePopupNotification));
                } else if (i10 == t01Var.P) {
                    j4Var.setText(LocaleController.getString(R.string.NotificationsLed));
                } else if (i10 == t01Var.L) {
                    j4Var.setText(LocaleController.getString(R.string.VoipNotificationSettings));
                }
                break;
            case 1:
                org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
                String sharedPrefKey = NotificationsController.getSharedPrefKey(j11, j10);
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(((org.telegram.ui.ActionBar.n2) t01Var).currentAccount);
                if (i10 == t01Var.S) {
                    x9Var.b(LocaleController.getString(R.string.ResetCustomNotifications), false);
                    x9Var.setTextColor(t01Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23284q7));
                } else {
                    x9Var.setTextColor(t01Var.getThemedColor(org.telegram.ui.ActionBar.g6.G6));
                    if (i10 == t01Var.B) {
                        String string = notificationsSettings.getString(s3.c.e("sound_", sharedPrefKey), LocaleController.getString(R.string.SoundDefault));
                        long j12 = notificationsSettings.getLong("sound_document_id_" + sharedPrefKey, 0L);
                        if (j12 != 0) {
                            TLRPC.Document documentC = t01Var.getMediaDataController().ringtoneDataStore.c(j12);
                            string = documentC == null ? LocaleController.getString(R.string.CustomSound) : kk0.a0(documentC, documentC.file_name_fixed);
                        } else if (string.equals("NoSound")) {
                            string = LocaleController.getString(R.string.NoSound);
                        } else if (string.equals("Default")) {
                            string = LocaleController.getString(R.string.SoundDefault);
                        }
                        x9Var.c(LocaleController.getString(R.string.Sound), string, false, true);
                    } else if (i10 == t01Var.M) {
                        String string2 = notificationsSettings.getString(s3.c.e("ringtone_", sharedPrefKey), LocaleController.getString(R.string.DefaultRingtone));
                        if (string2.equals("NoSound")) {
                            string2 = LocaleController.getString(R.string.NoSound);
                        }
                        x9Var.c(LocaleController.getString(R.string.VoipSettingsRingtone), string2, false, false);
                    } else if (i10 == t01Var.C) {
                        int iC = org.telegram.messenger.y1.c("vibrate_", sharedPrefKey, notificationsSettings, 0);
                        if (iC == 0 || iC == 4) {
                            String string3 = LocaleController.getString(R.string.Vibrate);
                            String string4 = LocaleController.getString(R.string.VibrationDefault);
                            if (t01Var.D == -1 && t01Var.E == -1) {
                                z10 = false;
                            }
                            x9Var.c(string3, string4, false, z10);
                        } else if (iC == 1) {
                            String string5 = LocaleController.getString(R.string.Vibrate);
                            String string6 = LocaleController.getString(R.string.Short);
                            if (t01Var.D == -1 && t01Var.E == -1) {
                                z10 = false;
                            }
                            x9Var.c(string5, string6, false, z10);
                        } else if (iC == 2) {
                            String string7 = LocaleController.getString(R.string.Vibrate);
                            String string8 = LocaleController.getString(R.string.VibrationDisabled);
                            if (t01Var.D == -1 && t01Var.E == -1) {
                                z10 = false;
                            }
                            x9Var.c(string7, string8, false, z10);
                        } else if (iC == 3) {
                            String string9 = LocaleController.getString(R.string.Vibrate);
                            String string10 = LocaleController.getString(R.string.Long);
                            if (t01Var.D == -1 && t01Var.E == -1) {
                                z10 = false;
                            }
                            x9Var.c(string9, string10, false, z10);
                        }
                    } else if (i10 == t01Var.E) {
                        int iC2 = org.telegram.messenger.y1.c("priority_", sharedPrefKey, notificationsSettings, 3);
                        if (iC2 == 0) {
                            x9Var.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityHigh), false, false);
                        } else if (iC2 == 1 || iC2 == 2) {
                            x9Var.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityUrgent), false, false);
                        } else if (iC2 == 3) {
                            x9Var.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPrioritySettings), false, false);
                        } else if (iC2 == 4) {
                            x9Var.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityLow), false, false);
                        } else if (iC2 == 5) {
                            x9Var.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityMedium), false, false);
                        }
                    } else if (i10 == t01Var.D) {
                        int iC3 = org.telegram.messenger.y1.c("smart_max_count_", sharedPrefKey, notificationsSettings, 2);
                        int iC4 = org.telegram.messenger.y1.c("smart_delay_", sharedPrefKey, notificationsSettings, 180);
                        if (iC3 == 0) {
                            x9Var.c(LocaleController.getString(R.string.SmartNotifications), LocaleController.getString(R.string.SmartNotificationsDisabled), false, t01Var.E != -1);
                        } else {
                            x9Var.c(LocaleController.getString(R.string.SmartNotifications), LocaleController.formatString("SmartNotificationsInfo", R.string.SmartNotificationsInfo, Integer.valueOf(iC3), LocaleController.formatPluralString("Minutes", iC4 / 60, new Object[0])), false, t01Var.E != -1);
                        }
                    } else if (i10 == t01Var.N) {
                        int iC5 = org.telegram.messenger.y1.c("calls_vibrate_", sharedPrefKey, notificationsSettings, 0);
                        if (iC5 == 0 || iC5 == 4) {
                            x9Var.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.VibrationDefault), false, true);
                        } else if (iC5 == 1) {
                            x9Var.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.Short), false, true);
                        } else if (iC5 == 2) {
                            x9Var.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.VibrationDisabled), false, true);
                        } else if (iC5 == 3) {
                            x9Var.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.Long), false, true);
                        }
                    }
                }
                break;
            case 2:
                org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
                x8Var.setFixedSize(0);
                if (i10 == t01Var.J) {
                    x8Var.setText(LocaleController.getString(R.string.ProfilePopupNotificationInfo));
                } else if (i10 == t01Var.R) {
                    x8Var.setText(LocaleController.getString(R.string.NotificationsLedInfo));
                } else if (i10 == t01Var.F) {
                    if (t01Var.E == -1) {
                        x8Var.setText("");
                    } else {
                        x8Var.setText(LocaleController.getString(R.string.PriorityInfo));
                    }
                } else if (i10 == t01Var.O) {
                    x8Var.setText(LocaleController.getString(R.string.VoipRingtoneInfo));
                }
                break;
            case 3:
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                String sharedPrefKey2 = NotificationsController.getSharedPrefKey(j11, j10);
                SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(((org.telegram.ui.ActionBar.n2) t01Var).currentAccount);
                int iC6 = notificationsSettings2.contains("color_" + sharedPrefKey2) ? org.telegram.messenger.y1.c("color_", sharedPrefKey2, notificationsSettings2, -16776961) : DialogObject.isChatDialog(j11) ? notificationsSettings2.getInt("GroupLed", -16776961) : notificationsSettings2.getInt("MessagesLed", -16776961);
                for (int i12 = 0; i12 < 9; i12++) {
                    if (org.telegram.ui.Cells.r8.f25233f[i12] == iC6) {
                        iC6 = org.telegram.ui.Cells.r8.f25232e[i12];
                        r8Var.b(iC6, LocaleController.getString(R.string.NotificationsLedColor), false);
                    }
                    break;
                }
                r8Var.b(iC6, LocaleController.getString(R.string.NotificationsLedColor), false);
                break;
            case 4:
                org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) view;
                SharedPreferences notificationsSettings3 = MessagesController.getNotificationsSettings(((org.telegram.ui.ActionBar.n2) t01Var).currentAccount);
                int iC7 = org.telegram.messenger.y1.c("popup_", NotificationsController.getSharedPrefKey(j11, j10), notificationsSettings3, 0);
                if (iC7 == 0) {
                    iC7 = notificationsSettings3.getInt(DialogObject.isChatDialog(j11) ? "popupGroup" : "popupAll", 0) != 0 ? 1 : 2;
                }
                if (i10 == t01Var.H) {
                    g6Var.c(LocaleController.getString(R.string.PopupEnabled), iC7 == 1, true);
                    g6Var.setTag(1);
                } else if (i10 == t01Var.I) {
                    g6Var.c(LocaleController.getString(R.string.PopupDisabled), iC7 == 2, false);
                    g6Var.setTag(2);
                }
                break;
            case 5:
                ((org.telegram.ui.Cells.ra) view).a(DialogObject.isUserDialog(j11) ? MessagesController.getInstance(((org.telegram.ui.ActionBar.n2) t01Var).currentAccount).getUser(Long.valueOf(j11)) : MessagesController.getInstance(((org.telegram.ui.ActionBar.n2) t01Var).currentAccount).getChat(Long.valueOf(-j11)), null);
                break;
            case 6:
                org.telegram.ui.Cells.w6 w6Var = (org.telegram.ui.Cells.w6) view;
                boolean z12 = i10 > 0;
                z10 = i10 < t01Var.U - 1;
                if (w6Var.f25853c != z12 || w6Var.d != z10) {
                    w6Var.f25853c = z12;
                    w6Var.d = z10;
                    int i13 = w6Var.f25852b;
                    if (i13 == 0) {
                        w6Var.setBackground(null);
                    } else {
                        w6Var.setBackgroundColor(i13);
                    }
                }
                break;
            case 7:
                org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                SharedPreferences notificationsSettings4 = MessagesController.getNotificationsSettings(((org.telegram.ui.ActionBar.n2) t01Var).currentAccount);
                if (i10 == t01Var.f42749y) {
                    p8Var.f(LocaleController.getString(R.string.Notifications), t01Var.f42744n, true);
                } else if (i10 == t01Var.A) {
                    p8Var.f(LocaleController.getString(R.string.MessagePreview), notificationsSettings4.getBoolean("content_preview_" + NotificationsController.getSharedPrefKey(j11, j10), true), true);
                } else if (i10 == t01Var.K) {
                    String strE = s3.c.e("stories_", NotificationsController.getSharedPrefKey(j11, j10));
                    if (t01Var.V || (notificationsSettings4.contains("EnableAllStories") && notificationsSettings4.getBoolean("EnableAllStories", true))) {
                        z11 = true;
                    }
                    p8Var.f(LocaleController.getString(R.string.StoriesSoundEnabled), notificationsSettings4.getBoolean(strE, z11), true);
                }
                break;
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View j4Var;
        t01 t01Var = this.d;
        org.telegram.ui.ActionBar.c6 c6Var = t01Var.d;
        Context context = this.f41778c;
        switch (i10) {
            case 0:
                j4Var = new org.telegram.ui.Cells.j4(context, c6Var);
                j4Var.setBackgroundColor(t01Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                break;
            case 1:
                j4Var = new org.telegram.ui.Cells.x9(context, 0, c6Var);
                j4Var.setBackgroundColor(t01Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                break;
            case 2:
                j4Var = new org.telegram.ui.Cells.x8(context, c6Var);
                break;
            case 3:
                j4Var = new org.telegram.ui.Cells.r8(context, c6Var);
                j4Var.setBackgroundColor(t01Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                break;
            case 4:
                j4Var = new org.telegram.ui.Cells.g6(context, c6Var);
                j4Var.setBackgroundColor(t01Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                break;
            case 5:
                j4Var = new org.telegram.ui.Cells.ra(context, c6Var);
                j4Var.setBackgroundColor(t01Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                break;
            case 6:
                j4Var = new org.telegram.ui.Cells.w6(context, (org.telegram.messenger.rl) null);
                break;
            default:
                j4Var = new org.telegram.ui.Cells.p8(context, c6Var);
                j4Var.setBackgroundColor(t01Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
                break;
        }
        return org.telegram.ui.Cells.pa.l(j4Var, j4Var, -1, -2);
    }

    @Override
    public final void y(f2.o1 o1Var) {
        int i10 = o1Var.f5793f;
        View view = o1Var.f5789a;
        t01 t01Var = this.d;
        if (i10 == 0) {
            ((org.telegram.ui.Cells.j4) view).a(null, t01Var.f42744n);
            return;
        }
        if (i10 == 1) {
            org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
            if (o1Var.b() == t01Var.S) {
                x9Var.a(null, true);
                return;
            } else {
                x9Var.a(null, t01Var.f42744n);
                return;
            }
        }
        if (i10 == 2) {
            ((org.telegram.ui.Cells.x8) view).c(null, t01Var.f42744n);
            return;
        }
        if (i10 == 3) {
            ((org.telegram.ui.Cells.r8) view).a(null, t01Var.f42744n);
            return;
        }
        if (i10 == 4) {
            ((org.telegram.ui.Cells.g6) view).b(null, t01Var.f42744n);
            return;
        }
        if (i10 != 7) {
            return;
        }
        org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
        if (o1Var.b() == t01Var.A) {
            p8Var.e(null, t01Var.f42744n);
        } else if (o1Var.b() == t01Var.K) {
            p8Var.e(null, t01Var.f42744n);
        } else {
            p8Var.e(null, true);
        }
    }
}
