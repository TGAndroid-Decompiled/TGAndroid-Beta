package ph;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.util.Pair;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import nh.bc;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.yd0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.av0;
import org.telegram.ui.yu0;
public final class q0 {
    public static final HashMap f45996g = new HashMap();
    public final Context f45997a;
    public final int f45998b;
    public final long f45999c;
    public boolean d;
    public boolean f46000e;
    public final HashSet f46001f;

    public q0(Context context, int i10, long j10) {
        HashSet hashSet = new HashSet();
        this.f46001f = hashSet;
        this.f45997a = context;
        this.f45998b = i10;
        this.f45999c = j10;
        SharedPreferences sharedPreferences = context.getSharedPreferences("botlocation_" + i10, 0);
        this.d = sharedPreferences.getBoolean(j10 + "_requested", false);
        boolean z10 = sharedPreferences.getBoolean(j10 + "_granted", false);
        this.f46000e = z10;
        if (z10 && !a()) {
            this.f46000e = false;
            this.d = false;
            l();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
    }

    public static void c() {
        Context context = ApplicationLoader.applicationContext;
        if (context == null) {
            return;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            context.getSharedPreferences("botlocation_" + i10, 0).edit().clear().apply();
        }
        f45996g.clear();
    }

    public static q0 e(Context context, int i10, long j10) {
        Pair pair = new Pair(Integer.valueOf(i10), Long.valueOf(j10));
        HashMap hashMap = f45996g;
        q0 q0Var = (q0) hashMap.get(pair);
        if (q0Var == null) {
            q0 q0Var2 = new q0(context, i10, j10);
            hashMap.put(pair, q0Var2);
            return q0Var2;
        }
        return q0Var;
    }

    public static JSONObject h(Location location) {
        boolean z10;
        JSONObject jSONObject = new JSONObject();
        if (location != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        try {
            jSONObject.put("available", z10);
            if (location == null) {
                return jSONObject;
            }
            jSONObject.put("latitude", location.getLatitude());
            jSONObject.put("longitude", location.getLongitude());
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 26) {
                jSONObject.put("horizontal_accuracy", location.getAccuracy());
            } else {
                jSONObject.put("horizontal_accuracy", (Object) null);
            }
            jSONObject.put("altitude", location.getAltitude());
            if (i10 >= 26) {
                jSONObject.put("vertical_accuracy", location.getVerticalAccuracyMeters());
            } else {
                jSONObject.put("vertical_accuracy", (Object) null);
            }
            jSONObject.put("course", location.getBearing());
            if (i10 >= 26) {
                jSONObject.put("course_accuracy", location.getBearingAccuracyDegrees());
            } else {
                jSONObject.put("course_accuracy", (Object) null);
            }
            jSONObject.put("speed", location.getSpeed());
            if (i10 >= 26) {
                jSONObject.put("speed_accuracy", location.getSpeedAccuracyMetersPerSecond());
                return jSONObject;
            }
            jSONObject.put("speed_accuracy", (Object) null);
            return jSONObject;
        } catch (Exception e10) {
            FileLog.e(e10);
            return jSONObject;
        }
    }

    public final boolean a() {
        Activity f9 = f();
        if (Build.VERSION.SDK_INT >= 23) {
            if (f9 != null) {
                if (f9.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0 && f9.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean b() {
        return this.d;
    }

    public final boolean d() {
        if (f() != null && f().getPackageManager().hasSystemFeature("android.hardware.location.gps")) {
            return true;
        }
        return false;
    }

    public final Activity f() {
        Activity activity = LaunchActivity.C1;
        if (activity == null) {
            activity = AndroidUtilities.findActivity(this.f45997a);
        }
        if (activity == null) {
            return AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
        }
        return activity;
    }

    public final boolean g() {
        if (a() && this.f46000e) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        Activity f9;
        if (Build.VERSION.SDK_INT < 23 || (f9 = f()) == null) {
            return false;
        }
        if (f9.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") && f9.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION")) {
            return false;
        }
        return true;
    }

    public final void j(final org.telegram.ui.web.s sVar) {
        Activity f9 = f();
        if (f9 == null) {
            return;
        }
        if (!d()) {
            Boolean bool = Boolean.FALSE;
            sVar.run(bool, bool);
        } else if (a() && (this.d || this.f46000e)) {
            sVar.run(Boolean.FALSE, Boolean.TRUE);
        } else {
            final boolean[] zArr = new boolean[1];
            int i10 = this.f45998b;
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(this.f45999c));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f9, 0, null);
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequest, UserObject.getUserName(user), UserObject.getUserName(user)));
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
            c2Var.P = replaceTags;
            p0 p0Var = new p0(this.f45997a, UserConfig.getInstance(i10).getCurrentUser(), user);
            int w02 = g6.w0(null, g6.L5, false);
            c2Var.X = p0Var;
            c2Var.Y = w02;
            if (!a() && i()) {
                alertDialog$Builder.k(LocaleController.getString(R.string.BotLocationPermissionSettings), new org.telegram.ui.Components.voip.w1(f9, zArr, sVar, 2));
            } else {
                alertDialog$Builder.k(LocaleController.getString(R.string.BotLocationPermissionAllow), new org.telegram.ui.ActionBar.b2(this) {
                    public final q0 f45915b;

                    {
                        this.f45915b = this;
                    }

                    @Override
                    public final void g(org.telegram.ui.ActionBar.c2 c2Var2, int i11) {
                        switch (r4) {
                            case 0:
                                q0 q0Var = this.f45915b;
                                q0Var.getClass();
                                zArr[0] = true;
                                boolean a2 = q0Var.a();
                                org.telegram.ui.web.s sVar2 = sVar;
                                if (!a2) {
                                    yd0.g(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new yu0(10, q0Var, sVar2));
                                    return;
                                }
                                q0Var.d = true;
                                q0Var.f46000e = true;
                                q0Var.l();
                                Iterator it = q0Var.f46001f.iterator();
                                while (it.hasNext()) {
                                    ((Runnable) it.next()).run();
                                }
                                Boolean bool2 = Boolean.TRUE;
                                sVar2.run(bool2, bool2);
                                return;
                            default:
                                q0 q0Var2 = this.f45915b;
                                q0Var2.getClass();
                                boolean[] zArr2 = zArr;
                                if (!zArr2[0]) {
                                    zArr2[0] = true;
                                    q0Var2.d = true;
                                    q0Var2.f46000e = false;
                                    q0Var2.l();
                                    Iterator it2 = q0Var2.f46001f.iterator();
                                    while (it2.hasNext()) {
                                        ((Runnable) it2.next()).run();
                                    }
                                    sVar.run(Boolean.TRUE, Boolean.FALSE);
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            alertDialog$Builder.h(LocaleController.getString(R.string.BotLocationPermissionDecline), new org.telegram.ui.ActionBar.b2(this) {
                public final q0 f45915b;

                {
                    this.f45915b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.c2 c2Var2, int i11) {
                    switch (r4) {
                        case 0:
                            q0 q0Var = this.f45915b;
                            q0Var.getClass();
                            zArr[0] = true;
                            boolean a2 = q0Var.a();
                            org.telegram.ui.web.s sVar2 = sVar;
                            if (!a2) {
                                yd0.g(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new yu0(10, q0Var, sVar2));
                                return;
                            }
                            q0Var.d = true;
                            q0Var.f46000e = true;
                            q0Var.l();
                            Iterator it = q0Var.f46001f.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                            Boolean bool2 = Boolean.TRUE;
                            sVar2.run(bool2, bool2);
                            return;
                        default:
                            q0 q0Var2 = this.f45915b;
                            q0Var2.getClass();
                            boolean[] zArr2 = zArr;
                            if (!zArr2[0]) {
                                zArr2[0] = true;
                                q0Var2.d = true;
                                q0Var2.f46000e = false;
                                q0Var2.l();
                                Iterator it2 = q0Var2.f46001f.iterator();
                                while (it2.hasNext()) {
                                    ((Runnable) it2.next()).run();
                                }
                                sVar.run(Boolean.TRUE, Boolean.FALSE);
                                return;
                            }
                            return;
                    }
                }
            });
            alertDialog$Builder.j(new ih.j(this, zArr, sVar, 5));
            alertDialog$Builder.o();
        }
    }

    public final void k(Utilities.Callback callback) {
        JSONObject jSONObject = new JSONObject();
        if (this.f46000e && a() && d()) {
            LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
            List<String> providers = locationManager.getProviders(true);
            Location location = null;
            for (int size = providers.size() - 1; size >= 0; size--) {
                location = locationManager.getLastKnownLocation(providers.get(size));
                if (location != null) {
                    break;
                }
            }
            if (location == null && !locationManager.isProviderEnabled("gps")) {
                Context context = LaunchActivity.C1;
                if (context == null) {
                    context = ApplicationLoader.applicationContext;
                }
                if (context != null) {
                    try {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                        alertDialog$Builder.m(R.raw.permission_request_location, 72, g6.w0(null, g6.L5, false), null);
                        alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.GpsDisabledAlertText);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new bc(context, 1));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.o();
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                callback.run(h(null));
                return;
            } else if (location != null) {
                callback.run(h(location));
                return;
            } else {
                try {
                    o0 o0Var = new o0(this, locationManager, r0, callback);
                    LocationListener[] locationListenerArr = {o0Var};
                    locationManager.requestLocationUpdates("gps", 1L, 0.0f, o0Var);
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    callback.run(h(null));
                    return;
                }
            }
        }
        try {
            jSONObject.put("available", false);
        } catch (Exception e12) {
            FileLog.e(e12);
        }
        callback.run(jSONObject);
    }

    public final void l() {
        SharedPreferences.Editor edit = this.f45997a.getSharedPreferences("botlocation_" + this.f45998b, 0).edit();
        StringBuilder sb2 = new StringBuilder();
        long j10 = this.f45999c;
        edit.putBoolean(a4.w.p(sb2, j10, "_granted"), this.f46000e);
        edit.putBoolean(j10 + "_requested", this.d);
        edit.apply();
    }

    public final void m(boolean z10, final av0 av0Var) {
        this.d = true;
        if (z10 && !a()) {
            Activity f9 = f();
            if (f9 == null) {
                return;
            }
            int i10 = this.f45998b;
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(this.f45999c));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f(), 0, null);
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequest, UserObject.getUserName(user), UserObject.getUserName(user)));
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
            c2Var.P = replaceTags;
            p0 p0Var = new p0(this.f45997a, UserConfig.getInstance(i10).getCurrentUser(), user);
            int w02 = g6.w0(null, g6.L5, false);
            c2Var.X = p0Var;
            c2Var.Y = w02;
            if (i()) {
                alertDialog$Builder.k(LocaleController.getString(R.string.BotLocationPermissionSettings), new org.telegram.ui.Components.voip.d2(f9, 1));
            } else {
                alertDialog$Builder.k(LocaleController.getString(R.string.BotLocationPermissionAllow), new org.telegram.ui.ActionBar.b2(this) {
                    public final q0 f45897b;

                    {
                        this.f45897b = this;
                    }

                    @Override
                    public final void g(org.telegram.ui.ActionBar.c2 c2Var2, int i11) {
                        switch (r3) {
                            case 0:
                                q0 q0Var = this.f45897b;
                                if (!q0Var.a()) {
                                    yd0.g(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new yu0(11, q0Var, av0Var));
                                    return;
                                }
                                q0Var.d = true;
                                q0Var.f46000e = true;
                                q0Var.l();
                                Iterator it = q0Var.f46001f.iterator();
                                while (it.hasNext()) {
                                    ((Runnable) it.next()).run();
                                }
                                return;
                            default:
                                q0 q0Var2 = this.f45897b;
                                q0Var2.d = true;
                                q0Var2.f46000e = false;
                                q0Var2.l();
                                Iterator it2 = q0Var2.f46001f.iterator();
                                while (it2.hasNext()) {
                                    ((Runnable) it2.next()).run();
                                }
                                Runnable runnable = av0Var;
                                if (runnable != null) {
                                    runnable.run();
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            alertDialog$Builder.h(LocaleController.getString(R.string.BotLocationPermissionDecline), new org.telegram.ui.ActionBar.b2(this) {
                public final q0 f45897b;

                {
                    this.f45897b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.c2 c2Var2, int i11) {
                    switch (r3) {
                        case 0:
                            q0 q0Var = this.f45897b;
                            if (!q0Var.a()) {
                                yd0.g(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new yu0(11, q0Var, av0Var));
                                return;
                            }
                            q0Var.d = true;
                            q0Var.f46000e = true;
                            q0Var.l();
                            Iterator it = q0Var.f46001f.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                            return;
                        default:
                            q0 q0Var2 = this.f45897b;
                            q0Var2.d = true;
                            q0Var2.f46000e = false;
                            q0Var2.l();
                            Iterator it2 = q0Var2.f46001f.iterator();
                            while (it2.hasNext()) {
                                ((Runnable) it2.next()).run();
                            }
                            Runnable runnable = av0Var;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                    }
                }
            });
            alertDialog$Builder.o();
        } else {
            this.f46000e = z10;
            Iterator it = this.f46001f.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            if (av0Var != null) {
                av0Var.run();
            }
        }
        l();
    }
}
