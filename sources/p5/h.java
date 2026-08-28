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
import c2.u0;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.ReconnectionService;
import com.google.android.gms.internal.cast.q;
import com.google.android.gms.internal.cast.z;
import java.util.ArrayList;
import java.util.List;
import m5.c0;
import n5.d0;
import n5.e0;
import o5.o;
import org.telegram.ui.Components.ju0;
import x5.l;
public final class h {
    public static final q5.b v = new q5.b("MediaSessionManager", null);
    public final Context f45482a;
    public final n5.b f45483b;
    public final q f45484c;
    public final n5.g d;
    public final o5.f f45485e;
    public final ComponentName f45486f;
    public final ComponentName f45487g;
    public final b3.b h;
    public final b3.b f45488i;
    public final f f45489j;
    public final u0 f45490k;
    public final ju0 f45491l;
    public final d0 f45492m;
    public o5.h f45493n;
    public CastDevice f45494o;
    public android.support.v4.media.session.d0 f45495p;
    public boolean f45496q;
    public PlaybackStateCompat.CustomAction f45497r;
    public PlaybackStateCompat.CustomAction f45498s;
    public PlaybackStateCompat.CustomAction f45499t;
    public PlaybackStateCompat.CustomAction f45500u;

    public h(Context context, n5.b bVar, q qVar) {
        n5.g gVar;
        o5.f fVar;
        String str;
        ComponentName componentName;
        String str2;
        ComponentName componentName2;
        o5.f fVar2;
        int size;
        this.f45482a = context;
        this.f45483b = bVar;
        this.f45484c = qVar;
        q5.b bVar2 = n5.a.f18449l;
        l.e("Must be called from the main thread.");
        n5.a aVar = n5.a.f18451n;
        f fVar3 = null;
        if (aVar != null) {
            gVar = aVar.b();
        } else {
            gVar = null;
        }
        this.d = gVar;
        o5.a aVar2 = bVar.f18467f;
        if (aVar2 == null) {
            fVar = null;
        } else {
            fVar = aVar2.d;
        }
        this.f45485e = fVar;
        this.f45492m = new d0(this, 2);
        if (aVar2 == null) {
            str = null;
        } else {
            str = aVar2.f18951b;
        }
        if (!TextUtils.isEmpty(str)) {
            componentName = new ComponentName(context, str);
        } else {
            componentName = null;
        }
        this.f45486f = componentName;
        if (aVar2 == null) {
            str2 = null;
        } else {
            str2 = aVar2.f18950a;
        }
        if (!TextUtils.isEmpty(str2)) {
            componentName2 = new ComponentName(context, str2);
        } else {
            componentName2 = null;
        }
        this.f45487g = componentName2;
        b3.b bVar3 = new b3.b(context);
        this.h = bVar3;
        bVar3.f1416e = new c0(this, 18);
        b3.b bVar4 = new b3.b(context);
        this.f45488i = bVar4;
        bVar4.f1416e = new e0(this, 13);
        this.f45490k = new u0(Looper.getMainLooper(), 1);
        q5.b bVar5 = f.f45462u;
        o5.a aVar3 = bVar.f18467f;
        if (aVar3 != null && (fVar2 = aVar3.d) != null) {
            o oVar = fVar2.R;
            if (oVar != null) {
                ArrayList a2 = i.a(oVar);
                int[] b10 = i.b(oVar);
                if (a2 == null) {
                    size = 0;
                } else {
                    size = a2.size();
                }
                if (a2 != null && !a2.isEmpty()) {
                    if (a2.size() > 5) {
                        Log.e(bVar5.f46009a, bVar5.d(o5.e.class.getSimpleName().concat(" provides more than 5 actions."), new Object[0]));
                    } else if (b10 != null && (r1 = b10.length) != 0) {
                        for (int i9 : b10) {
                            if (i9 < 0 || i9 >= size) {
                                Log.e(bVar5.f46009a, bVar5.d(o5.e.class.getSimpleName().concat("provides a compact view action whose index is out of bounds."), new Object[0]));
                                break;
                            }
                        }
                    } else {
                        Log.e(bVar5.f46009a, bVar5.d(o5.e.class.getSimpleName().concat(" doesn't provide any actions for compact view."), new Object[0]));
                    }
                } else {
                    Log.e(bVar5.f46009a, bVar5.d(o5.e.class.getSimpleName().concat(" doesn't provide any action."), new Object[0]));
                }
            }
            fVar3 = new f(context);
        }
        this.f45489j = fVar3;
        this.f45491l = new ju0(this, 4);
    }

