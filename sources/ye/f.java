package ye;

import j3.u1;
import java.io.EOFException;
import org.telegram.ui.Components.ai;
public final class f {
    public final int f50865a = 1;
    public boolean f50866b;
    public int f50867c;
    public boolean d;
    public int f50868e;
    public boolean f50869f;
    public int f50870g;
    public Object h;

    public f(s5.m mVar) {
        byte b10;
        byte b11;
        ze.a aVar = (ze.a) mVar.f47062b;
        long j10 = aVar.f4045b;
        ai aiVar = (ai) mVar.d;
        h hVar = (h) mVar.f47063c;
        int i10 = hVar.f50873a;
        int i11 = hVar.f50873a;
        byte b12 = 2;
        if (i10 == 2) {
            aiVar.getClass();
            byte[] bArr = new byte[3];
            int i12 = 0;
            while (i12 < 3) {
                int read = ((com.google.firebase.messaging.d) aiVar.f25265b).read(bArr, i12, 3 - i12);
                if (read <= 0) {
                    throw new EOFException();
                }
                i12 += read;
            }
            this.h = new String(bArr, "ISO-8859-1");
        } else {
            aiVar.getClass();
            byte[] bArr2 = new byte[4];
            int i13 = 0;
            while (i13 < 4) {
                int read2 = ((com.google.firebase.messaging.d) aiVar.f25265b).read(bArr2, i13, 4 - i13);
                if (read2 <= 0) {
                    throw new EOFException();
                }
                i13 += read2;
            }
            this.h = new String(bArr2, "ISO-8859-1");
        }
        byte b13 = 8;
        if (i11 == 2) {
            this.f50868e = ((aiVar.S() & 255) << 16) | ((aiVar.S() & 255) << 8) | (aiVar.S() & 255);
        } else if (i11 == 3) {
            this.f50868e = aiVar.Y();
        } else {
            this.f50868e = aiVar.Z();
        }
        if (i11 > 2) {
            aiVar.S();
            byte S = aiVar.S();
            byte b14 = 64;
            if (i11 == 3) {
                b13 = 128;
                b12 = 0;
                b10 = 32;
                b11 = 0;
            } else {
                b14 = 4;
                b10 = 64;
                b11 = 1;
            }
            boolean z4 = (b13 & S) != 0;
            this.d = z4;
            this.f50866b = (b12 & S) != 0;
            boolean z10 = (S & b14) != 0;
            this.f50869f = z10;
            if (i11 == 3) {
                if (z4) {
                    this.f50870g = aiVar.Y();
                    this.f50868e -= 4;
                }
                if (z10) {
                    aiVar.S();
                    this.f50868e--;
                }
                if ((S & b10) != 0) {
                    aiVar.S();
                    this.f50868e--;
                }
            } else {
                if ((S & b10) != 0) {
                    aiVar.S();
                    this.f50868e--;
                }
                if (z10) {
                    aiVar.S();
                    this.f50868e--;
                }
                if ((S & b11) != 0) {
                    this.f50870g = aiVar.Z();
                    this.f50868e -= 4;
                }
            }
        }
        this.f50867c = (int) (aVar.f4045b - j10);
    }

    public void a(int i10) {
        boolean z4;
        boolean z10 = this.f50866b;
        if (i10 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f50866b = z10 | z4;
        this.f50867c += i10;
    }

    public String toString() {
        switch (this.f50865a) {
            case 0:
                return String.format("%s[id=%s, bodysize=%d]", f.class.getSimpleName(), (String) this.h, Integer.valueOf(this.f50868e));
            default:
                return super.toString();
        }
    }

    public f(u1 u1Var) {
        this.h = u1Var;
    }
}
