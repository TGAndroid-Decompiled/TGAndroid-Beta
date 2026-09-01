package vf;

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
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.y3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.j5;
import org.telegram.ui.Cells.o8;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.or;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.x51;
import org.telegram.ui.yh;
import qh.d4;
public final class x0 extends p2 implements NotificationCenter.NotificationCenterDelegate {
    public i61 f49234a;
    public or f49235b;
    public org.telegram.ui.ActionBar.w0 f49236c;
    public boolean d;
    public boolean f49237e;
    public ArrayList[] f49238f;
    public ArrayList[] h;
    public String f49239n;
    public String f49240r;

    public x0() {
        super(null);
        this.f49238f = null;
        this.h = new ArrayList[]{new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList()};
    }

    public static void U(x0 x0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error != null) {
            x0Var.f49235b.a(0.0f);
            qc.b0(tL_error);
        } else if (tLObject instanceof TLRPC.TL_boolFalse) {
            if (x0Var.getParentActivity() != null) {
                x0Var.f49235b.a(0.0f);
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
        j51 j51Var = new j51(2);
        j51Var.f28014l = string;
        j51Var.f28017o = string2;
        j51Var.f28013k = i10;
        arrayList.add(j51Var);
        j51 i11 = j51.i(-1, LocaleController.getString(R.string.BusinessHoursShow));
        i11.K(x0Var.f49237e);
        arrayList.add(i11);
        arrayList.add(j51.A(-100, null));
        if (x0Var.f49237e) {
            yh.r(R.string.BusinessHours, arrayList);
            int i12 = 0;
            while (true) {
                ArrayList[] arrayListArr = x0Var.h;
                if (i12 < arrayListArr.length) {
                    if (arrayListArr[i12] == null) {
                        arrayListArr[i12] = new ArrayList();
                    }
                    String displayName = DayOfWeek.values()[i12].getDisplayName(TextStyle.FULL, LocaleController.getInstance().getCurrentLocale());
                    String a02 = a0(x0Var.h[i12]);
                    j51 j51Var2 = new j51(5);
                    j51Var2.d = i12;
                    j51Var2.f28014l = displayName.substring(0, 1).toUpperCase() + displayName.substring(1);
                    j51Var2.f28015m = a02;
                    j51Var2.K(!x0Var.h[i12].isEmpty());
                    arrayList.add(j51Var2);
                    i12++;
                } else {
                    arrayList.add(j51.A(-101, null));
                    arrayList.add(j51.f(LocaleController.getString(R.string.BusinessHoursTimezone), s1.b(x0Var.currentAccount).d(x0Var.f49240r, false), -2));
                    arrayList.add(j51.A(-102, null));
                    return;
                }
            }
        }
    }

    public static void W(x0 x0Var, View view, String str) {
        s1 b10 = s1.b(x0Var.currentAccount);
        x0Var.f49240r = str;
        ((o8) view).u(b10.d(str, false), true);
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
                if (!arrayListArr[i21].isEmpty() && ((w0) l.d.i(1, arrayListArr[i21])).f49232b >= 1440) {
                    ((w0) l.d.i(1, arrayListArr[i21])).f49232b = 1439;
                }
                int min = Math.min((i19 - i16) - 1, 2879);
                ArrayList arrayList2 = arrayListArr[(i15 + 8) % 7];
                if (min >= 1440 && !arrayList2.isEmpty() && ((w0) arrayList2.get(0)).f49231a < min - 1440) {
                    min = ((w0) arrayList2.get(0)).f49231a + 1439;
                }
                arrayListArr[i15].clear();
                arrayListArr[i15].add(new w0(0, min));
            } else {
                int i22 = i17 % 7;
                if (!arrayListArr[i15].isEmpty() && !arrayListArr[i22].isEmpty()) {
                    w0 w0Var = (w0) l.d.i(1, arrayListArr[i15]);
                    w0 w0Var2 = (w0) arrayListArr[i22].get(0);
                    int i23 = w0Var.f49232b;
                    if (i23 > 1440 && i23 - 1439 == w0Var2.f49231a) {
                        w0Var.f49232b = 1439;
                        w0Var2.f49231a = 0;
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
                str = w.c.e(str, "\n");
            }
            StringBuilder l10 = e2.c.l(str);
            l10.append(w0.a(w0Var.f49231a));
            l10.append(" - ");
            l10.append(w0.a(w0Var.f49232b));
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
            if (i10 < w0Var.f49231a) {
                return false;
            }
            i10 = w0Var.f49232b;
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
                    sb.append(w0.a(w0Var.f49231a));
                    sb.append(" - ");
                    sb.append(w0.a(w0Var.f49232b));
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
            w0Var = (w0) l.d.i(1, this.h[i10]);
        }
        if (w0Var != null) {
            int i11 = (i10 + 6) % 7;
            if (!this.h[i11].isEmpty()) {
                w0Var2 = (w0) l.d.i(1, this.h[i11]);
            }
            if (w0Var2 != null && w0Var2.f49232b > 1439) {
                w0Var2.f49232b = 1439;
                if (w0Var2.f49231a >= 1439) {
                    this.h[i11].remove(w0Var2);
                }
                View y12 = this.f49234a.y1(i11);
                if (y12 instanceof j5) {
                    ((j5) y12).setValue(a0(this.h[i11]));
                } else {
                    this.f49234a.V2.N(true);
                }
            }
        }
    }

    public final void Y(boolean z4) {
        float f10;
        float f11;
        float f12;
        float f13;
        if (this.f49236c == null) {
            return;
        }
        boolean b02 = b0();
        this.f49236c.setEnabled(b02);
        float f14 = 0.0f;
        if (z4) {
            ViewPropertyAnimator animate = this.f49236c.animate();
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
        org.telegram.ui.ActionBar.w0 w0Var = this.f49236c;
        if (b02) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        w0Var.setAlpha(f10);
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f49236c;
        if (b02) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        w0Var2.setScaleX(f11);
        org.telegram.ui.ActionBar.w0 w0Var3 = this.f49236c;
        if (b02) {
            f14 = 1.0f;
        }
        w0Var3.setScaleY(f14);
    }

    public final boolean b0() {
        throw new UnsupportedOperationException("Method not decompiled: vf.x0.b0():boolean");
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessHours));
        this.actionBar.setActionBarMenuOnItemClick(new th.e(this, 11));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = k6.f21981v8;
        mutate.setColorFilter(new PorterDuffColorFilter(k6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.f49235b = new or(mutate, new tp(k6.w0(null, i10, false)));
        this.f49236c = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f49235b);
        Y(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(k6.w0(null, k6.f21605a7, false));
        i61 i61Var = new i61(this, new d4(this, 22), new sf.g(this, 6), null);
        this.f49234a = i61Var;
        i61Var.p1();
        i61 i61Var2 = this.f49234a;
        i61Var2.V2.f32957r = false;
        frameLayout.addView(i61Var2, c6.c(-1.0f, -1));
        this.actionBar.A(this.f49234a, true);
        e0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0() {
        if (this.f49235b.f29840c > 0.0f) {
            return;
        }
        if (!b0()) {
            finishFragment();
            return;
        }
        this.f49235b.a(1.0f);
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
                        tL_businessWeeklyOpen.start_minute = w0Var.f49231a + i12;
                        tL_businessWeeklyOpen.end_minute = i12 + w0Var.f49232b;
                        arrayList.add(tL_businessWeeklyOpen);
                    }
                }
            }
        }
        if (this.f49237e && !arrayList.isEmpty()) {
            TL_account.TL_businessWorkHours tL_businessWorkHours = new TL_account.TL_businessWorkHours();
            tL_businessWorkHours.timezone_id = this.f49240r;
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
        getConnectionsManager().sendRequest(updatebusinessworkhours, new gf.a(this, 26));
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        x51 x51Var;
        if (i10 == NotificationCenter.userInfoDidLoad) {
            e0();
        } else if (i10 == NotificationCenter.timezonesUpdated) {
            if (this.f49238f == null) {
                this.f49240r = s1.b(this.currentAccount).c();
            }
            i61 i61Var = this.f49234a;
            if (i61Var != null && (x51Var = i61Var.V2) != null) {
                x51Var.N(true);
            }
        }
    }

    public final void e0() {
        boolean z4;
        x51 x51Var;
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
        this.f49237e = z4;
        if (z4) {
            String str = tL_businessWorkHours.timezone_id;
            this.f49240r = str;
            this.f49239n = str;
            this.f49238f = Z(tL_businessWorkHours.weekly_open);
            this.h = Z(userFull.business_work_hours.weekly_open);
        } else {
            String c3 = s1.b(this.currentAccount).c();
            this.f49240r = c3;
            this.f49239n = c3;
            this.f49238f = null;
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
        i61 i61Var = this.f49234a;
        if (i61Var != null && (x51Var = i61Var.V2) != null) {
            x51Var.N(true);
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
        this.f49240r = s1.b(this.currentAccount).c();
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
        this.f49234a.setPadding(0, 0, 0, i13);
        this.f49234a.setClipToPadding(false);
    }
}
