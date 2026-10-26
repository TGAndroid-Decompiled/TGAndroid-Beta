package org.telegram.ui;

import android.view.View;
import j$.util.function.Predicate$CC;
import java.util.Map;
import java.util.function.Predicate;
import org.telegram.tgnet.TLRPC;
public final class u8 implements Predicate {
    public final int f44037a;
    public final long f44038b;

    public u8(long j10, int i10) {
        this.f44037a = i10;
        this.f44038b = j10;
    }

    public Predicate and(Predicate predicate) {
        int i10 = this.f44037a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public Predicate negate() {
        switch (this.f44037a) {
            case 0:
                return Predicate$CC.$default$negate(this);
            case 1:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public Predicate or(Predicate predicate) {
        int i10 = this.f44037a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        switch (this.f44037a) {
            case 0:
                if (((TLRPC.User) obj).f22176id == this.f44038b) {
                    return true;
                }
                return false;
            case 1:
                if (((TLRPC.User) obj).f22176id == this.f44038b) {
                    return true;
                }
                return false;
            default:
                Map.Entry entry = (Map.Entry) obj;
                if (((View) entry.getKey()).isAttachedToWindow() && ((View) entry.getKey()).isShown() && ((View) entry.getKey()).getWindowVisibility() == 0) {
                    if (this.f44038b - ((Long) entry.getValue()).longValue() <= 300) {
                        return false;
                    }
                }
                return true;
        }
    }
}
