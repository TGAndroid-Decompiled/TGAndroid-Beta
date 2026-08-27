package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import j$.time.LocalDate;
import j$.time.Period;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stars;

public final class vz0 extends org.telegram.ui.Components.yk0 {

    public final Context f43553c;
    public final HashMap d = new HashMap();

    public final ProfileActivity f43554e;

    public vz0(ProfileActivity profileActivity, Context context) {
        this.f43554e = profileActivity;
        this.f43553c = context;
    }

    @Override
    public final void A(f2.o1 o1Var) {
        int iB = o1Var.b();
        ProfileActivity profileActivity = this.f43554e;
        if (iB == profileActivity.K2) {
            profileActivity.I2 = null;
        }
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        ProfileActivity profileActivity = this.f43554e;
        if (profileActivity.f35931b3 != -1) {
            int iB = o1Var.b();
            if (iB != profileActivity.f35931b3 && iB != profileActivity.P2 && iB != profileActivity.f35946d3 && iB != profileActivity.f35939c3 && iB != profileActivity.R2 && iB != profileActivity.S2 && iB != profileActivity.f36070v3 && iB != profileActivity.f35954e3 && iB != profileActivity.f35962f3 && iB != profileActivity.f36009m3 && iB != profileActivity.f35990j3 && iB != profileActivity.f35969g3 && iB != profileActivity.f35983i3 && iB != profileActivity.f36017n3 && iB != profileActivity.f36024o3 && iB != profileActivity.f36044r3 && iB != profileActivity.f36052s3 && iB != profileActivity.f36058t3 && iB != profileActivity.f36064u3 && iB != profileActivity.K2 && iB != profileActivity.W3 && iB != profileActivity.Y3 && iB != profileActivity.f35940c4 && iB != profileActivity.f35932b4 && iB != profileActivity.f35976h3 && iB != profileActivity.Q2 && iB != profileActivity.M2 && iB != profileActivity.Z3 && iB != profileActivity.f35924a4 && iB != profileActivity.f35977h4) {
                return false;
            }
        } else {
            View view = o1Var.f5789a;
            if (view instanceof org.telegram.ui.Cells.sa) {
                Object currentObject = ((org.telegram.ui.Cells.sa) view).getCurrentObject();
                if ((currentObject instanceof TLRPC.User) && UserObject.isUserSelf((TLRPC.User) currentObject)) {
                    return false;
                }
            }
            int i10 = o1Var.f5793f;
            if (i10 == 1 || i10 == 5 || i10 == 7 || i10 == 11 || i10 == 31 || i10 == 28 || i10 == 12 || i10 == 13 || i10 == 9 || i10 == 10 || i10 == 25 || i10 == 32) {
                return false;
            }
        }
        return true;
    }

