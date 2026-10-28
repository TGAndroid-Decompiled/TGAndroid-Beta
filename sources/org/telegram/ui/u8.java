package org.telegram.ui;

import android.view.View;
import j$.util.function.Predicate$CC;
import java.util.Map;
import java.util.function.Predicate;
import org.telegram.tgnet.TLRPC;
public final class u8 implements Predicate {
    public final int f43900a;
    public final long f43901b;

    public u8(long j10, int i10) {
        this.f43900a = i10;
        this.f43901b = j10;
    }

    public Predicate and(Predicate predicate) {
        int i10 = this.f43900a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public Predicate negate() {
        switch (this.f43900a) {
            case 0:
                return Predicate$CC.$default$negate(this);
            case 1:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public Predicate or(Predicate predicate) {
        int i10 = this.f43900a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        switch (this.f43900a) {
            case 0:
                if (((TLRPC.User) obj).f22177id == this.f43901b) {
                    return true;
                }
                return false;
            case 1:
                if (((TLRPC.User) obj).f22177id == this.f43901b) {
                    return true;
                }
                return false;
            default:
                Map.Entry entry = (Map.Entry) obj;
                if (((View) entry.getKey()).isAttachedToWindow() && ((View) entry.getKey()).isShown() && ((View) entry.getKey()).getWindowVisibility() == 0) {
                    if (this.f43901b - ((Long) entry.getValue()).longValue() <= 300) {
                        return false;
                    }
                }
                return true;
        }
    }
}
