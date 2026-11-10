package r2;

import android.text.TextUtils;
import e2.s0;
import e2.t0;
import f3.j0;
import f3.t;
import h2.k0;
import h2.m0;
import h2.x;
import h9.g0;
import h9.i0;
import h9.t1;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.ui.Cells.f1;
public final class s implements f3.o {
    public static final Pattern f54398i = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern f54399j = Pattern.compile("MPEGTS:(-?\\d+)");
    public final String f54400a;
    public final k0 f54401b;
    public final c4.k d;
    public final boolean f54403e;
    public f3.q f54404f;
    public int h;
    public final x f54402c = new x();
    public byte[] f54405g = new byte[1024];

    public s(String str, k0 k0Var, c4.k kVar, boolean z9) {
        this.f54400a = str;
        this.f54401b = k0Var;
        this.d = kVar;
        this.f54403e = z9;
    }

    @Override
    public final boolean b(f3.p pVar) {
        f3.l lVar = (f3.l) pVar;
        lVar.k(this.f54405g, 0, 6, false);
        byte[] bArr = this.f54405g;
        x xVar = this.f54402c;
        xVar.L(6, bArr);
        if (l4.i.a(xVar)) {
            return true;
        }
        lVar.k(this.f54405g, 6, 3, false);
        xVar.L(9, this.f54405g);
        return l4.i.a(xVar);
    }

    @Override
    public final void c(f3.q qVar) {
        if (this.f54403e) {
            qVar = new ab.q(qVar, this.d);
        }
        this.f54404f = qVar;
        qVar.f(new t(-9223372036854775807L));
    }

    @Override
    public final void d(long j3, long j10) {
        throw new IllegalStateException();
    }

    @Override
    public final List e() {
        g0 g0Var = i0.f14331b;
        return t1.f14399e;
    }

    @Override
    public final int f(f3.p pVar, f3.s sVar) {
        String n10;
        int length;
        this.f54404f.getClass();
        int length2 = (int) pVar.getLength();
        int i7 = this.h;
        byte[] bArr = this.f54405g;
        if (i7 == bArr.length) {
            if (length2 != -1) {
                length = length2;
            } else {
                length = bArr.length;
            }
            this.f54405g = Arrays.copyOf(bArr, (length * 3) / 2);
        }
        byte[] bArr2 = this.f54405g;
        int i10 = this.h;
        int read = pVar.read(bArr2, i10, bArr2.length - i10);
        if (read != -1) {
            int i11 = this.h + read;
            this.h = i11;
            if (length2 == -1 || i11 != length2) {
                return 0;
            }
        }
        x xVar = new x(this.f54405g);
        l4.i.d(xVar);
        String n11 = xVar.n(StandardCharsets.UTF_8);
        long j3 = 0;
        long j10 = 0;
        while (true) {
            Matcher matcher = null;
            if (!TextUtils.isEmpty(n11)) {
                if (n11.startsWith("X-TIMESTAMP-MAP")) {
                    Matcher matcher2 = f54398i.matcher(n11);
                    if (matcher2.find()) {
                        Matcher matcher3 = f54399j.matcher(n11);
                        if (matcher3.find()) {
                            String group = matcher2.group(1);
                            group.getClass();
                            j10 = l4.i.c(group);
                            String group2 = matcher3.group(1);
                            group2.getClass();
                            long parseLong = Long.parseLong(group2);
                            String str = m0.f14114a;
                            j3 = m0.a0(parseLong, 1000000L, 90000L, RoundingMode.DOWN);
                        } else {
                            throw t0.a(null, "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(n11));
                        }
                    } else {
                        throw t0.a(null, "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(n11));
                    }
                }
                n11 = xVar.n(StandardCharsets.UTF_8);
            } else {
                while (true) {
                    String n12 = xVar.n(StandardCharsets.UTF_8);
                    if (n12 == null) {
                        break;
                    } else if (l4.i.f18172a.matcher(n12).matches()) {
                        do {
                            n10 = xVar.n(StandardCharsets.UTF_8);
                            if (n10 != null) {
                            }
                        } while (!n10.isEmpty());
                    } else {
                        Matcher matcher4 = l4.h.f18169a.matcher(n12);
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
                long c10 = l4.i.c(group3);
                String str2 = m0.f14114a;
                long b10 = this.f54401b.b(m0.a0((j3 + c10) - j10, 90000L, 1000000L, RoundingMode.DOWN) % 8589934592L);
                j0 g10 = g(b10 - c10);
                byte[] bArr3 = this.f54405g;
                int i12 = this.h;
                x xVar2 = this.f54402c;
                xVar2.L(i12, bArr3);
                g10.b(this.h, xVar2);
                g10.c(b10, 1, this.h, 0, null);
                return -1;
            }
        }
    }

    public final j0 g(long j3) {
        j0 O1 = this.f54404f.O1(0, 3);
        e2.t tVar = new e2.t();
        tVar.f10568r = s0.n("text/vtt");
        tVar.d = this.f54400a;
        tVar.f10572w = j3;
        f1.s(tVar, O1);
        this.f54404f.U0();
        return O1;
    }

    @Override
    public final f3.o a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