    public final CharSequence E(String str, ArrayList arrayList, String str2) {
        CharSequence charSequence = str2;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            int i10 = 0;
            while (i10 < arrayList2.size()) {
                if (!((TLRPC.TL_username) arrayList2.get(i10)).active || (str != null && str.equals(((TLRPC.TL_username) arrayList2.get(i10)).username))) {
                    arrayList2.remove(i10);
                    i10--;
                }
                i10++;
            }
            charSequence = str2;
            if (arrayList2.size() > 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList2.get(i11);
                    SpannableString spannableString = new SpannableString(s3.c.e("@", tL_username.username));
                    HashMap map = this.d;
                    ClickableSpan clickableSpan = (ClickableSpan) map.get(tL_username);
                    if (clickableSpan == null) {
                        oz0 oz0Var = new oz0(this, tL_username, tL_username.username);
                        map.put(tL_username, oz0Var);
                        clickableSpan = oz0Var;
                    }
                    spannableString.setSpan(clickableSpan, 0, spannableString.length(), 33);
                    spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, this.f43554e.f36067v0)), 0, spannableString.length(), 33);
                    spannableStringBuilder.append((CharSequence) spannableString);
                    if (i11 < arrayList2.size() - 1) {
                        spannableStringBuilder.append((CharSequence) ", ");
                    }
                }
                String string = LocaleController.getString(R.string.UsernameAlso);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(string);
                int iIndexOf = string.indexOf("%1$s");
                charSequence = spannableStringBuilder2;
                if (iIndexOf >= 0) {
                    spannableStringBuilder2.replace(iIndexOf, iIndexOf + 4, (CharSequence) spannableStringBuilder);
                    charSequence = spannableStringBuilder2;
                }
            }
        }
        return charSequence;
    }

    @Override
    public final int h() {
        return this.f43554e.J2;
    }

    @Override
    public final int j(int i10) {
        ProfileActivity profileActivity = this.f43554e;
        if (i10 == profileActivity.f36096z3 || i10 == profileActivity.f36032p4 || i10 == profileActivity.a3 || i10 == profileActivity.O2 || i10 == profileActivity.f36003l3 || i10 == profileActivity.f36037q3 || i10 == profileActivity.f35991j4) {
            return 1;
        }
        if (i10 == profileActivity.C3 || i10 == profileActivity.E3 || i10 == profileActivity.P2 || i10 == profileActivity.Q2) {
            return 2;
        }
        if (i10 == profileActivity.H3 || i10 == profileActivity.R2) {
            return 19;
        }
        if (i10 == profileActivity.D3) {
            return 30;
        }
        if (i10 == profileActivity.F3 || i10 == profileActivity.G3 || i10 == profileActivity.S2) {
            return 3;
        }
        if (i10 == profileActivity.f36010m4 || i10 == profileActivity.f36018n4 || i10 == profileActivity.R3 || i10 == profileActivity.T3 || i10 == profileActivity.S3 || i10 == profileActivity.f36059t4 || i10 == profileActivity.f36065u4 || i10 == profileActivity.v4 || i10 == profileActivity.f36077w4 || i10 == profileActivity.C4 || i10 == profileActivity.f36053s4 || i10 == profileActivity.H4 || i10 == profileActivity.G4 || i10 == profileActivity.Q3 || i10 == profileActivity.f35931b3 || i10 == profileActivity.f35946d3 || i10 == profileActivity.f35939c3 || i10 == profileActivity.f35954e3 || i10 == profileActivity.f35962f3 || i10 == profileActivity.f36009m3 || i10 == profileActivity.f35990j3 || i10 == profileActivity.f35969g3 || i10 == profileActivity.f35983i3 || i10 == profileActivity.f36017n3 || i10 == profileActivity.f36024o3 || i10 == profileActivity.f36044r3 || i10 == profileActivity.f36052s3 || i10 == profileActivity.f36058t3 || i10 == profileActivity.f36064u3 || i10 == profileActivity.K2 || i10 == profileActivity.W3 || i10 == profileActivity.V3 || i10 == profileActivity.f35976h3 || i10 == profileActivity.f35940c4 || i10 == profileActivity.f35932b4 || i10 == profileActivity.f36084x4 || i10 == profileActivity.f36091y4 || i10 == profileActivity.f36097z4 || i10 == profileActivity.botPermissionLocation || i10 == profileActivity.botPermissionBiometry || i10 == profileActivity.botPermissionEmojiStatus || i10 == profileActivity.f35924a4) {
            return 4;
        }
        if (i10 == profileActivity.I3) {
            return 5;
        }
        if (i10 == profileActivity.J3) {
            return 6;
        }
        if (i10 == profileActivity.M3) {
            return 20;
        }
        if (i10 == profileActivity.I4 || i10 == profileActivity.D4 || i10 == profileActivity.f35984i4 || i10 == profileActivity.f36025o4 || i10 == profileActivity.Z2 || i10 == profileActivity.f35997k3 || i10 == profileActivity.f36031p3 || i10 == profileActivity.L2 || i10 == profileActivity.X2 || i10 == profileActivity.T2 || i10 == profileActivity.f35947d4 || i10 == profileActivity.U3 || i10 == profileActivity.N2 || i10 == profileActivity.V2 || i10 == profileActivity.B4 || i10 == profileActivity.f36004l4 || i10 == profileActivity.A4 || i10 == profileActivity.f35970g4) {
            return 7;
        }
        if (i10 >= profileActivity.f36038q4 && i10 < profileActivity.f36045r4) {
            return 8;
        }
        if (i10 == profileActivity.f36076w3) {
            return 11;
        }
        if (i10 == profileActivity.f36083x3) {
            return 31;
        }
        if (i10 == profileActivity.f36090y3) {
            return 12;
        }
        if (i10 == profileActivity.F4) {
            return 13;
        }
        if (i10 == profileActivity.f36070v3) {
            return 14;
        }
        if (i10 == profileActivity.Y2 || i10 == profileActivity.W2 || i10 == profileActivity.U2) {
            return 15;
        }
        if (i10 == profileActivity.X3) {
            return 17;
        }
        if (i10 == profileActivity.Y3) {
            return 18;
        }
        if (i10 == profileActivity.Z3) {
            return 24;
        }
        if (i10 == profileActivity.L3) {
            return 21;
        }
        if (i10 == profileActivity.K3) {
            return 22;
        }
        if (i10 == profileActivity.M2) {
            return 23;
        }
        if (i10 == profileActivity.f35955e4) {
            return 25;
        }
        if (i10 == profileActivity.N3 || i10 == profileActivity.P3) {
            return 26;
        }
        if (i10 == profileActivity.f35963f4) {
            return 32;
        }
        if (i10 == profileActivity.f35977h4) {
            return 33;
        }
        if (i10 == profileActivity.O3) {
            return 27;
        }
        return (i10 == profileActivity.A3 || i10 == profileActivity.B3) ? 28 : 0;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        String string;
        String strE;
        String str;
        String str2;
        String str3;
        boolean z10;
        String str4;
        String string2;
        boolean z11;
        String string3;
        CharSequence charSequence;
        TLRPC.TL_username tL_usernameFindUsername;
        String str5;
        CharSequence charSequence2;
        CharSequence textWithEntities;
        String string4;
        String str6;
        Drawable drawableD;
        int i11;
        org.telegram.ui.Cells.l8 l8Var;
        boolean zIsGlobalNotificationsEnabled;
        boolean z12;
        String str7;
        final boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        TLRPC.User user;
        TLRPC.User user2;
        ProfileActivity profileActivity = this.f43554e;
        ArrayList arrayList = profileActivity.M4;
        ArrayList arrayList2 = profileActivity.N4;
        HashSet hashSet = profileActivity.f35948d5;
        int i12 = o1Var.f5793f;
        View view = o1Var.f5789a;
        CharSequence charSequenceJ0 = "";
        String string5 = null;
        strG0 = null;
        String strG0 = null;
        TLRPC.ChatParticipant chatParticipant = null;
        boolean z19 = true;
        z = true;
        boolean z20 = true;
        int i13 = 0;
        switch (i12) {
            case 1:
                org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
                if (i10 == profileActivity.f36096z3) {
                    if (!ChatObject.isChannel(profileActivity.A2) || profileActivity.A2.megagroup || profileActivity.G3 == -1) {
                        j4Var.setText(LocaleController.getString(R.string.Info));
                    } else {
                        j4Var.setText(LocaleController.getString(R.string.ReportChatDescription));
                    }
                } else if (i10 == profileActivity.f36032p4) {
                    j4Var.setText(LocaleController.getString(R.string.ChannelMembers));
                } else if (i10 == profileActivity.a3) {
                    j4Var.setText(LocaleController.getString(R.string.SETTINGS));
                } else if (i10 == profileActivity.O2) {
                    j4Var.setText(LocaleController.getString(R.string.Account));
                } else if (i10 == profileActivity.f36003l3) {
                    j4Var.setText(LocaleController.getString(R.string.SettingsHelp));
                } else if (i10 == profileActivity.f36037q3) {
                    j4Var.setText(LocaleController.getString(R.string.SettingsDebug));
                } else if (i10 == profileActivity.f35991j4) {
                    j4Var.setText(LocaleController.getString(R.string.BotProfilePermissions));
                }
                j4Var.setTextColor(profileActivity.getThemedColor(org.telegram.ui.ActionBar.g6.L6));
                break;
            case 2:
            case 19:
            case 30:
                org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
                if (i10 == profileActivity.Q2) {
                    TLRPC.UserFull userFull = profileActivity.getMessagesController().getUserFull(profileActivity.f35923a1);
                    if (userFull == null || userFull.birthday == null) {
                        i11 = 0;
                    } else {
                        boolean zIsToday = BirthdayController.isToday(userFull);
                        TL_account.TL_birthday tL_birthday = userFull.birthday;
                        boolean z21 = (tL_birthday.flags & 1) != 0;
                        int years = z21 ? Period.between(LocalDate.of(tL_birthday.year, tL_birthday.month, tL_birthday.day), LocalDate.now()).getYears() : -1;
                        String strZ = UserInfoActivity.Z(userFull.birthday);
                        v8Var.c(Emoji.replaceWithRestrictedEmoji(z21 ? LocaleController.formatPluralString(zIsToday ? "ProfileBirthdayTodayValueYear" : "ProfileBirthdayValueYear", years, strZ) : LocaleController.formatString(zIsToday ? R.string.ProfileBirthdayTodayValue : R.string.ProfileBirthdayValue, strZ), v8Var.f25814a, new ol0(this, o1Var, i10, 6)), LocaleController.getString(zIsToday ? R.string.ProfileBirthdayToday : R.string.ProfileBirthday), (!profileActivity.f36007m1 && profileActivity.K3 == -1 && profileActivity.L3 == -1) ? false : true);
                        if (profileActivity.f36022o1 || !zIsToday || profileActivity.getMessagesController().premiumPurchaseBlocked()) {
                            i11 = 0;
                        } else {
                            i11 = 1;
                        }
                    }
                    i13 = i11;
                } else if (i10 == profileActivity.C3) {
                    TLRPC.User user3 = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f35923a1));
                    if (user3 != null && !TextUtils.isEmpty(profileActivity.Z4)) {
                        string4 = org.telegram.messenger.y1.k(new StringBuilder("+"), profileActivity.Z4, oe.b.c());
                        str6 = profileActivity.Z4;
                    } else if (user3 == null || TextUtils.isEmpty(user3.phone)) {
                        string4 = LocaleController.getString(R.string.PhoneHidden);
                        str6 = null;
                    } else {
                        String strK = org.telegram.messenger.y1.k(new StringBuilder("+"), user3.phone, oe.b.c());
                        str6 = user3.phone;
                        string4 = strK;
                    }
                    profileActivity.X4 = str6 != null && str6.matches("888\\d{8}");
                    v8Var.c(string4, LocaleController.getString(profileActivity.X4 ? R.string.AnonymousNumber : R.string.PhoneMobile), false);
                } else if (i10 != profileActivity.D3) {
                    if (i10 == profileActivity.H3) {
                        ArrayList arrayList3 = new ArrayList();
                        if (profileActivity.f35923a1 != 0) {
                            TLRPC.User user4 = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f35923a1));
                            if (user4 != null) {
                                arrayList3.addAll(user4.usernames);
                            }
                            if (user4 == null || TextUtils.isEmpty(user4.username)) {
                                tL_usernameFindUsername = null;
                                str5 = null;
                            } else {
                                tL_usernameFindUsername = DialogObject.findUsername(user4.username, (ArrayList<TLRPC.TL_username>) arrayList3);
                                str5 = user4.username;
                            }
                            ArrayList arrayList4 = user4 == null ? new ArrayList() : new ArrayList(user4.usernames);
                            if (TextUtils.isEmpty(str5)) {
                                for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                                    TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList4.get(i14);
                                    if (tL_username != null && tL_username.active && !TextUtils.isEmpty(tL_username.username)) {
                                        str5 = tL_username.username;
                                        tL_usernameFindUsername = tL_username;
                                    }
                                }
                            }
                            String string6 = LocaleController.getString(R.string.Username);
                            if (str5 != null) {
                                String strConcat = "@".concat(str5);
                                if (tL_usernameFindUsername == null || tL_usernameFindUsername.editable) {
                                    charSequence2 = strConcat;
                                } else {
                                    SpannableString spannableString = new SpannableString(strConcat);
                                    HashMap map = this.d;
                                    ClickableSpan clickableSpan = (ClickableSpan) map.get(tL_usernameFindUsername);
                                    if (clickableSpan == null) {
                                        oz0 oz0Var = new oz0(this, tL_usernameFindUsername, tL_usernameFindUsername.username);
                                        map.put(tL_usernameFindUsername, oz0Var);
                                        clickableSpan = oz0Var;
                                    }
                                    spannableString.setSpan(clickableSpan, 0, spannableString.length(), 33);
                                    charSequence2 = spannableString;
                                }
                            } else {
                                charSequence2 = "—";
                            }
                            z10 = !profileActivity.f36022o1;
                            ArrayList arrayList5 = arrayList4;
                            charSequence = charSequence2;
                            arrayList3 = arrayList5;
                            str4 = str5;
                            str3 = string6;
                        } else if (profileActivity.A2 != null) {
                            TLRPC.Chat chat = profileActivity.getMessagesController().getChat(Long.valueOf(profileActivity.f35929b1));
                            String publicUsername = ChatObject.getPublicUsername(chat);
                            if (chat != null) {
                                arrayList3.addAll(chat.usernames);
                            }
                            if (ChatObject.isPublic(chat)) {
                                z11 = !profileActivity.f36022o1;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(profileActivity.getMessagesController().linkPrefix);
                                sb2.append("/");
                                sb2.append(publicUsername);
                                sb2.append((String) (profileActivity.f35937c1 != 0 ? "/" + profileActivity.f35937c1 : ""));
                                string2 = sb2.toString();
                                string3 = LocaleController.getString(R.string.InviteLink);
                            } else {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(profileActivity.getMessagesController().linkPrefix);
                                sb3.append("/c/");
                                sb3.append(profileActivity.f35929b1);
                                sb3.append((String) (profileActivity.f35937c1 != 0 ? "/" + profileActivity.f35937c1 : ""));
                                string2 = sb3.toString();
                                z11 = false;
                                string3 = LocaleController.getString(R.string.InviteLinkPrivate);
                            }
                            str4 = publicUsername;
                            z10 = z11;
                            charSequence = string2;
                            str3 = string3;
                        } else {
                            arrayList3 = new ArrayList();
                            String str8 = "";
                            str3 = str8;
                            z10 = false;
                            str4 = null;
                            charSequence = str8;
                        }
                        v8Var.c(charSequence, E(str4, arrayList3, str3), profileActivity.B3 == -1 && !(!profileActivity.f36007m1 && profileActivity.K3 == -1 && profileActivity.L3 == -1) && profileActivity.Q2 < 0);
                    } else if (i10 == profileActivity.E3) {
                        if (profileActivity.f36036q2 != null && (profileActivity.f36036q2.location instanceof TLRPC.TL_channelLocation)) {
                            v8Var.c(((TLRPC.TL_channelLocation) profileActivity.f36036q2.location).address, LocaleController.getString(R.string.AttachLocation), false);
                        }
                    } else if (i10 == profileActivity.P2) {
                        TLRPC.User currentUser = UserConfig.getInstance(((org.telegram.ui.ActionBar.n2) profileActivity).currentAccount).getCurrentUser();
                        v8Var.c((currentUser == null || (str2 = currentUser.phone) == null || str2.length() == 0) ? LocaleController.getString(R.string.NumberUnknown) : org.telegram.messenger.y1.k(new StringBuilder("+"), currentUser.phone, oe.b.c()), LocaleController.getString(R.string.TapToChangePhone), true);
                        v8Var.setContentDescriptionValueFirst(false);
                    } else if (i10 == profileActivity.R2) {
                        TLRPC.User currentUser2 = UserConfig.getInstance(((org.telegram.ui.ActionBar.n2) profileActivity).currentAccount).getCurrentUser();
                        String string7 = LocaleController.getString(R.string.Username);
                        if (currentUser2 == null || currentUser2.usernames.size() <= 0) {
                            String publicUsername2 = UserObject.getPublicUsername(currentUser2);
                            if (currentUser2 == null || TextUtils.isEmpty(publicUsername2)) {
                                string = LocaleController.getString(R.string.UsernameEmpty);
                                strE = string7;
                            } else {
                                string = s3.c.e("@", publicUsername2);
                                strE = string7;
                            }
                        } else {
                            int i15 = 0;
                            while (true) {
                                if (i15 < currentUser2.usernames.size()) {
                                    TLRPC.TL_username tL_username2 = currentUser2.usernames.get(i15);
                                    if (tL_username2 == null || !tL_username2.active || TextUtils.isEmpty(tL_username2.username)) {
                                        i15++;
                                    } else {
                                        str = tL_username2.username;
                                    }
                                } else {
                                    str = null;
                                }
                            }
                            if (str == null) {
                                str = currentUser2.username;
                            }
                            string = (str == null || TextUtils.isEmpty(str)) ? LocaleController.getString(R.string.UsernameEmpty) : "@".concat(str);
                            strE = E(str, currentUser2.usernames, string7);
                        }
                        v8Var.c(string, strE, true);
                        v8Var.setContentDescriptionValueFirst(true);
                    }
                    if (i13 != 0) {
                        drawableD = f0.e.d(v8Var.getContext(), R.drawable.msg_input_gift);
                        drawableD.setColorFilter(new PorterDuffColorFilter(profileActivity.getThemedColor(org.telegram.ui.ActionBar.g6.V6), PorterDuff.Mode.MULTIPLY));
                        if (UserObject.areGiftsDisabled(profileActivity.f36043r2)) {
                            v8Var.setImage(null);
                            v8Var.setImageClickListener(null);
                        } else {
                            v8Var.b(drawableD, LocaleController.getString(R.string.GiftPremium));
                            v8Var.setImageClickListener(new fx0(profileActivity, 11));
                        }
                    } else if (z10) {
                        Drawable drawableD2 = f0.e.d(v8Var.getContext(), R.drawable.header_qr_24);
                        drawableD2.setColorFilter(new PorterDuffColorFilter(profileActivity.getThemedColor(org.telegram.ui.ActionBar.g6.f23375v8), PorterDuff.Mode.MULTIPLY));
                        v8Var.b(drawableD2, LocaleController.getString(R.string.GetQRCode));
                        v8Var.setImageClickListener(new fx0(profileActivity, 12));
                    } else {
                        v8Var.setImage(null);
                        v8Var.setImageClickListener(null);
                    }
                    v8Var.setTag(Integer.valueOf(i10));
                    v8Var.f25814a.setLoading(profileActivity.f35956e5);
                    v8Var.f25815b.setLoading(profileActivity.f35956e5);
                    break;
                } else {
                    TLRPC.UserFull userFull2 = profileActivity.getMessagesController().getUserFull(profileActivity.f35923a1);
                    if (userFull2 != null) {
                        TLRPC.TL_textWithEntities tL_textWithEntities = userFull2.note;
                        if (UserConfig.getInstance(((org.telegram.ui.ActionBar.n2) profileActivity).currentAccount).isPremium()) {
                            textWithEntities = MessageObject.formatTextWithEntities(tL_textWithEntities);
                            if (!(textWithEntities instanceof SpannableStringBuilder)) {
                                textWithEntities = new SpannableStringBuilder(textWithEntities);
                            }
                            AndroidUtilities.addLinksSafe((SpannableStringBuilder) textWithEntities, 1, false, false);
                        } else {
                            textWithEntities = MessageObject.formatTextWithEntities(MessageObject.removeLinks(tL_textWithEntities));
                        }
                        v8Var.d(textWithEntities, LocaleController.getString(R.string.ProfileNotes), LocaleController.getString(R.string.ProfileNotesInfo));
                    }
                }
                z10 = false;
                if (i13 != 0) {
                    drawableD = f0.e.d(v8Var.getContext(), R.drawable.msg_input_gift);
                    drawableD.setColorFilter(new PorterDuffColorFilter(profileActivity.getThemedColor(org.telegram.ui.ActionBar.g6.V6), PorterDuff.Mode.MULTIPLY));
                    if (UserObject.areGiftsDisabled(profileActivity.f36043r2)) {
                        v8Var.setImage(null);
                        v8Var.setImageClickListener(null);
                    } else {
                        v8Var.b(drawableD, LocaleController.getString(R.string.GiftPremium));
                        v8Var.setImageClickListener(new fx0(profileActivity, 11));
                    }
                } else if (z10) {
                    Drawable drawableD3 = f0.e.d(v8Var.getContext(), R.drawable.header_qr_24);
                    drawableD3.setColorFilter(new PorterDuffColorFilter(profileActivity.getThemedColor(org.telegram.ui.ActionBar.g6.f23375v8), PorterDuff.Mode.MULTIPLY));
                    v8Var.b(drawableD3, LocaleController.getString(R.string.GetQRCode));
                    v8Var.setImageClickListener(new fx0(profileActivity, 12));
                } else {
                    v8Var.setImage(null);
                    v8Var.setImageClickListener(null);
                }
                v8Var.setTag(Integer.valueOf(i10));
                v8Var.f25814a.setLoading(profileActivity.f35956e5);
                v8Var.f25815b.setLoading(profileActivity.f35956e5);
                break;
            case 3:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) view;
                if (i10 == profileActivity.F3) {
                    TLRPC.User user5 = profileActivity.f36043r2.user != null ? profileActivity.f36043r2.user : profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f36043r2.f22528id));
                    jVar.f(profileActivity.f36043r2.about, LocaleController.getString(R.string.UserBio), profileActivity.f36016n2 || !(user5 == null || !user5.premium || profileActivity.f36043r2.about == null));
                } else if (i10 == profileActivity.G3) {
                    String strReplace = profileActivity.f36036q2.about;
                    while (strReplace.contains("\n\n\n")) {
                        strReplace = strReplace.replace("\n\n\n", "\n\n");
                    }
                    jVar.f(strReplace, LocaleController.getString(R.string.DescriptionPlaceholder), ChatObject.isChannel(profileActivity.A2) && !profileActivity.A2.megagroup);
                } else if (i10 == profileActivity.S2) {
                    if (profileActivity.f36043r2 == null || !TextUtils.isEmpty(profileActivity.f36043r2.about)) {
                        jVar.f(profileActivity.f36043r2 == null ? LocaleController.getString(R.string.Loading) : profileActivity.f36043r2.about, LocaleController.getString(R.string.UserBio), profileActivity.getUserConfig().isPremium());
                        profileActivity.f36069v2 = profileActivity.f36043r2 != null ? profileActivity.f36043r2.about : null;
                    } else {
                        jVar.f(LocaleController.getString(R.string.UserBio), LocaleController.getString(R.string.UserBioDetail), false);
                        profileActivity.f36069v2 = null;
                    }
                    jVar.setMoreButtonDisabled(true);
                }
                break;
            case 4:
            case 18:
            case 24:
                org.telegram.ui.Cells.l8 l8Var2 = (org.telegram.ui.Cells.l8) view;
                int i16 = org.telegram.ui.ActionBar.g6.f23215m6;
                int i17 = org.telegram.ui.ActionBar.g6.G6;
                l8Var2.e(i16, i17);
                l8Var2.setTag(Integer.valueOf(i17));
                if (i10 == profileActivity.f36010m4) {
                    int i18 = org.telegram.messenger.y1.n(profileActivity.getMessagesController(), profileActivity.f35952e1).ttl;
                    l8Var2.o(LocaleController.getString(R.string.MessageLifetime), i18 == 0 ? LocaleController.getString(R.string.ShortMessageLifetimeForever) : LocaleController.formatTTLString(i18), false, false);
                } else if (i10 == profileActivity.G4) {
                    l8Var2.i(LocaleController.getString(R.string.Unblock), false);
                    l8Var2.e(-1, org.telegram.ui.ActionBar.g6.f23269p7);
                } else if (i10 == profileActivity.f36018n4) {
                    org.telegram.ui.Components.b40 b40Var = new org.telegram.ui.Components.b40();
                    TLRPC.EncryptedChat encryptedChatN = org.telegram.messenger.y1.n(profileActivity.getMessagesController(), profileActivity.f35952e1);
                    byte[] bArr = encryptedChatN.key_hash;
                    b40Var.f26916a = bArr;
                    if (bArr == null) {
                        byte[] bArrCalcAuthKeyHash = AndroidUtilities.calcAuthKeyHash(encryptedChatN.auth_key);
                        b40Var.f26916a = bArrCalcAuthKeyHash;
                        encryptedChatN.key_hash = bArrCalcAuthKeyHash;
                    }
                    b40Var.invalidateSelf();
                    l8Var2.t(LocaleController.getString(R.string.EncryptionKey), b40Var, false);
                } else if (i10 == profileActivity.H4) {
                    l8Var2.e(-1, org.telegram.ui.ActionBar.g6.f23251o6);
                    if (profileActivity.A2.megagroup) {
                        l8Var2.i(LocaleController.getString(R.string.ProfileJoinGroup), false);
                    } else {
                        l8Var2.i(LocaleController.getString(R.string.ProfileJoinChannel), false);
                    }
                } else if (i10 == profileActivity.f36059t4) {
                    if (profileActivity.f36036q2 != null) {
                        if (!ChatObject.isChannel(profileActivity.A2) || profileActivity.A2.megagroup) {
                            l8Var2.q(LocaleController.getString(R.string.ChannelMembers), LocaleController.formatNumber(profileActivity.f36036q2.participants_count, ','), R.drawable.msg_groups, i10 != profileActivity.D4 - 1);
                        } else {
                            l8Var2.q(LocaleController.getString(R.string.ChannelSubscribers), LocaleController.formatNumber(profileActivity.f36036q2.participants_count, ','), R.drawable.msg_groups, i10 != profileActivity.D4 - 1);
                        }
                    } else if (!ChatObject.isChannel(profileActivity.A2) || profileActivity.A2.megagroup) {
                        l8Var2.m(R.drawable.msg_groups, LocaleController.getString(R.string.ChannelMembers), i10 != profileActivity.D4 - 1);
                    } else {
                        l8Var2.m(R.drawable.msg_groups, LocaleController.getString(R.string.ChannelSubscribers), i10 != profileActivity.D4 - 1);
                    }
                } else if (i10 == profileActivity.f36065u4) {
                    if (profileActivity.f36036q2 != null) {
                        l8Var2.q(LocaleController.getString(R.string.SubscribeRequests), String.format("%d", Integer.valueOf(profileActivity.f36036q2.requests_pending)), R.drawable.msg_requests, i10 != profileActivity.D4 - 1);
                    }
                } else if (i10 == profileActivity.v4) {
                    if (profileActivity.f36036q2 != null) {
                        l8Var2.q(LocaleController.getString(R.string.ChannelAdministrators), String.format("%d", Integer.valueOf(profileActivity.f36036q2.admins_count)), R.drawable.msg_admins, i10 != profileActivity.D4 - 1);
                    } else {
                        l8Var2.m(R.drawable.msg_admins, LocaleController.getString(R.string.ChannelAdministrators), i10 != profileActivity.D4 - 1);
                    }
                } else if (i10 == profileActivity.f36077w4) {
                    l8Var2.m(R.drawable.msg_customize, LocaleController.getString(R.string.ChannelAdminSettings), i10 != profileActivity.D4 - 1);
                } else if (i10 == profileActivity.f36097z4) {
                    TL_stars.StarsAmount starsAmountC = hh.c0.g(((org.telegram.ui.ActionBar.n2) profileActivity).currentAccount).c(-profileActivity.f35929b1);
                    long jI = hh.c0.g(((org.telegram.ui.ActionBar.n2) profileActivity).currentAccount).i(-profileActivity.f35929b1);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (jI > 0) {
                        double d = jI / 1.0E9d;
                        if (d > 1000.0d) {
                            spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) AndroidUtilities.formatWholeNumber((int) d, 0));
                        } else {
                            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                            decimalFormatSymbols.setDecimalSeparator('.');
                            DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                            decimalFormat.setMinimumFractionDigits(2);
                            decimalFormat.setMaximumFractionDigits(3);
                            decimalFormat.setGroupingUsed(false);
                            spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) decimalFormat.format(d));
                        }
                    }
                    if (starsAmountC.amount > 0) {
                        if (spannableStringBuilder.length() > 0) {
                            spannableStringBuilder.append((CharSequence) " ");
                        }
                        spannableStringBuilder.append((CharSequence) "XTR ").append((CharSequence) hh.oa.K0(starsAmountC, 0.777f, ' '));
                    }
                    l8Var2.q(LocaleController.getString(R.string.ChannelStars), fe.f0(hh.oa.X0(false, spannableStringBuilder, 0.7f, null), l8Var2.getTextView().getPaint(), 1.0f, 0.0f, true), R.drawable.menu_feature_paid, true);
                } else if (i10 == profileActivity.f36084x4) {
                    TL_stars.StarsAmount starsAmountC2 = hh.c0.g(((org.telegram.ui.ActionBar.n2) profileActivity).currentAccount).c(profileActivity.f35923a1);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    if (starsAmountC2.amount > 0) {
                        spannableStringBuilder2.append((CharSequence) "XTR ").append((CharSequence) hh.oa.K0(starsAmountC2, 0.777f, ' '));
                    }
                    l8Var2.q(LocaleController.getString(R.string.BotBalanceStars), fe.f0(hh.oa.X0(false, spannableStringBuilder2, 0.7f, null), l8Var2.getTextView().getPaint(), 1.0f, 0.0f, true), R.drawable.menu_premium_main, true);
                } else if (i10 == profileActivity.f36091y4) {
                    long jI2 = hh.c0.g(((org.telegram.ui.ActionBar.n2) profileActivity).currentAccount).i(profileActivity.f35923a1);
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                    if (jI2 > 0) {
                        double d10 = jI2 / 1.0E9d;
                        if (d10 > 1000.0d) {
                            spannableStringBuilder3.append((CharSequence) "TON ").append((CharSequence) AndroidUtilities.formatWholeNumber((int) d10, 0));
                        } else {
                            DecimalFormatSymbols decimalFormatSymbols2 = new DecimalFormatSymbols(Locale.US);
                            decimalFormatSymbols2.setDecimalSeparator('.');
                            DecimalFormat decimalFormat2 = new DecimalFormat("#.##", decimalFormatSymbols2);
                            decimalFormat2.setMinimumFractionDigits(2);
                            decimalFormat2.setMaximumFractionDigits(3);
                            decimalFormat2.setGroupingUsed(false);
                            spannableStringBuilder3.append((CharSequence) "TON ").append((CharSequence) decimalFormat2.format(d10));
                        }
                    }
                    l8Var2.q(LocaleController.getString(R.string.BotBalanceTON), fe.f0(hh.oa.X0(false, spannableStringBuilder3, 0.7f, null), l8Var2.getTextView().getPaint(), 1.0f, 0.0f, true), R.drawable.outline_gram_24, true);
                } else if (i10 == profileActivity.C4) {
                    if (profileActivity.f36036q2 != null) {
                        l8Var2.q(LocaleController.getString(R.string.ChannelBlacklist), String.format("%d", Integer.valueOf(Math.max(profileActivity.f36036q2.banned_count, profileActivity.f36036q2.kicked_count))), R.drawable.msg_user_remove, i10 != profileActivity.D4 - 1);
                    } else {
                        l8Var2.m(R.drawable.msg_user_remove, LocaleController.getString(R.string.ChannelBlacklist), i10 != profileActivity.D4 - 1);
                    }
                } else if (i10 == profileActivity.f36053s4) {
                    l8Var2.e(i16, i17);
                    int i19 = i10 + 1;
                    l8Var2.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddMember), profileActivity.D4 == -1 || (i19 >= profileActivity.f36038q4 && i19 < profileActivity.f36045r4));
                } else if (i10 == profileActivity.Q3) {
                    l8Var2.i(LocaleController.getString(R.string.SendMessageLocation), true);
                } else if (i10 == profileActivity.V3) {
                    l8Var2.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddToContacts), false);
                    l8Var2.e(i16, i17);
                } else if (i10 == profileActivity.S3) {
                    l8Var2.m(R.drawable.menu_reaction_delete_24, LocaleController.getString(R.string.DeleteReactionMenu), false);
                    l8Var2.e(org.telegram.ui.ActionBar.g6.f23284q7, org.telegram.ui.ActionBar.g6.f23269p7);
                } else if (i10 == profileActivity.T3) {
                    TLRPC.Chat chat2 = profileActivity.getMessagesController().getChat(Long.valueOf(-profileActivity.W4));
                    if (chat2 == null || !ChatObject.canBlockUsers(chat2)) {
                        l8Var2.m(R.drawable.msg_report, LocaleController.getString(R.string.ReportReaction2), false);
                    } else {
                        l8Var2.m(R.drawable.msg_block2, LocaleController.getString(R.string.ReportReactionAndBan2), false);
                    }
                    l8Var2.e(org.telegram.ui.ActionBar.g6.f23284q7, org.telegram.ui.ActionBar.g6.f23269p7);
                } else if (i10 == profileActivity.R3) {
                    l8Var2.i(LocaleController.getString(R.string.ReportUserLocation), false);
                    int i20 = org.telegram.ui.ActionBar.g6.f23269p7;
                    l8Var2.e(-1, i20);
                    l8Var2.e(-1, i20);
                } else if (i10 == profileActivity.f35939c3) {
                    l8Var2.s(LocaleController.getString(R.string.Language), LocaleController.getCurrentLanguageName(), false, R.drawable.msg2_language, false);
                    l8Var2.setImageLeft(23);
                } else if (i10 == profileActivity.f35931b3) {
                    l8Var2.m(R.drawable.msg2_notifications, LocaleController.getString(R.string.NotificationsAndSounds), true);
                } else if (i10 == profileActivity.f35946d3) {
                    l8Var2.m(R.drawable.msg2_secret, LocaleController.getString(R.string.PrivacySettings), true);
                } else if (i10 == profileActivity.f35954e3) {
                    l8Var2.m(R.drawable.msg2_data, LocaleController.getString(R.string.DataSettings), true);
                } else if (i10 == profileActivity.f35962f3) {
                    l8Var2.m(R.drawable.msg2_discussion, LocaleController.getString(R.string.ChatSettings), true);
                } else if (i10 == profileActivity.f35969g3) {
                    l8Var2.m(R.drawable.msg2_folder, LocaleController.getString(R.string.Filters), true);
                } else if (i10 == profileActivity.f35983i3) {
                    l8Var2.m(R.drawable.msg2_sticker, LocaleController.getString(R.string.StickersName), true);
                } else if (i10 == profileActivity.f35976h3) {
                    l8Var2.m(R.drawable.msg2_battery, LocaleController.getString(R.string.PowerUsage), true);
                } else if (i10 == profileActivity.f36009m3) {
                    l8Var2.m(R.drawable.msg2_ask_question, LocaleController.getString(R.string.AskAQuestion), true);
                } else if (i10 == profileActivity.f36017n3) {
                    l8Var2.m(R.drawable.msg2_help, LocaleController.getString(R.string.TelegramFAQ), true);
                } else if (i10 == profileActivity.f36024o3) {
                    l8Var2.m(R.drawable.msg2_policy, LocaleController.getString(R.string.PrivacyPolicy), false);
                } else if (i10 == profileActivity.f36044r3) {
                    l8Var2.i(LocaleController.getString(R.string.DebugSendLogs), true);
                } else if (i10 == profileActivity.f36052s3) {
                    l8Var2.i(LocaleController.getString(R.string.DebugSendLastLogs), true);
                } else if (i10 == profileActivity.f36058t3) {
                    l8Var2.i(LocaleController.getString(R.string.DebugClearLogs), profileActivity.f36064u3 != -1);
                } else if (i10 == profileActivity.f36064u3) {
                    l8Var2.i("Switch Backend", false);
                } else if (i10 == profileActivity.f35990j3) {
                    l8Var2.m(R.drawable.msg2_devices, LocaleController.getString(R.string.Devices), true);
                } else if (i10 == profileActivity.K2) {
                    profileActivity.S.N(86);
                    profileActivity.S.J();
                    l8Var2.n(LocaleController.getString(R.string.SetProfilePhoto), profileActivity.S, false);
                    l8Var2.e(org.telegram.ui.ActionBar.g6.f23373v6, org.telegram.ui.ActionBar.g6.f23357u6);
                    l8Var2.getImageView().setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
                    l8Var2.setImageLeft(12);
                    profileActivity.I2 = l8Var2;
                } else if (i10 == profileActivity.W3) {
                    l8Var2.m(R.drawable.msg_groups_create, LocaleController.getString(R.string.AddToGroupOrChannel), false);
                } else if (i10 == profileActivity.Y3) {
                    l8Var2.n(LocaleController.getString(R.string.TelegramPremium), new org.telegram.ui.Components.j5(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), ag.j2.d().f496f), true);
                    l8Var2.setImageLeft(23);
                } else if (i10 == profileActivity.Z3) {
                    hh.u7 u7VarW = hh.u7.w(((org.telegram.ui.ActionBar.n2) profileActivity).currentAccount);
                    long j10 = u7VarW.p().amount;
                    String string8 = LocaleController.getString(R.string.MenuTelegramStars);
                    if (u7VarW.f10154e && j10 > 0) {
                        charSequenceJ0 = hh.oa.J0(u7VarW.p(), 0.85f, ' ');
                    }
                    l8Var2.r(string8, charSequenceJ0, new org.telegram.ui.Components.j5(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), ag.j2.d().h), true);
                    l8Var2.setImageLeft(23);
                } else if (i10 == profileActivity.f35924a4) {
                    hh.u7 u7VarL = hh.u7.L(((org.telegram.ui.ActionBar.n2) profileActivity).currentAccount);
                    long j11 = u7VarL.p().amount;
                    String string9 = LocaleController.getString(R.string.MyTON);
                    if (u7VarL.f10154e && j11 > 0) {
                        charSequenceJ0 = hh.oa.J0(u7VarL.p(), 0.85f, ' ');
                    }
                    l8Var2.q(string9, charSequenceJ0, R.drawable.settings_gram_24, true);
                    l8Var2.setImageLeft(23);
                } else if (i10 == profileActivity.f35932b4) {
                    l8Var2.m(R.drawable.menu_shop, LocaleController.getString(R.string.TelegramBusiness), true);
                    l8Var2.setImageLeft(23);
                } else if (i10 == profileActivity.f35940c4) {
                    l8Var2.m(R.drawable.menu_gift, LocaleController.getString(R.string.SendAGift), false);
                    l8Var2.setImageLeft(23);
                } else {
                    if (i10 == profileActivity.botPermissionLocation) {
                        String string10 = LocaleController.getString(R.string.BotProfilePermissionLocation);
                        nh.t0 t0Var = profileActivity.f36023o2;
                        l8Var = l8Var2;
                        l8Var.k(string10, t0Var != null && t0Var.g(), R.drawable.filled_access_location, profileActivity.getThemedColor(org.telegram.ui.ActionBar.g6.uj), profileActivity.botPermissionBiometry != -1);
                    } else {
                        l8Var = l8Var2;
                        if (i10 == profileActivity.botPermissionBiometry) {
                            String string11 = LocaleController.getString(R.string.BotProfilePermissionBiometry);
                            nh.q qVar = profileActivity.f36030p2;
                            l8Var.k(string11, qVar != null && qVar.g(), R.drawable.filled_access_fingerprint, profileActivity.getThemedColor(org.telegram.ui.ActionBar.g6.xj), false);
                        } else if (i10 == profileActivity.botPermissionEmojiStatus) {
                            l8Var.k(LocaleController.getString(R.string.BotProfilePermissionEmojiStatus), profileActivity.f36043r2 != null && profileActivity.f36043r2.bot_can_manage_emoji_status, R.drawable.filled_access_sleeping, profileActivity.getThemedColor(org.telegram.ui.ActionBar.g6.sj), (profileActivity.botPermissionLocation == -1 && profileActivity.botPermissionBiometry == -1) ? false : true);
                        }
                    }
                    l8Var2 = l8Var;
                }
                l8Var2.f24630c.setTextColor(profileActivity.getThemedColor(org.telegram.ui.ActionBar.g6.I6));
                break;
            case 6:
                org.telegram.ui.Cells.g5 g5Var = (org.telegram.ui.Cells.g5) view;
                if (i10 == profileActivity.J3) {
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(((org.telegram.ui.ActionBar.n2) profileActivity).currentAccount);
                    long j12 = profileActivity.f35952e1;
                    if (j12 == 0) {
                        j12 = profileActivity.f35923a1 != 0 ? profileActivity.f35923a1 : -profileActivity.f35929b1;
                    }
                    String sharedPrefKey = NotificationsController.getSharedPrefKey(j12, profileActivity.f35937c1);
                    boolean z22 = notificationsSettings.getBoolean("custom_" + sharedPrefKey, false);
                    boolean zContains = notificationsSettings.contains("notify2_" + sharedPrefKey);
                    int iC = org.telegram.messenger.y1.c("notify2_", sharedPrefKey, notificationsSettings, 0);
                    int iC2 = org.telegram.messenger.y1.c("notifyuntil_", sharedPrefKey, notificationsSettings, 0);
                    if (iC != 3 || iC2 == Integer.MAX_VALUE) {
                        if (iC == 0) {
                            if (zContains) {
                                zIsGlobalNotificationsEnabled = true;
                            } else {
                                zIsGlobalNotificationsEnabled = profileActivity.getNotificationsController().isGlobalNotificationsEnabled(j12, false, false);
                            }
                        } else if (iC == 1) {
                            zIsGlobalNotificationsEnabled = true;
                        } else {
                            zIsGlobalNotificationsEnabled = false;
                        }
                        string5 = (zIsGlobalNotificationsEnabled && z22) ? LocaleController.getString(R.string.NotificationsCustom) : LocaleController.getString(zIsGlobalNotificationsEnabled ? R.string.NotificationsOn : R.string.NotificationsOff);
                        z12 = zIsGlobalNotificationsEnabled;
                    } else {
                        int currentTime = iC2 - profileActivity.getConnectionsManager().getCurrentTime();
                        if (currentTime <= 0) {
                            string5 = z22 ? LocaleController.getString(R.string.NotificationsCustom) : LocaleController.getString(R.string.NotificationsOn);
                            z12 = true;
                        } else {
                            if (currentTime < 3600) {
                                string5 = LocaleController.formatString("WillUnmuteIn", R.string.WillUnmuteIn, LocaleController.formatPluralString("Minutes", currentTime / 60, new Object[0]));
                            } else if (currentTime < 86400) {
                                string5 = LocaleController.formatString("WillUnmuteIn", R.string.WillUnmuteIn, LocaleController.formatPluralString("Hours", (int) Math.ceil((currentTime / 60.0f) / 60.0f), new Object[0]));
                            } else if (currentTime < 31536000) {
                                string5 = LocaleController.formatString("WillUnmuteIn", R.string.WillUnmuteIn, LocaleController.formatPluralString("Days", (int) Math.ceil(((currentTime / 60.0f) / 60.0f) / 24.0f), new Object[0]));
                            }
                            z12 = false;
                        }
                    }
                    if (string5 == null) {
                        string5 = LocaleController.getString(R.string.NotificationsOff);
                    }
                    if (hashSet != null && !hashSet.isEmpty()) {
                        string5 = String.format(Locale.US, LocaleController.getPluralString("NotificationTopicExceptionsDesctription", hashSet.size()), string5, Integer.valueOf(hashSet.size()));
                    }
                    String str9 = string5;
                    g5Var.setAnimationsEnabled(profileActivity.f35978h5);
                    g5Var.b(LocaleController.getString(R.string.Notifications), str9, 0, z12, 0, false, profileActivity.f35955e4 >= 0, false);
                }
                break;
            case 7:
                view.setTag(Integer.valueOf(i10));
                break;
            case 8:
                org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) view;
                try {
                    chatParticipant = !arrayList2.isEmpty() ? (TLRPC.ChatParticipant) arrayList.get(((Integer) arrayList2.get(i10 - profileActivity.f36038q4)).intValue()) : (TLRPC.ChatParticipant) arrayList.get(i10 - profileActivity.f36038q4);
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                if (chatParticipant != null) {
                    if (chatParticipant instanceof TLRPC.TL_chatChannelParticipant) {
                        TLRPC.ChannelParticipant channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                        String string12 = channelParticipant.rank;
                        if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                            if (TextUtils.isEmpty(string12)) {
                                string12 = LocaleController.getString(R.string.ChannelCreator);
                            }
                            z16 = false;
                            z17 = true;
                            z18 = true;
                        } else {
                            if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                                if (TextUtils.isEmpty(string12)) {
                                    string12 = LocaleController.getString(R.string.ChannelAdmin);
                                }
                                z16 = channelParticipant.promoted_by == profileActivity.getUserConfig().getClientUserId();
                                z17 = true;
                            } else {
                                z16 = false;
                                z17 = false;
                            }
                            z18 = false;
                        }
                        z13 = z16;
                        str7 = string12;
                        z14 = z17;
                        z15 = z18;
                    } else {
                        String string13 = chatParticipant.rank;
                        if (chatParticipant instanceof TLRPC.TL_chatParticipantCreator) {
                            if (TextUtils.isEmpty(string13)) {
                                string13 = LocaleController.getString(R.string.ChannelCreator);
                            }
                            str7 = string13;
                            z13 = false;
                            z14 = true;
                            z15 = true;
                        } else {
                            if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                                if (TextUtils.isEmpty(string13)) {
                                    string13 = LocaleController.getString(R.string.ChannelAdmin);
                                }
                                z13 = chatParticipant.inviter_id == profileActivity.getUserConfig().getClientUserId();
                                str7 = string13;
                                z14 = true;
                            } else {
                                str7 = string13;
                                z13 = false;
                                z14 = false;
                            }
                            z15 = false;
                        }
                    }
                    final TLRPC.User user6 = profileActivity.getMessagesController().getUser(Long.valueOf(chatParticipant.user_id));
                    final String str10 = str7;
                    final boolean z23 = z14;
                    final boolean z24 = z15;
                    saVar.a(str7, z14, z15, UserObject.isUserSelf(user6) && ChatObject.canManageMyTag(profileActivity.getMessagesController().getChat(Long.valueOf(profileActivity.f35929b1))), new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            ProfileActivity profileActivity2 = this.f40269a.f43554e;
                            org.telegram.ui.Components.kz0.b(profileActivity2.getParentActivity(), ((org.telegram.ui.ActionBar.n2) profileActivity2).currentAccount, profileActivity2.a(), user6, str10, z23, z24, z13, ((org.telegram.ui.ActionBar.n2) profileActivity2).resourceProvider);
                        }
                    });
                    saVar.f(user6, i10 != profileActivity.f36045r4 - 1);
                }
                break;
            case 12:
                view.requestLayout();
                break;
            case 15:
                org.telegram.ui.Cells.v6 v6Var = (org.telegram.ui.Cells.v6) view;
                if (i10 == profileActivity.Y2) {
                    v6Var.setType(1);
                } else if (i10 == profileActivity.W2) {
                    v6Var.setType(0);
                } else if (i10 == profileActivity.U2) {
                    v6Var.setType(2);
                }
                break;
            case 17:
                ((org.telegram.ui.Cells.x8) view).setText(LocaleController.getString(R.string.BotAddToGroupOrChannelInfo));
                break;
            case 20:
                ((org.telegram.ui.Cells.p8) view).f(LocaleController.getString(R.string.Notifications), !profileActivity.getMessagesController().isDialogMuted(profileActivity.a(), profileActivity.f35937c1), false);
                break;
            case 21:
                ((qf.c1) view).a(profileActivity.f36043r2 != null ? profileActivity.f36043r2.business_location : null, profileActivity.I3 < 0 && !profileActivity.f36022o1);
                break;
            case 22:
                qf.b1 b1Var = (qf.b1) view;
                b1Var.setOnTimezoneSwitchClick(new kz0(this, z19 ? 1 : 0));
                TL_account.TL_businessWorkHours tL_businessWorkHours = profileActivity.f36043r2 != null ? profileActivity.f36043r2.business_work_hours : null;
                boolean z25 = profileActivity.J4;
                boolean z26 = profileActivity.K4;
                if ((profileActivity.I3 >= 0 || profileActivity.f36022o1) && profileActivity.L3 < 0) {
                    z20 = false;
                }
                b1Var.b(tL_businessWorkHours, z25, z26, z20);
                break;
            case 23:
                org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view;
                TLRPC.Chat chat3 = profileActivity.getMessagesController().getChat(Long.valueOf(profileActivity.f36043r2.personal_channel_id));
                org.telegram.ui.Cells.c6 c6Var = profileActivity.f36051s2;
                d6Var.a(c6Var != null ? c6Var.d : null, chat3);
                break;
            case 26:
                org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
                x8Var.setLinkTextRippleColor(null);
                if (i10 == profileActivity.N3) {
                    profileActivity.getMessagesController().getUserOrChat(profileActivity.a());
                    TL_bots.botVerification botverification = profileActivity.f36043r2 != null ? profileActivity.f36043r2.bot_verification : profileActivity.f36036q2 != null ? profileActivity.f36036q2.bot_verification : null;
                    Long lValueOf = (profileActivity.f36043r2 == null || !TLObject.hasFlag(profileActivity.f36043r2.flags2, 33554432)) ? null : Long.valueOf(profileActivity.f36043r2.bot_manager_id);
                    int i21 = 14;
                    if (profileActivity.f35955e4 < 0 && botverification == null && lValueOf == null) {
                        x8Var.setFixedSize(14);
                        x8Var.setText(null);
                    } else {
                        x8Var.setFixedSize(0);
                        TLRPC.User user7 = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f35923a1));
                        boolean z27 = user7 != null && user7.bot && user7.bot_can_edit;
                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                        if (profileActivity.f35955e4 >= 0) {
                            spannableStringBuilder4.append(AndroidUtilities.replaceSingleTag(LocaleController.getString(z27 ? R.string.ProfileBotOpenAppInfoOwner : R.string.ProfileBotOpenAppInfo), new org.telegram.ui.Components.f50(i21, this, z27)));
                            if (botverification != null || lValueOf != null) {
                                spannableStringBuilder4.append("\n\n\n");
                            }
                        }
                        if (botverification != null) {
                            spannableStringBuilder4.append("x");
                            spannableStringBuilder4.setSpan(new org.telegram.ui.Components.t5(botverification.icon, x8Var.getTextView().getPaint().getFontMetricsInt()), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                            spannableStringBuilder4.append(" ");
                            SpannableString spannableString2 = new SpannableString(botverification.description);
                            try {
                                AndroidUtilities.addLinksSafe(spannableString2, 1, false, false);
                                URLSpan[] uRLSpanArr = (URLSpan[]) spannableString2.getSpans(0, spannableString2.length(), URLSpan.class);
                                while (i13 < uRLSpanArr.length) {
                                    URLSpan uRLSpan = uRLSpanArr[i13];
                                    int spanStart = spannableString2.getSpanStart(uRLSpan);
                                    int spanEnd = spannableString2.getSpanEnd(uRLSpan);
                                    String url = uRLSpan.getURL();
                                    spannableString2.removeSpan(uRLSpan);
                                    spannableString2.setSpan(new nz0(this, url, url), spanStart, spanEnd, 33);
                                    i13++;
                                }
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                            spannableStringBuilder4.append((CharSequence) spannableString2);
                        } else if (lValueOf != null && (user = profileActivity.getMessagesController().getUser(lValueOf)) != null) {
                            int length = spannableStringBuilder4.length();
                            spannableStringBuilder4.append("</>");
                            spannableStringBuilder4.setSpan(new org.telegram.ui.Components.cq(R.drawable.managed_bot), length, spannableStringBuilder4.length(), 33);
                            spannableStringBuilder4.append(" ");
                            spannableStringBuilder4.append(AndroidUtilities.replaceSingleLink(LocaleController.formatString(R.string.ProfileBotManagedBy, UserObject.getPublicUsername(user)), profileActivity.getThemedColor(org.telegram.ui.ActionBar.g6.gc), new zs0(21, this, lValueOf)));
                        }
                        x8Var.setLinkTextRippleColor(Integer.valueOf(org.telegram.ui.ActionBar.g6.l1(0.2f, profileActivity.getThemedColor(org.telegram.ui.ActionBar.g6.B6))));
                        x8Var.setText(spannableStringBuilder4);
                    }
                } else if (i10 == profileActivity.P3) {
                    TLRPC.User user8 = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f35923a1));
                    if (user8 != null && user8.bot && user8.bot_can_edit) {
                        x8Var.setFixedSize(0);
                        x8Var.setText(LocaleController.formatString(R.string.ProfileBotAffiliateProgramInfoOwner, UserObject.getUserName(user8), nh.k.G0((profileActivity.f36043r2 == null || profileActivity.f36043r2.starref_program == null) ? 0 : profileActivity.f36043r2.starref_program.commission_permille)));
                    } else {
                        x8Var.setFixedSize(0);
                        x8Var.setText(LocaleController.formatString(R.string.ProfileBotAffiliateProgramInfo, UserObject.getUserName(user8), nh.k.G0((profileActivity.f36043r2 == null || profileActivity.f36043r2.starref_program == null) ? 0 : profileActivity.f36043r2.starref_program.commission_permille)));
                    }
                }
                break;
            case 27:
                nh.h hVar = (nh.h) view;
                hVar.a(profileActivity.getThemedColor(org.telegram.ui.ActionBar.g6.uj), R.drawable.filled_affiliate, LocaleController.getString(R.string.ProfileBotAffiliateProgram), null);
                if (profileActivity.f36043r2 != null && profileActivity.f36043r2.starref_program != null) {
                    strG0 = nh.k.G0(profileActivity.f36043r2.starref_program.commission_permille);
                }
                hVar.setPercent(strG0);
                break;
            case 32:
                TextView textView = (TextView) view;
                textView.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(10.0f));
                if (i10 == profileActivity.f35963f4) {
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder("⚠️");
                    org.telegram.ui.Components.cq cqVar = new org.telegram.ui.Components.cq(R.drawable.round_warn);
                    cqVar.translate(0.0f, AndroidUtilities.dp(1.0f));
                    cqVar.setOverrideColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.wj, profileActivity.f36067v0));
                    spannableStringBuilder5.setSpan(cqVar, 0, spannableStringBuilder5.length(), 33);
                    spannableStringBuilder5.append((CharSequence) " ");
                    spannableStringBuilder5.append((CharSequence) LocaleController.formatString(R.string.ProfileUnofficialSecurityRisk, UserObject.getForcedFirstName(profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f35923a1)))));
                    textView.setText(spannableStringBuilder5);
                }
                break;
            case 33:
                ph.b bVar = (ph.b) view;
                if (profileActivity.A2 != null) {
                    bVar.a(((org.telegram.ui.ActionBar.n2) profileActivity).currentAccount, profileActivity.getMessagesController().getChat(Long.valueOf(profileActivity.A2.linked_community_id)));
                    break;
                } else if (profileActivity.f35923a1 != 0 && (user2 = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f35923a1))) != null) {
                    bVar.a(((org.telegram.ui.ActionBar.n2) profileActivity).currentAccount, profileActivity.getMessagesController().getChat(Long.valueOf(user2.linked_community_id)));
                    break;
                }
                break;
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View saVar;
        View sz0Var;
        Context context = this.f43553c;
        ProfileActivity profileActivity = this.f43554e;
        switch (i10) {
            case 1:
                saVar = new org.telegram.ui.Cells.j4(this.f43553c, org.telegram.ui.ActionBar.g6.L6, 18, 7, false, profileActivity.f36067v0);
                break;
            case 2:
            case 19:
            case 30:
                pz0 pz0Var = new pz0(this, this.f43553c, profileActivity.f36067v0, i10 == 30, i10 == 19);
                pz0Var.setContentDescriptionValueFirst(true);
                saVar = pz0Var;
                break;
            case 3:
                qz0 qz0Var = new qz0(this, context, profileActivity, profileActivity.f36067v0);
                profileActivity.J5 = qz0Var;
                saVar = qz0Var;
                break;
            case 4:
                saVar = new hs(this, context, profileActivity.f36067v0);
                break;
            case 5:
                org.telegram.ui.Cells.a3 a3Var = new org.telegram.ui.Cells.a3(context, profileActivity.f36067v0);
                a3Var.setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f), 0, 0);
                saVar = a3Var;
                break;
            case 6:
                saVar = new rz0(this, context, profileActivity.f36067v0);
                break;
            case 7:
                saVar = new org.telegram.ui.Cells.w6(context, (org.telegram.messenger.rl) null);
                break;
            case 8:
                saVar = new org.telegram.ui.Cells.sa(profileActivity.f36053s4 == -1 ? 9 : 6, 0, this.f43553c, profileActivity.f36067v0, true, false);
                break;
            case 9:
            case 10:
            case 14:
            case 16:
            case 29:
            default:
                org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(context, 10, profileActivity.f36067v0);
                x8Var.getTextView().setGravity(1);
                x8Var.getTextView().setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A6, profileActivity.f36067v0));
                x8Var.getTextView().setMovementMethod(null);
                x8Var.setText(AndroidUtilities.getBuildVersionInfo());
                x8Var.getTextView().setPadding(0, AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f));
                saVar = x8Var;
                break;
            case 11:
            case 31:
                org.telegram.ui.Cells.q3 q3Var = new org.telegram.ui.Cells.q3(context, AndroidUtilities.dp(i10 == 31 ? 12.0f : 6.0f), 2);
                q3Var.setTag(-33024);
                saVar = q3Var;
                break;
            case 12:
                sz0Var = new sz0(this, context);
                sz0Var.setBackground(new ColorDrawable(0));
                sz0Var.setTag(-33024);
                saVar = sz0Var;
                break;
            case 13:
                if (profileActivity.K.getParent() != null) {
                    ((ViewGroup) profileActivity.K.getParent()).removeView(profileActivity.K);
                }
                sz0Var = profileActivity.K;
                sz0Var.setTag(-33024);
                saVar = sz0Var;
                break;
            case 15:
                saVar = new uz0(this, context, profileActivity.f36067v0);
                break;
            case 17:
                saVar = new org.telegram.ui.Cells.x8(context, profileActivity.f36067v0);
                break;
            case 18:
            case 24:
                ag.f3 f3Var = new ag.f3(context, i10 == 18 ? 0 : 1, profileActivity.f36067v0);
                f3Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, profileActivity.f36067v0));
                saVar = f3Var;
                break;
            case 20:
                saVar = new org.telegram.ui.Cells.p8(18, context, profileActivity.f36067v0, false);
                break;
            case 21:
                qf.c1 c1Var = new qf.c1(context, profileActivity.f36067v0);
                c1Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, profileActivity.f36067v0));
                saVar = c1Var;
                break;
            case 22:
                tz0 tz0Var = new tz0(this, context, profileActivity.f36067v0);
                tz0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, profileActivity.f36067v0));
                saVar = tz0Var;
                break;
            case 23:
                saVar = new mz0(profileActivity);
                break;
            case 25:
                FrameLayout frameLayout = new FrameLayout(context);
                lh.d dVar = new lh.d(context, profileActivity.f36067v0, true);
                dVar.e();
                dVar.g(LocaleController.getString(R.string.ProfileBotOpenApp), false, true);
                dVar.setOnClickListener(new kz0(this, 0));
                frameLayout.addView(dVar, h7.z5.d(-1, 48.0f, 119, 18.0f, 14.0f, 18.0f, 14.0f));
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, profileActivity.f36067v0));
                saVar = frameLayout;
                break;
            case 26:
                saVar = new org.telegram.ui.Cells.x8(context, profileActivity.f36067v0);
                break;
            case 27:
                saVar = new nh.h(context, profileActivity.f36067v0);
                break;
            case 28:
                sz0Var = new org.telegram.ui.Components.zm(context, 21);
                sz0Var.setTag(-33024);
                saVar = sz0Var;
                break;
            case 32:
                saVar = new i01(profileActivity, context);
                break;
            case 33:
                saVar = new ph.b(context, profileActivity.f36067v0);
                break;
        }
        if (i10 != 13) {
            saVar.setLayoutParams(new f2.y0(-1, -2));
        }
        return new org.telegram.ui.Components.lk0(saVar);
    }

    @Override
    public final void y(f2.o1 o1Var) {
        View view = o1Var.f5789a;
        ProfileActivity profileActivity = this.f43554e;
        if (view == profileActivity.K) {
            profileActivity.M = true;
        }
        if (view instanceof org.telegram.ui.Cells.v8) {
            ((org.telegram.ui.Cells.v8) view).f25814a.setLoading(profileActivity.f35956e5);
            ((org.telegram.ui.Cells.v8) view).f25815b.setLoading(profileActivity.f35956e5);
        }
    }

    @Override
    public final void z(f2.o1 o1Var) {
        View view = o1Var.f5789a;
        ProfileActivity profileActivity = this.f43554e;
        if (view == profileActivity.K) {
            profileActivity.M = false;
        }
    }
}
