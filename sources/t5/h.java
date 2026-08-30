package t5;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.c0;
import android.support.v4.media.session.f0;
import android.support.v4.media.session.v;
import android.text.TextUtils;
import android.util.Log;
import b6.m;
import c5.j;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.ReconnectionService;
import com.google.android.gms.internal.cast.p;
import com.google.android.gms.internal.cast.y;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.tl0;
import q5.l;
import q5.q;
import r5.d0;
public final class h {
    public static final u5.b v = new u5.b("MediaSessionManager", null);
    public final Context f44596a;
    public final r5.b f44597b;
    public final p f44598c;
    public final r5.g d;
    public final s5.f e;
    public final ComponentName f44599f;
    public final ComponentName f44600g;
    public final j h;
    public final j f44601i;
    public final f f44602j;
    public final a7.e f44603k;
    public final tl0 f44604l;
    public final d0 f44605m;
    public s5.h f44606n;
    public CastDevice f44607o;
    public c0 f44608p;
    public boolean f44609q;
    public PlaybackStateCompat.CustomAction f44610r;
    public PlaybackStateCompat.CustomAction f44611s;
    public PlaybackStateCompat.CustomAction f44612t;
    public PlaybackStateCompat.CustomAction f44613u;

    public h(Context context, r5.b bVar, p pVar) {
        r5.g gVar;
        s5.f fVar;
        String str;
        ComponentName componentName;
        String str2;
        ComponentName componentName2;
        s5.f fVar2;
        int size;
        this.f44596a = context;
        this.f44597b = bVar;
        this.f44598c = pVar;
        u5.b bVar2 = r5.a.f43331l;
        m.e("Must be called from the main thread.");
        r5.a aVar = r5.a.f43333n;
        f fVar3 = null;
        if (aVar != null) {
            gVar = aVar.b();
        } else {
            gVar = null;
        }
        this.d = gVar;
        s5.a aVar2 = bVar.f43346f;
        if (aVar2 == null) {
            fVar = null;
        } else {
            fVar = aVar2.d;
        }
        this.e = fVar;
        this.f44605m = new d0(this, 2);
        if (aVar2 == null) {
            str = null;
        } else {
            str = aVar2.f44042b;
        }
        if (!TextUtils.isEmpty(str)) {
            componentName = new ComponentName(context, str);
        } else {
            componentName = null;
        }
        this.f44599f = componentName;
        if (aVar2 == null) {
            str2 = null;
        } else {
            str2 = aVar2.f44041a;
        }
        if (!TextUtils.isEmpty(str2)) {
            componentName2 = new ComponentName(context, str2);
        } else {
            componentName2 = null;
        }
        this.f44600g = componentName2;
        j jVar = new j(context);
        this.h = jVar;
        jVar.e = new qk0(this, 13);
        j jVar2 = new j(context);
        this.f44601i = jVar2;
        jVar2.e = new f1(this, 21);
        this.f44603k = new a7.e(Looper.getMainLooper(), 2);
        u5.b bVar3 = f.f44577u;
        s5.a aVar3 = bVar.f43346f;
        if (aVar3 != null && (fVar2 = aVar3.d) != null) {
            s5.p pVar2 = fVar2.S;
            if (pVar2 != null) {
                ArrayList a2 = i.a(pVar2);
                int[] b10 = i.b(pVar2);
                if (a2 == null) {
                    size = 0;
                } else {
                    size = a2.size();
                }
                if (a2 != null && !a2.isEmpty()) {
                    if (a2.size() > 5) {
                        Log.e(bVar3.f45098a, bVar3.d(s5.e.class.getSimpleName().concat(" provides more than 5 actions."), new Object[0]));
                    } else if (b10 != null && (r1 = b10.length) != 0) {
                        for (int i10 : b10) {
                            if (i10 < 0 || i10 >= size) {
                                Log.e(bVar3.f45098a, bVar3.d(s5.e.class.getSimpleName().concat("provides a compact view action whose index is out of bounds."), new Object[0]));
                                break;
                            }
                        }
                    } else {
                        Log.e(bVar3.f45098a, bVar3.d(s5.e.class.getSimpleName().concat(" doesn't provide any actions for compact view."), new Object[0]));
                    }
                } else {
                    Log.e(bVar3.f45098a, bVar3.d(s5.e.class.getSimpleName().concat(" doesn't provide any action."), new Object[0]));
                }
            }
            fVar3 = new f(context);
        }
        this.f44602j = fVar3;
        this.f44604l = new tl0(this, 8);
    }

