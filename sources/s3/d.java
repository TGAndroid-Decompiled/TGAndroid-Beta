package s3;

import a1.g;
import j$.util.DesugarCollections;
import java.util.List;
public final class d extends b {
    public final long f46311a;
    public final long f46312b;
    public final List f46313c;

    public d(long j10, long j11, List list) {
        this.f46311a = j10;
        this.f46312b = j11;
        this.f46313c = DesugarCollections.unmodifiableList(list);
    }

    @Override
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb2.append(this.f46311a);
        sb2.append(", programSplicePlaybackPositionUs= ");
        return g.r(sb2, this.f46312b, " }");
    }
}
