package uf;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import j$.time.DayOfWeek;
import j$.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Calendar;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.y3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.i5;
import org.telegram.ui.Cells.n8;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qp;
import org.telegram.ui.Components.w51;
import org.telegram.ui.ai;
import ph.d4;
import ph.z8;
import vh.w2;
public final class x0 extends p2 implements NotificationCenter.NotificationCenterDelegate {
    public g61 f45537a;
    public lr f45538b;
    public org.telegram.ui.ActionBar.w0 f45539c;
    public boolean d;
    public boolean e;
    public ArrayList[] f45540f;
    public ArrayList[] h;
    public String f45541n;
    public String f45542r;

    public x0() {
        super(null);
        this.f45540f = null;
        this.h = new ArrayList[]{new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList()};
    }

    public static void U(x0 x0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error != null) {
            x0Var.f45538b.a(0.0f);
            qc.b0(tL_error);
        } else if (tLObject instanceof TLRPC.TL_boolFalse) {
            if (x0Var.getParentActivity() != null) {
                x0Var.f45538b.a(0.0f);
                y3.s(R.string.UnknownError, qc.a0(x0Var), null);
            }
        } else if (!x0Var.isFinished && !x0Var.finishing) {
            x0Var.finishFragment();
        }
    }

    public static void V(x0 x0Var, ArrayList arrayList) {
        String string = LocaleController.getString(R.string.BusinessHours);
        String string2 = LocaleController.getString(R.string.BusinessHoursInfo);
        int i10 = R.raw.biz_clock;
        i51 i51Var = new i51(2);
        i51Var.f25585l = string;
        i51Var.f25588o = string2;
        i51Var.f25584k = i10;
        arrayList.add(i51Var);
        i51 i11 = i51.i(-1, LocaleController.getString(R.string.BusinessHoursShow));
        i11.K(x0Var.e);
        arrayList.add(i11);
        arrayList.add(i51.A(-100, null));
        if (x0Var.e) {
            ai.q(R.string.BusinessHours, arrayList);
            int i12 = 0;
            while (true) {
                ArrayList[] arrayListArr = x0Var.h;
                if (i12 < arrayListArr.length) {
                    if (arrayListArr[i12] == null) {
                        arrayListArr[i12] = new ArrayList();
                    }
                    String displayName = DayOfWeek.values()[i12].getDisplayName(TextStyle.FULL, LocaleController.getInstance().getCurrentLocale());
                    String a02 = a0(x0Var.h[i12]);
                    i51 i51Var2 = new i51(5);
                    i51Var2.d = i12;
                    i51Var2.f25585l = displayName.substring(0, 1).toUpperCase() + displayName.substring(1);
                    i51Var2.f25586m = a02;
                    i51Var2.K(!x0Var.h[i12].isEmpty());
                    arrayList.add(i51Var2);
                    i12++;
                } else {
                    arrayList.add(i51.A(-101, null));
                    arrayList.add(i51.f(LocaleController.getString(R.string.BusinessHoursTimezone), s1.b(x0Var.currentAccount).d(x0Var.f45542r, false), -2));
                    arrayList.add(i51.A(-102, null));
                    return;
                }
            }
        }
    }

    public static void W(x0 x0Var, View view, String str) {
        s1 b10 = s1.b(x0Var.currentAccount);
        x0Var.f45542r = str;
        ((n8) view).u(b10.d(str, false), true);
        x0Var.Y(true);
    }

    public static ArrayList[] Z(ArrayList arrayList) {
        int i10;
        ArrayList[] arrayListArr = new ArrayList[7];
        for (int i11 = 0; i11 < 7; i11++) {
            arrayListArr[i11] = new ArrayList();
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen = (TL_account.TL_businessWeeklyOpen) arrayList.get(i12);
            int i13 = tL_businessWeeklyOpen.start_minute;
            int i14 = i13 % 1440;
            arrayListArr[(i13 / 1440) % 7].add(new w0(i14, (tL_businessWeeklyOpen.end_minute - i13) + i14));
        }
        int i15 = 0;
        while (i15 < 7) {
            int i16 = i15 * 1440;
            int i17 = i15 + 1;
            int i18 = i17 * 1440;
            int i19 = i16;
            for (int i20 = 0; i20 < arrayList.size(); i20++) {
                TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen2 = (TL_account.TL_businessWeeklyOpen) arrayList.get(i20);
                if (tL_businessWeeklyOpen2.start_minute <= i19 && (i10 = tL_businessWeeklyOpen2.end_minute) >= i19) {
                    i19 = i10 + 1;
                }
            }
            if (i19 >= i18) {
                int i21 = (i15 + 6) % 7;
                if (!arrayListArr[i21].isEmpty() && ((w0) kf.k0.i(1, arrayListArr[i21])).f45535b >= 1440) {
                    ((w0) kf.k0.i(1, arrayListArr[i21])).f45535b = 1439;
                }
                int min = Math.min((i19 - i16) - 1, 2879);
                ArrayList arrayList2 = arrayListArr[(i15 + 8) % 7];
                if (min >= 1440 && !arrayList2.isEmpty() && ((w0) arrayList2.get(0)).f45534a < min - 1440) {
                    min = ((w0) arrayList2.get(0)).f45534a + 1439;
                }
                arrayListArr[i15].clear();
                arrayListArr[i15].add(new w0(0, min));
            } else {
                int i22 = i17 % 7;
                if (!arrayListArr[i15].isEmpty() && !arrayListArr[i22].isEmpty()) {
                    w0 w0Var = (w0) kf.k0.i(1, arrayListArr[i15]);
                    w0 w0Var2 = (w0) arrayListArr[i22].get(0);
                    int i23 = w0Var.f45535b;
                    if (i23 > 1440 && i23 - 1439 == w0Var2.f45534a) {
                        w0Var.f45535b = 1439;
                        w0Var2.f45534a = 0;
                    }
                }
            }
            i15 = i17;
        }
        return arrayListArr;
    }

    public static String a0(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return LocaleController.getString(R.string.BusinessHoursDayClosed);
        }
        if (c0(arrayList)) {
            return LocaleController.getString(R.string.BusinessHoursDayFullOpened);
        }
        String str = "";
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            w0 w0Var = (w0) arrayList.get(i10);
            if (i10 > 0) {
                str = w2.k(str, "\n");
            }
            StringBuilder l10 = e2.c.l(str);
            l10.append(w0.a(w0Var.f45534a));
            l10.append(" - ");
            l10.append(w0.a(w0Var.f45535b));
            str = l10.toString();
        }
        return str;
    }

    public static boolean c0(ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            w0 w0Var = (w0) arrayList.get(i11);
            if (i10 < w0Var.f45534a) {
                return false;
            }
            i10 = w0Var.f45535b;
        }
        if (i10 != 1439 && i10 != 1440) {
            return false;
        }
        return true;
    }

    public static String f0(int i10, TLRPC.User user, TL_account.TL_businessWorkHours tL_businessWorkHours) {
        int i11;
        if (tL_businessWorkHours == null) {
            return null;
        }
        ArrayList[] Z = Z(tL_businessWorkHours.weekly_open);
        StringBuilder sb = new StringBuilder();
        if (user != null) {
            sb.append(LocaleController.formatString(R.string.BusinessHoursCopyHeader, UserObject.getUserName(user)));
            sb.append("\n");
        }
        for (int i12 = 0; i12 < 7; i12++) {
            ArrayList arrayList = Z[i12];
            String displayName = DayOfWeek.values()[i12].getDisplayName(TextStyle.FULL, LocaleController.getInstance().getCurrentLocale());
            sb.append(displayName.substring(0, 1).toUpperCase() + displayName.substring(1));
            sb.append(": ");
            if (c0(arrayList)) {
                sb.append(LocaleController.getString(R.string.BusinessHoursProfileOpen));
            } else if (arrayList.isEmpty()) {
                sb.append(LocaleController.getString(R.string.BusinessHoursProfileClose));
            } else {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    if (i13 > 0) {
                        sb.append(", ");
                    }
                    w0 w0Var = (w0) arrayList.get(i13);
                    sb.append(w0.a(w0Var.f45534a));
                    sb.append(" - ");
                    sb.append(w0.a(w0Var.f45535b));
                }
            }
            sb.append("\n");
        }
        TLRPC.TL_timezone a2 = s1.b(i10).a(tL_businessWorkHours.timezone_id);
        int rawOffset = Calendar.getInstance().getTimeZone().getRawOffset() / 1000;
        if (a2 == null) {
            i11 = 0;
        } else {
            i11 = a2.utc_offset;
        }
        if ((rawOffset - i11) / 60 != 0 && a2 != null) {
            int i14 = R.string.BusinessHoursCopyFooter;
            s1.b(i10);
            sb.append(LocaleController.formatString(i14, s1.e(a2, true)));
        }
        return sb.toString();
    }

    public final void X(int i10) {
        w0 w0Var;
        w0 w0Var2 = null;
        if (this.h[i10].isEmpty()) {
            w0Var = null;
        } else {
            w0Var = (w0) kf.k0.i(1, this.h[i10]);
        }
        if (w0Var != null) {
            int i11 = (i10 + 6) % 7;
            if (!this.h[i11].isEmpty()) {
                w0Var2 = (w0) kf.k0.i(1, this.h[i11]);
            }
            if (w0Var2 != null && w0Var2.f45535b > 1439) {
                w0Var2.f45535b = 1439;
                if (w0Var2.f45534a >= 1439) {
                    this.h[i11].remove(w0Var2);
                }
                View x12 = this.f45537a.x1(i11);
                if (x12 instanceof i5) {
                    ((i5) x12).setValue(a0(this.h[i11]));
                } else {
                    this.f45537a.V2.N(true);
                }
            }
        }
    }

    public final void Y(boolean z4) {
        float f10;
        float f11;
        float f12;
        float f13;
        if (this.f45539c == null) {
            return;
        }
        boolean b02 = b0();
        this.f45539c.setEnabled(b02);
        float f14 = 0.0f;
        if (z4) {
            ViewPropertyAnimator animate = this.f45539c.animate();
            if (b02) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f12);
            if (b02) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f13);
            if (b02) {
                f14 = 1.0f;
            }
            scaleX.scaleY(f14).setDuration(180L).start();
            return;
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.f45539c;
        if (b02) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        w0Var.setAlpha(f10);
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f45539c;
        if (b02) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        w0Var2.setScaleX(f11);
        org.telegram.ui.ActionBar.w0 w0Var3 = this.f45539c;
        if (b02) {
            f14 = 1.0f;
        }
        w0Var3.setScaleY(f14);
    }

    public final boolean b0() {
        throw new UnsupportedOperationException("Method not decompiled: uf.x0.b0():boolean");
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessHours));
        this.actionBar.setActionBarMenuOnItemClick(new sh.e(this, 11));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = j6.f20202v8;
        mutate.setColorFilter(new PorterDuffColorFilter(j6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.f45538b = new lr(mutate, new qp(j6.w0(null, i10, false)));
        this.f45539c = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f45538b);
        Y(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(j6.w0(null, j6.f19827a7, false));
        g61 g61Var = new g61(this, new d4(this, 22), new z8(this, 7), null);
        this.f45537a = g61Var;
        g61Var.o1();
        g61 g61Var2 = this.f45537a;
        g61Var2.V2.f30148r = false;
        frameLayout.addView(g61Var2, b6.c(-1.0f, -1));
        this.actionBar.A(this.f45537a, true);
        e0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0() {
        if (this.f45538b.f26868c > 0.0f) {
            return;
        }
        if (!b0()) {
            finishFragment();
            return;
        }
        this.f45538b.a(1.0f);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
        ArrayList[] arrayListArr = this.h;
        ArrayList arrayList = new ArrayList();
        if (arrayListArr != null) {
            for (int i10 = 0; i10 < arrayListArr.length; i10++) {
                if (arrayListArr[i10] != null) {
                    for (int i11 = 0; i11 < arrayListArr[i10].size(); i11++) {
                        w0 w0Var = (w0) arrayListArr[i10].get(i11);
                        TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen = new TL_account.TL_businessWeeklyOpen();
                        int i12 = i10 * 1440;
                        tL_businessWeeklyOpen.start_minute = w0Var.f45534a + i12;
                        tL_businessWeeklyOpen.end_minute = i12 + w0Var.f45535b;
                        arrayList.add(tL_businessWeeklyOpen);
                    }
                }
            }
        }
        if (this.e && !arrayList.isEmpty()) {
            TL_account.TL_businessWorkHours tL_businessWorkHours = new TL_account.TL_businessWorkHours();
            tL_businessWorkHours.timezone_id = this.f45542r;
            tL_businessWorkHours.weekly_open.addAll(arrayList);
            updatebusinessworkhours.flags |= 1;
            updatebusinessworkhours.business_work_hours = tL_businessWorkHours;
            if (userFull != null) {
                userFull.flags2 |= 1;
                userFull.business_work_hours = tL_businessWorkHours;
            }
        } else if (userFull != null) {
            userFull.flags2 &= -2;
            userFull.business_work_hours = null;
        }
        getConnectionsManager().sendRequest(updatebusinessworkhours, new ff.a(this, 26));
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        w51 w51Var;
        if (i10 == NotificationCenter.userInfoDidLoad) {
            e0();
        } else if (i10 == NotificationCenter.timezonesUpdated) {
            if (this.f45540f == null) {
                this.f45542r = s1.b(this.currentAccount).c();
            }
            g61 g61Var = this.f45537a;
            if (g61Var != null && (w51Var = g61Var.V2) != null) {
                w51Var.N(true);
            }
        }
    }

    public final void e0() {
        boolean z4;
        w51 w51Var;
        if (this.d) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessWorkHours tL_businessWorkHours = userFull.business_work_hours;
        if (tL_businessWorkHours != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.e = z4;
        if (z4) {
            String str = tL_businessWorkHours.timezone_id;
            this.f45542r = str;
            this.f45541n = str;
            this.f45540f = Z(tL_businessWorkHours.weekly_open);
            this.h = Z(userFull.business_work_hours.weekly_open);
        } else {
            String c3 = s1.b(this.currentAccount).c();
            this.f45542r = c3;
            this.f45541n = c3;
            this.f45540f = null;
            this.h = new ArrayList[7];
            int i10 = 0;
            while (true) {
                ArrayList[] arrayListArr = this.h;
                if (i10 >= arrayListArr.length) {
                    break;
                }
                arrayListArr[i10] = new ArrayList();
                if (i10 >= 0 && i10 < 5) {
                    this.h[i10].add(new w0(0, 1439));
                }
                i10++;
            }
        }
        g61 g61Var = this.f45537a;
        if (g61Var != null && (w51Var = g61Var.V2) != null) {
            w51Var.N(true);
        }
        Y(false);
        this.d = true;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        s1.b(this.currentAccount).g();
        this.f45542r = s1.b(this.currentAccount).c();
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        super.onFragmentDestroy();
        d0();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f45537a.setPadding(0, 0, 0, i13);
        this.f45537a.setClipToPadding(false);
    }
}
