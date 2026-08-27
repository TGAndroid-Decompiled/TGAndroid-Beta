package pf;

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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.vq;

public final class g0 extends zk0 {
    public static final e0[] Y2 = {new e0(R.drawable.search_media_filled, R.string.SharedMediaTab2, new TLRPC.TL_inputMessagesFilterPhotoVideo(), 0), new e0(R.drawable.search_links_filled, R.string.SharedLinksTab2, new TLRPC.TL_inputMessagesFilterUrl(), 2), new e0(R.drawable.search_files_filled, R.string.SharedFilesTab2, new TLRPC.TL_inputMessagesFilterDocument(), 1), new e0(R.drawable.search_music_filled, R.string.SharedMusicTab2, new TLRPC.TL_inputMessagesFilterMusic(), 3), new e0(R.drawable.search_voice_filled, R.string.SharedVoiceTab2, new TLRPC.TL_inputMessagesFilterRoundVoice(), 5)};
    public static final Pattern Z2 = Pattern.compile("20[0-9]{1,2}");
    public static final Pattern a3 = Pattern.compile("(\\w{3,}) ([0-9]{0,4})");

    public static final Pattern f45803b3 = Pattern.compile("([0-9]{0,4}) (\\w{2,})");

    public static final Pattern f45804c3 = Pattern.compile("^([0-9]{1,4})(\\.| |/|\\-)([0-9]{1,4})$");

    public static final Pattern f45805d3 = Pattern.compile("^([0-9]{1,2})(\\.| |/|\\-)([0-9]{1,2})(\\.| |/|\\-)([0-9]{1,4})$");

    public static final int[] f45806e3 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public final ArrayList T2;
    public final ArrayList U2;
    public final vq V2;
    public boolean W2;
    public final b0 X2;

    public g0(Context context, c6 c6Var) {
        super(context, c6Var);
        this.T2 = new ArrayList();
        this.U2 = new ArrayList();
        this.W2 = true;
        this.X2 = new b0(this);
        vq vqVar = new vq((Object) this, 7);
        this.V2 = vqVar;
        vqVar.j1(0);
        setLayoutManager(vqVar);
        setAdapter(new ag.i(this, 6));
        i(new jh.j(9));
        setItemAnimator(new a0());
        setWillNotDraw(false);
        setHideIfEmpty(false);
        setSelectorRadius(AndroidUtilities.dp(28.0f));
        setSelectorDrawableColor(g6.v0(g6.f23144i6, this.f35277l2));
    }

