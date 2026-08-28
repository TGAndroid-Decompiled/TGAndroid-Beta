package ra;

import java.sql.Timestamp;
import java.util.Date;
import oa.g;
public final class e extends g {
    public final int f47104b;

    public e(Class cls, int i9) {
        super(cls);
        this.f47104b = i9;
    }

    @Override
    public final Date a(Date date) {
        switch (this.f47104b) {
            case 0:
                return new java.sql.Date(date.getTime());
            default:
                return new Timestamp(date.getTime());
        }
    }
}
