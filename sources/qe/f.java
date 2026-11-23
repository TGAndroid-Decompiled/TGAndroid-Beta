package qe;

import a4.k;
import c8.w9;
import c8.x9;
import com.google.android.gms.internal.vision.e2;
import w7.s;
public abstract class f {
    public static final g f56238a = new Object();

    public static final me.d a(me.d dVar, s module) {
        kotlin.jvm.internal.j.e(dVar, "<this>");
        kotlin.jvm.internal.j.e(module, "module");
        if (kotlin.jvm.internal.j.a(dVar.e(), me.e.f21062b)) {
            w9.a(dVar);
            return dVar;
        } else if (dVar.isInline()) {
            return a(dVar.i(0), module);
        } else {
            return dVar;
        }
    }

    public static final byte b(char c10) {
        if (c10 < '~') {
            return c.f56235b[c10];
        }
        return (byte) 0;
    }

    public static final void c(k kVar, String str) {
        kVar.m(kVar.f191b - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final CharSequence d(int i7, CharSequence charSequence) {
        String str;
        int length;
        kotlin.jvm.internal.j.e(charSequence, "<this>");
        if (charSequence.length() >= 200) {
            String str2 = ".....";
            if (i7 == -1) {
                if (charSequence.length() - 60 > 0) {
                    return "....." + charSequence.subSequence(length, charSequence.length()).toString();
                }
            } else {
                int i10 = i7 - 30;
                int i11 = i7 + 30;
                if (i10 > 0) {
                    str = ".....";
                } else {
                    str = "";
                }
                if (i11 >= charSequence.length()) {
                    str2 = "";
                }
                StringBuilder m10 = e2.m(str);
                if (i10 < 0) {
                    i10 = 0;
                }
                int length2 = charSequence.length();
                if (i11 > length2) {
                    i11 = length2;
                }
                m10.append(charSequence.subSequence(i10, i11).toString());
                m10.append(str2);
                return m10.toString();
            }
        }
        return charSequence;
    }

    public static final void e(me.d dVar, pe.b json) {
        kotlin.jvm.internal.j.e(dVar, "<this>");
        kotlin.jvm.internal.j.e(json, "json");
        if (kotlin.jvm.internal.j.a(dVar.e(), me.f.f21064b)) {
            json.f55695a.getClass();
        }
    }

    public static final j f(me.d desc, pe.b bVar) {
        kotlin.jvm.internal.j.e(desc, "desc");
        x9 e10 = desc.e();
        if (e10 instanceof me.a) {
            return j.f56250f;
        }
        if (kotlin.jvm.internal.j.a(e10, me.f.f21065c)) {
            return j.d;
        }
        if (kotlin.jvm.internal.j.a(e10, me.f.d)) {
            me.d a10 = a(desc.i(0), bVar.f55696b);
            x9 e11 = a10.e();
            if (!(e11 instanceof me.c) && !kotlin.jvm.internal.j.a(e11, me.e.f21063c)) {
                bVar.f55695a.getClass();
                throw new d("Value of type '" + a10.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + a10.e() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
            }
            return j.f56249e;
        }
        return j.f56248c;
    }
}
