package v3;

import a8.p0;
import j$.util.DesugarCollections;
import java.util.List;
public final class d extends b {
    public final long f59076a;
    public final long f59077b;
    public final List f59078c;

    public d(long j3, long j10, List list) {
        this.f59076a = j3;
        this.f59077b = j10;
        this.f59078c = DesugarCollections.unmodifiableList(list);
    }

    @Override
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb2.append(this.f59076a);
        sb2.append(", programSplicePlaybackPositionUs= ");
        return p0.r(sb2, this.f59077b, " }");
    }
}
