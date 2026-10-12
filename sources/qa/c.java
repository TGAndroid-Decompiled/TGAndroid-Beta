package qa;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
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
import n6.k;
import n6.m;
import org.json.JSONException;
import org.json.JSONObject;
import q9.n;
public final class c implements d {
    public static final Object f45993m = new Object();
    public final k9.h f45994a;
    public final sa.c f45995b;
    public final k f45996c;
    public final j d;
    public final n f45997e;
    public final h f45998f;
    public final Object f45999g;
    public final ExecutorService h;
    public final r9.i f46000i;
    public String f46001j;
    public final HashSet f46002k;
    public final ArrayList f46003l;

    static {
        new AtomicInteger(1);
    }

    public c(k9.h hVar, pa.b bVar, ExecutorService executorService, r9.i iVar) {
        hVar.a();
        sa.c cVar = new sa.c(hVar.f14744a, bVar);
        k kVar = new k(hVar);
        if (qb.b.f46014b == null) {
            qb.b.f46014b = new qb.b(23);
        }
        qb.b bVar2 = qb.b.f46014b;
        if (j.d == null) {
            j.d = new j(bVar2);
        }
        j jVar = j.d;
        n nVar = new n(new q9.c(hVar, 2));
        ?? obj = new Object();
        this.f45999g = new Object();
        this.f46002k = new HashSet();
        this.f46003l = new ArrayList();
        this.f45994a = hVar;
        this.f45995b = cVar;
        this.f45996c = kVar;
        this.d = jVar;
        this.f45997e = nVar;
        this.f45998f = obj;
        this.h = executorService;
        this.f46000i = iVar;
    }

    public final void a(i iVar) {
        synchronized (this.f45999g) {
            this.f46003l.add(iVar);
        }
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: qa.c.b():void");
    }

    public final ra.b c(ra.b bVar) {
        int responseCode;
        boolean z10;
        sa.b f7;
        k9.h hVar = this.f45994a;
        hVar.a();
        String str = hVar.f14746c.f14756a;
        String str2 = bVar.f47356a;
        hVar.a();
        String str3 = hVar.f14746c.f14761g;
        String str4 = bVar.d;
        sa.c cVar = this.f45995b;
        sa.d dVar = cVar.f48121c;
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
                            throw new cc.k("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                    } else {
                        a5.a a11 = sa.b.a();
                        a11.f299b = 3;
                        f7 = a11.e();
                    }
                }
                c10.disconnect();
                TrafficStats.clearThreadStatsTag();
                int c11 = m1.j.c(f7.f48117c);
                if (c11 != 0) {
                    if (c11 != 1) {
                        if (c11 == 2) {
                            l(null);
                            ra.a a12 = bVar.a();
                            a12.f47351b = 2;
                            return a12.a();
                        }
                        throw new cc.k("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    ra.a a13 = bVar.a();
                    a13.f47354f = "BAD CONFIG";
                    a13.f47351b = 5;
                    return a13.a();
                }
                String str5 = f7.f48115a;
                long j3 = f7.f48116b;
                j jVar = this.d;
                jVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                jVar.f46011a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                ra.a a14 = bVar.a();
                a14.d = str5;
                a14.f47355g = Long.valueOf(j3);
                a14.h = Long.valueOf(seconds);
                return a14.a();
            }
            throw new cc.k("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new cc.k("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final Task d() {
        String str;
        g();
        synchronized (this) {
            str = this.f46001j;
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
        synchronized (f45993m) {
            try {
                k9.h hVar = this.f45994a;
                hVar.a();
                k a2 = k.a(hVar.f14744a);
                this.f45996c.K(bVar);
                if (a2 != null) {
                    a2.b0();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g() {
        k9.h hVar = this.f45994a;
        hVar.a();
        m.g(hVar.f14746c.f14757b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        hVar.a();
        m.g(hVar.f14746c.f14761g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        hVar.a();
        m.g(hVar.f14746c.f14756a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        hVar.a();
        String str = hVar.f14746c.f14757b;
        Pattern pattern = j.f46010c;
        m.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        hVar.a();
        m.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", j.f46010c.matcher(hVar.f14746c.f14756a).matches());
    }

    public final java.lang.String h(ra.b r3) {
        throw new UnsupportedOperationException("Method not decompiled: qa.c.h(ra.b):java.lang.String");
    }

    public final ra.b i(ra.b bVar) {
        int responseCode;
        boolean z10;
        String str = bVar.f47356a;
        String str2 = null;
        if (str != null && str.length() == 11) {
            ra.c cVar = (ra.c) this.f45997e.get();
            synchronized (cVar.f47363a) {
                try {
                    String[] strArr = ra.c.f47362c;
                    int i10 = 0;
                    while (true) {
                        if (i10 < 4) {
                            String str3 = strArr[i10];
                            String string = cVar.f47363a.getString("|T|" + cVar.f47364b + "|" + str3, null);
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
        sa.c cVar2 = this.f45995b;
        k9.h hVar = this.f45994a;
        hVar.a();
        String str4 = hVar.f14746c.f14756a;
        String str5 = bVar.f47356a;
        k9.h hVar2 = this.f45994a;
        hVar2.a();
        String str6 = hVar2.f14746c.f14761g;
        k9.h hVar3 = this.f45994a;
        hVar3.a();
        String str7 = hVar3.f14746c.f14757b;
        sa.d dVar = cVar2.f48121c;
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
                            throw new cc.k("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                            break;
                        }
                    }
                    int c11 = m1.j.c(aVar.f48114e);
                    if (c11 != 0) {
                        if (c11 == 1) {
                            ra.a a10 = bVar.a();
                            a10.f47354f = "BAD CONFIG";
                            a10.f47351b = 5;
                            return a10.a();
                        }
                        throw new cc.k("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    String str8 = aVar.f48112b;
                    String str9 = aVar.f48113c;
                    j jVar = this.d;
                    jVar.getClass();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    jVar.f46011a.getClass();
                    long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                    sa.b bVar2 = aVar.d;
                    String str10 = bVar2.f48115a;
                    long j3 = bVar2.f48116b;
                    ra.a a11 = bVar.a();
                    a11.f47352c = str8;
                    a11.f47351b = 4;
                    a11.d = str10;
                    a11.f47353e = str9;
                    a11.f47355g = Long.valueOf(j3);
                    a11.h = Long.valueOf(seconds);
                    return a11.a();
                } finally {
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            }
            throw new cc.k("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new cc.k("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void j(Exception exc) {
        synchronized (this.f45999g) {
            try {
                Iterator it = this.f46003l.iterator();
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
        synchronized (this.f45999g) {
            try {
                Iterator it = this.f46003l.iterator();
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
        this.f46001j = str;
    }

    public final synchronized void m(ra.b bVar, ra.b bVar2) {
        try {
            if (this.f46002k.size() != 0 && !TextUtils.equals(bVar.f47356a, bVar2.f47356a)) {
                Iterator it = this.f46002k.iterator();
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
