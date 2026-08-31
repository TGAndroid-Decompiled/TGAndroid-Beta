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
    public static final Pattern f50485w = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    public static final String[] f50486x = new String[128];
    public static final String[] f50487y;
    public final Writer f50488a;
    public int[] f50489b;
    public int f50490c;
    public pa.c d;
    public String f50491e;
    public String f50492f;
    public boolean h;
    public int f50493n;
    public boolean f50494r;
    public String f50495s;
    public boolean v;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f50486x[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f50486x;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f50487y = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public b(Writer writer) {
        int[] iArr = new int[32];
        this.f50489b = iArr;
        this.f50490c = 0;
        if (iArr.length == 0) {
            this.f50489b = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f50489b;
        int i10 = this.f50490c;
        this.f50490c = i10 + 1;
        iArr2[i10] = 6;
        this.f50493n = 2;
        this.v = true;
        Objects.requireNonNull(writer, "out == null");
        this.f50488a = writer;
        k(pa.c.d);
    }

    public final void a() {
        int j10 = j();
        if (j10 != 1) {
            Writer writer = this.f50488a;
            if (j10 != 2) {
                if (j10 != 4) {
                    if (j10 != 6) {
                        if (j10 == 7) {
                            if (this.f50493n != 1) {
                                throw new IllegalStateException("JSON must have only one top-level value.");
                            }
                        } else {
                            throw new IllegalStateException("Nesting problem.");
                        }
                    }
                    this.f50489b[this.f50490c - 1] = 7;
                    return;
                }
                writer.append((CharSequence) this.f50491e);
                this.f50489b[this.f50490c - 1] = 5;
                return;
            }
            writer.append((CharSequence) this.f50492f);
            h();
            return;
        }
        this.f50489b[this.f50490c - 1] = 2;
        h();
    }

    public void b() {
        t();
        a();
        int i10 = this.f50490c;
        int[] iArr = this.f50489b;
        if (i10 == iArr.length) {
            this.f50489b = Arrays.copyOf(iArr, i10 * 2);
        }
        int[] iArr2 = this.f50489b;
        int i11 = this.f50490c;
        this.f50490c = i11 + 1;
        iArr2[i11] = 1;
        this.f50488a.write(91);
    }

    public void c() {
        t();
        a();
        int i10 = this.f50490c;
        int[] iArr = this.f50489b;
        if (i10 == iArr.length) {
            this.f50489b = Arrays.copyOf(iArr, i10 * 2);
        }
        int[] iArr2 = this.f50489b;
        int i11 = this.f50490c;
        this.f50490c = i11 + 1;
        iArr2[i11] = 3;
        this.f50488a.write(123);
    }

    @Override
    public void close() {
        this.f50488a.close();
        int i10 = this.f50490c;
        if (i10 <= 1 && (i10 != 1 || this.f50489b[i10 - 1] == 7)) {
            this.f50490c = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    public final void d(char c3, int i10, int i11) {
        int j10 = j();
        if (j10 != i11 && j10 != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f50495s == null) {
            this.f50490c--;
            if (j10 == i11) {
                h();
            }
            this.f50488a.write(c3);
            return;
        }
        throw new IllegalStateException("Dangling name: " + this.f50495s);
    }

    public void e() {
        d(']', 1, 2);
    }

    public void f() {
        d('}', 3, 5);
    }

    public void flush() {
        if (this.f50490c != 0) {
            this.f50488a.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public void g(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f50495s == null) {
            int j10 = j();
            if (j10 != 3 && j10 != 5) {
                throw new IllegalStateException("Please begin an object before writing a name.");
            }
            this.f50495s = str;
            return;
        }
        throw new IllegalStateException("Already wrote a name, expecting a value.");
    }

    public final void h() {
        if (!this.h) {
            String str = this.d.f44230a;
            Writer writer = this.f50488a;
            writer.write(str);
            int i10 = this.f50490c;
            for (int i11 = 1; i11 < i10; i11++) {
                writer.write(this.d.f44231b);
            }
        }
    }

    public b i() {
        if (this.f50495s != null) {
            if (this.v) {
                t();
            } else {
                this.f50495s = null;
                return this;
            }
        }
        a();
        this.f50488a.write("null");
        return this;
    }

    public final int j() {
        int i10 = this.f50490c;
        if (i10 != 0) {
            return this.f50489b[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void k(pa.c cVar) {
        boolean z4;
        Objects.requireNonNull(cVar);
        this.d = cVar;
        this.f50492f = ",";
        if (cVar.f44232c) {
            this.f50491e = ": ";
            if (cVar.f44230a.isEmpty()) {
                this.f50492f = ", ";
            }
        } else {
            this.f50491e = ":";
        }
        if (this.d.f44230a.isEmpty() && this.d.f44231b.isEmpty()) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.h = z4;
    }

    public final void l(int i10) {
        if (i10 != 0) {
            this.f50493n = i10;
            return;
        }
        throw null;
    }

    public final void m(java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: xa.b.m(java.lang.String):void");
    }

    public void n(double d) {
        t();
        if (this.f50493n != 1 && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        }
        a();
        this.f50488a.append((CharSequence) Double.toString(d));
    }

    public void o(long j10) {
        t();
        a();
        this.f50488a.write(Long.toString(j10));
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
        this.f50488a.write(str);
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
            if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class && !f50485w.matcher(obj).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + obj);
            }
        } else if (this.f50493n != 1) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(obj));
        }
        a();
        this.f50488a.append((CharSequence) obj);
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
        this.f50488a.write(str);
    }

    public final void t() {
        if (this.f50495s != null) {
            int j10 = j();
            if (j10 == 5) {
                this.f50488a.write(this.f50492f);
            } else if (j10 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            h();
            this.f50489b[this.f50490c - 1] = 4;
            m(this.f50495s);
            this.f50495s = null;
        }
    }
}
