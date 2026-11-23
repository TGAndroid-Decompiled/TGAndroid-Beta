package org.telegram.utils.twidget;
public final class s0 implements p0 {
    public final int f55055a;
    public final x0 f55056b;
    public final byte[] f55057c;

    public s0(x0 x0Var, byte[] bArr, int i7) {
        this.f55055a = i7;
        this.f55056b = x0Var;
        this.f55057c = bArr;
    }

    @Override
    public final Object run() {
        switch (this.f55055a) {
            case 0:
                x0 x0Var = this.f55056b;
                x0Var.f55105b.selectableText(x0Var.i1(this.f55057c));
                return null;
            default:
                x0 x0Var2 = this.f55056b;
                byte[] bArr = this.f55057c;
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
