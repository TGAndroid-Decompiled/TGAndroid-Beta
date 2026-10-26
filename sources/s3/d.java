package s3;

import a1.g;
import j$.util.DesugarCollections;
import java.util.List;
public final class d extends b {
    public final long f47664a;
    public final long f47665b;
    public final List f47666c;

    public d(long j10, long j11, List list) {
        this.f47664a = j10;
        this.f47665b = j11;
        this.f47666c = DesugarCollections.unmodifiableList(list);
    }

    @Override
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb2.append(this.f47664a);
        sb2.append(", programSplicePlaybackPositionUs= ");
        return g.r(sb2, this.f47665b, " }");
    }
}
