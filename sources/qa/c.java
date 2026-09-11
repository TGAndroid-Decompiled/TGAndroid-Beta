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
import n7.z0;
import org.json.JSONException;
import org.json.JSONObject;
import q9.n;
public final class c implements d {
    public static final Object f44250m = new Object();
    public final k9.h f44251a;
    public final sa.c f44252b;
    public final z0 f44253c;
    public final j d;
    public final n f44254e;
    public final h f44255f;
    public final Object f44256g;
    public final ExecutorService h;
    public final r9.j f44257i;
    public String f44258j;
    public final HashSet f44259k;
    public final ArrayList f44260l;

    static {
        new AtomicInteger(1);
    }

    public c(k9.h hVar, pa.b bVar, ExecutorService executorService, r9.j jVar) {
        hVar.a();
        sa.c cVar = new sa.c(hVar.f14856a, bVar);
        z0 z0Var = new z0(hVar);
        if (na.d.f16716a == null) {
            na.d.f16716a = new Object();
        }
        na.d dVar = na.d.f16716a;
        if (j.d == null) {
            j.d = new j(dVar);
        }
        j jVar2 = j.d;
        n nVar = new n(new q9.c(hVar, 2));
        ?? obj = new Object();
        this.f44256g = new Object();
        this.f44259k = new HashSet();
        this.f44260l = new ArrayList();
        this.f44251a = hVar;
        this.f44252b = cVar;
        this.f44253c = z0Var;
        this.d = jVar2;
        this.f44254e = nVar;
        this.f44255f = obj;
        this.h = executorService;
        this.f44257i = jVar;
    }

    public final void a(i iVar) {
        synchronized (this.f44256g) {
            this.f44260l.add(iVar);
        }
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: qa.c.b():void");
    }

    public final ra.b c(ra.b bVar) {
        int responseCode;
        boolean z10;
        sa.b f7;
        k9.h hVar = this.f44251a;
        hVar.a();
        String str = hVar.f14858c.f14868a;
        String str2 = bVar.f45068a;
        hVar.a();
        String str3 = hVar.f14858c.f14873g;
        String str4 = bVar.d;
        sa.c cVar = this.f44252b;
        sa.d dVar = cVar.f45976c;
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
                                a10.f285b = 2;
                                f7 = a10.b();
                            }
                            c10.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        } else {
                            throw new k("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                    } else {
                        a5.a a11 = sa.b.a();
                        a11.f285b = 3;
                        f7 = a11.b();
                    }
                }
                c10.disconnect();
                TrafficStats.clearThreadStatsTag();
                int c11 = m1.j.c(f7.f45972c);
                if (c11 != 0) {
                    if (c11 != 1) {
                        if (c11 == 2) {
                            l(null);
                            ra.a a12 = bVar.a();
                            a12.f45063b = 2;
                            return a12.a();
                        }
                        throw new k("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    ra.a a13 = bVar.a();
                    a13.f45066f = "BAD CONFIG";
                    a13.f45063b = 5;
                    return a13.a();
                }
                String str5 = f7.f45970a;
                long j3 = f7.f45971b;
                j jVar = this.d;
                jVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                jVar.f44268a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                ra.a a14 = bVar.a();
                a14.d = str5;
                a14.f45067g = Long.valueOf(j3);
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
            str = this.f44258j;
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
        synchronized (f44250m) {
            try {
                k9.h hVar = this.f44251a;
                hVar.a();
                o0.a d = o0.a.d(hVar.f14856a);
                this.f44253c.A(bVar);
                if (d != null) {
                    d.J();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g() {
        k9.h hVar = this.f44251a;
        hVar.a();
        l.g(hVar.f14858c.f14869b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        hVar.a();
        l.g(hVar.f14858c.f14873g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        hVar.a();
        l.g(hVar.f14858c.f14868a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        hVar.a();
        String str = hVar.f14858c.f14869b;
        Pattern pattern = j.f44267c;
        l.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        hVar.a();
        l.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", j.f44267c.matcher(hVar.f14858c.f14868a).matches());
    }

    public final java.lang.String h(ra.b r3) {
        throw new UnsupportedOperationException("Method not decompiled: qa.c.h(ra.b):java.lang.String");
    }

    public final ra.b i(ra.b bVar) {
        int responseCode;
        boolean z10;
        String str = bVar.f45068a;
        String str2 = null;
        if (str != null && str.length() == 11) {
            ra.c cVar = (ra.c) this.f44254e.get();
            synchronized (cVar.f45075a) {
                try {
                    String[] strArr = ra.c.f45074c;
                    int i10 = 0;
                    while (true) {
                        if (i10 < 4) {
                            String str3 = strArr[i10];
                            String str4 = cVar.f45076b;
                            String string = cVar.f45075a.getString("|T|" + str4 + "|" + str3, null);
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
        sa.c cVar2 = this.f44252b;
        k9.h hVar = this.f44251a;
        hVar.a();
        String str5 = hVar.f14858c.f14868a;
        String str6 = bVar.f45068a;
        k9.h hVar2 = this.f44251a;
        hVar2.a();
        String str7 = hVar2.f14858c.f14873g;
        k9.h hVar3 = this.f44251a;
        hVar3.a();
        String str8 = hVar3.f14858c.f14869b;
        sa.d dVar = cVar2.f45976c;
        if (dVar.b()) {
            URL a2 = sa.c.a("projects/" + str7 + "/installations");
            int i11 = 0;
            sa.a aVar = cVar2;
            while (i11 <= 1) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection c10 = aVar.c(a2, str5);
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
                        sa.a e7 = sa.c.e(c10);
                        c10.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        aVar = e7;
                    } else {
                        try {
                            sa.c.b(c10, str8, str5, str7);
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
                    int c11 = m1.j.c(aVar.f45969e);
                    if (c11 != 0) {
                        if (c11 == 1) {
                            ra.a a10 = bVar.a();
                            a10.f45066f = "BAD CONFIG";
                            a10.f45063b = 5;
                            return a10.a();
                        }
                        throw new k("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    String str9 = aVar.f45967b;
                    String str10 = aVar.f45968c;
                    j jVar = this.d;
                    jVar.getClass();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    jVar.f44268a.getClass();
                    long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                    sa.b bVar2 = aVar.d;
                    String str11 = bVar2.f45970a;
                    long j3 = bVar2.f45971b;
                    ra.a a11 = bVar.a();
                    a11.f45064c = str9;
                    a11.f45063b = 4;
                    a11.d = str11;
                    a11.f45065e = str10;
                    a11.f45067g = Long.valueOf(j3);
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
        synchronized (this.f44256g) {
            try {
                Iterator it = this.f44260l.iterator();
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
        synchronized (this.f44256g) {
            try {
                Iterator it = this.f44260l.iterator();
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
        this.f44258j = str;
    }

    public final synchronized void m(ra.b bVar, ra.b bVar2) {
        try {
            if (this.f44259k.size() != 0 && !TextUtils.equals(bVar.f45068a, bVar2.f45068a)) {
                Iterator it = this.f44259k.iterator();
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
