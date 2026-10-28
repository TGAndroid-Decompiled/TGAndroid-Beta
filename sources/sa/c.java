package sa;

import a8.ng;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.p;
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
import m4.w1;
import o6.l;
import org.json.JSONException;
import org.json.JSONObject;
import s9.o;
public final class c implements d {
    public static final Object f48060m = new Object();
    public final m9.h f48061a;
    public final ua.c f48062b;
    public final m4.c f48063c;
    public final j d;
    public final o e;
    public final h f48064f;
    public final Object f48065g;
    public final ExecutorService h;
    public final t9.j f48066i;
    public String f48067j;
    public final HashSet f48068k;
    public final ArrayList f48069l;

    static {
        new AtomicInteger(1);
    }

    public c(m9.h hVar, ra.b bVar, ExecutorService executorService, t9.j jVar) {
        hVar.a();
        ua.c cVar = new ua.c(hVar.f18379a, bVar);
        m4.c cVar2 = new m4.c(hVar);
        if (qb.a.f47064c == null) {
            qb.a.f47064c = new qb.a(25);
        }
        qb.a aVar = qb.a.f47064c;
        if (j.d == null) {
            j.d = new j(aVar);
        }
        j jVar2 = j.d;
        o oVar = new o(new s9.c(hVar, 2));
        ?? obj = new Object();
        this.f48065g = new Object();
        this.f48068k = new HashSet();
        this.f48069l = new ArrayList();
        this.f48061a = hVar;
        this.f48062b = cVar;
        this.f48063c = cVar2;
        this.d = jVar2;
        this.e = oVar;
        this.f48064f = obj;
        this.h = executorService;
        this.f48066i = jVar;
    }

    public final void a(i iVar) {
        synchronized (this.f48065g) {
            this.f48069l.add(iVar);
        }
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: sa.c.b():void");
    }

