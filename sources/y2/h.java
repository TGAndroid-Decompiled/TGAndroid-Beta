package y2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
public final class h extends Handler implements Runnable {
    public final int f51918a;
    public final i f51919b;
    public final long f51920c;
    public g d;
    public IOException f51921e;
    public int f51922f;
    public Thread h;
    public boolean f51923n;
    public volatile boolean f51924r;
    public final l f51925s;

    public h(l lVar, Looper looper, i iVar, g gVar, int i10, long j3) {
        super(looper);
        this.f51925s = lVar;
        this.f51919b = iVar;
        this.d = gVar;
        this.f51918a = i10;
        this.f51920c = j3;
    }

    public final void a(boolean z10) {
        this.f51924r = z10;
        this.f51921e = null;
        if (hasMessages(1)) {
            this.f51923n = true;
            removeMessages(1);
            if (!z10) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f51923n = true;
                    this.f51919b.C();
                    Thread thread = this.h;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (z10) {
            this.f51925s.f51929b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            g gVar = this.d;
            gVar.getClass();
            gVar.H(this.f51919b, elapsedRealtime, elapsedRealtime - this.f51920c, true);
            this.d = null;
        }
    }

    public final void b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - this.f51920c;
        g gVar = this.d;
        gVar.getClass();
        gVar.y(this.f51919b, elapsedRealtime, j3, this.f51922f);
        this.f51921e = null;
        l lVar = this.f51925s;
        z2.a aVar = lVar.f51928a;
        h hVar = lVar.f51929b;
        hVar.getClass();
        aVar.execute(hVar);
    }

    @Override
    public final void handleMessage(Message message) {
        boolean z10;
        if (!this.f51924r) {
            int i10 = message.what;
            if (i10 == 1) {
                b();
            } else if (i10 != 4) {
                this.f51925s.f51929b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = elapsedRealtime - this.f51920c;
                g gVar = this.d;
                gVar.getClass();
                if (this.f51923n) {
                    gVar.H(this.f51919b, elapsedRealtime, j3, false);
                    return;
                }
                int i11 = message.what;
                if (i11 != 2) {
                    if (i11 == 3) {
                        IOException iOException = (IOException) message.obj;
                        this.f51921e = iOException;
                        int i12 = this.f51922f + 1;
                        this.f51922f = i12;
                        k4.d x10 = gVar.x(this.f51919b, elapsedRealtime, j3, iOException, i12);
                        int i13 = x10.f14619a;
                        if (i13 == 3) {
                            this.f51925s.f51930c = this.f51921e;
                            return;
                        } else if (i13 != 2) {
                            if (i13 == 1) {
                                this.f51922f = 1;
                            }
                            long j10 = x10.f14620b;
                            if (j10 == -9223372036854775807L) {
                                j10 = Math.min((this.f51922f - 1) * 1000, 5000);
                            }
                            l lVar = this.f51925s;
                            if (lVar.f51929b == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            e2.d.g(z10);
                            lVar.f51929b = this;
                            if (j10 > 0) {
                                sendEmptyMessageDelayed(1, j10);
                                return;
                            } else {
                                b();
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    return;
                }
                try {
                    gVar.C(this.f51919b, elapsedRealtime, j3);
                } catch (RuntimeException e7) {
                    e2.a.f("LoadTask", "Unexpected exception handling load completed", e7);
                    this.f51925s.f51930c = new k(e7);
                }
            } else {
                throw ((Error) message.obj);
            }
        }
    }

    @Override
    public final void run() {
        boolean z10;
        try {
            synchronized (this) {
                z10 = this.f51923n;
                this.h = Thread.currentThread();
            }
            if (!z10) {
                Trace.beginSection("load:".concat(this.f51919b.getClass().getSimpleName()));
                try {
                    this.f51919b.a();
                    Trace.endSection();
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            }
            synchronized (this) {
                this.h = null;
                Thread.interrupted();
            }
            if (!this.f51924r) {
                sendEmptyMessage(2);
            }
        } catch (IOException e7) {
            if (!this.f51924r) {
                obtainMessage(3, e7).sendToTarget();
            }
        } catch (Exception e10) {
            if (!this.f51924r) {
                e2.a.f("LoadTask", "Unexpected exception loading stream", e10);
                obtainMessage(3, new k(e10)).sendToTarget();
            }
        } catch (OutOfMemoryError e11) {
            if (!this.f51924r) {
                e2.a.f("LoadTask", "OutOfMemory error loading stream", e11);
                obtainMessage(3, new k(e11)).sendToTarget();
            }
        } catch (Error e12) {
            if (!this.f51924r) {
                e2.a.f("LoadTask", "Unexpected error loading stream", e12);
                obtainMessage(4, e12).sendToTarget();
            }
            throw e12;
        }
    }
}
