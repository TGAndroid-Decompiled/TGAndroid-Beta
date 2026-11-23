package q6;

import a8.k8;
import android.accounts.Account;
import android.content.AttributionSource;
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
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.ui.Components.nd0;
public abstract class d {
    public static final n6.c[] D = new n6.c[0];
    public boolean A;
    public volatile h0 B;
    public final AtomicInteger C;
    public int f55983a;
    public long f55984b;
    public long f55985c;
    public int d;
    public long f55986e;
    public volatile String f55987f;
    public androidx.activity.n f55988g;
    public final Context h;
    public final Looper f55989i;
    public final l0 f55990j;
    public final c0 f55991k;
    public final Object f55992l;
    public final Object f55993m;
    public z f55994n;
    public b f55995o;
    public IInterface f55996p;
    public final ArrayList f55997q;
    public e0 f55998r;
    public int f55999s;
    public final n f56000t;
    public final n f56001u;
    public final int v;
    public final String f56002w;
    public volatile String f56003x;
    public volatile nd0 f56004y;
    public n6.a f56005z;

    public d(Context context, Looper looper, l0 l0Var, int i7, n nVar, n nVar2, String str) {
        Object obj = n6.d.d;
        this.f55987f = null;
        this.f55992l = new Object();
        this.f55993m = new Object();
        this.f55997q = new ArrayList();
        this.f55999s = 1;
        this.f56005z = null;
        this.A = false;
        this.B = null;
        this.C = new AtomicInteger(0);
        m.i(context, "Context must not be null");
        this.h = context;
        m.i(looper, "Looper must not be null");
        this.f55989i = looper;
        m.i(l0Var, "Supervisor must not be null");
        this.f55990j = l0Var;
        this.f55991k = new c0(this, looper);
        this.v = i7;
        this.f56000t = nVar;
        this.f56001u = nVar2;
        this.f56002w = str;
    }

