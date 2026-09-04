package v7;
public abstract class q6 {
    public static long a(long j3) {
        long j10 = (j3 ^ (j3 >>> 33)) * (-49064778989728563L);
        long j11 = (j10 ^ (j10 >>> 33)) * (-4265267296055464877L);
        return j11 ^ (j11 >>> 33);
    }
}
