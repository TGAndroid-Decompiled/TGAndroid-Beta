package y9;

import aa.b0;
import aa.q0;
import aa.r0;
import android.content.Context;
import c3.h0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
public final class q {
    public static final HashMap f52470f;
    public static final String f52471g;
    public final Context f52472a;
    public final v f52473b;
    public final a f52474c;
    public final rf.b d;
    public final b0 e;

    static {
        HashMap hashMap = new HashMap();
        f52470f = hashMap;
        h0.o(5, hashMap, "armeabi", 6, "armeabi-v7a");
        h0.o(9, hashMap, "arm64-v8a", 0, "x86");
        hashMap.put("x86_64", 1);
        Locale locale = Locale.US;
        f52471g = "Crashlytics Android SDK/18.6.0";
    }

    public q(Context context, v vVar, a aVar, rf.b bVar, b0 b0Var) {
        this.f52472a = context;
        this.f52473b = vVar;
        this.f52474c = aVar;
        this.d = bVar;
        this.e = b0Var;
    }

    public static r0 c(com.google.firebase.messaging.q qVar, int i10) {
        String str = (String) qVar.f7758b;
        String str2 = (String) qVar.f7757a;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) qVar.f7759c;
        int i11 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        com.google.firebase.messaging.q qVar2 = (com.google.firebase.messaging.q) qVar.d;
        if (i10 >= 8) {
            com.google.firebase.messaging.q qVar3 = qVar2;
            while (qVar3 != null) {
                qVar3 = (com.google.firebase.messaging.q) qVar3.d;
                i11++;
            }
        }
        int i12 = i11;
        List d = d(stackTraceElementArr, 4);
        if (d != null) {
            r0 r0Var = null;
            if (qVar2 != null && i12 == 0) {
                r0Var = c(qVar2, i10 + 1);
            }
            return new r0(str, str2, d, r0Var, i12);
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
            obj.f614a = Long.valueOf(j10);
            if (str != null) {
                obj.f615b = str;
                obj.f616c = fileName;
                obj.d = Long.valueOf(j11);
                arrayList.add(obj.r());
            } else {
                throw new NullPointerException("Null symbol");
            }
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public final List a() {
        a aVar = this.f52474c;
        String str = aVar.e;
        if (str != null) {
            return Collections.singletonList(new q0(str, 0L, 0L, aVar.f52411b));
        }
        throw new NullPointerException("Null name");
    }

    public final aa.w0 b(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: y9.q.b(int):aa.w0");
    }
}
