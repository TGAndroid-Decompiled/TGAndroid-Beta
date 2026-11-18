package org.telegram.utils.twidget;
public final class s0 implements p0 {
    public final int f54929a;
    public final x0 f54930b;
    public final byte[] f54931c;

    public s0(x0 x0Var, byte[] bArr, int i7) {
        this.f54929a = i7;
        this.f54930b = x0Var;
        this.f54931c = bArr;
    }

    @Override
    public final Object run() {
        switch (this.f54929a) {
            case 0:
                x0 x0Var = this.f54930b;
                x0Var.f54979b.selectableText(x0Var.i1(this.f54931c));
                return null;
            default:
                x0 x0Var2 = this.f54930b;
                byte[] bArr = this.f54931c;
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
