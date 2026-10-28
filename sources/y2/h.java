package y2;

import a8.yb;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
public final class h extends Handler implements Runnable {
    public final int f52014a;
    public final i f52015b;
    public final long f52016c;
    public g d;
    public IOException e;
    public int f52017f;
    public Thread h;
    public boolean f52018n;
    public volatile boolean f52019r;
    public final l f52020s;

    public h(l lVar, Looper looper, i iVar, g gVar, int i10, long j10) {
        super(looper);
        this.f52020s = lVar;
        this.f52015b = iVar;
        this.d = gVar;
        this.f52014a = i10;
        this.f52016c = j10;
    }

    public final void a(boolean z10) {
        this.f52019r = z10;
        this.e = null;
        if (hasMessages(1)) {
            this.f52018n = true;
            removeMessages(1);
            if (!z10) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f52018n = true;
                    this.f52015b.f0();
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
            this.f52020s.f52023b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            g gVar = this.d;
            gVar.getClass();
            gVar.l0(this.f52015b, elapsedRealtime, elapsedRealtime - this.f52016c, true);
            this.d = null;
        }
    }

    public final void b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - this.f52016c;
        g gVar = this.d;
        gVar.getClass();
        gVar.z(this.f52015b, elapsedRealtime, j10, this.f52017f);
        this.e = null;
        l lVar = this.f52020s;
        z2.a aVar = lVar.f52022a;
        h hVar = lVar.f52023b;
        hVar.getClass();
        aVar.execute(hVar);
    }

    @Override
    public final void handleMessage(Message message) {
        boolean z10;
        if (!this.f52019r) {
            int i10 = message.what;
            if (i10 == 1) {
                b();
            } else if (i10 != 4) {
                this.f52020s.f52023b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = elapsedRealtime - this.f52016c;
                g gVar = this.d;
                gVar.getClass();
                if (this.f52018n) {
                    gVar.l0(this.f52015b, elapsedRealtime, j10, false);
                    return;
                }
                int i11 = message.what;
                if (i11 != 2) {
                    if (i11 == 3) {
                        IOException iOException = (IOException) message.obj;
                        this.e = iOException;
                        int i12 = this.f52017f + 1;
                        this.f52017f = i12;
                        k4.d w10 = gVar.w(this.f52015b, elapsedRealtime, j10, iOException, i12);
                        int i13 = w10.f16376a;
                        if (i13 == 3) {
                            this.f52020s.f52024c = this.e;
                            return;
                        } else if (i13 != 2) {
                            if (i13 == 1) {
                                this.f52017f = 1;
                            }
                            long j11 = w10.f16377b;
                            if (j11 == -9223372036854775807L) {
                                j11 = Math.min((this.f52017f - 1) * 1000, 5000);
                            }
                            l lVar = this.f52020s;
                            if (lVar.f52023b == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            yb.p(z10);
                            lVar.f52023b = this;
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
                    gVar.B(this.f52015b, elapsedRealtime, j10);
                } catch (RuntimeException e) {
                    e2.a.d("LoadTask", "Unexpected exception handling load completed", e);
                    this.f52020s.f52024c = new k(e);
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
                z10 = this.f52018n;
                this.h = Thread.currentThread();
            }
            if (!z10) {
                Trace.beginSection("load:".concat(this.f52015b.getClass().getSimpleName()));
                try {
                    this.f52015b.b();
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
            if (!this.f52019r) {
                sendEmptyMessage(2);
            }
        } catch (IOException e) {
            if (!this.f52019r) {
                obtainMessage(3, e).sendToTarget();
            }
        } catch (Exception e10) {
            if (!this.f52019r) {
                e2.a.d("LoadTask", "Unexpected exception loading stream", e10);
                obtainMessage(3, new k(e10)).sendToTarget();
            }
        } catch (OutOfMemoryError e11) {
            if (!this.f52019r) {
                e2.a.d("LoadTask", "OutOfMemory error loading stream", e11);
                obtainMessage(3, new k(e11)).sendToTarget();
            }
        } catch (Error e12) {
            if (!this.f52019r) {
                e2.a.d("LoadTask", "Unexpected error loading stream", e12);
                obtainMessage(4, e12).sendToTarget();
            }
            throw e12;
        }
    }
}
