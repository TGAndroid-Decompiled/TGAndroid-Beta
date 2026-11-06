package v3;

import a8.p0;
import j$.util.DesugarCollections;
import java.util.List;
public final class d extends b {
    public final long f56896a;
    public final long f56897b;
    public final List f56898c;

    public d(long j3, long j10, List list) {
        this.f56896a = j3;
        this.f56897b = j10;
        this.f56898c = DesugarCollections.unmodifiableList(list);
    }

    @Override
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb2.append(this.f56896a);
        sb2.append(", programSplicePlaybackPositionUs= ");
        return p0.r(sb2, this.f56897b, " }");
    }
}
