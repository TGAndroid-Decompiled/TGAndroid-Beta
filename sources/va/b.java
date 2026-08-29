package va;

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
    public static final Pattern f49486w = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    public static final String[] f49487x = new String[128];
    public static final String[] f49488y;
    public final Writer f49489a;
    public int[] f49490b;
    public int f49491c;
    public na.c d;
    public String f49492e;
    public String f49493f;
    public boolean h;
    public int f49494n;
    public boolean f49495r;
    public String f49496s;
    public boolean v;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f49487x[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f49487x;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f49488y = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public b(Writer writer) {
        int[] iArr = new int[32];
        this.f49490b = iArr;
        this.f49491c = 0;
        if (iArr.length == 0) {
            this.f49490b = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f49490b;
        int i10 = this.f49491c;
        this.f49491c = i10 + 1;
        iArr2[i10] = 6;
        this.f49494n = 2;
        this.v = true;
        Objects.requireNonNull(writer, "out == null");
        this.f49489a = writer;
        k(na.c.d);
    }

    public final void a() {
        int j10 = j();
        if (j10 != 1) {
            Writer writer = this.f49489a;
            if (j10 != 2) {
                if (j10 != 4) {
                    if (j10 != 6) {
                        if (j10 == 7) {
                            if (this.f49494n != 1) {
                                throw new IllegalStateException("JSON must have only one top-level value.");
                            }
                        } else {
                            throw new IllegalStateException("Nesting problem.");
                        }
                    }
                    this.f49490b[this.f49491c - 1] = 7;
                    return;
                }
                writer.append((CharSequence) this.f49492e);
                this.f49490b[this.f49491c - 1] = 5;
                return;
            }
            writer.append((CharSequence) this.f49493f);
            h();
            return;
        }
        this.f49490b[this.f49491c - 1] = 2;
        h();
    }

    public void b() {
        t();
        a();
        int i10 = this.f49491c;
        int[] iArr = this.f49490b;
        if (i10 == iArr.length) {
            this.f49490b = Arrays.copyOf(iArr, i10 * 2);
        }
        int[] iArr2 = this.f49490b;
        int i11 = this.f49491c;
        this.f49491c = i11 + 1;
        iArr2[i11] = 1;
        this.f49489a.write(91);
    }

    public void c() {
        t();
        a();
        int i10 = this.f49491c;
        int[] iArr = this.f49490b;
        if (i10 == iArr.length) {
            this.f49490b = Arrays.copyOf(iArr, i10 * 2);
        }
        int[] iArr2 = this.f49490b;
        int i11 = this.f49491c;
        this.f49491c = i11 + 1;
        iArr2[i11] = 3;
        this.f49489a.write(123);
    }

    @Override
    public void close() {
        this.f49489a.close();
        int i10 = this.f49491c;
        if (i10 <= 1 && (i10 != 1 || this.f49490b[i10 - 1] == 7)) {
            this.f49491c = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    public final void d(char c3, int i10, int i11) {
        int j10 = j();
        if (j10 != i11 && j10 != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f49496s == null) {
            this.f49491c--;
            if (j10 == i11) {
                h();
            }
            this.f49489a.write(c3);
            return;
        }
        throw new IllegalStateException("Dangling name: " + this.f49496s);
    }

    public void e() {
        d(']', 1, 2);
    }

    public void f() {
        d('}', 3, 5);
    }

    public void flush() {
        if (this.f49491c != 0) {
            this.f49489a.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public void g(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f49496s == null) {
            int j10 = j();
            if (j10 != 3 && j10 != 5) {
                throw new IllegalStateException("Please begin an object before writing a name.");
            }
            this.f49496s = str;
            return;
        }
        throw new IllegalStateException("Already wrote a name, expecting a value.");
    }

    public final void h() {
        if (!this.h) {
            String str = this.d.f17177a;
            Writer writer = this.f49489a;
            writer.write(str);
            int i10 = this.f49491c;
            for (int i11 = 1; i11 < i10; i11++) {
                writer.write(this.d.f17178b);
            }
        }
    }

    public b i() {
        if (this.f49496s != null) {
            if (this.v) {
                t();
            } else {
                this.f49496s = null;
                return this;
            }
        }
        a();
        this.f49489a.write("null");
        return this;
    }

    public final int j() {
        int i10 = this.f49491c;
        if (i10 != 0) {
            return this.f49490b[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void k(na.c cVar) {
        boolean z10;
        Objects.requireNonNull(cVar);
        this.d = cVar;
        this.f49493f = ",";
        if (cVar.f17179c) {
            this.f49492e = ": ";
            if (cVar.f17177a.isEmpty()) {
                this.f49493f = ", ";
            }
        } else {
            this.f49492e = ":";
        }
        if (this.d.f17177a.isEmpty() && this.d.f17178b.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h = z10;
    }

    public final void l(int i10) {
        if (i10 != 0) {
            this.f49494n = i10;
            return;
        }
        throw null;
    }

    public final void m(java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: va.b.m(java.lang.String):void");
    }

    public void n(double d) {
        t();
        if (this.f49494n != 1 && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        }
        a();
        this.f49489a.append((CharSequence) Double.toString(d));
    }

    public void o(long j10) {
        t();
        a();
        this.f49489a.write(Long.toString(j10));
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
        this.f49489a.write(str);
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
            if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class && !f49486w.matcher(obj).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + obj);
            }
        } else if (this.f49494n != 1) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(obj));
        }
        a();
        this.f49489a.append((CharSequence) obj);
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

    public void s(boolean z10) {
        String str;
        t();
        a();
        if (z10) {
            str = "true";
        } else {
            str = "false";
        }
        this.f49489a.write(str);
    }

    public final void t() {
        if (this.f49496s != null) {
            int j10 = j();
            if (j10 == 5) {
                this.f49489a.write(this.f49493f);
            } else if (j10 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            h();
            this.f49490b[this.f49491c - 1] = 4;
            m(this.f49496s);
            this.f49496s = null;
        }
    }
}
