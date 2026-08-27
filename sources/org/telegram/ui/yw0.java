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

public final class yw0 extends org.telegram.ui.Components.yk0 {

    public final Context f44954c;
    public final PrivacySettingsActivity d;

    public yw0(PrivacySettingsActivity privacySettingsActivity, Context context) {
        this.d = privacySettingsActivity;
        this.f44954c = context;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        int iB = o1Var.b();
        PrivacySettingsActivity privacySettingsActivity = this.d;
        return iB == privacySettingsActivity.passcodeRow || iB == privacySettingsActivity.passwordRow || iB == privacySettingsActivity.passkeysRow || iB == privacySettingsActivity.blockedRow || iB == privacySettingsActivity.f35917s || iB == privacySettingsActivity.secretWebpageRow || iB == privacySettingsActivity.webSessionsRow || (iB == privacySettingsActivity.f35915n && !privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(1)) || ((iB == privacySettingsActivity.lastSeenRow && !privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(0)) || ((iB == privacySettingsActivity.callsRow && !privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(2)) || ((iB == privacySettingsActivity.profilePhotoRow && !privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(4)) || ((iB == privacySettingsActivity.bioRow && !privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(9)) || ((iB == privacySettingsActivity.musicRow && !privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(14)) || ((iB == privacySettingsActivity.birthdayRow && !privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(11)) || ((iB == privacySettingsActivity.giftsRow && !privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(12)) || ((iB == privacySettingsActivity.forwardsRow && !privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(5)) || ((iB == privacySettingsActivity.phoneNumberRow && !privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(6)) || ((iB == privacySettingsActivity.voicesRow && !privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(8)) || iB == privacySettingsActivity.noncontactsRow || ((iB == privacySettingsActivity.deleteAccountRow && !privacySettingsActivity.getContactsController().getLoadingDeleteInfo()) || ((iB == privacySettingsActivity.newChatsRow && !privacySettingsActivity.getContactsController().getLoadingGlobalSettings()) || iB == privacySettingsActivity.emailLoginRow || iB == privacySettingsActivity.paymentsClearRow || iB == privacySettingsActivity.secretMapRow || iB == privacySettingsActivity.contactsSyncRow || iB == privacySettingsActivity.C || iB == privacySettingsActivity.contactsDeleteRow || iB == privacySettingsActivity.contactsSuggestRow || iB == privacySettingsActivity.autoDeleteMesages || iB == privacySettingsActivity.D))))))))))));
    }

    @Override
    public final int h() {
        return this.d.K;
    }

