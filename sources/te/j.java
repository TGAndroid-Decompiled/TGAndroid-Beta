package te;
public final class j {
    public short f47829a;

    public final void a(byte b10) {
        boolean z10;
        int i9 = 128;
        do {
            short s10 = this.f47829a;
            boolean z11 = false;
            if ((32768 & s10) == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((b10 & i9) == 0) {
                z11 = true;
            }
            if (z10 ^ z11) {
                this.f47829a = (short) (((short) (s10 << 1)) ^ 32773);
            } else {
                this.f47829a = (short) (s10 << 1);
            }
            i9 >>>= 1;
        } while (i9 != 0);
    }
}
