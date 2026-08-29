package ta;

import java.sql.Timestamp;
import java.util.Date;
import qa.g;
public final class e extends g {
    public final int f48187b;

    public e(Class cls, int i10) {
        super(cls);
        this.f48187b = i10;
    }

    @Override
    public final Date a(Date date) {
        switch (this.f48187b) {
            case 0:
                return new java.sql.Date(date.getTime());
            default:
                return new Timestamp(date.getTime());
        }
    }
}
