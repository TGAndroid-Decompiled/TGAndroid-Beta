package q2;

import android.text.TextUtils;
import d2.u;
import d2.u0;
import d2.v0;
import g2.l0;
import g2.n0;
import g2.y;
import g9.g0;
import g9.i0;
import g9.s1;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.ui.Cells.f1;
public final class t implements e3.o {
    public static final Pattern f53775i = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern f53776j = Pattern.compile("MPEGTS:(-?\\d+)");
    public final String f53777a;
    public final l0 f53778b;
    public final b4.k d;
    public final boolean f53780e;
    public e3.q f53781f;
    public int h;
    public final y f53779c = new y();
    public byte[] f53782g = new byte[1024];

    public t(String str, l0 l0Var, b4.k kVar, boolean z10) {
        this.f53777a = str;
        this.f53778b = l0Var;
        this.d = kVar;
        this.f53780e = z10;
    }

    @Override
    public final boolean b(e3.p pVar) {
        e3.l lVar = (e3.l) pVar;
        lVar.h(this.f53782g, 0, 6, false);
        byte[] bArr = this.f53782g;
        y yVar = this.f53779c;
        yVar.L(6, bArr);
        if (k4.i.a(yVar)) {
            return true;
        }
        lVar.h(this.f53782g, 6, 3, false);
        yVar.L(9, this.f53782g);
        return k4.i.a(yVar);
    }

    @Override
    public final void c(e3.q qVar) {
        if (this.f53780e) {
            qVar = new b4.n(qVar, this.d);
        }
        this.f53781f = qVar;
        qVar.f(new e3.t(-9223372036854775807L));
    }

    @Override
    public final void d(long j10, long j11) {
        throw new IllegalStateException();
    }

    @Override
    public final List e() {
        g0 g0Var = i0.f12083b;
        return s1.f12146e;
    }

    @Override
    public final int f(e3.p pVar, e3.s sVar) {
        String n4;
        int length;
        this.f53781f.getClass();
        int length2 = (int) pVar.getLength();
        int i3 = this.h;
        byte[] bArr = this.f53782g;
        if (i3 == bArr.length) {
            if (length2 != -1) {
                length = length2;
            } else {
                length = bArr.length;
            }
            this.f53782g = Arrays.copyOf(bArr, (length * 3) / 2);
        }
        byte[] bArr2 = this.f53782g;
        int i10 = this.h;
        int read = pVar.read(bArr2, i10, bArr2.length - i10);
        if (read != -1) {
            int i11 = this.h + read;
            this.h = i11;
            if (length2 == -1 || i11 != length2) {
                return 0;
            }
        }
        y yVar = new y(this.f53782g);
        k4.i.d(yVar);
        String n10 = yVar.n(StandardCharsets.UTF_8);
        long j10 = 0;
        long j11 = 0;
        while (true) {
            Matcher matcher = null;
            if (!TextUtils.isEmpty(n10)) {
                if (n10.startsWith("X-TIMESTAMP-MAP")) {
                    Matcher matcher2 = f53775i.matcher(n10);
                    if (matcher2.find()) {
                        Matcher matcher3 = f53776j.matcher(n10);
                        if (matcher3.find()) {
                            String group = matcher2.group(1);
                            group.getClass();
                            j11 = k4.i.c(group);
                            String group2 = matcher3.group(1);
                            group2.getClass();
                            long parseLong = Long.parseLong(group2);
                            String str = n0.f11873a;
                            j10 = n0.a0(parseLong, 1000000L, 90000L, RoundingMode.DOWN);
                        } else {
                            throw v0.a(null, "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(n10));
                        }
                    } else {
                        throw v0.a(null, "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(n10));
                    }
                }
                n10 = yVar.n(StandardCharsets.UTF_8);
            } else {
                while (true) {
                    String n11 = yVar.n(StandardCharsets.UTF_8);
                    if (n11 == null) {
                        break;
                    } else if (k4.i.f16868a.matcher(n11).matches()) {
                        do {
                            n4 = yVar.n(StandardCharsets.UTF_8);
                            if (n4 != null) {
                            }
                        } while (!n4.isEmpty());
                    } else {
                        Matcher matcher4 = k4.h.f16865a.matcher(n11);
                        if (matcher4.matches()) {
                            matcher = matcher4;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    g(0L);
                    return -1;
                }
                String group3 = matcher.group(1);
                group3.getClass();
                long c2 = k4.i.c(group3);
                String str2 = n0.f11873a;
                long b10 = this.f53778b.b(n0.a0((j10 + c2) - j11, 90000L, 1000000L, RoundingMode.DOWN) % 8589934592L);
                e3.i0 g7 = g(b10 - c2);
                byte[] bArr3 = this.f53782g;
                int i12 = this.h;
                y yVar2 = this.f53779c;
                yVar2.L(i12, bArr3);
                g7.e(this.h, yVar2);
                g7.d(b10, 1, this.h, 0, null);
                return -1;
            }
        }
    }

    public final e3.i0 g(long j10) {
        e3.i0 i02 = this.f53781f.i0(0, 3);
        u uVar = new u();
        uVar.f8431r = u0.n("text/vtt");
        uVar.d = this.f53777a;
        uVar.f8435w = j10;
        f1.w(uVar, i02);
        this.f53781f.L();
        return i02;
    }

    @Override
    public final e3.o a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
