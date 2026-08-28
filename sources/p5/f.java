package p5;

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
import com.google.android.gms.internal.cast.d1;
import com.google.android.gms.internal.cast.d2;
import com.google.android.gms.internal.cast.z;
import e0.b0;
import e0.j;
import e0.k;
import e0.t;
import f7.w6;
import java.util.ArrayList;
import java.util.Arrays;
import o5.o;
import org.telegram.ui.Cells.e3;
import x5.l;
public final class f {
    public static final q5.b f45462u = new q5.b("MediaNotificationProxy", null);
    public final Context f45463a;
    public final NotificationManager f45464b;
    public final o5.f f45465c;
    public final ComponentName d;
    public final ComponentName f45466e;
    public ArrayList f45467f = new ArrayList();
    public int[] f45468g;
    public final long h;
    public final b3.b f45469i;
    public final Resources f45470j;
    public fe.b f45471k;
    public e3 f45472l;
    public k f45473m;
    public k f45474n;
    public k f45475o;
    public k f45476p;
    public k f45477q;
    public k f45478r;
    public k f45479s;
    public k f45480t;

    public f(Context context) {
        this.f45463a = context;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        this.f45464b = notificationManager;
        q5.b bVar = n5.a.f18449l;
        l.e("Must be called from the main thread.");
        n5.a aVar = n5.a.f18451n;
        l.h(aVar);
        l.e("Must be called from the main thread.");
        n5.b bVar2 = aVar.f18455e;
        l.h(bVar2);
        o5.a aVar2 = bVar2.f18467f;
        l.h(aVar2);
        o5.f fVar = aVar2.d;
        l.h(fVar);
        this.f45465c = fVar;
        aVar2.b();
        Resources resources = context.getResources();
        this.f45470j = resources;
        this.d = new ComponentName(context.getApplicationContext(), aVar2.f18950a);
        String str = fVar.d;
        if (!TextUtils.isEmpty(str)) {
            this.f45466e = new ComponentName(context.getApplicationContext(), str);
        } else {
            this.f45466e = null;
        }
        this.h = fVar.f18974c;
        int dimensionPixelSize = resources.getDimensionPixelSize(fVar.D);
        this.f45469i = new b3.b(context.getApplicationContext(), new o5.b(1, dimensionPixelSize, dimensionPixelSize));
        if (e6.b.d() && notificationManager != null) {
            NotificationChannel notificationChannel = new NotificationChannel("cast_media_notification", context.getResources().getString(2131701391), 2);
            notificationChannel.setShowBadge(false);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        d2.a(d1.CAF_MEDIA_NOTIFICATION_PROXY);
    }

    public final k a(String str) {
        int i9;
        int i10;
        int hashCode = str.hashCode();
        long j10 = this.h;
        PendingIntent pendingIntent = null;
        Resources resources = this.f45470j;
        Context context = this.f45463a;
        ComponentName componentName = this.d;
        o5.f fVar = this.f45465c;
        switch (hashCode) {
            case -1699820260:
                if (str.equals("com.google.android.gms.cast.framework.action.REWIND")) {
                    if (this.f45478r == null) {
                        Intent intent = new Intent("com.google.android.gms.cast.framework.action.REWIND");
                        intent.setComponent(componentName);
                        intent.putExtra("googlecast-extra_skip_step_ms", j10);
                        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, z.f3290a | 134217728);
                        q5.b bVar = i.f45501a;
                        int i11 = (j10 > 10000L ? 1 : (j10 == 10000L ? 0 : -1));
                        int i12 = fVar.f18982y;
                        if (i11 == 0) {
                            i12 = fVar.A;
                        } else if (j10 == 30000) {
                            i12 = fVar.B;
                        }
                        int i13 = fVar.N;
                        if (i11 == 0) {
                            i13 = fVar.O;
                        } else if (j10 == 30000) {
                            i13 = fVar.P;
                        }
                        this.f45478r = new j(i12, resources.getString(i13), broadcast).b();
                    }
                    return this.f45478r;
                }
                break;
            case -945151566:
                if (str.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT")) {
                    boolean z10 = this.f45471k.f6048c;
                    if (this.f45475o == null) {
                        if (z10) {
                            Intent intent2 = new Intent("com.google.android.gms.cast.framework.action.SKIP_NEXT");
                            intent2.setComponent(componentName);
                            pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, z.f3290a);
                        }
                        this.f45475o = new j(fVar.f18978r, resources.getString(fVar.I), pendingIntent).b();
                    }
                    return this.f45475o;
                }
                break;
            case -945080078:
                if (str.equals("com.google.android.gms.cast.framework.action.SKIP_PREV")) {
                    boolean z11 = this.f45471k.d;
                    if (this.f45476p == null) {
                        if (z11) {
                            Intent intent3 = new Intent("com.google.android.gms.cast.framework.action.SKIP_PREV");
                            intent3.setComponent(componentName);
                            pendingIntent = PendingIntent.getBroadcast(context, 0, intent3, z.f3290a);
                        }
                        this.f45476p = new j(fVar.f18979s, resources.getString(fVar.J), pendingIntent).b();
                    }
                    return this.f45476p;
                }
                break;
            case -668151673:
                if (str.equals("com.google.android.gms.cast.framework.action.STOP_CASTING")) {
                    if (this.f45480t == null) {
                        Intent intent4 = new Intent("com.google.android.gms.cast.framework.action.STOP_CASTING");
                        intent4.setComponent(componentName);
                        this.f45480t = new j(fVar.C, resources.getString(fVar.Q), PendingIntent.getBroadcast(context, 0, intent4, z.f3290a)).b();
                    }
                    return this.f45480t;
                }
                break;
            case -124479363:
                if (str.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                    if (this.f45479s == null) {
                        Intent intent5 = new Intent("com.google.android.gms.cast.framework.action.DISCONNECT");
                        intent5.setComponent(componentName);
                        this.f45479s = new j(fVar.C, resources.getString(fVar.Q, ""), PendingIntent.getBroadcast(context, 0, intent5, z.f3290a)).b();
                    }
                    return this.f45479s;
                }
                break;
            case 235550565:
                if (str.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK")) {
                    fe.b bVar2 = this.f45471k;
                    int i14 = bVar2.f6047b;
                    if (bVar2.f6046a) {
                        if (this.f45474n == null) {
                            if (i14 == 2) {
                                i9 = fVar.f18976f;
                                i10 = fVar.F;
                            } else {
                                i9 = fVar.h;
                                i10 = fVar.G;
                            }
                            Intent intent6 = new Intent("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK");
                            intent6.setComponent(componentName);
                            this.f45474n = new j(i9, resources.getString(i10), PendingIntent.getBroadcast(context, 0, intent6, z.f3290a)).b();
                        }
                        return this.f45474n;
                    }
                    if (this.f45473m == null) {
                        Intent intent7 = new Intent("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK");
                        intent7.setComponent(componentName);
                        this.f45473m = new j(fVar.f18977n, resources.getString(fVar.H), PendingIntent.getBroadcast(context, 0, intent7, z.f3290a)).b();
                    }
                    return this.f45473m;
                }
                break;
            case 1362116196:
                if (str.equals("com.google.android.gms.cast.framework.action.FORWARD")) {
                    if (this.f45477q == null) {
                        Intent intent8 = new Intent("com.google.android.gms.cast.framework.action.FORWARD");
                        intent8.setComponent(componentName);
                        intent8.putExtra("googlecast-extra_skip_step_ms", j10);
                        PendingIntent broadcast2 = PendingIntent.getBroadcast(context, 0, intent8, z.f3290a | 134217728);
                        q5.b bVar3 = i.f45501a;
                        int i15 = (j10 > 10000L ? 1 : (j10 == 10000L ? 0 : -1));
                        int i16 = fVar.v;
                        if (i15 == 0) {
                            i16 = fVar.f18980w;
                        } else if (j10 == 30000) {
                            i16 = fVar.f18981x;
                        }
                        int i17 = fVar.K;
                        if (i15 == 0) {
                            i17 = fVar.L;
                        } else if (j10 == 30000) {
                            i17 = fVar.M;
                        }
                        this.f45477q = new j(i16, resources.getString(i17), broadcast2).b();
                    }
                    return this.f45477q;
                }
                break;
        }
        q5.b bVar4 = f45462u;
        Log.e(bVar4.f46009a, bVar4.d("Action: %s is not a pre-defined action.", str));
        return null;
    }

    public final void b() {
        Bitmap bitmap;
        PendingIntent activities;
        int[] iArr;
        k a2;
        NotificationManager notificationManager = this.f45464b;
        if (notificationManager != null && this.f45471k != null) {
            e3 e3Var = this.f45472l;
            if (e3Var == null) {
                bitmap = null;
            } else {
                bitmap = (Bitmap) e3Var.f24287c;
            }
            Context context = this.f45463a;
            t tVar = new t(context, "cast_media_notification");
            tVar.j(bitmap);
            o5.f fVar = this.f45465c;
            tVar.E.icon = fVar.f18975e;
            tVar.f4764e = t.d((String) this.f45471k.f6050f);
            int i9 = 0;
            tVar.f4765f = t.d(this.f45470j.getString(fVar.E, (String) this.f45471k.f6051g));
            tVar.h(2, true);
            tVar.f4769k = false;
            tVar.f4781x = 1;
            ComponentName componentName = this.f45466e;
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
                        for (Intent a3 = w6.a(context, component); a3 != null; a3 = w6.a(context, a3.getComponent())) {
                            arrayList.add(size, a3);
                        }
                    } catch (PackageManager.NameNotFoundException e10) {
                        Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                        throw new IllegalArgumentException(e10);
                    }
                }
                arrayList.add(intent);
                int i10 = z.f3290a | 134217728;
                if (!arrayList.isEmpty()) {
                    Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                    intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                    activities = PendingIntent.getActivities(context, 1, intentArr, i10, null);
                } else {
                    throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
                }
            }
            if (activities != null) {
                tVar.f4766g = activities;
            }
            o oVar = fVar.R;
            q5.b bVar = f45462u;
            if (oVar != null) {
                bVar.b("actionsProvider != null", new Object[0]);
                int[] b10 = i.b(oVar);
                if (b10 == null) {
                    iArr = null;
                } else {
                    iArr = (int[]) b10.clone();
                }
                this.f45468g = iArr;
                ArrayList a10 = i.a(oVar);
                this.f45467f = new ArrayList();
                if (a10 != null) {
                    int size2 = a10.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj = a10.get(i11);
                        i11++;
                        o5.d dVar = (o5.d) obj;
                        String str = dVar.f18969a;
                        if (!str.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK") && !str.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT") && !str.equals("com.google.android.gms.cast.framework.action.SKIP_PREV") && !str.equals("com.google.android.gms.cast.framework.action.FORWARD") && !str.equals("com.google.android.gms.cast.framework.action.REWIND") && !str.equals("com.google.android.gms.cast.framework.action.STOP_CASTING") && !str.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                            Intent intent2 = new Intent(str);
                            intent2.setComponent(this.d);
                            a2 = new j(dVar.f18970b, dVar.f18971c, PendingIntent.getBroadcast(context, 0, intent2, z.f3290a)).b();
                        } else {
                            a2 = a(str);
                        }
                        if (a2 != null) {
                            this.f45467f.add(a2);
                        }
                    }
                }
            } else {
                bVar.b("actionsProvider == null", new Object[0]);
                this.f45467f = new ArrayList();
                ArrayList arrayList2 = fVar.f18972a;
                int size3 = arrayList2.size();
                int i12 = 0;
                while (i12 < size3) {
                    Object obj2 = arrayList2.get(i12);
                    i12++;
                    k a11 = a((String) obj2);
                    if (a11 != null) {
                        this.f45467f.add(a11);
                    }
                }
                int[] iArr2 = fVar.f18973b;
                this.f45468g = (int[]) Arrays.copyOf(iArr2, iArr2.length).clone();
            }
            ArrayList arrayList3 = this.f45467f;
            int size4 = arrayList3.size();
            while (i9 < size4) {
                Object obj3 = arrayList3.get(i9);
                i9++;
                k kVar = (k) obj3;
                if (kVar != null) {
                    tVar.f4762b.add(kVar);
                }
            }
            ?? b0Var = new b0();
            b0Var.f50265e = null;
            int[] iArr3 = this.f45468g;
            if (iArr3 != null) {
                b0Var.f50265e = iArr3;
            }
            MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) this.f45471k.f6049e;
            if (mediaSessionCompat$Token != null) {
                b0Var.f50266f = mediaSessionCompat$Token;
            }
            tVar.n(b0Var);
            notificationManager.notify("castMediaNotification", 1, tVar.b());
        }
    }
}
