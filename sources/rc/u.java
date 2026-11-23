package rc;

import bi.w3;
import e2.r0;
import java.io.IOException;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
import org.telegram.messenger.g0;
import org.telegram.ui.Wallet.h1;
import org.telegram.ui.web.c1;
public final class u {
    public final s f56552a;
    public final r0 f56553b;
    public final h f56554c;
    public final ab.q d;
    public final p f56555e;
    public final p f56556f;
    public c1 h;
    public y f56558i;
    public q f56559j;
    public a0 f56560k;
    public ArrayList f56561l;
    public boolean f56562m;
    public boolean f56564o;
    public boolean f56565p;
    public boolean f56566q;
    public boolean f56567r;
    public x f56568s;
    public x f56569t;
    public o f56570u;
    public final Object f56557g = new Object();
    public final Object f56563n = new Object();

    public u(boolean z10, String str, String str2, String str3, s sVar) {
        String str4;
        this.f56552a = sVar;
        ?? obj = new Object();
        obj.f10680b = 1;
        obj.f10679a = 1;
        this.f56553b = obj;
        ?? obj2 = new Object();
        obj2.f56523a = str;
        obj2.f56524b = str2;
        obj2.f56525c = str3;
        if (z10) {
            str4 = "wss";
        } else {
            str4 = "ws";
        }
        URI.create(str4 + "://" + str2 + str3);
        this.f56554c = obj2;
        ?? obj3 = new Object();
        obj3.f989c = new ArrayList();
        obj3.f987a = true;
        obj3.f988b = this;
        this.d = obj3;
        this.f56555e = new com.google.android.gms.common.api.q(this, "PingSender", new pb.b(23));
        this.f56556f = new com.google.android.gms.common.api.q(this, "PongSender", new pb.b(23));
    }

    public final void a() {
        synchronized (this.f56563n) {
            try {
                if (this.f56562m) {
                    return;
                }
                this.f56562m = true;
                ab.q qVar = this.d;
                ArrayList arrayList = (ArrayList) qVar.p();
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    h1 h1Var = (h1) obj;
                    try {
                        try {
                            g0.g3(new w3(h1Var.f44296a, 6, h1Var.f44297b, h1Var, (u) qVar.f988b));
                        } catch (Throwable unused) {
                            h1Var.getClass();
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
        synchronized (this.f56553b) {
            r0 r0Var = this.f56553b;
            if (r0Var.f10679a == 1) {
                r0Var.f10679a = 2;
            } else {
                throw new v(1, "The current state of the WebSocket is not CREATED.");
            }
        }
        this.d.f();
        try {
            s sVar2 = this.f56552a;
            try {
                sVar2.a();
                h(sVar2.f56546g);
                ArrayList arrayList = this.f56561l;
                o oVar = null;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size) {
                            break;
                        }
                        Object obj = arrayList.get(i7);
                        i7++;
                        w wVar = (w) obj;
                        if (wVar instanceof o) {
                            oVar = (o) wVar;
                            break;
                        }
                    }
                }
                this.f56570u = oVar;
                this.f56553b.f10679a = 3;
                this.d.f();
                i();
            } catch (v e10) {
                Socket socket = sVar.f56546g;
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (IOException unused) {
                    }
                }
                throw e10;
            }
        } catch (v e11) {
            Socket socket2 = this.f56552a.f56546g;
            if (socket2 != null) {
                try {
                    socket2.close();
                } catch (Throwable unused2) {
                }
            }
            this.f56553b.f10679a = 5;
            this.d.f();
            throw e11;
        }
    }

