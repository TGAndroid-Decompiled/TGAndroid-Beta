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
import com.google.android.gms.internal.cast.c1;
import com.google.android.gms.internal.cast.c2;
import com.google.android.gms.internal.cast.y;
import e0.j;
import e0.k;
import e0.t;
import g7.q6;
import java.util.ArrayList;
import java.util.Arrays;
import o5.o;
import org.telegram.ui.i6;
import y5.l;

public final class f {

    public static final r5.b f45468u = new r5.b("MediaNotificationProxy", null);

    public final Context f45469a;

    public final NotificationManager f45470b;

    public final o5.f f45471c;
    public final ComponentName d;

    public final ComponentName f45472e;

    public ArrayList f45473f = new ArrayList();

    public int[] f45474g;
    public final long h;

    public final af.h f45475i;

    public final Resources f45476j;

    public ge.b f45477k;

    public i6 f45478l;

    public k f45479m;

    public k f45480n;

    public k f45481o;

    public k f45482p;

    public k f45483q;

    public k f45484r;

    public k f45485s;

    public k f45486t;

    public f(Context context) {
        this.f45469a = context;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        this.f45470b = notificationManager;
        r5.b bVar = n5.a.f18276l;
        l.e("Must be called from the main thread.");
        n5.a aVar = n5.a.f18278n;
        l.h(aVar);
        l.e("Must be called from the main thread.");
        n5.b bVar2 = aVar.f18282e;
        l.h(bVar2);
        o5.a aVar2 = bVar2.f18294f;
        l.h(aVar2);
        o5.f fVar = aVar2.d;
        l.h(fVar);
        this.f45471c = fVar;
        aVar2.b();
        Resources resources = context.getResources();
        this.f45476j = resources;
        this.d = new ComponentName(context.getApplicationContext(), aVar2.f19297a);
        String str = fVar.d;
        if (TextUtils.isEmpty(str)) {
            this.f45472e = null;
        } else {
            this.f45472e = new ComponentName(context.getApplicationContext(), str);
        }
        this.h = fVar.f19321c;
        int dimensionPixelSize = resources.getDimensionPixelSize(fVar.D);
        this.f45475i = new af.h(context.getApplicationContext(), new o5.b(1, dimensionPixelSize, dimensionPixelSize));
        if (f6.b.d() && notificationManager != null) {
            NotificationChannel notificationChannel = new NotificationChannel("cast_media_notification", context.getResources().getString(2131701391), 2);
            notificationChannel.setShowBadge(false);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        c2.a(c1.CAF_MEDIA_NOTIFICATION_PROXY);
    }

    public final k a(String str) {
        int i10;
        int i11;
        int iHashCode = str.hashCode();
        long j10 = this.h;
        PendingIntent broadcast = null;
        Resources resources = this.f45476j;
        Context context = this.f45469a;
        ComponentName componentName = this.d;
        o5.f fVar = this.f45471c;
        switch (iHashCode) {
            case -1699820260:
                if (str.equals("com.google.android.gms.cast.framework.action.REWIND")) {
                    if (this.f45484r == null) {
                        Intent intent = new Intent("com.google.android.gms.cast.framework.action.REWIND");
                        intent.setComponent(componentName);
                        intent.putExtra("googlecast-extra_skip_step_ms", j10);
                        PendingIntent broadcast2 = PendingIntent.getBroadcast(context, 0, intent, y.f3714a | 134217728);
                        r5.b bVar = i.f45507a;
                        int i12 = fVar.f19329y;
                        if (j10 == 10000) {
                            i12 = fVar.A;
                        } else if (j10 == 30000) {
                            i12 = fVar.B;
                        }
                        int i13 = fVar.N;
                        if (j10 == 10000) {
                            i13 = fVar.O;
                        } else if (j10 == 30000) {
                            i13 = fVar.P;
                        }
                        this.f45484r = new j(i12, resources.getString(i13), broadcast2).b();
                    }
                    return this.f45484r;
                }
                break;
            case -945151566:
                if (str.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT")) {
                    boolean z10 = this.f45477k.f6848c;
                    if (this.f45481o == null) {
                        if (z10) {
                            Intent intent2 = new Intent("com.google.android.gms.cast.framework.action.SKIP_NEXT");
                            intent2.setComponent(componentName);
                            broadcast = PendingIntent.getBroadcast(context, 0, intent2, y.f3714a);
                        }
                        this.f45481o = new j(fVar.f19325r, resources.getString(fVar.I), broadcast).b();
                    }
                    return this.f45481o;
                }
                break;
            case -945080078:
                if (str.equals("com.google.android.gms.cast.framework.action.SKIP_PREV")) {
                    boolean z11 = this.f45477k.d;
                    if (this.f45482p == null) {
                        if (z11) {
                            Intent intent3 = new Intent("com.google.android.gms.cast.framework.action.SKIP_PREV");
                            intent3.setComponent(componentName);
                            broadcast = PendingIntent.getBroadcast(context, 0, intent3, y.f3714a);
                        }
                        this.f45482p = new j(fVar.f19326s, resources.getString(fVar.J), broadcast).b();
                    }
                    return this.f45482p;
                }
                break;
            case -668151673:
                if (str.equals("com.google.android.gms.cast.framework.action.STOP_CASTING")) {
                    if (this.f45486t == null) {
                        Intent intent4 = new Intent("com.google.android.gms.cast.framework.action.STOP_CASTING");
                        intent4.setComponent(componentName);
                        this.f45486t = new j(fVar.C, resources.getString(fVar.Q), PendingIntent.getBroadcast(context, 0, intent4, y.f3714a)).b();
                    }
                    return this.f45486t;
                }
                break;
            case -124479363:
                if (str.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                    if (this.f45485s == null) {
                        Intent intent5 = new Intent("com.google.android.gms.cast.framework.action.DISCONNECT");
                        intent5.setComponent(componentName);
                        this.f45485s = new j(fVar.C, resources.getString(fVar.Q, ""), PendingIntent.getBroadcast(context, 0, intent5, y.f3714a)).b();
                    }
                    return this.f45485s;
                }
                break;
            case 235550565:
                if (str.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK")) {
                    ge.b bVar2 = this.f45477k;
                    int i14 = bVar2.f6847b;
                    if (!bVar2.f6846a) {
                        if (this.f45479m == null) {
                            Intent intent6 = new Intent("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK");
                            intent6.setComponent(componentName);
                            this.f45479m = new j(fVar.f19324n, resources.getString(fVar.H), PendingIntent.getBroadcast(context, 0, intent6, y.f3714a)).b();
                        }
                        return this.f45479m;
                    }
                    if (this.f45480n == null) {
                        if (i14 == 2) {
                            i10 = fVar.f19323f;
                            i11 = fVar.F;
                        } else {
                            i10 = fVar.h;
                            i11 = fVar.G;
                        }
                        Intent intent7 = new Intent("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK");
                        intent7.setComponent(componentName);
                        this.f45480n = new j(i10, resources.getString(i11), PendingIntent.getBroadcast(context, 0, intent7, y.f3714a)).b();
                    }
                    return this.f45480n;
                }
                break;
            case 1362116196:
                if (str.equals("com.google.android.gms.cast.framework.action.FORWARD")) {
                    if (this.f45483q == null) {
                        Intent intent8 = new Intent("com.google.android.gms.cast.framework.action.FORWARD");
                        intent8.setComponent(componentName);
                        intent8.putExtra("googlecast-extra_skip_step_ms", j10);
                        PendingIntent broadcast3 = PendingIntent.getBroadcast(context, 0, intent8, y.f3714a | 134217728);
                        r5.b bVar3 = i.f45507a;
                        int i15 = fVar.v;
                        if (j10 == 10000) {
                            i15 = fVar.f19327w;
                        } else if (j10 == 30000) {
                            i15 = fVar.f19328x;
                        }
                        int i16 = fVar.K;
                        if (j10 == 10000) {
                            i16 = fVar.L;
                        } else if (j10 == 30000) {
                            i16 = fVar.M;
                        }
                        this.f45483q = new j(i15, resources.getString(i16), broadcast3).b();
                    }
                    return this.f45483q;
                }
                break;
        }
        r5.b bVar4 = f45468u;
        Log.e(bVar4.f46768a, bVar4.d("Action: %s is not a pre-defined action.", str));
        return null;
    }

    public final void b() {
        PendingIntent activities;
        k kVarA;
        NotificationManager notificationManager = this.f45470b;
        if (notificationManager == null || this.f45477k == null) {
            return;
        }
        i6 i6Var = this.f45478l;
        Bitmap bitmap = i6Var == null ? null : (Bitmap) i6Var.f38985c;
        Context context = this.f45469a;
        t tVar = new t(context, "cast_media_notification");
        tVar.j(bitmap);
        o5.f fVar = this.f45471c;
        tVar.E.icon = fVar.f19322e;
        tVar.f5121e = t.d((String) this.f45477k.f6850f);
        int i10 = 0;
        tVar.f5122f = t.d(this.f45476j.getString(fVar.E, (String) this.f45477k.f6851g));
        tVar.h(2, true);
        tVar.f5126k = false;
        tVar.f5138x = 1;
        ComponentName componentName = this.f45472e;
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
                    for (Intent intentA = q6.a(context, component); intentA != null; intentA = q6.a(context, intentA.getComponent())) {
                        arrayList.add(size, intentA);
                    }
                } catch (PackageManager.NameNotFoundException e9) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e9);
                }
            }
            arrayList.add(intent);
            int i11 = y.f3714a | 134217728;
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            activities = PendingIntent.getActivities(context, 1, intentArr, i11, null);
        }
        if (activities != null) {
            tVar.f5123g = activities;
        }
        o oVar = fVar.R;
        r5.b bVar = f45468u;
        if (oVar != null) {
            bVar.b("actionsProvider != null", new Object[0]);
            int[] iArrB = i.b(oVar);
            this.f45474g = iArrB == null ? null : (int[]) iArrB.clone();
            ArrayList arrayListA = i.a(oVar);
            this.f45473f = new ArrayList();
            if (arrayListA != null) {
                int size2 = arrayListA.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj = arrayListA.get(i12);
                    i12++;
                    o5.d dVar = (o5.d) obj;
                    String str = dVar.f19316a;
                    if (str.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK") || str.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT") || str.equals("com.google.android.gms.cast.framework.action.SKIP_PREV") || str.equals("com.google.android.gms.cast.framework.action.FORWARD") || str.equals("com.google.android.gms.cast.framework.action.REWIND") || str.equals("com.google.android.gms.cast.framework.action.STOP_CASTING") || str.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                        kVarA = a(str);
                    } else {
                        Intent intent2 = new Intent(str);
                        intent2.setComponent(this.d);
                        kVarA = new j(dVar.f19317b, dVar.f19318c, PendingIntent.getBroadcast(context, 0, intent2, y.f3714a)).b();
                    }
                    if (kVarA != null) {
                        this.f45473f.add(kVarA);
                    }
                }
            }
        } else {
            bVar.b("actionsProvider == null", new Object[0]);
            this.f45473f = new ArrayList();
            ArrayList arrayList2 = fVar.f19319a;
            int size3 = arrayList2.size();
            int i13 = 0;
            while (i13 < size3) {
                Object obj2 = arrayList2.get(i13);
                i13++;
                k kVarA2 = a((String) obj2);
                if (kVarA2 != null) {
                    this.f45473f.add(kVarA2);
                }
            }
            int[] iArr = fVar.f19320b;
            this.f45474g = (int[]) Arrays.copyOf(iArr, iArr.length).clone();
        }
        ArrayList arrayList3 = this.f45473f;
        int size4 = arrayList3.size();
        while (i10 < size4) {
            Object obj3 = arrayList3.get(i10);
            i10++;
            k kVar = (k) obj3;
            if (kVar != null) {
                tVar.f5119b.add(kVar);
            }
        }
        z1.b bVar2 = new z1.b();
        bVar2.f50165e = null;
        int[] iArr2 = this.f45474g;
        if (iArr2 != null) {
            bVar2.f50165e = iArr2;
        }
        MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) this.f45477k.f6849e;
        if (mediaSessionCompat$Token != null) {
            bVar2.f50166f = mediaSessionCompat$Token;
        }
        tVar.n(bVar2);
        notificationManager.notify("castMediaNotification", 1, tVar.b());
    }
}
