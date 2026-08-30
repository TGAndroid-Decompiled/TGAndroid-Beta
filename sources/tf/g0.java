package tf;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.br;
import vh.v2;
public final class g0 extends sl0 {
    public static final e0[] Z2 = {new e0(R.drawable.search_media_filled, R.string.SharedMediaTab2, new TLRPC.TL_inputMessagesFilterPhotoVideo(), 0), new e0(R.drawable.search_links_filled, R.string.SharedLinksTab2, new TLRPC.TL_inputMessagesFilterUrl(), 2), new e0(R.drawable.search_files_filled, R.string.SharedFilesTab2, new TLRPC.TL_inputMessagesFilterDocument(), 1), new e0(R.drawable.search_music_filled, R.string.SharedMusicTab2, new TLRPC.TL_inputMessagesFilterMusic(), 3), new e0(R.drawable.search_voice_filled, R.string.SharedVoiceTab2, new TLRPC.TL_inputMessagesFilterRoundVoice(), 5)};
    public static final Pattern f44724a3 = Pattern.compile("20[0-9]{1,2}");
    public static final Pattern f44725b3 = Pattern.compile("(\\w{3,}) ([0-9]{0,4})");
    public static final Pattern c3 = Pattern.compile("([0-9]{0,4}) (\\w{2,})");
    public static final Pattern f44726d3 = Pattern.compile("^([0-9]{1,4})(\\.| |/|\\-)([0-9]{1,4})$");
    public static final Pattern f44727e3 = Pattern.compile("^([0-9]{1,2})(\\.| |/|\\-)([0-9]{1,2})(\\.| |/|\\-)([0-9]{1,4})$");
    public static final int[] f44728f3 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public final ArrayList U2;
    public final ArrayList V2;
    public final br W2;
    public boolean X2;
    public final b0 Y2;

    public g0(Context context, f6 f6Var) {
        super(context, f6Var);
        this.U2 = new ArrayList();
        this.V2 = new ArrayList();
        this.X2 = true;
        this.Y2 = new b0(this);
        br brVar = new br((Object) this, 7);
        this.W2 = brVar;
        brVar.j1(0);
        setLayoutManager(brVar);
        setAdapter(new eg.g(this, 6));
        i(new nh.k(9));
        setItemAnimator(new f2.l());
        setWillNotDraw(false);
        setHideIfEmpty(false);
        setSelectorRadius(AndroidUtilities.dp(28.0f));
        setSelectorDrawableColor(j6.v0(j6.f19996i6, this.f28750m2));
    }

