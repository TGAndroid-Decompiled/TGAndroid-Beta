package tf;
public final class j {
    public short f55449a;

    public final void a(byte b10) {
        boolean z9;
        int i7 = 128;
        do {
            short s5 = this.f55449a;
            boolean z10 = false;
            if ((32768 & s5) == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if ((b10 & i7) == 0) {
                z10 = true;
            }
            if (z9 ^ z10) {
                this.f55449a = (short) (((short) (s5 << 1)) ^ 32773);
            } else {
                this.f55449a = (short) (s5 << 1);
            }
            i7 >>>= 1;
        } while (i7 != 0);
    }
}
