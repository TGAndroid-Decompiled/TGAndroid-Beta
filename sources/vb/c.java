package vb;

import java.nio.ByteBuffer;

public final class c {

    public final ByteBuffer f48850a;

    public final int f48851b;

    public int f48852c;

    public c(int i10, ByteBuffer byteBuffer) {
        switch (i10) {
            case 1:
                this.f48852c = 0;
                this.f48850a = byteBuffer;
                this.f48851b = byteBuffer.position();
                break;
            default:
                this.f48850a = byteBuffer;
                this.f48851b = byteBuffer.position();
                break;
        }
    }

    public int a(int i10) {
        int iA;
        int i11 = this.f48852c / 8;
        int i12 = this.f48851b;
        ByteBuffer byteBuffer = this.f48850a;
        int i13 = byteBuffer.get(i11 + i12);
        if (i13 < 0) {
            i13 += 256;
        }
        int i14 = this.f48852c;
        int i15 = 8 - (i14 % 8);
        if (i10 <= i15) {
            iA = ((i13 << (i14 % 8)) & 255) >> ((i15 - i10) + (i14 % 8));
            this.f48852c = i14 + i10;
        } else {
            int i16 = i10 - i15;
            iA = (a(i15) << i16) + a(i16);
        }
        byteBuffer.position(i12 + ((int) Math.ceil(((double) this.f48852c) / 8.0d)));
        return iA;
    }

    public boolean b() {
        return a(1) == 1;
    }

    public void c(int i10, int i11) {
        int i12 = this.f48852c;
        int i13 = 8 - (i12 % 8);
        int i14 = this.f48851b;
        ByteBuffer byteBuffer = this.f48850a;
        if (i11 <= i13) {
            int i15 = byteBuffer.get((i12 / 8) + i14);
            if (i15 < 0) {
                i15 += 256;
            }
            int i16 = i15 + (i10 << (i13 - i11));
            int i17 = (this.f48852c / 8) + i14;
            if (i16 > 127) {
                i16 -= 256;
            }
            byteBuffer.put(i17, (byte) i16);
            this.f48852c += i11;
        } else {
            int i18 = i11 - i13;
            c(i10 >> i18, i13);
            c(i10 & ((1 << i18) - 1), i18);
        }
        int i19 = this.f48852c;
        byteBuffer.position((i19 / 8) + i14 + (i19 % 8 <= 0 ? 0 : 1));
    }
}
