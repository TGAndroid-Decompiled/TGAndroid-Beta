package z9;

import android.app.ApplicationExitInfo;
import android.content.Context;
import android.util.Log;
import ca.a1;
import ca.c0;
import ca.d0;
import ca.e1;
import ca.h0;
import ca.h1;
import ca.j2;
import ca.k1;
import ca.l1;
import ca.q2;
import ca.s0;
import ca.t0;
import ca.u0;
import ca.v0;
import ca.w0;
import ca.y0;
import ca.z0;
import com.google.android.gms.common.api.internal.j1;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import j$.util.DesugarCollections;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.function.Predicate;
import m.o3;
import org.telegram.ui.rn;
import vg.i1;
public final class x {
    public final q f60257a;
    public final fa.d f60258b;
    public final ga.a f60259c;
    public final ba.f d;
    public final o3 f60260e;
    public final v f60261f;
    public final aa.g f60262g;

    public x(q qVar, fa.d dVar, ga.a aVar, ba.f fVar, o3 o3Var, v vVar, aa.g gVar) {
        this.f60257a = qVar;
        this.f60258b = dVar;
        this.f60259c = aVar;
        this.d = fVar;
        this.f60260e = o3Var;
        this.f60261f = vVar;
        this.f60262g = gVar;
    }

