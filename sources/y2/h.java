package y2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
import v7.u6;
public final class h extends Handler implements Runnable {
    public final int f49917a;
    public final i f49918b;
    public final long f49919c;
    public g d;
    public IOException e;
    public int f49920f;
    public Thread h;
    public boolean f49921n;
    public volatile boolean f49922r;
    public final l f49923s;

    public h(l lVar, Looper looper, i iVar, g gVar, int i10, long j10) {
        super(looper);
        this.f49923s = lVar;
        this.f49918b = iVar;
        this.d = gVar;
        this.f49917a = i10;
        this.f49919c = j10;
    }

    public final void a(boolean z10) {
        this.f49922r = z10;
        this.e = null;
        if (hasMessages(1)) {
            this.f49921n = true;
            removeMessages(1);
            if (!z10) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f49921n = true;
                    this.f49918b.O();
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
            this.f49923s.f49926b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            g gVar = this.d;
            gVar.getClass();
            gVar.I(this.f49918b, elapsedRealtime, elapsedRealtime - this.f49919c, true);
            this.d = null;
        }
    }

    public final void b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - this.f49919c;
        g gVar = this.d;
        gVar.getClass();
        gVar.l(this.f49918b, elapsedRealtime, j10, this.f49920f);
        this.e = null;
        l lVar = this.f49923s;
        z2.a aVar = lVar.f49925a;
        h hVar = lVar.f49926b;
        hVar.getClass();
        aVar.execute(hVar);
    }

    @Override
    public final void handleMessage(Message message) {
        boolean z10;
        if (!this.f49922r) {
            int i10 = message.what;
            if (i10 == 1) {
                b();
            } else if (i10 != 4) {
                this.f49923s.f49926b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = elapsedRealtime - this.f49919c;
                g gVar = this.d;
                gVar.getClass();
                if (this.f49921n) {
                    gVar.I(this.f49918b, elapsedRealtime, j10, false);
                    return;
                }
                int i11 = message.what;
                if (i11 != 2) {
                    if (i11 == 3) {
                        IOException iOException = (IOException) message.obj;
                        this.e = iOException;
                        int i12 = this.f49920f + 1;
                        this.f49920f = i12;
                        k4.d j11 = gVar.j(this.f49918b, elapsedRealtime, j10, iOException, i12);
                        int i13 = j11.f14895a;
                        if (i13 == 3) {
                            this.f49923s.f49927c = this.e;
                            return;
                        } else if (i13 != 2) {
                            if (i13 == 1) {
                                this.f49920f = 1;
                            }
                            long j12 = j11.f14896b;
                            if (j12 == -9223372036854775807L) {
                                j12 = Math.min((this.f49920f - 1) * 1000, 5000);
                            }
                            l lVar = this.f49923s;
                            if (lVar.f49926b == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            u6.p(z10);
                            lVar.f49926b = this;
                            if (j12 > 0) {
                                sendEmptyMessageDelayed(1, j12);
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
                    gVar.n(this.f49918b, elapsedRealtime, j10);
                } catch (RuntimeException e) {
                    e2.a.d("LoadTask", "Unexpected exception handling load completed", e);
                    this.f49923s.f49927c = new k(e);
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
                z10 = this.f49921n;
                this.h = Thread.currentThread();
            }
            if (!z10) {
                Trace.beginSection("load:".concat(this.f49918b.getClass().getSimpleName()));
                try {
                    this.f49918b.a();
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
            if (!this.f49922r) {
                sendEmptyMessage(2);
            }
        } catch (IOException e) {
            if (!this.f49922r) {
                obtainMessage(3, e).sendToTarget();
            }
        } catch (Exception e7) {
            if (!this.f49922r) {
                e2.a.d("LoadTask", "Unexpected exception loading stream", e7);
                obtainMessage(3, new k(e7)).sendToTarget();
            }
        } catch (OutOfMemoryError e10) {
            if (!this.f49922r) {
                e2.a.d("LoadTask", "OutOfMemory error loading stream", e10);
                obtainMessage(3, new k(e10)).sendToTarget();
            }
        } catch (Error e11) {
            if (!this.f49922r) {
                e2.a.d("LoadTask", "Unexpected error loading stream", e11);
                obtainMessage(4, e11).sendToTarget();
            }
            throw e11;
        }
    }
}
