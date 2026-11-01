package zf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.i5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.c7;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.br;
public final class g0 extends uk0 implements k6 {
    public static final e0[] f55511j3 = {new e0(2131232685, 2131745425, new TLRPC.TL_inputMessagesFilterPhotoVideo(), 0), new e0(2131232684, 2131745428, new TLRPC.TL_inputMessagesFilterUrl(), 2), new e0(2131232683, 2131745432, new TLRPC.TL_inputMessagesFilterDocument(), 1), new e0(2131232686, 2131745423, new TLRPC.TL_inputMessagesFilterMusic(), 3), new e0(2131232688, 2131745420, new TLRPC.TL_inputMessagesFilterRoundVoice(), 5)};
    public static final Pattern f55512k3 = Pattern.compile("20[0-9]{1,2}");
    public static final Pattern f55513l3 = Pattern.compile("(\\w{3,}) ([0-9]{0,4})");
    public static final Pattern f55514m3 = Pattern.compile("([0-9]{0,4}) (\\w{2,})");
    public static final Pattern f55515n3 = Pattern.compile("^([0-9]{1,4})(\\.| |/|\\-)([0-9]{1,4})$");
    public static final Pattern f55516o3 = Pattern.compile("^([0-9]{1,2})(\\.| |/|\\-)([0-9]{1,2})(\\.| |/|\\-)([0-9]{1,4})$");
    public static final int[] f55517p3 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public final ArrayList f55518e3;
    public final ArrayList f55519f3;
    public final br f55520g3;
    public boolean f55521h3;
    public final b0 f55522i3;

    public g0(Context context, p6 p6Var) {
        super(context, p6Var);
        this.f55518e3 = new ArrayList();
        this.f55519f3 = new ArrayList();
        this.f55521h3 = true;
        this.f55522i3 = new b0(this);
        br brVar = new br(9, this, false);
        this.f55520g3 = brVar;
        brVar.j1(0);
        setLayoutManager(brVar);
        setAdapter(new kg.f(this, 10));
        i(new dh.g(16));
        setItemAnimator(new s4.j());
        setWillNotDraw(false);
        setHideIfEmpty(false);
        setSelectorRadius(org.telegram.messenger.i0.L(28.0f));
        a7.m(this, 20, t6.f21021i6, p6Var);
    }

