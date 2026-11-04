package t1;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class c {
    public final int f54779a;
    public final int f54780b;
    public final long f54781c;
    public final byte[] d;

    public c(int i3, int i10, byte[] bArr) {
        this(-1L, bArr, i3, i10);
    }

    public static c a(long j10, ByteOrder byteOrder) {
        long[] jArr = {j10};
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
        wrap.putInt((int) eVar2.f54785a);
        wrap.putInt((int) eVar2.f54786b);
        return new c(5, 1, wrap.array());
    }

    public static c c(int i3, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.F[3]]);
        wrap.order(byteOrder);
        wrap.putShort((short) new int[]{i3}[0]);
        return new c(3, 1, wrap.array());
    }

    public final double d(ByteOrder byteOrder) {
        Serializable g7 = g(byteOrder);
        if (g7 != null) {
            if (g7 instanceof String) {
                return Double.parseDouble((String) g7);
            }
            if (g7 instanceof long[]) {
                long[] jArr = (long[]) g7;
                if (jArr.length == 1) {
                    return jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (g7 instanceof int[]) {
                int[] iArr = (int[]) g7;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (g7 instanceof double[]) {
                double[] dArr = (double[]) g7;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (g7 instanceof e[]) {
                e[] eVarArr = (e[]) g7;
                if (eVarArr.length == 1) {
                    e eVar = eVarArr[0];
                    return eVar.f54785a / eVar.f54786b;
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException("Couldn't find a double value");
            }
        }
        throw new NumberFormatException("NULL can't be converted to a double value");
    }

    public final int e(ByteOrder byteOrder) {
        Serializable g7 = g(byteOrder);
        if (g7 != null) {
            if (g7 instanceof String) {
                return Integer.parseInt((String) g7);
            }
            if (g7 instanceof long[]) {
                long[] jArr = (long[]) g7;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (g7 instanceof int[]) {
                int[] iArr = (int[]) g7;
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
        Serializable g7 = g(byteOrder);
        if (g7 != null) {
            if (g7 instanceof String) {
                return (String) g7;
            }
            StringBuilder sb2 = new StringBuilder();
            int i3 = 0;
            if (g7 instanceof long[]) {
                long[] jArr = (long[]) g7;
                while (i3 < jArr.length) {
                    sb2.append(jArr[i3]);
                    i3++;
                    if (i3 != jArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (g7 instanceof int[]) {
                int[] iArr = (int[]) g7;
                while (i3 < iArr.length) {
                    sb2.append(iArr[i3]);
                    i3++;
                    if (i3 != iArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (g7 instanceof double[]) {
                double[] dArr = (double[]) g7;
                while (i3 < dArr.length) {
                    sb2.append(dArr[i3]);
                    i3++;
                    if (i3 != dArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (g7 instanceof e[]) {
                e[] eVarArr = (e[]) g7;
                while (i3 < eVarArr.length) {
                    sb2.append(eVarArr[i3].f54785a);
                    sb2.append('/');
                    sb2.append(eVarArr[i3].f54786b);
                    i3++;
                    if (i3 != eVarArr.length) {
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
        throw new UnsupportedOperationException("Method not decompiled: t1.c.g(java.nio.ByteOrder):java.io.Serializable");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(g.E[this.f54779a]);
        sb2.append(", data length:");
        return a1.g.o(this.d.length, ")", sb2);
    }

    public c(long j10, byte[] bArr, int i3, int i10) {
        this.f54779a = i3;
        this.f54780b = i10;
        this.f54781c = j10;
        this.d = bArr;
    }
}
