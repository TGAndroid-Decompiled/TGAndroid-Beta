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
    public static final long f54968n = TimeUnit.DAYS.toMillis(366);
    public static volatile ScheduledExecutorService f54969o = null;
    public static final Object f54970p = new Object();
    public final Object f54971a;
    public final PowerManager.WakeLock f54972b;
    public int f54973c;
    public ScheduledFuture d;
    public long f54974e;
    public final HashSet f54975f;
    public boolean f54976g;
    public f8.a h;
    public final x6.a f54977i;
    public final String f54978j;
    public final HashMap f54979k;
    public final AtomicInteger f54980l;
    public final ScheduledExecutorService f54981m;

    public a(Context context) {
        String str;
        String packageName = context.getPackageName();
        this.f54971a = new Object();
        this.f54973c = 0;
        this.f54975f = new HashSet();
        this.f54976g = true;
        this.f54977i = x6.a.f58633a;
        this.f54979k = new HashMap();
        this.f54980l = new AtomicInteger(0);
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
            this.f54978j = str;
        } else {
            this.f54978j = "wake:com.google.firebase.iid.WakeLockHolder";
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            this.f54972b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
            if (f.b(context)) {
                int i7 = e.f58641a;
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
                        this.f54972b.setWorkSource(workSource);
                    } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e10) {
                        Log.wtf("WakeLock", e10.toString());
                    }
                }
            }
            ScheduledExecutorService scheduledExecutorService = f54969o;
            if (scheduledExecutorService == null) {
                synchronized (f54970p) {
                    try {
                        scheduledExecutorService = f54969o;
                        if (scheduledExecutorService == null) {
                            scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                            f54969o = scheduledExecutorService;
                        }
                    } finally {
                    }
                }
            }
            this.f54981m = scheduledExecutorService;
            return;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new RuntimeException(sb2.toString());
    }

    public final void a(long j3) {
        this.f54980l.incrementAndGet();
        long j10 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, f54968n), 1L);
        if (j3 > 0) {
            max = Math.min(j3, max);
        }
        synchronized (this.f54971a) {
            try {
                if (!b()) {
                    this.h = f8.a.f11466a;
                    this.f54972b.acquire();
                    this.f54977i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f54973c++;
                if (this.f54976g) {
                    TextUtils.isEmpty(null);
                }
                b bVar = (b) this.f54979k.get(null);
                b bVar2 = bVar;
                if (bVar == null) {
                    Object obj = new Object();
                    this.f54979k.put(null, obj);
                    bVar2 = obj;
                }
                bVar2.f54982a++;
                this.f54977i.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (Long.MAX_VALUE - elapsedRealtime > max) {
                    j10 = elapsedRealtime + max;
                }
                if (j10 > this.f54974e) {
                    this.f54974e = j10;
                    ScheduledFuture scheduledFuture = this.d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.d = this.f54981m.schedule(new et(this, 28), max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        boolean z9;
        synchronized (this.f54971a) {
            if (this.f54973c > 0) {
                z9 = true;
            } else {
                z9 = false;
            }
        }
        return z9;
    }

    public final void c() {
        if (this.f54980l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f54978j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f54971a) {
            try {
                if (this.f54976g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f54979k.containsKey(null)) {
                    b bVar = (b) this.f54979k.get(null);
                    if (bVar != null) {
                        int i7 = bVar.f54982a - 1;
                        bVar.f54982a = i7;
                        if (i7 == 0) {
                            this.f54979k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f54978j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f54975f;
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
        synchronized (this.f54971a) {
            try {
                if (!b()) {
                    return;
                }
                if (this.f54976g) {
                    int i7 = this.f54973c - 1;
                    this.f54973c = i7;
                    if (i7 > 0) {
                        return;
                    }
                } else {
                    this.f54973c = 0;
                }
                d();
                for (b bVar : this.f54979k.values()) {
                    bVar.f54982a = 0;
                }
                this.f54979k.clear();
                ScheduledFuture scheduledFuture = this.d;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.d = null;
                    this.f54974e = 0L;
                }
                if (this.f54972b.isHeld()) {
                    try {
                        this.f54972b.release();
                        if (this.h != null) {
                            this.h = null;
                        }
                    } catch (RuntimeException e10) {
                        if (e10.getClass().equals(RuntimeException.class)) {
                            Log.e("WakeLock", String.valueOf(this.f54978j).concat(" failed to release!"), e10);
                            if (this.h != null) {
                                this.h = null;
                            }
                        } else {
                            throw e10;
                        }
                    }
                } else {
                    Log.e("WakeLock", String.valueOf(this.f54978j).concat(" should be held!"));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
