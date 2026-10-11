package y9;

import java.util.List;
public final class g0 {
    public String f52056a;
    public String f52057b;
    public String f52058c;
    public Long d;
    public Long f52059e;
    public Boolean f52060f;
    public l1 f52061g;
    public c2 h;
    public b2 f52062i;
    public m1 f52063j;
    public List f52064k;
    public Integer f52065l;

    public final h0 a() {
        String str;
        if (this.f52056a == null) {
            str = " generator";
        } else {
            str = "";
        }
        if (this.f52057b == null) {
            str = str.concat(" identifier");
        }
        if (this.d == null) {
            str = sc.v.v(str, " startedAt");
        }
        if (this.f52060f == null) {
            str = sc.v.v(str, " crashed");
        }
        if (this.f52061g == null) {
            str = sc.v.v(str, " app");
        }
        if (this.f52065l == null) {
            str = sc.v.v(str, " generatorType");
        }
        if (str.isEmpty()) {
            return new h0(this.f52056a, this.f52057b, this.f52058c, this.d.longValue(), this.f52059e, this.f52060f.booleanValue(), this.f52061g, this.h, this.f52062i, this.f52063j, this.f52064k, this.f52065l.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
