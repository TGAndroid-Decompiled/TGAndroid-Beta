package x2;

import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import java.lang.reflect.GenericDeclaration;
import java.util.HashMap;
public final class p {
    public final f3.m f58440a;
    public j2.n d;
    public w7.s f58444f;
    public final HashMap f58441b = new HashMap();
    public final HashMap f58442c = new HashMap();
    public boolean f58443e = true;
    public int f58445g = 3;

    public p(f3.m mVar, w7.s sVar) {
        this.f58440a = mVar;
        this.f58444f = sVar;
    }

    public static void a(p pVar) {
        f3.m mVar = pVar.f58440a;
        synchronized (mVar) {
            mVar.f11067f = 1;
        }
    }

    public final f0 b(int i7) {
        g9.u uVar;
        g9.u mVar;
        Integer valueOf = Integer.valueOf(i7);
        HashMap hashMap = this.f58442c;
        f0 f0Var = (f0) hashMap.get(valueOf);
        if (f0Var != null) {
            return f0Var;
        }
        Integer valueOf2 = Integer.valueOf(i7);
        HashMap hashMap2 = this.f58441b;
        g9.u uVar2 = (g9.u) hashMap2.get(valueOf2);
        if (uVar2 == null) {
            final j2.n nVar = this.d;
            nVar.getClass();
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 == 4) {
                                mVar = new g9.u() {
                                    @Override
                                    public final Object get() {
                                        switch (r3) {
                                            case 0:
                                                return q.e((Class) this, nVar);
                                            case 1:
                                                return q.e((Class) this, nVar);
                                            case 2:
                                                return q.e((Class) this, nVar);
                                            default:
                                                return new x0(nVar, ((p) this).f58440a);
                                        }
                                    }
                                };
                            } else {
                                throw new IllegalArgumentException(jg.g.j(i7, "Unrecognized contentType: "));
                            }
                        } else {
                            mVar = new l2.m(Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(f0.class), 3);
                        }
                        uVar2 = mVar;
                    } else {
                        final Class asSubclass = HlsMediaSource$Factory.class.asSubclass(f0.class);
                        uVar = new g9.u() {
                            @Override
                            public final Object get() {
                                switch (r3) {
                                    case 0:
                                        return q.e((Class) asSubclass, nVar);
                                    case 1:
                                        return q.e((Class) asSubclass, nVar);
                                    case 2:
                                        return q.e((Class) asSubclass, nVar);
                                    default:
                                        return new x0(nVar, ((p) asSubclass).f58440a);
                                }
                            }
                        };
                    }
                } else {
                    final GenericDeclaration asSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(f0.class);
                    uVar = new g9.u() {
                        @Override
                        public final Object get() {
                            switch (r3) {
                                case 0:
                                    return q.e((Class) asSubclass2, nVar);
                                case 1:
                                    return q.e((Class) asSubclass2, nVar);
                                case 2:
                                    return q.e((Class) asSubclass2, nVar);
                                default:
                                    return new x0(nVar, ((p) asSubclass2).f58440a);
                            }
                        }
                    };
                }
                uVar2 = uVar;
            } else {
                final Class asSubclass3 = DashMediaSource$Factory.class.asSubclass(f0.class);
                uVar2 = new g9.u() {
                    @Override
                    public final Object get() {
                        switch (r3) {
                            case 0:
                                return q.e((Class) asSubclass3, nVar);
                            case 1:
                                return q.e((Class) asSubclass3, nVar);
                            case 2:
                                return q.e((Class) asSubclass3, nVar);
                            default:
                                return new x0(nVar, ((p) asSubclass3).f58440a);
                        }
                    }
                };
            }
            hashMap2.put(Integer.valueOf(i7), uVar2);
        }
        f0 f0Var2 = (f0) uVar2.get();
        f0Var2.a(this.f58444f);
        f0Var2.c(this.f58443e);
        f0Var2.d(this.f58445g);
        hashMap.put(Integer.valueOf(i7), f0Var2);
        return f0Var2;
    }
}
