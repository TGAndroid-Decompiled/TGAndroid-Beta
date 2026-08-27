package z9;

import a9.q;
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
import org.json.JSONException;
import org.json.JSONObject;
import w3.b0;
import y5.l;
import z8.m;

public final class c implements d {

    public static final Object f50259m = new Object();

    public final t8.h f50260a;

    public final ba.c f50261b;

    public final xe.b f50262c;
    public final j d;

    public final m f50263e;

    public final h f50264f;

    public final Object f50265g;
    public final ExecutorService h;

    public final q f50266i;

    public String f50267j;

    public final HashSet f50268k;

    public final ArrayList f50269l;

    static {
        new AtomicInteger(1);
    }

    public c(t8.h hVar, y9.b bVar, ExecutorService executorService, q qVar) {
        hVar.a();
        ba.c cVar = new ba.c(hVar.f48119a, bVar);
        xe.b bVar2 = new xe.b(hVar);
        if (xa.a.f49381b == null) {
            xa.a.f49381b = new xa.a(3);
        }
        xa.a aVar = xa.a.f49381b;
        if (j.d == null) {
            j.d = new j(aVar);
        }
        j jVar = j.d;
        m mVar = new m(new z8.c(hVar, 2));
        h hVar2 = new h();
        this.f50265g = new Object();
        this.f50268k = new HashSet();
        this.f50269l = new ArrayList();
        this.f50260a = hVar;
        this.f50261b = cVar;
        this.f50262c = bVar2;
        this.d = jVar;
        this.f50263e = mVar;
        this.f50264f = hVar2;
        this.h = executorService;
        this.f50266i = qVar;
    }

    public final void a(i iVar) {
        synchronized (this.f50265g) {
            this.f50269l.add(iVar);
        }
    }

