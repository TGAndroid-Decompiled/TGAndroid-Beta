package s3;

import a1.g;
import j$.util.DesugarCollections;
import java.util.List;
public final class d extends b {
    public final long f45889a;
    public final long f45890b;
    public final List f45891c;

    public d(long j10, long j11, List list) {
        this.f45889a = j10;
        this.f45890b = j11;
        this.f45891c = DesugarCollections.unmodifiableList(list);
    }

    @Override
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb2.append(this.f45889a);
        sb2.append(", programSplicePlaybackPositionUs= ");
        return g.r(sb2, this.f45890b, " }");
    }
}
