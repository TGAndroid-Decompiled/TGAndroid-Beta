package va;

import ab.b0;
import ab.n;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import c8.ub;
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
import tg.y;
import u9.m;
public final class c implements d {
    public static final Object f59381m = new Object();
    public final o9.g f59382a;
    public final xa.c f59383b;
    public final y f59384c;
    public final j d;
    public final m f59385e;
    public final h f59386f;
    public final Object f59387g;
    public final ExecutorService h;
    public final v9.i f59388i;
    public String f59389j;
    public final HashSet f59390k;
    public final ArrayList f59391l;

    static {
        new AtomicInteger(1);
    }

    public c(o9.g gVar, ua.b bVar, ExecutorService executorService, v9.i iVar) {
        gVar.a();
        xa.c cVar = new xa.c(gVar.f21788a, bVar);
        y yVar = new y(gVar);
        if (z9.a.f61840a == null) {
            z9.a.f61840a = new Object();
        }
        z9.a aVar = z9.a.f61840a;
        if (j.d == null) {
            j.d = new j(aVar);
        }
        j jVar = j.d;
        m mVar = new m(new u9.c(gVar, 2));
        ?? obj = new Object();
        this.f59387g = new Object();
        this.f59390k = new HashSet();
        this.f59391l = new ArrayList();
        this.f59382a = gVar;
        this.f59383b = cVar;
        this.f59384c = yVar;
        this.d = jVar;
        this.f59385e = mVar;
        this.f59386f = obj;
        this.h = executorService;
        this.f59388i = iVar;
    }

    public final void a(i iVar) {
        synchronized (this.f59387g) {
            this.f59391l.add(iVar);
        }
    }

    public final synchronized void b(wa.b bVar, wa.b bVar2) {
        boolean z10;
        boolean z11 = false;
        if (bVar2.f59689b == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        String str = bVar2.f59688a;
        if (z10 && !TextUtils.isEmpty(str)) {
            if (!TextUtils.equals(bVar.f59688a, str)) {
                z11 = true;
            } else {
                if (bVar.f59689b == 4) {
                    z11 = true;
                }
                z11 = !z11;
            }
        }
        if (z11) {
            Iterator it = this.f59390k.iterator();
            while (it.hasNext()) {
                FirebaseMessaging firebaseMessaging = ((n) it.next()).f973a;
                ob.c cVar = FirebaseMessaging.f7588m;
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
        boolean z10;
        String str;
        xa.b bVar2;
        o9.g gVar = this.f59382a;
        gVar.a();
        String str2 = gVar.f21790c.f21800a;
        String str3 = bVar.f59688a;
        gVar.a();
        String str4 = gVar.f21790c.h;
        String str5 = bVar.d;
        xa.c cVar = this.f59383b;
        xa.d dVar = cVar.f60484c;
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
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } catch (IOException | AssertionError unused) {
                    httpURLConnection = c10;
                } catch (Throwable th2) {
                    th = th2;
                    httpURLConnection = c10;
                }
                if (z10) {
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
                            throw new b0("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
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
                int c11 = p1.g.c(bVar2.f60480c);
                if (c11 != 0) {
                    if (c11 != 1) {
                        if (c11 == 2) {
                            m(str);
                            wa.a a11 = bVar.a();
                            a11.f59683b = 2;
                            return a11.a();
                        }
                        throw new b0("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    wa.a a12 = bVar.a();
                    a12.f59687g = "BAD CONFIG";
                    a12.f59683b = 5;
                    return a12.a();
                }
                String str6 = bVar2.f60478a;
                long j3 = bVar2.f60479b;
                j jVar = this.d;
                jVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                jVar.f59399a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                wa.a a13 = bVar.a();
                a13.f59684c = str6;
                a13.f59685e = j3;
                a13.f59686f = seconds;
                a13.h = (byte) (((byte) (a13.h | 1)) | 2);
                return a13.a();
            }
            throw new b0("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new b0("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final Task e() {
        String str;
        h();
        synchronized (this) {
            str = this.f59389j;
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
        synchronized (f59381m) {
            try {
                o9.g gVar = this.f59382a;
                gVar.a();
                y a10 = y.a(gVar.f21788a);
                this.f59384c.d(bVar);
                if (a10 != null) {
                    a10.g();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void h() {
        o9.g gVar = this.f59382a;
        gVar.a();
        q6.m.g(gVar.f21790c.f21801b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        q6.m.g(gVar.f21790c.h, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        q6.m.g(gVar.f21790c.f21800a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        String str = gVar.f21790c.f21801b;
        Pattern pattern = j.f59398c;
        q6.m.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        gVar.a();
        q6.m.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", j.f59398c.matcher(gVar.f21790c.f21800a).matches());
    }

    public final java.lang.String i(wa.b r7) {
        throw new UnsupportedOperationException("Method not decompiled: va.c.i(wa.b):java.lang.String");
    }

    public final wa.b j(wa.b bVar) {
        int responseCode;
        boolean z10;
        xa.a e10;
        String str = bVar.f59688a;
        String str2 = null;
        if (str != null && str.length() == 11) {
            wa.c cVar = (wa.c) this.f59385e.get();
            cVar.getClass();
            String[] strArr = wa.c.f59695e;
            int length = strArr.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    break;
                }
                String str3 = strArr[i7];
                String str4 = (String) cVar.f59696a.b(ub.a("|T|" + cVar.f59697b + "|" + str3), null);
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
        o9.g gVar = this.f59382a;
        gVar.a();
        String str5 = gVar.f21790c.f21800a;
        gVar.a();
        String str6 = gVar.f21790c.h;
        gVar.a();
        String str7 = gVar.f21790c.f21801b;
        xa.c cVar2 = this.f59383b;
        xa.d dVar = cVar2.f60484c;
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
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } catch (IOException | AssertionError unused2) {
                } catch (Throwable th2) {
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th2;
                }
                if (z10) {
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
                        throw new b0("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                }
                int c11 = p1.g.c(e10.f60477e);
                if (c11 != 0) {
                    if (c11 == 1) {
                        wa.a a11 = bVar.a();
                        a11.f59687g = "BAD CONFIG";
                        a11.f59683b = 5;
                        return a11.a();
                    }
                    throw new b0("Firebase Installations Service is unavailable. Please try again later.");
                }
                String str8 = e10.f60475b;
                String str9 = e10.f60476c;
                j jVar = this.d;
                jVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                jVar.f59399a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                xa.b bVar2 = e10.d;
                String str10 = bVar2.f60478a;
                long j3 = bVar2.f60479b;
                wa.a a12 = bVar.a();
                a12.f59682a = str8;
                a12.f59683b = 4;
                a12.f59684c = str10;
                a12.d = str9;
                a12.f59685e = j3;
                a12.f59686f = seconds;
                a12.h = (byte) (((byte) (a12.h | 1)) | 2);
                return a12.a();
            }
            throw new b0("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new b0("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void k(Exception exc) {
        synchronized (this.f59387g) {
            try {
                Iterator it = this.f59391l.iterator();
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
        synchronized (this.f59387g) {
            try {
                Iterator it = this.f59391l.iterator();
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
        this.f59389j = str;
    }
}
