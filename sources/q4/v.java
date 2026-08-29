package q4;

import android.text.TextUtils;
import f5.c0;
import f5.w;
import j3.s0;
import j3.t0;
import j3.t1;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class v implements o3.k {
    public static final Pattern f46351g = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern h = Pattern.compile("MPEGTS:(-?\\d+)");
    public final String f46352a;
    public final c0 f46353b;
    public o3.m d;
    public int f46356f;
    public final w f46354c = new w();
    public byte[] f46355e = new byte[1024];

    public v(String str, c0 c0Var) {
        this.f46352a = str;
        this.f46353b = c0Var;
    }

    public final o3.w a(long j10) {
        o3.w Z1 = this.d.Z1(0, 3);
        s0 s0Var = new s0();
        s0Var.f10742o = "text/vtt";
        s0Var.f10732c = this.f46352a;
        s0Var.f10746s = j10;
        Z1.b(new t0(s0Var));
        this.d.e1();
        return Z1;
    }

    @Override
    public final int d(o3.l lVar, o3.n nVar) {
        String f9;
        int length;
        this.d.getClass();
        int i10 = (int) ((o3.h) lVar).f19095c;
        int i11 = this.f46356f;
        byte[] bArr = this.f46355e;
        if (i11 == bArr.length) {
            if (i10 != -1) {
                length = i10;
            } else {
                length = bArr.length;
            }
            this.f46355e = Arrays.copyOf(bArr, (length * 3) / 2);
        }
        byte[] bArr2 = this.f46355e;
        int i12 = this.f46356f;
        int read = ((o3.h) lVar).read(bArr2, i12, bArr2.length - i12);
        if (read != -1) {
            int i13 = this.f46356f + read;
            this.f46356f = i13;
            if (i10 == -1 || i13 != i10) {
                return 0;
            }
        }
        w wVar = new w(this.f46355e);
        c5.l.d(wVar);
        String f10 = wVar.f(p8.d.f45658c);
        long j10 = 0;
        long j11 = 0;
        while (true) {
            Matcher matcher = null;
            if (!TextUtils.isEmpty(f10)) {
                if (f10.startsWith("X-TIMESTAMP-MAP")) {
                    Matcher matcher2 = f46351g.matcher(f10);
                    if (matcher2.find()) {
                        Matcher matcher3 = h.matcher(f10);
                        if (matcher3.find()) {
                            String group = matcher2.group(1);
                            group.getClass();
                            j11 = c5.l.c(group);
                            String group2 = matcher3.group(1);
                            group2.getClass();
                            j10 = (Long.parseLong(group2) * 1000000) / 90000;
                        } else {
                            throw t1.a("X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(f10), null);
                        }
                    } else {
                        throw t1.a("X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(f10), null);
                    }
                }
                f10 = wVar.f(p8.d.f45658c);
            } else {
                while (true) {
                    String f11 = wVar.f(p8.d.f45658c);
                    if (f11 == null) {
                        break;
                    } else if (c5.l.f2996a.matcher(f11).matches()) {
                        do {
                            f9 = wVar.f(p8.d.f45658c);
                            if (f9 != null) {
                            }
                        } while (!f9.isEmpty());
                    } else {
                        Matcher matcher4 = c5.j.f2991a.matcher(f11);
                        if (matcher4.matches()) {
                            matcher = matcher4;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    a(0L);
                    return -1;
                }
                String group3 = matcher.group(1);
                group3.getClass();
                long c3 = c5.l.c(group3);
                long b10 = this.f46353b.b(((((j10 + c3) - j11) * 90000) / 1000000) % 8589934592L);
                o3.w a2 = a(b10 - c3);
                byte[] bArr3 = this.f46355e;
                int i14 = this.f46356f;
                w wVar2 = this.f46354c;
                wVar2.A(i14, bArr3);
                a2.e(this.f46356f, wVar2);
                a2.c(b10, 1, this.f46356f, 0, null);
                return -1;
            }
        }
    }

    @Override
    public final boolean e(o3.l lVar) {
        o3.h hVar = (o3.h) lVar;
        hVar.f(this.f46355e, 0, 6, false);
        byte[] bArr = this.f46355e;
        w wVar = this.f46354c;
        wVar.A(6, bArr);
        if (c5.l.a(wVar)) {
            return true;
        }
        hVar.f(this.f46355e, 6, 3, false);
        wVar.A(9, this.f46355e);
        return c5.l.a(wVar);
    }

    @Override
    public final void f(long j10, long j11) {
        throw new IllegalStateException();
    }

    @Override
    public final void i(o3.m mVar) {
        this.d = mVar;
        mVar.D1(new o3.o(-9223372036854775807L));
    }

    @Override
    public final void release() {
    }
}