    public final void c() {
        synchronized (this.f56553b) {
            try {
                int c10 = p1.g.c(this.f56553b.f10679a);
                if (c10 != 0) {
                    if (c10 != 2) {
                        return;
                    }
                    r0 r0Var = this.f56553b;
                    r0Var.f10679a = 4;
                    if (r0Var.f10680b == 1) {
                        r0Var.f10680b = 3;
                    }
                    g(x.a(1000, null));
                    this.d.f();
                    j();
                    return;
                }
                b bVar = new b("FinishThread", this, 4, 1);
                ab.q qVar = bVar.f56580a.d;
                if (qVar != null) {
                    ArrayList arrayList = (ArrayList) qVar.p();
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        h1 h1Var = (h1) obj;
                        try {
                            try {
                                h1Var.getClass();
                            } catch (Throwable unused) {
                                h1Var.getClass();
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
        this.f56555e.stop();
        this.f56556f.stop();
        Socket socket = this.f56552a.f56546g;
        if (socket != null) {
            try {
                socket.close();
            } catch (Throwable unused) {
            }
        }
        synchronized (this.f56553b) {
            this.f56553b.f10679a = 5;
        }
        this.d.f();
        ab.q qVar = this.d;
        x xVar = this.f56568s;
        x xVar2 = this.f56569t;
        int i7 = 0;
        if (this.f56553b.f10680b == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList arrayList = (ArrayList) qVar.p();
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            h1 h1Var = (h1) obj;
            try {
                try {
                    h1Var.a((u) qVar.f988b, xVar, xVar2, z10);
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                h1Var.getClass();
            }
        }
    }

    public final void e() {
        boolean z10;
        synchronized (this.f56557g) {
            this.f56564o = true;
            z10 = this.f56565p;
        }
        a();
        if (z10) {
            f();
        }
    }

    public final void f() {
        p pVar = this.f56555e;
        synchronized (pVar) {
        }
        pVar.c1();
        this.f56556f.d1();
    }

    public final void finalize() {
        boolean z10;
        synchronized (this.f56553b) {
            if (this.f56553b.f10679a == 1) {
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

    public final void g(x xVar) {
        if (xVar != null) {
            synchronized (this.f56553b) {
                try {
                    int i7 = this.f56553b.f10679a;
                    if (i7 != 3 && i7 != 4) {
                        return;
                    }
                    a0 a0Var = this.f56560k;
                    if (a0Var == null) {
                        return;
                    }
                    a0Var.f(xVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final java.util.TreeMap h(java.net.Socket r18) {
        throw new UnsupportedOperationException("Method not decompiled: rc.u.h(java.net.Socket):java.util.TreeMap");
    }

    public final void i() {
        q qVar = new q(this);
        a0 a0Var = new a0(this);
        synchronized (this.f56557g) {
            this.f56559j = qVar;
            this.f56560k = a0Var;
        }
        ab.q qVar2 = qVar.f56580a.d;
        int i7 = 0;
        if (qVar2 != null) {
            ArrayList arrayList = (ArrayList) qVar2.p();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                h1 h1Var = (h1) obj;
                try {
                    try {
                        h1Var.getClass();
                    } catch (Throwable unused) {
                        h1Var.getClass();
                    }
                } catch (Throwable unused2) {
                }
            }
        }
        ab.q qVar3 = a0Var.f56580a.d;
        if (qVar3 != null) {
            ArrayList arrayList2 = (ArrayList) qVar3.p();
            int size2 = arrayList2.size();
            while (i7 < size2) {
                Object obj2 = arrayList2.get(i7);
                i7++;
                h1 h1Var2 = (h1) obj2;
                try {
                    try {
                        h1Var2.getClass();
                    } catch (Throwable unused3) {
                        h1Var2.getClass();
                    }
                } catch (Throwable unused4) {
                }
            }
        }
        qVar.start();
        a0Var.start();
    }

    public final void j() {
        q qVar;
        a0 a0Var;
        synchronized (this.f56557g) {
            qVar = this.f56559j;
            a0Var = this.f56560k;
            this.f56559j = null;
            this.f56560k = null;
        }
        if (qVar != null) {
            qVar.i();
        }
        if (a0Var != null) {
            a0Var.g();
        }
    }
}
