package s3;

import j$.util.DesugarCollections;
import java.util.List;
public final class d extends b {
    public final long f42955a;
    public final long f42956b;
    public final List f42957c;

    public d(long j3, long j10, List list) {
        this.f42955a = j3;
        this.f42956b = j10;
        this.f42957c = DesugarCollections.unmodifiableList(list);
    }

    @Override
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb2.append(this.f42955a);
        sb2.append(", programSplicePlaybackPositionUs= ");
        return a4.a.r(sb2, this.f42956b, " }");
    }
}
