package r2;

import android.text.TextUtils;
import e2.s0;
import e2.t0;
import f3.t;
import h2.k0;
import h2.l0;
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
public final class s implements f3.o {
    public static final Pattern f56444i = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern f56445j = Pattern.compile("MPEGTS:(-?\\d+)");
    public final String f56446a;
    public final k0 f56447b;
    public final c4.k d;
    public final boolean f56449e;
    public f3.q f56450f;
    public int h;
    public final x f56448c = new x();
    public byte[] f56451g = new byte[1024];

    public s(String str, k0 k0Var, c4.k kVar, boolean z10) {
        this.f56446a = str;
        this.f56447b = k0Var;
        this.d = kVar;
        this.f56449e = z10;
    }

    @Override
    public final boolean b(f3.p pVar) {
        f3.l lVar = (f3.l) pVar;
        lVar.g(this.f56451g, 0, 6, false);
        byte[] bArr = this.f56451g;
        x xVar = this.f56448c;
        xVar.L(6, bArr);
        if (l4.i.a(xVar)) {
            return true;
        }
        lVar.g(this.f56451g, 6, 3, false);
        xVar.L(9, this.f56451g);
        return l4.i.a(xVar);
    }

    @Override
    public final void c(f3.q qVar) {
        if (this.f56449e) {
            qVar = new ab.q(qVar, this.d);
        }
        this.f56450f = qVar;
        qVar.j(new t(-9223372036854775807L));
    }

    @Override
    public final void d(long j3, long j10) {
        throw new IllegalStateException();
    }

    @Override
    public final List e() {
        g0 g0Var = i0.f14003b;
        return t1.f14071e;
    }

    @Override
    public final int f(f3.p pVar, f3.s sVar) {
        String n10;
        int length;
        this.f56450f.getClass();
        int length2 = (int) pVar.getLength();
        int i7 = this.h;
        byte[] bArr = this.f56451g;
        if (i7 == bArr.length) {
            if (length2 != -1) {
                length = length2;
            } else {
                length = bArr.length;
            }
            this.f56451g = Arrays.copyOf(bArr, (length * 3) / 2);
        }
        byte[] bArr2 = this.f56451g;
        int i10 = this.h;
        int read = pVar.read(bArr2, i10, bArr2.length - i10);
        if (read != -1) {
            int i11 = this.h + read;
            this.h = i11;
            if (length2 == -1 || i11 != length2) {
                return 0;
            }
        }
        x xVar = new x(this.f56451g);
        l4.i.d(xVar);
        String n11 = xVar.n(StandardCharsets.UTF_8);
        long j3 = 0;
        long j10 = 0;
        while (true) {
            Matcher matcher = null;
            if (!TextUtils.isEmpty(n11)) {
                if (n11.startsWith("X-TIMESTAMP-MAP")) {
                    Matcher matcher2 = f56444i.matcher(n11);
                    if (matcher2.find()) {
                        Matcher matcher3 = f56445j.matcher(n11);
                        if (matcher3.find()) {
                            String group = matcher2.group(1);
                            group.getClass();
                            j10 = l4.i.c(group);
                            String group2 = matcher3.group(1);
                            group2.getClass();
                            long parseLong = Long.parseLong(group2);
                            String str = l0.f13783a;
                            j3 = l0.a0(parseLong, 1000000L, 90000L, RoundingMode.DOWN);
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
                    } else if (l4.i.f19666a.matcher(n12).matches()) {
                        do {
                            n10 = xVar.n(StandardCharsets.UTF_8);
                            if (n10 != null) {
                            }
                        } while (!n10.isEmpty());
                    } else {
                        Matcher matcher4 = l4.h.f19663a.matcher(n12);
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
                String str2 = l0.f13783a;
                long b10 = this.f56447b.b(l0.a0((j3 + c10) - j10, 90000L, 1000000L, RoundingMode.DOWN) % 8589934592L);
                f3.i0 g10 = g(b10 - c10);
                byte[] bArr3 = this.f56451g;
                int i12 = this.h;
                x xVar2 = this.f56448c;
                xVar2.L(i12, bArr3);
                g10.b(this.h, xVar2);
                g10.c(b10, 1, this.h, 0, null);
                return -1;
            }
        }
    }

    public final f3.i0 g(long j3) {
        f3.i0 d2 = this.f56450f.d2(0, 3);
        e2.t tVar = new e2.t();
        tVar.f10714r = s0.n("text/vtt");
        tVar.d = this.f56446a;
        tVar.f10718w = j3;
        p5.c.r(tVar, d2);
        this.f56450f.d1();
        return d2;
    }

    @Override
    public final f3.o a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
