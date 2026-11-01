package ra;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import j6.l;
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
import kg.s0;
import org.json.JSONException;
import org.json.JSONObject;
import r9.n;
public final class c implements d {
    public static final Object f46471m = new Object();
    public final l9.h f46472a;
    public final ta.c f46473b;
    public final m4.c f46474c;
    public final j d;
    public final n e;
    public final h f46475f;
    public final Object f46476g;
    public final ExecutorService h;
    public final s9.j f46477i;
    public String f46478j;
    public final HashSet f46479k;
    public final ArrayList f46480l;

    static {
        new AtomicInteger(1);
    }

    public c(l9.h hVar, qa.b bVar, ExecutorService executorService, s9.j jVar) {
        hVar.a();
        ta.c cVar = new ta.c(hVar.f11708a, bVar);
        m4.c cVar2 = new m4.c(hVar);
        if (hb.a.d == null) {
            hb.a.d = new hb.a(22);
        }
        hb.a aVar = hb.a.d;
        if (j.d == null) {
            j.d = new j(aVar);
        }
        j jVar2 = j.d;
        n nVar = new n(new r9.c(hVar, 2));
        ?? obj = new Object();
        this.f46476g = new Object();
        this.f46479k = new HashSet();
        this.f46480l = new ArrayList();
        this.f46472a = hVar;
        this.f46473b = cVar;
        this.f46474c = cVar2;
        this.d = jVar2;
        this.e = nVar;
        this.f46475f = obj;
        this.h = executorService;
        this.f46477i = jVar;
    }

    public final void a(i iVar) {
        synchronized (this.f46476g) {
            this.f46480l.add(iVar);
        }
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: ra.c.b():void");
    }

