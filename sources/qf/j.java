package qf;
public final class j {
    public short f53895a;

    public final void a(byte b10) {
        boolean z10;
        int i3 = 128;
        do {
            short s6 = this.f53895a;
            boolean z11 = false;
            if ((32768 & s6) == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((b10 & i3) == 0) {
                z11 = true;
            }
            if (z10 ^ z11) {
                this.f53895a = (short) (((short) (s6 << 1)) ^ 32773);
            } else {
                this.f53895a = (short) (s6 << 1);
            }
            i3 >>>= 1;
        } while (i3 != 0);
    }
}
