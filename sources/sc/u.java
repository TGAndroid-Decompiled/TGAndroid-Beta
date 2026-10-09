package sc;

import b2.q0;
import java.io.IOException;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.h7;
import org.telegram.ui.Wallet.y0;
import org.telegram.ui.web.m1;
public final class u {
    public final s f47939a;
    public final q0 f47940b;
    public final h f47941c;
    public final com.google.firebase.messaging.m d;
    public final p f47942e;
    public final p f47943f;
    public m1 h;
    public z f47945i;
    public q f47946j;
    public b0 f47947k;
    public ArrayList f47948l;
    public boolean f47949m;
    public boolean f47951o;
    public boolean f47952p;
    public boolean f47953q;
    public boolean f47954r;
    public y f47955s;
    public y f47956t;
    public o f47957u;
    public final Object f47944g = new Object();
    public final Object f47950n = new Object();

    public u(boolean z10, String str, String str2, String str3, s sVar) {
        String str4;
        this.f47939a = sVar;
        ?? obj = new Object();
        obj.f3534b = 1;
        obj.f3533a = 1;
        this.f47940b = obj;
        ?? obj2 = new Object();
        obj2.f47910a = str;
        obj2.f47911b = str2;
        obj2.f47912c = str3;
        if (z10) {
            str4 = "wss";
        } else {
            str4 = "ws";
        }
        URI.create(str4 + "://" + str2 + str3);
        this.f47941c = obj2;
        ?? obj3 = new Object();
        obj3.f7953c = new ArrayList();
        obj3.f7951a = true;
        obj3.f7952b = this;
        this.d = obj3;
        this.f47942e = new b2.g(this, "PingSender", new ob.a(22));
        this.f47943f = new b2.g(this, "PongSender", new ob.a(22));
    }

