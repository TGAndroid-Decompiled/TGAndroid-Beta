package t5;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.text.TextUtils;
import android.util.Log;
import b6.m;
import c5.j;
import com.google.android.gms.internal.cast.c1;
import com.google.android.gms.internal.cast.c2;
import com.google.android.gms.internal.cast.x;
import e0.b0;
import e0.k;
import e0.t;
import j7.c7;
import java.util.ArrayList;
import java.util.Arrays;
import q5.g0;
import s5.p;
public final class f {
    public static final u5.b f47986u = new u5.b("MediaNotificationProxy", null);
    public final Context f47987a;
    public final NotificationManager f47988b;
    public final s5.f f47989c;
    public final ComponentName d;
    public final ComponentName f47990e;
    public ArrayList f47991f = new ArrayList();
    public int[] f47992g;
    public final long h;
    public final j f47993i;
    public final Resources f47994j;
    public ke.b f47995k;
    public g0 f47996l;
    public k f47997m;
    public k f47998n;
    public k f47999o;
    public k f48000p;
    public k f48001q;
    public k f48002r;
    public k f48003s;
    public k f48004t;

    public f(Context context) {
        this.f47987a = context;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        this.f47988b = notificationManager;
        u5.b bVar = r5.a.f46677l;
        m.e("Must be called from the main thread.");
        r5.a aVar = r5.a.f46679n;
        m.h(aVar);
        m.e("Must be called from the main thread.");
        r5.b bVar2 = aVar.f46683e;
        m.h(bVar2);
        s5.a aVar2 = bVar2.f46694f;
        m.h(aVar2);
        s5.f fVar = aVar2.d;
        m.h(fVar);
        this.f47989c = fVar;
        aVar2.e();
        Resources resources = context.getResources();
        this.f47994j = resources;
        this.d = new ComponentName(context.getApplicationContext(), aVar2.f47011a);
        String str = fVar.d;
        if (!TextUtils.isEmpty(str)) {
            this.f47990e = new ComponentName(context.getApplicationContext(), str);
        } else {
            this.f47990e = null;
        }
        this.h = fVar.f47035c;
        int dimensionPixelSize = resources.getDimensionPixelSize(fVar.E);
        this.f47993i = new j(context.getApplicationContext(), new s5.b(1, dimensionPixelSize, dimensionPixelSize));
        if (i6.b.d() && notificationManager != null) {
            NotificationChannel notificationChannel = new NotificationChannel("cast_media_notification", context.getResources().getString(2131701405), 2);
            notificationChannel.setShowBadge(false);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        c2.a(c1.CAF_MEDIA_NOTIFICATION_PROXY);
    }

    public final k a(String str) {
        int i10;
        int i11;
        int hashCode = str.hashCode();
        long j10 = this.h;
        PendingIntent pendingIntent = null;
        Resources resources = this.f47994j;
        Context context = this.f47987a;
        ComponentName componentName = this.d;
        s5.f fVar = this.f47989c;
        switch (hashCode) {
            case -1699820260:
                if (str.equals("com.google.android.gms.cast.framework.action.REWIND")) {
                    if (this.f48002r == null) {
                        Intent intent = new Intent("com.google.android.gms.cast.framework.action.REWIND");
                        intent.setComponent(componentName);
                        intent.putExtra("googlecast-extra_skip_step_ms", j10);
                        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, x.f3164a | 134217728);
                        u5.b bVar = i.f48025a;
                        int i12 = (j10 > 10000L ? 1 : (j10 == 10000L ? 0 : -1));
                        int i13 = fVar.f47043y;
                        if (i12 == 0) {
                            i13 = fVar.B;
                        } else if (j10 == 30000) {
                            i13 = fVar.C;
                        }
                        int i14 = fVar.O;
                        if (i12 == 0) {
                            i14 = fVar.P;
                        } else if (j10 == 30000) {
                            i14 = fVar.Q;
                        }
                        this.f48002r = new e0.j(i13, resources.getString(i14), broadcast).b();
                    }
                    return this.f48002r;
                }
                break;
            case -945151566:
                if (str.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT")) {
                    boolean z4 = this.f47995k.f11105c;
                    if (this.f47999o == null) {
                        if (z4) {
                            Intent intent2 = new Intent("com.google.android.gms.cast.framework.action.SKIP_NEXT");
                            intent2.setComponent(componentName);
                            pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, x.f3164a);
                        }
                        this.f47999o = new e0.j(fVar.f47039r, resources.getString(fVar.J), pendingIntent).b();
                    }
                    return this.f47999o;
                }
                break;
            case -945080078:
                if (str.equals("com.google.android.gms.cast.framework.action.SKIP_PREV")) {
                    boolean z10 = this.f47995k.d;
                    if (this.f48000p == null) {
                        if (z10) {
                            Intent intent3 = new Intent("com.google.android.gms.cast.framework.action.SKIP_PREV");
                            intent3.setComponent(componentName);
                            pendingIntent = PendingIntent.getBroadcast(context, 0, intent3, x.f3164a);
                        }
                        this.f48000p = new e0.j(fVar.f47040s, resources.getString(fVar.K), pendingIntent).b();
                    }
                    return this.f48000p;
                }
                break;
            case -668151673:
                if (str.equals("com.google.android.gms.cast.framework.action.STOP_CASTING")) {
                    if (this.f48004t == null) {
                        Intent intent4 = new Intent("com.google.android.gms.cast.framework.action.STOP_CASTING");
                        intent4.setComponent(componentName);
                        this.f48004t = new e0.j(fVar.D, resources.getString(fVar.R), PendingIntent.getBroadcast(context, 0, intent4, x.f3164a)).b();
                    }
                    return this.f48004t;
                }
                break;
            case -124479363:
                if (str.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                    if (this.f48003s == null) {
                        Intent intent5 = new Intent("com.google.android.gms.cast.framework.action.DISCONNECT");
                        intent5.setComponent(componentName);
                        this.f48003s = new e0.j(fVar.D, resources.getString(fVar.R, ""), PendingIntent.getBroadcast(context, 0, intent5, x.f3164a)).b();
                    }
                    return this.f48003s;
                }
                break;
            case 235550565:
                if (str.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK")) {
                    ke.b bVar2 = this.f47995k;
                    int i15 = bVar2.f11104b;
                    if (bVar2.f11103a) {
                        if (this.f47998n == null) {
                            if (i15 == 2) {
                                i10 = fVar.f47037f;
                                i11 = fVar.G;
                            } else {
                                i10 = fVar.h;
                                i11 = fVar.H;
                            }
                            Intent intent6 = new Intent("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK");
                            intent6.setComponent(componentName);
                            this.f47998n = new e0.j(i10, resources.getString(i11), PendingIntent.getBroadcast(context, 0, intent6, x.f3164a)).b();
                        }
                        return this.f47998n;
                    }
                    if (this.f47997m == null) {
                        Intent intent7 = new Intent("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK");
                        intent7.setComponent(componentName);
                        this.f47997m = new e0.j(fVar.f47038n, resources.getString(fVar.I), PendingIntent.getBroadcast(context, 0, intent7, x.f3164a)).b();
                    }
                    return this.f47997m;
                }
                break;
            case 1362116196:
                if (str.equals("com.google.android.gms.cast.framework.action.FORWARD")) {
                    if (this.f48001q == null) {
                        Intent intent8 = new Intent("com.google.android.gms.cast.framework.action.FORWARD");
                        intent8.setComponent(componentName);
                        intent8.putExtra("googlecast-extra_skip_step_ms", j10);
                        PendingIntent broadcast2 = PendingIntent.getBroadcast(context, 0, intent8, x.f3164a | 134217728);
                        u5.b bVar3 = i.f48025a;
                        int i16 = (j10 > 10000L ? 1 : (j10 == 10000L ? 0 : -1));
                        int i17 = fVar.v;
                        if (i16 == 0) {
                            i17 = fVar.f47041w;
                        } else if (j10 == 30000) {
                            i17 = fVar.f47042x;
                        }
                        int i18 = fVar.L;
                        if (i16 == 0) {
                            i18 = fVar.M;
                        } else if (j10 == 30000) {
                            i18 = fVar.N;
                        }
                        this.f48001q = new e0.j(i17, resources.getString(i18), broadcast2).b();
                    }
                    return this.f48001q;
                }
                break;
        }
        u5.b bVar4 = f47986u;
        Log.e(bVar4.f48349a, bVar4.d("Action: %s is not a pre-defined action.", str));
        return null;
    }

    public final void b() {
        Bitmap bitmap;
        PendingIntent activities;
        int[] iArr;
        k a2;
        NotificationManager notificationManager = this.f47988b;
        if (notificationManager != null && this.f47995k != null) {
            g0 g0Var = this.f47996l;
            if (g0Var == null) {
                bitmap = null;
            } else {
                bitmap = (Bitmap) g0Var.f44558c;
            }
            Context context = this.f47987a;
            t tVar = new t(context, "cast_media_notification");
            tVar.j(bitmap);
            s5.f fVar = this.f47989c;
            tVar.E.icon = fVar.f47036e;
            tVar.f4850e = t.d((String) this.f47995k.f11107f);
            int i10 = 0;
            tVar.f4851f = t.d(this.f47994j.getString(fVar.F, (String) this.f47995k.f11108g));
            tVar.h(2, true);
            tVar.f4855k = false;
            tVar.f4867x = 1;
            ComponentName componentName = this.f47990e;
            if (componentName == null) {
                activities = null;
            } else {
                Intent intent = new Intent();
                intent.putExtra("targetActivity", componentName);
                intent.setAction(componentName.flattenToString());
                intent.setComponent(componentName);
                ArrayList arrayList = new ArrayList();
                ComponentName component = intent.getComponent();
                if (component == null) {
                    component = intent.resolveActivity(context.getPackageManager());
                }
                if (component != null) {
                    int size = arrayList.size();
                    try {
                        for (Intent a10 = c7.a(context, component); a10 != null; a10 = c7.a(context, a10.getComponent())) {
                            arrayList.add(size, a10);
                        }
                    } catch (PackageManager.NameNotFoundException e6) {
                        Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                        throw new IllegalArgumentException(e6);
                    }
                }
                arrayList.add(intent);
                int i11 = x.f3164a | 134217728;
                if (!arrayList.isEmpty()) {
                    Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                    intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                    activities = PendingIntent.getActivities(context, 1, intentArr, i11, null);
                } else {
                    throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
                }
            }
            if (activities != null) {
                tVar.f4852g = activities;
            }
            p pVar = fVar.S;
            u5.b bVar = f47986u;
            if (pVar != null) {
                bVar.b("actionsProvider != null", new Object[0]);
                int[] b10 = i.b(pVar);
                if (b10 == null) {
                    iArr = null;
                } else {
                    iArr = (int[]) b10.clone();
                }
                this.f47992g = iArr;
                ArrayList a11 = i.a(pVar);
                this.f47991f = new ArrayList();
                if (a11 != null) {
                    int size2 = a11.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj = a11.get(i12);
                        i12++;
                        s5.d dVar = (s5.d) obj;
                        String str = dVar.f47030a;
                        if (!str.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK") && !str.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT") && !str.equals("com.google.android.gms.cast.framework.action.SKIP_PREV") && !str.equals("com.google.android.gms.cast.framework.action.FORWARD") && !str.equals("com.google.android.gms.cast.framework.action.REWIND") && !str.equals("com.google.android.gms.cast.framework.action.STOP_CASTING") && !str.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                            Intent intent2 = new Intent(str);
                            intent2.setComponent(this.d);
                            a2 = new e0.j(dVar.f47031b, dVar.f47032c, PendingIntent.getBroadcast(context, 0, intent2, x.f3164a)).b();
                        } else {
                            a2 = a(str);
                        }
                        if (a2 != null) {
                            this.f47991f.add(a2);
                        }
                    }
                }
            } else {
                bVar.b("actionsProvider == null", new Object[0]);
                this.f47991f = new ArrayList();
                ArrayList arrayList2 = fVar.f47033a;
                int size3 = arrayList2.size();
                int i13 = 0;
                while (i13 < size3) {
                    Object obj2 = arrayList2.get(i13);
                    i13++;
                    k a12 = a((String) obj2);
                    if (a12 != null) {
                        this.f47991f.add(a12);
                    }
                }
                int[] iArr2 = fVar.f47034b;
                this.f47992g = (int[]) Arrays.copyOf(iArr2, iArr2.length).clone();
            }
            ArrayList arrayList3 = this.f47991f;
            int size4 = arrayList3.size();
            while (i10 < size4) {
                Object obj3 = arrayList3.get(i10);
                i10++;
                k kVar = (k) obj3;
                if (kVar != null) {
                    tVar.f4848b.add(kVar);
                }
            }
            ?? b0Var = new b0();
            b0Var.f50955e = null;
            int[] iArr3 = this.f47992g;
            if (iArr3 != null) {
                b0Var.f50955e = iArr3;
            }
            MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) this.f47995k.f11106e;
            if (mediaSessionCompat$Token != null) {
                b0Var.f50956f = mediaSessionCompat$Token;
            }
            tVar.n(b0Var);
            notificationManager.notify("castMediaNotification", 1, tVar.b());
        }
    }
}
