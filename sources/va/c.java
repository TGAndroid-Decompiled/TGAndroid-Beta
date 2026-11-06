package va;

import ab.a0;
import ab.d0;
import ab.n;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import c8.pb;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import u9.m;
public final class c implements d {
    public static final Object f57196m = new Object();
    public final o9.g f57197a;
    public final xa.c f57198b;
    public final v6.e f57199c;
    public final j d;
    public final m f57200e;
    public final h f57201f;
    public final Object f57202g;
    public final ExecutorService h;
    public final v9.i f57203i;
    public String f57204j;
    public final HashSet f57205k;
    public final ArrayList f57206l;

    static {
        new AtomicInteger(1);
    }

    public c(o9.g gVar, ua.b bVar, ExecutorService executorService, v9.i iVar) {
        gVar.a();
        xa.c cVar = new xa.c(gVar.f20872a, bVar);
        ?? obj = new Object();
        obj.f57153b = gVar;
        if (sa.d.f54900b == null) {
            sa.d.f54900b = new sa.d(28);
        }
        sa.d dVar = sa.d.f54900b;
        if (j.d == null) {
            j.d = new j(dVar);
        }
        j jVar = j.d;
        m mVar = new m(new u9.c(gVar, 2));
        ?? obj2 = new Object();
        this.f57202g = new Object();
        this.f57205k = new HashSet();
        this.f57206l = new ArrayList();
        this.f57197a = gVar;
        this.f57198b = cVar;
        this.f57199c = obj;
        this.d = jVar;
        this.f57200e = mVar;
        this.f57201f = obj2;
        this.h = executorService;
        this.f57203i = iVar;
    }

    public final void a(i iVar) {
        synchronized (this.f57202g) {
            this.f57206l.add(iVar);
        }
    }

