package tc;

import b2.v0;
import java.io.IOException;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.k7;
import org.telegram.ui.Wallet.x0;
import org.telegram.ui.web.m1;
public final class u {
    public final s f45607a;
    public final v0 f45608b;
    public final h f45609c;
    public final c2.b d;
    public final p e;
    public final p f45610f;
    public m1 h;
    public y f45612i;
    public q f45613j;
    public a0 f45614k;
    public ArrayList f45615l;
    public boolean f45616m;
    public boolean f45618o;
    public boolean f45619p;
    public boolean f45620q;
    public boolean f45621r;
    public x f45622s;
    public x f45623t;
    public o f45624u;
    public final Object f45611g = new Object();
    public final Object f45617n = new Object();

    public u(boolean z10, String str, String str2, String str3, s sVar) {
        String str4;
        this.f45607a = sVar;
        ?? obj = new Object();
        obj.f2445b = 1;
        obj.f2444a = 1;
        this.f45608b = obj;
        ?? obj2 = new Object();
        obj2.f45582a = str;
        obj2.f45583b = str2;
        obj2.f45584c = str3;
        if (z10) {
            str4 = "wss";
        } else {
            str4 = "ws";
        }
        URI.create(str4 + "://" + str2 + str3);
        this.f45609c = obj2;
        ?? obj3 = new Object();
        obj3.f4120c = new ArrayList();
        obj3.f4118a = true;
        obj3.f4119b = this;
        this.d = obj3;
        this.e = new b2.h(this, "PingSender", new rb.b(23));
        this.f45610f = new b2.h(this, "PongSender", new rb.b(23));
    }

    public final void a() {
        synchronized (this.f45617n) {
            try {
                if (this.f45616m) {
                    return;
                }
                this.f45616m = true;
                c2.b bVar = this.d;
                ArrayList arrayList = (ArrayList) bVar.n();
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    x0 x0Var = (x0) obj;
                    try {
                        try {
                            AndroidUtilities.runOnUIThread(new k7(x0Var, (u) bVar.f4119b, x0Var.f33827a, x0Var.f33828b, 15));
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
        synchronized (this.f45608b) {
            v0 v0Var = this.f45608b;
            if (v0Var.f2444a == 1) {
                v0Var.f2444a = 2;
            } else {
                throw new v(1, "The current state of the WebSocket is not CREATED.");
            }
        }
        this.d.e();
        try {
            s sVar2 = this.f45607a;
            try {
                sVar2.a();
                h(sVar2.f45602g);
                ArrayList arrayList = this.f45615l;
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
                this.f45624u = oVar;
                this.f45608b.f2444a = 3;
                this.d.e();
                i();
            } catch (v e) {
                Socket socket = sVar.f45602g;
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (IOException unused) {
                    }
                }
                throw e;
            }
        } catch (v e7) {
            Socket socket2 = this.f45607a.f45602g;
            if (socket2 != null) {
                try {
                    socket2.close();
                } catch (Throwable unused2) {
                }
            }
            this.f45608b.f2444a = 5;
            this.d.e();
            throw e7;
        }
    }

    public final void c() {
        synchronized (this.f45608b) {
            try {
                int c10 = m1.j.c(this.f45608b.f2444a);
                if (c10 != 0) {
                    if (c10 != 2) {
                        return;
                    }
                    v0 v0Var = this.f45608b;
                    v0Var.f2444a = 4;
                    if (v0Var.f2445b == 1) {
                        v0Var.f2445b = 3;
                    }
                    g(x.a(1000, null));
                    this.d.e();
                    j();
                    return;
                }
                b bVar = new b("FinishThread", this, 4, 1);
                c2.b bVar2 = bVar.f45633a.d;
                if (bVar2 != null) {
                    ArrayList arrayList = (ArrayList) bVar2.n();
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
                bVar.start();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        boolean z10;
        this.e.stop();
        this.f45610f.stop();
        Socket socket = this.f45607a.f45602g;
        if (socket != null) {
            try {
                socket.close();
            } catch (Throwable unused) {
            }
        }
        synchronized (this.f45608b) {
            this.f45608b.f2444a = 5;
        }
        this.d.e();
        c2.b bVar = this.d;
        x xVar = this.f45622s;
        x xVar2 = this.f45623t;
        int i10 = 0;
        if (this.f45608b.f2445b == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList arrayList = (ArrayList) bVar.n();
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            x0 x0Var = (x0) obj;
            try {
                try {
                    x0Var.a((u) bVar.f4119b, xVar, xVar2, z10);
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                x0Var.getClass();
            }
        }
    }

    public final void e() {
        boolean z10;
        synchronized (this.f45611g) {
            this.f45618o = true;
            z10 = this.f45619p;
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
        this.f45610f.d1();
    }

    public final void finalize() {
        boolean z10;
        synchronized (this.f45608b) {
            if (this.f45608b.f2444a == 1) {
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
            synchronized (this.f45608b) {
                try {
                    int i10 = this.f45608b.f2444a;
                    if (i10 != 3 && i10 != 4) {
                        return;
                    }
                    a0 a0Var = this.f45614k;
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
        synchronized (this.f45611g) {
            this.f45613j = qVar;
            this.f45614k = a0Var;
        }
        c2.b bVar = qVar.f45633a.d;
        int i10 = 0;
        if (bVar != null) {
            ArrayList arrayList = (ArrayList) bVar.n();
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
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
        c2.b bVar2 = a0Var.f45633a.d;
        if (bVar2 != null) {
            ArrayList arrayList2 = (ArrayList) bVar2.n();
            int size2 = arrayList2.size();
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
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
        synchronized (this.f45611g) {
            qVar = this.f45613j;
            a0Var = this.f45614k;
            this.f45613j = null;
            this.f45614k = null;
        }
        if (qVar != null) {
            qVar.i();
        }
        if (a0Var != null) {
            a0Var.g();
        }
    }
}
