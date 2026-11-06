package rc;

import fi.h2;
import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.ui.Wallet.z0;
public final class q extends z {
    public boolean f54349b;
    public x f54350c;
    public final ArrayList d;
    public final o f54351e;
    public final Object f54352f;
    public Timer h;
    public h2 f54353n;
    public long f54354r;
    public boolean f54355s;

    public q(u uVar) {
        super("ReadingThread", uVar, 1);
        this.d = new ArrayList();
        this.f54352f = new Object();
        this.f54351e = uVar.f54386u;
    }

    @Override
    public final void a() {
        try {
            h();
        } catch (Throwable th2) {
            v vVar = new v(38, "An uncaught throwable was detected in the reading thread: " + th2.getMessage(), th2);
            ab.q qVar = this.f54396a.d;
            qVar.d(vVar);
            ArrayList arrayList = (ArrayList) qVar.p();
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
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
        u uVar = this.f54396a;
        x xVar = this.f54350c;
        synchronized (uVar.f54373g) {
            try {
                uVar.f54382q = true;
                uVar.f54384s = xVar;
                if (uVar.f54383r) {
                    uVar.d();
                }
            } finally {
            }
        }
    }

    public final void b() {
        ArrayList arrayList = (ArrayList) this.f54396a.d.p();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
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

    public final void c(byte[] bArr) {
        u uVar = this.f54396a;
        uVar.getClass();
        ab.q qVar = uVar.d;
        int i7 = 0;
        try {
            SecureRandom secureRandom = k.f54343a;
            String str = null;
            if (bArr != null) {
                try {
                    str = new String(bArr, 0, bArr.length, "UTF-8");
                } catch (UnsupportedEncodingException | IndexOutOfBoundsException unused) {
                }
            }
            ArrayList arrayList = (ArrayList) qVar.p();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                z0 z0Var = (z0) obj;
                try {
                    try {
                        z0Var.b((u) qVar.f990b, str);
                    } catch (Throwable unused2) {
                    }
                } catch (Throwable unused3) {
                    z0Var.getClass();
                }
            }
        } catch (Throwable th2) {
            uVar.d.d(new v(37, "Failed to convert payload data into a string: " + th2.getMessage(), th2));
            ArrayList arrayList2 = (ArrayList) qVar.p();
            int size2 = arrayList2.size();
            while (i7 < size2) {
                Object obj2 = arrayList2.get(i7);
                i7++;
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
        }
    }

    public final void d() {
        synchronized (this.f54352f) {
            Timer timer = this.h;
            if (timer != null) {
                timer.cancel();
                this.h = null;
            }
            h2 h2Var = this.f54353n;
            if (h2Var != null) {
                h2Var.cancel();
                this.f54353n = null;
            }
        }
    }

    public final byte[] f(byte[] bArr) {
        try {
            return this.f54351e.c(bArr);
        } catch (v e10) {
            u uVar = this.f54396a;
            uVar.d.d(e10);
            ArrayList arrayList = (ArrayList) uVar.d.p();
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
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
            uVar.g(x.a(1003, e10.getMessage()));
            return null;
        }
    }

    public final boolean g(rc.x r10) {
        throw new UnsupportedOperationException("Method not decompiled: rc.q.g(rc.x):boolean");
    }

    public final void h() {
        throw new UnsupportedOperationException("Method not decompiled: rc.q.h():void");
    }

    public final void i() {
        synchronized (this) {
            try {
                if (this.f54349b) {
                    return;
                }
                this.f54349b = true;
                interrupt();
                this.f54354r = 10000L;
                j();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void j() {
        synchronized (this.f54352f) {
            Timer timer = this.h;
            if (timer != null) {
                timer.cancel();
                this.h = null;
            }
            h2 h2Var = this.f54353n;
            if (h2Var != null) {
                h2Var.cancel();
                this.f54353n = null;
            }
            this.f54353n = new h2(this, 5);
            Timer timer2 = new Timer("ReadingThreadCloseTimer");
            this.h = timer2;
            timer2.schedule(this.f54353n, this.f54354r);
        }
    }

    public final void k(x xVar) {
        byte[] bArr;
        int i7;
        this.f54396a.getClass();
        boolean z9 = true;
        if ((this.f54351e != null && ((i7 = xVar.f54393e) == 1 || i7 == 2)) || !xVar.f54391b) {
            if (!xVar.f54392c) {
                if (!xVar.d) {
                    int i10 = xVar.f54393e;
                    if (i10 != 0 && i10 != 1 && i10 != 2) {
                        switch (i10) {
                            case 8:
                            case 9:
                            case 10:
                                break;
                            default:
                                throw new v(31, "A frame has an unknown opcode: 0x" + Integer.toHexString(xVar.f54393e));
                        }
                    }
                    if (!xVar.f54394f) {
                        if (8 <= i10 && i10 <= 15) {
                            if (!xVar.f54390a) {
                                throw new v(32, "A control frame is fragmented.");
                            }
                        } else {
                            if (this.d.size() == 0) {
                                z9 = false;
                            }
                            if (xVar.f54393e == 0) {
                                if (!z9) {
                                    throw new v(33, "A continuation frame was detected although a continuation had not started.");
                                }
                            } else if (z9) {
                                throw new v(34, "A non-control frame was detected although the existing continuation had not been closed.");
                            }
                        }
                        int i11 = xVar.f54393e;
                        if (8 > i11 || i11 > 15 || (bArr = xVar.f54395g) == null || 125 >= bArr.length) {
                            return;
                        }
                        throw new v(35, "The payload size of a control frame exceeds the maximum size (125 bytes): " + bArr.length);
                    }
                    throw new v(30, "A frame from the server is masked.");
                }
                throw new v(29, "The RSV3 bit of a frame is set unexpectedly.");
            }
            throw new v(29, "The RSV2 bit of a frame is set unexpectedly.");
        }
        throw new v(29, "The RSV1 bit of a frame is set unexpectedly.");
    }
}
