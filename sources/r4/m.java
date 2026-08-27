package r4;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.api.internal.v;
import d5.g0;
import d5.q;
import h3.d0;
import h3.h0;
import h3.t0;
import h3.u0;
import h3.x;
import java.util.List;
import p8.l0;
import p8.z;

public final class m extends h3.e implements Handler.Callback {
    public long A;
    public long B;
    public long C;

    public final Handler f46755a;

    public final h0 f46756b;

    public final j f46757c;
    public final u0 d;

    public boolean f46758e;

    public boolean f46759f;
    public boolean h;

    public int f46760n;

    public t0 f46761r;

    public h f46762s;
    public k v;

    public l f46763w;

    public l f46764x;

    public int f46765y;

    public m(h0 h0Var, Looper looper) {
        Handler handler;
        super(3);
        this.f46756b = h0Var;
        if (looper == null) {
            handler = null;
        } else {
            int i10 = g0.f4795a;
            handler = new Handler(looper, this);
        }
        this.f46755a = handler;
        this.f46757c = j.f46751a;
        this.d = new u0();
        this.A = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.C = -9223372036854775807L;
    }

    public final long a() {
        if (this.f46765y == -1) {
            return Long.MAX_VALUE;
        }
        this.f46763w.getClass();
        if (this.f46765y >= this.f46763w.p()) {
            return Long.MAX_VALUE;
        }
        return this.f46763w.f(this.f46765y);
    }

    public final long b(long j10) {
        d5.a.i(j10 != -9223372036854775807L);
        d5.a.i(this.B != -9223372036854775807L);
        return j10 - this.B;
    }

    public final void c(d dVar) {
        z zVar = dVar.f46748a;
        h0 h0Var = this.f46756b;
        h0Var.f7870a.f7980l.e(27, new d0(zVar));
        h0Var.f7870a.f7980l.e(27, new x(dVar, 1));
    }

    public final void d() {
        this.v = null;
        this.f46765y = -1;
        l lVar = this.f46763w;
        if (lVar != null) {
            lVar.release();
            this.f46763w = null;
        }
        l lVar2 = this.f46764x;
        if (lVar2 != null) {
            lVar2.release();
            this.f46764x = null;
        }
    }

    @Override
    public final String getName() {
        return "TextRenderer";
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        c((d) message.obj);
        return true;
    }

    @Override
    public final boolean isEnded() {
        return this.f46759f;
    }

    @Override
    public final boolean isReady() {
        return true;
    }

    @Override
    public final void onDisabled() {
        this.f46761r = null;
        this.A = -9223372036854775807L;
        d dVar = new d(b(this.C), l0.f45555e);
        Handler handler = this.f46755a;
        if (handler != null) {
            handler.obtainMessage(0, dVar).sendToTarget();
        } else {
            c(dVar);
        }
        this.B = -9223372036854775807L;
        this.C = -9223372036854775807L;
        d();
        h hVar = this.f46762s;
        hVar.getClass();
        hVar.release();
        this.f46762s = null;
        this.f46760n = 0;
    }