    public static void w1(int i10, int i11, ArrayList arrayList) {
        int i12 = i11;
        if (i12 >= 0 && i12 < 12 && i10 >= 0 && i10 < f44728f3[i12]) {
            int i13 = Calendar.getInstance().get(1);
            long timeInMillis = Calendar.getInstance().getTimeInMillis();
            GregorianCalendar gregorianCalendar = (GregorianCalendar) Calendar.getInstance();
            int i14 = i13;
            while (i14 >= 2013) {
                if (i12 != 1 || i10 != 28 || gregorianCalendar.isLeapYear(i14)) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.set(i14, i12, i10 + 1, 0, 0, 0);
                    long timeInMillis2 = calendar.getTimeInMillis();
                    if (timeInMillis2 <= timeInMillis) {
                        calendar.set(i14, i11, i10 + 2, 0, 0, 0);
                        long timeInMillis3 = calendar.getTimeInMillis() - 1;
                        if (i14 == i13) {
                            arrayList.add(new c0(timeInMillis2, timeInMillis3, LocaleController.getInstance().getFormatterDayMonth().format(timeInMillis2)));
                        } else {
                            arrayList.add(new c0(timeInMillis2, timeInMillis3, LocaleController.getInstance().getFormatterYearMax().format(timeInMillis2)));
                        }
                    }
                }
                i14--;
                i12 = i11;
            }
        }
    }

    public static void x1(int i10, int i11, ArrayList arrayList) {
        int i12 = Calendar.getInstance().get(1);
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (i11 >= 2013 && i11 <= i12) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(i11, i10, 1, 0, 0, 0);
            long timeInMillis2 = calendar.getTimeInMillis();
            if (timeInMillis2 <= timeInMillis) {
                calendar.add(2, 1);
                arrayList.add(new c0(timeInMillis2, calendar.getTimeInMillis() - 1, LocaleController.getInstance().getFormatterMonthYear().format(timeInMillis2)));
            }
        }
    }

    public static void y1(String str, ArrayList arrayList) {
        arrayList.clear();
        if (str != null) {
            String trim = str.trim();
            if (trim.length() >= 3) {
                if (!LocaleController.getString(R.string.SearchTipToday).toLowerCase().startsWith(trim) && !"today".startsWith(trim)) {
                    if (!LocaleController.getString(R.string.SearchTipYesterday).toLowerCase().startsWith(trim) && !"yesterday".startsWith(trim)) {
                        Calendar calendar = Calendar.getInstance();
                        int i10 = -1;
                        if (trim.length() > 3) {
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE", Locale.ENGLISH);
                            for (int i11 = 0; i11 < 7; i11++) {
                                calendar.set(7, i11);
                                if (LocaleController.getInstance().getFormatterWeekLong().format(calendar.getTime()).toLowerCase().startsWith(trim) || simpleDateFormat.format(calendar.getTime()).toLowerCase().startsWith(trim)) {
                                    i10 = i11;
                                    break;
                                }
                            }
                        }
                        if (i10 >= 0) {
                            Calendar calendar2 = Calendar.getInstance();
                            long timeInMillis = calendar2.getTimeInMillis();
                            calendar2.set(7, i10);
                            if (calendar2.getTimeInMillis() > timeInMillis) {
                                calendar2.setTimeInMillis(calendar2.getTimeInMillis() - 604800000);
                            }
                            int i12 = calendar2.get(1);
                            int i13 = calendar2.get(2);
                            int i14 = calendar2.get(5);
                            calendar2.set(i12, i13, i14, 0, 0, 0);
                            long timeInMillis2 = calendar2.getTimeInMillis();
                            calendar2.set(i12, i13, i14 + 1, 0, 0, 0);
                            arrayList.add(new c0(timeInMillis2, calendar2.getTimeInMillis() - 1, LocaleController.getInstance().getFormatterWeekLong().format(timeInMillis2)));
                            return;
                        }
                        Matcher matcher = f44726d3.matcher(trim);
                        if (matcher.matches()) {
                            String group = matcher.group(1);
                            String group2 = matcher.group(3);
                            int parseInt = Integer.parseInt(group);
                            int parseInt2 = Integer.parseInt(group2);
                            if (parseInt > 0 && parseInt <= 31) {
                                if (parseInt2 >= 2013 && parseInt <= 12) {
                                    x1(parseInt - 1, parseInt2, arrayList);
                                    return;
                                } else if (parseInt2 <= 12) {
                                    w1(parseInt - 1, parseInt2 - 1, arrayList);
                                    return;
                                } else {
                                    return;
                                }
                            } else if (parseInt >= 2013 && parseInt2 <= 12) {
                                x1(parseInt2 - 1, parseInt, arrayList);
                                return;
                            } else {
                                return;
                            }
                        }
                        Matcher matcher2 = f44727e3.matcher(trim);
                        if (matcher2.matches()) {
                            String group3 = matcher2.group(1);
                            String group4 = matcher2.group(3);
                            String group5 = matcher2.group(5);
                            if (matcher2.group(2).equals(matcher2.group(4))) {
                                int parseInt3 = Integer.parseInt(group3);
                                int parseInt4 = Integer.parseInt(group4) - 1;
                                int parseInt5 = Integer.parseInt(group5);
                                if (parseInt5 >= 10 && parseInt5 <= 99) {
                                    parseInt5 += 2000;
                                }
                                int i15 = parseInt5;
                                int i16 = Calendar.getInstance().get(1);
                                int i17 = parseInt3 - 1;
                                if (parseInt4 >= 0 && parseInt4 < 12 && i17 >= 0 && i17 < f44728f3[parseInt4] && i15 >= 2013 && i15 <= i16) {
                                    Calendar calendar3 = Calendar.getInstance();
                                    calendar3.set(i15, parseInt4, parseInt3, 0, 0, 0);
                                    long timeInMillis3 = calendar3.getTimeInMillis();
                                    calendar3.set(i15, parseInt4, parseInt3 + 1, 0, 0, 0);
                                    arrayList.add(new c0(timeInMillis3, calendar3.getTimeInMillis() - 1, LocaleController.getInstance().getFormatterYearMax().format(timeInMillis3)));
                                    return;
                                }
                                return;
                            }
                            return;
                        } else if (f44724a3.matcher(trim).matches()) {
                            int intValue = Integer.valueOf(trim).intValue();
                            int i18 = Calendar.getInstance().get(1);
                            if (intValue < 2013) {
                                while (i18 >= 2013) {
                                    Calendar calendar4 = Calendar.getInstance();
                                    calendar4.set(i18, 0, 1, 0, 0, 0);
                                    long timeInMillis4 = calendar4.getTimeInMillis();
                                    calendar4.set(i18 + 1, 0, 1, 0, 0, 0);
                                    arrayList.add(new c0(timeInMillis4, calendar4.getTimeInMillis() - 1, Integer.toString(i18)));
                                    i18--;
                                }
                                return;
                            } else if (intValue <= i18) {
                                Calendar calendar5 = Calendar.getInstance();
                                calendar5.set(intValue, 0, 1, 0, 0, 0);
                                long timeInMillis5 = calendar5.getTimeInMillis();
                                calendar5.set(intValue + 1, 0, 1, 0, 0, 0);
                                arrayList.add(new c0(timeInMillis5, calendar5.getTimeInMillis() - 1, Integer.toString(intValue)));
                                return;
                            } else {
                                return;
                            }
                        } else {
                            Matcher matcher3 = f44725b3.matcher(trim);
                            if (matcher3.matches()) {
                                String group6 = matcher3.group(1);
                                String group7 = matcher3.group(2);
                                int z12 = z1(group6);
                                if (z12 >= 0) {
                                    int intValue2 = Integer.valueOf(group7).intValue();
                                    if (intValue2 > 0 && intValue2 <= 31) {
                                        w1(intValue2 - 1, z12, arrayList);
                                        return;
                                    } else if (intValue2 >= 2013) {
                                        x1(z12, intValue2, arrayList);
                                        return;
                                    }
                                }
                            }
                            Matcher matcher4 = c3.matcher(trim);
                            if (matcher4.matches()) {
                                String group8 = matcher4.group(1);
                                int z13 = z1(matcher4.group(2));
                                if (z13 >= 0) {
                                    int intValue3 = Integer.valueOf(group8).intValue();
                                    if (intValue3 > 0 && intValue3 <= 31) {
                                        w1(intValue3 - 1, z13, arrayList);
                                        return;
                                    } else if (intValue3 >= 2013) {
                                        x1(z13, intValue3, arrayList);
                                    }
                                }
                            }
                            if (!TextUtils.isEmpty(trim) && trim.length() > 2) {
                                int z14 = z1(trim);
                                long timeInMillis6 = Calendar.getInstance().getTimeInMillis();
                                if (z14 >= 0) {
                                    for (int i19 = Calendar.getInstance().get(1); i19 >= 2013; i19--) {
                                        Calendar calendar6 = Calendar.getInstance();
                                        calendar6.set(i19, z14, 1, 0, 0, 0);
                                        long timeInMillis7 = calendar6.getTimeInMillis();
                                        if (timeInMillis7 <= timeInMillis6) {
                                            calendar6.add(2, 1);
                                            arrayList.add(new c0(timeInMillis7, calendar6.getTimeInMillis() - 1, LocaleController.getInstance().getFormatterMonthYear().format(timeInMillis7)));
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                    Calendar calendar7 = Calendar.getInstance();
                    int i20 = calendar7.get(1);
                    int i21 = calendar7.get(2);
                    int i22 = calendar7.get(5);
                    calendar7.set(i20, i21, i22, 0, 0, 0);
                    calendar7.set(i20, i21, i22 + 1, 0, 0, 0);
                    arrayList.add(new c0(calendar7.getTimeInMillis() - 86400000, calendar7.getTimeInMillis() - 86400001, LocaleController.getString(R.string.SearchTipYesterday)));
                    return;
                }
                Calendar calendar8 = Calendar.getInstance();
                int i23 = calendar8.get(1);
                int i24 = calendar8.get(2);
                int i25 = calendar8.get(5);
                calendar8.set(i23, i24, i25, 0, 0, 0);
                long timeInMillis8 = calendar8.getTimeInMillis();
                calendar8.set(i23, i24, i25 + 1, 0, 0, 0);
                arrayList.add(new c0(timeInMillis8, calendar8.getTimeInMillis() - 1, LocaleController.getString(R.string.SearchTipToday)));
            }
        }
    }

    public static int z1(String str) {
        String[] strArr = {LocaleController.getString(R.string.January).toLowerCase(), LocaleController.getString(R.string.February).toLowerCase(), LocaleController.getString(R.string.March).toLowerCase(), LocaleController.getString(R.string.April).toLowerCase(), LocaleController.getString(R.string.May).toLowerCase(), LocaleController.getString(R.string.June).toLowerCase(), LocaleController.getString(R.string.July).toLowerCase(), LocaleController.getString(R.string.August).toLowerCase(), LocaleController.getString(R.string.September).toLowerCase(), LocaleController.getString(R.string.October).toLowerCase(), LocaleController.getString(R.string.November).toLowerCase(), LocaleController.getString(R.string.December).toLowerCase()};
        String[] strArr2 = new String[12];
        Calendar calendar = Calendar.getInstance();
        for (int i10 = 1; i10 <= 12; i10++) {
            calendar.set(0, 0, 0, 0, 0, 0);
            calendar.set(2, i10);
            strArr2[i10 - 1] = calendar.getDisplayName(2, 2, Locale.ENGLISH).toLowerCase();
        }
        for (int i11 = 0; i11 < 12; i11++) {
            if (strArr2[i11].startsWith(str) || strArr[i11].startsWith(str)) {
                return i11;
            }
        }
        return -1;
    }

    public final void A1(ArrayList arrayList, ArrayList arrayList2, boolean z4) {
        String formatName;
        ArrayList arrayList3 = this.V2;
        arrayList3.clear();
        ArrayList arrayList4 = this.U2;
        arrayList3.addAll(arrayList4);
        arrayList4.clear();
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Object obj = arrayList.get(i10);
                if (obj instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) obj;
                    if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().f19331id == user.f19331id) {
                        formatName = LocaleController.getString(R.string.SavedMessages);
                    } else {
                        formatName = ContactsController.formatName(user.first_name, user.last_name, 10);
                    }
                    e0 e0Var = new e0(R.drawable.search_users_filled, 4, formatName);
                    e0Var.f44706f = user;
                    arrayList4.add(e0Var);
                } else if (obj instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) obj;
                    String str = chat.title;
                    if (str.length() > 12) {
                        str = v2.k(str.substring(0, 10), "...");
                    }
                    e0 e0Var2 = new e0(R.drawable.search_users_filled, 4, str);
                    e0Var2.f44706f = chat;
                    arrayList4.add(e0Var2);
                }
            }
        }
        if (arrayList2 != null) {
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                c0 c0Var = (c0) arrayList2.get(i11);
                e0 e0Var3 = new e0(R.drawable.search_date_filled, 6, c0Var.f44676a);
                e0Var3.f44707g = c0Var;
                arrayList4.add(e0Var3);
            }
        }
        if (z4) {
            arrayList4.add(new e0(R.drawable.chats_archive, R.string.ArchiveSearchFilter, null, 7));
        }
        if (getAdapter() != null) {
            c2.u uVar = new c2.u(getAdapter(), 7);
            f2.q.c(this.Y2, true).a(uVar);
            if (!arrayList4.isEmpty() && uVar.f2006b) {
                this.W2.h1(0, 0);
            }
        }
    }

    public final void B1() {
        getRecycledViewPool().a();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof d0) {
                int i11 = d0.f44692f;
                ((d0) childAt).a();
            }
        }
        for (int i12 = 0; i12 < getCachedChildCount(); i12++) {
            View P = P(i12);
            if (P instanceof d0) {
                int i13 = d0.f44692f;
                ((d0) P).a();
            }
        }
        for (int i14 = 0; i14 < getAttachedScrapChildCount(); i14++) {
            View O = O(i14);
            if (O instanceof d0) {
                int i15 = d0.f44692f;
                ((d0) O).a();
            }
        }
        setSelectorDrawableColor(j6.v0(j6.f19996i6, this.f28750m2));
    }

    public ArrayList<l6> getThemeDescriptions() {
        ArrayList<l6> arrayList = new ArrayList<>();
        arrayList.add(new l6(this, 0, null, null, null, null, j6.f19924e7));
        arrayList.add(new l6(this, 0, null, null, null, null, j6.f19943f7));
        return arrayList;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.X2) {
            canvas.drawRect(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), j6.f20025k0);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }
}
