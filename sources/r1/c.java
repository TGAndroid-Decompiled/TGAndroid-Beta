package r1;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class c {
    public final int f47192a;
    public final int f47193b;
    public final long f47194c;
    public final byte[] d;

    public c(int i10, int i11, byte[] bArr) {
        this(-1L, bArr, i10, i11);
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
        wrap.putInt((int) eVar2.f47198a);
        wrap.putInt((int) eVar2.f47199b);
        return new c(5, 1, wrap.array());
    }

    public static c c(int i10, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.F[3]]);
        wrap.order(byteOrder);
        wrap.putShort((short) new int[]{i10}[0]);
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
                    return eVar.f47198a / eVar.f47199b;
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
            int i10 = 0;
            if (g7 instanceof long[]) {
                long[] jArr = (long[]) g7;
                while (i10 < jArr.length) {
                    sb2.append(jArr[i10]);
                    i10++;
                    if (i10 != jArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (g7 instanceof int[]) {
                int[] iArr = (int[]) g7;
                while (i10 < iArr.length) {
                    sb2.append(iArr[i10]);
                    i10++;
                    if (i10 != iArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (g7 instanceof double[]) {
                double[] dArr = (double[]) g7;
                while (i10 < dArr.length) {
                    sb2.append(dArr[i10]);
                    i10++;
                    if (i10 != dArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (g7 instanceof e[]) {
                e[] eVarArr = (e[]) g7;
                while (i10 < eVarArr.length) {
                    sb2.append(eVarArr[i10].f47198a);
                    sb2.append('/');
                    sb2.append(eVarArr[i10].f47199b);
                    i10++;
                    if (i10 != eVarArr.length) {
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
        throw new UnsupportedOperationException("Method not decompiled: r1.c.g(java.nio.ByteOrder):java.io.Serializable");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(g.E[this.f47192a]);
        sb2.append(", data length:");
        return a1.g.n(this.d.length, ")", sb2);
    }

    public c(long j10, byte[] bArr, int i10, int i11) {
        this.f47192a = i10;
        this.f47193b = i11;
        this.f47194c = j10;
        this.d = bArr;
    }
}
