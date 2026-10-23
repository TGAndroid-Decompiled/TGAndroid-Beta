package org.telegram.ui;

import android.view.View;
import j$.util.function.Predicate$CC;
import java.util.Map;
import java.util.function.Predicate;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s8 implements Predicate {
    public final int f41398a;
    public final long f41399b;

    public s8(long j10, int i10) {
        this.f41398a = i10;
        this.f41399b = j10;
    }

    public Predicate and(Predicate predicate) {
        int i10 = this.f41398a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public Predicate negate() {
        switch (this.f41398a) {
            case 0:
                return Predicate$CC.$default$negate(this);
            case 1:
                return Predicate$CC.$default$negate(this);
            case 2:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public Predicate or(Predicate predicate) {
        int i10 = this.f41398a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        switch (this.f41398a) {
            case 0:
                if (((TLRPC.User) obj).f20427id == this.f41399b) {
                    return true;
                }
                return false;
            case 1:
                if (((TLRPC.User) obj).f20427id == this.f41399b) {
                    return true;
                }
                return false;
            case 2:
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.User) {
                    if (((TLRPC.User) tLObject).f20427id != this.f41399b) {
                        return true;
                    }
                } else if (tLObject instanceof TLRPC.Chat) {
                    return true ^ ChatObject.hasAdminRights((TLRPC.Chat) tLObject);
                }
                return false;
            default:
                Map.Entry entry = (Map.Entry) obj;
                if (((View) entry.getKey()).isAttachedToWindow() && ((View) entry.getKey()).isShown() && ((View) entry.getKey()).getWindowVisibility() == 0) {
                    if (this.f41399b - ((Long) entry.getValue()).longValue() <= 300) {
                        return false;
                    }
                }
                return true;
        }
    }
}
