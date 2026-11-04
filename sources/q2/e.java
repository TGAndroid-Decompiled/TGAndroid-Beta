package q2;

import b8.uc;
import java.util.Arrays;
public final class e extends x2.f {
    public byte[] f53675s;
    public volatile boolean f53676w;
    public byte[] f53677x;

    @Override
    public final void X1() {
        this.f53676w = true;
    }

    @Override
    public final void a() {
        try {
            this.f58154r.open(this.f58149b);
            int i3 = 0;
            int i10 = 0;
            while (i3 != -1 && !this.f53676w) {
                byte[] bArr = this.f53675s;
                if (bArr.length < i10 + 16384) {
                    this.f53675s = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i3 = this.f58154r.read(this.f53675s, i10, 16384);
                if (i3 != -1) {
                    i10 += i3;
                }
            }
            if (!this.f53676w) {
                this.f53677x = Arrays.copyOf(this.f53675s, i10);
            }
            uc.a(this.f58154r);
        } catch (Throwable th2) {
            uc.a(this.f58154r);
            throw th2;
        }
    }
}