    public static t0 a(t0 t0Var, ba.f fVar, o3 o3Var, Map map) {
        Map unmodifiableMap;
        s0 a10 = t0Var.a();
        String D = ((ba.d) fVar.f3182b).D();
        if (D != null) {
            a10.f4536e = new h1(D);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        b4.n nVar = (b4.n) o3Var.d;
        if (map.isEmpty()) {
            unmodifiableMap = ((ba.e) ((AtomicMarkableReference) nVar.f2378b).getReference()).a();
        } else {
            HashMap hashMap = new HashMap(((ba.e) ((AtomicMarkableReference) nVar.f2378b).getReference()).a());
            int i3 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String b10 = ba.e.b(1024, (String) entry.getKey());
                if (hashMap.size() >= 64 && !hashMap.containsKey(b10)) {
                    i3++;
                } else {
                    hashMap.put(b10, ba.e.b(1024, (String) entry.getValue()));
                }
            }
            if (i3 > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i3 + " keys when adding event specific keys. Maximum allowable: 1024", null);
            }
            unmodifiableMap = DesugarCollections.unmodifiableMap(hashMap);
        }
        List f10 = f(unmodifiableMap);
        List f11 = f(((ba.e) ((AtomicMarkableReference) ((b4.n) o3Var.f18685e).f2378b).getReference()).a());
        if (!f10.isEmpty() || !f11.isEmpty()) {
            u0 a11 = t0Var.f4546c.a();
            a11.f4556b = f10;
            a11.f4557c = f11;
            a10.f4535c = a11.a();
        }
        return a10.a();
    }

    public static q2 b(t0 t0Var, o3 o3Var) {
        List l10 = ((e5.u) o3Var.f18686f).l();
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < l10.size(); i3++) {
            ba.p pVar = (ba.p) l10.get(i3);
            pVar.getClass();
            ?? obj = new Object();
            ba.b bVar = (ba.b) pVar;
            String str = bVar.f3172e;
            if (str != null) {
                String str2 = bVar.f3170b;
                if (str2 != null) {
                    obj.f4405a = new k1(str2, str);
                    String str3 = bVar.f3171c;
                    if (str3 != null) {
                        obj.f4406b = str3;
                        String str4 = bVar.d;
                        if (str4 != null) {
                            obj.f4407c = str4;
                            obj.d = bVar.f3173f;
                            obj.f4408e = (byte) (obj.f4408e | 1);
                            arrayList.add(obj.a());
                        } else {
                            throw new NullPointerException("Null parameterValue");
                        }
                    } else {
                        throw new NullPointerException("Null parameterKey");
                    }
                } else {
                    throw new NullPointerException("Null rolloutId");
                }
            } else {
                throw new NullPointerException("Null variantId");
            }
        }
        if (arrayList.isEmpty()) {
            return t0Var;
        }
        s0 a10 = t0Var.a();
        a10.f4537f = new l1(arrayList);
        return a10.a();
    }

    public static String c(InputStream inputStream) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[8192];
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String byteArrayOutputStream2 = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                    byteArrayOutputStream.close();
                    bufferedInputStream.close();
                    return byteArrayOutputStream2;
                }
            }
        } catch (Throwable th2) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static x d(Context context, v vVar, fa.f fVar, a aVar, ba.f fVar2, o3 o3Var, tf.b bVar, ha.c cVar, ua.b bVar2, i iVar, aa.g gVar) {
        q qVar = new q(context, vVar, aVar, bVar, cVar);
        fa.d dVar = new fa.d(fVar, cVar, iVar);
        da.a aVar2 = ga.a.f12182b;
        n5.s.b(context);
        return new x(qVar, dVar, new ga.a(new ga.c(n5.s.a().c(new l5.a(ga.a.f12183c, ga.a.d)).a("FIREBASE_CRASHLYTICS_REPORT", new k5.c("json"), ga.a.f12184e), cVar.b(), bVar2)), fVar2, o3Var, vVar, gVar);
    }

    public static List f(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                String str2 = (String) entry.getValue();
                if (str2 != null) {
                    arrayList.add(new h0(str, str2));
                } else {
                    throw new NullPointerException("Null value");
                }
            } else {
                throw new NullPointerException("Null key");
            }
        }
        Collections.sort(arrayList, new i1(11));
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public final ApplicationExitInfo e(String str, List list, Predicate predicate) {
        long lastModified = this.f60258b.f11535b.b(str, "start-time").lastModified();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo applicationExitInfo = (ApplicationExitInfo) it.next();
            if (applicationExitInfo.getTimestamp() >= lastModified && predicate.test(applicationExitInfo)) {
                return applicationExitInfo;
            }
        }
        return null;
    }

    public final void g(Throwable th2, Thread thread, String str, ba.c cVar, boolean z10) {
        Boolean bool;
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it;
        byte b10;
        boolean z11;
        boolean equals = str.equals("crash");
        long j10 = cVar.f3175b;
        q qVar = this.f60257a;
        Context context = qVar.f60230a;
        int i3 = context.getResources().getConfiguration().orientation;
        tf.b bVar = qVar.d;
        Stack stack = new Stack();
        for (Throwable th3 = th2; th3 != null; th3 = th3.getCause()) {
            stack.push(th3);
        }
        za.p pVar = null;
        while (!stack.isEmpty()) {
            Throwable th4 = (Throwable) stack.pop();
            pVar = new za.p(th4.getLocalizedMessage(), th4.getClass().getName(), bVar.A(th4.getStackTrace()), pVar);
        }
        ?? obj = new Object();
        obj.f4534b = str;
        obj.f4533a = j10;
        obj.f4538g = (byte) (obj.f4538g | 1);
        j2 b11 = w9.d.f57427a.b(context);
        int i10 = ((e1) b11).f4365c;
        if (i10 > 0) {
            if (i10 != 100) {
                z11 = true;
            } else {
                z11 = false;
            }
            bool = Boolean.valueOf(z11);
        } else {
            bool = null;
        }
        ArrayList a10 = w9.d.a(context);
        byte b12 = (byte) 1;
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) pVar.f60313c;
        String name = thread.getName();
        if (name != null) {
            byte b13 = (byte) 1;
            List d = q.d(stackTraceElementArr, 4);
            if (d != null) {
                Boolean bool2 = bool;
                if (b13 == 1) {
                    arrayList.add(new a1(name, 4, d));
                    if (z10) {
                        Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = Thread.getAllStackTraces().entrySet().iterator();
                        while (it2.hasNext()) {
                            Map.Entry<Thread, StackTraceElement[]> next = it2.next();
                            Thread key = next.getKey();
                            if (!key.equals(thread)) {
                                StackTraceElement[] A = bVar.A(next.getValue());
                                String name2 = key.getName();
                                if (name2 != null) {
                                    it = it2;
                                    List d10 = q.d(A, 0);
                                    if (d10 != null) {
                                        if (b13 == 1) {
                                            b10 = b13;
                                            arrayList.add(new a1(name2, 0, d10));
                                        } else {
                                            byte b14 = b13;
                                            StringBuilder sb2 = new StringBuilder();
                                            if (b14 == 0) {
                                                sb2.append(" importance");
                                            }
                                            throw new IllegalStateException(t4.c.g("Missing required properties:", sb2));
                                        }
                                    } else {
                                        throw new NullPointerException("Null frames");
                                    }
                                } else {
                                    throw new NullPointerException("Null name");
                                }
                            } else {
                                it = it2;
                                b10 = b13;
                            }
                            it2 = it;
                            b13 = b10;
                        }
                    }
                    List unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
                    y0 c2 = q.c(pVar, 0);
                    z0 e10 = q.e();
                    List a11 = qVar.a();
                    if (a11 != null) {
                        w0 w0Var = new w0(unmodifiableList, c2, null, null, e10, a11);
                        if (b12 == 1) {
                            obj.f4535c = new v0(w0Var, null, null, bool2, b11, a10, i3);
                            obj.d = qVar.b(i3);
                            t0 a12 = obj.a();
                            Map map = cVar.f3176c;
                            ba.f fVar = this.d;
                            o3 o3Var = this.f60260e;
                            q2 b15 = b(a(a12, fVar, o3Var, map), o3Var);
                            if (!z10) {
                                this.f60262g.f287b.a(new rn(this, b15, cVar, equals, 18));
                                return;
                            } else {
                                this.f60258b.e(b15, cVar.f3174a, equals);
                                return;
                            }
                        }
                        StringBuilder sb3 = new StringBuilder();
                        if (b12 == 0) {
                            sb3.append(" uiOrientation");
                        }
                        throw new IllegalStateException(t4.c.g("Missing required properties:", sb3));
                    }
                    throw new NullPointerException("Null binaries");
                }
                StringBuilder sb4 = new StringBuilder();
                if (b13 == 0) {
                    sb4.append(" importance");
                }
                throw new IllegalStateException(t4.c.g("Missing required properties:", sb4));
            }
            throw new NullPointerException("Null frames");
        }
        throw new NullPointerException("Null name");
    }

    public final Task h(String str, Executor executor) {
        TaskCompletionSource taskCompletionSource;
        ArrayList c2 = this.f60258b.c();
        ArrayList arrayList = new ArrayList();
        int size = c2.size();
        int i3 = 0;
        while (i3 < size) {
            int i10 = i3 + 1;
            File file = (File) c2.get(i3);
            try {
                da.a aVar = fa.d.f11532g;
                String f10 = fa.d.f(file);
                aVar.getClass();
                arrayList.add(new b(da.a.j(f10), file.getName(), file));
            } catch (IOException e10) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e10);
                file.delete();
            }
            i3 = i10;
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj = arrayList.get(i11);
            i11++;
            b bVar = (b) obj;
            if (str == null || str.equals(bVar.f60165b)) {
                ga.a aVar2 = this.f60259c;
                d0 d0Var = bVar.f60164a;
                boolean z10 = true;
                if (d0Var.f4341f == null || d0Var.f4342g == null) {
                    u b10 = this.f60261f.b(true);
                    d0 d0Var2 = bVar.f60164a;
                    String str2 = b10.f60246a;
                    c0 a10 = d0Var2.a();
                    a10.f4315e = str2;
                    d0 a11 = a10.a();
                    String str3 = b10.f60247b;
                    c0 a12 = a11.a();
                    a12.f4316f = str3;
                    bVar = new b(a12.a(), bVar.f60165b, bVar.f60166c);
                }
                if (str == null) {
                    z10 = false;
                }
                ga.c cVar = aVar2.f12185a;
                synchronized (cVar.f12194f) {
                    try {
                        taskCompletionSource = new TaskCompletionSource();
                        if (z10) {
                            ((AtomicInteger) cVar.f12196i.f55783b).getAndIncrement();
                            if (cVar.f12194f.size() < cVar.f12193e) {
                                w9.c cVar2 = w9.c.f57426a;
                                cVar2.b("Enqueueing report: " + bVar.f60165b);
                                cVar2.b("Queue size: " + cVar.f12194f.size());
                                cVar.f12195g.execute(new j1(cVar, bVar, taskCompletionSource, 4));
                                cVar2.b("Closing task for report: " + bVar.f60165b);
                                taskCompletionSource.trySetResult(bVar);
                            } else {
                                cVar.a();
                                String str4 = "Dropping report due to queue being full: " + bVar.f60165b;
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", str4, null);
                                }
                                ((AtomicInteger) cVar.f12196i.f55784c).getAndIncrement();
                                taskCompletionSource.trySetResult(bVar);
                            }
                        } else {
                            cVar.b(bVar, taskCompletionSource);
                        }
                    } finally {
                    }
                }
                arrayList2.add(taskCompletionSource.getTask().continueWith(executor, new j(this)));
            }
        }
        return Tasks.whenAll(arrayList2);
    }
}
