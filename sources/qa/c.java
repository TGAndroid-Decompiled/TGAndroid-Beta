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
import n6.t;
import org.json.JSONException;
import org.json.JSONObject;
import q9.n;
public final class c implements d {
    public static final Object f46092m = new Object();
    public final k9.h f46093a;
    public final sa.c f46094b;
    public final t f46095c;
    public final j d;
    public final n f46096e;
    public final h f46097f;
    public final Object f46098g;
    public final ExecutorService h;
    public final r9.i f46099i;
    public String f46100j;
    public final HashSet f46101k;
    public final ArrayList f46102l;

    static {
        new AtomicInteger(1);
    }

    public c(k9.h hVar, pa.b bVar, ExecutorService executorService, r9.i iVar) {
        hVar.a();
        sa.c cVar = new sa.c(hVar.f14747a, bVar);
        t tVar = new t(hVar);
        if (ob.a.f17105b == null) {
            ob.a.f17105b = new ob.a(23);
        }
        ob.a aVar = ob.a.f17105b;
        if (j.d == null) {
            j.d = new j(aVar);
        }
        j jVar = j.d;
        n nVar = new n(new q9.c(hVar, 2));
        ?? obj = new Object();
        this.f46098g = new Object();
        this.f46101k = new HashSet();
        this.f46102l = new ArrayList();
        this.f46093a = hVar;
        this.f46094b = cVar;
        this.f46095c = tVar;
        this.d = jVar;
        this.f46096e = nVar;
        this.f46097f = obj;
        this.h = executorService;
        this.f46099i = iVar;
    }

    public final void a(i iVar) {
        synchronized (this.f46098g) {
            this.f46102l.add(iVar);
        }
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: qa.c.b():void");
    }

