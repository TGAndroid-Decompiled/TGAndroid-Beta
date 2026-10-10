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
    public final s f47983a;
    public final q0 f47984b;
    public final h f47985c;
    public final com.google.firebase.messaging.m d;
    public final p f47986e;
    public final p f47987f;
    public m1 h;
    public z f47989i;
    public q f47990j;
    public b0 f47991k;
    public ArrayList f47992l;
    public boolean f47993m;
    public boolean f47995o;
    public boolean f47996p;
    public boolean f47997q;
    public boolean f47998r;
    public y f47999s;
    public y f48000t;
    public o f48001u;
    public final Object f47988g = new Object();
    public final Object f47994n = new Object();

    public u(boolean z10, String str, String str2, String str3, s sVar) {
        String str4;
        this.f47983a = sVar;
        ?? obj = new Object();
        obj.f3534b = 1;
        obj.f3533a = 1;
        this.f47984b = obj;
        ?? obj2 = new Object();
        obj2.f47954a = str;
        obj2.f47955b = str2;
        obj2.f47956c = str3;
        if (z10) {
            str4 = "wss";
        } else {
            str4 = "ws";
        }
        URI.create(str4 + "://" + str2 + str3);
        this.f47985c = obj2;
        ?? obj3 = new Object();
        obj3.f7953c = new ArrayList();
        obj3.f7951a = true;
        obj3.f7952b = this;
        this.d = obj3;
        this.f47986e = new b2.g(this, "PingSender", new ob.a(22));
        this.f47987f = new b2.g(this, "PongSender", new ob.a(22));
    }

    public final void a() {
        synchronized (this.f47994n) {
            try {
                if (this.f47993m) {
                    return;
                }
                this.f47993m = true;
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
                            AndroidUtilities.runOnUIThread(new h7(y0Var, (u) mVar.f7952b, y0Var.f35735a, y0Var.f35736b, 15));
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
        synchronized (this.f47984b) {
            q0 q0Var = this.f47984b;
            if (q0Var.f3533a == 1) {
                q0Var.f3533a = 2;
            } else {
                throw new w(1, "The current state of the WebSocket is not CREATED.");
            }
        }
        this.d.e();
        try {
            s sVar2 = this.f47983a;
            try {
                sVar2.a();
                h(sVar2.f47977g);
                ArrayList arrayList = this.f47992l;
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
                this.f48001u = oVar;
                this.f47984b.f3533a = 3;
                this.d.e();
                i();
            } catch (w e7) {
                Socket socket = sVar.f47977g;
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (IOException unused) {
                    }
                }
                throw e7;
            }
        } catch (w e10) {
            Socket socket2 = this.f47983a.f47977g;
            if (socket2 != null) {
                try {
                    socket2.close();
                } catch (Throwable unused2) {
                }
            }
            this.f47984b.f3533a = 5;
            this.d.e();
            throw e10;
        }
    }

    public final void c() {
        synchronized (this.f47984b) {
            try {
                int c10 = m1.j.c(this.f47984b.f3533a);
                if (c10 != 0) {
                    if (c10 != 2) {
                        return;
                    }
                    q0 q0Var = this.f47984b;
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
                com.google.firebase.messaging.m mVar = bVar.f47935a.d;
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
        this.f47986e.stop();
        this.f47987f.stop();
        Socket socket = this.f47983a.f47977g;
        if (socket != null) {
            try {
                socket.close();
            } catch (Throwable unused) {
            }
        }
        synchronized (this.f47984b) {
            this.f47984b.f3533a = 5;
        }
        this.d.e();
        com.google.firebase.messaging.m mVar = this.d;
        y yVar = this.f47999s;
        y yVar2 = this.f48000t;
        int i10 = 0;
        if (this.f47984b.f3534b == 2) {
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
        synchronized (this.f47988g) {
            this.f47995o = true;
            z10 = this.f47996p;
        }
        a();
        if (z10) {
            f();
        }
    }

    public final void f() {
        p pVar = this.f47986e;
        synchronized (pVar) {
        }
        pVar.Z0();
        this.f47987f.a1();
    }

    public final void finalize() {
        boolean z10;
        synchronized (this.f47984b) {
            if (this.f47984b.f3533a == 1) {
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
            synchronized (this.f47984b) {
                try {
                    int i10 = this.f47984b.f3533a;
                    if (i10 != 3 && i10 != 4) {
                        return;
                    }
                    b0 b0Var = this.f47991k;
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
        synchronized (this.f47988g) {
            this.f47990j = qVar;
            this.f47991k = b0Var;
        }
        com.google.firebase.messaging.m mVar = qVar.f47935a.d;
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
        com.google.firebase.messaging.m mVar2 = b0Var.f47935a.d;
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
        synchronized (this.f47988g) {
            qVar = this.f47990j;
            b0Var = this.f47991k;
            this.f47990j = null;
            this.f47991k = null;
        }
        if (qVar != null) {
            qVar.i();
        }
        if (b0Var != null) {
            b0Var.g();
        }
    }
}
