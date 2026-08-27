package qf;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import h7.z5;
import j$.time.DayOfWeek;
import j$.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Calendar;
import lh.a8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.y1;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.dr;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n41;
import org.telegram.ui.ed1;

public final class y0 extends n2 implements NotificationCenter.NotificationCenterDelegate {

    public k51 f46496a;

    public dr f46497b;

    public org.telegram.ui.ActionBar.v0 f46498c;
    public boolean d;

    public boolean f46499e;

    public ArrayList[] f46500f;
    public ArrayList[] h;

    public String f46501n;

    public String f46502r;

    public y0() {
        super(null);
        this.f46500f = null;
        this.h = new ArrayList[]{new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList()};
    }

    public static void U(y0 y0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error != null) {
            y0Var.f46497b.a(0.0f);
            mc.b0(tL_error);
            return;
        }
        if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
            if (y0Var.isFinished || y0Var.finishing) {
                return;
            }
            y0Var.finishFragment();
            return;
        }
        if (y0Var.getParentActivity() == null) {
            return;
        }
        y0Var.f46497b.a(0.0f);
        y1.r(R.string.UnknownError, mc.a0(y0Var), null);
    }

    public static void V(y0 y0Var, ArrayList arrayList) {
        String string = LocaleController.getString(R.string.BusinessHours);
        String string2 = LocaleController.getString(R.string.BusinessHoursInfo);
        int i10 = R.raw.biz_clock;
        n41 n41Var = new n41(2);
        n41Var.f30844l = string;
        n41Var.f30847o = string2;
        n41Var.f30843k = i10;
        arrayList.add(n41Var);
        n41 n41VarI = n41.i(-1, LocaleController.getString(R.string.BusinessHoursShow));
        n41VarI.K(y0Var.f46499e);
        arrayList.add(n41VarI);
        arrayList.add(n41.A(-100, null));
        if (!y0Var.f46499e) {
            return;
        }
        pa.o(R.string.BusinessHours, arrayList);
        int i11 = 0;
        while (true) {
            ArrayList[] arrayListArr = y0Var.h;
            if (i11 >= arrayListArr.length) {
                arrayList.add(n41.A(-101, null));
                arrayList.add(n41.f(LocaleController.getString(R.string.BusinessHoursTimezone), t1.b(y0Var.currentAccount).d(y0Var.f46502r, false), -2));
                arrayList.add(n41.A(-102, null));
                return;
            }
            if (arrayListArr[i11] == null) {
                arrayListArr[i11] = new ArrayList();
            }
            String displayName = DayOfWeek.values()[i11].getDisplayName(TextStyle.FULL, LocaleController.getInstance().getCurrentLocale());
            String str = displayName.substring(0, 1).toUpperCase() + displayName.substring(1);
            String strA0 = a0(y0Var.h[i11]);
            n41 n41Var2 = new n41(5);
            n41Var2.d = i11;
            n41Var2.f30844l = str;
            n41Var2.f30845m = strA0;
            n41Var2.K(!y0Var.h[i11].isEmpty());
            arrayList.add(n41Var2);
            i11++;
        }
    }

    public static void W(y0 y0Var, View view, String str) {
        t1 t1VarB = t1.b(y0Var.currentAccount);
        y0Var.f46502r = str;
        ((l8) view).u(t1VarB.d(str, false), true);
        y0Var.Y(true);
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
            arrayListArr[(i13 / 1440) % 7].add(new x0(i14, (tL_businessWeeklyOpen.end_minute - i13) + i14));
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
                if (!arrayListArr[i21].isEmpty() && ((x0) i0.a.i(1, arrayListArr[i21])).f46494b >= 1440) {
                    ((x0) i0.a.i(1, arrayListArr[i21])).f46494b = 1439;
                }
                int iMin = Math.min((i19 - i16) - 1, 2879);
                ArrayList arrayList2 = arrayListArr[(i15 + 8) % 7];
                if (iMin >= 1440 && !arrayList2.isEmpty() && ((x0) arrayList2.get(0)).f46493a < iMin - 1440) {
                    iMin = ((x0) arrayList2.get(0)).f46493a + 1439;
                }
                arrayListArr[i15].clear();
                arrayListArr[i15].add(new x0(0, iMin));
            } else {
                int i22 = i17 % 7;
                if (!arrayListArr[i15].isEmpty() && !arrayListArr[i22].isEmpty()) {
                    x0 x0Var = (x0) i0.a.i(1, arrayListArr[i15]);
                    x0 x0Var2 = (x0) arrayListArr[i22].get(0);
                    int i23 = x0Var.f46494b;
                    if (i23 > 1440 && i23 - 1439 == x0Var2.f46493a) {
                        x0Var.f46494b = 1439;
                        x0Var2.f46493a = 0;
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
        String string = "";
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            x0 x0Var = (x0) arrayList.get(i10);
            if (i10 > 0) {
                string = s3.c.l(string, "\n");
            }
            StringBuilder sbO = com.google.android.recaptcha.internal.a.o(string);
            sbO.append(x0.a(x0Var.f46493a));
            sbO.append(" - ");
            sbO.append(x0.a(x0Var.f46494b));
            string = sbO.toString();
        }
        return string;
    }

    public static boolean c0(ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            x0 x0Var = (x0) arrayList.get(i11);
            if (i10 < x0Var.f46493a) {
                return false;
            }
            i10 = x0Var.f46494b;
        }
        return i10 == 1439 || i10 == 1440;
    }

    public static String f0(int i10, TLRPC.User user, TL_account.TL_businessWorkHours tL_businessWorkHours) {
        if (tL_businessWorkHours == null) {
            return null;
        }
        ArrayList[] arrayListArrZ = Z(tL_businessWorkHours.weekly_open);
        StringBuilder sb2 = new StringBuilder();
        if (user != null) {
            sb2.append(LocaleController.formatString(R.string.BusinessHoursCopyHeader, UserObject.getUserName(user)));
            sb2.append("\n");
        }
        for (int i11 = 0; i11 < 7; i11++) {
            ArrayList arrayList = arrayListArrZ[i11];
            String displayName = DayOfWeek.values()[i11].getDisplayName(TextStyle.FULL, LocaleController.getInstance().getCurrentLocale());
            sb2.append(displayName.substring(0, 1).toUpperCase() + displayName.substring(1));
            sb2.append(": ");
            if (c0(arrayList)) {
                sb2.append(LocaleController.getString(R.string.BusinessHoursProfileOpen));
            } else if (arrayList.isEmpty()) {
                sb2.append(LocaleController.getString(R.string.BusinessHoursProfileClose));
            } else {
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    if (i12 > 0) {
                        sb2.append(", ");
                    }
                    x0 x0Var = (x0) arrayList.get(i12);
                    sb2.append(x0.a(x0Var.f46493a));
                    sb2.append(" - ");
                    sb2.append(x0.a(x0Var.f46494b));
                }
            }
            sb2.append("\n");
        }
        TLRPC.TL_timezone tL_timezoneA = t1.b(i10).a(tL_businessWorkHours.timezone_id);
        if (((Calendar.getInstance().getTimeZone().getRawOffset() / 1000) - (tL_timezoneA == null ? 0 : tL_timezoneA.utc_offset)) / 60 != 0 && tL_timezoneA != null) {
            int i13 = R.string.BusinessHoursCopyFooter;
            t1.b(i10);
            sb2.append(LocaleController.formatString(i13, t1.e(tL_timezoneA, true)));
        }
        return sb2.toString();
    }

    public final void X(int i10) {
        if ((this.h[i10].isEmpty() ? null : (x0) i0.a.i(1, this.h[i10])) == null) {
            return;
        }
        int i11 = (i10 + 6) % 7;
        x0 x0Var = this.h[i11].isEmpty() ? null : (x0) i0.a.i(1, this.h[i11]);
        if (x0Var == null || x0Var.f46494b <= 1439) {
            return;
        }
        x0Var.f46494b = 1439;
        if (x0Var.f46493a >= 1439) {
            this.h[i11].remove(x0Var);
        }
        View viewY1 = this.f46496a.y1(i11);
        if (viewY1 instanceof g5) {
            ((g5) viewY1).setValue(a0(this.h[i11]));
        } else {
            this.f46496a.U2.N(true);
        }
    }

    public final void Y(boolean z10) {
        if (this.f46498c == null) {
            return;
        }
        boolean zB0 = b0();
        this.f46498c.setEnabled(zB0);
        if (z10) {
            this.f46498c.animate().alpha(zB0 ? 1.0f : 0.0f).scaleX(zB0 ? 1.0f : 0.0f).scaleY(zB0 ? 1.0f : 0.0f).setDuration(180L).start();
            return;
        }
        this.f46498c.setAlpha(zB0 ? 1.0f : 0.0f);
        this.f46498c.setScaleX(zB0 ? 1.0f : 0.0f);
        this.f46498c.setScaleY(zB0 ? 1.0f : 0.0f);
    }

    public final boolean b0() {
        if ((this.f46500f != null) != this.f46499e || !TextUtils.equals(this.f46501n, this.f46502r)) {
            return true;
        }
        if (this.f46500f != null && this.f46499e) {
            if (this.h == null) {
                return true;
            }
            int i10 = 0;
            while (true) {
                ArrayList[] arrayListArr = this.f46500f;
                if (i10 >= arrayListArr.length) {
                    break;
                }
                if (arrayListArr[i10].size() != this.h[i10].size()) {
                    return true;
                }
                for (int i11 = 0; i11 < this.h[i10].size(); i11++) {
                    x0 x0Var = (x0) this.f46500f[i10].get(i11);
                    x0 x0Var2 = (x0) this.h[i10].get(i11);
                    if (x0Var.f46493a != x0Var2.f46493a || x0Var.f46494b != x0Var2.f46494b) {
                        return true;
                    }
                }
                i10++;
            }
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessHours));
        this.actionBar.setActionBarMenuOnItemClick(new ed1(11, this));
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = g6.f23375v8;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(g6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.f46497b = new dr(drawableMutate, new hp(g6.w0(null, i10, false)));
        this.f46498c = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f46497b);
        Y(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(g6.w0(null, g6.f22999a7, false));
        k51 k51Var = new k51(this, new a8(this, 21), new lh.p(this, 16), null);
        this.f46496a = k51Var;
        k51Var.p1();
        k51 k51Var2 = this.f46496a;
        k51Var2.U2.f26942r = false;
        frameLayout.addView(k51Var2, z5.c(-1.0f, -1));
        this.actionBar.B(this.f46496a, true);
        e0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0() {
        if (this.f46497b.f27834c > 0.0f) {
            return;
        }
        if (!b0()) {
            finishFragment();
            return;
        }
        this.f46497b.a(1.0f);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
        ArrayList[] arrayListArr = this.h;
        ArrayList arrayList = new ArrayList();
        if (arrayListArr != null) {
            for (int i10 = 0; i10 < arrayListArr.length; i10++) {
                if (arrayListArr[i10] != null) {
                    for (int i11 = 0; i11 < arrayListArr[i10].size(); i11++) {
                        x0 x0Var = (x0) arrayListArr[i10].get(i11);
                        TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen = new TL_account.TL_businessWeeklyOpen();
                        int i12 = i10 * 1440;
                        tL_businessWeeklyOpen.start_minute = x0Var.f46493a + i12;
                        tL_businessWeeklyOpen.end_minute = i12 + x0Var.f46494b;
                        arrayList.add(tL_businessWeeklyOpen);
                    }
                }
            }
        }
        if (this.f46499e && !arrayList.isEmpty()) {
            TL_account.TL_businessWorkHours tL_businessWorkHours = new TL_account.TL_businessWorkHours();
            tL_businessWorkHours.timezone_id = this.f46502r;
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
        getConnectionsManager().sendRequest(updatebusinessworkhours, new cf.a(this, 26));
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        b51 b51Var;
        if (i10 == NotificationCenter.userInfoDidLoad) {
            e0();
            return;
        }
        if (i10 == NotificationCenter.timezonesUpdated) {
            if (this.f46500f == null) {
                this.f46502r = t1.b(this.currentAccount).c();
            }
            k51 k51Var = this.f46496a;
            if (k51Var == null || (b51Var = k51Var.U2) == null) {
                return;
            }
            b51Var.N(true);
        }
    }

    public final void e0() {
        b51 b51Var;
        if (this.d) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessWorkHours tL_businessWorkHours = userFull.business_work_hours;
        boolean z10 = tL_businessWorkHours != null;
        this.f46499e = z10;
        if (!z10) {
            String strC = t1.b(this.currentAccount).c();
            this.f46502r = strC;
            this.f46501n = strC;
            this.f46500f = null;
            this.h = new ArrayList[7];
            int i10 = 0;
            while (true) {
                ArrayList[] arrayListArr = this.h;
                if (i10 >= arrayListArr.length) {
                    break;
                }
                arrayListArr[i10] = new ArrayList();
                if (i10 >= 0 && i10 < 5) {
                    this.h[i10].add(new x0(0, 1439));
                }
                i10++;
            }
        } else {
            String str = tL_businessWorkHours.timezone_id;
            this.f46502r = str;
            this.f46501n = str;
            this.f46500f = Z(tL_businessWorkHours.weekly_open);
            this.h = Z(userFull.business_work_hours.weekly_open);
        }
        k51 k51Var = this.f46496a;
        if (k51Var != null && (b51Var = k51Var.U2) != null) {
            b51Var.N(true);
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
        t1.b(this.currentAccount).g();
        this.f46502r = t1.b(this.currentAccount).c();
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
        this.f46496a.setPadding(0, 0, 0, i13);
        this.f46496a.setClipToPadding(false);
    }
}
