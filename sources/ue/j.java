package ue;

public final class j {

    public short f48551a;

    public final void a(byte b10) {
        int i10 = 128;
        do {
            short s10 = this.f48551a;
            if (((Short.MIN_VALUE & s10) == 0) ^ ((b10 & i10) == 0)) {
                this.f48551a = (short) (((short) (s10 << 1)) ^ 32773);
            } else {
                this.f48551a = (short) (s10 << 1);
            }
            i10 >>>= 1;
        } while (i10 != 0);
    }
}
