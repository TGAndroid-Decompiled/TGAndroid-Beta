package tc;

import b2.v0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import org.telegram.ui.Wallet.x0;
public final class a0 extends z {
    public final LinkedList f45567b;
    public final o f45568c;
    public boolean d;
    public x e;
    public boolean f45569f;

    public a0(u uVar) {
        super("WritingThread", uVar, 2);
        this.f45567b = new LinkedList();
        this.f45568c = uVar.f45624u;
    }

    @Override
    public final void a() {
        try {
            c();
        } catch (Throwable th2) {
            v vVar = new v(39, "An uncaught throwable was detected in the writing thread: " + th2.getMessage(), th2);
            c2.b bVar = this.f45633a.d;
            bVar.d(vVar);
            ArrayList arrayList = (ArrayList) bVar.n();
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
                    }
                } catch (Throwable unused2) {
                    x0Var.getClass();
                }
            }
        }
        synchronized (this) {
            this.f45569f = true;
            notifyAll();
        }
        d();
    }

    public final void b() {
        try {
            this.f45633a.f45612i.flush();
            synchronized (this) {
            }
        } catch (IOException e) {
            v vVar = new v(27, "Flushing frames to the server failed: " + e.getMessage(), e);
            c2.b bVar = this.f45633a.d;
            bVar.d(vVar);
            ArrayList arrayList = (ArrayList) bVar.n();
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
            throw vVar;
        }
    }

    public final void c() {
        boolean z10;
        u uVar = this.f45633a;
        synchronized (uVar.f45611g) {
            uVar.f45619p = true;
            z10 = uVar.f45618o;
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
                        this.f45633a.f45612i.flush();
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
        u uVar = this.f45633a;
        x xVar = this.e;
        synchronized (uVar.f45611g) {
            try {
                uVar.f45621r = true;
                uVar.f45623t = xVar;
                if (!uVar.f45620q) {
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
        o oVar = this.f45568c;
        boolean z10 = true;
        if (oVar != null && (((i10 = xVar.e) == 1 || i10 == 2) && xVar.f45628a && !xVar.f45629b && (bArr = xVar.f45632g) != null && bArr.length != 0)) {
            try {
                bArr2 = oVar.b(bArr);
            } catch (v unused) {
                bArr2 = bArr;
            }
            if (bArr.length > bArr2.length) {
                xVar.c(bArr2);
                xVar.f45629b = true;
            }
        }
        ArrayList arrayList = (ArrayList) this.f45633a.d.n();
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            x0 x0Var = (x0) obj;
            try {
                try {
                    x0Var.getClass();
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                x0Var.getClass();
            }
        }
        if (this.e != null) {
            ArrayList arrayList2 = (ArrayList) this.f45633a.d.n();
            int size2 = arrayList2.size();
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                x0 x0Var2 = (x0) obj2;
                try {
                    try {
                        x0Var2.getClass();
                    } catch (Throwable unused4) {
                        x0Var2.getClass();
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
            v0 v0Var = this.f45633a.f45608b;
            synchronized (v0Var) {
                int i14 = v0Var.f2444a;
                if (i14 != 4 && i14 != 5) {
                    v0Var.f2444a = 4;
                    if (v0Var.f2445b == 1) {
                        v0Var.f2445b = 3;
                    }
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                this.f45633a.d.e();
            }
        }
        try {
            this.f45633a.f45612i.a(xVar);
            ArrayList arrayList3 = (ArrayList) this.f45633a.d.n();
            int size3 = arrayList3.size();
            while (i11 < size3) {
                Object obj3 = arrayList3.get(i11);
                i11++;
                x0 x0Var3 = (x0) obj3;
                try {
                    try {
                        x0Var3.getClass();
                    } catch (Throwable unused6) {
                        x0Var3.getClass();
                    }
                } catch (Throwable unused7) {
                }
            }
        } catch (IOException e) {
            v vVar = new v(26, "An I/O error occurred when a frame was tried to be sent: " + e.getMessage(), e);
            c2.b bVar = this.f45633a.d;
            bVar.d(vVar);
            ArrayList arrayList4 = (ArrayList) bVar.n();
            int size4 = arrayList4.size();
            while (i11 < size4) {
                Object obj4 = arrayList4.get(i11);
                i11++;
                x0 x0Var4 = (x0) obj4;
                try {
                    try {
                        x0Var4.getClass();
                    } catch (Throwable unused8) {
                        x0Var4.getClass();
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
                if (this.f45567b.size() == 0) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
                if (this.d) {
                    return 1;
                }
                if (this.f45567b.size() == 0) {
                    return 2;
                }
                return 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
