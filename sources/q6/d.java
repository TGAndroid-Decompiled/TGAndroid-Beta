package q6;

import a8.i8;
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
public abstract class d {
    public static final n6.c[] D = new n6.c[0];
    public boolean A;
    public volatile h0 B;
    public final AtomicInteger C;
    public int f53850a;
    public long f53851b;
    public long f53852c;
    public int d;
    public long f53853e;
    public volatile String f53854f;
    public androidx.activity.n f53855g;
    public final Context h;
    public final Looper f53856i;
    public final l0 f53857j;
    public final c0 f53858k;
    public final Object f53859l;
    public final Object f53860m;
    public z f53861n;
    public b f53862o;
    public IInterface f53863p;
    public final ArrayList f53864q;
    public e0 f53865r;
    public int f53866s;
    public final n f53867t;
    public final n f53868u;
    public final int v;
    public final String f53869w;
    public volatile String f53870x;
    public volatile z2.d f53871y;
    public n6.a f53872z;

    public d(Context context, Looper looper, l0 l0Var, int i7, n nVar, n nVar2, String str) {
        Object obj = n6.d.d;
        this.f53854f = null;
        this.f53859l = new Object();
        this.f53860m = new Object();
        this.f53864q = new ArrayList();
        this.f53866s = 1;
        this.f53872z = null;
        this.A = false;
        this.B = null;
        this.C = new AtomicInteger(0);
        m.h(context, "Context must not be null");
        this.h = context;
        m.h(looper, "Looper must not be null");
        this.f53856i = looper;
        m.h(l0Var, "Supervisor must not be null");
        this.f53857j = l0Var;
        this.f53858k = new c0(this, looper);
        this.v = i7;
        this.f53867t = nVar;
        this.f53868u = nVar2;
        this.f53869w = str;
    }

