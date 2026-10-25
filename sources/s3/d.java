package s3;

import a1.g;
import j$.util.DesugarCollections;
import java.util.List;
public final class d extends b {
    public final long f47661a;
    public final long f47662b;
    public final List f47663c;

    public d(long j10, long j11, List list) {
        this.f47661a = j10;
        this.f47662b = j11;
        this.f47663c = DesugarCollections.unmodifiableList(list);
    }

    @Override
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb2.append(this.f47661a);
        sb2.append(", programSplicePlaybackPositionUs= ");
        return g.r(sb2, this.f47662b, " }");
    }
}