    @Override
    public final void onPositionReset(long j10, boolean z10) {
        h aVar;
        this.C = j10;
        d dVar = new d(b(this.C), l0.f45555e);
        byte b10 = 0;
        Handler handler = this.f46755a;
        if (handler != null) {
            handler.obtainMessage(0, dVar).sendToTarget();
        } else {
            c(dVar);
        }
        this.f46758e = false;
        this.f46759f = false;
        this.A = -9223372036854775807L;
        if (this.f46760n == 0) {
            d();
            h hVar = this.f46762s;
            hVar.getClass();
            hVar.flush();
            return;
        }
        d();
        h hVar2 = this.f46762s;
        hVar2.getClass();
        hVar2.release();
        this.f46762s = null;
        this.f46760n = 0;
        this.h = true;
        t0 t0Var = this.f46761r;
        t0Var.getClass();
        this.f46757c.getClass();
        String str = t0Var.B;
        int i10 = t0Var.T;
        List list = t0Var.D;
        if (str != null) {
            switch (str.hashCode()) {
                case -1351681404:
                    if (!str.equals("application/dvbsubs")) {
                        b10 = -1;
                    }
                    break;
                case -1248334819:
                    if (!str.equals("application/pgs")) {
                        b10 = -1;
                    } else {
                        b10 = 1;
                    }
                    break;
                case -1026075066:
                    if (!str.equals("application/x-mp4-vtt")) {
                        b10 = -1;
                    } else {
                        b10 = 2;
                    }
                    break;
                case -1004728940:
                    if (!str.equals("text/vtt")) {
                        b10 = -1;
                    } else {
                        b10 = 3;
                    }
                    break;
                case 691401887:
                    if (!str.equals("application/x-quicktime-tx3g")) {
                        b10 = -1;
                    } else {
                        b10 = 4;
                    }
                    break;
                case 822864842:
                    if (!str.equals("text/x-ssa")) {
                        b10 = -1;
                    } else {
                        b10 = 5;
                    }
                    break;
                case 930165504:
                    if (!str.equals("application/x-mp4-cea-608")) {
                        b10 = -1;
                    } else {
                        b10 = 6;
                    }
                    break;
                case 1201784583:
                    if (!str.equals("text/x-exoplayer-cues")) {
                        b10 = -1;
                    } else {
                        b10 = 7;
                    }
                    break;
                case 1566015601:
                    if (!str.equals("application/cea-608")) {
                        b10 = -1;
                    } else {
                        b10 = 8;
                    }
                    break;
                case 1566016562:
                    if (!str.equals("application/cea-708")) {
                        b10 = -1;
                    } else {
                        b10 = 9;
                    }
                    break;
                case 1668750253:
                    if (!str.equals("application/x-subrip")) {
                        b10 = -1;
                    } else {
                        b10 = 10;
                    }
                    break;
                case 1693976202:
                    if (!str.equals("application/ttml+xml")) {
                        b10 = -1;
                    } else {
                        b10 = 11;
                    }
                    break;
                default:
                    b10 = -1;
                    break;
            }
            switch (b10) {
                case 0:
                    aVar = new a5.a(list);
                    break;
                case 1:
                    aVar = new u4.b();
                    break;
                case 2:
                    aVar = new a5.a();
                    break;
                case 3:
                    aVar = new a5.l();
                    break;
                case 4:
                    aVar = new z4.a(list);
                    break;
                case 5:
                    aVar = new w4.a(list);
                    break;
                case 6:
                case 8:
                    aVar = new s4.c(str, i10);
                    break;
                case 7:
                    aVar = new v();
                    break;
                case 9:
                    aVar = new s4.f(i10, list);
                    break;
                case 10:
                    aVar = new x4.a();
                    break;
                case 11:
                    aVar = new y4.c();
                    break;
            }
            this.f46762s = aVar;
            return;
        }
        throw new IllegalArgumentException(s3.c.e("Attempted to create decoder for unsupported MIME type: ", str));
    }

