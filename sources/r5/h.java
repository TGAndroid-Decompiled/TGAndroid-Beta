package r5;

import a5.j;
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
import android.support.v4.media.session.d0;
import android.support.v4.media.session.g0;
import android.support.v4.media.session.w;
import android.text.TextUtils;
import android.util.Log;
import c2.v0;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.ReconnectionService;
import com.google.android.gms.internal.cast.q;
import com.google.android.gms.internal.cast.z;
import java.util.ArrayList;
import java.util.List;
import nh.d6;
import org.telegram.ui.Components.n;
import org.telegram.ui.Components.rk0;
import p5.c0;
import q5.o;
import z5.l;
public final class h {
    public static final s5.b v = new s5.b("MediaSessionManager", null);
    public final Context f47063a;
    public final p5.b f47064b;
    public final q f47065c;
    public final p5.g d;
    public final q5.f f47066e;
    public final ComponentName f47067f;
    public final ComponentName f47068g;
    public final j h;
    public final j f47069i;
    public final f f47070j;
    public final v0 f47071k;
    public final rk0 f47072l;
    public final c0 f47073m;
    public q5.h f47074n;
    public CastDevice f47075o;
    public d0 f47076p;
    public boolean f47077q;
    public PlaybackStateCompat.CustomAction f47078r;
    public PlaybackStateCompat.CustomAction f47079s;
    public PlaybackStateCompat.CustomAction f47080t;
    public PlaybackStateCompat.CustomAction f47081u;

