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
    public static final Pattern f47976g = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern h = Pattern.compile("MPEGTS:(-?\\d+)");
    public final String f47977a;
    public final c0 f47978b;
    public r3.m d;
    public int f47981f;
    public final w f47979c = new w();
    public byte[] f47980e = new byte[1024];

    public v(String str, c0 c0Var) {
        this.f47977a = str;
        this.f47978b = c0Var;
    }

    public final r3.v a(long j10) {
        r3.v i22 = this.d.i2(0, 3);
        m0 m0Var = new m0();
        m0Var.f9265o = "text/vtt";
        m0Var.f9255c = this.f47977a;
        m0Var.f9269s = j10;
        i22.b(new n0(m0Var));
        this.d.i1();
        return i22;
    }

    @Override
    public final void d(long j10, long j11) {
        throw new IllegalStateException();
    }

    @Override
    public final void e(r3.m mVar) {
        this.d = mVar;
        mVar.m2(new r3.n(-9223372036854775807L));
    }

    @Override
    public final int h(r3.l lVar, jb jbVar) {
        String h9;
        int length;
        this.d.getClass();
        int i10 = (int) ((r3.h) lVar).f46556c;
        int i11 = this.f47981f;
        byte[] bArr = this.f47980e;
        if (i11 == bArr.length) {
            if (i10 != -1) {
                length = i10;
            } else {
                length = bArr.length;
            }
            this.f47980e = Arrays.copyOf(bArr, (length * 3) / 2);
        }
        byte[] bArr2 = this.f47980e;
        int i12 = this.f47981f;
        int read = ((r3.h) lVar).read(bArr2, i12, bArr2.length - i12);
        if (read != -1) {
            int i13 = this.f47981f + read;
            this.f47981f = i13;
            if (i10 == -1 || i13 != i10) {
                return 0;
            }
        }
        w wVar = new w(this.f47980e);
        e5.m.d(wVar);
        String h10 = wVar.h(r8.d.f46738c);
        long j10 = 0;
        long j11 = 0;
        while (true) {
            Matcher matcher = null;
            if (!TextUtils.isEmpty(h10)) {
                if (h10.startsWith("X-TIMESTAMP-MAP")) {
                    Matcher matcher2 = f47976g.matcher(h10);
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
                h10 = wVar.h(r8.d.f46738c);
            } else {
                while (true) {
                    String h11 = wVar.h(r8.d.f46738c);
                    if (h11 == null) {
                        break;
                    } else if (e5.m.f4990a.matcher(h11).matches()) {
                        do {
                            h9 = wVar.h(r8.d.f46738c);
                            if (h9 != null) {
                            }
                        } while (!h9.isEmpty());
                    } else {
                        Matcher matcher4 = e5.k.f4985a.matcher(h11);
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
                long b10 = this.f47978b.b(((((j10 + c3) - j11) * 90000) / 1000000) % 8589934592L);
                r3.v a2 = a(b10 - c3);
                byte[] bArr3 = this.f47980e;
                int i14 = this.f47981f;
                w wVar2 = this.f47979c;
                wVar2.D(i14, bArr3);
                a2.d(this.f47981f, wVar2);
                a2.c(b10, 1, this.f47981f, 0, null);
                return -1;
            }
        }
    }

    @Override
    public final boolean i(r3.l lVar) {
        r3.h hVar = (r3.h) lVar;
        hVar.f(this.f47980e, 0, 6, false);
        byte[] bArr = this.f47980e;
        w wVar = this.f47979c;
        wVar.D(6, bArr);
        if (e5.m.a(wVar)) {
            return true;
        }
        hVar.f(this.f47980e, 6, 3, false);
        wVar.D(9, this.f47980e);
        return e5.m.a(wVar);
    }

    @Override
    public final void release() {
    }
}
