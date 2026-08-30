package ye;
public final class j {
    public short f47179a;

    public final void a(byte b10) {
        boolean z4;
        int i10 = 128;
        do {
            short s6 = this.f47179a;
            boolean z10 = false;
            if ((32768 & s6) == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if ((b10 & i10) == 0) {
                z10 = true;
            }
            if (z4 ^ z10) {
                this.f47179a = (short) (((short) (s6 << 1)) ^ 32773);
            } else {
                this.f47179a = (short) (s6 << 1);
            }
            i10 >>>= 1;
        } while (i10 != 0);
    }
}
