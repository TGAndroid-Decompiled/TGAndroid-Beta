package tc;

import ai.c1;
import ai.xb;
import b2.u0;
import java.io.IOException;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Wallet.z0;
import org.telegram.ui.web.l1;
public final class u {
    public final s f46977a;
    public final u0 f46978b;
    public final h f46979c;
    public final c2.b d;
    public final p e;
    public final p f46980f;
    public l1 h;
    public y f46982i;
    public q f46983j;
    public a0 f46984k;
    public ArrayList f46985l;
    public boolean f46986m;
    public boolean f46988o;
    public boolean f46989p;
    public boolean f46990q;
    public boolean f46991r;
    public x f46992s;
    public x f46993t;
    public o f46994u;
    public final Object f46981g = new Object();
    public final Object f46987n = new Object();

    public u(boolean z10, String str, String str2, String str3, s sVar) {
        String str4;
        this.f46977a = sVar;
        ?? obj = new Object();
        obj.f4054b = 1;
        obj.f4053a = 1;
        this.f46978b = obj;
        ?? obj2 = new Object();
        obj2.f46952a = str;
        obj2.f46953b = str2;
        obj2.f46954c = str3;
        if (z10) {
            str4 = "wss";
        } else {
            str4 = "ws";
        }
        URI.create(str4 + "://" + str2 + str3);
        this.f46979c = obj2;
        ?? obj3 = new Object();
        obj3.f4491c = new ArrayList();
        obj3.f4489a = true;
        obj3.f4490b = this;
        this.d = obj3;
        this.e = new c1(this, "PingSender", new rb.b(23));
        this.f46980f = new c1(this, "PongSender", new rb.b(23));
    }

    public final void a() {
        synchronized (this.f46987n) {
            try {
                if (this.f46986m) {
                    return;
                }
                this.f46986m = true;
                c2.b bVar = this.d;
                ArrayList arrayList = (ArrayList) bVar.n();
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    z0 z0Var = (z0) obj;
                    try {
                        try {
                            AndroidUtilities.runOnUIThread(new xb(z0Var, (u) bVar.f4490b, z0Var.f35167a, z0Var.f35168b, 16));
                        } catch (Throwable unused) {
                            z0Var.getClass();
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
        synchronized (this.f46978b) {
            u0 u0Var = this.f46978b;
            if (u0Var.f4053a == 1) {
                u0Var.f4053a = 2;
            } else {
                throw new v(1, "The current state of the WebSocket is not CREATED.");
            }
        }
        this.d.e();
        try {
            s sVar2 = this.f46977a;
            try {
                sVar2.a();
                h(sVar2.f46972g);
                ArrayList arrayList = this.f46985l;
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
                        w wVar = (w) obj;
                        if (wVar instanceof o) {
                            oVar = (o) wVar;
                            break;
                        }
                    }
                }
                this.f46994u = oVar;
                this.f46978b.f4053a = 3;
                this.d.e();
                i();
            } catch (v e) {
                Socket socket = sVar.f46972g;
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (IOException unused) {
                    }
                }
                throw e;
            }
        } catch (v e7) {
            Socket socket2 = this.f46977a.f46972g;
            if (socket2 != null) {
                try {
                    socket2.close();
                } catch (Throwable unused2) {
                }
            }
            this.f46978b.f4053a = 5;
            this.d.e();
            throw e7;
        }
    }

    public final void c() {
        synchronized (this.f46978b) {
            try {
                int c10 = m1.j.c(this.f46978b.f4053a);
                if (c10 != 0) {
                    if (c10 != 2) {
                        return;
                    }
                    u0 u0Var = this.f46978b;
                    u0Var.f4053a = 4;
                    if (u0Var.f4054b == 1) {
                        u0Var.f4054b = 3;
                    }
                    g(x.a(1000, null));
                    this.d.e();
                    j();
                    return;
                }
                b bVar = new b("FinishThread", this, 4, 1);
                c2.b bVar2 = bVar.f47003a.d;
                if (bVar2 != null) {
                    ArrayList arrayList = (ArrayList) bVar2.n();
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        z0 z0Var = (z0) obj;
                        try {
                            try {
                                z0Var.getClass();
                            } catch (Throwable unused) {
                                z0Var.getClass();
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
        this.e.stop();
        this.f46980f.stop();
        Socket socket = this.f46977a.f46972g;
        if (socket != null) {
            try {
                socket.close();
            } catch (Throwable unused) {
            }
        }
        synchronized (this.f46978b) {
            this.f46978b.f4053a = 5;
        }
        this.d.e();
        c2.b bVar = this.d;
        x xVar = this.f46992s;
        x xVar2 = this.f46993t;
        int i10 = 0;
        if (this.f46978b.f4054b == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList arrayList = (ArrayList) bVar.n();
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            z0 z0Var = (z0) obj;
            try {
                try {
                    z0Var.a((u) bVar.f4490b, xVar, xVar2, z10);
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                z0Var.getClass();
            }
        }
    }

    public final void e() {
        boolean z10;
        synchronized (this.f46981g) {
            this.f46988o = true;
            z10 = this.f46989p;
        }
        a();
        if (z10) {
            f();
        }
    }

    public final void f() {
        p pVar = this.e;
        synchronized (pVar) {
        }
        pVar.c1();
        this.f46980f.d1();
    }

    public final void finalize() {
        boolean z10;
        synchronized (this.f46978b) {
            if (this.f46978b.f4053a == 1) {
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
            synchronized (this.f46978b) {
                try {
                    int i10 = this.f46978b.f4053a;
                    if (i10 != 3 && i10 != 4) {
                        return;
                    }
                    a0 a0Var = this.f46984k;
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
        throw new UnsupportedOperationException("Method not decompiled: tc.u.h(java.net.Socket):java.util.TreeMap");
    }

    public final void i() {
        q qVar = new q(this);
        a0 a0Var = new a0(this);
        synchronized (this.f46981g) {
            this.f46983j = qVar;
            this.f46984k = a0Var;
        }
        c2.b bVar = qVar.f47003a.d;
        int i10 = 0;
        if (bVar != null) {
            ArrayList arrayList = (ArrayList) bVar.n();
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                z0 z0Var = (z0) obj;
                try {
                    try {
                        z0Var.getClass();
                    } catch (Throwable unused) {
                        z0Var.getClass();
                    }
                } catch (Throwable unused2) {
                }
            }
        }
        c2.b bVar2 = a0Var.f47003a.d;
        if (bVar2 != null) {
            ArrayList arrayList2 = (ArrayList) bVar2.n();
            int size2 = arrayList2.size();
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                z0 z0Var2 = (z0) obj2;
                try {
                    try {
                        z0Var2.getClass();
                    } catch (Throwable unused3) {
                        z0Var2.getClass();
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
        synchronized (this.f46981g) {
            qVar = this.f46983j;
            a0Var = this.f46984k;
            this.f46983j = null;
            this.f46984k = null;
        }
        if (qVar != null) {
            qVar.i();
        }
        if (a0Var != null) {
            a0Var.g();
        }
    }
}
