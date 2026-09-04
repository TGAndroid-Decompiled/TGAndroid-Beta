package v7;
public abstract class q8 {
    public static long a(e2.v vVar, int i10, int i11) {
        vVar.J(i10);
        if (vVar.a() < 5) {
            return -9223372036854775807L;
        }
        int j3 = vVar.j();
        if ((8388608 & j3) != 0 || ((2096896 & j3) >> 8) != i11 || (j3 & 32) == 0 || vVar.x() < 7 || vVar.a() < 7 || (vVar.x() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        vVar.h(0, 6, bArr);
        return ((bArr[0] & 255) << 25) | ((bArr[1] & 255) << 17) | ((bArr[2] & 255) << 9) | ((bArr[3] & 255) << 1) | ((255 & bArr[4]) >> 7);
    }
}
