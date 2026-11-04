package ua;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import b8.yf;
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
import l6.m;
import mi.h0;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.ui.Components.he0;
import t9.n;
import u9.l;
public final class d implements e {
    public static final Object f55787m = new Object();
    public final n9.h f55788a;
    public final wa.c f55789b;
    public final h0 f55790c;
    public final k d;
    public final n f55791e;
    public final i f55792f;
    public final Object f55793g;
    public final ExecutorService h;
    public final l f55794i;
    public String f55795j;
    public final HashSet f55796k;
    public final ArrayList f55797l;

    static {
        new AtomicInteger(1);
    }

    public d(n9.h hVar, ta.b bVar, ExecutorService executorService, l lVar) {
        hVar.a();
        wa.c cVar = new wa.c(hVar.f20296a, bVar);
        h0 h0Var = new h0(hVar);
        if (ra.e.f54462c == null) {
            ra.e.f54462c = new ra.e(27);
        }
        ra.e eVar = ra.e.f54462c;
        if (k.d == null) {
            k.d = new k(eVar);
        }
        k kVar = k.d;
        n nVar = new n(new t9.c(hVar, 2));
        ?? obj = new Object();
        this.f55793g = new Object();
        this.f55796k = new HashSet();
        this.f55797l = new ArrayList();
        this.f55788a = hVar;
        this.f55789b = cVar;
        this.f55790c = h0Var;
        this.d = kVar;
        this.f55791e = nVar;
        this.f55792f = obj;
        this.h = executorService;
        this.f55794i = lVar;
    }

    public final void a(j jVar) {
        synchronized (this.f55793g) {
            this.f55797l.add(jVar);
        }
    }