    public h(Context context, p5.b bVar, q qVar) {
        p5.g gVar;
        q5.f fVar;
        String str;
        ComponentName componentName;
        String str2;
        ComponentName componentName2;
        q5.f fVar2;
        int size;
        this.f47063a = context;
        this.f47064b = bVar;
        this.f47065c = qVar;
        s5.b bVar2 = p5.a.f45598l;
        l.e("Must be called from the main thread.");
        p5.a aVar = p5.a.f45600n;
        f fVar3 = null;
        if (aVar != null) {
            gVar = aVar.b();
        } else {
            gVar = null;
        }
        this.d = gVar;
        q5.a aVar2 = bVar.f45615f;
        if (aVar2 == null) {
            fVar = null;
        } else {
            fVar = aVar2.d;
        }
        this.f47066e = fVar;
        this.f47073m = new c0(this, 2);
        if (aVar2 == null) {
            str = null;
        } else {
            str = aVar2.f46358b;
        }
        if (!TextUtils.isEmpty(str)) {
            componentName = new ComponentName(context, str);
        } else {
            componentName = null;
        }
        this.f47067f = componentName;
        if (aVar2 == null) {
            str2 = null;
        } else {
            str2 = aVar2.f46357a;
        }
        if (!TextUtils.isEmpty(str2)) {
            componentName2 = new ComponentName(context, str2);
        } else {
            componentName2 = null;
        }
        this.f47068g = componentName2;
        j jVar = new j(context);
        this.h = jVar;
        jVar.f214e = new n(this, 13);
        j jVar2 = new j(context);
        this.f47069i = jVar2;
        jVar2.f214e = new d6(this, 20);
        this.f47071k = new v0(Looper.getMainLooper(), 1);
        s5.b bVar3 = f.f47043u;
        q5.a aVar3 = bVar.f45615f;
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
                        Log.e(bVar3.f47580a, bVar3.d(q5.e.class.getSimpleName().concat(" provides more than 5 actions."), new Object[0]));
                    } else if (b10 != null && (r1 = b10.length) != 0) {
                        for (int i10 : b10) {
                            if (i10 < 0 || i10 >= size) {
                                Log.e(bVar3.f47580a, bVar3.d(q5.e.class.getSimpleName().concat("provides a compact view action whose index is out of bounds."), new Object[0]));
                                break;
                            }
                        }
                    } else {
                        Log.e(bVar3.f47580a, bVar3.d(q5.e.class.getSimpleName().concat(" doesn't provide any actions for compact view."), new Object[0]));
                    }
                } else {
                    Log.e(bVar3.f47580a, bVar3.d(q5.e.class.getSimpleName().concat(" doesn't provide any action."), new Object[0]));
                }
            }
            fVar3 = new f(context);
        }
        this.f47070j = fVar3;
        this.f47072l = new rk0(this, 8);
    }

    public final void a(q5.h hVar, CastDevice castDevice) {
        q5.a aVar;
        ComponentName componentName;
        p5.b bVar = this.f47064b;
        if (bVar == null) {
            aVar = null;
        } else {
            aVar = bVar.f45615f;
        }
        if (!this.f47077q && bVar != null && aVar != null && this.f47066e != null && hVar != null && castDevice != null && (componentName = this.f47068g) != null) {
            this.f47074n = hVar;
            hVar.p(this.f47073m);
            this.f47075o = castDevice;
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setComponent(componentName);
            int i10 = z.f4330a;
            Context context = this.f47063a;
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, i10);
            if (aVar.f46361f) {
                d0 d0Var = new d0(context, "CastMediaSession", componentName, broadcast);
                this.f47076p = d0Var;
                j(0, null);
                CastDevice castDevice2 = this.f47075o;
                if (castDevice2 != null && !TextUtils.isEmpty(castDevice2.d)) {
                    Bundle bundle = new Bundle();
                    String string = context.getResources().getString(2131701275, this.f47075o.d);
                    a0.f fVar = MediaMetadataCompat.d;
                    if (fVar.containsKey("android.media.metadata.ALBUM_ARTIST") && ((Integer) fVar.get("android.media.metadata.ALBUM_ARTIST")).intValue() != 1) {
                        throw new IllegalArgumentException("The android.media.metadata.ALBUM_ARTIST key cannot be used to put a String");
                    }
                    bundle.putCharSequence("android.media.metadata.ALBUM_ARTIST", string);
                    d0Var.e(new MediaMetadataCompat(bundle));
                }
                d0Var.d(new g(this), null);
                d0Var.c(true);
                this.f47065c.J0(d0Var);
            }
            this.f47077q = true;
            b();
            return;
        }
        v.b("skip attaching media session", new Object[0]);
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: r5.h.b():void");
    }

    public final long c(String str, int i10, Bundle bundle) {
        long j10;
        int hashCode = str.hashCode();
        if (hashCode != -945151566) {
            if (hashCode != -945080078) {
                if (hashCode == 235550565 && str.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK")) {
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
                q5.h hVar = this.f47074n;
                if (hVar != null && hVar.h()) {
                    o5.q e10 = hVar.e();
                    l.h(e10);
                    if ((128 & e10.f19317n) == 0 && e10.B == 0) {
                        Integer num = (Integer) e10.J.get(e10.f19314c);
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
            q5.h hVar2 = this.f47074n;
            if (hVar2 != null && hVar2.h()) {
                o5.q e11 = hVar2.e();
                l.h(e11);
                if ((64 & e11.f19317n) == 0 && e11.B == 0) {
                    Integer num2 = (Integer) e11.J.get(e11.f19314c);
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

    public final Uri d(o5.l lVar) {
        y5.a aVar;
        q5.a aVar2 = this.f47064b.f45615f;
        if (aVar2 != null) {
            aVar2.b();
        }
        List list = lVar.f19289a;
        if (list != null && !list.isEmpty()) {
            aVar = (y5.a) lVar.f19289a.get(0);
        } else {
            aVar = null;
        }
        if (aVar == null) {
            return null;
        }
        return aVar.f50494b;
    }

    public final void e(Bitmap bitmap, int i10) {
        MediaMetadataCompat a2;
        za.c cVar;
        String str;
        d0 d0Var = this.f47076p;
        if (d0Var == null) {
            return;
        }
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            bitmap.eraseColor(0);
        }
        d0 d0Var2 = this.f47076p;
        if (d0Var2 == null) {
            a2 = null;
        } else {
            a2 = d0Var2.f806b.a();
        }
        if (a2 == null) {
            cVar = new za.c(1);
        } else {
            cVar = new za.c(a2);
        }
        if (i10 == 0) {
            str = "android.media.metadata.DISPLAY_ICON";
        } else {
            str = "android.media.metadata.ALBUM_ART";
        }
        cVar.D(str, bitmap);
        d0Var.e(cVar.h());
    }

    public final void f(android.support.v4.media.session.g0 r13, java.lang.String r14, q5.d r15) {
        throw new UnsupportedOperationException("Method not decompiled: r5.h.f(android.support.v4.media.session.g0, java.lang.String, q5.d):void");
    }

    public final void g(boolean z10) {
        if (this.f47064b.h) {
            v0 v0Var = this.f47071k;
            rk0 rk0Var = this.f47072l;
            if (rk0Var != null) {
                v0Var.removeCallbacks(rk0Var);
            }
            Context context = this.f47063a;
            Intent intent = new Intent(context, ReconnectionService.class);
            intent.setPackage(context.getPackageName());
            try {
                context.startService(intent);
            } catch (IllegalStateException unused) {
                if (z10) {
                    v0Var.postDelayed(rk0Var, 1000L);
                }
            }
        }
    }

    public final void h() {
        f fVar = this.f47070j;
        if (fVar != null) {
            v.b("Stopping media notification.", new Object[0]);
            j jVar = fVar.f47050i;
            jVar.x();
            jVar.f214e = null;
            NotificationManager notificationManager = fVar.f47045b;
            if (notificationManager != null) {
                notificationManager.cancel("castMediaNotification", 1);
            }
        }
    }

    public final void i() {
        if (!this.f47064b.h) {
            return;
        }
        this.f47071k.removeCallbacks(this.f47072l);
        Context context = this.f47063a;
        Intent intent = new Intent(context, ReconnectionService.class);
        intent.setPackage(context.getPackageName());
        context.stopService(intent);
    }

    public final void j(int i10, MediaInfo mediaInfo) {
        PlaybackStateCompat b10;
        d0 d0Var;
        o5.l lVar;
        long j10;
        MediaMetadataCompat a2;
        za.c cVar;
        Bitmap bitmap;
        PendingIntent activity;
        long j11;
        o oVar;
        long j12;
        int i11;
        d0 d0Var2 = this.f47076p;
        if (d0Var2 != null) {
            w wVar = d0Var2.f805a;
            Bundle bundle = new Bundle();
            g0 g0Var = new g0();
            q5.h hVar = this.f47074n;
            q5.f fVar = this.f47066e;
            if (hVar != null && this.f47070j != null) {
                if (hVar.s() == 0 || hVar.j()) {
                    j11 = 0;
                } else {
                    j11 = hVar.a();
                }
                g0Var.c(i10, j11, 1.0f);
                if (i10 == 0) {
                    b10 = g0Var.b();
                } else {
                    if (fVar != null) {
                        oVar = fVar.R;
                    } else {
                        oVar = null;
                    }
                    q5.h hVar2 = this.f47074n;
                    if (hVar2 == null || hVar2.j() || this.f47074n.n()) {
                        j12 = 0;
                    } else {
                        j12 = 256;
                    }
                    if (oVar != null) {
                        ArrayList a10 = i.a(oVar);
                        if (a10 != null) {
                            int size = a10.size();
                            int i12 = 0;
                            while (i12 < size) {
                                Object obj = a10.get(i12);
                                i12++;
                                ArrayList arrayList = a10;
                                q5.d dVar = (q5.d) obj;
                                int i13 = size;
                                String str = dVar.f46376a;
                                if (!TextUtils.equals(str, "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK") && !TextUtils.equals(str, "com.google.android.gms.cast.framework.action.SKIP_PREV") && !TextUtils.equals(str, "com.google.android.gms.cast.framework.action.SKIP_NEXT")) {
                                    f(g0Var, str, dVar);
                                } else {
                                    j12 = c(str, i10, bundle) | j12;
                                }
                                size = i13;
                                a10 = arrayList;
                            }
                        }
                    } else if (fVar != null) {
                        ArrayList arrayList2 = fVar.f46379a;
                        int size2 = arrayList2.size();
                        int i14 = 0;
                        while (i14 < size2) {
                            Object obj2 = arrayList2.get(i14);
                            i14++;
                            ArrayList arrayList3 = arrayList2;
                            String str2 = (String) obj2;
                            if (TextUtils.equals(str2, "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK") || TextUtils.equals(str2, "com.google.android.gms.cast.framework.action.SKIP_PREV") || TextUtils.equals(str2, "com.google.android.gms.cast.framework.action.SKIP_NEXT")) {
                                i11 = size2;
                                j12 = c(str2, i10, bundle) | j12;
                            } else {
                                i11 = size2;
                                f(g0Var, str2, null);
                            }
                            size2 = i11;
                            arrayList2 = arrayList3;
                        }
                    }
                    g0Var.f816e = j12;
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
                wVar.f830a.setExtras(bundle);
            }
            if (i10 != 0) {
                if (this.f47074n != null) {
                    ComponentName componentName = this.f47067f;
                    if (componentName == null) {
                        activity = null;
                    } else {
                        Intent intent = new Intent();
                        intent.setComponent(componentName);
                        activity = PendingIntent.getActivity(this.f47063a, 0, intent, z.f4330a | 134217728);
                    }
                    if (activity != null) {
                        wVar.f830a.setSessionActivity(activity);
                    }
                }
                q5.h hVar3 = this.f47074n;
                if (hVar3 != null && (d0Var = this.f47076p) != null && mediaInfo != null && (lVar = mediaInfo.d) != null) {
                    Bundle bundle2 = lVar.f19290b;
                    if (hVar3.j()) {
                        j10 = 0;
                    } else {
                        j10 = mediaInfo.f3723e;
                    }
                    o5.l.c(1, "com.google.android.gms.cast.metadata.TITLE");
                    String string = bundle2.getString("com.google.android.gms.cast.metadata.TITLE");
                    o5.l.c(1, "com.google.android.gms.cast.metadata.SUBTITLE");
                    String string2 = bundle2.getString("com.google.android.gms.cast.metadata.SUBTITLE");
                    d0 d0Var3 = this.f47076p;
                    if (d0Var3 == null) {
                        a2 = null;
                    } else {
                        a2 = d0Var3.f806b.a();
                    }
                    if (a2 == null) {
                        cVar = new za.c(1);
                    } else {
                        cVar = new za.c(a2);
                    }
                    cVar.E(j10, "android.media.metadata.DURATION");
                    if (string != null) {
                        cVar.F("android.media.metadata.TITLE", string);
                        cVar.F("android.media.metadata.DISPLAY_TITLE", string);
                    }
                    if (string2 != null) {
                        cVar.F("android.media.metadata.DISPLAY_SUBTITLE", string2);
                    }
                    d0Var.e(cVar.h());
                    Uri d = d(lVar);
                    if (d != null) {
                        this.h.u(d);
                        bitmap = null;
                    } else {
                        bitmap = null;
                        e(null, 0);
                    }
                    Uri d10 = d(lVar);
                    if (d10 != null) {
                        this.f47069i.u(d10);
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
