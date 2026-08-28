package y9;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.s;
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
import x5.l;
import y8.n;
public final class c implements d {
    public static final Object f49663m = new Object();
    public final s8.h f49664a;
    public final aa.c f49665b;
    public final w4.e f49666c;
    public final j d;
    public final n f49667e;
    public final h f49668f;
    public final Object f49669g;
    public final ExecutorService h;
    public final z8.i f49670i;
    public String f49671j;
    public final HashSet f49672k;
    public final ArrayList f49673l;

    static {
        new AtomicInteger(1);
    }

    public c(s8.h hVar, x9.b bVar, ExecutorService executorService, z8.i iVar) {
        hVar.a();
        aa.c cVar = new aa.c(hVar.f47470a, bVar);
        w4.e eVar = new w4.e(hVar);
        if (ya.b.f49684b == null) {
            ya.b.f49684b = new ya.b(3);
        }
        ya.b bVar2 = ya.b.f49684b;
        if (j.d == null) {
            j.d = new j(bVar2);
        }
        j jVar = j.d;
        n nVar = new n(new y8.c(hVar, 2));
        ?? obj = new Object();
        this.f49669g = new Object();
        this.f49672k = new HashSet();
        this.f49673l = new ArrayList();
        this.f49664a = hVar;
        this.f49665b = cVar;
        this.f49666c = eVar;
        this.d = jVar;
        this.f49667e = nVar;
        this.f49668f = obj;
        this.h = executorService;
        this.f49670i = iVar;
    }

    public final void a(i iVar) {
        synchronized (this.f49669g) {
            this.f49673l.add(iVar);
        }
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: y9.c.b():void");
    }

