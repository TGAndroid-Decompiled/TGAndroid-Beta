package v3;

import a8.p0;
import j$.util.DesugarCollections;
import java.util.List;
public final class d extends b {
    public final long f58470a;
    public final long f58471b;
    public final List f58472c;

    public d(long j3, long j10, List list) {
        this.f58470a = j3;
        this.f58471b = j10;
        this.f58472c = DesugarCollections.unmodifiableList(list);
    }

    @Override
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb2.append(this.f58470a);
        sb2.append(", programSplicePlaybackPositionUs= ");
        return p0.r(sb2, this.f58471b, " }");
    }
}
