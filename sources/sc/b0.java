package sc;

import b2.q0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import org.telegram.ui.Wallet.y0;
public final class b0 extends a0 {
    public final LinkedList f47937b;
    public final o f47938c;
    public boolean d;
    public y f47939e;
    public boolean f47940f;

    public b0(u uVar) {
        super("WritingThread", uVar, 2);
        this.f47937b = new LinkedList();
        this.f47938c = uVar.f48001u;
    }

    @Override
    public final void a() {
        try {
            c();
        } catch (Throwable th2) {
            w wVar = new w(39, "An uncaught throwable was detected in the writing thread: " + th2.getMessage(), th2);
            com.google.firebase.messaging.m mVar = this.f47935a.d;
            mVar.d(wVar);
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
                    }
                } catch (Throwable unused2) {
                    y0Var.getClass();
                }
            }
        }
        synchronized (this) {
            this.f47940f = true;
            notifyAll();
        }
        e();
    }

    public final void b() {
        try {
            this.f47935a.f47989i.flush();
            synchronized (this) {
            }
        } catch (IOException e7) {
            w wVar = new w(27, "Flushing frames to the server failed: " + e7.getMessage(), e7);
            com.google.firebase.messaging.m mVar = this.f47935a.d;
            mVar.d(wVar);
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
            throw wVar;
        }
    }

    public final void c() {
        boolean z10;
        u uVar = this.f47935a;
        synchronized (uVar.f47988g) {
            uVar.f47996p = true;
            z10 = uVar.f47995o;
        }
        uVar.a();
        if (z10) {
            uVar.f();
        }
        while (true) {
            int j3 = j();
            if (j3 != 1) {
                if (j3 == 3) {
                    try {
                        this.f47935a.f47989i.flush();
                    } catch (IOException unused) {
                    }
                } else if (j3 == 2) {
                    continue;
                } else {
                    try {
                        i(false);
                    } catch (w unused2) {
                    }
                }
            }
            try {
                i(true);
                return;
            } catch (w unused3) {
                return;
            }
        }
    }

    public final void e() {
        u uVar = this.f47935a;
        y yVar = this.f47939e;
        synchronized (uVar.f47988g) {
            try {
                uVar.f47998r = true;
                uVar.f48000t = yVar;
                if (!uVar.f47997q) {
                    return;
                }
                uVar.d();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f(sc.y r9) {
        throw new UnsupportedOperationException("Method not decompiled: sc.b0.f(sc.y):void");
    }

    public final void g() {
        synchronized (this) {
            this.d = true;
            notifyAll();
        }
    }

    public final void h(y yVar) {
        int i10;
        byte[] bArr;
        byte[] bArr2;
        o oVar = this.f47938c;
        boolean z10 = true;
        if (oVar != null && (((i10 = yVar.f48008e) == 1 || i10 == 2) && yVar.f48005a && !yVar.f48006b && (bArr = yVar.f48010g) != null && bArr.length != 0)) {
            try {
                bArr2 = oVar.b(bArr);
            } catch (w unused) {
                bArr2 = bArr;
            }
            if (bArr.length > bArr2.length) {
                yVar.c(bArr2);
                yVar.f48006b = true;
            }
        }
        ArrayList arrayList = (ArrayList) this.f47935a.d.n();
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            y0 y0Var = (y0) obj;
            try {
                try {
                    y0Var.getClass();
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                y0Var.getClass();
            }
        }
        if (this.f47939e != null) {
            ArrayList arrayList2 = (ArrayList) this.f47935a.d.n();
            int size2 = arrayList2.size();
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                y0 y0Var2 = (y0) obj2;
                try {
                    try {
                        y0Var2.getClass();
                    } catch (Throwable unused4) {
                        y0Var2.getClass();
                    }
                } catch (Throwable unused5) {
                }
            }
            return;
        }
        int i13 = yVar.f48008e;
        if (i13 == 8) {
            this.f47939e = yVar;
        }
        if (i13 == 8) {
            q0 q0Var = this.f47935a.f47984b;
            synchronized (q0Var) {
                int i14 = q0Var.f3533a;
                if (i14 != 4 && i14 != 5) {
                    q0Var.f3533a = 4;
                    if (q0Var.f3534b == 1) {
                        q0Var.f3534b = 3;
                    }
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                this.f47935a.d.e();
            }
        }
        try {
            this.f47935a.f47989i.a(yVar);
            ArrayList arrayList3 = (ArrayList) this.f47935a.d.n();
            int size3 = arrayList3.size();
            while (i11 < size3) {
                Object obj3 = arrayList3.get(i11);
                i11++;
                y0 y0Var3 = (y0) obj3;
                try {
                    try {
                        y0Var3.getClass();
                    } catch (Throwable unused6) {
                        y0Var3.getClass();
                    }
                } catch (Throwable unused7) {
                }
            }
        } catch (IOException e7) {
            w wVar = new w(26, "An I/O error occurred when a frame was tried to be sent: " + e7.getMessage(), e7);
            com.google.firebase.messaging.m mVar = this.f47935a.d;
            mVar.d(wVar);
            ArrayList arrayList4 = (ArrayList) mVar.n();
            int size4 = arrayList4.size();
            while (i11 < size4) {
                Object obj4 = arrayList4.get(i11);
                i11++;
                y0 y0Var4 = (y0) obj4;
                try {
                    try {
                        y0Var4.getClass();
                    } catch (Throwable unused8) {
                        y0Var4.getClass();
                    }
                } catch (Throwable unused9) {
                }
            }
            throw wVar;
        }
    }

    public final void i(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: sc.b0.i(boolean):void");
    }

    public final int j() {
        synchronized (this) {
            try {
                if (this.d) {
                    return 1;
                }
                if (this.f47939e != null) {
                    return 1;
                }
                if (this.f47937b.size() == 0) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
                if (this.d) {
                    return 1;
                }
                if (this.f47937b.size() == 0) {
                    return 2;
                }
                return 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
