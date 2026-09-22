package y2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
public final class i extends Handler implements Runnable {
    public final int f46610a;
    public final j f46611b;
    public final long f46612c;
    public h d;
    public IOException e;
    public int f46613f;
    public Thread h;
    public boolean f46614n;
    public volatile boolean f46615r;
    public final m f46616s;

    public i(m mVar, Looper looper, j jVar, h hVar, int i10, long j3) {
        super(looper);
        this.f46616s = mVar;
        this.f46611b = jVar;
        this.d = hVar;
        this.f46610a = i10;
        this.f46612c = j3;
    }

    public final void a(boolean z10) {
        this.f46615r = z10;
        this.e = null;
        if (hasMessages(1)) {
            this.f46614n = true;
            removeMessages(1);
            if (!z10) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f46614n = true;
                    this.f46611b.D();
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
            this.f46616s.f46619b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            h hVar = this.d;
            hVar.getClass();
            hVar.S(this.f46611b, elapsedRealtime, elapsedRealtime - this.f46612c, true);
            this.d = null;
        }
    }

    public final void b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - this.f46612c;
        h hVar = this.d;
        hVar.getClass();
        hVar.o(this.f46611b, elapsedRealtime, j3, this.f46613f);
        this.e = null;
        m mVar = this.f46616s;
        z2.a aVar = mVar.f46618a;
        i iVar = mVar.f46619b;
        iVar.getClass();
        aVar.execute(iVar);
    }

    @Override
    public final void handleMessage(Message message) {
        boolean z10;
        if (!this.f46615r) {
            int i10 = message.what;
            if (i10 == 1) {
                b();
            } else if (i10 != 4) {
                this.f46616s.f46619b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = elapsedRealtime - this.f46612c;
                h hVar = this.d;
                hVar.getClass();
                if (this.f46614n) {
                    hVar.S(this.f46611b, elapsedRealtime, j3, false);
                    return;
                }
                int i11 = message.what;
                if (i11 != 2) {
                    if (i11 == 3) {
                        IOException iOException = (IOException) message.obj;
                        this.e = iOException;
                        int i12 = this.f46613f + 1;
                        this.f46613f = i12;
                        k4.d n10 = hVar.n(this.f46611b, elapsedRealtime, j3, iOException, i12);
                        int i13 = n10.f13434a;
                        if (i13 == 3) {
                            this.f46616s.f46620c = this.e;
                            return;
                        } else if (i13 != 2) {
                            if (i13 == 1) {
                                this.f46613f = 1;
                            }
                            long j10 = n10.f13435b;
                            if (j10 == -9223372036854775807L) {
                                j10 = Math.min((this.f46613f - 1) * 1000, 5000);
                            }
                            m mVar = this.f46616s;
                            if (mVar.f46619b == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            e2.d.g(z10);
                            mVar.f46619b = this;
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
                    hVar.p(this.f46611b, elapsedRealtime, j3);
                } catch (RuntimeException e) {
                    e2.a.f("LoadTask", "Unexpected exception handling load completed", e);
                    this.f46616s.f46620c = new l(e);
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
                z10 = this.f46614n;
                this.h = Thread.currentThread();
            }
            if (!z10) {
                Trace.beginSection("load:".concat(this.f46611b.getClass().getSimpleName()));
                try {
                    this.f46611b.a();
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
            if (!this.f46615r) {
                sendEmptyMessage(2);
            }
        } catch (IOException e) {
            if (!this.f46615r) {
                obtainMessage(3, e).sendToTarget();
            }
        } catch (Exception e7) {
            if (!this.f46615r) {
                e2.a.f("LoadTask", "Unexpected exception loading stream", e7);
                obtainMessage(3, new l(e7)).sendToTarget();
            }
        } catch (OutOfMemoryError e10) {
            if (!this.f46615r) {
                e2.a.f("LoadTask", "OutOfMemory error loading stream", e10);
                obtainMessage(3, new l(e10)).sendToTarget();
            }
        } catch (Error e11) {
            if (!this.f46615r) {
                e2.a.f("LoadTask", "Unexpected error loading stream", e11);
                obtainMessage(4, e11).sendToTarget();
            }
            throw e11;
        }
    }
}