    public final ta.a c(ta.a aVar) {
        int responseCode;
        boolean z10;
        ua.b f7;
        m9.h hVar = this.f48061a;
        hVar.a();
        String str = hVar.f18381c.f18389a;
        String str2 = aVar.f48793a;
        hVar.a();
        String str3 = hVar.f18381c.f18393g;
        String str4 = aVar.d;
        ua.c cVar = this.f48062b;
        ua.d dVar = cVar.f49672c;
        if (dVar.b()) {
            URL a2 = ua.c.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
            for (int i10 = 0; i10 <= 1; i10++) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection c10 = cVar.c(a2, str);
                try {
                    c10.setRequestMethod("POST");
                    c10.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    c10.setDoOutput(true);
                    ua.c.h(c10);
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
                    f7 = ua.c.f(c10);
                } else {
                    ua.c.b(c10, null, str, str3);
                    if (responseCode != 401 && responseCode != 404) {
                        if (responseCode != 429) {
                            if (responseCode < 500 || responseCode >= 600) {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                ng a10 = ua.b.a();
                                a10.f639b = 2;
                                f7 = a10.d();
                            }
                            c10.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        } else {
                            throw new p("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                    } else {
                        ng a11 = ua.b.a();
                        a11.f639b = 3;
                        f7 = a11.d();
                    }
                }
                c10.disconnect();
                TrafficStats.clearThreadStatsTag();
                int c11 = m1.j.c(f7.f49669c);
                if (c11 != 0) {
                    if (c11 != 1) {
                        if (c11 == 2) {
                            l(null);
                            s4.b a12 = aVar.a();
                            a12.f47722b = 2;
                            return a12.a();
                        }
                        throw new p("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    s4.b a13 = aVar.a();
                    a13.h = "BAD CONFIG";
                    a13.f47722b = 5;
                    return a13.a();
                }
                String str5 = f7.f49667a;
                long j10 = f7.f49668b;
                j jVar = this.d;
                jVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                jVar.f48077a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                s4.b a14 = aVar.a();
                a14.d = str5;
                a14.f47724f = Long.valueOf(j10);
                a14.f47725g = Long.valueOf(seconds);
                return a14.a();
            }
            throw new p("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new p("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final Task d() {
        String str;
        g();
        synchronized (this) {
            str = this.f48067j;
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

    public final void f(ta.a aVar) {
        synchronized (f48060m) {
            try {
                m9.h hVar = this.f48061a;
                hVar.a();
                w1 s10 = w1.s(hVar.f18379a);
                this.f48063c.Y(aVar);
                if (s10 != null) {
                    s10.S();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g() {
        m9.h hVar = this.f48061a;
        hVar.a();
        l.g(hVar.f18381c.f18390b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        hVar.a();
        l.g(hVar.f18381c.f18393g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        hVar.a();
        l.g(hVar.f18381c.f18389a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        hVar.a();
        String str = hVar.f18381c.f18390b;
        Pattern pattern = j.f48076c;
        l.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        hVar.a();
        l.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", j.f48076c.matcher(hVar.f18381c.f18389a).matches());
    }

    public final java.lang.String h(ta.a r3) {
        throw new UnsupportedOperationException("Method not decompiled: sa.c.h(ta.a):java.lang.String");
    }

    public final ta.a i(ta.a aVar) {
        int responseCode;
        boolean z10;
        String str = aVar.f48793a;
        String str2 = null;
        if (str != null && str.length() == 11) {
            ta.b bVar = (ta.b) this.e.get();
            synchronized (bVar.f48799a) {
                try {
                    String[] strArr = ta.b.f48798c;
                    int i10 = 0;
                    while (true) {
                        if (i10 < 4) {
                            String str3 = strArr[i10];
                            String string = bVar.f48799a.getString("|T|" + bVar.f48800b + "|" + str3, null);
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
        ua.c cVar = this.f48062b;
        m9.h hVar = this.f48061a;
        hVar.a();
        String str4 = hVar.f18381c.f18389a;
        String str5 = aVar.f48793a;
        m9.h hVar2 = this.f48061a;
        hVar2.a();
        String str6 = hVar2.f18381c.f18393g;
        m9.h hVar3 = this.f48061a;
        hVar3.a();
        String str7 = hVar3.f18381c.f18390b;
        ua.d dVar = cVar.f49672c;
        if (dVar.b()) {
            URL a2 = ua.c.a("projects/" + str6 + "/installations");
            int i11 = 0;
            ua.a aVar2 = cVar;
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
                        ua.c.g(c10, str5, str7);
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
                        ua.a e = ua.c.e(c10);
                        c10.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        aVar2 = e;
                    } else {
                        try {
                            ua.c.b(c10, str7, str4, str6);
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
                                ua.a aVar3 = new ua.a(null, null, null, null, 2);
                                c10.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                aVar2 = aVar3;
                            }
                        } else {
                            throw new p("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                            break;
                        }
                    }
                    int c11 = m1.j.c(aVar2.e);
                    if (c11 != 0) {
                        if (c11 == 1) {
                            s4.b a10 = aVar.a();
                            a10.h = "BAD CONFIG";
                            a10.f47722b = 5;
                            return a10.a();
                        }
                        throw new p("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    String str8 = aVar2.f49665b;
                    String str9 = aVar2.f49666c;
                    j jVar = this.d;
                    jVar.getClass();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    jVar.f48077a.getClass();
                    long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                    ua.b bVar2 = aVar2.d;
                    String str10 = bVar2.f49667a;
                    long j10 = bVar2.f49668b;
                    s4.b a11 = aVar.a();
                    a11.f47723c = str8;
                    a11.f47722b = 4;
                    a11.d = str10;
                    a11.e = str9;
                    a11.f47724f = Long.valueOf(j10);
                    a11.f47725g = Long.valueOf(seconds);
                    return a11.a();
                } finally {
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            }
            throw new p("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new p("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void j(Exception exc) {
        synchronized (this.f48065g) {
            try {
                Iterator it = this.f48069l.iterator();
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

    public final void k(ta.a aVar) {
        synchronized (this.f48065g) {
            try {
                Iterator it = this.f48069l.iterator();
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
        this.f48067j = str;
    }

    public final synchronized void m(ta.a aVar, ta.a aVar2) {
        try {
            if (this.f48068k.size() != 0 && !TextUtils.equals(aVar.f48793a, aVar2.f48793a)) {
                Iterator it = this.f48068k.iterator();
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
