package org.telegram.utils.twidget;
public final class s0 implements p0 {
    public final int f54970a;
    public final x0 f54971b;
    public final byte[] f54972c;

    public s0(x0 x0Var, byte[] bArr, int i7) {
        this.f54970a = i7;
        this.f54971b = x0Var;
        this.f54972c = bArr;
    }

    @Override
    public final Object run() {
        switch (this.f54970a) {
            case 0:
                x0 x0Var = this.f54971b;
                x0Var.f55020b.selectableText(x0Var.i1(this.f54972c));
                return null;
            default:
                x0 x0Var2 = this.f54971b;
                byte[] bArr = this.f54972c;
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