    @Override
    public final int j(int i10) {
        PrivacySettingsActivity privacySettingsActivity = this.d;
        if (i10 == privacySettingsActivity.C || i10 == privacySettingsActivity.lastSeenRow || i10 == privacySettingsActivity.phoneNumberRow || i10 == privacySettingsActivity.deleteAccountRow || i10 == privacySettingsActivity.webSessionsRow || i10 == privacySettingsActivity.f35915n || i10 == privacySettingsActivity.paymentsClearRow || i10 == privacySettingsActivity.secretMapRow || i10 == privacySettingsActivity.contactsDeleteRow || i10 == privacySettingsActivity.D) {
            return 0;
        }
        if (i10 == privacySettingsActivity.h || i10 == privacySettingsActivity.A || i10 == privacySettingsActivity.f35916r || i10 == privacySettingsActivity.v || i10 == privacySettingsActivity.J || i10 == privacySettingsActivity.E || i10 == privacySettingsActivity.H || i10 == privacySettingsActivity.f35919x) {
            return 1;
        }
        if (i10 == 0 || i10 == privacySettingsActivity.f35920y || i10 == privacySettingsActivity.f35914f || i10 == privacySettingsActivity.I || i10 == privacySettingsActivity.B || i10 == privacySettingsActivity.G || i10 == privacySettingsActivity.f35918w) {
            return 2;
        }
        if (i10 == privacySettingsActivity.secretWebpageRow || i10 == privacySettingsActivity.contactsSyncRow || i10 == privacySettingsActivity.contactsSuggestRow || i10 == privacySettingsActivity.newChatsRow) {
            return 3;
        }
        if (i10 == privacySettingsActivity.F) {
            return 4;
        }
        return (i10 == privacySettingsActivity.autoDeleteMesages || i10 == privacySettingsActivity.f35917s || i10 == privacySettingsActivity.emailLoginRow || i10 == privacySettingsActivity.passwordRow || i10 == privacySettingsActivity.passkeysRow || i10 == privacySettingsActivity.passcodeRow || i10 == privacySettingsActivity.blockedRow) ? 5 : 0;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        String string;
        boolean z10;
        int i11;
        String string2;
        boolean z11;
        String str;
        String string3;
        String string4;
        int i12;
        String string5;
        String str2;
        String string6;
        int i13;
        String str3;
        boolean z12;
        CharSequence charSequence;
        String str4;
        String str5;
        String tTLString;
        int i14 = o1Var.f5793f;
        View view = o1Var.f5789a;
        int i15 = 16;
        String pluralString = null;
        boolean z13 = false;
        PrivacySettingsActivity privacySettingsActivity = this.d;
        if (i14 == 0) {
            boolean z14 = view.getTag() != null && ((Integer) view.getTag()).intValue() == i10;
            view.setTag(Integer.valueOf(i10));
            org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
            x9Var.setBetterLayout(true);
            if (i10 == privacySettingsActivity.webSessionsRow) {
                x9Var.b(LocaleController.getString("WebSessionsTitle", R.string.WebSessionsTitle), false);
            } else {
                if (i10 == privacySettingsActivity.phoneNumberRow) {
                    if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(6)) {
                        z10 = true;
                        i15 = 30;
                    } else {
                        pluralString = PrivacySettingsActivity.x0(6, privacySettingsActivity.getAccountInstance());
                        z10 = false;
                    }
                    x9Var.c(LocaleController.getString("PrivacyPhone", R.string.PrivacyPhone), pluralString, false, true);
                } else if (i10 == privacySettingsActivity.lastSeenRow) {
                    if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(0)) {
                        z10 = true;
                        i15 = 30;
                    } else {
                        pluralString = PrivacySettingsActivity.x0(0, privacySettingsActivity.getAccountInstance());
                        z10 = false;
                    }
                    x9Var.c(LocaleController.getString("PrivacyLastSeen", R.string.PrivacyLastSeen), pluralString, false, true);
                } else if (i10 == privacySettingsActivity.f35915n) {
                    if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(1)) {
                        z10 = true;
                        i15 = 30;
                    } else {
                        pluralString = PrivacySettingsActivity.x0(1, privacySettingsActivity.getAccountInstance());
                        z10 = false;
                    }
                    x9Var.c(LocaleController.getString(R.string.PrivacyInvites), pluralString, false, false);
                } else if (i10 == privacySettingsActivity.callsRow) {
                    if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(2)) {
                        z10 = true;
                        i15 = 30;
                    } else {
                        pluralString = PrivacySettingsActivity.x0(2, privacySettingsActivity.getAccountInstance());
                        z10 = false;
                    }
                    x9Var.c(LocaleController.getString("Calls", R.string.Calls), pluralString, false, true);
                } else if (i10 == privacySettingsActivity.profilePhotoRow) {
                    if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(4)) {
                        z10 = true;
                        i15 = 30;
                    } else {
                        pluralString = PrivacySettingsActivity.x0(4, privacySettingsActivity.getAccountInstance());
                        z10 = false;
                    }
                    x9Var.c(LocaleController.getString("PrivacyProfilePhoto", R.string.PrivacyProfilePhoto), pluralString, false, true);
                } else if (i10 == privacySettingsActivity.bioRow) {
                    if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(9)) {
                        z10 = true;
                        i15 = 30;
                    } else {
                        pluralString = PrivacySettingsActivity.x0(9, privacySettingsActivity.getAccountInstance());
                        z10 = false;
                    }
                    x9Var.c(LocaleController.getString("PrivacyBio", R.string.PrivacyBio), pluralString, false, true);
                } else if (i10 == privacySettingsActivity.musicRow) {
                    if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(14)) {
                        z10 = true;
                        i15 = 30;
                    } else {
                        pluralString = PrivacySettingsActivity.x0(14, privacySettingsActivity.getAccountInstance());
                        z10 = false;
                    }
                    x9Var.c(LocaleController.getString(R.string.PrivacyMusic), pluralString, false, true);
                } else if (i10 == privacySettingsActivity.birthdayRow) {
                    if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(11)) {
                        z10 = true;
                        i15 = 30;
                    } else {
                        pluralString = PrivacySettingsActivity.x0(11, privacySettingsActivity.getAccountInstance());
                        z10 = false;
                    }
                    x9Var.c(LocaleController.getString(R.string.PrivacyBirthday), pluralString, false, true);
                } else if (i10 == privacySettingsActivity.giftsRow) {
                    if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(12)) {
                        z10 = true;
                        i15 = 30;
                    } else {
                        pluralString = PrivacySettingsActivity.x0(12, privacySettingsActivity.getAccountInstance());
                        z10 = false;
                    }
                    x9Var.c(LocaleController.getString(R.string.PrivacyGifts), pluralString, false, true);
                } else if (i10 == privacySettingsActivity.forwardsRow) {
                    if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(5)) {
                        z10 = true;
                        i15 = 30;
                    } else {
                        pluralString = PrivacySettingsActivity.x0(5, privacySettingsActivity.getAccountInstance());
                        z10 = false;
                    }
                    x9Var.c(LocaleController.getString("PrivacyForwards", R.string.PrivacyForwards), pluralString, false, true);
                } else if (i10 == privacySettingsActivity.voicesRow) {
                    if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(8)) {
                        string2 = null;
                        z11 = true;
                        i15 = 30;
                    } else {
                        string2 = !privacySettingsActivity.getUserConfig().isPremium() ? LocaleController.getString(R.string.P2PEverybody) : PrivacySettingsActivity.x0(8, privacySettingsActivity.getAccountInstance());
                        z11 = false;
                    }
                    x9Var.c(PrivacySettingsActivity.u0(privacySettingsActivity, LocaleController.getString(R.string.PrivacyVoiceMessages)), string2, false, privacySettingsActivity.noncontactsRow != -1);
                    x9Var.getValueImageView().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23215m6, false), PorterDuff.Mode.MULTIPLY));
                    z13 = z11;
                } else if (i10 == privacySettingsActivity.noncontactsRow) {
                    if (privacySettingsActivity.U) {
                        i11 = R.string.ContactsAndFee;
                    } else {
                        i11 = privacySettingsActivity.T ? R.string.ContactsAndPremium : R.string.P2PEverybody;
                    }
                    x9Var.c((!privacySettingsActivity.getMessagesController().newNoncontactPeersRequirePremiumWithoutOwnpremium || privacySettingsActivity.getMessagesController().starsPaidMessagesAvailable) ? PrivacySettingsActivity.u0(privacySettingsActivity, LocaleController.getString(R.string.PrivacyMessages)) : LocaleController.getString(R.string.PrivacyMessages), LocaleController.getString(i11), false, privacySettingsActivity.musicRow != -1);
                } else if (i10 == privacySettingsActivity.C) {
                    x9Var.b(LocaleController.getString("TelegramPassport", R.string.TelegramPassport), true);
                } else if (i10 == privacySettingsActivity.deleteAccountRow) {
                    if (privacySettingsActivity.getContactsController().getLoadingDeleteInfo()) {
                        z10 = true;
                    } else {
                        int deleteAccountTTL = privacySettingsActivity.getContactsController().getDeleteAccountTTL();
                        if (deleteAccountTTL <= 182) {
                            pluralString = LocaleController.formatPluralString("Months", deleteAccountTTL / 30, new Object[0]);
                        } else if (deleteAccountTTL == 365) {
                            pluralString = LocaleController.formatPluralString("Months", 12, new Object[0]);
                        } else if (deleteAccountTTL == 548) {
                            pluralString = LocaleController.formatPluralString("Months", 18, new Object[0]);
                        } else if (deleteAccountTTL == 730) {
                            pluralString = LocaleController.formatPluralString("Months", 24, new Object[0]);
                        } else {
                            pluralString = deleteAccountTTL > 30 ? LocaleController.formatPluralString("Months", (int) Math.round(((double) deleteAccountTTL) / 30.0d), new Object[0]) : LocaleController.formatPluralString("Days", deleteAccountTTL, new Object[0]);
                        }
                        z10 = false;
                    }
                    x9Var.c(LocaleController.getString("DeleteAccountIfAwayFor3", R.string.DeleteAccountIfAwayFor3), pluralString, privacySettingsActivity.M, false);
                    privacySettingsActivity.M = false;
                } else if (i10 == privacySettingsActivity.paymentsClearRow) {
                    x9Var.b(LocaleController.getString("PrivacyPaymentsClear", R.string.PrivacyPaymentsClear), true);
                } else if (i10 == privacySettingsActivity.D) {
                    x9Var.b(LocaleController.getString(R.string.PrivacyBiometryBotsButton), true);
                } else if (i10 == privacySettingsActivity.secretMapRow) {
                    int i16 = SharedConfig.mapPreviewType;
                    if (i16 == 0) {
                        string = LocaleController.getString("MapPreviewProviderTelegram", R.string.MapPreviewProviderTelegram);
                    } else if (i16 != 1) {
                        string = i16 != 2 ? LocaleController.getString("MapPreviewProviderYandex", R.string.MapPreviewProviderYandex) : LocaleController.getString("MapPreviewProviderNobody", R.string.MapPreviewProviderNobody);
                    } else {
                        string = LocaleController.getString("MapPreviewProviderGoogle", R.string.MapPreviewProviderGoogle);
                    }
                    x9Var.c(LocaleController.getString("MapPreviewProvider", R.string.MapPreviewProvider), string, privacySettingsActivity.N, true);
                    privacySettingsActivity.N = false;
                } else if (i10 == privacySettingsActivity.contactsDeleteRow) {
                    x9Var.b(LocaleController.getString("SyncContactsDelete", R.string.SyncContactsDelete), true);
                }
                z13 = z10;
            }
            x9Var.f25962r = z13;
            x9Var.f25966y = i15;
            if (z14) {
                x9Var.A = true;
            } else {
                x9Var.f25965x = z13 ? 1.0f : 0.0f;
            }
            x9Var.invalidate();
            return;
        }
        if (i14 == 1) {
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
            if (i10 == privacySettingsActivity.A) {
                x8Var.setText(LocaleController.getString("DeleteAccountHelp", R.string.DeleteAccountHelp));
                return;
            }
            if (i10 == privacySettingsActivity.f35916r) {
                x8Var.setText(LocaleController.getString("GroupsAndChannelsHelp", R.string.GroupsAndChannelsHelp));
                return;
            }
            if (i10 == privacySettingsActivity.v) {
                x8Var.setText(LocaleController.getString("SessionsSettingsInfo", R.string.SessionsSettingsInfo));
                return;
            }
            if (i10 == privacySettingsActivity.J) {
                x8Var.setText(LocaleController.getString("SecretWebPageInfo", R.string.SecretWebPageInfo));
                return;
            }
            if (i10 == privacySettingsActivity.E) {
                x8Var.setText(LocaleController.getString("PrivacyBotsInfo", R.string.PrivacyBotsInfo));
                return;
            }
            if (i10 == privacySettingsActivity.h) {
                x8Var.setText(LocaleController.getString(R.string.PrivacyInvitesInfo));
                return;
            } else if (i10 == privacySettingsActivity.H) {
                x8Var.setText(LocaleController.getString("SuggestContactsInfo", R.string.SuggestContactsInfo));
                return;
            } else {
                if (i10 == privacySettingsActivity.f35919x) {
                    x8Var.setText(LocaleController.getString("ArchiveAndMuteInfo", R.string.ArchiveAndMuteInfo));
                    return;
                }
                return;
            }
        }
        if (i14 == 2) {
            org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
            if (i10 == privacySettingsActivity.f35914f) {
                j4Var.setText(LocaleController.getString("PrivacyTitle", R.string.PrivacyTitle));
                return;
            }
            if (i10 == 0) {
                j4Var.setText(LocaleController.getString("SecurityTitle", R.string.SecurityTitle));
                return;
            }
            if (i10 == privacySettingsActivity.f35920y) {
                j4Var.setText(LocaleController.getString("DeleteMyAccount", R.string.DeleteMyAccount));
                return;
            }
            if (i10 == privacySettingsActivity.I) {
                j4Var.setText(LocaleController.getString("SecretChat", R.string.SecretChat));
                return;
            }
            if (i10 == privacySettingsActivity.B) {
                j4Var.setText(LocaleController.getString("PrivacyBots", R.string.PrivacyBots));
                return;
            } else if (i10 == privacySettingsActivity.G) {
                j4Var.setText(LocaleController.getString("Contacts", R.string.Contacts));
                return;
            } else {
                if (i10 == privacySettingsActivity.f35918w) {
                    j4Var.setText(LocaleController.getString("NewChatsFromNonContacts", R.string.NewChatsFromNonContacts));
                    return;
                }
                return;
            }
        }
        if (i14 == 3) {
            org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
            if (i10 == privacySettingsActivity.secretWebpageRow) {
                p8Var.f(LocaleController.getString("SecretWebPage", R.string.SecretWebPage), privacySettingsActivity.getMessagesController().secretWebpagePreview == 1, false);
                return;
            }
            if (i10 == privacySettingsActivity.contactsSyncRow) {
                p8Var.f(LocaleController.getString("SyncContacts", R.string.SyncContacts), privacySettingsActivity.P, true);
                return;
            } else if (i10 == privacySettingsActivity.contactsSuggestRow) {
                p8Var.f(LocaleController.getString("SuggestContacts", R.string.SuggestContacts), privacySettingsActivity.R, false);
                return;
            } else {
                if (i10 == privacySettingsActivity.newChatsRow) {
                    p8Var.f(LocaleController.getString("ArchiveAndMute", R.string.ArchiveAndMute), privacySettingsActivity.S, false);
                    return;
                }
                return;
            }
        }
        if (i14 != 5) {
            return;
        }
        org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
        boolean z15 = view.getTag() != null && ((Integer) view.getTag()).intValue() == i10;
        view.setTag(Integer.valueOf(i10));
        l8Var.setPrioritizeTitleOverValue(false);
        org.telegram.ui.Components.j6 j6Var = l8Var.f24630c;
        if (i10 == privacySettingsActivity.autoDeleteMesages) {
            int globalTTl = privacySettingsActivity.getUserConfig().getGlobalTTl();
            if (globalTTl == -1) {
                tTLString = null;
                z13 = true;
            } else {
                tTLString = globalTTl > 0 ? LocaleController.formatTTLString(globalTTl * 60) : LocaleController.getString("PasswordOff", R.string.PasswordOff);
            }
            l8Var.s(LocaleController.getString("AutoDeleteMessages", R.string.AutoDeleteMessages), tTLString, true, R.drawable.msg2_autodelete, true);
        } else {
            String str6 = "";
            if (i10 == privacySettingsActivity.f35917s) {
                if (privacySettingsActivity.W.j0() == 0) {
                    if (privacySettingsActivity.getMessagesController().lastKnownSessionsCount == 0) {
                        str5 = "";
                        z13 = true;
                    } else {
                        str4 = String.format(LocaleController.getInstance().getCurrentLocale(), "%d", Integer.valueOf(privacySettingsActivity.getMessagesController().lastKnownSessionsCount));
                    }
                    privacySettingsActivity.getMessagesController().lastKnownSessionsCount = privacySettingsActivity.W.j0();
                    l8Var.s(LocaleController.getString(R.string.SessionsTitle), str5, true, R.drawable.msg2_devices, false);
                } else {
                    str4 = String.format(LocaleController.getInstance().getCurrentLocale(), "%d", Integer.valueOf(privacySettingsActivity.W.j0()));
                }
                str5 = str4;
                privacySettingsActivity.getMessagesController().lastKnownSessionsCount = privacySettingsActivity.W.j0();
                l8Var.s(LocaleController.getString(R.string.SessionsTitle), str5, true, R.drawable.msg2_devices, false);
            } else if (i10 == privacySettingsActivity.emailLoginRow) {
                TL_account.Password password = privacySettingsActivity.d;
                if (password == null) {
                    z12 = true;
                    charSequence = str6;
                } else {
                    SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(password.login_email_pattern);
                    int iIndexOf = privacySettingsActivity.d.login_email_pattern.indexOf(42);
                    int iLastIndexOf = privacySettingsActivity.d.login_email_pattern.lastIndexOf(42);
                    if (iIndexOf != iLastIndexOf && iIndexOf != -1 && iLastIndexOf != -1) {
                        org.telegram.ui.Components.xz0 xz0Var = new org.telegram.ui.Components.xz0();
                        xz0Var.f34734a |= 256;
                        xz0Var.f34735b = iIndexOf;
                        int i17 = iLastIndexOf + 1;
                        xz0Var.f34736c = i17;
                        spannableStringBuilderValueOf.setSpan(new org.telegram.ui.Components.yz0(xz0Var, 0), iIndexOf, i17, 0);
                    }
                    z12 = false;
                    charSequence = spannableStringBuilderValueOf;
                }
                l8Var.setPrioritizeTitleOverValue(true);
                String string7 = LocaleController.getString(R.string.EmailLogin);
                int i18 = R.drawable.msg2_email;
                l8Var.f24636w = 16;
                l8Var.f24635s = 58;
                org.telegram.ui.ActionBar.h5 h5Var = l8Var.f24628a;
                h5Var.l(string7, false);
                h5Var.i(null);
                org.telegram.ui.ActionBar.h5 h5Var2 = l8Var.d;
                h5Var2.setVisibility(0);
                h5Var2.l(charSequence, false);
                j6Var.setVisibility(8);
                l8Var.h.setVisibility(8);
                org.telegram.ui.Components.ri0 ri0Var = l8Var.f24631e;
                ri0Var.setVisibility(0);
                ri0Var.setTranslationX(0.0f);
                ri0Var.setTranslationY(0.0f);
                ri0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
                ri0Var.setImageResource(i18);
                l8Var.f24634r = true;
                l8Var.setWillNotDraw(false);
                Switch r10 = l8Var.f24632f;
                if (r10 != null) {
                    r10.setVisibility(8);
                }
                org.telegram.ui.Components.i5 i5Var = l8Var.G;
                if (i5Var != null) {
                    i5Var.g(null, false);
                }
                z13 = z12;
            } else if (i10 == privacySettingsActivity.passwordRow) {
                int i19 = R.drawable.menu_2sv;
                TL_account.Password password2 = privacySettingsActivity.d;
                if (password2 == null) {
                    i13 = i19;
                    str3 = "";
                    z13 = true;
                } else {
                    if (password2.has_password) {
                        i19 = R.drawable.menu_2sv_on;
                        string6 = LocaleController.getString(R.string.PasswordOn);
                    } else {
                        string6 = LocaleController.getString(R.string.PasswordOff);
                    }
                    i13 = i19;
                    str3 = string6;
                }
                l8Var.s(LocaleController.getString(R.string.TwoStepVerification), str3, true, i13, true);
            } else if (i10 == privacySettingsActivity.passkeysRow) {
                ArrayList arrayList = privacySettingsActivity.f35913e;
                if (arrayList == null) {
                    str2 = "";
                    z13 = true;
                } else {
                    if (arrayList.size() == 1 && j6Var.getPaint().measureText(((TL_account.Passkey) privacySettingsActivity.f35913e.get(0)).name) < AndroidUtilities.displaySize.x / 3.0f) {
                        string5 = ((TL_account.Passkey) privacySettingsActivity.f35913e.get(0)).name;
                    } else if (privacySettingsActivity.f35913e.size() > 0) {
                        string5 = privacySettingsActivity.f35913e.size() + "";
                    } else {
                        string5 = LocaleController.getString(R.string.PasswordOff);
                    }
                    str2 = string5;
                }
                l8Var.s(LocaleController.getString(R.string.Passkey), str2, true, R.drawable.msg2_permissions, true);
            } else if (i10 == privacySettingsActivity.passcodeRow) {
                if (SharedConfig.passcodeHash.length() != 0) {
                    string4 = LocaleController.getString(R.string.PasswordOn);
                    i12 = R.drawable.msg2_secret;
                } else {
                    string4 = LocaleController.getString(R.string.PasswordOff);
                    i12 = R.drawable.msg2_secret;
                }
                l8Var.s(LocaleController.getString(R.string.Passcode), string4, true, i12, true);
            } else if (i10 == privacySettingsActivity.blockedRow) {
                int i20 = privacySettingsActivity.getMessagesController().totalBlockedCount;
                if (i20 == 0) {
                    string3 = LocaleController.getString("BlockedEmpty", R.string.BlockedEmpty);
                } else {
                    if (i20 > 0) {
                        string3 = String.format(LocaleController.getInstance().getCurrentLocale(), "%d", Integer.valueOf(i20));
                    } else {
                        str = "";
                        z13 = true;
                    }
                    l8Var.s(LocaleController.getString("BlockedUsers", R.string.BlockedUsers), str, true, R.drawable.msg2_block2, true);
                }
                str = string3;
                l8Var.s(LocaleController.getString("BlockedUsers", R.string.BlockedUsers), str, true, R.drawable.msg2_block2, true);
            }
        }
        l8Var.f(16, z13, z15);
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View x9Var;
        Context context = this.f44954c;
        if (i10 == 0) {
            x9Var = new org.telegram.ui.Cells.x9(context);
        } else if (i10 == 1) {
            x9Var = new org.telegram.ui.Cells.x8(context);
        } else if (i10 == 2) {
            x9Var = new org.telegram.ui.Cells.j4(context);
        } else if (i10 != 4) {
            x9Var = i10 != 5 ? new org.telegram.ui.Cells.p8(context) : new org.telegram.ui.Cells.l8(context);
        } else {
            x9Var = new org.telegram.ui.Cells.w6(context, (org.telegram.messenger.rl) null);
        }
        return new org.telegram.ui.Components.lk0(x9Var);
    }
}
