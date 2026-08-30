package xa;

import j$.util.Objects;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
public class b implements Closeable, Flushable {
    public static final Pattern f46876w = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    public static final String[] f46877x = new String[128];
    public static final String[] f46878y;
    public final Writer f46879a;
    public int[] f46880b;
    public int f46881c;
    public pa.c d;
    public String e;
    public String f46882f;
    public boolean h;
    public int f46883n;
    public boolean f46884r;
    public String f46885s;
    public boolean v;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f46877x[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f46877x;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f46878y = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public b(Writer writer) {
        int[] iArr = new int[32];
        this.f46880b = iArr;
        this.f46881c = 0;
        if (iArr.length == 0) {
            this.f46880b = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f46880b;
        int i10 = this.f46881c;
        this.f46881c = i10 + 1;
        iArr2[i10] = 6;
        this.f46883n = 2;
        this.v = true;
        Objects.requireNonNull(writer, "out == null");
        this.f46879a = writer;
        k(pa.c.d);
    }

    public final void a() {
        int j10 = j();
        if (j10 != 1) {
            Writer writer = this.f46879a;
            if (j10 != 2) {
                if (j10 != 4) {
                    if (j10 != 6) {
                        if (j10 == 7) {
                            if (this.f46883n != 1) {
                                throw new IllegalStateException("JSON must have only one top-level value.");
                            }
                        } else {
                            throw new IllegalStateException("Nesting problem.");
                        }
                    }
                    this.f46880b[this.f46881c - 1] = 7;
                    return;
                }
                writer.append((CharSequence) this.e);
                this.f46880b[this.f46881c - 1] = 5;
                return;
            }
            writer.append((CharSequence) this.f46882f);
            h();
            return;
        }
        this.f46880b[this.f46881c - 1] = 2;
        h();
    }

    public void b() {
        t();
        a();
        int i10 = this.f46881c;
        int[] iArr = this.f46880b;
        if (i10 == iArr.length) {
            this.f46880b = Arrays.copyOf(iArr, i10 * 2);
        }
        int[] iArr2 = this.f46880b;
        int i11 = this.f46881c;
        this.f46881c = i11 + 1;
        iArr2[i11] = 1;
        this.f46879a.write(91);
    }

    public void c() {
        t();
        a();
        int i10 = this.f46881c;
        int[] iArr = this.f46880b;
        if (i10 == iArr.length) {
            this.f46880b = Arrays.copyOf(iArr, i10 * 2);
        }
        int[] iArr2 = this.f46880b;
        int i11 = this.f46881c;
        this.f46881c = i11 + 1;
        iArr2[i11] = 3;
        this.f46879a.write(123);
    }

    @Override
    public void close() {
        this.f46879a.close();
        int i10 = this.f46881c;
        if (i10 <= 1 && (i10 != 1 || this.f46880b[i10 - 1] == 7)) {
            this.f46881c = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    public final void d(char c3, int i10, int i11) {
        int j10 = j();
        if (j10 != i11 && j10 != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f46885s == null) {
            this.f46881c--;
            if (j10 == i11) {
                h();
            }
            this.f46879a.write(c3);
            return;
        }
        throw new IllegalStateException("Dangling name: " + this.f46885s);
    }

    public void e() {
        d(']', 1, 2);
    }

    public void f() {
        d('}', 3, 5);
    }

    public void flush() {
        if (this.f46881c != 0) {
            this.f46879a.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public void g(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f46885s == null) {
            int j10 = j();
            if (j10 != 3 && j10 != 5) {
                throw new IllegalStateException("Please begin an object before writing a name.");
            }
            this.f46885s = str;
            return;
        }
        throw new IllegalStateException("Already wrote a name, expecting a value.");
    }

    public final void h() {
        if (!this.h) {
            String str = this.d.f41072a;
            Writer writer = this.f46879a;
            writer.write(str);
            int i10 = this.f46881c;
            for (int i11 = 1; i11 < i10; i11++) {
                writer.write(this.d.f41073b);
            }
        }
    }

    public b i() {
        if (this.f46885s != null) {
            if (this.v) {
                t();
            } else {
                this.f46885s = null;
                return this;
            }
        }
        a();
        this.f46879a.write("null");
        return this;
    }

    public final int j() {
        int i10 = this.f46881c;
        if (i10 != 0) {
            return this.f46880b[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void k(pa.c cVar) {
        boolean z4;
        Objects.requireNonNull(cVar);
        this.d = cVar;
        this.f46882f = ",";
        if (cVar.f41074c) {
            this.e = ": ";
            if (cVar.f41072a.isEmpty()) {
                this.f46882f = ", ";
            }
        } else {
            this.e = ":";
        }
        if (this.d.f41072a.isEmpty() && this.d.f41073b.isEmpty()) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.h = z4;
    }

    public final void l(int i10) {
        if (i10 != 0) {
            this.f46883n = i10;
            return;
        }
        throw null;
    }

    public final void m(java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: xa.b.m(java.lang.String):void");
    }

    public void n(double d) {
        t();
        if (this.f46883n != 1 && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        }
        a();
        this.f46879a.append((CharSequence) Double.toString(d));
    }

    public void o(long j10) {
        t();
        a();
        this.f46879a.write(Long.toString(j10));
    }

    public void p(Boolean bool) {
        String str;
        if (bool == null) {
            i();
            return;
        }
        t();
        a();
        if (bool.booleanValue()) {
            str = "true";
        } else {
            str = "false";
        }
        this.f46879a.write(str);
    }

    public void q(Number number) {
        if (number == null) {
            i();
            return;
        }
        t();
        String obj = number.toString();
        if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class && !f46876w.matcher(obj).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + obj);
            }
        } else if (this.f46883n != 1) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(obj));
        }
        a();
        this.f46879a.append((CharSequence) obj);
    }

    public void r(String str) {
        if (str == null) {
            i();
            return;
        }
        t();
        a();
        m(str);
    }

    public void s(boolean z4) {
        String str;
        t();
        a();
        if (z4) {
            str = "true";
        } else {
            str = "false";
        }
        this.f46879a.write(str);
    }

    public final void t() {
        if (this.f46885s != null) {
            int j10 = j();
            if (j10 == 5) {
                this.f46879a.write(this.f46882f);
            } else if (j10 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            h();
            this.f46880b[this.f46881c - 1] = 4;
            m(this.f46885s);
            this.f46885s = null;
        }
    }
}
