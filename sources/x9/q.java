package x9;

import android.content.Context;
import c3.i0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import z9.o0;
import z9.p0;
public final class q {
    public static final HashMap f53514f;
    public static final String f53515g;
    public final Context f53516a;
    public final v f53517b;
    public final a f53518c;
    public final n4.q d;
    public final ea.d e;

    static {
        HashMap hashMap = new HashMap();
        f53514f = hashMap;
        i0.o(5, hashMap, "armeabi", 6, "armeabi-v7a");
        i0.o(9, hashMap, "arm64-v8a", 0, "x86");
        hashMap.put("x86_64", 1);
        Locale locale = Locale.US;
        f53515g = "Crashlytics Android SDK/18.6.0";
    }

    public q(Context context, v vVar, a aVar, n4.q qVar, ea.d dVar) {
        this.f53516a = context;
        this.f53517b = vVar;
        this.f53518c = aVar;
        this.d = qVar;
        this.e = dVar;
    }

    public static p0 c(ji.f fVar, int i10) {
        String str = (String) fVar.f10443c;
        String str2 = (String) fVar.f10442b;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) fVar.d;
        int i11 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        ji.f fVar2 = (ji.f) fVar.e;
        if (i10 >= 8) {
            ji.f fVar3 = fVar2;
            while (fVar3 != null) {
                fVar3 = (ji.f) fVar3.e;
                i11++;
            }
        }
        int i12 = i11;
        List d = d(stackTraceElementArr, 4);
        if (d != null) {
            p0 p0Var = null;
            if (fVar2 != null && i12 == 0) {
                p0Var = c(fVar2, i10 + 1);
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
            obj.f2777a = Long.valueOf(j10);
            if (str != null) {
                obj.f2778b = str;
                obj.f2779c = fileName;
                obj.d = Long.valueOf(j11);
                arrayList.add(obj.m());
            } else {
                throw new NullPointerException("Null symbol");
            }
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public final List a() {
        a aVar = this.f53518c;
        String str = aVar.e;
        if (str != null) {
            return Collections.singletonList(new o0(str, aVar.f53454b, 0L, 0L));
        }
        throw new NullPointerException("Null name");
    }

    public final z9.u0 b(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: x9.q.b(int):z9.u0");
    }
}
