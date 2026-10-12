package s3;

import a1.g;
import j$.util.DesugarCollections;
import java.util.List;
public final class d extends b {
    public final long f44806a;
    public final long f44807b;
    public final List f44808c;

    public d(long j10, long j11, List list) {
        this.f44806a = j10;
        this.f44807b = j11;
        this.f44808c = DesugarCollections.unmodifiableList(list);
    }

    @Override
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb2.append(this.f44806a);
        sb2.append(", programSplicePlaybackPositionUs= ");
        return g.r(sb2, this.f44807b, " }");
    }
}
