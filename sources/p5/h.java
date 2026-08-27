package p5;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.g0;
import android.support.v4.media.session.w;
import android.text.TextUtils;
import android.util.Log;
import c2.t0;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.ReconnectionService;
import com.google.android.gms.internal.cast.p;
import com.google.android.gms.internal.cast.y;
import java.util.ArrayList;
import java.util.List;
import m5.r;
import n5.d0;
import o5.o;
import org.telegram.ui.Components.mu0;
import org.telegram.ui.i6;
import y5.l;

public final class h {
    public static final r5.b v = new r5.b("MediaSessionManager", null);

    public final Context f45488a;

    public final n5.b f45489b;

    public final p f45490c;
    public final n5.h d;

    public final o5.f f45491e;

    public final ComponentName f45492f;

    public final ComponentName f45493g;
    public final af.h h;

    public final af.h f45494i;

    public final f f45495j;

    public final t0 f45496k;

    public final mu0 f45497l;

    public final d0 f45498m;

    public o5.h f45499n;

    public CastDevice f45500o;

    public android.support.v4.media.session.d0 f45501p;

    public boolean f45502q;

    public PlaybackStateCompat.CustomAction f45503r;

    public PlaybackStateCompat.CustomAction f45504s;

    public PlaybackStateCompat.CustomAction f45505t;

    public PlaybackStateCompat.CustomAction f45506u;

    public h(Context context, n5.b bVar, p pVar) {
        o5.f fVar;
        this.f45488a = context;
        this.f45489b = bVar;
        this.f45490c = pVar;
        r5.b bVar2 = n5.a.f18276l;
        l.e("Must be called from the main thread.");
        n5.a aVar = n5.a.f18278n;
        f fVar2 = null;
        this.d = aVar != null ? aVar.b() : null;
        o5.a aVar2 = bVar.f18294f;
        this.f45491e = aVar2 == null ? null : aVar2.d;
        this.f45498m = new d0(this, 2);
        String str = aVar2 == null ? null : aVar2.f19298b;
        this.f45492f = !TextUtils.isEmpty(str) ? new ComponentName(context, str) : null;
        String str2 = aVar2 == null ? null : aVar2.f19297a;
        this.f45493g = !TextUtils.isEmpty(str2) ? new ComponentName(context, str2) : null;
        af.h hVar = new af.h(context);
        this.h = hVar;
        hVar.f277e = new o0.b(this, 11);
        af.h hVar2 = new af.h(context);
        this.f45494i = hVar2;
        hVar2.f277e = new n1.d(this, 14);
        this.f45496k = new t0(Looper.getMainLooper(), 1);
        r5.b bVar3 = f.f45468u;
        o5.a aVar3 = bVar.f18294f;
        if (aVar3 != null && (fVar = aVar3.d) != null) {
            o oVar = fVar.R;
            if (oVar == null) {
                fVar2 = new f(context);
            } else {
                ArrayList arrayListA = i.a(oVar);
                int[] iArrB = i.b(oVar);
                int size = arrayListA == null ? 0 : arrayListA.size();
                if (arrayListA == null || arrayListA.isEmpty()) {
                    Log.e(bVar3.f46768a, bVar3.d(o5.e.class.getSimpleName().concat(" doesn't provide any action."), new Object[0]));
                } else if (arrayListA.size() > 5) {
                    Log.e(bVar3.f46768a, bVar3.d(o5.e.class.getSimpleName().concat(" provides more than 5 actions."), new Object[0]));
                } else if (iArrB == null || (iArrB.length) == 0) {
                    Log.e(bVar3.f46768a, bVar3.d(o5.e.class.getSimpleName().concat(" doesn't provide any actions for compact view."), new Object[0]));
                } else {
                    for (int i10 : iArrB) {
                        if (i10 < 0 || i10 >= size) {
                            Log.e(bVar3.f46768a, bVar3.d(o5.e.class.getSimpleName().concat("provides a compact view action whose index is out of bounds."), new Object[0]));
                        }
                    }
                    fVar2 = new f(context);
                }
            }
        }
        this.f45495j = fVar2;
        this.f45497l = new mu0(this, 4);
    }

