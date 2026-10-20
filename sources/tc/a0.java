package tc;

import b2.u0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import org.telegram.ui.Wallet.z0;
public final class a0 extends z {
    public final LinkedList f46935b;
    public final o f46936c;
    public boolean d;
    public x e;
    public boolean f46937f;

    public a0(u uVar) {
        super("WritingThread", uVar, 2);
        this.f46935b = new LinkedList();
        this.f46936c = uVar.f46990u;
    }

    @Override
    public final void a() {
        try {
            c();
        } catch (Throwable th2) {
            v vVar = new v(39, "An uncaught throwable was detected in the writing thread: " + th2.getMessage(), th2);
            c2.b bVar = this.f46999a.d;
            bVar.d(vVar);
            ArrayList arrayList = (ArrayList) bVar.n();
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
                    }
                } catch (Throwable unused2) {
                    z0Var.getClass();
                }
            }
        }
        synchronized (this) {
            this.f46937f = true;
            notifyAll();
        }
        d();
    }

    public final void b() {
        try {
            this.f46999a.f46978i.flush();
            synchronized (this) {
            }
        } catch (IOException e) {
            v vVar = new v(27, "Flushing frames to the server failed: " + e.getMessage(), e);
            c2.b bVar = this.f46999a.d;
            bVar.d(vVar);
            ArrayList arrayList = (ArrayList) bVar.n();
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
            throw vVar;
        }
    }

    public final void c() {
        boolean z10;
        u uVar = this.f46999a;
        synchronized (uVar.f46977g) {
            uVar.f46985p = true;
            z10 = uVar.f46984o;
        }
        uVar.a();
        if (z10) {
            uVar.f();
        }
        while (true) {
            int j10 = j();
            if (j10 != 1) {
                if (j10 == 3) {
                    try {
                        this.f46999a.f46978i.flush();
                    } catch (IOException unused) {
                    }
                } else if (j10 == 2) {
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
        u uVar = this.f46999a;
        x xVar = this.e;
        synchronized (uVar.f46977g) {
            try {
                uVar.f46987r = true;
                uVar.f46989t = xVar;
                if (!uVar.f46986q) {
                    return;
                }
                uVar.d();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f(tc.x r9) {
        throw new UnsupportedOperationException("Method not decompiled: tc.a0.f(tc.x):void");
    }

    public final void g() {
        synchronized (this) {
            this.d = true;
            notifyAll();
        }
    }

    public final void h(x xVar) {
        int i10;
        byte[] bArr;
        byte[] bArr2;
        o oVar = this.f46936c;
        boolean z10 = true;
        if (oVar != null && (((i10 = xVar.e) == 1 || i10 == 2) && xVar.f46994a && !xVar.f46995b && (bArr = xVar.f46998g) != null && bArr.length != 0)) {
            try {
                bArr2 = oVar.b(bArr);
            } catch (v unused) {
                bArr2 = bArr;
            }
            if (bArr.length > bArr2.length) {
                xVar.c(bArr2);
                xVar.f46995b = true;
            }
        }
        ArrayList arrayList = (ArrayList) this.f46999a.d.n();
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            z0 z0Var = (z0) obj;
            try {
                try {
                    z0Var.getClass();
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                z0Var.getClass();
            }
        }
        if (this.e != null) {
            ArrayList arrayList2 = (ArrayList) this.f46999a.d.n();
            int size2 = arrayList2.size();
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                z0 z0Var2 = (z0) obj2;
                try {
                    try {
                        z0Var2.getClass();
                    } catch (Throwable unused4) {
                        z0Var2.getClass();
                    }
                } catch (Throwable unused5) {
                }
            }
            return;
        }
        int i13 = xVar.e;
        if (i13 == 8) {
            this.e = xVar;
        }
        if (i13 == 8) {
            u0 u0Var = this.f46999a.f46974b;
            synchronized (u0Var) {
                int i14 = u0Var.f4053a;
                if (i14 != 4 && i14 != 5) {
                    u0Var.f4053a = 4;
                    if (u0Var.f4054b == 1) {
                        u0Var.f4054b = 3;
                    }
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                this.f46999a.d.e();
            }
        }
        try {
            this.f46999a.f46978i.a(xVar);
            ArrayList arrayList3 = (ArrayList) this.f46999a.d.n();
            int size3 = arrayList3.size();
            while (i11 < size3) {
                Object obj3 = arrayList3.get(i11);
                i11++;
                z0 z0Var3 = (z0) obj3;
                try {
                    try {
                        z0Var3.getClass();
                    } catch (Throwable unused6) {
                        z0Var3.getClass();
                    }
                } catch (Throwable unused7) {
                }
            }
        } catch (IOException e) {
            v vVar = new v(26, "An I/O error occurred when a frame was tried to be sent: " + e.getMessage(), e);
            c2.b bVar = this.f46999a.d;
            bVar.d(vVar);
            ArrayList arrayList4 = (ArrayList) bVar.n();
            int size4 = arrayList4.size();
            while (i11 < size4) {
                Object obj4 = arrayList4.get(i11);
                i11++;
                z0 z0Var4 = (z0) obj4;
                try {
                    try {
                        z0Var4.getClass();
                    } catch (Throwable unused8) {
                        z0Var4.getClass();
                    }
                } catch (Throwable unused9) {
                }
            }
            throw vVar;
        }
    }

    public final void i(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: tc.a0.i(boolean):void");
    }

    public final int j() {
        synchronized (this) {
            try {
                if (this.d) {
                    return 1;
                }
                if (this.e != null) {
                    return 1;
                }
                if (this.f46935b.size() == 0) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
                if (this.d) {
                    return 1;
                }
                if (this.f46935b.size() == 0) {
                    return 2;
                }
                return 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
