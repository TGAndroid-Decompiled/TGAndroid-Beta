package rc;

import e2.r0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import org.telegram.ui.Wallet.h1;
public final class a0 extends z {
    public final LinkedList f56495b;
    public final o f56496c;
    public boolean d;
    public x f56497e;
    public boolean f56498f;

    public a0(u uVar) {
        super("WritingThread", uVar, 2);
        this.f56495b = new LinkedList();
        this.f56496c = uVar.f56560u;
    }

    @Override
    public final void a() {
        try {
            c();
        } catch (Throwable th2) {
            v vVar = new v(39, "An uncaught throwable was detected in the writing thread: " + th2.getMessage(), th2);
            ab.q qVar = this.f56570a.d;
            qVar.d(vVar);
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
                    }
                } catch (Throwable unused2) {
                    h1Var.getClass();
                }
            }
        }
        synchronized (this) {
            this.f56498f = true;
            notifyAll();
        }
        d();
    }

    public final void b() {
        try {
            this.f56570a.f56548i.flush();
            synchronized (this) {
            }
        } catch (IOException e10) {
            v vVar = new v(27, "Flushing frames to the server failed: " + e10.getMessage(), e10);
            ab.q qVar = this.f56570a.d;
            qVar.d(vVar);
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
            throw vVar;
        }
    }

    public final void c() {
        boolean z10;
        u uVar = this.f56570a;
        synchronized (uVar.f56547g) {
            uVar.f56555p = true;
            z10 = uVar.f56554o;
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
                        this.f56570a.f56548i.flush();
                    } catch (IOException unused) {
                    }
                } else if (j3 == 2) {
                    continue;
                } else {
                    try {
                        i(false);
                    } catch (v unused2) {
                    }
                }
            }
            try {
                i(true);
                return;
            } catch (v unused3) {
                return;
            }
        }
    }

    public final void d() {
        u uVar = this.f56570a;
        x xVar = this.f56497e;
        synchronized (uVar.f56547g) {
            try {
                uVar.f56557r = true;
                uVar.f56559t = xVar;
                if (!uVar.f56556q) {
                    return;
                }
                uVar.d();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f(rc.x r9) {
        throw new UnsupportedOperationException("Method not decompiled: rc.a0.f(rc.x):void");
    }

    public final void g() {
        synchronized (this) {
            this.d = true;
            notifyAll();
        }
    }

    public final void h(x xVar) {
        int i7;
        byte[] bArr;
        byte[] bArr2;
        o oVar = this.f56496c;
        boolean z10 = true;
        if (oVar != null && (((i7 = xVar.f56567e) == 1 || i7 == 2) && xVar.f56564a && !xVar.f56565b && (bArr = xVar.f56569g) != null && bArr.length != 0)) {
            try {
                bArr2 = oVar.b(bArr);
            } catch (v unused) {
                bArr2 = bArr;
            }
            if (bArr.length > bArr2.length) {
                xVar.c(bArr2);
                xVar.f56565b = true;
            }
        }
        ArrayList arrayList = (ArrayList) this.f56570a.d.p();
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            h1 h1Var = (h1) obj;
            try {
                try {
                    h1Var.getClass();
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                h1Var.getClass();
            }
        }
        if (this.f56497e != null) {
            ArrayList arrayList2 = (ArrayList) this.f56570a.d.p();
            int size2 = arrayList2.size();
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                h1 h1Var2 = (h1) obj2;
                try {
                    try {
                        h1Var2.getClass();
                    } catch (Throwable unused4) {
                        h1Var2.getClass();
                    }
                } catch (Throwable unused5) {
                }
            }
            return;
        }
        int i12 = xVar.f56567e;
        if (i12 == 8) {
            this.f56497e = xVar;
        }
        if (i12 == 8) {
            r0 r0Var = this.f56570a.f56543b;
            synchronized (r0Var) {
                int i13 = r0Var.f10687a;
                if (i13 != 4 && i13 != 5) {
                    r0Var.f10687a = 4;
                    if (r0Var.f10688b == 1) {
                        r0Var.f10688b = 3;
                    }
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                this.f56570a.d.f();
            }
        }
        try {
            this.f56570a.f56548i.a(xVar);
            ArrayList arrayList3 = (ArrayList) this.f56570a.d.p();
            int size3 = arrayList3.size();
            while (i10 < size3) {
                Object obj3 = arrayList3.get(i10);
                i10++;
                h1 h1Var3 = (h1) obj3;
                try {
                    try {
                        h1Var3.getClass();
                    } catch (Throwable unused6) {
                        h1Var3.getClass();
                    }
                } catch (Throwable unused7) {
                }
            }
        } catch (IOException e10) {
            v vVar = new v(26, "An I/O error occurred when a frame was tried to be sent: " + e10.getMessage(), e10);
            ab.q qVar = this.f56570a.d;
            qVar.d(vVar);
            ArrayList arrayList4 = (ArrayList) qVar.p();
            int size4 = arrayList4.size();
            while (i10 < size4) {
                Object obj4 = arrayList4.get(i10);
                i10++;
                h1 h1Var4 = (h1) obj4;
                try {
                    try {
                        h1Var4.getClass();
                    } catch (Throwable unused8) {
                        h1Var4.getClass();
                    }
                } catch (Throwable unused9) {
                }
            }
            throw vVar;
        }
    }

    public final void i(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: rc.a0.i(boolean):void");
    }

    public final int j() {
        synchronized (this) {
            try {
                if (this.d) {
                    return 1;
                }
                if (this.f56497e != null) {
                    return 1;
                }
                if (this.f56495b.size() == 0) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
                if (this.d) {
                    return 1;
                }
                if (this.f56495b.size() == 0) {
                    return 2;
                }
                return 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
