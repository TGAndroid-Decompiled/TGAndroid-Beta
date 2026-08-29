package q4;

import h7.m5;
import java.util.Arrays;
public final class e extends n4.e {
    public byte[] f46258s;
    public volatile boolean v;
    public byte[] f46259w;

    @Override
    public final void a() {
        try {
            this.f17133r.open(this.f17128b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.v) {
                byte[] bArr = this.f46258s;
                if (bArr.length < i11 + 16384) {
                    this.f46258s = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i10 = this.f17133r.read(this.f46258s, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.v) {
                this.f46259w = Arrays.copyOf(this.f46258s, i11);
            }
            m5.a(this.f17133r);
        } catch (Throwable th2) {
            m5.a(this.f17133r);
            throw th2;
        }
    }

    @Override
    public final void q() {
        this.v = true;
    }
}
