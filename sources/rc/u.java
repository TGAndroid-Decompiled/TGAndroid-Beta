package rc;

import di.w7;
import e2.r0;
import java.io.IOException;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
import org.telegram.messenger.g0;
import org.telegram.ui.Wallet.x0;
import org.telegram.ui.web.c1;
public final class u {
    public final s f55968a;
    public final r0 f55969b;
    public final h f55970c;
    public final ab.q d;
    public final p f55971e;
    public final p f55972f;
    public c1 h;
    public y f55974i;
    public q f55975j;
    public a0 f55976k;
    public ArrayList f55977l;
    public boolean f55978m;
    public boolean f55980o;
    public boolean f55981p;
    public boolean f55982q;
    public boolean f55983r;
    public x f55984s;
    public x f55985t;
    public o f55986u;
    public final Object f55973g = new Object();
    public final Object f55979n = new Object();

    public u(boolean z10, String str, String str2, String str3, s sVar) {
        String str4;
        this.f55968a = sVar;
        ?? obj = new Object();
        obj.f10370b = 1;
        obj.f10369a = 1;
        this.f55969b = obj;
        ?? obj2 = new Object();
        obj2.f55939a = str;
        obj2.f55940b = str2;
        obj2.f55941c = str3;
        if (z10) {
            str4 = "wss";
        } else {
            str4 = "ws";
        }
        URI.create(str4 + "://" + str2 + str3);
        this.f55970c = obj2;
        ?? obj3 = new Object();
        obj3.f990c = new ArrayList();
        obj3.f988a = true;
        obj3.f989b = this;
        this.d = obj3;
        this.f55971e = new com.google.android.gms.common.api.q(this, "PingSender", new pb.b(23));
        this.f55972f = new com.google.android.gms.common.api.q(this, "PongSender", new pb.b(23));
    }

    public final void a() {
        synchronized (this.f55979n) {
            try {
                if (this.f55978m) {
                    return;
                }
                this.f55978m = true;
                ab.q qVar = this.d;
                ArrayList arrayList = (ArrayList) qVar.p();
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    x0 x0Var = (x0) obj;
                    try {
                        try {
                            g0.h3(new w7(x0Var.f44671a, 5, x0Var.f44672b, x0Var, (u) qVar.f989b));
                        } catch (Throwable unused) {
                            x0Var.getClass();
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
        synchronized (this.f55969b) {
            r0 r0Var = this.f55969b;
            if (r0Var.f10369a == 1) {
                r0Var.f10369a = 2;
            } else {
                throw new v(1, "The current state of the WebSocket is not CREATED.");
            }
        }
        this.d.g();
        try {
            s sVar2 = this.f55968a;
            try {
                sVar2.a();
                h(sVar2.f55962g);
                ArrayList arrayList = this.f55977l;
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
                this.f55986u = oVar;
                this.f55969b.f10369a = 3;
                this.d.g();
                i();
            } catch (v e10) {
                Socket socket = sVar.f55962g;
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (IOException unused) {
                    }
                }
                throw e10;
            }
        } catch (v e11) {
            Socket socket2 = this.f55968a.f55962g;
            if (socket2 != null) {
                try {
                    socket2.close();
                } catch (Throwable unused2) {
                }
            }
            this.f55969b.f10369a = 5;
            this.d.g();
            throw e11;
        }
    }

    public final void c() {
        synchronized (this.f55969b) {
            try {
                int c10 = p1.g.c(this.f55969b.f10369a);
                if (c10 != 0) {
                    if (c10 != 2) {
                        return;
                    }
                    r0 r0Var = this.f55969b;
                    r0Var.f10369a = 4;
                    if (r0Var.f10370b == 1) {
                        r0Var.f10370b = 3;
                    }
                    g(x.a(1000, null));
                    this.d.g();
                    j();
                    return;
                }
                b bVar = new b("FinishThread", this, 4, 1);
                ab.q qVar = bVar.f55996a.d;
                if (qVar != null) {
                    ArrayList arrayList = (ArrayList) qVar.p();
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        x0 x0Var = (x0) obj;
                        try {
                            try {
                                x0Var.getClass();
                            } catch (Throwable unused) {
                                x0Var.getClass();
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
        this.f55971e.stop();
        this.f55972f.stop();
        Socket socket = this.f55968a.f55962g;
        if (socket != null) {
            try {
                socket.close();
            } catch (Throwable unused) {
            }
        }
        synchronized (this.f55969b) {
            this.f55969b.f10369a = 5;
        }
        this.d.g();
        ab.q qVar = this.d;
        x xVar = this.f55984s;
        x xVar2 = this.f55985t;
        int i7 = 0;
        if (this.f55969b.f10370b == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList arrayList = (ArrayList) qVar.p();
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            x0 x0Var = (x0) obj;
            try {
                try {
                    x0Var.a((u) qVar.f989b, xVar, xVar2, z10);
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                x0Var.getClass();
            }
        }
    }

    public final void e() {
        boolean z10;
        synchronized (this.f55973g) {
            this.f55980o = true;
            z10 = this.f55981p;
        }
        a();
        if (z10) {
            f();
        }
    }

    public final void f() {
        p pVar = this.f55971e;
        synchronized (pVar) {
        }
        pVar.c1();
        this.f55972f.d1();
    }

    public final void finalize() {
        boolean z10;
        synchronized (this.f55969b) {
            if (this.f55969b.f10369a == 1) {
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
            synchronized (this.f55969b) {
                try {
                    int i7 = this.f55969b.f10369a;
                    if (i7 != 3 && i7 != 4) {
                        return;
                    }
                    a0 a0Var = this.f55976k;
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
        synchronized (this.f55973g) {
            this.f55975j = qVar;
            this.f55976k = a0Var;
        }
        ab.q qVar2 = qVar.f55996a.d;
        int i7 = 0;
        if (qVar2 != null) {
            ArrayList arrayList = (ArrayList) qVar2.p();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                x0 x0Var = (x0) obj;
                try {
                    try {
                        x0Var.getClass();
                    } catch (Throwable unused) {
                        x0Var.getClass();
                    }
                } catch (Throwable unused2) {
                }
            }
        }
        ab.q qVar3 = a0Var.f55996a.d;
        if (qVar3 != null) {
            ArrayList arrayList2 = (ArrayList) qVar3.p();
            int size2 = arrayList2.size();
            while (i7 < size2) {
                Object obj2 = arrayList2.get(i7);
                i7++;
                x0 x0Var2 = (x0) obj2;
                try {
                    try {
                        x0Var2.getClass();
                    } catch (Throwable unused3) {
                        x0Var2.getClass();
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
        synchronized (this.f55973g) {
            qVar = this.f55975j;
            a0Var = this.f55976k;
            this.f55975j = null;
            this.f55976k = null;
        }
        if (qVar != null) {
            qVar.i();
        }
        if (a0Var != null) {
            a0Var.g();
        }
    }
}