    public final synchronized void b(va.b bVar, va.b bVar2) {
        boolean z10;
        boolean z11 = false;
        if (bVar2.f56493b == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        String str = bVar2.f56492a;
        if (z10 && !TextUtils.isEmpty(str)) {
            if (!TextUtils.equals(bVar.f56492a, str)) {
                z11 = true;
            } else {
                if (bVar.f56493b == 4) {
                    z11 = true;
                }
                z11 = !z11;
            }
        }
        if (z11) {
            Iterator it = this.f55796k.iterator();
            while (it.hasNext()) {
                FirebaseMessaging firebaseMessaging = ((za.i) it.next()).f60296a;
                he0 he0Var = FirebaseMessaging.f7941m;
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
        throw new UnsupportedOperationException("Method not decompiled: ua.d.c():void");
    }

    public final va.b d(va.b bVar) {
        HttpURLConnection httpURLConnection;
        int responseCode;
        boolean z10;
        String str;
        wa.b bVar2;
        n9.h hVar = this.f55788a;
        hVar.a();
        String str2 = hVar.f20298c.f20309a;
        String str3 = bVar.f56492a;
        hVar.a();
        String str4 = hVar.f20298c.h;
        String str5 = bVar.d;
        wa.c cVar = this.f55789b;
        wa.d dVar = cVar.f57438c;
        if (dVar.b()) {
            URL a10 = wa.c.a("projects/" + str4 + "/installations/" + str3 + "/authTokens:generate");
            for (int i3 = 0; i3 <= 1; i3++) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection c2 = cVar.c(a10, str2);
                try {
                    c2.setRequestMethod("POST");
                    c2.addRequestProperty("Authorization", "FIS_v2 " + str5);
                    c2.setDoOutput(true);
                    wa.c.h(c2);
                    responseCode = c2.getResponseCode();
                    dVar.d(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } catch (IOException | AssertionError unused) {
                    httpURLConnection = c2;
                } catch (Throwable th2) {
                    th = th2;
                    httpURLConnection = c2;
                }
                if (z10) {
                    bVar2 = wa.c.f(c2);
                    c2.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    str = null;
                } else {
                    wa.c.b(c2, null, str2, str4);
                    httpURLConnection = c2;
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
                                    wa.b bVar3 = new wa.b(null, 0L, 2);
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
                            throw new m("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                    } else if (((byte) (0 | 1)) == 1) {
                        str = null;
                        wa.b bVar4 = new wa.b(null, 0L, 3);
                        httpURLConnection.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        bVar2 = bVar4;
                    } else {
                        throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                    }
                }
                int c10 = o1.g.c(bVar2.f57434c);
                if (c10 != 0) {
                    if (c10 != 1) {
                        if (c10 == 2) {
                            m(str);
                            va.a a11 = bVar.a();
                            a11.f56487b = 2;
                            return a11.a();
                        }
                        throw new m("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    va.a a12 = bVar.a();
                    a12.f56491g = "BAD CONFIG";
                    a12.f56487b = 5;
                    return a12.a();
                }
                String str6 = bVar2.f57432a;
                long j10 = bVar2.f57433b;
                k kVar = this.d;
                kVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                kVar.f55805a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                va.a a13 = bVar.a();
                a13.f56488c = str6;
                a13.f56489e = j10;
                a13.f56490f = seconds;
                a13.h = (byte) (((byte) (a13.h | 1)) | 2);
                return a13.a();
            }
            throw new m("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new m("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final Task e() {
        String str;
        h();
        synchronized (this) {
            str = this.f55795j;
        }
        if (str != null) {
            return Tasks.forResult(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        a(new h(taskCompletionSource));
        Task task = taskCompletionSource.getTask();
        this.h.execute(new c(this, 0));
        return task;
    }

    public final Task f() {
        h();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        a(new g(this.d, taskCompletionSource));
        Task task = taskCompletionSource.getTask();
        this.h.execute(new c(this, 1));
        return task;
    }

    public final void g(va.b bVar) {
        synchronized (f55787m) {
            try {
                n9.h hVar = this.f55788a;
                hVar.a();
                b a10 = b.a(hVar.f20296a);
                this.f55790c.N(bVar);
                if (a10 != null) {
                    a10.b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void h() {
        n9.h hVar = this.f55788a;
        hVar.a();
        p6.m.f(hVar.f20298c.f20310b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        hVar.a();
        p6.m.f(hVar.f20298c.h, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        hVar.a();
        p6.m.f(hVar.f20298c.f20309a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        hVar.a();
        String str = hVar.f20298c.f20310b;
        Pattern pattern = k.f55804c;
        p6.m.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        hVar.a();
        p6.m.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", k.f55804c.matcher(hVar.f20298c.f20309a).matches());
    }

    public final java.lang.String i(va.b r7) {
        throw new UnsupportedOperationException("Method not decompiled: ua.d.i(va.b):java.lang.String");
    }

    public final va.b j(va.b bVar) {
        int responseCode;
        boolean z10;
        wa.a e10;
        String str = bVar.f56492a;
        String str2 = null;
        if (str != null && str.length() == 11) {
            va.c cVar = (va.c) this.f55791e.get();
            cVar.getClass();
            String[] strArr = va.c.f56499e;
            int length = strArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                String str3 = strArr[i3];
                String str4 = (String) cVar.f56500a.b(yf.a("|T|" + cVar.f56501b + "|" + str3), null);
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
                    i3++;
                }
            }
        }
        n9.h hVar = this.f55788a;
        hVar.a();
        String str5 = hVar.f20298c.f20309a;
        hVar.a();
        String str6 = hVar.f20298c.h;
        hVar.a();
        String str7 = hVar.f20298c.f20310b;
        wa.c cVar2 = this.f55789b;
        wa.d dVar = cVar2.f57438c;
        if (dVar.b()) {
            URL a10 = wa.c.a("projects/" + str6 + "/installations");
            for (int i10 = 0; i10 <= 1; i10++) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection c2 = cVar2.c(a10, str5);
                try {
                    c2.setRequestMethod("POST");
                    c2.setDoOutput(true);
                    if (str2 != null) {
                        c2.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                    }
                    wa.c.g(c2, str, str7);
                    responseCode = c2.getResponseCode();
                    dVar.d(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } catch (IOException | AssertionError unused2) {
                } catch (Throwable th2) {
                    c2.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th2;
                }
                if (z10) {
                    e10 = wa.c.e(c2);
                    c2.disconnect();
                    TrafficStats.clearThreadStatsTag();
                } else {
                    wa.c.b(c2, str7, str5, str6);
                    if (responseCode != 429) {
                        if (responseCode < 500 || responseCode >= 600) {
                            Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                            wa.a aVar = new wa.a(null, null, null, null, 2);
                            c2.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            e10 = aVar;
                        }
                        c2.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    } else {
                        throw new m("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                }
                int c10 = o1.g.c(e10.f57431e);
                if (c10 != 0) {
                    if (c10 == 1) {
                        va.a a11 = bVar.a();
                        a11.f56491g = "BAD CONFIG";
                        a11.f56487b = 5;
                        return a11.a();
                    }
                    throw new m("Firebase Installations Service is unavailable. Please try again later.");
                }
                String str8 = e10.f57429b;
                String str9 = e10.f57430c;
                k kVar = this.d;
                kVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                kVar.f55805a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                wa.b bVar2 = e10.d;
                String str10 = bVar2.f57432a;
                long j10 = bVar2.f57433b;
                va.a a12 = bVar.a();
                a12.f56486a = str8;
                a12.f56487b = 4;
                a12.f56488c = str10;
                a12.d = str9;
                a12.f56489e = j10;
                a12.f56490f = seconds;
                a12.h = (byte) (((byte) (a12.h | 1)) | 2);
                return a12.a();
            }
            throw new m("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new m("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void k(Exception exc) {
        synchronized (this.f55793g) {
            try {
                Iterator it = this.f55797l.iterator();
                while (it.hasNext()) {
                    if (((j) it.next()).b(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void l(va.b bVar) {
        synchronized (this.f55793g) {
            try {
                Iterator it = this.f55797l.iterator();
                while (it.hasNext()) {
                    if (((j) it.next()).a(bVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized void m(String str) {
        this.f55795j = str;
    }
}