    public final z9.a c(z9.a aVar) {
        int responseCode;
        boolean z10;
        aa.b f10;
        s8.h hVar = this.f49664a;
        hVar.a();
        String str = hVar.f47472c.f47482a;
        String str2 = aVar.f50387a;
        hVar.a();
        String str3 = hVar.f47472c.f47487g;
        String str4 = aVar.d;
        aa.c cVar = this.f49665b;
        aa.e eVar = cVar.f134c;
        if (eVar.b()) {
            URL a2 = aa.c.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
            for (int i9 = 0; i9 <= 1; i9++) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection c10 = cVar.c(a2, str);
                try {
                    c10.setRequestMethod("POST");
                    c10.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    c10.setDoOutput(true);
                    aa.c.h(c10);
                    responseCode = c10.getResponseCode();
                    eVar.d(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th) {
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
                if (z10) {
                    f10 = aa.c.f(c10);
                } else {
                    aa.c.b(c10, null, str, str3);
                    if (responseCode != 401 && responseCode != 404) {
                        if (responseCode != 429) {
                            if (responseCode < 500 || responseCode >= 600) {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                a6.a a3 = aa.b.a();
                                a3.f102c = 2;
                                f10 = a3.b();
                            }
                            c10.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        } else {
                            throw new s("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                    } else {
                        a6.a a10 = aa.b.a();
                        a10.f102c = 3;
                        f10 = a10.b();
                    }
                }
                c10.disconnect();
                TrafficStats.clearThreadStatsTag();
                int b10 = m1.j.b(f10.f130c);
                if (b10 != 0) {
                    if (b10 != 1) {
                        if (b10 == 2) {
                            l(null);
                            f2.b a11 = aVar.a();
                            a11.f5316b = 2;
                            return a11.a();
                        }
                        throw new s("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    f2.b a12 = aVar.a();
                    a12.h = "BAD CONFIG";
                    a12.f5316b = 5;
                    return a12.a();
                }
                String str5 = f10.f128a;
                long j10 = f10.f129b;
                j jVar = this.d;
                jVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                jVar.f49681a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                f2.b a13 = aVar.a();
                a13.d = str5;
                a13.f5319f = Long.valueOf(j10);
                a13.f5320g = Long.valueOf(seconds);
                return a13.a();
            }
            throw new s("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new s("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final Task d() {
        String str;
        g();
        synchronized (this) {
            str = this.f49671j;
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

    public final Task e() {
        g();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        a(new f(this.d, taskCompletionSource));
        Task task = taskCompletionSource.getTask();
        this.h.execute(new b(this, 2));
        return task;
    }

    public final void f(z9.a aVar) {
        synchronized (f49663m) {
            try {
                s8.h hVar = this.f49664a;
                hVar.a();
                w4.e a2 = w4.e.a(hVar.f47470a);
                this.f49666c.j(aVar);
                if (a2 != null) {
                    a2.l();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        s8.h hVar = this.f49664a;
        hVar.a();
        l.g(hVar.f47472c.f47483b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        hVar.a();
        l.g(hVar.f47472c.f47487g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        hVar.a();
        l.g(hVar.f47472c.f47482a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        hVar.a();
        String str = hVar.f47472c.f47483b;
        Pattern pattern = j.f49680c;
        l.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        hVar.a();
        l.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", j.f49680c.matcher(hVar.f47472c.f47482a).matches());
    }

    public final java.lang.String h(z9.a r3) {
        throw new UnsupportedOperationException("Method not decompiled: y9.c.h(z9.a):java.lang.String");
    }

    public final z9.a i(z9.a aVar) {
        int responseCode;
        boolean z10;
        String str = aVar.f50387a;
        String str2 = null;
        if (str != null && str.length() == 11) {
            z9.b bVar = (z9.b) this.f49667e.get();
            synchronized (bVar.f50394a) {
                try {
                    String[] strArr = z9.b.f50393c;
                    int i9 = 0;
                    while (true) {
                        if (i9 < 4) {
                            String str3 = strArr[i9];
                            String str4 = bVar.f50395b;
                            String string = bVar.f50394a.getString("|T|" + str4 + "|" + str3, null);
                            if (string != null && !string.isEmpty()) {
                                if (string.startsWith("{")) {
                                    try {
                                        str2 = new JSONObject(string).getString("token");
                                    } catch (JSONException unused) {
                                    }
                                } else {
                                    str2 = string;
                                }
                            } else {
                                i9++;
                            }
                        }
                    }
                } finally {
                }
            }
        }
        aa.c cVar = this.f49665b;
        s8.h hVar = this.f49664a;
        hVar.a();
        String str5 = hVar.f47472c.f47482a;
        String str6 = aVar.f50387a;
        s8.h hVar2 = this.f49664a;
        hVar2.a();
        String str7 = hVar2.f47472c.f47487g;
        s8.h hVar3 = this.f49664a;
        hVar3.a();
        String str8 = hVar3.f47472c.f47483b;
        aa.e eVar = cVar.f134c;
        if (eVar.b()) {
            URL a2 = aa.c.a("projects/" + str7 + "/installations");
            int i10 = 0;
            aa.a aVar2 = cVar;
            while (i10 <= 1) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection c10 = aVar2.c(a2, str5);
                try {
                    try {
                        c10.setRequestMethod("POST");
                        c10.setDoOutput(true);
                        if (str2 != null) {
                            c10.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                        }
                        aa.c.g(c10, str6, str8);
                        responseCode = c10.getResponseCode();
                        eVar.d(responseCode);
                        if (responseCode >= 200 && responseCode < 300) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } catch (IOException | AssertionError unused2) {
                    }
                    if (z10) {
                        aa.a e10 = aa.c.e(c10);
                        c10.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        aVar2 = e10;
                    } else {
                        try {
                            aa.c.b(c10, str8, str5, str7);
                        } catch (IOException | AssertionError unused3) {
                            c10.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i10++;
                            aVar2 = aVar2;
                        }
                        if (responseCode != 429) {
                            if (responseCode >= 500 && responseCode < 600) {
                                c10.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                i10++;
                                aVar2 = aVar2;
                            } else {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                aa.a aVar3 = new aa.a(null, null, null, null, 2);
                                c10.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                aVar2 = aVar3;
                            }
                        } else {
                            throw new s("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                            break;
                        }
                    }
                    int b10 = m1.j.b(aVar2.f127e);
                    if (b10 != 0) {
                        if (b10 == 1) {
                            f2.b a3 = aVar.a();
                            a3.h = "BAD CONFIG";
                            a3.f5316b = 5;
                            return a3.a();
                        }
                        throw new s("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    String str9 = aVar2.f125b;
                    String str10 = aVar2.f126c;
                    j jVar = this.d;
                    jVar.getClass();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    jVar.f49681a.getClass();
                    long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                    aa.b bVar2 = aVar2.d;
                    String str11 = bVar2.f128a;
                    long j10 = bVar2.f129b;
                    f2.b a10 = aVar.a();
                    a10.f5317c = str9;
                    a10.f5316b = 4;
                    a10.d = str11;
                    a10.f5318e = str10;
                    a10.f5319f = Long.valueOf(j10);
                    a10.f5320g = Long.valueOf(seconds);
                    return a10.a();
                } finally {
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            }
            throw new s("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new s("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void j(Exception exc) {
        synchronized (this.f49669g) {
            try {
                Iterator it = this.f49673l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).b(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(z9.a aVar) {
        synchronized (this.f49669g) {
            try {
                Iterator it = this.f49673l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).a(aVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void l(String str) {
        this.f49671j = str;
    }

    public final synchronized void m(z9.a aVar, z9.a aVar2) {
        try {
            if (this.f49672k.size() != 0 && !TextUtils.equals(aVar.f50387a, aVar2.f50387a)) {
                Iterator it = this.f49672k.iterator();
                if (it.hasNext()) {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                }
            }
        } finally {
        }
    }
}