    public static void w1(int i10, int i11, ArrayList arrayList) {
        int i12 = i11;
        if (i12 < 0 || i12 >= 12 || i10 < 0 || i10 >= f45806e3[i12]) {
            return;
        }
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

    public static void x1(int i10, int i11, ArrayList arrayList) {
        int i12 = Calendar.getInstance().get(1);
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (i11 < 2013 || i11 > i12) {
            return;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(i11, i10, 1, 0, 0, 0);
        long timeInMillis2 = calendar.getTimeInMillis();
        if (timeInMillis2 > timeInMillis) {
            return;
        }
        calendar.add(2, 1);
        arrayList.add(new c0(timeInMillis2, calendar.getTimeInMillis() - 1, LocaleController.getInstance().getFormatterMonthYear().format(timeInMillis2)));
    }

    public static void y1(String str, ArrayList arrayList) {
        arrayList.clear();
        if (str == null) {
            return;
        }
        String strTrim = str.trim();
        if (strTrim.length() < 3) {
            return;
        }
        if (LocaleController.getString(R.string.SearchTipToday).toLowerCase().startsWith(strTrim) || "today".startsWith(strTrim)) {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(1);
            int i11 = calendar.get(2);
            int i12 = calendar.get(5);
            calendar.set(i10, i11, i12, 0, 0, 0);
            long timeInMillis = calendar.getTimeInMillis();
            calendar.set(i10, i11, i12 + 1, 0, 0, 0);
            arrayList.add(new c0(timeInMillis, calendar.getTimeInMillis() - 1, LocaleController.getString(R.string.SearchTipToday)));
            return;
        }
        if (LocaleController.getString(R.string.SearchTipYesterday).toLowerCase().startsWith(strTrim) || "yesterday".startsWith(strTrim)) {
            Calendar calendar2 = Calendar.getInstance();
            int i13 = calendar2.get(1);
            int i14 = calendar2.get(2);
            int i15 = calendar2.get(5);
            calendar2.set(i13, i14, i15, 0, 0, 0);
            long timeInMillis2 = calendar2.getTimeInMillis() - 86400000;
            calendar2.set(i13, i14, i15 + 1, 0, 0, 0);
            arrayList.add(new c0(timeInMillis2, calendar2.getTimeInMillis() - 86400001, LocaleController.getString(R.string.SearchTipYesterday)));
            return;
        }
        Calendar calendar3 = Calendar.getInstance();
        int i16 = -1;
        if (strTrim.length() > 3) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE", Locale.ENGLISH);
            for (int i17 = 0; i17 < 7; i17++) {
                calendar3.set(7, i17);
                if (LocaleController.getInstance().getFormatterWeekLong().format(calendar3.getTime()).toLowerCase().startsWith(strTrim) || simpleDateFormat.format(calendar3.getTime()).toLowerCase().startsWith(strTrim)) {
                    i16 = i17;
                    break;
                }
            }
        }
        if (i16 >= 0) {
            Calendar calendar4 = Calendar.getInstance();
            long timeInMillis3 = calendar4.getTimeInMillis();
            calendar4.set(7, i16);
            if (calendar4.getTimeInMillis() > timeInMillis3) {
                calendar4.setTimeInMillis(calendar4.getTimeInMillis() - 604800000);
            }
            int i18 = calendar4.get(1);
            int i19 = calendar4.get(2);
            int i20 = calendar4.get(5);
            calendar4.set(i18, i19, i20, 0, 0, 0);
            long timeInMillis4 = calendar4.getTimeInMillis();
            calendar4.set(i18, i19, i20 + 1, 0, 0, 0);
            arrayList.add(new c0(timeInMillis4, calendar4.getTimeInMillis() - 1, LocaleController.getInstance().getFormatterWeekLong().format(timeInMillis4)));
            return;
        }
        Matcher matcher = f45804c3.matcher(strTrim);
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(3);
            int i21 = Integer.parseInt(strGroup);
            int i22 = Integer.parseInt(strGroup2);
            if (i21 <= 0 || i21 > 31) {
                if (i21 < 2013 || i22 > 12) {
                    return;
                }
                x1(i22 - 1, i21, arrayList);
                return;
            }
            if (i22 >= 2013 && i21 <= 12) {
                x1(i21 - 1, i22, arrayList);
                return;
            } else {
                if (i22 <= 12) {
                    w1(i21 - 1, i22 - 1, arrayList);
                    return;
                }
                return;
            }
        }
        Matcher matcher2 = f45805d3.matcher(strTrim);
        if (matcher2.matches()) {
            String strGroup3 = matcher2.group(1);
            String strGroup4 = matcher2.group(3);
            String strGroup5 = matcher2.group(5);
            if (matcher2.group(2).equals(matcher2.group(4))) {
                int i23 = Integer.parseInt(strGroup3);
                int i24 = Integer.parseInt(strGroup4) - 1;
                int i25 = Integer.parseInt(strGroup5);
                if (i25 >= 10 && i25 <= 99) {
                    i25 += 2000;
                }
                int i26 = i25;
                int i27 = Calendar.getInstance().get(1);
                int i28 = i23 - 1;
                if (i24 < 0 || i24 >= 12 || i28 < 0 || i28 >= f45806e3[i24] || i26 < 2013 || i26 > i27) {
                    return;
                }
                Calendar calendar5 = Calendar.getInstance();
                calendar5.set(i26, i24, i23, 0, 0, 0);
                long timeInMillis5 = calendar5.getTimeInMillis();
                calendar5.set(i26, i24, i23 + 1, 0, 0, 0);
                arrayList.add(new c0(timeInMillis5, calendar5.getTimeInMillis() - 1, LocaleController.getInstance().getFormatterYearMax().format(timeInMillis5)));
                return;
            }
            return;
        }
        if (Z2.matcher(strTrim).matches()) {
            int iIntValue = Integer.valueOf(strTrim).intValue();
            int i29 = Calendar.getInstance().get(1);
            if (iIntValue < 2013) {
                while (i29 >= 2013) {
                    Calendar calendar6 = Calendar.getInstance();
                    calendar6.set(i29, 0, 1, 0, 0, 0);
                    long timeInMillis6 = calendar6.getTimeInMillis();
                    calendar6.set(i29 + 1, 0, 1, 0, 0, 0);
                    arrayList.add(new c0(timeInMillis6, calendar6.getTimeInMillis() - 1, Integer.toString(i29)));
                    i29--;
                }
                return;
            }
            if (iIntValue <= i29) {
                Calendar calendar7 = Calendar.getInstance();
                calendar7.set(iIntValue, 0, 1, 0, 0, 0);
                long timeInMillis7 = calendar7.getTimeInMillis();
                calendar7.set(iIntValue + 1, 0, 1, 0, 0, 0);
                arrayList.add(new c0(timeInMillis7, calendar7.getTimeInMillis() - 1, Integer.toString(iIntValue)));
                return;
            }
            return;
        }
        Matcher matcher3 = a3.matcher(strTrim);
        if (matcher3.matches()) {
            String strGroup6 = matcher3.group(1);
            String strGroup7 = matcher3.group(2);
            int iZ1 = z1(strGroup6);
            if (iZ1 >= 0) {
                int iIntValue2 = Integer.valueOf(strGroup7).intValue();
                if (iIntValue2 > 0 && iIntValue2 <= 31) {
                    w1(iIntValue2 - 1, iZ1, arrayList);
                    return;
                } else if (iIntValue2 >= 2013) {
                    x1(iZ1, iIntValue2, arrayList);
                    return;
                }
            }
        }
        Matcher matcher4 = f45803b3.matcher(strTrim);
        if (matcher4.matches()) {
            String strGroup8 = matcher4.group(1);
            int iZ2 = z1(matcher4.group(2));
            if (iZ2 >= 0) {
                int iIntValue3 = Integer.valueOf(strGroup8).intValue();
                if (iIntValue3 > 0 && iIntValue3 <= 31) {
                    w1(iIntValue3 - 1, iZ2, arrayList);
                    return;
                } else if (iIntValue3 >= 2013) {
                    x1(iZ2, iIntValue3, arrayList);
                }
            }
        }
        if (TextUtils.isEmpty(strTrim) || strTrim.length() <= 2) {
            return;
        }
        int iZ3 = z1(strTrim);
        long timeInMillis8 = Calendar.getInstance().getTimeInMillis();
        if (iZ3 >= 0) {
            for (int i30 = Calendar.getInstance().get(1); i30 >= 2013; i30--) {
                Calendar calendar8 = Calendar.getInstance();
                calendar8.set(i30, iZ3, 1, 0, 0, 0);
                long timeInMillis9 = calendar8.getTimeInMillis();
                if (timeInMillis9 <= timeInMillis8) {
                    calendar8.add(2, 1);
                    arrayList.add(new c0(timeInMillis9, calendar8.getTimeInMillis() - 1, LocaleController.getInstance().getFormatterMonthYear().format(timeInMillis9)));
                }
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

    public final void A1(ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        ArrayList arrayList3 = this.U2;
        arrayList3.clear();
        ArrayList arrayList4 = this.T2;
        arrayList3.addAll(arrayList4);
        arrayList4.clear();
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Object obj = arrayList.get(i10);
                if (obj instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) obj;
                    e0 e0Var = new e0(R.drawable.search_users_filled, 4, UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().f22527id == user.f22527id ? LocaleController.getString(R.string.SavedMessages) : ContactsController.formatName(user.first_name, user.last_name, 10));
                    e0Var.f45783f = user;
                    arrayList4.add(e0Var);
                } else if (obj instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) obj;
                    String strL = chat.title;
                    if (strL.length() > 12) {
                        strL = s3.c.l(strL.substring(0, 10), "...");
                    }
                    e0 e0Var2 = new e0(R.drawable.search_users_filled, 4, strL);
                    e0Var2.f45783f = chat;
                    arrayList4.add(e0Var2);
                }
            }
        }
        if (arrayList2 != null) {
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                c0 c0Var = (c0) arrayList2.get(i11);
                e0 e0Var3 = new e0(R.drawable.search_date_filled, 6, c0Var.f45749a);
                e0Var3.f45784g = c0Var;
                arrayList4.add(e0Var3);
            }
        }
        if (z10) {
            arrayList4.add(new e0(R.drawable.chats_archive, R.string.ArchiveSearchFilter, null, 7));
        }
        if (getAdapter() != null) {
            c2.t tVar = new c2.t(getAdapter(), 7);
            f2.q.c(this.X2, true).a(tVar);
            if (arrayList4.isEmpty() || !tVar.f2346b) {
                return;
            }
            this.V2.h1(0, 0);
        }
    }

    public final void B1() {
        getRecycledViewPool().a();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof d0) {
                int i11 = d0.f45766f;
                ((d0) childAt).a();
            }
        }
        for (int i12 = 0; i12 < getCachedChildCount(); i12++) {
            View viewP = P(i12);
            if (viewP instanceof d0) {
                int i13 = d0.f45766f;
                ((d0) viewP).a();
            }
        }
        for (int i14 = 0; i14 < getAttachedScrapChildCount(); i14++) {
            View viewO = O(i14);
            if (viewO instanceof d0) {
                int i15 = d0.f45766f;
                ((d0) viewO).a();
            }
        }
        setSelectorDrawableColor(g6.v0(g6.f23144i6, this.f35277l2));
    }

    public ArrayList<i6> getThemeDescriptions() {
        ArrayList<i6> arrayList = new ArrayList<>();
        arrayList.add(new i6(this, 0, null, null, null, null, g6.f23073e7));
        arrayList.add(new i6(this, 0, null, null, null, null, g6.f23091f7));
        return arrayList;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.W2) {
            canvas.drawRect(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), g6.f23175k0);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }
}