    public final void a(o5.h hVar, CastDevice castDevice) {
        ComponentName componentName;
        n5.b bVar = this.f45489b;
        o5.a aVar = bVar == null ? null : bVar.f18294f;
        if (this.f45502q || bVar == null || aVar == null || this.f45491e == null || hVar == null || castDevice == null || (componentName = this.f45493g) == null) {
            v.b("skip attaching media session", new Object[0]);
            return;
        }
        this.f45499n = hVar;
        hVar.p(this.f45498m);
        this.f45500o = castDevice;
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(componentName);
        int i10 = y.f3714a;
        Context context = this.f45488a;
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, i10);
        if (aVar.f19301f) {
            android.support.v4.media.session.d0 d0Var = new android.support.v4.media.session.d0(context, "CastMediaSession", componentName, broadcast);
            this.f45501p = d0Var;
            j(0, null);
            CastDevice castDevice2 = this.f45500o;
            if (castDevice2 != null && !TextUtils.isEmpty(castDevice2.d)) {
                Bundle bundle = new Bundle();
                String string = context.getResources().getString(2131701273, this.f45500o.d);
                a0.f fVar = MediaMetadataCompat.d;
                if (fVar.containsKey("android.media.metadata.ALBUM_ARTIST") && ((Integer) fVar.get("android.media.metadata.ALBUM_ARTIST")).intValue() != 1) {
                    throw new IllegalArgumentException("The android.media.metadata.ALBUM_ARTIST key cannot be used to put a String");
                }
                bundle.putCharSequence("android.media.metadata.ALBUM_ARTIST", string);
                d0Var.e(new MediaMetadataCompat(bundle));
            }
            d0Var.d(new g(this), null);
            d0Var.c(true);
            this.f45490c.J0(d0Var);
        }
        this.f45502q = true;
        b();
    }

    public final void b() {
        MediaInfo mediaInfoD;
        m5.l lVar;
        boolean z10;
        boolean z11;
        m5.p pVarC;
        MediaInfo mediaInfo;
        o5.h hVar = this.f45499n;
        if (hVar == null) {
            return;
        }
        int iS = hVar.s();
        MediaInfo mediaInfoD2 = hVar.d();
        if (hVar.k() && (pVarC = hVar.c()) != null && (mediaInfo = pVarC.f17824a) != null) {
            mediaInfoD2 = mediaInfo;
        }
        j(iS, mediaInfoD2);
        if (!hVar.h()) {
            h();
            i();
            return;
        }
        if (iS != 0) {
            f fVar = this.f45495j;
            if (fVar != null) {
                v.b("Update media notification.", new Object[0]);
                CastDevice castDevice = this.f45500o;
                o5.h hVar2 = this.f45499n;
                android.support.v4.media.session.d0 d0Var = this.f45501p;
                if (castDevice != null && hVar2 != null && d0Var != null && (mediaInfoD = hVar2.d()) != null && (lVar = mediaInfoD.d) != null) {
                    List list = lVar.f17807a;
                    r rVarE = hVar2.e();
                    if (rVarE == null) {
                        z10 = false;
                        z11 = false;
                    } else {
                        int i10 = rVarE.B;
                        if (i10 == 1 || i10 == 2 || i10 == 3) {
                            z10 = true;
                            z11 = true;
                        } else {
                            Integer num = (Integer) rVarE.J.get(rVarE.f17834c);
                            if (num != null) {
                                boolean z12 = num.intValue() > 0;
                                if (num.intValue() < rVarE.C.size() - 1) {
                                    z11 = z12;
                                    z10 = true;
                                } else {
                                    z11 = z12;
                                    z10 = false;
                                }
                            } else {
                                z10 = false;
                                z11 = false;
                            }
                        }
                    }
                    boolean z13 = hVar2.f() == 2;
                    int i11 = mediaInfoD.f3144b;
                    m5.l.c(1, "com.google.android.gms.cast.metadata.TITLE");
                    String string = lVar.f17808b.getString("com.google.android.gms.cast.metadata.TITLE");
                    String str = castDevice.d;
                    ge.b bVar = new ge.b(z13, i11, string, str, d0Var.f818a.f844b, z10, z11);
                    boolean z14 = z13;
                    boolean z15 = z10;
                    boolean z16 = z11;
                    ge.b bVar2 = fVar.f45477k;
                    if (bVar2 == null || z14 != bVar2.f6846a || i11 != bVar2.f6847b || !r5.a.d(string, (String) bVar2.f6850f) || !r5.a.d(str, (String) bVar2.f6851g) || z15 != bVar2.f6848c || z16 != bVar2.d) {
                        fVar.f45477k = bVar;
                        fVar.b();
                    }
                    i6 i6Var = new i6((list == null || list.isEmpty()) ? null : (x5.a) list.get(0));
                    Uri uri = (Uri) i6Var.f38984b;
                    i6 i6Var2 = fVar.f45478l;
                    if (i6Var2 == null || !r5.a.d(uri, (Uri) i6Var2.f38984b)) {
                        af.h hVar3 = fVar.f45475i;
                        hVar3.f277e = new i6(15, fVar, i6Var);
                        hVar3.C(uri);
                    }
                }
            }
            if (hVar.k()) {
                return;
            }
            g(true);
        }
    }

    public final long c(String str, int i10, Bundle bundle) {
        long j10;
        int iHashCode = str.hashCode();
        if (iHashCode != -945151566) {
            if (iHashCode != -945080078) {
                if (iHashCode == 235550565 && str.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK")) {
                    if (i10 == 3) {
                        j10 = 514;
                        i10 = 3;
                    } else {
                        j10 = 512;
                    }
                    if (i10 != 2) {
                        return j10;
                    }
                    return 516L;
                }
            } else if (str.equals("com.google.android.gms.cast.framework.action.SKIP_PREV")) {
                o5.h hVar = this.f45499n;
                if (hVar != null && hVar.h()) {
                    r rVarE = hVar.e();
                    l.h(rVarE);
                    if ((128 & rVarE.f17837n) != 0 || rVarE.B != 0) {
                        return 16L;
                    }
                    Integer num = (Integer) rVarE.J.get(rVarE.f17834c);
                    if (num != null && num.intValue() > 0) {
                        return 16L;
                    }
                }
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
                return 0L;
            }
        } else if (str.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT")) {
            o5.h hVar2 = this.f45499n;
            if (hVar2 != null && hVar2.h()) {
                r rVarE2 = hVar2.e();
                l.h(rVarE2);
                if ((64 & rVarE2.f17837n) != 0 || rVarE2.B != 0) {
                    return 32L;
                }
                Integer num2 = (Integer) rVarE2.J.get(rVarE2.f17834c);
                if (num2 != null && num2.intValue() < rVarE2.C.size() - 1) {
                    return 32L;
                }
            }
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        }
        return 0L;
    }

    public final Uri d(m5.l lVar) {
        o5.a aVar = this.f45489b.f18294f;
        if (aVar != null) {
            aVar.b();
        }
        List list = lVar.f17807a;
        x5.a aVar2 = (list == null || list.isEmpty()) ? null : (x5.a) lVar.f17807a.get(0);
        if (aVar2 == null) {
            return null;
        }
        return aVar2.f49364b;
    }

    public final void e(Bitmap bitmap, int i10) {
        android.support.v4.media.session.d0 d0Var = this.f45501p;
        if (d0Var == null) {
            return;
        }
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            bitmap.eraseColor(0);
        }
        android.support.v4.media.session.d0 d0Var2 = this.f45501p;
        MediaMetadataCompat mediaMetadataCompatA = d0Var2 == null ? null : d0Var2.f819b.a();
        android.support.v4.media.c cVar = mediaMetadataCompatA == null ? new android.support.v4.media.c() : new android.support.v4.media.c(mediaMetadataCompatA);
        cVar.c(i10 == 0 ? "android.media.metadata.DISPLAY_ICON" : "android.media.metadata.ALBUM_ART", bitmap);
        d0Var.e(cVar.a());
    }

    public final void f(g0 g0Var, String str, o5.d dVar) {
        String str2;
        int i10;
        int iHashCode = str.hashCode();
        Context context = this.f45488a;
        PlaybackStateCompat.CustomAction customAction = null;
        o5.f fVar = this.f45491e;
        switch (iHashCode) {
            case -1699820260:
                if (str.equals("com.google.android.gms.cast.framework.action.REWIND")) {
                    if (this.f45504s == null && fVar != null) {
                        long j10 = fVar.f19321c;
                        r5.b bVar = i.f45507a;
                        int i11 = fVar.N;
                        if (j10 == 10000) {
                            i11 = fVar.O;
                        } else if (j10 == 30000) {
                            i11 = fVar.P;
                        }
                        int i12 = fVar.f19329y;
                        if (j10 == 10000) {
                            i12 = fVar.A;
                        } else if (j10 == 30000) {
                            i12 = fVar.B;
                        }
                        String string = context.getResources().getString(i11);
                        if (TextUtils.isEmpty("com.google.android.gms.cast.framework.action.REWIND")) {
                            throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                        }
                        if (TextUtils.isEmpty(string)) {
                            throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                        }
                        if (i12 == 0) {
                            throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                        }
                        this.f45504s = new PlaybackStateCompat.CustomAction("com.google.android.gms.cast.framework.action.REWIND", string, i12, null);
                    }
                    customAction = this.f45504s;
                } else if (dVar != null) {
                    str2 = dVar.f19318c;
                    i10 = dVar.f19317b;
                    if (TextUtils.isEmpty(str)) {
                        throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                    }
                    if (TextUtils.isEmpty(str2)) {
                        throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                    }
                    if (i10 == 0) {
                        throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                    }
                    customAction = new PlaybackStateCompat.CustomAction(str, str2, i10, null);
                }
                if (customAction != null) {
                    g0Var.a(customAction);
                    return;
                }
                return;
            case -668151673:
                if (str.equals("com.google.android.gms.cast.framework.action.STOP_CASTING")) {
                    if (this.f45505t == null && fVar != null) {
                        String string2 = context.getResources().getString(fVar.Q);
                        int i13 = fVar.C;
                        if (TextUtils.isEmpty("com.google.android.gms.cast.framework.action.STOP_CASTING")) {
                            throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                        }
                        if (TextUtils.isEmpty(string2)) {
                            throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                        }
                        if (i13 == 0) {
                            throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                        }
                        this.f45505t = new PlaybackStateCompat.CustomAction("com.google.android.gms.cast.framework.action.STOP_CASTING", string2, i13, null);
                    }
                    customAction = this.f45505t;
                } else if (dVar != null) {
                    str2 = dVar.f19318c;
                    i10 = dVar.f19317b;
                    if (TextUtils.isEmpty(str)) {
                        throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                    }
                    if (TextUtils.isEmpty(str2)) {
                        throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                    }
                    if (i10 == 0) {
                        throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                    }
                    customAction = new PlaybackStateCompat.CustomAction(str, str2, i10, null);
                }
                if (customAction != null) {
                    g0Var.a(customAction);
                    return;
                }
                return;
            case -124479363:
                if (str.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                    if (this.f45506u == null && fVar != null) {
                        String string3 = context.getResources().getString(fVar.Q);
                        int i14 = fVar.C;
                        if (TextUtils.isEmpty("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                            throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                        }
                        if (TextUtils.isEmpty(string3)) {
                            throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                        }
                        if (i14 == 0) {
                            throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                        }
                        this.f45506u = new PlaybackStateCompat.CustomAction("com.google.android.gms.cast.framework.action.DISCONNECT", string3, i14, null);
                    }
                    customAction = this.f45506u;
                } else if (dVar != null) {
                    str2 = dVar.f19318c;
                    i10 = dVar.f19317b;
                    if (TextUtils.isEmpty(str)) {
                        throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                    }
                    if (TextUtils.isEmpty(str2)) {
                        throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                    }
                    if (i10 == 0) {
                        throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                    }
                    customAction = new PlaybackStateCompat.CustomAction(str, str2, i10, null);
                }
                if (customAction != null) {
                    g0Var.a(customAction);
                    return;
                }
                return;
            case 1362116196:
                if (str.equals("com.google.android.gms.cast.framework.action.FORWARD")) {
                    if (this.f45503r == null && fVar != null) {
                        long j11 = fVar.f19321c;
                        r5.b bVar2 = i.f45507a;
                        int i15 = fVar.K;
                        if (j11 == 10000) {
                            i15 = fVar.L;
                        } else if (j11 == 30000) {
                            i15 = fVar.M;
                        }
                        int i16 = fVar.v;
                        if (j11 == 10000) {
                            i16 = fVar.f19327w;
                        } else if (j11 == 30000) {
                            i16 = fVar.f19328x;
                        }
                        String string4 = context.getResources().getString(i15);
                        if (TextUtils.isEmpty("com.google.android.gms.cast.framework.action.FORWARD")) {
                            throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                        }
                        if (TextUtils.isEmpty(string4)) {
                            throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                        }
                        if (i16 == 0) {
                            throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                        }
                        this.f45503r = new PlaybackStateCompat.CustomAction("com.google.android.gms.cast.framework.action.FORWARD", string4, i16, null);
                    }
                    customAction = this.f45503r;
                } else if (dVar != null) {
                    str2 = dVar.f19318c;
                    i10 = dVar.f19317b;
                    if (TextUtils.isEmpty(str)) {
                        throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                    }
                    if (TextUtils.isEmpty(str2)) {
                        throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                    }
                    if (i10 == 0) {
                        throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                    }
                    customAction = new PlaybackStateCompat.CustomAction(str, str2, i10, null);
                }
                if (customAction != null) {
                    g0Var.a(customAction);
                    return;
                }
                return;
            default:
                if (dVar != null) {
                    str2 = dVar.f19318c;
                    i10 = dVar.f19317b;
                    if (TextUtils.isEmpty(str)) {
                        throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                    }
                    if (TextUtils.isEmpty(str2)) {
                        throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                    }
                    if (i10 == 0) {
                        throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                    }
                    customAction = new PlaybackStateCompat.CustomAction(str, str2, i10, null);
                }
                if (customAction != null) {
                    g0Var.a(customAction);
                    return;
                }
                return;
        }
    }

    public final void g(boolean z10) {
        if (this.f45489b.h) {
            t0 t0Var = this.f45496k;
            mu0 mu0Var = this.f45497l;
            if (mu0Var != null) {
                t0Var.removeCallbacks(mu0Var);
            }
            Context context = this.f45488a;
            Intent intent = new Intent(context, (Class<?>) ReconnectionService.class);
            intent.setPackage(context.getPackageName());
            try {
                context.startService(intent);
            } catch (IllegalStateException unused) {
                if (z10) {
                    t0Var.postDelayed(mu0Var, 1000L);
                }
            }
        }
    }

    public final void h() {
        f fVar = this.f45495j;
        if (fVar != null) {
            v.b("Stopping media notification.", new Object[0]);
            af.h hVar = fVar.f45475i;
            hVar.D();
            hVar.f277e = null;
            NotificationManager notificationManager = fVar.f45470b;
            if (notificationManager != null) {
                notificationManager.cancel("castMediaNotification", 1);
            }
        }
    }

    public final void i() {
        if (this.f45489b.h) {
            this.f45496k.removeCallbacks(this.f45497l);
            Context context = this.f45488a;
            Intent intent = new Intent(context, (Class<?>) ReconnectionService.class);
            intent.setPackage(context.getPackageName());
            context.stopService(intent);
        }
    }

    public final void j(int i10, MediaInfo mediaInfo) {
        PlaybackStateCompat playbackStateCompatB;
        android.support.v4.media.session.d0 d0Var;
        m5.l lVar;
        Bitmap bitmap;
        PendingIntent activity;
        android.support.v4.media.session.d0 d0Var2 = this.f45501p;
        if (d0Var2 == null) {
            return;
        }
        w wVar = d0Var2.f818a;
        Bundle bundle = new Bundle();
        g0 g0Var = new g0();
        o5.h hVar = this.f45499n;
        o5.f fVar = this.f45491e;
        if (hVar == null || this.f45495j == null) {
            playbackStateCompatB = g0Var.b();
        } else {
            g0Var.c(i10, (hVar.s() == 0 || hVar.j()) ? 0L : hVar.a(), 1.0f);
            if (i10 == 0) {
                playbackStateCompatB = g0Var.b();
            } else {
                o oVar = fVar != null ? fVar.R : null;
                o5.h hVar2 = this.f45499n;
                long jC = (hVar2 == null || hVar2.j() || this.f45499n.n()) ? 0L : 256L;
                if (oVar != null) {
                    ArrayList arrayListA = i.a(oVar);
                    if (arrayListA != null) {
                        int size = arrayListA.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayListA.get(i11);
                            i11++;
                            ArrayList arrayList = arrayListA;
                            o5.d dVar = (o5.d) obj;
                            int i12 = size;
                            String str = dVar.f19316a;
                            if (TextUtils.equals(str, "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK") || TextUtils.equals(str, "com.google.android.gms.cast.framework.action.SKIP_PREV") || TextUtils.equals(str, "com.google.android.gms.cast.framework.action.SKIP_NEXT")) {
                                jC = c(str, i10, bundle) | jC;
                            } else {
                                f(g0Var, str, dVar);
                            }
                            size = i12;
                            arrayListA = arrayList;
                        }
                    }
                } else if (fVar != null) {
                    ArrayList arrayList2 = fVar.f19319a;
                    int size2 = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        Object obj2 = arrayList2.get(i13);
                        i13++;
                        ArrayList arrayList3 = arrayList2;
                        String str2 = (String) obj2;
                        if (TextUtils.equals(str2, "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK") || TextUtils.equals(str2, "com.google.android.gms.cast.framework.action.SKIP_PREV") || TextUtils.equals(str2, "com.google.android.gms.cast.framework.action.SKIP_NEXT")) {
                            jC = c(str2, i10, bundle) | jC;
                        } else {
                            f(g0Var, str2, null);
                        }
                        size2 = size2;
                        arrayList2 = arrayList3;
                    }
                }
                g0Var.f829e = jC;
                playbackStateCompatB = g0Var.b();
            }
        }
        d0Var2.f(playbackStateCompatB);
        if (fVar != null && fVar.S) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
        }
        if (fVar != null && fVar.T) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        }
        if (bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS") || bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT")) {
            wVar.f843a.setExtras(bundle);
        }
        if (i10 == 0) {
            d0Var2.e(new MediaMetadataCompat(new Bundle()));
            return;
        }
        if (this.f45499n != null) {
            ComponentName componentName = this.f45492f;
            if (componentName == null) {
                activity = null;
            } else {
                Intent intent = new Intent();
                intent.setComponent(componentName);
                activity = PendingIntent.getActivity(this.f45488a, 0, intent, y.f3714a | 134217728);
            }
            if (activity != null) {
                wVar.f843a.setSessionActivity(activity);
            }
        }
        o5.h hVar3 = this.f45499n;
        if (hVar3 == null || (d0Var = this.f45501p) == null || mediaInfo == null || (lVar = mediaInfo.d) == null) {
            return;
        }
        Bundle bundle2 = lVar.f17808b;
        long j10 = hVar3.j() ? 0L : mediaInfo.f3146e;
        m5.l.c(1, "com.google.android.gms.cast.metadata.TITLE");
        String string = bundle2.getString("com.google.android.gms.cast.metadata.TITLE");
        m5.l.c(1, "com.google.android.gms.cast.metadata.SUBTITLE");
        String string2 = bundle2.getString("com.google.android.gms.cast.metadata.SUBTITLE");
        android.support.v4.media.session.d0 d0Var3 = this.f45501p;
        MediaMetadataCompat mediaMetadataCompatA = d0Var3 == null ? null : d0Var3.f819b.a();
        android.support.v4.media.c cVar = mediaMetadataCompatA == null ? new android.support.v4.media.c() : new android.support.v4.media.c(mediaMetadataCompatA);
        cVar.d(j10, "android.media.metadata.DURATION");
        if (string != null) {
            cVar.e("android.media.metadata.TITLE", string);
            cVar.e("android.media.metadata.DISPLAY_TITLE", string);
        }
        if (string2 != null) {
            cVar.e("android.media.metadata.DISPLAY_SUBTITLE", string2);
        }
        d0Var.e(cVar.a());
        Uri uriD = d(lVar);
        if (uriD != null) {
            this.h.C(uriD);
            bitmap = null;
        } else {
            bitmap = null;
            e(null, 0);
        }
        Uri uriD2 = d(lVar);
        if (uriD2 != null) {
            this.f45494i.C(uriD2);
        } else {
            e(bitmap, 3);
        }
    }
}