    public final void b() {
        aa.b bVarM;
        synchronized (f50259m) {
            try {
                t8.h hVar = this.f50260a;
                hVar.a();
                b0 b0VarD = b0.d(hVar.f48119a);
                try {
                    bVarM = this.f50262c.M();
                    int i10 = bVarM.f206b;
                    boolean z10 = true;
                    if (i10 != 2 && i10 != 1) {
                        z10 = false;
                    }
                    if (z10) {
                        String strH = h(bVarM);
                        xe.b bVar = this.f50262c;
                        aa.a aVarA = bVarM.a();
                        aVarA.f201c = strH;
                        aVarA.f200b = 3;
                        bVarM = aVarA.a();
                        bVar.G(bVarM);
                    }
                    if (b0VarD != null) {
                        b0VarD.l();
                    }
                } catch (Throwable th) {
                    if (b0VarD != null) {
                        b0VarD.l();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        k(bVarM);
        this.f50266i.execute(new b(this, 1));
    }

    public final aa.b c(aa.b bVar) throws e {
        HttpURLConnection httpURLConnectionC;
        ba.b bVarF;
        t8.h hVar = this.f50260a;
        hVar.a();
        String str = hVar.f48121c.f48131a;
        String str2 = bVar.f205a;
        hVar.a();
        String str3 = hVar.f48121c.f48136g;
        String str4 = bVar.d;
        ba.c cVar = this.f50261b;
        ba.d dVar = cVar.f2062c;
        if (!dVar.b()) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = ba.c.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        int i10 = 0;
        while (true) {
            if (i10 > 1) {
                throw new e("Firebase Installations Service is unavailable. Please try again later.");
            }
            TrafficStats.setThreadStatsTag(32771);
            httpURLConnectionC = cVar.c(urlA, str);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    httpURLConnectionC.setDoOutput(true);
                    ba.c.h(httpURLConnectionC);
                    int responseCode = httpURLConnectionC.getResponseCode();
                    dVar.d(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        bVarF = ba.c.f(httpURLConnectionC);
                        break;
                    }
                    ba.c.b(httpURLConnectionC, null, str, str3);
                    if (responseCode == 401 || responseCode == 404) {
                        b6.a aVarA = ba.b.a();
                        aVarA.f2034c = 3;
                        bVarF = aVarA.b();
                        break;
                    }
                    if (responseCode == 429) {
                        throw new e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        b6.a aVarA2 = ba.b.a();
                        aVarA2.f2034c = 2;
                        bVarF = aVarA2.b();
                        break;
                    }
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i10++;
                } catch (Throwable th) {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            } catch (IOException | AssertionError unused) {
            }
        }
        httpURLConnectionC.disconnect();
        TrafficStats.clearThreadStatsTag();
        int iB = m1.j.b(bVarF.f2058c);
        if (iB != 0) {
            if (iB == 1) {
                aa.a aVarA3 = bVar.a();
                aVarA3.f203f = "BAD CONFIG";
                aVarA3.f200b = 5;
                return aVarA3.a();
            }
            if (iB != 2) {
                throw new e("Firebase Installations Service is unavailable. Please try again later.");
            }
            l(null);
            aa.a aVarA4 = bVar.a();
            aVarA4.f200b = 2;
            return aVarA4.a();
        }
        String str5 = bVarF.f2056a;
        long j10 = bVarF.f2057b;
        j jVar = this.d;
        jVar.getClass();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        jVar.f50277a.getClass();
        long seconds = timeUnit.toSeconds(System.currentTimeMillis());
        aa.a aVarA5 = bVar.a();
        aVarA5.d = str5;
        aVarA5.f204g = Long.valueOf(j10);
        aVarA5.h = Long.valueOf(seconds);
        return aVarA5.a();
    }

    public final Task d() {
        String str;
        g();
        synchronized (this) {
            str = this.f50267j;
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

    public final void f(aa.b bVar) {
        synchronized (f50259m) {
            try {
                t8.h hVar = this.f50260a;
                hVar.a();
                b0 b0VarD = b0.d(hVar.f48119a);
                try {
                    this.f50262c.G(bVar);
                    if (b0VarD != null) {
                        b0VarD.l();
                    }
                } catch (Throwable th) {
                    if (b0VarD != null) {
                        b0VarD.l();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g() {
        t8.h hVar = this.f50260a;
        hVar.a();
        l.g(hVar.f48121c.f48132b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        hVar.a();
        l.g(hVar.f48121c.f48136g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        hVar.a();
        l.g(hVar.f48121c.f48131a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        hVar.a();
        String str = hVar.f48121c.f48132b;
        Pattern pattern = j.f50276c;
        l.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        hVar.a();
        l.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", j.f50276c.matcher(hVar.f48121c.f48131a).matches());
    }

    public final String h(aa.b bVar) {
        aa.c cVar;
        String strA;
        t8.h hVar = this.f50260a;
        hVar.a();
        if (!hVar.f48120b.equals("CHIME_ANDROID_SDK")) {
            t8.h hVar2 = this.f50260a;
            hVar2.a();
            if ("[DEFAULT]".equals(hVar2.f48120b)) {
                if (bVar.f206b == 1) {
                    cVar = (aa.c) this.f50263e.get();
                    synchronized (cVar.f212a) {
                        try {
                            strA = cVar.a();
                            if (strA != null) {
                                strA = cVar.b();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (TextUtils.isEmpty(strA)) {
                        return strA;
                    }
                    this.f50264f.getClass();
                    return h.a();
                }
            }
        } else if (bVar.f206b == 1) {
            cVar = (aa.c) this.f50263e.get();
            synchronized (cVar.f212a) {
                strA = cVar.a();
                if (strA != null) {
                    strA = cVar.b();
                }
                if (TextUtils.isEmpty(strA)) {
                    return strA;
                }
                this.f50264f.getClass();
                return h.a();
            }
        }
        this.f50264f.getClass();
        return h.a();
    }

    public final aa.b i(aa.b bVar) throws e {
        String str = bVar.f205a;
        String string = null;
        if (str != null && str.length() == 11) {
            aa.c cVar = (aa.c) this.f50263e.get();
            synchronized (cVar.f212a) {
                try {
                    String[] strArr = aa.c.f211c;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= 4) {
                            break;
                        }
                        String str2 = strArr[i10];
                        String string2 = cVar.f212a.getString("|T|" + cVar.f213b + "|" + str2, null);
                        if (string2 != null && !string2.isEmpty()) {
                            if (string2.startsWith("{")) {
                                try {
                                    string = new JSONObject(string2).getString("token");
                                } catch (JSONException unused) {
                                }
                            } else {
                                string = string2;
                            }
                            break;
                        }
                        i10++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        ba.c cVar2 = this.f50261b;
        t8.h hVar = this.f50260a;
        hVar.a();
        String str3 = hVar.f48121c.f48131a;
        String str4 = bVar.f205a;
        t8.h hVar2 = this.f50260a;
        hVar2.a();
        String str5 = hVar2.f48121c.f48136g;
        t8.h hVar3 = this.f50260a;
        hVar3.a();
        String str6 = hVar3.f48121c.f48132b;
        ba.d dVar = cVar2.f2062c;
        if (!dVar.b()) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = ba.c.a("projects/" + str5 + "/installations");
        int i11 = 0;
        ba.a aVar = cVar2;
        while (i11 <= 1) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionC = aVar.c(urlA, str3);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionC.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    ba.c.g(httpURLConnectionC, str4, str6);
                    int responseCode = httpURLConnectionC.getResponseCode();
                    dVar.d(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        ba.a aVarE = ba.c.e(httpURLConnectionC);
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        aVar = aVarE;
                    } else {
                        try {
                            ba.c.b(httpURLConnectionC, str6, str3, str5);
                            if (responseCode == 429) {
                                throw new e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                            }
                            if (responseCode < 500 || responseCode >= 600) {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                ba.a aVar2 = new ba.a(null, null, null, null, 2);
                                httpURLConnectionC.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                aVar = aVar2;
                            } else {
                                httpURLConnectionC.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                i11++;
                                aVar = aVar;
                            }
                        } catch (IOException | AssertionError unused2) {
                            httpURLConnectionC.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i11++;
                        aVar = aVar;
                    }
                    int iB = m1.j.b(aVar.f2055e);
                    if (iB != 0) {
                        if (iB != 1) {
                            throw new e("Firebase Installations Service is unavailable. Please try again later.");
                        }
                        aa.a aVarA = bVar.a();
                        aVarA.f203f = "BAD CONFIG";
                        aVarA.f200b = 5;
                        return aVarA.a();
                    }
                    String str7 = aVar.f2053b;
                    String str8 = aVar.f2054c;
                    j jVar = this.d;
                    jVar.getClass();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    jVar.f50277a.getClass();
                    long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                    ba.b bVar2 = aVar.d;
                    String str9 = bVar2.f2056a;
                    long j10 = bVar2.f2057b;
                    aa.a aVarA2 = bVar.a();
                    aVarA2.f201c = str7;
                    aVarA2.f200b = 4;
                    aVarA2.d = str9;
                    aVarA2.f202e = str8;
                    aVarA2.f204g = Long.valueOf(j10);
                    aVarA2.h = Long.valueOf(seconds);
                    return aVarA2.a();
                } catch (IOException | AssertionError unused3) {
                }
            } catch (Throwable th2) {
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th2;
            }
        }
        throw new e("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void j(Exception exc) {
        synchronized (this.f50265g) {
            try {
                Iterator it = this.f50269l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(aa.b bVar) {
        synchronized (this.f50265g) {
            try {
                Iterator it = this.f50269l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).b(bVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void l(String str) {
        this.f50267j = str;
    }

    public final synchronized void m(aa.b bVar, aa.b bVar2) {
        try {
            if (this.f50268k.size() != 0 && !TextUtils.equals(bVar.f205a, bVar2.f205a)) {
                Iterator it = this.f50268k.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
