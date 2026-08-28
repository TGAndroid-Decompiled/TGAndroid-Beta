package ta;

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
public class c implements Closeable, Flushable {
    public static final Pattern f47756w = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    public static final String[] f47757x = new String[128];
    public static final String[] f47758y;
    public final Writer f47759a;
    public int[] f47760b;
    public int f47761c;
    public la.c d;
    public String f47762e;
    public String f47763f;
    public boolean h;
    public int f47764n;
    public boolean f47765r;
    public String f47766s;
    public boolean v;

    static {
        for (int i9 = 0; i9 <= 31; i9++) {
            f47757x[i9] = String.format("\\u%04x", Integer.valueOf(i9));
        }
        String[] strArr = f47757x;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f47758y = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        int[] iArr = new int[32];
        this.f47760b = iArr;
        this.f47761c = 0;
        if (iArr.length == 0) {
            this.f47760b = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f47760b;
        int i9 = this.f47761c;
        this.f47761c = i9 + 1;
        iArr2[i9] = 6;
        this.f47764n = 2;
        this.v = true;
        Objects.requireNonNull(writer, "out == null");
        this.f47759a = writer;
        k(la.c.d);
    }

    public final void a() {
        int j10 = j();
        if (j10 != 1) {
            Writer writer = this.f47759a;
            if (j10 != 2) {
                if (j10 != 4) {
                    if (j10 != 6) {
                        if (j10 == 7) {
                            if (this.f47764n != 1) {
                                throw new IllegalStateException("JSON must have only one top-level value.");
                            }
                        } else {
                            throw new IllegalStateException("Nesting problem.");
                        }
                    }
                    this.f47760b[this.f47761c - 1] = 7;
                    return;
                }
                writer.append((CharSequence) this.f47762e);
                this.f47760b[this.f47761c - 1] = 5;
                return;
            }
            writer.append((CharSequence) this.f47763f);
            h();
            return;
        }
        this.f47760b[this.f47761c - 1] = 2;
        h();
    }

    public void b() {
        t();
        a();
        int i9 = this.f47761c;
        int[] iArr = this.f47760b;
        if (i9 == iArr.length) {
            this.f47760b = Arrays.copyOf(iArr, i9 * 2);
        }
        int[] iArr2 = this.f47760b;
        int i10 = this.f47761c;
        this.f47761c = i10 + 1;
        iArr2[i10] = 1;
        this.f47759a.write(91);
    }

    public void c() {
        t();
        a();
        int i9 = this.f47761c;
        int[] iArr = this.f47760b;
        if (i9 == iArr.length) {
            this.f47760b = Arrays.copyOf(iArr, i9 * 2);
        }
        int[] iArr2 = this.f47760b;
        int i10 = this.f47761c;
        this.f47761c = i10 + 1;
        iArr2[i10] = 3;
        this.f47759a.write(123);
    }

    @Override
    public void close() {
        this.f47759a.close();
        int i9 = this.f47761c;
        if (i9 <= 1 && (i9 != 1 || this.f47760b[i9 - 1] == 7)) {
            this.f47761c = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    public final void d(char c10, int i9, int i10) {
        int j10 = j();
        if (j10 != i10 && j10 != i9) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f47766s == null) {
            this.f47761c--;
            if (j10 == i10) {
                h();
            }
            this.f47759a.write(c10);
            return;
        }
        throw new IllegalStateException("Dangling name: " + this.f47766s);
    }

    public void e() {
        d(']', 1, 2);
    }

    public void f() {
        d('}', 3, 5);
    }

    public void flush() {
        if (this.f47761c != 0) {
            this.f47759a.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public void g(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f47766s == null) {
            int j10 = j();
            if (j10 != 3 && j10 != 5) {
                throw new IllegalStateException("Please begin an object before writing a name.");
            }
            this.f47766s = str;
            return;
        }
        throw new IllegalStateException("Already wrote a name, expecting a value.");
    }

    public final void h() {
        if (!this.h) {
            String str = this.d.f16710a;
            Writer writer = this.f47759a;
            writer.write(str);
            int i9 = this.f47761c;
            for (int i10 = 1; i10 < i9; i10++) {
                writer.write(this.d.f16711b);
            }
        }
    }

    public c i() {
        if (this.f47766s != null) {
            if (this.v) {
                t();
            } else {
                this.f47766s = null;
                return this;
            }
        }
        a();
        this.f47759a.write("null");
        return this;
    }

    public final int j() {
        int i9 = this.f47761c;
        if (i9 != 0) {
            return this.f47760b[i9 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void k(la.c cVar) {
        boolean z10;
        Objects.requireNonNull(cVar);
        this.d = cVar;
        this.f47763f = ",";
        if (cVar.f16712c) {
            this.f47762e = ": ";
            if (cVar.f16710a.isEmpty()) {
                this.f47763f = ", ";
            }
        } else {
            this.f47762e = ":";
        }
        if (this.d.f16710a.isEmpty() && this.d.f16711b.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h = z10;
    }

    public final void l(int i9) {
        if (i9 != 0) {
            this.f47764n = i9;
            return;
        }
        throw null;
    }

    public final void m(java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: ta.c.m(java.lang.String):void");
    }

    public void n(double d) {
        t();
        if (this.f47764n != 1 && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        }
        a();
        this.f47759a.append((CharSequence) Double.toString(d));
    }

    public void o(long j10) {
        t();
        a();
        this.f47759a.write(Long.toString(j10));
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
        this.f47759a.write(str);
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
            if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class && !f47756w.matcher(obj).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + obj);
            }
        } else if (this.f47764n != 1) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(obj));
        }
        a();
        this.f47759a.append((CharSequence) obj);
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
        this.f47759a.write(str);
    }

    public final void t() {
        if (this.f47766s != null) {
            int j10 = j();
            if (j10 == 5) {
                this.f47759a.write(this.f47763f);
            } else if (j10 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            h();
            this.f47760b[this.f47761c - 1] = 4;
            m(this.f47766s);
            this.f47766s = null;
        }
    }
}
