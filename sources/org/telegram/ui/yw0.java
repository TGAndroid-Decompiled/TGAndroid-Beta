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
public final class yw0 extends org.telegram.ui.Components.vk0 {
    public final Context f44959c;
    public final PrivacySettingsActivity d;

    public yw0(PrivacySettingsActivity privacySettingsActivity, Context context) {
        this.d = privacySettingsActivity;
        this.f44959c = context;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        int i9;
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
        int b10 = q1Var.b();
        PrivacySettingsActivity privacySettingsActivity = this.d;
        i9 = privacySettingsActivity.passcodeRow;
        if (b10 != i9) {
            i10 = privacySettingsActivity.passwordRow;
            if (b10 != i10) {
                i11 = privacySettingsActivity.passkeysRow;
                if (b10 != i11) {
                    i12 = privacySettingsActivity.blockedRow;
                    if (b10 != i12 && b10 != privacySettingsActivity.f35914s) {
                        i13 = privacySettingsActivity.secretWebpageRow;
                        if (b10 != i13) {
                            i14 = privacySettingsActivity.webSessionsRow;
                            if (b10 != i14 && (b10 != privacySettingsActivity.f35912n || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(1))) {
                                i15 = privacySettingsActivity.lastSeenRow;
                                if (b10 != i15 || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(0)) {
                                    i16 = privacySettingsActivity.callsRow;
                                    if (b10 != i16 || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(2)) {
                                        i17 = privacySettingsActivity.profilePhotoRow;
                                        if (b10 != i17 || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(4)) {
                                            i18 = privacySettingsActivity.bioRow;
                                            if (b10 != i18 || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(9)) {
                                                i19 = privacySettingsActivity.musicRow;
                                                if (b10 != i19 || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(14)) {
                                                    i20 = privacySettingsActivity.birthdayRow;
                                                    if (b10 != i20 || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(11)) {
                                                        i21 = privacySettingsActivity.giftsRow;
                                                        if (b10 != i21 || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(12)) {
                                                            i22 = privacySettingsActivity.forwardsRow;
                                                            if (b10 != i22 || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(5)) {
                                                                i23 = privacySettingsActivity.phoneNumberRow;
                                                                if (b10 != i23 || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(6)) {
                                                                    i24 = privacySettingsActivity.voicesRow;
                                                                    if (b10 != i24 || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(8)) {
                                                                        i25 = privacySettingsActivity.noncontactsRow;
                                                                        if (b10 != i25) {
                                                                            i26 = privacySettingsActivity.deleteAccountRow;
                                                                            if (b10 != i26 || privacySettingsActivity.getContactsController().getLoadingDeleteInfo()) {
                                                                                i27 = privacySettingsActivity.newChatsRow;
                                                                                if (b10 != i27 || privacySettingsActivity.getContactsController().getLoadingGlobalSettings()) {
                                                                                    i28 = privacySettingsActivity.emailLoginRow;
                                                                                    if (b10 != i28) {
                                                                                        i29 = privacySettingsActivity.paymentsClearRow;
                                                                                        if (b10 != i29) {
                                                                                            i30 = privacySettingsActivity.secretMapRow;
                                                                                            if (b10 != i30) {
                                                                                                i31 = privacySettingsActivity.contactsSyncRow;
                                                                                                if (b10 != i31 && b10 != privacySettingsActivity.C) {
                                                                                                    i32 = privacySettingsActivity.contactsDeleteRow;
                                                                                                    if (b10 != i32) {
                                                                                                        i33 = privacySettingsActivity.contactsSuggestRow;
                                                                                                        if (b10 != i33) {
                                                                                                            i34 = privacySettingsActivity.autoDeleteMesages;
                                                                                                            if (b10 != i34 && b10 != privacySettingsActivity.D) {
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
    public final int j(int i9) {
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
        PrivacySettingsActivity privacySettingsActivity = this.d;
        if (i9 != privacySettingsActivity.C) {
            i10 = privacySettingsActivity.lastSeenRow;
            if (i9 != i10) {
                i11 = privacySettingsActivity.phoneNumberRow;
                if (i9 != i11) {
                    i12 = privacySettingsActivity.deleteAccountRow;
                    if (i9 != i12) {
                        i13 = privacySettingsActivity.webSessionsRow;
                        if (i9 != i13 && i9 != privacySettingsActivity.f35912n) {
                            i14 = privacySettingsActivity.paymentsClearRow;
                            if (i9 != i14) {
                                i15 = privacySettingsActivity.secretMapRow;
                                if (i9 != i15) {
                                    i16 = privacySettingsActivity.contactsDeleteRow;
                                    if (i9 != i16 && i9 != privacySettingsActivity.D) {
                                        if (i9 != privacySettingsActivity.h && i9 != privacySettingsActivity.A && i9 != privacySettingsActivity.f35913r && i9 != privacySettingsActivity.v && i9 != privacySettingsActivity.J && i9 != privacySettingsActivity.E && i9 != privacySettingsActivity.H && i9 != privacySettingsActivity.f35916x) {
                                            if (i9 != 0 && i9 != privacySettingsActivity.f35917y && i9 != privacySettingsActivity.f35911f && i9 != privacySettingsActivity.I && i9 != privacySettingsActivity.B && i9 != privacySettingsActivity.G && i9 != privacySettingsActivity.f35915w) {
                                                i17 = privacySettingsActivity.secretWebpageRow;
                                                if (i9 != i17) {
                                                    i18 = privacySettingsActivity.contactsSyncRow;
                                                    if (i9 != i18) {
                                                        i19 = privacySettingsActivity.contactsSuggestRow;
                                                        if (i9 != i19) {
                                                            i20 = privacySettingsActivity.newChatsRow;
                                                            if (i9 != i20) {
                                                                if (i9 != privacySettingsActivity.F) {
                                                                    i21 = privacySettingsActivity.autoDeleteMesages;
                                                                    if (i9 != i21 && i9 != privacySettingsActivity.f35914s) {
                                                                        i22 = privacySettingsActivity.emailLoginRow;
                                                                        if (i9 != i22) {
                                                                            i23 = privacySettingsActivity.passwordRow;
                                                                            if (i9 != i23) {
                                                                                i24 = privacySettingsActivity.passkeysRow;
                                                                                if (i9 != i24) {
                                                                                    i25 = privacySettingsActivity.passcodeRow;
                                                                                    if (i9 != i25) {
                                                                                        i26 = privacySettingsActivity.blockedRow;
                                                                                        if (i9 == i26) {
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
    public final void v(f2.q1 q1Var, int i9) {
        boolean z10;
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
        String string;
        boolean z11;
        int i26;
        CharSequence t02;
        int i27;
        boolean z12;
        CharSequence w02;
        boolean z13;
        int i28;
        boolean z14;
        float f10;
        int i29;
        int i30;
        int i31;
        int i32;
        boolean z15;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        String str;
        String format;
        String string2;
        int i39;
        String string3;
        String str2;
        String string4;
        int i40;
        String str3;
        boolean z16;
        String str4;
        String format2;
        String str5;
        String string5;
        String str6;
        int i41 = q1Var.f5505f;
        View view = q1Var.f5501a;
        int i42 = 16;
        String str7 = null;
        boolean z17 = false;
        boolean z18 = true;
        PrivacySettingsActivity privacySettingsActivity = this.d;
        if (i41 != 0) {
            if (i41 != 1) {
                if (i41 != 2) {
                    if (i41 != 3) {
                        if (i41 == 5) {
                            org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                            if (view.getTag() != null && ((Integer) view.getTag()).intValue() == i9) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            view.setTag(Integer.valueOf(i9));
                            p8Var.setPrioritizeTitleOverValue(false);
                            org.telegram.ui.Components.j6 j6Var = p8Var.f24874c;
                            i33 = privacySettingsActivity.autoDeleteMesages;
                            if (i9 == i33) {
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
                                p8Var.s(LocaleController.getString("AutoDeleteMessages", R.string.AutoDeleteMessages), str6, true, R.drawable.msg2_autodelete, true);
                            } else {
                                String str8 = "";
                                if (i9 != privacySettingsActivity.f35914s) {
                                    i34 = privacySettingsActivity.emailLoginRow;
                                    if (i9 != i34) {
                                        i35 = privacySettingsActivity.passwordRow;
                                        if (i9 != i35) {
                                            i36 = privacySettingsActivity.passkeysRow;
                                            if (i9 != i36) {
                                                i37 = privacySettingsActivity.passcodeRow;
                                                if (i9 != i37) {
                                                    i38 = privacySettingsActivity.blockedRow;
                                                    if (i9 == i38) {
                                                        int i43 = privacySettingsActivity.getMessagesController().totalBlockedCount;
                                                        if (i43 == 0) {
                                                            format = LocaleController.getString("BlockedEmpty", R.string.BlockedEmpty);
                                                        } else if (i43 <= 0) {
                                                            str = "";
                                                            z17 = true;
                                                            p8Var.s(LocaleController.getString("BlockedUsers", R.string.BlockedUsers), str, true, R.drawable.msg2_block2, true);
                                                        } else {
                                                            format = String.format(LocaleController.getInstance().getCurrentLocale(), "%d", Integer.valueOf(i43));
                                                        }
                                                        str = format;
                                                        p8Var.s(LocaleController.getString("BlockedUsers", R.string.BlockedUsers), str, true, R.drawable.msg2_block2, true);
                                                    }
                                                } else {
                                                    if (SharedConfig.passcodeHash.length() != 0) {
                                                        string2 = LocaleController.getString(R.string.PasswordOn);
                                                        i39 = R.drawable.msg2_secret;
                                                    } else {
                                                        string2 = LocaleController.getString(R.string.PasswordOff);
                                                        i39 = R.drawable.msg2_secret;
                                                    }
                                                    p8Var.s(LocaleController.getString(R.string.Passcode), string2, true, i39, true);
                                                }
                                            } else {
                                                ArrayList arrayList = privacySettingsActivity.f35910e;
                                                if (arrayList == null) {
                                                    str2 = "";
                                                    z17 = true;
                                                } else {
                                                    if (arrayList.size() == 1 && j6Var.getPaint().measureText(((TL_account.Passkey) privacySettingsActivity.f35910e.get(0)).name) < AndroidUtilities.displaySize.x / 3.0f) {
                                                        string3 = ((TL_account.Passkey) privacySettingsActivity.f35910e.get(0)).name;
                                                    } else if (privacySettingsActivity.f35910e.size() > 0) {
                                                        string3 = privacySettingsActivity.f35910e.size() + "";
                                                    } else {
                                                        string3 = LocaleController.getString(R.string.PasswordOff);
                                                    }
                                                    str2 = string3;
                                                }
                                                p8Var.s(LocaleController.getString(R.string.Passkey), str2, true, R.drawable.msg2_permissions, true);
                                            }
                                        } else {
                                            int i44 = R.drawable.menu_2sv;
                                            TL_account.Password password = privacySettingsActivity.d;
                                            if (password == null) {
                                                i40 = i44;
                                                str3 = "";
                                                z17 = true;
                                            } else {
                                                if (password.has_password) {
                                                    i44 = R.drawable.menu_2sv_on;
                                                    string4 = LocaleController.getString(R.string.PasswordOn);
                                                } else {
                                                    string4 = LocaleController.getString(R.string.PasswordOff);
                                                }
                                                i40 = i44;
                                                str3 = string4;
                                            }
                                            p8Var.s(LocaleController.getString(R.string.TwoStepVerification), str3, true, i40, true);
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
                                                obj.f34062a |= 256;
                                                obj.f34063b = indexOf;
                                                int i45 = lastIndexOf + 1;
                                                obj.f34064c = i45;
                                                valueOf.setSpan(new org.telegram.ui.Components.wz0(obj, 0), indexOf, i45, 0);
                                            }
                                            z16 = false;
                                            str4 = valueOf;
                                        }
                                        p8Var.setPrioritizeTitleOverValue(true);
                                        String string6 = LocaleController.getString(R.string.EmailLogin);
                                        int i46 = R.drawable.msg2_email;
                                        p8Var.f24880w = 16;
                                        p8Var.f24879s = 58;
                                        org.telegram.ui.ActionBar.h5 h5Var = p8Var.f24872a;
                                        h5Var.l(string6, false);
                                        h5Var.i(null);
                                        org.telegram.ui.ActionBar.h5 h5Var2 = p8Var.d;
                                        h5Var2.setVisibility(0);
                                        h5Var2.l(str4, false);
                                        j6Var.setVisibility(8);
                                        p8Var.h.setVisibility(8);
                                        org.telegram.ui.Components.pi0 pi0Var = p8Var.f24875e;
                                        pi0Var.setVisibility(0);
                                        pi0Var.setTranslationX(0.0f);
                                        pi0Var.setTranslationY(0.0f);
                                        pi0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
                                        pi0Var.setImageResource(i46);
                                        p8Var.f24878r = true;
                                        p8Var.setWillNotDraw(false);
                                        Switch r02 = p8Var.f24876f;
                                        if (r02 != null) {
                                            r02.setVisibility(8);
                                        }
                                        org.telegram.ui.Components.i5 i5Var = p8Var.G;
                                        if (i5Var != null) {
                                            i5Var.g(null, false);
                                        }
                                        z17 = z16;
                                    }
                                } else {
                                    if (privacySettingsActivity.W.i0() == 0) {
                                        if (privacySettingsActivity.getMessagesController().lastKnownSessionsCount == 0) {
                                            str5 = "";
                                            z17 = true;
                                            privacySettingsActivity.getMessagesController().lastKnownSessionsCount = privacySettingsActivity.W.i0();
                                            p8Var.s(LocaleController.getString(R.string.SessionsTitle), str5, true, R.drawable.msg2_devices, false);
                                        } else {
                                            format2 = String.format(LocaleController.getInstance().getCurrentLocale(), "%d", Integer.valueOf(privacySettingsActivity.getMessagesController().lastKnownSessionsCount));
                                        }
                                    } else {
                                        format2 = String.format(LocaleController.getInstance().getCurrentLocale(), "%d", Integer.valueOf(privacySettingsActivity.W.i0()));
                                    }
                                    str5 = format2;
                                    privacySettingsActivity.getMessagesController().lastKnownSessionsCount = privacySettingsActivity.W.i0();
                                    p8Var.s(LocaleController.getString(R.string.SessionsTitle), str5, true, R.drawable.msg2_devices, false);
                                }
                            }
                            p8Var.f(16, z17, z15);
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
                    i29 = privacySettingsActivity.secretWebpageRow;
                    if (i9 != i29) {
                        i30 = privacySettingsActivity.contactsSyncRow;
                        if (i9 != i30) {
                            i31 = privacySettingsActivity.contactsSuggestRow;
                            if (i9 != i31) {
                                i32 = privacySettingsActivity.newChatsRow;
                                if (i9 == i32) {
                                    t8Var.f(LocaleController.getString("ArchiveAndMute", R.string.ArchiveAndMute), privacySettingsActivity.S, false);
                                    return;
                                }
                                return;
                            }
                            t8Var.f(LocaleController.getString("SuggestContacts", R.string.SuggestContacts), privacySettingsActivity.R, false);
                            return;
                        }
                        t8Var.f(LocaleController.getString("SyncContacts", R.string.SyncContacts), privacySettingsActivity.P, true);
                        return;
                    }
                    String string7 = LocaleController.getString("SecretWebPage", R.string.SecretWebPage);
                    if (privacySettingsActivity.getMessagesController().secretWebpagePreview != 1) {
                        z18 = false;
                    }
                    t8Var.f(string7, z18, false);
                    return;
                }
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (i9 == privacySettingsActivity.f35911f) {
                    m4Var.setText(LocaleController.getString("PrivacyTitle", R.string.PrivacyTitle));
                    return;
                } else if (i9 == 0) {
                    m4Var.setText(LocaleController.getString("SecurityTitle", R.string.SecurityTitle));
                    return;
                } else if (i9 == privacySettingsActivity.f35917y) {
                    m4Var.setText(LocaleController.getString("DeleteMyAccount", R.string.DeleteMyAccount));
                    return;
                } else if (i9 == privacySettingsActivity.I) {
                    m4Var.setText(LocaleController.getString("SecretChat", R.string.SecretChat));
                    return;
                } else if (i9 == privacySettingsActivity.B) {
                    m4Var.setText(LocaleController.getString("PrivacyBots", R.string.PrivacyBots));
                    return;
                } else if (i9 == privacySettingsActivity.G) {
                    m4Var.setText(LocaleController.getString("Contacts", R.string.Contacts));
                    return;
                } else if (i9 == privacySettingsActivity.f35915w) {
                    m4Var.setText(LocaleController.getString("NewChatsFromNonContacts", R.string.NewChatsFromNonContacts));
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            if (i9 == privacySettingsActivity.A) {
                b9Var.setText(LocaleController.getString("DeleteAccountHelp", R.string.DeleteAccountHelp));
                return;
            } else if (i9 == privacySettingsActivity.f35913r) {
                b9Var.setText(LocaleController.getString("GroupsAndChannelsHelp", R.string.GroupsAndChannelsHelp));
                return;
            } else if (i9 == privacySettingsActivity.v) {
                b9Var.setText(LocaleController.getString("SessionsSettingsInfo", R.string.SessionsSettingsInfo));
                return;
            } else if (i9 == privacySettingsActivity.J) {
                b9Var.setText(LocaleController.getString("SecretWebPageInfo", R.string.SecretWebPageInfo));
                return;
            } else if (i9 == privacySettingsActivity.E) {
                b9Var.setText(LocaleController.getString("PrivacyBotsInfo", R.string.PrivacyBotsInfo));
                return;
            } else if (i9 == privacySettingsActivity.h) {
                b9Var.setText(LocaleController.getString(R.string.PrivacyInvitesInfo));
                return;
            } else if (i9 == privacySettingsActivity.H) {
                b9Var.setText(LocaleController.getString("SuggestContactsInfo", R.string.SuggestContactsInfo));
                return;
            } else if (i9 == privacySettingsActivity.f35916x) {
                b9Var.setText(LocaleController.getString("ArchiveAndMuteInfo", R.string.ArchiveAndMuteInfo));
                return;
            } else {
                return;
            }
        }
        if (view.getTag() != null && ((Integer) view.getTag()).intValue() == i9) {
            z10 = true;
        } else {
            z10 = false;
        }
        view.setTag(Integer.valueOf(i9));
        org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) view;
        baVar.setBetterLayout(true);
        i10 = privacySettingsActivity.webSessionsRow;
        if (i9 != i10) {
            i11 = privacySettingsActivity.phoneNumberRow;
            if (i9 != i11) {
                i12 = privacySettingsActivity.lastSeenRow;
                if (i9 == i12) {
                    if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(0)) {
                        z11 = true;
                        i42 = 30;
                    } else {
                        str7 = PrivacySettingsActivity.w0(0, privacySettingsActivity.getAccountInstance());
                        z11 = false;
                    }
                    baVar.c(LocaleController.getString("PrivacyLastSeen", R.string.PrivacyLastSeen), str7, false, true);
                } else if (i9 != privacySettingsActivity.f35912n) {
                    i13 = privacySettingsActivity.callsRow;
                    if (i9 != i13) {
                        i14 = privacySettingsActivity.profilePhotoRow;
                        if (i9 != i14) {
                            i15 = privacySettingsActivity.bioRow;
                            if (i9 != i15) {
                                i16 = privacySettingsActivity.musicRow;
                                if (i9 != i16) {
                                    i17 = privacySettingsActivity.birthdayRow;
                                    if (i9 != i17) {
                                        i18 = privacySettingsActivity.giftsRow;
                                        if (i9 != i18) {
                                            i19 = privacySettingsActivity.forwardsRow;
                                            if (i9 != i19) {
                                                i20 = privacySettingsActivity.voicesRow;
                                                if (i9 != i20) {
                                                    i21 = privacySettingsActivity.noncontactsRow;
                                                    if (i9 == i21) {
                                                        if (privacySettingsActivity.U) {
                                                            i26 = R.string.ContactsAndFee;
                                                        } else if (privacySettingsActivity.T) {
                                                            i26 = R.string.ContactsAndPremium;
                                                        } else {
                                                            i26 = R.string.P2PEverybody;
                                                        }
                                                        String string8 = LocaleController.getString(i26);
                                                        if (privacySettingsActivity.getMessagesController().newNoncontactPeersRequirePremiumWithoutOwnpremium && !privacySettingsActivity.getMessagesController().starsPaidMessagesAvailable) {
                                                            t02 = LocaleController.getString(R.string.PrivacyMessages);
                                                        } else {
                                                            t02 = PrivacySettingsActivity.t0(privacySettingsActivity, LocaleController.getString(R.string.PrivacyMessages));
                                                        }
                                                        i27 = privacySettingsActivity.musicRow;
                                                        if (i27 != -1) {
                                                            z12 = true;
                                                        } else {
                                                            z12 = false;
                                                        }
                                                        baVar.c(t02, string8, false, z12);
                                                    } else if (i9 != privacySettingsActivity.C) {
                                                        i22 = privacySettingsActivity.deleteAccountRow;
                                                        if (i9 != i22) {
                                                            i23 = privacySettingsActivity.paymentsClearRow;
                                                            if (i9 == i23) {
                                                                baVar.b(LocaleController.getString("PrivacyPaymentsClear", R.string.PrivacyPaymentsClear), true);
                                                            } else if (i9 != privacySettingsActivity.D) {
                                                                i24 = privacySettingsActivity.secretMapRow;
                                                                if (i9 != i24) {
                                                                    i25 = privacySettingsActivity.contactsDeleteRow;
                                                                    if (i9 == i25) {
                                                                        baVar.b(LocaleController.getString("SyncContactsDelete", R.string.SyncContactsDelete), true);
                                                                    }
                                                                } else {
                                                                    int i47 = SharedConfig.mapPreviewType;
                                                                    if (i47 != 0) {
                                                                        if (i47 != 1) {
                                                                            if (i47 != 2) {
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
                                                                    baVar.c(LocaleController.getString("MapPreviewProvider", R.string.MapPreviewProvider), string, privacySettingsActivity.N, true);
                                                                    privacySettingsActivity.N = false;
                                                                }
                                                            } else {
                                                                baVar.b(LocaleController.getString(R.string.PrivacyBiometryBotsButton), true);
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
                                                            baVar.c(LocaleController.getString("DeleteAccountIfAwayFor3", R.string.DeleteAccountIfAwayFor3), str7, privacySettingsActivity.M, false);
                                                            privacySettingsActivity.M = false;
                                                        }
                                                    } else {
                                                        baVar.b(LocaleController.getString("TelegramPassport", R.string.TelegramPassport), true);
                                                    }
                                                } else {
                                                    if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(8)) {
                                                        w02 = null;
                                                        z13 = true;
                                                        i42 = 30;
                                                    } else {
                                                        if (!privacySettingsActivity.getUserConfig().isPremium()) {
                                                            w02 = LocaleController.getString(R.string.P2PEverybody);
                                                        } else {
                                                            w02 = PrivacySettingsActivity.w0(8, privacySettingsActivity.getAccountInstance());
                                                        }
                                                        z13 = false;
                                                    }
                                                    SpannableStringBuilder t03 = PrivacySettingsActivity.t0(privacySettingsActivity, LocaleController.getString(R.string.PrivacyVoiceMessages));
                                                    i28 = privacySettingsActivity.noncontactsRow;
                                                    if (i28 != -1) {
                                                        z14 = true;
                                                    } else {
                                                        z14 = false;
                                                    }
                                                    baVar.c(t03, w02, false, z14);
                                                    baVar.getValueImageView().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23162m6, false), PorterDuff.Mode.MULTIPLY));
                                                    z17 = z13;
                                                }
                                            } else {
                                                if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(5)) {
                                                    z11 = true;
                                                    i42 = 30;
                                                } else {
                                                    str7 = PrivacySettingsActivity.w0(5, privacySettingsActivity.getAccountInstance());
                                                    z11 = false;
                                                }
                                                baVar.c(LocaleController.getString("PrivacyForwards", R.string.PrivacyForwards), str7, false, true);
                                            }
                                        } else {
                                            if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(12)) {
                                                z11 = true;
                                                i42 = 30;
                                            } else {
                                                str7 = PrivacySettingsActivity.w0(12, privacySettingsActivity.getAccountInstance());
                                                z11 = false;
                                            }
                                            baVar.c(LocaleController.getString(R.string.PrivacyGifts), str7, false, true);
                                        }
                                    } else {
                                        if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(11)) {
                                            z11 = true;
                                            i42 = 30;
                                        } else {
                                            str7 = PrivacySettingsActivity.w0(11, privacySettingsActivity.getAccountInstance());
                                            z11 = false;
                                        }
                                        baVar.c(LocaleController.getString(R.string.PrivacyBirthday), str7, false, true);
                                    }
                                } else {
                                    if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(14)) {
                                        z11 = true;
                                        i42 = 30;
                                    } else {
                                        str7 = PrivacySettingsActivity.w0(14, privacySettingsActivity.getAccountInstance());
                                        z11 = false;
                                    }
                                    baVar.c(LocaleController.getString(R.string.PrivacyMusic), str7, false, true);
                                }
                            } else {
                                if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(9)) {
                                    z11 = true;
                                    i42 = 30;
                                } else {
                                    str7 = PrivacySettingsActivity.w0(9, privacySettingsActivity.getAccountInstance());
                                    z11 = false;
                                }
                                baVar.c(LocaleController.getString("PrivacyBio", R.string.PrivacyBio), str7, false, true);
                            }
                        } else {
                            if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(4)) {
                                z11 = true;
                                i42 = 30;
                            } else {
                                str7 = PrivacySettingsActivity.w0(4, privacySettingsActivity.getAccountInstance());
                                z11 = false;
                            }
                            baVar.c(LocaleController.getString("PrivacyProfilePhoto", R.string.PrivacyProfilePhoto), str7, false, true);
                        }
                    } else {
                        if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(2)) {
                            z11 = true;
                            i42 = 30;
                        } else {
                            str7 = PrivacySettingsActivity.w0(2, privacySettingsActivity.getAccountInstance());
                            z11 = false;
                        }
                        baVar.c(LocaleController.getString("Calls", R.string.Calls), str7, false, true);
                    }
                } else {
                    if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(1)) {
                        z11 = true;
                        i42 = 30;
                    } else {
                        str7 = PrivacySettingsActivity.w0(1, privacySettingsActivity.getAccountInstance());
                        z11 = false;
                    }
                    baVar.c(LocaleController.getString(R.string.PrivacyInvites), str7, false, false);
                }
            } else {
                if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(6)) {
                    z11 = true;
                    i42 = 30;
                } else {
                    str7 = PrivacySettingsActivity.w0(6, privacySettingsActivity.getAccountInstance());
                    z11 = false;
                }
                baVar.c(LocaleController.getString("PrivacyPhone", R.string.PrivacyPhone), str7, false, true);
            }
            z17 = z11;
        } else {
            baVar.b(LocaleController.getString("WebSessionsTitle", R.string.WebSessionsTitle), false);
        }
        baVar.f24166r = z17;
        baVar.f24170y = i42;
        if (!z10) {
            if (z17) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            baVar.f24169x = f10;
        } else {
            baVar.A = true;
        }
        baVar.invalidate();
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View baVar;
        Context context = this.f44959c;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 4) {
                        if (i9 != 5) {
                            baVar = new org.telegram.ui.Cells.t8(context);
                        } else {
                            baVar = new org.telegram.ui.Cells.p8(context);
                        }
                    } else {
                        baVar = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
                    }
                } else {
                    baVar = new org.telegram.ui.Cells.m4(context);
                }
            } else {
                baVar = new org.telegram.ui.Cells.b9(context);
            }
        } else {
            baVar = new org.telegram.ui.Cells.ba(context);
        }
        return new f2.q1(baVar);
    }
}
