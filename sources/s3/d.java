package s3;

import a1.g;
import j$.util.DesugarCollections;
import java.util.List;
public final class d extends b {
    public final long f47688a;
    public final long f47689b;
    public final List f47690c;

    public d(long j3, long j10, List list) {
        this.f47688a = j3;
        this.f47689b = j10;
        this.f47690c = DesugarCollections.unmodifiableList(list);
    }

    @Override
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb2.append(this.f47688a);
        sb2.append(", programSplicePlaybackPositionUs= ");
        return g.s(sb2, this.f47689b, " }");
    }
}
