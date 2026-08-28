package ub;

import java.nio.ByteBuffer;
public final class c {
    public final ByteBuffer f48165a;
    public final int f48166b;
    public int f48167c;

    public c(int i9, ByteBuffer byteBuffer) {
        switch (i9) {
            case 1:
                this.f48167c = 0;
                this.f48165a = byteBuffer;
                this.f48166b = byteBuffer.position();
                return;
            default:
                this.f48165a = byteBuffer;
                this.f48166b = byteBuffer.position();
                return;
        }
    }

    public int a(int i9) {
        int a2;
        int i10 = this.f48166b;
        ByteBuffer byteBuffer = this.f48165a;
        int i11 = byteBuffer.get((this.f48167c / 8) + i10);
        if (i11 < 0) {
            i11 += 256;
        }
        int i12 = this.f48167c;
        int i13 = 8 - (i12 % 8);
        if (i9 <= i13) {
            a2 = ((i11 << (i12 % 8)) & 255) >> ((i13 - i9) + (i12 % 8));
            this.f48167c = i12 + i9;
        } else {
            int i14 = i9 - i13;
            a2 = (a(i13) << i14) + a(i14);
        }
        byteBuffer.position(i10 + ((int) Math.ceil(this.f48167c / 8.0d)));
        return a2;
    }

    public boolean b() {
        if (a(1) == 1) {
            return true;
        }
        return false;
    }

    public void c(int i9, int i10) {
        int i11 = this.f48167c;
        int i12 = 8 - (i11 % 8);
        int i13 = 1;
        int i14 = this.f48166b;
        ByteBuffer byteBuffer = this.f48165a;
        if (i10 <= i12) {
            int i15 = byteBuffer.get((i11 / 8) + i14);
            if (i15 < 0) {
                i15 += 256;
            }
            int i16 = i15 + (i9 << (i12 - i10));
            int i17 = (this.f48167c / 8) + i14;
            if (i16 > 127) {
                i16 -= 256;
            }
            byteBuffer.put(i17, (byte) i16);
            this.f48167c += i10;
        } else {
            int i18 = i10 - i12;
            c(i9 >> i18, i12);
            c(i9 & ((1 << i18) - 1), i18);
        }
        int i19 = this.f48167c;
        int i20 = (i19 / 8) + i14;
        if (i19 % 8 <= 0) {
            i13 = 0;
        }
        byteBuffer.position(i20 + i13);
    }
}
