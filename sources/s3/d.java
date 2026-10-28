package s3;

import a1.g;
import j$.util.DesugarCollections;
import java.util.List;
public final class d extends b {
    public final long f47699a;
    public final long f47700b;
    public final List f47701c;

    public d(long j10, long j11, List list) {
        this.f47699a = j10;
        this.f47700b = j11;
        this.f47701c = DesugarCollections.unmodifiableList(list);
    }

    @Override
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb2.append(this.f47699a);
        sb2.append(", programSplicePlaybackPositionUs= ");
        return g.r(sb2, this.f47700b, " }");
    }
}
