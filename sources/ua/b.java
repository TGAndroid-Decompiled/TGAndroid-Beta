package ua;

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

    public static final Pattern f48478w = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    public static final String[] f48479x = new String[128];

    public static final String[] f48480y;

    public final Writer f48481a;

    public int[] f48482b;

    public int f48483c;
    public ma.c d;

    public String f48484e;

    public String f48485f;
    public boolean h;

    public int f48486n;

    public boolean f48487r;

    public String f48488s;
    public boolean v;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f48479x[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f48479x;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f48480y = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public b(Writer writer) {
        int[] iArr = new int[32];
        this.f48482b = iArr;
        this.f48483c = 0;
        if (iArr.length == 0) {
            this.f48482b = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f48482b;
        int i10 = this.f48483c;
        this.f48483c = i10 + 1;
        iArr2[i10] = 6;
        this.f48486n = 2;
        this.v = true;
        Objects.requireNonNull(writer, "out == null");
        this.f48481a = writer;
        k(ma.c.d);
    }

    public final void a() throws IOException {
        int iJ = j();
        if (iJ == 1) {
            this.f48482b[this.f48483c - 1] = 2;
            h();
            return;
        }
        Writer writer = this.f48481a;
        if (iJ == 2) {
            writer.append((CharSequence) this.f48485f);
            h();
        } else {
            if (iJ == 4) {
                writer.append((CharSequence) this.f48484e);
                this.f48482b[this.f48483c - 1] = 5;
                return;
            }
            if (iJ != 6) {
                if (iJ != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.f48486n != 1) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f48482b[this.f48483c - 1] = 7;
        }
    }

    public void b() throws IOException {
        t();
        a();
        int i10 = this.f48483c;
        int[] iArr = this.f48482b;
        if (i10 == iArr.length) {
            this.f48482b = Arrays.copyOf(iArr, i10 * 2);
        }
        int[] iArr2 = this.f48482b;
        int i11 = this.f48483c;
        this.f48483c = i11 + 1;
        iArr2[i11] = 1;
        this.f48481a.write(91);
    }

    public void c() throws IOException {
        t();
        a();
        int i10 = this.f48483c;
        int[] iArr = this.f48482b;
        if (i10 == iArr.length) {
            this.f48482b = Arrays.copyOf(iArr, i10 * 2);
        }
        int[] iArr2 = this.f48482b;
        int i11 = this.f48483c;
        this.f48483c = i11 + 1;
        iArr2[i11] = 3;
        this.f48481a.write(123);
    }

    @Override
    public void close() throws IOException {
        this.f48481a.close();
        int i10 = this.f48483c;
        if (i10 > 1 || (i10 == 1 && this.f48482b[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f48483c = 0;
    }

    public final void d(char c10, int i10, int i11) throws IOException {
        int iJ = j();
        if (iJ != i11 && iJ != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f48488s != null) {
            throw new IllegalStateException("Dangling name: " + this.f48488s);
        }
        this.f48483c--;
        if (iJ == i11) {
            h();
        }
        this.f48481a.write(c10);
    }

    public void e() throws IOException {
        d(']', 1, 2);
    }

    public void f() throws IOException {
        d('}', 3, 5);
    }

    public void flush() throws IOException {
        if (this.f48483c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f48481a.flush();
    }

    public void g(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f48488s != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int iJ = j();
        if (iJ != 3 && iJ != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f48488s = str;
    }

    public final void h() throws IOException {
        if (this.h) {
            return;
        }
        String str = this.d.f17894a;
        Writer writer = this.f48481a;
        writer.write(str);
        int i10 = this.f48483c;
        for (int i11 = 1; i11 < i10; i11++) {
            writer.write(this.d.f17895b);
        }
    }

    public b i() {
        if (this.f48488s != null) {
            if (!this.v) {
                this.f48488s = null;
                return this;
            }
            t();
        }
        a();
        this.f48481a.write("null");
        return this;
    }

    public final int j() {
        int i10 = this.f48483c;
        if (i10 != 0) {
            return this.f48482b[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void k(ma.c cVar) {
        Objects.requireNonNull(cVar);
        this.d = cVar;
        this.f48485f = ",";
        if (cVar.f17896c) {
            this.f48484e = ": ";
            if (cVar.f17894a.isEmpty()) {
                this.f48485f = ", ";
            }
        } else {
            this.f48484e = ":";
        }
        this.h = this.d.f17894a.isEmpty() && this.d.f17895b.isEmpty();
    }

    public final void l(int i10) {
        if (i10 == 0) {
            throw null;
        }
        this.f48486n = i10;
    }

    public final void m(String str) throws IOException {
        String str2;
        String[] strArr = this.f48487r ? f48480y : f48479x;
        Writer writer = this.f48481a;
        writer.write(34);
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i10 < i11) {
                        writer.write(str, i10, i11 - i10);
                    }
                    writer.write(str2);
                    i10 = i11 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i10 < i11) {
                    writer.write(str, i10, i11 - i10);
                }
                writer.write(str2);
                i10 = i11 + 1;
            }
        }
        if (i10 < length) {
            writer.write(str, i10, length - i10);
        }
        writer.write(34);
    }

    public void n(double d) throws IOException {
        t();
        if (this.f48486n == 1 || !(Double.isNaN(d) || Double.isInfinite(d))) {
            a();
            this.f48481a.append((CharSequence) Double.toString(d));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        }
    }

    public void o(long j10) throws IOException {
        t();
        a();
        this.f48481a.write(Long.toString(j10));
    }

    public void p(Boolean bool) throws IOException {
        if (bool == null) {
            i();
            return;
        }
        t();
        a();
        this.f48481a.write(bool.booleanValue() ? "true" : "false");
    }

    public void q(Number number) throws IOException {
        if (number == null) {
            i();
            return;
        }
        t();
        String string = number.toString();
        if (!string.equals("-Infinity") && !string.equals("Infinity") && !string.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class && !f48478w.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        } else if (this.f48486n != 1) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
        }
        a();
        this.f48481a.append((CharSequence) string);
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

    public void s(boolean z10) throws IOException {
        t();
        a();
        this.f48481a.write(z10 ? "true" : "false");
    }

    public final void t() throws IOException {
        if (this.f48488s != null) {
            int iJ = j();
            if (iJ == 5) {
                this.f48481a.write(this.f48485f);
            } else if (iJ != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            h();
            this.f48482b[this.f48483c - 1] = 4;
            m(this.f48488s);
            this.f48488s = null;
        }
    }
}
