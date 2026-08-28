package x5;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.p0;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import m.t3;
public abstract class g implements com.google.android.gms.common.api.c {
    public static final u5.c[] P = new u5.c[0];
    public b A;
    public IInterface B;
    public final ArrayList C;
    public c0 D;
    public int E;
    public final m F;
    public final m G;
    public final int H;
    public final String I;
    public volatile String J;
    public u5.a K;
    public boolean L;
    public volatile f0 M;
    public final AtomicInteger N;
    public final Set O;
    public int f48913a;
    public long f48914b;
    public long f48915c;
    public int d;
    public long f48916e;
    public volatile String f48917f;
    public androidx.activity.o h;
    public final Context f48918n;
    public final Looper f48919r;
    public final j0 f48920s;
    public final a0 v;
    public final Object f48921w;
    public final Object f48922x;
    public y f48923y;

    public g(Context context, Looper looper, int i9, t3 t3Var, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar, int i10) {
        synchronized (j0.f48943g) {
            try {
                if (j0.h == null) {
                    j0.h = new j0(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        j0 j0Var = j0.h;
        Object obj = u5.d.f48108c;
        l.h(kVar);
        l.h(lVar);
        m mVar = new m(kVar);
        m mVar2 = new m(lVar);
        Object obj2 = u5.d.f48108c;
        this.f48917f = null;
        this.f48921w = new Object();
        this.f48922x = new Object();
        this.C = new ArrayList();
        this.E = 1;
        this.K = null;
        this.L = false;
        this.M = null;
        this.N = new AtomicInteger(0);
        l.i(context, "Context must not be null");
        this.f48918n = context;
        l.i(looper, "Looper must not be null");
        this.f48919r = looper;
        l.i(j0Var, "Supervisor must not be null");
        this.f48920s = j0Var;
        this.v = new a0(this, looper);
        this.H = i9;
        this.F = mVar;
        this.G = mVar2;
        this.I = (String) t3Var.f17101e;
        Set<Scope> set = (Set) t3Var.f17099b;
        for (Scope scope : set) {
            if (!set.contains(scope)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.O = set;
    }

    public static void D(g gVar) {
        int i9;
        int i10;
        synchronized (gVar.f48921w) {
            i9 = gVar.E;
        }
        if (i9 == 3) {
            gVar.L = true;
            i10 = 5;
        } else {
            i10 = 4;
        }
        a0 a0Var = gVar.v;
        a0Var.sendMessage(a0Var.obtainMessage(i10, gVar.N.get(), 16));
    }

    public static boolean E(g gVar, int i9, int i10, IInterface iInterface) {
        synchronized (gVar.f48921w) {
            try {
                if (gVar.E != i9) {
                    return false;
                }
                gVar.F(i10, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void A(int i9) {
        this.f48913a = i9;
        this.f48914b = System.currentTimeMillis();
    }

    public void B(int i9, IBinder iBinder, Bundle bundle, int i10) {
        d0 d0Var = new d0(this, i9, iBinder, bundle);
        a0 a0Var = this.v;
        a0Var.sendMessage(a0Var.obtainMessage(1, i10, -1, d0Var));
    }

    public boolean C() {
        return this instanceof l5.a;
    }

    public final void F(int i9, IInterface iInterface) {
        boolean z10;
        boolean z11;
        androidx.activity.o oVar;
        boolean z12 = false;
        if (i9 != 4) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (iInterface == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z10 == z11) {
            z12 = true;
        }
        l.b(z12);
        synchronized (this.f48921w) {
            try {
                this.E = i9;
                this.B = iInterface;
                Bundle bundle = null;
                if (i9 != 1) {
                    if (i9 != 2 && i9 != 3) {
                        if (i9 == 4) {
                            l.h(iInterface);
                            IInterface iInterface2 = iInterface;
                            this.f48915c = System.currentTimeMillis();
                        }
                    } else {
                        c0 c0Var = this.D;
                        if (c0Var != null && (oVar = this.h) != null) {
                            Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + ((String) oVar.f388b) + " on " + ((String) oVar.f389c));
                            j0 j0Var = this.f48920s;
                            String str = (String) this.h.f388b;
                            l.h(str);
                            String str2 = (String) this.h.f389c;
                            if (this.I == null) {
                                this.f48918n.getClass();
                            }
                            j0Var.c(str, str2, c0Var, this.h.f387a);
                            this.N.incrementAndGet();
                        }
                        c0 c0Var2 = new c0(this, this.N.get());
                        this.D = c0Var2;
                        String x10 = x();
                        String w8 = w();
                        boolean y10 = y();
                        ?? obj = new Object();
                        obj.f389c = x10;
                        obj.f388b = w8;
                        obj.f387a = y10;
                        this.h = obj;
                        if (y10 && l() < 17895000) {
                            throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf((String) this.h.f388b)));
                        }
                        j0 j0Var2 = this.f48920s;
                        String str3 = (String) this.h.f388b;
                        l.h(str3);
                        String str4 = (String) this.h.f389c;
                        String str5 = this.I;
                        if (str5 == null) {
                            str5 = this.f48918n.getClass().getName();
                        }
                        u5.a b10 = j0Var2.b(new g0(str3, str4, this.h.f387a), c0Var2, str5);
                        if (!b10.c()) {
                            androidx.activity.o oVar2 = this.h;
                            Log.w("GmsClient", "unable to connect to service: " + ((String) oVar2.f388b) + " on " + ((String) oVar2.f389c));
                            int i10 = b10.f48100b;
                            if (i10 == -1) {
                                i10 = 16;
                            }
                            if (b10.f48101c != null) {
                                bundle = new Bundle();
                                bundle.putParcelable("pendingIntent", b10.f48101c);
                            }
                            int i11 = this.N.get();
                            e0 e0Var = new e0(this, i10, bundle);
                            a0 a0Var = this.v;
                            a0Var.sendMessage(a0Var.obtainMessage(7, i11, -1, e0Var));
                        }
                    }
                } else {
                    c0 c0Var3 = this.D;
                    if (c0Var3 != null) {
                        j0 j0Var3 = this.f48920s;
                        String str6 = (String) this.h.f388b;
                        l.h(str6);
                        String str7 = (String) this.h.f389c;
                        if (this.I == null) {
                            this.f48918n.getClass();
                        }
                        j0Var3.c(str6, str7, c0Var3, this.h.f387a);
                        this.D = null;
                    }
                }
            } finally {
            }
        }
    }

    @Override
    public boolean a() {
        return this instanceof k5.e;
    }

    @Override
    public final Set b() {
        if (p()) {
            return this.O;
        }
        return Collections.EMPTY_SET;
    }

    @Override
    public final void c(h hVar, Set set) {
        String str;
        Bundle t10 = t();
        if (Build.VERSION.SDK_INT < 31) {
            str = this.J;
        } else {
            str = this.J;
        }
        String str2 = str;
        int i9 = this.H;
        int i10 = u5.e.f48109a;
        Scope[] scopeArr = f.A;
        Bundle bundle = new Bundle();
        u5.c[] cVarArr = f.B;
        f fVar = new f(6, i9, i10, null, null, scopeArr, bundle, null, cVarArr, cVarArr, true, 0, false, str2);
        fVar.d = this.f48918n.getPackageName();
        fVar.h = t10;
        if (set != null) {
            fVar.f48903f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (p()) {
            fVar.f48904n = new Account("<<default account>>", "com.google");
            if (hVar != null) {
                fVar.f48902e = hVar.asBinder();
            }
        } else if (this instanceof o7.b) {
            fVar.f48904n = null;
        }
        fVar.f48905r = P;
        fVar.f48906s = r();
        if (C()) {
            fVar.f48908x = true;
        }
        try {
            synchronized (this.f48922x) {
                try {
                    y yVar = this.f48923y;
                    if (yVar != null) {
                        yVar.E0(new b0(this, this.N.get()), fVar);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e10) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
            int i11 = this.N.get();
            a0 a0Var = this.v;
            a0Var.sendMessage(a0Var.obtainMessage(6, i11, 3));
        } catch (RemoteException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            B(8, null, null, this.N.get());
        } catch (SecurityException e12) {
            throw e12;
        } catch (RuntimeException e13) {
            e = e13;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            B(8, null, null, this.N.get());
        }
    }

    @Override
    public final void d(String str) {
        this.f48917f = str;
        disconnect();
    }

    @Override
    public void disconnect() {
        this.N.incrementAndGet();
        synchronized (this.C) {
            try {
                int size = this.C.size();
                for (int i9 = 0; i9 < size; i9++) {
                    ((w) this.C.get(i9)).c();
                }
                this.C.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f48922x) {
            this.f48923y = null;
        }
        F(1, null);
    }

    @Override
    public void e(b bVar) {
        l.i(bVar, "Connection progress callbacks cannot be null.");
        this.A = bVar;
        F(2, null);
    }

    @Override
    public final boolean f() {
        boolean z10;
        synchronized (this.f48921w) {
            int i9 = this.E;
            z10 = true;
            if (i9 != 2 && i9 != 3) {
                z10 = false;
            }
        }
        return z10;
    }

    @Override
    public final void g(String str, PrintWriter printWriter) {
        int i9;
        IInterface iInterface;
        y yVar;
        synchronized (this.f48921w) {
            i9 = this.E;
            iInterface = this.B;
        }
        synchronized (this.f48922x) {
            yVar = this.f48923y;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 != 4) {
                        if (i9 != 5) {
                            printWriter.print("UNKNOWN");
                        } else {
                            printWriter.print("DISCONNECTING");
                        }
                    } else {
                        printWriter.print("CONNECTED");
                    }
                } else {
                    printWriter.print("LOCAL_CONNECTING");
                }
            } else {
                printWriter.print("REMOTE_CONNECTING");
            }
        } else {
            printWriter.print("DISCONNECTED");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) v()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (yVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(yVar.f48992a)));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f48915c > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j10 = this.f48915c;
            String format = simpleDateFormat.format(new Date(j10));
            append.println(j10 + " " + format);
        }
        if (this.f48914b > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i10 = this.f48913a;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        printWriter.append((CharSequence) String.valueOf(i10));
                    } else {
                        printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
                    }
                } else {
                    printWriter.append("CAUSE_NETWORK_LOST");
                }
            } else {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j11 = this.f48914b;
            String format2 = simpleDateFormat.format(new Date(j11));
            append2.println(j11 + " " + format2);
        }
        if (this.f48916e > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) h8.j.a(this.d));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j12 = this.f48916e;
            String format3 = simpleDateFormat.format(new Date(j12));
            append3.println(j12 + " " + format3);
        }
    }

    @Override
    public final String h() {
        androidx.activity.o oVar;
        if (i() && (oVar = this.h) != null) {
            return (String) oVar.f389c;
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    @Override
    public final boolean i() {
        boolean z10;
        synchronized (this.f48921w) {
            if (this.E == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @Override
    public final void j(xa.c cVar) {
        ((p0) cVar.f49099b).f2885o.f2825x.post(new androidx.activity.i(cVar, 14));
    }

    @Override
    public boolean k() {
        return true;
    }

    @Override
    public abstract int l();

    @Override
    public final u5.c[] m() {
        f0 f0Var = this.M;
        if (f0Var == null) {
            return null;
        }
        return f0Var.f48911b;
    }

    @Override
    public final String n() {
        return this.f48917f;
    }

    @Override
    public Intent o() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    @Override
    public boolean p() {
        return false;
    }

    public abstract IInterface q(IBinder iBinder);

    public u5.c[] r() {
        return P;
    }

    public Bundle s() {
        return null;
    }

    public Bundle t() {
        return new Bundle();
    }

    public final IInterface u() {
        IInterface iInterface;
        synchronized (this.f48921w) {
            try {
                if (this.E != 5) {
                    if (i()) {
                        IInterface iInterface2 = this.B;
                        l.i(iInterface2, "Client is connected but service is null");
                        iInterface = iInterface2;
                    } else {
                        throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                    }
                } else {
                    throw new DeadObjectException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String v();

    public abstract String w();

    public String x() {
        return "com.google.android.gms";
    }

    public boolean y() {
        if (l() >= 211700000) {
            return true;
        }
        return false;
    }

    public void z(u5.a aVar) {
        this.d = aVar.f48100b;
        this.f48916e = System.currentTimeMillis();
    }
}
