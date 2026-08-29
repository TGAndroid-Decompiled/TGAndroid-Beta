package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.Switch;
public final class xw0 extends org.telegram.ui.Components.il0 {
    public final Context f44661c;
    public final PrivacySettingsActivity d;

    public xw0(PrivacySettingsActivity privacySettingsActivity, Context context) {
        this.d = privacySettingsActivity;
        this.f44661c = context;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int b10 = n1Var.b();
        PrivacySettingsActivity privacySettingsActivity = this.d;
        i10 = privacySettingsActivity.passcodeRow;
        if (b10 != i10) {
            i11 = privacySettingsActivity.passwordRow;
            if (b10 != i11) {
                i12 = privacySettingsActivity.passkeysRow;
                if (b10 != i12) {
                    i13 = privacySettingsActivity.blockedRow;
                    if (b10 != i13 && b10 != privacySettingsActivity.f35980s) {
                        i14 = privacySettingsActivity.secretWebpageRow;
                        if (b10 != i14) {
                            i15 = privacySettingsActivity.webSessionsRow;
                            if (b10 != i15 && (b10 != privacySettingsActivity.f35978n || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(1))) {
                                i16 = privacySettingsActivity.lastSeenRow;
                                if (b10 != i16 || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(0)) {
                                    i17 = privacySettingsActivity.callsRow;
                                    if (b10 != i17 || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(2)) {
                                        i18 = privacySettingsActivity.profilePhotoRow;
                                        if (b10 != i18 || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(4)) {
                                            i19 = privacySettingsActivity.bioRow;
                                            if (b10 != i19 || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(9)) {
                                                i20 = privacySettingsActivity.musicRow;
                                                if (b10 != i20 || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(14)) {
                                                    i21 = privacySettingsActivity.birthdayRow;
                                                    if (b10 != i21 || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(11)) {
                                                        i22 = privacySettingsActivity.giftsRow;
                                                        if (b10 != i22 || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(12)) {
                                                            i23 = privacySettingsActivity.forwardsRow;
                                                            if (b10 != i23 || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(5)) {
                                                                i24 = privacySettingsActivity.phoneNumberRow;
                                                                if (b10 != i24 || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(6)) {
                                                                    i25 = privacySettingsActivity.voicesRow;
                                                                    if (b10 != i25 || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(8)) {
                                                                        i26 = privacySettingsActivity.noncontactsRow;
                                                                        if (b10 != i26) {
                                                                            i27 = privacySettingsActivity.deleteAccountRow;
                                                                            if (b10 != i27 || privacySettingsActivity.getContactsController().getLoadingDeleteInfo()) {
                                                                                i28 = privacySettingsActivity.newChatsRow;
                                                                                if (b10 != i28 || privacySettingsActivity.getContactsController().getLoadingGlobalSettings()) {
                                                                                    i29 = privacySettingsActivity.emailLoginRow;
                                                                                    if (b10 != i29) {
                                                                                        i30 = privacySettingsActivity.paymentsClearRow;
                                                                                        if (b10 != i30) {
                                                                                            i31 = privacySettingsActivity.secretMapRow;
                                                                                            if (b10 != i31) {
                                                                                                i32 = privacySettingsActivity.contactsSyncRow;
                                                                                                if (b10 != i32 && b10 != privacySettingsActivity.C) {
                                                                                                    i33 = privacySettingsActivity.contactsDeleteRow;
                                                                                                    if (b10 != i33) {
                                                                                                        i34 = privacySettingsActivity.contactsSuggestRow;
                                                                                                        if (b10 != i34) {
                                                                                                            i35 = privacySettingsActivity.autoDeleteMesages;
                                                                                                            if (b10 != i35 && b10 != privacySettingsActivity.D) {
                                                                                                                return false;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override
    public final int h() {
        return this.d.K;
    }

    @Override
    public final int j(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        PrivacySettingsActivity privacySettingsActivity = this.d;
        if (i10 != privacySettingsActivity.C) {
            i11 = privacySettingsActivity.lastSeenRow;
            if (i10 != i11) {
                i12 = privacySettingsActivity.phoneNumberRow;
                if (i10 != i12) {
                    i13 = privacySettingsActivity.deleteAccountRow;
                    if (i10 != i13) {
                        i14 = privacySettingsActivity.webSessionsRow;
                        if (i10 != i14 && i10 != privacySettingsActivity.f35978n) {
                            i15 = privacySettingsActivity.paymentsClearRow;
                            if (i10 != i15) {
                                i16 = privacySettingsActivity.secretMapRow;
                                if (i10 != i16) {
                                    i17 = privacySettingsActivity.contactsDeleteRow;
                                    if (i10 != i17 && i10 != privacySettingsActivity.D) {
                                        if (i10 != privacySettingsActivity.h && i10 != privacySettingsActivity.A && i10 != privacySettingsActivity.f35979r && i10 != privacySettingsActivity.v && i10 != privacySettingsActivity.J && i10 != privacySettingsActivity.E && i10 != privacySettingsActivity.H && i10 != privacySettingsActivity.f35982x) {
                                            if (i10 != 0 && i10 != privacySettingsActivity.f35983y && i10 != privacySettingsActivity.f35977f && i10 != privacySettingsActivity.I && i10 != privacySettingsActivity.B && i10 != privacySettingsActivity.G && i10 != privacySettingsActivity.f35981w) {
                                                i18 = privacySettingsActivity.secretWebpageRow;
                                                if (i10 != i18) {
                                                    i19 = privacySettingsActivity.contactsSyncRow;
                                                    if (i10 != i19) {
                                                        i20 = privacySettingsActivity.contactsSuggestRow;
                                                        if (i10 != i20) {
                                                            i21 = privacySettingsActivity.newChatsRow;
                                                            if (i10 != i21) {
                                                                if (i10 != privacySettingsActivity.F) {
                                                                    i22 = privacySettingsActivity.autoDeleteMesages;
                                                                    if (i10 != i22 && i10 != privacySettingsActivity.f35980s) {
                                                                        i23 = privacySettingsActivity.emailLoginRow;
                                                                        if (i10 != i23) {
                                                                            i24 = privacySettingsActivity.passwordRow;
                                                                            if (i10 != i24) {
                                                                                i25 = privacySettingsActivity.passkeysRow;
                                                                                if (i10 != i25) {
                                                                                    i26 = privacySettingsActivity.passcodeRow;
                                                                                    if (i10 != i26) {
                                                                                        i27 = privacySettingsActivity.blockedRow;
                                                                                        if (i10 == i27) {
                                                                                            return 5;
                                                                                        }
                                                                                        return 0;
                                                                                    }
                                                                                    return 5;
                                                                                }
                                                                                return 5;
                                                                            }
                                                                            return 5;
                                                                        }
                                                                        return 5;
                                                                    }
                                                                    return 5;
                                                                }
                                                                return 4;
                                                            }
                                                            return 3;
                                                        }
                                                        return 3;
                                                    }
                                                    return 3;
                                                }
                                                return 3;
                                            }
                                            return 2;
                                        }
                                        return 1;
                                    }
                                    return 0;
                                }
                                return 0;
                            }
                            return 0;
                        }
                        return 0;
                    }
                    return 0;
                }
                return 0;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        String string;
        boolean z11;
        int i27;
        CharSequence u02;
        int i28;
        boolean z12;
        CharSequence x02;
        boolean z13;
        int i29;
        boolean z14;
        float f9;
        int i30;
        int i31;
        int i32;
        int i33;
        boolean z15;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        String str;
        String format;
        String string2;
        int i40;
        String string3;
        String str2;
        String string4;
        int i41;
        String str3;
        boolean z16;
        String str4;
        String format2;
        String str5;
        String string5;
        String str6;
        int i42 = n1Var.f6436f;
        View view = n1Var.f6432a;
        int i43 = 16;
        String str7 = null;
        boolean z17 = false;
        boolean z18 = true;
        PrivacySettingsActivity privacySettingsActivity = this.d;
        if (i42 != 0) {
            if (i42 != 1) {
                if (i42 != 2) {
                    if (i42 != 3) {
                        if (i42 == 5) {
                            org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                            if (view.getTag() != null && ((Integer) view.getTag()).intValue() == i10) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            view.setTag(Integer.valueOf(i10));
                            m8Var.setPrioritizeTitleOverValue(false);
                            org.telegram.ui.Components.o6 o6Var = m8Var.f24710c;
                            i34 = privacySettingsActivity.autoDeleteMesages;
                            if (i10 == i34) {
                                int globalTTl = privacySettingsActivity.getUserConfig().getGlobalTTl();
                                if (globalTTl == -1) {
                                    str6 = null;
                                    z17 = true;
                                } else {
                                    if (globalTTl > 0) {
                                        string5 = LocaleController.formatTTLString(globalTTl * 60);
                                    } else {
                                        string5 = LocaleController.getString("PasswordOff", R.string.PasswordOff);
                                    }
                                    str6 = string5;
                                }
                                m8Var.s(LocaleController.getString("AutoDeleteMessages", R.string.AutoDeleteMessages), str6, true, R.drawable.msg2_autodelete, true);
                            } else {
                                String str8 = "";
                                if (i10 != privacySettingsActivity.f35980s) {
                                    i35 = privacySettingsActivity.emailLoginRow;
                                    if (i10 != i35) {
                                        i36 = privacySettingsActivity.passwordRow;
                                        if (i10 != i36) {
                                            i37 = privacySettingsActivity.passkeysRow;
                                            if (i10 != i37) {
                                                i38 = privacySettingsActivity.passcodeRow;
                                                if (i10 != i38) {
                                                    i39 = privacySettingsActivity.blockedRow;
                                                    if (i10 == i39) {
                                                        int i44 = privacySettingsActivity.getMessagesController().totalBlockedCount;
                                                        if (i44 == 0) {
                                                            format = LocaleController.getString("BlockedEmpty", R.string.BlockedEmpty);
                                                        } else if (i44 <= 0) {
                                                            str = "";
                                                            z17 = true;
                                                            m8Var.s(LocaleController.getString("BlockedUsers", R.string.BlockedUsers), str, true, R.drawable.msg2_block2, true);
                                                        } else {
                                                            format = String.format(LocaleController.getInstance().getCurrentLocale(), "%d", Integer.valueOf(i44));
                                                        }
                                                        str = format;
                                                        m8Var.s(LocaleController.getString("BlockedUsers", R.string.BlockedUsers), str, true, R.drawable.msg2_block2, true);
                                                    }
                                                } else {
                                                    if (SharedConfig.passcodeHash.length() != 0) {
                                                        string2 = LocaleController.getString(R.string.PasswordOn);
                                                        i40 = R.drawable.msg2_secret;
                                                    } else {
                                                        string2 = LocaleController.getString(R.string.PasswordOff);
                                                        i40 = R.drawable.msg2_secret;
                                                    }
                                                    m8Var.s(LocaleController.getString(R.string.Passcode), string2, true, i40, true);
                                                }
                                            } else {
                                                ArrayList arrayList = privacySettingsActivity.f35976e;
                                                if (arrayList == null) {
                                                    str2 = "";
                                                    z17 = true;
                                                } else {
                                                    if (arrayList.size() == 1 && o6Var.getPaint().measureText(((TL_account.Passkey) privacySettingsActivity.f35976e.get(0)).name) < AndroidUtilities.displaySize.x / 3.0f) {
                                                        string3 = ((TL_account.Passkey) privacySettingsActivity.f35976e.get(0)).name;
                                                    } else if (privacySettingsActivity.f35976e.size() > 0) {
                                                        string3 = privacySettingsActivity.f35976e.size() + "";
                                                    } else {
                                                        string3 = LocaleController.getString(R.string.PasswordOff);
                                                    }
                                                    str2 = string3;
                                                }
                                                m8Var.s(LocaleController.getString(R.string.Passkey), str2, true, R.drawable.msg2_permissions, true);
                                            }
                                        } else {
                                            int i45 = R.drawable.menu_2sv;
                                            TL_account.Password password = privacySettingsActivity.d;
                                            if (password == null) {
                                                i41 = i45;
                                                str3 = "";
                                                z17 = true;
                                            } else {
                                                if (password.has_password) {
                                                    i45 = R.drawable.menu_2sv_on;
                                                    string4 = LocaleController.getString(R.string.PasswordOn);
                                                } else {
                                                    string4 = LocaleController.getString(R.string.PasswordOff);
                                                }
                                                i41 = i45;
                                                str3 = string4;
                                            }
                                            m8Var.s(LocaleController.getString(R.string.TwoStepVerification), str3, true, i41, true);
                                        }
                                    } else {
                                        TL_account.Password password2 = privacySettingsActivity.d;
                                        if (password2 == null) {
                                            z16 = true;
                                            str4 = str8;
                                        } else {
                                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(password2.login_email_pattern);
                                            int indexOf = privacySettingsActivity.d.login_email_pattern.indexOf(42);
                                            int lastIndexOf = privacySettingsActivity.d.login_email_pattern.lastIndexOf(42);
                                            if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                                ?? obj = new Object();
                                                obj.f29024a |= 256;
                                                obj.f29025b = indexOf;
                                                int i46 = lastIndexOf + 1;
                                                obj.f29026c = i46;
                                                valueOf.setSpan(new org.telegram.ui.Components.i01(obj, 0), indexOf, i46, 0);
                                            }
                                            z16 = false;
                                            str4 = valueOf;
                                        }
                                        m8Var.setPrioritizeTitleOverValue(true);
                                        String string6 = LocaleController.getString(R.string.EmailLogin);
                                        int i47 = R.drawable.msg2_email;
                                        m8Var.f24716w = 16;
                                        m8Var.f24715s = 58;
                                        org.telegram.ui.ActionBar.h5 h5Var = m8Var.f24708a;
                                        h5Var.l(string6, false);
                                        h5Var.i(null);
                                        org.telegram.ui.ActionBar.h5 h5Var2 = m8Var.d;
                                        h5Var2.setVisibility(0);
                                        h5Var2.l(str4, false);
                                        o6Var.setVisibility(8);
                                        m8Var.h.setVisibility(8);
                                        org.telegram.ui.Components.aj0 aj0Var = m8Var.f24711e;
                                        aj0Var.setVisibility(0);
                                        aj0Var.setTranslationX(0.0f);
                                        aj0Var.setTranslationY(0.0f);
                                        aj0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
                                        aj0Var.setImageResource(i47);
                                        m8Var.f24714r = true;
                                        m8Var.setWillNotDraw(false);
                                        Switch r02 = m8Var.f24712f;
                                        if (r02 != null) {
                                            r02.setVisibility(8);
                                        }
                                        org.telegram.ui.Components.n5 n5Var = m8Var.G;
                                        if (n5Var != null) {
                                            n5Var.g(null, false);
                                        }
                                        z17 = z16;
                                    }
                                } else {
                                    if (privacySettingsActivity.W.j0() == 0) {
                                        if (privacySettingsActivity.getMessagesController().lastKnownSessionsCount == 0) {
                                            str5 = "";
                                            z17 = true;
                                            privacySettingsActivity.getMessagesController().lastKnownSessionsCount = privacySettingsActivity.W.j0();
                                            m8Var.s(LocaleController.getString(R.string.SessionsTitle), str5, true, R.drawable.msg2_devices, false);
                                        } else {
                                            format2 = String.format(LocaleController.getInstance().getCurrentLocale(), "%d", Integer.valueOf(privacySettingsActivity.getMessagesController().lastKnownSessionsCount));
                                        }
                                    } else {
                                        format2 = String.format(LocaleController.getInstance().getCurrentLocale(), "%d", Integer.valueOf(privacySettingsActivity.W.j0()));
                                    }
                                    str5 = format2;
                                    privacySettingsActivity.getMessagesController().lastKnownSessionsCount = privacySettingsActivity.W.j0();
                                    m8Var.s(LocaleController.getString(R.string.SessionsTitle), str5, true, R.drawable.msg2_devices, false);
                                }
                            }
                            m8Var.f(16, z17, z15);
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                    i30 = privacySettingsActivity.secretWebpageRow;
                    if (i10 != i30) {
                        i31 = privacySettingsActivity.contactsSyncRow;
                        if (i10 != i31) {
                            i32 = privacySettingsActivity.contactsSuggestRow;
                            if (i10 != i32) {
                                i33 = privacySettingsActivity.newChatsRow;
                                if (i10 == i33) {
                                    q8Var.f(LocaleController.getString("ArchiveAndMute", R.string.ArchiveAndMute), privacySettingsActivity.S, false);
                                    return;
                                }
                                return;
                            }
                            q8Var.f(LocaleController.getString("SuggestContacts", R.string.SuggestContacts), privacySettingsActivity.R, false);
                            return;
                        }
                        q8Var.f(LocaleController.getString("SyncContacts", R.string.SyncContacts), privacySettingsActivity.P, true);
                        return;
                    }
                    String string7 = LocaleController.getString("SecretWebPage", R.string.SecretWebPage);
                    if (privacySettingsActivity.getMessagesController().secretWebpagePreview != 1) {
                        z18 = false;
                    }
                    q8Var.f(string7, z18, false);
                    return;
                }
                org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
                if (i10 == privacySettingsActivity.f35977f) {
                    k4Var.setText(LocaleController.getString("PrivacyTitle", R.string.PrivacyTitle));
                    return;
                } else if (i10 == 0) {
                    k4Var.setText(LocaleController.getString("SecurityTitle", R.string.SecurityTitle));
                    return;
                } else if (i10 == privacySettingsActivity.f35983y) {
                    k4Var.setText(LocaleController.getString("DeleteMyAccount", R.string.DeleteMyAccount));
                    return;
                } else if (i10 == privacySettingsActivity.I) {
                    k4Var.setText(LocaleController.getString("SecretChat", R.string.SecretChat));
                    return;
                } else if (i10 == privacySettingsActivity.B) {
                    k4Var.setText(LocaleController.getString("PrivacyBots", R.string.PrivacyBots));
                    return;
                } else if (i10 == privacySettingsActivity.G) {
                    k4Var.setText(LocaleController.getString("Contacts", R.string.Contacts));
                    return;
                } else if (i10 == privacySettingsActivity.f35981w) {
                    k4Var.setText(LocaleController.getString("NewChatsFromNonContacts", R.string.NewChatsFromNonContacts));
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            if (i10 == privacySettingsActivity.A) {
                y8Var.setText(LocaleController.getString("DeleteAccountHelp", R.string.DeleteAccountHelp));
                return;
            } else if (i10 == privacySettingsActivity.f35979r) {
                y8Var.setText(LocaleController.getString("GroupsAndChannelsHelp", R.string.GroupsAndChannelsHelp));
                return;
            } else if (i10 == privacySettingsActivity.v) {
                y8Var.setText(LocaleController.getString("SessionsSettingsInfo", R.string.SessionsSettingsInfo));
                return;
            } else if (i10 == privacySettingsActivity.J) {
                y8Var.setText(LocaleController.getString("SecretWebPageInfo", R.string.SecretWebPageInfo));
                return;
            } else if (i10 == privacySettingsActivity.E) {
                y8Var.setText(LocaleController.getString("PrivacyBotsInfo", R.string.PrivacyBotsInfo));
                return;
            } else if (i10 == privacySettingsActivity.h) {
                y8Var.setText(LocaleController.getString(R.string.PrivacyInvitesInfo));
                return;
            } else if (i10 == privacySettingsActivity.H) {
                y8Var.setText(LocaleController.getString("SuggestContactsInfo", R.string.SuggestContactsInfo));
                return;
            } else if (i10 == privacySettingsActivity.f35982x) {
                y8Var.setText(LocaleController.getString("ArchiveAndMuteInfo", R.string.ArchiveAndMuteInfo));
                return;
            } else {
                return;
            }
        }
        if (view.getTag() != null && ((Integer) view.getTag()).intValue() == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        view.setTag(Integer.valueOf(i10));
        org.telegram.ui.Cells.y9 y9Var = (org.telegram.ui.Cells.y9) view;
        y9Var.setBetterLayout(true);
        i11 = privacySettingsActivity.webSessionsRow;
        if (i10 != i11) {
            i12 = privacySettingsActivity.phoneNumberRow;
            if (i10 != i12) {
                i13 = privacySettingsActivity.lastSeenRow;
                if (i10 == i13) {
                    if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(0)) {
                        z11 = true;
                        i43 = 30;
                    } else {
                        str7 = PrivacySettingsActivity.x0(0, privacySettingsActivity.getAccountInstance());
                        z11 = false;
                    }
                    y9Var.c(LocaleController.getString("PrivacyLastSeen", R.string.PrivacyLastSeen), str7, false, true);
                } else if (i10 != privacySettingsActivity.f35978n) {
                    i14 = privacySettingsActivity.callsRow;
                    if (i10 != i14) {
                        i15 = privacySettingsActivity.profilePhotoRow;
                        if (i10 != i15) {
                            i16 = privacySettingsActivity.bioRow;
                            if (i10 != i16) {
                                i17 = privacySettingsActivity.musicRow;
                                if (i10 != i17) {
                                    i18 = privacySettingsActivity.birthdayRow;
                                    if (i10 != i18) {
                                        i19 = privacySettingsActivity.giftsRow;
                                        if (i10 != i19) {
                                            i20 = privacySettingsActivity.forwardsRow;
                                            if (i10 != i20) {
                                                i21 = privacySettingsActivity.voicesRow;
                                                if (i10 != i21) {
                                                    i22 = privacySettingsActivity.noncontactsRow;
                                                    if (i10 == i22) {
                                                        if (privacySettingsActivity.U) {
                                                            i27 = R.string.ContactsAndFee;
                                                        } else if (privacySettingsActivity.T) {
                                                            i27 = R.string.ContactsAndPremium;
                                                        } else {
                                                            i27 = R.string.P2PEverybody;
                                                        }
                                                        String string8 = LocaleController.getString(i27);
                                                        if (privacySettingsActivity.getMessagesController().newNoncontactPeersRequirePremiumWithoutOwnpremium && !privacySettingsActivity.getMessagesController().starsPaidMessagesAvailable) {
                                                            u02 = LocaleController.getString(R.string.PrivacyMessages);
                                                        } else {
                                                            u02 = PrivacySettingsActivity.u0(privacySettingsActivity, LocaleController.getString(R.string.PrivacyMessages));
                                                        }
                                                        i28 = privacySettingsActivity.musicRow;
                                                        if (i28 != -1) {
                                                            z12 = true;
                                                        } else {
                                                            z12 = false;
                                                        }
                                                        y9Var.c(u02, string8, false, z12);
                                                    } else if (i10 != privacySettingsActivity.C) {
                                                        i23 = privacySettingsActivity.deleteAccountRow;
                                                        if (i10 != i23) {
                                                            i24 = privacySettingsActivity.paymentsClearRow;
                                                            if (i10 == i24) {
                                                                y9Var.b(LocaleController.getString("PrivacyPaymentsClear", R.string.PrivacyPaymentsClear), true);
                                                            } else if (i10 != privacySettingsActivity.D) {
                                                                i25 = privacySettingsActivity.secretMapRow;
                                                                if (i10 != i25) {
                                                                    i26 = privacySettingsActivity.contactsDeleteRow;
                                                                    if (i10 == i26) {
                                                                        y9Var.b(LocaleController.getString("SyncContactsDelete", R.string.SyncContactsDelete), true);
                                                                    }
                                                                } else {
                                                                    int i48 = SharedConfig.mapPreviewType;
                                                                    if (i48 != 0) {
                                                                        if (i48 != 1) {
                                                                            if (i48 != 2) {
                                                                                string = LocaleController.getString("MapPreviewProviderYandex", R.string.MapPreviewProviderYandex);
                                                                            } else {
                                                                                string = LocaleController.getString("MapPreviewProviderNobody", R.string.MapPreviewProviderNobody);
                                                                            }
                                                                        } else {
                                                                            string = LocaleController.getString("MapPreviewProviderGoogle", R.string.MapPreviewProviderGoogle);
                                                                        }
                                                                    } else {
                                                                        string = LocaleController.getString("MapPreviewProviderTelegram", R.string.MapPreviewProviderTelegram);
                                                                    }
                                                                    y9Var.c(LocaleController.getString("MapPreviewProvider", R.string.MapPreviewProvider), string, privacySettingsActivity.N, true);
                                                                    privacySettingsActivity.N = false;
                                                                }
                                                            } else {
                                                                y9Var.b(LocaleController.getString(R.string.PrivacyBiometryBotsButton), true);
                                                            }
                                                        } else {
                                                            if (privacySettingsActivity.getContactsController().getLoadingDeleteInfo()) {
                                                                z11 = true;
                                                            } else {
                                                                int deleteAccountTTL = privacySettingsActivity.getContactsController().getDeleteAccountTTL();
                                                                if (deleteAccountTTL <= 182) {
                                                                    str7 = LocaleController.formatPluralString("Months", deleteAccountTTL / 30, new Object[0]);
                                                                } else if (deleteAccountTTL == 365) {
                                                                    str7 = LocaleController.formatPluralString("Months", 12, new Object[0]);
                                                                } else if (deleteAccountTTL == 548) {
                                                                    str7 = LocaleController.formatPluralString("Months", 18, new Object[0]);
                                                                } else if (deleteAccountTTL == 730) {
                                                                    str7 = LocaleController.formatPluralString("Months", 24, new Object[0]);
                                                                } else if (deleteAccountTTL > 30) {
                                                                    str7 = LocaleController.formatPluralString("Months", (int) Math.round(deleteAccountTTL / 30.0d), new Object[0]);
                                                                } else {
                                                                    str7 = LocaleController.formatPluralString("Days", deleteAccountTTL, new Object[0]);
                                                                }
                                                                z11 = false;
                                                            }
                                                            y9Var.c(LocaleController.getString("DeleteAccountIfAwayFor3", R.string.DeleteAccountIfAwayFor3), str7, privacySettingsActivity.M, false);
                                                            privacySettingsActivity.M = false;
                                                        }
                                                    } else {
                                                        y9Var.b(LocaleController.getString("TelegramPassport", R.string.TelegramPassport), true);
                                                    }
                                                } else {
                                                    if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(8)) {
                                                        x02 = null;
                                                        z13 = true;
                                                        i43 = 30;
                                                    } else {
                                                        if (!privacySettingsActivity.getUserConfig().isPremium()) {
                                                            x02 = LocaleController.getString(R.string.P2PEverybody);
                                                        } else {
                                                            x02 = PrivacySettingsActivity.x0(8, privacySettingsActivity.getAccountInstance());
                                                        }
                                                        z13 = false;
                                                    }
                                                    SpannableStringBuilder u03 = PrivacySettingsActivity.u0(privacySettingsActivity, LocaleController.getString(R.string.PrivacyVoiceMessages));
                                                    i29 = privacySettingsActivity.noncontactsRow;
                                                    if (i29 != -1) {
                                                        z14 = true;
                                                    } else {
                                                        z14 = false;
                                                    }
                                                    y9Var.c(u03, x02, false, z14);
                                                    y9Var.getValueImageView().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23223m6, false), PorterDuff.Mode.MULTIPLY));
                                                    z17 = z13;
                                                }
                                            } else {
                                                if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(5)) {
                                                    z11 = true;
                                                    i43 = 30;
                                                } else {
                                                    str7 = PrivacySettingsActivity.x0(5, privacySettingsActivity.getAccountInstance());
                                                    z11 = false;
                                                }
                                                y9Var.c(LocaleController.getString("PrivacyForwards", R.string.PrivacyForwards), str7, false, true);
                                            }
                                        } else {
                                            if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(12)) {
                                                z11 = true;
                                                i43 = 30;
                                            } else {
                                                str7 = PrivacySettingsActivity.x0(12, privacySettingsActivity.getAccountInstance());
                                                z11 = false;
                                            }
                                            y9Var.c(LocaleController.getString(R.string.PrivacyGifts), str7, false, true);
                                        }
                                    } else {
                                        if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(11)) {
                                            z11 = true;
                                            i43 = 30;
                                        } else {
                                            str7 = PrivacySettingsActivity.x0(11, privacySettingsActivity.getAccountInstance());
                                            z11 = false;
                                        }
                                        y9Var.c(LocaleController.getString(R.string.PrivacyBirthday), str7, false, true);
                                    }
                                } else {
                                    if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(14)) {
                                        z11 = true;
                                        i43 = 30;
                                    } else {
                                        str7 = PrivacySettingsActivity.x0(14, privacySettingsActivity.getAccountInstance());
                                        z11 = false;
                                    }
                                    y9Var.c(LocaleController.getString(R.string.PrivacyMusic), str7, false, true);
                                }
                            } else {
                                if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(9)) {
                                    z11 = true;
                                    i43 = 30;
                                } else {
                                    str7 = PrivacySettingsActivity.x0(9, privacySettingsActivity.getAccountInstance());
                                    z11 = false;
                                }
                                y9Var.c(LocaleController.getString("PrivacyBio", R.string.PrivacyBio), str7, false, true);
                            }
                        } else {
                            if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(4)) {
                                z11 = true;
                                i43 = 30;
                            } else {
                                str7 = PrivacySettingsActivity.x0(4, privacySettingsActivity.getAccountInstance());
                                z11 = false;
                            }
                            y9Var.c(LocaleController.getString("PrivacyProfilePhoto", R.string.PrivacyProfilePhoto), str7, false, true);
                        }
                    } else {
                        if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(2)) {
                            z11 = true;
                            i43 = 30;
                        } else {
                            str7 = PrivacySettingsActivity.x0(2, privacySettingsActivity.getAccountInstance());
                            z11 = false;
                        }
                        y9Var.c(LocaleController.getString("Calls", R.string.Calls), str7, false, true);
                    }
                } else {
                    if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(1)) {
                        z11 = true;
                        i43 = 30;
                    } else {
                        str7 = PrivacySettingsActivity.x0(1, privacySettingsActivity.getAccountInstance());
                        z11 = false;
                    }
                    y9Var.c(LocaleController.getString(R.string.PrivacyInvites), str7, false, false);
                }
            } else {
                if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(6)) {
                    z11 = true;
                    i43 = 30;
                } else {
                    str7 = PrivacySettingsActivity.x0(6, privacySettingsActivity.getAccountInstance());
                    z11 = false;
                }
                y9Var.c(LocaleController.getString("PrivacyPhone", R.string.PrivacyPhone), str7, false, true);
            }
            z17 = z11;
        } else {
            y9Var.b(LocaleController.getString("WebSessionsTitle", R.string.WebSessionsTitle), false);
        }
        y9Var.f26025r = z17;
        y9Var.f26029y = i43;
        if (!z10) {
            if (z17) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            y9Var.f26028x = f9;
        } else {
            y9Var.A = true;
        }
        y9Var.invalidate();
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View y9Var;
        Context context = this.f44661c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            y9Var = new org.telegram.ui.Cells.q8(context);
                        } else {
                            y9Var = new org.telegram.ui.Cells.m8(context);
                        }
                    } else {
                        y9Var = new org.telegram.ui.Cells.x6(context, (b) null);
                    }
                } else {
                    y9Var = new org.telegram.ui.Cells.k4(context);
                }
            } else {
                y9Var = new org.telegram.ui.Cells.y8(context);
            }
        } else {
            y9Var = new org.telegram.ui.Cells.y9(context);
        }
        return new f2.n1(y9Var);
    }
}
