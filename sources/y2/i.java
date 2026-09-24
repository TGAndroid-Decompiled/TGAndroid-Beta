package y2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
public final class i extends Handler implements Runnable {
    public final int f46555a;
    public final j f46556b;
    public final long f46557c;
    public h d;
    public IOException e;
    public int f46558f;
    public Thread h;
    public boolean f46559n;
    public volatile boolean f46560r;
    public final m f46561s;

    public i(m mVar, Looper looper, j jVar, h hVar, int i10, long j3) {
        super(looper);
        this.f46561s = mVar;
        this.f46556b = jVar;
        this.d = hVar;
        this.f46555a = i10;
        this.f46557c = j3;
    }

    public final void a(boolean z10) {
        this.f46560r = z10;
        this.e = null;
        if (hasMessages(1)) {
            this.f46559n = true;
            removeMessages(1);
            if (!z10) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f46559n = true;
                    this.f46556b.D();
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
            this.f46561s.f46564b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            h hVar = this.d;
            hVar.getClass();
            hVar.E(this.f46556b, elapsedRealtime, elapsedRealtime - this.f46557c, true);
            this.d = null;
        }
    }

    public final void b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - this.f46557c;
        h hVar = this.d;
        hVar.getClass();
        hVar.n(this.f46556b, elapsedRealtime, j3, this.f46558f);
        this.e = null;
        m mVar = this.f46561s;
        z2.a aVar = mVar.f46563a;
        i iVar = mVar.f46564b;
        iVar.getClass();
        aVar.execute(iVar);
    }

    @Override
    public final void handleMessage(Message message) {
        boolean z10;
        if (!this.f46560r) {
            int i10 = message.what;
            if (i10 == 1) {
                b();
            } else if (i10 != 4) {
                this.f46561s.f46564b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = elapsedRealtime - this.f46557c;
                h hVar = this.d;
                hVar.getClass();
                if (this.f46559n) {
                    hVar.E(this.f46556b, elapsedRealtime, j3, false);
                    return;
                }
                int i11 = message.what;
                if (i11 != 2) {
                    if (i11 == 3) {
                        IOException iOException = (IOException) message.obj;
                        this.e = iOException;
                        int i12 = this.f46558f + 1;
                        this.f46558f = i12;
                        k4.d m10 = hVar.m(this.f46556b, elapsedRealtime, j3, iOException, i12);
                        int i13 = m10.f13420a;
                        if (i13 == 3) {
                            this.f46561s.f46565c = this.e;
                            return;
                        } else if (i13 != 2) {
                            if (i13 == 1) {
                                this.f46558f = 1;
                            }
                            long j10 = m10.f13421b;
                            if (j10 == -9223372036854775807L) {
                                j10 = Math.min((this.f46558f - 1) * 1000, 5000);
                            }
                            m mVar = this.f46561s;
                            if (mVar.f46564b == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            e2.d.g(z10);
                            mVar.f46564b = this;
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
                    hVar.o(this.f46556b, elapsedRealtime, j3);
                } catch (RuntimeException e) {
                    e2.a.f("LoadTask", "Unexpected exception handling load completed", e);
                    this.f46561s.f46565c = new l(e);
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
                z10 = this.f46559n;
                this.h = Thread.currentThread();
            }
            if (!z10) {
                Trace.beginSection("load:".concat(this.f46556b.getClass().getSimpleName()));
                try {
                    this.f46556b.a();
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
            if (!this.f46560r) {
                sendEmptyMessage(2);
            }
        } catch (IOException e) {
            if (!this.f46560r) {
                obtainMessage(3, e).sendToTarget();
            }
        } catch (Exception e7) {
            if (!this.f46560r) {
                e2.a.f("LoadTask", "Unexpected exception loading stream", e7);
                obtainMessage(3, new l(e7)).sendToTarget();
            }
        } catch (OutOfMemoryError e10) {
            if (!this.f46560r) {
                e2.a.f("LoadTask", "OutOfMemory error loading stream", e10);
                obtainMessage(3, new l(e10)).sendToTarget();
            }
        } catch (Error e11) {
            if (!this.f46560r) {
                e2.a.f("LoadTask", "Unexpected error loading stream", e11);
                obtainMessage(4, e11).sendToTarget();
            }
            throw e11;
        }
    }
}
