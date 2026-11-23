package tf;
public final class j {
    public short f57755a;

    public final void a(byte b10) {
        boolean z10;
        int i7 = 128;
        do {
            short s5 = this.f57755a;
            boolean z11 = false;
            if ((32768 & s5) == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((b10 & i7) == 0) {
                z11 = true;
            }
            if (z10 ^ z11) {
                this.f57755a = (short) (((short) (s5 << 1)) ^ 32773);
            } else {
                this.f57755a = (short) (s5 << 1);
            }
            i7 >>>= 1;
        } while (i7 != 0);
    }
}
