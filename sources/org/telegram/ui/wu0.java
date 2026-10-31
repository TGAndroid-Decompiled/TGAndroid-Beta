package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.Switch;
public final class wu0 extends org.telegram.ui.Components.sk0 {
    public final Context f43372c;
    public final PrivacySettingsActivity d;

    public wu0(PrivacySettingsActivity privacySettingsActivity, Context context) {
        this.d = privacySettingsActivity;
        this.f43372c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
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
        int b10 = c1Var.b();
        PrivacySettingsActivity privacySettingsActivity = this.d;
        i10 = privacySettingsActivity.passcodeRow;
        if (b10 != i10) {
            i11 = privacySettingsActivity.passwordRow;
            if (b10 != i11) {
                i12 = privacySettingsActivity.passkeysRow;
                if (b10 != i12) {
                    i13 = privacySettingsActivity.blockedRow;
                    if (b10 != i13 && b10 != privacySettingsActivity.f33768s) {
                        i14 = privacySettingsActivity.secretWebpageRow;
                        if (b10 != i14) {
                            i15 = privacySettingsActivity.webSessionsRow;
                            if (b10 != i15 && (b10 != privacySettingsActivity.f33766n || privacySettingsActivity.getContactsController().t(1))) {
                                i16 = privacySettingsActivity.lastSeenRow;
                                if (b10 != i16 || privacySettingsActivity.getContactsController().t(0)) {
                                    i17 = privacySettingsActivity.callsRow;
                                    if (b10 != i17 || privacySettingsActivity.getContactsController().t(2)) {
                                        i18 = privacySettingsActivity.profilePhotoRow;
                                        if (b10 != i18 || privacySettingsActivity.getContactsController().t(4)) {
                                            i19 = privacySettingsActivity.bioRow;
                                            if (b10 != i19 || privacySettingsActivity.getContactsController().t(9)) {
                                                i20 = privacySettingsActivity.musicRow;
                                                if (b10 != i20 || privacySettingsActivity.getContactsController().t(14)) {
                                                    i21 = privacySettingsActivity.birthdayRow;
                                                    if (b10 != i21 || privacySettingsActivity.getContactsController().t(11)) {
                                                        i22 = privacySettingsActivity.giftsRow;
                                                        if (b10 != i22 || privacySettingsActivity.getContactsController().t(12)) {
                                                            i23 = privacySettingsActivity.forwardsRow;
                                                            if (b10 != i23 || privacySettingsActivity.getContactsController().t(5)) {
                                                                i24 = privacySettingsActivity.phoneNumberRow;
                                                                if (b10 != i24 || privacySettingsActivity.getContactsController().t(6)) {
                                                                    i25 = privacySettingsActivity.voicesRow;
                                                                    if (b10 != i25 || privacySettingsActivity.getContactsController().t(8)) {
                                                                        i26 = privacySettingsActivity.noncontactsRow;
                                                                        if (b10 != i26) {
                                                                            i27 = privacySettingsActivity.deleteAccountRow;
                                                                            if (b10 != i27 || privacySettingsActivity.getContactsController().G != 2) {
                                                                                i28 = privacySettingsActivity.newChatsRow;
                                                                                if (b10 != i28 || privacySettingsActivity.getContactsController().F != 2) {
                                                                                    i29 = privacySettingsActivity.emailLoginRow;
                                                                                    if (b10 != i29) {
                                                                                        i30 = privacySettingsActivity.paymentsClearRow;
                                                                                        if (b10 != i30) {
                                                                                            i31 = privacySettingsActivity.secretMapRow;
                                                                                            if (b10 != i31) {
                                                                                                i32 = privacySettingsActivity.contactsSyncRow;
                                                                                                if (b10 != i32 && b10 != privacySettingsActivity.G) {
                                                                                                    i33 = privacySettingsActivity.contactsDeleteRow;
                                                                                                    if (b10 != i33) {
                                                                                                        i34 = privacySettingsActivity.contactsSuggestRow;
                                                                                                        if (b10 != i34) {
                                                                                                            i35 = privacySettingsActivity.autoDeleteMesages;
                                                                                                            if (b10 != i35 && b10 != privacySettingsActivity.H) {
                                                                                                                return false;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                return true;
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
    public final int b() {
        return this.d.O;
    }

    @Override
    public final int d(int i10) {
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
        if (i10 != privacySettingsActivity.G) {
            i11 = privacySettingsActivity.lastSeenRow;
            if (i10 != i11) {
                i12 = privacySettingsActivity.phoneNumberRow;
                if (i10 != i12) {
                    i13 = privacySettingsActivity.deleteAccountRow;
                    if (i10 != i13) {
                        i14 = privacySettingsActivity.webSessionsRow;
                        if (i10 != i14 && i10 != privacySettingsActivity.f33766n) {
                            i15 = privacySettingsActivity.paymentsClearRow;
                            if (i10 != i15) {
                                i16 = privacySettingsActivity.secretMapRow;
                                if (i10 != i16) {
                                    i17 = privacySettingsActivity.contactsDeleteRow;
                                    if (i10 != i17 && i10 != privacySettingsActivity.H) {
                                        if (i10 != privacySettingsActivity.h && i10 != privacySettingsActivity.E && i10 != privacySettingsActivity.f33767r && i10 != privacySettingsActivity.f33769w && i10 != privacySettingsActivity.N && i10 != privacySettingsActivity.I && i10 != privacySettingsActivity.L && i10 != privacySettingsActivity.f33771y) {
                                            if (i10 != 0 && i10 != privacySettingsActivity.D && i10 != privacySettingsActivity.f33765f && i10 != privacySettingsActivity.M && i10 != privacySettingsActivity.F && i10 != privacySettingsActivity.K && i10 != privacySettingsActivity.f33770x) {
                                                i18 = privacySettingsActivity.secretWebpageRow;
                                                if (i10 != i18) {
                                                    i19 = privacySettingsActivity.contactsSyncRow;
                                                    if (i10 != i19) {
                                                        i20 = privacySettingsActivity.contactsSuggestRow;
                                                        if (i10 != i20) {
                                                            i21 = privacySettingsActivity.newChatsRow;
                                                            if (i10 != i21) {
                                                                if (i10 != privacySettingsActivity.J) {
                                                                    i22 = privacySettingsActivity.autoDeleteMesages;
                                                                    if (i10 != i22 && i10 != privacySettingsActivity.f33768s) {
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
    public final void t(s4.c1 c1Var, int i10) {
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
        String L0;
        boolean z11;
        CharSequence y02;
        int i27;
        boolean z12;
        CharSequence B0;
        boolean z13;
        int i28;
        boolean z14;
        String B02;
        String B03;
        boolean z15;
        String B04;
        String B05;
        float f7;
        int i29;
        int i30;
        int i31;
        int i32;
        boolean z16;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        String str;
        String format;
        String L02;
        String L03;
        String str2;
        String L04;
        int i39;
        String str3;
        boolean z17;
        String str4;
        String format2;
        String str5;
        String L05;
        String str6;
        int i40 = c1Var.f47901f;
        View view = c1Var.f47898a;
        String str7 = null;
        boolean z18 = false;
        boolean z19 = true;
        PrivacySettingsActivity privacySettingsActivity = this.d;
        if (i40 != 0) {
            if (i40 != 1) {
                if (i40 != 2) {
                    if (i40 != 3) {
                        if (i40 == 5) {
                            org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                            if (view.getTag() != null && ((Integer) view.getTag()).intValue() == i10) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            view.setTag(Integer.valueOf(i10));
                            p8Var.setPrioritizeTitleOverValue(false);
                            org.telegram.ui.Components.f6 f6Var = p8Var.f22459c;
                            i33 = privacySettingsActivity.autoDeleteMesages;
                            if (i10 == i33) {
                                int i41 = privacySettingsActivity.getUserConfig().f15168p0;
                                if (i41 == -1) {
                                    str6 = null;
                                    z18 = true;
                                } else {
                                    if (i41 > 0) {
                                        L05 = org.telegram.messenger.cd.c0(i41 * 60);
                                    } else {
                                        L05 = org.telegram.messenger.cd.L0(2131747455, "PasswordOff");
                                    }
                                    str6 = L05;
                                }
                                p8Var.u(org.telegram.messenger.cd.L0(2131753850, "AutoDeleteMessages"), str6, true, 2131232017, true);
                            } else {
                                String str8 = "";
                                if (i10 != privacySettingsActivity.f33768s) {
                                    i34 = privacySettingsActivity.emailLoginRow;
                                    if (i10 != i34) {
                                        i35 = privacySettingsActivity.passwordRow;
                                        if (i10 != i35) {
                                            i36 = privacySettingsActivity.passkeysRow;
                                            if (i10 != i36) {
                                                i37 = privacySettingsActivity.passcodeRow;
                                                if (i10 != i37) {
                                                    i38 = privacySettingsActivity.blockedRow;
                                                    if (i10 == i38) {
                                                        int i42 = privacySettingsActivity.getMessagesController().H0;
                                                        if (i42 == 0) {
                                                            format = org.telegram.messenger.cd.L0(2131753682, "BlockedEmpty");
                                                        } else if (i42 <= 0) {
                                                            str = "";
                                                            z18 = true;
                                                            p8Var.u(org.telegram.messenger.cd.L0(2131753681, "BlockedUsers"), str, true, 2131232019, true);
                                                        } else {
                                                            format = String.format(org.telegram.messenger.cd.D0().f15003y, "%d", Integer.valueOf(i42));
                                                        }
                                                        str = format;
                                                        p8Var.u(org.telegram.messenger.cd.L0(2131753681, "BlockedUsers"), str, true, 2131232019, true);
                                                    }
                                                } else {
                                                    if (org.telegram.messenger.tz.f18180s.length() != 0) {
                                                        L02 = org.telegram.messenger.cd.L0(2131747454, null);
                                                    } else {
                                                        L02 = org.telegram.messenger.cd.L0(2131747455, null);
                                                    }
                                                    p8Var.u(org.telegram.messenger.cd.L0(2131747673, null), L02, true, 2131232035, true);
                                                }
                                            } else {
                                                ArrayList arrayList = privacySettingsActivity.e;
                                                if (arrayList == null) {
                                                    str2 = "";
                                                    z18 = true;
                                                } else {
                                                    if (arrayList.size() == 1 && f6Var.getPaint().measureText(((TL_account.Passkey) privacySettingsActivity.e.get(0)).name) < org.telegram.messenger.i0.f16026q.x / 3.0f) {
                                                        L03 = ((TL_account.Passkey) privacySettingsActivity.e.get(0)).name;
                                                    } else if (privacySettingsActivity.e.size() > 0) {
                                                        L03 = privacySettingsActivity.e.size() + "";
                                                    } else {
                                                        L03 = org.telegram.messenger.cd.L0(2131747455, null);
                                                    }
                                                    str2 = L03;
                                                }
                                                p8Var.u(org.telegram.messenger.cd.L0(2131747667, null), str2, true, 2131232032, true);
                                            }
                                        } else {
                                            TL_account.Password password = privacySettingsActivity.d;
                                            int i43 = 2131231760;
                                            if (password == null) {
                                                i39 = 2131231760;
                                                str3 = "";
                                                z18 = true;
                                            } else {
                                                if (password.has_password) {
                                                    L04 = org.telegram.messenger.cd.L0(2131747454, null);
                                                    i43 = 2131231761;
                                                } else {
                                                    L04 = org.telegram.messenger.cd.L0(2131747455, null);
                                                }
                                                i39 = i43;
                                                str3 = L04;
                                            }
                                            p8Var.u(org.telegram.messenger.cd.L0(2131743963, null), str3, true, i39, true);
                                        }
                                    } else {
                                        TL_account.Password password2 = privacySettingsActivity.d;
                                        if (password2 == null) {
                                            z17 = true;
                                            str4 = str8;
                                        } else {
                                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(password2.login_email_pattern);
                                            int indexOf = privacySettingsActivity.d.login_email_pattern.indexOf(42);
                                            int lastIndexOf = privacySettingsActivity.d.login_email_pattern.lastIndexOf(42);
                                            if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                                ?? obj = new Object();
                                                obj.f32850a |= 256;
                                                obj.f32851b = indexOf;
                                                int i44 = lastIndexOf + 1;
                                                obj.f32852c = i44;
                                                valueOf.setSpan(new org.telegram.ui.Components.zz0(obj, 0), indexOf, i44, 0);
                                            }
                                            z17 = false;
                                            str4 = valueOf;
                                        }
                                        p8Var.setPrioritizeTitleOverValue(true);
                                        String L06 = org.telegram.messenger.cd.L0(2131751203, null);
                                        p8Var.f22465x = p8Var.getDefaultImageLeft();
                                        p8Var.f22463s = p8Var.c(false);
                                        org.telegram.ui.ActionBar.u5 u5Var = p8Var.f22457a;
                                        u5Var.l(L06, false);
                                        u5Var.i(null);
                                        org.telegram.ui.ActionBar.u5 u5Var2 = p8Var.d;
                                        u5Var2.setVisibility(0);
                                        u5Var2.l(str4, false);
                                        f6Var.setVisibility(8);
                                        p8Var.h.setVisibility(8);
                                        org.telegram.ui.Components.ei0 ei0Var = p8Var.e;
                                        ei0Var.setVisibility(0);
                                        ei0Var.setTranslationX(0.0f);
                                        ei0Var.setTranslationY(0.0f);
                                        ei0Var.setPadding(0, org.telegram.messenger.i0.L(7.0f), 0, 0);
                                        ei0Var.setImageResource(2131232025);
                                        p8Var.f22462r = true;
                                        p8Var.setWillNotDraw(false);
                                        Switch r02 = p8Var.f22460f;
                                        if (r02 != null) {
                                            r02.setVisibility(8);
                                        }
                                        org.telegram.ui.Components.d5 d5Var = p8Var.K;
                                        if (d5Var != null) {
                                            d5Var.g(null, false);
                                        }
                                        z18 = z17;
                                    }
                                } else {
                                    if (privacySettingsActivity.f33760a0.n0() == 0) {
                                        if (privacySettingsActivity.getMessagesController().f18733a == 0) {
                                            str5 = "";
                                            z18 = true;
                                            privacySettingsActivity.getMessagesController().f18733a = privacySettingsActivity.f33760a0.n0();
                                            p8Var.u(org.telegram.messenger.cd.L0(2131745568, null), str5, true, 2131232023, false);
                                        } else {
                                            format2 = String.format(org.telegram.messenger.cd.D0().f15003y, "%d", Integer.valueOf(privacySettingsActivity.getMessagesController().f18733a));
                                        }
                                    } else {
                                        format2 = String.format(org.telegram.messenger.cd.D0().f15003y, "%d", Integer.valueOf(privacySettingsActivity.f33760a0.n0()));
                                    }
                                    str5 = format2;
                                    privacySettingsActivity.getMessagesController().f18733a = privacySettingsActivity.f33760a0.n0();
                                    p8Var.u(org.telegram.messenger.cd.L0(2131745568, null), str5, true, 2131232023, false);
                                }
                            }
                            p8Var.h(16, z18, z16);
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
                    i29 = privacySettingsActivity.secretWebpageRow;
                    if (i10 != i29) {
                        i30 = privacySettingsActivity.contactsSyncRow;
                        if (i10 != i30) {
                            i31 = privacySettingsActivity.contactsSuggestRow;
                            if (i10 != i31) {
                                i32 = privacySettingsActivity.newChatsRow;
                                if (i10 == i32) {
                                    t8Var.f(org.telegram.messenger.cd.L0(2131754171, "ArchiveAndMute"), privacySettingsActivity.W, false);
                                    return;
                                }
                                return;
                            }
                            t8Var.f(org.telegram.messenger.cd.L0(2131744438, "SuggestContacts"), privacySettingsActivity.V, false);
                            return;
                        }
                        t8Var.f(org.telegram.messenger.cd.L0(2131744324, "SyncContacts"), privacySettingsActivity.T, true);
                        return;
                    }
                    String L07 = org.telegram.messenger.cd.L0(2131745701, "SecretWebPage");
                    if (privacySettingsActivity.getMessagesController().G2 != 1) {
                        z19 = false;
                    }
                    t8Var.f(L07, z19, false);
                    return;
                }
                org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) view;
                if (i10 == privacySettingsActivity.f33765f) {
                    p4Var.setText(org.telegram.messenger.cd.L0(2131746784, "PrivacyTitle"));
                    return;
                } else if (i10 == 0) {
                    p4Var.setText(org.telegram.messenger.cd.L0(2131745699, "SecurityTitle"));
                    return;
                } else if (i10 == privacySettingsActivity.D) {
                    p4Var.setText(org.telegram.messenger.cd.L0(2131751519, "DeleteMyAccount"));
                    return;
                } else if (i10 == privacySettingsActivity.M) {
                    p4Var.setText(org.telegram.messenger.cd.L0(2131745712, "SecretChat"));
                    return;
                } else if (i10 == privacySettingsActivity.F) {
                    p4Var.setText(org.telegram.messenger.cd.L0(2131746865, "PrivacyBots"));
                    return;
                } else if (i10 == privacySettingsActivity.K) {
                    p4Var.setText(org.telegram.messenger.cd.L0(2131751780, "Contacts"));
                    return;
                } else if (i10 == privacySettingsActivity.f33770x) {
                    p4Var.setText(org.telegram.messenger.cd.L0(2131748299, "NewChatsFromNonContacts"));
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            if (i10 == privacySettingsActivity.E) {
                b9Var.setText(org.telegram.messenger.cd.L0(2131751598, "DeleteAccountHelp"));
                return;
            } else if (i10 == privacySettingsActivity.f33767r) {
                b9Var.setText(org.telegram.messenger.cd.L0(2131749390, "GroupsAndChannelsHelp"));
                return;
            } else if (i10 == privacySettingsActivity.f33769w) {
                b9Var.setText(org.telegram.messenger.cd.L0(2131745569, "SessionsSettingsInfo"));
                return;
            } else if (i10 == privacySettingsActivity.N) {
                b9Var.setText(org.telegram.messenger.cd.L0(2131745700, "SecretWebPageInfo"));
                return;
            } else if (i10 == privacySettingsActivity.I) {
                b9Var.setText(org.telegram.messenger.cd.L0(2131746864, "PrivacyBotsInfo"));
                return;
            } else if (i10 == privacySettingsActivity.h) {
                b9Var.setText(org.telegram.messenger.cd.L0(2131746831, null));
                return;
            } else if (i10 == privacySettingsActivity.L) {
                b9Var.setText(org.telegram.messenger.cd.L0(2131744436, "SuggestContactsInfo"));
                return;
            } else if (i10 == privacySettingsActivity.f33771y) {
                b9Var.setText(org.telegram.messenger.cd.L0(2131754170, "ArchiveAndMuteInfo"));
                return;
            } else {
                return;
            }
        }
        int i45 = 16;
        if (view.getTag() != null && ((Integer) view.getTag()).intValue() == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        view.setTag(Integer.valueOf(i10));
        org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
        x9Var.setBetterLayout(true);
        i11 = privacySettingsActivity.webSessionsRow;
        if (i10 != i11) {
            i12 = privacySettingsActivity.phoneNumberRow;
            if (i10 != i12) {
                i13 = privacySettingsActivity.lastSeenRow;
                if (i10 == i13) {
                    if (privacySettingsActivity.getContactsController().t(0)) {
                        z11 = true;
                        i45 = 30;
                    } else {
                        str7 = PrivacySettingsActivity.B0(privacySettingsActivity.getAccountInstance(), 0);
                        z11 = false;
                    }
                    x9Var.c(org.telegram.messenger.cd.L0(2131746830, "PrivacyLastSeen"), str7, false, true);
                } else {
                    if (i10 != privacySettingsActivity.f33766n) {
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
                                                    int i46 = 2131747769;
                                                    if (i10 != i21) {
                                                        i22 = privacySettingsActivity.noncontactsRow;
                                                        if (i10 == i22) {
                                                            if (privacySettingsActivity.Y) {
                                                                i46 = 2131751779;
                                                            } else if (privacySettingsActivity.X) {
                                                                i46 = 2131751778;
                                                            }
                                                            String L08 = org.telegram.messenger.cd.L0(i46, null);
                                                            if (privacySettingsActivity.getMessagesController().K5 && !privacySettingsActivity.getMessagesController().M6) {
                                                                y02 = org.telegram.messenger.cd.L0(2131746825, null);
                                                            } else {
                                                                y02 = PrivacySettingsActivity.y0(privacySettingsActivity, org.telegram.messenger.cd.L0(2131746825, null));
                                                            }
                                                            i27 = privacySettingsActivity.musicRow;
                                                            if (i27 != -1) {
                                                                z12 = true;
                                                            } else {
                                                                z12 = false;
                                                            }
                                                            x9Var.c(y02, L08, false, z12);
                                                        } else if (i10 != privacySettingsActivity.G) {
                                                            i23 = privacySettingsActivity.deleteAccountRow;
                                                            if (i10 != i23) {
                                                                i24 = privacySettingsActivity.paymentsClearRow;
                                                                if (i10 == i24) {
                                                                    x9Var.b(org.telegram.messenger.cd.L0(2131746812, "PrivacyPaymentsClear"), true);
                                                                } else if (i10 != privacySettingsActivity.H) {
                                                                    i25 = privacySettingsActivity.secretMapRow;
                                                                    if (i10 != i25) {
                                                                        i26 = privacySettingsActivity.contactsDeleteRow;
                                                                        if (i10 == i26) {
                                                                            x9Var.b(org.telegram.messenger.cd.L0(2131744322, "SyncContactsDelete"), true);
                                                                        }
                                                                    } else {
                                                                        int i47 = org.telegram.messenger.tz.f18169o0;
                                                                        if (i47 != 0) {
                                                                            if (i47 != 1) {
                                                                                if (i47 != 2) {
                                                                                    L0 = org.telegram.messenger.cd.L0(2131748699, "MapPreviewProviderYandex");
                                                                                } else {
                                                                                    L0 = org.telegram.messenger.cd.L0(2131748702, "MapPreviewProviderNobody");
                                                                                }
                                                                            } else {
                                                                                L0 = org.telegram.messenger.cd.L0(2131748703, "MapPreviewProviderGoogle");
                                                                            }
                                                                        } else {
                                                                            L0 = org.telegram.messenger.cd.L0(2131748701, "MapPreviewProviderTelegram");
                                                                        }
                                                                        x9Var.c(org.telegram.messenger.cd.L0(2131748704, "MapPreviewProvider"), L0, privacySettingsActivity.R, true);
                                                                        privacySettingsActivity.R = false;
                                                                    }
                                                                } else {
                                                                    x9Var.b(org.telegram.messenger.cd.L0(2131746877, null), true);
                                                                }
                                                            } else {
                                                                if (privacySettingsActivity.getContactsController().G != 2) {
                                                                    z11 = true;
                                                                } else {
                                                                    int i48 = privacySettingsActivity.getContactsController().H;
                                                                    if (i48 <= 182) {
                                                                        str7 = org.telegram.messenger.cd.G(i48 / 30, "Months", new Object[0]);
                                                                    } else if (i48 == 365) {
                                                                        str7 = org.telegram.messenger.cd.G(12, "Months", new Object[0]);
                                                                    } else if (i48 == 548) {
                                                                        str7 = org.telegram.messenger.cd.G(18, "Months", new Object[0]);
                                                                    } else if (i48 == 730) {
                                                                        str7 = org.telegram.messenger.cd.G(24, "Months", new Object[0]);
                                                                    } else if (i48 > 30) {
                                                                        str7 = org.telegram.messenger.cd.G((int) Math.round(i48 / 30.0d), "Months", new Object[0]);
                                                                    } else {
                                                                        str7 = org.telegram.messenger.cd.G(i48, "Days", new Object[0]);
                                                                    }
                                                                    z11 = false;
                                                                }
                                                                x9Var.c(org.telegram.messenger.cd.L0(2131751596, "DeleteAccountIfAwayFor3"), str7, privacySettingsActivity.Q, false);
                                                                privacySettingsActivity.Q = false;
                                                            }
                                                        } else {
                                                            x9Var.b(org.telegram.messenger.cd.L0(2131744262, "TelegramPassport"), true);
                                                        }
                                                    } else {
                                                        if (privacySettingsActivity.getContactsController().t(8)) {
                                                            B0 = null;
                                                            z13 = true;
                                                            i45 = 30;
                                                        } else {
                                                            if (!privacySettingsActivity.getUserConfig().q()) {
                                                                B0 = org.telegram.messenger.cd.L0(2131747769, null);
                                                            } else {
                                                                B0 = PrivacySettingsActivity.B0(privacySettingsActivity.getAccountInstance(), 8);
                                                            }
                                                            z13 = false;
                                                        }
                                                        SpannableStringBuilder y03 = PrivacySettingsActivity.y0(privacySettingsActivity, org.telegram.messenger.cd.L0(2131746773, null));
                                                        i28 = privacySettingsActivity.noncontactsRow;
                                                        if (i28 != -1) {
                                                            z14 = true;
                                                        } else {
                                                            z14 = false;
                                                        }
                                                        x9Var.c(y03, B0, false, z14);
                                                        org.telegram.ui.ActionBar.a7.t(x9Var.getValueImageView(), org.telegram.ui.ActionBar.t6.f21095m6, null, PorterDuff.Mode.MULTIPLY);
                                                    }
                                                } else {
                                                    if (privacySettingsActivity.getContactsController().t(5)) {
                                                        z11 = true;
                                                        i45 = 30;
                                                    } else {
                                                        str7 = PrivacySettingsActivity.B0(privacySettingsActivity.getAccountInstance(), 5);
                                                        z11 = false;
                                                    }
                                                    x9Var.c(org.telegram.messenger.cd.L0(2131746852, "PrivacyForwards"), str7, false, true);
                                                }
                                            } else {
                                                if (privacySettingsActivity.getContactsController().t(12)) {
                                                    B02 = null;
                                                    z13 = true;
                                                    i45 = 30;
                                                } else {
                                                    B02 = PrivacySettingsActivity.B0(privacySettingsActivity.getAccountInstance(), 12);
                                                    z13 = false;
                                                }
                                                x9Var.c(org.telegram.messenger.cd.L0(2131746844, null), B02, false, true);
                                            }
                                            z18 = z13;
                                        } else {
                                            if (privacySettingsActivity.getContactsController().t(11)) {
                                                B03 = null;
                                                z15 = true;
                                                i45 = 30;
                                            } else {
                                                B03 = PrivacySettingsActivity.B0(privacySettingsActivity.getAccountInstance(), 11);
                                                z15 = false;
                                            }
                                            x9Var.c(org.telegram.messenger.cd.L0(2131746875, null), B03, false, true);
                                        }
                                    } else {
                                        if (privacySettingsActivity.getContactsController().t(14)) {
                                            B04 = null;
                                            z15 = true;
                                            i45 = 30;
                                        } else {
                                            B04 = PrivacySettingsActivity.B0(privacySettingsActivity.getAccountInstance(), 14);
                                            z15 = false;
                                        }
                                        x9Var.c(org.telegram.messenger.cd.L0(2131746819, null), B04, false, true);
                                    }
                                } else {
                                    if (privacySettingsActivity.getContactsController().t(9)) {
                                        z11 = true;
                                        i45 = 30;
                                    } else {
                                        str7 = PrivacySettingsActivity.B0(privacySettingsActivity.getAccountInstance(), 9);
                                        z11 = false;
                                    }
                                    x9Var.c(org.telegram.messenger.cd.L0(2131746882, "PrivacyBio"), str7, false, true);
                                }
                            } else {
                                if (privacySettingsActivity.getContactsController().t(4)) {
                                    z11 = true;
                                    i45 = 30;
                                } else {
                                    str7 = PrivacySettingsActivity.B0(privacySettingsActivity.getAccountInstance(), 4);
                                    z11 = false;
                                }
                                x9Var.c(org.telegram.messenger.cd.L0(2131746792, "PrivacyProfilePhoto"), str7, false, true);
                            }
                        } else {
                            if (privacySettingsActivity.getContactsController().t(2)) {
                                z11 = true;
                                i45 = 30;
                            } else {
                                str7 = PrivacySettingsActivity.B0(privacySettingsActivity.getAccountInstance(), 2);
                                z11 = false;
                            }
                            x9Var.c(org.telegram.messenger.cd.L0(2131752596, "Calls"), str7, false, true);
                        }
                    } else {
                        if (privacySettingsActivity.getContactsController().t(1)) {
                            B05 = null;
                            z15 = true;
                            i45 = 30;
                        } else {
                            B05 = PrivacySettingsActivity.B0(privacySettingsActivity.getAccountInstance(), 1);
                            z15 = false;
                        }
                        x9Var.c(org.telegram.messenger.cd.L0(2131746832, null), B05, false, false);
                    }
                    z18 = z15;
                }
            } else {
                if (privacySettingsActivity.getContactsController().t(6)) {
                    z11 = true;
                    i45 = 30;
                } else {
                    str7 = PrivacySettingsActivity.B0(privacySettingsActivity.getAccountInstance(), 6);
                    z11 = false;
                }
                x9Var.c(org.telegram.messenger.cd.L0(2131746805, "PrivacyPhone"), str7, false, true);
            }
            z18 = z11;
        } else {
            x9Var.b(org.telegram.messenger.cd.L0(2131742937, "WebSessionsTitle"), false);
        }
        x9Var.f23602r = z18;
        x9Var.D = i45;
        if (!z10) {
            if (z18) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            x9Var.f23606y = f7;
        } else {
            x9Var.E = true;
        }
        x9Var.invalidate();
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View x9Var;
        Context context = this.f43372c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            x9Var = new org.telegram.ui.Cells.t8(context);
                        } else {
                            x9Var = new org.telegram.ui.Cells.p8(context);
                        }
                    } else {
                        x9Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
                    }
                } else {
                    x9Var = new org.telegram.ui.Cells.p4(context);
                }
            } else {
                x9Var = new org.telegram.ui.Cells.b9(context);
            }
        } else {
            x9Var = new org.telegram.ui.Cells.x9(context);
        }
        return new s4.c1(x9Var);
    }
}
