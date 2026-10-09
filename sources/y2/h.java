package y2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
public final class h extends Handler implements Runnable {
    public final int f51686a;
    public final i f51687b;
    public final long f51688c;
    public g d;
    public IOException f51689e;
    public int f51690f;
    public Thread h;
    public boolean f51691n;
    public volatile boolean f51692r;
    public final l f51693s;

    public h(l lVar, Looper looper, i iVar, g gVar, int i10, long j3) {
        super(looper);
        this.f51693s = lVar;
        this.f51687b = iVar;
        this.d = gVar;
        this.f51686a = i10;
        this.f51688c = j3;
    }

    public final void a(boolean z10) {
        this.f51692r = z10;
        this.f51689e = null;
        if (hasMessages(1)) {
            this.f51691n = true;
            removeMessages(1);
            if (!z10) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f51691n = true;
                    this.f51687b.v();
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
            this.f51693s.f51697b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            g gVar = this.d;
            gVar.getClass();
            gVar.O0(this.f51687b, elapsedRealtime, elapsedRealtime - this.f51688c, true);
            this.d = null;
        }
    }

    public final void b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - this.f51688c;
        g gVar = this.d;
        gVar.getClass();
        gVar.C(this.f51687b, elapsedRealtime, j3, this.f51690f);
        this.f51689e = null;
        l lVar = this.f51693s;
        z2.a aVar = lVar.f51696a;
        h hVar = lVar.f51697b;
        hVar.getClass();
        aVar.execute(hVar);
    }

    @Override
    public final void handleMessage(Message message) {
        boolean z10;
        if (!this.f51692r) {
            int i10 = message.what;
            if (i10 == 1) {
                b();
            } else if (i10 != 4) {
                this.f51693s.f51697b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = elapsedRealtime - this.f51688c;
                g gVar = this.d;
                gVar.getClass();
                if (this.f51691n) {
                    gVar.O0(this.f51687b, elapsedRealtime, j3, false);
                    return;
                }
                int i11 = message.what;
                if (i11 != 2) {
                    if (i11 == 3) {
                        IOException iOException = (IOException) message.obj;
                        this.f51689e = iOException;
                        int i12 = this.f51690f + 1;
                        this.f51690f = i12;
                        k4.d y3 = gVar.y(this.f51687b, elapsedRealtime, j3, iOException, i12);
                        int i13 = y3.f14622a;
                        if (i13 == 3) {
                            this.f51693s.f51698c = this.f51689e;
                            return;
                        } else if (i13 != 2) {
                            if (i13 == 1) {
                                this.f51690f = 1;
                            }
                            long j10 = y3.f14623b;
                            if (j10 == -9223372036854775807L) {
                                j10 = Math.min((this.f51690f - 1) * 1000, 5000);
                            }
                            l lVar = this.f51693s;
                            if (lVar.f51697b == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            e2.d.g(z10);
                            lVar.f51697b = this;
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
                    gVar.F(this.f51687b, elapsedRealtime, j3);
                } catch (RuntimeException e7) {
                    e2.a.f("LoadTask", "Unexpected exception handling load completed", e7);
                    this.f51693s.f51698c = new k(e7);
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
                z10 = this.f51691n;
                this.h = Thread.currentThread();
            }
            if (!z10) {
                Trace.beginSection("load:".concat(this.f51687b.getClass().getSimpleName()));
                try {
                    this.f51687b.a();
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
            if (!this.f51692r) {
                sendEmptyMessage(2);
            }
        } catch (IOException e7) {
            if (!this.f51692r) {
                obtainMessage(3, e7).sendToTarget();
            }
        } catch (Exception e10) {
            if (!this.f51692r) {
                e2.a.f("LoadTask", "Unexpected exception loading stream", e10);
                obtainMessage(3, new k(e10)).sendToTarget();
            }
        } catch (OutOfMemoryError e11) {
            if (!this.f51692r) {
                e2.a.f("LoadTask", "OutOfMemory error loading stream", e11);
                obtainMessage(3, new k(e11)).sendToTarget();
            }
        } catch (Error e12) {
            if (!this.f51692r) {
                e2.a.f("LoadTask", "Unexpected error loading stream", e12);
                obtainMessage(4, e12).sendToTarget();
            }
            throw e12;
        }
    }
}
