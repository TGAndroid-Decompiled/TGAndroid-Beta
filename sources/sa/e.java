package sa;

import java.sql.Timestamp;
import java.util.Date;
import pa.g;

public final class e extends g {

    public final int f47824b;

    public e(Class cls, int i10) {
        super(cls);
        this.f47824b = i10;
    }

    @Override
    public final Date a(Date date) {
        switch (this.f47824b) {
            case 0:
                return new java.sql.Date(date.getTime());
            default:
                return new Timestamp(date.getTime());
        }
    }
}
