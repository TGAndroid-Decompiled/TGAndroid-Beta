package s3;

import a1.g;
import j$.util.DesugarCollections;
import java.util.List;
public final class d extends b {
    public final long f47837a;
    public final long f47838b;
    public final List f47839c;

    public d(long j3, long j10, List list) {
        this.f47837a = j3;
        this.f47838b = j10;
        this.f47839c = DesugarCollections.unmodifiableList(list);
    }

    @Override
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb2.append(this.f47837a);
        sb2.append(", programSplicePlaybackPositionUs= ");
        return g.s(sb2, this.f47838b, " }");
    }
}
