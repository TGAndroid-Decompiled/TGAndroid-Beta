package r5;

import a5.j;
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
import com.google.android.gms.internal.cast.e1;
import com.google.android.gms.internal.cast.e2;
import com.google.android.gms.internal.cast.z;
import e0.b0;
import e0.k;
import e0.t;
import h7.b7;
import java.util.ArrayList;
import java.util.Arrays;
import q5.o;
import z5.l;
public final class f {
    public static final s5.b f47043u = new s5.b("MediaNotificationProxy", null);
    public final Context f47044a;
    public final NotificationManager f47045b;
    public final q5.f f47046c;
    public final ComponentName d;
    public final ComponentName f47047e;
    public ArrayList f47048f = new ArrayList();
    public int[] f47049g;
    public final long h;
    public final j f47050i;
    public final Resources f47051j;
    public ie.b f47052k;
    public oc.i f47053l;
    public k f47054m;
    public k f47055n;
    public k f47056o;
    public k f47057p;
    public k f47058q;
    public k f47059r;
    public k f47060s;
    public k f47061t;

    public f(Context context) {
        this.f47044a = context;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        this.f47045b = notificationManager;
        s5.b bVar = p5.a.f45598l;
        l.e("Must be called from the main thread.");
        p5.a aVar = p5.a.f45600n;
        l.h(aVar);
        l.e("Must be called from the main thread.");
        p5.b bVar2 = aVar.f45604e;
        l.h(bVar2);
        q5.a aVar2 = bVar2.f45615f;
        l.h(aVar2);
        q5.f fVar = aVar2.d;
        l.h(fVar);
        this.f47046c = fVar;
        aVar2.b();
        Resources resources = context.getResources();
        this.f47051j = resources;
        this.d = new ComponentName(context.getApplicationContext(), aVar2.f46357a);
        String str = fVar.d;
        if (!TextUtils.isEmpty(str)) {
            this.f47047e = new ComponentName(context.getApplicationContext(), str);
        } else {
            this.f47047e = null;
        }
        this.h = fVar.f46381c;
        int dimensionPixelSize = resources.getDimensionPixelSize(fVar.D);
        this.f47050i = new j(context.getApplicationContext(), new q5.b(1, dimensionPixelSize, dimensionPixelSize));
        if (g6.b.d() && notificationManager != null) {
            NotificationChannel notificationChannel = new NotificationChannel("cast_media_notification", context.getResources().getString(2131701393), 2);
            notificationChannel.setShowBadge(false);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        e2.a(e1.CAF_MEDIA_NOTIFICATION_PROXY);
    }

    public final k a(String str) {
        int i10;
        int i11;
        int hashCode = str.hashCode();
        long j10 = this.h;
        PendingIntent pendingIntent = null;
        Resources resources = this.f47051j;
        Context context = this.f47044a;
        ComponentName componentName = this.d;
        q5.f fVar = this.f47046c;
        switch (hashCode) {
            case -1699820260:
                if (str.equals("com.google.android.gms.cast.framework.action.REWIND")) {
                    if (this.f47059r == null) {
                        Intent intent = new Intent("com.google.android.gms.cast.framework.action.REWIND");
                        intent.setComponent(componentName);
                        intent.putExtra("googlecast-extra_skip_step_ms", j10);
                        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, z.f4330a | 134217728);
                        s5.b bVar = i.f47082a;
                        int i12 = (j10 > 10000L ? 1 : (j10 == 10000L ? 0 : -1));
                        int i13 = fVar.f46389y;
                        if (i12 == 0) {
                            i13 = fVar.A;
                        } else if (j10 == 30000) {
                            i13 = fVar.B;
                        }
                        int i14 = fVar.N;
                        if (i12 == 0) {
                            i14 = fVar.O;
                        } else if (j10 == 30000) {
                            i14 = fVar.P;
                        }
                        this.f47059r = new e0.j(i13, resources.getString(i14), broadcast).b();
                    }
                    return this.f47059r;
                }
                break;
            case -945151566:
                if (str.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT")) {
                    boolean z10 = this.f47052k.f8885c;
                    if (this.f47056o == null) {
                        if (z10) {
                            Intent intent2 = new Intent("com.google.android.gms.cast.framework.action.SKIP_NEXT");
                            intent2.setComponent(componentName);
                            pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, z.f4330a);
                        }
                        this.f47056o = new e0.j(fVar.f46385r, resources.getString(fVar.I), pendingIntent).b();
                    }
                    return this.f47056o;
                }
                break;
            case -945080078:
                if (str.equals("com.google.android.gms.cast.framework.action.SKIP_PREV")) {
                    boolean z11 = this.f47052k.d;
                    if (this.f47057p == null) {
                        if (z11) {
                            Intent intent3 = new Intent("com.google.android.gms.cast.framework.action.SKIP_PREV");
                            intent3.setComponent(componentName);
                            pendingIntent = PendingIntent.getBroadcast(context, 0, intent3, z.f4330a);
                        }
                        this.f47057p = new e0.j(fVar.f46386s, resources.getString(fVar.J), pendingIntent).b();
                    }
                    return this.f47057p;
                }
                break;
            case -668151673:
                if (str.equals("com.google.android.gms.cast.framework.action.STOP_CASTING")) {
                    if (this.f47061t == null) {
                        Intent intent4 = new Intent("com.google.android.gms.cast.framework.action.STOP_CASTING");
                        intent4.setComponent(componentName);
                        this.f47061t = new e0.j(fVar.C, resources.getString(fVar.Q), PendingIntent.getBroadcast(context, 0, intent4, z.f4330a)).b();
                    }
                    return this.f47061t;
                }
                break;
            case -124479363:
                if (str.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                    if (this.f47060s == null) {
                        Intent intent5 = new Intent("com.google.android.gms.cast.framework.action.DISCONNECT");
                        intent5.setComponent(componentName);
                        this.f47060s = new e0.j(fVar.C, resources.getString(fVar.Q, ""), PendingIntent.getBroadcast(context, 0, intent5, z.f4330a)).b();
                    }
                    return this.f47060s;
                }
                break;
            case 235550565:
                if (str.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK")) {
                    ie.b bVar2 = this.f47052k;
                    int i15 = bVar2.f8884b;
                    if (bVar2.f8883a) {
                        if (this.f47055n == null) {
                            if (i15 == 2) {
                                i10 = fVar.f46383f;
                                i11 = fVar.F;
                            } else {
                                i10 = fVar.h;
                                i11 = fVar.G;
                            }
                            Intent intent6 = new Intent("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK");
                            intent6.setComponent(componentName);
                            this.f47055n = new e0.j(i10, resources.getString(i11), PendingIntent.getBroadcast(context, 0, intent6, z.f4330a)).b();
                        }
                        return this.f47055n;
                    }
                    if (this.f47054m == null) {
                        Intent intent7 = new Intent("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK");
                        intent7.setComponent(componentName);
                        this.f47054m = new e0.j(fVar.f46384n, resources.getString(fVar.H), PendingIntent.getBroadcast(context, 0, intent7, z.f4330a)).b();
                    }
                    return this.f47054m;
                }
                break;
            case 1362116196:
                if (str.equals("com.google.android.gms.cast.framework.action.FORWARD")) {
                    if (this.f47058q == null) {
                        Intent intent8 = new Intent("com.google.android.gms.cast.framework.action.FORWARD");
                        intent8.setComponent(componentName);
                        intent8.putExtra("googlecast-extra_skip_step_ms", j10);
                        PendingIntent broadcast2 = PendingIntent.getBroadcast(context, 0, intent8, z.f4330a | 134217728);
                        s5.b bVar3 = i.f47082a;
                        int i16 = (j10 > 10000L ? 1 : (j10 == 10000L ? 0 : -1));
                        int i17 = fVar.v;
                        if (i16 == 0) {
                            i17 = fVar.f46387w;
                        } else if (j10 == 30000) {
                            i17 = fVar.f46388x;
                        }
                        int i18 = fVar.K;
                        if (i16 == 0) {
                            i18 = fVar.L;
                        } else if (j10 == 30000) {
                            i18 = fVar.M;
                        }
                        this.f47058q = new e0.j(i17, resources.getString(i18), broadcast2).b();
                    }
                    return this.f47058q;
                }
                break;
        }
        s5.b bVar4 = f47043u;
        Log.e(bVar4.f47580a, bVar4.d("Action: %s is not a pre-defined action.", str));
        return null;
    }

    public final void b() {
        Bitmap bitmap;
        PendingIntent activities;
        int[] iArr;
        k a2;
        NotificationManager notificationManager = this.f47045b;
        if (notificationManager != null && this.f47052k != null) {
            oc.i iVar = this.f47053l;
            if (iVar == null) {
                bitmap = null;
            } else {
                bitmap = (Bitmap) iVar.f19484c;
            }
            Context context = this.f47044a;
            t tVar = new t(context, "cast_media_notification");
            tVar.j(bitmap);
            q5.f fVar = this.f47046c;
            tVar.E.icon = fVar.f46382e;
            tVar.f5734e = t.d((String) this.f47052k.f8887f);
            int i10 = 0;
            tVar.f5735f = t.d(this.f47051j.getString(fVar.E, (String) this.f47052k.f8888g));
            tVar.h(2, true);
            tVar.f5739k = false;
            tVar.f5751x = 1;
            ComponentName componentName = this.f47047e;
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
                    } catch (PackageManager.NameNotFoundException e10) {
                        Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                        throw new IllegalArgumentException(e10);
                    }
                }
                arrayList.add(intent);
                int i11 = z.f4330a | 134217728;
                if (!arrayList.isEmpty()) {
                    Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                    intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                    activities = PendingIntent.getActivities(context, 1, intentArr, i11, null);
                } else {
                    throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
                }
            }
            if (activities != null) {
                tVar.f5736g = activities;
            }
            o oVar = fVar.R;
            s5.b bVar = f47043u;
            if (oVar != null) {
                bVar.b("actionsProvider != null", new Object[0]);
                int[] b10 = i.b(oVar);
                if (b10 == null) {
                    iArr = null;
                } else {
                    iArr = (int[]) b10.clone();
                }
                this.f47049g = iArr;
                ArrayList a11 = i.a(oVar);
                this.f47048f = new ArrayList();
                if (a11 != null) {
                    int size2 = a11.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj = a11.get(i12);
                        i12++;
                        q5.d dVar = (q5.d) obj;
                        String str = dVar.f46376a;
                        if (!str.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK") && !str.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT") && !str.equals("com.google.android.gms.cast.framework.action.SKIP_PREV") && !str.equals("com.google.android.gms.cast.framework.action.FORWARD") && !str.equals("com.google.android.gms.cast.framework.action.REWIND") && !str.equals("com.google.android.gms.cast.framework.action.STOP_CASTING") && !str.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                            Intent intent2 = new Intent(str);
                            intent2.setComponent(this.d);
                            a2 = new e0.j(dVar.f46377b, dVar.f46378c, PendingIntent.getBroadcast(context, 0, intent2, z.f4330a)).b();
                        } else {
                            a2 = a(str);
                        }
                        if (a2 != null) {
                            this.f47048f.add(a2);
                        }
                    }
                }
            } else {
                bVar.b("actionsProvider == null", new Object[0]);
                this.f47048f = new ArrayList();
                ArrayList arrayList2 = fVar.f46379a;
                int size3 = arrayList2.size();
                int i13 = 0;
                while (i13 < size3) {
                    Object obj2 = arrayList2.get(i13);
                    i13++;
                    k a12 = a((String) obj2);
                    if (a12 != null) {
                        this.f47048f.add(a12);
                    }
                }
                int[] iArr2 = fVar.f46380b;
                this.f47049g = (int[]) Arrays.copyOf(iArr2, iArr2.length).clone();
            }
            ArrayList arrayList3 = this.f47048f;
            int size4 = arrayList3.size();
            while (i10 < size4) {
                Object obj3 = arrayList3.get(i10);
                i10++;
                k kVar = (k) obj3;
                if (kVar != null) {
                    tVar.f5732b.add(kVar);
                }
            }
            ?? b0Var = new b0();
            b0Var.f50548e = null;
            int[] iArr3 = this.f47049g;
            if (iArr3 != null) {
                b0Var.f50548e = iArr3;
            }
            MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) this.f47052k.f8886e;
            if (mediaSessionCompat$Token != null) {
                b0Var.f50549f = mediaSessionCompat$Token;
            }
            tVar.n(b0Var);
            notificationManager.notify("castMediaNotification", 1, tVar.b());
        }
    }
}
