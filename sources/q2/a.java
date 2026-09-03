package q2;

import java.util.Random;
public final class a extends Random {
    public long f44470a;
    public long f44471b;

    @Override
    public final int next(int i10) {
        return ((int) nextLong()) >>> (32 - i10);
    }

    @Override
    public final boolean nextBoolean() {
        if (nextLong() >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void nextBytes(byte[] bArr) {
        int length = bArr.length;
        int i10 = 0;
        while (i10 < length) {
            long nextLong = (int) nextLong();
            int min = Math.min(length - i10, 8);
            while (true) {
                int i11 = min - 1;
                if (min > 0) {
                    bArr[i10] = (byte) nextLong;
                    nextLong >>>= 8;
                    i10++;
                    min = i11;
                }
            }
        }
    }

    @Override
    public final double nextDouble() {
        return (nextLong() >>> 11) * 1.1102230246251565E-16d;
    }

    @Override
    public final float nextFloat() {
        return (((int) nextLong()) >>> 8) * 5.9604645E-8f;
    }

    @Override
    public final int nextInt() {
        return (int) nextLong();
    }

    @Override
    public final long nextLong() {
        long j10 = this.f44470a;
        long j11 = this.f44471b;
        long j12 = j10 + j11;
        long j13 = j11 ^ j10;
        this.f44470a = (Long.rotateLeft(j10, 55) ^ j13) ^ (j13 << 14);
        this.f44471b = Long.rotateLeft(j13, 36);
        return j12;
    }

    @Override
    public final void setSeed(long j10) {
        if (this.f44470a == 0 && this.f44471b == 0) {
            return;
        }
        throw new RuntimeException("No seed set");
    }
}
