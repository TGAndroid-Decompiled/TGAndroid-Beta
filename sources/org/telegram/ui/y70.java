package org.telegram.ui;

import android.telephony.PhoneNumberUtils;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;
import org.telegram.tgnet.TLRPC;
public final class y70 implements Predicate {
    public final int f43357a;
    public final Object f43358b;

    public y70(Object obj, int i10) {
        this.f43357a = i10;
        this.f43358b = obj;
    }

    public Predicate and(Predicate predicate) {
        int i10 = this.f43357a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public Predicate negate() {
        switch (this.f43357a) {
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
        int i10 = this.f43357a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        switch (this.f43357a) {
            case 0:
                String str = (String) this.f43358b;
                String str2 = (String) obj;
                if (str2 != null && str2.equals(str)) {
                    return true;
                }
                return false;
            case 1:
                return PhoneNumberUtils.compare((String) this.f43358b, (String) obj);
            case 2:
                String str3 = (String) this.f43358b;
                String str4 = (String) obj;
                if (str4 != null && str4.equals(str3)) {
                    return true;
                }
                return false;
            default:
                return qn.P0((qn) this.f43358b, (TLRPC.MessageEntity) obj);
        }
    }
}