    @Override
    public final void onStreamChanged(t0[] t0VarArr, long j10, long j11) {
        h aVar;
        h bVar;
        this.B = j11;
        byte b10 = 0;
        t0 t0Var = t0VarArr[0];
        this.f46761r = t0Var;
        if (this.f46762s != null) {
            this.f46760n = 1;
            return;
        }
        this.h = true;
        t0Var.getClass();
        this.f46757c.getClass();
        String str = t0Var.B;
        int i10 = t0Var.T;
        List list = t0Var.D;
        if (str != null) {
            switch (str.hashCode()) {
                case -1351681404:
                    if (!str.equals("application/dvbsubs")) {
                        b10 = -1;
                    }
                    break;
                case -1248334819:
                    if (!str.equals("application/pgs")) {
                        b10 = -1;
                    } else {
                        b10 = 1;
                    }
                    break;
                case -1026075066:
                    if (!str.equals("application/x-mp4-vtt")) {
                        b10 = -1;
                    } else {
                        b10 = 2;
                    }
                    break;
                case -1004728940:
                    if (!str.equals("text/vtt")) {
                        b10 = -1;
                    } else {
                        b10 = 3;
                    }
                    break;
                case 691401887:
                    if (!str.equals("application/x-quicktime-tx3g")) {
                        b10 = -1;
                    } else {
                        b10 = 4;
                    }
                    break;
                case 822864842:
                    if (!str.equals("text/x-ssa")) {
                        b10 = -1;
                    } else {
                        b10 = 5;
                    }
                    break;
                case 930165504:
                    if (!str.equals("application/x-mp4-cea-608")) {
                        b10 = -1;
                    } else {
                        b10 = 6;
                    }
                    break;
                case 1201784583:
                    if (!str.equals("text/x-exoplayer-cues")) {
                        b10 = -1;
                    } else {
                        b10 = 7;
                    }
                    break;
                case 1566015601:
                    if (!str.equals("application/cea-608")) {
                        b10 = -1;
                    } else {
                        b10 = 8;
                    }
                    break;
                case 1566016562:
                    if (!str.equals("application/cea-708")) {
                        b10 = -1;
                    } else {
                        b10 = 9;
                    }
                    break;
                case 1668750253:
                    if (!str.equals("application/x-subrip")) {
                        b10 = -1;
                    } else {
                        b10 = 10;
                    }
                    break;
                case 1693976202:
                    if (!str.equals("application/ttml+xml")) {
                        b10 = -1;
                    } else {
                        b10 = 11;
                    }
                    break;
                default:
                    b10 = -1;
                    break;
            }
            switch (b10) {
                case 0:
                    aVar = new a5.a(list);
                    bVar = aVar;
                    this.f46762s = bVar;
                    return;
                case 1:
                    bVar = new u4.b();
                    this.f46762s = bVar;
                    return;
                case 2:
                    bVar = new a5.a();
                    this.f46762s = bVar;
                    return;
                case 3:
                    bVar = new a5.l();
                    this.f46762s = bVar;
                    return;
                case 4:
                    aVar = new z4.a(list);
                    bVar = aVar;
                    this.f46762s = bVar;
                    return;
                case 5:
                    aVar = new w4.a(list);
                    bVar = aVar;
                    this.f46762s = bVar;
                    return;
                case 6:
                case 8:
                    bVar = new s4.c(str, i10);
                    this.f46762s = bVar;
                    return;
                case 7:
                    bVar = new v();
                    this.f46762s = bVar;
                    return;
                case 9:
                    aVar = new s4.f(i10, list);
                    bVar = aVar;
                    this.f46762s = bVar;
                    return;
                case 10:
                    bVar = new x4.a();
                    this.f46762s = bVar;
                    return;
                case 11:
                    bVar = new y4.c();
                    this.f46762s = bVar;
                    return;
            }
        }
        throw new IllegalArgumentException(s3.c.e("Attempted to create decoder for unsupported MIME type: ", str));
    }