    public final void a() {
        synchronized (this.f47950n) {
            try {
                if (this.f47949m) {
                    return;
                }
                this.f47949m = true;
                com.google.firebase.messaging.m mVar = this.d;
                ArrayList arrayList = (ArrayList) mVar.n();
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    y0 y0Var = (y0) obj;
                    try {
                        try {
                            AndroidUtilities.runOnUIThread(new h7(y0Var, (u) mVar.f7952b, y0Var.f35680a, y0Var.f35681b, 15));
                        } catch (Throwable unused) {
                            y0Var.getClass();
                        }
                    } catch (Throwable unused2) {
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        s sVar;
        synchronized (this.f47940b) {
            q0 q0Var = this.f47940b;
            if (q0Var.f3533a == 1) {
                q0Var.f3533a = 2;
            } else {
                throw new w(1, "The current state of the WebSocket is not CREATED.");
            }
        }
        this.d.e();
        try {
            s sVar2 = this.f47939a;
            try {
                sVar2.a();
                h(sVar2.f47933g);
                ArrayList arrayList = this.f47948l;
                o oVar = null;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            break;
                        }
                        Object obj = arrayList.get(i10);
                        i10++;
                        x xVar = (x) obj;
                        if (xVar instanceof o) {
                            oVar = (o) xVar;
                            break;
                        }
                    }
                }
                this.f47957u = oVar;
                this.f47940b.f3533a = 3;
                this.d.e();
                i();
            } catch (w e7) {
                Socket socket = sVar.f47933g;
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (IOException unused) {
                    }
                }
                throw e7;
            }
        } catch (w e10) {
            Socket socket2 = this.f47939a.f47933g;
            if (socket2 != null) {
                try {
                    socket2.close();
                } catch (Throwable unused2) {
                }
            }
            this.f47940b.f3533a = 5;
            this.d.e();
            throw e10;
        }
    }

    public final void c() {
        synchronized (this.f47940b) {
            try {
                int c10 = m1.j.c(this.f47940b.f3533a);
                if (c10 != 0) {
                    if (c10 != 2) {
                        return;
                    }
                    q0 q0Var = this.f47940b;
                    q0Var.f3533a = 4;
                    if (q0Var.f3534b == 1) {
                        q0Var.f3534b = 3;
                    }
                    g(y.a(1000, null));
                    this.d.e();
                    j();
                    return;
                }
                b bVar = new b("FinishThread", this, 4, 1);
                com.google.firebase.messaging.m mVar = bVar.f47891a.d;
                if (mVar != null) {
                    ArrayList arrayList = (ArrayList) mVar.n();
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        y0 y0Var = (y0) obj;
                        try {
                            try {
                                y0Var.getClass();
                            } catch (Throwable unused) {
                                y0Var.getClass();
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                }
                bVar.start();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        boolean z10;
        this.f47942e.stop();
        this.f47943f.stop();
        Socket socket = this.f47939a.f47933g;
        if (socket != null) {
            try {
                socket.close();
            } catch (Throwable unused) {
            }
        }
        synchronized (this.f47940b) {
            this.f47940b.f3533a = 5;
        }
        this.d.e();
        com.google.firebase.messaging.m mVar = this.d;
        y yVar = this.f47955s;
        y yVar2 = this.f47956t;
        int i10 = 0;
        if (this.f47940b.f3534b == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList arrayList = (ArrayList) mVar.n();
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            y0 y0Var = (y0) obj;
            try {
                try {
                    y0Var.a((u) mVar.f7952b, yVar, yVar2, z10);
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                y0Var.getClass();
            }
        }
    }

    public final void e() {
        boolean z10;
        synchronized (this.f47944g) {
            this.f47951o = true;
            z10 = this.f47952p;
        }
        a();
        if (z10) {
            f();
        }
    }

    public final void f() {
        p pVar = this.f47942e;
        synchronized (pVar) {
        }
        pVar.Z0();
        this.f47943f.a1();
    }

    public final void finalize() {
        boolean z10;
        synchronized (this.f47940b) {
            if (this.f47940b.f3533a == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (z10) {
            d();
        }
        super.finalize();
    }

    public final void g(y yVar) {
        if (yVar != null) {
            synchronized (this.f47940b) {
                try {
                    int i10 = this.f47940b.f3533a;
                    if (i10 != 3 && i10 != 4) {
                        return;
                    }
                    b0 b0Var = this.f47947k;
                    if (b0Var == null) {
                        return;
                    }
                    b0Var.f(yVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final java.util.TreeMap h(java.net.Socket r18) {
        throw new UnsupportedOperationException("Method not decompiled: sc.u.h(java.net.Socket):java.util.TreeMap");
    }

    public final void i() {
        q qVar = new q(this);
        b0 b0Var = new b0(this);
        synchronized (this.f47944g) {
            this.f47946j = qVar;
            this.f47947k = b0Var;
        }
        com.google.firebase.messaging.m mVar = qVar.f47891a.d;
        int i10 = 0;
        if (mVar != null) {
            ArrayList arrayList = (ArrayList) mVar.n();
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                y0 y0Var = (y0) obj;
                try {
                    try {
                        y0Var.getClass();
                    } catch (Throwable unused) {
                        y0Var.getClass();
                    }
                } catch (Throwable unused2) {
                }
            }
        }
        com.google.firebase.messaging.m mVar2 = b0Var.f47891a.d;
        if (mVar2 != null) {
            ArrayList arrayList2 = (ArrayList) mVar2.n();
            int size2 = arrayList2.size();
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                y0 y0Var2 = (y0) obj2;
                try {
                    try {
                        y0Var2.getClass();
                    } catch (Throwable unused3) {
                        y0Var2.getClass();
                    }
                } catch (Throwable unused4) {
                }
            }
        }
        qVar.start();
        b0Var.start();
    }

    public final void j() {
        q qVar;
        b0 b0Var;
        synchronized (this.f47944g) {
            qVar = this.f47946j;
            b0Var = this.f47947k;
            this.f47946j = null;
            this.f47947k = null;
        }
        if (qVar != null) {
            qVar.i();
        }
        if (b0Var != null) {
            b0Var.g();
        }
    }
}
