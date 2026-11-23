package org.telegram.utils.twidget;
public final class s0 implements p0 {
    public final int f54939a;
    public final x0 f54940b;
    public final byte[] f54941c;

    public s0(x0 x0Var, byte[] bArr, int i7) {
        this.f54939a = i7;
        this.f54940b = x0Var;
        this.f54941c = bArr;
    }

    @Override
    public final Object run() {
        switch (this.f54939a) {
            case 0:
                x0 x0Var = this.f54940b;
                x0Var.f54989b.selectableText(x0Var.i1(this.f54941c));
                return null;
            default:
                x0 x0Var2 = this.f54940b;
                byte[] bArr = this.f54941c;
                synchronized (x0Var2) {
                    if (bArr != null) {
                        try {
                            if (x0Var2.d.size() + bArr.length <= 16777216) {
                                x0Var2.d.write(bArr, 0, bArr.length);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    x0Var2.d.reset();
                    throw new IllegalStateException("Widget engine: argument too large");
                }
                return null;
        }
    }
}
