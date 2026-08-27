package v5;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import androidx.fragment.app.k0;
import androidx.fragment.app.v;
import com.google.android.gms.common.api.GoogleApiActivity;
import e0.t;
import y5.q;
import y5.r;

public final class d extends e {

    public static final Object f48793c = new Object();
    public static final d d = new d();

    public static AlertDialog f(Activity activity, int i10, r rVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(16843529, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(q.c(activity, i10));
        builder.setOnCancelListener(onCancelListener);
        String strB = q.b(activity, i10);
        if (strB != null) {
            builder.setPositiveButton(strB, rVar);
        }
        String strD = q.d(activity, i10);
        if (strD != null) {
            builder.setTitle(strD);
        }
        Log.w("GoogleApiAvailability", i0.a.k(i10, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void g(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof v) {
                k0 k0VarS = ((v) activity).s();
                i iVar = new i();
                y5.l.i(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                iVar.f48803w0 = alertDialog;
                iVar.f48804x0 = onCancelListener;
                iVar.f1511t0 = false;
                iVar.f1512u0 = true;
                k0VarS.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(k0VarS);
                aVar.f1401o = true;
                aVar.f(0, iVar, str);
                aVar.e(false, true);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        b bVar = new b();
        y5.l.i(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        bVar.f48787a = alertDialog;
        bVar.f48788b = onCancelListener;
        bVar.show(fragmentManager, str);
    }

    @Override
    public final int c(Context context) {
        return d(context, e.f48794a);
    }

    public final void e(GoogleApiActivity googleApiActivity, int i10, GoogleApiActivity googleApiActivity2) {
        AlertDialog alertDialogF = f(googleApiActivity, i10, new r(super.b(googleApiActivity, "d", i10), googleApiActivity, 0), googleApiActivity2);
        if (alertDialogF == null) {
            return;
        }
        g(googleApiActivity, alertDialogF, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void h(Context context, int i10, PendingIntent pendingIntent) {
        int i11;
        Log.w("GoogleApiAvailability", i0.a.l(i10, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i10 == 18) {
            new j(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i10 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strF = i10 == 6 ? q.f(context, "common_google_play_services_resolution_required_title") : q.d(context, i10);
        if (strF == null) {
            strF = context.getResources().getString(2131701328);
        }
        String strE = (i10 == 6 || i10 == 19) ? q.e(context, "common_google_play_services_resolution_required_text", q.a(context)) : q.c(context, i10);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        y5.l.h(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        t tVar = new t(context, null);
        tVar.f5135t = true;
        tVar.h(16, true);
        tVar.f5121e = t.d(strF);
        e0.o oVar = new e0.o(false);
        oVar.f5103f = t.d(strE);
        tVar.n(oVar);
        PackageManager packageManager = context.getPackageManager();
        if (f6.b.f5888b == null) {
            f6.b.f5888b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (f6.b.f5888b.booleanValue()) {
            tVar.E.icon = context.getApplicationInfo().icon;
            tVar.f5125j = 2;
            if (f6.b.f(context)) {
                tVar.a(2131230970, resources.getString(2131701336), pendingIntent);
            } else {
                tVar.f5123g = pendingIntent;
            }
        } else {
            tVar.E.icon = 17301642;
            tVar.p(resources.getString(2131701328));
            tVar.E.when = System.currentTimeMillis();
            tVar.f5123g = pendingIntent;
            tVar.f(strE);
        }
        if (f6.b.d()) {
            y5.l.k(f6.b.d());
            synchronized (f48793c) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(2131701327);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            tVar.f5139y = "com.google.android.gms.availability";
        }
        Notification notificationB = tVar.b();
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            g.f48797a.set(false);
            i11 = 10436;
        } else {
            i11 = 39789;
        }
        notificationManager.notify(i11, notificationB);
    }

    public final void i(Activity activity, com.google.android.gms.common.api.internal.m mVar, int i10, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogF = f(activity, i10, new r(super.b(activity, "d", i10), mVar, 1), onCancelListener);
        if (alertDialogF == null) {
            return;
        }
        g(activity, alertDialogF, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
