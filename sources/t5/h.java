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
import com.google.android.gms.internal.cast.o;
import com.google.android.gms.internal.cast.x;
import java.util.ArrayList;
import java.util.List;
import oh.h4;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.web.e0;
import q5.l;
import q5.q;
import r5.d0;
import s5.p;
public final class h {
    public static final u5.b v = new u5.b("MediaSessionManager", null);
    public final Context f48006a;
    public final r5.b f48007b;
    public final o f48008c;
    public final r5.g d;
    public final s5.f f48009e;
    public final ComponentName f48010f;
    public final ComponentName f48011g;
    public final j h;
    public final j f48012i;
    public final f f48013j;
    public final a7.e f48014k;
    public final ul0 f48015l;
    public final d0 f48016m;
    public s5.h f48017n;
    public CastDevice f48018o;
    public c0 f48019p;
    public boolean f48020q;
    public PlaybackStateCompat.CustomAction f48021r;
    public PlaybackStateCompat.CustomAction f48022s;
    public PlaybackStateCompat.CustomAction f48023t;
    public PlaybackStateCompat.CustomAction f48024u;

    public h(Context context, r5.b bVar, o oVar) {
        r5.g gVar;
        s5.f fVar;
        String str;
        ComponentName componentName;
        String str2;
        ComponentName componentName2;
        s5.f fVar2;
        int size;
        this.f48006a = context;
        this.f48007b = bVar;
        this.f48008c = oVar;
        u5.b bVar2 = r5.a.f46677l;
        m.e("Must be called from the main thread.");
        r5.a aVar = r5.a.f46679n;
        f fVar3 = null;
        if (aVar != null) {
            gVar = aVar.b();
        } else {
            gVar = null;
        }
        this.d = gVar;
        s5.a aVar2 = bVar.f46694f;
        if (aVar2 == null) {
            fVar = null;
        } else {
            fVar = aVar2.d;
        }
        this.f48009e = fVar;
        this.f48016m = new d0(this, 2);
        if (aVar2 == null) {
            str = null;
        } else {
            str = aVar2.f47012b;
        }
        if (!TextUtils.isEmpty(str)) {
            componentName = new ComponentName(context, str);
        } else {
            componentName = null;
        }
        this.f48010f = componentName;
        if (aVar2 == null) {
            str2 = null;
        } else {
            str2 = aVar2.f47011a;
        }
        if (!TextUtils.isEmpty(str2)) {
            componentName2 = new ComponentName(context, str2);
        } else {
            componentName2 = null;
        }
        this.f48011g = componentName2;
        j jVar = new j(context);
        this.h = jVar;
        jVar.f2318e = new h4(this, 20);
        j jVar2 = new j(context);
        this.f48012i = jVar2;
        jVar2.f2318e = new e0(this, 12);
        this.f48014k = new a7.e(Looper.getMainLooper(), 2);
        u5.b bVar3 = f.f47986u;
        s5.a aVar3 = bVar.f46694f;
        if (aVar3 != null && (fVar2 = aVar3.d) != null) {
            p pVar = fVar2.S;
            if (pVar != null) {
                ArrayList a2 = i.a(pVar);
                int[] b10 = i.b(pVar);
                if (a2 == null) {
                    size = 0;
                } else {
                    size = a2.size();
                }
                if (a2 != null && !a2.isEmpty()) {
                    if (a2.size() > 5) {
                        Log.e(bVar3.f48349a, bVar3.d(s5.e.class.getSimpleName().concat(" provides more than 5 actions."), new Object[0]));
                    } else if (b10 != null && (r1 = b10.length) != 0) {
                        for (int i10 : b10) {
                            if (i10 < 0 || i10 >= size) {
                                Log.e(bVar3.f48349a, bVar3.d(s5.e.class.getSimpleName().concat("provides a compact view action whose index is out of bounds."), new Object[0]));
                                break;
                            }
                        }
                    } else {
                        Log.e(bVar3.f48349a, bVar3.d(s5.e.class.getSimpleName().concat(" doesn't provide any actions for compact view."), new Object[0]));
                    }
                } else {
                    Log.e(bVar3.f48349a, bVar3.d(s5.e.class.getSimpleName().concat(" doesn't provide any action."), new Object[0]));
                }
            }
            fVar3 = new f(context);
        }
        this.f48013j = fVar3;
        this.f48015l = new ul0(this, 8);
    }

