package p4;

import android.net.Uri;
import android.os.SystemClock;
import com.google.android.exoplayer2.upstream.h0;
import com.google.android.exoplayer2.upstream.k0;
import com.google.android.exoplayer2.upstream.l0;
import com.google.android.exoplayer2.upstream.n0;
import com.google.android.exoplayer2.upstream.q0;
import com.google.android.exoplayer2.upstream.t0;
import com.google.android.gms.internal.cast.x4;
import d5.g0;
import h3.t1;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import n2.v;
import org.telegram.ui.zh1;
import p8.z;

public final class b implements l0 {

    public final Uri f45361a;

    public final q0 f45362b = new q0("DefaultHlsPlaylistTracker:MediaPlaylist");

    public final com.google.android.exoplayer2.upstream.m f45363c;
    public j d;

    public long f45364e;

    public long f45365f;
    public long h;

    public long f45366n;

    public boolean f45367r;

    public IOException f45368s;
    public final c v;

    public b(c cVar, Uri uri) {
        this.v = cVar;
        this.f45361a = uri;
        this.f45363c = ((com.google.android.exoplayer2.upstream.l) cVar.f45369a.f17823b).createDataSource();
    }

    public static boolean a(b bVar, long j10) {
        bVar.f45366n = SystemClock.elapsedRealtime() + j10;
        Uri uri = bVar.f45361a;
        c cVar = bVar.v;
        if (!uri.equals(cVar.v)) {
            return false;
        }
        List list = cVar.f45376s.f45424e;
        int size = list.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar2 = (b) cVar.d.get(((l) list.get(i10)).f45418a);
            bVar2.getClass();
            if (jElapsedRealtime > bVar2.f45366n) {
                Uri uri2 = bVar2.f45361a;
                cVar.v = uri2;
                bVar2.c(cVar.b(uri2));
                return false;
            }
        }
        return true;
    }

    public final void b(Uri uri) {
        c cVar = this.v;
        t0 t0Var = new t0(this.f45363c, uri, 4, cVar.f45370b.y0(cVar.f45376s, this.d));
        ab.a aVar = cVar.f45371c;
        int i10 = t0Var.f3045c;
        this.f45362b.f(t0Var, this, aVar.z3(i10));
        cVar.f45373f.k(new j4.p(t0Var.f3044b), i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void c(Uri uri) {
        this.f45366n = 0L;
        if (this.f45367r) {
            return;
        }
        q0 q0Var = this.f45362b;
        if (q0Var.d() || q0Var.c()) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.h;
        if (jElapsedRealtime >= j10) {
            b(uri);
        } else {
            this.f45367r = true;
            this.v.f45374n.postDelayed(new zh1(11, this, uri), j10 - jElapsedRealtime);
        }
    }

    @Override
    public final void d(n0 n0Var, long j10, long j11, boolean z10) {
        t0 t0Var = (t0) n0Var;
        long j12 = t0Var.f3043a;
        Uri uri = t0Var.d.f3090c;
        j4.p pVar = new j4.p();
        c cVar = this.v;
        cVar.f45371c.getClass();
        cVar.f45373f.d(pVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void e(j jVar) {
        boolean z10;
        z zVar;
        long j10;
        long j11;
        j jVar2;
        long j12;
        long j13;
        z zVar2;
        long j14;
        int size;
        int i10;
        g gVar;
        long j15;
        j jVar3;
        int i11;
        int i12;
        z zVar3;
        g gVar2;
        int i13;
        j jVar4;
        x4 x4Var;
        Uri uriBuild;
        long size2;
        j jVar5;
        x4 x4Var2;
        boolean z11;
        v vVar;
        Iterator it;
        j jVar6;
        i iVar;
        long j16;
        j jVar7;
        i iVar2;
        Uri.Builder builderBuildUpon;
        j jVar8;
        i iVar3;
        String str;
        j jVar9;
        z zVar4;
        int size3;
        Iterator it2;
        int size4;
        int size5;
        int size6;
        j jVar10 = this.d;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f45364e = jElapsedRealtime;
        c cVar = this.v;
        CopyOnWriteArrayList copyOnWriteArrayList = cVar.f45372e;
        if (jVar10 != null) {
            long j17 = jVar.f45404k;
            long j18 = jVar10.f45404k;
            z10 = j17 > j18 || (j17 >= j18 && ((size4 = jVar.f45411r.size() - jVar10.f45411r.size()) == 0 ? (size5 = jVar.f45412s.size()) > (size6 = jVar10.f45412s.size()) || (size5 == size6 && jVar.f45408o && !jVar10.f45408o) : size4 > 0));
            zVar = jVar.f45411r;
            j10 = jVar.f45404k;
            j11 = 0;
            if (z10) {
                copyOnWriteArrayList = copyOnWriteArrayList;
                if (jVar.f45409p) {
                    j12 = jVar.h;
                } else {
                    jVar2 = cVar.f45377w;
                    if (jVar2 != null) {
                        j12 = jVar2.h;
                    } else {
                        j12 = 0;
                    }
                    if (jVar10 == null) {
                        long j19 = jVar10.h;
                        j13 = jVar10.f45404k;
                        zVar2 = jVar10.f45411r;
                        j14 = j12;
                        size = zVar2.size();
                        i10 = (int) (j10 - j13);
                        if (i10 < zVar2.size()) {
                            gVar = (g) zVar2.get(i10);
                        } else {
                            gVar = null;
                        }
                        if (gVar != null) {
                            j15 = gVar.f45390e;
                        } else if (size == j10 - j13) {
                            j15 = jVar10.f45414u;
                        }
                        j12 = j19 + j15;
                    }
                    if (jVar.f45402i) {
                        i13 = jVar.f45403j;
                    } else {
                        jVar3 = cVar.f45377w;
                        if (jVar3 != null) {
                            i11 = jVar3.f45403j;
                        } else {
                            i11 = 0;
                        }
                        if (jVar10 == null) {
                            i12 = (int) (j10 - jVar10.f45404k);
                            zVar3 = jVar10.f45411r;
                            if (i12 < zVar3.size()) {
                                gVar2 = (g) zVar3.get(i12);
                            } else {
                                gVar2 = null;
                            }
                            if (gVar2 != null) {
                                i11 = (jVar10.f45403j + gVar2.d) - ((g) zVar.get(0)).d;
                            }
                        }
                        i13 = i11;
                    }
                    x4Var = null;
                    j10 = j10;
                    jVar4 = new j(jVar.d, jVar.f45432a, jVar.f45433b, jVar.f45399e, jVar.f45401g, j14, true, i13, jVar.f45404k, jVar.f45405l, jVar.f45406m, jVar.f45407n, jVar.f45434c, jVar.f45408o, jVar.f45409p, jVar.f45410q, zVar, jVar.f45412s, jVar.v, jVar.f45413t);
                }
                j14 = j12;
                if (jVar.f45402i) {
                    i13 = jVar.f45403j;
                } else {
                    jVar3 = cVar.f45377w;
                    if (jVar3 != null) {
                        i11 = jVar3.f45403j;
                    } else {
                        i11 = 0;
                    }
                    if (jVar10 == null) {
                        i12 = (int) (j10 - jVar10.f45404k);
                        zVar3 = jVar10.f45411r;
                        if (i12 < zVar3.size()) {
                            gVar2 = (g) zVar3.get(i12);
                        } else {
                            gVar2 = null;
                        }
                        if (gVar2 != null) {
                            i11 = (jVar10.f45403j + gVar2.d) - ((g) zVar.get(0)).d;
                        }
                    }
                    i13 = i11;
                }
                x4Var = null;
                j10 = j10;
                jVar4 = new j(jVar.d, jVar.f45432a, jVar.f45433b, jVar.f45399e, jVar.f45401g, j14, true, i13, jVar.f45404k, jVar.f45405l, jVar.f45406m, jVar.f45407n, jVar.f45434c, jVar.f45408o, jVar.f45409p, jVar.f45410q, zVar, jVar.f45412s, jVar.v, jVar.f45413t);
            } else {
                if (jVar.f45408o) {
                    jVar4 = jVar10;
                } else if (jVar10.f45408o) {
                    jVar4 = jVar10;
                    copyOnWriteArrayList = copyOnWriteArrayList;
                    j10 = j10;
                    x4Var = null;
                } else {
                    jVar4 = new j(jVar10.d, jVar10.f45432a, jVar10.f45433b, jVar10.f45399e, jVar10.f45401g, jVar10.h, jVar10.f45402i, jVar10.f45403j, jVar10.f45404k, jVar10.f45405l, jVar10.f45406m, jVar10.f45407n, jVar10.f45434c, true, jVar10.f45409p, jVar10.f45410q, jVar10.f45411r, jVar10.f45412s, jVar10.v, jVar10.f45413t);
                }
                x4Var = null;
            }
            this.d = jVar4;
            uriBuild = this.f45361a;
            if (jVar4 != jVar10) {
                this.f45368s = x4Var;
                this.f45365f = jElapsedRealtime;
                if (uriBuild.equals(cVar.v)) {
                    if (cVar.f45377w == null) {
                        cVar.f45378x = !jVar4.f45408o;
                        cVar.f45379y = jVar4.h;
                    }
                    cVar.f45377w = jVar4;
                    cVar.f45375r.t(jVar4);
                }
                it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    ((r) it2.next()).a();
                }
            } else if (!jVar4.f45408o) {
                size2 = j10 + ((long) jVar.f45411r.size());
                jVar5 = this.d;
                if (size2 < jVar5.f45404k) {
                    x4Var2 = new x4();
                    z11 = true;
                } else {
                    if (jElapsedRealtime - this.f45365f > g0.S(jVar5.f45406m) * 3.5d) {
                        x4Var2 = new x4();
                    } else {
                        x4Var2 = x4Var;
                    }
                    z11 = false;
                }
                if (x4Var2 != null) {
                    this.f45368s = x4Var2;
                    vVar = new v(x4Var2, 1, 1);
                    it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        ((r) it.next()).c(uriBuild, vVar, z11);
                    }
                }
            }
            jVar6 = this.d;
            iVar = jVar6.v;
            j16 = jVar6.f45406m;
            if (!iVar.f45398e) {
                if (jVar6 == jVar10) {
                    j16 /= 2;
                }
                j11 = j16;
            }
            this.h = g0.S(j11) + jElapsedRealtime;
            if (this.d.f45407n == -9223372036854775807L || uriBuild.equals(cVar.v)) {
                jVar7 = this.d;
                if (jVar7.f45408o) {
                }
                iVar2 = jVar7.v;
                if (iVar2.f45395a == -9223372036854775807L || iVar2.f45398e) {
                    builderBuildUpon = uriBuild.buildUpon();
                    jVar8 = this.d;
                    if (jVar8.v.f45398e) {
                        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(jVar8.f45404k + ((long) jVar8.f45411r.size())));
                        jVar9 = this.d;
                        if (jVar9.f45407n != -9223372036854775807L) {
                            zVar4 = jVar9.f45412s;
                            size3 = zVar4.size();
                            if (!zVar4.isEmpty() && ((e) p8.l.g(zVar4)).f45381x) {
                                size3--;
                            }
                            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size3));
                        }
                    }
                    iVar3 = this.d.v;
                    if (iVar3.f45395a != -9223372036854775807L) {
                        if (iVar3.f45396b) {
                            str = "v2";
                        } else {
                            str = "YES";
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_skip", str);
                    }
                    uriBuild = builderBuildUpon.build();
                }
                c(uriBuild);
            }
            return;
        }
        jVar.getClass();
        zVar = jVar.f45411r;
        j10 = jVar.f45404k;
        j11 = 0;
        if (z10) {
            if (jVar.f45408o) {
                jVar4 = jVar10;
            } else if (jVar10.f45408o) {
                jVar4 = jVar10;
                copyOnWriteArrayList = copyOnWriteArrayList;
                j10 = j10;
                x4Var = null;
            } else {
                jVar4 = new j(jVar10.d, jVar10.f45432a, jVar10.f45433b, jVar10.f45399e, jVar10.f45401g, jVar10.h, jVar10.f45402i, jVar10.f45403j, jVar10.f45404k, jVar10.f45405l, jVar10.f45406m, jVar10.f45407n, jVar10.f45434c, true, jVar10.f45409p, jVar10.f45410q, jVar10.f45411r, jVar10.f45412s, jVar10.v, jVar10.f45413t);
            }
            x4Var = null;
        } else {
            copyOnWriteArrayList = copyOnWriteArrayList;
            if (jVar.f45409p) {
                j12 = jVar.h;
            } else {
                jVar2 = cVar.f45377w;
                if (jVar2 != null) {
                    j12 = jVar2.h;
                } else {
                    j12 = 0;
                }
                if (jVar10 == null) {
                    long j110 = jVar10.h;
                    j13 = jVar10.f45404k;
                    zVar2 = jVar10.f45411r;
                    j14 = j12;
                    size = zVar2.size();
                    i10 = (int) (j10 - j13);
                    if (i10 < zVar2.size()) {
                        gVar = (g) zVar2.get(i10);
                    } else {
                        gVar = null;
                    }
                    if (gVar != null) {
                        j15 = gVar.f45390e;
                    } else if (size == j10 - j13) {
                        j15 = jVar10.f45414u;
                    }
                    j12 = j110 + j15;
                }
                if (jVar.f45402i) {
                    i13 = jVar.f45403j;
                } else {
                    jVar3 = cVar.f45377w;
                    if (jVar3 != null) {
                        i11 = jVar3.f45403j;
                    } else {
                        i11 = 0;
                    }
                    if (jVar10 == null) {
                        i12 = (int) (j10 - jVar10.f45404k);
                        zVar3 = jVar10.f45411r;
                        if (i12 < zVar3.size()) {
                            gVar2 = (g) zVar3.get(i12);
                        } else {
                            gVar2 = null;
                        }
                        if (gVar2 != null) {
                            i11 = (jVar10.f45403j + gVar2.d) - ((g) zVar.get(0)).d;
                        }
                    }
                    i13 = i11;
                }
                x4Var = null;
                j10 = j10;
                jVar4 = new j(jVar.d, jVar.f45432a, jVar.f45433b, jVar.f45399e, jVar.f45401g, j14, true, i13, jVar.f45404k, jVar.f45405l, jVar.f45406m, jVar.f45407n, jVar.f45434c, jVar.f45408o, jVar.f45409p, jVar.f45410q, zVar, jVar.f45412s, jVar.v, jVar.f45413t);
            }
            j14 = j12;
            if (jVar.f45402i) {
                i13 = jVar.f45403j;
            } else {
                jVar3 = cVar.f45377w;
                if (jVar3 != null) {
                    i11 = jVar3.f45403j;
                } else {
                    i11 = 0;
                }
                if (jVar10 == null) {
                    i12 = (int) (j10 - jVar10.f45404k);
                    zVar3 = jVar10.f45411r;
                    if (i12 < zVar3.size()) {
                        gVar2 = (g) zVar3.get(i12);
                    } else {
                        gVar2 = null;
                    }
                    if (gVar2 != null) {
                        i11 = (jVar10.f45403j + gVar2.d) - ((g) zVar.get(0)).d;
                    }
                }
                i13 = i11;
            }
            x4Var = null;
            j10 = j10;
            jVar4 = new j(jVar.d, jVar.f45432a, jVar.f45433b, jVar.f45399e, jVar.f45401g, j14, true, i13, jVar.f45404k, jVar.f45405l, jVar.f45406m, jVar.f45407n, jVar.f45434c, jVar.f45408o, jVar.f45409p, jVar.f45410q, zVar, jVar.f45412s, jVar.v, jVar.f45413t);
        }
        this.d = jVar4;
        uriBuild = this.f45361a;
        if (jVar4 != jVar10) {
            this.f45368s = x4Var;
            this.f45365f = jElapsedRealtime;
            if (uriBuild.equals(cVar.v)) {
                if (cVar.f45377w == null) {
                    cVar.f45378x = !jVar4.f45408o;
                    cVar.f45379y = jVar4.h;
                }
                cVar.f45377w = jVar4;
                cVar.f45375r.t(jVar4);
            }
            it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                ((r) it2.next()).a();
            }
        } else if (!jVar4.f45408o) {
            size2 = j10 + ((long) jVar.f45411r.size());
            jVar5 = this.d;
            if (size2 < jVar5.f45404k) {
                x4Var2 = new x4();
                z11 = true;
            } else {
                if (jElapsedRealtime - this.f45365f > g0.S(jVar5.f45406m) * 3.5d) {
                    x4Var2 = new x4();
                } else {
                    x4Var2 = x4Var;
                }
                z11 = false;
            }
            if (x4Var2 != null) {
                this.f45368s = x4Var2;
                vVar = new v(x4Var2, 1, 1);
                it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    ((r) it.next()).c(uriBuild, vVar, z11);
                }
            }
        }
        jVar6 = this.d;
        iVar = jVar6.v;
        j16 = jVar6.f45406m;
        if (!iVar.f45398e) {
            if (jVar6 == jVar10) {
                j16 /= 2;
            }
            j11 = j16;
        }
        this.h = g0.S(j11) + jElapsedRealtime;
        if (this.d.f45407n == -9223372036854775807L) {
        }
        jVar7 = this.d;
        if (jVar7.f45408o) {
            iVar2 = jVar7.v;
            if (iVar2.f45395a == -9223372036854775807L) {
                builderBuildUpon = uriBuild.buildUpon();
                jVar8 = this.d;
                if (jVar8.v.f45398e) {
                    builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(jVar8.f45404k + ((long) jVar8.f45411r.size())));
                    jVar9 = this.d;
                    if (jVar9.f45407n != -9223372036854775807L) {
                        zVar4 = jVar9.f45412s;
                        size3 = zVar4.size();
                        if (!zVar4.isEmpty()) {
                            size3--;
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size3));
                    }
                }
                iVar3 = this.d.v;
                if (iVar3.f45395a != -9223372036854775807L) {
                    if (iVar3.f45396b) {
                        str = "v2";
                    } else {
                        str = "YES";
                    }
                    builderBuildUpon.appendQueryParameter("_HLS_skip", str);
                }
                uriBuild = builderBuildUpon.build();
            } else {
                builderBuildUpon = uriBuild.buildUpon();
                jVar8 = this.d;
                if (jVar8.v.f45398e) {
                    builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(jVar8.f45404k + ((long) jVar8.f45411r.size())));
                    jVar9 = this.d;
                    if (jVar9.f45407n != -9223372036854775807L) {
                        zVar4 = jVar9.f45412s;
                        size3 = zVar4.size();
                        if (!zVar4.isEmpty()) {
                            size3--;
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size3));
                    }
                }
                iVar3 = this.d.v;
                if (iVar3.f45395a != -9223372036854775807L) {
                    if (iVar3.f45396b) {
                        str = "v2";
                    } else {
                        str = "YES";
                    }
                    builderBuildUpon.appendQueryParameter("_HLS_skip", str);
                }
                uriBuild = builderBuildUpon.build();
            }
            c(uriBuild);
        }
    }

    @Override
    public final k0 h(n0 n0Var, IOException iOException, int i10) {
        t0 t0Var = (t0) n0Var;
        long j10 = t0Var.f3043a;
        int i11 = t0Var.f3045c;
        Uri uri = t0Var.d.f3090c;
        j4.p pVar = new j4.p();
        boolean z10 = uri.getQueryParameter("_HLS_msn") != null;
        boolean z11 = iOException instanceof o;
        k0 k0Var = q0.f3028e;
        Uri uri2 = this.f45361a;
        c cVar = this.v;
        if (z10 || z11) {
            int i12 = iOException instanceof h0 ? ((h0) iOException).d : Integer.MAX_VALUE;
            if (z11 || i12 == 400 || i12 == 503) {
                this.h = SystemClock.elapsedRealtime();
                c(uri2);
                j4.g0 g0Var = cVar.f45373f;
                int i13 = g0.f4795a;
                g0Var.i(pVar, i11, iOException, true);
                return k0Var;
            }
        }
        v vVar = new v(iOException, i10, 1);
        Iterator it = cVar.f45372e.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            z12 |= !((r) it.next()).c(uri2, vVar, false);
        }
        ab.a aVar = cVar.f45371c;
        if (z12) {
            aVar.getClass();
            long jA3 = ab.a.A3(vVar);
            k0Var = jA3 != -9223372036854775807L ? new k0(0, jA3, false) : q0.f3029f;
        }
        boolean zA = k0Var.a();
        cVar.f45373f.i(pVar, i11, iOException, !zA);
        if (!zA) {
            aVar.getClass();
        }
        return k0Var;
    }

    @Override
    public final void l(n0 n0Var, long j10, long j11) {
        t0 t0Var = (t0) n0Var;
        n nVar = (n) t0Var.f3047f;
        Uri uri = t0Var.d.f3090c;
        j4.p pVar = new j4.p();
        if (nVar instanceof j) {
            e((j) nVar);
            this.v.f45373f.f(pVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            t1 t1VarB = t1.b("Loaded playlist has unexpected type.", null);
            this.f45368s = t1VarB;
            this.v.f45373f.i(pVar, 4, t1VarB, true);
        }
        this.v.f45371c.getClass();
    }
}