    @Override
    public final void render(long j10, long j11) {
        boolean z10;
        Object obj;
        long j12;
        Object obj2;
        Handler handler;
        int i10;
        byte b10;
        h aVar;
        h bVar;
        long j13;
        long jF;
        String str;
        byte b11;
        h aVar2;
        int i11;
        h aVar3;
        h bVar2;
        u0 u0Var = this.d;
        this.C = j10;
        if (isCurrentStreamFinal()) {
            long j14 = this.A;
            if (j14 != -9223372036854775807L && j10 >= j14) {
                d();
                this.f46759f = true;
            }
        }
        if (this.f46759f) {
            return;
        }
        l lVar = this.f46764x;
        j jVar = this.f46757c;
        Handler handler2 = this.f46755a;
        if (lVar == null) {
            h hVar = this.f46762s;
            hVar.getClass();
            hVar.a(j10);
            try {
                h hVar2 = this.f46762s;
                hVar2.getClass();
                this.f46764x = (l) hVar2.dequeueOutputBuffer();
            } catch (i e9) {
                d5.a.p("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f46761r, e9);
                d dVar = new d(b(this.C), l0.f45555e);
                if (handler2 != null) {
                    i11 = 0;
                    handler2.obtainMessage(0, dVar).sendToTarget();
                } else {
                    i11 = 0;
                    c(dVar);
                }
                d();
                h hVar3 = this.f46762s;
                hVar3.getClass();
                hVar3.release();
                this.f46762s = null;
                this.f46760n = i11;
                this.h = true;
                t0 t0Var = this.f46761r;
                t0Var.getClass();
                jVar.getClass();
                String str2 = t0Var.B;
                int i12 = t0Var.T;
                List list = t0Var.D;
                if (str2 != null) {
                    switch (str2) {
                        case "application/dvbsubs":
                            aVar3 = new a5.a(list);
                            break;
                        case "application/pgs":
                            bVar2 = new u4.b();
                            this.f46762s = bVar2;
                            return;
                        case "application/x-mp4-vtt":
                            bVar2 = new a5.a();
                            this.f46762s = bVar2;
                            return;
                        case "text/vtt":
                            bVar2 = new a5.l();
                            this.f46762s = bVar2;
                            return;
                        case "application/x-quicktime-tx3g":
                            aVar3 = new z4.a(list);
                            break;
                        case "text/x-ssa":
                            aVar3 = new w4.a(list);
                            break;
                        case "application/x-mp4-cea-608":
                        case "application/cea-608":
                            bVar2 = new s4.c(str2, i12);
                            this.f46762s = bVar2;
                            return;
                        case "text/x-exoplayer-cues":
                            bVar2 = new v();
                            this.f46762s = bVar2;
                            return;
                        case "application/cea-708":
                            aVar3 = new s4.f(i12, list);
                            break;
                        case "application/x-subrip":
                            bVar2 = new x4.a();
                            this.f46762s = bVar2;
                            return;
                        case "application/ttml+xml":
                            bVar2 = new y4.c();
                            this.f46762s = bVar2;
                            return;
                    }
                    bVar2 = aVar3;
                    this.f46762s = bVar2;
                    return;
                }
                throw new IllegalArgumentException(s3.c.e("Attempted to create decoder for unsupported MIME type: ", str2));
            }
        }
        String str3 = "Attempted to create decoder for unsupported MIME type: ";
        Object obj3 = "application/x-mp4-vtt";
        u0 u0Var2 = u0Var;
        if (getState() != 2) {
            return;
        }
        if (this.f46763w != null) {
            long jA = a();
            z10 = false;
            while (jA <= j10) {
                this.f46765y++;
                jA = a();
                z10 = true;
            }
        } else {
            z10 = false;
        }
        l lVar2 = this.f46764x;
        if (lVar2 == null) {
            obj = "application/dvbsubs";
            j12 = j10;
        } else if (lVar2.isEndOfStream()) {
            if (!z10 && a() == Long.MAX_VALUE) {
                if (this.f46760n == 2) {
                    d();
                    h hVar4 = this.f46762s;
                    hVar4.getClass();
                    hVar4.release();
                    this.f46762s = null;
                    this.f46760n = 0;
                    this.h = true;
                    t0 t0Var2 = this.f46761r;
                    t0Var2.getClass();
                    jVar.getClass();
                    String str4 = t0Var2.B;
                    int i13 = t0Var2.T;
                    List list2 = t0Var2.D;
                    if (str4 != null) {
                        switch (str4.hashCode()) {
                            case -1351681404:
                                str = str3;
                                if (!str4.equals("application/dvbsubs")) {
                                    b11 = -1;
                                } else {
                                    b11 = 0;
                                }
                                break;
                            case -1248334819:
                                str = str3;
                                if (!str4.equals("application/pgs")) {
                                    b11 = -1;
                                } else {
                                    b11 = 1;
                                }
                                break;
                            case -1026075066:
                                str = str3;
                                if (!str4.equals(obj3)) {
                                    b11 = -1;
                                } else {
                                    b11 = 2;
                                }
                                break;
                            case -1004728940:
                                str = str3;
                                if (!str4.equals("text/vtt")) {
                                    b11 = -1;
                                } else {
                                    b11 = 3;
                                }
                                break;
                            case 691401887:
                                str = str3;
                                if (!str4.equals("application/x-quicktime-tx3g")) {
                                    b11 = -1;
                                } else {
                                    b11 = 4;
                                }
                                break;
                            case 822864842:
                                str = str3;
                                if (!str4.equals("text/x-ssa")) {
                                    b11 = -1;
                                } else {
                                    b11 = 5;
                                }
                                break;
                            case 930165504:
                                str = str3;
                                if (!str4.equals("application/x-mp4-cea-608")) {
                                    b11 = -1;
                                } else {
                                    b11 = 6;
                                }
                                break;
                            case 1201784583:
                                str = str3;
                                if (!str4.equals("text/x-exoplayer-cues")) {
                                    b11 = -1;
                                } else {
                                    b11 = 7;
                                }
                                break;
                            case 1566015601:
                                str = str3;
                                if (!str4.equals("application/cea-608")) {
                                    b11 = -1;
                                } else {
                                    b11 = 8;
                                }
                                break;
                            case 1566016562:
                                str = str3;
                                if (!str4.equals("application/cea-708")) {
                                    b11 = -1;
                                } else {
                                    b11 = 9;
                                }
                                break;
                            case 1668750253:
                                str = str3;
                                if (!str4.equals("application/x-subrip")) {
                                    b11 = -1;
                                } else {
                                    b11 = 10;
                                }
                                break;
                            case 1693976202:
                                str = str3;
                                if (!str4.equals("application/ttml+xml")) {
                                    b11 = -1;
                                } else {
                                    b11 = 11;
                                }
                                break;
                            default:
                                str = str3;
                                b11 = -1;
                                break;
                        }
                        switch (b11) {
                            case 0:
                                aVar2 = new a5.a(list2);
                                break;
                            case 1:
                                aVar2 = new u4.b();
                                break;
                            case 2:
                                aVar2 = new a5.a();
                                break;
                            case 3:
                                aVar2 = new a5.l();
                                break;
                            case 4:
                                aVar2 = new z4.a(list2);
                                break;
                            case 5:
                                aVar2 = new w4.a(list2);
                                break;
                            case 6:
                            case 8:
                                aVar2 = new s4.c(str4, i13);
                                break;
                            case 7:
                                aVar2 = new v();
                                break;
                            case 9:
                                aVar2 = new s4.f(i13, list2);
                                break;
                            case 10:
                                aVar2 = new x4.a();
                                break;
                            case 11:
                                aVar2 = new y4.c();
                                break;
                        }
                        this.f46762s = aVar2;
                        str3 = str;
                    } else {
                        str = str3;
                    }
                    throw new IllegalArgumentException(s3.c.e(str, str4));
                }
                d();
                this.f46759f = true;
            }
            obj = "application/dvbsubs";
            j12 = j10;
        } else {
            z10 = z10;
            obj = "application/dvbsubs";
            if (lVar2.timeUs <= j10) {
                l lVar3 = this.f46763w;
                if (lVar3 != null) {
                    lVar3.release();
                }
                j12 = j10;
                this.f46765y = lVar2.c(j12);
                this.f46763w = lVar2;
                this.f46764x = null;
                z10 = true;
            } else {
                j12 = j10;
            }
        }
        if (z10) {
            this.f46763w.getClass();
            int iC = this.f46763w.c(j12);
            if (iC == 0 || this.f46763w.p() == 0) {
                j13 = this.f46763w.timeUs;
            } else {
                if (iC == -1) {
                    l lVar4 = this.f46763w;
                    jF = lVar4.f(lVar4.p() - 1);
                } else {
                    jF = this.f46763w.f(iC - 1);
                }
                j13 = jF;
            }
            obj2 = "application/x-mp4-cea-608";
            d dVar2 = new d(b(j13), this.f46763w.h(j12));
            if (handler2 != null) {
                handler = handler2;
                handler.obtainMessage(0, dVar2).sendToTarget();
            } else {
                handler = handler2;
                c(dVar2);
            }
        } else {
            obj3 = obj3;
            obj2 = "application/x-mp4-cea-608";
            handler = handler2;
        }
        if (this.f46760n == 2) {
            return;
        }
        while (!this.f46758e) {
            try {
                k kVar = this.v;
                if (kVar == null) {
                    h hVar5 = this.f46762s;
                    hVar5.getClass();
                    kVar = (k) hVar5.dequeueInputBuffer();
                    if (kVar == null) {
                        return;
                    } else {
                        this.v = kVar;
                    }
                }
                if (this.f46760n == 1) {
                    try {
                        kVar.setFlags(4);
                        h hVar6 = this.f46762s;
                        hVar6.getClass();
                        hVar6.queueInputBuffer(kVar);
                        this.v = null;
                        this.f46760n = 2;
                        return;
                    } catch (i e10) {
                        e = e10;
                    }
                } else {
                    u0 u0Var3 = u0Var2;
                    int source = readSource(u0Var3, kVar, 0);
                    if (source == -4) {
                        if (kVar.isEndOfStream()) {
                            this.f46758e = true;
                            this.h = false;
                        } else {
                            t0 t0Var3 = u0Var3.f8207b;
                            if (t0Var3 == null) {
                                return;
                            }
                            kVar.f46752n = t0Var3.F;
                            kVar.d();
                            this.h &= !kVar.isKeyFrame();
                        }
                        if (!this.h) {
                            h hVar7 = this.f46762s;
                            hVar7.getClass();
                            hVar7.queueInputBuffer(kVar);
                            this.v = null;
                        }
                    } else if (source == -3) {
                        return;
                    }
                    u0Var2 = u0Var3;
                }
            } catch (i e11) {
                e = e11;
            }
            d5.a.p("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f46761r, e);
            d dVar3 = new d(b(this.C), l0.f45555e);
            if (handler != null) {
                i10 = 0;
                handler.obtainMessage(0, dVar3).sendToTarget();
            } else {
                i10 = 0;
                c(dVar3);
            }
            d();
            h hVar8 = this.f46762s;
            hVar8.getClass();
            hVar8.release();
            this.f46762s = null;
            this.f46760n = i10;
            this.h = true;
            t0 t0Var4 = this.f46761r;
            t0Var4.getClass();
            jVar.getClass();
            String str5 = t0Var4.B;
            int i14 = t0Var4.T;
            List list3 = t0Var4.D;
            if (str5 != null) {
                switch (str5.hashCode()) {
                    case -1351681404:
                        if (!str5.equals(obj)) {
                            b10 = -1;
                        } else {
                            b10 = 0;
                        }
                        break;
                    case -1248334819:
                        if (!str5.equals("application/pgs")) {
                            b10 = -1;
                        } else {
                            b10 = 1;
                        }
                        break;
                    case -1026075066:
                        if (!str5.equals(obj3)) {
                            b10 = -1;
                        } else {
                            b10 = 2;
                        }
                        break;
                    case -1004728940:
                        if (!str5.equals("text/vtt")) {
                            b10 = -1;
                        } else {
                            b10 = 3;
                        }
                        break;
                    case 691401887:
                        if (!str5.equals("application/x-quicktime-tx3g")) {
                            b10 = -1;
                        } else {
                            b10 = 4;
                        }
                        break;
                    case 822864842:
                        if (!str5.equals("text/x-ssa")) {
                            b10 = -1;
                        } else {
                            b10 = 5;
                        }
                        break;
                    case 930165504:
                        if (!str5.equals(obj2)) {
                            b10 = -1;
                        } else {
                            b10 = 6;
                        }
                        break;
                    case 1201784583:
                        if (!str5.equals("text/x-exoplayer-cues")) {
                            b10 = -1;
                        } else {
                            b10 = 7;
                        }
                        break;
                    case 1566015601:
                        if (!str5.equals("application/cea-608")) {
                            b10 = -1;
                        } else {
                            b10 = 8;
                        }
                        break;
                    case 1566016562:
                        if (!str5.equals("application/cea-708")) {
                            b10 = -1;
                        } else {
                            b10 = 9;
                        }
                        break;
                    case 1668750253:
                        if (!str5.equals("application/x-subrip")) {
                            b10 = -1;
                        } else {
                            b10 = 10;
                        }
                        break;
                    case 1693976202:
                        if (!str5.equals("application/ttml+xml")) {
                            b10 = -1;
                        } else {
                            b10 = 11;
                        }
                        break;
                    default:
                        b10 = -1;
                        break;
                }
                switch (b10) {
                    case 0:
                        aVar = new a5.a(list3);
                        bVar = aVar;
                        this.f46762s = bVar;
                        return;
                    case 1:
                        bVar = new u4.b();
                        this.f46762s = bVar;
                        return;
                    case 2:
                        bVar = new a5.a();
                        this.f46762s = bVar;
                        return;
                    case 3:
                        bVar = new a5.l();
                        this.f46762s = bVar;
                        return;
                    case 4:
                        aVar = new z4.a(list3);
                        bVar = aVar;
                        this.f46762s = bVar;
                        return;
                    case 5:
                        aVar = new w4.a(list3);
                        bVar = aVar;
                        this.f46762s = bVar;
                        return;
                    case 6:
                    case 8:
                        bVar = new s4.c(str5, i14);
                        this.f46762s = bVar;
                        return;
                    case 7:
                        bVar = new v();
                        this.f46762s = bVar;
                        return;
                    case 9:
                        aVar = new s4.f(i14, list3);
                        bVar = aVar;
                        this.f46762s = bVar;
                        return;
                    case 10:
                        bVar = new x4.a();
                        this.f46762s = bVar;
                        return;
                    case 11:
                        bVar = new y4.c();
                        this.f46762s = bVar;
                        return;
                }
            }
            throw new IllegalArgumentException(s3.c.e(str3, str5));
        }
    }

    @Override
    public final int supportsFormat(t0 t0Var) {
        this.f46757c.getClass();
        String str = t0Var.B;
        if ("text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str) || "text/x-exoplayer-cues".equals(str)) {
            return com.google.android.recaptcha.internal.a.b(t0Var.W == 0 ? 4 : 2, 0, 0);
        }
        return q.i(t0Var.B) ? com.google.android.recaptcha.internal.a.b(1, 0, 0) : com.google.android.recaptcha.internal.a.b(0, 0, 0);
    }
}
