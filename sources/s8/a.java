package s8;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.ui.Components.et;
import q6.m;
import x6.e;
import x6.f;
public final class a {
    public static final long f54981n = TimeUnit.DAYS.toMillis(366);
    public static volatile ScheduledExecutorService f54982o = null;
    public static final Object f54983p = new Object();
    public final Object f54984a;
    public final PowerManager.WakeLock f54985b;
    public int f54986c;
    public ScheduledFuture d;
    public long f54987e;
    public final HashSet f54988f;
    public boolean f54989g;
    public f8.a h;
    public final x6.a f54990i;
    public final String f54991j;
    public final HashMap f54992k;
    public final AtomicInteger f54993l;
    public final ScheduledExecutorService f54994m;

    public a(Context context) {
        String str;
        String packageName = context.getPackageName();
        this.f54984a = new Object();
        this.f54986c = 0;
        this.f54988f = new HashSet();
        this.f54989g = true;
        this.f54990i = x6.a.f58643a;
        this.f54992k = new HashMap();
        this.f54993l = new AtomicInteger(0);
        m.f("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.h = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            if ("wake:com.google.firebase.iid.WakeLockHolder".length() != 0) {
                str = "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder");
            } else {
                str = new String("*gcore*:");
            }
            this.f54991j = str;
        } else {
            this.f54991j = "wake:com.google.firebase.iid.WakeLockHolder";
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            this.f54985b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
            if (f.b(context)) {
                int i7 = e.f58651a;
                packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
                if (context.getPackageManager() != null && packageName != null) {
                    try {
                        ApplicationInfo applicationInfo = z6.b.a(context).f2020a.getPackageManager().getApplicationInfo(packageName, 0);
                        if (applicationInfo == null) {
                            Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                        } else {
                            int i10 = applicationInfo.uid;
                            workSource = new WorkSource();
                            f.a(workSource, i10, packageName);
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        Log.e("WorkSourceUtil", "Could not find package: ".concat(packageName));
                    }
                }
                if (workSource != null) {
                    try {
                        this.f54985b.setWorkSource(workSource);
                    } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e10) {
                        Log.wtf("WakeLock", e10.toString());
                    }
                }
            }
            ScheduledExecutorService scheduledExecutorService = f54982o;
            if (scheduledExecutorService == null) {
                synchronized (f54983p) {
                    try {
                        scheduledExecutorService = f54982o;
                        if (scheduledExecutorService == null) {
                            scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                            f54982o = scheduledExecutorService;
                        }
                    } finally {
                    }
                }
            }
            this.f54994m = scheduledExecutorService;
            return;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new RuntimeException(sb2.toString());
    }

    public final void a(long j3) {
        this.f54993l.incrementAndGet();
        long j10 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, f54981n), 1L);
        if (j3 > 0) {
            max = Math.min(j3, max);
        }
        synchronized (this.f54984a) {
            try {
                if (!b()) {
                    this.h = f8.a.f11466a;
                    this.f54985b.acquire();
                    this.f54990i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f54986c++;
                if (this.f54989g) {
                    TextUtils.isEmpty(null);
                }
                b bVar = (b) this.f54992k.get(null);
                b bVar2 = bVar;
                if (bVar == null) {
                    Object obj = new Object();
                    this.f54992k.put(null, obj);
                    bVar2 = obj;
                }
                bVar2.f54995a++;
                this.f54990i.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (Long.MAX_VALUE - elapsedRealtime > max) {
                    j10 = elapsedRealtime + max;
                }
                if (j10 > this.f54987e) {
                    this.f54987e = j10;
                    ScheduledFuture scheduledFuture = this.d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.d = this.f54994m.schedule(new et(this, 28), max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        boolean z9;
        synchronized (this.f54984a) {
            if (this.f54986c > 0) {
                z9 = true;
            } else {
                z9 = false;
            }
        }
        return z9;
    }

    public final void c() {
        if (this.f54993l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f54991j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f54984a) {
            try {
                if (this.f54989g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f54992k.containsKey(null)) {
                    b bVar = (b) this.f54992k.get(null);
                    if (bVar != null) {
                        int i7 = bVar.f54995a - 1;
                        bVar.f54995a = i7;
                        if (i7 == 0) {
                            this.f54992k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f54991j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f54988f;
        if (!hashSet.isEmpty()) {
            ArrayList arrayList = new ArrayList(hashSet);
            hashSet.clear();
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final void e() {
        synchronized (this.f54984a) {
            try {
                if (!b()) {
                    return;
                }
                if (this.f54989g) {
                    int i7 = this.f54986c - 1;
                    this.f54986c = i7;
                    if (i7 > 0) {
                        return;
                    }
                } else {
                    this.f54986c = 0;
                }
                d();
                for (b bVar : this.f54992k.values()) {
                    bVar.f54995a = 0;
                }
                this.f54992k.clear();
                ScheduledFuture scheduledFuture = this.d;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.d = null;
                    this.f54987e = 0L;
                }
                if (this.f54985b.isHeld()) {
                    try {
                        this.f54985b.release();
                        if (this.h != null) {
                            this.h = null;
                        }
                    } catch (RuntimeException e10) {
                        if (e10.getClass().equals(RuntimeException.class)) {
                            Log.e("WakeLock", String.valueOf(this.f54991j).concat(" failed to release!"), e10);
                            if (this.h != null) {
                                this.h = null;
                            }
                        } else {
                            throw e10;
                        }
                    }
                } else {
                    Log.e("WakeLock", String.valueOf(this.f54991j).concat(" should be held!"));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
