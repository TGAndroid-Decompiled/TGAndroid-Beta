package xh;

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
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.f8;
import org.telegram.messenger.i20;
import org.telegram.messenger.r20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.hr0;
import vh.i9;
import w7.c6;
public final class o0 {
    public static final HashMap f53951g = new HashMap();
    public final Context f53952a;
    public final int f53953b;
    public final long f53954c;
    public boolean d;
    public boolean e;
    public final HashSet f53955f;

    public o0(Context context, int i10, long j10) {
        HashSet hashSet = new HashSet();
        this.f53955f = hashSet;
        this.f53952a = context;
        this.f53953b = i10;
        this.f53954c = j10;
        SharedPreferences sharedPreferences = context.getSharedPreferences("botlocation_" + i10, 0);
        this.d = sharedPreferences.getBoolean(j10 + "_requested", false);
        boolean z10 = sharedPreferences.getBoolean(j10 + "_granted", false);
        this.e = z10;
        if (z10 && !a()) {
            this.e = false;
            this.d = false;
            k();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
    }

    public static void c() {
        Context context = org.telegram.messenger.w0.f18945b;
        if (context == null) {
            return;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            context.getSharedPreferences("botlocation_" + i10, 0).edit().clear().apply();
        }
        f53951g.clear();
    }

    public static o0 e(Context context, int i10, long j10) {
        Pair pair = new Pair(Integer.valueOf(i10), Long.valueOf(j10));
        HashMap hashMap = f53951g;
        o0 o0Var = (o0) hashMap.get(pair);
        if (o0Var == null) {
            o0 o0Var2 = new o0(context, i10, j10);
            hashMap.put(pair, o0Var2);
            return o0Var2;
        }
        return o0Var;
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
        } catch (Exception e) {
            f8.g(e, true);
            return jSONObject;
        }
    }

    public final boolean a() {
        Activity f7 = f();
        if (f7 != null) {
            if (f7.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0 || f7.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) {
                return true;
            }
            return false;
        }
        return false;
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
        Activity activity = LaunchActivity.I1;
        if (activity == null) {
            activity = org.telegram.messenger.i0.W(this.f53952a);
        }
        if (activity == null) {
            return org.telegram.messenger.i0.W(org.telegram.messenger.w0.f18945b);
        }
        return activity;
    }

    public final boolean g() {
        if (a() && this.e) {
            return true;
        }
        return false;
    }

