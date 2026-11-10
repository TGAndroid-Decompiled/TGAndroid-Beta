package u1;

import a8.p0;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class c {
    public final int f56198a;
    public final int f56199b;
    public final long f56200c;
    public final byte[] d;

    public c(int i7, int i10, byte[] bArr) {
        this(-1L, bArr, i7, i10);
    }

    public static c a(long j3, ByteOrder byteOrder) {
        long[] jArr = {j3};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.F[4]]);
        wrap.order(byteOrder);
        wrap.putInt((int) jArr[0]);
        return new c(4, 1, wrap.array());
    }

    public static c b(e eVar, ByteOrder byteOrder) {
        e[] eVarArr = {eVar};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.F[5]]);
        wrap.order(byteOrder);
        e eVar2 = eVarArr[0];
        wrap.putInt((int) eVar2.f56204a);
        wrap.putInt((int) eVar2.f56205b);
        return new c(5, 1, wrap.array());
    }

    public static c c(int i7, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.F[3]]);
        wrap.order(byteOrder);
        wrap.putShort((short) new int[]{i7}[0]);
        return new c(3, 1, wrap.array());
    }

    public final double d(ByteOrder byteOrder) {
        Serializable g10 = g(byteOrder);
        if (g10 != null) {
            if (g10 instanceof String) {
                return Double.parseDouble((String) g10);
            }
            if (g10 instanceof long[]) {
                long[] jArr = (long[]) g10;
                if (jArr.length == 1) {
                    return jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (g10 instanceof int[]) {
                int[] iArr = (int[]) g10;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (g10 instanceof double[]) {
                double[] dArr = (double[]) g10;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (g10 instanceof e[]) {
                e[] eVarArr = (e[]) g10;
                if (eVarArr.length == 1) {
                    e eVar = eVarArr[0];
                    return eVar.f56204a / eVar.f56205b;
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException("Couldn't find a double value");
            }
        }
        throw new NumberFormatException("NULL can't be converted to a double value");
    }

    public final int e(ByteOrder byteOrder) {
        Serializable g10 = g(byteOrder);
        if (g10 != null) {
            if (g10 instanceof String) {
                return Integer.parseInt((String) g10);
            }
            if (g10 instanceof long[]) {
                long[] jArr = (long[]) g10;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (g10 instanceof int[]) {
                int[] iArr = (int[]) g10;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException("Couldn't find a integer value");
            }
        }
        throw new NumberFormatException("NULL can't be converted to a integer value");
    }

    public final String f(ByteOrder byteOrder) {
        Serializable g10 = g(byteOrder);
        if (g10 != null) {
            if (g10 instanceof String) {
                return (String) g10;
            }
            StringBuilder sb2 = new StringBuilder();
            int i7 = 0;
            if (g10 instanceof long[]) {
                long[] jArr = (long[]) g10;
                while (i7 < jArr.length) {
                    sb2.append(jArr[i7]);
                    i7++;
                    if (i7 != jArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (g10 instanceof int[]) {
                int[] iArr = (int[]) g10;
                while (i7 < iArr.length) {
                    sb2.append(iArr[i7]);
                    i7++;
                    if (i7 != iArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (g10 instanceof double[]) {
                double[] dArr = (double[]) g10;
                while (i7 < dArr.length) {
                    sb2.append(dArr[i7]);
                    i7++;
                    if (i7 != dArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (g10 instanceof e[]) {
                e[] eVarArr = (e[]) g10;
                while (i7 < eVarArr.length) {
                    sb2.append(eVarArr[i7].f56204a);
                    sb2.append('/');
                    sb2.append(eVarArr[i7].f56205b);
                    i7++;
                    if (i7 != eVarArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else {
                return null;
            }
        }
        return null;
    }

    public final java.io.Serializable g(java.nio.ByteOrder r14) {
        throw new UnsupportedOperationException("Method not decompiled: u1.c.g(java.nio.ByteOrder):java.io.Serializable");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(g.E[this.f56198a]);
        sb2.append(", data length:");
        return p0.n(this.d.length, ")", sb2);
    }

    public c(long j3, byte[] bArr, int i7, int i10) {
        this.f56198a = i7;
        this.f56199b = i10;
        this.f56200c = j3;
        this.d = bArr;
    }
}
