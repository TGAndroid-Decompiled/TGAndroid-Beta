package v3;

import a8.p0;
import j$.util.DesugarCollections;
import java.util.List;
public final class d extends b {
    public final long f59045a;
    public final long f59046b;
    public final List f59047c;

    public d(long j3, long j10, List list) {
        this.f59045a = j3;
        this.f59046b = j10;
        this.f59047c = DesugarCollections.unmodifiableList(list);
    }

    @Override
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb2.append(this.f59045a);
        sb2.append(", programSplicePlaybackPositionUs= ");
        return p0.r(sb2, this.f59046b, " }");
    }
}
