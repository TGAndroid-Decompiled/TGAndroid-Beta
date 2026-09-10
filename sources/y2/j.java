package y2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
public final class j extends Handler implements Runnable {
    public final int f46437a;
    public final k f46438b;
    public final long f46439c;
    public i d;
    public IOException e;
    public int f46440f;
    public Thread h;
    public boolean f46441n;
    public volatile boolean f46442r;
    public final n f46443s;

    public j(n nVar, Looper looper, k kVar, i iVar, int i10, long j3) {
        super(looper);
        this.f46443s = nVar;
        this.f46438b = kVar;
        this.d = iVar;
        this.f46437a = i10;
        this.f46439c = j3;
    }

    public final void a(boolean z10) {
        this.f46442r = z10;
        this.e = null;
        if (hasMessages(1)) {
            this.f46441n = true;
            removeMessages(1);
            if (!z10) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f46441n = true;
                    this.f46438b.k();
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
            this.f46443s.f46446b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            i iVar = this.d;
            iVar.getClass();
            iVar.C(this.f46438b, elapsedRealtime, elapsedRealtime - this.f46439c, true);
            this.d = null;
        }
    }

    public final void b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - this.f46439c;
        i iVar = this.d;
        iVar.getClass();
        iVar.l(this.f46438b, elapsedRealtime, j3, this.f46440f);
        this.e = null;
        n nVar = this.f46443s;
        z2.a aVar = nVar.f46445a;
        j jVar = nVar.f46446b;
        jVar.getClass();
        aVar.execute(jVar);
    }

    @Override
    public final void handleMessage(Message message) {
        boolean z10;
        if (!this.f46442r) {
            int i10 = message.what;
            if (i10 == 1) {
                b();
            } else if (i10 != 4) {
                this.f46443s.f46446b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = elapsedRealtime - this.f46439c;
                i iVar = this.d;
                iVar.getClass();
                if (this.f46441n) {
                    iVar.C(this.f46438b, elapsedRealtime, j3, false);
                    return;
                }
                int i11 = message.what;
                if (i11 != 2) {
                    if (i11 == 3) {
                        IOException iOException = (IOException) message.obj;
                        this.e = iOException;
                        int i12 = this.f46440f + 1;
                        this.f46440f = i12;
                        k4.d k10 = iVar.k(this.f46438b, elapsedRealtime, j3, iOException, i12);
                        int i13 = k10.f12278a;
                        if (i13 == 3) {
                            this.f46443s.f46447c = this.e;
                            return;
                        } else if (i13 != 2) {
                            if (i13 == 1) {
                                this.f46440f = 1;
                            }
                            long j10 = k10.f12279b;
                            if (j10 == -9223372036854775807L) {
                                j10 = Math.min((this.f46440f - 1) * 1000, 5000);
                            }
                            n nVar = this.f46443s;
                            if (nVar.f46446b == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            e2.d.g(z10);
                            nVar.f46446b = this;
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
                    iVar.p(this.f46438b, elapsedRealtime, j3);
                } catch (RuntimeException e) {
                    e2.a.f("LoadTask", "Unexpected exception handling load completed", e);
                    this.f46443s.f46447c = new m(e);
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
                z10 = this.f46441n;
                this.h = Thread.currentThread();
            }
            if (!z10) {
                Trace.beginSection("load:".concat(this.f46438b.getClass().getSimpleName()));
                try {
                    this.f46438b.a();
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
            if (!this.f46442r) {
                sendEmptyMessage(2);
            }
        } catch (IOException e) {
            if (!this.f46442r) {
                obtainMessage(3, e).sendToTarget();
            }
        } catch (Exception e7) {
            if (!this.f46442r) {
                e2.a.f("LoadTask", "Unexpected exception loading stream", e7);
                obtainMessage(3, new m(e7)).sendToTarget();
            }
        } catch (OutOfMemoryError e10) {
            if (!this.f46442r) {
                e2.a.f("LoadTask", "OutOfMemory error loading stream", e10);
                obtainMessage(3, new m(e10)).sendToTarget();
            }
        } catch (Error e11) {
            if (!this.f46442r) {
                e2.a.f("LoadTask", "Unexpected error loading stream", e11);
                obtainMessage(4, e11).sendToTarget();
            }
            throw e11;
        }
    }
}
