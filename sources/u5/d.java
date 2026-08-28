package u5;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DialogFragment;
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
import j3.r0;
import x5.q;
import x5.r;
public final class d extends e {
    public static final Object f48108c = new Object();
    public static final d d = new Object();

    public static AlertDialog f(Activity activity, int i9, r rVar, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i9 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(activity, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(q.c(activity, i9));
        builder.setOnCancelListener(onCancelListener);
        String b10 = q.b(activity, i9);
        if (b10 != null) {
            builder.setPositiveButton(b10, rVar);
        }
        String d9 = q.d(activity, i9);
        if (d9 != null) {
            builder.setTitle(d9);
        }
        Log.w("GoogleApiAvailability", r0.l(i9, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void g(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof v) {
                k0 s10 = ((v) activity).s();
                i iVar = new i();
                x5.l.i(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                iVar.f48118w0 = alertDialog;
                iVar.f48119x0 = onCancelListener;
                iVar.f1014t0 = false;
                iVar.f1015u0 = true;
                s10.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(s10);
                aVar.f904o = true;
                aVar.f(0, iVar, str);
                aVar.e(false, true);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        ?? dialogFragment = new DialogFragment();
        x5.l.i(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        dialogFragment.f48102a = alertDialog;
        dialogFragment.f48103b = onCancelListener;
        dialogFragment.show(fragmentManager, str);
    }

    @Override
    public final int c(Context context) {
        return d(context, e.f48109a);
    }

    public final void e(GoogleApiActivity googleApiActivity, int i9, GoogleApiActivity googleApiActivity2) {
        AlertDialog f10 = f(googleApiActivity, i9, new r(super.b(googleApiActivity, "d", i9), googleApiActivity, 0), googleApiActivity2);
        if (f10 == null) {
            return;
        }
        g(googleApiActivity, f10, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void h(Context context, int i9, PendingIntent pendingIntent) {
        String d9;
        String e10;
        int i10;
        Log.w("GoogleApiAvailability", r0.m(i9, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i9 == 18) {
            new j(this, context).sendEmptyMessageDelayed(1, 120000L);
        } else if (pendingIntent == null) {
            if (i9 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
            }
        } else {
            if (i9 == 6) {
                d9 = q.f(context, "common_google_play_services_resolution_required_title");
            } else {
                d9 = q.d(context, i9);
            }
            if (d9 == null) {
                d9 = context.getResources().getString(2131701328);
            }
            if (i9 != 6 && i9 != 19) {
                e10 = q.c(context, i9);
            } else {
                e10 = q.e(context, "common_google_play_services_resolution_required_text", q.a(context));
            }
            Resources resources = context.getResources();
            Object systemService = context.getSystemService("notification");
            x5.l.h(systemService);
            NotificationManager notificationManager = (NotificationManager) systemService;
            t tVar = new t(context, null);
            tVar.f4778t = true;
            tVar.h(16, true);
            tVar.f4764e = t.d(d9);
            e0.o oVar = new e0.o(false);
            oVar.f4746f = t.d(e10);
            tVar.n(oVar);
            PackageManager packageManager = context.getPackageManager();
            if (e6.b.f4959b == null) {
                e6.b.f4959b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
            }
            if (e6.b.f4959b.booleanValue()) {
                tVar.E.icon = context.getApplicationInfo().icon;
                tVar.f4768j = 2;
                if (e6.b.f(context)) {
                    tVar.a(2131230970, resources.getString(2131701336), pendingIntent);
                } else {
                    tVar.f4766g = pendingIntent;
                }
            } else {
                tVar.E.icon = 17301642;
                tVar.p(resources.getString(2131701328));
                tVar.E.when = System.currentTimeMillis();
                tVar.f4766g = pendingIntent;
                tVar.f(e10);
            }
            if (e6.b.d()) {
                x5.l.k(e6.b.d());
                synchronized (f48108c) {
                }
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string = context.getResources().getString(2131701327);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
                } else if (!string.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
                tVar.f4782y = "com.google.android.gms.availability";
            }
            Notification b10 = tVar.b();
            if (i9 != 1 && i9 != 2 && i9 != 3) {
                i10 = 39789;
            } else {
                g.f48112a.set(false);
                i10 = 10436;
            }
            notificationManager.notify(i10, b10);
        }
    }

    public final void i(Activity activity, com.google.android.gms.common.api.internal.m mVar, int i9, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog f10 = f(activity, i9, new r(super.b(activity, "d", i9), mVar, 1), onCancelListener);
        if (f10 == null) {
            return;
        }
        g(activity, f10, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
