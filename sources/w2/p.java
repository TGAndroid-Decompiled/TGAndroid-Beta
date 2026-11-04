package w2;

import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import java.lang.reflect.GenericDeclaration;
import java.util.HashMap;
public final class p {
    public final e3.m f57182a;
    public tf.b d;
    public mb.b f57186f;
    public final HashMap f57183b = new HashMap();
    public final HashMap f57184c = new HashMap();
    public boolean f57185e = true;
    public int f57187g = 3;

    public p(e3.m mVar, mb.b bVar) {
        this.f57182a = mVar;
        this.f57186f = bVar;
    }

    public static void a(p pVar) {
        e3.m mVar = pVar.f57182a;
        synchronized (mVar) {
            mVar.f9503f = 1;
        }
    }

    public final f0 b(int i3) {
        f9.t tVar;
        f9.t mVar;
        Integer valueOf = Integer.valueOf(i3);
        HashMap hashMap = this.f57184c;
        f0 f0Var = (f0) hashMap.get(valueOf);
        if (f0Var != null) {
            return f0Var;
        }
        Integer valueOf2 = Integer.valueOf(i3);
        HashMap hashMap2 = this.f57183b;
        f9.t tVar2 = (f9.t) hashMap2.get(valueOf2);
        if (tVar2 == null) {
            final tf.b bVar = this.d;
            bVar.getClass();
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 == 4) {
                                mVar = new f9.t() {
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
                                                return new x0(bVar, ((p) this).f57182a);
                                        }
                                    }
                                };
                            } else {
                                throw new IllegalArgumentException(k2.p1.i(i3, "Unrecognized contentType: "));
                            }
                        } else {
                            mVar = new k2.m(Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(f0.class), 3);
                        }
                        tVar2 = mVar;
                    } else {
                        final Class asSubclass = HlsMediaSource$Factory.class.asSubclass(f0.class);
                        tVar = new f9.t() {
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
                                        return new x0(bVar, ((p) asSubclass).f57182a);
                                }
                            }
                        };
                    }
                } else {
                    final GenericDeclaration asSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(f0.class);
                    tVar = new f9.t() {
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
                                    return new x0(bVar, ((p) asSubclass2).f57182a);
                            }
                        }
                    };
                }
                tVar2 = tVar;
            } else {
                final Class asSubclass3 = DashMediaSource$Factory.class.asSubclass(f0.class);
                tVar2 = new f9.t() {
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
                                return new x0(bVar, ((p) asSubclass3).f57182a);
                        }
                    }
                };
            }
            hashMap2.put(Integer.valueOf(i3), tVar2);
        }
        f0 f0Var2 = (f0) tVar2.get();
        f0Var2.a(this.f57186f);
        f0Var2.b(this.f57185e);
        f0Var2.d(this.f57187g);
        hashMap.put(Integer.valueOf(i3), f0Var2);
        return f0Var2;
    }
}
