package x2;

import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import java.lang.reflect.GenericDeclaration;
import java.util.HashMap;
public final class p {
    public final f3.m f60189a;
    public wf.b d;
    public nb.a f60193f;
    public final HashMap f60190b = new HashMap();
    public final HashMap f60191c = new HashMap();
    public boolean f60192e = true;
    public int f60194g = 3;

    public p(f3.m mVar, nb.a aVar) {
        this.f60189a = mVar;
        this.f60193f = aVar;
    }

    public static void a(p pVar) {
        f3.m mVar = pVar.f60189a;
        synchronized (mVar) {
            mVar.f11193f = 1;
        }
    }

    public final f0 b(int i7) {
        g9.t tVar;
        g9.t mVar;
        Integer valueOf = Integer.valueOf(i7);
        HashMap hashMap = this.f60191c;
        f0 f0Var = (f0) hashMap.get(valueOf);
        if (f0Var != null) {
            return f0Var;
        }
        Integer valueOf2 = Integer.valueOf(i7);
        HashMap hashMap2 = this.f60190b;
        g9.t tVar2 = (g9.t) hashMap2.get(valueOf2);
        if (tVar2 == null) {
            final wf.b bVar = this.d;
            bVar.getClass();
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 == 4) {
                                mVar = new g9.t() {
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
                                                return new x0(bVar, ((p) this).f60189a);
                                        }
                                    }
                                };
                            } else {
                                throw new IllegalArgumentException(i5.c.i(i7, "Unrecognized contentType: "));
                            }
                        } else {
                            mVar = new l2.m(Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(f0.class), 3);
                        }
                        tVar2 = mVar;
                    } else {
                        final Class asSubclass = HlsMediaSource$Factory.class.asSubclass(f0.class);
                        tVar = new g9.t() {
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
                                        return new x0(bVar, ((p) asSubclass).f60189a);
                                }
                            }
                        };
                    }
                } else {
                    final GenericDeclaration asSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(f0.class);
                    tVar = new g9.t() {
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
                                    return new x0(bVar, ((p) asSubclass2).f60189a);
                            }
                        }
                    };
                }
                tVar2 = tVar;
            } else {
                final Class asSubclass3 = DashMediaSource$Factory.class.asSubclass(f0.class);
                tVar2 = new g9.t() {
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
                                return new x0(bVar, ((p) asSubclass3).f60189a);
                        }
                    }
                };
            }
            hashMap2.put(Integer.valueOf(i7), tVar2);
        }
        f0 f0Var2 = (f0) tVar2.get();
        f0Var2.a(this.f60193f);
        f0Var2.c(this.f60192e);
        f0Var2.d(this.f60194g);
        hashMap.put(Integer.valueOf(i7), f0Var2);
        return f0Var2;
    }
}