    public final void a(o5.h hVar, CastDevice castDevice) {
        o5.a aVar;
        ComponentName componentName;
        n5.b bVar = this.f45483b;
        if (bVar == null) {
            aVar = null;
        } else {
            aVar = bVar.f18467f;
        }
        if (!this.f45496q && bVar != null && aVar != null && this.f45485e != null && hVar != null && castDevice != null && (componentName = this.f45487g) != null) {
            this.f45493n = hVar;
            hVar.p(this.f45492m);
            this.f45494o = castDevice;
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setComponent(componentName);
            int i9 = z.f3290a;
            Context context = this.f45482a;
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, i9);
            if (aVar.f18954f) {
                android.support.v4.media.session.d0 d0Var = new android.support.v4.media.session.d0(context, "CastMediaSession", componentName, broadcast);
                this.f45495p = d0Var;
                j(0, null);
                CastDevice castDevice2 = this.f45494o;
                if (castDevice2 != null && !TextUtils.isEmpty(castDevice2.d)) {
                    Bundle bundle = new Bundle();
                    String string = context.getResources().getString(2131701273, this.f45494o.d);
                    a0.f fVar = MediaMetadataCompat.d;
                    if (fVar.containsKey("android.media.metadata.ALBUM_ARTIST") && ((Integer) fVar.get("android.media.metadata.ALBUM_ARTIST")).intValue() != 1) {
                        throw new IllegalArgumentException("The android.media.metadata.ALBUM_ARTIST key cannot be used to put a String");
                    }
                    bundle.putCharSequence("android.media.metadata.ALBUM_ARTIST", string);
                    d0Var.e(new MediaMetadataCompat(bundle));
                }
                d0Var.d(new g(this), null);
                d0Var.c(true);
                this.f45484c.J0(d0Var);
            }
            this.f45496q = true;
            b();
            return;
        }
        v.b("skip attaching media session", new Object[0]);
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: p5.h.b():void");
    }

    public final long c(String str, int i9, Bundle bundle) {
        long j10;
        int hashCode = str.hashCode();
        if (hashCode != -945151566) {
            if (hashCode != -945080078) {
                if (hashCode == 235550565 && str.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK")) {
                    if (i9 == 3) {
                        j10 = 514;
                        i9 = 3;
                    } else {
                        j10 = 512;
                    }
                    if (i9 != 2) {
                        return j10;
                    }
                    return 516L;
                }
            } else if (str.equals("com.google.android.gms.cast.framework.action.SKIP_PREV")) {
                o5.h hVar = this.f45493n;
                if (hVar != null && hVar.h()) {
                    m5.q e10 = hVar.e();
                    l.h(e10);
                    if ((128 & e10.f17458n) == 0 && e10.B == 0) {
                        Integer num = (Integer) e10.J.get(e10.f17455c);
                        if (num != null && num.intValue() > 0) {
                            return 16L;
                        }
                    } else {
                        return 16L;
                    }
                }
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
                return 0L;
            }
        } else if (str.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT")) {
            o5.h hVar2 = this.f45493n;
            if (hVar2 != null && hVar2.h()) {
                m5.q e11 = hVar2.e();
                l.h(e11);
                if ((64 & e11.f17458n) == 0 && e11.B == 0) {
                    Integer num2 = (Integer) e11.J.get(e11.f17455c);
                    if (num2 != null && num2.intValue() < e11.C.size() - 1) {
                        return 32L;
                    }
                } else {
                    return 32L;
                }
            }
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        }
        return 0L;
    }

    public final Uri d(m5.l lVar) {
        w5.a aVar;
        o5.a aVar2 = this.f45483b.f18467f;
        if (aVar2 != null) {
            aVar2.b();
        }
        List list = lVar.f17430a;
        if (list != null && !list.isEmpty()) {
            aVar = (w5.a) lVar.f17430a.get(0);
        } else {
            aVar = null;
        }
        if (aVar == null) {
            return null;
        }
        return aVar.f48764b;
    }

    public final void e(Bitmap bitmap, int i9) {
        MediaMetadataCompat a2;
        android.support.v4.media.c cVar;
        String str;
        android.support.v4.media.session.d0 d0Var = this.f45495p;
        if (d0Var == null) {
            return;
        }
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            bitmap.eraseColor(0);
        }
        android.support.v4.media.session.d0 d0Var2 = this.f45495p;
        if (d0Var2 == null) {
            a2 = null;
        } else {
            a2 = d0Var2.f311b.a();
        }
        if (a2 == null) {
            cVar = new android.support.v4.media.c(0);
        } else {
            cVar = new android.support.v4.media.c(a2);
        }
        if (i9 == 0) {
            str = "android.media.metadata.DISPLAY_ICON";
        } else {
            str = "android.media.metadata.ALBUM_ART";
        }
        cVar.N(str, bitmap);
        d0Var.e(cVar.B());
    }

    public final void f(android.support.v4.media.session.g0 r13, java.lang.String r14, o5.d r15) {
        throw new UnsupportedOperationException("Method not decompiled: p5.h.f(android.support.v4.media.session.g0, java.lang.String, o5.d):void");
    }

    public final void g(boolean z10) {
        if (this.f45483b.h) {
            u0 u0Var = this.f45490k;
            ju0 ju0Var = this.f45491l;
            if (ju0Var != null) {
                u0Var.removeCallbacks(ju0Var);
            }
            Context context = this.f45482a;
            Intent intent = new Intent(context, ReconnectionService.class);
            intent.setPackage(context.getPackageName());
            try {
                context.startService(intent);
            } catch (IllegalStateException unused) {
                if (z10) {
                    u0Var.postDelayed(ju0Var, 1000L);
                }
            }
        }
    }

    public final void h() {
        f fVar = this.f45489j;
        if (fVar != null) {
            v.b("Stopping media notification.", new Object[0]);
            b3.b bVar = fVar.f45469i;
            bVar.C();
            bVar.f1416e = null;
            NotificationManager notificationManager = fVar.f45464b;
            if (notificationManager != null) {
                notificationManager.cancel("castMediaNotification", 1);
            }
        }
    }

    public final void i() {
        if (!this.f45483b.h) {
            return;
        }
        this.f45490k.removeCallbacks(this.f45491l);
        Context context = this.f45482a;
        Intent intent = new Intent(context, ReconnectionService.class);
        intent.setPackage(context.getPackageName());
        context.stopService(intent);
    }

    public final void j(int i9, MediaInfo mediaInfo) {
        PlaybackStateCompat b10;
        android.support.v4.media.session.d0 d0Var;
        m5.l lVar;
        long j10;
        MediaMetadataCompat a2;
        android.support.v4.media.c cVar;
        Bitmap bitmap;
        PendingIntent activity;
        long j11;
        o oVar;
        long j12;
        int i10;
        android.support.v4.media.session.d0 d0Var2 = this.f45495p;
        if (d0Var2 != null) {
            w wVar = d0Var2.f310a;
            Bundle bundle = new Bundle();
            g0 g0Var = new g0();
            o5.h hVar = this.f45493n;
            o5.f fVar = this.f45485e;
            if (hVar != null && this.f45489j != null) {
                if (hVar.s() == 0 || hVar.j()) {
                    j11 = 0;
                } else {
                    j11 = hVar.a();
                }
                g0Var.c(i9, j11, 1.0f);
                if (i9 == 0) {
                    b10 = g0Var.b();
                } else {
                    if (fVar != null) {
                        oVar = fVar.R;
                    } else {
                        oVar = null;
                    }
                    o5.h hVar2 = this.f45493n;
                    if (hVar2 == null || hVar2.j() || this.f45493n.n()) {
                        j12 = 0;
                    } else {
                        j12 = 256;
                    }
                    if (oVar != null) {
                        ArrayList a3 = i.a(oVar);
                        if (a3 != null) {
                            int size = a3.size();
                            int i11 = 0;
                            while (i11 < size) {
                                Object obj = a3.get(i11);
                                i11++;
                                ArrayList arrayList = a3;
                                o5.d dVar = (o5.d) obj;
                                int i12 = size;
                                String str = dVar.f18969a;
                                if (!TextUtils.equals(str, "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK") && !TextUtils.equals(str, "com.google.android.gms.cast.framework.action.SKIP_PREV") && !TextUtils.equals(str, "com.google.android.gms.cast.framework.action.SKIP_NEXT")) {
                                    f(g0Var, str, dVar);
                                } else {
                                    j12 = c(str, i9, bundle) | j12;
                                }
                                size = i12;
                                a3 = arrayList;
                            }
                        }
                    } else if (fVar != null) {
                        ArrayList arrayList2 = fVar.f18972a;
                        int size2 = arrayList2.size();
                        int i13 = 0;
                        while (i13 < size2) {
                            Object obj2 = arrayList2.get(i13);
                            i13++;
                            ArrayList arrayList3 = arrayList2;
                            String str2 = (String) obj2;
                            if (TextUtils.equals(str2, "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK") || TextUtils.equals(str2, "com.google.android.gms.cast.framework.action.SKIP_PREV") || TextUtils.equals(str2, "com.google.android.gms.cast.framework.action.SKIP_NEXT")) {
                                i10 = size2;
                                j12 = c(str2, i9, bundle) | j12;
                            } else {
                                i10 = size2;
                                f(g0Var, str2, null);
                            }
                            size2 = i10;
                            arrayList2 = arrayList3;
                        }
                    }
                    g0Var.f321e = j12;
                    b10 = g0Var.b();
                }
            } else {
                b10 = g0Var.b();
            }
            d0Var2.f(b10);
            if (fVar != null && fVar.S) {
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
            }
            if (fVar != null && fVar.T) {
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
            }
            if (bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS") || bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT")) {
                wVar.f335a.setExtras(bundle);
            }
            if (i9 != 0) {
                if (this.f45493n != null) {
                    ComponentName componentName = this.f45486f;
                    if (componentName == null) {
                        activity = null;
                    } else {
                        Intent intent = new Intent();
                        intent.setComponent(componentName);
                        activity = PendingIntent.getActivity(this.f45482a, 0, intent, z.f3290a | 134217728);
                    }
                    if (activity != null) {
                        wVar.f335a.setSessionActivity(activity);
                    }
                }
                o5.h hVar3 = this.f45493n;
                if (hVar3 != null && (d0Var = this.f45495p) != null && mediaInfo != null && (lVar = mediaInfo.d) != null) {
                    Bundle bundle2 = lVar.f17431b;
                    if (hVar3.j()) {
                        j10 = 0;
                    } else {
                        j10 = mediaInfo.f2709e;
                    }
                    m5.l.c(1, "com.google.android.gms.cast.metadata.TITLE");
                    String string = bundle2.getString("com.google.android.gms.cast.metadata.TITLE");
                    m5.l.c(1, "com.google.android.gms.cast.metadata.SUBTITLE");
                    String string2 = bundle2.getString("com.google.android.gms.cast.metadata.SUBTITLE");
                    android.support.v4.media.session.d0 d0Var3 = this.f45495p;
                    if (d0Var3 == null) {
                        a2 = null;
                    } else {
                        a2 = d0Var3.f311b.a();
                    }
                    if (a2 == null) {
                        cVar = new android.support.v4.media.c(0);
                    } else {
                        cVar = new android.support.v4.media.c(a2);
                    }
                    cVar.O(j10, "android.media.metadata.DURATION");
                    if (string != null) {
                        cVar.P("android.media.metadata.TITLE", string);
                        cVar.P("android.media.metadata.DISPLAY_TITLE", string);
                    }
                    if (string2 != null) {
                        cVar.P("android.media.metadata.DISPLAY_SUBTITLE", string2);
                    }
                    d0Var.e(cVar.B());
                    Uri d = d(lVar);
                    if (d != null) {
                        this.h.A(d);
                        bitmap = null;
                    } else {
                        bitmap = null;
                        e(null, 0);
                    }
                    Uri d9 = d(lVar);
                    if (d9 != null) {
                        this.f45488i.A(d9);
                        return;
                    } else {
                        e(bitmap, 3);
                        return;
                    }
                }
                return;
            }
            d0Var2.e(new MediaMetadataCompat(new Bundle()));
        }
    }
}
