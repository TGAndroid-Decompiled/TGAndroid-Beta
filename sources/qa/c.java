package qa;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import cc.k;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
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
import n6.l;
import n7.a1;
import org.json.JSONException;
import org.json.JSONObject;
import q9.n;
import qg.m0;
import t7.u;
public final class c implements d {
    public static final Object f40590m = new Object();
    public final k9.h f40591a;
    public final sa.c f40592b;
    public final a1 f40593c;
    public final j d;
    public final n e;
    public final h f40594f;
    public final Object f40595g;
    public final ExecutorService h;
    public final r9.i f40596i;
    public String f40597j;
    public final HashSet f40598k;
    public final ArrayList f40599l;

    static {
        new AtomicInteger(1);
    }

    public c(k9.h hVar, pa.b bVar, ExecutorService executorService, r9.i iVar) {
        hVar.a();
        sa.c cVar = new sa.c(hVar.f12392a, bVar);
        a1 a1Var = new a1(hVar, 15);
        if (u.f42106b == null) {
            u.f42106b = new Object();
        }
        u uVar = u.f42106b;
        if (j.d == null) {
            j.d = new j(uVar);
        }
        j jVar = j.d;
        n nVar = new n(new q9.c(hVar, 2));
        ?? obj = new Object();
        this.f40595g = new Object();
        this.f40598k = new HashSet();
        this.f40599l = new ArrayList();
        this.f40591a = hVar;
        this.f40592b = cVar;
        this.f40593c = a1Var;
        this.d = jVar;
        this.e = nVar;
        this.f40594f = obj;
        this.h = executorService;
        this.f40596i = iVar;
    }

    public final void a(i iVar) {
        synchronized (this.f40595g) {
            this.f40599l.add(iVar);
        }
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: qa.c.b():void");
    }

