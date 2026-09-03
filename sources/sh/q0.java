package sh;

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
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ie0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.pr0;
public final class q0 {
    public static final HashMap f47657g = new HashMap();
    public final Context f47658a;
    public final int f47659b;
    public final long f47660c;
    public boolean d;
    public boolean f47661e;
    public final HashSet f47662f;

    public q0(Context context, int i10, long j10) {
        HashSet hashSet = new HashSet();
        this.f47662f = hashSet;
        this.f47658a = context;
        this.f47659b = i10;
        this.f47660c = j10;
        SharedPreferences sharedPreferences = context.getSharedPreferences("botlocation_" + i10, 0);
        this.d = sharedPreferences.getBoolean(j10 + "_requested", false);
        boolean z4 = sharedPreferences.getBoolean(j10 + "_granted", false);
        this.f47661e = z4;
        if (z4 && !a()) {
            this.f47661e = false;
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
        f47657g.clear();
    }

    public static q0 e(Context context, int i10, long j10) {
        Pair pair = new Pair(Integer.valueOf(i10), Long.valueOf(j10));
        HashMap hashMap = f47657g;
        q0 q0Var = (q0) hashMap.get(pair);
        if (q0Var == null) {
            q0 q0Var2 = new q0(context, i10, j10);
            hashMap.put(pair, q0Var2);
            return q0Var2;
        }
        return q0Var;
    }

    public static JSONObject h(Location location) {
        boolean z4;
        JSONObject jSONObject = new JSONObject();
        if (location != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        try {
            jSONObject.put("available", z4);
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
        } catch (Exception e6) {
            FileLog.e(e6);
            return jSONObject;
        }
    }

    public final boolean a() {
        Activity f10 = f();
        if (Build.VERSION.SDK_INT >= 23) {
            if (f10 != null) {
                if (f10.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0 && f10.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0) {
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
        Activity activity = LaunchActivity.D1;
        if (activity == null) {
            activity = AndroidUtilities.findActivity(this.f47658a);
        }
        if (activity == null) {
            return AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
        }
        return activity;
    }

    public final boolean g() {
        if (a() && this.f47661e) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        Activity f10;
        if (Build.VERSION.SDK_INT < 23 || (f10 = f()) == null) {
            return false;
        }
        if (f10.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") && f10.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION")) {
            return false;
        }
        return true;
    }

    public final void j(final org.telegram.ui.web.s sVar) {
        Activity f10 = f();
        if (f10 == null) {
            return;
        }
        if (!d()) {
            Boolean bool = Boolean.FALSE;
            sVar.run(bool, bool);
        } else if (a() && (this.d || this.f47661e)) {
            sVar.run(Boolean.FALSE, Boolean.TRUE);
        } else {
            final boolean[] zArr = new boolean[1];
            int i10 = this.f47659b;
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(this.f47660c));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f10, 0, null);
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequest, UserObject.getUserName(user), UserObject.getUserName(user)));
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
            d2Var.Q = replaceTags;
            p0 p0Var = new p0(this.f47658a, UserConfig.getInstance(i10).getCurrentUser(), user);
            int w02 = k6.w0(null, k6.L5, false);
            d2Var.Y = p0Var;
            d2Var.Z = w02;
            if (!a() && i()) {
                alertDialog$Builder.k(LocaleController.getString(R.string.BotLocationPermissionSettings), new qh.l1(f10, zArr, sVar, 2));
            } else {
                alertDialog$Builder.k(LocaleController.getString(R.string.BotLocationPermissionAllow), new org.telegram.ui.ActionBar.c2(this) {
                    public final q0 f47576b;

                    {
                        this.f47576b = this;
                    }

                    @Override
                    public final void j(org.telegram.ui.ActionBar.d2 d2Var2, int i11) {
                        switch (r4) {
                            case 0:
                                q0 q0Var = this.f47576b;
                                q0Var.getClass();
                                zArr[0] = true;
                                boolean a2 = q0Var.a();
                                org.telegram.ui.web.s sVar2 = sVar;
                                if (!a2) {
                                    ie0.g(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new org.telegram.ui.web.a2(9, q0Var, sVar2));
                                    return;
                                }
                                q0Var.d = true;
                                q0Var.f47661e = true;
                                q0Var.l();
                                Iterator it = q0Var.f47662f.iterator();
                                while (it.hasNext()) {
                                    ((Runnable) it.next()).run();
                                }
                                Boolean bool2 = Boolean.TRUE;
                                sVar2.run(bool2, bool2);
                                return;
                            default:
                                q0 q0Var2 = this.f47576b;
                                q0Var2.getClass();
                                boolean[] zArr2 = zArr;
                                if (!zArr2[0]) {
                                    zArr2[0] = true;
                                    q0Var2.d = true;
                                    q0Var2.f47661e = false;
                                    q0Var2.l();
                                    Iterator it2 = q0Var2.f47662f.iterator();
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
            alertDialog$Builder.h(LocaleController.getString(R.string.BotLocationPermissionDecline), new org.telegram.ui.ActionBar.c2(this) {
                public final q0 f47576b;

                {
                    this.f47576b = this;
                }

                @Override
                public final void j(org.telegram.ui.ActionBar.d2 d2Var2, int i11) {
                    switch (r4) {
                        case 0:
                            q0 q0Var = this.f47576b;
                            q0Var.getClass();
                            zArr[0] = true;
                            boolean a2 = q0Var.a();
                            org.telegram.ui.web.s sVar2 = sVar;
                            if (!a2) {
                                ie0.g(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new org.telegram.ui.web.a2(9, q0Var, sVar2));
                                return;
                            }
                            q0Var.d = true;
                            q0Var.f47661e = true;
                            q0Var.l();
                            Iterator it = q0Var.f47662f.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                            Boolean bool2 = Boolean.TRUE;
                            sVar2.run(bool2, bool2);
                            return;
                        default:
                            q0 q0Var2 = this.f47576b;
                            q0Var2.getClass();
                            boolean[] zArr2 = zArr;
                            if (!zArr2[0]) {
                                zArr2[0] = true;
                                q0Var2.d = true;
                                q0Var2.f47661e = false;
                                q0Var2.l();
                                Iterator it2 = q0Var2.f47662f.iterator();
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
            alertDialog$Builder.j(new lh.i(this, zArr, sVar, 5));
            alertDialog$Builder.o();
        }
    }

    public final void k(Utilities.Callback callback) {
        JSONObject jSONObject = new JSONObject();
        if (this.f47661e && a() && d()) {
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
                Context context = LaunchActivity.D1;
                if (context == null) {
                    context = ApplicationLoader.applicationContext;
                }
                if (context != null) {
                    try {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                        alertDialog$Builder.m(R.raw.permission_request_location, 72, k6.w0(null, k6.L5, false), null);
                        alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.GpsDisabledAlertText);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Enable), new j3.o(context, 5));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.o();
                    } catch (Exception e6) {
                        FileLog.e(e6);
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
                } catch (Exception e10) {
                    FileLog.e(e10);
                    callback.run(h(null));
                    return;
                }
            }
        }
        try {
            jSONObject.put("available", false);
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        callback.run(jSONObject);
    }

    public final void l() {
        SharedPreferences.Editor edit = this.f47658a.getSharedPreferences("botlocation_" + this.f47659b, 0).edit();
        StringBuilder sb = new StringBuilder();
        long j10 = this.f47660c;
        edit.putBoolean(android.support.v4.media.a.q(sb, j10, "_granted"), this.f47661e);
        edit.putBoolean(j10 + "_requested", this.d);
        edit.apply();
    }

    public final void m(boolean z4, final pr0 pr0Var) {
        this.d = true;
        if (z4 && !a()) {
            Activity f10 = f();
            if (f10 == null) {
                return;
            }
            int i10 = this.f47659b;
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(this.f47660c));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f(), 0, null);
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequest, UserObject.getUserName(user), UserObject.getUserName(user)));
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
            d2Var.Q = replaceTags;
            p0 p0Var = new p0(this.f47658a, UserConfig.getInstance(i10).getCurrentUser(), user);
            int w02 = k6.w0(null, k6.L5, false);
            d2Var.Y = p0Var;
            d2Var.Z = w02;
            if (i()) {
                alertDialog$Builder.k(LocaleController.getString(R.string.BotLocationPermissionSettings), new org.telegram.ui.Components.voip.c2(f10, 1));
            } else {
                alertDialog$Builder.k(LocaleController.getString(R.string.BotLocationPermissionAllow), new org.telegram.ui.ActionBar.c2(this) {
                    public final q0 f47558b;

                    {
                        this.f47558b = this;
                    }

                    @Override
                    public final void j(org.telegram.ui.ActionBar.d2 d2Var2, int i11) {
                        switch (r3) {
                            case 0:
                                q0 q0Var = this.f47558b;
                                if (!q0Var.a()) {
                                    ie0.g(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new org.telegram.ui.web.a2(10, q0Var, pr0Var));
                                    return;
                                }
                                q0Var.d = true;
                                q0Var.f47661e = true;
                                q0Var.l();
                                Iterator it = q0Var.f47662f.iterator();
                                while (it.hasNext()) {
                                    ((Runnable) it.next()).run();
                                }
                                return;
                            default:
                                q0 q0Var2 = this.f47558b;
                                q0Var2.d = true;
                                q0Var2.f47661e = false;
                                q0Var2.l();
                                Iterator it2 = q0Var2.f47662f.iterator();
                                while (it2.hasNext()) {
                                    ((Runnable) it2.next()).run();
                                }
                                Runnable runnable = pr0Var;
                                if (runnable != null) {
                                    runnable.run();
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            alertDialog$Builder.h(LocaleController.getString(R.string.BotLocationPermissionDecline), new org.telegram.ui.ActionBar.c2(this) {
                public final q0 f47558b;

                {
                    this.f47558b = this;
                }

                @Override
                public final void j(org.telegram.ui.ActionBar.d2 d2Var2, int i11) {
                    switch (r3) {
                        case 0:
                            q0 q0Var = this.f47558b;
                            if (!q0Var.a()) {
                                ie0.g(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new org.telegram.ui.web.a2(10, q0Var, pr0Var));
                                return;
                            }
                            q0Var.d = true;
                            q0Var.f47661e = true;
                            q0Var.l();
                            Iterator it = q0Var.f47662f.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                            return;
                        default:
                            q0 q0Var2 = this.f47558b;
                            q0Var2.d = true;
                            q0Var2.f47661e = false;
                            q0Var2.l();
                            Iterator it2 = q0Var2.f47662f.iterator();
                            while (it2.hasNext()) {
                                ((Runnable) it2.next()).run();
                            }
                            Runnable runnable = pr0Var;
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
            this.f47661e = z4;
            Iterator it = this.f47662f.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            if (pr0Var != null) {
                pr0Var.run();
            }
        }
        l();
    }
}
