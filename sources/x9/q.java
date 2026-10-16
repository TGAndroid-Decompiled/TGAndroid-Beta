package x9;

import android.content.Context;
import com.google.android.gms.internal.play_billing.k3;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import z9.o0;
import z9.p0;
public final class q {
    public static final HashMap f48332f;
    public static final String f48333g;
    public final Context f48334a;
    public final v f48335b;
    public final a f48336c;
    public final qf.b d;
    public final ea.b e;

    static {
        HashMap hashMap = new HashMap();
        f48332f = hashMap;
        k3.n(5, hashMap, "armeabi", 6, "armeabi-v7a");
        k3.n(9, hashMap, "arm64-v8a", 0, "x86");
        hashMap.put("x86_64", 1);
        Locale locale = Locale.US;
        f48333g = "Crashlytics Android SDK/18.6.0";
    }

    public q(Context context, v vVar, a aVar, qf.b bVar, ea.b bVar2) {
        this.f48334a = context;
        this.f48335b = vVar;
        this.f48336c = aVar;
        this.d = bVar;
        this.e = bVar2;
    }

    public static p0 c(com.google.firebase.messaging.s sVar, int i10) {
        String str = (String) sVar.f6210c;
        String str2 = (String) sVar.f6209b;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) sVar.d;
        int i11 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        com.google.firebase.messaging.s sVar2 = (com.google.firebase.messaging.s) sVar.e;
        if (i10 >= 8) {
            com.google.firebase.messaging.s sVar3 = sVar2;
            while (sVar3 != null) {
                sVar3 = (com.google.firebase.messaging.s) sVar3.e;
                i11++;
            }
        }
        int i12 = i11;
        List d = d(stackTraceElementArr, 4);
        if (d != null) {
            p0 p0Var = null;
            if (sVar2 != null && i12 == 0) {
                p0Var = c(sVar2, i10 + 1);
            }
            return new p0(str, str2, d, p0Var, i12);
        }
        throw new NullPointerException("Null frames");
    }

    public static List d(StackTraceElement[] stackTraceElementArr, int i10) {
        long j10;
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            ?? obj = new Object();
            obj.e = Integer.valueOf(i10);
            long j11 = 0;
            if (stackTraceElement.isNativeMethod()) {
                j10 = Math.max(stackTraceElement.getLineNumber(), 0L);
            } else {
                j10 = 0;
            }
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                j11 = stackTraceElement.getLineNumber();
            }
            obj.f5429b = Long.valueOf(j10);
            if (str != null) {
                obj.f5428a = str;
                obj.f5430c = fileName;
                obj.d = Long.valueOf(j11);
                arrayList.add(obj.k());
            } else {
                throw new NullPointerException("Null symbol");
            }
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public final List a() {
        a aVar = this.f48336c;
        String str = aVar.e;
        if (str != null) {
            return Collections.singletonList(new o0(str, 0L, 0L, aVar.f48273b));
        }
        throw new NullPointerException("Null name");
    }

    public final z9.u0 b(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: x9.q.b(int):z9.u0");
    }
}
