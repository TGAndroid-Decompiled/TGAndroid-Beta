package r1;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class c {
    public final int f46974a;
    public final int f46975b;
    public final long f46976c;
    public final byte[] d;

    public c(int i9, int i10, byte[] bArr) {
        this(-1L, bArr, i9, i10);
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
        wrap.putInt((int) eVar2.f46980a);
        wrap.putInt((int) eVar2.f46981b);
        return new c(5, 1, wrap.array());
    }

    public static c c(int i9, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[g.F[3]]);
        wrap.order(byteOrder);
        wrap.putShort((short) new int[]{i9}[0]);
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
                    return eVar.f46980a / eVar.f46981b;
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
            int i9 = 0;
            if (g10 instanceof long[]) {
                long[] jArr = (long[]) g10;
                while (i9 < jArr.length) {
                    sb2.append(jArr[i9]);
                    i9++;
                    if (i9 != jArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (g10 instanceof int[]) {
                int[] iArr = (int[]) g10;
                while (i9 < iArr.length) {
                    sb2.append(iArr[i9]);
                    i9++;
                    if (i9 != iArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (g10 instanceof double[]) {
                double[] dArr = (double[]) g10;
                while (i9 < dArr.length) {
                    sb2.append(dArr[i9]);
                    i9++;
                    if (i9 != dArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (g10 instanceof e[]) {
                e[] eVarArr = (e[]) g10;
                while (i9 < eVarArr.length) {
                    sb2.append(eVarArr[i9].f46980a);
                    sb2.append('/');
                    sb2.append(eVarArr[i9].f46981b);
                    i9++;
                    if (i9 != eVarArr.length) {
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
        sb2.append(g.E[this.f46974a]);
        sb2.append(", data length:");
        return aa.d.l(this.d.length, ")", sb2);
    }

    public c(long j10, byte[] bArr, int i9, int i10) {
        this.f46974a = i9;
        this.f46975b = i10;
        this.f46976c = j10;
        this.d = bArr;
    }
}
