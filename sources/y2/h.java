package y2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
import v7.u6;
public final class h extends Handler implements Runnable {
    public final int f49916a;
    public final i f49917b;
    public final long f49918c;
    public g d;
    public IOException e;
    public int f49919f;
    public Thread h;
    public boolean f49920n;
    public volatile boolean f49921r;
    public final l f49922s;

    public h(l lVar, Looper looper, i iVar, g gVar, int i10, long j10) {
        super(looper);
        this.f49922s = lVar;
        this.f49917b = iVar;
        this.d = gVar;
        this.f49916a = i10;
        this.f49918c = j10;
    }

    public final void a(boolean z10) {
        this.f49921r = z10;
        this.e = null;
        if (hasMessages(1)) {
            this.f49920n = true;
            removeMessages(1);
            if (!z10) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f49920n = true;
                    this.f49917b.O();
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
            this.f49922s.f49925b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            g gVar = this.d;
            gVar.getClass();
            gVar.J(this.f49917b, elapsedRealtime, elapsedRealtime - this.f49918c, true);
            this.d = null;
        }
    }

    public final void b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - this.f49918c;
        g gVar = this.d;
        gVar.getClass();
        gVar.h(this.f49917b, elapsedRealtime, j10, this.f49919f);
        this.e = null;
        l lVar = this.f49922s;
        z2.a aVar = lVar.f49924a;
        h hVar = lVar.f49925b;
        hVar.getClass();
        aVar.execute(hVar);
    }

    @Override
    public final void handleMessage(Message message) {
        boolean z10;
        if (!this.f49921r) {
            int i10 = message.what;
            if (i10 == 1) {
                b();
            } else if (i10 != 4) {
                this.f49922s.f49925b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = elapsedRealtime - this.f49918c;
                g gVar = this.d;
                gVar.getClass();
                if (this.f49920n) {
                    gVar.J(this.f49917b, elapsedRealtime, j10, false);
                    return;
                }
                int i11 = message.what;
                if (i11 != 2) {
                    if (i11 == 3) {
                        IOException iOException = (IOException) message.obj;
                        this.e = iOException;
                        int i12 = this.f49919f + 1;
                        this.f49919f = i12;
                        k4.d e = gVar.e(this.f49917b, elapsedRealtime, j10, iOException, i12);
                        int i13 = e.f14898a;
                        if (i13 == 3) {
                            this.f49922s.f49926c = this.e;
                            return;
                        } else if (i13 != 2) {
                            if (i13 == 1) {
                                this.f49919f = 1;
                            }
                            long j11 = e.f14899b;
                            if (j11 == -9223372036854775807L) {
                                j11 = Math.min((this.f49919f - 1) * 1000, 5000);
                            }
                            l lVar = this.f49922s;
                            if (lVar.f49925b == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            u6.p(z10);
                            lVar.f49925b = this;
                            if (j11 > 0) {
                                sendEmptyMessageDelayed(1, j11);
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
                    gVar.k(this.f49917b, elapsedRealtime, j10);
                } catch (RuntimeException e7) {
                    e2.a.d("LoadTask", "Unexpected exception handling load completed", e7);
                    this.f49922s.f49926c = new k(e7);
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
                z10 = this.f49920n;
                this.h = Thread.currentThread();
            }
            if (!z10) {
                Trace.beginSection("load:".concat(this.f49917b.getClass().getSimpleName()));
                try {
                    this.f49917b.a();
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
            if (!this.f49921r) {
                sendEmptyMessage(2);
            }
        } catch (IOException e) {
            if (!this.f49921r) {
                obtainMessage(3, e).sendToTarget();
            }
        } catch (Exception e7) {
            if (!this.f49921r) {
                e2.a.d("LoadTask", "Unexpected exception loading stream", e7);
                obtainMessage(3, new k(e7)).sendToTarget();
            }
        } catch (OutOfMemoryError e10) {
            if (!this.f49921r) {
                e2.a.d("LoadTask", "OutOfMemory error loading stream", e10);
                obtainMessage(3, new k(e10)).sendToTarget();
            }
        } catch (Error e11) {
            if (!this.f49921r) {
                e2.a.d("LoadTask", "Unexpected error loading stream", e11);
                obtainMessage(4, e11).sendToTarget();
            }
            throw e11;
        }
    }
}