    public final void a(s5.h hVar, CastDevice castDevice) {
        s5.a aVar;
        ComponentName componentName;
        r5.b bVar = this.f48007b;
        if (bVar == null) {
            aVar = null;
        } else {
            aVar = bVar.f46694f;
        }
        if (!this.f48020q && bVar != null && aVar != null && this.f48009e != null && hVar != null && castDevice != null && (componentName = this.f48011g) != null) {
            this.f48017n = hVar;
            hVar.p(this.f48016m);
            this.f48018o = castDevice;
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setComponent(componentName);
            int i10 = x.f3164a;
            Context context = this.f48006a;
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, i10);
            if (aVar.f47015f) {
                c0 c0Var = new c0(context, "CastMediaSession", componentName, broadcast);
                this.f48019p = c0Var;
                j(0, null);
                CastDevice castDevice2 = this.f48018o;
                if (castDevice2 != null && !TextUtils.isEmpty(castDevice2.d)) {
                    Bundle bundle = new Bundle();
                    String string = context.getResources().getString(2131701275, this.f48018o.d);
                    a0.f fVar = MediaMetadataCompat.d;
                    if (fVar.containsKey("android.media.metadata.ALBUM_ARTIST") && ((Integer) fVar.get("android.media.metadata.ALBUM_ARTIST")).intValue() != 1) {
                        throw new IllegalArgumentException("The android.media.metadata.ALBUM_ARTIST key cannot be used to put a String");
                    }
                    bundle.putCharSequence("android.media.metadata.ALBUM_ARTIST", string);
                    c0Var.e(new MediaMetadataCompat(bundle));
                }
                c0Var.d(new g(this), null);
                c0Var.c(true);
                this.f48008c.J0(c0Var);
            }
            this.f48020q = true;
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
                s5.h hVar = this.f48017n;
                if (hVar != null && hVar.h()) {
                    q e6 = hVar.e();
                    m.h(e6);
                    if ((128 & e6.f44608n) == 0 && e6.C == 0) {
                        Integer num = (Integer) e6.K.get(e6.f44605c);
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
            s5.h hVar2 = this.f48017n;
            if (hVar2 != null && hVar2.h()) {
                q e10 = hVar2.e();
                m.h(e10);
                if ((64 & e10.f44608n) == 0 && e10.C == 0) {
                    Integer num2 = (Integer) e10.K.get(e10.f44605c);
                    if (num2 != null && num2.intValue() < e10.D.size() - 1) {
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
        s5.a aVar2 = this.f48007b.f46694f;
        if (aVar2 != null) {
            aVar2.e();
        }
        List list = lVar.f44580a;
        if (list != null && !list.isEmpty()) {
            aVar = (a6.a) lVar.f44580a.get(0);
        } else {
            aVar = null;
        }
        if (aVar == null) {
            return null;
        }
        return aVar.f132b;
    }

    public final void e(Bitmap bitmap, int i10) {
        o5.i iVar;
        String str;
        MediaMetadata metadata;
        c0 c0Var = this.f48019p;
        if (c0Var == null) {
            return;
        }
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            bitmap.eraseColor(0);
        }
        c0 c0Var2 = this.f48019p;
        MediaMetadataCompat mediaMetadataCompat = null;
        if (c0Var2 != null && (metadata = ((android.support.v4.media.session.h) c0Var2.f280b.f1935b).f294a.getMetadata()) != null) {
            a0.f fVar = MediaMetadataCompat.d;
            Parcel obtain = Parcel.obtain();
            metadata.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            MediaMetadataCompat createFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
            obtain.recycle();
            createFromParcel.f246b = metadata;
            mediaMetadataCompat = createFromParcel;
        }
        if (mediaMetadataCompat == null) {
            iVar = new o5.i(1);
        } else {
            iVar = new o5.i(mediaMetadataCompat);
        }
        if (i10 == 0) {
            str = "android.media.metadata.DISPLAY_ICON";
        } else {
            str = "android.media.metadata.ALBUM_ART";
        }
        iVar.w(str, bitmap);
        c0Var.e(iVar.b());
    }

    public final void f(android.support.v4.media.session.f0 r13, java.lang.String r14, s5.d r15) {
        throw new UnsupportedOperationException("Method not decompiled: t5.h.f(android.support.v4.media.session.f0, java.lang.String, s5.d):void");
    }

    public final void g(boolean z4) {
        if (this.f48007b.h) {
            a7.e eVar = this.f48014k;
            ul0 ul0Var = this.f48015l;
            if (ul0Var != null) {
                eVar.removeCallbacks(ul0Var);
            }
            Context context = this.f48006a;
            Intent intent = new Intent(context, ReconnectionService.class);
            intent.setPackage(context.getPackageName());
            try {
                context.startService(intent);
            } catch (IllegalStateException unused) {
                if (z4) {
                    eVar.postDelayed(ul0Var, 1000L);
                }
            }
        }
    }

    public final void h() {
        f fVar = this.f48013j;
        if (fVar != null) {
            v.b("Stopping media notification.", new Object[0]);
            j jVar = fVar.f47993i;
            jVar.C();
            jVar.f2318e = null;
            NotificationManager notificationManager = fVar.f47988b;
            if (notificationManager != null) {
                notificationManager.cancel("castMediaNotification", 1);
            }
        }
    }

    public final void i() {
        if (!this.f48007b.h) {
            return;
        }
        this.f48014k.removeCallbacks(this.f48015l);
        Context context = this.f48006a;
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
        o5.i iVar;
        Bitmap bitmap;
        PendingIntent activity;
        long j11;
        p pVar;
        long j12;
        int i11;
        c0 c0Var2 = this.f48019p;
        if (c0Var2 != null) {
            v vVar = c0Var2.f279a;
            Bundle bundle = new Bundle();
            f0 f0Var = new f0();
            s5.h hVar = this.f48017n;
            s5.f fVar = this.f48009e;
            if (hVar != null && this.f48013j != null) {
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
                    s5.h hVar2 = this.f48017n;
                    if (hVar2 == null || hVar2.j() || this.f48017n.n()) {
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
                                s5.d dVar = (s5.d) obj;
                                int i13 = size;
                                String str = dVar.f47030a;
                                if (!TextUtils.equals(str, "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK") && !TextUtils.equals(str, "com.google.android.gms.cast.framework.action.SKIP_PREV") && !TextUtils.equals(str, "com.google.android.gms.cast.framework.action.SKIP_NEXT")) {
                                    f(f0Var, str, dVar);
                                } else {
                                    j12 = c(str, i10, bundle) | j12;
                                }
                                size = i13;
                                a2 = arrayList;
                            }
                        }
                    } else if (fVar != null) {
                        ArrayList arrayList2 = fVar.f47033a;
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
                    f0Var.f289e = j12;
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
                vVar.f303a.setExtras(bundle);
            }
            if (i10 != 0) {
                if (this.f48017n != null) {
                    ComponentName componentName = this.f48010f;
                    if (componentName == null) {
                        activity = null;
                    } else {
                        Intent intent = new Intent();
                        intent.setComponent(componentName);
                        activity = PendingIntent.getActivity(this.f48006a, 0, intent, x.f3164a | 134217728);
                    }
                    if (activity != null) {
                        vVar.f303a.setSessionActivity(activity);
                    }
                }
                s5.h hVar3 = this.f48017n;
                if (hVar3 != null && (c0Var = this.f48019p) != null && mediaInfo != null && (lVar = mediaInfo.d) != null) {
                    Bundle bundle2 = lVar.f44581b;
                    if (hVar3.j()) {
                        j10 = 0;
                    } else {
                        j10 = mediaInfo.f2614e;
                    }
                    l.f(1, "com.google.android.gms.cast.metadata.TITLE");
                    String string = bundle2.getString("com.google.android.gms.cast.metadata.TITLE");
                    l.f(1, "com.google.android.gms.cast.metadata.SUBTITLE");
                    String string2 = bundle2.getString("com.google.android.gms.cast.metadata.SUBTITLE");
                    c0 c0Var3 = this.f48019p;
                    if (c0Var3 == null || (metadata = ((android.support.v4.media.session.h) c0Var3.f280b.f1935b).f294a.getMetadata()) == null) {
                        createFromParcel = null;
                    } else {
                        a0.f fVar2 = MediaMetadataCompat.d;
                        Parcel obtain = Parcel.obtain();
                        metadata.writeToParcel(obtain, 0);
                        obtain.setDataPosition(0);
                        createFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
                        obtain.recycle();
                        createFromParcel.f246b = metadata;
                    }
                    if (createFromParcel == null) {
                        iVar = new o5.i(1);
                    } else {
                        iVar = new o5.i(createFromParcel);
                    }
                    iVar.x(j10, "android.media.metadata.DURATION");
                    if (string != null) {
                        iVar.A("android.media.metadata.TITLE", string);
                        iVar.A("android.media.metadata.DISPLAY_TITLE", string);
                    }
                    if (string2 != null) {
                        iVar.A("android.media.metadata.DISPLAY_SUBTITLE", string2);
                    }
                    c0Var.e(iVar.b());
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
                        this.f48012i.B(d10);
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
