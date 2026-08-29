package xf;

import a4.w;
import java.io.IOException;
import java.util.ArrayDeque;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.zn0;
public final class h implements zn0 {
    public final Object f50134a;

    public h() {
        this.f50134a = new ArrayDeque(16);
    }

    @Override
    public void W(float f9, boolean z10) {
        i iVar = (i) this.f50134a;
        float f10 = iVar.f50136b;
        float z11 = com.google.android.recaptcha.internal.a.z(iVar.f50137c, f10, f9, f10);
        iVar.d = z11;
        if (z10) {
            q6 q6Var = iVar.f50138e;
            q6Var.getClass();
            q6Var.b(null, z11);
        }
        iVar.invalidate();
    }

    public void a() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f50134a;
        if (arrayDeque.isEmpty()) {
            return;
        }
        int size = arrayDeque.size();
        long c3 = c();
        throw new IOException("data item not completed, stackSize: " + size + " scope: " + c3);
    }

    public void b(long j10) {
        long c3 = c();
        if (c3 != j10) {
            if (c3 != -1) {
                if (c3 == -2) {
                    c3 = -2;
                } else {
                    return;
                }
            }
            StringBuilder r6 = w.r(j10, "expected non-string scope or scope ", " but found ");
            r6.append(c3);
            throw new IOException(r6.toString());
        }
    }

    public long c() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f50134a;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    @Override
    public CharSequence getContentDescription() {
        i iVar = (i) this.f50134a;
        float f9 = iVar.f50136b;
        return String.valueOf(Math.round((iVar.f50135a.getProgress() * (iVar.f50137c - f9)) + f9));
    }

    @Override
    public int k0() {
        return 0;
    }

    public h(i iVar) {
        this.f50134a = iVar;
    }

    @Override
    public void v() {
    }
}