    public final ra.b c(ra.b bVar) {
        int responseCode;
        boolean z10;
        sa.b f7;
        k9.h hVar = this.f46093a;
        hVar.a();
        String str = hVar.f14749c.f14759a;
        String str2 = bVar.f47178a;
        hVar.a();
        String str3 = hVar.f14749c.f14764g;
        String str4 = bVar.d;
        sa.c cVar = this.f46094b;
        sa.d dVar = cVar.f47926c;
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
                                a10.f299b = 2;
                                f7 = a10.e();
                            }
                            c10.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        } else {
                            throw new k("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                    } else {
                        a5.a a11 = sa.b.a();
                        a11.f299b = 3;
                        f7 = a11.e();
                    }
                }
                c10.disconnect();
                TrafficStats.clearThreadStatsTag();
                int c11 = m1.j.c(f7.f47922c);
                if (c11 != 0) {
                    if (c11 != 1) {
                        if (c11 == 2) {
                            l(null);
                            ra.a a12 = bVar.a();
                            a12.f47173b = 2;
                            return a12.a();
                        }
                        throw new k("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    ra.a a13 = bVar.a();
                    a13.f47176f = "BAD CONFIG";
                    a13.f47173b = 5;
                    return a13.a();
                }
                String str5 = f7.f47920a;
                long j3 = f7.f47921b;
                j jVar = this.d;
                jVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                jVar.f46110a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                ra.a a14 = bVar.a();
                a14.d = str5;
                a14.f47177g = Long.valueOf(j3);
                a14.h = Long.valueOf(seconds);
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
            str = this.f46100j;
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

    public final void f(ra.b bVar) {
        synchronized (f46092m) {
            try {
                k9.h hVar = this.f46093a;
                hVar.a();
                t a2 = t.a(hVar.f14747a);
                this.f46095c.J(bVar);
                if (a2 != null) {
                    a2.Z();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g() {
        k9.h hVar = this.f46093a;
        hVar.a();
        l.g(hVar.f14749c.f14760b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        hVar.a();
        l.g(hVar.f14749c.f14764g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        hVar.a();
        l.g(hVar.f14749c.f14759a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        hVar.a();
        String str = hVar.f14749c.f14760b;
        Pattern pattern = j.f46109c;
        l.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        hVar.a();
        l.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", j.f46109c.matcher(hVar.f14749c.f14759a).matches());
    }

    public final java.lang.String h(ra.b r3) {
        throw new UnsupportedOperationException("Method not decompiled: qa.c.h(ra.b):java.lang.String");
    }

    public final ra.b i(ra.b bVar) {
        int responseCode;
        boolean z10;
        String str = bVar.f47178a;
        String str2 = null;
        if (str != null && str.length() == 11) {
            ra.c cVar = (ra.c) this.f46096e.get();
            synchronized (cVar.f47185a) {
                try {
                    String[] strArr = ra.c.f47184c;
                    int i10 = 0;
                    while (true) {
                        if (i10 < 4) {
                            String str3 = strArr[i10];
                            String string = cVar.f47185a.getString("|T|" + cVar.f47186b + "|" + str3, null);
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
        sa.c cVar2 = this.f46094b;
        k9.h hVar = this.f46093a;
        hVar.a();
        String str4 = hVar.f14749c.f14759a;
        String str5 = bVar.f47178a;
        k9.h hVar2 = this.f46093a;
        hVar2.a();
        String str6 = hVar2.f14749c.f14764g;
        k9.h hVar3 = this.f46093a;
        hVar3.a();
        String str7 = hVar3.f14749c.f14760b;
        sa.d dVar = cVar2.f47926c;
        if (dVar.b()) {
            URL a2 = sa.c.a("projects/" + str6 + "/installations");
            int i11 = 0;
            sa.a aVar = cVar2;
            while (i11 <= 1) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection c10 = aVar.c(a2, str4);
                try {
                    try {
                        c10.setRequestMethod("POST");
                        c10.setDoOutput(true);
                        if (str2 != null) {
                            c10.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                        }
                        sa.c.g(c10, str5, str7);
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
                        sa.a e7 = sa.c.e(c10);
                        c10.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        aVar = e7;
                    } else {
                        try {
                            sa.c.b(c10, str7, str4, str6);
                        } catch (IOException | AssertionError unused3) {
                            c10.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i11++;
                            aVar = aVar;
                        }
                        if (responseCode != 429) {
                            if (responseCode >= 500 && responseCode < 600) {
                                c10.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                i11++;
                                aVar = aVar;
                            } else {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                sa.a aVar2 = new sa.a(null, null, null, null, 2);
                                c10.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                aVar = aVar2;
                            }
                        } else {
                            throw new k("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                            break;
                        }
                    }
                    int c11 = m1.j.c(aVar.f47919e);
                    if (c11 != 0) {
                        if (c11 == 1) {
                            ra.a a10 = bVar.a();
                            a10.f47176f = "BAD CONFIG";
                            a10.f47173b = 5;
                            return a10.a();
                        }
                        throw new k("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    String str8 = aVar.f47917b;
                    String str9 = aVar.f47918c;
                    j jVar = this.d;
                    jVar.getClass();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    jVar.f46110a.getClass();
                    long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                    sa.b bVar2 = aVar.d;
                    String str10 = bVar2.f47920a;
                    long j3 = bVar2.f47921b;
                    ra.a a11 = bVar.a();
                    a11.f47174c = str8;
                    a11.f47173b = 4;
                    a11.d = str10;
                    a11.f47175e = str9;
                    a11.f47177g = Long.valueOf(j3);
                    a11.h = Long.valueOf(seconds);
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
        synchronized (this.f46098g) {
            try {
                Iterator it = this.f46102l.iterator();
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

    public final void k(ra.b bVar) {
        synchronized (this.f46098g) {
            try {
                Iterator it = this.f46102l.iterator();
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

    public final synchronized void l(String str) {
        this.f46100j = str;
    }

    public final synchronized void m(ra.b bVar, ra.b bVar2) {
        try {
            if (this.f46101k.size() != 0 && !TextUtils.equals(bVar.f47178a, bVar2.f47178a)) {
                Iterator it = this.f46101k.iterator();
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