    public final void i(final org.telegram.ui.web.o oVar) {
        Activity f7;
        Activity f10 = f();
        if (f10 == null) {
            return;
        }
        if (!d()) {
            Boolean bool = Boolean.FALSE;
            oVar.a(bool, bool);
        } else if (a() && (this.d || this.e)) {
            oVar.a(Boolean.FALSE, Boolean.TRUE);
        } else {
            final boolean[] zArr = new boolean[1];
            int i10 = this.f53953b;
            TLRPC.User Z1 = wp.r1(i10).Z1(Long.valueOf(this.f53954c));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f10, null);
            SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(dd.a0(null, null, 2131753057, i20.p(Z1), i20.p(Z1)));
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
            x1Var.T = W2;
            n0 n0Var = new n0(this.f53952a, e20.i(i10).f(), Z1);
            int i11 = t6.L5;
            int x02 = t6.x0(null, i11, false);
            x1Var.f21473b0 = n0Var;
            x1Var.f21476c0 = x02;
            x1Var.f21478d0 = -1;
            alertDialog$Builder.n(i11, null);
            if (!a() && (f7 = f()) != null && (!f7.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") || !f7.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION"))) {
                alertDialog$Builder.k(dd.L0(2131753053, null), new q5.a(f10, zArr, oVar, 12));
            } else {
                alertDialog$Builder.k(dd.L0(2131753059, null), new org.telegram.ui.ActionBar.u1(this) {
                    public final o0 f53870b;

                    {
                        this.f53870b = this;
                    }

                    @Override
                    public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i12) {
                        switch (r4) {
                            case 0:
                                o0 o0Var = this.f53870b;
                                o0Var.getClass();
                                zArr[0] = true;
                                boolean a2 = o0Var.a();
                                org.telegram.ui.web.o oVar2 = oVar;
                                if (!a2) {
                                    c6.e(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new rh.q2(12, o0Var, oVar2));
                                    return;
                                }
                                o0Var.d = true;
                                o0Var.e = true;
                                o0Var.k();
                                Iterator it = o0Var.f53955f.iterator();
                                while (it.hasNext()) {
                                    ((Runnable) it.next()).run();
                                }
                                Boolean bool2 = Boolean.TRUE;
                                oVar2.a(bool2, bool2);
                                return;
                            default:
                                o0 o0Var2 = this.f53870b;
                                o0Var2.getClass();
                                boolean[] zArr2 = zArr;
                                if (!zArr2[0]) {
                                    zArr2[0] = true;
                                    o0Var2.d = true;
                                    o0Var2.e = false;
                                    o0Var2.k();
                                    Iterator it2 = o0Var2.f53955f.iterator();
                                    while (it2.hasNext()) {
                                        ((Runnable) it2.next()).run();
                                    }
                                    oVar.a(Boolean.TRUE, Boolean.FALSE);
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            alertDialog$Builder.h(dd.L0(2131753058, null), new org.telegram.ui.ActionBar.u1(this) {
                public final o0 f53870b;

                {
                    this.f53870b = this;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i12) {
                    switch (r4) {
                        case 0:
                            o0 o0Var = this.f53870b;
                            o0Var.getClass();
                            zArr[0] = true;
                            boolean a2 = o0Var.a();
                            org.telegram.ui.web.o oVar2 = oVar;
                            if (!a2) {
                                c6.e(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new rh.q2(12, o0Var, oVar2));
                                return;
                            }
                            o0Var.d = true;
                            o0Var.e = true;
                            o0Var.k();
                            Iterator it = o0Var.f53955f.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                            Boolean bool2 = Boolean.TRUE;
                            oVar2.a(bool2, bool2);
                            return;
                        default:
                            o0 o0Var2 = this.f53870b;
                            o0Var2.getClass();
                            boolean[] zArr2 = zArr;
                            if (!zArr2[0]) {
                                zArr2[0] = true;
                                o0Var2.d = true;
                                o0Var2.e = false;
                                o0Var2.k();
                                Iterator it2 = o0Var2.f53955f.iterator();
                                while (it2.hasNext()) {
                                    ((Runnable) it2.next()).run();
                                }
                                oVar.a(Boolean.TRUE, Boolean.FALSE);
                                return;
                            }
                            return;
                    }
                }
            });
            alertDialog$Builder.j(new org.telegram.ui.Components.z1(this, zArr, oVar, 5));
            alertDialog$Builder.p();
        }
    }

    public final void j(r20 r20Var) {
        JSONObject jSONObject = new JSONObject();
        if (this.e && a() && d()) {
            LocationManager locationManager = (LocationManager) org.telegram.messenger.w0.f18945b.getSystemService("location");
            List<String> providers = locationManager.getProviders(true);
            Location location = null;
            for (int size = providers.size() - 1; size >= 0; size--) {
                location = locationManager.getLastKnownLocation(providers.get(size));
                if (location != null) {
                    break;
                }
            }
            if (location == null && !locationManager.isProviderEnabled("gps")) {
                Context context = LaunchActivity.I1;
                if (context == null) {
                    context = org.telegram.messenger.w0.f18945b;
                }
                if (context != null) {
                    try {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                        int i10 = t6.L5;
                        alertDialog$Builder.m(2131624117, 72, t6.x0(null, i10, false), null);
                        alertDialog$Builder.n(i10, null);
                        alertDialog$Builder.f20135a.T = dd.L0(2131749539, null);
                        alertDialog$Builder.k(dd.L0(2131751161, null), new i9(context, 1));
                        alertDialog$Builder.h(dd.L0(2131752589, null), null);
                        alertDialog$Builder.p();
                    } catch (Exception e) {
                        f8.g(e, true);
                    }
                }
                r20Var.a(h(null));
                return;
            } else if (location != null) {
                r20Var.a(h(location));
                return;
            } else {
                try {
                    m0 m0Var = new m0(this, locationManager, r0, r20Var);
                    LocationListener[] locationListenerArr = {m0Var};
                    locationManager.requestLocationUpdates("gps", 1L, 0.0f, m0Var);
                    return;
                } catch (Exception e7) {
                    f8.g(e7, true);
                    r20Var.a(h(null));
                    return;
                }
            }
        }
        try {
            jSONObject.put("available", false);
        } catch (Exception e10) {
            f8.g(e10, true);
        }
        r20Var.a(jSONObject);
    }

    public final void k() {
        SharedPreferences.Editor edit = this.f53952a.getSharedPreferences("botlocation_" + this.f53953b, 0).edit();
        StringBuilder sb2 = new StringBuilder();
        long j10 = this.f53954c;
        edit.putBoolean(a1.g.q(sb2, j10, "_granted"), this.e);
        edit.putBoolean(j10 + "_requested", this.d);
        edit.apply();
    }

    public final void l(boolean z10, final hr0 hr0Var) {
        this.d = true;
        if (z10 && !a()) {
            Activity f7 = f();
            if (f7 == null) {
                return;
            }
            int i10 = this.f53953b;
            TLRPC.User Z1 = wp.r1(i10).Z1(Long.valueOf(this.f53954c));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f(), null);
            SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(dd.a0(null, null, 2131753057, i20.p(Z1), i20.p(Z1)));
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
            x1Var.T = W2;
            n0 n0Var = new n0(this.f53952a, e20.i(i10).f(), Z1);
            int i11 = t6.L5;
            int x02 = t6.x0(null, i11, false);
            x1Var.f21473b0 = n0Var;
            x1Var.f21476c0 = x02;
            x1Var.f21478d0 = -1;
            alertDialog$Builder.n(i11, null);
            Activity f10 = f();
            if (f10 == null || (f10.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION") && f10.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION"))) {
                alertDialog$Builder.k(dd.L0(2131753059, null), new org.telegram.ui.ActionBar.u1(this) {
                    public final o0 f53858b;

                    {
                        this.f53858b = this;
                    }

                    @Override
                    public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i12) {
                        switch (r3) {
                            case 0:
                                o0 o0Var = this.f53858b;
                                if (!o0Var.a()) {
                                    c6.e(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new rh.q2(13, o0Var, hr0Var));
                                    return;
                                }
                                o0Var.d = true;
                                o0Var.e = true;
                                o0Var.k();
                                Iterator it = o0Var.f53955f.iterator();
                                while (it.hasNext()) {
                                    ((Runnable) it.next()).run();
                                }
                                return;
                            default:
                                o0 o0Var2 = this.f53858b;
                                o0Var2.d = true;
                                o0Var2.e = false;
                                o0Var2.k();
                                Iterator it2 = o0Var2.f53955f.iterator();
                                while (it2.hasNext()) {
                                    ((Runnable) it2.next()).run();
                                }
                                Runnable runnable = hr0Var;
                                if (runnable != null) {
                                    runnable.run();
                                    return;
                                }
                                return;
                        }
                    }
                });
            } else {
                alertDialog$Builder.k(dd.L0(2131753053, null), new org.telegram.ui.Components.voip.k1(f7, 1));
            }
            alertDialog$Builder.h(dd.L0(2131753058, null), new org.telegram.ui.ActionBar.u1(this) {
                public final o0 f53858b;

                {
                    this.f53858b = this;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i12) {
                    switch (r3) {
                        case 0:
                            o0 o0Var = this.f53858b;
                            if (!o0Var.a()) {
                                c6.e(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new rh.q2(13, o0Var, hr0Var));
                                return;
                            }
                            o0Var.d = true;
                            o0Var.e = true;
                            o0Var.k();
                            Iterator it = o0Var.f53955f.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                            return;
                        default:
                            o0 o0Var2 = this.f53858b;
                            o0Var2.d = true;
                            o0Var2.e = false;
                            o0Var2.k();
                            Iterator it2 = o0Var2.f53955f.iterator();
                            while (it2.hasNext()) {
                                ((Runnable) it2.next()).run();
                            }
                            Runnable runnable = hr0Var;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                    }
                }
            });
            alertDialog$Builder.p();
        } else {
            this.e = z10;
            Iterator it = this.f53955f.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            if (hr0Var != null) {
                hr0Var.run();
            }
        }
        k();
    }
}
