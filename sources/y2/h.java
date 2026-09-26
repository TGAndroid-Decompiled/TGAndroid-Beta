package y2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
public final class h extends Handler implements Runnable {
    public final int f46565a;
    public final i f46566b;
    public final long f46567c;
    public g d;
    public IOException e;
    public int f46568f;
    public Thread h;
    public boolean f46569n;
    public volatile boolean f46570r;
    public final l f46571s;

    public h(l lVar, Looper looper, i iVar, g gVar, int i10, long j3) {
        super(looper);
        this.f46571s = lVar;
        this.f46566b = iVar;
        this.d = gVar;
        this.f46565a = i10;
        this.f46567c = j3;
    }

    public final void a(boolean z10) {
        this.f46570r = z10;
        this.e = null;
        if (hasMessages(1)) {
            this.f46569n = true;
            removeMessages(1);
            if (!z10) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f46569n = true;
                    this.f46566b.D();
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
            this.f46571s.f46574b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            g gVar = this.d;
            gVar.getClass();
            gVar.E(this.f46566b, elapsedRealtime, elapsedRealtime - this.f46567c, true);
            this.d = null;
        }
    }

    public final void b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - this.f46567c;
        g gVar = this.d;
        gVar.getClass();
        gVar.n(this.f46566b, elapsedRealtime, j3, this.f46568f);
        this.e = null;
        l lVar = this.f46571s;
        z2.a aVar = lVar.f46573a;
        h hVar = lVar.f46574b;
        hVar.getClass();
        aVar.execute(hVar);
    }

    @Override
    public final void handleMessage(Message message) {
        boolean z10;
        if (!this.f46570r) {
            int i10 = message.what;
            if (i10 == 1) {
                b();
            } else if (i10 != 4) {
                this.f46571s.f46574b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = elapsedRealtime - this.f46567c;
                g gVar = this.d;
                gVar.getClass();
                if (this.f46569n) {
                    gVar.E(this.f46566b, elapsedRealtime, j3, false);
                    return;
                }
                int i11 = message.what;
                if (i11 != 2) {
                    if (i11 == 3) {
                        IOException iOException = (IOException) message.obj;
                        this.e = iOException;
                        int i12 = this.f46568f + 1;
                        this.f46568f = i12;
                        k4.d m10 = gVar.m(this.f46566b, elapsedRealtime, j3, iOException, i12);
                        int i13 = m10.f13420a;
                        if (i13 == 3) {
                            this.f46571s.f46575c = this.e;
                            return;
                        } else if (i13 != 2) {
                            if (i13 == 1) {
                                this.f46568f = 1;
                            }
                            long j10 = m10.f13421b;
                            if (j10 == -9223372036854775807L) {
                                j10 = Math.min((this.f46568f - 1) * 1000, 5000);
                            }
                            l lVar = this.f46571s;
                            if (lVar.f46574b == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            e2.d.g(z10);
                            lVar.f46574b = this;
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
                    gVar.o(this.f46566b, elapsedRealtime, j3);
                } catch (RuntimeException e) {
                    e2.a.f("LoadTask", "Unexpected exception handling load completed", e);
                    this.f46571s.f46575c = new k(e);
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
                z10 = this.f46569n;
                this.h = Thread.currentThread();
            }
            if (!z10) {
                Trace.beginSection("load:".concat(this.f46566b.getClass().getSimpleName()));
                try {
                    this.f46566b.a();
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
            if (!this.f46570r) {
                sendEmptyMessage(2);
            }
        } catch (IOException e) {
            if (!this.f46570r) {
                obtainMessage(3, e).sendToTarget();
            }
        } catch (Exception e7) {
            if (!this.f46570r) {
                e2.a.f("LoadTask", "Unexpected exception loading stream", e7);
                obtainMessage(3, new k(e7)).sendToTarget();
            }
        } catch (OutOfMemoryError e10) {
            if (!this.f46570r) {
                e2.a.f("LoadTask", "OutOfMemory error loading stream", e10);
                obtainMessage(3, new k(e10)).sendToTarget();
            }
        } catch (Error e11) {
            if (!this.f46570r) {
                e2.a.f("LoadTask", "Unexpected error loading stream", e11);
                obtainMessage(4, e11).sendToTarget();
            }
            throw e11;
        }
    }
}
