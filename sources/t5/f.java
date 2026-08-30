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
import com.google.android.gms.internal.cast.d1;
import com.google.android.gms.internal.cast.d2;
import com.google.android.gms.internal.cast.y;
import e0.b0;
import e0.k;
import e0.t;
import j7.b7;
import java.util.ArrayList;
import java.util.Arrays;
import q5.g0;
import s5.p;
public final class f {
    public static final u5.b f44577u = new u5.b("MediaNotificationProxy", null);
    public final Context f44578a;
    public final NotificationManager f44579b;
    public final s5.f f44580c;
    public final ComponentName d;
    public final ComponentName e;
    public ArrayList f44581f = new ArrayList();
    public int[] f44582g;
    public final long h;
    public final j f44583i;
    public final Resources f44584j;
    public ke.b f44585k;
    public g0 f44586l;
    public k f44587m;
    public k f44588n;
    public k f44589o;
    public k f44590p;
    public k f44591q;
    public k f44592r;
    public k f44593s;
    public k f44594t;

    public f(Context context) {
        this.f44578a = context;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        this.f44579b = notificationManager;
        u5.b bVar = r5.a.f43331l;
        m.e("Must be called from the main thread.");
        r5.a aVar = r5.a.f43333n;
        m.h(aVar);
        m.e("Must be called from the main thread.");
        r5.b bVar2 = aVar.e;
        m.h(bVar2);
        s5.a aVar2 = bVar2.f43346f;
        m.h(aVar2);
        s5.f fVar = aVar2.d;
        m.h(fVar);
        this.f44580c = fVar;
        aVar2.e();
        Resources resources = context.getResources();
        this.f44584j = resources;
        this.d = new ComponentName(context.getApplicationContext(), aVar2.f44041a);
        String str = fVar.d;
        if (!TextUtils.isEmpty(str)) {
            this.e = new ComponentName(context.getApplicationContext(), str);
        } else {
            this.e = null;
        }
        this.h = fVar.f44063c;
        int dimensionPixelSize = resources.getDimensionPixelSize(fVar.E);
        this.f44583i = new j(context.getApplicationContext(), new s5.b(1, dimensionPixelSize, dimensionPixelSize));
        if (i6.b.d() && notificationManager != null) {
            NotificationChannel notificationChannel = new NotificationChannel("cast_media_notification", context.getResources().getString(2131701405), 2);
            notificationChannel.setShowBadge(false);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        d2.a(d1.CAF_MEDIA_NOTIFICATION_PROXY);
    }

    public final k a(String str) {
        int i10;
        int i11;
        int hashCode = str.hashCode();
        long j10 = this.h;
        PendingIntent pendingIntent = null;
        Resources resources = this.f44584j;
        Context context = this.f44578a;
        ComponentName componentName = this.d;
        s5.f fVar = this.f44580c;
        switch (hashCode) {
            case -1699820260:
                if (str.equals("com.google.android.gms.cast.framework.action.REWIND")) {
                    if (this.f44592r == null) {
                        Intent intent = new Intent("com.google.android.gms.cast.framework.action.REWIND");
                        intent.setComponent(componentName);
                        intent.putExtra("googlecast-extra_skip_step_ms", j10);
                        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, y.f3204a | 134217728);
                        u5.b bVar = i.f44614a;
                        int i12 = (j10 > 10000L ? 1 : (j10 == 10000L ? 0 : -1));
                        int i13 = fVar.f44070y;
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
                        this.f44592r = new e0.j(i13, resources.getString(i14), broadcast).b();
                    }
                    return this.f44592r;
                }
                break;
            case -945151566:
                if (str.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT")) {
                    boolean z4 = this.f44585k.f10335c;
                    if (this.f44589o == null) {
                        if (z4) {
                            Intent intent2 = new Intent("com.google.android.gms.cast.framework.action.SKIP_NEXT");
                            intent2.setComponent(componentName);
                            pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, y.f3204a);
                        }
                        this.f44589o = new e0.j(fVar.f44066r, resources.getString(fVar.J), pendingIntent).b();
                    }
                    return this.f44589o;
                }
                break;
            case -945080078:
                if (str.equals("com.google.android.gms.cast.framework.action.SKIP_PREV")) {
                    boolean z10 = this.f44585k.d;
                    if (this.f44590p == null) {
                        if (z10) {
                            Intent intent3 = new Intent("com.google.android.gms.cast.framework.action.SKIP_PREV");
                            intent3.setComponent(componentName);
                            pendingIntent = PendingIntent.getBroadcast(context, 0, intent3, y.f3204a);
                        }
                        this.f44590p = new e0.j(fVar.f44067s, resources.getString(fVar.K), pendingIntent).b();
                    }
                    return this.f44590p;
                }
                break;
            case -668151673:
                if (str.equals("com.google.android.gms.cast.framework.action.STOP_CASTING")) {
                    if (this.f44594t == null) {
                        Intent intent4 = new Intent("com.google.android.gms.cast.framework.action.STOP_CASTING");
                        intent4.setComponent(componentName);
                        this.f44594t = new e0.j(fVar.D, resources.getString(fVar.R), PendingIntent.getBroadcast(context, 0, intent4, y.f3204a)).b();
                    }
                    return this.f44594t;
                }
                break;
            case -124479363:
                if (str.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                    if (this.f44593s == null) {
                        Intent intent5 = new Intent("com.google.android.gms.cast.framework.action.DISCONNECT");
                        intent5.setComponent(componentName);
                        this.f44593s = new e0.j(fVar.D, resources.getString(fVar.R, ""), PendingIntent.getBroadcast(context, 0, intent5, y.f3204a)).b();
                    }
                    return this.f44593s;
                }
                break;
            case 235550565:
                if (str.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK")) {
                    ke.b bVar2 = this.f44585k;
                    int i15 = bVar2.f10334b;
                    if (bVar2.f10333a) {
                        if (this.f44588n == null) {
                            if (i15 == 2) {
                                i10 = fVar.f44064f;
                                i11 = fVar.G;
                            } else {
                                i10 = fVar.h;
                                i11 = fVar.H;
                            }
                            Intent intent6 = new Intent("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK");
                            intent6.setComponent(componentName);
                            this.f44588n = new e0.j(i10, resources.getString(i11), PendingIntent.getBroadcast(context, 0, intent6, y.f3204a)).b();
                        }
                        return this.f44588n;
                    }
                    if (this.f44587m == null) {
                        Intent intent7 = new Intent("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK");
                        intent7.setComponent(componentName);
                        this.f44587m = new e0.j(fVar.f44065n, resources.getString(fVar.I), PendingIntent.getBroadcast(context, 0, intent7, y.f3204a)).b();
                    }
                    return this.f44587m;
                }
                break;
            case 1362116196:
                if (str.equals("com.google.android.gms.cast.framework.action.FORWARD")) {
                    if (this.f44591q == null) {
                        Intent intent8 = new Intent("com.google.android.gms.cast.framework.action.FORWARD");
                        intent8.setComponent(componentName);
                        intent8.putExtra("googlecast-extra_skip_step_ms", j10);
                        PendingIntent broadcast2 = PendingIntent.getBroadcast(context, 0, intent8, y.f3204a | 134217728);
                        u5.b bVar3 = i.f44614a;
                        int i16 = (j10 > 10000L ? 1 : (j10 == 10000L ? 0 : -1));
                        int i17 = fVar.v;
                        if (i16 == 0) {
                            i17 = fVar.f44068w;
                        } else if (j10 == 30000) {
                            i17 = fVar.f44069x;
                        }
                        int i18 = fVar.L;
                        if (i16 == 0) {
                            i18 = fVar.M;
                        } else if (j10 == 30000) {
                            i18 = fVar.N;
                        }
                        this.f44591q = new e0.j(i17, resources.getString(i18), broadcast2).b();
                    }
                    return this.f44591q;
                }
                break;
        }
        u5.b bVar4 = f44577u;
        Log.e(bVar4.f45098a, bVar4.d("Action: %s is not a pre-defined action.", str));
        return null;
    }

    public final void b() {
        Bitmap bitmap;
        PendingIntent activities;
        int[] iArr;
        k a2;
        NotificationManager notificationManager = this.f44579b;
        if (notificationManager != null && this.f44585k != null) {
            g0 g0Var = this.f44586l;
            if (g0Var == null) {
                bitmap = null;
            } else {
                bitmap = (Bitmap) g0Var.f42807c;
            }
            Context context = this.f44578a;
            t tVar = new t(context, "cast_media_notification");
            tVar.j(bitmap);
            s5.f fVar = this.f44580c;
            tVar.E.icon = fVar.e;
            tVar.e = t.d((String) this.f44585k.f10336f);
            int i10 = 0;
            tVar.f5020f = t.d(this.f44584j.getString(fVar.F, (String) this.f44585k.f10337g));
            tVar.h(2, true);
            tVar.f5024k = false;
            tVar.f5036x = 1;
            ComponentName componentName = this.e;
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
                        for (Intent a10 = b7.a(context, component); a10 != null; a10 = b7.a(context, a10.getComponent())) {
                            arrayList.add(size, a10);
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                        throw new IllegalArgumentException(e);
                    }
                }
                arrayList.add(intent);
                int i11 = y.f3204a | 134217728;
                if (!arrayList.isEmpty()) {
                    Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                    intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                    activities = PendingIntent.getActivities(context, 1, intentArr, i11, null);
                } else {
                    throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
                }
            }
            if (activities != null) {
                tVar.f5021g = activities;
            }
            p pVar = fVar.S;
            u5.b bVar = f44577u;
            if (pVar != null) {
                bVar.b("actionsProvider != null", new Object[0]);
                int[] b10 = i.b(pVar);
                if (b10 == null) {
                    iArr = null;
                } else {
                    iArr = (int[]) b10.clone();
                }
                this.f44582g = iArr;
                ArrayList a11 = i.a(pVar);
                this.f44581f = new ArrayList();
                if (a11 != null) {
                    int size2 = a11.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj = a11.get(i12);
                        i12++;
                        s5.d dVar = (s5.d) obj;
                        String str = dVar.f44058a;
                        if (!str.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK") && !str.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT") && !str.equals("com.google.android.gms.cast.framework.action.SKIP_PREV") && !str.equals("com.google.android.gms.cast.framework.action.FORWARD") && !str.equals("com.google.android.gms.cast.framework.action.REWIND") && !str.equals("com.google.android.gms.cast.framework.action.STOP_CASTING") && !str.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                            Intent intent2 = new Intent(str);
                            intent2.setComponent(this.d);
                            a2 = new e0.j(dVar.f44059b, dVar.f44060c, PendingIntent.getBroadcast(context, 0, intent2, y.f3204a)).b();
                        } else {
                            a2 = a(str);
                        }
                        if (a2 != null) {
                            this.f44581f.add(a2);
                        }
                    }
                }
            } else {
                bVar.b("actionsProvider == null", new Object[0]);
                this.f44581f = new ArrayList();
                ArrayList arrayList2 = fVar.f44061a;
                int size3 = arrayList2.size();
                int i13 = 0;
                while (i13 < size3) {
                    Object obj2 = arrayList2.get(i13);
                    i13++;
                    k a12 = a((String) obj2);
                    if (a12 != null) {
                        this.f44581f.add(a12);
                    }
                }
                int[] iArr2 = fVar.f44062b;
                this.f44582g = (int[]) Arrays.copyOf(iArr2, iArr2.length).clone();
            }
            ArrayList arrayList3 = this.f44581f;
            int size4 = arrayList3.size();
            while (i10 < size4) {
                Object obj3 = arrayList3.get(i10);
                i10++;
                k kVar = (k) obj3;
                if (kVar != null) {
                    tVar.f5018b.add(kVar);
                }
            }
            ?? b0Var = new b0();
            b0Var.e = null;
            int[] iArr3 = this.f44582g;
            if (iArr3 != null) {
                b0Var.e = iArr3;
            }
            MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) this.f44585k.e;
            if (mediaSessionCompat$Token != null) {
                b0Var.f47269f = mediaSessionCompat$Token;
            }
            tVar.n(b0Var);
            notificationManager.notify("castMediaNotification", 1, tVar.b());
        }
    }
}
