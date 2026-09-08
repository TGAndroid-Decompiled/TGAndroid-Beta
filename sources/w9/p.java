package w9;

import android.content.Context;
import com.google.android.gms.internal.vision.e2;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import n4.y;
import y9.o0;
import y9.p0;
public final class p {
    public static final HashMap f48461f;
    public static final String f48462g;
    public final Context f48463a;
    public final u f48464b;
    public final a f48465c;
    public final y d;
    public final da.b f48466e;

    static {
        HashMap hashMap = new HashMap();
        f48461f = hashMap;
        e2.o(5, hashMap, "armeabi", 6, "armeabi-v7a");
        e2.o(9, hashMap, "arm64-v8a", 0, "x86");
        hashMap.put("x86_64", 1);
        Locale locale = Locale.US;
        f48462g = "Crashlytics Android SDK/18.6.0";
    }

    public p(Context context, u uVar, a aVar, y yVar, da.b bVar) {
        this.f48463a = context;
        this.f48464b = uVar;
        this.f48465c = aVar;
        this.d = yVar;
        this.f48466e = bVar;
    }

    public static p0 c(com.google.firebase.messaging.s sVar, int i10) {
        int i11;
        String str = (String) sVar.f6419c;
        String str2 = (String) sVar.f6418b;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) sVar.d;
        int i12 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        com.google.firebase.messaging.s sVar2 = (com.google.firebase.messaging.s) sVar.f6420e;
        if (i10 >= 8) {
            com.google.firebase.messaging.s sVar3 = sVar2;
            while (sVar3 != null) {
                sVar3 = (com.google.firebase.messaging.s) sVar3.f6420e;
                i12++;
            }
            i11 = i12;
        } else {
            i11 = 0;
        }
        List d = d(stackTraceElementArr, 4);
        if (d != null) {
            p0 p0Var = null;
            if (sVar2 != null && i11 == 0) {
                p0Var = c(sVar2, i10 + 1);
            }
            return new p0(str, str2, d, p0Var, i11);
        }
        throw new NullPointerException("Null frames");
    }

    public static List d(StackTraceElement[] stackTraceElementArr, int i10) {
        long j3;
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            ?? obj = new Object();
            obj.f4826e = Integer.valueOf(i10);
            long j10 = 0;
            if (stackTraceElement.isNativeMethod()) {
                j3 = Math.max(stackTraceElement.getLineNumber(), 0L);
            } else {
                j3 = 0;
            }
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                j10 = stackTraceElement.getLineNumber();
            }
            obj.f4823a = Long.valueOf(j3);
            if (str != null) {
                obj.f4824b = str;
                obj.f4825c = fileName;
                obj.d = Long.valueOf(j10);
                arrayList.add(obj.l());
            } else {
                throw new NullPointerException("Null symbol");
            }
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public final List a() {
        a aVar = this.f48465c;
        String str = aVar.f48401e;
        if (str != null) {
            return Collections.singletonList(new o0(str, 0L, 0L, aVar.f48399b));
        }
        throw new NullPointerException("Null name");
    }

    public final y9.u0 b(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: w9.p.b(int):y9.u0");
    }
}
