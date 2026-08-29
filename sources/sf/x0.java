package sf;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import i7.f6;
import j$.time.DayOfWeek;
import j$.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Calendar;
import nh.t4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.x3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.h5;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Components.ir;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.w41;
import org.telegram.ui.th;
public final class x0 extends o2 implements NotificationCenter.NotificationCenterDelegate {
    public u51 f48000a;
    public ir f48001b;
    public org.telegram.ui.ActionBar.w0 f48002c;
    public boolean d;
    public boolean f48003e;
    public ArrayList[] f48004f;
    public ArrayList[] h;
    public String f48005n;
    public String f48006r;

    public x0() {
        super(null);
        this.f48004f = null;
        this.h = new ArrayList[]{new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList()};
    }

    public static void U(x0 x0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error != null) {
            x0Var.f48001b.a(0.0f);
            tc.b0(tL_error);
        } else if (tLObject instanceof TLRPC.TL_boolFalse) {
            if (x0Var.getParentActivity() != null) {
                x0Var.f48001b.a(0.0f);
                x3.s(R.string.UnknownError, tc.a0(x0Var), null);
            }
        } else if (!x0Var.isFinished && !x0Var.finishing) {
            x0Var.finishFragment();
        }
    }

    public static void V(x0 x0Var, ArrayList arrayList) {
        String string = LocaleController.getString(R.string.BusinessHours);
        String string2 = LocaleController.getString(R.string.BusinessHoursInfo);
        int i10 = R.raw.biz_clock;
        w41 w41Var = new w41(2);
        w41Var.f34300l = string;
        w41Var.f34303o = string2;
        w41Var.f34299k = i10;
        arrayList.add(w41Var);
        w41 i11 = w41.i(-1, LocaleController.getString(R.string.BusinessHoursShow));
        i11.K(x0Var.f48003e);
        arrayList.add(i11);
        arrayList.add(w41.A(-100, null));
        if (x0Var.f48003e) {
            th.p(R.string.BusinessHours, arrayList);
            int i12 = 0;
            while (true) {
                ArrayList[] arrayListArr = x0Var.h;
                if (i12 < arrayListArr.length) {
                    if (arrayListArr[i12] == null) {
                        arrayListArr[i12] = new ArrayList();
                    }
                    String displayName = DayOfWeek.values()[i12].getDisplayName(TextStyle.FULL, LocaleController.getInstance().getCurrentLocale());
                    String a02 = a0(x0Var.h[i12]);
                    w41 w41Var2 = new w41(5);
                    w41Var2.d = i12;
                    w41Var2.f34300l = displayName.substring(0, 1).toUpperCase() + displayName.substring(1);
                    w41Var2.f34301m = a02;
                    w41Var2.K(!x0Var.h[i12].isEmpty());
                    arrayList.add(w41Var2);
                    i12++;
                } else {
                    arrayList.add(w41.A(-101, null));
                    arrayList.add(w41.f(LocaleController.getString(R.string.BusinessHoursTimezone), v1.b(x0Var.currentAccount).d(x0Var.f48006r, false), -2));
                    arrayList.add(w41.A(-102, null));
                    return;
                }
            }
        }
    }

    public static void W(x0 x0Var, View view, String str) {
        v1 b10 = v1.b(x0Var.currentAccount);
        x0Var.f48006r = str;
        ((m8) view).u(b10.d(str, false), true);
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
                if (!arrayListArr[i21].isEmpty() && ((w0) j7.l1.i(1, arrayListArr[i21])).f47998b >= 1440) {
                    ((w0) j7.l1.i(1, arrayListArr[i21])).f47998b = 1439;
                }
                int min = Math.min((i19 - i16) - 1, 2879);
                ArrayList arrayList2 = arrayListArr[(i15 + 8) % 7];
                if (min >= 1440 && !arrayList2.isEmpty() && ((w0) arrayList2.get(0)).f47997a < min - 1440) {
                    min = ((w0) arrayList2.get(0)).f47997a + 1439;
                }
                arrayListArr[i15].clear();
                arrayListArr[i15].add(new w0(0, min));
            } else {
                int i22 = i17 % 7;
                if (!arrayListArr[i15].isEmpty() && !arrayListArr[i22].isEmpty()) {
                    w0 w0Var = (w0) j7.l1.i(1, arrayListArr[i15]);
                    w0 w0Var2 = (w0) arrayListArr[i22].get(0);
                    int i23 = w0Var.f47998b;
                    if (i23 > 1440 && i23 - 1439 == w0Var2.f47997a) {
                        w0Var.f47998b = 1439;
                        w0Var2.f47997a = 0;
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
                str = u3.c.k(str, "\n");
            }
            StringBuilder n10 = com.google.android.recaptcha.internal.a.n(str);
            n10.append(w0.a(w0Var.f47997a));
            n10.append(" - ");
            n10.append(w0.a(w0Var.f47998b));
            str = n10.toString();
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
            if (i10 < w0Var.f47997a) {
                return false;
            }
            i10 = w0Var.f47998b;
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
        StringBuilder sb2 = new StringBuilder();
        if (user != null) {
            sb2.append(LocaleController.formatString(R.string.BusinessHoursCopyHeader, UserObject.getUserName(user)));
            sb2.append("\n");
        }
        for (int i12 = 0; i12 < 7; i12++) {
            ArrayList arrayList = Z[i12];
            String displayName = DayOfWeek.values()[i12].getDisplayName(TextStyle.FULL, LocaleController.getInstance().getCurrentLocale());
            sb2.append(displayName.substring(0, 1).toUpperCase() + displayName.substring(1));
            sb2.append(": ");
            if (c0(arrayList)) {
                sb2.append(LocaleController.getString(R.string.BusinessHoursProfileOpen));
            } else if (arrayList.isEmpty()) {
                sb2.append(LocaleController.getString(R.string.BusinessHoursProfileClose));
            } else {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    if (i13 > 0) {
                        sb2.append(", ");
                    }
                    w0 w0Var = (w0) arrayList.get(i13);
                    sb2.append(w0.a(w0Var.f47997a));
                    sb2.append(" - ");
                    sb2.append(w0.a(w0Var.f47998b));
                }
            }
            sb2.append("\n");
        }
        TLRPC.TL_timezone a2 = v1.b(i10).a(tL_businessWorkHours.timezone_id);
        int rawOffset = Calendar.getInstance().getTimeZone().getRawOffset() / 1000;
        if (a2 == null) {
            i11 = 0;
        } else {
            i11 = a2.utc_offset;
        }
        if ((rawOffset - i11) / 60 != 0 && a2 != null) {
            int i14 = R.string.BusinessHoursCopyFooter;
            v1.b(i10);
            sb2.append(LocaleController.formatString(i14, v1.e(a2, true)));
        }
        return sb2.toString();
    }

    public final void X(int i10) {
        w0 w0Var;
        w0 w0Var2 = null;
        if (this.h[i10].isEmpty()) {
            w0Var = null;
        } else {
            w0Var = (w0) j7.l1.i(1, this.h[i10]);
        }
        if (w0Var != null) {
            int i11 = (i10 + 6) % 7;
            if (!this.h[i11].isEmpty()) {
                w0Var2 = (w0) j7.l1.i(1, this.h[i11]);
            }
            if (w0Var2 != null && w0Var2.f47998b > 1439) {
                w0Var2.f47998b = 1439;
                if (w0Var2.f47997a >= 1439) {
                    this.h[i11].remove(w0Var2);
                }
                View y12 = this.f48000a.y1(i11);
                if (y12 instanceof h5) {
                    ((h5) y12).setValue(a0(this.h[i11]));
                } else {
                    this.f48000a.U2.N(true);
                }
            }
        }
    }

    public final void Y(boolean z10) {
        float f9;
        float f10;
        float f11;
        float f12;
        if (this.f48002c == null) {
            return;
        }
        boolean b02 = b0();
        this.f48002c.setEnabled(b02);
        float f13 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = this.f48002c.animate();
            if (b02) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f11);
            if (b02) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f12);
            if (b02) {
                f13 = 1.0f;
            }
            scaleX.scaleY(f13).setDuration(180L).start();
            return;
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.f48002c;
        if (b02) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        w0Var.setAlpha(f9);
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f48002c;
        if (b02) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        w0Var2.setScaleX(f10);
        org.telegram.ui.ActionBar.w0 w0Var3 = this.f48002c;
        if (b02) {
            f13 = 1.0f;
        }
        w0Var3.setScaleY(f13);
    }

    public final boolean b0() {
        throw new UnsupportedOperationException("Method not decompiled: sf.x0.b0():boolean");
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessHours));
        this.actionBar.setActionBarMenuOnItemClick(new qh.e(this, 11));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = g6.f23385v8;
        mutate.setColorFilter(new PorterDuffColorFilter(g6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.f48001b = new ir(mutate, new np(g6.w0(null, i10, false)));
        this.f48002c = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f48001b);
        Y(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(g6.w0(null, g6.f23009a7, false));
        u51 u51Var = new u51(this, new t4(this, 22), new l4.s0(this, 28), null);
        this.f48000a = u51Var;
        u51Var.p1();
        u51 u51Var2 = this.f48000a;
        u51Var2.U2.f29939r = false;
        frameLayout.addView(u51Var2, f6.c(-1.0f, -1));
        this.actionBar.A(this.f48000a, true);
        e0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0() {
        if (this.f48001b.f29455c > 0.0f) {
            return;
        }
        if (!b0()) {
            finishFragment();
            return;
        }
        this.f48001b.a(1.0f);
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
                        tL_businessWeeklyOpen.start_minute = w0Var.f47997a + i12;
                        tL_businessWeeklyOpen.end_minute = i12 + w0Var.f47998b;
                        arrayList.add(tL_businessWeeklyOpen);
                    }
                }
            }
        }
        if (this.f48003e && !arrayList.isEmpty()) {
            TL_account.TL_businessWorkHours tL_businessWorkHours = new TL_account.TL_businessWorkHours();
            tL_businessWorkHours.timezone_id = this.f48006r;
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
        getConnectionsManager().sendRequest(updatebusinessworkhours, new ef.a(this, 26));
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        k51 k51Var;
        if (i10 == NotificationCenter.userInfoDidLoad) {
            e0();
        } else if (i10 == NotificationCenter.timezonesUpdated) {
            if (this.f48004f == null) {
                this.f48006r = v1.b(this.currentAccount).c();
            }
            u51 u51Var = this.f48000a;
            if (u51Var != null && (k51Var = u51Var.U2) != null) {
                k51Var.N(true);
            }
        }
    }

    public final void e0() {
        boolean z10;
        k51 k51Var;
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
            z10 = true;
        } else {
            z10 = false;
        }
        this.f48003e = z10;
        if (z10) {
            String str = tL_businessWorkHours.timezone_id;
            this.f48006r = str;
            this.f48005n = str;
            this.f48004f = Z(tL_businessWorkHours.weekly_open);
            this.h = Z(userFull.business_work_hours.weekly_open);
        } else {
            String c3 = v1.b(this.currentAccount).c();
            this.f48006r = c3;
            this.f48005n = c3;
            this.f48004f = null;
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
        u51 u51Var = this.f48000a;
        if (u51Var != null && (k51Var = u51Var.U2) != null) {
            k51Var.N(true);
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
        v1.b(this.currentAccount).g();
        this.f48006r = v1.b(this.currentAccount).c();
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
        this.f48000a.setPadding(0, 0, 0, i13);
        this.f48000a.setClipToPadding(false);
    }
}
