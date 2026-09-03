package va;

import java.sql.Timestamp;
import java.util.Date;
import sa.g;
public final class e extends g {
    public final int f48975b;

    public e(Class cls, int i10) {
        super(cls);
        this.f48975b = i10;
    }

    @Override
    public final Date a(Date date) {
        switch (this.f48975b) {
            case 0:
                return new java.sql.Date(date.getTime());
            default:
                return new Timestamp(date.getTime());
        }
    }
}
