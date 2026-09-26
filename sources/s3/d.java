package s3;

import j$.util.DesugarCollections;
import java.util.List;
public final class d extends b {
    public final long f42919a;
    public final long f42920b;
    public final List f42921c;

    public d(long j3, long j10, List list) {
        this.f42919a = j3;
        this.f42920b = j10;
        this.f42921c = DesugarCollections.unmodifiableList(list);
    }

    @Override
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb2.append(this.f42919a);
        sb2.append(", programSplicePlaybackPositionUs= ");
        return a4.a.s(sb2, this.f42920b, " }");
    }
}