    public final ra.a c(ra.a aVar) {
        int responseCode;
        boolean z10;
        sa.b f7;
        k9.h hVar = this.f40591a;
        hVar.a();
        String str = hVar.f12394c.f12402a;
        String str2 = aVar.f41392a;
        hVar.a();
        String str3 = hVar.f12394c.f12406g;
        String str4 = aVar.d;
        sa.c cVar = this.f40592b;
        sa.d dVar = cVar.f41823c;
        if (dVar.b()) {
            URL a2 = sa.c.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
            for (int i10 = 0; i10 <= 1; i10++) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection c10 = cVar.c(a2, str);
                try {
                    c10.setRequestMethod("POST");
                    c10.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    c10.setDoOutput(true);
                    sa.c.h(c10);
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
                    f7 = sa.c.f(c10);
                } else {
                    sa.c.b(c10, null, str, str3);
                    if (responseCode != 401 && responseCode != 404) {
                        if (responseCode != 429) {
                            if (responseCode < 500 || responseCode >= 600) {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                a5.a a10 = sa.b.a();
                                a10.f275b = 2;
                                f7 = a10.b();
                            }
                            c10.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        } else {
                            throw new k("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                    } else {
                        a5.a a11 = sa.b.a();
                        a11.f275b = 3;
                        f7 = a11.b();
                    }
                }
                c10.disconnect();
                TrafficStats.clearThreadStatsTag();
                int c11 = m1.j.c(f7.f41820c);
                if (c11 != 0) {
                    if (c11 != 1) {
                        if (c11 == 2) {
                            l(null);
                            m0 a12 = aVar.a();
                            a12.f40808b = 2;
                            return a12.a();
                        }
                        throw new k("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    m0 a13 = aVar.a();
                    a13.h = "BAD CONFIG";
                    a13.f40808b = 5;
                    return a13.a();
                }
                String str5 = f7.f41818a;
                long j3 = f7.f41819b;
                j jVar = this.d;
                jVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                jVar.f40607a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                m0 a14 = aVar.a();
                a14.d = str5;
                a14.f40810f = Long.valueOf(j3);
                a14.f40811g = Long.valueOf(seconds);
                return a14.a();
            }
            throw new k("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new k("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final Task d() {
        String str;
        g();
        synchronized (this) {
            str = this.f40597j;
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

    public final void f(ra.a aVar) {
        synchronized (f40590m) {
            try {
                k9.h hVar = this.f40591a;
                hVar.a();
                a1 h = a1.h(hVar.f12392a);
                this.f40593c.V(aVar);
                if (h != null) {
                    h.j0();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g() {
        k9.h hVar = this.f40591a;
        hVar.a();
        l.g(hVar.f12394c.f12403b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        hVar.a();
        l.g(hVar.f12394c.f12406g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        hVar.a();
        l.g(hVar.f12394c.f12402a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        hVar.a();
        String str = hVar.f12394c.f12403b;
        Pattern pattern = j.f40606c;
        l.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        hVar.a();
        l.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", j.f40606c.matcher(hVar.f12394c.f12402a).matches());
    }

    public final java.lang.String h(ra.a r3) {
        throw new UnsupportedOperationException("Method not decompiled: qa.c.h(ra.a):java.lang.String");
    }

    public final ra.a i(ra.a aVar) {
        int responseCode;
        boolean z10;
        String str = aVar.f41392a;
        String str2 = null;
        if (str != null && str.length() == 11) {
            ra.b bVar = (ra.b) this.e.get();
            synchronized (bVar.f41398a) {
                try {
                    String[] strArr = ra.b.f41397c;
                    int i10 = 0;
                    while (true) {
                        if (i10 < 4) {
                            String str3 = strArr[i10];
                            String str4 = bVar.f41399b;
                            String string = bVar.f41398a.getString("|T|" + str4 + "|" + str3, null);
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
        sa.c cVar = this.f40592b;
        k9.h hVar = this.f40591a;
        hVar.a();
        String str5 = hVar.f12394c.f12402a;
        String str6 = aVar.f41392a;
        k9.h hVar2 = this.f40591a;
        hVar2.a();
        String str7 = hVar2.f12394c.f12406g;
        k9.h hVar3 = this.f40591a;
        hVar3.a();
        String str8 = hVar3.f12394c.f12403b;
        sa.d dVar = cVar.f41823c;
        if (dVar.b()) {
            URL a2 = sa.c.a("projects/" + str7 + "/installations");
            int i11 = 0;
            sa.a aVar2 = cVar;
            while (i11 <= 1) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection c10 = aVar2.c(a2, str5);
                try {
                    try {
                        c10.setRequestMethod("POST");
                        c10.setDoOutput(true);
                        if (str2 != null) {
                            c10.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                        }
                        sa.c.g(c10, str6, str8);
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
                        sa.a e = sa.c.e(c10);
                        c10.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        aVar2 = e;
                    } else {
                        try {
                            sa.c.b(c10, str8, str5, str7);
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
                                sa.a aVar3 = new sa.a(null, null, null, null, 2);
                                c10.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                aVar2 = aVar3;
                            }
                        } else {
                            throw new k("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                            break;
                        }
                    }
                    int c11 = m1.j.c(aVar2.e);
                    if (c11 != 0) {
                        if (c11 == 1) {
                            m0 a10 = aVar.a();
                            a10.h = "BAD CONFIG";
                            a10.f40808b = 5;
                            return a10.a();
                        }
                        throw new k("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    String str9 = aVar2.f41816b;
                    String str10 = aVar2.f41817c;
                    j jVar = this.d;
                    jVar.getClass();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    jVar.f40607a.getClass();
                    long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                    sa.b bVar2 = aVar2.d;
                    String str11 = bVar2.f41818a;
                    long j3 = bVar2.f41819b;
                    m0 a11 = aVar.a();
                    a11.f40809c = str9;
                    a11.f40808b = 4;
                    a11.d = str11;
                    a11.e = str10;
                    a11.f40810f = Long.valueOf(j3);
                    a11.f40811g = Long.valueOf(seconds);
                    return a11.a();
                } finally {
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            }
            throw new k("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new k("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void j(Exception exc) {
        synchronized (this.f40595g) {
            try {
                Iterator it = this.f40599l.iterator();
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

    public final void k(ra.a aVar) {
        synchronized (this.f40595g) {
            try {
                Iterator it = this.f40599l.iterator();
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
        this.f40597j = str;
    }

    public final synchronized void m(ra.a aVar, ra.a aVar2) {
        try {
            if (this.f40598k.size() != 0 && !TextUtils.equals(aVar.f41392a, aVar2.f41392a)) {
                Iterator it = this.f40598k.iterator();
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
