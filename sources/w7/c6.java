package w7;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.cd;
import org.telegram.messenger.q20;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.id0;
import org.telegram.ui.Components.jd0;
import org.telegram.ui.Components.kd0;
import org.telegram.ui.LaunchActivity;
public abstract class c6 {
    public static int f52484a = 1500;

    public static boolean a() {
        Activity activity = LaunchActivity.I1;
        if (activity == null) {
            activity = org.telegram.messenger.i0.W(org.telegram.messenger.w0.f19025b);
        }
        if (activity == null) {
            return false;
        }
        return activity.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS");
    }

    public static void b(String[] strArr, q20 q20Var) {
        Activity activity = LaunchActivity.I1;
        if (activity == null) {
            activity = org.telegram.messenger.i0.W(org.telegram.messenger.w0.f19025b);
        }
        if (activity == null) {
            return;
        }
        for (String str : strArr) {
            if (activity.checkSelfPermission(str) != 0) {
                for (String str2 : strArr) {
                    if (activity.shouldShowRequestPermissionRationale(str2)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, null);
                        int i10 = org.telegram.ui.ActionBar.t6.L5;
                        alertDialog$Builder.m(2131624114, 72, org.telegram.ui.ActionBar.t6.x0(null, i10, false), null);
                        alertDialog$Builder.n(i10, null);
                        alertDialog$Builder.f20134a.T = org.telegram.messenger.i0.W2(cd.L0(2131747325, null));
                        alertDialog$Builder.k(cd.L0(2131747316, null), new id0(activity, 1));
                        alertDialog$Builder.h(cd.L0(2131751772, null), null);
                        alertDialog$Builder.f20134a.show();
                        q20Var.a(Boolean.FALSE);
                        return;
                    }
                }
                e(strArr, new jd0(strArr, activity, q20Var, 1));
                return;
            }
        }
        q20Var.a(Boolean.TRUE);
    }

    public static void c(int i10, int i11, String[] strArr, String[] strArr2, q20 q20Var) {
        Activity activity = LaunchActivity.I1;
        if (activity == null) {
            activity = org.telegram.messenger.i0.W(org.telegram.messenger.w0.f19025b);
        }
        if (activity == null) {
            return;
        }
        for (String str : strArr) {
            if (activity.checkSelfPermission(str) == 0) {
                q20Var.a(Boolean.TRUE);
                return;
            }
        }
        for (String str2 : strArr) {
            if (!activity.shouldShowRequestPermissionRationale(str2)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, null);
                int i12 = org.telegram.ui.ActionBar.t6.L5;
                alertDialog$Builder.m(i10, 72, org.telegram.ui.ActionBar.t6.x0(null, i12, false), null);
                alertDialog$Builder.n(i12, null);
                alertDialog$Builder.f20134a.T = org.telegram.messenger.i0.W2(cd.L0(i11, null));
                alertDialog$Builder.k(cd.L0(2131747316, null), new id0(activity, 0));
                alertDialog$Builder.h(cd.L0(2131751772, null), null);
                alertDialog$Builder.f20134a.show();
                q20Var.a(Boolean.FALSE);
                return;
            }
        }
        e(strArr2, new jd0(strArr2, activity, q20Var, 0));
    }

    public static boolean d(String str) {
        Context context = LaunchActivity.I1;
        if (context == null) {
            context = org.telegram.messenger.i0.W(org.telegram.messenger.w0.f19025b);
        }
        if (context != null && context.checkSelfPermission(str) == 0) {
            return true;
        }
        return false;
    }

    public static void e(String[] strArr, q20 q20Var) {
        Activity activity = LaunchActivity.I1;
        if (activity == null) {
            activity = org.telegram.messenger.i0.W(org.telegram.messenger.w0.f19025b);
        }
        if (activity == null) {
            return;
        }
        int i10 = f52484a;
        f52484a = i10 + 1;
        us[] usVarArr = {new kd0(i10, q20Var, usVarArr)};
        zs.e().b(usVarArr[0], zs.p5);
        activity.requestPermissions(strArr, i10);
    }

    public static void f() {
        Activity activity = LaunchActivity.I1;
        if (activity == null) {
            activity = org.telegram.messenger.i0.W(org.telegram.messenger.w0.f19025b);
        }
        if (activity == null) {
            return;
        }
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + org.telegram.messenger.w0.f19025b.getPackageName()));
        try {
            activity.startActivity(intent);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
