package p4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.text.TextUtils;
import bi.nb;
import bi.ub;
import c8.ab;
import h9.t1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import jg.a2;
import org.telegram.messenger.re;
import org.telegram.ui.Components.hr;
public final class m0 extends android.support.v4.media.session.s {
    public static final int f53362z;
    public final ui.e f53363g;
    public final d0 h;
    public final q4.u f53364i;
    public final re f53365j;
    public final android.support.v4.media.session.q f53366k;
    public final boolean f53367l;
    public final b f53368m;
    public final q4.q f53369n;
    public final androidx.mediarouter.app.f f53370o;
    public final ComponentName f53371p;
    public final boolean f53372q;
    public volatile long f53373r;
    public re f53374s;
    public int f53375t;
    public final Bundle f53376u;
    public h9.i0 v;
    public h9.i0 f53377w;
    public j1 f53378x;
    public e2.y0 f53379y;

    static {
        int i7;
        if (Build.VERSION.SDK_INT >= 31) {
            i7 = 33554432;
        } else {
            i7 = 0;
        }
        f53362z = i7;
    }

    public m0(p4.d0 r14, android.net.Uri r15, android.os.Handler r16, android.os.Bundle r17, boolean r18, h9.i0 r19, h9.i0 r20, p4.j1 r21, e2.y0 r22, android.os.Bundle r23) {
        throw new UnsupportedOperationException("Method not decompiled: p4.m0.<init>(p4.d0, android.net.Uri, android.os.Handler, android.os.Bundle, boolean, h9.i0, h9.i0, p4.j1, e2.y0, android.os.Bundle):void");
    }

    public static void e0(q4.q qVar, ArrayList arrayList) {
        int i7 = 0;
        if (arrayList != null) {
            qVar.getClass();
            HashSet hashSet = new HashSet();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                long j3 = ((q4.o) obj).f53797b;
                if (hashSet.contains(Long.valueOf(j3))) {
                    h2.a.d("MediaSessionCompat", a8.p0.o(j3, "Found duplicate queue id: "), new IllegalArgumentException("id of each queue item should be unique"));
                }
                hashSet.add(Long.valueOf(j3));
            }
        }
        q4.l lVar = (q4.l) qVar.f53803b;
        MediaSession mediaSession = lVar.f53785a;
        lVar.h = arrayList;
        if (arrayList == null) {
            mediaSession.setQueue(null);
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        while (i7 < size2) {
            Object obj2 = arrayList.get(i7);
            i7++;
            q4.o oVar = (q4.o) obj2;
            MediaSession.QueueItem queueItem = oVar.f53798c;
            if (queueItem == null) {
                MediaSession.QueueItem queueItem2 = new MediaSession.QueueItem(oVar.f53796a.a(), oVar.f53797b);
                oVar.f53798c = queueItem2;
                queueItem = queueItem2;
            }
            arrayList2.add(queueItem);
        }
        mediaSession.setQueue(arrayList2);
    }

