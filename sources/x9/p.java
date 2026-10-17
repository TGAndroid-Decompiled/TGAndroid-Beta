package x9;

import android.content.Context;
import com.google.android.gms.internal.cast.a6;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import z9.o0;
import z9.p0;
public final class p {
    public static final HashMap f49739f;
    public static final String f49740g;
    public final Context f49741a;
    public final u f49742b;
    public final a f49743c;
    public final qf.b d;
    public final ea.b e;

    static {
        HashMap hashMap = new HashMap();
        f49739f = hashMap;
        a6.n(5, hashMap, "armeabi", 6, "armeabi-v7a");
        a6.n(9, hashMap, "arm64-v8a", 0, "x86");
        hashMap.put("x86_64", 1);
        Locale locale = Locale.US;
        f49740g = "Crashlytics Android SDK/18.6.0";
    }

    public p(Context context, u uVar, a aVar, qf.b bVar, ea.b bVar2) {
        this.f49741a = context;
        this.f49742b = uVar;
        this.f49743c = aVar;
        this.d = bVar;
        this.e = bVar2;
    }

    public static p0 c(com.google.firebase.messaging.r rVar, int i10) {
        String str = (String) rVar.f7663c;
        String str2 = (String) rVar.f7662b;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) rVar.d;
        int i11 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        com.google.firebase.messaging.r rVar2 = (com.google.firebase.messaging.r) rVar.e;
        if (i10 >= 8) {
            com.google.firebase.messaging.r rVar3 = rVar2;
            while (rVar3 != null) {
                rVar3 = (com.google.firebase.messaging.r) rVar3.e;
                i11++;
            }
        }
        int i12 = i11;
        List d = d(stackTraceElementArr, 4);
        if (d != null) {
            p0 p0Var = null;
            if (rVar2 != null && i12 == 0) {
                p0Var = c(rVar2, i10 + 1);
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
            obj.f6883b = Long.valueOf(j10);
            if (str != null) {
                obj.f6882a = str;
                obj.f6884c = fileName;
                obj.d = Long.valueOf(j11);
                arrayList.add(obj.p());
            } else {
                throw new NullPointerException("Null symbol");
            }
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public final List a() {
        a aVar = this.f49743c;
        String str = aVar.e;
        if (str != null) {
            return Collections.singletonList(new o0(str, 0L, 0L, aVar.f49682b));
        }
        throw new NullPointerException("Null name");
    }

    public final z9.u0 b(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: x9.p.b(int):z9.u0");
    }
}
