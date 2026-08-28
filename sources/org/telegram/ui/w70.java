package org.telegram.ui;

import android.telephony.PhoneNumberUtils;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;
import org.telegram.tgnet.TLRPC;
public final class w70 implements Predicate {
    public final int f43694a;
    public final Object f43695b;

    public w70(Object obj, int i9) {
        this.f43694a = i9;
        this.f43695b = obj;
    }

    public Predicate and(Predicate predicate) {
        int i9 = this.f43694a;
        return Predicate$CC.$default$and(this, predicate);
    }

    public Predicate negate() {
        switch (this.f43694a) {
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
        int i9 = this.f43694a;
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override
    public final boolean test(Object obj) {
        switch (this.f43694a) {
            case 0:
                String str = (String) this.f43695b;
                String str2 = (String) obj;
                if (str2 != null && str2.equals(str)) {
                    return true;
                }
                return false;
            case 1:
                return PhoneNumberUtils.compare((String) this.f43695b, (String) obj);
            case 2:
                String str3 = (String) this.f43695b;
                String str4 = (String) obj;
                if (str4 != null && str4.equals(str3)) {
                    return true;
                }
                return false;
            default:
                return qn.v1((qn) this.f43695b, (TLRPC.MessageEntity) obj);
        }
    }
}