    public final void a(s5.h hVar, CastDevice castDevice) {
        s5.a aVar;
        ComponentName componentName;
        r5.b bVar = this.f44597b;
        if (bVar == null) {
            aVar = null;
        } else {
            aVar = bVar.f43346f;
        }
        if (!this.f44609q && bVar != null && aVar != null && this.e != null && hVar != null && castDevice != null && (componentName = this.f44600g) != null) {
            this.f44606n = hVar;
            hVar.p(this.f44605m);
            this.f44607o = castDevice;
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setComponent(componentName);
            int i10 = y.f3204a;
            Context context = this.f44596a;
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, i10);
            if (aVar.f44044f) {
                c0 c0Var = new c0(context, "CastMediaSession", componentName, broadcast);
                this.f44608p = c0Var;
                j(0, null);
                CastDevice castDevice2 = this.f44607o;
                if (castDevice2 != null && !TextUtils.isEmpty(castDevice2.d)) {
                    Bundle bundle = new Bundle();
                    String string = context.getResources().getString(2131701275, this.f44607o.d);
                    a0.f fVar = MediaMetadataCompat.d;
                    if (fVar.containsKey("android.media.metadata.ALBUM_ARTIST") && ((Integer) fVar.get("android.media.metadata.ALBUM_ARTIST")).intValue() != 1) {
                        throw new IllegalArgumentException("The android.media.metadata.ALBUM_ARTIST key cannot be used to put a String");
                    }
                    bundle.putCharSequence("android.media.metadata.ALBUM_ARTIST", string);
                    c0Var.e(new MediaMetadataCompat(bundle));
                }
                c0Var.d(new g(this), null);
                c0Var.c(true);
                this.f44598c.J0(c0Var);
            }
            this.f44609q = true;
            b();
            return;
        }
        v.b("skip attaching media session", new Object[0]);
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: t5.h.b():void");
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
                s5.h hVar = this.f44606n;
                if (hVar != null && hVar.h()) {
                    q e = hVar.e();
                    m.h(e);
                    if ((128 & e.f42850n) == 0 && e.C == 0) {
                        Integer num = (Integer) e.K.get(e.f42848c);
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
            s5.h hVar2 = this.f44606n;
            if (hVar2 != null && hVar2.h()) {
                q e6 = hVar2.e();
                m.h(e6);
                if ((64 & e6.f42850n) == 0 && e6.C == 0) {
                    Integer num2 = (Integer) e6.K.get(e6.f42848c);
                    if (num2 != null && num2.intValue() < e6.D.size() - 1) {
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

    public final Uri d(l lVar) {
        a6.a aVar;
        s5.a aVar2 = this.f44597b.f43346f;
        if (aVar2 != null) {
            aVar2.e();
        }
        List list = lVar.f42826a;
        if (list != null && !list.isEmpty()) {
            aVar = (a6.a) lVar.f42826a.get(0);
        } else {
            aVar = null;
        }
        if (aVar == null) {
            return null;
        }
        return aVar.f121b;
    }

    public final void e(Bitmap bitmap, int i10) {
        android.support.v4.media.d dVar;
        String str;
        MediaMetadata metadata;
        c0 c0Var = this.f44608p;
        if (c0Var == null) {
            return;
        }
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            bitmap.eraseColor(0);
        }
        c0 c0Var2 = this.f44608p;
        MediaMetadataCompat mediaMetadataCompat = null;
        if (c0Var2 != null && (metadata = ((android.support.v4.media.session.h) c0Var2.f247b.f1782b).f260a.getMetadata()) != null) {
            a0.f fVar = MediaMetadataCompat.d;
            Parcel obtain = Parcel.obtain();
            metadata.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            MediaMetadataCompat createFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
            obtain.recycle();
            createFromParcel.f215b = metadata;
            mediaMetadataCompat = createFromParcel;
        }
        if (mediaMetadataCompat == null) {
            dVar = new android.support.v4.media.d();
        } else {
            dVar = new android.support.v4.media.d(mediaMetadataCompat);
        }
        if (i10 == 0) {
            str = "android.media.metadata.DISPLAY_ICON";
        } else {
            str = "android.media.metadata.ALBUM_ART";
        }
        dVar.c(str, bitmap);
        c0Var.e(dVar.a());
    }

    public final void f(android.support.v4.media.session.f0 r13, java.lang.String r14, s5.d r15) {
        throw new UnsupportedOperationException("Method not decompiled: t5.h.f(android.support.v4.media.session.f0, java.lang.String, s5.d):void");
    }

    public final void g(boolean z4) {
        if (this.f44597b.h) {
            a7.e eVar = this.f44603k;
            tl0 tl0Var = this.f44604l;
            if (tl0Var != null) {
                eVar.removeCallbacks(tl0Var);
            }
            Context context = this.f44596a;
            Intent intent = new Intent(context, ReconnectionService.class);
            intent.setPackage(context.getPackageName());
            try {
                context.startService(intent);
            } catch (IllegalStateException unused) {
                if (z4) {
                    eVar.postDelayed(tl0Var, 1000L);
                }
            }
        }
    }

    public final void h() {
        f fVar = this.f44602j;
        if (fVar != null) {
            v.b("Stopping media notification.", new Object[0]);
            j jVar = fVar.f44583i;
            jVar.C();
            jVar.e = null;
            NotificationManager notificationManager = fVar.f44579b;
            if (notificationManager != null) {
                notificationManager.cancel("castMediaNotification", 1);
            }
        }
    }

    public final void i() {
        if (!this.f44597b.h) {
            return;
        }
        this.f44603k.removeCallbacks(this.f44604l);
        Context context = this.f44596a;
        Intent intent = new Intent(context, ReconnectionService.class);
        intent.setPackage(context.getPackageName());
        context.stopService(intent);
    }

    public final void j(int i10, MediaInfo mediaInfo) {
        PlaybackStateCompat b10;
        c0 c0Var;
        l lVar;
        long j10;
        MediaMetadata metadata;
        MediaMetadataCompat createFromParcel;
        android.support.v4.media.d dVar;
        Bitmap bitmap;
        PendingIntent activity;
        long j11;
        s5.p pVar;
        long j12;
        int i11;
        c0 c0Var2 = this.f44608p;
        if (c0Var2 != null) {
            v vVar = c0Var2.f246a;
            Bundle bundle = new Bundle();
            f0 f0Var = new f0();
            s5.h hVar = this.f44606n;
            s5.f fVar = this.e;
            if (hVar != null && this.f44602j != null) {
                if (hVar.s() == 0 || hVar.j()) {
                    j11 = 0;
                } else {
                    j11 = hVar.a();
                }
                f0Var.c(i10, j11, 1.0f);
                if (i10 == 0) {
                    b10 = f0Var.b();
                } else {
                    if (fVar != null) {
                        pVar = fVar.S;
                    } else {
                        pVar = null;
                    }
                    s5.h hVar2 = this.f44606n;
                    if (hVar2 == null || hVar2.j() || this.f44606n.n()) {
                        j12 = 0;
                    } else {
                        j12 = 256;
                    }
                    if (pVar != null) {
                        ArrayList a2 = i.a(pVar);
                        if (a2 != null) {
                            int size = a2.size();
                            int i12 = 0;
                            while (i12 < size) {
                                Object obj = a2.get(i12);
                                i12++;
                                ArrayList arrayList = a2;
                                s5.d dVar2 = (s5.d) obj;
                                int i13 = size;
                                String str = dVar2.f44058a;
                                if (!TextUtils.equals(str, "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK") && !TextUtils.equals(str, "com.google.android.gms.cast.framework.action.SKIP_PREV") && !TextUtils.equals(str, "com.google.android.gms.cast.framework.action.SKIP_NEXT")) {
                                    f(f0Var, str, dVar2);
                                } else {
                                    j12 = c(str, i10, bundle) | j12;
                                }
                                size = i13;
                                a2 = arrayList;
                            }
                        }
                    } else if (fVar != null) {
                        ArrayList arrayList2 = fVar.f44061a;
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
                                f(f0Var, str2, null);
                            }
                            size2 = i11;
                            arrayList2 = arrayList3;
                        }
                    }
                    f0Var.e = j12;
                    b10 = f0Var.b();
                }
            } else {
                b10 = f0Var.b();
            }
            c0Var2.f(b10);
            if (fVar != null && fVar.T) {
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
            }
            if (fVar != null && fVar.U) {
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
            }
            if (bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS") || bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT")) {
                vVar.f268a.setExtras(bundle);
            }
            if (i10 != 0) {
                if (this.f44606n != null) {
                    ComponentName componentName = this.f44599f;
                    if (componentName == null) {
                        activity = null;
                    } else {
                        Intent intent = new Intent();
                        intent.setComponent(componentName);
                        activity = PendingIntent.getActivity(this.f44596a, 0, intent, y.f3204a | 134217728);
                    }
                    if (activity != null) {
                        vVar.f268a.setSessionActivity(activity);
                    }
                }
                s5.h hVar3 = this.f44606n;
                if (hVar3 != null && (c0Var = this.f44608p) != null && mediaInfo != null && (lVar = mediaInfo.d) != null) {
                    Bundle bundle2 = lVar.f42827b;
                    if (hVar3.j()) {
                        j10 = 0;
                    } else {
                        j10 = mediaInfo.e;
                    }
                    l.f(1, "com.google.android.gms.cast.metadata.TITLE");
                    String string = bundle2.getString("com.google.android.gms.cast.metadata.TITLE");
                    l.f(1, "com.google.android.gms.cast.metadata.SUBTITLE");
                    String string2 = bundle2.getString("com.google.android.gms.cast.metadata.SUBTITLE");
                    c0 c0Var3 = this.f44608p;
                    if (c0Var3 == null || (metadata = ((android.support.v4.media.session.h) c0Var3.f247b.f1782b).f260a.getMetadata()) == null) {
                        createFromParcel = null;
                    } else {
                        a0.f fVar2 = MediaMetadataCompat.d;
                        Parcel obtain = Parcel.obtain();
                        metadata.writeToParcel(obtain, 0);
                        obtain.setDataPosition(0);
                        createFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
                        obtain.recycle();
                        createFromParcel.f215b = metadata;
                    }
                    if (createFromParcel == null) {
                        dVar = new android.support.v4.media.d();
                    } else {
                        dVar = new android.support.v4.media.d(createFromParcel);
                    }
                    dVar.d(j10, "android.media.metadata.DURATION");
                    if (string != null) {
                        dVar.e("android.media.metadata.TITLE", string);
                        dVar.e("android.media.metadata.DISPLAY_TITLE", string);
                    }
                    if (string2 != null) {
                        dVar.e("android.media.metadata.DISPLAY_SUBTITLE", string2);
                    }
                    c0Var.e(dVar.a());
                    Uri d = d(lVar);
                    if (d != null) {
                        this.h.B(d);
                        bitmap = null;
                    } else {
                        bitmap = null;
                        e(null, 0);
                    }
                    Uri d10 = d(lVar);
                    if (d10 != null) {
                        this.f44601i.B(d10);
                        return;
                    } else {
                        e(bitmap, 3);
                        return;
                    }
                }
                return;
            }
            c0Var2.e(new MediaMetadataCompat(new Bundle()));
        }
    }
}