    public static void f0(q4.q qVar, q4.i iVar) {
        q4.l lVar = (q4.l) qVar.f53803b;
        lVar.f53791i = iVar;
        MediaSession mediaSession = lVar.f53785a;
        Bundle bundle = iVar.f53781a;
        if (iVar.f53782b == null) {
            MediaMetadata.Builder builder = new MediaMetadata.Builder();
            for (String str : bundle.keySet()) {
                Integer num = (Integer) q4.i.f53780c.get(str);
                if (num == null) {
                    num = -1;
                }
                int intValue = num.intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue != 2) {
                            if (intValue != 3) {
                                Object obj = bundle.get(str);
                                if (obj != null && !(obj instanceof CharSequence)) {
                                    if (obj instanceof Long) {
                                        builder.putLong(str, ((Long) obj).longValue());
                                    }
                                } else {
                                    builder.putText(str, (CharSequence) obj);
                                }
                            } else {
                                builder.putRating(str, (Rating) bundle.getParcelable(str));
                            }
                        } else {
                            builder.putBitmap(str, (Bitmap) bundle.getParcelable(str));
                        }
                    } else {
                        builder.putText(str, bundle.getCharSequence(str));
                    }
                } else {
                    builder.putLong(str, bundle.getLong(str));
                }
            }
            iVar.f53782b = builder.build();
        }
        mediaSession.setMetadata(iVar.f53782b);
    }

    public static e2.l0 g0(String str, Uri uri, String str2, Bundle bundle) {
        e2.z zVar = new e2.z();
        h9.g0 g0Var = h9.i0.f14329b;
        t1 t1Var = t1.f14397e;
        List list = Collections.EMPTY_LIST;
        t1 t1Var2 = t1.f14397e;
        e2.e0 e0Var = new e2.e0();
        e2.h0 h0Var = e2.h0.d;
        if (str == null) {
            str = "";
        }
        String str3 = str;
        android.support.v4.media.session.a0 a0Var = new android.support.v4.media.session.a0(20, false);
        a0Var.f1763b = uri;
        a0Var.f1764c = str2;
        a0Var.d = bundle;
        return new e2.l0(str3, new e2.a0(zVar), null, new e2.f0(e0Var), e2.o0.L, new e2.h0(a0Var));
    }

    public static ComponentName k0(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        }
        return null;
    }

    @Override
    public final void A(String str, Bundle bundle) {
        l0(g0(null, null, str, bundle), true, false);
    }

    @Override
    public final void D(Uri uri, Bundle bundle) {
        l0(g0(null, uri, null, bundle), true, false);
    }

    @Override
    public final void E(q4.h hVar) {
        if (hVar == null) {
            return;
        }
        i0(20, new org.telegram.ui.web.a0(3, this, hVar), ((q4.l) this.f53369n.f53803b).c(), true);
    }

    @Override
    public final void F() {
        i0(11, new g0(this, 5), ((q4.l) this.f53369n.f53803b).c(), true);
    }

    @Override
    public final void G(long j3) {
        i0(5, new f0(this, j3, 1), ((q4.l) this.f53369n.f53803b).c(), true);
    }

    @Override
    public final void J(final float f10) {
        if (f10 <= 0.0f) {
            return;
        }
        i0(13, new l0() {
            @Override
            public final void f(v vVar) {
                m0.this.h.f53217t.d(f10);
            }
        }, ((q4.l) this.f53369n.f53803b).c(), true);
    }

    @Override
    public final void K(q4.y yVar) {
        L(yVar);
    }

    @Override
    public final void L(q4.y yVar) {
        e2.d1 c10 = n.c(yVar);
        if (c10 == null) {
            h2.a.l("MediaSessionLegacyStub", "Ignoring invalid RatingCompat " + yVar);
            return;
        }
        j0(null, 40010, new g0(this, c10), ((q4.l) this.f53369n.f53803b).c());
    }

    @Override
    public final void M(int i7) {
        i0(15, new i0(this, i7, 0), ((q4.l) this.f53369n.f53803b).c(), true);
    }

    @Override
    public final void P(int i7) {
        i0(14, new i0(this, i7, 1), ((q4.l) this.f53369n.f53803b).c(), true);
    }

    @Override
    public final void S() {
        boolean p02 = this.h.f53217t.p0(9);
        q4.q qVar = this.f53369n;
        if (p02) {
            i0(9, new g0(this, 10), ((q4.l) qVar.f53803b).c(), true);
        } else {
            i0(8, new g0(this, 11), ((q4.l) qVar.f53803b).c(), true);
        }
    }

    @Override
    public final void V() {
        boolean p02 = this.h.f53217t.p0(7);
        q4.q qVar = this.f53369n;
        if (p02) {
            i0(7, new g0(this, 2), ((q4.l) qVar.f53803b).c(), true);
        } else {
            i0(6, new g0(this, 3), ((q4.l) qVar.f53803b).c(), true);
        }
    }

    @Override
    public final void Y(long j3) {
        if (j3 < 0) {
            return;
        }
        i0(10, new f0(this, j3, 0), ((q4.l) this.f53369n.f53803b).c(), true);
    }

    @Override
    public final void b0() {
        i0(3, new g0(this, 8), ((q4.l) this.f53369n.f53803b).c(), true);
    }

    @Override
    public final void c(q4.h hVar) {
        if (hVar != null) {
            i0(20, new a2(this, hVar, -1, 16), ((q4.l) this.f53369n.f53803b).c(), false);
        }
    }

    @Override
    public final void d(q4.h hVar, int i7) {
        if (hVar != null) {
            if (i7 == -1 || i7 >= 0) {
                i0(20, new a2(this, hVar, i7, 16), ((q4.l) this.f53369n.f53803b).c(), false);
            }
        }
    }

    @Override
    public final void e(String str, Bundle bundle, ResultReceiver resultReceiver) {
        if (str.equals("androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST")) {
            return;
        }
        if (str.equals("androidx.media3.session.SESSION_COMMAND_REQUEST_SESSION3_TOKEN") && resultReceiver != null) {
            n1 n1Var = this.h.f53207j;
            n1Var.getClass();
            String str2 = n1.f53390b;
            Bundle bundle2 = new Bundle();
            o1 o1Var = n1Var.f53392a;
            if (o1Var != null) {
                bundle2.putInt(str2, 0);
            } else {
                bundle2.putInt(str2, 1);
            }
            String str3 = n1.f53391c;
            o1Var.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putInt(o1.f53402i, o1Var.f53412a);
            bundle3.putInt(o1.f53403j, 0);
            bundle3.putInt(o1.f53404k, o1Var.f53413b);
            bundle3.putString(o1.f53405l, o1Var.d);
            bundle3.putString(o1.f53406m, o1Var.f53415e);
            bundle3.putBinder(o1.f53408o, o1Var.f53416f);
            bundle3.putParcelable(o1.f53407n, null);
            bundle3.putBundle(o1.f53409p, o1Var.f53417g);
            bundle3.putInt(o1.f53410q, o1Var.f53414c);
            MediaSession.Token token = o1Var.h;
            if (token != null) {
                bundle3.putParcelable(o1.f53411r, token);
            }
            bundle2.putBundle(str3, bundle3);
            resultReceiver.send(0, bundle2);
            return;
        }
        i1 i1Var = new i1(str, Bundle.EMPTY);
        j0(i1Var, 0, new hr(this, i1Var, bundle, resultReceiver), ((q4.l) this.f53369n.f53803b).c());
    }

    @Override
    public final void g(java.lang.String r7, android.os.Bundle r8) {
        throw new UnsupportedOperationException("Method not decompiled: p4.m0.g(java.lang.String, android.os.Bundle):void");
    }

    @Override
    public final void h() {
        i0(12, new g0(this, 4), ((q4.l) this.f53369n.f53803b).c(), true);
    }

    public final q4.w h0(g1 g1Var) {
        boolean z9;
        boolean z10;
        int i7;
        int i10;
        long j3;
        float f10;
        Bundle bundle;
        long j10;
        String str;
        int i11;
        int i12;
        int i13;
        long j11;
        e2.v0 W = g1Var.W();
        if (g1Var.p0(16) && !g1Var.P0()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (W == null && !h2.m0.c0(g1Var, this.f53372q)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (W != null) {
            i10 = 7;
        } else {
            int i14 = n.f53386a;
            if (g1Var.W() != null) {
                i7 = 7;
            } else {
                int i15 = g1Var.i();
                if (i15 != 1) {
                    if (i15 != 2) {
                        if (i15 != 3) {
                            if (i15 == 4) {
                                i7 = 1;
                            } else {
                                throw new IllegalArgumentException(jg.g.j(i15, "Unrecognized State: "));
                            }
                        } else {
                            if (!z10) {
                                i7 = 3;
                            }
                            i7 = 2;
                        }
                    } else {
                        if (!z10) {
                            i7 = 6;
                        }
                        i7 = 2;
                    }
                } else {
                    i7 = 0;
                }
            }
            i10 = i7;
        }
        e2.y0 a10 = ab.a(this.f53379y, g1Var.t());
        long j12 = 128;
        for (int i16 = 0; i16 < a10.f10656a.f10542a.size(); i16++) {
            int a11 = a10.f10656a.a(i16);
            if (a11 != 1) {
                if (a11 != 2) {
                    if (a11 != 3) {
                        if (a11 != 31) {
                            switch (a11) {
                                case 5:
                                    j11 = 256;
                                    continue;
                                case 6:
                                case 7:
                                    j11 = 16;
                                    continue;
                                case 8:
                                case 9:
                                    j11 = 32;
                                    continue;
                                case 10:
                                    j11 = 4096;
                                    continue;
                                case 11:
                                    j11 = 8;
                                    continue;
                                case 12:
                                    j11 = 64;
                                    continue;
                                case 13:
                                    j11 = 4194304;
                                    continue;
                                case 14:
                                    j11 = 2621440;
                                    continue;
                                case 15:
                                    j11 = 262144;
                                    continue;
                                default:
                                    j11 = 0;
                                    continue;
                            }
                        } else {
                            j11 = 240640;
                        }
                    } else {
                        j11 = 1;
                    }
                } else {
                    j11 = 16384;
                }
            } else if (z10) {
                j11 = 516;
            } else {
                j11 = 514;
            }
            j12 |= j11;
        }
        if (!this.f53377w.isEmpty() && d.c(2, this.v)) {
            j12 &= -17;
        }
        if (!this.f53377w.isEmpty() && d.c(3, this.v)) {
            j12 &= -33;
        }
        if (!z9) {
            j12 &= -257;
        }
        long j13 = j12;
        long j14 = -1;
        if (g1Var.p0(17)) {
            int o02 = g1Var.o0();
            int i17 = n.f53386a;
            j3 = o02 == -1 ? -1L : o02;
        } else {
            j3 = -1;
        }
        float f11 = g1Var.j().f10638a;
        if (g1Var.h() && z9) {
            f10 = f11;
        } else {
            f10 = 0.0f;
        }
        if (W != null) {
            bundle = new Bundle(W.f10631c);
        } else {
            bundle = new Bundle();
        }
        bundle.putAll(this.f53376u);
        bundle.putFloat("EXO_SPEED", f11);
        e2.l0 S0 = g1Var.S0();
        if (S0 != null) {
            String str2 = S0.f10349a;
            if (!"".equals(str2)) {
                bundle.putString("androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID", str2);
            }
        }
        if (z9) {
            j10 = g1Var.l();
        } else {
            j10 = -1;
        }
        if (z9) {
            j14 = g1Var.d0();
        }
        ArrayList arrayList = new ArrayList();
        long j15 = j14;
        long j16 = j10;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i18 = 0; i18 < this.v.size(); i18++) {
            d dVar = (d) this.v.get(i18);
            i1 i1Var = dVar.f53194a;
            Bundle bundle2 = dVar.d;
            if (i1Var != null) {
                Bundle bundle3 = i1Var.f53309c;
                String str3 = i1Var.f53308b;
                if (dVar.f53198f && i1Var.f53307a == 0) {
                    j1 j1Var = this.f53378x;
                    if ((i1Var != null && j1Var.f53335a.contains(i1Var)) || (((i13 = dVar.f53195b) != -1 && a10.a(i13)) || d.j(str3))) {
                        if (!bundle2.isEmpty()) {
                            bundle3 = new Bundle(bundle3);
                        }
                        if (!bundle2.isEmpty()) {
                            bundle3.putAll(bundle2);
                        }
                        int i19 = dVar.f53196c;
                        if (!TextUtils.isEmpty(str3)) {
                            if (!TextUtils.isEmpty("")) {
                                if (i19 != 0) {
                                    arrayList.add(new q4.v(str3, i19, bundle3));
                                } else {
                                    throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                                }
                            } else {
                                throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                            }
                        } else {
                            throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                        }
                    }
                }
            }
        }
        if (W != null) {
            int i20 = n.f53386a;
            int i21 = W.f10629a;
            if (i21 != -110) {
                if (i21 != -109) {
                    if (i21 != -6) {
                        if (i21 != -2) {
                            if (i21 != 1) {
                                switch (i21) {
                                    case -107:
                                        i12 = 9;
                                        break;
                                    case -106:
                                        i12 = 7;
                                        break;
                                    case -105:
                                        i12 = 6;
                                        break;
                                    case -104:
                                        i12 = 5;
                                        break;
                                    case -103:
                                        i12 = 4;
                                        break;
                                    case -102:
                                        i12 = 3;
                                        break;
                                    default:
                                        i12 = 0;
                                        break;
                                }
                            } else {
                                i12 = 10;
                            }
                        } else {
                            i12 = 1;
                        }
                    } else {
                        i12 = 2;
                    }
                } else {
                    i12 = 11;
                }
            } else {
                i12 = 8;
            }
            str = W.getMessage();
            i11 = i12;
        } else {
            str = null;
            i11 = 0;
        }
        return new q4.w(i10, j16, j15, f10, j13, i11, str, elapsedRealtime, arrayList, j3, bundle);
    }

    @Override
    public final boolean i(android.content.Intent r13) {
        throw new UnsupportedOperationException("Method not decompiled: p4.m0.i(android.content.Intent):boolean");
    }

    public final void i0(int i7, l0 l0Var, q4.r rVar, boolean z9) {
        d0 d0Var = this.h;
        if (d0Var.j()) {
            return;
        }
        if (rVar == null) {
            h2.a.b("MediaSessionLegacyStub", "RemoteUserInfo is null, ignoring command=" + i7);
            return;
        }
        h2.m0.W(d0Var.f53209l, new nb(this, i7, rVar, l0Var, z9));
    }

    public final void j0(i1 i1Var, int i7, l0 l0Var, q4.r rVar) {
        if (rVar == null) {
            StringBuilder sb2 = new StringBuilder("RemoteUserInfo is null, ignoring command=");
            Object obj = i1Var;
            if (i1Var == null) {
                obj = Integer.valueOf(i7);
            }
            sb2.append(obj);
            h2.a.b("MediaSessionLegacyStub", sb2.toString());
            return;
        }
        h2.m0.W(this.h.f53209l, new ub(this, i1Var, i7, rVar, l0Var, 24));
    }

    @Override
    public final void k() {
        i0(1, new g0(this, 12), ((q4.l) this.f53369n.f53803b).c(), true);
    }

    public final void l0(e2.l0 l0Var, boolean z9, boolean z10) {
        i0(31, new z(this, l0Var, z9, z10), ((q4.l) this.f53369n.f53803b).c(), false);
    }

    public final v m0(q4.r rVar) {
        v x10 = this.f53363g.x(rVar);
        if (x10 == null) {
            v vVar = new v(rVar, 0, 0, this.f53364i.b(rVar), new k0(rVar), Bundle.EMPTY);
            t m10 = this.h.m(vVar);
            this.f53363g.b(rVar, vVar, m10.f53445a, m10.f53446b);
            d0 d0Var = this.h;
            if (!d0Var.f53220x || !d0.k(vVar)) {
                d0Var.f53203e.getClass();
            }
            x10 = vVar;
        }
        android.support.v4.media.session.q qVar = this.f53366k;
        long j3 = this.f53373r;
        qVar.removeMessages(1001, x10);
        qVar.sendMessageDelayed(qVar.obtainMessage(1001, x10), j3);
        return x10;
    }

    @Override
    public final void n() {
        i0(1, new g0(this, 6), ((q4.l) this.f53369n.f53803b).c(), false);
    }

    public final void n0() {
        b bVar;
        int i7;
        h9.i0 i0Var = this.f53377w;
        j1 j1Var = this.f53378x;
        e2.y0 y0Var = this.f53379y;
        String str = d.h;
        ?? b0Var = new h9.b0(4);
        for (int i10 = 0; i10 < i0Var.size(); i10++) {
            d dVar = (d) i0Var.get(i10);
            i1 i1Var = dVar.f53194a;
            if ((i1Var != null && j1Var.f53335a.contains(i1Var)) || ((i7 = dVar.f53195b) != -1 && y0Var.a(i7))) {
                b0Var.c(dVar);
            } else {
                if (dVar.f53198f) {
                    dVar = new d(dVar.f53194a, dVar.f53195b, dVar.f53196c, new Bundle(dVar.d), false, dVar.f53197e, dVar.f53199g);
                }
                b0Var.c(dVar);
            }
        }
        this.v = d.g(b0Var.f());
        boolean z9 = this.f53367l;
        Bundle bundle = this.f53376u;
        boolean z10 = true;
        if (!z9 || ((bVar = this.f53368m) != null && bVar.f53168e.get())) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", !d.c(2, this.v));
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", !d.c(3, this.v));
            return;
        }
        bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", (this.v.isEmpty() || d.c(2, this.v)) ? false : false);
        bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
    }

    public final void o0() {
        Bundle bundle = this.f53376u;
        boolean z9 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
        boolean z10 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
        n0();
        if (bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false) == z9 && bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false) == z10) {
            return;
        }
        ((q4.l) this.f53369n.f53803b).f53785a.setExtras(bundle);
    }

    public final void p0(g1 g1Var) {
        h2.m0.W(this.h.f53209l, new h0(this, g1Var, 1));
    }

    @Override
    public final void q(String str, Bundle bundle) {
        l0(g0(str, null, null, bundle), true, true);
    }

    @Override
    public final void u(String str, Bundle bundle) {
        l0(g0(null, null, str, bundle), true, true);
    }

    @Override
    public final void v(Uri uri, Bundle bundle) {
        l0(g0(null, uri, null, bundle), true, true);
    }

    @Override
    public final void w() {
        i0(2, new g0(this, 7), ((q4.l) this.f53369n.f53803b).c(), true);
    }

    @Override
    public final void x(String str, Bundle bundle) {
        l0(g0(str, null, null, bundle), true, false);
    }
}
