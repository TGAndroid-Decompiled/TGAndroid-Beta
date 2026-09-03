package va;

import java.sql.Timestamp;
import java.util.Date;
import sa.g;
public final class e extends g {
    public final int f45706b;

    public e(Class cls, int i10) {
        super(cls);
        this.f45706b = i10;
    }

    @Override
    public final Date a(Date date) {
        switch (this.f45706b) {
            case 0:
                return new java.sql.Date(date.getTime());
            default:
                return new Timestamp(date.getTime());
        }
    }
}
