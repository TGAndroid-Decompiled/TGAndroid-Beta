package t4;

import android.text.TextUtils;
import h5.c0;
import h5.w;
import j3.m0;
import j3.n0;
import j3.r1;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.ui.Components.jb;
public final class v implements r3.k {
    public static final Pattern f44568g = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern h = Pattern.compile("MPEGTS:(-?\\d+)");
    public final String f44569a;
    public final c0 f44570b;
    public r3.m d;
    public int f44572f;
    public final w f44571c = new w();
    public byte[] e = new byte[1024];

    public v(String str, c0 c0Var) {
        this.f44569a = str;
        this.f44570b = c0Var;
    }

    public final r3.v a(long j10) {
        r3.v c22 = this.d.c2(0, 3);
        m0 m0Var = new m0();
        m0Var.f8684o = "text/vtt";
        m0Var.f8675c = this.f44569a;
        m0Var.f8688s = j10;
        c22.b(new n0(m0Var));
        this.d.f1();
        return c22;
    }

    @Override
    public final void d(long j10, long j11) {
        throw new IllegalStateException();
    }

    @Override
    public final void e(r3.m mVar) {
        this.d = mVar;
        mVar.g2(new r3.n(-9223372036854775807L));
    }

    @Override
    public final int h(r3.l lVar, jb jbVar) {
        String h9;
        int length;
        this.d.getClass();
        int i10 = (int) ((r3.h) lVar).f43222c;
        int i11 = this.f44572f;
        byte[] bArr = this.e;
        if (i11 == bArr.length) {
            if (i10 != -1) {
                length = i10;
            } else {
                length = bArr.length;
            }
            this.e = Arrays.copyOf(bArr, (length * 3) / 2);
        }
        byte[] bArr2 = this.e;
        int i12 = this.f44572f;
        int read = ((r3.h) lVar).read(bArr2, i12, bArr2.length - i12);
        if (read != -1) {
            int i13 = this.f44572f + read;
            this.f44572f = i13;
            if (i10 == -1 || i13 != i10) {
                return 0;
            }
        }
        w wVar = new w(this.e);
        e5.m.d(wVar);
        String h10 = wVar.h(r8.d.f43389c);
        long j10 = 0;
        long j11 = 0;
        while (true) {
            Matcher matcher = null;
            if (!TextUtils.isEmpty(h10)) {
                if (h10.startsWith("X-TIMESTAMP-MAP")) {
                    Matcher matcher2 = f44568g.matcher(h10);
                    if (matcher2.find()) {
                        Matcher matcher3 = h.matcher(h10);
                        if (matcher3.find()) {
                            String group = matcher2.group(1);
                            group.getClass();
                            j11 = e5.m.c(group);
                            String group2 = matcher3.group(1);
                            group2.getClass();
                            j10 = (Long.parseLong(group2) * 1000000) / 90000;
                        } else {
                            throw r1.a("X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(h10), null);
                        }
                    } else {
                        throw r1.a("X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(h10), null);
                    }
                }
                h10 = wVar.h(r8.d.f43389c);
            } else {
                while (true) {
                    String h11 = wVar.h(r8.d.f43389c);
                    if (h11 == null) {
                        break;
                    } else if (e5.m.f5151a.matcher(h11).matches()) {
                        do {
                            h9 = wVar.h(r8.d.f43389c);
                            if (h9 != null) {
                            }
                        } while (!h9.isEmpty());
                    } else {
                        Matcher matcher4 = e5.k.f5146a.matcher(h11);
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
                long c3 = e5.m.c(group3);
                long b10 = this.f44570b.b(((((j10 + c3) - j11) * 90000) / 1000000) % 8589934592L);
                r3.v a2 = a(b10 - c3);
                byte[] bArr3 = this.e;
                int i14 = this.f44572f;
                w wVar2 = this.f44571c;
                wVar2.D(i14, bArr3);
                a2.d(this.f44572f, wVar2);
                a2.c(b10, 1, this.f44572f, 0, null);
                return -1;
            }
        }
    }

    @Override
    public final boolean i(r3.l lVar) {
        r3.h hVar = (r3.h) lVar;
        hVar.h(this.e, 0, 6, false);
        byte[] bArr = this.e;
        w wVar = this.f44571c;
        wVar.D(6, bArr);
        if (e5.m.a(wVar)) {
            return true;
        }
        hVar.h(this.e, 6, 3, false);
        wVar.D(9, this.e);
        return e5.m.a(wVar);
    }

    @Override
    public final void release() {
    }
}