    public final void A(int i7, IInterface iInterface) {
        boolean z9;
        boolean z10;
        androidx.activity.n nVar;
        boolean z11 = false;
        if (i7 != 4) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (iInterface == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z9 == z10) {
            z11 = true;
        }
        m.b(z11);
        synchronized (this.f53859l) {
            try {
                this.f53866s = i7;
                this.f53863p = iInterface;
                Bundle bundle = null;
                if (i7 != 1) {
                    if (i7 != 2 && i7 != 3) {
                        if (i7 == 4) {
                            m.g(iInterface);
                            IInterface iInterface2 = iInterface;
                            this.f53852c = System.currentTimeMillis();
                        }
                    } else {
                        e0 e0Var = this.f53865r;
                        if (e0Var != null && (nVar = this.f53855g) != null) {
                            String str = (String) nVar.f1847c;
                            String str2 = (String) nVar.d;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 70 + String.valueOf(str2).length());
                            sb2.append("Calling connect() while still connected, missing disconnect() for ");
                            sb2.append(str);
                            sb2.append(" on ");
                            sb2.append(str2);
                            Log.e("GmsClient", sb2.toString());
                            l0 l0Var = this.f53857j;
                            String str3 = (String) this.f53855g.f1847c;
                            m.g(str3);
                            String str4 = (String) this.f53855g.d;
                            if (this.f53869w == null) {
                                this.h.getClass();
                            }
                            l0Var.c(str3, str4, e0Var, this.f53855g.f1846b);
                            this.C.incrementAndGet();
                        }
                        e0 e0Var2 = new e0(this, this.C.get());
                        this.f53865r = e0Var2;
                        String q10 = q();
                        String p10 = p();
                        boolean r10 = r();
                        this.f53855g = new androidx.activity.n(q10, p10, r10);
                        if (r10 && d() < 17895000) {
                            throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf((String) this.f53855g.f1847c)));
                        }
                        l0 l0Var2 = this.f53857j;
                        String str5 = (String) this.f53855g.f1847c;
                        m.g(str5);
                        String str6 = (String) this.f53855g.d;
                        String str7 = this.f53869w;
                        if (str7 == null) {
                            str7 = this.h.getClass().getName();
                        }
                        n6.a b10 = l0Var2.b(new i0(str5, str6, this.f53855g.f1846b), e0Var2, str7);
                        if (!b10.c()) {
                            androidx.activity.n nVar2 = this.f53855g;
                            String str8 = (String) nVar2.f1847c;
                            String str9 = (String) nVar2.d;
                            StringBuilder sb3 = new StringBuilder(String.valueOf(str8).length() + 34 + String.valueOf(str9).length());
                            sb3.append("unable to connect to service: ");
                            sb3.append(str8);
                            sb3.append(" on ");
                            sb3.append(str9);
                            Log.w("GmsClient", sb3.toString());
                            int i10 = b10.f20489b;
                            if (i10 == -1) {
                                i10 = 16;
                            }
                            if (b10.f20490c != null) {
                                bundle = new Bundle();
                                bundle.putParcelable("pendingIntent", b10.f20490c);
                            }
                            int i11 = this.C.get();
                            g0 g0Var = new g0(this, i10, bundle);
                            c0 c0Var = this.f53858k;
                            c0Var.sendMessage(c0Var.obtainMessage(7, i11, -1, g0Var));
                        }
                    }
                } else {
                    e0 e0Var3 = this.f53865r;
                    if (e0Var3 != null) {
                        l0 l0Var3 = this.f53857j;
                        String str10 = (String) this.f53855g.f1847c;
                        m.g(str10);
                        String str11 = (String) this.f53855g.d;
                        if (this.f53869w == null) {
                            this.h.getClass();
                        }
                        l0Var3.c(str10, str11, e0Var3, this.f53855g.f1846b);
                        this.f53865r = null;
                    }
                }
            } finally {
            }
        }
    }

    public void a() {
        this.C.incrementAndGet();
        ArrayList arrayList = this.f53864q;
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
        synchronized (this.f53860m) {
            this.f53861n = null;
        }
        A(1, null);
    }

    public void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i7;
        IInterface iInterface;
        z zVar;
        long j3;
        synchronized (this.f53859l) {
            i7 = this.f53866s;
            iInterface = this.f53863p;
        }
        synchronized (this.f53860m) {
            zVar = this.f53861n;
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
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(zVar.f53970a)));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f53852c > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j10 = this.f53852c;
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
        if (this.f53851b > j3) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i10 = this.f53850a;
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
            long j11 = this.f53851b;
            String format2 = simpleDateFormat.format(new Date(j11));
            StringBuilder sb3 = new StringBuilder(String.valueOf(j11).length() + 1 + String.valueOf(format2).length());
            sb3.append(j11);
            sb3.append(" ");
            sb3.append(format2);
            append2.println(sb3.toString());
        }
        if (this.f53853e > j3) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) i8.a(this.d));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j12 = this.f53853e;
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
            attributionTag = this.f53870x;
        } else if (this.f53871y == null) {
            attributionTag = this.f53870x;
        } else {
            AttributionSource attributionSource = (AttributionSource) this.f53871y.f59584b;
            if (attributionSource == null) {
                attributionTag = this.f53870x;
            } else if (attributionSource.getAttributionTag() == null) {
                attributionTag = this.f53870x;
            } else {
                attributionTag = attributionSource.getAttributionTag();
            }
        }
        String str = attributionTag;
        int i7 = this.v;
        int i10 = n6.e.f20500a;
        Scope[] scopeArr = g.E;
        Bundle bundle = new Bundle();
        n6.c[] cVarArr = g.F;
        g gVar = new g(6, i7, i10, null, null, scopeArr, bundle, null, cVarArr, cVarArr, true, 0, false, str);
        gVar.d = this.h.getPackageName();
        gVar.h = m10;
        if (set != null) {
            gVar.f53889f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (f()) {
            gVar.f53890n = new Account("<<default account>>", "com.google");
            if (iVar != null) {
                gVar.f53888e = iVar.asBinder();
            }
        } else if (this instanceof h8.b) {
            gVar.f53890n = null;
        }
        gVar.f53891r = D;
        gVar.f53892s = k();
        if (x()) {
            gVar.f53895y = true;
        }
        try {
            synchronized (this.f53860m) {
                try {
                    z zVar = this.f53861n;
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
            c0 c0Var = this.f53858k;
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
        m.h(bVar, "Connection progress callbacks cannot be null.");
        this.f53862o = bVar;
        A(2, null);
    }

    public abstract IInterface i(IBinder iBinder);

    public final void j(String str) {
        this.f53854f = str;
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
        synchronized (this.f53859l) {
            try {
                if (this.f53866s != 5) {
                    if (s()) {
                        IInterface iInterface2 = this.f53863p;
                        m.h(iInterface2, "Client is connected but service is null");
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
        boolean z9;
        synchronized (this.f53859l) {
            if (this.f53866s == 4) {
                z9 = true;
            } else {
                z9 = false;
            }
        }
        return z9;
    }

    public final boolean t() {
        boolean z9;
        synchronized (this.f53859l) {
            int i7 = this.f53866s;
            z9 = true;
            if (i7 != 2 && i7 != 3) {
                z9 = false;
            }
        }
        return z9;
    }

    public void u(n6.a aVar) {
        this.d = aVar.f20489b;
        this.f53853e = System.currentTimeMillis();
    }

    public void v(int i7) {
        this.f53850a = i7;
        this.f53851b = System.currentTimeMillis();
    }

    public void w(int i7, IBinder iBinder, Bundle bundle, int i10) {
        f0 f0Var = new f0(this, i7, iBinder, bundle);
        c0 c0Var = this.f53858k;
        c0Var.sendMessage(c0Var.obtainMessage(1, i10, -1, f0Var));
    }

    public boolean x() {
        return this instanceof e6.a;
    }

    public final boolean y(int i7, int i10, IInterface iInterface) {
        synchronized (this.f53859l) {
            try {
                if (this.f53866s != i7) {
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
        synchronized (this.f53859l) {
            i7 = this.f53866s;
        }
        if (i7 == 3) {
            this.A = true;
            i10 = 5;
        } else {
            i10 = 4;
        }
        c0 c0Var = this.f53858k;
        c0Var.sendMessage(c0Var.obtainMessage(i10, this.C.get(), 16));
    }
}