    public static void A1(int i10, int i11, ArrayList arrayList) {
        int i12 = Calendar.getInstance().get(1);
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (i11 >= 2013 && i11 <= i12) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(i11, i10, 1, 0, 0, 0);
            long timeInMillis2 = calendar.getTimeInMillis();
            if (timeInMillis2 <= timeInMillis) {
                calendar.add(2, 1);
                arrayList.add(new c0(timeInMillis2, dd.D0().u0().format(timeInMillis2), calendar.getTimeInMillis() - 1));
            }
        }
    }

    public static void B1(String str, ArrayList arrayList) {
        arrayList.clear();
        if (str != null) {
            String trim = str.trim();
            if (trim.length() >= 3) {
                if (!dd.L0(2131745725, null).toLowerCase().startsWith(trim) && !"today".startsWith(trim)) {
                    if (!dd.L0(2131745724, null).toLowerCase().startsWith(trim) && !"yesterday".startsWith(trim)) {
                        Calendar calendar = Calendar.getInstance();
                        int i10 = -1;
                        if (trim.length() > 3) {
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE", Locale.ENGLISH);
                            for (int i11 = 0; i11 < 7; i11++) {
                                calendar.set(7, i11);
                                if (dd.D0().A0().format(calendar.getTime()).toLowerCase().startsWith(trim) || simpleDateFormat.format(calendar.getTime()).toLowerCase().startsWith(trim)) {
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
                            arrayList.add(new c0(timeInMillis2, dd.D0().A0().format(timeInMillis2), calendar2.getTimeInMillis() - 1));
                            return;
                        }
                        Matcher matcher = f55515n3.matcher(trim);
                        if (matcher.matches()) {
                            String group = matcher.group(1);
                            String group2 = matcher.group(3);
                            int parseInt = Integer.parseInt(group);
                            int parseInt2 = Integer.parseInt(group2);
                            if (parseInt > 0 && parseInt <= 31) {
                                if (parseInt2 >= 2013 && parseInt <= 12) {
                                    A1(parseInt - 1, parseInt2, arrayList);
                                    return;
                                } else if (parseInt2 <= 12) {
                                    z1(parseInt - 1, parseInt2 - 1, arrayList);
                                    return;
                                } else {
                                    return;
                                }
                            } else if (parseInt >= 2013 && parseInt2 <= 12) {
                                A1(parseInt2 - 1, parseInt, arrayList);
                                return;
                            } else {
                                return;
                            }
                        }
                        Matcher matcher2 = f55516o3.matcher(trim);
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
                                if (parseInt4 >= 0 && parseInt4 < 12 && i17 >= 0 && i17 < f55517p3[parseInt4] && i15 >= 2013 && i15 <= i16) {
                                    Calendar calendar3 = Calendar.getInstance();
                                    calendar3.set(i15, parseInt4, parseInt3, 0, 0, 0);
                                    long timeInMillis3 = calendar3.getTimeInMillis();
                                    calendar3.set(i15, parseInt4, parseInt3 + 1, 0, 0, 0);
                                    arrayList.add(new c0(timeInMillis3, dd.D0().C0().format(timeInMillis3), calendar3.getTimeInMillis() - 1));
                                    return;
                                }
                                return;
                            }
                            return;
                        } else if (f55512k3.matcher(trim).matches()) {
                            int intValue = Integer.valueOf(trim).intValue();
                            int i18 = Calendar.getInstance().get(1);
                            if (intValue < 2013) {
                                while (i18 >= 2013) {
                                    Calendar calendar4 = Calendar.getInstance();
                                    calendar4.set(i18, 0, 1, 0, 0, 0);
                                    long timeInMillis4 = calendar4.getTimeInMillis();
                                    calendar4.set(i18 + 1, 0, 1, 0, 0, 0);
                                    arrayList.add(new c0(timeInMillis4, Integer.toString(i18), calendar4.getTimeInMillis() - 1));
                                    i18--;
                                }
                                return;
                            } else if (intValue <= i18) {
                                Calendar calendar5 = Calendar.getInstance();
                                calendar5.set(intValue, 0, 1, 0, 0, 0);
                                long timeInMillis5 = calendar5.getTimeInMillis();
                                calendar5.set(intValue + 1, 0, 1, 0, 0, 0);
                                arrayList.add(new c0(timeInMillis5, Integer.toString(intValue), calendar5.getTimeInMillis() - 1));
                                return;
                            } else {
                                return;
                            }
                        } else {
                            Matcher matcher3 = f55513l3.matcher(trim);
                            if (matcher3.matches()) {
                                String group6 = matcher3.group(1);
                                String group7 = matcher3.group(2);
                                int C1 = C1(group6);
                                if (C1 >= 0) {
                                    int intValue2 = Integer.valueOf(group7).intValue();
                                    if (intValue2 > 0 && intValue2 <= 31) {
                                        z1(intValue2 - 1, C1, arrayList);
                                        return;
                                    } else if (intValue2 >= 2013) {
                                        A1(C1, intValue2, arrayList);
                                        return;
                                    }
                                }
                            }
                            Matcher matcher4 = f55514m3.matcher(trim);
                            if (matcher4.matches()) {
                                String group8 = matcher4.group(1);
                                int C12 = C1(matcher4.group(2));
                                if (C12 >= 0) {
                                    int intValue3 = Integer.valueOf(group8).intValue();
                                    if (intValue3 > 0 && intValue3 <= 31) {
                                        z1(intValue3 - 1, C12, arrayList);
                                        return;
                                    } else if (intValue3 >= 2013) {
                                        A1(C12, intValue3, arrayList);
                                    }
                                }
                            }
                            if (!TextUtils.isEmpty(trim) && trim.length() > 2) {
                                int C13 = C1(trim);
                                long timeInMillis6 = Calendar.getInstance().getTimeInMillis();
                                if (C13 >= 0) {
                                    for (int i19 = Calendar.getInstance().get(1); i19 >= 2013; i19--) {
                                        Calendar calendar6 = Calendar.getInstance();
                                        calendar6.set(i19, C13, 1, 0, 0, 0);
                                        long timeInMillis7 = calendar6.getTimeInMillis();
                                        if (timeInMillis7 <= timeInMillis6) {
                                            calendar6.add(2, 1);
                                            arrayList.add(new c0(timeInMillis7, dd.D0().u0().format(timeInMillis7), calendar6.getTimeInMillis() - 1));
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
                    arrayList.add(new c0(calendar7.getTimeInMillis() - 86400000, dd.L0(2131745724, null), calendar7.getTimeInMillis() - 86400001));
                    return;
                }
                Calendar calendar8 = Calendar.getInstance();
                int i23 = calendar8.get(1);
                int i24 = calendar8.get(2);
                int i25 = calendar8.get(5);
                calendar8.set(i23, i24, i25, 0, 0, 0);
                long timeInMillis8 = calendar8.getTimeInMillis();
                calendar8.set(i23, i24, i25 + 1, 0, 0, 0);
                arrayList.add(new c0(timeInMillis8, dd.L0(2131745725, null), calendar8.getTimeInMillis() - 1));
            }
        }
    }

    public static int C1(String str) {
        String[] strArr = {dd.L0(2131749096, null).toLowerCase(), dd.L0(2131750830, null).toLowerCase(), dd.L0(2131748698, null).toLowerCase(), dd.L0(2131754173, null).toLowerCase(), dd.L0(2131748677, null).toLowerCase(), dd.L0(2131749074, null).toLowerCase(), dd.L0(2131749076, null).toLowerCase(), dd.L0(2131753895, null).toLowerCase(), dd.L0(2131745582, null).toLowerCase(), dd.L0(2131747846, null).toLowerCase(), dd.L0(2131747851, null).toLowerCase(), dd.L0(2131751606, null).toLowerCase()};
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

    public static void z1(int i10, int i11, ArrayList arrayList) {
        int i12 = i11;
        if (i12 >= 0 && i12 < 12 && i10 >= 0 && i10 < f55517p3[i12]) {
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
                            arrayList.add(new c0(timeInMillis2, dd.D0().p0().format(timeInMillis2), timeInMillis3));
                        } else {
                            arrayList.add(new c0(timeInMillis2, dd.D0().C0().format(timeInMillis2), timeInMillis3));
                        }
                    }
                }
                i14--;
                i12 = i11;
            }
        }
    }

    public final void D1(ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        String m10;
        ArrayList arrayList3 = this.f55519f3;
        arrayList3.clear();
        ArrayList arrayList4 = this.f55518e3;
        arrayList3.addAll(arrayList4);
        arrayList4.clear();
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Object obj = arrayList.get(i10);
                if (obj instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) obj;
                    if (e20.i(e20.f15506s0).f().f19943id == user.f19943id) {
                        m10 = dd.L0(2131745918, null);
                    } else {
                        m10 = i5.m(10, user.first_name, user.last_name);
                    }
                    e0 e0Var = new e0(2131232687, 4, m10);
                    e0Var.f55496f = user;
                    arrayList4.add(e0Var);
                } else if (obj instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) obj;
                    String str = chat.title;
                    if (str.length() > 12) {
                        str = sc.e.A(str.substring(0, 10), "...");
                    }
                    e0 e0Var2 = new e0(2131232687, 4, str);
                    e0Var2.f55496f = chat;
                    arrayList4.add(e0Var2);
                }
            }
        }
        if (arrayList2 != null) {
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                c0 c0Var = (c0) arrayList2.get(i11);
                e0 e0Var3 = new e0(2131232682, 6, c0Var.f55477a);
                e0Var3.f55497g = c0Var;
                arrayList4.add(e0Var3);
            }
        }
        if (z10) {
            arrayList4.add(new e0(2131230993, 2131754150, null, 7));
        }
        if (getAdapter() != null) {
            b2.u uVar = new b2.u(10, getAdapter(), false);
            s4.n.c(this.f55522i3, true).b(uVar);
            if (!arrayList4.isEmpty() && uVar.f2300b) {
                this.f55520g3.h1(0, 0);
            }
        }
    }

    public ArrayList<c7> getThemeDescriptions() {
        ArrayList<c7> arrayList = new ArrayList<>();
        arrayList.add(new c7(this, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (b7) null, t6.e7));
        arrayList.add(new c7(this, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (b7) null, t6.f7));
        return arrayList;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f55521h3) {
            canvas.drawRect(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), t6.f21053k0);
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

    @Override
    public final void updateColors() {
        for (int i10 = 0; i10 < getCachedChildCount(); i10++) {
            View P = P(i10);
            if (P instanceof d0) {
                ((d0) P).updateColors();
            }
        }
        for (int i11 = 0; i11 < getAttachedScrapChildCount(); i11++) {
            View O = O(i11);
            if (O instanceof d0) {
                ((d0) O).updateColors();
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
