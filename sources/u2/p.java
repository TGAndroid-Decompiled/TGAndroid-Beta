package u2;

import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import java.lang.reflect.GenericDeclaration;
import java.util.HashMap;
public final class p {
    public final c3.m f49972a;
    public hf.b d;
    public t7.u f49975f;
    public final HashMap f49973b = new HashMap();
    public final HashMap f49974c = new HashMap();
    public boolean e = true;
    public int f49976g = 3;

    public p(c3.m mVar, t7.u uVar) {
        this.f49972a = mVar;
        this.f49975f = uVar;
    }

    public static void a(p pVar) {
        c3.m mVar = pVar.f49972a;
        synchronized (mVar) {
            mVar.f3683f = 1;
        }
    }

    public final f0 b(int i10) {
        d9.t tVar;
        d9.t mVar;
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = this.f49974c;
        f0 f0Var = (f0) hashMap.get(valueOf);
        if (f0Var != null) {
            return f0Var;
        }
        Integer valueOf2 = Integer.valueOf(i10);
        HashMap hashMap2 = this.f49973b;
        d9.t tVar2 = (d9.t) hashMap2.get(valueOf2);
        if (tVar2 == null) {
            final hf.b bVar = this.d;
            bVar.getClass();
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 4) {
                                mVar = new d9.t() {
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
                                                return new x0(bVar, ((p) this).f49972a);
                                        }
                                    }
                                };
                            } else {
                                throw new IllegalArgumentException(i0.a.i(i10, "Unrecognized contentType: "));
                            }
                        } else {
                            mVar = new i2.m(Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(f0.class), 3);
                        }
                        tVar2 = mVar;
                    } else {
                        final Class asSubclass = HlsMediaSource$Factory.class.asSubclass(f0.class);
                        tVar = new d9.t() {
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
                                        return new x0(bVar, ((p) asSubclass).f49972a);
                                }
                            }
                        };
                    }
                } else {
                    final GenericDeclaration asSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(f0.class);
                    tVar = new d9.t() {
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
                                    return new x0(bVar, ((p) asSubclass2).f49972a);
                            }
                        }
                    };
                }
                tVar2 = tVar;
            } else {
                final Class asSubclass3 = DashMediaSource$Factory.class.asSubclass(f0.class);
                tVar2 = new d9.t() {
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
                                return new x0(bVar, ((p) asSubclass3).f49972a);
                        }
                    }
                };
            }
            hashMap2.put(Integer.valueOf(i10), tVar2);
        }
        f0 f0Var2 = (f0) tVar2.get();
        f0Var2.d(this.f49975f);
        f0Var2.b(this.e);
        f0Var2.c(this.f49976g);
        hashMap.put(Integer.valueOf(i10), f0Var2);
        return f0Var2;
    }
}
