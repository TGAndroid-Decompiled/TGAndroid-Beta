package s3;

import j$.util.DesugarCollections;
import java.util.List;
public final class d extends b {
    public final long f41570a;
    public final long f41571b;
    public final List f41572c;

    public d(long j3, long j10, List list) {
        this.f41570a = j3;
        this.f41571b = j10;
        this.f41572c = DesugarCollections.unmodifiableList(list);
    }

    @Override
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb2.append(this.f41570a);
        sb2.append(", programSplicePlaybackPositionUs= ");
        return a4.a.r(sb2, this.f41571b, " }");
    }
}
