package y5;

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
import b6.r;
import b6.s;
import com.google.android.gms.common.api.GoogleApiActivity;
import e0.t;
public final class d extends e {
    public static final Object f50766c = new Object();
    public static final d d = new Object();

    public static AlertDialog f(Activity activity, int i10, s sVar, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i10 == 0) {
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
        builder.setMessage(r.c(activity, i10));
        builder.setOnCancelListener(onCancelListener);
        String b10 = r.b(activity, i10);
        if (b10 != null) {
            builder.setPositiveButton(b10, sVar);
        }
        String d10 = r.d(activity, i10);
        if (d10 != null) {
            builder.setTitle(d10);
        }
        Log.w("GoogleApiAvailability", l.d.j(i10, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void g(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof v) {
                k0 s6 = ((v) activity).s();
                i iVar = new i();
                b6.m.i(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                iVar.f50777x0 = alertDialog;
                iVar.f50778y0 = onCancelListener;
                iVar.f993u0 = false;
                iVar.f994v0 = true;
                s6.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(s6);
                aVar.f883o = true;
                aVar.f(0, iVar, str);
                aVar.e(false, true);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        ?? dialogFragment = new DialogFragment();
        b6.m.i(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        dialogFragment.f50760a = alertDialog;
        dialogFragment.f50761b = onCancelListener;
        dialogFragment.show(fragmentManager, str);
    }

    @Override
    public final int c(Context context) {
        return d(context, e.f50767a);
    }

    public final void e(GoogleApiActivity googleApiActivity, int i10, GoogleApiActivity googleApiActivity2) {
        AlertDialog f10 = f(googleApiActivity, i10, new s(super.b(googleApiActivity, "d", i10), googleApiActivity, 0), googleApiActivity2);
        if (f10 == null) {
            return;
        }
        g(googleApiActivity, f10, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void h(Context context, int i10, PendingIntent pendingIntent) {
        String d10;
        String e6;
        int i11;
        Log.w("GoogleApiAvailability", l.d.k(i10, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i10 == 18) {
            new j(this, context).sendEmptyMessageDelayed(1, 120000L);
        } else if (pendingIntent == null) {
            if (i10 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
            }
        } else {
            if (i10 == 6) {
                d10 = r.f(context, "common_google_play_services_resolution_required_title");
            } else {
                d10 = r.d(context, i10);
            }
            if (d10 == null) {
                d10 = context.getResources().getString(2131701330);
            }
            if (i10 != 6 && i10 != 19) {
                e6 = r.c(context, i10);
            } else {
                e6 = r.e(context, "common_google_play_services_resolution_required_text", r.a(context));
            }
            Resources resources = context.getResources();
            Object systemService = context.getSystemService("notification");
            b6.m.h(systemService);
            NotificationManager notificationManager = (NotificationManager) systemService;
            t tVar = new t(context, null);
            tVar.f4864t = true;
            tVar.h(16, true);
            tVar.f4850e = t.d(d10);
            e0.o oVar = new e0.o(false);
            oVar.f4834f = t.d(e6);
            tVar.n(oVar);
            PackageManager packageManager = context.getPackageManager();
            if (i6.b.f7904b == null) {
                i6.b.f7904b = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
            }
            if (i6.b.f7904b.booleanValue()) {
                tVar.E.icon = context.getApplicationInfo().icon;
                tVar.f4854j = 2;
                if (i6.b.f(context)) {
                    tVar.a(2131230970, resources.getString(2131701338), pendingIntent);
                } else {
                    tVar.f4852g = pendingIntent;
                }
            } else {
                tVar.E.icon = 17301642;
                tVar.p(resources.getString(2131701330));
                tVar.E.when = System.currentTimeMillis();
                tVar.f4852g = pendingIntent;
                tVar.f(e6);
            }
            if (i6.b.d()) {
                b6.m.k(i6.b.d());
                synchronized (f50766c) {
                }
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string = context.getResources().getString(2131701329);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
                } else if (!string.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
                tVar.f4868y = "com.google.android.gms.availability";
            }
            Notification b10 = tVar.b();
            if (i10 != 1 && i10 != 2 && i10 != 3) {
                i11 = 39789;
            } else {
                g.f50770a.set(false);
                i11 = 10436;
            }
            notificationManager.notify(i11, b10);
        }
    }

    public final void i(Activity activity, com.google.android.gms.common.api.internal.m mVar, int i10, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog f10 = f(activity, i10, new s(super.b(activity, "d", i10), mVar, 1), onCancelListener);
        if (f10 == null) {
            return;
        }
        g(activity, f10, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