    public final sa.a c(sa.a aVar) {
        int responseCode;
        boolean z10;
        ta.b f7;
        l9.h hVar = this.f46472a;
        hVar.a();
        String str = hVar.f11710c.f11718a;
        String str2 = aVar.f48133a;
        hVar.a();
        String str3 = hVar.f11710c.f11722g;
        String str4 = aVar.d;
        ta.c cVar = this.f46473b;
        ta.d dVar = cVar.f48592c;
        if (dVar.b()) {
            URL a2 = ta.c.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
            for (int i10 = 0; i10 <= 1; i10++) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection c10 = cVar.c(a2, str);
                try {
                    c10.setRequestMethod("POST");
                    c10.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    c10.setDoOutput(true);
                    ta.c.h(c10);
                    responseCode = c10.getResponseCode();
                    dVar.d(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th2) {
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th2;
                }
                if (z10) {
                    f7 = ta.c.f(c10);
                } else {
                    ta.c.b(c10, null, str, str3);
                    if (responseCode != 401 && responseCode != 404) {
                        if (responseCode != 429) {
                            if (responseCode < 500 || responseCode >= 600) {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                a5.a a10 = ta.b.a();
                                a10.f281b = 2;
                                f7 = a10.f();
                            }
                            c10.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        } else {
                            throw new l("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                    } else {
                        a5.a a11 = ta.b.a();
                        a11.f281b = 3;
                        f7 = a11.f();
                    }
                }
                c10.disconnect();
                TrafficStats.clearThreadStatsTag();
                int c11 = m1.j.c(f7.f48589c);
                if (c11 != 0) {
                    if (c11 != 1) {
                        if (c11 == 2) {
                            l(null);
                            s0 a12 = aVar.a();
                            a12.f11264b = 2;
                            return a12.a();
                        }
                        throw new l("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    s0 a13 = aVar.a();
                    a13.h = "BAD CONFIG";
                    a13.f11264b = 5;
                    return a13.a();
                }
                String str5 = f7.f48587a;
                long j10 = f7.f48588b;
                j jVar = this.d;
                jVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                jVar.f46488a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                s0 a14 = aVar.a();
                a14.d = str5;
                a14.f11266f = Long.valueOf(j10);
                a14.f11267g = Long.valueOf(seconds);
                return a14.a();
            }
            throw new l("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new l("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final Task d() {
        String str;
        g();
        synchronized (this) {
            str = this.f46478j;
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

    public final void f(sa.a aVar) {
        synchronized (f46471m) {
            try {
                l9.h hVar = this.f46472a;
                hVar.a();
                m4.c r10 = m4.c.r(hVar.f11708a);
                this.f46474c.K(aVar);
                if (r10 != null) {
                    r10.u0();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g() {
        l9.h hVar = this.f46472a;
        hVar.a();
        n6.l.f(hVar.f11710c.f11719b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        hVar.a();
        n6.l.f(hVar.f11710c.f11722g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        hVar.a();
        n6.l.f(hVar.f11710c.f11718a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        hVar.a();
        String str = hVar.f11710c.f11719b;
        Pattern pattern = j.f46487c;
        n6.l.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        hVar.a();
        n6.l.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", j.f46487c.matcher(hVar.f11710c.f11718a).matches());
    }

    public final java.lang.String h(sa.a r3) {
        throw new UnsupportedOperationException("Method not decompiled: ra.c.h(sa.a):java.lang.String");
    }

    public final sa.a i(sa.a aVar) {
        int responseCode;
        boolean z10;
        String str = aVar.f48133a;
        String str2 = null;
        if (str != null && str.length() == 11) {
            sa.b bVar = (sa.b) this.e.get();
            synchronized (bVar.f48139a) {
                try {
                    String[] strArr = sa.b.f48138c;
                    int i10 = 0;
                    while (true) {
                        if (i10 < 4) {
                            String str3 = strArr[i10];
                            String string = bVar.f48139a.getString("|T|" + bVar.f48140b + "|" + str3, null);
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
                                i10++;
                            }
                        }
                    }
                } finally {
                }
            }
        }
        ta.c cVar = this.f46473b;
        l9.h hVar = this.f46472a;
        hVar.a();
        String str4 = hVar.f11710c.f11718a;
        String str5 = aVar.f48133a;
        l9.h hVar2 = this.f46472a;
        hVar2.a();
        String str6 = hVar2.f11710c.f11722g;
        l9.h hVar3 = this.f46472a;
        hVar3.a();
        String str7 = hVar3.f11710c.f11719b;
        ta.d dVar = cVar.f48592c;
        if (dVar.b()) {
            URL a2 = ta.c.a("projects/" + str6 + "/installations");
            int i11 = 0;
            ta.a aVar2 = cVar;
            while (i11 <= 1) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection c10 = aVar2.c(a2, str4);
                try {
                    try {
                        c10.setRequestMethod("POST");
                        c10.setDoOutput(true);
                        if (str2 != null) {
                            c10.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                        }
                        ta.c.g(c10, str5, str7);
                        responseCode = c10.getResponseCode();
                        dVar.d(responseCode);
                        if (responseCode >= 200 && responseCode < 300) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } catch (IOException | AssertionError unused2) {
                    }
                    if (z10) {
                        ta.a e = ta.c.e(c10);
                        c10.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        aVar2 = e;
                    } else {
                        try {
                            ta.c.b(c10, str7, str4, str6);
                        } catch (IOException | AssertionError unused3) {
                            c10.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i11++;
                            aVar2 = aVar2;
                        }
                        if (responseCode != 429) {
                            if (responseCode >= 500 && responseCode < 600) {
                                c10.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                i11++;
                                aVar2 = aVar2;
                            } else {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                ta.a aVar3 = new ta.a(null, null, null, null, 2);
                                c10.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                aVar2 = aVar3;
                            }
                        } else {
                            throw new l("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                            break;
                        }
                    }
                    int c11 = m1.j.c(aVar2.e);
                    if (c11 != 0) {
                        if (c11 == 1) {
                            s0 a10 = aVar.a();
                            a10.h = "BAD CONFIG";
                            a10.f11264b = 5;
                            return a10.a();
                        }
                        throw new l("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    String str8 = aVar2.f48585b;
                    String str9 = aVar2.f48586c;
                    j jVar = this.d;
                    jVar.getClass();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    jVar.f46488a.getClass();
                    long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                    ta.b bVar2 = aVar2.d;
                    String str10 = bVar2.f48587a;
                    long j10 = bVar2.f48588b;
                    s0 a11 = aVar.a();
                    a11.f11265c = str8;
                    a11.f11264b = 4;
                    a11.d = str10;
                    a11.e = str9;
                    a11.f11266f = Long.valueOf(j10);
                    a11.f11267g = Long.valueOf(seconds);
                    return a11.a();
                } finally {
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            }
            throw new l("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new l("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void j(Exception exc) {
        synchronized (this.f46476g) {
            try {
                Iterator it = this.f46480l.iterator();
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

    public final void k(sa.a aVar) {
        synchronized (this.f46476g) {
            try {
                Iterator it = this.f46480l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).b(aVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized void l(String str) {
        this.f46478j = str;
    }

    public final synchronized void m(sa.a aVar, sa.a aVar2) {
        try {
            if (this.f46479k.size() != 0 && !TextUtils.equals(aVar.f48133a, aVar2.f48133a)) {
                Iterator it = this.f46479k.iterator();
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
