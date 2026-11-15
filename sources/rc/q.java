package rc;

import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.ui.Wallet.x0;
public final class q extends z {
    public boolean f55949b;
    public x f55950c;
    public final ArrayList d;
    public final o f55951e;
    public final Object f55952f;
    public Timer h;
    public h6.r f55953n;
    public long f55954r;
    public boolean f55955s;

    public q(u uVar) {
        super("ReadingThread", uVar, 1);
        this.d = new ArrayList();
        this.f55952f = new Object();
        this.f55951e = uVar.f55986u;
    }

    @Override
    public final void a() {
        try {
            h();
        } catch (Throwable th2) {
            v vVar = new v(38, "An uncaught throwable was detected in the reading thread: " + th2.getMessage(), th2);
            ab.q qVar = this.f55996a.d;
            qVar.d(vVar);
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
                    }
                } catch (Throwable unused2) {
                    x0Var.getClass();
                }
            }
        }
        u uVar = this.f55996a;
        x xVar = this.f55950c;
        synchronized (uVar.f55973g) {
            try {
                uVar.f55982q = true;
                uVar.f55984s = xVar;
                if (uVar.f55983r) {
                    uVar.d();
                }
            } finally {
            }
        }
    }

    public final void b() {
        ArrayList arrayList = (ArrayList) this.f55996a.d.p();
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

    public final void c(byte[] bArr) {
        u uVar = this.f55996a;
        uVar.getClass();
        ab.q qVar = uVar.d;
        int i7 = 0;
        try {
            SecureRandom secureRandom = k.f55943a;
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
                x0 x0Var = (x0) obj;
                try {
                    try {
                        x0Var.b((u) qVar.f989b, str);
                    } catch (Throwable unused2) {
                    }
                } catch (Throwable unused3) {
                    x0Var.getClass();
                }
            }
        } catch (Throwable th2) {
            uVar.d.d(new v(37, "Failed to convert payload data into a string: " + th2.getMessage(), th2));
            ArrayList arrayList2 = (ArrayList) qVar.p();
            int size2 = arrayList2.size();
            while (i7 < size2) {
                Object obj2 = arrayList2.get(i7);
                i7++;
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
        }
    }

    public final void d() {
        synchronized (this.f55952f) {
            Timer timer = this.h;
            if (timer != null) {
                timer.cancel();
                this.h = null;
            }
            h6.r rVar = this.f55953n;
            if (rVar != null) {
                rVar.cancel();
                this.f55953n = null;
            }
        }
    }

    public final byte[] f(byte[] bArr) {
        try {
            return this.f55951e.c(bArr);
        } catch (v e10) {
            u uVar = this.f55996a;
            uVar.d.d(e10);
            ArrayList arrayList = (ArrayList) uVar.d.p();
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
                if (this.f55949b) {
                    return;
                }
                this.f55949b = true;
                interrupt();
                this.f55954r = 10000L;
                j();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void j() {
        synchronized (this.f55952f) {
            Timer timer = this.h;
            if (timer != null) {
                timer.cancel();
                this.h = null;
            }
            h6.r rVar = this.f55953n;
            if (rVar != null) {
                rVar.cancel();
                this.f55953n = null;
            }
            this.f55953n = new h6.r(this, 5);
            Timer timer2 = new Timer("ReadingThreadCloseTimer");
            this.h = timer2;
            timer2.schedule(this.f55953n, this.f55954r);
        }
    }

    public final void k(x xVar) {
        byte[] bArr;
        int i7;
        this.f55996a.getClass();
        boolean z10 = true;
        if ((this.f55951e != null && ((i7 = xVar.f55993e) == 1 || i7 == 2)) || !xVar.f55991b) {
            if (!xVar.f55992c) {
                if (!xVar.d) {
                    int i10 = xVar.f55993e;
                    if (i10 != 0 && i10 != 1 && i10 != 2) {
                        switch (i10) {
                            case 8:
                            case 9:
                            case 10:
                                break;
                            default:
                                throw new v(31, "A frame has an unknown opcode: 0x" + Integer.toHexString(xVar.f55993e));
                        }
                    }
                    if (!xVar.f55994f) {
                        if (8 <= i10 && i10 <= 15) {
                            if (!xVar.f55990a) {
                                throw new v(32, "A control frame is fragmented.");
                            }
                        } else {
                            if (this.d.size() == 0) {
                                z10 = false;
                            }
                            if (xVar.f55993e == 0) {
                                if (!z10) {
                                    throw new v(33, "A continuation frame was detected although a continuation had not started.");
                                }
                            } else if (z10) {
                                throw new v(34, "A non-control frame was detected although the existing continuation had not been closed.");
                            }
                        }
                        int i11 = xVar.f55993e;
                        if (8 > i11 || i11 > 15 || (bArr = xVar.f55995g) == null || 125 >= bArr.length) {
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