    public final synchronized void b(wa.b bVar, wa.b bVar2) {
        boolean z9;
        boolean z10 = false;
        if (bVar2.f57537b == 4) {
            z9 = true;
        } else {
            z9 = false;
        }
        String str = bVar2.f57536a;
        if (z9 && !TextUtils.isEmpty(str)) {
            if (!TextUtils.equals(bVar.f57536a, str)) {
                z10 = true;
            } else {
                if (bVar.f57537b == 4) {
                    z10 = true;
                }
                z10 = !z10;
            }
        }
        if (z10) {
            Iterator it = this.f57205k.iterator();
            while (it.hasNext()) {
                FirebaseMessaging firebaseMessaging = ((n) it.next()).f975a;
                d0 d0Var = FirebaseMessaging.f7886m;
                if (firebaseMessaging.d() != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "FID Change detected! Triggering re-sync");
                    }
                    firebaseMessaging.h();
                }
            }
        }
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: va.c.c():void");
    }

    public final wa.b d(wa.b bVar) {
        HttpURLConnection httpURLConnection;
        int responseCode;
        boolean z9;
        String str;
        xa.b bVar2;
        o9.g gVar = this.f57197a;
        gVar.a();
        String str2 = gVar.f20874c.f20884a;
        String str3 = bVar.f57536a;
        gVar.a();
        String str4 = gVar.f20874c.h;
        String str5 = bVar.d;
        xa.c cVar = this.f57198b;
        xa.d dVar = cVar.f58583c;
        if (dVar.b()) {
            URL a10 = xa.c.a("projects/" + str4 + "/installations/" + str3 + "/authTokens:generate");
            for (int i7 = 0; i7 <= 1; i7++) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection c10 = cVar.c(a10, str2);
                try {
                    c10.setRequestMethod("POST");
                    c10.addRequestProperty("Authorization", "FIS_v2 " + str5);
                    c10.setDoOutput(true);
                    xa.c.h(c10);
                    responseCode = c10.getResponseCode();
                    dVar.d(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                } catch (IOException | AssertionError unused) {
                    httpURLConnection = c10;
                } catch (Throwable th2) {
                    th = th2;
                    httpURLConnection = c10;
                }
                if (z9) {
                    bVar2 = xa.c.f(c10);
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    str = null;
                } else {
                    xa.c.b(c10, null, str2, str4);
                    httpURLConnection = c10;
                    try {
                    } catch (IOException | AssertionError unused2) {
                    } catch (Throwable th3) {
                        th = th3;
                        httpURLConnection.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        throw th;
                    }
                    if (responseCode != 401 && responseCode != 404) {
                        if (responseCode != 429) {
                            if (responseCode < 500 || responseCode >= 600) {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                if (((byte) (0 | 1)) == 1) {
                                    xa.b bVar3 = new xa.b(null, 0L, 2);
                                    httpURLConnection.disconnect();
                                    TrafficStats.clearThreadStatsTag();
                                    bVar2 = bVar3;
                                    str = null;
                                } else {
                                    throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                                }
                            }
                            httpURLConnection.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        } else {
                            throw new a0("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                    } else if (((byte) (0 | 1)) == 1) {
                        str = null;
                        xa.b bVar4 = new xa.b(null, 0L, 3);
                        httpURLConnection.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        bVar2 = bVar4;
                    } else {
                        throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                    }
                }
                int c11 = p1.g.c(bVar2.f58579c);
                if (c11 != 0) {
                    if (c11 != 1) {
                        if (c11 == 2) {
                            m(str);
                            wa.a a11 = bVar.a();
                            a11.f57531b = 2;
                            return a11.a();
                        }
                        throw new a0("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    wa.a a12 = bVar.a();
                    a12.f57535g = "BAD CONFIG";
                    a12.f57531b = 5;
                    return a12.a();
                }
                String str6 = bVar2.f58577a;
                long j3 = bVar2.f58578b;
                j jVar = this.d;
                jVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                jVar.f57214a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                wa.a a13 = bVar.a();
                a13.f57532c = str6;
                a13.f57533e = j3;
                a13.f57534f = seconds;
                a13.h = (byte) (((byte) (a13.h | 1)) | 2);
                return a13.a();
            }
            throw new a0("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new a0("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final Task e() {
        String str;
        h();
        synchronized (this) {
            str = this.f57204j;
        }
        if (str != null) {
            return Tasks.forResult(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        a(new g(taskCompletionSource));
        Task task = taskCompletionSource.getTask();
        this.h.execute(new b(this, 0));
        return task;
    }

    public final Task f() {
        h();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        a(new f(this.d, taskCompletionSource));
        Task task = taskCompletionSource.getTask();
        this.h.execute(new b(this, 1));
        return task;
    }

    public final void g(wa.b bVar) {
        synchronized (f57196m) {
            try {
                o9.g gVar = this.f57197a;
                gVar.a();
                v6.e a10 = v6.e.a(gVar.f20872a);
                this.f57199c.c(bVar);
                if (a10 != null) {
                    a10.e();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void h() {
        o9.g gVar = this.f57197a;
        gVar.a();
        q6.m.f(gVar.f20874c.f20885b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        q6.m.f(gVar.f20874c.h, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        q6.m.f(gVar.f20874c.f20884a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        String str = gVar.f20874c.f20885b;
        Pattern pattern = j.f57213c;
        q6.m.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        gVar.a();
        q6.m.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", j.f57213c.matcher(gVar.f20874c.f20884a).matches());
    }

    public final java.lang.String i(wa.b r7) {
        throw new UnsupportedOperationException("Method not decompiled: va.c.i(wa.b):java.lang.String");
    }

    public final wa.b j(wa.b bVar) {
        int responseCode;
        boolean z9;
        xa.a e10;
        String str = bVar.f57536a;
        String str2 = null;
        if (str != null && str.length() == 11) {
            wa.c cVar = (wa.c) this.f57200e.get();
            cVar.getClass();
            String[] strArr = wa.c.f57543e;
            int length = strArr.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    break;
                }
                String str3 = strArr[i7];
                String str4 = (String) cVar.f57544a.b(pb.a("|T|" + cVar.f57545b + "|" + str3), null);
                if (str4 != null && !str4.isEmpty()) {
                    if (str4.startsWith("{")) {
                        try {
                            str2 = new JSONObject(str4).getString("token");
                        } catch (JSONException unused) {
                        }
                    } else {
                        str2 = str4;
                    }
                } else {
                    i7++;
                }
            }
        }
        o9.g gVar = this.f57197a;
        gVar.a();
        String str5 = gVar.f20874c.f20884a;
        gVar.a();
        String str6 = gVar.f20874c.h;
        gVar.a();
        String str7 = gVar.f20874c.f20885b;
        xa.c cVar2 = this.f57198b;
        xa.d dVar = cVar2.f58583c;
        if (dVar.b()) {
            URL a10 = xa.c.a("projects/" + str6 + "/installations");
            for (int i10 = 0; i10 <= 1; i10++) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection c10 = cVar2.c(a10, str5);
                try {
                    c10.setRequestMethod("POST");
                    c10.setDoOutput(true);
                    if (str2 != null) {
                        c10.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                    }
                    xa.c.g(c10, str, str7);
                    responseCode = c10.getResponseCode();
                    dVar.d(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                } catch (IOException | AssertionError unused2) {
                } catch (Throwable th2) {
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th2;
                }
                if (z9) {
                    e10 = xa.c.e(c10);
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                } else {
                    xa.c.b(c10, str7, str5, str6);
                    if (responseCode != 429) {
                        if (responseCode < 500 || responseCode >= 600) {
                            Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                            xa.a aVar = new xa.a(null, null, null, null, 2);
                            c10.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            e10 = aVar;
                        }
                        c10.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    } else {
                        throw new a0("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                }
                int c11 = p1.g.c(e10.f58576e);
                if (c11 != 0) {
                    if (c11 == 1) {
                        wa.a a11 = bVar.a();
                        a11.f57535g = "BAD CONFIG";
                        a11.f57531b = 5;
                        return a11.a();
                    }
                    throw new a0("Firebase Installations Service is unavailable. Please try again later.");
                }
                String str8 = e10.f58574b;
                String str9 = e10.f58575c;
                j jVar = this.d;
                jVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                jVar.f57214a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                xa.b bVar2 = e10.d;
                String str10 = bVar2.f58577a;
                long j3 = bVar2.f58578b;
                wa.a a12 = bVar.a();
                a12.f57530a = str8;
                a12.f57531b = 4;
                a12.f57532c = str10;
                a12.d = str9;
                a12.f57533e = j3;
                a12.f57534f = seconds;
                a12.h = (byte) (((byte) (a12.h | 1)) | 2);
                return a12.a();
            }
            throw new a0("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new a0("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void k(Exception exc) {
        synchronized (this.f57202g) {
            try {
                Iterator it = this.f57206l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void l(wa.b bVar) {
        synchronized (this.f57202g) {
            try {
                Iterator it = this.f57206l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).b(bVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized void m(String str) {
        this.f57204j = str;
    }
}
