package z9;

import android.content.Context;
import ca.x0;
import ca.y0;
import ca.z0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
public final class q {
    public static final HashMap f60228f;
    public static final String f60229g;
    public final Context f60230a;
    public final v f60231b;
    public final a f60232c;
    public final tf.b d;
    public final ha.c f60233e;

    static {
        HashMap hashMap = new HashMap();
        f60228f = hashMap;
        com.google.android.recaptcha.internal.a.p(5, hashMap, "armeabi", 6, "armeabi-v7a");
        com.google.android.recaptcha.internal.a.p(9, hashMap, "arm64-v8a", 0, "x86");
        hashMap.put("x86_64", 1);
        Locale locale = Locale.US;
        f60229g = "Crashlytics Android SDK/20.1.1";
    }

    public q(Context context, v vVar, a aVar, tf.b bVar, ha.c cVar) {
        this.f60230a = context;
        this.f60231b = vVar;
        this.f60232c = aVar;
        this.d = bVar;
        this.f60233e = cVar;
    }

    public static y0 c(za.p pVar, int i3) {
        String str = (String) pVar.f60312b;
        String str2 = (String) pVar.f60311a;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) pVar.f60313c;
        int i10 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        za.p pVar2 = (za.p) pVar.d;
        if (i3 >= 8) {
            za.p pVar3 = pVar2;
            while (pVar3 != null) {
                pVar3 = (za.p) pVar3.d;
                i10++;
            }
        }
        int i11 = i10;
        List d = d(stackTraceElementArr, 4);
        if (d != null) {
            byte b10 = (byte) (0 | 1);
            y0 y0Var = null;
            if (pVar2 != null && i11 == 0) {
                y0Var = c(pVar2, i3 + 1);
            }
            if (b10 == 1) {
                return new y0(str, str2, d, y0Var, i11);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((b10 & 1) == 0) {
                sb2.append(" overflowCount");
            }
            throw new IllegalStateException(t4.c.g("Missing required properties:", sb2));
        }
        throw new NullPointerException("Null frames");
    }

    public static List d(StackTraceElement[] stackTraceElementArr, int i3) {
        long j10;
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            ?? obj = new Object();
            obj.f4307e = i3;
            obj.f4308f = (byte) (obj.f4308f | 4);
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
            obj.f4304a = j10;
            byte b10 = (byte) (obj.f4308f | 1);
            obj.f4308f = b10;
            if (str != null) {
                obj.f4305b = str;
                obj.f4306c = fileName;
                obj.d = j11;
                obj.f4308f = (byte) (b10 | 2);
                arrayList.add(obj.a());
            } else {
                throw new NullPointerException("Null symbol");
            }
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static z0 e() {
        byte b10 = (byte) 1;
        if (b10 == 1) {
            return new z0(0L, "0", "0");
        }
        StringBuilder sb2 = new StringBuilder();
        if (b10 == 0) {
            sb2.append(" address");
        }
        throw new IllegalStateException(t4.c.g("Missing required properties:", sb2));
    }

    public final List a() {
        byte b10 = (byte) (((byte) (0 | 1)) | 2);
        a aVar = this.f60232c;
        String str = aVar.f60161e;
        if (str != null) {
            String str2 = aVar.f60159b;
            if (b10 == 3) {
                return Collections.singletonList(new x0(str, str2, 0L, 0L));
            }
            StringBuilder sb2 = new StringBuilder();
            if ((b10 & 1) == 0) {
                sb2.append(" baseAddress");
            }
            if ((b10 & 2) == 0) {
                sb2.append(" size");
            }
            throw new IllegalStateException(t4.c.g("Missing required properties:", sb2));
        }
        throw new NullPointerException("Null name");
    }

    public final ca.g1 b(int r17) {
        throw new UnsupportedOperationException("Method not decompiled: z9.q.b(int):ca.g1");
    }
}
