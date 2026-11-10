package v3;

import a8.p0;
import j$.util.DesugarCollections;
import java.util.List;
public final class d extends b {
    public final long f56996a;
    public final long f56997b;
    public final List f56998c;

    public d(long j3, long j10, List list) {
        this.f56996a = j3;
        this.f56997b = j10;
        this.f56998c = DesugarCollections.unmodifiableList(list);
    }

    @Override
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb2.append(this.f56996a);
        sb2.append(", programSplicePlaybackPositionUs= ");
        return p0.r(sb2, this.f56997b, " }");
    }
}
