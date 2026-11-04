package u3;

import a1.g;
import j$.util.DesugarCollections;
import java.util.List;
public final class d extends b {
    public final long f55480a;
    public final long f55481b;
    public final List f55482c;

    public d(long j10, long j11, List list) {
        this.f55480a = j10;
        this.f55481b = j11;
        this.f55482c = DesugarCollections.unmodifiableList(list);
    }

    @Override
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb2.append(this.f55480a);
        sb2.append(", programSplicePlaybackPositionUs= ");
        return g.r(sb2, this.f55481b, " }");
    }
}