    public final void A(int i7, IInterface iInterface) {
        boolean z10;
        boolean z11;
        androidx.activity.n nVar;
        boolean z12 = false;
        if (i7 != 4) {
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
        m.b(z12);
        synchronized (this.f55992l) {
            try {
                this.f55999s = i7;
                this.f55996p = iInterface;
                Bundle bundle = null;
                if (i7 != 1) {
                    if (i7 != 2 && i7 != 3) {
                        if (i7 == 4) {
                            m.h(iInterface);
                            IInterface iInterface2 = iInterface;
                            this.f55985c = System.currentTimeMillis();
                        }
                    } else {
                        e0 e0Var = this.f55998r;
                        if (e0Var != null && (nVar = this.f55988g) != null) {
                            String str = (String) nVar.f1760c;
                            String str2 = (String) nVar.d;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 70 + String.valueOf(str2).length());
                            sb2.append("Calling connect() while still connected, missing disconnect() for ");
                            sb2.append(str);
                            sb2.append(" on ");
                            sb2.append(str2);
                            Log.e("GmsClient", sb2.toString());
                            l0 l0Var = this.f55990j;
                            String str3 = (String) this.f55988g.f1760c;
                            m.h(str3);
                            String str4 = (String) this.f55988g.d;
                            if (this.f56002w == null) {
                                this.h.getClass();
                            }
                            l0Var.c(str3, str4, e0Var, this.f55988g.f1759b);
                            this.C.incrementAndGet();
                        }
                        e0 e0Var2 = new e0(this, this.C.get());
                        this.f55998r = e0Var2;
                        String q10 = q();
                        String p10 = p();
                        boolean r10 = r();
                        this.f55988g = new androidx.activity.n(q10, p10, r10);
                        if (r10 && d() < 17895000) {
                            throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf((String) this.f55988g.f1760c)));
                        }
                        l0 l0Var2 = this.f55990j;
                        String str5 = (String) this.f55988g.f1760c;
                        m.h(str5);
                        String str6 = (String) this.f55988g.d;
                        String str7 = this.f56002w;
                        if (str7 == null) {
                            str7 = this.h.getClass().getName();
                        }
                        n6.a b10 = l0Var2.b(new i0(str5, str6, this.f55988g.f1759b), e0Var2, str7);
                        if (!b10.c()) {
                            androidx.activity.n nVar2 = this.f55988g;
                            String str8 = (String) nVar2.f1760c;
                            String str9 = (String) nVar2.d;
                            StringBuilder sb3 = new StringBuilder(String.valueOf(str8).length() + 34 + String.valueOf(str9).length());
                            sb3.append("unable to connect to service: ");
                            sb3.append(str8);
                            sb3.append(" on ");
                            sb3.append(str9);
                            Log.w("GmsClient", sb3.toString());
                            int i10 = b10.f21515b;
                            if (i10 == -1) {
                                i10 = 16;
                            }
                            if (b10.f21516c != null) {
                                bundle = new Bundle();
                                bundle.putParcelable("pendingIntent", b10.f21516c);
                            }
                            int i11 = this.C.get();
                            g0 g0Var = new g0(this, i10, bundle);
                            c0 c0Var = this.f55991k;
                            c0Var.sendMessage(c0Var.obtainMessage(7, i11, -1, g0Var));
                        }
                    }
                } else {
                    e0 e0Var3 = this.f55998r;
                    if (e0Var3 != null) {
                        l0 l0Var3 = this.f55990j;
                        String str10 = (String) this.f55988g.f1760c;
                        m.h(str10);
                        String str11 = (String) this.f55988g.d;
                        if (this.f56002w == null) {
                            this.h.getClass();
                        }
                        l0Var3.c(str10, str11, e0Var3, this.f55988g.f1759b);
                        this.f55998r = null;
                    }
                }
            } finally {
            }
        }
    }

    public void a() {
        this.C.incrementAndGet();
        ArrayList arrayList = this.f55997q;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((y) arrayList.get(i7)).d();
                }
                arrayList.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.f55993m) {
            this.f55994n = null;
        }
        A(1, null);
    }

    public void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i7;
        IInterface iInterface;
        z zVar;
        long j3;
        synchronized (this.f55992l) {
            i7 = this.f55999s;
            iInterface = this.f55996p;
        }
        synchronized (this.f55993m) {
            zVar = this.f55994n;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 != 5) {
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
            printWriter.append((CharSequence) o()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (zVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(zVar.f56103a)));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f55985c > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j10 = this.f55985c;
            String format = simpleDateFormat.format(new Date(j10));
            j3 = 0;
            StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 1 + String.valueOf(format).length());
            sb2.append(j10);
            sb2.append(" ");
            sb2.append(format);
            append.println(sb2.toString());
        } else {
            j3 = 0;
        }
        if (this.f55984b > j3) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i10 = this.f55983a;
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
            long j11 = this.f55984b;
            String format2 = simpleDateFormat.format(new Date(j11));
            StringBuilder sb3 = new StringBuilder(String.valueOf(j11).length() + 1 + String.valueOf(format2).length());
            sb3.append(j11);
            sb3.append(" ");
            sb3.append(format2);
            append2.println(sb3.toString());
        }
        if (this.f55986e > j3) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) k8.a(this.d));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j12 = this.f55986e;
            String format3 = simpleDateFormat.format(new Date(j12));
            StringBuilder sb4 = new StringBuilder(String.valueOf(j12).length() + 1 + String.valueOf(format3).length());
            sb4.append(j12);
            sb4.append(" ");
            sb4.append(format3);
            append3.println(sb4.toString());
        }
    }

    public boolean c() {
        return true;
    }

    public abstract int d();

    public Intent e() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public boolean f() {
        return false;
    }

    public void g(i iVar, Set set) {
        String attributionTag;
        Bundle m10 = m();
        if (Build.VERSION.SDK_INT < 31) {
            attributionTag = this.f56003x;
        } else if (this.f56004y == null) {
            attributionTag = this.f56003x;
        } else {
            AttributionSource attributionSource = (AttributionSource) this.f56004y.f37766b;
            if (attributionSource == null) {
                attributionTag = this.f56003x;
            } else if (attributionSource.getAttributionTag() == null) {
                attributionTag = this.f56003x;
            } else {
                attributionTag = attributionSource.getAttributionTag();
            }
        }
        String str = attributionTag;
        int i7 = this.v;
        int i10 = n6.e.f21526a;
        Scope[] scopeArr = g.F;
        Bundle bundle = new Bundle();
        n6.c[] cVarArr = g.G;
        g gVar = new g(6, i7, i10, null, null, scopeArr, bundle, null, cVarArr, cVarArr, true, 0, false, str);
        gVar.d = this.h.getPackageName();
        gVar.h = m10;
        if (set != null) {
            gVar.f56022f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (f()) {
            gVar.f56023n = new Account("<<default account>>", "com.google");
            if (iVar != null) {
                gVar.f56021e = iVar.asBinder();
            }
        } else if (this instanceof h8.b) {
            gVar.f56023n = null;
        }
        gVar.f56024r = D;
        gVar.f56025s = k();
        if (x()) {
            gVar.f56028y = true;
        }
        try {
            synchronized (this.f55993m) {
                try {
                    z zVar = this.f55994n;
                    if (zVar != null) {
                        zVar.h1(new d0(this, this.C.get()), gVar);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e10) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
            int i11 = this.C.get();
            c0 c0Var = this.f55991k;
            c0Var.sendMessage(c0Var.obtainMessage(6, i11, 3));
        } catch (RemoteException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            w(8, null, null, this.C.get());
        } catch (SecurityException e12) {
            throw e12;
        } catch (RuntimeException e13) {
            e = e13;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            w(8, null, null, this.C.get());
        }
    }

    public void h(b bVar) {
        m.i(bVar, "Connection progress callbacks cannot be null.");
        this.f55995o = bVar;
        A(2, null);
    }

    public abstract IInterface i(IBinder iBinder);

    public final void j(String str) {
        this.f55987f = str;
        a();
    }

    public n6.c[] k() {
        return D;
    }

    public Bundle l() {
        return null;
    }

    public Bundle m() {
        return new Bundle();
    }

    public final IInterface n() {
        IInterface iInterface;
        synchronized (this.f55992l) {
            try {
                if (this.f55999s != 5) {
                    if (s()) {
                        IInterface iInterface2 = this.f55996p;
                        m.i(iInterface2, "Client is connected but service is null");
                        iInterface = iInterface2;
                    } else {
                        throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                    }
                } else {
                    throw new DeadObjectException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iInterface;
    }

    public abstract String o();

    public abstract String p();

    public String q() {
        return "com.google.android.gms";
    }

    public boolean r() {
        if (d() >= 211700000) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        boolean z10;
        synchronized (this.f55992l) {
            if (this.f55999s == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final boolean t() {
        boolean z10;
        synchronized (this.f55992l) {
            int i7 = this.f55999s;
            z10 = true;
            if (i7 != 2 && i7 != 3) {
                z10 = false;
            }
        }
        return z10;
    }

    public void u(n6.a aVar) {
        this.d = aVar.f21515b;
        this.f55986e = System.currentTimeMillis();
    }

    public void v(int i7) {
        this.f55983a = i7;
        this.f55984b = System.currentTimeMillis();
    }

    public void w(int i7, IBinder iBinder, Bundle bundle, int i10) {
        f0 f0Var = new f0(this, i7, iBinder, bundle);
        c0 c0Var = this.f55991k;
        c0Var.sendMessage(c0Var.obtainMessage(1, i10, -1, f0Var));
    }

    public boolean x() {
        return this instanceof e6.a;
    }

    public final boolean y(int i7, int i10, IInterface iInterface) {
        synchronized (this.f55992l) {
            try {
                if (this.f55999s != i7) {
                    return false;
                }
                A(i10, iInterface);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void z() {
        int i7;
        int i10;
        synchronized (this.f55992l) {
            i7 = this.f55999s;
        }
        if (i7 == 3) {
            this.A = true;
            i10 = 5;
        } else {
            i10 = 4;
        }
        c0 c0Var = this.f55991k;
        c0Var.sendMessage(c0Var.obtainMessage(i10, this.C.get(), 16));
    }
}
