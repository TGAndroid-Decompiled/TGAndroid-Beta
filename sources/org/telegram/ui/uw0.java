package org.telegram.ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class uw0 extends org.telegram.ui.Components.yk0 {

    public final Context f43303c;
    public final PrivacyControlActivity d;

    public uw0(PrivacyControlActivity privacyControlActivity, Context context) {
        this.d = privacyControlActivity;
        this.f43303c = context;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        int iB = o1Var.b();
        PrivacyControlActivity privacyControlActivity = this.d;
        if ((iB == privacyControlActivity.X && !ContactsController.getInstance(((org.telegram.ui.ActionBar.n2) privacyControlActivity).currentAccount).getLoadingPrivacyInfo(3)) || iB == privacyControlActivity.currentPhotoForRestRow || iB == privacyControlActivity.V || iB == privacyControlActivity.photoForRestRow || iB == privacyControlActivity.readRow || iB == privacyControlActivity.showGiftIconRow || iB == privacyControlActivity.f35875a0 || iB == privacyControlActivity.f35888j0 || iB == privacyControlActivity.f35889k0 || iB == privacyControlActivity.f35890l0 || iB == privacyControlActivity.f35887i0 || iB == privacyControlActivity.f35886h0) {
            return true;
        }
        if (privacyControlActivity.f35905x == 12 && privacyControlActivity.u0()) {
            return false;
        }
        return iB == privacyControlActivity.nobodyRow || iB == privacyControlActivity.K || iB == privacyControlActivity.f35879c0 || iB == privacyControlActivity.everybodyRow || iB == privacyControlActivity.P || iB == privacyControlActivity.O;
    }

    public final int E(ArrayList arrayList) {
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            long jLongValue = ((Long) arrayList.get(i11)).longValue();
            if (jLongValue > 0) {
                i10++;
            } else {
                TLRPC.Chat chat = this.d.getMessagesController().getChat(Long.valueOf(-jLongValue));
                if (chat != null) {
                    i10 += chat.participants_count;
                }
            }
        }
        return i10;
    }

    @Override
    public final int h() {
        return this.d.f35892n0;
    }

    @Override
    public final int j(int i10) {
        PrivacyControlActivity privacyControlActivity = this.d;
        if (i10 == privacyControlActivity.O || i10 == privacyControlActivity.P || i10 == privacyControlActivity.X || i10 == privacyControlActivity.f35875a0) {
            return 0;
        }
        if (i10 == privacyControlActivity.Q || i10 == privacyControlActivity.L || i10 == privacyControlActivity.M || i10 == privacyControlActivity.f35884f0 || i10 == privacyControlActivity.Y || i10 == privacyControlActivity.V || i10 == privacyControlActivity.Z || i10 == privacyControlActivity.f35877b0 || i10 == privacyControlActivity.setBirthdayRow || i10 == privacyControlActivity.f35885g0 || i10 == privacyControlActivity.m0) {
            return 1;
        }
        if (i10 == privacyControlActivity.J || i10 == privacyControlActivity.f35880d0 || i10 == privacyControlActivity.N || i10 == privacyControlActivity.W || i10 == privacyControlActivity.R || i10 == privacyControlActivity.giftTypesHeaderRow) {
            return 2;
        }
        if (i10 == privacyControlActivity.everybodyRow || i10 == privacyControlActivity.K || i10 == privacyControlActivity.nobodyRow || i10 == privacyControlActivity.f35879c0 || i10 == privacyControlActivity.S || i10 == privacyControlActivity.T) {
            return 3;
        }
        if (i10 == privacyControlActivity.I) {
            return 4;
        }
        if (i10 == privacyControlActivity.U) {
            return 5;
        }
        if (i10 == privacyControlActivity.photoForRestRow) {
            return 6;
        }
        if (i10 == privacyControlActivity.currentPhotoForRestRow) {
            return 7;
        }
        if (i10 == privacyControlActivity.readRow || i10 == privacyControlActivity.showGiftIconRow || i10 == privacyControlActivity.f35888j0 || i10 == privacyControlActivity.f35889k0 || i10 == privacyControlActivity.f35890l0 || i10 == privacyControlActivity.f35886h0 || i10 == privacyControlActivity.f35887i0) {
            return 8;
        }
        if (i10 == privacyControlActivity.priceRow) {
            return 9;
        }
        return i10 == privacyControlActivity.f35882e0 ? 10 : 0;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        PrivacyControlActivity privacyControlActivity = this.d;
        boolean[] zArr = privacyControlActivity.A;
        int i11 = privacyControlActivity.f35905x;
        int i12 = o1Var.f5793f;
        View view = o1Var.f5789a;
        int i13 = 9;
        final int i14 = 1;
        boolean z10 = false;
        i = 0;
        int i15 = 0;
        i = 0;
        int i16 = 0;
        i = 0;
        int i17 = 0;
        i = 0;
        int i18 = 0;
        i = 0;
        int i19 = 0;
        if (i12 == 0) {
            org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
            x9Var.setTextColor(privacyControlActivity.getThemedColor(org.telegram.ui.ActionBar.g6.G6));
            if (i10 == privacyControlActivity.O) {
                String pluralString = privacyControlActivity.C.size() != 0 ? LocaleController.formatPluralString("Users", E(privacyControlActivity.C), new Object[0]) : LocaleController.getString(R.string.EmpryUsersPlaceholder);
                if (privacyControlActivity.f35907y[privacyControlActivity.E == 2 ? (char) 0 : (char) 1]) {
                    ArrayList arrayList = privacyControlActivity.C;
                    pluralString = (arrayList == null || arrayList.isEmpty()) ? LocaleController.formatString(R.string.PrivacyPremium, new Object[0]) : LocaleController.formatString(R.string.PrivacyPremiumAnd, pluralString);
                }
                if (i11 != 10) {
                    int i20 = privacyControlActivity.E;
                    if (zArr[i20] && i20 != 0) {
                        ArrayList arrayList2 = privacyControlActivity.C;
                        pluralString = (arrayList2 == null || arrayList2.isEmpty()) ? LocaleController.formatString(R.string.PrivacyValueBots, new Object[0]) : LocaleController.formatString(R.string.PrivacyValueBotsAnd, pluralString);
                    }
                }
                if (i11 == 10) {
                    x9Var.c(LocaleController.getString(R.string.PrivateMessagesExceptions), pluralString, false, false);
                } else if (i11 == 0 || i11 == 4 || i11 == 9 || i11 == 14) {
                    x9Var.c(LocaleController.getString(R.string.AlwaysShareWith), pluralString, false, privacyControlActivity.P != -1);
                } else {
                    x9Var.c(LocaleController.getString(R.string.AlwaysAllow), pluralString, false, privacyControlActivity.P != -1);
                }
                if (i11 == 12) {
                    x9Var.setEnabled(!privacyControlActivity.u0());
                    return;
                }
                return;
            }
            if (i10 != privacyControlActivity.P) {
                if (i10 == privacyControlActivity.X) {
                    x9Var.c(LocaleController.getString(R.string.PrivacyP2P2), ContactsController.getInstance(((org.telegram.ui.ActionBar.n2) privacyControlActivity).currentAccount).getLoadingPrivacyInfo(3) ? LocaleController.getString(R.string.Loading) : PrivacySettingsActivity.x0(3, privacyControlActivity.getAccountInstance()), false, false);
                    return;
                } else {
                    if (i10 == privacyControlActivity.f35875a0) {
                        x9Var.b(LocaleController.getString(privacyControlActivity.getUserConfig().isPremium() ? R.string.PrivacyLastSeenPremiumForPremium : R.string.PrivacyLastSeenPremium), false);
                        x9Var.setTextColor(privacyControlActivity.getThemedColor(org.telegram.ui.ActionBar.g6.f23234n6));
                        return;
                    }
                    return;
                }
            }
            String pluralString2 = privacyControlActivity.D.size() != 0 ? LocaleController.formatPluralString("Users", E(privacyControlActivity.D), new Object[0]) : LocaleController.getString(R.string.EmpryUsersPlaceholder);
            int i21 = privacyControlActivity.E;
            if (zArr[i21] && i21 == 0) {
                ArrayList arrayList3 = privacyControlActivity.D;
                pluralString2 = (arrayList3 == null || arrayList3.isEmpty()) ? LocaleController.formatString(R.string.PrivacyValueBots, new Object[0]) : LocaleController.formatString(R.string.PrivacyValueBotsAnd, pluralString2);
            }
            if (i11 == 0 || i11 == 4 || i11 == 9 || i11 == 14) {
                x9Var.c(LocaleController.getString(R.string.NeverShareWith), pluralString2, false, false);
            } else {
                x9Var.c(LocaleController.getString(R.string.NeverAllow), pluralString2, false, false);
            }
            if (i11 == 12) {
                x9Var.setEnabled(!privacyControlActivity.u0());
                return;
            }
            return;
        }
        if (i12 == 1) {
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
            if (i10 == privacyControlActivity.M) {
                x8Var.setText(LocaleController.getString(R.string.PrivateMessagesChargePriceInfo));
            } else {
                int i22 = privacyControlActivity.L;
                if (i10 == i22 && i11 == 10) {
                    String string = LocaleController.getString(R.string.PrivacyMessagesInfo);
                    final int i23 = z10 ? 1 : 0;
                    x8Var.setText(AndroidUtilities.replaceSingleTag(string, new Runnable(this) {

                        public final uw0 f42354b;

                        {
                            this.f42354b = this;
                        }

                        @Override
                        public final void run() {
                            switch (i23) {
                                case 0:
                                    this.f42354b.d.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                                    break;
                                default:
                                    uw0 uw0Var = this.f42354b;
                                    PrivacyControlActivity privacyControlActivity2 = uw0Var.d;
                                    privacyControlActivity2.showDialog(org.telegram.ui.Components.y4.m(privacyControlActivity2.getParentActivity(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new sw0(uw0Var, 1), null, false, false, privacyControlActivity2.getResourceProvider()).f23994a);
                                    break;
                            }
                        }
                    }));
                } else if (i10 == i22 && i11 == 8) {
                    x8Var.setText(LocaleController.getString(R.string.PrivacyVoiceMessagesInfo));
                } else if (i10 == privacyControlActivity.setBirthdayRow) {
                    x8Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PrivacyBirthdaySet), new Runnable(this) {

                        public final uw0 f42354b;

                        {
                            this.f42354b = this;
                        }

                        @Override
                        public final void run() {
                            switch (i14) {
                                case 0:
                                    this.f42354b.d.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                                    break;
                                default:
                                    uw0 uw0Var = this.f42354b;
                                    PrivacyControlActivity privacyControlActivity2 = uw0Var.d;
                                    privacyControlActivity2.showDialog(org.telegram.ui.Components.y4.m(privacyControlActivity2.getParentActivity(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new sw0(uw0Var, 1), null, false, false, privacyControlActivity2.getResourceProvider()).f23994a);
                                    break;
                            }
                        }
                    }), true));
                } else if (i10 == privacyControlActivity.L) {
                    if (i11 == 6) {
                        if (privacyControlActivity.E == 1 && privacyControlActivity.F == 1) {
                            x8Var.setText(LocaleController.getString(R.string.PrivacyPhoneInfo3));
                        } else {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            Locale locale = Locale.ENGLISH;
                            String strE = s3.c.e("https://t.me/+", privacyControlActivity.getUserConfig().getClientPhone());
                            SpannableString spannableString = new SpannableString(strE);
                            spannableString.setSpan(new tw0(this, strE), 0, strE.length(), 33);
                            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.PrivacyPhoneInfo)).append((CharSequence) "\n\n").append((CharSequence) LocaleController.getString(R.string.PrivacyPhoneInfo4)).append((CharSequence) "\n").append((CharSequence) spannableString);
                            x8Var.setText(spannableStringBuilder);
                        }
                    } else if (i11 == 5) {
                        x8Var.setText(LocaleController.getString(R.string.PrivacyForwardsInfo));
                    } else if (i11 == 4) {
                        x8Var.setText(LocaleController.getString(R.string.PrivacyProfilePhotoInfo));
                    } else if (i11 == 9) {
                        x8Var.setText(LocaleController.getString(R.string.PrivacyBioInfo3));
                    } else if (i11 == 14) {
                        x8Var.setText(LocaleController.getString(R.string.PrivacyMusicInfo3));
                    } else if (i11 == 11) {
                        x8Var.setText(LocaleController.getString(R.string.PrivacyBirthdayInfo));
                    } else if (i11 == 12) {
                        x8Var.setText(LocaleController.getString(R.string.PrivacyGiftsInfo));
                    } else if (i11 == 3) {
                        x8Var.setText(LocaleController.getString(R.string.PrivacyCallsP2PHelp));
                    } else if (i11 == 2) {
                        x8Var.setText(LocaleController.getString(R.string.WhoCanCallMeInfo));
                    } else if (i11 == 1) {
                        x8Var.setText(LocaleController.getString(R.string.WhoCanAddMeInfo));
                    } else {
                        x8Var.setText(LocaleController.getString(R.string.CustomHelp));
                    }
                } else if (i10 == privacyControlActivity.Q) {
                    if (i11 == 6) {
                        x8Var.setText(LocaleController.getString(R.string.PrivacyPhoneInfo2));
                    } else if (i11 == 5) {
                        x8Var.setText(LocaleController.getString(R.string.PrivacyForwardsInfo2));
                    } else if (i11 == 4) {
                        int i24 = privacyControlActivity.E;
                        if (i24 == 2) {
                            x8Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PrivacyProfilePhotoInfo5)));
                        } else if (i24 == 0) {
                            x8Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PrivacyProfilePhotoInfo3)));
                        } else {
                            x8Var.setText(LocaleController.getString(R.string.PrivacyProfilePhotoInfo4));
                        }
                    } else if (i11 == 3) {
                        x8Var.setText(LocaleController.getString(R.string.CustomP2PInfo));
                    } else if (i11 == 9) {
                        x8Var.setText(LocaleController.getString(R.string.PrivacyBioInfo));
                    } else if (i11 == 14) {
                        x8Var.setText(LocaleController.getString(R.string.PrivacyMusicInfo));
                    } else if (i11 == 11) {
                        x8Var.setText(LocaleController.getString(R.string.PrivacyBirthdayInfo3));
                    } else if (i11 == 2) {
                        x8Var.setText(LocaleController.getString(R.string.CustomCallInfo));
                    } else if (i11 == 1) {
                        x8Var.setText(LocaleController.getString(R.string.CustomShareInfo));
                    } else if (i11 == 12) {
                        x8Var.setText(LocaleController.getString(R.string.CustomShareGiftsInfo));
                    } else if (i11 == 8) {
                        x8Var.setText(LocaleController.getString(R.string.PrivacyVoiceMessagesInfo2));
                    } else if (i11 == 10) {
                        x8Var.setText(LocaleController.getString(R.string.PrivateMessagesExceptionsInfo));
                    } else {
                        x8Var.setText(LocaleController.getString(R.string.CustomShareSettingsHelp));
                    }
                } else if (i10 == privacyControlActivity.V) {
                    x8Var.setText(LocaleController.getString(R.string.PhotoForRestDescription));
                } else if (i10 == privacyControlActivity.Z) {
                    x8Var.setText(LocaleController.getString(R.string.HideReadTimeInfo));
                } else if (i10 == privacyControlActivity.f35877b0) {
                    x8Var.setText(LocaleController.getString(privacyControlActivity.getUserConfig().isPremium() ? R.string.PrivacyLastSeenPremiumInfoForPremium : R.string.PrivacyLastSeenPremiumInfo));
                } else if (i10 == privacyControlActivity.f35884f0) {
                    x8Var.setText(LocaleController.formatString(R.string.PrivateMessagesPriceInfo, nh.k.G0(privacyControlActivity.getMessagesController().starsPaidMessageCommissionPermille), String.valueOf(((double) ((int) ((((double) (privacyControlActivity.H * (privacyControlActivity.getMessagesController().starsPaidMessageCommissionPermille / 1000.0f))) / 1000.0d) * ((double) privacyControlActivity.getMessagesController().starsUsdWithdrawRate1000)))) / 100.0d)));
                } else if (i10 == privacyControlActivity.f35885g0) {
                    SpannableString spannableString2 = new SpannableString("g");
                    org.telegram.ui.Components.cq cqVar = new org.telegram.ui.Components.cq(R.drawable.msg_input_gift, 0);
                    cqVar.setScale(0.583f, 0.583f);
                    spannableString2.setSpan(cqVar, 0, 1, 33);
                    x8Var.setText(LocaleController.formatSpannable(R.string.PrivacyGiftsShowIconInfo, spannableString2));
                } else if (i10 == privacyControlActivity.m0) {
                    x8Var.setText(LocaleController.getString(R.string.PrivacyGiftsTypeInfo));
                }
            }
            x8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false));
            return;
        }
        if (i12 == 2) {
            org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
            if (i10 != privacyControlActivity.J) {
                if (i10 == privacyControlActivity.N) {
                    if (i11 == 10) {
                        j4Var.setText(LocaleController.getString(R.string.PrivateMessagesExceptionsHeader));
                        return;
                    } else {
                        j4Var.setText(LocaleController.getString(R.string.AddExceptions));
                        return;
                    }
                }
                if (i10 == privacyControlActivity.W) {
                    j4Var.setText(LocaleController.getString(R.string.PrivacyP2PHeader));
                    return;
                }
                if (i10 == privacyControlActivity.R) {
                    j4Var.setText(LocaleController.getString(R.string.PrivacyPhoneTitle2));
                    return;
                } else if (i10 == privacyControlActivity.f35880d0) {
                    j4Var.setText(LocaleController.getString(R.string.PrivateMessagesPriceHeader));
                    return;
                } else {
                    if (i10 == privacyControlActivity.giftTypesHeaderRow) {
                        j4Var.setText(LocaleController.getString(R.string.PrivacyGiftsTypeHeader));
                        return;
                    }
                    return;
                }
            }
            if (i11 == 6) {
                j4Var.setText(LocaleController.getString(R.string.PrivacyPhoneTitle));
                return;
            }
            if (i11 == 5) {
                j4Var.setText(LocaleController.getString(R.string.PrivacyForwardsTitle));
                return;
            }
            if (i11 == 4) {
                j4Var.setText(LocaleController.getString(R.string.PrivacyProfilePhotoTitle));
                return;
            }
            if (i11 == 9) {
                j4Var.setText(LocaleController.getString(R.string.PrivacyBioTitle));
                return;
            }
            if (i11 == 14) {
                j4Var.setText(LocaleController.getString(R.string.PrivacyMusicTitle));
                return;
            }
            if (i11 == 3) {
                j4Var.setText(LocaleController.getString(R.string.P2PEnabledWith));
                return;
            }
            if (i11 == 2) {
                j4Var.setText(LocaleController.getString(R.string.WhoCanCallMe));
                return;
            }
            if (i11 == 1) {
                j4Var.setText(LocaleController.getString(R.string.WhoCanAddMe));
                return;
            }
            if (i11 == 8) {
                j4Var.setText(LocaleController.getString(R.string.PrivacyVoiceMessagesTitle));
                return;
            }
            if (i11 == 10) {
                j4Var.setText(LocaleController.getString(R.string.PrivacyMessagesTitle));
                return;
            }
            if (i11 == 11) {
                j4Var.setText(LocaleController.getString(R.string.PrivacyBirthdayTitle));
                return;
            } else if (i11 == 12) {
                j4Var.setText(LocaleController.getString(R.string.PrivacyGiftsTitle));
                return;
            } else {
                j4Var.setText(LocaleController.getString(R.string.LastSeenTitle));
                return;
            }
        }
        if (i12 == 3) {
            org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) view;
            g6Var.setRadioIcon(null);
            if (i10 == privacyControlActivity.everybodyRow || i10 == privacyControlActivity.K || i10 == privacyControlActivity.nobodyRow || i10 == privacyControlActivity.f35879c0) {
                if (i10 == privacyControlActivity.everybodyRow) {
                    if (i11 == 3) {
                        g6Var.c(LocaleController.getString(R.string.P2PEverybody), privacyControlActivity.E == 0, true);
                    } else {
                        g6Var.c(LocaleController.getString(R.string.LastSeenEverybody), privacyControlActivity.E == 0, true);
                    }
                } else if (i10 == privacyControlActivity.K) {
                    if ((i11 == 8 && !privacyControlActivity.getUserConfig().isPremium()) || (i11 == 10 && !privacyControlActivity.getMessagesController().newNoncontactPeersRequirePremiumWithoutOwnpremium && !privacyControlActivity.getUserConfig().isPremium())) {
                        g6Var.setRadioIcon(privacyControlActivity.getParentActivity().getResources().getDrawable(R.drawable.mini_switch_lock).mutate());
                    }
                    if (i11 == 3) {
                        g6Var.c(LocaleController.getString(R.string.P2PContacts), privacyControlActivity.E == 2, (privacyControlActivity.nobodyRow == -1 && privacyControlActivity.f35879c0 == -1) ? false : true);
                    } else if (i11 == 10) {
                        g6Var.c(LocaleController.getString(R.string.PrivacyMessagesContactsAndPremium), privacyControlActivity.E == 2, (privacyControlActivity.nobodyRow == -1 && privacyControlActivity.f35879c0 == -1) ? false : true);
                    } else {
                        g6Var.c(LocaleController.getString(R.string.LastSeenContacts), privacyControlActivity.E == 2, (privacyControlActivity.nobodyRow == -1 && privacyControlActivity.f35879c0 == -1) ? false : true);
                    }
                } else if (i10 == privacyControlActivity.f35879c0) {
                    if (i11 == 10 && !privacyControlActivity.getUserConfig().isPremium()) {
                        g6Var.setRadioIcon(privacyControlActivity.getParentActivity().getResources().getDrawable(R.drawable.mini_switch_lock).mutate());
                    }
                    g6Var.c(LocaleController.getString(R.string.PrivateMessagesChargePrice), privacyControlActivity.E == 3, false);
                } else {
                    if ((i11 == 8 && !privacyControlActivity.getUserConfig().isPremium()) || (i11 == 10 && !privacyControlActivity.getMessagesController().newNoncontactPeersRequirePremiumWithoutOwnpremium && !privacyControlActivity.getUserConfig().isPremium())) {
                        g6Var.setRadioIcon(privacyControlActivity.getParentActivity().getResources().getDrawable(R.drawable.mini_switch_lock).mutate());
                    }
                    if (i11 == 3) {
                        g6Var.c(LocaleController.getString(R.string.P2PNobody), privacyControlActivity.E == 1, false);
                    } else {
                        g6Var.c(LocaleController.getString(R.string.LastSeenNobody), privacyControlActivity.E == 1, false);
                    }
                }
            } else if (i10 == privacyControlActivity.T) {
                g6Var.c(LocaleController.getString(R.string.LastSeenContacts), privacyControlActivity.F == 1, false);
            } else if (i10 == privacyControlActivity.S) {
                g6Var.c(LocaleController.getString(R.string.LastSeenEverybody), privacyControlActivity.F == 0, true);
            }
            if (i11 == 12) {
                g6Var.b(null, !privacyControlActivity.u0());
                return;
            }
            return;
        }
        if (i12 != 8) {
            if (i12 != 9) {
                return;
            }
            org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
            if (i10 == privacyControlActivity.priceRow) {
                int[] iArrA = org.telegram.ui.Cells.u7.a((int) privacyControlActivity.getMessagesController().starsPaidMessageAmountMax, new int[]{1, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000});
                dl0 dl0Var = new dl0(this, i13);
                org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7();
                t7Var.f25681c = iArrA;
                t7Var.d = 20;
                t7Var.f25682e = dl0Var;
                u7Var.d((int) Utilities.clamp(privacyControlActivity.H, privacyControlActivity.getMessagesController().starsPaidMessageAmountMax, 1L), t7Var, new sw0(this, z10 ? 1 : 0));
                return;
            }
            return;
        }
        org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
        p8Var.setCheckBoxIcon(0);
        if (i10 == privacyControlActivity.readRow) {
            p8Var.f(LocaleController.getString(R.string.HideReadTime), privacyControlActivity.f35906x0, false);
            return;
        }
        if (i10 == privacyControlActivity.showGiftIconRow) {
            p8Var.f(LocaleController.getString(R.string.PrivacyGiftsShowIcon), privacyControlActivity.f35909z0, false);
            return;
        }
        if (i10 == privacyControlActivity.f35886h0) {
            p8Var.f(LocaleController.getString(R.string.PrivacyGiftsTypeUnlimited), privacyControlActivity.B0, true);
            if (!privacyControlActivity.getUserConfig().isPremium() && privacyControlActivity.B0) {
                i15 = R.drawable.permission_locked;
            }
            p8Var.setCheckBoxIcon(i15);
            return;
        }
        if (i10 == privacyControlActivity.f35887i0) {
            p8Var.f(LocaleController.getString(R.string.PrivacyGiftsTypeLimited), privacyControlActivity.D0, true);
            if (!privacyControlActivity.getUserConfig().isPremium() && privacyControlActivity.D0) {
                i16 = R.drawable.permission_locked;
            }
            p8Var.setCheckBoxIcon(i16);
            return;
        }
        if (i10 == privacyControlActivity.f35888j0) {
            p8Var.f(LocaleController.getString(R.string.PrivacyGiftsTypeUnique), privacyControlActivity.F0, true);
            if (!privacyControlActivity.getUserConfig().isPremium() && privacyControlActivity.F0) {
                i17 = R.drawable.permission_locked;
            }
            p8Var.setCheckBoxIcon(i17);
            return;
        }
        if (i10 == privacyControlActivity.f35889k0) {
            p8Var.f(LocaleController.getString(R.string.PrivacyGiftsTypeFromChannels), privacyControlActivity.H0, true);
            if (!privacyControlActivity.getUserConfig().isPremium() && privacyControlActivity.H0) {
                i18 = R.drawable.permission_locked;
            }
            p8Var.setCheckBoxIcon(i18);
            return;
        }
        if (i10 == privacyControlActivity.f35890l0) {
            p8Var.f(LocaleController.getString(R.string.PrivacyGiftsTypePremium), privacyControlActivity.J0, false);
            if (!privacyControlActivity.getUserConfig().isPremium() && privacyControlActivity.J0) {
                i19 = R.drawable.permission_locked;
            }
            p8Var.setCheckBoxIcon(i19);
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        ?? x8Var;
        Context context = this.f43303c;
        PrivacyControlActivity privacyControlActivity = this.d;
        switch (i10) {
            case 0:
                org.telegram.ui.Cells.x9 x9Var = new org.telegram.ui.Cells.x9(context);
                x9Var.setCanDisable(true);
                x8Var = x9Var;
                break;
            case 1:
                x8Var = new org.telegram.ui.Cells.x8(context);
                break;
            case 2:
                x8Var = new org.telegram.ui.Cells.j4(context);
                break;
            case 3:
                x8Var = new org.telegram.ui.Cells.g6(context, null);
                break;
            case 4:
                x8Var = privacyControlActivity.f35881e;
                break;
            case 5:
            default:
                x8Var = new org.telegram.ui.Cells.w6(context, (org.telegram.messenger.rl) null);
                break;
            case 6:
                org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(privacyControlActivity.getParentActivity());
                privacyControlActivity.f35895q0 = l8Var;
                if (privacyControlActivity.f35900t0 == null) {
                    l8Var.m(R.drawable.msg_addphoto, LocaleController.formatString(R.string.SetPhotoForRest, new Object[0]), false);
                } else {
                    l8Var.m(R.drawable.msg_addphoto, LocaleController.formatString("UpdatePhotoForRest", R.string.UpdatePhotoForRest, new Object[0]), true);
                }
                privacyControlActivity.f35895q0.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
                privacyControlActivity.f35895q0.e(org.telegram.ui.ActionBar.g6.f23373v6, org.telegram.ui.ActionBar.g6.f23357u6);
                privacyControlActivity.f35894p0 = new org.telegram.ui.Components.oi0(R.raw.camera_outline, "" + R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                privacyControlActivity.f35895q0.f24631e.setTranslationX((float) (-AndroidUtilities.dp(8.0f)));
                privacyControlActivity.f35895q0.f24631e.setAnimation(privacyControlActivity.f35894p0);
                x8Var = privacyControlActivity.f35895q0;
                break;
            case 7:
                privacyControlActivity.f35897r0 = new org.telegram.ui.Components.n9(privacyControlActivity.getParentActivity());
                privacyControlActivity.f35899s0 = new hs(this, privacyControlActivity.getParentActivity());
                TLRPC.PhotoSize photoSize = privacyControlActivity.f35900t0;
                if (photoSize != null) {
                    TLRPC.Photo photo = privacyControlActivity.f35901u0;
                    if (photo != null) {
                        privacyControlActivity.f35897r0.h(ImageLocation.getForPhoto(photoSize, photo), "50_50", null, UserConfig.getInstance(((org.telegram.ui.ActionBar.n2) privacyControlActivity).currentAccount).getCurrentUser());
                    } else {
                        privacyControlActivity.f35897r0.h(ImageLocation.getForLocal(photoSize.location), "50_50", null, UserConfig.getInstance(((org.telegram.ui.ActionBar.n2) privacyControlActivity).currentAccount).getCurrentUser());
                    }
                }
                privacyControlActivity.f35899s0.addView(privacyControlActivity.f35897r0, h7.z5.d(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
                privacyControlActivity.f35899s0.i(LocaleController.getString(R.string.RemovePublicPhoto), false);
                privacyControlActivity.f35899s0.getImageView().setVisibility(0);
                privacyControlActivity.f35899s0.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
                hs hsVar = privacyControlActivity.f35899s0;
                int i11 = org.telegram.ui.ActionBar.g6.f23269p7;
                hsVar.e(i11, i11);
                x8Var = privacyControlActivity.f35899s0;
                break;
            case 8:
                x8Var = new org.telegram.ui.Cells.p8(context, ((org.telegram.ui.ActionBar.n2) privacyControlActivity).resourceProvider);
                break;
            case 9:
                x8Var = new org.telegram.ui.Cells.u7(context, ((org.telegram.ui.ActionBar.n2) privacyControlActivity).resourceProvider);
                break;
            case 10:
                ?? frameLayout = new FrameLayout(context);
                lh.d dVar = new lh.d(context, ((org.telegram.ui.ActionBar.n2) privacyControlActivity).resourceProvider, true);
                dVar.setRoundRadius(24);
                org.telegram.ui.Components.cq cqVar = new org.telegram.ui.Components.cq(R.drawable.msg_mini_lock3, 0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.PrivateMessagesChargePremiumLocked));
                spannableStringBuilder.append((CharSequence) " l");
                spannableStringBuilder.setSpan(cqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                dVar.g(spannableStringBuilder, false, true);
                dVar.setOnClickListener(new u50(this, 25));
                frameLayout.addView(dVar, h7.z5.d(-1, 48.0f, 119, 18.0f, 0.0f, 18.0f, 16.0f));
                x8Var = frameLayout;
                break;
        }
        return new org.telegram.ui.Components.lk0(x8Var);
    }
}
