package s3;

import j$.util.DesugarCollections;
import java.util.List;
public final class d extends b {
    public final long f43028a;
    public final long f43029b;
    public final List f43030c;

    public d(long j3, long j10, List list) {
        this.f43028a = j3;
        this.f43029b = j10;
        this.f43030c = DesugarCollections.unmodifiableList(list);
    }

    @Override
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb2.append(this.f43028a);
        sb2.append(", programSplicePlaybackPositionUs= ");
        return a4.a.s(sb2, this.f43029b, " }");
    }
}
