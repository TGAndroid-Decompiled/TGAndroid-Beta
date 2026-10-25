package u2;

import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import java.lang.reflect.GenericDeclaration;
import java.util.HashMap;
public final class p {
    public final c3.m f49391a;
    public rf.b d;
    public qb.a f49394f;
    public final HashMap f49392b = new HashMap();
    public final HashMap f49393c = new HashMap();
    public boolean e = true;
    public int f49395g = 3;

    public p(c3.m mVar, qb.a aVar) {
        this.f49391a = mVar;
        this.f49394f = aVar;
    }

    public static void a(p pVar) {
        c3.m mVar = pVar.f49391a;
        synchronized (mVar) {
            mVar.f6088f = 1;
        }
    }

    public final f0 b(int i10) {
        e9.t tVar;
        e9.t nVar;
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = this.f49393c;
        f0 f0Var = (f0) hashMap.get(valueOf);
        if (f0Var != null) {
            return f0Var;
        }
        Integer valueOf2 = Integer.valueOf(i10);
        HashMap hashMap2 = this.f49392b;
        e9.t tVar2 = (e9.t) hashMap2.get(valueOf2);
        if (tVar2 == null) {
            final rf.b bVar = this.d;
            bVar.getClass();
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 4) {
                                nVar = new e9.t() {
                                    @Override
                                    public final Object get() {
                                        switch (r3) {
                                            case 0:
                                                return q.e((Class) this, bVar);
                                            case 1:
                                                return q.e((Class) this, bVar);
                                            case 2:
                                                return q.e((Class) this, bVar);
                                            default:
                                                return new x0(bVar, ((p) this).f49391a);
                                        }
                                    }
                                };
                            } else {
                                throw new IllegalArgumentException(ic.a.i(i10, "Unrecognized contentType: "));
                            }
                        } else {
                            nVar = new i2.n(Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(f0.class), 3);
                        }
                        tVar2 = nVar;
                    } else {
                        final Class asSubclass = HlsMediaSource$Factory.class.asSubclass(f0.class);
                        tVar = new e9.t() {
                            @Override
                            public final Object get() {
                                switch (r3) {
                                    case 0:
                                        return q.e((Class) asSubclass, bVar);
                                    case 1:
                                        return q.e((Class) asSubclass, bVar);
                                    case 2:
                                        return q.e((Class) asSubclass, bVar);
                                    default:
                                        return new x0(bVar, ((p) asSubclass).f49391a);
                                }
                            }
                        };
                    }
                } else {
                    final GenericDeclaration asSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(f0.class);
                    tVar = new e9.t() {
                        @Override
                        public final Object get() {
                            switch (r3) {
                                case 0:
                                    return q.e((Class) asSubclass2, bVar);
                                case 1:
                                    return q.e((Class) asSubclass2, bVar);
                                case 2:
                                    return q.e((Class) asSubclass2, bVar);
                                default:
                                    return new x0(bVar, ((p) asSubclass2).f49391a);
                            }
                        }
                    };
                }
                tVar2 = tVar;
            } else {
                final Class asSubclass3 = DashMediaSource$Factory.class.asSubclass(f0.class);
                tVar2 = new e9.t() {
                    @Override
                    public final Object get() {
                        switch (r3) {
                            case 0:
                                return q.e((Class) asSubclass3, bVar);
                            case 1:
                                return q.e((Class) asSubclass3, bVar);
                            case 2:
                                return q.e((Class) asSubclass3, bVar);
                            default:
                                return new x0(bVar, ((p) asSubclass3).f49391a);
                        }
                    }
                };
            }
            hashMap2.put(Integer.valueOf(i10), tVar2);
        }
        f0 f0Var2 = (f0) tVar2.get();
        f0Var2.b(this.f49394f);
        f0Var2.c(this.e);
        f0Var2.d(this.f49395g);
        hashMap.put(Integer.valueOf(i10), f0Var2);
        return f0Var2;
    }
}
